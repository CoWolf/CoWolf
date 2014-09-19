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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_STRING", "RULE_BOOL", "RULE_COMPARATOR", "RULE_DOUBLE", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'S'", "'=?'", "'['", "']'", "'P'", "'('", "')'", "'!'", "'&'", "'|'", "'=>'", "'State:'", "'Label:'", "'U'", "'W'", "'R'", "'X'", "'F'", "'G'", "'='", "','"
    };
    public static final int RULE_ID=10;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_BOOL=6;
    public static final int RULE_SL_COMMENT=4;
    public static final int EOF=-1;
    public static final int RULE_DOUBLE=8;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_COMPARATOR=7;
    public static final int RULE_INT=9;
    public static final int RULE_WS=12;

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:76:1: ruleStart returns [EObject current=null] : ( (lv_rule_0_0= ruleFragment ) )* ;
    public final EObject ruleStart() throws RecognitionException {
        EObject current = null;

        EObject lv_rule_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:79:28: ( ( (lv_rule_0_0= ruleFragment ) )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:80:1: ( (lv_rule_0_0= ruleFragment ) )*
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:80:1: ( (lv_rule_0_0= ruleFragment ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_SL_COMMENT||LA1_0==RULE_BOOL||LA1_0==14||(LA1_0>=18 && LA1_0<=19)||LA1_0==21||(LA1_0>=25 && LA1_0<=26)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:81:1: (lv_rule_0_0= ruleFragment )
            	    {
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:81:1: (lv_rule_0_0= ruleFragment )
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:82:3: lv_rule_0_0= ruleFragment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStartAccess().getRuleFragmentParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFragment_in_ruleStart130);
            	    lv_rule_0_0=ruleFragment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStartRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rule",
            	            		lv_rule_0_0, 
            	            		"Fragment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleFragment"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:106:1: entryRuleFragment returns [EObject current=null] : iv_ruleFragment= ruleFragment EOF ;
    public final EObject entryRuleFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragment = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:107:2: (iv_ruleFragment= ruleFragment EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:108:2: iv_ruleFragment= ruleFragment EOF
            {
             newCompositeNode(grammarAccess.getFragmentRule()); 
            pushFollow(FOLLOW_ruleFragment_in_entryRuleFragment166);
            iv_ruleFragment=ruleFragment();

            state._fsp--;

             current =iv_ruleFragment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFragment176); 

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
    // $ANTLR end "entryRuleFragment"


    // $ANTLR start "ruleFragment"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:115:1: ruleFragment returns [EObject current=null] : (this_Comment_0= ruleComment | this_Rule_1= ruleRule ) ;
    public final EObject ruleFragment() throws RecognitionException {
        EObject current = null;

        EObject this_Comment_0 = null;

        EObject this_Rule_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:118:28: ( (this_Comment_0= ruleComment | this_Rule_1= ruleRule ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:119:1: (this_Comment_0= ruleComment | this_Rule_1= ruleRule )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:119:1: (this_Comment_0= ruleComment | this_Rule_1= ruleRule )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_SL_COMMENT) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_BOOL||LA2_0==14||(LA2_0>=18 && LA2_0<=19)||LA2_0==21||(LA2_0>=25 && LA2_0<=26)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:120:5: this_Comment_0= ruleComment
                    {
                     
                            newCompositeNode(grammarAccess.getFragmentAccess().getCommentParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleComment_in_ruleFragment223);
                    this_Comment_0=ruleComment();

                    state._fsp--;

                     
                            current = this_Comment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:130:5: this_Rule_1= ruleRule
                    {
                     
                            newCompositeNode(grammarAccess.getFragmentAccess().getRuleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRule_in_ruleFragment250);
                    this_Rule_1=ruleRule();

                    state._fsp--;

                     
                            current = this_Rule_1; 
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
    // $ANTLR end "ruleFragment"


    // $ANTLR start "entryRuleComment"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:146:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:147:2: (iv_ruleComment= ruleComment EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:148:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment285);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment295); 

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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:155:1: ruleComment returns [EObject current=null] : ( (lv_comment_0_0= RULE_SL_COMMENT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:158:28: ( ( (lv_comment_0_0= RULE_SL_COMMENT ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:159:1: ( (lv_comment_0_0= RULE_SL_COMMENT ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:159:1: ( (lv_comment_0_0= RULE_SL_COMMENT ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:160:1: (lv_comment_0_0= RULE_SL_COMMENT )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:160:1: (lv_comment_0_0= RULE_SL_COMMENT )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:161:3: lv_comment_0_0= RULE_SL_COMMENT
            {
            lv_comment_0_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleComment336); 

            			newLeafNode(lv_comment_0_0, grammarAccess.getCommentAccess().getCommentSL_COMMENTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"comment",
                    		lv_comment_0_0, 
                    		"SL_COMMENT");
            	    

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleRule"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:185:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:189:2: (iv_ruleRule= ruleRule EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:190:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule382);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule392); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:200:1: ruleRule returns [EObject current=null] : (this_BooleanRule_0= ruleBooleanRule | this_SteadyState_1= ruleSteadyState | this_QuantifiedProbability_2= ruleQuantifiedProbability ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanRule_0 = null;

        EObject this_SteadyState_1 = null;

        EObject this_QuantifiedProbability_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:204:28: ( (this_BooleanRule_0= ruleBooleanRule | this_SteadyState_1= ruleSteadyState | this_QuantifiedProbability_2= ruleQuantifiedProbability ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:205:1: (this_BooleanRule_0= ruleBooleanRule | this_SteadyState_1= ruleSteadyState | this_QuantifiedProbability_2= ruleQuantifiedProbability )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:205:1: (this_BooleanRule_0= ruleBooleanRule | this_SteadyState_1= ruleSteadyState | this_QuantifiedProbability_2= ruleQuantifiedProbability )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:206:5: this_BooleanRule_0= ruleBooleanRule
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getBooleanRuleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBooleanRule_in_ruleRule443);
                    this_BooleanRule_0=ruleBooleanRule();

                    state._fsp--;

                     
                            current = this_BooleanRule_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:216:5: this_SteadyState_1= ruleSteadyState
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getSteadyStateParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSteadyState_in_ruleRule470);
                    this_SteadyState_1=ruleSteadyState();

                    state._fsp--;

                     
                            current = this_SteadyState_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:226:5: this_QuantifiedProbability_2= ruleQuantifiedProbability
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getQuantifiedProbabilityParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleQuantifiedProbability_in_ruleRule497);
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleSteadyState"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:245:1: entryRuleSteadyState returns [EObject current=null] : iv_ruleSteadyState= ruleSteadyState EOF ;
    public final EObject entryRuleSteadyState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSteadyState = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:246:2: (iv_ruleSteadyState= ruleSteadyState EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:247:2: iv_ruleSteadyState= ruleSteadyState EOF
            {
             newCompositeNode(grammarAccess.getSteadyStateRule()); 
            pushFollow(FOLLOW_ruleSteadyState_in_entryRuleSteadyState536);
            iv_ruleSteadyState=ruleSteadyState();

            state._fsp--;

             current =iv_ruleSteadyState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSteadyState546); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:254:1: ruleSteadyState returns [EObject current=null] : (otherlv_0= 'S' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( ( (lv_bound_2_0= ruleCompareProbability ) ) | otherlv_3= '=?' ) (this_SL_COMMENT_4= RULE_SL_COMMENT )* otherlv_5= '[' (this_SL_COMMENT_6= RULE_SL_COMMENT )* ( (lv_value_7_0= ruleStateFormula ) ) (this_SL_COMMENT_8= RULE_SL_COMMENT )* otherlv_9= ']' ) ;
    public final EObject ruleSteadyState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SL_COMMENT_1=null;
        Token otherlv_3=null;
        Token this_SL_COMMENT_4=null;
        Token otherlv_5=null;
        Token this_SL_COMMENT_6=null;
        Token this_SL_COMMENT_8=null;
        Token otherlv_9=null;
        EObject lv_bound_2_0 = null;

        EObject lv_value_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:257:28: ( (otherlv_0= 'S' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( ( (lv_bound_2_0= ruleCompareProbability ) ) | otherlv_3= '=?' ) (this_SL_COMMENT_4= RULE_SL_COMMENT )* otherlv_5= '[' (this_SL_COMMENT_6= RULE_SL_COMMENT )* ( (lv_value_7_0= ruleStateFormula ) ) (this_SL_COMMENT_8= RULE_SL_COMMENT )* otherlv_9= ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:258:1: (otherlv_0= 'S' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( ( (lv_bound_2_0= ruleCompareProbability ) ) | otherlv_3= '=?' ) (this_SL_COMMENT_4= RULE_SL_COMMENT )* otherlv_5= '[' (this_SL_COMMENT_6= RULE_SL_COMMENT )* ( (lv_value_7_0= ruleStateFormula ) ) (this_SL_COMMENT_8= RULE_SL_COMMENT )* otherlv_9= ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:258:1: (otherlv_0= 'S' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( ( (lv_bound_2_0= ruleCompareProbability ) ) | otherlv_3= '=?' ) (this_SL_COMMENT_4= RULE_SL_COMMENT )* otherlv_5= '[' (this_SL_COMMENT_6= RULE_SL_COMMENT )* ( (lv_value_7_0= ruleStateFormula ) ) (this_SL_COMMENT_8= RULE_SL_COMMENT )* otherlv_9= ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:258:3: otherlv_0= 'S' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( ( (lv_bound_2_0= ruleCompareProbability ) ) | otherlv_3= '=?' ) (this_SL_COMMENT_4= RULE_SL_COMMENT )* otherlv_5= '[' (this_SL_COMMENT_6= RULE_SL_COMMENT )* ( (lv_value_7_0= ruleStateFormula ) ) (this_SL_COMMENT_8= RULE_SL_COMMENT )* otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleSteadyState583); 

                	newLeafNode(otherlv_0, grammarAccess.getSteadyStateAccess().getSKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:262:1: (this_SL_COMMENT_1= RULE_SL_COMMENT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_SL_COMMENT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:262:2: this_SL_COMMENT_1= RULE_SL_COMMENT
            	    {
            	    this_SL_COMMENT_1=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleSteadyState595); 
            	     
            	        newLeafNode(this_SL_COMMENT_1, grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:266:3: ( ( (lv_bound_2_0= ruleCompareProbability ) ) | otherlv_3= '=?' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_COMPARATOR) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:266:4: ( (lv_bound_2_0= ruleCompareProbability ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:266:4: ( (lv_bound_2_0= ruleCompareProbability ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:267:1: (lv_bound_2_0= ruleCompareProbability )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:267:1: (lv_bound_2_0= ruleCompareProbability )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:268:3: lv_bound_2_0= ruleCompareProbability
                    {
                     
                    	        newCompositeNode(grammarAccess.getSteadyStateAccess().getBoundCompareProbabilityParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCompareProbability_in_ruleSteadyState618);
                    lv_bound_2_0=ruleCompareProbability();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSteadyStateRule());
                    	        }
                           		set(
                           			current, 
                           			"bound",
                            		lv_bound_2_0, 
                            		"CompareProbability");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:285:7: otherlv_3= '=?'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSteadyState636); 

                        	newLeafNode(otherlv_3, grammarAccess.getSteadyStateAccess().getEqualsSignQuestionMarkKeyword_2_1());
                        

                    }
                    break;

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:289:2: (this_SL_COMMENT_4= RULE_SL_COMMENT )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_SL_COMMENT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:289:3: this_SL_COMMENT_4= RULE_SL_COMMENT
            	    {
            	    this_SL_COMMENT_4=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleSteadyState649); 
            	     
            	        newLeafNode(this_SL_COMMENT_4, grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_3()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleSteadyState662); 

                	newLeafNode(otherlv_5, grammarAccess.getSteadyStateAccess().getLeftSquareBracketKeyword_4());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:297:1: (this_SL_COMMENT_6= RULE_SL_COMMENT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_SL_COMMENT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:297:2: this_SL_COMMENT_6= RULE_SL_COMMENT
            	    {
            	    this_SL_COMMENT_6=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleSteadyState674); 
            	     
            	        newLeafNode(this_SL_COMMENT_6, grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_5()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:301:3: ( (lv_value_7_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:302:1: (lv_value_7_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:302:1: (lv_value_7_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:303:3: lv_value_7_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getSteadyStateAccess().getValueStateFormulaParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleSteadyState696);
            lv_value_7_0=ruleStateFormula();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSteadyStateRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_7_0, 
                    		"StateFormula");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:319:2: (this_SL_COMMENT_8= RULE_SL_COMMENT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_SL_COMMENT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:319:3: this_SL_COMMENT_8= RULE_SL_COMMENT
            	    {
            	    this_SL_COMMENT_8=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleSteadyState708); 
            	     
            	        newLeafNode(this_SL_COMMENT_8, grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_7()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleSteadyState721); 

                	newLeafNode(otherlv_9, grammarAccess.getSteadyStateAccess().getRightSquareBracketKeyword_8());
                

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:335:1: entryRuleQuantifiedProbability returns [EObject current=null] : iv_ruleQuantifiedProbability= ruleQuantifiedProbability EOF ;
    public final EObject entryRuleQuantifiedProbability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifiedProbability = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:336:2: (iv_ruleQuantifiedProbability= ruleQuantifiedProbability EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:337:2: iv_ruleQuantifiedProbability= ruleQuantifiedProbability EOF
            {
             newCompositeNode(grammarAccess.getQuantifiedProbabilityRule()); 
            pushFollow(FOLLOW_ruleQuantifiedProbability_in_entryRuleQuantifiedProbability757);
            iv_ruleQuantifiedProbability=ruleQuantifiedProbability();

            state._fsp--;

             current =iv_ruleQuantifiedProbability; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifiedProbability767); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:344:1: ruleQuantifiedProbability returns [EObject current=null] : (otherlv_0= 'P' (this_SL_COMMENT_1= RULE_SL_COMMENT )* otherlv_2= '=?' (this_SL_COMMENT_3= RULE_SL_COMMENT )* otherlv_4= '[' ( (lv_value_5_0= rulePathFormula ) ) otherlv_6= ']' ) ;
    public final EObject ruleQuantifiedProbability() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SL_COMMENT_1=null;
        Token otherlv_2=null;
        Token this_SL_COMMENT_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:347:28: ( (otherlv_0= 'P' (this_SL_COMMENT_1= RULE_SL_COMMENT )* otherlv_2= '=?' (this_SL_COMMENT_3= RULE_SL_COMMENT )* otherlv_4= '[' ( (lv_value_5_0= rulePathFormula ) ) otherlv_6= ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:348:1: (otherlv_0= 'P' (this_SL_COMMENT_1= RULE_SL_COMMENT )* otherlv_2= '=?' (this_SL_COMMENT_3= RULE_SL_COMMENT )* otherlv_4= '[' ( (lv_value_5_0= rulePathFormula ) ) otherlv_6= ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:348:1: (otherlv_0= 'P' (this_SL_COMMENT_1= RULE_SL_COMMENT )* otherlv_2= '=?' (this_SL_COMMENT_3= RULE_SL_COMMENT )* otherlv_4= '[' ( (lv_value_5_0= rulePathFormula ) ) otherlv_6= ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:348:3: otherlv_0= 'P' (this_SL_COMMENT_1= RULE_SL_COMMENT )* otherlv_2= '=?' (this_SL_COMMENT_3= RULE_SL_COMMENT )* otherlv_4= '[' ( (lv_value_5_0= rulePathFormula ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleQuantifiedProbability804); 

                	newLeafNode(otherlv_0, grammarAccess.getQuantifiedProbabilityAccess().getPKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:352:1: (this_SL_COMMENT_1= RULE_SL_COMMENT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_SL_COMMENT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:352:2: this_SL_COMMENT_1= RULE_SL_COMMENT
            	    {
            	    this_SL_COMMENT_1=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleQuantifiedProbability816); 
            	     
            	        newLeafNode(this_SL_COMMENT_1, grammarAccess.getQuantifiedProbabilityAccess().getSL_COMMENTTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleQuantifiedProbability829); 

                	newLeafNode(otherlv_2, grammarAccess.getQuantifiedProbabilityAccess().getEqualsSignQuestionMarkKeyword_2());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:360:1: (this_SL_COMMENT_3= RULE_SL_COMMENT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_SL_COMMENT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:360:2: this_SL_COMMENT_3= RULE_SL_COMMENT
            	    {
            	    this_SL_COMMENT_3=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleQuantifiedProbability841); 
            	     
            	        newLeafNode(this_SL_COMMENT_3, grammarAccess.getQuantifiedProbabilityAccess().getSL_COMMENTTerminalRuleCall_3()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleQuantifiedProbability854); 

                	newLeafNode(otherlv_4, grammarAccess.getQuantifiedProbabilityAccess().getLeftSquareBracketKeyword_4());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:368:1: ( (lv_value_5_0= rulePathFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:369:1: (lv_value_5_0= rulePathFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:369:1: (lv_value_5_0= rulePathFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:370:3: lv_value_5_0= rulePathFormula
            {
             
            	        newCompositeNode(grammarAccess.getQuantifiedProbabilityAccess().getValuePathFormulaParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_rulePathFormula_in_ruleQuantifiedProbability875);
            lv_value_5_0=rulePathFormula();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQuantifiedProbabilityRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"PathFormula");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleQuantifiedProbability887); 

                	newLeafNode(otherlv_6, grammarAccess.getQuantifiedProbabilityAccess().getRightSquareBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleBooleanRule"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:398:1: entryRuleBooleanRule returns [EObject current=null] : iv_ruleBooleanRule= ruleBooleanRule EOF ;
    public final EObject entryRuleBooleanRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanRule = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:399:2: (iv_ruleBooleanRule= ruleBooleanRule EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:400:2: iv_ruleBooleanRule= ruleBooleanRule EOF
            {
             newCompositeNode(grammarAccess.getBooleanRuleRule()); 
            pushFollow(FOLLOW_ruleBooleanRule_in_entryRuleBooleanRule923);
            iv_ruleBooleanRule=ruleBooleanRule();

            state._fsp--;

             current =iv_ruleBooleanRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanRule933); 

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
    // $ANTLR end "entryRuleBooleanRule"


    // $ANTLR start "ruleBooleanRule"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:407:1: ruleBooleanRule returns [EObject current=null] : ( (lv_value_0_0= ruleStateFormula ) ) ;
    public final EObject ruleBooleanRule() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:410:28: ( ( (lv_value_0_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:411:1: ( (lv_value_0_0= ruleStateFormula ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:411:1: ( (lv_value_0_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:412:1: (lv_value_0_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:412:1: (lv_value_0_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:413:3: lv_value_0_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getBooleanRuleAccess().getValueStateFormulaParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleBooleanRule978);
            lv_value_0_0=ruleStateFormula();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBooleanRuleRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"StateFormula");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleBooleanRule"


    // $ANTLR start "entryRuleStateFormula"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:437:1: entryRuleStateFormula returns [EObject current=null] : iv_ruleStateFormula= ruleStateFormula EOF ;
    public final EObject entryRuleStateFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateFormula = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:438:2: (iv_ruleStateFormula= ruleStateFormula EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:439:2: iv_ruleStateFormula= ruleStateFormula EOF
            {
             newCompositeNode(grammarAccess.getStateFormulaRule()); 
            pushFollow(FOLLOW_ruleStateFormula_in_entryRuleStateFormula1013);
            iv_ruleStateFormula=ruleStateFormula();

            state._fsp--;

             current =iv_ruleStateFormula; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateFormula1023); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:446:1: ruleStateFormula returns [EObject current=null] : ( (otherlv_0= '(' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( (lv_left_2_0= ruleStateFormula ) ) ( ( (lv_right_3_0= ruleJunction ) ) | ( (lv_right_4_0= ruleImplication ) ) )? (this_SL_COMMENT_5= RULE_SL_COMMENT )* otherlv_6= ')' ) | ( ( (lv_left_7_1= ruleNegation | lv_left_7_2= ruleAtomic | lv_left_7_3= ruleProbability ) ) ) ) ;
    public final EObject ruleStateFormula() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SL_COMMENT_1=null;
        Token this_SL_COMMENT_5=null;
        Token otherlv_6=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_4_0 = null;

        EObject lv_left_7_1 = null;

        EObject lv_left_7_2 = null;

        EObject lv_left_7_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:449:28: ( ( (otherlv_0= '(' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( (lv_left_2_0= ruleStateFormula ) ) ( ( (lv_right_3_0= ruleJunction ) ) | ( (lv_right_4_0= ruleImplication ) ) )? (this_SL_COMMENT_5= RULE_SL_COMMENT )* otherlv_6= ')' ) | ( ( (lv_left_7_1= ruleNegation | lv_left_7_2= ruleAtomic | lv_left_7_3= ruleProbability ) ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:450:1: ( (otherlv_0= '(' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( (lv_left_2_0= ruleStateFormula ) ) ( ( (lv_right_3_0= ruleJunction ) ) | ( (lv_right_4_0= ruleImplication ) ) )? (this_SL_COMMENT_5= RULE_SL_COMMENT )* otherlv_6= ')' ) | ( ( (lv_left_7_1= ruleNegation | lv_left_7_2= ruleAtomic | lv_left_7_3= ruleProbability ) ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:450:1: ( (otherlv_0= '(' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( (lv_left_2_0= ruleStateFormula ) ) ( ( (lv_right_3_0= ruleJunction ) ) | ( (lv_right_4_0= ruleImplication ) ) )? (this_SL_COMMENT_5= RULE_SL_COMMENT )* otherlv_6= ')' ) | ( ( (lv_left_7_1= ruleNegation | lv_left_7_2= ruleAtomic | lv_left_7_3= ruleProbability ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_BOOL||LA15_0==18||LA15_0==21||(LA15_0>=25 && LA15_0<=26)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:450:2: (otherlv_0= '(' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( (lv_left_2_0= ruleStateFormula ) ) ( ( (lv_right_3_0= ruleJunction ) ) | ( (lv_right_4_0= ruleImplication ) ) )? (this_SL_COMMENT_5= RULE_SL_COMMENT )* otherlv_6= ')' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:450:2: (otherlv_0= '(' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( (lv_left_2_0= ruleStateFormula ) ) ( ( (lv_right_3_0= ruleJunction ) ) | ( (lv_right_4_0= ruleImplication ) ) )? (this_SL_COMMENT_5= RULE_SL_COMMENT )* otherlv_6= ')' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:450:4: otherlv_0= '(' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( (lv_left_2_0= ruleStateFormula ) ) ( ( (lv_right_3_0= ruleJunction ) ) | ( (lv_right_4_0= ruleImplication ) ) )? (this_SL_COMMENT_5= RULE_SL_COMMENT )* otherlv_6= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleStateFormula1061); 

                        	newLeafNode(otherlv_0, grammarAccess.getStateFormulaAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:454:1: (this_SL_COMMENT_1= RULE_SL_COMMENT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_SL_COMMENT) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:454:2: this_SL_COMMENT_1= RULE_SL_COMMENT
                    	    {
                    	    this_SL_COMMENT_1=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleStateFormula1073); 
                    	     
                    	        newLeafNode(this_SL_COMMENT_1, grammarAccess.getStateFormulaAccess().getSL_COMMENTTerminalRuleCall_0_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:458:3: ( (lv_left_2_0= ruleStateFormula ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:459:1: (lv_left_2_0= ruleStateFormula )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:459:1: (lv_left_2_0= ruleStateFormula )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:460:3: lv_left_2_0= ruleStateFormula
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFormulaAccess().getLeftStateFormulaParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStateFormula_in_ruleStateFormula1095);
                    lv_left_2_0=ruleStateFormula();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateFormulaRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_2_0, 
                            		"StateFormula");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:476:2: ( ( (lv_right_3_0= ruleJunction ) ) | ( (lv_right_4_0= ruleImplication ) ) )?
                    int alt12=3;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=22 && LA12_0<=23)) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==24) ) {
                        alt12=2;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:476:3: ( (lv_right_3_0= ruleJunction ) )
                            {
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:476:3: ( (lv_right_3_0= ruleJunction ) )
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:477:1: (lv_right_3_0= ruleJunction )
                            {
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:477:1: (lv_right_3_0= ruleJunction )
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:478:3: lv_right_3_0= ruleJunction
                            {
                             
                            	        newCompositeNode(grammarAccess.getStateFormulaAccess().getRightJunctionParserRuleCall_0_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleJunction_in_ruleStateFormula1117);
                            lv_right_3_0=ruleJunction();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getStateFormulaRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"right",
                                    		lv_right_3_0, 
                                    		"Junction");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:495:6: ( (lv_right_4_0= ruleImplication ) )
                            {
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:495:6: ( (lv_right_4_0= ruleImplication ) )
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:496:1: (lv_right_4_0= ruleImplication )
                            {
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:496:1: (lv_right_4_0= ruleImplication )
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:497:3: lv_right_4_0= ruleImplication
                            {
                             
                            	        newCompositeNode(grammarAccess.getStateFormulaAccess().getRightImplicationParserRuleCall_0_3_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleImplication_in_ruleStateFormula1144);
                            lv_right_4_0=ruleImplication();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getStateFormulaRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"right",
                                    		lv_right_4_0, 
                                    		"Implication");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:513:4: (this_SL_COMMENT_5= RULE_SL_COMMENT )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_SL_COMMENT) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:513:5: this_SL_COMMENT_5= RULE_SL_COMMENT
                    	    {
                    	    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleStateFormula1158); 
                    	     
                    	        newLeafNode(this_SL_COMMENT_5, grammarAccess.getStateFormulaAccess().getSL_COMMENTTerminalRuleCall_0_4()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleStateFormula1171); 

                        	newLeafNode(otherlv_6, grammarAccess.getStateFormulaAccess().getRightParenthesisKeyword_0_5());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:522:6: ( ( (lv_left_7_1= ruleNegation | lv_left_7_2= ruleAtomic | lv_left_7_3= ruleProbability ) ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:522:6: ( ( (lv_left_7_1= ruleNegation | lv_left_7_2= ruleAtomic | lv_left_7_3= ruleProbability ) ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:523:1: ( (lv_left_7_1= ruleNegation | lv_left_7_2= ruleAtomic | lv_left_7_3= ruleProbability ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:523:1: ( (lv_left_7_1= ruleNegation | lv_left_7_2= ruleAtomic | lv_left_7_3= ruleProbability ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:524:1: (lv_left_7_1= ruleNegation | lv_left_7_2= ruleAtomic | lv_left_7_3= ruleProbability )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:524:1: (lv_left_7_1= ruleNegation | lv_left_7_2= ruleAtomic | lv_left_7_3= ruleProbability )
                    int alt14=3;
                    switch ( input.LA(1) ) {
                    case 21:
                        {
                        alt14=1;
                        }
                        break;
                    case RULE_BOOL:
                    case 25:
                    case 26:
                        {
                        alt14=2;
                        }
                        break;
                    case 18:
                        {
                        alt14=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }

                    switch (alt14) {
                        case 1 :
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:525:3: lv_left_7_1= ruleNegation
                            {
                             
                            	        newCompositeNode(grammarAccess.getStateFormulaAccess().getLeftNegationParserRuleCall_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNegation_in_ruleStateFormula1201);
                            lv_left_7_1=ruleNegation();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getStateFormulaRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"left",
                                    		lv_left_7_1, 
                                    		"Negation");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;
                        case 2 :
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:540:8: lv_left_7_2= ruleAtomic
                            {
                             
                            	        newCompositeNode(grammarAccess.getStateFormulaAccess().getLeftAtomicParserRuleCall_1_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleAtomic_in_ruleStateFormula1220);
                            lv_left_7_2=ruleAtomic();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getStateFormulaRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"left",
                                    		lv_left_7_2, 
                                    		"Atomic");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;
                        case 3 :
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:555:8: lv_left_7_3= ruleProbability
                            {
                             
                            	        newCompositeNode(grammarAccess.getStateFormulaAccess().getLeftProbabilityParserRuleCall_1_0_2()); 
                            	    
                            pushFollow(FOLLOW_ruleProbability_in_ruleStateFormula1239);
                            lv_left_7_3=ruleProbability();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getStateFormulaRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"left",
                                    		lv_left_7_3, 
                                    		"Probability");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;

                    }


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


    // $ANTLR start "entryRuleNegation"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:581:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:582:2: (iv_ruleNegation= ruleNegation EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:583:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation1278);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation1288); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:590:1: ruleNegation returns [EObject current=null] : (otherlv_0= '!' this_StateFormula_1= ruleStateFormula ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_StateFormula_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:593:28: ( (otherlv_0= '!' this_StateFormula_1= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:594:1: (otherlv_0= '!' this_StateFormula_1= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:594:1: (otherlv_0= '!' this_StateFormula_1= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:594:3: otherlv_0= '!' this_StateFormula_1= ruleStateFormula
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleNegation1325); 

                	newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getExclamationMarkKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getNegationAccess().getStateFormulaParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleStateFormula_in_ruleNegation1347);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:615:1: entryRuleJunction returns [EObject current=null] : iv_ruleJunction= ruleJunction EOF ;
    public final EObject entryRuleJunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJunction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
        	
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:619:2: (iv_ruleJunction= ruleJunction EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:620:2: iv_ruleJunction= ruleJunction EOF
            {
             newCompositeNode(grammarAccess.getJunctionRule()); 
            pushFollow(FOLLOW_ruleJunction_in_entryRuleJunction1388);
            iv_ruleJunction=ruleJunction();

            state._fsp--;

             current =iv_ruleJunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJunction1398); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleJunction"


    // $ANTLR start "ruleJunction"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:630:1: ruleJunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction | this_Disjunction_1= ruleDisjunction ) ;
    public final EObject ruleJunction() throws RecognitionException {
        EObject current = null;

        EObject this_Conjunction_0 = null;

        EObject this_Disjunction_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:634:28: ( (this_Conjunction_0= ruleConjunction | this_Disjunction_1= ruleDisjunction ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:635:1: (this_Conjunction_0= ruleConjunction | this_Disjunction_1= ruleDisjunction )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:635:1: (this_Conjunction_0= ruleConjunction | this_Disjunction_1= ruleDisjunction )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            else if ( (LA16_0==23) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:636:5: this_Conjunction_0= ruleConjunction
                    {
                     
                            newCompositeNode(grammarAccess.getJunctionAccess().getConjunctionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConjunction_in_ruleJunction1449);
                    this_Conjunction_0=ruleConjunction();

                    state._fsp--;

                     
                            current = this_Conjunction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:646:5: this_Disjunction_1= ruleDisjunction
                    {
                     
                            newCompositeNode(grammarAccess.getJunctionAccess().getDisjunctionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDisjunction_in_ruleJunction1476);
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleJunction"


    // $ANTLR start "entryRuleConjunction"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:665:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:666:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:667:2: iv_ruleConjunction= ruleConjunction EOF
            {
             newCompositeNode(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction1515);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;

             current =iv_ruleConjunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction1525); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:674:1: ruleConjunction returns [EObject current=null] : (otherlv_0= '&' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_StateFormula_1 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:677:28: ( (otherlv_0= '&' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:678:1: (otherlv_0= '&' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:678:1: (otherlv_0= '&' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:678:3: otherlv_0= '&' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleConjunction1562); 

                	newLeafNode(otherlv_0, grammarAccess.getConjunctionAccess().getAmpersandKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getConjunctionAccess().getStateFormulaParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleStateFormula_in_ruleConjunction1584);
            this_StateFormula_1=ruleStateFormula();

            state._fsp--;

             
                    current = this_StateFormula_1; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:691:1: ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:691:2: () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) )
            	    {
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:691:2: ()
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:692:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getConjunctionAccess().getConjunctionLeftAction_2_0(),
            	                current);
            	        

            	    }

            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleConjunction1605); 

            	        	newLeafNode(otherlv_3, grammarAccess.getConjunctionAccess().getAmpersandKeyword_2_1());
            	        
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:701:1: ( (lv_right_4_0= ruleStateFormula ) )
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:702:1: (lv_right_4_0= ruleStateFormula )
            	    {
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:702:1: (lv_right_4_0= ruleStateFormula )
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:703:3: lv_right_4_0= ruleStateFormula
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStateFormula_in_ruleConjunction1626);
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
            	    break loop17;
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:727:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:728:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:729:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
             newCompositeNode(grammarAccess.getDisjunctionRule()); 
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction1664);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;

             current =iv_ruleDisjunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction1674); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:736:1: ruleDisjunction returns [EObject current=null] : (otherlv_0= '|' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )* ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_StateFormula_1 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:739:28: ( (otherlv_0= '|' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:740:1: (otherlv_0= '|' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:740:1: (otherlv_0= '|' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:740:3: otherlv_0= '|' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleDisjunction1711); 

                	newLeafNode(otherlv_0, grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getDisjunctionAccess().getStateFormulaParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleStateFormula_in_ruleDisjunction1733);
            this_StateFormula_1=ruleStateFormula();

            state._fsp--;

             
                    current = this_StateFormula_1; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:753:1: ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:753:2: () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) )
            	    {
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:753:2: ()
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:754:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_2_0(),
            	                current);
            	        

            	    }

            	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleDisjunction1754); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_2_1());
            	        
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:763:1: ( (lv_right_4_0= ruleStateFormula ) )
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:764:1: (lv_right_4_0= ruleStateFormula )
            	    {
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:764:1: (lv_right_4_0= ruleStateFormula )
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:765:3: lv_right_4_0= ruleStateFormula
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStateFormula_in_ruleDisjunction1775);
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
            	    break loop18;
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


    // $ANTLR start "entryRuleImplication"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:789:1: entryRuleImplication returns [EObject current=null] : iv_ruleImplication= ruleImplication EOF ;
    public final EObject entryRuleImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplication = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
        	
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:793:2: (iv_ruleImplication= ruleImplication EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:794:2: iv_ruleImplication= ruleImplication EOF
            {
             newCompositeNode(grammarAccess.getImplicationRule()); 
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication1819);
            iv_ruleImplication=ruleImplication();

            state._fsp--;

             current =iv_ruleImplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication1829); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleImplication"


    // $ANTLR start "ruleImplication"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:804:1: ruleImplication returns [EObject current=null] : (otherlv_0= '=>' ( (lv_right_1_0= ruleStateFormula ) ) ) ;
    public final EObject ruleImplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:808:28: ( (otherlv_0= '=>' ( (lv_right_1_0= ruleStateFormula ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:809:1: (otherlv_0= '=>' ( (lv_right_1_0= ruleStateFormula ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:809:1: (otherlv_0= '=>' ( (lv_right_1_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:809:3: otherlv_0= '=>' ( (lv_right_1_0= ruleStateFormula ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleImplication1870); 

                	newLeafNode(otherlv_0, grammarAccess.getImplicationAccess().getEqualsSignGreaterThanSignKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:813:1: ( (lv_right_1_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:814:1: (lv_right_1_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:814:1: (lv_right_1_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:815:3: lv_right_1_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getImplicationAccess().getRightStateFormulaParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleImplication1891);
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleImplication"


    // $ANTLR start "entryRuleProbability"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:842:1: entryRuleProbability returns [EObject current=null] : iv_ruleProbability= ruleProbability EOF ;
    public final EObject entryRuleProbability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbability = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:843:2: (iv_ruleProbability= ruleProbability EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:844:2: iv_ruleProbability= ruleProbability EOF
            {
             newCompositeNode(grammarAccess.getProbabilityRule()); 
            pushFollow(FOLLOW_ruleProbability_in_entryRuleProbability1931);
            iv_ruleProbability=ruleProbability();

            state._fsp--;

             current =iv_ruleProbability; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProbability1941); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:851:1: ruleProbability returns [EObject current=null] : (otherlv_0= 'P' (this_SL_COMMENT_1= RULE_SL_COMMENT )* () ( (lv_comparator_3_0= ruleCompareProbability ) ) (this_SL_COMMENT_4= RULE_SL_COMMENT )* otherlv_5= '[' ( (lv_path_6_0= rulePathFormula ) ) otherlv_7= ']' ) ;
    public final EObject ruleProbability() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_SL_COMMENT_1=null;
        Token this_SL_COMMENT_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_comparator_3_0 = null;

        EObject lv_path_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:854:28: ( (otherlv_0= 'P' (this_SL_COMMENT_1= RULE_SL_COMMENT )* () ( (lv_comparator_3_0= ruleCompareProbability ) ) (this_SL_COMMENT_4= RULE_SL_COMMENT )* otherlv_5= '[' ( (lv_path_6_0= rulePathFormula ) ) otherlv_7= ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:855:1: (otherlv_0= 'P' (this_SL_COMMENT_1= RULE_SL_COMMENT )* () ( (lv_comparator_3_0= ruleCompareProbability ) ) (this_SL_COMMENT_4= RULE_SL_COMMENT )* otherlv_5= '[' ( (lv_path_6_0= rulePathFormula ) ) otherlv_7= ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:855:1: (otherlv_0= 'P' (this_SL_COMMENT_1= RULE_SL_COMMENT )* () ( (lv_comparator_3_0= ruleCompareProbability ) ) (this_SL_COMMENT_4= RULE_SL_COMMENT )* otherlv_5= '[' ( (lv_path_6_0= rulePathFormula ) ) otherlv_7= ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:855:3: otherlv_0= 'P' (this_SL_COMMENT_1= RULE_SL_COMMENT )* () ( (lv_comparator_3_0= ruleCompareProbability ) ) (this_SL_COMMENT_4= RULE_SL_COMMENT )* otherlv_5= '[' ( (lv_path_6_0= rulePathFormula ) ) otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleProbability1978); 

                	newLeafNode(otherlv_0, grammarAccess.getProbabilityAccess().getPKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:859:1: (this_SL_COMMENT_1= RULE_SL_COMMENT )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_SL_COMMENT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:859:2: this_SL_COMMENT_1= RULE_SL_COMMENT
            	    {
            	    this_SL_COMMENT_1=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleProbability1990); 
            	     
            	        newLeafNode(this_SL_COMMENT_1, grammarAccess.getProbabilityAccess().getSL_COMMENTTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:863:3: ()
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:864:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProbabilityAccess().getProbabilityAction_2(),
                        current);
                

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:869:2: ( (lv_comparator_3_0= ruleCompareProbability ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:870:1: (lv_comparator_3_0= ruleCompareProbability )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:870:1: (lv_comparator_3_0= ruleCompareProbability )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:871:3: lv_comparator_3_0= ruleCompareProbability
            {
             
            	        newCompositeNode(grammarAccess.getProbabilityAccess().getComparatorCompareProbabilityParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleCompareProbability_in_ruleProbability2021);
            lv_comparator_3_0=ruleCompareProbability();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProbabilityRule());
            	        }
                   		set(
                   			current, 
                   			"comparator",
                    		lv_comparator_3_0, 
                    		"CompareProbability");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:887:2: (this_SL_COMMENT_4= RULE_SL_COMMENT )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_SL_COMMENT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:887:3: this_SL_COMMENT_4= RULE_SL_COMMENT
            	    {
            	    this_SL_COMMENT_4=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleProbability2033); 
            	     
            	        newLeafNode(this_SL_COMMENT_4, grammarAccess.getProbabilityAccess().getSL_COMMENTTerminalRuleCall_4()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleProbability2046); 

                	newLeafNode(otherlv_5, grammarAccess.getProbabilityAccess().getLeftSquareBracketKeyword_5());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:895:1: ( (lv_path_6_0= rulePathFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:896:1: (lv_path_6_0= rulePathFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:896:1: (lv_path_6_0= rulePathFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:897:3: lv_path_6_0= rulePathFormula
            {
             
            	        newCompositeNode(grammarAccess.getProbabilityAccess().getPathPathFormulaParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_rulePathFormula_in_ruleProbability2067);
            lv_path_6_0=rulePathFormula();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProbabilityRule());
            	        }
                   		set(
                   			current, 
                   			"path",
                    		lv_path_6_0, 
                    		"PathFormula");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleProbability2079); 

                	newLeafNode(otherlv_7, grammarAccess.getProbabilityAccess().getRightSquareBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleAtomic"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:925:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:926:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:927:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic2115);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic2125); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:934:1: ruleAtomic returns [EObject current=null] : (this_State_0= ruleState | this_Label_1= ruleLabel | this_Boolean_2= ruleBoolean ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        EObject this_State_0 = null;

        EObject this_Label_1 = null;

        EObject this_Boolean_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:937:28: ( (this_State_0= ruleState | this_Label_1= ruleLabel | this_Boolean_2= ruleBoolean ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:938:1: (this_State_0= ruleState | this_Label_1= ruleLabel | this_Boolean_2= ruleBoolean )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:938:1: (this_State_0= ruleState | this_Label_1= ruleLabel | this_Boolean_2= ruleBoolean )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt21=1;
                }
                break;
            case 26:
                {
                alt21=2;
                }
                break;
            case RULE_BOOL:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:939:5: this_State_0= ruleState
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicAccess().getStateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleState_in_ruleAtomic2172);
                    this_State_0=ruleState();

                    state._fsp--;

                     
                            current = this_State_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:949:5: this_Label_1= ruleLabel
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicAccess().getLabelParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLabel_in_ruleAtomic2199);
                    this_Label_1=ruleLabel();

                    state._fsp--;

                     
                            current = this_Label_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:959:5: this_Boolean_2= ruleBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicAccess().getBooleanParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBoolean_in_ruleAtomic2226);
                    this_Boolean_2=ruleBoolean();

                    state._fsp--;

                     
                            current = this_Boolean_2; 
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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleState"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:975:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:976:2: (iv_ruleState= ruleState EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:977:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState2261);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState2271); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:984:1: ruleState returns [EObject current=null] : (otherlv_0= 'State:' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:987:28: ( (otherlv_0= 'State:' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:988:1: (otherlv_0= 'State:' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:988:1: (otherlv_0= 'State:' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:988:3: otherlv_0= 'State:' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleState2308); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:992:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:993:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:993:1: (lv_value_1_0= RULE_STRING )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:994:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState2325); 

            			newLeafNode(lv_value_1_0, grammarAccess.getStateAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1018:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1019:2: (iv_ruleLabel= ruleLabel EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1020:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel2366);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel2376); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1027:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'Label:' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1030:28: ( (otherlv_0= 'Label:' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1031:1: (otherlv_0= 'Label:' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1031:1: (otherlv_0= 'Label:' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1031:3: otherlv_0= 'Label:' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleLabel2413); 

                	newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1035:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1036:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1036:1: (lv_value_1_0= RULE_STRING )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1037:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabel2430); 

            			newLeafNode(lv_value_1_0, grammarAccess.getLabelAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

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


    // $ANTLR start "entryRuleBoolean"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1061:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1062:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1063:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean2471);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean2481); 

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1070:1: ruleBoolean returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOL ) ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1073:28: ( ( (lv_value_0_0= RULE_BOOL ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1074:1: ( (lv_value_0_0= RULE_BOOL ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1074:1: ( (lv_value_0_0= RULE_BOOL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1075:1: (lv_value_0_0= RULE_BOOL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1075:1: (lv_value_0_0= RULE_BOOL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1076:3: lv_value_0_0= RULE_BOOL
            {
            lv_value_0_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolean2522); 

            			newLeafNode(lv_value_0_0, grammarAccess.getBooleanAccess().getValueBOOLTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBooleanRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"BOOL");
            	    

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRulePathFormula"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1100:1: entryRulePathFormula returns [EObject current=null] : iv_rulePathFormula= rulePathFormula EOF ;
    public final EObject entryRulePathFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathFormula = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
        	
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1104:2: (iv_rulePathFormula= rulePathFormula EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1105:2: iv_rulePathFormula= rulePathFormula EOF
            {
             newCompositeNode(grammarAccess.getPathFormulaRule()); 
            pushFollow(FOLLOW_rulePathFormula_in_entryRulePathFormula2568);
            iv_rulePathFormula=rulePathFormula();

            state._fsp--;

             current =iv_rulePathFormula; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathFormula2578); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePathFormula"


    // $ANTLR start "rulePathFormula"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1115:1: rulePathFormula returns [EObject current=null] : (this_Next_0= ruleNext | this_Until_1= ruleUntil | this_Future_2= ruleFuture | this_Globally_3= ruleGlobally ) ;
    public final EObject rulePathFormula() throws RecognitionException {
        EObject current = null;

        EObject this_Next_0 = null;

        EObject this_Until_1 = null;

        EObject this_Future_2 = null;

        EObject this_Globally_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1119:28: ( (this_Next_0= ruleNext | this_Until_1= ruleUntil | this_Future_2= ruleFuture | this_Globally_3= ruleGlobally ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1120:1: (this_Next_0= ruleNext | this_Until_1= ruleUntil | this_Future_2= ruleFuture | this_Globally_3= ruleGlobally )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1120:1: (this_Next_0= ruleNext | this_Until_1= ruleUntil | this_Future_2= ruleFuture | this_Globally_3= ruleGlobally )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt22=1;
                }
                break;
            case RULE_BOOL:
            case 18:
            case 19:
            case 21:
            case 25:
            case 26:
                {
                alt22=2;
                }
                break;
            case 31:
                {
                alt22=3;
                }
                break;
            case 32:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1121:5: this_Next_0= ruleNext
                    {
                     
                            newCompositeNode(grammarAccess.getPathFormulaAccess().getNextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNext_in_rulePathFormula2629);
                    this_Next_0=ruleNext();

                    state._fsp--;

                     
                            current = this_Next_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1131:5: this_Until_1= ruleUntil
                    {
                     
                            newCompositeNode(grammarAccess.getPathFormulaAccess().getUntilParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUntil_in_rulePathFormula2656);
                    this_Until_1=ruleUntil();

                    state._fsp--;

                     
                            current = this_Until_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1141:5: this_Future_2= ruleFuture
                    {
                     
                            newCompositeNode(grammarAccess.getPathFormulaAccess().getFutureParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFuture_in_rulePathFormula2683);
                    this_Future_2=ruleFuture();

                    state._fsp--;

                     
                            current = this_Future_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1151:5: this_Globally_3= ruleGlobally
                    {
                     
                            newCompositeNode(grammarAccess.getPathFormulaAccess().getGloballyParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleGlobally_in_rulePathFormula2710);
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePathFormula"


    // $ANTLR start "entryRuleUntil"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1170:1: entryRuleUntil returns [EObject current=null] : iv_ruleUntil= ruleUntil EOF ;
    public final EObject entryRuleUntil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUntil = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1171:2: (iv_ruleUntil= ruleUntil EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1172:2: iv_ruleUntil= ruleUntil EOF
            {
             newCompositeNode(grammarAccess.getUntilRule()); 
            pushFollow(FOLLOW_ruleUntil_in_entryRuleUntil2749);
            iv_ruleUntil=ruleUntil();

            state._fsp--;

             current =iv_ruleUntil; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUntil2759); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1179:1: ruleUntil returns [EObject current=null] : ( ( (lv_left_0_0= ruleStateFormula ) ) ( ( (lv_type_1_1= 'U' | lv_type_1_2= 'W' | lv_type_1_3= 'R' ) ) ) ( (lv_bound_2_0= ruleTimeBound ) )? ( (lv_right_3_0= ruleStateFormula ) ) ) ;
    public final EObject ruleUntil() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_1=null;
        Token lv_type_1_2=null;
        Token lv_type_1_3=null;
        EObject lv_left_0_0 = null;

        EObject lv_bound_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1182:28: ( ( ( (lv_left_0_0= ruleStateFormula ) ) ( ( (lv_type_1_1= 'U' | lv_type_1_2= 'W' | lv_type_1_3= 'R' ) ) ) ( (lv_bound_2_0= ruleTimeBound ) )? ( (lv_right_3_0= ruleStateFormula ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1183:1: ( ( (lv_left_0_0= ruleStateFormula ) ) ( ( (lv_type_1_1= 'U' | lv_type_1_2= 'W' | lv_type_1_3= 'R' ) ) ) ( (lv_bound_2_0= ruleTimeBound ) )? ( (lv_right_3_0= ruleStateFormula ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1183:1: ( ( (lv_left_0_0= ruleStateFormula ) ) ( ( (lv_type_1_1= 'U' | lv_type_1_2= 'W' | lv_type_1_3= 'R' ) ) ) ( (lv_bound_2_0= ruleTimeBound ) )? ( (lv_right_3_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1183:2: ( (lv_left_0_0= ruleStateFormula ) ) ( ( (lv_type_1_1= 'U' | lv_type_1_2= 'W' | lv_type_1_3= 'R' ) ) ) ( (lv_bound_2_0= ruleTimeBound ) )? ( (lv_right_3_0= ruleStateFormula ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1183:2: ( (lv_left_0_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1184:1: (lv_left_0_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1184:1: (lv_left_0_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1185:3: lv_left_0_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getUntilAccess().getLeftStateFormulaParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleUntil2805);
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

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1201:2: ( ( (lv_type_1_1= 'U' | lv_type_1_2= 'W' | lv_type_1_3= 'R' ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1202:1: ( (lv_type_1_1= 'U' | lv_type_1_2= 'W' | lv_type_1_3= 'R' ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1202:1: ( (lv_type_1_1= 'U' | lv_type_1_2= 'W' | lv_type_1_3= 'R' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1203:1: (lv_type_1_1= 'U' | lv_type_1_2= 'W' | lv_type_1_3= 'R' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1203:1: (lv_type_1_1= 'U' | lv_type_1_2= 'W' | lv_type_1_3= 'R' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt23=1;
                }
                break;
            case 28:
                {
                alt23=2;
                }
                break;
            case 29:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1204:3: lv_type_1_1= 'U'
                    {
                    lv_type_1_1=(Token)match(input,27,FOLLOW_27_in_ruleUntil2825); 

                            newLeafNode(lv_type_1_1, grammarAccess.getUntilAccess().getTypeUKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUntilRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1216:8: lv_type_1_2= 'W'
                    {
                    lv_type_1_2=(Token)match(input,28,FOLLOW_28_in_ruleUntil2854); 

                            newLeafNode(lv_type_1_2, grammarAccess.getUntilAccess().getTypeWKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUntilRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1228:8: lv_type_1_3= 'R'
                    {
                    lv_type_1_3=(Token)match(input,29,FOLLOW_29_in_ruleUntil2883); 

                            newLeafNode(lv_type_1_3, grammarAccess.getUntilAccess().getTypeRKeyword_1_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUntilRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_3, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1243:2: ( (lv_bound_2_0= ruleTimeBound ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_COMPARATOR||LA24_0==16||LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1244:1: (lv_bound_2_0= ruleTimeBound )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1244:1: (lv_bound_2_0= ruleTimeBound )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1245:3: lv_bound_2_0= ruleTimeBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getUntilAccess().getBoundTimeBoundParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeBound_in_ruleUntil2920);
                    lv_bound_2_0=ruleTimeBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getUntilRule());
                    	        }
                           		set(
                           			current, 
                           			"bound",
                            		lv_bound_2_0, 
                            		"TimeBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1261:3: ( (lv_right_3_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1262:1: (lv_right_3_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1262:1: (lv_right_3_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1263:3: lv_right_3_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getUntilAccess().getRightStateFormulaParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleUntil2942);
            lv_right_3_0=ruleStateFormula();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUntilRule());
            	        }
                   		set(
                   			current, 
                   			"right",
                    		lv_right_3_0, 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1287:1: entryRuleNext returns [EObject current=null] : iv_ruleNext= ruleNext EOF ;
    public final EObject entryRuleNext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNext = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1288:2: (iv_ruleNext= ruleNext EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1289:2: iv_ruleNext= ruleNext EOF
            {
             newCompositeNode(grammarAccess.getNextRule()); 
            pushFollow(FOLLOW_ruleNext_in_entryRuleNext2978);
            iv_ruleNext=ruleNext();

            state._fsp--;

             current =iv_ruleNext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNext2988); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1296:1: ruleNext returns [EObject current=null] : (otherlv_0= 'X' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) ) ;
    public final EObject ruleNext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1299:28: ( (otherlv_0= 'X' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1300:1: (otherlv_0= 'X' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1300:1: (otherlv_0= 'X' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1300:3: otherlv_0= 'X' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleNext3025); 

                	newLeafNode(otherlv_0, grammarAccess.getNextAccess().getXKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1304:1: ( (lv_bound_1_0= ruleTimeBound ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_COMPARATOR||LA25_0==16||LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1305:1: (lv_bound_1_0= ruleTimeBound )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1305:1: (lv_bound_1_0= ruleTimeBound )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1306:3: lv_bound_1_0= ruleTimeBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getNextAccess().getBoundTimeBoundParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeBound_in_ruleNext3046);
                    lv_bound_1_0=ruleTimeBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNextRule());
                    	        }
                           		set(
                           			current, 
                           			"bound",
                            		lv_bound_1_0, 
                            		"TimeBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1322:3: ( (lv_value_2_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1323:1: (lv_value_2_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1323:1: (lv_value_2_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1324:3: lv_value_2_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getNextAccess().getValueStateFormulaParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleNext3068);
            lv_value_2_0=ruleStateFormula();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNextRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1348:1: entryRuleFuture returns [EObject current=null] : iv_ruleFuture= ruleFuture EOF ;
    public final EObject entryRuleFuture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuture = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1349:2: (iv_ruleFuture= ruleFuture EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1350:2: iv_ruleFuture= ruleFuture EOF
            {
             newCompositeNode(grammarAccess.getFutureRule()); 
            pushFollow(FOLLOW_ruleFuture_in_entryRuleFuture3104);
            iv_ruleFuture=ruleFuture();

            state._fsp--;

             current =iv_ruleFuture; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuture3114); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1357:1: ruleFuture returns [EObject current=null] : (otherlv_0= 'F' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) ) ;
    public final EObject ruleFuture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1360:28: ( (otherlv_0= 'F' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1361:1: (otherlv_0= 'F' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1361:1: (otherlv_0= 'F' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1361:3: otherlv_0= 'F' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleFuture3151); 

                	newLeafNode(otherlv_0, grammarAccess.getFutureAccess().getFKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1365:1: ( (lv_bound_1_0= ruleTimeBound ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_COMPARATOR||LA26_0==16||LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1366:1: (lv_bound_1_0= ruleTimeBound )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1366:1: (lv_bound_1_0= ruleTimeBound )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1367:3: lv_bound_1_0= ruleTimeBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getFutureAccess().getBoundTimeBoundParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeBound_in_ruleFuture3172);
                    lv_bound_1_0=ruleTimeBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFutureRule());
                    	        }
                           		set(
                           			current, 
                           			"bound",
                            		lv_bound_1_0, 
                            		"TimeBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1383:3: ( (lv_value_2_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1384:1: (lv_value_2_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1384:1: (lv_value_2_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1385:3: lv_value_2_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getFutureAccess().getValueStateFormulaParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleFuture3194);
            lv_value_2_0=ruleStateFormula();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFutureRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1409:1: entryRuleGlobally returns [EObject current=null] : iv_ruleGlobally= ruleGlobally EOF ;
    public final EObject entryRuleGlobally() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobally = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1410:2: (iv_ruleGlobally= ruleGlobally EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1411:2: iv_ruleGlobally= ruleGlobally EOF
            {
             newCompositeNode(grammarAccess.getGloballyRule()); 
            pushFollow(FOLLOW_ruleGlobally_in_entryRuleGlobally3230);
            iv_ruleGlobally=ruleGlobally();

            state._fsp--;

             current =iv_ruleGlobally; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobally3240); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1418:1: ruleGlobally returns [EObject current=null] : (otherlv_0= 'G' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) ) ;
    public final EObject ruleGlobally() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1421:28: ( (otherlv_0= 'G' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1422:1: (otherlv_0= 'G' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1422:1: (otherlv_0= 'G' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1422:3: otherlv_0= 'G' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleGlobally3277); 

                	newLeafNode(otherlv_0, grammarAccess.getGloballyAccess().getGKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1426:1: ( (lv_bound_1_0= ruleTimeBound ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_COMPARATOR||LA27_0==16||LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1427:1: (lv_bound_1_0= ruleTimeBound )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1427:1: (lv_bound_1_0= ruleTimeBound )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1428:3: lv_bound_1_0= ruleTimeBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getGloballyAccess().getBoundTimeBoundParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeBound_in_ruleGlobally3298);
                    lv_bound_1_0=ruleTimeBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGloballyRule());
                    	        }
                           		set(
                           			current, 
                           			"bound",
                            		lv_bound_1_0, 
                            		"TimeBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1444:3: ( (lv_value_2_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1445:1: (lv_value_2_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1445:1: (lv_value_2_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1446:3: lv_value_2_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getGloballyAccess().getValueStateFormulaParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleGlobally3320);
            lv_value_2_0=ruleStateFormula();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGloballyRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
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


    // $ANTLR start "entryRuleCompareProbability"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1470:1: entryRuleCompareProbability returns [EObject current=null] : iv_ruleCompareProbability= ruleCompareProbability EOF ;
    public final EObject entryRuleCompareProbability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareProbability = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
        	
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1474:2: (iv_ruleCompareProbability= ruleCompareProbability EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1475:2: iv_ruleCompareProbability= ruleCompareProbability EOF
            {
             newCompositeNode(grammarAccess.getCompareProbabilityRule()); 
            pushFollow(FOLLOW_ruleCompareProbability_in_entryRuleCompareProbability3362);
            iv_ruleCompareProbability=ruleCompareProbability();

            state._fsp--;

             current =iv_ruleCompareProbability; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareProbability3372); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleCompareProbability"


    // $ANTLR start "ruleCompareProbability"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1485:1: ruleCompareProbability returns [EObject current=null] : ( ( (lv_operator_0_0= RULE_COMPARATOR ) ) ( (lv_value_1_0= RULE_DOUBLE ) ) ) ;
    public final EObject ruleCompareProbability() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1489:28: ( ( ( (lv_operator_0_0= RULE_COMPARATOR ) ) ( (lv_value_1_0= RULE_DOUBLE ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1490:1: ( ( (lv_operator_0_0= RULE_COMPARATOR ) ) ( (lv_value_1_0= RULE_DOUBLE ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1490:1: ( ( (lv_operator_0_0= RULE_COMPARATOR ) ) ( (lv_value_1_0= RULE_DOUBLE ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1490:2: ( (lv_operator_0_0= RULE_COMPARATOR ) ) ( (lv_value_1_0= RULE_DOUBLE ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1490:2: ( (lv_operator_0_0= RULE_COMPARATOR ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1491:1: (lv_operator_0_0= RULE_COMPARATOR )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1491:1: (lv_operator_0_0= RULE_COMPARATOR )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1492:3: lv_operator_0_0= RULE_COMPARATOR
            {
            lv_operator_0_0=(Token)match(input,RULE_COMPARATOR,FOLLOW_RULE_COMPARATOR_in_ruleCompareProbability3418); 

            			newLeafNode(lv_operator_0_0, grammarAccess.getCompareProbabilityAccess().getOperatorCOMPARATORTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCompareProbabilityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"operator",
                    		lv_operator_0_0, 
                    		"COMPARATOR");
            	    

            }


            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1508:2: ( (lv_value_1_0= RULE_DOUBLE ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1509:1: (lv_value_1_0= RULE_DOUBLE )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1509:1: (lv_value_1_0= RULE_DOUBLE )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1510:3: lv_value_1_0= RULE_DOUBLE
            {
            lv_value_1_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleCompareProbability3440); 

            			newLeafNode(lv_value_1_0, grammarAccess.getCompareProbabilityAccess().getValueDOUBLETerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCompareProbabilityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"DOUBLE");
            	    

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleCompareProbability"


    // $ANTLR start "entryRuleTimeBound"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1537:1: entryRuleTimeBound returns [EObject current=null] : iv_ruleTimeBound= ruleTimeBound EOF ;
    public final EObject entryRuleTimeBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeBound = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
        	
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1541:2: (iv_ruleTimeBound= ruleTimeBound EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1542:2: iv_ruleTimeBound= ruleTimeBound EOF
            {
             newCompositeNode(grammarAccess.getTimeBoundRule()); 
            pushFollow(FOLLOW_ruleTimeBound_in_entryRuleTimeBound3491);
            iv_ruleTimeBound=ruleTimeBound();

            state._fsp--;

             current =iv_ruleTimeBound; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeBound3501); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleTimeBound"


    // $ANTLR start "ruleTimeBound"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1552:1: ruleTimeBound returns [EObject current=null] : ( ( ( ( (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' ) ) ) ( (lv_value_1_0= RULE_DOUBLE ) ) ) | (otherlv_2= '[' ( (lv_from_3_0= RULE_DOUBLE ) ) ( (lv_operator_4_0= ',' ) ) ( (lv_to_5_0= RULE_DOUBLE ) ) otherlv_6= ']' ) ) ;
    public final EObject ruleTimeBound() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_1=null;
        Token lv_operator_0_2=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token lv_from_3_0=null;
        Token lv_operator_4_0=null;
        Token lv_to_5_0=null;
        Token otherlv_6=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1556:28: ( ( ( ( ( (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' ) ) ) ( (lv_value_1_0= RULE_DOUBLE ) ) ) | (otherlv_2= '[' ( (lv_from_3_0= RULE_DOUBLE ) ) ( (lv_operator_4_0= ',' ) ) ( (lv_to_5_0= RULE_DOUBLE ) ) otherlv_6= ']' ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1557:1: ( ( ( ( (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' ) ) ) ( (lv_value_1_0= RULE_DOUBLE ) ) ) | (otherlv_2= '[' ( (lv_from_3_0= RULE_DOUBLE ) ) ( (lv_operator_4_0= ',' ) ) ( (lv_to_5_0= RULE_DOUBLE ) ) otherlv_6= ']' ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1557:1: ( ( ( ( (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' ) ) ) ( (lv_value_1_0= RULE_DOUBLE ) ) ) | (otherlv_2= '[' ( (lv_from_3_0= RULE_DOUBLE ) ) ( (lv_operator_4_0= ',' ) ) ( (lv_to_5_0= RULE_DOUBLE ) ) otherlv_6= ']' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_COMPARATOR||LA29_0==33) ) {
                alt29=1;
            }
            else if ( (LA29_0==16) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1557:2: ( ( ( (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' ) ) ) ( (lv_value_1_0= RULE_DOUBLE ) ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1557:2: ( ( ( (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' ) ) ) ( (lv_value_1_0= RULE_DOUBLE ) ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1557:3: ( ( (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' ) ) ) ( (lv_value_1_0= RULE_DOUBLE ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1557:3: ( ( (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' ) ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1558:1: ( (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1558:1: ( (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1559:1: (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1559:1: (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_COMPARATOR) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==33) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1560:3: lv_operator_0_1= RULE_COMPARATOR
                            {
                            lv_operator_0_1=(Token)match(input,RULE_COMPARATOR,FOLLOW_RULE_COMPARATOR_in_ruleTimeBound3550); 

                            			newLeafNode(lv_operator_0_1, grammarAccess.getTimeBoundAccess().getOperatorCOMPARATORTerminalRuleCall_0_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTimeBoundRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"operator",
                                    		lv_operator_0_1, 
                                    		"COMPARATOR");
                            	    

                            }
                            break;
                        case 2 :
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1575:8: lv_operator_0_2= '='
                            {
                            lv_operator_0_2=(Token)match(input,33,FOLLOW_33_in_ruleTimeBound3571); 

                                    newLeafNode(lv_operator_0_2, grammarAccess.getTimeBoundAccess().getOperatorEqualsSignKeyword_0_0_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTimeBoundRule());
                            	        }
                                   		setWithLastConsumed(current, "operator", lv_operator_0_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1590:2: ( (lv_value_1_0= RULE_DOUBLE ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1591:1: (lv_value_1_0= RULE_DOUBLE )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1591:1: (lv_value_1_0= RULE_DOUBLE )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1592:3: lv_value_1_0= RULE_DOUBLE
                    {
                    lv_value_1_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleTimeBound3604); 

                    			newLeafNode(lv_value_1_0, grammarAccess.getTimeBoundAccess().getValueDOUBLETerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimeBoundRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"DOUBLE");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1609:6: (otherlv_2= '[' ( (lv_from_3_0= RULE_DOUBLE ) ) ( (lv_operator_4_0= ',' ) ) ( (lv_to_5_0= RULE_DOUBLE ) ) otherlv_6= ']' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1609:6: (otherlv_2= '[' ( (lv_from_3_0= RULE_DOUBLE ) ) ( (lv_operator_4_0= ',' ) ) ( (lv_to_5_0= RULE_DOUBLE ) ) otherlv_6= ']' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1609:8: otherlv_2= '[' ( (lv_from_3_0= RULE_DOUBLE ) ) ( (lv_operator_4_0= ',' ) ) ( (lv_to_5_0= RULE_DOUBLE ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleTimeBound3629); 

                        	newLeafNode(otherlv_2, grammarAccess.getTimeBoundAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1613:1: ( (lv_from_3_0= RULE_DOUBLE ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1614:1: (lv_from_3_0= RULE_DOUBLE )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1614:1: (lv_from_3_0= RULE_DOUBLE )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1615:3: lv_from_3_0= RULE_DOUBLE
                    {
                    lv_from_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleTimeBound3646); 

                    			newLeafNode(lv_from_3_0, grammarAccess.getTimeBoundAccess().getFromDOUBLETerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimeBoundRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"from",
                            		lv_from_3_0, 
                            		"DOUBLE");
                    	    

                    }


                    }

                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1631:2: ( (lv_operator_4_0= ',' ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1632:1: (lv_operator_4_0= ',' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1632:1: (lv_operator_4_0= ',' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1633:3: lv_operator_4_0= ','
                    {
                    lv_operator_4_0=(Token)match(input,34,FOLLOW_34_in_ruleTimeBound3669); 

                            newLeafNode(lv_operator_4_0, grammarAccess.getTimeBoundAccess().getOperatorCommaKeyword_1_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimeBoundRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_4_0, ",");
                    	    

                    }


                    }

                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1646:2: ( (lv_to_5_0= RULE_DOUBLE ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1647:1: (lv_to_5_0= RULE_DOUBLE )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1647:1: (lv_to_5_0= RULE_DOUBLE )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1648:3: lv_to_5_0= RULE_DOUBLE
                    {
                    lv_to_5_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleTimeBound3699); 

                    			newLeafNode(lv_to_5_0, grammarAccess.getTimeBoundAccess().getToDOUBLETerminalRuleCall_1_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimeBoundRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"to",
                            		lv_to_5_0, 
                            		"DOUBLE");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleTimeBound3716); 

                        	newLeafNode(otherlv_6, grammarAccess.getTimeBoundAccess().getRightSquareBracketKeyword_1_4());
                        

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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleTimeBound"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\6\uffff";
    static final String DFA3_eofS =
        "\6\uffff";
    static final String DFA3_minS =
        "\1\6\1\uffff\1\4\1\uffff\1\4\1\uffff";
    static final String DFA3_maxS =
        "\1\32\1\uffff\1\17\1\uffff\1\17\1\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\uffff\1\3";
    static final String DFA3_specialS =
        "\6\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\7\uffff\1\3\3\uffff\1\2\1\1\1\uffff\1\1\3\uffff\2\1",
            "",
            "\1\4\2\uffff\1\1\7\uffff\1\5",
            "",
            "\1\4\2\uffff\1\1\7\uffff\1\5",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "205:1: (this_BooleanRule_0= ruleBooleanRule | this_SteadyState_1= ruleSteadyState | this_QuantifiedProbability_2= ruleQuantifiedProbability )";
        }
    }
 

    public static final BitSet FOLLOW_ruleStart_in_entryRuleStart75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStart85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFragment_in_ruleStart130 = new BitSet(new long[]{0x00000000062C4052L});
    public static final BitSet FOLLOW_ruleFragment_in_entryRuleFragment166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFragment176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleFragment223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_ruleFragment250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleComment336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanRule_in_ruleRule443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSteadyState_in_ruleRule470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedProbability_in_ruleRule497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSteadyState_in_entryRuleSteadyState536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSteadyState546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSteadyState583 = new BitSet(new long[]{0x0000000000008090L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleSteadyState595 = new BitSet(new long[]{0x0000000000008090L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_ruleSteadyState618 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_15_in_ruleSteadyState636 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleSteadyState649 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleSteadyState662 = new BitSet(new long[]{0x00000000062C0050L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleSteadyState674 = new BitSet(new long[]{0x00000000062C0050L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleSteadyState696 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleSteadyState708 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleSteadyState721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedProbability_in_entryRuleQuantifiedProbability757 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifiedProbability767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleQuantifiedProbability804 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleQuantifiedProbability816 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleQuantifiedProbability829 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleQuantifiedProbability841 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleQuantifiedProbability854 = new BitSet(new long[]{0x00000001C62C0040L});
    public static final BitSet FOLLOW_rulePathFormula_in_ruleQuantifiedProbability875 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQuantifiedProbability887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanRule_in_entryRuleBooleanRule923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanRule933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleBooleanRule978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_entryRuleStateFormula1013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateFormula1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleStateFormula1061 = new BitSet(new long[]{0x00000000062C0050L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleStateFormula1073 = new BitSet(new long[]{0x00000000062C0050L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleStateFormula1095 = new BitSet(new long[]{0x0000000001D00010L});
    public static final BitSet FOLLOW_ruleJunction_in_ruleStateFormula1117 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleStateFormula1144 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleStateFormula1158 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleStateFormula1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleStateFormula1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_ruleStateFormula1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbability_in_ruleStateFormula1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation1278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleNegation1325 = new BitSet(new long[]{0x00000000062C0040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleNegation1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJunction_in_entryRuleJunction1388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJunction1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleJunction1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleJunction1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction1515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleConjunction1562 = new BitSet(new long[]{0x00000000062C0040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleConjunction1584 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleConjunction1605 = new BitSet(new long[]{0x00000000062C0040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleConjunction1626 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction1664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDisjunction1711 = new BitSet(new long[]{0x00000000062C0040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleDisjunction1733 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleDisjunction1754 = new BitSet(new long[]{0x00000000062C0040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleDisjunction1775 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication1819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleImplication1870 = new BitSet(new long[]{0x00000000062C0040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleImplication1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbability_in_entryRuleProbability1931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProbability1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleProbability1978 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleProbability1990 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_ruleProbability2021 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleProbability2033 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleProbability2046 = new BitSet(new long[]{0x00000001C62C0040L});
    public static final BitSet FOLLOW_rulePathFormula_in_ruleProbability2067 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProbability2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic2115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_ruleAtomic2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleAtomic2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAtomic2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState2261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleState2308 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState2325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel2366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLabel2413 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabel2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean2471 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolean2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathFormula_in_entryRulePathFormula2568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathFormula2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNext_in_rulePathFormula2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUntil_in_rulePathFormula2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuture_in_rulePathFormula2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobally_in_rulePathFormula2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUntil_in_entryRuleUntil2749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUntil2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleUntil2805 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_27_in_ruleUntil2825 = new BitSet(new long[]{0x00000002062D00C0L});
    public static final BitSet FOLLOW_28_in_ruleUntil2854 = new BitSet(new long[]{0x00000002062D00C0L});
    public static final BitSet FOLLOW_29_in_ruleUntil2883 = new BitSet(new long[]{0x00000002062D00C0L});
    public static final BitSet FOLLOW_ruleTimeBound_in_ruleUntil2920 = new BitSet(new long[]{0x00000000062C0040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleUntil2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNext_in_entryRuleNext2978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNext2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleNext3025 = new BitSet(new long[]{0x00000002062D00C0L});
    public static final BitSet FOLLOW_ruleTimeBound_in_ruleNext3046 = new BitSet(new long[]{0x00000000062C0040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleNext3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuture_in_entryRuleFuture3104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuture3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFuture3151 = new BitSet(new long[]{0x00000002062D00C0L});
    public static final BitSet FOLLOW_ruleTimeBound_in_ruleFuture3172 = new BitSet(new long[]{0x00000000062C0040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleFuture3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobally_in_entryRuleGlobally3230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobally3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleGlobally3277 = new BitSet(new long[]{0x00000002062D00C0L});
    public static final BitSet FOLLOW_ruleTimeBound_in_ruleGlobally3298 = new BitSet(new long[]{0x00000000062C0040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleGlobally3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_entryRuleCompareProbability3362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareProbability3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMPARATOR_in_ruleCompareProbability3418 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleCompareProbability3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_entryRuleTimeBound3491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeBound3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMPARATOR_in_ruleTimeBound3550 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_33_in_ruleTimeBound3571 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleTimeBound3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTimeBound3629 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleTimeBound3646 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleTimeBound3669 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleTimeBound3699 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTimeBound3716 = new BitSet(new long[]{0x0000000000000002L});

}