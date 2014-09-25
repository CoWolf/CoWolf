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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:76:1: ruleStart returns [EObject current=null] : ( () ( (lv_rule_1_0= ruleFragment ) )* ) ;
    public final EObject ruleStart() throws RecognitionException {
        EObject current = null;

        EObject lv_rule_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:79:28: ( ( () ( (lv_rule_1_0= ruleFragment ) )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:80:1: ( () ( (lv_rule_1_0= ruleFragment ) )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:80:1: ( () ( (lv_rule_1_0= ruleFragment ) )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:80:2: () ( (lv_rule_1_0= ruleFragment ) )*
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:80:2: ()
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStartAccess().getStartAction_0(),
                        current);
                

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:86:2: ( (lv_rule_1_0= ruleFragment ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_SL_COMMENT||LA1_0==RULE_BOOL||LA1_0==14||(LA1_0>=18 && LA1_0<=19)||LA1_0==21||(LA1_0>=25 && LA1_0<=26)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:87:1: (lv_rule_1_0= ruleFragment )
            	    {
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:87:1: (lv_rule_1_0= ruleFragment )
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:88:3: lv_rule_1_0= ruleFragment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStartAccess().getRuleFragmentParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFragment_in_ruleStart140);
            	    lv_rule_1_0=ruleFragment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStartRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rule",
            	            		lv_rule_1_0, 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:112:1: entryRuleFragment returns [EObject current=null] : iv_ruleFragment= ruleFragment EOF ;
    public final EObject entryRuleFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragment = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:113:2: (iv_ruleFragment= ruleFragment EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:114:2: iv_ruleFragment= ruleFragment EOF
            {
             newCompositeNode(grammarAccess.getFragmentRule()); 
            pushFollow(FOLLOW_ruleFragment_in_entryRuleFragment177);
            iv_ruleFragment=ruleFragment();

            state._fsp--;

             current =iv_ruleFragment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFragment187); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:121:1: ruleFragment returns [EObject current=null] : (this_Comment_0= ruleComment | this_Rule_1= ruleRule ) ;
    public final EObject ruleFragment() throws RecognitionException {
        EObject current = null;

        EObject this_Comment_0 = null;

        EObject this_Rule_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:124:28: ( (this_Comment_0= ruleComment | this_Rule_1= ruleRule ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:125:1: (this_Comment_0= ruleComment | this_Rule_1= ruleRule )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:125:1: (this_Comment_0= ruleComment | this_Rule_1= ruleRule )
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:126:5: this_Comment_0= ruleComment
                    {
                     
                            newCompositeNode(grammarAccess.getFragmentAccess().getCommentParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleComment_in_ruleFragment234);
                    this_Comment_0=ruleComment();

                    state._fsp--;

                     
                            current = this_Comment_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:136:5: this_Rule_1= ruleRule
                    {
                     
                            newCompositeNode(grammarAccess.getFragmentAccess().getRuleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRule_in_ruleFragment261);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:152:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:153:2: (iv_ruleComment= ruleComment EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:154:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment296);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment306); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:161:1: ruleComment returns [EObject current=null] : ( (lv_comment_0_0= RULE_SL_COMMENT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:164:28: ( ( (lv_comment_0_0= RULE_SL_COMMENT ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:165:1: ( (lv_comment_0_0= RULE_SL_COMMENT ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:165:1: ( (lv_comment_0_0= RULE_SL_COMMENT ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:166:1: (lv_comment_0_0= RULE_SL_COMMENT )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:166:1: (lv_comment_0_0= RULE_SL_COMMENT )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:167:3: lv_comment_0_0= RULE_SL_COMMENT
            {
            lv_comment_0_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleComment347); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:191:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        	
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:195:2: (iv_ruleRule= ruleRule EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:196:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule393);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule403); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:206:1: ruleRule returns [EObject current=null] : (this_BooleanRule_0= ruleBooleanRule | this_SteadyState_1= ruleSteadyState | this_QuantifiedProbability_2= ruleQuantifiedProbability ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanRule_0 = null;

        EObject this_SteadyState_1 = null;

        EObject this_QuantifiedProbability_2 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:210:28: ( (this_BooleanRule_0= ruleBooleanRule | this_SteadyState_1= ruleSteadyState | this_QuantifiedProbability_2= ruleQuantifiedProbability ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:211:1: (this_BooleanRule_0= ruleBooleanRule | this_SteadyState_1= ruleSteadyState | this_QuantifiedProbability_2= ruleQuantifiedProbability )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:211:1: (this_BooleanRule_0= ruleBooleanRule | this_SteadyState_1= ruleSteadyState | this_QuantifiedProbability_2= ruleQuantifiedProbability )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:212:5: this_BooleanRule_0= ruleBooleanRule
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getBooleanRuleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBooleanRule_in_ruleRule454);
                    this_BooleanRule_0=ruleBooleanRule();

                    state._fsp--;

                     
                            current = this_BooleanRule_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:222:5: this_SteadyState_1= ruleSteadyState
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getSteadyStateParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSteadyState_in_ruleRule481);
                    this_SteadyState_1=ruleSteadyState();

                    state._fsp--;

                     
                            current = this_SteadyState_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:232:5: this_QuantifiedProbability_2= ruleQuantifiedProbability
                    {
                     
                            newCompositeNode(grammarAccess.getRuleAccess().getQuantifiedProbabilityParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleQuantifiedProbability_in_ruleRule508);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:251:1: entryRuleSteadyState returns [EObject current=null] : iv_ruleSteadyState= ruleSteadyState EOF ;
    public final EObject entryRuleSteadyState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSteadyState = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:252:2: (iv_ruleSteadyState= ruleSteadyState EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:253:2: iv_ruleSteadyState= ruleSteadyState EOF
            {
             newCompositeNode(grammarAccess.getSteadyStateRule()); 
            pushFollow(FOLLOW_ruleSteadyState_in_entryRuleSteadyState547);
            iv_ruleSteadyState=ruleSteadyState();

            state._fsp--;

             current =iv_ruleSteadyState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSteadyState557); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:260:1: ruleSteadyState returns [EObject current=null] : (otherlv_0= 'S' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( ( (lv_bound_2_0= ruleCompareProbability ) ) | otherlv_3= '=?' ) (this_SL_COMMENT_4= RULE_SL_COMMENT )* otherlv_5= '[' (this_SL_COMMENT_6= RULE_SL_COMMENT )* ( (lv_value_7_0= ruleStateFormula ) ) (this_SL_COMMENT_8= RULE_SL_COMMENT )* otherlv_9= ']' ) ;
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
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:263:28: ( (otherlv_0= 'S' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( ( (lv_bound_2_0= ruleCompareProbability ) ) | otherlv_3= '=?' ) (this_SL_COMMENT_4= RULE_SL_COMMENT )* otherlv_5= '[' (this_SL_COMMENT_6= RULE_SL_COMMENT )* ( (lv_value_7_0= ruleStateFormula ) ) (this_SL_COMMENT_8= RULE_SL_COMMENT )* otherlv_9= ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:264:1: (otherlv_0= 'S' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( ( (lv_bound_2_0= ruleCompareProbability ) ) | otherlv_3= '=?' ) (this_SL_COMMENT_4= RULE_SL_COMMENT )* otherlv_5= '[' (this_SL_COMMENT_6= RULE_SL_COMMENT )* ( (lv_value_7_0= ruleStateFormula ) ) (this_SL_COMMENT_8= RULE_SL_COMMENT )* otherlv_9= ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:264:1: (otherlv_0= 'S' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( ( (lv_bound_2_0= ruleCompareProbability ) ) | otherlv_3= '=?' ) (this_SL_COMMENT_4= RULE_SL_COMMENT )* otherlv_5= '[' (this_SL_COMMENT_6= RULE_SL_COMMENT )* ( (lv_value_7_0= ruleStateFormula ) ) (this_SL_COMMENT_8= RULE_SL_COMMENT )* otherlv_9= ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:264:3: otherlv_0= 'S' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( ( (lv_bound_2_0= ruleCompareProbability ) ) | otherlv_3= '=?' ) (this_SL_COMMENT_4= RULE_SL_COMMENT )* otherlv_5= '[' (this_SL_COMMENT_6= RULE_SL_COMMENT )* ( (lv_value_7_0= ruleStateFormula ) ) (this_SL_COMMENT_8= RULE_SL_COMMENT )* otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleSteadyState594); 

                	newLeafNode(otherlv_0, grammarAccess.getSteadyStateAccess().getSKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:268:1: (this_SL_COMMENT_1= RULE_SL_COMMENT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_SL_COMMENT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:268:2: this_SL_COMMENT_1= RULE_SL_COMMENT
            	    {
            	    this_SL_COMMENT_1=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleSteadyState606); 
            	     
            	        newLeafNode(this_SL_COMMENT_1, grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:272:3: ( ( (lv_bound_2_0= ruleCompareProbability ) ) | otherlv_3= '=?' )
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:272:4: ( (lv_bound_2_0= ruleCompareProbability ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:272:4: ( (lv_bound_2_0= ruleCompareProbability ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:273:1: (lv_bound_2_0= ruleCompareProbability )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:273:1: (lv_bound_2_0= ruleCompareProbability )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:274:3: lv_bound_2_0= ruleCompareProbability
                    {
                     
                    	        newCompositeNode(grammarAccess.getSteadyStateAccess().getBoundCompareProbabilityParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCompareProbability_in_ruleSteadyState629);
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:291:7: otherlv_3= '=?'
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSteadyState647); 

                        	newLeafNode(otherlv_3, grammarAccess.getSteadyStateAccess().getEqualsSignQuestionMarkKeyword_2_1());
                        

                    }
                    break;

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:295:2: (this_SL_COMMENT_4= RULE_SL_COMMENT )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_SL_COMMENT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:295:3: this_SL_COMMENT_4= RULE_SL_COMMENT
            	    {
            	    this_SL_COMMENT_4=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleSteadyState660); 
            	     
            	        newLeafNode(this_SL_COMMENT_4, grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_3()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleSteadyState673); 

                	newLeafNode(otherlv_5, grammarAccess.getSteadyStateAccess().getLeftSquareBracketKeyword_4());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:303:1: (this_SL_COMMENT_6= RULE_SL_COMMENT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_SL_COMMENT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:303:2: this_SL_COMMENT_6= RULE_SL_COMMENT
            	    {
            	    this_SL_COMMENT_6=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleSteadyState685); 
            	     
            	        newLeafNode(this_SL_COMMENT_6, grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_5()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:307:3: ( (lv_value_7_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:308:1: (lv_value_7_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:308:1: (lv_value_7_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:309:3: lv_value_7_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getSteadyStateAccess().getValueStateFormulaParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleSteadyState707);
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

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:325:2: (this_SL_COMMENT_8= RULE_SL_COMMENT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_SL_COMMENT) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:325:3: this_SL_COMMENT_8= RULE_SL_COMMENT
            	    {
            	    this_SL_COMMENT_8=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleSteadyState719); 
            	     
            	        newLeafNode(this_SL_COMMENT_8, grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_7()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleSteadyState732); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:341:1: entryRuleQuantifiedProbability returns [EObject current=null] : iv_ruleQuantifiedProbability= ruleQuantifiedProbability EOF ;
    public final EObject entryRuleQuantifiedProbability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifiedProbability = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:342:2: (iv_ruleQuantifiedProbability= ruleQuantifiedProbability EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:343:2: iv_ruleQuantifiedProbability= ruleQuantifiedProbability EOF
            {
             newCompositeNode(grammarAccess.getQuantifiedProbabilityRule()); 
            pushFollow(FOLLOW_ruleQuantifiedProbability_in_entryRuleQuantifiedProbability768);
            iv_ruleQuantifiedProbability=ruleQuantifiedProbability();

            state._fsp--;

             current =iv_ruleQuantifiedProbability; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifiedProbability778); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:350:1: ruleQuantifiedProbability returns [EObject current=null] : (otherlv_0= 'P' (this_SL_COMMENT_1= RULE_SL_COMMENT )* otherlv_2= '=?' (this_SL_COMMENT_3= RULE_SL_COMMENT )* otherlv_4= '[' ( (lv_value_5_0= rulePathFormula ) ) otherlv_6= ']' ) ;
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
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:353:28: ( (otherlv_0= 'P' (this_SL_COMMENT_1= RULE_SL_COMMENT )* otherlv_2= '=?' (this_SL_COMMENT_3= RULE_SL_COMMENT )* otherlv_4= '[' ( (lv_value_5_0= rulePathFormula ) ) otherlv_6= ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:354:1: (otherlv_0= 'P' (this_SL_COMMENT_1= RULE_SL_COMMENT )* otherlv_2= '=?' (this_SL_COMMENT_3= RULE_SL_COMMENT )* otherlv_4= '[' ( (lv_value_5_0= rulePathFormula ) ) otherlv_6= ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:354:1: (otherlv_0= 'P' (this_SL_COMMENT_1= RULE_SL_COMMENT )* otherlv_2= '=?' (this_SL_COMMENT_3= RULE_SL_COMMENT )* otherlv_4= '[' ( (lv_value_5_0= rulePathFormula ) ) otherlv_6= ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:354:3: otherlv_0= 'P' (this_SL_COMMENT_1= RULE_SL_COMMENT )* otherlv_2= '=?' (this_SL_COMMENT_3= RULE_SL_COMMENT )* otherlv_4= '[' ( (lv_value_5_0= rulePathFormula ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleQuantifiedProbability815); 

                	newLeafNode(otherlv_0, grammarAccess.getQuantifiedProbabilityAccess().getPKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:358:1: (this_SL_COMMENT_1= RULE_SL_COMMENT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_SL_COMMENT) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:358:2: this_SL_COMMENT_1= RULE_SL_COMMENT
            	    {
            	    this_SL_COMMENT_1=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleQuantifiedProbability827); 
            	     
            	        newLeafNode(this_SL_COMMENT_1, grammarAccess.getQuantifiedProbabilityAccess().getSL_COMMENTTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleQuantifiedProbability840); 

                	newLeafNode(otherlv_2, grammarAccess.getQuantifiedProbabilityAccess().getEqualsSignQuestionMarkKeyword_2());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:366:1: (this_SL_COMMENT_3= RULE_SL_COMMENT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_SL_COMMENT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:366:2: this_SL_COMMENT_3= RULE_SL_COMMENT
            	    {
            	    this_SL_COMMENT_3=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleQuantifiedProbability852); 
            	     
            	        newLeafNode(this_SL_COMMENT_3, grammarAccess.getQuantifiedProbabilityAccess().getSL_COMMENTTerminalRuleCall_3()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleQuantifiedProbability865); 

                	newLeafNode(otherlv_4, grammarAccess.getQuantifiedProbabilityAccess().getLeftSquareBracketKeyword_4());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:374:1: ( (lv_value_5_0= rulePathFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:375:1: (lv_value_5_0= rulePathFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:375:1: (lv_value_5_0= rulePathFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:376:3: lv_value_5_0= rulePathFormula
            {
             
            	        newCompositeNode(grammarAccess.getQuantifiedProbabilityAccess().getValuePathFormulaParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_rulePathFormula_in_ruleQuantifiedProbability886);
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

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleQuantifiedProbability898); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:404:1: entryRuleBooleanRule returns [EObject current=null] : iv_ruleBooleanRule= ruleBooleanRule EOF ;
    public final EObject entryRuleBooleanRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanRule = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:405:2: (iv_ruleBooleanRule= ruleBooleanRule EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:406:2: iv_ruleBooleanRule= ruleBooleanRule EOF
            {
             newCompositeNode(grammarAccess.getBooleanRuleRule()); 
            pushFollow(FOLLOW_ruleBooleanRule_in_entryRuleBooleanRule934);
            iv_ruleBooleanRule=ruleBooleanRule();

            state._fsp--;

             current =iv_ruleBooleanRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanRule944); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:413:1: ruleBooleanRule returns [EObject current=null] : ( (lv_value_0_0= ruleStateFormula ) ) ;
    public final EObject ruleBooleanRule() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:416:28: ( ( (lv_value_0_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:417:1: ( (lv_value_0_0= ruleStateFormula ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:417:1: ( (lv_value_0_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:418:1: (lv_value_0_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:418:1: (lv_value_0_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:419:3: lv_value_0_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getBooleanRuleAccess().getValueStateFormulaParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleBooleanRule989);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:443:1: entryRuleStateFormula returns [EObject current=null] : iv_ruleStateFormula= ruleStateFormula EOF ;
    public final EObject entryRuleStateFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateFormula = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:444:2: (iv_ruleStateFormula= ruleStateFormula EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:445:2: iv_ruleStateFormula= ruleStateFormula EOF
            {
             newCompositeNode(grammarAccess.getStateFormulaRule()); 
            pushFollow(FOLLOW_ruleStateFormula_in_entryRuleStateFormula1024);
            iv_ruleStateFormula=ruleStateFormula();

            state._fsp--;

             current =iv_ruleStateFormula; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateFormula1034); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:452:1: ruleStateFormula returns [EObject current=null] : ( (otherlv_0= '(' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( (lv_left_2_0= ruleStateFormula ) ) ( ( (lv_right_3_0= ruleJunction ) ) | ( (lv_right_4_0= ruleImplication ) ) )? (this_SL_COMMENT_5= RULE_SL_COMMENT )* otherlv_6= ')' ) | ( ( (lv_left_7_1= ruleNegation | lv_left_7_2= ruleAtomic | lv_left_7_3= ruleProbability ) ) ) ) ;
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
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:455:28: ( ( (otherlv_0= '(' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( (lv_left_2_0= ruleStateFormula ) ) ( ( (lv_right_3_0= ruleJunction ) ) | ( (lv_right_4_0= ruleImplication ) ) )? (this_SL_COMMENT_5= RULE_SL_COMMENT )* otherlv_6= ')' ) | ( ( (lv_left_7_1= ruleNegation | lv_left_7_2= ruleAtomic | lv_left_7_3= ruleProbability ) ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:456:1: ( (otherlv_0= '(' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( (lv_left_2_0= ruleStateFormula ) ) ( ( (lv_right_3_0= ruleJunction ) ) | ( (lv_right_4_0= ruleImplication ) ) )? (this_SL_COMMENT_5= RULE_SL_COMMENT )* otherlv_6= ')' ) | ( ( (lv_left_7_1= ruleNegation | lv_left_7_2= ruleAtomic | lv_left_7_3= ruleProbability ) ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:456:1: ( (otherlv_0= '(' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( (lv_left_2_0= ruleStateFormula ) ) ( ( (lv_right_3_0= ruleJunction ) ) | ( (lv_right_4_0= ruleImplication ) ) )? (this_SL_COMMENT_5= RULE_SL_COMMENT )* otherlv_6= ')' ) | ( ( (lv_left_7_1= ruleNegation | lv_left_7_2= ruleAtomic | lv_left_7_3= ruleProbability ) ) ) )
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:456:2: (otherlv_0= '(' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( (lv_left_2_0= ruleStateFormula ) ) ( ( (lv_right_3_0= ruleJunction ) ) | ( (lv_right_4_0= ruleImplication ) ) )? (this_SL_COMMENT_5= RULE_SL_COMMENT )* otherlv_6= ')' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:456:2: (otherlv_0= '(' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( (lv_left_2_0= ruleStateFormula ) ) ( ( (lv_right_3_0= ruleJunction ) ) | ( (lv_right_4_0= ruleImplication ) ) )? (this_SL_COMMENT_5= RULE_SL_COMMENT )* otherlv_6= ')' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:456:4: otherlv_0= '(' (this_SL_COMMENT_1= RULE_SL_COMMENT )* ( (lv_left_2_0= ruleStateFormula ) ) ( ( (lv_right_3_0= ruleJunction ) ) | ( (lv_right_4_0= ruleImplication ) ) )? (this_SL_COMMENT_5= RULE_SL_COMMENT )* otherlv_6= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleStateFormula1072); 

                        	newLeafNode(otherlv_0, grammarAccess.getStateFormulaAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:460:1: (this_SL_COMMENT_1= RULE_SL_COMMENT )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_SL_COMMENT) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:460:2: this_SL_COMMENT_1= RULE_SL_COMMENT
                    	    {
                    	    this_SL_COMMENT_1=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleStateFormula1084); 
                    	     
                    	        newLeafNode(this_SL_COMMENT_1, grammarAccess.getStateFormulaAccess().getSL_COMMENTTerminalRuleCall_0_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:464:3: ( (lv_left_2_0= ruleStateFormula ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:465:1: (lv_left_2_0= ruleStateFormula )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:465:1: (lv_left_2_0= ruleStateFormula )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:466:3: lv_left_2_0= ruleStateFormula
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFormulaAccess().getLeftStateFormulaParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStateFormula_in_ruleStateFormula1106);
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

                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:482:2: ( ( (lv_right_3_0= ruleJunction ) ) | ( (lv_right_4_0= ruleImplication ) ) )?
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
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:482:3: ( (lv_right_3_0= ruleJunction ) )
                            {
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:482:3: ( (lv_right_3_0= ruleJunction ) )
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:483:1: (lv_right_3_0= ruleJunction )
                            {
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:483:1: (lv_right_3_0= ruleJunction )
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:484:3: lv_right_3_0= ruleJunction
                            {
                             
                            	        newCompositeNode(grammarAccess.getStateFormulaAccess().getRightJunctionParserRuleCall_0_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleJunction_in_ruleStateFormula1128);
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
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:501:6: ( (lv_right_4_0= ruleImplication ) )
                            {
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:501:6: ( (lv_right_4_0= ruleImplication ) )
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:502:1: (lv_right_4_0= ruleImplication )
                            {
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:502:1: (lv_right_4_0= ruleImplication )
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:503:3: lv_right_4_0= ruleImplication
                            {
                             
                            	        newCompositeNode(grammarAccess.getStateFormulaAccess().getRightImplicationParserRuleCall_0_3_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleImplication_in_ruleStateFormula1155);
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

                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:519:4: (this_SL_COMMENT_5= RULE_SL_COMMENT )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_SL_COMMENT) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:519:5: this_SL_COMMENT_5= RULE_SL_COMMENT
                    	    {
                    	    this_SL_COMMENT_5=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleStateFormula1169); 
                    	     
                    	        newLeafNode(this_SL_COMMENT_5, grammarAccess.getStateFormulaAccess().getSL_COMMENTTerminalRuleCall_0_4()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleStateFormula1182); 

                        	newLeafNode(otherlv_6, grammarAccess.getStateFormulaAccess().getRightParenthesisKeyword_0_5());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:528:6: ( ( (lv_left_7_1= ruleNegation | lv_left_7_2= ruleAtomic | lv_left_7_3= ruleProbability ) ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:528:6: ( ( (lv_left_7_1= ruleNegation | lv_left_7_2= ruleAtomic | lv_left_7_3= ruleProbability ) ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:529:1: ( (lv_left_7_1= ruleNegation | lv_left_7_2= ruleAtomic | lv_left_7_3= ruleProbability ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:529:1: ( (lv_left_7_1= ruleNegation | lv_left_7_2= ruleAtomic | lv_left_7_3= ruleProbability ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:530:1: (lv_left_7_1= ruleNegation | lv_left_7_2= ruleAtomic | lv_left_7_3= ruleProbability )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:530:1: (lv_left_7_1= ruleNegation | lv_left_7_2= ruleAtomic | lv_left_7_3= ruleProbability )
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
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:531:3: lv_left_7_1= ruleNegation
                            {
                             
                            	        newCompositeNode(grammarAccess.getStateFormulaAccess().getLeftNegationParserRuleCall_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNegation_in_ruleStateFormula1212);
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
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:546:8: lv_left_7_2= ruleAtomic
                            {
                             
                            	        newCompositeNode(grammarAccess.getStateFormulaAccess().getLeftAtomicParserRuleCall_1_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleAtomic_in_ruleStateFormula1231);
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
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:561:8: lv_left_7_3= ruleProbability
                            {
                             
                            	        newCompositeNode(grammarAccess.getStateFormulaAccess().getLeftProbabilityParserRuleCall_1_0_2()); 
                            	    
                            pushFollow(FOLLOW_ruleProbability_in_ruleStateFormula1250);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:587:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:588:2: (iv_ruleNegation= ruleNegation EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:589:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation1289);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation1299); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:596:1: ruleNegation returns [EObject current=null] : (otherlv_0= '!' this_StateFormula_1= ruleStateFormula ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_StateFormula_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:599:28: ( (otherlv_0= '!' this_StateFormula_1= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:600:1: (otherlv_0= '!' this_StateFormula_1= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:600:1: (otherlv_0= '!' this_StateFormula_1= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:600:3: otherlv_0= '!' this_StateFormula_1= ruleStateFormula
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleNegation1336); 

                	newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getExclamationMarkKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getNegationAccess().getStateFormulaParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleStateFormula_in_ruleNegation1358);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:621:1: entryRuleJunction returns [EObject current=null] : iv_ruleJunction= ruleJunction EOF ;
    public final EObject entryRuleJunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJunction = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
        	
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:625:2: (iv_ruleJunction= ruleJunction EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:626:2: iv_ruleJunction= ruleJunction EOF
            {
             newCompositeNode(grammarAccess.getJunctionRule()); 
            pushFollow(FOLLOW_ruleJunction_in_entryRuleJunction1399);
            iv_ruleJunction=ruleJunction();

            state._fsp--;

             current =iv_ruleJunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJunction1409); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:636:1: ruleJunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction | this_Disjunction_1= ruleDisjunction ) ;
    public final EObject ruleJunction() throws RecognitionException {
        EObject current = null;

        EObject this_Conjunction_0 = null;

        EObject this_Disjunction_1 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:640:28: ( (this_Conjunction_0= ruleConjunction | this_Disjunction_1= ruleDisjunction ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:641:1: (this_Conjunction_0= ruleConjunction | this_Disjunction_1= ruleDisjunction )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:641:1: (this_Conjunction_0= ruleConjunction | this_Disjunction_1= ruleDisjunction )
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:642:5: this_Conjunction_0= ruleConjunction
                    {
                     
                            newCompositeNode(grammarAccess.getJunctionAccess().getConjunctionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConjunction_in_ruleJunction1460);
                    this_Conjunction_0=ruleConjunction();

                    state._fsp--;

                     
                            current = this_Conjunction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:652:5: this_Disjunction_1= ruleDisjunction
                    {
                     
                            newCompositeNode(grammarAccess.getJunctionAccess().getDisjunctionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDisjunction_in_ruleJunction1487);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:671:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:672:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:673:2: iv_ruleConjunction= ruleConjunction EOF
            {
             newCompositeNode(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction1526);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;

             current =iv_ruleConjunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction1536); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:680:1: ruleConjunction returns [EObject current=null] : (otherlv_0= '&' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_StateFormula_1 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:683:28: ( (otherlv_0= '&' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:684:1: (otherlv_0= '&' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:684:1: (otherlv_0= '&' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:684:3: otherlv_0= '&' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleConjunction1573); 

                	newLeafNode(otherlv_0, grammarAccess.getConjunctionAccess().getAmpersandKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getConjunctionAccess().getStateFormulaParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleStateFormula_in_ruleConjunction1595);
            this_StateFormula_1=ruleStateFormula();

            state._fsp--;

             
                    current = this_StateFormula_1; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:697:1: ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:697:2: () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) )
            	    {
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:697:2: ()
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:698:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getConjunctionAccess().getConjunctionLeftAction_2_0(),
            	                current);
            	        

            	    }

            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleConjunction1616); 

            	        	newLeafNode(otherlv_3, grammarAccess.getConjunctionAccess().getAmpersandKeyword_2_1());
            	        
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:707:1: ( (lv_right_4_0= ruleStateFormula ) )
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:708:1: (lv_right_4_0= ruleStateFormula )
            	    {
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:708:1: (lv_right_4_0= ruleStateFormula )
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:709:3: lv_right_4_0= ruleStateFormula
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStateFormula_in_ruleConjunction1637);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:733:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:734:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:735:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
             newCompositeNode(grammarAccess.getDisjunctionRule()); 
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction1675);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;

             current =iv_ruleDisjunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction1685); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:742:1: ruleDisjunction returns [EObject current=null] : (otherlv_0= '|' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )* ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_StateFormula_1 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:745:28: ( (otherlv_0= '|' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:746:1: (otherlv_0= '|' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:746:1: (otherlv_0= '|' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:746:3: otherlv_0= '|' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )*
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleDisjunction1722); 

                	newLeafNode(otherlv_0, grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getDisjunctionAccess().getStateFormulaParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleStateFormula_in_ruleDisjunction1744);
            this_StateFormula_1=ruleStateFormula();

            state._fsp--;

             
                    current = this_StateFormula_1; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:759:1: ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:759:2: () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) )
            	    {
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:759:2: ()
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:760:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_2_0(),
            	                current);
            	        

            	    }

            	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleDisjunction1765); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_2_1());
            	        
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:769:1: ( (lv_right_4_0= ruleStateFormula ) )
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:770:1: (lv_right_4_0= ruleStateFormula )
            	    {
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:770:1: (lv_right_4_0= ruleStateFormula )
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:771:3: lv_right_4_0= ruleStateFormula
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStateFormula_in_ruleDisjunction1786);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:795:1: entryRuleImplication returns [EObject current=null] : iv_ruleImplication= ruleImplication EOF ;
    public final EObject entryRuleImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplication = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
        	
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:799:2: (iv_ruleImplication= ruleImplication EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:800:2: iv_ruleImplication= ruleImplication EOF
            {
             newCompositeNode(grammarAccess.getImplicationRule()); 
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication1830);
            iv_ruleImplication=ruleImplication();

            state._fsp--;

             current =iv_ruleImplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication1840); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:810:1: ruleImplication returns [EObject current=null] : (otherlv_0= '=>' ( (lv_right_1_0= ruleStateFormula ) ) ) ;
    public final EObject ruleImplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_1_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:814:28: ( (otherlv_0= '=>' ( (lv_right_1_0= ruleStateFormula ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:815:1: (otherlv_0= '=>' ( (lv_right_1_0= ruleStateFormula ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:815:1: (otherlv_0= '=>' ( (lv_right_1_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:815:3: otherlv_0= '=>' ( (lv_right_1_0= ruleStateFormula ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleImplication1881); 

                	newLeafNode(otherlv_0, grammarAccess.getImplicationAccess().getEqualsSignGreaterThanSignKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:819:1: ( (lv_right_1_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:820:1: (lv_right_1_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:820:1: (lv_right_1_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:821:3: lv_right_1_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getImplicationAccess().getRightStateFormulaParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleImplication1902);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:848:1: entryRuleProbability returns [EObject current=null] : iv_ruleProbability= ruleProbability EOF ;
    public final EObject entryRuleProbability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbability = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:849:2: (iv_ruleProbability= ruleProbability EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:850:2: iv_ruleProbability= ruleProbability EOF
            {
             newCompositeNode(grammarAccess.getProbabilityRule()); 
            pushFollow(FOLLOW_ruleProbability_in_entryRuleProbability1942);
            iv_ruleProbability=ruleProbability();

            state._fsp--;

             current =iv_ruleProbability; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProbability1952); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:857:1: ruleProbability returns [EObject current=null] : (otherlv_0= 'P' (this_SL_COMMENT_1= RULE_SL_COMMENT )* () ( (lv_comparator_3_0= ruleCompareProbability ) ) (this_SL_COMMENT_4= RULE_SL_COMMENT )* otherlv_5= '[' ( (lv_path_6_0= rulePathFormula ) ) otherlv_7= ']' ) ;
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
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:860:28: ( (otherlv_0= 'P' (this_SL_COMMENT_1= RULE_SL_COMMENT )* () ( (lv_comparator_3_0= ruleCompareProbability ) ) (this_SL_COMMENT_4= RULE_SL_COMMENT )* otherlv_5= '[' ( (lv_path_6_0= rulePathFormula ) ) otherlv_7= ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:861:1: (otherlv_0= 'P' (this_SL_COMMENT_1= RULE_SL_COMMENT )* () ( (lv_comparator_3_0= ruleCompareProbability ) ) (this_SL_COMMENT_4= RULE_SL_COMMENT )* otherlv_5= '[' ( (lv_path_6_0= rulePathFormula ) ) otherlv_7= ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:861:1: (otherlv_0= 'P' (this_SL_COMMENT_1= RULE_SL_COMMENT )* () ( (lv_comparator_3_0= ruleCompareProbability ) ) (this_SL_COMMENT_4= RULE_SL_COMMENT )* otherlv_5= '[' ( (lv_path_6_0= rulePathFormula ) ) otherlv_7= ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:861:3: otherlv_0= 'P' (this_SL_COMMENT_1= RULE_SL_COMMENT )* () ( (lv_comparator_3_0= ruleCompareProbability ) ) (this_SL_COMMENT_4= RULE_SL_COMMENT )* otherlv_5= '[' ( (lv_path_6_0= rulePathFormula ) ) otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleProbability1989); 

                	newLeafNode(otherlv_0, grammarAccess.getProbabilityAccess().getPKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:865:1: (this_SL_COMMENT_1= RULE_SL_COMMENT )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_SL_COMMENT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:865:2: this_SL_COMMENT_1= RULE_SL_COMMENT
            	    {
            	    this_SL_COMMENT_1=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleProbability2001); 
            	     
            	        newLeafNode(this_SL_COMMENT_1, grammarAccess.getProbabilityAccess().getSL_COMMENTTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:869:3: ()
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:870:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProbabilityAccess().getProbabilityAction_2(),
                        current);
                

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:875:2: ( (lv_comparator_3_0= ruleCompareProbability ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:876:1: (lv_comparator_3_0= ruleCompareProbability )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:876:1: (lv_comparator_3_0= ruleCompareProbability )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:877:3: lv_comparator_3_0= ruleCompareProbability
            {
             
            	        newCompositeNode(grammarAccess.getProbabilityAccess().getComparatorCompareProbabilityParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleCompareProbability_in_ruleProbability2032);
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

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:893:2: (this_SL_COMMENT_4= RULE_SL_COMMENT )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_SL_COMMENT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:893:3: this_SL_COMMENT_4= RULE_SL_COMMENT
            	    {
            	    this_SL_COMMENT_4=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleProbability2044); 
            	     
            	        newLeafNode(this_SL_COMMENT_4, grammarAccess.getProbabilityAccess().getSL_COMMENTTerminalRuleCall_4()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleProbability2057); 

                	newLeafNode(otherlv_5, grammarAccess.getProbabilityAccess().getLeftSquareBracketKeyword_5());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:901:1: ( (lv_path_6_0= rulePathFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:902:1: (lv_path_6_0= rulePathFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:902:1: (lv_path_6_0= rulePathFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:903:3: lv_path_6_0= rulePathFormula
            {
             
            	        newCompositeNode(grammarAccess.getProbabilityAccess().getPathPathFormulaParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_rulePathFormula_in_ruleProbability2078);
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

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleProbability2090); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:931:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:932:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:933:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic2126);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic2136); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:940:1: ruleAtomic returns [EObject current=null] : (this_State_0= ruleState | this_Label_1= ruleLabel | this_Boolean_2= ruleBoolean ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        EObject this_State_0 = null;

        EObject this_Label_1 = null;

        EObject this_Boolean_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:943:28: ( (this_State_0= ruleState | this_Label_1= ruleLabel | this_Boolean_2= ruleBoolean ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:944:1: (this_State_0= ruleState | this_Label_1= ruleLabel | this_Boolean_2= ruleBoolean )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:944:1: (this_State_0= ruleState | this_Label_1= ruleLabel | this_Boolean_2= ruleBoolean )
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:945:5: this_State_0= ruleState
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicAccess().getStateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleState_in_ruleAtomic2183);
                    this_State_0=ruleState();

                    state._fsp--;

                     
                            current = this_State_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:955:5: this_Label_1= ruleLabel
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicAccess().getLabelParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLabel_in_ruleAtomic2210);
                    this_Label_1=ruleLabel();

                    state._fsp--;

                     
                            current = this_Label_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:965:5: this_Boolean_2= ruleBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicAccess().getBooleanParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBoolean_in_ruleAtomic2237);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:981:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:982:2: (iv_ruleState= ruleState EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:983:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState2272);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState2282); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:990:1: ruleState returns [EObject current=null] : (otherlv_0= 'State:' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:993:28: ( (otherlv_0= 'State:' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:994:1: (otherlv_0= 'State:' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:994:1: (otherlv_0= 'State:' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:994:3: otherlv_0= 'State:' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleState2319); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:998:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:999:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:999:1: (lv_value_1_0= RULE_STRING )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1000:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleState2336); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1024:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1025:2: (iv_ruleLabel= ruleLabel EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1026:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel2377);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel2387); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1033:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'Label:' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1036:28: ( (otherlv_0= 'Label:' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1037:1: (otherlv_0= 'Label:' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1037:1: (otherlv_0= 'Label:' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1037:3: otherlv_0= 'Label:' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleLabel2424); 

                	newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1041:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1042:1: (lv_value_1_0= RULE_STRING )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1042:1: (lv_value_1_0= RULE_STRING )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1043:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabel2441); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1067:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1068:2: (iv_ruleBoolean= ruleBoolean EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1069:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean2482);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean2492); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1076:1: ruleBoolean returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOL ) ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1079:28: ( ( (lv_value_0_0= RULE_BOOL ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1080:1: ( (lv_value_0_0= RULE_BOOL ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1080:1: ( (lv_value_0_0= RULE_BOOL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1081:1: (lv_value_0_0= RULE_BOOL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1081:1: (lv_value_0_0= RULE_BOOL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1082:3: lv_value_0_0= RULE_BOOL
            {
            lv_value_0_0=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolean2533); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1106:1: entryRulePathFormula returns [EObject current=null] : iv_rulePathFormula= rulePathFormula EOF ;
    public final EObject entryRulePathFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathFormula = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
        	
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1110:2: (iv_rulePathFormula= rulePathFormula EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1111:2: iv_rulePathFormula= rulePathFormula EOF
            {
             newCompositeNode(grammarAccess.getPathFormulaRule()); 
            pushFollow(FOLLOW_rulePathFormula_in_entryRulePathFormula2579);
            iv_rulePathFormula=rulePathFormula();

            state._fsp--;

             current =iv_rulePathFormula; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathFormula2589); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1121:1: rulePathFormula returns [EObject current=null] : (this_Next_0= ruleNext | this_Until_1= ruleUntil | this_Future_2= ruleFuture | this_Globally_3= ruleGlobally ) ;
    public final EObject rulePathFormula() throws RecognitionException {
        EObject current = null;

        EObject this_Next_0 = null;

        EObject this_Until_1 = null;

        EObject this_Future_2 = null;

        EObject this_Globally_3 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1125:28: ( (this_Next_0= ruleNext | this_Until_1= ruleUntil | this_Future_2= ruleFuture | this_Globally_3= ruleGlobally ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1126:1: (this_Next_0= ruleNext | this_Until_1= ruleUntil | this_Future_2= ruleFuture | this_Globally_3= ruleGlobally )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1126:1: (this_Next_0= ruleNext | this_Until_1= ruleUntil | this_Future_2= ruleFuture | this_Globally_3= ruleGlobally )
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1127:5: this_Next_0= ruleNext
                    {
                     
                            newCompositeNode(grammarAccess.getPathFormulaAccess().getNextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNext_in_rulePathFormula2640);
                    this_Next_0=ruleNext();

                    state._fsp--;

                     
                            current = this_Next_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1137:5: this_Until_1= ruleUntil
                    {
                     
                            newCompositeNode(grammarAccess.getPathFormulaAccess().getUntilParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUntil_in_rulePathFormula2667);
                    this_Until_1=ruleUntil();

                    state._fsp--;

                     
                            current = this_Until_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1147:5: this_Future_2= ruleFuture
                    {
                     
                            newCompositeNode(grammarAccess.getPathFormulaAccess().getFutureParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFuture_in_rulePathFormula2694);
                    this_Future_2=ruleFuture();

                    state._fsp--;

                     
                            current = this_Future_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1157:5: this_Globally_3= ruleGlobally
                    {
                     
                            newCompositeNode(grammarAccess.getPathFormulaAccess().getGloballyParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleGlobally_in_rulePathFormula2721);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1176:1: entryRuleUntil returns [EObject current=null] : iv_ruleUntil= ruleUntil EOF ;
    public final EObject entryRuleUntil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUntil = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1177:2: (iv_ruleUntil= ruleUntil EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1178:2: iv_ruleUntil= ruleUntil EOF
            {
             newCompositeNode(grammarAccess.getUntilRule()); 
            pushFollow(FOLLOW_ruleUntil_in_entryRuleUntil2760);
            iv_ruleUntil=ruleUntil();

            state._fsp--;

             current =iv_ruleUntil; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUntil2770); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1185:1: ruleUntil returns [EObject current=null] : ( ( (lv_left_0_0= ruleStateFormula ) ) ( ( (lv_type_1_1= 'U' | lv_type_1_2= 'W' | lv_type_1_3= 'R' ) ) ) ( (lv_bound_2_0= ruleTimeBound ) )? ( (lv_right_3_0= ruleStateFormula ) ) ) ;
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
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1188:28: ( ( ( (lv_left_0_0= ruleStateFormula ) ) ( ( (lv_type_1_1= 'U' | lv_type_1_2= 'W' | lv_type_1_3= 'R' ) ) ) ( (lv_bound_2_0= ruleTimeBound ) )? ( (lv_right_3_0= ruleStateFormula ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1189:1: ( ( (lv_left_0_0= ruleStateFormula ) ) ( ( (lv_type_1_1= 'U' | lv_type_1_2= 'W' | lv_type_1_3= 'R' ) ) ) ( (lv_bound_2_0= ruleTimeBound ) )? ( (lv_right_3_0= ruleStateFormula ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1189:1: ( ( (lv_left_0_0= ruleStateFormula ) ) ( ( (lv_type_1_1= 'U' | lv_type_1_2= 'W' | lv_type_1_3= 'R' ) ) ) ( (lv_bound_2_0= ruleTimeBound ) )? ( (lv_right_3_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1189:2: ( (lv_left_0_0= ruleStateFormula ) ) ( ( (lv_type_1_1= 'U' | lv_type_1_2= 'W' | lv_type_1_3= 'R' ) ) ) ( (lv_bound_2_0= ruleTimeBound ) )? ( (lv_right_3_0= ruleStateFormula ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1189:2: ( (lv_left_0_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1190:1: (lv_left_0_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1190:1: (lv_left_0_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1191:3: lv_left_0_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getUntilAccess().getLeftStateFormulaParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleUntil2816);
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

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1207:2: ( ( (lv_type_1_1= 'U' | lv_type_1_2= 'W' | lv_type_1_3= 'R' ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1208:1: ( (lv_type_1_1= 'U' | lv_type_1_2= 'W' | lv_type_1_3= 'R' ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1208:1: ( (lv_type_1_1= 'U' | lv_type_1_2= 'W' | lv_type_1_3= 'R' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1209:1: (lv_type_1_1= 'U' | lv_type_1_2= 'W' | lv_type_1_3= 'R' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1209:1: (lv_type_1_1= 'U' | lv_type_1_2= 'W' | lv_type_1_3= 'R' )
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1210:3: lv_type_1_1= 'U'
                    {
                    lv_type_1_1=(Token)match(input,27,FOLLOW_27_in_ruleUntil2836); 

                            newLeafNode(lv_type_1_1, grammarAccess.getUntilAccess().getTypeUKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUntilRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1222:8: lv_type_1_2= 'W'
                    {
                    lv_type_1_2=(Token)match(input,28,FOLLOW_28_in_ruleUntil2865); 

                            newLeafNode(lv_type_1_2, grammarAccess.getUntilAccess().getTypeWKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getUntilRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_1_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1234:8: lv_type_1_3= 'R'
                    {
                    lv_type_1_3=(Token)match(input,29,FOLLOW_29_in_ruleUntil2894); 

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

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1249:2: ( (lv_bound_2_0= ruleTimeBound ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_COMPARATOR||LA24_0==16||LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1250:1: (lv_bound_2_0= ruleTimeBound )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1250:1: (lv_bound_2_0= ruleTimeBound )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1251:3: lv_bound_2_0= ruleTimeBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getUntilAccess().getBoundTimeBoundParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeBound_in_ruleUntil2931);
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

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1267:3: ( (lv_right_3_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1268:1: (lv_right_3_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1268:1: (lv_right_3_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1269:3: lv_right_3_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getUntilAccess().getRightStateFormulaParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleUntil2953);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1293:1: entryRuleNext returns [EObject current=null] : iv_ruleNext= ruleNext EOF ;
    public final EObject entryRuleNext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNext = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1294:2: (iv_ruleNext= ruleNext EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1295:2: iv_ruleNext= ruleNext EOF
            {
             newCompositeNode(grammarAccess.getNextRule()); 
            pushFollow(FOLLOW_ruleNext_in_entryRuleNext2989);
            iv_ruleNext=ruleNext();

            state._fsp--;

             current =iv_ruleNext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNext2999); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1302:1: ruleNext returns [EObject current=null] : (otherlv_0= 'X' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) ) ;
    public final EObject ruleNext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1305:28: ( (otherlv_0= 'X' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1306:1: (otherlv_0= 'X' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1306:1: (otherlv_0= 'X' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1306:3: otherlv_0= 'X' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleNext3036); 

                	newLeafNode(otherlv_0, grammarAccess.getNextAccess().getXKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1310:1: ( (lv_bound_1_0= ruleTimeBound ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_COMPARATOR||LA25_0==16||LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1311:1: (lv_bound_1_0= ruleTimeBound )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1311:1: (lv_bound_1_0= ruleTimeBound )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1312:3: lv_bound_1_0= ruleTimeBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getNextAccess().getBoundTimeBoundParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeBound_in_ruleNext3057);
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

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1328:3: ( (lv_value_2_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1329:1: (lv_value_2_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1329:1: (lv_value_2_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1330:3: lv_value_2_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getNextAccess().getValueStateFormulaParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleNext3079);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1354:1: entryRuleFuture returns [EObject current=null] : iv_ruleFuture= ruleFuture EOF ;
    public final EObject entryRuleFuture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuture = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1355:2: (iv_ruleFuture= ruleFuture EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1356:2: iv_ruleFuture= ruleFuture EOF
            {
             newCompositeNode(grammarAccess.getFutureRule()); 
            pushFollow(FOLLOW_ruleFuture_in_entryRuleFuture3115);
            iv_ruleFuture=ruleFuture();

            state._fsp--;

             current =iv_ruleFuture; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuture3125); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1363:1: ruleFuture returns [EObject current=null] : (otherlv_0= 'F' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) ) ;
    public final EObject ruleFuture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1366:28: ( (otherlv_0= 'F' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1367:1: (otherlv_0= 'F' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1367:1: (otherlv_0= 'F' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1367:3: otherlv_0= 'F' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleFuture3162); 

                	newLeafNode(otherlv_0, grammarAccess.getFutureAccess().getFKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1371:1: ( (lv_bound_1_0= ruleTimeBound ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_COMPARATOR||LA26_0==16||LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1372:1: (lv_bound_1_0= ruleTimeBound )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1372:1: (lv_bound_1_0= ruleTimeBound )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1373:3: lv_bound_1_0= ruleTimeBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getFutureAccess().getBoundTimeBoundParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeBound_in_ruleFuture3183);
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

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1389:3: ( (lv_value_2_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1390:1: (lv_value_2_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1390:1: (lv_value_2_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1391:3: lv_value_2_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getFutureAccess().getValueStateFormulaParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleFuture3205);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1415:1: entryRuleGlobally returns [EObject current=null] : iv_ruleGlobally= ruleGlobally EOF ;
    public final EObject entryRuleGlobally() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobally = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1416:2: (iv_ruleGlobally= ruleGlobally EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1417:2: iv_ruleGlobally= ruleGlobally EOF
            {
             newCompositeNode(grammarAccess.getGloballyRule()); 
            pushFollow(FOLLOW_ruleGlobally_in_entryRuleGlobally3241);
            iv_ruleGlobally=ruleGlobally();

            state._fsp--;

             current =iv_ruleGlobally; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobally3251); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1424:1: ruleGlobally returns [EObject current=null] : (otherlv_0= 'G' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) ) ;
    public final EObject ruleGlobally() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_bound_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1427:28: ( (otherlv_0= 'G' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1428:1: (otherlv_0= 'G' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1428:1: (otherlv_0= 'G' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1428:3: otherlv_0= 'G' ( (lv_bound_1_0= ruleTimeBound ) )? ( (lv_value_2_0= ruleStateFormula ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleGlobally3288); 

                	newLeafNode(otherlv_0, grammarAccess.getGloballyAccess().getGKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1432:1: ( (lv_bound_1_0= ruleTimeBound ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_COMPARATOR||LA27_0==16||LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1433:1: (lv_bound_1_0= ruleTimeBound )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1433:1: (lv_bound_1_0= ruleTimeBound )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1434:3: lv_bound_1_0= ruleTimeBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getGloballyAccess().getBoundTimeBoundParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTimeBound_in_ruleGlobally3309);
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

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1450:3: ( (lv_value_2_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1451:1: (lv_value_2_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1451:1: (lv_value_2_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1452:3: lv_value_2_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getGloballyAccess().getValueStateFormulaParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleGlobally3331);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1476:1: entryRuleCompareProbability returns [EObject current=null] : iv_ruleCompareProbability= ruleCompareProbability EOF ;
    public final EObject entryRuleCompareProbability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareProbability = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
        	
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1480:2: (iv_ruleCompareProbability= ruleCompareProbability EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1481:2: iv_ruleCompareProbability= ruleCompareProbability EOF
            {
             newCompositeNode(grammarAccess.getCompareProbabilityRule()); 
            pushFollow(FOLLOW_ruleCompareProbability_in_entryRuleCompareProbability3373);
            iv_ruleCompareProbability=ruleCompareProbability();

            state._fsp--;

             current =iv_ruleCompareProbability; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareProbability3383); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1491:1: ruleCompareProbability returns [EObject current=null] : ( ( (lv_operator_0_0= RULE_COMPARATOR ) ) ( (lv_value_1_0= RULE_DOUBLE ) ) ) ;
    public final EObject ruleCompareProbability() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1495:28: ( ( ( (lv_operator_0_0= RULE_COMPARATOR ) ) ( (lv_value_1_0= RULE_DOUBLE ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1496:1: ( ( (lv_operator_0_0= RULE_COMPARATOR ) ) ( (lv_value_1_0= RULE_DOUBLE ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1496:1: ( ( (lv_operator_0_0= RULE_COMPARATOR ) ) ( (lv_value_1_0= RULE_DOUBLE ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1496:2: ( (lv_operator_0_0= RULE_COMPARATOR ) ) ( (lv_value_1_0= RULE_DOUBLE ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1496:2: ( (lv_operator_0_0= RULE_COMPARATOR ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1497:1: (lv_operator_0_0= RULE_COMPARATOR )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1497:1: (lv_operator_0_0= RULE_COMPARATOR )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1498:3: lv_operator_0_0= RULE_COMPARATOR
            {
            lv_operator_0_0=(Token)match(input,RULE_COMPARATOR,FOLLOW_RULE_COMPARATOR_in_ruleCompareProbability3429); 

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

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1514:2: ( (lv_value_1_0= RULE_DOUBLE ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1515:1: (lv_value_1_0= RULE_DOUBLE )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1515:1: (lv_value_1_0= RULE_DOUBLE )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1516:3: lv_value_1_0= RULE_DOUBLE
            {
            lv_value_1_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleCompareProbability3451); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1543:1: entryRuleTimeBound returns [EObject current=null] : iv_ruleTimeBound= ruleTimeBound EOF ;
    public final EObject entryRuleTimeBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeBound = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
        	
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1547:2: (iv_ruleTimeBound= ruleTimeBound EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1548:2: iv_ruleTimeBound= ruleTimeBound EOF
            {
             newCompositeNode(grammarAccess.getTimeBoundRule()); 
            pushFollow(FOLLOW_ruleTimeBound_in_entryRuleTimeBound3502);
            iv_ruleTimeBound=ruleTimeBound();

            state._fsp--;

             current =iv_ruleTimeBound; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeBound3512); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1558:1: ruleTimeBound returns [EObject current=null] : ( ( ( ( (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' ) ) ) ( (lv_value_1_0= RULE_DOUBLE ) ) ) | (otherlv_2= '[' ( (lv_from_3_0= RULE_DOUBLE ) ) ( (lv_operator_4_0= ',' ) ) ( (lv_to_5_0= RULE_DOUBLE ) ) otherlv_6= ']' ) ) ;
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
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1562:28: ( ( ( ( ( (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' ) ) ) ( (lv_value_1_0= RULE_DOUBLE ) ) ) | (otherlv_2= '[' ( (lv_from_3_0= RULE_DOUBLE ) ) ( (lv_operator_4_0= ',' ) ) ( (lv_to_5_0= RULE_DOUBLE ) ) otherlv_6= ']' ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1563:1: ( ( ( ( (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' ) ) ) ( (lv_value_1_0= RULE_DOUBLE ) ) ) | (otherlv_2= '[' ( (lv_from_3_0= RULE_DOUBLE ) ) ( (lv_operator_4_0= ',' ) ) ( (lv_to_5_0= RULE_DOUBLE ) ) otherlv_6= ']' ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1563:1: ( ( ( ( (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' ) ) ) ( (lv_value_1_0= RULE_DOUBLE ) ) ) | (otherlv_2= '[' ( (lv_from_3_0= RULE_DOUBLE ) ) ( (lv_operator_4_0= ',' ) ) ( (lv_to_5_0= RULE_DOUBLE ) ) otherlv_6= ']' ) )
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1563:2: ( ( ( (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' ) ) ) ( (lv_value_1_0= RULE_DOUBLE ) ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1563:2: ( ( ( (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' ) ) ) ( (lv_value_1_0= RULE_DOUBLE ) ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1563:3: ( ( (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' ) ) ) ( (lv_value_1_0= RULE_DOUBLE ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1563:3: ( ( (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' ) ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1564:1: ( (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1564:1: ( (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1565:1: (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1565:1: (lv_operator_0_1= RULE_COMPARATOR | lv_operator_0_2= '=' )
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
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1566:3: lv_operator_0_1= RULE_COMPARATOR
                            {
                            lv_operator_0_1=(Token)match(input,RULE_COMPARATOR,FOLLOW_RULE_COMPARATOR_in_ruleTimeBound3561); 

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
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1581:8: lv_operator_0_2= '='
                            {
                            lv_operator_0_2=(Token)match(input,33,FOLLOW_33_in_ruleTimeBound3582); 

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

                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1596:2: ( (lv_value_1_0= RULE_DOUBLE ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1597:1: (lv_value_1_0= RULE_DOUBLE )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1597:1: (lv_value_1_0= RULE_DOUBLE )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1598:3: lv_value_1_0= RULE_DOUBLE
                    {
                    lv_value_1_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleTimeBound3615); 

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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1615:6: (otherlv_2= '[' ( (lv_from_3_0= RULE_DOUBLE ) ) ( (lv_operator_4_0= ',' ) ) ( (lv_to_5_0= RULE_DOUBLE ) ) otherlv_6= ']' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1615:6: (otherlv_2= '[' ( (lv_from_3_0= RULE_DOUBLE ) ) ( (lv_operator_4_0= ',' ) ) ( (lv_to_5_0= RULE_DOUBLE ) ) otherlv_6= ']' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1615:8: otherlv_2= '[' ( (lv_from_3_0= RULE_DOUBLE ) ) ( (lv_operator_4_0= ',' ) ) ( (lv_to_5_0= RULE_DOUBLE ) ) otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleTimeBound3640); 

                        	newLeafNode(otherlv_2, grammarAccess.getTimeBoundAccess().getLeftSquareBracketKeyword_1_0());
                        
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1619:1: ( (lv_from_3_0= RULE_DOUBLE ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1620:1: (lv_from_3_0= RULE_DOUBLE )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1620:1: (lv_from_3_0= RULE_DOUBLE )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1621:3: lv_from_3_0= RULE_DOUBLE
                    {
                    lv_from_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleTimeBound3657); 

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

                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1637:2: ( (lv_operator_4_0= ',' ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1638:1: (lv_operator_4_0= ',' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1638:1: (lv_operator_4_0= ',' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1639:3: lv_operator_4_0= ','
                    {
                    lv_operator_4_0=(Token)match(input,34,FOLLOW_34_in_ruleTimeBound3680); 

                            newLeafNode(lv_operator_4_0, grammarAccess.getTimeBoundAccess().getOperatorCommaKeyword_1_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTimeBoundRule());
                    	        }
                           		setWithLastConsumed(current, "operator", lv_operator_4_0, ",");
                    	    

                    }


                    }

                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1652:2: ( (lv_to_5_0= RULE_DOUBLE ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1653:1: (lv_to_5_0= RULE_DOUBLE )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1653:1: (lv_to_5_0= RULE_DOUBLE )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1654:3: lv_to_5_0= RULE_DOUBLE
                    {
                    lv_to_5_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleTimeBound3710); 

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

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleTimeBound3727); 

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
            return "211:1: (this_BooleanRule_0= ruleBooleanRule | this_SteadyState_1= ruleSteadyState | this_QuantifiedProbability_2= ruleQuantifiedProbability )";
        }
    }
 

    public static final BitSet FOLLOW_ruleStart_in_entryRuleStart75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStart85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFragment_in_ruleStart140 = new BitSet(new long[]{0x00000000062C4052L});
    public static final BitSet FOLLOW_ruleFragment_in_entryRuleFragment177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFragment187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleFragment234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_ruleFragment261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleComment347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanRule_in_ruleRule454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSteadyState_in_ruleRule481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedProbability_in_ruleRule508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSteadyState_in_entryRuleSteadyState547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSteadyState557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSteadyState594 = new BitSet(new long[]{0x0000000000008090L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleSteadyState606 = new BitSet(new long[]{0x0000000000008090L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_ruleSteadyState629 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_15_in_ruleSteadyState647 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleSteadyState660 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleSteadyState673 = new BitSet(new long[]{0x00000000062C0050L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleSteadyState685 = new BitSet(new long[]{0x00000000062C0050L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleSteadyState707 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleSteadyState719 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_17_in_ruleSteadyState732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedProbability_in_entryRuleQuantifiedProbability768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifiedProbability778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleQuantifiedProbability815 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleQuantifiedProbability827 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleQuantifiedProbability840 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleQuantifiedProbability852 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleQuantifiedProbability865 = new BitSet(new long[]{0x00000001C62C0040L});
    public static final BitSet FOLLOW_rulePathFormula_in_ruleQuantifiedProbability886 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQuantifiedProbability898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanRule_in_entryRuleBooleanRule934 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanRule944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleBooleanRule989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_entryRuleStateFormula1024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateFormula1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleStateFormula1072 = new BitSet(new long[]{0x00000000062C0050L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleStateFormula1084 = new BitSet(new long[]{0x00000000062C0050L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleStateFormula1106 = new BitSet(new long[]{0x0000000001D00010L});
    public static final BitSet FOLLOW_ruleJunction_in_ruleStateFormula1128 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleStateFormula1155 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleStateFormula1169 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_20_in_ruleStateFormula1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleStateFormula1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_ruleStateFormula1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbability_in_ruleStateFormula1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation1289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleNegation1336 = new BitSet(new long[]{0x00000000062C0040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleNegation1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJunction_in_entryRuleJunction1399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJunction1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleJunction1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleJunction1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction1526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleConjunction1573 = new BitSet(new long[]{0x00000000062C0040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleConjunction1595 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleConjunction1616 = new BitSet(new long[]{0x00000000062C0040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleConjunction1637 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction1675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleDisjunction1722 = new BitSet(new long[]{0x00000000062C0040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleDisjunction1744 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleDisjunction1765 = new BitSet(new long[]{0x00000000062C0040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleDisjunction1786 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication1830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleImplication1881 = new BitSet(new long[]{0x00000000062C0040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleImplication1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbability_in_entryRuleProbability1942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProbability1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleProbability1989 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleProbability2001 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_ruleProbability2032 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleProbability2044 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleProbability2057 = new BitSet(new long[]{0x00000001C62C0040L});
    public static final BitSet FOLLOW_rulePathFormula_in_ruleProbability2078 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleProbability2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic2126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_ruleAtomic2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleAtomic2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleAtomic2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState2272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleState2319 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleState2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel2377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLabel2424 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabel2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean2482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolean2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathFormula_in_entryRulePathFormula2579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathFormula2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNext_in_rulePathFormula2640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUntil_in_rulePathFormula2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuture_in_rulePathFormula2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobally_in_rulePathFormula2721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUntil_in_entryRuleUntil2760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUntil2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleUntil2816 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_27_in_ruleUntil2836 = new BitSet(new long[]{0x00000002062D00C0L});
    public static final BitSet FOLLOW_28_in_ruleUntil2865 = new BitSet(new long[]{0x00000002062D00C0L});
    public static final BitSet FOLLOW_29_in_ruleUntil2894 = new BitSet(new long[]{0x00000002062D00C0L});
    public static final BitSet FOLLOW_ruleTimeBound_in_ruleUntil2931 = new BitSet(new long[]{0x00000000062C0040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleUntil2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNext_in_entryRuleNext2989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNext2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleNext3036 = new BitSet(new long[]{0x00000002062D00C0L});
    public static final BitSet FOLLOW_ruleTimeBound_in_ruleNext3057 = new BitSet(new long[]{0x00000000062C0040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleNext3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuture_in_entryRuleFuture3115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuture3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleFuture3162 = new BitSet(new long[]{0x00000002062D00C0L});
    public static final BitSet FOLLOW_ruleTimeBound_in_ruleFuture3183 = new BitSet(new long[]{0x00000000062C0040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleFuture3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobally_in_entryRuleGlobally3241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobally3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleGlobally3288 = new BitSet(new long[]{0x00000002062D00C0L});
    public static final BitSet FOLLOW_ruleTimeBound_in_ruleGlobally3309 = new BitSet(new long[]{0x00000000062C0040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleGlobally3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_entryRuleCompareProbability3373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareProbability3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMPARATOR_in_ruleCompareProbability3429 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleCompareProbability3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_entryRuleTimeBound3502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeBound3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMPARATOR_in_ruleTimeBound3561 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_33_in_ruleTimeBound3582 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleTimeBound3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTimeBound3640 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleTimeBound3657 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleTimeBound3680 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleTimeBound3710 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTimeBound3727 = new BitSet(new long[]{0x0000000000000002L});

}