/**
 */
package fr.inria.diverse.kcvl.fd2assets.impl;

import fr.inria.diverse.kcvl.fd2assets.Condition;
import fr.inria.diverse.kcvl.fd2assets.Fd2assetsPackage;
import fr.inria.diverse.kcvl.fd2assets.HasChoice;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Has Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.diverse.kcvl.fd2assets.impl.HasChoiceImpl#getChoiceName <em>Choice Name</em>}</li>
 *   <li>{@link fr.inria.diverse.kcvl.fd2assets.impl.HasChoiceImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HasChoiceImpl extends ExpressionImpl implements HasChoice {
	/**
	 * The default value of the '{@link #getChoiceName() <em>Choice Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String CHOICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChoiceName() <em>Choice Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoiceName()
	 * @generated
	 * @ordered
	 */
	protected String choiceName = CHOICE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HasChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fd2assetsPackage.Literals.HAS_CHOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChoiceName() {
		return choiceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoiceName(String newChoiceName) {
		String oldChoiceName = choiceName;
		choiceName = newChoiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fd2assetsPackage.HAS_CHOICE__CHOICE_NAME, oldChoiceName, choiceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fd2assetsPackage.HAS_CHOICE__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Fd2assetsPackage.HAS_CHOICE__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Fd2assetsPackage.HAS_CHOICE__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fd2assetsPackage.HAS_CHOICE__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Fd2assetsPackage.HAS_CHOICE__CONDITION:
				return basicSetCondition(null, msgs);
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
			case Fd2assetsPackage.HAS_CHOICE__CHOICE_NAME:
				return getChoiceName();
			case Fd2assetsPackage.HAS_CHOICE__CONDITION:
				return getCondition();
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
			case Fd2assetsPackage.HAS_CHOICE__CHOICE_NAME:
				setChoiceName((String)newValue);
				return;
			case Fd2assetsPackage.HAS_CHOICE__CONDITION:
				setCondition((Condition)newValue);
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
			case Fd2assetsPackage.HAS_CHOICE__CHOICE_NAME:
				setChoiceName(CHOICE_NAME_EDEFAULT);
				return;
			case Fd2assetsPackage.HAS_CHOICE__CONDITION:
				setCondition((Condition)null);
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
			case Fd2assetsPackage.HAS_CHOICE__CHOICE_NAME:
				return CHOICE_NAME_EDEFAULT == null ? choiceName != null : !CHOICE_NAME_EDEFAULT.equals(choiceName);
			case Fd2assetsPackage.HAS_CHOICE__CONDITION:
				return condition != null;
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
		result.append(" (choiceName: ");
		result.append(choiceName);
		result.append(')');
		return result.toString();
	}

} //HasChoiceImpl
