package de.uni_paderborn.uppaal.trace.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDiagnosticTraceLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int RULE_DEPTH=7;
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
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_EDGE=6;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=8;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__35=35;
    public static final int T__17=17;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int RULE_WS=11;

    // delegates
    // delegators

    public InternalDiagnosticTraceLexer() {;} 
    public InternalDiagnosticTraceLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDiagnosticTraceLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:11:7: ( 'Cannot reuse state space when trace length optimisation is used.' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:11:9: 'Cannot reuse state space when trace length optimisation is used.'
            {
            match("Cannot reuse state space when trace length optimisation is used."); 


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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:12:7: ( 'Verifying property' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:12:9: 'Verifying property'
            {
            match("Verifying property"); 


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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:13:7: ( 'at line' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:13:9: 'at line'
            {
            match("at line"); 


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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:14:7: ( 'Showing counter example.' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:14:9: 'Showing counter example.'
            {
            match("Showing counter example."); 


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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:15:7: ( 'Showing example trace.' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:15:9: 'Showing example trace.'
            {
            match("Showing example trace."); 


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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:16:7: ( '(' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:16:9: '('
            {
            match('('); 

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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:17:7: ( ',' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:17:9: ','
            {
            match(','); 

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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:18:7: ( ')' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:18:9: ')'
            {
            match(')'); 

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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:19:7: ( '.' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:19:9: '.'
            {
            match('.'); 

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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:20:7: ( '-' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:20:9: '-'
            {
            match('-'); 

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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:21:7: ( '[' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:21:9: '['
            {
            match('['); 

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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:22:7: ( ']' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:22:9: ']'
            {
            match(']'); 

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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:23:7: ( 'State' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:23:9: 'State'
            {
            match("State"); 


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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:24:7: ( ':' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:24:9: ':'
            {
            match(':'); 

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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:25:7: ( '->' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:25:9: '->'
            {
            match("->"); 


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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:26:7: ( 'tau' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:26:9: 'tau'
            {
            match("tau"); 


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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:27:7: ( 'Delay:' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:27:9: 'Delay:'
            {
            match("Delay:"); 


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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:28:7: ( 'Transitions:' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:28:9: 'Transitions:'
            {
            match("Transitions:"); 


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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:29:7: ( '-- Property is satisfied.' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:29:9: '-- Property is satisfied.'
            {
            match("-- Property is satisfied."); 


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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:30:7: ( '-- Property is NOT satisfied.' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:30:9: '-- Property is NOT satisfied.'
            {
            match("-- Property is NOT satisfied."); 


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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:31:7: ( '=' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:31:9: '='
            {
            match('='); 

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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:32:7: ( '<=' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:32:9: '<='
            {
            match("<="); 


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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:33:7: ( '>=' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:33:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:34:7: ( '?' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:34:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:35:7: ( '!' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:35:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "RULE_DEPTH"
    public final void mRULE_DEPTH() throws RecognitionException {
        try {
            int _type = RULE_DEPTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1070:12: ( '#depth=' RULE_INT )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1070:14: '#depth=' RULE_INT
            {
            match("#depth="); 

            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEPTH"

    // $ANTLR start "RULE_EDGE"
    public final void mRULE_EDGE() throws RecognitionException {
        try {
            int _type = RULE_EDGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1072:11: ( '{' ( options {greedy=false; } : . )* '}' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1072:13: '{' ( options {greedy=false; } : . )* '}'
            {
            match('{'); 
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1072:17: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='}') ) {
                    alt1=2;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='|')||(LA1_0>='~' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1072:45: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EDGE"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1074:10: ( ( '-' )? ( '0' .. '9' )+ )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1074:12: ( '-' )? ( '0' .. '9' )+
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1074:12: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1074:12: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1074:17: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1074:18: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1076:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1076:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1076:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1076:11: '^'
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

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1076:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1078:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1078:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1078:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1078:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1078:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1078:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1078:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1078:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1078:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1078:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1078:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1080:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1080:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1080:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1080:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1082:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1082:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1082:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1082:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1082:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1082:41: ( '\\r' )? '\\n'
                    {
                    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1082:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1082:41: '\\r'
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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1084:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1084:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1084:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1086:16: ( . )
            // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1086:18: .
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
        // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_DEPTH | RULE_EDGE | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=34;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:160: RULE_DEPTH
                {
                mRULE_DEPTH(); 

                }
                break;
            case 27 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:171: RULE_EDGE
                {
                mRULE_EDGE(); 

                }
                break;
            case 28 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:181: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 29 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:190: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 30 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:198: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 31 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:210: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 32 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:226: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:242: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 34 :
                // ../de.uni_paderborn.uppaal.trace/src-gen/de/uni_paderborn/uppaal/trace/parser/antlr/internal/InternalDiagnosticTrace.g:1:250: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\4\40\4\uffff\1\53\3\uffff\3\40\1\uffff\2\36\2\uffff\2"+
        "\36\1\uffff\1\36\1\uffff\3\36\2\uffff\1\40\1\uffff\4\40\13\uffff"+
        "\3\40\13\uffff\2\40\1\uffff\2\40\1\uffff\1\114\6\40\2\uffff\5\40"+
        "\1\131\1\uffff\5\40\3\uffff\1\40\1\uffff\2\40\1\uffff\2\40\2\uffff"+
        "\2\40\3\uffff\1\40\2\uffff\1\40\1\uffff\1\40\7\uffff";
    static final String DFA14_eofS =
        "\167\uffff";
    static final String DFA14_minS =
        "\1\0\1\141\1\145\1\164\1\150\4\uffff\1\55\3\uffff\1\141\1\145\1"+
        "\162\1\uffff\2\75\2\uffff\1\144\1\0\1\uffff\1\101\1\uffff\2\0\1"+
        "\52\2\uffff\1\156\1\uffff\1\162\1\40\1\157\1\141\5\uffff\1\40\5"+
        "\uffff\1\165\1\154\1\141\13\uffff\1\156\1\151\1\uffff\1\167\1\164"+
        "\1\120\1\60\1\141\1\156\1\157\1\146\1\151\1\145\1\162\1\uffff\1"+
        "\171\1\163\1\164\1\171\1\156\1\60\1\157\1\72\1\151\1\40\1\151\1"+
        "\147\1\uffff\1\160\1\uffff\1\164\1\uffff\1\156\1\40\1\145\1\151"+
        "\1\147\1\143\1\162\1\157\1\40\2\uffff\1\164\1\156\1\uffff\1\171"+
        "\1\163\1\40\1\72\1\151\1\uffff\1\163\1\40\1\116\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\141\1\145\2\164\4\uffff\1\76\3\uffff\1\141\1\145\1\162"+
        "\1\uffff\2\75\2\uffff\1\144\1\uffff\1\uffff\1\172\1\uffff\2\uffff"+
        "\1\57\2\uffff\1\156\1\uffff\1\162\1\40\1\157\1\141\5\uffff\1\40"+
        "\5\uffff\1\165\1\154\1\141\13\uffff\1\156\1\151\1\uffff\1\167\1"+
        "\164\1\120\1\172\1\141\1\156\1\157\1\146\1\151\1\145\1\162\1\uffff"+
        "\1\171\1\163\1\164\1\171\1\156\1\172\1\157\1\72\1\151\1\40\1\151"+
        "\1\147\1\uffff\1\160\1\uffff\1\164\1\uffff\1\156\1\40\1\145\1\151"+
        "\1\147\1\145\1\162\1\157\1\40\2\uffff\1\164\1\156\1\uffff\1\171"+
        "\1\163\1\40\1\72\1\151\1\uffff\1\163\1\40\1\163\2\uffff";
    static final String DFA14_acceptS =
        "\5\uffff\1\6\1\7\1\10\1\11\1\uffff\1\13\1\14\1\16\3\uffff\1\25"+
        "\2\uffff\1\30\1\31\2\uffff\1\34\1\uffff\1\35\3\uffff\1\41\1\42\1"+
        "\uffff\1\35\4\uffff\1\6\1\7\1\10\1\11\1\17\1\uffff\1\12\1\34\1\13"+
        "\1\14\1\16\3\uffff\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\36\1\37"+
        "\1\40\1\41\2\uffff\1\3\13\uffff\1\20\14\uffff\1\15\1\uffff\1\21"+
        "\1\uffff\1\1\11\uffff\1\4\1\5\2\uffff\1\2\5\uffff\1\22\3\uffff\1"+
        "\23\1\24";
    static final String DFA14_specialS =
        "\1\1\25\uffff\1\2\3\uffff\1\0\1\3\133\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\36\2\35\2\36\1\35\22\36\1\35\1\24\1\32\1\25\3\36\1\33\1"+
            "\5\1\7\2\36\1\6\1\11\1\10\1\34\12\27\1\14\1\36\1\21\1\20\1\22"+
            "\1\23\1\36\2\31\1\1\1\16\16\31\1\4\1\17\1\31\1\2\4\31\1\12\1"+
            "\36\1\13\1\30\1\31\1\36\1\3\22\31\1\15\6\31\1\26\uff84\36",
            "\1\37",
            "\1\41",
            "\1\42",
            "\1\43\13\uffff\1\44",
            "",
            "",
            "",
            "",
            "\1\52\2\uffff\12\54\4\uffff\1\51",
            "",
            "",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "",
            "\1\64",
            "\1\65",
            "",
            "",
            "\1\70",
            "\0\71",
            "",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\0\72",
            "\0\72",
            "\1\73\4\uffff\1\74",
            "",
            "",
            "\1\76",
            "",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "",
            "",
            "\1\103",
            "",
            "",
            "",
            "",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
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
            "\1\107",
            "\1\110",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "\1\140",
            "",
            "\1\141",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147\1\uffff\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "",
            "\1\154",
            "\1\155",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "",
            "\1\163",
            "\1\164",
            "\1\166\44\uffff\1\165",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_DEPTH | RULE_EDGE | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_26 = input.LA(1);

                        s = -1;
                        if ( ((LA14_26>='\u0000' && LA14_26<='\uFFFF')) ) {s = 58;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='C') ) {s = 1;}

                        else if ( (LA14_0=='V') ) {s = 2;}

                        else if ( (LA14_0=='a') ) {s = 3;}

                        else if ( (LA14_0=='S') ) {s = 4;}

                        else if ( (LA14_0=='(') ) {s = 5;}

                        else if ( (LA14_0==',') ) {s = 6;}

                        else if ( (LA14_0==')') ) {s = 7;}

                        else if ( (LA14_0=='.') ) {s = 8;}

                        else if ( (LA14_0=='-') ) {s = 9;}

                        else if ( (LA14_0=='[') ) {s = 10;}

                        else if ( (LA14_0==']') ) {s = 11;}

                        else if ( (LA14_0==':') ) {s = 12;}

                        else if ( (LA14_0=='t') ) {s = 13;}

                        else if ( (LA14_0=='D') ) {s = 14;}

                        else if ( (LA14_0=='T') ) {s = 15;}

                        else if ( (LA14_0=='=') ) {s = 16;}

                        else if ( (LA14_0=='<') ) {s = 17;}

                        else if ( (LA14_0=='>') ) {s = 18;}

                        else if ( (LA14_0=='?') ) {s = 19;}

                        else if ( (LA14_0=='!') ) {s = 20;}

                        else if ( (LA14_0=='#') ) {s = 21;}

                        else if ( (LA14_0=='{') ) {s = 22;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 23;}

                        else if ( (LA14_0=='^') ) {s = 24;}

                        else if ( ((LA14_0>='A' && LA14_0<='B')||(LA14_0>='E' && LA14_0<='R')||LA14_0=='U'||(LA14_0>='W' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='b' && LA14_0<='s')||(LA14_0>='u' && LA14_0<='z')) ) {s = 25;}

                        else if ( (LA14_0=='\"') ) {s = 26;}

                        else if ( (LA14_0=='\'') ) {s = 27;}

                        else if ( (LA14_0=='/') ) {s = 28;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 29;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='$' && LA14_0<='&')||(LA14_0>='*' && LA14_0<='+')||LA14_0==';'||LA14_0=='@'||LA14_0=='\\'||LA14_0=='`'||(LA14_0>='|' && LA14_0<='\uFFFF')) ) {s = 30;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_22 = input.LA(1);

                        s = -1;
                        if ( ((LA14_22>='\u0000' && LA14_22<='\uFFFF')) ) {s = 57;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_27 = input.LA(1);

                        s = -1;
                        if ( ((LA14_27>='\u0000' && LA14_27<='\uFFFF')) ) {s = 58;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}