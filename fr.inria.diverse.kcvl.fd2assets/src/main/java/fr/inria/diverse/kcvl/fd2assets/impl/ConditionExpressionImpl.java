/**
 */
package fr.inria.diverse.kcvl.fd2assets.impl;

import fr.inria.diverse.kcvl.fd2assets.CompareOperator;
import fr.inria.diverse.kcvl.fd2assets.ConditionExpression;
import fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.diverse.kcvl.fd2assets.impl.ConditionExpressionImpl#getFeatureAttibuteName <em>Feature Attibute Name</em>}</li>
 *   <li>{@link fr.inria.diverse.kcvl.fd2assets.impl.ConditionExpressionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link fr.inria.diverse.kcvl.fd2assets.impl.ConditionExpressionImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionExpressionImpl extends ConditionImpl implements ConditionExpression {
	/**
	 * The default value of the '{@link #getFeatureAttibuteName() <em>Feature Attibute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureAttibuteName()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_ATTIBUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureAttibuteName() <em>Feature Attibute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureAttibuteName()
	 * @generated
	 * @ordered
	 */
	protected String featureAttibuteName = FEATURE_ATTIBUTE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected static final CompareOperator OP_EDEFAULT = CompareOperator.SUP;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected CompareOperator op = OP_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fd2assetsPackage.Literals.CONDITION_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatureAttibuteName() {
		return featureAttibuteName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureAttibuteName(String newFeatureAttibuteName) {
		String oldFeatureAttibuteName = featureAttibuteName;
		featureAttibuteName = newFeatureAttibuteName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fd2assetsPackage.CONDITION_EXPRESSION__FEATURE_ATTIBUTE_NAME, oldFeatureAttibuteName, featureAttibuteName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompareOperator getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(CompareOperator newOp) {
		CompareOperator oldOp = op;
		op = newOp == null ? OP_EDEFAULT : newOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fd2assetsPackage.CONDITION_EXPRESSION__OP, oldOp, op));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fd2assetsPackage.CONDITION_EXPRESSION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Fd2assetsPackage.CONDITION_EXPRESSION__FEATURE_ATTIBUTE_NAME:
				return getFeatureAttibuteName();
			case Fd2assetsPackage.CONDITION_EXPRESSION__OP:
				return getOp();
			case Fd2assetsPackage.CONDITION_EXPRESSION__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Fd2assetsPackage.CONDITION_EXPRESSION__FEATURE_ATTIBUTE_NAME:
				setFeatureAttibuteName((String)newValue);
				return;
			case Fd2assetsPackage.CONDITION_EXPRESSION__OP:
				setOp((CompareOperator)newValue);
				return;
			case Fd2assetsPackage.CONDITION_EXPRESSION__VALUE:
				setValue((String)newValue);
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
			case Fd2assetsPackage.CONDITION_EXPRESSION__FEATURE_ATTIBUTE_NAME:
				setFeatureAttibuteName(FEATURE_ATTIBUTE_NAME_EDEFAULT);
				return;
			case Fd2assetsPackage.CONDITION_EXPRESSION__OP:
				setOp(OP_EDEFAULT);
				return;
			case Fd2assetsPackage.CONDITION_EXPRESSION__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case Fd2assetsPackage.CONDITION_EXPRESSION__FEATURE_ATTIBUTE_NAME:
				return FEATURE_ATTIBUTE_NAME_EDEFAULT == null ? featureAttibuteName != null : !FEATURE_ATTIBUTE_NAME_EDEFAULT.equals(featureAttibuteName);
			case Fd2assetsPackage.CONDITION_EXPRESSION__OP:
				return op != OP_EDEFAULT;
			case Fd2assetsPackage.CONDITION_EXPRESSION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (featureAttibuteName: ");
		result.append(featureAttibuteName);
		result.append(", op: ");
		result.append(op);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ConditionExpressionImpl
