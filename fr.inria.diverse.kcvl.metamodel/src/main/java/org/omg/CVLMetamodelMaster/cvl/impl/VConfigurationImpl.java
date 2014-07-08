/**
 */
package org.omg.CVLMetamodelMaster.cvl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.CVLMetamodelMaster.cvl.CVSpec;
import org.omg.CVLMetamodelMaster.cvl.CvlPackage;
import org.omg.CVLMetamodelMaster.cvl.VConfiguration;
import org.omg.CVLMetamodelMaster.cvl.VSpecResolution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VConfiguration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.VConfigurationImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.VConfigurationImpl#isIsPartial <em>Is Partial</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.VConfigurationImpl#getSuper <em>Super</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.VConfigurationImpl#getResolvedVIRef <em>Resolved VI Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VConfigurationImpl extends VSpecResolutionImpl implements VConfiguration {
	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<VSpecResolution> member;

	/**
	 * The default value of the '{@link #isIsPartial() <em>Is Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPartial()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PARTIAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPartial() <em>Is Partial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPartial()
	 * @generated
	 * @ordered
	 */
	protected boolean isPartial = IS_PARTIAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuper() <em>Super</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuper()
	 * @generated
	 * @ordered
	 */
	protected VConfiguration super_;

	/**
	 * The cached value of the '{@link #getResolvedVIRef() <em>Resolved VI Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedVIRef()
	 * @generated
	 * @ordered
	 */
	protected CVSpec resolvedVIRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvlPackage.Literals.VCONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSpecResolution> getMember() {
		if (member == null) {
			member = new EObjectContainmentEList<VSpecResolution>(VSpecResolution.class, this, CvlPackage.VCONFIGURATION__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPartial() {
		return isPartial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPartial(boolean newIsPartial) {
		boolean oldIsPartial = isPartial;
		isPartial = newIsPartial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.VCONFIGURATION__IS_PARTIAL, oldIsPartial, isPartial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VConfiguration getSuper() {
		if (super_ != null && super_.eIsProxy()) {
			InternalEObject oldSuper = (InternalEObject)super_;
			super_ = (VConfiguration)eResolveProxy(oldSuper);
			if (super_ != oldSuper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CvlPackage.VCONFIGURATION__SUPER, oldSuper, super_));
			}
		}
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VConfiguration basicGetSuper() {
		return super_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuper(VConfiguration newSuper) {
		VConfiguration oldSuper = super_;
		super_ = newSuper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.VCONFIGURATION__SUPER, oldSuper, super_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVSpec getResolvedVIRef() {
		if (resolvedVIRef != null && resolvedVIRef.eIsProxy()) {
			InternalEObject oldResolvedVIRef = (InternalEObject)resolvedVIRef;
			resolvedVIRef = (CVSpec)eResolveProxy(oldResolvedVIRef);
			if (resolvedVIRef != oldResolvedVIRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CvlPackage.VCONFIGURATION__RESOLVED_VI_REF, oldResolvedVIRef, resolvedVIRef));
			}
		}
		return resolvedVIRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVSpec basicGetResolvedVIRef() {
		return resolvedVIRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolvedVIRef(CVSpec newResolvedVIRef) {
		CVSpec oldResolvedVIRef = resolvedVIRef;
		resolvedVIRef = newResolvedVIRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.VCONFIGURATION__RESOLVED_VI_REF, oldResolvedVIRef, resolvedVIRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvlPackage.VCONFIGURATION__MEMBER:
				return ((InternalEList<?>)getMember()).basicRemove(otherEnd, msgs);
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
			case CvlPackage.VCONFIGURATION__MEMBER:
				return getMember();
			case CvlPackage.VCONFIGURATION__IS_PARTIAL:
				return isIsPartial();
			case CvlPackage.VCONFIGURATION__SUPER:
				if (resolve) return getSuper();
				return basicGetSuper();
			case CvlPackage.VCONFIGURATION__RESOLVED_VI_REF:
				if (resolve) return getResolvedVIRef();
				return basicGetResolvedVIRef();
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
			case CvlPackage.VCONFIGURATION__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends VSpecResolution>)newValue);
				return;
			case CvlPackage.VCONFIGURATION__IS_PARTIAL:
				setIsPartial((Boolean)newValue);
				return;
			case CvlPackage.VCONFIGURATION__SUPER:
				setSuper((VConfiguration)newValue);
				return;
			case CvlPackage.VCONFIGURATION__RESOLVED_VI_REF:
				setResolvedVIRef((CVSpec)newValue);
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
			case CvlPackage.VCONFIGURATION__MEMBER:
				getMember().clear();
				return;
			case CvlPackage.VCONFIGURATION__IS_PARTIAL:
				setIsPartial(IS_PARTIAL_EDEFAULT);
				return;
			case CvlPackage.VCONFIGURATION__SUPER:
				setSuper((VConfiguration)null);
				return;
			case CvlPackage.VCONFIGURATION__RESOLVED_VI_REF:
				setResolvedVIRef((CVSpec)null);
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
			case CvlPackage.VCONFIGURATION__MEMBER:
				return member != null && !member.isEmpty();
			case CvlPackage.VCONFIGURATION__IS_PARTIAL:
				return isPartial != IS_PARTIAL_EDEFAULT;
			case CvlPackage.VCONFIGURATION__SUPER:
				return super_ != null;
			case CvlPackage.VCONFIGURATION__RESOLVED_VI_REF:
				return resolvedVIRef != null;
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
		result.append(" (isPartial: ");
		result.append(isPartial);
		result.append(')');
		return result.toString();
	}

} //VConfigurationImpl
