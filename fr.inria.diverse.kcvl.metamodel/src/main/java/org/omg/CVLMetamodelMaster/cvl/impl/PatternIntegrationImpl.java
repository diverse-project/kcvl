/**
 */
package org.omg.CVLMetamodelMaster.cvl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.omg.CVLMetamodelMaster.cvl.CvlPackage;
import org.omg.CVLMetamodelMaster.cvl.ObjectSubstitution;
import org.omg.CVLMetamodelMaster.cvl.PatternIntegration;
import org.omg.CVLMetamodelMaster.cvl.RepeatableVariationPoint;
import org.omg.CVLMetamodelMaster.cvl.VClassifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern Integration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.PatternIntegrationImpl#getBindingClassifier <em>Binding Classifier</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.PatternIntegrationImpl#isMulti <em>Multi</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.PatternIntegrationImpl#getSubstitutes <em>Substitutes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatternIntegrationImpl extends ChoiceVariationPointImpl implements PatternIntegration {
	/**
	 * The cached value of the '{@link #getBindingClassifier() <em>Binding Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingClassifier()
	 * @generated
	 * @ordered
	 */
	protected VClassifier bindingClassifier;

	/**
	 * The default value of the '{@link #isMulti() <em>Multi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMulti()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMulti() <em>Multi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMulti()
	 * @generated
	 * @ordered
	 */
	protected boolean multi = MULTI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubstitutes() <em>Substitutes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutes()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectSubstitution> substitutes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternIntegrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvlPackage.Literals.PATTERN_INTEGRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VClassifier getBindingClassifier() {
		if (bindingClassifier != null && bindingClassifier.eIsProxy()) {
			InternalEObject oldBindingClassifier = (InternalEObject)bindingClassifier;
			bindingClassifier = (VClassifier)eResolveProxy(oldBindingClassifier);
			if (bindingClassifier != oldBindingClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CvlPackage.PATTERN_INTEGRATION__BINDING_CLASSIFIER, oldBindingClassifier, bindingClassifier));
			}
		}
		return bindingClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VClassifier basicGetBindingClassifier() {
		return bindingClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingClassifier(VClassifier newBindingClassifier) {
		VClassifier oldBindingClassifier = bindingClassifier;
		bindingClassifier = newBindingClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.PATTERN_INTEGRATION__BINDING_CLASSIFIER, oldBindingClassifier, bindingClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMulti() {
		return multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMulti(boolean newMulti) {
		boolean oldMulti = multi;
		multi = newMulti;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.PATTERN_INTEGRATION__MULTI, oldMulti, multi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectSubstitution> getSubstitutes() {
		if (substitutes == null) {
			substitutes = new EObjectResolvingEList<ObjectSubstitution>(ObjectSubstitution.class, this, CvlPackage.PATTERN_INTEGRATION__SUBSTITUTES);
		}
		return substitutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CvlPackage.PATTERN_INTEGRATION__BINDING_CLASSIFIER:
				if (resolve) return getBindingClassifier();
				return basicGetBindingClassifier();
			case CvlPackage.PATTERN_INTEGRATION__MULTI:
				return isMulti();
			case CvlPackage.PATTERN_INTEGRATION__SUBSTITUTES:
				return getSubstitutes();
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
			case CvlPackage.PATTERN_INTEGRATION__BINDING_CLASSIFIER:
				setBindingClassifier((VClassifier)newValue);
				return;
			case CvlPackage.PATTERN_INTEGRATION__MULTI:
				setMulti((Boolean)newValue);
				return;
			case CvlPackage.PATTERN_INTEGRATION__SUBSTITUTES:
				getSubstitutes().clear();
				getSubstitutes().addAll((Collection<? extends ObjectSubstitution>)newValue);
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
			case CvlPackage.PATTERN_INTEGRATION__BINDING_CLASSIFIER:
				setBindingClassifier((VClassifier)null);
				return;
			case CvlPackage.PATTERN_INTEGRATION__MULTI:
				setMulti(MULTI_EDEFAULT);
				return;
			case CvlPackage.PATTERN_INTEGRATION__SUBSTITUTES:
				getSubstitutes().clear();
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
			case CvlPackage.PATTERN_INTEGRATION__BINDING_CLASSIFIER:
				return bindingClassifier != null;
			case CvlPackage.PATTERN_INTEGRATION__MULTI:
				return multi != MULTI_EDEFAULT;
			case CvlPackage.PATTERN_INTEGRATION__SUBSTITUTES:
				return substitutes != null && !substitutes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == RepeatableVariationPoint.class) {
			switch (derivedFeatureID) {
				case CvlPackage.PATTERN_INTEGRATION__BINDING_CLASSIFIER: return CvlPackage.REPEATABLE_VARIATION_POINT__BINDING_CLASSIFIER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == RepeatableVariationPoint.class) {
			switch (baseFeatureID) {
				case CvlPackage.REPEATABLE_VARIATION_POINT__BINDING_CLASSIFIER: return CvlPackage.PATTERN_INTEGRATION__BINDING_CLASSIFIER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (multi: ");
		result.append(multi);
		result.append(')');
		return result.toString();
	}

} //PatternIntegrationImpl
