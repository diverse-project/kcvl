/**
 */
package org.omg.CVLMetamodelMaster.cvl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CV Spec Derivation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.CVSpecDerivation#getMemberDerivation <em>Member Derivation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getCVSpecDerivation()
 * @model
 * @generated
 */
public interface CVSpecDerivation extends VSpecDerivation {
	/**
	 * Returns the value of the '<em><b>Member Derivation</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.CVLMetamodelMaster.cvl.VSpecDerivation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member Derivation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Derivation</em>' containment reference list.
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getCVSpecDerivation_MemberDerivation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<VSpecDerivation> getMemberDerivation();

} // CVSpecDerivation
