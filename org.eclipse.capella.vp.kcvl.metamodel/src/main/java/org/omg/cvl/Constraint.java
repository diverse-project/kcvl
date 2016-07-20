/**
 */
package org.omg.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.Constraint#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends VPackageable {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(VSpec)
	 * @see org.omg.cvl.CvlPackage#getConstraint_Context()
	 * @model
	 * @generated
	 */
	VSpec getContext();

	/**
	 * Sets the value of the '{@link org.omg.cvl.Constraint#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(VSpec value);

} // Constraint
