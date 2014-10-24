/**
 */
package org.omg.CVLMetamodelMaster.cvl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.omg.CVLMetamodelMaster.cvl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.omg.CVLMetamodelMaster.cvl.CvlPackage
 * @generated
 */
public class CvlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CvlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CvlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CvlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CvlSwitch<Adapter> modelSwitch =
		new CvlSwitch<Adapter>() {
			@Override
			public Adapter caseChoice(Choice object) {
				return createChoiceAdapter();
			}
			@Override
			public Adapter caseVSpec(VSpec object) {
				return createVSpecAdapter();
			}
			@Override
			public Adapter caseVPackageable(VPackageable object) {
				return createVPackageableAdapter();
			}
			@Override
			public Adapter caseMultiplicityInterval(MultiplicityInterval object) {
				return createMultiplicityIntervalAdapter();
			}
			@Override
			public Adapter caseVSpecDerivation(VSpecDerivation object) {
				return createVSpecDerivationAdapter();
			}
			@Override
			public Adapter caseVClassifier(VClassifier object) {
				return createVClassifierAdapter();
			}
			@Override
			public Adapter caseVSpecResolution(VSpecResolution object) {
				return createVSpecResolutionAdapter();
			}
			@Override
			public Adapter caseChoiceResolutuion(ChoiceResolutuion object) {
				return createChoiceResolutuionAdapter();
			}
			@Override
			public Adapter caseVInstance(VInstance object) {
				return createVInstanceAdapter();
			}
			@Override
			public Adapter caseVariationPoint(VariationPoint object) {
				return createVariationPointAdapter();
			}
			@Override
			public Adapter caseFragmentSubstitution(FragmentSubstitution object) {
				return createFragmentSubstitutionAdapter();
			}
			@Override
			public Adapter caseChoiceVariationPoint(ChoiceVariationPoint object) {
				return createChoiceVariationPointAdapter();
			}
			@Override
			public Adapter caseRepeatableVariationPoint(RepeatableVariationPoint object) {
				return createRepeatableVariationPointAdapter();
			}
			@Override
			public Adapter caseBoundaryElementBinding(BoundaryElementBinding object) {
				return createBoundaryElementBindingAdapter();
			}
			@Override
			public Adapter casePlacementFragment(PlacementFragment object) {
				return createPlacementFragmentAdapter();
			}
			@Override
			public Adapter casePlacementBoundaryElement(PlacementBoundaryElement object) {
				return createPlacementBoundaryElementAdapter();
			}
			@Override
			public Adapter caseReplacementFragmentType(ReplacementFragmentType object) {
				return createReplacementFragmentTypeAdapter();
			}
			@Override
			public Adapter caseVariabletype(Variabletype object) {
				return createVariabletypeAdapter();
			}
			@Override
			public Adapter caseReplacementBoundaryElement(ReplacementBoundaryElement object) {
				return createReplacementBoundaryElementAdapter();
			}
			@Override
			public Adapter caseObjectSubstitution(ObjectSubstitution object) {
				return createObjectSubstitutionAdapter();
			}
			@Override
			public Adapter caseObjectHandle(ObjectHandle object) {
				return createObjectHandleAdapter();
			}
			@Override
			public Adapter caseBaseModelHandle(BaseModelHandle object) {
				return createBaseModelHandleAdapter();
			}
			@Override
			public Adapter caseExistence(Existence object) {
				return createExistenceAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseValueSpecification(ValueSpecification object) {
				return createValueSpecificationAdapter();
			}
			@Override
			public Adapter caseVariableValueAssignment(VariableValueAssignment object) {
				return createVariableValueAssignmentAdapter();
			}
			@Override
			public Adapter casePrimitveType(PrimitveType object) {
				return createPrimitveTypeAdapter();
			}
			@Override
			public Adapter caseObjectType(ObjectType object) {
				return createObjectTypeAdapter();
			}
			@Override
			public Adapter caseVInterface(VInterface object) {
				return createVInterfaceAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseSlotAssignment(SlotAssignment object) {
				return createSlotAssignmentAdapter();
			}
			@Override
			public Adapter caseFixedSlotValueAssignment(FixedSlotValueAssignment object) {
				return createFixedSlotValueAssignmentAdapter();
			}
			@Override
			public Adapter caseFixedObjectSubstitution(FixedObjectSubstitution object) {
				return createFixedObjectSubstitutionAdapter();
			}
			@Override
			public Adapter caseObjectExistence(ObjectExistence object) {
				return createObjectExistenceAdapter();
			}
			@Override
			public Adapter caseLinkAssignment(LinkAssignment object) {
				return createLinkAssignmentAdapter();
			}
			@Override
			public Adapter caseLinkHandle(LinkHandle object) {
				return createLinkHandleAdapter();
			}
			@Override
			public Adapter caseConfigurableUnit(ConfigurableUnit object) {
				return createConfigurableUnitAdapter();
			}
			@Override
			public Adapter caseCompositeVariationPoint(CompositeVariationPoint object) {
				return createCompositeVariationPointAdapter();
			}
			@Override
			public Adapter caseCVSpec(CVSpec object) {
				return createCVSpecAdapter();
			}
			@Override
			public Adapter caseVConfiguration(VConfiguration object) {
				return createVConfigurationAdapter();
			}
			@Override
			public Adapter caseVSpec2VSpecMapping(VSpec2VSpecMapping object) {
				return createVSpec2VSpecMappingAdapter();
			}
			@Override
			public Adapter caseOpaqueConstraint(OpaqueConstraint object) {
				return createOpaqueConstraintAdapter();
			}
			@Override
			public Adapter caseLinkExistence(LinkExistence object) {
				return createLinkExistenceAdapter();
			}
			@Override
			public Adapter caseOpaqueVariationPoint(OpaqueVariationPoint object) {
				return createOpaqueVariationPointAdapter();
			}
			@Override
			public Adapter caseOVPType(OVPType object) {
				return createOVPTypeAdapter();
			}
			@Override
			public Adapter caseOVPSemanticSpec(OVPSemanticSpec object) {
				return createOVPSemanticSpecAdapter();
			}
			@Override
			public Adapter caseObjectSpecification(ObjectSpecification object) {
				return createObjectSpecificationAdapter();
			}
			@Override
			public Adapter caseReplacementFragmentSpecification(ReplacementFragmentSpecification object) {
				return createReplacementFragmentSpecificationAdapter();
			}
			@Override
			public Adapter caseVPackage(VPackage object) {
				return createVPackageAdapter();
			}
			@Override
			public Adapter caseToBinding(ToBinding object) {
				return createToBindingAdapter();
			}
			@Override
			public Adapter caseToPlacement(ToPlacement object) {
				return createToPlacementAdapter();
			}
			@Override
			public Adapter caseToReplacement(ToReplacement object) {
				return createToReplacementAdapter();
			}
			@Override
			public Adapter caseFromBinding(FromBinding object) {
				return createFromBindingAdapter();
			}
			@Override
			public Adapter caseFromPlacement(FromPlacement object) {
				return createFromPlacementAdapter();
			}
			@Override
			public Adapter caseFromReplacement(FromReplacement object) {
				return createFromReplacementAdapter();
			}
			@Override
			public Adapter caseVSpecRef(VSpecRef object) {
				return createVSpecRefAdapter();
			}
			@Override
			public Adapter caseOCLExpression(OCLExpression object) {
				return createOCLExpressionAdapter();
			}
			@Override
			public Adapter caseVSpecToConfigMapping(VSpecToConfigMapping object) {
				return createVSpecToConfigMappingAdapter();
			}
			@Override
			public Adapter caseParametricVariationPoint(ParametricVariationPoint object) {
				return createParametricVariationPointAdapter();
			}
			@Override
			public Adapter caseSlotValueExistence(SlotValueExistence object) {
				return createSlotValueExistenceAdapter();
			}
			@Override
			public Adapter caseParametricLinkAssignment(ParametricLinkAssignment object) {
				return createParametricLinkAssignmentAdapter();
			}
			@Override
			public Adapter caseParametricObjectSubstitution(ParametricObjectSubstitution object) {
				return createParametricObjectSubstitutionAdapter();
			}
			@Override
			public Adapter caseParametricSlotAssignmet(ParametricSlotAssignmet object) {
				return createParametricSlotAssignmetAdapter();
			}
			@Override
			public Adapter caseChoiceDerivation(ChoiceDerivation object) {
				return createChoiceDerivationAdapter();
			}
			@Override
			public Adapter caseVariableDerivation(VariableDerivation object) {
				return createVariableDerivationAdapter();
			}
			@Override
			public Adapter caseCVSpecDerivation(CVSpecDerivation object) {
				return createCVSpecDerivationAdapter();
			}
			@Override
			public Adapter caseConfigurableUnitUsage(ConfigurableUnitUsage object) {
				return createConfigurableUnitUsageAdapter();
			}
			@Override
			public Adapter casePrimitiveValueSpecification(PrimitiveValueSpecification object) {
				return createPrimitiveValueSpecificationAdapter();
			}
			@Override
			public Adapter caseOCLConstraint(OCLConstraint object) {
				return createOCLConstraintAdapter();
			}
			@Override
			public Adapter caseOperationCallExp(OperationCallExp object) {
				return createOperationCallExpAdapter();
			}
			@Override
			public Adapter caseBooleanLiteralExp(BooleanLiteralExp object) {
				return createBooleanLiteralExpAdapter();
			}
			@Override
			public Adapter caseStringLiteralExp(StringLiteralExp object) {
				return createStringLiteralExpAdapter();
			}
			@Override
			public Adapter caseNumericLiteralExp(NumericLiteralExp object) {
				return createNumericLiteralExpAdapter();
			}
			@Override
			public Adapter caseIntegerLiteralExp(IntegerLiteralExp object) {
				return createIntegerLiteralExpAdapter();
			}
			@Override
			public Adapter caseUnlimitedLiteralExp(UnlimitedLiteralExp object) {
				return createUnlimitedLiteralExpAdapter();
			}
			@Override
			public Adapter caseRealLiteralExp(RealLiteralExp object) {
				return createRealLiteralExpAdapter();
			}
			@Override
			public Adapter casePatternIntegration(PatternIntegration object) {
				return createPatternIntegrationAdapter();
			}
			@Override
			public Adapter casePatternFusion(PatternFusion object) {
				return createPatternFusionAdapter();
			}
			@Override
			public Adapter caseStructuralOrganisationalPattern(StructuralOrganisationalPattern object) {
				return createStructuralOrganisationalPatternAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.Choice
	 * @generated
	 */
	public Adapter createChoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.VSpec <em>VSpec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.VSpec
	 * @generated
	 */
	public Adapter createVSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.VPackageable <em>VPackageable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.VPackageable
	 * @generated
	 */
	public Adapter createVPackageableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.MultiplicityInterval <em>Multiplicity Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.MultiplicityInterval
	 * @generated
	 */
	public Adapter createMultiplicityIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.VSpecDerivation <em>VSpec Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.VSpecDerivation
	 * @generated
	 */
	public Adapter createVSpecDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.VClassifier <em>VClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.VClassifier
	 * @generated
	 */
	public Adapter createVClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.VSpecResolution <em>VSpec Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.VSpecResolution
	 * @generated
	 */
	public Adapter createVSpecResolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.ChoiceResolutuion <em>Choice Resolutuion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.ChoiceResolutuion
	 * @generated
	 */
	public Adapter createChoiceResolutuionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.VInstance <em>VInstance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.VInstance
	 * @generated
	 */
	public Adapter createVInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.VariationPoint <em>Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.VariationPoint
	 * @generated
	 */
	public Adapter createVariationPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.FragmentSubstitution <em>Fragment Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.FragmentSubstitution
	 * @generated
	 */
	public Adapter createFragmentSubstitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.ChoiceVariationPoint <em>Choice Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.ChoiceVariationPoint
	 * @generated
	 */
	public Adapter createChoiceVariationPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.RepeatableVariationPoint <em>Repeatable Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.RepeatableVariationPoint
	 * @generated
	 */
	public Adapter createRepeatableVariationPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.BoundaryElementBinding <em>Boundary Element Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.BoundaryElementBinding
	 * @generated
	 */
	public Adapter createBoundaryElementBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.PlacementFragment <em>Placement Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.PlacementFragment
	 * @generated
	 */
	public Adapter createPlacementFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.PlacementBoundaryElement <em>Placement Boundary Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.PlacementBoundaryElement
	 * @generated
	 */
	public Adapter createPlacementBoundaryElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.ReplacementFragmentType <em>Replacement Fragment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.ReplacementFragmentType
	 * @generated
	 */
	public Adapter createReplacementFragmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.Variabletype <em>Variabletype</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.Variabletype
	 * @generated
	 */
	public Adapter createVariabletypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.ReplacementBoundaryElement <em>Replacement Boundary Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.ReplacementBoundaryElement
	 * @generated
	 */
	public Adapter createReplacementBoundaryElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.ObjectSubstitution <em>Object Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.ObjectSubstitution
	 * @generated
	 */
	public Adapter createObjectSubstitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.ObjectHandle <em>Object Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.ObjectHandle
	 * @generated
	 */
	public Adapter createObjectHandleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.BaseModelHandle <em>Base Model Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.BaseModelHandle
	 * @generated
	 */
	public Adapter createBaseModelHandleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.Existence <em>Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.Existence
	 * @generated
	 */
	public Adapter createExistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.ValueSpecification
	 * @generated
	 */
	public Adapter createValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.VariableValueAssignment <em>Variable Value Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.VariableValueAssignment
	 * @generated
	 */
	public Adapter createVariableValueAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.PrimitveType <em>Primitve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.PrimitveType
	 * @generated
	 */
	public Adapter createPrimitveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.ObjectType
	 * @generated
	 */
	public Adapter createObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.VInterface <em>VInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.VInterface
	 * @generated
	 */
	public Adapter createVInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.SlotAssignment <em>Slot Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.SlotAssignment
	 * @generated
	 */
	public Adapter createSlotAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.FixedSlotValueAssignment <em>Fixed Slot Value Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.FixedSlotValueAssignment
	 * @generated
	 */
	public Adapter createFixedSlotValueAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.FixedObjectSubstitution <em>Fixed Object Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.FixedObjectSubstitution
	 * @generated
	 */
	public Adapter createFixedObjectSubstitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.ObjectExistence <em>Object Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.ObjectExistence
	 * @generated
	 */
	public Adapter createObjectExistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.LinkAssignment <em>Link Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.LinkAssignment
	 * @generated
	 */
	public Adapter createLinkAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.LinkHandle <em>Link Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.LinkHandle
	 * @generated
	 */
	public Adapter createLinkHandleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.ConfigurableUnit <em>Configurable Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.ConfigurableUnit
	 * @generated
	 */
	public Adapter createConfigurableUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.CompositeVariationPoint <em>Composite Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.CompositeVariationPoint
	 * @generated
	 */
	public Adapter createCompositeVariationPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.CVSpec <em>CV Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.CVSpec
	 * @generated
	 */
	public Adapter createCVSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.VConfiguration <em>VConfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.VConfiguration
	 * @generated
	 */
	public Adapter createVConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.VSpec2VSpecMapping <em>VSpec2 VSpec Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.VSpec2VSpecMapping
	 * @generated
	 */
	public Adapter createVSpec2VSpecMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.OpaqueConstraint <em>Opaque Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.OpaqueConstraint
	 * @generated
	 */
	public Adapter createOpaqueConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.LinkExistence <em>Link Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.LinkExistence
	 * @generated
	 */
	public Adapter createLinkExistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.OpaqueVariationPoint <em>Opaque Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.OpaqueVariationPoint
	 * @generated
	 */
	public Adapter createOpaqueVariationPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.OVPType <em>OVP Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.OVPType
	 * @generated
	 */
	public Adapter createOVPTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.OVPSemanticSpec <em>OVP Semantic Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.OVPSemanticSpec
	 * @generated
	 */
	public Adapter createOVPSemanticSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.ObjectSpecification <em>Object Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.ObjectSpecification
	 * @generated
	 */
	public Adapter createObjectSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.ReplacementFragmentSpecification <em>Replacement Fragment Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.ReplacementFragmentSpecification
	 * @generated
	 */
	public Adapter createReplacementFragmentSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.VPackage <em>VPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.VPackage
	 * @generated
	 */
	public Adapter createVPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.ToBinding <em>To Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.ToBinding
	 * @generated
	 */
	public Adapter createToBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.ToPlacement <em>To Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.ToPlacement
	 * @generated
	 */
	public Adapter createToPlacementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.ToReplacement <em>To Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.ToReplacement
	 * @generated
	 */
	public Adapter createToReplacementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.FromBinding <em>From Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.FromBinding
	 * @generated
	 */
	public Adapter createFromBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.FromPlacement <em>From Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.FromPlacement
	 * @generated
	 */
	public Adapter createFromPlacementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.FromReplacement <em>From Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.FromReplacement
	 * @generated
	 */
	public Adapter createFromReplacementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.VSpecRef <em>VSpec Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.VSpecRef
	 * @generated
	 */
	public Adapter createVSpecRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.OCLExpression <em>OCL Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.OCLExpression
	 * @generated
	 */
	public Adapter createOCLExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.VSpecToConfigMapping <em>VSpec To Config Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.VSpecToConfigMapping
	 * @generated
	 */
	public Adapter createVSpecToConfigMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.ParametricVariationPoint <em>Parametric Variation Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.ParametricVariationPoint
	 * @generated
	 */
	public Adapter createParametricVariationPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.SlotValueExistence <em>Slot Value Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.SlotValueExistence
	 * @generated
	 */
	public Adapter createSlotValueExistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.ParametricLinkAssignment <em>Parametric Link Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.ParametricLinkAssignment
	 * @generated
	 */
	public Adapter createParametricLinkAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.ParametricObjectSubstitution <em>Parametric Object Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.ParametricObjectSubstitution
	 * @generated
	 */
	public Adapter createParametricObjectSubstitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.ParametricSlotAssignmet <em>Parametric Slot Assignmet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.ParametricSlotAssignmet
	 * @generated
	 */
	public Adapter createParametricSlotAssignmetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.ChoiceDerivation <em>Choice Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.ChoiceDerivation
	 * @generated
	 */
	public Adapter createChoiceDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.VariableDerivation <em>Variable Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.VariableDerivation
	 * @generated
	 */
	public Adapter createVariableDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.CVSpecDerivation <em>CV Spec Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.CVSpecDerivation
	 * @generated
	 */
	public Adapter createCVSpecDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.ConfigurableUnitUsage <em>Configurable Unit Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.ConfigurableUnitUsage
	 * @generated
	 */
	public Adapter createConfigurableUnitUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.PrimitiveValueSpecification <em>Primitive Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.PrimitiveValueSpecification
	 * @generated
	 */
	public Adapter createPrimitiveValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.OCLConstraint <em>OCL Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.OCLConstraint
	 * @generated
	 */
	public Adapter createOCLConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.OperationCallExp <em>Operation Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.OperationCallExp
	 * @generated
	 */
	public Adapter createOperationCallExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.BooleanLiteralExp <em>Boolean Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.BooleanLiteralExp
	 * @generated
	 */
	public Adapter createBooleanLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.StringLiteralExp <em>String Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.StringLiteralExp
	 * @generated
	 */
	public Adapter createStringLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.NumericLiteralExp <em>Numeric Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.NumericLiteralExp
	 * @generated
	 */
	public Adapter createNumericLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.IntegerLiteralExp <em>Integer Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.IntegerLiteralExp
	 * @generated
	 */
	public Adapter createIntegerLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.UnlimitedLiteralExp <em>Unlimited Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.UnlimitedLiteralExp
	 * @generated
	 */
	public Adapter createUnlimitedLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.RealLiteralExp <em>Real Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.RealLiteralExp
	 * @generated
	 */
	public Adapter createRealLiteralExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.PatternIntegration <em>Pattern Integration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.PatternIntegration
	 * @generated
	 */
	public Adapter createPatternIntegrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.PatternFusion <em>Pattern Fusion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.PatternFusion
	 * @generated
	 */
	public Adapter createPatternFusionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.StructuralOrganisationalPattern <em>Structural Organisational Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.StructuralOrganisationalPattern
	 * @generated
	 */
	public Adapter createStructuralOrganisationalPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.CVLMetamodelMaster.cvl.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.CVLMetamodelMaster.cvl.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CvlAdapterFactory
