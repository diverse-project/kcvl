/**
 */
package org.omg.CVLMetamodelMaster.cvl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.CVLMetamodelMaster.cvl.CvlPackage;
import org.omg.CVLMetamodelMaster.cvl.OCLExpression;
import org.omg.CVLMetamodelMaster.cvl.VariableDerivation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Derivation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.VariableDerivationImpl#getDerivingExpression <em>Deriving Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDerivationImpl extends VSpecDerivationImpl implements VariableDerivation {
	/**
	 * The cached value of the '{@link #getDerivingExpression() <em>Deriving Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivingExpression()
	 * @generated
	 * @ordered
	 */
	protected OCLExpression derivingExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDerivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvlPackage.Literals.VARIABLE_DERIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLExpression getDerivingExpression() {
		return derivingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivingExpression(OCLExpression newDerivingExpression, NotificationChain msgs) {
		OCLExpression oldDerivingExpression = derivingExpression;
		derivingExpression = newDerivingExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvlPackage.VARIABLE_DERIVATION__DERIVING_EXPRESSION, oldDerivingExpression, newDerivingExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivingExpression(OCLExpression newDerivingExpression) {
		if (newDerivingExpression != derivingExpression) {
			NotificationChain msgs = null;
			if (derivingExpression != null)
				msgs = ((InternalEObject)derivingExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CvlPackage.VARIABLE_DERIVATION__DERIVING_EXPRESSION, null, msgs);
			if (newDerivingExpression != null)
				msgs = ((InternalEObject)newDerivingExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CvlPackage.VARIABLE_DERIVATION__DERIVING_EXPRESSION, null, msgs);
			msgs = basicSetDerivingExpression(newDerivingExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.VARIABLE_DERIVATION__DERIVING_EXPRESSION, newDerivingExpression, newDerivingExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvlPackage.VARIABLE_DERIVATION__DERIVING_EXPRESSION:
				return basicSetDerivingExpression(null, msgs);
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
			case CvlPackage.VARIABLE_DERIVATION__DERIVING_EXPRESSION:
				return getDerivingExpression();
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
			case CvlPackage.VARIABLE_DERIVATION__DERIVING_EXPRESSION:
				setDerivingExpression((OCLExpression)newValue);
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
			case CvlPackage.VARIABLE_DERIVATION__DERIVING_EXPRESSION:
				setDerivingExpression((OCLExpression)null);
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
			case CvlPackage.VARIABLE_DERIVATION__DERIVING_EXPRESSION:
				return derivingExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableDerivationImpl
