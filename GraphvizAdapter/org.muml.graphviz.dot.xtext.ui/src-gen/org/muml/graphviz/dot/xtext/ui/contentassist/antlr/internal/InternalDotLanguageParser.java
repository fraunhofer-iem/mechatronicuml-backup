package org.muml.graphviz.dot.xtext.ui.contentassist.antlr.internal; 

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
import org.muml.graphviz.dot.xtext.services.DotLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDotLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOTSTRINGTERM", "RULE_NUMPREFIXEDID", "RULE_ID", "RULE_DOUBLE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'graph'", "'{'", "'}'", "'['", "']'", "';'", "','", "'node'", "'edge'", "'subgraph'", "'->'", "'--'", "'='", "'-'", "'digraph'"
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
    public String getGrammarFileName() { return "InternalDotLanguage.g"; }


     
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
    // InternalDotLanguage.g:60:1: entryRuleDotGraph : ruleDotGraph EOF ;
    public final void entryRuleDotGraph() throws RecognitionException {
        try {
            // InternalDotLanguage.g:61:1: ( ruleDotGraph EOF )
            // InternalDotLanguage.g:62:1: ruleDotGraph EOF
            {
             before(grammarAccess.getDotGraphRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDotGraph();

            state._fsp--;

             after(grammarAccess.getDotGraphRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDotLanguage.g:69:1: ruleDotGraph : ( ( rule__DotGraph__Group__0 ) ) ;
    public final void ruleDotGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:73:2: ( ( ( rule__DotGraph__Group__0 ) ) )
            // InternalDotLanguage.g:74:1: ( ( rule__DotGraph__Group__0 ) )
            {
            // InternalDotLanguage.g:74:1: ( ( rule__DotGraph__Group__0 ) )
            // InternalDotLanguage.g:75:1: ( rule__DotGraph__Group__0 )
            {
             before(grammarAccess.getDotGraphAccess().getGroup()); 
            // InternalDotLanguage.g:76:1: ( rule__DotGraph__Group__0 )
            // InternalDotLanguage.g:76:2: rule__DotGraph__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "entryRuleDotSubGraph"
    // InternalDotLanguage.g:88:1: entryRuleDotSubGraph : ruleDotSubGraph EOF ;
    public final void entryRuleDotSubGraph() throws RecognitionException {
        try {
            // InternalDotLanguage.g:89:1: ( ruleDotSubGraph EOF )
            // InternalDotLanguage.g:90:1: ruleDotSubGraph EOF
            {
             before(grammarAccess.getDotSubGraphRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDotSubGraph();

            state._fsp--;

             after(grammarAccess.getDotSubGraphRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleDotSubGraph"


    // $ANTLR start "ruleDotSubGraph"
    // InternalDotLanguage.g:97:1: ruleDotSubGraph : ( ( rule__DotSubGraph__Group__0 ) ) ;
    public final void ruleDotSubGraph() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:101:2: ( ( ( rule__DotSubGraph__Group__0 ) ) )
            // InternalDotLanguage.g:102:1: ( ( rule__DotSubGraph__Group__0 ) )
            {
            // InternalDotLanguage.g:102:1: ( ( rule__DotSubGraph__Group__0 ) )
            // InternalDotLanguage.g:103:1: ( rule__DotSubGraph__Group__0 )
            {
             before(grammarAccess.getDotSubGraphAccess().getGroup()); 
            // InternalDotLanguage.g:104:1: ( rule__DotSubGraph__Group__0 )
            // InternalDotLanguage.g:104:2: rule__DotSubGraph__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDotSubGraphAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDotSubGraph"


    // $ANTLR start "entryRuleDotNode"
    // InternalDotLanguage.g:116:1: entryRuleDotNode : ruleDotNode EOF ;
    public final void entryRuleDotNode() throws RecognitionException {
        try {
            // InternalDotLanguage.g:117:1: ( ruleDotNode EOF )
            // InternalDotLanguage.g:118:1: ruleDotNode EOF
            {
             before(grammarAccess.getDotNodeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDotNode();

            state._fsp--;

             after(grammarAccess.getDotNodeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDotLanguage.g:125:1: ruleDotNode : ( ( rule__DotNode__Group__0 ) ) ;
    public final void ruleDotNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:129:2: ( ( ( rule__DotNode__Group__0 ) ) )
            // InternalDotLanguage.g:130:1: ( ( rule__DotNode__Group__0 ) )
            {
            // InternalDotLanguage.g:130:1: ( ( rule__DotNode__Group__0 ) )
            // InternalDotLanguage.g:131:1: ( rule__DotNode__Group__0 )
            {
             before(grammarAccess.getDotNodeAccess().getGroup()); 
            // InternalDotLanguage.g:132:1: ( rule__DotNode__Group__0 )
            // InternalDotLanguage.g:132:2: rule__DotNode__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:144:1: entryRuleDotEdge : ruleDotEdge EOF ;
    public final void entryRuleDotEdge() throws RecognitionException {
        try {
            // InternalDotLanguage.g:145:1: ( ruleDotEdge EOF )
            // InternalDotLanguage.g:146:1: ruleDotEdge EOF
            {
             before(grammarAccess.getDotEdgeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDotEdge();

            state._fsp--;

             after(grammarAccess.getDotEdgeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDotLanguage.g:153:1: ruleDotEdge : ( ( rule__DotEdge__Alternatives ) ) ;
    public final void ruleDotEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:157:2: ( ( ( rule__DotEdge__Alternatives ) ) )
            // InternalDotLanguage.g:158:1: ( ( rule__DotEdge__Alternatives ) )
            {
            // InternalDotLanguage.g:158:1: ( ( rule__DotEdge__Alternatives ) )
            // InternalDotLanguage.g:159:1: ( rule__DotEdge__Alternatives )
            {
             before(grammarAccess.getDotEdgeAccess().getAlternatives()); 
            // InternalDotLanguage.g:160:1: ( rule__DotEdge__Alternatives )
            // InternalDotLanguage.g:160:2: rule__DotEdge__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotEdge__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDotEdgeAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleDirectedDotEdge"
    // InternalDotLanguage.g:172:1: entryRuleDirectedDotEdge : ruleDirectedDotEdge EOF ;
    public final void entryRuleDirectedDotEdge() throws RecognitionException {
        try {
            // InternalDotLanguage.g:173:1: ( ruleDirectedDotEdge EOF )
            // InternalDotLanguage.g:174:1: ruleDirectedDotEdge EOF
            {
             before(grammarAccess.getDirectedDotEdgeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDirectedDotEdge();

            state._fsp--;

             after(grammarAccess.getDirectedDotEdgeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleDirectedDotEdge"


    // $ANTLR start "ruleDirectedDotEdge"
    // InternalDotLanguage.g:181:1: ruleDirectedDotEdge : ( ( rule__DirectedDotEdge__Group__0 ) ) ;
    public final void ruleDirectedDotEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:185:2: ( ( ( rule__DirectedDotEdge__Group__0 ) ) )
            // InternalDotLanguage.g:186:1: ( ( rule__DirectedDotEdge__Group__0 ) )
            {
            // InternalDotLanguage.g:186:1: ( ( rule__DirectedDotEdge__Group__0 ) )
            // InternalDotLanguage.g:187:1: ( rule__DirectedDotEdge__Group__0 )
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getGroup()); 
            // InternalDotLanguage.g:188:1: ( rule__DirectedDotEdge__Group__0 )
            // InternalDotLanguage.g:188:2: rule__DirectedDotEdge__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DirectedDotEdge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirectedDotEdgeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectedDotEdge"


    // $ANTLR start "entryRuleUndirectedDotEdge"
    // InternalDotLanguage.g:200:1: entryRuleUndirectedDotEdge : ruleUndirectedDotEdge EOF ;
    public final void entryRuleUndirectedDotEdge() throws RecognitionException {
        try {
            // InternalDotLanguage.g:201:1: ( ruleUndirectedDotEdge EOF )
            // InternalDotLanguage.g:202:1: ruleUndirectedDotEdge EOF
            {
             before(grammarAccess.getUndirectedDotEdgeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUndirectedDotEdge();

            state._fsp--;

             after(grammarAccess.getUndirectedDotEdgeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleUndirectedDotEdge"


    // $ANTLR start "ruleUndirectedDotEdge"
    // InternalDotLanguage.g:209:1: ruleUndirectedDotEdge : ( ( rule__UndirectedDotEdge__Group__0 ) ) ;
    public final void ruleUndirectedDotEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:213:2: ( ( ( rule__UndirectedDotEdge__Group__0 ) ) )
            // InternalDotLanguage.g:214:1: ( ( rule__UndirectedDotEdge__Group__0 ) )
            {
            // InternalDotLanguage.g:214:1: ( ( rule__UndirectedDotEdge__Group__0 ) )
            // InternalDotLanguage.g:215:1: ( rule__UndirectedDotEdge__Group__0 )
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getGroup()); 
            // InternalDotLanguage.g:216:1: ( rule__UndirectedDotEdge__Group__0 )
            // InternalDotLanguage.g:216:2: rule__UndirectedDotEdge__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UndirectedDotEdge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUndirectedDotEdgeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUndirectedDotEdge"


    // $ANTLR start "entryRuleSetting"
    // InternalDotLanguage.g:228:1: entryRuleSetting : ruleSetting EOF ;
    public final void entryRuleSetting() throws RecognitionException {
        try {
            // InternalDotLanguage.g:229:1: ( ruleSetting EOF )
            // InternalDotLanguage.g:230:1: ruleSetting EOF
            {
             before(grammarAccess.getSettingRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getSettingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDotLanguage.g:237:1: ruleSetting : ( ( rule__Setting__Group__0 ) ) ;
    public final void ruleSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:241:2: ( ( ( rule__Setting__Group__0 ) ) )
            // InternalDotLanguage.g:242:1: ( ( rule__Setting__Group__0 ) )
            {
            // InternalDotLanguage.g:242:1: ( ( rule__Setting__Group__0 ) )
            // InternalDotLanguage.g:243:1: ( rule__Setting__Group__0 )
            {
             before(grammarAccess.getSettingAccess().getGroup()); 
            // InternalDotLanguage.g:244:1: ( rule__Setting__Group__0 )
            // InternalDotLanguage.g:244:2: rule__Setting__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "entryRuleDotGraphID"
    // InternalDotLanguage.g:256:1: entryRuleDotGraphID : ruleDotGraphID EOF ;
    public final void entryRuleDotGraphID() throws RecognitionException {
        try {
            // InternalDotLanguage.g:257:1: ( ruleDotGraphID EOF )
            // InternalDotLanguage.g:258:1: ruleDotGraphID EOF
            {
             before(grammarAccess.getDotGraphIDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDotGraphID();

            state._fsp--;

             after(grammarAccess.getDotGraphIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleDotGraphID"


    // $ANTLR start "ruleDotGraphID"
    // InternalDotLanguage.g:265:1: ruleDotGraphID : ( ruleDotID ) ;
    public final void ruleDotGraphID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:269:2: ( ( ruleDotID ) )
            // InternalDotLanguage.g:270:1: ( ruleDotID )
            {
            // InternalDotLanguage.g:270:1: ( ruleDotID )
            // InternalDotLanguage.g:271:1: ruleDotID
            {
             before(grammarAccess.getDotGraphIDAccess().getDotIDParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDotID();

            state._fsp--;

             after(grammarAccess.getDotGraphIDAccess().getDotIDParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDotGraphID"


    // $ANTLR start "entryRuleDotID"
    // InternalDotLanguage.g:284:1: entryRuleDotID : ruleDotID EOF ;
    public final void entryRuleDotID() throws RecognitionException {
        try {
            // InternalDotLanguage.g:285:1: ( ruleDotID EOF )
            // InternalDotLanguage.g:286:1: ruleDotID EOF
            {
             before(grammarAccess.getDotIDRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDotID();

            state._fsp--;

             after(grammarAccess.getDotIDRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDotLanguage.g:293:1: ruleDotID : ( ( rule__DotID__Alternatives ) ) ;
    public final void ruleDotID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:297:2: ( ( ( rule__DotID__Alternatives ) ) )
            // InternalDotLanguage.g:298:1: ( ( rule__DotID__Alternatives ) )
            {
            // InternalDotLanguage.g:298:1: ( ( rule__DotID__Alternatives ) )
            // InternalDotLanguage.g:299:1: ( rule__DotID__Alternatives )
            {
             before(grammarAccess.getDotIDAccess().getAlternatives()); 
            // InternalDotLanguage.g:300:1: ( rule__DotID__Alternatives )
            // InternalDotLanguage.g:300:2: rule__DotID__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:312:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalDotLanguage.g:313:1: ( ruleNumber EOF )
            // InternalDotLanguage.g:314:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalDotLanguage.g:321:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:325:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalDotLanguage.g:326:1: ( ( rule__Number__Group__0 ) )
            {
            // InternalDotLanguage.g:326:1: ( ( rule__Number__Group__0 ) )
            // InternalDotLanguage.g:327:1: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // InternalDotLanguage.g:328:1: ( rule__Number__Group__0 )
            // InternalDotLanguage.g:328:2: rule__Number__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:340:1: rule__DotGraph__Alternatives_1 : ( ( ( rule__DotGraph__DirectedGraphAssignment_1_0 ) ) | ( 'graph' ) );
    public final void rule__DotGraph__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:344:1: ( ( ( rule__DotGraph__DirectedGraphAssignment_1_0 ) ) | ( 'graph' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==28) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDotLanguage.g:345:1: ( ( rule__DotGraph__DirectedGraphAssignment_1_0 ) )
                    {
                    // InternalDotLanguage.g:345:1: ( ( rule__DotGraph__DirectedGraphAssignment_1_0 ) )
                    // InternalDotLanguage.g:346:1: ( rule__DotGraph__DirectedGraphAssignment_1_0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getDirectedGraphAssignment_1_0()); 
                    // InternalDotLanguage.g:347:1: ( rule__DotGraph__DirectedGraphAssignment_1_0 )
                    // InternalDotLanguage.g:347:2: rule__DotGraph__DirectedGraphAssignment_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotGraph__DirectedGraphAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getDirectedGraphAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:351:6: ( 'graph' )
                    {
                    // InternalDotLanguage.g:351:6: ( 'graph' )
                    // InternalDotLanguage.g:352:1: 'graph'
                    {
                     before(grammarAccess.getDotGraphAccess().getGraphKeyword_1_1()); 
                    match(input,14,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getDotGraphAccess().getGraphKeyword_1_1()); 

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


    // $ANTLR start "rule__DotGraph__Alternatives_4"
    // InternalDotLanguage.g:364:1: rule__DotGraph__Alternatives_4 : ( ( ( rule__DotGraph__Group_4_0__0 ) ) | ( ( rule__DotGraph__Group_4_1__0 ) ) | ( ( rule__DotGraph__Group_4_2__0 ) ) | ( ( rule__DotGraph__SubgraphsAssignment_4_3 ) ) | ( ( rule__DotGraph__NodesAssignment_4_4 ) ) | ( ( rule__DotGraph__EdgesAssignment_4_5 ) ) );
    public final void rule__DotGraph__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:368:1: ( ( ( rule__DotGraph__Group_4_0__0 ) ) | ( ( rule__DotGraph__Group_4_1__0 ) ) | ( ( rule__DotGraph__Group_4_2__0 ) ) | ( ( rule__DotGraph__SubgraphsAssignment_4_3 ) ) | ( ( rule__DotGraph__NodesAssignment_4_4 ) ) | ( ( rule__DotGraph__EdgesAssignment_4_5 ) ) )
            int alt2=6;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalDotLanguage.g:369:1: ( ( rule__DotGraph__Group_4_0__0 ) )
                    {
                    // InternalDotLanguage.g:369:1: ( ( rule__DotGraph__Group_4_0__0 ) )
                    // InternalDotLanguage.g:370:1: ( rule__DotGraph__Group_4_0__0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getGroup_4_0()); 
                    // InternalDotLanguage.g:371:1: ( rule__DotGraph__Group_4_0__0 )
                    // InternalDotLanguage.g:371:2: rule__DotGraph__Group_4_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotGraph__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:375:6: ( ( rule__DotGraph__Group_4_1__0 ) )
                    {
                    // InternalDotLanguage.g:375:6: ( ( rule__DotGraph__Group_4_1__0 ) )
                    // InternalDotLanguage.g:376:1: ( rule__DotGraph__Group_4_1__0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getGroup_4_1()); 
                    // InternalDotLanguage.g:377:1: ( rule__DotGraph__Group_4_1__0 )
                    // InternalDotLanguage.g:377:2: rule__DotGraph__Group_4_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotGraph__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getGroup_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDotLanguage.g:381:6: ( ( rule__DotGraph__Group_4_2__0 ) )
                    {
                    // InternalDotLanguage.g:381:6: ( ( rule__DotGraph__Group_4_2__0 ) )
                    // InternalDotLanguage.g:382:1: ( rule__DotGraph__Group_4_2__0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getGroup_4_2()); 
                    // InternalDotLanguage.g:383:1: ( rule__DotGraph__Group_4_2__0 )
                    // InternalDotLanguage.g:383:2: rule__DotGraph__Group_4_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotGraph__Group_4_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getGroup_4_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDotLanguage.g:387:6: ( ( rule__DotGraph__SubgraphsAssignment_4_3 ) )
                    {
                    // InternalDotLanguage.g:387:6: ( ( rule__DotGraph__SubgraphsAssignment_4_3 ) )
                    // InternalDotLanguage.g:388:1: ( rule__DotGraph__SubgraphsAssignment_4_3 )
                    {
                     before(grammarAccess.getDotGraphAccess().getSubgraphsAssignment_4_3()); 
                    // InternalDotLanguage.g:389:1: ( rule__DotGraph__SubgraphsAssignment_4_3 )
                    // InternalDotLanguage.g:389:2: rule__DotGraph__SubgraphsAssignment_4_3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotGraph__SubgraphsAssignment_4_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getSubgraphsAssignment_4_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDotLanguage.g:393:6: ( ( rule__DotGraph__NodesAssignment_4_4 ) )
                    {
                    // InternalDotLanguage.g:393:6: ( ( rule__DotGraph__NodesAssignment_4_4 ) )
                    // InternalDotLanguage.g:394:1: ( rule__DotGraph__NodesAssignment_4_4 )
                    {
                     before(grammarAccess.getDotGraphAccess().getNodesAssignment_4_4()); 
                    // InternalDotLanguage.g:395:1: ( rule__DotGraph__NodesAssignment_4_4 )
                    // InternalDotLanguage.g:395:2: rule__DotGraph__NodesAssignment_4_4
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotGraph__NodesAssignment_4_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getNodesAssignment_4_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDotLanguage.g:399:6: ( ( rule__DotGraph__EdgesAssignment_4_5 ) )
                    {
                    // InternalDotLanguage.g:399:6: ( ( rule__DotGraph__EdgesAssignment_4_5 ) )
                    // InternalDotLanguage.g:400:1: ( rule__DotGraph__EdgesAssignment_4_5 )
                    {
                     before(grammarAccess.getDotGraphAccess().getEdgesAssignment_4_5()); 
                    // InternalDotLanguage.g:401:1: ( rule__DotGraph__EdgesAssignment_4_5 )
                    // InternalDotLanguage.g:401:2: rule__DotGraph__EdgesAssignment_4_5
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotGraph__EdgesAssignment_4_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getEdgesAssignment_4_5()); 

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
    // $ANTLR end "rule__DotGraph__Alternatives_4"


    // $ANTLR start "rule__DotSubGraph__Alternatives_4"
    // InternalDotLanguage.g:410:1: rule__DotSubGraph__Alternatives_4 : ( ( ( rule__DotSubGraph__Group_4_0__0 ) ) | ( ( rule__DotSubGraph__Group_4_1__0 ) ) | ( ( rule__DotSubGraph__Group_4_2__0 ) ) | ( ( rule__DotSubGraph__SubgraphsAssignment_4_3 ) ) | ( ( rule__DotSubGraph__NodesAssignment_4_4 ) ) | ( ( rule__DotSubGraph__EdgesAssignment_4_5 ) ) );
    public final void rule__DotSubGraph__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:414:1: ( ( ( rule__DotSubGraph__Group_4_0__0 ) ) | ( ( rule__DotSubGraph__Group_4_1__0 ) ) | ( ( rule__DotSubGraph__Group_4_2__0 ) ) | ( ( rule__DotSubGraph__SubgraphsAssignment_4_3 ) ) | ( ( rule__DotSubGraph__NodesAssignment_4_4 ) ) | ( ( rule__DotSubGraph__EdgesAssignment_4_5 ) ) )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalDotLanguage.g:415:1: ( ( rule__DotSubGraph__Group_4_0__0 ) )
                    {
                    // InternalDotLanguage.g:415:1: ( ( rule__DotSubGraph__Group_4_0__0 ) )
                    // InternalDotLanguage.g:416:1: ( rule__DotSubGraph__Group_4_0__0 )
                    {
                     before(grammarAccess.getDotSubGraphAccess().getGroup_4_0()); 
                    // InternalDotLanguage.g:417:1: ( rule__DotSubGraph__Group_4_0__0 )
                    // InternalDotLanguage.g:417:2: rule__DotSubGraph__Group_4_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotSubGraph__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotSubGraphAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:421:6: ( ( rule__DotSubGraph__Group_4_1__0 ) )
                    {
                    // InternalDotLanguage.g:421:6: ( ( rule__DotSubGraph__Group_4_1__0 ) )
                    // InternalDotLanguage.g:422:1: ( rule__DotSubGraph__Group_4_1__0 )
                    {
                     before(grammarAccess.getDotSubGraphAccess().getGroup_4_1()); 
                    // InternalDotLanguage.g:423:1: ( rule__DotSubGraph__Group_4_1__0 )
                    // InternalDotLanguage.g:423:2: rule__DotSubGraph__Group_4_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotSubGraph__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotSubGraphAccess().getGroup_4_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDotLanguage.g:427:6: ( ( rule__DotSubGraph__Group_4_2__0 ) )
                    {
                    // InternalDotLanguage.g:427:6: ( ( rule__DotSubGraph__Group_4_2__0 ) )
                    // InternalDotLanguage.g:428:1: ( rule__DotSubGraph__Group_4_2__0 )
                    {
                     before(grammarAccess.getDotSubGraphAccess().getGroup_4_2()); 
                    // InternalDotLanguage.g:429:1: ( rule__DotSubGraph__Group_4_2__0 )
                    // InternalDotLanguage.g:429:2: rule__DotSubGraph__Group_4_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotSubGraph__Group_4_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotSubGraphAccess().getGroup_4_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDotLanguage.g:433:6: ( ( rule__DotSubGraph__SubgraphsAssignment_4_3 ) )
                    {
                    // InternalDotLanguage.g:433:6: ( ( rule__DotSubGraph__SubgraphsAssignment_4_3 ) )
                    // InternalDotLanguage.g:434:1: ( rule__DotSubGraph__SubgraphsAssignment_4_3 )
                    {
                     before(grammarAccess.getDotSubGraphAccess().getSubgraphsAssignment_4_3()); 
                    // InternalDotLanguage.g:435:1: ( rule__DotSubGraph__SubgraphsAssignment_4_3 )
                    // InternalDotLanguage.g:435:2: rule__DotSubGraph__SubgraphsAssignment_4_3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotSubGraph__SubgraphsAssignment_4_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotSubGraphAccess().getSubgraphsAssignment_4_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDotLanguage.g:439:6: ( ( rule__DotSubGraph__NodesAssignment_4_4 ) )
                    {
                    // InternalDotLanguage.g:439:6: ( ( rule__DotSubGraph__NodesAssignment_4_4 ) )
                    // InternalDotLanguage.g:440:1: ( rule__DotSubGraph__NodesAssignment_4_4 )
                    {
                     before(grammarAccess.getDotSubGraphAccess().getNodesAssignment_4_4()); 
                    // InternalDotLanguage.g:441:1: ( rule__DotSubGraph__NodesAssignment_4_4 )
                    // InternalDotLanguage.g:441:2: rule__DotSubGraph__NodesAssignment_4_4
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotSubGraph__NodesAssignment_4_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotSubGraphAccess().getNodesAssignment_4_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDotLanguage.g:445:6: ( ( rule__DotSubGraph__EdgesAssignment_4_5 ) )
                    {
                    // InternalDotLanguage.g:445:6: ( ( rule__DotSubGraph__EdgesAssignment_4_5 ) )
                    // InternalDotLanguage.g:446:1: ( rule__DotSubGraph__EdgesAssignment_4_5 )
                    {
                     before(grammarAccess.getDotSubGraphAccess().getEdgesAssignment_4_5()); 
                    // InternalDotLanguage.g:447:1: ( rule__DotSubGraph__EdgesAssignment_4_5 )
                    // InternalDotLanguage.g:447:2: rule__DotSubGraph__EdgesAssignment_4_5
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotSubGraph__EdgesAssignment_4_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotSubGraphAccess().getEdgesAssignment_4_5()); 

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
    // $ANTLR end "rule__DotSubGraph__Alternatives_4"


    // $ANTLR start "rule__DotEdge__Alternatives"
    // InternalDotLanguage.g:456:1: rule__DotEdge__Alternatives : ( ( ruleDirectedDotEdge ) | ( ruleUndirectedDotEdge ) );
    public final void rule__DotEdge__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:460:1: ( ( ruleDirectedDotEdge ) | ( ruleUndirectedDotEdge ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case RULE_DOTSTRINGTERM:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==25) ) {
                    alt4=2;
                }
                else if ( (LA4_1==24) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NUMPREFIXEDID:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==24) ) {
                    alt4=1;
                }
                else if ( (LA4_2==25) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==RULE_DOUBLE) ) {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4==24) ) {
                        alt4=1;
                    }
                    else if ( (LA4_4==25) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_3==RULE_INT) ) {
                    int LA4_5 = input.LA(3);

                    if ( (LA4_5==25) ) {
                        alt4=2;
                    }
                    else if ( (LA4_5==24) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_DOUBLE:
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4==24) ) {
                    alt4=1;
                }
                else if ( (LA4_4==25) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA4_5 = input.LA(2);

                if ( (LA4_5==25) ) {
                    alt4=2;
                }
                else if ( (LA4_5==24) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA4_6 = input.LA(2);

                if ( (LA4_6==24) ) {
                    alt4=1;
                }
                else if ( (LA4_6==25) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDotLanguage.g:461:1: ( ruleDirectedDotEdge )
                    {
                    // InternalDotLanguage.g:461:1: ( ruleDirectedDotEdge )
                    // InternalDotLanguage.g:462:1: ruleDirectedDotEdge
                    {
                     before(grammarAccess.getDotEdgeAccess().getDirectedDotEdgeParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDirectedDotEdge();

                    state._fsp--;

                     after(grammarAccess.getDotEdgeAccess().getDirectedDotEdgeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:467:6: ( ruleUndirectedDotEdge )
                    {
                    // InternalDotLanguage.g:467:6: ( ruleUndirectedDotEdge )
                    // InternalDotLanguage.g:468:1: ruleUndirectedDotEdge
                    {
                     before(grammarAccess.getDotEdgeAccess().getUndirectedDotEdgeParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleUndirectedDotEdge();

                    state._fsp--;

                     after(grammarAccess.getDotEdgeAccess().getUndirectedDotEdgeParserRuleCall_1()); 

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
    // $ANTLR end "rule__DotEdge__Alternatives"


    // $ANTLR start "rule__DotID__Alternatives"
    // InternalDotLanguage.g:478:1: rule__DotID__Alternatives : ( ( RULE_DOTSTRINGTERM ) | ( RULE_NUMPREFIXEDID ) | ( ruleNumber ) | ( RULE_ID ) );
    public final void rule__DotID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:482:1: ( ( RULE_DOTSTRINGTERM ) | ( RULE_NUMPREFIXEDID ) | ( ruleNumber ) | ( RULE_ID ) )
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
                    // InternalDotLanguage.g:483:1: ( RULE_DOTSTRINGTERM )
                    {
                    // InternalDotLanguage.g:483:1: ( RULE_DOTSTRINGTERM )
                    // InternalDotLanguage.g:484:1: RULE_DOTSTRINGTERM
                    {
                     before(grammarAccess.getDotIDAccess().getDOTSTRINGTERMTerminalRuleCall_0()); 
                    match(input,RULE_DOTSTRINGTERM,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getDotIDAccess().getDOTSTRINGTERMTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:489:6: ( RULE_NUMPREFIXEDID )
                    {
                    // InternalDotLanguage.g:489:6: ( RULE_NUMPREFIXEDID )
                    // InternalDotLanguage.g:490:1: RULE_NUMPREFIXEDID
                    {
                     before(grammarAccess.getDotIDAccess().getNUMPREFIXEDIDTerminalRuleCall_1()); 
                    match(input,RULE_NUMPREFIXEDID,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getDotIDAccess().getNUMPREFIXEDIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDotLanguage.g:495:6: ( ruleNumber )
                    {
                    // InternalDotLanguage.g:495:6: ( ruleNumber )
                    // InternalDotLanguage.g:496:1: ruleNumber
                    {
                     before(grammarAccess.getDotIDAccess().getNumberParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getDotIDAccess().getNumberParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDotLanguage.g:501:6: ( RULE_ID )
                    {
                    // InternalDotLanguage.g:501:6: ( RULE_ID )
                    // InternalDotLanguage.g:502:1: RULE_ID
                    {
                     before(grammarAccess.getDotIDAccess().getIDTerminalRuleCall_3()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:512:1: rule__Number__Alternatives_1 : ( ( RULE_DOUBLE ) | ( RULE_INT ) );
    public final void rule__Number__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:516:1: ( ( RULE_DOUBLE ) | ( RULE_INT ) )
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
                    // InternalDotLanguage.g:517:1: ( RULE_DOUBLE )
                    {
                    // InternalDotLanguage.g:517:1: ( RULE_DOUBLE )
                    // InternalDotLanguage.g:518:1: RULE_DOUBLE
                    {
                     before(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_1_0()); 
                    match(input,RULE_DOUBLE,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:523:6: ( RULE_INT )
                    {
                    // InternalDotLanguage.g:523:6: ( RULE_INT )
                    // InternalDotLanguage.g:524:1: RULE_INT
                    {
                     before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1()); 
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:536:1: rule__DotGraph__Group__0 : rule__DotGraph__Group__0__Impl rule__DotGraph__Group__1 ;
    public final void rule__DotGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:540:1: ( rule__DotGraph__Group__0__Impl rule__DotGraph__Group__1 )
            // InternalDotLanguage.g:541:2: rule__DotGraph__Group__0__Impl rule__DotGraph__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__DotGraph__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:548:1: rule__DotGraph__Group__0__Impl : ( () ) ;
    public final void rule__DotGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:552:1: ( ( () ) )
            // InternalDotLanguage.g:553:1: ( () )
            {
            // InternalDotLanguage.g:553:1: ( () )
            // InternalDotLanguage.g:554:1: ()
            {
             before(grammarAccess.getDotGraphAccess().getDotGraphAction_0()); 
            // InternalDotLanguage.g:555:1: ()
            // InternalDotLanguage.g:557:1: 
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
    // InternalDotLanguage.g:567:1: rule__DotGraph__Group__1 : rule__DotGraph__Group__1__Impl rule__DotGraph__Group__2 ;
    public final void rule__DotGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:571:1: ( rule__DotGraph__Group__1__Impl rule__DotGraph__Group__2 )
            // InternalDotLanguage.g:572:2: rule__DotGraph__Group__1__Impl rule__DotGraph__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__DotGraph__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:579:1: rule__DotGraph__Group__1__Impl : ( ( rule__DotGraph__Alternatives_1 ) ) ;
    public final void rule__DotGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:583:1: ( ( ( rule__DotGraph__Alternatives_1 ) ) )
            // InternalDotLanguage.g:584:1: ( ( rule__DotGraph__Alternatives_1 ) )
            {
            // InternalDotLanguage.g:584:1: ( ( rule__DotGraph__Alternatives_1 ) )
            // InternalDotLanguage.g:585:1: ( rule__DotGraph__Alternatives_1 )
            {
             before(grammarAccess.getDotGraphAccess().getAlternatives_1()); 
            // InternalDotLanguage.g:586:1: ( rule__DotGraph__Alternatives_1 )
            // InternalDotLanguage.g:586:2: rule__DotGraph__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:596:1: rule__DotGraph__Group__2 : rule__DotGraph__Group__2__Impl rule__DotGraph__Group__3 ;
    public final void rule__DotGraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:600:1: ( rule__DotGraph__Group__2__Impl rule__DotGraph__Group__3 )
            // InternalDotLanguage.g:601:2: rule__DotGraph__Group__2__Impl rule__DotGraph__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__DotGraph__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:608:1: rule__DotGraph__Group__2__Impl : ( ( rule__DotGraph__IdAssignment_2 )? ) ;
    public final void rule__DotGraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:612:1: ( ( ( rule__DotGraph__IdAssignment_2 )? ) )
            // InternalDotLanguage.g:613:1: ( ( rule__DotGraph__IdAssignment_2 )? )
            {
            // InternalDotLanguage.g:613:1: ( ( rule__DotGraph__IdAssignment_2 )? )
            // InternalDotLanguage.g:614:1: ( rule__DotGraph__IdAssignment_2 )?
            {
             before(grammarAccess.getDotGraphAccess().getIdAssignment_2()); 
            // InternalDotLanguage.g:615:1: ( rule__DotGraph__IdAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_DOTSTRINGTERM && LA7_0<=RULE_INT)||LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDotLanguage.g:615:2: rule__DotGraph__IdAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotGraph__IdAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDotGraphAccess().getIdAssignment_2()); 

            }


            }

        }
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
    // InternalDotLanguage.g:625:1: rule__DotGraph__Group__3 : rule__DotGraph__Group__3__Impl rule__DotGraph__Group__4 ;
    public final void rule__DotGraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:629:1: ( rule__DotGraph__Group__3__Impl rule__DotGraph__Group__4 )
            // InternalDotLanguage.g:630:2: rule__DotGraph__Group__3__Impl rule__DotGraph__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__DotGraph__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:637:1: rule__DotGraph__Group__3__Impl : ( '{' ) ;
    public final void rule__DotGraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:641:1: ( ( '{' ) )
            // InternalDotLanguage.g:642:1: ( '{' )
            {
            // InternalDotLanguage.g:642:1: ( '{' )
            // InternalDotLanguage.g:643:1: '{'
            {
             before(grammarAccess.getDotGraphAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotGraphAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalDotLanguage.g:656:1: rule__DotGraph__Group__4 : rule__DotGraph__Group__4__Impl rule__DotGraph__Group__5 ;
    public final void rule__DotGraph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:660:1: ( rule__DotGraph__Group__4__Impl rule__DotGraph__Group__5 )
            // InternalDotLanguage.g:661:2: rule__DotGraph__Group__4__Impl rule__DotGraph__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__DotGraph__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group__5();

            state._fsp--;


            }

        }
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
    // InternalDotLanguage.g:668:1: rule__DotGraph__Group__4__Impl : ( ( rule__DotGraph__Alternatives_4 )* ) ;
    public final void rule__DotGraph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:672:1: ( ( ( rule__DotGraph__Alternatives_4 )* ) )
            // InternalDotLanguage.g:673:1: ( ( rule__DotGraph__Alternatives_4 )* )
            {
            // InternalDotLanguage.g:673:1: ( ( rule__DotGraph__Alternatives_4 )* )
            // InternalDotLanguage.g:674:1: ( rule__DotGraph__Alternatives_4 )*
            {
             before(grammarAccess.getDotGraphAccess().getAlternatives_4()); 
            // InternalDotLanguage.g:675:1: ( rule__DotGraph__Alternatives_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_DOTSTRINGTERM && LA8_0<=RULE_INT)||LA8_0==14||(LA8_0>=21 && LA8_0<=23)||LA8_0==27) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDotLanguage.g:675:2: rule__DotGraph__Alternatives_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__DotGraph__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDotGraphAccess().getAlternatives_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__DotGraph__Group__5"
    // InternalDotLanguage.g:685:1: rule__DotGraph__Group__5 : rule__DotGraph__Group__5__Impl ;
    public final void rule__DotGraph__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:689:1: ( rule__DotGraph__Group__5__Impl )
            // InternalDotLanguage.g:690:2: rule__DotGraph__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__5"


    // $ANTLR start "rule__DotGraph__Group__5__Impl"
    // InternalDotLanguage.g:696:1: rule__DotGraph__Group__5__Impl : ( '}' ) ;
    public final void rule__DotGraph__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:700:1: ( ( '}' ) )
            // InternalDotLanguage.g:701:1: ( '}' )
            {
            // InternalDotLanguage.g:701:1: ( '}' )
            // InternalDotLanguage.g:702:1: '}'
            {
             before(grammarAccess.getDotGraphAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotGraphAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group__5__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_0__0"
    // InternalDotLanguage.g:727:1: rule__DotGraph__Group_4_0__0 : rule__DotGraph__Group_4_0__0__Impl rule__DotGraph__Group_4_0__1 ;
    public final void rule__DotGraph__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:731:1: ( rule__DotGraph__Group_4_0__0__Impl rule__DotGraph__Group_4_0__1 )
            // InternalDotLanguage.g:732:2: rule__DotGraph__Group_4_0__0__Impl rule__DotGraph__Group_4_0__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__DotGraph__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_0__0"


    // $ANTLR start "rule__DotGraph__Group_4_0__0__Impl"
    // InternalDotLanguage.g:739:1: rule__DotGraph__Group_4_0__0__Impl : ( 'graph' ) ;
    public final void rule__DotGraph__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:743:1: ( ( 'graph' ) )
            // InternalDotLanguage.g:744:1: ( 'graph' )
            {
            // InternalDotLanguage.g:744:1: ( 'graph' )
            // InternalDotLanguage.g:745:1: 'graph'
            {
             before(grammarAccess.getDotGraphAccess().getGraphKeyword_4_0_0()); 
            match(input,14,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotGraphAccess().getGraphKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_0__0__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_0__1"
    // InternalDotLanguage.g:758:1: rule__DotGraph__Group_4_0__1 : rule__DotGraph__Group_4_0__1__Impl rule__DotGraph__Group_4_0__2 ;
    public final void rule__DotGraph__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:762:1: ( rule__DotGraph__Group_4_0__1__Impl rule__DotGraph__Group_4_0__2 )
            // InternalDotLanguage.g:763:2: rule__DotGraph__Group_4_0__1__Impl rule__DotGraph__Group_4_0__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DotGraph__Group_4_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_0__1"


    // $ANTLR start "rule__DotGraph__Group_4_0__1__Impl"
    // InternalDotLanguage.g:770:1: rule__DotGraph__Group_4_0__1__Impl : ( '[' ) ;
    public final void rule__DotGraph__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:774:1: ( ( '[' ) )
            // InternalDotLanguage.g:775:1: ( '[' )
            {
            // InternalDotLanguage.g:775:1: ( '[' )
            // InternalDotLanguage.g:776:1: '['
            {
             before(grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_4_0_1()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_0__1__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_0__2"
    // InternalDotLanguage.g:789:1: rule__DotGraph__Group_4_0__2 : rule__DotGraph__Group_4_0__2__Impl rule__DotGraph__Group_4_0__3 ;
    public final void rule__DotGraph__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:793:1: ( rule__DotGraph__Group_4_0__2__Impl rule__DotGraph__Group_4_0__3 )
            // InternalDotLanguage.g:794:2: rule__DotGraph__Group_4_0__2__Impl rule__DotGraph__Group_4_0__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DotGraph__Group_4_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_0__2"


    // $ANTLR start "rule__DotGraph__Group_4_0__2__Impl"
    // InternalDotLanguage.g:801:1: rule__DotGraph__Group_4_0__2__Impl : ( ( rule__DotGraph__GraphSettingsAssignment_4_0_2 ) ) ;
    public final void rule__DotGraph__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:805:1: ( ( ( rule__DotGraph__GraphSettingsAssignment_4_0_2 ) ) )
            // InternalDotLanguage.g:806:1: ( ( rule__DotGraph__GraphSettingsAssignment_4_0_2 ) )
            {
            // InternalDotLanguage.g:806:1: ( ( rule__DotGraph__GraphSettingsAssignment_4_0_2 ) )
            // InternalDotLanguage.g:807:1: ( rule__DotGraph__GraphSettingsAssignment_4_0_2 )
            {
             before(grammarAccess.getDotGraphAccess().getGraphSettingsAssignment_4_0_2()); 
            // InternalDotLanguage.g:808:1: ( rule__DotGraph__GraphSettingsAssignment_4_0_2 )
            // InternalDotLanguage.g:808:2: rule__DotGraph__GraphSettingsAssignment_4_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__GraphSettingsAssignment_4_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDotGraphAccess().getGraphSettingsAssignment_4_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_0__2__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_0__3"
    // InternalDotLanguage.g:818:1: rule__DotGraph__Group_4_0__3 : rule__DotGraph__Group_4_0__3__Impl rule__DotGraph__Group_4_0__4 ;
    public final void rule__DotGraph__Group_4_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:822:1: ( rule__DotGraph__Group_4_0__3__Impl rule__DotGraph__Group_4_0__4 )
            // InternalDotLanguage.g:823:2: rule__DotGraph__Group_4_0__3__Impl rule__DotGraph__Group_4_0__4
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DotGraph__Group_4_0__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_0__3"


    // $ANTLR start "rule__DotGraph__Group_4_0__3__Impl"
    // InternalDotLanguage.g:830:1: rule__DotGraph__Group_4_0__3__Impl : ( ( rule__DotGraph__Group_4_0_3__0 )* ) ;
    public final void rule__DotGraph__Group_4_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:834:1: ( ( ( rule__DotGraph__Group_4_0_3__0 )* ) )
            // InternalDotLanguage.g:835:1: ( ( rule__DotGraph__Group_4_0_3__0 )* )
            {
            // InternalDotLanguage.g:835:1: ( ( rule__DotGraph__Group_4_0_3__0 )* )
            // InternalDotLanguage.g:836:1: ( rule__DotGraph__Group_4_0_3__0 )*
            {
             before(grammarAccess.getDotGraphAccess().getGroup_4_0_3()); 
            // InternalDotLanguage.g:837:1: ( rule__DotGraph__Group_4_0_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDotLanguage.g:837:2: rule__DotGraph__Group_4_0_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__DotGraph__Group_4_0_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDotGraphAccess().getGroup_4_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_0__3__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_0__4"
    // InternalDotLanguage.g:847:1: rule__DotGraph__Group_4_0__4 : rule__DotGraph__Group_4_0__4__Impl rule__DotGraph__Group_4_0__5 ;
    public final void rule__DotGraph__Group_4_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:851:1: ( rule__DotGraph__Group_4_0__4__Impl rule__DotGraph__Group_4_0__5 )
            // InternalDotLanguage.g:852:2: rule__DotGraph__Group_4_0__4__Impl rule__DotGraph__Group_4_0__5
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__DotGraph__Group_4_0__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_0__4"


    // $ANTLR start "rule__DotGraph__Group_4_0__4__Impl"
    // InternalDotLanguage.g:859:1: rule__DotGraph__Group_4_0__4__Impl : ( ']' ) ;
    public final void rule__DotGraph__Group_4_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:863:1: ( ( ']' ) )
            // InternalDotLanguage.g:864:1: ( ']' )
            {
            // InternalDotLanguage.g:864:1: ( ']' )
            // InternalDotLanguage.g:865:1: ']'
            {
             before(grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_4_0_4()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_4_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_0__4__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_0__5"
    // InternalDotLanguage.g:878:1: rule__DotGraph__Group_4_0__5 : rule__DotGraph__Group_4_0__5__Impl ;
    public final void rule__DotGraph__Group_4_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:882:1: ( rule__DotGraph__Group_4_0__5__Impl )
            // InternalDotLanguage.g:883:2: rule__DotGraph__Group_4_0__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_0__5"


    // $ANTLR start "rule__DotGraph__Group_4_0__5__Impl"
    // InternalDotLanguage.g:889:1: rule__DotGraph__Group_4_0__5__Impl : ( ( ';' )? ) ;
    public final void rule__DotGraph__Group_4_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:893:1: ( ( ( ';' )? ) )
            // InternalDotLanguage.g:894:1: ( ( ';' )? )
            {
            // InternalDotLanguage.g:894:1: ( ( ';' )? )
            // InternalDotLanguage.g:895:1: ( ';' )?
            {
             before(grammarAccess.getDotGraphAccess().getSemicolonKeyword_4_0_5()); 
            // InternalDotLanguage.g:896:1: ( ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDotLanguage.g:897:2: ';'
                    {
                    match(input,19,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDotGraphAccess().getSemicolonKeyword_4_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_0__5__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_0_3__0"
    // InternalDotLanguage.g:920:1: rule__DotGraph__Group_4_0_3__0 : rule__DotGraph__Group_4_0_3__0__Impl rule__DotGraph__Group_4_0_3__1 ;
    public final void rule__DotGraph__Group_4_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:924:1: ( rule__DotGraph__Group_4_0_3__0__Impl rule__DotGraph__Group_4_0_3__1 )
            // InternalDotLanguage.g:925:2: rule__DotGraph__Group_4_0_3__0__Impl rule__DotGraph__Group_4_0_3__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DotGraph__Group_4_0_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_0_3__0"


    // $ANTLR start "rule__DotGraph__Group_4_0_3__0__Impl"
    // InternalDotLanguage.g:932:1: rule__DotGraph__Group_4_0_3__0__Impl : ( ',' ) ;
    public final void rule__DotGraph__Group_4_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:936:1: ( ( ',' ) )
            // InternalDotLanguage.g:937:1: ( ',' )
            {
            // InternalDotLanguage.g:937:1: ( ',' )
            // InternalDotLanguage.g:938:1: ','
            {
             before(grammarAccess.getDotGraphAccess().getCommaKeyword_4_0_3_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotGraphAccess().getCommaKeyword_4_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_0_3__0__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_0_3__1"
    // InternalDotLanguage.g:951:1: rule__DotGraph__Group_4_0_3__1 : rule__DotGraph__Group_4_0_3__1__Impl ;
    public final void rule__DotGraph__Group_4_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:955:1: ( rule__DotGraph__Group_4_0_3__1__Impl )
            // InternalDotLanguage.g:956:2: rule__DotGraph__Group_4_0_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_0_3__1"


    // $ANTLR start "rule__DotGraph__Group_4_0_3__1__Impl"
    // InternalDotLanguage.g:962:1: rule__DotGraph__Group_4_0_3__1__Impl : ( ( rule__DotGraph__GraphSettingsAssignment_4_0_3_1 ) ) ;
    public final void rule__DotGraph__Group_4_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:966:1: ( ( ( rule__DotGraph__GraphSettingsAssignment_4_0_3_1 ) ) )
            // InternalDotLanguage.g:967:1: ( ( rule__DotGraph__GraphSettingsAssignment_4_0_3_1 ) )
            {
            // InternalDotLanguage.g:967:1: ( ( rule__DotGraph__GraphSettingsAssignment_4_0_3_1 ) )
            // InternalDotLanguage.g:968:1: ( rule__DotGraph__GraphSettingsAssignment_4_0_3_1 )
            {
             before(grammarAccess.getDotGraphAccess().getGraphSettingsAssignment_4_0_3_1()); 
            // InternalDotLanguage.g:969:1: ( rule__DotGraph__GraphSettingsAssignment_4_0_3_1 )
            // InternalDotLanguage.g:969:2: rule__DotGraph__GraphSettingsAssignment_4_0_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__GraphSettingsAssignment_4_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDotGraphAccess().getGraphSettingsAssignment_4_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_0_3__1__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_1__0"
    // InternalDotLanguage.g:983:1: rule__DotGraph__Group_4_1__0 : rule__DotGraph__Group_4_1__0__Impl rule__DotGraph__Group_4_1__1 ;
    public final void rule__DotGraph__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:987:1: ( rule__DotGraph__Group_4_1__0__Impl rule__DotGraph__Group_4_1__1 )
            // InternalDotLanguage.g:988:2: rule__DotGraph__Group_4_1__0__Impl rule__DotGraph__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__DotGraph__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_1__0"


    // $ANTLR start "rule__DotGraph__Group_4_1__0__Impl"
    // InternalDotLanguage.g:995:1: rule__DotGraph__Group_4_1__0__Impl : ( 'node' ) ;
    public final void rule__DotGraph__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:999:1: ( ( 'node' ) )
            // InternalDotLanguage.g:1000:1: ( 'node' )
            {
            // InternalDotLanguage.g:1000:1: ( 'node' )
            // InternalDotLanguage.g:1001:1: 'node'
            {
             before(grammarAccess.getDotGraphAccess().getNodeKeyword_4_1_0()); 
            match(input,21,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotGraphAccess().getNodeKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_1__0__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_1__1"
    // InternalDotLanguage.g:1014:1: rule__DotGraph__Group_4_1__1 : rule__DotGraph__Group_4_1__1__Impl rule__DotGraph__Group_4_1__2 ;
    public final void rule__DotGraph__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1018:1: ( rule__DotGraph__Group_4_1__1__Impl rule__DotGraph__Group_4_1__2 )
            // InternalDotLanguage.g:1019:2: rule__DotGraph__Group_4_1__1__Impl rule__DotGraph__Group_4_1__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DotGraph__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_1__1"


    // $ANTLR start "rule__DotGraph__Group_4_1__1__Impl"
    // InternalDotLanguage.g:1026:1: rule__DotGraph__Group_4_1__1__Impl : ( '[' ) ;
    public final void rule__DotGraph__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1030:1: ( ( '[' ) )
            // InternalDotLanguage.g:1031:1: ( '[' )
            {
            // InternalDotLanguage.g:1031:1: ( '[' )
            // InternalDotLanguage.g:1032:1: '['
            {
             before(grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_4_1_1()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_1__1__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_1__2"
    // InternalDotLanguage.g:1045:1: rule__DotGraph__Group_4_1__2 : rule__DotGraph__Group_4_1__2__Impl rule__DotGraph__Group_4_1__3 ;
    public final void rule__DotGraph__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1049:1: ( rule__DotGraph__Group_4_1__2__Impl rule__DotGraph__Group_4_1__3 )
            // InternalDotLanguage.g:1050:2: rule__DotGraph__Group_4_1__2__Impl rule__DotGraph__Group_4_1__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DotGraph__Group_4_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_1__2"


    // $ANTLR start "rule__DotGraph__Group_4_1__2__Impl"
    // InternalDotLanguage.g:1057:1: rule__DotGraph__Group_4_1__2__Impl : ( ( rule__DotGraph__NodeSettingsAssignment_4_1_2 ) ) ;
    public final void rule__DotGraph__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1061:1: ( ( ( rule__DotGraph__NodeSettingsAssignment_4_1_2 ) ) )
            // InternalDotLanguage.g:1062:1: ( ( rule__DotGraph__NodeSettingsAssignment_4_1_2 ) )
            {
            // InternalDotLanguage.g:1062:1: ( ( rule__DotGraph__NodeSettingsAssignment_4_1_2 ) )
            // InternalDotLanguage.g:1063:1: ( rule__DotGraph__NodeSettingsAssignment_4_1_2 )
            {
             before(grammarAccess.getDotGraphAccess().getNodeSettingsAssignment_4_1_2()); 
            // InternalDotLanguage.g:1064:1: ( rule__DotGraph__NodeSettingsAssignment_4_1_2 )
            // InternalDotLanguage.g:1064:2: rule__DotGraph__NodeSettingsAssignment_4_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__NodeSettingsAssignment_4_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDotGraphAccess().getNodeSettingsAssignment_4_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_1__2__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_1__3"
    // InternalDotLanguage.g:1074:1: rule__DotGraph__Group_4_1__3 : rule__DotGraph__Group_4_1__3__Impl rule__DotGraph__Group_4_1__4 ;
    public final void rule__DotGraph__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1078:1: ( rule__DotGraph__Group_4_1__3__Impl rule__DotGraph__Group_4_1__4 )
            // InternalDotLanguage.g:1079:2: rule__DotGraph__Group_4_1__3__Impl rule__DotGraph__Group_4_1__4
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DotGraph__Group_4_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_1__3"


    // $ANTLR start "rule__DotGraph__Group_4_1__3__Impl"
    // InternalDotLanguage.g:1086:1: rule__DotGraph__Group_4_1__3__Impl : ( ( rule__DotGraph__Group_4_1_3__0 )* ) ;
    public final void rule__DotGraph__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1090:1: ( ( ( rule__DotGraph__Group_4_1_3__0 )* ) )
            // InternalDotLanguage.g:1091:1: ( ( rule__DotGraph__Group_4_1_3__0 )* )
            {
            // InternalDotLanguage.g:1091:1: ( ( rule__DotGraph__Group_4_1_3__0 )* )
            // InternalDotLanguage.g:1092:1: ( rule__DotGraph__Group_4_1_3__0 )*
            {
             before(grammarAccess.getDotGraphAccess().getGroup_4_1_3()); 
            // InternalDotLanguage.g:1093:1: ( rule__DotGraph__Group_4_1_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDotLanguage.g:1093:2: rule__DotGraph__Group_4_1_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__DotGraph__Group_4_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDotGraphAccess().getGroup_4_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_1__3__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_1__4"
    // InternalDotLanguage.g:1103:1: rule__DotGraph__Group_4_1__4 : rule__DotGraph__Group_4_1__4__Impl rule__DotGraph__Group_4_1__5 ;
    public final void rule__DotGraph__Group_4_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1107:1: ( rule__DotGraph__Group_4_1__4__Impl rule__DotGraph__Group_4_1__5 )
            // InternalDotLanguage.g:1108:2: rule__DotGraph__Group_4_1__4__Impl rule__DotGraph__Group_4_1__5
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__DotGraph__Group_4_1__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_1__4"


    // $ANTLR start "rule__DotGraph__Group_4_1__4__Impl"
    // InternalDotLanguage.g:1115:1: rule__DotGraph__Group_4_1__4__Impl : ( ']' ) ;
    public final void rule__DotGraph__Group_4_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1119:1: ( ( ']' ) )
            // InternalDotLanguage.g:1120:1: ( ']' )
            {
            // InternalDotLanguage.g:1120:1: ( ']' )
            // InternalDotLanguage.g:1121:1: ']'
            {
             before(grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_4_1_4()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_4_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_1__4__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_1__5"
    // InternalDotLanguage.g:1134:1: rule__DotGraph__Group_4_1__5 : rule__DotGraph__Group_4_1__5__Impl ;
    public final void rule__DotGraph__Group_4_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1138:1: ( rule__DotGraph__Group_4_1__5__Impl )
            // InternalDotLanguage.g:1139:2: rule__DotGraph__Group_4_1__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_1__5"


    // $ANTLR start "rule__DotGraph__Group_4_1__5__Impl"
    // InternalDotLanguage.g:1145:1: rule__DotGraph__Group_4_1__5__Impl : ( ( ';' )? ) ;
    public final void rule__DotGraph__Group_4_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1149:1: ( ( ( ';' )? ) )
            // InternalDotLanguage.g:1150:1: ( ( ';' )? )
            {
            // InternalDotLanguage.g:1150:1: ( ( ';' )? )
            // InternalDotLanguage.g:1151:1: ( ';' )?
            {
             before(grammarAccess.getDotGraphAccess().getSemicolonKeyword_4_1_5()); 
            // InternalDotLanguage.g:1152:1: ( ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDotLanguage.g:1153:2: ';'
                    {
                    match(input,19,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDotGraphAccess().getSemicolonKeyword_4_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_1__5__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_1_3__0"
    // InternalDotLanguage.g:1176:1: rule__DotGraph__Group_4_1_3__0 : rule__DotGraph__Group_4_1_3__0__Impl rule__DotGraph__Group_4_1_3__1 ;
    public final void rule__DotGraph__Group_4_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1180:1: ( rule__DotGraph__Group_4_1_3__0__Impl rule__DotGraph__Group_4_1_3__1 )
            // InternalDotLanguage.g:1181:2: rule__DotGraph__Group_4_1_3__0__Impl rule__DotGraph__Group_4_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DotGraph__Group_4_1_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_1_3__0"


    // $ANTLR start "rule__DotGraph__Group_4_1_3__0__Impl"
    // InternalDotLanguage.g:1188:1: rule__DotGraph__Group_4_1_3__0__Impl : ( ',' ) ;
    public final void rule__DotGraph__Group_4_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1192:1: ( ( ',' ) )
            // InternalDotLanguage.g:1193:1: ( ',' )
            {
            // InternalDotLanguage.g:1193:1: ( ',' )
            // InternalDotLanguage.g:1194:1: ','
            {
             before(grammarAccess.getDotGraphAccess().getCommaKeyword_4_1_3_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotGraphAccess().getCommaKeyword_4_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_1_3__0__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_1_3__1"
    // InternalDotLanguage.g:1207:1: rule__DotGraph__Group_4_1_3__1 : rule__DotGraph__Group_4_1_3__1__Impl ;
    public final void rule__DotGraph__Group_4_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1211:1: ( rule__DotGraph__Group_4_1_3__1__Impl )
            // InternalDotLanguage.g:1212:2: rule__DotGraph__Group_4_1_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_1_3__1"


    // $ANTLR start "rule__DotGraph__Group_4_1_3__1__Impl"
    // InternalDotLanguage.g:1218:1: rule__DotGraph__Group_4_1_3__1__Impl : ( ( rule__DotGraph__NodeSettingsAssignment_4_1_3_1 ) ) ;
    public final void rule__DotGraph__Group_4_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1222:1: ( ( ( rule__DotGraph__NodeSettingsAssignment_4_1_3_1 ) ) )
            // InternalDotLanguage.g:1223:1: ( ( rule__DotGraph__NodeSettingsAssignment_4_1_3_1 ) )
            {
            // InternalDotLanguage.g:1223:1: ( ( rule__DotGraph__NodeSettingsAssignment_4_1_3_1 ) )
            // InternalDotLanguage.g:1224:1: ( rule__DotGraph__NodeSettingsAssignment_4_1_3_1 )
            {
             before(grammarAccess.getDotGraphAccess().getNodeSettingsAssignment_4_1_3_1()); 
            // InternalDotLanguage.g:1225:1: ( rule__DotGraph__NodeSettingsAssignment_4_1_3_1 )
            // InternalDotLanguage.g:1225:2: rule__DotGraph__NodeSettingsAssignment_4_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__NodeSettingsAssignment_4_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDotGraphAccess().getNodeSettingsAssignment_4_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_1_3__1__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_2__0"
    // InternalDotLanguage.g:1239:1: rule__DotGraph__Group_4_2__0 : rule__DotGraph__Group_4_2__0__Impl rule__DotGraph__Group_4_2__1 ;
    public final void rule__DotGraph__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1243:1: ( rule__DotGraph__Group_4_2__0__Impl rule__DotGraph__Group_4_2__1 )
            // InternalDotLanguage.g:1244:2: rule__DotGraph__Group_4_2__0__Impl rule__DotGraph__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__DotGraph__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_2__0"


    // $ANTLR start "rule__DotGraph__Group_4_2__0__Impl"
    // InternalDotLanguage.g:1251:1: rule__DotGraph__Group_4_2__0__Impl : ( 'edge' ) ;
    public final void rule__DotGraph__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1255:1: ( ( 'edge' ) )
            // InternalDotLanguage.g:1256:1: ( 'edge' )
            {
            // InternalDotLanguage.g:1256:1: ( 'edge' )
            // InternalDotLanguage.g:1257:1: 'edge'
            {
             before(grammarAccess.getDotGraphAccess().getEdgeKeyword_4_2_0()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotGraphAccess().getEdgeKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_2__0__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_2__1"
    // InternalDotLanguage.g:1270:1: rule__DotGraph__Group_4_2__1 : rule__DotGraph__Group_4_2__1__Impl rule__DotGraph__Group_4_2__2 ;
    public final void rule__DotGraph__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1274:1: ( rule__DotGraph__Group_4_2__1__Impl rule__DotGraph__Group_4_2__2 )
            // InternalDotLanguage.g:1275:2: rule__DotGraph__Group_4_2__1__Impl rule__DotGraph__Group_4_2__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DotGraph__Group_4_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_2__1"


    // $ANTLR start "rule__DotGraph__Group_4_2__1__Impl"
    // InternalDotLanguage.g:1282:1: rule__DotGraph__Group_4_2__1__Impl : ( '[' ) ;
    public final void rule__DotGraph__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1286:1: ( ( '[' ) )
            // InternalDotLanguage.g:1287:1: ( '[' )
            {
            // InternalDotLanguage.g:1287:1: ( '[' )
            // InternalDotLanguage.g:1288:1: '['
            {
             before(grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_4_2_1()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_2__1__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_2__2"
    // InternalDotLanguage.g:1301:1: rule__DotGraph__Group_4_2__2 : rule__DotGraph__Group_4_2__2__Impl rule__DotGraph__Group_4_2__3 ;
    public final void rule__DotGraph__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1305:1: ( rule__DotGraph__Group_4_2__2__Impl rule__DotGraph__Group_4_2__3 )
            // InternalDotLanguage.g:1306:2: rule__DotGraph__Group_4_2__2__Impl rule__DotGraph__Group_4_2__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DotGraph__Group_4_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_2__2"


    // $ANTLR start "rule__DotGraph__Group_4_2__2__Impl"
    // InternalDotLanguage.g:1313:1: rule__DotGraph__Group_4_2__2__Impl : ( ( rule__DotGraph__EdgeSettingsAssignment_4_2_2 ) ) ;
    public final void rule__DotGraph__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1317:1: ( ( ( rule__DotGraph__EdgeSettingsAssignment_4_2_2 ) ) )
            // InternalDotLanguage.g:1318:1: ( ( rule__DotGraph__EdgeSettingsAssignment_4_2_2 ) )
            {
            // InternalDotLanguage.g:1318:1: ( ( rule__DotGraph__EdgeSettingsAssignment_4_2_2 ) )
            // InternalDotLanguage.g:1319:1: ( rule__DotGraph__EdgeSettingsAssignment_4_2_2 )
            {
             before(grammarAccess.getDotGraphAccess().getEdgeSettingsAssignment_4_2_2()); 
            // InternalDotLanguage.g:1320:1: ( rule__DotGraph__EdgeSettingsAssignment_4_2_2 )
            // InternalDotLanguage.g:1320:2: rule__DotGraph__EdgeSettingsAssignment_4_2_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__EdgeSettingsAssignment_4_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDotGraphAccess().getEdgeSettingsAssignment_4_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_2__2__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_2__3"
    // InternalDotLanguage.g:1330:1: rule__DotGraph__Group_4_2__3 : rule__DotGraph__Group_4_2__3__Impl rule__DotGraph__Group_4_2__4 ;
    public final void rule__DotGraph__Group_4_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1334:1: ( rule__DotGraph__Group_4_2__3__Impl rule__DotGraph__Group_4_2__4 )
            // InternalDotLanguage.g:1335:2: rule__DotGraph__Group_4_2__3__Impl rule__DotGraph__Group_4_2__4
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DotGraph__Group_4_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_2__3"


    // $ANTLR start "rule__DotGraph__Group_4_2__3__Impl"
    // InternalDotLanguage.g:1342:1: rule__DotGraph__Group_4_2__3__Impl : ( ( rule__DotGraph__Group_4_2_3__0 )* ) ;
    public final void rule__DotGraph__Group_4_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1346:1: ( ( ( rule__DotGraph__Group_4_2_3__0 )* ) )
            // InternalDotLanguage.g:1347:1: ( ( rule__DotGraph__Group_4_2_3__0 )* )
            {
            // InternalDotLanguage.g:1347:1: ( ( rule__DotGraph__Group_4_2_3__0 )* )
            // InternalDotLanguage.g:1348:1: ( rule__DotGraph__Group_4_2_3__0 )*
            {
             before(grammarAccess.getDotGraphAccess().getGroup_4_2_3()); 
            // InternalDotLanguage.g:1349:1: ( rule__DotGraph__Group_4_2_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDotLanguage.g:1349:2: rule__DotGraph__Group_4_2_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__DotGraph__Group_4_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDotGraphAccess().getGroup_4_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_2__3__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_2__4"
    // InternalDotLanguage.g:1359:1: rule__DotGraph__Group_4_2__4 : rule__DotGraph__Group_4_2__4__Impl rule__DotGraph__Group_4_2__5 ;
    public final void rule__DotGraph__Group_4_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1363:1: ( rule__DotGraph__Group_4_2__4__Impl rule__DotGraph__Group_4_2__5 )
            // InternalDotLanguage.g:1364:2: rule__DotGraph__Group_4_2__4__Impl rule__DotGraph__Group_4_2__5
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__DotGraph__Group_4_2__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_2__4"


    // $ANTLR start "rule__DotGraph__Group_4_2__4__Impl"
    // InternalDotLanguage.g:1371:1: rule__DotGraph__Group_4_2__4__Impl : ( ']' ) ;
    public final void rule__DotGraph__Group_4_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1375:1: ( ( ']' ) )
            // InternalDotLanguage.g:1376:1: ( ']' )
            {
            // InternalDotLanguage.g:1376:1: ( ']' )
            // InternalDotLanguage.g:1377:1: ']'
            {
             before(grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_4_2_4()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_4_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_2__4__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_2__5"
    // InternalDotLanguage.g:1390:1: rule__DotGraph__Group_4_2__5 : rule__DotGraph__Group_4_2__5__Impl ;
    public final void rule__DotGraph__Group_4_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1394:1: ( rule__DotGraph__Group_4_2__5__Impl )
            // InternalDotLanguage.g:1395:2: rule__DotGraph__Group_4_2__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_2__5"


    // $ANTLR start "rule__DotGraph__Group_4_2__5__Impl"
    // InternalDotLanguage.g:1401:1: rule__DotGraph__Group_4_2__5__Impl : ( ( ';' )? ) ;
    public final void rule__DotGraph__Group_4_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1405:1: ( ( ( ';' )? ) )
            // InternalDotLanguage.g:1406:1: ( ( ';' )? )
            {
            // InternalDotLanguage.g:1406:1: ( ( ';' )? )
            // InternalDotLanguage.g:1407:1: ( ';' )?
            {
             before(grammarAccess.getDotGraphAccess().getSemicolonKeyword_4_2_5()); 
            // InternalDotLanguage.g:1408:1: ( ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDotLanguage.g:1409:2: ';'
                    {
                    match(input,19,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDotGraphAccess().getSemicolonKeyword_4_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_2__5__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_2_3__0"
    // InternalDotLanguage.g:1432:1: rule__DotGraph__Group_4_2_3__0 : rule__DotGraph__Group_4_2_3__0__Impl rule__DotGraph__Group_4_2_3__1 ;
    public final void rule__DotGraph__Group_4_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1436:1: ( rule__DotGraph__Group_4_2_3__0__Impl rule__DotGraph__Group_4_2_3__1 )
            // InternalDotLanguage.g:1437:2: rule__DotGraph__Group_4_2_3__0__Impl rule__DotGraph__Group_4_2_3__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DotGraph__Group_4_2_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_2_3__0"


    // $ANTLR start "rule__DotGraph__Group_4_2_3__0__Impl"
    // InternalDotLanguage.g:1444:1: rule__DotGraph__Group_4_2_3__0__Impl : ( ',' ) ;
    public final void rule__DotGraph__Group_4_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1448:1: ( ( ',' ) )
            // InternalDotLanguage.g:1449:1: ( ',' )
            {
            // InternalDotLanguage.g:1449:1: ( ',' )
            // InternalDotLanguage.g:1450:1: ','
            {
             before(grammarAccess.getDotGraphAccess().getCommaKeyword_4_2_3_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotGraphAccess().getCommaKeyword_4_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_2_3__0__Impl"


    // $ANTLR start "rule__DotGraph__Group_4_2_3__1"
    // InternalDotLanguage.g:1463:1: rule__DotGraph__Group_4_2_3__1 : rule__DotGraph__Group_4_2_3__1__Impl ;
    public final void rule__DotGraph__Group_4_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1467:1: ( rule__DotGraph__Group_4_2_3__1__Impl )
            // InternalDotLanguage.g:1468:2: rule__DotGraph__Group_4_2_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__Group_4_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_2_3__1"


    // $ANTLR start "rule__DotGraph__Group_4_2_3__1__Impl"
    // InternalDotLanguage.g:1474:1: rule__DotGraph__Group_4_2_3__1__Impl : ( ( rule__DotGraph__EdgeSettingsAssignment_4_2_3_1 ) ) ;
    public final void rule__DotGraph__Group_4_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1478:1: ( ( ( rule__DotGraph__EdgeSettingsAssignment_4_2_3_1 ) ) )
            // InternalDotLanguage.g:1479:1: ( ( rule__DotGraph__EdgeSettingsAssignment_4_2_3_1 ) )
            {
            // InternalDotLanguage.g:1479:1: ( ( rule__DotGraph__EdgeSettingsAssignment_4_2_3_1 ) )
            // InternalDotLanguage.g:1480:1: ( rule__DotGraph__EdgeSettingsAssignment_4_2_3_1 )
            {
             before(grammarAccess.getDotGraphAccess().getEdgeSettingsAssignment_4_2_3_1()); 
            // InternalDotLanguage.g:1481:1: ( rule__DotGraph__EdgeSettingsAssignment_4_2_3_1 )
            // InternalDotLanguage.g:1481:2: rule__DotGraph__EdgeSettingsAssignment_4_2_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotGraph__EdgeSettingsAssignment_4_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDotGraphAccess().getEdgeSettingsAssignment_4_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__Group_4_2_3__1__Impl"


    // $ANTLR start "rule__DotSubGraph__Group__0"
    // InternalDotLanguage.g:1495:1: rule__DotSubGraph__Group__0 : rule__DotSubGraph__Group__0__Impl rule__DotSubGraph__Group__1 ;
    public final void rule__DotSubGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1499:1: ( rule__DotSubGraph__Group__0__Impl rule__DotSubGraph__Group__1 )
            // InternalDotLanguage.g:1500:2: rule__DotSubGraph__Group__0__Impl rule__DotSubGraph__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__DotSubGraph__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group__0"


    // $ANTLR start "rule__DotSubGraph__Group__0__Impl"
    // InternalDotLanguage.g:1507:1: rule__DotSubGraph__Group__0__Impl : ( () ) ;
    public final void rule__DotSubGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1511:1: ( ( () ) )
            // InternalDotLanguage.g:1512:1: ( () )
            {
            // InternalDotLanguage.g:1512:1: ( () )
            // InternalDotLanguage.g:1513:1: ()
            {
             before(grammarAccess.getDotSubGraphAccess().getDotGraphAction_0()); 
            // InternalDotLanguage.g:1514:1: ()
            // InternalDotLanguage.g:1516:1: 
            {
            }

             after(grammarAccess.getDotSubGraphAccess().getDotGraphAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group__0__Impl"


    // $ANTLR start "rule__DotSubGraph__Group__1"
    // InternalDotLanguage.g:1526:1: rule__DotSubGraph__Group__1 : rule__DotSubGraph__Group__1__Impl rule__DotSubGraph__Group__2 ;
    public final void rule__DotSubGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1530:1: ( rule__DotSubGraph__Group__1__Impl rule__DotSubGraph__Group__2 )
            // InternalDotLanguage.g:1531:2: rule__DotSubGraph__Group__1__Impl rule__DotSubGraph__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__DotSubGraph__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group__1"


    // $ANTLR start "rule__DotSubGraph__Group__1__Impl"
    // InternalDotLanguage.g:1538:1: rule__DotSubGraph__Group__1__Impl : ( 'subgraph' ) ;
    public final void rule__DotSubGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1542:1: ( ( 'subgraph' ) )
            // InternalDotLanguage.g:1543:1: ( 'subgraph' )
            {
            // InternalDotLanguage.g:1543:1: ( 'subgraph' )
            // InternalDotLanguage.g:1544:1: 'subgraph'
            {
             before(grammarAccess.getDotSubGraphAccess().getSubgraphKeyword_1()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotSubGraphAccess().getSubgraphKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group__1__Impl"


    // $ANTLR start "rule__DotSubGraph__Group__2"
    // InternalDotLanguage.g:1557:1: rule__DotSubGraph__Group__2 : rule__DotSubGraph__Group__2__Impl rule__DotSubGraph__Group__3 ;
    public final void rule__DotSubGraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1561:1: ( rule__DotSubGraph__Group__2__Impl rule__DotSubGraph__Group__3 )
            // InternalDotLanguage.g:1562:2: rule__DotSubGraph__Group__2__Impl rule__DotSubGraph__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__DotSubGraph__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group__2"


    // $ANTLR start "rule__DotSubGraph__Group__2__Impl"
    // InternalDotLanguage.g:1569:1: rule__DotSubGraph__Group__2__Impl : ( ( rule__DotSubGraph__IdAssignment_2 )? ) ;
    public final void rule__DotSubGraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1573:1: ( ( ( rule__DotSubGraph__IdAssignment_2 )? ) )
            // InternalDotLanguage.g:1574:1: ( ( rule__DotSubGraph__IdAssignment_2 )? )
            {
            // InternalDotLanguage.g:1574:1: ( ( rule__DotSubGraph__IdAssignment_2 )? )
            // InternalDotLanguage.g:1575:1: ( rule__DotSubGraph__IdAssignment_2 )?
            {
             before(grammarAccess.getDotSubGraphAccess().getIdAssignment_2()); 
            // InternalDotLanguage.g:1576:1: ( rule__DotSubGraph__IdAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_DOTSTRINGTERM && LA15_0<=RULE_INT)||LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDotLanguage.g:1576:2: rule__DotSubGraph__IdAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotSubGraph__IdAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDotSubGraphAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group__2__Impl"


    // $ANTLR start "rule__DotSubGraph__Group__3"
    // InternalDotLanguage.g:1586:1: rule__DotSubGraph__Group__3 : rule__DotSubGraph__Group__3__Impl rule__DotSubGraph__Group__4 ;
    public final void rule__DotSubGraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1590:1: ( rule__DotSubGraph__Group__3__Impl rule__DotSubGraph__Group__4 )
            // InternalDotLanguage.g:1591:2: rule__DotSubGraph__Group__3__Impl rule__DotSubGraph__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__DotSubGraph__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group__3"


    // $ANTLR start "rule__DotSubGraph__Group__3__Impl"
    // InternalDotLanguage.g:1598:1: rule__DotSubGraph__Group__3__Impl : ( '{' ) ;
    public final void rule__DotSubGraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1602:1: ( ( '{' ) )
            // InternalDotLanguage.g:1603:1: ( '{' )
            {
            // InternalDotLanguage.g:1603:1: ( '{' )
            // InternalDotLanguage.g:1604:1: '{'
            {
             before(grammarAccess.getDotSubGraphAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotSubGraphAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group__3__Impl"


    // $ANTLR start "rule__DotSubGraph__Group__4"
    // InternalDotLanguage.g:1617:1: rule__DotSubGraph__Group__4 : rule__DotSubGraph__Group__4__Impl rule__DotSubGraph__Group__5 ;
    public final void rule__DotSubGraph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1621:1: ( rule__DotSubGraph__Group__4__Impl rule__DotSubGraph__Group__5 )
            // InternalDotLanguage.g:1622:2: rule__DotSubGraph__Group__4__Impl rule__DotSubGraph__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__DotSubGraph__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group__4"


    // $ANTLR start "rule__DotSubGraph__Group__4__Impl"
    // InternalDotLanguage.g:1629:1: rule__DotSubGraph__Group__4__Impl : ( ( ( rule__DotSubGraph__Alternatives_4 ) ) ( ( rule__DotSubGraph__Alternatives_4 )* ) ) ;
    public final void rule__DotSubGraph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1633:1: ( ( ( ( rule__DotSubGraph__Alternatives_4 ) ) ( ( rule__DotSubGraph__Alternatives_4 )* ) ) )
            // InternalDotLanguage.g:1634:1: ( ( ( rule__DotSubGraph__Alternatives_4 ) ) ( ( rule__DotSubGraph__Alternatives_4 )* ) )
            {
            // InternalDotLanguage.g:1634:1: ( ( ( rule__DotSubGraph__Alternatives_4 ) ) ( ( rule__DotSubGraph__Alternatives_4 )* ) )
            // InternalDotLanguage.g:1635:1: ( ( rule__DotSubGraph__Alternatives_4 ) ) ( ( rule__DotSubGraph__Alternatives_4 )* )
            {
            // InternalDotLanguage.g:1635:1: ( ( rule__DotSubGraph__Alternatives_4 ) )
            // InternalDotLanguage.g:1636:1: ( rule__DotSubGraph__Alternatives_4 )
            {
             before(grammarAccess.getDotSubGraphAccess().getAlternatives_4()); 
            // InternalDotLanguage.g:1637:1: ( rule__DotSubGraph__Alternatives_4 )
            // InternalDotLanguage.g:1637:2: rule__DotSubGraph__Alternatives_4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__DotSubGraph__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getDotSubGraphAccess().getAlternatives_4()); 

            }

            // InternalDotLanguage.g:1640:1: ( ( rule__DotSubGraph__Alternatives_4 )* )
            // InternalDotLanguage.g:1641:1: ( rule__DotSubGraph__Alternatives_4 )*
            {
             before(grammarAccess.getDotSubGraphAccess().getAlternatives_4()); 
            // InternalDotLanguage.g:1642:1: ( rule__DotSubGraph__Alternatives_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_DOTSTRINGTERM && LA16_0<=RULE_INT)||LA16_0==14||(LA16_0>=21 && LA16_0<=23)||LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDotLanguage.g:1642:2: rule__DotSubGraph__Alternatives_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    rule__DotSubGraph__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDotSubGraphAccess().getAlternatives_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group__4__Impl"


    // $ANTLR start "rule__DotSubGraph__Group__5"
    // InternalDotLanguage.g:1653:1: rule__DotSubGraph__Group__5 : rule__DotSubGraph__Group__5__Impl ;
    public final void rule__DotSubGraph__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1657:1: ( rule__DotSubGraph__Group__5__Impl )
            // InternalDotLanguage.g:1658:2: rule__DotSubGraph__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group__5"


    // $ANTLR start "rule__DotSubGraph__Group__5__Impl"
    // InternalDotLanguage.g:1664:1: rule__DotSubGraph__Group__5__Impl : ( '}' ) ;
    public final void rule__DotSubGraph__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1668:1: ( ( '}' ) )
            // InternalDotLanguage.g:1669:1: ( '}' )
            {
            // InternalDotLanguage.g:1669:1: ( '}' )
            // InternalDotLanguage.g:1670:1: '}'
            {
             before(grammarAccess.getDotSubGraphAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotSubGraphAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group__5__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_0__0"
    // InternalDotLanguage.g:1695:1: rule__DotSubGraph__Group_4_0__0 : rule__DotSubGraph__Group_4_0__0__Impl rule__DotSubGraph__Group_4_0__1 ;
    public final void rule__DotSubGraph__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1699:1: ( rule__DotSubGraph__Group_4_0__0__Impl rule__DotSubGraph__Group_4_0__1 )
            // InternalDotLanguage.g:1700:2: rule__DotSubGraph__Group_4_0__0__Impl rule__DotSubGraph__Group_4_0__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__DotSubGraph__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_0__0"


    // $ANTLR start "rule__DotSubGraph__Group_4_0__0__Impl"
    // InternalDotLanguage.g:1707:1: rule__DotSubGraph__Group_4_0__0__Impl : ( 'graph' ) ;
    public final void rule__DotSubGraph__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1711:1: ( ( 'graph' ) )
            // InternalDotLanguage.g:1712:1: ( 'graph' )
            {
            // InternalDotLanguage.g:1712:1: ( 'graph' )
            // InternalDotLanguage.g:1713:1: 'graph'
            {
             before(grammarAccess.getDotSubGraphAccess().getGraphKeyword_4_0_0()); 
            match(input,14,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotSubGraphAccess().getGraphKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_0__0__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_0__1"
    // InternalDotLanguage.g:1726:1: rule__DotSubGraph__Group_4_0__1 : rule__DotSubGraph__Group_4_0__1__Impl rule__DotSubGraph__Group_4_0__2 ;
    public final void rule__DotSubGraph__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1730:1: ( rule__DotSubGraph__Group_4_0__1__Impl rule__DotSubGraph__Group_4_0__2 )
            // InternalDotLanguage.g:1731:2: rule__DotSubGraph__Group_4_0__1__Impl rule__DotSubGraph__Group_4_0__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DotSubGraph__Group_4_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_0__1"


    // $ANTLR start "rule__DotSubGraph__Group_4_0__1__Impl"
    // InternalDotLanguage.g:1738:1: rule__DotSubGraph__Group_4_0__1__Impl : ( '[' ) ;
    public final void rule__DotSubGraph__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1742:1: ( ( '[' ) )
            // InternalDotLanguage.g:1743:1: ( '[' )
            {
            // InternalDotLanguage.g:1743:1: ( '[' )
            // InternalDotLanguage.g:1744:1: '['
            {
             before(grammarAccess.getDotSubGraphAccess().getLeftSquareBracketKeyword_4_0_1()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotSubGraphAccess().getLeftSquareBracketKeyword_4_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_0__1__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_0__2"
    // InternalDotLanguage.g:1757:1: rule__DotSubGraph__Group_4_0__2 : rule__DotSubGraph__Group_4_0__2__Impl rule__DotSubGraph__Group_4_0__3 ;
    public final void rule__DotSubGraph__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1761:1: ( rule__DotSubGraph__Group_4_0__2__Impl rule__DotSubGraph__Group_4_0__3 )
            // InternalDotLanguage.g:1762:2: rule__DotSubGraph__Group_4_0__2__Impl rule__DotSubGraph__Group_4_0__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DotSubGraph__Group_4_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_0__2"


    // $ANTLR start "rule__DotSubGraph__Group_4_0__2__Impl"
    // InternalDotLanguage.g:1769:1: rule__DotSubGraph__Group_4_0__2__Impl : ( ( rule__DotSubGraph__GraphSettingsAssignment_4_0_2 ) ) ;
    public final void rule__DotSubGraph__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1773:1: ( ( ( rule__DotSubGraph__GraphSettingsAssignment_4_0_2 ) ) )
            // InternalDotLanguage.g:1774:1: ( ( rule__DotSubGraph__GraphSettingsAssignment_4_0_2 ) )
            {
            // InternalDotLanguage.g:1774:1: ( ( rule__DotSubGraph__GraphSettingsAssignment_4_0_2 ) )
            // InternalDotLanguage.g:1775:1: ( rule__DotSubGraph__GraphSettingsAssignment_4_0_2 )
            {
             before(grammarAccess.getDotSubGraphAccess().getGraphSettingsAssignment_4_0_2()); 
            // InternalDotLanguage.g:1776:1: ( rule__DotSubGraph__GraphSettingsAssignment_4_0_2 )
            // InternalDotLanguage.g:1776:2: rule__DotSubGraph__GraphSettingsAssignment_4_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__GraphSettingsAssignment_4_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDotSubGraphAccess().getGraphSettingsAssignment_4_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_0__2__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_0__3"
    // InternalDotLanguage.g:1786:1: rule__DotSubGraph__Group_4_0__3 : rule__DotSubGraph__Group_4_0__3__Impl rule__DotSubGraph__Group_4_0__4 ;
    public final void rule__DotSubGraph__Group_4_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1790:1: ( rule__DotSubGraph__Group_4_0__3__Impl rule__DotSubGraph__Group_4_0__4 )
            // InternalDotLanguage.g:1791:2: rule__DotSubGraph__Group_4_0__3__Impl rule__DotSubGraph__Group_4_0__4
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DotSubGraph__Group_4_0__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_0__3"


    // $ANTLR start "rule__DotSubGraph__Group_4_0__3__Impl"
    // InternalDotLanguage.g:1798:1: rule__DotSubGraph__Group_4_0__3__Impl : ( ( rule__DotSubGraph__Group_4_0_3__0 )* ) ;
    public final void rule__DotSubGraph__Group_4_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1802:1: ( ( ( rule__DotSubGraph__Group_4_0_3__0 )* ) )
            // InternalDotLanguage.g:1803:1: ( ( rule__DotSubGraph__Group_4_0_3__0 )* )
            {
            // InternalDotLanguage.g:1803:1: ( ( rule__DotSubGraph__Group_4_0_3__0 )* )
            // InternalDotLanguage.g:1804:1: ( rule__DotSubGraph__Group_4_0_3__0 )*
            {
             before(grammarAccess.getDotSubGraphAccess().getGroup_4_0_3()); 
            // InternalDotLanguage.g:1805:1: ( rule__DotSubGraph__Group_4_0_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDotLanguage.g:1805:2: rule__DotSubGraph__Group_4_0_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__DotSubGraph__Group_4_0_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getDotSubGraphAccess().getGroup_4_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_0__3__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_0__4"
    // InternalDotLanguage.g:1815:1: rule__DotSubGraph__Group_4_0__4 : rule__DotSubGraph__Group_4_0__4__Impl rule__DotSubGraph__Group_4_0__5 ;
    public final void rule__DotSubGraph__Group_4_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1819:1: ( rule__DotSubGraph__Group_4_0__4__Impl rule__DotSubGraph__Group_4_0__5 )
            // InternalDotLanguage.g:1820:2: rule__DotSubGraph__Group_4_0__4__Impl rule__DotSubGraph__Group_4_0__5
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__DotSubGraph__Group_4_0__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_0__4"


    // $ANTLR start "rule__DotSubGraph__Group_4_0__4__Impl"
    // InternalDotLanguage.g:1827:1: rule__DotSubGraph__Group_4_0__4__Impl : ( ']' ) ;
    public final void rule__DotSubGraph__Group_4_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1831:1: ( ( ']' ) )
            // InternalDotLanguage.g:1832:1: ( ']' )
            {
            // InternalDotLanguage.g:1832:1: ( ']' )
            // InternalDotLanguage.g:1833:1: ']'
            {
             before(grammarAccess.getDotSubGraphAccess().getRightSquareBracketKeyword_4_0_4()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotSubGraphAccess().getRightSquareBracketKeyword_4_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_0__4__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_0__5"
    // InternalDotLanguage.g:1846:1: rule__DotSubGraph__Group_4_0__5 : rule__DotSubGraph__Group_4_0__5__Impl ;
    public final void rule__DotSubGraph__Group_4_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1850:1: ( rule__DotSubGraph__Group_4_0__5__Impl )
            // InternalDotLanguage.g:1851:2: rule__DotSubGraph__Group_4_0__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_0__5"


    // $ANTLR start "rule__DotSubGraph__Group_4_0__5__Impl"
    // InternalDotLanguage.g:1857:1: rule__DotSubGraph__Group_4_0__5__Impl : ( ( ';' )? ) ;
    public final void rule__DotSubGraph__Group_4_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1861:1: ( ( ( ';' )? ) )
            // InternalDotLanguage.g:1862:1: ( ( ';' )? )
            {
            // InternalDotLanguage.g:1862:1: ( ( ';' )? )
            // InternalDotLanguage.g:1863:1: ( ';' )?
            {
             before(grammarAccess.getDotSubGraphAccess().getSemicolonKeyword_4_0_5()); 
            // InternalDotLanguage.g:1864:1: ( ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDotLanguage.g:1865:2: ';'
                    {
                    match(input,19,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDotSubGraphAccess().getSemicolonKeyword_4_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_0__5__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_0_3__0"
    // InternalDotLanguage.g:1888:1: rule__DotSubGraph__Group_4_0_3__0 : rule__DotSubGraph__Group_4_0_3__0__Impl rule__DotSubGraph__Group_4_0_3__1 ;
    public final void rule__DotSubGraph__Group_4_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1892:1: ( rule__DotSubGraph__Group_4_0_3__0__Impl rule__DotSubGraph__Group_4_0_3__1 )
            // InternalDotLanguage.g:1893:2: rule__DotSubGraph__Group_4_0_3__0__Impl rule__DotSubGraph__Group_4_0_3__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DotSubGraph__Group_4_0_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_0_3__0"


    // $ANTLR start "rule__DotSubGraph__Group_4_0_3__0__Impl"
    // InternalDotLanguage.g:1900:1: rule__DotSubGraph__Group_4_0_3__0__Impl : ( ',' ) ;
    public final void rule__DotSubGraph__Group_4_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1904:1: ( ( ',' ) )
            // InternalDotLanguage.g:1905:1: ( ',' )
            {
            // InternalDotLanguage.g:1905:1: ( ',' )
            // InternalDotLanguage.g:1906:1: ','
            {
             before(grammarAccess.getDotSubGraphAccess().getCommaKeyword_4_0_3_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotSubGraphAccess().getCommaKeyword_4_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_0_3__0__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_0_3__1"
    // InternalDotLanguage.g:1919:1: rule__DotSubGraph__Group_4_0_3__1 : rule__DotSubGraph__Group_4_0_3__1__Impl ;
    public final void rule__DotSubGraph__Group_4_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1923:1: ( rule__DotSubGraph__Group_4_0_3__1__Impl )
            // InternalDotLanguage.g:1924:2: rule__DotSubGraph__Group_4_0_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_0_3__1"


    // $ANTLR start "rule__DotSubGraph__Group_4_0_3__1__Impl"
    // InternalDotLanguage.g:1930:1: rule__DotSubGraph__Group_4_0_3__1__Impl : ( ( rule__DotSubGraph__GraphSettingsAssignment_4_0_3_1 ) ) ;
    public final void rule__DotSubGraph__Group_4_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1934:1: ( ( ( rule__DotSubGraph__GraphSettingsAssignment_4_0_3_1 ) ) )
            // InternalDotLanguage.g:1935:1: ( ( rule__DotSubGraph__GraphSettingsAssignment_4_0_3_1 ) )
            {
            // InternalDotLanguage.g:1935:1: ( ( rule__DotSubGraph__GraphSettingsAssignment_4_0_3_1 ) )
            // InternalDotLanguage.g:1936:1: ( rule__DotSubGraph__GraphSettingsAssignment_4_0_3_1 )
            {
             before(grammarAccess.getDotSubGraphAccess().getGraphSettingsAssignment_4_0_3_1()); 
            // InternalDotLanguage.g:1937:1: ( rule__DotSubGraph__GraphSettingsAssignment_4_0_3_1 )
            // InternalDotLanguage.g:1937:2: rule__DotSubGraph__GraphSettingsAssignment_4_0_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__GraphSettingsAssignment_4_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDotSubGraphAccess().getGraphSettingsAssignment_4_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_0_3__1__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_1__0"
    // InternalDotLanguage.g:1951:1: rule__DotSubGraph__Group_4_1__0 : rule__DotSubGraph__Group_4_1__0__Impl rule__DotSubGraph__Group_4_1__1 ;
    public final void rule__DotSubGraph__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1955:1: ( rule__DotSubGraph__Group_4_1__0__Impl rule__DotSubGraph__Group_4_1__1 )
            // InternalDotLanguage.g:1956:2: rule__DotSubGraph__Group_4_1__0__Impl rule__DotSubGraph__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__DotSubGraph__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_1__0"


    // $ANTLR start "rule__DotSubGraph__Group_4_1__0__Impl"
    // InternalDotLanguage.g:1963:1: rule__DotSubGraph__Group_4_1__0__Impl : ( 'node' ) ;
    public final void rule__DotSubGraph__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1967:1: ( ( 'node' ) )
            // InternalDotLanguage.g:1968:1: ( 'node' )
            {
            // InternalDotLanguage.g:1968:1: ( 'node' )
            // InternalDotLanguage.g:1969:1: 'node'
            {
             before(grammarAccess.getDotSubGraphAccess().getNodeKeyword_4_1_0()); 
            match(input,21,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotSubGraphAccess().getNodeKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_1__0__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_1__1"
    // InternalDotLanguage.g:1982:1: rule__DotSubGraph__Group_4_1__1 : rule__DotSubGraph__Group_4_1__1__Impl rule__DotSubGraph__Group_4_1__2 ;
    public final void rule__DotSubGraph__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1986:1: ( rule__DotSubGraph__Group_4_1__1__Impl rule__DotSubGraph__Group_4_1__2 )
            // InternalDotLanguage.g:1987:2: rule__DotSubGraph__Group_4_1__1__Impl rule__DotSubGraph__Group_4_1__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DotSubGraph__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_1__1"


    // $ANTLR start "rule__DotSubGraph__Group_4_1__1__Impl"
    // InternalDotLanguage.g:1994:1: rule__DotSubGraph__Group_4_1__1__Impl : ( '[' ) ;
    public final void rule__DotSubGraph__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1998:1: ( ( '[' ) )
            // InternalDotLanguage.g:1999:1: ( '[' )
            {
            // InternalDotLanguage.g:1999:1: ( '[' )
            // InternalDotLanguage.g:2000:1: '['
            {
             before(grammarAccess.getDotSubGraphAccess().getLeftSquareBracketKeyword_4_1_1()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotSubGraphAccess().getLeftSquareBracketKeyword_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_1__1__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_1__2"
    // InternalDotLanguage.g:2013:1: rule__DotSubGraph__Group_4_1__2 : rule__DotSubGraph__Group_4_1__2__Impl rule__DotSubGraph__Group_4_1__3 ;
    public final void rule__DotSubGraph__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2017:1: ( rule__DotSubGraph__Group_4_1__2__Impl rule__DotSubGraph__Group_4_1__3 )
            // InternalDotLanguage.g:2018:2: rule__DotSubGraph__Group_4_1__2__Impl rule__DotSubGraph__Group_4_1__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DotSubGraph__Group_4_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_1__2"


    // $ANTLR start "rule__DotSubGraph__Group_4_1__2__Impl"
    // InternalDotLanguage.g:2025:1: rule__DotSubGraph__Group_4_1__2__Impl : ( ( rule__DotSubGraph__NodeSettingsAssignment_4_1_2 ) ) ;
    public final void rule__DotSubGraph__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2029:1: ( ( ( rule__DotSubGraph__NodeSettingsAssignment_4_1_2 ) ) )
            // InternalDotLanguage.g:2030:1: ( ( rule__DotSubGraph__NodeSettingsAssignment_4_1_2 ) )
            {
            // InternalDotLanguage.g:2030:1: ( ( rule__DotSubGraph__NodeSettingsAssignment_4_1_2 ) )
            // InternalDotLanguage.g:2031:1: ( rule__DotSubGraph__NodeSettingsAssignment_4_1_2 )
            {
             before(grammarAccess.getDotSubGraphAccess().getNodeSettingsAssignment_4_1_2()); 
            // InternalDotLanguage.g:2032:1: ( rule__DotSubGraph__NodeSettingsAssignment_4_1_2 )
            // InternalDotLanguage.g:2032:2: rule__DotSubGraph__NodeSettingsAssignment_4_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__NodeSettingsAssignment_4_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDotSubGraphAccess().getNodeSettingsAssignment_4_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_1__2__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_1__3"
    // InternalDotLanguage.g:2042:1: rule__DotSubGraph__Group_4_1__3 : rule__DotSubGraph__Group_4_1__3__Impl rule__DotSubGraph__Group_4_1__4 ;
    public final void rule__DotSubGraph__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2046:1: ( rule__DotSubGraph__Group_4_1__3__Impl rule__DotSubGraph__Group_4_1__4 )
            // InternalDotLanguage.g:2047:2: rule__DotSubGraph__Group_4_1__3__Impl rule__DotSubGraph__Group_4_1__4
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DotSubGraph__Group_4_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_1__3"


    // $ANTLR start "rule__DotSubGraph__Group_4_1__3__Impl"
    // InternalDotLanguage.g:2054:1: rule__DotSubGraph__Group_4_1__3__Impl : ( ( rule__DotSubGraph__Group_4_1_3__0 )* ) ;
    public final void rule__DotSubGraph__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2058:1: ( ( ( rule__DotSubGraph__Group_4_1_3__0 )* ) )
            // InternalDotLanguage.g:2059:1: ( ( rule__DotSubGraph__Group_4_1_3__0 )* )
            {
            // InternalDotLanguage.g:2059:1: ( ( rule__DotSubGraph__Group_4_1_3__0 )* )
            // InternalDotLanguage.g:2060:1: ( rule__DotSubGraph__Group_4_1_3__0 )*
            {
             before(grammarAccess.getDotSubGraphAccess().getGroup_4_1_3()); 
            // InternalDotLanguage.g:2061:1: ( rule__DotSubGraph__Group_4_1_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDotLanguage.g:2061:2: rule__DotSubGraph__Group_4_1_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__DotSubGraph__Group_4_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getDotSubGraphAccess().getGroup_4_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_1__3__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_1__4"
    // InternalDotLanguage.g:2071:1: rule__DotSubGraph__Group_4_1__4 : rule__DotSubGraph__Group_4_1__4__Impl rule__DotSubGraph__Group_4_1__5 ;
    public final void rule__DotSubGraph__Group_4_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2075:1: ( rule__DotSubGraph__Group_4_1__4__Impl rule__DotSubGraph__Group_4_1__5 )
            // InternalDotLanguage.g:2076:2: rule__DotSubGraph__Group_4_1__4__Impl rule__DotSubGraph__Group_4_1__5
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__DotSubGraph__Group_4_1__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_1__4"


    // $ANTLR start "rule__DotSubGraph__Group_4_1__4__Impl"
    // InternalDotLanguage.g:2083:1: rule__DotSubGraph__Group_4_1__4__Impl : ( ']' ) ;
    public final void rule__DotSubGraph__Group_4_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2087:1: ( ( ']' ) )
            // InternalDotLanguage.g:2088:1: ( ']' )
            {
            // InternalDotLanguage.g:2088:1: ( ']' )
            // InternalDotLanguage.g:2089:1: ']'
            {
             before(grammarAccess.getDotSubGraphAccess().getRightSquareBracketKeyword_4_1_4()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotSubGraphAccess().getRightSquareBracketKeyword_4_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_1__4__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_1__5"
    // InternalDotLanguage.g:2102:1: rule__DotSubGraph__Group_4_1__5 : rule__DotSubGraph__Group_4_1__5__Impl ;
    public final void rule__DotSubGraph__Group_4_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2106:1: ( rule__DotSubGraph__Group_4_1__5__Impl )
            // InternalDotLanguage.g:2107:2: rule__DotSubGraph__Group_4_1__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_1__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_1__5"


    // $ANTLR start "rule__DotSubGraph__Group_4_1__5__Impl"
    // InternalDotLanguage.g:2113:1: rule__DotSubGraph__Group_4_1__5__Impl : ( ( ';' )? ) ;
    public final void rule__DotSubGraph__Group_4_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2117:1: ( ( ( ';' )? ) )
            // InternalDotLanguage.g:2118:1: ( ( ';' )? )
            {
            // InternalDotLanguage.g:2118:1: ( ( ';' )? )
            // InternalDotLanguage.g:2119:1: ( ';' )?
            {
             before(grammarAccess.getDotSubGraphAccess().getSemicolonKeyword_4_1_5()); 
            // InternalDotLanguage.g:2120:1: ( ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDotLanguage.g:2121:2: ';'
                    {
                    match(input,19,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDotSubGraphAccess().getSemicolonKeyword_4_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_1__5__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_1_3__0"
    // InternalDotLanguage.g:2144:1: rule__DotSubGraph__Group_4_1_3__0 : rule__DotSubGraph__Group_4_1_3__0__Impl rule__DotSubGraph__Group_4_1_3__1 ;
    public final void rule__DotSubGraph__Group_4_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2148:1: ( rule__DotSubGraph__Group_4_1_3__0__Impl rule__DotSubGraph__Group_4_1_3__1 )
            // InternalDotLanguage.g:2149:2: rule__DotSubGraph__Group_4_1_3__0__Impl rule__DotSubGraph__Group_4_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DotSubGraph__Group_4_1_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_1_3__0"


    // $ANTLR start "rule__DotSubGraph__Group_4_1_3__0__Impl"
    // InternalDotLanguage.g:2156:1: rule__DotSubGraph__Group_4_1_3__0__Impl : ( ',' ) ;
    public final void rule__DotSubGraph__Group_4_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2160:1: ( ( ',' ) )
            // InternalDotLanguage.g:2161:1: ( ',' )
            {
            // InternalDotLanguage.g:2161:1: ( ',' )
            // InternalDotLanguage.g:2162:1: ','
            {
             before(grammarAccess.getDotSubGraphAccess().getCommaKeyword_4_1_3_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotSubGraphAccess().getCommaKeyword_4_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_1_3__0__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_1_3__1"
    // InternalDotLanguage.g:2175:1: rule__DotSubGraph__Group_4_1_3__1 : rule__DotSubGraph__Group_4_1_3__1__Impl ;
    public final void rule__DotSubGraph__Group_4_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2179:1: ( rule__DotSubGraph__Group_4_1_3__1__Impl )
            // InternalDotLanguage.g:2180:2: rule__DotSubGraph__Group_4_1_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_1_3__1"


    // $ANTLR start "rule__DotSubGraph__Group_4_1_3__1__Impl"
    // InternalDotLanguage.g:2186:1: rule__DotSubGraph__Group_4_1_3__1__Impl : ( ( rule__DotSubGraph__NodeSettingsAssignment_4_1_3_1 ) ) ;
    public final void rule__DotSubGraph__Group_4_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2190:1: ( ( ( rule__DotSubGraph__NodeSettingsAssignment_4_1_3_1 ) ) )
            // InternalDotLanguage.g:2191:1: ( ( rule__DotSubGraph__NodeSettingsAssignment_4_1_3_1 ) )
            {
            // InternalDotLanguage.g:2191:1: ( ( rule__DotSubGraph__NodeSettingsAssignment_4_1_3_1 ) )
            // InternalDotLanguage.g:2192:1: ( rule__DotSubGraph__NodeSettingsAssignment_4_1_3_1 )
            {
             before(grammarAccess.getDotSubGraphAccess().getNodeSettingsAssignment_4_1_3_1()); 
            // InternalDotLanguage.g:2193:1: ( rule__DotSubGraph__NodeSettingsAssignment_4_1_3_1 )
            // InternalDotLanguage.g:2193:2: rule__DotSubGraph__NodeSettingsAssignment_4_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__NodeSettingsAssignment_4_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDotSubGraphAccess().getNodeSettingsAssignment_4_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_1_3__1__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_2__0"
    // InternalDotLanguage.g:2207:1: rule__DotSubGraph__Group_4_2__0 : rule__DotSubGraph__Group_4_2__0__Impl rule__DotSubGraph__Group_4_2__1 ;
    public final void rule__DotSubGraph__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2211:1: ( rule__DotSubGraph__Group_4_2__0__Impl rule__DotSubGraph__Group_4_2__1 )
            // InternalDotLanguage.g:2212:2: rule__DotSubGraph__Group_4_2__0__Impl rule__DotSubGraph__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__DotSubGraph__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_2__0"


    // $ANTLR start "rule__DotSubGraph__Group_4_2__0__Impl"
    // InternalDotLanguage.g:2219:1: rule__DotSubGraph__Group_4_2__0__Impl : ( 'edge' ) ;
    public final void rule__DotSubGraph__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2223:1: ( ( 'edge' ) )
            // InternalDotLanguage.g:2224:1: ( 'edge' )
            {
            // InternalDotLanguage.g:2224:1: ( 'edge' )
            // InternalDotLanguage.g:2225:1: 'edge'
            {
             before(grammarAccess.getDotSubGraphAccess().getEdgeKeyword_4_2_0()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotSubGraphAccess().getEdgeKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_2__0__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_2__1"
    // InternalDotLanguage.g:2238:1: rule__DotSubGraph__Group_4_2__1 : rule__DotSubGraph__Group_4_2__1__Impl rule__DotSubGraph__Group_4_2__2 ;
    public final void rule__DotSubGraph__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2242:1: ( rule__DotSubGraph__Group_4_2__1__Impl rule__DotSubGraph__Group_4_2__2 )
            // InternalDotLanguage.g:2243:2: rule__DotSubGraph__Group_4_2__1__Impl rule__DotSubGraph__Group_4_2__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DotSubGraph__Group_4_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_2__1"


    // $ANTLR start "rule__DotSubGraph__Group_4_2__1__Impl"
    // InternalDotLanguage.g:2250:1: rule__DotSubGraph__Group_4_2__1__Impl : ( '[' ) ;
    public final void rule__DotSubGraph__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2254:1: ( ( '[' ) )
            // InternalDotLanguage.g:2255:1: ( '[' )
            {
            // InternalDotLanguage.g:2255:1: ( '[' )
            // InternalDotLanguage.g:2256:1: '['
            {
             before(grammarAccess.getDotSubGraphAccess().getLeftSquareBracketKeyword_4_2_1()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotSubGraphAccess().getLeftSquareBracketKeyword_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_2__1__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_2__2"
    // InternalDotLanguage.g:2269:1: rule__DotSubGraph__Group_4_2__2 : rule__DotSubGraph__Group_4_2__2__Impl rule__DotSubGraph__Group_4_2__3 ;
    public final void rule__DotSubGraph__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2273:1: ( rule__DotSubGraph__Group_4_2__2__Impl rule__DotSubGraph__Group_4_2__3 )
            // InternalDotLanguage.g:2274:2: rule__DotSubGraph__Group_4_2__2__Impl rule__DotSubGraph__Group_4_2__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DotSubGraph__Group_4_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_2__2"


    // $ANTLR start "rule__DotSubGraph__Group_4_2__2__Impl"
    // InternalDotLanguage.g:2281:1: rule__DotSubGraph__Group_4_2__2__Impl : ( ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_2 ) ) ;
    public final void rule__DotSubGraph__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2285:1: ( ( ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_2 ) ) )
            // InternalDotLanguage.g:2286:1: ( ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_2 ) )
            {
            // InternalDotLanguage.g:2286:1: ( ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_2 ) )
            // InternalDotLanguage.g:2287:1: ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_2 )
            {
             before(grammarAccess.getDotSubGraphAccess().getEdgeSettingsAssignment_4_2_2()); 
            // InternalDotLanguage.g:2288:1: ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_2 )
            // InternalDotLanguage.g:2288:2: rule__DotSubGraph__EdgeSettingsAssignment_4_2_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__EdgeSettingsAssignment_4_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDotSubGraphAccess().getEdgeSettingsAssignment_4_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_2__2__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_2__3"
    // InternalDotLanguage.g:2298:1: rule__DotSubGraph__Group_4_2__3 : rule__DotSubGraph__Group_4_2__3__Impl rule__DotSubGraph__Group_4_2__4 ;
    public final void rule__DotSubGraph__Group_4_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2302:1: ( rule__DotSubGraph__Group_4_2__3__Impl rule__DotSubGraph__Group_4_2__4 )
            // InternalDotLanguage.g:2303:2: rule__DotSubGraph__Group_4_2__3__Impl rule__DotSubGraph__Group_4_2__4
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DotSubGraph__Group_4_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_2__3"


    // $ANTLR start "rule__DotSubGraph__Group_4_2__3__Impl"
    // InternalDotLanguage.g:2310:1: rule__DotSubGraph__Group_4_2__3__Impl : ( ( rule__DotSubGraph__Group_4_2_3__0 )* ) ;
    public final void rule__DotSubGraph__Group_4_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2314:1: ( ( ( rule__DotSubGraph__Group_4_2_3__0 )* ) )
            // InternalDotLanguage.g:2315:1: ( ( rule__DotSubGraph__Group_4_2_3__0 )* )
            {
            // InternalDotLanguage.g:2315:1: ( ( rule__DotSubGraph__Group_4_2_3__0 )* )
            // InternalDotLanguage.g:2316:1: ( rule__DotSubGraph__Group_4_2_3__0 )*
            {
             before(grammarAccess.getDotSubGraphAccess().getGroup_4_2_3()); 
            // InternalDotLanguage.g:2317:1: ( rule__DotSubGraph__Group_4_2_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==20) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDotLanguage.g:2317:2: rule__DotSubGraph__Group_4_2_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__DotSubGraph__Group_4_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getDotSubGraphAccess().getGroup_4_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_2__3__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_2__4"
    // InternalDotLanguage.g:2327:1: rule__DotSubGraph__Group_4_2__4 : rule__DotSubGraph__Group_4_2__4__Impl rule__DotSubGraph__Group_4_2__5 ;
    public final void rule__DotSubGraph__Group_4_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2331:1: ( rule__DotSubGraph__Group_4_2__4__Impl rule__DotSubGraph__Group_4_2__5 )
            // InternalDotLanguage.g:2332:2: rule__DotSubGraph__Group_4_2__4__Impl rule__DotSubGraph__Group_4_2__5
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__DotSubGraph__Group_4_2__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_2__4"


    // $ANTLR start "rule__DotSubGraph__Group_4_2__4__Impl"
    // InternalDotLanguage.g:2339:1: rule__DotSubGraph__Group_4_2__4__Impl : ( ']' ) ;
    public final void rule__DotSubGraph__Group_4_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2343:1: ( ( ']' ) )
            // InternalDotLanguage.g:2344:1: ( ']' )
            {
            // InternalDotLanguage.g:2344:1: ( ']' )
            // InternalDotLanguage.g:2345:1: ']'
            {
             before(grammarAccess.getDotSubGraphAccess().getRightSquareBracketKeyword_4_2_4()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotSubGraphAccess().getRightSquareBracketKeyword_4_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_2__4__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_2__5"
    // InternalDotLanguage.g:2358:1: rule__DotSubGraph__Group_4_2__5 : rule__DotSubGraph__Group_4_2__5__Impl ;
    public final void rule__DotSubGraph__Group_4_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2362:1: ( rule__DotSubGraph__Group_4_2__5__Impl )
            // InternalDotLanguage.g:2363:2: rule__DotSubGraph__Group_4_2__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_2__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_2__5"


    // $ANTLR start "rule__DotSubGraph__Group_4_2__5__Impl"
    // InternalDotLanguage.g:2369:1: rule__DotSubGraph__Group_4_2__5__Impl : ( ( ';' )? ) ;
    public final void rule__DotSubGraph__Group_4_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2373:1: ( ( ( ';' )? ) )
            // InternalDotLanguage.g:2374:1: ( ( ';' )? )
            {
            // InternalDotLanguage.g:2374:1: ( ( ';' )? )
            // InternalDotLanguage.g:2375:1: ( ';' )?
            {
             before(grammarAccess.getDotSubGraphAccess().getSemicolonKeyword_4_2_5()); 
            // InternalDotLanguage.g:2376:1: ( ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDotLanguage.g:2377:2: ';'
                    {
                    match(input,19,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDotSubGraphAccess().getSemicolonKeyword_4_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_2__5__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_2_3__0"
    // InternalDotLanguage.g:2400:1: rule__DotSubGraph__Group_4_2_3__0 : rule__DotSubGraph__Group_4_2_3__0__Impl rule__DotSubGraph__Group_4_2_3__1 ;
    public final void rule__DotSubGraph__Group_4_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2404:1: ( rule__DotSubGraph__Group_4_2_3__0__Impl rule__DotSubGraph__Group_4_2_3__1 )
            // InternalDotLanguage.g:2405:2: rule__DotSubGraph__Group_4_2_3__0__Impl rule__DotSubGraph__Group_4_2_3__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DotSubGraph__Group_4_2_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_2_3__0"


    // $ANTLR start "rule__DotSubGraph__Group_4_2_3__0__Impl"
    // InternalDotLanguage.g:2412:1: rule__DotSubGraph__Group_4_2_3__0__Impl : ( ',' ) ;
    public final void rule__DotSubGraph__Group_4_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2416:1: ( ( ',' ) )
            // InternalDotLanguage.g:2417:1: ( ',' )
            {
            // InternalDotLanguage.g:2417:1: ( ',' )
            // InternalDotLanguage.g:2418:1: ','
            {
             before(grammarAccess.getDotSubGraphAccess().getCommaKeyword_4_2_3_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotSubGraphAccess().getCommaKeyword_4_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_2_3__0__Impl"


    // $ANTLR start "rule__DotSubGraph__Group_4_2_3__1"
    // InternalDotLanguage.g:2431:1: rule__DotSubGraph__Group_4_2_3__1 : rule__DotSubGraph__Group_4_2_3__1__Impl ;
    public final void rule__DotSubGraph__Group_4_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2435:1: ( rule__DotSubGraph__Group_4_2_3__1__Impl )
            // InternalDotLanguage.g:2436:2: rule__DotSubGraph__Group_4_2_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__Group_4_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_2_3__1"


    // $ANTLR start "rule__DotSubGraph__Group_4_2_3__1__Impl"
    // InternalDotLanguage.g:2442:1: rule__DotSubGraph__Group_4_2_3__1__Impl : ( ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_3_1 ) ) ;
    public final void rule__DotSubGraph__Group_4_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2446:1: ( ( ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_3_1 ) ) )
            // InternalDotLanguage.g:2447:1: ( ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_3_1 ) )
            {
            // InternalDotLanguage.g:2447:1: ( ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_3_1 ) )
            // InternalDotLanguage.g:2448:1: ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_3_1 )
            {
             before(grammarAccess.getDotSubGraphAccess().getEdgeSettingsAssignment_4_2_3_1()); 
            // InternalDotLanguage.g:2449:1: ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_3_1 )
            // InternalDotLanguage.g:2449:2: rule__DotSubGraph__EdgeSettingsAssignment_4_2_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DotSubGraph__EdgeSettingsAssignment_4_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDotSubGraphAccess().getEdgeSettingsAssignment_4_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__Group_4_2_3__1__Impl"


    // $ANTLR start "rule__DotNode__Group__0"
    // InternalDotLanguage.g:2463:1: rule__DotNode__Group__0 : rule__DotNode__Group__0__Impl rule__DotNode__Group__1 ;
    public final void rule__DotNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2467:1: ( rule__DotNode__Group__0__Impl rule__DotNode__Group__1 )
            // InternalDotLanguage.g:2468:2: rule__DotNode__Group__0__Impl rule__DotNode__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__DotNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2475:1: rule__DotNode__Group__0__Impl : ( ( rule__DotNode__NameAssignment_0 ) ) ;
    public final void rule__DotNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2479:1: ( ( ( rule__DotNode__NameAssignment_0 ) ) )
            // InternalDotLanguage.g:2480:1: ( ( rule__DotNode__NameAssignment_0 ) )
            {
            // InternalDotLanguage.g:2480:1: ( ( rule__DotNode__NameAssignment_0 ) )
            // InternalDotLanguage.g:2481:1: ( rule__DotNode__NameAssignment_0 )
            {
             before(grammarAccess.getDotNodeAccess().getNameAssignment_0()); 
            // InternalDotLanguage.g:2482:1: ( rule__DotNode__NameAssignment_0 )
            // InternalDotLanguage.g:2482:2: rule__DotNode__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2492:1: rule__DotNode__Group__1 : rule__DotNode__Group__1__Impl rule__DotNode__Group__2 ;
    public final void rule__DotNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2496:1: ( rule__DotNode__Group__1__Impl rule__DotNode__Group__2 )
            // InternalDotLanguage.g:2497:2: rule__DotNode__Group__1__Impl rule__DotNode__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__DotNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2504:1: rule__DotNode__Group__1__Impl : ( ( rule__DotNode__Group_1__0 )? ) ;
    public final void rule__DotNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2508:1: ( ( ( rule__DotNode__Group_1__0 )? ) )
            // InternalDotLanguage.g:2509:1: ( ( rule__DotNode__Group_1__0 )? )
            {
            // InternalDotLanguage.g:2509:1: ( ( rule__DotNode__Group_1__0 )? )
            // InternalDotLanguage.g:2510:1: ( rule__DotNode__Group_1__0 )?
            {
             before(grammarAccess.getDotNodeAccess().getGroup_1()); 
            // InternalDotLanguage.g:2511:1: ( rule__DotNode__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDotLanguage.g:2511:2: rule__DotNode__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2521:1: rule__DotNode__Group__2 : rule__DotNode__Group__2__Impl ;
    public final void rule__DotNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2525:1: ( rule__DotNode__Group__2__Impl )
            // InternalDotLanguage.g:2526:2: rule__DotNode__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2532:1: rule__DotNode__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__DotNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2536:1: ( ( ( ';' )? ) )
            // InternalDotLanguage.g:2537:1: ( ( ';' )? )
            {
            // InternalDotLanguage.g:2537:1: ( ( ';' )? )
            // InternalDotLanguage.g:2538:1: ( ';' )?
            {
             before(grammarAccess.getDotNodeAccess().getSemicolonKeyword_2()); 
            // InternalDotLanguage.g:2539:1: ( ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDotLanguage.g:2540:2: ';'
                    {
                    match(input,19,FollowSets000.FOLLOW_2); 

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
    // InternalDotLanguage.g:2557:1: rule__DotNode__Group_1__0 : rule__DotNode__Group_1__0__Impl rule__DotNode__Group_1__1 ;
    public final void rule__DotNode__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2561:1: ( rule__DotNode__Group_1__0__Impl rule__DotNode__Group_1__1 )
            // InternalDotLanguage.g:2562:2: rule__DotNode__Group_1__0__Impl rule__DotNode__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DotNode__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2569:1: rule__DotNode__Group_1__0__Impl : ( '[' ) ;
    public final void rule__DotNode__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2573:1: ( ( '[' ) )
            // InternalDotLanguage.g:2574:1: ( '[' )
            {
            // InternalDotLanguage.g:2574:1: ( '[' )
            // InternalDotLanguage.g:2575:1: '['
            {
             before(grammarAccess.getDotNodeAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,17,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:2588:1: rule__DotNode__Group_1__1 : rule__DotNode__Group_1__1__Impl rule__DotNode__Group_1__2 ;
    public final void rule__DotNode__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2592:1: ( rule__DotNode__Group_1__1__Impl rule__DotNode__Group_1__2 )
            // InternalDotLanguage.g:2593:2: rule__DotNode__Group_1__1__Impl rule__DotNode__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DotNode__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2600:1: rule__DotNode__Group_1__1__Impl : ( ( rule__DotNode__SettingsAssignment_1_1 ) ) ;
    public final void rule__DotNode__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2604:1: ( ( ( rule__DotNode__SettingsAssignment_1_1 ) ) )
            // InternalDotLanguage.g:2605:1: ( ( rule__DotNode__SettingsAssignment_1_1 ) )
            {
            // InternalDotLanguage.g:2605:1: ( ( rule__DotNode__SettingsAssignment_1_1 ) )
            // InternalDotLanguage.g:2606:1: ( rule__DotNode__SettingsAssignment_1_1 )
            {
             before(grammarAccess.getDotNodeAccess().getSettingsAssignment_1_1()); 
            // InternalDotLanguage.g:2607:1: ( rule__DotNode__SettingsAssignment_1_1 )
            // InternalDotLanguage.g:2607:2: rule__DotNode__SettingsAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2617:1: rule__DotNode__Group_1__2 : rule__DotNode__Group_1__2__Impl rule__DotNode__Group_1__3 ;
    public final void rule__DotNode__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2621:1: ( rule__DotNode__Group_1__2__Impl rule__DotNode__Group_1__3 )
            // InternalDotLanguage.g:2622:2: rule__DotNode__Group_1__2__Impl rule__DotNode__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DotNode__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2629:1: rule__DotNode__Group_1__2__Impl : ( ( rule__DotNode__Group_1_2__0 )* ) ;
    public final void rule__DotNode__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2633:1: ( ( ( rule__DotNode__Group_1_2__0 )* ) )
            // InternalDotLanguage.g:2634:1: ( ( rule__DotNode__Group_1_2__0 )* )
            {
            // InternalDotLanguage.g:2634:1: ( ( rule__DotNode__Group_1_2__0 )* )
            // InternalDotLanguage.g:2635:1: ( rule__DotNode__Group_1_2__0 )*
            {
             before(grammarAccess.getDotNodeAccess().getGroup_1_2()); 
            // InternalDotLanguage.g:2636:1: ( rule__DotNode__Group_1_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==20) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDotLanguage.g:2636:2: rule__DotNode__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__DotNode__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalDotLanguage.g:2646:1: rule__DotNode__Group_1__3 : rule__DotNode__Group_1__3__Impl ;
    public final void rule__DotNode__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2650:1: ( rule__DotNode__Group_1__3__Impl )
            // InternalDotLanguage.g:2651:2: rule__DotNode__Group_1__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2657:1: rule__DotNode__Group_1__3__Impl : ( ']' ) ;
    public final void rule__DotNode__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2661:1: ( ( ']' ) )
            // InternalDotLanguage.g:2662:1: ( ']' )
            {
            // InternalDotLanguage.g:2662:1: ( ']' )
            // InternalDotLanguage.g:2663:1: ']'
            {
             before(grammarAccess.getDotNodeAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,18,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:2684:1: rule__DotNode__Group_1_2__0 : rule__DotNode__Group_1_2__0__Impl rule__DotNode__Group_1_2__1 ;
    public final void rule__DotNode__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2688:1: ( rule__DotNode__Group_1_2__0__Impl rule__DotNode__Group_1_2__1 )
            // InternalDotLanguage.g:2689:2: rule__DotNode__Group_1_2__0__Impl rule__DotNode__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DotNode__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2696:1: rule__DotNode__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__DotNode__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2700:1: ( ( ',' ) )
            // InternalDotLanguage.g:2701:1: ( ',' )
            {
            // InternalDotLanguage.g:2701:1: ( ',' )
            // InternalDotLanguage.g:2702:1: ','
            {
             before(grammarAccess.getDotNodeAccess().getCommaKeyword_1_2_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:2715:1: rule__DotNode__Group_1_2__1 : rule__DotNode__Group_1_2__1__Impl ;
    public final void rule__DotNode__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2719:1: ( rule__DotNode__Group_1_2__1__Impl )
            // InternalDotLanguage.g:2720:2: rule__DotNode__Group_1_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2726:1: rule__DotNode__Group_1_2__1__Impl : ( ( rule__DotNode__SettingsAssignment_1_2_1 ) ) ;
    public final void rule__DotNode__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2730:1: ( ( ( rule__DotNode__SettingsAssignment_1_2_1 ) ) )
            // InternalDotLanguage.g:2731:1: ( ( rule__DotNode__SettingsAssignment_1_2_1 ) )
            {
            // InternalDotLanguage.g:2731:1: ( ( rule__DotNode__SettingsAssignment_1_2_1 ) )
            // InternalDotLanguage.g:2732:1: ( rule__DotNode__SettingsAssignment_1_2_1 )
            {
             before(grammarAccess.getDotNodeAccess().getSettingsAssignment_1_2_1()); 
            // InternalDotLanguage.g:2733:1: ( rule__DotNode__SettingsAssignment_1_2_1 )
            // InternalDotLanguage.g:2733:2: rule__DotNode__SettingsAssignment_1_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "rule__DirectedDotEdge__Group__0"
    // InternalDotLanguage.g:2747:1: rule__DirectedDotEdge__Group__0 : rule__DirectedDotEdge__Group__0__Impl rule__DirectedDotEdge__Group__1 ;
    public final void rule__DirectedDotEdge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2751:1: ( rule__DirectedDotEdge__Group__0__Impl rule__DirectedDotEdge__Group__1 )
            // InternalDotLanguage.g:2752:2: rule__DirectedDotEdge__Group__0__Impl rule__DirectedDotEdge__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__DirectedDotEdge__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DirectedDotEdge__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group__0"


    // $ANTLR start "rule__DirectedDotEdge__Group__0__Impl"
    // InternalDotLanguage.g:2759:1: rule__DirectedDotEdge__Group__0__Impl : ( ( rule__DirectedDotEdge__SourceAssignment_0 ) ) ;
    public final void rule__DirectedDotEdge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2763:1: ( ( ( rule__DirectedDotEdge__SourceAssignment_0 ) ) )
            // InternalDotLanguage.g:2764:1: ( ( rule__DirectedDotEdge__SourceAssignment_0 ) )
            {
            // InternalDotLanguage.g:2764:1: ( ( rule__DirectedDotEdge__SourceAssignment_0 ) )
            // InternalDotLanguage.g:2765:1: ( rule__DirectedDotEdge__SourceAssignment_0 )
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getSourceAssignment_0()); 
            // InternalDotLanguage.g:2766:1: ( rule__DirectedDotEdge__SourceAssignment_0 )
            // InternalDotLanguage.g:2766:2: rule__DirectedDotEdge__SourceAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DirectedDotEdge__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDirectedDotEdgeAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group__0__Impl"


    // $ANTLR start "rule__DirectedDotEdge__Group__1"
    // InternalDotLanguage.g:2776:1: rule__DirectedDotEdge__Group__1 : rule__DirectedDotEdge__Group__1__Impl rule__DirectedDotEdge__Group__2 ;
    public final void rule__DirectedDotEdge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2780:1: ( rule__DirectedDotEdge__Group__1__Impl rule__DirectedDotEdge__Group__2 )
            // InternalDotLanguage.g:2781:2: rule__DirectedDotEdge__Group__1__Impl rule__DirectedDotEdge__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DirectedDotEdge__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DirectedDotEdge__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group__1"


    // $ANTLR start "rule__DirectedDotEdge__Group__1__Impl"
    // InternalDotLanguage.g:2788:1: rule__DirectedDotEdge__Group__1__Impl : ( '->' ) ;
    public final void rule__DirectedDotEdge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2792:1: ( ( '->' ) )
            // InternalDotLanguage.g:2793:1: ( '->' )
            {
            // InternalDotLanguage.g:2793:1: ( '->' )
            // InternalDotLanguage.g:2794:1: '->'
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDirectedDotEdgeAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group__1__Impl"


    // $ANTLR start "rule__DirectedDotEdge__Group__2"
    // InternalDotLanguage.g:2807:1: rule__DirectedDotEdge__Group__2 : rule__DirectedDotEdge__Group__2__Impl rule__DirectedDotEdge__Group__3 ;
    public final void rule__DirectedDotEdge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2811:1: ( rule__DirectedDotEdge__Group__2__Impl rule__DirectedDotEdge__Group__3 )
            // InternalDotLanguage.g:2812:2: rule__DirectedDotEdge__Group__2__Impl rule__DirectedDotEdge__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__DirectedDotEdge__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DirectedDotEdge__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group__2"


    // $ANTLR start "rule__DirectedDotEdge__Group__2__Impl"
    // InternalDotLanguage.g:2819:1: rule__DirectedDotEdge__Group__2__Impl : ( ( rule__DirectedDotEdge__TargetAssignment_2 ) ) ;
    public final void rule__DirectedDotEdge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2823:1: ( ( ( rule__DirectedDotEdge__TargetAssignment_2 ) ) )
            // InternalDotLanguage.g:2824:1: ( ( rule__DirectedDotEdge__TargetAssignment_2 ) )
            {
            // InternalDotLanguage.g:2824:1: ( ( rule__DirectedDotEdge__TargetAssignment_2 ) )
            // InternalDotLanguage.g:2825:1: ( rule__DirectedDotEdge__TargetAssignment_2 )
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getTargetAssignment_2()); 
            // InternalDotLanguage.g:2826:1: ( rule__DirectedDotEdge__TargetAssignment_2 )
            // InternalDotLanguage.g:2826:2: rule__DirectedDotEdge__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DirectedDotEdge__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDirectedDotEdgeAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group__2__Impl"


    // $ANTLR start "rule__DirectedDotEdge__Group__3"
    // InternalDotLanguage.g:2836:1: rule__DirectedDotEdge__Group__3 : rule__DirectedDotEdge__Group__3__Impl rule__DirectedDotEdge__Group__4 ;
    public final void rule__DirectedDotEdge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2840:1: ( rule__DirectedDotEdge__Group__3__Impl rule__DirectedDotEdge__Group__4 )
            // InternalDotLanguage.g:2841:2: rule__DirectedDotEdge__Group__3__Impl rule__DirectedDotEdge__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__DirectedDotEdge__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DirectedDotEdge__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group__3"


    // $ANTLR start "rule__DirectedDotEdge__Group__3__Impl"
    // InternalDotLanguage.g:2848:1: rule__DirectedDotEdge__Group__3__Impl : ( ( rule__DirectedDotEdge__Group_3__0 )? ) ;
    public final void rule__DirectedDotEdge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2852:1: ( ( ( rule__DirectedDotEdge__Group_3__0 )? ) )
            // InternalDotLanguage.g:2853:1: ( ( rule__DirectedDotEdge__Group_3__0 )? )
            {
            // InternalDotLanguage.g:2853:1: ( ( rule__DirectedDotEdge__Group_3__0 )? )
            // InternalDotLanguage.g:2854:1: ( rule__DirectedDotEdge__Group_3__0 )?
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getGroup_3()); 
            // InternalDotLanguage.g:2855:1: ( rule__DirectedDotEdge__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDotLanguage.g:2855:2: rule__DirectedDotEdge__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DirectedDotEdge__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDirectedDotEdgeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group__3__Impl"


    // $ANTLR start "rule__DirectedDotEdge__Group__4"
    // InternalDotLanguage.g:2865:1: rule__DirectedDotEdge__Group__4 : rule__DirectedDotEdge__Group__4__Impl ;
    public final void rule__DirectedDotEdge__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2869:1: ( rule__DirectedDotEdge__Group__4__Impl )
            // InternalDotLanguage.g:2870:2: rule__DirectedDotEdge__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DirectedDotEdge__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group__4"


    // $ANTLR start "rule__DirectedDotEdge__Group__4__Impl"
    // InternalDotLanguage.g:2876:1: rule__DirectedDotEdge__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__DirectedDotEdge__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2880:1: ( ( ( ';' )? ) )
            // InternalDotLanguage.g:2881:1: ( ( ';' )? )
            {
            // InternalDotLanguage.g:2881:1: ( ( ';' )? )
            // InternalDotLanguage.g:2882:1: ( ';' )?
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getSemicolonKeyword_4()); 
            // InternalDotLanguage.g:2883:1: ( ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==19) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDotLanguage.g:2884:2: ';'
                    {
                    match(input,19,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDirectedDotEdgeAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group__4__Impl"


    // $ANTLR start "rule__DirectedDotEdge__Group_3__0"
    // InternalDotLanguage.g:2905:1: rule__DirectedDotEdge__Group_3__0 : rule__DirectedDotEdge__Group_3__0__Impl rule__DirectedDotEdge__Group_3__1 ;
    public final void rule__DirectedDotEdge__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2909:1: ( rule__DirectedDotEdge__Group_3__0__Impl rule__DirectedDotEdge__Group_3__1 )
            // InternalDotLanguage.g:2910:2: rule__DirectedDotEdge__Group_3__0__Impl rule__DirectedDotEdge__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DirectedDotEdge__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DirectedDotEdge__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group_3__0"


    // $ANTLR start "rule__DirectedDotEdge__Group_3__0__Impl"
    // InternalDotLanguage.g:2917:1: rule__DirectedDotEdge__Group_3__0__Impl : ( '[' ) ;
    public final void rule__DirectedDotEdge__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2921:1: ( ( '[' ) )
            // InternalDotLanguage.g:2922:1: ( '[' )
            {
            // InternalDotLanguage.g:2922:1: ( '[' )
            // InternalDotLanguage.g:2923:1: '['
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDirectedDotEdgeAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group_3__0__Impl"


    // $ANTLR start "rule__DirectedDotEdge__Group_3__1"
    // InternalDotLanguage.g:2936:1: rule__DirectedDotEdge__Group_3__1 : rule__DirectedDotEdge__Group_3__1__Impl rule__DirectedDotEdge__Group_3__2 ;
    public final void rule__DirectedDotEdge__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2940:1: ( rule__DirectedDotEdge__Group_3__1__Impl rule__DirectedDotEdge__Group_3__2 )
            // InternalDotLanguage.g:2941:2: rule__DirectedDotEdge__Group_3__1__Impl rule__DirectedDotEdge__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DirectedDotEdge__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DirectedDotEdge__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group_3__1"


    // $ANTLR start "rule__DirectedDotEdge__Group_3__1__Impl"
    // InternalDotLanguage.g:2948:1: rule__DirectedDotEdge__Group_3__1__Impl : ( ( rule__DirectedDotEdge__SettingsAssignment_3_1 ) ) ;
    public final void rule__DirectedDotEdge__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2952:1: ( ( ( rule__DirectedDotEdge__SettingsAssignment_3_1 ) ) )
            // InternalDotLanguage.g:2953:1: ( ( rule__DirectedDotEdge__SettingsAssignment_3_1 ) )
            {
            // InternalDotLanguage.g:2953:1: ( ( rule__DirectedDotEdge__SettingsAssignment_3_1 ) )
            // InternalDotLanguage.g:2954:1: ( rule__DirectedDotEdge__SettingsAssignment_3_1 )
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getSettingsAssignment_3_1()); 
            // InternalDotLanguage.g:2955:1: ( rule__DirectedDotEdge__SettingsAssignment_3_1 )
            // InternalDotLanguage.g:2955:2: rule__DirectedDotEdge__SettingsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DirectedDotEdge__SettingsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectedDotEdgeAccess().getSettingsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group_3__1__Impl"


    // $ANTLR start "rule__DirectedDotEdge__Group_3__2"
    // InternalDotLanguage.g:2965:1: rule__DirectedDotEdge__Group_3__2 : rule__DirectedDotEdge__Group_3__2__Impl rule__DirectedDotEdge__Group_3__3 ;
    public final void rule__DirectedDotEdge__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2969:1: ( rule__DirectedDotEdge__Group_3__2__Impl rule__DirectedDotEdge__Group_3__3 )
            // InternalDotLanguage.g:2970:2: rule__DirectedDotEdge__Group_3__2__Impl rule__DirectedDotEdge__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DirectedDotEdge__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DirectedDotEdge__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group_3__2"


    // $ANTLR start "rule__DirectedDotEdge__Group_3__2__Impl"
    // InternalDotLanguage.g:2977:1: rule__DirectedDotEdge__Group_3__2__Impl : ( ( rule__DirectedDotEdge__Group_3_2__0 )* ) ;
    public final void rule__DirectedDotEdge__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2981:1: ( ( ( rule__DirectedDotEdge__Group_3_2__0 )* ) )
            // InternalDotLanguage.g:2982:1: ( ( rule__DirectedDotEdge__Group_3_2__0 )* )
            {
            // InternalDotLanguage.g:2982:1: ( ( rule__DirectedDotEdge__Group_3_2__0 )* )
            // InternalDotLanguage.g:2983:1: ( rule__DirectedDotEdge__Group_3_2__0 )*
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getGroup_3_2()); 
            // InternalDotLanguage.g:2984:1: ( rule__DirectedDotEdge__Group_3_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==20) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDotLanguage.g:2984:2: rule__DirectedDotEdge__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__DirectedDotEdge__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getDirectedDotEdgeAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group_3__2__Impl"


    // $ANTLR start "rule__DirectedDotEdge__Group_3__3"
    // InternalDotLanguage.g:2994:1: rule__DirectedDotEdge__Group_3__3 : rule__DirectedDotEdge__Group_3__3__Impl ;
    public final void rule__DirectedDotEdge__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2998:1: ( rule__DirectedDotEdge__Group_3__3__Impl )
            // InternalDotLanguage.g:2999:2: rule__DirectedDotEdge__Group_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DirectedDotEdge__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group_3__3"


    // $ANTLR start "rule__DirectedDotEdge__Group_3__3__Impl"
    // InternalDotLanguage.g:3005:1: rule__DirectedDotEdge__Group_3__3__Impl : ( ']' ) ;
    public final void rule__DirectedDotEdge__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3009:1: ( ( ']' ) )
            // InternalDotLanguage.g:3010:1: ( ']' )
            {
            // InternalDotLanguage.g:3010:1: ( ']' )
            // InternalDotLanguage.g:3011:1: ']'
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDirectedDotEdgeAccess().getRightSquareBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group_3__3__Impl"


    // $ANTLR start "rule__DirectedDotEdge__Group_3_2__0"
    // InternalDotLanguage.g:3032:1: rule__DirectedDotEdge__Group_3_2__0 : rule__DirectedDotEdge__Group_3_2__0__Impl rule__DirectedDotEdge__Group_3_2__1 ;
    public final void rule__DirectedDotEdge__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3036:1: ( rule__DirectedDotEdge__Group_3_2__0__Impl rule__DirectedDotEdge__Group_3_2__1 )
            // InternalDotLanguage.g:3037:2: rule__DirectedDotEdge__Group_3_2__0__Impl rule__DirectedDotEdge__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DirectedDotEdge__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DirectedDotEdge__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group_3_2__0"


    // $ANTLR start "rule__DirectedDotEdge__Group_3_2__0__Impl"
    // InternalDotLanguage.g:3044:1: rule__DirectedDotEdge__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__DirectedDotEdge__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3048:1: ( ( ',' ) )
            // InternalDotLanguage.g:3049:1: ( ',' )
            {
            // InternalDotLanguage.g:3049:1: ( ',' )
            // InternalDotLanguage.g:3050:1: ','
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getCommaKeyword_3_2_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDirectedDotEdgeAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group_3_2__0__Impl"


    // $ANTLR start "rule__DirectedDotEdge__Group_3_2__1"
    // InternalDotLanguage.g:3063:1: rule__DirectedDotEdge__Group_3_2__1 : rule__DirectedDotEdge__Group_3_2__1__Impl ;
    public final void rule__DirectedDotEdge__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3067:1: ( rule__DirectedDotEdge__Group_3_2__1__Impl )
            // InternalDotLanguage.g:3068:2: rule__DirectedDotEdge__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DirectedDotEdge__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group_3_2__1"


    // $ANTLR start "rule__DirectedDotEdge__Group_3_2__1__Impl"
    // InternalDotLanguage.g:3074:1: rule__DirectedDotEdge__Group_3_2__1__Impl : ( ( rule__DirectedDotEdge__SettingsAssignment_3_2_1 ) ) ;
    public final void rule__DirectedDotEdge__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3078:1: ( ( ( rule__DirectedDotEdge__SettingsAssignment_3_2_1 ) ) )
            // InternalDotLanguage.g:3079:1: ( ( rule__DirectedDotEdge__SettingsAssignment_3_2_1 ) )
            {
            // InternalDotLanguage.g:3079:1: ( ( rule__DirectedDotEdge__SettingsAssignment_3_2_1 ) )
            // InternalDotLanguage.g:3080:1: ( rule__DirectedDotEdge__SettingsAssignment_3_2_1 )
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getSettingsAssignment_3_2_1()); 
            // InternalDotLanguage.g:3081:1: ( rule__DirectedDotEdge__SettingsAssignment_3_2_1 )
            // InternalDotLanguage.g:3081:2: rule__DirectedDotEdge__SettingsAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DirectedDotEdge__SettingsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectedDotEdgeAccess().getSettingsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__Group_3_2__1__Impl"


    // $ANTLR start "rule__UndirectedDotEdge__Group__0"
    // InternalDotLanguage.g:3095:1: rule__UndirectedDotEdge__Group__0 : rule__UndirectedDotEdge__Group__0__Impl rule__UndirectedDotEdge__Group__1 ;
    public final void rule__UndirectedDotEdge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3099:1: ( rule__UndirectedDotEdge__Group__0__Impl rule__UndirectedDotEdge__Group__1 )
            // InternalDotLanguage.g:3100:2: rule__UndirectedDotEdge__Group__0__Impl rule__UndirectedDotEdge__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__UndirectedDotEdge__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__UndirectedDotEdge__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group__0"


    // $ANTLR start "rule__UndirectedDotEdge__Group__0__Impl"
    // InternalDotLanguage.g:3107:1: rule__UndirectedDotEdge__Group__0__Impl : ( ( rule__UndirectedDotEdge__SourceAssignment_0 ) ) ;
    public final void rule__UndirectedDotEdge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3111:1: ( ( ( rule__UndirectedDotEdge__SourceAssignment_0 ) ) )
            // InternalDotLanguage.g:3112:1: ( ( rule__UndirectedDotEdge__SourceAssignment_0 ) )
            {
            // InternalDotLanguage.g:3112:1: ( ( rule__UndirectedDotEdge__SourceAssignment_0 ) )
            // InternalDotLanguage.g:3113:1: ( rule__UndirectedDotEdge__SourceAssignment_0 )
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getSourceAssignment_0()); 
            // InternalDotLanguage.g:3114:1: ( rule__UndirectedDotEdge__SourceAssignment_0 )
            // InternalDotLanguage.g:3114:2: rule__UndirectedDotEdge__SourceAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UndirectedDotEdge__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUndirectedDotEdgeAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group__0__Impl"


    // $ANTLR start "rule__UndirectedDotEdge__Group__1"
    // InternalDotLanguage.g:3124:1: rule__UndirectedDotEdge__Group__1 : rule__UndirectedDotEdge__Group__1__Impl rule__UndirectedDotEdge__Group__2 ;
    public final void rule__UndirectedDotEdge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3128:1: ( rule__UndirectedDotEdge__Group__1__Impl rule__UndirectedDotEdge__Group__2 )
            // InternalDotLanguage.g:3129:2: rule__UndirectedDotEdge__Group__1__Impl rule__UndirectedDotEdge__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__UndirectedDotEdge__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__UndirectedDotEdge__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group__1"


    // $ANTLR start "rule__UndirectedDotEdge__Group__1__Impl"
    // InternalDotLanguage.g:3136:1: rule__UndirectedDotEdge__Group__1__Impl : ( '--' ) ;
    public final void rule__UndirectedDotEdge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3140:1: ( ( '--' ) )
            // InternalDotLanguage.g:3141:1: ( '--' )
            {
            // InternalDotLanguage.g:3141:1: ( '--' )
            // InternalDotLanguage.g:3142:1: '--'
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getHyphenMinusHyphenMinusKeyword_1()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getUndirectedDotEdgeAccess().getHyphenMinusHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group__1__Impl"


    // $ANTLR start "rule__UndirectedDotEdge__Group__2"
    // InternalDotLanguage.g:3155:1: rule__UndirectedDotEdge__Group__2 : rule__UndirectedDotEdge__Group__2__Impl rule__UndirectedDotEdge__Group__3 ;
    public final void rule__UndirectedDotEdge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3159:1: ( rule__UndirectedDotEdge__Group__2__Impl rule__UndirectedDotEdge__Group__3 )
            // InternalDotLanguage.g:3160:2: rule__UndirectedDotEdge__Group__2__Impl rule__UndirectedDotEdge__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__UndirectedDotEdge__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__UndirectedDotEdge__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group__2"


    // $ANTLR start "rule__UndirectedDotEdge__Group__2__Impl"
    // InternalDotLanguage.g:3167:1: rule__UndirectedDotEdge__Group__2__Impl : ( ( rule__UndirectedDotEdge__TargetAssignment_2 ) ) ;
    public final void rule__UndirectedDotEdge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3171:1: ( ( ( rule__UndirectedDotEdge__TargetAssignment_2 ) ) )
            // InternalDotLanguage.g:3172:1: ( ( rule__UndirectedDotEdge__TargetAssignment_2 ) )
            {
            // InternalDotLanguage.g:3172:1: ( ( rule__UndirectedDotEdge__TargetAssignment_2 ) )
            // InternalDotLanguage.g:3173:1: ( rule__UndirectedDotEdge__TargetAssignment_2 )
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getTargetAssignment_2()); 
            // InternalDotLanguage.g:3174:1: ( rule__UndirectedDotEdge__TargetAssignment_2 )
            // InternalDotLanguage.g:3174:2: rule__UndirectedDotEdge__TargetAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UndirectedDotEdge__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUndirectedDotEdgeAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group__2__Impl"


    // $ANTLR start "rule__UndirectedDotEdge__Group__3"
    // InternalDotLanguage.g:3184:1: rule__UndirectedDotEdge__Group__3 : rule__UndirectedDotEdge__Group__3__Impl rule__UndirectedDotEdge__Group__4 ;
    public final void rule__UndirectedDotEdge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3188:1: ( rule__UndirectedDotEdge__Group__3__Impl rule__UndirectedDotEdge__Group__4 )
            // InternalDotLanguage.g:3189:2: rule__UndirectedDotEdge__Group__3__Impl rule__UndirectedDotEdge__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__UndirectedDotEdge__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__UndirectedDotEdge__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group__3"


    // $ANTLR start "rule__UndirectedDotEdge__Group__3__Impl"
    // InternalDotLanguage.g:3196:1: rule__UndirectedDotEdge__Group__3__Impl : ( ( rule__UndirectedDotEdge__Group_3__0 )? ) ;
    public final void rule__UndirectedDotEdge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3200:1: ( ( ( rule__UndirectedDotEdge__Group_3__0 )? ) )
            // InternalDotLanguage.g:3201:1: ( ( rule__UndirectedDotEdge__Group_3__0 )? )
            {
            // InternalDotLanguage.g:3201:1: ( ( rule__UndirectedDotEdge__Group_3__0 )? )
            // InternalDotLanguage.g:3202:1: ( rule__UndirectedDotEdge__Group_3__0 )?
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getGroup_3()); 
            // InternalDotLanguage.g:3203:1: ( rule__UndirectedDotEdge__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==17) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDotLanguage.g:3203:2: rule__UndirectedDotEdge__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__UndirectedDotEdge__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUndirectedDotEdgeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group__3__Impl"


    // $ANTLR start "rule__UndirectedDotEdge__Group__4"
    // InternalDotLanguage.g:3213:1: rule__UndirectedDotEdge__Group__4 : rule__UndirectedDotEdge__Group__4__Impl ;
    public final void rule__UndirectedDotEdge__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3217:1: ( rule__UndirectedDotEdge__Group__4__Impl )
            // InternalDotLanguage.g:3218:2: rule__UndirectedDotEdge__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UndirectedDotEdge__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group__4"


    // $ANTLR start "rule__UndirectedDotEdge__Group__4__Impl"
    // InternalDotLanguage.g:3224:1: rule__UndirectedDotEdge__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__UndirectedDotEdge__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3228:1: ( ( ( ';' )? ) )
            // InternalDotLanguage.g:3229:1: ( ( ';' )? )
            {
            // InternalDotLanguage.g:3229:1: ( ( ';' )? )
            // InternalDotLanguage.g:3230:1: ( ';' )?
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getSemicolonKeyword_4()); 
            // InternalDotLanguage.g:3231:1: ( ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==19) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDotLanguage.g:3232:2: ';'
                    {
                    match(input,19,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getUndirectedDotEdgeAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group__4__Impl"


    // $ANTLR start "rule__UndirectedDotEdge__Group_3__0"
    // InternalDotLanguage.g:3253:1: rule__UndirectedDotEdge__Group_3__0 : rule__UndirectedDotEdge__Group_3__0__Impl rule__UndirectedDotEdge__Group_3__1 ;
    public final void rule__UndirectedDotEdge__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3257:1: ( rule__UndirectedDotEdge__Group_3__0__Impl rule__UndirectedDotEdge__Group_3__1 )
            // InternalDotLanguage.g:3258:2: rule__UndirectedDotEdge__Group_3__0__Impl rule__UndirectedDotEdge__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__UndirectedDotEdge__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__UndirectedDotEdge__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group_3__0"


    // $ANTLR start "rule__UndirectedDotEdge__Group_3__0__Impl"
    // InternalDotLanguage.g:3265:1: rule__UndirectedDotEdge__Group_3__0__Impl : ( '[' ) ;
    public final void rule__UndirectedDotEdge__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3269:1: ( ( '[' ) )
            // InternalDotLanguage.g:3270:1: ( '[' )
            {
            // InternalDotLanguage.g:3270:1: ( '[' )
            // InternalDotLanguage.g:3271:1: '['
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,17,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getUndirectedDotEdgeAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group_3__0__Impl"


    // $ANTLR start "rule__UndirectedDotEdge__Group_3__1"
    // InternalDotLanguage.g:3284:1: rule__UndirectedDotEdge__Group_3__1 : rule__UndirectedDotEdge__Group_3__1__Impl rule__UndirectedDotEdge__Group_3__2 ;
    public final void rule__UndirectedDotEdge__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3288:1: ( rule__UndirectedDotEdge__Group_3__1__Impl rule__UndirectedDotEdge__Group_3__2 )
            // InternalDotLanguage.g:3289:2: rule__UndirectedDotEdge__Group_3__1__Impl rule__UndirectedDotEdge__Group_3__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__UndirectedDotEdge__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__UndirectedDotEdge__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group_3__1"


    // $ANTLR start "rule__UndirectedDotEdge__Group_3__1__Impl"
    // InternalDotLanguage.g:3296:1: rule__UndirectedDotEdge__Group_3__1__Impl : ( ( rule__UndirectedDotEdge__SettingsAssignment_3_1 ) ) ;
    public final void rule__UndirectedDotEdge__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3300:1: ( ( ( rule__UndirectedDotEdge__SettingsAssignment_3_1 ) ) )
            // InternalDotLanguage.g:3301:1: ( ( rule__UndirectedDotEdge__SettingsAssignment_3_1 ) )
            {
            // InternalDotLanguage.g:3301:1: ( ( rule__UndirectedDotEdge__SettingsAssignment_3_1 ) )
            // InternalDotLanguage.g:3302:1: ( rule__UndirectedDotEdge__SettingsAssignment_3_1 )
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getSettingsAssignment_3_1()); 
            // InternalDotLanguage.g:3303:1: ( rule__UndirectedDotEdge__SettingsAssignment_3_1 )
            // InternalDotLanguage.g:3303:2: rule__UndirectedDotEdge__SettingsAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UndirectedDotEdge__SettingsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getUndirectedDotEdgeAccess().getSettingsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group_3__1__Impl"


    // $ANTLR start "rule__UndirectedDotEdge__Group_3__2"
    // InternalDotLanguage.g:3313:1: rule__UndirectedDotEdge__Group_3__2 : rule__UndirectedDotEdge__Group_3__2__Impl rule__UndirectedDotEdge__Group_3__3 ;
    public final void rule__UndirectedDotEdge__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3317:1: ( rule__UndirectedDotEdge__Group_3__2__Impl rule__UndirectedDotEdge__Group_3__3 )
            // InternalDotLanguage.g:3318:2: rule__UndirectedDotEdge__Group_3__2__Impl rule__UndirectedDotEdge__Group_3__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__UndirectedDotEdge__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__UndirectedDotEdge__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group_3__2"


    // $ANTLR start "rule__UndirectedDotEdge__Group_3__2__Impl"
    // InternalDotLanguage.g:3325:1: rule__UndirectedDotEdge__Group_3__2__Impl : ( ( rule__UndirectedDotEdge__Group_3_2__0 )* ) ;
    public final void rule__UndirectedDotEdge__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3329:1: ( ( ( rule__UndirectedDotEdge__Group_3_2__0 )* ) )
            // InternalDotLanguage.g:3330:1: ( ( rule__UndirectedDotEdge__Group_3_2__0 )* )
            {
            // InternalDotLanguage.g:3330:1: ( ( rule__UndirectedDotEdge__Group_3_2__0 )* )
            // InternalDotLanguage.g:3331:1: ( rule__UndirectedDotEdge__Group_3_2__0 )*
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getGroup_3_2()); 
            // InternalDotLanguage.g:3332:1: ( rule__UndirectedDotEdge__Group_3_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==20) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDotLanguage.g:3332:2: rule__UndirectedDotEdge__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__UndirectedDotEdge__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getUndirectedDotEdgeAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group_3__2__Impl"


    // $ANTLR start "rule__UndirectedDotEdge__Group_3__3"
    // InternalDotLanguage.g:3342:1: rule__UndirectedDotEdge__Group_3__3 : rule__UndirectedDotEdge__Group_3__3__Impl ;
    public final void rule__UndirectedDotEdge__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3346:1: ( rule__UndirectedDotEdge__Group_3__3__Impl )
            // InternalDotLanguage.g:3347:2: rule__UndirectedDotEdge__Group_3__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UndirectedDotEdge__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group_3__3"


    // $ANTLR start "rule__UndirectedDotEdge__Group_3__3__Impl"
    // InternalDotLanguage.g:3353:1: rule__UndirectedDotEdge__Group_3__3__Impl : ( ']' ) ;
    public final void rule__UndirectedDotEdge__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3357:1: ( ( ']' ) )
            // InternalDotLanguage.g:3358:1: ( ']' )
            {
            // InternalDotLanguage.g:3358:1: ( ']' )
            // InternalDotLanguage.g:3359:1: ']'
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getUndirectedDotEdgeAccess().getRightSquareBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group_3__3__Impl"


    // $ANTLR start "rule__UndirectedDotEdge__Group_3_2__0"
    // InternalDotLanguage.g:3380:1: rule__UndirectedDotEdge__Group_3_2__0 : rule__UndirectedDotEdge__Group_3_2__0__Impl rule__UndirectedDotEdge__Group_3_2__1 ;
    public final void rule__UndirectedDotEdge__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3384:1: ( rule__UndirectedDotEdge__Group_3_2__0__Impl rule__UndirectedDotEdge__Group_3_2__1 )
            // InternalDotLanguage.g:3385:2: rule__UndirectedDotEdge__Group_3_2__0__Impl rule__UndirectedDotEdge__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__UndirectedDotEdge__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__UndirectedDotEdge__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group_3_2__0"


    // $ANTLR start "rule__UndirectedDotEdge__Group_3_2__0__Impl"
    // InternalDotLanguage.g:3392:1: rule__UndirectedDotEdge__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__UndirectedDotEdge__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3396:1: ( ( ',' ) )
            // InternalDotLanguage.g:3397:1: ( ',' )
            {
            // InternalDotLanguage.g:3397:1: ( ',' )
            // InternalDotLanguage.g:3398:1: ','
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getCommaKeyword_3_2_0()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getUndirectedDotEdgeAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group_3_2__0__Impl"


    // $ANTLR start "rule__UndirectedDotEdge__Group_3_2__1"
    // InternalDotLanguage.g:3411:1: rule__UndirectedDotEdge__Group_3_2__1 : rule__UndirectedDotEdge__Group_3_2__1__Impl ;
    public final void rule__UndirectedDotEdge__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3415:1: ( rule__UndirectedDotEdge__Group_3_2__1__Impl )
            // InternalDotLanguage.g:3416:2: rule__UndirectedDotEdge__Group_3_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UndirectedDotEdge__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group_3_2__1"


    // $ANTLR start "rule__UndirectedDotEdge__Group_3_2__1__Impl"
    // InternalDotLanguage.g:3422:1: rule__UndirectedDotEdge__Group_3_2__1__Impl : ( ( rule__UndirectedDotEdge__SettingsAssignment_3_2_1 ) ) ;
    public final void rule__UndirectedDotEdge__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3426:1: ( ( ( rule__UndirectedDotEdge__SettingsAssignment_3_2_1 ) ) )
            // InternalDotLanguage.g:3427:1: ( ( rule__UndirectedDotEdge__SettingsAssignment_3_2_1 ) )
            {
            // InternalDotLanguage.g:3427:1: ( ( rule__UndirectedDotEdge__SettingsAssignment_3_2_1 ) )
            // InternalDotLanguage.g:3428:1: ( rule__UndirectedDotEdge__SettingsAssignment_3_2_1 )
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getSettingsAssignment_3_2_1()); 
            // InternalDotLanguage.g:3429:1: ( rule__UndirectedDotEdge__SettingsAssignment_3_2_1 )
            // InternalDotLanguage.g:3429:2: rule__UndirectedDotEdge__SettingsAssignment_3_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UndirectedDotEdge__SettingsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getUndirectedDotEdgeAccess().getSettingsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__Group_3_2__1__Impl"


    // $ANTLR start "rule__Setting__Group__0"
    // InternalDotLanguage.g:3443:1: rule__Setting__Group__0 : rule__Setting__Group__0__Impl rule__Setting__Group__1 ;
    public final void rule__Setting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3447:1: ( rule__Setting__Group__0__Impl rule__Setting__Group__1 )
            // InternalDotLanguage.g:3448:2: rule__Setting__Group__0__Impl rule__Setting__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__Setting__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:3455:1: rule__Setting__Group__0__Impl : ( ( rule__Setting__AttributeAssignment_0 ) ) ;
    public final void rule__Setting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3459:1: ( ( ( rule__Setting__AttributeAssignment_0 ) ) )
            // InternalDotLanguage.g:3460:1: ( ( rule__Setting__AttributeAssignment_0 ) )
            {
            // InternalDotLanguage.g:3460:1: ( ( rule__Setting__AttributeAssignment_0 ) )
            // InternalDotLanguage.g:3461:1: ( rule__Setting__AttributeAssignment_0 )
            {
             before(grammarAccess.getSettingAccess().getAttributeAssignment_0()); 
            // InternalDotLanguage.g:3462:1: ( rule__Setting__AttributeAssignment_0 )
            // InternalDotLanguage.g:3462:2: rule__Setting__AttributeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:3472:1: rule__Setting__Group__1 : rule__Setting__Group__1__Impl rule__Setting__Group__2 ;
    public final void rule__Setting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3476:1: ( rule__Setting__Group__1__Impl rule__Setting__Group__2 )
            // InternalDotLanguage.g:3477:2: rule__Setting__Group__1__Impl rule__Setting__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Setting__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:3484:1: rule__Setting__Group__1__Impl : ( '=' ) ;
    public final void rule__Setting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3488:1: ( ( '=' ) )
            // InternalDotLanguage.g:3489:1: ( '=' )
            {
            // InternalDotLanguage.g:3489:1: ( '=' )
            // InternalDotLanguage.g:3490:1: '='
            {
             before(grammarAccess.getSettingAccess().getEqualsSignKeyword_1()); 
            match(input,26,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:3503:1: rule__Setting__Group__2 : rule__Setting__Group__2__Impl ;
    public final void rule__Setting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3507:1: ( rule__Setting__Group__2__Impl )
            // InternalDotLanguage.g:3508:2: rule__Setting__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:3514:1: rule__Setting__Group__2__Impl : ( ( rule__Setting__ValueAssignment_2 ) ) ;
    public final void rule__Setting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3518:1: ( ( ( rule__Setting__ValueAssignment_2 ) ) )
            // InternalDotLanguage.g:3519:1: ( ( rule__Setting__ValueAssignment_2 ) )
            {
            // InternalDotLanguage.g:3519:1: ( ( rule__Setting__ValueAssignment_2 ) )
            // InternalDotLanguage.g:3520:1: ( rule__Setting__ValueAssignment_2 )
            {
             before(grammarAccess.getSettingAccess().getValueAssignment_2()); 
            // InternalDotLanguage.g:3521:1: ( rule__Setting__ValueAssignment_2 )
            // InternalDotLanguage.g:3521:2: rule__Setting__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:3537:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3541:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalDotLanguage.g:3542:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:3549:1: rule__Number__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3553:1: ( ( ( '-' )? ) )
            // InternalDotLanguage.g:3554:1: ( ( '-' )? )
            {
            // InternalDotLanguage.g:3554:1: ( ( '-' )? )
            // InternalDotLanguage.g:3555:1: ( '-' )?
            {
             before(grammarAccess.getNumberAccess().getHyphenMinusKeyword_0()); 
            // InternalDotLanguage.g:3556:1: ( '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDotLanguage.g:3557:2: '-'
                    {
                    match(input,27,FollowSets000.FOLLOW_2); 

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
    // InternalDotLanguage.g:3568:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3572:1: ( rule__Number__Group__1__Impl )
            // InternalDotLanguage.g:3573:2: rule__Number__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:3579:1: rule__Number__Group__1__Impl : ( ( rule__Number__Alternatives_1 ) ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3583:1: ( ( ( rule__Number__Alternatives_1 ) ) )
            // InternalDotLanguage.g:3584:1: ( ( rule__Number__Alternatives_1 ) )
            {
            // InternalDotLanguage.g:3584:1: ( ( rule__Number__Alternatives_1 ) )
            // InternalDotLanguage.g:3585:1: ( rule__Number__Alternatives_1 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_1()); 
            // InternalDotLanguage.g:3586:1: ( rule__Number__Alternatives_1 )
            // InternalDotLanguage.g:3586:2: rule__Number__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "rule__DotGraph__DirectedGraphAssignment_1_0"
    // InternalDotLanguage.g:3601:1: rule__DotGraph__DirectedGraphAssignment_1_0 : ( ( 'digraph' ) ) ;
    public final void rule__DotGraph__DirectedGraphAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3605:1: ( ( ( 'digraph' ) ) )
            // InternalDotLanguage.g:3606:1: ( ( 'digraph' ) )
            {
            // InternalDotLanguage.g:3606:1: ( ( 'digraph' ) )
            // InternalDotLanguage.g:3607:1: ( 'digraph' )
            {
             before(grammarAccess.getDotGraphAccess().getDirectedGraphDigraphKeyword_1_0_0()); 
            // InternalDotLanguage.g:3608:1: ( 'digraph' )
            // InternalDotLanguage.g:3609:1: 'digraph'
            {
             before(grammarAccess.getDotGraphAccess().getDirectedGraphDigraphKeyword_1_0_0()); 
            match(input,28,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDotGraphAccess().getDirectedGraphDigraphKeyword_1_0_0()); 

            }

             after(grammarAccess.getDotGraphAccess().getDirectedGraphDigraphKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__DirectedGraphAssignment_1_0"


    // $ANTLR start "rule__DotGraph__IdAssignment_2"
    // InternalDotLanguage.g:3624:1: rule__DotGraph__IdAssignment_2 : ( ruleDotGraphID ) ;
    public final void rule__DotGraph__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3628:1: ( ( ruleDotGraphID ) )
            // InternalDotLanguage.g:3629:1: ( ruleDotGraphID )
            {
            // InternalDotLanguage.g:3629:1: ( ruleDotGraphID )
            // InternalDotLanguage.g:3630:1: ruleDotGraphID
            {
             before(grammarAccess.getDotGraphAccess().getIdDotGraphIDParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDotGraphID();

            state._fsp--;

             after(grammarAccess.getDotGraphAccess().getIdDotGraphIDParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__IdAssignment_2"


    // $ANTLR start "rule__DotGraph__GraphSettingsAssignment_4_0_2"
    // InternalDotLanguage.g:3639:1: rule__DotGraph__GraphSettingsAssignment_4_0_2 : ( ruleSetting ) ;
    public final void rule__DotGraph__GraphSettingsAssignment_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3643:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3644:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3644:1: ( ruleSetting )
            // InternalDotLanguage.g:3645:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getGraphSettingsSettingParserRuleCall_4_0_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotGraphAccess().getGraphSettingsSettingParserRuleCall_4_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__GraphSettingsAssignment_4_0_2"


    // $ANTLR start "rule__DotGraph__GraphSettingsAssignment_4_0_3_1"
    // InternalDotLanguage.g:3654:1: rule__DotGraph__GraphSettingsAssignment_4_0_3_1 : ( ruleSetting ) ;
    public final void rule__DotGraph__GraphSettingsAssignment_4_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3658:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3659:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3659:1: ( ruleSetting )
            // InternalDotLanguage.g:3660:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getGraphSettingsSettingParserRuleCall_4_0_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotGraphAccess().getGraphSettingsSettingParserRuleCall_4_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__GraphSettingsAssignment_4_0_3_1"


    // $ANTLR start "rule__DotGraph__NodeSettingsAssignment_4_1_2"
    // InternalDotLanguage.g:3669:1: rule__DotGraph__NodeSettingsAssignment_4_1_2 : ( ruleSetting ) ;
    public final void rule__DotGraph__NodeSettingsAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3673:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3674:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3674:1: ( ruleSetting )
            // InternalDotLanguage.g:3675:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getNodeSettingsSettingParserRuleCall_4_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotGraphAccess().getNodeSettingsSettingParserRuleCall_4_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__NodeSettingsAssignment_4_1_2"


    // $ANTLR start "rule__DotGraph__NodeSettingsAssignment_4_1_3_1"
    // InternalDotLanguage.g:3684:1: rule__DotGraph__NodeSettingsAssignment_4_1_3_1 : ( ruleSetting ) ;
    public final void rule__DotGraph__NodeSettingsAssignment_4_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3688:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3689:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3689:1: ( ruleSetting )
            // InternalDotLanguage.g:3690:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getNodeSettingsSettingParserRuleCall_4_1_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotGraphAccess().getNodeSettingsSettingParserRuleCall_4_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__NodeSettingsAssignment_4_1_3_1"


    // $ANTLR start "rule__DotGraph__EdgeSettingsAssignment_4_2_2"
    // InternalDotLanguage.g:3699:1: rule__DotGraph__EdgeSettingsAssignment_4_2_2 : ( ruleSetting ) ;
    public final void rule__DotGraph__EdgeSettingsAssignment_4_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3703:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3704:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3704:1: ( ruleSetting )
            // InternalDotLanguage.g:3705:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getEdgeSettingsSettingParserRuleCall_4_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotGraphAccess().getEdgeSettingsSettingParserRuleCall_4_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__EdgeSettingsAssignment_4_2_2"


    // $ANTLR start "rule__DotGraph__EdgeSettingsAssignment_4_2_3_1"
    // InternalDotLanguage.g:3714:1: rule__DotGraph__EdgeSettingsAssignment_4_2_3_1 : ( ruleSetting ) ;
    public final void rule__DotGraph__EdgeSettingsAssignment_4_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3718:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3719:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3719:1: ( ruleSetting )
            // InternalDotLanguage.g:3720:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getEdgeSettingsSettingParserRuleCall_4_2_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotGraphAccess().getEdgeSettingsSettingParserRuleCall_4_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__EdgeSettingsAssignment_4_2_3_1"


    // $ANTLR start "rule__DotGraph__SubgraphsAssignment_4_3"
    // InternalDotLanguage.g:3729:1: rule__DotGraph__SubgraphsAssignment_4_3 : ( ruleDotSubGraph ) ;
    public final void rule__DotGraph__SubgraphsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3733:1: ( ( ruleDotSubGraph ) )
            // InternalDotLanguage.g:3734:1: ( ruleDotSubGraph )
            {
            // InternalDotLanguage.g:3734:1: ( ruleDotSubGraph )
            // InternalDotLanguage.g:3735:1: ruleDotSubGraph
            {
             before(grammarAccess.getDotGraphAccess().getSubgraphsDotSubGraphParserRuleCall_4_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDotSubGraph();

            state._fsp--;

             after(grammarAccess.getDotGraphAccess().getSubgraphsDotSubGraphParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__SubgraphsAssignment_4_3"


    // $ANTLR start "rule__DotGraph__NodesAssignment_4_4"
    // InternalDotLanguage.g:3744:1: rule__DotGraph__NodesAssignment_4_4 : ( ruleDotNode ) ;
    public final void rule__DotGraph__NodesAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3748:1: ( ( ruleDotNode ) )
            // InternalDotLanguage.g:3749:1: ( ruleDotNode )
            {
            // InternalDotLanguage.g:3749:1: ( ruleDotNode )
            // InternalDotLanguage.g:3750:1: ruleDotNode
            {
             before(grammarAccess.getDotGraphAccess().getNodesDotNodeParserRuleCall_4_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDotNode();

            state._fsp--;

             after(grammarAccess.getDotGraphAccess().getNodesDotNodeParserRuleCall_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__NodesAssignment_4_4"


    // $ANTLR start "rule__DotGraph__EdgesAssignment_4_5"
    // InternalDotLanguage.g:3759:1: rule__DotGraph__EdgesAssignment_4_5 : ( ruleDotEdge ) ;
    public final void rule__DotGraph__EdgesAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3763:1: ( ( ruleDotEdge ) )
            // InternalDotLanguage.g:3764:1: ( ruleDotEdge )
            {
            // InternalDotLanguage.g:3764:1: ( ruleDotEdge )
            // InternalDotLanguage.g:3765:1: ruleDotEdge
            {
             before(grammarAccess.getDotGraphAccess().getEdgesDotEdgeParserRuleCall_4_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDotEdge();

            state._fsp--;

             after(grammarAccess.getDotGraphAccess().getEdgesDotEdgeParserRuleCall_4_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotGraph__EdgesAssignment_4_5"


    // $ANTLR start "rule__DotSubGraph__IdAssignment_2"
    // InternalDotLanguage.g:3774:1: rule__DotSubGraph__IdAssignment_2 : ( ruleDotGraphID ) ;
    public final void rule__DotSubGraph__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3778:1: ( ( ruleDotGraphID ) )
            // InternalDotLanguage.g:3779:1: ( ruleDotGraphID )
            {
            // InternalDotLanguage.g:3779:1: ( ruleDotGraphID )
            // InternalDotLanguage.g:3780:1: ruleDotGraphID
            {
             before(grammarAccess.getDotSubGraphAccess().getIdDotGraphIDParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDotGraphID();

            state._fsp--;

             after(grammarAccess.getDotSubGraphAccess().getIdDotGraphIDParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__IdAssignment_2"


    // $ANTLR start "rule__DotSubGraph__GraphSettingsAssignment_4_0_2"
    // InternalDotLanguage.g:3789:1: rule__DotSubGraph__GraphSettingsAssignment_4_0_2 : ( ruleSetting ) ;
    public final void rule__DotSubGraph__GraphSettingsAssignment_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3793:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3794:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3794:1: ( ruleSetting )
            // InternalDotLanguage.g:3795:1: ruleSetting
            {
             before(grammarAccess.getDotSubGraphAccess().getGraphSettingsSettingParserRuleCall_4_0_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotSubGraphAccess().getGraphSettingsSettingParserRuleCall_4_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__GraphSettingsAssignment_4_0_2"


    // $ANTLR start "rule__DotSubGraph__GraphSettingsAssignment_4_0_3_1"
    // InternalDotLanguage.g:3804:1: rule__DotSubGraph__GraphSettingsAssignment_4_0_3_1 : ( ruleSetting ) ;
    public final void rule__DotSubGraph__GraphSettingsAssignment_4_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3808:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3809:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3809:1: ( ruleSetting )
            // InternalDotLanguage.g:3810:1: ruleSetting
            {
             before(grammarAccess.getDotSubGraphAccess().getGraphSettingsSettingParserRuleCall_4_0_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotSubGraphAccess().getGraphSettingsSettingParserRuleCall_4_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__GraphSettingsAssignment_4_0_3_1"


    // $ANTLR start "rule__DotSubGraph__NodeSettingsAssignment_4_1_2"
    // InternalDotLanguage.g:3819:1: rule__DotSubGraph__NodeSettingsAssignment_4_1_2 : ( ruleSetting ) ;
    public final void rule__DotSubGraph__NodeSettingsAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3823:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3824:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3824:1: ( ruleSetting )
            // InternalDotLanguage.g:3825:1: ruleSetting
            {
             before(grammarAccess.getDotSubGraphAccess().getNodeSettingsSettingParserRuleCall_4_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotSubGraphAccess().getNodeSettingsSettingParserRuleCall_4_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__NodeSettingsAssignment_4_1_2"


    // $ANTLR start "rule__DotSubGraph__NodeSettingsAssignment_4_1_3_1"
    // InternalDotLanguage.g:3834:1: rule__DotSubGraph__NodeSettingsAssignment_4_1_3_1 : ( ruleSetting ) ;
    public final void rule__DotSubGraph__NodeSettingsAssignment_4_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3838:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3839:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3839:1: ( ruleSetting )
            // InternalDotLanguage.g:3840:1: ruleSetting
            {
             before(grammarAccess.getDotSubGraphAccess().getNodeSettingsSettingParserRuleCall_4_1_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotSubGraphAccess().getNodeSettingsSettingParserRuleCall_4_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__NodeSettingsAssignment_4_1_3_1"


    // $ANTLR start "rule__DotSubGraph__EdgeSettingsAssignment_4_2_2"
    // InternalDotLanguage.g:3849:1: rule__DotSubGraph__EdgeSettingsAssignment_4_2_2 : ( ruleSetting ) ;
    public final void rule__DotSubGraph__EdgeSettingsAssignment_4_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3853:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3854:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3854:1: ( ruleSetting )
            // InternalDotLanguage.g:3855:1: ruleSetting
            {
             before(grammarAccess.getDotSubGraphAccess().getEdgeSettingsSettingParserRuleCall_4_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotSubGraphAccess().getEdgeSettingsSettingParserRuleCall_4_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__EdgeSettingsAssignment_4_2_2"


    // $ANTLR start "rule__DotSubGraph__EdgeSettingsAssignment_4_2_3_1"
    // InternalDotLanguage.g:3864:1: rule__DotSubGraph__EdgeSettingsAssignment_4_2_3_1 : ( ruleSetting ) ;
    public final void rule__DotSubGraph__EdgeSettingsAssignment_4_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3868:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3869:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3869:1: ( ruleSetting )
            // InternalDotLanguage.g:3870:1: ruleSetting
            {
             before(grammarAccess.getDotSubGraphAccess().getEdgeSettingsSettingParserRuleCall_4_2_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDotSubGraphAccess().getEdgeSettingsSettingParserRuleCall_4_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__EdgeSettingsAssignment_4_2_3_1"


    // $ANTLR start "rule__DotSubGraph__SubgraphsAssignment_4_3"
    // InternalDotLanguage.g:3879:1: rule__DotSubGraph__SubgraphsAssignment_4_3 : ( ruleDotSubGraph ) ;
    public final void rule__DotSubGraph__SubgraphsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3883:1: ( ( ruleDotSubGraph ) )
            // InternalDotLanguage.g:3884:1: ( ruleDotSubGraph )
            {
            // InternalDotLanguage.g:3884:1: ( ruleDotSubGraph )
            // InternalDotLanguage.g:3885:1: ruleDotSubGraph
            {
             before(grammarAccess.getDotSubGraphAccess().getSubgraphsDotSubGraphParserRuleCall_4_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDotSubGraph();

            state._fsp--;

             after(grammarAccess.getDotSubGraphAccess().getSubgraphsDotSubGraphParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__SubgraphsAssignment_4_3"


    // $ANTLR start "rule__DotSubGraph__NodesAssignment_4_4"
    // InternalDotLanguage.g:3894:1: rule__DotSubGraph__NodesAssignment_4_4 : ( ruleDotNode ) ;
    public final void rule__DotSubGraph__NodesAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3898:1: ( ( ruleDotNode ) )
            // InternalDotLanguage.g:3899:1: ( ruleDotNode )
            {
            // InternalDotLanguage.g:3899:1: ( ruleDotNode )
            // InternalDotLanguage.g:3900:1: ruleDotNode
            {
             before(grammarAccess.getDotSubGraphAccess().getNodesDotNodeParserRuleCall_4_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDotNode();

            state._fsp--;

             after(grammarAccess.getDotSubGraphAccess().getNodesDotNodeParserRuleCall_4_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__NodesAssignment_4_4"


    // $ANTLR start "rule__DotSubGraph__EdgesAssignment_4_5"
    // InternalDotLanguage.g:3909:1: rule__DotSubGraph__EdgesAssignment_4_5 : ( ruleDotEdge ) ;
    public final void rule__DotSubGraph__EdgesAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3913:1: ( ( ruleDotEdge ) )
            // InternalDotLanguage.g:3914:1: ( ruleDotEdge )
            {
            // InternalDotLanguage.g:3914:1: ( ruleDotEdge )
            // InternalDotLanguage.g:3915:1: ruleDotEdge
            {
             before(grammarAccess.getDotSubGraphAccess().getEdgesDotEdgeParserRuleCall_4_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDotEdge();

            state._fsp--;

             after(grammarAccess.getDotSubGraphAccess().getEdgesDotEdgeParserRuleCall_4_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DotSubGraph__EdgesAssignment_4_5"


    // $ANTLR start "rule__DotNode__NameAssignment_0"
    // InternalDotLanguage.g:3924:1: rule__DotNode__NameAssignment_0 : ( ruleDotID ) ;
    public final void rule__DotNode__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3928:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:3929:1: ( ruleDotID )
            {
            // InternalDotLanguage.g:3929:1: ( ruleDotID )
            // InternalDotLanguage.g:3930:1: ruleDotID
            {
             before(grammarAccess.getDotNodeAccess().getNameDotIDParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:3939:1: rule__DotNode__SettingsAssignment_1_1 : ( ruleSetting ) ;
    public final void rule__DotNode__SettingsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3943:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3944:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3944:1: ( ruleSetting )
            // InternalDotLanguage.g:3945:1: ruleSetting
            {
             before(grammarAccess.getDotNodeAccess().getSettingsSettingParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:3954:1: rule__DotNode__SettingsAssignment_1_2_1 : ( ruleSetting ) ;
    public final void rule__DotNode__SettingsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3958:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3959:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3959:1: ( ruleSetting )
            // InternalDotLanguage.g:3960:1: ruleSetting
            {
             before(grammarAccess.getDotNodeAccess().getSettingsSettingParserRuleCall_1_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "rule__DirectedDotEdge__SourceAssignment_0"
    // InternalDotLanguage.g:3969:1: rule__DirectedDotEdge__SourceAssignment_0 : ( ( ruleDotID ) ) ;
    public final void rule__DirectedDotEdge__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3973:1: ( ( ( ruleDotID ) ) )
            // InternalDotLanguage.g:3974:1: ( ( ruleDotID ) )
            {
            // InternalDotLanguage.g:3974:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:3975:1: ( ruleDotID )
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getSourceDotNodeCrossReference_0_0()); 
            // InternalDotLanguage.g:3976:1: ( ruleDotID )
            // InternalDotLanguage.g:3977:1: ruleDotID
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getSourceDotNodeDotIDParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDotID();

            state._fsp--;

             after(grammarAccess.getDirectedDotEdgeAccess().getSourceDotNodeDotIDParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDirectedDotEdgeAccess().getSourceDotNodeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__SourceAssignment_0"


    // $ANTLR start "rule__DirectedDotEdge__TargetAssignment_2"
    // InternalDotLanguage.g:3988:1: rule__DirectedDotEdge__TargetAssignment_2 : ( ( ruleDotID ) ) ;
    public final void rule__DirectedDotEdge__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3992:1: ( ( ( ruleDotID ) ) )
            // InternalDotLanguage.g:3993:1: ( ( ruleDotID ) )
            {
            // InternalDotLanguage.g:3993:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:3994:1: ( ruleDotID )
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getTargetDotNodeCrossReference_2_0()); 
            // InternalDotLanguage.g:3995:1: ( ruleDotID )
            // InternalDotLanguage.g:3996:1: ruleDotID
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getTargetDotNodeDotIDParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDotID();

            state._fsp--;

             after(grammarAccess.getDirectedDotEdgeAccess().getTargetDotNodeDotIDParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDirectedDotEdgeAccess().getTargetDotNodeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__TargetAssignment_2"


    // $ANTLR start "rule__DirectedDotEdge__SettingsAssignment_3_1"
    // InternalDotLanguage.g:4007:1: rule__DirectedDotEdge__SettingsAssignment_3_1 : ( ruleSetting ) ;
    public final void rule__DirectedDotEdge__SettingsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:4011:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:4012:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:4012:1: ( ruleSetting )
            // InternalDotLanguage.g:4013:1: ruleSetting
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getSettingsSettingParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDirectedDotEdgeAccess().getSettingsSettingParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__SettingsAssignment_3_1"


    // $ANTLR start "rule__DirectedDotEdge__SettingsAssignment_3_2_1"
    // InternalDotLanguage.g:4022:1: rule__DirectedDotEdge__SettingsAssignment_3_2_1 : ( ruleSetting ) ;
    public final void rule__DirectedDotEdge__SettingsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:4026:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:4027:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:4027:1: ( ruleSetting )
            // InternalDotLanguage.g:4028:1: ruleSetting
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getSettingsSettingParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getDirectedDotEdgeAccess().getSettingsSettingParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedDotEdge__SettingsAssignment_3_2_1"


    // $ANTLR start "rule__UndirectedDotEdge__SourceAssignment_0"
    // InternalDotLanguage.g:4037:1: rule__UndirectedDotEdge__SourceAssignment_0 : ( ( ruleDotID ) ) ;
    public final void rule__UndirectedDotEdge__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:4041:1: ( ( ( ruleDotID ) ) )
            // InternalDotLanguage.g:4042:1: ( ( ruleDotID ) )
            {
            // InternalDotLanguage.g:4042:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:4043:1: ( ruleDotID )
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getSourceDotNodeCrossReference_0_0()); 
            // InternalDotLanguage.g:4044:1: ( ruleDotID )
            // InternalDotLanguage.g:4045:1: ruleDotID
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getSourceDotNodeDotIDParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDotID();

            state._fsp--;

             after(grammarAccess.getUndirectedDotEdgeAccess().getSourceDotNodeDotIDParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getUndirectedDotEdgeAccess().getSourceDotNodeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__SourceAssignment_0"


    // $ANTLR start "rule__UndirectedDotEdge__TargetAssignment_2"
    // InternalDotLanguage.g:4056:1: rule__UndirectedDotEdge__TargetAssignment_2 : ( ( ruleDotID ) ) ;
    public final void rule__UndirectedDotEdge__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:4060:1: ( ( ( ruleDotID ) ) )
            // InternalDotLanguage.g:4061:1: ( ( ruleDotID ) )
            {
            // InternalDotLanguage.g:4061:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:4062:1: ( ruleDotID )
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getTargetDotNodeCrossReference_2_0()); 
            // InternalDotLanguage.g:4063:1: ( ruleDotID )
            // InternalDotLanguage.g:4064:1: ruleDotID
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getTargetDotNodeDotIDParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDotID();

            state._fsp--;

             after(grammarAccess.getUndirectedDotEdgeAccess().getTargetDotNodeDotIDParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getUndirectedDotEdgeAccess().getTargetDotNodeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__TargetAssignment_2"


    // $ANTLR start "rule__UndirectedDotEdge__SettingsAssignment_3_1"
    // InternalDotLanguage.g:4075:1: rule__UndirectedDotEdge__SettingsAssignment_3_1 : ( ruleSetting ) ;
    public final void rule__UndirectedDotEdge__SettingsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:4079:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:4080:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:4080:1: ( ruleSetting )
            // InternalDotLanguage.g:4081:1: ruleSetting
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getSettingsSettingParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getUndirectedDotEdgeAccess().getSettingsSettingParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__SettingsAssignment_3_1"


    // $ANTLR start "rule__UndirectedDotEdge__SettingsAssignment_3_2_1"
    // InternalDotLanguage.g:4090:1: rule__UndirectedDotEdge__SettingsAssignment_3_2_1 : ( ruleSetting ) ;
    public final void rule__UndirectedDotEdge__SettingsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:4094:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:4095:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:4095:1: ( ruleSetting )
            // InternalDotLanguage.g:4096:1: ruleSetting
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getSettingsSettingParserRuleCall_3_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getUndirectedDotEdgeAccess().getSettingsSettingParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UndirectedDotEdge__SettingsAssignment_3_2_1"


    // $ANTLR start "rule__Setting__AttributeAssignment_0"
    // InternalDotLanguage.g:4105:1: rule__Setting__AttributeAssignment_0 : ( ruleDotID ) ;
    public final void rule__Setting__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:4109:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:4110:1: ( ruleDotID )
            {
            // InternalDotLanguage.g:4110:1: ( ruleDotID )
            // InternalDotLanguage.g:4111:1: ruleDotID
            {
             before(grammarAccess.getSettingAccess().getAttributeDotIDParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:4120:1: rule__Setting__ValueAssignment_2 : ( ruleDotID ) ;
    public final void rule__Setting__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:4124:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:4125:1: ( ruleDotID )
            {
            // InternalDotLanguage.g:4125:1: ( ruleDotID )
            // InternalDotLanguage.g:4126:1: ruleDotID
            {
             before(grammarAccess.getSettingAccess().getValueDotIDParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\1\4\4\uffff\2\4\1\7\3\4\2\uffff";
    static final String dfa_3s = "\1\33\4\uffff\2\33\1\10\3\33\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\6\uffff\1\5\1\6";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\6\1\12\1\10\1\11\5\uffff\1\1\6\uffff\1\2\1\3\1\4\3\uffff\1\7",
            "",
            "",
            "",
            "",
            "\5\13\5\uffff\1\13\1\uffff\2\13\1\uffff\1\13\1\uffff\3\13\2\14\1\uffff\1\13",
            "\5\13\5\uffff\1\13\1\uffff\2\13\1\uffff\1\13\1\uffff\3\13\2\14\1\uffff\1\13",
            "\1\10\1\11",
            "\5\13\5\uffff\1\13\1\uffff\2\13\1\uffff\1\13\1\uffff\3\13\2\14\1\uffff\1\13",
            "\5\13\5\uffff\1\13\1\uffff\2\13\1\uffff\1\13\1\uffff\3\13\2\14\1\uffff\1\13",
            "\5\13\5\uffff\1\13\1\uffff\2\13\1\uffff\1\13\1\uffff\3\13\2\14\1\uffff\1\13",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "364:1: rule__DotGraph__Alternatives_4 : ( ( ( rule__DotGraph__Group_4_0__0 ) ) | ( ( rule__DotGraph__Group_4_1__0 ) ) | ( ( rule__DotGraph__Group_4_2__0 ) ) | ( ( rule__DotGraph__SubgraphsAssignment_4_3 ) ) | ( ( rule__DotGraph__NodesAssignment_4_4 ) ) | ( ( rule__DotGraph__EdgesAssignment_4_5 ) ) );";
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "410:1: rule__DotSubGraph__Alternatives_4 : ( ( ( rule__DotSubGraph__Group_4_0__0 ) ) | ( ( rule__DotSubGraph__Group_4_1__0 ) ) | ( ( rule__DotSubGraph__Group_4_2__0 ) ) | ( ( rule__DotSubGraph__SubgraphsAssignment_4_3 ) ) | ( ( rule__DotSubGraph__NodesAssignment_4_4 ) ) | ( ( rule__DotSubGraph__EdgesAssignment_4_5 ) ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010004000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000080081F0L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000008E141F0L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000008E041F2L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000080001F0L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008E041F0L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000180L});
    }


}