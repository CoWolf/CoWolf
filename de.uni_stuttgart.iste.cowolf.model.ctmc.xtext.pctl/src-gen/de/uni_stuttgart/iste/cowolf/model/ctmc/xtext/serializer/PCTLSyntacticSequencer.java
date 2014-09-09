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
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class PCTLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PCTLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Conjunction_Disjunction_AmpersandKeyword_0_or_VerticalLineKeyword_0;
	protected AbstractElementAlias match_Future_TimeBoundParserRuleCall_1_q;
	protected AbstractElementAlias match_Globally_TimeBoundParserRuleCall_1_q;
	protected AbstractElementAlias match_Negation_ExclamationMarkKeyword_0_a;
	protected AbstractElementAlias match_Negation_ExclamationMarkKeyword_0_p;
	protected AbstractElementAlias match_Next_TimeBoundParserRuleCall_1_q;
	protected AbstractElementAlias match_SteadyState_CompareProbabilityParserRuleCall_1_0_or_EqualsSignQuestionMarkKeyword_1_1;
	protected AbstractElementAlias match_SteadyState___SKeyword_0___CompareProbabilityParserRuleCall_1_0_or_EqualsSignQuestionMarkKeyword_1_1___LeftSquareBracketKeyword_2__q;
	protected AbstractElementAlias match_Until_RKeyword_1_2_or_UKeyword_1_0_or_WKeyword_1_1;
	protected AbstractElementAlias match_Until_TimeBoundParserRuleCall_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PCTLGrammarAccess) access;
		match_Conjunction_Disjunction_AmpersandKeyword_0_or_VerticalLineKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConjunctionAccess().getAmpersandKeyword_0()), new TokenAlias(false, false, grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_0()));
		match_Future_TimeBoundParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getFutureAccess().getTimeBoundParserRuleCall_1());
		match_Globally_TimeBoundParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getGloballyAccess().getTimeBoundParserRuleCall_1());
		match_Negation_ExclamationMarkKeyword_0_a = new TokenAlias(true, true, grammarAccess.getNegationAccess().getExclamationMarkKeyword_0());
		match_Negation_ExclamationMarkKeyword_0_p = new TokenAlias(true, false, grammarAccess.getNegationAccess().getExclamationMarkKeyword_0());
		match_Next_TimeBoundParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getNextAccess().getTimeBoundParserRuleCall_1());
		match_SteadyState_CompareProbabilityParserRuleCall_1_0_or_EqualsSignQuestionMarkKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSteadyStateAccess().getCompareProbabilityParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getSteadyStateAccess().getEqualsSignQuestionMarkKeyword_1_1()));
		match_SteadyState___SKeyword_0___CompareProbabilityParserRuleCall_1_0_or_EqualsSignQuestionMarkKeyword_1_1___LeftSquareBracketKeyword_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSteadyStateAccess().getSKeyword_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSteadyStateAccess().getCompareProbabilityParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getSteadyStateAccess().getEqualsSignQuestionMarkKeyword_1_1())), new TokenAlias(false, false, grammarAccess.getSteadyStateAccess().getLeftSquareBracketKeyword_2()));
		match_Until_RKeyword_1_2_or_UKeyword_1_0_or_WKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getUntilAccess().getRKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getUntilAccess().getUKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getUntilAccess().getWKeyword_1_1()));
		match_Until_TimeBoundParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getUntilAccess().getTimeBoundParserRuleCall_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getBOOLRule())
			return getBOOLToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCompareProbabilityRule())
			return getCompareProbabilityToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTimeBoundRule())
			return getTimeBoundToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal BOOL : 'true'|'false';
	 */
	protected String getBOOLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "true";
	}
	
	/**
	 * CompareProbability:
	 *     ('>''='?|'<''='?) DECIMAL
	 * ;
	 */
	protected String getCompareProbabilityToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ">";
	}
	
	/**
	 * TimeBound:
	 * 	(('>''='?|'<''='?|'=') DECIMAL) | ("[" DECIMAL "," DECIMAL "]");
	 */
	protected String getTimeBoundToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ">";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Conjunction_Disjunction_AmpersandKeyword_0_or_VerticalLineKeyword_0.equals(syntax))
				emit_Conjunction_Disjunction_AmpersandKeyword_0_or_VerticalLineKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Future_TimeBoundParserRuleCall_1_q.equals(syntax))
				emit_Future_TimeBoundParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Globally_TimeBoundParserRuleCall_1_q.equals(syntax))
				emit_Globally_TimeBoundParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Negation_ExclamationMarkKeyword_0_a.equals(syntax))
				emit_Negation_ExclamationMarkKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Negation_ExclamationMarkKeyword_0_p.equals(syntax))
				emit_Negation_ExclamationMarkKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Next_TimeBoundParserRuleCall_1_q.equals(syntax))
				emit_Next_TimeBoundParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SteadyState_CompareProbabilityParserRuleCall_1_0_or_EqualsSignQuestionMarkKeyword_1_1.equals(syntax))
				emit_SteadyState_CompareProbabilityParserRuleCall_1_0_or_EqualsSignQuestionMarkKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SteadyState___SKeyword_0___CompareProbabilityParserRuleCall_1_0_or_EqualsSignQuestionMarkKeyword_1_1___LeftSquareBracketKeyword_2__q.equals(syntax))
				emit_SteadyState___SKeyword_0___CompareProbabilityParserRuleCall_1_0_or_EqualsSignQuestionMarkKeyword_1_1___LeftSquareBracketKeyword_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Until_RKeyword_1_2_or_UKeyword_1_0_or_WKeyword_1_1.equals(syntax))
				emit_Until_RKeyword_1_2_or_UKeyword_1_0_or_WKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Until_TimeBoundParserRuleCall_2_q.equals(syntax))
				emit_Until_TimeBoundParserRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '&' | '|'
	 */
	protected void emit_Conjunction_Disjunction_AmpersandKeyword_0_or_VerticalLineKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     TimeBound?
	 */
	protected void emit_Future_TimeBoundParserRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     TimeBound?
	 */
	protected void emit_Globally_TimeBoundParserRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '!'*
	 */
	protected void emit_Negation_ExclamationMarkKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '!'+
	 */
	protected void emit_Negation_ExclamationMarkKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     TimeBound?
	 */
	protected void emit_Next_TimeBoundParserRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     CompareProbability | '=?'
	 */
	protected void emit_SteadyState_CompareProbabilityParserRuleCall_1_0_or_EqualsSignQuestionMarkKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('S' (CompareProbability | '=?') '[')?
	 */
	protected void emit_SteadyState___SKeyword_0___CompareProbabilityParserRuleCall_1_0_or_EqualsSignQuestionMarkKeyword_1_1___LeftSquareBracketKeyword_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'U' | 'W' | 'R'
	 */
	protected void emit_Until_RKeyword_1_2_or_UKeyword_1_0_or_WKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     TimeBound?
	 */
	protected void emit_Until_TimeBoundParserRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
