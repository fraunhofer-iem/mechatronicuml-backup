package org.muml.pm.software.oslanguage.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOperatingSystemLanguageLexer extends Lexer {
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_NUMBER=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalOperatingSystemLanguageLexer() {;} 
    public InternalOperatingSystemLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalOperatingSystemLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalOperatingSystemLanguage.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOperatingSystemLanguage.g:11:7: ( 'DAYS' )
            // InternalOperatingSystemLanguage.g:11:9: 'DAYS'
            {
            match("DAYS"); 


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
            // InternalOperatingSystemLanguage.g:12:7: ( 'HOURS' )
            // InternalOperatingSystemLanguage.g:12:9: 'HOURS'
            {
            match("HOURS"); 


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
            // InternalOperatingSystemLanguage.g:13:7: ( 'MILLISECONDS' )
            // InternalOperatingSystemLanguage.g:13:9: 'MILLISECONDS'
            {
            match("MILLISECONDS"); 


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
            // InternalOperatingSystemLanguage.g:14:7: ( 'MINUTES' )
            // InternalOperatingSystemLanguage.g:14:9: 'MINUTES'
            {
            match("MINUTES"); 


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
            // InternalOperatingSystemLanguage.g:15:7: ( 'SECONDS' )
            // InternalOperatingSystemLanguage.g:15:9: 'SECONDS'
            {
            match("SECONDS"); 


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
            // InternalOperatingSystemLanguage.g:16:7: ( 'MICROSECONDS' )
            // InternalOperatingSystemLanguage.g:16:9: 'MICROSECONDS'
            {
            match("MICROSECONDS"); 


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
            // InternalOperatingSystemLanguage.g:17:7: ( 'NANOSECONDS' )
            // InternalOperatingSystemLanguage.g:17:9: 'NANOSECONDS'
            {
            match("NANOSECONDS"); 


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
            // InternalOperatingSystemLanguage.g:18:7: ( 'null' )
            // InternalOperatingSystemLanguage.g:18:9: 'null'
            {
            match("null"); 


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
            // InternalOperatingSystemLanguage.g:19:7: ( 'OperatingSystem:' )
            // InternalOperatingSystemLanguage.g:19:9: 'OperatingSystem:'
            {
            match("OperatingSystem:"); 


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
            // InternalOperatingSystemLanguage.g:20:7: ( '{' )
            // InternalOperatingSystemLanguage.g:20:9: '{'
            {
            match('{'); 

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
            // InternalOperatingSystemLanguage.g:21:7: ( '}' )
            // InternalOperatingSystemLanguage.g:21:9: '}'
            {
            match('}'); 

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
            // InternalOperatingSystemLanguage.g:22:7: ( 'import' )
            // InternalOperatingSystemLanguage.g:22:9: 'import'
            {
            match("import"); 


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
            // InternalOperatingSystemLanguage.g:23:7: ( 'Device_API_Calls:' )
            // InternalOperatingSystemLanguage.g:23:9: 'Device_API_Calls:'
            {
            match("Device_API_Calls:"); 


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
            // InternalOperatingSystemLanguage.g:24:7: ( 'enum:' )
            // InternalOperatingSystemLanguage.g:24:9: 'enum:'
            {
            match("enum:"); 


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
            // InternalOperatingSystemLanguage.g:25:7: ( ',' )
            // InternalOperatingSystemLanguage.g:25:9: ','
            {
            match(','); 

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
            // InternalOperatingSystemLanguage.g:26:7: ( '(' )
            // InternalOperatingSystemLanguage.g:26:9: '('
            {
            match('('); 

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
            // InternalOperatingSystemLanguage.g:27:7: ( ')' )
            // InternalOperatingSystemLanguage.g:27:9: ')'
            {
            match(')'); 

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
            // InternalOperatingSystemLanguage.g:28:7: ( ';' )
            // InternalOperatingSystemLanguage.g:28:9: ';'
            {
            match(';'); 

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
            // InternalOperatingSystemLanguage.g:29:7: ( '[' )
            // InternalOperatingSystemLanguage.g:29:9: '['
            {
            match('['); 

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
            // InternalOperatingSystemLanguage.g:30:7: ( ']' )
            // InternalOperatingSystemLanguage.g:30:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOperatingSystemLanguage.g:2237:13: ( RULE_INT '.' RULE_INT )
            // InternalOperatingSystemLanguage.g:2237:15: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOperatingSystemLanguage.g:2239:14: ( ( 'true' | 'false' ) )
            // InternalOperatingSystemLanguage.g:2239:16: ( 'true' | 'false' )
            {
            // InternalOperatingSystemLanguage.g:2239:16: ( 'true' | 'false' )
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
                    // InternalOperatingSystemLanguage.g:2239:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalOperatingSystemLanguage.g:2239:24: 'false'
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
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOperatingSystemLanguage.g:2241:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalOperatingSystemLanguage.g:2241:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalOperatingSystemLanguage.g:2241:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalOperatingSystemLanguage.g:2241:11: '^'
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

            // InternalOperatingSystemLanguage.g:2241:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalOperatingSystemLanguage.g:
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
            	    break loop3;
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
            // InternalOperatingSystemLanguage.g:2243:10: ( ( '0' .. '9' )+ )
            // InternalOperatingSystemLanguage.g:2243:12: ( '0' .. '9' )+
            {
            // InternalOperatingSystemLanguage.g:2243:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOperatingSystemLanguage.g:2243:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
            // InternalOperatingSystemLanguage.g:2245:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalOperatingSystemLanguage.g:2245:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalOperatingSystemLanguage.g:2245:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalOperatingSystemLanguage.g:2245:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalOperatingSystemLanguage.g:2245:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalOperatingSystemLanguage.g:2245:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOperatingSystemLanguage.g:2245:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalOperatingSystemLanguage.g:2245:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalOperatingSystemLanguage.g:2245:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalOperatingSystemLanguage.g:2245:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalOperatingSystemLanguage.g:2245:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop6;
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
            // InternalOperatingSystemLanguage.g:2247:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalOperatingSystemLanguage.g:2247:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalOperatingSystemLanguage.g:2247:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOperatingSystemLanguage.g:2247:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalOperatingSystemLanguage.g:2249:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalOperatingSystemLanguage.g:2249:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalOperatingSystemLanguage.g:2249:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOperatingSystemLanguage.g:2249:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop9;
                }
            } while (true);

            // InternalOperatingSystemLanguage.g:2249:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOperatingSystemLanguage.g:2249:41: ( '\\r' )? '\\n'
                    {
                    // InternalOperatingSystemLanguage.g:2249:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalOperatingSystemLanguage.g:2249:41: '\\r'
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
            // InternalOperatingSystemLanguage.g:2251:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalOperatingSystemLanguage.g:2251:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalOperatingSystemLanguage.g:2251:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOperatingSystemLanguage.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
            // InternalOperatingSystemLanguage.g:2253:16: ( . )
            // InternalOperatingSystemLanguage.g:2253:18: .
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
        // InternalOperatingSystemLanguage.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_NUMBER | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=29;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalOperatingSystemLanguage.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalOperatingSystemLanguage.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalOperatingSystemLanguage.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalOperatingSystemLanguage.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalOperatingSystemLanguage.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalOperatingSystemLanguage.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalOperatingSystemLanguage.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalOperatingSystemLanguage.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalOperatingSystemLanguage.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalOperatingSystemLanguage.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalOperatingSystemLanguage.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalOperatingSystemLanguage.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalOperatingSystemLanguage.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalOperatingSystemLanguage.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalOperatingSystemLanguage.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalOperatingSystemLanguage.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalOperatingSystemLanguage.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalOperatingSystemLanguage.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalOperatingSystemLanguage.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalOperatingSystemLanguage.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalOperatingSystemLanguage.g:1:130: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 22 :
                // InternalOperatingSystemLanguage.g:1:142: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 23 :
                // InternalOperatingSystemLanguage.g:1:155: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 24 :
                // InternalOperatingSystemLanguage.g:1:163: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 25 :
                // InternalOperatingSystemLanguage.g:1:172: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 26 :
                // InternalOperatingSystemLanguage.g:1:184: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 27 :
                // InternalOperatingSystemLanguage.g:1:200: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 28 :
                // InternalOperatingSystemLanguage.g:1:216: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 29 :
                // InternalOperatingSystemLanguage.g:1:224: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\7\36\2\uffff\2\36\6\uffff\1\57\2\36\1\33\1\uffff\3\33\2\uffff\2\36\1\uffff\6\36\2\uffff\2\36\10\uffff\1\57\2\36\4\uffff\16\36\1\124\7\36\1\134\3\36\1\140\1\36\1\uffff\1\36\1\143\5\36\1\uffff\2\36\2\uffff\1\140\1\36\1\uffff\6\36\1\162\2\36\1\165\1\36\1\167\2\36\1\uffff\2\36\1\uffff\1\36\1\uffff\17\36\1\u008c\2\36\1\u008f\1\u0090\1\uffff\2\36\2\uffff\6\36\2\uffff";
    static final String DFA13_eofS =
        "\u0099\uffff";
    static final String DFA13_minS =
        "\1\0\1\101\1\117\1\111\1\105\1\101\1\165\1\160\2\uffff\1\155\1\156\6\uffff\1\56\1\162\1\141\1\101\1\uffff\2\0\1\52\2\uffff\1\131\1\166\1\uffff\1\125\2\103\1\116\1\154\1\145\2\uffff\1\160\1\165\10\uffff\1\56\1\165\1\154\4\uffff\1\123\1\151\1\122\1\114\1\125\1\122\2\117\1\154\1\162\1\157\1\155\1\145\1\163\1\60\1\143\1\123\1\111\1\124\1\117\1\116\1\123\1\60\1\141\1\162\1\72\1\60\1\145\1\uffff\1\145\1\60\1\123\1\105\1\123\1\104\1\105\1\uffff\2\164\2\uffff\1\60\1\137\1\uffff\1\105\1\123\1\105\1\123\1\103\1\151\1\60\1\101\1\103\1\60\1\103\1\60\1\117\1\156\1\uffff\1\120\1\117\1\uffff\1\117\1\uffff\1\116\1\147\1\111\2\116\1\104\1\123\1\137\2\104\1\123\1\171\1\103\2\123\1\60\1\163\1\141\2\60\1\uffff\1\164\1\154\2\uffff\1\145\1\154\1\155\1\163\2\72\2\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\145\1\117\1\111\1\105\1\101\1\165\1\160\2\uffff\1\155\1\156\6\uffff\1\71\1\162\1\141\1\172\1\uffff\2\uffff\1\57\2\uffff\1\131\1\166\1\uffff\1\125\1\116\1\103\1\116\1\154\1\145\2\uffff\1\160\1\165\10\uffff\1\71\1\165\1\154\4\uffff\1\123\1\151\1\122\1\114\1\125\1\122\2\117\1\154\1\162\1\157\1\155\1\145\1\163\1\172\1\143\1\123\1\111\1\124\1\117\1\116\1\123\1\172\1\141\1\162\1\72\1\172\1\145\1\uffff\1\145\1\172\1\123\1\105\1\123\1\104\1\105\1\uffff\2\164\2\uffff\1\172\1\137\1\uffff\1\105\1\123\1\105\1\123\1\103\1\151\1\172\1\101\1\103\1\172\1\103\1\172\1\117\1\156\1\uffff\1\120\1\117\1\uffff\1\117\1\uffff\1\116\1\147\1\111\2\116\1\104\1\123\1\137\2\104\1\123\1\171\1\103\2\123\1\172\1\163\1\141\2\172\1\uffff\1\164\1\154\2\uffff\1\145\1\154\1\155\1\163\2\72\2\uffff";
    static final String DFA13_acceptS =
        "\10\uffff\1\12\1\13\2\uffff\1\17\1\20\1\21\1\22\1\23\1\24\4\uffff\1\27\3\uffff\1\34\1\35\2\uffff\1\27\6\uffff\1\12\1\13\2\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\30\1\25\3\uffff\1\31\1\32\1\33\1\34\34\uffff\1\1\7\uffff\1\10\2\uffff\1\16\1\26\2\uffff\1\2\16\uffff\1\14\2\uffff\1\4\1\uffff\1\5\24\uffff\1\7\2\uffff\1\3\1\6\6\uffff\1\11\1\15";
    static final String DFA13_specialS =
        "\1\2\26\uffff\1\1\1\0\u0080\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\33\2\32\2\33\1\32\22\33\1\32\1\33\1\27\4\33\1\30\1\15\1\16\2\33\1\14\2\33\1\31\12\22\1\33\1\17\5\33\3\26\1\1\3\26\1\2\4\26\1\3\1\5\1\7\3\26\1\4\7\26\1\20\1\33\1\21\1\25\1\26\1\33\4\26\1\13\1\24\2\26\1\12\4\26\1\6\5\26\1\23\6\26\1\10\1\33\1\11\uff82\33",
            "\1\34\43\uffff\1\35",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "",
            "",
            "\1\47",
            "\1\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60\1\uffff\12\61",
            "\1\62",
            "\1\63",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\0\64",
            "\0\64",
            "\1\65\4\uffff\1\66",
            "",
            "",
            "\1\70",
            "\1\71",
            "",
            "\1\72",
            "\1\75\10\uffff\1\73\1\uffff\1\74",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "",
            "",
            "\1\102",
            "\1\103",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\60\1\uffff\12\61",
            "\1\104",
            "\1\105",
            "",
            "",
            "",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\141",
            "",
            "\1\142",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "\1\151",
            "\1\152",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\163",
            "\1\164",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\166",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\170",
            "\1\171",
            "",
            "\1\172",
            "\1\173",
            "",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\u008d",
            "\1\u008e",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\u0091",
            "\1\u0092",
            "",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    static class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | RULE_NUMBER | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_24 = input.LA(1);

                        s = -1;
                        if ( ((LA13_24>='\u0000' && LA13_24<='\uFFFF')) ) {s = 52;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_23 = input.LA(1);

                        s = -1;
                        if ( ((LA13_23>='\u0000' && LA13_23<='\uFFFF')) ) {s = 52;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='D') ) {s = 1;}

                        else if ( (LA13_0=='H') ) {s = 2;}

                        else if ( (LA13_0=='M') ) {s = 3;}

                        else if ( (LA13_0=='S') ) {s = 4;}

                        else if ( (LA13_0=='N') ) {s = 5;}

                        else if ( (LA13_0=='n') ) {s = 6;}

                        else if ( (LA13_0=='O') ) {s = 7;}

                        else if ( (LA13_0=='{') ) {s = 8;}

                        else if ( (LA13_0=='}') ) {s = 9;}

                        else if ( (LA13_0=='i') ) {s = 10;}

                        else if ( (LA13_0=='e') ) {s = 11;}

                        else if ( (LA13_0==',') ) {s = 12;}

                        else if ( (LA13_0=='(') ) {s = 13;}

                        else if ( (LA13_0==')') ) {s = 14;}

                        else if ( (LA13_0==';') ) {s = 15;}

                        else if ( (LA13_0=='[') ) {s = 16;}

                        else if ( (LA13_0==']') ) {s = 17;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 18;}

                        else if ( (LA13_0=='t') ) {s = 19;}

                        else if ( (LA13_0=='f') ) {s = 20;}

                        else if ( (LA13_0=='^') ) {s = 21;}

                        else if ( ((LA13_0>='A' && LA13_0<='C')||(LA13_0>='E' && LA13_0<='G')||(LA13_0>='I' && LA13_0<='L')||(LA13_0>='P' && LA13_0<='R')||(LA13_0>='T' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='d')||(LA13_0>='g' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='m')||(LA13_0>='o' && LA13_0<='s')||(LA13_0>='u' && LA13_0<='z')) ) {s = 22;}

                        else if ( (LA13_0=='\"') ) {s = 23;}

                        else if ( (LA13_0=='\'') ) {s = 24;}

                        else if ( (LA13_0=='/') ) {s = 25;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 26;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='*' && LA13_0<='+')||(LA13_0>='-' && LA13_0<='.')||LA13_0==':'||(LA13_0>='<' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}