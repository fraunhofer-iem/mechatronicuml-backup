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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOTSTRINGTERM", "RULE_NUMPREFIXEDID", "RULE_ID", "RULE_DOUBLE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'graph'", "'--'", "'->'", "'{'", "'}'", "'subgraph'", "'['", "']'", "';'", "','", "'node'", "'edge'", "'='", "'-'", "'digraph'"
    };
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


    // $ANTLR start "entryRuleNumber"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:200:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:201:1: ( ruleNumber EOF )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:202:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleNumber_in_entryRuleNumber361);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNumber368); 

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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:209:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:213:2: ( ( ( rule__Number__Group__0 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:214:1: ( ( rule__Number__Group__0 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:214:1: ( ( rule__Number__Group__0 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:215:1: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:216:1: ( rule__Number__Group__0 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:216:2: rule__Number__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Number__Group__0_in_ruleNumber394);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "rule__DotGraph__Alternatives_1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:228:1: rule__DotGraph__Alternatives_1 : ( ( ( rule__DotGraph__Group_1_0__0 ) ) | ( ( rule__DotGraph__Group_1_1__0 ) ) );
    public final void rule__DotGraph__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:232:1: ( ( ( rule__DotGraph__Group_1_0__0 ) ) | ( ( rule__DotGraph__Group_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14||LA1_0==28) ) {
                alt1=1;
            }
            else if ( (LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:233:1: ( ( rule__DotGraph__Group_1_0__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:233:1: ( ( rule__DotGraph__Group_1_0__0 ) )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:234:1: ( rule__DotGraph__Group_1_0__0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getGroup_1_0()); 
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:235:1: ( rule__DotGraph__Group_1_0__0 )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:235:2: rule__DotGraph__Group_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_1_0__0_in_rule__DotGraph__Alternatives_1430);
                    rule__DotGraph__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:239:6: ( ( rule__DotGraph__Group_1_1__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:239:6: ( ( rule__DotGraph__Group_1_1__0 ) )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:240:1: ( rule__DotGraph__Group_1_1__0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getGroup_1_1()); 
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:241:1: ( rule__DotGraph__Group_1_1__0 )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:241:2: rule__DotGraph__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_1_1__0_in_rule__DotGraph__Alternatives_1448);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:250:1: rule__DotGraph__Alternatives_1_0_0 : ( ( ( rule__DotGraph__DirectedGraphAssignment_1_0_0_0 ) ) | ( 'graph' ) );
    public final void rule__DotGraph__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:254:1: ( ( ( rule__DotGraph__DirectedGraphAssignment_1_0_0_0 ) ) | ( 'graph' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:255:1: ( ( rule__DotGraph__DirectedGraphAssignment_1_0_0_0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:255:1: ( ( rule__DotGraph__DirectedGraphAssignment_1_0_0_0 ) )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:256:1: ( rule__DotGraph__DirectedGraphAssignment_1_0_0_0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getDirectedGraphAssignment_1_0_0_0()); 
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:257:1: ( rule__DotGraph__DirectedGraphAssignment_1_0_0_0 )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:257:2: rule__DotGraph__DirectedGraphAssignment_1_0_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__DirectedGraphAssignment_1_0_0_0_in_rule__DotGraph__Alternatives_1_0_0481);
                    rule__DotGraph__DirectedGraphAssignment_1_0_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getDirectedGraphAssignment_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:261:6: ( 'graph' )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:261:6: ( 'graph' )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:262:1: 'graph'
                    {
                     before(grammarAccess.getDotGraphAccess().getGraphKeyword_1_0_0_1()); 
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__DotGraph__Alternatives_1_0_0500); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:274:1: rule__DotGraph__Alternatives_3 : ( ( ( rule__DotGraph__Group_3_0__0 ) ) | ( ( rule__DotGraph__Group_3_1__0 ) ) | ( ( rule__DotGraph__Group_3_2__0 ) ) | ( ( rule__DotGraph__SubgraphsAssignment_3_3 ) ) | ( ( rule__DotGraph__NodesAssignment_3_4 ) ) | ( ( rule__DotGraph__EdgesAssignment_3_5 ) ) );
    public final void rule__DotGraph__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:278:1: ( ( ( rule__DotGraph__Group_3_0__0 ) ) | ( ( rule__DotGraph__Group_3_1__0 ) ) | ( ( rule__DotGraph__Group_3_2__0 ) ) | ( ( rule__DotGraph__SubgraphsAssignment_3_3 ) ) | ( ( rule__DotGraph__NodesAssignment_3_4 ) ) | ( ( rule__DotGraph__EdgesAssignment_3_5 ) ) )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:279:1: ( ( rule__DotGraph__Group_3_0__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:279:1: ( ( rule__DotGraph__Group_3_0__0 ) )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:280:1: ( rule__DotGraph__Group_3_0__0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getGroup_3_0()); 
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:281:1: ( rule__DotGraph__Group_3_0__0 )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:281:2: rule__DotGraph__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__0_in_rule__DotGraph__Alternatives_3534);
                    rule__DotGraph__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:285:6: ( ( rule__DotGraph__Group_3_1__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:285:6: ( ( rule__DotGraph__Group_3_1__0 ) )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:286:1: ( rule__DotGraph__Group_3_1__0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getGroup_3_1()); 
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:287:1: ( rule__DotGraph__Group_3_1__0 )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:287:2: rule__DotGraph__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__0_in_rule__DotGraph__Alternatives_3552);
                    rule__DotGraph__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getGroup_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:291:6: ( ( rule__DotGraph__Group_3_2__0 ) )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:291:6: ( ( rule__DotGraph__Group_3_2__0 ) )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:292:1: ( rule__DotGraph__Group_3_2__0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getGroup_3_2()); 
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:293:1: ( rule__DotGraph__Group_3_2__0 )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:293:2: rule__DotGraph__Group_3_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__0_in_rule__DotGraph__Alternatives_3570);
                    rule__DotGraph__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getGroup_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:297:6: ( ( rule__DotGraph__SubgraphsAssignment_3_3 ) )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:297:6: ( ( rule__DotGraph__SubgraphsAssignment_3_3 ) )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:298:1: ( rule__DotGraph__SubgraphsAssignment_3_3 )
                    {
                     before(grammarAccess.getDotGraphAccess().getSubgraphsAssignment_3_3()); 
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:299:1: ( rule__DotGraph__SubgraphsAssignment_3_3 )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:299:2: rule__DotGraph__SubgraphsAssignment_3_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__SubgraphsAssignment_3_3_in_rule__DotGraph__Alternatives_3588);
                    rule__DotGraph__SubgraphsAssignment_3_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getSubgraphsAssignment_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:303:6: ( ( rule__DotGraph__NodesAssignment_3_4 ) )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:303:6: ( ( rule__DotGraph__NodesAssignment_3_4 ) )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:304:1: ( rule__DotGraph__NodesAssignment_3_4 )
                    {
                     before(grammarAccess.getDotGraphAccess().getNodesAssignment_3_4()); 
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:305:1: ( rule__DotGraph__NodesAssignment_3_4 )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:305:2: rule__DotGraph__NodesAssignment_3_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__NodesAssignment_3_4_in_rule__DotGraph__Alternatives_3606);
                    rule__DotGraph__NodesAssignment_3_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getNodesAssignment_3_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:309:6: ( ( rule__DotGraph__EdgesAssignment_3_5 ) )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:309:6: ( ( rule__DotGraph__EdgesAssignment_3_5 ) )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:310:1: ( rule__DotGraph__EdgesAssignment_3_5 )
                    {
                     before(grammarAccess.getDotGraphAccess().getEdgesAssignment_3_5()); 
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:311:1: ( rule__DotGraph__EdgesAssignment_3_5 )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:311:2: rule__DotGraph__EdgesAssignment_3_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__EdgesAssignment_3_5_in_rule__DotGraph__Alternatives_3624);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:320:1: rule__DotEdge__Alternatives_1 : ( ( '--' ) | ( '->' ) );
    public final void rule__DotEdge__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:324:1: ( ( '--' ) | ( '->' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:325:1: ( '--' )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:325:1: ( '--' )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:326:1: '--'
                    {
                     before(grammarAccess.getDotEdgeAccess().getHyphenMinusHyphenMinusKeyword_1_0()); 
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__DotEdge__Alternatives_1658); 
                     after(grammarAccess.getDotEdgeAccess().getHyphenMinusHyphenMinusKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:333:6: ( '->' )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:333:6: ( '->' )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:334:1: '->'
                    {
                     before(grammarAccess.getDotEdgeAccess().getHyphenMinusGreaterThanSignKeyword_1_1()); 
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__DotEdge__Alternatives_1678); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:346:1: rule__DotID__Alternatives : ( ( RULE_DOTSTRINGTERM ) | ( RULE_NUMPREFIXEDID ) | ( ruleNumber ) | ( RULE_ID ) );
    public final void rule__DotID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:350:1: ( ( RULE_DOTSTRINGTERM ) | ( RULE_NUMPREFIXEDID ) | ( ruleNumber ) | ( RULE_ID ) )
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
            case RULE_DOUBLE:
            case RULE_INT:
            case 27:
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
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:351:1: ( RULE_DOTSTRINGTERM )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:351:1: ( RULE_DOTSTRINGTERM )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:352:1: RULE_DOTSTRINGTERM
                    {
                     before(grammarAccess.getDotIDAccess().getDOTSTRINGTERMTerminalRuleCall_0()); 
                    match(input,RULE_DOTSTRINGTERM,FollowSets000.FOLLOW_RULE_DOTSTRINGTERM_in_rule__DotID__Alternatives712); 
                     after(grammarAccess.getDotIDAccess().getDOTSTRINGTERMTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:357:6: ( RULE_NUMPREFIXEDID )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:357:6: ( RULE_NUMPREFIXEDID )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:358:1: RULE_NUMPREFIXEDID
                    {
                     before(grammarAccess.getDotIDAccess().getNUMPREFIXEDIDTerminalRuleCall_1()); 
                    match(input,RULE_NUMPREFIXEDID,FollowSets000.FOLLOW_RULE_NUMPREFIXEDID_in_rule__DotID__Alternatives729); 
                     after(grammarAccess.getDotIDAccess().getNUMPREFIXEDIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:363:6: ( ruleNumber )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:363:6: ( ruleNumber )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:364:1: ruleNumber
                    {
                     before(grammarAccess.getDotIDAccess().getNumberParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleNumber_in_rule__DotID__Alternatives746);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getDotIDAccess().getNumberParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:369:6: ( RULE_ID )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:369:6: ( RULE_ID )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:370:1: RULE_ID
                    {
                     before(grammarAccess.getDotIDAccess().getIDTerminalRuleCall_3()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__DotID__Alternatives763); 
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


    // $ANTLR start "rule__Number__Alternatives_1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:380:1: rule__Number__Alternatives_1 : ( ( RULE_DOUBLE ) | ( RULE_INT ) );
    public final void rule__Number__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:384:1: ( ( RULE_DOUBLE ) | ( RULE_INT ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_DOUBLE) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:385:1: ( RULE_DOUBLE )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:385:1: ( RULE_DOUBLE )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:386:1: RULE_DOUBLE
                    {
                     before(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_1_0()); 
                    match(input,RULE_DOUBLE,FollowSets000.FOLLOW_RULE_DOUBLE_in_rule__Number__Alternatives_1795); 
                     after(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:391:6: ( RULE_INT )
                    {
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:391:6: ( RULE_INT )
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:392:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1()); 
                    match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Number__Alternatives_1812); 
                     after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Number__Alternatives_1"


    // $ANTLR start "rule__DotGraph__Group__0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:404:1: rule__DotGraph__Group__0 : rule__DotGraph__Group__0__Impl rule__DotGraph__Group__1 ;
    public final void rule__DotGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:408:1: ( rule__DotGraph__Group__0__Impl rule__DotGraph__Group__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:409:2: rule__DotGraph__Group__0__Impl rule__DotGraph__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group__0__Impl_in_rule__DotGraph__Group__0842);
            rule__DotGraph__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group__1_in_rule__DotGraph__Group__0845);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:416:1: rule__DotGraph__Group__0__Impl : ( () ) ;
    public final void rule__DotGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:420:1: ( ( () ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:421:1: ( () )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:421:1: ( () )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:422:1: ()
            {
             before(grammarAccess.getDotGraphAccess().getDotGraphAction_0()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:423:1: ()
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:425:1: 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:435:1: rule__DotGraph__Group__1 : rule__DotGraph__Group__1__Impl rule__DotGraph__Group__2 ;
    public final void rule__DotGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:439:1: ( rule__DotGraph__Group__1__Impl rule__DotGraph__Group__2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:440:2: rule__DotGraph__Group__1__Impl rule__DotGraph__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group__1__Impl_in_rule__DotGraph__Group__1903);
            rule__DotGraph__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group__2_in_rule__DotGraph__Group__1906);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:447:1: rule__DotGraph__Group__1__Impl : ( ( rule__DotGraph__Alternatives_1 ) ) ;
    public final void rule__DotGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:451:1: ( ( ( rule__DotGraph__Alternatives_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:452:1: ( ( rule__DotGraph__Alternatives_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:452:1: ( ( rule__DotGraph__Alternatives_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:453:1: ( rule__DotGraph__Alternatives_1 )
            {
             before(grammarAccess.getDotGraphAccess().getAlternatives_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:454:1: ( rule__DotGraph__Alternatives_1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:454:2: rule__DotGraph__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Alternatives_1_in_rule__DotGraph__Group__1__Impl933);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:464:1: rule__DotGraph__Group__2 : rule__DotGraph__Group__2__Impl rule__DotGraph__Group__3 ;
    public final void rule__DotGraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:468:1: ( rule__DotGraph__Group__2__Impl rule__DotGraph__Group__3 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:469:2: rule__DotGraph__Group__2__Impl rule__DotGraph__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group__2__Impl_in_rule__DotGraph__Group__2963);
            rule__DotGraph__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group__3_in_rule__DotGraph__Group__2966);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:476:1: rule__DotGraph__Group__2__Impl : ( '{' ) ;
    public final void rule__DotGraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:480:1: ( ( '{' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:481:1: ( '{' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:481:1: ( '{' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:482:1: '{'
            {
             before(grammarAccess.getDotGraphAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__DotGraph__Group__2__Impl994); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:495:1: rule__DotGraph__Group__3 : rule__DotGraph__Group__3__Impl rule__DotGraph__Group__4 ;
    public final void rule__DotGraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:499:1: ( rule__DotGraph__Group__3__Impl rule__DotGraph__Group__4 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:500:2: rule__DotGraph__Group__3__Impl rule__DotGraph__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group__3__Impl_in_rule__DotGraph__Group__31025);
            rule__DotGraph__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group__4_in_rule__DotGraph__Group__31028);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:507:1: rule__DotGraph__Group__3__Impl : ( ( rule__DotGraph__Alternatives_3 )* ) ;
    public final void rule__DotGraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:511:1: ( ( ( rule__DotGraph__Alternatives_3 )* ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:512:1: ( ( rule__DotGraph__Alternatives_3 )* )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:512:1: ( ( rule__DotGraph__Alternatives_3 )* )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:513:1: ( rule__DotGraph__Alternatives_3 )*
            {
             before(grammarAccess.getDotGraphAccess().getAlternatives_3()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:514:1: ( rule__DotGraph__Alternatives_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_DOTSTRINGTERM && LA7_0<=RULE_INT)||LA7_0==14||LA7_0==19||(LA7_0>=24 && LA7_0<=25)||(LA7_0>=27 && LA7_0<=28)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:514:2: rule__DotGraph__Alternatives_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Alternatives_3_in_rule__DotGraph__Group__3__Impl1055);
            	    rule__DotGraph__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:524:1: rule__DotGraph__Group__4 : rule__DotGraph__Group__4__Impl ;
    public final void rule__DotGraph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:528:1: ( rule__DotGraph__Group__4__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:529:2: rule__DotGraph__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group__4__Impl_in_rule__DotGraph__Group__41086);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:535:1: rule__DotGraph__Group__4__Impl : ( '}' ) ;
    public final void rule__DotGraph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:539:1: ( ( '}' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:540:1: ( '}' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:540:1: ( '}' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:541:1: '}'
            {
             before(grammarAccess.getDotGraphAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__DotGraph__Group__4__Impl1114); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:564:1: rule__DotGraph__Group_1_0__0 : rule__DotGraph__Group_1_0__0__Impl rule__DotGraph__Group_1_0__1 ;
    public final void rule__DotGraph__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:568:1: ( rule__DotGraph__Group_1_0__0__Impl rule__DotGraph__Group_1_0__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:569:2: rule__DotGraph__Group_1_0__0__Impl rule__DotGraph__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_1_0__0__Impl_in_rule__DotGraph__Group_1_0__01155);
            rule__DotGraph__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_1_0__1_in_rule__DotGraph__Group_1_0__01158);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:576:1: rule__DotGraph__Group_1_0__0__Impl : ( ( rule__DotGraph__Alternatives_1_0_0 ) ) ;
    public final void rule__DotGraph__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:580:1: ( ( ( rule__DotGraph__Alternatives_1_0_0 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:581:1: ( ( rule__DotGraph__Alternatives_1_0_0 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:581:1: ( ( rule__DotGraph__Alternatives_1_0_0 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:582:1: ( rule__DotGraph__Alternatives_1_0_0 )
            {
             before(grammarAccess.getDotGraphAccess().getAlternatives_1_0_0()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:583:1: ( rule__DotGraph__Alternatives_1_0_0 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:583:2: rule__DotGraph__Alternatives_1_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Alternatives_1_0_0_in_rule__DotGraph__Group_1_0__0__Impl1185);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:593:1: rule__DotGraph__Group_1_0__1 : rule__DotGraph__Group_1_0__1__Impl ;
    public final void rule__DotGraph__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:597:1: ( rule__DotGraph__Group_1_0__1__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:598:2: rule__DotGraph__Group_1_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_1_0__1__Impl_in_rule__DotGraph__Group_1_0__11215);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:604:1: rule__DotGraph__Group_1_0__1__Impl : ( ( rule__DotGraph__IdAssignment_1_0_1 )? ) ;
    public final void rule__DotGraph__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:608:1: ( ( ( rule__DotGraph__IdAssignment_1_0_1 )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:609:1: ( ( rule__DotGraph__IdAssignment_1_0_1 )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:609:1: ( ( rule__DotGraph__IdAssignment_1_0_1 )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:610:1: ( rule__DotGraph__IdAssignment_1_0_1 )?
            {
             before(grammarAccess.getDotGraphAccess().getIdAssignment_1_0_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:611:1: ( rule__DotGraph__IdAssignment_1_0_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_DOTSTRINGTERM && LA8_0<=RULE_INT)||LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:611:2: rule__DotGraph__IdAssignment_1_0_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__IdAssignment_1_0_1_in_rule__DotGraph__Group_1_0__1__Impl1242);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:625:1: rule__DotGraph__Group_1_1__0 : rule__DotGraph__Group_1_1__0__Impl rule__DotGraph__Group_1_1__1 ;
    public final void rule__DotGraph__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:629:1: ( rule__DotGraph__Group_1_1__0__Impl rule__DotGraph__Group_1_1__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:630:2: rule__DotGraph__Group_1_1__0__Impl rule__DotGraph__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_1_1__0__Impl_in_rule__DotGraph__Group_1_1__01277);
            rule__DotGraph__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_1_1__1_in_rule__DotGraph__Group_1_1__01280);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:637:1: rule__DotGraph__Group_1_1__0__Impl : ( 'subgraph' ) ;
    public final void rule__DotGraph__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:641:1: ( ( 'subgraph' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:642:1: ( 'subgraph' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:642:1: ( 'subgraph' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:643:1: 'subgraph'
            {
             before(grammarAccess.getDotGraphAccess().getSubgraphKeyword_1_1_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__DotGraph__Group_1_1__0__Impl1308); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:656:1: rule__DotGraph__Group_1_1__1 : rule__DotGraph__Group_1_1__1__Impl ;
    public final void rule__DotGraph__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:660:1: ( rule__DotGraph__Group_1_1__1__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:661:2: rule__DotGraph__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_1_1__1__Impl_in_rule__DotGraph__Group_1_1__11339);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:667:1: rule__DotGraph__Group_1_1__1__Impl : ( ( rule__DotGraph__IdAssignment_1_1_1 )? ) ;
    public final void rule__DotGraph__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:671:1: ( ( ( rule__DotGraph__IdAssignment_1_1_1 )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:672:1: ( ( rule__DotGraph__IdAssignment_1_1_1 )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:672:1: ( ( rule__DotGraph__IdAssignment_1_1_1 )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:673:1: ( rule__DotGraph__IdAssignment_1_1_1 )?
            {
             before(grammarAccess.getDotGraphAccess().getIdAssignment_1_1_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:674:1: ( rule__DotGraph__IdAssignment_1_1_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_DOTSTRINGTERM && LA9_0<=RULE_INT)||LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:674:2: rule__DotGraph__IdAssignment_1_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__IdAssignment_1_1_1_in_rule__DotGraph__Group_1_1__1__Impl1366);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:688:1: rule__DotGraph__Group_3_0__0 : rule__DotGraph__Group_3_0__0__Impl rule__DotGraph__Group_3_0__1 ;
    public final void rule__DotGraph__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:692:1: ( rule__DotGraph__Group_3_0__0__Impl rule__DotGraph__Group_3_0__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:693:2: rule__DotGraph__Group_3_0__0__Impl rule__DotGraph__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__0__Impl_in_rule__DotGraph__Group_3_0__01401);
            rule__DotGraph__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__1_in_rule__DotGraph__Group_3_0__01404);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:700:1: rule__DotGraph__Group_3_0__0__Impl : ( 'graph' ) ;
    public final void rule__DotGraph__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:704:1: ( ( 'graph' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:705:1: ( 'graph' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:705:1: ( 'graph' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:706:1: 'graph'
            {
             before(grammarAccess.getDotGraphAccess().getGraphKeyword_3_0_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__DotGraph__Group_3_0__0__Impl1432); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:719:1: rule__DotGraph__Group_3_0__1 : rule__DotGraph__Group_3_0__1__Impl rule__DotGraph__Group_3_0__2 ;
    public final void rule__DotGraph__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:723:1: ( rule__DotGraph__Group_3_0__1__Impl rule__DotGraph__Group_3_0__2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:724:2: rule__DotGraph__Group_3_0__1__Impl rule__DotGraph__Group_3_0__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__1__Impl_in_rule__DotGraph__Group_3_0__11463);
            rule__DotGraph__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__2_in_rule__DotGraph__Group_3_0__11466);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:731:1: rule__DotGraph__Group_3_0__1__Impl : ( '[' ) ;
    public final void rule__DotGraph__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:735:1: ( ( '[' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:736:1: ( '[' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:736:1: ( '[' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:737:1: '['
            {
             before(grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_3_0_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__DotGraph__Group_3_0__1__Impl1494); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:750:1: rule__DotGraph__Group_3_0__2 : rule__DotGraph__Group_3_0__2__Impl rule__DotGraph__Group_3_0__3 ;
    public final void rule__DotGraph__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:754:1: ( rule__DotGraph__Group_3_0__2__Impl rule__DotGraph__Group_3_0__3 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:755:2: rule__DotGraph__Group_3_0__2__Impl rule__DotGraph__Group_3_0__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__2__Impl_in_rule__DotGraph__Group_3_0__21525);
            rule__DotGraph__Group_3_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__3_in_rule__DotGraph__Group_3_0__21528);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:762:1: rule__DotGraph__Group_3_0__2__Impl : ( ( rule__DotGraph__GraphSettingsAssignment_3_0_2 ) ) ;
    public final void rule__DotGraph__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:766:1: ( ( ( rule__DotGraph__GraphSettingsAssignment_3_0_2 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:767:1: ( ( rule__DotGraph__GraphSettingsAssignment_3_0_2 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:767:1: ( ( rule__DotGraph__GraphSettingsAssignment_3_0_2 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:768:1: ( rule__DotGraph__GraphSettingsAssignment_3_0_2 )
            {
             before(grammarAccess.getDotGraphAccess().getGraphSettingsAssignment_3_0_2()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:769:1: ( rule__DotGraph__GraphSettingsAssignment_3_0_2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:769:2: rule__DotGraph__GraphSettingsAssignment_3_0_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__GraphSettingsAssignment_3_0_2_in_rule__DotGraph__Group_3_0__2__Impl1555);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:779:1: rule__DotGraph__Group_3_0__3 : rule__DotGraph__Group_3_0__3__Impl rule__DotGraph__Group_3_0__4 ;
    public final void rule__DotGraph__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:783:1: ( rule__DotGraph__Group_3_0__3__Impl rule__DotGraph__Group_3_0__4 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:784:2: rule__DotGraph__Group_3_0__3__Impl rule__DotGraph__Group_3_0__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__3__Impl_in_rule__DotGraph__Group_3_0__31585);
            rule__DotGraph__Group_3_0__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__4_in_rule__DotGraph__Group_3_0__31588);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:791:1: rule__DotGraph__Group_3_0__3__Impl : ( ( rule__DotGraph__Group_3_0_3__0 )* ) ;
    public final void rule__DotGraph__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:795:1: ( ( ( rule__DotGraph__Group_3_0_3__0 )* ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:796:1: ( ( rule__DotGraph__Group_3_0_3__0 )* )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:796:1: ( ( rule__DotGraph__Group_3_0_3__0 )* )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:797:1: ( rule__DotGraph__Group_3_0_3__0 )*
            {
             before(grammarAccess.getDotGraphAccess().getGroup_3_0_3()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:798:1: ( rule__DotGraph__Group_3_0_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:798:2: rule__DotGraph__Group_3_0_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0_3__0_in_rule__DotGraph__Group_3_0__3__Impl1615);
            	    rule__DotGraph__Group_3_0_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:808:1: rule__DotGraph__Group_3_0__4 : rule__DotGraph__Group_3_0__4__Impl rule__DotGraph__Group_3_0__5 ;
    public final void rule__DotGraph__Group_3_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:812:1: ( rule__DotGraph__Group_3_0__4__Impl rule__DotGraph__Group_3_0__5 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:813:2: rule__DotGraph__Group_3_0__4__Impl rule__DotGraph__Group_3_0__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__4__Impl_in_rule__DotGraph__Group_3_0__41646);
            rule__DotGraph__Group_3_0__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__5_in_rule__DotGraph__Group_3_0__41649);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:820:1: rule__DotGraph__Group_3_0__4__Impl : ( ']' ) ;
    public final void rule__DotGraph__Group_3_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:824:1: ( ( ']' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:825:1: ( ']' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:825:1: ( ']' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:826:1: ']'
            {
             before(grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_3_0_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__DotGraph__Group_3_0__4__Impl1677); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:839:1: rule__DotGraph__Group_3_0__5 : rule__DotGraph__Group_3_0__5__Impl ;
    public final void rule__DotGraph__Group_3_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:843:1: ( rule__DotGraph__Group_3_0__5__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:844:2: rule__DotGraph__Group_3_0__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0__5__Impl_in_rule__DotGraph__Group_3_0__51708);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:850:1: rule__DotGraph__Group_3_0__5__Impl : ( ( ';' )? ) ;
    public final void rule__DotGraph__Group_3_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:854:1: ( ( ( ';' )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:855:1: ( ( ';' )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:855:1: ( ( ';' )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:856:1: ( ';' )?
            {
             before(grammarAccess.getDotGraphAccess().getSemicolonKeyword_3_0_5()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:857:1: ( ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:858:2: ';'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__DotGraph__Group_3_0__5__Impl1737); 

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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:881:1: rule__DotGraph__Group_3_0_3__0 : rule__DotGraph__Group_3_0_3__0__Impl rule__DotGraph__Group_3_0_3__1 ;
    public final void rule__DotGraph__Group_3_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:885:1: ( rule__DotGraph__Group_3_0_3__0__Impl rule__DotGraph__Group_3_0_3__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:886:2: rule__DotGraph__Group_3_0_3__0__Impl rule__DotGraph__Group_3_0_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0_3__0__Impl_in_rule__DotGraph__Group_3_0_3__01782);
            rule__DotGraph__Group_3_0_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0_3__1_in_rule__DotGraph__Group_3_0_3__01785);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:893:1: rule__DotGraph__Group_3_0_3__0__Impl : ( ',' ) ;
    public final void rule__DotGraph__Group_3_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:897:1: ( ( ',' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:898:1: ( ',' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:898:1: ( ',' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:899:1: ','
            {
             before(grammarAccess.getDotGraphAccess().getCommaKeyword_3_0_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__DotGraph__Group_3_0_3__0__Impl1813); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:912:1: rule__DotGraph__Group_3_0_3__1 : rule__DotGraph__Group_3_0_3__1__Impl ;
    public final void rule__DotGraph__Group_3_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:916:1: ( rule__DotGraph__Group_3_0_3__1__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:917:2: rule__DotGraph__Group_3_0_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_0_3__1__Impl_in_rule__DotGraph__Group_3_0_3__11844);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:923:1: rule__DotGraph__Group_3_0_3__1__Impl : ( ( rule__DotGraph__GraphSettingsAssignment_3_0_3_1 ) ) ;
    public final void rule__DotGraph__Group_3_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:927:1: ( ( ( rule__DotGraph__GraphSettingsAssignment_3_0_3_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:928:1: ( ( rule__DotGraph__GraphSettingsAssignment_3_0_3_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:928:1: ( ( rule__DotGraph__GraphSettingsAssignment_3_0_3_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:929:1: ( rule__DotGraph__GraphSettingsAssignment_3_0_3_1 )
            {
             before(grammarAccess.getDotGraphAccess().getGraphSettingsAssignment_3_0_3_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:930:1: ( rule__DotGraph__GraphSettingsAssignment_3_0_3_1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:930:2: rule__DotGraph__GraphSettingsAssignment_3_0_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__GraphSettingsAssignment_3_0_3_1_in_rule__DotGraph__Group_3_0_3__1__Impl1871);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:944:1: rule__DotGraph__Group_3_1__0 : rule__DotGraph__Group_3_1__0__Impl rule__DotGraph__Group_3_1__1 ;
    public final void rule__DotGraph__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:948:1: ( rule__DotGraph__Group_3_1__0__Impl rule__DotGraph__Group_3_1__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:949:2: rule__DotGraph__Group_3_1__0__Impl rule__DotGraph__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__0__Impl_in_rule__DotGraph__Group_3_1__01905);
            rule__DotGraph__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__1_in_rule__DotGraph__Group_3_1__01908);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:956:1: rule__DotGraph__Group_3_1__0__Impl : ( 'node' ) ;
    public final void rule__DotGraph__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:960:1: ( ( 'node' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:961:1: ( 'node' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:961:1: ( 'node' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:962:1: 'node'
            {
             before(grammarAccess.getDotGraphAccess().getNodeKeyword_3_1_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__DotGraph__Group_3_1__0__Impl1936); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:975:1: rule__DotGraph__Group_3_1__1 : rule__DotGraph__Group_3_1__1__Impl rule__DotGraph__Group_3_1__2 ;
    public final void rule__DotGraph__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:979:1: ( rule__DotGraph__Group_3_1__1__Impl rule__DotGraph__Group_3_1__2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:980:2: rule__DotGraph__Group_3_1__1__Impl rule__DotGraph__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__1__Impl_in_rule__DotGraph__Group_3_1__11967);
            rule__DotGraph__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__2_in_rule__DotGraph__Group_3_1__11970);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:987:1: rule__DotGraph__Group_3_1__1__Impl : ( '[' ) ;
    public final void rule__DotGraph__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:991:1: ( ( '[' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:992:1: ( '[' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:992:1: ( '[' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:993:1: '['
            {
             before(grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_3_1_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__DotGraph__Group_3_1__1__Impl1998); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1006:1: rule__DotGraph__Group_3_1__2 : rule__DotGraph__Group_3_1__2__Impl rule__DotGraph__Group_3_1__3 ;
    public final void rule__DotGraph__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1010:1: ( rule__DotGraph__Group_3_1__2__Impl rule__DotGraph__Group_3_1__3 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1011:2: rule__DotGraph__Group_3_1__2__Impl rule__DotGraph__Group_3_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__2__Impl_in_rule__DotGraph__Group_3_1__22029);
            rule__DotGraph__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__3_in_rule__DotGraph__Group_3_1__22032);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1018:1: rule__DotGraph__Group_3_1__2__Impl : ( ( rule__DotGraph__NodeSettingsAssignment_3_1_2 ) ) ;
    public final void rule__DotGraph__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1022:1: ( ( ( rule__DotGraph__NodeSettingsAssignment_3_1_2 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1023:1: ( ( rule__DotGraph__NodeSettingsAssignment_3_1_2 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1023:1: ( ( rule__DotGraph__NodeSettingsAssignment_3_1_2 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1024:1: ( rule__DotGraph__NodeSettingsAssignment_3_1_2 )
            {
             before(grammarAccess.getDotGraphAccess().getNodeSettingsAssignment_3_1_2()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1025:1: ( rule__DotGraph__NodeSettingsAssignment_3_1_2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1025:2: rule__DotGraph__NodeSettingsAssignment_3_1_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__NodeSettingsAssignment_3_1_2_in_rule__DotGraph__Group_3_1__2__Impl2059);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1035:1: rule__DotGraph__Group_3_1__3 : rule__DotGraph__Group_3_1__3__Impl rule__DotGraph__Group_3_1__4 ;
    public final void rule__DotGraph__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1039:1: ( rule__DotGraph__Group_3_1__3__Impl rule__DotGraph__Group_3_1__4 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1040:2: rule__DotGraph__Group_3_1__3__Impl rule__DotGraph__Group_3_1__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__3__Impl_in_rule__DotGraph__Group_3_1__32089);
            rule__DotGraph__Group_3_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__4_in_rule__DotGraph__Group_3_1__32092);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1047:1: rule__DotGraph__Group_3_1__3__Impl : ( ( rule__DotGraph__Group_3_1_3__0 )* ) ;
    public final void rule__DotGraph__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1051:1: ( ( ( rule__DotGraph__Group_3_1_3__0 )* ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1052:1: ( ( rule__DotGraph__Group_3_1_3__0 )* )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1052:1: ( ( rule__DotGraph__Group_3_1_3__0 )* )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1053:1: ( rule__DotGraph__Group_3_1_3__0 )*
            {
             before(grammarAccess.getDotGraphAccess().getGroup_3_1_3()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1054:1: ( rule__DotGraph__Group_3_1_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1054:2: rule__DotGraph__Group_3_1_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1_3__0_in_rule__DotGraph__Group_3_1__3__Impl2119);
            	    rule__DotGraph__Group_3_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1064:1: rule__DotGraph__Group_3_1__4 : rule__DotGraph__Group_3_1__4__Impl rule__DotGraph__Group_3_1__5 ;
    public final void rule__DotGraph__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1068:1: ( rule__DotGraph__Group_3_1__4__Impl rule__DotGraph__Group_3_1__5 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1069:2: rule__DotGraph__Group_3_1__4__Impl rule__DotGraph__Group_3_1__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__4__Impl_in_rule__DotGraph__Group_3_1__42150);
            rule__DotGraph__Group_3_1__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__5_in_rule__DotGraph__Group_3_1__42153);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1076:1: rule__DotGraph__Group_3_1__4__Impl : ( ']' ) ;
    public final void rule__DotGraph__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1080:1: ( ( ']' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1081:1: ( ']' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1081:1: ( ']' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1082:1: ']'
            {
             before(grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_3_1_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__DotGraph__Group_3_1__4__Impl2181); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1095:1: rule__DotGraph__Group_3_1__5 : rule__DotGraph__Group_3_1__5__Impl ;
    public final void rule__DotGraph__Group_3_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1099:1: ( rule__DotGraph__Group_3_1__5__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1100:2: rule__DotGraph__Group_3_1__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1__5__Impl_in_rule__DotGraph__Group_3_1__52212);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1106:1: rule__DotGraph__Group_3_1__5__Impl : ( ( ';' )? ) ;
    public final void rule__DotGraph__Group_3_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1110:1: ( ( ( ';' )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1111:1: ( ( ';' )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1111:1: ( ( ';' )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1112:1: ( ';' )?
            {
             before(grammarAccess.getDotGraphAccess().getSemicolonKeyword_3_1_5()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1113:1: ( ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1114:2: ';'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__DotGraph__Group_3_1__5__Impl2241); 

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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1137:1: rule__DotGraph__Group_3_1_3__0 : rule__DotGraph__Group_3_1_3__0__Impl rule__DotGraph__Group_3_1_3__1 ;
    public final void rule__DotGraph__Group_3_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1141:1: ( rule__DotGraph__Group_3_1_3__0__Impl rule__DotGraph__Group_3_1_3__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1142:2: rule__DotGraph__Group_3_1_3__0__Impl rule__DotGraph__Group_3_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1_3__0__Impl_in_rule__DotGraph__Group_3_1_3__02286);
            rule__DotGraph__Group_3_1_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1_3__1_in_rule__DotGraph__Group_3_1_3__02289);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1149:1: rule__DotGraph__Group_3_1_3__0__Impl : ( ',' ) ;
    public final void rule__DotGraph__Group_3_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1153:1: ( ( ',' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1154:1: ( ',' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1154:1: ( ',' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1155:1: ','
            {
             before(grammarAccess.getDotGraphAccess().getCommaKeyword_3_1_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__DotGraph__Group_3_1_3__0__Impl2317); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1168:1: rule__DotGraph__Group_3_1_3__1 : rule__DotGraph__Group_3_1_3__1__Impl ;
    public final void rule__DotGraph__Group_3_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1172:1: ( rule__DotGraph__Group_3_1_3__1__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1173:2: rule__DotGraph__Group_3_1_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_1_3__1__Impl_in_rule__DotGraph__Group_3_1_3__12348);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1179:1: rule__DotGraph__Group_3_1_3__1__Impl : ( ( rule__DotGraph__NodeSettingsAssignment_3_1_3_1 ) ) ;
    public final void rule__DotGraph__Group_3_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1183:1: ( ( ( rule__DotGraph__NodeSettingsAssignment_3_1_3_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1184:1: ( ( rule__DotGraph__NodeSettingsAssignment_3_1_3_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1184:1: ( ( rule__DotGraph__NodeSettingsAssignment_3_1_3_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1185:1: ( rule__DotGraph__NodeSettingsAssignment_3_1_3_1 )
            {
             before(grammarAccess.getDotGraphAccess().getNodeSettingsAssignment_3_1_3_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1186:1: ( rule__DotGraph__NodeSettingsAssignment_3_1_3_1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1186:2: rule__DotGraph__NodeSettingsAssignment_3_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__NodeSettingsAssignment_3_1_3_1_in_rule__DotGraph__Group_3_1_3__1__Impl2375);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1200:1: rule__DotGraph__Group_3_2__0 : rule__DotGraph__Group_3_2__0__Impl rule__DotGraph__Group_3_2__1 ;
    public final void rule__DotGraph__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1204:1: ( rule__DotGraph__Group_3_2__0__Impl rule__DotGraph__Group_3_2__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1205:2: rule__DotGraph__Group_3_2__0__Impl rule__DotGraph__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__0__Impl_in_rule__DotGraph__Group_3_2__02409);
            rule__DotGraph__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__1_in_rule__DotGraph__Group_3_2__02412);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1212:1: rule__DotGraph__Group_3_2__0__Impl : ( 'edge' ) ;
    public final void rule__DotGraph__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1216:1: ( ( 'edge' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1217:1: ( 'edge' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1217:1: ( 'edge' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1218:1: 'edge'
            {
             before(grammarAccess.getDotGraphAccess().getEdgeKeyword_3_2_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__DotGraph__Group_3_2__0__Impl2440); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1231:1: rule__DotGraph__Group_3_2__1 : rule__DotGraph__Group_3_2__1__Impl rule__DotGraph__Group_3_2__2 ;
    public final void rule__DotGraph__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1235:1: ( rule__DotGraph__Group_3_2__1__Impl rule__DotGraph__Group_3_2__2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1236:2: rule__DotGraph__Group_3_2__1__Impl rule__DotGraph__Group_3_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__1__Impl_in_rule__DotGraph__Group_3_2__12471);
            rule__DotGraph__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__2_in_rule__DotGraph__Group_3_2__12474);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1243:1: rule__DotGraph__Group_3_2__1__Impl : ( '[' ) ;
    public final void rule__DotGraph__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1247:1: ( ( '[' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1248:1: ( '[' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1248:1: ( '[' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1249:1: '['
            {
             before(grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_3_2_1()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__DotGraph__Group_3_2__1__Impl2502); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1262:1: rule__DotGraph__Group_3_2__2 : rule__DotGraph__Group_3_2__2__Impl rule__DotGraph__Group_3_2__3 ;
    public final void rule__DotGraph__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1266:1: ( rule__DotGraph__Group_3_2__2__Impl rule__DotGraph__Group_3_2__3 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1267:2: rule__DotGraph__Group_3_2__2__Impl rule__DotGraph__Group_3_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__2__Impl_in_rule__DotGraph__Group_3_2__22533);
            rule__DotGraph__Group_3_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__3_in_rule__DotGraph__Group_3_2__22536);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1274:1: rule__DotGraph__Group_3_2__2__Impl : ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_2 ) ) ;
    public final void rule__DotGraph__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1278:1: ( ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_2 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1279:1: ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_2 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1279:1: ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_2 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1280:1: ( rule__DotGraph__EdgeSettingsAssignment_3_2_2 )
            {
             before(grammarAccess.getDotGraphAccess().getEdgeSettingsAssignment_3_2_2()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1281:1: ( rule__DotGraph__EdgeSettingsAssignment_3_2_2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1281:2: rule__DotGraph__EdgeSettingsAssignment_3_2_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__EdgeSettingsAssignment_3_2_2_in_rule__DotGraph__Group_3_2__2__Impl2563);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1291:1: rule__DotGraph__Group_3_2__3 : rule__DotGraph__Group_3_2__3__Impl rule__DotGraph__Group_3_2__4 ;
    public final void rule__DotGraph__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1295:1: ( rule__DotGraph__Group_3_2__3__Impl rule__DotGraph__Group_3_2__4 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1296:2: rule__DotGraph__Group_3_2__3__Impl rule__DotGraph__Group_3_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__3__Impl_in_rule__DotGraph__Group_3_2__32593);
            rule__DotGraph__Group_3_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__4_in_rule__DotGraph__Group_3_2__32596);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1303:1: rule__DotGraph__Group_3_2__3__Impl : ( ( rule__DotGraph__Group_3_2_3__0 )* ) ;
    public final void rule__DotGraph__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1307:1: ( ( ( rule__DotGraph__Group_3_2_3__0 )* ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1308:1: ( ( rule__DotGraph__Group_3_2_3__0 )* )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1308:1: ( ( rule__DotGraph__Group_3_2_3__0 )* )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1309:1: ( rule__DotGraph__Group_3_2_3__0 )*
            {
             before(grammarAccess.getDotGraphAccess().getGroup_3_2_3()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1310:1: ( rule__DotGraph__Group_3_2_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1310:2: rule__DotGraph__Group_3_2_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2_3__0_in_rule__DotGraph__Group_3_2__3__Impl2623);
            	    rule__DotGraph__Group_3_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1320:1: rule__DotGraph__Group_3_2__4 : rule__DotGraph__Group_3_2__4__Impl rule__DotGraph__Group_3_2__5 ;
    public final void rule__DotGraph__Group_3_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1324:1: ( rule__DotGraph__Group_3_2__4__Impl rule__DotGraph__Group_3_2__5 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1325:2: rule__DotGraph__Group_3_2__4__Impl rule__DotGraph__Group_3_2__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__4__Impl_in_rule__DotGraph__Group_3_2__42654);
            rule__DotGraph__Group_3_2__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__5_in_rule__DotGraph__Group_3_2__42657);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1332:1: rule__DotGraph__Group_3_2__4__Impl : ( ']' ) ;
    public final void rule__DotGraph__Group_3_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1336:1: ( ( ']' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1337:1: ( ']' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1337:1: ( ']' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1338:1: ']'
            {
             before(grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_3_2_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__DotGraph__Group_3_2__4__Impl2685); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1351:1: rule__DotGraph__Group_3_2__5 : rule__DotGraph__Group_3_2__5__Impl ;
    public final void rule__DotGraph__Group_3_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1355:1: ( rule__DotGraph__Group_3_2__5__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1356:2: rule__DotGraph__Group_3_2__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2__5__Impl_in_rule__DotGraph__Group_3_2__52716);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1362:1: rule__DotGraph__Group_3_2__5__Impl : ( ( ';' )? ) ;
    public final void rule__DotGraph__Group_3_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1366:1: ( ( ( ';' )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1367:1: ( ( ';' )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1367:1: ( ( ';' )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1368:1: ( ';' )?
            {
             before(grammarAccess.getDotGraphAccess().getSemicolonKeyword_3_2_5()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1369:1: ( ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1370:2: ';'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__DotGraph__Group_3_2__5__Impl2745); 

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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1393:1: rule__DotGraph__Group_3_2_3__0 : rule__DotGraph__Group_3_2_3__0__Impl rule__DotGraph__Group_3_2_3__1 ;
    public final void rule__DotGraph__Group_3_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1397:1: ( rule__DotGraph__Group_3_2_3__0__Impl rule__DotGraph__Group_3_2_3__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1398:2: rule__DotGraph__Group_3_2_3__0__Impl rule__DotGraph__Group_3_2_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2_3__0__Impl_in_rule__DotGraph__Group_3_2_3__02790);
            rule__DotGraph__Group_3_2_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2_3__1_in_rule__DotGraph__Group_3_2_3__02793);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1405:1: rule__DotGraph__Group_3_2_3__0__Impl : ( ',' ) ;
    public final void rule__DotGraph__Group_3_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1409:1: ( ( ',' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1410:1: ( ',' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1410:1: ( ',' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1411:1: ','
            {
             before(grammarAccess.getDotGraphAccess().getCommaKeyword_3_2_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__DotGraph__Group_3_2_3__0__Impl2821); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1424:1: rule__DotGraph__Group_3_2_3__1 : rule__DotGraph__Group_3_2_3__1__Impl ;
    public final void rule__DotGraph__Group_3_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1428:1: ( rule__DotGraph__Group_3_2_3__1__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1429:2: rule__DotGraph__Group_3_2_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__Group_3_2_3__1__Impl_in_rule__DotGraph__Group_3_2_3__12852);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1435:1: rule__DotGraph__Group_3_2_3__1__Impl : ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_3_1 ) ) ;
    public final void rule__DotGraph__Group_3_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1439:1: ( ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_3_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1440:1: ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_3_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1440:1: ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_3_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1441:1: ( rule__DotGraph__EdgeSettingsAssignment_3_2_3_1 )
            {
             before(grammarAccess.getDotGraphAccess().getEdgeSettingsAssignment_3_2_3_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1442:1: ( rule__DotGraph__EdgeSettingsAssignment_3_2_3_1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1442:2: rule__DotGraph__EdgeSettingsAssignment_3_2_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotGraph__EdgeSettingsAssignment_3_2_3_1_in_rule__DotGraph__Group_3_2_3__1__Impl2879);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1456:1: rule__DotNode__Group__0 : rule__DotNode__Group__0__Impl rule__DotNode__Group__1 ;
    public final void rule__DotNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1460:1: ( rule__DotNode__Group__0__Impl rule__DotNode__Group__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1461:2: rule__DotNode__Group__0__Impl rule__DotNode__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group__0__Impl_in_rule__DotNode__Group__02913);
            rule__DotNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group__1_in_rule__DotNode__Group__02916);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1468:1: rule__DotNode__Group__0__Impl : ( ( rule__DotNode__NameAssignment_0 ) ) ;
    public final void rule__DotNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1472:1: ( ( ( rule__DotNode__NameAssignment_0 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1473:1: ( ( rule__DotNode__NameAssignment_0 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1473:1: ( ( rule__DotNode__NameAssignment_0 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1474:1: ( rule__DotNode__NameAssignment_0 )
            {
             before(grammarAccess.getDotNodeAccess().getNameAssignment_0()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1475:1: ( rule__DotNode__NameAssignment_0 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1475:2: rule__DotNode__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__NameAssignment_0_in_rule__DotNode__Group__0__Impl2943);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1485:1: rule__DotNode__Group__1 : rule__DotNode__Group__1__Impl rule__DotNode__Group__2 ;
    public final void rule__DotNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1489:1: ( rule__DotNode__Group__1__Impl rule__DotNode__Group__2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1490:2: rule__DotNode__Group__1__Impl rule__DotNode__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group__1__Impl_in_rule__DotNode__Group__12973);
            rule__DotNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group__2_in_rule__DotNode__Group__12976);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1497:1: rule__DotNode__Group__1__Impl : ( ( rule__DotNode__Group_1__0 )? ) ;
    public final void rule__DotNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1501:1: ( ( ( rule__DotNode__Group_1__0 )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1502:1: ( ( rule__DotNode__Group_1__0 )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1502:1: ( ( rule__DotNode__Group_1__0 )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1503:1: ( rule__DotNode__Group_1__0 )?
            {
             before(grammarAccess.getDotNodeAccess().getGroup_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1504:1: ( rule__DotNode__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1504:2: rule__DotNode__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1__0_in_rule__DotNode__Group__1__Impl3003);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1514:1: rule__DotNode__Group__2 : rule__DotNode__Group__2__Impl ;
    public final void rule__DotNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1518:1: ( rule__DotNode__Group__2__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1519:2: rule__DotNode__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group__2__Impl_in_rule__DotNode__Group__23034);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1525:1: rule__DotNode__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__DotNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1529:1: ( ( ( ';' )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1530:1: ( ( ';' )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1530:1: ( ( ';' )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1531:1: ( ';' )?
            {
             before(grammarAccess.getDotNodeAccess().getSemicolonKeyword_2()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1532:1: ( ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1533:2: ';'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__DotNode__Group__2__Impl3063); 

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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1550:1: rule__DotNode__Group_1__0 : rule__DotNode__Group_1__0__Impl rule__DotNode__Group_1__1 ;
    public final void rule__DotNode__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1554:1: ( rule__DotNode__Group_1__0__Impl rule__DotNode__Group_1__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1555:2: rule__DotNode__Group_1__0__Impl rule__DotNode__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1__0__Impl_in_rule__DotNode__Group_1__03102);
            rule__DotNode__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1__1_in_rule__DotNode__Group_1__03105);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1562:1: rule__DotNode__Group_1__0__Impl : ( '[' ) ;
    public final void rule__DotNode__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1566:1: ( ( '[' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1567:1: ( '[' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1567:1: ( '[' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1568:1: '['
            {
             before(grammarAccess.getDotNodeAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__DotNode__Group_1__0__Impl3133); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1581:1: rule__DotNode__Group_1__1 : rule__DotNode__Group_1__1__Impl rule__DotNode__Group_1__2 ;
    public final void rule__DotNode__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1585:1: ( rule__DotNode__Group_1__1__Impl rule__DotNode__Group_1__2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1586:2: rule__DotNode__Group_1__1__Impl rule__DotNode__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1__1__Impl_in_rule__DotNode__Group_1__13164);
            rule__DotNode__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1__2_in_rule__DotNode__Group_1__13167);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1593:1: rule__DotNode__Group_1__1__Impl : ( ( rule__DotNode__SettingsAssignment_1_1 ) ) ;
    public final void rule__DotNode__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1597:1: ( ( ( rule__DotNode__SettingsAssignment_1_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1598:1: ( ( rule__DotNode__SettingsAssignment_1_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1598:1: ( ( rule__DotNode__SettingsAssignment_1_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1599:1: ( rule__DotNode__SettingsAssignment_1_1 )
            {
             before(grammarAccess.getDotNodeAccess().getSettingsAssignment_1_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1600:1: ( rule__DotNode__SettingsAssignment_1_1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1600:2: rule__DotNode__SettingsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__SettingsAssignment_1_1_in_rule__DotNode__Group_1__1__Impl3194);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1610:1: rule__DotNode__Group_1__2 : rule__DotNode__Group_1__2__Impl rule__DotNode__Group_1__3 ;
    public final void rule__DotNode__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1614:1: ( rule__DotNode__Group_1__2__Impl rule__DotNode__Group_1__3 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1615:2: rule__DotNode__Group_1__2__Impl rule__DotNode__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1__2__Impl_in_rule__DotNode__Group_1__23224);
            rule__DotNode__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1__3_in_rule__DotNode__Group_1__23227);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1622:1: rule__DotNode__Group_1__2__Impl : ( ( rule__DotNode__Group_1_2__0 )* ) ;
    public final void rule__DotNode__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1626:1: ( ( ( rule__DotNode__Group_1_2__0 )* ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1627:1: ( ( rule__DotNode__Group_1_2__0 )* )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1627:1: ( ( rule__DotNode__Group_1_2__0 )* )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1628:1: ( rule__DotNode__Group_1_2__0 )*
            {
             before(grammarAccess.getDotNodeAccess().getGroup_1_2()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1629:1: ( rule__DotNode__Group_1_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==23) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1629:2: rule__DotNode__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1_2__0_in_rule__DotNode__Group_1__2__Impl3254);
            	    rule__DotNode__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1639:1: rule__DotNode__Group_1__3 : rule__DotNode__Group_1__3__Impl ;
    public final void rule__DotNode__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1643:1: ( rule__DotNode__Group_1__3__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1644:2: rule__DotNode__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1__3__Impl_in_rule__DotNode__Group_1__33285);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1650:1: rule__DotNode__Group_1__3__Impl : ( ']' ) ;
    public final void rule__DotNode__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1654:1: ( ( ']' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1655:1: ( ']' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1655:1: ( ']' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1656:1: ']'
            {
             before(grammarAccess.getDotNodeAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__DotNode__Group_1__3__Impl3313); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1677:1: rule__DotNode__Group_1_2__0 : rule__DotNode__Group_1_2__0__Impl rule__DotNode__Group_1_2__1 ;
    public final void rule__DotNode__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1681:1: ( rule__DotNode__Group_1_2__0__Impl rule__DotNode__Group_1_2__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1682:2: rule__DotNode__Group_1_2__0__Impl rule__DotNode__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1_2__0__Impl_in_rule__DotNode__Group_1_2__03352);
            rule__DotNode__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1_2__1_in_rule__DotNode__Group_1_2__03355);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1689:1: rule__DotNode__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__DotNode__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1693:1: ( ( ',' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1694:1: ( ',' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1694:1: ( ',' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1695:1: ','
            {
             before(grammarAccess.getDotNodeAccess().getCommaKeyword_1_2_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__DotNode__Group_1_2__0__Impl3383); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1708:1: rule__DotNode__Group_1_2__1 : rule__DotNode__Group_1_2__1__Impl ;
    public final void rule__DotNode__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1712:1: ( rule__DotNode__Group_1_2__1__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1713:2: rule__DotNode__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__Group_1_2__1__Impl_in_rule__DotNode__Group_1_2__13414);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1719:1: rule__DotNode__Group_1_2__1__Impl : ( ( rule__DotNode__SettingsAssignment_1_2_1 ) ) ;
    public final void rule__DotNode__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1723:1: ( ( ( rule__DotNode__SettingsAssignment_1_2_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1724:1: ( ( rule__DotNode__SettingsAssignment_1_2_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1724:1: ( ( rule__DotNode__SettingsAssignment_1_2_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1725:1: ( rule__DotNode__SettingsAssignment_1_2_1 )
            {
             before(grammarAccess.getDotNodeAccess().getSettingsAssignment_1_2_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1726:1: ( rule__DotNode__SettingsAssignment_1_2_1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1726:2: rule__DotNode__SettingsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotNode__SettingsAssignment_1_2_1_in_rule__DotNode__Group_1_2__1__Impl3441);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1740:1: rule__DotEdge__Group__0 : rule__DotEdge__Group__0__Impl rule__DotEdge__Group__1 ;
    public final void rule__DotEdge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1744:1: ( rule__DotEdge__Group__0__Impl rule__DotEdge__Group__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1745:2: rule__DotEdge__Group__0__Impl rule__DotEdge__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group__0__Impl_in_rule__DotEdge__Group__03475);
            rule__DotEdge__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group__1_in_rule__DotEdge__Group__03478);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1752:1: rule__DotEdge__Group__0__Impl : ( ( rule__DotEdge__SourceAssignment_0 ) ) ;
    public final void rule__DotEdge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1756:1: ( ( ( rule__DotEdge__SourceAssignment_0 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1757:1: ( ( rule__DotEdge__SourceAssignment_0 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1757:1: ( ( rule__DotEdge__SourceAssignment_0 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1758:1: ( rule__DotEdge__SourceAssignment_0 )
            {
             before(grammarAccess.getDotEdgeAccess().getSourceAssignment_0()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1759:1: ( rule__DotEdge__SourceAssignment_0 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1759:2: rule__DotEdge__SourceAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__SourceAssignment_0_in_rule__DotEdge__Group__0__Impl3505);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1769:1: rule__DotEdge__Group__1 : rule__DotEdge__Group__1__Impl rule__DotEdge__Group__2 ;
    public final void rule__DotEdge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1773:1: ( rule__DotEdge__Group__1__Impl rule__DotEdge__Group__2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1774:2: rule__DotEdge__Group__1__Impl rule__DotEdge__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group__1__Impl_in_rule__DotEdge__Group__13535);
            rule__DotEdge__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group__2_in_rule__DotEdge__Group__13538);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1781:1: rule__DotEdge__Group__1__Impl : ( ( rule__DotEdge__Alternatives_1 ) ) ;
    public final void rule__DotEdge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1785:1: ( ( ( rule__DotEdge__Alternatives_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1786:1: ( ( rule__DotEdge__Alternatives_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1786:1: ( ( rule__DotEdge__Alternatives_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1787:1: ( rule__DotEdge__Alternatives_1 )
            {
             before(grammarAccess.getDotEdgeAccess().getAlternatives_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1788:1: ( rule__DotEdge__Alternatives_1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1788:2: rule__DotEdge__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Alternatives_1_in_rule__DotEdge__Group__1__Impl3565);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1798:1: rule__DotEdge__Group__2 : rule__DotEdge__Group__2__Impl rule__DotEdge__Group__3 ;
    public final void rule__DotEdge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1802:1: ( rule__DotEdge__Group__2__Impl rule__DotEdge__Group__3 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1803:2: rule__DotEdge__Group__2__Impl rule__DotEdge__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group__2__Impl_in_rule__DotEdge__Group__23595);
            rule__DotEdge__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group__3_in_rule__DotEdge__Group__23598);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1810:1: rule__DotEdge__Group__2__Impl : ( ( rule__DotEdge__TargetAssignment_2 ) ) ;
    public final void rule__DotEdge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1814:1: ( ( ( rule__DotEdge__TargetAssignment_2 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1815:1: ( ( rule__DotEdge__TargetAssignment_2 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1815:1: ( ( rule__DotEdge__TargetAssignment_2 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1816:1: ( rule__DotEdge__TargetAssignment_2 )
            {
             before(grammarAccess.getDotEdgeAccess().getTargetAssignment_2()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1817:1: ( rule__DotEdge__TargetAssignment_2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1817:2: rule__DotEdge__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__TargetAssignment_2_in_rule__DotEdge__Group__2__Impl3625);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1827:1: rule__DotEdge__Group__3 : rule__DotEdge__Group__3__Impl rule__DotEdge__Group__4 ;
    public final void rule__DotEdge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1831:1: ( rule__DotEdge__Group__3__Impl rule__DotEdge__Group__4 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1832:2: rule__DotEdge__Group__3__Impl rule__DotEdge__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group__3__Impl_in_rule__DotEdge__Group__33655);
            rule__DotEdge__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group__4_in_rule__DotEdge__Group__33658);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1839:1: rule__DotEdge__Group__3__Impl : ( ( rule__DotEdge__Group_3__0 )? ) ;
    public final void rule__DotEdge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1843:1: ( ( ( rule__DotEdge__Group_3__0 )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1844:1: ( ( rule__DotEdge__Group_3__0 )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1844:1: ( ( rule__DotEdge__Group_3__0 )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1845:1: ( rule__DotEdge__Group_3__0 )?
            {
             before(grammarAccess.getDotEdgeAccess().getGroup_3()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1846:1: ( rule__DotEdge__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1846:2: rule__DotEdge__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3__0_in_rule__DotEdge__Group__3__Impl3685);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1856:1: rule__DotEdge__Group__4 : rule__DotEdge__Group__4__Impl ;
    public final void rule__DotEdge__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1860:1: ( rule__DotEdge__Group__4__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1861:2: rule__DotEdge__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group__4__Impl_in_rule__DotEdge__Group__43716);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1867:1: rule__DotEdge__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__DotEdge__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1871:1: ( ( ( ';' )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1872:1: ( ( ';' )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1872:1: ( ( ';' )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1873:1: ( ';' )?
            {
             before(grammarAccess.getDotEdgeAccess().getSemicolonKeyword_4()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1874:1: ( ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1875:2: ';'
                    {
                    match(input,22,FollowSets000.FOLLOW_22_in_rule__DotEdge__Group__4__Impl3745); 

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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1896:1: rule__DotEdge__Group_3__0 : rule__DotEdge__Group_3__0__Impl rule__DotEdge__Group_3__1 ;
    public final void rule__DotEdge__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1900:1: ( rule__DotEdge__Group_3__0__Impl rule__DotEdge__Group_3__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1901:2: rule__DotEdge__Group_3__0__Impl rule__DotEdge__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3__0__Impl_in_rule__DotEdge__Group_3__03788);
            rule__DotEdge__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3__1_in_rule__DotEdge__Group_3__03791);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1908:1: rule__DotEdge__Group_3__0__Impl : ( '[' ) ;
    public final void rule__DotEdge__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1912:1: ( ( '[' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1913:1: ( '[' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1913:1: ( '[' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1914:1: '['
            {
             before(grammarAccess.getDotEdgeAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__DotEdge__Group_3__0__Impl3819); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1927:1: rule__DotEdge__Group_3__1 : rule__DotEdge__Group_3__1__Impl rule__DotEdge__Group_3__2 ;
    public final void rule__DotEdge__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1931:1: ( rule__DotEdge__Group_3__1__Impl rule__DotEdge__Group_3__2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1932:2: rule__DotEdge__Group_3__1__Impl rule__DotEdge__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3__1__Impl_in_rule__DotEdge__Group_3__13850);
            rule__DotEdge__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3__2_in_rule__DotEdge__Group_3__13853);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1939:1: rule__DotEdge__Group_3__1__Impl : ( ( rule__DotEdge__SettingsAssignment_3_1 ) ) ;
    public final void rule__DotEdge__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1943:1: ( ( ( rule__DotEdge__SettingsAssignment_3_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1944:1: ( ( rule__DotEdge__SettingsAssignment_3_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1944:1: ( ( rule__DotEdge__SettingsAssignment_3_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1945:1: ( rule__DotEdge__SettingsAssignment_3_1 )
            {
             before(grammarAccess.getDotEdgeAccess().getSettingsAssignment_3_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1946:1: ( rule__DotEdge__SettingsAssignment_3_1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1946:2: rule__DotEdge__SettingsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__SettingsAssignment_3_1_in_rule__DotEdge__Group_3__1__Impl3880);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1956:1: rule__DotEdge__Group_3__2 : rule__DotEdge__Group_3__2__Impl rule__DotEdge__Group_3__3 ;
    public final void rule__DotEdge__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1960:1: ( rule__DotEdge__Group_3__2__Impl rule__DotEdge__Group_3__3 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1961:2: rule__DotEdge__Group_3__2__Impl rule__DotEdge__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3__2__Impl_in_rule__DotEdge__Group_3__23910);
            rule__DotEdge__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3__3_in_rule__DotEdge__Group_3__23913);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1968:1: rule__DotEdge__Group_3__2__Impl : ( ( rule__DotEdge__Group_3_2__0 )* ) ;
    public final void rule__DotEdge__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1972:1: ( ( ( rule__DotEdge__Group_3_2__0 )* ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1973:1: ( ( rule__DotEdge__Group_3_2__0 )* )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1973:1: ( ( rule__DotEdge__Group_3_2__0 )* )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1974:1: ( rule__DotEdge__Group_3_2__0 )*
            {
             before(grammarAccess.getDotEdgeAccess().getGroup_3_2()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1975:1: ( rule__DotEdge__Group_3_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==23) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1975:2: rule__DotEdge__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3_2__0_in_rule__DotEdge__Group_3__2__Impl3940);
            	    rule__DotEdge__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1985:1: rule__DotEdge__Group_3__3 : rule__DotEdge__Group_3__3__Impl ;
    public final void rule__DotEdge__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1989:1: ( rule__DotEdge__Group_3__3__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1990:2: rule__DotEdge__Group_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3__3__Impl_in_rule__DotEdge__Group_3__33971);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:1996:1: rule__DotEdge__Group_3__3__Impl : ( ']' ) ;
    public final void rule__DotEdge__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2000:1: ( ( ']' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2001:1: ( ']' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2001:1: ( ']' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2002:1: ']'
            {
             before(grammarAccess.getDotEdgeAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__DotEdge__Group_3__3__Impl3999); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2023:1: rule__DotEdge__Group_3_2__0 : rule__DotEdge__Group_3_2__0__Impl rule__DotEdge__Group_3_2__1 ;
    public final void rule__DotEdge__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2027:1: ( rule__DotEdge__Group_3_2__0__Impl rule__DotEdge__Group_3_2__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2028:2: rule__DotEdge__Group_3_2__0__Impl rule__DotEdge__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3_2__0__Impl_in_rule__DotEdge__Group_3_2__04038);
            rule__DotEdge__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3_2__1_in_rule__DotEdge__Group_3_2__04041);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2035:1: rule__DotEdge__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__DotEdge__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2039:1: ( ( ',' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2040:1: ( ',' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2040:1: ( ',' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2041:1: ','
            {
             before(grammarAccess.getDotEdgeAccess().getCommaKeyword_3_2_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__DotEdge__Group_3_2__0__Impl4069); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2054:1: rule__DotEdge__Group_3_2__1 : rule__DotEdge__Group_3_2__1__Impl ;
    public final void rule__DotEdge__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2058:1: ( rule__DotEdge__Group_3_2__1__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2059:2: rule__DotEdge__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__Group_3_2__1__Impl_in_rule__DotEdge__Group_3_2__14100);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2065:1: rule__DotEdge__Group_3_2__1__Impl : ( ( rule__DotEdge__SettingsAssignment_3_2_1 ) ) ;
    public final void rule__DotEdge__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2069:1: ( ( ( rule__DotEdge__SettingsAssignment_3_2_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2070:1: ( ( rule__DotEdge__SettingsAssignment_3_2_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2070:1: ( ( rule__DotEdge__SettingsAssignment_3_2_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2071:1: ( rule__DotEdge__SettingsAssignment_3_2_1 )
            {
             before(grammarAccess.getDotEdgeAccess().getSettingsAssignment_3_2_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2072:1: ( rule__DotEdge__SettingsAssignment_3_2_1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2072:2: rule__DotEdge__SettingsAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DotEdge__SettingsAssignment_3_2_1_in_rule__DotEdge__Group_3_2__1__Impl4127);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2086:1: rule__Setting__Group__0 : rule__Setting__Group__0__Impl rule__Setting__Group__1 ;
    public final void rule__Setting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2090:1: ( rule__Setting__Group__0__Impl rule__Setting__Group__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2091:2: rule__Setting__Group__0__Impl rule__Setting__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Setting__Group__0__Impl_in_rule__Setting__Group__04161);
            rule__Setting__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Setting__Group__1_in_rule__Setting__Group__04164);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2098:1: rule__Setting__Group__0__Impl : ( ( rule__Setting__AttributeAssignment_0 ) ) ;
    public final void rule__Setting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2102:1: ( ( ( rule__Setting__AttributeAssignment_0 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2103:1: ( ( rule__Setting__AttributeAssignment_0 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2103:1: ( ( rule__Setting__AttributeAssignment_0 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2104:1: ( rule__Setting__AttributeAssignment_0 )
            {
             before(grammarAccess.getSettingAccess().getAttributeAssignment_0()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2105:1: ( rule__Setting__AttributeAssignment_0 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2105:2: rule__Setting__AttributeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Setting__AttributeAssignment_0_in_rule__Setting__Group__0__Impl4191);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2115:1: rule__Setting__Group__1 : rule__Setting__Group__1__Impl rule__Setting__Group__2 ;
    public final void rule__Setting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2119:1: ( rule__Setting__Group__1__Impl rule__Setting__Group__2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2120:2: rule__Setting__Group__1__Impl rule__Setting__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Setting__Group__1__Impl_in_rule__Setting__Group__14221);
            rule__Setting__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Setting__Group__2_in_rule__Setting__Group__14224);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2127:1: rule__Setting__Group__1__Impl : ( '=' ) ;
    public final void rule__Setting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2131:1: ( ( '=' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2132:1: ( '=' )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2132:1: ( '=' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2133:1: '='
            {
             before(grammarAccess.getSettingAccess().getEqualsSignKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Setting__Group__1__Impl4252); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2146:1: rule__Setting__Group__2 : rule__Setting__Group__2__Impl ;
    public final void rule__Setting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2150:1: ( rule__Setting__Group__2__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2151:2: rule__Setting__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Setting__Group__2__Impl_in_rule__Setting__Group__24283);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2157:1: rule__Setting__Group__2__Impl : ( ( rule__Setting__ValueAssignment_2 ) ) ;
    public final void rule__Setting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2161:1: ( ( ( rule__Setting__ValueAssignment_2 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2162:1: ( ( rule__Setting__ValueAssignment_2 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2162:1: ( ( rule__Setting__ValueAssignment_2 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2163:1: ( rule__Setting__ValueAssignment_2 )
            {
             before(grammarAccess.getSettingAccess().getValueAssignment_2()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2164:1: ( rule__Setting__ValueAssignment_2 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2164:2: rule__Setting__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Setting__ValueAssignment_2_in_rule__Setting__Group__2__Impl4310);
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


    // $ANTLR start "rule__Number__Group__0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2180:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2184:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2185:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Number__Group__0__Impl_in_rule__Number__Group__04346);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Number__Group__1_in_rule__Number__Group__04349);
            rule__Number__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2192:1: rule__Number__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2196:1: ( ( ( '-' )? ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2197:1: ( ( '-' )? )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2197:1: ( ( '-' )? )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2198:1: ( '-' )?
            {
             before(grammarAccess.getNumberAccess().getHyphenMinusKeyword_0()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2199:1: ( '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==27) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2200:2: '-'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__Number__Group__0__Impl4378); 

                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2211:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2215:1: ( rule__Number__Group__1__Impl )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2216:2: rule__Number__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Number__Group__1__Impl_in_rule__Number__Group__14411);
            rule__Number__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2222:1: rule__Number__Group__1__Impl : ( ( rule__Number__Alternatives_1 ) ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2226:1: ( ( ( rule__Number__Alternatives_1 ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2227:1: ( ( rule__Number__Alternatives_1 ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2227:1: ( ( rule__Number__Alternatives_1 ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2228:1: ( rule__Number__Alternatives_1 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_1()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2229:1: ( rule__Number__Alternatives_1 )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2229:2: rule__Number__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Number__Alternatives_1_in_rule__Number__Group__1__Impl4438);
            rule__Number__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__DotGraph__DirectedGraphAssignment_1_0_0_0"
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2244:1: rule__DotGraph__DirectedGraphAssignment_1_0_0_0 : ( ( 'digraph' ) ) ;
    public final void rule__DotGraph__DirectedGraphAssignment_1_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2248:1: ( ( ( 'digraph' ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2249:1: ( ( 'digraph' ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2249:1: ( ( 'digraph' ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2250:1: ( 'digraph' )
            {
             before(grammarAccess.getDotGraphAccess().getDirectedGraphDigraphKeyword_1_0_0_0_0()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2251:1: ( 'digraph' )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2252:1: 'digraph'
            {
             before(grammarAccess.getDotGraphAccess().getDirectedGraphDigraphKeyword_1_0_0_0_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__DotGraph__DirectedGraphAssignment_1_0_0_04482); 
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2267:1: rule__DotGraph__IdAssignment_1_0_1 : ( ruleDotID ) ;
    public final void rule__DotGraph__IdAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2271:1: ( ( ruleDotID ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2272:1: ( ruleDotID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2272:1: ( ruleDotID )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2273:1: ruleDotID
            {
             before(grammarAccess.getDotGraphAccess().getIdDotIDParserRuleCall_1_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_rule__DotGraph__IdAssignment_1_0_14521);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2282:1: rule__DotGraph__IdAssignment_1_1_1 : ( ruleDotID ) ;
    public final void rule__DotGraph__IdAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2286:1: ( ( ruleDotID ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2287:1: ( ruleDotID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2287:1: ( ruleDotID )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2288:1: ruleDotID
            {
             before(grammarAccess.getDotGraphAccess().getIdDotIDParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_rule__DotGraph__IdAssignment_1_1_14552);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2297:1: rule__DotGraph__GraphSettingsAssignment_3_0_2 : ( ruleSetting ) ;
    public final void rule__DotGraph__GraphSettingsAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2301:1: ( ( ruleSetting ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2302:1: ( ruleSetting )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2302:1: ( ruleSetting )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2303:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getGraphSettingsSettingParserRuleCall_3_0_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_rule__DotGraph__GraphSettingsAssignment_3_0_24583);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2312:1: rule__DotGraph__GraphSettingsAssignment_3_0_3_1 : ( ruleSetting ) ;
    public final void rule__DotGraph__GraphSettingsAssignment_3_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2316:1: ( ( ruleSetting ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2317:1: ( ruleSetting )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2317:1: ( ruleSetting )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2318:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getGraphSettingsSettingParserRuleCall_3_0_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_rule__DotGraph__GraphSettingsAssignment_3_0_3_14614);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2327:1: rule__DotGraph__NodeSettingsAssignment_3_1_2 : ( ruleSetting ) ;
    public final void rule__DotGraph__NodeSettingsAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2331:1: ( ( ruleSetting ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2332:1: ( ruleSetting )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2332:1: ( ruleSetting )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2333:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getNodeSettingsSettingParserRuleCall_3_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_rule__DotGraph__NodeSettingsAssignment_3_1_24645);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2342:1: rule__DotGraph__NodeSettingsAssignment_3_1_3_1 : ( ruleSetting ) ;
    public final void rule__DotGraph__NodeSettingsAssignment_3_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2346:1: ( ( ruleSetting ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2347:1: ( ruleSetting )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2347:1: ( ruleSetting )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2348:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getNodeSettingsSettingParserRuleCall_3_1_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_rule__DotGraph__NodeSettingsAssignment_3_1_3_14676);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2357:1: rule__DotGraph__EdgeSettingsAssignment_3_2_2 : ( ruleSetting ) ;
    public final void rule__DotGraph__EdgeSettingsAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2361:1: ( ( ruleSetting ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2362:1: ( ruleSetting )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2362:1: ( ruleSetting )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2363:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getEdgeSettingsSettingParserRuleCall_3_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_rule__DotGraph__EdgeSettingsAssignment_3_2_24707);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2372:1: rule__DotGraph__EdgeSettingsAssignment_3_2_3_1 : ( ruleSetting ) ;
    public final void rule__DotGraph__EdgeSettingsAssignment_3_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2376:1: ( ( ruleSetting ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2377:1: ( ruleSetting )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2377:1: ( ruleSetting )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2378:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getEdgeSettingsSettingParserRuleCall_3_2_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_rule__DotGraph__EdgeSettingsAssignment_3_2_3_14738);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2387:1: rule__DotGraph__SubgraphsAssignment_3_3 : ( ruleDotGraph ) ;
    public final void rule__DotGraph__SubgraphsAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2391:1: ( ( ruleDotGraph ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2392:1: ( ruleDotGraph )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2392:1: ( ruleDotGraph )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2393:1: ruleDotGraph
            {
             before(grammarAccess.getDotGraphAccess().getSubgraphsDotGraphParserRuleCall_3_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotGraph_in_rule__DotGraph__SubgraphsAssignment_3_34769);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2402:1: rule__DotGraph__NodesAssignment_3_4 : ( ruleDotNode ) ;
    public final void rule__DotGraph__NodesAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2406:1: ( ( ruleDotNode ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2407:1: ( ruleDotNode )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2407:1: ( ruleDotNode )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2408:1: ruleDotNode
            {
             before(grammarAccess.getDotGraphAccess().getNodesDotNodeParserRuleCall_3_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotNode_in_rule__DotGraph__NodesAssignment_3_44800);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2417:1: rule__DotGraph__EdgesAssignment_3_5 : ( ruleDotEdge ) ;
    public final void rule__DotGraph__EdgesAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2421:1: ( ( ruleDotEdge ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2422:1: ( ruleDotEdge )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2422:1: ( ruleDotEdge )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2423:1: ruleDotEdge
            {
             before(grammarAccess.getDotGraphAccess().getEdgesDotEdgeParserRuleCall_3_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotEdge_in_rule__DotGraph__EdgesAssignment_3_54831);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2432:1: rule__DotNode__NameAssignment_0 : ( ruleDotID ) ;
    public final void rule__DotNode__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2436:1: ( ( ruleDotID ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2437:1: ( ruleDotID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2437:1: ( ruleDotID )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2438:1: ruleDotID
            {
             before(grammarAccess.getDotNodeAccess().getNameDotIDParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_rule__DotNode__NameAssignment_04862);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2447:1: rule__DotNode__SettingsAssignment_1_1 : ( ruleSetting ) ;
    public final void rule__DotNode__SettingsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2451:1: ( ( ruleSetting ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2452:1: ( ruleSetting )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2452:1: ( ruleSetting )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2453:1: ruleSetting
            {
             before(grammarAccess.getDotNodeAccess().getSettingsSettingParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_rule__DotNode__SettingsAssignment_1_14893);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2462:1: rule__DotNode__SettingsAssignment_1_2_1 : ( ruleSetting ) ;
    public final void rule__DotNode__SettingsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2466:1: ( ( ruleSetting ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2467:1: ( ruleSetting )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2467:1: ( ruleSetting )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2468:1: ruleSetting
            {
             before(grammarAccess.getDotNodeAccess().getSettingsSettingParserRuleCall_1_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_rule__DotNode__SettingsAssignment_1_2_14924);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2477:1: rule__DotEdge__SourceAssignment_0 : ( ( ruleDotID ) ) ;
    public final void rule__DotEdge__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2481:1: ( ( ( ruleDotID ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2482:1: ( ( ruleDotID ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2482:1: ( ( ruleDotID ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2483:1: ( ruleDotID )
            {
             before(grammarAccess.getDotEdgeAccess().getSourceDotNodeCrossReference_0_0()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2484:1: ( ruleDotID )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2485:1: ruleDotID
            {
             before(grammarAccess.getDotEdgeAccess().getSourceDotNodeDotIDParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_rule__DotEdge__SourceAssignment_04959);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2496:1: rule__DotEdge__TargetAssignment_2 : ( ( ruleDotID ) ) ;
    public final void rule__DotEdge__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2500:1: ( ( ( ruleDotID ) ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2501:1: ( ( ruleDotID ) )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2501:1: ( ( ruleDotID ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2502:1: ( ruleDotID )
            {
             before(grammarAccess.getDotEdgeAccess().getTargetDotNodeCrossReference_2_0()); 
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2503:1: ( ruleDotID )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2504:1: ruleDotID
            {
             before(grammarAccess.getDotEdgeAccess().getTargetDotNodeDotIDParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_rule__DotEdge__TargetAssignment_24998);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2515:1: rule__DotEdge__SettingsAssignment_3_1 : ( ruleSetting ) ;
    public final void rule__DotEdge__SettingsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2519:1: ( ( ruleSetting ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2520:1: ( ruleSetting )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2520:1: ( ruleSetting )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2521:1: ruleSetting
            {
             before(grammarAccess.getDotEdgeAccess().getSettingsSettingParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_rule__DotEdge__SettingsAssignment_3_15033);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2530:1: rule__DotEdge__SettingsAssignment_3_2_1 : ( ruleSetting ) ;
    public final void rule__DotEdge__SettingsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2534:1: ( ( ruleSetting ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2535:1: ( ruleSetting )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2535:1: ( ruleSetting )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2536:1: ruleSetting
            {
             before(grammarAccess.getDotEdgeAccess().getSettingsSettingParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleSetting_in_rule__DotEdge__SettingsAssignment_3_2_15064);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2545:1: rule__Setting__AttributeAssignment_0 : ( ruleDotID ) ;
    public final void rule__Setting__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2549:1: ( ( ruleDotID ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2550:1: ( ruleDotID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2550:1: ( ruleDotID )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2551:1: ruleDotID
            {
             before(grammarAccess.getSettingAccess().getAttributeDotIDParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_rule__Setting__AttributeAssignment_05095);
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
    // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2560:1: rule__Setting__ValueAssignment_2 : ( ruleDotID ) ;
    public final void rule__Setting__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2564:1: ( ( ruleDotID ) )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2565:1: ( ruleDotID )
            {
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2565:1: ( ruleDotID )
            // ../de.uni_paderborn.fujaba.graphviz.dot.xtext.ui/src-gen/de/uni_paderborn/fujaba/graphviz/dot/xtext/ui/contentassist/antlr/internal/InternalDotLanguage.g:2566:1: ruleDotID
            {
             before(grammarAccess.getSettingAccess().getValueDotIDParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDotID_in_rule__Setting__ValueAssignment_25126);
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
        "\16\uffff";
    static final String DFA3_eofS =
        "\16\uffff";
    static final String DFA3_minS =
        "\2\4\3\uffff\2\4\1\7\3\4\3\uffff";
    static final String DFA3_maxS =
        "\1\34\1\33\3\uffff\2\34\1\10\3\34\3\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\3\1\4\6\uffff\1\1\1\5\1\6";
    static final String DFA3_specialS =
        "\16\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\5\1\6\1\12\1\10\1\11\5\uffff\1\1\4\uffff\1\4\4\uffff\1\2"+
            "\1\3\1\uffff\1\7\1\4",
            "\5\4\10\uffff\1\4\2\uffff\1\13\6\uffff\1\4",
            "",
            "",
            "",
            "\5\14\5\uffff\1\14\2\15\1\uffff\3\14\1\uffff\1\14\1\uffff\2"+
            "\14\1\uffff\2\14",
            "\5\14\5\uffff\1\14\2\15\1\uffff\3\14\1\uffff\1\14\1\uffff\2"+
            "\14\1\uffff\2\14",
            "\1\10\1\11",
            "\5\14\5\uffff\1\14\2\15\1\uffff\3\14\1\uffff\1\14\1\uffff\2"+
            "\14\1\uffff\2\14",
            "\5\14\5\uffff\1\14\2\15\1\uffff\3\14\1\uffff\1\14\1\uffff\2"+
            "\14\1\uffff\2\14",
            "\5\14\5\uffff\1\14\2\15\1\uffff\3\14\1\uffff\1\14\1\uffff\2"+
            "\14\1\uffff\2\14",
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
            return "274:1: rule__DotGraph__Alternatives_3 : ( ( ( rule__DotGraph__Group_3_0__0 ) ) | ( ( rule__DotGraph__Group_3_1__0 ) ) | ( ( rule__DotGraph__Group_3_2__0 ) ) | ( ( rule__DotGraph__SubgraphsAssignment_3_3 ) ) | ( ( rule__DotGraph__NodesAssignment_3_4 ) ) | ( ( rule__DotGraph__EdgesAssignment_3_5 ) ) );";
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
        public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNumber368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Number__Group__0_in_ruleNumber394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_1_0__0_in_rule__DotGraph__Alternatives_1430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_1_1__0_in_rule__DotGraph__Alternatives_1448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__DirectedGraphAssignment_1_0_0_0_in_rule__DotGraph__Alternatives_1_0_0481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__DotGraph__Alternatives_1_0_0500 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__0_in_rule__DotGraph__Alternatives_3534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__0_in_rule__DotGraph__Alternatives_3552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__0_in_rule__DotGraph__Alternatives_3570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__SubgraphsAssignment_3_3_in_rule__DotGraph__Alternatives_3588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__NodesAssignment_3_4_in_rule__DotGraph__Alternatives_3606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__EdgesAssignment_3_5_in_rule__DotGraph__Alternatives_3624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__DotEdge__Alternatives_1658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__DotEdge__Alternatives_1678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DOTSTRINGTERM_in_rule__DotID__Alternatives712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_NUMPREFIXEDID_in_rule__DotID__Alternatives729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNumber_in_rule__DotID__Alternatives746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__DotID__Alternatives763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DOUBLE_in_rule__Number__Alternatives_1795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Number__Alternatives_1812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group__0__Impl_in_rule__DotGraph__Group__0842 = new BitSet(new long[]{0x0000000010084000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group__1_in_rule__DotGraph__Group__0845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group__1__Impl_in_rule__DotGraph__Group__1903 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group__2_in_rule__DotGraph__Group__1906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Alternatives_1_in_rule__DotGraph__Group__1__Impl933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group__2__Impl_in_rule__DotGraph__Group__2963 = new BitSet(new long[]{0x000000001B0C41F0L});
        public static final BitSet FOLLOW_rule__DotGraph__Group__3_in_rule__DotGraph__Group__2966 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__DotGraph__Group__2__Impl994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group__3__Impl_in_rule__DotGraph__Group__31025 = new BitSet(new long[]{0x000000001B0C41F0L});
        public static final BitSet FOLLOW_rule__DotGraph__Group__4_in_rule__DotGraph__Group__31028 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Alternatives_3_in_rule__DotGraph__Group__3__Impl1055 = new BitSet(new long[]{0x000000001B0841F2L});
        public static final BitSet FOLLOW_rule__DotGraph__Group__4__Impl_in_rule__DotGraph__Group__41086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__DotGraph__Group__4__Impl1114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_1_0__0__Impl_in_rule__DotGraph__Group_1_0__01155 = new BitSet(new long[]{0x00000000080001F0L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_1_0__1_in_rule__DotGraph__Group_1_0__01158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Alternatives_1_0_0_in_rule__DotGraph__Group_1_0__0__Impl1185 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_1_0__1__Impl_in_rule__DotGraph__Group_1_0__11215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__IdAssignment_1_0_1_in_rule__DotGraph__Group_1_0__1__Impl1242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_1_1__0__Impl_in_rule__DotGraph__Group_1_1__01277 = new BitSet(new long[]{0x00000000080001F0L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_1_1__1_in_rule__DotGraph__Group_1_1__01280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__DotGraph__Group_1_1__0__Impl1308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_1_1__1__Impl_in_rule__DotGraph__Group_1_1__11339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__IdAssignment_1_1_1_in_rule__DotGraph__Group_1_1__1__Impl1366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__0__Impl_in_rule__DotGraph__Group_3_0__01401 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__1_in_rule__DotGraph__Group_3_0__01404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__DotGraph__Group_3_0__0__Impl1432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__1__Impl_in_rule__DotGraph__Group_3_0__11463 = new BitSet(new long[]{0x00000000080001F0L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__2_in_rule__DotGraph__Group_3_0__11466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__DotGraph__Group_3_0__1__Impl1494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__2__Impl_in_rule__DotGraph__Group_3_0__21525 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__3_in_rule__DotGraph__Group_3_0__21528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__GraphSettingsAssignment_3_0_2_in_rule__DotGraph__Group_3_0__2__Impl1555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__3__Impl_in_rule__DotGraph__Group_3_0__31585 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__4_in_rule__DotGraph__Group_3_0__31588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0_3__0_in_rule__DotGraph__Group_3_0__3__Impl1615 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__4__Impl_in_rule__DotGraph__Group_3_0__41646 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__5_in_rule__DotGraph__Group_3_0__41649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__DotGraph__Group_3_0__4__Impl1677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0__5__Impl_in_rule__DotGraph__Group_3_0__51708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__DotGraph__Group_3_0__5__Impl1737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0_3__0__Impl_in_rule__DotGraph__Group_3_0_3__01782 = new BitSet(new long[]{0x00000000080001F0L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0_3__1_in_rule__DotGraph__Group_3_0_3__01785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__DotGraph__Group_3_0_3__0__Impl1813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_0_3__1__Impl_in_rule__DotGraph__Group_3_0_3__11844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__GraphSettingsAssignment_3_0_3_1_in_rule__DotGraph__Group_3_0_3__1__Impl1871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__0__Impl_in_rule__DotGraph__Group_3_1__01905 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__1_in_rule__DotGraph__Group_3_1__01908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__DotGraph__Group_3_1__0__Impl1936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__1__Impl_in_rule__DotGraph__Group_3_1__11967 = new BitSet(new long[]{0x00000000080001F0L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__2_in_rule__DotGraph__Group_3_1__11970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__DotGraph__Group_3_1__1__Impl1998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__2__Impl_in_rule__DotGraph__Group_3_1__22029 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__3_in_rule__DotGraph__Group_3_1__22032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__NodeSettingsAssignment_3_1_2_in_rule__DotGraph__Group_3_1__2__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__3__Impl_in_rule__DotGraph__Group_3_1__32089 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__4_in_rule__DotGraph__Group_3_1__32092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1_3__0_in_rule__DotGraph__Group_3_1__3__Impl2119 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__4__Impl_in_rule__DotGraph__Group_3_1__42150 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__5_in_rule__DotGraph__Group_3_1__42153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__DotGraph__Group_3_1__4__Impl2181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1__5__Impl_in_rule__DotGraph__Group_3_1__52212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__DotGraph__Group_3_1__5__Impl2241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1_3__0__Impl_in_rule__DotGraph__Group_3_1_3__02286 = new BitSet(new long[]{0x00000000080001F0L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1_3__1_in_rule__DotGraph__Group_3_1_3__02289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__DotGraph__Group_3_1_3__0__Impl2317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_1_3__1__Impl_in_rule__DotGraph__Group_3_1_3__12348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__NodeSettingsAssignment_3_1_3_1_in_rule__DotGraph__Group_3_1_3__1__Impl2375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__0__Impl_in_rule__DotGraph__Group_3_2__02409 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__1_in_rule__DotGraph__Group_3_2__02412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__DotGraph__Group_3_2__0__Impl2440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__1__Impl_in_rule__DotGraph__Group_3_2__12471 = new BitSet(new long[]{0x00000000080001F0L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__2_in_rule__DotGraph__Group_3_2__12474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__DotGraph__Group_3_2__1__Impl2502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__2__Impl_in_rule__DotGraph__Group_3_2__22533 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__3_in_rule__DotGraph__Group_3_2__22536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__EdgeSettingsAssignment_3_2_2_in_rule__DotGraph__Group_3_2__2__Impl2563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__3__Impl_in_rule__DotGraph__Group_3_2__32593 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__4_in_rule__DotGraph__Group_3_2__32596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2_3__0_in_rule__DotGraph__Group_3_2__3__Impl2623 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__4__Impl_in_rule__DotGraph__Group_3_2__42654 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__5_in_rule__DotGraph__Group_3_2__42657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__DotGraph__Group_3_2__4__Impl2685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2__5__Impl_in_rule__DotGraph__Group_3_2__52716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__DotGraph__Group_3_2__5__Impl2745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2_3__0__Impl_in_rule__DotGraph__Group_3_2_3__02790 = new BitSet(new long[]{0x00000000080001F0L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2_3__1_in_rule__DotGraph__Group_3_2_3__02793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__DotGraph__Group_3_2_3__0__Impl2821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__Group_3_2_3__1__Impl_in_rule__DotGraph__Group_3_2_3__12852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotGraph__EdgeSettingsAssignment_3_2_3_1_in_rule__DotGraph__Group_3_2_3__1__Impl2879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__Group__0__Impl_in_rule__DotNode__Group__02913 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__DotNode__Group__1_in_rule__DotNode__Group__02916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__NameAssignment_0_in_rule__DotNode__Group__0__Impl2943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__Group__1__Impl_in_rule__DotNode__Group__12973 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__DotNode__Group__2_in_rule__DotNode__Group__12976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1__0_in_rule__DotNode__Group__1__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__Group__2__Impl_in_rule__DotNode__Group__23034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__DotNode__Group__2__Impl3063 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1__0__Impl_in_rule__DotNode__Group_1__03102 = new BitSet(new long[]{0x00000000080001F0L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1__1_in_rule__DotNode__Group_1__03105 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__DotNode__Group_1__0__Impl3133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1__1__Impl_in_rule__DotNode__Group_1__13164 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1__2_in_rule__DotNode__Group_1__13167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__SettingsAssignment_1_1_in_rule__DotNode__Group_1__1__Impl3194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1__2__Impl_in_rule__DotNode__Group_1__23224 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1__3_in_rule__DotNode__Group_1__23227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1_2__0_in_rule__DotNode__Group_1__2__Impl3254 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1__3__Impl_in_rule__DotNode__Group_1__33285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__DotNode__Group_1__3__Impl3313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1_2__0__Impl_in_rule__DotNode__Group_1_2__03352 = new BitSet(new long[]{0x00000000080001F0L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1_2__1_in_rule__DotNode__Group_1_2__03355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__DotNode__Group_1_2__0__Impl3383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__Group_1_2__1__Impl_in_rule__DotNode__Group_1_2__13414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotNode__SettingsAssignment_1_2_1_in_rule__DotNode__Group_1_2__1__Impl3441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group__0__Impl_in_rule__DotEdge__Group__03475 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__DotEdge__Group__1_in_rule__DotEdge__Group__03478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__SourceAssignment_0_in_rule__DotEdge__Group__0__Impl3505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group__1__Impl_in_rule__DotEdge__Group__13535 = new BitSet(new long[]{0x00000000080001F0L});
        public static final BitSet FOLLOW_rule__DotEdge__Group__2_in_rule__DotEdge__Group__13538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Alternatives_1_in_rule__DotEdge__Group__1__Impl3565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group__2__Impl_in_rule__DotEdge__Group__23595 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__DotEdge__Group__3_in_rule__DotEdge__Group__23598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__TargetAssignment_2_in_rule__DotEdge__Group__2__Impl3625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group__3__Impl_in_rule__DotEdge__Group__33655 = new BitSet(new long[]{0x0000000000500000L});
        public static final BitSet FOLLOW_rule__DotEdge__Group__4_in_rule__DotEdge__Group__33658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3__0_in_rule__DotEdge__Group__3__Impl3685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group__4__Impl_in_rule__DotEdge__Group__43716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__DotEdge__Group__4__Impl3745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3__0__Impl_in_rule__DotEdge__Group_3__03788 = new BitSet(new long[]{0x00000000080001F0L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3__1_in_rule__DotEdge__Group_3__03791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__DotEdge__Group_3__0__Impl3819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3__1__Impl_in_rule__DotEdge__Group_3__13850 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3__2_in_rule__DotEdge__Group_3__13853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__SettingsAssignment_3_1_in_rule__DotEdge__Group_3__1__Impl3880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3__2__Impl_in_rule__DotEdge__Group_3__23910 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3__3_in_rule__DotEdge__Group_3__23913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3_2__0_in_rule__DotEdge__Group_3__2__Impl3940 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3__3__Impl_in_rule__DotEdge__Group_3__33971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__DotEdge__Group_3__3__Impl3999 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3_2__0__Impl_in_rule__DotEdge__Group_3_2__04038 = new BitSet(new long[]{0x00000000080001F0L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3_2__1_in_rule__DotEdge__Group_3_2__04041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__DotEdge__Group_3_2__0__Impl4069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__Group_3_2__1__Impl_in_rule__DotEdge__Group_3_2__14100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DotEdge__SettingsAssignment_3_2_1_in_rule__DotEdge__Group_3_2__1__Impl4127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Setting__Group__0__Impl_in_rule__Setting__Group__04161 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__Setting__Group__1_in_rule__Setting__Group__04164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Setting__AttributeAssignment_0_in_rule__Setting__Group__0__Impl4191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Setting__Group__1__Impl_in_rule__Setting__Group__14221 = new BitSet(new long[]{0x00000000080001F0L});
        public static final BitSet FOLLOW_rule__Setting__Group__2_in_rule__Setting__Group__14224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Setting__Group__1__Impl4252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Setting__Group__2__Impl_in_rule__Setting__Group__24283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Setting__ValueAssignment_2_in_rule__Setting__Group__2__Impl4310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Number__Group__0__Impl_in_rule__Number__Group__04346 = new BitSet(new long[]{0x0000000008000180L});
        public static final BitSet FOLLOW_rule__Number__Group__1_in_rule__Number__Group__04349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Number__Group__0__Impl4378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Number__Group__1__Impl_in_rule__Number__Group__14411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Number__Alternatives_1_in_rule__Number__Group__1__Impl4438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__DotGraph__DirectedGraphAssignment_1_0_0_04482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotID_in_rule__DotGraph__IdAssignment_1_0_14521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotID_in_rule__DotGraph__IdAssignment_1_1_14552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_rule__DotGraph__GraphSettingsAssignment_3_0_24583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_rule__DotGraph__GraphSettingsAssignment_3_0_3_14614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_rule__DotGraph__NodeSettingsAssignment_3_1_24645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_rule__DotGraph__NodeSettingsAssignment_3_1_3_14676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_rule__DotGraph__EdgeSettingsAssignment_3_2_24707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_rule__DotGraph__EdgeSettingsAssignment_3_2_3_14738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotGraph_in_rule__DotGraph__SubgraphsAssignment_3_34769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotNode_in_rule__DotGraph__NodesAssignment_3_44800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotEdge_in_rule__DotGraph__EdgesAssignment_3_54831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotID_in_rule__DotNode__NameAssignment_04862 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_rule__DotNode__SettingsAssignment_1_14893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_rule__DotNode__SettingsAssignment_1_2_14924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotID_in_rule__DotEdge__SourceAssignment_04959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotID_in_rule__DotEdge__TargetAssignment_24998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_rule__DotEdge__SettingsAssignment_3_15033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSetting_in_rule__DotEdge__SettingsAssignment_3_2_15064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotID_in_rule__Setting__AttributeAssignment_05095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDotID_in_rule__Setting__ValueAssignment_25126 = new BitSet(new long[]{0x0000000000000002L});
    }


}