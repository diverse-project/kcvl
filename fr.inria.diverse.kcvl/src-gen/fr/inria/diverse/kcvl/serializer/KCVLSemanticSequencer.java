package fr.inria.diverse.kcvl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.inria.diverse.kcvl.services.KCVLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmLowerBound;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.serializer.XbaseSemanticSequencer;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XtypePackage;
import org.omg.CVLMetamodelMaster.cvl.BaseModelHandle;
import org.omg.CVLMetamodelMaster.cvl.BooleanLiteralExp;
import org.omg.CVLMetamodelMaster.cvl.CVSpec;
import org.omg.CVLMetamodelMaster.cvl.CVSpecDerivation;
import org.omg.CVLMetamodelMaster.cvl.Choice;
import org.omg.CVLMetamodelMaster.cvl.ChoiceDerivation;
import org.omg.CVLMetamodelMaster.cvl.ChoiceResolutuion;
import org.omg.CVLMetamodelMaster.cvl.CompositeVariationPoint;
import org.omg.CVLMetamodelMaster.cvl.ConfigurableUnit;
import org.omg.CVLMetamodelMaster.cvl.ConfigurableUnitUsage;
import org.omg.CVLMetamodelMaster.cvl.Constraint;
import org.omg.CVLMetamodelMaster.cvl.CvlPackage;
import org.omg.CVLMetamodelMaster.cvl.FragmentSubstitution;
import org.omg.CVLMetamodelMaster.cvl.FromBinding;
import org.omg.CVLMetamodelMaster.cvl.FromPlacement;
import org.omg.CVLMetamodelMaster.cvl.FromReplacement;
import org.omg.CVLMetamodelMaster.cvl.IntegerLiteralExp;
import org.omg.CVLMetamodelMaster.cvl.LinkAssignment;
import org.omg.CVLMetamodelMaster.cvl.LinkExistence;
import org.omg.CVLMetamodelMaster.cvl.LinkHandle;
import org.omg.CVLMetamodelMaster.cvl.MultiplicityInterval;
import org.omg.CVLMetamodelMaster.cvl.NumericLiteralExp;
import org.omg.CVLMetamodelMaster.cvl.OCLConstraint;
import org.omg.CVLMetamodelMaster.cvl.OCLExpression;
import org.omg.CVLMetamodelMaster.cvl.OVPSemanticSpec;
import org.omg.CVLMetamodelMaster.cvl.OVPType;
import org.omg.CVLMetamodelMaster.cvl.ObjectExistence;
import org.omg.CVLMetamodelMaster.cvl.ObjectHandle;
import org.omg.CVLMetamodelMaster.cvl.ObjectSpecification;
import org.omg.CVLMetamodelMaster.cvl.ObjectSubstitution;
import org.omg.CVLMetamodelMaster.cvl.ObjectType;
import org.omg.CVLMetamodelMaster.cvl.OpaqueConstraint;
import org.omg.CVLMetamodelMaster.cvl.OpaqueVariationPoint;
import org.omg.CVLMetamodelMaster.cvl.OperationCallExp;
import org.omg.CVLMetamodelMaster.cvl.ParametricLinkAssignment;
import org.omg.CVLMetamodelMaster.cvl.ParametricObjectSubstitution;
import org.omg.CVLMetamodelMaster.cvl.ParametricSlotAssignmet;
import org.omg.CVLMetamodelMaster.cvl.PatternFusion;
import org.omg.CVLMetamodelMaster.cvl.PatternIntegration;
import org.omg.CVLMetamodelMaster.cvl.PlacementFragment;
import org.omg.CVLMetamodelMaster.cvl.PrimitiveValueSpecification;
import org.omg.CVLMetamodelMaster.cvl.PrimitveType;
import org.omg.CVLMetamodelMaster.cvl.RealLiteralExp;
import org.omg.CVLMetamodelMaster.cvl.ReplacementFragmentSpecification;
import org.omg.CVLMetamodelMaster.cvl.ReplacementFragmentType;
import org.omg.CVLMetamodelMaster.cvl.SlotAssignment;
import org.omg.CVLMetamodelMaster.cvl.SlotValueExistence;
import org.omg.CVLMetamodelMaster.cvl.StringLiteralExp;
import org.omg.CVLMetamodelMaster.cvl.StructuralOrganisationalPattern;
import org.omg.CVLMetamodelMaster.cvl.ToBinding;
import org.omg.CVLMetamodelMaster.cvl.ToPlacement;
import org.omg.CVLMetamodelMaster.cvl.ToReplacement;
import org.omg.CVLMetamodelMaster.cvl.UnlimitedLiteralExp;
import org.omg.CVLMetamodelMaster.cvl.VClassifier;
import org.omg.CVLMetamodelMaster.cvl.VConfiguration;
import org.omg.CVLMetamodelMaster.cvl.VInstance;
import org.omg.CVLMetamodelMaster.cvl.VInterface;
import org.omg.CVLMetamodelMaster.cvl.VPackage;
import org.omg.CVLMetamodelMaster.cvl.VSpecDerivation;
import org.omg.CVLMetamodelMaster.cvl.VSpecRef;
import org.omg.CVLMetamodelMaster.cvl.Variable;
import org.omg.CVLMetamodelMaster.cvl.VariableDerivation;
import org.omg.CVLMetamodelMaster.cvl.VariableValueAssignment;

@SuppressWarnings("all")
public class KCVLSemanticSequencer extends XbaseSemanticSequencer {

	@Inject
	private KCVLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CvlPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CvlPackage.BASE_MODEL_HANDLE:
				if(context == grammarAccess.getBaseModelHandle_ImplRule()) {
					sequence_BaseModelHandle_Impl(context, (BaseModelHandle) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.BOOLEAN_LITERAL_EXP:
				if(context == grammarAccess.getBooleanLiteralExpRule() ||
				   context == grammarAccess.getOCLExpressionRule()) {
					sequence_BooleanLiteralExp(context, (BooleanLiteralExp) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.CV_SPEC:
				if(context == grammarAccess.getCVSpecRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVSpecRule()) {
					sequence_CVSpec(context, (CVSpec) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.CV_SPEC_DERIVATION:
				if(context == grammarAccess.getCVSpecDerivationRule() ||
				   context == grammarAccess.getVSpecDerivationRule()) {
					sequence_CVSpecDerivation(context, (CVSpecDerivation) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.CHOICE:
				if(context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVSpecRule()) {
					sequence_Choice(context, (Choice) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.CHOICE_DERIVATION:
				if(context == grammarAccess.getChoiceDerivationRule() ||
				   context == grammarAccess.getVSpecDerivationRule()) {
					sequence_ChoiceDerivation(context, (ChoiceDerivation) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.CHOICE_RESOLUTUION:
				if(context == grammarAccess.getChoiceResolutuionRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVSpecResolutionRule()) {
					sequence_ChoiceResolutuion_ComplexChoiceResolution_SimpleChoiceResolution(context, (ChoiceResolutuion) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getComplexChoiceResolutionRule()) {
					sequence_ComplexChoiceResolution(context, (ChoiceResolutuion) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSimpleChoiceResolutionRule()) {
					sequence_SimpleChoiceResolution(context, (ChoiceResolutuion) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.COMPOSITE_VARIATION_POINT:
				if(context == grammarAccess.getCompositeVariationPoint_ImplRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVariationPointRule()) {
					sequence_CompositeVariationPoint_Impl(context, (CompositeVariationPoint) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.CONFIGURABLE_UNIT:
				if(context == grammarAccess.getConfigurableUnitRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVariationPointRule()) {
					sequence_ConfigurableUnit(context, (ConfigurableUnit) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.CONFIGURABLE_UNIT_USAGE:
				if(context == grammarAccess.getConfigurableUnitUsageRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVariationPointRule()) {
					sequence_ConfigurableUnitUsage(context, (ConfigurableUnitUsage) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.CONSTRAINT:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getConstraint_ImplRule() ||
				   context == grammarAccess.getVPackageableRule()) {
					sequence_Constraint_Impl(context, (Constraint) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.FRAGMENT_SUBSTITUTION:
				if(context == grammarAccess.getFragmentSubstitutionRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVariationPointRule()) {
					sequence_FragmentSubstitution(context, (FragmentSubstitution) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.FROM_BINDING:
				if(context == grammarAccess.getBoundaryElementBindingRule() ||
				   context == grammarAccess.getFromBindingRule()) {
					sequence_FromBinding(context, (FromBinding) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.FROM_PLACEMENT:
				if(context == grammarAccess.getFromPlacementRule() ||
				   context == grammarAccess.getPlacementBoundaryElementRule()) {
					sequence_FromPlacement(context, (FromPlacement) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.FROM_REPLACEMENT:
				if(context == grammarAccess.getFromReplacementRule() ||
				   context == grammarAccess.getReplacementBoundaryElementRule()) {
					sequence_FromReplacement(context, (FromReplacement) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.INTEGER_LITERAL_EXP:
				if(context == grammarAccess.getIntegerLiteralExpRule() ||
				   context == grammarAccess.getOCLExpressionRule()) {
					sequence_IntegerLiteralExp(context, (IntegerLiteralExp) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.LINK_ASSIGNMENT:
				if(context == grammarAccess.getLinkAssignmentRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVariationPointRule()) {
					sequence_LinkAssignment(context, (LinkAssignment) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.LINK_EXISTENCE:
				if(context == grammarAccess.getLinkExistenceRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVariationPointRule()) {
					sequence_LinkExistence(context, (LinkExistence) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.LINK_HANDLE:
				if(context == grammarAccess.getCompleteLinkHandleRule()) {
					sequence_CompleteLinkHandle(context, (LinkHandle) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBaseModelHandleRule() ||
				   context == grammarAccess.getLinkHandleRule()) {
					sequence_CompleteLinkHandle_LinkHandle_SimpleLinkHandle(context, (LinkHandle) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSimpleLinkHandleRule()) {
					sequence_SimpleLinkHandle(context, (LinkHandle) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.MULTIPLICITY_INTERVAL:
				if(context == grammarAccess.getMultiplicityIntervalRule()) {
					sequence_MultiplicityInterval(context, (MultiplicityInterval) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.NUMERIC_LITERAL_EXP:
				if(context == grammarAccess.getNumericLiteralExp_ImplRule() ||
				   context == grammarAccess.getOCLExpressionRule()) {
					sequence_NumericLiteralExp_Impl(context, (NumericLiteralExp) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.OCL_CONSTRAINT:
				if(context == grammarAccess.getComplexOCLConstraintRule()) {
					sequence_ComplexOCLConstraint(context, (OCLConstraint) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getOCLConstraintRule() ||
				   context == grammarAccess.getVPackageableRule()) {
					sequence_ComplexOCLConstraint_OCLConstraint_SimpleOCLConstraint(context, (OCLConstraint) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSimpleOCLConstraintRule()) {
					sequence_SimpleOCLConstraint(context, (OCLConstraint) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.OCL_EXPRESSION:
				if(context == grammarAccess.getOCLExpressionRule() ||
				   context == grammarAccess.getOCLExpression_ImplRule()) {
					sequence_OCLExpression_Impl(context, (OCLExpression) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.OVP_SEMANTIC_SPEC:
				if(context == grammarAccess.getOVPSemanticSpecRule()) {
					sequence_OVPSemanticSpec(context, (OVPSemanticSpec) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.OVP_TYPE:
				if(context == grammarAccess.getOVPTypeRule()) {
					sequence_OVPType(context, (OVPType) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.OBJECT_EXISTENCE:
				if(context == grammarAccess.getObjectExistenceRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVariationPointRule()) {
					sequence_ObjectExistence(context, (ObjectExistence) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.OBJECT_HANDLE:
				if(context == grammarAccess.getCompleteObjectHandleRule()) {
					sequence_CompleteObjectHandle(context, (ObjectHandle) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBaseModelHandleRule() ||
				   context == grammarAccess.getObjectHandleRule()) {
					sequence_CompleteObjectHandle_ObjectHandle_SimpleObjectHandle(context, (ObjectHandle) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSimpleObjectHandleRule()) {
					sequence_SimpleObjectHandle(context, (ObjectHandle) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.OBJECT_SPECIFICATION:
				if(context == grammarAccess.getObjectSpecificationRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_ObjectSpecification(context, (ObjectSpecification) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.OBJECT_SUBSTITUTION:
				if(context == grammarAccess.getCvlObjectSubstitutionRule()) {
					sequence_CvlObjectSubstitution(context, (ObjectSubstitution) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getObjectSubstitutionRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVariationPointRule()) {
					sequence_CvlObjectSubstitution_ObjectSubstitution_PatternRoleBinding(context, (ObjectSubstitution) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPatternRoleBindingRule()) {
					sequence_PatternRoleBinding(context, (ObjectSubstitution) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.OBJECT_TYPE:
				if(context == grammarAccess.getObjectTypeRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVariabletypeRule()) {
					sequence_ObjectType(context, (ObjectType) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.OPAQUE_CONSTRAINT:
				if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getOpaqueConstraintRule() ||
				   context == grammarAccess.getVPackageableRule()) {
					sequence_OpaqueConstraint(context, (OpaqueConstraint) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.OPAQUE_VARIATION_POINT:
				if(context == grammarAccess.getOpaqueVariationPointRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVariationPointRule()) {
					sequence_OpaqueVariationPoint(context, (OpaqueVariationPoint) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.OPERATION_CALL_EXP:
				if(context == grammarAccess.getOCLExpressionRule() ||
				   context == grammarAccess.getOperationCallExpRule()) {
					sequence_OperationCallExp(context, (OperationCallExp) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.PARAMETRIC_LINK_ASSIGNMENT:
				if(context == grammarAccess.getParametricLinkAssignmentRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVariationPointRule()) {
					sequence_ParametricLinkAssignment(context, (ParametricLinkAssignment) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.PARAMETRIC_OBJECT_SUBSTITUTION:
				if(context == grammarAccess.getParametricObjectSubstitutionRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVariationPointRule()) {
					sequence_ParametricObjectSubstitution(context, (ParametricObjectSubstitution) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.PARAMETRIC_SLOT_ASSIGNMET:
				if(context == grammarAccess.getParametricSlotAssignmetRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVariationPointRule()) {
					sequence_ParametricSlotAssignmet(context, (ParametricSlotAssignmet) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.PATTERN_FUSION:
				if(context == grammarAccess.getPatternFusionRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVariationPointRule()) {
					sequence_PatternFusion(context, (PatternFusion) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.PATTERN_INTEGRATION:
				if(context == grammarAccess.getPatternIntegrationRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVariationPointRule()) {
					sequence_PatternIntegration(context, (PatternIntegration) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.PLACEMENT_FRAGMENT:
				if(context == grammarAccess.getPlacementFragmentRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVariationPointRule()) {
					sequence_PlacementFragment(context, (PlacementFragment) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.PRIMITIVE_VALUE_SPECIFICATION:
				if(context == grammarAccess.getComplexPrimitiveValueSpecificationRule()) {
					sequence_ComplexPrimitiveValueSpecification(context, (PrimitiveValueSpecification) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPrimitiveValueSpecificationRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_ComplexPrimitiveValueSpecification_PrimitiveValueSpecification_SimplePrimitiveValueSpecification(context, (PrimitiveValueSpecification) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSimplePrimitiveValueSpecificationRule()) {
					sequence_SimplePrimitiveValueSpecification(context, (PrimitiveValueSpecification) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.PRIMITVE_TYPE:
				if(context == grammarAccess.getPrimitveTypeRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVariabletypeRule()) {
					sequence_PrimitveType(context, (PrimitveType) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.REAL_LITERAL_EXP:
				if(context == grammarAccess.getOCLExpressionRule() ||
				   context == grammarAccess.getRealLiteralExpRule()) {
					sequence_RealLiteralExp(context, (RealLiteralExp) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.REPLACEMENT_FRAGMENT_SPECIFICATION:
				if(context == grammarAccess.getReplacementFragmentSpecificationRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_ReplacementFragmentSpecification(context, (ReplacementFragmentSpecification) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.REPLACEMENT_FRAGMENT_TYPE:
				if(context == grammarAccess.getReplacementFragmentTypeRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVariabletypeRule()) {
					sequence_ReplacementFragmentType(context, (ReplacementFragmentType) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.SLOT_ASSIGNMENT:
				if(context == grammarAccess.getSlotAssignmentRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVariationPointRule()) {
					sequence_SlotAssignment(context, (SlotAssignment) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.SLOT_VALUE_EXISTENCE:
				if(context == grammarAccess.getSlotValueExistenceRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVariationPointRule()) {
					sequence_SlotValueExistence(context, (SlotValueExistence) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.STRING_LITERAL_EXP:
				if(context == grammarAccess.getOCLExpressionRule() ||
				   context == grammarAccess.getStringLiteralExpRule()) {
					sequence_StringLiteralExp(context, (StringLiteralExp) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.STRUCTURAL_ORGANISATIONAL_PATTERN:
				if(context == grammarAccess.getStructuralOrganisationalPatternRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVariationPointRule()) {
					sequence_StructuralOrganisationalPattern(context, (StructuralOrganisationalPattern) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.TO_BINDING:
				if(context == grammarAccess.getBoundaryElementBindingRule() ||
				   context == grammarAccess.getToBindingRule()) {
					sequence_ToBinding(context, (ToBinding) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.TO_PLACEMENT:
				if(context == grammarAccess.getPlacementBoundaryElementRule() ||
				   context == grammarAccess.getToPlacementRule()) {
					sequence_ToPlacement(context, (ToPlacement) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.TO_REPLACEMENT:
				if(context == grammarAccess.getReplacementBoundaryElementRule() ||
				   context == grammarAccess.getToReplacementRule()) {
					sequence_ToReplacement(context, (ToReplacement) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.UNLIMITED_LITERAL_EXP:
				if(context == grammarAccess.getOCLExpressionRule() ||
				   context == grammarAccess.getUnlimitedLiteralExpRule()) {
					sequence_UnlimitedLiteralExp(context, (UnlimitedLiteralExp) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.VCLASSIFIER:
				if(context == grammarAccess.getVClassifierRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVSpecRule()) {
					sequence_VClassifier(context, (VClassifier) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.VCONFIGURATION:
				if(context == grammarAccess.getVConfigurationRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVSpecResolutionRule()) {
					sequence_VConfiguration(context, (VConfiguration) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.VINSTANCE:
				if(context == grammarAccess.getVInstanceRule() ||
				   context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVSpecResolutionRule()) {
					sequence_VInstance(context, (VInstance) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.VINTERFACE:
				if(context == grammarAccess.getVInterfaceRule()) {
					sequence_VInterface(context, (VInterface) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.VPACKAGE:
				if(context == grammarAccess.getVPackageRule() ||
				   context == grammarAccess.getVPackageableRule()) {
					sequence_VPackage(context, (VPackage) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.VSPEC_DERIVATION:
				if(context == grammarAccess.getVSpecDerivationRule() ||
				   context == grammarAccess.getVSpecDerivation_ImplRule()) {
					sequence_VSpecDerivation_Impl(context, (VSpecDerivation) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.VSPEC_REF:
				if(context == grammarAccess.getOCLExpressionRule() ||
				   context == grammarAccess.getVSpecRefRule()) {
					sequence_VSpecRef(context, (VSpecRef) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.VARIABLE:
				if(context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVSpecRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_ComplexVariable_SimpleVariable_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getComplexVariableRule()) {
					sequence_ComplexVariable(context, (Variable) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSimpleVariableRule()) {
					sequence_SimpleVariable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.VARIABLE_DERIVATION:
				if(context == grammarAccess.getVSpecDerivationRule() ||
				   context == grammarAccess.getVariableDerivationRule()) {
					sequence_VariableDerivation(context, (VariableDerivation) semanticObject); 
					return; 
				}
				else break;
			case CvlPackage.VARIABLE_VALUE_ASSIGNMENT:
				if(context == grammarAccess.getVPackageableRule() ||
				   context == grammarAccess.getVSpecResolutionRule() ||
				   context == grammarAccess.getVariableValueAssignmentRule()) {
					sequence_ComplexVariableValueAssignment_SimpleVariableValueAssignment_VariableValueAssignment(context, (VariableValueAssignment) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getComplexVariableValueAssignmentRule()) {
					sequence_ComplexVariableValueAssignment(context, (VariableValueAssignment) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSimpleVariableValueAssignmentRule()) {
					sequence_SimpleVariableValueAssignment(context, (VariableValueAssignment) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == TypesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TypesPackage.JVM_FORMAL_PARAMETER:
				if(context == grammarAccess.getFullJvmFormalParameterRule()) {
					sequence_FullJvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJvmFormalParameterRule()) {
					sequence_JvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_GENERIC_ARRAY_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()) {
					sequence_JvmTypeReference(context, (JvmGenericArrayTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_LOWER_BOUND:
				if(context == grammarAccess.getJvmLowerBoundRule()) {
					sequence_JvmLowerBound(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_PARAMETERIZED_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmParameterizedTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()) {
					sequence_JvmParameterizedTypeReference(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_TYPE_PARAMETER:
				if(context == grammarAccess.getJvmTypeParameterRule()) {
					sequence_JvmTypeParameter(context, (JvmTypeParameter) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_UPPER_BOUND:
				if(context == grammarAccess.getJvmUpperBoundAndedRule()) {
					sequence_JvmUpperBoundAnded(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getJvmUpperBoundRule()) {
					sequence_JvmUpperBound(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_WILDCARD_TYPE_REFERENCE:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmWildcardTypeReferenceRule()) {
					sequence_JvmWildcardTypeReference(context, (JvmWildcardTypeReference) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == XbasePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XbasePackage.XASSIGNMENT:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XAssignment_XMemberFeatureCall(context, (XAssignment) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBINARY_OPERATION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XAdditiveExpression_XAndExpression_XAssignment_XEqualityExpression_XMultiplicativeExpression_XOrExpression_XOtherOperatorExpression_XRelationalExpression(context, (XBinaryOperation) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBLOCK_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXBlockExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XBlockExpression(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXExpressionInClosureRule()) {
					sequence_XExpressionInClosure(context, (XBlockExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XBOOLEAN_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXBooleanLiteralRule() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XBooleanLiteral(context, (XBooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCASE_PART:
				if(context == grammarAccess.getXCasePartRule()) {
					sequence_XCasePart(context, (XCasePart) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCASTED_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XCastedExpression(context, (XCastedExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCATCH_CLAUSE:
				if(context == grammarAccess.getXCatchClauseRule()) {
					sequence_XCatchClause(context, (XCatchClause) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCLOSURE:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXClosureRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXShortClosureRule()) {
					sequence_XShortClosure(context, (XClosure) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XCONSTRUCTOR_CALL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXConstructorCallRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XConstructorCall(context, (XConstructorCall) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XDO_WHILE_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXDoWhileExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XDoWhileExpression(context, (XDoWhileExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XFEATURE_CALL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XFeatureCall(context, (XFeatureCall) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XFOR_LOOP_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXForLoopExpressionRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XForLoopExpression(context, (XForLoopExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XIF_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXIfExpressionRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XIfExpression(context, (XIfExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XINSTANCE_OF_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XRelationalExpression(context, (XInstanceOfExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XMEMBER_FEATURE_CALL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XMemberFeatureCall(context, (XMemberFeatureCall) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XNULL_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXNullLiteralRule() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XNullLiteral(context, (XNullLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XNUMBER_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXNumberLiteralRule() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XNumberLiteral(context, (XNumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XRETURN_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXReturnExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XReturnExpression(context, (XReturnExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XSTRING_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXStringLiteralRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XStringLiteral(context, (XStringLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XSWITCH_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXSwitchExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XSwitchExpression(context, (XSwitchExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XTHROW_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXThrowExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XThrowExpression(context, (XThrowExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XTRY_CATCH_FINALLY_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXTryCatchFinallyExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XTryCatchFinallyExpression(context, (XTryCatchFinallyExpression) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XTYPE_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXTypeLiteralRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XTypeLiteral(context, (XTypeLiteral) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XUNARY_OPERATION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XUnaryOperation(context, (XUnaryOperation) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XVARIABLE_DECLARATION:
				if(context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXVariableDeclarationRule()) {
					sequence_XVariableDeclaration(context, (XVariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			case XbasePackage.XWHILE_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXAssignmentRule() ||
				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXCastedExpressionRule() ||
				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
				   context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpressionInsideBlockRule() ||
				   context == grammarAccess.getXMemberFeatureCallRule() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule() ||
				   context == grammarAccess.getXWhileExpressionRule()) {
					sequence_XWhileExpression(context, (XWhileExpression) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == XtypePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case XtypePackage.XFUNCTION_TYPE_REF:
				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
				   context == grammarAccess.getJvmTypeReferenceRule() ||
				   context == grammarAccess.getXFunctionTypeRefRule()) {
					sequence_XFunctionTypeRef(context, (XFunctionTypeRef) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (reference=[EObject|STRING]?)
	 */
	protected void sequence_BaseModelHandle_Impl(EObject context, BaseModelHandle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     bool?='bool'
	 */
	protected void sequence_BooleanLiteralExp(EObject context, BooleanLiteralExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.BOOLEAN_LITERAL_EXP__BOOL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.BOOLEAN_LITERAL_EXP__BOOL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanLiteralExpAccess().getBoolBoolKeyword_0_0(), semanticObject.isBool());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING derivedVSpec=[VSpec|ID] memberDerivation+=VSpecDerivation*)
	 */
	protected void sequence_CVSpecDerivation(EObject context, CVSpecDerivation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         resolutionTime=STRING 
	 *         extension=[VInterface|ID] 
	 *         groupMultiplicity=MultiplicityInterval? 
	 *         ownedVSpecDerivation=VSpecDerivation? 
	 *         child+=VSpec*
	 *     )
	 */
	protected void sequence_CVSpec(EObject context, CVSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID derivedVSpec=[VSpec|ID] derivingConstraint=Constraint)
	 */
	protected void sequence_ChoiceDerivation(EObject context, ChoiceDerivation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.VPACKAGEABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.VPACKAGEABLE__NAME));
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.VSPEC_DERIVATION__DERIVED_VSPEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.VSPEC_DERIVATION__DERIVED_VSPEC));
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.CHOICE_DERIVATION__DERIVING_CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.CHOICE_DERIVATION__DERIVING_CONSTRAINT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getChoiceDerivationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getChoiceDerivationAccess().getDerivedVSpecVSpecIDTerminalRuleCall_4_0_1(), semanticObject.getDerivedVSpec());
		feeder.accept(grammarAccess.getChoiceDerivationAccess().getDerivingConstraintConstraintParserRuleCall_6_0(), semanticObject.getDerivingConstraint());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (name=ID decision=BOOLEAN resolvedChoice=[Choice|ID] (child+=VSpecResolution child+=VSpecResolution*)?) | 
	 *         (resolvedChoice=[Choice|ID] decision=BOOLEAN)
	 *     )
	 */
	protected void sequence_ChoiceResolutuion_ComplexChoiceResolution_SimpleChoiceResolution(EObject context, ChoiceResolutuion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         groupMultiplicity=MultiplicityInterval? 
	 *         (
	 *             defaultResolution?='default'? 
	 *             isImpliedByParent?='implied'? 
	 *             resolutionTime=STRING? 
	 *             ownedVSpecDerivation=VSpecDerivation? 
	 *             (child+=VSpec child+=VSpec*)?
	 *         )?
	 *     )
	 */
	protected void sequence_Choice(EObject context, Choice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (MOFRef=STRING referenceString=STRING)
	 */
	protected void sequence_CompleteLinkHandle(EObject context, LinkHandle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (referenceString=STRING | (MOFRef=STRING referenceString=STRING))
	 */
	protected void sequence_CompleteLinkHandle_LinkHandle_SimpleLinkHandle(EObject context, LinkHandle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (MOFRef=STRING referenceString=STRING)
	 */
	protected void sequence_CompleteObjectHandle(EObject context, ObjectHandle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (referenceString=STRING | (MOFRef=STRING referenceString=STRING))
	 */
	protected void sequence_CompleteObjectHandle_ObjectHandle_SimpleObjectHandle(EObject context, ObjectHandle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID decision=BOOLEAN resolvedChoice=[Choice|ID] (child+=VSpecResolution child+=VSpecResolution*)?)
	 */
	protected void sequence_ComplexChoiceResolution(EObject context, ChoiceResolutuion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID context=[VSpec|ID]? expression+=OCLExpression*)
	 */
	protected void sequence_ComplexOCLConstraint(EObject context, OCLConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((expression+=OCLExpression context=[VSpec|ID]) | (name=ID context=[VSpec|ID]? expression+=OCLExpression*))
	 */
	protected void sequence_ComplexOCLConstraint_OCLConstraint_SimpleOCLConstraint(EObject context, OCLConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=STRING? type=[Variabletype|ID] expression=OCLExpression)
	 */
	protected void sequence_ComplexPrimitiveValueSpecification(EObject context, PrimitiveValueSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=STRING | (value=STRING? type=[Variabletype|ID] expression=OCLExpression))
	 */
	protected void sequence_ComplexPrimitiveValueSpecification_PrimitiveValueSpecification_SimplePrimitiveValueSpecification(EObject context, PrimitiveValueSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (resolvedVariable=[Variable|ID] value=ValueSpecification) | 
	 *         (name=ID resolvedVSpec=[VSpec|ID] resolvedVariable=[Variable|ID] value=ValueSpecification (child+=VSpecResolution child+=VSpecResolution*)?)
	 *     )
	 */
	protected void sequence_ComplexVariableValueAssignment_SimpleVariableValueAssignment_VariableValueAssignment(EObject context, VariableValueAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID resolvedVSpec=[VSpec|ID] resolvedVariable=[Variable|ID] value=ValueSpecification (child+=VSpecResolution child+=VSpecResolution*)?)
	 */
	protected void sequence_ComplexVariableValueAssignment(EObject context, VariableValueAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (name=ID type=[Variabletype|ID]) | 
	 *         (
	 *             name=ID 
	 *             resolutionTime=STRING? 
	 *             replacementFragmentTypesubsetstype=[ReplacementFragmentType|ID]? 
	 *             type=[Variabletype|ID] 
	 *             groupMultiplicity=MultiplicityInterval? 
	 *             ownedVSpecDerivation=VSpecDerivation? 
	 *             defaulValue=ValueSpecification? 
	 *             (child+=VSpec child+=VSpec*)?
	 *         )
	 *     )
	 */
	protected void sequence_ComplexVariable_SimpleVariable_Variable(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         resolutionTime=STRING? 
	 *         replacementFragmentTypesubsetstype=[ReplacementFragmentType|ID]? 
	 *         type=[Variabletype|ID] 
	 *         groupMultiplicity=MultiplicityInterval? 
	 *         ownedVSpecDerivation=VSpecDerivation? 
	 *         defaulValue=ValueSpecification? 
	 *         (child+=VSpec child+=VSpec*)?
	 *     )
	 */
	protected void sequence_ComplexVariable(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (bindingVspec+=[VSpec|ID] bindingVspec+=[VSpec|ID]*)? 
	 *         (precedenceConstraint+=[VariationPoint|ID] precedenceConstraint+=[VariationPoint|ID]*)? 
	 *         bindingCVSpec=[CVSpec|ID] 
	 *         children+=VariationPoint*
	 *     )
	 */
	protected void sequence_CompositeVariationPoint_Impl(EObject context, CompositeVariationPoint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         linkEndIdentifier=STRING 
	 *         (bindingVspec+=[VSpec|ID] bindingVspec+=[VSpec|ID]*)? 
	 *         (precedenceConstraint+=[VariationPoint|ID] precedenceConstraint+=[VariationPoint|ID]*)? 
	 *         bindingCVSpec=[CVSpec|ID] 
	 *         usedUnit=[ConfigurableUnit|ID] 
	 *         usageReference=LinkHandle 
	 *         children+=VariationPoint*
	 *     )
	 */
	protected void sequence_ConfigurableUnitUsage(EObject context, ConfigurableUnitUsage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (bindingVspec+=[VSpec|ID] bindingVspec+=[VSpec|ID]*)? 
	 *         (precedenceConstraint+=[VariationPoint|ID] precedenceConstraint+=[VariationPoint|ID]*)? 
	 *         bindingCVSpec=[CVSpec|ID] 
	 *         unitInterface=[VInterface|ID] 
	 *         children+=VariationPoint* 
	 *         ownedVSpec+=VSpec* 
	 *         ownedVariationPoint+=VariationPoint* 
	 *         ownedConstraint+=Constraint* 
	 *         ownedVSpecResolution+=VSpecResolution* 
	 *         configurableContainerObject=ObjectHandle
	 *     )
	 */
	protected void sequence_ConfigurableUnit(EObject context, ConfigurableUnit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID context=[VSpec|ID]?)
	 */
	protected void sequence_Constraint_Impl(EObject context, Constraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         mappingExpression=STRING? 
	 *         expression=STRING? 
	 *         (bindingVspec+=[VSpec|ID] bindingVspec+=[VSpec|ID]*)? 
	 *         (precedenceConstraint+=[VariationPoint|ID] precedenceConstraint+=[VariationPoint|ID]*)? 
	 *         placementObject=ObjectHandle 
	 *         replacementObject=ObjectHandle 
	 *         (bindingChoice+=[Choice|ID] bindingChoice+=[Choice|ID]*)?
	 *     )
	 */
	protected void sequence_CvlObjectSubstitution(EObject context, ObjectSubstitution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             name=ID 
	 *             mappingExpression=STRING? 
	 *             expression=STRING? 
	 *             (bindingVspec+=[VSpec|ID] bindingVspec+=[VSpec|ID]*)? 
	 *             (precedenceConstraint+=[VariationPoint|ID] precedenceConstraint+=[VariationPoint|ID]*)? 
	 *             placementObject=ObjectHandle 
	 *             replacementObject=ObjectHandle 
	 *             (bindingChoice+=[Choice|ID] bindingChoice+=[Choice|ID]*)?
	 *         ) | 
	 *         (name=ID placementObject=ObjectHandle replacementObject=ObjectHandle)
	 *     )
	 */
	protected void sequence_CvlObjectSubstitution_ObjectSubstitution_PatternRoleBinding(EObject context, ObjectSubstitution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         multi?='[*]' 
	 *         mappingExpression=STRING? 
	 *         expression=STRING? 
	 *         (bindingVspec+=[VSpec|ID] bindingVspec+=[VSpec|ID]*)? 
	 *         (precedenceConstraint+=[VariationPoint|ID] precedenceConstraint+=[VariationPoint|ID]*)? 
	 *         (bindingChoice+=[Choice|ID] bindingChoice+=[Choice|ID]*)? 
	 *         bindingClassifier=[VClassifier|ID] 
	 *         placement=[PlacementFragment|ID] 
	 *         replacement=[ReplacementFragmentType|ID]? 
	 *         boundaryElementBinding+=BoundaryElementBinding*
	 *     )
	 */
	protected void sequence_FragmentSubstitution(EObject context, FragmentSubstitution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fromPlacement=[FromPlacement|ID] fromReplacement=[FromReplacement|ID])
	 */
	protected void sequence_FromBinding(EObject context, FromBinding semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.FROM_BINDING__FROM_PLACEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.FROM_BINDING__FROM_PLACEMENT));
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.FROM_BINDING__FROM_REPLACEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.FROM_BINDING__FROM_REPLACEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFromBindingAccess().getFromPlacementFromPlacementIDTerminalRuleCall_3_0_1(), semanticObject.getFromPlacement());
		feeder.accept(grammarAccess.getFromBindingAccess().getFromReplacementFromReplacementIDTerminalRuleCall_5_0_1(), semanticObject.getFromReplacement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (fromReplacement=[FromReplacement|ID]? outsideBoundaryElement+=ObjectHandle*)
	 */
	protected void sequence_FromPlacement(EObject context, FromPlacement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (propertyName=STRING fromPlacement=[FromPlacement|ID]? insideBoundaryElement=ObjectHandle? outsideBoundaryElement+=ObjectHandle*)
	 */
	protected void sequence_FromReplacement(EObject context, FromReplacement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     integer=INT
	 */
	protected void sequence_IntegerLiteralExp(EObject context, IntegerLiteralExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.INTEGER_LITERAL_EXP__INTEGER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.INTEGER_LITERAL_EXP__INTEGER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerLiteralExpAccess().getIntegerINTTerminalRuleCall_3_0(), semanticObject.getInteger());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         mappingExpression=STRING? 
	 *         expression=STRING? 
	 *         (bindingVspec+=[VSpec|ID] bindingVspec+=[VSpec|ID]*)? 
	 *         (precedenceConstraint+=[VariationPoint|ID] precedenceConstraint+=[VariationPoint|ID]*)? 
	 *         link=LinkHandle 
	 *         linkEndIdentifier=STRING 
	 *         newEnd=ObjectHandle 
	 *         (bindingChoice+=[Choice|ID] bindingChoice+=[Choice|ID]*)?
	 *     )
	 */
	protected void sequence_LinkAssignment(EObject context, LinkAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         mappingExpression=STRING? 
	 *         expression=STRING? 
	 *         (bindingVspec+=[VSpec|ID] bindingVspec+=[VSpec|ID]*)? 
	 *         (precedenceConstraint+=[VariationPoint|ID] precedenceConstraint+=[VariationPoint|ID]*)? 
	 *         optionalLink=LinkHandle 
	 *         (bindingChoice+=[Choice|ID] bindingChoice+=[Choice|ID]*)?
	 *     )
	 */
	protected void sequence_LinkExistence(EObject context, LinkExistence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lower=INT upper=INT)
	 */
	protected void sequence_MultiplicityInterval(EObject context, MultiplicityInterval semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.MULTIPLICITY_INTERVAL__UPPER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.MULTIPLICITY_INTERVAL__UPPER));
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.MULTIPLICITY_INTERVAL__LOWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.MULTIPLICITY_INTERVAL__LOWER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicityIntervalAccess().getLowerINTTerminalRuleCall_1_0(), semanticObject.getLower());
		feeder.accept(grammarAccess.getMultiplicityIntervalAccess().getUpperINTTerminalRuleCall_3_0(), semanticObject.getUpper());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {NumericLiteralExp}
	 */
	protected void sequence_NumericLiteralExp_Impl(EObject context, NumericLiteralExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {OCLExpression}
	 */
	protected void sequence_OCLExpression_Impl(EObject context, OCLExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modelTransformation=STRING transfromationLanguage=STRING)
	 */
	protected void sequence_OVPSemanticSpec(EObject context, OVPSemanticSpec semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.OVP_SEMANTIC_SPEC__MODEL_TRANSFORMATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.OVP_SEMANTIC_SPEC__MODEL_TRANSFORMATION));
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.OVP_SEMANTIC_SPEC__TRANSFROMATION_LANGUAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.OVP_SEMANTIC_SPEC__TRANSFROMATION_LANGUAGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOVPSemanticSpecAccess().getModelTransformationSTRINGTerminalRuleCall_3_0(), semanticObject.getModelTransformation());
		feeder.accept(grammarAccess.getOVPSemanticSpecAccess().getTransfromationLanguageSTRINGTerminalRuleCall_5_0(), semanticObject.getTransfromationLanguage());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID spec=OVPSemanticSpec)
	 */
	protected void sequence_OVPType(EObject context, OVPType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.VPACKAGEABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.VPACKAGEABLE__NAME));
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.OVP_TYPE__SPEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.OVP_TYPE__SPEC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOVPTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getOVPTypeAccess().getSpecOVPSemanticSpecParserRuleCall_4_0(), semanticObject.getSpec());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         mappingExpression=STRING? 
	 *         expression=STRING? 
	 *         (bindingVspec+=[VSpec|ID] bindingVspec+=[VSpec|ID]*)? 
	 *         (precedenceConstraint+=[VariationPoint|ID] precedenceConstraint+=[VariationPoint|ID]*)? 
	 *         (bindingChoice+=[Choice|ID] bindingChoice+=[Choice|ID]*)? 
	 *         optionalObject+=ObjectHandle* 
	 *         (bindingChoice+=[Choice|ID] bindingChoice+=[Choice|ID]*)?
	 *     )
	 */
	protected void sequence_ObjectExistence(EObject context, ObjectExistence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Variabletype|ID] object=[ObjectHandle|ID])
	 */
	protected void sequence_ObjectSpecification(EObject context, ObjectSpecification semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.VALUE_SPECIFICATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.VALUE_SPECIFICATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.OBJECT_SPECIFICATION__OBJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.OBJECT_SPECIFICATION__OBJECT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getObjectSpecificationAccess().getTypeVariabletypeIDTerminalRuleCall_3_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getObjectSpecificationAccess().getObjectObjectHandleIDTerminalRuleCall_5_0_1(), semanticObject.getObject());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID metaClass=STRING)
	 */
	protected void sequence_ObjectType(EObject context, ObjectType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.VPACKAGEABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.VPACKAGEABLE__NAME));
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.OBJECT_TYPE__META_CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.OBJECT_TYPE__META_CLASS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getObjectTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getObjectTypeAccess().getMetaClassSTRINGTerminalRuleCall_4_0(), semanticObject.getMetaClass());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID constraint=STRING constraintLanguage=STRING context=[VSpec|ID]?)
	 */
	protected void sequence_OpaqueConstraint(EObject context, OpaqueConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         mappingExpression=STRING? 
	 *         expression=STRING? 
	 *         (bindingVspec+=[VSpec|ID] bindingVspec+=[VSpec|ID]*)? 
	 *         (precedenceConstraint+=[VariationPoint|ID] precedenceConstraint+=[VariationPoint|ID]*)? 
	 *         (bindingChoice+=[Choice|ID] bindingChoice+=[Choice|ID]*)? 
	 *         type=[OVPType|ID] 
	 *         placeHolder=BaseModelHandle 
	 *         sourceObject+=ObjectHandle*
	 *     )
	 */
	protected void sequence_OpaqueVariationPoint(EObject context, OpaqueVariationPoint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operation=Operation (argument+=OCLExpression argument+=OCLExpression*)?)
	 */
	protected void sequence_OperationCallExp(EObject context, OperationCallExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         linkEndIdentifier=STRING 
	 *         (bindingVspec+=[VSpec|ID] bindingVspec+=[VSpec|ID]*)? 
	 *         (precedenceConstraint+=[VariationPoint|ID] precedenceConstraint+=[VariationPoint|ID]*)? 
	 *         bindingVariable=[Variable|ID] 
	 *         link=LinkHandle
	 *     )
	 */
	protected void sequence_ParametricLinkAssignment(EObject context, ParametricLinkAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=STRING 
	 *         (bindingVspec+=[VSpec|ID] bindingVspec+=[VSpec|ID]*)? 
	 *         (precedenceConstraint+=[VariationPoint|ID] precedenceConstraint+=[VariationPoint|ID]*)? 
	 *         bindingVariable=[Variable|ID] 
	 *         placementObject=ObjectHandle
	 *     )
	 */
	protected void sequence_ParametricObjectSubstitution(EObject context, ParametricObjectSubstitution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         slotIdentifier=STRING 
	 *         (bindingVspec+=[VSpec|ID] bindingVspec+=[VSpec|ID]*)? 
	 *         (precedenceConstraint+=[VariationPoint|ID] precedenceConstraint+=[VariationPoint|ID]*)? 
	 *         bindingVariable=[Variable|ID] 
	 *         slotOwner=ObjectHandle
	 *     )
	 */
	protected void sequence_ParametricSlotAssignmet(EObject context, ParametricSlotAssignmet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         multi?='[*]'? 
	 *         mappingExpression=STRING? 
	 *         expression=STRING? 
	 *         (bindingVspec+=[VSpec|ID] bindingVspec+=[VSpec|ID]*)? 
	 *         (precedenceConstraint+=[VariationPoint|ID] precedenceConstraint+=[VariationPoint|ID]*)? 
	 *         (bindingChoice+=[Choice|ID] bindingChoice+=[Choice|ID]*)? 
	 *         bindingClassifier=[VClassifier|ID]? 
	 *         (substitutes+=[ObjectSubstitution|ID] substitutes+=[ObjectSubstitution|ID]*)?
	 *     )
	 */
	protected void sequence_PatternFusion(EObject context, PatternFusion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         multi?='[*]'? 
	 *         mappingExpression=STRING? 
	 *         expression=STRING? 
	 *         (bindingVspec+=[VSpec|ID] bindingVspec+=[VSpec|ID]*)? 
	 *         (precedenceConstraint+=[VariationPoint|ID] precedenceConstraint+=[VariationPoint|ID]*)? 
	 *         (bindingChoice+=[Choice|ID] bindingChoice+=[Choice|ID]*)? 
	 *         bindingClassifier=[VClassifier|ID] 
	 *         (substitutes+=[ObjectSubstitution|ID] substitutes+=[ObjectSubstitution|ID]*)?
	 *     )
	 */
	protected void sequence_PatternIntegration(EObject context, PatternIntegration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID placementObject=ObjectHandle replacementObject=ObjectHandle)
	 */
	protected void sequence_PatternRoleBinding(EObject context, ObjectSubstitution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (bindingVspec+=[VSpec|ID] bindingVspec+=[VSpec|ID]*)? 
	 *         (precedenceConstraint+=[VariationPoint|ID] precedenceConstraint+=[VariationPoint|ID]*)? 
	 *         placementBoundaryElement+=PlacementBoundaryElement*
	 *     )
	 */
	protected void sequence_PlacementFragment(EObject context, PlacementFragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=PrimitiveTypeEnum)
	 */
	protected void sequence_PrimitveType(EObject context, PrimitveType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.VPACKAGEABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.VPACKAGEABLE__NAME));
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.PRIMITVE_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.PRIMITVE_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimitveTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPrimitveTypeAccess().getTypePrimitiveTypeEnumEnumRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     real=EDouble
	 */
	protected void sequence_RealLiteralExp(EObject context, RealLiteralExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.REAL_LITERAL_EXP__REAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.REAL_LITERAL_EXP__REAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRealLiteralExpAccess().getRealEDoubleParserRuleCall_3_0(), semanticObject.getReal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=[Variabletype|ID]
	 */
	protected void sequence_ReplacementFragmentSpecification(EObject context, ReplacementFragmentSpecification semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.VALUE_SPECIFICATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.VALUE_SPECIFICATION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReplacementFragmentSpecificationAccess().getTypeVariabletypeIDTerminalRuleCall_3_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID replacementBoundaryElement+=ReplacementBoundaryElement* placementFragment+=PlacementFragment*)
	 */
	protected void sequence_ReplacementFragmentType(EObject context, ReplacementFragmentType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (resolvedChoice=[Choice|ID] decision=BOOLEAN)
	 */
	protected void sequence_SimpleChoiceResolution(EObject context, ChoiceResolutuion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     referenceString=STRING
	 */
	protected void sequence_SimpleLinkHandle(EObject context, LinkHandle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression+=OCLExpression context=[VSpec|ID])
	 */
	protected void sequence_SimpleOCLConstraint(EObject context, OCLConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     referenceString=STRING
	 */
	protected void sequence_SimpleObjectHandle(EObject context, ObjectHandle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_SimplePrimitiveValueSpecification(EObject context, PrimitiveValueSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (resolvedVariable=[Variable|ID] value=ValueSpecification)
	 */
	protected void sequence_SimpleVariableValueAssignment(EObject context, VariableValueAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=[Variabletype|ID])
	 */
	protected void sequence_SimpleVariable(EObject context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         mappingExpression=STRING? 
	 *         expression=STRING? 
	 *         slotIdentifier=STRING 
	 *         (bindingVspec+=[VSpec|ID] bindingVspec+=[VSpec|ID]*)? 
	 *         (precedenceConstraint+=[VariationPoint|ID] precedenceConstraint+=[VariationPoint|ID]*)? 
	 *         (bindingChoice+=[Choice|ID] bindingChoice+=[Choice|ID]*)? 
	 *         value=ValueSpecification? 
	 *         SlotOwner=ObjectHandle
	 *     )
	 */
	protected void sequence_SlotAssignment(EObject context, SlotAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         mappingExpression=STRING? 
	 *         expression=STRING? 
	 *         slotIdentifier=STRING 
	 *         (bindingVspec+=[VSpec|ID] bindingVspec+=[VSpec|ID]*)? 
	 *         (precedenceConstraint+=[VariationPoint|ID] precedenceConstraint+=[VariationPoint|ID]*)? 
	 *         (bindingChoice+=[Choice|ID] bindingChoice+=[Choice|ID]*)? 
	 *         slotOwner=ObjectHandle
	 *     )
	 */
	protected void sequence_SlotValueExistence(EObject context, SlotValueExistence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     string=STRING
	 */
	protected void sequence_StringLiteralExp(EObject context, StringLiteralExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.STRING_LITERAL_EXP__STRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.STRING_LITERAL_EXP__STRING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLiteralExpAccess().getStringSTRINGTerminalRuleCall_3_0(), semanticObject.getString());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         multi?='[*]'? 
	 *         mappingExpression=STRING? 
	 *         expression=STRING? 
	 *         (bindingVspec+=[VSpec|ID] bindingVspec+=[VSpec|ID]*)? 
	 *         (precedenceConstraint+=[VariationPoint|ID] precedenceConstraint+=[VariationPoint|ID]*)? 
	 *         (bindingChoice+=[Choice|ID] bindingChoice+=[Choice|ID]*)? 
	 *         bindingClassifier=[VClassifier|ID] 
	 *         (substitutes+=[ObjectSubstitution|ID] substitutes+=[ObjectSubstitution|ID]*)?
	 *     )
	 */
	protected void sequence_StructuralOrganisationalPattern(EObject context, StructuralOrganisationalPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (toPlacement=[ToPlacement|ID] toReplacement=[ToReplacement|ID])
	 */
	protected void sequence_ToBinding(EObject context, ToBinding semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.TO_BINDING__TO_PLACEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.TO_BINDING__TO_PLACEMENT));
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.TO_BINDING__TO_REPLACEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.TO_BINDING__TO_REPLACEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getToBindingAccess().getToPlacementToPlacementIDTerminalRuleCall_3_0_1(), semanticObject.getToPlacement());
		feeder.accept(grammarAccess.getToBindingAccess().getToReplacementToReplacementIDTerminalRuleCall_5_0_1(), semanticObject.getToReplacement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (propertyName=ID insideBoundaryElement+=ObjectHandle* outsideBoundaryElement=ObjectHandle?)
	 */
	protected void sequence_ToPlacement(EObject context, ToPlacement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (insideBoundaryElement+=ObjectHandle* toPlacement=ToPlacement?)
	 */
	protected void sequence_ToReplacement(EObject context, ToReplacement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     unlimited=INT
	 */
	protected void sequence_UnlimitedLiteralExp(EObject context, UnlimitedLiteralExp semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.UNLIMITED_LITERAL_EXP__UNLIMITED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.UNLIMITED_LITERAL_EXP__UNLIMITED));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnlimitedLiteralExpAccess().getUnlimitedINTTerminalRuleCall_3_0(), semanticObject.getUnlimited());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         groupMultiplicity=MultiplicityInterval? 
	 *         resolutionTime=STRING? 
	 *         ownedVSpecDerivation=VSpecDerivation? 
	 *         instanceMultiplicity=MultiplicityInterval 
	 *         (child+=VSpec child+=VSpec*)?
	 *     )
	 */
	protected void sequence_VClassifier(EObject context, VClassifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         isPartial?='isPartial' 
	 *         name=STRING 
	 *         resolvedVSpec=[VSpec|ID] 
	 *         super=[VConfiguration|ID]? 
	 *         resolvedVIRef=[CVSpec|ID] 
	 *         member+=VSpecResolution* 
	 *         child+=VSpecResolution*
	 *     )
	 */
	protected void sequence_VConfiguration(EObject context, VConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID resolvedVSpec=[VSpec|ID] type=[VClassifier|ID] (child+=VSpecResolution child+=VSpecResolution*)?)
	 */
	protected void sequence_VInstance(EObject context, VInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID super=[VInterface|ID]? ownedConstraint+=Constraint* member+=VSpec*)
	 */
	protected void sequence_VInterface(EObject context, VInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID packageElement+=VPackageable*)
	 */
	protected void sequence_VPackage(EObject context, VPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID derivedVSpec=[VSpec|ID])
	 */
	protected void sequence_VSpecDerivation_Impl(EObject context, VSpecDerivation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.VPACKAGEABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.VPACKAGEABLE__NAME));
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.VSPEC_DERIVATION__DERIVED_VSPEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.VSPEC_DERIVATION__DERIVED_VSPEC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVSpecDerivation_ImplAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVSpecDerivation_ImplAccess().getDerivedVSpecVSpecIDTerminalRuleCall_3_0_1(), semanticObject.getDerivedVSpec());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     vSpec=[VSpec|ID]
	 */
	protected void sequence_VSpecRef(EObject context, VSpecRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.VSPEC_REF__VSPEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.VSPEC_REF__VSPEC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVSpecRefAccess().getVSpecVSpecIDTerminalRuleCall_0_1(), semanticObject.getVSpec());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID derivedVSpec=[VSpec|ID] derivingExpression=OCLExpression)
	 */
	protected void sequence_VariableDerivation(EObject context, VariableDerivation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.VPACKAGEABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.VPACKAGEABLE__NAME));
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.VSPEC_DERIVATION__DERIVED_VSPEC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.VSPEC_DERIVATION__DERIVED_VSPEC));
			if(transientValues.isValueTransient(semanticObject, CvlPackage.Literals.VARIABLE_DERIVATION__DERIVING_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CvlPackage.Literals.VARIABLE_DERIVATION__DERIVING_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableDerivationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableDerivationAccess().getDerivedVSpecVSpecIDTerminalRuleCall_4_0_1(), semanticObject.getDerivedVSpec());
		feeder.accept(grammarAccess.getVariableDerivationAccess().getDerivingExpressionOCLExpressionParserRuleCall_6_0(), semanticObject.getDerivingExpression());
		feeder.finish();
	}
}
