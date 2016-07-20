/**
 */
package org.omg.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.BooleanLiteralExp#isBool <em>Bool</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getBooleanLiteralExp()
 * @model
 * @generated
 */
public interface BooleanLiteralExp extends OCLExpression {
	/**
	 * Returns the value of the '<em><b>Bool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool</em>' attribute.
	 * @see #setBool(boolean)
	 * @see org.omg.cvl.CvlPackage#getBooleanLiteralExp_Bool()
	 * @model required="true"
	 * @generated
	 */
	boolean isBool();

	/**
	 * Sets the value of the '{@link org.omg.cvl.BooleanLiteralExp#isBool <em>Bool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool</em>' attribute.
	 * @see #isBool()
	 * @generated
	 */
	void setBool(boolean value);

} // BooleanLiteralExp
