/**
 */
package org.omg.CVLMetamodelMaster.cvl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.CVLMetamodelMaster.cvl.CVSpecDerivation;
import org.omg.CVLMetamodelMaster.cvl.CvlPackage;
import org.omg.CVLMetamodelMaster.cvl.VSpecDerivation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CV Spec Derivation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.CVSpecDerivationImpl#getMemberDerivation <em>Member Derivation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CVSpecDerivationImpl extends VSpecDerivationImpl implements CVSpecDerivation {
	/**
	 * The cached value of the '{@link #getMemberDerivation() <em>Member Derivation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberDerivation()
	 * @generated
	 * @ordered
	 */
	protected EList<VSpecDerivation> memberDerivation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CVSpecDerivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvlPackage.Literals.CV_SPEC_DERIVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSpecDerivation> getMemberDerivation() {
		if (memberDerivation == null) {
			memberDerivation = new EObjectContainmentEList<VSpecDerivation>(VSpecDerivation.class, this, CvlPackage.CV_SPEC_DERIVATION__MEMBER_DERIVATION);
		}
		return memberDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvlPackage.CV_SPEC_DERIVATION__MEMBER_DERIVATION:
				return ((InternalEList<?>)getMemberDerivation()).basicRemove(otherEnd, msgs);
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
			case CvlPackage.CV_SPEC_DERIVATION__MEMBER_DERIVATION:
				return getMemberDerivation();
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
			case CvlPackage.CV_SPEC_DERIVATION__MEMBER_DERIVATION:
				getMemberDerivation().clear();
				getMemberDerivation().addAll((Collection<? extends VSpecDerivation>)newValue);
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
			case CvlPackage.CV_SPEC_DERIVATION__MEMBER_DERIVATION:
				getMemberDerivation().clear();
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
			case CvlPackage.CV_SPEC_DERIVATION__MEMBER_DERIVATION:
				return memberDerivation != null && !memberDerivation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CVSpecDerivationImpl
