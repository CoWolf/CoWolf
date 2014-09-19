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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_COMPARATOR", "RULE_SL_COMMENT", "RULE_ID", "RULE_BOOL", "RULE_DOUBLE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=?'", "'U'", "'W'", "'R'", "'='", "'S'", "'['", "']'", "'P'", "'('", "')'", "'!'", "'&'", "'|'", "'=>'", "'State:'", "'Label:'", "'X'", "'F'", "'G'", "','"
    };
    public static final int RULE_ID=6;
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
    public static final int RULE_STRING=10;
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:69:1: ruleStart : ( ( rule__Start__RuleAssignment )* ) ;
    public final void ruleStart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:73:2: ( ( ( rule__Start__RuleAssignment )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:74:1: ( ( rule__Start__RuleAssignment )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:74:1: ( ( rule__Start__RuleAssignment )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:75:1: ( rule__Start__RuleAssignment )*
            {
             before(grammarAccess.getStartAccess().getRuleAssignment()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:76:1: ( rule__Start__RuleAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_SL_COMMENT||LA1_0==RULE_BOOL||LA1_0==19||(LA1_0>=22 && LA1_0<=23)||LA1_0==25||(LA1_0>=29 && LA1_0<=30)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:76:2: rule__Start__RuleAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Start__RuleAssignment_in_ruleStart94);
            	    rule__Start__RuleAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getStartAccess().getRuleAssignment()); 

            }


            }

        }
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
            pushFollow(FOLLOW_ruleFragment_in_entryRuleFragment122);
            ruleFragment();

            state._fsp--;

             after(grammarAccess.getFragmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFragment129); 

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
            pushFollow(FOLLOW_rule__Fragment__Alternatives_in_ruleFragment155);
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
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment182);
            ruleComment();

            state._fsp--;

             after(grammarAccess.getCommentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment189); 

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
            pushFollow(FOLLOW_rule__Comment__CommentAssignment_in_ruleComment215);
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
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule247);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule254); 

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
            pushFollow(FOLLOW_rule__Rule__Alternatives_in_ruleRule284);
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
            pushFollow(FOLLOW_ruleSteadyState_in_entryRuleSteadyState311);
            ruleSteadyState();

            state._fsp--;

             after(grammarAccess.getSteadyStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSteadyState318); 

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
            pushFollow(FOLLOW_rule__SteadyState__Group__0_in_ruleSteadyState344);
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
            pushFollow(FOLLOW_ruleQuantifiedProbability_in_entryRuleQuantifiedProbability371);
            ruleQuantifiedProbability();

            state._fsp--;

             after(grammarAccess.getQuantifiedProbabilityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantifiedProbability378); 

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
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__0_in_ruleQuantifiedProbability404);
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
            pushFollow(FOLLOW_ruleBooleanRule_in_entryRuleBooleanRule431);
            ruleBooleanRule();

            state._fsp--;

             after(grammarAccess.getBooleanRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanRule438); 

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
            pushFollow(FOLLOW_rule__BooleanRule__ValueAssignment_in_ruleBooleanRule464);
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
            pushFollow(FOLLOW_ruleStateFormula_in_entryRuleStateFormula491);
            ruleStateFormula();

            state._fsp--;

             after(grammarAccess.getStateFormulaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateFormula498); 

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
            pushFollow(FOLLOW_rule__StateFormula__Alternatives_in_ruleStateFormula524);
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
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation551);
            ruleNegation();

            state._fsp--;

             after(grammarAccess.getNegationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation558); 

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
            pushFollow(FOLLOW_rule__Negation__Group__0_in_ruleNegation584);
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
            pushFollow(FOLLOW_ruleJunction_in_entryRuleJunction616);
            ruleJunction();

            state._fsp--;

             after(grammarAccess.getJunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJunction623); 

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
            pushFollow(FOLLOW_rule__Junction__Alternatives_in_ruleJunction653);
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
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction680);
            ruleConjunction();

            state._fsp--;

             after(grammarAccess.getConjunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction687); 

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
            pushFollow(FOLLOW_rule__Conjunction__Group__0_in_ruleConjunction713);
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
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction740);
            ruleDisjunction();

            state._fsp--;

             after(grammarAccess.getDisjunctionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction747); 

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
            pushFollow(FOLLOW_rule__Disjunction__Group__0_in_ruleDisjunction773);
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
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication805);
            ruleImplication();

            state._fsp--;

             after(grammarAccess.getImplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication812); 

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
            pushFollow(FOLLOW_rule__Implication__Group__0_in_ruleImplication842);
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
            pushFollow(FOLLOW_ruleProbability_in_entryRuleProbability869);
            ruleProbability();

            state._fsp--;

             after(grammarAccess.getProbabilityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProbability876); 

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
            pushFollow(FOLLOW_rule__Probability__Group__0_in_ruleProbability902);
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
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic929);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic936); 

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
            pushFollow(FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic962);
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
            pushFollow(FOLLOW_ruleState_in_entryRuleState989);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState996); 

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
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState1022);
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
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel1049);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel1056); 

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
            pushFollow(FOLLOW_rule__Label__Group__0_in_ruleLabel1082);
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
            pushFollow(FOLLOW_ruleBoolean_in_entryRuleBoolean1109);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolean1116); 

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
            pushFollow(FOLLOW_rule__Boolean__ValueAssignment_in_ruleBoolean1142);
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
            pushFollow(FOLLOW_rulePathFormula_in_entryRulePathFormula1174);
            rulePathFormula();

            state._fsp--;

             after(grammarAccess.getPathFormulaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathFormula1181); 

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
            pushFollow(FOLLOW_rule__PathFormula__Alternatives_in_rulePathFormula1211);
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
            pushFollow(FOLLOW_ruleUntil_in_entryRuleUntil1238);
            ruleUntil();

            state._fsp--;

             after(grammarAccess.getUntilRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUntil1245); 

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
            pushFollow(FOLLOW_rule__Until__Group__0_in_ruleUntil1271);
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
            pushFollow(FOLLOW_ruleNext_in_entryRuleNext1298);
            ruleNext();

            state._fsp--;

             after(grammarAccess.getNextRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNext1305); 

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
            pushFollow(FOLLOW_rule__Next__Group__0_in_ruleNext1331);
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
            pushFollow(FOLLOW_ruleFuture_in_entryRuleFuture1358);
            ruleFuture();

            state._fsp--;

             after(grammarAccess.getFutureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFuture1365); 

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
            pushFollow(FOLLOW_rule__Future__Group__0_in_ruleFuture1391);
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
            pushFollow(FOLLOW_ruleGlobally_in_entryRuleGlobally1418);
            ruleGlobally();

            state._fsp--;

             after(grammarAccess.getGloballyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobally1425); 

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
            pushFollow(FOLLOW_rule__Globally__Group__0_in_ruleGlobally1451);
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
            pushFollow(FOLLOW_ruleCompareProbability_in_entryRuleCompareProbability1483);
            ruleCompareProbability();

            state._fsp--;

             after(grammarAccess.getCompareProbabilityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareProbability1490); 

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
            pushFollow(FOLLOW_rule__CompareProbability__Group__0_in_ruleCompareProbability1520);
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
            pushFollow(FOLLOW_ruleTimeBound_in_entryRuleTimeBound1552);
            ruleTimeBound();

            state._fsp--;

             after(grammarAccess.getTimeBoundRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeBound1559); 

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
            pushFollow(FOLLOW_rule__TimeBound__Alternatives_in_ruleTimeBound1589);
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
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_SL_COMMENT) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_BOOL||LA2_0==19||(LA2_0>=22 && LA2_0<=23)||LA2_0==25||(LA2_0>=29 && LA2_0<=30)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:813:1: ( ruleComment )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:813:1: ( ruleComment )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:814:1: ruleComment
                    {
                     before(grammarAccess.getFragmentAccess().getCommentParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleComment_in_rule__Fragment__Alternatives1625);
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
                    pushFollow(FOLLOW_ruleRule_in_rule__Fragment__Alternatives1642);
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
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:835:1: ( ruleBooleanRule )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:835:1: ( ruleBooleanRule )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:836:1: ruleBooleanRule
                    {
                     before(grammarAccess.getRuleAccess().getBooleanRuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBooleanRule_in_rule__Rule__Alternatives1674);
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
                    pushFollow(FOLLOW_ruleSteadyState_in_rule__Rule__Alternatives1691);
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
                    pushFollow(FOLLOW_ruleQuantifiedProbability_in_rule__Rule__Alternatives1708);
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
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_COMPARATOR) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
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
                    pushFollow(FOLLOW_rule__SteadyState__BoundAssignment_2_0_in_rule__SteadyState__Alternatives_21740);
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
                    match(input,14,FOLLOW_14_in_rule__SteadyState__Alternatives_21759); 
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
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_BOOL||LA5_0==22||LA5_0==25||(LA5_0>=29 && LA5_0<=30)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
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
                    pushFollow(FOLLOW_rule__StateFormula__Group_0__0_in_rule__StateFormula__Alternatives1793);
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
                    pushFollow(FOLLOW_rule__StateFormula__LeftAssignment_1_in_rule__StateFormula__Alternatives1811);
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
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=26 && LA6_0<=27)) ) {
                alt6=1;
            }
            else if ( (LA6_0==28) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
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
                    pushFollow(FOLLOW_rule__StateFormula__RightAssignment_0_3_0_in_rule__StateFormula__Alternatives_0_31844);
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
                    pushFollow(FOLLOW_rule__StateFormula__RightAssignment_0_3_1_in_rule__StateFormula__Alternatives_0_31862);
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
            int alt7=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case RULE_BOOL:
            case 29:
            case 30:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:931:1: ( ruleNegation )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:931:1: ( ruleNegation )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:932:1: ruleNegation
                    {
                     before(grammarAccess.getStateFormulaAccess().getLeftNegationParserRuleCall_1_0_0()); 
                    pushFollow(FOLLOW_ruleNegation_in_rule__StateFormula__LeftAlternatives_1_01895);
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
                    pushFollow(FOLLOW_ruleAtomic_in_rule__StateFormula__LeftAlternatives_1_01912);
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
                    pushFollow(FOLLOW_ruleProbability_in_rule__StateFormula__LeftAlternatives_1_01929);
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
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:959:1: ( ruleConjunction )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:959:1: ( ruleConjunction )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:960:1: ruleConjunction
                    {
                     before(grammarAccess.getJunctionAccess().getConjunctionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConjunction_in_rule__Junction__Alternatives1961);
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
                    pushFollow(FOLLOW_ruleDisjunction_in_rule__Junction__Alternatives1978);
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
            int alt9=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt9=1;
                }
                break;
            case 30:
                {
                alt9=2;
                }
                break;
            case RULE_BOOL:
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:981:1: ( ruleState )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:981:1: ( ruleState )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:982:1: ruleState
                    {
                     before(grammarAccess.getAtomicAccess().getStateParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleState_in_rule__Atomic__Alternatives2010);
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
                    pushFollow(FOLLOW_ruleLabel_in_rule__Atomic__Alternatives2027);
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
                    pushFollow(FOLLOW_ruleBoolean_in_rule__Atomic__Alternatives2044);
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
            int alt10=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt10=1;
                }
                break;
            case RULE_BOOL:
            case 22:
            case 23:
            case 25:
            case 29:
            case 30:
                {
                alt10=2;
                }
                break;
            case 32:
                {
                alt10=3;
                }
                break;
            case 33:
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1009:1: ( ruleNext )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1009:1: ( ruleNext )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1010:1: ruleNext
                    {
                     before(grammarAccess.getPathFormulaAccess().getNextParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNext_in_rule__PathFormula__Alternatives2076);
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
                    pushFollow(FOLLOW_ruleUntil_in_rule__PathFormula__Alternatives2093);
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
                    pushFollow(FOLLOW_ruleFuture_in_rule__PathFormula__Alternatives2110);
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
                    pushFollow(FOLLOW_ruleGlobally_in_rule__PathFormula__Alternatives2127);
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
            int alt11=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt11=1;
                }
                break;
            case 16:
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1043:1: ( 'U' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1043:1: ( 'U' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1044:1: 'U'
                    {
                     before(grammarAccess.getUntilAccess().getTypeUKeyword_1_0_0()); 
                    match(input,15,FOLLOW_15_in_rule__Until__TypeAlternatives_1_02160); 
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
                    match(input,16,FOLLOW_16_in_rule__Until__TypeAlternatives_1_02180); 
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
                    match(input,17,FOLLOW_17_in_rule__Until__TypeAlternatives_1_02200); 
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
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_COMPARATOR||LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==20) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
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
                    pushFollow(FOLLOW_rule__TimeBound__Group_0__0_in_rule__TimeBound__Alternatives2234);
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
                    pushFollow(FOLLOW_rule__TimeBound__Group_1__0_in_rule__TimeBound__Alternatives2252);
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
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_COMPARATOR) ) {
                alt13=1;
            }
            else if ( (LA13_0==18) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1099:1: ( RULE_COMPARATOR )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1099:1: ( RULE_COMPARATOR )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1100:1: RULE_COMPARATOR
                    {
                     before(grammarAccess.getTimeBoundAccess().getOperatorCOMPARATORTerminalRuleCall_0_0_0_0()); 
                    match(input,RULE_COMPARATOR,FOLLOW_RULE_COMPARATOR_in_rule__TimeBound__OperatorAlternatives_0_0_02285); 
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
                    match(input,18,FOLLOW_18_in_rule__TimeBound__OperatorAlternatives_0_0_02303); 
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


    // $ANTLR start "rule__SteadyState__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1120:1: rule__SteadyState__Group__0 : rule__SteadyState__Group__0__Impl rule__SteadyState__Group__1 ;
    public final void rule__SteadyState__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1124:1: ( rule__SteadyState__Group__0__Impl rule__SteadyState__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1125:2: rule__SteadyState__Group__0__Impl rule__SteadyState__Group__1
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__0__Impl_in_rule__SteadyState__Group__02335);
            rule__SteadyState__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__1_in_rule__SteadyState__Group__02338);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1132:1: rule__SteadyState__Group__0__Impl : ( 'S' ) ;
    public final void rule__SteadyState__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1136:1: ( ( 'S' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1137:1: ( 'S' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1137:1: ( 'S' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1138:1: 'S'
            {
             before(grammarAccess.getSteadyStateAccess().getSKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__SteadyState__Group__0__Impl2366); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1151:1: rule__SteadyState__Group__1 : rule__SteadyState__Group__1__Impl rule__SteadyState__Group__2 ;
    public final void rule__SteadyState__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1155:1: ( rule__SteadyState__Group__1__Impl rule__SteadyState__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1156:2: rule__SteadyState__Group__1__Impl rule__SteadyState__Group__2
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__1__Impl_in_rule__SteadyState__Group__12397);
            rule__SteadyState__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__2_in_rule__SteadyState__Group__12400);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1163:1: rule__SteadyState__Group__1__Impl : ( ( RULE_SL_COMMENT )* ) ;
    public final void rule__SteadyState__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1167:1: ( ( ( RULE_SL_COMMENT )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1168:1: ( ( RULE_SL_COMMENT )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1168:1: ( ( RULE_SL_COMMENT )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1169:1: ( RULE_SL_COMMENT )*
            {
             before(grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1170:1: ( RULE_SL_COMMENT )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_SL_COMMENT) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1170:3: RULE_SL_COMMENT
            	    {
            	    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__SteadyState__Group__1__Impl2428); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1180:1: rule__SteadyState__Group__2 : rule__SteadyState__Group__2__Impl rule__SteadyState__Group__3 ;
    public final void rule__SteadyState__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1184:1: ( rule__SteadyState__Group__2__Impl rule__SteadyState__Group__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1185:2: rule__SteadyState__Group__2__Impl rule__SteadyState__Group__3
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__2__Impl_in_rule__SteadyState__Group__22459);
            rule__SteadyState__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__3_in_rule__SteadyState__Group__22462);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1192:1: rule__SteadyState__Group__2__Impl : ( ( rule__SteadyState__Alternatives_2 ) ) ;
    public final void rule__SteadyState__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1196:1: ( ( ( rule__SteadyState__Alternatives_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1197:1: ( ( rule__SteadyState__Alternatives_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1197:1: ( ( rule__SteadyState__Alternatives_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1198:1: ( rule__SteadyState__Alternatives_2 )
            {
             before(grammarAccess.getSteadyStateAccess().getAlternatives_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1199:1: ( rule__SteadyState__Alternatives_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1199:2: rule__SteadyState__Alternatives_2
            {
            pushFollow(FOLLOW_rule__SteadyState__Alternatives_2_in_rule__SteadyState__Group__2__Impl2489);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1209:1: rule__SteadyState__Group__3 : rule__SteadyState__Group__3__Impl rule__SteadyState__Group__4 ;
    public final void rule__SteadyState__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1213:1: ( rule__SteadyState__Group__3__Impl rule__SteadyState__Group__4 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1214:2: rule__SteadyState__Group__3__Impl rule__SteadyState__Group__4
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__3__Impl_in_rule__SteadyState__Group__32519);
            rule__SteadyState__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__4_in_rule__SteadyState__Group__32522);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1221:1: rule__SteadyState__Group__3__Impl : ( ( RULE_SL_COMMENT )* ) ;
    public final void rule__SteadyState__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1225:1: ( ( ( RULE_SL_COMMENT )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1226:1: ( ( RULE_SL_COMMENT )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1226:1: ( ( RULE_SL_COMMENT )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1227:1: ( RULE_SL_COMMENT )*
            {
             before(grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_3()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1228:1: ( RULE_SL_COMMENT )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_SL_COMMENT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1228:3: RULE_SL_COMMENT
            	    {
            	    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__SteadyState__Group__3__Impl2550); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1238:1: rule__SteadyState__Group__4 : rule__SteadyState__Group__4__Impl rule__SteadyState__Group__5 ;
    public final void rule__SteadyState__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1242:1: ( rule__SteadyState__Group__4__Impl rule__SteadyState__Group__5 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1243:2: rule__SteadyState__Group__4__Impl rule__SteadyState__Group__5
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__4__Impl_in_rule__SteadyState__Group__42581);
            rule__SteadyState__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__5_in_rule__SteadyState__Group__42584);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1250:1: rule__SteadyState__Group__4__Impl : ( '[' ) ;
    public final void rule__SteadyState__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1254:1: ( ( '[' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1255:1: ( '[' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1255:1: ( '[' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1256:1: '['
            {
             before(grammarAccess.getSteadyStateAccess().getLeftSquareBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__SteadyState__Group__4__Impl2612); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1269:1: rule__SteadyState__Group__5 : rule__SteadyState__Group__5__Impl rule__SteadyState__Group__6 ;
    public final void rule__SteadyState__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1273:1: ( rule__SteadyState__Group__5__Impl rule__SteadyState__Group__6 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1274:2: rule__SteadyState__Group__5__Impl rule__SteadyState__Group__6
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__5__Impl_in_rule__SteadyState__Group__52643);
            rule__SteadyState__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__6_in_rule__SteadyState__Group__52646);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1281:1: rule__SteadyState__Group__5__Impl : ( ( RULE_SL_COMMENT )* ) ;
    public final void rule__SteadyState__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1285:1: ( ( ( RULE_SL_COMMENT )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1286:1: ( ( RULE_SL_COMMENT )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1286:1: ( ( RULE_SL_COMMENT )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1287:1: ( RULE_SL_COMMENT )*
            {
             before(grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_5()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1288:1: ( RULE_SL_COMMENT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_SL_COMMENT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1288:3: RULE_SL_COMMENT
            	    {
            	    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__SteadyState__Group__5__Impl2674); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1298:1: rule__SteadyState__Group__6 : rule__SteadyState__Group__6__Impl rule__SteadyState__Group__7 ;
    public final void rule__SteadyState__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1302:1: ( rule__SteadyState__Group__6__Impl rule__SteadyState__Group__7 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1303:2: rule__SteadyState__Group__6__Impl rule__SteadyState__Group__7
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__6__Impl_in_rule__SteadyState__Group__62705);
            rule__SteadyState__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__7_in_rule__SteadyState__Group__62708);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1310:1: rule__SteadyState__Group__6__Impl : ( ( rule__SteadyState__ValueAssignment_6 ) ) ;
    public final void rule__SteadyState__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1314:1: ( ( ( rule__SteadyState__ValueAssignment_6 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1315:1: ( ( rule__SteadyState__ValueAssignment_6 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1315:1: ( ( rule__SteadyState__ValueAssignment_6 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1316:1: ( rule__SteadyState__ValueAssignment_6 )
            {
             before(grammarAccess.getSteadyStateAccess().getValueAssignment_6()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1317:1: ( rule__SteadyState__ValueAssignment_6 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1317:2: rule__SteadyState__ValueAssignment_6
            {
            pushFollow(FOLLOW_rule__SteadyState__ValueAssignment_6_in_rule__SteadyState__Group__6__Impl2735);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1327:1: rule__SteadyState__Group__7 : rule__SteadyState__Group__7__Impl rule__SteadyState__Group__8 ;
    public final void rule__SteadyState__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1331:1: ( rule__SteadyState__Group__7__Impl rule__SteadyState__Group__8 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1332:2: rule__SteadyState__Group__7__Impl rule__SteadyState__Group__8
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__7__Impl_in_rule__SteadyState__Group__72765);
            rule__SteadyState__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SteadyState__Group__8_in_rule__SteadyState__Group__72768);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1339:1: rule__SteadyState__Group__7__Impl : ( ( RULE_SL_COMMENT )* ) ;
    public final void rule__SteadyState__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1343:1: ( ( ( RULE_SL_COMMENT )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1344:1: ( ( RULE_SL_COMMENT )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1344:1: ( ( RULE_SL_COMMENT )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1345:1: ( RULE_SL_COMMENT )*
            {
             before(grammarAccess.getSteadyStateAccess().getSL_COMMENTTerminalRuleCall_7()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1346:1: ( RULE_SL_COMMENT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_SL_COMMENT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1346:3: RULE_SL_COMMENT
            	    {
            	    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__SteadyState__Group__7__Impl2796); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1356:1: rule__SteadyState__Group__8 : rule__SteadyState__Group__8__Impl ;
    public final void rule__SteadyState__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1360:1: ( rule__SteadyState__Group__8__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1361:2: rule__SteadyState__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__SteadyState__Group__8__Impl_in_rule__SteadyState__Group__82827);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1367:1: rule__SteadyState__Group__8__Impl : ( ']' ) ;
    public final void rule__SteadyState__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1371:1: ( ( ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1372:1: ( ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1372:1: ( ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1373:1: ']'
            {
             before(grammarAccess.getSteadyStateAccess().getRightSquareBracketKeyword_8()); 
            match(input,21,FOLLOW_21_in_rule__SteadyState__Group__8__Impl2855); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1404:1: rule__QuantifiedProbability__Group__0 : rule__QuantifiedProbability__Group__0__Impl rule__QuantifiedProbability__Group__1 ;
    public final void rule__QuantifiedProbability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1408:1: ( rule__QuantifiedProbability__Group__0__Impl rule__QuantifiedProbability__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1409:2: rule__QuantifiedProbability__Group__0__Impl rule__QuantifiedProbability__Group__1
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__0__Impl_in_rule__QuantifiedProbability__Group__02904);
            rule__QuantifiedProbability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__1_in_rule__QuantifiedProbability__Group__02907);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1416:1: rule__QuantifiedProbability__Group__0__Impl : ( 'P' ) ;
    public final void rule__QuantifiedProbability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1420:1: ( ( 'P' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1421:1: ( 'P' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1421:1: ( 'P' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1422:1: 'P'
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getPKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__QuantifiedProbability__Group__0__Impl2935); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1435:1: rule__QuantifiedProbability__Group__1 : rule__QuantifiedProbability__Group__1__Impl rule__QuantifiedProbability__Group__2 ;
    public final void rule__QuantifiedProbability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1439:1: ( rule__QuantifiedProbability__Group__1__Impl rule__QuantifiedProbability__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1440:2: rule__QuantifiedProbability__Group__1__Impl rule__QuantifiedProbability__Group__2
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__1__Impl_in_rule__QuantifiedProbability__Group__12966);
            rule__QuantifiedProbability__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__2_in_rule__QuantifiedProbability__Group__12969);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1447:1: rule__QuantifiedProbability__Group__1__Impl : ( ( RULE_SL_COMMENT )* ) ;
    public final void rule__QuantifiedProbability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1451:1: ( ( ( RULE_SL_COMMENT )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1452:1: ( ( RULE_SL_COMMENT )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1452:1: ( ( RULE_SL_COMMENT )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1453:1: ( RULE_SL_COMMENT )*
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getSL_COMMENTTerminalRuleCall_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1454:1: ( RULE_SL_COMMENT )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_SL_COMMENT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1454:3: RULE_SL_COMMENT
            	    {
            	    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__QuantifiedProbability__Group__1__Impl2997); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1464:1: rule__QuantifiedProbability__Group__2 : rule__QuantifiedProbability__Group__2__Impl rule__QuantifiedProbability__Group__3 ;
    public final void rule__QuantifiedProbability__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1468:1: ( rule__QuantifiedProbability__Group__2__Impl rule__QuantifiedProbability__Group__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1469:2: rule__QuantifiedProbability__Group__2__Impl rule__QuantifiedProbability__Group__3
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__2__Impl_in_rule__QuantifiedProbability__Group__23028);
            rule__QuantifiedProbability__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__3_in_rule__QuantifiedProbability__Group__23031);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1476:1: rule__QuantifiedProbability__Group__2__Impl : ( '=?' ) ;
    public final void rule__QuantifiedProbability__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1480:1: ( ( '=?' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1481:1: ( '=?' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1481:1: ( '=?' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1482:1: '=?'
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getEqualsSignQuestionMarkKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__QuantifiedProbability__Group__2__Impl3059); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1495:1: rule__QuantifiedProbability__Group__3 : rule__QuantifiedProbability__Group__3__Impl rule__QuantifiedProbability__Group__4 ;
    public final void rule__QuantifiedProbability__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1499:1: ( rule__QuantifiedProbability__Group__3__Impl rule__QuantifiedProbability__Group__4 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1500:2: rule__QuantifiedProbability__Group__3__Impl rule__QuantifiedProbability__Group__4
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__3__Impl_in_rule__QuantifiedProbability__Group__33090);
            rule__QuantifiedProbability__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__4_in_rule__QuantifiedProbability__Group__33093);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1507:1: rule__QuantifiedProbability__Group__3__Impl : ( ( RULE_SL_COMMENT )* ) ;
    public final void rule__QuantifiedProbability__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1511:1: ( ( ( RULE_SL_COMMENT )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1512:1: ( ( RULE_SL_COMMENT )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1512:1: ( ( RULE_SL_COMMENT )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1513:1: ( RULE_SL_COMMENT )*
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getSL_COMMENTTerminalRuleCall_3()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1514:1: ( RULE_SL_COMMENT )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_SL_COMMENT) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1514:3: RULE_SL_COMMENT
            	    {
            	    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__QuantifiedProbability__Group__3__Impl3121); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1524:1: rule__QuantifiedProbability__Group__4 : rule__QuantifiedProbability__Group__4__Impl rule__QuantifiedProbability__Group__5 ;
    public final void rule__QuantifiedProbability__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1528:1: ( rule__QuantifiedProbability__Group__4__Impl rule__QuantifiedProbability__Group__5 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1529:2: rule__QuantifiedProbability__Group__4__Impl rule__QuantifiedProbability__Group__5
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__4__Impl_in_rule__QuantifiedProbability__Group__43152);
            rule__QuantifiedProbability__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__5_in_rule__QuantifiedProbability__Group__43155);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1536:1: rule__QuantifiedProbability__Group__4__Impl : ( '[' ) ;
    public final void rule__QuantifiedProbability__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1540:1: ( ( '[' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1541:1: ( '[' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1541:1: ( '[' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1542:1: '['
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getLeftSquareBracketKeyword_4()); 
            match(input,20,FOLLOW_20_in_rule__QuantifiedProbability__Group__4__Impl3183); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1555:1: rule__QuantifiedProbability__Group__5 : rule__QuantifiedProbability__Group__5__Impl rule__QuantifiedProbability__Group__6 ;
    public final void rule__QuantifiedProbability__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1559:1: ( rule__QuantifiedProbability__Group__5__Impl rule__QuantifiedProbability__Group__6 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1560:2: rule__QuantifiedProbability__Group__5__Impl rule__QuantifiedProbability__Group__6
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__5__Impl_in_rule__QuantifiedProbability__Group__53214);
            rule__QuantifiedProbability__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__6_in_rule__QuantifiedProbability__Group__53217);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1567:1: rule__QuantifiedProbability__Group__5__Impl : ( ( rule__QuantifiedProbability__ValueAssignment_5 ) ) ;
    public final void rule__QuantifiedProbability__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1571:1: ( ( ( rule__QuantifiedProbability__ValueAssignment_5 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1572:1: ( ( rule__QuantifiedProbability__ValueAssignment_5 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1572:1: ( ( rule__QuantifiedProbability__ValueAssignment_5 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1573:1: ( rule__QuantifiedProbability__ValueAssignment_5 )
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getValueAssignment_5()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1574:1: ( rule__QuantifiedProbability__ValueAssignment_5 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1574:2: rule__QuantifiedProbability__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__ValueAssignment_5_in_rule__QuantifiedProbability__Group__5__Impl3244);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1584:1: rule__QuantifiedProbability__Group__6 : rule__QuantifiedProbability__Group__6__Impl ;
    public final void rule__QuantifiedProbability__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1588:1: ( rule__QuantifiedProbability__Group__6__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1589:2: rule__QuantifiedProbability__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__QuantifiedProbability__Group__6__Impl_in_rule__QuantifiedProbability__Group__63274);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1595:1: rule__QuantifiedProbability__Group__6__Impl : ( ']' ) ;
    public final void rule__QuantifiedProbability__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1599:1: ( ( ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1600:1: ( ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1600:1: ( ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1601:1: ']'
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getRightSquareBracketKeyword_6()); 
            match(input,21,FOLLOW_21_in_rule__QuantifiedProbability__Group__6__Impl3302); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1628:1: rule__StateFormula__Group_0__0 : rule__StateFormula__Group_0__0__Impl rule__StateFormula__Group_0__1 ;
    public final void rule__StateFormula__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1632:1: ( rule__StateFormula__Group_0__0__Impl rule__StateFormula__Group_0__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1633:2: rule__StateFormula__Group_0__0__Impl rule__StateFormula__Group_0__1
            {
            pushFollow(FOLLOW_rule__StateFormula__Group_0__0__Impl_in_rule__StateFormula__Group_0__03347);
            rule__StateFormula__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateFormula__Group_0__1_in_rule__StateFormula__Group_0__03350);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1640:1: rule__StateFormula__Group_0__0__Impl : ( '(' ) ;
    public final void rule__StateFormula__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1644:1: ( ( '(' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1645:1: ( '(' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1645:1: ( '(' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1646:1: '('
            {
             before(grammarAccess.getStateFormulaAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,23,FOLLOW_23_in_rule__StateFormula__Group_0__0__Impl3378); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1659:1: rule__StateFormula__Group_0__1 : rule__StateFormula__Group_0__1__Impl rule__StateFormula__Group_0__2 ;
    public final void rule__StateFormula__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1663:1: ( rule__StateFormula__Group_0__1__Impl rule__StateFormula__Group_0__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1664:2: rule__StateFormula__Group_0__1__Impl rule__StateFormula__Group_0__2
            {
            pushFollow(FOLLOW_rule__StateFormula__Group_0__1__Impl_in_rule__StateFormula__Group_0__13409);
            rule__StateFormula__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateFormula__Group_0__2_in_rule__StateFormula__Group_0__13412);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1671:1: rule__StateFormula__Group_0__1__Impl : ( ( RULE_SL_COMMENT )* ) ;
    public final void rule__StateFormula__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1675:1: ( ( ( RULE_SL_COMMENT )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1676:1: ( ( RULE_SL_COMMENT )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1676:1: ( ( RULE_SL_COMMENT )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1677:1: ( RULE_SL_COMMENT )*
            {
             before(grammarAccess.getStateFormulaAccess().getSL_COMMENTTerminalRuleCall_0_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1678:1: ( RULE_SL_COMMENT )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_SL_COMMENT) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1678:3: RULE_SL_COMMENT
            	    {
            	    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__StateFormula__Group_0__1__Impl3440); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1688:1: rule__StateFormula__Group_0__2 : rule__StateFormula__Group_0__2__Impl rule__StateFormula__Group_0__3 ;
    public final void rule__StateFormula__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1692:1: ( rule__StateFormula__Group_0__2__Impl rule__StateFormula__Group_0__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1693:2: rule__StateFormula__Group_0__2__Impl rule__StateFormula__Group_0__3
            {
            pushFollow(FOLLOW_rule__StateFormula__Group_0__2__Impl_in_rule__StateFormula__Group_0__23471);
            rule__StateFormula__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateFormula__Group_0__3_in_rule__StateFormula__Group_0__23474);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1700:1: rule__StateFormula__Group_0__2__Impl : ( ( rule__StateFormula__LeftAssignment_0_2 ) ) ;
    public final void rule__StateFormula__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1704:1: ( ( ( rule__StateFormula__LeftAssignment_0_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1705:1: ( ( rule__StateFormula__LeftAssignment_0_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1705:1: ( ( rule__StateFormula__LeftAssignment_0_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1706:1: ( rule__StateFormula__LeftAssignment_0_2 )
            {
             before(grammarAccess.getStateFormulaAccess().getLeftAssignment_0_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1707:1: ( rule__StateFormula__LeftAssignment_0_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1707:2: rule__StateFormula__LeftAssignment_0_2
            {
            pushFollow(FOLLOW_rule__StateFormula__LeftAssignment_0_2_in_rule__StateFormula__Group_0__2__Impl3501);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1717:1: rule__StateFormula__Group_0__3 : rule__StateFormula__Group_0__3__Impl rule__StateFormula__Group_0__4 ;
    public final void rule__StateFormula__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1721:1: ( rule__StateFormula__Group_0__3__Impl rule__StateFormula__Group_0__4 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1722:2: rule__StateFormula__Group_0__3__Impl rule__StateFormula__Group_0__4
            {
            pushFollow(FOLLOW_rule__StateFormula__Group_0__3__Impl_in_rule__StateFormula__Group_0__33531);
            rule__StateFormula__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateFormula__Group_0__4_in_rule__StateFormula__Group_0__33534);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1729:1: rule__StateFormula__Group_0__3__Impl : ( ( rule__StateFormula__Alternatives_0_3 )? ) ;
    public final void rule__StateFormula__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1733:1: ( ( ( rule__StateFormula__Alternatives_0_3 )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1734:1: ( ( rule__StateFormula__Alternatives_0_3 )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1734:1: ( ( rule__StateFormula__Alternatives_0_3 )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1735:1: ( rule__StateFormula__Alternatives_0_3 )?
            {
             before(grammarAccess.getStateFormulaAccess().getAlternatives_0_3()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1736:1: ( rule__StateFormula__Alternatives_0_3 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=26 && LA21_0<=28)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1736:2: rule__StateFormula__Alternatives_0_3
                    {
                    pushFollow(FOLLOW_rule__StateFormula__Alternatives_0_3_in_rule__StateFormula__Group_0__3__Impl3561);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1746:1: rule__StateFormula__Group_0__4 : rule__StateFormula__Group_0__4__Impl rule__StateFormula__Group_0__5 ;
    public final void rule__StateFormula__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1750:1: ( rule__StateFormula__Group_0__4__Impl rule__StateFormula__Group_0__5 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1751:2: rule__StateFormula__Group_0__4__Impl rule__StateFormula__Group_0__5
            {
            pushFollow(FOLLOW_rule__StateFormula__Group_0__4__Impl_in_rule__StateFormula__Group_0__43592);
            rule__StateFormula__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateFormula__Group_0__5_in_rule__StateFormula__Group_0__43595);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1758:1: rule__StateFormula__Group_0__4__Impl : ( ( RULE_SL_COMMENT )* ) ;
    public final void rule__StateFormula__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1762:1: ( ( ( RULE_SL_COMMENT )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1763:1: ( ( RULE_SL_COMMENT )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1763:1: ( ( RULE_SL_COMMENT )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1764:1: ( RULE_SL_COMMENT )*
            {
             before(grammarAccess.getStateFormulaAccess().getSL_COMMENTTerminalRuleCall_0_4()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1765:1: ( RULE_SL_COMMENT )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_SL_COMMENT) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1765:3: RULE_SL_COMMENT
            	    {
            	    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__StateFormula__Group_0__4__Impl3623); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1775:1: rule__StateFormula__Group_0__5 : rule__StateFormula__Group_0__5__Impl ;
    public final void rule__StateFormula__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1779:1: ( rule__StateFormula__Group_0__5__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1780:2: rule__StateFormula__Group_0__5__Impl
            {
            pushFollow(FOLLOW_rule__StateFormula__Group_0__5__Impl_in_rule__StateFormula__Group_0__53654);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1786:1: rule__StateFormula__Group_0__5__Impl : ( ')' ) ;
    public final void rule__StateFormula__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1790:1: ( ( ')' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1791:1: ( ')' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1791:1: ( ')' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1792:1: ')'
            {
             before(grammarAccess.getStateFormulaAccess().getRightParenthesisKeyword_0_5()); 
            match(input,24,FOLLOW_24_in_rule__StateFormula__Group_0__5__Impl3682); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1817:1: rule__Negation__Group__0 : rule__Negation__Group__0__Impl rule__Negation__Group__1 ;
    public final void rule__Negation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1821:1: ( rule__Negation__Group__0__Impl rule__Negation__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1822:2: rule__Negation__Group__0__Impl rule__Negation__Group__1
            {
            pushFollow(FOLLOW_rule__Negation__Group__0__Impl_in_rule__Negation__Group__03725);
            rule__Negation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Negation__Group__1_in_rule__Negation__Group__03728);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1829:1: rule__Negation__Group__0__Impl : ( '!' ) ;
    public final void rule__Negation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1833:1: ( ( '!' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1834:1: ( '!' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1834:1: ( '!' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1835:1: '!'
            {
             before(grammarAccess.getNegationAccess().getExclamationMarkKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Negation__Group__0__Impl3756); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1848:1: rule__Negation__Group__1 : rule__Negation__Group__1__Impl ;
    public final void rule__Negation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1852:1: ( rule__Negation__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1853:2: rule__Negation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Negation__Group__1__Impl_in_rule__Negation__Group__13787);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1859:1: rule__Negation__Group__1__Impl : ( ruleStateFormula ) ;
    public final void rule__Negation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1863:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1864:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1864:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1865:1: ruleStateFormula
            {
             before(grammarAccess.getNegationAccess().getStateFormulaParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Negation__Group__1__Impl3814);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1880:1: rule__Conjunction__Group__0 : rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 ;
    public final void rule__Conjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1884:1: ( rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1885:2: rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__03847);
            rule__Conjunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__03850);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1892:1: rule__Conjunction__Group__0__Impl : ( '&' ) ;
    public final void rule__Conjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1896:1: ( ( '&' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1897:1: ( '&' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1897:1: ( '&' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1898:1: '&'
            {
             before(grammarAccess.getConjunctionAccess().getAmpersandKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Conjunction__Group__0__Impl3878); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1911:1: rule__Conjunction__Group__1 : rule__Conjunction__Group__1__Impl rule__Conjunction__Group__2 ;
    public final void rule__Conjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1915:1: ( rule__Conjunction__Group__1__Impl rule__Conjunction__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1916:2: rule__Conjunction__Group__1__Impl rule__Conjunction__Group__2
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__13909);
            rule__Conjunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group__2_in_rule__Conjunction__Group__13912);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1923:1: rule__Conjunction__Group__1__Impl : ( ruleStateFormula ) ;
    public final void rule__Conjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1927:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1928:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1928:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1929:1: ruleStateFormula
            {
             before(grammarAccess.getConjunctionAccess().getStateFormulaParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Conjunction__Group__1__Impl3939);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1940:1: rule__Conjunction__Group__2 : rule__Conjunction__Group__2__Impl ;
    public final void rule__Conjunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1944:1: ( rule__Conjunction__Group__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1945:2: rule__Conjunction__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__2__Impl_in_rule__Conjunction__Group__23968);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1951:1: rule__Conjunction__Group__2__Impl : ( ( rule__Conjunction__Group_2__0 )* ) ;
    public final void rule__Conjunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1955:1: ( ( ( rule__Conjunction__Group_2__0 )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1956:1: ( ( rule__Conjunction__Group_2__0 )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1956:1: ( ( rule__Conjunction__Group_2__0 )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1957:1: ( rule__Conjunction__Group_2__0 )*
            {
             before(grammarAccess.getConjunctionAccess().getGroup_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1958:1: ( rule__Conjunction__Group_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==26) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1958:2: rule__Conjunction__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Conjunction__Group_2__0_in_rule__Conjunction__Group__2__Impl3995);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1974:1: rule__Conjunction__Group_2__0 : rule__Conjunction__Group_2__0__Impl rule__Conjunction__Group_2__1 ;
    public final void rule__Conjunction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1978:1: ( rule__Conjunction__Group_2__0__Impl rule__Conjunction__Group_2__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1979:2: rule__Conjunction__Group_2__0__Impl rule__Conjunction__Group_2__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_2__0__Impl_in_rule__Conjunction__Group_2__04032);
            rule__Conjunction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_2__1_in_rule__Conjunction__Group_2__04035);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1986:1: rule__Conjunction__Group_2__0__Impl : ( () ) ;
    public final void rule__Conjunction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1990:1: ( ( () ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1991:1: ( () )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1991:1: ( () )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1992:1: ()
            {
             before(grammarAccess.getConjunctionAccess().getConjunctionLeftAction_2_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1993:1: ()
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1995:1: 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2005:1: rule__Conjunction__Group_2__1 : rule__Conjunction__Group_2__1__Impl rule__Conjunction__Group_2__2 ;
    public final void rule__Conjunction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2009:1: ( rule__Conjunction__Group_2__1__Impl rule__Conjunction__Group_2__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2010:2: rule__Conjunction__Group_2__1__Impl rule__Conjunction__Group_2__2
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_2__1__Impl_in_rule__Conjunction__Group_2__14093);
            rule__Conjunction__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conjunction__Group_2__2_in_rule__Conjunction__Group_2__14096);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2017:1: rule__Conjunction__Group_2__1__Impl : ( '&' ) ;
    public final void rule__Conjunction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2021:1: ( ( '&' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2022:1: ( '&' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2022:1: ( '&' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2023:1: '&'
            {
             before(grammarAccess.getConjunctionAccess().getAmpersandKeyword_2_1()); 
            match(input,26,FOLLOW_26_in_rule__Conjunction__Group_2__1__Impl4124); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2036:1: rule__Conjunction__Group_2__2 : rule__Conjunction__Group_2__2__Impl ;
    public final void rule__Conjunction__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2040:1: ( rule__Conjunction__Group_2__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2041:2: rule__Conjunction__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_2__2__Impl_in_rule__Conjunction__Group_2__24155);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2047:1: rule__Conjunction__Group_2__2__Impl : ( ( rule__Conjunction__RightAssignment_2_2 ) ) ;
    public final void rule__Conjunction__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2051:1: ( ( ( rule__Conjunction__RightAssignment_2_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2052:1: ( ( rule__Conjunction__RightAssignment_2_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2052:1: ( ( rule__Conjunction__RightAssignment_2_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2053:1: ( rule__Conjunction__RightAssignment_2_2 )
            {
             before(grammarAccess.getConjunctionAccess().getRightAssignment_2_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2054:1: ( rule__Conjunction__RightAssignment_2_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2054:2: rule__Conjunction__RightAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Conjunction__RightAssignment_2_2_in_rule__Conjunction__Group_2__2__Impl4182);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2070:1: rule__Disjunction__Group__0 : rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 ;
    public final void rule__Disjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2074:1: ( rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2075:2: rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__0__Impl_in_rule__Disjunction__Group__04218);
            rule__Disjunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group__1_in_rule__Disjunction__Group__04221);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2082:1: rule__Disjunction__Group__0__Impl : ( '|' ) ;
    public final void rule__Disjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2086:1: ( ( '|' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2087:1: ( '|' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2087:1: ( '|' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2088:1: '|'
            {
             before(grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Disjunction__Group__0__Impl4249); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2101:1: rule__Disjunction__Group__1 : rule__Disjunction__Group__1__Impl rule__Disjunction__Group__2 ;
    public final void rule__Disjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2105:1: ( rule__Disjunction__Group__1__Impl rule__Disjunction__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2106:2: rule__Disjunction__Group__1__Impl rule__Disjunction__Group__2
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__1__Impl_in_rule__Disjunction__Group__14280);
            rule__Disjunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group__2_in_rule__Disjunction__Group__14283);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2113:1: rule__Disjunction__Group__1__Impl : ( ruleStateFormula ) ;
    public final void rule__Disjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2117:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2118:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2118:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2119:1: ruleStateFormula
            {
             before(grammarAccess.getDisjunctionAccess().getStateFormulaParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Disjunction__Group__1__Impl4310);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2130:1: rule__Disjunction__Group__2 : rule__Disjunction__Group__2__Impl ;
    public final void rule__Disjunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2134:1: ( rule__Disjunction__Group__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2135:2: rule__Disjunction__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__2__Impl_in_rule__Disjunction__Group__24339);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2141:1: rule__Disjunction__Group__2__Impl : ( ( rule__Disjunction__Group_2__0 )* ) ;
    public final void rule__Disjunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2145:1: ( ( ( rule__Disjunction__Group_2__0 )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2146:1: ( ( rule__Disjunction__Group_2__0 )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2146:1: ( ( rule__Disjunction__Group_2__0 )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2147:1: ( rule__Disjunction__Group_2__0 )*
            {
             before(grammarAccess.getDisjunctionAccess().getGroup_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2148:1: ( rule__Disjunction__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==27) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2148:2: rule__Disjunction__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Disjunction__Group_2__0_in_rule__Disjunction__Group__2__Impl4366);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2164:1: rule__Disjunction__Group_2__0 : rule__Disjunction__Group_2__0__Impl rule__Disjunction__Group_2__1 ;
    public final void rule__Disjunction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2168:1: ( rule__Disjunction__Group_2__0__Impl rule__Disjunction__Group_2__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2169:2: rule__Disjunction__Group_2__0__Impl rule__Disjunction__Group_2__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_2__0__Impl_in_rule__Disjunction__Group_2__04403);
            rule__Disjunction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group_2__1_in_rule__Disjunction__Group_2__04406);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2176:1: rule__Disjunction__Group_2__0__Impl : ( () ) ;
    public final void rule__Disjunction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2180:1: ( ( () ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2181:1: ( () )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2181:1: ( () )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2182:1: ()
            {
             before(grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_2_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2183:1: ()
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2185:1: 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2195:1: rule__Disjunction__Group_2__1 : rule__Disjunction__Group_2__1__Impl rule__Disjunction__Group_2__2 ;
    public final void rule__Disjunction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2199:1: ( rule__Disjunction__Group_2__1__Impl rule__Disjunction__Group_2__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2200:2: rule__Disjunction__Group_2__1__Impl rule__Disjunction__Group_2__2
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_2__1__Impl_in_rule__Disjunction__Group_2__14464);
            rule__Disjunction__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Disjunction__Group_2__2_in_rule__Disjunction__Group_2__14467);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2207:1: rule__Disjunction__Group_2__1__Impl : ( '|' ) ;
    public final void rule__Disjunction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2211:1: ( ( '|' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2212:1: ( '|' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2212:1: ( '|' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2213:1: '|'
            {
             before(grammarAccess.getDisjunctionAccess().getVerticalLineKeyword_2_1()); 
            match(input,27,FOLLOW_27_in_rule__Disjunction__Group_2__1__Impl4495); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2226:1: rule__Disjunction__Group_2__2 : rule__Disjunction__Group_2__2__Impl ;
    public final void rule__Disjunction__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2230:1: ( rule__Disjunction__Group_2__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2231:2: rule__Disjunction__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_2__2__Impl_in_rule__Disjunction__Group_2__24526);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2237:1: rule__Disjunction__Group_2__2__Impl : ( ( rule__Disjunction__RightAssignment_2_2 ) ) ;
    public final void rule__Disjunction__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2241:1: ( ( ( rule__Disjunction__RightAssignment_2_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2242:1: ( ( rule__Disjunction__RightAssignment_2_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2242:1: ( ( rule__Disjunction__RightAssignment_2_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2243:1: ( rule__Disjunction__RightAssignment_2_2 )
            {
             before(grammarAccess.getDisjunctionAccess().getRightAssignment_2_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2244:1: ( rule__Disjunction__RightAssignment_2_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2244:2: rule__Disjunction__RightAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Disjunction__RightAssignment_2_2_in_rule__Disjunction__Group_2__2__Impl4553);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2260:1: rule__Implication__Group__0 : rule__Implication__Group__0__Impl rule__Implication__Group__1 ;
    public final void rule__Implication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2264:1: ( rule__Implication__Group__0__Impl rule__Implication__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2265:2: rule__Implication__Group__0__Impl rule__Implication__Group__1
            {
            pushFollow(FOLLOW_rule__Implication__Group__0__Impl_in_rule__Implication__Group__04589);
            rule__Implication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Implication__Group__1_in_rule__Implication__Group__04592);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2272:1: rule__Implication__Group__0__Impl : ( '=>' ) ;
    public final void rule__Implication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2276:1: ( ( '=>' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2277:1: ( '=>' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2277:1: ( '=>' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2278:1: '=>'
            {
             before(grammarAccess.getImplicationAccess().getEqualsSignGreaterThanSignKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Implication__Group__0__Impl4620); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2291:1: rule__Implication__Group__1 : rule__Implication__Group__1__Impl ;
    public final void rule__Implication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2295:1: ( rule__Implication__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2296:2: rule__Implication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Implication__Group__1__Impl_in_rule__Implication__Group__14651);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2302:1: rule__Implication__Group__1__Impl : ( ( rule__Implication__RightAssignment_1 ) ) ;
    public final void rule__Implication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2306:1: ( ( ( rule__Implication__RightAssignment_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2307:1: ( ( rule__Implication__RightAssignment_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2307:1: ( ( rule__Implication__RightAssignment_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2308:1: ( rule__Implication__RightAssignment_1 )
            {
             before(grammarAccess.getImplicationAccess().getRightAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2309:1: ( rule__Implication__RightAssignment_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2309:2: rule__Implication__RightAssignment_1
            {
            pushFollow(FOLLOW_rule__Implication__RightAssignment_1_in_rule__Implication__Group__1__Impl4678);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2323:1: rule__Probability__Group__0 : rule__Probability__Group__0__Impl rule__Probability__Group__1 ;
    public final void rule__Probability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2327:1: ( rule__Probability__Group__0__Impl rule__Probability__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2328:2: rule__Probability__Group__0__Impl rule__Probability__Group__1
            {
            pushFollow(FOLLOW_rule__Probability__Group__0__Impl_in_rule__Probability__Group__04712);
            rule__Probability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__1_in_rule__Probability__Group__04715);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2335:1: rule__Probability__Group__0__Impl : ( 'P' ) ;
    public final void rule__Probability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2339:1: ( ( 'P' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2340:1: ( 'P' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2340:1: ( 'P' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2341:1: 'P'
            {
             before(grammarAccess.getProbabilityAccess().getPKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Probability__Group__0__Impl4743); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2354:1: rule__Probability__Group__1 : rule__Probability__Group__1__Impl rule__Probability__Group__2 ;
    public final void rule__Probability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2358:1: ( rule__Probability__Group__1__Impl rule__Probability__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2359:2: rule__Probability__Group__1__Impl rule__Probability__Group__2
            {
            pushFollow(FOLLOW_rule__Probability__Group__1__Impl_in_rule__Probability__Group__14774);
            rule__Probability__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__2_in_rule__Probability__Group__14777);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2366:1: rule__Probability__Group__1__Impl : ( ( RULE_SL_COMMENT )* ) ;
    public final void rule__Probability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2370:1: ( ( ( RULE_SL_COMMENT )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2371:1: ( ( RULE_SL_COMMENT )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2371:1: ( ( RULE_SL_COMMENT )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2372:1: ( RULE_SL_COMMENT )*
            {
             before(grammarAccess.getProbabilityAccess().getSL_COMMENTTerminalRuleCall_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2373:1: ( RULE_SL_COMMENT )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_SL_COMMENT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2373:3: RULE_SL_COMMENT
            	    {
            	    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__Probability__Group__1__Impl4805); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2383:1: rule__Probability__Group__2 : rule__Probability__Group__2__Impl rule__Probability__Group__3 ;
    public final void rule__Probability__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2387:1: ( rule__Probability__Group__2__Impl rule__Probability__Group__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2388:2: rule__Probability__Group__2__Impl rule__Probability__Group__3
            {
            pushFollow(FOLLOW_rule__Probability__Group__2__Impl_in_rule__Probability__Group__24836);
            rule__Probability__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__3_in_rule__Probability__Group__24839);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2395:1: rule__Probability__Group__2__Impl : ( () ) ;
    public final void rule__Probability__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2399:1: ( ( () ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2400:1: ( () )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2400:1: ( () )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2401:1: ()
            {
             before(grammarAccess.getProbabilityAccess().getProbabilityAction_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2402:1: ()
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2404:1: 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2414:1: rule__Probability__Group__3 : rule__Probability__Group__3__Impl rule__Probability__Group__4 ;
    public final void rule__Probability__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2418:1: ( rule__Probability__Group__3__Impl rule__Probability__Group__4 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2419:2: rule__Probability__Group__3__Impl rule__Probability__Group__4
            {
            pushFollow(FOLLOW_rule__Probability__Group__3__Impl_in_rule__Probability__Group__34897);
            rule__Probability__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__4_in_rule__Probability__Group__34900);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2426:1: rule__Probability__Group__3__Impl : ( ( rule__Probability__ComparatorAssignment_3 ) ) ;
    public final void rule__Probability__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2430:1: ( ( ( rule__Probability__ComparatorAssignment_3 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2431:1: ( ( rule__Probability__ComparatorAssignment_3 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2431:1: ( ( rule__Probability__ComparatorAssignment_3 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2432:1: ( rule__Probability__ComparatorAssignment_3 )
            {
             before(grammarAccess.getProbabilityAccess().getComparatorAssignment_3()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2433:1: ( rule__Probability__ComparatorAssignment_3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2433:2: rule__Probability__ComparatorAssignment_3
            {
            pushFollow(FOLLOW_rule__Probability__ComparatorAssignment_3_in_rule__Probability__Group__3__Impl4927);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2443:1: rule__Probability__Group__4 : rule__Probability__Group__4__Impl rule__Probability__Group__5 ;
    public final void rule__Probability__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2447:1: ( rule__Probability__Group__4__Impl rule__Probability__Group__5 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2448:2: rule__Probability__Group__4__Impl rule__Probability__Group__5
            {
            pushFollow(FOLLOW_rule__Probability__Group__4__Impl_in_rule__Probability__Group__44957);
            rule__Probability__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__5_in_rule__Probability__Group__44960);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2455:1: rule__Probability__Group__4__Impl : ( ( RULE_SL_COMMENT )* ) ;
    public final void rule__Probability__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2459:1: ( ( ( RULE_SL_COMMENT )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2460:1: ( ( RULE_SL_COMMENT )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2460:1: ( ( RULE_SL_COMMENT )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2461:1: ( RULE_SL_COMMENT )*
            {
             before(grammarAccess.getProbabilityAccess().getSL_COMMENTTerminalRuleCall_4()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2462:1: ( RULE_SL_COMMENT )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_SL_COMMENT) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2462:3: RULE_SL_COMMENT
            	    {
            	    match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__Probability__Group__4__Impl4988); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2472:1: rule__Probability__Group__5 : rule__Probability__Group__5__Impl rule__Probability__Group__6 ;
    public final void rule__Probability__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2476:1: ( rule__Probability__Group__5__Impl rule__Probability__Group__6 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2477:2: rule__Probability__Group__5__Impl rule__Probability__Group__6
            {
            pushFollow(FOLLOW_rule__Probability__Group__5__Impl_in_rule__Probability__Group__55019);
            rule__Probability__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__6_in_rule__Probability__Group__55022);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2484:1: rule__Probability__Group__5__Impl : ( '[' ) ;
    public final void rule__Probability__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2488:1: ( ( '[' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2489:1: ( '[' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2489:1: ( '[' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2490:1: '['
            {
             before(grammarAccess.getProbabilityAccess().getLeftSquareBracketKeyword_5()); 
            match(input,20,FOLLOW_20_in_rule__Probability__Group__5__Impl5050); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2503:1: rule__Probability__Group__6 : rule__Probability__Group__6__Impl rule__Probability__Group__7 ;
    public final void rule__Probability__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2507:1: ( rule__Probability__Group__6__Impl rule__Probability__Group__7 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2508:2: rule__Probability__Group__6__Impl rule__Probability__Group__7
            {
            pushFollow(FOLLOW_rule__Probability__Group__6__Impl_in_rule__Probability__Group__65081);
            rule__Probability__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Probability__Group__7_in_rule__Probability__Group__65084);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2515:1: rule__Probability__Group__6__Impl : ( ( rule__Probability__PathAssignment_6 ) ) ;
    public final void rule__Probability__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2519:1: ( ( ( rule__Probability__PathAssignment_6 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2520:1: ( ( rule__Probability__PathAssignment_6 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2520:1: ( ( rule__Probability__PathAssignment_6 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2521:1: ( rule__Probability__PathAssignment_6 )
            {
             before(grammarAccess.getProbabilityAccess().getPathAssignment_6()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2522:1: ( rule__Probability__PathAssignment_6 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2522:2: rule__Probability__PathAssignment_6
            {
            pushFollow(FOLLOW_rule__Probability__PathAssignment_6_in_rule__Probability__Group__6__Impl5111);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2532:1: rule__Probability__Group__7 : rule__Probability__Group__7__Impl ;
    public final void rule__Probability__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2536:1: ( rule__Probability__Group__7__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2537:2: rule__Probability__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Probability__Group__7__Impl_in_rule__Probability__Group__75141);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2543:1: rule__Probability__Group__7__Impl : ( ']' ) ;
    public final void rule__Probability__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2547:1: ( ( ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2548:1: ( ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2548:1: ( ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2549:1: ']'
            {
             before(grammarAccess.getProbabilityAccess().getRightSquareBracketKeyword_7()); 
            match(input,21,FOLLOW_21_in_rule__Probability__Group__7__Impl5169); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2578:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2582:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2583:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__05216);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__05219);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2590:1: rule__State__Group__0__Impl : ( 'State:' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2594:1: ( ( 'State:' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2595:1: ( 'State:' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2595:1: ( 'State:' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2596:1: 'State:'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__State__Group__0__Impl5247); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2609:1: rule__State__Group__1 : rule__State__Group__1__Impl ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2613:1: ( rule__State__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2614:2: rule__State__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__15278);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2620:1: rule__State__Group__1__Impl : ( ( rule__State__ValueAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2624:1: ( ( ( rule__State__ValueAssignment_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2625:1: ( ( rule__State__ValueAssignment_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2625:1: ( ( rule__State__ValueAssignment_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2626:1: ( rule__State__ValueAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getValueAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2627:1: ( rule__State__ValueAssignment_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2627:2: rule__State__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__State__ValueAssignment_1_in_rule__State__Group__1__Impl5305);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2641:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2645:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2646:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__05339);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label__Group__1_in_rule__Label__Group__05342);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2653:1: rule__Label__Group__0__Impl : ( 'Label:' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2657:1: ( ( 'Label:' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2658:1: ( 'Label:' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2658:1: ( 'Label:' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2659:1: 'Label:'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Label__Group__0__Impl5370); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2672:1: rule__Label__Group__1 : rule__Label__Group__1__Impl ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2676:1: ( rule__Label__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2677:2: rule__Label__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__15401);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2683:1: rule__Label__Group__1__Impl : ( ( rule__Label__ValueAssignment_1 ) ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2687:1: ( ( ( rule__Label__ValueAssignment_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2688:1: ( ( rule__Label__ValueAssignment_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2688:1: ( ( rule__Label__ValueAssignment_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2689:1: ( rule__Label__ValueAssignment_1 )
            {
             before(grammarAccess.getLabelAccess().getValueAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2690:1: ( rule__Label__ValueAssignment_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2690:2: rule__Label__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Label__ValueAssignment_1_in_rule__Label__Group__1__Impl5428);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2704:1: rule__Until__Group__0 : rule__Until__Group__0__Impl rule__Until__Group__1 ;
    public final void rule__Until__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2708:1: ( rule__Until__Group__0__Impl rule__Until__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2709:2: rule__Until__Group__0__Impl rule__Until__Group__1
            {
            pushFollow(FOLLOW_rule__Until__Group__0__Impl_in_rule__Until__Group__05462);
            rule__Until__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Until__Group__1_in_rule__Until__Group__05465);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2716:1: rule__Until__Group__0__Impl : ( ( rule__Until__LeftAssignment_0 ) ) ;
    public final void rule__Until__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2720:1: ( ( ( rule__Until__LeftAssignment_0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2721:1: ( ( rule__Until__LeftAssignment_0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2721:1: ( ( rule__Until__LeftAssignment_0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2722:1: ( rule__Until__LeftAssignment_0 )
            {
             before(grammarAccess.getUntilAccess().getLeftAssignment_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2723:1: ( rule__Until__LeftAssignment_0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2723:2: rule__Until__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__Until__LeftAssignment_0_in_rule__Until__Group__0__Impl5492);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2733:1: rule__Until__Group__1 : rule__Until__Group__1__Impl rule__Until__Group__2 ;
    public final void rule__Until__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2737:1: ( rule__Until__Group__1__Impl rule__Until__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2738:2: rule__Until__Group__1__Impl rule__Until__Group__2
            {
            pushFollow(FOLLOW_rule__Until__Group__1__Impl_in_rule__Until__Group__15522);
            rule__Until__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Until__Group__2_in_rule__Until__Group__15525);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2745:1: rule__Until__Group__1__Impl : ( ( rule__Until__TypeAssignment_1 ) ) ;
    public final void rule__Until__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2749:1: ( ( ( rule__Until__TypeAssignment_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2750:1: ( ( rule__Until__TypeAssignment_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2750:1: ( ( rule__Until__TypeAssignment_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2751:1: ( rule__Until__TypeAssignment_1 )
            {
             before(grammarAccess.getUntilAccess().getTypeAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2752:1: ( rule__Until__TypeAssignment_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2752:2: rule__Until__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Until__TypeAssignment_1_in_rule__Until__Group__1__Impl5552);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2762:1: rule__Until__Group__2 : rule__Until__Group__2__Impl rule__Until__Group__3 ;
    public final void rule__Until__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2766:1: ( rule__Until__Group__2__Impl rule__Until__Group__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2767:2: rule__Until__Group__2__Impl rule__Until__Group__3
            {
            pushFollow(FOLLOW_rule__Until__Group__2__Impl_in_rule__Until__Group__25582);
            rule__Until__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Until__Group__3_in_rule__Until__Group__25585);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2774:1: rule__Until__Group__2__Impl : ( ( rule__Until__BoundAssignment_2 )? ) ;
    public final void rule__Until__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2778:1: ( ( ( rule__Until__BoundAssignment_2 )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2779:1: ( ( rule__Until__BoundAssignment_2 )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2779:1: ( ( rule__Until__BoundAssignment_2 )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2780:1: ( rule__Until__BoundAssignment_2 )?
            {
             before(grammarAccess.getUntilAccess().getBoundAssignment_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2781:1: ( rule__Until__BoundAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_COMPARATOR||LA27_0==18||LA27_0==20) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2781:2: rule__Until__BoundAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Until__BoundAssignment_2_in_rule__Until__Group__2__Impl5612);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2791:1: rule__Until__Group__3 : rule__Until__Group__3__Impl ;
    public final void rule__Until__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2795:1: ( rule__Until__Group__3__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2796:2: rule__Until__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Until__Group__3__Impl_in_rule__Until__Group__35643);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2802:1: rule__Until__Group__3__Impl : ( ( rule__Until__RightAssignment_3 ) ) ;
    public final void rule__Until__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2806:1: ( ( ( rule__Until__RightAssignment_3 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2807:1: ( ( rule__Until__RightAssignment_3 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2807:1: ( ( rule__Until__RightAssignment_3 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2808:1: ( rule__Until__RightAssignment_3 )
            {
             before(grammarAccess.getUntilAccess().getRightAssignment_3()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2809:1: ( rule__Until__RightAssignment_3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2809:2: rule__Until__RightAssignment_3
            {
            pushFollow(FOLLOW_rule__Until__RightAssignment_3_in_rule__Until__Group__3__Impl5670);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2827:1: rule__Next__Group__0 : rule__Next__Group__0__Impl rule__Next__Group__1 ;
    public final void rule__Next__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2831:1: ( rule__Next__Group__0__Impl rule__Next__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2832:2: rule__Next__Group__0__Impl rule__Next__Group__1
            {
            pushFollow(FOLLOW_rule__Next__Group__0__Impl_in_rule__Next__Group__05708);
            rule__Next__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Next__Group__1_in_rule__Next__Group__05711);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2839:1: rule__Next__Group__0__Impl : ( 'X' ) ;
    public final void rule__Next__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2843:1: ( ( 'X' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2844:1: ( 'X' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2844:1: ( 'X' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2845:1: 'X'
            {
             before(grammarAccess.getNextAccess().getXKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Next__Group__0__Impl5739); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2858:1: rule__Next__Group__1 : rule__Next__Group__1__Impl rule__Next__Group__2 ;
    public final void rule__Next__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2862:1: ( rule__Next__Group__1__Impl rule__Next__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2863:2: rule__Next__Group__1__Impl rule__Next__Group__2
            {
            pushFollow(FOLLOW_rule__Next__Group__1__Impl_in_rule__Next__Group__15770);
            rule__Next__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Next__Group__2_in_rule__Next__Group__15773);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2870:1: rule__Next__Group__1__Impl : ( ( rule__Next__BoundAssignment_1 )? ) ;
    public final void rule__Next__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2874:1: ( ( ( rule__Next__BoundAssignment_1 )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2875:1: ( ( rule__Next__BoundAssignment_1 )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2875:1: ( ( rule__Next__BoundAssignment_1 )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2876:1: ( rule__Next__BoundAssignment_1 )?
            {
             before(grammarAccess.getNextAccess().getBoundAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2877:1: ( rule__Next__BoundAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_COMPARATOR||LA28_0==18||LA28_0==20) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2877:2: rule__Next__BoundAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Next__BoundAssignment_1_in_rule__Next__Group__1__Impl5800);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2887:1: rule__Next__Group__2 : rule__Next__Group__2__Impl ;
    public final void rule__Next__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2891:1: ( rule__Next__Group__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2892:2: rule__Next__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Next__Group__2__Impl_in_rule__Next__Group__25831);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2898:1: rule__Next__Group__2__Impl : ( ( rule__Next__ValueAssignment_2 ) ) ;
    public final void rule__Next__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2902:1: ( ( ( rule__Next__ValueAssignment_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2903:1: ( ( rule__Next__ValueAssignment_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2903:1: ( ( rule__Next__ValueAssignment_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2904:1: ( rule__Next__ValueAssignment_2 )
            {
             before(grammarAccess.getNextAccess().getValueAssignment_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2905:1: ( rule__Next__ValueAssignment_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2905:2: rule__Next__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Next__ValueAssignment_2_in_rule__Next__Group__2__Impl5858);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2921:1: rule__Future__Group__0 : rule__Future__Group__0__Impl rule__Future__Group__1 ;
    public final void rule__Future__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2925:1: ( rule__Future__Group__0__Impl rule__Future__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2926:2: rule__Future__Group__0__Impl rule__Future__Group__1
            {
            pushFollow(FOLLOW_rule__Future__Group__0__Impl_in_rule__Future__Group__05894);
            rule__Future__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Future__Group__1_in_rule__Future__Group__05897);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2933:1: rule__Future__Group__0__Impl : ( 'F' ) ;
    public final void rule__Future__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2937:1: ( ( 'F' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2938:1: ( 'F' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2938:1: ( 'F' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2939:1: 'F'
            {
             before(grammarAccess.getFutureAccess().getFKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Future__Group__0__Impl5925); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2952:1: rule__Future__Group__1 : rule__Future__Group__1__Impl rule__Future__Group__2 ;
    public final void rule__Future__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2956:1: ( rule__Future__Group__1__Impl rule__Future__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2957:2: rule__Future__Group__1__Impl rule__Future__Group__2
            {
            pushFollow(FOLLOW_rule__Future__Group__1__Impl_in_rule__Future__Group__15956);
            rule__Future__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Future__Group__2_in_rule__Future__Group__15959);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2964:1: rule__Future__Group__1__Impl : ( ( rule__Future__BoundAssignment_1 )? ) ;
    public final void rule__Future__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2968:1: ( ( ( rule__Future__BoundAssignment_1 )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2969:1: ( ( rule__Future__BoundAssignment_1 )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2969:1: ( ( rule__Future__BoundAssignment_1 )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2970:1: ( rule__Future__BoundAssignment_1 )?
            {
             before(grammarAccess.getFutureAccess().getBoundAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2971:1: ( rule__Future__BoundAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_COMPARATOR||LA29_0==18||LA29_0==20) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2971:2: rule__Future__BoundAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Future__BoundAssignment_1_in_rule__Future__Group__1__Impl5986);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2981:1: rule__Future__Group__2 : rule__Future__Group__2__Impl ;
    public final void rule__Future__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2985:1: ( rule__Future__Group__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2986:2: rule__Future__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Future__Group__2__Impl_in_rule__Future__Group__26017);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2992:1: rule__Future__Group__2__Impl : ( ( rule__Future__ValueAssignment_2 ) ) ;
    public final void rule__Future__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2996:1: ( ( ( rule__Future__ValueAssignment_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2997:1: ( ( rule__Future__ValueAssignment_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2997:1: ( ( rule__Future__ValueAssignment_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2998:1: ( rule__Future__ValueAssignment_2 )
            {
             before(grammarAccess.getFutureAccess().getValueAssignment_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2999:1: ( rule__Future__ValueAssignment_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2999:2: rule__Future__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Future__ValueAssignment_2_in_rule__Future__Group__2__Impl6044);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3015:1: rule__Globally__Group__0 : rule__Globally__Group__0__Impl rule__Globally__Group__1 ;
    public final void rule__Globally__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3019:1: ( rule__Globally__Group__0__Impl rule__Globally__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3020:2: rule__Globally__Group__0__Impl rule__Globally__Group__1
            {
            pushFollow(FOLLOW_rule__Globally__Group__0__Impl_in_rule__Globally__Group__06080);
            rule__Globally__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Globally__Group__1_in_rule__Globally__Group__06083);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3027:1: rule__Globally__Group__0__Impl : ( 'G' ) ;
    public final void rule__Globally__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3031:1: ( ( 'G' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3032:1: ( 'G' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3032:1: ( 'G' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3033:1: 'G'
            {
             before(grammarAccess.getGloballyAccess().getGKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Globally__Group__0__Impl6111); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3046:1: rule__Globally__Group__1 : rule__Globally__Group__1__Impl rule__Globally__Group__2 ;
    public final void rule__Globally__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3050:1: ( rule__Globally__Group__1__Impl rule__Globally__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3051:2: rule__Globally__Group__1__Impl rule__Globally__Group__2
            {
            pushFollow(FOLLOW_rule__Globally__Group__1__Impl_in_rule__Globally__Group__16142);
            rule__Globally__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Globally__Group__2_in_rule__Globally__Group__16145);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3058:1: rule__Globally__Group__1__Impl : ( ( rule__Globally__BoundAssignment_1 )? ) ;
    public final void rule__Globally__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3062:1: ( ( ( rule__Globally__BoundAssignment_1 )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3063:1: ( ( rule__Globally__BoundAssignment_1 )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3063:1: ( ( rule__Globally__BoundAssignment_1 )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3064:1: ( rule__Globally__BoundAssignment_1 )?
            {
             before(grammarAccess.getGloballyAccess().getBoundAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3065:1: ( rule__Globally__BoundAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_COMPARATOR||LA30_0==18||LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3065:2: rule__Globally__BoundAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Globally__BoundAssignment_1_in_rule__Globally__Group__1__Impl6172);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3075:1: rule__Globally__Group__2 : rule__Globally__Group__2__Impl ;
    public final void rule__Globally__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3079:1: ( rule__Globally__Group__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3080:2: rule__Globally__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Globally__Group__2__Impl_in_rule__Globally__Group__26203);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3086:1: rule__Globally__Group__2__Impl : ( ( rule__Globally__ValueAssignment_2 ) ) ;
    public final void rule__Globally__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3090:1: ( ( ( rule__Globally__ValueAssignment_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3091:1: ( ( rule__Globally__ValueAssignment_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3091:1: ( ( rule__Globally__ValueAssignment_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3092:1: ( rule__Globally__ValueAssignment_2 )
            {
             before(grammarAccess.getGloballyAccess().getValueAssignment_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3093:1: ( rule__Globally__ValueAssignment_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3093:2: rule__Globally__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Globally__ValueAssignment_2_in_rule__Globally__Group__2__Impl6230);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3109:1: rule__CompareProbability__Group__0 : rule__CompareProbability__Group__0__Impl rule__CompareProbability__Group__1 ;
    public final void rule__CompareProbability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3113:1: ( rule__CompareProbability__Group__0__Impl rule__CompareProbability__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3114:2: rule__CompareProbability__Group__0__Impl rule__CompareProbability__Group__1
            {
            pushFollow(FOLLOW_rule__CompareProbability__Group__0__Impl_in_rule__CompareProbability__Group__06266);
            rule__CompareProbability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareProbability__Group__1_in_rule__CompareProbability__Group__06269);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3121:1: rule__CompareProbability__Group__0__Impl : ( ( rule__CompareProbability__OperatorAssignment_0 ) ) ;
    public final void rule__CompareProbability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3125:1: ( ( ( rule__CompareProbability__OperatorAssignment_0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3126:1: ( ( rule__CompareProbability__OperatorAssignment_0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3126:1: ( ( rule__CompareProbability__OperatorAssignment_0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3127:1: ( rule__CompareProbability__OperatorAssignment_0 )
            {
             before(grammarAccess.getCompareProbabilityAccess().getOperatorAssignment_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3128:1: ( rule__CompareProbability__OperatorAssignment_0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3128:2: rule__CompareProbability__OperatorAssignment_0
            {
            pushFollow(FOLLOW_rule__CompareProbability__OperatorAssignment_0_in_rule__CompareProbability__Group__0__Impl6296);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3138:1: rule__CompareProbability__Group__1 : rule__CompareProbability__Group__1__Impl ;
    public final void rule__CompareProbability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3142:1: ( rule__CompareProbability__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3143:2: rule__CompareProbability__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareProbability__Group__1__Impl_in_rule__CompareProbability__Group__16326);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3149:1: rule__CompareProbability__Group__1__Impl : ( ( rule__CompareProbability__ValueAssignment_1 ) ) ;
    public final void rule__CompareProbability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3153:1: ( ( ( rule__CompareProbability__ValueAssignment_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3154:1: ( ( rule__CompareProbability__ValueAssignment_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3154:1: ( ( rule__CompareProbability__ValueAssignment_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3155:1: ( rule__CompareProbability__ValueAssignment_1 )
            {
             before(grammarAccess.getCompareProbabilityAccess().getValueAssignment_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3156:1: ( rule__CompareProbability__ValueAssignment_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3156:2: rule__CompareProbability__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__CompareProbability__ValueAssignment_1_in_rule__CompareProbability__Group__1__Impl6353);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3170:1: rule__TimeBound__Group_0__0 : rule__TimeBound__Group_0__0__Impl rule__TimeBound__Group_0__1 ;
    public final void rule__TimeBound__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3174:1: ( rule__TimeBound__Group_0__0__Impl rule__TimeBound__Group_0__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3175:2: rule__TimeBound__Group_0__0__Impl rule__TimeBound__Group_0__1
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_0__0__Impl_in_rule__TimeBound__Group_0__06387);
            rule__TimeBound__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_0__1_in_rule__TimeBound__Group_0__06390);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3182:1: rule__TimeBound__Group_0__0__Impl : ( ( rule__TimeBound__OperatorAssignment_0_0 ) ) ;
    public final void rule__TimeBound__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3186:1: ( ( ( rule__TimeBound__OperatorAssignment_0_0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3187:1: ( ( rule__TimeBound__OperatorAssignment_0_0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3187:1: ( ( rule__TimeBound__OperatorAssignment_0_0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3188:1: ( rule__TimeBound__OperatorAssignment_0_0 )
            {
             before(grammarAccess.getTimeBoundAccess().getOperatorAssignment_0_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3189:1: ( rule__TimeBound__OperatorAssignment_0_0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3189:2: rule__TimeBound__OperatorAssignment_0_0
            {
            pushFollow(FOLLOW_rule__TimeBound__OperatorAssignment_0_0_in_rule__TimeBound__Group_0__0__Impl6417);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3199:1: rule__TimeBound__Group_0__1 : rule__TimeBound__Group_0__1__Impl ;
    public final void rule__TimeBound__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3203:1: ( rule__TimeBound__Group_0__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3204:2: rule__TimeBound__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_0__1__Impl_in_rule__TimeBound__Group_0__16447);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3210:1: rule__TimeBound__Group_0__1__Impl : ( ( rule__TimeBound__ValueAssignment_0_1 ) ) ;
    public final void rule__TimeBound__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3214:1: ( ( ( rule__TimeBound__ValueAssignment_0_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3215:1: ( ( rule__TimeBound__ValueAssignment_0_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3215:1: ( ( rule__TimeBound__ValueAssignment_0_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3216:1: ( rule__TimeBound__ValueAssignment_0_1 )
            {
             before(grammarAccess.getTimeBoundAccess().getValueAssignment_0_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3217:1: ( rule__TimeBound__ValueAssignment_0_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3217:2: rule__TimeBound__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__TimeBound__ValueAssignment_0_1_in_rule__TimeBound__Group_0__1__Impl6474);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3231:1: rule__TimeBound__Group_1__0 : rule__TimeBound__Group_1__0__Impl rule__TimeBound__Group_1__1 ;
    public final void rule__TimeBound__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3235:1: ( rule__TimeBound__Group_1__0__Impl rule__TimeBound__Group_1__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3236:2: rule__TimeBound__Group_1__0__Impl rule__TimeBound__Group_1__1
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__0__Impl_in_rule__TimeBound__Group_1__06508);
            rule__TimeBound__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_1__1_in_rule__TimeBound__Group_1__06511);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3243:1: rule__TimeBound__Group_1__0__Impl : ( '[' ) ;
    public final void rule__TimeBound__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3247:1: ( ( '[' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3248:1: ( '[' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3248:1: ( '[' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3249:1: '['
            {
             before(grammarAccess.getTimeBoundAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__TimeBound__Group_1__0__Impl6539); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3262:1: rule__TimeBound__Group_1__1 : rule__TimeBound__Group_1__1__Impl rule__TimeBound__Group_1__2 ;
    public final void rule__TimeBound__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3266:1: ( rule__TimeBound__Group_1__1__Impl rule__TimeBound__Group_1__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3267:2: rule__TimeBound__Group_1__1__Impl rule__TimeBound__Group_1__2
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__1__Impl_in_rule__TimeBound__Group_1__16570);
            rule__TimeBound__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_1__2_in_rule__TimeBound__Group_1__16573);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3274:1: rule__TimeBound__Group_1__1__Impl : ( ( rule__TimeBound__FromAssignment_1_1 ) ) ;
    public final void rule__TimeBound__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3278:1: ( ( ( rule__TimeBound__FromAssignment_1_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3279:1: ( ( rule__TimeBound__FromAssignment_1_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3279:1: ( ( rule__TimeBound__FromAssignment_1_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3280:1: ( rule__TimeBound__FromAssignment_1_1 )
            {
             before(grammarAccess.getTimeBoundAccess().getFromAssignment_1_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3281:1: ( rule__TimeBound__FromAssignment_1_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3281:2: rule__TimeBound__FromAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TimeBound__FromAssignment_1_1_in_rule__TimeBound__Group_1__1__Impl6600);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3291:1: rule__TimeBound__Group_1__2 : rule__TimeBound__Group_1__2__Impl rule__TimeBound__Group_1__3 ;
    public final void rule__TimeBound__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3295:1: ( rule__TimeBound__Group_1__2__Impl rule__TimeBound__Group_1__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3296:2: rule__TimeBound__Group_1__2__Impl rule__TimeBound__Group_1__3
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__2__Impl_in_rule__TimeBound__Group_1__26630);
            rule__TimeBound__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_1__3_in_rule__TimeBound__Group_1__26633);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3303:1: rule__TimeBound__Group_1__2__Impl : ( ( rule__TimeBound__OperatorAssignment_1_2 ) ) ;
    public final void rule__TimeBound__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3307:1: ( ( ( rule__TimeBound__OperatorAssignment_1_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3308:1: ( ( rule__TimeBound__OperatorAssignment_1_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3308:1: ( ( rule__TimeBound__OperatorAssignment_1_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3309:1: ( rule__TimeBound__OperatorAssignment_1_2 )
            {
             before(grammarAccess.getTimeBoundAccess().getOperatorAssignment_1_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3310:1: ( rule__TimeBound__OperatorAssignment_1_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3310:2: rule__TimeBound__OperatorAssignment_1_2
            {
            pushFollow(FOLLOW_rule__TimeBound__OperatorAssignment_1_2_in_rule__TimeBound__Group_1__2__Impl6660);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3320:1: rule__TimeBound__Group_1__3 : rule__TimeBound__Group_1__3__Impl rule__TimeBound__Group_1__4 ;
    public final void rule__TimeBound__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3324:1: ( rule__TimeBound__Group_1__3__Impl rule__TimeBound__Group_1__4 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3325:2: rule__TimeBound__Group_1__3__Impl rule__TimeBound__Group_1__4
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__3__Impl_in_rule__TimeBound__Group_1__36690);
            rule__TimeBound__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_1__4_in_rule__TimeBound__Group_1__36693);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3332:1: rule__TimeBound__Group_1__3__Impl : ( ( rule__TimeBound__ToAssignment_1_3 ) ) ;
    public final void rule__TimeBound__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3336:1: ( ( ( rule__TimeBound__ToAssignment_1_3 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3337:1: ( ( rule__TimeBound__ToAssignment_1_3 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3337:1: ( ( rule__TimeBound__ToAssignment_1_3 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3338:1: ( rule__TimeBound__ToAssignment_1_3 )
            {
             before(grammarAccess.getTimeBoundAccess().getToAssignment_1_3()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3339:1: ( rule__TimeBound__ToAssignment_1_3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3339:2: rule__TimeBound__ToAssignment_1_3
            {
            pushFollow(FOLLOW_rule__TimeBound__ToAssignment_1_3_in_rule__TimeBound__Group_1__3__Impl6720);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3349:1: rule__TimeBound__Group_1__4 : rule__TimeBound__Group_1__4__Impl ;
    public final void rule__TimeBound__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3353:1: ( rule__TimeBound__Group_1__4__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3354:2: rule__TimeBound__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__4__Impl_in_rule__TimeBound__Group_1__46750);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3360:1: rule__TimeBound__Group_1__4__Impl : ( ']' ) ;
    public final void rule__TimeBound__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3364:1: ( ( ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3365:1: ( ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3365:1: ( ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3366:1: ']'
            {
             before(grammarAccess.getTimeBoundAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,21,FOLLOW_21_in_rule__TimeBound__Group_1__4__Impl6778); 
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


    // $ANTLR start "rule__Start__RuleAssignment"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3390:1: rule__Start__RuleAssignment : ( ruleFragment ) ;
    public final void rule__Start__RuleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3394:1: ( ( ruleFragment ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3395:1: ( ruleFragment )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3395:1: ( ruleFragment )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3396:1: ruleFragment
            {
             before(grammarAccess.getStartAccess().getRuleFragmentParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFragment_in_rule__Start__RuleAssignment6824);
            ruleFragment();

            state._fsp--;

             after(grammarAccess.getStartAccess().getRuleFragmentParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Start__RuleAssignment"


    // $ANTLR start "rule__Comment__CommentAssignment"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3405:1: rule__Comment__CommentAssignment : ( RULE_SL_COMMENT ) ;
    public final void rule__Comment__CommentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3409:1: ( ( RULE_SL_COMMENT ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3410:1: ( RULE_SL_COMMENT )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3410:1: ( RULE_SL_COMMENT )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3411:1: RULE_SL_COMMENT
            {
             before(grammarAccess.getCommentAccess().getCommentSL_COMMENTTerminalRuleCall_0()); 
            match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_rule__Comment__CommentAssignment6855); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3420:1: rule__SteadyState__BoundAssignment_2_0 : ( ruleCompareProbability ) ;
    public final void rule__SteadyState__BoundAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3424:1: ( ( ruleCompareProbability ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3425:1: ( ruleCompareProbability )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3425:1: ( ruleCompareProbability )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3426:1: ruleCompareProbability
            {
             before(grammarAccess.getSteadyStateAccess().getBoundCompareProbabilityParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleCompareProbability_in_rule__SteadyState__BoundAssignment_2_06886);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3435:1: rule__SteadyState__ValueAssignment_6 : ( ruleStateFormula ) ;
    public final void rule__SteadyState__ValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3439:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3440:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3440:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3441:1: ruleStateFormula
            {
             before(grammarAccess.getSteadyStateAccess().getValueStateFormulaParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__SteadyState__ValueAssignment_66917);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3450:1: rule__QuantifiedProbability__ValueAssignment_5 : ( rulePathFormula ) ;
    public final void rule__QuantifiedProbability__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3454:1: ( ( rulePathFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3455:1: ( rulePathFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3455:1: ( rulePathFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3456:1: rulePathFormula
            {
             before(grammarAccess.getQuantifiedProbabilityAccess().getValuePathFormulaParserRuleCall_5_0()); 
            pushFollow(FOLLOW_rulePathFormula_in_rule__QuantifiedProbability__ValueAssignment_56948);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3465:1: rule__BooleanRule__ValueAssignment : ( ruleStateFormula ) ;
    public final void rule__BooleanRule__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3469:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3470:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3470:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3471:1: ruleStateFormula
            {
             before(grammarAccess.getBooleanRuleAccess().getValueStateFormulaParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__BooleanRule__ValueAssignment6979);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3480:1: rule__StateFormula__LeftAssignment_0_2 : ( ruleStateFormula ) ;
    public final void rule__StateFormula__LeftAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3484:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3485:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3485:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3486:1: ruleStateFormula
            {
             before(grammarAccess.getStateFormulaAccess().getLeftStateFormulaParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__StateFormula__LeftAssignment_0_27010);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3495:1: rule__StateFormula__RightAssignment_0_3_0 : ( ruleJunction ) ;
    public final void rule__StateFormula__RightAssignment_0_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3499:1: ( ( ruleJunction ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3500:1: ( ruleJunction )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3500:1: ( ruleJunction )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3501:1: ruleJunction
            {
             before(grammarAccess.getStateFormulaAccess().getRightJunctionParserRuleCall_0_3_0_0()); 
            pushFollow(FOLLOW_ruleJunction_in_rule__StateFormula__RightAssignment_0_3_07041);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3510:1: rule__StateFormula__RightAssignment_0_3_1 : ( ruleImplication ) ;
    public final void rule__StateFormula__RightAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3514:1: ( ( ruleImplication ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3515:1: ( ruleImplication )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3515:1: ( ruleImplication )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3516:1: ruleImplication
            {
             before(grammarAccess.getStateFormulaAccess().getRightImplicationParserRuleCall_0_3_1_0()); 
            pushFollow(FOLLOW_ruleImplication_in_rule__StateFormula__RightAssignment_0_3_17072);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3525:1: rule__StateFormula__LeftAssignment_1 : ( ( rule__StateFormula__LeftAlternatives_1_0 ) ) ;
    public final void rule__StateFormula__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3529:1: ( ( ( rule__StateFormula__LeftAlternatives_1_0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3530:1: ( ( rule__StateFormula__LeftAlternatives_1_0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3530:1: ( ( rule__StateFormula__LeftAlternatives_1_0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3531:1: ( rule__StateFormula__LeftAlternatives_1_0 )
            {
             before(grammarAccess.getStateFormulaAccess().getLeftAlternatives_1_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3532:1: ( rule__StateFormula__LeftAlternatives_1_0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3532:2: rule__StateFormula__LeftAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__StateFormula__LeftAlternatives_1_0_in_rule__StateFormula__LeftAssignment_17103);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3541:1: rule__Conjunction__RightAssignment_2_2 : ( ruleStateFormula ) ;
    public final void rule__Conjunction__RightAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3545:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3546:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3546:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3547:1: ruleStateFormula
            {
             before(grammarAccess.getConjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Conjunction__RightAssignment_2_27136);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3556:1: rule__Disjunction__RightAssignment_2_2 : ( ruleStateFormula ) ;
    public final void rule__Disjunction__RightAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3560:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3561:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3561:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3562:1: ruleStateFormula
            {
             before(grammarAccess.getDisjunctionAccess().getRightStateFormulaParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Disjunction__RightAssignment_2_27167);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3571:1: rule__Implication__RightAssignment_1 : ( ruleStateFormula ) ;
    public final void rule__Implication__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3575:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3576:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3576:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3577:1: ruleStateFormula
            {
             before(grammarAccess.getImplicationAccess().getRightStateFormulaParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Implication__RightAssignment_17198);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3586:1: rule__Probability__ComparatorAssignment_3 : ( ruleCompareProbability ) ;
    public final void rule__Probability__ComparatorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3590:1: ( ( ruleCompareProbability ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3591:1: ( ruleCompareProbability )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3591:1: ( ruleCompareProbability )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3592:1: ruleCompareProbability
            {
             before(grammarAccess.getProbabilityAccess().getComparatorCompareProbabilityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleCompareProbability_in_rule__Probability__ComparatorAssignment_37229);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3601:1: rule__Probability__PathAssignment_6 : ( rulePathFormula ) ;
    public final void rule__Probability__PathAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3605:1: ( ( rulePathFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3606:1: ( rulePathFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3606:1: ( rulePathFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3607:1: rulePathFormula
            {
             before(grammarAccess.getProbabilityAccess().getPathPathFormulaParserRuleCall_6_0()); 
            pushFollow(FOLLOW_rulePathFormula_in_rule__Probability__PathAssignment_67260);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3616:1: rule__State__ValueAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3620:1: ( ( RULE_ID ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3621:1: ( RULE_ID )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3621:1: ( RULE_ID )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3622:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getValueIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__ValueAssignment_17291); 
             after(grammarAccess.getStateAccess().getValueIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3631:1: rule__Label__ValueAssignment_1 : ( RULE_ID ) ;
    public final void rule__Label__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3635:1: ( ( RULE_ID ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3636:1: ( RULE_ID )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3636:1: ( RULE_ID )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3637:1: RULE_ID
            {
             before(grammarAccess.getLabelAccess().getValueIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Label__ValueAssignment_17322); 
             after(grammarAccess.getLabelAccess().getValueIDTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3646:1: rule__Boolean__ValueAssignment : ( RULE_BOOL ) ;
    public final void rule__Boolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3650:1: ( ( RULE_BOOL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3651:1: ( RULE_BOOL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3651:1: ( RULE_BOOL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3652:1: RULE_BOOL
            {
             before(grammarAccess.getBooleanAccess().getValueBOOLTerminalRuleCall_0()); 
            match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rule__Boolean__ValueAssignment7353); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3661:1: rule__Until__LeftAssignment_0 : ( ruleStateFormula ) ;
    public final void rule__Until__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3665:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3666:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3666:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3667:1: ruleStateFormula
            {
             before(grammarAccess.getUntilAccess().getLeftStateFormulaParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Until__LeftAssignment_07384);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3676:1: rule__Until__TypeAssignment_1 : ( ( rule__Until__TypeAlternatives_1_0 ) ) ;
    public final void rule__Until__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3680:1: ( ( ( rule__Until__TypeAlternatives_1_0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3681:1: ( ( rule__Until__TypeAlternatives_1_0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3681:1: ( ( rule__Until__TypeAlternatives_1_0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3682:1: ( rule__Until__TypeAlternatives_1_0 )
            {
             before(grammarAccess.getUntilAccess().getTypeAlternatives_1_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3683:1: ( rule__Until__TypeAlternatives_1_0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3683:2: rule__Until__TypeAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Until__TypeAlternatives_1_0_in_rule__Until__TypeAssignment_17415);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3692:1: rule__Until__BoundAssignment_2 : ( ruleTimeBound ) ;
    public final void rule__Until__BoundAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3696:1: ( ( ruleTimeBound ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3697:1: ( ruleTimeBound )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3697:1: ( ruleTimeBound )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3698:1: ruleTimeBound
            {
             before(grammarAccess.getUntilAccess().getBoundTimeBoundParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTimeBound_in_rule__Until__BoundAssignment_27448);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3707:1: rule__Until__RightAssignment_3 : ( ruleStateFormula ) ;
    public final void rule__Until__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3711:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3712:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3712:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3713:1: ruleStateFormula
            {
             before(grammarAccess.getUntilAccess().getRightStateFormulaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Until__RightAssignment_37479);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3722:1: rule__Next__BoundAssignment_1 : ( ruleTimeBound ) ;
    public final void rule__Next__BoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3726:1: ( ( ruleTimeBound ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3727:1: ( ruleTimeBound )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3727:1: ( ruleTimeBound )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3728:1: ruleTimeBound
            {
             before(grammarAccess.getNextAccess().getBoundTimeBoundParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTimeBound_in_rule__Next__BoundAssignment_17510);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3737:1: rule__Next__ValueAssignment_2 : ( ruleStateFormula ) ;
    public final void rule__Next__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3741:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3742:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3742:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3743:1: ruleStateFormula
            {
             before(grammarAccess.getNextAccess().getValueStateFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Next__ValueAssignment_27541);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3752:1: rule__Future__BoundAssignment_1 : ( ruleTimeBound ) ;
    public final void rule__Future__BoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3756:1: ( ( ruleTimeBound ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3757:1: ( ruleTimeBound )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3757:1: ( ruleTimeBound )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3758:1: ruleTimeBound
            {
             before(grammarAccess.getFutureAccess().getBoundTimeBoundParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTimeBound_in_rule__Future__BoundAssignment_17572);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3767:1: rule__Future__ValueAssignment_2 : ( ruleStateFormula ) ;
    public final void rule__Future__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3771:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3772:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3772:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3773:1: ruleStateFormula
            {
             before(grammarAccess.getFutureAccess().getValueStateFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Future__ValueAssignment_27603);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3782:1: rule__Globally__BoundAssignment_1 : ( ruleTimeBound ) ;
    public final void rule__Globally__BoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3786:1: ( ( ruleTimeBound ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3787:1: ( ruleTimeBound )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3787:1: ( ruleTimeBound )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3788:1: ruleTimeBound
            {
             before(grammarAccess.getGloballyAccess().getBoundTimeBoundParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTimeBound_in_rule__Globally__BoundAssignment_17634);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3797:1: rule__Globally__ValueAssignment_2 : ( ruleStateFormula ) ;
    public final void rule__Globally__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3801:1: ( ( ruleStateFormula ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3802:1: ( ruleStateFormula )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3802:1: ( ruleStateFormula )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3803:1: ruleStateFormula
            {
             before(grammarAccess.getGloballyAccess().getValueStateFormulaParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStateFormula_in_rule__Globally__ValueAssignment_27665);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3812:1: rule__CompareProbability__OperatorAssignment_0 : ( RULE_COMPARATOR ) ;
    public final void rule__CompareProbability__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3816:1: ( ( RULE_COMPARATOR ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3817:1: ( RULE_COMPARATOR )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3817:1: ( RULE_COMPARATOR )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3818:1: RULE_COMPARATOR
            {
             before(grammarAccess.getCompareProbabilityAccess().getOperatorCOMPARATORTerminalRuleCall_0_0()); 
            match(input,RULE_COMPARATOR,FOLLOW_RULE_COMPARATOR_in_rule__CompareProbability__OperatorAssignment_07696); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3827:1: rule__CompareProbability__ValueAssignment_1 : ( RULE_DOUBLE ) ;
    public final void rule__CompareProbability__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3831:1: ( ( RULE_DOUBLE ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3832:1: ( RULE_DOUBLE )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3832:1: ( RULE_DOUBLE )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3833:1: RULE_DOUBLE
            {
             before(grammarAccess.getCompareProbabilityAccess().getValueDOUBLETerminalRuleCall_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__CompareProbability__ValueAssignment_17727); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3842:1: rule__TimeBound__OperatorAssignment_0_0 : ( ( rule__TimeBound__OperatorAlternatives_0_0_0 ) ) ;
    public final void rule__TimeBound__OperatorAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3846:1: ( ( ( rule__TimeBound__OperatorAlternatives_0_0_0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3847:1: ( ( rule__TimeBound__OperatorAlternatives_0_0_0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3847:1: ( ( rule__TimeBound__OperatorAlternatives_0_0_0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3848:1: ( rule__TimeBound__OperatorAlternatives_0_0_0 )
            {
             before(grammarAccess.getTimeBoundAccess().getOperatorAlternatives_0_0_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3849:1: ( rule__TimeBound__OperatorAlternatives_0_0_0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3849:2: rule__TimeBound__OperatorAlternatives_0_0_0
            {
            pushFollow(FOLLOW_rule__TimeBound__OperatorAlternatives_0_0_0_in_rule__TimeBound__OperatorAssignment_0_07758);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3858:1: rule__TimeBound__ValueAssignment_0_1 : ( RULE_DOUBLE ) ;
    public final void rule__TimeBound__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3862:1: ( ( RULE_DOUBLE ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3863:1: ( RULE_DOUBLE )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3863:1: ( RULE_DOUBLE )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3864:1: RULE_DOUBLE
            {
             before(grammarAccess.getTimeBoundAccess().getValueDOUBLETerminalRuleCall_0_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__TimeBound__ValueAssignment_0_17791); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3873:1: rule__TimeBound__FromAssignment_1_1 : ( RULE_DOUBLE ) ;
    public final void rule__TimeBound__FromAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3877:1: ( ( RULE_DOUBLE ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3878:1: ( RULE_DOUBLE )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3878:1: ( RULE_DOUBLE )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3879:1: RULE_DOUBLE
            {
             before(grammarAccess.getTimeBoundAccess().getFromDOUBLETerminalRuleCall_1_1_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__TimeBound__FromAssignment_1_17822); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3888:1: rule__TimeBound__OperatorAssignment_1_2 : ( ( ',' ) ) ;
    public final void rule__TimeBound__OperatorAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3892:1: ( ( ( ',' ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3893:1: ( ( ',' ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3893:1: ( ( ',' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3894:1: ( ',' )
            {
             before(grammarAccess.getTimeBoundAccess().getOperatorCommaKeyword_1_2_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3895:1: ( ',' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3896:1: ','
            {
             before(grammarAccess.getTimeBoundAccess().getOperatorCommaKeyword_1_2_0()); 
            match(input,34,FOLLOW_34_in_rule__TimeBound__OperatorAssignment_1_27858); 
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3911:1: rule__TimeBound__ToAssignment_1_3 : ( RULE_DOUBLE ) ;
    public final void rule__TimeBound__ToAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3915:1: ( ( RULE_DOUBLE ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3916:1: ( RULE_DOUBLE )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3916:1: ( RULE_DOUBLE )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3917:1: RULE_DOUBLE
            {
             before(grammarAccess.getTimeBoundAccess().getToDOUBLETerminalRuleCall_1_3_0()); 
            match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_rule__TimeBound__ToAssignment_1_37897); 
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


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\6\uffff";
    static final String DFA3_eofS =
        "\6\uffff";
    static final String DFA3_minS =
        "\1\7\1\uffff\1\4\1\uffff\1\4\1\uffff";
    static final String DFA3_maxS =
        "\1\36\1\uffff\1\16\1\uffff\1\16\1\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\uffff\1\3";
    static final String DFA3_specialS =
        "\6\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\13\uffff\1\3\2\uffff\1\2\1\1\1\uffff\1\1\3\uffff\2\1",
            "",
            "\1\1\1\4\10\uffff\1\5",
            "",
            "\1\1\1\4\10\uffff\1\5",
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
            return "830:1: rule__Rule__Alternatives : ( ( ruleBooleanRule ) | ( ruleSteadyState ) | ( ruleQuantifiedProbability ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleStart_in_entryRuleStart61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStart68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Start__RuleAssignment_in_ruleStart94 = new BitSet(new long[]{0x0000000062C800A2L});
    public static final BitSet FOLLOW_ruleFragment_in_entryRuleFragment122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFragment129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fragment__Alternatives_in_ruleFragment155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comment__CommentAssignment_in_ruleComment215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Alternatives_in_ruleRule284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSteadyState_in_entryRuleSteadyState311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSteadyState318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__0_in_ruleSteadyState344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedProbability_in_entryRuleQuantifiedProbability371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantifiedProbability378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__0_in_ruleQuantifiedProbability404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanRule_in_entryRuleBooleanRule431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanRule438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanRule__ValueAssignment_in_ruleBooleanRule464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_entryRuleStateFormula491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateFormula498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Alternatives_in_ruleStateFormula524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__0_in_ruleNegation584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJunction_in_entryRuleJunction616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJunction623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Junction__Alternatives_in_ruleJunction653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__0_in_ruleConjunction713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__0_in_ruleDisjunction773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group__0_in_ruleImplication842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbability_in_entryRuleProbability869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProbability876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__0_in_ruleProbability902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atomic__Alternatives_in_ruleAtomic962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel1049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0_in_ruleLabel1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_entryRuleBoolean1109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolean1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Boolean__ValueAssignment_in_ruleBoolean1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathFormula_in_entryRulePathFormula1174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathFormula1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathFormula__Alternatives_in_rulePathFormula1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUntil_in_entryRuleUntil1238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUntil1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Group__0_in_ruleUntil1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNext_in_entryRuleNext1298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNext1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__Group__0_in_ruleNext1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuture_in_entryRuleFuture1358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFuture1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__Group__0_in_ruleFuture1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobally_in_entryRuleGlobally1418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobally1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__Group__0_in_ruleGlobally1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_entryRuleCompareProbability1483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareProbability1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group__0_in_ruleCompareProbability1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_entryRuleTimeBound1552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeBound1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Alternatives_in_ruleTimeBound1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_rule__Fragment__Alternatives1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Fragment__Alternatives1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanRule_in_rule__Rule__Alternatives1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSteadyState_in_rule__Rule__Alternatives1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantifiedProbability_in_rule__Rule__Alternatives1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__BoundAssignment_2_0_in_rule__SteadyState__Alternatives_21740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__SteadyState__Alternatives_21759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__0_in_rule__StateFormula__Alternatives1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__LeftAssignment_1_in_rule__StateFormula__Alternatives1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__RightAssignment_0_3_0_in_rule__StateFormula__Alternatives_0_31844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__RightAssignment_0_3_1_in_rule__StateFormula__Alternatives_0_31862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_rule__StateFormula__LeftAlternatives_1_01895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rule__StateFormula__LeftAlternatives_1_01912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProbability_in_rule__StateFormula__LeftAlternatives_1_01929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Junction__Alternatives1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_rule__Junction__Alternatives1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Atomic__Alternatives2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__Atomic__Alternatives2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolean_in_rule__Atomic__Alternatives2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNext_in_rule__PathFormula__Alternatives2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUntil_in_rule__PathFormula__Alternatives2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFuture_in_rule__PathFormula__Alternatives2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobally_in_rule__PathFormula__Alternatives2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Until__TypeAlternatives_1_02160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Until__TypeAlternatives_1_02180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Until__TypeAlternatives_1_02200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0__0_in_rule__TimeBound__Alternatives2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__0_in_rule__TimeBound__Alternatives2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMPARATOR_in_rule__TimeBound__OperatorAlternatives_0_0_02285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TimeBound__OperatorAlternatives_0_0_02303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__0__Impl_in_rule__SteadyState__Group__02335 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__1_in_rule__SteadyState__Group__02338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__SteadyState__Group__0__Impl2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__1__Impl_in_rule__SteadyState__Group__12397 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__2_in_rule__SteadyState__Group__12400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__SteadyState__Group__1__Impl2428 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__2__Impl_in_rule__SteadyState__Group__22459 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__3_in_rule__SteadyState__Group__22462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Alternatives_2_in_rule__SteadyState__Group__2__Impl2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__3__Impl_in_rule__SteadyState__Group__32519 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__4_in_rule__SteadyState__Group__32522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__SteadyState__Group__3__Impl2550 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__4__Impl_in_rule__SteadyState__Group__42581 = new BitSet(new long[]{0x0000000062C000A0L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__5_in_rule__SteadyState__Group__42584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SteadyState__Group__4__Impl2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__5__Impl_in_rule__SteadyState__Group__52643 = new BitSet(new long[]{0x0000000062C000A0L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__6_in_rule__SteadyState__Group__52646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__SteadyState__Group__5__Impl2674 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__6__Impl_in_rule__SteadyState__Group__62705 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__7_in_rule__SteadyState__Group__62708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__ValueAssignment_6_in_rule__SteadyState__Group__6__Impl2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__7__Impl_in_rule__SteadyState__Group__72765 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__8_in_rule__SteadyState__Group__72768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__SteadyState__Group__7__Impl2796 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__SteadyState__Group__8__Impl_in_rule__SteadyState__Group__82827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SteadyState__Group__8__Impl2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__0__Impl_in_rule__QuantifiedProbability__Group__02904 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__1_in_rule__QuantifiedProbability__Group__02907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__QuantifiedProbability__Group__0__Impl2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__1__Impl_in_rule__QuantifiedProbability__Group__12966 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__2_in_rule__QuantifiedProbability__Group__12969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__QuantifiedProbability__Group__1__Impl2997 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__2__Impl_in_rule__QuantifiedProbability__Group__23028 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__3_in_rule__QuantifiedProbability__Group__23031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__QuantifiedProbability__Group__2__Impl3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__3__Impl_in_rule__QuantifiedProbability__Group__33090 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__4_in_rule__QuantifiedProbability__Group__33093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__QuantifiedProbability__Group__3__Impl3121 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__4__Impl_in_rule__QuantifiedProbability__Group__43152 = new BitSet(new long[]{0x00000003E2C00080L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__5_in_rule__QuantifiedProbability__Group__43155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__QuantifiedProbability__Group__4__Impl3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__5__Impl_in_rule__QuantifiedProbability__Group__53214 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__6_in_rule__QuantifiedProbability__Group__53217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__ValueAssignment_5_in_rule__QuantifiedProbability__Group__5__Impl3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QuantifiedProbability__Group__6__Impl_in_rule__QuantifiedProbability__Group__63274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__QuantifiedProbability__Group__6__Impl3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__0__Impl_in_rule__StateFormula__Group_0__03347 = new BitSet(new long[]{0x0000000062C000A0L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__1_in_rule__StateFormula__Group_0__03350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__StateFormula__Group_0__0__Impl3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__1__Impl_in_rule__StateFormula__Group_0__13409 = new BitSet(new long[]{0x0000000062C000A0L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__2_in_rule__StateFormula__Group_0__13412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__StateFormula__Group_0__1__Impl3440 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__2__Impl_in_rule__StateFormula__Group_0__23471 = new BitSet(new long[]{0x000000001D000020L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__3_in_rule__StateFormula__Group_0__23474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__LeftAssignment_0_2_in_rule__StateFormula__Group_0__2__Impl3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__3__Impl_in_rule__StateFormula__Group_0__33531 = new BitSet(new long[]{0x000000001D000020L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__4_in_rule__StateFormula__Group_0__33534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Alternatives_0_3_in_rule__StateFormula__Group_0__3__Impl3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__4__Impl_in_rule__StateFormula__Group_0__43592 = new BitSet(new long[]{0x000000001D000020L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__5_in_rule__StateFormula__Group_0__43595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__StateFormula__Group_0__4__Impl3623 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__StateFormula__Group_0__5__Impl_in_rule__StateFormula__Group_0__53654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__StateFormula__Group_0__5__Impl3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__0__Impl_in_rule__Negation__Group__03725 = new BitSet(new long[]{0x0000000062C00080L});
    public static final BitSet FOLLOW_rule__Negation__Group__1_in_rule__Negation__Group__03728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Negation__Group__0__Impl3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group__1__Impl_in_rule__Negation__Group__13787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Negation__Group__1__Impl3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__03847 = new BitSet(new long[]{0x0000000062C00080L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__03850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Conjunction__Group__0__Impl3878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__13909 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__2_in_rule__Conjunction__Group__13912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Conjunction__Group__1__Impl3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__2__Impl_in_rule__Conjunction__Group__23968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__0_in_rule__Conjunction__Group__2__Impl3995 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__0__Impl_in_rule__Conjunction__Group_2__04032 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__1_in_rule__Conjunction__Group_2__04035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__1__Impl_in_rule__Conjunction__Group_2__14093 = new BitSet(new long[]{0x0000000062C00080L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__2_in_rule__Conjunction__Group_2__14096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Conjunction__Group_2__1__Impl4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_2__2__Impl_in_rule__Conjunction__Group_2__24155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__RightAssignment_2_2_in_rule__Conjunction__Group_2__2__Impl4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__0__Impl_in_rule__Disjunction__Group__04218 = new BitSet(new long[]{0x0000000062C00080L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__1_in_rule__Disjunction__Group__04221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Disjunction__Group__0__Impl4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__1__Impl_in_rule__Disjunction__Group__14280 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__2_in_rule__Disjunction__Group__14283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Disjunction__Group__1__Impl4310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__2__Impl_in_rule__Disjunction__Group__24339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__0_in_rule__Disjunction__Group__2__Impl4366 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__0__Impl_in_rule__Disjunction__Group_2__04403 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__1_in_rule__Disjunction__Group_2__04406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__1__Impl_in_rule__Disjunction__Group_2__14464 = new BitSet(new long[]{0x0000000062C00080L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__2_in_rule__Disjunction__Group_2__14467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Disjunction__Group_2__1__Impl4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_2__2__Impl_in_rule__Disjunction__Group_2__24526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__RightAssignment_2_2_in_rule__Disjunction__Group_2__2__Impl4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group__0__Impl_in_rule__Implication__Group__04589 = new BitSet(new long[]{0x0000000062C00080L});
    public static final BitSet FOLLOW_rule__Implication__Group__1_in_rule__Implication__Group__04592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Implication__Group__0__Impl4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group__1__Impl_in_rule__Implication__Group__14651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__RightAssignment_1_in_rule__Implication__Group__1__Impl4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__0__Impl_in_rule__Probability__Group__04712 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Probability__Group__1_in_rule__Probability__Group__04715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Probability__Group__0__Impl4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__1__Impl_in_rule__Probability__Group__14774 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Probability__Group__2_in_rule__Probability__Group__14777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__Probability__Group__1__Impl4805 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Probability__Group__2__Impl_in_rule__Probability__Group__24836 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Probability__Group__3_in_rule__Probability__Group__24839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__3__Impl_in_rule__Probability__Group__34897 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__Probability__Group__4_in_rule__Probability__Group__34900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__ComparatorAssignment_3_in_rule__Probability__Group__3__Impl4927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__4__Impl_in_rule__Probability__Group__44957 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_rule__Probability__Group__5_in_rule__Probability__Group__44960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__Probability__Group__4__Impl4988 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Probability__Group__5__Impl_in_rule__Probability__Group__55019 = new BitSet(new long[]{0x00000003E2C00080L});
    public static final BitSet FOLLOW_rule__Probability__Group__6_in_rule__Probability__Group__55022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Probability__Group__5__Impl5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__6__Impl_in_rule__Probability__Group__65081 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Probability__Group__7_in_rule__Probability__Group__65084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__PathAssignment_6_in_rule__Probability__Group__6__Impl5111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Probability__Group__7__Impl_in_rule__Probability__Group__75141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Probability__Group__7__Impl5169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__05216 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__05219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__State__Group__0__Impl5247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__15278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__ValueAssignment_1_in_rule__State__Group__1__Impl5305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__0__Impl_in_rule__Label__Group__05339 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Label__Group__1_in_rule__Label__Group__05342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Label__Group__0__Impl5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group__1__Impl_in_rule__Label__Group__15401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__ValueAssignment_1_in_rule__Label__Group__1__Impl5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Group__0__Impl_in_rule__Until__Group__05462 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__Until__Group__1_in_rule__Until__Group__05465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__LeftAssignment_0_in_rule__Until__Group__0__Impl5492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Group__1__Impl_in_rule__Until__Group__15522 = new BitSet(new long[]{0x0000000062D40090L});
    public static final BitSet FOLLOW_rule__Until__Group__2_in_rule__Until__Group__15525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__TypeAssignment_1_in_rule__Until__Group__1__Impl5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Group__2__Impl_in_rule__Until__Group__25582 = new BitSet(new long[]{0x0000000062D40090L});
    public static final BitSet FOLLOW_rule__Until__Group__3_in_rule__Until__Group__25585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__BoundAssignment_2_in_rule__Until__Group__2__Impl5612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__Group__3__Impl_in_rule__Until__Group__35643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__RightAssignment_3_in_rule__Until__Group__3__Impl5670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__Group__0__Impl_in_rule__Next__Group__05708 = new BitSet(new long[]{0x0000000062D40090L});
    public static final BitSet FOLLOW_rule__Next__Group__1_in_rule__Next__Group__05711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Next__Group__0__Impl5739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__Group__1__Impl_in_rule__Next__Group__15770 = new BitSet(new long[]{0x0000000062D40090L});
    public static final BitSet FOLLOW_rule__Next__Group__2_in_rule__Next__Group__15773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__BoundAssignment_1_in_rule__Next__Group__1__Impl5800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__Group__2__Impl_in_rule__Next__Group__25831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Next__ValueAssignment_2_in_rule__Next__Group__2__Impl5858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__Group__0__Impl_in_rule__Future__Group__05894 = new BitSet(new long[]{0x0000000062D40090L});
    public static final BitSet FOLLOW_rule__Future__Group__1_in_rule__Future__Group__05897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Future__Group__0__Impl5925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__Group__1__Impl_in_rule__Future__Group__15956 = new BitSet(new long[]{0x0000000062D40090L});
    public static final BitSet FOLLOW_rule__Future__Group__2_in_rule__Future__Group__15959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__BoundAssignment_1_in_rule__Future__Group__1__Impl5986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__Group__2__Impl_in_rule__Future__Group__26017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Future__ValueAssignment_2_in_rule__Future__Group__2__Impl6044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__Group__0__Impl_in_rule__Globally__Group__06080 = new BitSet(new long[]{0x0000000062D40090L});
    public static final BitSet FOLLOW_rule__Globally__Group__1_in_rule__Globally__Group__06083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Globally__Group__0__Impl6111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__Group__1__Impl_in_rule__Globally__Group__16142 = new BitSet(new long[]{0x0000000062D40090L});
    public static final BitSet FOLLOW_rule__Globally__Group__2_in_rule__Globally__Group__16145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__BoundAssignment_1_in_rule__Globally__Group__1__Impl6172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__Group__2__Impl_in_rule__Globally__Group__26203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Globally__ValueAssignment_2_in_rule__Globally__Group__2__Impl6230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group__0__Impl_in_rule__CompareProbability__Group__06266 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group__1_in_rule__CompareProbability__Group__06269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__OperatorAssignment_0_in_rule__CompareProbability__Group__0__Impl6296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__Group__1__Impl_in_rule__CompareProbability__Group__16326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareProbability__ValueAssignment_1_in_rule__CompareProbability__Group__1__Impl6353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0__0__Impl_in_rule__TimeBound__Group_0__06387 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0__1_in_rule__TimeBound__Group_0__06390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__OperatorAssignment_0_0_in_rule__TimeBound__Group_0__0__Impl6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0__1__Impl_in_rule__TimeBound__Group_0__16447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__ValueAssignment_0_1_in_rule__TimeBound__Group_0__1__Impl6474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__0__Impl_in_rule__TimeBound__Group_1__06508 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__1_in_rule__TimeBound__Group_1__06511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TimeBound__Group_1__0__Impl6539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__1__Impl_in_rule__TimeBound__Group_1__16570 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__2_in_rule__TimeBound__Group_1__16573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__FromAssignment_1_1_in_rule__TimeBound__Group_1__1__Impl6600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__2__Impl_in_rule__TimeBound__Group_1__26630 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__3_in_rule__TimeBound__Group_1__26633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__OperatorAssignment_1_2_in_rule__TimeBound__Group_1__2__Impl6660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__3__Impl_in_rule__TimeBound__Group_1__36690 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__4_in_rule__TimeBound__Group_1__36693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__ToAssignment_1_3_in_rule__TimeBound__Group_1__3__Impl6720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__4__Impl_in_rule__TimeBound__Group_1__46750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TimeBound__Group_1__4__Impl6778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFragment_in_rule__Start__RuleAssignment6824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_rule__Comment__CommentAssignment6855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_rule__SteadyState__BoundAssignment_2_06886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__SteadyState__ValueAssignment_66917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathFormula_in_rule__QuantifiedProbability__ValueAssignment_56948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__BooleanRule__ValueAssignment6979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__StateFormula__LeftAssignment_0_27010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJunction_in_rule__StateFormula__RightAssignment_0_3_07041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_rule__StateFormula__RightAssignment_0_3_17072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateFormula__LeftAlternatives_1_0_in_rule__StateFormula__LeftAssignment_17103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Conjunction__RightAssignment_2_27136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Disjunction__RightAssignment_2_27167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Implication__RightAssignment_17198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareProbability_in_rule__Probability__ComparatorAssignment_37229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathFormula_in_rule__Probability__PathAssignment_67260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__ValueAssignment_17291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Label__ValueAssignment_17322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rule__Boolean__ValueAssignment7353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Until__LeftAssignment_07384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Until__TypeAlternatives_1_0_in_rule__Until__TypeAssignment_17415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_rule__Until__BoundAssignment_27448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Until__RightAssignment_37479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_rule__Next__BoundAssignment_17510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Next__ValueAssignment_27541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_rule__Future__BoundAssignment_17572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Future__ValueAssignment_27603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_rule__Globally__BoundAssignment_17634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateFormula_in_rule__Globally__ValueAssignment_27665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMPARATOR_in_rule__CompareProbability__OperatorAssignment_07696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__CompareProbability__ValueAssignment_17727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__OperatorAlternatives_0_0_0_in_rule__TimeBound__OperatorAssignment_0_07758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__TimeBound__ValueAssignment_0_17791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__TimeBound__FromAssignment_1_17822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TimeBound__OperatorAssignment_1_27858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__TimeBound__ToAssignment_1_37897 = new BitSet(new long[]{0x0000000000000002L});

}