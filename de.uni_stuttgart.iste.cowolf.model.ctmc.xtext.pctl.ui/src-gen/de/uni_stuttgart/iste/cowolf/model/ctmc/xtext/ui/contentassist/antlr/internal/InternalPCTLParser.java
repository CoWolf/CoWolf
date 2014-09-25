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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMPARATOR", "RULE_SL_COMMENT", "RULE_STRING", "RULE_BOOL", "RULE_DOUBLE", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=?'", "'U'", "'W'", "'R'", "'='", "'S'", "'['", "']'", "'P'", "'('", "')'", "'!'", "'&'", "'|'", "'=>'", "'State:'", "'Label:'", "'X'", "'F'", "'G'", "','"
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
    public static final int RULE_BOOL=7;
    public static final int RULE_SL_COMMENT=5;
    public static final int EOF=-1;
    public static final int RULE_DOUBLE=8;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_COMPARATOR=4;
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


    // $ANTLR start "entryRuleFragment"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:88:1: entryRuleFragment : ruleFragment EOF ;
    public final void entryRuleFragment() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:89:1: ( ruleFragment EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:90:1: ruleFragment EOF
            {
             before(grammarAccess.getFragmentRule()); 
            pushFollow(FOLLOW_ruleFragment_in_entryRuleFragment121);
            ruleFragment();

            state._fsp--;

             after(grammarAccess.getFragmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFragment128); 

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
    // $ANTLR end "entryRuleFragment"


    // $ANTLR start "ruleFragment"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:97:1: ruleFragment : ( ( rule__Fragment__Alternatives ) ) ;
    public final void ruleFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:101:2: ( ( ( rule__Fragment__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:102:1: ( ( rule__Fragment__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:102:1: ( ( rule__Fragment__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:103:1: ( rule__Fragment__Alternatives )
            {
             before(grammarAccess.getFragmentAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:104:1: ( rule__Fragment__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:104:2: rule__Fragment__Alternatives
            {
            pushFollow(FOLLOW_rule__Fragment__Alternatives_in_ruleFragment154);
            rule__Fragment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFragment"


    // $ANTLR start "entryRuleComment"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:116:1: entryRuleComment : ruleComment EOF ;
    public final void entryRuleComment() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:117:1: ( ruleComment EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:118:1: ruleComment EOF
            {
             before(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment181);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getCommentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment188); 

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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:125:1: ruleComment : ( ( rule__Comment__CommentAssignment ) ) ;
    public final void ruleComment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:129:2: ( ( ( rule__Comment__CommentAssignment ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:130:1: ( ( rule__Comment__CommentAssignment ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:130:1: ( ( rule__Comment__CommentAssignment ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:131:1: ( rule__Comment__CommentAssignment )
            {
             before(grammarAccess.getCommentAccess().getCommentAssignment()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:132:1: ( rule__Comment__CommentAssignment )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:132:2: rule__Comment__CommentAssignment
            {
            pushFollow(FOLLOW_rule__Comment__CommentAssignment_in_ruleComment214);
            rule__Comment__CommentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCommentAccess().getCommentAssignment()); 

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleRule"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:144:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:148:1: ( ruleRule EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:149:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule246);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule253); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:159:1: ruleRule : ( ( rule__Rule__Alternatives ) ) ;
    public final void ruleRule() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:164:2: ( ( ( rule__Rule__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:165:1: ( ( rule__Rule__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:165:1: ( ( rule__Rule__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:166:1: ( rule__Rule__Alternatives )
            {
             before(grammarAccess.getRuleAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:167:1: ( rule__Rule__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:167:2: rule__Rule__Alternatives
            {
            pushFollow(FOLLOW_rule__Rule__Alternatives_in_ruleRule283);
            rule__Rule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleSteadyState"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:180:1: entryRuleSteadyState : ruleSteadyState EOF ;
    public final void entryRuleSteadyState() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:181:1: ( ruleSteadyState EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:182:1: ruleSteadyState EOF
            {
             before(grammarAccess.getSteadyStateRule()); 
            pushFollow(FOLLOW_ruleSteadyState_in_entryRuleSteadyState310);
            ruleSteadyState();

            state._fsp--;

             after(grammarAccess.getSteadyStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSteadyState317); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:189:1: ruleSteadyState : ( ( rule__SteadyState__Group__0 ) ) ;
    public final void ruleSteadyState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:193:2: ( ( ( rule__SteadyState__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:194:1: ( ( rule__SteadyState__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:194:1: ( ( rule__SteadyState__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:195:1: ( rule__SteadyState__Group__0 )
            {
             before(grammarAccess.getSteadyStateAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:196:1: ( rule__SteadyState__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:196:2: rule__SteadyState__Group__0
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__0_in_ruleSteadyState343);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:208:1: entryRuleQuantifiedProbability : ruleQuantifiedProbability EOF ;
    public final void entryRuleQuantifiedProbability() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:209:1: ( ruleQuantifiedProbability EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:210:1: ruleQuantifiedProbability EOF
            {
             before(grammarAccess.getQuantifiedProbabilityRule()); 
            pushFollow(FOLLOW_ruleQuantifiedProbability_in_entryRuleQuantifiedProbability370);
            ruleQuantifiedProbability();

            state._fsp--;

             after(grammarAccess.getQuantifiedProbabilityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifiedProbability377); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:217:1: ruleQuantifiedProbability : ( ( rule__QuantifiedProbability__Group__0 ) ) ;
    public final void ruleQuantifiedProbability() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:221:2: ( ( ( rule__QuantifiedProbability__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:222:1: ( ( rule__QuantifiedProbability__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:222:1: ( ( rule__QuantifiedProbability__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:223:1: ( rule__QuantifiedProbability__Group__0 )
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:224:1: ( rule__QuantifiedProbability__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:224:2: rule__QuantifiedProbability__Group__0
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__0_in_ruleQuantifiedProbability403);
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


    // $ANTLR start "entryRuleBooleanRule"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:236:1: entryRuleBooleanRule : ruleBooleanRule EOF ;
    public final void entryRuleBooleanRule() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:237:1: ( ruleBooleanRule EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:238:1: ruleBooleanRule EOF
            {
             before(grammarAccess.getBooleanRuleRule()); 
            pushFollow(FOLLOW_ruleBooleanRule_in_entryRuleBooleanRule430);
            ruleBooleanRule();

            state._fsp--;

             after(grammarAccess.getBooleanRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanRule437); 

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
    // $ANTLR end "entryRuleBooleanRule"


    // $ANTLR start "ruleBooleanRule"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:245:1: ruleBooleanRule : ( ( rule__BooleanRule__ValueAssignment ) ) ;
    public final void ruleBooleanRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:249:2: ( ( ( rule__BooleanRule__ValueAssignment ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:250:1: ( ( rule__BooleanRule__ValueAssignment ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:250:1: ( ( rule__BooleanRule__ValueAssignment ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:251:1: ( rule__BooleanRule__ValueAssignment )
            {
             before(grammarAccess.getBooleanRuleAccess().getValueAssignment()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:252:1: ( rule__BooleanRule__ValueAssignment )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:252:2: rule__BooleanRule__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanRule__ValueAssignment_in_ruleBooleanRule463);
            rule__BooleanRule__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanRuleAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleBooleanRule"


    // $ANTLR start "entryRuleStateFormula"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:264:1: entryRuleStateFormula : ruleStateFormula EOF ;
    public final void entryRuleStateFormula() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:265:1: ( ruleStateFormula EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:266:1: ruleStateFormula EOF
            {
             before(grammarAccess.getStateFormulaRule()); 
            pushFollow(FOLLOW_ruleStateFormula_in_entryRuleStateFormula490);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getStateFormulaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateFormula497); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:273:1: ruleStateFormula : ( ( rule__StateFormula__Alternatives ) ) ;
    public final void ruleStateFormula() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:277:2: ( ( ( rule__StateFormula__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:278:1: ( ( rule__StateFormula__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:278:1: ( ( rule__StateFormula__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:279:1: ( rule__StateFormula__Alternatives )
            {
             before(grammarAccess.getStateFormulaAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:280:1: ( rule__StateFormula__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:280:2: rule__StateFormula__Alternatives
            {
            pushFollow(FOLLOW_rule__StateFormula__Alternatives_in_ruleStateFormula523);
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


    // $ANTLR start "entryRuleNegation"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:292:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:293:1: ( ruleNegation EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:294:1: ruleNegation EOF
            {
             before(grammarAccess.getNegationRule()); 
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation550);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getNegationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation557); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:301:1: ruleNegation : ( ( rule__Negation__Group__0 ) ) ;
    public final void ruleNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:305:2: ( ( ( rule__Negation__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:306:1: ( ( rule__Negation__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:306:1: ( ( rule__Negation__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:307:1: ( rule__Negation__Group__0 )
            {
             before(grammarAccess.getNegationAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:308:1: ( rule__Negation__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:308:2: rule__Negation__Group__0
            {
            pushFollow(FOLLOW_rule__Negation__Group__0_in_ruleNegation583);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:320:1: entryRuleJunction : ruleJunction EOF ;
    public final void entryRuleJunction() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:324:1: ( ruleJunction EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:325:1: ruleJunction EOF
            {
             before(grammarAccess.getJunctionRule()); 
            pushFollow(FOLLOW_ruleJunction_in_entryRuleJunction615);
            ruleJunction();

            state._fsp--;

             after(grammarAccess.getJunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJunction622); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleJunction"


    // $ANTLR start "ruleJunction"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:335:1: ruleJunction : ( ( rule__Junction__Alternatives ) ) ;
    public final void ruleJunction() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:340:2: ( ( ( rule__Junction__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:341:1: ( ( rule__Junction__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:341:1: ( ( rule__Junction__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:342:1: ( rule__Junction__Alternatives )
            {
             before(grammarAccess.getJunctionAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:343:1: ( rule__Junction__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:343:2: rule__Junction__Alternatives
            {
            pushFollow(FOLLOW_rule__Junction__Alternatives_in_ruleJunction652);
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleJunction"


    // $ANTLR start "entryRuleConjunction"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:356:1: entryRuleConjunction : ruleConjunction EOF ;
    public final void entryRuleConjunction() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:357:1: ( ruleConjunction EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:358:1: ruleConjunction EOF
            {
             before(grammarAccess.getConjunctionRule()); 
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction679);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getConjunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction686); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:365:1: ruleConjunction : ( ( rule__Conjunction__Group__0 ) ) ;
    public final void ruleConjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:369:2: ( ( ( rule__Conjunction__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:370:1: ( ( rule__Conjunction__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:370:1: ( ( rule__Conjunction__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:371:1: ( rule__Conjunction__Group__0 )
            {
             before(grammarAccess.getConjunctionAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:372:1: ( rule__Conjunction__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:372:2: rule__Conjunction__Group__0
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__0_in_ruleConjunction712);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:384:1: entryRuleDisjunction : ruleDisjunction EOF ;
    public final void entryRuleDisjunction() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:385:1: ( ruleDisjunction EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:386:1: ruleDisjunction EOF
            {
             before(grammarAccess.getDisjunctionRule()); 
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction739);
            ruleDisjunction();

            state._fsp--;

             after(grammarAccess.getDisjunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction746); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:393:1: ruleDisjunction : ( ( rule__Disjunction__Group__0 ) ) ;
    public final void ruleDisjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:397:2: ( ( ( rule__Disjunction__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:398:1: ( ( rule__Disjunction__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:398:1: ( ( rule__Disjunction__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:399:1: ( rule__Disjunction__Group__0 )
            {
             before(grammarAccess.getDisjunctionAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:400:1: ( rule__Disjunction__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:400:2: rule__Disjunction__Group__0
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__0_in_ruleDisjunction772);
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


    // $ANTLR start "entryRuleImplication"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:412:1: entryRuleImplication : ruleImplication EOF ;
    public final void entryRuleImplication() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:416:1: ( ruleImplication EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:417:1: ruleImplication EOF
            {
             before(grammarAccess.getImplicationRule()); 
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication804);
            ruleImplication();

            state._fsp--;

             after(grammarAccess.getImplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication811); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleImplication"


    // $ANTLR start "ruleImplication"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:427:1: ruleImplication : ( ( rule__Implication__Group__0 ) ) ;
    public final void ruleImplication() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:432:2: ( ( ( rule__Implication__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:433:1: ( ( rule__Implication__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:433:1: ( ( rule__Implication__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:434:1: ( rule__Implication__Group__0 )
            {
             before(grammarAccess.getImplicationAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:435:1: ( rule__Implication__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:435:2: rule__Implication__Group__0
            {
            pushFollow(FOLLOW_rule__Implication__Group__0_in_ruleImplication841);
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleImplication"


    // $ANTLR start "entryRuleProbability"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:448:1: entryRuleProbability : ruleProbability EOF ;
    public final void entryRuleProbability() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:449:1: ( ruleProbability EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:450:1: ruleProbability EOF
            {
             before(grammarAccess.getProbabilityRule()); 
            pushFollow(FOLLOW_ruleProbability_in_entryRuleProbability868);
            ruleProbability();

            state._fsp--;

             after(grammarAccess.getProbabilityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProbability875); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:457:1: ruleProbability : ( ( rule__Probability__Group__0 ) ) ;
    public final void ruleProbability() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:461:2: ( ( ( rule__Probability__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:462:1: ( ( rule__Probability__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:462:1: ( ( rule__Probability__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:463:1: ( rule__Probability__Group__0 )
            {
             before(grammarAccess.getProbabilityAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:464:1: ( rule__Probability__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:464:2: rule__Probability__Group__0
            {
            pushFollow(FOLLOW_rule__Probability__Group__0_in_ruleProbability901);
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


    // $ANTLR start "entryRuleAtomic"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:476:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:477:1: ( ruleAtomic EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:478:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic928);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic935); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:485:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:489:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:490:1: ( ( rule__Atomic__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:490:1: ( ( rule__Atomic__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:491:1: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:492:1: ( rule__Atomic__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:492:2: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic961);
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


    // $ANTLR start "entryRuleState"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:504:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:505:1: ( ruleState EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:506:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState988);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState995); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:513:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:517:2: ( ( ( rule__State__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:518:1: ( ( rule__State__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:518:1: ( ( rule__State__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:519:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:520:1: ( rule__State__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:520:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState1021);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:532:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:533:1: ( ruleLabel EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:534:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel1048);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel1055); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:541:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:545:2: ( ( ( rule__Label__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:546:1: ( ( rule__Label__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:546:1: ( ( rule__Label__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:547:1: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:548:1: ( rule__Label__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:548:2: rule__Label__Group__0
            {
            pushFollow(FOLLOW_rule__Label__Group__0_in_ruleLabel1081);
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


    // $ANTLR start "entryRuleBoolean"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:560:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:561:1: ( ruleBoolean EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:562:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean1108);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean1115); 

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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:569:1: ruleBoolean : ( ( rule__Boolean__ValueAssignment ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:573:2: ( ( ( rule__Boolean__ValueAssignment ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:574:1: ( ( rule__Boolean__ValueAssignment ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:574:1: ( ( rule__Boolean__ValueAssignment ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:575:1: ( rule__Boolean__ValueAssignment )
            {
             before(grammarAccess.getBooleanAccess().getValueAssignment()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:576:1: ( rule__Boolean__ValueAssignment )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:576:2: rule__Boolean__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Boolean__ValueAssignment_in_ruleBoolean1141);
            rule__Boolean__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRulePathFormula"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:588:1: entryRulePathFormula : rulePathFormula EOF ;
    public final void entryRulePathFormula() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:592:1: ( rulePathFormula EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:593:1: rulePathFormula EOF
            {
             before(grammarAccess.getPathFormulaRule()); 
            pushFollow(FOLLOW_rulePathFormula_in_entryRulePathFormula1173);
            rulePathFormula();

            state._fsp--;

             after(grammarAccess.getPathFormulaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathFormula1180); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRulePathFormula"


    // $ANTLR start "rulePathFormula"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:603:1: rulePathFormula : ( ( rule__PathFormula__Alternatives ) ) ;
    public final void rulePathFormula() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:608:2: ( ( ( rule__PathFormula__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:609:1: ( ( rule__PathFormula__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:609:1: ( ( rule__PathFormula__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:610:1: ( rule__PathFormula__Alternatives )
            {
             before(grammarAccess.getPathFormulaAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:611:1: ( rule__PathFormula__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:611:2: rule__PathFormula__Alternatives
            {
            pushFollow(FOLLOW_rule__PathFormula__Alternatives_in_rulePathFormula1210);
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "rulePathFormula"


    // $ANTLR start "entryRuleUntil"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:624:1: entryRuleUntil : ruleUntil EOF ;
    public final void entryRuleUntil() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:625:1: ( ruleUntil EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:626:1: ruleUntil EOF
            {
             before(grammarAccess.getUntilRule()); 
            pushFollow(FOLLOW_ruleUntil_in_entryRuleUntil1237);
            ruleUntil();

            state._fsp--;

             after(grammarAccess.getUntilRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUntil1244); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:633:1: ruleUntil : ( ( rule__Until__Group__0 ) ) ;
    public final void ruleUntil() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:637:2: ( ( ( rule__Until__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:638:1: ( ( rule__Until__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:638:1: ( ( rule__Until__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:639:1: ( rule__Until__Group__0 )
            {
             before(grammarAccess.getUntilAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:640:1: ( rule__Until__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:640:2: rule__Until__Group__0
            {
            pushFollow(FOLLOW_rule__Until__Group__0_in_ruleUntil1270);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:652:1: entryRuleNext : ruleNext EOF ;
    public final void entryRuleNext() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:653:1: ( ruleNext EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:654:1: ruleNext EOF
            {
             before(grammarAccess.getNextRule()); 
            pushFollow(FOLLOW_ruleNext_in_entryRuleNext1297);
            ruleNext();

            state._fsp--;

             after(grammarAccess.getNextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNext1304); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:661:1: ruleNext : ( ( rule__Next__Group__0 ) ) ;
    public final void ruleNext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:665:2: ( ( ( rule__Next__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:666:1: ( ( rule__Next__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:666:1: ( ( rule__Next__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:667:1: ( rule__Next__Group__0 )
            {
             before(grammarAccess.getNextAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:668:1: ( rule__Next__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:668:2: rule__Next__Group__0
            {
            pushFollow(FOLLOW_rule__Next__Group__0_in_ruleNext1330);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:680:1: entryRuleFuture : ruleFuture EOF ;
    public final void entryRuleFuture() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:681:1: ( ruleFuture EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:682:1: ruleFuture EOF
            {
             before(grammarAccess.getFutureRule()); 
            pushFollow(FOLLOW_ruleFuture_in_entryRuleFuture1357);
            ruleFuture();

            state._fsp--;

             after(grammarAccess.getFutureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuture1364); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:689:1: ruleFuture : ( ( rule__Future__Group__0 ) ) ;
    public final void ruleFuture() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:693:2: ( ( ( rule__Future__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:694:1: ( ( rule__Future__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:694:1: ( ( rule__Future__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:695:1: ( rule__Future__Group__0 )
            {
             before(grammarAccess.getFutureAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:696:1: ( rule__Future__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:696:2: rule__Future__Group__0
            {
            pushFollow(FOLLOW_rule__Future__Group__0_in_ruleFuture1390);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:708:1: entryRuleGlobally : ruleGlobally EOF ;
    public final void entryRuleGlobally() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:709:1: ( ruleGlobally EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:710:1: ruleGlobally EOF
            {
             before(grammarAccess.getGloballyRule()); 
            pushFollow(FOLLOW_ruleGlobally_in_entryRuleGlobally1417);
            ruleGlobally();

            state._fsp--;

             after(grammarAccess.getGloballyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobally1424); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:717:1: ruleGlobally : ( ( rule__Globally__Group__0 ) ) ;
    public final void ruleGlobally() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:721:2: ( ( ( rule__Globally__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:722:1: ( ( rule__Globally__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:722:1: ( ( rule__Globally__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:723:1: ( rule__Globally__Group__0 )
            {
             before(grammarAccess.getGloballyAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:724:1: ( rule__Globally__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:724:2: rule__Globally__Group__0
            {
            pushFollow(FOLLOW_rule__Globally__Group__0_in_ruleGlobally1450);
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


    // $ANTLR start "entryRuleCompareProbability"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:736:1: entryRuleCompareProbability : ruleCompareProbability EOF ;
    public final void entryRuleCompareProbability() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:740:1: ( ruleCompareProbability EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:741:1: ruleCompareProbability EOF
            {
             before(grammarAccess.getCompareProbabilityRule()); 
            pushFollow(FOLLOW_ruleCompareProbability_in_entryRuleCompareProbability1482);
            ruleCompareProbability();

            state._fsp--;

             after(grammarAccess.getCompareProbabilityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareProbability1489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleCompareProbability"


    // $ANTLR start "ruleCompareProbability"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:751:1: ruleCompareProbability : ( ( rule__CompareProbability__Group__0 ) ) ;
    public final void ruleCompareProbability() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:756:2: ( ( ( rule__CompareProbability__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:757:1: ( ( rule__CompareProbability__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:757:1: ( ( rule__CompareProbability__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:758:1: ( rule__CompareProbability__Group__0 )
            {
             before(grammarAccess.getCompareProbabilityAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:759:1: ( rule__CompareProbability__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:759:2: rule__CompareProbability__Group__0
            {
            pushFollow(FOLLOW_rule__CompareProbability__Group__0_in_ruleCompareProbability1519);
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleCompareProbability"


    // $ANTLR start "entryRuleTimeBound"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:772:1: entryRuleTimeBound : ruleTimeBound EOF ;
    public final void entryRuleTimeBound() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");

        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:776:1: ( ruleTimeBound EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:777:1: ruleTimeBound EOF
            {
             before(grammarAccess.getTimeBoundRule()); 
            pushFollow(FOLLOW_ruleTimeBound_in_entryRuleTimeBound1551);
            ruleTimeBound();

            state._fsp--;

             after(grammarAccess.getTimeBoundRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeBound1558); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleTimeBound"


    // $ANTLR start "ruleTimeBound"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:787:1: ruleTimeBound : ( ( rule__TimeBound__Alternatives ) ) ;
    public final void ruleTimeBound() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:792:2: ( ( ( rule__TimeBound__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:793:1: ( ( rule__TimeBound__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:793:1: ( ( rule__TimeBound__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:794:1: ( rule__TimeBound__Alternatives )
            {
             before(grammarAccess.getTimeBoundAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:795:1: ( rule__TimeBound__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:795:2: rule__TimeBound__Alternatives
            {
            pushFollow(FOLLOW_rule__TimeBound__Alternatives_in_ruleTimeBound1588);
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleTimeBound"


    // $ANTLR start "rule__Fragment__Alternatives"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:808:1: rule__Fragment__Alternatives : ( ( ruleComment ) | ( ruleRule ) );
    public final void rule__Fragment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:812:1: ( ( ruleComment ) | ( ruleRule ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_SL_COMMENT) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_BOOL||LA1_0==19||(LA1_0>=22 && LA1_0<=23)||LA1_0==25||(LA1_0>=29 && LA1_0<=30)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:813:1: ( ruleComment )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:813:1: ( ruleComment )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:814:1: ruleComment
                    {
                     before(grammarAccess.getFragmentAccess().getCommentParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleComment_in_rule__Fragment__Alternatives1624);
                    ruleComment();

                    state._fsp--;

                     after(grammarAccess.getFragmentAccess().getCommentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:819:6: ( ruleRule )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:819:6: ( ruleRule )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:820:1: ruleRule
                    {
                     before(grammarAccess.getFragmentAccess().getRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRule_in_rule__Fragment__Alternatives1641);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getFragmentAccess().getRuleParserRuleCall_1()); 

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
    // $ANTLR end "rule__Fragment__Alternatives"


    // $ANTLR start "rule__Rule__Alternatives"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:830:1: rule__Rule__Alternatives : ( ( ruleBooleanRule ) | ( ruleSteadyState ) | ( ruleQuantifiedProbability ) );
    public final void rule__Rule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:834:1: ( ( ruleBooleanRule ) | ( ruleSteadyState ) | ( ruleQuantifiedProbability ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:835:1: ( ruleBooleanRule )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:835:1: ( ruleBooleanRule )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:836:1: ruleBooleanRule
                    {
                     before(grammarAccess.getRuleAccess().getBooleanRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBooleanRule_in_rule__Rule__Alternatives1673);
                    ruleBooleanRule();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getBooleanRuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:841:6: ( ruleSteadyState )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:841:6: ( ruleSteadyState )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:842:1: ruleSteadyState
                    {
                     before(grammarAccess.getRuleAccess().getSteadyStateParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSteadyState_in_rule__Rule__Alternatives1690);
                    ruleSteadyState();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getSteadyStateParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:847:6: ( ruleQuantifiedProbability )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:847:6: ( ruleQuantifiedProbability )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:848:1: ruleQuantifiedProbability
                    {
                     before(grammarAccess.getRuleAccess().getQuantifiedProbabilityParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleQuantifiedProbability_in_rule__Rule__Alternatives1707);
                    ruleQuantifiedProbability();

                    state._fsp--;

                     after(grammarAccess.getRuleAccess().getQuantifiedProbabilityParserRuleCall_2()); 

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
    // $ANTLR end "rule__Rule__Alternatives"


    // $ANTLR start "rule__SteadyState__Alternatives_2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:858:1: rule__SteadyState__Alternatives_2 : ( ( ( rule__SteadyState__BoundAssignment_2_0 ) ) | ( '=?' ) );
    public final void rule__SteadyState__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:862:1: ( ( ( rule__SteadyState__BoundAssignment_2_0 ) ) | ( '=?' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_COMPARATOR) ) {
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:863:1: ( ( rule__SteadyState__BoundAssignment_2_0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:863:1: ( ( rule__SteadyState__BoundAssignment_2_0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:864:1: ( rule__SteadyState__BoundAssignment_2_0 )
                    {
                     before(grammarAccess.getSteadyStateAccess().getBoundAssignment_2_0()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:865:1: ( rule__SteadyState__BoundAssignment_2_0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:865:2: rule__SteadyState__BoundAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__SteadyState__BoundAssignment_2_0_in_rule__SteadyState__Alternatives_21739);
                    rule__SteadyState__BoundAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSteadyStateAccess().getBoundAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:869:6: ( '=?' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:869:6: ( '=?' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:870:1: '=?'
                    {
                     before(grammarAccess.getSteadyStateAccess().getEqualsSignQuestionMarkKeyword_2_1()); 
                    match(input,14,FOLLOW_14_in_rule__SteadyState__Alternatives_21758); 
                     after(grammarAccess.getSteadyStateAccess().getEqualsSignQuestionMarkKeyword_2_1()); 

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
    // $ANTLR end "rule__SteadyState__Alternatives_2"


    // $ANTLR start "rule__StateFormula__Alternatives"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:882:1: rule__StateFormula__Alternatives : ( ( ( rule__StateFormula__Group_0__0 ) ) | ( ( rule__StateFormula__LeftAssignment_1 ) ) );
    public final void rule__StateFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:886:1: ( ( ( rule__StateFormula__Group_0__0 ) ) | ( ( rule__StateFormula__LeftAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_BOOL||LA4_0==22||LA4_0==25||(LA4_0>=29 && LA4_0<=30)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:887:1: ( ( rule__StateFormula__Group_0__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:887:1: ( ( rule__StateFormula__Group_0__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:888:1: ( rule__StateFormula__Group_0__0 )
                    {
                     before(grammarAccess.getStateFormulaAccess().getGroup_0()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:889:1: ( rule__StateFormula__Group_0__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:889:2: rule__StateFormula__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__StateFormula__Group_0__0_in_rule__StateFormula__Alternatives1792);
                    rule__StateFormula__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateFormulaAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:893:6: ( ( rule__StateFormula__LeftAssignment_1 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:893:6: ( ( rule__StateFormula__LeftAssignment_1 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:894:1: ( rule__StateFormula__LeftAssignment_1 )
                    {
                     before(grammarAccess.getStateFormulaAccess().getLeftAssignment_1()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:895:1: ( rule__StateFormula__LeftAssignment_1 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:895:2: rule__StateFormula__LeftAssignment_1
                    {
                    pushFollow(FOLLOW_rule__StateFormula__LeftAssignment_1_in_rule__StateFormula__Alternatives1810);
                    rule__StateFormula__LeftAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateFormulaAccess().getLeftAssignment_1()); 

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


    // $ANTLR start "rule__StateFormula__Alternatives_0_3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:904:1: rule__StateFormula__Alternatives_0_3 : ( ( ( rule__StateFormula__RightAssignment_0_3_0 ) ) | ( ( rule__StateFormula__RightAssignment_0_3_1 ) ) );
    public final void rule__StateFormula__Alternatives_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:908:1: ( ( ( rule__StateFormula__RightAssignment_0_3_0 ) ) | ( ( rule__StateFormula__RightAssignment_0_3_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=26 && LA5_0<=27)) ) {
                alt5=1;
            }
            else if ( (LA5_0==28) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:909:1: ( ( rule__StateFormula__RightAssignment_0_3_0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:909:1: ( ( rule__StateFormula__RightAssignment_0_3_0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:910:1: ( rule__StateFormula__RightAssignment_0_3_0 )
                    {
                     before(grammarAccess.getStateFormulaAccess().getRightAssignment_0_3_0()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:911:1: ( rule__StateFormula__RightAssignment_0_3_0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:911:2: rule__StateFormula__RightAssignment_0_3_0
                    {
                    pushFollow(FOLLOW_rule__StateFormula__RightAssignment_0_3_0_in_rule__StateFormula__Alternatives_0_31843);
                    rule__StateFormula__RightAssignment_0_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateFormulaAccess().getRightAssignment_0_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:915:6: ( ( rule__StateFormula__RightAssignment_0_3_1 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:915:6: ( ( rule__StateFormula__RightAssignment_0_3_1 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:916:1: ( rule__StateFormula__RightAssignment_0_3_1 )
                    {
                     before(grammarAccess.getStateFormulaAccess().getRightAssignment_0_3_1()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:917:1: ( rule__StateFormula__RightAssignment_0_3_1 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:917:2: rule__StateFormula__RightAssignment_0_3_1
                    {
                    pushFollow(FOLLOW_rule__StateFormula__RightAssignment_0_3_1_in_rule__StateFormula__Alternatives_0_31861);
                    rule__StateFormula__RightAssignment_0_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateFormulaAccess().getRightAssignment_0_3_1()); 

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
    // $ANTLR end "rule__StateFormula__Alternatives_0_3"


    // $ANTLR start "rule__StateFormula__LeftAlternatives_1_0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:926:1: rule__StateFormula__LeftAlternatives_1_0 : ( ( ruleNegation ) | ( ruleAtomic ) | ( ruleProbability ) );
    public final void rule__StateFormula__LeftAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:930:1: ( ( ruleNegation ) | ( ruleAtomic ) | ( ruleProbability ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt6=1;
                }
                break;
            case RULE_BOOL:
            case 29:
            case 30:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:931:1: ( ruleNegation )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:931:1: ( ruleNegation )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:932:1: ruleNegation
                    {
                     before(grammarAccess.getStateFormulaAccess().getLeftNegationParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleNegation_in_rule__StateFormula__LeftAlternatives_1_01894);
                    ruleNegation();

                    state._fsp--;

                     after(grammarAccess.getStateFormulaAccess().getLeftNegationParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:937:6: ( ruleAtomic )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:937:6: ( ruleAtomic )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:938:1: ruleAtomic
                    {
                     before(grammarAccess.getStateFormulaAccess().getLeftAtomicParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_ruleAtomic_in_rule__StateFormula__LeftAlternatives_1_01911);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getStateFormulaAccess().getLeftAtomicParserRuleCall_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:943:6: ( ruleProbability )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:943:6: ( ruleProbability )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:944:1: ruleProbability
                    {
                     before(grammarAccess.getStateFormulaAccess().getLeftProbabilityParserRuleCall_1_0_2()); 
                    pushFollow(FOLLOW_ruleProbability_in_rule__StateFormula__LeftAlternatives_1_01928);
                    ruleProbability();

                    state._fsp--;

                     after(grammarAccess.getStateFormulaAccess().getLeftProbabilityParserRuleCall_1_0_2()); 

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
    // $ANTLR end "rule__StateFormula__LeftAlternatives_1_0"


    // $ANTLR start "rule__Junction__Alternatives"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:954:1: rule__Junction__Alternatives : ( ( ruleConjunction ) | ( ruleDisjunction ) );
    public final void rule__Junction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:958:1: ( ( ruleConjunction ) | ( ruleDisjunction ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            else if ( (LA7_0==27) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:959:1: ( ruleConjunction )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:959:1: ( ruleConjunction )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:960:1: ruleConjunction
                    {
                     before(grammarAccess.getJunctionAccess().getConjunctionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConjunction_in_rule__Junction__Alternatives1960);
                    ruleConjunction();

                    state._fsp--;

                     after(grammarAccess.getJunctionAccess().getConjunctionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:965:6: ( ruleDisjunction )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:965:6: ( ruleDisjunction )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:966:1: ruleDisjunction
                    {
                     before(grammarAccess.getJunctionAccess().getDisjunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDisjunction_in_rule__Junction__Alternatives1977);
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


    // $ANTLR start "rule__Atomic__Alternatives"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:976:1: rule__Atomic__Alternatives : ( ( ruleState ) | ( ruleLabel ) | ( ruleBoolean ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:980:1: ( ( ruleState ) | ( ruleLabel ) | ( ruleBoolean ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt8=1;
                }
                break;
            case 30:
                {
                alt8=2;
                }
                break;
            case RULE_BOOL:
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:981:1: ( ruleState )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:981:1: ( ruleState )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:982:1: ruleState
                    {
                     before(grammarAccess.getAtomicAccess().getStateParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleState_in_rule__Atomic__Alternatives2009);
                    ruleState();

                    state._fsp--;

                     after(grammarAccess.getAtomicAccess().getStateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:987:6: ( ruleLabel )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:987:6: ( ruleLabel )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:988:1: ruleLabel
                    {
                     before(grammarAccess.getAtomicAccess().getLabelParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLabel_in_rule__Atomic__Alternatives2026);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getAtomicAccess().getLabelParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:993:6: ( ruleBoolean )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:993:6: ( ruleBoolean )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:994:1: ruleBoolean
                    {
                     before(grammarAccess.getAtomicAccess().getBooleanParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBoolean_in_rule__Atomic__Alternatives2043);
                    ruleBoolean();

                    state._fsp--;

                     after(grammarAccess.getAtomicAccess().getBooleanParserRuleCall_2()); 

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


    // $ANTLR start "rule__PathFormula__Alternatives"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1004:1: rule__PathFormula__Alternatives : ( ( ruleNext ) | ( ruleUntil ) | ( ruleFuture ) | ( ruleGlobally ) );
    public final void rule__PathFormula__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1008:1: ( ( ruleNext ) | ( ruleUntil ) | ( ruleFuture ) | ( ruleGlobally ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt9=1;
                }
                break;
            case RULE_BOOL:
            case 22:
            case 23:
            case 25:
            case 29:
            case 30:
                {
                alt9=2;
                }
                break;
            case 32:
                {
                alt9=3;
                }
                break;
            case 33:
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1009:1: ( ruleNext )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1009:1: ( ruleNext )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1010:1: ruleNext
                    {
                     before(grammarAccess.getPathFormulaAccess().getNextParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNext_in_rule__PathFormula__Alternatives2075);
                    ruleNext();

                    state._fsp--;

                     after(grammarAccess.getPathFormulaAccess().getNextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1015:6: ( ruleUntil )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1015:6: ( ruleUntil )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1016:1: ruleUntil
                    {
                     before(grammarAccess.getPathFormulaAccess().getUntilParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUntil_in_rule__PathFormula__Alternatives2092);
                    ruleUntil();

                    state._fsp--;

                     after(grammarAccess.getPathFormulaAccess().getUntilParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1021:6: ( ruleFuture )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1021:6: ( ruleFuture )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1022:1: ruleFuture
                    {
                     before(grammarAccess.getPathFormulaAccess().getFutureParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleFuture_in_rule__PathFormula__Alternatives2109);
                    ruleFuture();

                    state._fsp--;

                     after(grammarAccess.getPathFormulaAccess().getFutureParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1027:6: ( ruleGlobally )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1027:6: ( ruleGlobally )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1028:1: ruleGlobally
                    {
                     before(grammarAccess.getPathFormulaAccess().getGloballyParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleGlobally_in_rule__PathFormula__Alternatives2126);
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


    // $ANTLR start "rule__Until__TypeAlternatives_1_0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1038:1: rule__Until__TypeAlternatives_1_0 : ( ( 'U' ) | ( 'W' ) | ( 'R' ) );
    public final void rule__Until__TypeAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1042:1: ( ( 'U' ) | ( 'W' ) | ( 'R' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt10=1;
                }
                break;
            case 16:
                {
                alt10=2;
                }
                break;
            case 17:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1043:1: ( 'U' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1043:1: ( 'U' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1044:1: 'U'
                    {
                     before(grammarAccess.getUntilAccess().getTypeUKeyword_1_0_0()); 
                    match(input,15,FOLLOW_15_in_rule__Until__TypeAlternatives_1_02159); 
                     after(grammarAccess.getUntilAccess().getTypeUKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1051:6: ( 'W' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1051:6: ( 'W' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1052:1: 'W'
                    {
                     before(grammarAccess.getUntilAccess().getTypeWKeyword_1_0_1()); 
                    match(input,16,FOLLOW_16_in_rule__Until__TypeAlternatives_1_02179); 
                     after(grammarAccess.getUntilAccess().getTypeWKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1059:6: ( 'R' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1059:6: ( 'R' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1060:1: 'R'
                    {
                     before(grammarAccess.getUntilAccess().getTypeRKeyword_1_0_2()); 
                    match(input,17,FOLLOW_17_in_rule__Until__TypeAlternatives_1_02199); 
                     after(grammarAccess.getUntilAccess().getTypeRKeyword_1_0_2()); 

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
    // $ANTLR end "rule__Until__TypeAlternatives_1_0"


    // $ANTLR start "rule__TimeBound__Alternatives"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1072:1: rule__TimeBound__Alternatives : ( ( ( rule__TimeBound__Group_0__0 ) ) | ( ( rule__TimeBound__Group_1__0 ) ) );
    public final void rule__TimeBound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1076:1: ( ( ( rule__TimeBound__Group_0__0 ) ) | ( ( rule__TimeBound__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_COMPARATOR||LA11_0==18) ) {
                alt11=1;
            }
            else if ( (LA11_0==20) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1077:1: ( ( rule__TimeBound__Group_0__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1077:1: ( ( rule__TimeBound__Group_0__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1078:1: ( rule__TimeBound__Group_0__0 )
                    {
                     before(grammarAccess.getTimeBoundAccess().getGroup_0()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1079:1: ( rule__TimeBound__Group_0__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1079:2: rule__TimeBound__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TimeBound__Group_0__0_in_rule__TimeBound__Alternatives2233);
                    rule__TimeBound__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimeBoundAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1083:6: ( ( rule__TimeBound__Group_1__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1083:6: ( ( rule__TimeBound__Group_1__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1084:1: ( rule__TimeBound__Group_1__0 )
                    {
                     before(grammarAccess.getTimeBoundAccess().getGroup_1()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1085:1: ( rule__TimeBound__Group_1__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1085:2: rule__TimeBound__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TimeBound__Group_1__0_in_rule__TimeBound__Alternatives2251);
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


    // $ANTLR start "rule__TimeBound__OperatorAlternatives_0_0_0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1094:1: rule__TimeBound__OperatorAlternatives_0_0_0 : ( ( RULE_COMPARATOR ) | ( '=' ) );
    public final void rule__TimeBound__OperatorAlternatives_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1098:1: ( ( RULE_COMPARATOR ) | ( '=' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_COMPARATOR) ) {
                alt12=1;
            }
            else if ( (LA12_0==18) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1099:1: ( RULE_COMPARATOR )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1099:1: ( RULE_COMPARATOR )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1100:1: RULE_COMPARATOR
                    {
                     before(grammarAccess.getTimeBoundAccess().getOperatorCOMPARATORTerminalRuleCall_0_0_0_0()); 
                    match(input,RULE_COMPARATOR,FOLLOW_RULE_COMPARATOR_in_rule__TimeBound__OperatorAlternatives_0_0_02284); 
                     after(grammarAccess.getTimeBoundAccess().getOperatorCOMPARATORTerminalRuleCall_0_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1105:6: ( '=' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1105:6: ( '=' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1106:1: '='
                    {
                     before(grammarAccess.getTimeBoundAccess().getOperatorEqualsSignKeyword_0_0_0_1()); 
                    match(input,18,FOLLOW_18_in_rule__TimeBound__OperatorAlternatives_0_0_02302); 
                     after(grammarAccess.getTimeBoundAccess().getOperatorEqualsSignKeyword_0_0_0_1()); 

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
    // $ANTLR end "rule__TimeBound__OperatorAlternatives_0_0_0"


    // $ANTLR start "rule__Start__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1120:1: rule__Start__Group__0 : rule__Start__Group__0__Impl rule__Start__Group__1 ;
    public final void rule__Start__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1124:1: ( rule__Start__Group__0__Impl rule__Start__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1125:2: rule__Start__Group__0__Impl rule__Start__Group__1
            {
            pushFollow(FOLLOW_rule__Start__Group__0__Impl_in_rule__Start__Group__02334);
            rule__Start__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Start__Group__1_in_rule__Start__Group__02337);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1132:1: rule__Start__Group__0__Impl : ( () ) ;
    public final void rule__Start__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1136:1: ( ( () ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1137:1: ( () )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1137:1: ( () )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1138:1: ()
            {
             before(grammarAccess.getStartAccess().getStartAction_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1139:1: ()
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1141:1: 
            {
            }

             after(grammarAccess.getStartAccess().getStartAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Start__Group__0__Impl"


    // $ANTLR start "rule__Start__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1151:1: rule__Start__Group__1 : rule__Start__Group__1__Impl ;
    public final void rule__Start__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1155:1: ( rule__Start__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1156:2: rule__Start__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Start__Group__1__Impl_in_rule__Start__Group__12395);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1162:1: rule__Start__Group__1__Impl : ( ( rule__Start__RuleAssignment_1 )* ) ;
    public final void rule__Start__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1166:1: ( ( ( rule__Start__RuleAssignment_1 )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1167:1: ( ( rule__Start__RuleAssignment_1 )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1167:1: ( ( rule__Start__RuleAssignment_1 )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1168:1: ( rule__Start__RuleAssignment_1 )*
            {
             before(grammarAccess.getStartAccess().getRuleAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1169:1: ( rule__Start__RuleAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_SL_COMMENT||LA13_0==RULE_BOOL||LA13_0==19||(LA13_0>=22 && LA13_0<=23)||LA13_0==25||(LA13_0>=29 && LA13_0<=30)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1169:2: rule__Start__RuleAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Start__RuleAssignment_1_in_rule__Start__Group__1__Impl2422);
            	    rule__Start__RuleAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getStartAccess().getRuleAssignment_1()); 

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


    // $ANTLR start "rule__SteadyState__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1183:1: rule__SteadyState__Group__0 : rule__SteadyState__Group__0__Impl rule__SteadyState__Group__1 ;
    public final void rule__SteadyState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1187:1: ( rule__SteadyState__Group__0__Impl rule__SteadyState__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1188:2: rule__SteadyState__Group__0__Impl rule__SteadyState__Group__1
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__0__Impl_in_rule__SteadyState__Group__02457);
            rule__SteadyState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__1_in_rule__SteadyState__Group__02460);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1195:1: rule__SteadyState__Group__0__Impl : ( 'S' ) ;
    public final void rule__SteadyState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1199:1: ( ( 'S' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1200:1: ( 'S' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1200:1: ( 'S' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1201:1: 'S'
            {
             before(grammarAccess.getSteadyStateAccess().getSKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__SteadyState__Group__0__Impl2488); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1214:1: rule__SteadyState__Group__1 : rule__SteadyState__Group__1__Impl rule__SteadyState__Group__2 ;
    public final void rule__SteadyState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1218:1: ( rule__SteadyState__Group__1__Impl rule__SteadyState__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1219:2: rule__SteadyState__Group__1__Impl rule__SteadyState__Group__2
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__1__Impl_in_rule__SteadyState__Group__12519);
            rule__SteadyState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__2_in_rule__SteadyState__Group__12522);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1226:1: rule__SteadyState__Group__1__Impl : ( ( RULE_SL_COMMENT )* ) ;
    public final void rule__SteadyState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1230:1: ( ( ( RULE_SL_COMMENT )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1231:1: ( ( RULE_SL_COMMENT )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1231:1: ( ( RULE_SL_COMMENT )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1232:1: ( RULE_SL_COMMENT )*
            {
             before(grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1233:1: ( RULE_SL_COMMENT )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_SL_COMMENT) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1233:3: RULE_SL_COMMENT
            	    {
            	    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__SteadyState__Group__1__Impl2550); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_1()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1243:1: rule__SteadyState__Group__2 : rule__SteadyState__Group__2__Impl rule__SteadyState__Group__3 ;
    public final void rule__SteadyState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1247:1: ( rule__SteadyState__Group__2__Impl rule__SteadyState__Group__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1248:2: rule__SteadyState__Group__2__Impl rule__SteadyState__Group__3
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__2__Impl_in_rule__SteadyState__Group__22581);
            rule__SteadyState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__3_in_rule__SteadyState__Group__22584);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1255:1: rule__SteadyState__Group__2__Impl : ( ( rule__SteadyState__Alternatives_2 ) ) ;
    public final void rule__SteadyState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1259:1: ( ( ( rule__SteadyState__Alternatives_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1260:1: ( ( rule__SteadyState__Alternatives_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1260:1: ( ( rule__SteadyState__Alternatives_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1261:1: ( rule__SteadyState__Alternatives_2 )
            {
             before(grammarAccess.getSteadyStateAccess().getAlternatives_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1262:1: ( rule__SteadyState__Alternatives_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1262:2: rule__SteadyState__Alternatives_2
            {
            pushFollow(FOLLOW_rule__SteadyState__Alternatives_2_in_rule__SteadyState__Group__2__Impl2611);
            rule__SteadyState__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getSteadyStateAccess().getAlternatives_2()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1272:1: rule__SteadyState__Group__3 : rule__SteadyState__Group__3__Impl rule__SteadyState__Group__4 ;
    public final void rule__SteadyState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1276:1: ( rule__SteadyState__Group__3__Impl rule__SteadyState__Group__4 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1277:2: rule__SteadyState__Group__3__Impl rule__SteadyState__Group__4
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__3__Impl_in_rule__SteadyState__Group__32641);
            rule__SteadyState__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__4_in_rule__SteadyState__Group__32644);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1284:1: rule__SteadyState__Group__3__Impl : ( ( RULE_SL_COMMENT )* ) ;
    public final void rule__SteadyState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1288:1: ( ( ( RULE_SL_COMMENT )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1289:1: ( ( RULE_SL_COMMENT )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1289:1: ( ( RULE_SL_COMMENT )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1290:1: ( RULE_SL_COMMENT )*
            {
             before(grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_3()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1291:1: ( RULE_SL_COMMENT )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_SL_COMMENT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1291:3: RULE_SL_COMMENT
            	    {
            	    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__SteadyState__Group__3__Impl2672); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_3()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1301:1: rule__SteadyState__Group__4 : rule__SteadyState__Group__4__Impl rule__SteadyState__Group__5 ;
    public final void rule__SteadyState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1305:1: ( rule__SteadyState__Group__4__Impl rule__SteadyState__Group__5 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1306:2: rule__SteadyState__Group__4__Impl rule__SteadyState__Group__5
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__4__Impl_in_rule__SteadyState__Group__42703);
            rule__SteadyState__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__5_in_rule__SteadyState__Group__42706);
            rule__SteadyState__Group__5();

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1313:1: rule__SteadyState__Group__4__Impl : ( '[' ) ;
    public final void rule__SteadyState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1317:1: ( ( '[' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1318:1: ( '[' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1318:1: ( '[' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1319:1: '['
            {
             before(grammarAccess.getSteadyStateAccess().getLeftSquareBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__SteadyState__Group__4__Impl2734); 
             after(grammarAccess.getSteadyStateAccess().getLeftSquareBracketKeyword_4()); 

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


    // $ANTLR start "rule__SteadyState__Group__5"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1332:1: rule__SteadyState__Group__5 : rule__SteadyState__Group__5__Impl rule__SteadyState__Group__6 ;
    public final void rule__SteadyState__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1336:1: ( rule__SteadyState__Group__5__Impl rule__SteadyState__Group__6 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1337:2: rule__SteadyState__Group__5__Impl rule__SteadyState__Group__6
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__5__Impl_in_rule__SteadyState__Group__52765);
            rule__SteadyState__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__6_in_rule__SteadyState__Group__52768);
            rule__SteadyState__Group__6();

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
    // $ANTLR end "rule__SteadyState__Group__5"


    // $ANTLR start "rule__SteadyState__Group__5__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1344:1: rule__SteadyState__Group__5__Impl : ( ( RULE_SL_COMMENT )* ) ;
    public final void rule__SteadyState__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1348:1: ( ( ( RULE_SL_COMMENT )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1349:1: ( ( RULE_SL_COMMENT )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1349:1: ( ( RULE_SL_COMMENT )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1350:1: ( RULE_SL_COMMENT )*
            {
             before(grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_5()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1351:1: ( RULE_SL_COMMENT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_SL_COMMENT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1351:3: RULE_SL_COMMENT
            	    {
            	    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__SteadyState__Group__5__Impl2796); 

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_5()); 

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
    // $ANTLR end "rule__SteadyState__Group__5__Impl"


    // $ANTLR start "rule__SteadyState__Group__6"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1361:1: rule__SteadyState__Group__6 : rule__SteadyState__Group__6__Impl rule__SteadyState__Group__7 ;
    public final void rule__SteadyState__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1365:1: ( rule__SteadyState__Group__6__Impl rule__SteadyState__Group__7 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1366:2: rule__SteadyState__Group__6__Impl rule__SteadyState__Group__7
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__6__Impl_in_rule__SteadyState__Group__62827);
            rule__SteadyState__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__7_in_rule__SteadyState__Group__62830);
            rule__SteadyState__Group__7();

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
    // $ANTLR end "rule__SteadyState__Group__6"


    // $ANTLR start "rule__SteadyState__Group__6__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1373:1: rule__SteadyState__Group__6__Impl : ( ( rule__SteadyState__ValueAssignment_6 ) ) ;
    public final void rule__SteadyState__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1377:1: ( ( ( rule__SteadyState__ValueAssignment_6 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1378:1: ( ( rule__SteadyState__ValueAssignment_6 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1378:1: ( ( rule__SteadyState__ValueAssignment_6 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1379:1: ( rule__SteadyState__ValueAssignment_6 )
            {
             before(grammarAccess.getSteadyStateAccess().getValueAssignment_6()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1380:1: ( rule__SteadyState__ValueAssignment_6 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1380:2: rule__SteadyState__ValueAssignment_6
            {
            pushFollow(FOLLOW_rule__SteadyState__ValueAssignment_6_in_rule__SteadyState__Group__6__Impl2857);
            rule__SteadyState__ValueAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSteadyStateAccess().getValueAssignment_6()); 

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
    // $ANTLR end "rule__SteadyState__Group__6__Impl"


    // $ANTLR start "rule__SteadyState__Group__7"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1390:1: rule__SteadyState__Group__7 : rule__SteadyState__Group__7__Impl rule__SteadyState__Group__8 ;
    public final void rule__SteadyState__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1394:1: ( rule__SteadyState__Group__7__Impl rule__SteadyState__Group__8 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1395:2: rule__SteadyState__Group__7__Impl rule__SteadyState__Group__8
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__7__Impl_in_rule__SteadyState__Group__72887);
            rule__SteadyState__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__8_in_rule__SteadyState__Group__72890);
            rule__SteadyState__Group__8();

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
    // $ANTLR end "rule__SteadyState__Group__7"


    // $ANTLR start "rule__SteadyState__Group__7__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1402:1: rule__SteadyState__Group__7__Impl : ( ( RULE_SL_COMMENT )* ) ;
    public final void rule__SteadyState__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1406:1: ( ( ( RULE_SL_COMMENT )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1407:1: ( ( RULE_SL_COMMENT )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1407:1: ( ( RULE_SL_COMMENT )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1408:1: ( RULE_SL_COMMENT )*
            {
             before(grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_7()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1409:1: ( RULE_SL_COMMENT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_SL_COMMENT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1409:3: RULE_SL_COMMENT
            	    {
            	    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__SteadyState__Group__7__Impl2918); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_7()); 

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
    // $ANTLR end "rule__SteadyState__Group__7__Impl"


    // $ANTLR start "rule__SteadyState__Group__8"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1419:1: rule__SteadyState__Group__8 : rule__SteadyState__Group__8__Impl ;
    public final void rule__SteadyState__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1423:1: ( rule__SteadyState__Group__8__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1424:2: rule__SteadyState__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__8__Impl_in_rule__SteadyState__Group__82949);
            rule__SteadyState__Group__8__Impl();

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
    // $ANTLR end "rule__SteadyState__Group__8"


    // $ANTLR start "rule__SteadyState__Group__8__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1430:1: rule__SteadyState__Group__8__Impl : ( ']' ) ;
    public final void rule__SteadyState__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1434:1: ( ( ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1435:1: ( ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1435:1: ( ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1436:1: ']'
            {
             before(grammarAccess.getSteadyStateAccess().getRightSquareBracketKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__SteadyState__Group__8__Impl2977); 
             after(grammarAccess.getSteadyStateAccess().getRightSquareBracketKeyword_8()); 

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
    // $ANTLR end "rule__SteadyState__Group__8__Impl"


    // $ANTLR start "rule__QuantifiedProbability__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1467:1: rule__QuantifiedProbability__Group__0 : rule__QuantifiedProbability__Group__0__Impl rule__QuantifiedProbability__Group__1 ;
    public final void rule__QuantifiedProbability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1471:1: ( rule__QuantifiedProbability__Group__0__Impl rule__QuantifiedProbability__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1472:2: rule__QuantifiedProbability__Group__0__Impl rule__QuantifiedProbability__Group__1
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__0__Impl_in_rule__QuantifiedProbability__Group__03026);
            rule__QuantifiedProbability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__1_in_rule__QuantifiedProbability__Group__03029);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1479:1: rule__QuantifiedProbability__Group__0__Impl : ( 'P' ) ;
    public final void rule__QuantifiedProbability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1483:1: ( ( 'P' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1484:1: ( 'P' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1484:1: ( 'P' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1485:1: 'P'
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getPKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__QuantifiedProbability__Group__0__Impl3057); 
             after(grammarAccess.getQuantifiedProbabilityAccess().getPKeyword_0()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1498:1: rule__QuantifiedProbability__Group__1 : rule__QuantifiedProbability__Group__1__Impl rule__QuantifiedProbability__Group__2 ;
    public final void rule__QuantifiedProbability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1502:1: ( rule__QuantifiedProbability__Group__1__Impl rule__QuantifiedProbability__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1503:2: rule__QuantifiedProbability__Group__1__Impl rule__QuantifiedProbability__Group__2
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__1__Impl_in_rule__QuantifiedProbability__Group__13088);
            rule__QuantifiedProbability__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__2_in_rule__QuantifiedProbability__Group__13091);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1510:1: rule__QuantifiedProbability__Group__1__Impl : ( ( RULE_SL_COMMENT )* ) ;
    public final void rule__QuantifiedProbability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1514:1: ( ( ( RULE_SL_COMMENT )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1515:1: ( ( RULE_SL_COMMENT )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1515:1: ( ( RULE_SL_COMMENT )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1516:1: ( RULE_SL_COMMENT )*
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getSL_COMMENTTerminalRuleCall_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1517:1: ( RULE_SL_COMMENT )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_SL_COMMENT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1517:3: RULE_SL_COMMENT
            	    {
            	    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__QuantifiedProbability__Group__1__Impl3119); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getQuantifiedProbabilityAccess().getSL_COMMENTTerminalRuleCall_1()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1527:1: rule__QuantifiedProbability__Group__2 : rule__QuantifiedProbability__Group__2__Impl rule__QuantifiedProbability__Group__3 ;
    public final void rule__QuantifiedProbability__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1531:1: ( rule__QuantifiedProbability__Group__2__Impl rule__QuantifiedProbability__Group__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1532:2: rule__QuantifiedProbability__Group__2__Impl rule__QuantifiedProbability__Group__3
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__2__Impl_in_rule__QuantifiedProbability__Group__23150);
            rule__QuantifiedProbability__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__3_in_rule__QuantifiedProbability__Group__23153);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1539:1: rule__QuantifiedProbability__Group__2__Impl : ( '=?' ) ;
    public final void rule__QuantifiedProbability__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1543:1: ( ( '=?' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1544:1: ( '=?' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1544:1: ( '=?' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1545:1: '=?'
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getEqualsSignQuestionMarkKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__QuantifiedProbability__Group__2__Impl3181); 
             after(grammarAccess.getQuantifiedProbabilityAccess().getEqualsSignQuestionMarkKeyword_2()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1558:1: rule__QuantifiedProbability__Group__3 : rule__QuantifiedProbability__Group__3__Impl rule__QuantifiedProbability__Group__4 ;
    public final void rule__QuantifiedProbability__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1562:1: ( rule__QuantifiedProbability__Group__3__Impl rule__QuantifiedProbability__Group__4 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1563:2: rule__QuantifiedProbability__Group__3__Impl rule__QuantifiedProbability__Group__4
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__3__Impl_in_rule__QuantifiedProbability__Group__33212);
            rule__QuantifiedProbability__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__4_in_rule__QuantifiedProbability__Group__33215);
            rule__QuantifiedProbability__Group__4();

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1570:1: rule__QuantifiedProbability__Group__3__Impl : ( ( RULE_SL_COMMENT )* ) ;
    public final void rule__QuantifiedProbability__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1574:1: ( ( ( RULE_SL_COMMENT )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1575:1: ( ( RULE_SL_COMMENT )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1575:1: ( ( RULE_SL_COMMENT )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1576:1: ( RULE_SL_COMMENT )*
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getSL_COMMENTTerminalRuleCall_3()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1577:1: ( RULE_SL_COMMENT )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_SL_COMMENT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1577:3: RULE_SL_COMMENT
            	    {
            	    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__QuantifiedProbability__Group__3__Impl3243); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getQuantifiedProbabilityAccess().getSL_COMMENTTerminalRuleCall_3()); 

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


    // $ANTLR start "rule__QuantifiedProbability__Group__4"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1587:1: rule__QuantifiedProbability__Group__4 : rule__QuantifiedProbability__Group__4__Impl rule__QuantifiedProbability__Group__5 ;
    public final void rule__QuantifiedProbability__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1591:1: ( rule__QuantifiedProbability__Group__4__Impl rule__QuantifiedProbability__Group__5 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1592:2: rule__QuantifiedProbability__Group__4__Impl rule__QuantifiedProbability__Group__5
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__4__Impl_in_rule__QuantifiedProbability__Group__43274);
            rule__QuantifiedProbability__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__5_in_rule__QuantifiedProbability__Group__43277);
            rule__QuantifiedProbability__Group__5();

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
    // $ANTLR end "rule__QuantifiedProbability__Group__4"


    // $ANTLR start "rule__QuantifiedProbability__Group__4__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1599:1: rule__QuantifiedProbability__Group__4__Impl : ( '[' ) ;
    public final void rule__QuantifiedProbability__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1603:1: ( ( '[' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1604:1: ( '[' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1604:1: ( '[' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1605:1: '['
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getLeftSquareBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__QuantifiedProbability__Group__4__Impl3305); 
             after(grammarAccess.getQuantifiedProbabilityAccess().getLeftSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__QuantifiedProbability__Group__4__Impl"


    // $ANTLR start "rule__QuantifiedProbability__Group__5"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1618:1: rule__QuantifiedProbability__Group__5 : rule__QuantifiedProbability__Group__5__Impl rule__QuantifiedProbability__Group__6 ;
    public final void rule__QuantifiedProbability__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1622:1: ( rule__QuantifiedProbability__Group__5__Impl rule__QuantifiedProbability__Group__6 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1623:2: rule__QuantifiedProbability__Group__5__Impl rule__QuantifiedProbability__Group__6
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__5__Impl_in_rule__QuantifiedProbability__Group__53336);
            rule__QuantifiedProbability__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__6_in_rule__QuantifiedProbability__Group__53339);
            rule__QuantifiedProbability__Group__6();

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
    // $ANTLR end "rule__QuantifiedProbability__Group__5"


    // $ANTLR start "rule__QuantifiedProbability__Group__5__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1630:1: rule__QuantifiedProbability__Group__5__Impl : ( ( rule__QuantifiedProbability__ValueAssignment_5 ) ) ;
    public final void rule__QuantifiedProbability__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1634:1: ( ( ( rule__QuantifiedProbability__ValueAssignment_5 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1635:1: ( ( rule__QuantifiedProbability__ValueAssignment_5 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1635:1: ( ( rule__QuantifiedProbability__ValueAssignment_5 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1636:1: ( rule__QuantifiedProbability__ValueAssignment_5 )
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getValueAssignment_5()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1637:1: ( rule__QuantifiedProbability__ValueAssignment_5 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1637:2: rule__QuantifiedProbability__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__ValueAssignment_5_in_rule__QuantifiedProbability__Group__5__Impl3366);
            rule__QuantifiedProbability__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getQuantifiedProbabilityAccess().getValueAssignment_5()); 

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
    // $ANTLR end "rule__QuantifiedProbability__Group__5__Impl"


    // $ANTLR start "rule__QuantifiedProbability__Group__6"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1647:1: rule__QuantifiedProbability__Group__6 : rule__QuantifiedProbability__Group__6__Impl ;
    public final void rule__QuantifiedProbability__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1651:1: ( rule__QuantifiedProbability__Group__6__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1652:2: rule__QuantifiedProbability__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__6__Impl_in_rule__QuantifiedProbability__Group__63396);
            rule__QuantifiedProbability__Group__6__Impl();

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
    // $ANTLR end "rule__QuantifiedProbability__Group__6"


    // $ANTLR start "rule__QuantifiedProbability__Group__6__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1658:1: rule__QuantifiedProbability__Group__6__Impl : ( ']' ) ;
    public final void rule__QuantifiedProbability__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1662:1: ( ( ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1663:1: ( ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1663:1: ( ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1664:1: ']'
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getRightSquareBracketKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__QuantifiedProbability__Group__6__Impl3424); 
             after(grammarAccess.getQuantifiedProbabilityAccess().getRightSquareBracketKeyword_6()); 

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
    // $ANTLR end "rule__QuantifiedProbability__Group__6__Impl"


    // $ANTLR start "rule__StateFormula__Group_0__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1691:1: rule__StateFormula__Group_0__0 : rule__StateFormula__Group_0__0__Impl rule__StateFormula__Group_0__1 ;
    public final void rule__StateFormula__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1695:1: ( rule__StateFormula__Group_0__0__Impl rule__StateFormula__Group_0__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1696:2: rule__StateFormula__Group_0__0__Impl rule__StateFormula__Group_0__1
            {
            pushFollow(FOLLOW_rule__StateFormula__Group_0__0__Impl_in_rule__StateFormula__Group_0__03469);
            rule__StateFormula__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateFormula__Group_0__1_in_rule__StateFormula__Group_0__03472);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1703:1: rule__StateFormula__Group_0__0__Impl : ( '(' ) ;
    public final void rule__StateFormula__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1707:1: ( ( '(' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1708:1: ( '(' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1708:1: ( '(' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1709:1: '('
            {
             before(grammarAccess.getStateFormulaAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,23,FOLLOW_23_in_rule__StateFormula__Group_0__0__Impl3500); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1722:1: rule__StateFormula__Group_0__1 : rule__StateFormula__Group_0__1__Impl rule__StateFormula__Group_0__2 ;
    public final void rule__StateFormula__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1726:1: ( rule__StateFormula__Group_0__1__Impl rule__StateFormula__Group_0__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1727:2: rule__StateFormula__Group_0__1__Impl rule__StateFormula__Group_0__2
            {
            pushFollow(FOLLOW_rule__StateFormula__Group_0__1__Impl_in_rule__StateFormula__Group_0__13531);
            rule__StateFormula__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateFormula__Group_0__2_in_rule__StateFormula__Group_0__13534);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1734:1: rule__StateFormula__Group_0__1__Impl : ( ( RULE_SL_COMMENT )* ) ;
    public final void rule__StateFormula__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1738:1: ( ( ( RULE_SL_COMMENT )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1739:1: ( ( RULE_SL_COMMENT )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1739:1: ( ( RULE_SL_COMMENT )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1740:1: ( RULE_SL_COMMENT )*
            {
             before(grammarAccess.getStateFormulaAccess().getSL_COMMENTTerminalRuleCall_0_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1741:1: ( RULE_SL_COMMENT )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_SL_COMMENT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1741:3: RULE_SL_COMMENT
            	    {
            	    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__StateFormula__Group_0__1__Impl3562); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getStateFormulaAccess().getSL_COMMENTTerminalRuleCall_0_1()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1751:1: rule__StateFormula__Group_0__2 : rule__StateFormula__Group_0__2__Impl rule__StateFormula__Group_0__3 ;
    public final void rule__StateFormula__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1755:1: ( rule__StateFormula__Group_0__2__Impl rule__StateFormula__Group_0__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1756:2: rule__StateFormula__Group_0__2__Impl rule__StateFormula__Group_0__3
            {
            pushFollow(FOLLOW_rule__StateFormula__Group_0__2__Impl_in_rule__StateFormula__Group_0__23593);
            rule__StateFormula__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateFormula__Group_0__3_in_rule__StateFormula__Group_0__23596);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1763:1: rule__StateFormula__Group_0__2__Impl : ( ( rule__StateFormula__LeftAssignment_0_2 ) ) ;
    public final void rule__StateFormula__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1767:1: ( ( ( rule__StateFormula__LeftAssignment_0_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1768:1: ( ( rule__StateFormula__LeftAssignment_0_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1768:1: ( ( rule__StateFormula__LeftAssignment_0_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1769:1: ( rule__StateFormula__LeftAssignment_0_2 )
            {
             before(grammarAccess.getStateFormulaAccess().getLeftAssignment_0_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1770:1: ( rule__StateFormula__LeftAssignment_0_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1770:2: rule__StateFormula__LeftAssignment_0_2
            {
            pushFollow(FOLLOW_rule__StateFormula__LeftAssignment_0_2_in_rule__StateFormula__Group_0__2__Impl3623);
            rule__StateFormula__LeftAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getStateFormulaAccess().getLeftAssignment_0_2()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1780:1: rule__StateFormula__Group_0__3 : rule__StateFormula__Group_0__3__Impl rule__StateFormula__Group_0__4 ;
    public final void rule__StateFormula__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1784:1: ( rule__StateFormula__Group_0__3__Impl rule__StateFormula__Group_0__4 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1785:2: rule__StateFormula__Group_0__3__Impl rule__StateFormula__Group_0__4
            {
            pushFollow(FOLLOW_rule__StateFormula__Group_0__3__Impl_in_rule__StateFormula__Group_0__33653);
            rule__StateFormula__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateFormula__Group_0__4_in_rule__StateFormula__Group_0__33656);
            rule__StateFormula__Group_0__4();

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1792:1: rule__StateFormula__Group_0__3__Impl : ( ( rule__StateFormula__Alternatives_0_3 )? ) ;
    public final void rule__StateFormula__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1796:1: ( ( ( rule__StateFormula__Alternatives_0_3 )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1797:1: ( ( rule__StateFormula__Alternatives_0_3 )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1797:1: ( ( rule__StateFormula__Alternatives_0_3 )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1798:1: ( rule__StateFormula__Alternatives_0_3 )?
            {
             before(grammarAccess.getStateFormulaAccess().getAlternatives_0_3()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1799:1: ( rule__StateFormula__Alternatives_0_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=26 && LA21_0<=28)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1799:2: rule__StateFormula__Alternatives_0_3
                    {
                    pushFollow(FOLLOW_rule__StateFormula__Alternatives_0_3_in_rule__StateFormula__Group_0__3__Impl3683);
                    rule__StateFormula__Alternatives_0_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateFormulaAccess().getAlternatives_0_3()); 

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


    // $ANTLR start "rule__StateFormula__Group_0__4"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1809:1: rule__StateFormula__Group_0__4 : rule__StateFormula__Group_0__4__Impl rule__StateFormula__Group_0__5 ;
    public final void rule__StateFormula__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1813:1: ( rule__StateFormula__Group_0__4__Impl rule__StateFormula__Group_0__5 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1814:2: rule__StateFormula__Group_0__4__Impl rule__StateFormula__Group_0__5
            {
            pushFollow(FOLLOW_rule__StateFormula__Group_0__4__Impl_in_rule__StateFormula__Group_0__43714);
            rule__StateFormula__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateFormula__Group_0__5_in_rule__StateFormula__Group_0__43717);
            rule__StateFormula__Group_0__5();

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
    // $ANTLR end "rule__StateFormula__Group_0__4"


    // $ANTLR start "rule__StateFormula__Group_0__4__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1821:1: rule__StateFormula__Group_0__4__Impl : ( ( RULE_SL_COMMENT )* ) ;
    public final void rule__StateFormula__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1825:1: ( ( ( RULE_SL_COMMENT )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1826:1: ( ( RULE_SL_COMMENT )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1826:1: ( ( RULE_SL_COMMENT )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1827:1: ( RULE_SL_COMMENT )*
            {
             before(grammarAccess.getStateFormulaAccess().getSL_COMMENTTerminalRuleCall_0_4()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1828:1: ( RULE_SL_COMMENT )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_SL_COMMENT) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1828:3: RULE_SL_COMMENT
            	    {
            	    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__StateFormula__Group_0__4__Impl3745); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getStateFormulaAccess().getSL_COMMENTTerminalRuleCall_0_4()); 

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
    // $ANTLR end "rule__StateFormula__Group_0__4__Impl"


    // $ANTLR start "rule__StateFormula__Group_0__5"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1838:1: rule__StateFormula__Group_0__5 : rule__StateFormula__Group_0__5__Impl ;
    public final void rule__StateFormula__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1842:1: ( rule__StateFormula__Group_0__5__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1843:2: rule__StateFormula__Group_0__5__Impl
            {
            pushFollow(FOLLOW_rule__StateFormula__Group_0__5__Impl_in_rule__StateFormula__Group_0__53776);
            rule__StateFormula__Group_0__5__Impl();

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
    // $ANTLR end "rule__StateFormula__Group_0__5"


    // $ANTLR start "rule__StateFormula__Group_0__5__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1849:1: rule__StateFormula__Group_0__5__Impl : ( ')' ) ;
    public final void rule__StateFormula__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1853:1: ( ( ')' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1854:1: ( ')' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1854:1: ( ')' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1855:1: ')'
            {
             before(grammarAccess.getStateFormulaAccess().getRightParenthesisKeyword_0_5()); 
            match(input,24,FOLLOW_24_in_rule__StateFormula__Group_0__5__Impl3804); 
             after(grammarAccess.getStateFormulaAccess().getRightParenthesisKeyword_0_5()); 

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
    // $ANTLR end "rule__StateFormula__Group_0__5__Impl"


    // $ANTLR start "rule__Negation__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1880:1: rule__Negation__Group__0 : rule__Negation__Group__0__Impl rule__Negation__Group__1 ;
    public final void rule__Negation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1884:1: ( rule__Negation__Group__0__Impl rule__Negation__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1885:2: rule__Negation__Group__0__Impl rule__Negation__Group__1
            {
            pushFollow(FOLLOW_rule__Negation__Group__0__Impl_in_rule__Negation__Group__03847);
            rule__Negation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Negation__Group__1_in_rule__Negation__Group__03850);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1892:1: rule__Negation__Group__0__Impl : ( '!' ) ;
    public final void rule__Negation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1896:1: ( ( '!' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1897:1: ( '!' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1897:1: ( '!' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1898:1: '!'
            {
             before(grammarAccess.getNegationAccess().getExclamationMarkKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Negation__Group__0__Impl3878); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1911:1: rule__Negation__Group__1 : rule__Negation__Group__1__Impl ;
    public final void rule__Negation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1915:1: ( rule__Negation__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1916:2: rule__Negation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Negation__Group__1__Impl_in_rule__Negation__Group__13909);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1922:1: rule__Negation__Group__1__Impl : ( ruleStateFormula ) ;
    public final void rule__Negation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1926:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1927:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1927:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1928:1: ruleStateFormula
            {
             before(grammarAccess.getNegationAccess().getStateFormulaParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Negation__Group__1__Impl3936);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1943:1: rule__Conjunction__Group__0 : rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 ;
    public final void rule__Conjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1947:1: ( rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1948:2: rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__03969);
            rule__Conjunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__03972);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1955:1: rule__Conjunction__Group__0__Impl : ( '&' ) ;
    public final void rule__Conjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1959:1: ( ( '&' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1960:1: ( '&' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1960:1: ( '&' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1961:1: '&'
            {
             before(grammarAccess.getConjunctionAccess().getAmpersandKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Conjunction__Group__0__Impl4000); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1974:1: rule__Conjunction__Group__1 : rule__Conjunction__Group__1__Impl rule__Conjunction__Group__2 ;
    public final void rule__Conjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1978:1: ( rule__Conjunction__Group__1__Impl rule__Conjunction__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1979:2: rule__Conjunction__Group__1__Impl rule__Conjunction__Group__2
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__14031);
            rule__Conjunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group__2_in_rule__Conjunction__Group__14034);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1986:1: rule__Conjunction__Group__1__Impl : ( ruleStateFormula ) ;
    public final void rule__Conjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1990:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1991:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1991:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1992:1: ruleStateFormula
            {
             before(grammarAccess.getConjunctionAccess().getStateFormulaParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Conjunction__Group__1__Impl4061);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2003:1: rule__Conjunction__Group__2 : rule__Conjunction__Group__2__Impl ;
    public final void rule__Conjunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2007:1: ( rule__Conjunction__Group__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2008:2: rule__Conjunction__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__2__Impl_in_rule__Conjunction__Group__24090);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2014:1: rule__Conjunction__Group__2__Impl : ( ( rule__Conjunction__Group_2__0 )* ) ;
    public final void rule__Conjunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2018:1: ( ( ( rule__Conjunction__Group_2__0 )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2019:1: ( ( rule__Conjunction__Group_2__0 )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2019:1: ( ( rule__Conjunction__Group_2__0 )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2020:1: ( rule__Conjunction__Group_2__0 )*
            {
             before(grammarAccess.getConjunctionAccess().getGroup_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2021:1: ( rule__Conjunction__Group_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==26) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2021:2: rule__Conjunction__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Conjunction__Group_2__0_in_rule__Conjunction__Group__2__Impl4117);
            	    rule__Conjunction__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2037:1: rule__Conjunction__Group_2__0 : rule__Conjunction__Group_2__0__Impl rule__Conjunction__Group_2__1 ;
    public final void rule__Conjunction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2041:1: ( rule__Conjunction__Group_2__0__Impl rule__Conjunction__Group_2__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2042:2: rule__Conjunction__Group_2__0__Impl rule__Conjunction__Group_2__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_2__0__Impl_in_rule__Conjunction__Group_2__04154);
            rule__Conjunction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_2__1_in_rule__Conjunction__Group_2__04157);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2049:1: rule__Conjunction__Group_2__0__Impl : ( () ) ;
    public final void rule__Conjunction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2053:1: ( ( () ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2054:1: ( () )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2054:1: ( () )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2055:1: ()
            {
             before(grammarAccess.getConjunctionAccess().getConjunctionLeftAction_2_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2056:1: ()
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2058:1: 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2068:1: rule__Conjunction__Group_2__1 : rule__Conjunction__Group_2__1__Impl rule__Conjunction__Group_2__2 ;
    public final void rule__Conjunction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2072:1: ( rule__Conjunction__Group_2__1__Impl rule__Conjunction__Group_2__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2073:2: rule__Conjunction__Group_2__1__Impl rule__Conjunction__Group_2__2
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_2__1__Impl_in_rule__Conjunction__Group_2__14215);
            rule__Conjunction__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_2__2_in_rule__Conjunction__Group_2__14218);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2080:1: rule__Conjunction__Group_2__1__Impl : ( '&' ) ;
    public final void rule__Conjunction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2084:1: ( ( '&' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2085:1: ( '&' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2085:1: ( '&' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2086:1: '&'
            {
             before(grammarAccess.getConjunctionAccess().getAmpersandKeyword_2_1()); 
            match(input,26,FOLLOW_26_in_rule__Conjunction__Group_2__1__Impl4246); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2099:1: rule__Conjunction__Group_2__2 : rule__Conjunction__Group_2__2__Impl ;
    public final void rule__Conjunction__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2103:1: ( rule__Conjunction__Group_2__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2104:2: rule__Conjunction__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_2__2__Impl_in_rule__Conjunction__Group_2__24277);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2110:1: rule__Conjunction__Group_2__2__Impl : ( ( rule__Conjunction__RightAssignment_2_2 ) ) ;
    public final void rule__Conjunction__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2114:1: ( ( ( rule__Conjunction__RightAssignment_2_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2115:1: ( ( rule__Conjunction__RightAssignment_2_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2115:1: ( ( rule__Conjunction__RightAssignment_2_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2116:1: ( rule__Conjunction__RightAssignment_2_2 )
            {
             before(grammarAccess.getConjunctionAccess().getRightAssignment_2_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2117:1: ( rule__Conjunction__RightAssignment_2_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2117:2: rule__Conjunction__RightAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Conjunction__RightAssignment_2_2_in_rule__Conjunction__Group_2__2__Impl4304);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2133:1: rule__Disjunction__Group__0 : rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 ;
    public final void rule__Disjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2137:1: ( rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2138:2: rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__0__Impl_in_rule__Disjunction__Group__04340);
            rule__Disjunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group__1_in_rule__Disjunction__Group__04343);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2145:1: rule__Disjunction__Group__0__Impl : ( '|' ) ;
    public final void rule__Disjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2149:1: ( ( '|' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2150:1: ( '|' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2150:1: ( '|' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2151:1: '|'
            {
             before(grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Disjunction__Group__0__Impl4371); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2164:1: rule__Disjunction__Group__1 : rule__Disjunction__Group__1__Impl rule__Disjunction__Group__2 ;
    public final void rule__Disjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2168:1: ( rule__Disjunction__Group__1__Impl rule__Disjunction__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2169:2: rule__Disjunction__Group__1__Impl rule__Disjunction__Group__2
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__1__Impl_in_rule__Disjunction__Group__14402);
            rule__Disjunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group__2_in_rule__Disjunction__Group__14405);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2176:1: rule__Disjunction__Group__1__Impl : ( ruleStateFormula ) ;
    public final void rule__Disjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2180:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2181:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2181:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2182:1: ruleStateFormula
            {
             before(grammarAccess.getDisjunctionAccess().getStateFormulaParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Disjunction__Group__1__Impl4432);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2193:1: rule__Disjunction__Group__2 : rule__Disjunction__Group__2__Impl ;
    public final void rule__Disjunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2197:1: ( rule__Disjunction__Group__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2198:2: rule__Disjunction__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__2__Impl_in_rule__Disjunction__Group__24461);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2204:1: rule__Disjunction__Group__2__Impl : ( ( rule__Disjunction__Group_2__0 )* ) ;
    public final void rule__Disjunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2208:1: ( ( ( rule__Disjunction__Group_2__0 )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2209:1: ( ( rule__Disjunction__Group_2__0 )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2209:1: ( ( rule__Disjunction__Group_2__0 )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2210:1: ( rule__Disjunction__Group_2__0 )*
            {
             before(grammarAccess.getDisjunctionAccess().getGroup_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2211:1: ( rule__Disjunction__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==27) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2211:2: rule__Disjunction__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Disjunction__Group_2__0_in_rule__Disjunction__Group__2__Impl4488);
            	    rule__Disjunction__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2227:1: rule__Disjunction__Group_2__0 : rule__Disjunction__Group_2__0__Impl rule__Disjunction__Group_2__1 ;
    public final void rule__Disjunction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2231:1: ( rule__Disjunction__Group_2__0__Impl rule__Disjunction__Group_2__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2232:2: rule__Disjunction__Group_2__0__Impl rule__Disjunction__Group_2__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_2__0__Impl_in_rule__Disjunction__Group_2__04525);
            rule__Disjunction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group_2__1_in_rule__Disjunction__Group_2__04528);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2239:1: rule__Disjunction__Group_2__0__Impl : ( () ) ;
    public final void rule__Disjunction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2243:1: ( ( () ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2244:1: ( () )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2244:1: ( () )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2245:1: ()
            {
             before(grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_2_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2246:1: ()
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2248:1: 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2258:1: rule__Disjunction__Group_2__1 : rule__Disjunction__Group_2__1__Impl rule__Disjunction__Group_2__2 ;
    public final void rule__Disjunction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2262:1: ( rule__Disjunction__Group_2__1__Impl rule__Disjunction__Group_2__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2263:2: rule__Disjunction__Group_2__1__Impl rule__Disjunction__Group_2__2
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_2__1__Impl_in_rule__Disjunction__Group_2__14586);
            rule__Disjunction__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group_2__2_in_rule__Disjunction__Group_2__14589);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2270:1: rule__Disjunction__Group_2__1__Impl : ( '|' ) ;
    public final void rule__Disjunction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2274:1: ( ( '|' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2275:1: ( '|' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2275:1: ( '|' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2276:1: '|'
            {
             before(grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_2_1()); 
            match(input,27,FOLLOW_27_in_rule__Disjunction__Group_2__1__Impl4617); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2289:1: rule__Disjunction__Group_2__2 : rule__Disjunction__Group_2__2__Impl ;
    public final void rule__Disjunction__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2293:1: ( rule__Disjunction__Group_2__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2294:2: rule__Disjunction__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_2__2__Impl_in_rule__Disjunction__Group_2__24648);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2300:1: rule__Disjunction__Group_2__2__Impl : ( ( rule__Disjunction__RightAssignment_2_2 ) ) ;
    public final void rule__Disjunction__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2304:1: ( ( ( rule__Disjunction__RightAssignment_2_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2305:1: ( ( rule__Disjunction__RightAssignment_2_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2305:1: ( ( rule__Disjunction__RightAssignment_2_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2306:1: ( rule__Disjunction__RightAssignment_2_2 )
            {
             before(grammarAccess.getDisjunctionAccess().getRightAssignment_2_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2307:1: ( rule__Disjunction__RightAssignment_2_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2307:2: rule__Disjunction__RightAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Disjunction__RightAssignment_2_2_in_rule__Disjunction__Group_2__2__Impl4675);
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


    // $ANTLR start "rule__Implication__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2323:1: rule__Implication__Group__0 : rule__Implication__Group__0__Impl rule__Implication__Group__1 ;
    public final void rule__Implication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2327:1: ( rule__Implication__Group__0__Impl rule__Implication__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2328:2: rule__Implication__Group__0__Impl rule__Implication__Group__1
            {
            pushFollow(FOLLOW_rule__Implication__Group__0__Impl_in_rule__Implication__Group__04711);
            rule__Implication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Implication__Group__1_in_rule__Implication__Group__04714);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2335:1: rule__Implication__Group__0__Impl : ( '=>' ) ;
    public final void rule__Implication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2339:1: ( ( '=>' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2340:1: ( '=>' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2340:1: ( '=>' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2341:1: '=>'
            {
             before(grammarAccess.getImplicationAccess().getEqualsSignGreaterThanSignKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Implication__Group__0__Impl4742); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2354:1: rule__Implication__Group__1 : rule__Implication__Group__1__Impl ;
    public final void rule__Implication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2358:1: ( rule__Implication__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2359:2: rule__Implication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Implication__Group__1__Impl_in_rule__Implication__Group__14773);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2365:1: rule__Implication__Group__1__Impl : ( ( rule__Implication__RightAssignment_1 ) ) ;
    public final void rule__Implication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2369:1: ( ( ( rule__Implication__RightAssignment_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2370:1: ( ( rule__Implication__RightAssignment_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2370:1: ( ( rule__Implication__RightAssignment_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2371:1: ( rule__Implication__RightAssignment_1 )
            {
             before(grammarAccess.getImplicationAccess().getRightAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2372:1: ( rule__Implication__RightAssignment_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2372:2: rule__Implication__RightAssignment_1
            {
            pushFollow(FOLLOW_rule__Implication__RightAssignment_1_in_rule__Implication__Group__1__Impl4800);
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


    // $ANTLR start "rule__Probability__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2386:1: rule__Probability__Group__0 : rule__Probability__Group__0__Impl rule__Probability__Group__1 ;
    public final void rule__Probability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2390:1: ( rule__Probability__Group__0__Impl rule__Probability__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2391:2: rule__Probability__Group__0__Impl rule__Probability__Group__1
            {
            pushFollow(FOLLOW_rule__Probability__Group__0__Impl_in_rule__Probability__Group__04834);
            rule__Probability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__1_in_rule__Probability__Group__04837);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2398:1: rule__Probability__Group__0__Impl : ( 'P' ) ;
    public final void rule__Probability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2402:1: ( ( 'P' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2403:1: ( 'P' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2403:1: ( 'P' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2404:1: 'P'
            {
             before(grammarAccess.getProbabilityAccess().getPKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Probability__Group__0__Impl4865); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2417:1: rule__Probability__Group__1 : rule__Probability__Group__1__Impl rule__Probability__Group__2 ;
    public final void rule__Probability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2421:1: ( rule__Probability__Group__1__Impl rule__Probability__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2422:2: rule__Probability__Group__1__Impl rule__Probability__Group__2
            {
            pushFollow(FOLLOW_rule__Probability__Group__1__Impl_in_rule__Probability__Group__14896);
            rule__Probability__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__2_in_rule__Probability__Group__14899);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2429:1: rule__Probability__Group__1__Impl : ( ( RULE_SL_COMMENT )* ) ;
    public final void rule__Probability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2433:1: ( ( ( RULE_SL_COMMENT )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2434:1: ( ( RULE_SL_COMMENT )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2434:1: ( ( RULE_SL_COMMENT )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2435:1: ( RULE_SL_COMMENT )*
            {
             before(grammarAccess.getProbabilityAccess().getSL_COMMENTTerminalRuleCall_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2436:1: ( RULE_SL_COMMENT )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_SL_COMMENT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2436:3: RULE_SL_COMMENT
            	    {
            	    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__Probability__Group__1__Impl4927); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getProbabilityAccess().getSL_COMMENTTerminalRuleCall_1()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2446:1: rule__Probability__Group__2 : rule__Probability__Group__2__Impl rule__Probability__Group__3 ;
    public final void rule__Probability__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2450:1: ( rule__Probability__Group__2__Impl rule__Probability__Group__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2451:2: rule__Probability__Group__2__Impl rule__Probability__Group__3
            {
            pushFollow(FOLLOW_rule__Probability__Group__2__Impl_in_rule__Probability__Group__24958);
            rule__Probability__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__3_in_rule__Probability__Group__24961);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2458:1: rule__Probability__Group__2__Impl : ( () ) ;
    public final void rule__Probability__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2462:1: ( ( () ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2463:1: ( () )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2463:1: ( () )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2464:1: ()
            {
             before(grammarAccess.getProbabilityAccess().getProbabilityAction_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2465:1: ()
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2467:1: 
            {
            }

             after(grammarAccess.getProbabilityAccess().getProbabilityAction_2()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Probability__Group__2__Impl"


    // $ANTLR start "rule__Probability__Group__3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2477:1: rule__Probability__Group__3 : rule__Probability__Group__3__Impl rule__Probability__Group__4 ;
    public final void rule__Probability__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2481:1: ( rule__Probability__Group__3__Impl rule__Probability__Group__4 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2482:2: rule__Probability__Group__3__Impl rule__Probability__Group__4
            {
            pushFollow(FOLLOW_rule__Probability__Group__3__Impl_in_rule__Probability__Group__35019);
            rule__Probability__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__4_in_rule__Probability__Group__35022);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2489:1: rule__Probability__Group__3__Impl : ( ( rule__Probability__ComparatorAssignment_3 ) ) ;
    public final void rule__Probability__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2493:1: ( ( ( rule__Probability__ComparatorAssignment_3 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2494:1: ( ( rule__Probability__ComparatorAssignment_3 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2494:1: ( ( rule__Probability__ComparatorAssignment_3 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2495:1: ( rule__Probability__ComparatorAssignment_3 )
            {
             before(grammarAccess.getProbabilityAccess().getComparatorAssignment_3()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2496:1: ( rule__Probability__ComparatorAssignment_3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2496:2: rule__Probability__ComparatorAssignment_3
            {
            pushFollow(FOLLOW_rule__Probability__ComparatorAssignment_3_in_rule__Probability__Group__3__Impl5049);
            rule__Probability__ComparatorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProbabilityAccess().getComparatorAssignment_3()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2506:1: rule__Probability__Group__4 : rule__Probability__Group__4__Impl rule__Probability__Group__5 ;
    public final void rule__Probability__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2510:1: ( rule__Probability__Group__4__Impl rule__Probability__Group__5 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2511:2: rule__Probability__Group__4__Impl rule__Probability__Group__5
            {
            pushFollow(FOLLOW_rule__Probability__Group__4__Impl_in_rule__Probability__Group__45079);
            rule__Probability__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__5_in_rule__Probability__Group__45082);
            rule__Probability__Group__5();

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2518:1: rule__Probability__Group__4__Impl : ( ( RULE_SL_COMMENT )* ) ;
    public final void rule__Probability__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2522:1: ( ( ( RULE_SL_COMMENT )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2523:1: ( ( RULE_SL_COMMENT )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2523:1: ( ( RULE_SL_COMMENT )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2524:1: ( RULE_SL_COMMENT )*
            {
             before(grammarAccess.getProbabilityAccess().getSL_COMMENTTerminalRuleCall_4()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2525:1: ( RULE_SL_COMMENT )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_SL_COMMENT) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2525:3: RULE_SL_COMMENT
            	    {
            	    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__Probability__Group__4__Impl5110); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getProbabilityAccess().getSL_COMMENTTerminalRuleCall_4()); 

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


    // $ANTLR start "rule__Probability__Group__5"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2535:1: rule__Probability__Group__5 : rule__Probability__Group__5__Impl rule__Probability__Group__6 ;
    public final void rule__Probability__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2539:1: ( rule__Probability__Group__5__Impl rule__Probability__Group__6 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2540:2: rule__Probability__Group__5__Impl rule__Probability__Group__6
            {
            pushFollow(FOLLOW_rule__Probability__Group__5__Impl_in_rule__Probability__Group__55141);
            rule__Probability__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__6_in_rule__Probability__Group__55144);
            rule__Probability__Group__6();

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
    // $ANTLR end "rule__Probability__Group__5"


    // $ANTLR start "rule__Probability__Group__5__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2547:1: rule__Probability__Group__5__Impl : ( '[' ) ;
    public final void rule__Probability__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2551:1: ( ( '[' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2552:1: ( '[' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2552:1: ( '[' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2553:1: '['
            {
             before(grammarAccess.getProbabilityAccess().getLeftSquareBracketKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__Probability__Group__5__Impl5172); 
             after(grammarAccess.getProbabilityAccess().getLeftSquareBracketKeyword_5()); 

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
    // $ANTLR end "rule__Probability__Group__5__Impl"


    // $ANTLR start "rule__Probability__Group__6"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2566:1: rule__Probability__Group__6 : rule__Probability__Group__6__Impl rule__Probability__Group__7 ;
    public final void rule__Probability__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2570:1: ( rule__Probability__Group__6__Impl rule__Probability__Group__7 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2571:2: rule__Probability__Group__6__Impl rule__Probability__Group__7
            {
            pushFollow(FOLLOW_rule__Probability__Group__6__Impl_in_rule__Probability__Group__65203);
            rule__Probability__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__7_in_rule__Probability__Group__65206);
            rule__Probability__Group__7();

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
    // $ANTLR end "rule__Probability__Group__6"


    // $ANTLR start "rule__Probability__Group__6__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2578:1: rule__Probability__Group__6__Impl : ( ( rule__Probability__PathAssignment_6 ) ) ;
    public final void rule__Probability__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2582:1: ( ( ( rule__Probability__PathAssignment_6 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2583:1: ( ( rule__Probability__PathAssignment_6 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2583:1: ( ( rule__Probability__PathAssignment_6 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2584:1: ( rule__Probability__PathAssignment_6 )
            {
             before(grammarAccess.getProbabilityAccess().getPathAssignment_6()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2585:1: ( rule__Probability__PathAssignment_6 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2585:2: rule__Probability__PathAssignment_6
            {
            pushFollow(FOLLOW_rule__Probability__PathAssignment_6_in_rule__Probability__Group__6__Impl5233);
            rule__Probability__PathAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getProbabilityAccess().getPathAssignment_6()); 

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
    // $ANTLR end "rule__Probability__Group__6__Impl"


    // $ANTLR start "rule__Probability__Group__7"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2595:1: rule__Probability__Group__7 : rule__Probability__Group__7__Impl ;
    public final void rule__Probability__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2599:1: ( rule__Probability__Group__7__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2600:2: rule__Probability__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Probability__Group__7__Impl_in_rule__Probability__Group__75263);
            rule__Probability__Group__7__Impl();

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
    // $ANTLR end "rule__Probability__Group__7"


    // $ANTLR start "rule__Probability__Group__7__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2606:1: rule__Probability__Group__7__Impl : ( ']' ) ;
    public final void rule__Probability__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2610:1: ( ( ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2611:1: ( ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2611:1: ( ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2612:1: ']'
            {
             before(grammarAccess.getProbabilityAccess().getRightSquareBracketKeyword_7()); 
            match(input,21,FOLLOW_21_in_rule__Probability__Group__7__Impl5291); 
             after(grammarAccess.getProbabilityAccess().getRightSquareBracketKeyword_7()); 

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
    // $ANTLR end "rule__Probability__Group__7__Impl"


    // $ANTLR start "rule__State__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2641:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2645:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2646:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__05338);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__05341);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2653:1: rule__State__Group__0__Impl : ( 'State:' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2657:1: ( ( 'State:' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2658:1: ( 'State:' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2658:1: ( 'State:' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2659:1: 'State:'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__State__Group__0__Impl5369); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2672:1: rule__State__Group__1 : rule__State__Group__1__Impl ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2676:1: ( rule__State__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2677:2: rule__State__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__15400);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2683:1: rule__State__Group__1__Impl : ( ( rule__State__ValueAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2687:1: ( ( ( rule__State__ValueAssignment_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2688:1: ( ( rule__State__ValueAssignment_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2688:1: ( ( rule__State__ValueAssignment_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2689:1: ( rule__State__ValueAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getValueAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2690:1: ( rule__State__ValueAssignment_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2690:2: rule__State__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__State__ValueAssignment_1_in_rule__State__Group__1__Impl5427);
            rule__State__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getValueAssignment_1()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2704:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2708:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2709:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__05461);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label__Group__1_in_rule__Label__Group__05464);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2716:1: rule__Label__Group__0__Impl : ( 'Label:' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2720:1: ( ( 'Label:' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2721:1: ( 'Label:' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2721:1: ( 'Label:' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2722:1: 'Label:'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Label__Group__0__Impl5492); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2735:1: rule__Label__Group__1 : rule__Label__Group__1__Impl ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2739:1: ( rule__Label__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2740:2: rule__Label__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__15523);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2746:1: rule__Label__Group__1__Impl : ( ( rule__Label__ValueAssignment_1 ) ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2750:1: ( ( ( rule__Label__ValueAssignment_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2751:1: ( ( rule__Label__ValueAssignment_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2751:1: ( ( rule__Label__ValueAssignment_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2752:1: ( rule__Label__ValueAssignment_1 )
            {
             before(grammarAccess.getLabelAccess().getValueAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2753:1: ( rule__Label__ValueAssignment_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2753:2: rule__Label__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Label__ValueAssignment_1_in_rule__Label__Group__1__Impl5550);
            rule__Label__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getValueAssignment_1()); 

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


    // $ANTLR start "rule__Until__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2767:1: rule__Until__Group__0 : rule__Until__Group__0__Impl rule__Until__Group__1 ;
    public final void rule__Until__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2771:1: ( rule__Until__Group__0__Impl rule__Until__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2772:2: rule__Until__Group__0__Impl rule__Until__Group__1
            {
            pushFollow(FOLLOW_rule__Until__Group__0__Impl_in_rule__Until__Group__05584);
            rule__Until__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Until__Group__1_in_rule__Until__Group__05587);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2779:1: rule__Until__Group__0__Impl : ( ( rule__Until__LeftAssignment_0 ) ) ;
    public final void rule__Until__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2783:1: ( ( ( rule__Until__LeftAssignment_0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2784:1: ( ( rule__Until__LeftAssignment_0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2784:1: ( ( rule__Until__LeftAssignment_0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2785:1: ( rule__Until__LeftAssignment_0 )
            {
             before(grammarAccess.getUntilAccess().getLeftAssignment_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2786:1: ( rule__Until__LeftAssignment_0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2786:2: rule__Until__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__Until__LeftAssignment_0_in_rule__Until__Group__0__Impl5614);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2796:1: rule__Until__Group__1 : rule__Until__Group__1__Impl rule__Until__Group__2 ;
    public final void rule__Until__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2800:1: ( rule__Until__Group__1__Impl rule__Until__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2801:2: rule__Until__Group__1__Impl rule__Until__Group__2
            {
            pushFollow(FOLLOW_rule__Until__Group__1__Impl_in_rule__Until__Group__15644);
            rule__Until__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Until__Group__2_in_rule__Until__Group__15647);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2808:1: rule__Until__Group__1__Impl : ( ( rule__Until__TypeAssignment_1 ) ) ;
    public final void rule__Until__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2812:1: ( ( ( rule__Until__TypeAssignment_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2813:1: ( ( rule__Until__TypeAssignment_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2813:1: ( ( rule__Until__TypeAssignment_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2814:1: ( rule__Until__TypeAssignment_1 )
            {
             before(grammarAccess.getUntilAccess().getTypeAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2815:1: ( rule__Until__TypeAssignment_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2815:2: rule__Until__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Until__TypeAssignment_1_in_rule__Until__Group__1__Impl5674);
            rule__Until__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUntilAccess().getTypeAssignment_1()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2825:1: rule__Until__Group__2 : rule__Until__Group__2__Impl rule__Until__Group__3 ;
    public final void rule__Until__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2829:1: ( rule__Until__Group__2__Impl rule__Until__Group__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2830:2: rule__Until__Group__2__Impl rule__Until__Group__3
            {
            pushFollow(FOLLOW_rule__Until__Group__2__Impl_in_rule__Until__Group__25704);
            rule__Until__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Until__Group__3_in_rule__Until__Group__25707);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2837:1: rule__Until__Group__2__Impl : ( ( rule__Until__BoundAssignment_2 )? ) ;
    public final void rule__Until__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2841:1: ( ( ( rule__Until__BoundAssignment_2 )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2842:1: ( ( rule__Until__BoundAssignment_2 )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2842:1: ( ( rule__Until__BoundAssignment_2 )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2843:1: ( rule__Until__BoundAssignment_2 )?
            {
             before(grammarAccess.getUntilAccess().getBoundAssignment_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2844:1: ( rule__Until__BoundAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_COMPARATOR||LA27_0==18||LA27_0==20) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2844:2: rule__Until__BoundAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Until__BoundAssignment_2_in_rule__Until__Group__2__Impl5734);
                    rule__Until__BoundAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUntilAccess().getBoundAssignment_2()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2854:1: rule__Until__Group__3 : rule__Until__Group__3__Impl ;
    public final void rule__Until__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2858:1: ( rule__Until__Group__3__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2859:2: rule__Until__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Until__Group__3__Impl_in_rule__Until__Group__35765);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2865:1: rule__Until__Group__3__Impl : ( ( rule__Until__RightAssignment_3 ) ) ;
    public final void rule__Until__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2869:1: ( ( ( rule__Until__RightAssignment_3 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2870:1: ( ( rule__Until__RightAssignment_3 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2870:1: ( ( rule__Until__RightAssignment_3 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2871:1: ( rule__Until__RightAssignment_3 )
            {
             before(grammarAccess.getUntilAccess().getRightAssignment_3()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2872:1: ( rule__Until__RightAssignment_3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2872:2: rule__Until__RightAssignment_3
            {
            pushFollow(FOLLOW_rule__Until__RightAssignment_3_in_rule__Until__Group__3__Impl5792);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2890:1: rule__Next__Group__0 : rule__Next__Group__0__Impl rule__Next__Group__1 ;
    public final void rule__Next__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2894:1: ( rule__Next__Group__0__Impl rule__Next__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2895:2: rule__Next__Group__0__Impl rule__Next__Group__1
            {
            pushFollow(FOLLOW_rule__Next__Group__0__Impl_in_rule__Next__Group__05830);
            rule__Next__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Next__Group__1_in_rule__Next__Group__05833);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2902:1: rule__Next__Group__0__Impl : ( 'X' ) ;
    public final void rule__Next__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2906:1: ( ( 'X' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2907:1: ( 'X' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2907:1: ( 'X' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2908:1: 'X'
            {
             before(grammarAccess.getNextAccess().getXKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Next__Group__0__Impl5861); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2921:1: rule__Next__Group__1 : rule__Next__Group__1__Impl rule__Next__Group__2 ;
    public final void rule__Next__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2925:1: ( rule__Next__Group__1__Impl rule__Next__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2926:2: rule__Next__Group__1__Impl rule__Next__Group__2
            {
            pushFollow(FOLLOW_rule__Next__Group__1__Impl_in_rule__Next__Group__15892);
            rule__Next__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Next__Group__2_in_rule__Next__Group__15895);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2933:1: rule__Next__Group__1__Impl : ( ( rule__Next__BoundAssignment_1 )? ) ;
    public final void rule__Next__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2937:1: ( ( ( rule__Next__BoundAssignment_1 )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2938:1: ( ( rule__Next__BoundAssignment_1 )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2938:1: ( ( rule__Next__BoundAssignment_1 )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2939:1: ( rule__Next__BoundAssignment_1 )?
            {
             before(grammarAccess.getNextAccess().getBoundAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2940:1: ( rule__Next__BoundAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_COMPARATOR||LA28_0==18||LA28_0==20) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2940:2: rule__Next__BoundAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Next__BoundAssignment_1_in_rule__Next__Group__1__Impl5922);
                    rule__Next__BoundAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNextAccess().getBoundAssignment_1()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2950:1: rule__Next__Group__2 : rule__Next__Group__2__Impl ;
    public final void rule__Next__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2954:1: ( rule__Next__Group__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2955:2: rule__Next__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Next__Group__2__Impl_in_rule__Next__Group__25953);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2961:1: rule__Next__Group__2__Impl : ( ( rule__Next__ValueAssignment_2 ) ) ;
    public final void rule__Next__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2965:1: ( ( ( rule__Next__ValueAssignment_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2966:1: ( ( rule__Next__ValueAssignment_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2966:1: ( ( rule__Next__ValueAssignment_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2967:1: ( rule__Next__ValueAssignment_2 )
            {
             before(grammarAccess.getNextAccess().getValueAssignment_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2968:1: ( rule__Next__ValueAssignment_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2968:2: rule__Next__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Next__ValueAssignment_2_in_rule__Next__Group__2__Impl5980);
            rule__Next__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNextAccess().getValueAssignment_2()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2984:1: rule__Future__Group__0 : rule__Future__Group__0__Impl rule__Future__Group__1 ;
    public final void rule__Future__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2988:1: ( rule__Future__Group__0__Impl rule__Future__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2989:2: rule__Future__Group__0__Impl rule__Future__Group__1
            {
            pushFollow(FOLLOW_rule__Future__Group__0__Impl_in_rule__Future__Group__06016);
            rule__Future__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Future__Group__1_in_rule__Future__Group__06019);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2996:1: rule__Future__Group__0__Impl : ( 'F' ) ;
    public final void rule__Future__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3000:1: ( ( 'F' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3001:1: ( 'F' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3001:1: ( 'F' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3002:1: 'F'
            {
             before(grammarAccess.getFutureAccess().getFKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Future__Group__0__Impl6047); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3015:1: rule__Future__Group__1 : rule__Future__Group__1__Impl rule__Future__Group__2 ;
    public final void rule__Future__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3019:1: ( rule__Future__Group__1__Impl rule__Future__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3020:2: rule__Future__Group__1__Impl rule__Future__Group__2
            {
            pushFollow(FOLLOW_rule__Future__Group__1__Impl_in_rule__Future__Group__16078);
            rule__Future__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Future__Group__2_in_rule__Future__Group__16081);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3027:1: rule__Future__Group__1__Impl : ( ( rule__Future__BoundAssignment_1 )? ) ;
    public final void rule__Future__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3031:1: ( ( ( rule__Future__BoundAssignment_1 )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3032:1: ( ( rule__Future__BoundAssignment_1 )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3032:1: ( ( rule__Future__BoundAssignment_1 )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3033:1: ( rule__Future__BoundAssignment_1 )?
            {
             before(grammarAccess.getFutureAccess().getBoundAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3034:1: ( rule__Future__BoundAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_COMPARATOR||LA29_0==18||LA29_0==20) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3034:2: rule__Future__BoundAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Future__BoundAssignment_1_in_rule__Future__Group__1__Impl6108);
                    rule__Future__BoundAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFutureAccess().getBoundAssignment_1()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3044:1: rule__Future__Group__2 : rule__Future__Group__2__Impl ;
    public final void rule__Future__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3048:1: ( rule__Future__Group__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3049:2: rule__Future__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Future__Group__2__Impl_in_rule__Future__Group__26139);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3055:1: rule__Future__Group__2__Impl : ( ( rule__Future__ValueAssignment_2 ) ) ;
    public final void rule__Future__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3059:1: ( ( ( rule__Future__ValueAssignment_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3060:1: ( ( rule__Future__ValueAssignment_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3060:1: ( ( rule__Future__ValueAssignment_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3061:1: ( rule__Future__ValueAssignment_2 )
            {
             before(grammarAccess.getFutureAccess().getValueAssignment_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3062:1: ( rule__Future__ValueAssignment_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3062:2: rule__Future__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Future__ValueAssignment_2_in_rule__Future__Group__2__Impl6166);
            rule__Future__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFutureAccess().getValueAssignment_2()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3078:1: rule__Globally__Group__0 : rule__Globally__Group__0__Impl rule__Globally__Group__1 ;
    public final void rule__Globally__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3082:1: ( rule__Globally__Group__0__Impl rule__Globally__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3083:2: rule__Globally__Group__0__Impl rule__Globally__Group__1
            {
            pushFollow(FOLLOW_rule__Globally__Group__0__Impl_in_rule__Globally__Group__06202);
            rule__Globally__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Globally__Group__1_in_rule__Globally__Group__06205);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3090:1: rule__Globally__Group__0__Impl : ( 'G' ) ;
    public final void rule__Globally__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3094:1: ( ( 'G' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3095:1: ( 'G' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3095:1: ( 'G' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3096:1: 'G'
            {
             before(grammarAccess.getGloballyAccess().getGKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Globally__Group__0__Impl6233); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3109:1: rule__Globally__Group__1 : rule__Globally__Group__1__Impl rule__Globally__Group__2 ;
    public final void rule__Globally__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3113:1: ( rule__Globally__Group__1__Impl rule__Globally__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3114:2: rule__Globally__Group__1__Impl rule__Globally__Group__2
            {
            pushFollow(FOLLOW_rule__Globally__Group__1__Impl_in_rule__Globally__Group__16264);
            rule__Globally__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Globally__Group__2_in_rule__Globally__Group__16267);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3121:1: rule__Globally__Group__1__Impl : ( ( rule__Globally__BoundAssignment_1 )? ) ;
    public final void rule__Globally__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3125:1: ( ( ( rule__Globally__BoundAssignment_1 )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3126:1: ( ( rule__Globally__BoundAssignment_1 )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3126:1: ( ( rule__Globally__BoundAssignment_1 )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3127:1: ( rule__Globally__BoundAssignment_1 )?
            {
             before(grammarAccess.getGloballyAccess().getBoundAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3128:1: ( rule__Globally__BoundAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_COMPARATOR||LA30_0==18||LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3128:2: rule__Globally__BoundAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Globally__BoundAssignment_1_in_rule__Globally__Group__1__Impl6294);
                    rule__Globally__BoundAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGloballyAccess().getBoundAssignment_1()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3138:1: rule__Globally__Group__2 : rule__Globally__Group__2__Impl ;
    public final void rule__Globally__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3142:1: ( rule__Globally__Group__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3143:2: rule__Globally__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Globally__Group__2__Impl_in_rule__Globally__Group__26325);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3149:1: rule__Globally__Group__2__Impl : ( ( rule__Globally__ValueAssignment_2 ) ) ;
    public final void rule__Globally__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3153:1: ( ( ( rule__Globally__ValueAssignment_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3154:1: ( ( rule__Globally__ValueAssignment_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3154:1: ( ( rule__Globally__ValueAssignment_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3155:1: ( rule__Globally__ValueAssignment_2 )
            {
             before(grammarAccess.getGloballyAccess().getValueAssignment_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3156:1: ( rule__Globally__ValueAssignment_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3156:2: rule__Globally__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Globally__ValueAssignment_2_in_rule__Globally__Group__2__Impl6352);
            rule__Globally__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGloballyAccess().getValueAssignment_2()); 

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


    // $ANTLR start "rule__CompareProbability__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3172:1: rule__CompareProbability__Group__0 : rule__CompareProbability__Group__0__Impl rule__CompareProbability__Group__1 ;
    public final void rule__CompareProbability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3176:1: ( rule__CompareProbability__Group__0__Impl rule__CompareProbability__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3177:2: rule__CompareProbability__Group__0__Impl rule__CompareProbability__Group__1
            {
            pushFollow(FOLLOW_rule__CompareProbability__Group__0__Impl_in_rule__CompareProbability__Group__06388);
            rule__CompareProbability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareProbability__Group__1_in_rule__CompareProbability__Group__06391);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3184:1: rule__CompareProbability__Group__0__Impl : ( ( rule__CompareProbability__OperatorAssignment_0 ) ) ;
    public final void rule__CompareProbability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3188:1: ( ( ( rule__CompareProbability__OperatorAssignment_0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3189:1: ( ( rule__CompareProbability__OperatorAssignment_0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3189:1: ( ( rule__CompareProbability__OperatorAssignment_0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3190:1: ( rule__CompareProbability__OperatorAssignment_0 )
            {
             before(grammarAccess.getCompareProbabilityAccess().getOperatorAssignment_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3191:1: ( rule__CompareProbability__OperatorAssignment_0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3191:2: rule__CompareProbability__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__CompareProbability__OperatorAssignment_0_in_rule__CompareProbability__Group__0__Impl6418);
            rule__CompareProbability__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCompareProbabilityAccess().getOperatorAssignment_0()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3201:1: rule__CompareProbability__Group__1 : rule__CompareProbability__Group__1__Impl ;
    public final void rule__CompareProbability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3205:1: ( rule__CompareProbability__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3206:2: rule__CompareProbability__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareProbability__Group__1__Impl_in_rule__CompareProbability__Group__16448);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3212:1: rule__CompareProbability__Group__1__Impl : ( ( rule__CompareProbability__ValueAssignment_1 ) ) ;
    public final void rule__CompareProbability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3216:1: ( ( ( rule__CompareProbability__ValueAssignment_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3217:1: ( ( rule__CompareProbability__ValueAssignment_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3217:1: ( ( rule__CompareProbability__ValueAssignment_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3218:1: ( rule__CompareProbability__ValueAssignment_1 )
            {
             before(grammarAccess.getCompareProbabilityAccess().getValueAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3219:1: ( rule__CompareProbability__ValueAssignment_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3219:2: rule__CompareProbability__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__CompareProbability__ValueAssignment_1_in_rule__CompareProbability__Group__1__Impl6475);
            rule__CompareProbability__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompareProbabilityAccess().getValueAssignment_1()); 

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


    // $ANTLR start "rule__TimeBound__Group_0__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3233:1: rule__TimeBound__Group_0__0 : rule__TimeBound__Group_0__0__Impl rule__TimeBound__Group_0__1 ;
    public final void rule__TimeBound__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3237:1: ( rule__TimeBound__Group_0__0__Impl rule__TimeBound__Group_0__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3238:2: rule__TimeBound__Group_0__0__Impl rule__TimeBound__Group_0__1
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_0__0__Impl_in_rule__TimeBound__Group_0__06509);
            rule__TimeBound__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_0__1_in_rule__TimeBound__Group_0__06512);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3245:1: rule__TimeBound__Group_0__0__Impl : ( ( rule__TimeBound__OperatorAssignment_0_0 ) ) ;
    public final void rule__TimeBound__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3249:1: ( ( ( rule__TimeBound__OperatorAssignment_0_0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3250:1: ( ( rule__TimeBound__OperatorAssignment_0_0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3250:1: ( ( rule__TimeBound__OperatorAssignment_0_0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3251:1: ( rule__TimeBound__OperatorAssignment_0_0 )
            {
             before(grammarAccess.getTimeBoundAccess().getOperatorAssignment_0_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3252:1: ( rule__TimeBound__OperatorAssignment_0_0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3252:2: rule__TimeBound__OperatorAssignment_0_0
            {
            pushFollow(FOLLOW_rule__TimeBound__OperatorAssignment_0_0_in_rule__TimeBound__Group_0__0__Impl6539);
            rule__TimeBound__OperatorAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTimeBoundAccess().getOperatorAssignment_0_0()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3262:1: rule__TimeBound__Group_0__1 : rule__TimeBound__Group_0__1__Impl ;
    public final void rule__TimeBound__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3266:1: ( rule__TimeBound__Group_0__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3267:2: rule__TimeBound__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_0__1__Impl_in_rule__TimeBound__Group_0__16569);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3273:1: rule__TimeBound__Group_0__1__Impl : ( ( rule__TimeBound__ValueAssignment_0_1 ) ) ;
    public final void rule__TimeBound__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3277:1: ( ( ( rule__TimeBound__ValueAssignment_0_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3278:1: ( ( rule__TimeBound__ValueAssignment_0_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3278:1: ( ( rule__TimeBound__ValueAssignment_0_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3279:1: ( rule__TimeBound__ValueAssignment_0_1 )
            {
             before(grammarAccess.getTimeBoundAccess().getValueAssignment_0_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3280:1: ( rule__TimeBound__ValueAssignment_0_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3280:2: rule__TimeBound__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__TimeBound__ValueAssignment_0_1_in_rule__TimeBound__Group_0__1__Impl6596);
            rule__TimeBound__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeBoundAccess().getValueAssignment_0_1()); 

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


    // $ANTLR start "rule__TimeBound__Group_1__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3294:1: rule__TimeBound__Group_1__0 : rule__TimeBound__Group_1__0__Impl rule__TimeBound__Group_1__1 ;
    public final void rule__TimeBound__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3298:1: ( rule__TimeBound__Group_1__0__Impl rule__TimeBound__Group_1__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3299:2: rule__TimeBound__Group_1__0__Impl rule__TimeBound__Group_1__1
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__0__Impl_in_rule__TimeBound__Group_1__06630);
            rule__TimeBound__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_1__1_in_rule__TimeBound__Group_1__06633);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3306:1: rule__TimeBound__Group_1__0__Impl : ( '[' ) ;
    public final void rule__TimeBound__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3310:1: ( ( '[' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3311:1: ( '[' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3311:1: ( '[' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3312:1: '['
            {
             before(grammarAccess.getTimeBoundAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__TimeBound__Group_1__0__Impl6661); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3325:1: rule__TimeBound__Group_1__1 : rule__TimeBound__Group_1__1__Impl rule__TimeBound__Group_1__2 ;
    public final void rule__TimeBound__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3329:1: ( rule__TimeBound__Group_1__1__Impl rule__TimeBound__Group_1__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3330:2: rule__TimeBound__Group_1__1__Impl rule__TimeBound__Group_1__2
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__1__Impl_in_rule__TimeBound__Group_1__16692);
            rule__TimeBound__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_1__2_in_rule__TimeBound__Group_1__16695);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3337:1: rule__TimeBound__Group_1__1__Impl : ( ( rule__TimeBound__FromAssignment_1_1 ) ) ;
    public final void rule__TimeBound__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3341:1: ( ( ( rule__TimeBound__FromAssignment_1_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3342:1: ( ( rule__TimeBound__FromAssignment_1_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3342:1: ( ( rule__TimeBound__FromAssignment_1_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3343:1: ( rule__TimeBound__FromAssignment_1_1 )
            {
             before(grammarAccess.getTimeBoundAccess().getFromAssignment_1_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3344:1: ( rule__TimeBound__FromAssignment_1_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3344:2: rule__TimeBound__FromAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TimeBound__FromAssignment_1_1_in_rule__TimeBound__Group_1__1__Impl6722);
            rule__TimeBound__FromAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeBoundAccess().getFromAssignment_1_1()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3354:1: rule__TimeBound__Group_1__2 : rule__TimeBound__Group_1__2__Impl rule__TimeBound__Group_1__3 ;
    public final void rule__TimeBound__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3358:1: ( rule__TimeBound__Group_1__2__Impl rule__TimeBound__Group_1__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3359:2: rule__TimeBound__Group_1__2__Impl rule__TimeBound__Group_1__3
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__2__Impl_in_rule__TimeBound__Group_1__26752);
            rule__TimeBound__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_1__3_in_rule__TimeBound__Group_1__26755);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3366:1: rule__TimeBound__Group_1__2__Impl : ( ( rule__TimeBound__OperatorAssignment_1_2 ) ) ;
    public final void rule__TimeBound__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3370:1: ( ( ( rule__TimeBound__OperatorAssignment_1_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3371:1: ( ( rule__TimeBound__OperatorAssignment_1_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3371:1: ( ( rule__TimeBound__OperatorAssignment_1_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3372:1: ( rule__TimeBound__OperatorAssignment_1_2 )
            {
             before(grammarAccess.getTimeBoundAccess().getOperatorAssignment_1_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3373:1: ( rule__TimeBound__OperatorAssignment_1_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3373:2: rule__TimeBound__OperatorAssignment_1_2
            {
            pushFollow(FOLLOW_rule__TimeBound__OperatorAssignment_1_2_in_rule__TimeBound__Group_1__2__Impl6782);
            rule__TimeBound__OperatorAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTimeBoundAccess().getOperatorAssignment_1_2()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3383:1: rule__TimeBound__Group_1__3 : rule__TimeBound__Group_1__3__Impl rule__TimeBound__Group_1__4 ;
    public final void rule__TimeBound__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3387:1: ( rule__TimeBound__Group_1__3__Impl rule__TimeBound__Group_1__4 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3388:2: rule__TimeBound__Group_1__3__Impl rule__TimeBound__Group_1__4
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__3__Impl_in_rule__TimeBound__Group_1__36812);
            rule__TimeBound__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_1__4_in_rule__TimeBound__Group_1__36815);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3395:1: rule__TimeBound__Group_1__3__Impl : ( ( rule__TimeBound__ToAssignment_1_3 ) ) ;
    public final void rule__TimeBound__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3399:1: ( ( ( rule__TimeBound__ToAssignment_1_3 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3400:1: ( ( rule__TimeBound__ToAssignment_1_3 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3400:1: ( ( rule__TimeBound__ToAssignment_1_3 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3401:1: ( rule__TimeBound__ToAssignment_1_3 )
            {
             before(grammarAccess.getTimeBoundAccess().getToAssignment_1_3()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3402:1: ( rule__TimeBound__ToAssignment_1_3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3402:2: rule__TimeBound__ToAssignment_1_3
            {
            pushFollow(FOLLOW_rule__TimeBound__ToAssignment_1_3_in_rule__TimeBound__Group_1__3__Impl6842);
            rule__TimeBound__ToAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getTimeBoundAccess().getToAssignment_1_3()); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3412:1: rule__TimeBound__Group_1__4 : rule__TimeBound__Group_1__4__Impl ;
    public final void rule__TimeBound__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3416:1: ( rule__TimeBound__Group_1__4__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3417:2: rule__TimeBound__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__4__Impl_in_rule__TimeBound__Group_1__46872);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3423:1: rule__TimeBound__Group_1__4__Impl : ( ']' ) ;
    public final void rule__TimeBound__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3427:1: ( ( ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3428:1: ( ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3428:1: ( ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3429:1: ']'
            {
             before(grammarAccess.getTimeBoundAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,21,FOLLOW_21_in_rule__TimeBound__Group_1__4__Impl6900); 
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


    // $ANTLR start "rule__Start__RuleAssignment_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3453:1: rule__Start__RuleAssignment_1 : ( ruleFragment ) ;
    public final void rule__Start__RuleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3457:1: ( ( ruleFragment ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3458:1: ( ruleFragment )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3458:1: ( ruleFragment )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3459:1: ruleFragment
            {
             before(grammarAccess.getStartAccess().getRuleFragmentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFragment_in_rule__Start__RuleAssignment_16946);
            ruleFragment();

            state._fsp--;

             after(grammarAccess.getStartAccess().getRuleFragmentParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Start__RuleAssignment_1"


    // $ANTLR start "rule__Comment__CommentAssignment"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3468:1: rule__Comment__CommentAssignment : ( RULE_SL_COMMENT ) ;
    public final void rule__Comment__CommentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3472:1: ( ( RULE_SL_COMMENT ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3473:1: ( RULE_SL_COMMENT )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3473:1: ( RULE_SL_COMMENT )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3474:1: RULE_SL_COMMENT
            {
             before(grammarAccess.getCommentAccess().getCommentSL_COMMENTTerminalRuleCall_0()); 
            match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__Comment__CommentAssignment6977); 
             after(grammarAccess.getCommentAccess().getCommentSL_COMMENTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Comment__CommentAssignment"


    // $ANTLR start "rule__SteadyState__BoundAssignment_2_0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3483:1: rule__SteadyState__BoundAssignment_2_0 : ( ruleCompareProbability ) ;
    public final void rule__SteadyState__BoundAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3487:1: ( ( ruleCompareProbability ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3488:1: ( ruleCompareProbability )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3488:1: ( ruleCompareProbability )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3489:1: ruleCompareProbability
            {
             before(grammarAccess.getSteadyStateAccess().getBoundCompareProbabilityParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleCompareProbability_in_rule__SteadyState__BoundAssignment_2_07008);
            ruleCompareProbability();

            state._fsp--;

             after(grammarAccess.getSteadyStateAccess().getBoundCompareProbabilityParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__SteadyState__BoundAssignment_2_0"


    // $ANTLR start "rule__SteadyState__ValueAssignment_6"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3498:1: rule__SteadyState__ValueAssignment_6 : ( ruleStateFormula ) ;
    public final void rule__SteadyState__ValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3502:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3503:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3503:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3504:1: ruleStateFormula
            {
             before(grammarAccess.getSteadyStateAccess().getValueStateFormulaParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__SteadyState__ValueAssignment_67039);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getSteadyStateAccess().getValueStateFormulaParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__SteadyState__ValueAssignment_6"


    // $ANTLR start "rule__QuantifiedProbability__ValueAssignment_5"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3513:1: rule__QuantifiedProbability__ValueAssignment_5 : ( rulePathFormula ) ;
    public final void rule__QuantifiedProbability__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3517:1: ( ( rulePathFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3518:1: ( rulePathFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3518:1: ( rulePathFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3519:1: rulePathFormula
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getValuePathFormulaParserRuleCall_5_0()); 
            pushFollow(FOLLOW_rulePathFormula_in_rule__QuantifiedProbability__ValueAssignment_57070);
            rulePathFormula();

            state._fsp--;

             after(grammarAccess.getQuantifiedProbabilityAccess().getValuePathFormulaParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__QuantifiedProbability__ValueAssignment_5"


    // $ANTLR start "rule__BooleanRule__ValueAssignment"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3528:1: rule__BooleanRule__ValueAssignment : ( ruleStateFormula ) ;
    public final void rule__BooleanRule__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3532:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3533:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3533:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3534:1: ruleStateFormula
            {
             before(grammarAccess.getBooleanRuleAccess().getValueStateFormulaParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__BooleanRule__ValueAssignment7101);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getBooleanRuleAccess().getValueStateFormulaParserRuleCall_0()); 

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
    // $ANTLR end "rule__BooleanRule__ValueAssignment"


    // $ANTLR start "rule__StateFormula__LeftAssignment_0_2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3543:1: rule__StateFormula__LeftAssignment_0_2 : ( ruleStateFormula ) ;
    public final void rule__StateFormula__LeftAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3547:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3548:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3548:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3549:1: ruleStateFormula
            {
             before(grammarAccess.getStateFormulaAccess().getLeftStateFormulaParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__StateFormula__LeftAssignment_0_27132);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getStateFormulaAccess().getLeftStateFormulaParserRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__StateFormula__LeftAssignment_0_2"


    // $ANTLR start "rule__StateFormula__RightAssignment_0_3_0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3558:1: rule__StateFormula__RightAssignment_0_3_0 : ( ruleJunction ) ;
    public final void rule__StateFormula__RightAssignment_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3562:1: ( ( ruleJunction ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3563:1: ( ruleJunction )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3563:1: ( ruleJunction )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3564:1: ruleJunction
            {
             before(grammarAccess.getStateFormulaAccess().getRightJunctionParserRuleCall_0_3_0_0()); 
            pushFollow(FOLLOW_ruleJunction_in_rule__StateFormula__RightAssignment_0_3_07163);
            ruleJunction();

            state._fsp--;

             after(grammarAccess.getStateFormulaAccess().getRightJunctionParserRuleCall_0_3_0_0()); 

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
    // $ANTLR end "rule__StateFormula__RightAssignment_0_3_0"


    // $ANTLR start "rule__StateFormula__RightAssignment_0_3_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3573:1: rule__StateFormula__RightAssignment_0_3_1 : ( ruleImplication ) ;
    public final void rule__StateFormula__RightAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3577:1: ( ( ruleImplication ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3578:1: ( ruleImplication )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3578:1: ( ruleImplication )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3579:1: ruleImplication
            {
             before(grammarAccess.getStateFormulaAccess().getRightImplicationParserRuleCall_0_3_1_0()); 
            pushFollow(FOLLOW_ruleImplication_in_rule__StateFormula__RightAssignment_0_3_17194);
            ruleImplication();

            state._fsp--;

             after(grammarAccess.getStateFormulaAccess().getRightImplicationParserRuleCall_0_3_1_0()); 

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
    // $ANTLR end "rule__StateFormula__RightAssignment_0_3_1"


    // $ANTLR start "rule__StateFormula__LeftAssignment_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3588:1: rule__StateFormula__LeftAssignment_1 : ( ( rule__StateFormula__LeftAlternatives_1_0 ) ) ;
    public final void rule__StateFormula__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3592:1: ( ( ( rule__StateFormula__LeftAlternatives_1_0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3593:1: ( ( rule__StateFormula__LeftAlternatives_1_0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3593:1: ( ( rule__StateFormula__LeftAlternatives_1_0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3594:1: ( rule__StateFormula__LeftAlternatives_1_0 )
            {
             before(grammarAccess.getStateFormulaAccess().getLeftAlternatives_1_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3595:1: ( rule__StateFormula__LeftAlternatives_1_0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3595:2: rule__StateFormula__LeftAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__StateFormula__LeftAlternatives_1_0_in_rule__StateFormula__LeftAssignment_17225);
            rule__StateFormula__LeftAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getStateFormulaAccess().getLeftAlternatives_1_0()); 

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
    // $ANTLR end "rule__StateFormula__LeftAssignment_1"


    // $ANTLR start "rule__Conjunction__RightAssignment_2_2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3604:1: rule__Conjunction__RightAssignment_2_2 : ( ruleStateFormula ) ;
    public final void rule__Conjunction__RightAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3608:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3609:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3609:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3610:1: ruleStateFormula
            {
             before(grammarAccess.getConjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Conjunction__RightAssignment_2_27258);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3619:1: rule__Disjunction__RightAssignment_2_2 : ( ruleStateFormula ) ;
    public final void rule__Disjunction__RightAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3623:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3624:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3624:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3625:1: ruleStateFormula
            {
             before(grammarAccess.getDisjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Disjunction__RightAssignment_2_27289);
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


    // $ANTLR start "rule__Implication__RightAssignment_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3634:1: rule__Implication__RightAssignment_1 : ( ruleStateFormula ) ;
    public final void rule__Implication__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3638:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3639:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3639:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3640:1: ruleStateFormula
            {
             before(grammarAccess.getImplicationAccess().getRightStateFormulaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Implication__RightAssignment_17320);
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


    // $ANTLR start "rule__Probability__ComparatorAssignment_3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3649:1: rule__Probability__ComparatorAssignment_3 : ( ruleCompareProbability ) ;
    public final void rule__Probability__ComparatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3653:1: ( ( ruleCompareProbability ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3654:1: ( ruleCompareProbability )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3654:1: ( ruleCompareProbability )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3655:1: ruleCompareProbability
            {
             before(grammarAccess.getProbabilityAccess().getComparatorCompareProbabilityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCompareProbability_in_rule__Probability__ComparatorAssignment_37351);
            ruleCompareProbability();

            state._fsp--;

             after(grammarAccess.getProbabilityAccess().getComparatorCompareProbabilityParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Probability__ComparatorAssignment_3"


    // $ANTLR start "rule__Probability__PathAssignment_6"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3664:1: rule__Probability__PathAssignment_6 : ( rulePathFormula ) ;
    public final void rule__Probability__PathAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3668:1: ( ( rulePathFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3669:1: ( rulePathFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3669:1: ( rulePathFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3670:1: rulePathFormula
            {
             before(grammarAccess.getProbabilityAccess().getPathPathFormulaParserRuleCall_6_0()); 
            pushFollow(FOLLOW_rulePathFormula_in_rule__Probability__PathAssignment_67382);
            rulePathFormula();

            state._fsp--;

             after(grammarAccess.getProbabilityAccess().getPathPathFormulaParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Probability__PathAssignment_6"


    // $ANTLR start "rule__State__ValueAssignment_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3679:1: rule__State__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__State__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3683:1: ( ( RULE_STRING ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3684:1: ( RULE_STRING )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3684:1: ( RULE_STRING )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3685:1: RULE_STRING
            {
             before(grammarAccess.getStateAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__State__ValueAssignment_17413); 
             after(grammarAccess.getStateAccess().getValueSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__State__ValueAssignment_1"


    // $ANTLR start "rule__Label__ValueAssignment_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3694:1: rule__Label__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Label__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3698:1: ( ( RULE_STRING ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3699:1: ( RULE_STRING )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3699:1: ( RULE_STRING )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3700:1: RULE_STRING
            {
             before(grammarAccess.getLabelAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Label__ValueAssignment_17444); 
             after(grammarAccess.getLabelAccess().getValueSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Label__ValueAssignment_1"


    // $ANTLR start "rule__Boolean__ValueAssignment"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3709:1: rule__Boolean__ValueAssignment : ( RULE_BOOL ) ;
    public final void rule__Boolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3713:1: ( ( RULE_BOOL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3714:1: ( RULE_BOOL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3714:1: ( RULE_BOOL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3715:1: RULE_BOOL
            {
             before(grammarAccess.getBooleanAccess().getValueBOOLTerminalRuleCall_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__Boolean__ValueAssignment7475); 
             after(grammarAccess.getBooleanAccess().getValueBOOLTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Boolean__ValueAssignment"


    // $ANTLR start "rule__Until__LeftAssignment_0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3724:1: rule__Until__LeftAssignment_0 : ( ruleStateFormula ) ;
    public final void rule__Until__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3728:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3729:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3729:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3730:1: ruleStateFormula
            {
             before(grammarAccess.getUntilAccess().getLeftStateFormulaParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Until__LeftAssignment_07506);
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


    // $ANTLR start "rule__Until__TypeAssignment_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3739:1: rule__Until__TypeAssignment_1 : ( ( rule__Until__TypeAlternatives_1_0 ) ) ;
    public final void rule__Until__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3743:1: ( ( ( rule__Until__TypeAlternatives_1_0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3744:1: ( ( rule__Until__TypeAlternatives_1_0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3744:1: ( ( rule__Until__TypeAlternatives_1_0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3745:1: ( rule__Until__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getUntilAccess().getTypeAlternatives_1_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3746:1: ( rule__Until__TypeAlternatives_1_0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3746:2: rule__Until__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Until__TypeAlternatives_1_0_in_rule__Until__TypeAssignment_17537);
            rule__Until__TypeAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getUntilAccess().getTypeAlternatives_1_0()); 

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
    // $ANTLR end "rule__Until__TypeAssignment_1"


    // $ANTLR start "rule__Until__BoundAssignment_2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3755:1: rule__Until__BoundAssignment_2 : ( ruleTimeBound ) ;
    public final void rule__Until__BoundAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3759:1: ( ( ruleTimeBound ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3760:1: ( ruleTimeBound )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3760:1: ( ruleTimeBound )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3761:1: ruleTimeBound
            {
             before(grammarAccess.getUntilAccess().getBoundTimeBoundParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTimeBound_in_rule__Until__BoundAssignment_27570);
            ruleTimeBound();

            state._fsp--;

             after(grammarAccess.getUntilAccess().getBoundTimeBoundParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Until__BoundAssignment_2"


    // $ANTLR start "rule__Until__RightAssignment_3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3770:1: rule__Until__RightAssignment_3 : ( ruleStateFormula ) ;
    public final void rule__Until__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3774:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3775:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3775:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3776:1: ruleStateFormula
            {
             before(grammarAccess.getUntilAccess().getRightStateFormulaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Until__RightAssignment_37601);
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


    // $ANTLR start "rule__Next__BoundAssignment_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3785:1: rule__Next__BoundAssignment_1 : ( ruleTimeBound ) ;
    public final void rule__Next__BoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3789:1: ( ( ruleTimeBound ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3790:1: ( ruleTimeBound )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3790:1: ( ruleTimeBound )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3791:1: ruleTimeBound
            {
             before(grammarAccess.getNextAccess().getBoundTimeBoundParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTimeBound_in_rule__Next__BoundAssignment_17632);
            ruleTimeBound();

            state._fsp--;

             after(grammarAccess.getNextAccess().getBoundTimeBoundParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Next__BoundAssignment_1"


    // $ANTLR start "rule__Next__ValueAssignment_2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3800:1: rule__Next__ValueAssignment_2 : ( ruleStateFormula ) ;
    public final void rule__Next__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3804:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3805:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3805:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3806:1: ruleStateFormula
            {
             before(grammarAccess.getNextAccess().getValueStateFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Next__ValueAssignment_27663);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getNextAccess().getValueStateFormulaParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Next__ValueAssignment_2"


    // $ANTLR start "rule__Future__BoundAssignment_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3815:1: rule__Future__BoundAssignment_1 : ( ruleTimeBound ) ;
    public final void rule__Future__BoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3819:1: ( ( ruleTimeBound ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3820:1: ( ruleTimeBound )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3820:1: ( ruleTimeBound )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3821:1: ruleTimeBound
            {
             before(grammarAccess.getFutureAccess().getBoundTimeBoundParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTimeBound_in_rule__Future__BoundAssignment_17694);
            ruleTimeBound();

            state._fsp--;

             after(grammarAccess.getFutureAccess().getBoundTimeBoundParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Future__BoundAssignment_1"


    // $ANTLR start "rule__Future__ValueAssignment_2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3830:1: rule__Future__ValueAssignment_2 : ( ruleStateFormula ) ;
    public final void rule__Future__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3834:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3835:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3835:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3836:1: ruleStateFormula
            {
             before(grammarAccess.getFutureAccess().getValueStateFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Future__ValueAssignment_27725);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getFutureAccess().getValueStateFormulaParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Future__ValueAssignment_2"


    // $ANTLR start "rule__Globally__BoundAssignment_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3845:1: rule__Globally__BoundAssignment_1 : ( ruleTimeBound ) ;
    public final void rule__Globally__BoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3849:1: ( ( ruleTimeBound ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3850:1: ( ruleTimeBound )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3850:1: ( ruleTimeBound )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3851:1: ruleTimeBound
            {
             before(grammarAccess.getGloballyAccess().getBoundTimeBoundParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTimeBound_in_rule__Globally__BoundAssignment_17756);
            ruleTimeBound();

            state._fsp--;

             after(grammarAccess.getGloballyAccess().getBoundTimeBoundParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Globally__BoundAssignment_1"


    // $ANTLR start "rule__Globally__ValueAssignment_2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3860:1: rule__Globally__ValueAssignment_2 : ( ruleStateFormula ) ;
    public final void rule__Globally__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3864:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3865:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3865:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3866:1: ruleStateFormula
            {
             before(grammarAccess.getGloballyAccess().getValueStateFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Globally__ValueAssignment_27787);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getGloballyAccess().getValueStateFormulaParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Globally__ValueAssignment_2"


    // $ANTLR start "rule__CompareProbability__OperatorAssignment_0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3875:1: rule__CompareProbability__OperatorAssignment_0 : ( RULE_COMPARATOR ) ;
    public final void rule__CompareProbability__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3879:1: ( ( RULE_COMPARATOR ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3880:1: ( RULE_COMPARATOR )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3880:1: ( RULE_COMPARATOR )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3881:1: RULE_COMPARATOR
            {
             before(grammarAccess.getCompareProbabilityAccess().getOperatorCOMPARATORTerminalRuleCall_0_0()); 
            match(input,RULE_COMPARATOR,FOLLOW_RULE_COMPARATOR_in_rule__CompareProbability__OperatorAssignment_07818); 
             after(grammarAccess.getCompareProbabilityAccess().getOperatorCOMPARATORTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__CompareProbability__OperatorAssignment_0"


    // $ANTLR start "rule__CompareProbability__ValueAssignment_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3890:1: rule__CompareProbability__ValueAssignment_1 : ( RULE_DOUBLE ) ;
    public final void rule__CompareProbability__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3894:1: ( ( RULE_DOUBLE ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3895:1: ( RULE_DOUBLE )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3895:1: ( RULE_DOUBLE )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3896:1: RULE_DOUBLE
            {
             before(grammarAccess.getCompareProbabilityAccess().getValueDOUBLETerminalRuleCall_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__CompareProbability__ValueAssignment_17849); 
             after(grammarAccess.getCompareProbabilityAccess().getValueDOUBLETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__CompareProbability__ValueAssignment_1"


    // $ANTLR start "rule__TimeBound__OperatorAssignment_0_0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3905:1: rule__TimeBound__OperatorAssignment_0_0 : ( ( rule__TimeBound__OperatorAlternatives_0_0_0 ) ) ;
    public final void rule__TimeBound__OperatorAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3909:1: ( ( ( rule__TimeBound__OperatorAlternatives_0_0_0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3910:1: ( ( rule__TimeBound__OperatorAlternatives_0_0_0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3910:1: ( ( rule__TimeBound__OperatorAlternatives_0_0_0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3911:1: ( rule__TimeBound__OperatorAlternatives_0_0_0 )
            {
             before(grammarAccess.getTimeBoundAccess().getOperatorAlternatives_0_0_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3912:1: ( rule__TimeBound__OperatorAlternatives_0_0_0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3912:2: rule__TimeBound__OperatorAlternatives_0_0_0
            {
            pushFollow(FOLLOW_rule__TimeBound__OperatorAlternatives_0_0_0_in_rule__TimeBound__OperatorAssignment_0_07880);
            rule__TimeBound__OperatorAlternatives_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getTimeBoundAccess().getOperatorAlternatives_0_0_0()); 

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
    // $ANTLR end "rule__TimeBound__OperatorAssignment_0_0"


    // $ANTLR start "rule__TimeBound__ValueAssignment_0_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3921:1: rule__TimeBound__ValueAssignment_0_1 : ( RULE_DOUBLE ) ;
    public final void rule__TimeBound__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3925:1: ( ( RULE_DOUBLE ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3926:1: ( RULE_DOUBLE )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3926:1: ( RULE_DOUBLE )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3927:1: RULE_DOUBLE
            {
             before(grammarAccess.getTimeBoundAccess().getValueDOUBLETerminalRuleCall_0_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__TimeBound__ValueAssignment_0_17913); 
             after(grammarAccess.getTimeBoundAccess().getValueDOUBLETerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__TimeBound__ValueAssignment_0_1"


    // $ANTLR start "rule__TimeBound__FromAssignment_1_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3936:1: rule__TimeBound__FromAssignment_1_1 : ( RULE_DOUBLE ) ;
    public final void rule__TimeBound__FromAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3940:1: ( ( RULE_DOUBLE ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3941:1: ( RULE_DOUBLE )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3941:1: ( RULE_DOUBLE )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3942:1: RULE_DOUBLE
            {
             before(grammarAccess.getTimeBoundAccess().getFromDOUBLETerminalRuleCall_1_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__TimeBound__FromAssignment_1_17944); 
             after(grammarAccess.getTimeBoundAccess().getFromDOUBLETerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__TimeBound__FromAssignment_1_1"


    // $ANTLR start "rule__TimeBound__OperatorAssignment_1_2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3951:1: rule__TimeBound__OperatorAssignment_1_2 : ( ( ',' ) ) ;
    public final void rule__TimeBound__OperatorAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3955:1: ( ( ( ',' ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3956:1: ( ( ',' ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3956:1: ( ( ',' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3957:1: ( ',' )
            {
             before(grammarAccess.getTimeBoundAccess().getOperatorCommaKeyword_1_2_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3958:1: ( ',' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3959:1: ','
            {
             before(grammarAccess.getTimeBoundAccess().getOperatorCommaKeyword_1_2_0()); 
            match(input,34,FOLLOW_34_in_rule__TimeBound__OperatorAssignment_1_27980); 
             after(grammarAccess.getTimeBoundAccess().getOperatorCommaKeyword_1_2_0()); 

            }

             after(grammarAccess.getTimeBoundAccess().getOperatorCommaKeyword_1_2_0()); 

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
    // $ANTLR end "rule__TimeBound__OperatorAssignment_1_2"


    // $ANTLR start "rule__TimeBound__ToAssignment_1_3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3974:1: rule__TimeBound__ToAssignment_1_3 : ( RULE_DOUBLE ) ;
    public final void rule__TimeBound__ToAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3978:1: ( ( RULE_DOUBLE ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3979:1: ( RULE_DOUBLE )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3979:1: ( RULE_DOUBLE )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3980:1: RULE_DOUBLE
            {
             before(grammarAccess.getTimeBoundAccess().getToDOUBLETerminalRuleCall_1_3_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__TimeBound__ToAssignment_1_38019); 
             after(grammarAccess.getTimeBoundAccess().getToDOUBLETerminalRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__TimeBound__ToAssignment_1_3"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\6\uffff";
    static final String DFA2_eofS =
        "\6\uffff";
    static final String DFA2_minS =
        "\1\7\1\uffff\1\4\1\uffff\1\4\1\uffff";
    static final String DFA2_maxS =
        "\1\36\1\uffff\1\16\1\uffff\1\16\1\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\uffff\1\3";
    static final String DFA2_specialS =
        "\6\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\1\13\uffff\1\3\2\uffff\1\2\1\1\1\uffff\1\1\3\uffff\2\1",
            "",
            "\1\1\1\4\10\uffff\1\5",
            "",
            "\1\1\1\4\10\uffff\1\5",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "830:1: rule__Rule__Alternatives : ( ( ruleBooleanRule ) | ( ruleSteadyState ) | ( ruleQuantifiedProbability ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleStart_in_entryRuleStart61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStart68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Start__Group__0_in_ruleStart94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFragment_in_entryRuleFragment121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFragment128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fragment__Alternatives_in_ruleFragment154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment__CommentAssignment_in_ruleComment214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Alternatives_in_ruleRule283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSteadyState_in_entryRuleSteadyState310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSteadyState317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__0_in_ruleSteadyState343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedProbability_in_entryRuleQuantifiedProbability370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifiedProbability377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__0_in_ruleQuantifiedProbability403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanRule_in_entryRuleBooleanRule430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanRule437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanRule__ValueAssignment_in_ruleBooleanRule463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_entryRuleStateFormula490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateFormula497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Alternatives_in_ruleStateFormula523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__0_in_ruleNegation583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJunction_in_entryRuleJunction615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJunction622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Junction__Alternatives_in_ruleJunction652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__0_in_ruleConjunction712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__0_in_ruleDisjunction772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication804 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group__0_in_ruleImplication841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbability_in_entryRuleProbability868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProbability875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__0_in_ruleProbability901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel1048 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0_in_ruleLabel1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean1108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__ValueAssignment_in_ruleBoolean1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathFormula_in_entryRulePathFormula1173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathFormula1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathFormula__Alternatives_in_rulePathFormula1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUntil_in_entryRuleUntil1237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUntil1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Group__0_in_ruleUntil1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNext_in_entryRuleNext1297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNext1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__Group__0_in_ruleNext1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuture_in_entryRuleFuture1357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuture1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__Group__0_in_ruleFuture1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobally_in_entryRuleGlobally1417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobally1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__Group__0_in_ruleGlobally1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_entryRuleCompareProbability1482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareProbability1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group__0_in_ruleCompareProbability1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_entryRuleTimeBound1551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeBound1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Alternatives_in_ruleTimeBound1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_rule__Fragment__Alternatives1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Fragment__Alternatives1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanRule_in_rule__Rule__Alternatives1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSteadyState_in_rule__Rule__Alternatives1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedProbability_in_rule__Rule__Alternatives1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__BoundAssignment_2_0_in_rule__SteadyState__Alternatives_21739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SteadyState__Alternatives_21758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__0_in_rule__StateFormula__Alternatives1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__LeftAssignment_1_in_rule__StateFormula__Alternatives1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__RightAssignment_0_3_0_in_rule__StateFormula__Alternatives_0_31843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__RightAssignment_0_3_1_in_rule__StateFormula__Alternatives_0_31861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_rule__StateFormula__LeftAlternatives_1_01894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__StateFormula__LeftAlternatives_1_01911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbability_in_rule__StateFormula__LeftAlternatives_1_01928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Junction__Alternatives1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_rule__Junction__Alternatives1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Atomic__Alternatives2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__Atomic__Alternatives2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__Atomic__Alternatives2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNext_in_rule__PathFormula__Alternatives2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUntil_in_rule__PathFormula__Alternatives2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuture_in_rule__PathFormula__Alternatives2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobally_in_rule__PathFormula__Alternatives2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Until__TypeAlternatives_1_02159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Until__TypeAlternatives_1_02179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Until__TypeAlternatives_1_02199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0__0_in_rule__TimeBound__Alternatives2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__0_in_rule__TimeBound__Alternatives2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMPARATOR_in_rule__TimeBound__OperatorAlternatives_0_0_02284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TimeBound__OperatorAlternatives_0_0_02302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Start__Group__0__Impl_in_rule__Start__Group__02334 = new BitSet(new long[]{0x0000000062C800A0L});
    public static final BitSet FOLLOW_rule__Start__Group__1_in_rule__Start__Group__02337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Start__Group__1__Impl_in_rule__Start__Group__12395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Start__RuleAssignment_1_in_rule__Start__Group__1__Impl2422 = new BitSet(new long[]{0x0000000062C800A2L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__0__Impl_in_rule__SteadyState__Group__02457 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__1_in_rule__SteadyState__Group__02460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SteadyState__Group__0__Impl2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__1__Impl_in_rule__SteadyState__Group__12519 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__2_in_rule__SteadyState__Group__12522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__SteadyState__Group__1__Impl2550 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__2__Impl_in_rule__SteadyState__Group__22581 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__3_in_rule__SteadyState__Group__22584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Alternatives_2_in_rule__SteadyState__Group__2__Impl2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__3__Impl_in_rule__SteadyState__Group__32641 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__4_in_rule__SteadyState__Group__32644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__SteadyState__Group__3__Impl2672 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__4__Impl_in_rule__SteadyState__Group__42703 = new BitSet(new long[]{0x0000000062C000A0L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__5_in_rule__SteadyState__Group__42706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SteadyState__Group__4__Impl2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__5__Impl_in_rule__SteadyState__Group__52765 = new BitSet(new long[]{0x0000000062C000A0L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__6_in_rule__SteadyState__Group__52768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__SteadyState__Group__5__Impl2796 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__6__Impl_in_rule__SteadyState__Group__62827 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__7_in_rule__SteadyState__Group__62830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__ValueAssignment_6_in_rule__SteadyState__Group__6__Impl2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__7__Impl_in_rule__SteadyState__Group__72887 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__8_in_rule__SteadyState__Group__72890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__SteadyState__Group__7__Impl2918 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__8__Impl_in_rule__SteadyState__Group__82949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SteadyState__Group__8__Impl2977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__0__Impl_in_rule__QuantifiedProbability__Group__03026 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__1_in_rule__QuantifiedProbability__Group__03029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__QuantifiedProbability__Group__0__Impl3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__1__Impl_in_rule__QuantifiedProbability__Group__13088 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__2_in_rule__QuantifiedProbability__Group__13091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__QuantifiedProbability__Group__1__Impl3119 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__2__Impl_in_rule__QuantifiedProbability__Group__23150 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__3_in_rule__QuantifiedProbability__Group__23153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__QuantifiedProbability__Group__2__Impl3181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__3__Impl_in_rule__QuantifiedProbability__Group__33212 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__4_in_rule__QuantifiedProbability__Group__33215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__QuantifiedProbability__Group__3__Impl3243 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__4__Impl_in_rule__QuantifiedProbability__Group__43274 = new BitSet(new long[]{0x00000003E2C00080L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__5_in_rule__QuantifiedProbability__Group__43277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__QuantifiedProbability__Group__4__Impl3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__5__Impl_in_rule__QuantifiedProbability__Group__53336 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__6_in_rule__QuantifiedProbability__Group__53339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__ValueAssignment_5_in_rule__QuantifiedProbability__Group__5__Impl3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__6__Impl_in_rule__QuantifiedProbability__Group__63396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__QuantifiedProbability__Group__6__Impl3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__0__Impl_in_rule__StateFormula__Group_0__03469 = new BitSet(new long[]{0x0000000062C000A0L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__1_in_rule__StateFormula__Group_0__03472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__StateFormula__Group_0__0__Impl3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__1__Impl_in_rule__StateFormula__Group_0__13531 = new BitSet(new long[]{0x0000000062C000A0L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__2_in_rule__StateFormula__Group_0__13534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__StateFormula__Group_0__1__Impl3562 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__2__Impl_in_rule__StateFormula__Group_0__23593 = new BitSet(new long[]{0x000000001D000020L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__3_in_rule__StateFormula__Group_0__23596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__LeftAssignment_0_2_in_rule__StateFormula__Group_0__2__Impl3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__3__Impl_in_rule__StateFormula__Group_0__33653 = new BitSet(new long[]{0x000000001D000020L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__4_in_rule__StateFormula__Group_0__33656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Alternatives_0_3_in_rule__StateFormula__Group_0__3__Impl3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__4__Impl_in_rule__StateFormula__Group_0__43714 = new BitSet(new long[]{0x000000001D000020L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__5_in_rule__StateFormula__Group_0__43717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__StateFormula__Group_0__4__Impl3745 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__5__Impl_in_rule__StateFormula__Group_0__53776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__StateFormula__Group_0__5__Impl3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__0__Impl_in_rule__Negation__Group__03847 = new BitSet(new long[]{0x0000000062C00080L});
    public static final BitSet FOLLOW_rule__Negation__Group__1_in_rule__Negation__Group__03850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Negation__Group__0__Impl3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__1__Impl_in_rule__Negation__Group__13909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Negation__Group__1__Impl3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__03969 = new BitSet(new long[]{0x0000000062C00080L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__03972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Conjunction__Group__0__Impl4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__14031 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__2_in_rule__Conjunction__Group__14034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Conjunction__Group__1__Impl4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__2__Impl_in_rule__Conjunction__Group__24090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__0_in_rule__Conjunction__Group__2__Impl4117 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__0__Impl_in_rule__Conjunction__Group_2__04154 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__1_in_rule__Conjunction__Group_2__04157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__1__Impl_in_rule__Conjunction__Group_2__14215 = new BitSet(new long[]{0x0000000062C00080L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__2_in_rule__Conjunction__Group_2__14218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Conjunction__Group_2__1__Impl4246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__2__Impl_in_rule__Conjunction__Group_2__24277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__RightAssignment_2_2_in_rule__Conjunction__Group_2__2__Impl4304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__0__Impl_in_rule__Disjunction__Group__04340 = new BitSet(new long[]{0x0000000062C00080L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__1_in_rule__Disjunction__Group__04343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Disjunction__Group__0__Impl4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__1__Impl_in_rule__Disjunction__Group__14402 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__2_in_rule__Disjunction__Group__14405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Disjunction__Group__1__Impl4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__2__Impl_in_rule__Disjunction__Group__24461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__0_in_rule__Disjunction__Group__2__Impl4488 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__0__Impl_in_rule__Disjunction__Group_2__04525 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__1_in_rule__Disjunction__Group_2__04528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__1__Impl_in_rule__Disjunction__Group_2__14586 = new BitSet(new long[]{0x0000000062C00080L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__2_in_rule__Disjunction__Group_2__14589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Disjunction__Group_2__1__Impl4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__2__Impl_in_rule__Disjunction__Group_2__24648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__RightAssignment_2_2_in_rule__Disjunction__Group_2__2__Impl4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group__0__Impl_in_rule__Implication__Group__04711 = new BitSet(new long[]{0x0000000062C00080L});
    public static final BitSet FOLLOW_rule__Implication__Group__1_in_rule__Implication__Group__04714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Implication__Group__0__Impl4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group__1__Impl_in_rule__Implication__Group__14773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__RightAssignment_1_in_rule__Implication__Group__1__Impl4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__0__Impl_in_rule__Probability__Group__04834 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Probability__Group__1_in_rule__Probability__Group__04837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Probability__Group__0__Impl4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__1__Impl_in_rule__Probability__Group__14896 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Probability__Group__2_in_rule__Probability__Group__14899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__Probability__Group__1__Impl4927 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Probability__Group__2__Impl_in_rule__Probability__Group__24958 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Probability__Group__3_in_rule__Probability__Group__24961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__3__Impl_in_rule__Probability__Group__35019 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__Probability__Group__4_in_rule__Probability__Group__35022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__ComparatorAssignment_3_in_rule__Probability__Group__3__Impl5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__4__Impl_in_rule__Probability__Group__45079 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__Probability__Group__5_in_rule__Probability__Group__45082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__Probability__Group__4__Impl5110 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Probability__Group__5__Impl_in_rule__Probability__Group__55141 = new BitSet(new long[]{0x00000003E2C00080L});
    public static final BitSet FOLLOW_rule__Probability__Group__6_in_rule__Probability__Group__55144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Probability__Group__5__Impl5172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__6__Impl_in_rule__Probability__Group__65203 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Probability__Group__7_in_rule__Probability__Group__65206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__PathAssignment_6_in_rule__Probability__Group__6__Impl5233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__7__Impl_in_rule__Probability__Group__75263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Probability__Group__7__Impl5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__05338 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__05341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__State__Group__0__Impl5369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__15400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__ValueAssignment_1_in_rule__State__Group__1__Impl5427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__05461 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Label__Group__1_in_rule__Label__Group__05464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Label__Group__0__Impl5492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__15523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__ValueAssignment_1_in_rule__Label__Group__1__Impl5550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Group__0__Impl_in_rule__Until__Group__05584 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__Until__Group__1_in_rule__Until__Group__05587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__LeftAssignment_0_in_rule__Until__Group__0__Impl5614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Group__1__Impl_in_rule__Until__Group__15644 = new BitSet(new long[]{0x0000000062D40090L});
    public static final BitSet FOLLOW_rule__Until__Group__2_in_rule__Until__Group__15647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__TypeAssignment_1_in_rule__Until__Group__1__Impl5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Group__2__Impl_in_rule__Until__Group__25704 = new BitSet(new long[]{0x0000000062D40090L});
    public static final BitSet FOLLOW_rule__Until__Group__3_in_rule__Until__Group__25707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__BoundAssignment_2_in_rule__Until__Group__2__Impl5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Group__3__Impl_in_rule__Until__Group__35765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__RightAssignment_3_in_rule__Until__Group__3__Impl5792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__Group__0__Impl_in_rule__Next__Group__05830 = new BitSet(new long[]{0x0000000062D40090L});
    public static final BitSet FOLLOW_rule__Next__Group__1_in_rule__Next__Group__05833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Next__Group__0__Impl5861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__Group__1__Impl_in_rule__Next__Group__15892 = new BitSet(new long[]{0x0000000062D40090L});
    public static final BitSet FOLLOW_rule__Next__Group__2_in_rule__Next__Group__15895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__BoundAssignment_1_in_rule__Next__Group__1__Impl5922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__Group__2__Impl_in_rule__Next__Group__25953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__ValueAssignment_2_in_rule__Next__Group__2__Impl5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__Group__0__Impl_in_rule__Future__Group__06016 = new BitSet(new long[]{0x0000000062D40090L});
    public static final BitSet FOLLOW_rule__Future__Group__1_in_rule__Future__Group__06019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Future__Group__0__Impl6047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__Group__1__Impl_in_rule__Future__Group__16078 = new BitSet(new long[]{0x0000000062D40090L});
    public static final BitSet FOLLOW_rule__Future__Group__2_in_rule__Future__Group__16081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__BoundAssignment_1_in_rule__Future__Group__1__Impl6108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__Group__2__Impl_in_rule__Future__Group__26139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__ValueAssignment_2_in_rule__Future__Group__2__Impl6166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__Group__0__Impl_in_rule__Globally__Group__06202 = new BitSet(new long[]{0x0000000062D40090L});
    public static final BitSet FOLLOW_rule__Globally__Group__1_in_rule__Globally__Group__06205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Globally__Group__0__Impl6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__Group__1__Impl_in_rule__Globally__Group__16264 = new BitSet(new long[]{0x0000000062D40090L});
    public static final BitSet FOLLOW_rule__Globally__Group__2_in_rule__Globally__Group__16267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__BoundAssignment_1_in_rule__Globally__Group__1__Impl6294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__Group__2__Impl_in_rule__Globally__Group__26325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__ValueAssignment_2_in_rule__Globally__Group__2__Impl6352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group__0__Impl_in_rule__CompareProbability__Group__06388 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group__1_in_rule__CompareProbability__Group__06391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__OperatorAssignment_0_in_rule__CompareProbability__Group__0__Impl6418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group__1__Impl_in_rule__CompareProbability__Group__16448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__ValueAssignment_1_in_rule__CompareProbability__Group__1__Impl6475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0__0__Impl_in_rule__TimeBound__Group_0__06509 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0__1_in_rule__TimeBound__Group_0__06512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__OperatorAssignment_0_0_in_rule__TimeBound__Group_0__0__Impl6539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0__1__Impl_in_rule__TimeBound__Group_0__16569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__ValueAssignment_0_1_in_rule__TimeBound__Group_0__1__Impl6596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__0__Impl_in_rule__TimeBound__Group_1__06630 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__1_in_rule__TimeBound__Group_1__06633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TimeBound__Group_1__0__Impl6661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__1__Impl_in_rule__TimeBound__Group_1__16692 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__2_in_rule__TimeBound__Group_1__16695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__FromAssignment_1_1_in_rule__TimeBound__Group_1__1__Impl6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__2__Impl_in_rule__TimeBound__Group_1__26752 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__3_in_rule__TimeBound__Group_1__26755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__OperatorAssignment_1_2_in_rule__TimeBound__Group_1__2__Impl6782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__3__Impl_in_rule__TimeBound__Group_1__36812 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__4_in_rule__TimeBound__Group_1__36815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__ToAssignment_1_3_in_rule__TimeBound__Group_1__3__Impl6842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__4__Impl_in_rule__TimeBound__Group_1__46872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TimeBound__Group_1__4__Impl6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFragment_in_rule__Start__RuleAssignment_16946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__Comment__CommentAssignment6977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_rule__SteadyState__BoundAssignment_2_07008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__SteadyState__ValueAssignment_67039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathFormula_in_rule__QuantifiedProbability__ValueAssignment_57070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__BooleanRule__ValueAssignment7101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__StateFormula__LeftAssignment_0_27132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJunction_in_rule__StateFormula__RightAssignment_0_3_07163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_rule__StateFormula__RightAssignment_0_3_17194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__LeftAlternatives_1_0_in_rule__StateFormula__LeftAssignment_17225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Conjunction__RightAssignment_2_27258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Disjunction__RightAssignment_2_27289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Implication__RightAssignment_17320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_rule__Probability__ComparatorAssignment_37351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathFormula_in_rule__Probability__PathAssignment_67382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__State__ValueAssignment_17413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Label__ValueAssignment_17444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__Boolean__ValueAssignment7475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Until__LeftAssignment_07506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__TypeAlternatives_1_0_in_rule__Until__TypeAssignment_17537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_rule__Until__BoundAssignment_27570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Until__RightAssignment_37601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_rule__Next__BoundAssignment_17632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Next__ValueAssignment_27663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_rule__Future__BoundAssignment_17694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Future__ValueAssignment_27725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_rule__Globally__BoundAssignment_17756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Globally__ValueAssignment_27787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMPARATOR_in_rule__CompareProbability__OperatorAssignment_07818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__CompareProbability__ValueAssignment_17849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__OperatorAlternatives_0_0_0_in_rule__TimeBound__OperatorAssignment_0_07880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__TimeBound__ValueAssignment_0_17913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__TimeBound__FromAssignment_1_17944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TimeBound__OperatorAssignment_1_27980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__TimeBound__ToAssignment_1_38019 = new BitSet(new long[]{0x0000000000000002L});

}