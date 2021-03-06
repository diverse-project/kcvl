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
import org.omg.CVLMetamodelMaster.cvl.Import;
import org.omg.CVLMetamodelMaster.cvl.VPackage;
import org.omg.CVLMetamodelMaster.cvl.VPackageable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VPackage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.VPackageImpl#getPackageElement <em>Package Element</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.VPackageImpl#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VPackageImpl extends VPackageableImpl implements VPackage {
	/**
	 * The cached value of the '{@link #getPackageElement() <em>Package Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageElement()
	 * @generated
	 * @ordered
	 */
	protected EList<VPackageable> packageElement;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvlPackage.Literals.VPACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VPackageable> getPackageElement() {
		if (packageElement == null) {
			packageElement = new EObjectContainmentEList<VPackageable>(VPackageable.class, this, CvlPackage.VPACKAGE__PACKAGE_ELEMENT);
		}
		return packageElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, CvlPackage.VPACKAGE__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CvlPackage.VPACKAGE__PACKAGE_ELEMENT:
				return ((InternalEList<?>)getPackageElement()).basicRemove(otherEnd, msgs);
			case CvlPackage.VPACKAGE__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
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
			case CvlPackage.VPACKAGE__PACKAGE_ELEMENT:
				return getPackageElement();
			case CvlPackage.VPACKAGE__IMPORTS:
				return getImports();
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
			case CvlPackage.VPACKAGE__PACKAGE_ELEMENT:
				getPackageElement().clear();
				getPackageElement().addAll((Collection<? extends VPackageable>)newValue);
				return;
			case CvlPackage.VPACKAGE__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
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
			case CvlPackage.VPACKAGE__PACKAGE_ELEMENT:
				getPackageElement().clear();
				return;
			case CvlPackage.VPACKAGE__IMPORTS:
				getImports().clear();
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
			case CvlPackage.VPACKAGE__PACKAGE_ELEMENT:
				return packageElement != null && !packageElement.isEmpty();
			case CvlPackage.VPACKAGE__IMPORTS:
				return imports != null && !imports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VPackageImpl
