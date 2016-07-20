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

import org.omg.cvl.CVSpec;
import org.omg.cvl.CompositeVariationPoint;
import org.omg.cvl.CvlPackage;
import org.omg.cvl.VariationPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Variation Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.cvl.impl.CompositeVariationPointImpl#getBindingCVSpec <em>Binding CV Spec</em>}</li>
 *   <li>{@link org.omg.cvl.impl.CompositeVariationPointImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeVariationPointImpl extends VariationPointImpl implements CompositeVariationPoint {
	/**
	 * The cached value of the '{@link #getBindingCVSpec() <em>Binding CV Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingCVSpec()
	 * @generated
	 * @ordered
	 */
	protected CVSpec bindingCVSpec;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<VariationPoint> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeVariationPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvlPackage.Literals.COMPOSITE_VARIATION_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVSpec getBindingCVSpec() {
		if (bindingCVSpec != null && bindingCVSpec.eIsProxy()) {
			InternalEObject oldBindingCVSpec = (InternalEObject)bindingCVSpec;
			bindingCVSpec = (CVSpec)eResolveProxy(oldBindingCVSpec);
			if (bindingCVSpec != oldBindingCVSpec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CvlPackage.COMPOSITE_VARIATION_POINT__BINDING_CV_SPEC, oldBindingCVSpec, bindingCVSpec));
			}
		}
		return bindingCVSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVSpec basicGetBindingCVSpec() {
		return bindingCVSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingCVSpec(CVSpec newBindingCVSpec) {
		CVSpec oldBindingCVSpec = bindingCVSpec;
		bindingCVSpec = newBindingCVSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.COMPOSITE_VARIATION_POINT__BINDING_CV_SPEC, oldBindingCVSpec, bindingCVSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariationPoint> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<VariationPoint>(VariationPoint.class, this, CvlPackage.COMPOSITE_VARIATION_POINT__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvlPackage.COMPOSITE_VARIATION_POINT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case CvlPackage.COMPOSITE_VARIATION_POINT__BINDING_CV_SPEC:
				if (resolve) return getBindingCVSpec();
				return basicGetBindingCVSpec();
			case CvlPackage.COMPOSITE_VARIATION_POINT__CHILDREN:
				return getChildren();
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
			case CvlPackage.COMPOSITE_VARIATION_POINT__BINDING_CV_SPEC:
				setBindingCVSpec((CVSpec)newValue);
				return;
			case CvlPackage.COMPOSITE_VARIATION_POINT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends VariationPoint>)newValue);
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
			case CvlPackage.COMPOSITE_VARIATION_POINT__BINDING_CV_SPEC:
				setBindingCVSpec((CVSpec)null);
				return;
			case CvlPackage.COMPOSITE_VARIATION_POINT__CHILDREN:
				getChildren().clear();
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
			case CvlPackage.COMPOSITE_VARIATION_POINT__BINDING_CV_SPEC:
				return bindingCVSpec != null;
			case CvlPackage.COMPOSITE_VARIATION_POINT__CHILDREN:
				return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeVariationPointImpl
