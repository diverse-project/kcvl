/**
 */
package fr.inria.diverse.kcvl.fd2assets;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restriction Ruleset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.kcvl.fd2assets.RestrictionRuleset#getCvlmodel <em>Cvlmodel</em>}</li>
 *   <li>{@link fr.inria.diverse.kcvl.fd2assets.RestrictionRuleset#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage#getRestrictionRuleset()
 * @model
 * @generated
 */
public interface RestrictionRuleset extends EObject {
	/**
	 * Returns the value of the '<em><b>Cvlmodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cvlmodel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cvlmodel</em>' attribute.
	 * @see #setCvlmodel(String)
	 * @see fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage#getRestrictionRuleset_Cvlmodel()
	 * @model required="true"
	 * @generated
	 */
	String getCvlmodel();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.kcvl.fd2assets.RestrictionRuleset#getCvlmodel <em>Cvlmodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cvlmodel</em>' attribute.
	 * @see #getCvlmodel()
	 * @generated
	 */
	void setCvlmodel(String value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.kcvl.fd2assets.RestrictionRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage#getRestrictionRuleset_Rule()
	 * @model containment="true"
	 * @generated
	 */
	EList<RestrictionRule> getRule();

} // RestrictionRuleset
