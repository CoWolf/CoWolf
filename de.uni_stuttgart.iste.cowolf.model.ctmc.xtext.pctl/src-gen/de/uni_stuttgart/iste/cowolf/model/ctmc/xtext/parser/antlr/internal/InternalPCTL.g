/*
* generated by Xtext
*/
grammar InternalPCTL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.services.PCTLGrammarAccess;

}

@parser::members {

 	private PCTLGrammarAccess grammarAccess;
 	
    public InternalPCTLParser(TokenStream input, PCTLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Start";	
   	}
   	
   	@Override
   	protected PCTLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleStart
entryRuleStart returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStartRule()); }
	 iv_ruleStart=ruleStart 
	 { $current=$iv_ruleStart.current; } 
	 EOF 
;

// Rule Start
ruleStart returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getStartAccess().getStartAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getStartAccess().getRuleFragmentParserRuleCall_1_0()); 
	    }
		lv_rule_1_0=ruleFragment		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStartRule());
	        }
       		add(
       			$current, 
       			"rule",
        		lv_rule_1_0, 
        		"Fragment");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleFragment
entryRuleFragment returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFragmentRule()); }
	 iv_ruleFragment=ruleFragment 
	 { $current=$iv_ruleFragment.current; } 
	 EOF 
;

// Rule Fragment
ruleFragment returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getFragmentAccess().getCommentParserRuleCall_0()); 
    }
    this_Comment_0=ruleComment
    { 
        $current = $this_Comment_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getFragmentAccess().getRuleParserRuleCall_1()); 
    }
    this_Rule_1=ruleRule
    { 
        $current = $this_Rule_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleComment
entryRuleComment returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getCommentRule()); }
	 iv_ruleComment=ruleComment 
	 { $current=$iv_ruleComment.current; } 
	 EOF 
;

// Rule Comment
ruleComment returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_comment_0_0=RULE_SL_COMMENT
		{
			newLeafNode(lv_comment_0_0, grammarAccess.getCommentAccess().getCommentSL_COMMENTTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCommentRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"comment",
        		lv_comment_0_0, 
        		"SL_COMMENT");
	    }

)
)
;





// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
	}
	:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	 iv_ruleRule=ruleRule 
	 { $current=$iv_ruleRule.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Rule
ruleRule returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getRuleAccess().getBooleanRuleParserRuleCall_0()); 
    }
    this_BooleanRule_0=ruleBooleanRule
    { 
        $current = $this_BooleanRule_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getRuleAccess().getSteadyStateParserRuleCall_1()); 
    }
    this_SteadyState_1=ruleSteadyState
    { 
        $current = $this_SteadyState_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getRuleAccess().getQuantifiedProbabilityParserRuleCall_2()); 
    }
    this_QuantifiedProbability_2=ruleQuantifiedProbability
    { 
        $current = $this_QuantifiedProbability_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRuleSteadyState
entryRuleSteadyState returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSteadyStateRule()); }
	 iv_ruleSteadyState=ruleSteadyState 
	 { $current=$iv_ruleSteadyState.current; } 
	 EOF 
;

// Rule SteadyState
ruleSteadyState returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='S' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSteadyStateAccess().getSKeyword_0());
    }
(this_SL_COMMENT_1=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_1, grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_1()); 
    }
)*((
(
		{ 
	        newCompositeNode(grammarAccess.getSteadyStateAccess().getBoundCompareProbabilityParserRuleCall_2_0_0()); 
	    }
		lv_bound_2_0=ruleCompareProbability		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSteadyStateRule());
	        }
       		set(
       			$current, 
       			"bound",
        		lv_bound_2_0, 
        		"CompareProbability");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |	otherlv_3='=?' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSteadyStateAccess().getEqualsSignQuestionMarkKeyword_2_1());
    }
)(this_SL_COMMENT_4=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_4, grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_3()); 
    }
)*	otherlv_5='[' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSteadyStateAccess().getLeftSquareBracketKeyword_4());
    }
(this_SL_COMMENT_6=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_6, grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_5()); 
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getSteadyStateAccess().getValueStateFormulaParserRuleCall_6_0()); 
	    }
		lv_value_7_0=ruleStateFormula		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSteadyStateRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_7_0, 
        		"StateFormula");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_SL_COMMENT_8=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_8, grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_7()); 
    }
)*	otherlv_9=']' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getSteadyStateAccess().getRightSquareBracketKeyword_8());
    }
)
;





// Entry rule entryRuleQuantifiedProbability
entryRuleQuantifiedProbability returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQuantifiedProbabilityRule()); }
	 iv_ruleQuantifiedProbability=ruleQuantifiedProbability 
	 { $current=$iv_ruleQuantifiedProbability.current; } 
	 EOF 
;

// Rule QuantifiedProbability
ruleQuantifiedProbability returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='P' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getQuantifiedProbabilityAccess().getPKeyword_0());
    }
(this_SL_COMMENT_1=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_1, grammarAccess.getQuantifiedProbabilityAccess().getSL_COMMENTTerminalRuleCall_1()); 
    }
)*	otherlv_2='=?' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getQuantifiedProbabilityAccess().getEqualsSignQuestionMarkKeyword_2());
    }
(this_SL_COMMENT_3=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_3, grammarAccess.getQuantifiedProbabilityAccess().getSL_COMMENTTerminalRuleCall_3()); 
    }
)*	otherlv_4='[' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getQuantifiedProbabilityAccess().getLeftSquareBracketKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getQuantifiedProbabilityAccess().getValuePathFormulaParserRuleCall_5_0()); 
	    }
		lv_value_5_0=rulePathFormula		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuantifiedProbabilityRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_5_0, 
        		"PathFormula");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_6=']' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getQuantifiedProbabilityAccess().getRightSquareBracketKeyword_6());
    }
)
;





// Entry rule entryRuleBooleanRule
entryRuleBooleanRule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBooleanRuleRule()); }
	 iv_ruleBooleanRule=ruleBooleanRule 
	 { $current=$iv_ruleBooleanRule.current; } 
	 EOF 
;

// Rule BooleanRule
ruleBooleanRule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getBooleanRuleAccess().getValueStateFormulaParserRuleCall_0()); 
	    }
		lv_value_0_0=ruleStateFormula		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBooleanRuleRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"StateFormula");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleStateFormula
entryRuleStateFormula returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStateFormulaRule()); }
	 iv_ruleStateFormula=ruleStateFormula 
	 { $current=$iv_ruleStateFormula.current; } 
	 EOF 
;

// Rule StateFormula
ruleStateFormula returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getStateFormulaAccess().getLeftParenthesisKeyword_0_0());
    }
(this_SL_COMMENT_1=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_1, grammarAccess.getStateFormulaAccess().getSL_COMMENTTerminalRuleCall_0_1()); 
    }
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getStateFormulaAccess().getLeftStateFormulaParserRuleCall_0_2_0()); 
	    }
		lv_left_2_0=ruleStateFormula		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateFormulaRule());
	        }
       		set(
       			$current, 
       			"left",
        		lv_left_2_0, 
        		"StateFormula");
	        afterParserOrEnumRuleCall();
	    }

)
)((
(
		{ 
	        newCompositeNode(grammarAccess.getStateFormulaAccess().getRightJunctionParserRuleCall_0_3_0_0()); 
	    }
		lv_right_3_0=ruleJunction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateFormulaRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"Junction");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getStateFormulaAccess().getRightImplicationParserRuleCall_0_3_1_0()); 
	    }
		lv_right_4_0=ruleImplication		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateFormulaRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_4_0, 
        		"Implication");
	        afterParserOrEnumRuleCall();
	    }

)
))?(this_SL_COMMENT_5=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_5, grammarAccess.getStateFormulaAccess().getSL_COMMENTTerminalRuleCall_0_4()); 
    }
)*	otherlv_6=')' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getStateFormulaAccess().getRightParenthesisKeyword_0_5());
    }
)
    |(
(
(
		{ 
	        newCompositeNode(grammarAccess.getStateFormulaAccess().getLeftNegationParserRuleCall_1_0_0()); 
	    }
		lv_left_7_1=ruleNegation		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateFormulaRule());
	        }
       		set(
       			$current, 
       			"left",
        		lv_left_7_1, 
        		"Negation");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getStateFormulaAccess().getLeftAtomicParserRuleCall_1_0_1()); 
	    }
		lv_left_7_2=ruleAtomic		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateFormulaRule());
	        }
       		set(
       			$current, 
       			"left",
        		lv_left_7_2, 
        		"Atomic");
	        afterParserOrEnumRuleCall();
	    }

    |		{ 
	        newCompositeNode(grammarAccess.getStateFormulaAccess().getLeftProbabilityParserRuleCall_1_0_2()); 
	    }
		lv_left_7_3=ruleProbability		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getStateFormulaRule());
	        }
       		set(
       			$current, 
       			"left",
        		lv_left_7_3, 
        		"Probability");
	        afterParserOrEnumRuleCall();
	    }

)

)
))
;





// Entry rule entryRuleNegation
entryRuleNegation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNegationRule()); }
	 iv_ruleNegation=ruleNegation 
	 { $current=$iv_ruleNegation.current; } 
	 EOF 
;

// Rule Negation
ruleNegation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='!' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getExclamationMarkKeyword_0());
    }

    { 
        newCompositeNode(grammarAccess.getNegationAccess().getStateFormulaParserRuleCall_1()); 
    }
    this_StateFormula_1=ruleStateFormula
    { 
        $current = $this_StateFormula_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleJunction
entryRuleJunction returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
	}
	:
	{ newCompositeNode(grammarAccess.getJunctionRule()); }
	 iv_ruleJunction=ruleJunction 
	 { $current=$iv_ruleJunction.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Junction
ruleJunction returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getJunctionAccess().getConjunctionParserRuleCall_0()); 
    }
    this_Conjunction_0=ruleConjunction
    { 
        $current = $this_Conjunction_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getJunctionAccess().getDisjunctionParserRuleCall_1()); 
    }
    this_Disjunction_1=ruleDisjunction
    { 
        $current = $this_Disjunction_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRuleConjunction
entryRuleConjunction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConjunctionRule()); }
	 iv_ruleConjunction=ruleConjunction 
	 { $current=$iv_ruleConjunction.current; } 
	 EOF 
;

// Rule Conjunction
ruleConjunction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='&' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getConjunctionAccess().getAmpersandKeyword_0());
    }

    { 
        newCompositeNode(grammarAccess.getConjunctionAccess().getStateFormulaParserRuleCall_1()); 
    }
    this_StateFormula_1=ruleStateFormula
    { 
        $current = $this_StateFormula_1.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getConjunctionAccess().getConjunctionLeftAction_2_0(),
            $current);
    }
)	otherlv_3='&' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getConjunctionAccess().getAmpersandKeyword_2_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0()); 
	    }
		lv_right_4_0=ruleStateFormula		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConjunctionRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_4_0, 
        		"StateFormula");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleDisjunction
entryRuleDisjunction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDisjunctionRule()); }
	 iv_ruleDisjunction=ruleDisjunction 
	 { $current=$iv_ruleDisjunction.current; } 
	 EOF 
;

// Rule Disjunction
ruleDisjunction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='|' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_0());
    }

    { 
        newCompositeNode(grammarAccess.getDisjunctionAccess().getStateFormulaParserRuleCall_1()); 
    }
    this_StateFormula_1=ruleStateFormula
    { 
        $current = $this_StateFormula_1.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_2_0(),
            $current);
    }
)	otherlv_3='|' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_2_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0()); 
	    }
		lv_right_4_0=ruleStateFormula		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDisjunctionRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_4_0, 
        		"StateFormula");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleImplication
entryRuleImplication returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
	}
	:
	{ newCompositeNode(grammarAccess.getImplicationRule()); }
	 iv_ruleImplication=ruleImplication 
	 { $current=$iv_ruleImplication.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Implication
ruleImplication returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
    }
    @after { leaveRule(); }:
(	otherlv_0='=>' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getImplicationAccess().getEqualsSignGreaterThanSignKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getImplicationAccess().getRightStateFormulaParserRuleCall_1_0()); 
	    }
		lv_right_1_0=ruleStateFormula		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImplicationRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_1_0, 
        		"StateFormula");
	        afterParserOrEnumRuleCall();
	    }

)
))
;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRuleProbability
entryRuleProbability returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getProbabilityRule()); }
	 iv_ruleProbability=ruleProbability 
	 { $current=$iv_ruleProbability.current; } 
	 EOF 
;

// Rule Probability
ruleProbability returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='P' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getProbabilityAccess().getPKeyword_0());
    }
(this_SL_COMMENT_1=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_1, grammarAccess.getProbabilityAccess().getSL_COMMENTTerminalRuleCall_1()); 
    }
)*(
    {
        $current = forceCreateModelElement(
            grammarAccess.getProbabilityAccess().getProbabilityAction_2(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getProbabilityAccess().getComparatorCompareProbabilityParserRuleCall_3_0()); 
	    }
		lv_comparator_3_0=ruleCompareProbability		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProbabilityRule());
	        }
       		set(
       			$current, 
       			"comparator",
        		lv_comparator_3_0, 
        		"CompareProbability");
	        afterParserOrEnumRuleCall();
	    }

)
)(this_SL_COMMENT_4=RULE_SL_COMMENT
    { 
    newLeafNode(this_SL_COMMENT_4, grammarAccess.getProbabilityAccess().getSL_COMMENTTerminalRuleCall_4()); 
    }
)*	otherlv_5='[' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getProbabilityAccess().getLeftSquareBracketKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getProbabilityAccess().getPathPathFormulaParserRuleCall_6_0()); 
	    }
		lv_path_6_0=rulePathFormula		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getProbabilityRule());
	        }
       		set(
       			$current, 
       			"path",
        		lv_path_6_0, 
        		"PathFormula");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=']' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getProbabilityAccess().getRightSquareBracketKeyword_7());
    }
)
;





// Entry rule entryRuleAtomic
entryRuleAtomic returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtomicRule()); }
	 iv_ruleAtomic=ruleAtomic 
	 { $current=$iv_ruleAtomic.current; } 
	 EOF 
;

// Rule Atomic
ruleAtomic returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAtomicAccess().getStateParserRuleCall_0()); 
    }
    this_State_0=ruleState
    { 
        $current = $this_State_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAtomicAccess().getLabelParserRuleCall_1()); 
    }
    this_Label_1=ruleLabel
    { 
        $current = $this_Label_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAtomicAccess().getBooleanParserRuleCall_2()); 
    }
    this_Boolean_2=ruleBoolean
    { 
        $current = $this_Boolean_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleState
entryRuleState returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	 iv_ruleState=ruleState 
	 { $current=$iv_ruleState.current; } 
	 EOF 
;

// Rule State
ruleState returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='State:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
    }
(
(
		lv_value_1_0=RULE_STRING
		{
			newLeafNode(lv_value_1_0, grammarAccess.getStateAccess().getValueSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStateRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleLabel
entryRuleLabel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getLabelRule()); }
	 iv_ruleLabel=ruleLabel 
	 { $current=$iv_ruleLabel.current; } 
	 EOF 
;

// Rule Label
ruleLabel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Label:' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
    }
(
(
		lv_value_1_0=RULE_STRING
		{
			newLeafNode(lv_value_1_0, grammarAccess.getLabelAccess().getValueSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getLabelRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleBoolean
entryRuleBoolean returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBooleanRule()); }
	 iv_ruleBoolean=ruleBoolean 
	 { $current=$iv_ruleBoolean.current; } 
	 EOF 
;

// Rule Boolean
ruleBoolean returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_value_0_0=RULE_BOOL
		{
			newLeafNode(lv_value_0_0, grammarAccess.getBooleanAccess().getValueBOOLTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBooleanRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"BOOL");
	    }

)
)
;





// Entry rule entryRulePathFormula
entryRulePathFormula returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
	}
	:
	{ newCompositeNode(grammarAccess.getPathFormulaRule()); }
	 iv_rulePathFormula=rulePathFormula 
	 { $current=$iv_rulePathFormula.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule PathFormula
rulePathFormula returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getPathFormulaAccess().getNextParserRuleCall_0()); 
    }
    this_Next_0=ruleNext
    { 
        $current = $this_Next_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPathFormulaAccess().getUntilParserRuleCall_1()); 
    }
    this_Until_1=ruleUntil
    { 
        $current = $this_Until_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPathFormulaAccess().getFutureParserRuleCall_2()); 
    }
    this_Future_2=ruleFuture
    { 
        $current = $this_Future_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getPathFormulaAccess().getGloballyParserRuleCall_3()); 
    }
    this_Globally_3=ruleGlobally
    { 
        $current = $this_Globally_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRuleUntil
entryRuleUntil returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUntilRule()); }
	 iv_ruleUntil=ruleUntil 
	 { $current=$iv_ruleUntil.current; } 
	 EOF 
;

// Rule Until
ruleUntil returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getUntilAccess().getLeftStateFormulaParserRuleCall_0_0()); 
	    }
		lv_left_0_0=ruleStateFormula		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUntilRule());
	        }
       		set(
       			$current, 
       			"left",
        		lv_left_0_0, 
        		"StateFormula");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
(
		lv_type_1_1=	'U' 
    {
        newLeafNode(lv_type_1_1, grammarAccess.getUntilAccess().getTypeUKeyword_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUntilRule());
	        }
       		setWithLastConsumed($current, "type", lv_type_1_1, null);
	    }

    |		lv_type_1_2=	'W' 
    {
        newLeafNode(lv_type_1_2, grammarAccess.getUntilAccess().getTypeWKeyword_1_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUntilRule());
	        }
       		setWithLastConsumed($current, "type", lv_type_1_2, null);
	    }

    |		lv_type_1_3=	'R' 
    {
        newLeafNode(lv_type_1_3, grammarAccess.getUntilAccess().getTypeRKeyword_1_0_2());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getUntilRule());
	        }
       		setWithLastConsumed($current, "type", lv_type_1_3, null);
	    }

)

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getUntilAccess().getBoundTimeBoundParserRuleCall_2_0()); 
	    }
		lv_bound_2_0=ruleTimeBound		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUntilRule());
	        }
       		set(
       			$current, 
       			"bound",
        		lv_bound_2_0, 
        		"TimeBound");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getUntilAccess().getRightStateFormulaParserRuleCall_3_0()); 
	    }
		lv_right_3_0=ruleStateFormula		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getUntilRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"StateFormula");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleNext
entryRuleNext returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNextRule()); }
	 iv_ruleNext=ruleNext 
	 { $current=$iv_ruleNext.current; } 
	 EOF 
;

// Rule Next
ruleNext returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='X' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getNextAccess().getXKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNextAccess().getBoundTimeBoundParserRuleCall_1_0()); 
	    }
		lv_bound_1_0=ruleTimeBound		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNextRule());
	        }
       		set(
       			$current, 
       			"bound",
        		lv_bound_1_0, 
        		"TimeBound");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getNextAccess().getValueStateFormulaParserRuleCall_2_0()); 
	    }
		lv_value_2_0=ruleStateFormula		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNextRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"StateFormula");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleFuture
entryRuleFuture returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFutureRule()); }
	 iv_ruleFuture=ruleFuture 
	 { $current=$iv_ruleFuture.current; } 
	 EOF 
;

// Rule Future
ruleFuture returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='F' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getFutureAccess().getFKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFutureAccess().getBoundTimeBoundParserRuleCall_1_0()); 
	    }
		lv_bound_1_0=ruleTimeBound		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFutureRule());
	        }
       		set(
       			$current, 
       			"bound",
        		lv_bound_1_0, 
        		"TimeBound");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getFutureAccess().getValueStateFormulaParserRuleCall_2_0()); 
	    }
		lv_value_2_0=ruleStateFormula		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFutureRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"StateFormula");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleGlobally
entryRuleGlobally returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGloballyRule()); }
	 iv_ruleGlobally=ruleGlobally 
	 { $current=$iv_ruleGlobally.current; } 
	 EOF 
;

// Rule Globally
ruleGlobally returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='G' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getGloballyAccess().getGKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getGloballyAccess().getBoundTimeBoundParserRuleCall_1_0()); 
	    }
		lv_bound_1_0=ruleTimeBound		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGloballyRule());
	        }
       		set(
       			$current, 
       			"bound",
        		lv_bound_1_0, 
        		"TimeBound");
	        afterParserOrEnumRuleCall();
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getGloballyAccess().getValueStateFormulaParserRuleCall_2_0()); 
	    }
		lv_value_2_0=ruleStateFormula		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGloballyRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"StateFormula");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleCompareProbability
entryRuleCompareProbability returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
	}
	:
	{ newCompositeNode(grammarAccess.getCompareProbabilityRule()); }
	 iv_ruleCompareProbability=ruleCompareProbability 
	 { $current=$iv_ruleCompareProbability.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule CompareProbability
ruleCompareProbability returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
    }
    @after { leaveRule(); }:
((
(
		lv_operator_0_0=RULE_COMPARATOR
		{
			newLeafNode(lv_operator_0_0, grammarAccess.getCompareProbabilityAccess().getOperatorCOMPARATORTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCompareProbabilityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"operator",
        		lv_operator_0_0, 
        		"COMPARATOR");
	    }

)
)(
(
		lv_value_1_0=RULE_DOUBLE
		{
			newLeafNode(lv_value_1_0, grammarAccess.getCompareProbabilityAccess().getValueDOUBLETerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getCompareProbabilityRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"DOUBLE");
	    }

)
))
;
finally {
	myHiddenTokenState.restore();
}





// Entry rule entryRuleTimeBound
entryRuleTimeBound returns [EObject current=null] 
	@init { 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
	}
	:
	{ newCompositeNode(grammarAccess.getTimeBoundRule()); }
	 iv_ruleTimeBound=ruleTimeBound 
	 { $current=$iv_ruleTimeBound.current; } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule TimeBound
ruleTimeBound returns [EObject current=null] 
    @init { enterRule(); 
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
    }
    @after { leaveRule(); }:
(((
(
(
		lv_operator_0_1=RULE_COMPARATOR
		{
			newLeafNode(lv_operator_0_1, grammarAccess.getTimeBoundAccess().getOperatorCOMPARATORTerminalRuleCall_0_0_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimeBoundRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"operator",
        		lv_operator_0_1, 
        		"COMPARATOR");
	    }

    |		lv_operator_0_2=	'=' 
    {
        newLeafNode(lv_operator_0_2, grammarAccess.getTimeBoundAccess().getOperatorEqualsSignKeyword_0_0_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimeBoundRule());
	        }
       		setWithLastConsumed($current, "operator", lv_operator_0_2, null);
	    }

)

)
)(
(
		lv_value_1_0=RULE_DOUBLE
		{
			newLeafNode(lv_value_1_0, grammarAccess.getTimeBoundAccess().getValueDOUBLETerminalRuleCall_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimeBoundRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"DOUBLE");
	    }

)
))
    |(	otherlv_2='[' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTimeBoundAccess().getLeftSquareBracketKeyword_1_0());
    }
(
(
		lv_from_3_0=RULE_DOUBLE
		{
			newLeafNode(lv_from_3_0, grammarAccess.getTimeBoundAccess().getFromDOUBLETerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimeBoundRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"from",
        		lv_from_3_0, 
        		"DOUBLE");
	    }

)
)(
(
		lv_operator_4_0=	',' 
    {
        newLeafNode(lv_operator_4_0, grammarAccess.getTimeBoundAccess().getOperatorCommaKeyword_1_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimeBoundRule());
	        }
       		setWithLastConsumed($current, "operator", lv_operator_4_0, ",");
	    }

)
)(
(
		lv_to_5_0=RULE_DOUBLE
		{
			newLeafNode(lv_to_5_0, grammarAccess.getTimeBoundAccess().getToDOUBLETerminalRuleCall_1_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTimeBoundRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"to",
        		lv_to_5_0, 
        		"DOUBLE");
	    }

)
)	otherlv_6=']' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getTimeBoundAccess().getRightSquareBracketKeyword_1_4());
    }
))
;
finally {
	myHiddenTokenState.restore();
}





RULE_BOOL : ('true'|'false');

RULE_DOUBLE : (RULE_INT ('.' RULE_INT)?|'.' RULE_INT);

RULE_COMPARATOR : ('>' '='?|'<' '='?);

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


