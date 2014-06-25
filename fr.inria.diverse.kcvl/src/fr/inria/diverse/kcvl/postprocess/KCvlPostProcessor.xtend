package fr.inria.diverse.kcvl.postprocess

import org.eclipse.xtext.resource.IDerivedStateComputer
import org.eclipse.xtext.resource.DerivedStateAwareResource

import org.omg.CVLMetamodelMaster.cvl.VPackage
import org.omg.CVLMetamodelMaster.cvl.VSpec
import org.omg.CVLMetamodelMaster.cvl.ObjectHandle
import org.omg.CVLMetamodelMaster.cvl.LinkHandle

import static extension fr.inria.diverse.kcvl.KCvlUtils.*

class KCvlPostProcessor implements IDerivedStateComputer
{
	override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		val root = resource.parseResult?.rootASTElement as VPackage

		if (root !== null) {
			root.eAllContents.forEach[
				switch it {
					ObjectHandle:
						try {
							MOFRef = MOFRef ?: ""
							reference = reference ?: resolve
						} catch (Exception e) {
							// Don't cry
						}

					LinkHandle:
						try {
							MOFRef = MOFRef ?: ""
							reference = reference ?: resolve
						} catch (Exception e) {
							// Don't cry
						}

					VSpec:
						resolutionTime = resolutionTime ?: ""						
				}
			]
		}
	}
	
	override discardDerivedState(DerivedStateAwareResource resource) {
		// TODO: Do we really need to discard the modification? Seems to work...
	}
}
