/**
 */
package org.omg.CVLMetamodelMaster.cvl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.CVLMetamodelMaster.cvl.CvlPackage;
import org.omg.CVLMetamodelMaster.cvl.OpaqueConstraint;
import org.omg.CVLMetamodelMaster.cvl.VSpec2VSpecMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSpec2 VSpec Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.VSpec2VSpecMappingImpl#getDerivingConstraint <em>Deriving Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VSpec2VSpecMappingImpl extends EObjectImpl implements VSpec2VSpecMapping {
	/**
	 * The cached value of the '{@link #getDerivingConstraint() <em>Deriving Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivingConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<OpaqueConstraint> derivingConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSpec2VSpecMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvlPackage.Literals.VSPEC2_VSPEC_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OpaqueConstraint> getDerivingConstraint() {
		if (derivingConstraint == null) {
			derivingConstraint = new EObjectContainmentEList<OpaqueConstraint>(OpaqueConstraint.class, this, CvlPackage.VSPEC2_VSPEC_MAPPING__DERIVING_CONSTRAINT);
		}
		return derivingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvlPackage.VSPEC2_VSPEC_MAPPING__DERIVING_CONSTRAINT:
				return ((InternalEList<?>)getDerivingConstraint()).basicRemove(otherEnd, msgs);
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
			case CvlPackage.VSPEC2_VSPEC_MAPPING__DERIVING_CONSTRAINT:
				return getDerivingConstraint();
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
			case CvlPackage.VSPEC2_VSPEC_MAPPING__DERIVING_CONSTRAINT:
				getDerivingConstraint().clear();
				getDerivingConstraint().addAll((Collection<? extends OpaqueConstraint>)newValue);
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
			case CvlPackage.VSPEC2_VSPEC_MAPPING__DERIVING_CONSTRAINT:
				getDerivingConstraint().clear();
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
			case CvlPackage.VSPEC2_VSPEC_MAPPING__DERIVING_CONSTRAINT:
				return derivingConstraint != null && !derivingConstraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VSpec2VSpecMappingImpl
