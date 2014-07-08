/**
 */
package org.omg.CVLMetamodelMaster.cvl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSpec2 VSpec Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A VSpec2VSpecMapping specifies how to derive resolutions for certain VSpecs from resolutions of others via constraints.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.VSpec2VSpecMapping#getDerivingConstraint <em>Deriving Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVSpec2VSpecMapping()
 * @model
 * @generated
 */
public interface VSpec2VSpecMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Deriving Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.CVLMetamodelMaster.cvl.OpaqueConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deriving Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deriving Constraint</em>' containment reference list.
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVSpec2VSpecMapping_DerivingConstraint()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<OpaqueConstraint> getDerivingConstraint();

} // VSpec2VSpecMapping
