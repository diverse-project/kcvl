/**
 */
package org.omg.CVLMetamodelMaster.cvl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variation Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     A variation point is a concrete item of variability against the base model.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.VariationPoint#getBindingVspec <em>Binding Vspec</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.VariationPoint#getPrecedenceConstraint <em>Precedence Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVariationPoint()
 * @model abstract="true"
 * @generated
 */
public interface VariationPoint extends VPackageable {
	/**
	 * Returns the value of the '<em><b>Binding Vspec</b></em>' reference list.
	 * The list contents are of type {@link org.omg.CVLMetamodelMaster.cvl.VSpec}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The VSpecs to which the variation point is bound.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binding Vspec</em>' reference list.
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVariationPoint_BindingVspec()
	 * @model ordered="false"
	 * @generated
	 */
	EList<VSpec> getBindingVspec();

	/**
	 * Returns the value of the '<em><b>Precedence Constraint</b></em>' reference list.
	 * The list contents are of type {@link org.omg.CVLMetamodelMaster.cvl.VariationPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedence Constraint</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedence Constraint</em>' reference list.
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getVariationPoint_PrecedenceConstraint()
	 * @model
	 * @generated
	 */
	EList<VariationPoint> getPrecedenceConstraint();

} // VariationPoint
