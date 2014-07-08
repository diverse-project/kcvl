/**
 */
package org.omg.CVLMetamodelMaster.cvl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.omg.CVLMetamodelMaster.cvl.BaseModelHandle;
import org.omg.CVLMetamodelMaster.cvl.CvlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Model Handle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.BaseModelHandleImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.BaseModelHandleImpl#getReferenceString <em>Reference String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseModelHandleImpl extends MinimalEObjectImpl.Container implements BaseModelHandle {
	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EObject reference;

	/**
	 * The default value of the '{@link #getReferenceString() <em>Reference String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceString()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceString() <em>Reference String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceString()
	 * @generated
	 * @ordered
	 */
	protected String referenceString = REFERENCE_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseModelHandleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvlPackage.Literals.BASE_MODEL_HANDLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getReference() {
		if (reference != null && reference.eIsProxy()) {
			InternalEObject oldReference = (InternalEObject)reference;
			reference = eResolveProxy(oldReference);
			if (reference != oldReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CvlPackage.BASE_MODEL_HANDLE__REFERENCE, oldReference, reference));
			}
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(EObject newReference) {
		EObject oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.BASE_MODEL_HANDLE__REFERENCE, oldReference, reference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceString() {
		return referenceString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceString(String newReferenceString) {
		String oldReferenceString = referenceString;
		referenceString = newReferenceString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.BASE_MODEL_HANDLE__REFERENCE_STRING, oldReferenceString, referenceString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CvlPackage.BASE_MODEL_HANDLE__REFERENCE:
				if (resolve) return getReference();
				return basicGetReference();
			case CvlPackage.BASE_MODEL_HANDLE__REFERENCE_STRING:
				return getReferenceString();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CvlPackage.BASE_MODEL_HANDLE__REFERENCE:
				setReference((EObject)newValue);
				return;
			case CvlPackage.BASE_MODEL_HANDLE__REFERENCE_STRING:
				setReferenceString((String)newValue);
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
			case CvlPackage.BASE_MODEL_HANDLE__REFERENCE:
				setReference((EObject)null);
				return;
			case CvlPackage.BASE_MODEL_HANDLE__REFERENCE_STRING:
				setReferenceString(REFERENCE_STRING_EDEFAULT);
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
			case CvlPackage.BASE_MODEL_HANDLE__REFERENCE:
				return reference != null;
			case CvlPackage.BASE_MODEL_HANDLE__REFERENCE_STRING:
				return REFERENCE_STRING_EDEFAULT == null ? referenceString != null : !REFERENCE_STRING_EDEFAULT.equals(referenceString);
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
		result.append(" (referenceString: ");
		result.append(referenceString);
		result.append(')');
		return result.toString();
	}

} //BaseModelHandleImpl
