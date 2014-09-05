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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "'State:'", "')'", "'Label:'", "'S'", "'['", "']'", "'P'", "'F'", "'U'", "'G'", "'=>'", "'=?'", "'>'", "'<'", "'>='", "'<='", "','", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:76:1: ruleStart returns [EObject current=null] : ( ( (lv_start_0_0= ruleS ) ) | this_P_1= ruleP | this_PG_2= rulePG ) ;
    public final EObject ruleStart() throws RecognitionException {
        EObject current = null;

        EObject lv_start_0_0 = null;

        EObject this_P_1 = null;

        EObject this_PG_2 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:79:28: ( ( ( (lv_start_0_0= ruleS ) ) | this_P_1= ruleP | this_PG_2= rulePG ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:80:1: ( ( (lv_start_0_0= ruleS ) ) | this_P_1= ruleP | this_PG_2= rulePG )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:80:1: ( ( (lv_start_0_0= ruleS ) ) | this_P_1= ruleP | this_PG_2= rulePG )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:80:2: ( (lv_start_0_0= ruleS ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:80:2: ( (lv_start_0_0= ruleS ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:81:1: (lv_start_0_0= ruleS )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:81:1: (lv_start_0_0= ruleS )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:82:3: lv_start_0_0= ruleS
                    {
                     
                    	        newCompositeNode(grammarAccess.getStartAccess().getStartSParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleS_in_ruleStart131);
                    lv_start_0_0=ruleS();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStartRule());
                    	        }
                           		set(
                           			current, 
                           			"start",
                            		lv_start_0_0, 
                            		"S");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:100:5: this_P_1= ruleP
                    {
                     
                            newCompositeNode(grammarAccess.getStartAccess().getPParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleP_in_ruleStart159);
                    this_P_1=ruleP();

                    state._fsp--;

                     
                            current = this_P_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:110:5: this_PG_2= rulePG
                    {
                     
                            newCompositeNode(grammarAccess.getStartAccess().getPGParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePG_in_ruleStart186);
                    this_PG_2=rulePG();

                    state._fsp--;

                     
                            current = this_PG_2; 
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
    // $ANTLR end "ruleStart"


    // $ANTLR start "entryRuleState"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:126:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:127:2: (iv_ruleState= ruleState EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:128:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState221);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState231); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:135:1: ruleState returns [EObject current=null] : ( (otherlv_0= '(' otherlv_1= 'State:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'State:' ( (lv_name_5_0= RULE_ID ) ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:138:28: ( ( (otherlv_0= '(' otherlv_1= 'State:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'State:' ( (lv_name_5_0= RULE_ID ) ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:139:1: ( (otherlv_0= '(' otherlv_1= 'State:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'State:' ( (lv_name_5_0= RULE_ID ) ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:139:1: ( (otherlv_0= '(' otherlv_1= 'State:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'State:' ( (lv_name_5_0= RULE_ID ) ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:139:2: (otherlv_0= '(' otherlv_1= 'State:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:139:2: (otherlv_0= '(' otherlv_1= 'State:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:139:4: otherlv_0= '(' otherlv_1= 'State:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleState269); 

                        	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getLeftParenthesisKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleState281); 

                        	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_0_1());
                        
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:147:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:148:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:148:1: (lv_name_2_0= RULE_ID )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:149:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState298); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleState315); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getRightParenthesisKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:170:6: (otherlv_4= 'State:' ( (lv_name_5_0= RULE_ID ) ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:170:6: (otherlv_4= 'State:' ( (lv_name_5_0= RULE_ID ) ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:170:8: otherlv_4= 'State:' ( (lv_name_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleState335); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getStateKeyword_1_0());
                        
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:174:1: ( (lv_name_5_0= RULE_ID ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:175:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:175:1: (lv_name_5_0= RULE_ID )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:176:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState352); 

                    			newLeafNode(lv_name_5_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_5_0, 
                            		"ID");
                    	    

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleLabel"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:200:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:201:2: (iv_ruleLabel= ruleLabel EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:202:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel394);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel404); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:209:1: ruleLabel returns [EObject current=null] : ( (otherlv_0= '(' otherlv_1= 'Label:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'Label:' ( (lv_name_5_0= RULE_ID ) ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;

         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:212:28: ( ( (otherlv_0= '(' otherlv_1= 'Label:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'Label:' ( (lv_name_5_0= RULE_ID ) ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:213:1: ( (otherlv_0= '(' otherlv_1= 'Label:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'Label:' ( (lv_name_5_0= RULE_ID ) ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:213:1: ( (otherlv_0= '(' otherlv_1= 'Label:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'Label:' ( (lv_name_5_0= RULE_ID ) ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:213:2: (otherlv_0= '(' otherlv_1= 'Label:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:213:2: (otherlv_0= '(' otherlv_1= 'Label:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:213:4: otherlv_0= '(' otherlv_1= 'Label:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleLabel442); 

                        	newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLeftParenthesisKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleLabel454); 

                        	newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getLabelKeyword_0_1());
                        
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:221:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:222:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:222:1: (lv_name_2_0= RULE_ID )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:223:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel471); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleLabel488); 

                        	newLeafNode(otherlv_3, grammarAccess.getLabelAccess().getRightParenthesisKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:244:6: (otherlv_4= 'Label:' ( (lv_name_5_0= RULE_ID ) ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:244:6: (otherlv_4= 'Label:' ( (lv_name_5_0= RULE_ID ) ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:244:8: otherlv_4= 'Label:' ( (lv_name_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleLabel508); 

                        	newLeafNode(otherlv_4, grammarAccess.getLabelAccess().getLabelKeyword_1_0());
                        
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:248:1: ( (lv_name_5_0= RULE_ID ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:249:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:249:1: (lv_name_5_0= RULE_ID )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:250:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel525); 

                    			newLeafNode(lv_name_5_0, grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLabelRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_5_0, 
                            		"ID");
                    	    

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleStateOrLabel"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:274:1: entryRuleStateOrLabel returns [EObject current=null] : iv_ruleStateOrLabel= ruleStateOrLabel EOF ;
    public final EObject entryRuleStateOrLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateOrLabel = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:275:2: (iv_ruleStateOrLabel= ruleStateOrLabel EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:276:2: iv_ruleStateOrLabel= ruleStateOrLabel EOF
            {
             newCompositeNode(grammarAccess.getStateOrLabelRule()); 
            pushFollow(FOLLOW_ruleStateOrLabel_in_entryRuleStateOrLabel567);
            iv_ruleStateOrLabel=ruleStateOrLabel();

            state._fsp--;

             current =iv_ruleStateOrLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateOrLabel577); 

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
    // $ANTLR end "entryRuleStateOrLabel"


    // $ANTLR start "ruleStateOrLabel"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:283:1: ruleStateOrLabel returns [EObject current=null] : (this_State_0= ruleState | this_Label_1= ruleLabel ) ;
    public final EObject ruleStateOrLabel() throws RecognitionException {
        EObject current = null;

        EObject this_State_0 = null;

        EObject this_Label_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:286:28: ( (this_State_0= ruleState | this_Label_1= ruleLabel ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:287:1: (this_State_0= ruleState | this_Label_1= ruleLabel )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:287:1: (this_State_0= ruleState | this_Label_1= ruleLabel )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==14) ) {
                    alt4=2;
                }
                else if ( (LA4_1==12) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 12:
                {
                alt4=1;
                }
                break;
            case 14:
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:288:5: this_State_0= ruleState
                    {
                     
                            newCompositeNode(grammarAccess.getStateOrLabelAccess().getStateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleState_in_ruleStateOrLabel624);
                    this_State_0=ruleState();

                    state._fsp--;

                     
                            current = this_State_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:298:5: this_Label_1= ruleLabel
                    {
                     
                            newCompositeNode(grammarAccess.getStateOrLabelAccess().getLabelParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLabel_in_ruleStateOrLabel651);
                    this_Label_1=ruleLabel();

                    state._fsp--;

                     
                            current = this_Label_1; 
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
    // $ANTLR end "ruleStateOrLabel"


    // $ANTLR start "entryRuleS"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:314:1: entryRuleS returns [EObject current=null] : iv_ruleS= ruleS EOF ;
    public final EObject entryRuleS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleS = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:315:2: (iv_ruleS= ruleS EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:316:2: iv_ruleS= ruleS EOF
            {
             newCompositeNode(grammarAccess.getSRule()); 
            pushFollow(FOLLOW_ruleS_in_entryRuleS686);
            iv_ruleS=ruleS();

            state._fsp--;

             current =iv_ruleS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleS696); 

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
    // $ANTLR end "entryRuleS"


    // $ANTLR start "ruleS"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:323:1: ruleS returns [EObject current=null] : (otherlv_0= 'S' ruleCompare otherlv_2= '[' this_StateOrLabel_3= ruleStateOrLabel otherlv_4= ']' ) ;
    public final EObject ruleS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_StateOrLabel_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:326:28: ( (otherlv_0= 'S' ruleCompare otherlv_2= '[' this_StateOrLabel_3= ruleStateOrLabel otherlv_4= ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:327:1: (otherlv_0= 'S' ruleCompare otherlv_2= '[' this_StateOrLabel_3= ruleStateOrLabel otherlv_4= ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:327:1: (otherlv_0= 'S' ruleCompare otherlv_2= '[' this_StateOrLabel_3= ruleStateOrLabel otherlv_4= ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:327:3: otherlv_0= 'S' ruleCompare otherlv_2= '[' this_StateOrLabel_3= ruleStateOrLabel otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleS733); 

                	newLeafNode(otherlv_0, grammarAccess.getSAccess().getSKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getSAccess().getCompareParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleCompare_in_ruleS749);
            ruleCompare();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleS760); 

                	newLeafNode(otherlv_2, grammarAccess.getSAccess().getLeftSquareBracketKeyword_2());
                
             
                    newCompositeNode(grammarAccess.getSAccess().getStateOrLabelParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleStateOrLabel_in_ruleS782);
            this_StateOrLabel_3=ruleStateOrLabel();

            state._fsp--;

             
                    current = this_StateOrLabel_3; 
                    afterParserOrEnumRuleCall();
                
            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleS793); 

                	newLeafNode(otherlv_4, grammarAccess.getSAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleS"


    // $ANTLR start "entryRuleP"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:364:1: entryRuleP returns [EObject current=null] : iv_ruleP= ruleP EOF ;
    public final EObject entryRuleP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleP = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:365:2: (iv_ruleP= ruleP EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:366:2: iv_ruleP= ruleP EOF
            {
             newCompositeNode(grammarAccess.getPRule()); 
            pushFollow(FOLLOW_ruleP_in_entryRuleP829);
            iv_ruleP=ruleP();

            state._fsp--;

             current =iv_ruleP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleP839); 

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
    // $ANTLR end "entryRuleP"


    // $ANTLR start "ruleP"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:373:1: ruleP returns [EObject current=null] : ( (otherlv_0= 'P' ruleCompare otherlv_2= '[' otherlv_3= 'F' ruleTimeBound this_StateOrLabel_5= ruleStateOrLabel otherlv_6= ']' ) | (otherlv_7= 'P' ruleCompare otherlv_9= '[' ( (lv_LEFT_10_0= ruleStateOrLabel ) ) otherlv_11= 'U' ruleTimeBound ( (lv_RIGHT_13_0= ruleStateOrLabel ) ) otherlv_14= ']' ) ) ;
    public final EObject ruleP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        EObject this_StateOrLabel_5 = null;

        EObject lv_LEFT_10_0 = null;

        EObject lv_RIGHT_13_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:376:28: ( ( (otherlv_0= 'P' ruleCompare otherlv_2= '[' otherlv_3= 'F' ruleTimeBound this_StateOrLabel_5= ruleStateOrLabel otherlv_6= ']' ) | (otherlv_7= 'P' ruleCompare otherlv_9= '[' ( (lv_LEFT_10_0= ruleStateOrLabel ) ) otherlv_11= 'U' ruleTimeBound ( (lv_RIGHT_13_0= ruleStateOrLabel ) ) otherlv_14= ']' ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:377:1: ( (otherlv_0= 'P' ruleCompare otherlv_2= '[' otherlv_3= 'F' ruleTimeBound this_StateOrLabel_5= ruleStateOrLabel otherlv_6= ']' ) | (otherlv_7= 'P' ruleCompare otherlv_9= '[' ( (lv_LEFT_10_0= ruleStateOrLabel ) ) otherlv_11= 'U' ruleTimeBound ( (lv_RIGHT_13_0= ruleStateOrLabel ) ) otherlv_14= ']' ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:377:1: ( (otherlv_0= 'P' ruleCompare otherlv_2= '[' otherlv_3= 'F' ruleTimeBound this_StateOrLabel_5= ruleStateOrLabel otherlv_6= ']' ) | (otherlv_7= 'P' ruleCompare otherlv_9= '[' ( (lv_LEFT_10_0= ruleStateOrLabel ) ) otherlv_11= 'U' ruleTimeBound ( (lv_RIGHT_13_0= ruleStateOrLabel ) ) otherlv_14= ']' ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:377:2: (otherlv_0= 'P' ruleCompare otherlv_2= '[' otherlv_3= 'F' ruleTimeBound this_StateOrLabel_5= ruleStateOrLabel otherlv_6= ']' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:377:2: (otherlv_0= 'P' ruleCompare otherlv_2= '[' otherlv_3= 'F' ruleTimeBound this_StateOrLabel_5= ruleStateOrLabel otherlv_6= ']' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:377:4: otherlv_0= 'P' ruleCompare otherlv_2= '[' otherlv_3= 'F' ruleTimeBound this_StateOrLabel_5= ruleStateOrLabel otherlv_6= ']'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleP877); 

                        	newLeafNode(otherlv_0, grammarAccess.getPAccess().getPKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getPAccess().getCompareParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleCompare_in_ruleP893);
                    ruleCompare();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleP904); 

                        	newLeafNode(otherlv_2, grammarAccess.getPAccess().getLeftSquareBracketKeyword_0_2());
                        
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleP916); 

                        	newLeafNode(otherlv_3, grammarAccess.getPAccess().getFKeyword_0_3());
                        
                     
                            newCompositeNode(grammarAccess.getPAccess().getTimeBoundParserRuleCall_0_4()); 
                        
                    pushFollow(FOLLOW_ruleTimeBound_in_ruleP932);
                    ruleTimeBound();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getPAccess().getStateOrLabelParserRuleCall_0_5()); 
                        
                    pushFollow(FOLLOW_ruleStateOrLabel_in_ruleP953);
                    this_StateOrLabel_5=ruleStateOrLabel();

                    state._fsp--;

                     
                            current = this_StateOrLabel_5; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleP964); 

                        	newLeafNode(otherlv_6, grammarAccess.getPAccess().getRightSquareBracketKeyword_0_6());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:419:6: (otherlv_7= 'P' ruleCompare otherlv_9= '[' ( (lv_LEFT_10_0= ruleStateOrLabel ) ) otherlv_11= 'U' ruleTimeBound ( (lv_RIGHT_13_0= ruleStateOrLabel ) ) otherlv_14= ']' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:419:6: (otherlv_7= 'P' ruleCompare otherlv_9= '[' ( (lv_LEFT_10_0= ruleStateOrLabel ) ) otherlv_11= 'U' ruleTimeBound ( (lv_RIGHT_13_0= ruleStateOrLabel ) ) otherlv_14= ']' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:419:8: otherlv_7= 'P' ruleCompare otherlv_9= '[' ( (lv_LEFT_10_0= ruleStateOrLabel ) ) otherlv_11= 'U' ruleTimeBound ( (lv_RIGHT_13_0= ruleStateOrLabel ) ) otherlv_14= ']'
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleP984); 

                        	newLeafNode(otherlv_7, grammarAccess.getPAccess().getPKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getPAccess().getCompareParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleCompare_in_ruleP1000);
                    ruleCompare();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleP1011); 

                        	newLeafNode(otherlv_9, grammarAccess.getPAccess().getLeftSquareBracketKeyword_1_2());
                        
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:435:1: ( (lv_LEFT_10_0= ruleStateOrLabel ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:436:1: (lv_LEFT_10_0= ruleStateOrLabel )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:436:1: (lv_LEFT_10_0= ruleStateOrLabel )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:437:3: lv_LEFT_10_0= ruleStateOrLabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getPAccess().getLEFTStateOrLabelParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStateOrLabel_in_ruleP1032);
                    lv_LEFT_10_0=ruleStateOrLabel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPRule());
                    	        }
                           		set(
                           			current, 
                           			"LEFT",
                            		lv_LEFT_10_0, 
                            		"StateOrLabel");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleP1044); 

                        	newLeafNode(otherlv_11, grammarAccess.getPAccess().getUKeyword_1_4());
                        
                     
                            newCompositeNode(grammarAccess.getPAccess().getTimeBoundParserRuleCall_1_5()); 
                        
                    pushFollow(FOLLOW_ruleTimeBound_in_ruleP1060);
                    ruleTimeBound();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:465:1: ( (lv_RIGHT_13_0= ruleStateOrLabel ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:466:1: (lv_RIGHT_13_0= ruleStateOrLabel )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:466:1: (lv_RIGHT_13_0= ruleStateOrLabel )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:467:3: lv_RIGHT_13_0= ruleStateOrLabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getPAccess().getRIGHTStateOrLabelParserRuleCall_1_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStateOrLabel_in_ruleP1080);
                    lv_RIGHT_13_0=ruleStateOrLabel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPRule());
                    	        }
                           		set(
                           			current, 
                           			"RIGHT",
                            		lv_RIGHT_13_0, 
                            		"StateOrLabel");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,17,FOLLOW_17_in_ruleP1092); 

                        	newLeafNode(otherlv_14, grammarAccess.getPAccess().getRightSquareBracketKeyword_1_7());
                        

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
    // $ANTLR end "ruleP"


    // $ANTLR start "entryRulePG"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:495:1: entryRulePG returns [EObject current=null] : iv_rulePG= rulePG EOF ;
    public final EObject entryRulePG() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePG = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:496:2: (iv_rulePG= rulePG EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:497:2: iv_rulePG= rulePG EOF
            {
             newCompositeNode(grammarAccess.getPGRule()); 
            pushFollow(FOLLOW_rulePG_in_entryRulePG1129);
            iv_rulePG=rulePG();

            state._fsp--;

             current =iv_rulePG; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePG1139); 

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
    // $ANTLR end "entryRulePG"


    // $ANTLR start "rulePG"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:504:1: rulePG returns [EObject current=null] : (otherlv_0= 'P' ruleCompare otherlv_2= '[' otherlv_3= 'G' otherlv_4= '(' ( (lv_LEFT_5_0= ruleStateOrLabel ) ) otherlv_6= '=>' otherlv_7= 'P' ruleCompareWithoutUnknown otherlv_9= '[' otherlv_10= 'F' ruleTimeBound ( (lv_RIGHT_12_0= ruleStateOrLabel ) ) otherlv_13= ']' otherlv_14= ')' otherlv_15= ']' ) ;
    public final EObject rulePG() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_LEFT_5_0 = null;

        EObject lv_RIGHT_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:507:28: ( (otherlv_0= 'P' ruleCompare otherlv_2= '[' otherlv_3= 'G' otherlv_4= '(' ( (lv_LEFT_5_0= ruleStateOrLabel ) ) otherlv_6= '=>' otherlv_7= 'P' ruleCompareWithoutUnknown otherlv_9= '[' otherlv_10= 'F' ruleTimeBound ( (lv_RIGHT_12_0= ruleStateOrLabel ) ) otherlv_13= ']' otherlv_14= ')' otherlv_15= ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:508:1: (otherlv_0= 'P' ruleCompare otherlv_2= '[' otherlv_3= 'G' otherlv_4= '(' ( (lv_LEFT_5_0= ruleStateOrLabel ) ) otherlv_6= '=>' otherlv_7= 'P' ruleCompareWithoutUnknown otherlv_9= '[' otherlv_10= 'F' ruleTimeBound ( (lv_RIGHT_12_0= ruleStateOrLabel ) ) otherlv_13= ']' otherlv_14= ')' otherlv_15= ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:508:1: (otherlv_0= 'P' ruleCompare otherlv_2= '[' otherlv_3= 'G' otherlv_4= '(' ( (lv_LEFT_5_0= ruleStateOrLabel ) ) otherlv_6= '=>' otherlv_7= 'P' ruleCompareWithoutUnknown otherlv_9= '[' otherlv_10= 'F' ruleTimeBound ( (lv_RIGHT_12_0= ruleStateOrLabel ) ) otherlv_13= ']' otherlv_14= ')' otherlv_15= ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:508:3: otherlv_0= 'P' ruleCompare otherlv_2= '[' otherlv_3= 'G' otherlv_4= '(' ( (lv_LEFT_5_0= ruleStateOrLabel ) ) otherlv_6= '=>' otherlv_7= 'P' ruleCompareWithoutUnknown otherlv_9= '[' otherlv_10= 'F' ruleTimeBound ( (lv_RIGHT_12_0= ruleStateOrLabel ) ) otherlv_13= ']' otherlv_14= ')' otherlv_15= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_rulePG1176); 

                	newLeafNode(otherlv_0, grammarAccess.getPGAccess().getPKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getPGAccess().getCompareParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleCompare_in_rulePG1192);
            ruleCompare();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_rulePG1203); 

                	newLeafNode(otherlv_2, grammarAccess.getPGAccess().getLeftSquareBracketKeyword_2());
                
            otherlv_3=(Token)match(input,21,FOLLOW_21_in_rulePG1215); 

                	newLeafNode(otherlv_3, grammarAccess.getPGAccess().getGKeyword_3());
                
            otherlv_4=(Token)match(input,11,FOLLOW_11_in_rulePG1227); 

                	newLeafNode(otherlv_4, grammarAccess.getPGAccess().getLeftParenthesisKeyword_4());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:532:1: ( (lv_LEFT_5_0= ruleStateOrLabel ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:533:1: (lv_LEFT_5_0= ruleStateOrLabel )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:533:1: (lv_LEFT_5_0= ruleStateOrLabel )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:534:3: lv_LEFT_5_0= ruleStateOrLabel
            {
             
            	        newCompositeNode(grammarAccess.getPGAccess().getLEFTStateOrLabelParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleStateOrLabel_in_rulePG1248);
            lv_LEFT_5_0=ruleStateOrLabel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPGRule());
            	        }
                   		set(
                   			current, 
                   			"LEFT",
                    		lv_LEFT_5_0, 
                    		"StateOrLabel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_rulePG1260); 

                	newLeafNode(otherlv_6, grammarAccess.getPGAccess().getEqualsSignGreaterThanSignKeyword_6());
                
            otherlv_7=(Token)match(input,18,FOLLOW_18_in_rulePG1272); 

                	newLeafNode(otherlv_7, grammarAccess.getPGAccess().getPKeyword_7());
                
             
                    newCompositeNode(grammarAccess.getPGAccess().getCompareWithoutUnknownParserRuleCall_8()); 
                
            pushFollow(FOLLOW_ruleCompareWithoutUnknown_in_rulePG1288);
            ruleCompareWithoutUnknown();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_9=(Token)match(input,16,FOLLOW_16_in_rulePG1299); 

                	newLeafNode(otherlv_9, grammarAccess.getPGAccess().getLeftSquareBracketKeyword_9());
                
            otherlv_10=(Token)match(input,19,FOLLOW_19_in_rulePG1311); 

                	newLeafNode(otherlv_10, grammarAccess.getPGAccess().getFKeyword_10());
                
             
                    newCompositeNode(grammarAccess.getPGAccess().getTimeBoundParserRuleCall_11()); 
                
            pushFollow(FOLLOW_ruleTimeBound_in_rulePG1327);
            ruleTimeBound();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:582:1: ( (lv_RIGHT_12_0= ruleStateOrLabel ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:583:1: (lv_RIGHT_12_0= ruleStateOrLabel )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:583:1: (lv_RIGHT_12_0= ruleStateOrLabel )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:584:3: lv_RIGHT_12_0= ruleStateOrLabel
            {
             
            	        newCompositeNode(grammarAccess.getPGAccess().getRIGHTStateOrLabelParserRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_ruleStateOrLabel_in_rulePG1347);
            lv_RIGHT_12_0=ruleStateOrLabel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPGRule());
            	        }
                   		set(
                   			current, 
                   			"RIGHT",
                    		lv_RIGHT_12_0, 
                    		"StateOrLabel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,17,FOLLOW_17_in_rulePG1359); 

                	newLeafNode(otherlv_13, grammarAccess.getPGAccess().getRightSquareBracketKeyword_13());
                
            otherlv_14=(Token)match(input,13,FOLLOW_13_in_rulePG1371); 

                	newLeafNode(otherlv_14, grammarAccess.getPGAccess().getRightParenthesisKeyword_14());
                
            otherlv_15=(Token)match(input,17,FOLLOW_17_in_rulePG1383); 

                	newLeafNode(otherlv_15, grammarAccess.getPGAccess().getRightSquareBracketKeyword_15());
                

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
    // $ANTLR end "rulePG"


    // $ANTLR start "entryRuleCompare"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:620:1: entryRuleCompare returns [String current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final String entryRuleCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompare = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:621:2: (iv_ruleCompare= ruleCompare EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:622:2: iv_ruleCompare= ruleCompare EOF
            {
             newCompositeNode(grammarAccess.getCompareRule()); 
            pushFollow(FOLLOW_ruleCompare_in_entryRuleCompare1420);
            iv_ruleCompare=ruleCompare();

            state._fsp--;

             current =iv_ruleCompare.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompare1431); 

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
    // $ANTLR end "entryRuleCompare"


    // $ANTLR start "ruleCompare"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:629:1: ruleCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CompareWithoutUnknown_0= ruleCompareWithoutUnknown | kw= '=?' ) ;
    public final AntlrDatatypeRuleToken ruleCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CompareWithoutUnknown_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:632:28: ( (this_CompareWithoutUnknown_0= ruleCompareWithoutUnknown | kw= '=?' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:633:1: (this_CompareWithoutUnknown_0= ruleCompareWithoutUnknown | kw= '=?' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:633:1: (this_CompareWithoutUnknown_0= ruleCompareWithoutUnknown | kw= '=?' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=24 && LA6_0<=27)) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:634:5: this_CompareWithoutUnknown_0= ruleCompareWithoutUnknown
                    {
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getCompareWithoutUnknownParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCompareWithoutUnknown_in_ruleCompare1478);
                    this_CompareWithoutUnknown_0=ruleCompareWithoutUnknown();

                    state._fsp--;


                    		current.merge(this_CompareWithoutUnknown_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:646:2: kw= '=?'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleCompare1502); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompareAccess().getEqualsSignQuestionMarkKeyword_1()); 
                        

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
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRuleCompareWithoutUnknown"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:659:1: entryRuleCompareWithoutUnknown returns [String current=null] : iv_ruleCompareWithoutUnknown= ruleCompareWithoutUnknown EOF ;
    public final String entryRuleCompareWithoutUnknown() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompareWithoutUnknown = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:660:2: (iv_ruleCompareWithoutUnknown= ruleCompareWithoutUnknown EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:661:2: iv_ruleCompareWithoutUnknown= ruleCompareWithoutUnknown EOF
            {
             newCompositeNode(grammarAccess.getCompareWithoutUnknownRule()); 
            pushFollow(FOLLOW_ruleCompareWithoutUnknown_in_entryRuleCompareWithoutUnknown1543);
            iv_ruleCompareWithoutUnknown=ruleCompareWithoutUnknown();

            state._fsp--;

             current =iv_ruleCompareWithoutUnknown.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareWithoutUnknown1554); 

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
    // $ANTLR end "entryRuleCompareWithoutUnknown"


    // $ANTLR start "ruleCompareWithoutUnknown"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:668:1: ruleCompareWithoutUnknown returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '>' this_DECIMAL_1= ruleDECIMAL ) | (kw= '<' this_DECIMAL_3= ruleDECIMAL ) | (kw= '>=' this_DECIMAL_5= ruleDECIMAL ) | (kw= '<=' this_DECIMAL_7= ruleDECIMAL ) ) ;
    public final AntlrDatatypeRuleToken ruleCompareWithoutUnknown() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DECIMAL_1 = null;

        AntlrDatatypeRuleToken this_DECIMAL_3 = null;

        AntlrDatatypeRuleToken this_DECIMAL_5 = null;

        AntlrDatatypeRuleToken this_DECIMAL_7 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:671:28: ( ( (kw= '>' this_DECIMAL_1= ruleDECIMAL ) | (kw= '<' this_DECIMAL_3= ruleDECIMAL ) | (kw= '>=' this_DECIMAL_5= ruleDECIMAL ) | (kw= '<=' this_DECIMAL_7= ruleDECIMAL ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:672:1: ( (kw= '>' this_DECIMAL_1= ruleDECIMAL ) | (kw= '<' this_DECIMAL_3= ruleDECIMAL ) | (kw= '>=' this_DECIMAL_5= ruleDECIMAL ) | (kw= '<=' this_DECIMAL_7= ruleDECIMAL ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:672:1: ( (kw= '>' this_DECIMAL_1= ruleDECIMAL ) | (kw= '<' this_DECIMAL_3= ruleDECIMAL ) | (kw= '>=' this_DECIMAL_5= ruleDECIMAL ) | (kw= '<=' this_DECIMAL_7= ruleDECIMAL ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            case 27:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:672:2: (kw= '>' this_DECIMAL_1= ruleDECIMAL )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:672:2: (kw= '>' this_DECIMAL_1= ruleDECIMAL )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:673:2: kw= '>' this_DECIMAL_1= ruleDECIMAL
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleCompareWithoutUnknown1593); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompareWithoutUnknownAccess().getGreaterThanSignKeyword_0_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getCompareWithoutUnknownAccess().getDECIMALParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleDECIMAL_in_ruleCompareWithoutUnknown1615);
                    this_DECIMAL_1=ruleDECIMAL();

                    state._fsp--;


                    		current.merge(this_DECIMAL_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:690:6: (kw= '<' this_DECIMAL_3= ruleDECIMAL )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:690:6: (kw= '<' this_DECIMAL_3= ruleDECIMAL )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:691:2: kw= '<' this_DECIMAL_3= ruleDECIMAL
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleCompareWithoutUnknown1641); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompareWithoutUnknownAccess().getLessThanSignKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getCompareWithoutUnknownAccess().getDECIMALParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleDECIMAL_in_ruleCompareWithoutUnknown1663);
                    this_DECIMAL_3=ruleDECIMAL();

                    state._fsp--;


                    		current.merge(this_DECIMAL_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:708:6: (kw= '>=' this_DECIMAL_5= ruleDECIMAL )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:708:6: (kw= '>=' this_DECIMAL_5= ruleDECIMAL )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:709:2: kw= '>=' this_DECIMAL_5= ruleDECIMAL
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleCompareWithoutUnknown1689); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompareWithoutUnknownAccess().getGreaterThanSignEqualsSignKeyword_2_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getCompareWithoutUnknownAccess().getDECIMALParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleDECIMAL_in_ruleCompareWithoutUnknown1711);
                    this_DECIMAL_5=ruleDECIMAL();

                    state._fsp--;


                    		current.merge(this_DECIMAL_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:726:6: (kw= '<=' this_DECIMAL_7= ruleDECIMAL )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:726:6: (kw= '<=' this_DECIMAL_7= ruleDECIMAL )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:727:2: kw= '<=' this_DECIMAL_7= ruleDECIMAL
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleCompareWithoutUnknown1737); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompareWithoutUnknownAccess().getLessThanSignEqualsSignKeyword_3_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getCompareWithoutUnknownAccess().getDECIMALParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_ruleDECIMAL_in_ruleCompareWithoutUnknown1759);
                    this_DECIMAL_7=ruleDECIMAL();

                    state._fsp--;


                    		current.merge(this_DECIMAL_7);
                        
                     
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
    // $ANTLR end "ruleCompareWithoutUnknown"


    // $ANTLR start "entryRuleTimeBound"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:751:1: entryRuleTimeBound returns [String current=null] : iv_ruleTimeBound= ruleTimeBound EOF ;
    public final String entryRuleTimeBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeBound = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:752:2: (iv_ruleTimeBound= ruleTimeBound EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:753:2: iv_ruleTimeBound= ruleTimeBound EOF
            {
             newCompositeNode(grammarAccess.getTimeBoundRule()); 
            pushFollow(FOLLOW_ruleTimeBound_in_entryRuleTimeBound1806);
            iv_ruleTimeBound=ruleTimeBound();

            state._fsp--;

             current =iv_ruleTimeBound.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeBound1817); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:760:1: ruleTimeBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '>=' this_DECIMAL_1= ruleDECIMAL ) | (kw= '<=' this_DECIMAL_3= ruleDECIMAL ) | (kw= '[' this_DECIMAL_5= ruleDECIMAL kw= ',' this_DECIMAL_7= ruleDECIMAL kw= ']' ) )? ;
    public final AntlrDatatypeRuleToken ruleTimeBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DECIMAL_1 = null;

        AntlrDatatypeRuleToken this_DECIMAL_3 = null;

        AntlrDatatypeRuleToken this_DECIMAL_5 = null;

        AntlrDatatypeRuleToken this_DECIMAL_7 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:763:28: ( ( (kw= '>=' this_DECIMAL_1= ruleDECIMAL ) | (kw= '<=' this_DECIMAL_3= ruleDECIMAL ) | (kw= '[' this_DECIMAL_5= ruleDECIMAL kw= ',' this_DECIMAL_7= ruleDECIMAL kw= ']' ) )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:764:1: ( (kw= '>=' this_DECIMAL_1= ruleDECIMAL ) | (kw= '<=' this_DECIMAL_3= ruleDECIMAL ) | (kw= '[' this_DECIMAL_5= ruleDECIMAL kw= ',' this_DECIMAL_7= ruleDECIMAL kw= ']' ) )?
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:764:1: ( (kw= '>=' this_DECIMAL_1= ruleDECIMAL ) | (kw= '<=' this_DECIMAL_3= ruleDECIMAL ) | (kw= '[' this_DECIMAL_5= ruleDECIMAL kw= ',' this_DECIMAL_7= ruleDECIMAL kw= ']' ) )?
            int alt8=4;
            switch ( input.LA(1) ) {
                case 26:
                    {
                    alt8=1;
                    }
                    break;
                case 27:
                    {
                    alt8=2;
                    }
                    break;
                case 16:
                    {
                    alt8=3;
                    }
                    break;
            }

            switch (alt8) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:764:2: (kw= '>=' this_DECIMAL_1= ruleDECIMAL )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:764:2: (kw= '>=' this_DECIMAL_1= ruleDECIMAL )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:765:2: kw= '>=' this_DECIMAL_1= ruleDECIMAL
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleTimeBound1856); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeBoundAccess().getGreaterThanSignEqualsSignKeyword_0_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getTimeBoundAccess().getDECIMALParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleDECIMAL_in_ruleTimeBound1878);
                    this_DECIMAL_1=ruleDECIMAL();

                    state._fsp--;


                    		current.merge(this_DECIMAL_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:782:6: (kw= '<=' this_DECIMAL_3= ruleDECIMAL )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:782:6: (kw= '<=' this_DECIMAL_3= ruleDECIMAL )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:783:2: kw= '<=' this_DECIMAL_3= ruleDECIMAL
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleTimeBound1904); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeBoundAccess().getLessThanSignEqualsSignKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getTimeBoundAccess().getDECIMALParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleDECIMAL_in_ruleTimeBound1926);
                    this_DECIMAL_3=ruleDECIMAL();

                    state._fsp--;


                    		current.merge(this_DECIMAL_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:800:6: (kw= '[' this_DECIMAL_5= ruleDECIMAL kw= ',' this_DECIMAL_7= ruleDECIMAL kw= ']' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:800:6: (kw= '[' this_DECIMAL_5= ruleDECIMAL kw= ',' this_DECIMAL_7= ruleDECIMAL kw= ']' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:801:2: kw= '[' this_DECIMAL_5= ruleDECIMAL kw= ',' this_DECIMAL_7= ruleDECIMAL kw= ']'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleTimeBound1952); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeBoundAccess().getLeftSquareBracketKeyword_2_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getTimeBoundAccess().getDECIMALParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleDECIMAL_in_ruleTimeBound1974);
                    this_DECIMAL_5=ruleDECIMAL();

                    state._fsp--;


                    		current.merge(this_DECIMAL_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleTimeBound1992); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeBoundAccess().getCommaKeyword_2_2()); 
                        
                     
                            newCompositeNode(grammarAccess.getTimeBoundAccess().getDECIMALParserRuleCall_2_3()); 
                        
                    pushFollow(FOLLOW_ruleDECIMAL_in_ruleTimeBound2014);
                    this_DECIMAL_7=ruleDECIMAL();

                    state._fsp--;


                    		current.merge(this_DECIMAL_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleTimeBound2032); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeBoundAccess().getRightSquareBracketKeyword_2_4()); 
                        

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


    // $ANTLR start "entryRuleDECIMAL"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:848:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:849:2: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:850:2: iv_ruleDECIMAL= ruleDECIMAL EOF
            {
             newCompositeNode(grammarAccess.getDECIMALRule()); 
            pushFollow(FOLLOW_ruleDECIMAL_in_entryRuleDECIMAL2075);
            iv_ruleDECIMAL=ruleDECIMAL();

            state._fsp--;

             current =iv_ruleDECIMAL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDECIMAL2086); 

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
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:857:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:860:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:861:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:861:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:861:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDECIMAL2126); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:868:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==29) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:869:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleDECIMAL2145); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDECIMAL2160); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_1_1()); 
                        

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
    // $ANTLR end "ruleDECIMAL"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA1_eotS =
        "\27\uffff";
    static final String DFA1_eofS =
        "\27\uffff";
    static final String DFA1_minS =
        "\1\17\1\uffff\1\27\4\5\5\20\1\13\4\5\2\uffff\4\20";
    static final String DFA1_maxS =
        "\1\22\1\uffff\1\33\4\5\1\20\4\35\1\25\4\5\2\uffff\4\20";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\17\uffff\1\2\1\3\4\uffff";
    static final String DFA1_specialS =
        "\27\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\1\2\uffff\1\2",
            "",
            "\1\7\1\3\1\4\1\5\1\6",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\14\14\uffff\1\15",
            "\1\14\14\uffff\1\16",
            "\1\14\14\uffff\1\17",
            "\1\14\14\uffff\1\20",
            "\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "",
            "",
            "\1\14",
            "\1\14",
            "\1\14",
            "\1\14"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "80:1: ( ( (lv_start_0_0= ruleS ) ) | this_P_1= ruleP | this_PG_2= rulePG )";
        }
    }
    static final String DFA5_eotS =
        "\26\uffff";
    static final String DFA5_eofS =
        "\26\uffff";
    static final String DFA5_minS =
        "\1\22\1\27\4\5\5\20\1\13\4\5\2\uffff\4\20";
    static final String DFA5_maxS =
        "\1\22\1\33\4\5\1\20\4\35\1\23\4\5\2\uffff\4\20";
    static final String DFA5_acceptS =
        "\20\uffff\1\1\1\2\4\uffff";
    static final String DFA5_specialS =
        "\26\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\6\1\2\1\3\1\4\1\5",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\13\14\uffff\1\14",
            "\1\13\14\uffff\1\15",
            "\1\13\14\uffff\1\16",
            "\1\13\14\uffff\1\17",
            "\2\21\1\uffff\1\21\4\uffff\1\20",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "",
            "",
            "\1\13",
            "\1\13",
            "\1\13",
            "\1\13"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "377:1: ( (otherlv_0= 'P' ruleCompare otherlv_2= '[' otherlv_3= 'F' ruleTimeBound this_StateOrLabel_5= ruleStateOrLabel otherlv_6= ']' ) | (otherlv_7= 'P' ruleCompare otherlv_9= '[' ( (lv_LEFT_10_0= ruleStateOrLabel ) ) otherlv_11= 'U' ruleTimeBound ( (lv_RIGHT_13_0= ruleStateOrLabel ) ) otherlv_14= ']' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleStart_in_entryRuleStart75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStart85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleS_in_ruleStart131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleP_in_ruleStart159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePG_in_ruleStart186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleState269 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState298 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleState335 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleLabel442 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLabel454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel471 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLabel488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleLabel508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_entryRuleStateOrLabel567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateOrLabel577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_ruleStateOrLabel624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleStateOrLabel651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleS_in_entryRuleS686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleS696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleS733 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_ruleCompare_in_ruleS749 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleS760 = new BitSet(new long[]{0x0000000000005800L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_ruleS782 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleS793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleP_in_entryRuleP829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleP839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleP877 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_ruleCompare_in_ruleP893 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleP904 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleP916 = new BitSet(new long[]{0x000000000C015800L});
    public static final BitSet FOLLOW_ruleTimeBound_in_ruleP932 = new BitSet(new long[]{0x0000000000005800L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_ruleP953 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleP964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleP984 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_ruleCompare_in_ruleP1000 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleP1011 = new BitSet(new long[]{0x0000000000005800L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_ruleP1032 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleP1044 = new BitSet(new long[]{0x000000000C015800L});
    public static final BitSet FOLLOW_ruleTimeBound_in_ruleP1060 = new BitSet(new long[]{0x0000000000005800L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_ruleP1080 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleP1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePG_in_entryRulePG1129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePG1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePG1176 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_ruleCompare_in_rulePG1192 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePG1203 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePG1215 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulePG1227 = new BitSet(new long[]{0x0000000000005800L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_rulePG1248 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePG1260 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePG1272 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_ruleCompareWithoutUnknown_in_rulePG1288 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePG1299 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePG1311 = new BitSet(new long[]{0x000000000C015800L});
    public static final BitSet FOLLOW_ruleTimeBound_in_rulePG1327 = new BitSet(new long[]{0x0000000000005800L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_rulePG1347 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePG1359 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePG1371 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePG1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_entryRuleCompare1420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompare1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareWithoutUnknown_in_ruleCompare1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCompare1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareWithoutUnknown_in_entryRuleCompareWithoutUnknown1543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareWithoutUnknown1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCompareWithoutUnknown1593 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_ruleCompareWithoutUnknown1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCompareWithoutUnknown1641 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_ruleCompareWithoutUnknown1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCompareWithoutUnknown1689 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_ruleCompareWithoutUnknown1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCompareWithoutUnknown1737 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_ruleCompareWithoutUnknown1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_entryRuleTimeBound1806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeBound1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTimeBound1856 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_ruleTimeBound1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleTimeBound1904 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_ruleTimeBound1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTimeBound1952 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_ruleTimeBound1974 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTimeBound1992 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_ruleTimeBound2014 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTimeBound2032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_entryRuleDECIMAL2075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDECIMAL2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDECIMAL2126 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleDECIMAL2145 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDECIMAL2160 = new BitSet(new long[]{0x0000000000000002L});

}