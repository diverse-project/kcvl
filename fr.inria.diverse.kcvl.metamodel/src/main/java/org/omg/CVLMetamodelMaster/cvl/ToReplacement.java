/**
 */
package org.omg.CVLMetamodelMaster.cvl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To Replacement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>
 *     ToReplacement is the kind of boundary element that defines the inwards boundary of the owning replacement fragment. The
 *     insideBoundaryElement defines the starting points for the traversal to isolate the model elements that as part of a
 *     fragment substitution will be copied into the placement fragment.
 * </p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.ToReplacement#getInsideBoundaryElement <em>Inside Boundary Element</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.ToReplacement#getToPlacement <em>To Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getToReplacement()
 * @model
 * @generated
 */
public interface ToReplacement extends ReplacementBoundaryElement {
	/**
	 * Returns the value of the '<em><b>Inside Boundary Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.CVLMetamodelMaster.cvl.ObjectHandle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Model elements that are referred to by outside model elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inside Boundary Element</em>' containment reference list.
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getToReplacement_InsideBoundaryElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ObjectHandle> getInsideBoundaryElement();

	/**
	 * Returns the value of the '<em><b>To Placement</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.omg.CVLMetamodelMaster.cvl.ToPlacement#getToReplacement <em>To Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a ToPlacement contained by the replacement fragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Placement</em>' containment reference.
	 * @see #setToPlacement(ToPlacement)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getToReplacement_ToPlacement()
	 * @see org.omg.CVLMetamodelMaster.cvl.ToPlacement#getToReplacement
	 * @model opposite="toReplacement" containment="true" ordered="false"
	 * @generated
	 */
	ToPlacement getToPlacement();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.ToReplacement#getToPlacement <em>To Placement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Placement</em>' containment reference.
	 * @see #getToPlacement()
	 * @generated
	 */
	void setToPlacement(ToPlacement value);

} // ToReplacement
