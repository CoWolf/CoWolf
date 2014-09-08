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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "'State:'", "')'", "'Label:'", "'S'", "'['", "']'", "'P'", "'X'", "'F'", "'G'", "'=>'", "'U'", "'W'", "'R'", "'=?'", "'>'", "'<'", "'>='", "'<='", "'='", "','", "'.'"
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
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:76:1: ruleStart returns [EObject current=null] : ( ( (lv_start_0_0= ruleS ) ) | this_P1_1= ruleP1 ) ;
    public final EObject ruleStart() throws RecognitionException {
        EObject current = null;

        EObject lv_start_0_0 = null;

        EObject this_P1_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:79:28: ( ( ( (lv_start_0_0= ruleS ) ) | this_P1_1= ruleP1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:80:1: ( ( (lv_start_0_0= ruleS ) ) | this_P1_1= ruleP1 )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:80:1: ( ( (lv_start_0_0= ruleS ) ) | this_P1_1= ruleP1 )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:100:5: this_P1_1= ruleP1
                    {
                     
                            newCompositeNode(grammarAccess.getStartAccess().getP1ParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleP1_in_ruleStart159);
                    this_P1_1=ruleP1();

                    state._fsp--;

                     
                            current = this_P1_1; 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:116:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:117:2: (iv_ruleState= ruleState EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:118:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState194);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState204); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:125:1: ruleState returns [EObject current=null] : ( (otherlv_0= '(' otherlv_1= 'State:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'State:' ( (lv_name_5_0= RULE_ID ) ) ) ) ;
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
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:128:28: ( ( (otherlv_0= '(' otherlv_1= 'State:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'State:' ( (lv_name_5_0= RULE_ID ) ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:129:1: ( (otherlv_0= '(' otherlv_1= 'State:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'State:' ( (lv_name_5_0= RULE_ID ) ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:129:1: ( (otherlv_0= '(' otherlv_1= 'State:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'State:' ( (lv_name_5_0= RULE_ID ) ) ) )
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:129:2: (otherlv_0= '(' otherlv_1= 'State:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:129:2: (otherlv_0= '(' otherlv_1= 'State:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:129:4: otherlv_0= '(' otherlv_1= 'State:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleState242); 

                        	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getLeftParenthesisKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleState254); 

                        	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_0_1());
                        
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:137:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:138:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:138:1: (lv_name_2_0= RULE_ID )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:139:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState271); 

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

                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleState288); 

                        	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getRightParenthesisKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:160:6: (otherlv_4= 'State:' ( (lv_name_5_0= RULE_ID ) ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:160:6: (otherlv_4= 'State:' ( (lv_name_5_0= RULE_ID ) ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:160:8: otherlv_4= 'State:' ( (lv_name_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleState308); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getStateKeyword_1_0());
                        
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:164:1: ( (lv_name_5_0= RULE_ID ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:165:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:165:1: (lv_name_5_0= RULE_ID )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:166:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState325); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:190:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:191:2: (iv_ruleLabel= ruleLabel EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:192:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel367);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel377); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:199:1: ruleLabel returns [EObject current=null] : ( (otherlv_0= '(' otherlv_1= 'Label:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'Label:' ( (lv_name_5_0= RULE_ID ) ) ) ) ;
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
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:202:28: ( ( (otherlv_0= '(' otherlv_1= 'Label:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'Label:' ( (lv_name_5_0= RULE_ID ) ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:203:1: ( (otherlv_0= '(' otherlv_1= 'Label:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'Label:' ( (lv_name_5_0= RULE_ID ) ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:203:1: ( (otherlv_0= '(' otherlv_1= 'Label:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' ) | (otherlv_4= 'Label:' ( (lv_name_5_0= RULE_ID ) ) ) )
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:203:2: (otherlv_0= '(' otherlv_1= 'Label:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:203:2: (otherlv_0= '(' otherlv_1= 'Label:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:203:4: otherlv_0= '(' otherlv_1= 'Label:' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ')'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleLabel415); 

                        	newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLeftParenthesisKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleLabel427); 

                        	newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getLabelKeyword_0_1());
                        
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:211:1: ( (lv_name_2_0= RULE_ID ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:212:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:212:1: (lv_name_2_0= RULE_ID )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:213:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel444); 

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

                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleLabel461); 

                        	newLeafNode(otherlv_3, grammarAccess.getLabelAccess().getRightParenthesisKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:234:6: (otherlv_4= 'Label:' ( (lv_name_5_0= RULE_ID ) ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:234:6: (otherlv_4= 'Label:' ( (lv_name_5_0= RULE_ID ) ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:234:8: otherlv_4= 'Label:' ( (lv_name_5_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleLabel481); 

                        	newLeafNode(otherlv_4, grammarAccess.getLabelAccess().getLabelKeyword_1_0());
                        
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:238:1: ( (lv_name_5_0= RULE_ID ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:239:1: (lv_name_5_0= RULE_ID )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:239:1: (lv_name_5_0= RULE_ID )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:240:3: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabel498); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:264:1: entryRuleStateOrLabel returns [EObject current=null] : iv_ruleStateOrLabel= ruleStateOrLabel EOF ;
    public final EObject entryRuleStateOrLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateOrLabel = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:265:2: (iv_ruleStateOrLabel= ruleStateOrLabel EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:266:2: iv_ruleStateOrLabel= ruleStateOrLabel EOF
            {
             newCompositeNode(grammarAccess.getStateOrLabelRule()); 
            pushFollow(FOLLOW_ruleStateOrLabel_in_entryRuleStateOrLabel540);
            iv_ruleStateOrLabel=ruleStateOrLabel();

            state._fsp--;

             current =iv_ruleStateOrLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateOrLabel550); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:273:1: ruleStateOrLabel returns [EObject current=null] : (this_State_0= ruleState | this_Label_1= ruleLabel ) ;
    public final EObject ruleStateOrLabel() throws RecognitionException {
        EObject current = null;

        EObject this_State_0 = null;

        EObject this_Label_1 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:276:28: ( (this_State_0= ruleState | this_Label_1= ruleLabel ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:277:1: (this_State_0= ruleState | this_Label_1= ruleLabel )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:277:1: (this_State_0= ruleState | this_Label_1= ruleLabel )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==12) ) {
                    alt4=1;
                }
                else if ( (LA4_1==14) ) {
                    alt4=2;
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:278:5: this_State_0= ruleState
                    {
                     
                            newCompositeNode(grammarAccess.getStateOrLabelAccess().getStateParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleState_in_ruleStateOrLabel597);
                    this_State_0=ruleState();

                    state._fsp--;

                     
                            current = this_State_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:288:5: this_Label_1= ruleLabel
                    {
                     
                            newCompositeNode(grammarAccess.getStateOrLabelAccess().getLabelParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLabel_in_ruleStateOrLabel624);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:304:1: entryRuleS returns [EObject current=null] : iv_ruleS= ruleS EOF ;
    public final EObject entryRuleS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleS = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:305:2: (iv_ruleS= ruleS EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:306:2: iv_ruleS= ruleS EOF
            {
             newCompositeNode(grammarAccess.getSRule()); 
            pushFollow(FOLLOW_ruleS_in_entryRuleS659);
            iv_ruleS=ruleS();

            state._fsp--;

             current =iv_ruleS; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleS669); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:313:1: ruleS returns [EObject current=null] : (otherlv_0= 'S' ruleCompare otherlv_2= '[' this_StateOrLabel_3= ruleStateOrLabel otherlv_4= ']' ) ;
    public final EObject ruleS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_StateOrLabel_3 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:316:28: ( (otherlv_0= 'S' ruleCompare otherlv_2= '[' this_StateOrLabel_3= ruleStateOrLabel otherlv_4= ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:317:1: (otherlv_0= 'S' ruleCompare otherlv_2= '[' this_StateOrLabel_3= ruleStateOrLabel otherlv_4= ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:317:1: (otherlv_0= 'S' ruleCompare otherlv_2= '[' this_StateOrLabel_3= ruleStateOrLabel otherlv_4= ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:317:3: otherlv_0= 'S' ruleCompare otherlv_2= '[' this_StateOrLabel_3= ruleStateOrLabel otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleS706); 

                	newLeafNode(otherlv_0, grammarAccess.getSAccess().getSKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getSAccess().getCompareParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleCompare_in_ruleS722);
            ruleCompare();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleS733); 

                	newLeafNode(otherlv_2, grammarAccess.getSAccess().getLeftSquareBracketKeyword_2());
                
             
                    newCompositeNode(grammarAccess.getSAccess().getStateOrLabelParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleStateOrLabel_in_ruleS755);
            this_StateOrLabel_3=ruleStateOrLabel();

            state._fsp--;

             
                    current = this_StateOrLabel_3; 
                    afterParserOrEnumRuleCall();
                
            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleS766); 

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


    // $ANTLR start "entryRuleP1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:354:1: entryRuleP1 returns [EObject current=null] : iv_ruleP1= ruleP1 EOF ;
    public final EObject entryRuleP1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleP1 = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:355:2: (iv_ruleP1= ruleP1 EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:356:2: iv_ruleP1= ruleP1 EOF
            {
             newCompositeNode(grammarAccess.getP1Rule()); 
            pushFollow(FOLLOW_ruleP1_in_entryRuleP1802);
            iv_ruleP1=ruleP1();

            state._fsp--;

             current =iv_ruleP1; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleP1812); 

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
    // $ANTLR end "entryRuleP1"


    // $ANTLR start "ruleP1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:363:1: ruleP1 returns [EObject current=null] : (otherlv_0= 'P' ruleCompare otherlv_2= '[' (this_P_3= ruleP | this_S_4= ruleS | this_F_5= ruleF | this_U_6= ruleU | this_G_7= ruleG | ( ruleX this_StateOrLabel_9= ruleStateOrLabel ) ) otherlv_10= ']' ) ;
    public final EObject ruleP1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_10=null;
        EObject this_P_3 = null;

        EObject this_S_4 = null;

        EObject this_F_5 = null;

        EObject this_U_6 = null;

        EObject this_G_7 = null;

        EObject this_StateOrLabel_9 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:366:28: ( (otherlv_0= 'P' ruleCompare otherlv_2= '[' (this_P_3= ruleP | this_S_4= ruleS | this_F_5= ruleF | this_U_6= ruleU | this_G_7= ruleG | ( ruleX this_StateOrLabel_9= ruleStateOrLabel ) ) otherlv_10= ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:367:1: (otherlv_0= 'P' ruleCompare otherlv_2= '[' (this_P_3= ruleP | this_S_4= ruleS | this_F_5= ruleF | this_U_6= ruleU | this_G_7= ruleG | ( ruleX this_StateOrLabel_9= ruleStateOrLabel ) ) otherlv_10= ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:367:1: (otherlv_0= 'P' ruleCompare otherlv_2= '[' (this_P_3= ruleP | this_S_4= ruleS | this_F_5= ruleF | this_U_6= ruleU | this_G_7= ruleG | ( ruleX this_StateOrLabel_9= ruleStateOrLabel ) ) otherlv_10= ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:367:3: otherlv_0= 'P' ruleCompare otherlv_2= '[' (this_P_3= ruleP | this_S_4= ruleS | this_F_5= ruleF | this_U_6= ruleU | this_G_7= ruleG | ( ruleX this_StateOrLabel_9= ruleStateOrLabel ) ) otherlv_10= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleP1849); 

                	newLeafNode(otherlv_0, grammarAccess.getP1Access().getPKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getP1Access().getCompareParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleCompare_in_ruleP1865);
            ruleCompare();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleP1876); 

                	newLeafNode(otherlv_2, grammarAccess.getP1Access().getLeftSquareBracketKeyword_2());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:383:1: (this_P_3= ruleP | this_S_4= ruleS | this_F_5= ruleF | this_U_6= ruleU | this_G_7= ruleG | ( ruleX this_StateOrLabel_9= ruleStateOrLabel ) )
            int alt5=6;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:384:5: this_P_3= ruleP
                    {
                     
                            newCompositeNode(grammarAccess.getP1Access().getPParserRuleCall_3_0()); 
                        
                    pushFollow(FOLLOW_ruleP_in_ruleP1899);
                    this_P_3=ruleP();

                    state._fsp--;

                     
                            current = this_P_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:394:5: this_S_4= ruleS
                    {
                     
                            newCompositeNode(grammarAccess.getP1Access().getSParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_ruleS_in_ruleP1926);
                    this_S_4=ruleS();

                    state._fsp--;

                     
                            current = this_S_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:404:5: this_F_5= ruleF
                    {
                     
                            newCompositeNode(grammarAccess.getP1Access().getFParserRuleCall_3_2()); 
                        
                    pushFollow(FOLLOW_ruleF_in_ruleP1953);
                    this_F_5=ruleF();

                    state._fsp--;

                     
                            current = this_F_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:414:5: this_U_6= ruleU
                    {
                     
                            newCompositeNode(grammarAccess.getP1Access().getUParserRuleCall_3_3()); 
                        
                    pushFollow(FOLLOW_ruleU_in_ruleP1980);
                    this_U_6=ruleU();

                    state._fsp--;

                     
                            current = this_U_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:424:5: this_G_7= ruleG
                    {
                     
                            newCompositeNode(grammarAccess.getP1Access().getGParserRuleCall_3_4()); 
                        
                    pushFollow(FOLLOW_ruleG_in_ruleP11007);
                    this_G_7=ruleG();

                    state._fsp--;

                     
                            current = this_G_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:433:6: ( ruleX this_StateOrLabel_9= ruleStateOrLabel )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:433:6: ( ruleX this_StateOrLabel_9= ruleStateOrLabel )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:434:5: ruleX this_StateOrLabel_9= ruleStateOrLabel
                    {
                     
                            newCompositeNode(grammarAccess.getP1Access().getXParserRuleCall_3_5_0()); 
                        
                    pushFollow(FOLLOW_ruleX_in_ruleP11029);
                    ruleX();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getP1Access().getStateOrLabelParserRuleCall_3_5_1()); 
                        
                    pushFollow(FOLLOW_ruleStateOrLabel_in_ruleP11050);
                    this_StateOrLabel_9=ruleStateOrLabel();

                    state._fsp--;

                     
                            current = this_StateOrLabel_9; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleP11063); 

                	newLeafNode(otherlv_10, grammarAccess.getP1Access().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleP1"


    // $ANTLR start "entryRuleP"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:462:1: entryRuleP returns [EObject current=null] : iv_ruleP= ruleP EOF ;
    public final EObject entryRuleP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleP = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:463:2: (iv_ruleP= ruleP EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:464:2: iv_ruleP= ruleP EOF
            {
             newCompositeNode(grammarAccess.getPRule()); 
            pushFollow(FOLLOW_ruleP_in_entryRuleP1099);
            iv_ruleP=ruleP();

            state._fsp--;

             current =iv_ruleP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleP1109); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:471:1: ruleP returns [EObject current=null] : (otherlv_0= 'P' ruleCompareWithoutUnknown otherlv_2= '[' (this_P_3= ruleP | this_S_4= ruleS | this_F_5= ruleF | this_U_6= ruleU | this_G_7= ruleG | ( ruleX this_StateOrLabel_9= ruleStateOrLabel ) ) otherlv_10= ']' ) ;
    public final EObject ruleP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_10=null;
        EObject this_P_3 = null;

        EObject this_S_4 = null;

        EObject this_F_5 = null;

        EObject this_U_6 = null;

        EObject this_G_7 = null;

        EObject this_StateOrLabel_9 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:474:28: ( (otherlv_0= 'P' ruleCompareWithoutUnknown otherlv_2= '[' (this_P_3= ruleP | this_S_4= ruleS | this_F_5= ruleF | this_U_6= ruleU | this_G_7= ruleG | ( ruleX this_StateOrLabel_9= ruleStateOrLabel ) ) otherlv_10= ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:475:1: (otherlv_0= 'P' ruleCompareWithoutUnknown otherlv_2= '[' (this_P_3= ruleP | this_S_4= ruleS | this_F_5= ruleF | this_U_6= ruleU | this_G_7= ruleG | ( ruleX this_StateOrLabel_9= ruleStateOrLabel ) ) otherlv_10= ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:475:1: (otherlv_0= 'P' ruleCompareWithoutUnknown otherlv_2= '[' (this_P_3= ruleP | this_S_4= ruleS | this_F_5= ruleF | this_U_6= ruleU | this_G_7= ruleG | ( ruleX this_StateOrLabel_9= ruleStateOrLabel ) ) otherlv_10= ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:475:3: otherlv_0= 'P' ruleCompareWithoutUnknown otherlv_2= '[' (this_P_3= ruleP | this_S_4= ruleS | this_F_5= ruleF | this_U_6= ruleU | this_G_7= ruleG | ( ruleX this_StateOrLabel_9= ruleStateOrLabel ) ) otherlv_10= ']'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleP1146); 

                	newLeafNode(otherlv_0, grammarAccess.getPAccess().getPKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getPAccess().getCompareWithoutUnknownParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleCompareWithoutUnknown_in_ruleP1162);
            ruleCompareWithoutUnknown();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleP1173); 

                	newLeafNode(otherlv_2, grammarAccess.getPAccess().getLeftSquareBracketKeyword_2());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:491:1: (this_P_3= ruleP | this_S_4= ruleS | this_F_5= ruleF | this_U_6= ruleU | this_G_7= ruleG | ( ruleX this_StateOrLabel_9= ruleStateOrLabel ) )
            int alt6=6;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:492:5: this_P_3= ruleP
                    {
                     
                            newCompositeNode(grammarAccess.getPAccess().getPParserRuleCall_3_0()); 
                        
                    pushFollow(FOLLOW_ruleP_in_ruleP1196);
                    this_P_3=ruleP();

                    state._fsp--;

                     
                            current = this_P_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:502:5: this_S_4= ruleS
                    {
                     
                            newCompositeNode(grammarAccess.getPAccess().getSParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_ruleS_in_ruleP1223);
                    this_S_4=ruleS();

                    state._fsp--;

                     
                            current = this_S_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:512:5: this_F_5= ruleF
                    {
                     
                            newCompositeNode(grammarAccess.getPAccess().getFParserRuleCall_3_2()); 
                        
                    pushFollow(FOLLOW_ruleF_in_ruleP1250);
                    this_F_5=ruleF();

                    state._fsp--;

                     
                            current = this_F_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:522:5: this_U_6= ruleU
                    {
                     
                            newCompositeNode(grammarAccess.getPAccess().getUParserRuleCall_3_3()); 
                        
                    pushFollow(FOLLOW_ruleU_in_ruleP1277);
                    this_U_6=ruleU();

                    state._fsp--;

                     
                            current = this_U_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:532:5: this_G_7= ruleG
                    {
                     
                            newCompositeNode(grammarAccess.getPAccess().getGParserRuleCall_3_4()); 
                        
                    pushFollow(FOLLOW_ruleG_in_ruleP1304);
                    this_G_7=ruleG();

                    state._fsp--;

                     
                            current = this_G_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:541:6: ( ruleX this_StateOrLabel_9= ruleStateOrLabel )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:541:6: ( ruleX this_StateOrLabel_9= ruleStateOrLabel )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:542:5: ruleX this_StateOrLabel_9= ruleStateOrLabel
                    {
                     
                            newCompositeNode(grammarAccess.getPAccess().getXParserRuleCall_3_5_0()); 
                        
                    pushFollow(FOLLOW_ruleX_in_ruleP1326);
                    ruleX();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getPAccess().getStateOrLabelParserRuleCall_3_5_1()); 
                        
                    pushFollow(FOLLOW_ruleStateOrLabel_in_ruleP1347);
                    this_StateOrLabel_9=ruleStateOrLabel();

                    state._fsp--;

                     
                            current = this_StateOrLabel_9; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleP1360); 

                	newLeafNode(otherlv_10, grammarAccess.getPAccess().getRightSquareBracketKeyword_4());
                

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


    // $ANTLR start "entryRuleX"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:570:1: entryRuleX returns [String current=null] : iv_ruleX= ruleX EOF ;
    public final String entryRuleX() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleX = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:571:2: (iv_ruleX= ruleX EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:572:2: iv_ruleX= ruleX EOF
            {
             newCompositeNode(grammarAccess.getXRule()); 
            pushFollow(FOLLOW_ruleX_in_entryRuleX1397);
            iv_ruleX=ruleX();

            state._fsp--;

             current =iv_ruleX.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleX1408); 

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
    // $ANTLR end "entryRuleX"


    // $ANTLR start "ruleX"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:579:1: ruleX returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'X' )* ;
    public final AntlrDatatypeRuleToken ruleX() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:582:28: ( (kw= 'X' )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:583:1: (kw= 'X' )*
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:583:1: (kw= 'X' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:584:2: kw= 'X'
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleX1446); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getXAccess().getXKeyword()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleX"


    // $ANTLR start "entryRuleF"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:597:1: entryRuleF returns [EObject current=null] : iv_ruleF= ruleF EOF ;
    public final EObject entryRuleF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleF = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:598:2: (iv_ruleF= ruleF EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:599:2: iv_ruleF= ruleF EOF
            {
             newCompositeNode(grammarAccess.getFRule()); 
            pushFollow(FOLLOW_ruleF_in_entryRuleF1487);
            iv_ruleF=ruleF();

            state._fsp--;

             current =iv_ruleF; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleF1497); 

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
    // $ANTLR end "entryRuleF"


    // $ANTLR start "ruleF"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:606:1: ruleF returns [EObject current=null] : (otherlv_0= 'F' ( ruleTimeBound ruleX ) ( (lv_RIGHT_3_0= ruleStateOrLabel ) ) ) ;
    public final EObject ruleF() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_RIGHT_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:609:28: ( (otherlv_0= 'F' ( ruleTimeBound ruleX ) ( (lv_RIGHT_3_0= ruleStateOrLabel ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:610:1: (otherlv_0= 'F' ( ruleTimeBound ruleX ) ( (lv_RIGHT_3_0= ruleStateOrLabel ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:610:1: (otherlv_0= 'F' ( ruleTimeBound ruleX ) ( (lv_RIGHT_3_0= ruleStateOrLabel ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:610:3: otherlv_0= 'F' ( ruleTimeBound ruleX ) ( (lv_RIGHT_3_0= ruleStateOrLabel ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleF1534); 

                	newLeafNode(otherlv_0, grammarAccess.getFAccess().getFKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:614:1: ( ruleTimeBound ruleX )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:615:5: ruleTimeBound ruleX
            {
             
                    newCompositeNode(grammarAccess.getFAccess().getTimeBoundParserRuleCall_1_0()); 
                
            pushFollow(FOLLOW_ruleTimeBound_in_ruleF1551);
            ruleTimeBound();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getFAccess().getXParserRuleCall_1_1()); 
                
            pushFollow(FOLLOW_ruleX_in_ruleF1566);
            ruleX();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:630:2: ( (lv_RIGHT_3_0= ruleStateOrLabel ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:631:1: (lv_RIGHT_3_0= ruleStateOrLabel )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:631:1: (lv_RIGHT_3_0= ruleStateOrLabel )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:632:3: lv_RIGHT_3_0= ruleStateOrLabel
            {
             
            	        newCompositeNode(grammarAccess.getFAccess().getRIGHTStateOrLabelParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStateOrLabel_in_ruleF1587);
            lv_RIGHT_3_0=ruleStateOrLabel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFRule());
            	        }
                   		set(
                   			current, 
                   			"RIGHT",
                    		lv_RIGHT_3_0, 
                    		"StateOrLabel");
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
    // $ANTLR end "ruleF"


    // $ANTLR start "entryRuleG"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:656:1: entryRuleG returns [EObject current=null] : iv_ruleG= ruleG EOF ;
    public final EObject entryRuleG() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleG = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:657:2: (iv_ruleG= ruleG EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:658:2: iv_ruleG= ruleG EOF
            {
             newCompositeNode(grammarAccess.getGRule()); 
            pushFollow(FOLLOW_ruleG_in_entryRuleG1623);
            iv_ruleG=ruleG();

            state._fsp--;

             current =iv_ruleG; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleG1633); 

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
    // $ANTLR end "entryRuleG"


    // $ANTLR start "ruleG"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:665:1: ruleG returns [EObject current=null] : (otherlv_0= 'G' ( ruleTimeBound ruleX ) otherlv_3= '(' ( (lv_LEFT_4_0= ruleStateOrLabel ) ) otherlv_5= '=>' ( (lv_RIGHT_6_0= ruleP ) ) otherlv_7= ')' ) ;
    public final EObject ruleG() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_LEFT_4_0 = null;

        EObject lv_RIGHT_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:668:28: ( (otherlv_0= 'G' ( ruleTimeBound ruleX ) otherlv_3= '(' ( (lv_LEFT_4_0= ruleStateOrLabel ) ) otherlv_5= '=>' ( (lv_RIGHT_6_0= ruleP ) ) otherlv_7= ')' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:669:1: (otherlv_0= 'G' ( ruleTimeBound ruleX ) otherlv_3= '(' ( (lv_LEFT_4_0= ruleStateOrLabel ) ) otherlv_5= '=>' ( (lv_RIGHT_6_0= ruleP ) ) otherlv_7= ')' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:669:1: (otherlv_0= 'G' ( ruleTimeBound ruleX ) otherlv_3= '(' ( (lv_LEFT_4_0= ruleStateOrLabel ) ) otherlv_5= '=>' ( (lv_RIGHT_6_0= ruleP ) ) otherlv_7= ')' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:669:3: otherlv_0= 'G' ( ruleTimeBound ruleX ) otherlv_3= '(' ( (lv_LEFT_4_0= ruleStateOrLabel ) ) otherlv_5= '=>' ( (lv_RIGHT_6_0= ruleP ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleG1670); 

                	newLeafNode(otherlv_0, grammarAccess.getGAccess().getGKeyword_0());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:673:1: ( ruleTimeBound ruleX )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:674:5: ruleTimeBound ruleX
            {
             
                    newCompositeNode(grammarAccess.getGAccess().getTimeBoundParserRuleCall_1_0()); 
                
            pushFollow(FOLLOW_ruleTimeBound_in_ruleG1687);
            ruleTimeBound();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getGAccess().getXParserRuleCall_1_1()); 
                
            pushFollow(FOLLOW_ruleX_in_ruleG1702);
            ruleX();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }

            otherlv_3=(Token)match(input,11,FOLLOW_11_in_ruleG1714); 

                	newLeafNode(otherlv_3, grammarAccess.getGAccess().getLeftParenthesisKeyword_2());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:693:1: ( (lv_LEFT_4_0= ruleStateOrLabel ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:694:1: (lv_LEFT_4_0= ruleStateOrLabel )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:694:1: (lv_LEFT_4_0= ruleStateOrLabel )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:695:3: lv_LEFT_4_0= ruleStateOrLabel
            {
             
            	        newCompositeNode(grammarAccess.getGAccess().getLEFTStateOrLabelParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStateOrLabel_in_ruleG1735);
            lv_LEFT_4_0=ruleStateOrLabel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGRule());
            	        }
                   		set(
                   			current, 
                   			"LEFT",
                    		lv_LEFT_4_0, 
                    		"StateOrLabel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleG1747); 

                	newLeafNode(otherlv_5, grammarAccess.getGAccess().getEqualsSignGreaterThanSignKeyword_4());
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:715:1: ( (lv_RIGHT_6_0= ruleP ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:716:1: (lv_RIGHT_6_0= ruleP )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:716:1: (lv_RIGHT_6_0= ruleP )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:717:3: lv_RIGHT_6_0= ruleP
            {
             
            	        newCompositeNode(grammarAccess.getGAccess().getRIGHTPParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleP_in_ruleG1768);
            lv_RIGHT_6_0=ruleP();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGRule());
            	        }
                   		set(
                   			current, 
                   			"RIGHT",
                    		lv_RIGHT_6_0, 
                    		"P");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleG1780); 

                	newLeafNode(otherlv_7, grammarAccess.getGAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleG"


    // $ANTLR start "entryRuleU"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:745:1: entryRuleU returns [EObject current=null] : iv_ruleU= ruleU EOF ;
    public final EObject entryRuleU() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleU = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:746:2: (iv_ruleU= ruleU EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:747:2: iv_ruleU= ruleU EOF
            {
             newCompositeNode(grammarAccess.getURule()); 
            pushFollow(FOLLOW_ruleU_in_entryRuleU1816);
            iv_ruleU=ruleU();

            state._fsp--;

             current =iv_ruleU; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleU1826); 

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
    // $ANTLR end "entryRuleU"


    // $ANTLR start "ruleU"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:754:1: ruleU returns [EObject current=null] : ( ( (lv_LEFT_0_0= ruleStateOrLabel ) ) (otherlv_1= 'U' | otherlv_2= 'W' | otherlv_3= 'R' ) ( ruleTimeBound ruleX ) ( (lv_RIGHT_6_0= ruleStateOrLabel ) ) ) ;
    public final EObject ruleU() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_LEFT_0_0 = null;

        EObject lv_RIGHT_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:757:28: ( ( ( (lv_LEFT_0_0= ruleStateOrLabel ) ) (otherlv_1= 'U' | otherlv_2= 'W' | otherlv_3= 'R' ) ( ruleTimeBound ruleX ) ( (lv_RIGHT_6_0= ruleStateOrLabel ) ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:758:1: ( ( (lv_LEFT_0_0= ruleStateOrLabel ) ) (otherlv_1= 'U' | otherlv_2= 'W' | otherlv_3= 'R' ) ( ruleTimeBound ruleX ) ( (lv_RIGHT_6_0= ruleStateOrLabel ) ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:758:1: ( ( (lv_LEFT_0_0= ruleStateOrLabel ) ) (otherlv_1= 'U' | otherlv_2= 'W' | otherlv_3= 'R' ) ( ruleTimeBound ruleX ) ( (lv_RIGHT_6_0= ruleStateOrLabel ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:758:2: ( (lv_LEFT_0_0= ruleStateOrLabel ) ) (otherlv_1= 'U' | otherlv_2= 'W' | otherlv_3= 'R' ) ( ruleTimeBound ruleX ) ( (lv_RIGHT_6_0= ruleStateOrLabel ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:758:2: ( (lv_LEFT_0_0= ruleStateOrLabel ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:759:1: (lv_LEFT_0_0= ruleStateOrLabel )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:759:1: (lv_LEFT_0_0= ruleStateOrLabel )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:760:3: lv_LEFT_0_0= ruleStateOrLabel
            {
             
            	        newCompositeNode(grammarAccess.getUAccess().getLEFTStateOrLabelParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleStateOrLabel_in_ruleU1872);
            lv_LEFT_0_0=ruleStateOrLabel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getURule());
            	        }
                   		set(
                   			current, 
                   			"LEFT",
                    		lv_LEFT_0_0, 
                    		"StateOrLabel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:776:2: (otherlv_1= 'U' | otherlv_2= 'W' | otherlv_3= 'R' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:776:4: otherlv_1= 'U'
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleU1885); 

                        	newLeafNode(otherlv_1, grammarAccess.getUAccess().getUKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:781:7: otherlv_2= 'W'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleU1903); 

                        	newLeafNode(otherlv_2, grammarAccess.getUAccess().getWKeyword_1_1());
                        

                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:786:7: otherlv_3= 'R'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleU1921); 

                        	newLeafNode(otherlv_3, grammarAccess.getUAccess().getRKeyword_1_2());
                        

                    }
                    break;

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:790:2: ( ruleTimeBound ruleX )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:791:5: ruleTimeBound ruleX
            {
             
                    newCompositeNode(grammarAccess.getUAccess().getTimeBoundParserRuleCall_2_0()); 
                
            pushFollow(FOLLOW_ruleTimeBound_in_ruleU1939);
            ruleTimeBound();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getUAccess().getXParserRuleCall_2_1()); 
                
            pushFollow(FOLLOW_ruleX_in_ruleU1954);
            ruleX();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                

            }

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:806:2: ( (lv_RIGHT_6_0= ruleStateOrLabel ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:807:1: (lv_RIGHT_6_0= ruleStateOrLabel )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:807:1: (lv_RIGHT_6_0= ruleStateOrLabel )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:808:3: lv_RIGHT_6_0= ruleStateOrLabel
            {
             
            	        newCompositeNode(grammarAccess.getUAccess().getRIGHTStateOrLabelParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStateOrLabel_in_ruleU1975);
            lv_RIGHT_6_0=ruleStateOrLabel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getURule());
            	        }
                   		set(
                   			current, 
                   			"RIGHT",
                    		lv_RIGHT_6_0, 
                    		"StateOrLabel");
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
    // $ANTLR end "ruleU"


    // $ANTLR start "entryRuleCompare"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:832:1: entryRuleCompare returns [String current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final String entryRuleCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompare = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:833:2: (iv_ruleCompare= ruleCompare EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:834:2: iv_ruleCompare= ruleCompare EOF
            {
             newCompositeNode(grammarAccess.getCompareRule()); 
            pushFollow(FOLLOW_ruleCompare_in_entryRuleCompare2012);
            iv_ruleCompare=ruleCompare();

            state._fsp--;

             current =iv_ruleCompare.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompare2023); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:841:1: ruleCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CompareWithoutUnknown_0= ruleCompareWithoutUnknown | kw= '=?' ) ;
    public final AntlrDatatypeRuleToken ruleCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CompareWithoutUnknown_0 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:844:28: ( (this_CompareWithoutUnknown_0= ruleCompareWithoutUnknown | kw= '=?' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:845:1: (this_CompareWithoutUnknown_0= ruleCompareWithoutUnknown | kw= '=?' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:845:1: (this_CompareWithoutUnknown_0= ruleCompareWithoutUnknown | kw= '=?' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=27 && LA9_0<=30)) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:846:5: this_CompareWithoutUnknown_0= ruleCompareWithoutUnknown
                    {
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getCompareWithoutUnknownParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleCompareWithoutUnknown_in_ruleCompare2070);
                    this_CompareWithoutUnknown_0=ruleCompareWithoutUnknown();

                    state._fsp--;


                    		current.merge(this_CompareWithoutUnknown_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:858:2: kw= '=?'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleCompare2094); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:871:1: entryRuleCompareWithoutUnknown returns [String current=null] : iv_ruleCompareWithoutUnknown= ruleCompareWithoutUnknown EOF ;
    public final String entryRuleCompareWithoutUnknown() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompareWithoutUnknown = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:872:2: (iv_ruleCompareWithoutUnknown= ruleCompareWithoutUnknown EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:873:2: iv_ruleCompareWithoutUnknown= ruleCompareWithoutUnknown EOF
            {
             newCompositeNode(grammarAccess.getCompareWithoutUnknownRule()); 
            pushFollow(FOLLOW_ruleCompareWithoutUnknown_in_entryRuleCompareWithoutUnknown2135);
            iv_ruleCompareWithoutUnknown=ruleCompareWithoutUnknown();

            state._fsp--;

             current =iv_ruleCompareWithoutUnknown.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareWithoutUnknown2146); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:880:1: ruleCompareWithoutUnknown returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '>' this_DECIMAL_1= ruleDECIMAL ) | (kw= '<' this_DECIMAL_3= ruleDECIMAL ) | (kw= '>=' this_DECIMAL_5= ruleDECIMAL ) | (kw= '<=' this_DECIMAL_7= ruleDECIMAL ) ) ;
    public final AntlrDatatypeRuleToken ruleCompareWithoutUnknown() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DECIMAL_1 = null;

        AntlrDatatypeRuleToken this_DECIMAL_3 = null;

        AntlrDatatypeRuleToken this_DECIMAL_5 = null;

        AntlrDatatypeRuleToken this_DECIMAL_7 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:883:28: ( ( (kw= '>' this_DECIMAL_1= ruleDECIMAL ) | (kw= '<' this_DECIMAL_3= ruleDECIMAL ) | (kw= '>=' this_DECIMAL_5= ruleDECIMAL ) | (kw= '<=' this_DECIMAL_7= ruleDECIMAL ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:884:1: ( (kw= '>' this_DECIMAL_1= ruleDECIMAL ) | (kw= '<' this_DECIMAL_3= ruleDECIMAL ) | (kw= '>=' this_DECIMAL_5= ruleDECIMAL ) | (kw= '<=' this_DECIMAL_7= ruleDECIMAL ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:884:1: ( (kw= '>' this_DECIMAL_1= ruleDECIMAL ) | (kw= '<' this_DECIMAL_3= ruleDECIMAL ) | (kw= '>=' this_DECIMAL_5= ruleDECIMAL ) | (kw= '<=' this_DECIMAL_7= ruleDECIMAL ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt10=1;
                }
                break;
            case 28:
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:884:2: (kw= '>' this_DECIMAL_1= ruleDECIMAL )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:884:2: (kw= '>' this_DECIMAL_1= ruleDECIMAL )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:885:2: kw= '>' this_DECIMAL_1= ruleDECIMAL
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleCompareWithoutUnknown2185); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompareWithoutUnknownAccess().getGreaterThanSignKeyword_0_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getCompareWithoutUnknownAccess().getDECIMALParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleDECIMAL_in_ruleCompareWithoutUnknown2207);
                    this_DECIMAL_1=ruleDECIMAL();

                    state._fsp--;


                    		current.merge(this_DECIMAL_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:902:6: (kw= '<' this_DECIMAL_3= ruleDECIMAL )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:902:6: (kw= '<' this_DECIMAL_3= ruleDECIMAL )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:903:2: kw= '<' this_DECIMAL_3= ruleDECIMAL
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleCompareWithoutUnknown2233); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompareWithoutUnknownAccess().getLessThanSignKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getCompareWithoutUnknownAccess().getDECIMALParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleDECIMAL_in_ruleCompareWithoutUnknown2255);
                    this_DECIMAL_3=ruleDECIMAL();

                    state._fsp--;


                    		current.merge(this_DECIMAL_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:920:6: (kw= '>=' this_DECIMAL_5= ruleDECIMAL )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:920:6: (kw= '>=' this_DECIMAL_5= ruleDECIMAL )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:921:2: kw= '>=' this_DECIMAL_5= ruleDECIMAL
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleCompareWithoutUnknown2281); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompareWithoutUnknownAccess().getGreaterThanSignEqualsSignKeyword_2_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getCompareWithoutUnknownAccess().getDECIMALParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleDECIMAL_in_ruleCompareWithoutUnknown2303);
                    this_DECIMAL_5=ruleDECIMAL();

                    state._fsp--;


                    		current.merge(this_DECIMAL_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:938:6: (kw= '<=' this_DECIMAL_7= ruleDECIMAL )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:938:6: (kw= '<=' this_DECIMAL_7= ruleDECIMAL )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:939:2: kw= '<=' this_DECIMAL_7= ruleDECIMAL
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleCompareWithoutUnknown2329); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCompareWithoutUnknownAccess().getLessThanSignEqualsSignKeyword_3_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getCompareWithoutUnknownAccess().getDECIMALParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_ruleDECIMAL_in_ruleCompareWithoutUnknown2351);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:963:1: entryRuleTimeBound returns [String current=null] : iv_ruleTimeBound= ruleTimeBound EOF ;
    public final String entryRuleTimeBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimeBound = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:964:2: (iv_ruleTimeBound= ruleTimeBound EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:965:2: iv_ruleTimeBound= ruleTimeBound EOF
            {
             newCompositeNode(grammarAccess.getTimeBoundRule()); 
            pushFollow(FOLLOW_ruleTimeBound_in_entryRuleTimeBound2398);
            iv_ruleTimeBound=ruleTimeBound();

            state._fsp--;

             current =iv_ruleTimeBound.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeBound2409); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:972:1: ruleTimeBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '>=' this_DECIMAL_1= ruleDECIMAL ) | (kw= '<=' this_DECIMAL_3= ruleDECIMAL ) | (kw= '=' this_DECIMAL_5= ruleDECIMAL ) | (kw= '[' this_DECIMAL_7= ruleDECIMAL kw= ',' this_DECIMAL_9= ruleDECIMAL kw= ']' ) )? ;
    public final AntlrDatatypeRuleToken ruleTimeBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DECIMAL_1 = null;

        AntlrDatatypeRuleToken this_DECIMAL_3 = null;

        AntlrDatatypeRuleToken this_DECIMAL_5 = null;

        AntlrDatatypeRuleToken this_DECIMAL_7 = null;

        AntlrDatatypeRuleToken this_DECIMAL_9 = null;


         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:975:28: ( ( (kw= '>=' this_DECIMAL_1= ruleDECIMAL ) | (kw= '<=' this_DECIMAL_3= ruleDECIMAL ) | (kw= '=' this_DECIMAL_5= ruleDECIMAL ) | (kw= '[' this_DECIMAL_7= ruleDECIMAL kw= ',' this_DECIMAL_9= ruleDECIMAL kw= ']' ) )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:976:1: ( (kw= '>=' this_DECIMAL_1= ruleDECIMAL ) | (kw= '<=' this_DECIMAL_3= ruleDECIMAL ) | (kw= '=' this_DECIMAL_5= ruleDECIMAL ) | (kw= '[' this_DECIMAL_7= ruleDECIMAL kw= ',' this_DECIMAL_9= ruleDECIMAL kw= ']' ) )?
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:976:1: ( (kw= '>=' this_DECIMAL_1= ruleDECIMAL ) | (kw= '<=' this_DECIMAL_3= ruleDECIMAL ) | (kw= '=' this_DECIMAL_5= ruleDECIMAL ) | (kw= '[' this_DECIMAL_7= ruleDECIMAL kw= ',' this_DECIMAL_9= ruleDECIMAL kw= ']' ) )?
            int alt11=5;
            switch ( input.LA(1) ) {
                case 29:
                    {
                    alt11=1;
                    }
                    break;
                case 30:
                    {
                    alt11=2;
                    }
                    break;
                case 31:
                    {
                    alt11=3;
                    }
                    break;
                case 16:
                    {
                    alt11=4;
                    }
                    break;
            }

            switch (alt11) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:976:2: (kw= '>=' this_DECIMAL_1= ruleDECIMAL )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:976:2: (kw= '>=' this_DECIMAL_1= ruleDECIMAL )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:977:2: kw= '>=' this_DECIMAL_1= ruleDECIMAL
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleTimeBound2448); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeBoundAccess().getGreaterThanSignEqualsSignKeyword_0_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getTimeBoundAccess().getDECIMALParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleDECIMAL_in_ruleTimeBound2470);
                    this_DECIMAL_1=ruleDECIMAL();

                    state._fsp--;


                    		current.merge(this_DECIMAL_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:994:6: (kw= '<=' this_DECIMAL_3= ruleDECIMAL )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:994:6: (kw= '<=' this_DECIMAL_3= ruleDECIMAL )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:995:2: kw= '<=' this_DECIMAL_3= ruleDECIMAL
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleTimeBound2496); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeBoundAccess().getLessThanSignEqualsSignKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getTimeBoundAccess().getDECIMALParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleDECIMAL_in_ruleTimeBound2518);
                    this_DECIMAL_3=ruleDECIMAL();

                    state._fsp--;


                    		current.merge(this_DECIMAL_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1012:6: (kw= '=' this_DECIMAL_5= ruleDECIMAL )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1012:6: (kw= '=' this_DECIMAL_5= ruleDECIMAL )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1013:2: kw= '=' this_DECIMAL_5= ruleDECIMAL
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleTimeBound2544); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeBoundAccess().getEqualsSignKeyword_2_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getTimeBoundAccess().getDECIMALParserRuleCall_2_1()); 
                        
                    pushFollow(FOLLOW_ruleDECIMAL_in_ruleTimeBound2566);
                    this_DECIMAL_5=ruleDECIMAL();

                    state._fsp--;


                    		current.merge(this_DECIMAL_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1030:6: (kw= '[' this_DECIMAL_7= ruleDECIMAL kw= ',' this_DECIMAL_9= ruleDECIMAL kw= ']' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1030:6: (kw= '[' this_DECIMAL_7= ruleDECIMAL kw= ',' this_DECIMAL_9= ruleDECIMAL kw= ']' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1031:2: kw= '[' this_DECIMAL_7= ruleDECIMAL kw= ',' this_DECIMAL_9= ruleDECIMAL kw= ']'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleTimeBound2592); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeBoundAccess().getLeftSquareBracketKeyword_3_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getTimeBoundAccess().getDECIMALParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_ruleDECIMAL_in_ruleTimeBound2614);
                    this_DECIMAL_7=ruleDECIMAL();

                    state._fsp--;


                    		current.merge(this_DECIMAL_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleTimeBound2632); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeBoundAccess().getCommaKeyword_3_2()); 
                        
                     
                            newCompositeNode(grammarAccess.getTimeBoundAccess().getDECIMALParserRuleCall_3_3()); 
                        
                    pushFollow(FOLLOW_ruleDECIMAL_in_ruleTimeBound2654);
                    this_DECIMAL_9=ruleDECIMAL();

                    state._fsp--;


                    		current.merge(this_DECIMAL_9);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleTimeBound2672); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTimeBoundAccess().getRightSquareBracketKeyword_3_4()); 
                        

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1078:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1079:2: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1080:2: iv_ruleDECIMAL= ruleDECIMAL EOF
            {
             newCompositeNode(grammarAccess.getDECIMALRule()); 
            pushFollow(FOLLOW_ruleDECIMAL_in_entryRuleDECIMAL2715);
            iv_ruleDECIMAL=ruleDECIMAL();

            state._fsp--;

             current =iv_ruleDECIMAL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDECIMAL2726); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1087:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1090:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1091:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1091:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1091:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDECIMAL2766); 

            		current.merge(this_INT_0);
                
             
                newLeafNode(this_INT_0, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 
                
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1098:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/parser/antlr/internal/InternalPCTL.g:1099:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleDECIMAL2785); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_1_0()); 
                        
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDECIMAL2800); 

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


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA5_eotS =
        "\22\uffff";
    static final String DFA5_eofS =
        "\22\uffff";
    static final String DFA5_minS =
        "\1\13\3\uffff\1\14\2\4\2\uffff\2\4\2\21\2\15\1\uffff\2\21";
    static final String DFA5_maxS =
        "\1\25\3\uffff\1\16\2\4\2\uffff\2\4\2\31\2\15\1\uffff\2\31";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\3\uffff\1\5\1\6\6\uffff\1\4\2\uffff";
    static final String DFA5_specialS =
        "\22\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\4\1\5\1\uffff\1\6\1\2\2\uffff\1\1\1\10\1\3\1\7",
            "",
            "",
            "",
            "\1\11\1\uffff\1\12",
            "\1\13",
            "\1\14",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\10\5\uffff\3\17",
            "\1\10\5\uffff\3\17",
            "\1\20",
            "\1\21",
            "",
            "\1\10\5\uffff\3\17",
            "\1\10\5\uffff\3\17"
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
            return "383:1: (this_P_3= ruleP | this_S_4= ruleS | this_F_5= ruleF | this_U_6= ruleU | this_G_7= ruleG | ( ruleX this_StateOrLabel_9= ruleStateOrLabel ) )";
        }
    }
    static final String DFA6_eotS =
        "\22\uffff";
    static final String DFA6_eofS =
        "\22\uffff";
    static final String DFA6_minS =
        "\1\13\3\uffff\1\14\2\4\2\uffff\2\4\2\21\2\15\1\uffff\2\21";
    static final String DFA6_maxS =
        "\1\25\3\uffff\1\16\2\4\2\uffff\2\4\2\31\2\15\1\uffff\2\31";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\3\uffff\1\5\1\6\6\uffff\1\4\2\uffff";
    static final String DFA6_specialS =
        "\22\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\4\1\5\1\uffff\1\6\1\2\2\uffff\1\1\1\10\1\3\1\7",
            "",
            "",
            "",
            "\1\12\1\uffff\1\11",
            "\1\13",
            "\1\14",
            "",
            "",
            "\1\15",
            "\1\16",
            "\1\10\5\uffff\3\17",
            "\1\10\5\uffff\3\17",
            "\1\20",
            "\1\21",
            "",
            "\1\10\5\uffff\3\17",
            "\1\10\5\uffff\3\17"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "491:1: (this_P_3= ruleP | this_S_4= ruleS | this_F_5= ruleF | this_U_6= ruleU | this_G_7= ruleG | ( ruleX this_StateOrLabel_9= ruleStateOrLabel ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleStart_in_entryRuleStart75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStart85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleS_in_ruleStart131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleP1_in_ruleStart159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleState242 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState271 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleState308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleLabel415 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLabel427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel444 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLabel461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleLabel481 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabel498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_entryRuleStateOrLabel540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateOrLabel550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_ruleStateOrLabel597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleStateOrLabel624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleS_in_entryRuleS659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleS669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleS706 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_ruleCompare_in_ruleS722 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleS733 = new BitSet(new long[]{0x0000000000005800L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_ruleS755 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleS766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleP1_in_entryRuleP1802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleP1812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleP1849 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_ruleCompare_in_ruleP1865 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleP1876 = new BitSet(new long[]{0x00000000003CD800L});
    public static final BitSet FOLLOW_ruleP_in_ruleP1899 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleS_in_ruleP1926 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleF_in_ruleP1953 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleU_in_ruleP1980 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleG_in_ruleP11007 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleX_in_ruleP11029 = new BitSet(new long[]{0x0000000000005800L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_ruleP11050 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleP11063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleP_in_entryRuleP1099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleP1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleP1146 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_ruleCompareWithoutUnknown_in_ruleP1162 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleP1173 = new BitSet(new long[]{0x00000000003CD800L});
    public static final BitSet FOLLOW_ruleP_in_ruleP1196 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleS_in_ruleP1223 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleF_in_ruleP1250 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleU_in_ruleP1277 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleG_in_ruleP1304 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleX_in_ruleP1326 = new BitSet(new long[]{0x0000000000005800L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_ruleP1347 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleP1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleX_in_entryRuleX1397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleX1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleX1446 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleF_in_entryRuleF1487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleF1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleF1534 = new BitSet(new long[]{0x00000000E0095800L});
    public static final BitSet FOLLOW_ruleTimeBound_in_ruleF1551 = new BitSet(new long[]{0x0000000000085800L});
    public static final BitSet FOLLOW_ruleX_in_ruleF1566 = new BitSet(new long[]{0x0000000000005800L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_ruleF1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleG_in_entryRuleG1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleG1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleG1670 = new BitSet(new long[]{0x00000000E0090800L});
    public static final BitSet FOLLOW_ruleTimeBound_in_ruleG1687 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_ruleX_in_ruleG1702 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleG1714 = new BitSet(new long[]{0x0000000000005800L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_ruleG1735 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleG1747 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleP_in_ruleG1768 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleG1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleU_in_entryRuleU1816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleU1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_ruleU1872 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_23_in_ruleU1885 = new BitSet(new long[]{0x00000000E0095800L});
    public static final BitSet FOLLOW_24_in_ruleU1903 = new BitSet(new long[]{0x00000000E0095800L});
    public static final BitSet FOLLOW_25_in_ruleU1921 = new BitSet(new long[]{0x00000000E0095800L});
    public static final BitSet FOLLOW_ruleTimeBound_in_ruleU1939 = new BitSet(new long[]{0x0000000000085800L});
    public static final BitSet FOLLOW_ruleX_in_ruleU1954 = new BitSet(new long[]{0x0000000000005800L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_ruleU1975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_entryRuleCompare2012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompare2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareWithoutUnknown_in_ruleCompare2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCompare2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareWithoutUnknown_in_entryRuleCompareWithoutUnknown2135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareWithoutUnknown2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCompareWithoutUnknown2185 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_ruleCompareWithoutUnknown2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleCompareWithoutUnknown2233 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_ruleCompareWithoutUnknown2255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCompareWithoutUnknown2281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_ruleCompareWithoutUnknown2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCompareWithoutUnknown2329 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_ruleCompareWithoutUnknown2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_entryRuleTimeBound2398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeBound2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleTimeBound2448 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_ruleTimeBound2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTimeBound2496 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_ruleTimeBound2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTimeBound2544 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_ruleTimeBound2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTimeBound2592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_ruleTimeBound2614 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleTimeBound2632 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_ruleTimeBound2654 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTimeBound2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_entryRuleDECIMAL2715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDECIMAL2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDECIMAL2766 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleDECIMAL2785 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDECIMAL2800 = new BitSet(new long[]{0x0000000000000002L});

}