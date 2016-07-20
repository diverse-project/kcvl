/**
 */
package org.omg.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.IntegerLiteralExp#getInteger <em>Integer</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getIntegerLiteralExp()
 * @model
 * @generated
 */
public interface IntegerLiteralExp extends NumericLiteralExp {
	/**
	 * Returns the value of the '<em><b>Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer</em>' attribute.
	 * @see #setInteger(int)
	 * @see org.omg.cvl.CvlPackage#getIntegerLiteralExp_Integer()
	 * @model required="true"
	 * @generated
	 */
	int getInteger();

	/**
	 * Sets the value of the '{@link org.omg.cvl.IntegerLiteralExp#getInteger <em>Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer</em>' attribute.
	 * @see #getInteger()
	 * @generated
	 */
	void setInteger(int value);

} // IntegerLiteralExp
