/**
 */
package fr.inria.diverse.kcvl.fd2assets.impl;

import fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage;
import fr.inria.diverse.kcvl.fd2assets.RestrictionRule;
import fr.inria.diverse.kcvl.fd2assets.RestrictionRuleset;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restriction Ruleset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.diverse.kcvl.fd2assets.impl.RestrictionRulesetImpl#getCvlmodel <em>Cvlmodel</em>}</li>
 *   <li>{@link fr.inria.diverse.kcvl.fd2assets.impl.RestrictionRulesetImpl#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestrictionRulesetImpl extends MinimalEObjectImpl.Container implements RestrictionRuleset {
	/**
	 * The default value of the '{@link #getCvlmodel() <em>Cvlmodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCvlmodel()
	 * @generated
	 * @ordered
	 */
	protected static final String CVLMODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCvlmodel() <em>Cvlmodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCvlmodel()
	 * @generated
	 * @ordered
	 */
	protected String cvlmodel = CVLMODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRule() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRule()
	 * @generated
	 * @ordered
	 */
	protected EList<RestrictionRule> rule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestrictionRulesetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fd2assetsPackage.Literals.RESTRICTION_RULESET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCvlmodel() {
		return cvlmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCvlmodel(String newCvlmodel) {
		String oldCvlmodel = cvlmodel;
		cvlmodel = newCvlmodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fd2assetsPackage.RESTRICTION_RULESET__CVLMODEL, oldCvlmodel, cvlmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RestrictionRule> getRule() {
		if (rule == null) {
			rule = new EObjectContainmentEList<RestrictionRule>(RestrictionRule.class, this, Fd2assetsPackage.RESTRICTION_RULESET__RULE);
		}
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Fd2assetsPackage.RESTRICTION_RULESET__RULE:
				return ((InternalEList<?>)getRule()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Fd2assetsPackage.RESTRICTION_RULESET__CVLMODEL:
				return getCvlmodel();
			case Fd2assetsPackage.RESTRICTION_RULESET__RULE:
				return getRule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Fd2assetsPackage.RESTRICTION_RULESET__CVLMODEL:
				setCvlmodel((String)newValue);
				return;
			case Fd2assetsPackage.RESTRICTION_RULESET__RULE:
				getRule().clear();
				getRule().addAll((Collection<? extends RestrictionRule>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Fd2assetsPackage.RESTRICTION_RULESET__CVLMODEL:
				setCvlmodel(CVLMODEL_EDEFAULT);
				return;
			case Fd2assetsPackage.RESTRICTION_RULESET__RULE:
				getRule().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Fd2assetsPackage.RESTRICTION_RULESET__CVLMODEL:
				return CVLMODEL_EDEFAULT == null ? cvlmodel != null : !CVLMODEL_EDEFAULT.equals(cvlmodel);
			case Fd2assetsPackage.RESTRICTION_RULESET__RULE:
				return rule != null && !rule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (cvlmodel: ");
		result.append(cvlmodel);
		result.append(')');
		return result.toString();
	}

} //RestrictionRulesetImpl
