/**
 */
package org.omg.CVLMetamodelMaster.cvl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From Replacement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * FromReplacement is the kind of boundary element that defines the outwards boundary of the owning replacement fragment.
 * propertyName is the name of the reference attribute of inside boundary model element that will be changed as part of a
 * fragment substitution. The insideBoundaryElements refer to the base model elements that will have their reference
 * attributes updated as part of a fragment substitution. The outsideBoundaryElement refers to the model elements on the
 * outside of the replacement fragment. In a fragment substitution these references are used to define the extent of the
 * replacement fragment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.FromReplacement#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.FromReplacement#getInsideBoundaryElement <em>Inside Boundary Element</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.FromReplacement#getOutsideBoundaryElement <em>Outside Boundary Element</em>}</li>
 *   <li>{@link org.omg.CVLMetamodelMaster.cvl.FromReplacement#getFromPlacement <em>From Placement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getFromReplacement()
 * @model
 * @generated
 */
public interface FromReplacement extends ReplacementBoundaryElement {
	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the attribute to be changed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getFromReplacement_PropertyName()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.FromReplacement#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

	/**
	 * Returns the value of the '<em><b>Inside Boundary Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inside model elements that refer outside model elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inside Boundary Element</em>' containment reference.
	 * @see #setInsideBoundaryElement(ObjectHandle)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getFromReplacement_InsideBoundaryElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ObjectHandle getInsideBoundaryElement();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.FromReplacement#getInsideBoundaryElement <em>Inside Boundary Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inside Boundary Element</em>' containment reference.
	 * @see #getInsideBoundaryElement()
	 * @generated
	 */
	void setInsideBoundaryElement(ObjectHandle value);

	/**
	 * Returns the value of the '<em><b>Outside Boundary Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.omg.CVLMetamodelMaster.cvl.ObjectHandle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Outside&nbsp;model&nbsp;elements&nbsp;that&nbsp;are&nbsp;referred&nbsp;by&nbsp;model&nbsp;elements&nbsp;inside&nbsp;the&nbsp;fragment.&nbsp;Used&nbsp;to&nbsp;distinguish&nbsp;multiplicity<br />
	 * references.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outside Boundary Element</em>' containment reference list.
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getFromReplacement_OutsideBoundaryElement()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<ObjectHandle> getOutsideBoundaryElement();

	/**
	 * Returns the value of the '<em><b>From Placement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.CVLMetamodelMaster.cvl.FromPlacement#getFromReplacement <em>From Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a FromPlacement contained by the replacement fragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Placement</em>' reference.
	 * @see #setFromPlacement(FromPlacement)
	 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage#getFromReplacement_FromPlacement()
	 * @see org.omg.CVLMetamodelMaster.cvl.FromPlacement#getFromReplacement
	 * @model opposite="fromReplacement" ordered="false"
	 * @generated
	 */
	FromPlacement getFromPlacement();

	/**
	 * Sets the value of the '{@link org.omg.CVLMetamodelMaster.cvl.FromReplacement#getFromPlacement <em>From Placement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Placement</em>' reference.
	 * @see #getFromPlacement()
	 * @generated
	 */
	void setFromPlacement(FromPlacement value);

} // FromReplacement
