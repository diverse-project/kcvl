/**
 */
package org.omg.cvl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.cvl.ConfigurableUnit;
import org.omg.cvl.Constraint;
import org.omg.cvl.CvlPackage;
import org.omg.cvl.ObjectHandle;
import org.omg.cvl.VInterface;
import org.omg.cvl.VSpec;
import org.omg.cvl.VSpecResolution;
import org.omg.cvl.VariationPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configurable Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.impl.ConfigurableUnitImpl#getOwnedVSpec <em>Owned VSpec</em>}</li>
 *   <li>{@link org.omg.cvl.impl.ConfigurableUnitImpl#getOwnedVariationPoint <em>Owned Variation Point</em>}</li>
 *   <li>{@link org.omg.cvl.impl.ConfigurableUnitImpl#getOwnedConstraint <em>Owned Constraint</em>}</li>
 *   <li>{@link org.omg.cvl.impl.ConfigurableUnitImpl#getConfigurableContainerObject <em>Configurable Container Object</em>}</li>
 *   <li>{@link org.omg.cvl.impl.ConfigurableUnitImpl#getOwnedVSpecResolution <em>Owned VSpec Resolution</em>}</li>
 *   <li>{@link org.omg.cvl.impl.ConfigurableUnitImpl#getUnitInterface <em>Unit Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurableUnitImpl extends CompositeVariationPointImpl implements ConfigurableUnit {
	/**
	 * The cached value of the '{@link #getOwnedVSpec() <em>Owned VSpec</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedVSpec()
	 * @generated
	 * @ordered
	 */
	protected EList<VSpec> ownedVSpec;

	/**
	 * The cached value of the '{@link #getOwnedVariationPoint() <em>Owned Variation Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedVariationPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<VariationPoint> ownedVariationPoint;

	/**
	 * The cached value of the '{@link #getOwnedConstraint() <em>Owned Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> ownedConstraint;

	/**
	 * The cached value of the '{@link #getConfigurableContainerObject() <em>Configurable Container Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurableContainerObject()
	 * @generated
	 * @ordered
	 */
	protected ObjectHandle configurableContainerObject;

	/**
	 * The cached value of the '{@link #getOwnedVSpecResolution() <em>Owned VSpec Resolution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedVSpecResolution()
	 * @generated
	 * @ordered
	 */
	protected EList<VSpecResolution> ownedVSpecResolution;

	/**
	 * The cached value of the '{@link #getUnitInterface() <em>Unit Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitInterface()
	 * @generated
	 * @ordered
	 */
	protected VInterface unitInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurableUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvlPackage.Literals.CONFIGURABLE_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSpec> getOwnedVSpec() {
		if (ownedVSpec == null) {
			ownedVSpec = new EObjectContainmentEList<VSpec>(VSpec.class, this, CvlPackage.CONFIGURABLE_UNIT__OWNED_VSPEC);
		}
		return ownedVSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariationPoint> getOwnedVariationPoint() {
		if (ownedVariationPoint == null) {
			ownedVariationPoint = new EObjectContainmentEList<VariationPoint>(VariationPoint.class, this, CvlPackage.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT);
		}
		return ownedVariationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getOwnedConstraint() {
		if (ownedConstraint == null) {
			ownedConstraint = new EObjectContainmentEList<Constraint>(Constraint.class, this, CvlPackage.CONFIGURABLE_UNIT__OWNED_CONSTRAINT);
		}
		return ownedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectHandle getConfigurableContainerObject() {
		return configurableContainerObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurableContainerObject(ObjectHandle newConfigurableContainerObject, NotificationChain msgs) {
		ObjectHandle oldConfigurableContainerObject = configurableContainerObject;
		configurableContainerObject = newConfigurableContainerObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvlPackage.CONFIGURABLE_UNIT__CONFIGURABLE_CONTAINER_OBJECT, oldConfigurableContainerObject, newConfigurableContainerObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurableContainerObject(ObjectHandle newConfigurableContainerObject) {
		if (newConfigurableContainerObject != configurableContainerObject) {
			NotificationChain msgs = null;
			if (configurableContainerObject != null)
				msgs = ((InternalEObject)configurableContainerObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CvlPackage.CONFIGURABLE_UNIT__CONFIGURABLE_CONTAINER_OBJECT, null, msgs);
			if (newConfigurableContainerObject != null)
				msgs = ((InternalEObject)newConfigurableContainerObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CvlPackage.CONFIGURABLE_UNIT__CONFIGURABLE_CONTAINER_OBJECT, null, msgs);
			msgs = basicSetConfigurableContainerObject(newConfigurableContainerObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.CONFIGURABLE_UNIT__CONFIGURABLE_CONTAINER_OBJECT, newConfigurableContainerObject, newConfigurableContainerObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSpecResolution> getOwnedVSpecResolution() {
		if (ownedVSpecResolution == null) {
			ownedVSpecResolution = new EObjectContainmentEList<VSpecResolution>(VSpecResolution.class, this, CvlPackage.CONFIGURABLE_UNIT__OWNED_VSPEC_RESOLUTION);
		}
		return ownedVSpecResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VInterface getUnitInterface() {
		if (unitInterface != null && unitInterface.eIsProxy()) {
			InternalEObject oldUnitInterface = (InternalEObject)unitInterface;
			unitInterface = (VInterface)eResolveProxy(oldUnitInterface);
			if (unitInterface != oldUnitInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CvlPackage.CONFIGURABLE_UNIT__UNIT_INTERFACE, oldUnitInterface, unitInterface));
			}
		}
		return unitInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VInterface basicGetUnitInterface() {
		return unitInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitInterface(VInterface newUnitInterface) {
		VInterface oldUnitInterface = unitInterface;
		unitInterface = newUnitInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.CONFIGURABLE_UNIT__UNIT_INTERFACE, oldUnitInterface, unitInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_VSPEC:
				return ((InternalEList<?>)getOwnedVSpec()).basicRemove(otherEnd, msgs);
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT:
				return ((InternalEList<?>)getOwnedVariationPoint()).basicRemove(otherEnd, msgs);
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_CONSTRAINT:
				return ((InternalEList<?>)getOwnedConstraint()).basicRemove(otherEnd, msgs);
			case CvlPackage.CONFIGURABLE_UNIT__CONFIGURABLE_CONTAINER_OBJECT:
				return basicSetConfigurableContainerObject(null, msgs);
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_VSPEC_RESOLUTION:
				return ((InternalEList<?>)getOwnedVSpecResolution()).basicRemove(otherEnd, msgs);
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
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_VSPEC:
				return getOwnedVSpec();
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT:
				return getOwnedVariationPoint();
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_CONSTRAINT:
				return getOwnedConstraint();
			case CvlPackage.CONFIGURABLE_UNIT__CONFIGURABLE_CONTAINER_OBJECT:
				return getConfigurableContainerObject();
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_VSPEC_RESOLUTION:
				return getOwnedVSpecResolution();
			case CvlPackage.CONFIGURABLE_UNIT__UNIT_INTERFACE:
				if (resolve) return getUnitInterface();
				return basicGetUnitInterface();
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
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_VSPEC:
				getOwnedVSpec().clear();
				getOwnedVSpec().addAll((Collection<? extends VSpec>)newValue);
				return;
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT:
				getOwnedVariationPoint().clear();
				getOwnedVariationPoint().addAll((Collection<? extends VariationPoint>)newValue);
				return;
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_CONSTRAINT:
				getOwnedConstraint().clear();
				getOwnedConstraint().addAll((Collection<? extends Constraint>)newValue);
				return;
			case CvlPackage.CONFIGURABLE_UNIT__CONFIGURABLE_CONTAINER_OBJECT:
				setConfigurableContainerObject((ObjectHandle)newValue);
				return;
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_VSPEC_RESOLUTION:
				getOwnedVSpecResolution().clear();
				getOwnedVSpecResolution().addAll((Collection<? extends VSpecResolution>)newValue);
				return;
			case CvlPackage.CONFIGURABLE_UNIT__UNIT_INTERFACE:
				setUnitInterface((VInterface)newValue);
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
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_VSPEC:
				getOwnedVSpec().clear();
				return;
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT:
				getOwnedVariationPoint().clear();
				return;
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_CONSTRAINT:
				getOwnedConstraint().clear();
				return;
			case CvlPackage.CONFIGURABLE_UNIT__CONFIGURABLE_CONTAINER_OBJECT:
				setConfigurableContainerObject((ObjectHandle)null);
				return;
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_VSPEC_RESOLUTION:
				getOwnedVSpecResolution().clear();
				return;
			case CvlPackage.CONFIGURABLE_UNIT__UNIT_INTERFACE:
				setUnitInterface((VInterface)null);
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
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_VSPEC:
				return ownedVSpec != null && !ownedVSpec.isEmpty();
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_VARIATION_POINT:
				return ownedVariationPoint != null && !ownedVariationPoint.isEmpty();
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_CONSTRAINT:
				return ownedConstraint != null && !ownedConstraint.isEmpty();
			case CvlPackage.CONFIGURABLE_UNIT__CONFIGURABLE_CONTAINER_OBJECT:
				return configurableContainerObject != null;
			case CvlPackage.CONFIGURABLE_UNIT__OWNED_VSPEC_RESOLUTION:
				return ownedVSpecResolution != null && !ownedVSpecResolution.isEmpty();
			case CvlPackage.CONFIGURABLE_UNIT__UNIT_INTERFACE:
				return unitInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigurableUnitImpl
