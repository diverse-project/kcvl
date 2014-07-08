/**
 */
package org.omg.CVLMetamodelMaster.cvl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.CVLMetamodelMaster.cvl.CvlPackage;
import org.omg.CVLMetamodelMaster.cvl.LinkAssignment;
import org.omg.CVLMetamodelMaster.cvl.LinkHandle;
import org.omg.CVLMetamodelMaster.cvl.ObjectHandle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.LinkAssignmentImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.LinkAssignmentImpl#getLinkEndIdentifier <em>Link End Identifier</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.LinkAssignmentImpl#getNewEnd <em>New End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkAssignmentImpl extends ChoiceVariationPointImpl implements LinkAssignment {
	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected LinkHandle link;

	/**
	 * The default value of the '{@link #getLinkEndIdentifier() <em>Link End Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkEndIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_END_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkEndIdentifier() <em>Link End Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkEndIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String linkEndIdentifier = LINK_END_IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNewEnd() <em>New End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewEnd()
	 * @generated
	 * @ordered
	 */
	protected ObjectHandle newEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvlPackage.Literals.LINK_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkHandle getLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(LinkHandle newLink, NotificationChain msgs) {
		LinkHandle oldLink = link;
		link = newLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvlPackage.LINK_ASSIGNMENT__LINK, oldLink, newLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLink(LinkHandle newLink) {
		if (newLink != link) {
			NotificationChain msgs = null;
			if (link != null)
				msgs = ((InternalEObject)link).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CvlPackage.LINK_ASSIGNMENT__LINK, null, msgs);
			if (newLink != null)
				msgs = ((InternalEObject)newLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CvlPackage.LINK_ASSIGNMENT__LINK, null, msgs);
			msgs = basicSetLink(newLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.LINK_ASSIGNMENT__LINK, newLink, newLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkEndIdentifier() {
		return linkEndIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkEndIdentifier(String newLinkEndIdentifier) {
		String oldLinkEndIdentifier = linkEndIdentifier;
		linkEndIdentifier = newLinkEndIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.LINK_ASSIGNMENT__LINK_END_IDENTIFIER, oldLinkEndIdentifier, linkEndIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectHandle getNewEnd() {
		return newEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewEnd(ObjectHandle newNewEnd, NotificationChain msgs) {
		ObjectHandle oldNewEnd = newEnd;
		newEnd = newNewEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CvlPackage.LINK_ASSIGNMENT__NEW_END, oldNewEnd, newNewEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewEnd(ObjectHandle newNewEnd) {
		if (newNewEnd != newEnd) {
			NotificationChain msgs = null;
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CvlPackage.LINK_ASSIGNMENT__NEW_END, null, msgs);
			if (newNewEnd != null)
				msgs = ((InternalEObject)newNewEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CvlPackage.LINK_ASSIGNMENT__NEW_END, null, msgs);
			msgs = basicSetNewEnd(newNewEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CvlPackage.LINK_ASSIGNMENT__NEW_END, newNewEnd, newNewEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvlPackage.LINK_ASSIGNMENT__LINK:
				return basicSetLink(null, msgs);
			case CvlPackage.LINK_ASSIGNMENT__NEW_END:
				return basicSetNewEnd(null, msgs);
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
			case CvlPackage.LINK_ASSIGNMENT__LINK:
				return getLink();
			case CvlPackage.LINK_ASSIGNMENT__LINK_END_IDENTIFIER:
				return getLinkEndIdentifier();
			case CvlPackage.LINK_ASSIGNMENT__NEW_END:
				return getNewEnd();
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
			case CvlPackage.LINK_ASSIGNMENT__LINK:
				setLink((LinkHandle)newValue);
				return;
			case CvlPackage.LINK_ASSIGNMENT__LINK_END_IDENTIFIER:
				setLinkEndIdentifier((String)newValue);
				return;
			case CvlPackage.LINK_ASSIGNMENT__NEW_END:
				setNewEnd((ObjectHandle)newValue);
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
			case CvlPackage.LINK_ASSIGNMENT__LINK:
				setLink((LinkHandle)null);
				return;
			case CvlPackage.LINK_ASSIGNMENT__LINK_END_IDENTIFIER:
				setLinkEndIdentifier(LINK_END_IDENTIFIER_EDEFAULT);
				return;
			case CvlPackage.LINK_ASSIGNMENT__NEW_END:
				setNewEnd((ObjectHandle)null);
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
			case CvlPackage.LINK_ASSIGNMENT__LINK:
				return link != null;
			case CvlPackage.LINK_ASSIGNMENT__LINK_END_IDENTIFIER:
				return LINK_END_IDENTIFIER_EDEFAULT == null ? linkEndIdentifier != null : !LINK_END_IDENTIFIER_EDEFAULT.equals(linkEndIdentifier);
			case CvlPackage.LINK_ASSIGNMENT__NEW_END:
				return newEnd != null;
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
		result.append(" (linkEndIdentifier: ");
		result.append(linkEndIdentifier);
		result.append(')');
		return result.toString();
	}

} //LinkAssignmentImpl
