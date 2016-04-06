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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOTSTRINGTERM", "RULE_NUMPREFIXEDID", "RULE_ID", "RULE_DOUBLE", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'graph'", "'{'", "'}'", "'subgraph'", "'['", "']'", "';'", "','", "'node'", "'edge'", "'->'", "'--'", "'='", "'-'", "'digraph'"
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


    // $ANTLR start "entryRuleDotNode"
    // InternalDotLanguage.g:88:1: entryRuleDotNode : ruleDotNode EOF ;
    public final void entryRuleDotNode() throws RecognitionException {
        try {
            // InternalDotLanguage.g:89:1: ( ruleDotNode EOF )
            // InternalDotLanguage.g:90:1: ruleDotNode EOF
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
    // InternalDotLanguage.g:97:1: ruleDotNode : ( ( rule__DotNode__Group__0 ) ) ;
    public final void ruleDotNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:101:2: ( ( ( rule__DotNode__Group__0 ) ) )
            // InternalDotLanguage.g:102:1: ( ( rule__DotNode__Group__0 ) )
            {
            // InternalDotLanguage.g:102:1: ( ( rule__DotNode__Group__0 ) )
            // InternalDotLanguage.g:103:1: ( rule__DotNode__Group__0 )
            {
             before(grammarAccess.getDotNodeAccess().getGroup()); 
            // InternalDotLanguage.g:104:1: ( rule__DotNode__Group__0 )
            // InternalDotLanguage.g:104:2: rule__DotNode__Group__0
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
    // InternalDotLanguage.g:116:1: entryRuleDotEdge : ruleDotEdge EOF ;
    public final void entryRuleDotEdge() throws RecognitionException {
        try {
            // InternalDotLanguage.g:117:1: ( ruleDotEdge EOF )
            // InternalDotLanguage.g:118:1: ruleDotEdge EOF
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
    // InternalDotLanguage.g:125:1: ruleDotEdge : ( ( rule__DotEdge__Alternatives ) ) ;
    public final void ruleDotEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:129:2: ( ( ( rule__DotEdge__Alternatives ) ) )
            // InternalDotLanguage.g:130:1: ( ( rule__DotEdge__Alternatives ) )
            {
            // InternalDotLanguage.g:130:1: ( ( rule__DotEdge__Alternatives ) )
            // InternalDotLanguage.g:131:1: ( rule__DotEdge__Alternatives )
            {
             before(grammarAccess.getDotEdgeAccess().getAlternatives()); 
            // InternalDotLanguage.g:132:1: ( rule__DotEdge__Alternatives )
            // InternalDotLanguage.g:132:2: rule__DotEdge__Alternatives
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
    // InternalDotLanguage.g:144:1: entryRuleDirectedDotEdge : ruleDirectedDotEdge EOF ;
    public final void entryRuleDirectedDotEdge() throws RecognitionException {
        try {
            // InternalDotLanguage.g:145:1: ( ruleDirectedDotEdge EOF )
            // InternalDotLanguage.g:146:1: ruleDirectedDotEdge EOF
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
    // InternalDotLanguage.g:153:1: ruleDirectedDotEdge : ( ( rule__DirectedDotEdge__Group__0 ) ) ;
    public final void ruleDirectedDotEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:157:2: ( ( ( rule__DirectedDotEdge__Group__0 ) ) )
            // InternalDotLanguage.g:158:1: ( ( rule__DirectedDotEdge__Group__0 ) )
            {
            // InternalDotLanguage.g:158:1: ( ( rule__DirectedDotEdge__Group__0 ) )
            // InternalDotLanguage.g:159:1: ( rule__DirectedDotEdge__Group__0 )
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getGroup()); 
            // InternalDotLanguage.g:160:1: ( rule__DirectedDotEdge__Group__0 )
            // InternalDotLanguage.g:160:2: rule__DirectedDotEdge__Group__0
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
    // InternalDotLanguage.g:172:1: entryRuleUndirectedDotEdge : ruleUndirectedDotEdge EOF ;
    public final void entryRuleUndirectedDotEdge() throws RecognitionException {
        try {
            // InternalDotLanguage.g:173:1: ( ruleUndirectedDotEdge EOF )
            // InternalDotLanguage.g:174:1: ruleUndirectedDotEdge EOF
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
    // InternalDotLanguage.g:181:1: ruleUndirectedDotEdge : ( ( rule__UndirectedDotEdge__Group__0 ) ) ;
    public final void ruleUndirectedDotEdge() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:185:2: ( ( ( rule__UndirectedDotEdge__Group__0 ) ) )
            // InternalDotLanguage.g:186:1: ( ( rule__UndirectedDotEdge__Group__0 ) )
            {
            // InternalDotLanguage.g:186:1: ( ( rule__UndirectedDotEdge__Group__0 ) )
            // InternalDotLanguage.g:187:1: ( rule__UndirectedDotEdge__Group__0 )
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getGroup()); 
            // InternalDotLanguage.g:188:1: ( rule__UndirectedDotEdge__Group__0 )
            // InternalDotLanguage.g:188:2: rule__UndirectedDotEdge__Group__0
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
    // InternalDotLanguage.g:200:1: entryRuleSetting : ruleSetting EOF ;
    public final void entryRuleSetting() throws RecognitionException {
        try {
            // InternalDotLanguage.g:201:1: ( ruleSetting EOF )
            // InternalDotLanguage.g:202:1: ruleSetting EOF
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
    // InternalDotLanguage.g:209:1: ruleSetting : ( ( rule__Setting__Group__0 ) ) ;
    public final void ruleSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:213:2: ( ( ( rule__Setting__Group__0 ) ) )
            // InternalDotLanguage.g:214:1: ( ( rule__Setting__Group__0 ) )
            {
            // InternalDotLanguage.g:214:1: ( ( rule__Setting__Group__0 ) )
            // InternalDotLanguage.g:215:1: ( rule__Setting__Group__0 )
            {
             before(grammarAccess.getSettingAccess().getGroup()); 
            // InternalDotLanguage.g:216:1: ( rule__Setting__Group__0 )
            // InternalDotLanguage.g:216:2: rule__Setting__Group__0
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


    // $ANTLR start "entryRuleDotID"
    // InternalDotLanguage.g:228:1: entryRuleDotID : ruleDotID EOF ;
    public final void entryRuleDotID() throws RecognitionException {
        try {
            // InternalDotLanguage.g:229:1: ( ruleDotID EOF )
            // InternalDotLanguage.g:230:1: ruleDotID EOF
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
    // InternalDotLanguage.g:237:1: ruleDotID : ( ( rule__DotID__Alternatives ) ) ;
    public final void ruleDotID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:241:2: ( ( ( rule__DotID__Alternatives ) ) )
            // InternalDotLanguage.g:242:1: ( ( rule__DotID__Alternatives ) )
            {
            // InternalDotLanguage.g:242:1: ( ( rule__DotID__Alternatives ) )
            // InternalDotLanguage.g:243:1: ( rule__DotID__Alternatives )
            {
             before(grammarAccess.getDotIDAccess().getAlternatives()); 
            // InternalDotLanguage.g:244:1: ( rule__DotID__Alternatives )
            // InternalDotLanguage.g:244:2: rule__DotID__Alternatives
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
    // InternalDotLanguage.g:256:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalDotLanguage.g:257:1: ( ruleNumber EOF )
            // InternalDotLanguage.g:258:1: ruleNumber EOF
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
    // InternalDotLanguage.g:265:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:269:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalDotLanguage.g:270:1: ( ( rule__Number__Group__0 ) )
            {
            // InternalDotLanguage.g:270:1: ( ( rule__Number__Group__0 ) )
            // InternalDotLanguage.g:271:1: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // InternalDotLanguage.g:272:1: ( rule__Number__Group__0 )
            // InternalDotLanguage.g:272:2: rule__Number__Group__0
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
    // InternalDotLanguage.g:284:1: rule__DotGraph__Alternatives_1 : ( ( ( rule__DotGraph__Group_1_0__0 ) ) | ( ( rule__DotGraph__Group_1_1__0 ) ) );
    public final void rule__DotGraph__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:288:1: ( ( ( rule__DotGraph__Group_1_0__0 ) ) | ( ( rule__DotGraph__Group_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14||LA1_0==28) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDotLanguage.g:289:1: ( ( rule__DotGraph__Group_1_0__0 ) )
                    {
                    // InternalDotLanguage.g:289:1: ( ( rule__DotGraph__Group_1_0__0 ) )
                    // InternalDotLanguage.g:290:1: ( rule__DotGraph__Group_1_0__0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getGroup_1_0()); 
                    // InternalDotLanguage.g:291:1: ( rule__DotGraph__Group_1_0__0 )
                    // InternalDotLanguage.g:291:2: rule__DotGraph__Group_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotGraph__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:295:6: ( ( rule__DotGraph__Group_1_1__0 ) )
                    {
                    // InternalDotLanguage.g:295:6: ( ( rule__DotGraph__Group_1_1__0 ) )
                    // InternalDotLanguage.g:296:1: ( rule__DotGraph__Group_1_1__0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getGroup_1_1()); 
                    // InternalDotLanguage.g:297:1: ( rule__DotGraph__Group_1_1__0 )
                    // InternalDotLanguage.g:297:2: rule__DotGraph__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:306:1: rule__DotGraph__Alternatives_1_0_0 : ( ( ( rule__DotGraph__DirectedGraphAssignment_1_0_0_0 ) ) | ( 'graph' ) );
    public final void rule__DotGraph__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:310:1: ( ( ( rule__DotGraph__DirectedGraphAssignment_1_0_0_0 ) ) | ( 'graph' ) )
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
                    // InternalDotLanguage.g:311:1: ( ( rule__DotGraph__DirectedGraphAssignment_1_0_0_0 ) )
                    {
                    // InternalDotLanguage.g:311:1: ( ( rule__DotGraph__DirectedGraphAssignment_1_0_0_0 ) )
                    // InternalDotLanguage.g:312:1: ( rule__DotGraph__DirectedGraphAssignment_1_0_0_0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getDirectedGraphAssignment_1_0_0_0()); 
                    // InternalDotLanguage.g:313:1: ( rule__DotGraph__DirectedGraphAssignment_1_0_0_0 )
                    // InternalDotLanguage.g:313:2: rule__DotGraph__DirectedGraphAssignment_1_0_0_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotGraph__DirectedGraphAssignment_1_0_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getDirectedGraphAssignment_1_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:317:6: ( 'graph' )
                    {
                    // InternalDotLanguage.g:317:6: ( 'graph' )
                    // InternalDotLanguage.g:318:1: 'graph'
                    {
                     before(grammarAccess.getDotGraphAccess().getGraphKeyword_1_0_0_1()); 
                    match(input,14,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:330:1: rule__DotGraph__Alternatives_3 : ( ( ( rule__DotGraph__Group_3_0__0 ) ) | ( ( rule__DotGraph__Group_3_1__0 ) ) | ( ( rule__DotGraph__Group_3_2__0 ) ) | ( ( rule__DotGraph__SubgraphsAssignment_3_3 ) ) | ( ( rule__DotGraph__NodesAssignment_3_4 ) ) | ( ( rule__DotGraph__EdgesAssignment_3_5 ) ) );
    public final void rule__DotGraph__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:334:1: ( ( ( rule__DotGraph__Group_3_0__0 ) ) | ( ( rule__DotGraph__Group_3_1__0 ) ) | ( ( rule__DotGraph__Group_3_2__0 ) ) | ( ( rule__DotGraph__SubgraphsAssignment_3_3 ) ) | ( ( rule__DotGraph__NodesAssignment_3_4 ) ) | ( ( rule__DotGraph__EdgesAssignment_3_5 ) ) )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalDotLanguage.g:335:1: ( ( rule__DotGraph__Group_3_0__0 ) )
                    {
                    // InternalDotLanguage.g:335:1: ( ( rule__DotGraph__Group_3_0__0 ) )
                    // InternalDotLanguage.g:336:1: ( rule__DotGraph__Group_3_0__0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getGroup_3_0()); 
                    // InternalDotLanguage.g:337:1: ( rule__DotGraph__Group_3_0__0 )
                    // InternalDotLanguage.g:337:2: rule__DotGraph__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotGraph__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:341:6: ( ( rule__DotGraph__Group_3_1__0 ) )
                    {
                    // InternalDotLanguage.g:341:6: ( ( rule__DotGraph__Group_3_1__0 ) )
                    // InternalDotLanguage.g:342:1: ( rule__DotGraph__Group_3_1__0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getGroup_3_1()); 
                    // InternalDotLanguage.g:343:1: ( rule__DotGraph__Group_3_1__0 )
                    // InternalDotLanguage.g:343:2: rule__DotGraph__Group_3_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotGraph__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getGroup_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDotLanguage.g:347:6: ( ( rule__DotGraph__Group_3_2__0 ) )
                    {
                    // InternalDotLanguage.g:347:6: ( ( rule__DotGraph__Group_3_2__0 ) )
                    // InternalDotLanguage.g:348:1: ( rule__DotGraph__Group_3_2__0 )
                    {
                     before(grammarAccess.getDotGraphAccess().getGroup_3_2()); 
                    // InternalDotLanguage.g:349:1: ( rule__DotGraph__Group_3_2__0 )
                    // InternalDotLanguage.g:349:2: rule__DotGraph__Group_3_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotGraph__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getGroup_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDotLanguage.g:353:6: ( ( rule__DotGraph__SubgraphsAssignment_3_3 ) )
                    {
                    // InternalDotLanguage.g:353:6: ( ( rule__DotGraph__SubgraphsAssignment_3_3 ) )
                    // InternalDotLanguage.g:354:1: ( rule__DotGraph__SubgraphsAssignment_3_3 )
                    {
                     before(grammarAccess.getDotGraphAccess().getSubgraphsAssignment_3_3()); 
                    // InternalDotLanguage.g:355:1: ( rule__DotGraph__SubgraphsAssignment_3_3 )
                    // InternalDotLanguage.g:355:2: rule__DotGraph__SubgraphsAssignment_3_3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotGraph__SubgraphsAssignment_3_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getSubgraphsAssignment_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDotLanguage.g:359:6: ( ( rule__DotGraph__NodesAssignment_3_4 ) )
                    {
                    // InternalDotLanguage.g:359:6: ( ( rule__DotGraph__NodesAssignment_3_4 ) )
                    // InternalDotLanguage.g:360:1: ( rule__DotGraph__NodesAssignment_3_4 )
                    {
                     before(grammarAccess.getDotGraphAccess().getNodesAssignment_3_4()); 
                    // InternalDotLanguage.g:361:1: ( rule__DotGraph__NodesAssignment_3_4 )
                    // InternalDotLanguage.g:361:2: rule__DotGraph__NodesAssignment_3_4
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__DotGraph__NodesAssignment_3_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getDotGraphAccess().getNodesAssignment_3_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDotLanguage.g:365:6: ( ( rule__DotGraph__EdgesAssignment_3_5 ) )
                    {
                    // InternalDotLanguage.g:365:6: ( ( rule__DotGraph__EdgesAssignment_3_5 ) )
                    // InternalDotLanguage.g:366:1: ( rule__DotGraph__EdgesAssignment_3_5 )
                    {
                     before(grammarAccess.getDotGraphAccess().getEdgesAssignment_3_5()); 
                    // InternalDotLanguage.g:367:1: ( rule__DotGraph__EdgesAssignment_3_5 )
                    // InternalDotLanguage.g:367:2: rule__DotGraph__EdgesAssignment_3_5
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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


    // $ANTLR start "rule__DotEdge__Alternatives"
    // InternalDotLanguage.g:376:1: rule__DotEdge__Alternatives : ( ( ruleDirectedDotEdge ) | ( ruleUndirectedDotEdge ) );
    public final void rule__DotEdge__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:380:1: ( ( ruleDirectedDotEdge ) | ( ruleUndirectedDotEdge ) )
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
                    // InternalDotLanguage.g:381:1: ( ruleDirectedDotEdge )
                    {
                    // InternalDotLanguage.g:381:1: ( ruleDirectedDotEdge )
                    // InternalDotLanguage.g:382:1: ruleDirectedDotEdge
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
                    // InternalDotLanguage.g:387:6: ( ruleUndirectedDotEdge )
                    {
                    // InternalDotLanguage.g:387:6: ( ruleUndirectedDotEdge )
                    // InternalDotLanguage.g:388:1: ruleUndirectedDotEdge
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
    // InternalDotLanguage.g:398:1: rule__DotID__Alternatives : ( ( RULE_DOTSTRINGTERM ) | ( RULE_NUMPREFIXEDID ) | ( ruleNumber ) | ( RULE_ID ) );
    public final void rule__DotID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:402:1: ( ( RULE_DOTSTRINGTERM ) | ( RULE_NUMPREFIXEDID ) | ( ruleNumber ) | ( RULE_ID ) )
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
                    // InternalDotLanguage.g:403:1: ( RULE_DOTSTRINGTERM )
                    {
                    // InternalDotLanguage.g:403:1: ( RULE_DOTSTRINGTERM )
                    // InternalDotLanguage.g:404:1: RULE_DOTSTRINGTERM
                    {
                     before(grammarAccess.getDotIDAccess().getDOTSTRINGTERMTerminalRuleCall_0()); 
                    match(input,RULE_DOTSTRINGTERM,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getDotIDAccess().getDOTSTRINGTERMTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:409:6: ( RULE_NUMPREFIXEDID )
                    {
                    // InternalDotLanguage.g:409:6: ( RULE_NUMPREFIXEDID )
                    // InternalDotLanguage.g:410:1: RULE_NUMPREFIXEDID
                    {
                     before(grammarAccess.getDotIDAccess().getNUMPREFIXEDIDTerminalRuleCall_1()); 
                    match(input,RULE_NUMPREFIXEDID,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getDotIDAccess().getNUMPREFIXEDIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDotLanguage.g:415:6: ( ruleNumber )
                    {
                    // InternalDotLanguage.g:415:6: ( ruleNumber )
                    // InternalDotLanguage.g:416:1: ruleNumber
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
                    // InternalDotLanguage.g:421:6: ( RULE_ID )
                    {
                    // InternalDotLanguage.g:421:6: ( RULE_ID )
                    // InternalDotLanguage.g:422:1: RULE_ID
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
    // InternalDotLanguage.g:432:1: rule__Number__Alternatives_1 : ( ( RULE_DOUBLE ) | ( RULE_INT ) );
    public final void rule__Number__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:436:1: ( ( RULE_DOUBLE ) | ( RULE_INT ) )
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
                    // InternalDotLanguage.g:437:1: ( RULE_DOUBLE )
                    {
                    // InternalDotLanguage.g:437:1: ( RULE_DOUBLE )
                    // InternalDotLanguage.g:438:1: RULE_DOUBLE
                    {
                     before(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_1_0()); 
                    match(input,RULE_DOUBLE,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDotLanguage.g:443:6: ( RULE_INT )
                    {
                    // InternalDotLanguage.g:443:6: ( RULE_INT )
                    // InternalDotLanguage.g:444:1: RULE_INT
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
    // InternalDotLanguage.g:456:1: rule__DotGraph__Group__0 : rule__DotGraph__Group__0__Impl rule__DotGraph__Group__1 ;
    public final void rule__DotGraph__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:460:1: ( rule__DotGraph__Group__0__Impl rule__DotGraph__Group__1 )
            // InternalDotLanguage.g:461:2: rule__DotGraph__Group__0__Impl rule__DotGraph__Group__1
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
    // InternalDotLanguage.g:468:1: rule__DotGraph__Group__0__Impl : ( () ) ;
    public final void rule__DotGraph__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:472:1: ( ( () ) )
            // InternalDotLanguage.g:473:1: ( () )
            {
            // InternalDotLanguage.g:473:1: ( () )
            // InternalDotLanguage.g:474:1: ()
            {
             before(grammarAccess.getDotGraphAccess().getDotGraphAction_0()); 
            // InternalDotLanguage.g:475:1: ()
            // InternalDotLanguage.g:477:1: 
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
    // InternalDotLanguage.g:487:1: rule__DotGraph__Group__1 : rule__DotGraph__Group__1__Impl rule__DotGraph__Group__2 ;
    public final void rule__DotGraph__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:491:1: ( rule__DotGraph__Group__1__Impl rule__DotGraph__Group__2 )
            // InternalDotLanguage.g:492:2: rule__DotGraph__Group__1__Impl rule__DotGraph__Group__2
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
    // InternalDotLanguage.g:499:1: rule__DotGraph__Group__1__Impl : ( ( rule__DotGraph__Alternatives_1 ) ) ;
    public final void rule__DotGraph__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:503:1: ( ( ( rule__DotGraph__Alternatives_1 ) ) )
            // InternalDotLanguage.g:504:1: ( ( rule__DotGraph__Alternatives_1 ) )
            {
            // InternalDotLanguage.g:504:1: ( ( rule__DotGraph__Alternatives_1 ) )
            // InternalDotLanguage.g:505:1: ( rule__DotGraph__Alternatives_1 )
            {
             before(grammarAccess.getDotGraphAccess().getAlternatives_1()); 
            // InternalDotLanguage.g:506:1: ( rule__DotGraph__Alternatives_1 )
            // InternalDotLanguage.g:506:2: rule__DotGraph__Alternatives_1
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
    // InternalDotLanguage.g:516:1: rule__DotGraph__Group__2 : rule__DotGraph__Group__2__Impl rule__DotGraph__Group__3 ;
    public final void rule__DotGraph__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:520:1: ( rule__DotGraph__Group__2__Impl rule__DotGraph__Group__3 )
            // InternalDotLanguage.g:521:2: rule__DotGraph__Group__2__Impl rule__DotGraph__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
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
    // InternalDotLanguage.g:528:1: rule__DotGraph__Group__2__Impl : ( '{' ) ;
    public final void rule__DotGraph__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:532:1: ( ( '{' ) )
            // InternalDotLanguage.g:533:1: ( '{' )
            {
            // InternalDotLanguage.g:533:1: ( '{' )
            // InternalDotLanguage.g:534:1: '{'
            {
             before(grammarAccess.getDotGraphAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:547:1: rule__DotGraph__Group__3 : rule__DotGraph__Group__3__Impl rule__DotGraph__Group__4 ;
    public final void rule__DotGraph__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:551:1: ( rule__DotGraph__Group__3__Impl rule__DotGraph__Group__4 )
            // InternalDotLanguage.g:552:2: rule__DotGraph__Group__3__Impl rule__DotGraph__Group__4
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
    // InternalDotLanguage.g:559:1: rule__DotGraph__Group__3__Impl : ( ( rule__DotGraph__Alternatives_3 )* ) ;
    public final void rule__DotGraph__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:563:1: ( ( ( rule__DotGraph__Alternatives_3 )* ) )
            // InternalDotLanguage.g:564:1: ( ( rule__DotGraph__Alternatives_3 )* )
            {
            // InternalDotLanguage.g:564:1: ( ( rule__DotGraph__Alternatives_3 )* )
            // InternalDotLanguage.g:565:1: ( rule__DotGraph__Alternatives_3 )*
            {
             before(grammarAccess.getDotGraphAccess().getAlternatives_3()); 
            // InternalDotLanguage.g:566:1: ( rule__DotGraph__Alternatives_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_DOTSTRINGTERM && LA7_0<=RULE_INT)||LA7_0==14||LA7_0==17||(LA7_0>=22 && LA7_0<=23)||(LA7_0>=27 && LA7_0<=28)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDotLanguage.g:566:2: rule__DotGraph__Alternatives_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalDotLanguage.g:576:1: rule__DotGraph__Group__4 : rule__DotGraph__Group__4__Impl ;
    public final void rule__DotGraph__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:580:1: ( rule__DotGraph__Group__4__Impl )
            // InternalDotLanguage.g:581:2: rule__DotGraph__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:587:1: rule__DotGraph__Group__4__Impl : ( '}' ) ;
    public final void rule__DotGraph__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:591:1: ( ( '}' ) )
            // InternalDotLanguage.g:592:1: ( '}' )
            {
            // InternalDotLanguage.g:592:1: ( '}' )
            // InternalDotLanguage.g:593:1: '}'
            {
             before(grammarAccess.getDotGraphAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:616:1: rule__DotGraph__Group_1_0__0 : rule__DotGraph__Group_1_0__0__Impl rule__DotGraph__Group_1_0__1 ;
    public final void rule__DotGraph__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:620:1: ( rule__DotGraph__Group_1_0__0__Impl rule__DotGraph__Group_1_0__1 )
            // InternalDotLanguage.g:621:2: rule__DotGraph__Group_1_0__0__Impl rule__DotGraph__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__DotGraph__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:628:1: rule__DotGraph__Group_1_0__0__Impl : ( ( rule__DotGraph__Alternatives_1_0_0 ) ) ;
    public final void rule__DotGraph__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:632:1: ( ( ( rule__DotGraph__Alternatives_1_0_0 ) ) )
            // InternalDotLanguage.g:633:1: ( ( rule__DotGraph__Alternatives_1_0_0 ) )
            {
            // InternalDotLanguage.g:633:1: ( ( rule__DotGraph__Alternatives_1_0_0 ) )
            // InternalDotLanguage.g:634:1: ( rule__DotGraph__Alternatives_1_0_0 )
            {
             before(grammarAccess.getDotGraphAccess().getAlternatives_1_0_0()); 
            // InternalDotLanguage.g:635:1: ( rule__DotGraph__Alternatives_1_0_0 )
            // InternalDotLanguage.g:635:2: rule__DotGraph__Alternatives_1_0_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:645:1: rule__DotGraph__Group_1_0__1 : rule__DotGraph__Group_1_0__1__Impl ;
    public final void rule__DotGraph__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:649:1: ( rule__DotGraph__Group_1_0__1__Impl )
            // InternalDotLanguage.g:650:2: rule__DotGraph__Group_1_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:656:1: rule__DotGraph__Group_1_0__1__Impl : ( ( rule__DotGraph__IdAssignment_1_0_1 )? ) ;
    public final void rule__DotGraph__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:660:1: ( ( ( rule__DotGraph__IdAssignment_1_0_1 )? ) )
            // InternalDotLanguage.g:661:1: ( ( rule__DotGraph__IdAssignment_1_0_1 )? )
            {
            // InternalDotLanguage.g:661:1: ( ( rule__DotGraph__IdAssignment_1_0_1 )? )
            // InternalDotLanguage.g:662:1: ( rule__DotGraph__IdAssignment_1_0_1 )?
            {
             before(grammarAccess.getDotGraphAccess().getIdAssignment_1_0_1()); 
            // InternalDotLanguage.g:663:1: ( rule__DotGraph__IdAssignment_1_0_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_DOTSTRINGTERM && LA8_0<=RULE_INT)||LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDotLanguage.g:663:2: rule__DotGraph__IdAssignment_1_0_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:677:1: rule__DotGraph__Group_1_1__0 : rule__DotGraph__Group_1_1__0__Impl rule__DotGraph__Group_1_1__1 ;
    public final void rule__DotGraph__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:681:1: ( rule__DotGraph__Group_1_1__0__Impl rule__DotGraph__Group_1_1__1 )
            // InternalDotLanguage.g:682:2: rule__DotGraph__Group_1_1__0__Impl rule__DotGraph__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__DotGraph__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:689:1: rule__DotGraph__Group_1_1__0__Impl : ( 'subgraph' ) ;
    public final void rule__DotGraph__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:693:1: ( ( 'subgraph' ) )
            // InternalDotLanguage.g:694:1: ( 'subgraph' )
            {
            // InternalDotLanguage.g:694:1: ( 'subgraph' )
            // InternalDotLanguage.g:695:1: 'subgraph'
            {
             before(grammarAccess.getDotGraphAccess().getSubgraphKeyword_1_1_0()); 
            match(input,17,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:708:1: rule__DotGraph__Group_1_1__1 : rule__DotGraph__Group_1_1__1__Impl ;
    public final void rule__DotGraph__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:712:1: ( rule__DotGraph__Group_1_1__1__Impl )
            // InternalDotLanguage.g:713:2: rule__DotGraph__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:719:1: rule__DotGraph__Group_1_1__1__Impl : ( ( rule__DotGraph__IdAssignment_1_1_1 )? ) ;
    public final void rule__DotGraph__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:723:1: ( ( ( rule__DotGraph__IdAssignment_1_1_1 )? ) )
            // InternalDotLanguage.g:724:1: ( ( rule__DotGraph__IdAssignment_1_1_1 )? )
            {
            // InternalDotLanguage.g:724:1: ( ( rule__DotGraph__IdAssignment_1_1_1 )? )
            // InternalDotLanguage.g:725:1: ( rule__DotGraph__IdAssignment_1_1_1 )?
            {
             before(grammarAccess.getDotGraphAccess().getIdAssignment_1_1_1()); 
            // InternalDotLanguage.g:726:1: ( rule__DotGraph__IdAssignment_1_1_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_DOTSTRINGTERM && LA9_0<=RULE_INT)||LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDotLanguage.g:726:2: rule__DotGraph__IdAssignment_1_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:740:1: rule__DotGraph__Group_3_0__0 : rule__DotGraph__Group_3_0__0__Impl rule__DotGraph__Group_3_0__1 ;
    public final void rule__DotGraph__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:744:1: ( rule__DotGraph__Group_3_0__0__Impl rule__DotGraph__Group_3_0__1 )
            // InternalDotLanguage.g:745:2: rule__DotGraph__Group_3_0__0__Impl rule__DotGraph__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DotGraph__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:752:1: rule__DotGraph__Group_3_0__0__Impl : ( 'graph' ) ;
    public final void rule__DotGraph__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:756:1: ( ( 'graph' ) )
            // InternalDotLanguage.g:757:1: ( 'graph' )
            {
            // InternalDotLanguage.g:757:1: ( 'graph' )
            // InternalDotLanguage.g:758:1: 'graph'
            {
             before(grammarAccess.getDotGraphAccess().getGraphKeyword_3_0_0()); 
            match(input,14,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:771:1: rule__DotGraph__Group_3_0__1 : rule__DotGraph__Group_3_0__1__Impl rule__DotGraph__Group_3_0__2 ;
    public final void rule__DotGraph__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:775:1: ( rule__DotGraph__Group_3_0__1__Impl rule__DotGraph__Group_3_0__2 )
            // InternalDotLanguage.g:776:2: rule__DotGraph__Group_3_0__1__Impl rule__DotGraph__Group_3_0__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__DotGraph__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:783:1: rule__DotGraph__Group_3_0__1__Impl : ( '[' ) ;
    public final void rule__DotGraph__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:787:1: ( ( '[' ) )
            // InternalDotLanguage.g:788:1: ( '[' )
            {
            // InternalDotLanguage.g:788:1: ( '[' )
            // InternalDotLanguage.g:789:1: '['
            {
             before(grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_3_0_1()); 
            match(input,18,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:802:1: rule__DotGraph__Group_3_0__2 : rule__DotGraph__Group_3_0__2__Impl rule__DotGraph__Group_3_0__3 ;
    public final void rule__DotGraph__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:806:1: ( rule__DotGraph__Group_3_0__2__Impl rule__DotGraph__Group_3_0__3 )
            // InternalDotLanguage.g:807:2: rule__DotGraph__Group_3_0__2__Impl rule__DotGraph__Group_3_0__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DotGraph__Group_3_0__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:814:1: rule__DotGraph__Group_3_0__2__Impl : ( ( rule__DotGraph__GraphSettingsAssignment_3_0_2 ) ) ;
    public final void rule__DotGraph__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:818:1: ( ( ( rule__DotGraph__GraphSettingsAssignment_3_0_2 ) ) )
            // InternalDotLanguage.g:819:1: ( ( rule__DotGraph__GraphSettingsAssignment_3_0_2 ) )
            {
            // InternalDotLanguage.g:819:1: ( ( rule__DotGraph__GraphSettingsAssignment_3_0_2 ) )
            // InternalDotLanguage.g:820:1: ( rule__DotGraph__GraphSettingsAssignment_3_0_2 )
            {
             before(grammarAccess.getDotGraphAccess().getGraphSettingsAssignment_3_0_2()); 
            // InternalDotLanguage.g:821:1: ( rule__DotGraph__GraphSettingsAssignment_3_0_2 )
            // InternalDotLanguage.g:821:2: rule__DotGraph__GraphSettingsAssignment_3_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:831:1: rule__DotGraph__Group_3_0__3 : rule__DotGraph__Group_3_0__3__Impl rule__DotGraph__Group_3_0__4 ;
    public final void rule__DotGraph__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:835:1: ( rule__DotGraph__Group_3_0__3__Impl rule__DotGraph__Group_3_0__4 )
            // InternalDotLanguage.g:836:2: rule__DotGraph__Group_3_0__3__Impl rule__DotGraph__Group_3_0__4
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DotGraph__Group_3_0__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:843:1: rule__DotGraph__Group_3_0__3__Impl : ( ( rule__DotGraph__Group_3_0_3__0 )* ) ;
    public final void rule__DotGraph__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:847:1: ( ( ( rule__DotGraph__Group_3_0_3__0 )* ) )
            // InternalDotLanguage.g:848:1: ( ( rule__DotGraph__Group_3_0_3__0 )* )
            {
            // InternalDotLanguage.g:848:1: ( ( rule__DotGraph__Group_3_0_3__0 )* )
            // InternalDotLanguage.g:849:1: ( rule__DotGraph__Group_3_0_3__0 )*
            {
             before(grammarAccess.getDotGraphAccess().getGroup_3_0_3()); 
            // InternalDotLanguage.g:850:1: ( rule__DotGraph__Group_3_0_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDotLanguage.g:850:2: rule__DotGraph__Group_3_0_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalDotLanguage.g:860:1: rule__DotGraph__Group_3_0__4 : rule__DotGraph__Group_3_0__4__Impl rule__DotGraph__Group_3_0__5 ;
    public final void rule__DotGraph__Group_3_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:864:1: ( rule__DotGraph__Group_3_0__4__Impl rule__DotGraph__Group_3_0__5 )
            // InternalDotLanguage.g:865:2: rule__DotGraph__Group_3_0__4__Impl rule__DotGraph__Group_3_0__5
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__DotGraph__Group_3_0__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:872:1: rule__DotGraph__Group_3_0__4__Impl : ( ']' ) ;
    public final void rule__DotGraph__Group_3_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:876:1: ( ( ']' ) )
            // InternalDotLanguage.g:877:1: ( ']' )
            {
            // InternalDotLanguage.g:877:1: ( ']' )
            // InternalDotLanguage.g:878:1: ']'
            {
             before(grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_3_0_4()); 
            match(input,19,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:891:1: rule__DotGraph__Group_3_0__5 : rule__DotGraph__Group_3_0__5__Impl ;
    public final void rule__DotGraph__Group_3_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:895:1: ( rule__DotGraph__Group_3_0__5__Impl )
            // InternalDotLanguage.g:896:2: rule__DotGraph__Group_3_0__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:902:1: rule__DotGraph__Group_3_0__5__Impl : ( ( ';' )? ) ;
    public final void rule__DotGraph__Group_3_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:906:1: ( ( ( ';' )? ) )
            // InternalDotLanguage.g:907:1: ( ( ';' )? )
            {
            // InternalDotLanguage.g:907:1: ( ( ';' )? )
            // InternalDotLanguage.g:908:1: ( ';' )?
            {
             before(grammarAccess.getDotGraphAccess().getSemicolonKeyword_3_0_5()); 
            // InternalDotLanguage.g:909:1: ( ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDotLanguage.g:910:2: ';'
                    {
                    match(input,20,FollowSets000.FOLLOW_2); 

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
    // InternalDotLanguage.g:933:1: rule__DotGraph__Group_3_0_3__0 : rule__DotGraph__Group_3_0_3__0__Impl rule__DotGraph__Group_3_0_3__1 ;
    public final void rule__DotGraph__Group_3_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:937:1: ( rule__DotGraph__Group_3_0_3__0__Impl rule__DotGraph__Group_3_0_3__1 )
            // InternalDotLanguage.g:938:2: rule__DotGraph__Group_3_0_3__0__Impl rule__DotGraph__Group_3_0_3__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__DotGraph__Group_3_0_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:945:1: rule__DotGraph__Group_3_0_3__0__Impl : ( ',' ) ;
    public final void rule__DotGraph__Group_3_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:949:1: ( ( ',' ) )
            // InternalDotLanguage.g:950:1: ( ',' )
            {
            // InternalDotLanguage.g:950:1: ( ',' )
            // InternalDotLanguage.g:951:1: ','
            {
             before(grammarAccess.getDotGraphAccess().getCommaKeyword_3_0_3_0()); 
            match(input,21,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:964:1: rule__DotGraph__Group_3_0_3__1 : rule__DotGraph__Group_3_0_3__1__Impl ;
    public final void rule__DotGraph__Group_3_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:968:1: ( rule__DotGraph__Group_3_0_3__1__Impl )
            // InternalDotLanguage.g:969:2: rule__DotGraph__Group_3_0_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:975:1: rule__DotGraph__Group_3_0_3__1__Impl : ( ( rule__DotGraph__GraphSettingsAssignment_3_0_3_1 ) ) ;
    public final void rule__DotGraph__Group_3_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:979:1: ( ( ( rule__DotGraph__GraphSettingsAssignment_3_0_3_1 ) ) )
            // InternalDotLanguage.g:980:1: ( ( rule__DotGraph__GraphSettingsAssignment_3_0_3_1 ) )
            {
            // InternalDotLanguage.g:980:1: ( ( rule__DotGraph__GraphSettingsAssignment_3_0_3_1 ) )
            // InternalDotLanguage.g:981:1: ( rule__DotGraph__GraphSettingsAssignment_3_0_3_1 )
            {
             before(grammarAccess.getDotGraphAccess().getGraphSettingsAssignment_3_0_3_1()); 
            // InternalDotLanguage.g:982:1: ( rule__DotGraph__GraphSettingsAssignment_3_0_3_1 )
            // InternalDotLanguage.g:982:2: rule__DotGraph__GraphSettingsAssignment_3_0_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:996:1: rule__DotGraph__Group_3_1__0 : rule__DotGraph__Group_3_1__0__Impl rule__DotGraph__Group_3_1__1 ;
    public final void rule__DotGraph__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1000:1: ( rule__DotGraph__Group_3_1__0__Impl rule__DotGraph__Group_3_1__1 )
            // InternalDotLanguage.g:1001:2: rule__DotGraph__Group_3_1__0__Impl rule__DotGraph__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DotGraph__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:1008:1: rule__DotGraph__Group_3_1__0__Impl : ( 'node' ) ;
    public final void rule__DotGraph__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1012:1: ( ( 'node' ) )
            // InternalDotLanguage.g:1013:1: ( 'node' )
            {
            // InternalDotLanguage.g:1013:1: ( 'node' )
            // InternalDotLanguage.g:1014:1: 'node'
            {
             before(grammarAccess.getDotGraphAccess().getNodeKeyword_3_1_0()); 
            match(input,22,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:1027:1: rule__DotGraph__Group_3_1__1 : rule__DotGraph__Group_3_1__1__Impl rule__DotGraph__Group_3_1__2 ;
    public final void rule__DotGraph__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1031:1: ( rule__DotGraph__Group_3_1__1__Impl rule__DotGraph__Group_3_1__2 )
            // InternalDotLanguage.g:1032:2: rule__DotGraph__Group_3_1__1__Impl rule__DotGraph__Group_3_1__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__DotGraph__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:1039:1: rule__DotGraph__Group_3_1__1__Impl : ( '[' ) ;
    public final void rule__DotGraph__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1043:1: ( ( '[' ) )
            // InternalDotLanguage.g:1044:1: ( '[' )
            {
            // InternalDotLanguage.g:1044:1: ( '[' )
            // InternalDotLanguage.g:1045:1: '['
            {
             before(grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_3_1_1()); 
            match(input,18,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:1058:1: rule__DotGraph__Group_3_1__2 : rule__DotGraph__Group_3_1__2__Impl rule__DotGraph__Group_3_1__3 ;
    public final void rule__DotGraph__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1062:1: ( rule__DotGraph__Group_3_1__2__Impl rule__DotGraph__Group_3_1__3 )
            // InternalDotLanguage.g:1063:2: rule__DotGraph__Group_3_1__2__Impl rule__DotGraph__Group_3_1__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DotGraph__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:1070:1: rule__DotGraph__Group_3_1__2__Impl : ( ( rule__DotGraph__NodeSettingsAssignment_3_1_2 ) ) ;
    public final void rule__DotGraph__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1074:1: ( ( ( rule__DotGraph__NodeSettingsAssignment_3_1_2 ) ) )
            // InternalDotLanguage.g:1075:1: ( ( rule__DotGraph__NodeSettingsAssignment_3_1_2 ) )
            {
            // InternalDotLanguage.g:1075:1: ( ( rule__DotGraph__NodeSettingsAssignment_3_1_2 ) )
            // InternalDotLanguage.g:1076:1: ( rule__DotGraph__NodeSettingsAssignment_3_1_2 )
            {
             before(grammarAccess.getDotGraphAccess().getNodeSettingsAssignment_3_1_2()); 
            // InternalDotLanguage.g:1077:1: ( rule__DotGraph__NodeSettingsAssignment_3_1_2 )
            // InternalDotLanguage.g:1077:2: rule__DotGraph__NodeSettingsAssignment_3_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:1087:1: rule__DotGraph__Group_3_1__3 : rule__DotGraph__Group_3_1__3__Impl rule__DotGraph__Group_3_1__4 ;
    public final void rule__DotGraph__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1091:1: ( rule__DotGraph__Group_3_1__3__Impl rule__DotGraph__Group_3_1__4 )
            // InternalDotLanguage.g:1092:2: rule__DotGraph__Group_3_1__3__Impl rule__DotGraph__Group_3_1__4
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DotGraph__Group_3_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:1099:1: rule__DotGraph__Group_3_1__3__Impl : ( ( rule__DotGraph__Group_3_1_3__0 )* ) ;
    public final void rule__DotGraph__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1103:1: ( ( ( rule__DotGraph__Group_3_1_3__0 )* ) )
            // InternalDotLanguage.g:1104:1: ( ( rule__DotGraph__Group_3_1_3__0 )* )
            {
            // InternalDotLanguage.g:1104:1: ( ( rule__DotGraph__Group_3_1_3__0 )* )
            // InternalDotLanguage.g:1105:1: ( rule__DotGraph__Group_3_1_3__0 )*
            {
             before(grammarAccess.getDotGraphAccess().getGroup_3_1_3()); 
            // InternalDotLanguage.g:1106:1: ( rule__DotGraph__Group_3_1_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDotLanguage.g:1106:2: rule__DotGraph__Group_3_1_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalDotLanguage.g:1116:1: rule__DotGraph__Group_3_1__4 : rule__DotGraph__Group_3_1__4__Impl rule__DotGraph__Group_3_1__5 ;
    public final void rule__DotGraph__Group_3_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1120:1: ( rule__DotGraph__Group_3_1__4__Impl rule__DotGraph__Group_3_1__5 )
            // InternalDotLanguage.g:1121:2: rule__DotGraph__Group_3_1__4__Impl rule__DotGraph__Group_3_1__5
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__DotGraph__Group_3_1__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:1128:1: rule__DotGraph__Group_3_1__4__Impl : ( ']' ) ;
    public final void rule__DotGraph__Group_3_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1132:1: ( ( ']' ) )
            // InternalDotLanguage.g:1133:1: ( ']' )
            {
            // InternalDotLanguage.g:1133:1: ( ']' )
            // InternalDotLanguage.g:1134:1: ']'
            {
             before(grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_3_1_4()); 
            match(input,19,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:1147:1: rule__DotGraph__Group_3_1__5 : rule__DotGraph__Group_3_1__5__Impl ;
    public final void rule__DotGraph__Group_3_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1151:1: ( rule__DotGraph__Group_3_1__5__Impl )
            // InternalDotLanguage.g:1152:2: rule__DotGraph__Group_3_1__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:1158:1: rule__DotGraph__Group_3_1__5__Impl : ( ( ';' )? ) ;
    public final void rule__DotGraph__Group_3_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1162:1: ( ( ( ';' )? ) )
            // InternalDotLanguage.g:1163:1: ( ( ';' )? )
            {
            // InternalDotLanguage.g:1163:1: ( ( ';' )? )
            // InternalDotLanguage.g:1164:1: ( ';' )?
            {
             before(grammarAccess.getDotGraphAccess().getSemicolonKeyword_3_1_5()); 
            // InternalDotLanguage.g:1165:1: ( ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDotLanguage.g:1166:2: ';'
                    {
                    match(input,20,FollowSets000.FOLLOW_2); 

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
    // InternalDotLanguage.g:1189:1: rule__DotGraph__Group_3_1_3__0 : rule__DotGraph__Group_3_1_3__0__Impl rule__DotGraph__Group_3_1_3__1 ;
    public final void rule__DotGraph__Group_3_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1193:1: ( rule__DotGraph__Group_3_1_3__0__Impl rule__DotGraph__Group_3_1_3__1 )
            // InternalDotLanguage.g:1194:2: rule__DotGraph__Group_3_1_3__0__Impl rule__DotGraph__Group_3_1_3__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__DotGraph__Group_3_1_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:1201:1: rule__DotGraph__Group_3_1_3__0__Impl : ( ',' ) ;
    public final void rule__DotGraph__Group_3_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1205:1: ( ( ',' ) )
            // InternalDotLanguage.g:1206:1: ( ',' )
            {
            // InternalDotLanguage.g:1206:1: ( ',' )
            // InternalDotLanguage.g:1207:1: ','
            {
             before(grammarAccess.getDotGraphAccess().getCommaKeyword_3_1_3_0()); 
            match(input,21,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:1220:1: rule__DotGraph__Group_3_1_3__1 : rule__DotGraph__Group_3_1_3__1__Impl ;
    public final void rule__DotGraph__Group_3_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1224:1: ( rule__DotGraph__Group_3_1_3__1__Impl )
            // InternalDotLanguage.g:1225:2: rule__DotGraph__Group_3_1_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:1231:1: rule__DotGraph__Group_3_1_3__1__Impl : ( ( rule__DotGraph__NodeSettingsAssignment_3_1_3_1 ) ) ;
    public final void rule__DotGraph__Group_3_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1235:1: ( ( ( rule__DotGraph__NodeSettingsAssignment_3_1_3_1 ) ) )
            // InternalDotLanguage.g:1236:1: ( ( rule__DotGraph__NodeSettingsAssignment_3_1_3_1 ) )
            {
            // InternalDotLanguage.g:1236:1: ( ( rule__DotGraph__NodeSettingsAssignment_3_1_3_1 ) )
            // InternalDotLanguage.g:1237:1: ( rule__DotGraph__NodeSettingsAssignment_3_1_3_1 )
            {
             before(grammarAccess.getDotGraphAccess().getNodeSettingsAssignment_3_1_3_1()); 
            // InternalDotLanguage.g:1238:1: ( rule__DotGraph__NodeSettingsAssignment_3_1_3_1 )
            // InternalDotLanguage.g:1238:2: rule__DotGraph__NodeSettingsAssignment_3_1_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:1252:1: rule__DotGraph__Group_3_2__0 : rule__DotGraph__Group_3_2__0__Impl rule__DotGraph__Group_3_2__1 ;
    public final void rule__DotGraph__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1256:1: ( rule__DotGraph__Group_3_2__0__Impl rule__DotGraph__Group_3_2__1 )
            // InternalDotLanguage.g:1257:2: rule__DotGraph__Group_3_2__0__Impl rule__DotGraph__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DotGraph__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:1264:1: rule__DotGraph__Group_3_2__0__Impl : ( 'edge' ) ;
    public final void rule__DotGraph__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1268:1: ( ( 'edge' ) )
            // InternalDotLanguage.g:1269:1: ( 'edge' )
            {
            // InternalDotLanguage.g:1269:1: ( 'edge' )
            // InternalDotLanguage.g:1270:1: 'edge'
            {
             before(grammarAccess.getDotGraphAccess().getEdgeKeyword_3_2_0()); 
            match(input,23,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:1283:1: rule__DotGraph__Group_3_2__1 : rule__DotGraph__Group_3_2__1__Impl rule__DotGraph__Group_3_2__2 ;
    public final void rule__DotGraph__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1287:1: ( rule__DotGraph__Group_3_2__1__Impl rule__DotGraph__Group_3_2__2 )
            // InternalDotLanguage.g:1288:2: rule__DotGraph__Group_3_2__1__Impl rule__DotGraph__Group_3_2__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__DotGraph__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:1295:1: rule__DotGraph__Group_3_2__1__Impl : ( '[' ) ;
    public final void rule__DotGraph__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1299:1: ( ( '[' ) )
            // InternalDotLanguage.g:1300:1: ( '[' )
            {
            // InternalDotLanguage.g:1300:1: ( '[' )
            // InternalDotLanguage.g:1301:1: '['
            {
             before(grammarAccess.getDotGraphAccess().getLeftSquareBracketKeyword_3_2_1()); 
            match(input,18,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:1314:1: rule__DotGraph__Group_3_2__2 : rule__DotGraph__Group_3_2__2__Impl rule__DotGraph__Group_3_2__3 ;
    public final void rule__DotGraph__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1318:1: ( rule__DotGraph__Group_3_2__2__Impl rule__DotGraph__Group_3_2__3 )
            // InternalDotLanguage.g:1319:2: rule__DotGraph__Group_3_2__2__Impl rule__DotGraph__Group_3_2__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DotGraph__Group_3_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:1326:1: rule__DotGraph__Group_3_2__2__Impl : ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_2 ) ) ;
    public final void rule__DotGraph__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1330:1: ( ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_2 ) ) )
            // InternalDotLanguage.g:1331:1: ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_2 ) )
            {
            // InternalDotLanguage.g:1331:1: ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_2 ) )
            // InternalDotLanguage.g:1332:1: ( rule__DotGraph__EdgeSettingsAssignment_3_2_2 )
            {
             before(grammarAccess.getDotGraphAccess().getEdgeSettingsAssignment_3_2_2()); 
            // InternalDotLanguage.g:1333:1: ( rule__DotGraph__EdgeSettingsAssignment_3_2_2 )
            // InternalDotLanguage.g:1333:2: rule__DotGraph__EdgeSettingsAssignment_3_2_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:1343:1: rule__DotGraph__Group_3_2__3 : rule__DotGraph__Group_3_2__3__Impl rule__DotGraph__Group_3_2__4 ;
    public final void rule__DotGraph__Group_3_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1347:1: ( rule__DotGraph__Group_3_2__3__Impl rule__DotGraph__Group_3_2__4 )
            // InternalDotLanguage.g:1348:2: rule__DotGraph__Group_3_2__3__Impl rule__DotGraph__Group_3_2__4
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__DotGraph__Group_3_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:1355:1: rule__DotGraph__Group_3_2__3__Impl : ( ( rule__DotGraph__Group_3_2_3__0 )* ) ;
    public final void rule__DotGraph__Group_3_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1359:1: ( ( ( rule__DotGraph__Group_3_2_3__0 )* ) )
            // InternalDotLanguage.g:1360:1: ( ( rule__DotGraph__Group_3_2_3__0 )* )
            {
            // InternalDotLanguage.g:1360:1: ( ( rule__DotGraph__Group_3_2_3__0 )* )
            // InternalDotLanguage.g:1361:1: ( rule__DotGraph__Group_3_2_3__0 )*
            {
             before(grammarAccess.getDotGraphAccess().getGroup_3_2_3()); 
            // InternalDotLanguage.g:1362:1: ( rule__DotGraph__Group_3_2_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDotLanguage.g:1362:2: rule__DotGraph__Group_3_2_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalDotLanguage.g:1372:1: rule__DotGraph__Group_3_2__4 : rule__DotGraph__Group_3_2__4__Impl rule__DotGraph__Group_3_2__5 ;
    public final void rule__DotGraph__Group_3_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1376:1: ( rule__DotGraph__Group_3_2__4__Impl rule__DotGraph__Group_3_2__5 )
            // InternalDotLanguage.g:1377:2: rule__DotGraph__Group_3_2__4__Impl rule__DotGraph__Group_3_2__5
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__DotGraph__Group_3_2__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:1384:1: rule__DotGraph__Group_3_2__4__Impl : ( ']' ) ;
    public final void rule__DotGraph__Group_3_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1388:1: ( ( ']' ) )
            // InternalDotLanguage.g:1389:1: ( ']' )
            {
            // InternalDotLanguage.g:1389:1: ( ']' )
            // InternalDotLanguage.g:1390:1: ']'
            {
             before(grammarAccess.getDotGraphAccess().getRightSquareBracketKeyword_3_2_4()); 
            match(input,19,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:1403:1: rule__DotGraph__Group_3_2__5 : rule__DotGraph__Group_3_2__5__Impl ;
    public final void rule__DotGraph__Group_3_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1407:1: ( rule__DotGraph__Group_3_2__5__Impl )
            // InternalDotLanguage.g:1408:2: rule__DotGraph__Group_3_2__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:1414:1: rule__DotGraph__Group_3_2__5__Impl : ( ( ';' )? ) ;
    public final void rule__DotGraph__Group_3_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1418:1: ( ( ( ';' )? ) )
            // InternalDotLanguage.g:1419:1: ( ( ';' )? )
            {
            // InternalDotLanguage.g:1419:1: ( ( ';' )? )
            // InternalDotLanguage.g:1420:1: ( ';' )?
            {
             before(grammarAccess.getDotGraphAccess().getSemicolonKeyword_3_2_5()); 
            // InternalDotLanguage.g:1421:1: ( ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDotLanguage.g:1422:2: ';'
                    {
                    match(input,20,FollowSets000.FOLLOW_2); 

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
    // InternalDotLanguage.g:1445:1: rule__DotGraph__Group_3_2_3__0 : rule__DotGraph__Group_3_2_3__0__Impl rule__DotGraph__Group_3_2_3__1 ;
    public final void rule__DotGraph__Group_3_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1449:1: ( rule__DotGraph__Group_3_2_3__0__Impl rule__DotGraph__Group_3_2_3__1 )
            // InternalDotLanguage.g:1450:2: rule__DotGraph__Group_3_2_3__0__Impl rule__DotGraph__Group_3_2_3__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__DotGraph__Group_3_2_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:1457:1: rule__DotGraph__Group_3_2_3__0__Impl : ( ',' ) ;
    public final void rule__DotGraph__Group_3_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1461:1: ( ( ',' ) )
            // InternalDotLanguage.g:1462:1: ( ',' )
            {
            // InternalDotLanguage.g:1462:1: ( ',' )
            // InternalDotLanguage.g:1463:1: ','
            {
             before(grammarAccess.getDotGraphAccess().getCommaKeyword_3_2_3_0()); 
            match(input,21,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:1476:1: rule__DotGraph__Group_3_2_3__1 : rule__DotGraph__Group_3_2_3__1__Impl ;
    public final void rule__DotGraph__Group_3_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1480:1: ( rule__DotGraph__Group_3_2_3__1__Impl )
            // InternalDotLanguage.g:1481:2: rule__DotGraph__Group_3_2_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:1487:1: rule__DotGraph__Group_3_2_3__1__Impl : ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_3_1 ) ) ;
    public final void rule__DotGraph__Group_3_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1491:1: ( ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_3_1 ) ) )
            // InternalDotLanguage.g:1492:1: ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_3_1 ) )
            {
            // InternalDotLanguage.g:1492:1: ( ( rule__DotGraph__EdgeSettingsAssignment_3_2_3_1 ) )
            // InternalDotLanguage.g:1493:1: ( rule__DotGraph__EdgeSettingsAssignment_3_2_3_1 )
            {
             before(grammarAccess.getDotGraphAccess().getEdgeSettingsAssignment_3_2_3_1()); 
            // InternalDotLanguage.g:1494:1: ( rule__DotGraph__EdgeSettingsAssignment_3_2_3_1 )
            // InternalDotLanguage.g:1494:2: rule__DotGraph__EdgeSettingsAssignment_3_2_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:1508:1: rule__DotNode__Group__0 : rule__DotNode__Group__0__Impl rule__DotNode__Group__1 ;
    public final void rule__DotNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1512:1: ( rule__DotNode__Group__0__Impl rule__DotNode__Group__1 )
            // InternalDotLanguage.g:1513:2: rule__DotNode__Group__0__Impl rule__DotNode__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalDotLanguage.g:1520:1: rule__DotNode__Group__0__Impl : ( ( rule__DotNode__NameAssignment_0 ) ) ;
    public final void rule__DotNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1524:1: ( ( ( rule__DotNode__NameAssignment_0 ) ) )
            // InternalDotLanguage.g:1525:1: ( ( rule__DotNode__NameAssignment_0 ) )
            {
            // InternalDotLanguage.g:1525:1: ( ( rule__DotNode__NameAssignment_0 ) )
            // InternalDotLanguage.g:1526:1: ( rule__DotNode__NameAssignment_0 )
            {
             before(grammarAccess.getDotNodeAccess().getNameAssignment_0()); 
            // InternalDotLanguage.g:1527:1: ( rule__DotNode__NameAssignment_0 )
            // InternalDotLanguage.g:1527:2: rule__DotNode__NameAssignment_0
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
    // InternalDotLanguage.g:1537:1: rule__DotNode__Group__1 : rule__DotNode__Group__1__Impl rule__DotNode__Group__2 ;
    public final void rule__DotNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1541:1: ( rule__DotNode__Group__1__Impl rule__DotNode__Group__2 )
            // InternalDotLanguage.g:1542:2: rule__DotNode__Group__1__Impl rule__DotNode__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalDotLanguage.g:1549:1: rule__DotNode__Group__1__Impl : ( ( rule__DotNode__Group_1__0 )? ) ;
    public final void rule__DotNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1553:1: ( ( ( rule__DotNode__Group_1__0 )? ) )
            // InternalDotLanguage.g:1554:1: ( ( rule__DotNode__Group_1__0 )? )
            {
            // InternalDotLanguage.g:1554:1: ( ( rule__DotNode__Group_1__0 )? )
            // InternalDotLanguage.g:1555:1: ( rule__DotNode__Group_1__0 )?
            {
             before(grammarAccess.getDotNodeAccess().getGroup_1()); 
            // InternalDotLanguage.g:1556:1: ( rule__DotNode__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==18) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDotLanguage.g:1556:2: rule__DotNode__Group_1__0
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
    // InternalDotLanguage.g:1566:1: rule__DotNode__Group__2 : rule__DotNode__Group__2__Impl ;
    public final void rule__DotNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1570:1: ( rule__DotNode__Group__2__Impl )
            // InternalDotLanguage.g:1571:2: rule__DotNode__Group__2__Impl
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
    // InternalDotLanguage.g:1577:1: rule__DotNode__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__DotNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1581:1: ( ( ( ';' )? ) )
            // InternalDotLanguage.g:1582:1: ( ( ';' )? )
            {
            // InternalDotLanguage.g:1582:1: ( ( ';' )? )
            // InternalDotLanguage.g:1583:1: ( ';' )?
            {
             before(grammarAccess.getDotNodeAccess().getSemicolonKeyword_2()); 
            // InternalDotLanguage.g:1584:1: ( ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDotLanguage.g:1585:2: ';'
                    {
                    match(input,20,FollowSets000.FOLLOW_2); 

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
    // InternalDotLanguage.g:1602:1: rule__DotNode__Group_1__0 : rule__DotNode__Group_1__0__Impl rule__DotNode__Group_1__1 ;
    public final void rule__DotNode__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1606:1: ( rule__DotNode__Group_1__0__Impl rule__DotNode__Group_1__1 )
            // InternalDotLanguage.g:1607:2: rule__DotNode__Group_1__0__Impl rule__DotNode__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalDotLanguage.g:1614:1: rule__DotNode__Group_1__0__Impl : ( '[' ) ;
    public final void rule__DotNode__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1618:1: ( ( '[' ) )
            // InternalDotLanguage.g:1619:1: ( '[' )
            {
            // InternalDotLanguage.g:1619:1: ( '[' )
            // InternalDotLanguage.g:1620:1: '['
            {
             before(grammarAccess.getDotNodeAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:1633:1: rule__DotNode__Group_1__1 : rule__DotNode__Group_1__1__Impl rule__DotNode__Group_1__2 ;
    public final void rule__DotNode__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1637:1: ( rule__DotNode__Group_1__1__Impl rule__DotNode__Group_1__2 )
            // InternalDotLanguage.g:1638:2: rule__DotNode__Group_1__1__Impl rule__DotNode__Group_1__2
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
    // InternalDotLanguage.g:1645:1: rule__DotNode__Group_1__1__Impl : ( ( rule__DotNode__SettingsAssignment_1_1 ) ) ;
    public final void rule__DotNode__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1649:1: ( ( ( rule__DotNode__SettingsAssignment_1_1 ) ) )
            // InternalDotLanguage.g:1650:1: ( ( rule__DotNode__SettingsAssignment_1_1 ) )
            {
            // InternalDotLanguage.g:1650:1: ( ( rule__DotNode__SettingsAssignment_1_1 ) )
            // InternalDotLanguage.g:1651:1: ( rule__DotNode__SettingsAssignment_1_1 )
            {
             before(grammarAccess.getDotNodeAccess().getSettingsAssignment_1_1()); 
            // InternalDotLanguage.g:1652:1: ( rule__DotNode__SettingsAssignment_1_1 )
            // InternalDotLanguage.g:1652:2: rule__DotNode__SettingsAssignment_1_1
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
    // InternalDotLanguage.g:1662:1: rule__DotNode__Group_1__2 : rule__DotNode__Group_1__2__Impl rule__DotNode__Group_1__3 ;
    public final void rule__DotNode__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1666:1: ( rule__DotNode__Group_1__2__Impl rule__DotNode__Group_1__3 )
            // InternalDotLanguage.g:1667:2: rule__DotNode__Group_1__2__Impl rule__DotNode__Group_1__3
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
    // InternalDotLanguage.g:1674:1: rule__DotNode__Group_1__2__Impl : ( ( rule__DotNode__Group_1_2__0 )* ) ;
    public final void rule__DotNode__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1678:1: ( ( ( rule__DotNode__Group_1_2__0 )* ) )
            // InternalDotLanguage.g:1679:1: ( ( rule__DotNode__Group_1_2__0 )* )
            {
            // InternalDotLanguage.g:1679:1: ( ( rule__DotNode__Group_1_2__0 )* )
            // InternalDotLanguage.g:1680:1: ( rule__DotNode__Group_1_2__0 )*
            {
             before(grammarAccess.getDotNodeAccess().getGroup_1_2()); 
            // InternalDotLanguage.g:1681:1: ( rule__DotNode__Group_1_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDotLanguage.g:1681:2: rule__DotNode__Group_1_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
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
    // InternalDotLanguage.g:1691:1: rule__DotNode__Group_1__3 : rule__DotNode__Group_1__3__Impl ;
    public final void rule__DotNode__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1695:1: ( rule__DotNode__Group_1__3__Impl )
            // InternalDotLanguage.g:1696:2: rule__DotNode__Group_1__3__Impl
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
    // InternalDotLanguage.g:1702:1: rule__DotNode__Group_1__3__Impl : ( ']' ) ;
    public final void rule__DotNode__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1706:1: ( ( ']' ) )
            // InternalDotLanguage.g:1707:1: ( ']' )
            {
            // InternalDotLanguage.g:1707:1: ( ']' )
            // InternalDotLanguage.g:1708:1: ']'
            {
             before(grammarAccess.getDotNodeAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,19,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:1729:1: rule__DotNode__Group_1_2__0 : rule__DotNode__Group_1_2__0__Impl rule__DotNode__Group_1_2__1 ;
    public final void rule__DotNode__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1733:1: ( rule__DotNode__Group_1_2__0__Impl rule__DotNode__Group_1_2__1 )
            // InternalDotLanguage.g:1734:2: rule__DotNode__Group_1_2__0__Impl rule__DotNode__Group_1_2__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalDotLanguage.g:1741:1: rule__DotNode__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__DotNode__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1745:1: ( ( ',' ) )
            // InternalDotLanguage.g:1746:1: ( ',' )
            {
            // InternalDotLanguage.g:1746:1: ( ',' )
            // InternalDotLanguage.g:1747:1: ','
            {
             before(grammarAccess.getDotNodeAccess().getCommaKeyword_1_2_0()); 
            match(input,21,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:1760:1: rule__DotNode__Group_1_2__1 : rule__DotNode__Group_1_2__1__Impl ;
    public final void rule__DotNode__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1764:1: ( rule__DotNode__Group_1_2__1__Impl )
            // InternalDotLanguage.g:1765:2: rule__DotNode__Group_1_2__1__Impl
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
    // InternalDotLanguage.g:1771:1: rule__DotNode__Group_1_2__1__Impl : ( ( rule__DotNode__SettingsAssignment_1_2_1 ) ) ;
    public final void rule__DotNode__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1775:1: ( ( ( rule__DotNode__SettingsAssignment_1_2_1 ) ) )
            // InternalDotLanguage.g:1776:1: ( ( rule__DotNode__SettingsAssignment_1_2_1 ) )
            {
            // InternalDotLanguage.g:1776:1: ( ( rule__DotNode__SettingsAssignment_1_2_1 ) )
            // InternalDotLanguage.g:1777:1: ( rule__DotNode__SettingsAssignment_1_2_1 )
            {
             before(grammarAccess.getDotNodeAccess().getSettingsAssignment_1_2_1()); 
            // InternalDotLanguage.g:1778:1: ( rule__DotNode__SettingsAssignment_1_2_1 )
            // InternalDotLanguage.g:1778:2: rule__DotNode__SettingsAssignment_1_2_1
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
    // InternalDotLanguage.g:1792:1: rule__DirectedDotEdge__Group__0 : rule__DirectedDotEdge__Group__0__Impl rule__DirectedDotEdge__Group__1 ;
    public final void rule__DirectedDotEdge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1796:1: ( rule__DirectedDotEdge__Group__0__Impl rule__DirectedDotEdge__Group__1 )
            // InternalDotLanguage.g:1797:2: rule__DirectedDotEdge__Group__0__Impl rule__DirectedDotEdge__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
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
    // InternalDotLanguage.g:1804:1: rule__DirectedDotEdge__Group__0__Impl : ( ( rule__DirectedDotEdge__SourceAssignment_0 ) ) ;
    public final void rule__DirectedDotEdge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1808:1: ( ( ( rule__DirectedDotEdge__SourceAssignment_0 ) ) )
            // InternalDotLanguage.g:1809:1: ( ( rule__DirectedDotEdge__SourceAssignment_0 ) )
            {
            // InternalDotLanguage.g:1809:1: ( ( rule__DirectedDotEdge__SourceAssignment_0 ) )
            // InternalDotLanguage.g:1810:1: ( rule__DirectedDotEdge__SourceAssignment_0 )
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getSourceAssignment_0()); 
            // InternalDotLanguage.g:1811:1: ( rule__DirectedDotEdge__SourceAssignment_0 )
            // InternalDotLanguage.g:1811:2: rule__DirectedDotEdge__SourceAssignment_0
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
    // InternalDotLanguage.g:1821:1: rule__DirectedDotEdge__Group__1 : rule__DirectedDotEdge__Group__1__Impl rule__DirectedDotEdge__Group__2 ;
    public final void rule__DirectedDotEdge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1825:1: ( rule__DirectedDotEdge__Group__1__Impl rule__DirectedDotEdge__Group__2 )
            // InternalDotLanguage.g:1826:2: rule__DirectedDotEdge__Group__1__Impl rule__DirectedDotEdge__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalDotLanguage.g:1833:1: rule__DirectedDotEdge__Group__1__Impl : ( '->' ) ;
    public final void rule__DirectedDotEdge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1837:1: ( ( '->' ) )
            // InternalDotLanguage.g:1838:1: ( '->' )
            {
            // InternalDotLanguage.g:1838:1: ( '->' )
            // InternalDotLanguage.g:1839:1: '->'
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
    // InternalDotLanguage.g:1852:1: rule__DirectedDotEdge__Group__2 : rule__DirectedDotEdge__Group__2__Impl rule__DirectedDotEdge__Group__3 ;
    public final void rule__DirectedDotEdge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1856:1: ( rule__DirectedDotEdge__Group__2__Impl rule__DirectedDotEdge__Group__3 )
            // InternalDotLanguage.g:1857:2: rule__DirectedDotEdge__Group__2__Impl rule__DirectedDotEdge__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalDotLanguage.g:1864:1: rule__DirectedDotEdge__Group__2__Impl : ( ( rule__DirectedDotEdge__TargetAssignment_2 ) ) ;
    public final void rule__DirectedDotEdge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1868:1: ( ( ( rule__DirectedDotEdge__TargetAssignment_2 ) ) )
            // InternalDotLanguage.g:1869:1: ( ( rule__DirectedDotEdge__TargetAssignment_2 ) )
            {
            // InternalDotLanguage.g:1869:1: ( ( rule__DirectedDotEdge__TargetAssignment_2 ) )
            // InternalDotLanguage.g:1870:1: ( rule__DirectedDotEdge__TargetAssignment_2 )
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getTargetAssignment_2()); 
            // InternalDotLanguage.g:1871:1: ( rule__DirectedDotEdge__TargetAssignment_2 )
            // InternalDotLanguage.g:1871:2: rule__DirectedDotEdge__TargetAssignment_2
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
    // InternalDotLanguage.g:1881:1: rule__DirectedDotEdge__Group__3 : rule__DirectedDotEdge__Group__3__Impl rule__DirectedDotEdge__Group__4 ;
    public final void rule__DirectedDotEdge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1885:1: ( rule__DirectedDotEdge__Group__3__Impl rule__DirectedDotEdge__Group__4 )
            // InternalDotLanguage.g:1886:2: rule__DirectedDotEdge__Group__3__Impl rule__DirectedDotEdge__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalDotLanguage.g:1893:1: rule__DirectedDotEdge__Group__3__Impl : ( ( rule__DirectedDotEdge__Group_3__0 )? ) ;
    public final void rule__DirectedDotEdge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1897:1: ( ( ( rule__DirectedDotEdge__Group_3__0 )? ) )
            // InternalDotLanguage.g:1898:1: ( ( rule__DirectedDotEdge__Group_3__0 )? )
            {
            // InternalDotLanguage.g:1898:1: ( ( rule__DirectedDotEdge__Group_3__0 )? )
            // InternalDotLanguage.g:1899:1: ( rule__DirectedDotEdge__Group_3__0 )?
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getGroup_3()); 
            // InternalDotLanguage.g:1900:1: ( rule__DirectedDotEdge__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==18) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDotLanguage.g:1900:2: rule__DirectedDotEdge__Group_3__0
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
    // InternalDotLanguage.g:1910:1: rule__DirectedDotEdge__Group__4 : rule__DirectedDotEdge__Group__4__Impl ;
    public final void rule__DirectedDotEdge__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1914:1: ( rule__DirectedDotEdge__Group__4__Impl )
            // InternalDotLanguage.g:1915:2: rule__DirectedDotEdge__Group__4__Impl
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
    // InternalDotLanguage.g:1921:1: rule__DirectedDotEdge__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__DirectedDotEdge__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1925:1: ( ( ( ';' )? ) )
            // InternalDotLanguage.g:1926:1: ( ( ';' )? )
            {
            // InternalDotLanguage.g:1926:1: ( ( ';' )? )
            // InternalDotLanguage.g:1927:1: ( ';' )?
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getSemicolonKeyword_4()); 
            // InternalDotLanguage.g:1928:1: ( ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDotLanguage.g:1929:2: ';'
                    {
                    match(input,20,FollowSets000.FOLLOW_2); 

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
    // InternalDotLanguage.g:1950:1: rule__DirectedDotEdge__Group_3__0 : rule__DirectedDotEdge__Group_3__0__Impl rule__DirectedDotEdge__Group_3__1 ;
    public final void rule__DirectedDotEdge__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1954:1: ( rule__DirectedDotEdge__Group_3__0__Impl rule__DirectedDotEdge__Group_3__1 )
            // InternalDotLanguage.g:1955:2: rule__DirectedDotEdge__Group_3__0__Impl rule__DirectedDotEdge__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalDotLanguage.g:1962:1: rule__DirectedDotEdge__Group_3__0__Impl : ( '[' ) ;
    public final void rule__DirectedDotEdge__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1966:1: ( ( '[' ) )
            // InternalDotLanguage.g:1967:1: ( '[' )
            {
            // InternalDotLanguage.g:1967:1: ( '[' )
            // InternalDotLanguage.g:1968:1: '['
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:1981:1: rule__DirectedDotEdge__Group_3__1 : rule__DirectedDotEdge__Group_3__1__Impl rule__DirectedDotEdge__Group_3__2 ;
    public final void rule__DirectedDotEdge__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1985:1: ( rule__DirectedDotEdge__Group_3__1__Impl rule__DirectedDotEdge__Group_3__2 )
            // InternalDotLanguage.g:1986:2: rule__DirectedDotEdge__Group_3__1__Impl rule__DirectedDotEdge__Group_3__2
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
    // InternalDotLanguage.g:1993:1: rule__DirectedDotEdge__Group_3__1__Impl : ( ( rule__DirectedDotEdge__SettingsAssignment_3_1 ) ) ;
    public final void rule__DirectedDotEdge__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:1997:1: ( ( ( rule__DirectedDotEdge__SettingsAssignment_3_1 ) ) )
            // InternalDotLanguage.g:1998:1: ( ( rule__DirectedDotEdge__SettingsAssignment_3_1 ) )
            {
            // InternalDotLanguage.g:1998:1: ( ( rule__DirectedDotEdge__SettingsAssignment_3_1 ) )
            // InternalDotLanguage.g:1999:1: ( rule__DirectedDotEdge__SettingsAssignment_3_1 )
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getSettingsAssignment_3_1()); 
            // InternalDotLanguage.g:2000:1: ( rule__DirectedDotEdge__SettingsAssignment_3_1 )
            // InternalDotLanguage.g:2000:2: rule__DirectedDotEdge__SettingsAssignment_3_1
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
    // InternalDotLanguage.g:2010:1: rule__DirectedDotEdge__Group_3__2 : rule__DirectedDotEdge__Group_3__2__Impl rule__DirectedDotEdge__Group_3__3 ;
    public final void rule__DirectedDotEdge__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2014:1: ( rule__DirectedDotEdge__Group_3__2__Impl rule__DirectedDotEdge__Group_3__3 )
            // InternalDotLanguage.g:2015:2: rule__DirectedDotEdge__Group_3__2__Impl rule__DirectedDotEdge__Group_3__3
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
    // InternalDotLanguage.g:2022:1: rule__DirectedDotEdge__Group_3__2__Impl : ( ( rule__DirectedDotEdge__Group_3_2__0 )* ) ;
    public final void rule__DirectedDotEdge__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2026:1: ( ( ( rule__DirectedDotEdge__Group_3_2__0 )* ) )
            // InternalDotLanguage.g:2027:1: ( ( rule__DirectedDotEdge__Group_3_2__0 )* )
            {
            // InternalDotLanguage.g:2027:1: ( ( rule__DirectedDotEdge__Group_3_2__0 )* )
            // InternalDotLanguage.g:2028:1: ( rule__DirectedDotEdge__Group_3_2__0 )*
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getGroup_3_2()); 
            // InternalDotLanguage.g:2029:1: ( rule__DirectedDotEdge__Group_3_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDotLanguage.g:2029:2: rule__DirectedDotEdge__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__DirectedDotEdge__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalDotLanguage.g:2039:1: rule__DirectedDotEdge__Group_3__3 : rule__DirectedDotEdge__Group_3__3__Impl ;
    public final void rule__DirectedDotEdge__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2043:1: ( rule__DirectedDotEdge__Group_3__3__Impl )
            // InternalDotLanguage.g:2044:2: rule__DirectedDotEdge__Group_3__3__Impl
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
    // InternalDotLanguage.g:2050:1: rule__DirectedDotEdge__Group_3__3__Impl : ( ']' ) ;
    public final void rule__DirectedDotEdge__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2054:1: ( ( ']' ) )
            // InternalDotLanguage.g:2055:1: ( ']' )
            {
            // InternalDotLanguage.g:2055:1: ( ']' )
            // InternalDotLanguage.g:2056:1: ']'
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,19,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:2077:1: rule__DirectedDotEdge__Group_3_2__0 : rule__DirectedDotEdge__Group_3_2__0__Impl rule__DirectedDotEdge__Group_3_2__1 ;
    public final void rule__DirectedDotEdge__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2081:1: ( rule__DirectedDotEdge__Group_3_2__0__Impl rule__DirectedDotEdge__Group_3_2__1 )
            // InternalDotLanguage.g:2082:2: rule__DirectedDotEdge__Group_3_2__0__Impl rule__DirectedDotEdge__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalDotLanguage.g:2089:1: rule__DirectedDotEdge__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__DirectedDotEdge__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2093:1: ( ( ',' ) )
            // InternalDotLanguage.g:2094:1: ( ',' )
            {
            // InternalDotLanguage.g:2094:1: ( ',' )
            // InternalDotLanguage.g:2095:1: ','
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getCommaKeyword_3_2_0()); 
            match(input,21,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:2108:1: rule__DirectedDotEdge__Group_3_2__1 : rule__DirectedDotEdge__Group_3_2__1__Impl ;
    public final void rule__DirectedDotEdge__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2112:1: ( rule__DirectedDotEdge__Group_3_2__1__Impl )
            // InternalDotLanguage.g:2113:2: rule__DirectedDotEdge__Group_3_2__1__Impl
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
    // InternalDotLanguage.g:2119:1: rule__DirectedDotEdge__Group_3_2__1__Impl : ( ( rule__DirectedDotEdge__SettingsAssignment_3_2_1 ) ) ;
    public final void rule__DirectedDotEdge__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2123:1: ( ( ( rule__DirectedDotEdge__SettingsAssignment_3_2_1 ) ) )
            // InternalDotLanguage.g:2124:1: ( ( rule__DirectedDotEdge__SettingsAssignment_3_2_1 ) )
            {
            // InternalDotLanguage.g:2124:1: ( ( rule__DirectedDotEdge__SettingsAssignment_3_2_1 ) )
            // InternalDotLanguage.g:2125:1: ( rule__DirectedDotEdge__SettingsAssignment_3_2_1 )
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getSettingsAssignment_3_2_1()); 
            // InternalDotLanguage.g:2126:1: ( rule__DirectedDotEdge__SettingsAssignment_3_2_1 )
            // InternalDotLanguage.g:2126:2: rule__DirectedDotEdge__SettingsAssignment_3_2_1
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
    // InternalDotLanguage.g:2140:1: rule__UndirectedDotEdge__Group__0 : rule__UndirectedDotEdge__Group__0__Impl rule__UndirectedDotEdge__Group__1 ;
    public final void rule__UndirectedDotEdge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2144:1: ( rule__UndirectedDotEdge__Group__0__Impl rule__UndirectedDotEdge__Group__1 )
            // InternalDotLanguage.g:2145:2: rule__UndirectedDotEdge__Group__0__Impl rule__UndirectedDotEdge__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalDotLanguage.g:2152:1: rule__UndirectedDotEdge__Group__0__Impl : ( ( rule__UndirectedDotEdge__SourceAssignment_0 ) ) ;
    public final void rule__UndirectedDotEdge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2156:1: ( ( ( rule__UndirectedDotEdge__SourceAssignment_0 ) ) )
            // InternalDotLanguage.g:2157:1: ( ( rule__UndirectedDotEdge__SourceAssignment_0 ) )
            {
            // InternalDotLanguage.g:2157:1: ( ( rule__UndirectedDotEdge__SourceAssignment_0 ) )
            // InternalDotLanguage.g:2158:1: ( rule__UndirectedDotEdge__SourceAssignment_0 )
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getSourceAssignment_0()); 
            // InternalDotLanguage.g:2159:1: ( rule__UndirectedDotEdge__SourceAssignment_0 )
            // InternalDotLanguage.g:2159:2: rule__UndirectedDotEdge__SourceAssignment_0
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
    // InternalDotLanguage.g:2169:1: rule__UndirectedDotEdge__Group__1 : rule__UndirectedDotEdge__Group__1__Impl rule__UndirectedDotEdge__Group__2 ;
    public final void rule__UndirectedDotEdge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2173:1: ( rule__UndirectedDotEdge__Group__1__Impl rule__UndirectedDotEdge__Group__2 )
            // InternalDotLanguage.g:2174:2: rule__UndirectedDotEdge__Group__1__Impl rule__UndirectedDotEdge__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalDotLanguage.g:2181:1: rule__UndirectedDotEdge__Group__1__Impl : ( '--' ) ;
    public final void rule__UndirectedDotEdge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2185:1: ( ( '--' ) )
            // InternalDotLanguage.g:2186:1: ( '--' )
            {
            // InternalDotLanguage.g:2186:1: ( '--' )
            // InternalDotLanguage.g:2187:1: '--'
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
    // InternalDotLanguage.g:2200:1: rule__UndirectedDotEdge__Group__2 : rule__UndirectedDotEdge__Group__2__Impl rule__UndirectedDotEdge__Group__3 ;
    public final void rule__UndirectedDotEdge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2204:1: ( rule__UndirectedDotEdge__Group__2__Impl rule__UndirectedDotEdge__Group__3 )
            // InternalDotLanguage.g:2205:2: rule__UndirectedDotEdge__Group__2__Impl rule__UndirectedDotEdge__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalDotLanguage.g:2212:1: rule__UndirectedDotEdge__Group__2__Impl : ( ( rule__UndirectedDotEdge__TargetAssignment_2 ) ) ;
    public final void rule__UndirectedDotEdge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2216:1: ( ( ( rule__UndirectedDotEdge__TargetAssignment_2 ) ) )
            // InternalDotLanguage.g:2217:1: ( ( rule__UndirectedDotEdge__TargetAssignment_2 ) )
            {
            // InternalDotLanguage.g:2217:1: ( ( rule__UndirectedDotEdge__TargetAssignment_2 ) )
            // InternalDotLanguage.g:2218:1: ( rule__UndirectedDotEdge__TargetAssignment_2 )
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getTargetAssignment_2()); 
            // InternalDotLanguage.g:2219:1: ( rule__UndirectedDotEdge__TargetAssignment_2 )
            // InternalDotLanguage.g:2219:2: rule__UndirectedDotEdge__TargetAssignment_2
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
    // InternalDotLanguage.g:2229:1: rule__UndirectedDotEdge__Group__3 : rule__UndirectedDotEdge__Group__3__Impl rule__UndirectedDotEdge__Group__4 ;
    public final void rule__UndirectedDotEdge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2233:1: ( rule__UndirectedDotEdge__Group__3__Impl rule__UndirectedDotEdge__Group__4 )
            // InternalDotLanguage.g:2234:2: rule__UndirectedDotEdge__Group__3__Impl rule__UndirectedDotEdge__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_12);
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
    // InternalDotLanguage.g:2241:1: rule__UndirectedDotEdge__Group__3__Impl : ( ( rule__UndirectedDotEdge__Group_3__0 )? ) ;
    public final void rule__UndirectedDotEdge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2245:1: ( ( ( rule__UndirectedDotEdge__Group_3__0 )? ) )
            // InternalDotLanguage.g:2246:1: ( ( rule__UndirectedDotEdge__Group_3__0 )? )
            {
            // InternalDotLanguage.g:2246:1: ( ( rule__UndirectedDotEdge__Group_3__0 )? )
            // InternalDotLanguage.g:2247:1: ( rule__UndirectedDotEdge__Group_3__0 )?
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getGroup_3()); 
            // InternalDotLanguage.g:2248:1: ( rule__UndirectedDotEdge__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==18) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDotLanguage.g:2248:2: rule__UndirectedDotEdge__Group_3__0
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
    // InternalDotLanguage.g:2258:1: rule__UndirectedDotEdge__Group__4 : rule__UndirectedDotEdge__Group__4__Impl ;
    public final void rule__UndirectedDotEdge__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2262:1: ( rule__UndirectedDotEdge__Group__4__Impl )
            // InternalDotLanguage.g:2263:2: rule__UndirectedDotEdge__Group__4__Impl
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
    // InternalDotLanguage.g:2269:1: rule__UndirectedDotEdge__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__UndirectedDotEdge__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2273:1: ( ( ( ';' )? ) )
            // InternalDotLanguage.g:2274:1: ( ( ';' )? )
            {
            // InternalDotLanguage.g:2274:1: ( ( ';' )? )
            // InternalDotLanguage.g:2275:1: ( ';' )?
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getSemicolonKeyword_4()); 
            // InternalDotLanguage.g:2276:1: ( ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDotLanguage.g:2277:2: ';'
                    {
                    match(input,20,FollowSets000.FOLLOW_2); 

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
    // InternalDotLanguage.g:2298:1: rule__UndirectedDotEdge__Group_3__0 : rule__UndirectedDotEdge__Group_3__0__Impl rule__UndirectedDotEdge__Group_3__1 ;
    public final void rule__UndirectedDotEdge__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2302:1: ( rule__UndirectedDotEdge__Group_3__0__Impl rule__UndirectedDotEdge__Group_3__1 )
            // InternalDotLanguage.g:2303:2: rule__UndirectedDotEdge__Group_3__0__Impl rule__UndirectedDotEdge__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalDotLanguage.g:2310:1: rule__UndirectedDotEdge__Group_3__0__Impl : ( '[' ) ;
    public final void rule__UndirectedDotEdge__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2314:1: ( ( '[' ) )
            // InternalDotLanguage.g:2315:1: ( '[' )
            {
            // InternalDotLanguage.g:2315:1: ( '[' )
            // InternalDotLanguage.g:2316:1: '['
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:2329:1: rule__UndirectedDotEdge__Group_3__1 : rule__UndirectedDotEdge__Group_3__1__Impl rule__UndirectedDotEdge__Group_3__2 ;
    public final void rule__UndirectedDotEdge__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2333:1: ( rule__UndirectedDotEdge__Group_3__1__Impl rule__UndirectedDotEdge__Group_3__2 )
            // InternalDotLanguage.g:2334:2: rule__UndirectedDotEdge__Group_3__1__Impl rule__UndirectedDotEdge__Group_3__2
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
    // InternalDotLanguage.g:2341:1: rule__UndirectedDotEdge__Group_3__1__Impl : ( ( rule__UndirectedDotEdge__SettingsAssignment_3_1 ) ) ;
    public final void rule__UndirectedDotEdge__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2345:1: ( ( ( rule__UndirectedDotEdge__SettingsAssignment_3_1 ) ) )
            // InternalDotLanguage.g:2346:1: ( ( rule__UndirectedDotEdge__SettingsAssignment_3_1 ) )
            {
            // InternalDotLanguage.g:2346:1: ( ( rule__UndirectedDotEdge__SettingsAssignment_3_1 ) )
            // InternalDotLanguage.g:2347:1: ( rule__UndirectedDotEdge__SettingsAssignment_3_1 )
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getSettingsAssignment_3_1()); 
            // InternalDotLanguage.g:2348:1: ( rule__UndirectedDotEdge__SettingsAssignment_3_1 )
            // InternalDotLanguage.g:2348:2: rule__UndirectedDotEdge__SettingsAssignment_3_1
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
    // InternalDotLanguage.g:2358:1: rule__UndirectedDotEdge__Group_3__2 : rule__UndirectedDotEdge__Group_3__2__Impl rule__UndirectedDotEdge__Group_3__3 ;
    public final void rule__UndirectedDotEdge__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2362:1: ( rule__UndirectedDotEdge__Group_3__2__Impl rule__UndirectedDotEdge__Group_3__3 )
            // InternalDotLanguage.g:2363:2: rule__UndirectedDotEdge__Group_3__2__Impl rule__UndirectedDotEdge__Group_3__3
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
    // InternalDotLanguage.g:2370:1: rule__UndirectedDotEdge__Group_3__2__Impl : ( ( rule__UndirectedDotEdge__Group_3_2__0 )* ) ;
    public final void rule__UndirectedDotEdge__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2374:1: ( ( ( rule__UndirectedDotEdge__Group_3_2__0 )* ) )
            // InternalDotLanguage.g:2375:1: ( ( rule__UndirectedDotEdge__Group_3_2__0 )* )
            {
            // InternalDotLanguage.g:2375:1: ( ( rule__UndirectedDotEdge__Group_3_2__0 )* )
            // InternalDotLanguage.g:2376:1: ( rule__UndirectedDotEdge__Group_3_2__0 )*
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getGroup_3_2()); 
            // InternalDotLanguage.g:2377:1: ( rule__UndirectedDotEdge__Group_3_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==21) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDotLanguage.g:2377:2: rule__UndirectedDotEdge__Group_3_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__UndirectedDotEdge__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalDotLanguage.g:2387:1: rule__UndirectedDotEdge__Group_3__3 : rule__UndirectedDotEdge__Group_3__3__Impl ;
    public final void rule__UndirectedDotEdge__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2391:1: ( rule__UndirectedDotEdge__Group_3__3__Impl )
            // InternalDotLanguage.g:2392:2: rule__UndirectedDotEdge__Group_3__3__Impl
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
    // InternalDotLanguage.g:2398:1: rule__UndirectedDotEdge__Group_3__3__Impl : ( ']' ) ;
    public final void rule__UndirectedDotEdge__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2402:1: ( ( ']' ) )
            // InternalDotLanguage.g:2403:1: ( ']' )
            {
            // InternalDotLanguage.g:2403:1: ( ']' )
            // InternalDotLanguage.g:2404:1: ']'
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,19,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:2425:1: rule__UndirectedDotEdge__Group_3_2__0 : rule__UndirectedDotEdge__Group_3_2__0__Impl rule__UndirectedDotEdge__Group_3_2__1 ;
    public final void rule__UndirectedDotEdge__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2429:1: ( rule__UndirectedDotEdge__Group_3_2__0__Impl rule__UndirectedDotEdge__Group_3_2__1 )
            // InternalDotLanguage.g:2430:2: rule__UndirectedDotEdge__Group_3_2__0__Impl rule__UndirectedDotEdge__Group_3_2__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalDotLanguage.g:2437:1: rule__UndirectedDotEdge__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__UndirectedDotEdge__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2441:1: ( ( ',' ) )
            // InternalDotLanguage.g:2442:1: ( ',' )
            {
            // InternalDotLanguage.g:2442:1: ( ',' )
            // InternalDotLanguage.g:2443:1: ','
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getCommaKeyword_3_2_0()); 
            match(input,21,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:2456:1: rule__UndirectedDotEdge__Group_3_2__1 : rule__UndirectedDotEdge__Group_3_2__1__Impl ;
    public final void rule__UndirectedDotEdge__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2460:1: ( rule__UndirectedDotEdge__Group_3_2__1__Impl )
            // InternalDotLanguage.g:2461:2: rule__UndirectedDotEdge__Group_3_2__1__Impl
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
    // InternalDotLanguage.g:2467:1: rule__UndirectedDotEdge__Group_3_2__1__Impl : ( ( rule__UndirectedDotEdge__SettingsAssignment_3_2_1 ) ) ;
    public final void rule__UndirectedDotEdge__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2471:1: ( ( ( rule__UndirectedDotEdge__SettingsAssignment_3_2_1 ) ) )
            // InternalDotLanguage.g:2472:1: ( ( rule__UndirectedDotEdge__SettingsAssignment_3_2_1 ) )
            {
            // InternalDotLanguage.g:2472:1: ( ( rule__UndirectedDotEdge__SettingsAssignment_3_2_1 ) )
            // InternalDotLanguage.g:2473:1: ( rule__UndirectedDotEdge__SettingsAssignment_3_2_1 )
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getSettingsAssignment_3_2_1()); 
            // InternalDotLanguage.g:2474:1: ( rule__UndirectedDotEdge__SettingsAssignment_3_2_1 )
            // InternalDotLanguage.g:2474:2: rule__UndirectedDotEdge__SettingsAssignment_3_2_1
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
    // InternalDotLanguage.g:2488:1: rule__Setting__Group__0 : rule__Setting__Group__0__Impl rule__Setting__Group__1 ;
    public final void rule__Setting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2492:1: ( rule__Setting__Group__0__Impl rule__Setting__Group__1 )
            // InternalDotLanguage.g:2493:2: rule__Setting__Group__0__Impl rule__Setting__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
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
    // InternalDotLanguage.g:2500:1: rule__Setting__Group__0__Impl : ( ( rule__Setting__AttributeAssignment_0 ) ) ;
    public final void rule__Setting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2504:1: ( ( ( rule__Setting__AttributeAssignment_0 ) ) )
            // InternalDotLanguage.g:2505:1: ( ( rule__Setting__AttributeAssignment_0 ) )
            {
            // InternalDotLanguage.g:2505:1: ( ( rule__Setting__AttributeAssignment_0 ) )
            // InternalDotLanguage.g:2506:1: ( rule__Setting__AttributeAssignment_0 )
            {
             before(grammarAccess.getSettingAccess().getAttributeAssignment_0()); 
            // InternalDotLanguage.g:2507:1: ( rule__Setting__AttributeAssignment_0 )
            // InternalDotLanguage.g:2507:2: rule__Setting__AttributeAssignment_0
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
    // InternalDotLanguage.g:2517:1: rule__Setting__Group__1 : rule__Setting__Group__1__Impl rule__Setting__Group__2 ;
    public final void rule__Setting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2521:1: ( rule__Setting__Group__1__Impl rule__Setting__Group__2 )
            // InternalDotLanguage.g:2522:2: rule__Setting__Group__1__Impl rule__Setting__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
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
    // InternalDotLanguage.g:2529:1: rule__Setting__Group__1__Impl : ( '=' ) ;
    public final void rule__Setting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2533:1: ( ( '=' ) )
            // InternalDotLanguage.g:2534:1: ( '=' )
            {
            // InternalDotLanguage.g:2534:1: ( '=' )
            // InternalDotLanguage.g:2535:1: '='
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
    // InternalDotLanguage.g:2548:1: rule__Setting__Group__2 : rule__Setting__Group__2__Impl ;
    public final void rule__Setting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2552:1: ( rule__Setting__Group__2__Impl )
            // InternalDotLanguage.g:2553:2: rule__Setting__Group__2__Impl
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
    // InternalDotLanguage.g:2559:1: rule__Setting__Group__2__Impl : ( ( rule__Setting__ValueAssignment_2 ) ) ;
    public final void rule__Setting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2563:1: ( ( ( rule__Setting__ValueAssignment_2 ) ) )
            // InternalDotLanguage.g:2564:1: ( ( rule__Setting__ValueAssignment_2 ) )
            {
            // InternalDotLanguage.g:2564:1: ( ( rule__Setting__ValueAssignment_2 ) )
            // InternalDotLanguage.g:2565:1: ( rule__Setting__ValueAssignment_2 )
            {
             before(grammarAccess.getSettingAccess().getValueAssignment_2()); 
            // InternalDotLanguage.g:2566:1: ( rule__Setting__ValueAssignment_2 )
            // InternalDotLanguage.g:2566:2: rule__Setting__ValueAssignment_2
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
    // InternalDotLanguage.g:2582:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2586:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalDotLanguage.g:2587:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalDotLanguage.g:2594:1: rule__Number__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2598:1: ( ( ( '-' )? ) )
            // InternalDotLanguage.g:2599:1: ( ( '-' )? )
            {
            // InternalDotLanguage.g:2599:1: ( ( '-' )? )
            // InternalDotLanguage.g:2600:1: ( '-' )?
            {
             before(grammarAccess.getNumberAccess().getHyphenMinusKeyword_0()); 
            // InternalDotLanguage.g:2601:1: ( '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==27) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDotLanguage.g:2602:2: '-'
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
    // InternalDotLanguage.g:2613:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2617:1: ( rule__Number__Group__1__Impl )
            // InternalDotLanguage.g:2618:2: rule__Number__Group__1__Impl
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
    // InternalDotLanguage.g:2624:1: rule__Number__Group__1__Impl : ( ( rule__Number__Alternatives_1 ) ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2628:1: ( ( ( rule__Number__Alternatives_1 ) ) )
            // InternalDotLanguage.g:2629:1: ( ( rule__Number__Alternatives_1 ) )
            {
            // InternalDotLanguage.g:2629:1: ( ( rule__Number__Alternatives_1 ) )
            // InternalDotLanguage.g:2630:1: ( rule__Number__Alternatives_1 )
            {
             before(grammarAccess.getNumberAccess().getAlternatives_1()); 
            // InternalDotLanguage.g:2631:1: ( rule__Number__Alternatives_1 )
            // InternalDotLanguage.g:2631:2: rule__Number__Alternatives_1
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


    // $ANTLR start "rule__DotGraph__DirectedGraphAssignment_1_0_0_0"
    // InternalDotLanguage.g:2646:1: rule__DotGraph__DirectedGraphAssignment_1_0_0_0 : ( ( 'digraph' ) ) ;
    public final void rule__DotGraph__DirectedGraphAssignment_1_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2650:1: ( ( ( 'digraph' ) ) )
            // InternalDotLanguage.g:2651:1: ( ( 'digraph' ) )
            {
            // InternalDotLanguage.g:2651:1: ( ( 'digraph' ) )
            // InternalDotLanguage.g:2652:1: ( 'digraph' )
            {
             before(grammarAccess.getDotGraphAccess().getDirectedGraphDigraphKeyword_1_0_0_0_0()); 
            // InternalDotLanguage.g:2653:1: ( 'digraph' )
            // InternalDotLanguage.g:2654:1: 'digraph'
            {
             before(grammarAccess.getDotGraphAccess().getDirectedGraphDigraphKeyword_1_0_0_0_0()); 
            match(input,28,FollowSets000.FOLLOW_2); 
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
    // InternalDotLanguage.g:2669:1: rule__DotGraph__IdAssignment_1_0_1 : ( ruleDotID ) ;
    public final void rule__DotGraph__IdAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2673:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:2674:1: ( ruleDotID )
            {
            // InternalDotLanguage.g:2674:1: ( ruleDotID )
            // InternalDotLanguage.g:2675:1: ruleDotID
            {
             before(grammarAccess.getDotGraphAccess().getIdDotIDParserRuleCall_1_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2684:1: rule__DotGraph__IdAssignment_1_1_1 : ( ruleDotID ) ;
    public final void rule__DotGraph__IdAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2688:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:2689:1: ( ruleDotID )
            {
            // InternalDotLanguage.g:2689:1: ( ruleDotID )
            // InternalDotLanguage.g:2690:1: ruleDotID
            {
             before(grammarAccess.getDotGraphAccess().getIdDotIDParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2699:1: rule__DotGraph__GraphSettingsAssignment_3_0_2 : ( ruleSetting ) ;
    public final void rule__DotGraph__GraphSettingsAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2703:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:2704:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:2704:1: ( ruleSetting )
            // InternalDotLanguage.g:2705:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getGraphSettingsSettingParserRuleCall_3_0_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2714:1: rule__DotGraph__GraphSettingsAssignment_3_0_3_1 : ( ruleSetting ) ;
    public final void rule__DotGraph__GraphSettingsAssignment_3_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2718:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:2719:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:2719:1: ( ruleSetting )
            // InternalDotLanguage.g:2720:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getGraphSettingsSettingParserRuleCall_3_0_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2729:1: rule__DotGraph__NodeSettingsAssignment_3_1_2 : ( ruleSetting ) ;
    public final void rule__DotGraph__NodeSettingsAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2733:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:2734:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:2734:1: ( ruleSetting )
            // InternalDotLanguage.g:2735:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getNodeSettingsSettingParserRuleCall_3_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2744:1: rule__DotGraph__NodeSettingsAssignment_3_1_3_1 : ( ruleSetting ) ;
    public final void rule__DotGraph__NodeSettingsAssignment_3_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2748:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:2749:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:2749:1: ( ruleSetting )
            // InternalDotLanguage.g:2750:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getNodeSettingsSettingParserRuleCall_3_1_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2759:1: rule__DotGraph__EdgeSettingsAssignment_3_2_2 : ( ruleSetting ) ;
    public final void rule__DotGraph__EdgeSettingsAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2763:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:2764:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:2764:1: ( ruleSetting )
            // InternalDotLanguage.g:2765:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getEdgeSettingsSettingParserRuleCall_3_2_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2774:1: rule__DotGraph__EdgeSettingsAssignment_3_2_3_1 : ( ruleSetting ) ;
    public final void rule__DotGraph__EdgeSettingsAssignment_3_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2778:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:2779:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:2779:1: ( ruleSetting )
            // InternalDotLanguage.g:2780:1: ruleSetting
            {
             before(grammarAccess.getDotGraphAccess().getEdgeSettingsSettingParserRuleCall_3_2_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2789:1: rule__DotGraph__SubgraphsAssignment_3_3 : ( ruleDotGraph ) ;
    public final void rule__DotGraph__SubgraphsAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2793:1: ( ( ruleDotGraph ) )
            // InternalDotLanguage.g:2794:1: ( ruleDotGraph )
            {
            // InternalDotLanguage.g:2794:1: ( ruleDotGraph )
            // InternalDotLanguage.g:2795:1: ruleDotGraph
            {
             before(grammarAccess.getDotGraphAccess().getSubgraphsDotGraphParserRuleCall_3_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2804:1: rule__DotGraph__NodesAssignment_3_4 : ( ruleDotNode ) ;
    public final void rule__DotGraph__NodesAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2808:1: ( ( ruleDotNode ) )
            // InternalDotLanguage.g:2809:1: ( ruleDotNode )
            {
            // InternalDotLanguage.g:2809:1: ( ruleDotNode )
            // InternalDotLanguage.g:2810:1: ruleDotNode
            {
             before(grammarAccess.getDotGraphAccess().getNodesDotNodeParserRuleCall_3_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2819:1: rule__DotGraph__EdgesAssignment_3_5 : ( ruleDotEdge ) ;
    public final void rule__DotGraph__EdgesAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2823:1: ( ( ruleDotEdge ) )
            // InternalDotLanguage.g:2824:1: ( ruleDotEdge )
            {
            // InternalDotLanguage.g:2824:1: ( ruleDotEdge )
            // InternalDotLanguage.g:2825:1: ruleDotEdge
            {
             before(grammarAccess.getDotGraphAccess().getEdgesDotEdgeParserRuleCall_3_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalDotLanguage.g:2834:1: rule__DotNode__NameAssignment_0 : ( ruleDotID ) ;
    public final void rule__DotNode__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2838:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:2839:1: ( ruleDotID )
            {
            // InternalDotLanguage.g:2839:1: ( ruleDotID )
            // InternalDotLanguage.g:2840:1: ruleDotID
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
    // InternalDotLanguage.g:2849:1: rule__DotNode__SettingsAssignment_1_1 : ( ruleSetting ) ;
    public final void rule__DotNode__SettingsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2853:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:2854:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:2854:1: ( ruleSetting )
            // InternalDotLanguage.g:2855:1: ruleSetting
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
    // InternalDotLanguage.g:2864:1: rule__DotNode__SettingsAssignment_1_2_1 : ( ruleSetting ) ;
    public final void rule__DotNode__SettingsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2868:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:2869:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:2869:1: ( ruleSetting )
            // InternalDotLanguage.g:2870:1: ruleSetting
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
    // InternalDotLanguage.g:2879:1: rule__DirectedDotEdge__SourceAssignment_0 : ( ( ruleDotID ) ) ;
    public final void rule__DirectedDotEdge__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2883:1: ( ( ( ruleDotID ) ) )
            // InternalDotLanguage.g:2884:1: ( ( ruleDotID ) )
            {
            // InternalDotLanguage.g:2884:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:2885:1: ( ruleDotID )
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getSourceDotNodeCrossReference_0_0()); 
            // InternalDotLanguage.g:2886:1: ( ruleDotID )
            // InternalDotLanguage.g:2887:1: ruleDotID
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
    // InternalDotLanguage.g:2898:1: rule__DirectedDotEdge__TargetAssignment_2 : ( ( ruleDotID ) ) ;
    public final void rule__DirectedDotEdge__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2902:1: ( ( ( ruleDotID ) ) )
            // InternalDotLanguage.g:2903:1: ( ( ruleDotID ) )
            {
            // InternalDotLanguage.g:2903:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:2904:1: ( ruleDotID )
            {
             before(grammarAccess.getDirectedDotEdgeAccess().getTargetDotNodeCrossReference_2_0()); 
            // InternalDotLanguage.g:2905:1: ( ruleDotID )
            // InternalDotLanguage.g:2906:1: ruleDotID
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
    // InternalDotLanguage.g:2917:1: rule__DirectedDotEdge__SettingsAssignment_3_1 : ( ruleSetting ) ;
    public final void rule__DirectedDotEdge__SettingsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2921:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:2922:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:2922:1: ( ruleSetting )
            // InternalDotLanguage.g:2923:1: ruleSetting
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
    // InternalDotLanguage.g:2932:1: rule__DirectedDotEdge__SettingsAssignment_3_2_1 : ( ruleSetting ) ;
    public final void rule__DirectedDotEdge__SettingsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2936:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:2937:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:2937:1: ( ruleSetting )
            // InternalDotLanguage.g:2938:1: ruleSetting
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
    // InternalDotLanguage.g:2947:1: rule__UndirectedDotEdge__SourceAssignment_0 : ( ( ruleDotID ) ) ;
    public final void rule__UndirectedDotEdge__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2951:1: ( ( ( ruleDotID ) ) )
            // InternalDotLanguage.g:2952:1: ( ( ruleDotID ) )
            {
            // InternalDotLanguage.g:2952:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:2953:1: ( ruleDotID )
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getSourceDotNodeCrossReference_0_0()); 
            // InternalDotLanguage.g:2954:1: ( ruleDotID )
            // InternalDotLanguage.g:2955:1: ruleDotID
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
    // InternalDotLanguage.g:2966:1: rule__UndirectedDotEdge__TargetAssignment_2 : ( ( ruleDotID ) ) ;
    public final void rule__UndirectedDotEdge__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2970:1: ( ( ( ruleDotID ) ) )
            // InternalDotLanguage.g:2971:1: ( ( ruleDotID ) )
            {
            // InternalDotLanguage.g:2971:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:2972:1: ( ruleDotID )
            {
             before(grammarAccess.getUndirectedDotEdgeAccess().getTargetDotNodeCrossReference_2_0()); 
            // InternalDotLanguage.g:2973:1: ( ruleDotID )
            // InternalDotLanguage.g:2974:1: ruleDotID
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
    // InternalDotLanguage.g:2985:1: rule__UndirectedDotEdge__SettingsAssignment_3_1 : ( ruleSetting ) ;
    public final void rule__UndirectedDotEdge__SettingsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:2989:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:2990:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:2990:1: ( ruleSetting )
            // InternalDotLanguage.g:2991:1: ruleSetting
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
    // InternalDotLanguage.g:3000:1: rule__UndirectedDotEdge__SettingsAssignment_3_2_1 : ( ruleSetting ) ;
    public final void rule__UndirectedDotEdge__SettingsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3004:1: ( ( ruleSetting ) )
            // InternalDotLanguage.g:3005:1: ( ruleSetting )
            {
            // InternalDotLanguage.g:3005:1: ( ruleSetting )
            // InternalDotLanguage.g:3006:1: ruleSetting
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
    // InternalDotLanguage.g:3015:1: rule__Setting__AttributeAssignment_0 : ( ruleDotID ) ;
    public final void rule__Setting__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3019:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:3020:1: ( ruleDotID )
            {
            // InternalDotLanguage.g:3020:1: ( ruleDotID )
            // InternalDotLanguage.g:3021:1: ruleDotID
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
    // InternalDotLanguage.g:3030:1: rule__Setting__ValueAssignment_2 : ( ruleDotID ) ;
    public final void rule__Setting__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalDotLanguage.g:3034:1: ( ( ruleDotID ) )
            // InternalDotLanguage.g:3035:1: ( ruleDotID )
            {
            // InternalDotLanguage.g:3035:1: ( ruleDotID )
            // InternalDotLanguage.g:3036:1: ruleDotID
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


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\2\4\3\uffff\2\4\1\7\3\4\3\uffff";
    static final String dfa_3s = "\1\34\1\33\3\uffff\2\34\1\10\3\34\3\uffff";
    static final String dfa_4s = "\2\uffff\1\2\1\3\1\4\6\uffff\1\1\1\5\1\6";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\5\1\6\1\12\1\10\1\11\5\uffff\1\1\2\uffff\1\4\4\uffff\1\2\1\3\3\uffff\1\7\1\4",
            "\5\4\6\uffff\1\4\2\uffff\1\13\10\uffff\1\4",
            "",
            "",
            "",
            "\5\14\5\uffff\1\14\1\uffff\3\14\1\uffff\1\14\1\uffff\2\14\2\15\1\uffff\2\14",
            "\5\14\5\uffff\1\14\1\uffff\3\14\1\uffff\1\14\1\uffff\2\14\2\15\1\uffff\2\14",
            "\1\10\1\11",
            "\5\14\5\uffff\1\14\1\uffff\3\14\1\uffff\1\14\1\uffff\2\14\2\15\1\uffff\2\14",
            "\5\14\5\uffff\1\14\1\uffff\3\14\1\uffff\1\14\1\uffff\2\14\2\15\1\uffff\2\14",
            "\5\14\5\uffff\1\14\1\uffff\3\14\1\uffff\1\14\1\uffff\2\14\2\15\1\uffff\2\14",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

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
            return "330:1: rule__DotGraph__Alternatives_3 : ( ( ( rule__DotGraph__Group_3_0__0 ) ) | ( ( rule__DotGraph__Group_3_1__0 ) ) | ( ( rule__DotGraph__Group_3_2__0 ) ) | ( ( rule__DotGraph__SubgraphsAssignment_3_3 ) ) | ( ( rule__DotGraph__NodesAssignment_3_4 ) ) | ( ( rule__DotGraph__EdgesAssignment_3_5 ) ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010024000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000018C341F0L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000018C241F2L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000080001F0L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000280000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000140000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000180L});
    }


}