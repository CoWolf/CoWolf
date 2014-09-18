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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:76:1: ruleStart returns [EObject current=null] : ( (lv_start_0_0= ruleRules ) )? ;
    public final EObject ruleStart() throws RecognitionException {
        EObject current = null;

        EObject lv_start_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:79:28: ( ( (lv_start_0_0= ruleRules ) )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:80:1: ( (lv_start_0_0= ruleRules ) )?
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:80:1: ( (lv_start_0_0= ruleRules ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_SL_COMMENT||LA1_0==RULE_BOOL||(LA1_0>=13 && LA1_0<=15)||LA1_0==18||LA1_0==20||LA1_0==24) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:81:1: (lv_start_0_0= ruleRules )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:81:1: (lv_start_0_0= ruleRules )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:82:3: lv_start_0_0= ruleRules
                    {
                     
                    	        newCompositeNode(grammarAccess.getStartAccess().getStartRulesParserRuleCall_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRules_in_ruleStart130);
                    lv_start_0_0=ruleRules();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStartRule());
                    	        }
                           		set(
                           			current, 
                           			"start",
                            		lv_start_0_0, 
                            		"Rules");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleStart"


    // $ANTLR start "entryRuleRules"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:106:1: entryRuleRules returns [EObject current=null] : iv_ruleRules= ruleRules EOF ;
    public final EObject entryRuleRules() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRules = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:107:2: (iv_ruleRules= ruleRules EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:108:2: iv_ruleRules= ruleRules EOF
            {
             newCompositeNode(grammarAccess.getRulesRule()); 
            pushFollow(FOLLOW_ruleRules_in_entryRuleRules166);
            iv_ruleRules=ruleRules();

            state._fsp--;

             current =iv_ruleRules; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRules176); 

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
    // $ANTLR end "entryRuleRules"


    // $ANTLR start "ruleRules"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:115:1: ruleRules returns [EObject current=null] : ( ( (lv_rule_0_0= ruleCommentedRule ) ) ( (lv_rule_1_0= ruleRules ) )? ) ;
    public final EObject ruleRules() throws RecognitionException {
        EObject current = null;

        EObject lv_rule_0_0 = null;

        EObject lv_rule_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:118:28: ( ( ( (lv_rule_0_0= ruleCommentedRule ) ) ( (lv_rule_1_0= ruleRules ) )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:119:1: ( ( (lv_rule_0_0= ruleCommentedRule ) ) ( (lv_rule_1_0= ruleRules ) )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:119:1: ( ( (lv_rule_0_0= ruleCommentedRule ) ) ( (lv_rule_1_0= ruleRules ) )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:119:2: ( (lv_rule_0_0= ruleCommentedRule ) ) ( (lv_rule_1_0= ruleRules ) )?
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:119:2: ( (lv_rule_0_0= ruleCommentedRule ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:120:1: (lv_rule_0_0= ruleCommentedRule )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:120:1: (lv_rule_0_0= ruleCommentedRule )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:121:3: lv_rule_0_0= ruleCommentedRule
            {
             
            	        newCompositeNode(grammarAccess.getRulesAccess().getRuleCommentedRuleParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleCommentedRule_in_ruleRules222);
            lv_rule_0_0=ruleCommentedRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRulesRule());
            	        }
                   		add(
                   			current, 
                   			"rule",
                    		lv_rule_0_0, 
                    		"CommentedRule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:137:2: ( (lv_rule_1_0= ruleRules ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_SL_COMMENT||LA2_0==RULE_BOOL||(LA2_0>=13 && LA2_0<=15)||LA2_0==18||LA2_0==20||LA2_0==24) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:138:1: (lv_rule_1_0= ruleRules )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:138:1: (lv_rule_1_0= ruleRules )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:139:3: lv_rule_1_0= ruleRules
                    {
                     
                    	        newCompositeNode(grammarAccess.getRulesAccess().getRuleRulesParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRules_in_ruleRules243);
                    lv_rule_1_0=ruleRules();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRulesRule());
                    	        }
                           		add(
                           			current, 
                           			"rule",
                            		lv_rule_1_0, 
                            		"Rules");
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
    // $ANTLR end "ruleRules"


    // $ANTLR start "entryRuleCommentedRule"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:163:1: entryRuleCommentedRule returns [EObject current=null] : iv_ruleCommentedRule= ruleCommentedRule EOF ;
    public final EObject entryRuleCommentedRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommentedRule = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:164:2: (iv_ruleCommentedRule= ruleCommentedRule EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:165:2: iv_ruleCommentedRule= ruleCommentedRule EOF
            {
             newCompositeNode(grammarAccess.getCommentedRuleRule()); 
            pushFollow(FOLLOW_ruleCommentedRule_in_entryRuleCommentedRule280);
            iv_ruleCommentedRule=ruleCommentedRule();

            state._fsp--;

             current =iv_ruleCommentedRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentedRule290); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:172:1: ruleCommentedRule returns [EObject current=null] : ( ( (lv_comment_0_0= RULE_SL_COMMENT ) )? ( (lv_rule_1_0= rulePctl ) ) ) ;
    public final EObject ruleCommentedRule() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;
        EObject lv_rule_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:175:28: ( ( ( (lv_comment_0_0= RULE_SL_COMMENT ) )? ( (lv_rule_1_0= rulePctl ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:176:1: ( ( (lv_comment_0_0= RULE_SL_COMMENT ) )? ( (lv_rule_1_0= rulePctl ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:176:1: ( ( (lv_comment_0_0= RULE_SL_COMMENT ) )? ( (lv_rule_1_0= rulePctl ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:176:2: ( (lv_comment_0_0= RULE_SL_COMMENT ) )? ( (lv_rule_1_0= rulePctl ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:176:2: ( (lv_comment_0_0= RULE_SL_COMMENT ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_SL_COMMENT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:177:1: (lv_comment_0_0= RULE_SL_COMMENT )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:177:1: (lv_comment_0_0= RULE_SL_COMMENT )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:178:3: lv_comment_0_0= RULE_SL_COMMENT
                    {
                    lv_comment_0_0=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleCommentedRule332); 

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

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:194:3: ( (lv_rule_1_0= rulePctl ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:195:1: (lv_rule_1_0= rulePctl )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:195:1: (lv_rule_1_0= rulePctl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:196:3: lv_rule_1_0= rulePctl
            {
             
            	        newCompositeNode(grammarAccess.getCommentedRuleAccess().getRulePctlParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePctl_in_ruleCommentedRule359);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:220:1: entryRulePctl returns [EObject current=null] : iv_rulePctl= rulePctl EOF ;
    public final EObject entryRulePctl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePctl = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:221:2: (iv_rulePctl= rulePctl EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:222:2: iv_rulePctl= rulePctl EOF
            {
             newCompositeNode(grammarAccess.getPctlRule()); 
            pushFollow(FOLLOW_rulePctl_in_entryRulePctl395);
            iv_rulePctl=rulePctl();

            state._fsp--;

             current =iv_rulePctl; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePctl405); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:229:1: rulePctl returns [EObject current=null] : (this_StateFormula_0= ruleStateFormula | this_SteadyState_1= ruleSteadyState | this_QuantifiedProbability_2= ruleQuantifiedProbability ) ;
    public final EObject rulePctl() throws RecognitionException {
        EObject current = null;

        EObject this_StateFormula_0 = null;

        EObject this_SteadyState_1 = null;

        EObject this_QuantifiedProbability_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:232:28: ( (this_StateFormula_0= ruleStateFormula | this_SteadyState_1= ruleSteadyState | this_QuantifiedProbability_2= ruleQuantifiedProbability ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:233:1: (this_StateFormula_0= ruleStateFormula | this_SteadyState_1= ruleSteadyState | this_QuantifiedProbability_2= ruleQuantifiedProbability )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:233:1: (this_StateFormula_0= ruleStateFormula | this_SteadyState_1= ruleSteadyState | this_QuantifiedProbability_2= ruleQuantifiedProbability )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
            case 13:
            case 14:
            case 15:
            case 18:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==32||LA4_2==34) ) {
                    alt4=1;
                }
                else if ( (LA4_2==21) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:234:5: this_StateFormula_0= ruleStateFormula
                    {
                     
                            newCompositeNode(grammarAccess.getPctlAccess().getStateFormulaParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStateFormula_in_rulePctl452);
                    this_StateFormula_0=ruleStateFormula();

                    state._fsp--;

                     
                            current = this_StateFormula_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:244:5: this_SteadyState_1= ruleSteadyState
                    {
                     
                            newCompositeNode(grammarAccess.getPctlAccess().getSteadyStateParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSteadyState_in_rulePctl479);
                    this_SteadyState_1=ruleSteadyState();

                    state._fsp--;

                     
                            current = this_SteadyState_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:254:5: this_QuantifiedProbability_2= ruleQuantifiedProbability
                    {
                     
                            newCompositeNode(grammarAccess.getPctlAccess().getQuantifiedProbabilityParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleQuantifiedProbability_in_rulePctl506);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:270:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:271:2: (iv_ruleState= ruleState EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:272:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState541);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState551); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:279:1: ruleState returns [EObject current=null] : (otherlv_0= 'State:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:282:28: ( (otherlv_0= 'State:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:283:1: (otherlv_0= 'State:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:283:1: (otherlv_0= 'State:' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:283:3: otherlv_0= 'State:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleState588); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:287:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:288:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:288:1: (lv_name_1_0= RULE_ID )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:289:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState605); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:313:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:314:2: (iv_ruleLabel= ruleLabel EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:315:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel646);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel656); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:322:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'Label:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:325:28: ( (otherlv_0= 'Label:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:326:1: (otherlv_0= 'Label:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:326:1: (otherlv_0= 'Label:' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:326:3: otherlv_0= 'Label:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleLabel693); 

                	newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:330:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:331:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:331:1: (lv_name_1_0= RULE_ID )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:332:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel710); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:356:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:357:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:358:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic751);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic761); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:365:1: ruleAtomic returns [EObject current=null] : (this_State_0= ruleState | this_Label_1= ruleLabel | this_BOOL_2= RULE_BOOL ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token this_BOOL_2=null;
        EObject this_State_0 = null;

        EObject this_Label_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:368:28: ( (this_State_0= ruleState | this_Label_1= ruleLabel | this_BOOL_2= RULE_BOOL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:369:1: (this_State_0= ruleState | this_Label_1= ruleLabel | this_BOOL_2= RULE_BOOL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:369:1: (this_State_0= ruleState | this_Label_1= ruleLabel | this_BOOL_2= RULE_BOOL )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case RULE_BOOL:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:370:5: this_State_0= ruleState
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicAccess().getStateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleState_in_ruleAtomic808);
                    this_State_0=ruleState();

                    state._fsp--;

                     
                            current = this_State_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:380:5: this_Label_1= ruleLabel
                    {
                     
                            newCompositeNode(grammarAccess.getAtomicAccess().getLabelParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLabel_in_ruleAtomic835);
                    this_Label_1=ruleLabel();

                    state._fsp--;

                     
                            current = this_Label_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:389:6: this_BOOL_2= RULE_BOOL
                    {
                    this_BOOL_2=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleAtomic851); 
                     
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:401:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:402:2: (iv_ruleNegation= ruleNegation EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:403:2: iv_ruleNegation= ruleNegation EOF
            {
             newCompositeNode(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation886);
            iv_ruleNegation=ruleNegation();

            state._fsp--;

             current =iv_ruleNegation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation896); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:410:1: ruleNegation returns [EObject current=null] : (otherlv_0= '!' this_StateFormula_1= ruleStateFormula ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_StateFormula_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:413:28: ( (otherlv_0= '!' this_StateFormula_1= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:414:1: (otherlv_0= '!' this_StateFormula_1= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:414:1: (otherlv_0= '!' this_StateFormula_1= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:414:3: otherlv_0= '!' this_StateFormula_1= ruleStateFormula
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleNegation933); 

                	newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getExclamationMarkKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getNegationAccess().getStateFormulaParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleStateFormula_in_ruleNegation955);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:435:1: entryRuleJunction returns [EObject current=null] : iv_ruleJunction= ruleJunction EOF ;
    public final EObject entryRuleJunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJunction = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:436:2: (iv_ruleJunction= ruleJunction EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:437:2: iv_ruleJunction= ruleJunction EOF
            {
             newCompositeNode(grammarAccess.getJunctionRule()); 
            pushFollow(FOLLOW_ruleJunction_in_entryRuleJunction990);
            iv_ruleJunction=ruleJunction();

            state._fsp--;

             current =iv_ruleJunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJunction1000); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:444:1: ruleJunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction | this_Disjunction_1= ruleDisjunction ) ;
    public final EObject ruleJunction() throws RecognitionException {
        EObject current = null;

        EObject this_Conjunction_0 = null;

        EObject this_Disjunction_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:447:28: ( (this_Conjunction_0= ruleConjunction | this_Disjunction_1= ruleDisjunction ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:448:1: (this_Conjunction_0= ruleConjunction | this_Disjunction_1= ruleDisjunction )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:448:1: (this_Conjunction_0= ruleConjunction | this_Disjunction_1= ruleDisjunction )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:449:5: this_Conjunction_0= ruleConjunction
                    {
                     
                            newCompositeNode(grammarAccess.getJunctionAccess().getConjunctionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConjunction_in_ruleJunction1047);
                    this_Conjunction_0=ruleConjunction();

                    state._fsp--;

                     
                            current = this_Conjunction_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:459:5: this_Disjunction_1= ruleDisjunction
                    {
                     
                            newCompositeNode(grammarAccess.getJunctionAccess().getDisjunctionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleDisjunction_in_ruleJunction1074);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:475:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:476:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:477:2: iv_ruleConjunction= ruleConjunction EOF
            {
             newCompositeNode(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction1109);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;

             current =iv_ruleConjunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction1119); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:484:1: ruleConjunction returns [EObject current=null] : (otherlv_0= '&' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_StateFormula_1 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:487:28: ( (otherlv_0= '&' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:488:1: (otherlv_0= '&' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:488:1: (otherlv_0= '&' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:488:3: otherlv_0= '&' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleConjunction1156); 

                	newLeafNode(otherlv_0, grammarAccess.getConjunctionAccess().getAmpersandKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getConjunctionAccess().getStateFormulaParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleStateFormula_in_ruleConjunction1178);
            this_StateFormula_1=ruleStateFormula();

            state._fsp--;

             
                    current = this_StateFormula_1; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:501:1: ( () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:501:2: () otherlv_3= '&' ( (lv_right_4_0= ruleStateFormula ) )
            	    {
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:501:2: ()
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:502:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getConjunctionAccess().getConjunctionLeftAction_2_0(),
            	                current);
            	        

            	    }

            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleConjunction1199); 

            	        	newLeafNode(otherlv_3, grammarAccess.getConjunctionAccess().getAmpersandKeyword_2_1());
            	        
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:511:1: ( (lv_right_4_0= ruleStateFormula ) )
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:512:1: (lv_right_4_0= ruleStateFormula )
            	    {
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:512:1: (lv_right_4_0= ruleStateFormula )
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:513:3: lv_right_4_0= ruleStateFormula
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStateFormula_in_ruleConjunction1220);
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
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleDisjunction"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:537:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:538:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:539:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
             newCompositeNode(grammarAccess.getDisjunctionRule()); 
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction1258);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;

             current =iv_ruleDisjunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction1268); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:546:1: ruleDisjunction returns [EObject current=null] : (otherlv_0= '|' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )* ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject this_StateFormula_1 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:549:28: ( (otherlv_0= '|' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:550:1: (otherlv_0= '|' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:550:1: (otherlv_0= '|' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:550:3: otherlv_0= '|' this_StateFormula_1= ruleStateFormula ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )*
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleDisjunction1305); 

                	newLeafNode(otherlv_0, grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getDisjunctionAccess().getStateFormulaParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleStateFormula_in_ruleDisjunction1327);
            this_StateFormula_1=ruleStateFormula();

            state._fsp--;

             
                    current = this_StateFormula_1; 
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:563:1: ( () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:563:2: () otherlv_3= '|' ( (lv_right_4_0= ruleStateFormula ) )
            	    {
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:563:2: ()
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:564:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_2_0(),
            	                current);
            	        

            	    }

            	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleDisjunction1348); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_2_1());
            	        
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:573:1: ( (lv_right_4_0= ruleStateFormula ) )
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:574:1: (lv_right_4_0= ruleStateFormula )
            	    {
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:574:1: (lv_right_4_0= ruleStateFormula )
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:575:3: lv_right_4_0= ruleStateFormula
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStateFormula_in_ruleDisjunction1369);
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
            	    break loop8;
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:599:1: entryRuleStateFormula returns [EObject current=null] : iv_ruleStateFormula= ruleStateFormula EOF ;
    public final EObject entryRuleStateFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateFormula = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:600:2: (iv_ruleStateFormula= ruleStateFormula EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:601:2: iv_ruleStateFormula= ruleStateFormula EOF
            {
             newCompositeNode(grammarAccess.getStateFormulaRule()); 
            pushFollow(FOLLOW_ruleStateFormula_in_entryRuleStateFormula1407);
            iv_ruleStateFormula=ruleStateFormula();

            state._fsp--;

             current =iv_ruleStateFormula; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateFormula1417); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:608:1: ruleStateFormula returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_left_1_0= ruleStateFormula ) ) ( ( (lv_right_2_0= ruleJunction ) ) | ( (lv_right_3_0= ruleImplication ) ) )? otherlv_4= ')' ) | this_Negation_5= ruleNegation | this_Atomic_6= ruleAtomic | ( (lv_left_7_0= ruleProbability ) ) ) ;
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
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:611:28: ( ( (otherlv_0= '(' ( (lv_left_1_0= ruleStateFormula ) ) ( ( (lv_right_2_0= ruleJunction ) ) | ( (lv_right_3_0= ruleImplication ) ) )? otherlv_4= ')' ) | this_Negation_5= ruleNegation | this_Atomic_6= ruleAtomic | ( (lv_left_7_0= ruleProbability ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:612:1: ( (otherlv_0= '(' ( (lv_left_1_0= ruleStateFormula ) ) ( ( (lv_right_2_0= ruleJunction ) ) | ( (lv_right_3_0= ruleImplication ) ) )? otherlv_4= ')' ) | this_Negation_5= ruleNegation | this_Atomic_6= ruleAtomic | ( (lv_left_7_0= ruleProbability ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:612:1: ( (otherlv_0= '(' ( (lv_left_1_0= ruleStateFormula ) ) ( ( (lv_right_2_0= ruleJunction ) ) | ( (lv_right_3_0= ruleImplication ) ) )? otherlv_4= ')' ) | this_Negation_5= ruleNegation | this_Atomic_6= ruleAtomic | ( (lv_left_7_0= ruleProbability ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt10=1;
                }
                break;
            case 15:
                {
                alt10=2;
                }
                break;
            case RULE_BOOL:
            case 13:
            case 14:
                {
                alt10=3;
                }
                break;
            case 24:
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:612:2: (otherlv_0= '(' ( (lv_left_1_0= ruleStateFormula ) ) ( ( (lv_right_2_0= ruleJunction ) ) | ( (lv_right_3_0= ruleImplication ) ) )? otherlv_4= ')' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:612:2: (otherlv_0= '(' ( (lv_left_1_0= ruleStateFormula ) ) ( ( (lv_right_2_0= ruleJunction ) ) | ( (lv_right_3_0= ruleImplication ) ) )? otherlv_4= ')' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:612:4: otherlv_0= '(' ( (lv_left_1_0= ruleStateFormula ) ) ( ( (lv_right_2_0= ruleJunction ) ) | ( (lv_right_3_0= ruleImplication ) ) )? otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleStateFormula1455); 

                        	newLeafNode(otherlv_0, grammarAccess.getStateFormulaAccess().getLeftParenthesisKeyword_0_0());
                        
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:616:1: ( (lv_left_1_0= ruleStateFormula ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:617:1: (lv_left_1_0= ruleStateFormula )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:617:1: (lv_left_1_0= ruleStateFormula )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:618:3: lv_left_1_0= ruleStateFormula
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFormulaAccess().getLeftStateFormulaParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStateFormula_in_ruleStateFormula1476);
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

                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:634:2: ( ( (lv_right_2_0= ruleJunction ) ) | ( (lv_right_3_0= ruleImplication ) ) )?
                    int alt9=3;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0>=16 && LA9_0<=17)) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==31) ) {
                        alt9=2;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:634:3: ( (lv_right_2_0= ruleJunction ) )
                            {
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:634:3: ( (lv_right_2_0= ruleJunction ) )
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:635:1: (lv_right_2_0= ruleJunction )
                            {
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:635:1: (lv_right_2_0= ruleJunction )
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:636:3: lv_right_2_0= ruleJunction
                            {
                             
                            	        newCompositeNode(grammarAccess.getStateFormulaAccess().getRightJunctionParserRuleCall_0_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleJunction_in_ruleStateFormula1498);
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
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:653:6: ( (lv_right_3_0= ruleImplication ) )
                            {
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:653:6: ( (lv_right_3_0= ruleImplication ) )
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:654:1: (lv_right_3_0= ruleImplication )
                            {
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:654:1: (lv_right_3_0= ruleImplication )
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:655:3: lv_right_3_0= ruleImplication
                            {
                             
                            	        newCompositeNode(grammarAccess.getStateFormulaAccess().getRightImplicationParserRuleCall_0_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleImplication_in_ruleStateFormula1525);
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

                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleStateFormula1539); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateFormulaAccess().getRightParenthesisKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:677:5: this_Negation_5= ruleNegation
                    {
                     
                            newCompositeNode(grammarAccess.getStateFormulaAccess().getNegationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNegation_in_ruleStateFormula1568);
                    this_Negation_5=ruleNegation();

                    state._fsp--;

                     
                            current = this_Negation_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:687:5: this_Atomic_6= ruleAtomic
                    {
                     
                            newCompositeNode(grammarAccess.getStateFormulaAccess().getAtomicParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAtomic_in_ruleStateFormula1595);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;

                     
                            current = this_Atomic_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:696:6: ( (lv_left_7_0= ruleProbability ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:696:6: ( (lv_left_7_0= ruleProbability ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:697:1: (lv_left_7_0= ruleProbability )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:697:1: (lv_left_7_0= ruleProbability )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:698:3: lv_left_7_0= ruleProbability
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateFormulaAccess().getLeftProbabilityParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProbability_in_ruleStateFormula1621);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:722:1: entryRulePathFormula returns [EObject current=null] : iv_rulePathFormula= rulePathFormula EOF ;
    public final EObject entryRulePathFormula() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathFormula = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:723:2: (iv_rulePathFormula= rulePathFormula EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:724:2: iv_rulePathFormula= rulePathFormula EOF
            {
             newCompositeNode(grammarAccess.getPathFormulaRule()); 
            pushFollow(FOLLOW_rulePathFormula_in_entryRulePathFormula1657);
            iv_rulePathFormula=rulePathFormula();

            state._fsp--;

             current =iv_rulePathFormula; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathFormula1667); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:731:1: rulePathFormula returns [EObject current=null] : (this_Next_0= ruleNext | this_Until_1= ruleUntil | this_Future_2= ruleFuture | this_Globally_3= ruleGlobally ) ;
    public final EObject rulePathFormula() throws RecognitionException {
        EObject current = null;

        EObject this_Next_0 = null;

        EObject this_Until_1 = null;

        EObject this_Future_2 = null;

        EObject this_Globally_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:734:28: ( (this_Next_0= ruleNext | this_Until_1= ruleUntil | this_Future_2= ruleFuture | this_Globally_3= ruleGlobally ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:735:1: (this_Next_0= ruleNext | this_Until_1= ruleUntil | this_Future_2= ruleFuture | this_Globally_3= ruleGlobally )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:735:1: (this_Next_0= ruleNext | this_Until_1= ruleUntil | this_Future_2= ruleFuture | this_Globally_3= ruleGlobally )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt11=1;
                }
                break;
            case RULE_BOOL:
            case 13:
            case 14:
            case 15:
            case 18:
            case 24:
                {
                alt11=2;
                }
                break;
            case 29:
                {
                alt11=3;
                }
                break;
            case 30:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:736:5: this_Next_0= ruleNext
                    {
                     
                            newCompositeNode(grammarAccess.getPathFormulaAccess().getNextParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNext_in_rulePathFormula1714);
                    this_Next_0=ruleNext();

                    state._fsp--;

                     
                            current = this_Next_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:746:5: this_Until_1= ruleUntil
                    {
                     
                            newCompositeNode(grammarAccess.getPathFormulaAccess().getUntilParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUntil_in_rulePathFormula1741);
                    this_Until_1=ruleUntil();

                    state._fsp--;

                     
                            current = this_Until_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:756:5: this_Future_2= ruleFuture
                    {
                     
                            newCompositeNode(grammarAccess.getPathFormulaAccess().getFutureParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFuture_in_rulePathFormula1768);
                    this_Future_2=ruleFuture();

                    state._fsp--;

                     
                            current = this_Future_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:766:5: this_Globally_3= ruleGlobally
                    {
                     
                            newCompositeNode(grammarAccess.getPathFormulaAccess().getGloballyParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleGlobally_in_rulePathFormula1795);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:782:1: entryRuleSteadyState returns [EObject current=null] : iv_ruleSteadyState= ruleSteadyState EOF ;
    public final EObject entryRuleSteadyState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSteadyState = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:783:2: (iv_ruleSteadyState= ruleSteadyState EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:784:2: iv_ruleSteadyState= ruleSteadyState EOF
            {
             newCompositeNode(grammarAccess.getSteadyStateRule()); 
            pushFollow(FOLLOW_ruleSteadyState_in_entryRuleSteadyState1830);
            iv_ruleSteadyState=ruleSteadyState();

            state._fsp--;

             current =iv_ruleSteadyState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSteadyState1840); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:791:1: ruleSteadyState returns [EObject current=null] : (otherlv_0= 'S' ( ruleCompareProbability | otherlv_2= '=?' ) otherlv_3= '[' this_StateFormula_4= ruleStateFormula otherlv_5= ']' ) ;
    public final EObject ruleSteadyState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_StateFormula_4 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:794:28: ( (otherlv_0= 'S' ( ruleCompareProbability | otherlv_2= '=?' ) otherlv_3= '[' this_StateFormula_4= ruleStateFormula otherlv_5= ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:795:1: (otherlv_0= 'S' ( ruleCompareProbability | otherlv_2= '=?' ) otherlv_3= '[' this_StateFormula_4= ruleStateFormula otherlv_5= ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:795:1: (otherlv_0= 'S' ( ruleCompareProbability | otherlv_2= '=?' ) otherlv_3= '[' this_StateFormula_4= ruleStateFormula otherlv_5= ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:795:3: otherlv_0= 'S' ( ruleCompareProbability | otherlv_2= '=?' ) otherlv_3= '[' this_StateFormula_4= ruleStateFormula otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleSteadyState1877); 

                	newLeafNode(otherlv_0, grammarAccess.getSteadyStateAccess().getSKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:799:1: ( ruleCompareProbability | otherlv_2= '=?' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32||LA12_0==34) ) {
                alt12=1;
            }
            else if ( (LA12_0==21) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:800:5: ruleCompareProbability
                    {
                     
                            newCompositeNode(grammarAccess.getSteadyStateAccess().getCompareProbabilityParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleCompareProbability_in_ruleSteadyState1894);
                    ruleCompareProbability();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:808:7: otherlv_2= '=?'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleSteadyState1911); 

                        	newLeafNode(otherlv_2, grammarAccess.getSteadyStateAccess().getEqualsSignQuestionMarkKeyword_1_1());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleSteadyState1924); 

                	newLeafNode(otherlv_3, grammarAccess.getSteadyStateAccess().getLeftSquareBracketKeyword_2());
                
             
                    newCompositeNode(grammarAccess.getSteadyStateAccess().getStateFormulaParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleStateFormula_in_ruleSteadyState1946);
            this_StateFormula_4=ruleStateFormula();

            state._fsp--;

             
                    current = this_StateFormula_4; 
                    afterParserOrEnumRuleCall();
                
            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleSteadyState1957); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:837:1: entryRuleQuantifiedProbability returns [EObject current=null] : iv_ruleQuantifiedProbability= ruleQuantifiedProbability EOF ;
    public final EObject entryRuleQuantifiedProbability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantifiedProbability = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:838:2: (iv_ruleQuantifiedProbability= ruleQuantifiedProbability EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:839:2: iv_ruleQuantifiedProbability= ruleQuantifiedProbability EOF
            {
             newCompositeNode(grammarAccess.getQuantifiedProbabilityRule()); 
            pushFollow(FOLLOW_ruleQuantifiedProbability_in_entryRuleQuantifiedProbability1993);
            iv_ruleQuantifiedProbability=ruleQuantifiedProbability();

            state._fsp--;

             current =iv_ruleQuantifiedProbability; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifiedProbability2003); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:846:1: ruleQuantifiedProbability returns [EObject current=null] : ( (otherlv_0= 'P' otherlv_1= '=?' ) otherlv_2= '[' this_PathFormula_3= rulePathFormula otherlv_4= ']' ) ;
    public final EObject ruleQuantifiedProbability() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PathFormula_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:849:28: ( ( (otherlv_0= 'P' otherlv_1= '=?' ) otherlv_2= '[' this_PathFormula_3= rulePathFormula otherlv_4= ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:850:1: ( (otherlv_0= 'P' otherlv_1= '=?' ) otherlv_2= '[' this_PathFormula_3= rulePathFormula otherlv_4= ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:850:1: ( (otherlv_0= 'P' otherlv_1= '=?' ) otherlv_2= '[' this_PathFormula_3= rulePathFormula otherlv_4= ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:850:2: (otherlv_0= 'P' otherlv_1= '=?' ) otherlv_2= '[' this_PathFormula_3= rulePathFormula otherlv_4= ']'
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:850:2: (otherlv_0= 'P' otherlv_1= '=?' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:850:4: otherlv_0= 'P' otherlv_1= '=?'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleQuantifiedProbability2041); 

                	newLeafNode(otherlv_0, grammarAccess.getQuantifiedProbabilityAccess().getPKeyword_0_0());
                
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleQuantifiedProbability2053); 

                	newLeafNode(otherlv_1, grammarAccess.getQuantifiedProbabilityAccess().getEqualsSignQuestionMarkKeyword_0_1());
                

            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleQuantifiedProbability2066); 

                	newLeafNode(otherlv_2, grammarAccess.getQuantifiedProbabilityAccess().getLeftSquareBracketKeyword_1());
                
             
                    newCompositeNode(grammarAccess.getQuantifiedProbabilityAccess().getPathFormulaParserRuleCall_2()); 
                
            pushFollow(FOLLOW_rulePathFormula_in_ruleQuantifiedProbability2088);
            this_PathFormula_3=rulePathFormula();

            state._fsp--;

             
                    current = this_PathFormula_3; 
                    afterParserOrEnumRuleCall();
                
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleQuantifiedProbability2099); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:883:1: entryRuleProbability returns [EObject current=null] : iv_ruleProbability= ruleProbability EOF ;
    public final EObject entryRuleProbability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProbability = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:884:2: (iv_ruleProbability= ruleProbability EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:885:2: iv_ruleProbability= ruleProbability EOF
            {
             newCompositeNode(grammarAccess.getProbabilityRule()); 
            pushFollow(FOLLOW_ruleProbability_in_entryRuleProbability2135);
            iv_ruleProbability=ruleProbability();

            state._fsp--;

             current =iv_ruleProbability; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProbability2145); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:892:1: ruleProbability returns [EObject current=null] : (otherlv_0= 'P' ruleCompareProbability otherlv_2= '[' this_PathFormula_3= rulePathFormula otherlv_4= ']' ) ;
    public final EObject ruleProbability() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PathFormula_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:895:28: ( (otherlv_0= 'P' ruleCompareProbability otherlv_2= '[' this_PathFormula_3= rulePathFormula otherlv_4= ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:896:1: (otherlv_0= 'P' ruleCompareProbability otherlv_2= '[' this_PathFormula_3= rulePathFormula otherlv_4= ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:896:1: (otherlv_0= 'P' ruleCompareProbability otherlv_2= '[' this_PathFormula_3= rulePathFormula otherlv_4= ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:896:3: otherlv_0= 'P' ruleCompareProbability otherlv_2= '[' this_PathFormula_3= rulePathFormula otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleProbability2182); 

                	newLeafNode(otherlv_0, grammarAccess.getProbabilityAccess().getPKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getProbabilityAccess().getCompareProbabilityParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleCompareProbability_in_ruleProbability2198);
            ruleCompareProbability();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleProbability2209); 

                	newLeafNode(otherlv_2, grammarAccess.getProbabilityAccess().getLeftSquareBracketKeyword_2());
                
             
                    newCompositeNode(grammarAccess.getProbabilityAccess().getPathFormulaParserRuleCall_3()); 
                
            pushFollow(FOLLOW_rulePathFormula_in_ruleProbability2231);
            this_PathFormula_3=rulePathFormula();

            state._fsp--;

             
                    current = this_PathFormula_3; 
                    afterParserOrEnumRuleCall();
                
            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleProbability2242); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:933:1: entryRuleUntil returns [EObject current=null] : iv_ruleUntil= ruleUntil EOF ;
    public final EObject entryRuleUntil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUntil = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:934:2: (iv_ruleUntil= ruleUntil EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:935:2: iv_ruleUntil= ruleUntil EOF
            {
             newCompositeNode(grammarAccess.getUntilRule()); 
            pushFollow(FOLLOW_ruleUntil_in_entryRuleUntil2278);
            iv_ruleUntil=ruleUntil();

            state._fsp--;

             current =iv_ruleUntil; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUntil2288); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:942:1: ruleUntil returns [EObject current=null] : ( ( (lv_left_0_0= ruleStateFormula ) ) (otherlv_1= 'U' | otherlv_2= 'W' | otherlv_3= 'R' ) ( ruleTimeBound )? ( (lv_right_5_0= ruleStateFormula ) ) ) ;
    public final EObject ruleUntil() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:945:28: ( ( ( (lv_left_0_0= ruleStateFormula ) ) (otherlv_1= 'U' | otherlv_2= 'W' | otherlv_3= 'R' ) ( ruleTimeBound )? ( (lv_right_5_0= ruleStateFormula ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:946:1: ( ( (lv_left_0_0= ruleStateFormula ) ) (otherlv_1= 'U' | otherlv_2= 'W' | otherlv_3= 'R' ) ( ruleTimeBound )? ( (lv_right_5_0= ruleStateFormula ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:946:1: ( ( (lv_left_0_0= ruleStateFormula ) ) (otherlv_1= 'U' | otherlv_2= 'W' | otherlv_3= 'R' ) ( ruleTimeBound )? ( (lv_right_5_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:946:2: ( (lv_left_0_0= ruleStateFormula ) ) (otherlv_1= 'U' | otherlv_2= 'W' | otherlv_3= 'R' ) ( ruleTimeBound )? ( (lv_right_5_0= ruleStateFormula ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:946:2: ( (lv_left_0_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:947:1: (lv_left_0_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:947:1: (lv_left_0_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:948:3: lv_left_0_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getUntilAccess().getLeftStateFormulaParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleUntil2334);
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

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:964:2: (otherlv_1= 'U' | otherlv_2= 'W' | otherlv_3= 'R' )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt13=1;
                }
                break;
            case 26:
                {
                alt13=2;
                }
                break;
            case 27:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:964:4: otherlv_1= 'U'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleUntil2347); 

                        	newLeafNode(otherlv_1, grammarAccess.getUntilAccess().getUKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:969:7: otherlv_2= 'W'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleUntil2365); 

                        	newLeafNode(otherlv_2, grammarAccess.getUntilAccess().getWKeyword_1_1());
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:974:7: otherlv_3= 'R'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleUntil2383); 

                        	newLeafNode(otherlv_3, grammarAccess.getUntilAccess().getRKeyword_1_2());
                        

                    }
                    break;

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:978:2: ( ruleTimeBound )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22||(LA14_0>=32 && LA14_0<=34)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:979:5: ruleTimeBound
                    {
                     
                            newCompositeNode(grammarAccess.getUntilAccess().getTimeBoundParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTimeBound_in_ruleUntil2401);
                    ruleTimeBound();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:986:3: ( (lv_right_5_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:987:1: (lv_right_5_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:987:1: (lv_right_5_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:988:3: lv_right_5_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getUntilAccess().getRightStateFormulaParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleUntil2423);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1012:1: entryRuleNext returns [EObject current=null] : iv_ruleNext= ruleNext EOF ;
    public final EObject entryRuleNext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNext = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1013:2: (iv_ruleNext= ruleNext EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1014:2: iv_ruleNext= ruleNext EOF
            {
             newCompositeNode(grammarAccess.getNextRule()); 
            pushFollow(FOLLOW_ruleNext_in_entryRuleNext2459);
            iv_ruleNext=ruleNext();

            state._fsp--;

             current =iv_ruleNext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNext2469); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1021:1: ruleNext returns [EObject current=null] : (otherlv_0= 'X' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) ) ;
    public final EObject ruleNext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1024:28: ( (otherlv_0= 'X' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1025:1: (otherlv_0= 'X' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1025:1: (otherlv_0= 'X' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1025:3: otherlv_0= 'X' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleNext2506); 

                	newLeafNode(otherlv_0, grammarAccess.getNextAccess().getXKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1029:1: ( ruleTimeBound )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22||(LA15_0>=32 && LA15_0<=34)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1030:5: ruleTimeBound
                    {
                     
                            newCompositeNode(grammarAccess.getNextAccess().getTimeBoundParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTimeBound_in_ruleNext2523);
                    ruleTimeBound();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1037:3: ( (lv_right_2_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1038:1: (lv_right_2_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1038:1: (lv_right_2_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1039:3: lv_right_2_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getNextAccess().getRightStateFormulaParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleNext2545);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1063:1: entryRuleFuture returns [EObject current=null] : iv_ruleFuture= ruleFuture EOF ;
    public final EObject entryRuleFuture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuture = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1064:2: (iv_ruleFuture= ruleFuture EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1065:2: iv_ruleFuture= ruleFuture EOF
            {
             newCompositeNode(grammarAccess.getFutureRule()); 
            pushFollow(FOLLOW_ruleFuture_in_entryRuleFuture2581);
            iv_ruleFuture=ruleFuture();

            state._fsp--;

             current =iv_ruleFuture; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuture2591); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1072:1: ruleFuture returns [EObject current=null] : (otherlv_0= 'F' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) ) ;
    public final EObject ruleFuture() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1075:28: ( (otherlv_0= 'F' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1076:1: (otherlv_0= 'F' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1076:1: (otherlv_0= 'F' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1076:3: otherlv_0= 'F' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleFuture2628); 

                	newLeafNode(otherlv_0, grammarAccess.getFutureAccess().getFKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1080:1: ( ruleTimeBound )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22||(LA16_0>=32 && LA16_0<=34)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1081:5: ruleTimeBound
                    {
                     
                            newCompositeNode(grammarAccess.getFutureAccess().getTimeBoundParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTimeBound_in_ruleFuture2645);
                    ruleTimeBound();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1088:3: ( (lv_right_2_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1089:1: (lv_right_2_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1089:1: (lv_right_2_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1090:3: lv_right_2_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getFutureAccess().getRightStateFormulaParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleFuture2667);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1114:1: entryRuleGlobally returns [EObject current=null] : iv_ruleGlobally= ruleGlobally EOF ;
    public final EObject entryRuleGlobally() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobally = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1115:2: (iv_ruleGlobally= ruleGlobally EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1116:2: iv_ruleGlobally= ruleGlobally EOF
            {
             newCompositeNode(grammarAccess.getGloballyRule()); 
            pushFollow(FOLLOW_ruleGlobally_in_entryRuleGlobally2703);
            iv_ruleGlobally=ruleGlobally();

            state._fsp--;

             current =iv_ruleGlobally; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobally2713); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1123:1: ruleGlobally returns [EObject current=null] : (otherlv_0= 'G' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) ) ;
    public final EObject ruleGlobally() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1126:28: ( (otherlv_0= 'G' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1127:1: (otherlv_0= 'G' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1127:1: (otherlv_0= 'G' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1127:3: otherlv_0= 'G' ( ruleTimeBound )? ( (lv_right_2_0= ruleStateFormula ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleGlobally2750); 

                	newLeafNode(otherlv_0, grammarAccess.getGloballyAccess().getGKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1131:1: ( ruleTimeBound )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22||(LA17_0>=32 && LA17_0<=34)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1132:5: ruleTimeBound
                    {
                     
                            newCompositeNode(grammarAccess.getGloballyAccess().getTimeBoundParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTimeBound_in_ruleGlobally2767);
                    ruleTimeBound();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1139:3: ( (lv_right_2_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1140:1: (lv_right_2_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1140:1: (lv_right_2_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1141:3: lv_right_2_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getGloballyAccess().getRightStateFormulaParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleGlobally2789);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1165:1: entryRuleImplication returns [EObject current=null] : iv_ruleImplication= ruleImplication EOF ;
    public final EObject entryRuleImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplication = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1166:2: (iv_ruleImplication= ruleImplication EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1167:2: iv_ruleImplication= ruleImplication EOF
            {
             newCompositeNode(grammarAccess.getImplicationRule()); 
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication2825);
            iv_ruleImplication=ruleImplication();

            state._fsp--;

             current =iv_ruleImplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication2835); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1174:1: ruleImplication returns [EObject current=null] : (otherlv_0= '=>' ( (lv_right_1_0= ruleStateFormula ) ) ) ;
    public final EObject ruleImplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1177:28: ( (otherlv_0= '=>' ( (lv_right_1_0= ruleStateFormula ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1178:1: (otherlv_0= '=>' ( (lv_right_1_0= ruleStateFormula ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1178:1: (otherlv_0= '=>' ( (lv_right_1_0= ruleStateFormula ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1178:3: otherlv_0= '=>' ( (lv_right_1_0= ruleStateFormula ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleImplication2872); 

                	newLeafNode(otherlv_0, grammarAccess.getImplicationAccess().getEqualsSignGreaterThanSignKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1182:1: ( (lv_right_1_0= ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1183:1: (lv_right_1_0= ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1183:1: (lv_right_1_0= ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1184:3: lv_right_1_0= ruleStateFormula
            {
             
            	        newCompositeNode(grammarAccess.getImplicationAccess().getRightStateFormulaParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStateFormula_in_ruleImplication2893);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1208:1: entryRuleCompareProbability returns [String current=null] : iv_ruleCompareProbability= ruleCompareProbability EOF ;
    public final String entryRuleCompareProbability() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompareProbability = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1209:2: (iv_ruleCompareProbability= ruleCompareProbability EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1210:2: iv_ruleCompareProbability= ruleCompareProbability EOF
            {
             newCompositeNode(grammarAccess.getCompareProbabilityRule()); 
            pushFollow(FOLLOW_ruleCompareProbability_in_entryRuleCompareProbability2930);
            iv_ruleCompareProbability=ruleCompareProbability();

            state._fsp--;

             current =iv_ruleCompareProbability.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareProbability2941); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1217:1: ruleCompareProbability returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) ) this_DECIMAL_4= RULE_DECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleCompareProbability() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_DECIMAL_4=null;

         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1220:28: ( ( ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) ) this_DECIMAL_4= RULE_DECIMAL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1221:1: ( ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) ) this_DECIMAL_4= RULE_DECIMAL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1221:1: ( ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) ) this_DECIMAL_4= RULE_DECIMAL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1221:2: ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) ) this_DECIMAL_4= RULE_DECIMAL
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1221:2: ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            else if ( (LA20_0==34) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1221:3: (kw= '>' (kw= '=' )? )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1221:3: (kw= '>' (kw= '=' )? )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1222:2: kw= '>' (kw= '=' )?
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleCompareProbability2981); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompareProbabilityAccess().getGreaterThanSignKeyword_0_0_0()); 
                        
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1227:1: (kw= '=' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==33) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1228:2: kw= '='
                            {
                            kw=(Token)match(input,33,FOLLOW_33_in_ruleCompareProbability2995); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getCompareProbabilityAccess().getEqualsSignKeyword_0_0_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1234:6: (kw= '<' (kw= '=' )? )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1234:6: (kw= '<' (kw= '=' )? )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1235:2: kw= '<' (kw= '=' )?
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleCompareProbability3018); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompareProbabilityAccess().getLessThanSignKeyword_0_1_0()); 
                        
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1240:1: (kw= '=' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==33) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1241:2: kw= '='
                            {
                            kw=(Token)match(input,33,FOLLOW_33_in_ruleCompareProbability3032); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getCompareProbabilityAccess().getEqualsSignKeyword_0_1_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            this_DECIMAL_4=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleCompareProbability3051); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1261:1: entryRuleTimeBound returns [String current=null] : iv_ruleTimeBound= ruleTimeBound EOF ;
    public final String entryRuleTimeBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeBound = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1262:2: (iv_ruleTimeBound= ruleTimeBound EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1263:2: iv_ruleTimeBound= ruleTimeBound EOF
            {
             newCompositeNode(grammarAccess.getTimeBoundRule()); 
            pushFollow(FOLLOW_ruleTimeBound_in_entryRuleTimeBound3097);
            iv_ruleTimeBound=ruleTimeBound();

            state._fsp--;

             current =iv_ruleTimeBound.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeBound3108); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1270:1: ruleTimeBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) | kw= '=' ) this_DECIMAL_5= RULE_DECIMAL ) | (kw= '[' this_DECIMAL_7= RULE_DECIMAL kw= ',' this_DECIMAL_9= RULE_DECIMAL kw= ']' ) ) ;
    public final AntlrDatatypeRuleToken ruleTimeBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_DECIMAL_5=null;
        Token this_DECIMAL_7=null;
        Token this_DECIMAL_9=null;

         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1273:28: ( ( ( ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) | kw= '=' ) this_DECIMAL_5= RULE_DECIMAL ) | (kw= '[' this_DECIMAL_7= RULE_DECIMAL kw= ',' this_DECIMAL_9= RULE_DECIMAL kw= ']' ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1274:1: ( ( ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) | kw= '=' ) this_DECIMAL_5= RULE_DECIMAL ) | (kw= '[' this_DECIMAL_7= RULE_DECIMAL kw= ',' this_DECIMAL_9= RULE_DECIMAL kw= ']' ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1274:1: ( ( ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) | kw= '=' ) this_DECIMAL_5= RULE_DECIMAL ) | (kw= '[' this_DECIMAL_7= RULE_DECIMAL kw= ',' this_DECIMAL_9= RULE_DECIMAL kw= ']' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=32 && LA24_0<=34)) ) {
                alt24=1;
            }
            else if ( (LA24_0==22) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1274:2: ( ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) | kw= '=' ) this_DECIMAL_5= RULE_DECIMAL )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1274:2: ( ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) | kw= '=' ) this_DECIMAL_5= RULE_DECIMAL )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1274:3: ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) | kw= '=' ) this_DECIMAL_5= RULE_DECIMAL
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1274:3: ( (kw= '>' (kw= '=' )? ) | (kw= '<' (kw= '=' )? ) | kw= '=' )
                    int alt23=3;
                    switch ( input.LA(1) ) {
                    case 32:
                        {
                        alt23=1;
                        }
                        break;
                    case 34:
                        {
                        alt23=2;
                        }
                        break;
                    case 33:
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
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1274:4: (kw= '>' (kw= '=' )? )
                            {
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1274:4: (kw= '>' (kw= '=' )? )
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1275:2: kw= '>' (kw= '=' )?
                            {
                            kw=(Token)match(input,32,FOLLOW_32_in_ruleTimeBound3149); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTimeBoundAccess().getGreaterThanSignKeyword_0_0_0_0()); 
                                
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1280:1: (kw= '=' )?
                            int alt21=2;
                            int LA21_0 = input.LA(1);

                            if ( (LA21_0==33) ) {
                                alt21=1;
                            }
                            switch (alt21) {
                                case 1 :
                                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1281:2: kw= '='
                                    {
                                    kw=(Token)match(input,33,FOLLOW_33_in_ruleTimeBound3163); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getTimeBoundAccess().getEqualsSignKeyword_0_0_0_1()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1287:6: (kw= '<' (kw= '=' )? )
                            {
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1287:6: (kw= '<' (kw= '=' )? )
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1288:2: kw= '<' (kw= '=' )?
                            {
                            kw=(Token)match(input,34,FOLLOW_34_in_ruleTimeBound3186); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTimeBoundAccess().getLessThanSignKeyword_0_0_1_0()); 
                                
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1293:1: (kw= '=' )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==33) ) {
                                alt22=1;
                            }
                            switch (alt22) {
                                case 1 :
                                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1294:2: kw= '='
                                    {
                                    kw=(Token)match(input,33,FOLLOW_33_in_ruleTimeBound3200); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getTimeBoundAccess().getEqualsSignKeyword_0_0_1_1()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1301:2: kw= '='
                            {
                            kw=(Token)match(input,33,FOLLOW_33_in_ruleTimeBound3222); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getTimeBoundAccess().getEqualsSignKeyword_0_0_2()); 
                                

                            }
                            break;

                    }

                    this_DECIMAL_5=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleTimeBound3238); 

                    		current.merge(this_DECIMAL_5);
                        
                     
                        newLeafNode(this_DECIMAL_5, grammarAccess.getTimeBoundAccess().getDECIMALTerminalRuleCall_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1314:6: (kw= '[' this_DECIMAL_7= RULE_DECIMAL kw= ',' this_DECIMAL_9= RULE_DECIMAL kw= ']' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1314:6: (kw= '[' this_DECIMAL_7= RULE_DECIMAL kw= ',' this_DECIMAL_9= RULE_DECIMAL kw= ']' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1315:2: kw= '[' this_DECIMAL_7= RULE_DECIMAL kw= ',' this_DECIMAL_9= RULE_DECIMAL kw= ']'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleTimeBound3264); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeBoundAccess().getLeftSquareBracketKeyword_1_0()); 
                        
                    this_DECIMAL_7=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleTimeBound3279); 

                    		current.merge(this_DECIMAL_7);
                        
                     
                        newLeafNode(this_DECIMAL_7, grammarAccess.getTimeBoundAccess().getDECIMALTerminalRuleCall_1_1()); 
                        
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleTimeBound3297); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeBoundAccess().getCommaKeyword_1_2()); 
                        
                    this_DECIMAL_9=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleTimeBound3312); 

                    		current.merge(this_DECIMAL_9);
                        
                     
                        newLeafNode(this_DECIMAL_9, grammarAccess.getTimeBoundAccess().getDECIMALTerminalRuleCall_1_3()); 
                        
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleTimeBound3330); 

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
    public static final BitSet FOLLOW_ruleRules_in_ruleStart130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRules_in_entryRuleRules166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRules176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentedRule_in_ruleRules222 = new BitSet(new long[]{0x000000000114E052L});
    public static final BitSet FOLLOW_ruleRules_in_ruleRules243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentedRule_in_entryRuleCommentedRule280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentedRule290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleCommentedRule332 = new BitSet(new long[]{0x000000000114E050L});
    public static final BitSet FOLLOW_rulePctl_in_ruleCommentedRule359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePctl_in_entryRulePctl395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePctl405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rulePctl452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSteadyState_in_rulePctl479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedProbability_in_rulePctl506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleState588 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleLabel693 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_ruleAtomic808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleAtomic835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleAtomic851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleNegation933 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleNegation955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJunction_in_entryRuleJunction990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJunction1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleJunction1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleJunction1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction1109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleConjunction1156 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleConjunction1178 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleConjunction1199 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleConjunction1220 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction1258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDisjunction1305 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleDisjunction1327 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleDisjunction1348 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleDisjunction1369 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_entryRuleStateFormula1407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateFormula1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleStateFormula1455 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleStateFormula1476 = new BitSet(new long[]{0x00000000800B0000L});
    public static final BitSet FOLLOW_ruleJunction_in_ruleStateFormula1498 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleStateFormula1525 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStateFormula1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleStateFormula1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_ruleStateFormula1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbability_in_ruleStateFormula1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathFormula_in_entryRulePathFormula1657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathFormula1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNext_in_rulePathFormula1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUntil_in_rulePathFormula1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuture_in_rulePathFormula1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobally_in_rulePathFormula1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSteadyState_in_entryRuleSteadyState1830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSteadyState1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleSteadyState1877 = new BitSet(new long[]{0x0000000500200000L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_ruleSteadyState1894 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21_in_ruleSteadyState1911 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSteadyState1924 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleSteadyState1946 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSteadyState1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedProbability_in_entryRuleQuantifiedProbability1993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifiedProbability2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleQuantifiedProbability2041 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleQuantifiedProbability2053 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleQuantifiedProbability2066 = new BitSet(new long[]{0x000000007104E040L});
    public static final BitSet FOLLOW_rulePathFormula_in_ruleQuantifiedProbability2088 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleQuantifiedProbability2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbability_in_entryRuleProbability2135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProbability2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleProbability2182 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_ruleProbability2198 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleProbability2209 = new BitSet(new long[]{0x000000007104E040L});
    public static final BitSet FOLLOW_rulePathFormula_in_ruleProbability2231 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleProbability2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUntil_in_entryRuleUntil2278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUntil2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleUntil2334 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_25_in_ruleUntil2347 = new BitSet(new long[]{0x000000070144E040L});
    public static final BitSet FOLLOW_26_in_ruleUntil2365 = new BitSet(new long[]{0x000000070144E040L});
    public static final BitSet FOLLOW_27_in_ruleUntil2383 = new BitSet(new long[]{0x000000070144E040L});
    public static final BitSet FOLLOW_ruleTimeBound_in_ruleUntil2401 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleUntil2423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNext_in_entryRuleNext2459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNext2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleNext2506 = new BitSet(new long[]{0x000000070144E040L});
    public static final BitSet FOLLOW_ruleTimeBound_in_ruleNext2523 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleNext2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuture_in_entryRuleFuture2581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuture2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFuture2628 = new BitSet(new long[]{0x000000070144E040L});
    public static final BitSet FOLLOW_ruleTimeBound_in_ruleFuture2645 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleFuture2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobally_in_entryRuleGlobally2703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobally2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleGlobally2750 = new BitSet(new long[]{0x000000070144E040L});
    public static final BitSet FOLLOW_ruleTimeBound_in_ruleGlobally2767 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleGlobally2789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication2825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleImplication2872 = new BitSet(new long[]{0x000000000104E040L});
    public static final BitSet FOLLOW_ruleStateFormula_in_ruleImplication2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_entryRuleCompareProbability2930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareProbability2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCompareProbability2981 = new BitSet(new long[]{0x0000000200000080L});
    public static final BitSet FOLLOW_33_in_ruleCompareProbability2995 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_34_in_ruleCompareProbability3018 = new BitSet(new long[]{0x0000000200000080L});
    public static final BitSet FOLLOW_33_in_ruleCompareProbability3032 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleCompareProbability3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_entryRuleTimeBound3097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeBound3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTimeBound3149 = new BitSet(new long[]{0x0000000200000080L});
    public static final BitSet FOLLOW_33_in_ruleTimeBound3163 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_34_in_ruleTimeBound3186 = new BitSet(new long[]{0x0000000200000080L});
    public static final BitSet FOLLOW_33_in_ruleTimeBound3200 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_33_in_ruleTimeBound3222 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleTimeBound3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTimeBound3264 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleTimeBound3279 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleTimeBound3297 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleTimeBound3312 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTimeBound3330 = new BitSet(new long[]{0x0000000000000002L});

}