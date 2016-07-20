/**
 */
package org.omg.cvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.RealLiteralExp#getReal <em>Real</em>}</li>
 * </ul>
 *
 * @see org.omg.cvl.CvlPackage#getRealLiteralExp()
 * @model
 * @generated
 */
public interface RealLiteralExp extends NumericLiteralExp {
	/**
	 * Returns the value of the '<em><b>Real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Real</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real</em>' attribute.
	 * @see #setReal(double)
	 * @see org.omg.cvl.CvlPackage#getRealLiteralExp_Real()
	 * @model required="true"
	 * @generated
	 */
	double getReal();

	/**
	 * Sets the value of the '{@link org.omg.cvl.RealLiteralExp#getReal <em>Real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real</em>' attribute.
	 * @see #getReal()
	 * @generated
	 */
	void setReal(double value);

} // RealLiteralExp
