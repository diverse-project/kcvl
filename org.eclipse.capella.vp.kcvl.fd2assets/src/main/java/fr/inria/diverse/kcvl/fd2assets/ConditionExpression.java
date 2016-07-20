/**
 */
package fr.inria.diverse.kcvl.fd2assets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.kcvl.fd2assets.ConditionExpression#getFeatureAttibuteName <em>Feature Attibute Name</em>}</li>
 *   <li>{@link fr.inria.diverse.kcvl.fd2assets.ConditionExpression#getOp <em>Op</em>}</li>
 *   <li>{@link fr.inria.diverse.kcvl.fd2assets.ConditionExpression#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage#getConditionExpression()
 * @model
 * @generated
 */
public interface ConditionExpression extends Condition {
	/**
	 * Returns the value of the '<em><b>Feature Attibute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Attibute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Attibute Name</em>' attribute.
	 * @see #setFeatureAttibuteName(String)
	 * @see fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage#getConditionExpression_FeatureAttibuteName()
	 * @model required="true"
	 * @generated
	 */
	String getFeatureAttibuteName();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.kcvl.fd2assets.ConditionExpression#getFeatureAttibuteName <em>Feature Attibute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Attibute Name</em>' attribute.
	 * @see #getFeatureAttibuteName()
	 * @generated
	 */
	void setFeatureAttibuteName(String value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.inria.diverse.kcvl.fd2assets.CompareOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see fr.inria.diverse.kcvl.fd2assets.CompareOperator
	 * @see #setOp(CompareOperator)
	 * @see fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage#getConditionExpression_Op()
	 * @model required="true"
	 * @generated
	 */
	CompareOperator getOp();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.kcvl.fd2assets.ConditionExpression#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see fr.inria.diverse.kcvl.fd2assets.CompareOperator
	 * @see #getOp()
	 * @generated
	 */
	void setOp(CompareOperator value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage#getConditionExpression_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.kcvl.fd2assets.ConditionExpression#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ConditionExpression
