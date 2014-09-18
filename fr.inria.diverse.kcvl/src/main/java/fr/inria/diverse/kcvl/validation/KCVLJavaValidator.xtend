package fr.inria.diverse.kcvl.validation

import fr.inria.diverse.kcvl.KCvlUtils

import org.omg.CVLMetamodelMaster.cvl.ObjectHandle
import org.omg.CVLMetamodelMaster.cvl.CvlPackage$Literals
import org.omg.CVLMetamodelMaster.cvl.BaseModelHandle

import org.eclipse.xtext.validation.Check

class KCVLJavaValidator extends AbstractKCVLJavaValidator
{
	// TODO: Consider throwing a meaningful message
	@Check
	def checkReferencedEObjectExists(BaseModelHandle obj) {
		if (obj.reference == null)
			try {
				KCvlUtils::resolve(obj)
				error("Cannot resolve reference to EObject", Literals::BASE_MODEL_HANDLE__REFERENCE_STRING)
			} catch (Exception e) {
				error("Cannot resolve reference to EObject: " + e.message, Literals::BASE_MODEL_HANDLE__REFERENCE_STRING)	
			}
	}

	@Check
	def checkMofRefIsValid(ObjectHandle obj) {
		// ...
	}

}
