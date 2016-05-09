package org.muml.graphviz.dot.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotLanguageLexer extends Lexer {
    public static final int RULE_STRING=9;
    public static final int RULE_NUMPREFIXEDID=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=7;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_DOTSTRINGTERM=4;
    public static final int RULE_ID=6;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalDotLanguageLexer() {;} 
    public InternalDotLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDotLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDotLanguage.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotLanguage.g:11:7: ( 'digraph' )
            // InternalDotLanguage.g:11:9: 'digraph'
            {
            match("digraph"); 


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
            // InternalDotLanguage.g:12:7: ( 'graph' )
            // InternalDotLanguage.g:12:9: 'graph'
            {
            match("graph"); 


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
            // InternalDotLanguage.g:13:7: ( '{' )
            // InternalDotLanguage.g:13:9: '{'
            {
            match('{'); 

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
            // InternalDotLanguage.g:14:7: ( '[' )
            // InternalDotLanguage.g:14:9: '['
            {
            match('['); 

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
            // InternalDotLanguage.g:15:7: ( ',' )
            // InternalDotLanguage.g:15:9: ','
            {
            match(','); 

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
            // InternalDotLanguage.g:16:7: ( ']' )
            // InternalDotLanguage.g:16:9: ']'
            {
            match(']'); 

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
            // InternalDotLanguage.g:17:7: ( ';' )
            // InternalDotLanguage.g:17:9: ';'
            {
            match(';'); 

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
            // InternalDotLanguage.g:18:7: ( 'node' )
            // InternalDotLanguage.g:18:9: 'node'
            {
            match("node"); 


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
            // InternalDotLanguage.g:19:7: ( 'edge' )
            // InternalDotLanguage.g:19:9: 'edge'
            {
            match("edge"); 


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
            // InternalDotLanguage.g:20:7: ( '}' )
            // InternalDotLanguage.g:20:9: '}'
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
            // InternalDotLanguage.g:21:7: ( 'subgraph' )
            // InternalDotLanguage.g:21:9: 'subgraph'
            {
            match("subgraph"); 


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
            // InternalDotLanguage.g:22:7: ( '->' )
            // InternalDotLanguage.g:22:9: '->'
            {
            match("->"); 


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
            // InternalDotLanguage.g:23:7: ( '--' )
            // InternalDotLanguage.g:23:9: '--'
            {
            match("--"); 


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
            // InternalDotLanguage.g:24:7: ( '=' )
            // InternalDotLanguage.g:24:9: '='
            {
            match('='); 

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
            // InternalDotLanguage.g:25:7: ( '-' )
            // InternalDotLanguage.g:25:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "RULE_NUMPREFIXEDID"
    public final void mRULE_NUMPREFIXEDID() throws RecognitionException {
        try {
            int _type = RULE_NUMPREFIXEDID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotLanguage.g:1186:20: ( RULE_INT RULE_ID )
            // InternalDotLanguage.g:1186:22: RULE_INT RULE_ID
            {
            mRULE_INT(); 
            mRULE_ID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMPREFIXEDID"

    // $ANTLR start "RULE_DOTSTRINGTERM"
    public final void mRULE_DOTSTRINGTERM() throws RecognitionException {
        try {
            int _type = RULE_DOTSTRINGTERM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotLanguage.g:1188:20: ( '\"' (~ ( '\"' ) )* '\"' )
            // InternalDotLanguage.g:1188:22: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // InternalDotLanguage.g:1188:26: (~ ( '\"' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDotLanguage.g:1188:26: ~ ( '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOTSTRINGTERM"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotLanguage.g:1190:13: ( ( RULE_INT )+ '.' ( RULE_INT )+ )
            // InternalDotLanguage.g:1190:15: ( RULE_INT )+ '.' ( RULE_INT )+
            {
            // InternalDotLanguage.g:1190:15: ( RULE_INT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDotLanguage.g:1190:15: RULE_INT
            	    {
            	    mRULE_INT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('.'); 
            // InternalDotLanguage.g:1190:29: ( RULE_INT )+
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
            	    // InternalDotLanguage.g:1190:29: RULE_INT
            	    {
            	    mRULE_INT(); 

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
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDotLanguage.g:1192:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalDotLanguage.g:1192:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalDotLanguage.g:1192:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDotLanguage.g:1192:11: '^'
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

            // InternalDotLanguage.g:1192:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDotLanguage.g:
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
            // InternalDotLanguage.g:1194:10: ( ( '0' .. '9' )+ )
            // InternalDotLanguage.g:1194:12: ( '0' .. '9' )+
            {
            // InternalDotLanguage.g:1194:12: ( '0' .. '9' )+
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
            	    // InternalDotLanguage.g:1194:13: '0' .. '9'
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
            // InternalDotLanguage.g:1196:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalDotLanguage.g:1196:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalDotLanguage.g:1196:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalDotLanguage.g:1196:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalDotLanguage.g:1196:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalDotLanguage.g:1196:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDotLanguage.g:1196:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalDotLanguage.g:1196:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalDotLanguage.g:1196:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalDotLanguage.g:1196:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDotLanguage.g:1196:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalDotLanguage.g:1198:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDotLanguage.g:1198:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDotLanguage.g:1198:24: ( options {greedy=false; } : . )*
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
            	    // InternalDotLanguage.g:1198:52: .
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
            // InternalDotLanguage.g:1200:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDotLanguage.g:1200:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDotLanguage.g:1200:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDotLanguage.g:1200:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalDotLanguage.g:1200:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDotLanguage.g:1200:41: ( '\\r' )? '\\n'
                    {
                    // InternalDotLanguage.g:1200:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalDotLanguage.g:1200:41: '\\r'
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
            // InternalDotLanguage.g:1202:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDotLanguage.g:1202:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDotLanguage.g:1202:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalDotLanguage.g:
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
            // InternalDotLanguage.g:1204:16: ( . )
            // InternalDotLanguage.g:1204:18: .
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
        // InternalDotLanguage.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_NUMPREFIXEDID | RULE_DOTSTRINGTERM | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=25;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalDotLanguage.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalDotLanguage.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalDotLanguage.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalDotLanguage.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalDotLanguage.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalDotLanguage.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalDotLanguage.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalDotLanguage.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalDotLanguage.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalDotLanguage.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalDotLanguage.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalDotLanguage.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalDotLanguage.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalDotLanguage.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalDotLanguage.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalDotLanguage.g:1:100: RULE_NUMPREFIXEDID
                {
                mRULE_NUMPREFIXEDID(); 

                }
                break;
            case 17 :
                // InternalDotLanguage.g:1:119: RULE_DOTSTRINGTERM
                {
                mRULE_DOTSTRINGTERM(); 

                }
                break;
            case 18 :
                // InternalDotLanguage.g:1:138: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 19 :
                // InternalDotLanguage.g:1:150: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // InternalDotLanguage.g:1:158: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 21 :
                // InternalDotLanguage.g:1:167: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // InternalDotLanguage.g:1:179: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // InternalDotLanguage.g:1:195: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // InternalDotLanguage.g:1:211: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // InternalDotLanguage.g:1:219: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\2\27\5\uffff\2\27\1\uffff\1\27\1\44\1\uffff\1\46\2\25\1\uffff\2\25\2\uffff\1\27\1\uffff\1\27\5\uffff\2\27\1\uffff\1\27\6\uffff\1\46\10\uffff\5\27\1\70\2\uffff\2\27\1\100\1\101\2\27\1\104\2\uffff\2\27\1\uffff\1\27\1\110\1\27\1\uffff\1\112\1\uffff";
    static final String DFA15_eofS =
        "\113\uffff";
    static final String DFA15_minS =
        "\1\0\1\151\1\162\5\uffff\1\157\1\144\1\uffff\1\165\1\55\1\uffff\1\56\1\0\1\101\1\uffff\1\0\1\52\2\uffff\1\147\1\uffff\1\141\5\uffff\1\144\1\147\1\uffff\1\142\6\uffff\1\56\1\uffff\2\0\5\uffff\1\162\1\160\2\145\1\147\2\0\1\uffff\1\141\1\150\2\60\1\162\1\160\1\60\2\uffff\1\141\1\150\1\uffff\1\160\1\60\1\150\1\uffff\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\151\1\162\5\uffff\1\157\1\144\1\uffff\1\165\1\76\1\uffff\1\172\1\uffff\1\172\1\uffff\1\uffff\1\57\2\uffff\1\147\1\uffff\1\141\5\uffff\1\144\1\147\1\uffff\1\142\6\uffff\1\172\1\uffff\2\uffff\5\uffff\1\162\1\160\2\145\1\147\2\uffff\1\uffff\1\141\1\150\2\172\1\162\1\160\1\172\2\uffff\1\141\1\150\1\uffff\1\160\1\172\1\150\1\uffff\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\2\uffff\1\12\2\uffff\1\16\3\uffff\1\23\2\uffff\1\30\1\31\1\uffff\1\23\1\uffff\1\3\1\4\1\5\1\6\1\7\2\uffff\1\12\1\uffff\1\14\1\15\1\17\1\16\1\24\1\20\1\uffff\1\22\2\uffff\1\21\1\25\1\26\1\27\1\30\7\uffff\1\21\7\uffff\1\10\1\11\2\uffff\1\2\3\uffff\1\1\1\uffff\1\13";
    static final String DFA15_specialS =
        "\1\1\16\uffff\1\3\2\uffff\1\4\27\uffff\1\0\1\6\12\uffff\1\2\1\5\23\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\17\4\25\1\22\4\25\1\5\1\14\1\25\1\23\12\16\1\25\1\7\1\25\1\15\3\25\32\21\1\4\1\25\1\6\1\20\1\21\1\25\3\21\1\1\1\11\1\21\1\2\6\21\1\10\4\21\1\13\7\21\1\3\1\25\1\12\uff82\25",
            "\1\26",
            "\1\30",
            "",
            "",
            "",
            "",
            "",
            "\1\36",
            "\1\37",
            "",
            "\1\41",
            "\1\43\20\uffff\1\42",
            "",
            "\1\51\1\uffff\12\50\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\42\53\1\54\71\53\1\52\uffa3\53",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\0\55",
            "\1\56\4\uffff\1\57",
            "",
            "",
            "\1\61",
            "",
            "\1\62",
            "",
            "",
            "",
            "",
            "",
            "\1\63",
            "\1\64",
            "",
            "\1\65",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\51\1\uffff\12\50\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "",
            "\42\67\1\66\uffdd\67",
            "\42\53\1\54\71\53\1\52\uffa3\53",
            "",
            "",
            "",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\0\55",
            "\42\53\1\54\71\53\1\52\uffa3\53",
            "",
            "\1\76",
            "\1\77",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\102",
            "\1\103",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\1\105",
            "\1\106",
            "",
            "\1\107",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\111",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
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

    static class DFA15 extends DFA {

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
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | RULE_NUMPREFIXEDID | RULE_DOTSTRINGTERM | RULE_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_42 = input.LA(1);

                        s = -1;
                        if ( (LA15_42=='\"') ) {s = 54;}

                        else if ( ((LA15_42>='\u0000' && LA15_42<='!')||(LA15_42>='#' && LA15_42<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='d') ) {s = 1;}

                        else if ( (LA15_0=='g') ) {s = 2;}

                        else if ( (LA15_0=='{') ) {s = 3;}

                        else if ( (LA15_0=='[') ) {s = 4;}

                        else if ( (LA15_0==',') ) {s = 5;}

                        else if ( (LA15_0==']') ) {s = 6;}

                        else if ( (LA15_0==';') ) {s = 7;}

                        else if ( (LA15_0=='n') ) {s = 8;}

                        else if ( (LA15_0=='e') ) {s = 9;}

                        else if ( (LA15_0=='}') ) {s = 10;}

                        else if ( (LA15_0=='s') ) {s = 11;}

                        else if ( (LA15_0=='-') ) {s = 12;}

                        else if ( (LA15_0=='=') ) {s = 13;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 14;}

                        else if ( (LA15_0=='\"') ) {s = 15;}

                        else if ( (LA15_0=='^') ) {s = 16;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='c')||LA15_0=='f'||(LA15_0>='h' && LA15_0<='m')||(LA15_0>='o' && LA15_0<='r')||(LA15_0>='t' && LA15_0<='z')) ) {s = 17;}

                        else if ( (LA15_0=='\'') ) {s = 18;}

                        else if ( (LA15_0=='/') ) {s = 19;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 20;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='+')||LA15_0=='.'||LA15_0==':'||LA15_0=='<'||(LA15_0>='>' && LA15_0<='@')||LA15_0=='\\'||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_54 = input.LA(1);

                        s = -1;
                        if ( ((LA15_54>='\u0000' && LA15_54<='\uFFFF')) ) {s = 45;}

                        else s = 56;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_15 = input.LA(1);

                        s = -1;
                        if ( (LA15_15=='\\') ) {s = 42;}

                        else if ( ((LA15_15>='\u0000' && LA15_15<='!')||(LA15_15>='#' && LA15_15<='[')||(LA15_15>=']' && LA15_15<='\uFFFF')) ) {s = 43;}

                        else if ( (LA15_15=='\"') ) {s = 44;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_18 = input.LA(1);

                        s = -1;
                        if ( ((LA15_18>='\u0000' && LA15_18<='\uFFFF')) ) {s = 45;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_55 = input.LA(1);

                        s = -1;
                        if ( (LA15_55=='\"') ) {s = 44;}

                        else if ( (LA15_55=='\\') ) {s = 42;}

                        else if ( ((LA15_55>='\u0000' && LA15_55<='!')||(LA15_55>='#' && LA15_55<='[')||(LA15_55>=']' && LA15_55<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_43 = input.LA(1);

                        s = -1;
                        if ( (LA15_43=='\"') ) {s = 44;}

                        else if ( (LA15_43=='\\') ) {s = 42;}

                        else if ( ((LA15_43>='\u0000' && LA15_43<='!')||(LA15_43>='#' && LA15_43<='[')||(LA15_43>=']' && LA15_43<='\uFFFF')) ) {s = 43;}

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