/**
 */
package org.omg.CVLMetamodelMaster.cvl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.omg.CVLMetamodelMaster.cvl.CvlPackage;
import org.omg.CVLMetamodelMaster.cvl.VSpec;
import org.omg.CVLMetamodelMaster.cvl.VariationPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variation Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.VariationPointImpl#getBindingVspec <em>Binding Vspec</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.impl.VariationPointImpl#getPrecedenceConstraint <em>Precedence Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VariationPointImpl extends VPackageableImpl implements VariationPoint {
	/**
	 * The cached value of the '{@link #getBindingVspec() <em>Binding Vspec</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingVspec()
	 * @generated
	 * @ordered
	 */
	protected EList<VSpec> bindingVspec;

	/**
	 * The cached value of the '{@link #getPrecedenceConstraint() <em>Precedence Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedenceConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<VariationPoint> precedenceConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariationPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CvlPackage.Literals.VARIATION_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VSpec> getBindingVspec() {
		if (bindingVspec == null) {
			bindingVspec = new EObjectResolvingEList<VSpec>(VSpec.class, this, CvlPackage.VARIATION_POINT__BINDING_VSPEC);
		}
		return bindingVspec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariationPoint> getPrecedenceConstraint() {
		if (precedenceConstraint == null) {
			precedenceConstraint = new EObjectResolvingEList<VariationPoint>(VariationPoint.class, this, CvlPackage.VARIATION_POINT__PRECEDENCE_CONSTRAINT);
		}
		return precedenceConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CvlPackage.VARIATION_POINT__BINDING_VSPEC:
				return getBindingVspec();
			case CvlPackage.VARIATION_POINT__PRECEDENCE_CONSTRAINT:
				return getPrecedenceConstraint();
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
			case CvlPackage.VARIATION_POINT__BINDING_VSPEC:
				getBindingVspec().clear();
				getBindingVspec().addAll((Collection<? extends VSpec>)newValue);
				return;
			case CvlPackage.VARIATION_POINT__PRECEDENCE_CONSTRAINT:
				getPrecedenceConstraint().clear();
				getPrecedenceConstraint().addAll((Collection<? extends VariationPoint>)newValue);
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
			case CvlPackage.VARIATION_POINT__BINDING_VSPEC:
				getBindingVspec().clear();
				return;
			case CvlPackage.VARIATION_POINT__PRECEDENCE_CONSTRAINT:
				getPrecedenceConstraint().clear();
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
			case CvlPackage.VARIATION_POINT__BINDING_VSPEC:
				return bindingVspec != null && !bindingVspec.isEmpty();
			case CvlPackage.VARIATION_POINT__PRECEDENCE_CONSTRAINT:
				return precedenceConstraint != null && !precedenceConstraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VariationPointImpl
