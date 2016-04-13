package org.muml.pim.actionlanguage.xtext.ui.contentassist.antlr.internal; 

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
import org.muml.pim.actionlanguage.xtext.services.ActionLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActionLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_NUMBER", "RULE_BOOLEAN", "RULE_ID", "RULE_MINORMAXKEYWORD", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'&&'", "'null'", "'++'", "'--'", "':='", "'+='", "'-='", "'=='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'not'", "'self'", "'first'", "'last'", "'prev'", "'next'", "'{'", "'}'", "'for'", "'('", "';'", "')'", "'while'", "'do'", "');'", "'if'", "'else'", "'elseif'", "'return'", "'['", "']'", "','", "'->'", "'.'", "'const'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=9;
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
    public static final int RULE_MINORMAXKEYWORD=8;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_NUMBER=5;
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


        public InternalActionLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActionLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActionLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalActionLanguage.g"; }


     
     	private ActionLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ActionLanguageGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleEntry"
    // InternalActionLanguage.g:60:1: entryRuleEntry : ruleEntry EOF ;
    public final void entryRuleEntry() throws RecognitionException {
        try {
            // InternalActionLanguage.g:61:1: ( ruleEntry EOF )
            // InternalActionLanguage.g:62:1: ruleEntry EOF
            {
             before(grammarAccess.getEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getEntryRule()); 
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
    // $ANTLR end "entryRuleEntry"


    // $ANTLR start "ruleEntry"
    // InternalActionLanguage.g:69:1: ruleEntry : ( ( rule__Entry__Alternatives ) ) ;
    public final void ruleEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:73:2: ( ( ( rule__Entry__Alternatives ) ) )
            // InternalActionLanguage.g:74:1: ( ( rule__Entry__Alternatives ) )
            {
            // InternalActionLanguage.g:74:1: ( ( rule__Entry__Alternatives ) )
            // InternalActionLanguage.g:75:1: ( rule__Entry__Alternatives )
            {
             before(grammarAccess.getEntryAccess().getAlternatives()); 
            // InternalActionLanguage.g:76:1: ( rule__Entry__Alternatives )
            // InternalActionLanguage.g:76:2: rule__Entry__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntry"


    // $ANTLR start "entryRuleBlock"
    // InternalActionLanguage.g:88:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalActionLanguage.g:92:1: ( ruleBlock EOF )
            // InternalActionLanguage.g:93:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalActionLanguage.g:103:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:108:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalActionLanguage.g:109:1: ( ( rule__Block__Group__0 ) )
            {
            // InternalActionLanguage.g:109:1: ( ( rule__Block__Group__0 ) )
            // InternalActionLanguage.g:110:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalActionLanguage.g:111:1: ( rule__Block__Group__0 )
            // InternalActionLanguage.g:111:2: rule__Block__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleForLoop"
    // InternalActionLanguage.g:124:1: entryRuleForLoop : ruleForLoop EOF ;
    public final void entryRuleForLoop() throws RecognitionException {
        try {
            // InternalActionLanguage.g:125:1: ( ruleForLoop EOF )
            // InternalActionLanguage.g:126:1: ruleForLoop EOF
            {
             before(grammarAccess.getForLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleForLoop();

            state._fsp--;

             after(grammarAccess.getForLoopRule()); 
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
    // $ANTLR end "entryRuleForLoop"


    // $ANTLR start "ruleForLoop"
    // InternalActionLanguage.g:133:1: ruleForLoop : ( ( rule__ForLoop__Group__0 ) ) ;
    public final void ruleForLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:137:2: ( ( ( rule__ForLoop__Group__0 ) ) )
            // InternalActionLanguage.g:138:1: ( ( rule__ForLoop__Group__0 ) )
            {
            // InternalActionLanguage.g:138:1: ( ( rule__ForLoop__Group__0 ) )
            // InternalActionLanguage.g:139:1: ( rule__ForLoop__Group__0 )
            {
             before(grammarAccess.getForLoopAccess().getGroup()); 
            // InternalActionLanguage.g:140:1: ( rule__ForLoop__Group__0 )
            // InternalActionLanguage.g:140:2: rule__ForLoop__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForLoop"


    // $ANTLR start "entryRuleForLoopCountingExpression"
    // InternalActionLanguage.g:152:1: entryRuleForLoopCountingExpression : ruleForLoopCountingExpression EOF ;
    public final void entryRuleForLoopCountingExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:153:1: ( ruleForLoopCountingExpression EOF )
            // InternalActionLanguage.g:154:1: ruleForLoopCountingExpression EOF
            {
             before(grammarAccess.getForLoopCountingExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleForLoopCountingExpression();

            state._fsp--;

             after(grammarAccess.getForLoopCountingExpressionRule()); 
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
    // $ANTLR end "entryRuleForLoopCountingExpression"


    // $ANTLR start "ruleForLoopCountingExpression"
    // InternalActionLanguage.g:161:1: ruleForLoopCountingExpression : ( ( rule__ForLoopCountingExpression__Group__0 ) ) ;
    public final void ruleForLoopCountingExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:165:2: ( ( ( rule__ForLoopCountingExpression__Group__0 ) ) )
            // InternalActionLanguage.g:166:1: ( ( rule__ForLoopCountingExpression__Group__0 ) )
            {
            // InternalActionLanguage.g:166:1: ( ( rule__ForLoopCountingExpression__Group__0 ) )
            // InternalActionLanguage.g:167:1: ( rule__ForLoopCountingExpression__Group__0 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getGroup()); 
            // InternalActionLanguage.g:168:1: ( rule__ForLoopCountingExpression__Group__0 )
            // InternalActionLanguage.g:168:2: rule__ForLoopCountingExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoopCountingExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForLoopCountingExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForLoopCountingExpression"


    // $ANTLR start "entryRuleWhileLoop"
    // InternalActionLanguage.g:180:1: entryRuleWhileLoop : ruleWhileLoop EOF ;
    public final void entryRuleWhileLoop() throws RecognitionException {
        try {
            // InternalActionLanguage.g:181:1: ( ruleWhileLoop EOF )
            // InternalActionLanguage.g:182:1: ruleWhileLoop EOF
            {
             before(grammarAccess.getWhileLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleWhileLoop();

            state._fsp--;

             after(grammarAccess.getWhileLoopRule()); 
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
    // $ANTLR end "entryRuleWhileLoop"


    // $ANTLR start "ruleWhileLoop"
    // InternalActionLanguage.g:189:1: ruleWhileLoop : ( ( rule__WhileLoop__Group__0 ) ) ;
    public final void ruleWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:193:2: ( ( ( rule__WhileLoop__Group__0 ) ) )
            // InternalActionLanguage.g:194:1: ( ( rule__WhileLoop__Group__0 ) )
            {
            // InternalActionLanguage.g:194:1: ( ( rule__WhileLoop__Group__0 ) )
            // InternalActionLanguage.g:195:1: ( rule__WhileLoop__Group__0 )
            {
             before(grammarAccess.getWhileLoopAccess().getGroup()); 
            // InternalActionLanguage.g:196:1: ( rule__WhileLoop__Group__0 )
            // InternalActionLanguage.g:196:2: rule__WhileLoop__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WhileLoop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhileLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhileLoop"


    // $ANTLR start "entryRuleDoWhileLoop"
    // InternalActionLanguage.g:208:1: entryRuleDoWhileLoop : ruleDoWhileLoop EOF ;
    public final void entryRuleDoWhileLoop() throws RecognitionException {
        try {
            // InternalActionLanguage.g:209:1: ( ruleDoWhileLoop EOF )
            // InternalActionLanguage.g:210:1: ruleDoWhileLoop EOF
            {
             before(grammarAccess.getDoWhileLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDoWhileLoop();

            state._fsp--;

             after(grammarAccess.getDoWhileLoopRule()); 
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
    // $ANTLR end "entryRuleDoWhileLoop"


    // $ANTLR start "ruleDoWhileLoop"
    // InternalActionLanguage.g:217:1: ruleDoWhileLoop : ( ( rule__DoWhileLoop__Group__0 ) ) ;
    public final void ruleDoWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:221:2: ( ( ( rule__DoWhileLoop__Group__0 ) ) )
            // InternalActionLanguage.g:222:1: ( ( rule__DoWhileLoop__Group__0 ) )
            {
            // InternalActionLanguage.g:222:1: ( ( rule__DoWhileLoop__Group__0 ) )
            // InternalActionLanguage.g:223:1: ( rule__DoWhileLoop__Group__0 )
            {
             before(grammarAccess.getDoWhileLoopAccess().getGroup()); 
            // InternalActionLanguage.g:224:1: ( rule__DoWhileLoop__Group__0 )
            // InternalActionLanguage.g:224:2: rule__DoWhileLoop__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoWhileLoop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoWhileLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoWhileLoop"


    // $ANTLR start "entryRuleIfStatement"
    // InternalActionLanguage.g:236:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalActionLanguage.g:237:1: ( ruleIfStatement EOF )
            // InternalActionLanguage.g:238:1: ruleIfStatement EOF
            {
             before(grammarAccess.getIfStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleIfStatement();

            state._fsp--;

             after(grammarAccess.getIfStatementRule()); 
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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalActionLanguage.g:245:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:249:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalActionLanguage.g:250:1: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalActionLanguage.g:250:1: ( ( rule__IfStatement__Group__0 ) )
            // InternalActionLanguage.g:251:1: ( rule__IfStatement__Group__0 )
            {
             before(grammarAccess.getIfStatementAccess().getGroup()); 
            // InternalActionLanguage.g:252:1: ( rule__IfStatement__Group__0 )
            // InternalActionLanguage.g:252:2: rule__IfStatement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleElseIfStatement"
    // InternalActionLanguage.g:264:1: entryRuleElseIfStatement : ruleElseIfStatement EOF ;
    public final void entryRuleElseIfStatement() throws RecognitionException {
        try {
            // InternalActionLanguage.g:265:1: ( ruleElseIfStatement EOF )
            // InternalActionLanguage.g:266:1: ruleElseIfStatement EOF
            {
             before(grammarAccess.getElseIfStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleElseIfStatement();

            state._fsp--;

             after(grammarAccess.getElseIfStatementRule()); 
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
    // $ANTLR end "entryRuleElseIfStatement"


    // $ANTLR start "ruleElseIfStatement"
    // InternalActionLanguage.g:273:1: ruleElseIfStatement : ( ( rule__ElseIfStatement__Group__0 ) ) ;
    public final void ruleElseIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:277:2: ( ( ( rule__ElseIfStatement__Group__0 ) ) )
            // InternalActionLanguage.g:278:1: ( ( rule__ElseIfStatement__Group__0 ) )
            {
            // InternalActionLanguage.g:278:1: ( ( rule__ElseIfStatement__Group__0 ) )
            // InternalActionLanguage.g:279:1: ( rule__ElseIfStatement__Group__0 )
            {
             before(grammarAccess.getElseIfStatementAccess().getGroup()); 
            // InternalActionLanguage.g:280:1: ( rule__ElseIfStatement__Group__0 )
            // InternalActionLanguage.g:280:2: rule__ElseIfStatement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ElseIfStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElseIfStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElseIfStatement"


    // $ANTLR start "entryRuleReturnStatement"
    // InternalActionLanguage.g:292:1: entryRuleReturnStatement : ruleReturnStatement EOF ;
    public final void entryRuleReturnStatement() throws RecognitionException {
        try {
            // InternalActionLanguage.g:293:1: ( ruleReturnStatement EOF )
            // InternalActionLanguage.g:294:1: ruleReturnStatement EOF
            {
             before(grammarAccess.getReturnStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleReturnStatement();

            state._fsp--;

             after(grammarAccess.getReturnStatementRule()); 
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
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // InternalActionLanguage.g:301:1: ruleReturnStatement : ( ( rule__ReturnStatement__Group__0 ) ) ;
    public final void ruleReturnStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:305:2: ( ( ( rule__ReturnStatement__Group__0 ) ) )
            // InternalActionLanguage.g:306:1: ( ( rule__ReturnStatement__Group__0 ) )
            {
            // InternalActionLanguage.g:306:1: ( ( rule__ReturnStatement__Group__0 ) )
            // InternalActionLanguage.g:307:1: ( rule__ReturnStatement__Group__0 )
            {
             before(grammarAccess.getReturnStatementAccess().getGroup()); 
            // InternalActionLanguage.g:308:1: ( rule__ReturnStatement__Group__0 )
            // InternalActionLanguage.g:308:2: rule__ReturnStatement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReturnStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReturnStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleOperationCallStatement"
    // InternalActionLanguage.g:320:1: entryRuleOperationCallStatement : ruleOperationCallStatement EOF ;
    public final void entryRuleOperationCallStatement() throws RecognitionException {
        try {
            // InternalActionLanguage.g:321:1: ( ruleOperationCallStatement EOF )
            // InternalActionLanguage.g:322:1: ruleOperationCallStatement EOF
            {
             before(grammarAccess.getOperationCallStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOperationCallStatement();

            state._fsp--;

             after(grammarAccess.getOperationCallStatementRule()); 
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
    // $ANTLR end "entryRuleOperationCallStatement"


    // $ANTLR start "ruleOperationCallStatement"
    // InternalActionLanguage.g:329:1: ruleOperationCallStatement : ( ( rule__OperationCallStatement__Group__0 ) ) ;
    public final void ruleOperationCallStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:333:2: ( ( ( rule__OperationCallStatement__Group__0 ) ) )
            // InternalActionLanguage.g:334:1: ( ( rule__OperationCallStatement__Group__0 ) )
            {
            // InternalActionLanguage.g:334:1: ( ( rule__OperationCallStatement__Group__0 ) )
            // InternalActionLanguage.g:335:1: ( rule__OperationCallStatement__Group__0 )
            {
             before(grammarAccess.getOperationCallStatementAccess().getGroup()); 
            // InternalActionLanguage.g:336:1: ( rule__OperationCallStatement__Group__0 )
            // InternalActionLanguage.g:336:2: rule__OperationCallStatement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCallStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationCallStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationCallStatement"


    // $ANTLR start "entryRuleExpressionStartRule"
    // InternalActionLanguage.g:348:1: entryRuleExpressionStartRule : ruleExpressionStartRule EOF ;
    public final void entryRuleExpressionStartRule() throws RecognitionException {
        try {
            // InternalActionLanguage.g:349:1: ( ruleExpressionStartRule EOF )
            // InternalActionLanguage.g:350:1: ruleExpressionStartRule EOF
            {
             before(grammarAccess.getExpressionStartRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleExpressionStartRule();

            state._fsp--;

             after(grammarAccess.getExpressionStartRuleRule()); 
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
    // $ANTLR end "entryRuleExpressionStartRule"


    // $ANTLR start "ruleExpressionStartRule"
    // InternalActionLanguage.g:357:1: ruleExpressionStartRule : ( ( rule__ExpressionStartRule__Alternatives ) ) ;
    public final void ruleExpressionStartRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:361:2: ( ( ( rule__ExpressionStartRule__Alternatives ) ) )
            // InternalActionLanguage.g:362:1: ( ( rule__ExpressionStartRule__Alternatives ) )
            {
            // InternalActionLanguage.g:362:1: ( ( rule__ExpressionStartRule__Alternatives ) )
            // InternalActionLanguage.g:363:1: ( rule__ExpressionStartRule__Alternatives )
            {
             before(grammarAccess.getExpressionStartRuleAccess().getAlternatives()); 
            // InternalActionLanguage.g:364:1: ( rule__ExpressionStartRule__Alternatives )
            // InternalActionLanguage.g:364:2: rule__ExpressionStartRule__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExpressionStartRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionStartRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionStartRule"


    // $ANTLR start "entryRuleAssignment"
    // InternalActionLanguage.g:376:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalActionLanguage.g:377:1: ( ruleAssignment EOF )
            // InternalActionLanguage.g:378:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalActionLanguage.g:385:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:389:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalActionLanguage.g:390:1: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalActionLanguage.g:390:1: ( ( rule__Assignment__Group__0 ) )
            // InternalActionLanguage.g:391:1: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalActionLanguage.g:392:1: ( rule__Assignment__Group__0 )
            // InternalActionLanguage.g:392:2: rule__Assignment__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleInitializeExpression"
    // InternalActionLanguage.g:404:1: entryRuleInitializeExpression : ruleInitializeExpression EOF ;
    public final void entryRuleInitializeExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:405:1: ( ruleInitializeExpression EOF )
            // InternalActionLanguage.g:406:1: ruleInitializeExpression EOF
            {
             before(grammarAccess.getInitializeExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleInitializeExpression();

            state._fsp--;

             after(grammarAccess.getInitializeExpressionRule()); 
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
    // $ANTLR end "entryRuleInitializeExpression"


    // $ANTLR start "ruleInitializeExpression"
    // InternalActionLanguage.g:413:1: ruleInitializeExpression : ( ( rule__InitializeExpression__Alternatives ) ) ;
    public final void ruleInitializeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:417:2: ( ( ( rule__InitializeExpression__Alternatives ) ) )
            // InternalActionLanguage.g:418:1: ( ( rule__InitializeExpression__Alternatives ) )
            {
            // InternalActionLanguage.g:418:1: ( ( rule__InitializeExpression__Alternatives ) )
            // InternalActionLanguage.g:419:1: ( rule__InitializeExpression__Alternatives )
            {
             before(grammarAccess.getInitializeExpressionAccess().getAlternatives()); 
            // InternalActionLanguage.g:420:1: ( rule__InitializeExpression__Alternatives )
            // InternalActionLanguage.g:420:2: rule__InitializeExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InitializeExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInitializeExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitializeExpression"


    // $ANTLR start "entryRuleArrayInitializeExpression"
    // InternalActionLanguage.g:432:1: entryRuleArrayInitializeExpression : ruleArrayInitializeExpression EOF ;
    public final void entryRuleArrayInitializeExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:433:1: ( ruleArrayInitializeExpression EOF )
            // InternalActionLanguage.g:434:1: ruleArrayInitializeExpression EOF
            {
             before(grammarAccess.getArrayInitializeExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleArrayInitializeExpression();

            state._fsp--;

             after(grammarAccess.getArrayInitializeExpressionRule()); 
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
    // $ANTLR end "entryRuleArrayInitializeExpression"


    // $ANTLR start "ruleArrayInitializeExpression"
    // InternalActionLanguage.g:441:1: ruleArrayInitializeExpression : ( ( rule__ArrayInitializeExpression__Group__0 ) ) ;
    public final void ruleArrayInitializeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:445:2: ( ( ( rule__ArrayInitializeExpression__Group__0 ) ) )
            // InternalActionLanguage.g:446:1: ( ( rule__ArrayInitializeExpression__Group__0 ) )
            {
            // InternalActionLanguage.g:446:1: ( ( rule__ArrayInitializeExpression__Group__0 ) )
            // InternalActionLanguage.g:447:1: ( rule__ArrayInitializeExpression__Group__0 )
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getGroup()); 
            // InternalActionLanguage.g:448:1: ( rule__ArrayInitializeExpression__Group__0 )
            // InternalActionLanguage.g:448:2: rule__ArrayInitializeExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayInitializeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayInitializeExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayInitializeExpression"


    // $ANTLR start "entryRuleLocalVariableOrConstantDeclarationStatement"
    // InternalActionLanguage.g:460:1: entryRuleLocalVariableOrConstantDeclarationStatement : ruleLocalVariableOrConstantDeclarationStatement EOF ;
    public final void entryRuleLocalVariableOrConstantDeclarationStatement() throws RecognitionException {
        try {
            // InternalActionLanguage.g:461:1: ( ruleLocalVariableOrConstantDeclarationStatement EOF )
            // InternalActionLanguage.g:462:1: ruleLocalVariableOrConstantDeclarationStatement EOF
            {
             before(grammarAccess.getLocalVariableOrConstantDeclarationStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLocalVariableOrConstantDeclarationStatement();

            state._fsp--;

             after(grammarAccess.getLocalVariableOrConstantDeclarationStatementRule()); 
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
    // $ANTLR end "entryRuleLocalVariableOrConstantDeclarationStatement"


    // $ANTLR start "ruleLocalVariableOrConstantDeclarationStatement"
    // InternalActionLanguage.g:469:1: ruleLocalVariableOrConstantDeclarationStatement : ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment ) ) ;
    public final void ruleLocalVariableOrConstantDeclarationStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:473:2: ( ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment ) ) )
            // InternalActionLanguage.g:474:1: ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment ) )
            {
            // InternalActionLanguage.g:474:1: ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment ) )
            // InternalActionLanguage.g:475:1: ( rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment )
            {
             before(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableAssignment()); 
            // InternalActionLanguage.g:476:1: ( rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment )
            // InternalActionLanguage.g:476:2: rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalVariableOrConstantDeclarationStatement"


    // $ANTLR start "entryRuleLocalVariableDeclaration"
    // InternalActionLanguage.g:488:1: entryRuleLocalVariableDeclaration : ruleLocalVariableDeclaration EOF ;
    public final void entryRuleLocalVariableDeclaration() throws RecognitionException {
        try {
            // InternalActionLanguage.g:489:1: ( ruleLocalVariableDeclaration EOF )
            // InternalActionLanguage.g:490:1: ruleLocalVariableDeclaration EOF
            {
             before(grammarAccess.getLocalVariableDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLocalVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getLocalVariableDeclarationRule()); 
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
    // $ANTLR end "entryRuleLocalVariableDeclaration"


    // $ANTLR start "ruleLocalVariableDeclaration"
    // InternalActionLanguage.g:497:1: ruleLocalVariableDeclaration : ( ( rule__LocalVariableDeclaration__Group__0 ) ) ;
    public final void ruleLocalVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:501:2: ( ( ( rule__LocalVariableDeclaration__Group__0 ) ) )
            // InternalActionLanguage.g:502:1: ( ( rule__LocalVariableDeclaration__Group__0 ) )
            {
            // InternalActionLanguage.g:502:1: ( ( rule__LocalVariableDeclaration__Group__0 ) )
            // InternalActionLanguage.g:503:1: ( rule__LocalVariableDeclaration__Group__0 )
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getGroup()); 
            // InternalActionLanguage.g:504:1: ( rule__LocalVariableDeclaration__Group__0 )
            // InternalActionLanguage.g:504:2: rule__LocalVariableDeclaration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalVariableDeclaration"


    // $ANTLR start "entryRuleLocalConstantDeclaration"
    // InternalActionLanguage.g:516:1: entryRuleLocalConstantDeclaration : ruleLocalConstantDeclaration EOF ;
    public final void entryRuleLocalConstantDeclaration() throws RecognitionException {
        try {
            // InternalActionLanguage.g:517:1: ( ruleLocalConstantDeclaration EOF )
            // InternalActionLanguage.g:518:1: ruleLocalConstantDeclaration EOF
            {
             before(grammarAccess.getLocalConstantDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLocalConstantDeclaration();

            state._fsp--;

             after(grammarAccess.getLocalConstantDeclarationRule()); 
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
    // $ANTLR end "entryRuleLocalConstantDeclaration"


    // $ANTLR start "ruleLocalConstantDeclaration"
    // InternalActionLanguage.g:525:1: ruleLocalConstantDeclaration : ( ( rule__LocalConstantDeclaration__Group__0 ) ) ;
    public final void ruleLocalConstantDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:529:2: ( ( ( rule__LocalConstantDeclaration__Group__0 ) ) )
            // InternalActionLanguage.g:530:1: ( ( rule__LocalConstantDeclaration__Group__0 ) )
            {
            // InternalActionLanguage.g:530:1: ( ( rule__LocalConstantDeclaration__Group__0 ) )
            // InternalActionLanguage.g:531:1: ( rule__LocalConstantDeclaration__Group__0 )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getGroup()); 
            // InternalActionLanguage.g:532:1: ( rule__LocalConstantDeclaration__Group__0 )
            // InternalActionLanguage.g:532:2: rule__LocalConstantDeclaration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalConstantDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalConstantDeclaration"


    // $ANTLR start "entryRuleNondeterministicChoiceExpression"
    // InternalActionLanguage.g:544:1: entryRuleNondeterministicChoiceExpression : ruleNondeterministicChoiceExpression EOF ;
    public final void entryRuleNondeterministicChoiceExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:545:1: ( ruleNondeterministicChoiceExpression EOF )
            // InternalActionLanguage.g:546:1: ruleNondeterministicChoiceExpression EOF
            {
             before(grammarAccess.getNondeterministicChoiceExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNondeterministicChoiceExpression();

            state._fsp--;

             after(grammarAccess.getNondeterministicChoiceExpressionRule()); 
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
    // $ANTLR end "entryRuleNondeterministicChoiceExpression"


    // $ANTLR start "ruleNondeterministicChoiceExpression"
    // InternalActionLanguage.g:553:1: ruleNondeterministicChoiceExpression : ( ( rule__NondeterministicChoiceExpression__Group__0 ) ) ;
    public final void ruleNondeterministicChoiceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:557:2: ( ( ( rule__NondeterministicChoiceExpression__Group__0 ) ) )
            // InternalActionLanguage.g:558:1: ( ( rule__NondeterministicChoiceExpression__Group__0 ) )
            {
            // InternalActionLanguage.g:558:1: ( ( rule__NondeterministicChoiceExpression__Group__0 ) )
            // InternalActionLanguage.g:559:1: ( rule__NondeterministicChoiceExpression__Group__0 )
            {
             before(grammarAccess.getNondeterministicChoiceExpressionAccess().getGroup()); 
            // InternalActionLanguage.g:560:1: ( rule__NondeterministicChoiceExpression__Group__0 )
            // InternalActionLanguage.g:560:2: rule__NondeterministicChoiceExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NondeterministicChoiceExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNondeterministicChoiceExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNondeterministicChoiceExpression"


    // $ANTLR start "entryRuleRange"
    // InternalActionLanguage.g:572:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalActionLanguage.g:573:1: ( ruleRange EOF )
            // InternalActionLanguage.g:574:1: ruleRange EOF
            {
             before(grammarAccess.getRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getRangeRule()); 
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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalActionLanguage.g:581:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:585:2: ( ( ( rule__Range__Group__0 ) ) )
            // InternalActionLanguage.g:586:1: ( ( rule__Range__Group__0 ) )
            {
            // InternalActionLanguage.g:586:1: ( ( rule__Range__Group__0 ) )
            // InternalActionLanguage.g:587:1: ( rule__Range__Group__0 )
            {
             before(grammarAccess.getRangeAccess().getGroup()); 
            // InternalActionLanguage.g:588:1: ( rule__Range__Group__0 )
            // InternalActionLanguage.g:588:2: rule__Range__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Range__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleLONG"
    // InternalActionLanguage.g:600:1: entryRuleLONG : ruleLONG EOF ;
    public final void entryRuleLONG() throws RecognitionException {
        try {
            // InternalActionLanguage.g:601:1: ( ruleLONG EOF )
            // InternalActionLanguage.g:602:1: ruleLONG EOF
            {
             before(grammarAccess.getLONGRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLONG();

            state._fsp--;

             after(grammarAccess.getLONGRule()); 
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
    // $ANTLR end "entryRuleLONG"


    // $ANTLR start "ruleLONG"
    // InternalActionLanguage.g:609:1: ruleLONG : ( RULE_INT ) ;
    public final void ruleLONG() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:613:2: ( ( RULE_INT ) )
            // InternalActionLanguage.g:614:1: ( RULE_INT )
            {
            // InternalActionLanguage.g:614:1: ( RULE_INT )
            // InternalActionLanguage.g:615:1: RULE_INT
            {
             before(grammarAccess.getLONGAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getLONGAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLONG"


    // $ANTLR start "entryRuleExpression"
    // InternalActionLanguage.g:628:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:629:1: ( ruleExpression EOF )
            // InternalActionLanguage.g:630:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalActionLanguage.g:637:1: ruleExpression : ( ruleLogicalExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:641:2: ( ( ruleLogicalExpression ) )
            // InternalActionLanguage.g:642:1: ( ruleLogicalExpression )
            {
            // InternalActionLanguage.g:642:1: ( ruleLogicalExpression )
            // InternalActionLanguage.g:643:1: ruleLogicalExpression
            {
             before(grammarAccess.getExpressionAccess().getLogicalExpressionParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLogicalExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getLogicalExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLogicalExpression"
    // InternalActionLanguage.g:656:1: entryRuleLogicalExpression : ruleLogicalExpression EOF ;
    public final void entryRuleLogicalExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:657:1: ( ruleLogicalExpression EOF )
            // InternalActionLanguage.g:658:1: ruleLogicalExpression EOF
            {
             before(grammarAccess.getLogicalExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLogicalExpression();

            state._fsp--;

             after(grammarAccess.getLogicalExpressionRule()); 
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
    // $ANTLR end "entryRuleLogicalExpression"


    // $ANTLR start "ruleLogicalExpression"
    // InternalActionLanguage.g:665:1: ruleLogicalExpression : ( ruleLogicalOrExpression ) ;
    public final void ruleLogicalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:669:2: ( ( ruleLogicalOrExpression ) )
            // InternalActionLanguage.g:670:1: ( ruleLogicalOrExpression )
            {
            // InternalActionLanguage.g:670:1: ( ruleLogicalOrExpression )
            // InternalActionLanguage.g:671:1: ruleLogicalOrExpression
            {
             before(grammarAccess.getLogicalExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLogicalOrExpression();

            state._fsp--;

             after(grammarAccess.getLogicalExpressionAccess().getLogicalOrExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // InternalActionLanguage.g:684:1: entryRuleLogicalOrExpression : ruleLogicalOrExpression EOF ;
    public final void entryRuleLogicalOrExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:685:1: ( ruleLogicalOrExpression EOF )
            // InternalActionLanguage.g:686:1: ruleLogicalOrExpression EOF
            {
             before(grammarAccess.getLogicalOrExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLogicalOrExpression();

            state._fsp--;

             after(grammarAccess.getLogicalOrExpressionRule()); 
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
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // InternalActionLanguage.g:693:1: ruleLogicalOrExpression : ( ( rule__LogicalOrExpression__Group__0 ) ) ;
    public final void ruleLogicalOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:697:2: ( ( ( rule__LogicalOrExpression__Group__0 ) ) )
            // InternalActionLanguage.g:698:1: ( ( rule__LogicalOrExpression__Group__0 ) )
            {
            // InternalActionLanguage.g:698:1: ( ( rule__LogicalOrExpression__Group__0 ) )
            // InternalActionLanguage.g:699:1: ( rule__LogicalOrExpression__Group__0 )
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getGroup()); 
            // InternalActionLanguage.g:700:1: ( rule__LogicalOrExpression__Group__0 )
            // InternalActionLanguage.g:700:2: rule__LogicalOrExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalOrExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalActionLanguage.g:712:1: entryRuleLogicalAndExpression : ruleLogicalAndExpression EOF ;
    public final void entryRuleLogicalAndExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:713:1: ( ruleLogicalAndExpression EOF )
            // InternalActionLanguage.g:714:1: ruleLogicalAndExpression EOF
            {
             before(grammarAccess.getLogicalAndExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLogicalAndExpression();

            state._fsp--;

             after(grammarAccess.getLogicalAndExpressionRule()); 
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
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // InternalActionLanguage.g:721:1: ruleLogicalAndExpression : ( ( rule__LogicalAndExpression__Group__0 ) ) ;
    public final void ruleLogicalAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:725:2: ( ( ( rule__LogicalAndExpression__Group__0 ) ) )
            // InternalActionLanguage.g:726:1: ( ( rule__LogicalAndExpression__Group__0 ) )
            {
            // InternalActionLanguage.g:726:1: ( ( rule__LogicalAndExpression__Group__0 ) )
            // InternalActionLanguage.g:727:1: ( rule__LogicalAndExpression__Group__0 )
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getGroup()); 
            // InternalActionLanguage.g:728:1: ( rule__LogicalAndExpression__Group__0 )
            // InternalActionLanguage.g:728:2: rule__LogicalAndExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalAndExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalActionLanguage.g:740:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:741:1: ( ruleComparisonExpression EOF )
            // InternalActionLanguage.g:742:1: ruleComparisonExpression EOF
            {
             before(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionRule()); 
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
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalActionLanguage.g:749:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:753:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // InternalActionLanguage.g:754:1: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // InternalActionLanguage.g:754:1: ( ( rule__ComparisonExpression__Group__0 ) )
            // InternalActionLanguage.g:755:1: ( rule__ComparisonExpression__Group__0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            // InternalActionLanguage.g:756:1: ( rule__ComparisonExpression__Group__0 )
            // InternalActionLanguage.g:756:2: rule__ComparisonExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleComparisonHigherOpExpression"
    // InternalActionLanguage.g:768:1: entryRuleComparisonHigherOpExpression : ruleComparisonHigherOpExpression EOF ;
    public final void entryRuleComparisonHigherOpExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:769:1: ( ruleComparisonHigherOpExpression EOF )
            // InternalActionLanguage.g:770:1: ruleComparisonHigherOpExpression EOF
            {
             before(grammarAccess.getComparisonHigherOpExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleComparisonHigherOpExpression();

            state._fsp--;

             after(grammarAccess.getComparisonHigherOpExpressionRule()); 
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
    // $ANTLR end "entryRuleComparisonHigherOpExpression"


    // $ANTLR start "ruleComparisonHigherOpExpression"
    // InternalActionLanguage.g:777:1: ruleComparisonHigherOpExpression : ( ( rule__ComparisonHigherOpExpression__Group__0 ) ) ;
    public final void ruleComparisonHigherOpExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:781:2: ( ( ( rule__ComparisonHigherOpExpression__Group__0 ) ) )
            // InternalActionLanguage.g:782:1: ( ( rule__ComparisonHigherOpExpression__Group__0 ) )
            {
            // InternalActionLanguage.g:782:1: ( ( rule__ComparisonHigherOpExpression__Group__0 ) )
            // InternalActionLanguage.g:783:1: ( rule__ComparisonHigherOpExpression__Group__0 )
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getGroup()); 
            // InternalActionLanguage.g:784:1: ( rule__ComparisonHigherOpExpression__Group__0 )
            // InternalActionLanguage.g:784:2: rule__ComparisonHigherOpExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonHigherOpExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonHigherOpExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonHigherOpExpression"


    // $ANTLR start "entryRuleArithmeticExpression"
    // InternalActionLanguage.g:796:1: entryRuleArithmeticExpression : ruleArithmeticExpression EOF ;
    public final void entryRuleArithmeticExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:797:1: ( ruleArithmeticExpression EOF )
            // InternalActionLanguage.g:798:1: ruleArithmeticExpression EOF
            {
             before(grammarAccess.getArithmeticExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getArithmeticExpressionRule()); 
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
    // $ANTLR end "entryRuleArithmeticExpression"


    // $ANTLR start "ruleArithmeticExpression"
    // InternalActionLanguage.g:805:1: ruleArithmeticExpression : ( ruleAdditionExpression ) ;
    public final void ruleArithmeticExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:809:2: ( ( ruleAdditionExpression ) )
            // InternalActionLanguage.g:810:1: ( ruleAdditionExpression )
            {
            // InternalActionLanguage.g:810:1: ( ruleAdditionExpression )
            // InternalActionLanguage.g:811:1: ruleAdditionExpression
            {
             before(grammarAccess.getArithmeticExpressionAccess().getAdditionExpressionParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAdditionExpression();

            state._fsp--;

             after(grammarAccess.getArithmeticExpressionAccess().getAdditionExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleAdditionExpression"
    // InternalActionLanguage.g:824:1: entryRuleAdditionExpression : ruleAdditionExpression EOF ;
    public final void entryRuleAdditionExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:825:1: ( ruleAdditionExpression EOF )
            // InternalActionLanguage.g:826:1: ruleAdditionExpression EOF
            {
             before(grammarAccess.getAdditionExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAdditionExpression();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionRule()); 
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
    // $ANTLR end "entryRuleAdditionExpression"


    // $ANTLR start "ruleAdditionExpression"
    // InternalActionLanguage.g:833:1: ruleAdditionExpression : ( ( rule__AdditionExpression__Group__0 ) ) ;
    public final void ruleAdditionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:837:2: ( ( ( rule__AdditionExpression__Group__0 ) ) )
            // InternalActionLanguage.g:838:1: ( ( rule__AdditionExpression__Group__0 ) )
            {
            // InternalActionLanguage.g:838:1: ( ( rule__AdditionExpression__Group__0 ) )
            // InternalActionLanguage.g:839:1: ( rule__AdditionExpression__Group__0 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup()); 
            // InternalActionLanguage.g:840:1: ( rule__AdditionExpression__Group__0 )
            // InternalActionLanguage.g:840:2: rule__AdditionExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditionExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionExpression"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // InternalActionLanguage.g:852:1: entryRuleMultiplicationExpression : ruleMultiplicationExpression EOF ;
    public final void entryRuleMultiplicationExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:853:1: ( ruleMultiplicationExpression EOF )
            // InternalActionLanguage.g:854:1: ruleMultiplicationExpression EOF
            {
             before(grammarAccess.getMultiplicationExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionRule()); 
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
    // $ANTLR end "entryRuleMultiplicationExpression"


    // $ANTLR start "ruleMultiplicationExpression"
    // InternalActionLanguage.g:861:1: ruleMultiplicationExpression : ( ( rule__MultiplicationExpression__Alternatives ) ) ;
    public final void ruleMultiplicationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:865:2: ( ( ( rule__MultiplicationExpression__Alternatives ) ) )
            // InternalActionLanguage.g:866:1: ( ( rule__MultiplicationExpression__Alternatives ) )
            {
            // InternalActionLanguage.g:866:1: ( ( rule__MultiplicationExpression__Alternatives ) )
            // InternalActionLanguage.g:867:1: ( rule__MultiplicationExpression__Alternatives )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getAlternatives()); 
            // InternalActionLanguage.g:868:1: ( rule__MultiplicationExpression__Alternatives )
            // InternalActionLanguage.g:868:2: rule__MultiplicationExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicationExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicationExpression"


    // $ANTLR start "entryRuleUnaryPreExpression"
    // InternalActionLanguage.g:880:1: entryRuleUnaryPreExpression : ruleUnaryPreExpression EOF ;
    public final void entryRuleUnaryPreExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:881:1: ( ruleUnaryPreExpression EOF )
            // InternalActionLanguage.g:882:1: ruleUnaryPreExpression EOF
            {
             before(grammarAccess.getUnaryPreExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUnaryPreExpression();

            state._fsp--;

             after(grammarAccess.getUnaryPreExpressionRule()); 
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
    // $ANTLR end "entryRuleUnaryPreExpression"


    // $ANTLR start "ruleUnaryPreExpression"
    // InternalActionLanguage.g:889:1: ruleUnaryPreExpression : ( ( rule__UnaryPreExpression__Group__0 ) ) ;
    public final void ruleUnaryPreExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:893:2: ( ( ( rule__UnaryPreExpression__Group__0 ) ) )
            // InternalActionLanguage.g:894:1: ( ( rule__UnaryPreExpression__Group__0 ) )
            {
            // InternalActionLanguage.g:894:1: ( ( rule__UnaryPreExpression__Group__0 ) )
            // InternalActionLanguage.g:895:1: ( rule__UnaryPreExpression__Group__0 )
            {
             before(grammarAccess.getUnaryPreExpressionAccess().getGroup()); 
            // InternalActionLanguage.g:896:1: ( rule__UnaryPreExpression__Group__0 )
            // InternalActionLanguage.g:896:2: rule__UnaryPreExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryPreExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryPreExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryPreExpression"


    // $ANTLR start "entryRuleTypeCastExpression"
    // InternalActionLanguage.g:908:1: entryRuleTypeCastExpression : ruleTypeCastExpression EOF ;
    public final void entryRuleTypeCastExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:909:1: ( ruleTypeCastExpression EOF )
            // InternalActionLanguage.g:910:1: ruleTypeCastExpression EOF
            {
             before(grammarAccess.getTypeCastExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTypeCastExpression();

            state._fsp--;

             after(grammarAccess.getTypeCastExpressionRule()); 
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
    // $ANTLR end "entryRuleTypeCastExpression"


    // $ANTLR start "ruleTypeCastExpression"
    // InternalActionLanguage.g:917:1: ruleTypeCastExpression : ( ( rule__TypeCastExpression__Alternatives ) ) ;
    public final void ruleTypeCastExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:921:2: ( ( ( rule__TypeCastExpression__Alternatives ) ) )
            // InternalActionLanguage.g:922:1: ( ( rule__TypeCastExpression__Alternatives ) )
            {
            // InternalActionLanguage.g:922:1: ( ( rule__TypeCastExpression__Alternatives ) )
            // InternalActionLanguage.g:923:1: ( rule__TypeCastExpression__Alternatives )
            {
             before(grammarAccess.getTypeCastExpressionAccess().getAlternatives()); 
            // InternalActionLanguage.g:924:1: ( rule__TypeCastExpression__Alternatives )
            // InternalActionLanguage.g:924:2: rule__TypeCastExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeCastExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeCastExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeCastExpression"


    // $ANTLR start "entryRuleOperand"
    // InternalActionLanguage.g:936:1: entryRuleOperand : ruleOperand EOF ;
    public final void entryRuleOperand() throws RecognitionException {
        try {
            // InternalActionLanguage.g:937:1: ( ruleOperand EOF )
            // InternalActionLanguage.g:938:1: ruleOperand EOF
            {
             before(grammarAccess.getOperandRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOperand();

            state._fsp--;

             after(grammarAccess.getOperandRule()); 
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
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // InternalActionLanguage.g:945:1: ruleOperand : ( ( rule__Operand__Alternatives ) ) ;
    public final void ruleOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:949:2: ( ( ( rule__Operand__Alternatives ) ) )
            // InternalActionLanguage.g:950:1: ( ( rule__Operand__Alternatives ) )
            {
            // InternalActionLanguage.g:950:1: ( ( rule__Operand__Alternatives ) )
            // InternalActionLanguage.g:951:1: ( rule__Operand__Alternatives )
            {
             before(grammarAccess.getOperandAccess().getAlternatives()); 
            // InternalActionLanguage.g:952:1: ( rule__Operand__Alternatives )
            // InternalActionLanguage.g:952:2: rule__Operand__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Operand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalActionLanguage.g:964:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:965:1: ( ruleLiteralExpression EOF )
            // InternalActionLanguage.g:966:1: ruleLiteralExpression EOF
            {
             before(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLiteralExpression();

            state._fsp--;

             after(grammarAccess.getLiteralExpressionRule()); 
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
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalActionLanguage.g:973:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Group__0 ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:977:2: ( ( ( rule__LiteralExpression__Group__0 ) ) )
            // InternalActionLanguage.g:978:1: ( ( rule__LiteralExpression__Group__0 ) )
            {
            // InternalActionLanguage.g:978:1: ( ( rule__LiteralExpression__Group__0 ) )
            // InternalActionLanguage.g:979:1: ( rule__LiteralExpression__Group__0 )
            {
             before(grammarAccess.getLiteralExpressionAccess().getGroup()); 
            // InternalActionLanguage.g:980:1: ( rule__LiteralExpression__Group__0 )
            // InternalActionLanguage.g:980:2: rule__LiteralExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLiteralExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalActionLanguage.g:992:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalActionLanguage.g:993:1: ( ruleLiteral EOF )
            // InternalActionLanguage.g:994:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalActionLanguage.g:1001:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1005:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalActionLanguage.g:1006:1: ( ( rule__Literal__Alternatives ) )
            {
            // InternalActionLanguage.g:1006:1: ( ( rule__Literal__Alternatives ) )
            // InternalActionLanguage.g:1007:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalActionLanguage.g:1008:1: ( rule__Literal__Alternatives )
            // InternalActionLanguage.g:1008:2: rule__Literal__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleTimeValueExpression"
    // InternalActionLanguage.g:1020:1: entryRuleTimeValueExpression : ruleTimeValueExpression EOF ;
    public final void entryRuleTimeValueExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:1021:1: ( ruleTimeValueExpression EOF )
            // InternalActionLanguage.g:1022:1: ruleTimeValueExpression EOF
            {
             before(grammarAccess.getTimeValueExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTimeValueExpression();

            state._fsp--;

             after(grammarAccess.getTimeValueExpressionRule()); 
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
    // $ANTLR end "entryRuleTimeValueExpression"


    // $ANTLR start "ruleTimeValueExpression"
    // InternalActionLanguage.g:1029:1: ruleTimeValueExpression : ( ( rule__TimeValueExpression__TimeValueAssignment ) ) ;
    public final void ruleTimeValueExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1033:2: ( ( ( rule__TimeValueExpression__TimeValueAssignment ) ) )
            // InternalActionLanguage.g:1034:1: ( ( rule__TimeValueExpression__TimeValueAssignment ) )
            {
            // InternalActionLanguage.g:1034:1: ( ( rule__TimeValueExpression__TimeValueAssignment ) )
            // InternalActionLanguage.g:1035:1: ( rule__TimeValueExpression__TimeValueAssignment )
            {
             before(grammarAccess.getTimeValueExpressionAccess().getTimeValueAssignment()); 
            // InternalActionLanguage.g:1036:1: ( rule__TimeValueExpression__TimeValueAssignment )
            // InternalActionLanguage.g:1036:2: rule__TimeValueExpression__TimeValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TimeValueExpression__TimeValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTimeValueExpressionAccess().getTimeValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeValueExpression"


    // $ANTLR start "entryRuleExtendedTypedNamedElementExpression"
    // InternalActionLanguage.g:1048:1: entryRuleExtendedTypedNamedElementExpression : ruleExtendedTypedNamedElementExpression EOF ;
    public final void entryRuleExtendedTypedNamedElementExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:1049:1: ( ruleExtendedTypedNamedElementExpression EOF )
            // InternalActionLanguage.g:1050:1: ruleExtendedTypedNamedElementExpression EOF
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleExtendedTypedNamedElementExpression();

            state._fsp--;

             after(grammarAccess.getExtendedTypedNamedElementExpressionRule()); 
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
    // $ANTLR end "entryRuleExtendedTypedNamedElementExpression"


    // $ANTLR start "ruleExtendedTypedNamedElementExpression"
    // InternalActionLanguage.g:1057:1: ruleExtendedTypedNamedElementExpression : ( ( rule__ExtendedTypedNamedElementExpression__Group__0 ) ) ;
    public final void ruleExtendedTypedNamedElementExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1061:2: ( ( ( rule__ExtendedTypedNamedElementExpression__Group__0 ) ) )
            // InternalActionLanguage.g:1062:1: ( ( rule__ExtendedTypedNamedElementExpression__Group__0 ) )
            {
            // InternalActionLanguage.g:1062:1: ( ( rule__ExtendedTypedNamedElementExpression__Group__0 ) )
            // InternalActionLanguage.g:1063:1: ( rule__ExtendedTypedNamedElementExpression__Group__0 )
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getGroup()); 
            // InternalActionLanguage.g:1064:1: ( rule__ExtendedTypedNamedElementExpression__Group__0 )
            // InternalActionLanguage.g:1064:2: rule__ExtendedTypedNamedElementExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedTypedNamedElementExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtendedTypedNamedElementExpression"


    // $ANTLR start "entryRuleTypedNamedElementExpression"
    // InternalActionLanguage.g:1076:1: entryRuleTypedNamedElementExpression : ruleTypedNamedElementExpression EOF ;
    public final void entryRuleTypedNamedElementExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:1077:1: ( ruleTypedNamedElementExpression EOF )
            // InternalActionLanguage.g:1078:1: ruleTypedNamedElementExpression EOF
            {
             before(grammarAccess.getTypedNamedElementExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTypedNamedElementExpression();

            state._fsp--;

             after(grammarAccess.getTypedNamedElementExpressionRule()); 
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
    // $ANTLR end "entryRuleTypedNamedElementExpression"


    // $ANTLR start "ruleTypedNamedElementExpression"
    // InternalActionLanguage.g:1085:1: ruleTypedNamedElementExpression : ( ( rule__TypedNamedElementExpression__Group__0 ) ) ;
    public final void ruleTypedNamedElementExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1089:2: ( ( ( rule__TypedNamedElementExpression__Group__0 ) ) )
            // InternalActionLanguage.g:1090:1: ( ( rule__TypedNamedElementExpression__Group__0 ) )
            {
            // InternalActionLanguage.g:1090:1: ( ( rule__TypedNamedElementExpression__Group__0 ) )
            // InternalActionLanguage.g:1091:1: ( rule__TypedNamedElementExpression__Group__0 )
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getGroup()); 
            // InternalActionLanguage.g:1092:1: ( rule__TypedNamedElementExpression__Group__0 )
            // InternalActionLanguage.g:1092:2: rule__TypedNamedElementExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedNamedElementExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypedNamedElementExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypedNamedElementExpression"


    // $ANTLR start "entryRuleArrayIndexExpression"
    // InternalActionLanguage.g:1104:1: entryRuleArrayIndexExpression : ruleArrayIndexExpression EOF ;
    public final void entryRuleArrayIndexExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:1105:1: ( ruleArrayIndexExpression EOF )
            // InternalActionLanguage.g:1106:1: ruleArrayIndexExpression EOF
            {
             before(grammarAccess.getArrayIndexExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleArrayIndexExpression();

            state._fsp--;

             after(grammarAccess.getArrayIndexExpressionRule()); 
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
    // $ANTLR end "entryRuleArrayIndexExpression"


    // $ANTLR start "ruleArrayIndexExpression"
    // InternalActionLanguage.g:1113:1: ruleArrayIndexExpression : ( ( rule__ArrayIndexExpression__Group__0 ) ) ;
    public final void ruleArrayIndexExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1117:2: ( ( ( rule__ArrayIndexExpression__Group__0 ) ) )
            // InternalActionLanguage.g:1118:1: ( ( rule__ArrayIndexExpression__Group__0 ) )
            {
            // InternalActionLanguage.g:1118:1: ( ( rule__ArrayIndexExpression__Group__0 ) )
            // InternalActionLanguage.g:1119:1: ( rule__ArrayIndexExpression__Group__0 )
            {
             before(grammarAccess.getArrayIndexExpressionAccess().getGroup()); 
            // InternalActionLanguage.g:1120:1: ( rule__ArrayIndexExpression__Group__0 )
            // InternalActionLanguage.g:1120:2: rule__ArrayIndexExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayIndexExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayIndexExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayIndexExpression"


    // $ANTLR start "entryRuleAttributeAccessorExpression"
    // InternalActionLanguage.g:1132:1: entryRuleAttributeAccessorExpression : ruleAttributeAccessorExpression EOF ;
    public final void entryRuleAttributeAccessorExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:1133:1: ( ruleAttributeAccessorExpression EOF )
            // InternalActionLanguage.g:1134:1: ruleAttributeAccessorExpression EOF
            {
             before(grammarAccess.getAttributeAccessorExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttributeAccessorExpression();

            state._fsp--;

             after(grammarAccess.getAttributeAccessorExpressionRule()); 
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
    // $ANTLR end "entryRuleAttributeAccessorExpression"


    // $ANTLR start "ruleAttributeAccessorExpression"
    // InternalActionLanguage.g:1141:1: ruleAttributeAccessorExpression : ( ( rule__AttributeAccessorExpression__Group__0 ) ) ;
    public final void ruleAttributeAccessorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1145:2: ( ( ( rule__AttributeAccessorExpression__Group__0 ) ) )
            // InternalActionLanguage.g:1146:1: ( ( rule__AttributeAccessorExpression__Group__0 ) )
            {
            // InternalActionLanguage.g:1146:1: ( ( rule__AttributeAccessorExpression__Group__0 ) )
            // InternalActionLanguage.g:1147:1: ( rule__AttributeAccessorExpression__Group__0 )
            {
             before(grammarAccess.getAttributeAccessorExpressionAccess().getGroup()); 
            // InternalActionLanguage.g:1148:1: ( rule__AttributeAccessorExpression__Group__0 )
            // InternalActionLanguage.g:1148:2: rule__AttributeAccessorExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeAccessorExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccessorExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeAccessorExpression"


    // $ANTLR start "entryRuleNoAttributeSelectorExpression"
    // InternalActionLanguage.g:1160:1: entryRuleNoAttributeSelectorExpression : ruleNoAttributeSelectorExpression EOF ;
    public final void entryRuleNoAttributeSelectorExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:1161:1: ( ruleNoAttributeSelectorExpression EOF )
            // InternalActionLanguage.g:1162:1: ruleNoAttributeSelectorExpression EOF
            {
             before(grammarAccess.getNoAttributeSelectorExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNoAttributeSelectorExpression();

            state._fsp--;

             after(grammarAccess.getNoAttributeSelectorExpressionRule()); 
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
    // $ANTLR end "entryRuleNoAttributeSelectorExpression"


    // $ANTLR start "ruleNoAttributeSelectorExpression"
    // InternalActionLanguage.g:1169:1: ruleNoAttributeSelectorExpression : ( ( rule__NoAttributeSelectorExpression__PositionAssignment ) ) ;
    public final void ruleNoAttributeSelectorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1173:2: ( ( ( rule__NoAttributeSelectorExpression__PositionAssignment ) ) )
            // InternalActionLanguage.g:1174:1: ( ( rule__NoAttributeSelectorExpression__PositionAssignment ) )
            {
            // InternalActionLanguage.g:1174:1: ( ( rule__NoAttributeSelectorExpression__PositionAssignment ) )
            // InternalActionLanguage.g:1175:1: ( rule__NoAttributeSelectorExpression__PositionAssignment )
            {
             before(grammarAccess.getNoAttributeSelectorExpressionAccess().getPositionAssignment()); 
            // InternalActionLanguage.g:1176:1: ( rule__NoAttributeSelectorExpression__PositionAssignment )
            // InternalActionLanguage.g:1176:2: rule__NoAttributeSelectorExpression__PositionAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NoAttributeSelectorExpression__PositionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNoAttributeSelectorExpressionAccess().getPositionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoAttributeSelectorExpression"


    // $ANTLR start "entryRulePositionSelectorExpression"
    // InternalActionLanguage.g:1188:1: entryRulePositionSelectorExpression : rulePositionSelectorExpression EOF ;
    public final void entryRulePositionSelectorExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:1189:1: ( rulePositionSelectorExpression EOF )
            // InternalActionLanguage.g:1190:1: rulePositionSelectorExpression EOF
            {
             before(grammarAccess.getPositionSelectorExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePositionSelectorExpression();

            state._fsp--;

             after(grammarAccess.getPositionSelectorExpressionRule()); 
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
    // $ANTLR end "entryRulePositionSelectorExpression"


    // $ANTLR start "rulePositionSelectorExpression"
    // InternalActionLanguage.g:1197:1: rulePositionSelectorExpression : ( ( rule__PositionSelectorExpression__Group__0 ) ) ;
    public final void rulePositionSelectorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1201:2: ( ( ( rule__PositionSelectorExpression__Group__0 ) ) )
            // InternalActionLanguage.g:1202:1: ( ( rule__PositionSelectorExpression__Group__0 ) )
            {
            // InternalActionLanguage.g:1202:1: ( ( rule__PositionSelectorExpression__Group__0 ) )
            // InternalActionLanguage.g:1203:1: ( rule__PositionSelectorExpression__Group__0 )
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getGroup()); 
            // InternalActionLanguage.g:1204:1: ( rule__PositionSelectorExpression__Group__0 )
            // InternalActionLanguage.g:1204:2: rule__PositionSelectorExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PositionSelectorExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPositionSelectorExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePositionSelectorExpression"


    // $ANTLR start "entryRuleOperationCall"
    // InternalActionLanguage.g:1216:1: entryRuleOperationCall : ruleOperationCall EOF ;
    public final void entryRuleOperationCall() throws RecognitionException {
        try {
            // InternalActionLanguage.g:1217:1: ( ruleOperationCall EOF )
            // InternalActionLanguage.g:1218:1: ruleOperationCall EOF
            {
             before(grammarAccess.getOperationCallRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOperationCall();

            state._fsp--;

             after(grammarAccess.getOperationCallRule()); 
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
    // $ANTLR end "entryRuleOperationCall"


    // $ANTLR start "ruleOperationCall"
    // InternalActionLanguage.g:1225:1: ruleOperationCall : ( ( rule__OperationCall__Group__0 ) ) ;
    public final void ruleOperationCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1229:2: ( ( ( rule__OperationCall__Group__0 ) ) )
            // InternalActionLanguage.g:1230:1: ( ( rule__OperationCall__Group__0 ) )
            {
            // InternalActionLanguage.g:1230:1: ( ( rule__OperationCall__Group__0 ) )
            // InternalActionLanguage.g:1231:1: ( rule__OperationCall__Group__0 )
            {
             before(grammarAccess.getOperationCallAccess().getGroup()); 
            // InternalActionLanguage.g:1232:1: ( rule__OperationCall__Group__0 )
            // InternalActionLanguage.g:1232:2: rule__OperationCall__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationCall"


    // $ANTLR start "entryRuleParamaterBinding"
    // InternalActionLanguage.g:1244:1: entryRuleParamaterBinding : ruleParamaterBinding EOF ;
    public final void entryRuleParamaterBinding() throws RecognitionException {
        try {
            // InternalActionLanguage.g:1245:1: ( ruleParamaterBinding EOF )
            // InternalActionLanguage.g:1246:1: ruleParamaterBinding EOF
            {
             before(grammarAccess.getParamaterBindingRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParamaterBinding();

            state._fsp--;

             after(grammarAccess.getParamaterBindingRule()); 
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
    // $ANTLR end "entryRuleParamaterBinding"


    // $ANTLR start "ruleParamaterBinding"
    // InternalActionLanguage.g:1253:1: ruleParamaterBinding : ( ( rule__ParamaterBinding__Group__0 ) ) ;
    public final void ruleParamaterBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1257:2: ( ( ( rule__ParamaterBinding__Group__0 ) ) )
            // InternalActionLanguage.g:1258:1: ( ( rule__ParamaterBinding__Group__0 ) )
            {
            // InternalActionLanguage.g:1258:1: ( ( rule__ParamaterBinding__Group__0 ) )
            // InternalActionLanguage.g:1259:1: ( rule__ParamaterBinding__Group__0 )
            {
             before(grammarAccess.getParamaterBindingAccess().getGroup()); 
            // InternalActionLanguage.g:1260:1: ( rule__ParamaterBinding__Group__0 )
            // InternalActionLanguage.g:1260:2: rule__ParamaterBinding__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParamaterBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamaterBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParamaterBinding"


    // $ANTLR start "entryRuleTriggerMessageExpression"
    // InternalActionLanguage.g:1272:1: entryRuleTriggerMessageExpression : ruleTriggerMessageExpression EOF ;
    public final void entryRuleTriggerMessageExpression() throws RecognitionException {
        try {
            // InternalActionLanguage.g:1273:1: ( ruleTriggerMessageExpression EOF )
            // InternalActionLanguage.g:1274:1: ruleTriggerMessageExpression EOF
            {
             before(grammarAccess.getTriggerMessageExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTriggerMessageExpression();

            state._fsp--;

             after(grammarAccess.getTriggerMessageExpressionRule()); 
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
    // $ANTLR end "entryRuleTriggerMessageExpression"


    // $ANTLR start "ruleTriggerMessageExpression"
    // InternalActionLanguage.g:1281:1: ruleTriggerMessageExpression : ( ( rule__TriggerMessageExpression__Group__0 ) ) ;
    public final void ruleTriggerMessageExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1285:2: ( ( ( rule__TriggerMessageExpression__Group__0 ) ) )
            // InternalActionLanguage.g:1286:1: ( ( rule__TriggerMessageExpression__Group__0 ) )
            {
            // InternalActionLanguage.g:1286:1: ( ( rule__TriggerMessageExpression__Group__0 ) )
            // InternalActionLanguage.g:1287:1: ( rule__TriggerMessageExpression__Group__0 )
            {
             before(grammarAccess.getTriggerMessageExpressionAccess().getGroup()); 
            // InternalActionLanguage.g:1288:1: ( rule__TriggerMessageExpression__Group__0 )
            // InternalActionLanguage.g:1288:2: rule__TriggerMessageExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TriggerMessageExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerMessageExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTriggerMessageExpression"


    // $ANTLR start "entryRuleDATATYPE"
    // InternalActionLanguage.g:1300:1: entryRuleDATATYPE : ruleDATATYPE EOF ;
    public final void entryRuleDATATYPE() throws RecognitionException {
        try {
            // InternalActionLanguage.g:1301:1: ( ruleDATATYPE EOF )
            // InternalActionLanguage.g:1302:1: ruleDATATYPE EOF
            {
             before(grammarAccess.getDATATYPERule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDATATYPE();

            state._fsp--;

             after(grammarAccess.getDATATYPERule()); 
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
    // $ANTLR end "entryRuleDATATYPE"


    // $ANTLR start "ruleDATATYPE"
    // InternalActionLanguage.g:1309:1: ruleDATATYPE : ( ( rule__DATATYPE__Group__0 ) ) ;
    public final void ruleDATATYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1313:2: ( ( ( rule__DATATYPE__Group__0 ) ) )
            // InternalActionLanguage.g:1314:1: ( ( rule__DATATYPE__Group__0 ) )
            {
            // InternalActionLanguage.g:1314:1: ( ( rule__DATATYPE__Group__0 ) )
            // InternalActionLanguage.g:1315:1: ( rule__DATATYPE__Group__0 )
            {
             before(grammarAccess.getDATATYPEAccess().getGroup()); 
            // InternalActionLanguage.g:1316:1: ( rule__DATATYPE__Group__0 )
            // InternalActionLanguage.g:1316:2: rule__DATATYPE__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DATATYPE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDATATYPEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDATATYPE"


    // $ANTLR start "ruleUnaryPostIncrementDecrementOperator"
    // InternalActionLanguage.g:1329:1: ruleUnaryPostIncrementDecrementOperator : ( ( rule__UnaryPostIncrementDecrementOperator__Alternatives ) ) ;
    public final void ruleUnaryPostIncrementDecrementOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1333:1: ( ( ( rule__UnaryPostIncrementDecrementOperator__Alternatives ) ) )
            // InternalActionLanguage.g:1334:1: ( ( rule__UnaryPostIncrementDecrementOperator__Alternatives ) )
            {
            // InternalActionLanguage.g:1334:1: ( ( rule__UnaryPostIncrementDecrementOperator__Alternatives ) )
            // InternalActionLanguage.g:1335:1: ( rule__UnaryPostIncrementDecrementOperator__Alternatives )
            {
             before(grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getAlternatives()); 
            // InternalActionLanguage.g:1336:1: ( rule__UnaryPostIncrementDecrementOperator__Alternatives )
            // InternalActionLanguage.g:1336:2: rule__UnaryPostIncrementDecrementOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryPostIncrementDecrementOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryPostIncrementDecrementOperator"


    // $ANTLR start "ruleIncrementDecrementOperatorExpression"
    // InternalActionLanguage.g:1348:1: ruleIncrementDecrementOperatorExpression : ( ( rule__IncrementDecrementOperatorExpression__Alternatives ) ) ;
    public final void ruleIncrementDecrementOperatorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1352:1: ( ( ( rule__IncrementDecrementOperatorExpression__Alternatives ) ) )
            // InternalActionLanguage.g:1353:1: ( ( rule__IncrementDecrementOperatorExpression__Alternatives ) )
            {
            // InternalActionLanguage.g:1353:1: ( ( rule__IncrementDecrementOperatorExpression__Alternatives ) )
            // InternalActionLanguage.g:1354:1: ( rule__IncrementDecrementOperatorExpression__Alternatives )
            {
             before(grammarAccess.getIncrementDecrementOperatorExpressionAccess().getAlternatives()); 
            // InternalActionLanguage.g:1355:1: ( rule__IncrementDecrementOperatorExpression__Alternatives )
            // InternalActionLanguage.g:1355:2: rule__IncrementDecrementOperatorExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IncrementDecrementOperatorExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIncrementDecrementOperatorExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIncrementDecrementOperatorExpression"


    // $ANTLR start "ruleAssignOperator"
    // InternalActionLanguage.g:1367:1: ruleAssignOperator : ( ( rule__AssignOperator__Alternatives ) ) ;
    public final void ruleAssignOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1371:1: ( ( ( rule__AssignOperator__Alternatives ) ) )
            // InternalActionLanguage.g:1372:1: ( ( rule__AssignOperator__Alternatives ) )
            {
            // InternalActionLanguage.g:1372:1: ( ( rule__AssignOperator__Alternatives ) )
            // InternalActionLanguage.g:1373:1: ( rule__AssignOperator__Alternatives )
            {
             before(grammarAccess.getAssignOperatorAccess().getAlternatives()); 
            // InternalActionLanguage.g:1374:1: ( rule__AssignOperator__Alternatives )
            // InternalActionLanguage.g:1374:2: rule__AssignOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssignOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssignOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignOperator"


    // $ANTLR start "ruleLogicalOrOperator"
    // InternalActionLanguage.g:1386:1: ruleLogicalOrOperator : ( ( '||' ) ) ;
    public final void ruleLogicalOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1390:1: ( ( ( '||' ) ) )
            // InternalActionLanguage.g:1391:1: ( ( '||' ) )
            {
            // InternalActionLanguage.g:1391:1: ( ( '||' ) )
            // InternalActionLanguage.g:1392:1: ( '||' )
            {
             before(grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration()); 
            // InternalActionLanguage.g:1393:1: ( '||' )
            // InternalActionLanguage.g:1393:3: '||'
            {
            match(input,14,FollowSets000.FOLLOW_2); 

            }

             after(grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // InternalActionLanguage.g:1406:1: ruleLogicalAndOperator : ( ( '&&' ) ) ;
    public final void ruleLogicalAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1410:1: ( ( ( '&&' ) ) )
            // InternalActionLanguage.g:1411:1: ( ( '&&' ) )
            {
            // InternalActionLanguage.g:1411:1: ( ( '&&' ) )
            // InternalActionLanguage.g:1412:1: ( '&&' )
            {
             before(grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            // InternalActionLanguage.g:1413:1: ( '&&' )
            // InternalActionLanguage.g:1413:3: '&&'
            {
            match(input,15,FollowSets000.FOLLOW_2); 

            }

             after(grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "ruleComparingEQNEQOperator"
    // InternalActionLanguage.g:1426:1: ruleComparingEQNEQOperator : ( ( rule__ComparingEQNEQOperator__Alternatives ) ) ;
    public final void ruleComparingEQNEQOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1430:1: ( ( ( rule__ComparingEQNEQOperator__Alternatives ) ) )
            // InternalActionLanguage.g:1431:1: ( ( rule__ComparingEQNEQOperator__Alternatives ) )
            {
            // InternalActionLanguage.g:1431:1: ( ( rule__ComparingEQNEQOperator__Alternatives ) )
            // InternalActionLanguage.g:1432:1: ( rule__ComparingEQNEQOperator__Alternatives )
            {
             before(grammarAccess.getComparingEQNEQOperatorAccess().getAlternatives()); 
            // InternalActionLanguage.g:1433:1: ( rule__ComparingEQNEQOperator__Alternatives )
            // InternalActionLanguage.g:1433:2: rule__ComparingEQNEQOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparingEQNEQOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparingEQNEQOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparingEQNEQOperator"


    // $ANTLR start "ruleComparingRelOperator"
    // InternalActionLanguage.g:1445:1: ruleComparingRelOperator : ( ( rule__ComparingRelOperator__Alternatives ) ) ;
    public final void ruleComparingRelOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1449:1: ( ( ( rule__ComparingRelOperator__Alternatives ) ) )
            // InternalActionLanguage.g:1450:1: ( ( rule__ComparingRelOperator__Alternatives ) )
            {
            // InternalActionLanguage.g:1450:1: ( ( rule__ComparingRelOperator__Alternatives ) )
            // InternalActionLanguage.g:1451:1: ( rule__ComparingRelOperator__Alternatives )
            {
             before(grammarAccess.getComparingRelOperatorAccess().getAlternatives()); 
            // InternalActionLanguage.g:1452:1: ( rule__ComparingRelOperator__Alternatives )
            // InternalActionLanguage.g:1452:2: rule__ComparingRelOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparingRelOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparingRelOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparingRelOperator"


    // $ANTLR start "ruleAdditionOperator"
    // InternalActionLanguage.g:1464:1: ruleAdditionOperator : ( ( rule__AdditionOperator__Alternatives ) ) ;
    public final void ruleAdditionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1468:1: ( ( ( rule__AdditionOperator__Alternatives ) ) )
            // InternalActionLanguage.g:1469:1: ( ( rule__AdditionOperator__Alternatives ) )
            {
            // InternalActionLanguage.g:1469:1: ( ( rule__AdditionOperator__Alternatives ) )
            // InternalActionLanguage.g:1470:1: ( rule__AdditionOperator__Alternatives )
            {
             before(grammarAccess.getAdditionOperatorAccess().getAlternatives()); 
            // InternalActionLanguage.g:1471:1: ( rule__AdditionOperator__Alternatives )
            // InternalActionLanguage.g:1471:2: rule__AdditionOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditionOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAdditionOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionOperator"


    // $ANTLR start "ruleMultiplicationOperator"
    // InternalActionLanguage.g:1483:1: ruleMultiplicationOperator : ( ( rule__MultiplicationOperator__Alternatives ) ) ;
    public final void ruleMultiplicationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1487:1: ( ( ( rule__MultiplicationOperator__Alternatives ) ) )
            // InternalActionLanguage.g:1488:1: ( ( rule__MultiplicationOperator__Alternatives ) )
            {
            // InternalActionLanguage.g:1488:1: ( ( rule__MultiplicationOperator__Alternatives ) )
            // InternalActionLanguage.g:1489:1: ( rule__MultiplicationOperator__Alternatives )
            {
             before(grammarAccess.getMultiplicationOperatorAccess().getAlternatives()); 
            // InternalActionLanguage.g:1490:1: ( rule__MultiplicationOperator__Alternatives )
            // InternalActionLanguage.g:1490:2: rule__MultiplicationOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicationOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicationOperator"


    // $ANTLR start "ruleUnaryPreOperator"
    // InternalActionLanguage.g:1502:1: ruleUnaryPreOperator : ( ( rule__UnaryPreOperator__Alternatives ) ) ;
    public final void ruleUnaryPreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1506:1: ( ( ( rule__UnaryPreOperator__Alternatives ) ) )
            // InternalActionLanguage.g:1507:1: ( ( rule__UnaryPreOperator__Alternatives ) )
            {
            // InternalActionLanguage.g:1507:1: ( ( rule__UnaryPreOperator__Alternatives ) )
            // InternalActionLanguage.g:1508:1: ( rule__UnaryPreOperator__Alternatives )
            {
             before(grammarAccess.getUnaryPreOperatorAccess().getAlternatives()); 
            // InternalActionLanguage.g:1509:1: ( rule__UnaryPreOperator__Alternatives )
            // InternalActionLanguage.g:1509:2: rule__UnaryPreOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryPreOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryPreOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryPreOperator"


    // $ANTLR start "rulePositionSelectorKind"
    // InternalActionLanguage.g:1521:1: rulePositionSelectorKind : ( ( rule__PositionSelectorKind__Alternatives ) ) ;
    public final void rulePositionSelectorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1525:1: ( ( ( rule__PositionSelectorKind__Alternatives ) ) )
            // InternalActionLanguage.g:1526:1: ( ( rule__PositionSelectorKind__Alternatives ) )
            {
            // InternalActionLanguage.g:1526:1: ( ( rule__PositionSelectorKind__Alternatives ) )
            // InternalActionLanguage.g:1527:1: ( rule__PositionSelectorKind__Alternatives )
            {
             before(grammarAccess.getPositionSelectorKindAccess().getAlternatives()); 
            // InternalActionLanguage.g:1528:1: ( rule__PositionSelectorKind__Alternatives )
            // InternalActionLanguage.g:1528:2: rule__PositionSelectorKind__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PositionSelectorKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPositionSelectorKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePositionSelectorKind"


    // $ANTLR start "rule__Entry__Alternatives"
    // InternalActionLanguage.g:1539:1: rule__Entry__Alternatives : ( ( ruleBlock ) | ( ruleExpression ) | ( ruleArrayInitializeExpression ) );
    public final void rule__Entry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1543:1: ( ( ruleBlock ) | ( ruleExpression ) | ( ruleArrayInitializeExpression ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt1=1;
                }
                break;
            case RULE_INT:
            case RULE_NUMBER:
            case RULE_BOOLEAN:
            case RULE_ID:
            case RULE_MINORMAXKEYWORD:
            case 16:
            case 29:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 42:
                {
                alt1=2;
                }
                break;
            case 52:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalActionLanguage.g:1544:1: ( ruleBlock )
                    {
                    // InternalActionLanguage.g:1544:1: ( ruleBlock )
                    // InternalActionLanguage.g:1545:1: ruleBlock
                    {
                     before(grammarAccess.getEntryAccess().getBlockParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBlock();

                    state._fsp--;

                     after(grammarAccess.getEntryAccess().getBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:1550:6: ( ruleExpression )
                    {
                    // InternalActionLanguage.g:1550:6: ( ruleExpression )
                    // InternalActionLanguage.g:1551:1: ruleExpression
                    {
                     before(grammarAccess.getEntryAccess().getExpressionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getEntryAccess().getExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalActionLanguage.g:1556:6: ( ruleArrayInitializeExpression )
                    {
                    // InternalActionLanguage.g:1556:6: ( ruleArrayInitializeExpression )
                    // InternalActionLanguage.g:1557:1: ruleArrayInitializeExpression
                    {
                     before(grammarAccess.getEntryAccess().getArrayInitializeExpressionParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleArrayInitializeExpression();

                    state._fsp--;

                     after(grammarAccess.getEntryAccess().getArrayInitializeExpressionParserRuleCall_2()); 

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
    // $ANTLR end "rule__Entry__Alternatives"


    // $ANTLR start "rule__ForLoopCountingExpression__Alternatives_1"
    // InternalActionLanguage.g:1567:1: rule__ForLoopCountingExpression__Alternatives_1 : ( ( ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 ) ) | ( ( rule__ForLoopCountingExpression__Group_1_1__0 ) ) );
    public final void rule__ForLoopCountingExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1571:1: ( ( ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 ) ) | ( ( rule__ForLoopCountingExpression__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=17 && LA2_0<=18)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=19 && LA2_0<=21)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalActionLanguage.g:1572:1: ( ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 ) )
                    {
                    // InternalActionLanguage.g:1572:1: ( ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 ) )
                    // InternalActionLanguage.g:1573:1: ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 )
                    {
                     before(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorAssignment_1_0()); 
                    // InternalActionLanguage.g:1574:1: ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 )
                    // InternalActionLanguage.g:1574:2: rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:1578:6: ( ( rule__ForLoopCountingExpression__Group_1_1__0 ) )
                    {
                    // InternalActionLanguage.g:1578:6: ( ( rule__ForLoopCountingExpression__Group_1_1__0 ) )
                    // InternalActionLanguage.g:1579:1: ( rule__ForLoopCountingExpression__Group_1_1__0 )
                    {
                     before(grammarAccess.getForLoopCountingExpressionAccess().getGroup_1_1()); 
                    // InternalActionLanguage.g:1580:1: ( rule__ForLoopCountingExpression__Group_1_1__0 )
                    // InternalActionLanguage.g:1580:2: rule__ForLoopCountingExpression__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ForLoopCountingExpression__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getForLoopCountingExpressionAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__ForLoopCountingExpression__Alternatives_1"


    // $ANTLR start "rule__ExpressionStartRule__Alternatives"
    // InternalActionLanguage.g:1589:1: rule__ExpressionStartRule__Alternatives : ( ( ruleAssignment ) | ( ruleForLoop ) | ( ruleWhileLoop ) | ( ruleDoWhileLoop ) | ( ruleIfStatement ) | ( ruleReturnStatement ) | ( ruleLocalVariableOrConstantDeclarationStatement ) | ( ruleOperationCallStatement ) );
    public final void rule__ExpressionStartRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1593:1: ( ( ruleAssignment ) | ( ruleForLoop ) | ( ruleWhileLoop ) | ( ruleDoWhileLoop ) | ( ruleIfStatement ) | ( ruleReturnStatement ) | ( ruleLocalVariableOrConstantDeclarationStatement ) | ( ruleOperationCallStatement ) )
            int alt3=8;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalActionLanguage.g:1594:1: ( ruleAssignment )
                    {
                    // InternalActionLanguage.g:1594:1: ( ruleAssignment )
                    // InternalActionLanguage.g:1595:1: ruleAssignment
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getAssignmentParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getAssignmentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:1600:6: ( ruleForLoop )
                    {
                    // InternalActionLanguage.g:1600:6: ( ruleForLoop )
                    // InternalActionLanguage.g:1601:1: ruleForLoop
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getForLoopParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleForLoop();

                    state._fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getForLoopParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalActionLanguage.g:1606:6: ( ruleWhileLoop )
                    {
                    // InternalActionLanguage.g:1606:6: ( ruleWhileLoop )
                    // InternalActionLanguage.g:1607:1: ruleWhileLoop
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getWhileLoopParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleWhileLoop();

                    state._fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getWhileLoopParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalActionLanguage.g:1612:6: ( ruleDoWhileLoop )
                    {
                    // InternalActionLanguage.g:1612:6: ( ruleDoWhileLoop )
                    // InternalActionLanguage.g:1613:1: ruleDoWhileLoop
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getDoWhileLoopParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDoWhileLoop();

                    state._fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getDoWhileLoopParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalActionLanguage.g:1618:6: ( ruleIfStatement )
                    {
                    // InternalActionLanguage.g:1618:6: ( ruleIfStatement )
                    // InternalActionLanguage.g:1619:1: ruleIfStatement
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getIfStatementParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleIfStatement();

                    state._fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getIfStatementParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalActionLanguage.g:1624:6: ( ruleReturnStatement )
                    {
                    // InternalActionLanguage.g:1624:6: ( ruleReturnStatement )
                    // InternalActionLanguage.g:1625:1: ruleReturnStatement
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getReturnStatementParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleReturnStatement();

                    state._fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getReturnStatementParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalActionLanguage.g:1630:6: ( ruleLocalVariableOrConstantDeclarationStatement )
                    {
                    // InternalActionLanguage.g:1630:6: ( ruleLocalVariableOrConstantDeclarationStatement )
                    // InternalActionLanguage.g:1631:1: ruleLocalVariableOrConstantDeclarationStatement
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getLocalVariableOrConstantDeclarationStatementParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleLocalVariableOrConstantDeclarationStatement();

                    state._fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getLocalVariableOrConstantDeclarationStatementParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalActionLanguage.g:1636:6: ( ruleOperationCallStatement )
                    {
                    // InternalActionLanguage.g:1636:6: ( ruleOperationCallStatement )
                    // InternalActionLanguage.g:1637:1: ruleOperationCallStatement
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getOperationCallStatementParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleOperationCallStatement();

                    state._fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getOperationCallStatementParserRuleCall_7()); 

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
    // $ANTLR end "rule__ExpressionStartRule__Alternatives"


    // $ANTLR start "rule__Assignment__Alternatives_1"
    // InternalActionLanguage.g:1647:1: rule__Assignment__Alternatives_1 : ( ( ( rule__Assignment__Group_1_0__0 ) ) | ( ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 ) ) );
    public final void rule__Assignment__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1651:1: ( ( ( rule__Assignment__Group_1_0__0 ) ) | ( ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=19 && LA4_0<=21)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=17 && LA4_0<=18)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalActionLanguage.g:1652:1: ( ( rule__Assignment__Group_1_0__0 ) )
                    {
                    // InternalActionLanguage.g:1652:1: ( ( rule__Assignment__Group_1_0__0 ) )
                    // InternalActionLanguage.g:1653:1: ( rule__Assignment__Group_1_0__0 )
                    {
                     before(grammarAccess.getAssignmentAccess().getGroup_1_0()); 
                    // InternalActionLanguage.g:1654:1: ( rule__Assignment__Group_1_0__0 )
                    // InternalActionLanguage.g:1654:2: rule__Assignment__Group_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Assignment__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:1658:6: ( ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 ) )
                    {
                    // InternalActionLanguage.g:1658:6: ( ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 ) )
                    // InternalActionLanguage.g:1659:1: ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 )
                    {
                     before(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorAssignment_1_1()); 
                    // InternalActionLanguage.g:1660:1: ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 )
                    // InternalActionLanguage.g:1660:2: rule__Assignment__IncrementDecrementOperatorAssignment_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Assignment__IncrementDecrementOperatorAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__Assignment__Alternatives_1"


    // $ANTLR start "rule__InitializeExpression__Alternatives"
    // InternalActionLanguage.g:1669:1: rule__InitializeExpression__Alternatives : ( ( ruleArrayInitializeExpression ) | ( ruleNondeterministicChoiceExpression ) | ( ruleExpression ) );
    public final void rule__InitializeExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1673:1: ( ( ruleArrayInitializeExpression ) | ( ruleNondeterministicChoiceExpression ) | ( ruleExpression ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalActionLanguage.g:1674:1: ( ruleArrayInitializeExpression )
                    {
                    // InternalActionLanguage.g:1674:1: ( ruleArrayInitializeExpression )
                    // InternalActionLanguage.g:1675:1: ruleArrayInitializeExpression
                    {
                     before(grammarAccess.getInitializeExpressionAccess().getArrayInitializeExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleArrayInitializeExpression();

                    state._fsp--;

                     after(grammarAccess.getInitializeExpressionAccess().getArrayInitializeExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:1680:6: ( ruleNondeterministicChoiceExpression )
                    {
                    // InternalActionLanguage.g:1680:6: ( ruleNondeterministicChoiceExpression )
                    // InternalActionLanguage.g:1681:1: ruleNondeterministicChoiceExpression
                    {
                     before(grammarAccess.getInitializeExpressionAccess().getNondeterministicChoiceExpressionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNondeterministicChoiceExpression();

                    state._fsp--;

                     after(grammarAccess.getInitializeExpressionAccess().getNondeterministicChoiceExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalActionLanguage.g:1686:6: ( ruleExpression )
                    {
                    // InternalActionLanguage.g:1686:6: ( ruleExpression )
                    // InternalActionLanguage.g:1687:1: ruleExpression
                    {
                     before(grammarAccess.getInitializeExpressionAccess().getExpressionParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getInitializeExpressionAccess().getExpressionParserRuleCall_2()); 

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
    // $ANTLR end "rule__InitializeExpression__Alternatives"


    // $ANTLR start "rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0"
    // InternalActionLanguage.g:1697:1: rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 : ( ( ruleLocalVariableDeclaration ) | ( ruleLocalConstantDeclaration ) );
    public final void rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1701:1: ( ( ruleLocalVariableDeclaration ) | ( ruleLocalConstantDeclaration ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==57) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalActionLanguage.g:1702:1: ( ruleLocalVariableDeclaration )
                    {
                    // InternalActionLanguage.g:1702:1: ( ruleLocalVariableDeclaration )
                    // InternalActionLanguage.g:1703:1: ruleLocalVariableDeclaration
                    {
                     before(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableLocalVariableDeclarationParserRuleCall_0_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleLocalVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableLocalVariableDeclarationParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:1708:6: ( ruleLocalConstantDeclaration )
                    {
                    // InternalActionLanguage.g:1708:6: ( ruleLocalConstantDeclaration )
                    // InternalActionLanguage.g:1709:1: ruleLocalConstantDeclaration
                    {
                     before(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableLocalConstantDeclarationParserRuleCall_0_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleLocalConstantDeclaration();

                    state._fsp--;

                     after(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableLocalConstantDeclarationParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0"


    // $ANTLR start "rule__MultiplicationExpression__Alternatives"
    // InternalActionLanguage.g:1719:1: rule__MultiplicationExpression__Alternatives : ( ( ruleUnaryPreExpression ) | ( ( rule__MultiplicationExpression__Group_1__0 ) ) );
    public final void rule__MultiplicationExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1723:1: ( ( ruleUnaryPreExpression ) | ( ( rule__MultiplicationExpression__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29||LA7_0==33) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_MINORMAXKEYWORD)||LA7_0==16||(LA7_0>=34 && LA7_0<=38)||LA7_0==42) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalActionLanguage.g:1724:1: ( ruleUnaryPreExpression )
                    {
                    // InternalActionLanguage.g:1724:1: ( ruleUnaryPreExpression )
                    // InternalActionLanguage.g:1725:1: ruleUnaryPreExpression
                    {
                     before(grammarAccess.getMultiplicationExpressionAccess().getUnaryPreExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleUnaryPreExpression();

                    state._fsp--;

                     after(grammarAccess.getMultiplicationExpressionAccess().getUnaryPreExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:1730:6: ( ( rule__MultiplicationExpression__Group_1__0 ) )
                    {
                    // InternalActionLanguage.g:1730:6: ( ( rule__MultiplicationExpression__Group_1__0 ) )
                    // InternalActionLanguage.g:1731:1: ( rule__MultiplicationExpression__Group_1__0 )
                    {
                     before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 
                    // InternalActionLanguage.g:1732:1: ( rule__MultiplicationExpression__Group_1__0 )
                    // InternalActionLanguage.g:1732:2: rule__MultiplicationExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MultiplicationExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MultiplicationExpression__Alternatives"


    // $ANTLR start "rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0"
    // InternalActionLanguage.g:1741:1: rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 : ( ( ruleUnaryPreExpression ) | ( ruleTypeCastExpression ) );
    public final void rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1745:1: ( ( ruleUnaryPreExpression ) | ( ruleTypeCastExpression ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29||LA8_0==33) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_INT && LA8_0<=RULE_MINORMAXKEYWORD)||LA8_0==16||(LA8_0>=34 && LA8_0<=38)||LA8_0==42) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalActionLanguage.g:1746:1: ( ruleUnaryPreExpression )
                    {
                    // InternalActionLanguage.g:1746:1: ( ruleUnaryPreExpression )
                    // InternalActionLanguage.g:1747:1: ruleUnaryPreExpression
                    {
                     before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionUnaryPreExpressionParserRuleCall_1_1_2_0_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleUnaryPreExpression();

                    state._fsp--;

                     after(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionUnaryPreExpressionParserRuleCall_1_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:1752:6: ( ruleTypeCastExpression )
                    {
                    // InternalActionLanguage.g:1752:6: ( ruleTypeCastExpression )
                    // InternalActionLanguage.g:1753:1: ruleTypeCastExpression
                    {
                     before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionTypeCastExpressionParserRuleCall_1_1_2_0_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTypeCastExpression();

                    state._fsp--;

                     after(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionTypeCastExpressionParserRuleCall_1_1_2_0_1()); 

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
    // $ANTLR end "rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0"


    // $ANTLR start "rule__TypeCastExpression__Alternatives"
    // InternalActionLanguage.g:1763:1: rule__TypeCastExpression__Alternatives : ( ( ruleOperand ) | ( ( rule__TypeCastExpression__Group_1__0 ) ) );
    public final void rule__TypeCastExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1767:1: ( ( ruleOperand ) | ( ( rule__TypeCastExpression__Group_1__0 ) ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalActionLanguage.g:1768:1: ( ruleOperand )
                    {
                    // InternalActionLanguage.g:1768:1: ( ruleOperand )
                    // InternalActionLanguage.g:1769:1: ruleOperand
                    {
                     before(grammarAccess.getTypeCastExpressionAccess().getOperandParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleOperand();

                    state._fsp--;

                     after(grammarAccess.getTypeCastExpressionAccess().getOperandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:1774:6: ( ( rule__TypeCastExpression__Group_1__0 ) )
                    {
                    // InternalActionLanguage.g:1774:6: ( ( rule__TypeCastExpression__Group_1__0 ) )
                    // InternalActionLanguage.g:1775:1: ( rule__TypeCastExpression__Group_1__0 )
                    {
                     before(grammarAccess.getTypeCastExpressionAccess().getGroup_1()); 
                    // InternalActionLanguage.g:1776:1: ( rule__TypeCastExpression__Group_1__0 )
                    // InternalActionLanguage.g:1776:2: rule__TypeCastExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TypeCastExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeCastExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__TypeCastExpression__Alternatives"


    // $ANTLR start "rule__Operand__Alternatives"
    // InternalActionLanguage.g:1785:1: rule__Operand__Alternatives : ( ( ( rule__Operand__Group_0__0 ) ) | ( ruleLiteralExpression ) | ( ruleExtendedTypedNamedElementExpression ) | ( ruleTimeValueExpression ) | ( ruleOperationCall ) | ( ruleTriggerMessageExpression ) | ( ruleNoAttributeSelectorExpression ) );
    public final void rule__Operand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1789:1: ( ( ( rule__Operand__Group_0__0 ) ) | ( ruleLiteralExpression ) | ( ruleExtendedTypedNamedElementExpression ) | ( ruleTimeValueExpression ) | ( ruleOperationCall ) | ( ruleTriggerMessageExpression ) | ( ruleNoAttributeSelectorExpression ) )
            int alt10=7;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalActionLanguage.g:1790:1: ( ( rule__Operand__Group_0__0 ) )
                    {
                    // InternalActionLanguage.g:1790:1: ( ( rule__Operand__Group_0__0 ) )
                    // InternalActionLanguage.g:1791:1: ( rule__Operand__Group_0__0 )
                    {
                     before(grammarAccess.getOperandAccess().getGroup_0()); 
                    // InternalActionLanguage.g:1792:1: ( rule__Operand__Group_0__0 )
                    // InternalActionLanguage.g:1792:2: rule__Operand__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Operand__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperandAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:1796:6: ( ruleLiteralExpression )
                    {
                    // InternalActionLanguage.g:1796:6: ( ruleLiteralExpression )
                    // InternalActionLanguage.g:1797:1: ruleLiteralExpression
                    {
                     before(grammarAccess.getOperandAccess().getLiteralExpressionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getOperandAccess().getLiteralExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalActionLanguage.g:1802:6: ( ruleExtendedTypedNamedElementExpression )
                    {
                    // InternalActionLanguage.g:1802:6: ( ruleExtendedTypedNamedElementExpression )
                    // InternalActionLanguage.g:1803:1: ruleExtendedTypedNamedElementExpression
                    {
                     before(grammarAccess.getOperandAccess().getExtendedTypedNamedElementExpressionParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleExtendedTypedNamedElementExpression();

                    state._fsp--;

                     after(grammarAccess.getOperandAccess().getExtendedTypedNamedElementExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalActionLanguage.g:1808:6: ( ruleTimeValueExpression )
                    {
                    // InternalActionLanguage.g:1808:6: ( ruleTimeValueExpression )
                    // InternalActionLanguage.g:1809:1: ruleTimeValueExpression
                    {
                     before(grammarAccess.getOperandAccess().getTimeValueExpressionParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTimeValueExpression();

                    state._fsp--;

                     after(grammarAccess.getOperandAccess().getTimeValueExpressionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalActionLanguage.g:1814:6: ( ruleOperationCall )
                    {
                    // InternalActionLanguage.g:1814:6: ( ruleOperationCall )
                    // InternalActionLanguage.g:1815:1: ruleOperationCall
                    {
                     before(grammarAccess.getOperandAccess().getOperationCallParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleOperationCall();

                    state._fsp--;

                     after(grammarAccess.getOperandAccess().getOperationCallParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalActionLanguage.g:1820:6: ( ruleTriggerMessageExpression )
                    {
                    // InternalActionLanguage.g:1820:6: ( ruleTriggerMessageExpression )
                    // InternalActionLanguage.g:1821:1: ruleTriggerMessageExpression
                    {
                     before(grammarAccess.getOperandAccess().getTriggerMessageExpressionParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTriggerMessageExpression();

                    state._fsp--;

                     after(grammarAccess.getOperandAccess().getTriggerMessageExpressionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalActionLanguage.g:1826:6: ( ruleNoAttributeSelectorExpression )
                    {
                    // InternalActionLanguage.g:1826:6: ( ruleNoAttributeSelectorExpression )
                    // InternalActionLanguage.g:1827:1: ruleNoAttributeSelectorExpression
                    {
                     before(grammarAccess.getOperandAccess().getNoAttributeSelectorExpressionParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNoAttributeSelectorExpression();

                    state._fsp--;

                     after(grammarAccess.getOperandAccess().getNoAttributeSelectorExpressionParserRuleCall_6()); 

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
    // $ANTLR end "rule__Operand__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalActionLanguage.g:1837:1: rule__Literal__Alternatives : ( ( RULE_NUMBER ) | ( RULE_BOOLEAN ) | ( RULE_INT ) | ( 'null' ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1841:1: ( ( RULE_NUMBER ) | ( RULE_BOOLEAN ) | ( RULE_INT ) | ( 'null' ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
                {
                alt11=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt11=2;
                }
                break;
            case RULE_INT:
                {
                alt11=3;
                }
                break;
            case 16:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalActionLanguage.g:1842:1: ( RULE_NUMBER )
                    {
                    // InternalActionLanguage.g:1842:1: ( RULE_NUMBER )
                    // InternalActionLanguage.g:1843:1: RULE_NUMBER
                    {
                     before(grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0()); 
                    match(input,RULE_NUMBER,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:1848:6: ( RULE_BOOLEAN )
                    {
                    // InternalActionLanguage.g:1848:6: ( RULE_BOOLEAN )
                    // InternalActionLanguage.g:1849:1: RULE_BOOLEAN
                    {
                     before(grammarAccess.getLiteralAccess().getBOOLEANTerminalRuleCall_1()); 
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getBOOLEANTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalActionLanguage.g:1854:6: ( RULE_INT )
                    {
                    // InternalActionLanguage.g:1854:6: ( RULE_INT )
                    // InternalActionLanguage.g:1855:1: RULE_INT
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalActionLanguage.g:1860:6: ( 'null' )
                    {
                    // InternalActionLanguage.g:1860:6: ( 'null' )
                    // InternalActionLanguage.g:1861:1: 'null'
                    {
                     before(grammarAccess.getLiteralAccess().getNullKeyword_3()); 
                    match(input,16,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getNullKeyword_3()); 

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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Alternatives_1"
    // InternalActionLanguage.g:1873:1: rule__ExtendedTypedNamedElementExpression__Alternatives_1 : ( ( ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 ) ) | ( ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 ) ) );
    public final void rule__ExtendedTypedNamedElementExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1877:1: ( ( ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 ) ) | ( ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==55) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=17 && LA12_0<=18)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalActionLanguage.g:1878:1: ( ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 ) )
                    {
                    // InternalActionLanguage.g:1878:1: ( ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 ) )
                    // InternalActionLanguage.g:1879:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 )
                    {
                     before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getGroup_1_0()); 
                    // InternalActionLanguage.g:1880:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 )
                    // InternalActionLanguage.g:1880:2: rule__ExtendedTypedNamedElementExpression__Group_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ExtendedTypedNamedElementExpression__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:1884:6: ( ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 ) )
                    {
                    // InternalActionLanguage.g:1884:6: ( ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 ) )
                    // InternalActionLanguage.g:1885:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 )
                    {
                     before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getGroup_1_1()); 
                    // InternalActionLanguage.g:1886:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 )
                    // InternalActionLanguage.g:1886:2: rule__ExtendedTypedNamedElementExpression__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ExtendedTypedNamedElementExpression__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Alternatives_1"


    // $ANTLR start "rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0"
    // InternalActionLanguage.g:1895:1: rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 : ( ( ruleArrayIndexExpression ) | ( ruleAttributeAccessorExpression ) );
    public final void rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1899:1: ( ( ruleArrayIndexExpression ) | ( ruleAttributeAccessorExpression ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==52) ) {
                alt13=1;
            }
            else if ( (LA13_0==56) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalActionLanguage.g:1900:1: ( ruleArrayIndexExpression )
                    {
                    // InternalActionLanguage.g:1900:1: ( ruleArrayIndexExpression )
                    // InternalActionLanguage.g:1901:1: ruleArrayIndexExpression
                    {
                     before(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsArrayIndexExpressionParserRuleCall_1_0_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleArrayIndexExpression();

                    state._fsp--;

                     after(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsArrayIndexExpressionParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:1906:6: ( ruleAttributeAccessorExpression )
                    {
                    // InternalActionLanguage.g:1906:6: ( ruleAttributeAccessorExpression )
                    // InternalActionLanguage.g:1907:1: ruleAttributeAccessorExpression
                    {
                     before(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsAttributeAccessorExpressionParserRuleCall_1_0_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAttributeAccessorExpression();

                    state._fsp--;

                     after(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsAttributeAccessorExpressionParserRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0"


    // $ANTLR start "rule__UnaryPostIncrementDecrementOperator__Alternatives"
    // InternalActionLanguage.g:1917:1: rule__UnaryPostIncrementDecrementOperator__Alternatives : ( ( ( '++' ) ) | ( ( '--' ) ) );
    public final void rule__UnaryPostIncrementDecrementOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1921:1: ( ( ( '++' ) ) | ( ( '--' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            else if ( (LA14_0==18) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalActionLanguage.g:1922:1: ( ( '++' ) )
                    {
                    // InternalActionLanguage.g:1922:1: ( ( '++' ) )
                    // InternalActionLanguage.g:1923:1: ( '++' )
                    {
                     before(grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0()); 
                    // InternalActionLanguage.g:1924:1: ( '++' )
                    // InternalActionLanguage.g:1924:3: '++'
                    {
                    match(input,17,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:1929:6: ( ( '--' ) )
                    {
                    // InternalActionLanguage.g:1929:6: ( ( '--' ) )
                    // InternalActionLanguage.g:1930:1: ( '--' )
                    {
                     before(grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getDECREMENTEnumLiteralDeclaration_1()); 
                    // InternalActionLanguage.g:1931:1: ( '--' )
                    // InternalActionLanguage.g:1931:3: '--'
                    {
                    match(input,18,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getDECREMENTEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__UnaryPostIncrementDecrementOperator__Alternatives"


    // $ANTLR start "rule__IncrementDecrementOperatorExpression__Alternatives"
    // InternalActionLanguage.g:1941:1: rule__IncrementDecrementOperatorExpression__Alternatives : ( ( ( '++' ) ) | ( ( '--' ) ) );
    public final void rule__IncrementDecrementOperatorExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1945:1: ( ( ( '++' ) ) | ( ( '--' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            else if ( (LA15_0==18) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalActionLanguage.g:1946:1: ( ( '++' ) )
                    {
                    // InternalActionLanguage.g:1946:1: ( ( '++' ) )
                    // InternalActionLanguage.g:1947:1: ( '++' )
                    {
                     before(grammarAccess.getIncrementDecrementOperatorExpressionAccess().getINCREMENTEnumLiteralDeclaration_0()); 
                    // InternalActionLanguage.g:1948:1: ( '++' )
                    // InternalActionLanguage.g:1948:3: '++'
                    {
                    match(input,17,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getIncrementDecrementOperatorExpressionAccess().getINCREMENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:1953:6: ( ( '--' ) )
                    {
                    // InternalActionLanguage.g:1953:6: ( ( '--' ) )
                    // InternalActionLanguage.g:1954:1: ( '--' )
                    {
                     before(grammarAccess.getIncrementDecrementOperatorExpressionAccess().getDECREMENTEnumLiteralDeclaration_1()); 
                    // InternalActionLanguage.g:1955:1: ( '--' )
                    // InternalActionLanguage.g:1955:3: '--'
                    {
                    match(input,18,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getIncrementDecrementOperatorExpressionAccess().getDECREMENTEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__IncrementDecrementOperatorExpression__Alternatives"


    // $ANTLR start "rule__AssignOperator__Alternatives"
    // InternalActionLanguage.g:1965:1: rule__AssignOperator__Alternatives : ( ( ( ':=' ) ) | ( ( '+=' ) ) | ( ( '-=' ) ) );
    public final void rule__AssignOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:1969:1: ( ( ( ':=' ) ) | ( ( '+=' ) ) | ( ( '-=' ) ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt16=1;
                }
                break;
            case 20:
                {
                alt16=2;
                }
                break;
            case 21:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalActionLanguage.g:1970:1: ( ( ':=' ) )
                    {
                    // InternalActionLanguage.g:1970:1: ( ( ':=' ) )
                    // InternalActionLanguage.g:1971:1: ( ':=' )
                    {
                     before(grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                    // InternalActionLanguage.g:1972:1: ( ':=' )
                    // InternalActionLanguage.g:1972:3: ':='
                    {
                    match(input,19,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:1977:6: ( ( '+=' ) )
                    {
                    // InternalActionLanguage.g:1977:6: ( ( '+=' ) )
                    // InternalActionLanguage.g:1978:1: ( '+=' )
                    {
                     before(grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_1()); 
                    // InternalActionLanguage.g:1979:1: ( '+=' )
                    // InternalActionLanguage.g:1979:3: '+='
                    {
                    match(input,20,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalActionLanguage.g:1984:6: ( ( '-=' ) )
                    {
                    // InternalActionLanguage.g:1984:6: ( ( '-=' ) )
                    // InternalActionLanguage.g:1985:1: ( '-=' )
                    {
                     before(grammarAccess.getAssignOperatorAccess().getMINUS_EQUALEnumLiteralDeclaration_2()); 
                    // InternalActionLanguage.g:1986:1: ( '-=' )
                    // InternalActionLanguage.g:1986:3: '-='
                    {
                    match(input,21,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getAssignOperatorAccess().getMINUS_EQUALEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__AssignOperator__Alternatives"


    // $ANTLR start "rule__ComparingEQNEQOperator__Alternatives"
    // InternalActionLanguage.g:1996:1: rule__ComparingEQNEQOperator__Alternatives : ( ( ( '==' ) ) | ( ( '<>' ) ) );
    public final void rule__ComparingEQNEQOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2000:1: ( ( ( '==' ) ) | ( ( '<>' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            else if ( (LA17_0==23) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalActionLanguage.g:2001:1: ( ( '==' ) )
                    {
                    // InternalActionLanguage.g:2001:1: ( ( '==' ) )
                    // InternalActionLanguage.g:2002:1: ( '==' )
                    {
                     before(grammarAccess.getComparingEQNEQOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // InternalActionLanguage.g:2003:1: ( '==' )
                    // InternalActionLanguage.g:2003:3: '=='
                    {
                    match(input,22,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getComparingEQNEQOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:2008:6: ( ( '<>' ) )
                    {
                    // InternalActionLanguage.g:2008:6: ( ( '<>' ) )
                    // InternalActionLanguage.g:2009:1: ( '<>' )
                    {
                     before(grammarAccess.getComparingEQNEQOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 
                    // InternalActionLanguage.g:2010:1: ( '<>' )
                    // InternalActionLanguage.g:2010:3: '<>'
                    {
                    match(input,23,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getComparingEQNEQOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__ComparingEQNEQOperator__Alternatives"


    // $ANTLR start "rule__ComparingRelOperator__Alternatives"
    // InternalActionLanguage.g:2020:1: rule__ComparingRelOperator__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) );
    public final void rule__ComparingRelOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2024:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt18=1;
                }
                break;
            case 25:
                {
                alt18=2;
                }
                break;
            case 26:
                {
                alt18=3;
                }
                break;
            case 27:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalActionLanguage.g:2025:1: ( ( '<' ) )
                    {
                    // InternalActionLanguage.g:2025:1: ( ( '<' ) )
                    // InternalActionLanguage.g:2026:1: ( '<' )
                    {
                     before(grammarAccess.getComparingRelOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                    // InternalActionLanguage.g:2027:1: ( '<' )
                    // InternalActionLanguage.g:2027:3: '<'
                    {
                    match(input,24,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getComparingRelOperatorAccess().getLESSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:2032:6: ( ( '<=' ) )
                    {
                    // InternalActionLanguage.g:2032:6: ( ( '<=' ) )
                    // InternalActionLanguage.g:2033:1: ( '<=' )
                    {
                     before(grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 
                    // InternalActionLanguage.g:2034:1: ( '<=' )
                    // InternalActionLanguage.g:2034:3: '<='
                    {
                    match(input,25,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalActionLanguage.g:2039:6: ( ( '>=' ) )
                    {
                    // InternalActionLanguage.g:2039:6: ( ( '>=' ) )
                    // InternalActionLanguage.g:2040:1: ( '>=' )
                    {
                     before(grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                    // InternalActionLanguage.g:2041:1: ( '>=' )
                    // InternalActionLanguage.g:2041:3: '>='
                    {
                    match(input,26,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalActionLanguage.g:2046:6: ( ( '>' ) )
                    {
                    // InternalActionLanguage.g:2046:6: ( ( '>' ) )
                    // InternalActionLanguage.g:2047:1: ( '>' )
                    {
                     before(grammarAccess.getComparingRelOperatorAccess().getGREATEREnumLiteralDeclaration_3()); 
                    // InternalActionLanguage.g:2048:1: ( '>' )
                    // InternalActionLanguage.g:2048:3: '>'
                    {
                    match(input,27,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getComparingRelOperatorAccess().getGREATEREnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__ComparingRelOperator__Alternatives"


    // $ANTLR start "rule__AdditionOperator__Alternatives"
    // InternalActionLanguage.g:2058:1: rule__AdditionOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2062:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            else if ( (LA19_0==29) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalActionLanguage.g:2063:1: ( ( '+' ) )
                    {
                    // InternalActionLanguage.g:2063:1: ( ( '+' ) )
                    // InternalActionLanguage.g:2064:1: ( '+' )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalActionLanguage.g:2065:1: ( '+' )
                    // InternalActionLanguage.g:2065:3: '+'
                    {
                    match(input,28,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:2070:6: ( ( '-' ) )
                    {
                    // InternalActionLanguage.g:2070:6: ( ( '-' ) )
                    // InternalActionLanguage.g:2071:1: ( '-' )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalActionLanguage.g:2072:1: ( '-' )
                    // InternalActionLanguage.g:2072:3: '-'
                    {
                    match(input,29,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditionOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__AdditionOperator__Alternatives"


    // $ANTLR start "rule__MultiplicationOperator__Alternatives"
    // InternalActionLanguage.g:2082:1: rule__MultiplicationOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) );
    public final void rule__MultiplicationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2086:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt20=1;
                }
                break;
            case 31:
                {
                alt20=2;
                }
                break;
            case 32:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalActionLanguage.g:2087:1: ( ( '*' ) )
                    {
                    // InternalActionLanguage.g:2087:1: ( ( '*' ) )
                    // InternalActionLanguage.g:2088:1: ( '*' )
                    {
                     before(grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration_0()); 
                    // InternalActionLanguage.g:2089:1: ( '*' )
                    // InternalActionLanguage.g:2089:3: '*'
                    {
                    match(input,30,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:2094:6: ( ( '/' ) )
                    {
                    // InternalActionLanguage.g:2094:6: ( ( '/' ) )
                    // InternalActionLanguage.g:2095:1: ( '/' )
                    {
                     before(grammarAccess.getMultiplicationOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                    // InternalActionLanguage.g:2096:1: ( '/' )
                    // InternalActionLanguage.g:2096:3: '/'
                    {
                    match(input,31,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicationOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalActionLanguage.g:2101:6: ( ( '%' ) )
                    {
                    // InternalActionLanguage.g:2101:6: ( ( '%' ) )
                    // InternalActionLanguage.g:2102:1: ( '%' )
                    {
                     before(grammarAccess.getMultiplicationOperatorAccess().getMODULOEnumLiteralDeclaration_2()); 
                    // InternalActionLanguage.g:2103:1: ( '%' )
                    // InternalActionLanguage.g:2103:3: '%'
                    {
                    match(input,32,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicationOperatorAccess().getMODULOEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__MultiplicationOperator__Alternatives"


    // $ANTLR start "rule__UnaryPreOperator__Alternatives"
    // InternalActionLanguage.g:2113:1: rule__UnaryPreOperator__Alternatives : ( ( ( 'not' ) ) | ( ( '-' ) ) );
    public final void rule__UnaryPreOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2117:1: ( ( ( 'not' ) ) | ( ( '-' ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            else if ( (LA21_0==29) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalActionLanguage.g:2118:1: ( ( 'not' ) )
                    {
                    // InternalActionLanguage.g:2118:1: ( ( 'not' ) )
                    // InternalActionLanguage.g:2119:1: ( 'not' )
                    {
                     before(grammarAccess.getUnaryPreOperatorAccess().getNOTEnumLiteralDeclaration_0()); 
                    // InternalActionLanguage.g:2120:1: ( 'not' )
                    // InternalActionLanguage.g:2120:3: 'not'
                    {
                    match(input,33,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryPreOperatorAccess().getNOTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:2125:6: ( ( '-' ) )
                    {
                    // InternalActionLanguage.g:2125:6: ( ( '-' ) )
                    // InternalActionLanguage.g:2126:1: ( '-' )
                    {
                     before(grammarAccess.getUnaryPreOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalActionLanguage.g:2127:1: ( '-' )
                    // InternalActionLanguage.g:2127:3: '-'
                    {
                    match(input,29,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryPreOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__UnaryPreOperator__Alternatives"


    // $ANTLR start "rule__PositionSelectorKind__Alternatives"
    // InternalActionLanguage.g:2137:1: rule__PositionSelectorKind__Alternatives : ( ( ( 'self' ) ) | ( ( 'first' ) ) | ( ( 'last' ) ) | ( ( 'prev' ) ) | ( ( 'next' ) ) );
    public final void rule__PositionSelectorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2141:1: ( ( ( 'self' ) ) | ( ( 'first' ) ) | ( ( 'last' ) ) | ( ( 'prev' ) ) | ( ( 'next' ) ) )
            int alt22=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt22=1;
                }
                break;
            case 35:
                {
                alt22=2;
                }
                break;
            case 36:
                {
                alt22=3;
                }
                break;
            case 37:
                {
                alt22=4;
                }
                break;
            case 38:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalActionLanguage.g:2142:1: ( ( 'self' ) )
                    {
                    // InternalActionLanguage.g:2142:1: ( ( 'self' ) )
                    // InternalActionLanguage.g:2143:1: ( 'self' )
                    {
                     before(grammarAccess.getPositionSelectorKindAccess().getSELFEnumLiteralDeclaration_0()); 
                    // InternalActionLanguage.g:2144:1: ( 'self' )
                    // InternalActionLanguage.g:2144:3: 'self'
                    {
                    match(input,34,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionSelectorKindAccess().getSELFEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActionLanguage.g:2149:6: ( ( 'first' ) )
                    {
                    // InternalActionLanguage.g:2149:6: ( ( 'first' ) )
                    // InternalActionLanguage.g:2150:1: ( 'first' )
                    {
                     before(grammarAccess.getPositionSelectorKindAccess().getFIRSTEnumLiteralDeclaration_1()); 
                    // InternalActionLanguage.g:2151:1: ( 'first' )
                    // InternalActionLanguage.g:2151:3: 'first'
                    {
                    match(input,35,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionSelectorKindAccess().getFIRSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalActionLanguage.g:2156:6: ( ( 'last' ) )
                    {
                    // InternalActionLanguage.g:2156:6: ( ( 'last' ) )
                    // InternalActionLanguage.g:2157:1: ( 'last' )
                    {
                     before(grammarAccess.getPositionSelectorKindAccess().getLASTEnumLiteralDeclaration_2()); 
                    // InternalActionLanguage.g:2158:1: ( 'last' )
                    // InternalActionLanguage.g:2158:3: 'last'
                    {
                    match(input,36,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionSelectorKindAccess().getLASTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalActionLanguage.g:2163:6: ( ( 'prev' ) )
                    {
                    // InternalActionLanguage.g:2163:6: ( ( 'prev' ) )
                    // InternalActionLanguage.g:2164:1: ( 'prev' )
                    {
                     before(grammarAccess.getPositionSelectorKindAccess().getPREVEnumLiteralDeclaration_3()); 
                    // InternalActionLanguage.g:2165:1: ( 'prev' )
                    // InternalActionLanguage.g:2165:3: 'prev'
                    {
                    match(input,37,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionSelectorKindAccess().getPREVEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalActionLanguage.g:2170:6: ( ( 'next' ) )
                    {
                    // InternalActionLanguage.g:2170:6: ( ( 'next' ) )
                    // InternalActionLanguage.g:2171:1: ( 'next' )
                    {
                     before(grammarAccess.getPositionSelectorKindAccess().getNEXTEnumLiteralDeclaration_4()); 
                    // InternalActionLanguage.g:2172:1: ( 'next' )
                    // InternalActionLanguage.g:2172:3: 'next'
                    {
                    match(input,38,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionSelectorKindAccess().getNEXTEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__PositionSelectorKind__Alternatives"


    // $ANTLR start "rule__Block__Group__0"
    // InternalActionLanguage.g:2184:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2188:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalActionLanguage.g:2189:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalActionLanguage.g:2196:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2200:1: ( ( () ) )
            // InternalActionLanguage.g:2201:1: ( () )
            {
            // InternalActionLanguage.g:2201:1: ( () )
            // InternalActionLanguage.g:2202:1: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // InternalActionLanguage.g:2203:1: ()
            // InternalActionLanguage.g:2205:1: 
            {
            }

             after(grammarAccess.getBlockAccess().getBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalActionLanguage.g:2215:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2219:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalActionLanguage.g:2220:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalActionLanguage.g:2227:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2231:1: ( ( '{' ) )
            // InternalActionLanguage.g:2232:1: ( '{' )
            {
            // InternalActionLanguage.g:2232:1: ( '{' )
            // InternalActionLanguage.g:2233:1: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalActionLanguage.g:2246:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2250:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalActionLanguage.g:2251:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Block__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalActionLanguage.g:2258:1: rule__Block__Group__2__Impl : ( ( rule__Block__ExpressionsAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2262:1: ( ( ( rule__Block__ExpressionsAssignment_2 )* ) )
            // InternalActionLanguage.g:2263:1: ( ( rule__Block__ExpressionsAssignment_2 )* )
            {
            // InternalActionLanguage.g:2263:1: ( ( rule__Block__ExpressionsAssignment_2 )* )
            // InternalActionLanguage.g:2264:1: ( rule__Block__ExpressionsAssignment_2 )*
            {
             before(grammarAccess.getBlockAccess().getExpressionsAssignment_2()); 
            // InternalActionLanguage.g:2265:1: ( rule__Block__ExpressionsAssignment_2 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==41||(LA23_0>=45 && LA23_0<=46)||LA23_0==48||LA23_0==51||LA23_0==57) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalActionLanguage.g:2265:2: rule__Block__ExpressionsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    rule__Block__ExpressionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getExpressionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // InternalActionLanguage.g:2275:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2279:1: ( rule__Block__Group__3__Impl )
            // InternalActionLanguage.g:2280:2: rule__Block__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Block__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // InternalActionLanguage.g:2286:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2290:1: ( ( '}' ) )
            // InternalActionLanguage.g:2291:1: ( '}' )
            {
            // InternalActionLanguage.g:2291:1: ( '}' )
            // InternalActionLanguage.g:2292:1: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,40,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__ForLoop__Group__0"
    // InternalActionLanguage.g:2313:1: rule__ForLoop__Group__0 : rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 ;
    public final void rule__ForLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2317:1: ( rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 )
            // InternalActionLanguage.g:2318:2: rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__ForLoop__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__0"


    // $ANTLR start "rule__ForLoop__Group__0__Impl"
    // InternalActionLanguage.g:2325:1: rule__ForLoop__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2329:1: ( ( 'for' ) )
            // InternalActionLanguage.g:2330:1: ( 'for' )
            {
            // InternalActionLanguage.g:2330:1: ( 'for' )
            // InternalActionLanguage.g:2331:1: 'for'
            {
             before(grammarAccess.getForLoopAccess().getForKeyword_0()); 
            match(input,41,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__0__Impl"


    // $ANTLR start "rule__ForLoop__Group__1"
    // InternalActionLanguage.g:2344:1: rule__ForLoop__Group__1 : rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 ;
    public final void rule__ForLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2348:1: ( rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 )
            // InternalActionLanguage.g:2349:2: rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__ForLoop__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__1"


    // $ANTLR start "rule__ForLoop__Group__1__Impl"
    // InternalActionLanguage.g:2356:1: rule__ForLoop__Group__1__Impl : ( '(' ) ;
    public final void rule__ForLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2360:1: ( ( '(' ) )
            // InternalActionLanguage.g:2361:1: ( '(' )
            {
            // InternalActionLanguage.g:2361:1: ( '(' )
            // InternalActionLanguage.g:2362:1: '('
            {
             before(grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__1__Impl"


    // $ANTLR start "rule__ForLoop__Group__2"
    // InternalActionLanguage.g:2375:1: rule__ForLoop__Group__2 : rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 ;
    public final void rule__ForLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2379:1: ( rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 )
            // InternalActionLanguage.g:2380:2: rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ForLoop__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__2"


    // $ANTLR start "rule__ForLoop__Group__2__Impl"
    // InternalActionLanguage.g:2387:1: rule__ForLoop__Group__2__Impl : ( ( rule__ForLoop__InitializeExpressionAssignment_2 ) ) ;
    public final void rule__ForLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2391:1: ( ( ( rule__ForLoop__InitializeExpressionAssignment_2 ) ) )
            // InternalActionLanguage.g:2392:1: ( ( rule__ForLoop__InitializeExpressionAssignment_2 ) )
            {
            // InternalActionLanguage.g:2392:1: ( ( rule__ForLoop__InitializeExpressionAssignment_2 ) )
            // InternalActionLanguage.g:2393:1: ( rule__ForLoop__InitializeExpressionAssignment_2 )
            {
             before(grammarAccess.getForLoopAccess().getInitializeExpressionAssignment_2()); 
            // InternalActionLanguage.g:2394:1: ( rule__ForLoop__InitializeExpressionAssignment_2 )
            // InternalActionLanguage.g:2394:2: rule__ForLoop__InitializeExpressionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__InitializeExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getInitializeExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__2__Impl"


    // $ANTLR start "rule__ForLoop__Group__3"
    // InternalActionLanguage.g:2404:1: rule__ForLoop__Group__3 : rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 ;
    public final void rule__ForLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2408:1: ( rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 )
            // InternalActionLanguage.g:2409:2: rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__ForLoop__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__3"


    // $ANTLR start "rule__ForLoop__Group__3__Impl"
    // InternalActionLanguage.g:2416:1: rule__ForLoop__Group__3__Impl : ( ( rule__ForLoop__LoopTestAssignment_3 ) ) ;
    public final void rule__ForLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2420:1: ( ( ( rule__ForLoop__LoopTestAssignment_3 ) ) )
            // InternalActionLanguage.g:2421:1: ( ( rule__ForLoop__LoopTestAssignment_3 ) )
            {
            // InternalActionLanguage.g:2421:1: ( ( rule__ForLoop__LoopTestAssignment_3 ) )
            // InternalActionLanguage.g:2422:1: ( rule__ForLoop__LoopTestAssignment_3 )
            {
             before(grammarAccess.getForLoopAccess().getLoopTestAssignment_3()); 
            // InternalActionLanguage.g:2423:1: ( rule__ForLoop__LoopTestAssignment_3 )
            // InternalActionLanguage.g:2423:2: rule__ForLoop__LoopTestAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__LoopTestAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getLoopTestAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__3__Impl"


    // $ANTLR start "rule__ForLoop__Group__4"
    // InternalActionLanguage.g:2433:1: rule__ForLoop__Group__4 : rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 ;
    public final void rule__ForLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2437:1: ( rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 )
            // InternalActionLanguage.g:2438:2: rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__ForLoop__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__4"


    // $ANTLR start "rule__ForLoop__Group__4__Impl"
    // InternalActionLanguage.g:2445:1: rule__ForLoop__Group__4__Impl : ( ';' ) ;
    public final void rule__ForLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2449:1: ( ( ';' ) )
            // InternalActionLanguage.g:2450:1: ( ';' )
            {
            // InternalActionLanguage.g:2450:1: ( ';' )
            // InternalActionLanguage.g:2451:1: ';'
            {
             before(grammarAccess.getForLoopAccess().getSemicolonKeyword_4()); 
            match(input,43,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__4__Impl"


    // $ANTLR start "rule__ForLoop__Group__5"
    // InternalActionLanguage.g:2464:1: rule__ForLoop__Group__5 : rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 ;
    public final void rule__ForLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2468:1: ( rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 )
            // InternalActionLanguage.g:2469:2: rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__ForLoop__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__5"


    // $ANTLR start "rule__ForLoop__Group__5__Impl"
    // InternalActionLanguage.g:2476:1: rule__ForLoop__Group__5__Impl : ( ( rule__ForLoop__CountingExpressionAssignment_5 ) ) ;
    public final void rule__ForLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2480:1: ( ( ( rule__ForLoop__CountingExpressionAssignment_5 ) ) )
            // InternalActionLanguage.g:2481:1: ( ( rule__ForLoop__CountingExpressionAssignment_5 ) )
            {
            // InternalActionLanguage.g:2481:1: ( ( rule__ForLoop__CountingExpressionAssignment_5 ) )
            // InternalActionLanguage.g:2482:1: ( rule__ForLoop__CountingExpressionAssignment_5 )
            {
             before(grammarAccess.getForLoopAccess().getCountingExpressionAssignment_5()); 
            // InternalActionLanguage.g:2483:1: ( rule__ForLoop__CountingExpressionAssignment_5 )
            // InternalActionLanguage.g:2483:2: rule__ForLoop__CountingExpressionAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__CountingExpressionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getCountingExpressionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__5__Impl"


    // $ANTLR start "rule__ForLoop__Group__6"
    // InternalActionLanguage.g:2493:1: rule__ForLoop__Group__6 : rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7 ;
    public final void rule__ForLoop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2497:1: ( rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7 )
            // InternalActionLanguage.g:2498:2: rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ForLoop__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__6"


    // $ANTLR start "rule__ForLoop__Group__6__Impl"
    // InternalActionLanguage.g:2505:1: rule__ForLoop__Group__6__Impl : ( ')' ) ;
    public final void rule__ForLoop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2509:1: ( ( ')' ) )
            // InternalActionLanguage.g:2510:1: ( ')' )
            {
            // InternalActionLanguage.g:2510:1: ( ')' )
            // InternalActionLanguage.g:2511:1: ')'
            {
             before(grammarAccess.getForLoopAccess().getRightParenthesisKeyword_6()); 
            match(input,44,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__6__Impl"


    // $ANTLR start "rule__ForLoop__Group__7"
    // InternalActionLanguage.g:2524:1: rule__ForLoop__Group__7 : rule__ForLoop__Group__7__Impl ;
    public final void rule__ForLoop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2528:1: ( rule__ForLoop__Group__7__Impl )
            // InternalActionLanguage.g:2529:2: rule__ForLoop__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__7"


    // $ANTLR start "rule__ForLoop__Group__7__Impl"
    // InternalActionLanguage.g:2535:1: rule__ForLoop__Group__7__Impl : ( ( rule__ForLoop__BlockAssignment_7 ) ) ;
    public final void rule__ForLoop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2539:1: ( ( ( rule__ForLoop__BlockAssignment_7 ) ) )
            // InternalActionLanguage.g:2540:1: ( ( rule__ForLoop__BlockAssignment_7 ) )
            {
            // InternalActionLanguage.g:2540:1: ( ( rule__ForLoop__BlockAssignment_7 ) )
            // InternalActionLanguage.g:2541:1: ( rule__ForLoop__BlockAssignment_7 )
            {
             before(grammarAccess.getForLoopAccess().getBlockAssignment_7()); 
            // InternalActionLanguage.g:2542:1: ( rule__ForLoop__BlockAssignment_7 )
            // InternalActionLanguage.g:2542:2: rule__ForLoop__BlockAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__BlockAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getBlockAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__7__Impl"


    // $ANTLR start "rule__ForLoopCountingExpression__Group__0"
    // InternalActionLanguage.g:2568:1: rule__ForLoopCountingExpression__Group__0 : rule__ForLoopCountingExpression__Group__0__Impl rule__ForLoopCountingExpression__Group__1 ;
    public final void rule__ForLoopCountingExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2572:1: ( rule__ForLoopCountingExpression__Group__0__Impl rule__ForLoopCountingExpression__Group__1 )
            // InternalActionLanguage.g:2573:2: rule__ForLoopCountingExpression__Group__0__Impl rule__ForLoopCountingExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__ForLoopCountingExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoopCountingExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__Group__0"


    // $ANTLR start "rule__ForLoopCountingExpression__Group__0__Impl"
    // InternalActionLanguage.g:2580:1: rule__ForLoopCountingExpression__Group__0__Impl : ( ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 ) ) ;
    public final void rule__ForLoopCountingExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2584:1: ( ( ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 ) ) )
            // InternalActionLanguage.g:2585:1: ( ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 ) )
            {
            // InternalActionLanguage.g:2585:1: ( ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 ) )
            // InternalActionLanguage.g:2586:1: ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getLhs_typedNamedElementExpressionAssignment_0()); 
            // InternalActionLanguage.g:2587:1: ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 )
            // InternalActionLanguage.g:2587:2: rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getForLoopCountingExpressionAccess().getLhs_typedNamedElementExpressionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__Group__0__Impl"


    // $ANTLR start "rule__ForLoopCountingExpression__Group__1"
    // InternalActionLanguage.g:2597:1: rule__ForLoopCountingExpression__Group__1 : rule__ForLoopCountingExpression__Group__1__Impl ;
    public final void rule__ForLoopCountingExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2601:1: ( rule__ForLoopCountingExpression__Group__1__Impl )
            // InternalActionLanguage.g:2602:2: rule__ForLoopCountingExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoopCountingExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__Group__1"


    // $ANTLR start "rule__ForLoopCountingExpression__Group__1__Impl"
    // InternalActionLanguage.g:2608:1: rule__ForLoopCountingExpression__Group__1__Impl : ( ( rule__ForLoopCountingExpression__Alternatives_1 ) ) ;
    public final void rule__ForLoopCountingExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2612:1: ( ( ( rule__ForLoopCountingExpression__Alternatives_1 ) ) )
            // InternalActionLanguage.g:2613:1: ( ( rule__ForLoopCountingExpression__Alternatives_1 ) )
            {
            // InternalActionLanguage.g:2613:1: ( ( rule__ForLoopCountingExpression__Alternatives_1 ) )
            // InternalActionLanguage.g:2614:1: ( rule__ForLoopCountingExpression__Alternatives_1 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getAlternatives_1()); 
            // InternalActionLanguage.g:2615:1: ( rule__ForLoopCountingExpression__Alternatives_1 )
            // InternalActionLanguage.g:2615:2: rule__ForLoopCountingExpression__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoopCountingExpression__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getForLoopCountingExpressionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__Group__1__Impl"


    // $ANTLR start "rule__ForLoopCountingExpression__Group_1_1__0"
    // InternalActionLanguage.g:2629:1: rule__ForLoopCountingExpression__Group_1_1__0 : rule__ForLoopCountingExpression__Group_1_1__0__Impl rule__ForLoopCountingExpression__Group_1_1__1 ;
    public final void rule__ForLoopCountingExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2633:1: ( rule__ForLoopCountingExpression__Group_1_1__0__Impl rule__ForLoopCountingExpression__Group_1_1__1 )
            // InternalActionLanguage.g:2634:2: rule__ForLoopCountingExpression__Group_1_1__0__Impl rule__ForLoopCountingExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ForLoopCountingExpression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoopCountingExpression__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__Group_1_1__0"


    // $ANTLR start "rule__ForLoopCountingExpression__Group_1_1__0__Impl"
    // InternalActionLanguage.g:2641:1: rule__ForLoopCountingExpression__Group_1_1__0__Impl : ( ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 ) ) ;
    public final void rule__ForLoopCountingExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2645:1: ( ( ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 ) ) )
            // InternalActionLanguage.g:2646:1: ( ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 ) )
            {
            // InternalActionLanguage.g:2646:1: ( ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 ) )
            // InternalActionLanguage.g:2647:1: ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignment_1_1_0()); 
            // InternalActionLanguage.g:2648:1: ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 )
            // InternalActionLanguage.g:2648:2: rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__ForLoopCountingExpression__Group_1_1__1"
    // InternalActionLanguage.g:2658:1: rule__ForLoopCountingExpression__Group_1_1__1 : rule__ForLoopCountingExpression__Group_1_1__1__Impl ;
    public final void rule__ForLoopCountingExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2662:1: ( rule__ForLoopCountingExpression__Group_1_1__1__Impl )
            // InternalActionLanguage.g:2663:2: rule__ForLoopCountingExpression__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoopCountingExpression__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__Group_1_1__1"


    // $ANTLR start "rule__ForLoopCountingExpression__Group_1_1__1__Impl"
    // InternalActionLanguage.g:2669:1: rule__ForLoopCountingExpression__Group_1_1__1__Impl : ( ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 ) ) ;
    public final void rule__ForLoopCountingExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2673:1: ( ( ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 ) ) )
            // InternalActionLanguage.g:2674:1: ( ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 ) )
            {
            // InternalActionLanguage.g:2674:1: ( ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 ) )
            // InternalActionLanguage.g:2675:1: ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getRhs_assignExpressionAssignment_1_1_1()); 
            // InternalActionLanguage.g:2676:1: ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 )
            // InternalActionLanguage.g:2676:2: rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getForLoopCountingExpressionAccess().getRhs_assignExpressionAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__WhileLoop__Group__0"
    // InternalActionLanguage.g:2690:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2694:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalActionLanguage.g:2695:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__WhileLoop__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__WhileLoop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__0"


    // $ANTLR start "rule__WhileLoop__Group__0__Impl"
    // InternalActionLanguage.g:2702:1: rule__WhileLoop__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2706:1: ( ( 'while' ) )
            // InternalActionLanguage.g:2707:1: ( 'while' )
            {
            // InternalActionLanguage.g:2707:1: ( 'while' )
            // InternalActionLanguage.g:2708:1: 'while'
            {
             before(grammarAccess.getWhileLoopAccess().getWhileKeyword_0()); 
            match(input,45,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getWhileLoopAccess().getWhileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__0__Impl"


    // $ANTLR start "rule__WhileLoop__Group__1"
    // InternalActionLanguage.g:2721:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2725:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalActionLanguage.g:2726:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__WhileLoop__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__WhileLoop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__1"


    // $ANTLR start "rule__WhileLoop__Group__1__Impl"
    // InternalActionLanguage.g:2733:1: rule__WhileLoop__Group__1__Impl : ( '(' ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2737:1: ( ( '(' ) )
            // InternalActionLanguage.g:2738:1: ( '(' )
            {
            // InternalActionLanguage.g:2738:1: ( '(' )
            // InternalActionLanguage.g:2739:1: '('
            {
             before(grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__1__Impl"


    // $ANTLR start "rule__WhileLoop__Group__2"
    // InternalActionLanguage.g:2752:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2756:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalActionLanguage.g:2757:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__WhileLoop__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__WhileLoop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__2"


    // $ANTLR start "rule__WhileLoop__Group__2__Impl"
    // InternalActionLanguage.g:2764:1: rule__WhileLoop__Group__2__Impl : ( ( rule__WhileLoop__LoopTestAssignment_2 ) ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2768:1: ( ( ( rule__WhileLoop__LoopTestAssignment_2 ) ) )
            // InternalActionLanguage.g:2769:1: ( ( rule__WhileLoop__LoopTestAssignment_2 ) )
            {
            // InternalActionLanguage.g:2769:1: ( ( rule__WhileLoop__LoopTestAssignment_2 ) )
            // InternalActionLanguage.g:2770:1: ( rule__WhileLoop__LoopTestAssignment_2 )
            {
             before(grammarAccess.getWhileLoopAccess().getLoopTestAssignment_2()); 
            // InternalActionLanguage.g:2771:1: ( rule__WhileLoop__LoopTestAssignment_2 )
            // InternalActionLanguage.g:2771:2: rule__WhileLoop__LoopTestAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WhileLoop__LoopTestAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWhileLoopAccess().getLoopTestAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__2__Impl"


    // $ANTLR start "rule__WhileLoop__Group__3"
    // InternalActionLanguage.g:2781:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2785:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalActionLanguage.g:2786:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__WhileLoop__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__WhileLoop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__3"


    // $ANTLR start "rule__WhileLoop__Group__3__Impl"
    // InternalActionLanguage.g:2793:1: rule__WhileLoop__Group__3__Impl : ( ')' ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2797:1: ( ( ')' ) )
            // InternalActionLanguage.g:2798:1: ( ')' )
            {
            // InternalActionLanguage.g:2798:1: ( ')' )
            // InternalActionLanguage.g:2799:1: ')'
            {
             before(grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_3()); 
            match(input,44,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__3__Impl"


    // $ANTLR start "rule__WhileLoop__Group__4"
    // InternalActionLanguage.g:2812:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2816:1: ( rule__WhileLoop__Group__4__Impl )
            // InternalActionLanguage.g:2817:2: rule__WhileLoop__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WhileLoop__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__4"


    // $ANTLR start "rule__WhileLoop__Group__4__Impl"
    // InternalActionLanguage.g:2823:1: rule__WhileLoop__Group__4__Impl : ( ( rule__WhileLoop__BlockAssignment_4 ) ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2827:1: ( ( ( rule__WhileLoop__BlockAssignment_4 ) ) )
            // InternalActionLanguage.g:2828:1: ( ( rule__WhileLoop__BlockAssignment_4 ) )
            {
            // InternalActionLanguage.g:2828:1: ( ( rule__WhileLoop__BlockAssignment_4 ) )
            // InternalActionLanguage.g:2829:1: ( rule__WhileLoop__BlockAssignment_4 )
            {
             before(grammarAccess.getWhileLoopAccess().getBlockAssignment_4()); 
            // InternalActionLanguage.g:2830:1: ( rule__WhileLoop__BlockAssignment_4 )
            // InternalActionLanguage.g:2830:2: rule__WhileLoop__BlockAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WhileLoop__BlockAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWhileLoopAccess().getBlockAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__4__Impl"


    // $ANTLR start "rule__DoWhileLoop__Group__0"
    // InternalActionLanguage.g:2850:1: rule__DoWhileLoop__Group__0 : rule__DoWhileLoop__Group__0__Impl rule__DoWhileLoop__Group__1 ;
    public final void rule__DoWhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2854:1: ( rule__DoWhileLoop__Group__0__Impl rule__DoWhileLoop__Group__1 )
            // InternalActionLanguage.g:2855:2: rule__DoWhileLoop__Group__0__Impl rule__DoWhileLoop__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__DoWhileLoop__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoWhileLoop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__0"


    // $ANTLR start "rule__DoWhileLoop__Group__0__Impl"
    // InternalActionLanguage.g:2862:1: rule__DoWhileLoop__Group__0__Impl : ( 'do' ) ;
    public final void rule__DoWhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2866:1: ( ( 'do' ) )
            // InternalActionLanguage.g:2867:1: ( 'do' )
            {
            // InternalActionLanguage.g:2867:1: ( 'do' )
            // InternalActionLanguage.g:2868:1: 'do'
            {
             before(grammarAccess.getDoWhileLoopAccess().getDoKeyword_0()); 
            match(input,46,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDoWhileLoopAccess().getDoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__0__Impl"


    // $ANTLR start "rule__DoWhileLoop__Group__1"
    // InternalActionLanguage.g:2881:1: rule__DoWhileLoop__Group__1 : rule__DoWhileLoop__Group__1__Impl rule__DoWhileLoop__Group__2 ;
    public final void rule__DoWhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2885:1: ( rule__DoWhileLoop__Group__1__Impl rule__DoWhileLoop__Group__2 )
            // InternalActionLanguage.g:2886:2: rule__DoWhileLoop__Group__1__Impl rule__DoWhileLoop__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__DoWhileLoop__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoWhileLoop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__1"


    // $ANTLR start "rule__DoWhileLoop__Group__1__Impl"
    // InternalActionLanguage.g:2893:1: rule__DoWhileLoop__Group__1__Impl : ( ( rule__DoWhileLoop__BlockAssignment_1 ) ) ;
    public final void rule__DoWhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2897:1: ( ( ( rule__DoWhileLoop__BlockAssignment_1 ) ) )
            // InternalActionLanguage.g:2898:1: ( ( rule__DoWhileLoop__BlockAssignment_1 ) )
            {
            // InternalActionLanguage.g:2898:1: ( ( rule__DoWhileLoop__BlockAssignment_1 ) )
            // InternalActionLanguage.g:2899:1: ( rule__DoWhileLoop__BlockAssignment_1 )
            {
             before(grammarAccess.getDoWhileLoopAccess().getBlockAssignment_1()); 
            // InternalActionLanguage.g:2900:1: ( rule__DoWhileLoop__BlockAssignment_1 )
            // InternalActionLanguage.g:2900:2: rule__DoWhileLoop__BlockAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoWhileLoop__BlockAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDoWhileLoopAccess().getBlockAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__1__Impl"


    // $ANTLR start "rule__DoWhileLoop__Group__2"
    // InternalActionLanguage.g:2910:1: rule__DoWhileLoop__Group__2 : rule__DoWhileLoop__Group__2__Impl rule__DoWhileLoop__Group__3 ;
    public final void rule__DoWhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2914:1: ( rule__DoWhileLoop__Group__2__Impl rule__DoWhileLoop__Group__3 )
            // InternalActionLanguage.g:2915:2: rule__DoWhileLoop__Group__2__Impl rule__DoWhileLoop__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__DoWhileLoop__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoWhileLoop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__2"


    // $ANTLR start "rule__DoWhileLoop__Group__2__Impl"
    // InternalActionLanguage.g:2922:1: rule__DoWhileLoop__Group__2__Impl : ( 'while' ) ;
    public final void rule__DoWhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2926:1: ( ( 'while' ) )
            // InternalActionLanguage.g:2927:1: ( 'while' )
            {
            // InternalActionLanguage.g:2927:1: ( 'while' )
            // InternalActionLanguage.g:2928:1: 'while'
            {
             before(grammarAccess.getDoWhileLoopAccess().getWhileKeyword_2()); 
            match(input,45,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDoWhileLoopAccess().getWhileKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__2__Impl"


    // $ANTLR start "rule__DoWhileLoop__Group__3"
    // InternalActionLanguage.g:2941:1: rule__DoWhileLoop__Group__3 : rule__DoWhileLoop__Group__3__Impl rule__DoWhileLoop__Group__4 ;
    public final void rule__DoWhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2945:1: ( rule__DoWhileLoop__Group__3__Impl rule__DoWhileLoop__Group__4 )
            // InternalActionLanguage.g:2946:2: rule__DoWhileLoop__Group__3__Impl rule__DoWhileLoop__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__DoWhileLoop__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoWhileLoop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__3"


    // $ANTLR start "rule__DoWhileLoop__Group__3__Impl"
    // InternalActionLanguage.g:2953:1: rule__DoWhileLoop__Group__3__Impl : ( '(' ) ;
    public final void rule__DoWhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2957:1: ( ( '(' ) )
            // InternalActionLanguage.g:2958:1: ( '(' )
            {
            // InternalActionLanguage.g:2958:1: ( '(' )
            // InternalActionLanguage.g:2959:1: '('
            {
             before(grammarAccess.getDoWhileLoopAccess().getLeftParenthesisKeyword_3()); 
            match(input,42,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDoWhileLoopAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__3__Impl"


    // $ANTLR start "rule__DoWhileLoop__Group__4"
    // InternalActionLanguage.g:2972:1: rule__DoWhileLoop__Group__4 : rule__DoWhileLoop__Group__4__Impl rule__DoWhileLoop__Group__5 ;
    public final void rule__DoWhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2976:1: ( rule__DoWhileLoop__Group__4__Impl rule__DoWhileLoop__Group__5 )
            // InternalActionLanguage.g:2977:2: rule__DoWhileLoop__Group__4__Impl rule__DoWhileLoop__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__DoWhileLoop__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoWhileLoop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__4"


    // $ANTLR start "rule__DoWhileLoop__Group__4__Impl"
    // InternalActionLanguage.g:2984:1: rule__DoWhileLoop__Group__4__Impl : ( ( rule__DoWhileLoop__LoopTestAssignment_4 ) ) ;
    public final void rule__DoWhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:2988:1: ( ( ( rule__DoWhileLoop__LoopTestAssignment_4 ) ) )
            // InternalActionLanguage.g:2989:1: ( ( rule__DoWhileLoop__LoopTestAssignment_4 ) )
            {
            // InternalActionLanguage.g:2989:1: ( ( rule__DoWhileLoop__LoopTestAssignment_4 ) )
            // InternalActionLanguage.g:2990:1: ( rule__DoWhileLoop__LoopTestAssignment_4 )
            {
             before(grammarAccess.getDoWhileLoopAccess().getLoopTestAssignment_4()); 
            // InternalActionLanguage.g:2991:1: ( rule__DoWhileLoop__LoopTestAssignment_4 )
            // InternalActionLanguage.g:2991:2: rule__DoWhileLoop__LoopTestAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoWhileLoop__LoopTestAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDoWhileLoopAccess().getLoopTestAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__4__Impl"


    // $ANTLR start "rule__DoWhileLoop__Group__5"
    // InternalActionLanguage.g:3001:1: rule__DoWhileLoop__Group__5 : rule__DoWhileLoop__Group__5__Impl ;
    public final void rule__DoWhileLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3005:1: ( rule__DoWhileLoop__Group__5__Impl )
            // InternalActionLanguage.g:3006:2: rule__DoWhileLoop__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoWhileLoop__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__5"


    // $ANTLR start "rule__DoWhileLoop__Group__5__Impl"
    // InternalActionLanguage.g:3012:1: rule__DoWhileLoop__Group__5__Impl : ( ');' ) ;
    public final void rule__DoWhileLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3016:1: ( ( ');' ) )
            // InternalActionLanguage.g:3017:1: ( ');' )
            {
            // InternalActionLanguage.g:3017:1: ( ');' )
            // InternalActionLanguage.g:3018:1: ');'
            {
             before(grammarAccess.getDoWhileLoopAccess().getRightParenthesisSemicolonKeyword_5()); 
            match(input,47,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDoWhileLoopAccess().getRightParenthesisSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__5__Impl"


    // $ANTLR start "rule__IfStatement__Group__0"
    // InternalActionLanguage.g:3043:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3047:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalActionLanguage.g:3048:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0"


    // $ANTLR start "rule__IfStatement__Group__0__Impl"
    // InternalActionLanguage.g:3055:1: rule__IfStatement__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3059:1: ( ( 'if' ) )
            // InternalActionLanguage.g:3060:1: ( 'if' )
            {
            // InternalActionLanguage.g:3060:1: ( 'if' )
            // InternalActionLanguage.g:3061:1: 'if'
            {
             before(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            match(input,48,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0__Impl"


    // $ANTLR start "rule__IfStatement__Group__1"
    // InternalActionLanguage.g:3074:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3078:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalActionLanguage.g:3079:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1"


    // $ANTLR start "rule__IfStatement__Group__1__Impl"
    // InternalActionLanguage.g:3086:1: rule__IfStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3090:1: ( ( '(' ) )
            // InternalActionLanguage.g:3091:1: ( '(' )
            {
            // InternalActionLanguage.g:3091:1: ( '(' )
            // InternalActionLanguage.g:3092:1: '('
            {
             before(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__2"
    // InternalActionLanguage.g:3105:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3109:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalActionLanguage.g:3110:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2"


    // $ANTLR start "rule__IfStatement__Group__2__Impl"
    // InternalActionLanguage.g:3117:1: rule__IfStatement__Group__2__Impl : ( ( rule__IfStatement__IfConditionAssignment_2 ) ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3121:1: ( ( ( rule__IfStatement__IfConditionAssignment_2 ) ) )
            // InternalActionLanguage.g:3122:1: ( ( rule__IfStatement__IfConditionAssignment_2 ) )
            {
            // InternalActionLanguage.g:3122:1: ( ( rule__IfStatement__IfConditionAssignment_2 ) )
            // InternalActionLanguage.g:3123:1: ( rule__IfStatement__IfConditionAssignment_2 )
            {
             before(grammarAccess.getIfStatementAccess().getIfConditionAssignment_2()); 
            // InternalActionLanguage.g:3124:1: ( rule__IfStatement__IfConditionAssignment_2 )
            // InternalActionLanguage.g:3124:2: rule__IfStatement__IfConditionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__IfConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getIfConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__3"
    // InternalActionLanguage.g:3134:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3138:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalActionLanguage.g:3139:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__IfStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3"


    // $ANTLR start "rule__IfStatement__Group__3__Impl"
    // InternalActionLanguage.g:3146:1: rule__IfStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3150:1: ( ( ')' ) )
            // InternalActionLanguage.g:3151:1: ( ')' )
            {
            // InternalActionLanguage.g:3151:1: ( ')' )
            // InternalActionLanguage.g:3152:1: ')'
            {
             before(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,44,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3__Impl"


    // $ANTLR start "rule__IfStatement__Group__4"
    // InternalActionLanguage.g:3165:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3169:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalActionLanguage.g:3170:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__IfStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4"


    // $ANTLR start "rule__IfStatement__Group__4__Impl"
    // InternalActionLanguage.g:3177:1: rule__IfStatement__Group__4__Impl : ( ( rule__IfStatement__IfBlockAssignment_4 ) ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3181:1: ( ( ( rule__IfStatement__IfBlockAssignment_4 ) ) )
            // InternalActionLanguage.g:3182:1: ( ( rule__IfStatement__IfBlockAssignment_4 ) )
            {
            // InternalActionLanguage.g:3182:1: ( ( rule__IfStatement__IfBlockAssignment_4 ) )
            // InternalActionLanguage.g:3183:1: ( rule__IfStatement__IfBlockAssignment_4 )
            {
             before(grammarAccess.getIfStatementAccess().getIfBlockAssignment_4()); 
            // InternalActionLanguage.g:3184:1: ( rule__IfStatement__IfBlockAssignment_4 )
            // InternalActionLanguage.g:3184:2: rule__IfStatement__IfBlockAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__IfBlockAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getIfBlockAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4__Impl"


    // $ANTLR start "rule__IfStatement__Group__5"
    // InternalActionLanguage.g:3194:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3198:1: ( rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 )
            // InternalActionLanguage.g:3199:2: rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__IfStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__5"


    // $ANTLR start "rule__IfStatement__Group__5__Impl"
    // InternalActionLanguage.g:3206:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__ElseIfStatementsAssignment_5 )* ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3210:1: ( ( ( rule__IfStatement__ElseIfStatementsAssignment_5 )* ) )
            // InternalActionLanguage.g:3211:1: ( ( rule__IfStatement__ElseIfStatementsAssignment_5 )* )
            {
            // InternalActionLanguage.g:3211:1: ( ( rule__IfStatement__ElseIfStatementsAssignment_5 )* )
            // InternalActionLanguage.g:3212:1: ( rule__IfStatement__ElseIfStatementsAssignment_5 )*
            {
             before(grammarAccess.getIfStatementAccess().getElseIfStatementsAssignment_5()); 
            // InternalActionLanguage.g:3213:1: ( rule__IfStatement__ElseIfStatementsAssignment_5 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==50) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalActionLanguage.g:3213:2: rule__IfStatement__ElseIfStatementsAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    rule__IfStatement__ElseIfStatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getIfStatementAccess().getElseIfStatementsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__5__Impl"


    // $ANTLR start "rule__IfStatement__Group__6"
    // InternalActionLanguage.g:3223:1: rule__IfStatement__Group__6 : rule__IfStatement__Group__6__Impl ;
    public final void rule__IfStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3227:1: ( rule__IfStatement__Group__6__Impl )
            // InternalActionLanguage.g:3228:2: rule__IfStatement__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__6"


    // $ANTLR start "rule__IfStatement__Group__6__Impl"
    // InternalActionLanguage.g:3234:1: rule__IfStatement__Group__6__Impl : ( ( rule__IfStatement__Group_6__0 )? ) ;
    public final void rule__IfStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3238:1: ( ( ( rule__IfStatement__Group_6__0 )? ) )
            // InternalActionLanguage.g:3239:1: ( ( rule__IfStatement__Group_6__0 )? )
            {
            // InternalActionLanguage.g:3239:1: ( ( rule__IfStatement__Group_6__0 )? )
            // InternalActionLanguage.g:3240:1: ( rule__IfStatement__Group_6__0 )?
            {
             before(grammarAccess.getIfStatementAccess().getGroup_6()); 
            // InternalActionLanguage.g:3241:1: ( rule__IfStatement__Group_6__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==49) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalActionLanguage.g:3241:2: rule__IfStatement__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__IfStatement__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfStatementAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__6__Impl"


    // $ANTLR start "rule__IfStatement__Group_6__0"
    // InternalActionLanguage.g:3265:1: rule__IfStatement__Group_6__0 : rule__IfStatement__Group_6__0__Impl rule__IfStatement__Group_6__1 ;
    public final void rule__IfStatement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3269:1: ( rule__IfStatement__Group_6__0__Impl rule__IfStatement__Group_6__1 )
            // InternalActionLanguage.g:3270:2: rule__IfStatement__Group_6__0__Impl rule__IfStatement__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__IfStatement__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_6__0"


    // $ANTLR start "rule__IfStatement__Group_6__0__Impl"
    // InternalActionLanguage.g:3277:1: rule__IfStatement__Group_6__0__Impl : ( 'else' ) ;
    public final void rule__IfStatement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3281:1: ( ( 'else' ) )
            // InternalActionLanguage.g:3282:1: ( 'else' )
            {
            // InternalActionLanguage.g:3282:1: ( 'else' )
            // InternalActionLanguage.g:3283:1: 'else'
            {
             before(grammarAccess.getIfStatementAccess().getElseKeyword_6_0()); 
            match(input,49,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getElseKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_6__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_6__1"
    // InternalActionLanguage.g:3296:1: rule__IfStatement__Group_6__1 : rule__IfStatement__Group_6__1__Impl ;
    public final void rule__IfStatement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3300:1: ( rule__IfStatement__Group_6__1__Impl )
            // InternalActionLanguage.g:3301:2: rule__IfStatement__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_6__1"


    // $ANTLR start "rule__IfStatement__Group_6__1__Impl"
    // InternalActionLanguage.g:3307:1: rule__IfStatement__Group_6__1__Impl : ( ( rule__IfStatement__ElseBlockAssignment_6_1 ) ) ;
    public final void rule__IfStatement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3311:1: ( ( ( rule__IfStatement__ElseBlockAssignment_6_1 ) ) )
            // InternalActionLanguage.g:3312:1: ( ( rule__IfStatement__ElseBlockAssignment_6_1 ) )
            {
            // InternalActionLanguage.g:3312:1: ( ( rule__IfStatement__ElseBlockAssignment_6_1 ) )
            // InternalActionLanguage.g:3313:1: ( rule__IfStatement__ElseBlockAssignment_6_1 )
            {
             before(grammarAccess.getIfStatementAccess().getElseBlockAssignment_6_1()); 
            // InternalActionLanguage.g:3314:1: ( rule__IfStatement__ElseBlockAssignment_6_1 )
            // InternalActionLanguage.g:3314:2: rule__IfStatement__ElseBlockAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__ElseBlockAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getElseBlockAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_6__1__Impl"


    // $ANTLR start "rule__ElseIfStatement__Group__0"
    // InternalActionLanguage.g:3328:1: rule__ElseIfStatement__Group__0 : rule__ElseIfStatement__Group__0__Impl rule__ElseIfStatement__Group__1 ;
    public final void rule__ElseIfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3332:1: ( rule__ElseIfStatement__Group__0__Impl rule__ElseIfStatement__Group__1 )
            // InternalActionLanguage.g:3333:2: rule__ElseIfStatement__Group__0__Impl rule__ElseIfStatement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__ElseIfStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ElseIfStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__Group__0"


    // $ANTLR start "rule__ElseIfStatement__Group__0__Impl"
    // InternalActionLanguage.g:3340:1: rule__ElseIfStatement__Group__0__Impl : ( 'elseif' ) ;
    public final void rule__ElseIfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3344:1: ( ( 'elseif' ) )
            // InternalActionLanguage.g:3345:1: ( 'elseif' )
            {
            // InternalActionLanguage.g:3345:1: ( 'elseif' )
            // InternalActionLanguage.g:3346:1: 'elseif'
            {
             before(grammarAccess.getElseIfStatementAccess().getElseifKeyword_0()); 
            match(input,50,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getElseIfStatementAccess().getElseifKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__Group__0__Impl"


    // $ANTLR start "rule__ElseIfStatement__Group__1"
    // InternalActionLanguage.g:3359:1: rule__ElseIfStatement__Group__1 : rule__ElseIfStatement__Group__1__Impl rule__ElseIfStatement__Group__2 ;
    public final void rule__ElseIfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3363:1: ( rule__ElseIfStatement__Group__1__Impl rule__ElseIfStatement__Group__2 )
            // InternalActionLanguage.g:3364:2: rule__ElseIfStatement__Group__1__Impl rule__ElseIfStatement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ElseIfStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ElseIfStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__Group__1"


    // $ANTLR start "rule__ElseIfStatement__Group__1__Impl"
    // InternalActionLanguage.g:3371:1: rule__ElseIfStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__ElseIfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3375:1: ( ( '(' ) )
            // InternalActionLanguage.g:3376:1: ( '(' )
            {
            // InternalActionLanguage.g:3376:1: ( '(' )
            // InternalActionLanguage.g:3377:1: '('
            {
             before(grammarAccess.getElseIfStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getElseIfStatementAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__Group__1__Impl"


    // $ANTLR start "rule__ElseIfStatement__Group__2"
    // InternalActionLanguage.g:3390:1: rule__ElseIfStatement__Group__2 : rule__ElseIfStatement__Group__2__Impl rule__ElseIfStatement__Group__3 ;
    public final void rule__ElseIfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3394:1: ( rule__ElseIfStatement__Group__2__Impl rule__ElseIfStatement__Group__3 )
            // InternalActionLanguage.g:3395:2: rule__ElseIfStatement__Group__2__Impl rule__ElseIfStatement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__ElseIfStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ElseIfStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__Group__2"


    // $ANTLR start "rule__ElseIfStatement__Group__2__Impl"
    // InternalActionLanguage.g:3402:1: rule__ElseIfStatement__Group__2__Impl : ( ( rule__ElseIfStatement__ElseIfConditionAssignment_2 ) ) ;
    public final void rule__ElseIfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3406:1: ( ( ( rule__ElseIfStatement__ElseIfConditionAssignment_2 ) ) )
            // InternalActionLanguage.g:3407:1: ( ( rule__ElseIfStatement__ElseIfConditionAssignment_2 ) )
            {
            // InternalActionLanguage.g:3407:1: ( ( rule__ElseIfStatement__ElseIfConditionAssignment_2 ) )
            // InternalActionLanguage.g:3408:1: ( rule__ElseIfStatement__ElseIfConditionAssignment_2 )
            {
             before(grammarAccess.getElseIfStatementAccess().getElseIfConditionAssignment_2()); 
            // InternalActionLanguage.g:3409:1: ( rule__ElseIfStatement__ElseIfConditionAssignment_2 )
            // InternalActionLanguage.g:3409:2: rule__ElseIfStatement__ElseIfConditionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ElseIfStatement__ElseIfConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElseIfStatementAccess().getElseIfConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__Group__2__Impl"


    // $ANTLR start "rule__ElseIfStatement__Group__3"
    // InternalActionLanguage.g:3419:1: rule__ElseIfStatement__Group__3 : rule__ElseIfStatement__Group__3__Impl rule__ElseIfStatement__Group__4 ;
    public final void rule__ElseIfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3423:1: ( rule__ElseIfStatement__Group__3__Impl rule__ElseIfStatement__Group__4 )
            // InternalActionLanguage.g:3424:2: rule__ElseIfStatement__Group__3__Impl rule__ElseIfStatement__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ElseIfStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ElseIfStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__Group__3"


    // $ANTLR start "rule__ElseIfStatement__Group__3__Impl"
    // InternalActionLanguage.g:3431:1: rule__ElseIfStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__ElseIfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3435:1: ( ( ')' ) )
            // InternalActionLanguage.g:3436:1: ( ')' )
            {
            // InternalActionLanguage.g:3436:1: ( ')' )
            // InternalActionLanguage.g:3437:1: ')'
            {
             before(grammarAccess.getElseIfStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,44,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getElseIfStatementAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__Group__3__Impl"


    // $ANTLR start "rule__ElseIfStatement__Group__4"
    // InternalActionLanguage.g:3450:1: rule__ElseIfStatement__Group__4 : rule__ElseIfStatement__Group__4__Impl ;
    public final void rule__ElseIfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3454:1: ( rule__ElseIfStatement__Group__4__Impl )
            // InternalActionLanguage.g:3455:2: rule__ElseIfStatement__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ElseIfStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__Group__4"


    // $ANTLR start "rule__ElseIfStatement__Group__4__Impl"
    // InternalActionLanguage.g:3461:1: rule__ElseIfStatement__Group__4__Impl : ( ( rule__ElseIfStatement__ElseIfBlockAssignment_4 ) ) ;
    public final void rule__ElseIfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3465:1: ( ( ( rule__ElseIfStatement__ElseIfBlockAssignment_4 ) ) )
            // InternalActionLanguage.g:3466:1: ( ( rule__ElseIfStatement__ElseIfBlockAssignment_4 ) )
            {
            // InternalActionLanguage.g:3466:1: ( ( rule__ElseIfStatement__ElseIfBlockAssignment_4 ) )
            // InternalActionLanguage.g:3467:1: ( rule__ElseIfStatement__ElseIfBlockAssignment_4 )
            {
             before(grammarAccess.getElseIfStatementAccess().getElseIfBlockAssignment_4()); 
            // InternalActionLanguage.g:3468:1: ( rule__ElseIfStatement__ElseIfBlockAssignment_4 )
            // InternalActionLanguage.g:3468:2: rule__ElseIfStatement__ElseIfBlockAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ElseIfStatement__ElseIfBlockAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getElseIfStatementAccess().getElseIfBlockAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__Group__4__Impl"


    // $ANTLR start "rule__ReturnStatement__Group__0"
    // InternalActionLanguage.g:3488:1: rule__ReturnStatement__Group__0 : rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1 ;
    public final void rule__ReturnStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3492:1: ( rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1 )
            // InternalActionLanguage.g:3493:2: rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__ReturnStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReturnStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__0"


    // $ANTLR start "rule__ReturnStatement__Group__0__Impl"
    // InternalActionLanguage.g:3500:1: rule__ReturnStatement__Group__0__Impl : ( () ) ;
    public final void rule__ReturnStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3504:1: ( ( () ) )
            // InternalActionLanguage.g:3505:1: ( () )
            {
            // InternalActionLanguage.g:3505:1: ( () )
            // InternalActionLanguage.g:3506:1: ()
            {
             before(grammarAccess.getReturnStatementAccess().getReturnStatementAction_0()); 
            // InternalActionLanguage.g:3507:1: ()
            // InternalActionLanguage.g:3509:1: 
            {
            }

             after(grammarAccess.getReturnStatementAccess().getReturnStatementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__0__Impl"


    // $ANTLR start "rule__ReturnStatement__Group__1"
    // InternalActionLanguage.g:3519:1: rule__ReturnStatement__Group__1 : rule__ReturnStatement__Group__1__Impl rule__ReturnStatement__Group__2 ;
    public final void rule__ReturnStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3523:1: ( rule__ReturnStatement__Group__1__Impl rule__ReturnStatement__Group__2 )
            // InternalActionLanguage.g:3524:2: rule__ReturnStatement__Group__1__Impl rule__ReturnStatement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ReturnStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReturnStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__1"


    // $ANTLR start "rule__ReturnStatement__Group__1__Impl"
    // InternalActionLanguage.g:3531:1: rule__ReturnStatement__Group__1__Impl : ( 'return' ) ;
    public final void rule__ReturnStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3535:1: ( ( 'return' ) )
            // InternalActionLanguage.g:3536:1: ( 'return' )
            {
            // InternalActionLanguage.g:3536:1: ( 'return' )
            // InternalActionLanguage.g:3537:1: 'return'
            {
             before(grammarAccess.getReturnStatementAccess().getReturnKeyword_1()); 
            match(input,51,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getReturnStatementAccess().getReturnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__1__Impl"


    // $ANTLR start "rule__ReturnStatement__Group__2"
    // InternalActionLanguage.g:3550:1: rule__ReturnStatement__Group__2 : rule__ReturnStatement__Group__2__Impl rule__ReturnStatement__Group__3 ;
    public final void rule__ReturnStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3554:1: ( rule__ReturnStatement__Group__2__Impl rule__ReturnStatement__Group__3 )
            // InternalActionLanguage.g:3555:2: rule__ReturnStatement__Group__2__Impl rule__ReturnStatement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__ReturnStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReturnStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__2"


    // $ANTLR start "rule__ReturnStatement__Group__2__Impl"
    // InternalActionLanguage.g:3562:1: rule__ReturnStatement__Group__2__Impl : ( ( rule__ReturnStatement__ExpressionAssignment_2 ) ) ;
    public final void rule__ReturnStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3566:1: ( ( ( rule__ReturnStatement__ExpressionAssignment_2 ) ) )
            // InternalActionLanguage.g:3567:1: ( ( rule__ReturnStatement__ExpressionAssignment_2 ) )
            {
            // InternalActionLanguage.g:3567:1: ( ( rule__ReturnStatement__ExpressionAssignment_2 ) )
            // InternalActionLanguage.g:3568:1: ( rule__ReturnStatement__ExpressionAssignment_2 )
            {
             before(grammarAccess.getReturnStatementAccess().getExpressionAssignment_2()); 
            // InternalActionLanguage.g:3569:1: ( rule__ReturnStatement__ExpressionAssignment_2 )
            // InternalActionLanguage.g:3569:2: rule__ReturnStatement__ExpressionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReturnStatement__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReturnStatementAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__2__Impl"


    // $ANTLR start "rule__ReturnStatement__Group__3"
    // InternalActionLanguage.g:3579:1: rule__ReturnStatement__Group__3 : rule__ReturnStatement__Group__3__Impl ;
    public final void rule__ReturnStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3583:1: ( rule__ReturnStatement__Group__3__Impl )
            // InternalActionLanguage.g:3584:2: rule__ReturnStatement__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReturnStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__3"


    // $ANTLR start "rule__ReturnStatement__Group__3__Impl"
    // InternalActionLanguage.g:3590:1: rule__ReturnStatement__Group__3__Impl : ( ';' ) ;
    public final void rule__ReturnStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3594:1: ( ( ';' ) )
            // InternalActionLanguage.g:3595:1: ( ';' )
            {
            // InternalActionLanguage.g:3595:1: ( ';' )
            // InternalActionLanguage.g:3596:1: ';'
            {
             before(grammarAccess.getReturnStatementAccess().getSemicolonKeyword_3()); 
            match(input,43,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getReturnStatementAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__3__Impl"


    // $ANTLR start "rule__OperationCallStatement__Group__0"
    // InternalActionLanguage.g:3617:1: rule__OperationCallStatement__Group__0 : rule__OperationCallStatement__Group__0__Impl rule__OperationCallStatement__Group__1 ;
    public final void rule__OperationCallStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3621:1: ( rule__OperationCallStatement__Group__0__Impl rule__OperationCallStatement__Group__1 )
            // InternalActionLanguage.g:3622:2: rule__OperationCallStatement__Group__0__Impl rule__OperationCallStatement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__OperationCallStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCallStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCallStatement__Group__0"


    // $ANTLR start "rule__OperationCallStatement__Group__0__Impl"
    // InternalActionLanguage.g:3629:1: rule__OperationCallStatement__Group__0__Impl : ( ruleOperationCall ) ;
    public final void rule__OperationCallStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3633:1: ( ( ruleOperationCall ) )
            // InternalActionLanguage.g:3634:1: ( ruleOperationCall )
            {
            // InternalActionLanguage.g:3634:1: ( ruleOperationCall )
            // InternalActionLanguage.g:3635:1: ruleOperationCall
            {
             before(grammarAccess.getOperationCallStatementAccess().getOperationCallParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOperationCall();

            state._fsp--;

             after(grammarAccess.getOperationCallStatementAccess().getOperationCallParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCallStatement__Group__0__Impl"


    // $ANTLR start "rule__OperationCallStatement__Group__1"
    // InternalActionLanguage.g:3646:1: rule__OperationCallStatement__Group__1 : rule__OperationCallStatement__Group__1__Impl ;
    public final void rule__OperationCallStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3650:1: ( rule__OperationCallStatement__Group__1__Impl )
            // InternalActionLanguage.g:3651:2: rule__OperationCallStatement__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCallStatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCallStatement__Group__1"


    // $ANTLR start "rule__OperationCallStatement__Group__1__Impl"
    // InternalActionLanguage.g:3657:1: rule__OperationCallStatement__Group__1__Impl : ( ';' ) ;
    public final void rule__OperationCallStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3661:1: ( ( ';' ) )
            // InternalActionLanguage.g:3662:1: ( ';' )
            {
            // InternalActionLanguage.g:3662:1: ( ';' )
            // InternalActionLanguage.g:3663:1: ';'
            {
             before(grammarAccess.getOperationCallStatementAccess().getSemicolonKeyword_1()); 
            match(input,43,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOperationCallStatementAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCallStatement__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalActionLanguage.g:3680:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3684:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalActionLanguage.g:3685:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalActionLanguage.g:3692:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3696:1: ( ( ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 ) ) )
            // InternalActionLanguage.g:3697:1: ( ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 ) )
            {
            // InternalActionLanguage.g:3697:1: ( ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 ) )
            // InternalActionLanguage.g:3698:1: ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getLhs_typedNamedElementExpressionAssignment_0()); 
            // InternalActionLanguage.g:3699:1: ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 )
            // InternalActionLanguage.g:3699:2: rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getLhs_typedNamedElementExpressionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalActionLanguage.g:3709:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3713:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalActionLanguage.g:3714:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalActionLanguage.g:3721:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__Alternatives_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3725:1: ( ( ( rule__Assignment__Alternatives_1 ) ) )
            // InternalActionLanguage.g:3726:1: ( ( rule__Assignment__Alternatives_1 ) )
            {
            // InternalActionLanguage.g:3726:1: ( ( rule__Assignment__Alternatives_1 ) )
            // InternalActionLanguage.g:3727:1: ( rule__Assignment__Alternatives_1 )
            {
             before(grammarAccess.getAssignmentAccess().getAlternatives_1()); 
            // InternalActionLanguage.g:3728:1: ( rule__Assignment__Alternatives_1 )
            // InternalActionLanguage.g:3728:2: rule__Assignment__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalActionLanguage.g:3738:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3742:1: ( rule__Assignment__Group__2__Impl )
            // InternalActionLanguage.g:3743:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalActionLanguage.g:3749:1: rule__Assignment__Group__2__Impl : ( ';' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3753:1: ( ( ';' ) )
            // InternalActionLanguage.g:3754:1: ( ';' )
            {
            // InternalActionLanguage.g:3754:1: ( ';' )
            // InternalActionLanguage.g:3755:1: ';'
            {
             before(grammarAccess.getAssignmentAccess().getSemicolonKeyword_2()); 
            match(input,43,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group_1_0__0"
    // InternalActionLanguage.g:3774:1: rule__Assignment__Group_1_0__0 : rule__Assignment__Group_1_0__0__Impl rule__Assignment__Group_1_0__1 ;
    public final void rule__Assignment__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3778:1: ( rule__Assignment__Group_1_0__0__Impl rule__Assignment__Group_1_0__1 )
            // InternalActionLanguage.g:3779:2: rule__Assignment__Group_1_0__0__Impl rule__Assignment__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__Assignment__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_0__0"


    // $ANTLR start "rule__Assignment__Group_1_0__0__Impl"
    // InternalActionLanguage.g:3786:1: rule__Assignment__Group_1_0__0__Impl : ( ( rule__Assignment__AssignOperatorAssignment_1_0_0 ) ) ;
    public final void rule__Assignment__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3790:1: ( ( ( rule__Assignment__AssignOperatorAssignment_1_0_0 ) ) )
            // InternalActionLanguage.g:3791:1: ( ( rule__Assignment__AssignOperatorAssignment_1_0_0 ) )
            {
            // InternalActionLanguage.g:3791:1: ( ( rule__Assignment__AssignOperatorAssignment_1_0_0 ) )
            // InternalActionLanguage.g:3792:1: ( rule__Assignment__AssignOperatorAssignment_1_0_0 )
            {
             before(grammarAccess.getAssignmentAccess().getAssignOperatorAssignment_1_0_0()); 
            // InternalActionLanguage.g:3793:1: ( rule__Assignment__AssignOperatorAssignment_1_0_0 )
            // InternalActionLanguage.g:3793:2: rule__Assignment__AssignOperatorAssignment_1_0_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__AssignOperatorAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getAssignOperatorAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_0__0__Impl"


    // $ANTLR start "rule__Assignment__Group_1_0__1"
    // InternalActionLanguage.g:3803:1: rule__Assignment__Group_1_0__1 : rule__Assignment__Group_1_0__1__Impl ;
    public final void rule__Assignment__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3807:1: ( rule__Assignment__Group_1_0__1__Impl )
            // InternalActionLanguage.g:3808:2: rule__Assignment__Group_1_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_0__1"


    // $ANTLR start "rule__Assignment__Group_1_0__1__Impl"
    // InternalActionLanguage.g:3814:1: rule__Assignment__Group_1_0__1__Impl : ( ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 ) ) ;
    public final void rule__Assignment__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3818:1: ( ( ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 ) ) )
            // InternalActionLanguage.g:3819:1: ( ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 ) )
            {
            // InternalActionLanguage.g:3819:1: ( ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 ) )
            // InternalActionLanguage.g:3820:1: ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 )
            {
             before(grammarAccess.getAssignmentAccess().getRhs_assignExpressionAssignment_1_0_1()); 
            // InternalActionLanguage.g:3821:1: ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 )
            // InternalActionLanguage.g:3821:2: rule__Assignment__Rhs_assignExpressionAssignment_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Rhs_assignExpressionAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getRhs_assignExpressionAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_0__1__Impl"


    // $ANTLR start "rule__ArrayInitializeExpression__Group__0"
    // InternalActionLanguage.g:3835:1: rule__ArrayInitializeExpression__Group__0 : rule__ArrayInitializeExpression__Group__0__Impl rule__ArrayInitializeExpression__Group__1 ;
    public final void rule__ArrayInitializeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3839:1: ( rule__ArrayInitializeExpression__Group__0__Impl rule__ArrayInitializeExpression__Group__1 )
            // InternalActionLanguage.g:3840:2: rule__ArrayInitializeExpression__Group__0__Impl rule__ArrayInitializeExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__ArrayInitializeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayInitializeExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group__0"


    // $ANTLR start "rule__ArrayInitializeExpression__Group__0__Impl"
    // InternalActionLanguage.g:3847:1: rule__ArrayInitializeExpression__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayInitializeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3851:1: ( ( '[' ) )
            // InternalActionLanguage.g:3852:1: ( '[' )
            {
            // InternalActionLanguage.g:3852:1: ( '[' )
            // InternalActionLanguage.g:3853:1: '['
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,52,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getArrayInitializeExpressionAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group__0__Impl"


    // $ANTLR start "rule__ArrayInitializeExpression__Group__1"
    // InternalActionLanguage.g:3866:1: rule__ArrayInitializeExpression__Group__1 : rule__ArrayInitializeExpression__Group__1__Impl rule__ArrayInitializeExpression__Group__2 ;
    public final void rule__ArrayInitializeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3870:1: ( rule__ArrayInitializeExpression__Group__1__Impl rule__ArrayInitializeExpression__Group__2 )
            // InternalActionLanguage.g:3871:2: rule__ArrayInitializeExpression__Group__1__Impl rule__ArrayInitializeExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__ArrayInitializeExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayInitializeExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group__1"


    // $ANTLR start "rule__ArrayInitializeExpression__Group__1__Impl"
    // InternalActionLanguage.g:3878:1: rule__ArrayInitializeExpression__Group__1__Impl : ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 ) ) ;
    public final void rule__ArrayInitializeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3882:1: ( ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 ) ) )
            // InternalActionLanguage.g:3883:1: ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 ) )
            {
            // InternalActionLanguage.g:3883:1: ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 ) )
            // InternalActionLanguage.g:3884:1: ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 )
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsAssignment_1()); 
            // InternalActionLanguage.g:3885:1: ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 )
            // InternalActionLanguage.g:3885:2: rule__ArrayInitializeExpression__ExpressionsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayInitializeExpression__ExpressionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group__1__Impl"


    // $ANTLR start "rule__ArrayInitializeExpression__Group__2"
    // InternalActionLanguage.g:3895:1: rule__ArrayInitializeExpression__Group__2 : rule__ArrayInitializeExpression__Group__2__Impl rule__ArrayInitializeExpression__Group__3 ;
    public final void rule__ArrayInitializeExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3899:1: ( rule__ArrayInitializeExpression__Group__2__Impl rule__ArrayInitializeExpression__Group__3 )
            // InternalActionLanguage.g:3900:2: rule__ArrayInitializeExpression__Group__2__Impl rule__ArrayInitializeExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__ArrayInitializeExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayInitializeExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group__2"


    // $ANTLR start "rule__ArrayInitializeExpression__Group__2__Impl"
    // InternalActionLanguage.g:3907:1: rule__ArrayInitializeExpression__Group__2__Impl : ( ( rule__ArrayInitializeExpression__Group_2__0 )* ) ;
    public final void rule__ArrayInitializeExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3911:1: ( ( ( rule__ArrayInitializeExpression__Group_2__0 )* ) )
            // InternalActionLanguage.g:3912:1: ( ( rule__ArrayInitializeExpression__Group_2__0 )* )
            {
            // InternalActionLanguage.g:3912:1: ( ( rule__ArrayInitializeExpression__Group_2__0 )* )
            // InternalActionLanguage.g:3913:1: ( rule__ArrayInitializeExpression__Group_2__0 )*
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getGroup_2()); 
            // InternalActionLanguage.g:3914:1: ( rule__ArrayInitializeExpression__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==54) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalActionLanguage.g:3914:2: rule__ArrayInitializeExpression__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    rule__ArrayInitializeExpression__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getArrayInitializeExpressionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group__2__Impl"


    // $ANTLR start "rule__ArrayInitializeExpression__Group__3"
    // InternalActionLanguage.g:3924:1: rule__ArrayInitializeExpression__Group__3 : rule__ArrayInitializeExpression__Group__3__Impl ;
    public final void rule__ArrayInitializeExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3928:1: ( rule__ArrayInitializeExpression__Group__3__Impl )
            // InternalActionLanguage.g:3929:2: rule__ArrayInitializeExpression__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayInitializeExpression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group__3"


    // $ANTLR start "rule__ArrayInitializeExpression__Group__3__Impl"
    // InternalActionLanguage.g:3935:1: rule__ArrayInitializeExpression__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayInitializeExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3939:1: ( ( ']' ) )
            // InternalActionLanguage.g:3940:1: ( ']' )
            {
            // InternalActionLanguage.g:3940:1: ( ']' )
            // InternalActionLanguage.g:3941:1: ']'
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getRightSquareBracketKeyword_3()); 
            match(input,53,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getArrayInitializeExpressionAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group__3__Impl"


    // $ANTLR start "rule__ArrayInitializeExpression__Group_2__0"
    // InternalActionLanguage.g:3962:1: rule__ArrayInitializeExpression__Group_2__0 : rule__ArrayInitializeExpression__Group_2__0__Impl rule__ArrayInitializeExpression__Group_2__1 ;
    public final void rule__ArrayInitializeExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3966:1: ( rule__ArrayInitializeExpression__Group_2__0__Impl rule__ArrayInitializeExpression__Group_2__1 )
            // InternalActionLanguage.g:3967:2: rule__ArrayInitializeExpression__Group_2__0__Impl rule__ArrayInitializeExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__ArrayInitializeExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayInitializeExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group_2__0"


    // $ANTLR start "rule__ArrayInitializeExpression__Group_2__0__Impl"
    // InternalActionLanguage.g:3974:1: rule__ArrayInitializeExpression__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayInitializeExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3978:1: ( ( ',' ) )
            // InternalActionLanguage.g:3979:1: ( ',' )
            {
            // InternalActionLanguage.g:3979:1: ( ',' )
            // InternalActionLanguage.g:3980:1: ','
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getCommaKeyword_2_0()); 
            match(input,54,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getArrayInitializeExpressionAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group_2__0__Impl"


    // $ANTLR start "rule__ArrayInitializeExpression__Group_2__1"
    // InternalActionLanguage.g:3993:1: rule__ArrayInitializeExpression__Group_2__1 : rule__ArrayInitializeExpression__Group_2__1__Impl ;
    public final void rule__ArrayInitializeExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:3997:1: ( rule__ArrayInitializeExpression__Group_2__1__Impl )
            // InternalActionLanguage.g:3998:2: rule__ArrayInitializeExpression__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayInitializeExpression__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group_2__1"


    // $ANTLR start "rule__ArrayInitializeExpression__Group_2__1__Impl"
    // InternalActionLanguage.g:4004:1: rule__ArrayInitializeExpression__Group_2__1__Impl : ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 ) ) ;
    public final void rule__ArrayInitializeExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4008:1: ( ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 ) ) )
            // InternalActionLanguage.g:4009:1: ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 ) )
            {
            // InternalActionLanguage.g:4009:1: ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 ) )
            // InternalActionLanguage.g:4010:1: ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 )
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsAssignment_2_1()); 
            // InternalActionLanguage.g:4011:1: ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 )
            // InternalActionLanguage.g:4011:2: rule__ArrayInitializeExpression__ExpressionsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayInitializeExpression__ExpressionsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group_2__1__Impl"


    // $ANTLR start "rule__LocalVariableDeclaration__Group__0"
    // InternalActionLanguage.g:4025:1: rule__LocalVariableDeclaration__Group__0 : rule__LocalVariableDeclaration__Group__0__Impl rule__LocalVariableDeclaration__Group__1 ;
    public final void rule__LocalVariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4029:1: ( rule__LocalVariableDeclaration__Group__0__Impl rule__LocalVariableDeclaration__Group__1 )
            // InternalActionLanguage.g:4030:2: rule__LocalVariableDeclaration__Group__0__Impl rule__LocalVariableDeclaration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__LocalVariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group__0"


    // $ANTLR start "rule__LocalVariableDeclaration__Group__0__Impl"
    // InternalActionLanguage.g:4037:1: rule__LocalVariableDeclaration__Group__0__Impl : ( ( rule__LocalVariableDeclaration__DataTypeAssignment_0 ) ) ;
    public final void rule__LocalVariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4041:1: ( ( ( rule__LocalVariableDeclaration__DataTypeAssignment_0 ) ) )
            // InternalActionLanguage.g:4042:1: ( ( rule__LocalVariableDeclaration__DataTypeAssignment_0 ) )
            {
            // InternalActionLanguage.g:4042:1: ( ( rule__LocalVariableDeclaration__DataTypeAssignment_0 ) )
            // InternalActionLanguage.g:4043:1: ( rule__LocalVariableDeclaration__DataTypeAssignment_0 )
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getDataTypeAssignment_0()); 
            // InternalActionLanguage.g:4044:1: ( rule__LocalVariableDeclaration__DataTypeAssignment_0 )
            // InternalActionLanguage.g:4044:2: rule__LocalVariableDeclaration__DataTypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableDeclaration__DataTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLocalVariableDeclarationAccess().getDataTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__LocalVariableDeclaration__Group__1"
    // InternalActionLanguage.g:4054:1: rule__LocalVariableDeclaration__Group__1 : rule__LocalVariableDeclaration__Group__1__Impl rule__LocalVariableDeclaration__Group__2 ;
    public final void rule__LocalVariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4058:1: ( rule__LocalVariableDeclaration__Group__1__Impl rule__LocalVariableDeclaration__Group__2 )
            // InternalActionLanguage.g:4059:2: rule__LocalVariableDeclaration__Group__1__Impl rule__LocalVariableDeclaration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__LocalVariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group__1"


    // $ANTLR start "rule__LocalVariableDeclaration__Group__1__Impl"
    // InternalActionLanguage.g:4066:1: rule__LocalVariableDeclaration__Group__1__Impl : ( ( rule__LocalVariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__LocalVariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4070:1: ( ( ( rule__LocalVariableDeclaration__NameAssignment_1 ) ) )
            // InternalActionLanguage.g:4071:1: ( ( rule__LocalVariableDeclaration__NameAssignment_1 ) )
            {
            // InternalActionLanguage.g:4071:1: ( ( rule__LocalVariableDeclaration__NameAssignment_1 ) )
            // InternalActionLanguage.g:4072:1: ( rule__LocalVariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalActionLanguage.g:4073:1: ( rule__LocalVariableDeclaration__NameAssignment_1 )
            // InternalActionLanguage.g:4073:2: rule__LocalVariableDeclaration__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalVariableDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__LocalVariableDeclaration__Group__2"
    // InternalActionLanguage.g:4083:1: rule__LocalVariableDeclaration__Group__2 : rule__LocalVariableDeclaration__Group__2__Impl rule__LocalVariableDeclaration__Group__3 ;
    public final void rule__LocalVariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4087:1: ( rule__LocalVariableDeclaration__Group__2__Impl rule__LocalVariableDeclaration__Group__3 )
            // InternalActionLanguage.g:4088:2: rule__LocalVariableDeclaration__Group__2__Impl rule__LocalVariableDeclaration__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__LocalVariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group__2"


    // $ANTLR start "rule__LocalVariableDeclaration__Group__2__Impl"
    // InternalActionLanguage.g:4095:1: rule__LocalVariableDeclaration__Group__2__Impl : ( ( rule__LocalVariableDeclaration__Group_2__0 )? ) ;
    public final void rule__LocalVariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4099:1: ( ( ( rule__LocalVariableDeclaration__Group_2__0 )? ) )
            // InternalActionLanguage.g:4100:1: ( ( rule__LocalVariableDeclaration__Group_2__0 )? )
            {
            // InternalActionLanguage.g:4100:1: ( ( rule__LocalVariableDeclaration__Group_2__0 )? )
            // InternalActionLanguage.g:4101:1: ( rule__LocalVariableDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getGroup_2()); 
            // InternalActionLanguage.g:4102:1: ( rule__LocalVariableDeclaration__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==19) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalActionLanguage.g:4102:2: rule__LocalVariableDeclaration__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__LocalVariableDeclaration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocalVariableDeclarationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__LocalVariableDeclaration__Group__3"
    // InternalActionLanguage.g:4112:1: rule__LocalVariableDeclaration__Group__3 : rule__LocalVariableDeclaration__Group__3__Impl ;
    public final void rule__LocalVariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4116:1: ( rule__LocalVariableDeclaration__Group__3__Impl )
            // InternalActionLanguage.g:4117:2: rule__LocalVariableDeclaration__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group__3"


    // $ANTLR start "rule__LocalVariableDeclaration__Group__3__Impl"
    // InternalActionLanguage.g:4123:1: rule__LocalVariableDeclaration__Group__3__Impl : ( ';' ) ;
    public final void rule__LocalVariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4127:1: ( ( ';' ) )
            // InternalActionLanguage.g:4128:1: ( ';' )
            {
            // InternalActionLanguage.g:4128:1: ( ';' )
            // InternalActionLanguage.g:4129:1: ';'
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getSemicolonKeyword_3()); 
            match(input,43,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getLocalVariableDeclarationAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__LocalVariableDeclaration__Group_2__0"
    // InternalActionLanguage.g:4150:1: rule__LocalVariableDeclaration__Group_2__0 : rule__LocalVariableDeclaration__Group_2__0__Impl rule__LocalVariableDeclaration__Group_2__1 ;
    public final void rule__LocalVariableDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4154:1: ( rule__LocalVariableDeclaration__Group_2__0__Impl rule__LocalVariableDeclaration__Group_2__1 )
            // InternalActionLanguage.g:4155:2: rule__LocalVariableDeclaration__Group_2__0__Impl rule__LocalVariableDeclaration__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__LocalVariableDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableDeclaration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group_2__0"


    // $ANTLR start "rule__LocalVariableDeclaration__Group_2__0__Impl"
    // InternalActionLanguage.g:4162:1: rule__LocalVariableDeclaration__Group_2__0__Impl : ( ':=' ) ;
    public final void rule__LocalVariableDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4166:1: ( ( ':=' ) )
            // InternalActionLanguage.g:4167:1: ( ':=' )
            {
            // InternalActionLanguage.g:4167:1: ( ':=' )
            // InternalActionLanguage.g:4168:1: ':='
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getColonEqualsSignKeyword_2_0()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getLocalVariableDeclarationAccess().getColonEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__LocalVariableDeclaration__Group_2__1"
    // InternalActionLanguage.g:4181:1: rule__LocalVariableDeclaration__Group_2__1 : rule__LocalVariableDeclaration__Group_2__1__Impl ;
    public final void rule__LocalVariableDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4185:1: ( rule__LocalVariableDeclaration__Group_2__1__Impl )
            // InternalActionLanguage.g:4186:2: rule__LocalVariableDeclaration__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableDeclaration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group_2__1"


    // $ANTLR start "rule__LocalVariableDeclaration__Group_2__1__Impl"
    // InternalActionLanguage.g:4192:1: rule__LocalVariableDeclaration__Group_2__1__Impl : ( ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 ) ) ;
    public final void rule__LocalVariableDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4196:1: ( ( ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 ) ) )
            // InternalActionLanguage.g:4197:1: ( ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 ) )
            {
            // InternalActionLanguage.g:4197:1: ( ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 ) )
            // InternalActionLanguage.g:4198:1: ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 )
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getInitializeExpressionAssignment_2_1()); 
            // InternalActionLanguage.g:4199:1: ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 )
            // InternalActionLanguage.g:4199:2: rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalVariableDeclarationAccess().getInitializeExpressionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__0"
    // InternalActionLanguage.g:4213:1: rule__LocalConstantDeclaration__Group__0 : rule__LocalConstantDeclaration__Group__0__Impl rule__LocalConstantDeclaration__Group__1 ;
    public final void rule__LocalConstantDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4217:1: ( rule__LocalConstantDeclaration__Group__0__Impl rule__LocalConstantDeclaration__Group__1 )
            // InternalActionLanguage.g:4218:2: rule__LocalConstantDeclaration__Group__0__Impl rule__LocalConstantDeclaration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__LocalConstantDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__0"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__0__Impl"
    // InternalActionLanguage.g:4225:1: rule__LocalConstantDeclaration__Group__0__Impl : ( ( rule__LocalConstantDeclaration__ConstantAssignment_0 ) ) ;
    public final void rule__LocalConstantDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4229:1: ( ( ( rule__LocalConstantDeclaration__ConstantAssignment_0 ) ) )
            // InternalActionLanguage.g:4230:1: ( ( rule__LocalConstantDeclaration__ConstantAssignment_0 ) )
            {
            // InternalActionLanguage.g:4230:1: ( ( rule__LocalConstantDeclaration__ConstantAssignment_0 ) )
            // InternalActionLanguage.g:4231:1: ( rule__LocalConstantDeclaration__ConstantAssignment_0 )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getConstantAssignment_0()); 
            // InternalActionLanguage.g:4232:1: ( rule__LocalConstantDeclaration__ConstantAssignment_0 )
            // InternalActionLanguage.g:4232:2: rule__LocalConstantDeclaration__ConstantAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__ConstantAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLocalConstantDeclarationAccess().getConstantAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__0__Impl"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__1"
    // InternalActionLanguage.g:4242:1: rule__LocalConstantDeclaration__Group__1 : rule__LocalConstantDeclaration__Group__1__Impl rule__LocalConstantDeclaration__Group__2 ;
    public final void rule__LocalConstantDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4246:1: ( rule__LocalConstantDeclaration__Group__1__Impl rule__LocalConstantDeclaration__Group__2 )
            // InternalActionLanguage.g:4247:2: rule__LocalConstantDeclaration__Group__1__Impl rule__LocalConstantDeclaration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__LocalConstantDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__1"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__1__Impl"
    // InternalActionLanguage.g:4254:1: rule__LocalConstantDeclaration__Group__1__Impl : ( ( rule__LocalConstantDeclaration__DataTypeAssignment_1 ) ) ;
    public final void rule__LocalConstantDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4258:1: ( ( ( rule__LocalConstantDeclaration__DataTypeAssignment_1 ) ) )
            // InternalActionLanguage.g:4259:1: ( ( rule__LocalConstantDeclaration__DataTypeAssignment_1 ) )
            {
            // InternalActionLanguage.g:4259:1: ( ( rule__LocalConstantDeclaration__DataTypeAssignment_1 ) )
            // InternalActionLanguage.g:4260:1: ( rule__LocalConstantDeclaration__DataTypeAssignment_1 )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getDataTypeAssignment_1()); 
            // InternalActionLanguage.g:4261:1: ( rule__LocalConstantDeclaration__DataTypeAssignment_1 )
            // InternalActionLanguage.g:4261:2: rule__LocalConstantDeclaration__DataTypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__DataTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalConstantDeclarationAccess().getDataTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__1__Impl"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__2"
    // InternalActionLanguage.g:4271:1: rule__LocalConstantDeclaration__Group__2 : rule__LocalConstantDeclaration__Group__2__Impl rule__LocalConstantDeclaration__Group__3 ;
    public final void rule__LocalConstantDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4275:1: ( rule__LocalConstantDeclaration__Group__2__Impl rule__LocalConstantDeclaration__Group__3 )
            // InternalActionLanguage.g:4276:2: rule__LocalConstantDeclaration__Group__2__Impl rule__LocalConstantDeclaration__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__LocalConstantDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__2"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__2__Impl"
    // InternalActionLanguage.g:4283:1: rule__LocalConstantDeclaration__Group__2__Impl : ( ( rule__LocalConstantDeclaration__NameAssignment_2 ) ) ;
    public final void rule__LocalConstantDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4287:1: ( ( ( rule__LocalConstantDeclaration__NameAssignment_2 ) ) )
            // InternalActionLanguage.g:4288:1: ( ( rule__LocalConstantDeclaration__NameAssignment_2 ) )
            {
            // InternalActionLanguage.g:4288:1: ( ( rule__LocalConstantDeclaration__NameAssignment_2 ) )
            // InternalActionLanguage.g:4289:1: ( rule__LocalConstantDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getNameAssignment_2()); 
            // InternalActionLanguage.g:4290:1: ( rule__LocalConstantDeclaration__NameAssignment_2 )
            // InternalActionLanguage.g:4290:2: rule__LocalConstantDeclaration__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLocalConstantDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__2__Impl"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__3"
    // InternalActionLanguage.g:4300:1: rule__LocalConstantDeclaration__Group__3 : rule__LocalConstantDeclaration__Group__3__Impl rule__LocalConstantDeclaration__Group__4 ;
    public final void rule__LocalConstantDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4304:1: ( rule__LocalConstantDeclaration__Group__3__Impl rule__LocalConstantDeclaration__Group__4 )
            // InternalActionLanguage.g:4305:2: rule__LocalConstantDeclaration__Group__3__Impl rule__LocalConstantDeclaration__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__LocalConstantDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__3"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__3__Impl"
    // InternalActionLanguage.g:4312:1: rule__LocalConstantDeclaration__Group__3__Impl : ( ':=' ) ;
    public final void rule__LocalConstantDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4316:1: ( ( ':=' ) )
            // InternalActionLanguage.g:4317:1: ( ':=' )
            {
            // InternalActionLanguage.g:4317:1: ( ':=' )
            // InternalActionLanguage.g:4318:1: ':='
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getColonEqualsSignKeyword_3()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getLocalConstantDeclarationAccess().getColonEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__3__Impl"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__4"
    // InternalActionLanguage.g:4331:1: rule__LocalConstantDeclaration__Group__4 : rule__LocalConstantDeclaration__Group__4__Impl rule__LocalConstantDeclaration__Group__5 ;
    public final void rule__LocalConstantDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4335:1: ( rule__LocalConstantDeclaration__Group__4__Impl rule__LocalConstantDeclaration__Group__5 )
            // InternalActionLanguage.g:4336:2: rule__LocalConstantDeclaration__Group__4__Impl rule__LocalConstantDeclaration__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__LocalConstantDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__4"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__4__Impl"
    // InternalActionLanguage.g:4343:1: rule__LocalConstantDeclaration__Group__4__Impl : ( ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 ) ) ;
    public final void rule__LocalConstantDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4347:1: ( ( ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 ) ) )
            // InternalActionLanguage.g:4348:1: ( ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 ) )
            {
            // InternalActionLanguage.g:4348:1: ( ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 ) )
            // InternalActionLanguage.g:4349:1: ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getInitializeExpressionAssignment_4()); 
            // InternalActionLanguage.g:4350:1: ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 )
            // InternalActionLanguage.g:4350:2: rule__LocalConstantDeclaration__InitializeExpressionAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__InitializeExpressionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLocalConstantDeclarationAccess().getInitializeExpressionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__4__Impl"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__5"
    // InternalActionLanguage.g:4360:1: rule__LocalConstantDeclaration__Group__5 : rule__LocalConstantDeclaration__Group__5__Impl ;
    public final void rule__LocalConstantDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4364:1: ( rule__LocalConstantDeclaration__Group__5__Impl )
            // InternalActionLanguage.g:4365:2: rule__LocalConstantDeclaration__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__5"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__5__Impl"
    // InternalActionLanguage.g:4371:1: rule__LocalConstantDeclaration__Group__5__Impl : ( ';' ) ;
    public final void rule__LocalConstantDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4375:1: ( ( ';' ) )
            // InternalActionLanguage.g:4376:1: ( ';' )
            {
            // InternalActionLanguage.g:4376:1: ( ';' )
            // InternalActionLanguage.g:4377:1: ';'
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getSemicolonKeyword_5()); 
            match(input,43,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getLocalConstantDeclarationAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__5__Impl"


    // $ANTLR start "rule__NondeterministicChoiceExpression__Group__0"
    // InternalActionLanguage.g:4402:1: rule__NondeterministicChoiceExpression__Group__0 : rule__NondeterministicChoiceExpression__Group__0__Impl rule__NondeterministicChoiceExpression__Group__1 ;
    public final void rule__NondeterministicChoiceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4406:1: ( rule__NondeterministicChoiceExpression__Group__0__Impl rule__NondeterministicChoiceExpression__Group__1 )
            // InternalActionLanguage.g:4407:2: rule__NondeterministicChoiceExpression__Group__0__Impl rule__NondeterministicChoiceExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__NondeterministicChoiceExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__NondeterministicChoiceExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NondeterministicChoiceExpression__Group__0"


    // $ANTLR start "rule__NondeterministicChoiceExpression__Group__0__Impl"
    // InternalActionLanguage.g:4414:1: rule__NondeterministicChoiceExpression__Group__0__Impl : ( ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 ) ) ;
    public final void rule__NondeterministicChoiceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4418:1: ( ( ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 ) ) )
            // InternalActionLanguage.g:4419:1: ( ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 ) )
            {
            // InternalActionLanguage.g:4419:1: ( ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 ) )
            // InternalActionLanguage.g:4420:1: ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 )
            {
             before(grammarAccess.getNondeterministicChoiceExpressionAccess().getDataTypeAssignment_0()); 
            // InternalActionLanguage.g:4421:1: ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 )
            // InternalActionLanguage.g:4421:2: rule__NondeterministicChoiceExpression__DataTypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NondeterministicChoiceExpression__DataTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNondeterministicChoiceExpressionAccess().getDataTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NondeterministicChoiceExpression__Group__0__Impl"


    // $ANTLR start "rule__NondeterministicChoiceExpression__Group__1"
    // InternalActionLanguage.g:4431:1: rule__NondeterministicChoiceExpression__Group__1 : rule__NondeterministicChoiceExpression__Group__1__Impl ;
    public final void rule__NondeterministicChoiceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4435:1: ( rule__NondeterministicChoiceExpression__Group__1__Impl )
            // InternalActionLanguage.g:4436:2: rule__NondeterministicChoiceExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NondeterministicChoiceExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NondeterministicChoiceExpression__Group__1"


    // $ANTLR start "rule__NondeterministicChoiceExpression__Group__1__Impl"
    // InternalActionLanguage.g:4442:1: rule__NondeterministicChoiceExpression__Group__1__Impl : ( ( rule__NondeterministicChoiceExpression__RangeAssignment_1 ) ) ;
    public final void rule__NondeterministicChoiceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4446:1: ( ( ( rule__NondeterministicChoiceExpression__RangeAssignment_1 ) ) )
            // InternalActionLanguage.g:4447:1: ( ( rule__NondeterministicChoiceExpression__RangeAssignment_1 ) )
            {
            // InternalActionLanguage.g:4447:1: ( ( rule__NondeterministicChoiceExpression__RangeAssignment_1 ) )
            // InternalActionLanguage.g:4448:1: ( rule__NondeterministicChoiceExpression__RangeAssignment_1 )
            {
             before(grammarAccess.getNondeterministicChoiceExpressionAccess().getRangeAssignment_1()); 
            // InternalActionLanguage.g:4449:1: ( rule__NondeterministicChoiceExpression__RangeAssignment_1 )
            // InternalActionLanguage.g:4449:2: rule__NondeterministicChoiceExpression__RangeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NondeterministicChoiceExpression__RangeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNondeterministicChoiceExpressionAccess().getRangeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NondeterministicChoiceExpression__Group__1__Impl"


    // $ANTLR start "rule__Range__Group__0"
    // InternalActionLanguage.g:4463:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4467:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalActionLanguage.g:4468:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__Range__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Range__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0"


    // $ANTLR start "rule__Range__Group__0__Impl"
    // InternalActionLanguage.g:4475:1: rule__Range__Group__0__Impl : ( '<' ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4479:1: ( ( '<' ) )
            // InternalActionLanguage.g:4480:1: ( '<' )
            {
            // InternalActionLanguage.g:4480:1: ( '<' )
            // InternalActionLanguage.g:4481:1: '<'
            {
             before(grammarAccess.getRangeAccess().getLessThanSignKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0__Impl"


    // $ANTLR start "rule__Range__Group__1"
    // InternalActionLanguage.g:4494:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4498:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalActionLanguage.g:4499:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__Range__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Range__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1"


    // $ANTLR start "rule__Range__Group__1__Impl"
    // InternalActionLanguage.g:4506:1: rule__Range__Group__1__Impl : ( ( rule__Range__LowerBoundAssignment_1 ) ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4510:1: ( ( ( rule__Range__LowerBoundAssignment_1 ) ) )
            // InternalActionLanguage.g:4511:1: ( ( rule__Range__LowerBoundAssignment_1 ) )
            {
            // InternalActionLanguage.g:4511:1: ( ( rule__Range__LowerBoundAssignment_1 ) )
            // InternalActionLanguage.g:4512:1: ( rule__Range__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getRangeAccess().getLowerBoundAssignment_1()); 
            // InternalActionLanguage.g:4513:1: ( rule__Range__LowerBoundAssignment_1 )
            // InternalActionLanguage.g:4513:2: rule__Range__LowerBoundAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Range__LowerBoundAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getLowerBoundAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1__Impl"


    // $ANTLR start "rule__Range__Group__2"
    // InternalActionLanguage.g:4523:1: rule__Range__Group__2 : rule__Range__Group__2__Impl rule__Range__Group__3 ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4527:1: ( rule__Range__Group__2__Impl rule__Range__Group__3 )
            // InternalActionLanguage.g:4528:2: rule__Range__Group__2__Impl rule__Range__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__Range__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Range__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2"


    // $ANTLR start "rule__Range__Group__2__Impl"
    // InternalActionLanguage.g:4535:1: rule__Range__Group__2__Impl : ( ',' ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4539:1: ( ( ',' ) )
            // InternalActionLanguage.g:4540:1: ( ',' )
            {
            // InternalActionLanguage.g:4540:1: ( ',' )
            // InternalActionLanguage.g:4541:1: ','
            {
             before(grammarAccess.getRangeAccess().getCommaKeyword_2()); 
            match(input,54,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2__Impl"


    // $ANTLR start "rule__Range__Group__3"
    // InternalActionLanguage.g:4554:1: rule__Range__Group__3 : rule__Range__Group__3__Impl rule__Range__Group__4 ;
    public final void rule__Range__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4558:1: ( rule__Range__Group__3__Impl rule__Range__Group__4 )
            // InternalActionLanguage.g:4559:2: rule__Range__Group__3__Impl rule__Range__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__Range__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Range__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__3"


    // $ANTLR start "rule__Range__Group__3__Impl"
    // InternalActionLanguage.g:4566:1: rule__Range__Group__3__Impl : ( ( rule__Range__UpperBoundAssignment_3 ) ) ;
    public final void rule__Range__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4570:1: ( ( ( rule__Range__UpperBoundAssignment_3 ) ) )
            // InternalActionLanguage.g:4571:1: ( ( rule__Range__UpperBoundAssignment_3 ) )
            {
            // InternalActionLanguage.g:4571:1: ( ( rule__Range__UpperBoundAssignment_3 ) )
            // InternalActionLanguage.g:4572:1: ( rule__Range__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getRangeAccess().getUpperBoundAssignment_3()); 
            // InternalActionLanguage.g:4573:1: ( rule__Range__UpperBoundAssignment_3 )
            // InternalActionLanguage.g:4573:2: rule__Range__UpperBoundAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Range__UpperBoundAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getUpperBoundAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__3__Impl"


    // $ANTLR start "rule__Range__Group__4"
    // InternalActionLanguage.g:4583:1: rule__Range__Group__4 : rule__Range__Group__4__Impl ;
    public final void rule__Range__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4587:1: ( rule__Range__Group__4__Impl )
            // InternalActionLanguage.g:4588:2: rule__Range__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Range__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__4"


    // $ANTLR start "rule__Range__Group__4__Impl"
    // InternalActionLanguage.g:4594:1: rule__Range__Group__4__Impl : ( '>' ) ;
    public final void rule__Range__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4598:1: ( ( '>' ) )
            // InternalActionLanguage.g:4599:1: ( '>' )
            {
            // InternalActionLanguage.g:4599:1: ( '>' )
            // InternalActionLanguage.g:4600:1: '>'
            {
             before(grammarAccess.getRangeAccess().getGreaterThanSignKeyword_4()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__4__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group__0"
    // InternalActionLanguage.g:4623:1: rule__LogicalOrExpression__Group__0 : rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1 ;
    public final void rule__LogicalOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4627:1: ( rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1 )
            // InternalActionLanguage.g:4628:2: rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__LogicalOrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group__0"


    // $ANTLR start "rule__LogicalOrExpression__Group__0__Impl"
    // InternalActionLanguage.g:4635:1: rule__LogicalOrExpression__Group__0__Impl : ( ruleLogicalAndExpression ) ;
    public final void rule__LogicalOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4639:1: ( ( ruleLogicalAndExpression ) )
            // InternalActionLanguage.g:4640:1: ( ruleLogicalAndExpression )
            {
            // InternalActionLanguage.g:4640:1: ( ruleLogicalAndExpression )
            // InternalActionLanguage.g:4641:1: ruleLogicalAndExpression
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLogicalAndExpression();

            state._fsp--;

             after(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group__0__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group__1"
    // InternalActionLanguage.g:4652:1: rule__LogicalOrExpression__Group__1 : rule__LogicalOrExpression__Group__1__Impl ;
    public final void rule__LogicalOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4656:1: ( rule__LogicalOrExpression__Group__1__Impl )
            // InternalActionLanguage.g:4657:2: rule__LogicalOrExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group__1"


    // $ANTLR start "rule__LogicalOrExpression__Group__1__Impl"
    // InternalActionLanguage.g:4663:1: rule__LogicalOrExpression__Group__1__Impl : ( ( rule__LogicalOrExpression__Group_1__0 )* ) ;
    public final void rule__LogicalOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4667:1: ( ( ( rule__LogicalOrExpression__Group_1__0 )* ) )
            // InternalActionLanguage.g:4668:1: ( ( rule__LogicalOrExpression__Group_1__0 )* )
            {
            // InternalActionLanguage.g:4668:1: ( ( rule__LogicalOrExpression__Group_1__0 )* )
            // InternalActionLanguage.g:4669:1: ( rule__LogicalOrExpression__Group_1__0 )*
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getGroup_1()); 
            // InternalActionLanguage.g:4670:1: ( rule__LogicalOrExpression__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==14) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalActionLanguage.g:4670:2: rule__LogicalOrExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    rule__LogicalOrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getLogicalOrExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group__1__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group_1__0"
    // InternalActionLanguage.g:4684:1: rule__LogicalOrExpression__Group_1__0 : rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1 ;
    public final void rule__LogicalOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4688:1: ( rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1 )
            // InternalActionLanguage.g:4689:2: rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__LogicalOrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1__0"


    // $ANTLR start "rule__LogicalOrExpression__Group_1__0__Impl"
    // InternalActionLanguage.g:4696:1: rule__LogicalOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4700:1: ( ( () ) )
            // InternalActionLanguage.g:4701:1: ( () )
            {
            // InternalActionLanguage.g:4701:1: ( () )
            // InternalActionLanguage.g:4702:1: ()
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0()); 
            // InternalActionLanguage.g:4703:1: ()
            // InternalActionLanguage.g:4705:1: 
            {
            }

             after(grammarAccess.getLogicalOrExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group_1__1"
    // InternalActionLanguage.g:4715:1: rule__LogicalOrExpression__Group_1__1 : rule__LogicalOrExpression__Group_1__1__Impl rule__LogicalOrExpression__Group_1__2 ;
    public final void rule__LogicalOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4719:1: ( rule__LogicalOrExpression__Group_1__1__Impl rule__LogicalOrExpression__Group_1__2 )
            // InternalActionLanguage.g:4720:2: rule__LogicalOrExpression__Group_1__1__Impl rule__LogicalOrExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__LogicalOrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1__1"


    // $ANTLR start "rule__LogicalOrExpression__Group_1__1__Impl"
    // InternalActionLanguage.g:4727:1: rule__LogicalOrExpression__Group_1__1__Impl : ( ( rule__LogicalOrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__LogicalOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4731:1: ( ( ( rule__LogicalOrExpression__OperatorAssignment_1_1 ) ) )
            // InternalActionLanguage.g:4732:1: ( ( rule__LogicalOrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalActionLanguage.g:4732:1: ( ( rule__LogicalOrExpression__OperatorAssignment_1_1 ) )
            // InternalActionLanguage.g:4733:1: ( rule__LogicalOrExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalActionLanguage.g:4734:1: ( rule__LogicalOrExpression__OperatorAssignment_1_1 )
            // InternalActionLanguage.g:4734:2: rule__LogicalOrExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicalOrExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group_1__2"
    // InternalActionLanguage.g:4744:1: rule__LogicalOrExpression__Group_1__2 : rule__LogicalOrExpression__Group_1__2__Impl ;
    public final void rule__LogicalOrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4748:1: ( rule__LogicalOrExpression__Group_1__2__Impl )
            // InternalActionLanguage.g:4749:2: rule__LogicalOrExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1__2"


    // $ANTLR start "rule__LogicalOrExpression__Group_1__2__Impl"
    // InternalActionLanguage.g:4755:1: rule__LogicalOrExpression__Group_1__2__Impl : ( ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__LogicalOrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4759:1: ( ( ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalActionLanguage.g:4760:1: ( ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalActionLanguage.g:4760:1: ( ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 ) )
            // InternalActionLanguage.g:4761:1: ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalActionLanguage.g:4762:1: ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 )
            // InternalActionLanguage.g:4762:2: rule__LogicalOrExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__RightExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicalOrExpressionAccess().getRightExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__LogicalAndExpression__Group__0"
    // InternalActionLanguage.g:4778:1: rule__LogicalAndExpression__Group__0 : rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1 ;
    public final void rule__LogicalAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4782:1: ( rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1 )
            // InternalActionLanguage.g:4783:2: rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__LogicalAndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group__0"


    // $ANTLR start "rule__LogicalAndExpression__Group__0__Impl"
    // InternalActionLanguage.g:4790:1: rule__LogicalAndExpression__Group__0__Impl : ( ruleComparisonExpression ) ;
    public final void rule__LogicalAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4794:1: ( ( ruleComparisonExpression ) )
            // InternalActionLanguage.g:4795:1: ( ruleComparisonExpression )
            {
            // InternalActionLanguage.g:4795:1: ( ruleComparisonExpression )
            // InternalActionLanguage.g:4796:1: ruleComparisonExpression
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getLogicalAndExpressionAccess().getComparisonExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group__0__Impl"


    // $ANTLR start "rule__LogicalAndExpression__Group__1"
    // InternalActionLanguage.g:4807:1: rule__LogicalAndExpression__Group__1 : rule__LogicalAndExpression__Group__1__Impl ;
    public final void rule__LogicalAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4811:1: ( rule__LogicalAndExpression__Group__1__Impl )
            // InternalActionLanguage.g:4812:2: rule__LogicalAndExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group__1"


    // $ANTLR start "rule__LogicalAndExpression__Group__1__Impl"
    // InternalActionLanguage.g:4818:1: rule__LogicalAndExpression__Group__1__Impl : ( ( rule__LogicalAndExpression__Group_1__0 )* ) ;
    public final void rule__LogicalAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4822:1: ( ( ( rule__LogicalAndExpression__Group_1__0 )* ) )
            // InternalActionLanguage.g:4823:1: ( ( rule__LogicalAndExpression__Group_1__0 )* )
            {
            // InternalActionLanguage.g:4823:1: ( ( rule__LogicalAndExpression__Group_1__0 )* )
            // InternalActionLanguage.g:4824:1: ( rule__LogicalAndExpression__Group_1__0 )*
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getGroup_1()); 
            // InternalActionLanguage.g:4825:1: ( rule__LogicalAndExpression__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==15) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalActionLanguage.g:4825:2: rule__LogicalAndExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    rule__LogicalAndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getLogicalAndExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group__1__Impl"


    // $ANTLR start "rule__LogicalAndExpression__Group_1__0"
    // InternalActionLanguage.g:4839:1: rule__LogicalAndExpression__Group_1__0 : rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1 ;
    public final void rule__LogicalAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4843:1: ( rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1 )
            // InternalActionLanguage.g:4844:2: rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__LogicalAndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1__0"


    // $ANTLR start "rule__LogicalAndExpression__Group_1__0__Impl"
    // InternalActionLanguage.g:4851:1: rule__LogicalAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4855:1: ( ( () ) )
            // InternalActionLanguage.g:4856:1: ( () )
            {
            // InternalActionLanguage.g:4856:1: ( () )
            // InternalActionLanguage.g:4857:1: ()
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0()); 
            // InternalActionLanguage.g:4858:1: ()
            // InternalActionLanguage.g:4860:1: 
            {
            }

             after(grammarAccess.getLogicalAndExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__LogicalAndExpression__Group_1__1"
    // InternalActionLanguage.g:4870:1: rule__LogicalAndExpression__Group_1__1 : rule__LogicalAndExpression__Group_1__1__Impl rule__LogicalAndExpression__Group_1__2 ;
    public final void rule__LogicalAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4874:1: ( rule__LogicalAndExpression__Group_1__1__Impl rule__LogicalAndExpression__Group_1__2 )
            // InternalActionLanguage.g:4875:2: rule__LogicalAndExpression__Group_1__1__Impl rule__LogicalAndExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__LogicalAndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1__1"


    // $ANTLR start "rule__LogicalAndExpression__Group_1__1__Impl"
    // InternalActionLanguage.g:4882:1: rule__LogicalAndExpression__Group_1__1__Impl : ( ( rule__LogicalAndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__LogicalAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4886:1: ( ( ( rule__LogicalAndExpression__OperatorAssignment_1_1 ) ) )
            // InternalActionLanguage.g:4887:1: ( ( rule__LogicalAndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalActionLanguage.g:4887:1: ( ( rule__LogicalAndExpression__OperatorAssignment_1_1 ) )
            // InternalActionLanguage.g:4888:1: ( rule__LogicalAndExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalActionLanguage.g:4889:1: ( rule__LogicalAndExpression__OperatorAssignment_1_1 )
            // InternalActionLanguage.g:4889:2: rule__LogicalAndExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicalAndExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__LogicalAndExpression__Group_1__2"
    // InternalActionLanguage.g:4899:1: rule__LogicalAndExpression__Group_1__2 : rule__LogicalAndExpression__Group_1__2__Impl ;
    public final void rule__LogicalAndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4903:1: ( rule__LogicalAndExpression__Group_1__2__Impl )
            // InternalActionLanguage.g:4904:2: rule__LogicalAndExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1__2"


    // $ANTLR start "rule__LogicalAndExpression__Group_1__2__Impl"
    // InternalActionLanguage.g:4910:1: rule__LogicalAndExpression__Group_1__2__Impl : ( ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__LogicalAndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4914:1: ( ( ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalActionLanguage.g:4915:1: ( ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalActionLanguage.g:4915:1: ( ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 ) )
            // InternalActionLanguage.g:4916:1: ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalActionLanguage.g:4917:1: ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 )
            // InternalActionLanguage.g:4917:2: rule__LogicalAndExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__RightExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicalAndExpressionAccess().getRightExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__0"
    // InternalActionLanguage.g:4933:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4937:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // InternalActionLanguage.g:4938:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__ComparisonExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0"


    // $ANTLR start "rule__ComparisonExpression__Group__0__Impl"
    // InternalActionLanguage.g:4945:1: rule__ComparisonExpression__Group__0__Impl : ( ruleComparisonHigherOpExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4949:1: ( ( ruleComparisonHigherOpExpression ) )
            // InternalActionLanguage.g:4950:1: ( ruleComparisonHigherOpExpression )
            {
            // InternalActionLanguage.g:4950:1: ( ruleComparisonHigherOpExpression )
            // InternalActionLanguage.g:4951:1: ruleComparisonHigherOpExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getComparisonHigherOpExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleComparisonHigherOpExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getComparisonHigherOpExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__1"
    // InternalActionLanguage.g:4962:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4966:1: ( rule__ComparisonExpression__Group__1__Impl )
            // InternalActionLanguage.g:4967:2: rule__ComparisonExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1"


    // $ANTLR start "rule__ComparisonExpression__Group__1__Impl"
    // InternalActionLanguage.g:4973:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )? ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4977:1: ( ( ( rule__ComparisonExpression__Group_1__0 )? ) )
            // InternalActionLanguage.g:4978:1: ( ( rule__ComparisonExpression__Group_1__0 )? )
            {
            // InternalActionLanguage.g:4978:1: ( ( rule__ComparisonExpression__Group_1__0 )? )
            // InternalActionLanguage.g:4979:1: ( rule__ComparisonExpression__Group_1__0 )?
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            // InternalActionLanguage.g:4980:1: ( rule__ComparisonExpression__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=22 && LA30_0<=23)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalActionLanguage.g:4980:2: rule__ComparisonExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ComparisonExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0"
    // InternalActionLanguage.g:4994:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:4998:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // InternalActionLanguage.g:4999:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__ComparisonExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0__Impl"
    // InternalActionLanguage.g:5006:1: rule__ComparisonExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5010:1: ( ( () ) )
            // InternalActionLanguage.g:5011:1: ( () )
            {
            // InternalActionLanguage.g:5011:1: ( () )
            // InternalActionLanguage.g:5012:1: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0()); 
            // InternalActionLanguage.g:5013:1: ()
            // InternalActionLanguage.g:5015:1: 
            {
            }

             after(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1"
    // InternalActionLanguage.g:5025:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5029:1: ( rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 )
            // InternalActionLanguage.g:5030:2: rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ComparisonExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1__Impl"
    // InternalActionLanguage.g:5037:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5041:1: ( ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) )
            // InternalActionLanguage.g:5042:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            {
            // InternalActionLanguage.g:5042:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            // InternalActionLanguage.g:5043:1: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalActionLanguage.g:5044:1: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            // InternalActionLanguage.g:5044:2: rule__ComparisonExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2"
    // InternalActionLanguage.g:5054:1: rule__ComparisonExpression__Group_1__2 : rule__ComparisonExpression__Group_1__2__Impl ;
    public final void rule__ComparisonExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5058:1: ( rule__ComparisonExpression__Group_1__2__Impl )
            // InternalActionLanguage.g:5059:2: rule__ComparisonExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__2"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2__Impl"
    // InternalActionLanguage.g:5065:1: rule__ComparisonExpression__Group_1__2__Impl : ( ( rule__ComparisonExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__ComparisonExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5069:1: ( ( ( rule__ComparisonExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalActionLanguage.g:5070:1: ( ( rule__ComparisonExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalActionLanguage.g:5070:1: ( ( rule__ComparisonExpression__RightExpressionAssignment_1_2 ) )
            // InternalActionLanguage.g:5071:1: ( rule__ComparisonExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalActionLanguage.g:5072:1: ( rule__ComparisonExpression__RightExpressionAssignment_1_2 )
            // InternalActionLanguage.g:5072:2: rule__ComparisonExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonExpression__RightExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getRightExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ComparisonHigherOpExpression__Group__0"
    // InternalActionLanguage.g:5088:1: rule__ComparisonHigherOpExpression__Group__0 : rule__ComparisonHigherOpExpression__Group__0__Impl rule__ComparisonHigherOpExpression__Group__1 ;
    public final void rule__ComparisonHigherOpExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5092:1: ( rule__ComparisonHigherOpExpression__Group__0__Impl rule__ComparisonHigherOpExpression__Group__1 )
            // InternalActionLanguage.g:5093:2: rule__ComparisonHigherOpExpression__Group__0__Impl rule__ComparisonHigherOpExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__ComparisonHigherOpExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonHigherOpExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__Group__0"


    // $ANTLR start "rule__ComparisonHigherOpExpression__Group__0__Impl"
    // InternalActionLanguage.g:5100:1: rule__ComparisonHigherOpExpression__Group__0__Impl : ( ruleArithmeticExpression ) ;
    public final void rule__ComparisonHigherOpExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5104:1: ( ( ruleArithmeticExpression ) )
            // InternalActionLanguage.g:5105:1: ( ruleArithmeticExpression )
            {
            // InternalActionLanguage.g:5105:1: ( ruleArithmeticExpression )
            // InternalActionLanguage.g:5106:1: ruleArithmeticExpression
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getComparisonHigherOpExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonHigherOpExpression__Group__1"
    // InternalActionLanguage.g:5117:1: rule__ComparisonHigherOpExpression__Group__1 : rule__ComparisonHigherOpExpression__Group__1__Impl ;
    public final void rule__ComparisonHigherOpExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5121:1: ( rule__ComparisonHigherOpExpression__Group__1__Impl )
            // InternalActionLanguage.g:5122:2: rule__ComparisonHigherOpExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonHigherOpExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__Group__1"


    // $ANTLR start "rule__ComparisonHigherOpExpression__Group__1__Impl"
    // InternalActionLanguage.g:5128:1: rule__ComparisonHigherOpExpression__Group__1__Impl : ( ( rule__ComparisonHigherOpExpression__Group_1__0 )? ) ;
    public final void rule__ComparisonHigherOpExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5132:1: ( ( ( rule__ComparisonHigherOpExpression__Group_1__0 )? ) )
            // InternalActionLanguage.g:5133:1: ( ( rule__ComparisonHigherOpExpression__Group_1__0 )? )
            {
            // InternalActionLanguage.g:5133:1: ( ( rule__ComparisonHigherOpExpression__Group_1__0 )? )
            // InternalActionLanguage.g:5134:1: ( rule__ComparisonHigherOpExpression__Group_1__0 )?
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getGroup_1()); 
            // InternalActionLanguage.g:5135:1: ( rule__ComparisonHigherOpExpression__Group_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=24 && LA31_0<=27)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalActionLanguage.g:5135:2: rule__ComparisonHigherOpExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ComparisonHigherOpExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComparisonHigherOpExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonHigherOpExpression__Group_1__0"
    // InternalActionLanguage.g:5149:1: rule__ComparisonHigherOpExpression__Group_1__0 : rule__ComparisonHigherOpExpression__Group_1__0__Impl rule__ComparisonHigherOpExpression__Group_1__1 ;
    public final void rule__ComparisonHigherOpExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5153:1: ( rule__ComparisonHigherOpExpression__Group_1__0__Impl rule__ComparisonHigherOpExpression__Group_1__1 )
            // InternalActionLanguage.g:5154:2: rule__ComparisonHigherOpExpression__Group_1__0__Impl rule__ComparisonHigherOpExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__ComparisonHigherOpExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonHigherOpExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__Group_1__0"


    // $ANTLR start "rule__ComparisonHigherOpExpression__Group_1__0__Impl"
    // InternalActionLanguage.g:5161:1: rule__ComparisonHigherOpExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonHigherOpExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5165:1: ( ( () ) )
            // InternalActionLanguage.g:5166:1: ( () )
            {
            // InternalActionLanguage.g:5166:1: ( () )
            // InternalActionLanguage.g:5167:1: ()
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0()); 
            // InternalActionLanguage.g:5168:1: ()
            // InternalActionLanguage.g:5170:1: 
            {
            }

             after(grammarAccess.getComparisonHigherOpExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisonHigherOpExpression__Group_1__1"
    // InternalActionLanguage.g:5180:1: rule__ComparisonHigherOpExpression__Group_1__1 : rule__ComparisonHigherOpExpression__Group_1__1__Impl rule__ComparisonHigherOpExpression__Group_1__2 ;
    public final void rule__ComparisonHigherOpExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5184:1: ( rule__ComparisonHigherOpExpression__Group_1__1__Impl rule__ComparisonHigherOpExpression__Group_1__2 )
            // InternalActionLanguage.g:5185:2: rule__ComparisonHigherOpExpression__Group_1__1__Impl rule__ComparisonHigherOpExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ComparisonHigherOpExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonHigherOpExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__Group_1__1"


    // $ANTLR start "rule__ComparisonHigherOpExpression__Group_1__1__Impl"
    // InternalActionLanguage.g:5192:1: rule__ComparisonHigherOpExpression__Group_1__1__Impl : ( ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonHigherOpExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5196:1: ( ( ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 ) ) )
            // InternalActionLanguage.g:5197:1: ( ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 ) )
            {
            // InternalActionLanguage.g:5197:1: ( ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 ) )
            // InternalActionLanguage.g:5198:1: ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalActionLanguage.g:5199:1: ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 )
            // InternalActionLanguage.g:5199:2: rule__ComparisonHigherOpExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonHigherOpExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonHigherOpExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisonHigherOpExpression__Group_1__2"
    // InternalActionLanguage.g:5209:1: rule__ComparisonHigherOpExpression__Group_1__2 : rule__ComparisonHigherOpExpression__Group_1__2__Impl ;
    public final void rule__ComparisonHigherOpExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5213:1: ( rule__ComparisonHigherOpExpression__Group_1__2__Impl )
            // InternalActionLanguage.g:5214:2: rule__ComparisonHigherOpExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonHigherOpExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__Group_1__2"


    // $ANTLR start "rule__ComparisonHigherOpExpression__Group_1__2__Impl"
    // InternalActionLanguage.g:5220:1: rule__ComparisonHigherOpExpression__Group_1__2__Impl : ( ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__ComparisonHigherOpExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5224:1: ( ( ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalActionLanguage.g:5225:1: ( ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalActionLanguage.g:5225:1: ( ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 ) )
            // InternalActionLanguage.g:5226:1: ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalActionLanguage.g:5227:1: ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 )
            // InternalActionLanguage.g:5227:2: rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonHigherOpExpressionAccess().getRightExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AdditionExpression__Group__0"
    // InternalActionLanguage.g:5243:1: rule__AdditionExpression__Group__0 : rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 ;
    public final void rule__AdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5247:1: ( rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 )
            // InternalActionLanguage.g:5248:2: rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__AdditionExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditionExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__0"


    // $ANTLR start "rule__AdditionExpression__Group__0__Impl"
    // InternalActionLanguage.g:5255:1: rule__AdditionExpression__Group__0__Impl : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5259:1: ( ( ruleMultiplicationExpression ) )
            // InternalActionLanguage.g:5260:1: ( ruleMultiplicationExpression )
            {
            // InternalActionLanguage.g:5260:1: ( ruleMultiplicationExpression )
            // InternalActionLanguage.g:5261:1: ruleMultiplicationExpression
            {
             before(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__0__Impl"


    // $ANTLR start "rule__AdditionExpression__Group__1"
    // InternalActionLanguage.g:5272:1: rule__AdditionExpression__Group__1 : rule__AdditionExpression__Group__1__Impl ;
    public final void rule__AdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5276:1: ( rule__AdditionExpression__Group__1__Impl )
            // InternalActionLanguage.g:5277:2: rule__AdditionExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditionExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__1"


    // $ANTLR start "rule__AdditionExpression__Group__1__Impl"
    // InternalActionLanguage.g:5283:1: rule__AdditionExpression__Group__1__Impl : ( ( rule__AdditionExpression__Group_1__0 )* ) ;
    public final void rule__AdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5287:1: ( ( ( rule__AdditionExpression__Group_1__0 )* ) )
            // InternalActionLanguage.g:5288:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            {
            // InternalActionLanguage.g:5288:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            // InternalActionLanguage.g:5289:1: ( rule__AdditionExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 
            // InternalActionLanguage.g:5290:1: ( rule__AdditionExpression__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=28 && LA32_0<=29)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalActionLanguage.g:5290:2: rule__AdditionExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_33);
            	    rule__AdditionExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__1__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1__0"
    // InternalActionLanguage.g:5304:1: rule__AdditionExpression__Group_1__0 : rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 ;
    public final void rule__AdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5308:1: ( rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 )
            // InternalActionLanguage.g:5309:2: rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__AdditionExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditionExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__0"


    // $ANTLR start "rule__AdditionExpression__Group_1__0__Impl"
    // InternalActionLanguage.g:5316:1: rule__AdditionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5320:1: ( ( () ) )
            // InternalActionLanguage.g:5321:1: ( () )
            {
            // InternalActionLanguage.g:5321:1: ( () )
            // InternalActionLanguage.g:5322:1: ()
            {
             before(grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0()); 
            // InternalActionLanguage.g:5323:1: ()
            // InternalActionLanguage.g:5325:1: 
            {
            }

             after(grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1__1"
    // InternalActionLanguage.g:5335:1: rule__AdditionExpression__Group_1__1 : rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 ;
    public final void rule__AdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5339:1: ( rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 )
            // InternalActionLanguage.g:5340:2: rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__AdditionExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditionExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__1"


    // $ANTLR start "rule__AdditionExpression__Group_1__1__Impl"
    // InternalActionLanguage.g:5347:1: rule__AdditionExpression__Group_1__1__Impl : ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5351:1: ( ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) )
            // InternalActionLanguage.g:5352:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            {
            // InternalActionLanguage.g:5352:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            // InternalActionLanguage.g:5353:1: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalActionLanguage.g:5354:1: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            // InternalActionLanguage.g:5354:2: rule__AdditionExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditionExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1__2"
    // InternalActionLanguage.g:5364:1: rule__AdditionExpression__Group_1__2 : rule__AdditionExpression__Group_1__2__Impl ;
    public final void rule__AdditionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5368:1: ( rule__AdditionExpression__Group_1__2__Impl )
            // InternalActionLanguage.g:5369:2: rule__AdditionExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditionExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__2"


    // $ANTLR start "rule__AdditionExpression__Group_1__2__Impl"
    // InternalActionLanguage.g:5375:1: rule__AdditionExpression__Group_1__2__Impl : ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__AdditionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5379:1: ( ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalActionLanguage.g:5380:1: ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalActionLanguage.g:5380:1: ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) )
            // InternalActionLanguage.g:5381:1: ( rule__AdditionExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalActionLanguage.g:5382:1: ( rule__AdditionExpression__RightExpressionAssignment_1_2 )
            // InternalActionLanguage.g:5382:2: rule__AdditionExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditionExpression__RightExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionExpressionAccess().getRightExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__2__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__0"
    // InternalActionLanguage.g:5398:1: rule__MultiplicationExpression__Group_1__0 : rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 ;
    public final void rule__MultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5402:1: ( rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 )
            // InternalActionLanguage.g:5403:2: rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__MultiplicationExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicationExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__0"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__0__Impl"
    // InternalActionLanguage.g:5410:1: rule__MultiplicationExpression__Group_1__0__Impl : ( ruleTypeCastExpression ) ;
    public final void rule__MultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5414:1: ( ( ruleTypeCastExpression ) )
            // InternalActionLanguage.g:5415:1: ( ruleTypeCastExpression )
            {
            // InternalActionLanguage.g:5415:1: ( ruleTypeCastExpression )
            // InternalActionLanguage.g:5416:1: ruleTypeCastExpression
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getTypeCastExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeCastExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionAccess().getTypeCastExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__1"
    // InternalActionLanguage.g:5427:1: rule__MultiplicationExpression__Group_1__1 : rule__MultiplicationExpression__Group_1__1__Impl ;
    public final void rule__MultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5431:1: ( rule__MultiplicationExpression__Group_1__1__Impl )
            // InternalActionLanguage.g:5432:2: rule__MultiplicationExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicationExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__1"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__1__Impl"
    // InternalActionLanguage.g:5438:1: rule__MultiplicationExpression__Group_1__1__Impl : ( ( rule__MultiplicationExpression__Group_1_1__0 )* ) ;
    public final void rule__MultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5442:1: ( ( ( rule__MultiplicationExpression__Group_1_1__0 )* ) )
            // InternalActionLanguage.g:5443:1: ( ( rule__MultiplicationExpression__Group_1_1__0 )* )
            {
            // InternalActionLanguage.g:5443:1: ( ( rule__MultiplicationExpression__Group_1_1__0 )* )
            // InternalActionLanguage.g:5444:1: ( rule__MultiplicationExpression__Group_1_1__0 )*
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1_1()); 
            // InternalActionLanguage.g:5445:1: ( rule__MultiplicationExpression__Group_1_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=30 && LA33_0<=32)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalActionLanguage.g:5445:2: rule__MultiplicationExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_35);
            	    rule__MultiplicationExpression__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getMultiplicationExpressionAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_1__0"
    // InternalActionLanguage.g:5459:1: rule__MultiplicationExpression__Group_1_1__0 : rule__MultiplicationExpression__Group_1_1__0__Impl rule__MultiplicationExpression__Group_1_1__1 ;
    public final void rule__MultiplicationExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5463:1: ( rule__MultiplicationExpression__Group_1_1__0__Impl rule__MultiplicationExpression__Group_1_1__1 )
            // InternalActionLanguage.g:5464:2: rule__MultiplicationExpression__Group_1_1__0__Impl rule__MultiplicationExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__MultiplicationExpression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicationExpression__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1_1__0"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_1__0__Impl"
    // InternalActionLanguage.g:5471:1: rule__MultiplicationExpression__Group_1_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5475:1: ( ( () ) )
            // InternalActionLanguage.g:5476:1: ( () )
            {
            // InternalActionLanguage.g:5476:1: ( () )
            // InternalActionLanguage.g:5477:1: ()
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_1_0()); 
            // InternalActionLanguage.g:5478:1: ()
            // InternalActionLanguage.g:5480:1: 
            {
            }

             after(grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_1__1"
    // InternalActionLanguage.g:5490:1: rule__MultiplicationExpression__Group_1_1__1 : rule__MultiplicationExpression__Group_1_1__1__Impl rule__MultiplicationExpression__Group_1_1__2 ;
    public final void rule__MultiplicationExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5494:1: ( rule__MultiplicationExpression__Group_1_1__1__Impl rule__MultiplicationExpression__Group_1_1__2 )
            // InternalActionLanguage.g:5495:2: rule__MultiplicationExpression__Group_1_1__1__Impl rule__MultiplicationExpression__Group_1_1__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__MultiplicationExpression__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicationExpression__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1_1__1"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_1__1__Impl"
    // InternalActionLanguage.g:5502:1: rule__MultiplicationExpression__Group_1_1__1__Impl : ( ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 ) ) ;
    public final void rule__MultiplicationExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5506:1: ( ( ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 ) ) )
            // InternalActionLanguage.g:5507:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 ) )
            {
            // InternalActionLanguage.g:5507:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 ) )
            // InternalActionLanguage.g:5508:1: ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1_1()); 
            // InternalActionLanguage.g:5509:1: ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 )
            // InternalActionLanguage.g:5509:2: rule__MultiplicationExpression__OperatorAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicationExpression__OperatorAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_1__2"
    // InternalActionLanguage.g:5519:1: rule__MultiplicationExpression__Group_1_1__2 : rule__MultiplicationExpression__Group_1_1__2__Impl ;
    public final void rule__MultiplicationExpression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5523:1: ( rule__MultiplicationExpression__Group_1_1__2__Impl )
            // InternalActionLanguage.g:5524:2: rule__MultiplicationExpression__Group_1_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicationExpression__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1_1__2"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_1__2__Impl"
    // InternalActionLanguage.g:5530:1: rule__MultiplicationExpression__Group_1_1__2__Impl : ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 ) ) ;
    public final void rule__MultiplicationExpression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5534:1: ( ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 ) ) )
            // InternalActionLanguage.g:5535:1: ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 ) )
            {
            // InternalActionLanguage.g:5535:1: ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 ) )
            // InternalActionLanguage.g:5536:1: ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAssignment_1_1_2()); 
            // InternalActionLanguage.g:5537:1: ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 )
            // InternalActionLanguage.g:5537:2: rule__MultiplicationExpression__RightExpressionAssignment_1_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicationExpression__RightExpressionAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1_1__2__Impl"


    // $ANTLR start "rule__UnaryPreExpression__Group__0"
    // InternalActionLanguage.g:5553:1: rule__UnaryPreExpression__Group__0 : rule__UnaryPreExpression__Group__0__Impl rule__UnaryPreExpression__Group__1 ;
    public final void rule__UnaryPreExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5557:1: ( rule__UnaryPreExpression__Group__0__Impl rule__UnaryPreExpression__Group__1 )
            // InternalActionLanguage.g:5558:2: rule__UnaryPreExpression__Group__0__Impl rule__UnaryPreExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__UnaryPreExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryPreExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryPreExpression__Group__0"


    // $ANTLR start "rule__UnaryPreExpression__Group__0__Impl"
    // InternalActionLanguage.g:5565:1: rule__UnaryPreExpression__Group__0__Impl : ( () ) ;
    public final void rule__UnaryPreExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5569:1: ( ( () ) )
            // InternalActionLanguage.g:5570:1: ( () )
            {
            // InternalActionLanguage.g:5570:1: ( () )
            // InternalActionLanguage.g:5571:1: ()
            {
             before(grammarAccess.getUnaryPreExpressionAccess().getUnaryExpressionAction_0()); 
            // InternalActionLanguage.g:5572:1: ()
            // InternalActionLanguage.g:5574:1: 
            {
            }

             after(grammarAccess.getUnaryPreExpressionAccess().getUnaryExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryPreExpression__Group__0__Impl"


    // $ANTLR start "rule__UnaryPreExpression__Group__1"
    // InternalActionLanguage.g:5584:1: rule__UnaryPreExpression__Group__1 : rule__UnaryPreExpression__Group__1__Impl rule__UnaryPreExpression__Group__2 ;
    public final void rule__UnaryPreExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5588:1: ( rule__UnaryPreExpression__Group__1__Impl rule__UnaryPreExpression__Group__2 )
            // InternalActionLanguage.g:5589:2: rule__UnaryPreExpression__Group__1__Impl rule__UnaryPreExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__UnaryPreExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryPreExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryPreExpression__Group__1"


    // $ANTLR start "rule__UnaryPreExpression__Group__1__Impl"
    // InternalActionLanguage.g:5596:1: rule__UnaryPreExpression__Group__1__Impl : ( ( rule__UnaryPreExpression__OperatorAssignment_1 ) ) ;
    public final void rule__UnaryPreExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5600:1: ( ( ( rule__UnaryPreExpression__OperatorAssignment_1 ) ) )
            // InternalActionLanguage.g:5601:1: ( ( rule__UnaryPreExpression__OperatorAssignment_1 ) )
            {
            // InternalActionLanguage.g:5601:1: ( ( rule__UnaryPreExpression__OperatorAssignment_1 ) )
            // InternalActionLanguage.g:5602:1: ( rule__UnaryPreExpression__OperatorAssignment_1 )
            {
             before(grammarAccess.getUnaryPreExpressionAccess().getOperatorAssignment_1()); 
            // InternalActionLanguage.g:5603:1: ( rule__UnaryPreExpression__OperatorAssignment_1 )
            // InternalActionLanguage.g:5603:2: rule__UnaryPreExpression__OperatorAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryPreExpression__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryPreExpressionAccess().getOperatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryPreExpression__Group__1__Impl"


    // $ANTLR start "rule__UnaryPreExpression__Group__2"
    // InternalActionLanguage.g:5613:1: rule__UnaryPreExpression__Group__2 : rule__UnaryPreExpression__Group__2__Impl ;
    public final void rule__UnaryPreExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5617:1: ( rule__UnaryPreExpression__Group__2__Impl )
            // InternalActionLanguage.g:5618:2: rule__UnaryPreExpression__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryPreExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryPreExpression__Group__2"


    // $ANTLR start "rule__UnaryPreExpression__Group__2__Impl"
    // InternalActionLanguage.g:5624:1: rule__UnaryPreExpression__Group__2__Impl : ( ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 ) ) ;
    public final void rule__UnaryPreExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5628:1: ( ( ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 ) ) )
            // InternalActionLanguage.g:5629:1: ( ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 ) )
            {
            // InternalActionLanguage.g:5629:1: ( ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 ) )
            // InternalActionLanguage.g:5630:1: ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 )
            {
             before(grammarAccess.getUnaryPreExpressionAccess().getEnclosedExpressionAssignment_2()); 
            // InternalActionLanguage.g:5631:1: ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 )
            // InternalActionLanguage.g:5631:2: rule__UnaryPreExpression__EnclosedExpressionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryPreExpression__EnclosedExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryPreExpressionAccess().getEnclosedExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryPreExpression__Group__2__Impl"


    // $ANTLR start "rule__TypeCastExpression__Group_1__0"
    // InternalActionLanguage.g:5647:1: rule__TypeCastExpression__Group_1__0 : rule__TypeCastExpression__Group_1__0__Impl rule__TypeCastExpression__Group_1__1 ;
    public final void rule__TypeCastExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5651:1: ( rule__TypeCastExpression__Group_1__0__Impl rule__TypeCastExpression__Group_1__1 )
            // InternalActionLanguage.g:5652:2: rule__TypeCastExpression__Group_1__0__Impl rule__TypeCastExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__TypeCastExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeCastExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__Group_1__0"


    // $ANTLR start "rule__TypeCastExpression__Group_1__0__Impl"
    // InternalActionLanguage.g:5659:1: rule__TypeCastExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TypeCastExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5663:1: ( ( () ) )
            // InternalActionLanguage.g:5664:1: ( () )
            {
            // InternalActionLanguage.g:5664:1: ( () )
            // InternalActionLanguage.g:5665:1: ()
            {
             before(grammarAccess.getTypeCastExpressionAccess().getTypeCastExpressionAction_1_0()); 
            // InternalActionLanguage.g:5666:1: ()
            // InternalActionLanguage.g:5668:1: 
            {
            }

             after(grammarAccess.getTypeCastExpressionAccess().getTypeCastExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__Group_1__0__Impl"


    // $ANTLR start "rule__TypeCastExpression__Group_1__1"
    // InternalActionLanguage.g:5678:1: rule__TypeCastExpression__Group_1__1 : rule__TypeCastExpression__Group_1__1__Impl rule__TypeCastExpression__Group_1__2 ;
    public final void rule__TypeCastExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5682:1: ( rule__TypeCastExpression__Group_1__1__Impl rule__TypeCastExpression__Group_1__2 )
            // InternalActionLanguage.g:5683:2: rule__TypeCastExpression__Group_1__1__Impl rule__TypeCastExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TypeCastExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeCastExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__Group_1__1"


    // $ANTLR start "rule__TypeCastExpression__Group_1__1__Impl"
    // InternalActionLanguage.g:5690:1: rule__TypeCastExpression__Group_1__1__Impl : ( '(' ) ;
    public final void rule__TypeCastExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5694:1: ( ( '(' ) )
            // InternalActionLanguage.g:5695:1: ( '(' )
            {
            // InternalActionLanguage.g:5695:1: ( '(' )
            // InternalActionLanguage.g:5696:1: '('
            {
             before(grammarAccess.getTypeCastExpressionAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,42,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTypeCastExpressionAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TypeCastExpression__Group_1__2"
    // InternalActionLanguage.g:5709:1: rule__TypeCastExpression__Group_1__2 : rule__TypeCastExpression__Group_1__2__Impl rule__TypeCastExpression__Group_1__3 ;
    public final void rule__TypeCastExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5713:1: ( rule__TypeCastExpression__Group_1__2__Impl rule__TypeCastExpression__Group_1__3 )
            // InternalActionLanguage.g:5714:2: rule__TypeCastExpression__Group_1__2__Impl rule__TypeCastExpression__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__TypeCastExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeCastExpression__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__Group_1__2"


    // $ANTLR start "rule__TypeCastExpression__Group_1__2__Impl"
    // InternalActionLanguage.g:5721:1: rule__TypeCastExpression__Group_1__2__Impl : ( ( rule__TypeCastExpression__DataTypeAssignment_1_2 ) ) ;
    public final void rule__TypeCastExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5725:1: ( ( ( rule__TypeCastExpression__DataTypeAssignment_1_2 ) ) )
            // InternalActionLanguage.g:5726:1: ( ( rule__TypeCastExpression__DataTypeAssignment_1_2 ) )
            {
            // InternalActionLanguage.g:5726:1: ( ( rule__TypeCastExpression__DataTypeAssignment_1_2 ) )
            // InternalActionLanguage.g:5727:1: ( rule__TypeCastExpression__DataTypeAssignment_1_2 )
            {
             before(grammarAccess.getTypeCastExpressionAccess().getDataTypeAssignment_1_2()); 
            // InternalActionLanguage.g:5728:1: ( rule__TypeCastExpression__DataTypeAssignment_1_2 )
            // InternalActionLanguage.g:5728:2: rule__TypeCastExpression__DataTypeAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeCastExpression__DataTypeAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeCastExpressionAccess().getDataTypeAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__Group_1__2__Impl"


    // $ANTLR start "rule__TypeCastExpression__Group_1__3"
    // InternalActionLanguage.g:5738:1: rule__TypeCastExpression__Group_1__3 : rule__TypeCastExpression__Group_1__3__Impl rule__TypeCastExpression__Group_1__4 ;
    public final void rule__TypeCastExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5742:1: ( rule__TypeCastExpression__Group_1__3__Impl rule__TypeCastExpression__Group_1__4 )
            // InternalActionLanguage.g:5743:2: rule__TypeCastExpression__Group_1__3__Impl rule__TypeCastExpression__Group_1__4
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__TypeCastExpression__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeCastExpression__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__Group_1__3"


    // $ANTLR start "rule__TypeCastExpression__Group_1__3__Impl"
    // InternalActionLanguage.g:5750:1: rule__TypeCastExpression__Group_1__3__Impl : ( ')' ) ;
    public final void rule__TypeCastExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5754:1: ( ( ')' ) )
            // InternalActionLanguage.g:5755:1: ( ')' )
            {
            // InternalActionLanguage.g:5755:1: ( ')' )
            // InternalActionLanguage.g:5756:1: ')'
            {
             before(grammarAccess.getTypeCastExpressionAccess().getRightParenthesisKeyword_1_3()); 
            match(input,44,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTypeCastExpressionAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__Group_1__3__Impl"


    // $ANTLR start "rule__TypeCastExpression__Group_1__4"
    // InternalActionLanguage.g:5769:1: rule__TypeCastExpression__Group_1__4 : rule__TypeCastExpression__Group_1__4__Impl ;
    public final void rule__TypeCastExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5773:1: ( rule__TypeCastExpression__Group_1__4__Impl )
            // InternalActionLanguage.g:5774:2: rule__TypeCastExpression__Group_1__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeCastExpression__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__Group_1__4"


    // $ANTLR start "rule__TypeCastExpression__Group_1__4__Impl"
    // InternalActionLanguage.g:5780:1: rule__TypeCastExpression__Group_1__4__Impl : ( ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 ) ) ;
    public final void rule__TypeCastExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5784:1: ( ( ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 ) ) )
            // InternalActionLanguage.g:5785:1: ( ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 ) )
            {
            // InternalActionLanguage.g:5785:1: ( ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 ) )
            // InternalActionLanguage.g:5786:1: ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 )
            {
             before(grammarAccess.getTypeCastExpressionAccess().getEnclosedExpressionAssignment_1_4()); 
            // InternalActionLanguage.g:5787:1: ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 )
            // InternalActionLanguage.g:5787:2: rule__TypeCastExpression__EnclosedExpressionAssignment_1_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeCastExpression__EnclosedExpressionAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getTypeCastExpressionAccess().getEnclosedExpressionAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__Group_1__4__Impl"


    // $ANTLR start "rule__Operand__Group_0__0"
    // InternalActionLanguage.g:5807:1: rule__Operand__Group_0__0 : rule__Operand__Group_0__0__Impl rule__Operand__Group_0__1 ;
    public final void rule__Operand__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5811:1: ( rule__Operand__Group_0__0__Impl rule__Operand__Group_0__1 )
            // InternalActionLanguage.g:5812:2: rule__Operand__Group_0__0__Impl rule__Operand__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__Operand__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Operand__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__Group_0__0"


    // $ANTLR start "rule__Operand__Group_0__0__Impl"
    // InternalActionLanguage.g:5819:1: rule__Operand__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Operand__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5823:1: ( ( '(' ) )
            // InternalActionLanguage.g:5824:1: ( '(' )
            {
            // InternalActionLanguage.g:5824:1: ( '(' )
            // InternalActionLanguage.g:5825:1: '('
            {
             before(grammarAccess.getOperandAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,42,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOperandAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__Group_0__0__Impl"


    // $ANTLR start "rule__Operand__Group_0__1"
    // InternalActionLanguage.g:5838:1: rule__Operand__Group_0__1 : rule__Operand__Group_0__1__Impl rule__Operand__Group_0__2 ;
    public final void rule__Operand__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5842:1: ( rule__Operand__Group_0__1__Impl rule__Operand__Group_0__2 )
            // InternalActionLanguage.g:5843:2: rule__Operand__Group_0__1__Impl rule__Operand__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Operand__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Operand__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__Group_0__1"


    // $ANTLR start "rule__Operand__Group_0__1__Impl"
    // InternalActionLanguage.g:5850:1: rule__Operand__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Operand__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5854:1: ( ( ruleExpression ) )
            // InternalActionLanguage.g:5855:1: ( ruleExpression )
            {
            // InternalActionLanguage.g:5855:1: ( ruleExpression )
            // InternalActionLanguage.g:5856:1: ruleExpression
            {
             before(grammarAccess.getOperandAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getOperandAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__Group_0__1__Impl"


    // $ANTLR start "rule__Operand__Group_0__2"
    // InternalActionLanguage.g:5867:1: rule__Operand__Group_0__2 : rule__Operand__Group_0__2__Impl ;
    public final void rule__Operand__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5871:1: ( rule__Operand__Group_0__2__Impl )
            // InternalActionLanguage.g:5872:2: rule__Operand__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Operand__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__Group_0__2"


    // $ANTLR start "rule__Operand__Group_0__2__Impl"
    // InternalActionLanguage.g:5878:1: rule__Operand__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Operand__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5882:1: ( ( ')' ) )
            // InternalActionLanguage.g:5883:1: ( ')' )
            {
            // InternalActionLanguage.g:5883:1: ( ')' )
            // InternalActionLanguage.g:5884:1: ')'
            {
             before(grammarAccess.getOperandAccess().getRightParenthesisKeyword_0_2()); 
            match(input,44,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOperandAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__Group_0__2__Impl"


    // $ANTLR start "rule__LiteralExpression__Group__0"
    // InternalActionLanguage.g:5903:1: rule__LiteralExpression__Group__0 : rule__LiteralExpression__Group__0__Impl rule__LiteralExpression__Group__1 ;
    public final void rule__LiteralExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5907:1: ( rule__LiteralExpression__Group__0__Impl rule__LiteralExpression__Group__1 )
            // InternalActionLanguage.g:5908:2: rule__LiteralExpression__Group__0__Impl rule__LiteralExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__LiteralExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group__0"


    // $ANTLR start "rule__LiteralExpression__Group__0__Impl"
    // InternalActionLanguage.g:5915:1: rule__LiteralExpression__Group__0__Impl : ( () ) ;
    public final void rule__LiteralExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5919:1: ( ( () ) )
            // InternalActionLanguage.g:5920:1: ( () )
            {
            // InternalActionLanguage.g:5920:1: ( () )
            // InternalActionLanguage.g:5921:1: ()
            {
             before(grammarAccess.getLiteralExpressionAccess().getLiteralExpressionAction_0()); 
            // InternalActionLanguage.g:5922:1: ()
            // InternalActionLanguage.g:5924:1: 
            {
            }

             after(grammarAccess.getLiteralExpressionAccess().getLiteralExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group__0__Impl"


    // $ANTLR start "rule__LiteralExpression__Group__1"
    // InternalActionLanguage.g:5934:1: rule__LiteralExpression__Group__1 : rule__LiteralExpression__Group__1__Impl ;
    public final void rule__LiteralExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5938:1: ( rule__LiteralExpression__Group__1__Impl )
            // InternalActionLanguage.g:5939:2: rule__LiteralExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group__1"


    // $ANTLR start "rule__LiteralExpression__Group__1__Impl"
    // InternalActionLanguage.g:5945:1: rule__LiteralExpression__Group__1__Impl : ( ( rule__LiteralExpression__ValueAssignment_1 ) ) ;
    public final void rule__LiteralExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5949:1: ( ( ( rule__LiteralExpression__ValueAssignment_1 ) ) )
            // InternalActionLanguage.g:5950:1: ( ( rule__LiteralExpression__ValueAssignment_1 ) )
            {
            // InternalActionLanguage.g:5950:1: ( ( rule__LiteralExpression__ValueAssignment_1 ) )
            // InternalActionLanguage.g:5951:1: ( rule__LiteralExpression__ValueAssignment_1 )
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueAssignment_1()); 
            // InternalActionLanguage.g:5952:1: ( rule__LiteralExpression__ValueAssignment_1 )
            // InternalActionLanguage.g:5952:2: rule__LiteralExpression__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralExpressionAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group__1__Impl"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group__0"
    // InternalActionLanguage.g:5966:1: rule__ExtendedTypedNamedElementExpression__Group__0 : rule__ExtendedTypedNamedElementExpression__Group__0__Impl rule__ExtendedTypedNamedElementExpression__Group__1 ;
    public final void rule__ExtendedTypedNamedElementExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5970:1: ( rule__ExtendedTypedNamedElementExpression__Group__0__Impl rule__ExtendedTypedNamedElementExpression__Group__1 )
            // InternalActionLanguage.g:5971:2: rule__ExtendedTypedNamedElementExpression__Group__0__Impl rule__ExtendedTypedNamedElementExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__ExtendedTypedNamedElementExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedTypedNamedElementExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group__0"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group__0__Impl"
    // InternalActionLanguage.g:5978:1: rule__ExtendedTypedNamedElementExpression__Group__0__Impl : ( ruleTypedNamedElementExpression ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5982:1: ( ( ruleTypedNamedElementExpression ) )
            // InternalActionLanguage.g:5983:1: ( ruleTypedNamedElementExpression )
            {
            // InternalActionLanguage.g:5983:1: ( ruleTypedNamedElementExpression )
            // InternalActionLanguage.g:5984:1: ruleTypedNamedElementExpression
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getTypedNamedElementExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypedNamedElementExpression();

            state._fsp--;

             after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getTypedNamedElementExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group__0__Impl"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group__1"
    // InternalActionLanguage.g:5995:1: rule__ExtendedTypedNamedElementExpression__Group__1 : rule__ExtendedTypedNamedElementExpression__Group__1__Impl ;
    public final void rule__ExtendedTypedNamedElementExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:5999:1: ( rule__ExtendedTypedNamedElementExpression__Group__1__Impl )
            // InternalActionLanguage.g:6000:2: rule__ExtendedTypedNamedElementExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedTypedNamedElementExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group__1"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group__1__Impl"
    // InternalActionLanguage.g:6006:1: rule__ExtendedTypedNamedElementExpression__Group__1__Impl : ( ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )? ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6010:1: ( ( ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )? ) )
            // InternalActionLanguage.g:6011:1: ( ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )? )
            {
            // InternalActionLanguage.g:6011:1: ( ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )? )
            // InternalActionLanguage.g:6012:1: ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )?
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getAlternatives_1()); 
            // InternalActionLanguage.g:6013:1: ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=17 && LA34_0<=18)||LA34_0==55) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalActionLanguage.g:6013:2: rule__ExtendedTypedNamedElementExpression__Alternatives_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ExtendedTypedNamedElementExpression__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group__1__Impl"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group_1_0__0"
    // InternalActionLanguage.g:6027:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__0 : rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__1 ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6031:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__1 )
            // InternalActionLanguage.g:6032:2: rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedTypedNamedElementExpression__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group_1_0__0"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl"
    // InternalActionLanguage.g:6039:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6043:1: ( ( () ) )
            // InternalActionLanguage.g:6044:1: ( () )
            {
            // InternalActionLanguage.g:6044:1: ( () )
            // InternalActionLanguage.g:6045:1: ()
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getDiscreteInteractionEndpointReferenceTypedNamedElementExpressionAction_1_0_0()); 
            // InternalActionLanguage.g:6046:1: ()
            // InternalActionLanguage.g:6048:1: 
            {
            }

             after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getDiscreteInteractionEndpointReferenceTypedNamedElementExpressionAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group_1_0__1"
    // InternalActionLanguage.g:6058:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__1 : rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__2 ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6062:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__2 )
            // InternalActionLanguage.g:6063:2: rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedTypedNamedElementExpression__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group_1_0__1"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl"
    // InternalActionLanguage.g:6070:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl : ( '->' ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6074:1: ( ( '->' ) )
            // InternalActionLanguage.g:6075:1: ( '->' )
            {
            // InternalActionLanguage.g:6075:1: ( '->' )
            // InternalActionLanguage.g:6076:1: '->'
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_0_1()); 
            match(input,55,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group_1_0__2"
    // InternalActionLanguage.g:6089:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__2 : rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6093:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl )
            // InternalActionLanguage.g:6094:2: rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group_1_0__2"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl"
    // InternalActionLanguage.g:6100:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl : ( ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 ) ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6104:1: ( ( ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 ) ) )
            // InternalActionLanguage.g:6105:1: ( ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 ) )
            {
            // InternalActionLanguage.g:6105:1: ( ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 ) )
            // InternalActionLanguage.g:6106:1: ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 )
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getPositionAssignment_1_0_2()); 
            // InternalActionLanguage.g:6107:1: ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 )
            // InternalActionLanguage.g:6107:2: rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getPositionAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group_1_1__0"
    // InternalActionLanguage.g:6123:1: rule__ExtendedTypedNamedElementExpression__Group_1_1__0 : rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_1__1 ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6127:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_1__1 )
            // InternalActionLanguage.g:6128:2: rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_39);
            rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedTypedNamedElementExpression__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group_1_1__0"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl"
    // InternalActionLanguage.g:6135:1: rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6139:1: ( ( () ) )
            // InternalActionLanguage.g:6140:1: ( () )
            {
            // InternalActionLanguage.g:6140:1: ( () )
            // InternalActionLanguage.g:6141:1: ()
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getAssignmentLhs_typedNamedElementExpressionAction_1_1_0()); 
            // InternalActionLanguage.g:6142:1: ()
            // InternalActionLanguage.g:6144:1: 
            {
            }

             after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getAssignmentLhs_typedNamedElementExpressionAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group_1_1__1"
    // InternalActionLanguage.g:6154:1: rule__ExtendedTypedNamedElementExpression__Group_1_1__1 : rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6158:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl )
            // InternalActionLanguage.g:6159:2: rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group_1_1__1"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl"
    // InternalActionLanguage.g:6165:1: rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl : ( ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 ) ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6169:1: ( ( ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 ) ) )
            // InternalActionLanguage.g:6170:1: ( ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 ) )
            {
            // InternalActionLanguage.g:6170:1: ( ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 ) )
            // InternalActionLanguage.g:6171:1: ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 )
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getIncrementDecrementOperatorAssignment_1_1_1()); 
            // InternalActionLanguage.g:6172:1: ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 )
            // InternalActionLanguage.g:6172:2: rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getIncrementDecrementOperatorAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__TypedNamedElementExpression__Group__0"
    // InternalActionLanguage.g:6186:1: rule__TypedNamedElementExpression__Group__0 : rule__TypedNamedElementExpression__Group__0__Impl rule__TypedNamedElementExpression__Group__1 ;
    public final void rule__TypedNamedElementExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6190:1: ( rule__TypedNamedElementExpression__Group__0__Impl rule__TypedNamedElementExpression__Group__1 )
            // InternalActionLanguage.g:6191:2: rule__TypedNamedElementExpression__Group__0__Impl rule__TypedNamedElementExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_41);
            rule__TypedNamedElementExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedNamedElementExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedNamedElementExpression__Group__0"


    // $ANTLR start "rule__TypedNamedElementExpression__Group__0__Impl"
    // InternalActionLanguage.g:6198:1: rule__TypedNamedElementExpression__Group__0__Impl : ( ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 ) ) ;
    public final void rule__TypedNamedElementExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6202:1: ( ( ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 ) ) )
            // InternalActionLanguage.g:6203:1: ( ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 ) )
            {
            // InternalActionLanguage.g:6203:1: ( ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 ) )
            // InternalActionLanguage.g:6204:1: ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 )
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementAssignment_0()); 
            // InternalActionLanguage.g:6205:1: ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 )
            // InternalActionLanguage.g:6205:2: rule__TypedNamedElementExpression__TypedNamedElementAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedNamedElementExpression__TypedNamedElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedNamedElementExpression__Group__0__Impl"


    // $ANTLR start "rule__TypedNamedElementExpression__Group__1"
    // InternalActionLanguage.g:6215:1: rule__TypedNamedElementExpression__Group__1 : rule__TypedNamedElementExpression__Group__1__Impl ;
    public final void rule__TypedNamedElementExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6219:1: ( rule__TypedNamedElementExpression__Group__1__Impl )
            // InternalActionLanguage.g:6220:2: rule__TypedNamedElementExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedNamedElementExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedNamedElementExpression__Group__1"


    // $ANTLR start "rule__TypedNamedElementExpression__Group__1__Impl"
    // InternalActionLanguage.g:6226:1: rule__TypedNamedElementExpression__Group__1__Impl : ( ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )* ) ;
    public final void rule__TypedNamedElementExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6230:1: ( ( ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )* ) )
            // InternalActionLanguage.g:6231:1: ( ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )* )
            {
            // InternalActionLanguage.g:6231:1: ( ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )* )
            // InternalActionLanguage.g:6232:1: ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )*
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsAssignment_1()); 
            // InternalActionLanguage.g:6233:1: ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==52||LA35_0==56) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalActionLanguage.g:6233:2: rule__TypedNamedElementExpression__ElementAccessorsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_42);
            	    rule__TypedNamedElementExpression__ElementAccessorsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedNamedElementExpression__Group__1__Impl"


    // $ANTLR start "rule__ArrayIndexExpression__Group__0"
    // InternalActionLanguage.g:6247:1: rule__ArrayIndexExpression__Group__0 : rule__ArrayIndexExpression__Group__0__Impl rule__ArrayIndexExpression__Group__1 ;
    public final void rule__ArrayIndexExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6251:1: ( rule__ArrayIndexExpression__Group__0__Impl rule__ArrayIndexExpression__Group__1 )
            // InternalActionLanguage.g:6252:2: rule__ArrayIndexExpression__Group__0__Impl rule__ArrayIndexExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ArrayIndexExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayIndexExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayIndexExpression__Group__0"


    // $ANTLR start "rule__ArrayIndexExpression__Group__0__Impl"
    // InternalActionLanguage.g:6259:1: rule__ArrayIndexExpression__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayIndexExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6263:1: ( ( '[' ) )
            // InternalActionLanguage.g:6264:1: ( '[' )
            {
            // InternalActionLanguage.g:6264:1: ( '[' )
            // InternalActionLanguage.g:6265:1: '['
            {
             before(grammarAccess.getArrayIndexExpressionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,52,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getArrayIndexExpressionAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayIndexExpression__Group__0__Impl"


    // $ANTLR start "rule__ArrayIndexExpression__Group__1"
    // InternalActionLanguage.g:6278:1: rule__ArrayIndexExpression__Group__1 : rule__ArrayIndexExpression__Group__1__Impl rule__ArrayIndexExpression__Group__2 ;
    public final void rule__ArrayIndexExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6282:1: ( rule__ArrayIndexExpression__Group__1__Impl rule__ArrayIndexExpression__Group__2 )
            // InternalActionLanguage.g:6283:2: rule__ArrayIndexExpression__Group__1__Impl rule__ArrayIndexExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__ArrayIndexExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayIndexExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayIndexExpression__Group__1"


    // $ANTLR start "rule__ArrayIndexExpression__Group__1__Impl"
    // InternalActionLanguage.g:6290:1: rule__ArrayIndexExpression__Group__1__Impl : ( ( rule__ArrayIndexExpression__IndexAssignment_1 ) ) ;
    public final void rule__ArrayIndexExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6294:1: ( ( ( rule__ArrayIndexExpression__IndexAssignment_1 ) ) )
            // InternalActionLanguage.g:6295:1: ( ( rule__ArrayIndexExpression__IndexAssignment_1 ) )
            {
            // InternalActionLanguage.g:6295:1: ( ( rule__ArrayIndexExpression__IndexAssignment_1 ) )
            // InternalActionLanguage.g:6296:1: ( rule__ArrayIndexExpression__IndexAssignment_1 )
            {
             before(grammarAccess.getArrayIndexExpressionAccess().getIndexAssignment_1()); 
            // InternalActionLanguage.g:6297:1: ( rule__ArrayIndexExpression__IndexAssignment_1 )
            // InternalActionLanguage.g:6297:2: rule__ArrayIndexExpression__IndexAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayIndexExpression__IndexAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayIndexExpressionAccess().getIndexAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayIndexExpression__Group__1__Impl"


    // $ANTLR start "rule__ArrayIndexExpression__Group__2"
    // InternalActionLanguage.g:6307:1: rule__ArrayIndexExpression__Group__2 : rule__ArrayIndexExpression__Group__2__Impl ;
    public final void rule__ArrayIndexExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6311:1: ( rule__ArrayIndexExpression__Group__2__Impl )
            // InternalActionLanguage.g:6312:2: rule__ArrayIndexExpression__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayIndexExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayIndexExpression__Group__2"


    // $ANTLR start "rule__ArrayIndexExpression__Group__2__Impl"
    // InternalActionLanguage.g:6318:1: rule__ArrayIndexExpression__Group__2__Impl : ( ']' ) ;
    public final void rule__ArrayIndexExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6322:1: ( ( ']' ) )
            // InternalActionLanguage.g:6323:1: ( ']' )
            {
            // InternalActionLanguage.g:6323:1: ( ']' )
            // InternalActionLanguage.g:6324:1: ']'
            {
             before(grammarAccess.getArrayIndexExpressionAccess().getRightSquareBracketKeyword_2()); 
            match(input,53,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getArrayIndexExpressionAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayIndexExpression__Group__2__Impl"


    // $ANTLR start "rule__AttributeAccessorExpression__Group__0"
    // InternalActionLanguage.g:6343:1: rule__AttributeAccessorExpression__Group__0 : rule__AttributeAccessorExpression__Group__0__Impl rule__AttributeAccessorExpression__Group__1 ;
    public final void rule__AttributeAccessorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6347:1: ( rule__AttributeAccessorExpression__Group__0__Impl rule__AttributeAccessorExpression__Group__1 )
            // InternalActionLanguage.g:6348:2: rule__AttributeAccessorExpression__Group__0__Impl rule__AttributeAccessorExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__AttributeAccessorExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeAccessorExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAccessorExpression__Group__0"


    // $ANTLR start "rule__AttributeAccessorExpression__Group__0__Impl"
    // InternalActionLanguage.g:6355:1: rule__AttributeAccessorExpression__Group__0__Impl : ( '.' ) ;
    public final void rule__AttributeAccessorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6359:1: ( ( '.' ) )
            // InternalActionLanguage.g:6360:1: ( '.' )
            {
            // InternalActionLanguage.g:6360:1: ( '.' )
            // InternalActionLanguage.g:6361:1: '.'
            {
             before(grammarAccess.getAttributeAccessorExpressionAccess().getFullStopKeyword_0()); 
            match(input,56,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeAccessorExpressionAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAccessorExpression__Group__0__Impl"


    // $ANTLR start "rule__AttributeAccessorExpression__Group__1"
    // InternalActionLanguage.g:6374:1: rule__AttributeAccessorExpression__Group__1 : rule__AttributeAccessorExpression__Group__1__Impl ;
    public final void rule__AttributeAccessorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6378:1: ( rule__AttributeAccessorExpression__Group__1__Impl )
            // InternalActionLanguage.g:6379:2: rule__AttributeAccessorExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeAccessorExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAccessorExpression__Group__1"


    // $ANTLR start "rule__AttributeAccessorExpression__Group__1__Impl"
    // InternalActionLanguage.g:6385:1: rule__AttributeAccessorExpression__Group__1__Impl : ( ( rule__AttributeAccessorExpression__AttributeAssignment_1 ) ) ;
    public final void rule__AttributeAccessorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6389:1: ( ( ( rule__AttributeAccessorExpression__AttributeAssignment_1 ) ) )
            // InternalActionLanguage.g:6390:1: ( ( rule__AttributeAccessorExpression__AttributeAssignment_1 ) )
            {
            // InternalActionLanguage.g:6390:1: ( ( rule__AttributeAccessorExpression__AttributeAssignment_1 ) )
            // InternalActionLanguage.g:6391:1: ( rule__AttributeAccessorExpression__AttributeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccessorExpressionAccess().getAttributeAssignment_1()); 
            // InternalActionLanguage.g:6392:1: ( rule__AttributeAccessorExpression__AttributeAssignment_1 )
            // InternalActionLanguage.g:6392:2: rule__AttributeAccessorExpression__AttributeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeAccessorExpression__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccessorExpressionAccess().getAttributeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAccessorExpression__Group__1__Impl"


    // $ANTLR start "rule__PositionSelectorExpression__Group__0"
    // InternalActionLanguage.g:6406:1: rule__PositionSelectorExpression__Group__0 : rule__PositionSelectorExpression__Group__0__Impl rule__PositionSelectorExpression__Group__1 ;
    public final void rule__PositionSelectorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6410:1: ( rule__PositionSelectorExpression__Group__0__Impl rule__PositionSelectorExpression__Group__1 )
            // InternalActionLanguage.g:6411:2: rule__PositionSelectorExpression__Group__0__Impl rule__PositionSelectorExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__PositionSelectorExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PositionSelectorExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionSelectorExpression__Group__0"


    // $ANTLR start "rule__PositionSelectorExpression__Group__0__Impl"
    // InternalActionLanguage.g:6418:1: rule__PositionSelectorExpression__Group__0__Impl : ( ( rule__PositionSelectorExpression__KindAssignment_0 ) ) ;
    public final void rule__PositionSelectorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6422:1: ( ( ( rule__PositionSelectorExpression__KindAssignment_0 ) ) )
            // InternalActionLanguage.g:6423:1: ( ( rule__PositionSelectorExpression__KindAssignment_0 ) )
            {
            // InternalActionLanguage.g:6423:1: ( ( rule__PositionSelectorExpression__KindAssignment_0 ) )
            // InternalActionLanguage.g:6424:1: ( rule__PositionSelectorExpression__KindAssignment_0 )
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getKindAssignment_0()); 
            // InternalActionLanguage.g:6425:1: ( rule__PositionSelectorExpression__KindAssignment_0 )
            // InternalActionLanguage.g:6425:2: rule__PositionSelectorExpression__KindAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PositionSelectorExpression__KindAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPositionSelectorExpressionAccess().getKindAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionSelectorExpression__Group__0__Impl"


    // $ANTLR start "rule__PositionSelectorExpression__Group__1"
    // InternalActionLanguage.g:6435:1: rule__PositionSelectorExpression__Group__1 : rule__PositionSelectorExpression__Group__1__Impl ;
    public final void rule__PositionSelectorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6439:1: ( rule__PositionSelectorExpression__Group__1__Impl )
            // InternalActionLanguage.g:6440:2: rule__PositionSelectorExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PositionSelectorExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionSelectorExpression__Group__1"


    // $ANTLR start "rule__PositionSelectorExpression__Group__1__Impl"
    // InternalActionLanguage.g:6446:1: rule__PositionSelectorExpression__Group__1__Impl : ( ( rule__PositionSelectorExpression__Group_1__0 )? ) ;
    public final void rule__PositionSelectorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6450:1: ( ( ( rule__PositionSelectorExpression__Group_1__0 )? ) )
            // InternalActionLanguage.g:6451:1: ( ( rule__PositionSelectorExpression__Group_1__0 )? )
            {
            // InternalActionLanguage.g:6451:1: ( ( rule__PositionSelectorExpression__Group_1__0 )? )
            // InternalActionLanguage.g:6452:1: ( rule__PositionSelectorExpression__Group_1__0 )?
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getGroup_1()); 
            // InternalActionLanguage.g:6453:1: ( rule__PositionSelectorExpression__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==55) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalActionLanguage.g:6453:2: rule__PositionSelectorExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PositionSelectorExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPositionSelectorExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionSelectorExpression__Group__1__Impl"


    // $ANTLR start "rule__PositionSelectorExpression__Group_1__0"
    // InternalActionLanguage.g:6467:1: rule__PositionSelectorExpression__Group_1__0 : rule__PositionSelectorExpression__Group_1__0__Impl rule__PositionSelectorExpression__Group_1__1 ;
    public final void rule__PositionSelectorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6471:1: ( rule__PositionSelectorExpression__Group_1__0__Impl rule__PositionSelectorExpression__Group_1__1 )
            // InternalActionLanguage.g:6472:2: rule__PositionSelectorExpression__Group_1__0__Impl rule__PositionSelectorExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__PositionSelectorExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PositionSelectorExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionSelectorExpression__Group_1__0"


    // $ANTLR start "rule__PositionSelectorExpression__Group_1__0__Impl"
    // InternalActionLanguage.g:6479:1: rule__PositionSelectorExpression__Group_1__0__Impl : ( '->' ) ;
    public final void rule__PositionSelectorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6483:1: ( ( '->' ) )
            // InternalActionLanguage.g:6484:1: ( '->' )
            {
            // InternalActionLanguage.g:6484:1: ( '->' )
            // InternalActionLanguage.g:6485:1: '->'
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 
            match(input,55,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPositionSelectorExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionSelectorExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PositionSelectorExpression__Group_1__1"
    // InternalActionLanguage.g:6498:1: rule__PositionSelectorExpression__Group_1__1 : rule__PositionSelectorExpression__Group_1__1__Impl ;
    public final void rule__PositionSelectorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6502:1: ( rule__PositionSelectorExpression__Group_1__1__Impl )
            // InternalActionLanguage.g:6503:2: rule__PositionSelectorExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PositionSelectorExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionSelectorExpression__Group_1__1"


    // $ANTLR start "rule__PositionSelectorExpression__Group_1__1__Impl"
    // InternalActionLanguage.g:6509:1: rule__PositionSelectorExpression__Group_1__1__Impl : ( ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 ) ) ;
    public final void rule__PositionSelectorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6513:1: ( ( ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 ) ) )
            // InternalActionLanguage.g:6514:1: ( ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 ) )
            {
            // InternalActionLanguage.g:6514:1: ( ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 ) )
            // InternalActionLanguage.g:6515:1: ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 )
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getSuccessorAssignment_1_1()); 
            // InternalActionLanguage.g:6516:1: ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 )
            // InternalActionLanguage.g:6516:2: rule__PositionSelectorExpression__SuccessorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PositionSelectorExpression__SuccessorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPositionSelectorExpressionAccess().getSuccessorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionSelectorExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OperationCall__Group__0"
    // InternalActionLanguage.g:6530:1: rule__OperationCall__Group__0 : rule__OperationCall__Group__0__Impl rule__OperationCall__Group__1 ;
    public final void rule__OperationCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6534:1: ( rule__OperationCall__Group__0__Impl rule__OperationCall__Group__1 )
            // InternalActionLanguage.g:6535:2: rule__OperationCall__Group__0__Impl rule__OperationCall__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__OperationCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group__0"


    // $ANTLR start "rule__OperationCall__Group__0__Impl"
    // InternalActionLanguage.g:6542:1: rule__OperationCall__Group__0__Impl : ( ( rule__OperationCall__OperationAssignment_0 ) ) ;
    public final void rule__OperationCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6546:1: ( ( ( rule__OperationCall__OperationAssignment_0 ) ) )
            // InternalActionLanguage.g:6547:1: ( ( rule__OperationCall__OperationAssignment_0 ) )
            {
            // InternalActionLanguage.g:6547:1: ( ( rule__OperationCall__OperationAssignment_0 ) )
            // InternalActionLanguage.g:6548:1: ( rule__OperationCall__OperationAssignment_0 )
            {
             before(grammarAccess.getOperationCallAccess().getOperationAssignment_0()); 
            // InternalActionLanguage.g:6549:1: ( rule__OperationCall__OperationAssignment_0 )
            // InternalActionLanguage.g:6549:2: rule__OperationCall__OperationAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__OperationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationCallAccess().getOperationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group__0__Impl"


    // $ANTLR start "rule__OperationCall__Group__1"
    // InternalActionLanguage.g:6559:1: rule__OperationCall__Group__1 : rule__OperationCall__Group__1__Impl rule__OperationCall__Group__2 ;
    public final void rule__OperationCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6563:1: ( rule__OperationCall__Group__1__Impl rule__OperationCall__Group__2 )
            // InternalActionLanguage.g:6564:2: rule__OperationCall__Group__1__Impl rule__OperationCall__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_44);
            rule__OperationCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group__1"


    // $ANTLR start "rule__OperationCall__Group__1__Impl"
    // InternalActionLanguage.g:6571:1: rule__OperationCall__Group__1__Impl : ( '(' ) ;
    public final void rule__OperationCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6575:1: ( ( '(' ) )
            // InternalActionLanguage.g:6576:1: ( '(' )
            {
            // InternalActionLanguage.g:6576:1: ( '(' )
            // InternalActionLanguage.g:6577:1: '('
            {
             before(grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,42,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group__1__Impl"


    // $ANTLR start "rule__OperationCall__Group__2"
    // InternalActionLanguage.g:6590:1: rule__OperationCall__Group__2 : rule__OperationCall__Group__2__Impl rule__OperationCall__Group__3 ;
    public final void rule__OperationCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6594:1: ( rule__OperationCall__Group__2__Impl rule__OperationCall__Group__3 )
            // InternalActionLanguage.g:6595:2: rule__OperationCall__Group__2__Impl rule__OperationCall__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_44);
            rule__OperationCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group__2"


    // $ANTLR start "rule__OperationCall__Group__2__Impl"
    // InternalActionLanguage.g:6602:1: rule__OperationCall__Group__2__Impl : ( ( rule__OperationCall__Group_2__0 )? ) ;
    public final void rule__OperationCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6606:1: ( ( ( rule__OperationCall__Group_2__0 )? ) )
            // InternalActionLanguage.g:6607:1: ( ( rule__OperationCall__Group_2__0 )? )
            {
            // InternalActionLanguage.g:6607:1: ( ( rule__OperationCall__Group_2__0 )? )
            // InternalActionLanguage.g:6608:1: ( rule__OperationCall__Group_2__0 )?
            {
             before(grammarAccess.getOperationCallAccess().getGroup_2()); 
            // InternalActionLanguage.g:6609:1: ( rule__OperationCall__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalActionLanguage.g:6609:2: rule__OperationCall__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__OperationCall__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationCallAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group__2__Impl"


    // $ANTLR start "rule__OperationCall__Group__3"
    // InternalActionLanguage.g:6619:1: rule__OperationCall__Group__3 : rule__OperationCall__Group__3__Impl ;
    public final void rule__OperationCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6623:1: ( rule__OperationCall__Group__3__Impl )
            // InternalActionLanguage.g:6624:2: rule__OperationCall__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group__3"


    // $ANTLR start "rule__OperationCall__Group__3__Impl"
    // InternalActionLanguage.g:6630:1: rule__OperationCall__Group__3__Impl : ( ')' ) ;
    public final void rule__OperationCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6634:1: ( ( ')' ) )
            // InternalActionLanguage.g:6635:1: ( ')' )
            {
            // InternalActionLanguage.g:6635:1: ( ')' )
            // InternalActionLanguage.g:6636:1: ')'
            {
             before(grammarAccess.getOperationCallAccess().getRightParenthesisKeyword_3()); 
            match(input,44,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOperationCallAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group__3__Impl"


    // $ANTLR start "rule__OperationCall__Group_2__0"
    // InternalActionLanguage.g:6657:1: rule__OperationCall__Group_2__0 : rule__OperationCall__Group_2__0__Impl rule__OperationCall__Group_2__1 ;
    public final void rule__OperationCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6661:1: ( rule__OperationCall__Group_2__0__Impl rule__OperationCall__Group_2__1 )
            // InternalActionLanguage.g:6662:2: rule__OperationCall__Group_2__0__Impl rule__OperationCall__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__OperationCall__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group_2__0"


    // $ANTLR start "rule__OperationCall__Group_2__0__Impl"
    // InternalActionLanguage.g:6669:1: rule__OperationCall__Group_2__0__Impl : ( ( rule__OperationCall__ParameterBindingAssignment_2_0 ) ) ;
    public final void rule__OperationCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6673:1: ( ( ( rule__OperationCall__ParameterBindingAssignment_2_0 ) ) )
            // InternalActionLanguage.g:6674:1: ( ( rule__OperationCall__ParameterBindingAssignment_2_0 ) )
            {
            // InternalActionLanguage.g:6674:1: ( ( rule__OperationCall__ParameterBindingAssignment_2_0 ) )
            // InternalActionLanguage.g:6675:1: ( rule__OperationCall__ParameterBindingAssignment_2_0 )
            {
             before(grammarAccess.getOperationCallAccess().getParameterBindingAssignment_2_0()); 
            // InternalActionLanguage.g:6676:1: ( rule__OperationCall__ParameterBindingAssignment_2_0 )
            // InternalActionLanguage.g:6676:2: rule__OperationCall__ParameterBindingAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__ParameterBindingAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationCallAccess().getParameterBindingAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group_2__0__Impl"


    // $ANTLR start "rule__OperationCall__Group_2__1"
    // InternalActionLanguage.g:6686:1: rule__OperationCall__Group_2__1 : rule__OperationCall__Group_2__1__Impl ;
    public final void rule__OperationCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6690:1: ( rule__OperationCall__Group_2__1__Impl )
            // InternalActionLanguage.g:6691:2: rule__OperationCall__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group_2__1"


    // $ANTLR start "rule__OperationCall__Group_2__1__Impl"
    // InternalActionLanguage.g:6697:1: rule__OperationCall__Group_2__1__Impl : ( ( rule__OperationCall__Group_2_1__0 )* ) ;
    public final void rule__OperationCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6701:1: ( ( ( rule__OperationCall__Group_2_1__0 )* ) )
            // InternalActionLanguage.g:6702:1: ( ( rule__OperationCall__Group_2_1__0 )* )
            {
            // InternalActionLanguage.g:6702:1: ( ( rule__OperationCall__Group_2_1__0 )* )
            // InternalActionLanguage.g:6703:1: ( rule__OperationCall__Group_2_1__0 )*
            {
             before(grammarAccess.getOperationCallAccess().getGroup_2_1()); 
            // InternalActionLanguage.g:6704:1: ( rule__OperationCall__Group_2_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==54) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalActionLanguage.g:6704:2: rule__OperationCall__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    rule__OperationCall__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getOperationCallAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group_2__1__Impl"


    // $ANTLR start "rule__OperationCall__Group_2_1__0"
    // InternalActionLanguage.g:6718:1: rule__OperationCall__Group_2_1__0 : rule__OperationCall__Group_2_1__0__Impl rule__OperationCall__Group_2_1__1 ;
    public final void rule__OperationCall__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6722:1: ( rule__OperationCall__Group_2_1__0__Impl rule__OperationCall__Group_2_1__1 )
            // InternalActionLanguage.g:6723:2: rule__OperationCall__Group_2_1__0__Impl rule__OperationCall__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__OperationCall__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group_2_1__0"


    // $ANTLR start "rule__OperationCall__Group_2_1__0__Impl"
    // InternalActionLanguage.g:6730:1: rule__OperationCall__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__OperationCall__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6734:1: ( ( ',' ) )
            // InternalActionLanguage.g:6735:1: ( ',' )
            {
            // InternalActionLanguage.g:6735:1: ( ',' )
            // InternalActionLanguage.g:6736:1: ','
            {
             before(grammarAccess.getOperationCallAccess().getCommaKeyword_2_1_0()); 
            match(input,54,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOperationCallAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group_2_1__0__Impl"


    // $ANTLR start "rule__OperationCall__Group_2_1__1"
    // InternalActionLanguage.g:6749:1: rule__OperationCall__Group_2_1__1 : rule__OperationCall__Group_2_1__1__Impl ;
    public final void rule__OperationCall__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6753:1: ( rule__OperationCall__Group_2_1__1__Impl )
            // InternalActionLanguage.g:6754:2: rule__OperationCall__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group_2_1__1"


    // $ANTLR start "rule__OperationCall__Group_2_1__1__Impl"
    // InternalActionLanguage.g:6760:1: rule__OperationCall__Group_2_1__1__Impl : ( ( rule__OperationCall__ParameterBindingAssignment_2_1_1 ) ) ;
    public final void rule__OperationCall__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6764:1: ( ( ( rule__OperationCall__ParameterBindingAssignment_2_1_1 ) ) )
            // InternalActionLanguage.g:6765:1: ( ( rule__OperationCall__ParameterBindingAssignment_2_1_1 ) )
            {
            // InternalActionLanguage.g:6765:1: ( ( rule__OperationCall__ParameterBindingAssignment_2_1_1 ) )
            // InternalActionLanguage.g:6766:1: ( rule__OperationCall__ParameterBindingAssignment_2_1_1 )
            {
             before(grammarAccess.getOperationCallAccess().getParameterBindingAssignment_2_1_1()); 
            // InternalActionLanguage.g:6767:1: ( rule__OperationCall__ParameterBindingAssignment_2_1_1 )
            // InternalActionLanguage.g:6767:2: rule__OperationCall__ParameterBindingAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__ParameterBindingAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationCallAccess().getParameterBindingAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group_2_1__1__Impl"


    // $ANTLR start "rule__ParamaterBinding__Group__0"
    // InternalActionLanguage.g:6781:1: rule__ParamaterBinding__Group__0 : rule__ParamaterBinding__Group__0__Impl rule__ParamaterBinding__Group__1 ;
    public final void rule__ParamaterBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6785:1: ( rule__ParamaterBinding__Group__0__Impl rule__ParamaterBinding__Group__1 )
            // InternalActionLanguage.g:6786:2: rule__ParamaterBinding__Group__0__Impl rule__ParamaterBinding__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__ParamaterBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParamaterBinding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamaterBinding__Group__0"


    // $ANTLR start "rule__ParamaterBinding__Group__0__Impl"
    // InternalActionLanguage.g:6793:1: rule__ParamaterBinding__Group__0__Impl : ( () ) ;
    public final void rule__ParamaterBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6797:1: ( ( () ) )
            // InternalActionLanguage.g:6798:1: ( () )
            {
            // InternalActionLanguage.g:6798:1: ( () )
            // InternalActionLanguage.g:6799:1: ()
            {
             before(grammarAccess.getParamaterBindingAccess().getParameterBindingAction_0()); 
            // InternalActionLanguage.g:6800:1: ()
            // InternalActionLanguage.g:6802:1: 
            {
            }

             after(grammarAccess.getParamaterBindingAccess().getParameterBindingAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamaterBinding__Group__0__Impl"


    // $ANTLR start "rule__ParamaterBinding__Group__1"
    // InternalActionLanguage.g:6812:1: rule__ParamaterBinding__Group__1 : rule__ParamaterBinding__Group__1__Impl rule__ParamaterBinding__Group__2 ;
    public final void rule__ParamaterBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6816:1: ( rule__ParamaterBinding__Group__1__Impl rule__ParamaterBinding__Group__2 )
            // InternalActionLanguage.g:6817:2: rule__ParamaterBinding__Group__1__Impl rule__ParamaterBinding__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__ParamaterBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParamaterBinding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamaterBinding__Group__1"


    // $ANTLR start "rule__ParamaterBinding__Group__1__Impl"
    // InternalActionLanguage.g:6824:1: rule__ParamaterBinding__Group__1__Impl : ( ( rule__ParamaterBinding__ParameterAssignment_1 ) ) ;
    public final void rule__ParamaterBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6828:1: ( ( ( rule__ParamaterBinding__ParameterAssignment_1 ) ) )
            // InternalActionLanguage.g:6829:1: ( ( rule__ParamaterBinding__ParameterAssignment_1 ) )
            {
            // InternalActionLanguage.g:6829:1: ( ( rule__ParamaterBinding__ParameterAssignment_1 ) )
            // InternalActionLanguage.g:6830:1: ( rule__ParamaterBinding__ParameterAssignment_1 )
            {
             before(grammarAccess.getParamaterBindingAccess().getParameterAssignment_1()); 
            // InternalActionLanguage.g:6831:1: ( rule__ParamaterBinding__ParameterAssignment_1 )
            // InternalActionLanguage.g:6831:2: rule__ParamaterBinding__ParameterAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParamaterBinding__ParameterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParamaterBindingAccess().getParameterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamaterBinding__Group__1__Impl"


    // $ANTLR start "rule__ParamaterBinding__Group__2"
    // InternalActionLanguage.g:6841:1: rule__ParamaterBinding__Group__2 : rule__ParamaterBinding__Group__2__Impl rule__ParamaterBinding__Group__3 ;
    public final void rule__ParamaterBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6845:1: ( rule__ParamaterBinding__Group__2__Impl rule__ParamaterBinding__Group__3 )
            // InternalActionLanguage.g:6846:2: rule__ParamaterBinding__Group__2__Impl rule__ParamaterBinding__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ParamaterBinding__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParamaterBinding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamaterBinding__Group__2"


    // $ANTLR start "rule__ParamaterBinding__Group__2__Impl"
    // InternalActionLanguage.g:6853:1: rule__ParamaterBinding__Group__2__Impl : ( ':=' ) ;
    public final void rule__ParamaterBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6857:1: ( ( ':=' ) )
            // InternalActionLanguage.g:6858:1: ( ':=' )
            {
            // InternalActionLanguage.g:6858:1: ( ':=' )
            // InternalActionLanguage.g:6859:1: ':='
            {
             before(grammarAccess.getParamaterBindingAccess().getColonEqualsSignKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParamaterBindingAccess().getColonEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamaterBinding__Group__2__Impl"


    // $ANTLR start "rule__ParamaterBinding__Group__3"
    // InternalActionLanguage.g:6872:1: rule__ParamaterBinding__Group__3 : rule__ParamaterBinding__Group__3__Impl ;
    public final void rule__ParamaterBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6876:1: ( rule__ParamaterBinding__Group__3__Impl )
            // InternalActionLanguage.g:6877:2: rule__ParamaterBinding__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParamaterBinding__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamaterBinding__Group__3"


    // $ANTLR start "rule__ParamaterBinding__Group__3__Impl"
    // InternalActionLanguage.g:6883:1: rule__ParamaterBinding__Group__3__Impl : ( ( rule__ParamaterBinding__ValueAssignment_3 ) ) ;
    public final void rule__ParamaterBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6887:1: ( ( ( rule__ParamaterBinding__ValueAssignment_3 ) ) )
            // InternalActionLanguage.g:6888:1: ( ( rule__ParamaterBinding__ValueAssignment_3 ) )
            {
            // InternalActionLanguage.g:6888:1: ( ( rule__ParamaterBinding__ValueAssignment_3 ) )
            // InternalActionLanguage.g:6889:1: ( rule__ParamaterBinding__ValueAssignment_3 )
            {
             before(grammarAccess.getParamaterBindingAccess().getValueAssignment_3()); 
            // InternalActionLanguage.g:6890:1: ( rule__ParamaterBinding__ValueAssignment_3 )
            // InternalActionLanguage.g:6890:2: rule__ParamaterBinding__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParamaterBinding__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParamaterBindingAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamaterBinding__Group__3__Impl"


    // $ANTLR start "rule__TriggerMessageExpression__Group__0"
    // InternalActionLanguage.g:6908:1: rule__TriggerMessageExpression__Group__0 : rule__TriggerMessageExpression__Group__0__Impl rule__TriggerMessageExpression__Group__1 ;
    public final void rule__TriggerMessageExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6912:1: ( rule__TriggerMessageExpression__Group__0__Impl rule__TriggerMessageExpression__Group__1 )
            // InternalActionLanguage.g:6913:2: rule__TriggerMessageExpression__Group__0__Impl rule__TriggerMessageExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__TriggerMessageExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TriggerMessageExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerMessageExpression__Group__0"


    // $ANTLR start "rule__TriggerMessageExpression__Group__0__Impl"
    // InternalActionLanguage.g:6920:1: rule__TriggerMessageExpression__Group__0__Impl : ( ( rule__TriggerMessageExpression__MessageTypeAssignment_0 ) ) ;
    public final void rule__TriggerMessageExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6924:1: ( ( ( rule__TriggerMessageExpression__MessageTypeAssignment_0 ) ) )
            // InternalActionLanguage.g:6925:1: ( ( rule__TriggerMessageExpression__MessageTypeAssignment_0 ) )
            {
            // InternalActionLanguage.g:6925:1: ( ( rule__TriggerMessageExpression__MessageTypeAssignment_0 ) )
            // InternalActionLanguage.g:6926:1: ( rule__TriggerMessageExpression__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getTriggerMessageExpressionAccess().getMessageTypeAssignment_0()); 
            // InternalActionLanguage.g:6927:1: ( rule__TriggerMessageExpression__MessageTypeAssignment_0 )
            // InternalActionLanguage.g:6927:2: rule__TriggerMessageExpression__MessageTypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TriggerMessageExpression__MessageTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerMessageExpressionAccess().getMessageTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerMessageExpression__Group__0__Impl"


    // $ANTLR start "rule__TriggerMessageExpression__Group__1"
    // InternalActionLanguage.g:6937:1: rule__TriggerMessageExpression__Group__1 : rule__TriggerMessageExpression__Group__1__Impl rule__TriggerMessageExpression__Group__2 ;
    public final void rule__TriggerMessageExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6941:1: ( rule__TriggerMessageExpression__Group__1__Impl rule__TriggerMessageExpression__Group__2 )
            // InternalActionLanguage.g:6942:2: rule__TriggerMessageExpression__Group__1__Impl rule__TriggerMessageExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__TriggerMessageExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TriggerMessageExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerMessageExpression__Group__1"


    // $ANTLR start "rule__TriggerMessageExpression__Group__1__Impl"
    // InternalActionLanguage.g:6949:1: rule__TriggerMessageExpression__Group__1__Impl : ( '->' ) ;
    public final void rule__TriggerMessageExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6953:1: ( ( '->' ) )
            // InternalActionLanguage.g:6954:1: ( '->' )
            {
            // InternalActionLanguage.g:6954:1: ( '->' )
            // InternalActionLanguage.g:6955:1: '->'
            {
             before(grammarAccess.getTriggerMessageExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,55,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTriggerMessageExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerMessageExpression__Group__1__Impl"


    // $ANTLR start "rule__TriggerMessageExpression__Group__2"
    // InternalActionLanguage.g:6968:1: rule__TriggerMessageExpression__Group__2 : rule__TriggerMessageExpression__Group__2__Impl ;
    public final void rule__TriggerMessageExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6972:1: ( rule__TriggerMessageExpression__Group__2__Impl )
            // InternalActionLanguage.g:6973:2: rule__TriggerMessageExpression__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TriggerMessageExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerMessageExpression__Group__2"


    // $ANTLR start "rule__TriggerMessageExpression__Group__2__Impl"
    // InternalActionLanguage.g:6979:1: rule__TriggerMessageExpression__Group__2__Impl : ( ( rule__TriggerMessageExpression__ParameterAssignment_2 ) ) ;
    public final void rule__TriggerMessageExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:6983:1: ( ( ( rule__TriggerMessageExpression__ParameterAssignment_2 ) ) )
            // InternalActionLanguage.g:6984:1: ( ( rule__TriggerMessageExpression__ParameterAssignment_2 ) )
            {
            // InternalActionLanguage.g:6984:1: ( ( rule__TriggerMessageExpression__ParameterAssignment_2 ) )
            // InternalActionLanguage.g:6985:1: ( rule__TriggerMessageExpression__ParameterAssignment_2 )
            {
             before(grammarAccess.getTriggerMessageExpressionAccess().getParameterAssignment_2()); 
            // InternalActionLanguage.g:6986:1: ( rule__TriggerMessageExpression__ParameterAssignment_2 )
            // InternalActionLanguage.g:6986:2: rule__TriggerMessageExpression__ParameterAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TriggerMessageExpression__ParameterAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTriggerMessageExpressionAccess().getParameterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerMessageExpression__Group__2__Impl"


    // $ANTLR start "rule__DATATYPE__Group__0"
    // InternalActionLanguage.g:7002:1: rule__DATATYPE__Group__0 : rule__DATATYPE__Group__0__Impl rule__DATATYPE__Group__1 ;
    public final void rule__DATATYPE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7006:1: ( rule__DATATYPE__Group__0__Impl rule__DATATYPE__Group__1 )
            // InternalActionLanguage.g:7007:2: rule__DATATYPE__Group__0__Impl rule__DATATYPE__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_45);
            rule__DATATYPE__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DATATYPE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATATYPE__Group__0"


    // $ANTLR start "rule__DATATYPE__Group__0__Impl"
    // InternalActionLanguage.g:7014:1: rule__DATATYPE__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__DATATYPE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7018:1: ( ( RULE_ID ) )
            // InternalActionLanguage.g:7019:1: ( RULE_ID )
            {
            // InternalActionLanguage.g:7019:1: ( RULE_ID )
            // InternalActionLanguage.g:7020:1: RULE_ID
            {
             before(grammarAccess.getDATATYPEAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDATATYPEAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATATYPE__Group__0__Impl"


    // $ANTLR start "rule__DATATYPE__Group__1"
    // InternalActionLanguage.g:7031:1: rule__DATATYPE__Group__1 : rule__DATATYPE__Group__1__Impl ;
    public final void rule__DATATYPE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7035:1: ( rule__DATATYPE__Group__1__Impl )
            // InternalActionLanguage.g:7036:2: rule__DATATYPE__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DATATYPE__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATATYPE__Group__1"


    // $ANTLR start "rule__DATATYPE__Group__1__Impl"
    // InternalActionLanguage.g:7042:1: rule__DATATYPE__Group__1__Impl : ( ( rule__DATATYPE__Group_1__0 )* ) ;
    public final void rule__DATATYPE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7046:1: ( ( ( rule__DATATYPE__Group_1__0 )* ) )
            // InternalActionLanguage.g:7047:1: ( ( rule__DATATYPE__Group_1__0 )* )
            {
            // InternalActionLanguage.g:7047:1: ( ( rule__DATATYPE__Group_1__0 )* )
            // InternalActionLanguage.g:7048:1: ( rule__DATATYPE__Group_1__0 )*
            {
             before(grammarAccess.getDATATYPEAccess().getGroup_1()); 
            // InternalActionLanguage.g:7049:1: ( rule__DATATYPE__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==52) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalActionLanguage.g:7049:2: rule__DATATYPE__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_46);
            	    rule__DATATYPE__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getDATATYPEAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATATYPE__Group__1__Impl"


    // $ANTLR start "rule__DATATYPE__Group_1__0"
    // InternalActionLanguage.g:7063:1: rule__DATATYPE__Group_1__0 : rule__DATATYPE__Group_1__0__Impl rule__DATATYPE__Group_1__1 ;
    public final void rule__DATATYPE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7067:1: ( rule__DATATYPE__Group_1__0__Impl rule__DATATYPE__Group_1__1 )
            // InternalActionLanguage.g:7068:2: rule__DATATYPE__Group_1__0__Impl rule__DATATYPE__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__DATATYPE__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DATATYPE__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATATYPE__Group_1__0"


    // $ANTLR start "rule__DATATYPE__Group_1__0__Impl"
    // InternalActionLanguage.g:7075:1: rule__DATATYPE__Group_1__0__Impl : ( '[' ) ;
    public final void rule__DATATYPE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7079:1: ( ( '[' ) )
            // InternalActionLanguage.g:7080:1: ( '[' )
            {
            // InternalActionLanguage.g:7080:1: ( '[' )
            // InternalActionLanguage.g:7081:1: '['
            {
             before(grammarAccess.getDATATYPEAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,52,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDATATYPEAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATATYPE__Group_1__0__Impl"


    // $ANTLR start "rule__DATATYPE__Group_1__1"
    // InternalActionLanguage.g:7094:1: rule__DATATYPE__Group_1__1 : rule__DATATYPE__Group_1__1__Impl rule__DATATYPE__Group_1__2 ;
    public final void rule__DATATYPE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7098:1: ( rule__DATATYPE__Group_1__1__Impl rule__DATATYPE__Group_1__2 )
            // InternalActionLanguage.g:7099:2: rule__DATATYPE__Group_1__1__Impl rule__DATATYPE__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__DATATYPE__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DATATYPE__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATATYPE__Group_1__1"


    // $ANTLR start "rule__DATATYPE__Group_1__1__Impl"
    // InternalActionLanguage.g:7106:1: rule__DATATYPE__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DATATYPE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7110:1: ( ( RULE_INT ) )
            // InternalActionLanguage.g:7111:1: ( RULE_INT )
            {
            // InternalActionLanguage.g:7111:1: ( RULE_INT )
            // InternalActionLanguage.g:7112:1: RULE_INT
            {
             before(grammarAccess.getDATATYPEAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDATATYPEAccess().getINTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATATYPE__Group_1__1__Impl"


    // $ANTLR start "rule__DATATYPE__Group_1__2"
    // InternalActionLanguage.g:7123:1: rule__DATATYPE__Group_1__2 : rule__DATATYPE__Group_1__2__Impl ;
    public final void rule__DATATYPE__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7127:1: ( rule__DATATYPE__Group_1__2__Impl )
            // InternalActionLanguage.g:7128:2: rule__DATATYPE__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DATATYPE__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATATYPE__Group_1__2"


    // $ANTLR start "rule__DATATYPE__Group_1__2__Impl"
    // InternalActionLanguage.g:7134:1: rule__DATATYPE__Group_1__2__Impl : ( ']' ) ;
    public final void rule__DATATYPE__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7138:1: ( ( ']' ) )
            // InternalActionLanguage.g:7139:1: ( ']' )
            {
            // InternalActionLanguage.g:7139:1: ( ']' )
            // InternalActionLanguage.g:7140:1: ']'
            {
             before(grammarAccess.getDATATYPEAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,53,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDATATYPEAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATATYPE__Group_1__2__Impl"


    // $ANTLR start "rule__Block__ExpressionsAssignment_2"
    // InternalActionLanguage.g:7160:1: rule__Block__ExpressionsAssignment_2 : ( ruleExpressionStartRule ) ;
    public final void rule__Block__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7164:1: ( ( ruleExpressionStartRule ) )
            // InternalActionLanguage.g:7165:1: ( ruleExpressionStartRule )
            {
            // InternalActionLanguage.g:7165:1: ( ruleExpressionStartRule )
            // InternalActionLanguage.g:7166:1: ruleExpressionStartRule
            {
             before(grammarAccess.getBlockAccess().getExpressionsExpressionStartRuleParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpressionStartRule();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getExpressionsExpressionStartRuleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__ExpressionsAssignment_2"


    // $ANTLR start "rule__ForLoop__InitializeExpressionAssignment_2"
    // InternalActionLanguage.g:7175:1: rule__ForLoop__InitializeExpressionAssignment_2 : ( ruleAssignment ) ;
    public final void rule__ForLoop__InitializeExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7179:1: ( ( ruleAssignment ) )
            // InternalActionLanguage.g:7180:1: ( ruleAssignment )
            {
            // InternalActionLanguage.g:7180:1: ( ruleAssignment )
            // InternalActionLanguage.g:7181:1: ruleAssignment
            {
             before(grammarAccess.getForLoopAccess().getInitializeExpressionAssignmentParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getForLoopAccess().getInitializeExpressionAssignmentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__InitializeExpressionAssignment_2"


    // $ANTLR start "rule__ForLoop__LoopTestAssignment_3"
    // InternalActionLanguage.g:7190:1: rule__ForLoop__LoopTestAssignment_3 : ( ruleExpression ) ;
    public final void rule__ForLoop__LoopTestAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7194:1: ( ( ruleExpression ) )
            // InternalActionLanguage.g:7195:1: ( ruleExpression )
            {
            // InternalActionLanguage.g:7195:1: ( ruleExpression )
            // InternalActionLanguage.g:7196:1: ruleExpression
            {
             before(grammarAccess.getForLoopAccess().getLoopTestExpressionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getForLoopAccess().getLoopTestExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__LoopTestAssignment_3"


    // $ANTLR start "rule__ForLoop__CountingExpressionAssignment_5"
    // InternalActionLanguage.g:7205:1: rule__ForLoop__CountingExpressionAssignment_5 : ( ruleForLoopCountingExpression ) ;
    public final void rule__ForLoop__CountingExpressionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7209:1: ( ( ruleForLoopCountingExpression ) )
            // InternalActionLanguage.g:7210:1: ( ruleForLoopCountingExpression )
            {
            // InternalActionLanguage.g:7210:1: ( ruleForLoopCountingExpression )
            // InternalActionLanguage.g:7211:1: ruleForLoopCountingExpression
            {
             before(grammarAccess.getForLoopAccess().getCountingExpressionForLoopCountingExpressionParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleForLoopCountingExpression();

            state._fsp--;

             after(grammarAccess.getForLoopAccess().getCountingExpressionForLoopCountingExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__CountingExpressionAssignment_5"


    // $ANTLR start "rule__ForLoop__BlockAssignment_7"
    // InternalActionLanguage.g:7220:1: rule__ForLoop__BlockAssignment_7 : ( ruleBlock ) ;
    public final void rule__ForLoop__BlockAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7224:1: ( ( ruleBlock ) )
            // InternalActionLanguage.g:7225:1: ( ruleBlock )
            {
            // InternalActionLanguage.g:7225:1: ( ruleBlock )
            // InternalActionLanguage.g:7226:1: ruleBlock
            {
             before(grammarAccess.getForLoopAccess().getBlockBlockParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getForLoopAccess().getBlockBlockParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__BlockAssignment_7"


    // $ANTLR start "rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0"
    // InternalActionLanguage.g:7235:1: rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 : ( ruleTypedNamedElementExpression ) ;
    public final void rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7239:1: ( ( ruleTypedNamedElementExpression ) )
            // InternalActionLanguage.g:7240:1: ( ruleTypedNamedElementExpression )
            {
            // InternalActionLanguage.g:7240:1: ( ruleTypedNamedElementExpression )
            // InternalActionLanguage.g:7241:1: ruleTypedNamedElementExpression
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getLhs_typedNamedElementExpressionTypedNamedElementExpressionParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypedNamedElementExpression();

            state._fsp--;

             after(grammarAccess.getForLoopCountingExpressionAccess().getLhs_typedNamedElementExpressionTypedNamedElementExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0"


    // $ANTLR start "rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0"
    // InternalActionLanguage.g:7250:1: rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 : ( ruleUnaryPostIncrementDecrementOperator ) ;
    public final void rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7254:1: ( ( ruleUnaryPostIncrementDecrementOperator ) )
            // InternalActionLanguage.g:7255:1: ( ruleUnaryPostIncrementDecrementOperator )
            {
            // InternalActionLanguage.g:7255:1: ( ruleUnaryPostIncrementDecrementOperator )
            // InternalActionLanguage.g:7256:1: ruleUnaryPostIncrementDecrementOperator
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorUnaryPostIncrementDecrementOperatorEnumRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnaryPostIncrementDecrementOperator();

            state._fsp--;

             after(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorUnaryPostIncrementDecrementOperatorEnumRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0"


    // $ANTLR start "rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0"
    // InternalActionLanguage.g:7265:1: rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 : ( ruleAssignOperator ) ;
    public final void rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7269:1: ( ( ruleAssignOperator ) )
            // InternalActionLanguage.g:7270:1: ( ruleAssignOperator )
            {
            // InternalActionLanguage.g:7270:1: ( ruleAssignOperator )
            // InternalActionLanguage.g:7271:1: ruleAssignOperator
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAssignOperator();

            state._fsp--;

             after(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0"


    // $ANTLR start "rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1"
    // InternalActionLanguage.g:7280:1: rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 : ( ruleExpression ) ;
    public final void rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7284:1: ( ( ruleExpression ) )
            // InternalActionLanguage.g:7285:1: ( ruleExpression )
            {
            // InternalActionLanguage.g:7285:1: ( ruleExpression )
            // InternalActionLanguage.g:7286:1: ruleExpression
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getRhs_assignExpressionExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getForLoopCountingExpressionAccess().getRhs_assignExpressionExpressionParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1"


    // $ANTLR start "rule__WhileLoop__LoopTestAssignment_2"
    // InternalActionLanguage.g:7295:1: rule__WhileLoop__LoopTestAssignment_2 : ( ruleExpression ) ;
    public final void rule__WhileLoop__LoopTestAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7299:1: ( ( ruleExpression ) )
            // InternalActionLanguage.g:7300:1: ( ruleExpression )
            {
            // InternalActionLanguage.g:7300:1: ( ruleExpression )
            // InternalActionLanguage.g:7301:1: ruleExpression
            {
             before(grammarAccess.getWhileLoopAccess().getLoopTestExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhileLoopAccess().getLoopTestExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__LoopTestAssignment_2"


    // $ANTLR start "rule__WhileLoop__BlockAssignment_4"
    // InternalActionLanguage.g:7310:1: rule__WhileLoop__BlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__WhileLoop__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7314:1: ( ( ruleBlock ) )
            // InternalActionLanguage.g:7315:1: ( ruleBlock )
            {
            // InternalActionLanguage.g:7315:1: ( ruleBlock )
            // InternalActionLanguage.g:7316:1: ruleBlock
            {
             before(grammarAccess.getWhileLoopAccess().getBlockBlockParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getWhileLoopAccess().getBlockBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__BlockAssignment_4"


    // $ANTLR start "rule__DoWhileLoop__BlockAssignment_1"
    // InternalActionLanguage.g:7325:1: rule__DoWhileLoop__BlockAssignment_1 : ( ruleBlock ) ;
    public final void rule__DoWhileLoop__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7329:1: ( ( ruleBlock ) )
            // InternalActionLanguage.g:7330:1: ( ruleBlock )
            {
            // InternalActionLanguage.g:7330:1: ( ruleBlock )
            // InternalActionLanguage.g:7331:1: ruleBlock
            {
             before(grammarAccess.getDoWhileLoopAccess().getBlockBlockParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getDoWhileLoopAccess().getBlockBlockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__BlockAssignment_1"


    // $ANTLR start "rule__DoWhileLoop__LoopTestAssignment_4"
    // InternalActionLanguage.g:7340:1: rule__DoWhileLoop__LoopTestAssignment_4 : ( ruleExpression ) ;
    public final void rule__DoWhileLoop__LoopTestAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7344:1: ( ( ruleExpression ) )
            // InternalActionLanguage.g:7345:1: ( ruleExpression )
            {
            // InternalActionLanguage.g:7345:1: ( ruleExpression )
            // InternalActionLanguage.g:7346:1: ruleExpression
            {
             before(grammarAccess.getDoWhileLoopAccess().getLoopTestExpressionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getDoWhileLoopAccess().getLoopTestExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__LoopTestAssignment_4"


    // $ANTLR start "rule__IfStatement__IfConditionAssignment_2"
    // InternalActionLanguage.g:7355:1: rule__IfStatement__IfConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__IfStatement__IfConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7359:1: ( ( ruleExpression ) )
            // InternalActionLanguage.g:7360:1: ( ruleExpression )
            {
            // InternalActionLanguage.g:7360:1: ( ruleExpression )
            // InternalActionLanguage.g:7361:1: ruleExpression
            {
             before(grammarAccess.getIfStatementAccess().getIfConditionExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getIfConditionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__IfConditionAssignment_2"


    // $ANTLR start "rule__IfStatement__IfBlockAssignment_4"
    // InternalActionLanguage.g:7370:1: rule__IfStatement__IfBlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__IfStatement__IfBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7374:1: ( ( ruleBlock ) )
            // InternalActionLanguage.g:7375:1: ( ruleBlock )
            {
            // InternalActionLanguage.g:7375:1: ( ruleBlock )
            // InternalActionLanguage.g:7376:1: ruleBlock
            {
             before(grammarAccess.getIfStatementAccess().getIfBlockBlockParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getIfBlockBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__IfBlockAssignment_4"


    // $ANTLR start "rule__IfStatement__ElseIfStatementsAssignment_5"
    // InternalActionLanguage.g:7385:1: rule__IfStatement__ElseIfStatementsAssignment_5 : ( ruleElseIfStatement ) ;
    public final void rule__IfStatement__ElseIfStatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7389:1: ( ( ruleElseIfStatement ) )
            // InternalActionLanguage.g:7390:1: ( ruleElseIfStatement )
            {
            // InternalActionLanguage.g:7390:1: ( ruleElseIfStatement )
            // InternalActionLanguage.g:7391:1: ruleElseIfStatement
            {
             before(grammarAccess.getIfStatementAccess().getElseIfStatementsElseIfStatementParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleElseIfStatement();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getElseIfStatementsElseIfStatementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__ElseIfStatementsAssignment_5"


    // $ANTLR start "rule__IfStatement__ElseBlockAssignment_6_1"
    // InternalActionLanguage.g:7400:1: rule__IfStatement__ElseBlockAssignment_6_1 : ( ruleBlock ) ;
    public final void rule__IfStatement__ElseBlockAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7404:1: ( ( ruleBlock ) )
            // InternalActionLanguage.g:7405:1: ( ruleBlock )
            {
            // InternalActionLanguage.g:7405:1: ( ruleBlock )
            // InternalActionLanguage.g:7406:1: ruleBlock
            {
             before(grammarAccess.getIfStatementAccess().getElseBlockBlockParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getElseBlockBlockParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__ElseBlockAssignment_6_1"


    // $ANTLR start "rule__ElseIfStatement__ElseIfConditionAssignment_2"
    // InternalActionLanguage.g:7415:1: rule__ElseIfStatement__ElseIfConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__ElseIfStatement__ElseIfConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7419:1: ( ( ruleExpression ) )
            // InternalActionLanguage.g:7420:1: ( ruleExpression )
            {
            // InternalActionLanguage.g:7420:1: ( ruleExpression )
            // InternalActionLanguage.g:7421:1: ruleExpression
            {
             before(grammarAccess.getElseIfStatementAccess().getElseIfConditionExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getElseIfStatementAccess().getElseIfConditionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__ElseIfConditionAssignment_2"


    // $ANTLR start "rule__ElseIfStatement__ElseIfBlockAssignment_4"
    // InternalActionLanguage.g:7430:1: rule__ElseIfStatement__ElseIfBlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__ElseIfStatement__ElseIfBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7434:1: ( ( ruleBlock ) )
            // InternalActionLanguage.g:7435:1: ( ruleBlock )
            {
            // InternalActionLanguage.g:7435:1: ( ruleBlock )
            // InternalActionLanguage.g:7436:1: ruleBlock
            {
             before(grammarAccess.getElseIfStatementAccess().getElseIfBlockBlockParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getElseIfStatementAccess().getElseIfBlockBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__ElseIfBlockAssignment_4"


    // $ANTLR start "rule__ReturnStatement__ExpressionAssignment_2"
    // InternalActionLanguage.g:7445:1: rule__ReturnStatement__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__ReturnStatement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7449:1: ( ( ruleExpression ) )
            // InternalActionLanguage.g:7450:1: ( ruleExpression )
            {
            // InternalActionLanguage.g:7450:1: ( ruleExpression )
            // InternalActionLanguage.g:7451:1: ruleExpression
            {
             before(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__ExpressionAssignment_2"


    // $ANTLR start "rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0"
    // InternalActionLanguage.g:7460:1: rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 : ( ruleTypedNamedElementExpression ) ;
    public final void rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7464:1: ( ( ruleTypedNamedElementExpression ) )
            // InternalActionLanguage.g:7465:1: ( ruleTypedNamedElementExpression )
            {
            // InternalActionLanguage.g:7465:1: ( ruleTypedNamedElementExpression )
            // InternalActionLanguage.g:7466:1: ruleTypedNamedElementExpression
            {
             before(grammarAccess.getAssignmentAccess().getLhs_typedNamedElementExpressionTypedNamedElementExpressionParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypedNamedElementExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getLhs_typedNamedElementExpressionTypedNamedElementExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0"


    // $ANTLR start "rule__Assignment__AssignOperatorAssignment_1_0_0"
    // InternalActionLanguage.g:7475:1: rule__Assignment__AssignOperatorAssignment_1_0_0 : ( ruleAssignOperator ) ;
    public final void rule__Assignment__AssignOperatorAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7479:1: ( ( ruleAssignOperator ) )
            // InternalActionLanguage.g:7480:1: ( ruleAssignOperator )
            {
            // InternalActionLanguage.g:7480:1: ( ruleAssignOperator )
            // InternalActionLanguage.g:7481:1: ruleAssignOperator
            {
             before(grammarAccess.getAssignmentAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_0_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAssignOperator();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__AssignOperatorAssignment_1_0_0"


    // $ANTLR start "rule__Assignment__Rhs_assignExpressionAssignment_1_0_1"
    // InternalActionLanguage.g:7490:1: rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 : ( ruleInitializeExpression ) ;
    public final void rule__Assignment__Rhs_assignExpressionAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7494:1: ( ( ruleInitializeExpression ) )
            // InternalActionLanguage.g:7495:1: ( ruleInitializeExpression )
            {
            // InternalActionLanguage.g:7495:1: ( ruleInitializeExpression )
            // InternalActionLanguage.g:7496:1: ruleInitializeExpression
            {
             before(grammarAccess.getAssignmentAccess().getRhs_assignExpressionInitializeExpressionParserRuleCall_1_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInitializeExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getRhs_assignExpressionInitializeExpressionParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Rhs_assignExpressionAssignment_1_0_1"


    // $ANTLR start "rule__Assignment__IncrementDecrementOperatorAssignment_1_1"
    // InternalActionLanguage.g:7505:1: rule__Assignment__IncrementDecrementOperatorAssignment_1_1 : ( ruleUnaryPostIncrementDecrementOperator ) ;
    public final void rule__Assignment__IncrementDecrementOperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7509:1: ( ( ruleUnaryPostIncrementDecrementOperator ) )
            // InternalActionLanguage.g:7510:1: ( ruleUnaryPostIncrementDecrementOperator )
            {
            // InternalActionLanguage.g:7510:1: ( ruleUnaryPostIncrementDecrementOperator )
            // InternalActionLanguage.g:7511:1: ruleUnaryPostIncrementDecrementOperator
            {
             before(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorUnaryPostIncrementDecrementOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnaryPostIncrementDecrementOperator();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorUnaryPostIncrementDecrementOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__IncrementDecrementOperatorAssignment_1_1"


    // $ANTLR start "rule__ArrayInitializeExpression__ExpressionsAssignment_1"
    // InternalActionLanguage.g:7520:1: rule__ArrayInitializeExpression__ExpressionsAssignment_1 : ( ruleInitializeExpression ) ;
    public final void rule__ArrayInitializeExpression__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7524:1: ( ( ruleInitializeExpression ) )
            // InternalActionLanguage.g:7525:1: ( ruleInitializeExpression )
            {
            // InternalActionLanguage.g:7525:1: ( ruleInitializeExpression )
            // InternalActionLanguage.g:7526:1: ruleInitializeExpression
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsInitializeExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInitializeExpression();

            state._fsp--;

             after(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsInitializeExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__ExpressionsAssignment_1"


    // $ANTLR start "rule__ArrayInitializeExpression__ExpressionsAssignment_2_1"
    // InternalActionLanguage.g:7535:1: rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 : ( ruleInitializeExpression ) ;
    public final void rule__ArrayInitializeExpression__ExpressionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7539:1: ( ( ruleInitializeExpression ) )
            // InternalActionLanguage.g:7540:1: ( ruleInitializeExpression )
            {
            // InternalActionLanguage.g:7540:1: ( ruleInitializeExpression )
            // InternalActionLanguage.g:7541:1: ruleInitializeExpression
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsInitializeExpressionParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInitializeExpression();

            state._fsp--;

             after(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsInitializeExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__ExpressionsAssignment_2_1"


    // $ANTLR start "rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment"
    // InternalActionLanguage.g:7550:1: rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment : ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 ) ) ;
    public final void rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7554:1: ( ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 ) ) )
            // InternalActionLanguage.g:7555:1: ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 ) )
            {
            // InternalActionLanguage.g:7555:1: ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 ) )
            // InternalActionLanguage.g:7556:1: ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 )
            {
             before(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableAlternatives_0()); 
            // InternalActionLanguage.g:7557:1: ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 )
            // InternalActionLanguage.g:7557:2: rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment"


    // $ANTLR start "rule__LocalVariableDeclaration__DataTypeAssignment_0"
    // InternalActionLanguage.g:7566:1: rule__LocalVariableDeclaration__DataTypeAssignment_0 : ( ( ruleDATATYPE ) ) ;
    public final void rule__LocalVariableDeclaration__DataTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7570:1: ( ( ( ruleDATATYPE ) ) )
            // InternalActionLanguage.g:7571:1: ( ( ruleDATATYPE ) )
            {
            // InternalActionLanguage.g:7571:1: ( ( ruleDATATYPE ) )
            // InternalActionLanguage.g:7572:1: ( ruleDATATYPE )
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getDataTypeDataTypeCrossReference_0_0()); 
            // InternalActionLanguage.g:7573:1: ( ruleDATATYPE )
            // InternalActionLanguage.g:7574:1: ruleDATATYPE
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getDataTypeDataTypeDATATYPEParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDATATYPE();

            state._fsp--;

             after(grammarAccess.getLocalVariableDeclarationAccess().getDataTypeDataTypeDATATYPEParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getLocalVariableDeclarationAccess().getDataTypeDataTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__DataTypeAssignment_0"


    // $ANTLR start "rule__LocalVariableDeclaration__NameAssignment_1"
    // InternalActionLanguage.g:7585:1: rule__LocalVariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LocalVariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7589:1: ( ( RULE_ID ) )
            // InternalActionLanguage.g:7590:1: ( RULE_ID )
            {
            // InternalActionLanguage.g:7590:1: ( RULE_ID )
            // InternalActionLanguage.g:7591:1: RULE_ID
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getLocalVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1"
    // InternalActionLanguage.g:7600:1: rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 : ( ruleInitializeExpression ) ;
    public final void rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7604:1: ( ( ruleInitializeExpression ) )
            // InternalActionLanguage.g:7605:1: ( ruleInitializeExpression )
            {
            // InternalActionLanguage.g:7605:1: ( ruleInitializeExpression )
            // InternalActionLanguage.g:7606:1: ruleInitializeExpression
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getInitializeExpressionInitializeExpressionParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInitializeExpression();

            state._fsp--;

             after(grammarAccess.getLocalVariableDeclarationAccess().getInitializeExpressionInitializeExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1"


    // $ANTLR start "rule__LocalConstantDeclaration__ConstantAssignment_0"
    // InternalActionLanguage.g:7615:1: rule__LocalConstantDeclaration__ConstantAssignment_0 : ( ( 'const' ) ) ;
    public final void rule__LocalConstantDeclaration__ConstantAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7619:1: ( ( ( 'const' ) ) )
            // InternalActionLanguage.g:7620:1: ( ( 'const' ) )
            {
            // InternalActionLanguage.g:7620:1: ( ( 'const' ) )
            // InternalActionLanguage.g:7621:1: ( 'const' )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getConstantConstKeyword_0_0()); 
            // InternalActionLanguage.g:7622:1: ( 'const' )
            // InternalActionLanguage.g:7623:1: 'const'
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getConstantConstKeyword_0_0()); 
            match(input,57,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getLocalConstantDeclarationAccess().getConstantConstKeyword_0_0()); 

            }

             after(grammarAccess.getLocalConstantDeclarationAccess().getConstantConstKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__ConstantAssignment_0"


    // $ANTLR start "rule__LocalConstantDeclaration__DataTypeAssignment_1"
    // InternalActionLanguage.g:7638:1: rule__LocalConstantDeclaration__DataTypeAssignment_1 : ( ( ruleDATATYPE ) ) ;
    public final void rule__LocalConstantDeclaration__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7642:1: ( ( ( ruleDATATYPE ) ) )
            // InternalActionLanguage.g:7643:1: ( ( ruleDATATYPE ) )
            {
            // InternalActionLanguage.g:7643:1: ( ( ruleDATATYPE ) )
            // InternalActionLanguage.g:7644:1: ( ruleDATATYPE )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getDataTypeDataTypeCrossReference_1_0()); 
            // InternalActionLanguage.g:7645:1: ( ruleDATATYPE )
            // InternalActionLanguage.g:7646:1: ruleDATATYPE
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getDataTypeDataTypeDATATYPEParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDATATYPE();

            state._fsp--;

             after(grammarAccess.getLocalConstantDeclarationAccess().getDataTypeDataTypeDATATYPEParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getLocalConstantDeclarationAccess().getDataTypeDataTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__DataTypeAssignment_1"


    // $ANTLR start "rule__LocalConstantDeclaration__NameAssignment_2"
    // InternalActionLanguage.g:7657:1: rule__LocalConstantDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LocalConstantDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7661:1: ( ( RULE_ID ) )
            // InternalActionLanguage.g:7662:1: ( RULE_ID )
            {
            // InternalActionLanguage.g:7662:1: ( RULE_ID )
            // InternalActionLanguage.g:7663:1: RULE_ID
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getLocalConstantDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__NameAssignment_2"


    // $ANTLR start "rule__LocalConstantDeclaration__InitializeExpressionAssignment_4"
    // InternalActionLanguage.g:7672:1: rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 : ( ruleInitializeExpression ) ;
    public final void rule__LocalConstantDeclaration__InitializeExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7676:1: ( ( ruleInitializeExpression ) )
            // InternalActionLanguage.g:7677:1: ( ruleInitializeExpression )
            {
            // InternalActionLanguage.g:7677:1: ( ruleInitializeExpression )
            // InternalActionLanguage.g:7678:1: ruleInitializeExpression
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getInitializeExpressionInitializeExpressionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInitializeExpression();

            state._fsp--;

             after(grammarAccess.getLocalConstantDeclarationAccess().getInitializeExpressionInitializeExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__InitializeExpressionAssignment_4"


    // $ANTLR start "rule__NondeterministicChoiceExpression__DataTypeAssignment_0"
    // InternalActionLanguage.g:7687:1: rule__NondeterministicChoiceExpression__DataTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NondeterministicChoiceExpression__DataTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7691:1: ( ( ( RULE_ID ) ) )
            // InternalActionLanguage.g:7692:1: ( ( RULE_ID ) )
            {
            // InternalActionLanguage.g:7692:1: ( ( RULE_ID ) )
            // InternalActionLanguage.g:7693:1: ( RULE_ID )
            {
             before(grammarAccess.getNondeterministicChoiceExpressionAccess().getDataTypePrimitiveDataTypeCrossReference_0_0()); 
            // InternalActionLanguage.g:7694:1: ( RULE_ID )
            // InternalActionLanguage.g:7695:1: RULE_ID
            {
             before(grammarAccess.getNondeterministicChoiceExpressionAccess().getDataTypePrimitiveDataTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getNondeterministicChoiceExpressionAccess().getDataTypePrimitiveDataTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getNondeterministicChoiceExpressionAccess().getDataTypePrimitiveDataTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NondeterministicChoiceExpression__DataTypeAssignment_0"


    // $ANTLR start "rule__NondeterministicChoiceExpression__RangeAssignment_1"
    // InternalActionLanguage.g:7706:1: rule__NondeterministicChoiceExpression__RangeAssignment_1 : ( ruleRange ) ;
    public final void rule__NondeterministicChoiceExpression__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7710:1: ( ( ruleRange ) )
            // InternalActionLanguage.g:7711:1: ( ruleRange )
            {
            // InternalActionLanguage.g:7711:1: ( ruleRange )
            // InternalActionLanguage.g:7712:1: ruleRange
            {
             before(grammarAccess.getNondeterministicChoiceExpressionAccess().getRangeRangeParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getNondeterministicChoiceExpressionAccess().getRangeRangeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NondeterministicChoiceExpression__RangeAssignment_1"


    // $ANTLR start "rule__Range__LowerBoundAssignment_1"
    // InternalActionLanguage.g:7721:1: rule__Range__LowerBoundAssignment_1 : ( ruleLONG ) ;
    public final void rule__Range__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7725:1: ( ( ruleLONG ) )
            // InternalActionLanguage.g:7726:1: ( ruleLONG )
            {
            // InternalActionLanguage.g:7726:1: ( ruleLONG )
            // InternalActionLanguage.g:7727:1: ruleLONG
            {
             before(grammarAccess.getRangeAccess().getLowerBoundLONGParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLONG();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getLowerBoundLONGParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__LowerBoundAssignment_1"


    // $ANTLR start "rule__Range__UpperBoundAssignment_3"
    // InternalActionLanguage.g:7736:1: rule__Range__UpperBoundAssignment_3 : ( ruleLONG ) ;
    public final void rule__Range__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7740:1: ( ( ruleLONG ) )
            // InternalActionLanguage.g:7741:1: ( ruleLONG )
            {
            // InternalActionLanguage.g:7741:1: ( ruleLONG )
            // InternalActionLanguage.g:7742:1: ruleLONG
            {
             before(grammarAccess.getRangeAccess().getUpperBoundLONGParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLONG();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getUpperBoundLONGParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__UpperBoundAssignment_3"


    // $ANTLR start "rule__LogicalOrExpression__OperatorAssignment_1_1"
    // InternalActionLanguage.g:7751:1: rule__LogicalOrExpression__OperatorAssignment_1_1 : ( ruleLogicalOrOperator ) ;
    public final void rule__LogicalOrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7755:1: ( ( ruleLogicalOrOperator ) )
            // InternalActionLanguage.g:7756:1: ( ruleLogicalOrOperator )
            {
            // InternalActionLanguage.g:7756:1: ( ruleLogicalOrOperator )
            // InternalActionLanguage.g:7757:1: ruleLogicalOrOperator
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLogicalOrOperator();

            state._fsp--;

             after(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__LogicalOrExpression__RightExpressionAssignment_1_2"
    // InternalActionLanguage.g:7766:1: rule__LogicalOrExpression__RightExpressionAssignment_1_2 : ( ruleLogicalAndExpression ) ;
    public final void rule__LogicalOrExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7770:1: ( ( ruleLogicalAndExpression ) )
            // InternalActionLanguage.g:7771:1: ( ruleLogicalAndExpression )
            {
            // InternalActionLanguage.g:7771:1: ( ruleLogicalAndExpression )
            // InternalActionLanguage.g:7772:1: ruleLogicalAndExpression
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getRightExpressionLogicalAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLogicalAndExpression();

            state._fsp--;

             after(grammarAccess.getLogicalOrExpressionAccess().getRightExpressionLogicalAndExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__RightExpressionAssignment_1_2"


    // $ANTLR start "rule__LogicalAndExpression__OperatorAssignment_1_1"
    // InternalActionLanguage.g:7781:1: rule__LogicalAndExpression__OperatorAssignment_1_1 : ( ruleLogicalAndOperator ) ;
    public final void rule__LogicalAndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7785:1: ( ( ruleLogicalAndOperator ) )
            // InternalActionLanguage.g:7786:1: ( ruleLogicalAndOperator )
            {
            // InternalActionLanguage.g:7786:1: ( ruleLogicalAndOperator )
            // InternalActionLanguage.g:7787:1: ruleLogicalAndOperator
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLogicalAndOperator();

            state._fsp--;

             after(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__LogicalAndExpression__RightExpressionAssignment_1_2"
    // InternalActionLanguage.g:7796:1: rule__LogicalAndExpression__RightExpressionAssignment_1_2 : ( ruleComparisonExpression ) ;
    public final void rule__LogicalAndExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7800:1: ( ( ruleComparisonExpression ) )
            // InternalActionLanguage.g:7801:1: ( ruleComparisonExpression )
            {
            // InternalActionLanguage.g:7801:1: ( ruleComparisonExpression )
            // InternalActionLanguage.g:7802:1: ruleComparisonExpression
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getRightExpressionComparisonExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getLogicalAndExpressionAccess().getRightExpressionComparisonExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__RightExpressionAssignment_1_2"


    // $ANTLR start "rule__ComparisonExpression__OperatorAssignment_1_1"
    // InternalActionLanguage.g:7811:1: rule__ComparisonExpression__OperatorAssignment_1_1 : ( ruleComparingEQNEQOperator ) ;
    public final void rule__ComparisonExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7815:1: ( ( ruleComparingEQNEQOperator ) )
            // InternalActionLanguage.g:7816:1: ( ruleComparingEQNEQOperator )
            {
            // InternalActionLanguage.g:7816:1: ( ruleComparingEQNEQOperator )
            // InternalActionLanguage.g:7817:1: ruleComparingEQNEQOperator
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorComparingEQNEQOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleComparingEQNEQOperator();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getOperatorComparingEQNEQOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ComparisonExpression__RightExpressionAssignment_1_2"
    // InternalActionLanguage.g:7826:1: rule__ComparisonExpression__RightExpressionAssignment_1_2 : ( ruleComparisonHigherOpExpression ) ;
    public final void rule__ComparisonExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7830:1: ( ( ruleComparisonHigherOpExpression ) )
            // InternalActionLanguage.g:7831:1: ( ruleComparisonHigherOpExpression )
            {
            // InternalActionLanguage.g:7831:1: ( ruleComparisonHigherOpExpression )
            // InternalActionLanguage.g:7832:1: ruleComparisonHigherOpExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightExpressionComparisonHigherOpExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleComparisonHigherOpExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getRightExpressionComparisonHigherOpExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__RightExpressionAssignment_1_2"


    // $ANTLR start "rule__ComparisonHigherOpExpression__OperatorAssignment_1_1"
    // InternalActionLanguage.g:7841:1: rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 : ( ruleComparingRelOperator ) ;
    public final void rule__ComparisonHigherOpExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7845:1: ( ( ruleComparingRelOperator ) )
            // InternalActionLanguage.g:7846:1: ( ruleComparingRelOperator )
            {
            // InternalActionLanguage.g:7846:1: ( ruleComparingRelOperator )
            // InternalActionLanguage.g:7847:1: ruleComparingRelOperator
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getOperatorComparingRelOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleComparingRelOperator();

            state._fsp--;

             after(grammarAccess.getComparisonHigherOpExpressionAccess().getOperatorComparingRelOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2"
    // InternalActionLanguage.g:7856:1: rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 : ( ruleArithmeticExpression ) ;
    public final void rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7860:1: ( ( ruleArithmeticExpression ) )
            // InternalActionLanguage.g:7861:1: ( ruleArithmeticExpression )
            {
            // InternalActionLanguage.g:7861:1: ( ruleArithmeticExpression )
            // InternalActionLanguage.g:7862:1: ruleArithmeticExpression
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getRightExpressionArithmeticExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getComparisonHigherOpExpressionAccess().getRightExpressionArithmeticExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2"


    // $ANTLR start "rule__AdditionExpression__OperatorAssignment_1_1"
    // InternalActionLanguage.g:7871:1: rule__AdditionExpression__OperatorAssignment_1_1 : ( ruleAdditionOperator ) ;
    public final void rule__AdditionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7875:1: ( ( ruleAdditionOperator ) )
            // InternalActionLanguage.g:7876:1: ( ruleAdditionOperator )
            {
            // InternalActionLanguage.g:7876:1: ( ruleAdditionOperator )
            // InternalActionLanguage.g:7877:1: ruleAdditionOperator
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAdditionOperator();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AdditionExpression__RightExpressionAssignment_1_2"
    // InternalActionLanguage.g:7886:1: rule__AdditionExpression__RightExpressionAssignment_1_2 : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7890:1: ( ( ruleMultiplicationExpression ) )
            // InternalActionLanguage.g:7891:1: ( ruleMultiplicationExpression )
            {
            // InternalActionLanguage.g:7891:1: ( ruleMultiplicationExpression )
            // InternalActionLanguage.g:7892:1: ruleMultiplicationExpression
            {
             before(grammarAccess.getAdditionExpressionAccess().getRightExpressionMultiplicationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionAccess().getRightExpressionMultiplicationExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__RightExpressionAssignment_1_2"


    // $ANTLR start "rule__MultiplicationExpression__OperatorAssignment_1_1_1"
    // InternalActionLanguage.g:7901:1: rule__MultiplicationExpression__OperatorAssignment_1_1_1 : ( ruleMultiplicationOperator ) ;
    public final void rule__MultiplicationExpression__OperatorAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7905:1: ( ( ruleMultiplicationOperator ) )
            // InternalActionLanguage.g:7906:1: ( ruleMultiplicationOperator )
            {
            // InternalActionLanguage.g:7906:1: ( ruleMultiplicationOperator )
            // InternalActionLanguage.g:7907:1: ruleMultiplicationOperator
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMultiplicationOperator();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__OperatorAssignment_1_1_1"


    // $ANTLR start "rule__MultiplicationExpression__RightExpressionAssignment_1_1_2"
    // InternalActionLanguage.g:7916:1: rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 : ( ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 ) ) ;
    public final void rule__MultiplicationExpression__RightExpressionAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7920:1: ( ( ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 ) ) )
            // InternalActionLanguage.g:7921:1: ( ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 ) )
            {
            // InternalActionLanguage.g:7921:1: ( ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 ) )
            // InternalActionLanguage.g:7922:1: ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAlternatives_1_1_2_0()); 
            // InternalActionLanguage.g:7923:1: ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 )
            // InternalActionLanguage.g:7923:2: rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAlternatives_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__RightExpressionAssignment_1_1_2"


    // $ANTLR start "rule__UnaryPreExpression__OperatorAssignment_1"
    // InternalActionLanguage.g:7932:1: rule__UnaryPreExpression__OperatorAssignment_1 : ( ruleUnaryPreOperator ) ;
    public final void rule__UnaryPreExpression__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7936:1: ( ( ruleUnaryPreOperator ) )
            // InternalActionLanguage.g:7937:1: ( ruleUnaryPreOperator )
            {
            // InternalActionLanguage.g:7937:1: ( ruleUnaryPreOperator )
            // InternalActionLanguage.g:7938:1: ruleUnaryPreOperator
            {
             before(grammarAccess.getUnaryPreExpressionAccess().getOperatorUnaryPreOperatorEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnaryPreOperator();

            state._fsp--;

             after(grammarAccess.getUnaryPreExpressionAccess().getOperatorUnaryPreOperatorEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryPreExpression__OperatorAssignment_1"


    // $ANTLR start "rule__UnaryPreExpression__EnclosedExpressionAssignment_2"
    // InternalActionLanguage.g:7947:1: rule__UnaryPreExpression__EnclosedExpressionAssignment_2 : ( ruleTypeCastExpression ) ;
    public final void rule__UnaryPreExpression__EnclosedExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7951:1: ( ( ruleTypeCastExpression ) )
            // InternalActionLanguage.g:7952:1: ( ruleTypeCastExpression )
            {
            // InternalActionLanguage.g:7952:1: ( ruleTypeCastExpression )
            // InternalActionLanguage.g:7953:1: ruleTypeCastExpression
            {
             before(grammarAccess.getUnaryPreExpressionAccess().getEnclosedExpressionTypeCastExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeCastExpression();

            state._fsp--;

             after(grammarAccess.getUnaryPreExpressionAccess().getEnclosedExpressionTypeCastExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryPreExpression__EnclosedExpressionAssignment_2"


    // $ANTLR start "rule__TypeCastExpression__DataTypeAssignment_1_2"
    // InternalActionLanguage.g:7962:1: rule__TypeCastExpression__DataTypeAssignment_1_2 : ( ( ruleDATATYPE ) ) ;
    public final void rule__TypeCastExpression__DataTypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7966:1: ( ( ( ruleDATATYPE ) ) )
            // InternalActionLanguage.g:7967:1: ( ( ruleDATATYPE ) )
            {
            // InternalActionLanguage.g:7967:1: ( ( ruleDATATYPE ) )
            // InternalActionLanguage.g:7968:1: ( ruleDATATYPE )
            {
             before(grammarAccess.getTypeCastExpressionAccess().getDataTypeDataTypeCrossReference_1_2_0()); 
            // InternalActionLanguage.g:7969:1: ( ruleDATATYPE )
            // InternalActionLanguage.g:7970:1: ruleDATATYPE
            {
             before(grammarAccess.getTypeCastExpressionAccess().getDataTypeDataTypeDATATYPEParserRuleCall_1_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDATATYPE();

            state._fsp--;

             after(grammarAccess.getTypeCastExpressionAccess().getDataTypeDataTypeDATATYPEParserRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getTypeCastExpressionAccess().getDataTypeDataTypeCrossReference_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__DataTypeAssignment_1_2"


    // $ANTLR start "rule__TypeCastExpression__EnclosedExpressionAssignment_1_4"
    // InternalActionLanguage.g:7981:1: rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 : ( ruleOperand ) ;
    public final void rule__TypeCastExpression__EnclosedExpressionAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:7985:1: ( ( ruleOperand ) )
            // InternalActionLanguage.g:7986:1: ( ruleOperand )
            {
            // InternalActionLanguage.g:7986:1: ( ruleOperand )
            // InternalActionLanguage.g:7987:1: ruleOperand
            {
             before(grammarAccess.getTypeCastExpressionAccess().getEnclosedExpressionOperandParserRuleCall_1_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOperand();

            state._fsp--;

             after(grammarAccess.getTypeCastExpressionAccess().getEnclosedExpressionOperandParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__EnclosedExpressionAssignment_1_4"


    // $ANTLR start "rule__LiteralExpression__ValueAssignment_1"
    // InternalActionLanguage.g:7996:1: rule__LiteralExpression__ValueAssignment_1 : ( ruleLiteral ) ;
    public final void rule__LiteralExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:8000:1: ( ( ruleLiteral ) )
            // InternalActionLanguage.g:8001:1: ( ruleLiteral )
            {
            // InternalActionLanguage.g:8001:1: ( ruleLiteral )
            // InternalActionLanguage.g:8002:1: ruleLiteral
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralExpressionAccess().getValueLiteralParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__ValueAssignment_1"


    // $ANTLR start "rule__TimeValueExpression__TimeValueAssignment"
    // InternalActionLanguage.g:8011:1: rule__TimeValueExpression__TimeValueAssignment : ( ( RULE_MINORMAXKEYWORD ) ) ;
    public final void rule__TimeValueExpression__TimeValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:8015:1: ( ( ( RULE_MINORMAXKEYWORD ) ) )
            // InternalActionLanguage.g:8016:1: ( ( RULE_MINORMAXKEYWORD ) )
            {
            // InternalActionLanguage.g:8016:1: ( ( RULE_MINORMAXKEYWORD ) )
            // InternalActionLanguage.g:8017:1: ( RULE_MINORMAXKEYWORD )
            {
             before(grammarAccess.getTimeValueExpressionAccess().getTimeValueTimeValueCrossReference_0()); 
            // InternalActionLanguage.g:8018:1: ( RULE_MINORMAXKEYWORD )
            // InternalActionLanguage.g:8019:1: RULE_MINORMAXKEYWORD
            {
             before(grammarAccess.getTimeValueExpressionAccess().getTimeValueTimeValueMINORMAXKEYWORDTerminalRuleCall_0_1()); 
            match(input,RULE_MINORMAXKEYWORD,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTimeValueExpressionAccess().getTimeValueTimeValueMINORMAXKEYWORDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getTimeValueExpressionAccess().getTimeValueTimeValueCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeValueExpression__TimeValueAssignment"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2"
    // InternalActionLanguage.g:8030:1: rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 : ( rulePositionSelectorExpression ) ;
    public final void rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:8034:1: ( ( rulePositionSelectorExpression ) )
            // InternalActionLanguage.g:8035:1: ( rulePositionSelectorExpression )
            {
            // InternalActionLanguage.g:8035:1: ( rulePositionSelectorExpression )
            // InternalActionLanguage.g:8036:1: rulePositionSelectorExpression
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getPositionPositionSelectorExpressionParserRuleCall_1_0_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            rulePositionSelectorExpression();

            state._fsp--;

             after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getPositionPositionSelectorExpressionParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1"
    // InternalActionLanguage.g:8045:1: rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 : ( ruleIncrementDecrementOperatorExpression ) ;
    public final void rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:8049:1: ( ( ruleIncrementDecrementOperatorExpression ) )
            // InternalActionLanguage.g:8050:1: ( ruleIncrementDecrementOperatorExpression )
            {
            // InternalActionLanguage.g:8050:1: ( ruleIncrementDecrementOperatorExpression )
            // InternalActionLanguage.g:8051:1: ruleIncrementDecrementOperatorExpression
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getIncrementDecrementOperatorIncrementDecrementOperatorExpressionEnumRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleIncrementDecrementOperatorExpression();

            state._fsp--;

             after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getIncrementDecrementOperatorIncrementDecrementOperatorExpressionEnumRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1"


    // $ANTLR start "rule__TypedNamedElementExpression__TypedNamedElementAssignment_0"
    // InternalActionLanguage.g:8060:1: rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypedNamedElementExpression__TypedNamedElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:8064:1: ( ( ( RULE_ID ) ) )
            // InternalActionLanguage.g:8065:1: ( ( RULE_ID ) )
            {
            // InternalActionLanguage.g:8065:1: ( ( RULE_ID ) )
            // InternalActionLanguage.g:8066:1: ( RULE_ID )
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementTypedNamedElementCrossReference_0_0()); 
            // InternalActionLanguage.g:8067:1: ( RULE_ID )
            // InternalActionLanguage.g:8068:1: RULE_ID
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementTypedNamedElementIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementTypedNamedElementIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementTypedNamedElementCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedNamedElementExpression__TypedNamedElementAssignment_0"


    // $ANTLR start "rule__TypedNamedElementExpression__ElementAccessorsAssignment_1"
    // InternalActionLanguage.g:8079:1: rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 : ( ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 ) ) ;
    public final void rule__TypedNamedElementExpression__ElementAccessorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:8083:1: ( ( ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 ) ) )
            // InternalActionLanguage.g:8084:1: ( ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 ) )
            {
            // InternalActionLanguage.g:8084:1: ( ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 ) )
            // InternalActionLanguage.g:8085:1: ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 )
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsAlternatives_1_0()); 
            // InternalActionLanguage.g:8086:1: ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 )
            // InternalActionLanguage.g:8086:2: rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedNamedElementExpression__ElementAccessorsAssignment_1"


    // $ANTLR start "rule__ArrayIndexExpression__IndexAssignment_1"
    // InternalActionLanguage.g:8095:1: rule__ArrayIndexExpression__IndexAssignment_1 : ( ruleArithmeticExpression ) ;
    public final void rule__ArrayIndexExpression__IndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:8099:1: ( ( ruleArithmeticExpression ) )
            // InternalActionLanguage.g:8100:1: ( ruleArithmeticExpression )
            {
            // InternalActionLanguage.g:8100:1: ( ruleArithmeticExpression )
            // InternalActionLanguage.g:8101:1: ruleArithmeticExpression
            {
             before(grammarAccess.getArrayIndexExpressionAccess().getIndexArithmeticExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getArrayIndexExpressionAccess().getIndexArithmeticExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayIndexExpression__IndexAssignment_1"


    // $ANTLR start "rule__AttributeAccessorExpression__AttributeAssignment_1"
    // InternalActionLanguage.g:8110:1: rule__AttributeAccessorExpression__AttributeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeAccessorExpression__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:8114:1: ( ( ( RULE_ID ) ) )
            // InternalActionLanguage.g:8115:1: ( ( RULE_ID ) )
            {
            // InternalActionLanguage.g:8115:1: ( ( RULE_ID ) )
            // InternalActionLanguage.g:8116:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccessorExpressionAccess().getAttributeAttributeCrossReference_1_0()); 
            // InternalActionLanguage.g:8117:1: ( RULE_ID )
            // InternalActionLanguage.g:8118:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccessorExpressionAccess().getAttributeAttributeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeAccessorExpressionAccess().getAttributeAttributeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAttributeAccessorExpressionAccess().getAttributeAttributeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAccessorExpression__AttributeAssignment_1"


    // $ANTLR start "rule__NoAttributeSelectorExpression__PositionAssignment"
    // InternalActionLanguage.g:8129:1: rule__NoAttributeSelectorExpression__PositionAssignment : ( rulePositionSelectorExpression ) ;
    public final void rule__NoAttributeSelectorExpression__PositionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:8133:1: ( ( rulePositionSelectorExpression ) )
            // InternalActionLanguage.g:8134:1: ( rulePositionSelectorExpression )
            {
            // InternalActionLanguage.g:8134:1: ( rulePositionSelectorExpression )
            // InternalActionLanguage.g:8135:1: rulePositionSelectorExpression
            {
             before(grammarAccess.getNoAttributeSelectorExpressionAccess().getPositionPositionSelectorExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            rulePositionSelectorExpression();

            state._fsp--;

             after(grammarAccess.getNoAttributeSelectorExpressionAccess().getPositionPositionSelectorExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoAttributeSelectorExpression__PositionAssignment"


    // $ANTLR start "rule__PositionSelectorExpression__KindAssignment_0"
    // InternalActionLanguage.g:8144:1: rule__PositionSelectorExpression__KindAssignment_0 : ( rulePositionSelectorKind ) ;
    public final void rule__PositionSelectorExpression__KindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:8148:1: ( ( rulePositionSelectorKind ) )
            // InternalActionLanguage.g:8149:1: ( rulePositionSelectorKind )
            {
            // InternalActionLanguage.g:8149:1: ( rulePositionSelectorKind )
            // InternalActionLanguage.g:8150:1: rulePositionSelectorKind
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getKindPositionSelectorKindEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            rulePositionSelectorKind();

            state._fsp--;

             after(grammarAccess.getPositionSelectorExpressionAccess().getKindPositionSelectorKindEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionSelectorExpression__KindAssignment_0"


    // $ANTLR start "rule__PositionSelectorExpression__SuccessorAssignment_1_1"
    // InternalActionLanguage.g:8159:1: rule__PositionSelectorExpression__SuccessorAssignment_1_1 : ( rulePositionSelectorExpression ) ;
    public final void rule__PositionSelectorExpression__SuccessorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:8163:1: ( ( rulePositionSelectorExpression ) )
            // InternalActionLanguage.g:8164:1: ( rulePositionSelectorExpression )
            {
            // InternalActionLanguage.g:8164:1: ( rulePositionSelectorExpression )
            // InternalActionLanguage.g:8165:1: rulePositionSelectorExpression
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getSuccessorPositionSelectorExpressionParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            rulePositionSelectorExpression();

            state._fsp--;

             after(grammarAccess.getPositionSelectorExpressionAccess().getSuccessorPositionSelectorExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionSelectorExpression__SuccessorAssignment_1_1"


    // $ANTLR start "rule__OperationCall__OperationAssignment_0"
    // InternalActionLanguage.g:8174:1: rule__OperationCall__OperationAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__OperationCall__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:8178:1: ( ( ( RULE_ID ) ) )
            // InternalActionLanguage.g:8179:1: ( ( RULE_ID ) )
            {
            // InternalActionLanguage.g:8179:1: ( ( RULE_ID ) )
            // InternalActionLanguage.g:8180:1: ( RULE_ID )
            {
             before(grammarAccess.getOperationCallAccess().getOperationOperationCrossReference_0_0()); 
            // InternalActionLanguage.g:8181:1: ( RULE_ID )
            // InternalActionLanguage.g:8182:1: RULE_ID
            {
             before(grammarAccess.getOperationCallAccess().getOperationOperationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOperationCallAccess().getOperationOperationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getOperationCallAccess().getOperationOperationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__OperationAssignment_0"


    // $ANTLR start "rule__OperationCall__ParameterBindingAssignment_2_0"
    // InternalActionLanguage.g:8193:1: rule__OperationCall__ParameterBindingAssignment_2_0 : ( ruleParamaterBinding ) ;
    public final void rule__OperationCall__ParameterBindingAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:8197:1: ( ( ruleParamaterBinding ) )
            // InternalActionLanguage.g:8198:1: ( ruleParamaterBinding )
            {
            // InternalActionLanguage.g:8198:1: ( ruleParamaterBinding )
            // InternalActionLanguage.g:8199:1: ruleParamaterBinding
            {
             before(grammarAccess.getOperationCallAccess().getParameterBindingParamaterBindingParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParamaterBinding();

            state._fsp--;

             after(grammarAccess.getOperationCallAccess().getParameterBindingParamaterBindingParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__ParameterBindingAssignment_2_0"


    // $ANTLR start "rule__OperationCall__ParameterBindingAssignment_2_1_1"
    // InternalActionLanguage.g:8208:1: rule__OperationCall__ParameterBindingAssignment_2_1_1 : ( ruleParamaterBinding ) ;
    public final void rule__OperationCall__ParameterBindingAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:8212:1: ( ( ruleParamaterBinding ) )
            // InternalActionLanguage.g:8213:1: ( ruleParamaterBinding )
            {
            // InternalActionLanguage.g:8213:1: ( ruleParamaterBinding )
            // InternalActionLanguage.g:8214:1: ruleParamaterBinding
            {
             before(grammarAccess.getOperationCallAccess().getParameterBindingParamaterBindingParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParamaterBinding();

            state._fsp--;

             after(grammarAccess.getOperationCallAccess().getParameterBindingParamaterBindingParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__ParameterBindingAssignment_2_1_1"


    // $ANTLR start "rule__ParamaterBinding__ParameterAssignment_1"
    // InternalActionLanguage.g:8223:1: rule__ParamaterBinding__ParameterAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParamaterBinding__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:8227:1: ( ( ( RULE_ID ) ) )
            // InternalActionLanguage.g:8228:1: ( ( RULE_ID ) )
            {
            // InternalActionLanguage.g:8228:1: ( ( RULE_ID ) )
            // InternalActionLanguage.g:8229:1: ( RULE_ID )
            {
             before(grammarAccess.getParamaterBindingAccess().getParameterParameterCrossReference_1_0()); 
            // InternalActionLanguage.g:8230:1: ( RULE_ID )
            // InternalActionLanguage.g:8231:1: RULE_ID
            {
             before(grammarAccess.getParamaterBindingAccess().getParameterParameterIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParamaterBindingAccess().getParameterParameterIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getParamaterBindingAccess().getParameterParameterCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamaterBinding__ParameterAssignment_1"


    // $ANTLR start "rule__ParamaterBinding__ValueAssignment_3"
    // InternalActionLanguage.g:8242:1: rule__ParamaterBinding__ValueAssignment_3 : ( ruleExpression ) ;
    public final void rule__ParamaterBinding__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:8246:1: ( ( ruleExpression ) )
            // InternalActionLanguage.g:8247:1: ( ruleExpression )
            {
            // InternalActionLanguage.g:8247:1: ( ruleExpression )
            // InternalActionLanguage.g:8248:1: ruleExpression
            {
             before(grammarAccess.getParamaterBindingAccess().getValueExpressionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getParamaterBindingAccess().getValueExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamaterBinding__ValueAssignment_3"


    // $ANTLR start "rule__TriggerMessageExpression__MessageTypeAssignment_0"
    // InternalActionLanguage.g:8257:1: rule__TriggerMessageExpression__MessageTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TriggerMessageExpression__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:8261:1: ( ( ( RULE_ID ) ) )
            // InternalActionLanguage.g:8262:1: ( ( RULE_ID ) )
            {
            // InternalActionLanguage.g:8262:1: ( ( RULE_ID ) )
            // InternalActionLanguage.g:8263:1: ( RULE_ID )
            {
             before(grammarAccess.getTriggerMessageExpressionAccess().getMessageTypeMessageTypeCrossReference_0_0()); 
            // InternalActionLanguage.g:8264:1: ( RULE_ID )
            // InternalActionLanguage.g:8265:1: RULE_ID
            {
             before(grammarAccess.getTriggerMessageExpressionAccess().getMessageTypeMessageTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTriggerMessageExpressionAccess().getMessageTypeMessageTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTriggerMessageExpressionAccess().getMessageTypeMessageTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerMessageExpression__MessageTypeAssignment_0"


    // $ANTLR start "rule__TriggerMessageExpression__ParameterAssignment_2"
    // InternalActionLanguage.g:8276:1: rule__TriggerMessageExpression__ParameterAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__TriggerMessageExpression__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalActionLanguage.g:8280:1: ( ( ( RULE_ID ) ) )
            // InternalActionLanguage.g:8281:1: ( ( RULE_ID ) )
            {
            // InternalActionLanguage.g:8281:1: ( ( RULE_ID ) )
            // InternalActionLanguage.g:8282:1: ( RULE_ID )
            {
             before(grammarAccess.getTriggerMessageExpressionAccess().getParameterParameterCrossReference_2_0()); 
            // InternalActionLanguage.g:8283:1: ( RULE_ID )
            // InternalActionLanguage.g:8284:1: RULE_ID
            {
             before(grammarAccess.getTriggerMessageExpressionAccess().getParameterParameterIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTriggerMessageExpressionAccess().getParameterParameterIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTriggerMessageExpressionAccess().getParameterParameterCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerMessageExpression__ParameterAssignment_2"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\15\uffff";
    static final String dfa_2s = "\2\7\6\uffff\1\4\2\uffff\1\34\1\7";
    static final String dfa_3s = "\1\71\1\70\6\uffff\1\52\2\uffff\1\65\1\70";
    static final String dfa_4s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\1\1\10\2\uffff";
    static final String dfa_5s = "\15\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\41\uffff\1\2\3\uffff\1\3\1\4\1\uffff\1\5\2\uffff\1\6\5\uffff\1\7",
            "\1\7\11\uffff\5\11\24\uffff\1\12\11\uffff\1\10\3\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\4\11\7\uffff\1\11\14\uffff\1\11\3\uffff\6\11\3\uffff\1\11",
            "",
            "",
            "\5\11\24\uffff\1\14",
            "\1\7\11\uffff\5\11\36\uffff\1\10\3\uffff\1\11"
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
            return "1589:1: rule__ExpressionStartRule__Alternatives : ( ( ruleAssignment ) | ( ruleForLoop ) | ( ruleWhileLoop ) | ( ruleDoWhileLoop ) | ( ruleIfStatement ) | ( ruleReturnStatement ) | ( ruleLocalVariableOrConstantDeclarationStatement ) | ( ruleOperationCallStatement ) );";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\2\uffff\1\3\2\uffff\1\3\2\uffff\1\11\1\uffff";
    static final String dfa_9s = "\1\4\1\uffff\1\16\1\uffff\1\4\1\16\1\4\1\16\1\4\1\uffff";
    static final String dfa_10s = "\1\64\1\uffff\1\70\1\uffff\1\52\1\66\1\64\2\66\1\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\uffff\1\3\5\uffff\1\2";
    static final String dfa_12s = "\12\uffff}>";
    static final String[] dfa_13s = {
            "\3\3\1\2\1\3\7\uffff\1\3\14\uffff\1\3\3\uffff\6\3\3\uffff\1\3\11\uffff\1\1",
            "",
            "\2\3\1\uffff\2\3\3\uffff\2\3\1\4\10\3\11\uffff\2\3\10\uffff\5\3",
            "",
            "\1\5\4\3\7\uffff\1\3\14\uffff\1\3\3\uffff\6\3\3\uffff\1\3",
            "\2\3\6\uffff\2\3\4\uffff\5\3\12\uffff\1\3\11\uffff\1\3\1\6",
            "\1\7\4\3\7\uffff\1\3\14\uffff\1\3\3\uffff\6\3\3\uffff\1\3\11\uffff\1\3",
            "\2\3\6\uffff\5\3\1\10\5\3\24\uffff\2\3",
            "\5\3\7\uffff\1\3\14\uffff\1\3\3\uffff\6\3\3\uffff\1\3\1\11\11\uffff\2\11",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1669:1: rule__InitializeExpression__Alternatives : ( ( ruleArrayInitializeExpression ) | ( ruleNondeterministicChoiceExpression ) | ( ruleExpression ) );";
        }
    }
    static final String dfa_14s = "\11\uffff";
    static final String dfa_15s = "\5\uffff\1\2\3\uffff";
    static final String dfa_16s = "\2\4\1\uffff\1\16\2\4\1\34\1\uffff\1\16";
    static final String dfa_17s = "\2\52\1\uffff\1\70\1\52\1\66\1\65\1\uffff\1\70";
    static final String dfa_18s = "\2\uffff\1\1\4\uffff\1\2\1\uffff";
    static final String dfa_19s = "\11\uffff}>";
    static final String[] dfa_20s = {
            "\5\2\7\uffff\1\2\21\uffff\5\2\3\uffff\1\1",
            "\3\2\1\3\1\2\7\uffff\1\2\14\uffff\1\2\3\uffff\6\2\3\uffff\1\2",
            "",
            "\2\2\1\uffff\2\2\3\uffff\13\2\11\uffff\1\2\1\uffff\1\5\7\uffff\1\4\2\uffff\2\2",
            "\1\6\4\2\7\uffff\1\2\14\uffff\1\2\3\uffff\6\2\3\uffff\1\2",
            "\5\7\5\uffff\2\2\1\7\5\uffff\13\2\1\uffff\5\7\3\uffff\1\7\2\2\2\uffff\1\2\5\uffff\2\2",
            "\5\2\24\uffff\1\10",
            "",
            "\2\2\1\uffff\2\2\3\uffff\13\2\13\uffff\1\5\7\uffff\1\4\2\uffff\2\2"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "1763:1: rule__TypeCastExpression__Alternatives : ( ( ruleOperand ) | ( ( rule__TypeCastExpression__Group_1__0 ) ) );";
        }
    }
    static final String dfa_21s = "\3\uffff\1\10\6\uffff";
    static final String dfa_22s = "\1\4\2\uffff\1\16\3\uffff\1\7\2\uffff";
    static final String dfa_23s = "\1\52\2\uffff\1\70\3\uffff\1\46\2\uffff";
    static final String dfa_24s = "\1\uffff\1\1\1\2\1\uffff\1\4\1\7\1\5\1\uffff\1\3\1\6";
    static final String[] dfa_25s = {
            "\3\2\1\3\1\4\7\uffff\1\2\21\uffff\5\5\3\uffff\1\1",
            "",
            "",
            "\2\10\1\uffff\2\10\3\uffff\13\10\11\uffff\1\6\2\10\2\uffff\1\10\4\uffff\3\10\1\7\1\10",
            "",
            "",
            "",
            "\1\11\32\uffff\5\10",
            "",
            ""
    };
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_7;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_12;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1785:1: rule__Operand__Alternatives : ( ( ( rule__Operand__Group_0__0 ) ) | ( ruleLiteralExpression ) | ( ruleExtendedTypedNamedElementExpression ) | ( ruleTimeValueExpression ) | ( ruleOperationCall ) | ( ruleTriggerMessageExpression ) | ( ruleNoAttributeSelectorExpression ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0209630000000080L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0209620000000082L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0209667E200101F0L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000003E0000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0006000000000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0004000000000002L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0219667E200101F0L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0060000000000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0040000000000002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000080000080000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000F000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000030000002L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000001C0000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000001C0000002L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000220000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0209667C000101F0L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000010070L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000060000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0110000000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0110000000000002L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000080L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0010000000000002L});
    }


}