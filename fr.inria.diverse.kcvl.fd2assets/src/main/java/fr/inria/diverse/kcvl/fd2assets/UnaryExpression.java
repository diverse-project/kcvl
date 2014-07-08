/**
 */
package fr.inria.diverse.kcvl.fd2assets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.kcvl.fd2assets.UnaryExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.inria.diverse.kcvl.fd2assets.UnaryExpression#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage#getUnaryExpression()
 * @model
 * @generated
 */
public interface UnaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Expression)
	 * @see fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage#getUnaryExpression_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.kcvl.fd2assets.UnaryExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The default value is <code>"op"</code>.
	 * The literals are from the enumeration {@link fr.inria.diverse.kcvl.fd2assets.UnaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see fr.inria.diverse.kcvl.fd2assets.UnaryOperator
	 * @see #setOp(UnaryOperator)
	 * @see fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage#getUnaryExpression_Op()
	 * @model default="op" required="true"
	 * @generated
	 */
	UnaryOperator getOp();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.kcvl.fd2assets.UnaryExpression#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see fr.inria.diverse.kcvl.fd2assets.UnaryOperator
	 * @see #getOp()
	 * @generated
	 */
	void setOp(UnaryOperator value);

} // UnaryExpression
