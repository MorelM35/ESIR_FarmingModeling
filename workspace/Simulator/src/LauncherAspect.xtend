

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import activity.Launcher
import exploitation.impl.ExploitationFactoryImpl
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import exploitation.Exploitation
import java.util.Calendar

@Aspect(className=Launcher)
class LauncherAspect {
	public def void start(){
		
		// Load Model
		var fact = ExploitationFactoryImpl.init
		if(!EPackage.Registry.INSTANCE.containsKey(EcorePackage.eNS_URI)){
			EPackage.Registry.INSTANCE.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("ecore",fact);
		var rs = new ResourceSetImpl
		var uri = URI.createURI("exploitation.ecore")
		var res = rs.getResource(uri,true);
		
		//apply Transformation
		var exp = res.contents.filter(Exploitation).get(0)
		var cal = Calendar.getInstance
		cal.set(_self.begin.year,_self.begin.month.ordinal,_self.begin.day)
		var dateBegin= cal.time; 
		cal.set(_self.end.year,_self.end.month.ordinal,_self.end.day)
		
		// Start ExploitationAspect
		ExploitationAspect.simulate(exp,_self.quantityOfWater,dateBegin,cal.time)
		ExploitationAspect.compile(exp)
		
	}
}