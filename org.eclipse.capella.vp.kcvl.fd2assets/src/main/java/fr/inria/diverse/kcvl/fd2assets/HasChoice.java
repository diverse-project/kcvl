/**
 */
package fr.inria.diverse.kcvl.fd2assets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Has Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.kcvl.fd2assets.HasChoice#getChoiceName <em>Choice Name</em>}</li>
 *   <li>{@link fr.inria.diverse.kcvl.fd2assets.HasChoice#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage#getHasChoice()
 * @model
 * @generated
 */
public interface HasChoice extends Expression {
	/**
	 * Returns the value of the '<em><b>Choice Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice Name</em>' attribute.
	 * @see #setChoiceName(String)
	 * @see fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage#getHasChoice_ChoiceName()
	 * @model required="true"
	 * @generated
	 */
	String getChoiceName();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.kcvl.fd2assets.HasChoice#getChoiceName <em>Choice Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choice Name</em>' attribute.
	 * @see #getChoiceName()
	 * @generated
	 */
	void setChoiceName(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage#getHasChoice_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.kcvl.fd2assets.HasChoice#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

} // HasChoice
