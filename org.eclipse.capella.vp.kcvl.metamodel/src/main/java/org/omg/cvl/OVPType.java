/**
 */
package org.omg.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OVP Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.OVPType#getSpec <em>Spec</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getOVPType()
 * @model
 * @generated
 */
public interface OVPType extends VPackageable {
	/**
	 * Returns the value of the '<em><b>Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec</em>' containment reference.
	 * @see #setSpec(OVPSemanticSpec)
	 * @see org.omg.cvl.CvlPackage#getOVPType_Spec()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OVPSemanticSpec getSpec();

	/**
	 * Sets the value of the '{@link org.omg.cvl.OVPType#getSpec <em>Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec</em>' containment reference.
	 * @see #getSpec()
	 * @generated
	 */
	void setSpec(OVPSemanticSpec value);

} // OVPType
