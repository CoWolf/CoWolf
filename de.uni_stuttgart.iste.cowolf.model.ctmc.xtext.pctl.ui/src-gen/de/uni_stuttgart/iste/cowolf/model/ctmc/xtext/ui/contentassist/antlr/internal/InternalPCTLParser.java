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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:69:1: ruleStart : ( ( rule__Start__Group__0 ) ) ;
    public final void ruleStart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:73:2: ( ( ( rule__Start__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:74:1: ( ( rule__Start__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:74:1: ( ( rule__Start__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:75:1: ( rule__Start__Group__0 )
            {
             before(grammarAccess.getStartAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:76:1: ( rule__Start__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:76:2: rule__Start__Group__0
            {
            pushFollow(FOLLOW_rule__Start__Group__0_in_ruleStart94);
            rule__Start__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartAccess().getGroup()); 

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


    // $ANTLR start "entryRuleCommentedRule"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:88:1: entryRuleCommentedRule : ruleCommentedRule EOF ;
    public final void entryRuleCommentedRule() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:89:1: ( ruleCommentedRule EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:90:1: ruleCommentedRule EOF
            {
             before(grammarAccess.getCommentedRuleRule()); 
            pushFollow(FOLLOW_ruleCommentedRule_in_entryRuleCommentedRule121);
            ruleCommentedRule();

            state._fsp--;

             after(grammarAccess.getCommentedRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentedRule128); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:97:1: ruleCommentedRule : ( ( rule__CommentedRule__Group__0 ) ) ;
    public final void ruleCommentedRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:101:2: ( ( ( rule__CommentedRule__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:102:1: ( ( rule__CommentedRule__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:102:1: ( ( rule__CommentedRule__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:103:1: ( rule__CommentedRule__Group__0 )
            {
             before(grammarAccess.getCommentedRuleAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:104:1: ( rule__CommentedRule__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:104:2: rule__CommentedRule__Group__0
            {
            pushFollow(FOLLOW_rule__CommentedRule__Group__0_in_ruleCommentedRule154);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:116:1: entryRulePctl : rulePctl EOF ;
    public final void entryRulePctl() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:117:1: ( rulePctl EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:118:1: rulePctl EOF
            {
             before(grammarAccess.getPctlRule()); 
            pushFollow(FOLLOW_rulePctl_in_entryRulePctl181);
            rulePctl();

            state._fsp--;

             after(grammarAccess.getPctlRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePctl188); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:125:1: rulePctl : ( ( rule__Pctl__Alternatives ) ) ;
    public final void rulePctl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:129:2: ( ( ( rule__Pctl__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:130:1: ( ( rule__Pctl__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:130:1: ( ( rule__Pctl__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:131:1: ( rule__Pctl__Alternatives )
            {
             before(grammarAccess.getPctlAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:132:1: ( rule__Pctl__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:132:2: rule__Pctl__Alternatives
            {
            pushFollow(FOLLOW_rule__Pctl__Alternatives_in_rulePctl214);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:144:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:145:1: ( ruleState EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:146:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState241);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState248); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:153:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:157:2: ( ( ( rule__State__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:158:1: ( ( rule__State__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:158:1: ( ( rule__State__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:159:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:160:1: ( rule__State__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:160:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState274);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:172:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:173:1: ( ruleLabel EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:174:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel301);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel308); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:181:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:185:2: ( ( ( rule__Label__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:186:1: ( ( rule__Label__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:186:1: ( ( rule__Label__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:187:1: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:188:1: ( rule__Label__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:188:2: rule__Label__Group__0
            {
            pushFollow(FOLLOW_rule__Label__Group__0_in_ruleLabel334);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:200:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:201:1: ( ruleAtomic EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:202:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic361);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic368); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:209:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:213:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:214:1: ( ( rule__Atomic__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:214:1: ( ( rule__Atomic__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:215:1: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:216:1: ( rule__Atomic__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:216:2: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic394);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:228:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:229:1: ( ruleNegation EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:230:1: ruleNegation EOF
            {
             before(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation421);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getNegationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation428); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:237:1: ruleNegation : ( ( rule__Negation__Group__0 ) ) ;
    public final void ruleNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:241:2: ( ( ( rule__Negation__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:242:1: ( ( rule__Negation__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:242:1: ( ( rule__Negation__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:243:1: ( rule__Negation__Group__0 )
            {
             before(grammarAccess.getNegationAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:244:1: ( rule__Negation__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:244:2: rule__Negation__Group__0
            {
            pushFollow(FOLLOW_rule__Negation__Group__0_in_ruleNegation454);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:256:1: entryRuleJunction : ruleJunction EOF ;
    public final void entryRuleJunction() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:257:1: ( ruleJunction EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:258:1: ruleJunction EOF
            {
             before(grammarAccess.getJunctionRule()); 
            pushFollow(FOLLOW_ruleJunction_in_entryRuleJunction481);
            ruleJunction();

            state._fsp--;

             after(grammarAccess.getJunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJunction488); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:265:1: ruleJunction : ( ( rule__Junction__Alternatives ) ) ;
    public final void ruleJunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:269:2: ( ( ( rule__Junction__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:270:1: ( ( rule__Junction__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:270:1: ( ( rule__Junction__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:271:1: ( rule__Junction__Alternatives )
            {
             before(grammarAccess.getJunctionAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:272:1: ( rule__Junction__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:272:2: rule__Junction__Alternatives
            {
            pushFollow(FOLLOW_rule__Junction__Alternatives_in_ruleJunction514);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:284:1: entryRuleConjunction : ruleConjunction EOF ;
    public final void entryRuleConjunction() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:285:1: ( ruleConjunction EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:286:1: ruleConjunction EOF
            {
             before(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction541);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getConjunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction548); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:293:1: ruleConjunction : ( ( rule__Conjunction__Group__0 ) ) ;
    public final void ruleConjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:297:2: ( ( ( rule__Conjunction__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:298:1: ( ( rule__Conjunction__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:298:1: ( ( rule__Conjunction__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:299:1: ( rule__Conjunction__Group__0 )
            {
             before(grammarAccess.getConjunctionAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:300:1: ( rule__Conjunction__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:300:2: rule__Conjunction__Group__0
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__0_in_ruleConjunction574);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:312:1: entryRuleDisjunction : ruleDisjunction EOF ;
    public final void entryRuleDisjunction() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:313:1: ( ruleDisjunction EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:314:1: ruleDisjunction EOF
            {
             before(grammarAccess.getDisjunctionRule()); 
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction601);
            ruleDisjunction();

            state._fsp--;

             after(grammarAccess.getDisjunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction608); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:321:1: ruleDisjunction : ( ( rule__Disjunction__Group__0 ) ) ;
    public final void ruleDisjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:325:2: ( ( ( rule__Disjunction__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:326:1: ( ( rule__Disjunction__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:326:1: ( ( rule__Disjunction__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:327:1: ( rule__Disjunction__Group__0 )
            {
             before(grammarAccess.getDisjunctionAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:328:1: ( rule__Disjunction__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:328:2: rule__Disjunction__Group__0
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__0_in_ruleDisjunction634);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:340:1: entryRuleStateFormula : ruleStateFormula EOF ;
    public final void entryRuleStateFormula() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:341:1: ( ruleStateFormula EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:342:1: ruleStateFormula EOF
            {
             before(grammarAccess.getStateFormulaRule()); 
            pushFollow(FOLLOW_ruleStateFormula_in_entryRuleStateFormula661);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getStateFormulaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateFormula668); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:349:1: ruleStateFormula : ( ( rule__StateFormula__Alternatives ) ) ;
    public final void ruleStateFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:353:2: ( ( ( rule__StateFormula__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:354:1: ( ( rule__StateFormula__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:354:1: ( ( rule__StateFormula__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:355:1: ( rule__StateFormula__Alternatives )
            {
             before(grammarAccess.getStateFormulaAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:356:1: ( rule__StateFormula__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:356:2: rule__StateFormula__Alternatives
            {
            pushFollow(FOLLOW_rule__StateFormula__Alternatives_in_ruleStateFormula694);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:368:1: entryRulePathFormula : rulePathFormula EOF ;
    public final void entryRulePathFormula() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:369:1: ( rulePathFormula EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:370:1: rulePathFormula EOF
            {
             before(grammarAccess.getPathFormulaRule()); 
            pushFollow(FOLLOW_rulePathFormula_in_entryRulePathFormula721);
            rulePathFormula();

            state._fsp--;

             after(grammarAccess.getPathFormulaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathFormula728); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:377:1: rulePathFormula : ( ( rule__PathFormula__Alternatives ) ) ;
    public final void rulePathFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:381:2: ( ( ( rule__PathFormula__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:382:1: ( ( rule__PathFormula__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:382:1: ( ( rule__PathFormula__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:383:1: ( rule__PathFormula__Alternatives )
            {
             before(grammarAccess.getPathFormulaAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:384:1: ( rule__PathFormula__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:384:2: rule__PathFormula__Alternatives
            {
            pushFollow(FOLLOW_rule__PathFormula__Alternatives_in_rulePathFormula754);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:396:1: entryRuleSteadyState : ruleSteadyState EOF ;
    public final void entryRuleSteadyState() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:397:1: ( ruleSteadyState EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:398:1: ruleSteadyState EOF
            {
             before(grammarAccess.getSteadyStateRule()); 
            pushFollow(FOLLOW_ruleSteadyState_in_entryRuleSteadyState781);
            ruleSteadyState();

            state._fsp--;

             after(grammarAccess.getSteadyStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSteadyState788); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:405:1: ruleSteadyState : ( ( rule__SteadyState__Group__0 ) ) ;
    public final void ruleSteadyState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:409:2: ( ( ( rule__SteadyState__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:410:1: ( ( rule__SteadyState__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:410:1: ( ( rule__SteadyState__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:411:1: ( rule__SteadyState__Group__0 )
            {
             before(grammarAccess.getSteadyStateAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:412:1: ( rule__SteadyState__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:412:2: rule__SteadyState__Group__0
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__0_in_ruleSteadyState814);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:424:1: entryRuleQuantifiedProbability : ruleQuantifiedProbability EOF ;
    public final void entryRuleQuantifiedProbability() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:425:1: ( ruleQuantifiedProbability EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:426:1: ruleQuantifiedProbability EOF
            {
             before(grammarAccess.getQuantifiedProbabilityRule()); 
            pushFollow(FOLLOW_ruleQuantifiedProbability_in_entryRuleQuantifiedProbability841);
            ruleQuantifiedProbability();

            state._fsp--;

             after(grammarAccess.getQuantifiedProbabilityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifiedProbability848); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:433:1: ruleQuantifiedProbability : ( ( rule__QuantifiedProbability__Group__0 ) ) ;
    public final void ruleQuantifiedProbability() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:437:2: ( ( ( rule__QuantifiedProbability__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:438:1: ( ( rule__QuantifiedProbability__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:438:1: ( ( rule__QuantifiedProbability__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:439:1: ( rule__QuantifiedProbability__Group__0 )
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:440:1: ( rule__QuantifiedProbability__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:440:2: rule__QuantifiedProbability__Group__0
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__0_in_ruleQuantifiedProbability874);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:452:1: entryRuleProbability : ruleProbability EOF ;
    public final void entryRuleProbability() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:453:1: ( ruleProbability EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:454:1: ruleProbability EOF
            {
             before(grammarAccess.getProbabilityRule()); 
            pushFollow(FOLLOW_ruleProbability_in_entryRuleProbability901);
            ruleProbability();

            state._fsp--;

             after(grammarAccess.getProbabilityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProbability908); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:461:1: ruleProbability : ( ( rule__Probability__Group__0 ) ) ;
    public final void ruleProbability() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:465:2: ( ( ( rule__Probability__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:466:1: ( ( rule__Probability__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:466:1: ( ( rule__Probability__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:467:1: ( rule__Probability__Group__0 )
            {
             before(grammarAccess.getProbabilityAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:468:1: ( rule__Probability__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:468:2: rule__Probability__Group__0
            {
            pushFollow(FOLLOW_rule__Probability__Group__0_in_ruleProbability934);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:480:1: entryRuleUntil : ruleUntil EOF ;
    public final void entryRuleUntil() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:481:1: ( ruleUntil EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:482:1: ruleUntil EOF
            {
             before(grammarAccess.getUntilRule()); 
            pushFollow(FOLLOW_ruleUntil_in_entryRuleUntil961);
            ruleUntil();

            state._fsp--;

             after(grammarAccess.getUntilRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUntil968); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:489:1: ruleUntil : ( ( rule__Until__Group__0 ) ) ;
    public final void ruleUntil() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:493:2: ( ( ( rule__Until__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:494:1: ( ( rule__Until__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:494:1: ( ( rule__Until__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:495:1: ( rule__Until__Group__0 )
            {
             before(grammarAccess.getUntilAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:496:1: ( rule__Until__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:496:2: rule__Until__Group__0
            {
            pushFollow(FOLLOW_rule__Until__Group__0_in_ruleUntil994);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:508:1: entryRuleNext : ruleNext EOF ;
    public final void entryRuleNext() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:509:1: ( ruleNext EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:510:1: ruleNext EOF
            {
             before(grammarAccess.getNextRule()); 
            pushFollow(FOLLOW_ruleNext_in_entryRuleNext1021);
            ruleNext();

            state._fsp--;

             after(grammarAccess.getNextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNext1028); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:517:1: ruleNext : ( ( rule__Next__Group__0 ) ) ;
    public final void ruleNext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:521:2: ( ( ( rule__Next__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:522:1: ( ( rule__Next__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:522:1: ( ( rule__Next__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:523:1: ( rule__Next__Group__0 )
            {
             before(grammarAccess.getNextAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:524:1: ( rule__Next__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:524:2: rule__Next__Group__0
            {
            pushFollow(FOLLOW_rule__Next__Group__0_in_ruleNext1054);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:536:1: entryRuleFuture : ruleFuture EOF ;
    public final void entryRuleFuture() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:537:1: ( ruleFuture EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:538:1: ruleFuture EOF
            {
             before(grammarAccess.getFutureRule()); 
            pushFollow(FOLLOW_ruleFuture_in_entryRuleFuture1081);
            ruleFuture();

            state._fsp--;

             after(grammarAccess.getFutureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuture1088); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:545:1: ruleFuture : ( ( rule__Future__Group__0 ) ) ;
    public final void ruleFuture() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:549:2: ( ( ( rule__Future__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:550:1: ( ( rule__Future__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:550:1: ( ( rule__Future__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:551:1: ( rule__Future__Group__0 )
            {
             before(grammarAccess.getFutureAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:552:1: ( rule__Future__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:552:2: rule__Future__Group__0
            {
            pushFollow(FOLLOW_rule__Future__Group__0_in_ruleFuture1114);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:564:1: entryRuleGlobally : ruleGlobally EOF ;
    public final void entryRuleGlobally() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:565:1: ( ruleGlobally EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:566:1: ruleGlobally EOF
            {
             before(grammarAccess.getGloballyRule()); 
            pushFollow(FOLLOW_ruleGlobally_in_entryRuleGlobally1141);
            ruleGlobally();

            state._fsp--;

             after(grammarAccess.getGloballyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobally1148); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:573:1: ruleGlobally : ( ( rule__Globally__Group__0 ) ) ;
    public final void ruleGlobally() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:577:2: ( ( ( rule__Globally__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:578:1: ( ( rule__Globally__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:578:1: ( ( rule__Globally__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:579:1: ( rule__Globally__Group__0 )
            {
             before(grammarAccess.getGloballyAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:580:1: ( rule__Globally__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:580:2: rule__Globally__Group__0
            {
            pushFollow(FOLLOW_rule__Globally__Group__0_in_ruleGlobally1174);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:592:1: entryRuleImplication : ruleImplication EOF ;
    public final void entryRuleImplication() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:593:1: ( ruleImplication EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:594:1: ruleImplication EOF
            {
             before(grammarAccess.getImplicationRule()); 
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication1201);
            ruleImplication();

            state._fsp--;

             after(grammarAccess.getImplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication1208); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:601:1: ruleImplication : ( ( rule__Implication__Group__0 ) ) ;
    public final void ruleImplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:605:2: ( ( ( rule__Implication__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:606:1: ( ( rule__Implication__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:606:1: ( ( rule__Implication__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:607:1: ( rule__Implication__Group__0 )
            {
             before(grammarAccess.getImplicationAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:608:1: ( rule__Implication__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:608:2: rule__Implication__Group__0
            {
            pushFollow(FOLLOW_rule__Implication__Group__0_in_ruleImplication1234);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:620:1: entryRuleCompareProbability : ruleCompareProbability EOF ;
    public final void entryRuleCompareProbability() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:621:1: ( ruleCompareProbability EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:622:1: ruleCompareProbability EOF
            {
             before(grammarAccess.getCompareProbabilityRule()); 
            pushFollow(FOLLOW_ruleCompareProbability_in_entryRuleCompareProbability1261);
            ruleCompareProbability();

            state._fsp--;

             after(grammarAccess.getCompareProbabilityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareProbability1268); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:629:1: ruleCompareProbability : ( ( rule__CompareProbability__Group__0 ) ) ;
    public final void ruleCompareProbability() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:633:2: ( ( ( rule__CompareProbability__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:634:1: ( ( rule__CompareProbability__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:634:1: ( ( rule__CompareProbability__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:635:1: ( rule__CompareProbability__Group__0 )
            {
             before(grammarAccess.getCompareProbabilityAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:636:1: ( rule__CompareProbability__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:636:2: rule__CompareProbability__Group__0
            {
            pushFollow(FOLLOW_rule__CompareProbability__Group__0_in_ruleCompareProbability1294);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:648:1: entryRuleTimeBound : ruleTimeBound EOF ;
    public final void entryRuleTimeBound() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:649:1: ( ruleTimeBound EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:650:1: ruleTimeBound EOF
            {
             before(grammarAccess.getTimeBoundRule()); 
            pushFollow(FOLLOW_ruleTimeBound_in_entryRuleTimeBound1321);
            ruleTimeBound();

            state._fsp--;

             after(grammarAccess.getTimeBoundRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeBound1328); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:657:1: ruleTimeBound : ( ( rule__TimeBound__Alternatives ) ) ;
    public final void ruleTimeBound() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:661:2: ( ( ( rule__TimeBound__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:662:1: ( ( rule__TimeBound__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:662:1: ( ( rule__TimeBound__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:663:1: ( rule__TimeBound__Alternatives )
            {
             before(grammarAccess.getTimeBoundAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:664:1: ( rule__TimeBound__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:664:2: rule__TimeBound__Alternatives
            {
            pushFollow(FOLLOW_rule__TimeBound__Alternatives_in_ruleTimeBound1354);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:676:1: rule__Pctl__Alternatives : ( ( ruleStateFormula ) | ( ruleSteadyState ) | ( ruleQuantifiedProbability ) );
    public final void rule__Pctl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:680:1: ( ( ruleStateFormula ) | ( ruleSteadyState ) | ( ruleQuantifiedProbability ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
            case 18:
            case 19:
            case 20:
            case 23:
                {
                alt1=1;
                }
                break;
            case 28:
                {
                int LA1_2 = input.LA(2);

                if ( ((LA1_2>=33 && LA1_2<=34)) ) {
                    alt1=1;
                }
                else if ( (LA1_2==13) ) {
                    alt1=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:681:1: ( ruleStateFormula )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:681:1: ( ruleStateFormula )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:682:1: ruleStateFormula
                    {
                     before(grammarAccess.getPctlAccess().getStateFormulaParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStateFormula_in_rule__Pctl__Alternatives1390);
                    ruleStateFormula();

                    state._fsp--;

                     after(grammarAccess.getPctlAccess().getStateFormulaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:687:6: ( ruleSteadyState )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:687:6: ( ruleSteadyState )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:688:1: ruleSteadyState
                    {
                     before(grammarAccess.getPctlAccess().getSteadyStateParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSteadyState_in_rule__Pctl__Alternatives1407);
                    ruleSteadyState();

                    state._fsp--;

                     after(grammarAccess.getPctlAccess().getSteadyStateParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:693:6: ( ruleQuantifiedProbability )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:693:6: ( ruleQuantifiedProbability )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:694:1: ruleQuantifiedProbability
                    {
                     before(grammarAccess.getPctlAccess().getQuantifiedProbabilityParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleQuantifiedProbability_in_rule__Pctl__Alternatives1424);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:704:1: rule__Atomic__Alternatives : ( ( ruleState ) | ( ruleLabel ) | ( RULE_BOOL ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:708:1: ( ( ruleState ) | ( ruleLabel ) | ( RULE_BOOL ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case RULE_BOOL:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:709:1: ( ruleState )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:709:1: ( ruleState )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:710:1: ruleState
                    {
                     before(grammarAccess.getAtomicAccess().getStateParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleState_in_rule__Atomic__Alternatives1456);
                    ruleState();

                    state._fsp--;

                     after(grammarAccess.getAtomicAccess().getStateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:715:6: ( ruleLabel )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:715:6: ( ruleLabel )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:716:1: ruleLabel
                    {
                     before(grammarAccess.getAtomicAccess().getLabelParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLabel_in_rule__Atomic__Alternatives1473);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getAtomicAccess().getLabelParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:721:6: ( RULE_BOOL )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:721:6: ( RULE_BOOL )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:722:1: RULE_BOOL
                    {
                     before(grammarAccess.getAtomicAccess().getBOOLTerminalRuleCall_2()); 
                    match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__Atomic__Alternatives1490); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:732:1: rule__Junction__Alternatives : ( ( ruleConjunction ) | ( ruleDisjunction ) );
    public final void rule__Junction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:736:1: ( ( ruleConjunction ) | ( ruleDisjunction ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:737:1: ( ruleConjunction )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:737:1: ( ruleConjunction )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:738:1: ruleConjunction
                    {
                     before(grammarAccess.getJunctionAccess().getConjunctionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConjunction_in_rule__Junction__Alternatives1522);
                    ruleConjunction();

                    state._fsp--;

                     after(grammarAccess.getJunctionAccess().getConjunctionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:743:6: ( ruleDisjunction )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:743:6: ( ruleDisjunction )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:744:1: ruleDisjunction
                    {
                     before(grammarAccess.getJunctionAccess().getDisjunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDisjunction_in_rule__Junction__Alternatives1539);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:754:1: rule__StateFormula__Alternatives : ( ( ( rule__StateFormula__Group_0__0 ) ) | ( ruleNegation ) | ( ruleAtomic ) | ( ( rule__StateFormula__LeftAssignment_3 ) ) );
    public final void rule__StateFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:758:1: ( ( ( rule__StateFormula__Group_0__0 ) ) | ( ruleNegation ) | ( ruleAtomic ) | ( ( rule__StateFormula__LeftAssignment_3 ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt4=1;
                }
                break;
            case 20:
                {
                alt4=2;
                }
                break;
            case RULE_BOOL:
            case 18:
            case 19:
                {
                alt4=3;
                }
                break;
            case 28:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:759:1: ( ( rule__StateFormula__Group_0__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:759:1: ( ( rule__StateFormula__Group_0__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:760:1: ( rule__StateFormula__Group_0__0 )
                    {
                     before(grammarAccess.getStateFormulaAccess().getGroup_0()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:761:1: ( rule__StateFormula__Group_0__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:761:2: rule__StateFormula__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__StateFormula__Group_0__0_in_rule__StateFormula__Alternatives1571);
                    rule__StateFormula__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateFormulaAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:765:6: ( ruleNegation )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:765:6: ( ruleNegation )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:766:1: ruleNegation
                    {
                     before(grammarAccess.getStateFormulaAccess().getNegationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNegation_in_rule__StateFormula__Alternatives1589);
                    ruleNegation();

                    state._fsp--;

                     after(grammarAccess.getStateFormulaAccess().getNegationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:771:6: ( ruleAtomic )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:771:6: ( ruleAtomic )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:772:1: ruleAtomic
                    {
                     before(grammarAccess.getStateFormulaAccess().getAtomicParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAtomic_in_rule__StateFormula__Alternatives1606);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getStateFormulaAccess().getAtomicParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:777:6: ( ( rule__StateFormula__LeftAssignment_3 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:777:6: ( ( rule__StateFormula__LeftAssignment_3 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:778:1: ( rule__StateFormula__LeftAssignment_3 )
                    {
                     before(grammarAccess.getStateFormulaAccess().getLeftAssignment_3()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:779:1: ( rule__StateFormula__LeftAssignment_3 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:779:2: rule__StateFormula__LeftAssignment_3
                    {
                    pushFollow(FOLLOW_rule__StateFormula__LeftAssignment_3_in_rule__StateFormula__Alternatives1623);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:788:1: rule__StateFormula__Alternatives_0_2 : ( ( ( rule__StateFormula__RightAssignment_0_2_0 ) ) | ( ( rule__StateFormula__RightAssignment_0_2_1 ) ) );
    public final void rule__StateFormula__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:792:1: ( ( ( rule__StateFormula__RightAssignment_0_2_0 ) ) | ( ( rule__StateFormula__RightAssignment_0_2_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=21 && LA5_0<=22)) ) {
                alt5=1;
            }
            else if ( (LA5_0==32) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:793:1: ( ( rule__StateFormula__RightAssignment_0_2_0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:793:1: ( ( rule__StateFormula__RightAssignment_0_2_0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:794:1: ( rule__StateFormula__RightAssignment_0_2_0 )
                    {
                     before(grammarAccess.getStateFormulaAccess().getRightAssignment_0_2_0()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:795:1: ( rule__StateFormula__RightAssignment_0_2_0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:795:2: rule__StateFormula__RightAssignment_0_2_0
                    {
                    pushFollow(FOLLOW_rule__StateFormula__RightAssignment_0_2_0_in_rule__StateFormula__Alternatives_0_21656);
                    rule__StateFormula__RightAssignment_0_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateFormulaAccess().getRightAssignment_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:799:6: ( ( rule__StateFormula__RightAssignment_0_2_1 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:799:6: ( ( rule__StateFormula__RightAssignment_0_2_1 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:800:1: ( rule__StateFormula__RightAssignment_0_2_1 )
                    {
                     before(grammarAccess.getStateFormulaAccess().getRightAssignment_0_2_1()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:801:1: ( rule__StateFormula__RightAssignment_0_2_1 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:801:2: rule__StateFormula__RightAssignment_0_2_1
                    {
                    pushFollow(FOLLOW_rule__StateFormula__RightAssignment_0_2_1_in_rule__StateFormula__Alternatives_0_21674);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:810:1: rule__PathFormula__Alternatives : ( ( ruleNext ) | ( ruleUntil ) | ( ruleFuture ) | ( ruleGlobally ) );
    public final void rule__PathFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:814:1: ( ( ruleNext ) | ( ruleUntil ) | ( ruleFuture ) | ( ruleGlobally ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt6=1;
                }
                break;
            case RULE_BOOL:
            case 18:
            case 19:
            case 20:
            case 23:
            case 28:
                {
                alt6=2;
                }
                break;
            case 30:
                {
                alt6=3;
                }
                break;
            case 31:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:815:1: ( ruleNext )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:815:1: ( ruleNext )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:816:1: ruleNext
                    {
                     before(grammarAccess.getPathFormulaAccess().getNextParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNext_in_rule__PathFormula__Alternatives1707);
                    ruleNext();

                    state._fsp--;

                     after(grammarAccess.getPathFormulaAccess().getNextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:821:6: ( ruleUntil )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:821:6: ( ruleUntil )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:822:1: ruleUntil
                    {
                     before(grammarAccess.getPathFormulaAccess().getUntilParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUntil_in_rule__PathFormula__Alternatives1724);
                    ruleUntil();

                    state._fsp--;

                     after(grammarAccess.getPathFormulaAccess().getUntilParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:827:6: ( ruleFuture )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:827:6: ( ruleFuture )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:828:1: ruleFuture
                    {
                     before(grammarAccess.getPathFormulaAccess().getFutureParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFuture_in_rule__PathFormula__Alternatives1741);
                    ruleFuture();

                    state._fsp--;

                     after(grammarAccess.getPathFormulaAccess().getFutureParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:833:6: ( ruleGlobally )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:833:6: ( ruleGlobally )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:834:1: ruleGlobally
                    {
                     before(grammarAccess.getPathFormulaAccess().getGloballyParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleGlobally_in_rule__PathFormula__Alternatives1758);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:844:1: rule__SteadyState__Alternatives_1 : ( ( ruleCompareProbability ) | ( '=?' ) );
    public final void rule__SteadyState__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:848:1: ( ( ruleCompareProbability ) | ( '=?' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=33 && LA7_0<=34)) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:849:1: ( ruleCompareProbability )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:849:1: ( ruleCompareProbability )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:850:1: ruleCompareProbability
                    {
                     before(grammarAccess.getSteadyStateAccess().getCompareProbabilityParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_ruleCompareProbability_in_rule__SteadyState__Alternatives_11790);
                    ruleCompareProbability();

                    state._fsp--;

                     after(grammarAccess.getSteadyStateAccess().getCompareProbabilityParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:855:6: ( '=?' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:855:6: ( '=?' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:856:1: '=?'
                    {
                     before(grammarAccess.getSteadyStateAccess().getEqualsSignQuestionMarkKeyword_1_1()); 
                    match(input,13,FOLLOW_13_in_rule__SteadyState__Alternatives_11808); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:868:1: rule__Until__Alternatives_1 : ( ( 'U' ) | ( 'W' ) | ( 'R' ) );
    public final void rule__Until__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:872:1: ( ( 'U' ) | ( 'W' ) | ( 'R' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            case 16:
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:873:1: ( 'U' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:873:1: ( 'U' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:874:1: 'U'
                    {
                     before(grammarAccess.getUntilAccess().getUKeyword_1_0()); 
                    match(input,14,FOLLOW_14_in_rule__Until__Alternatives_11843); 
                     after(grammarAccess.getUntilAccess().getUKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:881:6: ( 'W' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:881:6: ( 'W' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:882:1: 'W'
                    {
                     before(grammarAccess.getUntilAccess().getWKeyword_1_1()); 
                    match(input,15,FOLLOW_15_in_rule__Until__Alternatives_11863); 
                     after(grammarAccess.getUntilAccess().getWKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:889:6: ( 'R' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:889:6: ( 'R' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:890:1: 'R'
                    {
                     before(grammarAccess.getUntilAccess().getRKeyword_1_2()); 
                    match(input,16,FOLLOW_16_in_rule__Until__Alternatives_11883); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:902:1: rule__CompareProbability__Alternatives_0 : ( ( ( rule__CompareProbability__Group_0_0__0 ) ) | ( ( rule__CompareProbability__Group_0_1__0 ) ) );
    public final void rule__CompareProbability__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:906:1: ( ( ( rule__CompareProbability__Group_0_0__0 ) ) | ( ( rule__CompareProbability__Group_0_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            else if ( (LA9_0==34) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:907:1: ( ( rule__CompareProbability__Group_0_0__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:907:1: ( ( rule__CompareProbability__Group_0_0__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:908:1: ( rule__CompareProbability__Group_0_0__0 )
                    {
                     before(grammarAccess.getCompareProbabilityAccess().getGroup_0_0()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:909:1: ( rule__CompareProbability__Group_0_0__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:909:2: rule__CompareProbability__Group_0_0__0
                    {
                    pushFollow(FOLLOW_rule__CompareProbability__Group_0_0__0_in_rule__CompareProbability__Alternatives_01917);
                    rule__CompareProbability__Group_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompareProbabilityAccess().getGroup_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:913:6: ( ( rule__CompareProbability__Group_0_1__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:913:6: ( ( rule__CompareProbability__Group_0_1__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:914:1: ( rule__CompareProbability__Group_0_1__0 )
                    {
                     before(grammarAccess.getCompareProbabilityAccess().getGroup_0_1()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:915:1: ( rule__CompareProbability__Group_0_1__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:915:2: rule__CompareProbability__Group_0_1__0
                    {
                    pushFollow(FOLLOW_rule__CompareProbability__Group_0_1__0_in_rule__CompareProbability__Alternatives_01935);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:924:1: rule__TimeBound__Alternatives : ( ( ( rule__TimeBound__Group_0__0 ) ) | ( ( rule__TimeBound__Group_1__0 ) ) );
    public final void rule__TimeBound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:928:1: ( ( ( rule__TimeBound__Group_0__0 ) ) | ( ( rule__TimeBound__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17||(LA10_0>=33 && LA10_0<=34)) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:929:1: ( ( rule__TimeBound__Group_0__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:929:1: ( ( rule__TimeBound__Group_0__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:930:1: ( rule__TimeBound__Group_0__0 )
                    {
                     before(grammarAccess.getTimeBoundAccess().getGroup_0()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:931:1: ( rule__TimeBound__Group_0__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:931:2: rule__TimeBound__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TimeBound__Group_0__0_in_rule__TimeBound__Alternatives1968);
                    rule__TimeBound__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimeBoundAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:935:6: ( ( rule__TimeBound__Group_1__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:935:6: ( ( rule__TimeBound__Group_1__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:936:1: ( rule__TimeBound__Group_1__0 )
                    {
                     before(grammarAccess.getTimeBoundAccess().getGroup_1()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:937:1: ( rule__TimeBound__Group_1__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:937:2: rule__TimeBound__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TimeBound__Group_1__0_in_rule__TimeBound__Alternatives1986);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:946:1: rule__TimeBound__Alternatives_0_0 : ( ( ( rule__TimeBound__Group_0_0_0__0 ) ) | ( ( rule__TimeBound__Group_0_0_1__0 ) ) | ( '=' ) );
    public final void rule__TimeBound__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:950:1: ( ( ( rule__TimeBound__Group_0_0_0__0 ) ) | ( ( rule__TimeBound__Group_0_0_1__0 ) ) | ( '=' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt11=1;
                }
                break;
            case 34:
                {
                alt11=2;
                }
                break;
            case 17:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:951:1: ( ( rule__TimeBound__Group_0_0_0__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:951:1: ( ( rule__TimeBound__Group_0_0_0__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:952:1: ( rule__TimeBound__Group_0_0_0__0 )
                    {
                     before(grammarAccess.getTimeBoundAccess().getGroup_0_0_0()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:953:1: ( rule__TimeBound__Group_0_0_0__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:953:2: rule__TimeBound__Group_0_0_0__0
                    {
                    pushFollow(FOLLOW_rule__TimeBound__Group_0_0_0__0_in_rule__TimeBound__Alternatives_0_02019);
                    rule__TimeBound__Group_0_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimeBoundAccess().getGroup_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:957:6: ( ( rule__TimeBound__Group_0_0_1__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:957:6: ( ( rule__TimeBound__Group_0_0_1__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:958:1: ( rule__TimeBound__Group_0_0_1__0 )
                    {
                     before(grammarAccess.getTimeBoundAccess().getGroup_0_0_1()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:959:1: ( rule__TimeBound__Group_0_0_1__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:959:2: rule__TimeBound__Group_0_0_1__0
                    {
                    pushFollow(FOLLOW_rule__TimeBound__Group_0_0_1__0_in_rule__TimeBound__Alternatives_0_02037);
                    rule__TimeBound__Group_0_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimeBoundAccess().getGroup_0_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:963:6: ( '=' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:963:6: ( '=' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:964:1: '='
                    {
                     before(grammarAccess.getTimeBoundAccess().getEqualsSignKeyword_0_0_2()); 
                    match(input,17,FOLLOW_17_in_rule__TimeBound__Alternatives_0_02056); 
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


    // $ANTLR start "rule__Start__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:978:1: rule__Start__Group__0 : rule__Start__Group__0__Impl rule__Start__Group__1 ;
    public final void rule__Start__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:982:1: ( rule__Start__Group__0__Impl rule__Start__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:983:2: rule__Start__Group__0__Impl rule__Start__Group__1
            {
            pushFollow(FOLLOW_rule__Start__Group__0__Impl_in_rule__Start__Group__02088);
            rule__Start__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Start__Group__1_in_rule__Start__Group__02091);
            rule__Start__Group__1();

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
    // $ANTLR end "rule__Start__Group__0"


    // $ANTLR start "rule__Start__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:990:1: rule__Start__Group__0__Impl : ( ( rule__Start__StartAssignment_0 ) ) ;
    public final void rule__Start__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:994:1: ( ( ( rule__Start__StartAssignment_0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:995:1: ( ( rule__Start__StartAssignment_0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:995:1: ( ( rule__Start__StartAssignment_0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:996:1: ( rule__Start__StartAssignment_0 )
            {
             before(grammarAccess.getStartAccess().getStartAssignment_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:997:1: ( rule__Start__StartAssignment_0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:997:2: rule__Start__StartAssignment_0
            {
            pushFollow(FOLLOW_rule__Start__StartAssignment_0_in_rule__Start__Group__0__Impl2118);
            rule__Start__StartAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStartAccess().getStartAssignment_0()); 

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
    // $ANTLR end "rule__Start__Group__0__Impl"


    // $ANTLR start "rule__Start__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1007:1: rule__Start__Group__1 : rule__Start__Group__1__Impl ;
    public final void rule__Start__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1011:1: ( rule__Start__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1012:2: rule__Start__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Start__Group__1__Impl_in_rule__Start__Group__12148);
            rule__Start__Group__1__Impl();

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
    // $ANTLR end "rule__Start__Group__1"


    // $ANTLR start "rule__Start__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1018:1: rule__Start__Group__1__Impl : ( ( rule__Start__StartAssignment_1 )? ) ;
    public final void rule__Start__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1022:1: ( ( ( rule__Start__StartAssignment_1 )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1023:1: ( ( rule__Start__StartAssignment_1 )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1023:1: ( ( rule__Start__StartAssignment_1 )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1024:1: ( rule__Start__StartAssignment_1 )?
            {
             before(grammarAccess.getStartAccess().getStartAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1025:1: ( rule__Start__StartAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_BOOL||LA12_0==RULE_SL_COMMENT||(LA12_0>=18 && LA12_0<=20)||LA12_0==23||LA12_0==25||LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1025:2: rule__Start__StartAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Start__StartAssignment_1_in_rule__Start__Group__1__Impl2175);
                    rule__Start__StartAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStartAccess().getStartAssignment_1()); 

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
    // $ANTLR end "rule__Start__Group__1__Impl"


    // $ANTLR start "rule__CommentedRule__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1039:1: rule__CommentedRule__Group__0 : rule__CommentedRule__Group__0__Impl rule__CommentedRule__Group__1 ;
    public final void rule__CommentedRule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1043:1: ( rule__CommentedRule__Group__0__Impl rule__CommentedRule__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1044:2: rule__CommentedRule__Group__0__Impl rule__CommentedRule__Group__1
            {
            pushFollow(FOLLOW_rule__CommentedRule__Group__0__Impl_in_rule__CommentedRule__Group__02210);
            rule__CommentedRule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CommentedRule__Group__1_in_rule__CommentedRule__Group__02213);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1051:1: rule__CommentedRule__Group__0__Impl : ( ( rule__CommentedRule__CommentAssignment_0 )? ) ;
    public final void rule__CommentedRule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1055:1: ( ( ( rule__CommentedRule__CommentAssignment_0 )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1056:1: ( ( rule__CommentedRule__CommentAssignment_0 )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1056:1: ( ( rule__CommentedRule__CommentAssignment_0 )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1057:1: ( rule__CommentedRule__CommentAssignment_0 )?
            {
             before(grammarAccess.getCommentedRuleAccess().getCommentAssignment_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1058:1: ( rule__CommentedRule__CommentAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_SL_COMMENT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1058:2: rule__CommentedRule__CommentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__CommentedRule__CommentAssignment_0_in_rule__CommentedRule__Group__0__Impl2240);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1068:1: rule__CommentedRule__Group__1 : rule__CommentedRule__Group__1__Impl ;
    public final void rule__CommentedRule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1072:1: ( rule__CommentedRule__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1073:2: rule__CommentedRule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CommentedRule__Group__1__Impl_in_rule__CommentedRule__Group__12271);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1079:1: rule__CommentedRule__Group__1__Impl : ( ( rule__CommentedRule__RuleAssignment_1 ) ) ;
    public final void rule__CommentedRule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1083:1: ( ( ( rule__CommentedRule__RuleAssignment_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1084:1: ( ( rule__CommentedRule__RuleAssignment_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1084:1: ( ( rule__CommentedRule__RuleAssignment_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1085:1: ( rule__CommentedRule__RuleAssignment_1 )
            {
             before(grammarAccess.getCommentedRuleAccess().getRuleAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1086:1: ( rule__CommentedRule__RuleAssignment_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1086:2: rule__CommentedRule__RuleAssignment_1
            {
            pushFollow(FOLLOW_rule__CommentedRule__RuleAssignment_1_in_rule__CommentedRule__Group__1__Impl2298);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1100:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1104:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1105:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__02332);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__02335);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1112:1: rule__State__Group__0__Impl : ( 'State:' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1116:1: ( ( 'State:' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1117:1: ( 'State:' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1117:1: ( 'State:' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1118:1: 'State:'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__State__Group__0__Impl2363); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1131:1: rule__State__Group__1 : rule__State__Group__1__Impl ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1135:1: ( rule__State__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1136:2: rule__State__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__12394);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1142:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1146:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1147:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1147:1: ( ( rule__State__NameAssignment_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1148:1: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1149:1: ( rule__State__NameAssignment_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1149:2: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl2421);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1163:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1167:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1168:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__02455);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label__Group__1_in_rule__Label__Group__02458);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1175:1: rule__Label__Group__0__Impl : ( 'Label:' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1179:1: ( ( 'Label:' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1180:1: ( 'Label:' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1180:1: ( 'Label:' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1181:1: 'Label:'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__Label__Group__0__Impl2486); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1194:1: rule__Label__Group__1 : rule__Label__Group__1__Impl ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1198:1: ( rule__Label__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1199:2: rule__Label__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__12517);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1205:1: rule__Label__Group__1__Impl : ( ( rule__Label__NameAssignment_1 ) ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1209:1: ( ( ( rule__Label__NameAssignment_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1210:1: ( ( rule__Label__NameAssignment_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1210:1: ( ( rule__Label__NameAssignment_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1211:1: ( rule__Label__NameAssignment_1 )
            {
             before(grammarAccess.getLabelAccess().getNameAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1212:1: ( rule__Label__NameAssignment_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1212:2: rule__Label__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Label__NameAssignment_1_in_rule__Label__Group__1__Impl2544);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1226:1: rule__Negation__Group__0 : rule__Negation__Group__0__Impl rule__Negation__Group__1 ;
    public final void rule__Negation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1230:1: ( rule__Negation__Group__0__Impl rule__Negation__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1231:2: rule__Negation__Group__0__Impl rule__Negation__Group__1
            {
            pushFollow(FOLLOW_rule__Negation__Group__0__Impl_in_rule__Negation__Group__02578);
            rule__Negation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Negation__Group__1_in_rule__Negation__Group__02581);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1238:1: rule__Negation__Group__0__Impl : ( '!' ) ;
    public final void rule__Negation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1242:1: ( ( '!' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1243:1: ( '!' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1243:1: ( '!' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1244:1: '!'
            {
             before(grammarAccess.getNegationAccess().getExclamationMarkKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Negation__Group__0__Impl2609); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1257:1: rule__Negation__Group__1 : rule__Negation__Group__1__Impl ;
    public final void rule__Negation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1261:1: ( rule__Negation__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1262:2: rule__Negation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Negation__Group__1__Impl_in_rule__Negation__Group__12640);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1268:1: rule__Negation__Group__1__Impl : ( ruleStateFormula ) ;
    public final void rule__Negation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1272:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1273:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1273:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1274:1: ruleStateFormula
            {
             before(grammarAccess.getNegationAccess().getStateFormulaParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Negation__Group__1__Impl2667);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1289:1: rule__Conjunction__Group__0 : rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 ;
    public final void rule__Conjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1293:1: ( rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1294:2: rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__02700);
            rule__Conjunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__02703);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1301:1: rule__Conjunction__Group__0__Impl : ( '&' ) ;
    public final void rule__Conjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1305:1: ( ( '&' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1306:1: ( '&' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1306:1: ( '&' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1307:1: '&'
            {
             before(grammarAccess.getConjunctionAccess().getAmpersandKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Conjunction__Group__0__Impl2731); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1320:1: rule__Conjunction__Group__1 : rule__Conjunction__Group__1__Impl rule__Conjunction__Group__2 ;
    public final void rule__Conjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1324:1: ( rule__Conjunction__Group__1__Impl rule__Conjunction__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1325:2: rule__Conjunction__Group__1__Impl rule__Conjunction__Group__2
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__12762);
            rule__Conjunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group__2_in_rule__Conjunction__Group__12765);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1332:1: rule__Conjunction__Group__1__Impl : ( ruleStateFormula ) ;
    public final void rule__Conjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1336:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1337:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1337:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1338:1: ruleStateFormula
            {
             before(grammarAccess.getConjunctionAccess().getStateFormulaParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Conjunction__Group__1__Impl2792);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1349:1: rule__Conjunction__Group__2 : rule__Conjunction__Group__2__Impl ;
    public final void rule__Conjunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1353:1: ( rule__Conjunction__Group__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1354:2: rule__Conjunction__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__2__Impl_in_rule__Conjunction__Group__22821);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1360:1: rule__Conjunction__Group__2__Impl : ( ( rule__Conjunction__Group_2__0 )* ) ;
    public final void rule__Conjunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1364:1: ( ( ( rule__Conjunction__Group_2__0 )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1365:1: ( ( rule__Conjunction__Group_2__0 )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1365:1: ( ( rule__Conjunction__Group_2__0 )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1366:1: ( rule__Conjunction__Group_2__0 )*
            {
             before(grammarAccess.getConjunctionAccess().getGroup_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1367:1: ( rule__Conjunction__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1367:2: rule__Conjunction__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Conjunction__Group_2__0_in_rule__Conjunction__Group__2__Impl2848);
            	    rule__Conjunction__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1383:1: rule__Conjunction__Group_2__0 : rule__Conjunction__Group_2__0__Impl rule__Conjunction__Group_2__1 ;
    public final void rule__Conjunction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1387:1: ( rule__Conjunction__Group_2__0__Impl rule__Conjunction__Group_2__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1388:2: rule__Conjunction__Group_2__0__Impl rule__Conjunction__Group_2__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_2__0__Impl_in_rule__Conjunction__Group_2__02885);
            rule__Conjunction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_2__1_in_rule__Conjunction__Group_2__02888);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1395:1: rule__Conjunction__Group_2__0__Impl : ( () ) ;
    public final void rule__Conjunction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1399:1: ( ( () ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1400:1: ( () )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1400:1: ( () )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1401:1: ()
            {
             before(grammarAccess.getConjunctionAccess().getConjunctionLeftAction_2_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1402:1: ()
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1404:1: 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1414:1: rule__Conjunction__Group_2__1 : rule__Conjunction__Group_2__1__Impl rule__Conjunction__Group_2__2 ;
    public final void rule__Conjunction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1418:1: ( rule__Conjunction__Group_2__1__Impl rule__Conjunction__Group_2__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1419:2: rule__Conjunction__Group_2__1__Impl rule__Conjunction__Group_2__2
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_2__1__Impl_in_rule__Conjunction__Group_2__12946);
            rule__Conjunction__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_2__2_in_rule__Conjunction__Group_2__12949);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1426:1: rule__Conjunction__Group_2__1__Impl : ( '&' ) ;
    public final void rule__Conjunction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1430:1: ( ( '&' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1431:1: ( '&' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1431:1: ( '&' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1432:1: '&'
            {
             before(grammarAccess.getConjunctionAccess().getAmpersandKeyword_2_1()); 
            match(input,21,FOLLOW_21_in_rule__Conjunction__Group_2__1__Impl2977); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1445:1: rule__Conjunction__Group_2__2 : rule__Conjunction__Group_2__2__Impl ;
    public final void rule__Conjunction__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1449:1: ( rule__Conjunction__Group_2__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1450:2: rule__Conjunction__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_2__2__Impl_in_rule__Conjunction__Group_2__23008);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1456:1: rule__Conjunction__Group_2__2__Impl : ( ( rule__Conjunction__RightAssignment_2_2 ) ) ;
    public final void rule__Conjunction__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1460:1: ( ( ( rule__Conjunction__RightAssignment_2_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1461:1: ( ( rule__Conjunction__RightAssignment_2_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1461:1: ( ( rule__Conjunction__RightAssignment_2_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1462:1: ( rule__Conjunction__RightAssignment_2_2 )
            {
             before(grammarAccess.getConjunctionAccess().getRightAssignment_2_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1463:1: ( rule__Conjunction__RightAssignment_2_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1463:2: rule__Conjunction__RightAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Conjunction__RightAssignment_2_2_in_rule__Conjunction__Group_2__2__Impl3035);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1479:1: rule__Disjunction__Group__0 : rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 ;
    public final void rule__Disjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1483:1: ( rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1484:2: rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__0__Impl_in_rule__Disjunction__Group__03071);
            rule__Disjunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group__1_in_rule__Disjunction__Group__03074);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1491:1: rule__Disjunction__Group__0__Impl : ( '|' ) ;
    public final void rule__Disjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1495:1: ( ( '|' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1496:1: ( '|' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1496:1: ( '|' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1497:1: '|'
            {
             before(grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Disjunction__Group__0__Impl3102); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1510:1: rule__Disjunction__Group__1 : rule__Disjunction__Group__1__Impl rule__Disjunction__Group__2 ;
    public final void rule__Disjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1514:1: ( rule__Disjunction__Group__1__Impl rule__Disjunction__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1515:2: rule__Disjunction__Group__1__Impl rule__Disjunction__Group__2
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__1__Impl_in_rule__Disjunction__Group__13133);
            rule__Disjunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group__2_in_rule__Disjunction__Group__13136);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1522:1: rule__Disjunction__Group__1__Impl : ( ruleStateFormula ) ;
    public final void rule__Disjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1526:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1527:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1527:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1528:1: ruleStateFormula
            {
             before(grammarAccess.getDisjunctionAccess().getStateFormulaParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Disjunction__Group__1__Impl3163);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1539:1: rule__Disjunction__Group__2 : rule__Disjunction__Group__2__Impl ;
    public final void rule__Disjunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1543:1: ( rule__Disjunction__Group__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1544:2: rule__Disjunction__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__2__Impl_in_rule__Disjunction__Group__23192);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1550:1: rule__Disjunction__Group__2__Impl : ( ( rule__Disjunction__Group_2__0 )* ) ;
    public final void rule__Disjunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1554:1: ( ( ( rule__Disjunction__Group_2__0 )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1555:1: ( ( rule__Disjunction__Group_2__0 )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1555:1: ( ( rule__Disjunction__Group_2__0 )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1556:1: ( rule__Disjunction__Group_2__0 )*
            {
             before(grammarAccess.getDisjunctionAccess().getGroup_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1557:1: ( rule__Disjunction__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==22) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1557:2: rule__Disjunction__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Disjunction__Group_2__0_in_rule__Disjunction__Group__2__Impl3219);
            	    rule__Disjunction__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1573:1: rule__Disjunction__Group_2__0 : rule__Disjunction__Group_2__0__Impl rule__Disjunction__Group_2__1 ;
    public final void rule__Disjunction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1577:1: ( rule__Disjunction__Group_2__0__Impl rule__Disjunction__Group_2__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1578:2: rule__Disjunction__Group_2__0__Impl rule__Disjunction__Group_2__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_2__0__Impl_in_rule__Disjunction__Group_2__03256);
            rule__Disjunction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group_2__1_in_rule__Disjunction__Group_2__03259);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1585:1: rule__Disjunction__Group_2__0__Impl : ( () ) ;
    public final void rule__Disjunction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1589:1: ( ( () ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1590:1: ( () )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1590:1: ( () )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1591:1: ()
            {
             before(grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_2_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1592:1: ()
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1594:1: 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1604:1: rule__Disjunction__Group_2__1 : rule__Disjunction__Group_2__1__Impl rule__Disjunction__Group_2__2 ;
    public final void rule__Disjunction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1608:1: ( rule__Disjunction__Group_2__1__Impl rule__Disjunction__Group_2__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1609:2: rule__Disjunction__Group_2__1__Impl rule__Disjunction__Group_2__2
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_2__1__Impl_in_rule__Disjunction__Group_2__13317);
            rule__Disjunction__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group_2__2_in_rule__Disjunction__Group_2__13320);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1616:1: rule__Disjunction__Group_2__1__Impl : ( '|' ) ;
    public final void rule__Disjunction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1620:1: ( ( '|' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1621:1: ( '|' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1621:1: ( '|' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1622:1: '|'
            {
             before(grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_2_1()); 
            match(input,22,FOLLOW_22_in_rule__Disjunction__Group_2__1__Impl3348); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1635:1: rule__Disjunction__Group_2__2 : rule__Disjunction__Group_2__2__Impl ;
    public final void rule__Disjunction__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1639:1: ( rule__Disjunction__Group_2__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1640:2: rule__Disjunction__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_2__2__Impl_in_rule__Disjunction__Group_2__23379);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1646:1: rule__Disjunction__Group_2__2__Impl : ( ( rule__Disjunction__RightAssignment_2_2 ) ) ;
    public final void rule__Disjunction__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1650:1: ( ( ( rule__Disjunction__RightAssignment_2_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1651:1: ( ( rule__Disjunction__RightAssignment_2_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1651:1: ( ( rule__Disjunction__RightAssignment_2_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1652:1: ( rule__Disjunction__RightAssignment_2_2 )
            {
             before(grammarAccess.getDisjunctionAccess().getRightAssignment_2_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1653:1: ( rule__Disjunction__RightAssignment_2_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1653:2: rule__Disjunction__RightAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Disjunction__RightAssignment_2_2_in_rule__Disjunction__Group_2__2__Impl3406);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1669:1: rule__StateFormula__Group_0__0 : rule__StateFormula__Group_0__0__Impl rule__StateFormula__Group_0__1 ;
    public final void rule__StateFormula__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1673:1: ( rule__StateFormula__Group_0__0__Impl rule__StateFormula__Group_0__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1674:2: rule__StateFormula__Group_0__0__Impl rule__StateFormula__Group_0__1
            {
            pushFollow(FOLLOW_rule__StateFormula__Group_0__0__Impl_in_rule__StateFormula__Group_0__03442);
            rule__StateFormula__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateFormula__Group_0__1_in_rule__StateFormula__Group_0__03445);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1681:1: rule__StateFormula__Group_0__0__Impl : ( '(' ) ;
    public final void rule__StateFormula__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1685:1: ( ( '(' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1686:1: ( '(' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1686:1: ( '(' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1687:1: '('
            {
             before(grammarAccess.getStateFormulaAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,23,FOLLOW_23_in_rule__StateFormula__Group_0__0__Impl3473); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1700:1: rule__StateFormula__Group_0__1 : rule__StateFormula__Group_0__1__Impl rule__StateFormula__Group_0__2 ;
    public final void rule__StateFormula__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1704:1: ( rule__StateFormula__Group_0__1__Impl rule__StateFormula__Group_0__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1705:2: rule__StateFormula__Group_0__1__Impl rule__StateFormula__Group_0__2
            {
            pushFollow(FOLLOW_rule__StateFormula__Group_0__1__Impl_in_rule__StateFormula__Group_0__13504);
            rule__StateFormula__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateFormula__Group_0__2_in_rule__StateFormula__Group_0__13507);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1712:1: rule__StateFormula__Group_0__1__Impl : ( ( rule__StateFormula__LeftAssignment_0_1 ) ) ;
    public final void rule__StateFormula__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1716:1: ( ( ( rule__StateFormula__LeftAssignment_0_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1717:1: ( ( rule__StateFormula__LeftAssignment_0_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1717:1: ( ( rule__StateFormula__LeftAssignment_0_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1718:1: ( rule__StateFormula__LeftAssignment_0_1 )
            {
             before(grammarAccess.getStateFormulaAccess().getLeftAssignment_0_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1719:1: ( rule__StateFormula__LeftAssignment_0_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1719:2: rule__StateFormula__LeftAssignment_0_1
            {
            pushFollow(FOLLOW_rule__StateFormula__LeftAssignment_0_1_in_rule__StateFormula__Group_0__1__Impl3534);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1729:1: rule__StateFormula__Group_0__2 : rule__StateFormula__Group_0__2__Impl rule__StateFormula__Group_0__3 ;
    public final void rule__StateFormula__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1733:1: ( rule__StateFormula__Group_0__2__Impl rule__StateFormula__Group_0__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1734:2: rule__StateFormula__Group_0__2__Impl rule__StateFormula__Group_0__3
            {
            pushFollow(FOLLOW_rule__StateFormula__Group_0__2__Impl_in_rule__StateFormula__Group_0__23564);
            rule__StateFormula__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateFormula__Group_0__3_in_rule__StateFormula__Group_0__23567);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1741:1: rule__StateFormula__Group_0__2__Impl : ( ( rule__StateFormula__Alternatives_0_2 )? ) ;
    public final void rule__StateFormula__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1745:1: ( ( ( rule__StateFormula__Alternatives_0_2 )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1746:1: ( ( rule__StateFormula__Alternatives_0_2 )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1746:1: ( ( rule__StateFormula__Alternatives_0_2 )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1747:1: ( rule__StateFormula__Alternatives_0_2 )?
            {
             before(grammarAccess.getStateFormulaAccess().getAlternatives_0_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1748:1: ( rule__StateFormula__Alternatives_0_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=21 && LA16_0<=22)||LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1748:2: rule__StateFormula__Alternatives_0_2
                    {
                    pushFollow(FOLLOW_rule__StateFormula__Alternatives_0_2_in_rule__StateFormula__Group_0__2__Impl3594);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1758:1: rule__StateFormula__Group_0__3 : rule__StateFormula__Group_0__3__Impl ;
    public final void rule__StateFormula__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1762:1: ( rule__StateFormula__Group_0__3__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1763:2: rule__StateFormula__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__StateFormula__Group_0__3__Impl_in_rule__StateFormula__Group_0__33625);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1769:1: rule__StateFormula__Group_0__3__Impl : ( ')' ) ;
    public final void rule__StateFormula__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1773:1: ( ( ')' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1774:1: ( ')' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1774:1: ( ')' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1775:1: ')'
            {
             before(grammarAccess.getStateFormulaAccess().getRightParenthesisKeyword_0_3()); 
            match(input,24,FOLLOW_24_in_rule__StateFormula__Group_0__3__Impl3653); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1796:1: rule__SteadyState__Group__0 : rule__SteadyState__Group__0__Impl rule__SteadyState__Group__1 ;
    public final void rule__SteadyState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1800:1: ( rule__SteadyState__Group__0__Impl rule__SteadyState__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1801:2: rule__SteadyState__Group__0__Impl rule__SteadyState__Group__1
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__0__Impl_in_rule__SteadyState__Group__03692);
            rule__SteadyState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__1_in_rule__SteadyState__Group__03695);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1808:1: rule__SteadyState__Group__0__Impl : ( 'S' ) ;
    public final void rule__SteadyState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1812:1: ( ( 'S' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1813:1: ( 'S' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1813:1: ( 'S' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1814:1: 'S'
            {
             before(grammarAccess.getSteadyStateAccess().getSKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__SteadyState__Group__0__Impl3723); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1827:1: rule__SteadyState__Group__1 : rule__SteadyState__Group__1__Impl rule__SteadyState__Group__2 ;
    public final void rule__SteadyState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1831:1: ( rule__SteadyState__Group__1__Impl rule__SteadyState__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1832:2: rule__SteadyState__Group__1__Impl rule__SteadyState__Group__2
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__1__Impl_in_rule__SteadyState__Group__13754);
            rule__SteadyState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__2_in_rule__SteadyState__Group__13757);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1839:1: rule__SteadyState__Group__1__Impl : ( ( rule__SteadyState__Alternatives_1 ) ) ;
    public final void rule__SteadyState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1843:1: ( ( ( rule__SteadyState__Alternatives_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1844:1: ( ( rule__SteadyState__Alternatives_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1844:1: ( ( rule__SteadyState__Alternatives_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1845:1: ( rule__SteadyState__Alternatives_1 )
            {
             before(grammarAccess.getSteadyStateAccess().getAlternatives_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1846:1: ( rule__SteadyState__Alternatives_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1846:2: rule__SteadyState__Alternatives_1
            {
            pushFollow(FOLLOW_rule__SteadyState__Alternatives_1_in_rule__SteadyState__Group__1__Impl3784);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1856:1: rule__SteadyState__Group__2 : rule__SteadyState__Group__2__Impl rule__SteadyState__Group__3 ;
    public final void rule__SteadyState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1860:1: ( rule__SteadyState__Group__2__Impl rule__SteadyState__Group__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1861:2: rule__SteadyState__Group__2__Impl rule__SteadyState__Group__3
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__2__Impl_in_rule__SteadyState__Group__23814);
            rule__SteadyState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__3_in_rule__SteadyState__Group__23817);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1868:1: rule__SteadyState__Group__2__Impl : ( '[' ) ;
    public final void rule__SteadyState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1872:1: ( ( '[' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1873:1: ( '[' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1873:1: ( '[' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1874:1: '['
            {
             before(grammarAccess.getSteadyStateAccess().getLeftSquareBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__SteadyState__Group__2__Impl3845); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1887:1: rule__SteadyState__Group__3 : rule__SteadyState__Group__3__Impl rule__SteadyState__Group__4 ;
    public final void rule__SteadyState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1891:1: ( rule__SteadyState__Group__3__Impl rule__SteadyState__Group__4 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1892:2: rule__SteadyState__Group__3__Impl rule__SteadyState__Group__4
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__3__Impl_in_rule__SteadyState__Group__33876);
            rule__SteadyState__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__4_in_rule__SteadyState__Group__33879);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1899:1: rule__SteadyState__Group__3__Impl : ( ruleStateFormula ) ;
    public final void rule__SteadyState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1903:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1904:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1904:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1905:1: ruleStateFormula
            {
             before(grammarAccess.getSteadyStateAccess().getStateFormulaParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__SteadyState__Group__3__Impl3906);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1916:1: rule__SteadyState__Group__4 : rule__SteadyState__Group__4__Impl ;
    public final void rule__SteadyState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1920:1: ( rule__SteadyState__Group__4__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1921:2: rule__SteadyState__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__4__Impl_in_rule__SteadyState__Group__43935);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1927:1: rule__SteadyState__Group__4__Impl : ( ']' ) ;
    public final void rule__SteadyState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1931:1: ( ( ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1932:1: ( ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1932:1: ( ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1933:1: ']'
            {
             before(grammarAccess.getSteadyStateAccess().getRightSquareBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__SteadyState__Group__4__Impl3963); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1956:1: rule__QuantifiedProbability__Group__0 : rule__QuantifiedProbability__Group__0__Impl rule__QuantifiedProbability__Group__1 ;
    public final void rule__QuantifiedProbability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1960:1: ( rule__QuantifiedProbability__Group__0__Impl rule__QuantifiedProbability__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1961:2: rule__QuantifiedProbability__Group__0__Impl rule__QuantifiedProbability__Group__1
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__0__Impl_in_rule__QuantifiedProbability__Group__04004);
            rule__QuantifiedProbability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__1_in_rule__QuantifiedProbability__Group__04007);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1968:1: rule__QuantifiedProbability__Group__0__Impl : ( ( rule__QuantifiedProbability__Group_0__0 ) ) ;
    public final void rule__QuantifiedProbability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1972:1: ( ( ( rule__QuantifiedProbability__Group_0__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1973:1: ( ( rule__QuantifiedProbability__Group_0__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1973:1: ( ( rule__QuantifiedProbability__Group_0__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1974:1: ( rule__QuantifiedProbability__Group_0__0 )
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getGroup_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1975:1: ( rule__QuantifiedProbability__Group_0__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1975:2: rule__QuantifiedProbability__Group_0__0
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group_0__0_in_rule__QuantifiedProbability__Group__0__Impl4034);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1985:1: rule__QuantifiedProbability__Group__1 : rule__QuantifiedProbability__Group__1__Impl rule__QuantifiedProbability__Group__2 ;
    public final void rule__QuantifiedProbability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1989:1: ( rule__QuantifiedProbability__Group__1__Impl rule__QuantifiedProbability__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1990:2: rule__QuantifiedProbability__Group__1__Impl rule__QuantifiedProbability__Group__2
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__1__Impl_in_rule__QuantifiedProbability__Group__14064);
            rule__QuantifiedProbability__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__2_in_rule__QuantifiedProbability__Group__14067);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1997:1: rule__QuantifiedProbability__Group__1__Impl : ( '[' ) ;
    public final void rule__QuantifiedProbability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2001:1: ( ( '[' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2002:1: ( '[' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2002:1: ( '[' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2003:1: '['
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getLeftSquareBracketKeyword_1()); 
            match(input,26,FOLLOW_26_in_rule__QuantifiedProbability__Group__1__Impl4095); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2016:1: rule__QuantifiedProbability__Group__2 : rule__QuantifiedProbability__Group__2__Impl rule__QuantifiedProbability__Group__3 ;
    public final void rule__QuantifiedProbability__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2020:1: ( rule__QuantifiedProbability__Group__2__Impl rule__QuantifiedProbability__Group__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2021:2: rule__QuantifiedProbability__Group__2__Impl rule__QuantifiedProbability__Group__3
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__2__Impl_in_rule__QuantifiedProbability__Group__24126);
            rule__QuantifiedProbability__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__3_in_rule__QuantifiedProbability__Group__24129);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2028:1: rule__QuantifiedProbability__Group__2__Impl : ( rulePathFormula ) ;
    public final void rule__QuantifiedProbability__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2032:1: ( ( rulePathFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2033:1: ( rulePathFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2033:1: ( rulePathFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2034:1: rulePathFormula
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getPathFormulaParserRuleCall_2()); 
            pushFollow(FOLLOW_rulePathFormula_in_rule__QuantifiedProbability__Group__2__Impl4156);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2045:1: rule__QuantifiedProbability__Group__3 : rule__QuantifiedProbability__Group__3__Impl ;
    public final void rule__QuantifiedProbability__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2049:1: ( rule__QuantifiedProbability__Group__3__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2050:2: rule__QuantifiedProbability__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__3__Impl_in_rule__QuantifiedProbability__Group__34185);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2056:1: rule__QuantifiedProbability__Group__3__Impl : ( ']' ) ;
    public final void rule__QuantifiedProbability__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2060:1: ( ( ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2061:1: ( ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2061:1: ( ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2062:1: ']'
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getRightSquareBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__QuantifiedProbability__Group__3__Impl4213); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2083:1: rule__QuantifiedProbability__Group_0__0 : rule__QuantifiedProbability__Group_0__0__Impl rule__QuantifiedProbability__Group_0__1 ;
    public final void rule__QuantifiedProbability__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2087:1: ( rule__QuantifiedProbability__Group_0__0__Impl rule__QuantifiedProbability__Group_0__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2088:2: rule__QuantifiedProbability__Group_0__0__Impl rule__QuantifiedProbability__Group_0__1
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group_0__0__Impl_in_rule__QuantifiedProbability__Group_0__04252);
            rule__QuantifiedProbability__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedProbability__Group_0__1_in_rule__QuantifiedProbability__Group_0__04255);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2095:1: rule__QuantifiedProbability__Group_0__0__Impl : ( 'P' ) ;
    public final void rule__QuantifiedProbability__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2099:1: ( ( 'P' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2100:1: ( 'P' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2100:1: ( 'P' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2101:1: 'P'
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getPKeyword_0_0()); 
            match(input,28,FOLLOW_28_in_rule__QuantifiedProbability__Group_0__0__Impl4283); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2114:1: rule__QuantifiedProbability__Group_0__1 : rule__QuantifiedProbability__Group_0__1__Impl ;
    public final void rule__QuantifiedProbability__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2118:1: ( rule__QuantifiedProbability__Group_0__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2119:2: rule__QuantifiedProbability__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group_0__1__Impl_in_rule__QuantifiedProbability__Group_0__14314);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2125:1: rule__QuantifiedProbability__Group_0__1__Impl : ( '=?' ) ;
    public final void rule__QuantifiedProbability__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2129:1: ( ( '=?' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2130:1: ( '=?' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2130:1: ( '=?' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2131:1: '=?'
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getEqualsSignQuestionMarkKeyword_0_1()); 
            match(input,13,FOLLOW_13_in_rule__QuantifiedProbability__Group_0__1__Impl4342); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2148:1: rule__Probability__Group__0 : rule__Probability__Group__0__Impl rule__Probability__Group__1 ;
    public final void rule__Probability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2152:1: ( rule__Probability__Group__0__Impl rule__Probability__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2153:2: rule__Probability__Group__0__Impl rule__Probability__Group__1
            {
            pushFollow(FOLLOW_rule__Probability__Group__0__Impl_in_rule__Probability__Group__04377);
            rule__Probability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__1_in_rule__Probability__Group__04380);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2160:1: rule__Probability__Group__0__Impl : ( 'P' ) ;
    public final void rule__Probability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2164:1: ( ( 'P' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2165:1: ( 'P' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2165:1: ( 'P' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2166:1: 'P'
            {
             before(grammarAccess.getProbabilityAccess().getPKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Probability__Group__0__Impl4408); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2179:1: rule__Probability__Group__1 : rule__Probability__Group__1__Impl rule__Probability__Group__2 ;
    public final void rule__Probability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2183:1: ( rule__Probability__Group__1__Impl rule__Probability__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2184:2: rule__Probability__Group__1__Impl rule__Probability__Group__2
            {
            pushFollow(FOLLOW_rule__Probability__Group__1__Impl_in_rule__Probability__Group__14439);
            rule__Probability__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__2_in_rule__Probability__Group__14442);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2191:1: rule__Probability__Group__1__Impl : ( ruleCompareProbability ) ;
    public final void rule__Probability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2195:1: ( ( ruleCompareProbability ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2196:1: ( ruleCompareProbability )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2196:1: ( ruleCompareProbability )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2197:1: ruleCompareProbability
            {
             before(grammarAccess.getProbabilityAccess().getCompareProbabilityParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleCompareProbability_in_rule__Probability__Group__1__Impl4469);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2208:1: rule__Probability__Group__2 : rule__Probability__Group__2__Impl rule__Probability__Group__3 ;
    public final void rule__Probability__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2212:1: ( rule__Probability__Group__2__Impl rule__Probability__Group__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2213:2: rule__Probability__Group__2__Impl rule__Probability__Group__3
            {
            pushFollow(FOLLOW_rule__Probability__Group__2__Impl_in_rule__Probability__Group__24498);
            rule__Probability__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__3_in_rule__Probability__Group__24501);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2220:1: rule__Probability__Group__2__Impl : ( '[' ) ;
    public final void rule__Probability__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2224:1: ( ( '[' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2225:1: ( '[' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2225:1: ( '[' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2226:1: '['
            {
             before(grammarAccess.getProbabilityAccess().getLeftSquareBracketKeyword_2()); 
            match(input,26,FOLLOW_26_in_rule__Probability__Group__2__Impl4529); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2239:1: rule__Probability__Group__3 : rule__Probability__Group__3__Impl rule__Probability__Group__4 ;
    public final void rule__Probability__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2243:1: ( rule__Probability__Group__3__Impl rule__Probability__Group__4 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2244:2: rule__Probability__Group__3__Impl rule__Probability__Group__4
            {
            pushFollow(FOLLOW_rule__Probability__Group__3__Impl_in_rule__Probability__Group__34560);
            rule__Probability__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__4_in_rule__Probability__Group__34563);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2251:1: rule__Probability__Group__3__Impl : ( rulePathFormula ) ;
    public final void rule__Probability__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2255:1: ( ( rulePathFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2256:1: ( rulePathFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2256:1: ( rulePathFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2257:1: rulePathFormula
            {
             before(grammarAccess.getProbabilityAccess().getPathFormulaParserRuleCall_3()); 
            pushFollow(FOLLOW_rulePathFormula_in_rule__Probability__Group__3__Impl4590);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2268:1: rule__Probability__Group__4 : rule__Probability__Group__4__Impl ;
    public final void rule__Probability__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2272:1: ( rule__Probability__Group__4__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2273:2: rule__Probability__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Probability__Group__4__Impl_in_rule__Probability__Group__44619);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2279:1: rule__Probability__Group__4__Impl : ( ']' ) ;
    public final void rule__Probability__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2283:1: ( ( ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2284:1: ( ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2284:1: ( ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2285:1: ']'
            {
             before(grammarAccess.getProbabilityAccess().getRightSquareBracketKeyword_4()); 
            match(input,27,FOLLOW_27_in_rule__Probability__Group__4__Impl4647); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2308:1: rule__Until__Group__0 : rule__Until__Group__0__Impl rule__Until__Group__1 ;
    public final void rule__Until__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2312:1: ( rule__Until__Group__0__Impl rule__Until__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2313:2: rule__Until__Group__0__Impl rule__Until__Group__1
            {
            pushFollow(FOLLOW_rule__Until__Group__0__Impl_in_rule__Until__Group__04688);
            rule__Until__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Until__Group__1_in_rule__Until__Group__04691);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2320:1: rule__Until__Group__0__Impl : ( ( rule__Until__LeftAssignment_0 ) ) ;
    public final void rule__Until__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2324:1: ( ( ( rule__Until__LeftAssignment_0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2325:1: ( ( rule__Until__LeftAssignment_0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2325:1: ( ( rule__Until__LeftAssignment_0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2326:1: ( rule__Until__LeftAssignment_0 )
            {
             before(grammarAccess.getUntilAccess().getLeftAssignment_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2327:1: ( rule__Until__LeftAssignment_0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2327:2: rule__Until__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__Until__LeftAssignment_0_in_rule__Until__Group__0__Impl4718);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2337:1: rule__Until__Group__1 : rule__Until__Group__1__Impl rule__Until__Group__2 ;
    public final void rule__Until__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2341:1: ( rule__Until__Group__1__Impl rule__Until__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2342:2: rule__Until__Group__1__Impl rule__Until__Group__2
            {
            pushFollow(FOLLOW_rule__Until__Group__1__Impl_in_rule__Until__Group__14748);
            rule__Until__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Until__Group__2_in_rule__Until__Group__14751);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2349:1: rule__Until__Group__1__Impl : ( ( rule__Until__Alternatives_1 ) ) ;
    public final void rule__Until__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2353:1: ( ( ( rule__Until__Alternatives_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2354:1: ( ( rule__Until__Alternatives_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2354:1: ( ( rule__Until__Alternatives_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2355:1: ( rule__Until__Alternatives_1 )
            {
             before(grammarAccess.getUntilAccess().getAlternatives_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2356:1: ( rule__Until__Alternatives_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2356:2: rule__Until__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Until__Alternatives_1_in_rule__Until__Group__1__Impl4778);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2366:1: rule__Until__Group__2 : rule__Until__Group__2__Impl rule__Until__Group__3 ;
    public final void rule__Until__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2370:1: ( rule__Until__Group__2__Impl rule__Until__Group__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2371:2: rule__Until__Group__2__Impl rule__Until__Group__3
            {
            pushFollow(FOLLOW_rule__Until__Group__2__Impl_in_rule__Until__Group__24808);
            rule__Until__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Until__Group__3_in_rule__Until__Group__24811);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2378:1: rule__Until__Group__2__Impl : ( ( ruleTimeBound )? ) ;
    public final void rule__Until__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2382:1: ( ( ( ruleTimeBound )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2383:1: ( ( ruleTimeBound )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2383:1: ( ( ruleTimeBound )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2384:1: ( ruleTimeBound )?
            {
             before(grammarAccess.getUntilAccess().getTimeBoundParserRuleCall_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2385:1: ( ruleTimeBound )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17||LA17_0==26||(LA17_0>=33 && LA17_0<=34)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2385:3: ruleTimeBound
                    {
                    pushFollow(FOLLOW_ruleTimeBound_in_rule__Until__Group__2__Impl4839);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2395:1: rule__Until__Group__3 : rule__Until__Group__3__Impl ;
    public final void rule__Until__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2399:1: ( rule__Until__Group__3__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2400:2: rule__Until__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Until__Group__3__Impl_in_rule__Until__Group__34870);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2406:1: rule__Until__Group__3__Impl : ( ( rule__Until__RightAssignment_3 ) ) ;
    public final void rule__Until__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2410:1: ( ( ( rule__Until__RightAssignment_3 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2411:1: ( ( rule__Until__RightAssignment_3 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2411:1: ( ( rule__Until__RightAssignment_3 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2412:1: ( rule__Until__RightAssignment_3 )
            {
             before(grammarAccess.getUntilAccess().getRightAssignment_3()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2413:1: ( rule__Until__RightAssignment_3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2413:2: rule__Until__RightAssignment_3
            {
            pushFollow(FOLLOW_rule__Until__RightAssignment_3_in_rule__Until__Group__3__Impl4897);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2431:1: rule__Next__Group__0 : rule__Next__Group__0__Impl rule__Next__Group__1 ;
    public final void rule__Next__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2435:1: ( rule__Next__Group__0__Impl rule__Next__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2436:2: rule__Next__Group__0__Impl rule__Next__Group__1
            {
            pushFollow(FOLLOW_rule__Next__Group__0__Impl_in_rule__Next__Group__04935);
            rule__Next__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Next__Group__1_in_rule__Next__Group__04938);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2443:1: rule__Next__Group__0__Impl : ( 'X' ) ;
    public final void rule__Next__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2447:1: ( ( 'X' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2448:1: ( 'X' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2448:1: ( 'X' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2449:1: 'X'
            {
             before(grammarAccess.getNextAccess().getXKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Next__Group__0__Impl4966); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2462:1: rule__Next__Group__1 : rule__Next__Group__1__Impl rule__Next__Group__2 ;
    public final void rule__Next__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2466:1: ( rule__Next__Group__1__Impl rule__Next__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2467:2: rule__Next__Group__1__Impl rule__Next__Group__2
            {
            pushFollow(FOLLOW_rule__Next__Group__1__Impl_in_rule__Next__Group__14997);
            rule__Next__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Next__Group__2_in_rule__Next__Group__15000);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2474:1: rule__Next__Group__1__Impl : ( ( ruleTimeBound )? ) ;
    public final void rule__Next__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2478:1: ( ( ( ruleTimeBound )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2479:1: ( ( ruleTimeBound )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2479:1: ( ( ruleTimeBound )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2480:1: ( ruleTimeBound )?
            {
             before(grammarAccess.getNextAccess().getTimeBoundParserRuleCall_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2481:1: ( ruleTimeBound )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17||LA18_0==26||(LA18_0>=33 && LA18_0<=34)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2481:3: ruleTimeBound
                    {
                    pushFollow(FOLLOW_ruleTimeBound_in_rule__Next__Group__1__Impl5028);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2491:1: rule__Next__Group__2 : rule__Next__Group__2__Impl ;
    public final void rule__Next__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2495:1: ( rule__Next__Group__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2496:2: rule__Next__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Next__Group__2__Impl_in_rule__Next__Group__25059);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2502:1: rule__Next__Group__2__Impl : ( ( rule__Next__RightAssignment_2 ) ) ;
    public final void rule__Next__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2506:1: ( ( ( rule__Next__RightAssignment_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2507:1: ( ( rule__Next__RightAssignment_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2507:1: ( ( rule__Next__RightAssignment_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2508:1: ( rule__Next__RightAssignment_2 )
            {
             before(grammarAccess.getNextAccess().getRightAssignment_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2509:1: ( rule__Next__RightAssignment_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2509:2: rule__Next__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__Next__RightAssignment_2_in_rule__Next__Group__2__Impl5086);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2525:1: rule__Future__Group__0 : rule__Future__Group__0__Impl rule__Future__Group__1 ;
    public final void rule__Future__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2529:1: ( rule__Future__Group__0__Impl rule__Future__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2530:2: rule__Future__Group__0__Impl rule__Future__Group__1
            {
            pushFollow(FOLLOW_rule__Future__Group__0__Impl_in_rule__Future__Group__05122);
            rule__Future__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Future__Group__1_in_rule__Future__Group__05125);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2537:1: rule__Future__Group__0__Impl : ( 'F' ) ;
    public final void rule__Future__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2541:1: ( ( 'F' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2542:1: ( 'F' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2542:1: ( 'F' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2543:1: 'F'
            {
             before(grammarAccess.getFutureAccess().getFKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Future__Group__0__Impl5153); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2556:1: rule__Future__Group__1 : rule__Future__Group__1__Impl rule__Future__Group__2 ;
    public final void rule__Future__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2560:1: ( rule__Future__Group__1__Impl rule__Future__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2561:2: rule__Future__Group__1__Impl rule__Future__Group__2
            {
            pushFollow(FOLLOW_rule__Future__Group__1__Impl_in_rule__Future__Group__15184);
            rule__Future__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Future__Group__2_in_rule__Future__Group__15187);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2568:1: rule__Future__Group__1__Impl : ( ( ruleTimeBound )? ) ;
    public final void rule__Future__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2572:1: ( ( ( ruleTimeBound )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2573:1: ( ( ruleTimeBound )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2573:1: ( ( ruleTimeBound )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2574:1: ( ruleTimeBound )?
            {
             before(grammarAccess.getFutureAccess().getTimeBoundParserRuleCall_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2575:1: ( ruleTimeBound )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17||LA19_0==26||(LA19_0>=33 && LA19_0<=34)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2575:3: ruleTimeBound
                    {
                    pushFollow(FOLLOW_ruleTimeBound_in_rule__Future__Group__1__Impl5215);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2585:1: rule__Future__Group__2 : rule__Future__Group__2__Impl ;
    public final void rule__Future__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2589:1: ( rule__Future__Group__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2590:2: rule__Future__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Future__Group__2__Impl_in_rule__Future__Group__25246);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2596:1: rule__Future__Group__2__Impl : ( ( rule__Future__RightAssignment_2 ) ) ;
    public final void rule__Future__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2600:1: ( ( ( rule__Future__RightAssignment_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2601:1: ( ( rule__Future__RightAssignment_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2601:1: ( ( rule__Future__RightAssignment_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2602:1: ( rule__Future__RightAssignment_2 )
            {
             before(grammarAccess.getFutureAccess().getRightAssignment_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2603:1: ( rule__Future__RightAssignment_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2603:2: rule__Future__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__Future__RightAssignment_2_in_rule__Future__Group__2__Impl5273);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2619:1: rule__Globally__Group__0 : rule__Globally__Group__0__Impl rule__Globally__Group__1 ;
    public final void rule__Globally__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2623:1: ( rule__Globally__Group__0__Impl rule__Globally__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2624:2: rule__Globally__Group__0__Impl rule__Globally__Group__1
            {
            pushFollow(FOLLOW_rule__Globally__Group__0__Impl_in_rule__Globally__Group__05309);
            rule__Globally__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Globally__Group__1_in_rule__Globally__Group__05312);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2631:1: rule__Globally__Group__0__Impl : ( 'G' ) ;
    public final void rule__Globally__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2635:1: ( ( 'G' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2636:1: ( 'G' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2636:1: ( 'G' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2637:1: 'G'
            {
             before(grammarAccess.getGloballyAccess().getGKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Globally__Group__0__Impl5340); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2650:1: rule__Globally__Group__1 : rule__Globally__Group__1__Impl rule__Globally__Group__2 ;
    public final void rule__Globally__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2654:1: ( rule__Globally__Group__1__Impl rule__Globally__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2655:2: rule__Globally__Group__1__Impl rule__Globally__Group__2
            {
            pushFollow(FOLLOW_rule__Globally__Group__1__Impl_in_rule__Globally__Group__15371);
            rule__Globally__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Globally__Group__2_in_rule__Globally__Group__15374);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2662:1: rule__Globally__Group__1__Impl : ( ( ruleTimeBound )? ) ;
    public final void rule__Globally__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2666:1: ( ( ( ruleTimeBound )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2667:1: ( ( ruleTimeBound )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2667:1: ( ( ruleTimeBound )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2668:1: ( ruleTimeBound )?
            {
             before(grammarAccess.getGloballyAccess().getTimeBoundParserRuleCall_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2669:1: ( ruleTimeBound )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17||LA20_0==26||(LA20_0>=33 && LA20_0<=34)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2669:3: ruleTimeBound
                    {
                    pushFollow(FOLLOW_ruleTimeBound_in_rule__Globally__Group__1__Impl5402);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2679:1: rule__Globally__Group__2 : rule__Globally__Group__2__Impl ;
    public final void rule__Globally__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2683:1: ( rule__Globally__Group__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2684:2: rule__Globally__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Globally__Group__2__Impl_in_rule__Globally__Group__25433);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2690:1: rule__Globally__Group__2__Impl : ( ( rule__Globally__RightAssignment_2 ) ) ;
    public final void rule__Globally__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2694:1: ( ( ( rule__Globally__RightAssignment_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2695:1: ( ( rule__Globally__RightAssignment_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2695:1: ( ( rule__Globally__RightAssignment_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2696:1: ( rule__Globally__RightAssignment_2 )
            {
             before(grammarAccess.getGloballyAccess().getRightAssignment_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2697:1: ( rule__Globally__RightAssignment_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2697:2: rule__Globally__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__Globally__RightAssignment_2_in_rule__Globally__Group__2__Impl5460);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2713:1: rule__Implication__Group__0 : rule__Implication__Group__0__Impl rule__Implication__Group__1 ;
    public final void rule__Implication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2717:1: ( rule__Implication__Group__0__Impl rule__Implication__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2718:2: rule__Implication__Group__0__Impl rule__Implication__Group__1
            {
            pushFollow(FOLLOW_rule__Implication__Group__0__Impl_in_rule__Implication__Group__05496);
            rule__Implication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Implication__Group__1_in_rule__Implication__Group__05499);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2725:1: rule__Implication__Group__0__Impl : ( '=>' ) ;
    public final void rule__Implication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2729:1: ( ( '=>' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2730:1: ( '=>' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2730:1: ( '=>' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2731:1: '=>'
            {
             before(grammarAccess.getImplicationAccess().getEqualsSignGreaterThanSignKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Implication__Group__0__Impl5527); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2744:1: rule__Implication__Group__1 : rule__Implication__Group__1__Impl ;
    public final void rule__Implication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2748:1: ( rule__Implication__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2749:2: rule__Implication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Implication__Group__1__Impl_in_rule__Implication__Group__15558);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2755:1: rule__Implication__Group__1__Impl : ( ( rule__Implication__RightAssignment_1 ) ) ;
    public final void rule__Implication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2759:1: ( ( ( rule__Implication__RightAssignment_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2760:1: ( ( rule__Implication__RightAssignment_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2760:1: ( ( rule__Implication__RightAssignment_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2761:1: ( rule__Implication__RightAssignment_1 )
            {
             before(grammarAccess.getImplicationAccess().getRightAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2762:1: ( rule__Implication__RightAssignment_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2762:2: rule__Implication__RightAssignment_1
            {
            pushFollow(FOLLOW_rule__Implication__RightAssignment_1_in_rule__Implication__Group__1__Impl5585);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2776:1: rule__CompareProbability__Group__0 : rule__CompareProbability__Group__0__Impl rule__CompareProbability__Group__1 ;
    public final void rule__CompareProbability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2780:1: ( rule__CompareProbability__Group__0__Impl rule__CompareProbability__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2781:2: rule__CompareProbability__Group__0__Impl rule__CompareProbability__Group__1
            {
            pushFollow(FOLLOW_rule__CompareProbability__Group__0__Impl_in_rule__CompareProbability__Group__05619);
            rule__CompareProbability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareProbability__Group__1_in_rule__CompareProbability__Group__05622);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2788:1: rule__CompareProbability__Group__0__Impl : ( ( rule__CompareProbability__Alternatives_0 ) ) ;
    public final void rule__CompareProbability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2792:1: ( ( ( rule__CompareProbability__Alternatives_0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2793:1: ( ( rule__CompareProbability__Alternatives_0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2793:1: ( ( rule__CompareProbability__Alternatives_0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2794:1: ( rule__CompareProbability__Alternatives_0 )
            {
             before(grammarAccess.getCompareProbabilityAccess().getAlternatives_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2795:1: ( rule__CompareProbability__Alternatives_0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2795:2: rule__CompareProbability__Alternatives_0
            {
            pushFollow(FOLLOW_rule__CompareProbability__Alternatives_0_in_rule__CompareProbability__Group__0__Impl5649);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2805:1: rule__CompareProbability__Group__1 : rule__CompareProbability__Group__1__Impl ;
    public final void rule__CompareProbability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2809:1: ( rule__CompareProbability__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2810:2: rule__CompareProbability__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareProbability__Group__1__Impl_in_rule__CompareProbability__Group__15679);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2816:1: rule__CompareProbability__Group__1__Impl : ( RULE_DECIMAL ) ;
    public final void rule__CompareProbability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2820:1: ( ( RULE_DECIMAL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2821:1: ( RULE_DECIMAL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2821:1: ( RULE_DECIMAL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2822:1: RULE_DECIMAL
            {
             before(grammarAccess.getCompareProbabilityAccess().getDECIMALTerminalRuleCall_1()); 
            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__CompareProbability__Group__1__Impl5706); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2837:1: rule__CompareProbability__Group_0_0__0 : rule__CompareProbability__Group_0_0__0__Impl rule__CompareProbability__Group_0_0__1 ;
    public final void rule__CompareProbability__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2841:1: ( rule__CompareProbability__Group_0_0__0__Impl rule__CompareProbability__Group_0_0__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2842:2: rule__CompareProbability__Group_0_0__0__Impl rule__CompareProbability__Group_0_0__1
            {
            pushFollow(FOLLOW_rule__CompareProbability__Group_0_0__0__Impl_in_rule__CompareProbability__Group_0_0__05739);
            rule__CompareProbability__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareProbability__Group_0_0__1_in_rule__CompareProbability__Group_0_0__05742);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2849:1: rule__CompareProbability__Group_0_0__0__Impl : ( '>' ) ;
    public final void rule__CompareProbability__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2853:1: ( ( '>' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2854:1: ( '>' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2854:1: ( '>' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2855:1: '>'
            {
             before(grammarAccess.getCompareProbabilityAccess().getGreaterThanSignKeyword_0_0_0()); 
            match(input,33,FOLLOW_33_in_rule__CompareProbability__Group_0_0__0__Impl5770); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2868:1: rule__CompareProbability__Group_0_0__1 : rule__CompareProbability__Group_0_0__1__Impl ;
    public final void rule__CompareProbability__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2872:1: ( rule__CompareProbability__Group_0_0__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2873:2: rule__CompareProbability__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareProbability__Group_0_0__1__Impl_in_rule__CompareProbability__Group_0_0__15801);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2879:1: rule__CompareProbability__Group_0_0__1__Impl : ( ( '=' )? ) ;
    public final void rule__CompareProbability__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2883:1: ( ( ( '=' )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2884:1: ( ( '=' )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2884:1: ( ( '=' )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2885:1: ( '=' )?
            {
             before(grammarAccess.getCompareProbabilityAccess().getEqualsSignKeyword_0_0_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2886:1: ( '=' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2887:2: '='
                    {
                    match(input,17,FOLLOW_17_in_rule__CompareProbability__Group_0_0__1__Impl5830); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2902:1: rule__CompareProbability__Group_0_1__0 : rule__CompareProbability__Group_0_1__0__Impl rule__CompareProbability__Group_0_1__1 ;
    public final void rule__CompareProbability__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2906:1: ( rule__CompareProbability__Group_0_1__0__Impl rule__CompareProbability__Group_0_1__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2907:2: rule__CompareProbability__Group_0_1__0__Impl rule__CompareProbability__Group_0_1__1
            {
            pushFollow(FOLLOW_rule__CompareProbability__Group_0_1__0__Impl_in_rule__CompareProbability__Group_0_1__05867);
            rule__CompareProbability__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareProbability__Group_0_1__1_in_rule__CompareProbability__Group_0_1__05870);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2914:1: rule__CompareProbability__Group_0_1__0__Impl : ( '<' ) ;
    public final void rule__CompareProbability__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2918:1: ( ( '<' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2919:1: ( '<' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2919:1: ( '<' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2920:1: '<'
            {
             before(grammarAccess.getCompareProbabilityAccess().getLessThanSignKeyword_0_1_0()); 
            match(input,34,FOLLOW_34_in_rule__CompareProbability__Group_0_1__0__Impl5898); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2933:1: rule__CompareProbability__Group_0_1__1 : rule__CompareProbability__Group_0_1__1__Impl ;
    public final void rule__CompareProbability__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2937:1: ( rule__CompareProbability__Group_0_1__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2938:2: rule__CompareProbability__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareProbability__Group_0_1__1__Impl_in_rule__CompareProbability__Group_0_1__15929);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2944:1: rule__CompareProbability__Group_0_1__1__Impl : ( ( '=' )? ) ;
    public final void rule__CompareProbability__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2948:1: ( ( ( '=' )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2949:1: ( ( '=' )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2949:1: ( ( '=' )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2950:1: ( '=' )?
            {
             before(grammarAccess.getCompareProbabilityAccess().getEqualsSignKeyword_0_1_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2951:1: ( '=' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2952:2: '='
                    {
                    match(input,17,FOLLOW_17_in_rule__CompareProbability__Group_0_1__1__Impl5958); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2967:1: rule__TimeBound__Group_0__0 : rule__TimeBound__Group_0__0__Impl rule__TimeBound__Group_0__1 ;
    public final void rule__TimeBound__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2971:1: ( rule__TimeBound__Group_0__0__Impl rule__TimeBound__Group_0__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2972:2: rule__TimeBound__Group_0__0__Impl rule__TimeBound__Group_0__1
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_0__0__Impl_in_rule__TimeBound__Group_0__05995);
            rule__TimeBound__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_0__1_in_rule__TimeBound__Group_0__05998);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2979:1: rule__TimeBound__Group_0__0__Impl : ( ( rule__TimeBound__Alternatives_0_0 ) ) ;
    public final void rule__TimeBound__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2983:1: ( ( ( rule__TimeBound__Alternatives_0_0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2984:1: ( ( rule__TimeBound__Alternatives_0_0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2984:1: ( ( rule__TimeBound__Alternatives_0_0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2985:1: ( rule__TimeBound__Alternatives_0_0 )
            {
             before(grammarAccess.getTimeBoundAccess().getAlternatives_0_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2986:1: ( rule__TimeBound__Alternatives_0_0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2986:2: rule__TimeBound__Alternatives_0_0
            {
            pushFollow(FOLLOW_rule__TimeBound__Alternatives_0_0_in_rule__TimeBound__Group_0__0__Impl6025);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2996:1: rule__TimeBound__Group_0__1 : rule__TimeBound__Group_0__1__Impl ;
    public final void rule__TimeBound__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3000:1: ( rule__TimeBound__Group_0__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3001:2: rule__TimeBound__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_0__1__Impl_in_rule__TimeBound__Group_0__16055);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3007:1: rule__TimeBound__Group_0__1__Impl : ( RULE_DECIMAL ) ;
    public final void rule__TimeBound__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3011:1: ( ( RULE_DECIMAL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3012:1: ( RULE_DECIMAL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3012:1: ( RULE_DECIMAL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3013:1: RULE_DECIMAL
            {
             before(grammarAccess.getTimeBoundAccess().getDECIMALTerminalRuleCall_0_1()); 
            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__TimeBound__Group_0__1__Impl6082); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3028:1: rule__TimeBound__Group_0_0_0__0 : rule__TimeBound__Group_0_0_0__0__Impl rule__TimeBound__Group_0_0_0__1 ;
    public final void rule__TimeBound__Group_0_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3032:1: ( rule__TimeBound__Group_0_0_0__0__Impl rule__TimeBound__Group_0_0_0__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3033:2: rule__TimeBound__Group_0_0_0__0__Impl rule__TimeBound__Group_0_0_0__1
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_0_0_0__0__Impl_in_rule__TimeBound__Group_0_0_0__06115);
            rule__TimeBound__Group_0_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_0_0_0__1_in_rule__TimeBound__Group_0_0_0__06118);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3040:1: rule__TimeBound__Group_0_0_0__0__Impl : ( '>' ) ;
    public final void rule__TimeBound__Group_0_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3044:1: ( ( '>' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3045:1: ( '>' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3045:1: ( '>' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3046:1: '>'
            {
             before(grammarAccess.getTimeBoundAccess().getGreaterThanSignKeyword_0_0_0_0()); 
            match(input,33,FOLLOW_33_in_rule__TimeBound__Group_0_0_0__0__Impl6146); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3059:1: rule__TimeBound__Group_0_0_0__1 : rule__TimeBound__Group_0_0_0__1__Impl ;
    public final void rule__TimeBound__Group_0_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3063:1: ( rule__TimeBound__Group_0_0_0__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3064:2: rule__TimeBound__Group_0_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_0_0_0__1__Impl_in_rule__TimeBound__Group_0_0_0__16177);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3070:1: rule__TimeBound__Group_0_0_0__1__Impl : ( ( '=' )? ) ;
    public final void rule__TimeBound__Group_0_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3074:1: ( ( ( '=' )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3075:1: ( ( '=' )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3075:1: ( ( '=' )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3076:1: ( '=' )?
            {
             before(grammarAccess.getTimeBoundAccess().getEqualsSignKeyword_0_0_0_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3077:1: ( '=' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3078:2: '='
                    {
                    match(input,17,FOLLOW_17_in_rule__TimeBound__Group_0_0_0__1__Impl6206); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3093:1: rule__TimeBound__Group_0_0_1__0 : rule__TimeBound__Group_0_0_1__0__Impl rule__TimeBound__Group_0_0_1__1 ;
    public final void rule__TimeBound__Group_0_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3097:1: ( rule__TimeBound__Group_0_0_1__0__Impl rule__TimeBound__Group_0_0_1__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3098:2: rule__TimeBound__Group_0_0_1__0__Impl rule__TimeBound__Group_0_0_1__1
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_0_0_1__0__Impl_in_rule__TimeBound__Group_0_0_1__06243);
            rule__TimeBound__Group_0_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_0_0_1__1_in_rule__TimeBound__Group_0_0_1__06246);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3105:1: rule__TimeBound__Group_0_0_1__0__Impl : ( '<' ) ;
    public final void rule__TimeBound__Group_0_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3109:1: ( ( '<' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3110:1: ( '<' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3110:1: ( '<' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3111:1: '<'
            {
             before(grammarAccess.getTimeBoundAccess().getLessThanSignKeyword_0_0_1_0()); 
            match(input,34,FOLLOW_34_in_rule__TimeBound__Group_0_0_1__0__Impl6274); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3124:1: rule__TimeBound__Group_0_0_1__1 : rule__TimeBound__Group_0_0_1__1__Impl ;
    public final void rule__TimeBound__Group_0_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3128:1: ( rule__TimeBound__Group_0_0_1__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3129:2: rule__TimeBound__Group_0_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_0_0_1__1__Impl_in_rule__TimeBound__Group_0_0_1__16305);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3135:1: rule__TimeBound__Group_0_0_1__1__Impl : ( ( '=' )? ) ;
    public final void rule__TimeBound__Group_0_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3139:1: ( ( ( '=' )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3140:1: ( ( '=' )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3140:1: ( ( '=' )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3141:1: ( '=' )?
            {
             before(grammarAccess.getTimeBoundAccess().getEqualsSignKeyword_0_0_1_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3142:1: ( '=' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3143:2: '='
                    {
                    match(input,17,FOLLOW_17_in_rule__TimeBound__Group_0_0_1__1__Impl6334); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3158:1: rule__TimeBound__Group_1__0 : rule__TimeBound__Group_1__0__Impl rule__TimeBound__Group_1__1 ;
    public final void rule__TimeBound__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3162:1: ( rule__TimeBound__Group_1__0__Impl rule__TimeBound__Group_1__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3163:2: rule__TimeBound__Group_1__0__Impl rule__TimeBound__Group_1__1
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__0__Impl_in_rule__TimeBound__Group_1__06371);
            rule__TimeBound__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_1__1_in_rule__TimeBound__Group_1__06374);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3170:1: rule__TimeBound__Group_1__0__Impl : ( '[' ) ;
    public final void rule__TimeBound__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3174:1: ( ( '[' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3175:1: ( '[' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3175:1: ( '[' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3176:1: '['
            {
             before(grammarAccess.getTimeBoundAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__TimeBound__Group_1__0__Impl6402); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3189:1: rule__TimeBound__Group_1__1 : rule__TimeBound__Group_1__1__Impl rule__TimeBound__Group_1__2 ;
    public final void rule__TimeBound__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3193:1: ( rule__TimeBound__Group_1__1__Impl rule__TimeBound__Group_1__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3194:2: rule__TimeBound__Group_1__1__Impl rule__TimeBound__Group_1__2
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__1__Impl_in_rule__TimeBound__Group_1__16433);
            rule__TimeBound__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_1__2_in_rule__TimeBound__Group_1__16436);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3201:1: rule__TimeBound__Group_1__1__Impl : ( RULE_DECIMAL ) ;
    public final void rule__TimeBound__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3205:1: ( ( RULE_DECIMAL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3206:1: ( RULE_DECIMAL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3206:1: ( RULE_DECIMAL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3207:1: RULE_DECIMAL
            {
             before(grammarAccess.getTimeBoundAccess().getDECIMALTerminalRuleCall_1_1()); 
            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__TimeBound__Group_1__1__Impl6463); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3218:1: rule__TimeBound__Group_1__2 : rule__TimeBound__Group_1__2__Impl rule__TimeBound__Group_1__3 ;
    public final void rule__TimeBound__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3222:1: ( rule__TimeBound__Group_1__2__Impl rule__TimeBound__Group_1__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3223:2: rule__TimeBound__Group_1__2__Impl rule__TimeBound__Group_1__3
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__2__Impl_in_rule__TimeBound__Group_1__26492);
            rule__TimeBound__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_1__3_in_rule__TimeBound__Group_1__26495);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3230:1: rule__TimeBound__Group_1__2__Impl : ( ',' ) ;
    public final void rule__TimeBound__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3234:1: ( ( ',' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3235:1: ( ',' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3235:1: ( ',' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3236:1: ','
            {
             before(grammarAccess.getTimeBoundAccess().getCommaKeyword_1_2()); 
            match(input,35,FOLLOW_35_in_rule__TimeBound__Group_1__2__Impl6523); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3249:1: rule__TimeBound__Group_1__3 : rule__TimeBound__Group_1__3__Impl rule__TimeBound__Group_1__4 ;
    public final void rule__TimeBound__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3253:1: ( rule__TimeBound__Group_1__3__Impl rule__TimeBound__Group_1__4 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3254:2: rule__TimeBound__Group_1__3__Impl rule__TimeBound__Group_1__4
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__3__Impl_in_rule__TimeBound__Group_1__36554);
            rule__TimeBound__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_1__4_in_rule__TimeBound__Group_1__36557);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3261:1: rule__TimeBound__Group_1__3__Impl : ( RULE_DECIMAL ) ;
    public final void rule__TimeBound__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3265:1: ( ( RULE_DECIMAL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3266:1: ( RULE_DECIMAL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3266:1: ( RULE_DECIMAL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3267:1: RULE_DECIMAL
            {
             before(grammarAccess.getTimeBoundAccess().getDECIMALTerminalRuleCall_1_3()); 
            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__TimeBound__Group_1__3__Impl6584); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3278:1: rule__TimeBound__Group_1__4 : rule__TimeBound__Group_1__4__Impl ;
    public final void rule__TimeBound__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3282:1: ( rule__TimeBound__Group_1__4__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3283:2: rule__TimeBound__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__4__Impl_in_rule__TimeBound__Group_1__46613);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3289:1: rule__TimeBound__Group_1__4__Impl : ( ']' ) ;
    public final void rule__TimeBound__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3293:1: ( ( ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3294:1: ( ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3294:1: ( ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3295:1: ']'
            {
             before(grammarAccess.getTimeBoundAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,27,FOLLOW_27_in_rule__TimeBound__Group_1__4__Impl6641); 
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


    // $ANTLR start "rule__Start__StartAssignment_0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3319:1: rule__Start__StartAssignment_0 : ( ruleCommentedRule ) ;
    public final void rule__Start__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3323:1: ( ( ruleCommentedRule ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3324:1: ( ruleCommentedRule )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3324:1: ( ruleCommentedRule )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3325:1: ruleCommentedRule
            {
             before(grammarAccess.getStartAccess().getStartCommentedRuleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleCommentedRule_in_rule__Start__StartAssignment_06687);
            ruleCommentedRule();

            state._fsp--;

             after(grammarAccess.getStartAccess().getStartCommentedRuleParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Start__StartAssignment_0"


    // $ANTLR start "rule__Start__StartAssignment_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3334:1: rule__Start__StartAssignment_1 : ( ruleStart ) ;
    public final void rule__Start__StartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3338:1: ( ( ruleStart ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3339:1: ( ruleStart )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3339:1: ( ruleStart )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3340:1: ruleStart
            {
             before(grammarAccess.getStartAccess().getStartStartParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStart_in_rule__Start__StartAssignment_16718);
            ruleStart();

            state._fsp--;

             after(grammarAccess.getStartAccess().getStartStartParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Start__StartAssignment_1"


    // $ANTLR start "rule__CommentedRule__CommentAssignment_0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3349:1: rule__CommentedRule__CommentAssignment_0 : ( RULE_SL_COMMENT ) ;
    public final void rule__CommentedRule__CommentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3353:1: ( ( RULE_SL_COMMENT ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3354:1: ( RULE_SL_COMMENT )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3354:1: ( RULE_SL_COMMENT )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3355:1: RULE_SL_COMMENT
            {
             before(grammarAccess.getCommentedRuleAccess().getCommentSL_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__CommentedRule__CommentAssignment_06749); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3364:1: rule__CommentedRule__RuleAssignment_1 : ( rulePctl ) ;
    public final void rule__CommentedRule__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3368:1: ( ( rulePctl ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3369:1: ( rulePctl )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3369:1: ( rulePctl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3370:1: rulePctl
            {
             before(grammarAccess.getCommentedRuleAccess().getRulePctlParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePctl_in_rule__CommentedRule__RuleAssignment_16780);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3379:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3383:1: ( ( RULE_ID ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3384:1: ( RULE_ID )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3384:1: ( RULE_ID )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3385:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_16811); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3394:1: rule__Label__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Label__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3398:1: ( ( RULE_ID ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3399:1: ( RULE_ID )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3399:1: ( RULE_ID )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3400:1: RULE_ID
            {
             before(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Label__NameAssignment_16842); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3409:1: rule__Conjunction__RightAssignment_2_2 : ( ruleStateFormula ) ;
    public final void rule__Conjunction__RightAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3413:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3414:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3414:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3415:1: ruleStateFormula
            {
             before(grammarAccess.getConjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Conjunction__RightAssignment_2_26873);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3424:1: rule__Disjunction__RightAssignment_2_2 : ( ruleStateFormula ) ;
    public final void rule__Disjunction__RightAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3428:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3429:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3429:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3430:1: ruleStateFormula
            {
             before(grammarAccess.getDisjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Disjunction__RightAssignment_2_26904);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3439:1: rule__StateFormula__LeftAssignment_0_1 : ( ruleStateFormula ) ;
    public final void rule__StateFormula__LeftAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3443:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3444:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3444:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3445:1: ruleStateFormula
            {
             before(grammarAccess.getStateFormulaAccess().getLeftStateFormulaParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__StateFormula__LeftAssignment_0_16935);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3454:1: rule__StateFormula__RightAssignment_0_2_0 : ( ruleJunction ) ;
    public final void rule__StateFormula__RightAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3458:1: ( ( ruleJunction ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3459:1: ( ruleJunction )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3459:1: ( ruleJunction )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3460:1: ruleJunction
            {
             before(grammarAccess.getStateFormulaAccess().getRightJunctionParserRuleCall_0_2_0_0()); 
            pushFollow(FOLLOW_ruleJunction_in_rule__StateFormula__RightAssignment_0_2_06966);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3469:1: rule__StateFormula__RightAssignment_0_2_1 : ( ruleImplication ) ;
    public final void rule__StateFormula__RightAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3473:1: ( ( ruleImplication ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3474:1: ( ruleImplication )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3474:1: ( ruleImplication )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3475:1: ruleImplication
            {
             before(grammarAccess.getStateFormulaAccess().getRightImplicationParserRuleCall_0_2_1_0()); 
            pushFollow(FOLLOW_ruleImplication_in_rule__StateFormula__RightAssignment_0_2_16997);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3484:1: rule__StateFormula__LeftAssignment_3 : ( ruleProbability ) ;
    public final void rule__StateFormula__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3488:1: ( ( ruleProbability ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3489:1: ( ruleProbability )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3489:1: ( ruleProbability )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3490:1: ruleProbability
            {
             before(grammarAccess.getStateFormulaAccess().getLeftProbabilityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleProbability_in_rule__StateFormula__LeftAssignment_37028);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3499:1: rule__Until__LeftAssignment_0 : ( ruleStateFormula ) ;
    public final void rule__Until__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3503:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3504:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3504:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3505:1: ruleStateFormula
            {
             before(grammarAccess.getUntilAccess().getLeftStateFormulaParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Until__LeftAssignment_07059);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3514:1: rule__Until__RightAssignment_3 : ( ruleStateFormula ) ;
    public final void rule__Until__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3518:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3519:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3519:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3520:1: ruleStateFormula
            {
             before(grammarAccess.getUntilAccess().getRightStateFormulaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Until__RightAssignment_37090);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3529:1: rule__Next__RightAssignment_2 : ( ruleStateFormula ) ;
    public final void rule__Next__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3533:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3534:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3534:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3535:1: ruleStateFormula
            {
             before(grammarAccess.getNextAccess().getRightStateFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Next__RightAssignment_27121);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3544:1: rule__Future__RightAssignment_2 : ( ruleStateFormula ) ;
    public final void rule__Future__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3548:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3549:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3549:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3550:1: ruleStateFormula
            {
             before(grammarAccess.getFutureAccess().getRightStateFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Future__RightAssignment_27152);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3559:1: rule__Globally__RightAssignment_2 : ( ruleStateFormula ) ;
    public final void rule__Globally__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3563:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3564:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3564:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3565:1: ruleStateFormula
            {
             before(grammarAccess.getGloballyAccess().getRightStateFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Globally__RightAssignment_27183);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3574:1: rule__Implication__RightAssignment_1 : ( ruleStateFormula ) ;
    public final void rule__Implication__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3578:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3579:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3579:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3580:1: ruleStateFormula
            {
             before(grammarAccess.getImplicationAccess().getRightStateFormulaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Implication__RightAssignment_17214);
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
    public static final BitSet FOLLOW_rule__Start__Group__0_in_ruleStart94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentedRule_in_entryRuleCommentedRule121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentedRule128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommentedRule__Group__0_in_ruleCommentedRule154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePctl_in_entryRulePctl181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePctl188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pctl__Alternatives_in_rulePctl214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0_in_ruleLabel334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__0_in_ruleNegation454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJunction_in_entryRuleJunction481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJunction488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Junction__Alternatives_in_ruleJunction514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__0_in_ruleConjunction574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__0_in_ruleDisjunction634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_entryRuleStateFormula661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateFormula668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Alternatives_in_ruleStateFormula694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathFormula_in_entryRulePathFormula721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathFormula728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathFormula__Alternatives_in_rulePathFormula754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSteadyState_in_entryRuleSteadyState781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSteadyState788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__0_in_ruleSteadyState814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedProbability_in_entryRuleQuantifiedProbability841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifiedProbability848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__0_in_ruleQuantifiedProbability874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbability_in_entryRuleProbability901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProbability908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__0_in_ruleProbability934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUntil_in_entryRuleUntil961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUntil968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Group__0_in_ruleUntil994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNext_in_entryRuleNext1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNext1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__Group__0_in_ruleNext1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuture_in_entryRuleFuture1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuture1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__Group__0_in_ruleFuture1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobally_in_entryRuleGlobally1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobally1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__Group__0_in_ruleGlobally1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group__0_in_ruleImplication1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_entryRuleCompareProbability1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareProbability1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group__0_in_ruleCompareProbability1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_entryRuleTimeBound1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeBound1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Alternatives_in_ruleTimeBound1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Pctl__Alternatives1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSteadyState_in_rule__Pctl__Alternatives1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedProbability_in_rule__Pctl__Alternatives1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Atomic__Alternatives1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__Atomic__Alternatives1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__Atomic__Alternatives1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Junction__Alternatives1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_rule__Junction__Alternatives1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__0_in_rule__StateFormula__Alternatives1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_rule__StateFormula__Alternatives1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__StateFormula__Alternatives1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__LeftAssignment_3_in_rule__StateFormula__Alternatives1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__RightAssignment_0_2_0_in_rule__StateFormula__Alternatives_0_21656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__RightAssignment_0_2_1_in_rule__StateFormula__Alternatives_0_21674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNext_in_rule__PathFormula__Alternatives1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUntil_in_rule__PathFormula__Alternatives1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuture_in_rule__PathFormula__Alternatives1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobally_in_rule__PathFormula__Alternatives1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_rule__SteadyState__Alternatives_11790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__SteadyState__Alternatives_11808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Until__Alternatives_11843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Until__Alternatives_11863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Until__Alternatives_11883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group_0_0__0_in_rule__CompareProbability__Alternatives_01917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group_0_1__0_in_rule__CompareProbability__Alternatives_01935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0__0_in_rule__TimeBound__Alternatives1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__0_in_rule__TimeBound__Alternatives1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0_0_0__0_in_rule__TimeBound__Alternatives_0_02019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0_0_1__0_in_rule__TimeBound__Alternatives_0_02037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TimeBound__Alternatives_0_02056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Start__Group__0__Impl_in_rule__Start__Group__02088 = new BitSet(new long[]{0x00000000129C0050L});
    public static final BitSet FOLLOW_rule__Start__Group__1_in_rule__Start__Group__02091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Start__StartAssignment_0_in_rule__Start__Group__0__Impl2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Start__Group__1__Impl_in_rule__Start__Group__12148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Start__StartAssignment_1_in_rule__Start__Group__1__Impl2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommentedRule__Group__0__Impl_in_rule__CommentedRule__Group__02210 = new BitSet(new long[]{0x00000000129C0050L});
    public static final BitSet FOLLOW_rule__CommentedRule__Group__1_in_rule__CommentedRule__Group__02213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommentedRule__CommentAssignment_0_in_rule__CommentedRule__Group__0__Impl2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommentedRule__Group__1__Impl_in_rule__CommentedRule__Group__12271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommentedRule__RuleAssignment_1_in_rule__CommentedRule__Group__1__Impl2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__02332 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__02335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__State__Group__0__Impl2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__12394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__02455 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Label__Group__1_in_rule__Label__Group__02458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Label__Group__0__Impl2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__12517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__NameAssignment_1_in_rule__Label__Group__1__Impl2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__0__Impl_in_rule__Negation__Group__02578 = new BitSet(new long[]{0x00000000109C0010L});
    public static final BitSet FOLLOW_rule__Negation__Group__1_in_rule__Negation__Group__02581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Negation__Group__0__Impl2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__1__Impl_in_rule__Negation__Group__12640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Negation__Group__1__Impl2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__02700 = new BitSet(new long[]{0x00000000109C0010L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__02703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Conjunction__Group__0__Impl2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__12762 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__2_in_rule__Conjunction__Group__12765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Conjunction__Group__1__Impl2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__2__Impl_in_rule__Conjunction__Group__22821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__0_in_rule__Conjunction__Group__2__Impl2848 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__0__Impl_in_rule__Conjunction__Group_2__02885 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__1_in_rule__Conjunction__Group_2__02888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__1__Impl_in_rule__Conjunction__Group_2__12946 = new BitSet(new long[]{0x00000000109C0010L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__2_in_rule__Conjunction__Group_2__12949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Conjunction__Group_2__1__Impl2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__2__Impl_in_rule__Conjunction__Group_2__23008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__RightAssignment_2_2_in_rule__Conjunction__Group_2__2__Impl3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__0__Impl_in_rule__Disjunction__Group__03071 = new BitSet(new long[]{0x00000000109C0010L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__1_in_rule__Disjunction__Group__03074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Disjunction__Group__0__Impl3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__1__Impl_in_rule__Disjunction__Group__13133 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__2_in_rule__Disjunction__Group__13136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Disjunction__Group__1__Impl3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__2__Impl_in_rule__Disjunction__Group__23192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__0_in_rule__Disjunction__Group__2__Impl3219 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__0__Impl_in_rule__Disjunction__Group_2__03256 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__1_in_rule__Disjunction__Group_2__03259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__1__Impl_in_rule__Disjunction__Group_2__13317 = new BitSet(new long[]{0x00000000109C0010L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__2_in_rule__Disjunction__Group_2__13320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Disjunction__Group_2__1__Impl3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__2__Impl_in_rule__Disjunction__Group_2__23379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__RightAssignment_2_2_in_rule__Disjunction__Group_2__2__Impl3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__0__Impl_in_rule__StateFormula__Group_0__03442 = new BitSet(new long[]{0x00000000109C0010L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__1_in_rule__StateFormula__Group_0__03445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__StateFormula__Group_0__0__Impl3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__1__Impl_in_rule__StateFormula__Group_0__13504 = new BitSet(new long[]{0x0000000101600000L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__2_in_rule__StateFormula__Group_0__13507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__LeftAssignment_0_1_in_rule__StateFormula__Group_0__1__Impl3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__2__Impl_in_rule__StateFormula__Group_0__23564 = new BitSet(new long[]{0x0000000101600000L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__3_in_rule__StateFormula__Group_0__23567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Alternatives_0_2_in_rule__StateFormula__Group_0__2__Impl3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__3__Impl_in_rule__StateFormula__Group_0__33625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__StateFormula__Group_0__3__Impl3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__0__Impl_in_rule__SteadyState__Group__03692 = new BitSet(new long[]{0x0000000600002000L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__1_in_rule__SteadyState__Group__03695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SteadyState__Group__0__Impl3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__1__Impl_in_rule__SteadyState__Group__13754 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__2_in_rule__SteadyState__Group__13757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Alternatives_1_in_rule__SteadyState__Group__1__Impl3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__2__Impl_in_rule__SteadyState__Group__23814 = new BitSet(new long[]{0x00000000109C0010L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__3_in_rule__SteadyState__Group__23817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SteadyState__Group__2__Impl3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__3__Impl_in_rule__SteadyState__Group__33876 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__4_in_rule__SteadyState__Group__33879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__SteadyState__Group__3__Impl3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__4__Impl_in_rule__SteadyState__Group__43935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SteadyState__Group__4__Impl3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__0__Impl_in_rule__QuantifiedProbability__Group__04004 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__1_in_rule__QuantifiedProbability__Group__04007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group_0__0_in_rule__QuantifiedProbability__Group__0__Impl4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__1__Impl_in_rule__QuantifiedProbability__Group__14064 = new BitSet(new long[]{0x00000000F09C0010L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__2_in_rule__QuantifiedProbability__Group__14067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__QuantifiedProbability__Group__1__Impl4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__2__Impl_in_rule__QuantifiedProbability__Group__24126 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__3_in_rule__QuantifiedProbability__Group__24129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathFormula_in_rule__QuantifiedProbability__Group__2__Impl4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__3__Impl_in_rule__QuantifiedProbability__Group__34185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__QuantifiedProbability__Group__3__Impl4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group_0__0__Impl_in_rule__QuantifiedProbability__Group_0__04252 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group_0__1_in_rule__QuantifiedProbability__Group_0__04255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__QuantifiedProbability__Group_0__0__Impl4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group_0__1__Impl_in_rule__QuantifiedProbability__Group_0__14314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__QuantifiedProbability__Group_0__1__Impl4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__0__Impl_in_rule__Probability__Group__04377 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_rule__Probability__Group__1_in_rule__Probability__Group__04380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Probability__Group__0__Impl4408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__1__Impl_in_rule__Probability__Group__14439 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Probability__Group__2_in_rule__Probability__Group__14442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_rule__Probability__Group__1__Impl4469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__2__Impl_in_rule__Probability__Group__24498 = new BitSet(new long[]{0x00000000F09C0010L});
    public static final BitSet FOLLOW_rule__Probability__Group__3_in_rule__Probability__Group__24501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Probability__Group__2__Impl4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__3__Impl_in_rule__Probability__Group__34560 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Probability__Group__4_in_rule__Probability__Group__34563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathFormula_in_rule__Probability__Group__3__Impl4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__4__Impl_in_rule__Probability__Group__44619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Probability__Group__4__Impl4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Group__0__Impl_in_rule__Until__Group__04688 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_rule__Until__Group__1_in_rule__Until__Group__04691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__LeftAssignment_0_in_rule__Until__Group__0__Impl4718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Group__1__Impl_in_rule__Until__Group__14748 = new BitSet(new long[]{0x00000006149E0010L});
    public static final BitSet FOLLOW_rule__Until__Group__2_in_rule__Until__Group__14751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Alternatives_1_in_rule__Until__Group__1__Impl4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Group__2__Impl_in_rule__Until__Group__24808 = new BitSet(new long[]{0x00000006149E0010L});
    public static final BitSet FOLLOW_rule__Until__Group__3_in_rule__Until__Group__24811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_rule__Until__Group__2__Impl4839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Group__3__Impl_in_rule__Until__Group__34870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__RightAssignment_3_in_rule__Until__Group__3__Impl4897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__Group__0__Impl_in_rule__Next__Group__04935 = new BitSet(new long[]{0x00000006149E0010L});
    public static final BitSet FOLLOW_rule__Next__Group__1_in_rule__Next__Group__04938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Next__Group__0__Impl4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__Group__1__Impl_in_rule__Next__Group__14997 = new BitSet(new long[]{0x00000006149E0010L});
    public static final BitSet FOLLOW_rule__Next__Group__2_in_rule__Next__Group__15000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_rule__Next__Group__1__Impl5028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__Group__2__Impl_in_rule__Next__Group__25059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__RightAssignment_2_in_rule__Next__Group__2__Impl5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__Group__0__Impl_in_rule__Future__Group__05122 = new BitSet(new long[]{0x00000006149E0010L});
    public static final BitSet FOLLOW_rule__Future__Group__1_in_rule__Future__Group__05125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Future__Group__0__Impl5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__Group__1__Impl_in_rule__Future__Group__15184 = new BitSet(new long[]{0x00000006149E0010L});
    public static final BitSet FOLLOW_rule__Future__Group__2_in_rule__Future__Group__15187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_rule__Future__Group__1__Impl5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__Group__2__Impl_in_rule__Future__Group__25246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__RightAssignment_2_in_rule__Future__Group__2__Impl5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__Group__0__Impl_in_rule__Globally__Group__05309 = new BitSet(new long[]{0x00000006149E0010L});
    public static final BitSet FOLLOW_rule__Globally__Group__1_in_rule__Globally__Group__05312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Globally__Group__0__Impl5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__Group__1__Impl_in_rule__Globally__Group__15371 = new BitSet(new long[]{0x00000006149E0010L});
    public static final BitSet FOLLOW_rule__Globally__Group__2_in_rule__Globally__Group__15374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_rule__Globally__Group__1__Impl5402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__Group__2__Impl_in_rule__Globally__Group__25433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__RightAssignment_2_in_rule__Globally__Group__2__Impl5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group__0__Impl_in_rule__Implication__Group__05496 = new BitSet(new long[]{0x00000000109C0010L});
    public static final BitSet FOLLOW_rule__Implication__Group__1_in_rule__Implication__Group__05499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Implication__Group__0__Impl5527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group__1__Impl_in_rule__Implication__Group__15558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__RightAssignment_1_in_rule__Implication__Group__1__Impl5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group__0__Impl_in_rule__CompareProbability__Group__05619 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group__1_in_rule__CompareProbability__Group__05622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Alternatives_0_in_rule__CompareProbability__Group__0__Impl5649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group__1__Impl_in_rule__CompareProbability__Group__15679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__CompareProbability__Group__1__Impl5706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group_0_0__0__Impl_in_rule__CompareProbability__Group_0_0__05739 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group_0_0__1_in_rule__CompareProbability__Group_0_0__05742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__CompareProbability__Group_0_0__0__Impl5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group_0_0__1__Impl_in_rule__CompareProbability__Group_0_0__15801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CompareProbability__Group_0_0__1__Impl5830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group_0_1__0__Impl_in_rule__CompareProbability__Group_0_1__05867 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group_0_1__1_in_rule__CompareProbability__Group_0_1__05870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__CompareProbability__Group_0_1__0__Impl5898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group_0_1__1__Impl_in_rule__CompareProbability__Group_0_1__15929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__CompareProbability__Group_0_1__1__Impl5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0__0__Impl_in_rule__TimeBound__Group_0__05995 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0__1_in_rule__TimeBound__Group_0__05998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Alternatives_0_0_in_rule__TimeBound__Group_0__0__Impl6025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0__1__Impl_in_rule__TimeBound__Group_0__16055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__TimeBound__Group_0__1__Impl6082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0_0_0__0__Impl_in_rule__TimeBound__Group_0_0_0__06115 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0_0_0__1_in_rule__TimeBound__Group_0_0_0__06118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TimeBound__Group_0_0_0__0__Impl6146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0_0_0__1__Impl_in_rule__TimeBound__Group_0_0_0__16177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TimeBound__Group_0_0_0__1__Impl6206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0_0_1__0__Impl_in_rule__TimeBound__Group_0_0_1__06243 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0_0_1__1_in_rule__TimeBound__Group_0_0_1__06246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TimeBound__Group_0_0_1__0__Impl6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0_0_1__1__Impl_in_rule__TimeBound__Group_0_0_1__16305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TimeBound__Group_0_0_1__1__Impl6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__0__Impl_in_rule__TimeBound__Group_1__06371 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__1_in_rule__TimeBound__Group_1__06374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TimeBound__Group_1__0__Impl6402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__1__Impl_in_rule__TimeBound__Group_1__16433 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__2_in_rule__TimeBound__Group_1__16436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__TimeBound__Group_1__1__Impl6463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__2__Impl_in_rule__TimeBound__Group_1__26492 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__3_in_rule__TimeBound__Group_1__26495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__TimeBound__Group_1__2__Impl6523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__3__Impl_in_rule__TimeBound__Group_1__36554 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__4_in_rule__TimeBound__Group_1__36557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__TimeBound__Group_1__3__Impl6584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__4__Impl_in_rule__TimeBound__Group_1__46613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TimeBound__Group_1__4__Impl6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentedRule_in_rule__Start__StartAssignment_06687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStart_in_rule__Start__StartAssignment_16718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__CommentedRule__CommentAssignment_06749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePctl_in_rule__CommentedRule__RuleAssignment_16780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_16811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Label__NameAssignment_16842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Conjunction__RightAssignment_2_26873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Disjunction__RightAssignment_2_26904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__StateFormula__LeftAssignment_0_16935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJunction_in_rule__StateFormula__RightAssignment_0_2_06966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_rule__StateFormula__RightAssignment_0_2_16997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbability_in_rule__StateFormula__LeftAssignment_37028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Until__LeftAssignment_07059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Until__RightAssignment_37090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Next__RightAssignment_27121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Future__RightAssignment_27152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Globally__RightAssignment_27183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Implication__RightAssignment_17214 = new BitSet(new long[]{0x0000000000000002L});

}