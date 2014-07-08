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

import org.omg.CVLMetamodelMaster.cvl.CvlPackage;
import org.omg.CVLMetamodelMaster.cvl.ObjectExistence;
import org.omg.CVLMetamodelMaster.cvl.ObjectHandle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Existence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.ObjectExistenceImpl#getOptionalObject <em>Optional Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectExistenceImpl extends ExistenceImpl implements ObjectExistence {
	/**
	 * The cached value of the '{@link #getOptionalObject() <em>Optional Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptionalObject()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectHandle> optionalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectExistenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvlPackage.Literals.OBJECT_EXISTENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectHandle> getOptionalObject() {
		if (optionalObject == null) {
			optionalObject = new EObjectContainmentEList<ObjectHandle>(ObjectHandle.class, this, CvlPackage.OBJECT_EXISTENCE__OPTIONAL_OBJECT);
		}
		return optionalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvlPackage.OBJECT_EXISTENCE__OPTIONAL_OBJECT:
				return ((InternalEList<?>)getOptionalObject()).basicRemove(otherEnd, msgs);
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
			case CvlPackage.OBJECT_EXISTENCE__OPTIONAL_OBJECT:
				return getOptionalObject();
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
			case CvlPackage.OBJECT_EXISTENCE__OPTIONAL_OBJECT:
				getOptionalObject().clear();
				getOptionalObject().addAll((Collection<? extends ObjectHandle>)newValue);
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
			case CvlPackage.OBJECT_EXISTENCE__OPTIONAL_OBJECT:
				getOptionalObject().clear();
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
			case CvlPackage.OBJECT_EXISTENCE__OPTIONAL_OBJECT:
				return optionalObject != null && !optionalObject.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectExistenceImpl
