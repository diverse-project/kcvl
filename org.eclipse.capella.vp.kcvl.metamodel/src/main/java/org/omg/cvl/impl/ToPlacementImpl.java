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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.cvl.CvlPackage;
import org.omg.cvl.ObjectHandle;
import org.omg.cvl.ToPlacement;
import org.omg.cvl.ToReplacement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>To Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.impl.ToPlacementImpl#getToReplacement <em>To Replacement</em>}</li>
 *   <li>{@link org.omg.cvl.impl.ToPlacementImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.omg.cvl.impl.ToPlacementImpl#getInsideBoundaryElement <em>Inside Boundary Element</em>}</li>
 *   <li>{@link org.omg.cvl.impl.ToPlacementImpl#getOutsideBoundaryElement <em>Outside Boundary Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToPlacementImpl extends PlacementBoundaryElementImpl implements ToPlacement {
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
	 * The cached value of the '{@link #getInsideBoundaryElement() <em>Inside Boundary Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsideBoundaryElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectHandle> insideBoundaryElement;

	/**
	 * The cached value of the '{@link #getOutsideBoundaryElement() <em>Outside Boundary Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutsideBoundaryElement()
	 * @generated
	 * @ordered
	 */
	protected ObjectHandle outsideBoundaryElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ToPlacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvlPackage.Literals.TO_PLACEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToReplacement getToReplacement() {
		if (eContainerFeatureID() != CvlPackage.TO_PLACEMENT__TO_REPLACEMENT) return null;
		return (ToReplacement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToReplacement(ToReplacement newToReplacement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newToReplacement, CvlPackage.TO_PLACEMENT__TO_REPLACEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToReplacement(ToReplacement newToReplacement) {
		if (newToReplacement != eInternalContainer() || (eContainerFeatureID() != CvlPackage.TO_PLACEMENT__TO_REPLACEMENT && newToReplacement != null)) {
			if (EcoreUtil.isAncestor(this, newToReplacement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newToReplacement != null)
				msgs = ((InternalEObject)newToReplacement).eInverseAdd(this, CvlPackage.TO_REPLACEMENT__TO_PLACEMENT, ToReplacement.class, msgs);
			msgs = basicSetToReplacement(newToReplacement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.TO_PLACEMENT__TO_REPLACEMENT, newToReplacement, newToReplacement));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.TO_PLACEMENT__PROPERTY_NAME, oldPropertyName, propertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectHandle> getInsideBoundaryElement() {
		if (insideBoundaryElement == null) {
			insideBoundaryElement = new EObjectContainmentEList<ObjectHandle>(ObjectHandle.class, this, CvlPackage.TO_PLACEMENT__INSIDE_BOUNDARY_ELEMENT);
		}
		return insideBoundaryElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectHandle getOutsideBoundaryElement() {
		return outsideBoundaryElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutsideBoundaryElement(ObjectHandle newOutsideBoundaryElement, NotificationChain msgs) {
		ObjectHandle oldOutsideBoundaryElement = outsideBoundaryElement;
		outsideBoundaryElement = newOutsideBoundaryElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvlPackage.TO_PLACEMENT__OUTSIDE_BOUNDARY_ELEMENT, oldOutsideBoundaryElement, newOutsideBoundaryElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutsideBoundaryElement(ObjectHandle newOutsideBoundaryElement) {
		if (newOutsideBoundaryElement != outsideBoundaryElement) {
			NotificationChain msgs = null;
			if (outsideBoundaryElement != null)
				msgs = ((InternalEObject)outsideBoundaryElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CvlPackage.TO_PLACEMENT__OUTSIDE_BOUNDARY_ELEMENT, null, msgs);
			if (newOutsideBoundaryElement != null)
				msgs = ((InternalEObject)newOutsideBoundaryElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CvlPackage.TO_PLACEMENT__OUTSIDE_BOUNDARY_ELEMENT, null, msgs);
			msgs = basicSetOutsideBoundaryElement(newOutsideBoundaryElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.TO_PLACEMENT__OUTSIDE_BOUNDARY_ELEMENT, newOutsideBoundaryElement, newOutsideBoundaryElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvlPackage.TO_PLACEMENT__TO_REPLACEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetToReplacement((ToReplacement)otherEnd, msgs);
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
			case CvlPackage.TO_PLACEMENT__TO_REPLACEMENT:
				return basicSetToReplacement(null, msgs);
			case CvlPackage.TO_PLACEMENT__INSIDE_BOUNDARY_ELEMENT:
				return ((InternalEList<?>)getInsideBoundaryElement()).basicRemove(otherEnd, msgs);
			case CvlPackage.TO_PLACEMENT__OUTSIDE_BOUNDARY_ELEMENT:
				return basicSetOutsideBoundaryElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CvlPackage.TO_PLACEMENT__TO_REPLACEMENT:
				return eInternalContainer().eInverseRemove(this, CvlPackage.TO_REPLACEMENT__TO_PLACEMENT, ToReplacement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CvlPackage.TO_PLACEMENT__TO_REPLACEMENT:
				return getToReplacement();
			case CvlPackage.TO_PLACEMENT__PROPERTY_NAME:
				return getPropertyName();
			case CvlPackage.TO_PLACEMENT__INSIDE_BOUNDARY_ELEMENT:
				return getInsideBoundaryElement();
			case CvlPackage.TO_PLACEMENT__OUTSIDE_BOUNDARY_ELEMENT:
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
			case CvlPackage.TO_PLACEMENT__TO_REPLACEMENT:
				setToReplacement((ToReplacement)newValue);
				return;
			case CvlPackage.TO_PLACEMENT__PROPERTY_NAME:
				setPropertyName((String)newValue);
				return;
			case CvlPackage.TO_PLACEMENT__INSIDE_BOUNDARY_ELEMENT:
				getInsideBoundaryElement().clear();
				getInsideBoundaryElement().addAll((Collection<? extends ObjectHandle>)newValue);
				return;
			case CvlPackage.TO_PLACEMENT__OUTSIDE_BOUNDARY_ELEMENT:
				setOutsideBoundaryElement((ObjectHandle)newValue);
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
			case CvlPackage.TO_PLACEMENT__TO_REPLACEMENT:
				setToReplacement((ToReplacement)null);
				return;
			case CvlPackage.TO_PLACEMENT__PROPERTY_NAME:
				setPropertyName(PROPERTY_NAME_EDEFAULT);
				return;
			case CvlPackage.TO_PLACEMENT__INSIDE_BOUNDARY_ELEMENT:
				getInsideBoundaryElement().clear();
				return;
			case CvlPackage.TO_PLACEMENT__OUTSIDE_BOUNDARY_ELEMENT:
				setOutsideBoundaryElement((ObjectHandle)null);
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
			case CvlPackage.TO_PLACEMENT__TO_REPLACEMENT:
				return getToReplacement() != null;
			case CvlPackage.TO_PLACEMENT__PROPERTY_NAME:
				return PROPERTY_NAME_EDEFAULT == null ? propertyName != null : !PROPERTY_NAME_EDEFAULT.equals(propertyName);
			case CvlPackage.TO_PLACEMENT__INSIDE_BOUNDARY_ELEMENT:
				return insideBoundaryElement != null && !insideBoundaryElement.isEmpty();
			case CvlPackage.TO_PLACEMENT__OUTSIDE_BOUNDARY_ELEMENT:
				return outsideBoundaryElement != null;
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

} //ToPlacementImpl
