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

                if ( (LA4_1==24) ) {
                    alt4=1;
                }
                else if ( (LA4_1==25) ) {
                    alt4=2;
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
            pushFollow(FollowSets000.FOLLOW_5);
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
            pushFollow(FollowSets000.FOLLOW_5);
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
    // InternalDotLanguage.g:1629:1: rule__DotSubGraph__Group__4__Impl : ( ( rule__DotSubGraph__Alternatives_4 )* ) ;
    public final void rule__DotSubGraph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1633:1: ( ( ( rule__DotSubGraph__Alternatives_4 )* ) )
            // InternalDotLanguage.g:1634:1: ( ( rule__DotSubGraph__Alternatives_4 )* )
            {
            // InternalDotLanguage.g:1634:1: ( ( rule__DotSubGraph__Alternatives_4 )* )
            // InternalDotLanguage.g:1635:1: ( rule__DotSubGraph__Alternatives_4 )*
            {
             before(grammarAccess.getDotSubGraphAccess().getAlternatives_4()); 
            // InternalDotLanguage.g:1636:1: ( rule__DotSubGraph__Alternatives_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_DOTSTRINGTERM && LA16_0<=RULE_INT)||LA16_0==14||(LA16_0>=21 && LA16_0<=23)||LA16_0==27) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDotLanguage.g:1636:2: rule__DotSubGraph__Alternatives_4
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
    // InternalDotLanguage.g:1646:1: rule__DotSubGraph__Group__5 : rule__DotSubGraph__Group__5__Impl ;
    public final void rule__DotSubGraph__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1650:1: ( rule__DotSubGraph__Group__5__Impl )
            // InternalDotLanguage.g:1651:2: rule__DotSubGraph__Group__5__Impl
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
    // InternalDotLanguage.g:1657:1: rule__DotSubGraph__Group__5__Impl : ( '}' ) ;
    public final void rule__DotSubGraph__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1661:1: ( ( '}' ) )
            // InternalDotLanguage.g:1662:1: ( '}' )
            {
            // InternalDotLanguage.g:1662:1: ( '}' )
            // InternalDotLanguage.g:1663:1: '}'
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
    // InternalDotLanguage.g:1688:1: rule__DotSubGraph__Group_4_0__0 : rule__DotSubGraph__Group_4_0__0__Impl rule__DotSubGraph__Group_4_0__1 ;
    public final void rule__DotSubGraph__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1692:1: ( rule__DotSubGraph__Group_4_0__0__Impl rule__DotSubGraph__Group_4_0__1 )
            // InternalDotLanguage.g:1693:2: rule__DotSubGraph__Group_4_0__0__Impl rule__DotSubGraph__Group_4_0__1
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
    // InternalDotLanguage.g:1700:1: rule__DotSubGraph__Group_4_0__0__Impl : ( 'graph' ) ;
    public final void rule__DotSubGraph__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1704:1: ( ( 'graph' ) )
            // InternalDotLanguage.g:1705:1: ( 'graph' )
            {
            // InternalDotLanguage.g:1705:1: ( 'graph' )
            // InternalDotLanguage.g:1706:1: 'graph'
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
    // InternalDotLanguage.g:1719:1: rule__DotSubGraph__Group_4_0__1 : rule__DotSubGraph__Group_4_0__1__Impl rule__DotSubGraph__Group_4_0__2 ;
    public final void rule__DotSubGraph__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1723:1: ( rule__DotSubGraph__Group_4_0__1__Impl rule__DotSubGraph__Group_4_0__2 )
            // InternalDotLanguage.g:1724:2: rule__DotSubGraph__Group_4_0__1__Impl rule__DotSubGraph__Group_4_0__2
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
    // InternalDotLanguage.g:1731:1: rule__DotSubGraph__Group_4_0__1__Impl : ( '[' ) ;
    public final void rule__DotSubGraph__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1735:1: ( ( '[' ) )
            // InternalDotLanguage.g:1736:1: ( '[' )
            {
            // InternalDotLanguage.g:1736:1: ( '[' )
            // InternalDotLanguage.g:1737:1: '['
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
    // InternalDotLanguage.g:1750:1: rule__DotSubGraph__Group_4_0__2 : rule__DotSubGraph__Group_4_0__2__Impl rule__DotSubGraph__Group_4_0__3 ;
    public final void rule__DotSubGraph__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1754:1: ( rule__DotSubGraph__Group_4_0__2__Impl rule__DotSubGraph__Group_4_0__3 )
            // InternalDotLanguage.g:1755:2: rule__DotSubGraph__Group_4_0__2__Impl rule__DotSubGraph__Group_4_0__3
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
    // InternalDotLanguage.g:1762:1: rule__DotSubGraph__Group_4_0__2__Impl : ( ( rule__DotSubGraph__GraphSettingsAssignment_4_0_2 ) ) ;
    public final void rule__DotSubGraph__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1766:1: ( ( ( rule__DotSubGraph__GraphSettingsAssignment_4_0_2 ) ) )
            // InternalDotLanguage.g:1767:1: ( ( rule__DotSubGraph__GraphSettingsAssignment_4_0_2 ) )
            {
            // InternalDotLanguage.g:1767:1: ( ( rule__DotSubGraph__GraphSettingsAssignment_4_0_2 ) )
            // InternalDotLanguage.g:1768:1: ( rule__DotSubGraph__GraphSettingsAssignment_4_0_2 )
            {
             before(grammarAccess.getDotSubGraphAccess().getGraphSettingsAssignment_4_0_2()); 
            // InternalDotLanguage.g:1769:1: ( rule__DotSubGraph__GraphSettingsAssignment_4_0_2 )
            // InternalDotLanguage.g:1769:2: rule__DotSubGraph__GraphSettingsAssignment_4_0_2
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
    // InternalDotLanguage.g:1779:1: rule__DotSubGraph__Group_4_0__3 : rule__DotSubGraph__Group_4_0__3__Impl rule__DotSubGraph__Group_4_0__4 ;
    public final void rule__DotSubGraph__Group_4_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1783:1: ( rule__DotSubGraph__Group_4_0__3__Impl rule__DotSubGraph__Group_4_0__4 )
            // InternalDotLanguage.g:1784:2: rule__DotSubGraph__Group_4_0__3__Impl rule__DotSubGraph__Group_4_0__4
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
    // InternalDotLanguage.g:1791:1: rule__DotSubGraph__Group_4_0__3__Impl : ( ( rule__DotSubGraph__Group_4_0_3__0 )* ) ;
    public final void rule__DotSubGraph__Group_4_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1795:1: ( ( ( rule__DotSubGraph__Group_4_0_3__0 )* ) )
            // InternalDotLanguage.g:1796:1: ( ( rule__DotSubGraph__Group_4_0_3__0 )* )
            {
            // InternalDotLanguage.g:1796:1: ( ( rule__DotSubGraph__Group_4_0_3__0 )* )
            // InternalDotLanguage.g:1797:1: ( rule__DotSubGraph__Group_4_0_3__0 )*
            {
             before(grammarAccess.getDotSubGraphAccess().getGroup_4_0_3()); 
            // InternalDotLanguage.g:1798:1: ( rule__DotSubGraph__Group_4_0_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDotLanguage.g:1798:2: rule__DotSubGraph__Group_4_0_3__0
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
    // InternalDotLanguage.g:1808:1: rule__DotSubGraph__Group_4_0__4 : rule__DotSubGraph__Group_4_0__4__Impl rule__DotSubGraph__Group_4_0__5 ;
    public final void rule__DotSubGraph__Group_4_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1812:1: ( rule__DotSubGraph__Group_4_0__4__Impl rule__DotSubGraph__Group_4_0__5 )
            // InternalDotLanguage.g:1813:2: rule__DotSubGraph__Group_4_0__4__Impl rule__DotSubGraph__Group_4_0__5
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
    // InternalDotLanguage.g:1820:1: rule__DotSubGraph__Group_4_0__4__Impl : ( ']' ) ;
    public final void rule__DotSubGraph__Group_4_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1824:1: ( ( ']' ) )
            // InternalDotLanguage.g:1825:1: ( ']' )
            {
            // InternalDotLanguage.g:1825:1: ( ']' )
            // InternalDotLanguage.g:1826:1: ']'
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
    // InternalDotLanguage.g:1839:1: rule__DotSubGraph__Group_4_0__5 : rule__DotSubGraph__Group_4_0__5__Impl ;
    public final void rule__DotSubGraph__Group_4_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1843:1: ( rule__DotSubGraph__Group_4_0__5__Impl )
            // InternalDotLanguage.g:1844:2: rule__DotSubGraph__Group_4_0__5__Impl
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
    // InternalDotLanguage.g:1850:1: rule__DotSubGraph__Group_4_0__5__Impl : ( ( ';' )? ) ;
    public final void rule__DotSubGraph__Group_4_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1854:1: ( ( ( ';' )? ) )
            // InternalDotLanguage.g:1855:1: ( ( ';' )? )
            {
            // InternalDotLanguage.g:1855:1: ( ( ';' )? )
            // InternalDotLanguage.g:1856:1: ( ';' )?
            {
             before(grammarAccess.getDotSubGraphAccess().getSemicolonKeyword_4_0_5()); 
            // InternalDotLanguage.g:1857:1: ( ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDotLanguage.g:1858:2: ';'
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
    // InternalDotLanguage.g:1881:1: rule__DotSubGraph__Group_4_0_3__0 : rule__DotSubGraph__Group_4_0_3__0__Impl rule__DotSubGraph__Group_4_0_3__1 ;
    public final void rule__DotSubGraph__Group_4_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1885:1: ( rule__DotSubGraph__Group_4_0_3__0__Impl rule__DotSubGraph__Group_4_0_3__1 )
            // InternalDotLanguage.g:1886:2: rule__DotSubGraph__Group_4_0_3__0__Impl rule__DotSubGraph__Group_4_0_3__1
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
    // InternalDotLanguage.g:1893:1: rule__DotSubGraph__Group_4_0_3__0__Impl : ( ',' ) ;
    public final void rule__DotSubGraph__Group_4_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1897:1: ( ( ',' ) )
            // InternalDotLanguage.g:1898:1: ( ',' )
            {
            // InternalDotLanguage.g:1898:1: ( ',' )
            // InternalDotLanguage.g:1899:1: ','
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
    // InternalDotLanguage.g:1912:1: rule__DotSubGraph__Group_4_0_3__1 : rule__DotSubGraph__Group_4_0_3__1__Impl ;
    public final void rule__DotSubGraph__Group_4_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1916:1: ( rule__DotSubGraph__Group_4_0_3__1__Impl )
            // InternalDotLanguage.g:1917:2: rule__DotSubGraph__Group_4_0_3__1__Impl
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
    // InternalDotLanguage.g:1923:1: rule__DotSubGraph__Group_4_0_3__1__Impl : ( ( rule__DotSubGraph__GraphSettingsAssignment_4_0_3_1 ) ) ;
    public final void rule__DotSubGraph__Group_4_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1927:1: ( ( ( rule__DotSubGraph__GraphSettingsAssignment_4_0_3_1 ) ) )
            // InternalDotLanguage.g:1928:1: ( ( rule__DotSubGraph__GraphSettingsAssignment_4_0_3_1 ) )
            {
            // InternalDotLanguage.g:1928:1: ( ( rule__DotSubGraph__GraphSettingsAssignment_4_0_3_1 ) )
            // InternalDotLanguage.g:1929:1: ( rule__DotSubGraph__GraphSettingsAssignment_4_0_3_1 )
            {
             before(grammarAccess.getDotSubGraphAccess().getGraphSettingsAssignment_4_0_3_1()); 
            // InternalDotLanguage.g:1930:1: ( rule__DotSubGraph__GraphSettingsAssignment_4_0_3_1 )
            // InternalDotLanguage.g:1930:2: rule__DotSubGraph__GraphSettingsAssignment_4_0_3_1
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
    // InternalDotLanguage.g:1944:1: rule__DotSubGraph__Group_4_1__0 : rule__DotSubGraph__Group_4_1__0__Impl rule__DotSubGraph__Group_4_1__1 ;
    public final void rule__DotSubGraph__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1948:1: ( rule__DotSubGraph__Group_4_1__0__Impl rule__DotSubGraph__Group_4_1__1 )
            // InternalDotLanguage.g:1949:2: rule__DotSubGraph__Group_4_1__0__Impl rule__DotSubGraph__Group_4_1__1
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
    // InternalDotLanguage.g:1956:1: rule__DotSubGraph__Group_4_1__0__Impl : ( 'node' ) ;
    public final void rule__DotSubGraph__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1960:1: ( ( 'node' ) )
            // InternalDotLanguage.g:1961:1: ( 'node' )
            {
            // InternalDotLanguage.g:1961:1: ( 'node' )
            // InternalDotLanguage.g:1962:1: 'node'
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
    // InternalDotLanguage.g:1975:1: rule__DotSubGraph__Group_4_1__1 : rule__DotSubGraph__Group_4_1__1__Impl rule__DotSubGraph__Group_4_1__2 ;
    public final void rule__DotSubGraph__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1979:1: ( rule__DotSubGraph__Group_4_1__1__Impl rule__DotSubGraph__Group_4_1__2 )
            // InternalDotLanguage.g:1980:2: rule__DotSubGraph__Group_4_1__1__Impl rule__DotSubGraph__Group_4_1__2
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
    // InternalDotLanguage.g:1987:1: rule__DotSubGraph__Group_4_1__1__Impl : ( '[' ) ;
    public final void rule__DotSubGraph__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1991:1: ( ( '[' ) )
            // InternalDotLanguage.g:1992:1: ( '[' )
            {
            // InternalDotLanguage.g:1992:1: ( '[' )
            // InternalDotLanguage.g:1993:1: '['
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
    // InternalDotLanguage.g:2006:1: rule__DotSubGraph__Group_4_1__2 : rule__DotSubGraph__Group_4_1__2__Impl rule__DotSubGraph__Group_4_1__3 ;
    public final void rule__DotSubGraph__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2010:1: ( rule__DotSubGraph__Group_4_1__2__Impl rule__DotSubGraph__Group_4_1__3 )
            // InternalDotLanguage.g:2011:2: rule__DotSubGraph__Group_4_1__2__Impl rule__DotSubGraph__Group_4_1__3
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
    // InternalDotLanguage.g:2018:1: rule__DotSubGraph__Group_4_1__2__Impl : ( ( rule__DotSubGraph__NodeSettingsAssignment_4_1_2 ) ) ;
    public final void rule__DotSubGraph__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2022:1: ( ( ( rule__DotSubGraph__NodeSettingsAssignment_4_1_2 ) ) )
            // InternalDotLanguage.g:2023:1: ( ( rule__DotSubGraph__NodeSettingsAssignment_4_1_2 ) )
            {
            // InternalDotLanguage.g:2023:1: ( ( rule__DotSubGraph__NodeSettingsAssignment_4_1_2 ) )
            // InternalDotLanguage.g:2024:1: ( rule__DotSubGraph__NodeSettingsAssignment_4_1_2 )
            {
             before(grammarAccess.getDotSubGraphAccess().getNodeSettingsAssignment_4_1_2()); 
            // InternalDotLanguage.g:2025:1: ( rule__DotSubGraph__NodeSettingsAssignment_4_1_2 )
            // InternalDotLanguage.g:2025:2: rule__DotSubGraph__NodeSettingsAssignment_4_1_2
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
    // InternalDotLanguage.g:2035:1: rule__DotSubGraph__Group_4_1__3 : rule__DotSubGraph__Group_4_1__3__Impl rule__DotSubGraph__Group_4_1__4 ;
    public final void rule__DotSubGraph__Group_4_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2039:1: ( rule__DotSubGraph__Group_4_1__3__Impl rule__DotSubGraph__Group_4_1__4 )
            // InternalDotLanguage.g:2040:2: rule__DotSubGraph__Group_4_1__3__Impl rule__DotSubGraph__Group_4_1__4
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
    // InternalDotLanguage.g:2047:1: rule__DotSubGraph__Group_4_1__3__Impl : ( ( rule__DotSubGraph__Group_4_1_3__0 )* ) ;
    public final void rule__DotSubGraph__Group_4_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2051:1: ( ( ( rule__DotSubGraph__Group_4_1_3__0 )* ) )
            // InternalDotLanguage.g:2052:1: ( ( rule__DotSubGraph__Group_4_1_3__0 )* )
            {
            // InternalDotLanguage.g:2052:1: ( ( rule__DotSubGraph__Group_4_1_3__0 )* )
            // InternalDotLanguage.g:2053:1: ( rule__DotSubGraph__Group_4_1_3__0 )*
            {
             before(grammarAccess.getDotSubGraphAccess().getGroup_4_1_3()); 
            // InternalDotLanguage.g:2054:1: ( rule__DotSubGraph__Group_4_1_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDotLanguage.g:2054:2: rule__DotSubGraph__Group_4_1_3__0
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
    // InternalDotLanguage.g:2064:1: rule__DotSubGraph__Group_4_1__4 : rule__DotSubGraph__Group_4_1__4__Impl rule__DotSubGraph__Group_4_1__5 ;
    public final void rule__DotSubGraph__Group_4_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2068:1: ( rule__DotSubGraph__Group_4_1__4__Impl rule__DotSubGraph__Group_4_1__5 )
            // InternalDotLanguage.g:2069:2: rule__DotSubGraph__Group_4_1__4__Impl rule__DotSubGraph__Group_4_1__5
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
    // InternalDotLanguage.g:2076:1: rule__DotSubGraph__Group_4_1__4__Impl : ( ']' ) ;
    public final void rule__DotSubGraph__Group_4_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2080:1: ( ( ']' ) )
            // InternalDotLanguage.g:2081:1: ( ']' )
            {
            // InternalDotLanguage.g:2081:1: ( ']' )
            // InternalDotLanguage.g:2082:1: ']'
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
    // InternalDotLanguage.g:2095:1: rule__DotSubGraph__Group_4_1__5 : rule__DotSubGraph__Group_4_1__5__Impl ;
    public final void rule__DotSubGraph__Group_4_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2099:1: ( rule__DotSubGraph__Group_4_1__5__Impl )
            // InternalDotLanguage.g:2100:2: rule__DotSubGraph__Group_4_1__5__Impl
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
    // InternalDotLanguage.g:2106:1: rule__DotSubGraph__Group_4_1__5__Impl : ( ( ';' )? ) ;
    public final void rule__DotSubGraph__Group_4_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2110:1: ( ( ( ';' )? ) )
            // InternalDotLanguage.g:2111:1: ( ( ';' )? )
            {
            // InternalDotLanguage.g:2111:1: ( ( ';' )? )
            // InternalDotLanguage.g:2112:1: ( ';' )?
            {
             before(grammarAccess.getDotSubGraphAccess().getSemicolonKeyword_4_1_5()); 
            // InternalDotLanguage.g:2113:1: ( ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDotLanguage.g:2114:2: ';'
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
    // InternalDotLanguage.g:2137:1: rule__DotSubGraph__Group_4_1_3__0 : rule__DotSubGraph__Group_4_1_3__0__Impl rule__DotSubGraph__Group_4_1_3__1 ;
    public final void rule__DotSubGraph__Group_4_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2141:1: ( rule__DotSubGraph__Group_4_1_3__0__Impl rule__DotSubGraph__Group_4_1_3__1 )
            // InternalDotLanguage.g:2142:2: rule__DotSubGraph__Group_4_1_3__0__Impl rule__DotSubGraph__Group_4_1_3__1
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
    // InternalDotLanguage.g:2149:1: rule__DotSubGraph__Group_4_1_3__0__Impl : ( ',' ) ;
    public final void rule__DotSubGraph__Group_4_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2153:1: ( ( ',' ) )
            // InternalDotLanguage.g:2154:1: ( ',' )
            {
            // InternalDotLanguage.g:2154:1: ( ',' )
            // InternalDotLanguage.g:2155:1: ','
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
    // InternalDotLanguage.g:2168:1: rule__DotSubGraph__Group_4_1_3__1 : rule__DotSubGraph__Group_4_1_3__1__Impl ;
    public final void rule__DotSubGraph__Group_4_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2172:1: ( rule__DotSubGraph__Group_4_1_3__1__Impl )
            // InternalDotLanguage.g:2173:2: rule__DotSubGraph__Group_4_1_3__1__Impl
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
    // InternalDotLanguage.g:2179:1: rule__DotSubGraph__Group_4_1_3__1__Impl : ( ( rule__DotSubGraph__NodeSettingsAssignment_4_1_3_1 ) ) ;
    public final void rule__DotSubGraph__Group_4_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2183:1: ( ( ( rule__DotSubGraph__NodeSettingsAssignment_4_1_3_1 ) ) )
            // InternalDotLanguage.g:2184:1: ( ( rule__DotSubGraph__NodeSettingsAssignment_4_1_3_1 ) )
            {
            // InternalDotLanguage.g:2184:1: ( ( rule__DotSubGraph__NodeSettingsAssignment_4_1_3_1 ) )
            // InternalDotLanguage.g:2185:1: ( rule__DotSubGraph__NodeSettingsAssignment_4_1_3_1 )
            {
             before(grammarAccess.getDotSubGraphAccess().getNodeSettingsAssignment_4_1_3_1()); 
            // InternalDotLanguage.g:2186:1: ( rule__DotSubGraph__NodeSettingsAssignment_4_1_3_1 )
            // InternalDotLanguage.g:2186:2: rule__DotSubGraph__NodeSettingsAssignment_4_1_3_1
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
    // InternalDotLanguage.g:2200:1: rule__DotSubGraph__Group_4_2__0 : rule__DotSubGraph__Group_4_2__0__Impl rule__DotSubGraph__Group_4_2__1 ;
    public final void rule__DotSubGraph__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2204:1: ( rule__DotSubGraph__Group_4_2__0__Impl rule__DotSubGraph__Group_4_2__1 )
            // InternalDotLanguage.g:2205:2: rule__DotSubGraph__Group_4_2__0__Impl rule__DotSubGraph__Group_4_2__1
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
    // InternalDotLanguage.g:2212:1: rule__DotSubGraph__Group_4_2__0__Impl : ( 'edge' ) ;
    public final void rule__DotSubGraph__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2216:1: ( ( 'edge' ) )
            // InternalDotLanguage.g:2217:1: ( 'edge' )
            {
            // InternalDotLanguage.g:2217:1: ( 'edge' )
            // InternalDotLanguage.g:2218:1: 'edge'
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
    // InternalDotLanguage.g:2231:1: rule__DotSubGraph__Group_4_2__1 : rule__DotSubGraph__Group_4_2__1__Impl rule__DotSubGraph__Group_4_2__2 ;
    public final void rule__DotSubGraph__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2235:1: ( rule__DotSubGraph__Group_4_2__1__Impl rule__DotSubGraph__Group_4_2__2 )
            // InternalDotLanguage.g:2236:2: rule__DotSubGraph__Group_4_2__1__Impl rule__DotSubGraph__Group_4_2__2
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
    // InternalDotLanguage.g:2243:1: rule__DotSubGraph__Group_4_2__1__Impl : ( '[' ) ;
    public final void rule__DotSubGraph__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2247:1: ( ( '[' ) )
            // InternalDotLanguage.g:2248:1: ( '[' )
            {
            // InternalDotLanguage.g:2248:1: ( '[' )
            // InternalDotLanguage.g:2249:1: '['
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
    // InternalDotLanguage.g:2262:1: rule__DotSubGraph__Group_4_2__2 : rule__DotSubGraph__Group_4_2__2__Impl rule__DotSubGraph__Group_4_2__3 ;
    public final void rule__DotSubGraph__Group_4_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2266:1: ( rule__DotSubGraph__Group_4_2__2__Impl rule__DotSubGraph__Group_4_2__3 )
            // InternalDotLanguage.g:2267:2: rule__DotSubGraph__Group_4_2__2__Impl rule__DotSubGraph__Group_4_2__3
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
    // InternalDotLanguage.g:2274:1: rule__DotSubGraph__Group_4_2__2__Impl : ( ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_2 ) ) ;
    public final void rule__DotSubGraph__Group_4_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2278:1: ( ( ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_2 ) ) )
            // InternalDotLanguage.g:2279:1: ( ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_2 ) )
            {
            // InternalDotLanguage.g:2279:1: ( ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_2 ) )
            // InternalDotLanguage.g:2280:1: ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_2 )
            {
             before(grammarAccess.getDotSubGraphAccess().getEdgeSettingsAssignment_4_2_2()); 
            // InternalDotLanguage.g:2281:1: ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_2 )
            // InternalDotLanguage.g:2281:2: rule__DotSubGraph__EdgeSettingsAssignment_4_2_2
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
    // InternalDotLanguage.g:2291:1: rule__DotSubGraph__Group_4_2__3 : rule__DotSubGraph__Group_4_2__3__Impl rule__DotSubGraph__Group_4_2__4 ;
    public final void rule__DotSubGraph__Group_4_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2295:1: ( rule__DotSubGraph__Group_4_2__3__Impl rule__DotSubGraph__Group_4_2__4 )
            // InternalDotLanguage.g:2296:2: rule__DotSubGraph__Group_4_2__3__Impl rule__DotSubGraph__Group_4_2__4
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
    // InternalDotLanguage.g:2303:1: rule__DotSubGraph__Group_4_2__3__Impl : ( ( rule__DotSubGraph__Group_4_2_3__0 )* ) ;
    public final void rule__DotSubGraph__Group_4_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2307:1: ( ( ( rule__DotSubGraph__Group_4_2_3__0 )* ) )
            // InternalDotLanguage.g:2308:1: ( ( rule__DotSubGraph__Group_4_2_3__0 )* )
            {
            // InternalDotLanguage.g:2308:1: ( ( rule__DotSubGraph__Group_4_2_3__0 )* )
            // InternalDotLanguage.g:2309:1: ( rule__DotSubGraph__Group_4_2_3__0 )*
            {
             before(grammarAccess.getDotSubGraphAccess().getGroup_4_2_3()); 
            // InternalDotLanguage.g:2310:1: ( rule__DotSubGraph__Group_4_2_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==20) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDotLanguage.g:2310:2: rule__DotSubGraph__Group_4_2_3__0
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
    // InternalDotLanguage.g:2320:1: rule__DotSubGraph__Group_4_2__4 : rule__DotSubGraph__Group_4_2__4__Impl rule__DotSubGraph__Group_4_2__5 ;
    public final void rule__DotSubGraph__Group_4_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2324:1: ( rule__DotSubGraph__Group_4_2__4__Impl rule__DotSubGraph__Group_4_2__5 )
            // InternalDotLanguage.g:2325:2: rule__DotSubGraph__Group_4_2__4__Impl rule__DotSubGraph__Group_4_2__5
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
    // InternalDotLanguage.g:2332:1: rule__DotSubGraph__Group_4_2__4__Impl : ( ']' ) ;
    public final void rule__DotSubGraph__Group_4_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2336:1: ( ( ']' ) )
            // InternalDotLanguage.g:2337:1: ( ']' )
            {
            // InternalDotLanguage.g:2337:1: ( ']' )
            // InternalDotLanguage.g:2338:1: ']'
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
    // InternalDotLanguage.g:2351:1: rule__DotSubGraph__Group_4_2__5 : rule__DotSubGraph__Group_4_2__5__Impl ;
    public final void rule__DotSubGraph__Group_4_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2355:1: ( rule__DotSubGraph__Group_4_2__5__Impl )
            // InternalDotLanguage.g:2356:2: rule__DotSubGraph__Group_4_2__5__Impl
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
    // InternalDotLanguage.g:2362:1: rule__DotSubGraph__Group_4_2__5__Impl : ( ( ';' )? ) ;
    public final void rule__DotSubGraph__Group_4_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2366:1: ( ( ( ';' )? ) )
            // InternalDotLanguage.g:2367:1: ( ( ';' )? )
            {
            // InternalDotLanguage.g:2367:1: ( ( ';' )? )
            // InternalDotLanguage.g:2368:1: ( ';' )?
            {
             before(grammarAccess.getDotSubGraphAccess().getSemicolonKeyword_4_2_5()); 
            // InternalDotLanguage.g:2369:1: ( ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDotLanguage.g:2370:2: ';'
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
    // InternalDotLanguage.g:2393:1: rule__DotSubGraph__Group_4_2_3__0 : rule__DotSubGraph__Group_4_2_3__0__Impl rule__DotSubGraph__Group_4_2_3__1 ;
    public final void rule__DotSubGraph__Group_4_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2397:1: ( rule__DotSubGraph__Group_4_2_3__0__Impl rule__DotSubGraph__Group_4_2_3__1 )
            // InternalDotLanguage.g:2398:2: rule__DotSubGraph__Group_4_2_3__0__Impl rule__DotSubGraph__Group_4_2_3__1
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
    // InternalDotLanguage.g:2405:1: rule__DotSubGraph__Group_4_2_3__0__Impl : ( ',' ) ;
    public final void rule__DotSubGraph__Group_4_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2409:1: ( ( ',' ) )
            // InternalDotLanguage.g:2410:1: ( ',' )
            {
            // InternalDotLanguage.g:2410:1: ( ',' )
            // InternalDotLanguage.g:2411:1: ','
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
    // InternalDotLanguage.g:2424:1: rule__DotSubGraph__Group_4_2_3__1 : rule__DotSubGraph__Group_4_2_3__1__Impl ;
    public final void rule__DotSubGraph__Group_4_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2428:1: ( rule__DotSubGraph__Group_4_2_3__1__Impl )
            // InternalDotLanguage.g:2429:2: rule__DotSubGraph__Group_4_2_3__1__Impl
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
    // InternalDotLanguage.g:2435:1: rule__DotSubGraph__Group_4_2_3__1__Impl : ( ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_3_1 ) ) ;
    public final void rule__DotSubGraph__Group_4_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2439:1: ( ( ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_3_1 ) ) )
            // InternalDotLanguage.g:2440:1: ( ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_3_1 ) )
            {
            // InternalDotLanguage.g:2440:1: ( ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_3_1 ) )
            // InternalDotLanguage.g:2441:1: ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_3_1 )
            {
             before(grammarAccess.getDotSubGraphAccess().getEdgeSettingsAssignment_4_2_3_1()); 
            // InternalDotLanguage.g:2442:1: ( rule__DotSubGraph__EdgeSettingsAssignment_4_2_3_1 )
            // InternalDotLanguage.g:2442:2: rule__DotSubGraph__EdgeSettingsAssignment_4_2_3_1
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
    // InternalDotLanguage.g:2456:1: rule__DotNode__Group__0 : rule__DotNode__Group__0__Impl rule__DotNode__Group__1 ;
    public final void rule__DotNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2460:1: ( rule__DotNode__Group__0__Impl rule__DotNode__Group__1 )
            // InternalDotLanguage.g:2461:2: rule__DotNode__Group__0__Impl rule__DotNode__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalDotLanguage.g:2468:1: rule__DotNode__Group__0__Impl : ( ( rule__DotNode__NameAssignment_0 ) ) ;
    public final void rule__DotNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2472:1: ( ( ( rule__DotNode__NameAssignment_0 ) ) )
            // InternalDotLanguage.g:2473:1: ( ( rule__DotNode__NameAssignment_0 ) )
            {
            // InternalDotLanguage.g:2473:1: ( ( rule__DotNode__NameAssignment_0 ) )
            // InternalDotLanguage.g:2474:1: ( rule__DotNode__NameAssignment_0 )
            {
             before(grammarAccess.getDotNodeAccess().getNameAssignment_0()); 
            // InternalDotLanguage.g:2475:1: ( rule__DotNode__NameAssignment_0 )
            // InternalDotLanguage.g:2475:2: rule__DotNode__NameAssignment_0
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
    // InternalDotLanguage.g:2485:1: rule__DotNode__Group__1 : rule__DotNode__Group__1__Impl rule__DotNode__Group__2 ;
    public final void rule__DotNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2489:1: ( rule__DotNode__Group__1__Impl rule__DotNode__Group__2 )
            // InternalDotLanguage.g:2490:2: rule__DotNode__Group__1__Impl rule__DotNode__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalDotLanguage.g:2497:1: rule__DotNode__Group__1__Impl : ( ( rule__DotNode__Group_1__0 )? ) ;
    public final void rule__DotNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2501:1: ( ( ( rule__DotNode__Group_1__0 )? ) )
            // InternalDotLanguage.g:2502:1: ( ( rule__DotNode__Group_1__0 )? )
            {
            // InternalDotLanguage.g:2502:1: ( ( rule__DotNode__Group_1__0 )? )
            // InternalDotLanguage.g:2503:1: ( rule__DotNode__Group_1__0 )?
            {
             before(grammarAccess.getDotNodeAccess().getGroup_1()); 
            // InternalDotLanguage.g:2504:1: ( rule__DotNode__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDotLanguage.g:2504:2: rule__DotNode__Group_1__0
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
    // InternalDotLanguage.g:2514:1: rule__DotNode__Group__2 : rule__DotNode__Group__2__Impl ;
    public final void rule__DotNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2518:1: ( rule__DotNode__Group__2__Impl )
            // InternalDotLanguage.g:2519:2: rule__DotNode__Group__2__Impl
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
    // InternalDotLanguage.g:2525:1: rule__DotNode__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__DotNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2529:1: ( ( ( ';' )? ) )
            // InternalDotLanguage.g:2530:1: ( ( ';' )? )
            {
            // InternalDotLanguage.g:2530:1: ( ( ';' )? )
            // InternalDotLanguage.g:2531:1: ( ';' )?
            {
             before(grammarAccess.getDotNodeAccess().getSemicolonKeyword_2()); 
            // InternalDotLanguage.g:2532:1: ( ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDotLanguage.g:2533:2: ';'
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
    // InternalDotLanguage.g:2550:1: rule__DotNode__Group_1__0 : rule__DotNode__Group_1__0__Impl rule__DotNode__Group_1__1 ;
    public final void rule__DotNode__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2554:1: ( rule__DotNode__Group_1__0__Impl rule__DotNode__Group_1__1 )
            // InternalDotLanguage.g:2555:2: rule__DotNode__Group_1__0__Impl rule__DotNode__Group_1__1
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
    // InternalDotLanguage.g:2562:1: rule__DotNode__Group_1__0__Impl : ( '[' ) ;
    public final void rule__DotNode__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2566:1: ( ( '[' ) )
            // InternalDotLanguage.g:2567:1: ( '[' )
            {
            // InternalDotLanguage.g:2567:1: ( '[' )
            // InternalDotLanguage.g:2568:1: '['
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
    // InternalDotLanguage.g:2581:1: rule__DotNode__Group_1__1 : rule__DotNode__Group_1__1__Impl rule__DotNode__Group_1__2 ;
    public final void rule__DotNode__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2585:1: ( rule__DotNode__Group_1__1__Impl rule__DotNode__Group_1__2 )
            // InternalDotLanguage.g:2586:2: rule__DotNode__Group_1__1__Impl rule__DotNode__Group_1__2
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
    // InternalDotLanguage.g:2593:1: rule__DotNode__Group_1__1__Impl : ( ( rule__DotNode__SettingsAssignment_1_1 ) ) ;
    public final void rule__DotNode__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2597:1: ( ( ( rule__DotNode__SettingsAssignment_1_1 ) ) )
            // InternalDotLanguage.g:2598:1: ( ( rule__DotNode__SettingsAssignment_1_1 ) )
            {
            // InternalDotLanguage.g:2598:1: ( ( rule__DotNode__SettingsAssignment_1_1 ) )
            // InternalDotLanguage.g:2599:1: ( rule__DotNode__SettingsAssignment_1_1 )
            {
             before(grammarAccess.getDotNodeAccess().getSettingsAssignment_1_1()); 
            // InternalDotLanguage.g:2600:1: ( rule__DotNode__SettingsAssignment_1_1 )
            // InternalDotLanguage.g:2600:2: rule__DotNode__SettingsAssignment_1_1
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
    // InternalDotLanguage.g:2610:1: rule__DotNode__Group_1__2 : rule__DotNode__Group_1__2__Impl rule__DotNode__Group_1__3 ;
    public final void rule__DotNode__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2614:1: ( rule__DotNode__Group_1__2__Impl rule__DotNode__Group_1__3 )
            // InternalDotLanguage.g:2615:2: rule__DotNode__Group_1__2__Impl rule__DotNode__Group_1__3
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
    // InternalDotLanguage.g:2622:1: rule__DotNode__Group_1__2__Impl : ( ( rule__DotNode__Group_1_2__0 )* ) ;
    public final void rule__DotNode__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2626:1: ( ( ( rule__DotNode__Group_1_2__0 )* ) )
            // InternalDotLanguage.g:2627:1: ( ( rule__DotNode__Group_1_2__0 )* )
            {
            // InternalDotLanguage.g:2627:1: ( ( rule__DotNode__Group_1_2__0 )* )
            // InternalDotLanguage.g:2628:1: ( rule__DotNode__Group_1_2__0 )*
            {
             before(grammarAccess.getDotNodeAccess().getGroup_1_2()); 
            // InternalDotLanguage.g:2629:1: ( rule__DotNode__Group_1_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==20) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDotLanguage.g:2629:2: rule__DotNode__Group_1_2__0
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
    // InternalDotLanguage.g:2639:1: rule__DotNode__Group_1__3 : rule__DotNode__Group_1__3__Impl ;
    public final void rule__DotNode__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2643:1: ( rule__DotNode__Group_1__3__Impl )
            // InternalDotLanguage.g:2644:2: rule__DotNode__Group_1__3__Impl
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
    // InternalDotLanguage.g:2650:1: rule__DotNode__Group_1__3__Impl : ( ']' ) ;
    public final void rule__DotNode__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2654:1: ( ( ']' ) )
            // InternalDotLanguage.g:2655:1: ( ']' )
            {
            // InternalDotLanguage.g:2655:1: ( ']' )
            // InternalDotLanguage.g:2656:1: ']'
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
    // InternalDotLanguage.g:2677:1: rule__DotNode__Group_1_2__0 : rule__DotNode__Group_1_2__0__Impl rule__DotNode__Group_1_2__1 ;
    public final void rule__DotNode__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2681:1: ( rule__DotNode__Group_1_2__0__Impl rule__DotNode__Group_1_2__1 )
            // InternalDotLanguage.g:2682:2: rule__DotNode__Group_1_2__0__Impl rule__DotNode__Group_1_2__1
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
    // InternalDotLanguage.g:2689:1: rule__DotNode__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__DotNode__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2693:1: ( ( ',' ) )
            // InternalDotLanguage.g:2694:1: ( ',' )
            {
            // InternalDotLanguage.g:2694:1: ( ',' )
            // InternalDotLanguage.g:2695:1: ','
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
    // InternalDotLanguage.g:2708:1: rule__DotNode__Group_1_2__1 : rule__DotNode__Group_1_2__1__Impl ;
    public final void rule__DotNode__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2712:1: ( rule__DotNode__Group_1_2__1__Impl )
            // InternalDotLanguage.g:2713:2: rule__DotNode__Group_1_2__1__Impl
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
    // InternalDotLanguage.g:2719:1: rule__DotNode__Group_1_2__1__Impl : ( ( rule__DotNode__SettingsAssignment_1_2_1 ) ) ;
    public final void rule__DotNode__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2723:1: ( ( ( rule__DotNode__SettingsAssignment_1_2_1 ) ) )
            // InternalDotLanguage.g:2724:1: ( ( rule__DotNode__SettingsAssignment_1_2_1 ) )
            {
            // InternalDotLanguage.g:2724:1: ( ( rule__DotNode__SettingsAssignment_1_2_1 ) )
            // InternalDotLanguage.g:2725:1: ( rule__DotNode__SettingsAssignment_1_2_1 )
            {
             before(grammarAccess.getDotNodeAccess().getSettingsAssignment_1_2_1()); 
            // InternalDotLanguage.g:2726:1: ( rule__DotNode__SettingsAssignment_1_2_1 )
            // InternalDotLanguage.g:2726:2: rule__DotNode__SettingsAssignment_1_2_1
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
    // InternalDotLanguage.g:2740:1: rule__DirectedDotEdge__Group__0 : rule__DirectedDotEdge__Group__0__Impl rule__DirectedDotEdge__Group__1 ;
    public final void rule__DirectedDotEdge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2744:1: ( rule__DirectedDotEdge__Group__0__Impl rule__DirectedDotEdge__Group__1 )
            // InternalDotLanguage.g:2745:2: rule__DirectedDotEdge__Group__0__Impl rule__DirectedDotEdge__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalDotLanguage.g:2752:1: rule__DirectedDotEdge__Group__0__Impl : ( ( rule__DirectedDotEdge__SourceAssignment_0 ) ) ;
    public final void rule__DirectedDotEdge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2756:1: ( ( ( rule__DirectedDotEdge__SourceAssignment_0 ) ) )
            // InternalDotLanguage.g:2757:1: ( ( rule__DirectedDotEdge__SourceAssignment_0 ) )
            {
            // InternalDotLanguage.g:2757:1: ( ( rule__DirectedDotEdge__SourceAssignment_0 ) )
            // InternalDotLanguage.g:2758:1: ( rule__DirectedDotEdge__SourceAssignment_0 )
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getSourceAssignment_0()); 
            // InternalDotLanguage.g:2759:1: ( rule__DirectedDotEdge__SourceAssignment_0 )
            // InternalDotLanguage.g:2759:2: rule__DirectedDotEdge__SourceAssignment_0
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
    // InternalDotLanguage.g:2769:1: rule__DirectedDotEdge__Group__1 : rule__DirectedDotEdge__Group__1__Impl rule__DirectedDotEdge__Group__2 ;
    public final void rule__DirectedDotEdge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2773:1: ( rule__DirectedDotEdge__Group__1__Impl rule__DirectedDotEdge__Group__2 )
            // InternalDotLanguage.g:2774:2: rule__DirectedDotEdge__Group__1__Impl rule__DirectedDotEdge__Group__2
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
    // InternalDotLanguage.g:2781:1: rule__DirectedDotEdge__Group__1__Impl : ( '->' ) ;
    public final void rule__DirectedDotEdge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2785:1: ( ( '->' ) )
            // InternalDotLanguage.g:2786:1: ( '->' )
            {
            // InternalDotLanguage.g:2786:1: ( '->' )
            // InternalDotLanguage.g:2787:1: '->'
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
    // InternalDotLanguage.g:2800:1: rule__DirectedDotEdge__Group__2 : rule__DirectedDotEdge__Group__2__Impl rule__DirectedDotEdge__Group__3 ;
    public final void rule__DirectedDotEdge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2804:1: ( rule__DirectedDotEdge__Group__2__Impl rule__DirectedDotEdge__Group__3 )
            // InternalDotLanguage.g:2805:2: rule__DirectedDotEdge__Group__2__Impl rule__DirectedDotEdge__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalDotLanguage.g:2812:1: rule__DirectedDotEdge__Group__2__Impl : ( ( rule__DirectedDotEdge__TargetAssignment_2 ) ) ;
    public final void rule__DirectedDotEdge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2816:1: ( ( ( rule__DirectedDotEdge__TargetAssignment_2 ) ) )
            // InternalDotLanguage.g:2817:1: ( ( rule__DirectedDotEdge__TargetAssignment_2 ) )
            {
            // InternalDotLanguage.g:2817:1: ( ( rule__DirectedDotEdge__TargetAssignment_2 ) )
            // InternalDotLanguage.g:2818:1: ( rule__DirectedDotEdge__TargetAssignment_2 )
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getTargetAssignment_2()); 
            // InternalDotLanguage.g:2819:1: ( rule__DirectedDotEdge__TargetAssignment_2 )
            // InternalDotLanguage.g:2819:2: rule__DirectedDotEdge__TargetAssignment_2
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
    // InternalDotLanguage.g:2829:1: rule__DirectedDotEdge__Group__3 : rule__DirectedDotEdge__Group__3__Impl rule__DirectedDotEdge__Group__4 ;
    public final void rule__DirectedDotEdge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2833:1: ( rule__DirectedDotEdge__Group__3__Impl rule__DirectedDotEdge__Group__4 )
            // InternalDotLanguage.g:2834:2: rule__DirectedDotEdge__Group__3__Impl rule__DirectedDotEdge__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalDotLanguage.g:2841:1: rule__DirectedDotEdge__Group__3__Impl : ( ( rule__DirectedDotEdge__Group_3__0 )? ) ;
    public final void rule__DirectedDotEdge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2845:1: ( ( ( rule__DirectedDotEdge__Group_3__0 )? ) )
            // InternalDotLanguage.g:2846:1: ( ( rule__DirectedDotEdge__Group_3__0 )? )
            {
            // InternalDotLanguage.g:2846:1: ( ( rule__DirectedDotEdge__Group_3__0 )? )
            // InternalDotLanguage.g:2847:1: ( rule__DirectedDotEdge__Group_3__0 )?
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getGroup_3()); 
            // InternalDotLanguage.g:2848:1: ( rule__DirectedDotEdge__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDotLanguage.g:2848:2: rule__DirectedDotEdge__Group_3__0
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
    // InternalDotLanguage.g:2858:1: rule__DirectedDotEdge__Group__4 : rule__DirectedDotEdge__Group__4__Impl ;
    public final void rule__DirectedDotEdge__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2862:1: ( rule__DirectedDotEdge__Group__4__Impl )
            // InternalDotLanguage.g:2863:2: rule__DirectedDotEdge__Group__4__Impl
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
    // InternalDotLanguage.g:2869:1: rule__DirectedDotEdge__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__DirectedDotEdge__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2873:1: ( ( ( ';' )? ) )
            // InternalDotLanguage.g:2874:1: ( ( ';' )? )
            {
            // InternalDotLanguage.g:2874:1: ( ( ';' )? )
            // InternalDotLanguage.g:2875:1: ( ';' )?
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getSemicolonKeyword_4()); 
            // InternalDotLanguage.g:2876:1: ( ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==19) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDotLanguage.g:2877:2: ';'
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
    // InternalDotLanguage.g:2898:1: rule__DirectedDotEdge__Group_3__0 : rule__DirectedDotEdge__Group_3__0__Impl rule__DirectedDotEdge__Group_3__1 ;
    public final void rule__DirectedDotEdge__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2902:1: ( rule__DirectedDotEdge__Group_3__0__Impl rule__DirectedDotEdge__Group_3__1 )
            // InternalDotLanguage.g:2903:2: rule__DirectedDotEdge__Group_3__0__Impl rule__DirectedDotEdge__Group_3__1
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
    // InternalDotLanguage.g:2910:1: rule__DirectedDotEdge__Group_3__0__Impl : ( '[' ) ;
    public final void rule__DirectedDotEdge__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2914:1: ( ( '[' ) )
            // InternalDotLanguage.g:2915:1: ( '[' )
            {
            // InternalDotLanguage.g:2915:1: ( '[' )
            // InternalDotLanguage.g:2916:1: '['
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
    // InternalDotLanguage.g:2929:1: rule__DirectedDotEdge__Group_3__1 : rule__DirectedDotEdge__Group_3__1__Impl rule__DirectedDotEdge__Group_3__2 ;
    public final void rule__DirectedDotEdge__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2933:1: ( rule__DirectedDotEdge__Group_3__1__Impl rule__DirectedDotEdge__Group_3__2 )
            // InternalDotLanguage.g:2934:2: rule__DirectedDotEdge__Group_3__1__Impl rule__DirectedDotEdge__Group_3__2
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
    // InternalDotLanguage.g:2941:1: rule__DirectedDotEdge__Group_3__1__Impl : ( ( rule__DirectedDotEdge__SettingsAssignment_3_1 ) ) ;
    public final void rule__DirectedDotEdge__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2945:1: ( ( ( rule__DirectedDotEdge__SettingsAssignment_3_1 ) ) )
            // InternalDotLanguage.g:2946:1: ( ( rule__DirectedDotEdge__SettingsAssignment_3_1 ) )
            {
            // InternalDotLanguage.g:2946:1: ( ( rule__DirectedDotEdge__SettingsAssignment_3_1 ) )
            // InternalDotLanguage.g:2947:1: ( rule__DirectedDotEdge__SettingsAssignment_3_1 )
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getSettingsAssignment_3_1()); 
            // InternalDotLanguage.g:2948:1: ( rule__DirectedDotEdge__SettingsAssignment_3_1 )
            // InternalDotLanguage.g:2948:2: rule__DirectedDotEdge__SettingsAssignment_3_1
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
    // InternalDotLanguage.g:2958:1: rule__DirectedDotEdge__Group_3__2 : rule__DirectedDotEdge__Group_3__2__Impl rule__DirectedDotEdge__Group_3__3 ;
    public final void rule__DirectedDotEdge__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2962:1: ( rule__DirectedDotEdge__Group_3__2__Impl rule__DirectedDotEdge__Group_3__3 )
            // InternalDotLanguage.g:2963:2: rule__DirectedDotEdge__Group_3__2__Impl rule__DirectedDotEdge__Group_3__3
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
    // InternalDotLanguage.g:2970:1: rule__DirectedDotEdge__Group_3__2__Impl : ( ( rule__DirectedDotEdge__Group_3_2__0 )* ) ;
    public final void rule__DirectedDotEdge__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2974:1: ( ( ( rule__DirectedDotEdge__Group_3_2__0 )* ) )
            // InternalDotLanguage.g:2975:1: ( ( rule__DirectedDotEdge__Group_3_2__0 )* )
            {
            // InternalDotLanguage.g:2975:1: ( ( rule__DirectedDotEdge__Group_3_2__0 )* )
            // InternalDotLanguage.g:2976:1: ( rule__DirectedDotEdge__Group_3_2__0 )*
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getGroup_3_2()); 
            // InternalDotLanguage.g:2977:1: ( rule__DirectedDotEdge__Group_3_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==20) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDotLanguage.g:2977:2: rule__DirectedDotEdge__Group_3_2__0
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
    // InternalDotLanguage.g:2987:1: rule__DirectedDotEdge__Group_3__3 : rule__DirectedDotEdge__Group_3__3__Impl ;
    public final void rule__DirectedDotEdge__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2991:1: ( rule__DirectedDotEdge__Group_3__3__Impl )
            // InternalDotLanguage.g:2992:2: rule__DirectedDotEdge__Group_3__3__Impl
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
    // InternalDotLanguage.g:2998:1: rule__DirectedDotEdge__Group_3__3__Impl : ( ']' ) ;
    public final void rule__DirectedDotEdge__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3002:1: ( ( ']' ) )
            // InternalDotLanguage.g:3003:1: ( ']' )
            {
            // InternalDotLanguage.g:3003:1: ( ']' )
            // InternalDotLanguage.g:3004:1: ']'
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
    // InternalDotLanguage.g:3025:1: rule__DirectedDotEdge__Group_3_2__0 : rule__DirectedDotEdge__Group_3_2__0__Impl rule__DirectedDotEdge__Group_3_2__1 ;
    public final void rule__DirectedDotEdge__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3029:1: ( rule__DirectedDotEdge__Group_3_2__0__Impl rule__DirectedDotEdge__Group_3_2__1 )
            // InternalDotLanguage.g:3030:2: rule__DirectedDotEdge__Group_3_2__0__Impl rule__DirectedDotEdge__Group_3_2__1
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
    // InternalDotLanguage.g:3037:1: rule__DirectedDotEdge__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__DirectedDotEdge__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3041:1: ( ( ',' ) )
            // InternalDotLanguage.g:3042:1: ( ',' )
            {
            // InternalDotLanguage.g:3042:1: ( ',' )
            // InternalDotLanguage.g:3043:1: ','
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
    // InternalDotLanguage.g:3056:1: rule__DirectedDotEdge__Group_3_2__1 : rule__DirectedDotEdge__Group_3_2__1__Impl ;
    public final void rule__DirectedDotEdge__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3060:1: ( rule__DirectedDotEdge__Group_3_2__1__Impl )
            // InternalDotLanguage.g:3061:2: rule__DirectedDotEdge__Group_3_2__1__Impl
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
    // InternalDotLanguage.g:3067:1: rule__DirectedDotEdge__Group_3_2__1__Impl : ( ( rule__DirectedDotEdge__SettingsAssignment_3_2_1 ) ) ;
    public final void rule__DirectedDotEdge__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3071:1: ( ( ( rule__DirectedDotEdge__SettingsAssignment_3_2_1 ) ) )
            // InternalDotLanguage.g:3072:1: ( ( rule__DirectedDotEdge__SettingsAssignment_3_2_1 ) )
            {
            // InternalDotLanguage.g:3072:1: ( ( rule__DirectedDotEdge__SettingsAssignment_3_2_1 ) )
            // InternalDotLanguage.g:3073:1: ( rule__DirectedDotEdge__SettingsAssignment_3_2_1 )
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getSettingsAssignment_3_2_1()); 
            // InternalDotLanguage.g:3074:1: ( rule__DirectedDotEdge__SettingsAssignment_3_2_1 )
            // InternalDotLanguage.g:3074:2: rule__DirectedDotEdge__SettingsAssignment_3_2_1
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
    // InternalDotLanguage.g:3088:1: rule__UndirectedDotEdge__Group__0 : rule__UndirectedDotEdge__Group__0__Impl rule__UndirectedDotEdge__Group__1 ;
    public final void rule__UndirectedDotEdge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3092:1: ( rule__UndirectedDotEdge__Group__0__Impl rule__UndirectedDotEdge__Group__1 )
            // InternalDotLanguage.g:3093:2: rule__UndirectedDotEdge__Group__0__Impl rule__UndirectedDotEdge__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
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
    // InternalDotLanguage.g:3100:1: rule__UndirectedDotEdge__Group__0__Impl : ( ( rule__UndirectedDotEdge__SourceAssignment_0 ) ) ;
    public final void rule__UndirectedDotEdge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3104:1: ( ( ( rule__UndirectedDotEdge__SourceAssignment_0 ) ) )
            // InternalDotLanguage.g:3105:1: ( ( rule__UndirectedDotEdge__SourceAssignment_0 ) )
            {
            // InternalDotLanguage.g:3105:1: ( ( rule__UndirectedDotEdge__SourceAssignment_0 ) )
            // InternalDotLanguage.g:3106:1: ( rule__UndirectedDotEdge__SourceAssignment_0 )
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getSourceAssignment_0()); 
            // InternalDotLanguage.g:3107:1: ( rule__UndirectedDotEdge__SourceAssignment_0 )
            // InternalDotLanguage.g:3107:2: rule__UndirectedDotEdge__SourceAssignment_0
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
    // InternalDotLanguage.g:3117:1: rule__UndirectedDotEdge__Group__1 : rule__UndirectedDotEdge__Group__1__Impl rule__UndirectedDotEdge__Group__2 ;
    public final void rule__UndirectedDotEdge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3121:1: ( rule__UndirectedDotEdge__Group__1__Impl rule__UndirectedDotEdge__Group__2 )
            // InternalDotLanguage.g:3122:2: rule__UndirectedDotEdge__Group__1__Impl rule__UndirectedDotEdge__Group__2
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
    // InternalDotLanguage.g:3129:1: rule__UndirectedDotEdge__Group__1__Impl : ( '--' ) ;
    public final void rule__UndirectedDotEdge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3133:1: ( ( '--' ) )
            // InternalDotLanguage.g:3134:1: ( '--' )
            {
            // InternalDotLanguage.g:3134:1: ( '--' )
            // InternalDotLanguage.g:3135:1: '--'
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
    // InternalDotLanguage.g:3148:1: rule__UndirectedDotEdge__Group__2 : rule__UndirectedDotEdge__Group__2__Impl rule__UndirectedDotEdge__Group__3 ;
    public final void rule__UndirectedDotEdge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3152:1: ( rule__UndirectedDotEdge__Group__2__Impl rule__UndirectedDotEdge__Group__3 )
            // InternalDotLanguage.g:3153:2: rule__UndirectedDotEdge__Group__2__Impl rule__UndirectedDotEdge__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalDotLanguage.g:3160:1: rule__UndirectedDotEdge__Group__2__Impl : ( ( rule__UndirectedDotEdge__TargetAssignment_2 ) ) ;
    public final void rule__UndirectedDotEdge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3164:1: ( ( ( rule__UndirectedDotEdge__TargetAssignment_2 ) ) )
            // InternalDotLanguage.g:3165:1: ( ( rule__UndirectedDotEdge__TargetAssignment_2 ) )
            {
            // InternalDotLanguage.g:3165:1: ( ( rule__UndirectedDotEdge__TargetAssignment_2 ) )
            // InternalDotLanguage.g:3166:1: ( rule__UndirectedDotEdge__TargetAssignment_2 )
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getTargetAssignment_2()); 
            // InternalDotLanguage.g:3167:1: ( rule__UndirectedDotEdge__TargetAssignment_2 )
            // InternalDotLanguage.g:3167:2: rule__UndirectedDotEdge__TargetAssignment_2
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
    // InternalDotLanguage.g:3177:1: rule__UndirectedDotEdge__Group__3 : rule__UndirectedDotEdge__Group__3__Impl rule__UndirectedDotEdge__Group__4 ;
    public final void rule__UndirectedDotEdge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3181:1: ( rule__UndirectedDotEdge__Group__3__Impl rule__UndirectedDotEdge__Group__4 )
            // InternalDotLanguage.g:3182:2: rule__UndirectedDotEdge__Group__3__Impl rule__UndirectedDotEdge__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalDotLanguage.g:3189:1: rule__UndirectedDotEdge__Group__3__Impl : ( ( rule__UndirectedDotEdge__Group_3__0 )? ) ;
    public final void rule__UndirectedDotEdge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3193:1: ( ( ( rule__UndirectedDotEdge__Group_3__0 )? ) )
            // InternalDotLanguage.g:3194:1: ( ( rule__UndirectedDotEdge__Group_3__0 )? )
            {
            // InternalDotLanguage.g:3194:1: ( ( rule__UndirectedDotEdge__Group_3__0 )? )
            // InternalDotLanguage.g:3195:1: ( rule__UndirectedDotEdge__Group_3__0 )?
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getGroup_3()); 
            // InternalDotLanguage.g:3196:1: ( rule__UndirectedDotEdge__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==17) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDotLanguage.g:3196:2: rule__UndirectedDotEdge__Group_3__0
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
    // InternalDotLanguage.g:3206:1: rule__UndirectedDotEdge__Group__4 : rule__UndirectedDotEdge__Group__4__Impl ;
    public final void rule__UndirectedDotEdge__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3210:1: ( rule__UndirectedDotEdge__Group__4__Impl )
            // InternalDotLanguage.g:3211:2: rule__UndirectedDotEdge__Group__4__Impl
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
    // InternalDotLanguage.g:3217:1: rule__UndirectedDotEdge__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__UndirectedDotEdge__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3221:1: ( ( ( ';' )? ) )
            // InternalDotLanguage.g:3222:1: ( ( ';' )? )
            {
            // InternalDotLanguage.g:3222:1: ( ( ';' )? )
            // InternalDotLanguage.g:3223:1: ( ';' )?
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getSemicolonKeyword_4()); 
            // InternalDotLanguage.g:3224:1: ( ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==19) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDotLanguage.g:3225:2: ';'
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
    // InternalDotLanguage.g:3246:1: rule__UndirectedDotEdge__Group_3__0 : rule__UndirectedDotEdge__Group_3__0__Impl rule__UndirectedDotEdge__Group_3__1 ;
    public final void rule__UndirectedDotEdge__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3250:1: ( rule__UndirectedDotEdge__Group_3__0__Impl rule__UndirectedDotEdge__Group_3__1 )
            // InternalDotLanguage.g:3251:2: rule__UndirectedDotEdge__Group_3__0__Impl rule__UndirectedDotEdge__Group_3__1
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
    // InternalDotLanguage.g:3258:1: rule__UndirectedDotEdge__Group_3__0__Impl : ( '[' ) ;
    public final void rule__UndirectedDotEdge__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3262:1: ( ( '[' ) )
            // InternalDotLanguage.g:3263:1: ( '[' )
            {
            // InternalDotLanguage.g:3263:1: ( '[' )
            // InternalDotLanguage.g:3264:1: '['
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
    // InternalDotLanguage.g:3277:1: rule__UndirectedDotEdge__Group_3__1 : rule__UndirectedDotEdge__Group_3__1__Impl rule__UndirectedDotEdge__Group_3__2 ;
    public final void rule__UndirectedDotEdge__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3281:1: ( rule__UndirectedDotEdge__Group_3__1__Impl rule__UndirectedDotEdge__Group_3__2 )
            // InternalDotLanguage.g:3282:2: rule__UndirectedDotEdge__Group_3__1__Impl rule__UndirectedDotEdge__Group_3__2
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
    // InternalDotLanguage.g:3289:1: rule__UndirectedDotEdge__Group_3__1__Impl : ( ( rule__UndirectedDotEdge__SettingsAssignment_3_1 ) ) ;
    public final void rule__UndirectedDotEdge__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3293:1: ( ( ( rule__UndirectedDotEdge__SettingsAssignment_3_1 ) ) )
            // InternalDotLanguage.g:3294:1: ( ( rule__UndirectedDotEdge__SettingsAssignment_3_1 ) )
            {
            // InternalDotLanguage.g:3294:1: ( ( rule__UndirectedDotEdge__SettingsAssignment_3_1 ) )
            // InternalDotLanguage.g:3295:1: ( rule__UndirectedDotEdge__SettingsAssignment_3_1 )
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getSettingsAssignment_3_1()); 
            // InternalDotLanguage.g:3296:1: ( rule__UndirectedDotEdge__SettingsAssignment_3_1 )
            // InternalDotLanguage.g:3296:2: rule__UndirectedDotEdge__SettingsAssignment_3_1
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
    // InternalDotLanguage.g:3306:1: rule__UndirectedDotEdge__Group_3__2 : rule__UndirectedDotEdge__Group_3__2__Impl rule__UndirectedDotEdge__Group_3__3 ;
    public final void rule__UndirectedDotEdge__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3310:1: ( rule__UndirectedDotEdge__Group_3__2__Impl rule__UndirectedDotEdge__Group_3__3 )
            // InternalDotLanguage.g:3311:2: rule__UndirectedDotEdge__Group_3__2__Impl rule__UndirectedDotEdge__Group_3__3
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
    // InternalDotLanguage.g:3318:1: rule__UndirectedDotEdge__Group_3__2__Impl : ( ( rule__UndirectedDotEdge__Group_3_2__0 )* ) ;
    public final void rule__UndirectedDotEdge__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3322:1: ( ( ( rule__UndirectedDotEdge__Group_3_2__0 )* ) )
            // InternalDotLanguage.g:3323:1: ( ( rule__UndirectedDotEdge__Group_3_2__0 )* )
            {
            // InternalDotLanguage.g:3323:1: ( ( rule__UndirectedDotEdge__Group_3_2__0 )* )
            // InternalDotLanguage.g:3324:1: ( rule__UndirectedDotEdge__Group_3_2__0 )*
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getGroup_3_2()); 
            // InternalDotLanguage.g:3325:1: ( rule__UndirectedDotEdge__Group_3_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==20) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDotLanguage.g:3325:2: rule__UndirectedDotEdge__Group_3_2__0
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
    // InternalDotLanguage.g:3335:1: rule__UndirectedDotEdge__Group_3__3 : rule__UndirectedDotEdge__Group_3__3__Impl ;
    public final void rule__UndirectedDotEdge__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3339:1: ( rule__UndirectedDotEdge__Group_3__3__Impl )
            // InternalDotLanguage.g:3340:2: rule__UndirectedDotEdge__Group_3__3__Impl
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
    // InternalDotLanguage.g:3346:1: rule__UndirectedDotEdge__Group_3__3__Impl : ( ']' ) ;
    public final void rule__UndirectedDotEdge__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3350:1: ( ( ']' ) )
            // InternalDotLanguage.g:3351:1: ( ']' )
            {
            // InternalDotLanguage.g:3351:1: ( ']' )
            // InternalDotLanguage.g:3352:1: ']'
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
    // InternalDotLanguage.g:3373:1: rule__UndirectedDotEdge__Group_3_2__0 : rule__UndirectedDotEdge__Group_3_2__0__Impl rule__UndirectedDotEdge__Group_3_2__1 ;
    public final void rule__UndirectedDotEdge__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3377:1: ( rule__UndirectedDotEdge__Group_3_2__0__Impl rule__UndirectedDotEdge__Group_3_2__1 )
            // InternalDotLanguage.g:3378:2: rule__UndirectedDotEdge__Group_3_2__0__Impl rule__UndirectedDotEdge__Group_3_2__1
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
    // InternalDotLanguage.g:3385:1: rule__UndirectedDotEdge__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__UndirectedDotEdge__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3389:1: ( ( ',' ) )
            // InternalDotLanguage.g:3390:1: ( ',' )
            {
            // InternalDotLanguage.g:3390:1: ( ',' )
            // InternalDotLanguage.g:3391:1: ','
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
    // InternalDotLanguage.g:3404:1: rule__UndirectedDotEdge__Group_3_2__1 : rule__UndirectedDotEdge__Group_3_2__1__Impl ;
    public final void rule__UndirectedDotEdge__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3408:1: ( rule__UndirectedDotEdge__Group_3_2__1__Impl )
            // InternalDotLanguage.g:3409:2: rule__UndirectedDotEdge__Group_3_2__1__Impl
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
    // InternalDotLanguage.g:3415:1: rule__UndirectedDotEdge__Group_3_2__1__Impl : ( ( rule__UndirectedDotEdge__SettingsAssignment_3_2_1 ) ) ;
    public final void rule__UndirectedDotEdge__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3419:1: ( ( ( rule__UndirectedDotEdge__SettingsAssignment_3_2_1 ) ) )
            // InternalDotLanguage.g:3420:1: ( ( rule__UndirectedDotEdge__SettingsAssignment_3_2_1 ) )
            {
            // InternalDotLanguage.g:3420:1: ( ( rule__UndirectedDotEdge__SettingsAssignment_3_2_1 ) )
            // InternalDotLanguage.g:3421:1: ( rule__UndirectedDotEdge__SettingsAssignment_3_2_1 )
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getSettingsAssignment_3_2_1()); 
            // InternalDotLanguage.g:3422:1: ( rule__UndirectedDotEdge__SettingsAssignment_3_2_1 )
            // InternalDotLanguage.g:3422:2: rule__UndirectedDotEdge__SettingsAssignment_3_2_1
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
    // InternalDotLanguage.g:3436:1: rule__Setting__Group__0 : rule__Setting__Group__0__Impl rule__Setting__Group__1 ;
    public final void rule__Setting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3440:1: ( rule__Setting__Group__0__Impl rule__Setting__Group__1 )
            // InternalDotLanguage.g:3441:2: rule__Setting__Group__0__Impl rule__Setting__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalDotLanguage.g:3448:1: rule__Setting__Group__0__Impl : ( ( rule__Setting__AttributeAssignment_0 ) ) ;
    public final void rule__Setting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3452:1: ( ( ( rule__Setting__AttributeAssignment_0 ) ) )
            // InternalDotLanguage.g:3453:1: ( ( rule__Setting__AttributeAssignment_0 ) )
            {
            // InternalDotLanguage.g:3453:1: ( ( rule__Setting__AttributeAssignment_0 ) )
            // InternalDotLanguage.g:3454:1: ( rule__Setting__AttributeAssignment_0 )
            {
             before(grammarAccess.getSettingAccess().getAttributeAssignment_0()); 
            // InternalDotLanguage.g:3455:1: ( rule__Setting__AttributeAssignment_0 )
            // InternalDotLanguage.g:3455:2: rule__Setting__AttributeAssignment_0
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
    // InternalDotLanguage.g:3465:1: rule__Setting__Group__1 : rule__Setting__Group__1__Impl rule__Setting__Group__2 ;
    public final void rule__Setting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3469:1: ( rule__Setting__Group__1__Impl rule__Setting__Group__2 )
            // InternalDotLanguage.g:3470:2: rule__Setting__Group__1__Impl rule__Setting__Group__2
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
    // InternalDotLanguage.g:3477:1: rule__Setting__Group__1__Impl : ( '=' ) ;
    public final void rule__Setting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3481:1: ( ( '=' ) )
            // InternalDotLanguage.g:3482:1: ( '=' )
            {
            // InternalDotLanguage.g:3482:1: ( '=' )
            // InternalDotLanguage.g:3483:1: '='
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
    // InternalDotLanguage.g:3496:1: rule__Setting__Group__2 : rule__Setting__Group__2__Impl ;
    public final void rule__Setting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3500:1: ( rule__Setting__Group__2__Impl )
            // InternalDotLanguage.g:3501:2: rule__Setting__Group__2__Impl
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
    // InternalDotLanguage.g:3507:1: rule__Setting__Group__2__Impl : ( ( rule__Setting__ValueAssignment_2 ) ) ;
    public final void rule__Setting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3511:1: ( ( ( rule__Setting__ValueAssignment_2 ) ) )
            // InternalDotLanguage.g:3512:1: ( ( rule__Setting__ValueAssignment_2 ) )
            {
            // InternalDotLanguage.g:3512:1: ( ( rule__Setting__ValueAssignment_2 ) )
            // InternalDotLanguage.g:3513:1: ( rule__Setting__ValueAssignment_2 )
            {
             before(grammarAccess.getSettingAccess().getValueAssignment_2()); 
            // InternalDotLanguage.g:3514:1: ( rule__Setting__ValueAssignment_2 )
            // InternalDotLanguage.g:3514:2: rule__Setting__ValueAssignment_2
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
    // InternalDotLanguage.g:3530:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3534:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalDotLanguage.g:3535:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalDotLanguage.g:3542:1: rule__Number__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3546:1: ( ( ( '-' )? ) )
            // InternalDotLanguage.g:3547:1: ( ( '-' )? )
            {
            // InternalDotLanguage.g:3547:1: ( ( '-' )? )
            // InternalDotLanguage.g:3548:1: ( '-' )?
            {
             before(grammarAccess.getNumberAccess().getHyphenMinusKeyword_0()); 
            // InternalDotLanguage.g:3549:1: ( '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDotLanguage.g:3550:2: '-'
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
    // InternalDotLanguage.g:3561:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3565:1: ( rule__Number__Group__1__Impl )
            // InternalDotLanguage.g:3566:2: rule__Number__Group__1__Impl
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
    // InternalDotLanguage.g:3572:1: rule__Number__Group__1__Impl : ( ( rule__Number__Alternatives_1 ) ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3576:1: ( ( ( rule__Number__Alternatives_1 ) ) )
            // InternalDotLanguage.g:3577:1: ( ( rule__Number__Alternatives_1 ) )
            {
            // InternalDotLanguage.g:3577:1: ( ( rule__Number__Alternatives_1 ) )
            // InternalDotLanguage.g:3578:1: ( rule__Number__Alternatives_1 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_1()); 
            // InternalDotLanguage.g:3579:1: ( rule__Number__Alternatives_1 )
            // InternalDotLanguage.g:3579:2: rule__Number__Alternatives_1
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
    // InternalDotLanguage.g:3594:1: rule__DotGraph__DirectedGraphAssignment_1_0 : ( ( 'digraph' ) ) ;
    public final void rule__DotGraph__DirectedGraphAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3598:1: ( ( ( 'digraph' ) ) )
            // InternalDotLanguage.g:3599:1: ( ( 'digraph' ) )
            {
            // InternalDotLanguage.g:3599:1: ( ( 'digraph' ) )
            // InternalDotLanguage.g:3600:1: ( 'digraph' )
            {
             before(grammarAccess.getDotGraphAccess().getDirectedGraphDigraphKeyword_1_0_0()); 
            // InternalDotLanguage.g:3601:1: ( 'digraph' )
            // InternalDotLanguage.g:3602:1: 'digraph'
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
    // InternalDotLanguage.g:3617:1: rule__DotGraph__IdAssignment_2 : ( ruleDotGraphID ) ;
    public final void rule__DotGraph__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3621:1: ( ( ruleDotGraphID ) )
            // InternalDotLanguage.g:3622:1: ( ruleDotGraphID )
            {
            // InternalDotLanguage.g:3622:1: ( ruleDotGraphID )
            // InternalDotLanguage.g:3623:1: ruleDotGraphID
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
    // InternalDotLanguage.g:3632:1: rule__DotGraph__GraphSettingsAssignment_4_0_2 : ( ruleSetting ) ;
    public final void rule__DotGraph__GraphSettingsAssignment_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3636:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3637:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3637:1: ( ruleSetting )
            // InternalDotLanguage.g:3638:1: ruleSetting
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
    // InternalDotLanguage.g:3647:1: rule__DotGraph__GraphSettingsAssignment_4_0_3_1 : ( ruleSetting ) ;
    public final void rule__DotGraph__GraphSettingsAssignment_4_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3651:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3652:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3652:1: ( ruleSetting )
            // InternalDotLanguage.g:3653:1: ruleSetting
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
    // InternalDotLanguage.g:3662:1: rule__DotGraph__NodeSettingsAssignment_4_1_2 : ( ruleSetting ) ;
    public final void rule__DotGraph__NodeSettingsAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3666:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3667:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3667:1: ( ruleSetting )
            // InternalDotLanguage.g:3668:1: ruleSetting
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
    // InternalDotLanguage.g:3677:1: rule__DotGraph__NodeSettingsAssignment_4_1_3_1 : ( ruleSetting ) ;
    public final void rule__DotGraph__NodeSettingsAssignment_4_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3681:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3682:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3682:1: ( ruleSetting )
            // InternalDotLanguage.g:3683:1: ruleSetting
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
    // InternalDotLanguage.g:3692:1: rule__DotGraph__EdgeSettingsAssignment_4_2_2 : ( ruleSetting ) ;
    public final void rule__DotGraph__EdgeSettingsAssignment_4_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3696:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3697:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3697:1: ( ruleSetting )
            // InternalDotLanguage.g:3698:1: ruleSetting
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
    // InternalDotLanguage.g:3707:1: rule__DotGraph__EdgeSettingsAssignment_4_2_3_1 : ( ruleSetting ) ;
    public final void rule__DotGraph__EdgeSettingsAssignment_4_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3711:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3712:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3712:1: ( ruleSetting )
            // InternalDotLanguage.g:3713:1: ruleSetting
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
    // InternalDotLanguage.g:3722:1: rule__DotGraph__SubgraphsAssignment_4_3 : ( ruleDotSubGraph ) ;
    public final void rule__DotGraph__SubgraphsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3726:1: ( ( ruleDotSubGraph ) )
            // InternalDotLanguage.g:3727:1: ( ruleDotSubGraph )
            {
            // InternalDotLanguage.g:3727:1: ( ruleDotSubGraph )
            // InternalDotLanguage.g:3728:1: ruleDotSubGraph
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
    // InternalDotLanguage.g:3737:1: rule__DotGraph__NodesAssignment_4_4 : ( ruleDotNode ) ;
    public final void rule__DotGraph__NodesAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3741:1: ( ( ruleDotNode ) )
            // InternalDotLanguage.g:3742:1: ( ruleDotNode )
            {
            // InternalDotLanguage.g:3742:1: ( ruleDotNode )
            // InternalDotLanguage.g:3743:1: ruleDotNode
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
    // InternalDotLanguage.g:3752:1: rule__DotGraph__EdgesAssignment_4_5 : ( ruleDotEdge ) ;
    public final void rule__DotGraph__EdgesAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3756:1: ( ( ruleDotEdge ) )
            // InternalDotLanguage.g:3757:1: ( ruleDotEdge )
            {
            // InternalDotLanguage.g:3757:1: ( ruleDotEdge )
            // InternalDotLanguage.g:3758:1: ruleDotEdge
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
    // InternalDotLanguage.g:3767:1: rule__DotSubGraph__IdAssignment_2 : ( ruleDotGraphID ) ;
    public final void rule__DotSubGraph__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3771:1: ( ( ruleDotGraphID ) )
            // InternalDotLanguage.g:3772:1: ( ruleDotGraphID )
            {
            // InternalDotLanguage.g:3772:1: ( ruleDotGraphID )
            // InternalDotLanguage.g:3773:1: ruleDotGraphID
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
    // InternalDotLanguage.g:3782:1: rule__DotSubGraph__GraphSettingsAssignment_4_0_2 : ( ruleSetting ) ;
    public final void rule__DotSubGraph__GraphSettingsAssignment_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3786:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3787:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3787:1: ( ruleSetting )
            // InternalDotLanguage.g:3788:1: ruleSetting
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
    // InternalDotLanguage.g:3797:1: rule__DotSubGraph__GraphSettingsAssignment_4_0_3_1 : ( ruleSetting ) ;
    public final void rule__DotSubGraph__GraphSettingsAssignment_4_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3801:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3802:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3802:1: ( ruleSetting )
            // InternalDotLanguage.g:3803:1: ruleSetting
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
    // InternalDotLanguage.g:3812:1: rule__DotSubGraph__NodeSettingsAssignment_4_1_2 : ( ruleSetting ) ;
    public final void rule__DotSubGraph__NodeSettingsAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3816:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3817:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3817:1: ( ruleSetting )
            // InternalDotLanguage.g:3818:1: ruleSetting
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
    // InternalDotLanguage.g:3827:1: rule__DotSubGraph__NodeSettingsAssignment_4_1_3_1 : ( ruleSetting ) ;
    public final void rule__DotSubGraph__NodeSettingsAssignment_4_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3831:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3832:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3832:1: ( ruleSetting )
            // InternalDotLanguage.g:3833:1: ruleSetting
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
    // InternalDotLanguage.g:3842:1: rule__DotSubGraph__EdgeSettingsAssignment_4_2_2 : ( ruleSetting ) ;
    public final void rule__DotSubGraph__EdgeSettingsAssignment_4_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3846:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3847:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3847:1: ( ruleSetting )
            // InternalDotLanguage.g:3848:1: ruleSetting
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
    // InternalDotLanguage.g:3857:1: rule__DotSubGraph__EdgeSettingsAssignment_4_2_3_1 : ( ruleSetting ) ;
    public final void rule__DotSubGraph__EdgeSettingsAssignment_4_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3861:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3862:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3862:1: ( ruleSetting )
            // InternalDotLanguage.g:3863:1: ruleSetting
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
    // InternalDotLanguage.g:3872:1: rule__DotSubGraph__SubgraphsAssignment_4_3 : ( ruleDotSubGraph ) ;
    public final void rule__DotSubGraph__SubgraphsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3876:1: ( ( ruleDotSubGraph ) )
            // InternalDotLanguage.g:3877:1: ( ruleDotSubGraph )
            {
            // InternalDotLanguage.g:3877:1: ( ruleDotSubGraph )
            // InternalDotLanguage.g:3878:1: ruleDotSubGraph
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
    // InternalDotLanguage.g:3887:1: rule__DotSubGraph__NodesAssignment_4_4 : ( ruleDotNode ) ;
    public final void rule__DotSubGraph__NodesAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3891:1: ( ( ruleDotNode ) )
            // InternalDotLanguage.g:3892:1: ( ruleDotNode )
            {
            // InternalDotLanguage.g:3892:1: ( ruleDotNode )
            // InternalDotLanguage.g:3893:1: ruleDotNode
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
    // InternalDotLanguage.g:3902:1: rule__DotSubGraph__EdgesAssignment_4_5 : ( ruleDotEdge ) ;
    public final void rule__DotSubGraph__EdgesAssignment_4_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3906:1: ( ( ruleDotEdge ) )
            // InternalDotLanguage.g:3907:1: ( ruleDotEdge )
            {
            // InternalDotLanguage.g:3907:1: ( ruleDotEdge )
            // InternalDotLanguage.g:3908:1: ruleDotEdge
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
    // InternalDotLanguage.g:3917:1: rule__DotNode__NameAssignment_0 : ( ruleDotID ) ;
    public final void rule__DotNode__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3921:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:3922:1: ( ruleDotID )
            {
            // InternalDotLanguage.g:3922:1: ( ruleDotID )
            // InternalDotLanguage.g:3923:1: ruleDotID
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
    // InternalDotLanguage.g:3932:1: rule__DotNode__SettingsAssignment_1_1 : ( ruleSetting ) ;
    public final void rule__DotNode__SettingsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3936:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3937:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3937:1: ( ruleSetting )
            // InternalDotLanguage.g:3938:1: ruleSetting
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
    // InternalDotLanguage.g:3947:1: rule__DotNode__SettingsAssignment_1_2_1 : ( ruleSetting ) ;
    public final void rule__DotNode__SettingsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3951:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3952:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3952:1: ( ruleSetting )
            // InternalDotLanguage.g:3953:1: ruleSetting
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
    // InternalDotLanguage.g:3962:1: rule__DirectedDotEdge__SourceAssignment_0 : ( ( ruleDotID ) ) ;
    public final void rule__DirectedDotEdge__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3966:1: ( ( ( ruleDotID ) ) )
            // InternalDotLanguage.g:3967:1: ( ( ruleDotID ) )
            {
            // InternalDotLanguage.g:3967:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:3968:1: ( ruleDotID )
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getSourceDotNodeCrossReference_0_0()); 
            // InternalDotLanguage.g:3969:1: ( ruleDotID )
            // InternalDotLanguage.g:3970:1: ruleDotID
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
    // InternalDotLanguage.g:3981:1: rule__DirectedDotEdge__TargetAssignment_2 : ( ( ruleDotID ) ) ;
    public final void rule__DirectedDotEdge__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3985:1: ( ( ( ruleDotID ) ) )
            // InternalDotLanguage.g:3986:1: ( ( ruleDotID ) )
            {
            // InternalDotLanguage.g:3986:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:3987:1: ( ruleDotID )
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getTargetDotNodeCrossReference_2_0()); 
            // InternalDotLanguage.g:3988:1: ( ruleDotID )
            // InternalDotLanguage.g:3989:1: ruleDotID
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
    // InternalDotLanguage.g:4000:1: rule__DirectedDotEdge__SettingsAssignment_3_1 : ( ruleSetting ) ;
    public final void rule__DirectedDotEdge__SettingsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:4004:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:4005:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:4005:1: ( ruleSetting )
            // InternalDotLanguage.g:4006:1: ruleSetting
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
    // InternalDotLanguage.g:4015:1: rule__DirectedDotEdge__SettingsAssignment_3_2_1 : ( ruleSetting ) ;
    public final void rule__DirectedDotEdge__SettingsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:4019:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:4020:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:4020:1: ( ruleSetting )
            // InternalDotLanguage.g:4021:1: ruleSetting
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
    // InternalDotLanguage.g:4030:1: rule__UndirectedDotEdge__SourceAssignment_0 : ( ( ruleDotID ) ) ;
    public final void rule__UndirectedDotEdge__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:4034:1: ( ( ( ruleDotID ) ) )
            // InternalDotLanguage.g:4035:1: ( ( ruleDotID ) )
            {
            // InternalDotLanguage.g:4035:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:4036:1: ( ruleDotID )
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getSourceDotNodeCrossReference_0_0()); 
            // InternalDotLanguage.g:4037:1: ( ruleDotID )
            // InternalDotLanguage.g:4038:1: ruleDotID
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
    // InternalDotLanguage.g:4049:1: rule__UndirectedDotEdge__TargetAssignment_2 : ( ( ruleDotID ) ) ;
    public final void rule__UndirectedDotEdge__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:4053:1: ( ( ( ruleDotID ) ) )
            // InternalDotLanguage.g:4054:1: ( ( ruleDotID ) )
            {
            // InternalDotLanguage.g:4054:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:4055:1: ( ruleDotID )
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getTargetDotNodeCrossReference_2_0()); 
            // InternalDotLanguage.g:4056:1: ( ruleDotID )
            // InternalDotLanguage.g:4057:1: ruleDotID
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
    // InternalDotLanguage.g:4068:1: rule__UndirectedDotEdge__SettingsAssignment_3_1 : ( ruleSetting ) ;
    public final void rule__UndirectedDotEdge__SettingsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:4072:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:4073:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:4073:1: ( ruleSetting )
            // InternalDotLanguage.g:4074:1: ruleSetting
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
    // InternalDotLanguage.g:4083:1: rule__UndirectedDotEdge__SettingsAssignment_3_2_1 : ( ruleSetting ) ;
    public final void rule__UndirectedDotEdge__SettingsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:4087:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:4088:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:4088:1: ( ruleSetting )
            // InternalDotLanguage.g:4089:1: ruleSetting
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
    // InternalDotLanguage.g:4098:1: rule__Setting__AttributeAssignment_0 : ( ruleDotID ) ;
    public final void rule__Setting__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:4102:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:4103:1: ( ruleDotID )
            {
            // InternalDotLanguage.g:4103:1: ( ruleDotID )
            // InternalDotLanguage.g:4104:1: ruleDotID
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
    // InternalDotLanguage.g:4113:1: rule__Setting__ValueAssignment_2 : ( ruleDotID ) ;
    public final void rule__Setting__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:4117:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:4118:1: ( ruleDotID )
            {
            // InternalDotLanguage.g:4118:1: ( ruleDotID )
            // InternalDotLanguage.g:4119:1: ruleDotID
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
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\6\uffff\1\6\1\5";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\6\1\12\1\10\1\11\5\uffff\1\1\6\uffff\1\2\1\3\1\4\3\uffff\1\7",
            "",
            "",
            "",
            "",
            "\5\14\5\uffff\1\14\1\uffff\2\14\1\uffff\1\14\1\uffff\3\14\2\13\1\uffff\1\14",
            "\5\14\5\uffff\1\14\1\uffff\2\14\1\uffff\1\14\1\uffff\3\14\2\13\1\uffff\1\14",
            "\1\10\1\11",
            "\5\14\5\uffff\1\14\1\uffff\2\14\1\uffff\1\14\1\uffff\3\14\2\13\1\uffff\1\14",
            "\5\14\5\uffff\1\14\1\uffff\2\14\1\uffff\1\14\1\uffff\3\14\2\13\1\uffff\1\14",
            "\5\14\5\uffff\1\14\1\uffff\2\14\1\uffff\1\14\1\uffff\3\14\2\13\1\uffff\1\14",
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
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000A0000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000180L});
    }


}