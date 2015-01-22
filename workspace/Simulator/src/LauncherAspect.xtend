import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import activity.Launcher
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import exploitation.Exploitation
import java.util.Calendar
import exploitation.ExploitationPackage
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import org.xtext.launcher.StartStandaloneSetup
import org.xtext.activity.ActStandaloneSetup
import activity.Model
import activity.EnumResourceType
import java.util.List
import action.Action
import java.util.Map
import exploitation.Ressource
import java.util.LinkedList
import activity.PeriodicActivity
import action.AddWorker
import action.AddTractor

class LaunchFromStartingFile{
	def static void main(String[] args){
		var fact = new XMIResourceFactoryImpl
		if(!EPackage.Registry.INSTANCE.containsKey(ExploitationPackage.eNS_URI)){
			EPackage.Registry.INSTANCE.put(ExploitationPackage.eNS_URI, ExploitationPackage.eINSTANCE);
		}
		
		println("Loading Climatic series ...")
		var fileCSV = "../../runtime-test/series.csv"
		Calculator.series = Calculator.CSVParser(fileCSV)
		
		println("Loading Parser ...")
		StartStandaloneSetup.doSetup // Setup the PARSER 
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*",fact);
		var rs = new ResourceSetImpl	
		
		var file = "../../runtime-test/myActivity/launchSystem.start"
		
		var uri = URI.createURI(file)
		var res = rs.getResource(uri,true);
		println("Starting file loaded.")
		
		//apply Transformation
		var launcher = res.contents.get(0) as Launcher
	
		LauncherAspect.visitExploitation(launcher)
	}
}

@Aspect(className=Launcher)
class LauncherAspect {
	def void visitExploitation() {
		println("Loading exploitation file ...")
		// Load Model
		var fact = new XMIResourceFactoryImpl
		if(!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI)){
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("exploitation",fact);
		var rs = new ResourceSetImpl
		var uri = URI.createURI("../../runtime-test/myExploitation/MyExploitation.exploitation")
		var res = rs.getResource(uri,true);
		
		//apply Transformation
		var exp = res.contents.filter(Exploitation).get(0)
		var cal = Calendar.getInstance
		cal.set(_self.begin.year,_self.begin.month.ordinal,_self.begin.day)
		var dateBegin= cal.time; 
		cal.set(_self.end.year,_self.end.month.ordinal,_self.end.day)
		
		println("Exploitation loaded.")
		
		// Launch Mapping between Exploitation and Activity
		mappingExploitationActivity(_self,exp)
		
		// Validate Allocation Worker
		println("Validation of Ressource Allocation ...")
		var mapRessource=calculRessource(_self,exp)
		var calendrier = initCalendar(_self,dateBegin,cal.time, exp)
		validateAllocationRessource(_self,calendrier,mapRessource)
		
		// Validate Rules
		validateActivityRules(_self,exp)
			
		// Start ExploitationAspect
		ExploitationAspect.simulate(exp,_self.quantityOfWater,dateBegin,cal.time)
		//ExploitationAspect.compile(exp)
		println("compile file generated!")
		
	}
	
	def void mappingExploitationActivity(Exploitation e){
		// Load Model
		println("Loading Activity file ...")
		var fact = new XMIResourceFactoryImpl
		if(!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI)){
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		}
		ActStandaloneSetup.doSetup
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*",fact);
		var rs = new ResourceSetImpl
		var uri = URI.createURI("../../runtime-test/myActivity/MyActivity.act")
		var res = rs.getResource(uri,true);
		
		//apply Transformation
		var model = res.contents.filter(Model).get(0)
		var activityMap = ModelAspect.getAtelierList(model)
		
		for(s : e.surface){
			if(activityMap.containsKey(s.atelier.id)){
				// add Activitie reference list to Atelier
				val list = activityMap.get(s.atelier.id)
				s.atelier.activity.addAll(list)
				// add Atelier reference to each activity
				for(act : list){
					act.setAtelier(s.atelier)
				}
				
			}
		}

		println("Activity loaded.")		
	}
	
	/**
	 * Get all of ressources of exploitation
	 */
	def Map<EnumResourceType,List<Ressource>> calculRessource(Exploitation e){
		val map = <EnumResourceType,List<Ressource>>newHashMap()
		for(res : e.ressource){
			if(res.type.name.equals("Worker")){
				var list = map.get(EnumResourceType.WORKER)
				if(list==null) list = new LinkedList<Ressource>()
				list.add(res)
				map.put(EnumResourceType.WORKER,list)
			} else if (res.type.name.equals("Tractor")){
				var list = map.get(EnumResourceType.TRACTOR)
				if(list==null) list = new LinkedList<Ressource>()
				list.add(res)
				map.put(EnumResourceType.TRACTOR,list)
			}
		}
		return map
	}
	
	/**
	 * Add worker or tractors into a list of action
	 **/
	def Map<java.util.Date,List<Action>> initCalendar(java.util.Date begin, java.util.Date end, Exploitation e){
		var res 		= <java.util.Date,List<Action>>newHashMap()
		var activities 	= new LinkedList<PeriodicActivity>()
		
		for(s : e.surface){
			activities.addAll(s.atelier.activity)
		}
		var cal = Calendar.getInstance()
		cal.setTime(begin)

		while(cal.getTime().compareTo(end) <= 0){
			for(PeriodicActivity a : activities){
				// get Date of this Activity
				var start = Calendar.getInstance();
				start.set(a.start.year, a.start.month.ordinal, a.start.day)				
				var finish = Calendar.getInstance();
				finish.set(a.end.year, a.end.month.ordinal, a.end.day)
				
				//println("time : "+cal.getTime()+" | start :"+start.getTime()+" | finish : "+finish.getTime())				
				if(cal.getTime().compareTo(start.getTime()) >= 0 && cal.getTime().compareTo(finish.getTime()) <= 0){
					var actions 	= <Action>newLinkedList()
					for(resA : a.resAllocation){
						if(resA.ressourceType == EnumResourceType.WORKER){
							actions.add(new AddWorker(a));
							//println("WORKER")
						} else {
							actions.add(new AddTractor(a));
							//println("TRACTOR")
						}
					}
					var list = res.get(cal.getTime)
					if(list == null) list = <Action>newLinkedList()
					list.addAll(actions)
					//println("list before put "+ cal.getTime + " - "+ actions)
					res.put(cal.getTime, list)
					//println("list after get"+res.get(cal.getTime)) 
				}
			}
			cal.add(Calendar.DAY_OF_MONTH, 1)
		}
		return res;
	}
	
	/**
	 * 
	 */
	def boolean validateAllocationRessource(Map<java.util.Date,List<Action>> cal,Map<EnumResourceType,List<Ressource>> mapRessource){
		val cpt = <EnumResourceType,Integer>newHashMap()
		
		for(listaction : cal.values){ // Each Date			
			// Init compteur
			for(key : mapRessource.keySet){
				cpt.put(key,0)
			}
			for(action : listaction){ // Each Action
				if(action instanceof AddWorker){
					var i = cpt.get(EnumResourceType.WORKER)+1;
					cpt.put(EnumResourceType.WORKER,i)
					if(i>mapRessource.get(EnumResourceType.WORKER).length){
						System.err.println("too many Workers allocate the same day")
						return false
					}
				}
				else if(action instanceof AddTractor){
					var i = cpt.get(EnumResourceType.TRACTOR)+1;
					cpt.put(EnumResourceType.TRACTOR,i)
					if(i>mapRessource.get(EnumResourceType.TRACTOR).length){
						System.err.println("too many Tractors allocate the same day")
						return false
					}
				}
			}
		}
		println("Ressource Allocation validate. ")
		return true;
	}
	
	/**
	 * Test Each Rule of Each Activity
	 */
	def void validateActivityRules(Exploitation e){
		var activities 	= new LinkedList<PeriodicActivity>()
		
		for(s : e.surface){
			activities.addAll(s.atelier.activity)
		}
		
		for(activity : activities){
			for(r:activity.rule){
				if(!RuleAspect.simulate(r,activity.start)){
					System.err.println(PeriodicActivityAspect.compile(activity)+"\n err "+RuleAspect.compile(r))
				}
			}
		}
	}
}