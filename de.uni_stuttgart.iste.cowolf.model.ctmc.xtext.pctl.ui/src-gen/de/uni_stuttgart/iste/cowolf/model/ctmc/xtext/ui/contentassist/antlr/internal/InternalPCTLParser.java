package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.services.PCTLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPCTLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOL", "RULE_DECIMAL", "RULE_SL_COMMENT", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=?'", "'U'", "'W'", "'R'", "'='", "'State:'", "'Label:'", "'!'", "'&'", "'|'", "'('", "')'", "'S'", "'['", "']'", "'P'", "'X'", "'F'", "'G'", "'=>'", "'>'", "'<'", "','"
    };
    public static final int RULE_ID=7;
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
    public static final int RULE_BOOL=4;
    public static final int RULE_SL_COMMENT=6;
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
    public static final int RULE_DECIMAL=5;

    // delegates
    // delegators


        public InternalPCTLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPCTLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPCTLParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g"; }


     
     	private PCTLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PCTLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleStart"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:60:1: entryRuleStart : ruleStart EOF ;
    public final void entryRuleStart() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:61:1: ( ruleStart EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:62:1: ruleStart EOF
            {
             before(grammarAccess.getStartRule()); 
            pushFollow(FOLLOW_ruleStart_in_entryRuleStart61);
            ruleStart();

            state._fsp--;

             after(grammarAccess.getStartRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStart68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStart"


    // $ANTLR start "ruleStart"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:69:1: ruleStart : ( ( rule__Start__StartAssignment )? ) ;
    public final void ruleStart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:73:2: ( ( ( rule__Start__StartAssignment )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:74:1: ( ( rule__Start__StartAssignment )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:74:1: ( ( rule__Start__StartAssignment )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:75:1: ( rule__Start__StartAssignment )?
            {
             before(grammarAccess.getStartAccess().getStartAssignment()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:76:1: ( rule__Start__StartAssignment )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_BOOL||LA1_0==RULE_SL_COMMENT||(LA1_0>=18 && LA1_0<=20)||LA1_0==23||LA1_0==25||LA1_0==28) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:76:2: rule__Start__StartAssignment
                    {
                    pushFollow(FOLLOW_rule__Start__StartAssignment_in_ruleStart94);
                    rule__Start__StartAssignment();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStartAccess().getStartAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStart"


    // $ANTLR start "entryRuleRules"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:88:1: entryRuleRules : ruleRules EOF ;
    public final void entryRuleRules() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:89:1: ( ruleRules EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:90:1: ruleRules EOF
            {
             before(grammarAccess.getRulesRule()); 
            pushFollow(FOLLOW_ruleRules_in_entryRuleRules122);
            ruleRules();

            state._fsp--;

             after(grammarAccess.getRulesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRules129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRules"


    // $ANTLR start "ruleRules"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:97:1: ruleRules : ( ( rule__Rules__Group__0 ) ) ;
    public final void ruleRules() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:101:2: ( ( ( rule__Rules__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:102:1: ( ( rule__Rules__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:102:1: ( ( rule__Rules__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:103:1: ( rule__Rules__Group__0 )
            {
             before(grammarAccess.getRulesAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:104:1: ( rule__Rules__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:104:2: rule__Rules__Group__0
            {
            pushFollow(FOLLOW_rule__Rules__Group__0_in_ruleRules155);
            rule__Rules__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRulesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRules"


    // $ANTLR start "entryRuleCommentedRule"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:116:1: entryRuleCommentedRule : ruleCommentedRule EOF ;
    public final void entryRuleCommentedRule() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:117:1: ( ruleCommentedRule EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:118:1: ruleCommentedRule EOF
            {
             before(grammarAccess.getCommentedRuleRule()); 
            pushFollow(FOLLOW_ruleCommentedRule_in_entryRuleCommentedRule182);
            ruleCommentedRule();

            state._fsp--;

             after(grammarAccess.getCommentedRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentedRule189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommentedRule"


    // $ANTLR start "ruleCommentedRule"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:125:1: ruleCommentedRule : ( ( rule__CommentedRule__Group__0 ) ) ;
    public final void ruleCommentedRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:129:2: ( ( ( rule__CommentedRule__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:130:1: ( ( rule__CommentedRule__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:130:1: ( ( rule__CommentedRule__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:131:1: ( rule__CommentedRule__Group__0 )
            {
             before(grammarAccess.getCommentedRuleAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:132:1: ( rule__CommentedRule__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:132:2: rule__CommentedRule__Group__0
            {
            pushFollow(FOLLOW_rule__CommentedRule__Group__0_in_ruleCommentedRule215);
            rule__CommentedRule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommentedRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommentedRule"


    // $ANTLR start "entryRulePctl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:144:1: entryRulePctl : rulePctl EOF ;
    public final void entryRulePctl() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:145:1: ( rulePctl EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:146:1: rulePctl EOF
            {
             before(grammarAccess.getPctlRule()); 
            pushFollow(FOLLOW_rulePctl_in_entryRulePctl242);
            rulePctl();

            state._fsp--;

             after(grammarAccess.getPctlRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePctl249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePctl"


    // $ANTLR start "rulePctl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:153:1: rulePctl : ( ( rule__Pctl__Alternatives ) ) ;
    public final void rulePctl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:157:2: ( ( ( rule__Pctl__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:158:1: ( ( rule__Pctl__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:158:1: ( ( rule__Pctl__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:159:1: ( rule__Pctl__Alternatives )
            {
             before(grammarAccess.getPctlAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:160:1: ( rule__Pctl__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:160:2: rule__Pctl__Alternatives
            {
            pushFollow(FOLLOW_rule__Pctl__Alternatives_in_rulePctl275);
            rule__Pctl__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPctlAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePctl"


    // $ANTLR start "entryRuleState"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:172:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:173:1: ( ruleState EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:174:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState302);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:181:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:185:2: ( ( ( rule__State__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:186:1: ( ( rule__State__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:186:1: ( ( rule__State__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:187:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:188:1: ( rule__State__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:188:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState335);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleLabel"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:200:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:201:1: ( ruleLabel EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:202:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel362);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:209:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:213:2: ( ( ( rule__Label__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:214:1: ( ( rule__Label__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:214:1: ( ( rule__Label__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:215:1: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:216:1: ( rule__Label__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:216:2: rule__Label__Group__0
            {
            pushFollow(FOLLOW_rule__Label__Group__0_in_ruleLabel395);
            rule__Label__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleAtomic"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:228:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:229:1: ( ruleAtomic EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:230:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic422);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:237:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:241:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:242:1: ( ( rule__Atomic__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:242:1: ( ( rule__Atomic__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:243:1: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:244:1: ( rule__Atomic__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:244:2: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic455);
            rule__Atomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleNegation"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:256:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:257:1: ( ruleNegation EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:258:1: ruleNegation EOF
            {
             before(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation482);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getNegationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:265:1: ruleNegation : ( ( rule__Negation__Group__0 ) ) ;
    public final void ruleNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:269:2: ( ( ( rule__Negation__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:270:1: ( ( rule__Negation__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:270:1: ( ( rule__Negation__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:271:1: ( rule__Negation__Group__0 )
            {
             before(grammarAccess.getNegationAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:272:1: ( rule__Negation__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:272:2: rule__Negation__Group__0
            {
            pushFollow(FOLLOW_rule__Negation__Group__0_in_ruleNegation515);
            rule__Negation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNegationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleJunction"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:284:1: entryRuleJunction : ruleJunction EOF ;
    public final void entryRuleJunction() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:285:1: ( ruleJunction EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:286:1: ruleJunction EOF
            {
             before(grammarAccess.getJunctionRule()); 
            pushFollow(FOLLOW_ruleJunction_in_entryRuleJunction542);
            ruleJunction();

            state._fsp--;

             after(grammarAccess.getJunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJunction549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJunction"


    // $ANTLR start "ruleJunction"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:293:1: ruleJunction : ( ( rule__Junction__Alternatives ) ) ;
    public final void ruleJunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:297:2: ( ( ( rule__Junction__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:298:1: ( ( rule__Junction__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:298:1: ( ( rule__Junction__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:299:1: ( rule__Junction__Alternatives )
            {
             before(grammarAccess.getJunctionAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:300:1: ( rule__Junction__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:300:2: rule__Junction__Alternatives
            {
            pushFollow(FOLLOW_rule__Junction__Alternatives_in_ruleJunction575);
            rule__Junction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJunctionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJunction"


    // $ANTLR start "entryRuleConjunction"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:312:1: entryRuleConjunction : ruleConjunction EOF ;
    public final void entryRuleConjunction() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:313:1: ( ruleConjunction EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:314:1: ruleConjunction EOF
            {
             before(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction602);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getConjunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:321:1: ruleConjunction : ( ( rule__Conjunction__Group__0 ) ) ;
    public final void ruleConjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:325:2: ( ( ( rule__Conjunction__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:326:1: ( ( rule__Conjunction__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:326:1: ( ( rule__Conjunction__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:327:1: ( rule__Conjunction__Group__0 )
            {
             before(grammarAccess.getConjunctionAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:328:1: ( rule__Conjunction__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:328:2: rule__Conjunction__Group__0
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__0_in_ruleConjunction635);
            rule__Conjunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConjunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleDisjunction"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:340:1: entryRuleDisjunction : ruleDisjunction EOF ;
    public final void entryRuleDisjunction() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:341:1: ( ruleDisjunction EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:342:1: ruleDisjunction EOF
            {
             before(grammarAccess.getDisjunctionRule()); 
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction662);
            ruleDisjunction();

            state._fsp--;

             after(grammarAccess.getDisjunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDisjunction"


    // $ANTLR start "ruleDisjunction"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:349:1: ruleDisjunction : ( ( rule__Disjunction__Group__0 ) ) ;
    public final void ruleDisjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:353:2: ( ( ( rule__Disjunction__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:354:1: ( ( rule__Disjunction__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:354:1: ( ( rule__Disjunction__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:355:1: ( rule__Disjunction__Group__0 )
            {
             before(grammarAccess.getDisjunctionAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:356:1: ( rule__Disjunction__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:356:2: rule__Disjunction__Group__0
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__0_in_ruleDisjunction695);
            rule__Disjunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDisjunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDisjunction"


    // $ANTLR start "entryRuleStateFormula"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:368:1: entryRuleStateFormula : ruleStateFormula EOF ;
    public final void entryRuleStateFormula() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:369:1: ( ruleStateFormula EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:370:1: ruleStateFormula EOF
            {
             before(grammarAccess.getStateFormulaRule()); 
            pushFollow(FOLLOW_ruleStateFormula_in_entryRuleStateFormula722);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getStateFormulaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateFormula729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateFormula"


    // $ANTLR start "ruleStateFormula"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:377:1: ruleStateFormula : ( ( rule__StateFormula__Alternatives ) ) ;
    public final void ruleStateFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:381:2: ( ( ( rule__StateFormula__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:382:1: ( ( rule__StateFormula__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:382:1: ( ( rule__StateFormula__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:383:1: ( rule__StateFormula__Alternatives )
            {
             before(grammarAccess.getStateFormulaAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:384:1: ( rule__StateFormula__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:384:2: rule__StateFormula__Alternatives
            {
            pushFollow(FOLLOW_rule__StateFormula__Alternatives_in_ruleStateFormula755);
            rule__StateFormula__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateFormulaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateFormula"


    // $ANTLR start "entryRulePathFormula"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:396:1: entryRulePathFormula : rulePathFormula EOF ;
    public final void entryRulePathFormula() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:397:1: ( rulePathFormula EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:398:1: rulePathFormula EOF
            {
             before(grammarAccess.getPathFormulaRule()); 
            pushFollow(FOLLOW_rulePathFormula_in_entryRulePathFormula782);
            rulePathFormula();

            state._fsp--;

             after(grammarAccess.getPathFormulaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathFormula789); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePathFormula"


    // $ANTLR start "rulePathFormula"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:405:1: rulePathFormula : ( ( rule__PathFormula__Alternatives ) ) ;
    public final void rulePathFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:409:2: ( ( ( rule__PathFormula__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:410:1: ( ( rule__PathFormula__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:410:1: ( ( rule__PathFormula__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:411:1: ( rule__PathFormula__Alternatives )
            {
             before(grammarAccess.getPathFormulaAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:412:1: ( rule__PathFormula__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:412:2: rule__PathFormula__Alternatives
            {
            pushFollow(FOLLOW_rule__PathFormula__Alternatives_in_rulePathFormula815);
            rule__PathFormula__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPathFormulaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePathFormula"


    // $ANTLR start "entryRuleSteadyState"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:424:1: entryRuleSteadyState : ruleSteadyState EOF ;
    public final void entryRuleSteadyState() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:425:1: ( ruleSteadyState EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:426:1: ruleSteadyState EOF
            {
             before(grammarAccess.getSteadyStateRule()); 
            pushFollow(FOLLOW_ruleSteadyState_in_entryRuleSteadyState842);
            ruleSteadyState();

            state._fsp--;

             after(grammarAccess.getSteadyStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSteadyState849); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSteadyState"


    // $ANTLR start "ruleSteadyState"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:433:1: ruleSteadyState : ( ( rule__SteadyState__Group__0 ) ) ;
    public final void ruleSteadyState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:437:2: ( ( ( rule__SteadyState__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:438:1: ( ( rule__SteadyState__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:438:1: ( ( rule__SteadyState__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:439:1: ( rule__SteadyState__Group__0 )
            {
             before(grammarAccess.getSteadyStateAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:440:1: ( rule__SteadyState__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:440:2: rule__SteadyState__Group__0
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__0_in_ruleSteadyState875);
            rule__SteadyState__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSteadyStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSteadyState"


    // $ANTLR start "entryRuleQuantifiedProbability"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:452:1: entryRuleQuantifiedProbability : ruleQuantifiedProbability EOF ;
    public final void entryRuleQuantifiedProbability() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:453:1: ( ruleQuantifiedProbability EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:454:1: ruleQuantifiedProbability EOF
            {
             before(grammarAccess.getQuantifiedProbabilityRule()); 
            pushFollow(FOLLOW_ruleQuantifiedProbability_in_entryRuleQuantifiedProbability902);
            ruleQuantifiedProbability();

            state._fsp--;

             after(grammarAccess.getQuantifiedProbabilityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifiedProbability909); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQuantifiedProbability"


    // $ANTLR start "ruleQuantifiedProbability"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:461:1: ruleQuantifiedProbability : ( ( rule__QuantifiedProbability__Group__0 ) ) ;
    public final void ruleQuantifiedProbability() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:465:2: ( ( ( rule__QuantifiedProbability__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:466:1: ( ( rule__QuantifiedProbability__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:466:1: ( ( rule__QuantifiedProbability__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:467:1: ( rule__QuantifiedProbability__Group__0 )
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:468:1: ( rule__QuantifiedProbability__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:468:2: rule__QuantifiedProbability__Group__0
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__0_in_ruleQuantifiedProbability935);
            rule__QuantifiedProbability__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuantifiedProbabilityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuantifiedProbability"


    // $ANTLR start "entryRuleProbability"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:480:1: entryRuleProbability : ruleProbability EOF ;
    public final void entryRuleProbability() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:481:1: ( ruleProbability EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:482:1: ruleProbability EOF
            {
             before(grammarAccess.getProbabilityRule()); 
            pushFollow(FOLLOW_ruleProbability_in_entryRuleProbability962);
            ruleProbability();

            state._fsp--;

             after(grammarAccess.getProbabilityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProbability969); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProbability"


    // $ANTLR start "ruleProbability"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:489:1: ruleProbability : ( ( rule__Probability__Group__0 ) ) ;
    public final void ruleProbability() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:493:2: ( ( ( rule__Probability__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:494:1: ( ( rule__Probability__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:494:1: ( ( rule__Probability__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:495:1: ( rule__Probability__Group__0 )
            {
             before(grammarAccess.getProbabilityAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:496:1: ( rule__Probability__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:496:2: rule__Probability__Group__0
            {
            pushFollow(FOLLOW_rule__Probability__Group__0_in_ruleProbability995);
            rule__Probability__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProbabilityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProbability"


    // $ANTLR start "entryRuleUntil"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:508:1: entryRuleUntil : ruleUntil EOF ;
    public final void entryRuleUntil() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:509:1: ( ruleUntil EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:510:1: ruleUntil EOF
            {
             before(grammarAccess.getUntilRule()); 
            pushFollow(FOLLOW_ruleUntil_in_entryRuleUntil1022);
            ruleUntil();

            state._fsp--;

             after(grammarAccess.getUntilRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUntil1029); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUntil"


    // $ANTLR start "ruleUntil"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:517:1: ruleUntil : ( ( rule__Until__Group__0 ) ) ;
    public final void ruleUntil() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:521:2: ( ( ( rule__Until__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:522:1: ( ( rule__Until__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:522:1: ( ( rule__Until__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:523:1: ( rule__Until__Group__0 )
            {
             before(grammarAccess.getUntilAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:524:1: ( rule__Until__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:524:2: rule__Until__Group__0
            {
            pushFollow(FOLLOW_rule__Until__Group__0_in_ruleUntil1055);
            rule__Until__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUntilAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUntil"


    // $ANTLR start "entryRuleNext"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:536:1: entryRuleNext : ruleNext EOF ;
    public final void entryRuleNext() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:537:1: ( ruleNext EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:538:1: ruleNext EOF
            {
             before(grammarAccess.getNextRule()); 
            pushFollow(FOLLOW_ruleNext_in_entryRuleNext1082);
            ruleNext();

            state._fsp--;

             after(grammarAccess.getNextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNext1089); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNext"


    // $ANTLR start "ruleNext"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:545:1: ruleNext : ( ( rule__Next__Group__0 ) ) ;
    public final void ruleNext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:549:2: ( ( ( rule__Next__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:550:1: ( ( rule__Next__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:550:1: ( ( rule__Next__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:551:1: ( rule__Next__Group__0 )
            {
             before(grammarAccess.getNextAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:552:1: ( rule__Next__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:552:2: rule__Next__Group__0
            {
            pushFollow(FOLLOW_rule__Next__Group__0_in_ruleNext1115);
            rule__Next__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNext"


    // $ANTLR start "entryRuleFuture"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:564:1: entryRuleFuture : ruleFuture EOF ;
    public final void entryRuleFuture() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:565:1: ( ruleFuture EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:566:1: ruleFuture EOF
            {
             before(grammarAccess.getFutureRule()); 
            pushFollow(FOLLOW_ruleFuture_in_entryRuleFuture1142);
            ruleFuture();

            state._fsp--;

             after(grammarAccess.getFutureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuture1149); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFuture"


    // $ANTLR start "ruleFuture"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:573:1: ruleFuture : ( ( rule__Future__Group__0 ) ) ;
    public final void ruleFuture() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:577:2: ( ( ( rule__Future__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:578:1: ( ( rule__Future__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:578:1: ( ( rule__Future__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:579:1: ( rule__Future__Group__0 )
            {
             before(grammarAccess.getFutureAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:580:1: ( rule__Future__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:580:2: rule__Future__Group__0
            {
            pushFollow(FOLLOW_rule__Future__Group__0_in_ruleFuture1175);
            rule__Future__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFutureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFuture"


    // $ANTLR start "entryRuleGlobally"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:592:1: entryRuleGlobally : ruleGlobally EOF ;
    public final void entryRuleGlobally() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:593:1: ( ruleGlobally EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:594:1: ruleGlobally EOF
            {
             before(grammarAccess.getGloballyRule()); 
            pushFollow(FOLLOW_ruleGlobally_in_entryRuleGlobally1202);
            ruleGlobally();

            state._fsp--;

             after(grammarAccess.getGloballyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobally1209); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobally"


    // $ANTLR start "ruleGlobally"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:601:1: ruleGlobally : ( ( rule__Globally__Group__0 ) ) ;
    public final void ruleGlobally() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:605:2: ( ( ( rule__Globally__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:606:1: ( ( rule__Globally__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:606:1: ( ( rule__Globally__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:607:1: ( rule__Globally__Group__0 )
            {
             before(grammarAccess.getGloballyAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:608:1: ( rule__Globally__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:608:2: rule__Globally__Group__0
            {
            pushFollow(FOLLOW_rule__Globally__Group__0_in_ruleGlobally1235);
            rule__Globally__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGloballyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobally"


    // $ANTLR start "entryRuleImplication"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:620:1: entryRuleImplication : ruleImplication EOF ;
    public final void entryRuleImplication() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:621:1: ( ruleImplication EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:622:1: ruleImplication EOF
            {
             before(grammarAccess.getImplicationRule()); 
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication1262);
            ruleImplication();

            state._fsp--;

             after(grammarAccess.getImplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication1269); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImplication"


    // $ANTLR start "ruleImplication"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:629:1: ruleImplication : ( ( rule__Implication__Group__0 ) ) ;
    public final void ruleImplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:633:2: ( ( ( rule__Implication__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:634:1: ( ( rule__Implication__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:634:1: ( ( rule__Implication__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:635:1: ( rule__Implication__Group__0 )
            {
             before(grammarAccess.getImplicationAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:636:1: ( rule__Implication__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:636:2: rule__Implication__Group__0
            {
            pushFollow(FOLLOW_rule__Implication__Group__0_in_ruleImplication1295);
            rule__Implication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImplication"


    // $ANTLR start "entryRuleCompareProbability"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:648:1: entryRuleCompareProbability : ruleCompareProbability EOF ;
    public final void entryRuleCompareProbability() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:649:1: ( ruleCompareProbability EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:650:1: ruleCompareProbability EOF
            {
             before(grammarAccess.getCompareProbabilityRule()); 
            pushFollow(FOLLOW_ruleCompareProbability_in_entryRuleCompareProbability1322);
            ruleCompareProbability();

            state._fsp--;

             after(grammarAccess.getCompareProbabilityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareProbability1329); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompareProbability"


    // $ANTLR start "ruleCompareProbability"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:657:1: ruleCompareProbability : ( ( rule__CompareProbability__Group__0 ) ) ;
    public final void ruleCompareProbability() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:661:2: ( ( ( rule__CompareProbability__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:662:1: ( ( rule__CompareProbability__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:662:1: ( ( rule__CompareProbability__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:663:1: ( rule__CompareProbability__Group__0 )
            {
             before(grammarAccess.getCompareProbabilityAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:664:1: ( rule__CompareProbability__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:664:2: rule__CompareProbability__Group__0
            {
            pushFollow(FOLLOW_rule__CompareProbability__Group__0_in_ruleCompareProbability1355);
            rule__CompareProbability__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompareProbabilityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompareProbability"


    // $ANTLR start "entryRuleTimeBound"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:676:1: entryRuleTimeBound : ruleTimeBound EOF ;
    public final void entryRuleTimeBound() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:677:1: ( ruleTimeBound EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:678:1: ruleTimeBound EOF
            {
             before(grammarAccess.getTimeBoundRule()); 
            pushFollow(FOLLOW_ruleTimeBound_in_entryRuleTimeBound1382);
            ruleTimeBound();

            state._fsp--;

             after(grammarAccess.getTimeBoundRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeBound1389); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeBound"


    // $ANTLR start "ruleTimeBound"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:685:1: ruleTimeBound : ( ( rule__TimeBound__Alternatives ) ) ;
    public final void ruleTimeBound() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:689:2: ( ( ( rule__TimeBound__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:690:1: ( ( rule__TimeBound__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:690:1: ( ( rule__TimeBound__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:691:1: ( rule__TimeBound__Alternatives )
            {
             before(grammarAccess.getTimeBoundAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:692:1: ( rule__TimeBound__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:692:2: rule__TimeBound__Alternatives
            {
            pushFollow(FOLLOW_rule__TimeBound__Alternatives_in_ruleTimeBound1415);
            rule__TimeBound__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeBoundAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeBound"


    // $ANTLR start "rule__Pctl__Alternatives"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:704:1: rule__Pctl__Alternatives : ( ( ruleStateFormula ) | ( ruleSteadyState ) | ( ruleQuantifiedProbability ) );
    public final void rule__Pctl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:708:1: ( ( ruleStateFormula ) | ( ruleSteadyState ) | ( ruleQuantifiedProbability ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
            case 18:
            case 19:
            case 20:
            case 23:
                {
                alt2=1;
                }
                break;
            case 28:
                {
                int LA2_2 = input.LA(2);

                if ( ((LA2_2>=33 && LA2_2<=34)) ) {
                    alt2=1;
                }
                else if ( (LA2_2==13) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:709:1: ( ruleStateFormula )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:709:1: ( ruleStateFormula )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:710:1: ruleStateFormula
                    {
                     before(grammarAccess.getPctlAccess().getStateFormulaParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStateFormula_in_rule__Pctl__Alternatives1451);
                    ruleStateFormula();

                    state._fsp--;

                     after(grammarAccess.getPctlAccess().getStateFormulaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:715:6: ( ruleSteadyState )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:715:6: ( ruleSteadyState )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:716:1: ruleSteadyState
                    {
                     before(grammarAccess.getPctlAccess().getSteadyStateParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSteadyState_in_rule__Pctl__Alternatives1468);
                    ruleSteadyState();

                    state._fsp--;

                     after(grammarAccess.getPctlAccess().getSteadyStateParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:721:6: ( ruleQuantifiedProbability )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:721:6: ( ruleQuantifiedProbability )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:722:1: ruleQuantifiedProbability
                    {
                     before(grammarAccess.getPctlAccess().getQuantifiedProbabilityParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleQuantifiedProbability_in_rule__Pctl__Alternatives1485);
                    ruleQuantifiedProbability();

                    state._fsp--;

                     after(grammarAccess.getPctlAccess().getQuantifiedProbabilityParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pctl__Alternatives"


    // $ANTLR start "rule__Atomic__Alternatives"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:732:1: rule__Atomic__Alternatives : ( ( ruleState ) | ( ruleLabel ) | ( RULE_BOOL ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:736:1: ( ( ruleState ) | ( ruleLabel ) | ( RULE_BOOL ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case RULE_BOOL:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:737:1: ( ruleState )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:737:1: ( ruleState )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:738:1: ruleState
                    {
                     before(grammarAccess.getAtomicAccess().getStateParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleState_in_rule__Atomic__Alternatives1517);
                    ruleState();

                    state._fsp--;

                     after(grammarAccess.getAtomicAccess().getStateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:743:6: ( ruleLabel )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:743:6: ( ruleLabel )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:744:1: ruleLabel
                    {
                     before(grammarAccess.getAtomicAccess().getLabelParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLabel_in_rule__Atomic__Alternatives1534);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getAtomicAccess().getLabelParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:749:6: ( RULE_BOOL )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:749:6: ( RULE_BOOL )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:750:1: RULE_BOOL
                    {
                     before(grammarAccess.getAtomicAccess().getBOOLTerminalRuleCall_2()); 
                    match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__Atomic__Alternatives1551); 
                     after(grammarAccess.getAtomicAccess().getBOOLTerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__Junction__Alternatives"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:760:1: rule__Junction__Alternatives : ( ( ruleConjunction ) | ( ruleDisjunction ) );
    public final void rule__Junction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:764:1: ( ( ruleConjunction ) | ( ruleDisjunction ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:765:1: ( ruleConjunction )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:765:1: ( ruleConjunction )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:766:1: ruleConjunction
                    {
                     before(grammarAccess.getJunctionAccess().getConjunctionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConjunction_in_rule__Junction__Alternatives1583);
                    ruleConjunction();

                    state._fsp--;

                     after(grammarAccess.getJunctionAccess().getConjunctionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:771:6: ( ruleDisjunction )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:771:6: ( ruleDisjunction )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:772:1: ruleDisjunction
                    {
                     before(grammarAccess.getJunctionAccess().getDisjunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDisjunction_in_rule__Junction__Alternatives1600);
                    ruleDisjunction();

                    state._fsp--;

                     after(grammarAccess.getJunctionAccess().getDisjunctionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Junction__Alternatives"


    // $ANTLR start "rule__StateFormula__Alternatives"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:782:1: rule__StateFormula__Alternatives : ( ( ( rule__StateFormula__Group_0__0 ) ) | ( ruleNegation ) | ( ruleAtomic ) | ( ( rule__StateFormula__LeftAssignment_3 ) ) );
    public final void rule__StateFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:786:1: ( ( ( rule__StateFormula__Group_0__0 ) ) | ( ruleNegation ) | ( ruleAtomic ) | ( ( rule__StateFormula__LeftAssignment_3 ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case RULE_BOOL:
            case 18:
            case 19:
                {
                alt5=3;
                }
                break;
            case 28:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:787:1: ( ( rule__StateFormula__Group_0__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:787:1: ( ( rule__StateFormula__Group_0__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:788:1: ( rule__StateFormula__Group_0__0 )
                    {
                     before(grammarAccess.getStateFormulaAccess().getGroup_0()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:789:1: ( rule__StateFormula__Group_0__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:789:2: rule__StateFormula__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__StateFormula__Group_0__0_in_rule__StateFormula__Alternatives1632);
                    rule__StateFormula__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateFormulaAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:793:6: ( ruleNegation )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:793:6: ( ruleNegation )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:794:1: ruleNegation
                    {
                     before(grammarAccess.getStateFormulaAccess().getNegationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNegation_in_rule__StateFormula__Alternatives1650);
                    ruleNegation();

                    state._fsp--;

                     after(grammarAccess.getStateFormulaAccess().getNegationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:799:6: ( ruleAtomic )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:799:6: ( ruleAtomic )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:800:1: ruleAtomic
                    {
                     before(grammarAccess.getStateFormulaAccess().getAtomicParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAtomic_in_rule__StateFormula__Alternatives1667);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getStateFormulaAccess().getAtomicParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:805:6: ( ( rule__StateFormula__LeftAssignment_3 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:805:6: ( ( rule__StateFormula__LeftAssignment_3 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:806:1: ( rule__StateFormula__LeftAssignment_3 )
                    {
                     before(grammarAccess.getStateFormulaAccess().getLeftAssignment_3()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:807:1: ( rule__StateFormula__LeftAssignment_3 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:807:2: rule__StateFormula__LeftAssignment_3
                    {
                    pushFollow(FOLLOW_rule__StateFormula__LeftAssignment_3_in_rule__StateFormula__Alternatives1684);
                    rule__StateFormula__LeftAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateFormulaAccess().getLeftAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFormula__Alternatives"


    // $ANTLR start "rule__StateFormula__Alternatives_0_2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:816:1: rule__StateFormula__Alternatives_0_2 : ( ( ( rule__StateFormula__RightAssignment_0_2_0 ) ) | ( ( rule__StateFormula__RightAssignment_0_2_1 ) ) );
    public final void rule__StateFormula__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:820:1: ( ( ( rule__StateFormula__RightAssignment_0_2_0 ) ) | ( ( rule__StateFormula__RightAssignment_0_2_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=21 && LA6_0<=22)) ) {
                alt6=1;
            }
            else if ( (LA6_0==32) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:821:1: ( ( rule__StateFormula__RightAssignment_0_2_0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:821:1: ( ( rule__StateFormula__RightAssignment_0_2_0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:822:1: ( rule__StateFormula__RightAssignment_0_2_0 )
                    {
                     before(grammarAccess.getStateFormulaAccess().getRightAssignment_0_2_0()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:823:1: ( rule__StateFormula__RightAssignment_0_2_0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:823:2: rule__StateFormula__RightAssignment_0_2_0
                    {
                    pushFollow(FOLLOW_rule__StateFormula__RightAssignment_0_2_0_in_rule__StateFormula__Alternatives_0_21717);
                    rule__StateFormula__RightAssignment_0_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateFormulaAccess().getRightAssignment_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:827:6: ( ( rule__StateFormula__RightAssignment_0_2_1 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:827:6: ( ( rule__StateFormula__RightAssignment_0_2_1 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:828:1: ( rule__StateFormula__RightAssignment_0_2_1 )
                    {
                     before(grammarAccess.getStateFormulaAccess().getRightAssignment_0_2_1()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:829:1: ( rule__StateFormula__RightAssignment_0_2_1 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:829:2: rule__StateFormula__RightAssignment_0_2_1
                    {
                    pushFollow(FOLLOW_rule__StateFormula__RightAssignment_0_2_1_in_rule__StateFormula__Alternatives_0_21735);
                    rule__StateFormula__RightAssignment_0_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateFormulaAccess().getRightAssignment_0_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFormula__Alternatives_0_2"


    // $ANTLR start "rule__PathFormula__Alternatives"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:838:1: rule__PathFormula__Alternatives : ( ( ruleNext ) | ( ruleUntil ) | ( ruleFuture ) | ( ruleGlobally ) );
    public final void rule__PathFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:842:1: ( ( ruleNext ) | ( ruleUntil ) | ( ruleFuture ) | ( ruleGlobally ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case RULE_BOOL:
            case 18:
            case 19:
            case 20:
            case 23:
            case 28:
                {
                alt7=2;
                }
                break;
            case 30:
                {
                alt7=3;
                }
                break;
            case 31:
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:843:1: ( ruleNext )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:843:1: ( ruleNext )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:844:1: ruleNext
                    {
                     before(grammarAccess.getPathFormulaAccess().getNextParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNext_in_rule__PathFormula__Alternatives1768);
                    ruleNext();

                    state._fsp--;

                     after(grammarAccess.getPathFormulaAccess().getNextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:849:6: ( ruleUntil )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:849:6: ( ruleUntil )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:850:1: ruleUntil
                    {
                     before(grammarAccess.getPathFormulaAccess().getUntilParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUntil_in_rule__PathFormula__Alternatives1785);
                    ruleUntil();

                    state._fsp--;

                     after(grammarAccess.getPathFormulaAccess().getUntilParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:855:6: ( ruleFuture )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:855:6: ( ruleFuture )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:856:1: ruleFuture
                    {
                     before(grammarAccess.getPathFormulaAccess().getFutureParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFuture_in_rule__PathFormula__Alternatives1802);
                    ruleFuture();

                    state._fsp--;

                     after(grammarAccess.getPathFormulaAccess().getFutureParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:861:6: ( ruleGlobally )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:861:6: ( ruleGlobally )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:862:1: ruleGlobally
                    {
                     before(grammarAccess.getPathFormulaAccess().getGloballyParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleGlobally_in_rule__PathFormula__Alternatives1819);
                    ruleGlobally();

                    state._fsp--;

                     after(grammarAccess.getPathFormulaAccess().getGloballyParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathFormula__Alternatives"


    // $ANTLR start "rule__SteadyState__Alternatives_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:872:1: rule__SteadyState__Alternatives_1 : ( ( ruleCompareProbability ) | ( '=?' ) );
    public final void rule__SteadyState__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:876:1: ( ( ruleCompareProbability ) | ( '=?' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=33 && LA8_0<=34)) ) {
                alt8=1;
            }
            else if ( (LA8_0==13) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:877:1: ( ruleCompareProbability )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:877:1: ( ruleCompareProbability )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:878:1: ruleCompareProbability
                    {
                     before(grammarAccess.getSteadyStateAccess().getCompareProbabilityParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleCompareProbability_in_rule__SteadyState__Alternatives_11851);
                    ruleCompareProbability();

                    state._fsp--;

                     after(grammarAccess.getSteadyStateAccess().getCompareProbabilityParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:883:6: ( '=?' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:883:6: ( '=?' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:884:1: '=?'
                    {
                     before(grammarAccess.getSteadyStateAccess().getEqualsSignQuestionMarkKeyword_1_1()); 
                    match(input,13,FOLLOW_13_in_rule__SteadyState__Alternatives_11869); 
                     after(grammarAccess.getSteadyStateAccess().getEqualsSignQuestionMarkKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SteadyState__Alternatives_1"


    // $ANTLR start "rule__Until__Alternatives_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:896:1: rule__Until__Alternatives_1 : ( ( 'U' ) | ( 'W' ) | ( 'R' ) );
    public final void rule__Until__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:900:1: ( ( 'U' ) | ( 'W' ) | ( 'R' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt9=1;
                }
                break;
            case 15:
                {
                alt9=2;
                }
                break;
            case 16:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:901:1: ( 'U' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:901:1: ( 'U' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:902:1: 'U'
                    {
                     before(grammarAccess.getUntilAccess().getUKeyword_1_0()); 
                    match(input,14,FOLLOW_14_in_rule__Until__Alternatives_11904); 
                     after(grammarAccess.getUntilAccess().getUKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:909:6: ( 'W' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:909:6: ( 'W' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:910:1: 'W'
                    {
                     before(grammarAccess.getUntilAccess().getWKeyword_1_1()); 
                    match(input,15,FOLLOW_15_in_rule__Until__Alternatives_11924); 
                     after(grammarAccess.getUntilAccess().getWKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:917:6: ( 'R' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:917:6: ( 'R' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:918:1: 'R'
                    {
                     before(grammarAccess.getUntilAccess().getRKeyword_1_2()); 
                    match(input,16,FOLLOW_16_in_rule__Until__Alternatives_11944); 
                     after(grammarAccess.getUntilAccess().getRKeyword_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Until__Alternatives_1"


    // $ANTLR start "rule__CompareProbability__Alternatives_0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:930:1: rule__CompareProbability__Alternatives_0 : ( ( ( rule__CompareProbability__Group_0_0__0 ) ) | ( ( rule__CompareProbability__Group_0_1__0 ) ) );
    public final void rule__CompareProbability__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:934:1: ( ( ( rule__CompareProbability__Group_0_0__0 ) ) | ( ( rule__CompareProbability__Group_0_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==33) ) {
                alt10=1;
            }
            else if ( (LA10_0==34) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:935:1: ( ( rule__CompareProbability__Group_0_0__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:935:1: ( ( rule__CompareProbability__Group_0_0__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:936:1: ( rule__CompareProbability__Group_0_0__0 )
                    {
                     before(grammarAccess.getCompareProbabilityAccess().getGroup_0_0()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:937:1: ( rule__CompareProbability__Group_0_0__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:937:2: rule__CompareProbability__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__CompareProbability__Group_0_0__0_in_rule__CompareProbability__Alternatives_01978);
                    rule__CompareProbability__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompareProbabilityAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:941:6: ( ( rule__CompareProbability__Group_0_1__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:941:6: ( ( rule__CompareProbability__Group_0_1__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:942:1: ( rule__CompareProbability__Group_0_1__0 )
                    {
                     before(grammarAccess.getCompareProbabilityAccess().getGroup_0_1()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:943:1: ( rule__CompareProbability__Group_0_1__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:943:2: rule__CompareProbability__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__CompareProbability__Group_0_1__0_in_rule__CompareProbability__Alternatives_01996);
                    rule__CompareProbability__Group_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompareProbabilityAccess().getGroup_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareProbability__Alternatives_0"


    // $ANTLR start "rule__TimeBound__Alternatives"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:952:1: rule__TimeBound__Alternatives : ( ( ( rule__TimeBound__Group_0__0 ) ) | ( ( rule__TimeBound__Group_1__0 ) ) );
    public final void rule__TimeBound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:956:1: ( ( ( rule__TimeBound__Group_0__0 ) ) | ( ( rule__TimeBound__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17||(LA11_0>=33 && LA11_0<=34)) ) {
                alt11=1;
            }
            else if ( (LA11_0==26) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:957:1: ( ( rule__TimeBound__Group_0__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:957:1: ( ( rule__TimeBound__Group_0__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:958:1: ( rule__TimeBound__Group_0__0 )
                    {
                     before(grammarAccess.getTimeBoundAccess().getGroup_0()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:959:1: ( rule__TimeBound__Group_0__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:959:2: rule__TimeBound__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TimeBound__Group_0__0_in_rule__TimeBound__Alternatives2029);
                    rule__TimeBound__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimeBoundAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:963:6: ( ( rule__TimeBound__Group_1__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:963:6: ( ( rule__TimeBound__Group_1__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:964:1: ( rule__TimeBound__Group_1__0 )
                    {
                     before(grammarAccess.getTimeBoundAccess().getGroup_1()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:965:1: ( rule__TimeBound__Group_1__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:965:2: rule__TimeBound__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TimeBound__Group_1__0_in_rule__TimeBound__Alternatives2047);
                    rule__TimeBound__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimeBoundAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Alternatives"


    // $ANTLR start "rule__TimeBound__Alternatives_0_0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:974:1: rule__TimeBound__Alternatives_0_0 : ( ( ( rule__TimeBound__Group_0_0_0__0 ) ) | ( ( rule__TimeBound__Group_0_0_1__0 ) ) | ( '=' ) );
    public final void rule__TimeBound__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:978:1: ( ( ( rule__TimeBound__Group_0_0_0__0 ) ) | ( ( rule__TimeBound__Group_0_0_1__0 ) ) | ( '=' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt12=1;
                }
                break;
            case 34:
                {
                alt12=2;
                }
                break;
            case 17:
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:979:1: ( ( rule__TimeBound__Group_0_0_0__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:979:1: ( ( rule__TimeBound__Group_0_0_0__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:980:1: ( rule__TimeBound__Group_0_0_0__0 )
                    {
                     before(grammarAccess.getTimeBoundAccess().getGroup_0_0_0()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:981:1: ( rule__TimeBound__Group_0_0_0__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:981:2: rule__TimeBound__Group_0_0_0__0
                    {
                    pushFollow(FOLLOW_rule__TimeBound__Group_0_0_0__0_in_rule__TimeBound__Alternatives_0_02080);
                    rule__TimeBound__Group_0_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimeBoundAccess().getGroup_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:985:6: ( ( rule__TimeBound__Group_0_0_1__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:985:6: ( ( rule__TimeBound__Group_0_0_1__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:986:1: ( rule__TimeBound__Group_0_0_1__0 )
                    {
                     before(grammarAccess.getTimeBoundAccess().getGroup_0_0_1()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:987:1: ( rule__TimeBound__Group_0_0_1__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:987:2: rule__TimeBound__Group_0_0_1__0
                    {
                    pushFollow(FOLLOW_rule__TimeBound__Group_0_0_1__0_in_rule__TimeBound__Alternatives_0_02098);
                    rule__TimeBound__Group_0_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimeBoundAccess().getGroup_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:991:6: ( '=' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:991:6: ( '=' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:992:1: '='
                    {
                     before(grammarAccess.getTimeBoundAccess().getEqualsSignKeyword_0_0_2()); 
                    match(input,17,FOLLOW_17_in_rule__TimeBound__Alternatives_0_02117); 
                     after(grammarAccess.getTimeBoundAccess().getEqualsSignKeyword_0_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Alternatives_0_0"


    // $ANTLR start "rule__Rules__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1006:1: rule__Rules__Group__0 : rule__Rules__Group__0__Impl rule__Rules__Group__1 ;
    public final void rule__Rules__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1010:1: ( rule__Rules__Group__0__Impl rule__Rules__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1011:2: rule__Rules__Group__0__Impl rule__Rules__Group__1
            {
            pushFollow(FOLLOW_rule__Rules__Group__0__Impl_in_rule__Rules__Group__02149);
            rule__Rules__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rules__Group__1_in_rule__Rules__Group__02152);
            rule__Rules__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__0"


    // $ANTLR start "rule__Rules__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1018:1: rule__Rules__Group__0__Impl : ( ( rule__Rules__RuleAssignment_0 ) ) ;
    public final void rule__Rules__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1022:1: ( ( ( rule__Rules__RuleAssignment_0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1023:1: ( ( rule__Rules__RuleAssignment_0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1023:1: ( ( rule__Rules__RuleAssignment_0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1024:1: ( rule__Rules__RuleAssignment_0 )
            {
             before(grammarAccess.getRulesAccess().getRuleAssignment_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1025:1: ( rule__Rules__RuleAssignment_0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1025:2: rule__Rules__RuleAssignment_0
            {
            pushFollow(FOLLOW_rule__Rules__RuleAssignment_0_in_rule__Rules__Group__0__Impl2179);
            rule__Rules__RuleAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRulesAccess().getRuleAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__0__Impl"


    // $ANTLR start "rule__Rules__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1035:1: rule__Rules__Group__1 : rule__Rules__Group__1__Impl ;
    public final void rule__Rules__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1039:1: ( rule__Rules__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1040:2: rule__Rules__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Rules__Group__1__Impl_in_rule__Rules__Group__12209);
            rule__Rules__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__1"


    // $ANTLR start "rule__Rules__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1046:1: rule__Rules__Group__1__Impl : ( ( rule__Rules__RuleAssignment_1 )? ) ;
    public final void rule__Rules__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1050:1: ( ( ( rule__Rules__RuleAssignment_1 )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1051:1: ( ( rule__Rules__RuleAssignment_1 )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1051:1: ( ( rule__Rules__RuleAssignment_1 )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1052:1: ( rule__Rules__RuleAssignment_1 )?
            {
             before(grammarAccess.getRulesAccess().getRuleAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1053:1: ( rule__Rules__RuleAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_BOOL||LA13_0==RULE_SL_COMMENT||(LA13_0>=18 && LA13_0<=20)||LA13_0==23||LA13_0==25||LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1053:2: rule__Rules__RuleAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Rules__RuleAssignment_1_in_rule__Rules__Group__1__Impl2236);
                    rule__Rules__RuleAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRulesAccess().getRuleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__Group__1__Impl"


    // $ANTLR start "rule__CommentedRule__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1067:1: rule__CommentedRule__Group__0 : rule__CommentedRule__Group__0__Impl rule__CommentedRule__Group__1 ;
    public final void rule__CommentedRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1071:1: ( rule__CommentedRule__Group__0__Impl rule__CommentedRule__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1072:2: rule__CommentedRule__Group__0__Impl rule__CommentedRule__Group__1
            {
            pushFollow(FOLLOW_rule__CommentedRule__Group__0__Impl_in_rule__CommentedRule__Group__02271);
            rule__CommentedRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommentedRule__Group__1_in_rule__CommentedRule__Group__02274);
            rule__CommentedRule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentedRule__Group__0"


    // $ANTLR start "rule__CommentedRule__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1079:1: rule__CommentedRule__Group__0__Impl : ( ( rule__CommentedRule__CommentAssignment_0 )? ) ;
    public final void rule__CommentedRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1083:1: ( ( ( rule__CommentedRule__CommentAssignment_0 )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1084:1: ( ( rule__CommentedRule__CommentAssignment_0 )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1084:1: ( ( rule__CommentedRule__CommentAssignment_0 )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1085:1: ( rule__CommentedRule__CommentAssignment_0 )?
            {
             before(grammarAccess.getCommentedRuleAccess().getCommentAssignment_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1086:1: ( rule__CommentedRule__CommentAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_SL_COMMENT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1086:2: rule__CommentedRule__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CommentedRule__CommentAssignment_0_in_rule__CommentedRule__Group__0__Impl2301);
                    rule__CommentedRule__CommentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCommentedRuleAccess().getCommentAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentedRule__Group__0__Impl"


    // $ANTLR start "rule__CommentedRule__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1096:1: rule__CommentedRule__Group__1 : rule__CommentedRule__Group__1__Impl ;
    public final void rule__CommentedRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1100:1: ( rule__CommentedRule__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1101:2: rule__CommentedRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CommentedRule__Group__1__Impl_in_rule__CommentedRule__Group__12332);
            rule__CommentedRule__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentedRule__Group__1"


    // $ANTLR start "rule__CommentedRule__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1107:1: rule__CommentedRule__Group__1__Impl : ( ( rule__CommentedRule__RuleAssignment_1 ) ) ;
    public final void rule__CommentedRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1111:1: ( ( ( rule__CommentedRule__RuleAssignment_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1112:1: ( ( rule__CommentedRule__RuleAssignment_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1112:1: ( ( rule__CommentedRule__RuleAssignment_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1113:1: ( rule__CommentedRule__RuleAssignment_1 )
            {
             before(grammarAccess.getCommentedRuleAccess().getRuleAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1114:1: ( rule__CommentedRule__RuleAssignment_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1114:2: rule__CommentedRule__RuleAssignment_1
            {
            pushFollow(FOLLOW_rule__CommentedRule__RuleAssignment_1_in_rule__CommentedRule__Group__1__Impl2359);
            rule__CommentedRule__RuleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommentedRuleAccess().getRuleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentedRule__Group__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1128:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1132:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1133:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__02393);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__02396);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1140:1: rule__State__Group__0__Impl : ( 'State:' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1144:1: ( ( 'State:' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1145:1: ( 'State:' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1145:1: ( 'State:' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1146:1: 'State:'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__State__Group__0__Impl2424); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1159:1: rule__State__Group__1 : rule__State__Group__1__Impl ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1163:1: ( rule__State__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1164:2: rule__State__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__12455);
            rule__State__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1170:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1174:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1175:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1175:1: ( ( rule__State__NameAssignment_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1176:1: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1177:1: ( rule__State__NameAssignment_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1177:2: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl2482);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__Label__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1191:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1195:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1196:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__02516);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label__Group__1_in_rule__Label__Group__02519);
            rule__Label__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0"


    // $ANTLR start "rule__Label__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1203:1: rule__Label__Group__0__Impl : ( 'Label:' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1207:1: ( ( 'Label:' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1208:1: ( 'Label:' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1208:1: ( 'Label:' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1209:1: 'Label:'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Label__Group__0__Impl2547); 
             after(grammarAccess.getLabelAccess().getLabelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__0__Impl"


    // $ANTLR start "rule__Label__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1222:1: rule__Label__Group__1 : rule__Label__Group__1__Impl ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1226:1: ( rule__Label__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1227:2: rule__Label__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__12578);
            rule__Label__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1"


    // $ANTLR start "rule__Label__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1233:1: rule__Label__Group__1__Impl : ( ( rule__Label__NameAssignment_1 ) ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1237:1: ( ( ( rule__Label__NameAssignment_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1238:1: ( ( rule__Label__NameAssignment_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1238:1: ( ( rule__Label__NameAssignment_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1239:1: ( rule__Label__NameAssignment_1 )
            {
             before(grammarAccess.getLabelAccess().getNameAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1240:1: ( rule__Label__NameAssignment_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1240:2: rule__Label__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Label__NameAssignment_1_in_rule__Label__Group__1__Impl2605);
            rule__Label__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group__1__Impl"


    // $ANTLR start "rule__Negation__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1254:1: rule__Negation__Group__0 : rule__Negation__Group__0__Impl rule__Negation__Group__1 ;
    public final void rule__Negation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1258:1: ( rule__Negation__Group__0__Impl rule__Negation__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1259:2: rule__Negation__Group__0__Impl rule__Negation__Group__1
            {
            pushFollow(FOLLOW_rule__Negation__Group__0__Impl_in_rule__Negation__Group__02639);
            rule__Negation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Negation__Group__1_in_rule__Negation__Group__02642);
            rule__Negation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__0"


    // $ANTLR start "rule__Negation__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1266:1: rule__Negation__Group__0__Impl : ( '!' ) ;
    public final void rule__Negation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1270:1: ( ( '!' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1271:1: ( '!' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1271:1: ( '!' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1272:1: '!'
            {
             before(grammarAccess.getNegationAccess().getExclamationMarkKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Negation__Group__0__Impl2670); 
             after(grammarAccess.getNegationAccess().getExclamationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__0__Impl"


    // $ANTLR start "rule__Negation__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1285:1: rule__Negation__Group__1 : rule__Negation__Group__1__Impl ;
    public final void rule__Negation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1289:1: ( rule__Negation__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1290:2: rule__Negation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Negation__Group__1__Impl_in_rule__Negation__Group__12701);
            rule__Negation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__1"


    // $ANTLR start "rule__Negation__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1296:1: rule__Negation__Group__1__Impl : ( ruleStateFormula ) ;
    public final void rule__Negation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1300:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1301:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1301:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1302:1: ruleStateFormula
            {
             before(grammarAccess.getNegationAccess().getStateFormulaParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Negation__Group__1__Impl2728);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getNegationAccess().getStateFormulaParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group__1__Impl"


    // $ANTLR start "rule__Conjunction__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1317:1: rule__Conjunction__Group__0 : rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 ;
    public final void rule__Conjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1321:1: ( rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1322:2: rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__02761);
            rule__Conjunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__02764);
            rule__Conjunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__0"


    // $ANTLR start "rule__Conjunction__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1329:1: rule__Conjunction__Group__0__Impl : ( '&' ) ;
    public final void rule__Conjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1333:1: ( ( '&' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1334:1: ( '&' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1334:1: ( '&' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1335:1: '&'
            {
             before(grammarAccess.getConjunctionAccess().getAmpersandKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Conjunction__Group__0__Impl2792); 
             after(grammarAccess.getConjunctionAccess().getAmpersandKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__0__Impl"


    // $ANTLR start "rule__Conjunction__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1348:1: rule__Conjunction__Group__1 : rule__Conjunction__Group__1__Impl rule__Conjunction__Group__2 ;
    public final void rule__Conjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1352:1: ( rule__Conjunction__Group__1__Impl rule__Conjunction__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1353:2: rule__Conjunction__Group__1__Impl rule__Conjunction__Group__2
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__12823);
            rule__Conjunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group__2_in_rule__Conjunction__Group__12826);
            rule__Conjunction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__1"


    // $ANTLR start "rule__Conjunction__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1360:1: rule__Conjunction__Group__1__Impl : ( ruleStateFormula ) ;
    public final void rule__Conjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1364:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1365:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1365:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1366:1: ruleStateFormula
            {
             before(grammarAccess.getConjunctionAccess().getStateFormulaParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Conjunction__Group__1__Impl2853);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getConjunctionAccess().getStateFormulaParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__1__Impl"


    // $ANTLR start "rule__Conjunction__Group__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1377:1: rule__Conjunction__Group__2 : rule__Conjunction__Group__2__Impl ;
    public final void rule__Conjunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1381:1: ( rule__Conjunction__Group__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1382:2: rule__Conjunction__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__2__Impl_in_rule__Conjunction__Group__22882);
            rule__Conjunction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__2"


    // $ANTLR start "rule__Conjunction__Group__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1388:1: rule__Conjunction__Group__2__Impl : ( ( rule__Conjunction__Group_2__0 )* ) ;
    public final void rule__Conjunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1392:1: ( ( ( rule__Conjunction__Group_2__0 )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1393:1: ( ( rule__Conjunction__Group_2__0 )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1393:1: ( ( rule__Conjunction__Group_2__0 )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1394:1: ( rule__Conjunction__Group_2__0 )*
            {
             before(grammarAccess.getConjunctionAccess().getGroup_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1395:1: ( rule__Conjunction__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1395:2: rule__Conjunction__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Conjunction__Group_2__0_in_rule__Conjunction__Group__2__Impl2909);
            	    rule__Conjunction__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getConjunctionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__2__Impl"


    // $ANTLR start "rule__Conjunction__Group_2__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1411:1: rule__Conjunction__Group_2__0 : rule__Conjunction__Group_2__0__Impl rule__Conjunction__Group_2__1 ;
    public final void rule__Conjunction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1415:1: ( rule__Conjunction__Group_2__0__Impl rule__Conjunction__Group_2__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1416:2: rule__Conjunction__Group_2__0__Impl rule__Conjunction__Group_2__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_2__0__Impl_in_rule__Conjunction__Group_2__02946);
            rule__Conjunction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_2__1_in_rule__Conjunction__Group_2__02949);
            rule__Conjunction__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_2__0"


    // $ANTLR start "rule__Conjunction__Group_2__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1423:1: rule__Conjunction__Group_2__0__Impl : ( () ) ;
    public final void rule__Conjunction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1427:1: ( ( () ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1428:1: ( () )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1428:1: ( () )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1429:1: ()
            {
             before(grammarAccess.getConjunctionAccess().getConjunctionLeftAction_2_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1430:1: ()
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1432:1: 
            {
            }

             after(grammarAccess.getConjunctionAccess().getConjunctionLeftAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_2__0__Impl"


    // $ANTLR start "rule__Conjunction__Group_2__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1442:1: rule__Conjunction__Group_2__1 : rule__Conjunction__Group_2__1__Impl rule__Conjunction__Group_2__2 ;
    public final void rule__Conjunction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1446:1: ( rule__Conjunction__Group_2__1__Impl rule__Conjunction__Group_2__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1447:2: rule__Conjunction__Group_2__1__Impl rule__Conjunction__Group_2__2
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_2__1__Impl_in_rule__Conjunction__Group_2__13007);
            rule__Conjunction__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_2__2_in_rule__Conjunction__Group_2__13010);
            rule__Conjunction__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_2__1"


    // $ANTLR start "rule__Conjunction__Group_2__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1454:1: rule__Conjunction__Group_2__1__Impl : ( '&' ) ;
    public final void rule__Conjunction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1458:1: ( ( '&' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1459:1: ( '&' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1459:1: ( '&' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1460:1: '&'
            {
             before(grammarAccess.getConjunctionAccess().getAmpersandKeyword_2_1()); 
            match(input,21,FOLLOW_21_in_rule__Conjunction__Group_2__1__Impl3038); 
             after(grammarAccess.getConjunctionAccess().getAmpersandKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_2__1__Impl"


    // $ANTLR start "rule__Conjunction__Group_2__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1473:1: rule__Conjunction__Group_2__2 : rule__Conjunction__Group_2__2__Impl ;
    public final void rule__Conjunction__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1477:1: ( rule__Conjunction__Group_2__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1478:2: rule__Conjunction__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_2__2__Impl_in_rule__Conjunction__Group_2__23069);
            rule__Conjunction__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_2__2"


    // $ANTLR start "rule__Conjunction__Group_2__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1484:1: rule__Conjunction__Group_2__2__Impl : ( ( rule__Conjunction__RightAssignment_2_2 ) ) ;
    public final void rule__Conjunction__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1488:1: ( ( ( rule__Conjunction__RightAssignment_2_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1489:1: ( ( rule__Conjunction__RightAssignment_2_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1489:1: ( ( rule__Conjunction__RightAssignment_2_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1490:1: ( rule__Conjunction__RightAssignment_2_2 )
            {
             before(grammarAccess.getConjunctionAccess().getRightAssignment_2_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1491:1: ( rule__Conjunction__RightAssignment_2_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1491:2: rule__Conjunction__RightAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Conjunction__RightAssignment_2_2_in_rule__Conjunction__Group_2__2__Impl3096);
            rule__Conjunction__RightAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getConjunctionAccess().getRightAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_2__2__Impl"


    // $ANTLR start "rule__Disjunction__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1507:1: rule__Disjunction__Group__0 : rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 ;
    public final void rule__Disjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1511:1: ( rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1512:2: rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__0__Impl_in_rule__Disjunction__Group__03132);
            rule__Disjunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group__1_in_rule__Disjunction__Group__03135);
            rule__Disjunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__0"


    // $ANTLR start "rule__Disjunction__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1519:1: rule__Disjunction__Group__0__Impl : ( '|' ) ;
    public final void rule__Disjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1523:1: ( ( '|' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1524:1: ( '|' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1524:1: ( '|' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1525:1: '|'
            {
             before(grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Disjunction__Group__0__Impl3163); 
             after(grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__0__Impl"


    // $ANTLR start "rule__Disjunction__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1538:1: rule__Disjunction__Group__1 : rule__Disjunction__Group__1__Impl rule__Disjunction__Group__2 ;
    public final void rule__Disjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1542:1: ( rule__Disjunction__Group__1__Impl rule__Disjunction__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1543:2: rule__Disjunction__Group__1__Impl rule__Disjunction__Group__2
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__1__Impl_in_rule__Disjunction__Group__13194);
            rule__Disjunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group__2_in_rule__Disjunction__Group__13197);
            rule__Disjunction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__1"


    // $ANTLR start "rule__Disjunction__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1550:1: rule__Disjunction__Group__1__Impl : ( ruleStateFormula ) ;
    public final void rule__Disjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1554:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1555:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1555:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1556:1: ruleStateFormula
            {
             before(grammarAccess.getDisjunctionAccess().getStateFormulaParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Disjunction__Group__1__Impl3224);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getDisjunctionAccess().getStateFormulaParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__1__Impl"


    // $ANTLR start "rule__Disjunction__Group__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1567:1: rule__Disjunction__Group__2 : rule__Disjunction__Group__2__Impl ;
    public final void rule__Disjunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1571:1: ( rule__Disjunction__Group__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1572:2: rule__Disjunction__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__2__Impl_in_rule__Disjunction__Group__23253);
            rule__Disjunction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__2"


    // $ANTLR start "rule__Disjunction__Group__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1578:1: rule__Disjunction__Group__2__Impl : ( ( rule__Disjunction__Group_2__0 )* ) ;
    public final void rule__Disjunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1582:1: ( ( ( rule__Disjunction__Group_2__0 )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1583:1: ( ( rule__Disjunction__Group_2__0 )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1583:1: ( ( rule__Disjunction__Group_2__0 )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1584:1: ( rule__Disjunction__Group_2__0 )*
            {
             before(grammarAccess.getDisjunctionAccess().getGroup_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1585:1: ( rule__Disjunction__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1585:2: rule__Disjunction__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Disjunction__Group_2__0_in_rule__Disjunction__Group__2__Impl3280);
            	    rule__Disjunction__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDisjunctionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__2__Impl"


    // $ANTLR start "rule__Disjunction__Group_2__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1601:1: rule__Disjunction__Group_2__0 : rule__Disjunction__Group_2__0__Impl rule__Disjunction__Group_2__1 ;
    public final void rule__Disjunction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1605:1: ( rule__Disjunction__Group_2__0__Impl rule__Disjunction__Group_2__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1606:2: rule__Disjunction__Group_2__0__Impl rule__Disjunction__Group_2__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_2__0__Impl_in_rule__Disjunction__Group_2__03317);
            rule__Disjunction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group_2__1_in_rule__Disjunction__Group_2__03320);
            rule__Disjunction__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_2__0"


    // $ANTLR start "rule__Disjunction__Group_2__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1613:1: rule__Disjunction__Group_2__0__Impl : ( () ) ;
    public final void rule__Disjunction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1617:1: ( ( () ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1618:1: ( () )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1618:1: ( () )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1619:1: ()
            {
             before(grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_2_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1620:1: ()
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1622:1: 
            {
            }

             after(grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_2__0__Impl"


    // $ANTLR start "rule__Disjunction__Group_2__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1632:1: rule__Disjunction__Group_2__1 : rule__Disjunction__Group_2__1__Impl rule__Disjunction__Group_2__2 ;
    public final void rule__Disjunction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1636:1: ( rule__Disjunction__Group_2__1__Impl rule__Disjunction__Group_2__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1637:2: rule__Disjunction__Group_2__1__Impl rule__Disjunction__Group_2__2
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_2__1__Impl_in_rule__Disjunction__Group_2__13378);
            rule__Disjunction__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group_2__2_in_rule__Disjunction__Group_2__13381);
            rule__Disjunction__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_2__1"


    // $ANTLR start "rule__Disjunction__Group_2__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1644:1: rule__Disjunction__Group_2__1__Impl : ( '|' ) ;
    public final void rule__Disjunction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1648:1: ( ( '|' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1649:1: ( '|' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1649:1: ( '|' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1650:1: '|'
            {
             before(grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_2_1()); 
            match(input,22,FOLLOW_22_in_rule__Disjunction__Group_2__1__Impl3409); 
             after(grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_2__1__Impl"


    // $ANTLR start "rule__Disjunction__Group_2__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1663:1: rule__Disjunction__Group_2__2 : rule__Disjunction__Group_2__2__Impl ;
    public final void rule__Disjunction__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1667:1: ( rule__Disjunction__Group_2__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1668:2: rule__Disjunction__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_2__2__Impl_in_rule__Disjunction__Group_2__23440);
            rule__Disjunction__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_2__2"


    // $ANTLR start "rule__Disjunction__Group_2__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1674:1: rule__Disjunction__Group_2__2__Impl : ( ( rule__Disjunction__RightAssignment_2_2 ) ) ;
    public final void rule__Disjunction__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1678:1: ( ( ( rule__Disjunction__RightAssignment_2_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1679:1: ( ( rule__Disjunction__RightAssignment_2_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1679:1: ( ( rule__Disjunction__RightAssignment_2_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1680:1: ( rule__Disjunction__RightAssignment_2_2 )
            {
             before(grammarAccess.getDisjunctionAccess().getRightAssignment_2_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1681:1: ( rule__Disjunction__RightAssignment_2_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1681:2: rule__Disjunction__RightAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Disjunction__RightAssignment_2_2_in_rule__Disjunction__Group_2__2__Impl3467);
            rule__Disjunction__RightAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDisjunctionAccess().getRightAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_2__2__Impl"


    // $ANTLR start "rule__StateFormula__Group_0__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1697:1: rule__StateFormula__Group_0__0 : rule__StateFormula__Group_0__0__Impl rule__StateFormula__Group_0__1 ;
    public final void rule__StateFormula__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1701:1: ( rule__StateFormula__Group_0__0__Impl rule__StateFormula__Group_0__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1702:2: rule__StateFormula__Group_0__0__Impl rule__StateFormula__Group_0__1
            {
            pushFollow(FOLLOW_rule__StateFormula__Group_0__0__Impl_in_rule__StateFormula__Group_0__03503);
            rule__StateFormula__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateFormula__Group_0__1_in_rule__StateFormula__Group_0__03506);
            rule__StateFormula__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFormula__Group_0__0"


    // $ANTLR start "rule__StateFormula__Group_0__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1709:1: rule__StateFormula__Group_0__0__Impl : ( '(' ) ;
    public final void rule__StateFormula__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1713:1: ( ( '(' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1714:1: ( '(' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1714:1: ( '(' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1715:1: '('
            {
             before(grammarAccess.getStateFormulaAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,23,FOLLOW_23_in_rule__StateFormula__Group_0__0__Impl3534); 
             after(grammarAccess.getStateFormulaAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFormula__Group_0__0__Impl"


    // $ANTLR start "rule__StateFormula__Group_0__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1728:1: rule__StateFormula__Group_0__1 : rule__StateFormula__Group_0__1__Impl rule__StateFormula__Group_0__2 ;
    public final void rule__StateFormula__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1732:1: ( rule__StateFormula__Group_0__1__Impl rule__StateFormula__Group_0__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1733:2: rule__StateFormula__Group_0__1__Impl rule__StateFormula__Group_0__2
            {
            pushFollow(FOLLOW_rule__StateFormula__Group_0__1__Impl_in_rule__StateFormula__Group_0__13565);
            rule__StateFormula__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateFormula__Group_0__2_in_rule__StateFormula__Group_0__13568);
            rule__StateFormula__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFormula__Group_0__1"


    // $ANTLR start "rule__StateFormula__Group_0__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1740:1: rule__StateFormula__Group_0__1__Impl : ( ( rule__StateFormula__LeftAssignment_0_1 ) ) ;
    public final void rule__StateFormula__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1744:1: ( ( ( rule__StateFormula__LeftAssignment_0_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1745:1: ( ( rule__StateFormula__LeftAssignment_0_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1745:1: ( ( rule__StateFormula__LeftAssignment_0_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1746:1: ( rule__StateFormula__LeftAssignment_0_1 )
            {
             before(grammarAccess.getStateFormulaAccess().getLeftAssignment_0_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1747:1: ( rule__StateFormula__LeftAssignment_0_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1747:2: rule__StateFormula__LeftAssignment_0_1
            {
            pushFollow(FOLLOW_rule__StateFormula__LeftAssignment_0_1_in_rule__StateFormula__Group_0__1__Impl3595);
            rule__StateFormula__LeftAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getStateFormulaAccess().getLeftAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFormula__Group_0__1__Impl"


    // $ANTLR start "rule__StateFormula__Group_0__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1757:1: rule__StateFormula__Group_0__2 : rule__StateFormula__Group_0__2__Impl rule__StateFormula__Group_0__3 ;
    public final void rule__StateFormula__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1761:1: ( rule__StateFormula__Group_0__2__Impl rule__StateFormula__Group_0__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1762:2: rule__StateFormula__Group_0__2__Impl rule__StateFormula__Group_0__3
            {
            pushFollow(FOLLOW_rule__StateFormula__Group_0__2__Impl_in_rule__StateFormula__Group_0__23625);
            rule__StateFormula__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateFormula__Group_0__3_in_rule__StateFormula__Group_0__23628);
            rule__StateFormula__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFormula__Group_0__2"


    // $ANTLR start "rule__StateFormula__Group_0__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1769:1: rule__StateFormula__Group_0__2__Impl : ( ( rule__StateFormula__Alternatives_0_2 )? ) ;
    public final void rule__StateFormula__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1773:1: ( ( ( rule__StateFormula__Alternatives_0_2 )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1774:1: ( ( rule__StateFormula__Alternatives_0_2 )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1774:1: ( ( rule__StateFormula__Alternatives_0_2 )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1775:1: ( rule__StateFormula__Alternatives_0_2 )?
            {
             before(grammarAccess.getStateFormulaAccess().getAlternatives_0_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1776:1: ( rule__StateFormula__Alternatives_0_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=21 && LA17_0<=22)||LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1776:2: rule__StateFormula__Alternatives_0_2
                    {
                    pushFollow(FOLLOW_rule__StateFormula__Alternatives_0_2_in_rule__StateFormula__Group_0__2__Impl3655);
                    rule__StateFormula__Alternatives_0_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateFormulaAccess().getAlternatives_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFormula__Group_0__2__Impl"


    // $ANTLR start "rule__StateFormula__Group_0__3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1786:1: rule__StateFormula__Group_0__3 : rule__StateFormula__Group_0__3__Impl ;
    public final void rule__StateFormula__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1790:1: ( rule__StateFormula__Group_0__3__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1791:2: rule__StateFormula__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__StateFormula__Group_0__3__Impl_in_rule__StateFormula__Group_0__33686);
            rule__StateFormula__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFormula__Group_0__3"


    // $ANTLR start "rule__StateFormula__Group_0__3__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1797:1: rule__StateFormula__Group_0__3__Impl : ( ')' ) ;
    public final void rule__StateFormula__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1801:1: ( ( ')' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1802:1: ( ')' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1802:1: ( ')' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1803:1: ')'
            {
             before(grammarAccess.getStateFormulaAccess().getRightParenthesisKeyword_0_3()); 
            match(input,24,FOLLOW_24_in_rule__StateFormula__Group_0__3__Impl3714); 
             after(grammarAccess.getStateFormulaAccess().getRightParenthesisKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFormula__Group_0__3__Impl"


    // $ANTLR start "rule__SteadyState__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1824:1: rule__SteadyState__Group__0 : rule__SteadyState__Group__0__Impl rule__SteadyState__Group__1 ;
    public final void rule__SteadyState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1828:1: ( rule__SteadyState__Group__0__Impl rule__SteadyState__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1829:2: rule__SteadyState__Group__0__Impl rule__SteadyState__Group__1
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__0__Impl_in_rule__SteadyState__Group__03753);
            rule__SteadyState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__1_in_rule__SteadyState__Group__03756);
            rule__SteadyState__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SteadyState__Group__0"


    // $ANTLR start "rule__SteadyState__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1836:1: rule__SteadyState__Group__0__Impl : ( 'S' ) ;
    public final void rule__SteadyState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1840:1: ( ( 'S' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1841:1: ( 'S' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1841:1: ( 'S' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1842:1: 'S'
            {
             before(grammarAccess.getSteadyStateAccess().getSKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__SteadyState__Group__0__Impl3784); 
             after(grammarAccess.getSteadyStateAccess().getSKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SteadyState__Group__0__Impl"


    // $ANTLR start "rule__SteadyState__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1855:1: rule__SteadyState__Group__1 : rule__SteadyState__Group__1__Impl rule__SteadyState__Group__2 ;
    public final void rule__SteadyState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1859:1: ( rule__SteadyState__Group__1__Impl rule__SteadyState__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1860:2: rule__SteadyState__Group__1__Impl rule__SteadyState__Group__2
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__1__Impl_in_rule__SteadyState__Group__13815);
            rule__SteadyState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__2_in_rule__SteadyState__Group__13818);
            rule__SteadyState__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SteadyState__Group__1"


    // $ANTLR start "rule__SteadyState__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1867:1: rule__SteadyState__Group__1__Impl : ( ( rule__SteadyState__Alternatives_1 ) ) ;
    public final void rule__SteadyState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1871:1: ( ( ( rule__SteadyState__Alternatives_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1872:1: ( ( rule__SteadyState__Alternatives_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1872:1: ( ( rule__SteadyState__Alternatives_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1873:1: ( rule__SteadyState__Alternatives_1 )
            {
             before(grammarAccess.getSteadyStateAccess().getAlternatives_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1874:1: ( rule__SteadyState__Alternatives_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1874:2: rule__SteadyState__Alternatives_1
            {
            pushFollow(FOLLOW_rule__SteadyState__Alternatives_1_in_rule__SteadyState__Group__1__Impl3845);
            rule__SteadyState__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSteadyStateAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SteadyState__Group__1__Impl"


    // $ANTLR start "rule__SteadyState__Group__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1884:1: rule__SteadyState__Group__2 : rule__SteadyState__Group__2__Impl rule__SteadyState__Group__3 ;
    public final void rule__SteadyState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1888:1: ( rule__SteadyState__Group__2__Impl rule__SteadyState__Group__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1889:2: rule__SteadyState__Group__2__Impl rule__SteadyState__Group__3
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__2__Impl_in_rule__SteadyState__Group__23875);
            rule__SteadyState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__3_in_rule__SteadyState__Group__23878);
            rule__SteadyState__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SteadyState__Group__2"


    // $ANTLR start "rule__SteadyState__Group__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1896:1: rule__SteadyState__Group__2__Impl : ( '[' ) ;
    public final void rule__SteadyState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1900:1: ( ( '[' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1901:1: ( '[' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1901:1: ( '[' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1902:1: '['
            {
             before(grammarAccess.getSteadyStateAccess().getLeftSquareBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__SteadyState__Group__2__Impl3906); 
             after(grammarAccess.getSteadyStateAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SteadyState__Group__2__Impl"


    // $ANTLR start "rule__SteadyState__Group__3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1915:1: rule__SteadyState__Group__3 : rule__SteadyState__Group__3__Impl rule__SteadyState__Group__4 ;
    public final void rule__SteadyState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1919:1: ( rule__SteadyState__Group__3__Impl rule__SteadyState__Group__4 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1920:2: rule__SteadyState__Group__3__Impl rule__SteadyState__Group__4
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__3__Impl_in_rule__SteadyState__Group__33937);
            rule__SteadyState__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__4_in_rule__SteadyState__Group__33940);
            rule__SteadyState__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SteadyState__Group__3"


    // $ANTLR start "rule__SteadyState__Group__3__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1927:1: rule__SteadyState__Group__3__Impl : ( ruleStateFormula ) ;
    public final void rule__SteadyState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1931:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1932:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1932:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1933:1: ruleStateFormula
            {
             before(grammarAccess.getSteadyStateAccess().getStateFormulaParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__SteadyState__Group__3__Impl3967);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getSteadyStateAccess().getStateFormulaParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SteadyState__Group__3__Impl"


    // $ANTLR start "rule__SteadyState__Group__4"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1944:1: rule__SteadyState__Group__4 : rule__SteadyState__Group__4__Impl ;
    public final void rule__SteadyState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1948:1: ( rule__SteadyState__Group__4__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1949:2: rule__SteadyState__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__4__Impl_in_rule__SteadyState__Group__43996);
            rule__SteadyState__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SteadyState__Group__4"


    // $ANTLR start "rule__SteadyState__Group__4__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1955:1: rule__SteadyState__Group__4__Impl : ( ']' ) ;
    public final void rule__SteadyState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1959:1: ( ( ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1960:1: ( ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1960:1: ( ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1961:1: ']'
            {
             before(grammarAccess.getSteadyStateAccess().getRightSquareBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__SteadyState__Group__4__Impl4024); 
             after(grammarAccess.getSteadyStateAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SteadyState__Group__4__Impl"


    // $ANTLR start "rule__QuantifiedProbability__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1984:1: rule__QuantifiedProbability__Group__0 : rule__QuantifiedProbability__Group__0__Impl rule__QuantifiedProbability__Group__1 ;
    public final void rule__QuantifiedProbability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1988:1: ( rule__QuantifiedProbability__Group__0__Impl rule__QuantifiedProbability__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1989:2: rule__QuantifiedProbability__Group__0__Impl rule__QuantifiedProbability__Group__1
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__0__Impl_in_rule__QuantifiedProbability__Group__04065);
            rule__QuantifiedProbability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__1_in_rule__QuantifiedProbability__Group__04068);
            rule__QuantifiedProbability__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantifiedProbability__Group__0"


    // $ANTLR start "rule__QuantifiedProbability__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1996:1: rule__QuantifiedProbability__Group__0__Impl : ( ( rule__QuantifiedProbability__Group_0__0 ) ) ;
    public final void rule__QuantifiedProbability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2000:1: ( ( ( rule__QuantifiedProbability__Group_0__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2001:1: ( ( rule__QuantifiedProbability__Group_0__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2001:1: ( ( rule__QuantifiedProbability__Group_0__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2002:1: ( rule__QuantifiedProbability__Group_0__0 )
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getGroup_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2003:1: ( rule__QuantifiedProbability__Group_0__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2003:2: rule__QuantifiedProbability__Group_0__0
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group_0__0_in_rule__QuantifiedProbability__Group__0__Impl4095);
            rule__QuantifiedProbability__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getQuantifiedProbabilityAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantifiedProbability__Group__0__Impl"


    // $ANTLR start "rule__QuantifiedProbability__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2013:1: rule__QuantifiedProbability__Group__1 : rule__QuantifiedProbability__Group__1__Impl rule__QuantifiedProbability__Group__2 ;
    public final void rule__QuantifiedProbability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2017:1: ( rule__QuantifiedProbability__Group__1__Impl rule__QuantifiedProbability__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2018:2: rule__QuantifiedProbability__Group__1__Impl rule__QuantifiedProbability__Group__2
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__1__Impl_in_rule__QuantifiedProbability__Group__14125);
            rule__QuantifiedProbability__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__2_in_rule__QuantifiedProbability__Group__14128);
            rule__QuantifiedProbability__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantifiedProbability__Group__1"


    // $ANTLR start "rule__QuantifiedProbability__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2025:1: rule__QuantifiedProbability__Group__1__Impl : ( '[' ) ;
    public final void rule__QuantifiedProbability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2029:1: ( ( '[' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2030:1: ( '[' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2030:1: ( '[' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2031:1: '['
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getLeftSquareBracketKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__QuantifiedProbability__Group__1__Impl4156); 
             after(grammarAccess.getQuantifiedProbabilityAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantifiedProbability__Group__1__Impl"


    // $ANTLR start "rule__QuantifiedProbability__Group__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2044:1: rule__QuantifiedProbability__Group__2 : rule__QuantifiedProbability__Group__2__Impl rule__QuantifiedProbability__Group__3 ;
    public final void rule__QuantifiedProbability__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2048:1: ( rule__QuantifiedProbability__Group__2__Impl rule__QuantifiedProbability__Group__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2049:2: rule__QuantifiedProbability__Group__2__Impl rule__QuantifiedProbability__Group__3
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__2__Impl_in_rule__QuantifiedProbability__Group__24187);
            rule__QuantifiedProbability__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__3_in_rule__QuantifiedProbability__Group__24190);
            rule__QuantifiedProbability__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantifiedProbability__Group__2"


    // $ANTLR start "rule__QuantifiedProbability__Group__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2056:1: rule__QuantifiedProbability__Group__2__Impl : ( rulePathFormula ) ;
    public final void rule__QuantifiedProbability__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2060:1: ( ( rulePathFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2061:1: ( rulePathFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2061:1: ( rulePathFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2062:1: rulePathFormula
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getPathFormulaParserRuleCall_2()); 
            pushFollow(FOLLOW_rulePathFormula_in_rule__QuantifiedProbability__Group__2__Impl4217);
            rulePathFormula();

            state._fsp--;

             after(grammarAccess.getQuantifiedProbabilityAccess().getPathFormulaParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantifiedProbability__Group__2__Impl"


    // $ANTLR start "rule__QuantifiedProbability__Group__3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2073:1: rule__QuantifiedProbability__Group__3 : rule__QuantifiedProbability__Group__3__Impl ;
    public final void rule__QuantifiedProbability__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2077:1: ( rule__QuantifiedProbability__Group__3__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2078:2: rule__QuantifiedProbability__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__3__Impl_in_rule__QuantifiedProbability__Group__34246);
            rule__QuantifiedProbability__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantifiedProbability__Group__3"


    // $ANTLR start "rule__QuantifiedProbability__Group__3__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2084:1: rule__QuantifiedProbability__Group__3__Impl : ( ']' ) ;
    public final void rule__QuantifiedProbability__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2088:1: ( ( ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2089:1: ( ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2089:1: ( ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2090:1: ']'
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getRightSquareBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__QuantifiedProbability__Group__3__Impl4274); 
             after(grammarAccess.getQuantifiedProbabilityAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantifiedProbability__Group__3__Impl"


    // $ANTLR start "rule__QuantifiedProbability__Group_0__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2111:1: rule__QuantifiedProbability__Group_0__0 : rule__QuantifiedProbability__Group_0__0__Impl rule__QuantifiedProbability__Group_0__1 ;
    public final void rule__QuantifiedProbability__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2115:1: ( rule__QuantifiedProbability__Group_0__0__Impl rule__QuantifiedProbability__Group_0__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2116:2: rule__QuantifiedProbability__Group_0__0__Impl rule__QuantifiedProbability__Group_0__1
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group_0__0__Impl_in_rule__QuantifiedProbability__Group_0__04313);
            rule__QuantifiedProbability__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedProbability__Group_0__1_in_rule__QuantifiedProbability__Group_0__04316);
            rule__QuantifiedProbability__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantifiedProbability__Group_0__0"


    // $ANTLR start "rule__QuantifiedProbability__Group_0__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2123:1: rule__QuantifiedProbability__Group_0__0__Impl : ( 'P' ) ;
    public final void rule__QuantifiedProbability__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2127:1: ( ( 'P' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2128:1: ( 'P' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2128:1: ( 'P' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2129:1: 'P'
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getPKeyword_0_0()); 
            match(input,28,FOLLOW_28_in_rule__QuantifiedProbability__Group_0__0__Impl4344); 
             after(grammarAccess.getQuantifiedProbabilityAccess().getPKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantifiedProbability__Group_0__0__Impl"


    // $ANTLR start "rule__QuantifiedProbability__Group_0__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2142:1: rule__QuantifiedProbability__Group_0__1 : rule__QuantifiedProbability__Group_0__1__Impl ;
    public final void rule__QuantifiedProbability__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2146:1: ( rule__QuantifiedProbability__Group_0__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2147:2: rule__QuantifiedProbability__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group_0__1__Impl_in_rule__QuantifiedProbability__Group_0__14375);
            rule__QuantifiedProbability__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantifiedProbability__Group_0__1"


    // $ANTLR start "rule__QuantifiedProbability__Group_0__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2153:1: rule__QuantifiedProbability__Group_0__1__Impl : ( '=?' ) ;
    public final void rule__QuantifiedProbability__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2157:1: ( ( '=?' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2158:1: ( '=?' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2158:1: ( '=?' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2159:1: '=?'
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getEqualsSignQuestionMarkKeyword_0_1()); 
            match(input,13,FOLLOW_13_in_rule__QuantifiedProbability__Group_0__1__Impl4403); 
             after(grammarAccess.getQuantifiedProbabilityAccess().getEqualsSignQuestionMarkKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuantifiedProbability__Group_0__1__Impl"


    // $ANTLR start "rule__Probability__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2176:1: rule__Probability__Group__0 : rule__Probability__Group__0__Impl rule__Probability__Group__1 ;
    public final void rule__Probability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2180:1: ( rule__Probability__Group__0__Impl rule__Probability__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2181:2: rule__Probability__Group__0__Impl rule__Probability__Group__1
            {
            pushFollow(FOLLOW_rule__Probability__Group__0__Impl_in_rule__Probability__Group__04438);
            rule__Probability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__1_in_rule__Probability__Group__04441);
            rule__Probability__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probability__Group__0"


    // $ANTLR start "rule__Probability__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2188:1: rule__Probability__Group__0__Impl : ( 'P' ) ;
    public final void rule__Probability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2192:1: ( ( 'P' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2193:1: ( 'P' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2193:1: ( 'P' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2194:1: 'P'
            {
             before(grammarAccess.getProbabilityAccess().getPKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Probability__Group__0__Impl4469); 
             after(grammarAccess.getProbabilityAccess().getPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probability__Group__0__Impl"


    // $ANTLR start "rule__Probability__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2207:1: rule__Probability__Group__1 : rule__Probability__Group__1__Impl rule__Probability__Group__2 ;
    public final void rule__Probability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2211:1: ( rule__Probability__Group__1__Impl rule__Probability__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2212:2: rule__Probability__Group__1__Impl rule__Probability__Group__2
            {
            pushFollow(FOLLOW_rule__Probability__Group__1__Impl_in_rule__Probability__Group__14500);
            rule__Probability__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__2_in_rule__Probability__Group__14503);
            rule__Probability__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probability__Group__1"


    // $ANTLR start "rule__Probability__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2219:1: rule__Probability__Group__1__Impl : ( ruleCompareProbability ) ;
    public final void rule__Probability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2223:1: ( ( ruleCompareProbability ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2224:1: ( ruleCompareProbability )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2224:1: ( ruleCompareProbability )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2225:1: ruleCompareProbability
            {
             before(grammarAccess.getProbabilityAccess().getCompareProbabilityParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleCompareProbability_in_rule__Probability__Group__1__Impl4530);
            ruleCompareProbability();

            state._fsp--;

             after(grammarAccess.getProbabilityAccess().getCompareProbabilityParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probability__Group__1__Impl"


    // $ANTLR start "rule__Probability__Group__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2236:1: rule__Probability__Group__2 : rule__Probability__Group__2__Impl rule__Probability__Group__3 ;
    public final void rule__Probability__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2240:1: ( rule__Probability__Group__2__Impl rule__Probability__Group__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2241:2: rule__Probability__Group__2__Impl rule__Probability__Group__3
            {
            pushFollow(FOLLOW_rule__Probability__Group__2__Impl_in_rule__Probability__Group__24559);
            rule__Probability__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__3_in_rule__Probability__Group__24562);
            rule__Probability__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probability__Group__2"


    // $ANTLR start "rule__Probability__Group__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2248:1: rule__Probability__Group__2__Impl : ( '[' ) ;
    public final void rule__Probability__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2252:1: ( ( '[' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2253:1: ( '[' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2253:1: ( '[' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2254:1: '['
            {
             before(grammarAccess.getProbabilityAccess().getLeftSquareBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Probability__Group__2__Impl4590); 
             after(grammarAccess.getProbabilityAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probability__Group__2__Impl"


    // $ANTLR start "rule__Probability__Group__3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2267:1: rule__Probability__Group__3 : rule__Probability__Group__3__Impl rule__Probability__Group__4 ;
    public final void rule__Probability__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2271:1: ( rule__Probability__Group__3__Impl rule__Probability__Group__4 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2272:2: rule__Probability__Group__3__Impl rule__Probability__Group__4
            {
            pushFollow(FOLLOW_rule__Probability__Group__3__Impl_in_rule__Probability__Group__34621);
            rule__Probability__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__4_in_rule__Probability__Group__34624);
            rule__Probability__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probability__Group__3"


    // $ANTLR start "rule__Probability__Group__3__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2279:1: rule__Probability__Group__3__Impl : ( rulePathFormula ) ;
    public final void rule__Probability__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2283:1: ( ( rulePathFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2284:1: ( rulePathFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2284:1: ( rulePathFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2285:1: rulePathFormula
            {
             before(grammarAccess.getProbabilityAccess().getPathFormulaParserRuleCall_3()); 
            pushFollow(FOLLOW_rulePathFormula_in_rule__Probability__Group__3__Impl4651);
            rulePathFormula();

            state._fsp--;

             after(grammarAccess.getProbabilityAccess().getPathFormulaParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probability__Group__3__Impl"


    // $ANTLR start "rule__Probability__Group__4"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2296:1: rule__Probability__Group__4 : rule__Probability__Group__4__Impl ;
    public final void rule__Probability__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2300:1: ( rule__Probability__Group__4__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2301:2: rule__Probability__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Probability__Group__4__Impl_in_rule__Probability__Group__44680);
            rule__Probability__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probability__Group__4"


    // $ANTLR start "rule__Probability__Group__4__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2307:1: rule__Probability__Group__4__Impl : ( ']' ) ;
    public final void rule__Probability__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2311:1: ( ( ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2312:1: ( ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2312:1: ( ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2313:1: ']'
            {
             before(grammarAccess.getProbabilityAccess().getRightSquareBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Probability__Group__4__Impl4708); 
             after(grammarAccess.getProbabilityAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probability__Group__4__Impl"


    // $ANTLR start "rule__Until__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2336:1: rule__Until__Group__0 : rule__Until__Group__0__Impl rule__Until__Group__1 ;
    public final void rule__Until__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2340:1: ( rule__Until__Group__0__Impl rule__Until__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2341:2: rule__Until__Group__0__Impl rule__Until__Group__1
            {
            pushFollow(FOLLOW_rule__Until__Group__0__Impl_in_rule__Until__Group__04749);
            rule__Until__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Until__Group__1_in_rule__Until__Group__04752);
            rule__Until__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Until__Group__0"


    // $ANTLR start "rule__Until__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2348:1: rule__Until__Group__0__Impl : ( ( rule__Until__LeftAssignment_0 ) ) ;
    public final void rule__Until__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2352:1: ( ( ( rule__Until__LeftAssignment_0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2353:1: ( ( rule__Until__LeftAssignment_0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2353:1: ( ( rule__Until__LeftAssignment_0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2354:1: ( rule__Until__LeftAssignment_0 )
            {
             before(grammarAccess.getUntilAccess().getLeftAssignment_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2355:1: ( rule__Until__LeftAssignment_0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2355:2: rule__Until__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__Until__LeftAssignment_0_in_rule__Until__Group__0__Impl4779);
            rule__Until__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUntilAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Until__Group__0__Impl"


    // $ANTLR start "rule__Until__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2365:1: rule__Until__Group__1 : rule__Until__Group__1__Impl rule__Until__Group__2 ;
    public final void rule__Until__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2369:1: ( rule__Until__Group__1__Impl rule__Until__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2370:2: rule__Until__Group__1__Impl rule__Until__Group__2
            {
            pushFollow(FOLLOW_rule__Until__Group__1__Impl_in_rule__Until__Group__14809);
            rule__Until__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Until__Group__2_in_rule__Until__Group__14812);
            rule__Until__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Until__Group__1"


    // $ANTLR start "rule__Until__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2377:1: rule__Until__Group__1__Impl : ( ( rule__Until__Alternatives_1 ) ) ;
    public final void rule__Until__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2381:1: ( ( ( rule__Until__Alternatives_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2382:1: ( ( rule__Until__Alternatives_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2382:1: ( ( rule__Until__Alternatives_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2383:1: ( rule__Until__Alternatives_1 )
            {
             before(grammarAccess.getUntilAccess().getAlternatives_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2384:1: ( rule__Until__Alternatives_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2384:2: rule__Until__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Until__Alternatives_1_in_rule__Until__Group__1__Impl4839);
            rule__Until__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getUntilAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Until__Group__1__Impl"


    // $ANTLR start "rule__Until__Group__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2394:1: rule__Until__Group__2 : rule__Until__Group__2__Impl rule__Until__Group__3 ;
    public final void rule__Until__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2398:1: ( rule__Until__Group__2__Impl rule__Until__Group__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2399:2: rule__Until__Group__2__Impl rule__Until__Group__3
            {
            pushFollow(FOLLOW_rule__Until__Group__2__Impl_in_rule__Until__Group__24869);
            rule__Until__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Until__Group__3_in_rule__Until__Group__24872);
            rule__Until__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Until__Group__2"


    // $ANTLR start "rule__Until__Group__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2406:1: rule__Until__Group__2__Impl : ( ( ruleTimeBound )? ) ;
    public final void rule__Until__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2410:1: ( ( ( ruleTimeBound )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2411:1: ( ( ruleTimeBound )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2411:1: ( ( ruleTimeBound )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2412:1: ( ruleTimeBound )?
            {
             before(grammarAccess.getUntilAccess().getTimeBoundParserRuleCall_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2413:1: ( ruleTimeBound )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17||LA18_0==26||(LA18_0>=33 && LA18_0<=34)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2413:3: ruleTimeBound
                    {
                    pushFollow(FOLLOW_ruleTimeBound_in_rule__Until__Group__2__Impl4900);
                    ruleTimeBound();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUntilAccess().getTimeBoundParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Until__Group__2__Impl"


    // $ANTLR start "rule__Until__Group__3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2423:1: rule__Until__Group__3 : rule__Until__Group__3__Impl ;
    public final void rule__Until__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2427:1: ( rule__Until__Group__3__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2428:2: rule__Until__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Until__Group__3__Impl_in_rule__Until__Group__34931);
            rule__Until__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Until__Group__3"


    // $ANTLR start "rule__Until__Group__3__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2434:1: rule__Until__Group__3__Impl : ( ( rule__Until__RightAssignment_3 ) ) ;
    public final void rule__Until__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2438:1: ( ( ( rule__Until__RightAssignment_3 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2439:1: ( ( rule__Until__RightAssignment_3 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2439:1: ( ( rule__Until__RightAssignment_3 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2440:1: ( rule__Until__RightAssignment_3 )
            {
             before(grammarAccess.getUntilAccess().getRightAssignment_3()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2441:1: ( rule__Until__RightAssignment_3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2441:2: rule__Until__RightAssignment_3
            {
            pushFollow(FOLLOW_rule__Until__RightAssignment_3_in_rule__Until__Group__3__Impl4958);
            rule__Until__RightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUntilAccess().getRightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Until__Group__3__Impl"


    // $ANTLR start "rule__Next__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2459:1: rule__Next__Group__0 : rule__Next__Group__0__Impl rule__Next__Group__1 ;
    public final void rule__Next__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2463:1: ( rule__Next__Group__0__Impl rule__Next__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2464:2: rule__Next__Group__0__Impl rule__Next__Group__1
            {
            pushFollow(FOLLOW_rule__Next__Group__0__Impl_in_rule__Next__Group__04996);
            rule__Next__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Next__Group__1_in_rule__Next__Group__04999);
            rule__Next__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group__0"


    // $ANTLR start "rule__Next__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2471:1: rule__Next__Group__0__Impl : ( 'X' ) ;
    public final void rule__Next__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2475:1: ( ( 'X' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2476:1: ( 'X' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2476:1: ( 'X' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2477:1: 'X'
            {
             before(grammarAccess.getNextAccess().getXKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Next__Group__0__Impl5027); 
             after(grammarAccess.getNextAccess().getXKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group__0__Impl"


    // $ANTLR start "rule__Next__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2490:1: rule__Next__Group__1 : rule__Next__Group__1__Impl rule__Next__Group__2 ;
    public final void rule__Next__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2494:1: ( rule__Next__Group__1__Impl rule__Next__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2495:2: rule__Next__Group__1__Impl rule__Next__Group__2
            {
            pushFollow(FOLLOW_rule__Next__Group__1__Impl_in_rule__Next__Group__15058);
            rule__Next__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Next__Group__2_in_rule__Next__Group__15061);
            rule__Next__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group__1"


    // $ANTLR start "rule__Next__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2502:1: rule__Next__Group__1__Impl : ( ( ruleTimeBound )? ) ;
    public final void rule__Next__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2506:1: ( ( ( ruleTimeBound )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2507:1: ( ( ruleTimeBound )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2507:1: ( ( ruleTimeBound )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2508:1: ( ruleTimeBound )?
            {
             before(grammarAccess.getNextAccess().getTimeBoundParserRuleCall_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2509:1: ( ruleTimeBound )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17||LA19_0==26||(LA19_0>=33 && LA19_0<=34)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2509:3: ruleTimeBound
                    {
                    pushFollow(FOLLOW_ruleTimeBound_in_rule__Next__Group__1__Impl5089);
                    ruleTimeBound();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNextAccess().getTimeBoundParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group__1__Impl"


    // $ANTLR start "rule__Next__Group__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2519:1: rule__Next__Group__2 : rule__Next__Group__2__Impl ;
    public final void rule__Next__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2523:1: ( rule__Next__Group__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2524:2: rule__Next__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Next__Group__2__Impl_in_rule__Next__Group__25120);
            rule__Next__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group__2"


    // $ANTLR start "rule__Next__Group__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2530:1: rule__Next__Group__2__Impl : ( ( rule__Next__RightAssignment_2 ) ) ;
    public final void rule__Next__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2534:1: ( ( ( rule__Next__RightAssignment_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2535:1: ( ( rule__Next__RightAssignment_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2535:1: ( ( rule__Next__RightAssignment_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2536:1: ( rule__Next__RightAssignment_2 )
            {
             before(grammarAccess.getNextAccess().getRightAssignment_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2537:1: ( rule__Next__RightAssignment_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2537:2: rule__Next__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__Next__RightAssignment_2_in_rule__Next__Group__2__Impl5147);
            rule__Next__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNextAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__Group__2__Impl"


    // $ANTLR start "rule__Future__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2553:1: rule__Future__Group__0 : rule__Future__Group__0__Impl rule__Future__Group__1 ;
    public final void rule__Future__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2557:1: ( rule__Future__Group__0__Impl rule__Future__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2558:2: rule__Future__Group__0__Impl rule__Future__Group__1
            {
            pushFollow(FOLLOW_rule__Future__Group__0__Impl_in_rule__Future__Group__05183);
            rule__Future__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Future__Group__1_in_rule__Future__Group__05186);
            rule__Future__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Future__Group__0"


    // $ANTLR start "rule__Future__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2565:1: rule__Future__Group__0__Impl : ( 'F' ) ;
    public final void rule__Future__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2569:1: ( ( 'F' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2570:1: ( 'F' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2570:1: ( 'F' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2571:1: 'F'
            {
             before(grammarAccess.getFutureAccess().getFKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Future__Group__0__Impl5214); 
             after(grammarAccess.getFutureAccess().getFKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Future__Group__0__Impl"


    // $ANTLR start "rule__Future__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2584:1: rule__Future__Group__1 : rule__Future__Group__1__Impl rule__Future__Group__2 ;
    public final void rule__Future__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2588:1: ( rule__Future__Group__1__Impl rule__Future__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2589:2: rule__Future__Group__1__Impl rule__Future__Group__2
            {
            pushFollow(FOLLOW_rule__Future__Group__1__Impl_in_rule__Future__Group__15245);
            rule__Future__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Future__Group__2_in_rule__Future__Group__15248);
            rule__Future__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Future__Group__1"


    // $ANTLR start "rule__Future__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2596:1: rule__Future__Group__1__Impl : ( ( ruleTimeBound )? ) ;
    public final void rule__Future__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2600:1: ( ( ( ruleTimeBound )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2601:1: ( ( ruleTimeBound )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2601:1: ( ( ruleTimeBound )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2602:1: ( ruleTimeBound )?
            {
             before(grammarAccess.getFutureAccess().getTimeBoundParserRuleCall_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2603:1: ( ruleTimeBound )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17||LA20_0==26||(LA20_0>=33 && LA20_0<=34)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2603:3: ruleTimeBound
                    {
                    pushFollow(FOLLOW_ruleTimeBound_in_rule__Future__Group__1__Impl5276);
                    ruleTimeBound();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFutureAccess().getTimeBoundParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Future__Group__1__Impl"


    // $ANTLR start "rule__Future__Group__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2613:1: rule__Future__Group__2 : rule__Future__Group__2__Impl ;
    public final void rule__Future__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2617:1: ( rule__Future__Group__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2618:2: rule__Future__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Future__Group__2__Impl_in_rule__Future__Group__25307);
            rule__Future__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Future__Group__2"


    // $ANTLR start "rule__Future__Group__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2624:1: rule__Future__Group__2__Impl : ( ( rule__Future__RightAssignment_2 ) ) ;
    public final void rule__Future__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2628:1: ( ( ( rule__Future__RightAssignment_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2629:1: ( ( rule__Future__RightAssignment_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2629:1: ( ( rule__Future__RightAssignment_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2630:1: ( rule__Future__RightAssignment_2 )
            {
             before(grammarAccess.getFutureAccess().getRightAssignment_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2631:1: ( rule__Future__RightAssignment_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2631:2: rule__Future__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__Future__RightAssignment_2_in_rule__Future__Group__2__Impl5334);
            rule__Future__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFutureAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Future__Group__2__Impl"


    // $ANTLR start "rule__Globally__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2647:1: rule__Globally__Group__0 : rule__Globally__Group__0__Impl rule__Globally__Group__1 ;
    public final void rule__Globally__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2651:1: ( rule__Globally__Group__0__Impl rule__Globally__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2652:2: rule__Globally__Group__0__Impl rule__Globally__Group__1
            {
            pushFollow(FOLLOW_rule__Globally__Group__0__Impl_in_rule__Globally__Group__05370);
            rule__Globally__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Globally__Group__1_in_rule__Globally__Group__05373);
            rule__Globally__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Globally__Group__0"


    // $ANTLR start "rule__Globally__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2659:1: rule__Globally__Group__0__Impl : ( 'G' ) ;
    public final void rule__Globally__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2663:1: ( ( 'G' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2664:1: ( 'G' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2664:1: ( 'G' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2665:1: 'G'
            {
             before(grammarAccess.getGloballyAccess().getGKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Globally__Group__0__Impl5401); 
             after(grammarAccess.getGloballyAccess().getGKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Globally__Group__0__Impl"


    // $ANTLR start "rule__Globally__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2678:1: rule__Globally__Group__1 : rule__Globally__Group__1__Impl rule__Globally__Group__2 ;
    public final void rule__Globally__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2682:1: ( rule__Globally__Group__1__Impl rule__Globally__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2683:2: rule__Globally__Group__1__Impl rule__Globally__Group__2
            {
            pushFollow(FOLLOW_rule__Globally__Group__1__Impl_in_rule__Globally__Group__15432);
            rule__Globally__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Globally__Group__2_in_rule__Globally__Group__15435);
            rule__Globally__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Globally__Group__1"


    // $ANTLR start "rule__Globally__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2690:1: rule__Globally__Group__1__Impl : ( ( ruleTimeBound )? ) ;
    public final void rule__Globally__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2694:1: ( ( ( ruleTimeBound )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2695:1: ( ( ruleTimeBound )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2695:1: ( ( ruleTimeBound )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2696:1: ( ruleTimeBound )?
            {
             before(grammarAccess.getGloballyAccess().getTimeBoundParserRuleCall_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2697:1: ( ruleTimeBound )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17||LA21_0==26||(LA21_0>=33 && LA21_0<=34)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2697:3: ruleTimeBound
                    {
                    pushFollow(FOLLOW_ruleTimeBound_in_rule__Globally__Group__1__Impl5463);
                    ruleTimeBound();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGloballyAccess().getTimeBoundParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Globally__Group__1__Impl"


    // $ANTLR start "rule__Globally__Group__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2707:1: rule__Globally__Group__2 : rule__Globally__Group__2__Impl ;
    public final void rule__Globally__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2711:1: ( rule__Globally__Group__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2712:2: rule__Globally__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Globally__Group__2__Impl_in_rule__Globally__Group__25494);
            rule__Globally__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Globally__Group__2"


    // $ANTLR start "rule__Globally__Group__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2718:1: rule__Globally__Group__2__Impl : ( ( rule__Globally__RightAssignment_2 ) ) ;
    public final void rule__Globally__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2722:1: ( ( ( rule__Globally__RightAssignment_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2723:1: ( ( rule__Globally__RightAssignment_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2723:1: ( ( rule__Globally__RightAssignment_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2724:1: ( rule__Globally__RightAssignment_2 )
            {
             before(grammarAccess.getGloballyAccess().getRightAssignment_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2725:1: ( rule__Globally__RightAssignment_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2725:2: rule__Globally__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__Globally__RightAssignment_2_in_rule__Globally__Group__2__Impl5521);
            rule__Globally__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGloballyAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Globally__Group__2__Impl"


    // $ANTLR start "rule__Implication__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2741:1: rule__Implication__Group__0 : rule__Implication__Group__0__Impl rule__Implication__Group__1 ;
    public final void rule__Implication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2745:1: ( rule__Implication__Group__0__Impl rule__Implication__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2746:2: rule__Implication__Group__0__Impl rule__Implication__Group__1
            {
            pushFollow(FOLLOW_rule__Implication__Group__0__Impl_in_rule__Implication__Group__05557);
            rule__Implication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Implication__Group__1_in_rule__Implication__Group__05560);
            rule__Implication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__Group__0"


    // $ANTLR start "rule__Implication__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2753:1: rule__Implication__Group__0__Impl : ( '=>' ) ;
    public final void rule__Implication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2757:1: ( ( '=>' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2758:1: ( '=>' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2758:1: ( '=>' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2759:1: '=>'
            {
             before(grammarAccess.getImplicationAccess().getEqualsSignGreaterThanSignKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Implication__Group__0__Impl5588); 
             after(grammarAccess.getImplicationAccess().getEqualsSignGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__Group__0__Impl"


    // $ANTLR start "rule__Implication__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2772:1: rule__Implication__Group__1 : rule__Implication__Group__1__Impl ;
    public final void rule__Implication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2776:1: ( rule__Implication__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2777:2: rule__Implication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Implication__Group__1__Impl_in_rule__Implication__Group__15619);
            rule__Implication__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__Group__1"


    // $ANTLR start "rule__Implication__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2783:1: rule__Implication__Group__1__Impl : ( ( rule__Implication__RightAssignment_1 ) ) ;
    public final void rule__Implication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2787:1: ( ( ( rule__Implication__RightAssignment_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2788:1: ( ( rule__Implication__RightAssignment_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2788:1: ( ( rule__Implication__RightAssignment_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2789:1: ( rule__Implication__RightAssignment_1 )
            {
             before(grammarAccess.getImplicationAccess().getRightAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2790:1: ( rule__Implication__RightAssignment_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2790:2: rule__Implication__RightAssignment_1
            {
            pushFollow(FOLLOW_rule__Implication__RightAssignment_1_in_rule__Implication__Group__1__Impl5646);
            rule__Implication__RightAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImplicationAccess().getRightAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__Group__1__Impl"


    // $ANTLR start "rule__CompareProbability__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2804:1: rule__CompareProbability__Group__0 : rule__CompareProbability__Group__0__Impl rule__CompareProbability__Group__1 ;
    public final void rule__CompareProbability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2808:1: ( rule__CompareProbability__Group__0__Impl rule__CompareProbability__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2809:2: rule__CompareProbability__Group__0__Impl rule__CompareProbability__Group__1
            {
            pushFollow(FOLLOW_rule__CompareProbability__Group__0__Impl_in_rule__CompareProbability__Group__05680);
            rule__CompareProbability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareProbability__Group__1_in_rule__CompareProbability__Group__05683);
            rule__CompareProbability__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareProbability__Group__0"


    // $ANTLR start "rule__CompareProbability__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2816:1: rule__CompareProbability__Group__0__Impl : ( ( rule__CompareProbability__Alternatives_0 ) ) ;
    public final void rule__CompareProbability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2820:1: ( ( ( rule__CompareProbability__Alternatives_0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2821:1: ( ( rule__CompareProbability__Alternatives_0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2821:1: ( ( rule__CompareProbability__Alternatives_0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2822:1: ( rule__CompareProbability__Alternatives_0 )
            {
             before(grammarAccess.getCompareProbabilityAccess().getAlternatives_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2823:1: ( rule__CompareProbability__Alternatives_0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2823:2: rule__CompareProbability__Alternatives_0
            {
            pushFollow(FOLLOW_rule__CompareProbability__Alternatives_0_in_rule__CompareProbability__Group__0__Impl5710);
            rule__CompareProbability__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCompareProbabilityAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareProbability__Group__0__Impl"


    // $ANTLR start "rule__CompareProbability__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2833:1: rule__CompareProbability__Group__1 : rule__CompareProbability__Group__1__Impl ;
    public final void rule__CompareProbability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2837:1: ( rule__CompareProbability__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2838:2: rule__CompareProbability__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareProbability__Group__1__Impl_in_rule__CompareProbability__Group__15740);
            rule__CompareProbability__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareProbability__Group__1"


    // $ANTLR start "rule__CompareProbability__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2844:1: rule__CompareProbability__Group__1__Impl : ( RULE_DECIMAL ) ;
    public final void rule__CompareProbability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2848:1: ( ( RULE_DECIMAL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2849:1: ( RULE_DECIMAL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2849:1: ( RULE_DECIMAL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2850:1: RULE_DECIMAL
            {
             before(grammarAccess.getCompareProbabilityAccess().getDECIMALTerminalRuleCall_1()); 
            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__CompareProbability__Group__1__Impl5767); 
             after(grammarAccess.getCompareProbabilityAccess().getDECIMALTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareProbability__Group__1__Impl"


    // $ANTLR start "rule__CompareProbability__Group_0_0__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2865:1: rule__CompareProbability__Group_0_0__0 : rule__CompareProbability__Group_0_0__0__Impl rule__CompareProbability__Group_0_0__1 ;
    public final void rule__CompareProbability__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2869:1: ( rule__CompareProbability__Group_0_0__0__Impl rule__CompareProbability__Group_0_0__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2870:2: rule__CompareProbability__Group_0_0__0__Impl rule__CompareProbability__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__CompareProbability__Group_0_0__0__Impl_in_rule__CompareProbability__Group_0_0__05800);
            rule__CompareProbability__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareProbability__Group_0_0__1_in_rule__CompareProbability__Group_0_0__05803);
            rule__CompareProbability__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareProbability__Group_0_0__0"


    // $ANTLR start "rule__CompareProbability__Group_0_0__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2877:1: rule__CompareProbability__Group_0_0__0__Impl : ( '>' ) ;
    public final void rule__CompareProbability__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2881:1: ( ( '>' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2882:1: ( '>' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2882:1: ( '>' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2883:1: '>'
            {
             before(grammarAccess.getCompareProbabilityAccess().getGreaterThanSignKeyword_0_0_0()); 
            match(input,33,FOLLOW_33_in_rule__CompareProbability__Group_0_0__0__Impl5831); 
             after(grammarAccess.getCompareProbabilityAccess().getGreaterThanSignKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareProbability__Group_0_0__0__Impl"


    // $ANTLR start "rule__CompareProbability__Group_0_0__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2896:1: rule__CompareProbability__Group_0_0__1 : rule__CompareProbability__Group_0_0__1__Impl ;
    public final void rule__CompareProbability__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2900:1: ( rule__CompareProbability__Group_0_0__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2901:2: rule__CompareProbability__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareProbability__Group_0_0__1__Impl_in_rule__CompareProbability__Group_0_0__15862);
            rule__CompareProbability__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareProbability__Group_0_0__1"


    // $ANTLR start "rule__CompareProbability__Group_0_0__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2907:1: rule__CompareProbability__Group_0_0__1__Impl : ( ( '=' )? ) ;
    public final void rule__CompareProbability__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2911:1: ( ( ( '=' )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2912:1: ( ( '=' )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2912:1: ( ( '=' )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2913:1: ( '=' )?
            {
             before(grammarAccess.getCompareProbabilityAccess().getEqualsSignKeyword_0_0_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2914:1: ( '=' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2915:2: '='
                    {
                    match(input,17,FOLLOW_17_in_rule__CompareProbability__Group_0_0__1__Impl5891); 

                    }
                    break;

            }

             after(grammarAccess.getCompareProbabilityAccess().getEqualsSignKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareProbability__Group_0_0__1__Impl"


    // $ANTLR start "rule__CompareProbability__Group_0_1__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2930:1: rule__CompareProbability__Group_0_1__0 : rule__CompareProbability__Group_0_1__0__Impl rule__CompareProbability__Group_0_1__1 ;
    public final void rule__CompareProbability__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2934:1: ( rule__CompareProbability__Group_0_1__0__Impl rule__CompareProbability__Group_0_1__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2935:2: rule__CompareProbability__Group_0_1__0__Impl rule__CompareProbability__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__CompareProbability__Group_0_1__0__Impl_in_rule__CompareProbability__Group_0_1__05928);
            rule__CompareProbability__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareProbability__Group_0_1__1_in_rule__CompareProbability__Group_0_1__05931);
            rule__CompareProbability__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareProbability__Group_0_1__0"


    // $ANTLR start "rule__CompareProbability__Group_0_1__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2942:1: rule__CompareProbability__Group_0_1__0__Impl : ( '<' ) ;
    public final void rule__CompareProbability__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2946:1: ( ( '<' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2947:1: ( '<' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2947:1: ( '<' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2948:1: '<'
            {
             before(grammarAccess.getCompareProbabilityAccess().getLessThanSignKeyword_0_1_0()); 
            match(input,34,FOLLOW_34_in_rule__CompareProbability__Group_0_1__0__Impl5959); 
             after(grammarAccess.getCompareProbabilityAccess().getLessThanSignKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareProbability__Group_0_1__0__Impl"


    // $ANTLR start "rule__CompareProbability__Group_0_1__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2961:1: rule__CompareProbability__Group_0_1__1 : rule__CompareProbability__Group_0_1__1__Impl ;
    public final void rule__CompareProbability__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2965:1: ( rule__CompareProbability__Group_0_1__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2966:2: rule__CompareProbability__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareProbability__Group_0_1__1__Impl_in_rule__CompareProbability__Group_0_1__15990);
            rule__CompareProbability__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareProbability__Group_0_1__1"


    // $ANTLR start "rule__CompareProbability__Group_0_1__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2972:1: rule__CompareProbability__Group_0_1__1__Impl : ( ( '=' )? ) ;
    public final void rule__CompareProbability__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2976:1: ( ( ( '=' )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2977:1: ( ( '=' )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2977:1: ( ( '=' )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2978:1: ( '=' )?
            {
             before(grammarAccess.getCompareProbabilityAccess().getEqualsSignKeyword_0_1_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2979:1: ( '=' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2980:2: '='
                    {
                    match(input,17,FOLLOW_17_in_rule__CompareProbability__Group_0_1__1__Impl6019); 

                    }
                    break;

            }

             after(grammarAccess.getCompareProbabilityAccess().getEqualsSignKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareProbability__Group_0_1__1__Impl"


    // $ANTLR start "rule__TimeBound__Group_0__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2995:1: rule__TimeBound__Group_0__0 : rule__TimeBound__Group_0__0__Impl rule__TimeBound__Group_0__1 ;
    public final void rule__TimeBound__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2999:1: ( rule__TimeBound__Group_0__0__Impl rule__TimeBound__Group_0__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3000:2: rule__TimeBound__Group_0__0__Impl rule__TimeBound__Group_0__1
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_0__0__Impl_in_rule__TimeBound__Group_0__06056);
            rule__TimeBound__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_0__1_in_rule__TimeBound__Group_0__06059);
            rule__TimeBound__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_0__0"


    // $ANTLR start "rule__TimeBound__Group_0__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3007:1: rule__TimeBound__Group_0__0__Impl : ( ( rule__TimeBound__Alternatives_0_0 ) ) ;
    public final void rule__TimeBound__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3011:1: ( ( ( rule__TimeBound__Alternatives_0_0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3012:1: ( ( rule__TimeBound__Alternatives_0_0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3012:1: ( ( rule__TimeBound__Alternatives_0_0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3013:1: ( rule__TimeBound__Alternatives_0_0 )
            {
             before(grammarAccess.getTimeBoundAccess().getAlternatives_0_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3014:1: ( rule__TimeBound__Alternatives_0_0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3014:2: rule__TimeBound__Alternatives_0_0
            {
            pushFollow(FOLLOW_rule__TimeBound__Alternatives_0_0_in_rule__TimeBound__Group_0__0__Impl6086);
            rule__TimeBound__Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTimeBoundAccess().getAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_0__0__Impl"


    // $ANTLR start "rule__TimeBound__Group_0__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3024:1: rule__TimeBound__Group_0__1 : rule__TimeBound__Group_0__1__Impl ;
    public final void rule__TimeBound__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3028:1: ( rule__TimeBound__Group_0__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3029:2: rule__TimeBound__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_0__1__Impl_in_rule__TimeBound__Group_0__16116);
            rule__TimeBound__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_0__1"


    // $ANTLR start "rule__TimeBound__Group_0__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3035:1: rule__TimeBound__Group_0__1__Impl : ( RULE_DECIMAL ) ;
    public final void rule__TimeBound__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3039:1: ( ( RULE_DECIMAL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3040:1: ( RULE_DECIMAL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3040:1: ( RULE_DECIMAL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3041:1: RULE_DECIMAL
            {
             before(grammarAccess.getTimeBoundAccess().getDECIMALTerminalRuleCall_0_1()); 
            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__TimeBound__Group_0__1__Impl6143); 
             after(grammarAccess.getTimeBoundAccess().getDECIMALTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_0__1__Impl"


    // $ANTLR start "rule__TimeBound__Group_0_0_0__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3056:1: rule__TimeBound__Group_0_0_0__0 : rule__TimeBound__Group_0_0_0__0__Impl rule__TimeBound__Group_0_0_0__1 ;
    public final void rule__TimeBound__Group_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3060:1: ( rule__TimeBound__Group_0_0_0__0__Impl rule__TimeBound__Group_0_0_0__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3061:2: rule__TimeBound__Group_0_0_0__0__Impl rule__TimeBound__Group_0_0_0__1
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_0_0_0__0__Impl_in_rule__TimeBound__Group_0_0_0__06176);
            rule__TimeBound__Group_0_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_0_0_0__1_in_rule__TimeBound__Group_0_0_0__06179);
            rule__TimeBound__Group_0_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_0_0_0__0"


    // $ANTLR start "rule__TimeBound__Group_0_0_0__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3068:1: rule__TimeBound__Group_0_0_0__0__Impl : ( '>' ) ;
    public final void rule__TimeBound__Group_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3072:1: ( ( '>' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3073:1: ( '>' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3073:1: ( '>' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3074:1: '>'
            {
             before(grammarAccess.getTimeBoundAccess().getGreaterThanSignKeyword_0_0_0_0()); 
            match(input,33,FOLLOW_33_in_rule__TimeBound__Group_0_0_0__0__Impl6207); 
             after(grammarAccess.getTimeBoundAccess().getGreaterThanSignKeyword_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_0_0_0__0__Impl"


    // $ANTLR start "rule__TimeBound__Group_0_0_0__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3087:1: rule__TimeBound__Group_0_0_0__1 : rule__TimeBound__Group_0_0_0__1__Impl ;
    public final void rule__TimeBound__Group_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3091:1: ( rule__TimeBound__Group_0_0_0__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3092:2: rule__TimeBound__Group_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_0_0_0__1__Impl_in_rule__TimeBound__Group_0_0_0__16238);
            rule__TimeBound__Group_0_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_0_0_0__1"


    // $ANTLR start "rule__TimeBound__Group_0_0_0__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3098:1: rule__TimeBound__Group_0_0_0__1__Impl : ( ( '=' )? ) ;
    public final void rule__TimeBound__Group_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3102:1: ( ( ( '=' )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3103:1: ( ( '=' )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3103:1: ( ( '=' )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3104:1: ( '=' )?
            {
             before(grammarAccess.getTimeBoundAccess().getEqualsSignKeyword_0_0_0_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3105:1: ( '=' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3106:2: '='
                    {
                    match(input,17,FOLLOW_17_in_rule__TimeBound__Group_0_0_0__1__Impl6267); 

                    }
                    break;

            }

             after(grammarAccess.getTimeBoundAccess().getEqualsSignKeyword_0_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_0_0_0__1__Impl"


    // $ANTLR start "rule__TimeBound__Group_0_0_1__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3121:1: rule__TimeBound__Group_0_0_1__0 : rule__TimeBound__Group_0_0_1__0__Impl rule__TimeBound__Group_0_0_1__1 ;
    public final void rule__TimeBound__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3125:1: ( rule__TimeBound__Group_0_0_1__0__Impl rule__TimeBound__Group_0_0_1__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3126:2: rule__TimeBound__Group_0_0_1__0__Impl rule__TimeBound__Group_0_0_1__1
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_0_0_1__0__Impl_in_rule__TimeBound__Group_0_0_1__06304);
            rule__TimeBound__Group_0_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_0_0_1__1_in_rule__TimeBound__Group_0_0_1__06307);
            rule__TimeBound__Group_0_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_0_0_1__0"


    // $ANTLR start "rule__TimeBound__Group_0_0_1__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3133:1: rule__TimeBound__Group_0_0_1__0__Impl : ( '<' ) ;
    public final void rule__TimeBound__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3137:1: ( ( '<' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3138:1: ( '<' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3138:1: ( '<' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3139:1: '<'
            {
             before(grammarAccess.getTimeBoundAccess().getLessThanSignKeyword_0_0_1_0()); 
            match(input,34,FOLLOW_34_in_rule__TimeBound__Group_0_0_1__0__Impl6335); 
             after(grammarAccess.getTimeBoundAccess().getLessThanSignKeyword_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_0_0_1__0__Impl"


    // $ANTLR start "rule__TimeBound__Group_0_0_1__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3152:1: rule__TimeBound__Group_0_0_1__1 : rule__TimeBound__Group_0_0_1__1__Impl ;
    public final void rule__TimeBound__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3156:1: ( rule__TimeBound__Group_0_0_1__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3157:2: rule__TimeBound__Group_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_0_0_1__1__Impl_in_rule__TimeBound__Group_0_0_1__16366);
            rule__TimeBound__Group_0_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_0_0_1__1"


    // $ANTLR start "rule__TimeBound__Group_0_0_1__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3163:1: rule__TimeBound__Group_0_0_1__1__Impl : ( ( '=' )? ) ;
    public final void rule__TimeBound__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3167:1: ( ( ( '=' )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3168:1: ( ( '=' )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3168:1: ( ( '=' )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3169:1: ( '=' )?
            {
             before(grammarAccess.getTimeBoundAccess().getEqualsSignKeyword_0_0_1_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3170:1: ( '=' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==17) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3171:2: '='
                    {
                    match(input,17,FOLLOW_17_in_rule__TimeBound__Group_0_0_1__1__Impl6395); 

                    }
                    break;

            }

             after(grammarAccess.getTimeBoundAccess().getEqualsSignKeyword_0_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_0_0_1__1__Impl"


    // $ANTLR start "rule__TimeBound__Group_1__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3186:1: rule__TimeBound__Group_1__0 : rule__TimeBound__Group_1__0__Impl rule__TimeBound__Group_1__1 ;
    public final void rule__TimeBound__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3190:1: ( rule__TimeBound__Group_1__0__Impl rule__TimeBound__Group_1__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3191:2: rule__TimeBound__Group_1__0__Impl rule__TimeBound__Group_1__1
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__0__Impl_in_rule__TimeBound__Group_1__06432);
            rule__TimeBound__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_1__1_in_rule__TimeBound__Group_1__06435);
            rule__TimeBound__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_1__0"


    // $ANTLR start "rule__TimeBound__Group_1__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3198:1: rule__TimeBound__Group_1__0__Impl : ( '[' ) ;
    public final void rule__TimeBound__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3202:1: ( ( '[' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3203:1: ( '[' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3203:1: ( '[' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3204:1: '['
            {
             before(grammarAccess.getTimeBoundAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__TimeBound__Group_1__0__Impl6463); 
             after(grammarAccess.getTimeBoundAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_1__0__Impl"


    // $ANTLR start "rule__TimeBound__Group_1__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3217:1: rule__TimeBound__Group_1__1 : rule__TimeBound__Group_1__1__Impl rule__TimeBound__Group_1__2 ;
    public final void rule__TimeBound__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3221:1: ( rule__TimeBound__Group_1__1__Impl rule__TimeBound__Group_1__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3222:2: rule__TimeBound__Group_1__1__Impl rule__TimeBound__Group_1__2
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__1__Impl_in_rule__TimeBound__Group_1__16494);
            rule__TimeBound__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_1__2_in_rule__TimeBound__Group_1__16497);
            rule__TimeBound__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_1__1"


    // $ANTLR start "rule__TimeBound__Group_1__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3229:1: rule__TimeBound__Group_1__1__Impl : ( RULE_DECIMAL ) ;
    public final void rule__TimeBound__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3233:1: ( ( RULE_DECIMAL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3234:1: ( RULE_DECIMAL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3234:1: ( RULE_DECIMAL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3235:1: RULE_DECIMAL
            {
             before(grammarAccess.getTimeBoundAccess().getDECIMALTerminalRuleCall_1_1()); 
            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__TimeBound__Group_1__1__Impl6524); 
             after(grammarAccess.getTimeBoundAccess().getDECIMALTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_1__1__Impl"


    // $ANTLR start "rule__TimeBound__Group_1__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3246:1: rule__TimeBound__Group_1__2 : rule__TimeBound__Group_1__2__Impl rule__TimeBound__Group_1__3 ;
    public final void rule__TimeBound__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3250:1: ( rule__TimeBound__Group_1__2__Impl rule__TimeBound__Group_1__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3251:2: rule__TimeBound__Group_1__2__Impl rule__TimeBound__Group_1__3
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__2__Impl_in_rule__TimeBound__Group_1__26553);
            rule__TimeBound__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_1__3_in_rule__TimeBound__Group_1__26556);
            rule__TimeBound__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_1__2"


    // $ANTLR start "rule__TimeBound__Group_1__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3258:1: rule__TimeBound__Group_1__2__Impl : ( ',' ) ;
    public final void rule__TimeBound__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3262:1: ( ( ',' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3263:1: ( ',' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3263:1: ( ',' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3264:1: ','
            {
             before(grammarAccess.getTimeBoundAccess().getCommaKeyword_1_2()); 
            match(input,35,FOLLOW_35_in_rule__TimeBound__Group_1__2__Impl6584); 
             after(grammarAccess.getTimeBoundAccess().getCommaKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_1__2__Impl"


    // $ANTLR start "rule__TimeBound__Group_1__3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3277:1: rule__TimeBound__Group_1__3 : rule__TimeBound__Group_1__3__Impl rule__TimeBound__Group_1__4 ;
    public final void rule__TimeBound__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3281:1: ( rule__TimeBound__Group_1__3__Impl rule__TimeBound__Group_1__4 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3282:2: rule__TimeBound__Group_1__3__Impl rule__TimeBound__Group_1__4
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__3__Impl_in_rule__TimeBound__Group_1__36615);
            rule__TimeBound__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_1__4_in_rule__TimeBound__Group_1__36618);
            rule__TimeBound__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_1__3"


    // $ANTLR start "rule__TimeBound__Group_1__3__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3289:1: rule__TimeBound__Group_1__3__Impl : ( RULE_DECIMAL ) ;
    public final void rule__TimeBound__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3293:1: ( ( RULE_DECIMAL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3294:1: ( RULE_DECIMAL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3294:1: ( RULE_DECIMAL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3295:1: RULE_DECIMAL
            {
             before(grammarAccess.getTimeBoundAccess().getDECIMALTerminalRuleCall_1_3()); 
            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__TimeBound__Group_1__3__Impl6645); 
             after(grammarAccess.getTimeBoundAccess().getDECIMALTerminalRuleCall_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_1__3__Impl"


    // $ANTLR start "rule__TimeBound__Group_1__4"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3306:1: rule__TimeBound__Group_1__4 : rule__TimeBound__Group_1__4__Impl ;
    public final void rule__TimeBound__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3310:1: ( rule__TimeBound__Group_1__4__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3311:2: rule__TimeBound__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__4__Impl_in_rule__TimeBound__Group_1__46674);
            rule__TimeBound__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_1__4"


    // $ANTLR start "rule__TimeBound__Group_1__4__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3317:1: rule__TimeBound__Group_1__4__Impl : ( ']' ) ;
    public final void rule__TimeBound__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3321:1: ( ( ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3322:1: ( ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3322:1: ( ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3323:1: ']'
            {
             before(grammarAccess.getTimeBoundAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,27,FOLLOW_27_in_rule__TimeBound__Group_1__4__Impl6702); 
             after(grammarAccess.getTimeBoundAccess().getRightSquareBracketKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_1__4__Impl"


    // $ANTLR start "rule__Start__StartAssignment"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3347:1: rule__Start__StartAssignment : ( ruleRules ) ;
    public final void rule__Start__StartAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3351:1: ( ( ruleRules ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3352:1: ( ruleRules )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3352:1: ( ruleRules )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3353:1: ruleRules
            {
             before(grammarAccess.getStartAccess().getStartRulesParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRules_in_rule__Start__StartAssignment6748);
            ruleRules();

            state._fsp--;

             after(grammarAccess.getStartAccess().getStartRulesParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Start__StartAssignment"


    // $ANTLR start "rule__Rules__RuleAssignment_0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3362:1: rule__Rules__RuleAssignment_0 : ( ruleCommentedRule ) ;
    public final void rule__Rules__RuleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3366:1: ( ( ruleCommentedRule ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3367:1: ( ruleCommentedRule )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3367:1: ( ruleCommentedRule )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3368:1: ruleCommentedRule
            {
             before(grammarAccess.getRulesAccess().getRuleCommentedRuleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommentedRule_in_rule__Rules__RuleAssignment_06779);
            ruleCommentedRule();

            state._fsp--;

             after(grammarAccess.getRulesAccess().getRuleCommentedRuleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__RuleAssignment_0"


    // $ANTLR start "rule__Rules__RuleAssignment_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3377:1: rule__Rules__RuleAssignment_1 : ( ruleRules ) ;
    public final void rule__Rules__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3381:1: ( ( ruleRules ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3382:1: ( ruleRules )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3382:1: ( ruleRules )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3383:1: ruleRules
            {
             before(grammarAccess.getRulesAccess().getRuleRulesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRules_in_rule__Rules__RuleAssignment_16810);
            ruleRules();

            state._fsp--;

             after(grammarAccess.getRulesAccess().getRuleRulesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rules__RuleAssignment_1"


    // $ANTLR start "rule__CommentedRule__CommentAssignment_0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3392:1: rule__CommentedRule__CommentAssignment_0 : ( RULE_SL_COMMENT ) ;
    public final void rule__CommentedRule__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3396:1: ( ( RULE_SL_COMMENT ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3397:1: ( RULE_SL_COMMENT )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3397:1: ( RULE_SL_COMMENT )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3398:1: RULE_SL_COMMENT
            {
             before(grammarAccess.getCommentedRuleAccess().getCommentSL_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__CommentedRule__CommentAssignment_06841); 
             after(grammarAccess.getCommentedRuleAccess().getCommentSL_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentedRule__CommentAssignment_0"


    // $ANTLR start "rule__CommentedRule__RuleAssignment_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3407:1: rule__CommentedRule__RuleAssignment_1 : ( rulePctl ) ;
    public final void rule__CommentedRule__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3411:1: ( ( rulePctl ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3412:1: ( rulePctl )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3412:1: ( rulePctl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3413:1: rulePctl
            {
             before(grammarAccess.getCommentedRuleAccess().getRulePctlParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePctl_in_rule__CommentedRule__RuleAssignment_16872);
            rulePctl();

            state._fsp--;

             after(grammarAccess.getCommentedRuleAccess().getRulePctlParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommentedRule__RuleAssignment_1"


    // $ANTLR start "rule__State__NameAssignment_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3422:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3426:1: ( ( RULE_ID ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3427:1: ( RULE_ID )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3427:1: ( RULE_ID )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3428:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_16903); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__Label__NameAssignment_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3437:1: rule__Label__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Label__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3441:1: ( ( RULE_ID ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3442:1: ( RULE_ID )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3442:1: ( RULE_ID )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3443:1: RULE_ID
            {
             before(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Label__NameAssignment_16934); 
             after(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__NameAssignment_1"


    // $ANTLR start "rule__Conjunction__RightAssignment_2_2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3452:1: rule__Conjunction__RightAssignment_2_2 : ( ruleStateFormula ) ;
    public final void rule__Conjunction__RightAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3456:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3457:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3457:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3458:1: ruleStateFormula
            {
             before(grammarAccess.getConjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Conjunction__RightAssignment_2_26965);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getConjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__RightAssignment_2_2"


    // $ANTLR start "rule__Disjunction__RightAssignment_2_2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3467:1: rule__Disjunction__RightAssignment_2_2 : ( ruleStateFormula ) ;
    public final void rule__Disjunction__RightAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3471:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3472:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3472:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3473:1: ruleStateFormula
            {
             before(grammarAccess.getDisjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Disjunction__RightAssignment_2_26996);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getDisjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__RightAssignment_2_2"


    // $ANTLR start "rule__StateFormula__LeftAssignment_0_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3482:1: rule__StateFormula__LeftAssignment_0_1 : ( ruleStateFormula ) ;
    public final void rule__StateFormula__LeftAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3486:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3487:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3487:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3488:1: ruleStateFormula
            {
             before(grammarAccess.getStateFormulaAccess().getLeftStateFormulaParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__StateFormula__LeftAssignment_0_17027);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getStateFormulaAccess().getLeftStateFormulaParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFormula__LeftAssignment_0_1"


    // $ANTLR start "rule__StateFormula__RightAssignment_0_2_0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3497:1: rule__StateFormula__RightAssignment_0_2_0 : ( ruleJunction ) ;
    public final void rule__StateFormula__RightAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3501:1: ( ( ruleJunction ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3502:1: ( ruleJunction )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3502:1: ( ruleJunction )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3503:1: ruleJunction
            {
             before(grammarAccess.getStateFormulaAccess().getRightJunctionParserRuleCall_0_2_0_0()); 
            pushFollow(FOLLOW_ruleJunction_in_rule__StateFormula__RightAssignment_0_2_07058);
            ruleJunction();

            state._fsp--;

             after(grammarAccess.getStateFormulaAccess().getRightJunctionParserRuleCall_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFormula__RightAssignment_0_2_0"


    // $ANTLR start "rule__StateFormula__RightAssignment_0_2_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3512:1: rule__StateFormula__RightAssignment_0_2_1 : ( ruleImplication ) ;
    public final void rule__StateFormula__RightAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3516:1: ( ( ruleImplication ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3517:1: ( ruleImplication )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3517:1: ( ruleImplication )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3518:1: ruleImplication
            {
             before(grammarAccess.getStateFormulaAccess().getRightImplicationParserRuleCall_0_2_1_0()); 
            pushFollow(FOLLOW_ruleImplication_in_rule__StateFormula__RightAssignment_0_2_17089);
            ruleImplication();

            state._fsp--;

             after(grammarAccess.getStateFormulaAccess().getRightImplicationParserRuleCall_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFormula__RightAssignment_0_2_1"


    // $ANTLR start "rule__StateFormula__LeftAssignment_3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3527:1: rule__StateFormula__LeftAssignment_3 : ( ruleProbability ) ;
    public final void rule__StateFormula__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3531:1: ( ( ruleProbability ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3532:1: ( ruleProbability )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3532:1: ( ruleProbability )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3533:1: ruleProbability
            {
             before(grammarAccess.getStateFormulaAccess().getLeftProbabilityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProbability_in_rule__StateFormula__LeftAssignment_37120);
            ruleProbability();

            state._fsp--;

             after(grammarAccess.getStateFormulaAccess().getLeftProbabilityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateFormula__LeftAssignment_3"


    // $ANTLR start "rule__Until__LeftAssignment_0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3542:1: rule__Until__LeftAssignment_0 : ( ruleStateFormula ) ;
    public final void rule__Until__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3546:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3547:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3547:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3548:1: ruleStateFormula
            {
             before(grammarAccess.getUntilAccess().getLeftStateFormulaParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Until__LeftAssignment_07151);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getUntilAccess().getLeftStateFormulaParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Until__LeftAssignment_0"


    // $ANTLR start "rule__Until__RightAssignment_3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3557:1: rule__Until__RightAssignment_3 : ( ruleStateFormula ) ;
    public final void rule__Until__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3561:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3562:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3562:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3563:1: ruleStateFormula
            {
             before(grammarAccess.getUntilAccess().getRightStateFormulaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Until__RightAssignment_37182);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getUntilAccess().getRightStateFormulaParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Until__RightAssignment_3"


    // $ANTLR start "rule__Next__RightAssignment_2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3572:1: rule__Next__RightAssignment_2 : ( ruleStateFormula ) ;
    public final void rule__Next__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3576:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3577:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3577:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3578:1: ruleStateFormula
            {
             before(grammarAccess.getNextAccess().getRightStateFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Next__RightAssignment_27213);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getNextAccess().getRightStateFormulaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Next__RightAssignment_2"


    // $ANTLR start "rule__Future__RightAssignment_2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3587:1: rule__Future__RightAssignment_2 : ( ruleStateFormula ) ;
    public final void rule__Future__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3591:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3592:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3592:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3593:1: ruleStateFormula
            {
             before(grammarAccess.getFutureAccess().getRightStateFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Future__RightAssignment_27244);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getFutureAccess().getRightStateFormulaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Future__RightAssignment_2"


    // $ANTLR start "rule__Globally__RightAssignment_2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3602:1: rule__Globally__RightAssignment_2 : ( ruleStateFormula ) ;
    public final void rule__Globally__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3606:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3607:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3607:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3608:1: ruleStateFormula
            {
             before(grammarAccess.getGloballyAccess().getRightStateFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Globally__RightAssignment_27275);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getGloballyAccess().getRightStateFormulaParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Globally__RightAssignment_2"


    // $ANTLR start "rule__Implication__RightAssignment_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3617:1: rule__Implication__RightAssignment_1 : ( ruleStateFormula ) ;
    public final void rule__Implication__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3621:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3622:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3622:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3623:1: ruleStateFormula
            {
             before(grammarAccess.getImplicationAccess().getRightStateFormulaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Implication__RightAssignment_17306);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getImplicationAccess().getRightStateFormulaParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__RightAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleStart_in_entryRuleStart61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStart68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Start__StartAssignment_in_ruleStart94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRules_in_entryRuleRules122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRules129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group__0_in_ruleRules155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentedRule_in_entryRuleCommentedRule182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentedRule189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommentedRule__Group__0_in_ruleCommentedRule215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePctl_in_entryRulePctl242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePctl249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pctl__Alternatives_in_rulePctl275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0_in_ruleLabel395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__0_in_ruleNegation515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJunction_in_entryRuleJunction542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJunction549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Junction__Alternatives_in_ruleJunction575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__0_in_ruleConjunction635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__0_in_ruleDisjunction695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_entryRuleStateFormula722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateFormula729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Alternatives_in_ruleStateFormula755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathFormula_in_entryRulePathFormula782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathFormula789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathFormula__Alternatives_in_rulePathFormula815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSteadyState_in_entryRuleSteadyState842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSteadyState849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__0_in_ruleSteadyState875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedProbability_in_entryRuleQuantifiedProbability902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifiedProbability909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__0_in_ruleQuantifiedProbability935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbability_in_entryRuleProbability962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProbability969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__0_in_ruleProbability995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUntil_in_entryRuleUntil1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUntil1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Group__0_in_ruleUntil1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNext_in_entryRuleNext1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNext1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__Group__0_in_ruleNext1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuture_in_entryRuleFuture1142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuture1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__Group__0_in_ruleFuture1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobally_in_entryRuleGlobally1202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobally1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__Group__0_in_ruleGlobally1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication1262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group__0_in_ruleImplication1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_entryRuleCompareProbability1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareProbability1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group__0_in_ruleCompareProbability1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_entryRuleTimeBound1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeBound1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Alternatives_in_ruleTimeBound1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Pctl__Alternatives1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSteadyState_in_rule__Pctl__Alternatives1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedProbability_in_rule__Pctl__Alternatives1485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Atomic__Alternatives1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__Atomic__Alternatives1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__Atomic__Alternatives1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Junction__Alternatives1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_rule__Junction__Alternatives1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__0_in_rule__StateFormula__Alternatives1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_rule__StateFormula__Alternatives1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__StateFormula__Alternatives1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__LeftAssignment_3_in_rule__StateFormula__Alternatives1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__RightAssignment_0_2_0_in_rule__StateFormula__Alternatives_0_21717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__RightAssignment_0_2_1_in_rule__StateFormula__Alternatives_0_21735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNext_in_rule__PathFormula__Alternatives1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUntil_in_rule__PathFormula__Alternatives1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuture_in_rule__PathFormula__Alternatives1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobally_in_rule__PathFormula__Alternatives1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_rule__SteadyState__Alternatives_11851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SteadyState__Alternatives_11869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Until__Alternatives_11904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Until__Alternatives_11924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Until__Alternatives_11944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group_0_0__0_in_rule__CompareProbability__Alternatives_01978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group_0_1__0_in_rule__CompareProbability__Alternatives_01996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0__0_in_rule__TimeBound__Alternatives2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__0_in_rule__TimeBound__Alternatives2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0_0_0__0_in_rule__TimeBound__Alternatives_0_02080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0_0_1__0_in_rule__TimeBound__Alternatives_0_02098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TimeBound__Alternatives_0_02117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group__0__Impl_in_rule__Rules__Group__02149 = new BitSet(new long[]{0x00000000129C0050L});
    public static final BitSet FOLLOW_rule__Rules__Group__1_in_rule__Rules__Group__02152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__RuleAssignment_0_in_rule__Rules__Group__0__Impl2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__Group__1__Impl_in_rule__Rules__Group__12209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rules__RuleAssignment_1_in_rule__Rules__Group__1__Impl2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommentedRule__Group__0__Impl_in_rule__CommentedRule__Group__02271 = new BitSet(new long[]{0x00000000129C0050L});
    public static final BitSet FOLLOW_rule__CommentedRule__Group__1_in_rule__CommentedRule__Group__02274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommentedRule__CommentAssignment_0_in_rule__CommentedRule__Group__0__Impl2301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommentedRule__Group__1__Impl_in_rule__CommentedRule__Group__12332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommentedRule__RuleAssignment_1_in_rule__CommentedRule__Group__1__Impl2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__02393 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__02396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__State__Group__0__Impl2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__12455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__02516 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Label__Group__1_in_rule__Label__Group__02519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Label__Group__0__Impl2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__12578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__NameAssignment_1_in_rule__Label__Group__1__Impl2605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__0__Impl_in_rule__Negation__Group__02639 = new BitSet(new long[]{0x00000000109C0010L});
    public static final BitSet FOLLOW_rule__Negation__Group__1_in_rule__Negation__Group__02642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Negation__Group__0__Impl2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__1__Impl_in_rule__Negation__Group__12701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Negation__Group__1__Impl2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__02761 = new BitSet(new long[]{0x00000000109C0010L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__02764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Conjunction__Group__0__Impl2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__12823 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__2_in_rule__Conjunction__Group__12826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Conjunction__Group__1__Impl2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__2__Impl_in_rule__Conjunction__Group__22882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__0_in_rule__Conjunction__Group__2__Impl2909 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__0__Impl_in_rule__Conjunction__Group_2__02946 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__1_in_rule__Conjunction__Group_2__02949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__1__Impl_in_rule__Conjunction__Group_2__13007 = new BitSet(new long[]{0x00000000109C0010L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__2_in_rule__Conjunction__Group_2__13010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Conjunction__Group_2__1__Impl3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__2__Impl_in_rule__Conjunction__Group_2__23069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__RightAssignment_2_2_in_rule__Conjunction__Group_2__2__Impl3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__0__Impl_in_rule__Disjunction__Group__03132 = new BitSet(new long[]{0x00000000109C0010L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__1_in_rule__Disjunction__Group__03135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Disjunction__Group__0__Impl3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__1__Impl_in_rule__Disjunction__Group__13194 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__2_in_rule__Disjunction__Group__13197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Disjunction__Group__1__Impl3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__2__Impl_in_rule__Disjunction__Group__23253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__0_in_rule__Disjunction__Group__2__Impl3280 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__0__Impl_in_rule__Disjunction__Group_2__03317 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__1_in_rule__Disjunction__Group_2__03320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__1__Impl_in_rule__Disjunction__Group_2__13378 = new BitSet(new long[]{0x00000000109C0010L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__2_in_rule__Disjunction__Group_2__13381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Disjunction__Group_2__1__Impl3409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__2__Impl_in_rule__Disjunction__Group_2__23440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__RightAssignment_2_2_in_rule__Disjunction__Group_2__2__Impl3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__0__Impl_in_rule__StateFormula__Group_0__03503 = new BitSet(new long[]{0x00000000109C0010L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__1_in_rule__StateFormula__Group_0__03506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__StateFormula__Group_0__0__Impl3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__1__Impl_in_rule__StateFormula__Group_0__13565 = new BitSet(new long[]{0x0000000101600000L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__2_in_rule__StateFormula__Group_0__13568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__LeftAssignment_0_1_in_rule__StateFormula__Group_0__1__Impl3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__2__Impl_in_rule__StateFormula__Group_0__23625 = new BitSet(new long[]{0x0000000101600000L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__3_in_rule__StateFormula__Group_0__23628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Alternatives_0_2_in_rule__StateFormula__Group_0__2__Impl3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__3__Impl_in_rule__StateFormula__Group_0__33686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__StateFormula__Group_0__3__Impl3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__0__Impl_in_rule__SteadyState__Group__03753 = new BitSet(new long[]{0x0000000600002000L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__1_in_rule__SteadyState__Group__03756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SteadyState__Group__0__Impl3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__1__Impl_in_rule__SteadyState__Group__13815 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__2_in_rule__SteadyState__Group__13818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Alternatives_1_in_rule__SteadyState__Group__1__Impl3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__2__Impl_in_rule__SteadyState__Group__23875 = new BitSet(new long[]{0x00000000109C0010L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__3_in_rule__SteadyState__Group__23878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SteadyState__Group__2__Impl3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__3__Impl_in_rule__SteadyState__Group__33937 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__4_in_rule__SteadyState__Group__33940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__SteadyState__Group__3__Impl3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__4__Impl_in_rule__SteadyState__Group__43996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SteadyState__Group__4__Impl4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__0__Impl_in_rule__QuantifiedProbability__Group__04065 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__1_in_rule__QuantifiedProbability__Group__04068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group_0__0_in_rule__QuantifiedProbability__Group__0__Impl4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__1__Impl_in_rule__QuantifiedProbability__Group__14125 = new BitSet(new long[]{0x00000000F09C0010L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__2_in_rule__QuantifiedProbability__Group__14128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__QuantifiedProbability__Group__1__Impl4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__2__Impl_in_rule__QuantifiedProbability__Group__24187 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__3_in_rule__QuantifiedProbability__Group__24190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathFormula_in_rule__QuantifiedProbability__Group__2__Impl4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__3__Impl_in_rule__QuantifiedProbability__Group__34246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__QuantifiedProbability__Group__3__Impl4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group_0__0__Impl_in_rule__QuantifiedProbability__Group_0__04313 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group_0__1_in_rule__QuantifiedProbability__Group_0__04316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__QuantifiedProbability__Group_0__0__Impl4344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group_0__1__Impl_in_rule__QuantifiedProbability__Group_0__14375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__QuantifiedProbability__Group_0__1__Impl4403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__0__Impl_in_rule__Probability__Group__04438 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__Probability__Group__1_in_rule__Probability__Group__04441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Probability__Group__0__Impl4469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__1__Impl_in_rule__Probability__Group__14500 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Probability__Group__2_in_rule__Probability__Group__14503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_rule__Probability__Group__1__Impl4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__2__Impl_in_rule__Probability__Group__24559 = new BitSet(new long[]{0x00000000F09C0010L});
    public static final BitSet FOLLOW_rule__Probability__Group__3_in_rule__Probability__Group__24562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Probability__Group__2__Impl4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__3__Impl_in_rule__Probability__Group__34621 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Probability__Group__4_in_rule__Probability__Group__34624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathFormula_in_rule__Probability__Group__3__Impl4651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__4__Impl_in_rule__Probability__Group__44680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Probability__Group__4__Impl4708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Group__0__Impl_in_rule__Until__Group__04749 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_rule__Until__Group__1_in_rule__Until__Group__04752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__LeftAssignment_0_in_rule__Until__Group__0__Impl4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Group__1__Impl_in_rule__Until__Group__14809 = new BitSet(new long[]{0x00000006149E0010L});
    public static final BitSet FOLLOW_rule__Until__Group__2_in_rule__Until__Group__14812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Alternatives_1_in_rule__Until__Group__1__Impl4839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Group__2__Impl_in_rule__Until__Group__24869 = new BitSet(new long[]{0x00000006149E0010L});
    public static final BitSet FOLLOW_rule__Until__Group__3_in_rule__Until__Group__24872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_rule__Until__Group__2__Impl4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Group__3__Impl_in_rule__Until__Group__34931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__RightAssignment_3_in_rule__Until__Group__3__Impl4958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__Group__0__Impl_in_rule__Next__Group__04996 = new BitSet(new long[]{0x00000006149E0010L});
    public static final BitSet FOLLOW_rule__Next__Group__1_in_rule__Next__Group__04999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Next__Group__0__Impl5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__Group__1__Impl_in_rule__Next__Group__15058 = new BitSet(new long[]{0x00000006149E0010L});
    public static final BitSet FOLLOW_rule__Next__Group__2_in_rule__Next__Group__15061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_rule__Next__Group__1__Impl5089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__Group__2__Impl_in_rule__Next__Group__25120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__RightAssignment_2_in_rule__Next__Group__2__Impl5147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__Group__0__Impl_in_rule__Future__Group__05183 = new BitSet(new long[]{0x00000006149E0010L});
    public static final BitSet FOLLOW_rule__Future__Group__1_in_rule__Future__Group__05186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Future__Group__0__Impl5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__Group__1__Impl_in_rule__Future__Group__15245 = new BitSet(new long[]{0x00000006149E0010L});
    public static final BitSet FOLLOW_rule__Future__Group__2_in_rule__Future__Group__15248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_rule__Future__Group__1__Impl5276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__Group__2__Impl_in_rule__Future__Group__25307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__RightAssignment_2_in_rule__Future__Group__2__Impl5334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__Group__0__Impl_in_rule__Globally__Group__05370 = new BitSet(new long[]{0x00000006149E0010L});
    public static final BitSet FOLLOW_rule__Globally__Group__1_in_rule__Globally__Group__05373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Globally__Group__0__Impl5401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__Group__1__Impl_in_rule__Globally__Group__15432 = new BitSet(new long[]{0x00000006149E0010L});
    public static final BitSet FOLLOW_rule__Globally__Group__2_in_rule__Globally__Group__15435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_rule__Globally__Group__1__Impl5463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__Group__2__Impl_in_rule__Globally__Group__25494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__RightAssignment_2_in_rule__Globally__Group__2__Impl5521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group__0__Impl_in_rule__Implication__Group__05557 = new BitSet(new long[]{0x00000000109C0010L});
    public static final BitSet FOLLOW_rule__Implication__Group__1_in_rule__Implication__Group__05560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Implication__Group__0__Impl5588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group__1__Impl_in_rule__Implication__Group__15619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__RightAssignment_1_in_rule__Implication__Group__1__Impl5646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group__0__Impl_in_rule__CompareProbability__Group__05680 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group__1_in_rule__CompareProbability__Group__05683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Alternatives_0_in_rule__CompareProbability__Group__0__Impl5710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group__1__Impl_in_rule__CompareProbability__Group__15740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__CompareProbability__Group__1__Impl5767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group_0_0__0__Impl_in_rule__CompareProbability__Group_0_0__05800 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group_0_0__1_in_rule__CompareProbability__Group_0_0__05803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CompareProbability__Group_0_0__0__Impl5831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group_0_0__1__Impl_in_rule__CompareProbability__Group_0_0__15862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CompareProbability__Group_0_0__1__Impl5891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group_0_1__0__Impl_in_rule__CompareProbability__Group_0_1__05928 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group_0_1__1_in_rule__CompareProbability__Group_0_1__05931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CompareProbability__Group_0_1__0__Impl5959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group_0_1__1__Impl_in_rule__CompareProbability__Group_0_1__15990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CompareProbability__Group_0_1__1__Impl6019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0__0__Impl_in_rule__TimeBound__Group_0__06056 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0__1_in_rule__TimeBound__Group_0__06059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Alternatives_0_0_in_rule__TimeBound__Group_0__0__Impl6086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0__1__Impl_in_rule__TimeBound__Group_0__16116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__TimeBound__Group_0__1__Impl6143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0_0_0__0__Impl_in_rule__TimeBound__Group_0_0_0__06176 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0_0_0__1_in_rule__TimeBound__Group_0_0_0__06179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TimeBound__Group_0_0_0__0__Impl6207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0_0_0__1__Impl_in_rule__TimeBound__Group_0_0_0__16238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TimeBound__Group_0_0_0__1__Impl6267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0_0_1__0__Impl_in_rule__TimeBound__Group_0_0_1__06304 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0_0_1__1_in_rule__TimeBound__Group_0_0_1__06307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TimeBound__Group_0_0_1__0__Impl6335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0_0_1__1__Impl_in_rule__TimeBound__Group_0_0_1__16366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TimeBound__Group_0_0_1__1__Impl6395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__0__Impl_in_rule__TimeBound__Group_1__06432 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__1_in_rule__TimeBound__Group_1__06435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TimeBound__Group_1__0__Impl6463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__1__Impl_in_rule__TimeBound__Group_1__16494 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__2_in_rule__TimeBound__Group_1__16497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__TimeBound__Group_1__1__Impl6524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__2__Impl_in_rule__TimeBound__Group_1__26553 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__3_in_rule__TimeBound__Group_1__26556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__TimeBound__Group_1__2__Impl6584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__3__Impl_in_rule__TimeBound__Group_1__36615 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__4_in_rule__TimeBound__Group_1__36618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__TimeBound__Group_1__3__Impl6645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__4__Impl_in_rule__TimeBound__Group_1__46674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TimeBound__Group_1__4__Impl6702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRules_in_rule__Start__StartAssignment6748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentedRule_in_rule__Rules__RuleAssignment_06779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRules_in_rule__Rules__RuleAssignment_16810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__CommentedRule__CommentAssignment_06841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePctl_in_rule__CommentedRule__RuleAssignment_16872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_16903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Label__NameAssignment_16934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Conjunction__RightAssignment_2_26965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Disjunction__RightAssignment_2_26996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__StateFormula__LeftAssignment_0_17027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJunction_in_rule__StateFormula__RightAssignment_0_2_07058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_rule__StateFormula__RightAssignment_0_2_17089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbability_in_rule__StateFormula__LeftAssignment_37120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Until__LeftAssignment_07151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Until__RightAssignment_37182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Next__RightAssignment_27213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Future__RightAssignment_27244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Globally__RightAssignment_27275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Implication__RightAssignment_17306 = new BitSet(new long[]{0x0000000000000002L});

}