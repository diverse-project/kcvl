package com.thales.movida.derivation
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import resolutionmodel.ResolutionmodelPackage
import featureDiagram.FeatureDiagramPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl
import org.eclipse.emf.ecore.util.EcoreUtil

object Test {

  	def main(args: Array[String]) {
  		//testResolution()
  		testDerivation()
	}
  	
  	def testResolution()={
	  var resourceSet = new ResourceSetImpl()
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", 
				new XMIResourceFactoryImpl());
	  resourceSet.getPackageRegistry().put(FeatureDiagramPackage.eNS_URI, FeatureDiagramPackage.eINSTANCE);
	  resourceSet.getPackageRegistry().put(ResolutionmodelPackage.eNS_URI, ResolutionmodelPackage.eINSTANCE);
	  var uri = URI.createDeviceURI("file://C:/Users/mgouyett/workspacescala/test/My.featurediagram")
	  var res= resourceSet.getResource(uri,true);
	  res.load(null)
		  Resolution.deriveFeatureDiagram(res)
			var resource = resourceSet.createResource(uri.appendFileExtension("resolutionmodel"))
			// add the root object to the resource
			resource.getContents().add(Resolution.resolModel);
			resource.save(null);		
	  	  
  	}
  	def testDerivation()={
	  var resourceSet = new ResourceSetImpl()
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", 
				new EcoreResourceFactoryImpl);
	  resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("featurediagram", 
				new XMIResourceFactoryImpl());
	  resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("resolutionmodel", 
				new XMIResourceFactoryImpl());

	  resourceSet.getPackageRegistry().put(FeatureDiagramPackage.eNS_URI, FeatureDiagramPackage.eINSTANCE);
	  resourceSet.getPackageRegistry().put(ResolutionmodelPackage.eNS_URI, ResolutionmodelPackage.eINSTANCE);
	  resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);

	  var uri = URI.createDeviceURI("file://C:/Users/mgouyett/workspacescala/test/My.featurediagram.resolutionmodel")
	  var res= resourceSet.getResource(uri,true);
	  
	  //res.load(null)
	  
	 
			  
			  
	

	  var resource = Derivation.deriveFeatureDiagram(res,".*"  )

	  
	  
	  var uri1 = URI.createDeviceURI("file://C:/Users/mgouyett/workspacescala/test/newcar.ecore")

	  resource.setURI(uri1)
		// add the root object to the resource
	  resource.save(null);		
	  
	  
  	  
  	}
  
}