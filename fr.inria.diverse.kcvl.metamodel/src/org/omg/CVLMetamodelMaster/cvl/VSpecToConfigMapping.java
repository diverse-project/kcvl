/**
 */
package org.omg.CVLMetamodelMaster.cvl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSpec To Config Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A VSpec2VSpecMapping specifies how to derive resolutions for certain VSpecs from resolutions of others by specifying that the fulfillment of a certain constraint implies an entire configuration.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.VSpecToConfigMapping#getThenConfiguration <em>Then Configuration</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.VSpecToConfigMapping#getIfConstraint <em>If Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVSpecToConfigMapping()
 * @model
 * @generated
 */
public interface VSpecToConfigMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Then Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Configuration</em>' reference.
	 * @see #setThenConfiguration(VConfiguration)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVSpecToConfigMapping_ThenConfiguration()
	 * @model ordered="false"
	 * @generated
	 */
	VConfiguration getThenConfiguration();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.VSpecToConfigMapping#getThenConfiguration <em>Then Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Configuration</em>' reference.
	 * @see #getThenConfiguration()
	 * @generated
	 */
	void setThenConfiguration(VConfiguration value);

	/**
	 * Returns the value of the '<em><b>If Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If Constraint</em>' containment reference.
	 * @see #setIfConstraint(OpaqueConstraint)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVSpecToConfigMapping_IfConstraint()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	OpaqueConstraint getIfConstraint();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.VSpecToConfigMapping#getIfConstraint <em>If Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If Constraint</em>' containment reference.
	 * @see #getIfConstraint()
	 * @generated
	 */
	void setIfConstraint(OpaqueConstraint value);

} // VSpecToConfigMapping
