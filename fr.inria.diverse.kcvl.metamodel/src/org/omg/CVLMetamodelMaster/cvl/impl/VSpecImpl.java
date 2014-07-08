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

import org.omg.CVLMetamodelMaster.cvl.CvlPackage;
import org.omg.CVLMetamodelMaster.cvl.MultiplicityInterval;
import org.omg.CVLMetamodelMaster.cvl.VSpec;
import org.omg.CVLMetamodelMaster.cvl.VSpecDerivation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSpec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.VSpecImpl#getGroupMultiplicity <em>Group Multiplicity</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.VSpecImpl#getResolutionTime <em>Resolution Time</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.VSpecImpl#getOwnedVSpecDerivation <em>Owned VSpec Derivation</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.VSpecImpl#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VSpecImpl extends VPackageableImpl implements VSpec {
	/**
	 * The cached value of the '{@link #getGroupMultiplicity() <em>Group Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected MultiplicityInterval groupMultiplicity;

	/**
	 * The default value of the '{@link #getResolutionTime() <em>Resolution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionTime()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLUTION_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolutionTime() <em>Resolution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolutionTime()
	 * @generated
	 * @ordered
	 */
	protected String resolutionTime = RESOLUTION_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedVSpecDerivation() <em>Owned VSpec Derivation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedVSpecDerivation()
	 * @generated
	 * @ordered
	 */
	protected VSpecDerivation ownedVSpecDerivation;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected EList<VSpec> child;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvlPackage.Literals.VSPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityInterval getGroupMultiplicity() {
		return groupMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupMultiplicity(MultiplicityInterval newGroupMultiplicity, NotificationChain msgs) {
		MultiplicityInterval oldGroupMultiplicity = groupMultiplicity;
		groupMultiplicity = newGroupMultiplicity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvlPackage.VSPEC__GROUP_MULTIPLICITY, oldGroupMultiplicity, newGroupMultiplicity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupMultiplicity(MultiplicityInterval newGroupMultiplicity) {
		if (newGroupMultiplicity != groupMultiplicity) {
			NotificationChain msgs = null;
			if (groupMultiplicity != null)
				msgs = ((InternalEObject)groupMultiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CvlPackage.VSPEC__GROUP_MULTIPLICITY, null, msgs);
			if (newGroupMultiplicity != null)
				msgs = ((InternalEObject)newGroupMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CvlPackage.VSPEC__GROUP_MULTIPLICITY, null, msgs);
			msgs = basicSetGroupMultiplicity(newGroupMultiplicity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.VSPEC__GROUP_MULTIPLICITY, newGroupMultiplicity, newGroupMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResolutionTime() {
		return resolutionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolutionTime(String newResolutionTime) {
		String oldResolutionTime = resolutionTime;
		resolutionTime = newResolutionTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.VSPEC__RESOLUTION_TIME, oldResolutionTime, resolutionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSpecDerivation getOwnedVSpecDerivation() {
		return ownedVSpecDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedVSpecDerivation(VSpecDerivation newOwnedVSpecDerivation, NotificationChain msgs) {
		VSpecDerivation oldOwnedVSpecDerivation = ownedVSpecDerivation;
		ownedVSpecDerivation = newOwnedVSpecDerivation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvlPackage.VSPEC__OWNED_VSPEC_DERIVATION, oldOwnedVSpecDerivation, newOwnedVSpecDerivation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedVSpecDerivation(VSpecDerivation newOwnedVSpecDerivation) {
		if (newOwnedVSpecDerivation != ownedVSpecDerivation) {
			NotificationChain msgs = null;
			if (ownedVSpecDerivation != null)
				msgs = ((InternalEObject)ownedVSpecDerivation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CvlPackage.VSPEC__OWNED_VSPEC_DERIVATION, null, msgs);
			if (newOwnedVSpecDerivation != null)
				msgs = ((InternalEObject)newOwnedVSpecDerivation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CvlPackage.VSPEC__OWNED_VSPEC_DERIVATION, null, msgs);
			msgs = basicSetOwnedVSpecDerivation(newOwnedVSpecDerivation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.VSPEC__OWNED_VSPEC_DERIVATION, newOwnedVSpecDerivation, newOwnedVSpecDerivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSpec> getChild() {
		if (child == null) {
			child = new EObjectContainmentEList<VSpec>(VSpec.class, this, CvlPackage.VSPEC__CHILD);
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvlPackage.VSPEC__GROUP_MULTIPLICITY:
				return basicSetGroupMultiplicity(null, msgs);
			case CvlPackage.VSPEC__OWNED_VSPEC_DERIVATION:
				return basicSetOwnedVSpecDerivation(null, msgs);
			case CvlPackage.VSPEC__CHILD:
				return ((InternalEList<?>)getChild()).basicRemove(otherEnd, msgs);
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
			case CvlPackage.VSPEC__GROUP_MULTIPLICITY:
				return getGroupMultiplicity();
			case CvlPackage.VSPEC__RESOLUTION_TIME:
				return getResolutionTime();
			case CvlPackage.VSPEC__OWNED_VSPEC_DERIVATION:
				return getOwnedVSpecDerivation();
			case CvlPackage.VSPEC__CHILD:
				return getChild();
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
			case CvlPackage.VSPEC__GROUP_MULTIPLICITY:
				setGroupMultiplicity((MultiplicityInterval)newValue);
				return;
			case CvlPackage.VSPEC__RESOLUTION_TIME:
				setResolutionTime((String)newValue);
				return;
			case CvlPackage.VSPEC__OWNED_VSPEC_DERIVATION:
				setOwnedVSpecDerivation((VSpecDerivation)newValue);
				return;
			case CvlPackage.VSPEC__CHILD:
				getChild().clear();
				getChild().addAll((Collection<? extends VSpec>)newValue);
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
			case CvlPackage.VSPEC__GROUP_MULTIPLICITY:
				setGroupMultiplicity((MultiplicityInterval)null);
				return;
			case CvlPackage.VSPEC__RESOLUTION_TIME:
				setResolutionTime(RESOLUTION_TIME_EDEFAULT);
				return;
			case CvlPackage.VSPEC__OWNED_VSPEC_DERIVATION:
				setOwnedVSpecDerivation((VSpecDerivation)null);
				return;
			case CvlPackage.VSPEC__CHILD:
				getChild().clear();
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
			case CvlPackage.VSPEC__GROUP_MULTIPLICITY:
				return groupMultiplicity != null;
			case CvlPackage.VSPEC__RESOLUTION_TIME:
				return RESOLUTION_TIME_EDEFAULT == null ? resolutionTime != null : !RESOLUTION_TIME_EDEFAULT.equals(resolutionTime);
			case CvlPackage.VSPEC__OWNED_VSPEC_DERIVATION:
				return ownedVSpecDerivation != null;
			case CvlPackage.VSPEC__CHILD:
				return child != null && !child.isEmpty();
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
		result.append(" (resolutionTime: ");
		result.append(resolutionTime);
		result.append(')');
		return result.toString();
	}

} //VSpecImpl
