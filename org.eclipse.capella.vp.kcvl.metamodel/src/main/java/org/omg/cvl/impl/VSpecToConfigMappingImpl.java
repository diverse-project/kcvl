/**
 */
package org.omg.cvl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.omg.cvl.CvlPackage;
import org.omg.cvl.OpaqueConstraint;
import org.omg.cvl.VConfiguration;
import org.omg.cvl.VSpecToConfigMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSpec To Config Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.impl.VSpecToConfigMappingImpl#getThenConfiguration <em>Then Configuration</em>}</li>
 *   <li>{@link org.omg.cvl.impl.VSpecToConfigMappingImpl#getIfConstraint <em>If Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSpecToConfigMappingImpl extends MinimalEObjectImpl.Container implements VSpecToConfigMapping {
	/**
	 * The cached value of the '{@link #getThenConfiguration() <em>Then Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThenConfiguration()
	 * @generated
	 * @ordered
	 */
	protected VConfiguration thenConfiguration;

	/**
	 * The cached value of the '{@link #getIfConstraint() <em>If Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfConstraint()
	 * @generated
	 * @ordered
	 */
	protected OpaqueConstraint ifConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSpecToConfigMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvlPackage.Literals.VSPEC_TO_CONFIG_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VConfiguration getThenConfiguration() {
		if (thenConfiguration != null && thenConfiguration.eIsProxy()) {
			InternalEObject oldThenConfiguration = (InternalEObject)thenConfiguration;
			thenConfiguration = (VConfiguration)eResolveProxy(oldThenConfiguration);
			if (thenConfiguration != oldThenConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CvlPackage.VSPEC_TO_CONFIG_MAPPING__THEN_CONFIGURATION, oldThenConfiguration, thenConfiguration));
			}
		}
		return thenConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VConfiguration basicGetThenConfiguration() {
		return thenConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThenConfiguration(VConfiguration newThenConfiguration) {
		VConfiguration oldThenConfiguration = thenConfiguration;
		thenConfiguration = newThenConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.VSPEC_TO_CONFIG_MAPPING__THEN_CONFIGURATION, oldThenConfiguration, thenConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueConstraint getIfConstraint() {
		return ifConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfConstraint(OpaqueConstraint newIfConstraint, NotificationChain msgs) {
		OpaqueConstraint oldIfConstraint = ifConstraint;
		ifConstraint = newIfConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvlPackage.VSPEC_TO_CONFIG_MAPPING__IF_CONSTRAINT, oldIfConstraint, newIfConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfConstraint(OpaqueConstraint newIfConstraint) {
		if (newIfConstraint != ifConstraint) {
			NotificationChain msgs = null;
			if (ifConstraint != null)
				msgs = ((InternalEObject)ifConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CvlPackage.VSPEC_TO_CONFIG_MAPPING__IF_CONSTRAINT, null, msgs);
			if (newIfConstraint != null)
				msgs = ((InternalEObject)newIfConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CvlPackage.VSPEC_TO_CONFIG_MAPPING__IF_CONSTRAINT, null, msgs);
			msgs = basicSetIfConstraint(newIfConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.VSPEC_TO_CONFIG_MAPPING__IF_CONSTRAINT, newIfConstraint, newIfConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvlPackage.VSPEC_TO_CONFIG_MAPPING__IF_CONSTRAINT:
				return basicSetIfConstraint(null, msgs);
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
			case CvlPackage.VSPEC_TO_CONFIG_MAPPING__THEN_CONFIGURATION:
				if (resolve) return getThenConfiguration();
				return basicGetThenConfiguration();
			case CvlPackage.VSPEC_TO_CONFIG_MAPPING__IF_CONSTRAINT:
				return getIfConstraint();
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
			case CvlPackage.VSPEC_TO_CONFIG_MAPPING__THEN_CONFIGURATION:
				setThenConfiguration((VConfiguration)newValue);
				return;
			case CvlPackage.VSPEC_TO_CONFIG_MAPPING__IF_CONSTRAINT:
				setIfConstraint((OpaqueConstraint)newValue);
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
			case CvlPackage.VSPEC_TO_CONFIG_MAPPING__THEN_CONFIGURATION:
				setThenConfiguration((VConfiguration)null);
				return;
			case CvlPackage.VSPEC_TO_CONFIG_MAPPING__IF_CONSTRAINT:
				setIfConstraint((OpaqueConstraint)null);
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
			case CvlPackage.VSPEC_TO_CONFIG_MAPPING__THEN_CONFIGURATION:
				return thenConfiguration != null;
			case CvlPackage.VSPEC_TO_CONFIG_MAPPING__IF_CONSTRAINT:
				return ifConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //VSpecToConfigMappingImpl
