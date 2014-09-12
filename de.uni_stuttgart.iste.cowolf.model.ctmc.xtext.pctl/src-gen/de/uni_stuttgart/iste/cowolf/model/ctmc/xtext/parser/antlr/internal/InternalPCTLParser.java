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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPCTLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_ID", "RULE_BOOL", "RULE_DECIMAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'State:'", "'Label:'", "'!'", "'&'", "'|'", "'('", "')'", "'S'", "'=?'", "'['", "']'", "'P'", "'U'", "'W'", "'R'", "'X'", "'F'", "'G'", "'=>'", "'>'", "'='", "'<'", "','"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_BOOL=6;
    public static final int RULE_SL_COMMENT=4;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=9;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=8;
    public static final int RULE_WS=11;
    public static final int RULE_DECIMAL=7;

    // delegates
    // delegators


        public InternalPCTLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPCTLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPCTLParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g"; }



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



    // $ANTLR start "entryRuleStart"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:67:1: entryRuleStart returns [EObject current=null] : iv_ruleStart= ruleStart EOF ;
    public final EObject entryRuleStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStart = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:68:2: (iv_ruleStart= ruleStart EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:69:2: iv_ruleStart= ruleStart EOF
            {
             newCompositeNode(grammarAccess.getStartRule()); 
            pushFollow(FOLLOW_ruleStart_in_entryRuleStart75);
            iv_ruleStart=ruleStart();

            state._fsp--;

             current =iv_ruleStart; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStart85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStart"


    // $ANTLR start "ruleStart"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:76:1: ruleStart returns [EObject current=null] : ( ( (lv_start_0_0= ruleCommentedRule ) ) ( (lv_start_1_0= ruleStart ) )? ) ;
    public final EObject ruleStart() throws RecognitionException {
        EObject current = null;

        EObject lv_start_0_0 = null;

        EObject lv_start_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:79:28: ( ( ( (lv_start_0_0= ruleCommentedRule ) ) ( (lv_start_1_0= ruleStart ) )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:80:1: ( ( (lv_start_0_0= ruleCommentedRule ) ) ( (lv_start_1_0= ruleStart ) )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:80:1: ( ( (lv_start_0_0= ruleCommentedRule ) ) ( (lv_start_1_0= ruleStart ) )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:80:2: ( (lv_start_0_0= ruleCommentedRule ) ) ( (lv_start_1_0= ruleStart ) )?
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:80:2: ( (lv_start_0_0= ruleCommentedRule ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:81:1: (lv_start_0_0= ruleCommentedRule )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:81:1: (lv_start_0_0= ruleCommentedRule )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:82:3: lv_start_0_0= ruleCommentedRule
            {
             
            	        newCompositeNode(grammarAccess.getStartAccess().getStartCommentedRuleParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCommentedRule_in_ruleStart131);
            lv_start_0_0=ruleCommentedRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStartRule());
            	        }
                   		set(
                   			current, 
                   			"start",
                    		lv_start_0_0, 
                    		"CommentedRule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:98:2: ( (lv_start_1_0= ruleStart ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_SL_COMMENT||LA1_0==RULE_BOOL||(LA1_0>=13 && LA1_0<=15)||LA1_0==18||LA1_0==20||LA1_0==24) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:99:1: (lv_start_1_0= ruleStart )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:99:1: (lv_start_1_0= ruleStart )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:100:3: lv_start_1_0= ruleStart
                    {
                     
                    	        newCompositeNode(grammarAccess.getStartAccess().getStartStartParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStart_in_ruleStart152);
                    lv_start_1_0=ruleStart();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStartRule());
                    	        }
                           		set(
                           			current, 
                           			"start",
                            		lv_start_1_0, 
                            		"Start");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStart"


    // $ANTLR start "entryRuleCommentedRule"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:124:1: entryRuleCommentedRule returns [EObject current=null] : iv_ruleCommentedRule= ruleCommentedRule EOF ;
    public final EObject entryRuleCommentedRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentedRule = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:125:2: (iv_ruleCommentedRule= ruleCommentedRule EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:126:2: iv_ruleCommentedRule= ruleCommentedRule EOF
            {
             newCompositeNode(grammarAccess.getCommentedRuleRule()); 
            pushFollow(FOLLOW_ruleCommentedRule_in_entryRuleCommentedRule189);
            iv_ruleCommentedRule=ruleCommentedRule();

            state._fsp--;

             current =iv_ruleCommentedRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentedRule199); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommentedRule"


    // $ANTLR start "ruleCommentedRule"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:133:1: ruleCommentedRule returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_SL_COMMENT ) )? ( (lv_rule_1_0= rulePctl ) ) ) ;
    public final EObject ruleCommentedRule() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;
        EObject lv_rule_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:136:28: ( ( ( (lv_comment_0_0= RULE_SL_COMMENT ) )? ( (lv_rule_1_0= rulePctl ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:137:1: ( ( (lv_comment_0_0= RULE_SL_COMMENT ) )? ( (lv_rule_1_0= rulePctl ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:137:1: ( ( (lv_comment_0_0= RULE_SL_COMMENT ) )? ( (lv_rule_1_0= rulePctl ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:137:2: ( (lv_comment_0_0= RULE_SL_COMMENT ) )? ( (lv_rule_1_0= rulePctl ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:137:2: ( (lv_comment_0_0= RULE_SL_COMMENT ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_SL_COMMENT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:138:1: (lv_comment_0_0= RULE_SL_COMMENT )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:138:1: (lv_comment_0_0= RULE_SL_COMMENT )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:139:3: lv_comment_0_0= RULE_SL_COMMENT
                    {
                    lv_comment_0_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleCommentedRule241); 

                    			newLeafNode(lv_comment_0_0, grammarAccess.getCommentedRuleAccess().getCommentSL_COMMENTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCommentedRuleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"comment",
                            		lv_comment_0_0, 
                            		"SL_COMMENT");
                    	    

                    }


                    }
                    break;

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:155:3: ( (lv_rule_1_0= rulePctl ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:156:1: (lv_rule_1_0= rulePctl )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:156:1: (lv_rule_1_0= rulePctl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:157:3: lv_rule_1_0= rulePctl
            {
             
            	        newCompositeNode(grammarAccess.getCommentedRuleAccess().getRulePctlParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePctl_in_ruleCommentedRule268);
            lv_rule_1_0=rulePctl();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCommentedRuleRule());
            	        }
                   		set(
                   			current, 
                   			"rule",
                    		lv_rule_1_0, 
                    		"Pctl");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommentedRule"


    // $ANTLR start "entryRulePctl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:181:1: entryRulePctl returns [EObject current=null] : iv_rulePctl= rulePctl EOF ;
    public final EObject entryRulePctl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePctl = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:182:2: (iv_rulePctl= rulePctl EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:183:2: iv_rulePctl= rulePctl EOF
            {
             newCompositeNode(grammarAccess.getPctlRule()); 
            pushFollow(FOLLOW_rulePctl_in_entryRulePctl304);
            iv_rulePctl=rulePctl();

            state._fsp--;

             current =iv_rulePctl; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePctl314); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePctl"


    // $ANTLR start "rulePctl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:190:1: rulePctl returns [EObject current=null] : (this_StateFormula_0= ruleStateFormula | this_SteadyState_1= ruleSteadyState | this_QuantifiedProbability_2= ruleQuantifiedProbability ) ;
    public final EObject rulePctl() throws RecognitionException {
        EObject current = null;

        EObject this_StateFormula_0 = null;

        EObject this_SteadyState_1 = null;

        EObject this_QuantifiedProbability_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:193:28: ( (this_StateFormula_0= ruleStateFormula | this_SteadyState_1= ruleSteadyState | this_QuantifiedProbability_2= ruleQuantifiedProbability ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:194:1: (this_StateFormula_0= ruleStateFormula | this_SteadyState_1= ruleSteadyState | this_QuantifiedProbability_2= ruleQuantifiedProbability )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:194:1: (this_StateFormula_0= ruleStateFormula | this_SteadyState_1= ruleSteadyState | this_QuantifiedProbability_2= ruleQuantifiedProbability )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
            case 13:
            case 14:
            case 15:
            case 18:
                {
                alt3=1;
                }
                break;
            case 24:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==21) ) {
                    alt3=3;
                }
                else if ( (LA3_2==32||LA3_2==34) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:195:5: this_StateFormula_0= ruleStateFormula
                    {
                     
                            newCompositeNode(grammarAccess.getPctlAccess().getStateFormulaParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStateFormula_in_rulePctl361);
                    this_StateFormula_0=ruleStateFormula();

                    state._fsp--;

                     
                            current = this_StateFormula_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:205:5: this_SteadyState_1= ruleSteadyState
                    {
                     
                            newCompositeNode(grammarAccess.getPctlAccess().getSteadyStateParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSteadyState_in_rulePctl388);
                    this_SteadyState_1=ruleSteadyState();

                    state._fsp--;

                     
                            current = this_SteadyState_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:215:5: this_QuantifiedProbability_2= ruleQuantifiedProbability
                    {
                     
                            newCompositeNode(grammarAccess.getPctlAccess().getQuantifiedProbabilityParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleQuantifiedProbability_in_rulePctl415);
                    this_QuantifiedProbability_2=ruleQuantifiedProbability();

                    state._fsp--;

                     
                            current = this_QuantifiedProbability_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePctl"


    // $ANTLR start "entryRuleState"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:231:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:232:2: (iv_ruleState= ruleState EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:233:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState450);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState460); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:240:1: ruleState returns [EObject current=null] : (otherlv_0= 'State:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:243:28: ( (otherlv_0= 'State:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:244:1: (otherlv_0= 'State:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:244:1: (otherlv_0= 'State:' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:244:3: otherlv_0= 'State:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleState497); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:248:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:249:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:249:1: (lv_name_1_0= RULE_ID )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:250:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState514); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleLabel"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:274:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:275:2: (iv_ruleLabel= ruleLabel EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:276:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel555);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel565); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:283:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'Label:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:286:28: ( (otherlv_0= 'Label:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:287:1: (otherlv_0= 'Label:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:287:1: (otherlv_0= 'Label:' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:287:3: otherlv_0= 'Label:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleLabel602); 

                	newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:291:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:292:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:292:1: (lv_name_1_0= RULE_ID )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:293:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel619); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleAtomic"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:317:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:318:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:319:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic660);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic670); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:326:1: ruleAtomic returns [EObject current=null] : (this_State_0= ruleState | this_Label_1= ruleLabel | this_BOOL_2= RULE_BOOL ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token this_BOOL_2=null;
        EObject this_State_0 = null;

        EObject this_Label_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:329:28: ( (this_State_0= ruleState | this_Label_1= ruleLabel | this_BOOL_2= RULE_BOOL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:330:1: (this_State_0= ruleState | this_Label_1= ruleLabel | this_BOOL_2= RULE_BOOL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:330:1: (this_State_0= ruleState | this_Label_1= ruleLabel | this_BOOL_2= RULE_BOOL )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case RULE_BOOL:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:331:5: this_State_0= ruleState
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicAccess().getStateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleState_in_ruleAtomic717);
                    this_State_0=ruleState();

                    state._fsp--;

                     
                            current = this_State_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:341:5: this_Label_1= ruleLabel
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicAccess().getLabelParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLabel_in_ruleAtomic744);
                    this_Label_1=ruleLabel();

                    state._fsp--;

                     
                            current = this_Label_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:350:6: this_BOOL_2= RULE_BOOL
                    {
                    this_BOOL_2=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleAtomic760); 
                     
                        newLeafNode(this_BOOL_2, grammarAccess.getAtomicAccess().getBOOLTerminalRuleCall_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleNegation"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:362:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:363:2: (iv_ruleNegation= ruleNegation EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:364:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation795);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation805); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:371:1: ruleNegation returns [EObject current=null] : (otherlv_0= '!' this_StateFormula_1= ruleStateFormula ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_StateFormula_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:374:28: ( (otherlv_0= '!' this_StateFormula_1= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:375:1: (otherlv_0= '!' this_StateFormula_1= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:375:1: (otherlv_0= '!' this_StateFormula_1= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:375:3: otherlv_0= '!' this_StateFormula_1= ruleStateFormula
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleNegation842); 

                	newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getExclamationMarkKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getNegationAccess().getStateFormulaParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleStateFormula_in_ruleNegation864);
            this_StateFormula_1=ruleStateFormula();

            state._fsp--;

             
                    current = this_StateFormula_1; 
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleJunction"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:396:1: entryRuleJunction returns [EObject current=null] : iv_ruleJunction= ruleJunction EOF ;
    public final EObject entryRuleJunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJunction = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:397:2: (iv_ruleJunction= ruleJunction EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:398:2: iv_ruleJunction= ruleJunction EOF
            {
             newCompositeNode(grammarAccess.getJunctionRule()); 
            pushFollow(FOLLOW_ruleJunction_in_entryRuleJunction899);
            iv_ruleJunction=ruleJunction();

            state._fsp--;

             current =iv_ruleJunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJunction909); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJunction"


    // $ANTLR start "ruleJunction"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:405:1: ruleJunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction | this_Disjunction_1= ruleDisjunction ) ;
    public final EObject ruleJunction() throws RecognitionException {
        EObject current = null;

        EObject this_Conjunction_0 = null;

        EObject this_Disjunction_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:408:28: ( (this_Conjunction_0= ruleConjunction | this_Disjunction_1= ruleDisjunction ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:409:1: (this_Conjunction_0= ruleConjunction | this_Disjunction_1= ruleDisjunction )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:409:1: (this_Conjunction_0= ruleConjunction | this_Disjunction_1= ruleDisjunction )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:410:5: this_Conjunction_0= ruleConjunction
                    {
                     
                            newCompositeNode(grammarAccess.getJunctionAccess().getConjunctionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConjunction_in_ruleJunction956);
                    this_Conjunction_0=ruleConjunction();

                    state._fsp--;

                     
                            current = this_Conjunction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:420:5: this_Disjunction_1= ruleDisjunction
                    {
                     
                            newCompositeNode(grammarAccess.getJunctionAccess().getDisjunctionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDisjunction_in_ruleJunction983);
                    this_Disjunction_1=ruleDisjunction();

                    state._fsp--;

                     
                            current = this_Disjunction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJunction"


    // $ANTLR start "entryRuleConjunction"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:436:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:437:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:438:2: iv_ruleConjunction= ruleConjunction EOF
            {
             newCompositeNode(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction1018);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;

             current =iv_ruleConjunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction1028); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:445:1: ruleConjunction returns [EObject current=null] : (otherlv_0= '&' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_StateFormula_1 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:448:28: ( (otherlv_0= '&' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:449:1: (otherlv_0= '&' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:449:1: (otherlv_0= '&' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:449:3: otherlv_0= '&' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleConjunction1065); 

                	newLeafNode(otherlv_0, grammarAccess.getConjunctionAccess().getAmpersandKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getConjunctionAccess().getStateFormulaParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleStateFormula_in_ruleConjunction1087);
            this_StateFormula_1=ruleStateFormula();

            state._fsp--;

             
                    current = this_StateFormula_1; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:462:1: ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:462:2: () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) )
            	    {
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:462:2: ()
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:463:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getConjunctionAccess().getConjunctionLeftAction_2_0(),
            	                current);
            	        

            	    }

            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleConjunction1108); 

            	        	newLeafNode(otherlv_3, grammarAccess.getConjunctionAccess().getAmpersandKeyword_2_1());
            	        
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:472:1: ( (lv_right_4_0= ruleStateFormula ) )
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:473:1: (lv_right_4_0= ruleStateFormula )
            	    {
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:473:1: (lv_right_4_0= ruleStateFormula )
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:474:3: lv_right_4_0= ruleStateFormula
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStateFormula_in_ruleConjunction1129);
            	    lv_right_4_0=ruleStateFormula();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConjunctionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_4_0, 
            	            		"StateFormula");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleDisjunction"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:498:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:499:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:500:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
             newCompositeNode(grammarAccess.getDisjunctionRule()); 
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction1167);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;

             current =iv_ruleDisjunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction1177); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisjunction"


    // $ANTLR start "ruleDisjunction"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:507:1: ruleDisjunction returns [EObject current=null] : (otherlv_0= '|' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )* ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_StateFormula_1 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:510:28: ( (otherlv_0= '|' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:511:1: (otherlv_0= '|' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:511:1: (otherlv_0= '|' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:511:3: otherlv_0= '|' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleDisjunction1214); 

                	newLeafNode(otherlv_0, grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getDisjunctionAccess().getStateFormulaParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleStateFormula_in_ruleDisjunction1236);
            this_StateFormula_1=ruleStateFormula();

            state._fsp--;

             
                    current = this_StateFormula_1; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:524:1: ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:524:2: () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) )
            	    {
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:524:2: ()
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:525:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_2_0(),
            	                current);
            	        

            	    }

            	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleDisjunction1257); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_2_1());
            	        
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:534:1: ( (lv_right_4_0= ruleStateFormula ) )
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:535:1: (lv_right_4_0= ruleStateFormula )
            	    {
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:535:1: (lv_right_4_0= ruleStateFormula )
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:536:3: lv_right_4_0= ruleStateFormula
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStateFormula_in_ruleDisjunction1278);
            	    lv_right_4_0=ruleStateFormula();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDisjunctionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_4_0, 
            	            		"StateFormula");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisjunction"


    // $ANTLR start "entryRuleStateFormula"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:560:1: entryRuleStateFormula returns [EObject current=null] : iv_ruleStateFormula= ruleStateFormula EOF ;
    public final EObject entryRuleStateFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateFormula = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:561:2: (iv_ruleStateFormula= ruleStateFormula EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:562:2: iv_ruleStateFormula= ruleStateFormula EOF
            {
             newCompositeNode(grammarAccess.getStateFormulaRule()); 
            pushFollow(FOLLOW_ruleStateFormula_in_entryRuleStateFormula1316);
            iv_ruleStateFormula=ruleStateFormula();

            state._fsp--;

             current =iv_ruleStateFormula; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateFormula1326); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateFormula"


    // $ANTLR start "ruleStateFormula"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:569:1: ruleStateFormula returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_left_1_0= ruleStateFormula ) ) ( ( (lv_right_2_0= ruleJunction ) ) | ( (lv_right_3_0= ruleImplication ) ) )? otherlv_4= ')' ) | this_Negation_5= ruleNegation | this_Atomic_6= ruleAtomic | ( (lv_left_7_0= ruleProbability ) ) ) ;
    public final EObject ruleStateFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_2_0 = null;

        EObject lv_right_3_0 = null;

        EObject this_Negation_5 = null;

        EObject this_Atomic_6 = null;

        EObject lv_left_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:572:28: ( ( (otherlv_0= '(' ( (lv_left_1_0= ruleStateFormula ) ) ( ( (lv_right_2_0= ruleJunction ) ) | ( (lv_right_3_0= ruleImplication ) ) )? otherlv_4= ')' ) | this_Negation_5= ruleNegation | this_Atomic_6= ruleAtomic | ( (lv_left_7_0= ruleProbability ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:573:1: ( (otherlv_0= '(' ( (lv_left_1_0= ruleStateFormula ) ) ( ( (lv_right_2_0= ruleJunction ) ) | ( (lv_right_3_0= ruleImplication ) ) )? otherlv_4= ')' ) | this_Negation_5= ruleNegation | this_Atomic_6= ruleAtomic | ( (lv_left_7_0= ruleProbability ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:573:1: ( (otherlv_0= '(' ( (lv_left_1_0= ruleStateFormula ) ) ( ( (lv_right_2_0= ruleJunction ) ) | ( (lv_right_3_0= ruleImplication ) ) )? otherlv_4= ')' ) | this_Negation_5= ruleNegation | this_Atomic_6= ruleAtomic | ( (lv_left_7_0= ruleProbability ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 15:
                {
                alt9=2;
                }
                break;
            case RULE_BOOL:
            case 13:
            case 14:
                {
                alt9=3;
                }
                break;
            case 24:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:573:2: (otherlv_0= '(' ( (lv_left_1_0= ruleStateFormula ) ) ( ( (lv_right_2_0= ruleJunction ) ) | ( (lv_right_3_0= ruleImplication ) ) )? otherlv_4= ')' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:573:2: (otherlv_0= '(' ( (lv_left_1_0= ruleStateFormula ) ) ( ( (lv_right_2_0= ruleJunction ) ) | ( (lv_right_3_0= ruleImplication ) ) )? otherlv_4= ')' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:573:4: otherlv_0= '(' ( (lv_left_1_0= ruleStateFormula ) ) ( ( (lv_right_2_0= ruleJunction ) ) | ( (lv_right_3_0= ruleImplication ) ) )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleStateFormula1364); 

                        	newLeafNode(otherlv_0, grammarAccess.getStateFormulaAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:577:1: ( (lv_left_1_0= ruleStateFormula ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:578:1: (lv_left_1_0= ruleStateFormula )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:578:1: (lv_left_1_0= ruleStateFormula )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:579:3: lv_left_1_0= ruleStateFormula
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFormulaAccess().getLeftStateFormulaParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStateFormula_in_ruleStateFormula1385);
                    lv_left_1_0=ruleStateFormula();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateFormulaRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_1_0, 
                            		"StateFormula");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:595:2: ( ( (lv_right_2_0= ruleJunction ) ) | ( (lv_right_3_0= ruleImplication ) ) )?
                    int alt8=3;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=16 && LA8_0<=17)) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==31) ) {
                        alt8=2;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:595:3: ( (lv_right_2_0= ruleJunction ) )
                            {
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:595:3: ( (lv_right_2_0= ruleJunction ) )
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:596:1: (lv_right_2_0= ruleJunction )
                            {
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:596:1: (lv_right_2_0= ruleJunction )
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:597:3: lv_right_2_0= ruleJunction
                            {
                             
                            	        newCompositeNode(grammarAccess.getStateFormulaAccess().getRightJunctionParserRuleCall_0_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleJunction_in_ruleStateFormula1407);
                            lv_right_2_0=ruleJunction();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getStateFormulaRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"right",
                                    		lv_right_2_0, 
                                    		"Junction");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:614:6: ( (lv_right_3_0= ruleImplication ) )
                            {
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:614:6: ( (lv_right_3_0= ruleImplication ) )
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:615:1: (lv_right_3_0= ruleImplication )
                            {
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:615:1: (lv_right_3_0= ruleImplication )
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:616:3: lv_right_3_0= ruleImplication
                            {
                             
                            	        newCompositeNode(grammarAccess.getStateFormulaAccess().getRightImplicationParserRuleCall_0_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleImplication_in_ruleStateFormula1434);
                            lv_right_3_0=ruleImplication();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getStateFormulaRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"right",
                                    		lv_right_3_0, 
                                    		"Implication");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleStateFormula1448); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateFormulaAccess().getRightParenthesisKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:638:5: this_Negation_5= ruleNegation
                    {
                     
                            newCompositeNode(grammarAccess.getStateFormulaAccess().getNegationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNegation_in_ruleStateFormula1477);
                    this_Negation_5=ruleNegation();

                    state._fsp--;

                     
                            current = this_Negation_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:648:5: this_Atomic_6= ruleAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getStateFormulaAccess().getAtomicParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAtomic_in_ruleStateFormula1504);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;

                     
                            current = this_Atomic_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:657:6: ( (lv_left_7_0= ruleProbability ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:657:6: ( (lv_left_7_0= ruleProbability ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:658:1: (lv_left_7_0= ruleProbability )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:658:1: (lv_left_7_0= ruleProbability )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:659:3: lv_left_7_0= ruleProbability
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFormulaAccess().getLeftProbabilityParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProbability_in_ruleStateFormula1530);
                    lv_left_7_0=ruleProbability();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateFormulaRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_7_0, 
                            		"Probability");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateFormula"


    // $ANTLR start "entryRulePathFormula"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:683:1: entryRulePathFormula returns [EObject current=null] : iv_rulePathFormula= rulePathFormula EOF ;
    public final EObject entryRulePathFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathFormula = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:684:2: (iv_rulePathFormula= rulePathFormula EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:685:2: iv_rulePathFormula= rulePathFormula EOF
            {
             newCompositeNode(grammarAccess.getPathFormulaRule()); 
            pushFollow(FOLLOW_rulePathFormula_in_entryRulePathFormula1566);
            iv_rulePathFormula=rulePathFormula();

            state._fsp--;

             current =iv_rulePathFormula; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathFormula1576); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathFormula"


    // $ANTLR start "rulePathFormula"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:692:1: rulePathFormula returns [EObject current=null] : (this_Next_0= ruleNext | this_Until_1= ruleUntil | this_Future_2= ruleFuture | this_Globally_3= ruleGlobally ) ;
    public final EObject rulePathFormula() throws RecognitionException {
        EObject current = null;

        EObject this_Next_0 = null;

        EObject this_Until_1 = null;

        EObject this_Future_2 = null;

        EObject this_Globally_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:695:28: ( (this_Next_0= ruleNext | this_Until_1= ruleUntil | this_Future_2= ruleFuture | this_Globally_3= ruleGlobally ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:696:1: (this_Next_0= ruleNext | this_Until_1= ruleUntil | this_Future_2= ruleFuture | this_Globally_3= ruleGlobally )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:696:1: (this_Next_0= ruleNext | this_Until_1= ruleUntil | this_Future_2= ruleFuture | this_Globally_3= ruleGlobally )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt10=1;
                }
                break;
            case RULE_BOOL:
            case 13:
            case 14:
            case 15:
            case 18:
            case 24:
                {
                alt10=2;
                }
                break;
            case 29:
                {
                alt10=3;
                }
                break;
            case 30:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:697:5: this_Next_0= ruleNext
                    {
                     
                            newCompositeNode(grammarAccess.getPathFormulaAccess().getNextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNext_in_rulePathFormula1623);
                    this_Next_0=ruleNext();

                    state._fsp--;

                     
                            current = this_Next_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:707:5: this_Until_1= ruleUntil
                    {
                     
                            newCompositeNode(grammarAccess.getPathFormulaAccess().getUntilParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUntil_in_rulePathFormula1650);
                    this_Until_1=ruleUntil();

                    state._fsp--;

                     
                            current = this_Until_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:717:5: this_Future_2= ruleFuture
                    {
                     
                            newCompositeNode(grammarAccess.getPathFormulaAccess().getFutureParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFuture_in_rulePathFormula1677);
                    this_Future_2=ruleFuture();

                    state._fsp--;

                     
                            current = this_Future_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:727:5: this_Globally_3= ruleGlobally
                    {
                     
                            newCompositeNode(grammarAccess.getPathFormulaAccess().getGloballyParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleGlobally_in_rulePathFormula1704);
                    this_Globally_3=ruleGlobally();

                    state._fsp--;

                     
                            current = this_Globally_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathFormula"


    // $ANTLR start "entryRuleSteadyState"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:743:1: entryRuleSteadyState returns [EObject current=null] : iv_ruleSteadyState= ruleSteadyState EOF ;
    public final EObject entryRuleSteadyState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSteadyState = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:744:2: (iv_ruleSteadyState= ruleSteadyState EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:745:2: iv_ruleSteadyState= ruleSteadyState EOF
            {
             newCompositeNode(grammarAccess.getSteadyStateRule()); 
            pushFollow(FOLLOW_ruleSteadyState_in_entryRuleSteadyState1739);
            iv_ruleSteadyState=ruleSteadyState();

            state._fsp--;

             current =iv_ruleSteadyState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSteadyState1749); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSteadyState"


    // $ANTLR start "ruleSteadyState"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:752:1: ruleSteadyState returns [EObject current=null] : (otherlv_0= 'S' ( ruleCompareProbability | otherlv_2= '=?' ) otherlv_3= '[' this_StateFormula_4= ruleStateFormula otherlv_5= ']' ) ;
    public final EObject ruleSteadyState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_StateFormula_4 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:755:28: ( (otherlv_0= 'S' ( ruleCompareProbability | otherlv_2= '=?' ) otherlv_3= '[' this_StateFormula_4= ruleStateFormula otherlv_5= ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:756:1: (otherlv_0= 'S' ( ruleCompareProbability | otherlv_2= '=?' ) otherlv_3= '[' this_StateFormula_4= ruleStateFormula otherlv_5= ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:756:1: (otherlv_0= 'S' ( ruleCompareProbability | otherlv_2= '=?' ) otherlv_3= '[' this_StateFormula_4= ruleStateFormula otherlv_5= ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:756:3: otherlv_0= 'S' ( ruleCompareProbability | otherlv_2= '=?' ) otherlv_3= '[' this_StateFormula_4= ruleStateFormula otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleSteadyState1786); 

                	newLeafNode(otherlv_0, grammarAccess.getSteadyStateAccess().getSKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:760:1: ( ruleCompareProbability | otherlv_2= '=?' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32||LA11_0==34) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:761:5: ruleCompareProbability
                    {
                     
                            newCompositeNode(grammarAccess.getSteadyStateAccess().getCompareProbabilityParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleCompareProbability_in_ruleSteadyState1803);
                    ruleCompareProbability();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:769:7: otherlv_2= '=?'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleSteadyState1820); 

                        	newLeafNode(otherlv_2, grammarAccess.getSteadyStateAccess().getEqualsSignQuestionMarkKeyword_1_1());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleSteadyState1833); 

                	newLeafNode(otherlv_3, grammarAccess.getSteadyStateAccess().getLeftSquareBracketKeyword_2());
                
             
                    newCompositeNode(grammarAccess.getSteadyStateAccess().getStateFormulaParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleStateFormula_in_ruleSteadyState1855);
            this_StateFormula_4=ruleStateFormula();

            state._fsp--;

             
                    current = this_StateFormula_4; 
                    afterParserOrEnumRuleCall();
                
            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleSteadyState1866); 

                	newLeafNode(otherlv_5, grammarAccess.getSteadyStateAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSteadyState"


    // $ANTLR start "entryRuleQuantifiedProbability"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:798:1: entryRuleQuantifiedProbability returns [EObject current=null] : iv_ruleQuantifiedProbability= ruleQuantifiedProbability EOF ;
    public final EObject entryRuleQuantifiedProbability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifiedProbability = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:799:2: (iv_ruleQuantifiedProbability= ruleQuantifiedProbability EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:800:2: iv_ruleQuantifiedProbability= ruleQuantifiedProbability EOF
            {
             newCompositeNode(grammarAccess.getQuantifiedProbabilityRule()); 
            pushFollow(FOLLOW_ruleQuantifiedProbability_in_entryRuleQuantifiedProbability1902);
            iv_ruleQuantifiedProbability=ruleQuantifiedProbability();

            state._fsp--;

             current =iv_ruleQuantifiedProbability; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifiedProbability1912); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuantifiedProbability"


    // $ANTLR start "ruleQuantifiedProbability"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:807:1: ruleQuantifiedProbability returns [EObject current=null] : ( (otherlv_0= 'P' otherlv_1= '=?' ) otherlv_2= '[' this_PathFormula_3= rulePathFormula otherlv_4= ']' ) ;
    public final EObject ruleQuantifiedProbability() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PathFormula_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:810:28: ( ( (otherlv_0= 'P' otherlv_1= '=?' ) otherlv_2= '[' this_PathFormula_3= rulePathFormula otherlv_4= ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:811:1: ( (otherlv_0= 'P' otherlv_1= '=?' ) otherlv_2= '[' this_PathFormula_3= rulePathFormula otherlv_4= ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:811:1: ( (otherlv_0= 'P' otherlv_1= '=?' ) otherlv_2= '[' this_PathFormula_3= rulePathFormula otherlv_4= ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:811:2: (otherlv_0= 'P' otherlv_1= '=?' ) otherlv_2= '[' this_PathFormula_3= rulePathFormula otherlv_4= ']'
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:811:2: (otherlv_0= 'P' otherlv_1= '=?' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:811:4: otherlv_0= 'P' otherlv_1= '=?'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleQuantifiedProbability1950); 

                	newLeafNode(otherlv_0, grammarAccess.getQuantifiedProbabilityAccess().getPKeyword_0_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleQuantifiedProbability1962); 

                	newLeafNode(otherlv_1, grammarAccess.getQuantifiedProbabilityAccess().getEqualsSignQuestionMarkKeyword_0_1());
                

            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleQuantifiedProbability1975); 

                	newLeafNode(otherlv_2, grammarAccess.getQuantifiedProbabilityAccess().getLeftSquareBracketKeyword_1());
                
             
                    newCompositeNode(grammarAccess.getQuantifiedProbabilityAccess().getPathFormulaParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulePathFormula_in_ruleQuantifiedProbability1997);
            this_PathFormula_3=rulePathFormula();

            state._fsp--;

             
                    current = this_PathFormula_3; 
                    afterParserOrEnumRuleCall();
                
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleQuantifiedProbability2008); 

                	newLeafNode(otherlv_4, grammarAccess.getQuantifiedProbabilityAccess().getRightSquareBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuantifiedProbability"


    // $ANTLR start "entryRuleProbability"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:844:1: entryRuleProbability returns [EObject current=null] : iv_ruleProbability= ruleProbability EOF ;
    public final EObject entryRuleProbability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbability = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:845:2: (iv_ruleProbability= ruleProbability EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:846:2: iv_ruleProbability= ruleProbability EOF
            {
             newCompositeNode(grammarAccess.getProbabilityRule()); 
            pushFollow(FOLLOW_ruleProbability_in_entryRuleProbability2044);
            iv_ruleProbability=ruleProbability();

            state._fsp--;

             current =iv_ruleProbability; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProbability2054); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProbability"


    // $ANTLR start "ruleProbability"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:853:1: ruleProbability returns [EObject current=null] : (otherlv_0= 'P' ruleCompareProbability otherlv_2= '[' this_PathFormula_3= rulePathFormula otherlv_4= ']' ) ;
    public final EObject ruleProbability() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PathFormula_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:856:28: ( (otherlv_0= 'P' ruleCompareProbability otherlv_2= '[' this_PathFormula_3= rulePathFormula otherlv_4= ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:857:1: (otherlv_0= 'P' ruleCompareProbability otherlv_2= '[' this_PathFormula_3= rulePathFormula otherlv_4= ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:857:1: (otherlv_0= 'P' ruleCompareProbability otherlv_2= '[' this_PathFormula_3= rulePathFormula otherlv_4= ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:857:3: otherlv_0= 'P' ruleCompareProbability otherlv_2= '[' this_PathFormula_3= rulePathFormula otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleProbability2091); 

                	newLeafNode(otherlv_0, grammarAccess.getProbabilityAccess().getPKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getProbabilityAccess().getCompareProbabilityParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleCompareProbability_in_ruleProbability2107);
            ruleCompareProbability();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleProbability2118); 

                	newLeafNode(otherlv_2, grammarAccess.getProbabilityAccess().getLeftSquareBracketKeyword_2());
                
             
                    newCompositeNode(grammarAccess.getProbabilityAccess().getPathFormulaParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulePathFormula_in_ruleProbability2140);
            this_PathFormula_3=rulePathFormula();

            state._fsp--;

             
                    current = this_PathFormula_3; 
                    afterParserOrEnumRuleCall();
                
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleProbability2151); 

                	newLeafNode(otherlv_4, grammarAccess.getProbabilityAccess().getRightSquareBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProbability"


    // $ANTLR start "entryRuleUntil"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:894:1: entryRuleUntil returns [EObject current=null] : iv_ruleUntil= ruleUntil EOF ;
    public final EObject entryRuleUntil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUntil = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:895:2: (iv_ruleUntil= ruleUntil EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:896:2: iv_ruleUntil= ruleUntil EOF
            {
             newCompositeNode(grammarAccess.getUntilRule()); 
            pushFollow(FOLLOW_ruleUntil_in_entryRuleUntil2187);
            iv_ruleUntil=ruleUntil();

            state._fsp--;

             current =iv_ruleUntil; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUntil2197); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUntil"


    // $ANTLR start "ruleUntil"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:903:1: ruleUntil returns [EObject current=null] : ( ( (lv_left_0_0= ruleStateFormula ) ) (otherlv_1= 'U' | otherlv_2= 'W' | otherlv_3= 'R' ) ( ruleTimeBound )? ( (lv_right_5_0= ruleStateFormula ) ) ) ;
    public final EObject ruleUntil() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:906:28: ( ( ( (lv_left_0_0= ruleStateFormula ) ) (otherlv_1= 'U' | otherlv_2= 'W' | otherlv_3= 'R' ) ( ruleTimeBound )? ( (lv_right_5_0= ruleStateFormula ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:907:1: ( ( (lv_left_0_0= ruleStateFormula ) ) (otherlv_1= 'U' | otherlv_2= 'W' | otherlv_3= 'R' ) ( ruleTimeBound )? ( (lv_right_5_0= ruleStateFormula ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:907:1: ( ( (lv_left_0_0= ruleStateFormula ) ) (otherlv_1= 'U' | otherlv_2= 'W' | otherlv_3= 'R' ) ( ruleTimeBound )? ( (lv_right_5_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:907:2: ( (lv_left_0_0= ruleStateFormula ) ) (otherlv_1= 'U' | otherlv_2= 'W' | otherlv_3= 'R' ) ( ruleTimeBound )? ( (lv_right_5_0= ruleStateFormula ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:907:2: ( (lv_left_0_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:908:1: (lv_left_0_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:908:1: (lv_left_0_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:909:3: lv_left_0_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getUntilAccess().getLeftStateFormulaParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleUntil2243);
            lv_left_0_0=ruleStateFormula();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUntilRule());
            	        }
                   		set(
                   			current, 
                   			"left",
                    		lv_left_0_0, 
                    		"StateFormula");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:925:2: (otherlv_1= 'U' | otherlv_2= 'W' | otherlv_3= 'R' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt12=1;
                }
                break;
            case 26:
                {
                alt12=2;
                }
                break;
            case 27:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:925:4: otherlv_1= 'U'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleUntil2256); 

                        	newLeafNode(otherlv_1, grammarAccess.getUntilAccess().getUKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:930:7: otherlv_2= 'W'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleUntil2274); 

                        	newLeafNode(otherlv_2, grammarAccess.getUntilAccess().getWKeyword_1_1());
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:935:7: otherlv_3= 'R'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleUntil2292); 

                        	newLeafNode(otherlv_3, grammarAccess.getUntilAccess().getRKeyword_1_2());
                        

                    }
                    break;

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:939:2: ( ruleTimeBound )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22||(LA13_0>=32 && LA13_0<=34)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:940:5: ruleTimeBound
                    {
                     
                            newCompositeNode(grammarAccess.getUntilAccess().getTimeBoundParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTimeBound_in_ruleUntil2310);
                    ruleTimeBound();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:947:3: ( (lv_right_5_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:948:1: (lv_right_5_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:948:1: (lv_right_5_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:949:3: lv_right_5_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getUntilAccess().getRightStateFormulaParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleUntil2332);
            lv_right_5_0=ruleStateFormula();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUntilRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_5_0, 
                    		"StateFormula");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUntil"


    // $ANTLR start "entryRuleNext"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:973:1: entryRuleNext returns [EObject current=null] : iv_ruleNext= ruleNext EOF ;
    public final EObject entryRuleNext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNext = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:974:2: (iv_ruleNext= ruleNext EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:975:2: iv_ruleNext= ruleNext EOF
            {
             newCompositeNode(grammarAccess.getNextRule()); 
            pushFollow(FOLLOW_ruleNext_in_entryRuleNext2368);
            iv_ruleNext=ruleNext();

            state._fsp--;

             current =iv_ruleNext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNext2378); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNext"


    // $ANTLR start "ruleNext"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:982:1: ruleNext returns [EObject current=null] : (otherlv_0= 'X' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) ) ;
    public final EObject ruleNext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:985:28: ( (otherlv_0= 'X' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:986:1: (otherlv_0= 'X' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:986:1: (otherlv_0= 'X' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:986:3: otherlv_0= 'X' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleNext2415); 

                	newLeafNode(otherlv_0, grammarAccess.getNextAccess().getXKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:990:1: ( ruleTimeBound )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22||(LA14_0>=32 && LA14_0<=34)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:991:5: ruleTimeBound
                    {
                     
                            newCompositeNode(grammarAccess.getNextAccess().getTimeBoundParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTimeBound_in_ruleNext2432);
                    ruleTimeBound();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:998:3: ( (lv_right_2_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:999:1: (lv_right_2_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:999:1: (lv_right_2_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1000:3: lv_right_2_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getNextAccess().getRightStateFormulaParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleNext2454);
            lv_right_2_0=ruleStateFormula();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNextRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_2_0, 
                    		"StateFormula");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNext"


    // $ANTLR start "entryRuleFuture"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1024:1: entryRuleFuture returns [EObject current=null] : iv_ruleFuture= ruleFuture EOF ;
    public final EObject entryRuleFuture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuture = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1025:2: (iv_ruleFuture= ruleFuture EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1026:2: iv_ruleFuture= ruleFuture EOF
            {
             newCompositeNode(grammarAccess.getFutureRule()); 
            pushFollow(FOLLOW_ruleFuture_in_entryRuleFuture2490);
            iv_ruleFuture=ruleFuture();

            state._fsp--;

             current =iv_ruleFuture; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuture2500); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuture"


    // $ANTLR start "ruleFuture"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1033:1: ruleFuture returns [EObject current=null] : (otherlv_0= 'F' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) ) ;
    public final EObject ruleFuture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1036:28: ( (otherlv_0= 'F' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1037:1: (otherlv_0= 'F' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1037:1: (otherlv_0= 'F' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1037:3: otherlv_0= 'F' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleFuture2537); 

                	newLeafNode(otherlv_0, grammarAccess.getFutureAccess().getFKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1041:1: ( ruleTimeBound )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22||(LA15_0>=32 && LA15_0<=34)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1042:5: ruleTimeBound
                    {
                     
                            newCompositeNode(grammarAccess.getFutureAccess().getTimeBoundParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTimeBound_in_ruleFuture2554);
                    ruleTimeBound();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1049:3: ( (lv_right_2_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1050:1: (lv_right_2_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1050:1: (lv_right_2_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1051:3: lv_right_2_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getFutureAccess().getRightStateFormulaParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleFuture2576);
            lv_right_2_0=ruleStateFormula();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFutureRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_2_0, 
                    		"StateFormula");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuture"


    // $ANTLR start "entryRuleGlobally"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1075:1: entryRuleGlobally returns [EObject current=null] : iv_ruleGlobally= ruleGlobally EOF ;
    public final EObject entryRuleGlobally() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobally = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1076:2: (iv_ruleGlobally= ruleGlobally EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1077:2: iv_ruleGlobally= ruleGlobally EOF
            {
             newCompositeNode(grammarAccess.getGloballyRule()); 
            pushFollow(FOLLOW_ruleGlobally_in_entryRuleGlobally2612);
            iv_ruleGlobally=ruleGlobally();

            state._fsp--;

             current =iv_ruleGlobally; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobally2622); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobally"


    // $ANTLR start "ruleGlobally"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1084:1: ruleGlobally returns [EObject current=null] : (otherlv_0= 'G' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) ) ;
    public final EObject ruleGlobally() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1087:28: ( (otherlv_0= 'G' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1088:1: (otherlv_0= 'G' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1088:1: (otherlv_0= 'G' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1088:3: otherlv_0= 'G' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleGlobally2659); 

                	newLeafNode(otherlv_0, grammarAccess.getGloballyAccess().getGKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1092:1: ( ruleTimeBound )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22||(LA16_0>=32 && LA16_0<=34)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1093:5: ruleTimeBound
                    {
                     
                            newCompositeNode(grammarAccess.getGloballyAccess().getTimeBoundParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTimeBound_in_ruleGlobally2676);
                    ruleTimeBound();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1100:3: ( (lv_right_2_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1101:1: (lv_right_2_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1101:1: (lv_right_2_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1102:3: lv_right_2_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getGloballyAccess().getRightStateFormulaParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleGlobally2698);
            lv_right_2_0=ruleStateFormula();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGloballyRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_2_0, 
                    		"StateFormula");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobally"


    // $ANTLR start "entryRuleImplication"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1126:1: entryRuleImplication returns [EObject current=null] : iv_ruleImplication= ruleImplication EOF ;
    public final EObject entryRuleImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplication = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1127:2: (iv_ruleImplication= ruleImplication EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1128:2: iv_ruleImplication= ruleImplication EOF
            {
             newCompositeNode(grammarAccess.getImplicationRule()); 
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication2734);
            iv_ruleImplication=ruleImplication();

            state._fsp--;

             current =iv_ruleImplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication2744); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplication"


    // $ANTLR start "ruleImplication"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1135:1: ruleImplication returns [EObject current=null] : (otherlv_0= '=>' ( (lv_right_1_0= ruleStateFormula ) ) ) ;
    public final EObject ruleImplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1138:28: ( (otherlv_0= '=>' ( (lv_right_1_0= ruleStateFormula ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1139:1: (otherlv_0= '=>' ( (lv_right_1_0= ruleStateFormula ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1139:1: (otherlv_0= '=>' ( (lv_right_1_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1139:3: otherlv_0= '=>' ( (lv_right_1_0= ruleStateFormula ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleImplication2781); 

                	newLeafNode(otherlv_0, grammarAccess.getImplicationAccess().getEqualsSignGreaterThanSignKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1143:1: ( (lv_right_1_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1144:1: (lv_right_1_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1144:1: (lv_right_1_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1145:3: lv_right_1_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getImplicationAccess().getRightStateFormulaParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleImplication2802);
            lv_right_1_0=ruleStateFormula();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImplicationRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_1_0, 
                    		"StateFormula");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplication"


    // $ANTLR start "entryRuleCompareProbability"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1169:1: entryRuleCompareProbability returns [String current=null] : iv_ruleCompareProbability= ruleCompareProbability EOF ;
    public final String entryRuleCompareProbability() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompareProbability = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1170:2: (iv_ruleCompareProbability= ruleCompareProbability EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1171:2: iv_ruleCompareProbability= ruleCompareProbability EOF
            {
             newCompositeNode(grammarAccess.getCompareProbabilityRule()); 
            pushFollow(FOLLOW_ruleCompareProbability_in_entryRuleCompareProbability2839);
            iv_ruleCompareProbability=ruleCompareProbability();

            state._fsp--;

             current =iv_ruleCompareProbability.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareProbability2850); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareProbability"


    // $ANTLR start "ruleCompareProbability"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1178:1: ruleCompareProbability returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) ) this_DECIMAL_4= RULE_DECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleCompareProbability() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_DECIMAL_4=null;

         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1181:28: ( ( ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) ) this_DECIMAL_4= RULE_DECIMAL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1182:1: ( ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) ) this_DECIMAL_4= RULE_DECIMAL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1182:1: ( ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) ) this_DECIMAL_4= RULE_DECIMAL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1182:2: ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) ) this_DECIMAL_4= RULE_DECIMAL
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1182:2: ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            else if ( (LA19_0==34) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1182:3: (kw= '>' (kw= '=' )? )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1182:3: (kw= '>' (kw= '=' )? )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1183:2: kw= '>' (kw= '=' )?
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleCompareProbability2890); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompareProbabilityAccess().getGreaterThanSignKeyword_0_0_0()); 
                        
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1188:1: (kw= '=' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==33) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1189:2: kw= '='
                            {
                            kw=(Token)match(input,33,FOLLOW_33_in_ruleCompareProbability2904); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getCompareProbabilityAccess().getEqualsSignKeyword_0_0_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1195:6: (kw= '<' (kw= '=' )? )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1195:6: (kw= '<' (kw= '=' )? )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1196:2: kw= '<' (kw= '=' )?
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleCompareProbability2927); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompareProbabilityAccess().getLessThanSignKeyword_0_1_0()); 
                        
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1201:1: (kw= '=' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==33) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1202:2: kw= '='
                            {
                            kw=(Token)match(input,33,FOLLOW_33_in_ruleCompareProbability2941); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getCompareProbabilityAccess().getEqualsSignKeyword_0_1_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            this_DECIMAL_4=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleCompareProbability2960); 

            		current.merge(this_DECIMAL_4);
                
             
                newLeafNode(this_DECIMAL_4, grammarAccess.getCompareProbabilityAccess().getDECIMALTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompareProbability"


    // $ANTLR start "entryRuleTimeBound"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1222:1: entryRuleTimeBound returns [String current=null] : iv_ruleTimeBound= ruleTimeBound EOF ;
    public final String entryRuleTimeBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeBound = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1223:2: (iv_ruleTimeBound= ruleTimeBound EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1224:2: iv_ruleTimeBound= ruleTimeBound EOF
            {
             newCompositeNode(grammarAccess.getTimeBoundRule()); 
            pushFollow(FOLLOW_ruleTimeBound_in_entryRuleTimeBound3006);
            iv_ruleTimeBound=ruleTimeBound();

            state._fsp--;

             current =iv_ruleTimeBound.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeBound3017); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeBound"


    // $ANTLR start "ruleTimeBound"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1231:1: ruleTimeBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) | kw= '=' ) this_DECIMAL_5= RULE_DECIMAL ) | (kw= '[' this_DECIMAL_7= RULE_DECIMAL kw= ',' this_DECIMAL_9= RULE_DECIMAL kw= ']' ) ) ;
    public final AntlrDatatypeRuleToken ruleTimeBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_DECIMAL_5=null;
        Token this_DECIMAL_7=null;
        Token this_DECIMAL_9=null;

         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1234:28: ( ( ( ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) | kw= '=' ) this_DECIMAL_5= RULE_DECIMAL ) | (kw= '[' this_DECIMAL_7= RULE_DECIMAL kw= ',' this_DECIMAL_9= RULE_DECIMAL kw= ']' ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1235:1: ( ( ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) | kw= '=' ) this_DECIMAL_5= RULE_DECIMAL ) | (kw= '[' this_DECIMAL_7= RULE_DECIMAL kw= ',' this_DECIMAL_9= RULE_DECIMAL kw= ']' ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1235:1: ( ( ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) | kw= '=' ) this_DECIMAL_5= RULE_DECIMAL ) | (kw= '[' this_DECIMAL_7= RULE_DECIMAL kw= ',' this_DECIMAL_9= RULE_DECIMAL kw= ']' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=32 && LA23_0<=34)) ) {
                alt23=1;
            }
            else if ( (LA23_0==22) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1235:2: ( ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) | kw= '=' ) this_DECIMAL_5= RULE_DECIMAL )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1235:2: ( ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) | kw= '=' ) this_DECIMAL_5= RULE_DECIMAL )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1235:3: ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) | kw= '=' ) this_DECIMAL_5= RULE_DECIMAL
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1235:3: ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) | kw= '=' )
                    int alt22=3;
                    switch ( input.LA(1) ) {
                    case 32:
                        {
                        alt22=1;
                        }
                        break;
                    case 34:
                        {
                        alt22=2;
                        }
                        break;
                    case 33:
                        {
                        alt22=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }

                    switch (alt22) {
                        case 1 :
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1235:4: (kw= '>' (kw= '=' )? )
                            {
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1235:4: (kw= '>' (kw= '=' )? )
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1236:2: kw= '>' (kw= '=' )?
                            {
                            kw=(Token)match(input,32,FOLLOW_32_in_ruleTimeBound3058); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTimeBoundAccess().getGreaterThanSignKeyword_0_0_0_0()); 
                                
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1241:1: (kw= '=' )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==33) ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1242:2: kw= '='
                                    {
                                    kw=(Token)match(input,33,FOLLOW_33_in_ruleTimeBound3072); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getTimeBoundAccess().getEqualsSignKeyword_0_0_0_1()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1248:6: (kw= '<' (kw= '=' )? )
                            {
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1248:6: (kw= '<' (kw= '=' )? )
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1249:2: kw= '<' (kw= '=' )?
                            {
                            kw=(Token)match(input,34,FOLLOW_34_in_ruleTimeBound3095); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTimeBoundAccess().getLessThanSignKeyword_0_0_1_0()); 
                                
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1254:1: (kw= '=' )?
                            int alt21=2;
                            int LA21_0 = input.LA(1);

                            if ( (LA21_0==33) ) {
                                alt21=1;
                            }
                            switch (alt21) {
                                case 1 :
                                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1255:2: kw= '='
                                    {
                                    kw=(Token)match(input,33,FOLLOW_33_in_ruleTimeBound3109); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getTimeBoundAccess().getEqualsSignKeyword_0_0_1_1()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1262:2: kw= '='
                            {
                            kw=(Token)match(input,33,FOLLOW_33_in_ruleTimeBound3131); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTimeBoundAccess().getEqualsSignKeyword_0_0_2()); 
                                

                            }
                            break;

                    }

                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleTimeBound3147); 

                    		current.merge(this_DECIMAL_5);
                        
                     
                        newLeafNode(this_DECIMAL_5, grammarAccess.getTimeBoundAccess().getDECIMALTerminalRuleCall_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1275:6: (kw= '[' this_DECIMAL_7= RULE_DECIMAL kw= ',' this_DECIMAL_9= RULE_DECIMAL kw= ']' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1275:6: (kw= '[' this_DECIMAL_7= RULE_DECIMAL kw= ',' this_DECIMAL_9= RULE_DECIMAL kw= ']' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1276:2: kw= '[' this_DECIMAL_7= RULE_DECIMAL kw= ',' this_DECIMAL_9= RULE_DECIMAL kw= ']'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleTimeBound3173); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeBoundAccess().getLeftSquareBracketKeyword_1_0()); 
                        
                    this_DECIMAL_7=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleTimeBound3188); 

                    		current.merge(this_DECIMAL_7);
                        
                     
                        newLeafNode(this_DECIMAL_7, grammarAccess.getTimeBoundAccess().getDECIMALTerminalRuleCall_1_1()); 
                        
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleTimeBound3206); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeBoundAccess().getCommaKeyword_1_2()); 
                        
                    this_DECIMAL_9=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleTimeBound3221); 

                    		current.merge(this_DECIMAL_9);
                        
                     
                        newLeafNode(this_DECIMAL_9, grammarAccess.getTimeBoundAccess().getDECIMALTerminalRuleCall_1_3()); 
                        
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleTimeBound3239); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeBoundAccess().getRightSquareBracketKeyword_1_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeBound"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleStart_in_entryRuleStart75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStart85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentedRule_in_ruleStart131 = new BitSet(new long[]{0x000000000114E052L});
    public static final BitSet FOLLOW_ruleStart_in_ruleStart152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentedRule_in_entryRuleCommentedRule189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentedRule199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleCommentedRule241 = new BitSet(new long[]{0x000000000114E050L});
    public static final BitSet FOLLOW_rulePctl_in_ruleCommentedRule268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePctl_in_entryRulePctl304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePctl314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rulePctl361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSteadyState_in_rulePctl388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedProbability_in_rulePctl415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleState497 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleLabel602 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_ruleAtomic717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleAtomic744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleAtomic760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleNegation842 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleNegation864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJunction_in_entryRuleJunction899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJunction909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleJunction956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleJunction983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction1018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleConjunction1065 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleConjunction1087 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleConjunction1108 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleConjunction1129 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction1167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDisjunction1214 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleDisjunction1236 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleDisjunction1257 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleDisjunction1278 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_entryRuleStateFormula1316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateFormula1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleStateFormula1364 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleStateFormula1385 = new BitSet(new long[]{0x00000000800B0000L});
    public static final BitSet FOLLOW_ruleJunction_in_ruleStateFormula1407 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleStateFormula1434 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStateFormula1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleStateFormula1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_ruleStateFormula1504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbability_in_ruleStateFormula1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathFormula_in_entryRulePathFormula1566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathFormula1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNext_in_rulePathFormula1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUntil_in_rulePathFormula1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuture_in_rulePathFormula1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobally_in_rulePathFormula1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSteadyState_in_entryRuleSteadyState1739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSteadyState1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSteadyState1786 = new BitSet(new long[]{0x0000000500200000L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_ruleSteadyState1803 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21_in_ruleSteadyState1820 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSteadyState1833 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleSteadyState1855 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSteadyState1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedProbability_in_entryRuleQuantifiedProbability1902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifiedProbability1912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleQuantifiedProbability1950 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleQuantifiedProbability1962 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleQuantifiedProbability1975 = new BitSet(new long[]{0x000000007104E040L});
    public static final BitSet FOLLOW_rulePathFormula_in_ruleQuantifiedProbability1997 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleQuantifiedProbability2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbability_in_entryRuleProbability2044 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProbability2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleProbability2091 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_ruleProbability2107 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleProbability2118 = new BitSet(new long[]{0x000000007104E040L});
    public static final BitSet FOLLOW_rulePathFormula_in_ruleProbability2140 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleProbability2151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUntil_in_entryRuleUntil2187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUntil2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleUntil2243 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_25_in_ruleUntil2256 = new BitSet(new long[]{0x000000070144E040L});
    public static final BitSet FOLLOW_26_in_ruleUntil2274 = new BitSet(new long[]{0x000000070144E040L});
    public static final BitSet FOLLOW_27_in_ruleUntil2292 = new BitSet(new long[]{0x000000070144E040L});
    public static final BitSet FOLLOW_ruleTimeBound_in_ruleUntil2310 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleUntil2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNext_in_entryRuleNext2368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNext2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleNext2415 = new BitSet(new long[]{0x000000070144E040L});
    public static final BitSet FOLLOW_ruleTimeBound_in_ruleNext2432 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleNext2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuture_in_entryRuleFuture2490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuture2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFuture2537 = new BitSet(new long[]{0x000000070144E040L});
    public static final BitSet FOLLOW_ruleTimeBound_in_ruleFuture2554 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleFuture2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobally_in_entryRuleGlobally2612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobally2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleGlobally2659 = new BitSet(new long[]{0x000000070144E040L});
    public static final BitSet FOLLOW_ruleTimeBound_in_ruleGlobally2676 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleGlobally2698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication2734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleImplication2781 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleImplication2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_entryRuleCompareProbability2839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareProbability2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCompareProbability2890 = new BitSet(new long[]{0x0000000200000080L});
    public static final BitSet FOLLOW_33_in_ruleCompareProbability2904 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_34_in_ruleCompareProbability2927 = new BitSet(new long[]{0x0000000200000080L});
    public static final BitSet FOLLOW_33_in_ruleCompareProbability2941 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleCompareProbability2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_entryRuleTimeBound3006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeBound3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTimeBound3058 = new BitSet(new long[]{0x0000000200000080L});
    public static final BitSet FOLLOW_33_in_ruleTimeBound3072 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_34_in_ruleTimeBound3095 = new BitSet(new long[]{0x0000000200000080L});
    public static final BitSet FOLLOW_33_in_ruleTimeBound3109 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_33_in_ruleTimeBound3131 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleTimeBound3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTimeBound3173 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleTimeBound3188 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleTimeBound3206 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleTimeBound3221 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTimeBound3239 = new BitSet(new long[]{0x0000000000000002L});

}