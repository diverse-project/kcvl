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

import org.omg.cvl.CvlPackage;
import org.omg.cvl.FromPlacement;
import org.omg.cvl.FromReplacement;
import org.omg.cvl.ObjectHandle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>From Replacement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.impl.FromReplacementImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.omg.cvl.impl.FromReplacementImpl#getInsideBoundaryElement <em>Inside Boundary Element</em>}</li>
 *   <li>{@link org.omg.cvl.impl.FromReplacementImpl#getOutsideBoundaryElement <em>Outside Boundary Element</em>}</li>
 *   <li>{@link org.omg.cvl.impl.FromReplacementImpl#getFromPlacement <em>From Placement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FromReplacementImpl extends ReplacementBoundaryElementImpl implements FromReplacement {
	/**
	 * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected String propertyName = PROPERTY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInsideBoundaryElement() <em>Inside Boundary Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsideBoundaryElement()
	 * @generated
	 * @ordered
	 */
	protected ObjectHandle insideBoundaryElement;

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
	 * The cached value of the '{@link #getFromPlacement() <em>From Placement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPlacement()
	 * @generated
	 * @ordered
	 */
	protected FromPlacement fromPlacement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FromReplacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvlPackage.Literals.FROM_REPLACEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyName(String newPropertyName) {
		String oldPropertyName = propertyName;
		propertyName = newPropertyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.FROM_REPLACEMENT__PROPERTY_NAME, oldPropertyName, propertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectHandle getInsideBoundaryElement() {
		return insideBoundaryElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsideBoundaryElement(ObjectHandle newInsideBoundaryElement, NotificationChain msgs) {
		ObjectHandle oldInsideBoundaryElement = insideBoundaryElement;
		insideBoundaryElement = newInsideBoundaryElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvlPackage.FROM_REPLACEMENT__INSIDE_BOUNDARY_ELEMENT, oldInsideBoundaryElement, newInsideBoundaryElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsideBoundaryElement(ObjectHandle newInsideBoundaryElement) {
		if (newInsideBoundaryElement != insideBoundaryElement) {
			NotificationChain msgs = null;
			if (insideBoundaryElement != null)
				msgs = ((InternalEObject)insideBoundaryElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CvlPackage.FROM_REPLACEMENT__INSIDE_BOUNDARY_ELEMENT, null, msgs);
			if (newInsideBoundaryElement != null)
				msgs = ((InternalEObject)newInsideBoundaryElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CvlPackage.FROM_REPLACEMENT__INSIDE_BOUNDARY_ELEMENT, null, msgs);
			msgs = basicSetInsideBoundaryElement(newInsideBoundaryElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.FROM_REPLACEMENT__INSIDE_BOUNDARY_ELEMENT, newInsideBoundaryElement, newInsideBoundaryElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectHandle> getOutsideBoundaryElement() {
		if (outsideBoundaryElement == null) {
			outsideBoundaryElement = new EObjectContainmentEList<ObjectHandle>(ObjectHandle.class, this, CvlPackage.FROM_REPLACEMENT__OUTSIDE_BOUNDARY_ELEMENT);
		}
		return outsideBoundaryElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromPlacement getFromPlacement() {
		if (fromPlacement != null && fromPlacement.eIsProxy()) {
			InternalEObject oldFromPlacement = (InternalEObject)fromPlacement;
			fromPlacement = (FromPlacement)eResolveProxy(oldFromPlacement);
			if (fromPlacement != oldFromPlacement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CvlPackage.FROM_REPLACEMENT__FROM_PLACEMENT, oldFromPlacement, fromPlacement));
			}
		}
		return fromPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FromPlacement basicGetFromPlacement() {
		return fromPlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromPlacement(FromPlacement newFromPlacement, NotificationChain msgs) {
		FromPlacement oldFromPlacement = fromPlacement;
		fromPlacement = newFromPlacement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvlPackage.FROM_REPLACEMENT__FROM_PLACEMENT, oldFromPlacement, newFromPlacement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromPlacement(FromPlacement newFromPlacement) {
		if (newFromPlacement != fromPlacement) {
			NotificationChain msgs = null;
			if (fromPlacement != null)
				msgs = ((InternalEObject)fromPlacement).eInverseRemove(this, CvlPackage.FROM_PLACEMENT__FROM_REPLACEMENT, FromPlacement.class, msgs);
			if (newFromPlacement != null)
				msgs = ((InternalEObject)newFromPlacement).eInverseAdd(this, CvlPackage.FROM_PLACEMENT__FROM_REPLACEMENT, FromPlacement.class, msgs);
			msgs = basicSetFromPlacement(newFromPlacement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.FROM_REPLACEMENT__FROM_PLACEMENT, newFromPlacement, newFromPlacement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvlPackage.FROM_REPLACEMENT__FROM_PLACEMENT:
				if (fromPlacement != null)
					msgs = ((InternalEObject)fromPlacement).eInverseRemove(this, CvlPackage.FROM_PLACEMENT__FROM_REPLACEMENT, FromPlacement.class, msgs);
				return basicSetFromPlacement((FromPlacement)otherEnd, msgs);
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
			case CvlPackage.FROM_REPLACEMENT__INSIDE_BOUNDARY_ELEMENT:
				return basicSetInsideBoundaryElement(null, msgs);
			case CvlPackage.FROM_REPLACEMENT__OUTSIDE_BOUNDARY_ELEMENT:
				return ((InternalEList<?>)getOutsideBoundaryElement()).basicRemove(otherEnd, msgs);
			case CvlPackage.FROM_REPLACEMENT__FROM_PLACEMENT:
				return basicSetFromPlacement(null, msgs);
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
			case CvlPackage.FROM_REPLACEMENT__PROPERTY_NAME:
				return getPropertyName();
			case CvlPackage.FROM_REPLACEMENT__INSIDE_BOUNDARY_ELEMENT:
				return getInsideBoundaryElement();
			case CvlPackage.FROM_REPLACEMENT__OUTSIDE_BOUNDARY_ELEMENT:
				return getOutsideBoundaryElement();
			case CvlPackage.FROM_REPLACEMENT__FROM_PLACEMENT:
				if (resolve) return getFromPlacement();
				return basicGetFromPlacement();
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
			case CvlPackage.FROM_REPLACEMENT__PROPERTY_NAME:
				setPropertyName((String)newValue);
				return;
			case CvlPackage.FROM_REPLACEMENT__INSIDE_BOUNDARY_ELEMENT:
				setInsideBoundaryElement((ObjectHandle)newValue);
				return;
			case CvlPackage.FROM_REPLACEMENT__OUTSIDE_BOUNDARY_ELEMENT:
				getOutsideBoundaryElement().clear();
				getOutsideBoundaryElement().addAll((Collection<? extends ObjectHandle>)newValue);
				return;
			case CvlPackage.FROM_REPLACEMENT__FROM_PLACEMENT:
				setFromPlacement((FromPlacement)newValue);
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
			case CvlPackage.FROM_REPLACEMENT__PROPERTY_NAME:
				setPropertyName(PROPERTY_NAME_EDEFAULT);
				return;
			case CvlPackage.FROM_REPLACEMENT__INSIDE_BOUNDARY_ELEMENT:
				setInsideBoundaryElement((ObjectHandle)null);
				return;
			case CvlPackage.FROM_REPLACEMENT__OUTSIDE_BOUNDARY_ELEMENT:
				getOutsideBoundaryElement().clear();
				return;
			case CvlPackage.FROM_REPLACEMENT__FROM_PLACEMENT:
				setFromPlacement((FromPlacement)null);
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
			case CvlPackage.FROM_REPLACEMENT__PROPERTY_NAME:
				return PROPERTY_NAME_EDEFAULT == null ? propertyName != null : !PROPERTY_NAME_EDEFAULT.equals(propertyName);
			case CvlPackage.FROM_REPLACEMENT__INSIDE_BOUNDARY_ELEMENT:
				return insideBoundaryElement != null;
			case CvlPackage.FROM_REPLACEMENT__OUTSIDE_BOUNDARY_ELEMENT:
				return outsideBoundaryElement != null && !outsideBoundaryElement.isEmpty();
			case CvlPackage.FROM_REPLACEMENT__FROM_PLACEMENT:
				return fromPlacement != null;
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
		result.append(" (propertyName: ");
		result.append(propertyName);
		result.append(')');
		return result.toString();
	}

} //FromReplacementImpl
