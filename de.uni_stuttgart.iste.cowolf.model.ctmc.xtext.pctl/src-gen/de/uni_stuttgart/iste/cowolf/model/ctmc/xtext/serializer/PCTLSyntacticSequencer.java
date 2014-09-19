package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.serializer;

import com.google.inject.Inject;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.services.PCTLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class PCTLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PCTLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Conjunction_Disjunction_AmpersandKeyword_0_or_VerticalLineKeyword_0;
	protected AbstractElementAlias match_Probability_SL_COMMENTTerminalRuleCall_1_a;
	protected AbstractElementAlias match_Probability_SL_COMMENTTerminalRuleCall_4_a;
	protected AbstractElementAlias match_QuantifiedProbability_SL_COMMENTTerminalRuleCall_1_a;
	protected AbstractElementAlias match_QuantifiedProbability_SL_COMMENTTerminalRuleCall_3_a;
	protected AbstractElementAlias match_StateFormula_SL_COMMENTTerminalRuleCall_0_1_a;
	protected AbstractElementAlias match_StateFormula_SL_COMMENTTerminalRuleCall_0_4_a;
	protected AbstractElementAlias match_SteadyState_SL_COMMENTTerminalRuleCall_1_a;
	protected AbstractElementAlias match_SteadyState_SL_COMMENTTerminalRuleCall_3_a;
	protected AbstractElementAlias match_SteadyState_SL_COMMENTTerminalRuleCall_5_a;
	protected AbstractElementAlias match_SteadyState_SL_COMMENTTerminalRuleCall_7_a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PCTLGrammarAccess) access;
		match_Conjunction_Disjunction_AmpersandKeyword_0_or_VerticalLineKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConjunctionAccess().getAmpersandKeyword_0()), new TokenAlias(false, false, grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_0()));
		match_Probability_SL_COMMENTTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getProbabilityAccess().getSL_COMMENTTerminalRuleCall_1());
		match_Probability_SL_COMMENTTerminalRuleCall_4_a = new TokenAlias(true, true, grammarAccess.getProbabilityAccess().getSL_COMMENTTerminalRuleCall_4());
		match_QuantifiedProbability_SL_COMMENTTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getQuantifiedProbabilityAccess().getSL_COMMENTTerminalRuleCall_1());
		match_QuantifiedProbability_SL_COMMENTTerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getQuantifiedProbabilityAccess().getSL_COMMENTTerminalRuleCall_3());
		match_StateFormula_SL_COMMENTTerminalRuleCall_0_1_a = new TokenAlias(true, true, grammarAccess.getStateFormulaAccess().getSL_COMMENTTerminalRuleCall_0_1());
		match_StateFormula_SL_COMMENTTerminalRuleCall_0_4_a = new TokenAlias(true, true, grammarAccess.getStateFormulaAccess().getSL_COMMENTTerminalRuleCall_0_4());
		match_SteadyState_SL_COMMENTTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_1());
		match_SteadyState_SL_COMMENTTerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_3());
		match_SteadyState_SL_COMMENTTerminalRuleCall_5_a = new TokenAlias(true, true, grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_5());
		match_SteadyState_SL_COMMENTTerminalRuleCall_7_a = new TokenAlias(true, true, grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_7());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getSL_COMMENTRule())
			return getSL_COMMENTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal SL_COMMENT 	: '//' !('\n'|'\r')* ('\r'? '\n')?;
	 */
	protected String getSL_COMMENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "//";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Conjunction_Disjunction_AmpersandKeyword_0_or_VerticalLineKeyword_0.equals(syntax))
				emit_Conjunction_Disjunction_AmpersandKeyword_0_or_VerticalLineKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Probability_SL_COMMENTTerminalRuleCall_1_a.equals(syntax))
				emit_Probability_SL_COMMENTTerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Probability_SL_COMMENTTerminalRuleCall_4_a.equals(syntax))
				emit_Probability_SL_COMMENTTerminalRuleCall_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_QuantifiedProbability_SL_COMMENTTerminalRuleCall_1_a.equals(syntax))
				emit_QuantifiedProbability_SL_COMMENTTerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_QuantifiedProbability_SL_COMMENTTerminalRuleCall_3_a.equals(syntax))
				emit_QuantifiedProbability_SL_COMMENTTerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StateFormula_SL_COMMENTTerminalRuleCall_0_1_a.equals(syntax))
				emit_StateFormula_SL_COMMENTTerminalRuleCall_0_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StateFormula_SL_COMMENTTerminalRuleCall_0_4_a.equals(syntax))
				emit_StateFormula_SL_COMMENTTerminalRuleCall_0_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SteadyState_SL_COMMENTTerminalRuleCall_1_a.equals(syntax))
				emit_SteadyState_SL_COMMENTTerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SteadyState_SL_COMMENTTerminalRuleCall_3_a.equals(syntax))
				emit_SteadyState_SL_COMMENTTerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SteadyState_SL_COMMENTTerminalRuleCall_5_a.equals(syntax))
				emit_SteadyState_SL_COMMENTTerminalRuleCall_5_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SteadyState_SL_COMMENTTerminalRuleCall_7_a.equals(syntax))
				emit_SteadyState_SL_COMMENTTerminalRuleCall_7_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '|' | '&'
	 */
	protected void emit_Conjunction_Disjunction_AmpersandKeyword_0_or_VerticalLineKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT*
	 */
	protected void emit_Probability_SL_COMMENTTerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT*
	 */
	protected void emit_Probability_SL_COMMENTTerminalRuleCall_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT*
	 */
	protected void emit_QuantifiedProbability_SL_COMMENTTerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT*
	 */
	protected void emit_QuantifiedProbability_SL_COMMENTTerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT*
	 */
	protected void emit_StateFormula_SL_COMMENTTerminalRuleCall_0_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT*
	 */
	protected void emit_StateFormula_SL_COMMENTTerminalRuleCall_0_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT*
	 */
	protected void emit_SteadyState_SL_COMMENTTerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT*
	 */
	protected void emit_SteadyState_SL_COMMENTTerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT*
	 */
	protected void emit_SteadyState_SL_COMMENTTerminalRuleCall_5_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT*
	 */
	protected void emit_SteadyState_SL_COMMENTTerminalRuleCall_7_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
