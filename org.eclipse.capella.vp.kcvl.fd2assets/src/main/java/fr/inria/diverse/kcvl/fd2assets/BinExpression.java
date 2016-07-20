/**
 */
package fr.inria.diverse.kcvl.fd2assets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bin Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.kcvl.fd2assets.BinExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.inria.diverse.kcvl.fd2assets.BinExpression#getRight <em>Right</em>}</li>
 *   <li>{@link fr.inria.diverse.kcvl.fd2assets.BinExpression#getOp <em>Op</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage#getBinExpression()
 * @model
 * @generated
 */
public interface BinExpression extends Expression {
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
	 * @see fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage#getBinExpression_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeft();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.kcvl.fd2assets.BinExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Expression value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Expression)
	 * @see fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage#getBinExpression_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRight();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.kcvl.fd2assets.BinExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Expression value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.inria.diverse.kcvl.fd2assets.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see fr.inria.diverse.kcvl.fd2assets.Operator
	 * @see #setOp(Operator)
	 * @see fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage#getBinExpression_Op()
	 * @model required="true"
	 * @generated
	 */
	Operator getOp();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.kcvl.fd2assets.BinExpression#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see fr.inria.diverse.kcvl.fd2assets.Operator
	 * @see #getOp()
	 * @generated
	 */
	void setOp(Operator value);

} // BinExpression
