package org.eclipse.capella.vp.kcvl
 
import org.omg.cvl.BaseModelHandle
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI

class KCvlUtils
{
	def static resolve(BaseModelHandle obj) {
		val rs = new ResourceSetImpl
		//if (obj.referenceString !=null)
		return rs.getEObject(URI::createURI(obj.referenceString), true)
		//else
		//	return null
	}
}
 	