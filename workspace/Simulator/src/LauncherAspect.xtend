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

class LaunchFromStartingFile{
	def static void main(String[] args){
		var fact = new XMIResourceFactoryImpl
		if(!EPackage.Registry.INSTANCE.containsKey(ExploitationPackage.eNS_URI)){
			EPackage.Registry.INSTANCE.put(ExploitationPackage.eNS_URI, ExploitationPackage.eINSTANCE);
		}
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
		// Start ExploitationAspect
		ExploitationAspect.simulate(exp,_self.quantityOfWater,dateBegin,cal.time)
		ExploitationAspect.compile(exp)
		
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
		var ActivityMap = ModelAspect.getAtelierList(model)
		
		for(surface : e.surface){
			if(ActivityMap.containsKey(surface.atelier.id)){
				val list = ActivityMap.get(surface.atelier.id)
				surface.atelier.activity.addAll(list)
			}
		}

		println("Activity loaded.")		
	}
}