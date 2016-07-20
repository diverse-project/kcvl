/**
 */
package org.omg.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unlimited Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.UnlimitedLiteralExp#getUnlimited <em>Unlimited</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getUnlimitedLiteralExp()
 * @model
 * @generated
 */
public interface UnlimitedLiteralExp extends NumericLiteralExp {
	/**
	 * Returns the value of the '<em><b>Unlimited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unlimited</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unlimited</em>' attribute.
	 * @see #setUnlimited(int)
	 * @see org.omg.cvl.CvlPackage#getUnlimitedLiteralExp_Unlimited()
	 * @model required="true"
	 * @generated
	 */
	int getUnlimited();

	/**
	 * Sets the value of the '{@link org.omg.cvl.UnlimitedLiteralExp#getUnlimited <em>Unlimited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unlimited</em>' attribute.
	 * @see #getUnlimited()
	 * @generated
	 */
	void setUnlimited(int value);

} // UnlimitedLiteralExp
