package de.uni_paderborn.fujaba.graphviz.dot.xtext.ui.contentassist.antlr.internal; 

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
import de.uni_paderborn.fujaba.graphviz.dot.xtext.services.DotLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOTSTRINGTERM", "RULE_NUMPREFIXEDID", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'graph'", "'--'", "'->'", "'{'", "'}'", "'subgraph'", "'['", "']'", "';'", "','", "'node'", "'edge'", "'='", "'digraph'"
    };
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
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
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


        public InternalDotLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDotLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDotLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g"; }


     
     	private DotLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DotLanguageGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleDotGraph"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:60:1: entryRuleDotGraph : ruleDotGraph EOF ;
    public final void entryRuleDotGraph() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:61:1: ( ruleDotGraph EOF )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:62:1: ruleDotGraph EOF
            {
             before(grammarAccess.getDotGraphRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotGraph_in_entryRuleDotGraph61);
            ruleDotGraph();

            state._fsp--;

             after(grammarAccess.getDotGraphRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDotGraph68); 

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
    // $ANTLR end "entryRuleDotGraph"


    // $ANTLR start "ruleDotGraph"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:69:1: ruleDotGraph : ( ( rule__DotGraph__Group__0 ) ) ;
    public final void ruleDotGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:73:2: ( ( ( rule__DotGraph__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:74:1: ( ( rule__DotGraph__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:74:1: ( ( rule__DotGraph__Group__0 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:75:1: ( rule__DotGraph__Group__0 )
            {
             before(grammarAccess.getDotGraphAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:76:1: ( rule__DotGraph__Group__0 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:76:2: rule__DotGraph__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group__0_in_ruleDotGraph94);
            rule__DotGraph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDotGraphAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDotGraph"


    // $ANTLR start "entryRuleDotNode"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:88:1: entryRuleDotNode : ruleDotNode EOF ;
    public final void entryRuleDotNode() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:89:1: ( ruleDotNode EOF )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:90:1: ruleDotNode EOF
            {
             before(grammarAccess.getDotNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotNode_in_entryRuleDotNode121);
            ruleDotNode();

            state._fsp--;

             after(grammarAccess.getDotNodeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDotNode128); 

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
    // $ANTLR end "entryRuleDotNode"


    // $ANTLR start "ruleDotNode"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:97:1: ruleDotNode : ( ( rule__DotNode__Group__0 ) ) ;
    public final void ruleDotNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:101:2: ( ( ( rule__DotNode__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:102:1: ( ( rule__DotNode__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:102:1: ( ( rule__DotNode__Group__0 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:103:1: ( rule__DotNode__Group__0 )
            {
             before(grammarAccess.getDotNodeAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:104:1: ( rule__DotNode__Group__0 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:104:2: rule__DotNode__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group__0_in_ruleDotNode154);
            rule__DotNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDotNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDotNode"


    // $ANTLR start "entryRuleDotEdge"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:116:1: entryRuleDotEdge : ruleDotEdge EOF ;
    public final void entryRuleDotEdge() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:117:1: ( ruleDotEdge EOF )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:118:1: ruleDotEdge EOF
            {
             before(grammarAccess.getDotEdgeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotEdge_in_entryRuleDotEdge181);
            ruleDotEdge();

            state._fsp--;

             after(grammarAccess.getDotEdgeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDotEdge188); 

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
    // $ANTLR end "entryRuleDotEdge"


    // $ANTLR start "ruleDotEdge"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:125:1: ruleDotEdge : ( ( rule__DotEdge__Group__0 ) ) ;
    public final void ruleDotEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:129:2: ( ( ( rule__DotEdge__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:130:1: ( ( rule__DotEdge__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:130:1: ( ( rule__DotEdge__Group__0 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:131:1: ( rule__DotEdge__Group__0 )
            {
             before(grammarAccess.getDotEdgeAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:132:1: ( rule__DotEdge__Group__0 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:132:2: rule__DotEdge__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group__0_in_ruleDotEdge214);
            rule__DotEdge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDotEdgeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDotEdge"


    // $ANTLR start "entryRuleSetting"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:144:1: entryRuleSetting : ruleSetting EOF ;
    public final void entryRuleSetting() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:145:1: ( ruleSetting EOF )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:146:1: ruleSetting EOF
            {
             before(grammarAccess.getSettingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_entryRuleSetting241);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getSettingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSetting248); 

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
    // $ANTLR end "entryRuleSetting"


    // $ANTLR start "ruleSetting"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:153:1: ruleSetting : ( ( rule__Setting__Group__0 ) ) ;
    public final void ruleSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:157:2: ( ( ( rule__Setting__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:158:1: ( ( rule__Setting__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:158:1: ( ( rule__Setting__Group__0 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:159:1: ( rule__Setting__Group__0 )
            {
             before(grammarAccess.getSettingAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:160:1: ( rule__Setting__Group__0 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:160:2: rule__Setting__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Setting__Group__0_in_ruleSetting274);
            rule__Setting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSettingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetting"


    // $ANTLR start "entryRuleDotID"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:172:1: entryRuleDotID : ruleDotID EOF ;
    public final void entryRuleDotID() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:173:1: ( ruleDotID EOF )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:174:1: ruleDotID EOF
            {
             before(grammarAccess.getDotIDRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_entryRuleDotID301);
            ruleDotID();

            state._fsp--;

             after(grammarAccess.getDotIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDotID308); 

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
    // $ANTLR end "entryRuleDotID"


    // $ANTLR start "ruleDotID"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:181:1: ruleDotID : ( ( rule__DotID__Alternatives ) ) ;
    public final void ruleDotID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:185:2: ( ( ( rule__DotID__Alternatives ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:186:1: ( ( rule__DotID__Alternatives ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:186:1: ( ( rule__DotID__Alternatives ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:187:1: ( rule__DotID__Alternatives )
            {
             before(grammarAccess.getDotIDAccess().getAlternatives()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:188:1: ( rule__DotID__Alternatives )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:188:2: rule__DotID__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotID__Alternatives_in_ruleDotID334);
            rule__DotID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDotIDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDotID"


    // $ANTLR start "rule__DotGraph__Alternatives_1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:200:1: rule__DotGraph__Alternatives_1 : ( ( ( rule__DotGraph__Group_1_0__0 ) ) | ( ( rule__DotGraph__Group_1_1__0 ) ) );
    public final void rule__DotGraph__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:204:1: ( ( ( rule__DotGraph__Group_1_0__0 ) ) | ( ( rule__DotGraph__Group_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13||LA1_0==26) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:205:1: ( ( rule__DotGraph__Group_1_0__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:205:1: ( ( rule__DotGraph__Group_1_0__0 ) )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:206:1: ( rule__DotGraph__Group_1_0__0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getGroup_1_0()); 
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:207:1: ( rule__DotGraph__Group_1_0__0 )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:207:2: rule__DotGraph__Group_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_1_0__0_in_rule__DotGraph__Alternatives_1370);
                    rule__DotGraph__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:211:6: ( ( rule__DotGraph__Group_1_1__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:211:6: ( ( rule__DotGraph__Group_1_1__0 ) )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:212:1: ( rule__DotGraph__Group_1_1__0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getGroup_1_1()); 
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:213:1: ( rule__DotGraph__Group_1_1__0 )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:213:2: rule__DotGraph__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_1_1__0_in_rule__DotGraph__Alternatives_1388);
                    rule__DotGraph__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__DotGraph__Alternatives_1"


    // $ANTLR start "rule__DotGraph__Alternatives_1_0_0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:222:1: rule__DotGraph__Alternatives_1_0_0 : ( ( ( rule__DotGraph__DirectedGraphAssignment_1_0_0_0 ) ) | ( 'graph' ) );
    public final void rule__DotGraph__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:226:1: ( ( ( rule__DotGraph__DirectedGraphAssignment_1_0_0_0 ) ) | ( 'graph' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:227:1: ( ( rule__DotGraph__DirectedGraphAssignment_1_0_0_0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:227:1: ( ( rule__DotGraph__DirectedGraphAssignment_1_0_0_0 ) )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:228:1: ( rule__DotGraph__DirectedGraphAssignment_1_0_0_0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getDirectedGraphAssignment_1_0_0_0()); 
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:229:1: ( rule__DotGraph__DirectedGraphAssignment_1_0_0_0 )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:229:2: rule__DotGraph__DirectedGraphAssignment_1_0_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__DirectedGraphAssignment_1_0_0_0_in_rule__DotGraph__Alternatives_1_0_0421);
                    rule__DotGraph__DirectedGraphAssignment_1_0_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getDirectedGraphAssignment_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:233:6: ( 'graph' )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:233:6: ( 'graph' )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:234:1: 'graph'
                    {
                     before(grammarAccess.getDotGraphAccess().getGraphKeyword_1_0_0_1()); 
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__DotGraph__Alternatives_1_0_0440); 
                     after(grammarAccess.getDotGraphAccess().getGraphKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__DotGraph__Alternatives_1_0_0"


    // $ANTLR start "rule__DotGraph__Alternatives_3"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:246:1: rule__DotGraph__Alternatives_3 : ( ( ( rule__DotGraph__Group_3_0__0 ) ) | ( ( rule__DotGraph__Group_3_1__0 ) ) | ( ( rule__DotGraph__Group_3_2__0 ) ) | ( ( rule__DotGraph__SubgraphsAssignment_3_3 ) ) | ( ( rule__DotGraph__NodesAssignment_3_4 ) ) | ( ( rule__DotGraph__EdgesAssignment_3_5 ) ) );
    public final void rule__DotGraph__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:250:1: ( ( ( rule__DotGraph__Group_3_0__0 ) ) | ( ( rule__DotGraph__Group_3_1__0 ) ) | ( ( rule__DotGraph__Group_3_2__0 ) ) | ( ( rule__DotGraph__SubgraphsAssignment_3_3 ) ) | ( ( rule__DotGraph__NodesAssignment_3_4 ) ) | ( ( rule__DotGraph__EdgesAssignment_3_5 ) ) )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:251:1: ( ( rule__DotGraph__Group_3_0__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:251:1: ( ( rule__DotGraph__Group_3_0__0 ) )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:252:1: ( rule__DotGraph__Group_3_0__0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getGroup_3_0()); 
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:253:1: ( rule__DotGraph__Group_3_0__0 )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:253:2: rule__DotGraph__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__0_in_rule__DotGraph__Alternatives_3474);
                    rule__DotGraph__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:257:6: ( ( rule__DotGraph__Group_3_1__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:257:6: ( ( rule__DotGraph__Group_3_1__0 ) )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:258:1: ( rule__DotGraph__Group_3_1__0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getGroup_3_1()); 
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:259:1: ( rule__DotGraph__Group_3_1__0 )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:259:2: rule__DotGraph__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__0_in_rule__DotGraph__Alternatives_3492);
                    rule__DotGraph__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getGroup_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:263:6: ( ( rule__DotGraph__Group_3_2__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:263:6: ( ( rule__DotGraph__Group_3_2__0 ) )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:264:1: ( rule__DotGraph__Group_3_2__0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getGroup_3_2()); 
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:265:1: ( rule__DotGraph__Group_3_2__0 )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:265:2: rule__DotGraph__Group_3_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__0_in_rule__DotGraph__Alternatives_3510);
                    rule__DotGraph__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getGroup_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:269:6: ( ( rule__DotGraph__SubgraphsAssignment_3_3 ) )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:269:6: ( ( rule__DotGraph__SubgraphsAssignment_3_3 ) )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:270:1: ( rule__DotGraph__SubgraphsAssignment_3_3 )
                    {
                     before(grammarAccess.getDotGraphAccess().getSubgraphsAssignment_3_3()); 
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:271:1: ( rule__DotGraph__SubgraphsAssignment_3_3 )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:271:2: rule__DotGraph__SubgraphsAssignment_3_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__SubgraphsAssignment_3_3_in_rule__DotGraph__Alternatives_3528);
                    rule__DotGraph__SubgraphsAssignment_3_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getSubgraphsAssignment_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:275:6: ( ( rule__DotGraph__NodesAssignment_3_4 ) )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:275:6: ( ( rule__DotGraph__NodesAssignment_3_4 ) )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:276:1: ( rule__DotGraph__NodesAssignment_3_4 )
                    {
                     before(grammarAccess.getDotGraphAccess().getNodesAssignment_3_4()); 
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:277:1: ( rule__DotGraph__NodesAssignment_3_4 )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:277:2: rule__DotGraph__NodesAssignment_3_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__NodesAssignment_3_4_in_rule__DotGraph__Alternatives_3546);
                    rule__DotGraph__NodesAssignment_3_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getNodesAssignment_3_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:281:6: ( ( rule__DotGraph__EdgesAssignment_3_5 ) )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:281:6: ( ( rule__DotGraph__EdgesAssignment_3_5 ) )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:282:1: ( rule__DotGraph__EdgesAssignment_3_5 )
                    {
                     before(grammarAccess.getDotGraphAccess().getEdgesAssignment_3_5()); 
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:283:1: ( rule__DotGraph__EdgesAssignment_3_5 )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:283:2: rule__DotGraph__EdgesAssignment_3_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__EdgesAssignment_3_5_in_rule__DotGraph__Alternatives_3564);
                    rule__DotGraph__EdgesAssignment_3_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getEdgesAssignment_3_5()); 

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
    // $ANTLR end "rule__DotGraph__Alternatives_3"


    // $ANTLR start "rule__DotEdge__Alternatives_1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:292:1: rule__DotEdge__Alternatives_1 : ( ( '--' ) | ( '->' ) );
    public final void rule__DotEdge__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:296:1: ( ( '--' ) | ( '->' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:297:1: ( '--' )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:297:1: ( '--' )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:298:1: '--'
                    {
                     before(grammarAccess.getDotEdgeAccess().getHyphenMinusHyphenMinusKeyword_1_0()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__DotEdge__Alternatives_1598); 
                     after(grammarAccess.getDotEdgeAccess().getHyphenMinusHyphenMinusKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:305:6: ( '->' )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:305:6: ( '->' )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:306:1: '->'
                    {
                     before(grammarAccess.getDotEdgeAccess().getHyphenMinusGreaterThanSignKeyword_1_1()); 
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__DotEdge__Alternatives_1618); 
                     after(grammarAccess.getDotEdgeAccess().getHyphenMinusGreaterThanSignKeyword_1_1()); 

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
    // $ANTLR end "rule__DotEdge__Alternatives_1"


    // $ANTLR start "rule__DotID__Alternatives"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:318:1: rule__DotID__Alternatives : ( ( RULE_DOTSTRINGTERM ) | ( RULE_NUMPREFIXEDID ) | ( RULE_INT ) | ( RULE_ID ) );
    public final void rule__DotID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:322:1: ( ( RULE_DOTSTRINGTERM ) | ( RULE_NUMPREFIXEDID ) | ( RULE_INT ) | ( RULE_ID ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_DOTSTRINGTERM:
                {
                alt5=1;
                }
                break;
            case RULE_NUMPREFIXEDID:
                {
                alt5=2;
                }
                break;
            case RULE_INT:
                {
                alt5=3;
                }
                break;
            case RULE_ID:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:323:1: ( RULE_DOTSTRINGTERM )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:323:1: ( RULE_DOTSTRINGTERM )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:324:1: RULE_DOTSTRINGTERM
                    {
                     before(grammarAccess.getDotIDAccess().getDOTSTRINGTERMTerminalRuleCall_0()); 
                    match(input,RULE_DOTSTRINGTERM,FollowSets000.FOLLOW_RULE_DOTSTRINGTERM_in_rule__DotID__Alternatives652); 
                     after(grammarAccess.getDotIDAccess().getDOTSTRINGTERMTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:329:6: ( RULE_NUMPREFIXEDID )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:329:6: ( RULE_NUMPREFIXEDID )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:330:1: RULE_NUMPREFIXEDID
                    {
                     before(grammarAccess.getDotIDAccess().getNUMPREFIXEDIDTerminalRuleCall_1()); 
                    match(input,RULE_NUMPREFIXEDID,FollowSets000.FOLLOW_RULE_NUMPREFIXEDID_in_rule__DotID__Alternatives669); 
                     after(grammarAccess.getDotIDAccess().getNUMPREFIXEDIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:335:6: ( RULE_INT )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:335:6: ( RULE_INT )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:336:1: RULE_INT
                    {
                     before(grammarAccess.getDotIDAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__DotID__Alternatives686); 
                     after(grammarAccess.getDotIDAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:341:6: ( RULE_ID )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:341:6: ( RULE_ID )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:342:1: RULE_ID
                    {
                     before(grammarAccess.getDotIDAccess().getIDTerminalRuleCall_3()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__DotID__Alternatives703); 
                     after(grammarAccess.getDotIDAccess().getIDTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__DotID__Alternatives"


    // $ANTLR start "rule__DotGraph__Group__0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:354:1: rule__DotGraph__Group__0 : rule__DotGraph__Group__0__Impl rule__DotGraph__Group__1 ;
    public final void rule__DotGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:358:1: ( rule__DotGraph__Group__0__Impl rule__DotGraph__Group__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:359:2: rule__DotGraph__Group__0__Impl rule__DotGraph__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group__0__Impl_in_rule__DotGraph__Group__0733);
            rule__DotGraph__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group__1_in_rule__DotGraph__Group__0736);
            rule__DotGraph__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__0"


    // $ANTLR start "rule__DotGraph__Group__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:366:1: rule__DotGraph__Group__0__Impl : ( () ) ;
    public final void rule__DotGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:370:1: ( ( () ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:371:1: ( () )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:371:1: ( () )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:372:1: ()
            {
             before(grammarAccess.getDotGraphAccess().getDotGraphAction_0()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:373:1: ()
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:375:1: 
            {
            }

             after(grammarAccess.getDotGraphAccess().getDotGraphAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__0__Impl"


    // $ANTLR start "rule__DotGraph__Group__1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:385:1: rule__DotGraph__Group__1 : rule__DotGraph__Group__1__Impl rule__DotGraph__Group__2 ;
    public final void rule__DotGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:389:1: ( rule__DotGraph__Group__1__Impl rule__DotGraph__Group__2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:390:2: rule__DotGraph__Group__1__Impl rule__DotGraph__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group__1__Impl_in_rule__DotGraph__Group__1794);
            rule__DotGraph__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group__2_in_rule__DotGraph__Group__1797);
            rule__DotGraph__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__1"


    // $ANTLR start "rule__DotGraph__Group__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:397:1: rule__DotGraph__Group__1__Impl : ( ( rule__DotGraph__Alternatives_1 ) ) ;
    public final void rule__DotGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:401:1: ( ( ( rule__DotGraph__Alternatives_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:402:1: ( ( rule__DotGraph__Alternatives_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:402:1: ( ( rule__DotGraph__Alternatives_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:403:1: ( rule__DotGraph__Alternatives_1 )
            {
             before(grammarAccess.getDotGraphAccess().getAlternatives_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:404:1: ( rule__DotGraph__Alternatives_1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:404:2: rule__DotGraph__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Alternatives_1_in_rule__DotGraph__Group__1__Impl824);
            rule__DotGraph__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDotGraphAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__1__Impl"


    // $ANTLR start "rule__DotGraph__Group__2"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:414:1: rule__DotGraph__Group__2 : rule__DotGraph__Group__2__Impl rule__DotGraph__Group__3 ;
    public final void rule__DotGraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:418:1: ( rule__DotGraph__Group__2__Impl rule__DotGraph__Group__3 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:419:2: rule__DotGraph__Group__2__Impl rule__DotGraph__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group__2__Impl_in_rule__DotGraph__Group__2854);
            rule__DotGraph__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group__3_in_rule__DotGraph__Group__2857);
            rule__DotGraph__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__2"


    // $ANTLR start "rule__DotGraph__Group__2__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:426:1: rule__DotGraph__Group__2__Impl : ( '{' ) ;
    public final void rule__DotGraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:430:1: ( ( '{' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:431:1: ( '{' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:431:1: ( '{' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:432:1: '{'
            {
             before(grammarAccess.getDotGraphAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__DotGraph__Group__2__Impl885); 
             after(grammarAccess.getDotGraphAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__2__Impl"


    // $ANTLR start "rule__DotGraph__Group__3"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:445:1: rule__DotGraph__Group__3 : rule__DotGraph__Group__3__Impl rule__DotGraph__Group__4 ;
    public final void rule__DotGraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:449:1: ( rule__DotGraph__Group__3__Impl rule__DotGraph__Group__4 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:450:2: rule__DotGraph__Group__3__Impl rule__DotGraph__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group__3__Impl_in_rule__DotGraph__Group__3916);
            rule__DotGraph__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group__4_in_rule__DotGraph__Group__3919);
            rule__DotGraph__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__3"


    // $ANTLR start "rule__DotGraph__Group__3__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:457:1: rule__DotGraph__Group__3__Impl : ( ( rule__DotGraph__Alternatives_3 )* ) ;
    public final void rule__DotGraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:461:1: ( ( ( rule__DotGraph__Alternatives_3 )* ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:462:1: ( ( rule__DotGraph__Alternatives_3 )* )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:462:1: ( ( rule__DotGraph__Alternatives_3 )* )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:463:1: ( rule__DotGraph__Alternatives_3 )*
            {
             before(grammarAccess.getDotGraphAccess().getAlternatives_3()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:464:1: ( rule__DotGraph__Alternatives_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_DOTSTRINGTERM && LA6_0<=RULE_ID)||LA6_0==13||LA6_0==18||(LA6_0>=23 && LA6_0<=24)||LA6_0==26) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:464:2: rule__DotGraph__Alternatives_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Alternatives_3_in_rule__DotGraph__Group__3__Impl946);
            	    rule__DotGraph__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDotGraphAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__3__Impl"


    // $ANTLR start "rule__DotGraph__Group__4"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:474:1: rule__DotGraph__Group__4 : rule__DotGraph__Group__4__Impl ;
    public final void rule__DotGraph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:478:1: ( rule__DotGraph__Group__4__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:479:2: rule__DotGraph__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group__4__Impl_in_rule__DotGraph__Group__4977);
            rule__DotGraph__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__4"


    // $ANTLR start "rule__DotGraph__Group__4__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:485:1: rule__DotGraph__Group__4__Impl : ( '}' ) ;
    public final void rule__DotGraph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:489:1: ( ( '}' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:490:1: ( '}' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:490:1: ( '}' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:491:1: '}'
            {
             before(grammarAccess.getDotGraphAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__DotGraph__Group__4__Impl1005); 
             after(grammarAccess.getDotGraphAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__4__Impl"


    // $ANTLR start "rule__DotGraph__Group_1_0__0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:514:1: rule__DotGraph__Group_1_0__0 : rule__DotGraph__Group_1_0__0__Impl rule__DotGraph__Group_1_0__1 ;
    public final void rule__DotGraph__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:518:1: ( rule__DotGraph__Group_1_0__0__Impl rule__DotGraph__Group_1_0__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:519:2: rule__DotGraph__Group_1_0__0__Impl rule__DotGraph__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_1_0__0__Impl_in_rule__DotGraph__Group_1_0__01046);
            rule__DotGraph__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_1_0__1_in_rule__DotGraph__Group_1_0__01049);
            rule__DotGraph__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_1_0__0"


    // $ANTLR start "rule__DotGraph__Group_1_0__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:526:1: rule__DotGraph__Group_1_0__0__Impl : ( ( rule__DotGraph__Alternatives_1_0_0 ) ) ;
    public final void rule__DotGraph__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:530:1: ( ( ( rule__DotGraph__Alternatives_1_0_0 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:531:1: ( ( rule__DotGraph__Alternatives_1_0_0 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:531:1: ( ( rule__DotGraph__Alternatives_1_0_0 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:532:1: ( rule__DotGraph__Alternatives_1_0_0 )
            {
             before(grammarAccess.getDotGraphAccess().getAlternatives_1_0_0()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:533:1: ( rule__DotGraph__Alternatives_1_0_0 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:533:2: rule__DotGraph__Alternatives_1_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Alternatives_1_0_0_in_rule__DotGraph__Group_1_0__0__Impl1076);
            rule__DotGraph__Alternatives_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDotGraphAccess().getAlternatives_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_1_0__0__Impl"


    // $ANTLR start "rule__DotGraph__Group_1_0__1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:543:1: rule__DotGraph__Group_1_0__1 : rule__DotGraph__Group_1_0__1__Impl ;
    public final void rule__DotGraph__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:547:1: ( rule__DotGraph__Group_1_0__1__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:548:2: rule__DotGraph__Group_1_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_1_0__1__Impl_in_rule__DotGraph__Group_1_0__11106);
            rule__DotGraph__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_1_0__1"


    // $ANTLR start "rule__DotGraph__Group_1_0__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:554:1: rule__DotGraph__Group_1_0__1__Impl : ( ( rule__DotGraph__IdAssignment_1_0_1 )? ) ;
    public final void rule__DotGraph__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:558:1: ( ( ( rule__DotGraph__IdAssignment_1_0_1 )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:559:1: ( ( rule__DotGraph__IdAssignment_1_0_1 )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:559:1: ( ( rule__DotGraph__IdAssignment_1_0_1 )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:560:1: ( rule__DotGraph__IdAssignment_1_0_1 )?
            {
             before(grammarAccess.getDotGraphAccess().getIdAssignment_1_0_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:561:1: ( rule__DotGraph__IdAssignment_1_0_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_DOTSTRINGTERM && LA7_0<=RULE_ID)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:561:2: rule__DotGraph__IdAssignment_1_0_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__IdAssignment_1_0_1_in_rule__DotGraph__Group_1_0__1__Impl1133);
                    rule__DotGraph__IdAssignment_1_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDotGraphAccess().getIdAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_1_0__1__Impl"


    // $ANTLR start "rule__DotGraph__Group_1_1__0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:575:1: rule__DotGraph__Group_1_1__0 : rule__DotGraph__Group_1_1__0__Impl rule__DotGraph__Group_1_1__1 ;
    public final void rule__DotGraph__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:579:1: ( rule__DotGraph__Group_1_1__0__Impl rule__DotGraph__Group_1_1__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:580:2: rule__DotGraph__Group_1_1__0__Impl rule__DotGraph__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_1_1__0__Impl_in_rule__DotGraph__Group_1_1__01168);
            rule__DotGraph__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_1_1__1_in_rule__DotGraph__Group_1_1__01171);
            rule__DotGraph__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_1_1__0"


    // $ANTLR start "rule__DotGraph__Group_1_1__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:587:1: rule__DotGraph__Group_1_1__0__Impl : ( 'subgraph' ) ;
    public final void rule__DotGraph__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:591:1: ( ( 'subgraph' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:592:1: ( 'subgraph' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:592:1: ( 'subgraph' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:593:1: 'subgraph'
            {
             before(grammarAccess.getDotGraphAccess().getSubgraphKeyword_1_1_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__DotGraph__Group_1_1__0__Impl1199); 
             after(grammarAccess.getDotGraphAccess().getSubgraphKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_1_1__0__Impl"


    // $ANTLR start "rule__DotGraph__Group_1_1__1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:606:1: rule__DotGraph__Group_1_1__1 : rule__DotGraph__Group_1_1__1__Impl ;
    public final void rule__DotGraph__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:610:1: ( rule__DotGraph__Group_1_1__1__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:611:2: rule__DotGraph__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_1_1__1__Impl_in_rule__DotGraph__Group_1_1__11230);
            rule__DotGraph__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_1_1__1"


    // $ANTLR start "rule__DotGraph__Group_1_1__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:617:1: rule__DotGraph__Group_1_1__1__Impl : ( ( rule__DotGraph__IdAssignment_1_1_1 )? ) ;
    public final void rule__DotGraph__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:621:1: ( ( ( rule__DotGraph__IdAssignment_1_1_1 )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:622:1: ( ( rule__DotGraph__IdAssignment_1_1_1 )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:622:1: ( ( rule__DotGraph__IdAssignment_1_1_1 )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:623:1: ( rule__DotGraph__IdAssignment_1_1_1 )?
            {
             before(grammarAccess.getDotGraphAccess().getIdAssignment_1_1_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:624:1: ( rule__DotGraph__IdAssignment_1_1_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_DOTSTRINGTERM && LA8_0<=RULE_ID)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:624:2: rule__DotGraph__IdAssignment_1_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__IdAssignment_1_1_1_in_rule__DotGraph__Group_1_1__1__Impl1257);
                    rule__DotGraph__IdAssignment_1_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDotGraphAccess().getIdAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_1_1__1__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_0__0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:638:1: rule__DotGraph__Group_3_0__0 : rule__DotGraph__Group_3_0__0__Impl rule__DotGraph__Group_3_0__1 ;
    public final void rule__DotGraph__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:642:1: ( rule__DotGraph__Group_3_0__0__Impl rule__DotGraph__Group_3_0__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:643:2: rule__DotGraph__Group_3_0__0__Impl rule__DotGraph__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__0__Impl_in_rule__DotGraph__Group_3_0__01292);
            rule__DotGraph__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__1_in_rule__DotGraph__Group_3_0__01295);
            rule__DotGraph__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_0__0"


    // $ANTLR start "rule__DotGraph__Group_3_0__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:650:1: rule__DotGraph__Group_3_0__0__Impl : ( 'graph' ) ;
    public final void rule__DotGraph__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:654:1: ( ( 'graph' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:655:1: ( 'graph' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:655:1: ( 'graph' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:656:1: 'graph'
            {
             before(grammarAccess.getDotGraphAccess().getGraphKeyword_3_0_0()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__DotGraph__Group_3_0__0__Impl1323); 
             after(grammarAccess.getDotGraphAccess().getGraphKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_0__0__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_0__1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:669:1: rule__DotGraph__Group_3_0__1 : rule__DotGraph__Group_3_0__1__Impl rule__DotGraph__Group_3_0__2 ;
    public final void rule__DotGraph__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:673:1: ( rule__DotGraph__Group_3_0__1__Impl rule__DotGraph__Group_3_0__2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:674:2: rule__DotGraph__Group_3_0__1__Impl rule__DotGraph__Group_3_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__1__Impl_in_rule__DotGraph__Group_3_0__11354);
            rule__DotGraph__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__2_in_rule__DotGraph__Group_3_0__11357);
            rule__DotGraph__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_0__1"


    // $ANTLR start "rule__DotGraph__Group_3_0__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:681:1: rule__DotGraph__Group_3_0__1__Impl : ( '[' ) ;
    public final void rule__DotGraph__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:685:1: ( ( '[' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:686:1: ( '[' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:686:1: ( '[' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:687:1: '['
            {
             before(grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_3_0_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__DotGraph__Group_3_0__1__Impl1385); 
             after(grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_0__1__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_0__2"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:700:1: rule__DotGraph__Group_3_0__2 : rule__DotGraph__Group_3_0__2__Impl rule__DotGraph__Group_3_0__3 ;
    public final void rule__DotGraph__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:704:1: ( rule__DotGraph__Group_3_0__2__Impl rule__DotGraph__Group_3_0__3 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:705:2: rule__DotGraph__Group_3_0__2__Impl rule__DotGraph__Group_3_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__2__Impl_in_rule__DotGraph__Group_3_0__21416);
            rule__DotGraph__Group_3_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__3_in_rule__DotGraph__Group_3_0__21419);
            rule__DotGraph__Group_3_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_0__2"


    // $ANTLR start "rule__DotGraph__Group_3_0__2__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:712:1: rule__DotGraph__Group_3_0__2__Impl : ( ( rule__DotGraph__GraphSettingsAssignment_3_0_2 ) ) ;
    public final void rule__DotGraph__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:716:1: ( ( ( rule__DotGraph__GraphSettingsAssignment_3_0_2 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:717:1: ( ( rule__DotGraph__GraphSettingsAssignment_3_0_2 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:717:1: ( ( rule__DotGraph__GraphSettingsAssignment_3_0_2 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:718:1: ( rule__DotGraph__GraphSettingsAssignment_3_0_2 )
            {
             before(grammarAccess.getDotGraphAccess().getGraphSettingsAssignment_3_0_2()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:719:1: ( rule__DotGraph__GraphSettingsAssignment_3_0_2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:719:2: rule__DotGraph__GraphSettingsAssignment_3_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__GraphSettingsAssignment_3_0_2_in_rule__DotGraph__Group_3_0__2__Impl1446);
            rule__DotGraph__GraphSettingsAssignment_3_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDotGraphAccess().getGraphSettingsAssignment_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_0__2__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_0__3"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:729:1: rule__DotGraph__Group_3_0__3 : rule__DotGraph__Group_3_0__3__Impl rule__DotGraph__Group_3_0__4 ;
    public final void rule__DotGraph__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:733:1: ( rule__DotGraph__Group_3_0__3__Impl rule__DotGraph__Group_3_0__4 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:734:2: rule__DotGraph__Group_3_0__3__Impl rule__DotGraph__Group_3_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__3__Impl_in_rule__DotGraph__Group_3_0__31476);
            rule__DotGraph__Group_3_0__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__4_in_rule__DotGraph__Group_3_0__31479);
            rule__DotGraph__Group_3_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_0__3"


    // $ANTLR start "rule__DotGraph__Group_3_0__3__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:741:1: rule__DotGraph__Group_3_0__3__Impl : ( ( rule__DotGraph__Group_3_0_3__0 )* ) ;
    public final void rule__DotGraph__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:745:1: ( ( ( rule__DotGraph__Group_3_0_3__0 )* ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:746:1: ( ( rule__DotGraph__Group_3_0_3__0 )* )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:746:1: ( ( rule__DotGraph__Group_3_0_3__0 )* )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:747:1: ( rule__DotGraph__Group_3_0_3__0 )*
            {
             before(grammarAccess.getDotGraphAccess().getGroup_3_0_3()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:748:1: ( rule__DotGraph__Group_3_0_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:748:2: rule__DotGraph__Group_3_0_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0_3__0_in_rule__DotGraph__Group_3_0__3__Impl1506);
            	    rule__DotGraph__Group_3_0_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDotGraphAccess().getGroup_3_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_0__3__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_0__4"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:758:1: rule__DotGraph__Group_3_0__4 : rule__DotGraph__Group_3_0__4__Impl rule__DotGraph__Group_3_0__5 ;
    public final void rule__DotGraph__Group_3_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:762:1: ( rule__DotGraph__Group_3_0__4__Impl rule__DotGraph__Group_3_0__5 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:763:2: rule__DotGraph__Group_3_0__4__Impl rule__DotGraph__Group_3_0__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__4__Impl_in_rule__DotGraph__Group_3_0__41537);
            rule__DotGraph__Group_3_0__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__5_in_rule__DotGraph__Group_3_0__41540);
            rule__DotGraph__Group_3_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_0__4"


    // $ANTLR start "rule__DotGraph__Group_3_0__4__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:770:1: rule__DotGraph__Group_3_0__4__Impl : ( ']' ) ;
    public final void rule__DotGraph__Group_3_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:774:1: ( ( ']' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:775:1: ( ']' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:775:1: ( ']' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:776:1: ']'
            {
             before(grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_3_0_4()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__DotGraph__Group_3_0__4__Impl1568); 
             after(grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_3_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_0__4__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_0__5"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:789:1: rule__DotGraph__Group_3_0__5 : rule__DotGraph__Group_3_0__5__Impl ;
    public final void rule__DotGraph__Group_3_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:793:1: ( rule__DotGraph__Group_3_0__5__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:794:2: rule__DotGraph__Group_3_0__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__5__Impl_in_rule__DotGraph__Group_3_0__51599);
            rule__DotGraph__Group_3_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_0__5"


    // $ANTLR start "rule__DotGraph__Group_3_0__5__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:800:1: rule__DotGraph__Group_3_0__5__Impl : ( ( ';' )? ) ;
    public final void rule__DotGraph__Group_3_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:804:1: ( ( ( ';' )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:805:1: ( ( ';' )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:805:1: ( ( ';' )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:806:1: ( ';' )?
            {
             before(grammarAccess.getDotGraphAccess().getSemicolonKeyword_3_0_5()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:807:1: ( ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:808:2: ';'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__DotGraph__Group_3_0__5__Impl1628); 

                    }
                    break;

            }

             after(grammarAccess.getDotGraphAccess().getSemicolonKeyword_3_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_0__5__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_0_3__0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:831:1: rule__DotGraph__Group_3_0_3__0 : rule__DotGraph__Group_3_0_3__0__Impl rule__DotGraph__Group_3_0_3__1 ;
    public final void rule__DotGraph__Group_3_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:835:1: ( rule__DotGraph__Group_3_0_3__0__Impl rule__DotGraph__Group_3_0_3__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:836:2: rule__DotGraph__Group_3_0_3__0__Impl rule__DotGraph__Group_3_0_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0_3__0__Impl_in_rule__DotGraph__Group_3_0_3__01673);
            rule__DotGraph__Group_3_0_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0_3__1_in_rule__DotGraph__Group_3_0_3__01676);
            rule__DotGraph__Group_3_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_0_3__0"


    // $ANTLR start "rule__DotGraph__Group_3_0_3__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:843:1: rule__DotGraph__Group_3_0_3__0__Impl : ( ',' ) ;
    public final void rule__DotGraph__Group_3_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:847:1: ( ( ',' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:848:1: ( ',' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:848:1: ( ',' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:849:1: ','
            {
             before(grammarAccess.getDotGraphAccess().getCommaKeyword_3_0_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__DotGraph__Group_3_0_3__0__Impl1704); 
             after(grammarAccess.getDotGraphAccess().getCommaKeyword_3_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_0_3__0__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_0_3__1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:862:1: rule__DotGraph__Group_3_0_3__1 : rule__DotGraph__Group_3_0_3__1__Impl ;
    public final void rule__DotGraph__Group_3_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:866:1: ( rule__DotGraph__Group_3_0_3__1__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:867:2: rule__DotGraph__Group_3_0_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0_3__1__Impl_in_rule__DotGraph__Group_3_0_3__11735);
            rule__DotGraph__Group_3_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_0_3__1"


    // $ANTLR start "rule__DotGraph__Group_3_0_3__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:873:1: rule__DotGraph__Group_3_0_3__1__Impl : ( ( rule__DotGraph__GraphSettingsAssignment_3_0_3_1 ) ) ;
    public final void rule__DotGraph__Group_3_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:877:1: ( ( ( rule__DotGraph__GraphSettingsAssignment_3_0_3_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:878:1: ( ( rule__DotGraph__GraphSettingsAssignment_3_0_3_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:878:1: ( ( rule__DotGraph__GraphSettingsAssignment_3_0_3_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:879:1: ( rule__DotGraph__GraphSettingsAssignment_3_0_3_1 )
            {
             before(grammarAccess.getDotGraphAccess().getGraphSettingsAssignment_3_0_3_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:880:1: ( rule__DotGraph__GraphSettingsAssignment_3_0_3_1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:880:2: rule__DotGraph__GraphSettingsAssignment_3_0_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__GraphSettingsAssignment_3_0_3_1_in_rule__DotGraph__Group_3_0_3__1__Impl1762);
            rule__DotGraph__GraphSettingsAssignment_3_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDotGraphAccess().getGraphSettingsAssignment_3_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_0_3__1__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_1__0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:894:1: rule__DotGraph__Group_3_1__0 : rule__DotGraph__Group_3_1__0__Impl rule__DotGraph__Group_3_1__1 ;
    public final void rule__DotGraph__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:898:1: ( rule__DotGraph__Group_3_1__0__Impl rule__DotGraph__Group_3_1__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:899:2: rule__DotGraph__Group_3_1__0__Impl rule__DotGraph__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__0__Impl_in_rule__DotGraph__Group_3_1__01796);
            rule__DotGraph__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__1_in_rule__DotGraph__Group_3_1__01799);
            rule__DotGraph__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_1__0"


    // $ANTLR start "rule__DotGraph__Group_3_1__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:906:1: rule__DotGraph__Group_3_1__0__Impl : ( 'node' ) ;
    public final void rule__DotGraph__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:910:1: ( ( 'node' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:911:1: ( 'node' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:911:1: ( 'node' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:912:1: 'node'
            {
             before(grammarAccess.getDotGraphAccess().getNodeKeyword_3_1_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__DotGraph__Group_3_1__0__Impl1827); 
             after(grammarAccess.getDotGraphAccess().getNodeKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_1__0__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_1__1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:925:1: rule__DotGraph__Group_3_1__1 : rule__DotGraph__Group_3_1__1__Impl rule__DotGraph__Group_3_1__2 ;
    public final void rule__DotGraph__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:929:1: ( rule__DotGraph__Group_3_1__1__Impl rule__DotGraph__Group_3_1__2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:930:2: rule__DotGraph__Group_3_1__1__Impl rule__DotGraph__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__1__Impl_in_rule__DotGraph__Group_3_1__11858);
            rule__DotGraph__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__2_in_rule__DotGraph__Group_3_1__11861);
            rule__DotGraph__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_1__1"


    // $ANTLR start "rule__DotGraph__Group_3_1__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:937:1: rule__DotGraph__Group_3_1__1__Impl : ( '[' ) ;
    public final void rule__DotGraph__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:941:1: ( ( '[' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:942:1: ( '[' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:942:1: ( '[' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:943:1: '['
            {
             before(grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_3_1_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__DotGraph__Group_3_1__1__Impl1889); 
             after(grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_1__1__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_1__2"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:956:1: rule__DotGraph__Group_3_1__2 : rule__DotGraph__Group_3_1__2__Impl rule__DotGraph__Group_3_1__3 ;
    public final void rule__DotGraph__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:960:1: ( rule__DotGraph__Group_3_1__2__Impl rule__DotGraph__Group_3_1__3 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:961:2: rule__DotGraph__Group_3_1__2__Impl rule__DotGraph__Group_3_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__2__Impl_in_rule__DotGraph__Group_3_1__21920);
            rule__DotGraph__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__3_in_rule__DotGraph__Group_3_1__21923);
            rule__DotGraph__Group_3_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_1__2"


    // $ANTLR start "rule__DotGraph__Group_3_1__2__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:968:1: rule__DotGraph__Group_3_1__2__Impl : ( ( rule__DotGraph__NodeSettingsAssignment_3_1_2 ) ) ;
    public final void rule__DotGraph__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:972:1: ( ( ( rule__DotGraph__NodeSettingsAssignment_3_1_2 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:973:1: ( ( rule__DotGraph__NodeSettingsAssignment_3_1_2 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:973:1: ( ( rule__DotGraph__NodeSettingsAssignment_3_1_2 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:974:1: ( rule__DotGraph__NodeSettingsAssignment_3_1_2 )
            {
             before(grammarAccess.getDotGraphAccess().getNodeSettingsAssignment_3_1_2()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:975:1: ( rule__DotGraph__NodeSettingsAssignment_3_1_2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:975:2: rule__DotGraph__NodeSettingsAssignment_3_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__NodeSettingsAssignment_3_1_2_in_rule__DotGraph__Group_3_1__2__Impl1950);
            rule__DotGraph__NodeSettingsAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDotGraphAccess().getNodeSettingsAssignment_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_1__2__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_1__3"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:985:1: rule__DotGraph__Group_3_1__3 : rule__DotGraph__Group_3_1__3__Impl rule__DotGraph__Group_3_1__4 ;
    public final void rule__DotGraph__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:989:1: ( rule__DotGraph__Group_3_1__3__Impl rule__DotGraph__Group_3_1__4 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:990:2: rule__DotGraph__Group_3_1__3__Impl rule__DotGraph__Group_3_1__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__3__Impl_in_rule__DotGraph__Group_3_1__31980);
            rule__DotGraph__Group_3_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__4_in_rule__DotGraph__Group_3_1__31983);
            rule__DotGraph__Group_3_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_1__3"


    // $ANTLR start "rule__DotGraph__Group_3_1__3__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:997:1: rule__DotGraph__Group_3_1__3__Impl : ( ( rule__DotGraph__Group_3_1_3__0 )* ) ;
    public final void rule__DotGraph__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1001:1: ( ( ( rule__DotGraph__Group_3_1_3__0 )* ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1002:1: ( ( rule__DotGraph__Group_3_1_3__0 )* )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1002:1: ( ( rule__DotGraph__Group_3_1_3__0 )* )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1003:1: ( rule__DotGraph__Group_3_1_3__0 )*
            {
             before(grammarAccess.getDotGraphAccess().getGroup_3_1_3()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1004:1: ( rule__DotGraph__Group_3_1_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1004:2: rule__DotGraph__Group_3_1_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1_3__0_in_rule__DotGraph__Group_3_1__3__Impl2010);
            	    rule__DotGraph__Group_3_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDotGraphAccess().getGroup_3_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_1__3__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_1__4"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1014:1: rule__DotGraph__Group_3_1__4 : rule__DotGraph__Group_3_1__4__Impl rule__DotGraph__Group_3_1__5 ;
    public final void rule__DotGraph__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1018:1: ( rule__DotGraph__Group_3_1__4__Impl rule__DotGraph__Group_3_1__5 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1019:2: rule__DotGraph__Group_3_1__4__Impl rule__DotGraph__Group_3_1__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__4__Impl_in_rule__DotGraph__Group_3_1__42041);
            rule__DotGraph__Group_3_1__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__5_in_rule__DotGraph__Group_3_1__42044);
            rule__DotGraph__Group_3_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_1__4"


    // $ANTLR start "rule__DotGraph__Group_3_1__4__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1026:1: rule__DotGraph__Group_3_1__4__Impl : ( ']' ) ;
    public final void rule__DotGraph__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1030:1: ( ( ']' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1031:1: ( ']' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1031:1: ( ']' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1032:1: ']'
            {
             before(grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_3_1_4()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__DotGraph__Group_3_1__4__Impl2072); 
             after(grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_3_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_1__4__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_1__5"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1045:1: rule__DotGraph__Group_3_1__5 : rule__DotGraph__Group_3_1__5__Impl ;
    public final void rule__DotGraph__Group_3_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1049:1: ( rule__DotGraph__Group_3_1__5__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1050:2: rule__DotGraph__Group_3_1__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__5__Impl_in_rule__DotGraph__Group_3_1__52103);
            rule__DotGraph__Group_3_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_1__5"


    // $ANTLR start "rule__DotGraph__Group_3_1__5__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1056:1: rule__DotGraph__Group_3_1__5__Impl : ( ( ';' )? ) ;
    public final void rule__DotGraph__Group_3_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1060:1: ( ( ( ';' )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1061:1: ( ( ';' )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1061:1: ( ( ';' )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1062:1: ( ';' )?
            {
             before(grammarAccess.getDotGraphAccess().getSemicolonKeyword_3_1_5()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1063:1: ( ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1064:2: ';'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__DotGraph__Group_3_1__5__Impl2132); 

                    }
                    break;

            }

             after(grammarAccess.getDotGraphAccess().getSemicolonKeyword_3_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_1__5__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_1_3__0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1087:1: rule__DotGraph__Group_3_1_3__0 : rule__DotGraph__Group_3_1_3__0__Impl rule__DotGraph__Group_3_1_3__1 ;
    public final void rule__DotGraph__Group_3_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1091:1: ( rule__DotGraph__Group_3_1_3__0__Impl rule__DotGraph__Group_3_1_3__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1092:2: rule__DotGraph__Group_3_1_3__0__Impl rule__DotGraph__Group_3_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1_3__0__Impl_in_rule__DotGraph__Group_3_1_3__02177);
            rule__DotGraph__Group_3_1_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1_3__1_in_rule__DotGraph__Group_3_1_3__02180);
            rule__DotGraph__Group_3_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_1_3__0"


    // $ANTLR start "rule__DotGraph__Group_3_1_3__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1099:1: rule__DotGraph__Group_3_1_3__0__Impl : ( ',' ) ;
    public final void rule__DotGraph__Group_3_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1103:1: ( ( ',' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1104:1: ( ',' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1104:1: ( ',' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1105:1: ','
            {
             before(grammarAccess.getDotGraphAccess().getCommaKeyword_3_1_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__DotGraph__Group_3_1_3__0__Impl2208); 
             after(grammarAccess.getDotGraphAccess().getCommaKeyword_3_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_1_3__0__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_1_3__1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1118:1: rule__DotGraph__Group_3_1_3__1 : rule__DotGraph__Group_3_1_3__1__Impl ;
    public final void rule__DotGraph__Group_3_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1122:1: ( rule__DotGraph__Group_3_1_3__1__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1123:2: rule__DotGraph__Group_3_1_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1_3__1__Impl_in_rule__DotGraph__Group_3_1_3__12239);
            rule__DotGraph__Group_3_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_1_3__1"


    // $ANTLR start "rule__DotGraph__Group_3_1_3__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1129:1: rule__DotGraph__Group_3_1_3__1__Impl : ( ( rule__DotGraph__NodeSettingsAssignment_3_1_3_1 ) ) ;
    public final void rule__DotGraph__Group_3_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1133:1: ( ( ( rule__DotGraph__NodeSettingsAssignment_3_1_3_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1134:1: ( ( rule__DotGraph__NodeSettingsAssignment_3_1_3_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1134:1: ( ( rule__DotGraph__NodeSettingsAssignment_3_1_3_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1135:1: ( rule__DotGraph__NodeSettingsAssignment_3_1_3_1 )
            {
             before(grammarAccess.getDotGraphAccess().getNodeSettingsAssignment_3_1_3_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1136:1: ( rule__DotGraph__NodeSettingsAssignment_3_1_3_1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1136:2: rule__DotGraph__NodeSettingsAssignment_3_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__NodeSettingsAssignment_3_1_3_1_in_rule__DotGraph__Group_3_1_3__1__Impl2266);
            rule__DotGraph__NodeSettingsAssignment_3_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDotGraphAccess().getNodeSettingsAssignment_3_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_1_3__1__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_2__0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1150:1: rule__DotGraph__Group_3_2__0 : rule__DotGraph__Group_3_2__0__Impl rule__DotGraph__Group_3_2__1 ;
    public final void rule__DotGraph__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1154:1: ( rule__DotGraph__Group_3_2__0__Impl rule__DotGraph__Group_3_2__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1155:2: rule__DotGraph__Group_3_2__0__Impl rule__DotGraph__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__0__Impl_in_rule__DotGraph__Group_3_2__02300);
            rule__DotGraph__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__1_in_rule__DotGraph__Group_3_2__02303);
            rule__DotGraph__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_2__0"


    // $ANTLR start "rule__DotGraph__Group_3_2__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1162:1: rule__DotGraph__Group_3_2__0__Impl : ( 'edge' ) ;
    public final void rule__DotGraph__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1166:1: ( ( 'edge' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1167:1: ( 'edge' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1167:1: ( 'edge' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1168:1: 'edge'
            {
             before(grammarAccess.getDotGraphAccess().getEdgeKeyword_3_2_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__DotGraph__Group_3_2__0__Impl2331); 
             after(grammarAccess.getDotGraphAccess().getEdgeKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_2__0__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_2__1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1181:1: rule__DotGraph__Group_3_2__1 : rule__DotGraph__Group_3_2__1__Impl rule__DotGraph__Group_3_2__2 ;
    public final void rule__DotGraph__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1185:1: ( rule__DotGraph__Group_3_2__1__Impl rule__DotGraph__Group_3_2__2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1186:2: rule__DotGraph__Group_3_2__1__Impl rule__DotGraph__Group_3_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__1__Impl_in_rule__DotGraph__Group_3_2__12362);
            rule__DotGraph__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__2_in_rule__DotGraph__Group_3_2__12365);
            rule__DotGraph__Group_3_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_2__1"


    // $ANTLR start "rule__DotGraph__Group_3_2__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1193:1: rule__DotGraph__Group_3_2__1__Impl : ( '[' ) ;
    public final void rule__DotGraph__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1197:1: ( ( '[' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1198:1: ( '[' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1198:1: ( '[' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1199:1: '['
            {
             before(grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_3_2_1()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__DotGraph__Group_3_2__1__Impl2393); 
             after(grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_2__1__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_2__2"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1212:1: rule__DotGraph__Group_3_2__2 : rule__DotGraph__Group_3_2__2__Impl rule__DotGraph__Group_3_2__3 ;
    public final void rule__DotGraph__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1216:1: ( rule__DotGraph__Group_3_2__2__Impl rule__DotGraph__Group_3_2__3 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1217:2: rule__DotGraph__Group_3_2__2__Impl rule__DotGraph__Group_3_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__2__Impl_in_rule__DotGraph__Group_3_2__22424);
            rule__DotGraph__Group_3_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__3_in_rule__DotGraph__Group_3_2__22427);
            rule__DotGraph__Group_3_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_2__2"


    // $ANTLR start "rule__DotGraph__Group_3_2__2__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1224:1: rule__DotGraph__Group_3_2__2__Impl : ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_2 ) ) ;
    public final void rule__DotGraph__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1228:1: ( ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_2 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1229:1: ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_2 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1229:1: ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_2 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1230:1: ( rule__DotGraph__EdgeSettingsAssignment_3_2_2 )
            {
             before(grammarAccess.getDotGraphAccess().getEdgeSettingsAssignment_3_2_2()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1231:1: ( rule__DotGraph__EdgeSettingsAssignment_3_2_2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1231:2: rule__DotGraph__EdgeSettingsAssignment_3_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__EdgeSettingsAssignment_3_2_2_in_rule__DotGraph__Group_3_2__2__Impl2454);
            rule__DotGraph__EdgeSettingsAssignment_3_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDotGraphAccess().getEdgeSettingsAssignment_3_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_2__2__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_2__3"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1241:1: rule__DotGraph__Group_3_2__3 : rule__DotGraph__Group_3_2__3__Impl rule__DotGraph__Group_3_2__4 ;
    public final void rule__DotGraph__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1245:1: ( rule__DotGraph__Group_3_2__3__Impl rule__DotGraph__Group_3_2__4 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1246:2: rule__DotGraph__Group_3_2__3__Impl rule__DotGraph__Group_3_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__3__Impl_in_rule__DotGraph__Group_3_2__32484);
            rule__DotGraph__Group_3_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__4_in_rule__DotGraph__Group_3_2__32487);
            rule__DotGraph__Group_3_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_2__3"


    // $ANTLR start "rule__DotGraph__Group_3_2__3__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1253:1: rule__DotGraph__Group_3_2__3__Impl : ( ( rule__DotGraph__Group_3_2_3__0 )* ) ;
    public final void rule__DotGraph__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1257:1: ( ( ( rule__DotGraph__Group_3_2_3__0 )* ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1258:1: ( ( rule__DotGraph__Group_3_2_3__0 )* )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1258:1: ( ( rule__DotGraph__Group_3_2_3__0 )* )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1259:1: ( rule__DotGraph__Group_3_2_3__0 )*
            {
             before(grammarAccess.getDotGraphAccess().getGroup_3_2_3()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1260:1: ( rule__DotGraph__Group_3_2_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1260:2: rule__DotGraph__Group_3_2_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2_3__0_in_rule__DotGraph__Group_3_2__3__Impl2514);
            	    rule__DotGraph__Group_3_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDotGraphAccess().getGroup_3_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_2__3__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_2__4"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1270:1: rule__DotGraph__Group_3_2__4 : rule__DotGraph__Group_3_2__4__Impl rule__DotGraph__Group_3_2__5 ;
    public final void rule__DotGraph__Group_3_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1274:1: ( rule__DotGraph__Group_3_2__4__Impl rule__DotGraph__Group_3_2__5 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1275:2: rule__DotGraph__Group_3_2__4__Impl rule__DotGraph__Group_3_2__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__4__Impl_in_rule__DotGraph__Group_3_2__42545);
            rule__DotGraph__Group_3_2__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__5_in_rule__DotGraph__Group_3_2__42548);
            rule__DotGraph__Group_3_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_2__4"


    // $ANTLR start "rule__DotGraph__Group_3_2__4__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1282:1: rule__DotGraph__Group_3_2__4__Impl : ( ']' ) ;
    public final void rule__DotGraph__Group_3_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1286:1: ( ( ']' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1287:1: ( ']' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1287:1: ( ']' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1288:1: ']'
            {
             before(grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_3_2_4()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__DotGraph__Group_3_2__4__Impl2576); 
             after(grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_3_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_2__4__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_2__5"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1301:1: rule__DotGraph__Group_3_2__5 : rule__DotGraph__Group_3_2__5__Impl ;
    public final void rule__DotGraph__Group_3_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1305:1: ( rule__DotGraph__Group_3_2__5__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1306:2: rule__DotGraph__Group_3_2__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__5__Impl_in_rule__DotGraph__Group_3_2__52607);
            rule__DotGraph__Group_3_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_2__5"


    // $ANTLR start "rule__DotGraph__Group_3_2__5__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1312:1: rule__DotGraph__Group_3_2__5__Impl : ( ( ';' )? ) ;
    public final void rule__DotGraph__Group_3_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1316:1: ( ( ( ';' )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1317:1: ( ( ';' )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1317:1: ( ( ';' )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1318:1: ( ';' )?
            {
             before(grammarAccess.getDotGraphAccess().getSemicolonKeyword_3_2_5()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1319:1: ( ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1320:2: ';'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__DotGraph__Group_3_2__5__Impl2636); 

                    }
                    break;

            }

             after(grammarAccess.getDotGraphAccess().getSemicolonKeyword_3_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_2__5__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_2_3__0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1343:1: rule__DotGraph__Group_3_2_3__0 : rule__DotGraph__Group_3_2_3__0__Impl rule__DotGraph__Group_3_2_3__1 ;
    public final void rule__DotGraph__Group_3_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1347:1: ( rule__DotGraph__Group_3_2_3__0__Impl rule__DotGraph__Group_3_2_3__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1348:2: rule__DotGraph__Group_3_2_3__0__Impl rule__DotGraph__Group_3_2_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2_3__0__Impl_in_rule__DotGraph__Group_3_2_3__02681);
            rule__DotGraph__Group_3_2_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2_3__1_in_rule__DotGraph__Group_3_2_3__02684);
            rule__DotGraph__Group_3_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_2_3__0"


    // $ANTLR start "rule__DotGraph__Group_3_2_3__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1355:1: rule__DotGraph__Group_3_2_3__0__Impl : ( ',' ) ;
    public final void rule__DotGraph__Group_3_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1359:1: ( ( ',' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1360:1: ( ',' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1360:1: ( ',' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1361:1: ','
            {
             before(grammarAccess.getDotGraphAccess().getCommaKeyword_3_2_3_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__DotGraph__Group_3_2_3__0__Impl2712); 
             after(grammarAccess.getDotGraphAccess().getCommaKeyword_3_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_2_3__0__Impl"


    // $ANTLR start "rule__DotGraph__Group_3_2_3__1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1374:1: rule__DotGraph__Group_3_2_3__1 : rule__DotGraph__Group_3_2_3__1__Impl ;
    public final void rule__DotGraph__Group_3_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1378:1: ( rule__DotGraph__Group_3_2_3__1__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1379:2: rule__DotGraph__Group_3_2_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2_3__1__Impl_in_rule__DotGraph__Group_3_2_3__12743);
            rule__DotGraph__Group_3_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_2_3__1"


    // $ANTLR start "rule__DotGraph__Group_3_2_3__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1385:1: rule__DotGraph__Group_3_2_3__1__Impl : ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_3_1 ) ) ;
    public final void rule__DotGraph__Group_3_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1389:1: ( ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_3_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1390:1: ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_3_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1390:1: ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_3_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1391:1: ( rule__DotGraph__EdgeSettingsAssignment_3_2_3_1 )
            {
             before(grammarAccess.getDotGraphAccess().getEdgeSettingsAssignment_3_2_3_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1392:1: ( rule__DotGraph__EdgeSettingsAssignment_3_2_3_1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1392:2: rule__DotGraph__EdgeSettingsAssignment_3_2_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__EdgeSettingsAssignment_3_2_3_1_in_rule__DotGraph__Group_3_2_3__1__Impl2770);
            rule__DotGraph__EdgeSettingsAssignment_3_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDotGraphAccess().getEdgeSettingsAssignment_3_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_3_2_3__1__Impl"


    // $ANTLR start "rule__DotNode__Group__0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1406:1: rule__DotNode__Group__0 : rule__DotNode__Group__0__Impl rule__DotNode__Group__1 ;
    public final void rule__DotNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1410:1: ( rule__DotNode__Group__0__Impl rule__DotNode__Group__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1411:2: rule__DotNode__Group__0__Impl rule__DotNode__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group__0__Impl_in_rule__DotNode__Group__02804);
            rule__DotNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group__1_in_rule__DotNode__Group__02807);
            rule__DotNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNode__Group__0"


    // $ANTLR start "rule__DotNode__Group__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1418:1: rule__DotNode__Group__0__Impl : ( ( rule__DotNode__NameAssignment_0 ) ) ;
    public final void rule__DotNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1422:1: ( ( ( rule__DotNode__NameAssignment_0 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1423:1: ( ( rule__DotNode__NameAssignment_0 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1423:1: ( ( rule__DotNode__NameAssignment_0 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1424:1: ( rule__DotNode__NameAssignment_0 )
            {
             before(grammarAccess.getDotNodeAccess().getNameAssignment_0()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1425:1: ( rule__DotNode__NameAssignment_0 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1425:2: rule__DotNode__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__NameAssignment_0_in_rule__DotNode__Group__0__Impl2834);
            rule__DotNode__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDotNodeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNode__Group__0__Impl"


    // $ANTLR start "rule__DotNode__Group__1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1435:1: rule__DotNode__Group__1 : rule__DotNode__Group__1__Impl rule__DotNode__Group__2 ;
    public final void rule__DotNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1439:1: ( rule__DotNode__Group__1__Impl rule__DotNode__Group__2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1440:2: rule__DotNode__Group__1__Impl rule__DotNode__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group__1__Impl_in_rule__DotNode__Group__12864);
            rule__DotNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group__2_in_rule__DotNode__Group__12867);
            rule__DotNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNode__Group__1"


    // $ANTLR start "rule__DotNode__Group__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1447:1: rule__DotNode__Group__1__Impl : ( ( rule__DotNode__Group_1__0 )? ) ;
    public final void rule__DotNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1451:1: ( ( ( rule__DotNode__Group_1__0 )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1452:1: ( ( rule__DotNode__Group_1__0 )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1452:1: ( ( rule__DotNode__Group_1__0 )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1453:1: ( rule__DotNode__Group_1__0 )?
            {
             before(grammarAccess.getDotNodeAccess().getGroup_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1454:1: ( rule__DotNode__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1454:2: rule__DotNode__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1__0_in_rule__DotNode__Group__1__Impl2894);
                    rule__DotNode__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDotNodeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNode__Group__1__Impl"


    // $ANTLR start "rule__DotNode__Group__2"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1464:1: rule__DotNode__Group__2 : rule__DotNode__Group__2__Impl ;
    public final void rule__DotNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1468:1: ( rule__DotNode__Group__2__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1469:2: rule__DotNode__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group__2__Impl_in_rule__DotNode__Group__22925);
            rule__DotNode__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNode__Group__2"


    // $ANTLR start "rule__DotNode__Group__2__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1475:1: rule__DotNode__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__DotNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1479:1: ( ( ( ';' )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1480:1: ( ( ';' )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1480:1: ( ( ';' )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1481:1: ( ';' )?
            {
             before(grammarAccess.getDotNodeAccess().getSemicolonKeyword_2()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1482:1: ( ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1483:2: ';'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__DotNode__Group__2__Impl2954); 

                    }
                    break;

            }

             after(grammarAccess.getDotNodeAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNode__Group__2__Impl"


    // $ANTLR start "rule__DotNode__Group_1__0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1500:1: rule__DotNode__Group_1__0 : rule__DotNode__Group_1__0__Impl rule__DotNode__Group_1__1 ;
    public final void rule__DotNode__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1504:1: ( rule__DotNode__Group_1__0__Impl rule__DotNode__Group_1__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1505:2: rule__DotNode__Group_1__0__Impl rule__DotNode__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1__0__Impl_in_rule__DotNode__Group_1__02993);
            rule__DotNode__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1__1_in_rule__DotNode__Group_1__02996);
            rule__DotNode__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNode__Group_1__0"


    // $ANTLR start "rule__DotNode__Group_1__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1512:1: rule__DotNode__Group_1__0__Impl : ( '[' ) ;
    public final void rule__DotNode__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1516:1: ( ( '[' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1517:1: ( '[' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1517:1: ( '[' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1518:1: '['
            {
             before(grammarAccess.getDotNodeAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__DotNode__Group_1__0__Impl3024); 
             after(grammarAccess.getDotNodeAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNode__Group_1__0__Impl"


    // $ANTLR start "rule__DotNode__Group_1__1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1531:1: rule__DotNode__Group_1__1 : rule__DotNode__Group_1__1__Impl rule__DotNode__Group_1__2 ;
    public final void rule__DotNode__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1535:1: ( rule__DotNode__Group_1__1__Impl rule__DotNode__Group_1__2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1536:2: rule__DotNode__Group_1__1__Impl rule__DotNode__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1__1__Impl_in_rule__DotNode__Group_1__13055);
            rule__DotNode__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1__2_in_rule__DotNode__Group_1__13058);
            rule__DotNode__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNode__Group_1__1"


    // $ANTLR start "rule__DotNode__Group_1__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1543:1: rule__DotNode__Group_1__1__Impl : ( ( rule__DotNode__SettingsAssignment_1_1 ) ) ;
    public final void rule__DotNode__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1547:1: ( ( ( rule__DotNode__SettingsAssignment_1_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1548:1: ( ( rule__DotNode__SettingsAssignment_1_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1548:1: ( ( rule__DotNode__SettingsAssignment_1_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1549:1: ( rule__DotNode__SettingsAssignment_1_1 )
            {
             before(grammarAccess.getDotNodeAccess().getSettingsAssignment_1_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1550:1: ( rule__DotNode__SettingsAssignment_1_1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1550:2: rule__DotNode__SettingsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__SettingsAssignment_1_1_in_rule__DotNode__Group_1__1__Impl3085);
            rule__DotNode__SettingsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDotNodeAccess().getSettingsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNode__Group_1__1__Impl"


    // $ANTLR start "rule__DotNode__Group_1__2"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1560:1: rule__DotNode__Group_1__2 : rule__DotNode__Group_1__2__Impl rule__DotNode__Group_1__3 ;
    public final void rule__DotNode__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1564:1: ( rule__DotNode__Group_1__2__Impl rule__DotNode__Group_1__3 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1565:2: rule__DotNode__Group_1__2__Impl rule__DotNode__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1__2__Impl_in_rule__DotNode__Group_1__23115);
            rule__DotNode__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1__3_in_rule__DotNode__Group_1__23118);
            rule__DotNode__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNode__Group_1__2"


    // $ANTLR start "rule__DotNode__Group_1__2__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1572:1: rule__DotNode__Group_1__2__Impl : ( ( rule__DotNode__Group_1_2__0 )* ) ;
    public final void rule__DotNode__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1576:1: ( ( ( rule__DotNode__Group_1_2__0 )* ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1577:1: ( ( rule__DotNode__Group_1_2__0 )* )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1577:1: ( ( rule__DotNode__Group_1_2__0 )* )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1578:1: ( rule__DotNode__Group_1_2__0 )*
            {
             before(grammarAccess.getDotNodeAccess().getGroup_1_2()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1579:1: ( rule__DotNode__Group_1_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1579:2: rule__DotNode__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1_2__0_in_rule__DotNode__Group_1__2__Impl3145);
            	    rule__DotNode__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getDotNodeAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNode__Group_1__2__Impl"


    // $ANTLR start "rule__DotNode__Group_1__3"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1589:1: rule__DotNode__Group_1__3 : rule__DotNode__Group_1__3__Impl ;
    public final void rule__DotNode__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1593:1: ( rule__DotNode__Group_1__3__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1594:2: rule__DotNode__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1__3__Impl_in_rule__DotNode__Group_1__33176);
            rule__DotNode__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNode__Group_1__3"


    // $ANTLR start "rule__DotNode__Group_1__3__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1600:1: rule__DotNode__Group_1__3__Impl : ( ']' ) ;
    public final void rule__DotNode__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1604:1: ( ( ']' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1605:1: ( ']' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1605:1: ( ']' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1606:1: ']'
            {
             before(grammarAccess.getDotNodeAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__DotNode__Group_1__3__Impl3204); 
             after(grammarAccess.getDotNodeAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNode__Group_1__3__Impl"


    // $ANTLR start "rule__DotNode__Group_1_2__0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1627:1: rule__DotNode__Group_1_2__0 : rule__DotNode__Group_1_2__0__Impl rule__DotNode__Group_1_2__1 ;
    public final void rule__DotNode__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1631:1: ( rule__DotNode__Group_1_2__0__Impl rule__DotNode__Group_1_2__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1632:2: rule__DotNode__Group_1_2__0__Impl rule__DotNode__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1_2__0__Impl_in_rule__DotNode__Group_1_2__03243);
            rule__DotNode__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1_2__1_in_rule__DotNode__Group_1_2__03246);
            rule__DotNode__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNode__Group_1_2__0"


    // $ANTLR start "rule__DotNode__Group_1_2__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1639:1: rule__DotNode__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__DotNode__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1643:1: ( ( ',' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1644:1: ( ',' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1644:1: ( ',' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1645:1: ','
            {
             before(grammarAccess.getDotNodeAccess().getCommaKeyword_1_2_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__DotNode__Group_1_2__0__Impl3274); 
             after(grammarAccess.getDotNodeAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNode__Group_1_2__0__Impl"


    // $ANTLR start "rule__DotNode__Group_1_2__1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1658:1: rule__DotNode__Group_1_2__1 : rule__DotNode__Group_1_2__1__Impl ;
    public final void rule__DotNode__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1662:1: ( rule__DotNode__Group_1_2__1__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1663:2: rule__DotNode__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1_2__1__Impl_in_rule__DotNode__Group_1_2__13305);
            rule__DotNode__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNode__Group_1_2__1"


    // $ANTLR start "rule__DotNode__Group_1_2__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1669:1: rule__DotNode__Group_1_2__1__Impl : ( ( rule__DotNode__SettingsAssignment_1_2_1 ) ) ;
    public final void rule__DotNode__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1673:1: ( ( ( rule__DotNode__SettingsAssignment_1_2_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1674:1: ( ( rule__DotNode__SettingsAssignment_1_2_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1674:1: ( ( rule__DotNode__SettingsAssignment_1_2_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1675:1: ( rule__DotNode__SettingsAssignment_1_2_1 )
            {
             before(grammarAccess.getDotNodeAccess().getSettingsAssignment_1_2_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1676:1: ( rule__DotNode__SettingsAssignment_1_2_1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1676:2: rule__DotNode__SettingsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__SettingsAssignment_1_2_1_in_rule__DotNode__Group_1_2__1__Impl3332);
            rule__DotNode__SettingsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDotNodeAccess().getSettingsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNode__Group_1_2__1__Impl"


    // $ANTLR start "rule__DotEdge__Group__0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1690:1: rule__DotEdge__Group__0 : rule__DotEdge__Group__0__Impl rule__DotEdge__Group__1 ;
    public final void rule__DotEdge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1694:1: ( rule__DotEdge__Group__0__Impl rule__DotEdge__Group__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1695:2: rule__DotEdge__Group__0__Impl rule__DotEdge__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group__0__Impl_in_rule__DotEdge__Group__03366);
            rule__DotEdge__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group__1_in_rule__DotEdge__Group__03369);
            rule__DotEdge__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group__0"


    // $ANTLR start "rule__DotEdge__Group__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1702:1: rule__DotEdge__Group__0__Impl : ( ( rule__DotEdge__SourceAssignment_0 ) ) ;
    public final void rule__DotEdge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1706:1: ( ( ( rule__DotEdge__SourceAssignment_0 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1707:1: ( ( rule__DotEdge__SourceAssignment_0 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1707:1: ( ( rule__DotEdge__SourceAssignment_0 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1708:1: ( rule__DotEdge__SourceAssignment_0 )
            {
             before(grammarAccess.getDotEdgeAccess().getSourceAssignment_0()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1709:1: ( rule__DotEdge__SourceAssignment_0 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1709:2: rule__DotEdge__SourceAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__SourceAssignment_0_in_rule__DotEdge__Group__0__Impl3396);
            rule__DotEdge__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDotEdgeAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group__0__Impl"


    // $ANTLR start "rule__DotEdge__Group__1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1719:1: rule__DotEdge__Group__1 : rule__DotEdge__Group__1__Impl rule__DotEdge__Group__2 ;
    public final void rule__DotEdge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1723:1: ( rule__DotEdge__Group__1__Impl rule__DotEdge__Group__2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1724:2: rule__DotEdge__Group__1__Impl rule__DotEdge__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group__1__Impl_in_rule__DotEdge__Group__13426);
            rule__DotEdge__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group__2_in_rule__DotEdge__Group__13429);
            rule__DotEdge__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group__1"


    // $ANTLR start "rule__DotEdge__Group__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1731:1: rule__DotEdge__Group__1__Impl : ( ( rule__DotEdge__Alternatives_1 ) ) ;
    public final void rule__DotEdge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1735:1: ( ( ( rule__DotEdge__Alternatives_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1736:1: ( ( rule__DotEdge__Alternatives_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1736:1: ( ( rule__DotEdge__Alternatives_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1737:1: ( rule__DotEdge__Alternatives_1 )
            {
             before(grammarAccess.getDotEdgeAccess().getAlternatives_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1738:1: ( rule__DotEdge__Alternatives_1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1738:2: rule__DotEdge__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Alternatives_1_in_rule__DotEdge__Group__1__Impl3456);
            rule__DotEdge__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDotEdgeAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group__1__Impl"


    // $ANTLR start "rule__DotEdge__Group__2"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1748:1: rule__DotEdge__Group__2 : rule__DotEdge__Group__2__Impl rule__DotEdge__Group__3 ;
    public final void rule__DotEdge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1752:1: ( rule__DotEdge__Group__2__Impl rule__DotEdge__Group__3 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1753:2: rule__DotEdge__Group__2__Impl rule__DotEdge__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group__2__Impl_in_rule__DotEdge__Group__23486);
            rule__DotEdge__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group__3_in_rule__DotEdge__Group__23489);
            rule__DotEdge__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group__2"


    // $ANTLR start "rule__DotEdge__Group__2__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1760:1: rule__DotEdge__Group__2__Impl : ( ( rule__DotEdge__TargetAssignment_2 ) ) ;
    public final void rule__DotEdge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1764:1: ( ( ( rule__DotEdge__TargetAssignment_2 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1765:1: ( ( rule__DotEdge__TargetAssignment_2 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1765:1: ( ( rule__DotEdge__TargetAssignment_2 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1766:1: ( rule__DotEdge__TargetAssignment_2 )
            {
             before(grammarAccess.getDotEdgeAccess().getTargetAssignment_2()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1767:1: ( rule__DotEdge__TargetAssignment_2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1767:2: rule__DotEdge__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__TargetAssignment_2_in_rule__DotEdge__Group__2__Impl3516);
            rule__DotEdge__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDotEdgeAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group__2__Impl"


    // $ANTLR start "rule__DotEdge__Group__3"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1777:1: rule__DotEdge__Group__3 : rule__DotEdge__Group__3__Impl rule__DotEdge__Group__4 ;
    public final void rule__DotEdge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1781:1: ( rule__DotEdge__Group__3__Impl rule__DotEdge__Group__4 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1782:2: rule__DotEdge__Group__3__Impl rule__DotEdge__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group__3__Impl_in_rule__DotEdge__Group__33546);
            rule__DotEdge__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group__4_in_rule__DotEdge__Group__33549);
            rule__DotEdge__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group__3"


    // $ANTLR start "rule__DotEdge__Group__3__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1789:1: rule__DotEdge__Group__3__Impl : ( ( rule__DotEdge__Group_3__0 )? ) ;
    public final void rule__DotEdge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1793:1: ( ( ( rule__DotEdge__Group_3__0 )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1794:1: ( ( rule__DotEdge__Group_3__0 )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1794:1: ( ( rule__DotEdge__Group_3__0 )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1795:1: ( rule__DotEdge__Group_3__0 )?
            {
             before(grammarAccess.getDotEdgeAccess().getGroup_3()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1796:1: ( rule__DotEdge__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1796:2: rule__DotEdge__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3__0_in_rule__DotEdge__Group__3__Impl3576);
                    rule__DotEdge__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDotEdgeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group__3__Impl"


    // $ANTLR start "rule__DotEdge__Group__4"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1806:1: rule__DotEdge__Group__4 : rule__DotEdge__Group__4__Impl ;
    public final void rule__DotEdge__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1810:1: ( rule__DotEdge__Group__4__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1811:2: rule__DotEdge__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group__4__Impl_in_rule__DotEdge__Group__43607);
            rule__DotEdge__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group__4"


    // $ANTLR start "rule__DotEdge__Group__4__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1817:1: rule__DotEdge__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__DotEdge__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1821:1: ( ( ( ';' )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1822:1: ( ( ';' )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1822:1: ( ( ';' )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1823:1: ( ';' )?
            {
             before(grammarAccess.getDotEdgeAccess().getSemicolonKeyword_4()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1824:1: ( ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1825:2: ';'
                    {
                    match(input,21,FollowSets000.FOLLOW_21_in_rule__DotEdge__Group__4__Impl3636); 

                    }
                    break;

            }

             after(grammarAccess.getDotEdgeAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group__4__Impl"


    // $ANTLR start "rule__DotEdge__Group_3__0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1846:1: rule__DotEdge__Group_3__0 : rule__DotEdge__Group_3__0__Impl rule__DotEdge__Group_3__1 ;
    public final void rule__DotEdge__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1850:1: ( rule__DotEdge__Group_3__0__Impl rule__DotEdge__Group_3__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1851:2: rule__DotEdge__Group_3__0__Impl rule__DotEdge__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3__0__Impl_in_rule__DotEdge__Group_3__03679);
            rule__DotEdge__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3__1_in_rule__DotEdge__Group_3__03682);
            rule__DotEdge__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group_3__0"


    // $ANTLR start "rule__DotEdge__Group_3__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1858:1: rule__DotEdge__Group_3__0__Impl : ( '[' ) ;
    public final void rule__DotEdge__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1862:1: ( ( '[' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1863:1: ( '[' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1863:1: ( '[' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1864:1: '['
            {
             before(grammarAccess.getDotEdgeAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__DotEdge__Group_3__0__Impl3710); 
             after(grammarAccess.getDotEdgeAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group_3__0__Impl"


    // $ANTLR start "rule__DotEdge__Group_3__1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1877:1: rule__DotEdge__Group_3__1 : rule__DotEdge__Group_3__1__Impl rule__DotEdge__Group_3__2 ;
    public final void rule__DotEdge__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1881:1: ( rule__DotEdge__Group_3__1__Impl rule__DotEdge__Group_3__2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1882:2: rule__DotEdge__Group_3__1__Impl rule__DotEdge__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3__1__Impl_in_rule__DotEdge__Group_3__13741);
            rule__DotEdge__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3__2_in_rule__DotEdge__Group_3__13744);
            rule__DotEdge__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group_3__1"


    // $ANTLR start "rule__DotEdge__Group_3__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1889:1: rule__DotEdge__Group_3__1__Impl : ( ( rule__DotEdge__SettingsAssignment_3_1 ) ) ;
    public final void rule__DotEdge__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1893:1: ( ( ( rule__DotEdge__SettingsAssignment_3_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1894:1: ( ( rule__DotEdge__SettingsAssignment_3_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1894:1: ( ( rule__DotEdge__SettingsAssignment_3_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1895:1: ( rule__DotEdge__SettingsAssignment_3_1 )
            {
             before(grammarAccess.getDotEdgeAccess().getSettingsAssignment_3_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1896:1: ( rule__DotEdge__SettingsAssignment_3_1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1896:2: rule__DotEdge__SettingsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__SettingsAssignment_3_1_in_rule__DotEdge__Group_3__1__Impl3771);
            rule__DotEdge__SettingsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDotEdgeAccess().getSettingsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group_3__1__Impl"


    // $ANTLR start "rule__DotEdge__Group_3__2"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1906:1: rule__DotEdge__Group_3__2 : rule__DotEdge__Group_3__2__Impl rule__DotEdge__Group_3__3 ;
    public final void rule__DotEdge__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1910:1: ( rule__DotEdge__Group_3__2__Impl rule__DotEdge__Group_3__3 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1911:2: rule__DotEdge__Group_3__2__Impl rule__DotEdge__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3__2__Impl_in_rule__DotEdge__Group_3__23801);
            rule__DotEdge__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3__3_in_rule__DotEdge__Group_3__23804);
            rule__DotEdge__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group_3__2"


    // $ANTLR start "rule__DotEdge__Group_3__2__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1918:1: rule__DotEdge__Group_3__2__Impl : ( ( rule__DotEdge__Group_3_2__0 )* ) ;
    public final void rule__DotEdge__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1922:1: ( ( ( rule__DotEdge__Group_3_2__0 )* ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1923:1: ( ( rule__DotEdge__Group_3_2__0 )* )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1923:1: ( ( rule__DotEdge__Group_3_2__0 )* )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1924:1: ( rule__DotEdge__Group_3_2__0 )*
            {
             before(grammarAccess.getDotEdgeAccess().getGroup_3_2()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1925:1: ( rule__DotEdge__Group_3_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==22) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1925:2: rule__DotEdge__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3_2__0_in_rule__DotEdge__Group_3__2__Impl3831);
            	    rule__DotEdge__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getDotEdgeAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group_3__2__Impl"


    // $ANTLR start "rule__DotEdge__Group_3__3"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1935:1: rule__DotEdge__Group_3__3 : rule__DotEdge__Group_3__3__Impl ;
    public final void rule__DotEdge__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1939:1: ( rule__DotEdge__Group_3__3__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1940:2: rule__DotEdge__Group_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3__3__Impl_in_rule__DotEdge__Group_3__33862);
            rule__DotEdge__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group_3__3"


    // $ANTLR start "rule__DotEdge__Group_3__3__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1946:1: rule__DotEdge__Group_3__3__Impl : ( ']' ) ;
    public final void rule__DotEdge__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1950:1: ( ( ']' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1951:1: ( ']' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1951:1: ( ']' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1952:1: ']'
            {
             before(grammarAccess.getDotEdgeAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__DotEdge__Group_3__3__Impl3890); 
             after(grammarAccess.getDotEdgeAccess().getRightSquareBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group_3__3__Impl"


    // $ANTLR start "rule__DotEdge__Group_3_2__0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1973:1: rule__DotEdge__Group_3_2__0 : rule__DotEdge__Group_3_2__0__Impl rule__DotEdge__Group_3_2__1 ;
    public final void rule__DotEdge__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1977:1: ( rule__DotEdge__Group_3_2__0__Impl rule__DotEdge__Group_3_2__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1978:2: rule__DotEdge__Group_3_2__0__Impl rule__DotEdge__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3_2__0__Impl_in_rule__DotEdge__Group_3_2__03929);
            rule__DotEdge__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3_2__1_in_rule__DotEdge__Group_3_2__03932);
            rule__DotEdge__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group_3_2__0"


    // $ANTLR start "rule__DotEdge__Group_3_2__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1985:1: rule__DotEdge__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__DotEdge__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1989:1: ( ( ',' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1990:1: ( ',' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1990:1: ( ',' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1991:1: ','
            {
             before(grammarAccess.getDotEdgeAccess().getCommaKeyword_3_2_0()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__DotEdge__Group_3_2__0__Impl3960); 
             after(grammarAccess.getDotEdgeAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group_3_2__0__Impl"


    // $ANTLR start "rule__DotEdge__Group_3_2__1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2004:1: rule__DotEdge__Group_3_2__1 : rule__DotEdge__Group_3_2__1__Impl ;
    public final void rule__DotEdge__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2008:1: ( rule__DotEdge__Group_3_2__1__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2009:2: rule__DotEdge__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3_2__1__Impl_in_rule__DotEdge__Group_3_2__13991);
            rule__DotEdge__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group_3_2__1"


    // $ANTLR start "rule__DotEdge__Group_3_2__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2015:1: rule__DotEdge__Group_3_2__1__Impl : ( ( rule__DotEdge__SettingsAssignment_3_2_1 ) ) ;
    public final void rule__DotEdge__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2019:1: ( ( ( rule__DotEdge__SettingsAssignment_3_2_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2020:1: ( ( rule__DotEdge__SettingsAssignment_3_2_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2020:1: ( ( rule__DotEdge__SettingsAssignment_3_2_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2021:1: ( rule__DotEdge__SettingsAssignment_3_2_1 )
            {
             before(grammarAccess.getDotEdgeAccess().getSettingsAssignment_3_2_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2022:1: ( rule__DotEdge__SettingsAssignment_3_2_1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2022:2: rule__DotEdge__SettingsAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__SettingsAssignment_3_2_1_in_rule__DotEdge__Group_3_2__1__Impl4018);
            rule__DotEdge__SettingsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDotEdgeAccess().getSettingsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__Group_3_2__1__Impl"


    // $ANTLR start "rule__Setting__Group__0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2036:1: rule__Setting__Group__0 : rule__Setting__Group__0__Impl rule__Setting__Group__1 ;
    public final void rule__Setting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2040:1: ( rule__Setting__Group__0__Impl rule__Setting__Group__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2041:2: rule__Setting__Group__0__Impl rule__Setting__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Setting__Group__0__Impl_in_rule__Setting__Group__04052);
            rule__Setting__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Setting__Group__1_in_rule__Setting__Group__04055);
            rule__Setting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__0"


    // $ANTLR start "rule__Setting__Group__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2048:1: rule__Setting__Group__0__Impl : ( ( rule__Setting__AttributeAssignment_0 ) ) ;
    public final void rule__Setting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2052:1: ( ( ( rule__Setting__AttributeAssignment_0 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2053:1: ( ( rule__Setting__AttributeAssignment_0 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2053:1: ( ( rule__Setting__AttributeAssignment_0 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2054:1: ( rule__Setting__AttributeAssignment_0 )
            {
             before(grammarAccess.getSettingAccess().getAttributeAssignment_0()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2055:1: ( rule__Setting__AttributeAssignment_0 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2055:2: rule__Setting__AttributeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Setting__AttributeAssignment_0_in_rule__Setting__Group__0__Impl4082);
            rule__Setting__AttributeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSettingAccess().getAttributeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__0__Impl"


    // $ANTLR start "rule__Setting__Group__1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2065:1: rule__Setting__Group__1 : rule__Setting__Group__1__Impl rule__Setting__Group__2 ;
    public final void rule__Setting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2069:1: ( rule__Setting__Group__1__Impl rule__Setting__Group__2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2070:2: rule__Setting__Group__1__Impl rule__Setting__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Setting__Group__1__Impl_in_rule__Setting__Group__14112);
            rule__Setting__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Setting__Group__2_in_rule__Setting__Group__14115);
            rule__Setting__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__1"


    // $ANTLR start "rule__Setting__Group__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2077:1: rule__Setting__Group__1__Impl : ( '=' ) ;
    public final void rule__Setting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2081:1: ( ( '=' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2082:1: ( '=' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2082:1: ( '=' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2083:1: '='
            {
             before(grammarAccess.getSettingAccess().getEqualsSignKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Setting__Group__1__Impl4143); 
             after(grammarAccess.getSettingAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__1__Impl"


    // $ANTLR start "rule__Setting__Group__2"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2096:1: rule__Setting__Group__2 : rule__Setting__Group__2__Impl ;
    public final void rule__Setting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2100:1: ( rule__Setting__Group__2__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2101:2: rule__Setting__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Setting__Group__2__Impl_in_rule__Setting__Group__24174);
            rule__Setting__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__2"


    // $ANTLR start "rule__Setting__Group__2__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2107:1: rule__Setting__Group__2__Impl : ( ( rule__Setting__ValueAssignment_2 ) ) ;
    public final void rule__Setting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2111:1: ( ( ( rule__Setting__ValueAssignment_2 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2112:1: ( ( rule__Setting__ValueAssignment_2 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2112:1: ( ( rule__Setting__ValueAssignment_2 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2113:1: ( rule__Setting__ValueAssignment_2 )
            {
             before(grammarAccess.getSettingAccess().getValueAssignment_2()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2114:1: ( rule__Setting__ValueAssignment_2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2114:2: rule__Setting__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Setting__ValueAssignment_2_in_rule__Setting__Group__2__Impl4201);
            rule__Setting__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSettingAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__2__Impl"


    // $ANTLR start "rule__DotGraph__DirectedGraphAssignment_1_0_0_0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2131:1: rule__DotGraph__DirectedGraphAssignment_1_0_0_0 : ( ( 'digraph' ) ) ;
    public final void rule__DotGraph__DirectedGraphAssignment_1_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2135:1: ( ( ( 'digraph' ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2136:1: ( ( 'digraph' ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2136:1: ( ( 'digraph' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2137:1: ( 'digraph' )
            {
             before(grammarAccess.getDotGraphAccess().getDirectedGraphDigraphKeyword_1_0_0_0_0()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2138:1: ( 'digraph' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2139:1: 'digraph'
            {
             before(grammarAccess.getDotGraphAccess().getDirectedGraphDigraphKeyword_1_0_0_0_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__DotGraph__DirectedGraphAssignment_1_0_0_04247); 
             after(grammarAccess.getDotGraphAccess().getDirectedGraphDigraphKeyword_1_0_0_0_0()); 

            }

             after(grammarAccess.getDotGraphAccess().getDirectedGraphDigraphKeyword_1_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__DirectedGraphAssignment_1_0_0_0"


    // $ANTLR start "rule__DotGraph__IdAssignment_1_0_1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2154:1: rule__DotGraph__IdAssignment_1_0_1 : ( ruleDotID ) ;
    public final void rule__DotGraph__IdAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2158:1: ( ( ruleDotID ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2159:1: ( ruleDotID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2159:1: ( ruleDotID )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2160:1: ruleDotID
            {
             before(grammarAccess.getDotGraphAccess().getIdDotIDParserRuleCall_1_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_rule__DotGraph__IdAssignment_1_0_14286);
            ruleDotID();

            state._fsp--;

             after(grammarAccess.getDotGraphAccess().getIdDotIDParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__IdAssignment_1_0_1"


    // $ANTLR start "rule__DotGraph__IdAssignment_1_1_1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2169:1: rule__DotGraph__IdAssignment_1_1_1 : ( ruleDotID ) ;
    public final void rule__DotGraph__IdAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2173:1: ( ( ruleDotID ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2174:1: ( ruleDotID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2174:1: ( ruleDotID )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2175:1: ruleDotID
            {
             before(grammarAccess.getDotGraphAccess().getIdDotIDParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_rule__DotGraph__IdAssignment_1_1_14317);
            ruleDotID();

            state._fsp--;

             after(grammarAccess.getDotGraphAccess().getIdDotIDParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__IdAssignment_1_1_1"


    // $ANTLR start "rule__DotGraph__GraphSettingsAssignment_3_0_2"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2184:1: rule__DotGraph__GraphSettingsAssignment_3_0_2 : ( ruleSetting ) ;
    public final void rule__DotGraph__GraphSettingsAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2188:1: ( ( ruleSetting ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2189:1: ( ruleSetting )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2189:1: ( ruleSetting )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2190:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getGraphSettingsSettingParserRuleCall_3_0_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_rule__DotGraph__GraphSettingsAssignment_3_0_24348);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotGraphAccess().getGraphSettingsSettingParserRuleCall_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__GraphSettingsAssignment_3_0_2"


    // $ANTLR start "rule__DotGraph__GraphSettingsAssignment_3_0_3_1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2199:1: rule__DotGraph__GraphSettingsAssignment_3_0_3_1 : ( ruleSetting ) ;
    public final void rule__DotGraph__GraphSettingsAssignment_3_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2203:1: ( ( ruleSetting ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2204:1: ( ruleSetting )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2204:1: ( ruleSetting )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2205:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getGraphSettingsSettingParserRuleCall_3_0_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_rule__DotGraph__GraphSettingsAssignment_3_0_3_14379);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotGraphAccess().getGraphSettingsSettingParserRuleCall_3_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__GraphSettingsAssignment_3_0_3_1"


    // $ANTLR start "rule__DotGraph__NodeSettingsAssignment_3_1_2"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2214:1: rule__DotGraph__NodeSettingsAssignment_3_1_2 : ( ruleSetting ) ;
    public final void rule__DotGraph__NodeSettingsAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2218:1: ( ( ruleSetting ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2219:1: ( ruleSetting )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2219:1: ( ruleSetting )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2220:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getNodeSettingsSettingParserRuleCall_3_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_rule__DotGraph__NodeSettingsAssignment_3_1_24410);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotGraphAccess().getNodeSettingsSettingParserRuleCall_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__NodeSettingsAssignment_3_1_2"


    // $ANTLR start "rule__DotGraph__NodeSettingsAssignment_3_1_3_1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2229:1: rule__DotGraph__NodeSettingsAssignment_3_1_3_1 : ( ruleSetting ) ;
    public final void rule__DotGraph__NodeSettingsAssignment_3_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2233:1: ( ( ruleSetting ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2234:1: ( ruleSetting )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2234:1: ( ruleSetting )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2235:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getNodeSettingsSettingParserRuleCall_3_1_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_rule__DotGraph__NodeSettingsAssignment_3_1_3_14441);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotGraphAccess().getNodeSettingsSettingParserRuleCall_3_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__NodeSettingsAssignment_3_1_3_1"


    // $ANTLR start "rule__DotGraph__EdgeSettingsAssignment_3_2_2"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2244:1: rule__DotGraph__EdgeSettingsAssignment_3_2_2 : ( ruleSetting ) ;
    public final void rule__DotGraph__EdgeSettingsAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2248:1: ( ( ruleSetting ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2249:1: ( ruleSetting )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2249:1: ( ruleSetting )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2250:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getEdgeSettingsSettingParserRuleCall_3_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_rule__DotGraph__EdgeSettingsAssignment_3_2_24472);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotGraphAccess().getEdgeSettingsSettingParserRuleCall_3_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__EdgeSettingsAssignment_3_2_2"


    // $ANTLR start "rule__DotGraph__EdgeSettingsAssignment_3_2_3_1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2259:1: rule__DotGraph__EdgeSettingsAssignment_3_2_3_1 : ( ruleSetting ) ;
    public final void rule__DotGraph__EdgeSettingsAssignment_3_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2263:1: ( ( ruleSetting ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2264:1: ( ruleSetting )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2264:1: ( ruleSetting )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2265:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getEdgeSettingsSettingParserRuleCall_3_2_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_rule__DotGraph__EdgeSettingsAssignment_3_2_3_14503);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotGraphAccess().getEdgeSettingsSettingParserRuleCall_3_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__EdgeSettingsAssignment_3_2_3_1"


    // $ANTLR start "rule__DotGraph__SubgraphsAssignment_3_3"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2274:1: rule__DotGraph__SubgraphsAssignment_3_3 : ( ruleDotGraph ) ;
    public final void rule__DotGraph__SubgraphsAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2278:1: ( ( ruleDotGraph ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2279:1: ( ruleDotGraph )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2279:1: ( ruleDotGraph )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2280:1: ruleDotGraph
            {
             before(grammarAccess.getDotGraphAccess().getSubgraphsDotGraphParserRuleCall_3_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotGraph_in_rule__DotGraph__SubgraphsAssignment_3_34534);
            ruleDotGraph();

            state._fsp--;

             after(grammarAccess.getDotGraphAccess().getSubgraphsDotGraphParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__SubgraphsAssignment_3_3"


    // $ANTLR start "rule__DotGraph__NodesAssignment_3_4"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2289:1: rule__DotGraph__NodesAssignment_3_4 : ( ruleDotNode ) ;
    public final void rule__DotGraph__NodesAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2293:1: ( ( ruleDotNode ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2294:1: ( ruleDotNode )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2294:1: ( ruleDotNode )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2295:1: ruleDotNode
            {
             before(grammarAccess.getDotGraphAccess().getNodesDotNodeParserRuleCall_3_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotNode_in_rule__DotGraph__NodesAssignment_3_44565);
            ruleDotNode();

            state._fsp--;

             after(grammarAccess.getDotGraphAccess().getNodesDotNodeParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__NodesAssignment_3_4"


    // $ANTLR start "rule__DotGraph__EdgesAssignment_3_5"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2304:1: rule__DotGraph__EdgesAssignment_3_5 : ( ruleDotEdge ) ;
    public final void rule__DotGraph__EdgesAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2308:1: ( ( ruleDotEdge ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2309:1: ( ruleDotEdge )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2309:1: ( ruleDotEdge )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2310:1: ruleDotEdge
            {
             before(grammarAccess.getDotGraphAccess().getEdgesDotEdgeParserRuleCall_3_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotEdge_in_rule__DotGraph__EdgesAssignment_3_54596);
            ruleDotEdge();

            state._fsp--;

             after(grammarAccess.getDotGraphAccess().getEdgesDotEdgeParserRuleCall_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__EdgesAssignment_3_5"


    // $ANTLR start "rule__DotNode__NameAssignment_0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2319:1: rule__DotNode__NameAssignment_0 : ( ruleDotID ) ;
    public final void rule__DotNode__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2323:1: ( ( ruleDotID ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2324:1: ( ruleDotID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2324:1: ( ruleDotID )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2325:1: ruleDotID
            {
             before(grammarAccess.getDotNodeAccess().getNameDotIDParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_rule__DotNode__NameAssignment_04627);
            ruleDotID();

            state._fsp--;

             after(grammarAccess.getDotNodeAccess().getNameDotIDParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNode__NameAssignment_0"


    // $ANTLR start "rule__DotNode__SettingsAssignment_1_1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2334:1: rule__DotNode__SettingsAssignment_1_1 : ( ruleSetting ) ;
    public final void rule__DotNode__SettingsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2338:1: ( ( ruleSetting ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2339:1: ( ruleSetting )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2339:1: ( ruleSetting )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2340:1: ruleSetting
            {
             before(grammarAccess.getDotNodeAccess().getSettingsSettingParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_rule__DotNode__SettingsAssignment_1_14658);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotNodeAccess().getSettingsSettingParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNode__SettingsAssignment_1_1"


    // $ANTLR start "rule__DotNode__SettingsAssignment_1_2_1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2349:1: rule__DotNode__SettingsAssignment_1_2_1 : ( ruleSetting ) ;
    public final void rule__DotNode__SettingsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2353:1: ( ( ruleSetting ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2354:1: ( ruleSetting )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2354:1: ( ruleSetting )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2355:1: ruleSetting
            {
             before(grammarAccess.getDotNodeAccess().getSettingsSettingParserRuleCall_1_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_rule__DotNode__SettingsAssignment_1_2_14689);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotNodeAccess().getSettingsSettingParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotNode__SettingsAssignment_1_2_1"


    // $ANTLR start "rule__DotEdge__SourceAssignment_0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2364:1: rule__DotEdge__SourceAssignment_0 : ( ( ruleDotID ) ) ;
    public final void rule__DotEdge__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2368:1: ( ( ( ruleDotID ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2369:1: ( ( ruleDotID ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2369:1: ( ( ruleDotID ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2370:1: ( ruleDotID )
            {
             before(grammarAccess.getDotEdgeAccess().getSourceDotNodeCrossReference_0_0()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2371:1: ( ruleDotID )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2372:1: ruleDotID
            {
             before(grammarAccess.getDotEdgeAccess().getSourceDotNodeDotIDParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_rule__DotEdge__SourceAssignment_04724);
            ruleDotID();

            state._fsp--;

             after(grammarAccess.getDotEdgeAccess().getSourceDotNodeDotIDParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDotEdgeAccess().getSourceDotNodeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__SourceAssignment_0"


    // $ANTLR start "rule__DotEdge__TargetAssignment_2"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2383:1: rule__DotEdge__TargetAssignment_2 : ( ( ruleDotID ) ) ;
    public final void rule__DotEdge__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2387:1: ( ( ( ruleDotID ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2388:1: ( ( ruleDotID ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2388:1: ( ( ruleDotID ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2389:1: ( ruleDotID )
            {
             before(grammarAccess.getDotEdgeAccess().getTargetDotNodeCrossReference_2_0()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2390:1: ( ruleDotID )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2391:1: ruleDotID
            {
             before(grammarAccess.getDotEdgeAccess().getTargetDotNodeDotIDParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_rule__DotEdge__TargetAssignment_24763);
            ruleDotID();

            state._fsp--;

             after(grammarAccess.getDotEdgeAccess().getTargetDotNodeDotIDParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDotEdgeAccess().getTargetDotNodeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__TargetAssignment_2"


    // $ANTLR start "rule__DotEdge__SettingsAssignment_3_1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2402:1: rule__DotEdge__SettingsAssignment_3_1 : ( ruleSetting ) ;
    public final void rule__DotEdge__SettingsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2406:1: ( ( ruleSetting ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2407:1: ( ruleSetting )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2407:1: ( ruleSetting )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2408:1: ruleSetting
            {
             before(grammarAccess.getDotEdgeAccess().getSettingsSettingParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_rule__DotEdge__SettingsAssignment_3_14798);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotEdgeAccess().getSettingsSettingParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__SettingsAssignment_3_1"


    // $ANTLR start "rule__DotEdge__SettingsAssignment_3_2_1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2417:1: rule__DotEdge__SettingsAssignment_3_2_1 : ( ruleSetting ) ;
    public final void rule__DotEdge__SettingsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2421:1: ( ( ruleSetting ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2422:1: ( ruleSetting )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2422:1: ( ruleSetting )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2423:1: ruleSetting
            {
             before(grammarAccess.getDotEdgeAccess().getSettingsSettingParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_rule__DotEdge__SettingsAssignment_3_2_14829);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotEdgeAccess().getSettingsSettingParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotEdge__SettingsAssignment_3_2_1"


    // $ANTLR start "rule__Setting__AttributeAssignment_0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2432:1: rule__Setting__AttributeAssignment_0 : ( ruleDotID ) ;
    public final void rule__Setting__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2436:1: ( ( ruleDotID ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2437:1: ( ruleDotID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2437:1: ( ruleDotID )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2438:1: ruleDotID
            {
             before(grammarAccess.getSettingAccess().getAttributeDotIDParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_rule__Setting__AttributeAssignment_04860);
            ruleDotID();

            state._fsp--;

             after(grammarAccess.getSettingAccess().getAttributeDotIDParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__AttributeAssignment_0"


    // $ANTLR start "rule__Setting__ValueAssignment_2"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2447:1: rule__Setting__ValueAssignment_2 : ( ruleDotID ) ;
    public final void rule__Setting__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2451:1: ( ( ruleDotID ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2452:1: ( ruleDotID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2452:1: ( ruleDotID )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2453:1: ruleDotID
            {
             before(grammarAccess.getSettingAccess().getValueDotIDParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_rule__Setting__ValueAssignment_24891);
            ruleDotID();

            state._fsp--;

             after(grammarAccess.getSettingAccess().getValueDotIDParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__ValueAssignment_2"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\14\uffff";
    static final String DFA3_eofS =
        "\14\uffff";
    static final String DFA3_minS =
        "\2\4\3\uffff\4\4\3\uffff";
    static final String DFA3_maxS =
        "\1\32\1\23\3\uffff\4\32\3\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\3\1\4\4\uffff\1\1\1\5\1\6";
    static final String DFA3_specialS =
        "\14\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\5\1\6\1\7\1\10\5\uffff\1\1\4\uffff\1\4\4\uffff\1\2\1\3\1"+
            "\uffff\1\4",
            "\4\4\10\uffff\1\4\2\uffff\1\11",
            "",
            "",
            "",
            "\4\12\5\uffff\1\12\2\13\1\uffff\3\12\1\uffff\1\12\1\uffff\2"+
            "\12\1\uffff\1\12",
            "\4\12\5\uffff\1\12\2\13\1\uffff\3\12\1\uffff\1\12\1\uffff\2"+
            "\12\1\uffff\1\12",
            "\4\12\5\uffff\1\12\2\13\1\uffff\3\12\1\uffff\1\12\1\uffff\2"+
            "\12\1\uffff\1\12",
            "\4\12\5\uffff\1\12\2\13\1\uffff\3\12\1\uffff\1\12\1\uffff\2"+
            "\12\1\uffff\1\12",
            "",
            "",
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
            return "246:1: rule__DotGraph__Alternatives_3 : ( ( ( rule__DotGraph__Group_3_0__0 ) ) | ( ( rule__DotGraph__Group_3_1__0 ) ) | ( ( rule__DotGraph__Group_3_2__0 ) ) | ( ( rule__DotGraph__SubgraphsAssignment_3_3 ) ) | ( ( rule__DotGraph__NodesAssignment_3_4 ) ) | ( ( rule__DotGraph__EdgesAssignment_3_5 ) ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleDotGraph_in_entryRuleDotGraph61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDotGraph68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group__0_in_ruleDotGraph94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotNode_in_entryRuleDotNode121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDotNode128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__Group__0_in_ruleDotNode154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotEdge_in_entryRuleDotEdge181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDotEdge188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group__0_in_ruleDotEdge214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_entryRuleSetting241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSetting248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Setting__Group__0_in_ruleSetting274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotID_in_entryRuleDotID301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDotID308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotID__Alternatives_in_ruleDotID334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_1_0__0_in_rule__DotGraph__Alternatives_1370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_1_1__0_in_rule__DotGraph__Alternatives_1388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__DirectedGraphAssignment_1_0_0_0_in_rule__DotGraph__Alternatives_1_0_0421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__DotGraph__Alternatives_1_0_0440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__0_in_rule__DotGraph__Alternatives_3474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__0_in_rule__DotGraph__Alternatives_3492 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__0_in_rule__DotGraph__Alternatives_3510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__SubgraphsAssignment_3_3_in_rule__DotGraph__Alternatives_3528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__NodesAssignment_3_4_in_rule__DotGraph__Alternatives_3546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__EdgesAssignment_3_5_in_rule__DotGraph__Alternatives_3564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__DotEdge__Alternatives_1598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__DotEdge__Alternatives_1618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DOTSTRINGTERM_in_rule__DotID__Alternatives652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NUMPREFIXEDID_in_rule__DotID__Alternatives669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__DotID__Alternatives686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__DotID__Alternatives703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group__0__Impl_in_rule__DotGraph__Group__0733 = new BitSet(new long[]{0x0000000004042000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group__1_in_rule__DotGraph__Group__0736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group__1__Impl_in_rule__DotGraph__Group__1794 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group__2_in_rule__DotGraph__Group__1797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Alternatives_1_in_rule__DotGraph__Group__1__Impl824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group__2__Impl_in_rule__DotGraph__Group__2854 = new BitSet(new long[]{0x00000000058620F0L});
        public static final BitSet FOLLOW_rule__DotGraph__Group__3_in_rule__DotGraph__Group__2857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__DotGraph__Group__2__Impl885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group__3__Impl_in_rule__DotGraph__Group__3916 = new BitSet(new long[]{0x00000000058620F0L});
        public static final BitSet FOLLOW_rule__DotGraph__Group__4_in_rule__DotGraph__Group__3919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Alternatives_3_in_rule__DotGraph__Group__3__Impl946 = new BitSet(new long[]{0x00000000058420F2L});
        public static final BitSet FOLLOW_rule__DotGraph__Group__4__Impl_in_rule__DotGraph__Group__4977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__DotGraph__Group__4__Impl1005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_1_0__0__Impl_in_rule__DotGraph__Group_1_0__01046 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_1_0__1_in_rule__DotGraph__Group_1_0__01049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Alternatives_1_0_0_in_rule__DotGraph__Group_1_0__0__Impl1076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_1_0__1__Impl_in_rule__DotGraph__Group_1_0__11106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__IdAssignment_1_0_1_in_rule__DotGraph__Group_1_0__1__Impl1133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_1_1__0__Impl_in_rule__DotGraph__Group_1_1__01168 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_1_1__1_in_rule__DotGraph__Group_1_1__01171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__DotGraph__Group_1_1__0__Impl1199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_1_1__1__Impl_in_rule__DotGraph__Group_1_1__11230 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__IdAssignment_1_1_1_in_rule__DotGraph__Group_1_1__1__Impl1257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__0__Impl_in_rule__DotGraph__Group_3_0__01292 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__1_in_rule__DotGraph__Group_3_0__01295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__DotGraph__Group_3_0__0__Impl1323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__1__Impl_in_rule__DotGraph__Group_3_0__11354 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__2_in_rule__DotGraph__Group_3_0__11357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__DotGraph__Group_3_0__1__Impl1385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__2__Impl_in_rule__DotGraph__Group_3_0__21416 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__3_in_rule__DotGraph__Group_3_0__21419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__GraphSettingsAssignment_3_0_2_in_rule__DotGraph__Group_3_0__2__Impl1446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__3__Impl_in_rule__DotGraph__Group_3_0__31476 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__4_in_rule__DotGraph__Group_3_0__31479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0_3__0_in_rule__DotGraph__Group_3_0__3__Impl1506 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__4__Impl_in_rule__DotGraph__Group_3_0__41537 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__5_in_rule__DotGraph__Group_3_0__41540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__DotGraph__Group_3_0__4__Impl1568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__5__Impl_in_rule__DotGraph__Group_3_0__51599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__DotGraph__Group_3_0__5__Impl1628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0_3__0__Impl_in_rule__DotGraph__Group_3_0_3__01673 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0_3__1_in_rule__DotGraph__Group_3_0_3__01676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__DotGraph__Group_3_0_3__0__Impl1704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0_3__1__Impl_in_rule__DotGraph__Group_3_0_3__11735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__GraphSettingsAssignment_3_0_3_1_in_rule__DotGraph__Group_3_0_3__1__Impl1762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__0__Impl_in_rule__DotGraph__Group_3_1__01796 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__1_in_rule__DotGraph__Group_3_1__01799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__DotGraph__Group_3_1__0__Impl1827 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__1__Impl_in_rule__DotGraph__Group_3_1__11858 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__2_in_rule__DotGraph__Group_3_1__11861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__DotGraph__Group_3_1__1__Impl1889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__2__Impl_in_rule__DotGraph__Group_3_1__21920 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__3_in_rule__DotGraph__Group_3_1__21923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__NodeSettingsAssignment_3_1_2_in_rule__DotGraph__Group_3_1__2__Impl1950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__3__Impl_in_rule__DotGraph__Group_3_1__31980 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__4_in_rule__DotGraph__Group_3_1__31983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1_3__0_in_rule__DotGraph__Group_3_1__3__Impl2010 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__4__Impl_in_rule__DotGraph__Group_3_1__42041 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__5_in_rule__DotGraph__Group_3_1__42044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__DotGraph__Group_3_1__4__Impl2072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__5__Impl_in_rule__DotGraph__Group_3_1__52103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__DotGraph__Group_3_1__5__Impl2132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1_3__0__Impl_in_rule__DotGraph__Group_3_1_3__02177 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1_3__1_in_rule__DotGraph__Group_3_1_3__02180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__DotGraph__Group_3_1_3__0__Impl2208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1_3__1__Impl_in_rule__DotGraph__Group_3_1_3__12239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__NodeSettingsAssignment_3_1_3_1_in_rule__DotGraph__Group_3_1_3__1__Impl2266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__0__Impl_in_rule__DotGraph__Group_3_2__02300 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__1_in_rule__DotGraph__Group_3_2__02303 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__DotGraph__Group_3_2__0__Impl2331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__1__Impl_in_rule__DotGraph__Group_3_2__12362 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__2_in_rule__DotGraph__Group_3_2__12365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__DotGraph__Group_3_2__1__Impl2393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__2__Impl_in_rule__DotGraph__Group_3_2__22424 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__3_in_rule__DotGraph__Group_3_2__22427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__EdgeSettingsAssignment_3_2_2_in_rule__DotGraph__Group_3_2__2__Impl2454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__3__Impl_in_rule__DotGraph__Group_3_2__32484 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__4_in_rule__DotGraph__Group_3_2__32487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2_3__0_in_rule__DotGraph__Group_3_2__3__Impl2514 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__4__Impl_in_rule__DotGraph__Group_3_2__42545 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__5_in_rule__DotGraph__Group_3_2__42548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__DotGraph__Group_3_2__4__Impl2576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__5__Impl_in_rule__DotGraph__Group_3_2__52607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__DotGraph__Group_3_2__5__Impl2636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2_3__0__Impl_in_rule__DotGraph__Group_3_2_3__02681 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2_3__1_in_rule__DotGraph__Group_3_2_3__02684 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__DotGraph__Group_3_2_3__0__Impl2712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2_3__1__Impl_in_rule__DotGraph__Group_3_2_3__12743 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__EdgeSettingsAssignment_3_2_3_1_in_rule__DotGraph__Group_3_2_3__1__Impl2770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__Group__0__Impl_in_rule__DotNode__Group__02804 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_rule__DotNode__Group__1_in_rule__DotNode__Group__02807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__NameAssignment_0_in_rule__DotNode__Group__0__Impl2834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__Group__1__Impl_in_rule__DotNode__Group__12864 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_rule__DotNode__Group__2_in_rule__DotNode__Group__12867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1__0_in_rule__DotNode__Group__1__Impl2894 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__Group__2__Impl_in_rule__DotNode__Group__22925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__DotNode__Group__2__Impl2954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1__0__Impl_in_rule__DotNode__Group_1__02993 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1__1_in_rule__DotNode__Group_1__02996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__DotNode__Group_1__0__Impl3024 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1__1__Impl_in_rule__DotNode__Group_1__13055 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1__2_in_rule__DotNode__Group_1__13058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__SettingsAssignment_1_1_in_rule__DotNode__Group_1__1__Impl3085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1__2__Impl_in_rule__DotNode__Group_1__23115 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1__3_in_rule__DotNode__Group_1__23118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1_2__0_in_rule__DotNode__Group_1__2__Impl3145 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1__3__Impl_in_rule__DotNode__Group_1__33176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__DotNode__Group_1__3__Impl3204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1_2__0__Impl_in_rule__DotNode__Group_1_2__03243 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1_2__1_in_rule__DotNode__Group_1_2__03246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__DotNode__Group_1_2__0__Impl3274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1_2__1__Impl_in_rule__DotNode__Group_1_2__13305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__SettingsAssignment_1_2_1_in_rule__DotNode__Group_1_2__1__Impl3332 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group__0__Impl_in_rule__DotEdge__Group__03366 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__DotEdge__Group__1_in_rule__DotEdge__Group__03369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__SourceAssignment_0_in_rule__DotEdge__Group__0__Impl3396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group__1__Impl_in_rule__DotEdge__Group__13426 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_rule__DotEdge__Group__2_in_rule__DotEdge__Group__13429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Alternatives_1_in_rule__DotEdge__Group__1__Impl3456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group__2__Impl_in_rule__DotEdge__Group__23486 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_rule__DotEdge__Group__3_in_rule__DotEdge__Group__23489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__TargetAssignment_2_in_rule__DotEdge__Group__2__Impl3516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group__3__Impl_in_rule__DotEdge__Group__33546 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_rule__DotEdge__Group__4_in_rule__DotEdge__Group__33549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3__0_in_rule__DotEdge__Group__3__Impl3576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group__4__Impl_in_rule__DotEdge__Group__43607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__DotEdge__Group__4__Impl3636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3__0__Impl_in_rule__DotEdge__Group_3__03679 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3__1_in_rule__DotEdge__Group_3__03682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__DotEdge__Group_3__0__Impl3710 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3__1__Impl_in_rule__DotEdge__Group_3__13741 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3__2_in_rule__DotEdge__Group_3__13744 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__SettingsAssignment_3_1_in_rule__DotEdge__Group_3__1__Impl3771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3__2__Impl_in_rule__DotEdge__Group_3__23801 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3__3_in_rule__DotEdge__Group_3__23804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3_2__0_in_rule__DotEdge__Group_3__2__Impl3831 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3__3__Impl_in_rule__DotEdge__Group_3__33862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__DotEdge__Group_3__3__Impl3890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3_2__0__Impl_in_rule__DotEdge__Group_3_2__03929 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3_2__1_in_rule__DotEdge__Group_3_2__03932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__DotEdge__Group_3_2__0__Impl3960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3_2__1__Impl_in_rule__DotEdge__Group_3_2__13991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__SettingsAssignment_3_2_1_in_rule__DotEdge__Group_3_2__1__Impl4018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Setting__Group__0__Impl_in_rule__Setting__Group__04052 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Setting__Group__1_in_rule__Setting__Group__04055 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Setting__AttributeAssignment_0_in_rule__Setting__Group__0__Impl4082 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Setting__Group__1__Impl_in_rule__Setting__Group__14112 = new BitSet(new long[]{0x00000000000000F0L});
        public static final BitSet FOLLOW_rule__Setting__Group__2_in_rule__Setting__Group__14115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Setting__Group__1__Impl4143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Setting__Group__2__Impl_in_rule__Setting__Group__24174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Setting__ValueAssignment_2_in_rule__Setting__Group__2__Impl4201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__DotGraph__DirectedGraphAssignment_1_0_0_04247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotID_in_rule__DotGraph__IdAssignment_1_0_14286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotID_in_rule__DotGraph__IdAssignment_1_1_14317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_rule__DotGraph__GraphSettingsAssignment_3_0_24348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_rule__DotGraph__GraphSettingsAssignment_3_0_3_14379 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_rule__DotGraph__NodeSettingsAssignment_3_1_24410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_rule__DotGraph__NodeSettingsAssignment_3_1_3_14441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_rule__DotGraph__EdgeSettingsAssignment_3_2_24472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_rule__DotGraph__EdgeSettingsAssignment_3_2_3_14503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotGraph_in_rule__DotGraph__SubgraphsAssignment_3_34534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotNode_in_rule__DotGraph__NodesAssignment_3_44565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotEdge_in_rule__DotGraph__EdgesAssignment_3_54596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotID_in_rule__DotNode__NameAssignment_04627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_rule__DotNode__SettingsAssignment_1_14658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_rule__DotNode__SettingsAssignment_1_2_14689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotID_in_rule__DotEdge__SourceAssignment_04724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotID_in_rule__DotEdge__TargetAssignment_24763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_rule__DotEdge__SettingsAssignment_3_14798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_rule__DotEdge__SettingsAssignment_3_2_14829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotID_in_rule__Setting__AttributeAssignment_04860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotID_in_rule__Setting__ValueAssignment_24891 = new BitSet(new long[]{0x0000000000000002L});
    }


}