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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'X'", "'U'", "'W'", "'R'", "'=?'", "'('", "'State:'", "')'", "'Label:'", "'S'", "'['", "']'", "'P'", "'F'", "'G'", "'=>'", "'>'", "'<'", "'>='", "'<='", "'='", "','", "'.'"
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
    public static final int RULE_INT=4;
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:69:1: ruleStart : ( ( rule__Start__Alternatives ) ) ;
    public final void ruleStart() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:73:2: ( ( ( rule__Start__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:74:1: ( ( rule__Start__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:74:1: ( ( rule__Start__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:75:1: ( rule__Start__Alternatives )
            {
             before(grammarAccess.getStartAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:76:1: ( rule__Start__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:76:2: rule__Start__Alternatives
            {
            pushFollow(FOLLOW_rule__Start__Alternatives_in_ruleStart94);
            rule__Start__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStartAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleState"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:88:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:89:1: ( ruleState EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:90:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState121);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState128); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:97:1: ruleState : ( ( rule__State__Alternatives ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:101:2: ( ( ( rule__State__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:102:1: ( ( rule__State__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:102:1: ( ( rule__State__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:103:1: ( rule__State__Alternatives )
            {
             before(grammarAccess.getStateAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:104:1: ( rule__State__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:104:2: rule__State__Alternatives
            {
            pushFollow(FOLLOW_rule__State__Alternatives_in_ruleState154);
            rule__State__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getAlternatives()); 

            }


            }

        }
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:116:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:117:1: ( ruleLabel EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:118:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel181);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel188); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:125:1: ruleLabel : ( ( rule__Label__Alternatives ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:129:2: ( ( ( rule__Label__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:130:1: ( ( rule__Label__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:130:1: ( ( rule__Label__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:131:1: ( rule__Label__Alternatives )
            {
             before(grammarAccess.getLabelAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:132:1: ( rule__Label__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:132:2: rule__Label__Alternatives
            {
            pushFollow(FOLLOW_rule__Label__Alternatives_in_ruleLabel214);
            rule__Label__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleStateOrLabel"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:144:1: entryRuleStateOrLabel : ruleStateOrLabel EOF ;
    public final void entryRuleStateOrLabel() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:145:1: ( ruleStateOrLabel EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:146:1: ruleStateOrLabel EOF
            {
             before(grammarAccess.getStateOrLabelRule()); 
            pushFollow(FOLLOW_ruleStateOrLabel_in_entryRuleStateOrLabel241);
            ruleStateOrLabel();

            state._fsp--;

             after(grammarAccess.getStateOrLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateOrLabel248); 

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
    // $ANTLR end "entryRuleStateOrLabel"


    // $ANTLR start "ruleStateOrLabel"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:153:1: ruleStateOrLabel : ( ( rule__StateOrLabel__Alternatives ) ) ;
    public final void ruleStateOrLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:157:2: ( ( ( rule__StateOrLabel__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:158:1: ( ( rule__StateOrLabel__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:158:1: ( ( rule__StateOrLabel__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:159:1: ( rule__StateOrLabel__Alternatives )
            {
             before(grammarAccess.getStateOrLabelAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:160:1: ( rule__StateOrLabel__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:160:2: rule__StateOrLabel__Alternatives
            {
            pushFollow(FOLLOW_rule__StateOrLabel__Alternatives_in_ruleStateOrLabel274);
            rule__StateOrLabel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateOrLabelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateOrLabel"


    // $ANTLR start "entryRuleS"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:172:1: entryRuleS : ruleS EOF ;
    public final void entryRuleS() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:173:1: ( ruleS EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:174:1: ruleS EOF
            {
             before(grammarAccess.getSRule()); 
            pushFollow(FOLLOW_ruleS_in_entryRuleS301);
            ruleS();

            state._fsp--;

             after(grammarAccess.getSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleS308); 

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
    // $ANTLR end "entryRuleS"


    // $ANTLR start "ruleS"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:181:1: ruleS : ( ( rule__S__Group__0 ) ) ;
    public final void ruleS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:185:2: ( ( ( rule__S__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:186:1: ( ( rule__S__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:186:1: ( ( rule__S__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:187:1: ( rule__S__Group__0 )
            {
             before(grammarAccess.getSAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:188:1: ( rule__S__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:188:2: rule__S__Group__0
            {
            pushFollow(FOLLOW_rule__S__Group__0_in_ruleS334);
            rule__S__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleS"


    // $ANTLR start "entryRuleP1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:200:1: entryRuleP1 : ruleP1 EOF ;
    public final void entryRuleP1() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:201:1: ( ruleP1 EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:202:1: ruleP1 EOF
            {
             before(grammarAccess.getP1Rule()); 
            pushFollow(FOLLOW_ruleP1_in_entryRuleP1361);
            ruleP1();

            state._fsp--;

             after(grammarAccess.getP1Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleP1368); 

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
    // $ANTLR end "entryRuleP1"


    // $ANTLR start "ruleP1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:209:1: ruleP1 : ( ( rule__P1__Group__0 ) ) ;
    public final void ruleP1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:213:2: ( ( ( rule__P1__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:214:1: ( ( rule__P1__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:214:1: ( ( rule__P1__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:215:1: ( rule__P1__Group__0 )
            {
             before(grammarAccess.getP1Access().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:216:1: ( rule__P1__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:216:2: rule__P1__Group__0
            {
            pushFollow(FOLLOW_rule__P1__Group__0_in_ruleP1394);
            rule__P1__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getP1Access().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleP1"


    // $ANTLR start "entryRuleP"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:228:1: entryRuleP : ruleP EOF ;
    public final void entryRuleP() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:229:1: ( ruleP EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:230:1: ruleP EOF
            {
             before(grammarAccess.getPRule()); 
            pushFollow(FOLLOW_ruleP_in_entryRuleP421);
            ruleP();

            state._fsp--;

             after(grammarAccess.getPRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleP428); 

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
    // $ANTLR end "entryRuleP"


    // $ANTLR start "ruleP"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:237:1: ruleP : ( ( rule__P__Group__0 ) ) ;
    public final void ruleP() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:241:2: ( ( ( rule__P__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:242:1: ( ( rule__P__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:242:1: ( ( rule__P__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:243:1: ( rule__P__Group__0 )
            {
             before(grammarAccess.getPAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:244:1: ( rule__P__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:244:2: rule__P__Group__0
            {
            pushFollow(FOLLOW_rule__P__Group__0_in_ruleP454);
            rule__P__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleP"


    // $ANTLR start "entryRuleX"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:256:1: entryRuleX : ruleX EOF ;
    public final void entryRuleX() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:257:1: ( ruleX EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:258:1: ruleX EOF
            {
             before(grammarAccess.getXRule()); 
            pushFollow(FOLLOW_ruleX_in_entryRuleX481);
            ruleX();

            state._fsp--;

             after(grammarAccess.getXRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleX488); 

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
    // $ANTLR end "entryRuleX"


    // $ANTLR start "ruleX"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:265:1: ruleX : ( ( 'X' )* ) ;
    public final void ruleX() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:269:2: ( ( ( 'X' )* ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:270:1: ( ( 'X' )* )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:270:1: ( ( 'X' )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:271:1: ( 'X' )*
            {
             before(grammarAccess.getXAccess().getXKeyword()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:272:1: ( 'X' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:273:2: 'X'
            	    {
            	    match(input,11,FOLLOW_11_in_ruleX516); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getXAccess().getXKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleX"


    // $ANTLR start "entryRuleF"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:286:1: entryRuleF : ruleF EOF ;
    public final void entryRuleF() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:287:1: ( ruleF EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:288:1: ruleF EOF
            {
             before(grammarAccess.getFRule()); 
            pushFollow(FOLLOW_ruleF_in_entryRuleF546);
            ruleF();

            state._fsp--;

             after(grammarAccess.getFRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleF553); 

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
    // $ANTLR end "entryRuleF"


    // $ANTLR start "ruleF"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:295:1: ruleF : ( ( rule__F__Group__0 ) ) ;
    public final void ruleF() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:299:2: ( ( ( rule__F__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:300:1: ( ( rule__F__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:300:1: ( ( rule__F__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:301:1: ( rule__F__Group__0 )
            {
             before(grammarAccess.getFAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:302:1: ( rule__F__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:302:2: rule__F__Group__0
            {
            pushFollow(FOLLOW_rule__F__Group__0_in_ruleF579);
            rule__F__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleF"


    // $ANTLR start "entryRuleG"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:314:1: entryRuleG : ruleG EOF ;
    public final void entryRuleG() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:315:1: ( ruleG EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:316:1: ruleG EOF
            {
             before(grammarAccess.getGRule()); 
            pushFollow(FOLLOW_ruleG_in_entryRuleG606);
            ruleG();

            state._fsp--;

             after(grammarAccess.getGRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleG613); 

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
    // $ANTLR end "entryRuleG"


    // $ANTLR start "ruleG"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:323:1: ruleG : ( ( rule__G__Group__0 ) ) ;
    public final void ruleG() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:327:2: ( ( ( rule__G__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:328:1: ( ( rule__G__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:328:1: ( ( rule__G__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:329:1: ( rule__G__Group__0 )
            {
             before(grammarAccess.getGAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:330:1: ( rule__G__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:330:2: rule__G__Group__0
            {
            pushFollow(FOLLOW_rule__G__Group__0_in_ruleG639);
            rule__G__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleG"


    // $ANTLR start "entryRuleU"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:342:1: entryRuleU : ruleU EOF ;
    public final void entryRuleU() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:343:1: ( ruleU EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:344:1: ruleU EOF
            {
             before(grammarAccess.getURule()); 
            pushFollow(FOLLOW_ruleU_in_entryRuleU666);
            ruleU();

            state._fsp--;

             after(grammarAccess.getURule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleU673); 

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
    // $ANTLR end "entryRuleU"


    // $ANTLR start "ruleU"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:351:1: ruleU : ( ( rule__U__Group__0 ) ) ;
    public final void ruleU() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:355:2: ( ( ( rule__U__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:356:1: ( ( rule__U__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:356:1: ( ( rule__U__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:357:1: ( rule__U__Group__0 )
            {
             before(grammarAccess.getUAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:358:1: ( rule__U__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:358:2: rule__U__Group__0
            {
            pushFollow(FOLLOW_rule__U__Group__0_in_ruleU699);
            rule__U__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleU"


    // $ANTLR start "entryRuleCompare"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:370:1: entryRuleCompare : ruleCompare EOF ;
    public final void entryRuleCompare() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:371:1: ( ruleCompare EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:372:1: ruleCompare EOF
            {
             before(grammarAccess.getCompareRule()); 
            pushFollow(FOLLOW_ruleCompare_in_entryRuleCompare726);
            ruleCompare();

            state._fsp--;

             after(grammarAccess.getCompareRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompare733); 

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
    // $ANTLR end "entryRuleCompare"


    // $ANTLR start "ruleCompare"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:379:1: ruleCompare : ( ( rule__Compare__Alternatives ) ) ;
    public final void ruleCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:383:2: ( ( ( rule__Compare__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:384:1: ( ( rule__Compare__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:384:1: ( ( rule__Compare__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:385:1: ( rule__Compare__Alternatives )
            {
             before(grammarAccess.getCompareAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:386:1: ( rule__Compare__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:386:2: rule__Compare__Alternatives
            {
            pushFollow(FOLLOW_rule__Compare__Alternatives_in_ruleCompare759);
            rule__Compare__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompareAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRuleCompareWithoutUnknown"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:398:1: entryRuleCompareWithoutUnknown : ruleCompareWithoutUnknown EOF ;
    public final void entryRuleCompareWithoutUnknown() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:399:1: ( ruleCompareWithoutUnknown EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:400:1: ruleCompareWithoutUnknown EOF
            {
             before(grammarAccess.getCompareWithoutUnknownRule()); 
            pushFollow(FOLLOW_ruleCompareWithoutUnknown_in_entryRuleCompareWithoutUnknown786);
            ruleCompareWithoutUnknown();

            state._fsp--;

             after(grammarAccess.getCompareWithoutUnknownRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareWithoutUnknown793); 

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
    // $ANTLR end "entryRuleCompareWithoutUnknown"


    // $ANTLR start "ruleCompareWithoutUnknown"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:407:1: ruleCompareWithoutUnknown : ( ( rule__CompareWithoutUnknown__Alternatives ) ) ;
    public final void ruleCompareWithoutUnknown() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:411:2: ( ( ( rule__CompareWithoutUnknown__Alternatives ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:412:1: ( ( rule__CompareWithoutUnknown__Alternatives ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:412:1: ( ( rule__CompareWithoutUnknown__Alternatives ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:413:1: ( rule__CompareWithoutUnknown__Alternatives )
            {
             before(grammarAccess.getCompareWithoutUnknownAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:414:1: ( rule__CompareWithoutUnknown__Alternatives )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:414:2: rule__CompareWithoutUnknown__Alternatives
            {
            pushFollow(FOLLOW_rule__CompareWithoutUnknown__Alternatives_in_ruleCompareWithoutUnknown819);
            rule__CompareWithoutUnknown__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompareWithoutUnknownAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompareWithoutUnknown"


    // $ANTLR start "entryRuleTimeBound"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:426:1: entryRuleTimeBound : ruleTimeBound EOF ;
    public final void entryRuleTimeBound() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:427:1: ( ruleTimeBound EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:428:1: ruleTimeBound EOF
            {
             before(grammarAccess.getTimeBoundRule()); 
            pushFollow(FOLLOW_ruleTimeBound_in_entryRuleTimeBound846);
            ruleTimeBound();

            state._fsp--;

             after(grammarAccess.getTimeBoundRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTimeBound853); 

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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:435:1: ruleTimeBound : ( ( rule__TimeBound__Alternatives )? ) ;
    public final void ruleTimeBound() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:439:2: ( ( ( rule__TimeBound__Alternatives )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:440:1: ( ( rule__TimeBound__Alternatives )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:440:1: ( ( rule__TimeBound__Alternatives )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:441:1: ( rule__TimeBound__Alternatives )?
            {
             before(grammarAccess.getTimeBoundAccess().getAlternatives()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:442:1: ( rule__TimeBound__Alternatives )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21||(LA2_0>=29 && LA2_0<=31)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:442:2: rule__TimeBound__Alternatives
                    {
                    pushFollow(FOLLOW_rule__TimeBound__Alternatives_in_ruleTimeBound879);
                    rule__TimeBound__Alternatives();

                    state._fsp--;


                    }
                    break;

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


    // $ANTLR start "entryRuleDECIMAL"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:454:1: entryRuleDECIMAL : ruleDECIMAL EOF ;
    public final void entryRuleDECIMAL() throws RecognitionException {
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:455:1: ( ruleDECIMAL EOF )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:456:1: ruleDECIMAL EOF
            {
             before(grammarAccess.getDECIMALRule()); 
            pushFollow(FOLLOW_ruleDECIMAL_in_entryRuleDECIMAL907);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getDECIMALRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDECIMAL914); 

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
    // $ANTLR end "entryRuleDECIMAL"


    // $ANTLR start "ruleDECIMAL"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:463:1: ruleDECIMAL : ( ( rule__DECIMAL__Group__0 ) ) ;
    public final void ruleDECIMAL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:467:2: ( ( ( rule__DECIMAL__Group__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:468:1: ( ( rule__DECIMAL__Group__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:468:1: ( ( rule__DECIMAL__Group__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:469:1: ( rule__DECIMAL__Group__0 )
            {
             before(grammarAccess.getDECIMALAccess().getGroup()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:470:1: ( rule__DECIMAL__Group__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:470:2: rule__DECIMAL__Group__0
            {
            pushFollow(FOLLOW_rule__DECIMAL__Group__0_in_ruleDECIMAL940);
            rule__DECIMAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDECIMALAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDECIMAL"


    // $ANTLR start "rule__Start__Alternatives"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:482:1: rule__Start__Alternatives : ( ( ( rule__Start__StartAssignment_0 ) ) | ( ruleP1 ) );
    public final void rule__Start__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:486:1: ( ( ( rule__Start__StartAssignment_0 ) ) | ( ruleP1 ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:487:1: ( ( rule__Start__StartAssignment_0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:487:1: ( ( rule__Start__StartAssignment_0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:488:1: ( rule__Start__StartAssignment_0 )
                    {
                     before(grammarAccess.getStartAccess().getStartAssignment_0()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:489:1: ( rule__Start__StartAssignment_0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:489:2: rule__Start__StartAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Start__StartAssignment_0_in_rule__Start__Alternatives976);
                    rule__Start__StartAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStartAccess().getStartAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:493:6: ( ruleP1 )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:493:6: ( ruleP1 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:494:1: ruleP1
                    {
                     before(grammarAccess.getStartAccess().getP1ParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleP1_in_rule__Start__Alternatives994);
                    ruleP1();

                    state._fsp--;

                     after(grammarAccess.getStartAccess().getP1ParserRuleCall_1()); 

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
    // $ANTLR end "rule__Start__Alternatives"


    // $ANTLR start "rule__State__Alternatives"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:504:1: rule__State__Alternatives : ( ( ( rule__State__Group_0__0 ) ) | ( ( rule__State__Group_1__0 ) ) );
    public final void rule__State__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:508:1: ( ( ( rule__State__Group_0__0 ) ) | ( ( rule__State__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:509:1: ( ( rule__State__Group_0__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:509:1: ( ( rule__State__Group_0__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:510:1: ( rule__State__Group_0__0 )
                    {
                     before(grammarAccess.getStateAccess().getGroup_0()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:511:1: ( rule__State__Group_0__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:511:2: rule__State__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_0__0_in_rule__State__Alternatives1026);
                    rule__State__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:515:6: ( ( rule__State__Group_1__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:515:6: ( ( rule__State__Group_1__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:516:1: ( rule__State__Group_1__0 )
                    {
                     before(grammarAccess.getStateAccess().getGroup_1()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:517:1: ( rule__State__Group_1__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:517:2: rule__State__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_1__0_in_rule__State__Alternatives1044);
                    rule__State__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateAccess().getGroup_1()); 

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
    // $ANTLR end "rule__State__Alternatives"


    // $ANTLR start "rule__Label__Alternatives"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:526:1: rule__Label__Alternatives : ( ( ( rule__Label__Group_0__0 ) ) | ( ( rule__Label__Group_1__0 ) ) );
    public final void rule__Label__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:530:1: ( ( ( rule__Label__Group_0__0 ) ) | ( ( rule__Label__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:531:1: ( ( rule__Label__Group_0__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:531:1: ( ( rule__Label__Group_0__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:532:1: ( rule__Label__Group_0__0 )
                    {
                     before(grammarAccess.getLabelAccess().getGroup_0()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:533:1: ( rule__Label__Group_0__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:533:2: rule__Label__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Label__Group_0__0_in_rule__Label__Alternatives1077);
                    rule__Label__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLabelAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:537:6: ( ( rule__Label__Group_1__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:537:6: ( ( rule__Label__Group_1__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:538:1: ( rule__Label__Group_1__0 )
                    {
                     before(grammarAccess.getLabelAccess().getGroup_1()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:539:1: ( rule__Label__Group_1__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:539:2: rule__Label__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Label__Group_1__0_in_rule__Label__Alternatives1095);
                    rule__Label__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLabelAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Label__Alternatives"


    // $ANTLR start "rule__StateOrLabel__Alternatives"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:548:1: rule__StateOrLabel__Alternatives : ( ( ruleState ) | ( ruleLabel ) );
    public final void rule__StateOrLabel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:552:1: ( ( ruleState ) | ( ruleLabel ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case 16:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==19) ) {
                    alt6=2;
                }
                else if ( (LA6_1==17) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:553:1: ( ruleState )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:553:1: ( ruleState )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:554:1: ruleState
                    {
                     before(grammarAccess.getStateOrLabelAccess().getStateParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleState_in_rule__StateOrLabel__Alternatives1128);
                    ruleState();

                    state._fsp--;

                     after(grammarAccess.getStateOrLabelAccess().getStateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:559:6: ( ruleLabel )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:559:6: ( ruleLabel )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:560:1: ruleLabel
                    {
                     before(grammarAccess.getStateOrLabelAccess().getLabelParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLabel_in_rule__StateOrLabel__Alternatives1145);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getStateOrLabelAccess().getLabelParserRuleCall_1()); 

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
    // $ANTLR end "rule__StateOrLabel__Alternatives"


    // $ANTLR start "rule__P1__Alternatives_3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:570:1: rule__P1__Alternatives_3 : ( ( ruleP ) | ( ruleS ) | ( ruleF ) | ( ruleU ) | ( ruleG ) | ( ( rule__P1__Group_3_5__0 ) ) );
    public final void rule__P1__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:574:1: ( ( ruleP ) | ( ruleS ) | ( ruleF ) | ( ruleU ) | ( ruleG ) | ( ( rule__P1__Group_3_5__0 ) ) )
            int alt7=6;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:575:1: ( ruleP )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:575:1: ( ruleP )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:576:1: ruleP
                    {
                     before(grammarAccess.getP1Access().getPParserRuleCall_3_0()); 
                    pushFollow(FOLLOW_ruleP_in_rule__P1__Alternatives_31177);
                    ruleP();

                    state._fsp--;

                     after(grammarAccess.getP1Access().getPParserRuleCall_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:581:6: ( ruleS )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:581:6: ( ruleS )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:582:1: ruleS
                    {
                     before(grammarAccess.getP1Access().getSParserRuleCall_3_1()); 
                    pushFollow(FOLLOW_ruleS_in_rule__P1__Alternatives_31194);
                    ruleS();

                    state._fsp--;

                     after(grammarAccess.getP1Access().getSParserRuleCall_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:587:6: ( ruleF )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:587:6: ( ruleF )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:588:1: ruleF
                    {
                     before(grammarAccess.getP1Access().getFParserRuleCall_3_2()); 
                    pushFollow(FOLLOW_ruleF_in_rule__P1__Alternatives_31211);
                    ruleF();

                    state._fsp--;

                     after(grammarAccess.getP1Access().getFParserRuleCall_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:593:6: ( ruleU )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:593:6: ( ruleU )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:594:1: ruleU
                    {
                     before(grammarAccess.getP1Access().getUParserRuleCall_3_3()); 
                    pushFollow(FOLLOW_ruleU_in_rule__P1__Alternatives_31228);
                    ruleU();

                    state._fsp--;

                     after(grammarAccess.getP1Access().getUParserRuleCall_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:599:6: ( ruleG )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:599:6: ( ruleG )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:600:1: ruleG
                    {
                     before(grammarAccess.getP1Access().getGParserRuleCall_3_4()); 
                    pushFollow(FOLLOW_ruleG_in_rule__P1__Alternatives_31245);
                    ruleG();

                    state._fsp--;

                     after(grammarAccess.getP1Access().getGParserRuleCall_3_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:605:6: ( ( rule__P1__Group_3_5__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:605:6: ( ( rule__P1__Group_3_5__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:606:1: ( rule__P1__Group_3_5__0 )
                    {
                     before(grammarAccess.getP1Access().getGroup_3_5()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:607:1: ( rule__P1__Group_3_5__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:607:2: rule__P1__Group_3_5__0
                    {
                    pushFollow(FOLLOW_rule__P1__Group_3_5__0_in_rule__P1__Alternatives_31262);
                    rule__P1__Group_3_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getP1Access().getGroup_3_5()); 

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
    // $ANTLR end "rule__P1__Alternatives_3"


    // $ANTLR start "rule__P__Alternatives_3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:616:1: rule__P__Alternatives_3 : ( ( ruleP ) | ( ruleS ) | ( ruleF ) | ( ruleU ) | ( ruleG ) | ( ( rule__P__Group_3_5__0 ) ) );
    public final void rule__P__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:620:1: ( ( ruleP ) | ( ruleS ) | ( ruleF ) | ( ruleU ) | ( ruleG ) | ( ( rule__P__Group_3_5__0 ) ) )
            int alt8=6;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:621:1: ( ruleP )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:621:1: ( ruleP )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:622:1: ruleP
                    {
                     before(grammarAccess.getPAccess().getPParserRuleCall_3_0()); 
                    pushFollow(FOLLOW_ruleP_in_rule__P__Alternatives_31295);
                    ruleP();

                    state._fsp--;

                     after(grammarAccess.getPAccess().getPParserRuleCall_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:627:6: ( ruleS )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:627:6: ( ruleS )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:628:1: ruleS
                    {
                     before(grammarAccess.getPAccess().getSParserRuleCall_3_1()); 
                    pushFollow(FOLLOW_ruleS_in_rule__P__Alternatives_31312);
                    ruleS();

                    state._fsp--;

                     after(grammarAccess.getPAccess().getSParserRuleCall_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:633:6: ( ruleF )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:633:6: ( ruleF )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:634:1: ruleF
                    {
                     before(grammarAccess.getPAccess().getFParserRuleCall_3_2()); 
                    pushFollow(FOLLOW_ruleF_in_rule__P__Alternatives_31329);
                    ruleF();

                    state._fsp--;

                     after(grammarAccess.getPAccess().getFParserRuleCall_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:639:6: ( ruleU )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:639:6: ( ruleU )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:640:1: ruleU
                    {
                     before(grammarAccess.getPAccess().getUParserRuleCall_3_3()); 
                    pushFollow(FOLLOW_ruleU_in_rule__P__Alternatives_31346);
                    ruleU();

                    state._fsp--;

                     after(grammarAccess.getPAccess().getUParserRuleCall_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:645:6: ( ruleG )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:645:6: ( ruleG )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:646:1: ruleG
                    {
                     before(grammarAccess.getPAccess().getGParserRuleCall_3_4()); 
                    pushFollow(FOLLOW_ruleG_in_rule__P__Alternatives_31363);
                    ruleG();

                    state._fsp--;

                     after(grammarAccess.getPAccess().getGParserRuleCall_3_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:651:6: ( ( rule__P__Group_3_5__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:651:6: ( ( rule__P__Group_3_5__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:652:1: ( rule__P__Group_3_5__0 )
                    {
                     before(grammarAccess.getPAccess().getGroup_3_5()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:653:1: ( rule__P__Group_3_5__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:653:2: rule__P__Group_3_5__0
                    {
                    pushFollow(FOLLOW_rule__P__Group_3_5__0_in_rule__P__Alternatives_31380);
                    rule__P__Group_3_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPAccess().getGroup_3_5()); 

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
    // $ANTLR end "rule__P__Alternatives_3"


    // $ANTLR start "rule__U__Alternatives_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:662:1: rule__U__Alternatives_1 : ( ( 'U' ) | ( 'W' ) | ( 'R' ) );
    public final void rule__U__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:666:1: ( ( 'U' ) | ( 'W' ) | ( 'R' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt9=1;
                }
                break;
            case 13:
                {
                alt9=2;
                }
                break;
            case 14:
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:667:1: ( 'U' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:667:1: ( 'U' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:668:1: 'U'
                    {
                     before(grammarAccess.getUAccess().getUKeyword_1_0()); 
                    match(input,12,FOLLOW_12_in_rule__U__Alternatives_11414); 
                     after(grammarAccess.getUAccess().getUKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:675:6: ( 'W' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:675:6: ( 'W' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:676:1: 'W'
                    {
                     before(grammarAccess.getUAccess().getWKeyword_1_1()); 
                    match(input,13,FOLLOW_13_in_rule__U__Alternatives_11434); 
                     after(grammarAccess.getUAccess().getWKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:683:6: ( 'R' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:683:6: ( 'R' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:684:1: 'R'
                    {
                     before(grammarAccess.getUAccess().getRKeyword_1_2()); 
                    match(input,14,FOLLOW_14_in_rule__U__Alternatives_11454); 
                     after(grammarAccess.getUAccess().getRKeyword_1_2()); 

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
    // $ANTLR end "rule__U__Alternatives_1"


    // $ANTLR start "rule__Compare__Alternatives"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:696:1: rule__Compare__Alternatives : ( ( ruleCompareWithoutUnknown ) | ( '=?' ) );
    public final void rule__Compare__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:700:1: ( ( ruleCompareWithoutUnknown ) | ( '=?' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=27 && LA10_0<=30)) ) {
                alt10=1;
            }
            else if ( (LA10_0==15) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:701:1: ( ruleCompareWithoutUnknown )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:701:1: ( ruleCompareWithoutUnknown )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:702:1: ruleCompareWithoutUnknown
                    {
                     before(grammarAccess.getCompareAccess().getCompareWithoutUnknownParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCompareWithoutUnknown_in_rule__Compare__Alternatives1488);
                    ruleCompareWithoutUnknown();

                    state._fsp--;

                     after(grammarAccess.getCompareAccess().getCompareWithoutUnknownParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:707:6: ( '=?' )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:707:6: ( '=?' )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:708:1: '=?'
                    {
                     before(grammarAccess.getCompareAccess().getEqualsSignQuestionMarkKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__Compare__Alternatives1506); 
                     after(grammarAccess.getCompareAccess().getEqualsSignQuestionMarkKeyword_1()); 

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
    // $ANTLR end "rule__Compare__Alternatives"


    // $ANTLR start "rule__CompareWithoutUnknown__Alternatives"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:720:1: rule__CompareWithoutUnknown__Alternatives : ( ( ( rule__CompareWithoutUnknown__Group_0__0 ) ) | ( ( rule__CompareWithoutUnknown__Group_1__0 ) ) | ( ( rule__CompareWithoutUnknown__Group_2__0 ) ) | ( ( rule__CompareWithoutUnknown__Group_3__0 ) ) );
    public final void rule__CompareWithoutUnknown__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:724:1: ( ( ( rule__CompareWithoutUnknown__Group_0__0 ) ) | ( ( rule__CompareWithoutUnknown__Group_1__0 ) ) | ( ( rule__CompareWithoutUnknown__Group_2__0 ) ) | ( ( rule__CompareWithoutUnknown__Group_3__0 ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt11=1;
                }
                break;
            case 28:
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
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:725:1: ( ( rule__CompareWithoutUnknown__Group_0__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:725:1: ( ( rule__CompareWithoutUnknown__Group_0__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:726:1: ( rule__CompareWithoutUnknown__Group_0__0 )
                    {
                     before(grammarAccess.getCompareWithoutUnknownAccess().getGroup_0()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:727:1: ( rule__CompareWithoutUnknown__Group_0__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:727:2: rule__CompareWithoutUnknown__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CompareWithoutUnknown__Group_0__0_in_rule__CompareWithoutUnknown__Alternatives1540);
                    rule__CompareWithoutUnknown__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompareWithoutUnknownAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:731:6: ( ( rule__CompareWithoutUnknown__Group_1__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:731:6: ( ( rule__CompareWithoutUnknown__Group_1__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:732:1: ( rule__CompareWithoutUnknown__Group_1__0 )
                    {
                     before(grammarAccess.getCompareWithoutUnknownAccess().getGroup_1()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:733:1: ( rule__CompareWithoutUnknown__Group_1__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:733:2: rule__CompareWithoutUnknown__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CompareWithoutUnknown__Group_1__0_in_rule__CompareWithoutUnknown__Alternatives1558);
                    rule__CompareWithoutUnknown__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompareWithoutUnknownAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:737:6: ( ( rule__CompareWithoutUnknown__Group_2__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:737:6: ( ( rule__CompareWithoutUnknown__Group_2__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:738:1: ( rule__CompareWithoutUnknown__Group_2__0 )
                    {
                     before(grammarAccess.getCompareWithoutUnknownAccess().getGroup_2()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:739:1: ( rule__CompareWithoutUnknown__Group_2__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:739:2: rule__CompareWithoutUnknown__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CompareWithoutUnknown__Group_2__0_in_rule__CompareWithoutUnknown__Alternatives1576);
                    rule__CompareWithoutUnknown__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompareWithoutUnknownAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:743:6: ( ( rule__CompareWithoutUnknown__Group_3__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:743:6: ( ( rule__CompareWithoutUnknown__Group_3__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:744:1: ( rule__CompareWithoutUnknown__Group_3__0 )
                    {
                     before(grammarAccess.getCompareWithoutUnknownAccess().getGroup_3()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:745:1: ( rule__CompareWithoutUnknown__Group_3__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:745:2: rule__CompareWithoutUnknown__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__CompareWithoutUnknown__Group_3__0_in_rule__CompareWithoutUnknown__Alternatives1594);
                    rule__CompareWithoutUnknown__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompareWithoutUnknownAccess().getGroup_3()); 

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
    // $ANTLR end "rule__CompareWithoutUnknown__Alternatives"


    // $ANTLR start "rule__TimeBound__Alternatives"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:754:1: rule__TimeBound__Alternatives : ( ( ( rule__TimeBound__Group_0__0 ) ) | ( ( rule__TimeBound__Group_1__0 ) ) | ( ( rule__TimeBound__Group_2__0 ) ) | ( ( rule__TimeBound__Group_3__0 ) ) );
    public final void rule__TimeBound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:758:1: ( ( ( rule__TimeBound__Group_0__0 ) ) | ( ( rule__TimeBound__Group_1__0 ) ) | ( ( rule__TimeBound__Group_2__0 ) ) | ( ( rule__TimeBound__Group_3__0 ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            case 21:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:759:1: ( ( rule__TimeBound__Group_0__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:759:1: ( ( rule__TimeBound__Group_0__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:760:1: ( rule__TimeBound__Group_0__0 )
                    {
                     before(grammarAccess.getTimeBoundAccess().getGroup_0()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:761:1: ( rule__TimeBound__Group_0__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:761:2: rule__TimeBound__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TimeBound__Group_0__0_in_rule__TimeBound__Alternatives1627);
                    rule__TimeBound__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimeBoundAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:765:6: ( ( rule__TimeBound__Group_1__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:765:6: ( ( rule__TimeBound__Group_1__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:766:1: ( rule__TimeBound__Group_1__0 )
                    {
                     before(grammarAccess.getTimeBoundAccess().getGroup_1()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:767:1: ( rule__TimeBound__Group_1__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:767:2: rule__TimeBound__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TimeBound__Group_1__0_in_rule__TimeBound__Alternatives1645);
                    rule__TimeBound__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimeBoundAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:771:6: ( ( rule__TimeBound__Group_2__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:771:6: ( ( rule__TimeBound__Group_2__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:772:1: ( rule__TimeBound__Group_2__0 )
                    {
                     before(grammarAccess.getTimeBoundAccess().getGroup_2()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:773:1: ( rule__TimeBound__Group_2__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:773:2: rule__TimeBound__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TimeBound__Group_2__0_in_rule__TimeBound__Alternatives1663);
                    rule__TimeBound__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimeBoundAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:777:6: ( ( rule__TimeBound__Group_3__0 ) )
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:777:6: ( ( rule__TimeBound__Group_3__0 ) )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:778:1: ( rule__TimeBound__Group_3__0 )
                    {
                     before(grammarAccess.getTimeBoundAccess().getGroup_3()); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:779:1: ( rule__TimeBound__Group_3__0 )
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:779:2: rule__TimeBound__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TimeBound__Group_3__0_in_rule__TimeBound__Alternatives1681);
                    rule__TimeBound__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTimeBoundAccess().getGroup_3()); 

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


    // $ANTLR start "rule__State__Group_0__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:790:1: rule__State__Group_0__0 : rule__State__Group_0__0__Impl rule__State__Group_0__1 ;
    public final void rule__State__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:794:1: ( rule__State__Group_0__0__Impl rule__State__Group_0__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:795:2: rule__State__Group_0__0__Impl rule__State__Group_0__1
            {
            pushFollow(FOLLOW_rule__State__Group_0__0__Impl_in_rule__State__Group_0__01712);
            rule__State__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_0__1_in_rule__State__Group_0__01715);
            rule__State__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_0__0"


    // $ANTLR start "rule__State__Group_0__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:802:1: rule__State__Group_0__0__Impl : ( '(' ) ;
    public final void rule__State__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:806:1: ( ( '(' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:807:1: ( '(' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:807:1: ( '(' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:808:1: '('
            {
             before(grammarAccess.getStateAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,16,FOLLOW_16_in_rule__State__Group_0__0__Impl1743); 
             after(grammarAccess.getStateAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_0__0__Impl"


    // $ANTLR start "rule__State__Group_0__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:821:1: rule__State__Group_0__1 : rule__State__Group_0__1__Impl rule__State__Group_0__2 ;
    public final void rule__State__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:825:1: ( rule__State__Group_0__1__Impl rule__State__Group_0__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:826:2: rule__State__Group_0__1__Impl rule__State__Group_0__2
            {
            pushFollow(FOLLOW_rule__State__Group_0__1__Impl_in_rule__State__Group_0__11774);
            rule__State__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_0__2_in_rule__State__Group_0__11777);
            rule__State__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_0__1"


    // $ANTLR start "rule__State__Group_0__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:833:1: rule__State__Group_0__1__Impl : ( 'State:' ) ;
    public final void rule__State__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:837:1: ( ( 'State:' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:838:1: ( 'State:' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:838:1: ( 'State:' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:839:1: 'State:'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0_1()); 
            match(input,17,FOLLOW_17_in_rule__State__Group_0__1__Impl1805); 
             after(grammarAccess.getStateAccess().getStateKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_0__1__Impl"


    // $ANTLR start "rule__State__Group_0__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:852:1: rule__State__Group_0__2 : rule__State__Group_0__2__Impl rule__State__Group_0__3 ;
    public final void rule__State__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:856:1: ( rule__State__Group_0__2__Impl rule__State__Group_0__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:857:2: rule__State__Group_0__2__Impl rule__State__Group_0__3
            {
            pushFollow(FOLLOW_rule__State__Group_0__2__Impl_in_rule__State__Group_0__21836);
            rule__State__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_0__3_in_rule__State__Group_0__21839);
            rule__State__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_0__2"


    // $ANTLR start "rule__State__Group_0__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:864:1: rule__State__Group_0__2__Impl : ( ( rule__State__NameAssignment_0_2 ) ) ;
    public final void rule__State__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:868:1: ( ( ( rule__State__NameAssignment_0_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:869:1: ( ( rule__State__NameAssignment_0_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:869:1: ( ( rule__State__NameAssignment_0_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:870:1: ( rule__State__NameAssignment_0_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:871:1: ( rule__State__NameAssignment_0_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:871:2: rule__State__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_0_2_in_rule__State__Group_0__2__Impl1866);
            rule__State__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_0__2__Impl"


    // $ANTLR start "rule__State__Group_0__3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:881:1: rule__State__Group_0__3 : rule__State__Group_0__3__Impl ;
    public final void rule__State__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:885:1: ( rule__State__Group_0__3__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:886:2: rule__State__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_0__3__Impl_in_rule__State__Group_0__31896);
            rule__State__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_0__3"


    // $ANTLR start "rule__State__Group_0__3__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:892:1: rule__State__Group_0__3__Impl : ( ')' ) ;
    public final void rule__State__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:896:1: ( ( ')' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:897:1: ( ')' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:897:1: ( ')' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:898:1: ')'
            {
             before(grammarAccess.getStateAccess().getRightParenthesisKeyword_0_3()); 
            match(input,18,FOLLOW_18_in_rule__State__Group_0__3__Impl1924); 
             after(grammarAccess.getStateAccess().getRightParenthesisKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_0__3__Impl"


    // $ANTLR start "rule__State__Group_1__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:919:1: rule__State__Group_1__0 : rule__State__Group_1__0__Impl rule__State__Group_1__1 ;
    public final void rule__State__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:923:1: ( rule__State__Group_1__0__Impl rule__State__Group_1__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:924:2: rule__State__Group_1__0__Impl rule__State__Group_1__1
            {
            pushFollow(FOLLOW_rule__State__Group_1__0__Impl_in_rule__State__Group_1__01963);
            rule__State__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_1__1_in_rule__State__Group_1__01966);
            rule__State__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_1__0"


    // $ANTLR start "rule__State__Group_1__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:931:1: rule__State__Group_1__0__Impl : ( 'State:' ) ;
    public final void rule__State__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:935:1: ( ( 'State:' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:936:1: ( 'State:' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:936:1: ( 'State:' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:937:1: 'State:'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__State__Group_1__0__Impl1994); 
             after(grammarAccess.getStateAccess().getStateKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_1__0__Impl"


    // $ANTLR start "rule__State__Group_1__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:950:1: rule__State__Group_1__1 : rule__State__Group_1__1__Impl ;
    public final void rule__State__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:954:1: ( rule__State__Group_1__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:955:2: rule__State__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_1__1__Impl_in_rule__State__Group_1__12025);
            rule__State__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_1__1"


    // $ANTLR start "rule__State__Group_1__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:961:1: rule__State__Group_1__1__Impl : ( ( rule__State__NameAssignment_1_1 ) ) ;
    public final void rule__State__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:965:1: ( ( ( rule__State__NameAssignment_1_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:966:1: ( ( rule__State__NameAssignment_1_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:966:1: ( ( rule__State__NameAssignment_1_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:967:1: ( rule__State__NameAssignment_1_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:968:1: ( rule__State__NameAssignment_1_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:968:2: rule__State__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_1_1_in_rule__State__Group_1__1__Impl2052);
            rule__State__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_1__1__Impl"


    // $ANTLR start "rule__Label__Group_0__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:982:1: rule__Label__Group_0__0 : rule__Label__Group_0__0__Impl rule__Label__Group_0__1 ;
    public final void rule__Label__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:986:1: ( rule__Label__Group_0__0__Impl rule__Label__Group_0__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:987:2: rule__Label__Group_0__0__Impl rule__Label__Group_0__1
            {
            pushFollow(FOLLOW_rule__Label__Group_0__0__Impl_in_rule__Label__Group_0__02086);
            rule__Label__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label__Group_0__1_in_rule__Label__Group_0__02089);
            rule__Label__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group_0__0"


    // $ANTLR start "rule__Label__Group_0__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:994:1: rule__Label__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Label__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:998:1: ( ( '(' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:999:1: ( '(' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:999:1: ( '(' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1000:1: '('
            {
             before(grammarAccess.getLabelAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,16,FOLLOW_16_in_rule__Label__Group_0__0__Impl2117); 
             after(grammarAccess.getLabelAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group_0__0__Impl"


    // $ANTLR start "rule__Label__Group_0__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1013:1: rule__Label__Group_0__1 : rule__Label__Group_0__1__Impl rule__Label__Group_0__2 ;
    public final void rule__Label__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1017:1: ( rule__Label__Group_0__1__Impl rule__Label__Group_0__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1018:2: rule__Label__Group_0__1__Impl rule__Label__Group_0__2
            {
            pushFollow(FOLLOW_rule__Label__Group_0__1__Impl_in_rule__Label__Group_0__12148);
            rule__Label__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label__Group_0__2_in_rule__Label__Group_0__12151);
            rule__Label__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group_0__1"


    // $ANTLR start "rule__Label__Group_0__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1025:1: rule__Label__Group_0__1__Impl : ( 'Label:' ) ;
    public final void rule__Label__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1029:1: ( ( 'Label:' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1030:1: ( 'Label:' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1030:1: ( 'Label:' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1031:1: 'Label:'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0_1()); 
            match(input,19,FOLLOW_19_in_rule__Label__Group_0__1__Impl2179); 
             after(grammarAccess.getLabelAccess().getLabelKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group_0__1__Impl"


    // $ANTLR start "rule__Label__Group_0__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1044:1: rule__Label__Group_0__2 : rule__Label__Group_0__2__Impl rule__Label__Group_0__3 ;
    public final void rule__Label__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1048:1: ( rule__Label__Group_0__2__Impl rule__Label__Group_0__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1049:2: rule__Label__Group_0__2__Impl rule__Label__Group_0__3
            {
            pushFollow(FOLLOW_rule__Label__Group_0__2__Impl_in_rule__Label__Group_0__22210);
            rule__Label__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label__Group_0__3_in_rule__Label__Group_0__22213);
            rule__Label__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group_0__2"


    // $ANTLR start "rule__Label__Group_0__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1056:1: rule__Label__Group_0__2__Impl : ( ( rule__Label__NameAssignment_0_2 ) ) ;
    public final void rule__Label__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1060:1: ( ( ( rule__Label__NameAssignment_0_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1061:1: ( ( rule__Label__NameAssignment_0_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1061:1: ( ( rule__Label__NameAssignment_0_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1062:1: ( rule__Label__NameAssignment_0_2 )
            {
             before(grammarAccess.getLabelAccess().getNameAssignment_0_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1063:1: ( rule__Label__NameAssignment_0_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1063:2: rule__Label__NameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Label__NameAssignment_0_2_in_rule__Label__Group_0__2__Impl2240);
            rule__Label__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group_0__2__Impl"


    // $ANTLR start "rule__Label__Group_0__3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1073:1: rule__Label__Group_0__3 : rule__Label__Group_0__3__Impl ;
    public final void rule__Label__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1077:1: ( rule__Label__Group_0__3__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1078:2: rule__Label__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Label__Group_0__3__Impl_in_rule__Label__Group_0__32270);
            rule__Label__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group_0__3"


    // $ANTLR start "rule__Label__Group_0__3__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1084:1: rule__Label__Group_0__3__Impl : ( ')' ) ;
    public final void rule__Label__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1088:1: ( ( ')' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1089:1: ( ')' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1089:1: ( ')' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1090:1: ')'
            {
             before(grammarAccess.getLabelAccess().getRightParenthesisKeyword_0_3()); 
            match(input,18,FOLLOW_18_in_rule__Label__Group_0__3__Impl2298); 
             after(grammarAccess.getLabelAccess().getRightParenthesisKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group_0__3__Impl"


    // $ANTLR start "rule__Label__Group_1__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1111:1: rule__Label__Group_1__0 : rule__Label__Group_1__0__Impl rule__Label__Group_1__1 ;
    public final void rule__Label__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1115:1: ( rule__Label__Group_1__0__Impl rule__Label__Group_1__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1116:2: rule__Label__Group_1__0__Impl rule__Label__Group_1__1
            {
            pushFollow(FOLLOW_rule__Label__Group_1__0__Impl_in_rule__Label__Group_1__02337);
            rule__Label__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Label__Group_1__1_in_rule__Label__Group_1__02340);
            rule__Label__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group_1__0"


    // $ANTLR start "rule__Label__Group_1__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1123:1: rule__Label__Group_1__0__Impl : ( 'Label:' ) ;
    public final void rule__Label__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1127:1: ( ( 'Label:' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1128:1: ( 'Label:' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1128:1: ( 'Label:' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1129:1: 'Label:'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Label__Group_1__0__Impl2368); 
             after(grammarAccess.getLabelAccess().getLabelKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group_1__0__Impl"


    // $ANTLR start "rule__Label__Group_1__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1142:1: rule__Label__Group_1__1 : rule__Label__Group_1__1__Impl ;
    public final void rule__Label__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1146:1: ( rule__Label__Group_1__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1147:2: rule__Label__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Label__Group_1__1__Impl_in_rule__Label__Group_1__12399);
            rule__Label__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group_1__1"


    // $ANTLR start "rule__Label__Group_1__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1153:1: rule__Label__Group_1__1__Impl : ( ( rule__Label__NameAssignment_1_1 ) ) ;
    public final void rule__Label__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1157:1: ( ( ( rule__Label__NameAssignment_1_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1158:1: ( ( rule__Label__NameAssignment_1_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1158:1: ( ( rule__Label__NameAssignment_1_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1159:1: ( rule__Label__NameAssignment_1_1 )
            {
             before(grammarAccess.getLabelAccess().getNameAssignment_1_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1160:1: ( rule__Label__NameAssignment_1_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1160:2: rule__Label__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Label__NameAssignment_1_1_in_rule__Label__Group_1__1__Impl2426);
            rule__Label__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Group_1__1__Impl"


    // $ANTLR start "rule__S__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1174:1: rule__S__Group__0 : rule__S__Group__0__Impl rule__S__Group__1 ;
    public final void rule__S__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1178:1: ( rule__S__Group__0__Impl rule__S__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1179:2: rule__S__Group__0__Impl rule__S__Group__1
            {
            pushFollow(FOLLOW_rule__S__Group__0__Impl_in_rule__S__Group__02460);
            rule__S__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__S__Group__1_in_rule__S__Group__02463);
            rule__S__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S__Group__0"


    // $ANTLR start "rule__S__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1186:1: rule__S__Group__0__Impl : ( 'S' ) ;
    public final void rule__S__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1190:1: ( ( 'S' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1191:1: ( 'S' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1191:1: ( 'S' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1192:1: 'S'
            {
             before(grammarAccess.getSAccess().getSKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__S__Group__0__Impl2491); 
             after(grammarAccess.getSAccess().getSKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S__Group__0__Impl"


    // $ANTLR start "rule__S__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1205:1: rule__S__Group__1 : rule__S__Group__1__Impl rule__S__Group__2 ;
    public final void rule__S__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1209:1: ( rule__S__Group__1__Impl rule__S__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1210:2: rule__S__Group__1__Impl rule__S__Group__2
            {
            pushFollow(FOLLOW_rule__S__Group__1__Impl_in_rule__S__Group__12522);
            rule__S__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__S__Group__2_in_rule__S__Group__12525);
            rule__S__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S__Group__1"


    // $ANTLR start "rule__S__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1217:1: rule__S__Group__1__Impl : ( ruleCompare ) ;
    public final void rule__S__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1221:1: ( ( ruleCompare ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1222:1: ( ruleCompare )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1222:1: ( ruleCompare )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1223:1: ruleCompare
            {
             before(grammarAccess.getSAccess().getCompareParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleCompare_in_rule__S__Group__1__Impl2552);
            ruleCompare();

            state._fsp--;

             after(grammarAccess.getSAccess().getCompareParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S__Group__1__Impl"


    // $ANTLR start "rule__S__Group__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1234:1: rule__S__Group__2 : rule__S__Group__2__Impl rule__S__Group__3 ;
    public final void rule__S__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1238:1: ( rule__S__Group__2__Impl rule__S__Group__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1239:2: rule__S__Group__2__Impl rule__S__Group__3
            {
            pushFollow(FOLLOW_rule__S__Group__2__Impl_in_rule__S__Group__22581);
            rule__S__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__S__Group__3_in_rule__S__Group__22584);
            rule__S__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S__Group__2"


    // $ANTLR start "rule__S__Group__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1246:1: rule__S__Group__2__Impl : ( '[' ) ;
    public final void rule__S__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1250:1: ( ( '[' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1251:1: ( '[' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1251:1: ( '[' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1252:1: '['
            {
             before(grammarAccess.getSAccess().getLeftSquareBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__S__Group__2__Impl2612); 
             after(grammarAccess.getSAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S__Group__2__Impl"


    // $ANTLR start "rule__S__Group__3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1265:1: rule__S__Group__3 : rule__S__Group__3__Impl rule__S__Group__4 ;
    public final void rule__S__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1269:1: ( rule__S__Group__3__Impl rule__S__Group__4 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1270:2: rule__S__Group__3__Impl rule__S__Group__4
            {
            pushFollow(FOLLOW_rule__S__Group__3__Impl_in_rule__S__Group__32643);
            rule__S__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__S__Group__4_in_rule__S__Group__32646);
            rule__S__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S__Group__3"


    // $ANTLR start "rule__S__Group__3__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1277:1: rule__S__Group__3__Impl : ( ruleStateOrLabel ) ;
    public final void rule__S__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1281:1: ( ( ruleStateOrLabel ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1282:1: ( ruleStateOrLabel )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1282:1: ( ruleStateOrLabel )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1283:1: ruleStateOrLabel
            {
             before(grammarAccess.getSAccess().getStateOrLabelParserRuleCall_3()); 
            pushFollow(FOLLOW_ruleStateOrLabel_in_rule__S__Group__3__Impl2673);
            ruleStateOrLabel();

            state._fsp--;

             after(grammarAccess.getSAccess().getStateOrLabelParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S__Group__3__Impl"


    // $ANTLR start "rule__S__Group__4"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1294:1: rule__S__Group__4 : rule__S__Group__4__Impl ;
    public final void rule__S__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1298:1: ( rule__S__Group__4__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1299:2: rule__S__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__S__Group__4__Impl_in_rule__S__Group__42702);
            rule__S__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S__Group__4"


    // $ANTLR start "rule__S__Group__4__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1305:1: rule__S__Group__4__Impl : ( ']' ) ;
    public final void rule__S__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1309:1: ( ( ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1310:1: ( ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1310:1: ( ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1311:1: ']'
            {
             before(grammarAccess.getSAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__S__Group__4__Impl2730); 
             after(grammarAccess.getSAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__S__Group__4__Impl"


    // $ANTLR start "rule__P1__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1334:1: rule__P1__Group__0 : rule__P1__Group__0__Impl rule__P1__Group__1 ;
    public final void rule__P1__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1338:1: ( rule__P1__Group__0__Impl rule__P1__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1339:2: rule__P1__Group__0__Impl rule__P1__Group__1
            {
            pushFollow(FOLLOW_rule__P1__Group__0__Impl_in_rule__P1__Group__02771);
            rule__P1__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__P1__Group__1_in_rule__P1__Group__02774);
            rule__P1__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P1__Group__0"


    // $ANTLR start "rule__P1__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1346:1: rule__P1__Group__0__Impl : ( 'P' ) ;
    public final void rule__P1__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1350:1: ( ( 'P' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1351:1: ( 'P' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1351:1: ( 'P' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1352:1: 'P'
            {
             before(grammarAccess.getP1Access().getPKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__P1__Group__0__Impl2802); 
             after(grammarAccess.getP1Access().getPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P1__Group__0__Impl"


    // $ANTLR start "rule__P1__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1365:1: rule__P1__Group__1 : rule__P1__Group__1__Impl rule__P1__Group__2 ;
    public final void rule__P1__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1369:1: ( rule__P1__Group__1__Impl rule__P1__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1370:2: rule__P1__Group__1__Impl rule__P1__Group__2
            {
            pushFollow(FOLLOW_rule__P1__Group__1__Impl_in_rule__P1__Group__12833);
            rule__P1__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__P1__Group__2_in_rule__P1__Group__12836);
            rule__P1__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P1__Group__1"


    // $ANTLR start "rule__P1__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1377:1: rule__P1__Group__1__Impl : ( ruleCompare ) ;
    public final void rule__P1__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1381:1: ( ( ruleCompare ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1382:1: ( ruleCompare )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1382:1: ( ruleCompare )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1383:1: ruleCompare
            {
             before(grammarAccess.getP1Access().getCompareParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleCompare_in_rule__P1__Group__1__Impl2863);
            ruleCompare();

            state._fsp--;

             after(grammarAccess.getP1Access().getCompareParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P1__Group__1__Impl"


    // $ANTLR start "rule__P1__Group__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1394:1: rule__P1__Group__2 : rule__P1__Group__2__Impl rule__P1__Group__3 ;
    public final void rule__P1__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1398:1: ( rule__P1__Group__2__Impl rule__P1__Group__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1399:2: rule__P1__Group__2__Impl rule__P1__Group__3
            {
            pushFollow(FOLLOW_rule__P1__Group__2__Impl_in_rule__P1__Group__22892);
            rule__P1__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__P1__Group__3_in_rule__P1__Group__22895);
            rule__P1__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P1__Group__2"


    // $ANTLR start "rule__P1__Group__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1406:1: rule__P1__Group__2__Impl : ( '[' ) ;
    public final void rule__P1__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1410:1: ( ( '[' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1411:1: ( '[' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1411:1: ( '[' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1412:1: '['
            {
             before(grammarAccess.getP1Access().getLeftSquareBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__P1__Group__2__Impl2923); 
             after(grammarAccess.getP1Access().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P1__Group__2__Impl"


    // $ANTLR start "rule__P1__Group__3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1425:1: rule__P1__Group__3 : rule__P1__Group__3__Impl rule__P1__Group__4 ;
    public final void rule__P1__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1429:1: ( rule__P1__Group__3__Impl rule__P1__Group__4 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1430:2: rule__P1__Group__3__Impl rule__P1__Group__4
            {
            pushFollow(FOLLOW_rule__P1__Group__3__Impl_in_rule__P1__Group__32954);
            rule__P1__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__P1__Group__4_in_rule__P1__Group__32957);
            rule__P1__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P1__Group__3"


    // $ANTLR start "rule__P1__Group__3__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1437:1: rule__P1__Group__3__Impl : ( ( rule__P1__Alternatives_3 ) ) ;
    public final void rule__P1__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1441:1: ( ( ( rule__P1__Alternatives_3 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1442:1: ( ( rule__P1__Alternatives_3 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1442:1: ( ( rule__P1__Alternatives_3 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1443:1: ( rule__P1__Alternatives_3 )
            {
             before(grammarAccess.getP1Access().getAlternatives_3()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1444:1: ( rule__P1__Alternatives_3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1444:2: rule__P1__Alternatives_3
            {
            pushFollow(FOLLOW_rule__P1__Alternatives_3_in_rule__P1__Group__3__Impl2984);
            rule__P1__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getP1Access().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P1__Group__3__Impl"


    // $ANTLR start "rule__P1__Group__4"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1454:1: rule__P1__Group__4 : rule__P1__Group__4__Impl ;
    public final void rule__P1__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1458:1: ( rule__P1__Group__4__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1459:2: rule__P1__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__P1__Group__4__Impl_in_rule__P1__Group__43014);
            rule__P1__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P1__Group__4"


    // $ANTLR start "rule__P1__Group__4__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1465:1: rule__P1__Group__4__Impl : ( ']' ) ;
    public final void rule__P1__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1469:1: ( ( ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1470:1: ( ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1470:1: ( ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1471:1: ']'
            {
             before(grammarAccess.getP1Access().getRightSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__P1__Group__4__Impl3042); 
             after(grammarAccess.getP1Access().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P1__Group__4__Impl"


    // $ANTLR start "rule__P1__Group_3_5__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1494:1: rule__P1__Group_3_5__0 : rule__P1__Group_3_5__0__Impl rule__P1__Group_3_5__1 ;
    public final void rule__P1__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1498:1: ( rule__P1__Group_3_5__0__Impl rule__P1__Group_3_5__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1499:2: rule__P1__Group_3_5__0__Impl rule__P1__Group_3_5__1
            {
            pushFollow(FOLLOW_rule__P1__Group_3_5__0__Impl_in_rule__P1__Group_3_5__03083);
            rule__P1__Group_3_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__P1__Group_3_5__1_in_rule__P1__Group_3_5__03086);
            rule__P1__Group_3_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P1__Group_3_5__0"


    // $ANTLR start "rule__P1__Group_3_5__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1506:1: rule__P1__Group_3_5__0__Impl : ( ruleX ) ;
    public final void rule__P1__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1510:1: ( ( ruleX ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1511:1: ( ruleX )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1511:1: ( ruleX )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1512:1: ruleX
            {
             before(grammarAccess.getP1Access().getXParserRuleCall_3_5_0()); 
            pushFollow(FOLLOW_ruleX_in_rule__P1__Group_3_5__0__Impl3113);
            ruleX();

            state._fsp--;

             after(grammarAccess.getP1Access().getXParserRuleCall_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P1__Group_3_5__0__Impl"


    // $ANTLR start "rule__P1__Group_3_5__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1523:1: rule__P1__Group_3_5__1 : rule__P1__Group_3_5__1__Impl ;
    public final void rule__P1__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1527:1: ( rule__P1__Group_3_5__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1528:2: rule__P1__Group_3_5__1__Impl
            {
            pushFollow(FOLLOW_rule__P1__Group_3_5__1__Impl_in_rule__P1__Group_3_5__13142);
            rule__P1__Group_3_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P1__Group_3_5__1"


    // $ANTLR start "rule__P1__Group_3_5__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1534:1: rule__P1__Group_3_5__1__Impl : ( ruleStateOrLabel ) ;
    public final void rule__P1__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1538:1: ( ( ruleStateOrLabel ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1539:1: ( ruleStateOrLabel )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1539:1: ( ruleStateOrLabel )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1540:1: ruleStateOrLabel
            {
             before(grammarAccess.getP1Access().getStateOrLabelParserRuleCall_3_5_1()); 
            pushFollow(FOLLOW_ruleStateOrLabel_in_rule__P1__Group_3_5__1__Impl3169);
            ruleStateOrLabel();

            state._fsp--;

             after(grammarAccess.getP1Access().getStateOrLabelParserRuleCall_3_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P1__Group_3_5__1__Impl"


    // $ANTLR start "rule__P__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1555:1: rule__P__Group__0 : rule__P__Group__0__Impl rule__P__Group__1 ;
    public final void rule__P__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1559:1: ( rule__P__Group__0__Impl rule__P__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1560:2: rule__P__Group__0__Impl rule__P__Group__1
            {
            pushFollow(FOLLOW_rule__P__Group__0__Impl_in_rule__P__Group__03202);
            rule__P__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__P__Group__1_in_rule__P__Group__03205);
            rule__P__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P__Group__0"


    // $ANTLR start "rule__P__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1567:1: rule__P__Group__0__Impl : ( 'P' ) ;
    public final void rule__P__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1571:1: ( ( 'P' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1572:1: ( 'P' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1572:1: ( 'P' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1573:1: 'P'
            {
             before(grammarAccess.getPAccess().getPKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__P__Group__0__Impl3233); 
             after(grammarAccess.getPAccess().getPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P__Group__0__Impl"


    // $ANTLR start "rule__P__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1586:1: rule__P__Group__1 : rule__P__Group__1__Impl rule__P__Group__2 ;
    public final void rule__P__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1590:1: ( rule__P__Group__1__Impl rule__P__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1591:2: rule__P__Group__1__Impl rule__P__Group__2
            {
            pushFollow(FOLLOW_rule__P__Group__1__Impl_in_rule__P__Group__13264);
            rule__P__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__P__Group__2_in_rule__P__Group__13267);
            rule__P__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P__Group__1"


    // $ANTLR start "rule__P__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1598:1: rule__P__Group__1__Impl : ( ruleCompareWithoutUnknown ) ;
    public final void rule__P__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1602:1: ( ( ruleCompareWithoutUnknown ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1603:1: ( ruleCompareWithoutUnknown )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1603:1: ( ruleCompareWithoutUnknown )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1604:1: ruleCompareWithoutUnknown
            {
             before(grammarAccess.getPAccess().getCompareWithoutUnknownParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleCompareWithoutUnknown_in_rule__P__Group__1__Impl3294);
            ruleCompareWithoutUnknown();

            state._fsp--;

             after(grammarAccess.getPAccess().getCompareWithoutUnknownParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P__Group__1__Impl"


    // $ANTLR start "rule__P__Group__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1615:1: rule__P__Group__2 : rule__P__Group__2__Impl rule__P__Group__3 ;
    public final void rule__P__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1619:1: ( rule__P__Group__2__Impl rule__P__Group__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1620:2: rule__P__Group__2__Impl rule__P__Group__3
            {
            pushFollow(FOLLOW_rule__P__Group__2__Impl_in_rule__P__Group__23323);
            rule__P__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__P__Group__3_in_rule__P__Group__23326);
            rule__P__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P__Group__2"


    // $ANTLR start "rule__P__Group__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1627:1: rule__P__Group__2__Impl : ( '[' ) ;
    public final void rule__P__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1631:1: ( ( '[' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1632:1: ( '[' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1632:1: ( '[' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1633:1: '['
            {
             before(grammarAccess.getPAccess().getLeftSquareBracketKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__P__Group__2__Impl3354); 
             after(grammarAccess.getPAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P__Group__2__Impl"


    // $ANTLR start "rule__P__Group__3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1646:1: rule__P__Group__3 : rule__P__Group__3__Impl rule__P__Group__4 ;
    public final void rule__P__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1650:1: ( rule__P__Group__3__Impl rule__P__Group__4 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1651:2: rule__P__Group__3__Impl rule__P__Group__4
            {
            pushFollow(FOLLOW_rule__P__Group__3__Impl_in_rule__P__Group__33385);
            rule__P__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__P__Group__4_in_rule__P__Group__33388);
            rule__P__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P__Group__3"


    // $ANTLR start "rule__P__Group__3__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1658:1: rule__P__Group__3__Impl : ( ( rule__P__Alternatives_3 ) ) ;
    public final void rule__P__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1662:1: ( ( ( rule__P__Alternatives_3 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1663:1: ( ( rule__P__Alternatives_3 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1663:1: ( ( rule__P__Alternatives_3 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1664:1: ( rule__P__Alternatives_3 )
            {
             before(grammarAccess.getPAccess().getAlternatives_3()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1665:1: ( rule__P__Alternatives_3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1665:2: rule__P__Alternatives_3
            {
            pushFollow(FOLLOW_rule__P__Alternatives_3_in_rule__P__Group__3__Impl3415);
            rule__P__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getPAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P__Group__3__Impl"


    // $ANTLR start "rule__P__Group__4"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1675:1: rule__P__Group__4 : rule__P__Group__4__Impl ;
    public final void rule__P__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1679:1: ( rule__P__Group__4__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1680:2: rule__P__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__P__Group__4__Impl_in_rule__P__Group__43445);
            rule__P__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P__Group__4"


    // $ANTLR start "rule__P__Group__4__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1686:1: rule__P__Group__4__Impl : ( ']' ) ;
    public final void rule__P__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1690:1: ( ( ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1691:1: ( ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1691:1: ( ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1692:1: ']'
            {
             before(grammarAccess.getPAccess().getRightSquareBracketKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__P__Group__4__Impl3473); 
             after(grammarAccess.getPAccess().getRightSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P__Group__4__Impl"


    // $ANTLR start "rule__P__Group_3_5__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1715:1: rule__P__Group_3_5__0 : rule__P__Group_3_5__0__Impl rule__P__Group_3_5__1 ;
    public final void rule__P__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1719:1: ( rule__P__Group_3_5__0__Impl rule__P__Group_3_5__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1720:2: rule__P__Group_3_5__0__Impl rule__P__Group_3_5__1
            {
            pushFollow(FOLLOW_rule__P__Group_3_5__0__Impl_in_rule__P__Group_3_5__03514);
            rule__P__Group_3_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__P__Group_3_5__1_in_rule__P__Group_3_5__03517);
            rule__P__Group_3_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P__Group_3_5__0"


    // $ANTLR start "rule__P__Group_3_5__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1727:1: rule__P__Group_3_5__0__Impl : ( ruleX ) ;
    public final void rule__P__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1731:1: ( ( ruleX ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1732:1: ( ruleX )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1732:1: ( ruleX )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1733:1: ruleX
            {
             before(grammarAccess.getPAccess().getXParserRuleCall_3_5_0()); 
            pushFollow(FOLLOW_ruleX_in_rule__P__Group_3_5__0__Impl3544);
            ruleX();

            state._fsp--;

             after(grammarAccess.getPAccess().getXParserRuleCall_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P__Group_3_5__0__Impl"


    // $ANTLR start "rule__P__Group_3_5__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1744:1: rule__P__Group_3_5__1 : rule__P__Group_3_5__1__Impl ;
    public final void rule__P__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1748:1: ( rule__P__Group_3_5__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1749:2: rule__P__Group_3_5__1__Impl
            {
            pushFollow(FOLLOW_rule__P__Group_3_5__1__Impl_in_rule__P__Group_3_5__13573);
            rule__P__Group_3_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P__Group_3_5__1"


    // $ANTLR start "rule__P__Group_3_5__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1755:1: rule__P__Group_3_5__1__Impl : ( ruleStateOrLabel ) ;
    public final void rule__P__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1759:1: ( ( ruleStateOrLabel ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1760:1: ( ruleStateOrLabel )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1760:1: ( ruleStateOrLabel )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1761:1: ruleStateOrLabel
            {
             before(grammarAccess.getPAccess().getStateOrLabelParserRuleCall_3_5_1()); 
            pushFollow(FOLLOW_ruleStateOrLabel_in_rule__P__Group_3_5__1__Impl3600);
            ruleStateOrLabel();

            state._fsp--;

             after(grammarAccess.getPAccess().getStateOrLabelParserRuleCall_3_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__P__Group_3_5__1__Impl"


    // $ANTLR start "rule__F__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1776:1: rule__F__Group__0 : rule__F__Group__0__Impl rule__F__Group__1 ;
    public final void rule__F__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1780:1: ( rule__F__Group__0__Impl rule__F__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1781:2: rule__F__Group__0__Impl rule__F__Group__1
            {
            pushFollow(FOLLOW_rule__F__Group__0__Impl_in_rule__F__Group__03633);
            rule__F__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__F__Group__1_in_rule__F__Group__03636);
            rule__F__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__F__Group__0"


    // $ANTLR start "rule__F__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1788:1: rule__F__Group__0__Impl : ( 'F' ) ;
    public final void rule__F__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1792:1: ( ( 'F' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1793:1: ( 'F' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1793:1: ( 'F' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1794:1: 'F'
            {
             before(grammarAccess.getFAccess().getFKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__F__Group__0__Impl3664); 
             after(grammarAccess.getFAccess().getFKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__F__Group__0__Impl"


    // $ANTLR start "rule__F__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1807:1: rule__F__Group__1 : rule__F__Group__1__Impl rule__F__Group__2 ;
    public final void rule__F__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1811:1: ( rule__F__Group__1__Impl rule__F__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1812:2: rule__F__Group__1__Impl rule__F__Group__2
            {
            pushFollow(FOLLOW_rule__F__Group__1__Impl_in_rule__F__Group__13695);
            rule__F__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__F__Group__2_in_rule__F__Group__13698);
            rule__F__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__F__Group__1"


    // $ANTLR start "rule__F__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1819:1: rule__F__Group__1__Impl : ( ( rule__F__Group_1__0 ) ) ;
    public final void rule__F__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1823:1: ( ( ( rule__F__Group_1__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1824:1: ( ( rule__F__Group_1__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1824:1: ( ( rule__F__Group_1__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1825:1: ( rule__F__Group_1__0 )
            {
             before(grammarAccess.getFAccess().getGroup_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1826:1: ( rule__F__Group_1__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1826:2: rule__F__Group_1__0
            {
            pushFollow(FOLLOW_rule__F__Group_1__0_in_rule__F__Group__1__Impl3725);
            rule__F__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getFAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__F__Group__1__Impl"


    // $ANTLR start "rule__F__Group__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1836:1: rule__F__Group__2 : rule__F__Group__2__Impl ;
    public final void rule__F__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1840:1: ( rule__F__Group__2__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1841:2: rule__F__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__F__Group__2__Impl_in_rule__F__Group__23755);
            rule__F__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__F__Group__2"


    // $ANTLR start "rule__F__Group__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1847:1: rule__F__Group__2__Impl : ( ( rule__F__RIGHTAssignment_2 ) ) ;
    public final void rule__F__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1851:1: ( ( ( rule__F__RIGHTAssignment_2 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1852:1: ( ( rule__F__RIGHTAssignment_2 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1852:1: ( ( rule__F__RIGHTAssignment_2 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1853:1: ( rule__F__RIGHTAssignment_2 )
            {
             before(grammarAccess.getFAccess().getRIGHTAssignment_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1854:1: ( rule__F__RIGHTAssignment_2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1854:2: rule__F__RIGHTAssignment_2
            {
            pushFollow(FOLLOW_rule__F__RIGHTAssignment_2_in_rule__F__Group__2__Impl3782);
            rule__F__RIGHTAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFAccess().getRIGHTAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__F__Group__2__Impl"


    // $ANTLR start "rule__F__Group_1__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1870:1: rule__F__Group_1__0 : rule__F__Group_1__0__Impl rule__F__Group_1__1 ;
    public final void rule__F__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1874:1: ( rule__F__Group_1__0__Impl rule__F__Group_1__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1875:2: rule__F__Group_1__0__Impl rule__F__Group_1__1
            {
            pushFollow(FOLLOW_rule__F__Group_1__0__Impl_in_rule__F__Group_1__03818);
            rule__F__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__F__Group_1__1_in_rule__F__Group_1__03821);
            rule__F__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__F__Group_1__0"


    // $ANTLR start "rule__F__Group_1__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1882:1: rule__F__Group_1__0__Impl : ( ruleTimeBound ) ;
    public final void rule__F__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1886:1: ( ( ruleTimeBound ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1887:1: ( ruleTimeBound )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1887:1: ( ruleTimeBound )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1888:1: ruleTimeBound
            {
             before(grammarAccess.getFAccess().getTimeBoundParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTimeBound_in_rule__F__Group_1__0__Impl3848);
            ruleTimeBound();

            state._fsp--;

             after(grammarAccess.getFAccess().getTimeBoundParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__F__Group_1__0__Impl"


    // $ANTLR start "rule__F__Group_1__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1899:1: rule__F__Group_1__1 : rule__F__Group_1__1__Impl ;
    public final void rule__F__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1903:1: ( rule__F__Group_1__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1904:2: rule__F__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__F__Group_1__1__Impl_in_rule__F__Group_1__13877);
            rule__F__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__F__Group_1__1"


    // $ANTLR start "rule__F__Group_1__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1910:1: rule__F__Group_1__1__Impl : ( ruleX ) ;
    public final void rule__F__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1914:1: ( ( ruleX ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1915:1: ( ruleX )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1915:1: ( ruleX )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1916:1: ruleX
            {
             before(grammarAccess.getFAccess().getXParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleX_in_rule__F__Group_1__1__Impl3904);
            ruleX();

            state._fsp--;

             after(grammarAccess.getFAccess().getXParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__F__Group_1__1__Impl"


    // $ANTLR start "rule__G__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1931:1: rule__G__Group__0 : rule__G__Group__0__Impl rule__G__Group__1 ;
    public final void rule__G__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1935:1: ( rule__G__Group__0__Impl rule__G__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1936:2: rule__G__Group__0__Impl rule__G__Group__1
            {
            pushFollow(FOLLOW_rule__G__Group__0__Impl_in_rule__G__Group__03937);
            rule__G__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__G__Group__1_in_rule__G__Group__03940);
            rule__G__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__G__Group__0"


    // $ANTLR start "rule__G__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1943:1: rule__G__Group__0__Impl : ( 'G' ) ;
    public final void rule__G__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1947:1: ( ( 'G' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1948:1: ( 'G' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1948:1: ( 'G' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1949:1: 'G'
            {
             before(grammarAccess.getGAccess().getGKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__G__Group__0__Impl3968); 
             after(grammarAccess.getGAccess().getGKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__G__Group__0__Impl"


    // $ANTLR start "rule__G__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1962:1: rule__G__Group__1 : rule__G__Group__1__Impl rule__G__Group__2 ;
    public final void rule__G__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1966:1: ( rule__G__Group__1__Impl rule__G__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1967:2: rule__G__Group__1__Impl rule__G__Group__2
            {
            pushFollow(FOLLOW_rule__G__Group__1__Impl_in_rule__G__Group__13999);
            rule__G__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__G__Group__2_in_rule__G__Group__14002);
            rule__G__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__G__Group__1"


    // $ANTLR start "rule__G__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1974:1: rule__G__Group__1__Impl : ( ( rule__G__Group_1__0 ) ) ;
    public final void rule__G__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1978:1: ( ( ( rule__G__Group_1__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1979:1: ( ( rule__G__Group_1__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1979:1: ( ( rule__G__Group_1__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1980:1: ( rule__G__Group_1__0 )
            {
             before(grammarAccess.getGAccess().getGroup_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1981:1: ( rule__G__Group_1__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1981:2: rule__G__Group_1__0
            {
            pushFollow(FOLLOW_rule__G__Group_1__0_in_rule__G__Group__1__Impl4029);
            rule__G__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getGAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__G__Group__1__Impl"


    // $ANTLR start "rule__G__Group__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1991:1: rule__G__Group__2 : rule__G__Group__2__Impl rule__G__Group__3 ;
    public final void rule__G__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1995:1: ( rule__G__Group__2__Impl rule__G__Group__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1996:2: rule__G__Group__2__Impl rule__G__Group__3
            {
            pushFollow(FOLLOW_rule__G__Group__2__Impl_in_rule__G__Group__24059);
            rule__G__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__G__Group__3_in_rule__G__Group__24062);
            rule__G__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__G__Group__2"


    // $ANTLR start "rule__G__Group__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2003:1: rule__G__Group__2__Impl : ( '(' ) ;
    public final void rule__G__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2007:1: ( ( '(' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2008:1: ( '(' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2008:1: ( '(' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2009:1: '('
            {
             before(grammarAccess.getGAccess().getLeftParenthesisKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__G__Group__2__Impl4090); 
             after(grammarAccess.getGAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__G__Group__2__Impl"


    // $ANTLR start "rule__G__Group__3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2022:1: rule__G__Group__3 : rule__G__Group__3__Impl rule__G__Group__4 ;
    public final void rule__G__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2026:1: ( rule__G__Group__3__Impl rule__G__Group__4 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2027:2: rule__G__Group__3__Impl rule__G__Group__4
            {
            pushFollow(FOLLOW_rule__G__Group__3__Impl_in_rule__G__Group__34121);
            rule__G__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__G__Group__4_in_rule__G__Group__34124);
            rule__G__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__G__Group__3"


    // $ANTLR start "rule__G__Group__3__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2034:1: rule__G__Group__3__Impl : ( ( rule__G__LEFTAssignment_3 ) ) ;
    public final void rule__G__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2038:1: ( ( ( rule__G__LEFTAssignment_3 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2039:1: ( ( rule__G__LEFTAssignment_3 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2039:1: ( ( rule__G__LEFTAssignment_3 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2040:1: ( rule__G__LEFTAssignment_3 )
            {
             before(grammarAccess.getGAccess().getLEFTAssignment_3()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2041:1: ( rule__G__LEFTAssignment_3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2041:2: rule__G__LEFTAssignment_3
            {
            pushFollow(FOLLOW_rule__G__LEFTAssignment_3_in_rule__G__Group__3__Impl4151);
            rule__G__LEFTAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGAccess().getLEFTAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__G__Group__3__Impl"


    // $ANTLR start "rule__G__Group__4"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2051:1: rule__G__Group__4 : rule__G__Group__4__Impl rule__G__Group__5 ;
    public final void rule__G__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2055:1: ( rule__G__Group__4__Impl rule__G__Group__5 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2056:2: rule__G__Group__4__Impl rule__G__Group__5
            {
            pushFollow(FOLLOW_rule__G__Group__4__Impl_in_rule__G__Group__44181);
            rule__G__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__G__Group__5_in_rule__G__Group__44184);
            rule__G__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__G__Group__4"


    // $ANTLR start "rule__G__Group__4__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2063:1: rule__G__Group__4__Impl : ( '=>' ) ;
    public final void rule__G__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2067:1: ( ( '=>' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2068:1: ( '=>' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2068:1: ( '=>' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2069:1: '=>'
            {
             before(grammarAccess.getGAccess().getEqualsSignGreaterThanSignKeyword_4()); 
            match(input,26,FOLLOW_26_in_rule__G__Group__4__Impl4212); 
             after(grammarAccess.getGAccess().getEqualsSignGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__G__Group__4__Impl"


    // $ANTLR start "rule__G__Group__5"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2082:1: rule__G__Group__5 : rule__G__Group__5__Impl rule__G__Group__6 ;
    public final void rule__G__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2086:1: ( rule__G__Group__5__Impl rule__G__Group__6 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2087:2: rule__G__Group__5__Impl rule__G__Group__6
            {
            pushFollow(FOLLOW_rule__G__Group__5__Impl_in_rule__G__Group__54243);
            rule__G__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__G__Group__6_in_rule__G__Group__54246);
            rule__G__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__G__Group__5"


    // $ANTLR start "rule__G__Group__5__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2094:1: rule__G__Group__5__Impl : ( ( rule__G__RIGHTAssignment_5 ) ) ;
    public final void rule__G__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2098:1: ( ( ( rule__G__RIGHTAssignment_5 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2099:1: ( ( rule__G__RIGHTAssignment_5 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2099:1: ( ( rule__G__RIGHTAssignment_5 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2100:1: ( rule__G__RIGHTAssignment_5 )
            {
             before(grammarAccess.getGAccess().getRIGHTAssignment_5()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2101:1: ( rule__G__RIGHTAssignment_5 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2101:2: rule__G__RIGHTAssignment_5
            {
            pushFollow(FOLLOW_rule__G__RIGHTAssignment_5_in_rule__G__Group__5__Impl4273);
            rule__G__RIGHTAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGAccess().getRIGHTAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__G__Group__5__Impl"


    // $ANTLR start "rule__G__Group__6"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2111:1: rule__G__Group__6 : rule__G__Group__6__Impl ;
    public final void rule__G__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2115:1: ( rule__G__Group__6__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2116:2: rule__G__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__G__Group__6__Impl_in_rule__G__Group__64303);
            rule__G__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__G__Group__6"


    // $ANTLR start "rule__G__Group__6__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2122:1: rule__G__Group__6__Impl : ( ')' ) ;
    public final void rule__G__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2126:1: ( ( ')' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2127:1: ( ')' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2127:1: ( ')' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2128:1: ')'
            {
             before(grammarAccess.getGAccess().getRightParenthesisKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__G__Group__6__Impl4331); 
             after(grammarAccess.getGAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__G__Group__6__Impl"


    // $ANTLR start "rule__G__Group_1__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2155:1: rule__G__Group_1__0 : rule__G__Group_1__0__Impl rule__G__Group_1__1 ;
    public final void rule__G__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2159:1: ( rule__G__Group_1__0__Impl rule__G__Group_1__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2160:2: rule__G__Group_1__0__Impl rule__G__Group_1__1
            {
            pushFollow(FOLLOW_rule__G__Group_1__0__Impl_in_rule__G__Group_1__04376);
            rule__G__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__G__Group_1__1_in_rule__G__Group_1__04379);
            rule__G__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__G__Group_1__0"


    // $ANTLR start "rule__G__Group_1__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2167:1: rule__G__Group_1__0__Impl : ( ruleTimeBound ) ;
    public final void rule__G__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2171:1: ( ( ruleTimeBound ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2172:1: ( ruleTimeBound )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2172:1: ( ruleTimeBound )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2173:1: ruleTimeBound
            {
             before(grammarAccess.getGAccess().getTimeBoundParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTimeBound_in_rule__G__Group_1__0__Impl4406);
            ruleTimeBound();

            state._fsp--;

             after(grammarAccess.getGAccess().getTimeBoundParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__G__Group_1__0__Impl"


    // $ANTLR start "rule__G__Group_1__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2184:1: rule__G__Group_1__1 : rule__G__Group_1__1__Impl ;
    public final void rule__G__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2188:1: ( rule__G__Group_1__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2189:2: rule__G__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__G__Group_1__1__Impl_in_rule__G__Group_1__14435);
            rule__G__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__G__Group_1__1"


    // $ANTLR start "rule__G__Group_1__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2195:1: rule__G__Group_1__1__Impl : ( ruleX ) ;
    public final void rule__G__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2199:1: ( ( ruleX ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2200:1: ( ruleX )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2200:1: ( ruleX )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2201:1: ruleX
            {
             before(grammarAccess.getGAccess().getXParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleX_in_rule__G__Group_1__1__Impl4462);
            ruleX();

            state._fsp--;

             after(grammarAccess.getGAccess().getXParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__G__Group_1__1__Impl"


    // $ANTLR start "rule__U__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2216:1: rule__U__Group__0 : rule__U__Group__0__Impl rule__U__Group__1 ;
    public final void rule__U__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2220:1: ( rule__U__Group__0__Impl rule__U__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2221:2: rule__U__Group__0__Impl rule__U__Group__1
            {
            pushFollow(FOLLOW_rule__U__Group__0__Impl_in_rule__U__Group__04495);
            rule__U__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__U__Group__1_in_rule__U__Group__04498);
            rule__U__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__U__Group__0"


    // $ANTLR start "rule__U__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2228:1: rule__U__Group__0__Impl : ( ( rule__U__LEFTAssignment_0 ) ) ;
    public final void rule__U__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2232:1: ( ( ( rule__U__LEFTAssignment_0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2233:1: ( ( rule__U__LEFTAssignment_0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2233:1: ( ( rule__U__LEFTAssignment_0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2234:1: ( rule__U__LEFTAssignment_0 )
            {
             before(grammarAccess.getUAccess().getLEFTAssignment_0()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2235:1: ( rule__U__LEFTAssignment_0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2235:2: rule__U__LEFTAssignment_0
            {
            pushFollow(FOLLOW_rule__U__LEFTAssignment_0_in_rule__U__Group__0__Impl4525);
            rule__U__LEFTAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUAccess().getLEFTAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__U__Group__0__Impl"


    // $ANTLR start "rule__U__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2245:1: rule__U__Group__1 : rule__U__Group__1__Impl rule__U__Group__2 ;
    public final void rule__U__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2249:1: ( rule__U__Group__1__Impl rule__U__Group__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2250:2: rule__U__Group__1__Impl rule__U__Group__2
            {
            pushFollow(FOLLOW_rule__U__Group__1__Impl_in_rule__U__Group__14555);
            rule__U__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__U__Group__2_in_rule__U__Group__14558);
            rule__U__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__U__Group__1"


    // $ANTLR start "rule__U__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2257:1: rule__U__Group__1__Impl : ( ( rule__U__Alternatives_1 ) ) ;
    public final void rule__U__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2261:1: ( ( ( rule__U__Alternatives_1 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2262:1: ( ( rule__U__Alternatives_1 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2262:1: ( ( rule__U__Alternatives_1 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2263:1: ( rule__U__Alternatives_1 )
            {
             before(grammarAccess.getUAccess().getAlternatives_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2264:1: ( rule__U__Alternatives_1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2264:2: rule__U__Alternatives_1
            {
            pushFollow(FOLLOW_rule__U__Alternatives_1_in_rule__U__Group__1__Impl4585);
            rule__U__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getUAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__U__Group__1__Impl"


    // $ANTLR start "rule__U__Group__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2274:1: rule__U__Group__2 : rule__U__Group__2__Impl rule__U__Group__3 ;
    public final void rule__U__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2278:1: ( rule__U__Group__2__Impl rule__U__Group__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2279:2: rule__U__Group__2__Impl rule__U__Group__3
            {
            pushFollow(FOLLOW_rule__U__Group__2__Impl_in_rule__U__Group__24615);
            rule__U__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__U__Group__3_in_rule__U__Group__24618);
            rule__U__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__U__Group__2"


    // $ANTLR start "rule__U__Group__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2286:1: rule__U__Group__2__Impl : ( ( rule__U__Group_2__0 ) ) ;
    public final void rule__U__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2290:1: ( ( ( rule__U__Group_2__0 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2291:1: ( ( rule__U__Group_2__0 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2291:1: ( ( rule__U__Group_2__0 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2292:1: ( rule__U__Group_2__0 )
            {
             before(grammarAccess.getUAccess().getGroup_2()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2293:1: ( rule__U__Group_2__0 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2293:2: rule__U__Group_2__0
            {
            pushFollow(FOLLOW_rule__U__Group_2__0_in_rule__U__Group__2__Impl4645);
            rule__U__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getUAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__U__Group__2__Impl"


    // $ANTLR start "rule__U__Group__3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2303:1: rule__U__Group__3 : rule__U__Group__3__Impl ;
    public final void rule__U__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2307:1: ( rule__U__Group__3__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2308:2: rule__U__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__U__Group__3__Impl_in_rule__U__Group__34675);
            rule__U__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__U__Group__3"


    // $ANTLR start "rule__U__Group__3__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2314:1: rule__U__Group__3__Impl : ( ( rule__U__RIGHTAssignment_3 ) ) ;
    public final void rule__U__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2318:1: ( ( ( rule__U__RIGHTAssignment_3 ) ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2319:1: ( ( rule__U__RIGHTAssignment_3 ) )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2319:1: ( ( rule__U__RIGHTAssignment_3 ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2320:1: ( rule__U__RIGHTAssignment_3 )
            {
             before(grammarAccess.getUAccess().getRIGHTAssignment_3()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2321:1: ( rule__U__RIGHTAssignment_3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2321:2: rule__U__RIGHTAssignment_3
            {
            pushFollow(FOLLOW_rule__U__RIGHTAssignment_3_in_rule__U__Group__3__Impl4702);
            rule__U__RIGHTAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUAccess().getRIGHTAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__U__Group__3__Impl"


    // $ANTLR start "rule__U__Group_2__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2339:1: rule__U__Group_2__0 : rule__U__Group_2__0__Impl rule__U__Group_2__1 ;
    public final void rule__U__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2343:1: ( rule__U__Group_2__0__Impl rule__U__Group_2__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2344:2: rule__U__Group_2__0__Impl rule__U__Group_2__1
            {
            pushFollow(FOLLOW_rule__U__Group_2__0__Impl_in_rule__U__Group_2__04740);
            rule__U__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__U__Group_2__1_in_rule__U__Group_2__04743);
            rule__U__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__U__Group_2__0"


    // $ANTLR start "rule__U__Group_2__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2351:1: rule__U__Group_2__0__Impl : ( ruleTimeBound ) ;
    public final void rule__U__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2355:1: ( ( ruleTimeBound ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2356:1: ( ruleTimeBound )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2356:1: ( ruleTimeBound )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2357:1: ruleTimeBound
            {
             before(grammarAccess.getUAccess().getTimeBoundParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTimeBound_in_rule__U__Group_2__0__Impl4770);
            ruleTimeBound();

            state._fsp--;

             after(grammarAccess.getUAccess().getTimeBoundParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__U__Group_2__0__Impl"


    // $ANTLR start "rule__U__Group_2__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2368:1: rule__U__Group_2__1 : rule__U__Group_2__1__Impl ;
    public final void rule__U__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2372:1: ( rule__U__Group_2__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2373:2: rule__U__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__U__Group_2__1__Impl_in_rule__U__Group_2__14799);
            rule__U__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__U__Group_2__1"


    // $ANTLR start "rule__U__Group_2__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2379:1: rule__U__Group_2__1__Impl : ( ruleX ) ;
    public final void rule__U__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2383:1: ( ( ruleX ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2384:1: ( ruleX )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2384:1: ( ruleX )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2385:1: ruleX
            {
             before(grammarAccess.getUAccess().getXParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleX_in_rule__U__Group_2__1__Impl4826);
            ruleX();

            state._fsp--;

             after(grammarAccess.getUAccess().getXParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__U__Group_2__1__Impl"


    // $ANTLR start "rule__CompareWithoutUnknown__Group_0__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2400:1: rule__CompareWithoutUnknown__Group_0__0 : rule__CompareWithoutUnknown__Group_0__0__Impl rule__CompareWithoutUnknown__Group_0__1 ;
    public final void rule__CompareWithoutUnknown__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2404:1: ( rule__CompareWithoutUnknown__Group_0__0__Impl rule__CompareWithoutUnknown__Group_0__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2405:2: rule__CompareWithoutUnknown__Group_0__0__Impl rule__CompareWithoutUnknown__Group_0__1
            {
            pushFollow(FOLLOW_rule__CompareWithoutUnknown__Group_0__0__Impl_in_rule__CompareWithoutUnknown__Group_0__04859);
            rule__CompareWithoutUnknown__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareWithoutUnknown__Group_0__1_in_rule__CompareWithoutUnknown__Group_0__04862);
            rule__CompareWithoutUnknown__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareWithoutUnknown__Group_0__0"


    // $ANTLR start "rule__CompareWithoutUnknown__Group_0__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2412:1: rule__CompareWithoutUnknown__Group_0__0__Impl : ( '>' ) ;
    public final void rule__CompareWithoutUnknown__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2416:1: ( ( '>' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2417:1: ( '>' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2417:1: ( '>' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2418:1: '>'
            {
             before(grammarAccess.getCompareWithoutUnknownAccess().getGreaterThanSignKeyword_0_0()); 
            match(input,27,FOLLOW_27_in_rule__CompareWithoutUnknown__Group_0__0__Impl4890); 
             after(grammarAccess.getCompareWithoutUnknownAccess().getGreaterThanSignKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareWithoutUnknown__Group_0__0__Impl"


    // $ANTLR start "rule__CompareWithoutUnknown__Group_0__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2431:1: rule__CompareWithoutUnknown__Group_0__1 : rule__CompareWithoutUnknown__Group_0__1__Impl ;
    public final void rule__CompareWithoutUnknown__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2435:1: ( rule__CompareWithoutUnknown__Group_0__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2436:2: rule__CompareWithoutUnknown__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareWithoutUnknown__Group_0__1__Impl_in_rule__CompareWithoutUnknown__Group_0__14921);
            rule__CompareWithoutUnknown__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareWithoutUnknown__Group_0__1"


    // $ANTLR start "rule__CompareWithoutUnknown__Group_0__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2442:1: rule__CompareWithoutUnknown__Group_0__1__Impl : ( ruleDECIMAL ) ;
    public final void rule__CompareWithoutUnknown__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2446:1: ( ( ruleDECIMAL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2447:1: ( ruleDECIMAL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2447:1: ( ruleDECIMAL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2448:1: ruleDECIMAL
            {
             before(grammarAccess.getCompareWithoutUnknownAccess().getDECIMALParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleDECIMAL_in_rule__CompareWithoutUnknown__Group_0__1__Impl4948);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getCompareWithoutUnknownAccess().getDECIMALParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareWithoutUnknown__Group_0__1__Impl"


    // $ANTLR start "rule__CompareWithoutUnknown__Group_1__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2463:1: rule__CompareWithoutUnknown__Group_1__0 : rule__CompareWithoutUnknown__Group_1__0__Impl rule__CompareWithoutUnknown__Group_1__1 ;
    public final void rule__CompareWithoutUnknown__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2467:1: ( rule__CompareWithoutUnknown__Group_1__0__Impl rule__CompareWithoutUnknown__Group_1__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2468:2: rule__CompareWithoutUnknown__Group_1__0__Impl rule__CompareWithoutUnknown__Group_1__1
            {
            pushFollow(FOLLOW_rule__CompareWithoutUnknown__Group_1__0__Impl_in_rule__CompareWithoutUnknown__Group_1__04981);
            rule__CompareWithoutUnknown__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareWithoutUnknown__Group_1__1_in_rule__CompareWithoutUnknown__Group_1__04984);
            rule__CompareWithoutUnknown__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareWithoutUnknown__Group_1__0"


    // $ANTLR start "rule__CompareWithoutUnknown__Group_1__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2475:1: rule__CompareWithoutUnknown__Group_1__0__Impl : ( '<' ) ;
    public final void rule__CompareWithoutUnknown__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2479:1: ( ( '<' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2480:1: ( '<' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2480:1: ( '<' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2481:1: '<'
            {
             before(grammarAccess.getCompareWithoutUnknownAccess().getLessThanSignKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__CompareWithoutUnknown__Group_1__0__Impl5012); 
             after(grammarAccess.getCompareWithoutUnknownAccess().getLessThanSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareWithoutUnknown__Group_1__0__Impl"


    // $ANTLR start "rule__CompareWithoutUnknown__Group_1__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2494:1: rule__CompareWithoutUnknown__Group_1__1 : rule__CompareWithoutUnknown__Group_1__1__Impl ;
    public final void rule__CompareWithoutUnknown__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2498:1: ( rule__CompareWithoutUnknown__Group_1__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2499:2: rule__CompareWithoutUnknown__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareWithoutUnknown__Group_1__1__Impl_in_rule__CompareWithoutUnknown__Group_1__15043);
            rule__CompareWithoutUnknown__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareWithoutUnknown__Group_1__1"


    // $ANTLR start "rule__CompareWithoutUnknown__Group_1__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2505:1: rule__CompareWithoutUnknown__Group_1__1__Impl : ( ruleDECIMAL ) ;
    public final void rule__CompareWithoutUnknown__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2509:1: ( ( ruleDECIMAL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2510:1: ( ruleDECIMAL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2510:1: ( ruleDECIMAL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2511:1: ruleDECIMAL
            {
             before(grammarAccess.getCompareWithoutUnknownAccess().getDECIMALParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleDECIMAL_in_rule__CompareWithoutUnknown__Group_1__1__Impl5070);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getCompareWithoutUnknownAccess().getDECIMALParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareWithoutUnknown__Group_1__1__Impl"


    // $ANTLR start "rule__CompareWithoutUnknown__Group_2__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2526:1: rule__CompareWithoutUnknown__Group_2__0 : rule__CompareWithoutUnknown__Group_2__0__Impl rule__CompareWithoutUnknown__Group_2__1 ;
    public final void rule__CompareWithoutUnknown__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2530:1: ( rule__CompareWithoutUnknown__Group_2__0__Impl rule__CompareWithoutUnknown__Group_2__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2531:2: rule__CompareWithoutUnknown__Group_2__0__Impl rule__CompareWithoutUnknown__Group_2__1
            {
            pushFollow(FOLLOW_rule__CompareWithoutUnknown__Group_2__0__Impl_in_rule__CompareWithoutUnknown__Group_2__05103);
            rule__CompareWithoutUnknown__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareWithoutUnknown__Group_2__1_in_rule__CompareWithoutUnknown__Group_2__05106);
            rule__CompareWithoutUnknown__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareWithoutUnknown__Group_2__0"


    // $ANTLR start "rule__CompareWithoutUnknown__Group_2__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2538:1: rule__CompareWithoutUnknown__Group_2__0__Impl : ( '>=' ) ;
    public final void rule__CompareWithoutUnknown__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2542:1: ( ( '>=' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2543:1: ( '>=' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2543:1: ( '>=' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2544:1: '>='
            {
             before(grammarAccess.getCompareWithoutUnknownAccess().getGreaterThanSignEqualsSignKeyword_2_0()); 
            match(input,29,FOLLOW_29_in_rule__CompareWithoutUnknown__Group_2__0__Impl5134); 
             after(grammarAccess.getCompareWithoutUnknownAccess().getGreaterThanSignEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareWithoutUnknown__Group_2__0__Impl"


    // $ANTLR start "rule__CompareWithoutUnknown__Group_2__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2557:1: rule__CompareWithoutUnknown__Group_2__1 : rule__CompareWithoutUnknown__Group_2__1__Impl ;
    public final void rule__CompareWithoutUnknown__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2561:1: ( rule__CompareWithoutUnknown__Group_2__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2562:2: rule__CompareWithoutUnknown__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareWithoutUnknown__Group_2__1__Impl_in_rule__CompareWithoutUnknown__Group_2__15165);
            rule__CompareWithoutUnknown__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareWithoutUnknown__Group_2__1"


    // $ANTLR start "rule__CompareWithoutUnknown__Group_2__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2568:1: rule__CompareWithoutUnknown__Group_2__1__Impl : ( ruleDECIMAL ) ;
    public final void rule__CompareWithoutUnknown__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2572:1: ( ( ruleDECIMAL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2573:1: ( ruleDECIMAL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2573:1: ( ruleDECIMAL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2574:1: ruleDECIMAL
            {
             before(grammarAccess.getCompareWithoutUnknownAccess().getDECIMALParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleDECIMAL_in_rule__CompareWithoutUnknown__Group_2__1__Impl5192);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getCompareWithoutUnknownAccess().getDECIMALParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareWithoutUnknown__Group_2__1__Impl"


    // $ANTLR start "rule__CompareWithoutUnknown__Group_3__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2589:1: rule__CompareWithoutUnknown__Group_3__0 : rule__CompareWithoutUnknown__Group_3__0__Impl rule__CompareWithoutUnknown__Group_3__1 ;
    public final void rule__CompareWithoutUnknown__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2593:1: ( rule__CompareWithoutUnknown__Group_3__0__Impl rule__CompareWithoutUnknown__Group_3__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2594:2: rule__CompareWithoutUnknown__Group_3__0__Impl rule__CompareWithoutUnknown__Group_3__1
            {
            pushFollow(FOLLOW_rule__CompareWithoutUnknown__Group_3__0__Impl_in_rule__CompareWithoutUnknown__Group_3__05225);
            rule__CompareWithoutUnknown__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CompareWithoutUnknown__Group_3__1_in_rule__CompareWithoutUnknown__Group_3__05228);
            rule__CompareWithoutUnknown__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareWithoutUnknown__Group_3__0"


    // $ANTLR start "rule__CompareWithoutUnknown__Group_3__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2601:1: rule__CompareWithoutUnknown__Group_3__0__Impl : ( '<=' ) ;
    public final void rule__CompareWithoutUnknown__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2605:1: ( ( '<=' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2606:1: ( '<=' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2606:1: ( '<=' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2607:1: '<='
            {
             before(grammarAccess.getCompareWithoutUnknownAccess().getLessThanSignEqualsSignKeyword_3_0()); 
            match(input,30,FOLLOW_30_in_rule__CompareWithoutUnknown__Group_3__0__Impl5256); 
             after(grammarAccess.getCompareWithoutUnknownAccess().getLessThanSignEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareWithoutUnknown__Group_3__0__Impl"


    // $ANTLR start "rule__CompareWithoutUnknown__Group_3__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2620:1: rule__CompareWithoutUnknown__Group_3__1 : rule__CompareWithoutUnknown__Group_3__1__Impl ;
    public final void rule__CompareWithoutUnknown__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2624:1: ( rule__CompareWithoutUnknown__Group_3__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2625:2: rule__CompareWithoutUnknown__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__CompareWithoutUnknown__Group_3__1__Impl_in_rule__CompareWithoutUnknown__Group_3__15287);
            rule__CompareWithoutUnknown__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareWithoutUnknown__Group_3__1"


    // $ANTLR start "rule__CompareWithoutUnknown__Group_3__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2631:1: rule__CompareWithoutUnknown__Group_3__1__Impl : ( ruleDECIMAL ) ;
    public final void rule__CompareWithoutUnknown__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2635:1: ( ( ruleDECIMAL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2636:1: ( ruleDECIMAL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2636:1: ( ruleDECIMAL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2637:1: ruleDECIMAL
            {
             before(grammarAccess.getCompareWithoutUnknownAccess().getDECIMALParserRuleCall_3_1()); 
            pushFollow(FOLLOW_ruleDECIMAL_in_rule__CompareWithoutUnknown__Group_3__1__Impl5314);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getCompareWithoutUnknownAccess().getDECIMALParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareWithoutUnknown__Group_3__1__Impl"


    // $ANTLR start "rule__TimeBound__Group_0__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2652:1: rule__TimeBound__Group_0__0 : rule__TimeBound__Group_0__0__Impl rule__TimeBound__Group_0__1 ;
    public final void rule__TimeBound__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2656:1: ( rule__TimeBound__Group_0__0__Impl rule__TimeBound__Group_0__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2657:2: rule__TimeBound__Group_0__0__Impl rule__TimeBound__Group_0__1
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_0__0__Impl_in_rule__TimeBound__Group_0__05347);
            rule__TimeBound__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_0__1_in_rule__TimeBound__Group_0__05350);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2664:1: rule__TimeBound__Group_0__0__Impl : ( '>=' ) ;
    public final void rule__TimeBound__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2668:1: ( ( '>=' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2669:1: ( '>=' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2669:1: ( '>=' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2670:1: '>='
            {
             before(grammarAccess.getTimeBoundAccess().getGreaterThanSignEqualsSignKeyword_0_0()); 
            match(input,29,FOLLOW_29_in_rule__TimeBound__Group_0__0__Impl5378); 
             after(grammarAccess.getTimeBoundAccess().getGreaterThanSignEqualsSignKeyword_0_0()); 

            }


            }

        }
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2683:1: rule__TimeBound__Group_0__1 : rule__TimeBound__Group_0__1__Impl ;
    public final void rule__TimeBound__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2687:1: ( rule__TimeBound__Group_0__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2688:2: rule__TimeBound__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_0__1__Impl_in_rule__TimeBound__Group_0__15409);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2694:1: rule__TimeBound__Group_0__1__Impl : ( ruleDECIMAL ) ;
    public final void rule__TimeBound__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2698:1: ( ( ruleDECIMAL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2699:1: ( ruleDECIMAL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2699:1: ( ruleDECIMAL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2700:1: ruleDECIMAL
            {
             before(grammarAccess.getTimeBoundAccess().getDECIMALParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleDECIMAL_in_rule__TimeBound__Group_0__1__Impl5436);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getTimeBoundAccess().getDECIMALParserRuleCall_0_1()); 

            }


            }

        }
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2715:1: rule__TimeBound__Group_1__0 : rule__TimeBound__Group_1__0__Impl rule__TimeBound__Group_1__1 ;
    public final void rule__TimeBound__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2719:1: ( rule__TimeBound__Group_1__0__Impl rule__TimeBound__Group_1__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2720:2: rule__TimeBound__Group_1__0__Impl rule__TimeBound__Group_1__1
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__0__Impl_in_rule__TimeBound__Group_1__05469);
            rule__TimeBound__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_1__1_in_rule__TimeBound__Group_1__05472);
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2727:1: rule__TimeBound__Group_1__0__Impl : ( '<=' ) ;
    public final void rule__TimeBound__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2731:1: ( ( '<=' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2732:1: ( '<=' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2732:1: ( '<=' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2733:1: '<='
            {
             before(grammarAccess.getTimeBoundAccess().getLessThanSignEqualsSignKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__TimeBound__Group_1__0__Impl5500); 
             after(grammarAccess.getTimeBoundAccess().getLessThanSignEqualsSignKeyword_1_0()); 

            }


            }

        }
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2746:1: rule__TimeBound__Group_1__1 : rule__TimeBound__Group_1__1__Impl ;
    public final void rule__TimeBound__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2750:1: ( rule__TimeBound__Group_1__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2751:2: rule__TimeBound__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_1__1__Impl_in_rule__TimeBound__Group_1__15531);
            rule__TimeBound__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2757:1: rule__TimeBound__Group_1__1__Impl : ( ruleDECIMAL ) ;
    public final void rule__TimeBound__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2761:1: ( ( ruleDECIMAL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2762:1: ( ruleDECIMAL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2762:1: ( ruleDECIMAL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2763:1: ruleDECIMAL
            {
             before(grammarAccess.getTimeBoundAccess().getDECIMALParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleDECIMAL_in_rule__TimeBound__Group_1__1__Impl5558);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getTimeBoundAccess().getDECIMALParserRuleCall_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__TimeBound__Group_2__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2778:1: rule__TimeBound__Group_2__0 : rule__TimeBound__Group_2__0__Impl rule__TimeBound__Group_2__1 ;
    public final void rule__TimeBound__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2782:1: ( rule__TimeBound__Group_2__0__Impl rule__TimeBound__Group_2__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2783:2: rule__TimeBound__Group_2__0__Impl rule__TimeBound__Group_2__1
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_2__0__Impl_in_rule__TimeBound__Group_2__05591);
            rule__TimeBound__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_2__1_in_rule__TimeBound__Group_2__05594);
            rule__TimeBound__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_2__0"


    // $ANTLR start "rule__TimeBound__Group_2__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2790:1: rule__TimeBound__Group_2__0__Impl : ( '=' ) ;
    public final void rule__TimeBound__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2794:1: ( ( '=' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2795:1: ( '=' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2795:1: ( '=' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2796:1: '='
            {
             before(grammarAccess.getTimeBoundAccess().getEqualsSignKeyword_2_0()); 
            match(input,31,FOLLOW_31_in_rule__TimeBound__Group_2__0__Impl5622); 
             after(grammarAccess.getTimeBoundAccess().getEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_2__0__Impl"


    // $ANTLR start "rule__TimeBound__Group_2__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2809:1: rule__TimeBound__Group_2__1 : rule__TimeBound__Group_2__1__Impl ;
    public final void rule__TimeBound__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2813:1: ( rule__TimeBound__Group_2__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2814:2: rule__TimeBound__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_2__1__Impl_in_rule__TimeBound__Group_2__15653);
            rule__TimeBound__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_2__1"


    // $ANTLR start "rule__TimeBound__Group_2__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2820:1: rule__TimeBound__Group_2__1__Impl : ( ruleDECIMAL ) ;
    public final void rule__TimeBound__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2824:1: ( ( ruleDECIMAL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2825:1: ( ruleDECIMAL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2825:1: ( ruleDECIMAL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2826:1: ruleDECIMAL
            {
             before(grammarAccess.getTimeBoundAccess().getDECIMALParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleDECIMAL_in_rule__TimeBound__Group_2__1__Impl5680);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getTimeBoundAccess().getDECIMALParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_2__1__Impl"


    // $ANTLR start "rule__TimeBound__Group_3__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2841:1: rule__TimeBound__Group_3__0 : rule__TimeBound__Group_3__0__Impl rule__TimeBound__Group_3__1 ;
    public final void rule__TimeBound__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2845:1: ( rule__TimeBound__Group_3__0__Impl rule__TimeBound__Group_3__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2846:2: rule__TimeBound__Group_3__0__Impl rule__TimeBound__Group_3__1
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_3__0__Impl_in_rule__TimeBound__Group_3__05713);
            rule__TimeBound__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_3__1_in_rule__TimeBound__Group_3__05716);
            rule__TimeBound__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_3__0"


    // $ANTLR start "rule__TimeBound__Group_3__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2853:1: rule__TimeBound__Group_3__0__Impl : ( '[' ) ;
    public final void rule__TimeBound__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2857:1: ( ( '[' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2858:1: ( '[' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2858:1: ( '[' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2859:1: '['
            {
             before(grammarAccess.getTimeBoundAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__TimeBound__Group_3__0__Impl5744); 
             after(grammarAccess.getTimeBoundAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_3__0__Impl"


    // $ANTLR start "rule__TimeBound__Group_3__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2872:1: rule__TimeBound__Group_3__1 : rule__TimeBound__Group_3__1__Impl rule__TimeBound__Group_3__2 ;
    public final void rule__TimeBound__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2876:1: ( rule__TimeBound__Group_3__1__Impl rule__TimeBound__Group_3__2 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2877:2: rule__TimeBound__Group_3__1__Impl rule__TimeBound__Group_3__2
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_3__1__Impl_in_rule__TimeBound__Group_3__15775);
            rule__TimeBound__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_3__2_in_rule__TimeBound__Group_3__15778);
            rule__TimeBound__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_3__1"


    // $ANTLR start "rule__TimeBound__Group_3__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2884:1: rule__TimeBound__Group_3__1__Impl : ( ruleDECIMAL ) ;
    public final void rule__TimeBound__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2888:1: ( ( ruleDECIMAL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2889:1: ( ruleDECIMAL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2889:1: ( ruleDECIMAL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2890:1: ruleDECIMAL
            {
             before(grammarAccess.getTimeBoundAccess().getDECIMALParserRuleCall_3_1()); 
            pushFollow(FOLLOW_ruleDECIMAL_in_rule__TimeBound__Group_3__1__Impl5805);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getTimeBoundAccess().getDECIMALParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_3__1__Impl"


    // $ANTLR start "rule__TimeBound__Group_3__2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2901:1: rule__TimeBound__Group_3__2 : rule__TimeBound__Group_3__2__Impl rule__TimeBound__Group_3__3 ;
    public final void rule__TimeBound__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2905:1: ( rule__TimeBound__Group_3__2__Impl rule__TimeBound__Group_3__3 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2906:2: rule__TimeBound__Group_3__2__Impl rule__TimeBound__Group_3__3
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_3__2__Impl_in_rule__TimeBound__Group_3__25834);
            rule__TimeBound__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_3__3_in_rule__TimeBound__Group_3__25837);
            rule__TimeBound__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_3__2"


    // $ANTLR start "rule__TimeBound__Group_3__2__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2913:1: rule__TimeBound__Group_3__2__Impl : ( ',' ) ;
    public final void rule__TimeBound__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2917:1: ( ( ',' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2918:1: ( ',' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2918:1: ( ',' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2919:1: ','
            {
             before(grammarAccess.getTimeBoundAccess().getCommaKeyword_3_2()); 
            match(input,32,FOLLOW_32_in_rule__TimeBound__Group_3__2__Impl5865); 
             after(grammarAccess.getTimeBoundAccess().getCommaKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_3__2__Impl"


    // $ANTLR start "rule__TimeBound__Group_3__3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2932:1: rule__TimeBound__Group_3__3 : rule__TimeBound__Group_3__3__Impl rule__TimeBound__Group_3__4 ;
    public final void rule__TimeBound__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2936:1: ( rule__TimeBound__Group_3__3__Impl rule__TimeBound__Group_3__4 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2937:2: rule__TimeBound__Group_3__3__Impl rule__TimeBound__Group_3__4
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_3__3__Impl_in_rule__TimeBound__Group_3__35896);
            rule__TimeBound__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TimeBound__Group_3__4_in_rule__TimeBound__Group_3__35899);
            rule__TimeBound__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_3__3"


    // $ANTLR start "rule__TimeBound__Group_3__3__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2944:1: rule__TimeBound__Group_3__3__Impl : ( ruleDECIMAL ) ;
    public final void rule__TimeBound__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2948:1: ( ( ruleDECIMAL ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2949:1: ( ruleDECIMAL )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2949:1: ( ruleDECIMAL )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2950:1: ruleDECIMAL
            {
             before(grammarAccess.getTimeBoundAccess().getDECIMALParserRuleCall_3_3()); 
            pushFollow(FOLLOW_ruleDECIMAL_in_rule__TimeBound__Group_3__3__Impl5926);
            ruleDECIMAL();

            state._fsp--;

             after(grammarAccess.getTimeBoundAccess().getDECIMALParserRuleCall_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_3__3__Impl"


    // $ANTLR start "rule__TimeBound__Group_3__4"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2961:1: rule__TimeBound__Group_3__4 : rule__TimeBound__Group_3__4__Impl ;
    public final void rule__TimeBound__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2965:1: ( rule__TimeBound__Group_3__4__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2966:2: rule__TimeBound__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__TimeBound__Group_3__4__Impl_in_rule__TimeBound__Group_3__45955);
            rule__TimeBound__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_3__4"


    // $ANTLR start "rule__TimeBound__Group_3__4__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2972:1: rule__TimeBound__Group_3__4__Impl : ( ']' ) ;
    public final void rule__TimeBound__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2976:1: ( ( ']' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2977:1: ( ']' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2977:1: ( ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:2978:1: ']'
            {
             before(grammarAccess.getTimeBoundAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,22,FOLLOW_22_in_rule__TimeBound__Group_3__4__Impl5983); 
             after(grammarAccess.getTimeBoundAccess().getRightSquareBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeBound__Group_3__4__Impl"


    // $ANTLR start "rule__DECIMAL__Group__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3001:1: rule__DECIMAL__Group__0 : rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 ;
    public final void rule__DECIMAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3005:1: ( rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3006:2: rule__DECIMAL__Group__0__Impl rule__DECIMAL__Group__1
            {
            pushFollow(FOLLOW_rule__DECIMAL__Group__0__Impl_in_rule__DECIMAL__Group__06024);
            rule__DECIMAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DECIMAL__Group__1_in_rule__DECIMAL__Group__06027);
            rule__DECIMAL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__0"


    // $ANTLR start "rule__DECIMAL__Group__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3013:1: rule__DECIMAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3017:1: ( ( RULE_INT ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3018:1: ( RULE_INT )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3018:1: ( RULE_INT )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3019:1: RULE_INT
            {
             before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DECIMAL__Group__0__Impl6054); 
             after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__0__Impl"


    // $ANTLR start "rule__DECIMAL__Group__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3030:1: rule__DECIMAL__Group__1 : rule__DECIMAL__Group__1__Impl ;
    public final void rule__DECIMAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3034:1: ( rule__DECIMAL__Group__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3035:2: rule__DECIMAL__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DECIMAL__Group__1__Impl_in_rule__DECIMAL__Group__16083);
            rule__DECIMAL__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__1"


    // $ANTLR start "rule__DECIMAL__Group__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3041:1: rule__DECIMAL__Group__1__Impl : ( ( rule__DECIMAL__Group_1__0 )? ) ;
    public final void rule__DECIMAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3045:1: ( ( ( rule__DECIMAL__Group_1__0 )? ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3046:1: ( ( rule__DECIMAL__Group_1__0 )? )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3046:1: ( ( rule__DECIMAL__Group_1__0 )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3047:1: ( rule__DECIMAL__Group_1__0 )?
            {
             before(grammarAccess.getDECIMALAccess().getGroup_1()); 
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3048:1: ( rule__DECIMAL__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3048:2: rule__DECIMAL__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DECIMAL__Group_1__0_in_rule__DECIMAL__Group__1__Impl6110);
                    rule__DECIMAL__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDECIMALAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group__1__Impl"


    // $ANTLR start "rule__DECIMAL__Group_1__0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3062:1: rule__DECIMAL__Group_1__0 : rule__DECIMAL__Group_1__0__Impl rule__DECIMAL__Group_1__1 ;
    public final void rule__DECIMAL__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3066:1: ( rule__DECIMAL__Group_1__0__Impl rule__DECIMAL__Group_1__1 )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3067:2: rule__DECIMAL__Group_1__0__Impl rule__DECIMAL__Group_1__1
            {
            pushFollow(FOLLOW_rule__DECIMAL__Group_1__0__Impl_in_rule__DECIMAL__Group_1__06145);
            rule__DECIMAL__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DECIMAL__Group_1__1_in_rule__DECIMAL__Group_1__06148);
            rule__DECIMAL__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group_1__0"


    // $ANTLR start "rule__DECIMAL__Group_1__0__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3074:1: rule__DECIMAL__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DECIMAL__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3078:1: ( ( '.' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3079:1: ( '.' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3079:1: ( '.' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3080:1: '.'
            {
             before(grammarAccess.getDECIMALAccess().getFullStopKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__DECIMAL__Group_1__0__Impl6176); 
             after(grammarAccess.getDECIMALAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group_1__0__Impl"


    // $ANTLR start "rule__DECIMAL__Group_1__1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3093:1: rule__DECIMAL__Group_1__1 : rule__DECIMAL__Group_1__1__Impl ;
    public final void rule__DECIMAL__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3097:1: ( rule__DECIMAL__Group_1__1__Impl )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3098:2: rule__DECIMAL__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DECIMAL__Group_1__1__Impl_in_rule__DECIMAL__Group_1__16207);
            rule__DECIMAL__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group_1__1"


    // $ANTLR start "rule__DECIMAL__Group_1__1__Impl"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3104:1: rule__DECIMAL__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DECIMAL__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3108:1: ( ( RULE_INT ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3109:1: ( RULE_INT )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3109:1: ( RULE_INT )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3110:1: RULE_INT
            {
             before(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DECIMAL__Group_1__1__Impl6234); 
             after(grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DECIMAL__Group_1__1__Impl"


    // $ANTLR start "rule__Start__StartAssignment_0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3126:1: rule__Start__StartAssignment_0 : ( ruleS ) ;
    public final void rule__Start__StartAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3130:1: ( ( ruleS ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3131:1: ( ruleS )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3131:1: ( ruleS )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3132:1: ruleS
            {
             before(grammarAccess.getStartAccess().getStartSParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleS_in_rule__Start__StartAssignment_06272);
            ruleS();

            state._fsp--;

             after(grammarAccess.getStartAccess().getStartSParserRuleCall_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__State__NameAssignment_0_2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3141:1: rule__State__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3145:1: ( ( RULE_ID ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3146:1: ( RULE_ID )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3146:1: ( RULE_ID )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3147:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_0_26303); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_0_2"


    // $ANTLR start "rule__State__NameAssignment_1_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3156:1: rule__State__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3160:1: ( ( RULE_ID ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3161:1: ( RULE_ID )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3161:1: ( RULE_ID )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3162:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_1_16334); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1_1"


    // $ANTLR start "rule__Label__NameAssignment_0_2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3171:1: rule__Label__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Label__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3175:1: ( ( RULE_ID ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3176:1: ( RULE_ID )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3176:1: ( RULE_ID )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3177:1: RULE_ID
            {
             before(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Label__NameAssignment_0_26365); 
             after(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__NameAssignment_0_2"


    // $ANTLR start "rule__Label__NameAssignment_1_1"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3186:1: rule__Label__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Label__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3190:1: ( ( RULE_ID ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3191:1: ( RULE_ID )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3191:1: ( RULE_ID )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3192:1: RULE_ID
            {
             before(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Label__NameAssignment_1_16396); 
             after(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__NameAssignment_1_1"


    // $ANTLR start "rule__F__RIGHTAssignment_2"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3201:1: rule__F__RIGHTAssignment_2 : ( ruleStateOrLabel ) ;
    public final void rule__F__RIGHTAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3205:1: ( ( ruleStateOrLabel ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3206:1: ( ruleStateOrLabel )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3206:1: ( ruleStateOrLabel )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3207:1: ruleStateOrLabel
            {
             before(grammarAccess.getFAccess().getRIGHTStateOrLabelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStateOrLabel_in_rule__F__RIGHTAssignment_26427);
            ruleStateOrLabel();

            state._fsp--;

             after(grammarAccess.getFAccess().getRIGHTStateOrLabelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__F__RIGHTAssignment_2"


    // $ANTLR start "rule__G__LEFTAssignment_3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3216:1: rule__G__LEFTAssignment_3 : ( ruleStateOrLabel ) ;
    public final void rule__G__LEFTAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3220:1: ( ( ruleStateOrLabel ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3221:1: ( ruleStateOrLabel )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3221:1: ( ruleStateOrLabel )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3222:1: ruleStateOrLabel
            {
             before(grammarAccess.getGAccess().getLEFTStateOrLabelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStateOrLabel_in_rule__G__LEFTAssignment_36458);
            ruleStateOrLabel();

            state._fsp--;

             after(grammarAccess.getGAccess().getLEFTStateOrLabelParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__G__LEFTAssignment_3"


    // $ANTLR start "rule__G__RIGHTAssignment_5"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3231:1: rule__G__RIGHTAssignment_5 : ( ruleP ) ;
    public final void rule__G__RIGHTAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3235:1: ( ( ruleP ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3236:1: ( ruleP )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3236:1: ( ruleP )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3237:1: ruleP
            {
             before(grammarAccess.getGAccess().getRIGHTPParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleP_in_rule__G__RIGHTAssignment_56489);
            ruleP();

            state._fsp--;

             after(grammarAccess.getGAccess().getRIGHTPParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__G__RIGHTAssignment_5"


    // $ANTLR start "rule__U__LEFTAssignment_0"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3246:1: rule__U__LEFTAssignment_0 : ( ruleStateOrLabel ) ;
    public final void rule__U__LEFTAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3250:1: ( ( ruleStateOrLabel ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3251:1: ( ruleStateOrLabel )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3251:1: ( ruleStateOrLabel )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3252:1: ruleStateOrLabel
            {
             before(grammarAccess.getUAccess().getLEFTStateOrLabelParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStateOrLabel_in_rule__U__LEFTAssignment_06520);
            ruleStateOrLabel();

            state._fsp--;

             after(grammarAccess.getUAccess().getLEFTStateOrLabelParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__U__LEFTAssignment_0"


    // $ANTLR start "rule__U__RIGHTAssignment_3"
    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3261:1: rule__U__RIGHTAssignment_3 : ( ruleStateOrLabel ) ;
    public final void rule__U__RIGHTAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3265:1: ( ( ruleStateOrLabel ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3266:1: ( ruleStateOrLabel )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3266:1: ( ruleStateOrLabel )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3267:1: ruleStateOrLabel
            {
             before(grammarAccess.getUAccess().getRIGHTStateOrLabelParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStateOrLabel_in_rule__U__RIGHTAssignment_36551);
            ruleStateOrLabel();

            state._fsp--;

             after(grammarAccess.getUAccess().getRIGHTStateOrLabelParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__U__RIGHTAssignment_3"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA7_eotS =
        "\22\uffff";
    static final String DFA7_eofS =
        "\22\uffff";
    static final String DFA7_minS =
        "\1\13\3\uffff\1\21\2\5\2\uffff\2\5\2\14\2\22\1\uffff\2\14";
    static final String DFA7_maxS =
        "\1\31\3\uffff\1\23\2\5\2\uffff\2\5\2\26\2\22\1\uffff\2\26";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\3\uffff\1\5\1\6\6\uffff\1\4\2\uffff";
    static final String DFA7_specialS =
        "\22\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\10\4\uffff\1\4\1\5\1\uffff\1\6\1\2\2\uffff\1\1\1\3\1\7",
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
            "\3\17\7\uffff\1\10",
            "\3\17\7\uffff\1\10",
            "\1\20",
            "\1\21",
            "",
            "\3\17\7\uffff\1\10",
            "\3\17\7\uffff\1\10"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "570:1: rule__P1__Alternatives_3 : ( ( ruleP ) | ( ruleS ) | ( ruleF ) | ( ruleU ) | ( ruleG ) | ( ( rule__P1__Group_3_5__0 ) ) );";
        }
    }
    static final String DFA8_eotS =
        "\22\uffff";
    static final String DFA8_eofS =
        "\22\uffff";
    static final String DFA8_minS =
        "\1\13\3\uffff\1\21\2\5\2\uffff\2\5\2\14\2\22\1\uffff\2\14";
    static final String DFA8_maxS =
        "\1\31\3\uffff\1\23\2\5\2\uffff\2\5\2\26\2\22\1\uffff\2\26";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\3\uffff\1\5\1\6\6\uffff\1\4\2\uffff";
    static final String DFA8_specialS =
        "\22\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\10\4\uffff\1\4\1\5\1\uffff\1\6\1\2\2\uffff\1\1\1\3\1\7",
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
            "\3\17\7\uffff\1\10",
            "\3\17\7\uffff\1\10",
            "\1\20",
            "\1\21",
            "",
            "\3\17\7\uffff\1\10",
            "\3\17\7\uffff\1\10"
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "616:1: rule__P__Alternatives_3 : ( ( ruleP ) | ( ruleS ) | ( ruleF ) | ( ruleU ) | ( ruleG ) | ( ( rule__P__Group_3_5__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleStart_in_entryRuleStart61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStart68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Start__Alternatives_in_ruleStart94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Alternatives_in_ruleState154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Alternatives_in_ruleLabel214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_entryRuleStateOrLabel241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateOrLabel248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateOrLabel__Alternatives_in_ruleStateOrLabel274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleS_in_entryRuleS301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleS308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__S__Group__0_in_ruleS334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleP1_in_entryRuleP1361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleP1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P1__Group__0_in_ruleP1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleP_in_entryRuleP421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleP428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P__Group__0_in_ruleP454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleX_in_entryRuleX481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleX488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleX516 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleF_in_entryRuleF546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleF553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__F__Group__0_in_ruleF579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleG_in_entryRuleG606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleG613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__G__Group__0_in_ruleG639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleU_in_entryRuleU666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleU673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__U__Group__0_in_ruleU699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_entryRuleCompare726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompare733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Alternatives_in_ruleCompare759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareWithoutUnknown_in_entryRuleCompareWithoutUnknown786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareWithoutUnknown793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareWithoutUnknown__Alternatives_in_ruleCompareWithoutUnknown819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_entryRuleTimeBound846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTimeBound853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Alternatives_in_ruleTimeBound879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_entryRuleDECIMAL907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDECIMAL914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DECIMAL__Group__0_in_ruleDECIMAL940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Start__StartAssignment_0_in_rule__Start__Alternatives976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleP1_in_rule__Start__Alternatives994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0__0_in_rule__State__Alternatives1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1__0_in_rule__State__Alternatives1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group_0__0_in_rule__Label__Alternatives1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group_1__0_in_rule__Label__Alternatives1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__StateOrLabel__Alternatives1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__StateOrLabel__Alternatives1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleP_in_rule__P1__Alternatives_31177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleS_in_rule__P1__Alternatives_31194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleF_in_rule__P1__Alternatives_31211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleU_in_rule__P1__Alternatives_31228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleG_in_rule__P1__Alternatives_31245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P1__Group_3_5__0_in_rule__P1__Alternatives_31262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleP_in_rule__P__Alternatives_31295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleS_in_rule__P__Alternatives_31312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleF_in_rule__P__Alternatives_31329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleU_in_rule__P__Alternatives_31346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleG_in_rule__P__Alternatives_31363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P__Group_3_5__0_in_rule__P__Alternatives_31380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__U__Alternatives_11414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__U__Alternatives_11434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__U__Alternatives_11454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareWithoutUnknown_in_rule__Compare__Alternatives1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Compare__Alternatives1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareWithoutUnknown__Group_0__0_in_rule__CompareWithoutUnknown__Alternatives1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareWithoutUnknown__Group_1__0_in_rule__CompareWithoutUnknown__Alternatives1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareWithoutUnknown__Group_2__0_in_rule__CompareWithoutUnknown__Alternatives1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareWithoutUnknown__Group_3__0_in_rule__CompareWithoutUnknown__Alternatives1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0__0_in_rule__TimeBound__Alternatives1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__0_in_rule__TimeBound__Alternatives1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_2__0_in_rule__TimeBound__Alternatives1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_3__0_in_rule__TimeBound__Alternatives1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0__0__Impl_in_rule__State__Group_0__01712 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__State__Group_0__1_in_rule__State__Group_0__01715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__Group_0__0__Impl1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0__1__Impl_in_rule__State__Group_0__11774 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__State__Group_0__2_in_rule__State__Group_0__11777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__Group_0__1__Impl1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0__2__Impl_in_rule__State__Group_0__21836 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__State__Group_0__3_in_rule__State__Group_0__21839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_0_2_in_rule__State__Group_0__2__Impl1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_0__3__Impl_in_rule__State__Group_0__31896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__State__Group_0__3__Impl1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1__0__Impl_in_rule__State__Group_1__01963 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__State__Group_1__1_in_rule__State__Group_1__01966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__State__Group_1__0__Impl1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_1__1__Impl_in_rule__State__Group_1__12025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_1_1_in_rule__State__Group_1__1__Impl2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group_0__0__Impl_in_rule__Label__Group_0__02086 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Label__Group_0__1_in_rule__Label__Group_0__02089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Label__Group_0__0__Impl2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group_0__1__Impl_in_rule__Label__Group_0__12148 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Label__Group_0__2_in_rule__Label__Group_0__12151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Label__Group_0__1__Impl2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group_0__2__Impl_in_rule__Label__Group_0__22210 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Label__Group_0__3_in_rule__Label__Group_0__22213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__NameAssignment_0_2_in_rule__Label__Group_0__2__Impl2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group_0__3__Impl_in_rule__Label__Group_0__32270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Label__Group_0__3__Impl2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group_1__0__Impl_in_rule__Label__Group_1__02337 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Label__Group_1__1_in_rule__Label__Group_1__02340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Label__Group_1__0__Impl2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Group_1__1__Impl_in_rule__Label__Group_1__12399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__NameAssignment_1_1_in_rule__Label__Group_1__1__Impl2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__S__Group__0__Impl_in_rule__S__Group__02460 = new BitSet(new long[]{0x0000000078008000L});
    public static final BitSet FOLLOW_rule__S__Group__1_in_rule__S__Group__02463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__S__Group__0__Impl2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__S__Group__1__Impl_in_rule__S__Group__12522 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__S__Group__2_in_rule__S__Group__12525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_rule__S__Group__1__Impl2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__S__Group__2__Impl_in_rule__S__Group__22581 = new BitSet(new long[]{0x00000000000B0000L});
    public static final BitSet FOLLOW_rule__S__Group__3_in_rule__S__Group__22584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__S__Group__2__Impl2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__S__Group__3__Impl_in_rule__S__Group__32643 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__S__Group__4_in_rule__S__Group__32646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_rule__S__Group__3__Impl2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__S__Group__4__Impl_in_rule__S__Group__42702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__S__Group__4__Impl2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P1__Group__0__Impl_in_rule__P1__Group__02771 = new BitSet(new long[]{0x0000000078008000L});
    public static final BitSet FOLLOW_rule__P1__Group__1_in_rule__P1__Group__02774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__P1__Group__0__Impl2802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P1__Group__1__Impl_in_rule__P1__Group__12833 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__P1__Group__2_in_rule__P1__Group__12836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_rule__P1__Group__1__Impl2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P1__Group__2__Impl_in_rule__P1__Group__22892 = new BitSet(new long[]{0x00000000039B0800L});
    public static final BitSet FOLLOW_rule__P1__Group__3_in_rule__P1__Group__22895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__P1__Group__2__Impl2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P1__Group__3__Impl_in_rule__P1__Group__32954 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__P1__Group__4_in_rule__P1__Group__32957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P1__Alternatives_3_in_rule__P1__Group__3__Impl2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P1__Group__4__Impl_in_rule__P1__Group__43014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__P1__Group__4__Impl3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P1__Group_3_5__0__Impl_in_rule__P1__Group_3_5__03083 = new BitSet(new long[]{0x00000000000B0000L});
    public static final BitSet FOLLOW_rule__P1__Group_3_5__1_in_rule__P1__Group_3_5__03086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleX_in_rule__P1__Group_3_5__0__Impl3113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P1__Group_3_5__1__Impl_in_rule__P1__Group_3_5__13142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_rule__P1__Group_3_5__1__Impl3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P__Group__0__Impl_in_rule__P__Group__03202 = new BitSet(new long[]{0x0000000078000000L});
    public static final BitSet FOLLOW_rule__P__Group__1_in_rule__P__Group__03205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__P__Group__0__Impl3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P__Group__1__Impl_in_rule__P__Group__13264 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__P__Group__2_in_rule__P__Group__13267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareWithoutUnknown_in_rule__P__Group__1__Impl3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P__Group__2__Impl_in_rule__P__Group__23323 = new BitSet(new long[]{0x00000000039B0800L});
    public static final BitSet FOLLOW_rule__P__Group__3_in_rule__P__Group__23326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__P__Group__2__Impl3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P__Group__3__Impl_in_rule__P__Group__33385 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__P__Group__4_in_rule__P__Group__33388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P__Alternatives_3_in_rule__P__Group__3__Impl3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P__Group__4__Impl_in_rule__P__Group__43445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__P__Group__4__Impl3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P__Group_3_5__0__Impl_in_rule__P__Group_3_5__03514 = new BitSet(new long[]{0x00000000000B0000L});
    public static final BitSet FOLLOW_rule__P__Group_3_5__1_in_rule__P__Group_3_5__03517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleX_in_rule__P__Group_3_5__0__Impl3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__P__Group_3_5__1__Impl_in_rule__P__Group_3_5__13573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_rule__P__Group_3_5__1__Impl3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__F__Group__0__Impl_in_rule__F__Group__03633 = new BitSet(new long[]{0x00000000E0200000L});
    public static final BitSet FOLLOW_rule__F__Group__1_in_rule__F__Group__03636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__F__Group__0__Impl3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__F__Group__1__Impl_in_rule__F__Group__13695 = new BitSet(new long[]{0x00000000000B0000L});
    public static final BitSet FOLLOW_rule__F__Group__2_in_rule__F__Group__13698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__F__Group_1__0_in_rule__F__Group__1__Impl3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__F__Group__2__Impl_in_rule__F__Group__23755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__F__RIGHTAssignment_2_in_rule__F__Group__2__Impl3782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__F__Group_1__0__Impl_in_rule__F__Group_1__03818 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__F__Group_1__1_in_rule__F__Group_1__03821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_rule__F__Group_1__0__Impl3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__F__Group_1__1__Impl_in_rule__F__Group_1__13877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleX_in_rule__F__Group_1__1__Impl3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__G__Group__0__Impl_in_rule__G__Group__03937 = new BitSet(new long[]{0x00000000E0200000L});
    public static final BitSet FOLLOW_rule__G__Group__1_in_rule__G__Group__03940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__G__Group__0__Impl3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__G__Group__1__Impl_in_rule__G__Group__13999 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__G__Group__2_in_rule__G__Group__14002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__G__Group_1__0_in_rule__G__Group__1__Impl4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__G__Group__2__Impl_in_rule__G__Group__24059 = new BitSet(new long[]{0x00000000000B0000L});
    public static final BitSet FOLLOW_rule__G__Group__3_in_rule__G__Group__24062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__G__Group__2__Impl4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__G__Group__3__Impl_in_rule__G__Group__34121 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__G__Group__4_in_rule__G__Group__34124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__G__LEFTAssignment_3_in_rule__G__Group__3__Impl4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__G__Group__4__Impl_in_rule__G__Group__44181 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__G__Group__5_in_rule__G__Group__44184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__G__Group__4__Impl4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__G__Group__5__Impl_in_rule__G__Group__54243 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__G__Group__6_in_rule__G__Group__54246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__G__RIGHTAssignment_5_in_rule__G__Group__5__Impl4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__G__Group__6__Impl_in_rule__G__Group__64303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__G__Group__6__Impl4331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__G__Group_1__0__Impl_in_rule__G__Group_1__04376 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__G__Group_1__1_in_rule__G__Group_1__04379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_rule__G__Group_1__0__Impl4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__G__Group_1__1__Impl_in_rule__G__Group_1__14435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleX_in_rule__G__Group_1__1__Impl4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__U__Group__0__Impl_in_rule__U__Group__04495 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_rule__U__Group__1_in_rule__U__Group__04498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__U__LEFTAssignment_0_in_rule__U__Group__0__Impl4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__U__Group__1__Impl_in_rule__U__Group__14555 = new BitSet(new long[]{0x00000000E0200000L});
    public static final BitSet FOLLOW_rule__U__Group__2_in_rule__U__Group__14558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__U__Alternatives_1_in_rule__U__Group__1__Impl4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__U__Group__2__Impl_in_rule__U__Group__24615 = new BitSet(new long[]{0x00000000000B0000L});
    public static final BitSet FOLLOW_rule__U__Group__3_in_rule__U__Group__24618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__U__Group_2__0_in_rule__U__Group__2__Impl4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__U__Group__3__Impl_in_rule__U__Group__34675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__U__RIGHTAssignment_3_in_rule__U__Group__3__Impl4702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__U__Group_2__0__Impl_in_rule__U__Group_2__04740 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__U__Group_2__1_in_rule__U__Group_2__04743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTimeBound_in_rule__U__Group_2__0__Impl4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__U__Group_2__1__Impl_in_rule__U__Group_2__14799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleX_in_rule__U__Group_2__1__Impl4826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareWithoutUnknown__Group_0__0__Impl_in_rule__CompareWithoutUnknown__Group_0__04859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CompareWithoutUnknown__Group_0__1_in_rule__CompareWithoutUnknown__Group_0__04862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CompareWithoutUnknown__Group_0__0__Impl4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareWithoutUnknown__Group_0__1__Impl_in_rule__CompareWithoutUnknown__Group_0__14921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_rule__CompareWithoutUnknown__Group_0__1__Impl4948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareWithoutUnknown__Group_1__0__Impl_in_rule__CompareWithoutUnknown__Group_1__04981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CompareWithoutUnknown__Group_1__1_in_rule__CompareWithoutUnknown__Group_1__04984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CompareWithoutUnknown__Group_1__0__Impl5012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareWithoutUnknown__Group_1__1__Impl_in_rule__CompareWithoutUnknown__Group_1__15043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_rule__CompareWithoutUnknown__Group_1__1__Impl5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareWithoutUnknown__Group_2__0__Impl_in_rule__CompareWithoutUnknown__Group_2__05103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CompareWithoutUnknown__Group_2__1_in_rule__CompareWithoutUnknown__Group_2__05106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CompareWithoutUnknown__Group_2__0__Impl5134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareWithoutUnknown__Group_2__1__Impl_in_rule__CompareWithoutUnknown__Group_2__15165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_rule__CompareWithoutUnknown__Group_2__1__Impl5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareWithoutUnknown__Group_3__0__Impl_in_rule__CompareWithoutUnknown__Group_3__05225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CompareWithoutUnknown__Group_3__1_in_rule__CompareWithoutUnknown__Group_3__05228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CompareWithoutUnknown__Group_3__0__Impl5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareWithoutUnknown__Group_3__1__Impl_in_rule__CompareWithoutUnknown__Group_3__15287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_rule__CompareWithoutUnknown__Group_3__1__Impl5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0__0__Impl_in_rule__TimeBound__Group_0__05347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0__1_in_rule__TimeBound__Group_0__05350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__TimeBound__Group_0__0__Impl5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_0__1__Impl_in_rule__TimeBound__Group_0__15409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_rule__TimeBound__Group_0__1__Impl5436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__0__Impl_in_rule__TimeBound__Group_1__05469 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__1_in_rule__TimeBound__Group_1__05472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__TimeBound__Group_1__0__Impl5500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_1__1__Impl_in_rule__TimeBound__Group_1__15531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_rule__TimeBound__Group_1__1__Impl5558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_2__0__Impl_in_rule__TimeBound__Group_2__05591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_2__1_in_rule__TimeBound__Group_2__05594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TimeBound__Group_2__0__Impl5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_2__1__Impl_in_rule__TimeBound__Group_2__15653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_rule__TimeBound__Group_2__1__Impl5680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_3__0__Impl_in_rule__TimeBound__Group_3__05713 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_3__1_in_rule__TimeBound__Group_3__05716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TimeBound__Group_3__0__Impl5744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_3__1__Impl_in_rule__TimeBound__Group_3__15775 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_3__2_in_rule__TimeBound__Group_3__15778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_rule__TimeBound__Group_3__1__Impl5805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_3__2__Impl_in_rule__TimeBound__Group_3__25834 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_3__3_in_rule__TimeBound__Group_3__25837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TimeBound__Group_3__2__Impl5865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_3__3__Impl_in_rule__TimeBound__Group_3__35896 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_3__4_in_rule__TimeBound__Group_3__35899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_rule__TimeBound__Group_3__3__Impl5926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TimeBound__Group_3__4__Impl_in_rule__TimeBound__Group_3__45955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TimeBound__Group_3__4__Impl5983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DECIMAL__Group__0__Impl_in_rule__DECIMAL__Group__06024 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__DECIMAL__Group__1_in_rule__DECIMAL__Group__06027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DECIMAL__Group__0__Impl6054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DECIMAL__Group__1__Impl_in_rule__DECIMAL__Group__16083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DECIMAL__Group_1__0_in_rule__DECIMAL__Group__1__Impl6110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DECIMAL__Group_1__0__Impl_in_rule__DECIMAL__Group_1__06145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DECIMAL__Group_1__1_in_rule__DECIMAL__Group_1__06148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DECIMAL__Group_1__0__Impl6176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DECIMAL__Group_1__1__Impl_in_rule__DECIMAL__Group_1__16207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DECIMAL__Group_1__1__Impl6234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleS_in_rule__Start__StartAssignment_06272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_0_26303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_1_16334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Label__NameAssignment_0_26365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Label__NameAssignment_1_16396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_rule__F__RIGHTAssignment_26427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_rule__G__LEFTAssignment_36458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleP_in_rule__G__RIGHTAssignment_56489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_rule__U__LEFTAssignment_06520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateOrLabel_in_rule__U__RIGHTAssignment_36551 = new BitSet(new long[]{0x0000000000000002L});

}