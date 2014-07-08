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
import org.omg.CVLMetamodelMaster.cvl.FromPlacement;
import org.omg.CVLMetamodelMaster.cvl.FromReplacement;
import org.omg.CVLMetamodelMaster.cvl.ObjectHandle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>From Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.FromPlacementImpl#getFromReplacement <em>From Replacement</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.FromPlacementImpl#getOutsideBoundaryElement <em>Outside Boundary Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FromPlacementImpl extends PlacementBoundaryElementImpl implements FromPlacement {
	/**
	 * The cached value of the '{@link #getFromReplacement() <em>From Replacement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromReplacement()
	 * @generated
	 * @ordered
	 */
	protected FromReplacement fromReplacement;

	/**
	 * The cached value of the '{@link #getOutsideBoundaryElement() <em>Outside Boundary Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutsideBoundaryElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectHandle> outsideBoundaryElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FromPlacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvlPackage.Literals.FROM_PLACEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromReplacement getFromReplacement() {
		if (fromReplacement != null && fromReplacement.eIsProxy()) {
			InternalEObject oldFromReplacement = (InternalEObject)fromReplacement;
			fromReplacement = (FromReplacement)eResolveProxy(oldFromReplacement);
			if (fromReplacement != oldFromReplacement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CvlPackage.FROM_PLACEMENT__FROM_REPLACEMENT, oldFromReplacement, fromReplacement));
			}
		}
		return fromReplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromReplacement basicGetFromReplacement() {
		return fromReplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromReplacement(FromReplacement newFromReplacement, NotificationChain msgs) {
		FromReplacement oldFromReplacement = fromReplacement;
		fromReplacement = newFromReplacement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvlPackage.FROM_PLACEMENT__FROM_REPLACEMENT, oldFromReplacement, newFromReplacement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromReplacement(FromReplacement newFromReplacement) {
		if (newFromReplacement != fromReplacement) {
			NotificationChain msgs = null;
			if (fromReplacement != null)
				msgs = ((InternalEObject)fromReplacement).eInverseRemove(this, CvlPackage.FROM_REPLACEMENT__FROM_PLACEMENT, FromReplacement.class, msgs);
			if (newFromReplacement != null)
				msgs = ((InternalEObject)newFromReplacement).eInverseAdd(this, CvlPackage.FROM_REPLACEMENT__FROM_PLACEMENT, FromReplacement.class, msgs);
			msgs = basicSetFromReplacement(newFromReplacement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.FROM_PLACEMENT__FROM_REPLACEMENT, newFromReplacement, newFromReplacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectHandle> getOutsideBoundaryElement() {
		if (outsideBoundaryElement == null) {
			outsideBoundaryElement = new EObjectContainmentEList<ObjectHandle>(ObjectHandle.class, this, CvlPackage.FROM_PLACEMENT__OUTSIDE_BOUNDARY_ELEMENT);
		}
		return outsideBoundaryElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvlPackage.FROM_PLACEMENT__FROM_REPLACEMENT:
				if (fromReplacement != null)
					msgs = ((InternalEObject)fromReplacement).eInverseRemove(this, CvlPackage.FROM_REPLACEMENT__FROM_PLACEMENT, FromReplacement.class, msgs);
				return basicSetFromReplacement((FromReplacement)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvlPackage.FROM_PLACEMENT__FROM_REPLACEMENT:
				return basicSetFromReplacement(null, msgs);
			case CvlPackage.FROM_PLACEMENT__OUTSIDE_BOUNDARY_ELEMENT:
				return ((InternalEList<?>)getOutsideBoundaryElement()).basicRemove(otherEnd, msgs);
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
			case CvlPackage.FROM_PLACEMENT__FROM_REPLACEMENT:
				if (resolve) return getFromReplacement();
				return basicGetFromReplacement();
			case CvlPackage.FROM_PLACEMENT__OUTSIDE_BOUNDARY_ELEMENT:
				return getOutsideBoundaryElement();
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
			case CvlPackage.FROM_PLACEMENT__FROM_REPLACEMENT:
				setFromReplacement((FromReplacement)newValue);
				return;
			case CvlPackage.FROM_PLACEMENT__OUTSIDE_BOUNDARY_ELEMENT:
				getOutsideBoundaryElement().clear();
				getOutsideBoundaryElement().addAll((Collection<? extends ObjectHandle>)newValue);
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
			case CvlPackage.FROM_PLACEMENT__FROM_REPLACEMENT:
				setFromReplacement((FromReplacement)null);
				return;
			case CvlPackage.FROM_PLACEMENT__OUTSIDE_BOUNDARY_ELEMENT:
				getOutsideBoundaryElement().clear();
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
			case CvlPackage.FROM_PLACEMENT__FROM_REPLACEMENT:
				return fromReplacement != null;
			case CvlPackage.FROM_PLACEMENT__OUTSIDE_BOUNDARY_ELEMENT:
				return outsideBoundaryElement != null && !outsideBoundaryElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FromPlacementImpl
