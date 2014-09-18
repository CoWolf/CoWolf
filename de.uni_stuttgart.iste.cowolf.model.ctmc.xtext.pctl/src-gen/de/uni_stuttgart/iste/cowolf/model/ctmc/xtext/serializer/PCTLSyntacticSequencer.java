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
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PCTLGrammarAccess) access;
		match_Conjunction_Disjunction_AmpersandKeyword_0_or_VerticalLineKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConjunctionAccess().getAmpersandKeyword_0()), new TokenAlias(false, false, grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Conjunction_Disjunction_AmpersandKeyword_0_or_VerticalLineKeyword_0.equals(syntax))
				emit_Conjunction_Disjunction_AmpersandKeyword_0_or_VerticalLineKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
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
	
}
