package fr.inria.diverse.kcvl.serializer;

import com.google.inject.Inject;
import fr.inria.diverse.kcvl.services.KCVLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class KCVLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected KCVLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_CVSpecDerivation___MemberDerivationKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q;
	protected AbstractElementAlias match_CVSpec___ChildKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q;
	protected AbstractElementAlias match_Choice___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_6__q;
	protected AbstractElementAlias match_CompositeVariationPoint_Impl___ChildrenKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q;
	protected AbstractElementAlias match_ConfigurableUnit___ChildrenKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q;
	protected AbstractElementAlias match_ConfigurableUnit___OwnedConstraintKeyword_12_0_LeftCurlyBracketKeyword_12_1_RightCurlyBracketKeyword_12_3__q;
	protected AbstractElementAlias match_ConfigurableUnit___OwnedVSpecKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q;
	protected AbstractElementAlias match_ConfigurableUnit___OwnedVSpecResolutionKeyword_13_0_LeftCurlyBracketKeyword_13_1_RightCurlyBracketKeyword_13_3__q;
	protected AbstractElementAlias match_ConfigurableUnit___OwnedVariationPointKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q;
	protected AbstractElementAlias match_FragmentSubstitution___BoundaryElementBindingsKeyword_14_0_LeftCurlyBracketKeyword_14_1_RightCurlyBracketKeyword_14_3__q;
	protected AbstractElementAlias match_FromPlacement___OutsideBoundaryElementKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q;
	protected AbstractElementAlias match_FromReplacement___OutsideBoundaryElementKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q;
	protected AbstractElementAlias match_PlacementFragment___PlacementBoundaryElementsKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q;
	protected AbstractElementAlias match_ReplacementFragmentType___PlacementFragmentsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q;
	protected AbstractElementAlias match_ReplacementFragmentType___ReplacementBoundaryElementsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q;
	protected AbstractElementAlias match_ToPlacement___InsideBoundaryElementKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q;
	protected AbstractElementAlias match_ToReplacement___InsideBoundaryElementKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q;
	protected AbstractElementAlias match_VConfiguration___ChildKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q;
	protected AbstractElementAlias match_VInterface___ConstraintsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q;
	protected AbstractElementAlias match_VInterface___MemberKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q;
	protected AbstractElementAlias match_XBlockExpression_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q;
	protected AbstractElementAlias match_XExpressionInClosure_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_XParenthesizedExpression_LeftParenthesisKeyword_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (KCVLGrammarAccess) access;
		match_CVSpecDerivation___MemberDerivationKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCVSpecDerivationAccess().getMemberDerivationKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getCVSpecDerivationAccess().getLeftCurlyBracketKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getCVSpecDerivationAccess().getRightCurlyBracketKeyword_5_3()));
		match_CVSpec___ChildKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCVSpecAccess().getChildKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getCVSpecAccess().getLeftCurlyBracketKeyword_9_1()), new TokenAlias(false, false, grammarAccess.getCVSpecAccess().getRightCurlyBracketKeyword_9_3()));
		match_Choice___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_6__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getChoiceAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getChoiceAccess().getRightCurlyBracketKeyword_3_6()));
		match_CompositeVariationPoint_Impl___ChildrenKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCompositeVariationPoint_ImplAccess().getChildrenKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getCompositeVariationPoint_ImplAccess().getLeftCurlyBracketKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getCompositeVariationPoint_ImplAccess().getRightCurlyBracketKeyword_7_3()));
		match_ConfigurableUnit___ChildrenKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getConfigurableUnitAccess().getChildrenKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getConfigurableUnitAccess().getLeftCurlyBracketKeyword_9_1()), new TokenAlias(false, false, grammarAccess.getConfigurableUnitAccess().getRightCurlyBracketKeyword_9_3()));
		match_ConfigurableUnit___OwnedConstraintKeyword_12_0_LeftCurlyBracketKeyword_12_1_RightCurlyBracketKeyword_12_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getConfigurableUnitAccess().getOwnedConstraintKeyword_12_0()), new TokenAlias(false, false, grammarAccess.getConfigurableUnitAccess().getLeftCurlyBracketKeyword_12_1()), new TokenAlias(false, false, grammarAccess.getConfigurableUnitAccess().getRightCurlyBracketKeyword_12_3()));
		match_ConfigurableUnit___OwnedVSpecKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getConfigurableUnitAccess().getOwnedVSpecKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getConfigurableUnitAccess().getLeftCurlyBracketKeyword_10_1()), new TokenAlias(false, false, grammarAccess.getConfigurableUnitAccess().getRightCurlyBracketKeyword_10_3()));
		match_ConfigurableUnit___OwnedVSpecResolutionKeyword_13_0_LeftCurlyBracketKeyword_13_1_RightCurlyBracketKeyword_13_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getConfigurableUnitAccess().getOwnedVSpecResolutionKeyword_13_0()), new TokenAlias(false, false, grammarAccess.getConfigurableUnitAccess().getLeftCurlyBracketKeyword_13_1()), new TokenAlias(false, false, grammarAccess.getConfigurableUnitAccess().getRightCurlyBracketKeyword_13_3()));
		match_ConfigurableUnit___OwnedVariationPointKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getConfigurableUnitAccess().getOwnedVariationPointKeyword_11_0()), new TokenAlias(false, false, grammarAccess.getConfigurableUnitAccess().getLeftCurlyBracketKeyword_11_1()), new TokenAlias(false, false, grammarAccess.getConfigurableUnitAccess().getRightCurlyBracketKeyword_11_3()));
		match_FragmentSubstitution___BoundaryElementBindingsKeyword_14_0_LeftCurlyBracketKeyword_14_1_RightCurlyBracketKeyword_14_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFragmentSubstitutionAccess().getBoundaryElementBindingsKeyword_14_0()), new TokenAlias(false, false, grammarAccess.getFragmentSubstitutionAccess().getLeftCurlyBracketKeyword_14_1()), new TokenAlias(false, false, grammarAccess.getFragmentSubstitutionAccess().getRightCurlyBracketKeyword_14_3()));
		match_FromPlacement___OutsideBoundaryElementKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFromPlacementAccess().getOutsideBoundaryElementKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getFromPlacementAccess().getLeftCurlyBracketKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getFromPlacementAccess().getRightCurlyBracketKeyword_4_3()));
		match_FromReplacement___OutsideBoundaryElementKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFromReplacementAccess().getOutsideBoundaryElementKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getFromReplacementAccess().getLeftCurlyBracketKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getFromReplacementAccess().getRightCurlyBracketKeyword_6_3()));
		match_PlacementFragment___PlacementBoundaryElementsKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPlacementFragmentAccess().getPlacementBoundaryElementsKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getPlacementFragmentAccess().getLeftCurlyBracketKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getPlacementFragmentAccess().getRightCurlyBracketKeyword_5_3()));
		match_ReplacementFragmentType___PlacementFragmentsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getReplacementFragmentTypeAccess().getPlacementFragmentsKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getReplacementFragmentTypeAccess().getLeftCurlyBracketKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getReplacementFragmentTypeAccess().getRightCurlyBracketKeyword_4_3()));
		match_ReplacementFragmentType___ReplacementBoundaryElementsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getReplacementFragmentTypeAccess().getReplacementBoundaryElementsKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getReplacementFragmentTypeAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getReplacementFragmentTypeAccess().getRightCurlyBracketKeyword_3_3()));
		match_ToPlacement___InsideBoundaryElementKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getToPlacementAccess().getInsideBoundaryElementKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getToPlacementAccess().getLeftCurlyBracketKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getToPlacementAccess().getRightCurlyBracketKeyword_4_3()));
		match_ToReplacement___InsideBoundaryElementKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getToReplacementAccess().getInsideBoundaryElementKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getToReplacementAccess().getLeftCurlyBracketKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getToReplacementAccess().getRightCurlyBracketKeyword_3_3()));
		match_VConfiguration___ChildKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getVConfigurationAccess().getChildKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getVConfigurationAccess().getLeftCurlyBracketKeyword_10_1()), new TokenAlias(false, false, grammarAccess.getVConfigurationAccess().getRightCurlyBracketKeyword_10_3()));
		match_VInterface___ConstraintsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getVInterfaceAccess().getConstraintsKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getVInterfaceAccess().getLeftCurlyBracketKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getVInterfaceAccess().getRightCurlyBracketKeyword_4_3()));
		match_VInterface___MemberKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getVInterfaceAccess().getMemberKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getVInterfaceAccess().getLeftCurlyBracketKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getVInterfaceAccess().getRightCurlyBracketKeyword_5_3()));
		match_XBlockExpression_SemicolonKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getXBlockExpressionAccess().getSemicolonKeyword_2_1());
		match_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_4_2()));
		match_XExpressionInClosure_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getXExpressionInClosureAccess().getSemicolonKeyword_1_1());
		match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_2()));
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
		match_XParenthesizedExpression_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getOpSingleAssignRule())
			return getOpSingleAssignToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * OpSingleAssign:
	 * 	'='
	 * ;
	 */
	protected String getOpSingleAssignToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_CVSpecDerivation___MemberDerivationKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q.equals(syntax))
				emit_CVSpecDerivation___MemberDerivationKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CVSpec___ChildKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q.equals(syntax))
				emit_CVSpec___ChildKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Choice___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_6__q.equals(syntax))
				emit_Choice___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_6__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CompositeVariationPoint_Impl___ChildrenKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q.equals(syntax))
				emit_CompositeVariationPoint_Impl___ChildrenKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConfigurableUnit___ChildrenKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q.equals(syntax))
				emit_ConfigurableUnit___ChildrenKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConfigurableUnit___OwnedConstraintKeyword_12_0_LeftCurlyBracketKeyword_12_1_RightCurlyBracketKeyword_12_3__q.equals(syntax))
				emit_ConfigurableUnit___OwnedConstraintKeyword_12_0_LeftCurlyBracketKeyword_12_1_RightCurlyBracketKeyword_12_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConfigurableUnit___OwnedVSpecKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q.equals(syntax))
				emit_ConfigurableUnit___OwnedVSpecKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConfigurableUnit___OwnedVSpecResolutionKeyword_13_0_LeftCurlyBracketKeyword_13_1_RightCurlyBracketKeyword_13_3__q.equals(syntax))
				emit_ConfigurableUnit___OwnedVSpecResolutionKeyword_13_0_LeftCurlyBracketKeyword_13_1_RightCurlyBracketKeyword_13_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConfigurableUnit___OwnedVariationPointKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q.equals(syntax))
				emit_ConfigurableUnit___OwnedVariationPointKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FragmentSubstitution___BoundaryElementBindingsKeyword_14_0_LeftCurlyBracketKeyword_14_1_RightCurlyBracketKeyword_14_3__q.equals(syntax))
				emit_FragmentSubstitution___BoundaryElementBindingsKeyword_14_0_LeftCurlyBracketKeyword_14_1_RightCurlyBracketKeyword_14_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FromPlacement___OutsideBoundaryElementKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q.equals(syntax))
				emit_FromPlacement___OutsideBoundaryElementKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FromReplacement___OutsideBoundaryElementKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q.equals(syntax))
				emit_FromReplacement___OutsideBoundaryElementKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PlacementFragment___PlacementBoundaryElementsKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q.equals(syntax))
				emit_PlacementFragment___PlacementBoundaryElementsKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ReplacementFragmentType___PlacementFragmentsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q.equals(syntax))
				emit_ReplacementFragmentType___PlacementFragmentsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ReplacementFragmentType___ReplacementBoundaryElementsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q.equals(syntax))
				emit_ReplacementFragmentType___ReplacementBoundaryElementsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ToPlacement___InsideBoundaryElementKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q.equals(syntax))
				emit_ToPlacement___InsideBoundaryElementKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ToReplacement___InsideBoundaryElementKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q.equals(syntax))
				emit_ToReplacement___InsideBoundaryElementKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VConfiguration___ChildKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q.equals(syntax))
				emit_VConfiguration___ChildKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VInterface___ConstraintsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q.equals(syntax))
				emit_VInterface___ConstraintsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VInterface___MemberKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q.equals(syntax))
				emit_VInterface___MemberKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XBlockExpression_SemicolonKeyword_2_1_q.equals(syntax))
				emit_XBlockExpression_SemicolonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q.equals(syntax))
				emit_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XExpressionInClosure_SemicolonKeyword_1_1_q.equals(syntax))
				emit_XExpressionInClosure_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q.equals(syntax))
				emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XParenthesizedExpression_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('memberDerivation' '{' '}')?
	 */
	protected void emit_CVSpecDerivation___MemberDerivationKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('child' '{' '}')?
	 */
	protected void emit_CVSpec___ChildKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Choice___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_6__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('children' '{' '}')?
	 */
	protected void emit_CompositeVariationPoint_Impl___ChildrenKeyword_7_0_LeftCurlyBracketKeyword_7_1_RightCurlyBracketKeyword_7_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('children' '{' '}')?
	 */
	protected void emit_ConfigurableUnit___ChildrenKeyword_9_0_LeftCurlyBracketKeyword_9_1_RightCurlyBracketKeyword_9_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('ownedConstraint' '{' '}')?
	 */
	protected void emit_ConfigurableUnit___OwnedConstraintKeyword_12_0_LeftCurlyBracketKeyword_12_1_RightCurlyBracketKeyword_12_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('ownedVSpec' '{' '}')?
	 */
	protected void emit_ConfigurableUnit___OwnedVSpecKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('ownedVSpecResolution' '{' '}')?
	 */
	protected void emit_ConfigurableUnit___OwnedVSpecResolutionKeyword_13_0_LeftCurlyBracketKeyword_13_1_RightCurlyBracketKeyword_13_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('ownedVariationPoint' '{' '}')?
	 */
	protected void emit_ConfigurableUnit___OwnedVariationPointKeyword_11_0_LeftCurlyBracketKeyword_11_1_RightCurlyBracketKeyword_11_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('boundaryElementBindings' '{' '}')?
	 */
	protected void emit_FragmentSubstitution___BoundaryElementBindingsKeyword_14_0_LeftCurlyBracketKeyword_14_1_RightCurlyBracketKeyword_14_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('outsideBoundaryElement' '{' '}')?
	 */
	protected void emit_FromPlacement___OutsideBoundaryElementKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('outsideBoundaryElement' '{' '}')?
	 */
	protected void emit_FromReplacement___OutsideBoundaryElementKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('placementBoundaryElements' '{' '}')?
	 */
	protected void emit_PlacementFragment___PlacementBoundaryElementsKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('placementFragments' '{' '}')?
	 */
	protected void emit_ReplacementFragmentType___PlacementFragmentsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('replacementBoundaryElements' '{' '}')?
	 */
	protected void emit_ReplacementFragmentType___ReplacementBoundaryElementsKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('insideBoundaryElement' '{' '}')?
	 */
	protected void emit_ToPlacement___InsideBoundaryElementKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('insideBoundaryElement' '{' '}')?
	 */
	protected void emit_ToReplacement___InsideBoundaryElementKeyword_3_0_LeftCurlyBracketKeyword_3_1_RightCurlyBracketKeyword_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('child' '{' '}')?
	 */
	protected void emit_VConfiguration___ChildKeyword_10_0_LeftCurlyBracketKeyword_10_1_RightCurlyBracketKeyword_10_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('constraints' '{' '}')?
	 */
	protected void emit_VInterface___ConstraintsKeyword_4_0_LeftCurlyBracketKeyword_4_1_RightCurlyBracketKeyword_4_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('member' '{' '}')?
	 */
	protected void emit_VInterface___MemberKeyword_5_0_LeftCurlyBracketKeyword_5_1_RightCurlyBracketKeyword_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XBlockExpression_SemicolonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XConstructorCall___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_XExpressionInClosure_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_XFunctionTypeRef___LeftParenthesisKeyword_0_0_RightParenthesisKeyword_0_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_XParenthesizedExpression_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
