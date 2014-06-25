package fr.inria.diverse.kcvl.validation

import org.eclipse.xtext.validation.Check

import org.omg.CVLMetamodelMaster.cvl.ObjectHandle
import org.omg.CVLMetamodelMaster.cvl.CvlPackage
import org.omg.CVLMetamodelMaster.cvl.BaseModelHandle

class KCVLValidator extends AbstractKCVLValidator
{
	// TODO: Consider throwing a meaningful message
	@Check
	def checkReferencedEObjectExists(BaseModelHandle obj) {
		if (obj.reference === null)
			error("Cannot resolve reference to EObject", CvlPackage.Literals.BASE_MODEL_HANDLE__REFERENCE_STRING)
	}

	@Check
	def checkMofRefIsValid(ObjectHandle obj) {
		// ...
	}

}
