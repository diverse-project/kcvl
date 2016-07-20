/**
 */
package org.omg.cvl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.cvl.CvlPackage;
import org.omg.cvl.VSpec;
import org.omg.cvl.VSpecRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSpec Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.impl.VSpecRefImpl#getVSpec <em>VSpec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSpecRefImpl extends OCLExpressionImpl implements VSpecRef {
	/**
	 * The cached value of the '{@link #getVSpec() <em>VSpec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSpec()
	 * @generated
	 * @ordered
	 */
	protected VSpec vSpec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSpecRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvlPackage.Literals.VSPEC_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSpec getVSpec() {
		if (vSpec != null && vSpec.eIsProxy()) {
			InternalEObject oldVSpec = (InternalEObject)vSpec;
			vSpec = (VSpec)eResolveProxy(oldVSpec);
			if (vSpec != oldVSpec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CvlPackage.VSPEC_REF__VSPEC, oldVSpec, vSpec));
			}
		}
		return vSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSpec basicGetVSpec() {
		return vSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVSpec(VSpec newVSpec) {
		VSpec oldVSpec = vSpec;
		vSpec = newVSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.VSPEC_REF__VSPEC, oldVSpec, vSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CvlPackage.VSPEC_REF__VSPEC:
				if (resolve) return getVSpec();
				return basicGetVSpec();
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
			case CvlPackage.VSPEC_REF__VSPEC:
				setVSpec((VSpec)newValue);
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
			case CvlPackage.VSPEC_REF__VSPEC:
				setVSpec((VSpec)null);
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
			case CvlPackage.VSPEC_REF__VSPEC:
				return vSpec != null;
		}
		return super.eIsSet(featureID);
	}

} //VSpecRefImpl
