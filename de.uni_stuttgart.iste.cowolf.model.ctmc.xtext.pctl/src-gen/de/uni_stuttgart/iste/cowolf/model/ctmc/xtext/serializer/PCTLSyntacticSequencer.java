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
	protected AbstractElementAlias match_P_P1_S___XParserRuleCall_3_5_0_or___SKeyword_0_CompareParserRuleCall_1_LeftSquareBracketKeyword_2_____or_____PKeyword_0_CompareWithoutUnknownParserRuleCall_1_LeftSquareBracketKeyword_2__p___XParserRuleCall_3_5_0_or___SKeyword_0_CompareParserRuleCall_1_LeftSquareBracketKeyword_2______;
	protected AbstractElementAlias match_P_S_XParserRuleCall_3_5_0_or___SKeyword_0_CompareParserRuleCall_1_LeftSquareBracketKeyword_2__;
	protected AbstractElementAlias match_P___PKeyword_0_CompareWithoutUnknownParserRuleCall_1_LeftSquareBracketKeyword_2__a;
	protected AbstractElementAlias match_P___PKeyword_0_CompareWithoutUnknownParserRuleCall_1_LeftSquareBracketKeyword_2__p;
	protected AbstractElementAlias match_U_RKeyword_1_2_or_UKeyword_1_0_or_WKeyword_1_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PCTLGrammarAccess) access;
		match_P_P1_S___XParserRuleCall_3_5_0_or___SKeyword_0_CompareParserRuleCall_1_LeftSquareBracketKeyword_2_____or_____PKeyword_0_CompareWithoutUnknownParserRuleCall_1_LeftSquareBracketKeyword_2__p___XParserRuleCall_3_5_0_or___SKeyword_0_CompareParserRuleCall_1_LeftSquareBracketKeyword_2______ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getSAccess().getSKeyword_0()), new TokenAlias(false, false, grammarAccess.getSAccess().getCompareParserRuleCall_1()), new TokenAlias(false, false, grammarAccess.getSAccess().getLeftSquareBracketKeyword_2())), new TokenAlias(false, false, grammarAccess.getP1Access().getXParserRuleCall_3_5_0())), new GroupAlias(false, false, new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getPAccess().getPKeyword_0()), new TokenAlias(false, false, grammarAccess.getPAccess().getCompareWithoutUnknownParserRuleCall_1()), new TokenAlias(false, false, grammarAccess.getPAccess().getLeftSquareBracketKeyword_2())), new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getSAccess().getSKeyword_0()), new TokenAlias(false, false, grammarAccess.getSAccess().getCompareParserRuleCall_1()), new TokenAlias(false, false, grammarAccess.getSAccess().getLeftSquareBracketKeyword_2())), new TokenAlias(false, false, grammarAccess.getPAccess().getXParserRuleCall_3_5_0()))));
		match_P_S_XParserRuleCall_3_5_0_or___SKeyword_0_CompareParserRuleCall_1_LeftSquareBracketKeyword_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getSAccess().getSKeyword_0()), new TokenAlias(false, false, grammarAccess.getSAccess().getCompareParserRuleCall_1()), new TokenAlias(false, false, grammarAccess.getSAccess().getLeftSquareBracketKeyword_2())), new TokenAlias(false, false, grammarAccess.getPAccess().getXParserRuleCall_3_5_0()));
		match_P___PKeyword_0_CompareWithoutUnknownParserRuleCall_1_LeftSquareBracketKeyword_2__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getPAccess().getPKeyword_0()), new TokenAlias(false, false, grammarAccess.getPAccess().getCompareWithoutUnknownParserRuleCall_1()), new TokenAlias(false, false, grammarAccess.getPAccess().getLeftSquareBracketKeyword_2()));
		match_P___PKeyword_0_CompareWithoutUnknownParserRuleCall_1_LeftSquareBracketKeyword_2__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getPAccess().getPKeyword_0()), new TokenAlias(false, false, grammarAccess.getPAccess().getCompareWithoutUnknownParserRuleCall_1()), new TokenAlias(false, false, grammarAccess.getPAccess().getLeftSquareBracketKeyword_2()));
		match_U_RKeyword_1_2_or_UKeyword_1_0_or_WKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getUAccess().getRKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getUAccess().getUKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getUAccess().getWKeyword_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getCompareRule())
			return getCompareToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCompareWithoutUnknownRule())
			return getCompareWithoutUnknownToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTimeBoundRule())
			return getTimeBoundToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getXRule())
			return getXToken(semanticObject, ruleCall, node);
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
	 * 	(">=" DECIMAL | "<=" DECIMAL | "=" DECIMAL | "[" DECIMAL "," DECIMAL "]")?;
	 */
	protected String getTimeBoundToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * X:
	 * 	("X")*;
	 */
	protected String getXToken(EObject semanticObject, RuleCall ruleCall, INode node) {
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
			if(match_P_P1_S___XParserRuleCall_3_5_0_or___SKeyword_0_CompareParserRuleCall_1_LeftSquareBracketKeyword_2_____or_____PKeyword_0_CompareWithoutUnknownParserRuleCall_1_LeftSquareBracketKeyword_2__p___XParserRuleCall_3_5_0_or___SKeyword_0_CompareParserRuleCall_1_LeftSquareBracketKeyword_2______.equals(syntax))
				emit_P_P1_S___XParserRuleCall_3_5_0_or___SKeyword_0_CompareParserRuleCall_1_LeftSquareBracketKeyword_2_____or_____PKeyword_0_CompareWithoutUnknownParserRuleCall_1_LeftSquareBracketKeyword_2__p___XParserRuleCall_3_5_0_or___SKeyword_0_CompareParserRuleCall_1_LeftSquareBracketKeyword_2______(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_P_S_XParserRuleCall_3_5_0_or___SKeyword_0_CompareParserRuleCall_1_LeftSquareBracketKeyword_2__.equals(syntax))
				emit_P_S_XParserRuleCall_3_5_0_or___SKeyword_0_CompareParserRuleCall_1_LeftSquareBracketKeyword_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_P___PKeyword_0_CompareWithoutUnknownParserRuleCall_1_LeftSquareBracketKeyword_2__a.equals(syntax))
				emit_P___PKeyword_0_CompareWithoutUnknownParserRuleCall_1_LeftSquareBracketKeyword_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_P___PKeyword_0_CompareWithoutUnknownParserRuleCall_1_LeftSquareBracketKeyword_2__p.equals(syntax))
				emit_P___PKeyword_0_CompareWithoutUnknownParserRuleCall_1_LeftSquareBracketKeyword_2__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_U_RKeyword_1_2_or_UKeyword_1_0_or_WKeyword_1_1.equals(syntax))
				emit_U_RKeyword_1_2_or_UKeyword_1_0_or_WKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (X | ('S' Compare '[')) | (('P' CompareWithoutUnknown '[')+ (X | ('S' Compare '[')))
	 */
	protected void emit_P_P1_S___XParserRuleCall_3_5_0_or___SKeyword_0_CompareParserRuleCall_1_LeftSquareBracketKeyword_2_____or_____PKeyword_0_CompareWithoutUnknownParserRuleCall_1_LeftSquareBracketKeyword_2__p___XParserRuleCall_3_5_0_or___SKeyword_0_CompareParserRuleCall_1_LeftSquareBracketKeyword_2______(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     X | ('S' Compare '[')
	 */
	protected void emit_P_S_XParserRuleCall_3_5_0_or___SKeyword_0_CompareParserRuleCall_1_LeftSquareBracketKeyword_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('P' CompareWithoutUnknown '[')*
	 */
	protected void emit_P___PKeyword_0_CompareWithoutUnknownParserRuleCall_1_LeftSquareBracketKeyword_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('P' CompareWithoutUnknown '[')+
	 */
	protected void emit_P___PKeyword_0_CompareWithoutUnknownParserRuleCall_1_LeftSquareBracketKeyword_2__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'W' | 'R' | 'U'
	 */
	protected void emit_U_RKeyword_1_2_or_UKeyword_1_0_or_WKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
