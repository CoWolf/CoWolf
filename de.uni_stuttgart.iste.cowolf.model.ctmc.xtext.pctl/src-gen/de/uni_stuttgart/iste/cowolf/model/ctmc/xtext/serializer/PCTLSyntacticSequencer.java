package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.serializer;

import com.google.inject.Inject;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.services.PCTLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class PCTLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PCTLGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PCTLGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getCompareRule())
			return getCompareToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCompareWithoutUnknownRule())
			return getCompareWithoutUnknownToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTimeBoundRule())
			return getTimeBoundToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Compare:
	 * 	(CompareWithoutUnknown | "=?");
	 */
	protected String getCompareToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ">";
	}
	
	/**
	 * CompareWithoutUnknown:
	 * 	(">" DECIMAL | "<" DECIMAL | ">=" DECIMAL | "<=" DECIMAL);
	 */
	protected String getCompareWithoutUnknownToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ">";
	}
	
	/**
	 * TimeBound:
	 * 	(">=" DECIMAL | "<=" DECIMAL | "[" DECIMAL "," DECIMAL "]")?;
	 */
	protected String getTimeBoundToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}
