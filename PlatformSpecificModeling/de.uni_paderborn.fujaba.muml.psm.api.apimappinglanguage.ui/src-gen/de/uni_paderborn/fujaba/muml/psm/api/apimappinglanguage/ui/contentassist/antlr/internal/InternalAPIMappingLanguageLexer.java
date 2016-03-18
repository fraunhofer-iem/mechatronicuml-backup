package de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAPIMappingLanguageLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_MINORMAXKEYWORD=9;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_NUMBER=6;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalAPIMappingLanguageLexer() {;} 
    public InternalAPIMappingLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalAPIMappingLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:11:7: ( '||' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:11:9: '||'
            {
            match("||"); 


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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:12:7: ( '&&' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:12:9: '&&'
            {
            match("&&"); 


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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:13:7: ( 'null' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:13:9: 'null'
            {
            match("null"); 


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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:14:7: ( '++' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:14:9: '++'
            {
            match("++"); 


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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:15:7: ( '--' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:15:9: '--'
            {
            match("--"); 


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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:16:7: ( ':=' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:16:9: ':='
            {
            match(":="); 


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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:17:7: ( '+=' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:17:9: '+='
            {
            match("+="); 


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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:18:7: ( '-=' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:18:9: '-='
            {
            match("-="); 


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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:19:7: ( '==' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:19:9: '=='
            {
            match("=="); 


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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:20:7: ( '<>' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:20:9: '<>'
            {
            match("<>"); 


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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:21:7: ( '<' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:21:9: '<'
            {
            match('<'); 

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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:22:7: ( '<=' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:22:9: '<='
            {
            match("<="); 


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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:23:7: ( '>=' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:23:9: '>='
            {
            match(">="); 


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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:24:7: ( '>' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:24:9: '>'
            {
            match('>'); 

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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:25:7: ( '+' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:25:9: '+'
            {
            match('+'); 

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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:26:7: ( '-' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:26:9: '-'
            {
            match('-'); 

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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:27:7: ( '*' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:27:9: '*'
            {
            match('*'); 

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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:28:7: ( '/' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:28:9: '/'
            {
            match('/'); 

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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:29:7: ( '%' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:29:9: '%'
            {
            match('%'); 

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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:30:7: ( 'not' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:30:9: 'not'
            {
            match("not"); 


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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:31:7: ( 'self' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:31:9: 'self'
            {
            match("self"); 


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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:32:7: ( 'first' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:32:9: 'first'
            {
            match("first"); 


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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:33:7: ( 'last' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:33:9: 'last'
            {
            match("last"); 


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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:34:7: ( 'prev' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:34:9: 'prev'
            {
            match("prev"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:35:7: ( 'next' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:35:9: 'next'
            {
            match("next"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:36:7: ( 'MappingRepository:' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:36:9: 'MappingRepository:'
            {
            match("MappingRepository:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:37:7: ( '{' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:37:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:38:7: ( '}' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:38:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:39:7: ( ',' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:39:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:40:7: ( '#' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:40:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:41:7: ( 'import' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:41:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:42:7: ( 'PortInstance:' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:42:9: 'PortInstance:'
            {
            match("PortInstance:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:43:7: ( 'execCommand:' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:43:9: 'execCommand:'
            {
            match("execCommand:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:44:7: ( 'initCommand:' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:44:9: 'initCommand:'
            {
            match("initCommand:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:45:7: ( 'enum:' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:45:9: 'enum:'
            {
            match("enum:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:46:7: ( 'API_Call:' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:46:9: 'API_Call:'
            {
            match("API_Call:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:47:7: ( '(' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:47:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:48:7: ( ')' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:48:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:49:7: ( 'port:' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:49:9: 'port:'
            {
            match("port:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:50:7: ( '.' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:50:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:51:7: ( 'for' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:51:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:52:7: ( ';' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:52:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:53:7: ( 'while' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:53:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:54:7: ( 'do' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:54:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:55:7: ( ');' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:55:9: ');'
            {
            match(");"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:56:7: ( 'if' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:56:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:57:7: ( 'else' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:57:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:58:7: ( 'elseif' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:58:9: 'elseif'
            {
            match("elseif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:59:7: ( 'return' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:59:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:60:7: ( '[' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:60:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:61:7: ( ']' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:61:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:62:7: ( '->' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:62:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:63:7: ( 'const' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:63:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "RULE_MINORMAXKEYWORD"
    public final void mRULE_MINORMAXKEYWORD() throws RecognitionException {
        try {
            int _type = RULE_MINORMAXKEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10125:22: ( ( 'maxMessageDelay' | 'minMessageDelay' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10125:24: ( 'maxMessageDelay' | 'minMessageDelay' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10125:24: ( 'maxMessageDelay' | 'minMessageDelay' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='m') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='a') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='i') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10125:25: 'maxMessageDelay'
                    {
                    match("maxMessageDelay"); 


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10125:43: 'minMessageDelay'
                    {
                    match("minMessageDelay"); 


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
    // $ANTLR end "RULE_MINORMAXKEYWORD"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10127:13: ( RULE_INT '.' RULE_INT )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10127:15: RULE_INT '.' RULE_INT
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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10129:14: ( ( 'true' | 'false' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10129:16: ( 'true' | 'false' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10129:16: ( 'true' | 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='f') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10129:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10129:24: 'false'
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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10131:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10131:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10131:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10131:11: '^'
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

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10131:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:
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
            	    break loop4;
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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10133:10: ( ( '0' .. '9' )+ )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10133:12: ( '0' .. '9' )+
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10133:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10133:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10135:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10135:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10135:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10135:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10135:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10135:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10135:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10135:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10135:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10135:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10135:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10137:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10137:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10137:24: ( options {greedy=false; } : . )*
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
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10137:52: .
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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10139:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10139:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10139:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10139:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10139:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10139:41: ( '\\r' )? '\\n'
                    {
                    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10139:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10139:41: '\\r'
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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10141:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10141:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10141:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:
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
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10143:16: ( . )
            // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:10143:18: .
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
        // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | RULE_MINORMAXKEYWORD | RULE_NUMBER | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=63;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:190: T__44
                {
                mT__44(); 

                }
                break;
            case 32 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:196: T__45
                {
                mT__45(); 

                }
                break;
            case 33 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:202: T__46
                {
                mT__46(); 

                }
                break;
            case 34 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:208: T__47
                {
                mT__47(); 

                }
                break;
            case 35 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:214: T__48
                {
                mT__48(); 

                }
                break;
            case 36 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:220: T__49
                {
                mT__49(); 

                }
                break;
            case 37 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:226: T__50
                {
                mT__50(); 

                }
                break;
            case 38 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:232: T__51
                {
                mT__51(); 

                }
                break;
            case 39 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:238: T__52
                {
                mT__52(); 

                }
                break;
            case 40 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:244: T__53
                {
                mT__53(); 

                }
                break;
            case 41 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:250: T__54
                {
                mT__54(); 

                }
                break;
            case 42 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:256: T__55
                {
                mT__55(); 

                }
                break;
            case 43 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:262: T__56
                {
                mT__56(); 

                }
                break;
            case 44 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:268: T__57
                {
                mT__57(); 

                }
                break;
            case 45 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:274: T__58
                {
                mT__58(); 

                }
                break;
            case 46 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:280: T__59
                {
                mT__59(); 

                }
                break;
            case 47 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:286: T__60
                {
                mT__60(); 

                }
                break;
            case 48 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:292: T__61
                {
                mT__61(); 

                }
                break;
            case 49 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:298: T__62
                {
                mT__62(); 

                }
                break;
            case 50 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:304: T__63
                {
                mT__63(); 

                }
                break;
            case 51 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:310: T__64
                {
                mT__64(); 

                }
                break;
            case 52 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:316: T__65
                {
                mT__65(); 

                }
                break;
            case 53 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:322: T__66
                {
                mT__66(); 

                }
                break;
            case 54 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:328: RULE_MINORMAXKEYWORD
                {
                mRULE_MINORMAXKEYWORD(); 

                }
                break;
            case 55 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:349: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 56 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:361: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 57 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:374: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 58 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:382: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 59 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:391: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 60 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:403: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 61 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:419: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 62 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:435: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 63 :
                // ../de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.ui/src-gen/de/uni_paderborn/fujaba/muml/psm/api/apimappinglanguage/ui/contentassist/antlr/internal/InternalAPIMappingLanguage.g:1:443: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\2\54\1\62\1\65\1\71\2\54\1\76\1\100\1\uffff\1\104\1\uffff\5\62\4\uffff\4\62\1\uffff\1\134\2\uffff\3\62\2\uffff\2\62\1\147\1\62\1\54\1\uffff\2\54\4\uffff\3\62\24\uffff\10\62\4\uffff\2\62\1\172\5\62\5\uffff\1\62\1\u0081\1\62\2\uffff\3\62\1\uffff\1\147\1\uffff\1\62\2\uffff\1\62\1\u0088\3\62\1\u008c\7\62\1\uffff\6\62\1\uffff\5\62\1\u009f\1\uffff\1\u00a0\1\u00a1\1\62\1\uffff\1\62\1\u00a4\1\u00a5\7\62\1\u00ae\6\62\1\u00b5\3\uffff\1\u00b6\1\u00b5\3\uffff\5\62\1\uffff\1\62\1\uffff\1\62\1\u00be\1\62\1\u00c0\2\62\2\uffff\1\62\1\u00c4\3\62\1\u00c8\1\62\1\uffff\1\u00ca\1\uffff\3\62\1\uffff\3\62\1\uffff\1\62\1\uffff\15\62\1\uffff\17\62\1\uffff\1\62\1\uffff\3\62\1\uffff\6\62\2\u00f8\1\62\1\uffff\1\62\1\uffff";
    static final String DFA14_eofS =
        "\u00fb\uffff";
    static final String DFA14_minS =
        "\1\0\1\174\1\46\1\145\1\53\1\55\4\75\1\uffff\1\52\1\uffff\1\145\2\141\1\157\1\141\4\uffff\1\146\1\157\1\154\1\120\1\uffff\1\73\2\uffff\1\150\1\157\1\145\2\uffff\1\157\1\141\1\56\1\162\1\101\1\uffff\2\0\4\uffff\1\154\1\164\1\170\24\uffff\1\154\2\162\1\154\1\163\1\145\1\162\1\160\4\uffff\1\160\1\151\1\60\1\162\1\145\1\165\1\163\1\111\5\uffff\1\151\1\60\1\164\2\uffff\1\156\1\170\1\156\1\uffff\1\56\1\uffff\1\165\2\uffff\1\154\1\60\1\164\1\146\1\163\1\60\1\163\1\164\1\166\1\164\1\160\1\157\1\164\1\uffff\1\164\1\143\1\155\1\145\1\137\1\154\1\uffff\1\165\1\163\2\115\1\145\1\60\1\uffff\2\60\1\164\1\uffff\1\145\2\60\1\72\1\151\1\162\1\103\1\111\1\103\1\72\1\60\1\103\1\145\1\162\1\164\2\145\1\60\3\uffff\2\60\3\uffff\1\156\1\164\1\157\1\156\1\157\1\uffff\1\146\1\uffff\1\141\1\60\1\156\1\60\2\163\2\uffff\1\147\1\60\1\155\1\163\1\155\1\60\1\154\1\uffff\1\60\1\uffff\2\163\1\122\1\uffff\1\155\1\164\1\155\1\uffff\1\154\1\uffff\2\141\1\145\3\141\1\72\2\147\1\160\3\156\1\uffff\2\145\1\157\1\144\1\143\1\144\2\104\1\163\1\72\1\145\1\72\2\145\1\151\1\uffff\1\72\1\uffff\2\154\1\164\1\uffff\2\141\1\157\2\171\1\162\2\60\1\171\1\uffff\1\72\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\174\1\46\1\165\1\75\1\76\2\75\1\76\1\75\1\uffff\1\57\1\uffff\1\145\1\157\1\141\1\162\1\141\4\uffff\1\156\1\157\1\170\1\120\1\uffff\1\73\2\uffff\1\150\1\157\1\145\2\uffff\1\157\1\151\1\71\1\162\1\172\1\uffff\2\uffff\4\uffff\1\154\1\164\1\170\24\uffff\1\154\2\162\1\154\1\163\1\145\1\162\1\160\4\uffff\1\160\1\151\1\172\1\162\1\145\1\165\1\163\1\111\5\uffff\1\151\1\172\1\164\2\uffff\1\156\1\170\1\156\1\uffff\1\71\1\uffff\1\165\2\uffff\1\154\1\172\1\164\1\146\1\163\1\172\1\163\1\164\1\166\1\164\1\160\1\157\1\164\1\uffff\1\164\1\143\1\155\1\145\1\137\1\154\1\uffff\1\165\1\163\2\115\1\145\1\172\1\uffff\2\172\1\164\1\uffff\1\145\2\172\1\72\1\151\1\162\1\103\1\111\1\103\1\72\1\172\1\103\1\145\1\162\1\164\2\145\1\172\3\uffff\2\172\3\uffff\1\156\1\164\1\157\1\156\1\157\1\uffff\1\146\1\uffff\1\141\1\172\1\156\1\172\2\163\2\uffff\1\147\1\172\1\155\1\163\1\155\1\172\1\154\1\uffff\1\172\1\uffff\2\163\1\122\1\uffff\1\155\1\164\1\155\1\uffff\1\154\1\uffff\2\141\1\145\3\141\1\72\2\147\1\160\3\156\1\uffff\2\145\1\157\1\144\1\143\1\144\2\104\1\163\1\72\1\145\1\72\2\145\1\151\1\uffff\1\72\1\uffff\2\154\1\164\1\uffff\2\141\1\157\2\171\1\162\2\172\1\171\1\uffff\1\72\1\uffff";
    static final String DFA14_acceptS =
        "\12\uffff\1\21\1\uffff\1\23\5\uffff\1\33\1\34\1\35\1\36\4\uffff\1\45\1\uffff\1\50\1\52\3\uffff\1\62\1\63\5\uffff\1\71\2\uffff\1\76\1\77\1\1\1\2\3\uffff\1\71\1\4\1\7\1\17\1\5\1\10\1\64\1\20\1\6\1\11\1\12\1\14\1\13\1\15\1\16\1\21\1\74\1\75\1\22\1\23\10\uffff\1\33\1\34\1\35\1\36\10\uffff\1\45\1\55\1\46\1\50\1\52\3\uffff\1\62\1\63\3\uffff\1\72\1\uffff\1\67\1\uffff\1\73\1\76\15\uffff\1\56\6\uffff\1\54\6\uffff\1\24\3\uffff\1\51\22\uffff\1\3\1\31\1\25\2\uffff\1\27\1\30\1\47\5\uffff\1\43\1\uffff\1\57\6\uffff\1\70\1\26\7\uffff\1\53\1\uffff\1\65\3\uffff\1\37\3\uffff\1\60\1\uffff\1\61\15\uffff\1\44\17\uffff\1\42\1\uffff\1\41\3\uffff\1\40\11\uffff\1\66\1\uffff\1\32";
    static final String DFA14_specialS =
        "\1\1\50\uffff\1\2\1\0\u00d0\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\54\2\53\2\54\1\53\22\54\1\53\1\54\1\51\1\25\1\54\1\14\1\2\1\52\1\32\1\33\1\12\1\4\1\24\1\5\1\34\1\13\12\45\1\6\1\35\1\10\1\7\1\11\2\54\1\31\13\50\1\21\2\50\1\27\12\50\1\41\1\54\1\42\1\47\1\50\1\54\2\50\1\43\1\37\1\30\1\16\2\50\1\26\2\50\1\17\1\44\1\3\1\50\1\20\1\50\1\40\1\15\1\46\2\50\1\36\3\50\1\22\1\1\1\23\uff82\54",
            "\1\55",
            "\1\56",
            "\1\61\11\uffff\1\60\5\uffff\1\57",
            "\1\63\21\uffff\1\64",
            "\1\66\17\uffff\1\67\1\70",
            "\1\72",
            "\1\73",
            "\1\75\1\74",
            "\1\77",
            "",
            "\1\102\4\uffff\1\103",
            "",
            "\1\106",
            "\1\111\7\uffff\1\107\5\uffff\1\110",
            "\1\112",
            "\1\114\2\uffff\1\113",
            "\1\115",
            "",
            "",
            "",
            "",
            "\1\124\6\uffff\1\122\1\123",
            "\1\125",
            "\1\130\1\uffff\1\127\11\uffff\1\126",
            "\1\131",
            "",
            "\1\133",
            "",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "",
            "\1\144",
            "\1\145\7\uffff\1\146",
            "\1\151\1\uffff\12\150",
            "\1\152",
            "\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\0\153",
            "\0\153",
            "",
            "",
            "",
            "",
            "\1\155",
            "\1\156",
            "\1\157",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "",
            "",
            "",
            "\1\170",
            "\1\171",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "",
            "",
            "",
            "",
            "\1\u0080",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0082",
            "",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "",
            "\1\151\1\uffff\12\150",
            "",
            "\1\u0086",
            "",
            "",
            "\1\u0087",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00a2",
            "",
            "\1\u00a3",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\10\62\1\u00ad\21\62",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "",
            "\1\u00bd",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00bf",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00c1",
            "\1\u00c2",
            "",
            "",
            "\1\u00c3",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00c9",
            "",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "\1\u00ee",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\12\62\7\uffff\32\62\4\uffff\1\62\1\uffff\32\62",
            "\1\u00f9",
            "",
            "\1\u00fa",
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

    static class DFA14 extends DFA {

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
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | RULE_MINORMAXKEYWORD | RULE_NUMBER | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_42 = input.LA(1);

                        s = -1;
                        if ( ((LA14_42>='\u0000' && LA14_42<='\uFFFF')) ) {s = 107;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='|') ) {s = 1;}

                        else if ( (LA14_0=='&') ) {s = 2;}

                        else if ( (LA14_0=='n') ) {s = 3;}

                        else if ( (LA14_0=='+') ) {s = 4;}

                        else if ( (LA14_0=='-') ) {s = 5;}

                        else if ( (LA14_0==':') ) {s = 6;}

                        else if ( (LA14_0=='=') ) {s = 7;}

                        else if ( (LA14_0=='<') ) {s = 8;}

                        else if ( (LA14_0=='>') ) {s = 9;}

                        else if ( (LA14_0=='*') ) {s = 10;}

                        else if ( (LA14_0=='/') ) {s = 11;}

                        else if ( (LA14_0=='%') ) {s = 12;}

                        else if ( (LA14_0=='s') ) {s = 13;}

                        else if ( (LA14_0=='f') ) {s = 14;}

                        else if ( (LA14_0=='l') ) {s = 15;}

                        else if ( (LA14_0=='p') ) {s = 16;}

                        else if ( (LA14_0=='M') ) {s = 17;}

                        else if ( (LA14_0=='{') ) {s = 18;}

                        else if ( (LA14_0=='}') ) {s = 19;}

                        else if ( (LA14_0==',') ) {s = 20;}

                        else if ( (LA14_0=='#') ) {s = 21;}

                        else if ( (LA14_0=='i') ) {s = 22;}

                        else if ( (LA14_0=='P') ) {s = 23;}

                        else if ( (LA14_0=='e') ) {s = 24;}

                        else if ( (LA14_0=='A') ) {s = 25;}

                        else if ( (LA14_0=='(') ) {s = 26;}

                        else if ( (LA14_0==')') ) {s = 27;}

                        else if ( (LA14_0=='.') ) {s = 28;}

                        else if ( (LA14_0==';') ) {s = 29;}

                        else if ( (LA14_0=='w') ) {s = 30;}

                        else if ( (LA14_0=='d') ) {s = 31;}

                        else if ( (LA14_0=='r') ) {s = 32;}

                        else if ( (LA14_0=='[') ) {s = 33;}

                        else if ( (LA14_0==']') ) {s = 34;}

                        else if ( (LA14_0=='c') ) {s = 35;}

                        else if ( (LA14_0=='m') ) {s = 36;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 37;}

                        else if ( (LA14_0=='t') ) {s = 38;}

                        else if ( (LA14_0=='^') ) {s = 39;}

                        else if ( ((LA14_0>='B' && LA14_0<='L')||(LA14_0>='N' && LA14_0<='O')||(LA14_0>='Q' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='b')||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='k')||LA14_0=='o'||LA14_0=='q'||(LA14_0>='u' && LA14_0<='v')||(LA14_0>='x' && LA14_0<='z')) ) {s = 40;}

                        else if ( (LA14_0=='\"') ) {s = 41;}

                        else if ( (LA14_0=='\'') ) {s = 42;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 43;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||LA14_0=='$'||(LA14_0>='?' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='`'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 44;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_41 = input.LA(1);

                        s = -1;
                        if ( ((LA14_41>='\u0000' && LA14_41<='\uFFFF')) ) {s = 107;}

                        else s = 44;

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