package de.uni_paderborn.fujaba.graphviz.dot.xtext.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotLanguageLexer extends Lexer {
    public static final int RULE_ID=7;
    public static final int RULE_NUMPREFIXEDID=5;
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
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_STRING=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=11;
    public static final int RULE_DOTSTRINGTERM=4;

    // delegates
    // delegators

    public InternalDotLanguageLexer() {;} 
    public InternalDotLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDotLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:11:7: ( 'graph' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:11:9: 'graph'
            {
            match("graph"); 


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
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:12:7: ( '--' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:12:9: '--'
            {
            match("--"); 


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
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:13:7: ( '->' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:13:9: '->'
            {
            match("->"); 


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
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:14:7: ( '{' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:14:9: '{'
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
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:15:7: ( '}' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:15:9: '}'
            {
            match('}'); 

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
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:16:7: ( 'subgraph' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:16:9: 'subgraph'
            {
            match("subgraph"); 


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
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:17:7: ( '[' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:17:9: '['
            {
            match('['); 

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
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:18:7: ( ']' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:18:9: ']'
            {
            match(']'); 

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
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:19:7: ( ';' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:19:9: ';'
            {
            match(';'); 

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
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:20:7: ( ',' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:20:9: ','
            {
            match(','); 

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
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:21:7: ( 'node' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:21:9: 'node'
            {
            match("node"); 


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
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:22:7: ( 'edge' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:22:9: 'edge'
            {
            match("edge"); 


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
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:23:7: ( '=' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:23:9: '='
            {
            match('='); 

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
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:24:7: ( 'digraph' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:24:9: 'digraph'
            {
            match("digraph"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "RULE_NUMPREFIXEDID"
    public final void mRULE_NUMPREFIXEDID() throws RecognitionException {
        try {
            int _type = RULE_NUMPREFIXEDID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2463:20: ( RULE_INT RULE_ID )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2463:22: RULE_INT RULE_ID
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
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2465:20: ( '\"' (~ ( '\"' ) )* '\"' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2465:22: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2465:26: (~ ( '\"' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2465:26: ~ ( '\"' )
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2467:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2467:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2467:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2467:11: '^'
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

            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2467:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:
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
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2469:10: ( ( '0' .. '9' )+ )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2469:12: ( '0' .. '9' )+
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2469:12: ( '0' .. '9' )+
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
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2469:13: '0' .. '9'
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
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2471:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2471:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2471:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2471:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2471:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2471:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2471:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2471:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2471:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2471:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2471:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2473:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2473:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2473:24: ( options {greedy=false; } : . )*
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
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2473:52: .
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
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2475:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2475:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2475:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2475:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2475:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2475:41: ( '\\r' )? '\\n'
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2475:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2475:41: '\\r'
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
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2477:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2477:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2477:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:
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
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2479:16: ( . )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2479:18: .
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
        // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_NUMPREFIXEDID | RULE_DOTSTRINGTERM | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=23;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:94: RULE_NUMPREFIXEDID
                {
                mRULE_NUMPREFIXEDID(); 

                }
                break;
            case 16 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:113: RULE_DOTSTRINGTERM
                {
                mRULE_DOTSTRINGTERM(); 

                }
                break;
            case 17 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:132: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:140: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 19 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:149: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:161: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 21 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:177: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 22 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:193: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 23 :
                // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1:201: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\27\1\25\2\uffff\1\27\4\uffff\2\27\1\uffff\1\27\1\45\2"+
        "\25\1\uffff\2\25\2\uffff\1\27\5\uffff\1\27\4\uffff\2\27\1\uffff"+
        "\1\27\1\uffff\1\45\10\uffff\5\27\1\66\2\uffff\2\27\1\76\1\77\1\27"+
        "\1\101\1\27\2\uffff\1\27\1\uffff\3\27\1\107\1\110\2\uffff";
    static final String DFA13_eofS =
        "\111\uffff";
    static final String DFA13_minS =
        "\1\0\1\162\1\55\2\uffff\1\165\4\uffff\1\157\1\144\1\uffff\1\151"+
        "\1\60\1\0\1\101\1\uffff\1\0\1\52\2\uffff\1\141\5\uffff\1\142\4\uffff"+
        "\1\144\1\147\1\uffff\1\147\1\uffff\1\60\1\uffff\1\0\1\uffff\1\0"+
        "\4\uffff\1\160\1\147\2\145\1\162\2\0\1\uffff\1\150\1\162\2\60\1"+
        "\141\1\60\1\141\2\uffff\1\160\1\uffff\1\160\2\150\2\60\2\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\162\1\76\2\uffff\1\165\4\uffff\1\157\1\144\1\uffff\1"+
        "\151\1\172\1\uffff\1\172\1\uffff\1\uffff\1\57\2\uffff\1\141\5\uffff"+
        "\1\142\4\uffff\1\144\1\147\1\uffff\1\147\1\uffff\1\172\1\uffff\1"+
        "\uffff\1\uffff\1\uffff\4\uffff\1\160\1\147\2\145\1\162\2\uffff\1"+
        "\uffff\1\150\1\162\2\172\1\141\1\172\1\141\2\uffff\1\160\1\uffff"+
        "\1\160\2\150\2\172\2\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\4\1\5\1\uffff\1\7\1\10\1\11\1\12\2\uffff\1\15\4\uffff"+
        "\1\21\2\uffff\1\26\1\27\1\uffff\1\21\1\2\1\3\1\4\1\5\1\uffff\1\7"+
        "\1\10\1\11\1\12\2\uffff\1\15\1\uffff\1\22\1\uffff\1\17\1\uffff\1"+
        "\20\1\uffff\1\23\1\24\1\25\1\26\7\uffff\1\20\7\uffff\1\13\1\14\1"+
        "\uffff\1\1\5\uffff\1\16\1\6";
    static final String DFA13_specialS =
        "\1\0\16\uffff\1\2\2\uffff\1\6\25\uffff\1\5\1\uffff\1\3\11\uffff"+
        "\1\1\1\4\23\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\17\4\25\1\22\4\25\1"+
            "\11\1\2\1\25\1\23\12\16\1\25\1\10\1\25\1\14\3\25\32\21\1\6\1"+
            "\25\1\7\1\20\1\21\1\25\3\21\1\15\1\13\1\21\1\1\6\21\1\12\4\21"+
            "\1\5\7\21\1\3\1\25\1\4\uff82\25",
            "\1\26",
            "\1\30\20\uffff\1\31",
            "",
            "",
            "\1\34",
            "",
            "",
            "",
            "",
            "\1\41",
            "\1\42",
            "",
            "\1\44",
            "\12\46\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "\42\52\1\51\71\52\1\50\uffa3\52",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\0\53",
            "\1\54\4\uffff\1\55",
            "",
            "",
            "\1\57",
            "",
            "",
            "",
            "",
            "",
            "\1\60",
            "",
            "",
            "",
            "",
            "\1\61",
            "\1\62",
            "",
            "\1\63",
            "",
            "\12\46\7\uffff\32\47\3\uffff\2\47\1\uffff\32\47",
            "",
            "\42\66\1\64\4\66\1\65\64\66\1\65\5\66\1\65\3\66\1\65\7\66\1"+
            "\65\3\66\1\65\1\66\2\65\uff8a\66",
            "",
            "\42\52\1\51\71\52\1\50\uffa3\52",
            "",
            "",
            "",
            "",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\0\53",
            "\42\52\1\51\71\52\1\50\uffa3\52",
            "",
            "\1\74",
            "\1\75",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\100",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\102",
            "",
            "",
            "\1\103",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
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
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_NUMPREFIXEDID | RULE_DOTSTRINGTERM | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='g') ) {s = 1;}

                        else if ( (LA13_0=='-') ) {s = 2;}

                        else if ( (LA13_0=='{') ) {s = 3;}

                        else if ( (LA13_0=='}') ) {s = 4;}

                        else if ( (LA13_0=='s') ) {s = 5;}

                        else if ( (LA13_0=='[') ) {s = 6;}

                        else if ( (LA13_0==']') ) {s = 7;}

                        else if ( (LA13_0==';') ) {s = 8;}

                        else if ( (LA13_0==',') ) {s = 9;}

                        else if ( (LA13_0=='n') ) {s = 10;}

                        else if ( (LA13_0=='e') ) {s = 11;}

                        else if ( (LA13_0=='=') ) {s = 12;}

                        else if ( (LA13_0=='d') ) {s = 13;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 14;}

                        else if ( (LA13_0=='\"') ) {s = 15;}

                        else if ( (LA13_0=='^') ) {s = 16;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='c')||LA13_0=='f'||(LA13_0>='h' && LA13_0<='m')||(LA13_0>='o' && LA13_0<='r')||(LA13_0>='t' && LA13_0<='z')) ) {s = 17;}

                        else if ( (LA13_0=='\'') ) {s = 18;}

                        else if ( (LA13_0=='/') ) {s = 19;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 20;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='+')||LA13_0=='.'||LA13_0==':'||LA13_0=='<'||(LA13_0>='>' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_52 = input.LA(1);

                        s = -1;
                        if ( ((LA13_52>='\u0000' && LA13_52<='\uFFFF')) ) {s = 43;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_15 = input.LA(1);

                        s = -1;
                        if ( (LA13_15=='\\') ) {s = 40;}

                        else if ( (LA13_15=='\"') ) {s = 41;}

                        else if ( ((LA13_15>='\u0000' && LA13_15<='!')||(LA13_15>='#' && LA13_15<='[')||(LA13_15>=']' && LA13_15<='\uFFFF')) ) {s = 42;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_42 = input.LA(1);

                        s = -1;
                        if ( (LA13_42=='\"') ) {s = 41;}

                        else if ( (LA13_42=='\\') ) {s = 40;}

                        else if ( ((LA13_42>='\u0000' && LA13_42<='!')||(LA13_42>='#' && LA13_42<='[')||(LA13_42>=']' && LA13_42<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_53 = input.LA(1);

                        s = -1;
                        if ( (LA13_53=='\"') ) {s = 41;}

                        else if ( (LA13_53=='\\') ) {s = 40;}

                        else if ( ((LA13_53>='\u0000' && LA13_53<='!')||(LA13_53>='#' && LA13_53<='[')||(LA13_53>=']' && LA13_53<='\uFFFF')) ) {s = 42;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_40 = input.LA(1);

                        s = -1;
                        if ( (LA13_40=='\"') ) {s = 52;}

                        else if ( (LA13_40=='\''||LA13_40=='\\'||LA13_40=='b'||LA13_40=='f'||LA13_40=='n'||LA13_40=='r'||(LA13_40>='t' && LA13_40<='u')) ) {s = 53;}

                        else if ( ((LA13_40>='\u0000' && LA13_40<='!')||(LA13_40>='#' && LA13_40<='&')||(LA13_40>='(' && LA13_40<='[')||(LA13_40>=']' && LA13_40<='a')||(LA13_40>='c' && LA13_40<='e')||(LA13_40>='g' && LA13_40<='m')||(LA13_40>='o' && LA13_40<='q')||LA13_40=='s'||(LA13_40>='v' && LA13_40<='\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_18 = input.LA(1);

                        s = -1;
                        if ( ((LA13_18>='\u0000' && LA13_18<='\uFFFF')) ) {s = 43;}

                        else s = 21;

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