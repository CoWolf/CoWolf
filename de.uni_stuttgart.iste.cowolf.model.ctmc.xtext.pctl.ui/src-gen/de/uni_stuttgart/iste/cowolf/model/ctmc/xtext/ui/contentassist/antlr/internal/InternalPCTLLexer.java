package de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPCTLLexer extends Lexer {
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
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=6;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=9;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=8;
    public static final int RULE_DECIMAL=5;
    public static final int RULE_WS=11;

    // delegates
    // delegators

    public InternalPCTLLexer() {;} 
    public InternalPCTLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPCTLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:11:7: ( '=?' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:11:9: '=?'
            {
            match("=?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:12:7: ( 'U' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:12:9: 'U'
            {
            match('U'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:13:7: ( 'W' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:13:9: 'W'
            {
            match('W'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:14:7: ( 'R' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:14:9: 'R'
            {
            match('R'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:15:7: ( '=' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:15:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:16:7: ( 'State:' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:16:9: 'State:'
            {
            match("State:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:17:7: ( 'Label:' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:17:9: 'Label:'
            {
            match("Label:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:18:7: ( '!' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:18:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:19:7: ( '&' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:19:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:20:7: ( '|' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:20:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:21:7: ( '(' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:21:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:22:7: ( ')' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:22:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:23:7: ( 'S' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:23:9: 'S'
            {
            match('S'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:24:7: ( '[' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:24:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:25:7: ( ']' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:25:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:26:7: ( 'P' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:26:9: 'P'
            {
            match('P'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:27:7: ( 'X' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:27:9: 'X'
            {
            match('X'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:28:7: ( 'F' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:28:9: 'F'
            {
            match('F'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:29:7: ( 'G' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:29:9: 'G'
            {
            match('G'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:30:7: ( '=>' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:30:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:31:7: ( '>' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:31:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:32:7: ( '<' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:32:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:33:7: ( ',' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:33:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3633:11: ( ( 'true' | 'false' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3633:13: ( 'true' | 'false' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3633:13: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3633:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3633:21: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3635:14: ( ( RULE_INT ( '.' RULE_INT )? | '.' RULE_INT ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3635:16: ( RULE_INT ( '.' RULE_INT )? | '.' RULE_INT )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3635:16: ( RULE_INT ( '.' RULE_INT )? | '.' RULE_INT )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                alt3=1;
            }
            else if ( (LA3_0=='.') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3635:17: RULE_INT ( '.' RULE_INT )?
                    {
                    mRULE_INT(); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3635:26: ( '.' RULE_INT )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='.') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3635:27: '.' RULE_INT
                            {
                            match('.'); 
                            mRULE_INT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3635:42: '.' RULE_INT
                    {
                    match('.'); 
                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3637:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3637:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3637:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3637:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3637:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3639:10: ( ( '0' .. '9' )+ )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3639:12: ( '0' .. '9' )+
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3639:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3639:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3641:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3641:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3641:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3641:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3641:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3641:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3641:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3641:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3641:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3641:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3641:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3643:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3643:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3643:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3643:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3645:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3645:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3645:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3645:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3645:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3645:41: ( '\\r' )? '\\n'
                    {
                    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3645:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3645:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3647:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3647:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3647:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3649:16: ( . )
            // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:3649:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_BOOL | RULE_DECIMAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=32;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:148: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 25 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:158: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 26 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:171: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 27 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:179: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 28 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:188: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 29 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:200: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 30 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:216: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 31 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:232: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 32 :
                // ../de.uni_stuttgart.iste.cowolf.model.ctmc.xtext.pctl.ui/src-gen/de/uni_stuttgart/iste/cowolf/model/ctmc/xtext/ui/contentassist/antlr/internal/InternalPCTL.g:1:240: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\42\1\44\1\45\1\46\1\50\1\43\7\uffff\1\61\1\62\1\63\1"+
        "\64\3\uffff\2\43\1\72\2\37\1\uffff\3\37\11\uffff\1\43\1\uffff\1"+
        "\43\16\uffff\2\43\1\uffff\1\72\4\uffff\6\43\1\112\3\43\1\uffff\1"+
        "\112\2\uffff";
    static final String DFA15_eofS =
        "\116\uffff";
    static final String DFA15_minS =
        "\1\0\1\76\4\60\1\141\7\uffff\4\60\3\uffff\1\162\1\141\2\60\1\101"+
        "\1\uffff\2\0\1\52\11\uffff\1\141\1\uffff\1\142\16\uffff\1\165\1"+
        "\154\1\uffff\1\60\4\uffff\1\164\2\145\1\163\1\145\1\154\1\60\1\145"+
        "\2\72\1\uffff\1\60\2\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\77\4\172\1\141\7\uffff\4\172\3\uffff\1\162\1\141\2\71"+
        "\1\172\1\uffff\2\uffff\1\57\11\uffff\1\141\1\uffff\1\142\16\uffff"+
        "\1\165\1\154\1\uffff\1\71\4\uffff\1\164\2\145\1\163\1\145\1\154"+
        "\1\172\1\145\2\72\1\uffff\1\172\2\uffff";
    static final String DFA15_acceptS =
        "\7\uffff\1\10\1\11\1\12\1\13\1\14\1\16\1\17\4\uffff\1\25\1\26\1"+
        "\27\5\uffff\1\32\3\uffff\1\37\1\40\1\1\1\24\1\5\1\32\1\2\1\3\1\4"+
        "\1\uffff\1\15\1\uffff\1\10\1\11\1\12\1\13\1\14\1\16\1\17\1\20\1"+
        "\21\1\22\1\23\1\25\1\26\1\27\2\uffff\1\31\1\uffff\1\34\1\35\1\36"+
        "\1\37\12\uffff\1\30\1\uffff\1\6\1\7";
    static final String DFA15_specialS =
        "\1\2\32\uffff\1\0\1\1\61\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\7\1\33\3\37\1\10\1\34\1\12"+
            "\1\13\2\37\1\24\1\37\1\30\1\35\12\27\2\37\1\23\1\1\1\22\2\37"+
            "\5\32\1\20\1\21\4\32\1\6\3\32\1\16\1\32\1\4\1\5\1\32\1\2\1\32"+
            "\1\3\1\17\2\32\1\14\1\37\1\15\1\31\1\32\1\37\5\32\1\26\15\32"+
            "\1\25\6\32\1\37\1\11\uff83\37",
            "\1\41\1\40",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\23\43\1\47\6\43",
            "\1\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "",
            "",
            "\1\70",
            "\1\71",
            "\12\73",
            "\12\72",
            "\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            "\0\74",
            "\0\74",
            "\1\75\4\uffff\1\76",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\100",
            "",
            "\1\101",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\102",
            "\1\103",
            "",
            "\12\73",
            "",
            "",
            "",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | RULE_BOOL | RULE_DECIMAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_27 = input.LA(1);

                        s = -1;
                        if ( ((LA15_27>='\u0000' && LA15_27<='\uFFFF')) ) {s = 60;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_28 = input.LA(1);

                        s = -1;
                        if ( ((LA15_28>='\u0000' && LA15_28<='\uFFFF')) ) {s = 60;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='=') ) {s = 1;}

                        else if ( (LA15_0=='U') ) {s = 2;}

                        else if ( (LA15_0=='W') ) {s = 3;}

                        else if ( (LA15_0=='R') ) {s = 4;}

                        else if ( (LA15_0=='S') ) {s = 5;}

                        else if ( (LA15_0=='L') ) {s = 6;}

                        else if ( (LA15_0=='!') ) {s = 7;}

                        else if ( (LA15_0=='&') ) {s = 8;}

                        else if ( (LA15_0=='|') ) {s = 9;}

                        else if ( (LA15_0=='(') ) {s = 10;}

                        else if ( (LA15_0==')') ) {s = 11;}

                        else if ( (LA15_0=='[') ) {s = 12;}

                        else if ( (LA15_0==']') ) {s = 13;}

                        else if ( (LA15_0=='P') ) {s = 14;}

                        else if ( (LA15_0=='X') ) {s = 15;}

                        else if ( (LA15_0=='F') ) {s = 16;}

                        else if ( (LA15_0=='G') ) {s = 17;}

                        else if ( (LA15_0=='>') ) {s = 18;}

                        else if ( (LA15_0=='<') ) {s = 19;}

                        else if ( (LA15_0==',') ) {s = 20;}

                        else if ( (LA15_0=='t') ) {s = 21;}

                        else if ( (LA15_0=='f') ) {s = 22;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 23;}

                        else if ( (LA15_0=='.') ) {s = 24;}

                        else if ( (LA15_0=='^') ) {s = 25;}

                        else if ( ((LA15_0>='A' && LA15_0<='E')||(LA15_0>='H' && LA15_0<='K')||(LA15_0>='M' && LA15_0<='O')||LA15_0=='Q'||LA15_0=='T'||LA15_0=='V'||(LA15_0>='Y' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='e')||(LA15_0>='g' && LA15_0<='s')||(LA15_0>='u' && LA15_0<='z')) ) {s = 26;}

                        else if ( (LA15_0=='\"') ) {s = 27;}

                        else if ( (LA15_0=='\'') ) {s = 28;}

                        else if ( (LA15_0=='/') ) {s = 29;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 30;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='#' && LA15_0<='%')||(LA15_0>='*' && LA15_0<='+')||LA15_0=='-'||(LA15_0>=':' && LA15_0<=';')||(LA15_0>='?' && LA15_0<='@')||LA15_0=='\\'||LA15_0=='`'||LA15_0=='{'||(LA15_0>='}' && LA15_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}