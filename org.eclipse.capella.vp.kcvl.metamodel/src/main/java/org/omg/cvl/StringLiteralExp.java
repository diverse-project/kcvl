/**
 */
package org.omg.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.StringLiteralExp#getString <em>String</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getStringLiteralExp()
 * @model
 * @generated
 */
public interface StringLiteralExp extends OCLExpression {
	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute.
	 * @see #setString(String)
	 * @see org.omg.cvl.CvlPackage#getStringLiteralExp_String()
	 * @model required="true"
	 * @generated
	 */
	String getString();

	/**
	 * Sets the value of the '{@link org.omg.cvl.StringLiteralExp#getString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' attribute.
	 * @see #getString()
	 * @generated
	 */
	void setString(String value);

} // StringLiteralExp
