package org.muml.storydiagram.expressions.common.ui.contentassist.antlr.internal; 

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
import org.muml.storydiagram.expressions.common.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'equiv'", "'imply'", "'or'", "'xor'", "'and'", "'not'", "'('", "')'", "'<='", "'<'", "'>='", "'>'", "'='", "'!='", "'~'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'.'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalExpressions.g"; }


     
     	private ExpressionsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ExpressionsGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleLExpression"
    // InternalExpressions.g:61:1: entryRuleLExpression : ruleLExpression EOF ;
    public final void entryRuleLExpression() throws RecognitionException {
        try {
            // InternalExpressions.g:62:1: ( ruleLExpression EOF )
            // InternalExpressions.g:63:1: ruleLExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLExpression"


    // $ANTLR start "ruleLExpression"
    // InternalExpressions.g:70:1: ruleLExpression : ( ruleEquivalent ) ;
    public final void ruleLExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:74:2: ( ( ruleEquivalent ) )
            // InternalExpressions.g:75:1: ( ruleEquivalent )
            {
            // InternalExpressions.g:75:1: ( ruleEquivalent )
            // InternalExpressions.g:76:1: ruleEquivalent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExpressionAccess().getEquivalentParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleEquivalent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExpressionAccess().getEquivalentParserRuleCall()); 
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
    // $ANTLR end "ruleLExpression"


    // $ANTLR start "entryRuleEquivalent"
    // InternalExpressions.g:89:1: entryRuleEquivalent : ruleEquivalent EOF ;
    public final void entryRuleEquivalent() throws RecognitionException {
        try {
            // InternalExpressions.g:90:1: ( ruleEquivalent EOF )
            // InternalExpressions.g:91:1: ruleEquivalent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEquivalent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEquivalent"


    // $ANTLR start "ruleEquivalent"
    // InternalExpressions.g:98:1: ruleEquivalent : ( ( rule__Equivalent__Group__0 ) ) ;
    public final void ruleEquivalent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:102:2: ( ( ( rule__Equivalent__Group__0 ) ) )
            // InternalExpressions.g:103:1: ( ( rule__Equivalent__Group__0 ) )
            {
            // InternalExpressions.g:103:1: ( ( rule__Equivalent__Group__0 ) )
            // InternalExpressions.g:104:1: ( rule__Equivalent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentAccess().getGroup()); 
            }
            // InternalExpressions.g:105:1: ( rule__Equivalent__Group__0 )
            // InternalExpressions.g:105:2: rule__Equivalent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equivalent__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentAccess().getGroup()); 
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
    // $ANTLR end "ruleEquivalent"


    // $ANTLR start "entryRuleImplication"
    // InternalExpressions.g:117:1: entryRuleImplication : ruleImplication EOF ;
    public final void entryRuleImplication() throws RecognitionException {
        try {
            // InternalExpressions.g:118:1: ( ruleImplication EOF )
            // InternalExpressions.g:119:1: ruleImplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleImplication"


    // $ANTLR start "ruleImplication"
    // InternalExpressions.g:126:1: ruleImplication : ( ( rule__Implication__Group__0 ) ) ;
    public final void ruleImplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:130:2: ( ( ( rule__Implication__Group__0 ) ) )
            // InternalExpressions.g:131:1: ( ( rule__Implication__Group__0 ) )
            {
            // InternalExpressions.g:131:1: ( ( rule__Implication__Group__0 ) )
            // InternalExpressions.g:132:1: ( rule__Implication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationAccess().getGroup()); 
            }
            // InternalExpressions.g:133:1: ( rule__Implication__Group__0 )
            // InternalExpressions.g:133:2: rule__Implication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Implication__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationAccess().getGroup()); 
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
    // $ANTLR end "ruleImplication"


    // $ANTLR start "entryRuleDisjunction"
    // InternalExpressions.g:145:1: entryRuleDisjunction : ruleDisjunction EOF ;
    public final void entryRuleDisjunction() throws RecognitionException {
        try {
            // InternalExpressions.g:146:1: ( ruleDisjunction EOF )
            // InternalExpressions.g:147:1: ruleDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDisjunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDisjunction"


    // $ANTLR start "ruleDisjunction"
    // InternalExpressions.g:154:1: ruleDisjunction : ( ( rule__Disjunction__Group__0 ) ) ;
    public final void ruleDisjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:158:2: ( ( ( rule__Disjunction__Group__0 ) ) )
            // InternalExpressions.g:159:1: ( ( rule__Disjunction__Group__0 ) )
            {
            // InternalExpressions.g:159:1: ( ( rule__Disjunction__Group__0 ) )
            // InternalExpressions.g:160:1: ( rule__Disjunction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getGroup()); 
            }
            // InternalExpressions.g:161:1: ( rule__Disjunction__Group__0 )
            // InternalExpressions.g:161:2: rule__Disjunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Disjunction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getGroup()); 
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
    // $ANTLR end "ruleDisjunction"


    // $ANTLR start "entryRuleConjunction"
    // InternalExpressions.g:173:1: entryRuleConjunction : ruleConjunction EOF ;
    public final void entryRuleConjunction() throws RecognitionException {
        try {
            // InternalExpressions.g:174:1: ( ruleConjunction EOF )
            // InternalExpressions.g:175:1: ruleConjunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConjunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // InternalExpressions.g:182:1: ruleConjunction : ( ( rule__Conjunction__Group__0 ) ) ;
    public final void ruleConjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:186:2: ( ( ( rule__Conjunction__Group__0 ) ) )
            // InternalExpressions.g:187:1: ( ( rule__Conjunction__Group__0 ) )
            {
            // InternalExpressions.g:187:1: ( ( rule__Conjunction__Group__0 ) )
            // InternalExpressions.g:188:1: ( rule__Conjunction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAccess().getGroup()); 
            }
            // InternalExpressions.g:189:1: ( rule__Conjunction__Group__0 )
            // InternalExpressions.g:189:2: rule__Conjunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conjunction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAccess().getGroup()); 
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
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleNegation"
    // InternalExpressions.g:201:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // InternalExpressions.g:202:1: ( ruleNegation EOF )
            // InternalExpressions.g:203:1: ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNegation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // InternalExpressions.g:210:1: ruleNegation : ( ( rule__Negation__Alternatives ) ) ;
    public final void ruleNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:214:2: ( ( ( rule__Negation__Alternatives ) ) )
            // InternalExpressions.g:215:1: ( ( rule__Negation__Alternatives ) )
            {
            // InternalExpressions.g:215:1: ( ( rule__Negation__Alternatives ) )
            // InternalExpressions.g:216:1: ( rule__Negation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getAlternatives()); 
            }
            // InternalExpressions.g:217:1: ( rule__Negation__Alternatives )
            // InternalExpressions.g:217:2: rule__Negation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Negation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationAccess().getAlternatives()); 
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
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleNegated"
    // InternalExpressions.g:229:1: entryRuleNegated : ruleNegated EOF ;
    public final void entryRuleNegated() throws RecognitionException {
        try {
            // InternalExpressions.g:230:1: ( ruleNegated EOF )
            // InternalExpressions.g:231:1: ruleNegated EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegatedRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNegated();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegatedRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNegated"


    // $ANTLR start "ruleNegated"
    // InternalExpressions.g:238:1: ruleNegated : ( ( rule__Negated__Group__0 ) ) ;
    public final void ruleNegated() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:242:2: ( ( ( rule__Negated__Group__0 ) ) )
            // InternalExpressions.g:243:1: ( ( rule__Negated__Group__0 ) )
            {
            // InternalExpressions.g:243:1: ( ( rule__Negated__Group__0 ) )
            // InternalExpressions.g:244:1: ( rule__Negated__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegatedAccess().getGroup()); 
            }
            // InternalExpressions.g:245:1: ( rule__Negated__Group__0 )
            // InternalExpressions.g:245:2: rule__Negated__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Negated__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegatedAccess().getGroup()); 
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
    // $ANTLR end "ruleNegated"


    // $ANTLR start "entryRuleCExpression"
    // InternalExpressions.g:257:1: entryRuleCExpression : ruleCExpression EOF ;
    public final void entryRuleCExpression() throws RecognitionException {
        try {
            // InternalExpressions.g:258:1: ( ruleCExpression EOF )
            // InternalExpressions.g:259:1: ruleCExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCExpression"


    // $ANTLR start "ruleCExpression"
    // InternalExpressions.g:266:1: ruleCExpression : ( ( rule__CExpression__Alternatives ) ) ;
    public final void ruleCExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:270:2: ( ( ( rule__CExpression__Alternatives ) ) )
            // InternalExpressions.g:271:1: ( ( rule__CExpression__Alternatives ) )
            {
            // InternalExpressions.g:271:1: ( ( rule__CExpression__Alternatives ) )
            // InternalExpressions.g:272:1: ( rule__CExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCExpressionAccess().getAlternatives()); 
            }
            // InternalExpressions.g:273:1: ( rule__CExpression__Alternatives )
            // InternalExpressions.g:273:2: rule__CExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "ruleCExpression"


    // $ANTLR start "entryRuleCompare"
    // InternalExpressions.g:285:1: entryRuleCompare : ruleCompare EOF ;
    public final void entryRuleCompare() throws RecognitionException {
        try {
            // InternalExpressions.g:286:1: ( ruleCompare EOF )
            // InternalExpressions.g:287:1: ruleCompare EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCompare"


    // $ANTLR start "ruleCompare"
    // InternalExpressions.g:294:1: ruleCompare : ( ( rule__Compare__Group__0 ) ) ;
    public final void ruleCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:298:2: ( ( ( rule__Compare__Group__0 ) ) )
            // InternalExpressions.g:299:1: ( ( rule__Compare__Group__0 ) )
            {
            // InternalExpressions.g:299:1: ( ( rule__Compare__Group__0 ) )
            // InternalExpressions.g:300:1: ( rule__Compare__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getGroup()); 
            }
            // InternalExpressions.g:301:1: ( rule__Compare__Group__0 )
            // InternalExpressions.g:301:2: rule__Compare__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getGroup()); 
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
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRuleSomeValue"
    // InternalExpressions.g:313:1: entryRuleSomeValue : ruleSomeValue EOF ;
    public final void entryRuleSomeValue() throws RecognitionException {
        try {
            // InternalExpressions.g:314:1: ( ruleSomeValue EOF )
            // InternalExpressions.g:315:1: ruleSomeValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSomeValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSomeValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSomeValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSomeValue"


    // $ANTLR start "ruleSomeValue"
    // InternalExpressions.g:322:1: ruleSomeValue : ( ( rule__SomeValue__Alternatives ) ) ;
    public final void ruleSomeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:326:2: ( ( ( rule__SomeValue__Alternatives ) ) )
            // InternalExpressions.g:327:1: ( ( rule__SomeValue__Alternatives ) )
            {
            // InternalExpressions.g:327:1: ( ( rule__SomeValue__Alternatives ) )
            // InternalExpressions.g:328:1: ( rule__SomeValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSomeValueAccess().getAlternatives()); 
            }
            // InternalExpressions.g:329:1: ( rule__SomeValue__Alternatives )
            // InternalExpressions.g:329:2: rule__SomeValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SomeValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSomeValueAccess().getAlternatives()); 
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
    // $ANTLR end "ruleSomeValue"


    // $ANTLR start "entryRuleAExpression"
    // InternalExpressions.g:341:1: entryRuleAExpression : ruleAExpression EOF ;
    public final void entryRuleAExpression() throws RecognitionException {
        try {
            // InternalExpressions.g:342:1: ( ruleAExpression EOF )
            // InternalExpressions.g:343:1: ruleAExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAExpression"


    // $ANTLR start "ruleAExpression"
    // InternalExpressions.g:350:1: ruleAExpression : ( ruleAddition ) ;
    public final void ruleAExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:354:2: ( ( ruleAddition ) )
            // InternalExpressions.g:355:1: ( ruleAddition )
            {
            // InternalExpressions.g:355:1: ( ruleAddition )
            // InternalExpressions.g:356:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAExpressionAccess().getAdditionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAExpressionAccess().getAdditionParserRuleCall()); 
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
    // $ANTLR end "ruleAExpression"


    // $ANTLR start "entryRuleAddition"
    // InternalExpressions.g:369:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalExpressions.g:370:1: ( ruleAddition EOF )
            // InternalExpressions.g:371:1: ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalExpressions.g:378:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:382:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalExpressions.g:383:1: ( ( rule__Addition__Group__0 ) )
            {
            // InternalExpressions.g:383:1: ( ( rule__Addition__Group__0 ) )
            // InternalExpressions.g:384:1: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // InternalExpressions.g:385:1: ( rule__Addition__Group__0 )
            // InternalExpressions.g:385:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup()); 
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalExpressions.g:397:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalExpressions.g:398:1: ( ruleMultiplication EOF )
            // InternalExpressions.g:399:1: ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalExpressions.g:406:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:410:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalExpressions.g:411:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalExpressions.g:411:1: ( ( rule__Multiplication__Group__0 ) )
            // InternalExpressions.g:412:1: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // InternalExpressions.g:413:1: ( rule__Multiplication__Group__0 )
            // InternalExpressions.g:413:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup()); 
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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePower"
    // InternalExpressions.g:425:1: entryRulePower : rulePower EOF ;
    public final void entryRulePower() throws RecognitionException {
        try {
            // InternalExpressions.g:426:1: ( rulePower EOF )
            // InternalExpressions.g:427:1: rulePower EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePower();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePower"


    // $ANTLR start "rulePower"
    // InternalExpressions.g:434:1: rulePower : ( ( rule__Power__Group__0 ) ) ;
    public final void rulePower() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:438:2: ( ( ( rule__Power__Group__0 ) ) )
            // InternalExpressions.g:439:1: ( ( rule__Power__Group__0 ) )
            {
            // InternalExpressions.g:439:1: ( ( rule__Power__Group__0 ) )
            // InternalExpressions.g:440:1: ( rule__Power__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getGroup()); 
            }
            // InternalExpressions.g:441:1: ( rule__Power__Group__0 )
            // InternalExpressions.g:441:2: rule__Power__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Power__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getGroup()); 
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
    // $ANTLR end "rulePower"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalExpressions.g:453:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalExpressions.g:454:1: ( rulePrimaryExpression EOF )
            // InternalExpressions.g:455:1: rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalExpressions.g:462:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:466:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalExpressions.g:467:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalExpressions.g:467:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalExpressions.g:468:1: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // InternalExpressions.g:469:1: ( rule__PrimaryExpression__Alternatives )
            // InternalExpressions.g:469:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleNumberValue"
    // InternalExpressions.g:481:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // InternalExpressions.g:482:1: ( ruleNumberValue EOF )
            // InternalExpressions.g:483:1: ruleNumberValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNumberValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // InternalExpressions.g:490:1: ruleNumberValue : ( ( rule__NumberValue__NumValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:494:2: ( ( ( rule__NumberValue__NumValueAssignment ) ) )
            // InternalExpressions.g:495:1: ( ( rule__NumberValue__NumValueAssignment ) )
            {
            // InternalExpressions.g:495:1: ( ( rule__NumberValue__NumValueAssignment ) )
            // InternalExpressions.g:496:1: ( rule__NumberValue__NumValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getNumValueAssignment()); 
            }
            // InternalExpressions.g:497:1: ( rule__NumberValue__NumValueAssignment )
            // InternalExpressions.g:497:2: rule__NumberValue__NumValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberValue__NumValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberValueAccess().getNumValueAssignment()); 
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
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleNUMBER"
    // InternalExpressions.g:509:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // InternalExpressions.g:510:1: ( ruleNUMBER EOF )
            // InternalExpressions.g:511:1: ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNUMBER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalExpressions.g:518:1: ruleNUMBER : ( ( rule__NUMBER__Group__0 ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:522:2: ( ( ( rule__NUMBER__Group__0 ) ) )
            // InternalExpressions.g:523:1: ( ( rule__NUMBER__Group__0 ) )
            {
            // InternalExpressions.g:523:1: ( ( rule__NUMBER__Group__0 ) )
            // InternalExpressions.g:524:1: ( rule__NUMBER__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getGroup()); 
            }
            // InternalExpressions.g:525:1: ( rule__NUMBER__Group__0 )
            // InternalExpressions.g:525:2: rule__NUMBER__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getGroup()); 
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
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleBooleanValue"
    // InternalExpressions.g:537:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // InternalExpressions.g:538:1: ( ruleBooleanValue EOF )
            // InternalExpressions.g:539:1: ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // InternalExpressions.g:546:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:550:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // InternalExpressions.g:551:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // InternalExpressions.g:551:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // InternalExpressions.g:552:1: ( rule__BooleanValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // InternalExpressions.g:553:1: ( rule__BooleanValue__ValueAssignment )
            // InternalExpressions.g:553:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleStringValue"
    // InternalExpressions.g:565:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalExpressions.g:566:1: ( ruleStringValue EOF )
            // InternalExpressions.g:567:1: ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalExpressions.g:574:1: ruleStringValue : ( ( rule__StringValue__StrValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:578:2: ( ( ( rule__StringValue__StrValueAssignment ) ) )
            // InternalExpressions.g:579:1: ( ( rule__StringValue__StrValueAssignment ) )
            {
            // InternalExpressions.g:579:1: ( ( rule__StringValue__StrValueAssignment ) )
            // InternalExpressions.g:580:1: ( rule__StringValue__StrValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getStrValueAssignment()); 
            }
            // InternalExpressions.g:581:1: ( rule__StringValue__StrValueAssignment )
            // InternalExpressions.g:581:2: rule__StringValue__StrValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringValue__StrValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getStrValueAssignment()); 
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
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleVariable"
    // InternalExpressions.g:593:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalExpressions.g:594:1: ( ruleVariable EOF )
            // InternalExpressions.g:595:1: ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalExpressions.g:602:1: ruleVariable : ( ( rule__Variable__VarNameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:606:2: ( ( ( rule__Variable__VarNameAssignment ) ) )
            // InternalExpressions.g:607:1: ( ( rule__Variable__VarNameAssignment ) )
            {
            // InternalExpressions.g:607:1: ( ( rule__Variable__VarNameAssignment ) )
            // InternalExpressions.g:608:1: ( rule__Variable__VarNameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVarNameAssignment()); 
            }
            // InternalExpressions.g:609:1: ( rule__Variable__VarNameAssignment )
            // InternalExpressions.g:609:2: rule__Variable__VarNameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Variable__VarNameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getVarNameAssignment()); 
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVARIABLE_VALUE"
    // InternalExpressions.g:621:1: entryRuleVARIABLE_VALUE : ruleVARIABLE_VALUE EOF ;
    public final void entryRuleVARIABLE_VALUE() throws RecognitionException {
        try {
            // InternalExpressions.g:622:1: ( ruleVARIABLE_VALUE EOF )
            // InternalExpressions.g:623:1: ruleVARIABLE_VALUE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARIABLE_VALUERule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVARIABLE_VALUE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARIABLE_VALUERule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleVARIABLE_VALUE"


    // $ANTLR start "ruleVARIABLE_VALUE"
    // InternalExpressions.g:630:1: ruleVARIABLE_VALUE : ( ( rule__VARIABLE_VALUE__Alternatives ) ) ;
    public final void ruleVARIABLE_VALUE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:634:2: ( ( ( rule__VARIABLE_VALUE__Alternatives ) ) )
            // InternalExpressions.g:635:1: ( ( rule__VARIABLE_VALUE__Alternatives ) )
            {
            // InternalExpressions.g:635:1: ( ( rule__VARIABLE_VALUE__Alternatives ) )
            // InternalExpressions.g:636:1: ( rule__VARIABLE_VALUE__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARIABLE_VALUEAccess().getAlternatives()); 
            }
            // InternalExpressions.g:637:1: ( rule__VARIABLE_VALUE__Alternatives )
            // InternalExpressions.g:637:2: rule__VARIABLE_VALUE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VARIABLE_VALUE__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARIABLE_VALUEAccess().getAlternatives()); 
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
    // $ANTLR end "ruleVARIABLE_VALUE"


    // $ANTLR start "rule__Disjunction__Alternatives_1_0"
    // InternalExpressions.g:649:1: rule__Disjunction__Alternatives_1_0 : ( ( ( rule__Disjunction__Group_1_0_0__0 ) ) | ( ( rule__Disjunction__Group_1_0_1__0 ) ) );
    public final void rule__Disjunction__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:653:1: ( ( ( rule__Disjunction__Group_1_0_0__0 ) ) | ( ( rule__Disjunction__Group_1_0_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalExpressions.g:654:1: ( ( rule__Disjunction__Group_1_0_0__0 ) )
                    {
                    // InternalExpressions.g:654:1: ( ( rule__Disjunction__Group_1_0_0__0 ) )
                    // InternalExpressions.g:655:1: ( rule__Disjunction__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDisjunctionAccess().getGroup_1_0_0()); 
                    }
                    // InternalExpressions.g:656:1: ( rule__Disjunction__Group_1_0_0__0 )
                    // InternalExpressions.g:656:2: rule__Disjunction__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Disjunction__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDisjunctionAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:660:6: ( ( rule__Disjunction__Group_1_0_1__0 ) )
                    {
                    // InternalExpressions.g:660:6: ( ( rule__Disjunction__Group_1_0_1__0 ) )
                    // InternalExpressions.g:661:1: ( rule__Disjunction__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDisjunctionAccess().getGroup_1_0_1()); 
                    }
                    // InternalExpressions.g:662:1: ( rule__Disjunction__Group_1_0_1__0 )
                    // InternalExpressions.g:662:2: rule__Disjunction__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Disjunction__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDisjunctionAccess().getGroup_1_0_1()); 
                    }

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
    // $ANTLR end "rule__Disjunction__Alternatives_1_0"


    // $ANTLR start "rule__Negation__Alternatives"
    // InternalExpressions.g:671:1: rule__Negation__Alternatives : ( ( ( rule__Negation__Group_0__0 ) ) | ( ruleCExpression ) );
    public final void rule__Negation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:675:1: ( ( ( rule__Negation__Group_0__0 ) ) | ( ruleCExpression ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)||LA2_0==18) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalExpressions.g:676:1: ( ( rule__Negation__Group_0__0 ) )
                    {
                    // InternalExpressions.g:676:1: ( ( rule__Negation__Group_0__0 ) )
                    // InternalExpressions.g:677:1: ( rule__Negation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegationAccess().getGroup_0()); 
                    }
                    // InternalExpressions.g:678:1: ( rule__Negation__Group_0__0 )
                    // InternalExpressions.g:678:2: rule__Negation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Negation__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNegationAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:682:6: ( ruleCExpression )
                    {
                    // InternalExpressions.g:682:6: ( ruleCExpression )
                    // InternalExpressions.g:683:1: ruleCExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegationAccess().getCExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNegationAccess().getCExpressionParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Negation__Alternatives"


    // $ANTLR start "rule__CExpression__Alternatives"
    // InternalExpressions.g:693:1: rule__CExpression__Alternatives : ( ( ( rule__CExpression__Group_0__0 ) ) | ( ruleCompare ) | ( ruleBooleanValue ) | ( ruleVariable ) );
    public final void rule__CExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:697:1: ( ( ( rule__CExpression__Group_0__0 ) ) | ( ruleCompare ) | ( ruleBooleanValue ) | ( ruleVariable ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                int LA3_1 = input.LA(2);

                if ( (synpred3_InternalExpressions()) ) {
                    alt3=1;
                }
                else if ( (synpred4_InternalExpressions()) ) {
                    alt3=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA3_3 = input.LA(2);

                if ( (synpred4_InternalExpressions()) ) {
                    alt3=2;
                }
                else if ( (synpred5_InternalExpressions()) ) {
                    alt3=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA3_5 = input.LA(2);

                if ( (synpred4_InternalExpressions()) ) {
                    alt3=2;
                }
                else if ( (true) ) {
                    alt3=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalExpressions.g:698:1: ( ( rule__CExpression__Group_0__0 ) )
                    {
                    // InternalExpressions.g:698:1: ( ( rule__CExpression__Group_0__0 ) )
                    // InternalExpressions.g:699:1: ( rule__CExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCExpressionAccess().getGroup_0()); 
                    }
                    // InternalExpressions.g:700:1: ( rule__CExpression__Group_0__0 )
                    // InternalExpressions.g:700:2: rule__CExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:704:6: ( ruleCompare )
                    {
                    // InternalExpressions.g:704:6: ( ruleCompare )
                    // InternalExpressions.g:705:1: ruleCompare
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCExpressionAccess().getCompareParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleCompare();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCExpressionAccess().getCompareParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressions.g:710:6: ( ruleBooleanValue )
                    {
                    // InternalExpressions.g:710:6: ( ruleBooleanValue )
                    // InternalExpressions.g:711:1: ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCExpressionAccess().getBooleanValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCExpressionAccess().getBooleanValueParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalExpressions.g:716:6: ( ruleVariable )
                    {
                    // InternalExpressions.g:716:6: ( ruleVariable )
                    // InternalExpressions.g:717:1: ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCExpressionAccess().getVariableParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCExpressionAccess().getVariableParserRuleCall_3()); 
                    }

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
    // $ANTLR end "rule__CExpression__Alternatives"


    // $ANTLR start "rule__Compare__Alternatives_1"
    // InternalExpressions.g:727:1: rule__Compare__Alternatives_1 : ( ( ( rule__Compare__Group_1_0__0 ) ) | ( ( rule__Compare__Group_1_1__0 ) ) | ( ( rule__Compare__Group_1_2__0 ) ) | ( ( rule__Compare__Group_1_3__0 ) ) | ( ( rule__Compare__Group_1_4__0 ) ) | ( ( rule__Compare__Group_1_5__0 ) ) | ( ( rule__Compare__Group_1_6__0 ) ) );
    public final void rule__Compare__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:731:1: ( ( ( rule__Compare__Group_1_0__0 ) ) | ( ( rule__Compare__Group_1_1__0 ) ) | ( ( rule__Compare__Group_1_2__0 ) ) | ( ( rule__Compare__Group_1_3__0 ) ) | ( ( rule__Compare__Group_1_4__0 ) ) | ( ( rule__Compare__Group_1_5__0 ) ) | ( ( rule__Compare__Group_1_6__0 ) ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 23:
                {
                alt4=4;
                }
                break;
            case 24:
                {
                alt4=5;
                }
                break;
            case 25:
                {
                alt4=6;
                }
                break;
            case 26:
                {
                alt4=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalExpressions.g:732:1: ( ( rule__Compare__Group_1_0__0 ) )
                    {
                    // InternalExpressions.g:732:1: ( ( rule__Compare__Group_1_0__0 ) )
                    // InternalExpressions.g:733:1: ( rule__Compare__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareAccess().getGroup_1_0()); 
                    }
                    // InternalExpressions.g:734:1: ( rule__Compare__Group_1_0__0 )
                    // InternalExpressions.g:734:2: rule__Compare__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compare__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:738:6: ( ( rule__Compare__Group_1_1__0 ) )
                    {
                    // InternalExpressions.g:738:6: ( ( rule__Compare__Group_1_1__0 ) )
                    // InternalExpressions.g:739:1: ( rule__Compare__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareAccess().getGroup_1_1()); 
                    }
                    // InternalExpressions.g:740:1: ( rule__Compare__Group_1_1__0 )
                    // InternalExpressions.g:740:2: rule__Compare__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compare__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressions.g:744:6: ( ( rule__Compare__Group_1_2__0 ) )
                    {
                    // InternalExpressions.g:744:6: ( ( rule__Compare__Group_1_2__0 ) )
                    // InternalExpressions.g:745:1: ( rule__Compare__Group_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareAccess().getGroup_1_2()); 
                    }
                    // InternalExpressions.g:746:1: ( rule__Compare__Group_1_2__0 )
                    // InternalExpressions.g:746:2: rule__Compare__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compare__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareAccess().getGroup_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalExpressions.g:750:6: ( ( rule__Compare__Group_1_3__0 ) )
                    {
                    // InternalExpressions.g:750:6: ( ( rule__Compare__Group_1_3__0 ) )
                    // InternalExpressions.g:751:1: ( rule__Compare__Group_1_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareAccess().getGroup_1_3()); 
                    }
                    // InternalExpressions.g:752:1: ( rule__Compare__Group_1_3__0 )
                    // InternalExpressions.g:752:2: rule__Compare__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compare__Group_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareAccess().getGroup_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalExpressions.g:756:6: ( ( rule__Compare__Group_1_4__0 ) )
                    {
                    // InternalExpressions.g:756:6: ( ( rule__Compare__Group_1_4__0 ) )
                    // InternalExpressions.g:757:1: ( rule__Compare__Group_1_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareAccess().getGroup_1_4()); 
                    }
                    // InternalExpressions.g:758:1: ( rule__Compare__Group_1_4__0 )
                    // InternalExpressions.g:758:2: rule__Compare__Group_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compare__Group_1_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareAccess().getGroup_1_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalExpressions.g:762:6: ( ( rule__Compare__Group_1_5__0 ) )
                    {
                    // InternalExpressions.g:762:6: ( ( rule__Compare__Group_1_5__0 ) )
                    // InternalExpressions.g:763:1: ( rule__Compare__Group_1_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareAccess().getGroup_1_5()); 
                    }
                    // InternalExpressions.g:764:1: ( rule__Compare__Group_1_5__0 )
                    // InternalExpressions.g:764:2: rule__Compare__Group_1_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compare__Group_1_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareAccess().getGroup_1_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalExpressions.g:768:6: ( ( rule__Compare__Group_1_6__0 ) )
                    {
                    // InternalExpressions.g:768:6: ( ( rule__Compare__Group_1_6__0 ) )
                    // InternalExpressions.g:769:1: ( rule__Compare__Group_1_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareAccess().getGroup_1_6()); 
                    }
                    // InternalExpressions.g:770:1: ( rule__Compare__Group_1_6__0 )
                    // InternalExpressions.g:770:2: rule__Compare__Group_1_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Compare__Group_1_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareAccess().getGroup_1_6()); 
                    }

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
    // $ANTLR end "rule__Compare__Alternatives_1"


    // $ANTLR start "rule__SomeValue__Alternatives"
    // InternalExpressions.g:779:1: rule__SomeValue__Alternatives : ( ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleAExpression ) );
    public final void rule__SomeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:783:1: ( ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleAExpression ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt5=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case 18:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalExpressions.g:784:1: ( ruleStringValue )
                    {
                    // InternalExpressions.g:784:1: ( ruleStringValue )
                    // InternalExpressions.g:785:1: ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSomeValueAccess().getStringValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleStringValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSomeValueAccess().getStringValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:790:6: ( ruleBooleanValue )
                    {
                    // InternalExpressions.g:790:6: ( ruleBooleanValue )
                    // InternalExpressions.g:791:1: ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSomeValueAccess().getBooleanValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSomeValueAccess().getBooleanValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressions.g:796:6: ( ruleAExpression )
                    {
                    // InternalExpressions.g:796:6: ( ruleAExpression )
                    // InternalExpressions.g:797:1: ruleAExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSomeValueAccess().getAExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSomeValueAccess().getAExpressionParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__SomeValue__Alternatives"


    // $ANTLR start "rule__Addition__Alternatives_1_0"
    // InternalExpressions.g:807:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:811:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            else if ( (LA6_0==28) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalExpressions.g:812:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // InternalExpressions.g:812:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // InternalExpressions.g:813:1: ( rule__Addition__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    }
                    // InternalExpressions.g:814:1: ( rule__Addition__Group_1_0_0__0 )
                    // InternalExpressions.g:814:2: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Addition__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:818:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // InternalExpressions.g:818:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // InternalExpressions.g:819:1: ( rule__Addition__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    }
                    // InternalExpressions.g:820:1: ( rule__Addition__Group_1_0_1__0 )
                    // InternalExpressions.g:820:2: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Addition__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    }

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
    // $ANTLR end "rule__Addition__Alternatives_1_0"


    // $ANTLR start "rule__Multiplication__Alternatives_1_0"
    // InternalExpressions.g:829:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) | ( ( rule__Multiplication__Group_1_0_2__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:833:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) | ( ( rule__Multiplication__Group_1_0_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 30:
                {
                alt7=2;
                }
                break;
            case 31:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalExpressions.g:834:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // InternalExpressions.g:834:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // InternalExpressions.g:835:1: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    }
                    // InternalExpressions.g:836:1: ( rule__Multiplication__Group_1_0_0__0 )
                    // InternalExpressions.g:836:2: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplication__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:840:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // InternalExpressions.g:840:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // InternalExpressions.g:841:1: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    }
                    // InternalExpressions.g:842:1: ( rule__Multiplication__Group_1_0_1__0 )
                    // InternalExpressions.g:842:2: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplication__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressions.g:846:6: ( ( rule__Multiplication__Group_1_0_2__0 ) )
                    {
                    // InternalExpressions.g:846:6: ( ( rule__Multiplication__Group_1_0_2__0 ) )
                    // InternalExpressions.g:847:1: ( rule__Multiplication__Group_1_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getGroup_1_0_2()); 
                    }
                    // InternalExpressions.g:848:1: ( rule__Multiplication__Group_1_0_2__0 )
                    // InternalExpressions.g:848:2: rule__Multiplication__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplication__Group_1_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getGroup_1_0_2()); 
                    }

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
    // $ANTLR end "rule__Multiplication__Alternatives_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalExpressions.g:857:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleNumberValue ) | ( ruleVariable ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:861:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleNumberValue ) | ( ruleVariable ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalExpressions.g:862:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // InternalExpressions.g:862:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // InternalExpressions.g:863:1: ( rule__PrimaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }
                    // InternalExpressions.g:864:1: ( rule__PrimaryExpression__Group_0__0 )
                    // InternalExpressions.g:864:2: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:868:6: ( ruleNumberValue )
                    {
                    // InternalExpressions.g:868:6: ( ruleNumberValue )
                    // InternalExpressions.g:869:1: ruleNumberValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getNumberValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleNumberValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getNumberValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalExpressions.g:874:6: ( ruleVariable )
                    {
                    // InternalExpressions.g:874:6: ( ruleVariable )
                    // InternalExpressions.g:875:1: ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getVariableParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getVariableParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__VARIABLE_VALUE__Alternatives"
    // InternalExpressions.g:885:1: rule__VARIABLE_VALUE__Alternatives : ( ( RULE_ID ) | ( ( rule__VARIABLE_VALUE__Group_1__0 ) ) );
    public final void rule__VARIABLE_VALUE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:889:1: ( ( RULE_ID ) | ( ( rule__VARIABLE_VALUE__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||(LA9_1>=12 && LA9_1<=16)||(LA9_1>=19 && LA9_1<=32)) ) {
                    alt9=1;
                }
                else if ( (LA9_1==33) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalExpressions.g:890:1: ( RULE_ID )
                    {
                    // InternalExpressions.g:890:1: ( RULE_ID )
                    // InternalExpressions.g:891:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalExpressions.g:896:6: ( ( rule__VARIABLE_VALUE__Group_1__0 ) )
                    {
                    // InternalExpressions.g:896:6: ( ( rule__VARIABLE_VALUE__Group_1__0 ) )
                    // InternalExpressions.g:897:1: ( rule__VARIABLE_VALUE__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVARIABLE_VALUEAccess().getGroup_1()); 
                    }
                    // InternalExpressions.g:898:1: ( rule__VARIABLE_VALUE__Group_1__0 )
                    // InternalExpressions.g:898:2: rule__VARIABLE_VALUE__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VARIABLE_VALUE__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVARIABLE_VALUEAccess().getGroup_1()); 
                    }

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
    // $ANTLR end "rule__VARIABLE_VALUE__Alternatives"


    // $ANTLR start "rule__Equivalent__Group__0"
    // InternalExpressions.g:909:1: rule__Equivalent__Group__0 : rule__Equivalent__Group__0__Impl rule__Equivalent__Group__1 ;
    public final void rule__Equivalent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:913:1: ( rule__Equivalent__Group__0__Impl rule__Equivalent__Group__1 )
            // InternalExpressions.g:914:2: rule__Equivalent__Group__0__Impl rule__Equivalent__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Equivalent__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equivalent__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equivalent__Group__0"


    // $ANTLR start "rule__Equivalent__Group__0__Impl"
    // InternalExpressions.g:921:1: rule__Equivalent__Group__0__Impl : ( ruleImplication ) ;
    public final void rule__Equivalent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:925:1: ( ( ruleImplication ) )
            // InternalExpressions.g:926:1: ( ruleImplication )
            {
            // InternalExpressions.g:926:1: ( ruleImplication )
            // InternalExpressions.g:927:1: ruleImplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentAccess().getImplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentAccess().getImplicationParserRuleCall_0()); 
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
    // $ANTLR end "rule__Equivalent__Group__0__Impl"


    // $ANTLR start "rule__Equivalent__Group__1"
    // InternalExpressions.g:938:1: rule__Equivalent__Group__1 : rule__Equivalent__Group__1__Impl ;
    public final void rule__Equivalent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:942:1: ( rule__Equivalent__Group__1__Impl )
            // InternalExpressions.g:943:2: rule__Equivalent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equivalent__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equivalent__Group__1"


    // $ANTLR start "rule__Equivalent__Group__1__Impl"
    // InternalExpressions.g:949:1: rule__Equivalent__Group__1__Impl : ( ( rule__Equivalent__Group_1__0 )? ) ;
    public final void rule__Equivalent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:953:1: ( ( ( rule__Equivalent__Group_1__0 )? ) )
            // InternalExpressions.g:954:1: ( ( rule__Equivalent__Group_1__0 )? )
            {
            // InternalExpressions.g:954:1: ( ( rule__Equivalent__Group_1__0 )? )
            // InternalExpressions.g:955:1: ( rule__Equivalent__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentAccess().getGroup_1()); 
            }
            // InternalExpressions.g:956:1: ( rule__Equivalent__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalExpressions.g:956:2: rule__Equivalent__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Equivalent__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Equivalent__Group__1__Impl"


    // $ANTLR start "rule__Equivalent__Group_1__0"
    // InternalExpressions.g:970:1: rule__Equivalent__Group_1__0 : rule__Equivalent__Group_1__0__Impl rule__Equivalent__Group_1__1 ;
    public final void rule__Equivalent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:974:1: ( rule__Equivalent__Group_1__0__Impl rule__Equivalent__Group_1__1 )
            // InternalExpressions.g:975:2: rule__Equivalent__Group_1__0__Impl rule__Equivalent__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Equivalent__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equivalent__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equivalent__Group_1__0"


    // $ANTLR start "rule__Equivalent__Group_1__0__Impl"
    // InternalExpressions.g:982:1: rule__Equivalent__Group_1__0__Impl : ( () ) ;
    public final void rule__Equivalent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:986:1: ( ( () ) )
            // InternalExpressions.g:987:1: ( () )
            {
            // InternalExpressions.g:987:1: ( () )
            // InternalExpressions.g:988:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0()); 
            }
            // InternalExpressions.g:989:1: ()
            // InternalExpressions.g:991:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equivalent__Group_1__0__Impl"


    // $ANTLR start "rule__Equivalent__Group_1__1"
    // InternalExpressions.g:1001:1: rule__Equivalent__Group_1__1 : rule__Equivalent__Group_1__1__Impl rule__Equivalent__Group_1__2 ;
    public final void rule__Equivalent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1005:1: ( rule__Equivalent__Group_1__1__Impl rule__Equivalent__Group_1__2 )
            // InternalExpressions.g:1006:2: rule__Equivalent__Group_1__1__Impl rule__Equivalent__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__Equivalent__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Equivalent__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equivalent__Group_1__1"


    // $ANTLR start "rule__Equivalent__Group_1__1__Impl"
    // InternalExpressions.g:1013:1: rule__Equivalent__Group_1__1__Impl : ( 'equiv' ) ;
    public final void rule__Equivalent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1017:1: ( ( 'equiv' ) )
            // InternalExpressions.g:1018:1: ( 'equiv' )
            {
            // InternalExpressions.g:1018:1: ( 'equiv' )
            // InternalExpressions.g:1019:1: 'equiv'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentAccess().getEquivKeyword_1_1()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentAccess().getEquivKeyword_1_1()); 
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
    // $ANTLR end "rule__Equivalent__Group_1__1__Impl"


    // $ANTLR start "rule__Equivalent__Group_1__2"
    // InternalExpressions.g:1032:1: rule__Equivalent__Group_1__2 : rule__Equivalent__Group_1__2__Impl ;
    public final void rule__Equivalent__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1036:1: ( rule__Equivalent__Group_1__2__Impl )
            // InternalExpressions.g:1037:2: rule__Equivalent__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equivalent__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equivalent__Group_1__2"


    // $ANTLR start "rule__Equivalent__Group_1__2__Impl"
    // InternalExpressions.g:1043:1: rule__Equivalent__Group_1__2__Impl : ( ( rule__Equivalent__RightAssignment_1_2 ) ) ;
    public final void rule__Equivalent__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1047:1: ( ( ( rule__Equivalent__RightAssignment_1_2 ) ) )
            // InternalExpressions.g:1048:1: ( ( rule__Equivalent__RightAssignment_1_2 ) )
            {
            // InternalExpressions.g:1048:1: ( ( rule__Equivalent__RightAssignment_1_2 ) )
            // InternalExpressions.g:1049:1: ( rule__Equivalent__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentAccess().getRightAssignment_1_2()); 
            }
            // InternalExpressions.g:1050:1: ( rule__Equivalent__RightAssignment_1_2 )
            // InternalExpressions.g:1050:2: rule__Equivalent__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Equivalent__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__Equivalent__Group_1__2__Impl"


    // $ANTLR start "rule__Implication__Group__0"
    // InternalExpressions.g:1066:1: rule__Implication__Group__0 : rule__Implication__Group__0__Impl rule__Implication__Group__1 ;
    public final void rule__Implication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1070:1: ( rule__Implication__Group__0__Impl rule__Implication__Group__1 )
            // InternalExpressions.g:1071:2: rule__Implication__Group__0__Impl rule__Implication__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Implication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Implication__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__Group__0"


    // $ANTLR start "rule__Implication__Group__0__Impl"
    // InternalExpressions.g:1078:1: rule__Implication__Group__0__Impl : ( ruleDisjunction ) ;
    public final void rule__Implication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1082:1: ( ( ruleDisjunction ) )
            // InternalExpressions.g:1083:1: ( ruleDisjunction )
            {
            // InternalExpressions.g:1083:1: ( ruleDisjunction )
            // InternalExpressions.g:1084:1: ruleDisjunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDisjunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
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
    // $ANTLR end "rule__Implication__Group__0__Impl"


    // $ANTLR start "rule__Implication__Group__1"
    // InternalExpressions.g:1095:1: rule__Implication__Group__1 : rule__Implication__Group__1__Impl ;
    public final void rule__Implication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1099:1: ( rule__Implication__Group__1__Impl )
            // InternalExpressions.g:1100:2: rule__Implication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Implication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__Group__1"


    // $ANTLR start "rule__Implication__Group__1__Impl"
    // InternalExpressions.g:1106:1: rule__Implication__Group__1__Impl : ( ( rule__Implication__Group_1__0 )? ) ;
    public final void rule__Implication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1110:1: ( ( ( rule__Implication__Group_1__0 )? ) )
            // InternalExpressions.g:1111:1: ( ( rule__Implication__Group_1__0 )? )
            {
            // InternalExpressions.g:1111:1: ( ( rule__Implication__Group_1__0 )? )
            // InternalExpressions.g:1112:1: ( rule__Implication__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationAccess().getGroup_1()); 
            }
            // InternalExpressions.g:1113:1: ( rule__Implication__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalExpressions.g:1113:2: rule__Implication__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Implication__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Implication__Group__1__Impl"


    // $ANTLR start "rule__Implication__Group_1__0"
    // InternalExpressions.g:1127:1: rule__Implication__Group_1__0 : rule__Implication__Group_1__0__Impl rule__Implication__Group_1__1 ;
    public final void rule__Implication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1131:1: ( rule__Implication__Group_1__0__Impl rule__Implication__Group_1__1 )
            // InternalExpressions.g:1132:2: rule__Implication__Group_1__0__Impl rule__Implication__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Implication__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Implication__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__Group_1__0"


    // $ANTLR start "rule__Implication__Group_1__0__Impl"
    // InternalExpressions.g:1139:1: rule__Implication__Group_1__0__Impl : ( () ) ;
    public final void rule__Implication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1143:1: ( ( () ) )
            // InternalExpressions.g:1144:1: ( () )
            {
            // InternalExpressions.g:1144:1: ( () )
            // InternalExpressions.g:1145:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationAccess().getImplyLeftAction_1_0()); 
            }
            // InternalExpressions.g:1146:1: ()
            // InternalExpressions.g:1148:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationAccess().getImplyLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__Group_1__0__Impl"


    // $ANTLR start "rule__Implication__Group_1__1"
    // InternalExpressions.g:1158:1: rule__Implication__Group_1__1 : rule__Implication__Group_1__1__Impl rule__Implication__Group_1__2 ;
    public final void rule__Implication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1162:1: ( rule__Implication__Group_1__1__Impl rule__Implication__Group_1__2 )
            // InternalExpressions.g:1163:2: rule__Implication__Group_1__1__Impl rule__Implication__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__Implication__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Implication__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__Group_1__1"


    // $ANTLR start "rule__Implication__Group_1__1__Impl"
    // InternalExpressions.g:1170:1: rule__Implication__Group_1__1__Impl : ( 'imply' ) ;
    public final void rule__Implication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1174:1: ( ( 'imply' ) )
            // InternalExpressions.g:1175:1: ( 'imply' )
            {
            // InternalExpressions.g:1175:1: ( 'imply' )
            // InternalExpressions.g:1176:1: 'imply'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationAccess().getImplyKeyword_1_1()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationAccess().getImplyKeyword_1_1()); 
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
    // $ANTLR end "rule__Implication__Group_1__1__Impl"


    // $ANTLR start "rule__Implication__Group_1__2"
    // InternalExpressions.g:1189:1: rule__Implication__Group_1__2 : rule__Implication__Group_1__2__Impl ;
    public final void rule__Implication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1193:1: ( rule__Implication__Group_1__2__Impl )
            // InternalExpressions.g:1194:2: rule__Implication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Implication__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__Group_1__2"


    // $ANTLR start "rule__Implication__Group_1__2__Impl"
    // InternalExpressions.g:1200:1: rule__Implication__Group_1__2__Impl : ( ( rule__Implication__RightAssignment_1_2 ) ) ;
    public final void rule__Implication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1204:1: ( ( ( rule__Implication__RightAssignment_1_2 ) ) )
            // InternalExpressions.g:1205:1: ( ( rule__Implication__RightAssignment_1_2 ) )
            {
            // InternalExpressions.g:1205:1: ( ( rule__Implication__RightAssignment_1_2 ) )
            // InternalExpressions.g:1206:1: ( rule__Implication__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationAccess().getRightAssignment_1_2()); 
            }
            // InternalExpressions.g:1207:1: ( rule__Implication__RightAssignment_1_2 )
            // InternalExpressions.g:1207:2: rule__Implication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Implication__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__Implication__Group_1__2__Impl"


    // $ANTLR start "rule__Disjunction__Group__0"
    // InternalExpressions.g:1223:1: rule__Disjunction__Group__0 : rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 ;
    public final void rule__Disjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1227:1: ( rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 )
            // InternalExpressions.g:1228:2: rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Disjunction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Disjunction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__0"


    // $ANTLR start "rule__Disjunction__Group__0__Impl"
    // InternalExpressions.g:1235:1: rule__Disjunction__Group__0__Impl : ( ruleConjunction ) ;
    public final void rule__Disjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1239:1: ( ( ruleConjunction ) )
            // InternalExpressions.g:1240:1: ( ruleConjunction )
            {
            // InternalExpressions.g:1240:1: ( ruleConjunction )
            // InternalExpressions.g:1241:1: ruleConjunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConjunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
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
    // $ANTLR end "rule__Disjunction__Group__0__Impl"


    // $ANTLR start "rule__Disjunction__Group__1"
    // InternalExpressions.g:1252:1: rule__Disjunction__Group__1 : rule__Disjunction__Group__1__Impl ;
    public final void rule__Disjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1256:1: ( rule__Disjunction__Group__1__Impl )
            // InternalExpressions.g:1257:2: rule__Disjunction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Disjunction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__1"


    // $ANTLR start "rule__Disjunction__Group__1__Impl"
    // InternalExpressions.g:1263:1: rule__Disjunction__Group__1__Impl : ( ( rule__Disjunction__Group_1__0 )? ) ;
    public final void rule__Disjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1267:1: ( ( ( rule__Disjunction__Group_1__0 )? ) )
            // InternalExpressions.g:1268:1: ( ( rule__Disjunction__Group_1__0 )? )
            {
            // InternalExpressions.g:1268:1: ( ( rule__Disjunction__Group_1__0 )? )
            // InternalExpressions.g:1269:1: ( rule__Disjunction__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getGroup_1()); 
            }
            // InternalExpressions.g:1270:1: ( rule__Disjunction__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=14 && LA12_0<=15)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalExpressions.g:1270:2: rule__Disjunction__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Disjunction__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Disjunction__Group__1__Impl"


    // $ANTLR start "rule__Disjunction__Group_1__0"
    // InternalExpressions.g:1284:1: rule__Disjunction__Group_1__0 : rule__Disjunction__Group_1__0__Impl rule__Disjunction__Group_1__1 ;
    public final void rule__Disjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1288:1: ( rule__Disjunction__Group_1__0__Impl rule__Disjunction__Group_1__1 )
            // InternalExpressions.g:1289:2: rule__Disjunction__Group_1__0__Impl rule__Disjunction__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Disjunction__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Disjunction__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__0"


    // $ANTLR start "rule__Disjunction__Group_1__0__Impl"
    // InternalExpressions.g:1296:1: rule__Disjunction__Group_1__0__Impl : ( ( rule__Disjunction__Alternatives_1_0 ) ) ;
    public final void rule__Disjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1300:1: ( ( ( rule__Disjunction__Alternatives_1_0 ) ) )
            // InternalExpressions.g:1301:1: ( ( rule__Disjunction__Alternatives_1_0 ) )
            {
            // InternalExpressions.g:1301:1: ( ( rule__Disjunction__Alternatives_1_0 ) )
            // InternalExpressions.g:1302:1: ( rule__Disjunction__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getAlternatives_1_0()); 
            }
            // InternalExpressions.g:1303:1: ( rule__Disjunction__Alternatives_1_0 )
            // InternalExpressions.g:1303:2: rule__Disjunction__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Disjunction__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getAlternatives_1_0()); 
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
    // $ANTLR end "rule__Disjunction__Group_1__0__Impl"


    // $ANTLR start "rule__Disjunction__Group_1__1"
    // InternalExpressions.g:1313:1: rule__Disjunction__Group_1__1 : rule__Disjunction__Group_1__1__Impl ;
    public final void rule__Disjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1317:1: ( rule__Disjunction__Group_1__1__Impl )
            // InternalExpressions.g:1318:2: rule__Disjunction__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Disjunction__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__1"


    // $ANTLR start "rule__Disjunction__Group_1__1__Impl"
    // InternalExpressions.g:1324:1: rule__Disjunction__Group_1__1__Impl : ( ( rule__Disjunction__RightAssignment_1_1 ) ) ;
    public final void rule__Disjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1328:1: ( ( ( rule__Disjunction__RightAssignment_1_1 ) ) )
            // InternalExpressions.g:1329:1: ( ( rule__Disjunction__RightAssignment_1_1 ) )
            {
            // InternalExpressions.g:1329:1: ( ( rule__Disjunction__RightAssignment_1_1 ) )
            // InternalExpressions.g:1330:1: ( rule__Disjunction__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getRightAssignment_1_1()); 
            }
            // InternalExpressions.g:1331:1: ( rule__Disjunction__RightAssignment_1_1 )
            // InternalExpressions.g:1331:2: rule__Disjunction__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Disjunction__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getRightAssignment_1_1()); 
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
    // $ANTLR end "rule__Disjunction__Group_1__1__Impl"


    // $ANTLR start "rule__Disjunction__Group_1_0_0__0"
    // InternalExpressions.g:1345:1: rule__Disjunction__Group_1_0_0__0 : rule__Disjunction__Group_1_0_0__0__Impl rule__Disjunction__Group_1_0_0__1 ;
    public final void rule__Disjunction__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1349:1: ( rule__Disjunction__Group_1_0_0__0__Impl rule__Disjunction__Group_1_0_0__1 )
            // InternalExpressions.g:1350:2: rule__Disjunction__Group_1_0_0__0__Impl rule__Disjunction__Group_1_0_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Disjunction__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Disjunction__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1_0_0__0"


    // $ANTLR start "rule__Disjunction__Group_1_0_0__0__Impl"
    // InternalExpressions.g:1357:1: rule__Disjunction__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Disjunction__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1361:1: ( ( () ) )
            // InternalExpressions.g:1362:1: ( () )
            {
            // InternalExpressions.g:1362:1: ( () )
            // InternalExpressions.g:1363:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0()); 
            }
            // InternalExpressions.g:1364:1: ()
            // InternalExpressions.g:1366:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Disjunction__Group_1_0_0__1"
    // InternalExpressions.g:1376:1: rule__Disjunction__Group_1_0_0__1 : rule__Disjunction__Group_1_0_0__1__Impl ;
    public final void rule__Disjunction__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1380:1: ( rule__Disjunction__Group_1_0_0__1__Impl )
            // InternalExpressions.g:1381:2: rule__Disjunction__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Disjunction__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1_0_0__1"


    // $ANTLR start "rule__Disjunction__Group_1_0_0__1__Impl"
    // InternalExpressions.g:1387:1: rule__Disjunction__Group_1_0_0__1__Impl : ( 'or' ) ;
    public final void rule__Disjunction__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1391:1: ( ( 'or' ) )
            // InternalExpressions.g:1392:1: ( 'or' )
            {
            // InternalExpressions.g:1392:1: ( 'or' )
            // InternalExpressions.g:1393:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getOrKeyword_1_0_0_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getOrKeyword_1_0_0_1()); 
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
    // $ANTLR end "rule__Disjunction__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Disjunction__Group_1_0_1__0"
    // InternalExpressions.g:1410:1: rule__Disjunction__Group_1_0_1__0 : rule__Disjunction__Group_1_0_1__0__Impl rule__Disjunction__Group_1_0_1__1 ;
    public final void rule__Disjunction__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1414:1: ( rule__Disjunction__Group_1_0_1__0__Impl rule__Disjunction__Group_1_0_1__1 )
            // InternalExpressions.g:1415:2: rule__Disjunction__Group_1_0_1__0__Impl rule__Disjunction__Group_1_0_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Disjunction__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Disjunction__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1_0_1__0"


    // $ANTLR start "rule__Disjunction__Group_1_0_1__0__Impl"
    // InternalExpressions.g:1422:1: rule__Disjunction__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Disjunction__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1426:1: ( ( () ) )
            // InternalExpressions.g:1427:1: ( () )
            {
            // InternalExpressions.g:1427:1: ( () )
            // InternalExpressions.g:1428:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0()); 
            }
            // InternalExpressions.g:1429:1: ()
            // InternalExpressions.g:1431:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Disjunction__Group_1_0_1__1"
    // InternalExpressions.g:1441:1: rule__Disjunction__Group_1_0_1__1 : rule__Disjunction__Group_1_0_1__1__Impl ;
    public final void rule__Disjunction__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1445:1: ( rule__Disjunction__Group_1_0_1__1__Impl )
            // InternalExpressions.g:1446:2: rule__Disjunction__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Disjunction__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1_0_1__1"


    // $ANTLR start "rule__Disjunction__Group_1_0_1__1__Impl"
    // InternalExpressions.g:1452:1: rule__Disjunction__Group_1_0_1__1__Impl : ( 'xor' ) ;
    public final void rule__Disjunction__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1456:1: ( ( 'xor' ) )
            // InternalExpressions.g:1457:1: ( 'xor' )
            {
            // InternalExpressions.g:1457:1: ( 'xor' )
            // InternalExpressions.g:1458:1: 'xor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getXorKeyword_1_0_1_1()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getXorKeyword_1_0_1_1()); 
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
    // $ANTLR end "rule__Disjunction__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Conjunction__Group__0"
    // InternalExpressions.g:1475:1: rule__Conjunction__Group__0 : rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 ;
    public final void rule__Conjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1479:1: ( rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 )
            // InternalExpressions.g:1480:2: rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Conjunction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conjunction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__0"


    // $ANTLR start "rule__Conjunction__Group__0__Impl"
    // InternalExpressions.g:1487:1: rule__Conjunction__Group__0__Impl : ( ruleNegation ) ;
    public final void rule__Conjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1491:1: ( ( ruleNegation ) )
            // InternalExpressions.g:1492:1: ( ruleNegation )
            {
            // InternalExpressions.g:1492:1: ( ruleNegation )
            // InternalExpressions.g:1493:1: ruleNegation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAccess().getNegationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNegation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAccess().getNegationParserRuleCall_0()); 
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
    // $ANTLR end "rule__Conjunction__Group__0__Impl"


    // $ANTLR start "rule__Conjunction__Group__1"
    // InternalExpressions.g:1504:1: rule__Conjunction__Group__1 : rule__Conjunction__Group__1__Impl ;
    public final void rule__Conjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1508:1: ( rule__Conjunction__Group__1__Impl )
            // InternalExpressions.g:1509:2: rule__Conjunction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conjunction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__1"


    // $ANTLR start "rule__Conjunction__Group__1__Impl"
    // InternalExpressions.g:1515:1: rule__Conjunction__Group__1__Impl : ( ( rule__Conjunction__Group_1__0 )? ) ;
    public final void rule__Conjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1519:1: ( ( ( rule__Conjunction__Group_1__0 )? ) )
            // InternalExpressions.g:1520:1: ( ( rule__Conjunction__Group_1__0 )? )
            {
            // InternalExpressions.g:1520:1: ( ( rule__Conjunction__Group_1__0 )? )
            // InternalExpressions.g:1521:1: ( rule__Conjunction__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAccess().getGroup_1()); 
            }
            // InternalExpressions.g:1522:1: ( rule__Conjunction__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalExpressions.g:1522:2: rule__Conjunction__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conjunction__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Conjunction__Group__1__Impl"


    // $ANTLR start "rule__Conjunction__Group_1__0"
    // InternalExpressions.g:1536:1: rule__Conjunction__Group_1__0 : rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 ;
    public final void rule__Conjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1540:1: ( rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 )
            // InternalExpressions.g:1541:2: rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Conjunction__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conjunction__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__0"


    // $ANTLR start "rule__Conjunction__Group_1__0__Impl"
    // InternalExpressions.g:1548:1: rule__Conjunction__Group_1__0__Impl : ( () ) ;
    public final void rule__Conjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1552:1: ( ( () ) )
            // InternalExpressions.g:1553:1: ( () )
            {
            // InternalExpressions.g:1553:1: ( () )
            // InternalExpressions.g:1554:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAccess().getAndLeftAction_1_0()); 
            }
            // InternalExpressions.g:1555:1: ()
            // InternalExpressions.g:1557:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAccess().getAndLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__0__Impl"


    // $ANTLR start "rule__Conjunction__Group_1__1"
    // InternalExpressions.g:1567:1: rule__Conjunction__Group_1__1 : rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2 ;
    public final void rule__Conjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1571:1: ( rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2 )
            // InternalExpressions.g:1572:2: rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__Conjunction__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conjunction__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__1"


    // $ANTLR start "rule__Conjunction__Group_1__1__Impl"
    // InternalExpressions.g:1579:1: rule__Conjunction__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__Conjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1583:1: ( ( 'and' ) )
            // InternalExpressions.g:1584:1: ( 'and' )
            {
            // InternalExpressions.g:1584:1: ( 'and' )
            // InternalExpressions.g:1585:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAccess().getAndKeyword_1_1()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAccess().getAndKeyword_1_1()); 
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
    // $ANTLR end "rule__Conjunction__Group_1__1__Impl"


    // $ANTLR start "rule__Conjunction__Group_1__2"
    // InternalExpressions.g:1598:1: rule__Conjunction__Group_1__2 : rule__Conjunction__Group_1__2__Impl ;
    public final void rule__Conjunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1602:1: ( rule__Conjunction__Group_1__2__Impl )
            // InternalExpressions.g:1603:2: rule__Conjunction__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conjunction__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__2"


    // $ANTLR start "rule__Conjunction__Group_1__2__Impl"
    // InternalExpressions.g:1609:1: rule__Conjunction__Group_1__2__Impl : ( ( rule__Conjunction__RightAssignment_1_2 ) ) ;
    public final void rule__Conjunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1613:1: ( ( ( rule__Conjunction__RightAssignment_1_2 ) ) )
            // InternalExpressions.g:1614:1: ( ( rule__Conjunction__RightAssignment_1_2 ) )
            {
            // InternalExpressions.g:1614:1: ( ( rule__Conjunction__RightAssignment_1_2 ) )
            // InternalExpressions.g:1615:1: ( rule__Conjunction__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAccess().getRightAssignment_1_2()); 
            }
            // InternalExpressions.g:1616:1: ( rule__Conjunction__RightAssignment_1_2 )
            // InternalExpressions.g:1616:2: rule__Conjunction__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Conjunction__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__Conjunction__Group_1__2__Impl"


    // $ANTLR start "rule__Negation__Group_0__0"
    // InternalExpressions.g:1632:1: rule__Negation__Group_0__0 : rule__Negation__Group_0__0__Impl rule__Negation__Group_0__1 ;
    public final void rule__Negation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1636:1: ( rule__Negation__Group_0__0__Impl rule__Negation__Group_0__1 )
            // InternalExpressions.g:1637:2: rule__Negation__Group_0__0__Impl rule__Negation__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Negation__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Negation__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_0__0"


    // $ANTLR start "rule__Negation__Group_0__0__Impl"
    // InternalExpressions.g:1644:1: rule__Negation__Group_0__0__Impl : ( 'not' ) ;
    public final void rule__Negation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1648:1: ( ( 'not' ) )
            // InternalExpressions.g:1649:1: ( 'not' )
            {
            // InternalExpressions.g:1649:1: ( 'not' )
            // InternalExpressions.g:1650:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getNotKeyword_0_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationAccess().getNotKeyword_0_0()); 
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
    // $ANTLR end "rule__Negation__Group_0__0__Impl"


    // $ANTLR start "rule__Negation__Group_0__1"
    // InternalExpressions.g:1663:1: rule__Negation__Group_0__1 : rule__Negation__Group_0__1__Impl ;
    public final void rule__Negation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1667:1: ( rule__Negation__Group_0__1__Impl )
            // InternalExpressions.g:1668:2: rule__Negation__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Negation__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_0__1"


    // $ANTLR start "rule__Negation__Group_0__1__Impl"
    // InternalExpressions.g:1674:1: rule__Negation__Group_0__1__Impl : ( ruleNegated ) ;
    public final void rule__Negation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1678:1: ( ( ruleNegated ) )
            // InternalExpressions.g:1679:1: ( ruleNegated )
            {
            // InternalExpressions.g:1679:1: ( ruleNegated )
            // InternalExpressions.g:1680:1: ruleNegated
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getNegatedParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleNegated();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationAccess().getNegatedParserRuleCall_0_1()); 
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
    // $ANTLR end "rule__Negation__Group_0__1__Impl"


    // $ANTLR start "rule__Negated__Group__0"
    // InternalExpressions.g:1695:1: rule__Negated__Group__0 : rule__Negated__Group__0__Impl rule__Negated__Group__1 ;
    public final void rule__Negated__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1699:1: ( rule__Negated__Group__0__Impl rule__Negated__Group__1 )
            // InternalExpressions.g:1700:2: rule__Negated__Group__0__Impl rule__Negated__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Negated__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Negated__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negated__Group__0"


    // $ANTLR start "rule__Negated__Group__0__Impl"
    // InternalExpressions.g:1707:1: rule__Negated__Group__0__Impl : ( () ) ;
    public final void rule__Negated__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1711:1: ( ( () ) )
            // InternalExpressions.g:1712:1: ( () )
            {
            // InternalExpressions.g:1712:1: ( () )
            // InternalExpressions.g:1713:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegatedAccess().getNotAction_0()); 
            }
            // InternalExpressions.g:1714:1: ()
            // InternalExpressions.g:1716:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegatedAccess().getNotAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negated__Group__0__Impl"


    // $ANTLR start "rule__Negated__Group__1"
    // InternalExpressions.g:1726:1: rule__Negated__Group__1 : rule__Negated__Group__1__Impl ;
    public final void rule__Negated__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1730:1: ( rule__Negated__Group__1__Impl )
            // InternalExpressions.g:1731:2: rule__Negated__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Negated__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negated__Group__1"


    // $ANTLR start "rule__Negated__Group__1__Impl"
    // InternalExpressions.g:1737:1: rule__Negated__Group__1__Impl : ( ( rule__Negated__NotAssignment_1 ) ) ;
    public final void rule__Negated__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1741:1: ( ( ( rule__Negated__NotAssignment_1 ) ) )
            // InternalExpressions.g:1742:1: ( ( rule__Negated__NotAssignment_1 ) )
            {
            // InternalExpressions.g:1742:1: ( ( rule__Negated__NotAssignment_1 ) )
            // InternalExpressions.g:1743:1: ( rule__Negated__NotAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegatedAccess().getNotAssignment_1()); 
            }
            // InternalExpressions.g:1744:1: ( rule__Negated__NotAssignment_1 )
            // InternalExpressions.g:1744:2: rule__Negated__NotAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Negated__NotAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegatedAccess().getNotAssignment_1()); 
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
    // $ANTLR end "rule__Negated__Group__1__Impl"


    // $ANTLR start "rule__CExpression__Group_0__0"
    // InternalExpressions.g:1758:1: rule__CExpression__Group_0__0 : rule__CExpression__Group_0__0__Impl rule__CExpression__Group_0__1 ;
    public final void rule__CExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1762:1: ( rule__CExpression__Group_0__0__Impl rule__CExpression__Group_0__1 )
            // InternalExpressions.g:1763:2: rule__CExpression__Group_0__0__Impl rule__CExpression__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__CExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExpression__Group_0__0"


    // $ANTLR start "rule__CExpression__Group_0__0__Impl"
    // InternalExpressions.g:1770:1: rule__CExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__CExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1774:1: ( ( '(' ) )
            // InternalExpressions.g:1775:1: ( '(' )
            {
            // InternalExpressions.g:1775:1: ( '(' )
            // InternalExpressions.g:1776:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCExpressionAccess().getLeftParenthesisKeyword_0_0()); 
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
    // $ANTLR end "rule__CExpression__Group_0__0__Impl"


    // $ANTLR start "rule__CExpression__Group_0__1"
    // InternalExpressions.g:1789:1: rule__CExpression__Group_0__1 : rule__CExpression__Group_0__1__Impl rule__CExpression__Group_0__2 ;
    public final void rule__CExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1793:1: ( rule__CExpression__Group_0__1__Impl rule__CExpression__Group_0__2 )
            // InternalExpressions.g:1794:2: rule__CExpression__Group_0__1__Impl rule__CExpression__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__CExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExpression__Group_0__1"


    // $ANTLR start "rule__CExpression__Group_0__1__Impl"
    // InternalExpressions.g:1801:1: rule__CExpression__Group_0__1__Impl : ( ruleLExpression ) ;
    public final void rule__CExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1805:1: ( ( ruleLExpression ) )
            // InternalExpressions.g:1806:1: ( ruleLExpression )
            {
            // InternalExpressions.g:1806:1: ( ruleLExpression )
            // InternalExpressions.g:1807:1: ruleLExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCExpressionAccess().getLExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleLExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCExpressionAccess().getLExpressionParserRuleCall_0_1()); 
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
    // $ANTLR end "rule__CExpression__Group_0__1__Impl"


    // $ANTLR start "rule__CExpression__Group_0__2"
    // InternalExpressions.g:1818:1: rule__CExpression__Group_0__2 : rule__CExpression__Group_0__2__Impl ;
    public final void rule__CExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1822:1: ( rule__CExpression__Group_0__2__Impl )
            // InternalExpressions.g:1823:2: rule__CExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExpression__Group_0__2"


    // $ANTLR start "rule__CExpression__Group_0__2__Impl"
    // InternalExpressions.g:1829:1: rule__CExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__CExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1833:1: ( ( ')' ) )
            // InternalExpressions.g:1834:1: ( ')' )
            {
            // InternalExpressions.g:1834:1: ( ')' )
            // InternalExpressions.g:1835:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCExpressionAccess().getRightParenthesisKeyword_0_2()); 
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
    // $ANTLR end "rule__CExpression__Group_0__2__Impl"


    // $ANTLR start "rule__Compare__Group__0"
    // InternalExpressions.g:1854:1: rule__Compare__Group__0 : rule__Compare__Group__0__Impl rule__Compare__Group__1 ;
    public final void rule__Compare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1858:1: ( rule__Compare__Group__0__Impl rule__Compare__Group__1 )
            // InternalExpressions.g:1859:2: rule__Compare__Group__0__Impl rule__Compare__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Compare__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Compare__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group__0"


    // $ANTLR start "rule__Compare__Group__0__Impl"
    // InternalExpressions.g:1866:1: rule__Compare__Group__0__Impl : ( ruleSomeValue ) ;
    public final void rule__Compare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1870:1: ( ( ruleSomeValue ) )
            // InternalExpressions.g:1871:1: ( ruleSomeValue )
            {
            // InternalExpressions.g:1871:1: ( ruleSomeValue )
            // InternalExpressions.g:1872:1: ruleSomeValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getSomeValueParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSomeValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getSomeValueParserRuleCall_0()); 
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
    // $ANTLR end "rule__Compare__Group__0__Impl"


    // $ANTLR start "rule__Compare__Group__1"
    // InternalExpressions.g:1883:1: rule__Compare__Group__1 : rule__Compare__Group__1__Impl rule__Compare__Group__2 ;
    public final void rule__Compare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1887:1: ( rule__Compare__Group__1__Impl rule__Compare__Group__2 )
            // InternalExpressions.g:1888:2: rule__Compare__Group__1__Impl rule__Compare__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Compare__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Compare__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group__1"


    // $ANTLR start "rule__Compare__Group__1__Impl"
    // InternalExpressions.g:1895:1: rule__Compare__Group__1__Impl : ( ( rule__Compare__Alternatives_1 ) ) ;
    public final void rule__Compare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1899:1: ( ( ( rule__Compare__Alternatives_1 ) ) )
            // InternalExpressions.g:1900:1: ( ( rule__Compare__Alternatives_1 ) )
            {
            // InternalExpressions.g:1900:1: ( ( rule__Compare__Alternatives_1 ) )
            // InternalExpressions.g:1901:1: ( rule__Compare__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getAlternatives_1()); 
            }
            // InternalExpressions.g:1902:1: ( rule__Compare__Alternatives_1 )
            // InternalExpressions.g:1902:2: rule__Compare__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__Compare__Group__1__Impl"


    // $ANTLR start "rule__Compare__Group__2"
    // InternalExpressions.g:1912:1: rule__Compare__Group__2 : rule__Compare__Group__2__Impl ;
    public final void rule__Compare__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1916:1: ( rule__Compare__Group__2__Impl )
            // InternalExpressions.g:1917:2: rule__Compare__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group__2"


    // $ANTLR start "rule__Compare__Group__2__Impl"
    // InternalExpressions.g:1923:1: rule__Compare__Group__2__Impl : ( ( rule__Compare__RightAssignment_2 ) ) ;
    public final void rule__Compare__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1927:1: ( ( ( rule__Compare__RightAssignment_2 ) ) )
            // InternalExpressions.g:1928:1: ( ( rule__Compare__RightAssignment_2 ) )
            {
            // InternalExpressions.g:1928:1: ( ( rule__Compare__RightAssignment_2 ) )
            // InternalExpressions.g:1929:1: ( rule__Compare__RightAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getRightAssignment_2()); 
            }
            // InternalExpressions.g:1930:1: ( rule__Compare__RightAssignment_2 )
            // InternalExpressions.g:1930:2: rule__Compare__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Compare__RightAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getRightAssignment_2()); 
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
    // $ANTLR end "rule__Compare__Group__2__Impl"


    // $ANTLR start "rule__Compare__Group_1_0__0"
    // InternalExpressions.g:1946:1: rule__Compare__Group_1_0__0 : rule__Compare__Group_1_0__0__Impl rule__Compare__Group_1_0__1 ;
    public final void rule__Compare__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1950:1: ( rule__Compare__Group_1_0__0__Impl rule__Compare__Group_1_0__1 )
            // InternalExpressions.g:1951:2: rule__Compare__Group_1_0__0__Impl rule__Compare__Group_1_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Compare__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_0__0"


    // $ANTLR start "rule__Compare__Group_1_0__0__Impl"
    // InternalExpressions.g:1958:1: rule__Compare__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1962:1: ( ( () ) )
            // InternalExpressions.g:1963:1: ( () )
            {
            // InternalExpressions.g:1963:1: ( () )
            // InternalExpressions.g:1964:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0()); 
            }
            // InternalExpressions.g:1965:1: ()
            // InternalExpressions.g:1967:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_0__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_0__1"
    // InternalExpressions.g:1977:1: rule__Compare__Group_1_0__1 : rule__Compare__Group_1_0__1__Impl ;
    public final void rule__Compare__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1981:1: ( rule__Compare__Group_1_0__1__Impl )
            // InternalExpressions.g:1982:2: rule__Compare__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_0__1"


    // $ANTLR start "rule__Compare__Group_1_0__1__Impl"
    // InternalExpressions.g:1988:1: rule__Compare__Group_1_0__1__Impl : ( '<=' ) ;
    public final void rule__Compare__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:1992:1: ( ( '<=' ) )
            // InternalExpressions.g:1993:1: ( '<=' )
            {
            // InternalExpressions.g:1993:1: ( '<=' )
            // InternalExpressions.g:1994:1: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getLessThanSignEqualsSignKeyword_1_0_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getLessThanSignEqualsSignKeyword_1_0_1()); 
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
    // $ANTLR end "rule__Compare__Group_1_0__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_1__0"
    // InternalExpressions.g:2011:1: rule__Compare__Group_1_1__0 : rule__Compare__Group_1_1__0__Impl rule__Compare__Group_1_1__1 ;
    public final void rule__Compare__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2015:1: ( rule__Compare__Group_1_1__0__Impl rule__Compare__Group_1_1__1 )
            // InternalExpressions.g:2016:2: rule__Compare__Group_1_1__0__Impl rule__Compare__Group_1_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Compare__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_1__0"


    // $ANTLR start "rule__Compare__Group_1_1__0__Impl"
    // InternalExpressions.g:2023:1: rule__Compare__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2027:1: ( ( () ) )
            // InternalExpressions.g:2028:1: ( () )
            {
            // InternalExpressions.g:2028:1: ( () )
            // InternalExpressions.g:2029:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getLessLeftAction_1_1_0()); 
            }
            // InternalExpressions.g:2030:1: ()
            // InternalExpressions.g:2032:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getLessLeftAction_1_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_1__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_1__1"
    // InternalExpressions.g:2042:1: rule__Compare__Group_1_1__1 : rule__Compare__Group_1_1__1__Impl ;
    public final void rule__Compare__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2046:1: ( rule__Compare__Group_1_1__1__Impl )
            // InternalExpressions.g:2047:2: rule__Compare__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_1__1"


    // $ANTLR start "rule__Compare__Group_1_1__1__Impl"
    // InternalExpressions.g:2053:1: rule__Compare__Group_1_1__1__Impl : ( '<' ) ;
    public final void rule__Compare__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2057:1: ( ( '<' ) )
            // InternalExpressions.g:2058:1: ( '<' )
            {
            // InternalExpressions.g:2058:1: ( '<' )
            // InternalExpressions.g:2059:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getLessThanSignKeyword_1_1_1()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getLessThanSignKeyword_1_1_1()); 
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
    // $ANTLR end "rule__Compare__Group_1_1__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_2__0"
    // InternalExpressions.g:2076:1: rule__Compare__Group_1_2__0 : rule__Compare__Group_1_2__0__Impl rule__Compare__Group_1_2__1 ;
    public final void rule__Compare__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2080:1: ( rule__Compare__Group_1_2__0__Impl rule__Compare__Group_1_2__1 )
            // InternalExpressions.g:2081:2: rule__Compare__Group_1_2__0__Impl rule__Compare__Group_1_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Compare__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_2__0"


    // $ANTLR start "rule__Compare__Group_1_2__0__Impl"
    // InternalExpressions.g:2088:1: rule__Compare__Group_1_2__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2092:1: ( ( () ) )
            // InternalExpressions.g:2093:1: ( () )
            {
            // InternalExpressions.g:2093:1: ( () )
            // InternalExpressions.g:2094:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0()); 
            }
            // InternalExpressions.g:2095:1: ()
            // InternalExpressions.g:2097:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_2__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_2__1"
    // InternalExpressions.g:2107:1: rule__Compare__Group_1_2__1 : rule__Compare__Group_1_2__1__Impl ;
    public final void rule__Compare__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2111:1: ( rule__Compare__Group_1_2__1__Impl )
            // InternalExpressions.g:2112:2: rule__Compare__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_2__1"


    // $ANTLR start "rule__Compare__Group_1_2__1__Impl"
    // InternalExpressions.g:2118:1: rule__Compare__Group_1_2__1__Impl : ( '>=' ) ;
    public final void rule__Compare__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2122:1: ( ( '>=' ) )
            // InternalExpressions.g:2123:1: ( '>=' )
            {
            // InternalExpressions.g:2123:1: ( '>=' )
            // InternalExpressions.g:2124:1: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getGreaterThanSignEqualsSignKeyword_1_2_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getGreaterThanSignEqualsSignKeyword_1_2_1()); 
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
    // $ANTLR end "rule__Compare__Group_1_2__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_3__0"
    // InternalExpressions.g:2141:1: rule__Compare__Group_1_3__0 : rule__Compare__Group_1_3__0__Impl rule__Compare__Group_1_3__1 ;
    public final void rule__Compare__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2145:1: ( rule__Compare__Group_1_3__0__Impl rule__Compare__Group_1_3__1 )
            // InternalExpressions.g:2146:2: rule__Compare__Group_1_3__0__Impl rule__Compare__Group_1_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Compare__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_3__0"


    // $ANTLR start "rule__Compare__Group_1_3__0__Impl"
    // InternalExpressions.g:2153:1: rule__Compare__Group_1_3__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2157:1: ( ( () ) )
            // InternalExpressions.g:2158:1: ( () )
            {
            // InternalExpressions.g:2158:1: ( () )
            // InternalExpressions.g:2159:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0()); 
            }
            // InternalExpressions.g:2160:1: ()
            // InternalExpressions.g:2162:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_3__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_3__1"
    // InternalExpressions.g:2172:1: rule__Compare__Group_1_3__1 : rule__Compare__Group_1_3__1__Impl ;
    public final void rule__Compare__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2176:1: ( rule__Compare__Group_1_3__1__Impl )
            // InternalExpressions.g:2177:2: rule__Compare__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_3__1"


    // $ANTLR start "rule__Compare__Group_1_3__1__Impl"
    // InternalExpressions.g:2183:1: rule__Compare__Group_1_3__1__Impl : ( '>' ) ;
    public final void rule__Compare__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2187:1: ( ( '>' ) )
            // InternalExpressions.g:2188:1: ( '>' )
            {
            // InternalExpressions.g:2188:1: ( '>' )
            // InternalExpressions.g:2189:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getGreaterThanSignKeyword_1_3_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getGreaterThanSignKeyword_1_3_1()); 
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
    // $ANTLR end "rule__Compare__Group_1_3__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_4__0"
    // InternalExpressions.g:2206:1: rule__Compare__Group_1_4__0 : rule__Compare__Group_1_4__0__Impl rule__Compare__Group_1_4__1 ;
    public final void rule__Compare__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2210:1: ( rule__Compare__Group_1_4__0__Impl rule__Compare__Group_1_4__1 )
            // InternalExpressions.g:2211:2: rule__Compare__Group_1_4__0__Impl rule__Compare__Group_1_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Compare__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_4__0"


    // $ANTLR start "rule__Compare__Group_1_4__0__Impl"
    // InternalExpressions.g:2218:1: rule__Compare__Group_1_4__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2222:1: ( ( () ) )
            // InternalExpressions.g:2223:1: ( () )
            {
            // InternalExpressions.g:2223:1: ( () )
            // InternalExpressions.g:2224:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0()); 
            }
            // InternalExpressions.g:2225:1: ()
            // InternalExpressions.g:2227:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_4__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_4__1"
    // InternalExpressions.g:2237:1: rule__Compare__Group_1_4__1 : rule__Compare__Group_1_4__1__Impl ;
    public final void rule__Compare__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2241:1: ( rule__Compare__Group_1_4__1__Impl )
            // InternalExpressions.g:2242:2: rule__Compare__Group_1_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_4__1"


    // $ANTLR start "rule__Compare__Group_1_4__1__Impl"
    // InternalExpressions.g:2248:1: rule__Compare__Group_1_4__1__Impl : ( '=' ) ;
    public final void rule__Compare__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2252:1: ( ( '=' ) )
            // InternalExpressions.g:2253:1: ( '=' )
            {
            // InternalExpressions.g:2253:1: ( '=' )
            // InternalExpressions.g:2254:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getEqualsSignKeyword_1_4_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getEqualsSignKeyword_1_4_1()); 
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
    // $ANTLR end "rule__Compare__Group_1_4__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_5__0"
    // InternalExpressions.g:2271:1: rule__Compare__Group_1_5__0 : rule__Compare__Group_1_5__0__Impl rule__Compare__Group_1_5__1 ;
    public final void rule__Compare__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2275:1: ( rule__Compare__Group_1_5__0__Impl rule__Compare__Group_1_5__1 )
            // InternalExpressions.g:2276:2: rule__Compare__Group_1_5__0__Impl rule__Compare__Group_1_5__1
            {
            pushFollow(FOLLOW_17);
            rule__Compare__Group_1_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_5__0"


    // $ANTLR start "rule__Compare__Group_1_5__0__Impl"
    // InternalExpressions.g:2283:1: rule__Compare__Group_1_5__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2287:1: ( ( () ) )
            // InternalExpressions.g:2288:1: ( () )
            {
            // InternalExpressions.g:2288:1: ( () )
            // InternalExpressions.g:2289:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0()); 
            }
            // InternalExpressions.g:2290:1: ()
            // InternalExpressions.g:2292:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_5__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_5__1"
    // InternalExpressions.g:2302:1: rule__Compare__Group_1_5__1 : rule__Compare__Group_1_5__1__Impl ;
    public final void rule__Compare__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2306:1: ( rule__Compare__Group_1_5__1__Impl )
            // InternalExpressions.g:2307:2: rule__Compare__Group_1_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_5__1"


    // $ANTLR start "rule__Compare__Group_1_5__1__Impl"
    // InternalExpressions.g:2313:1: rule__Compare__Group_1_5__1__Impl : ( '!=' ) ;
    public final void rule__Compare__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2317:1: ( ( '!=' ) )
            // InternalExpressions.g:2318:1: ( '!=' )
            {
            // InternalExpressions.g:2318:1: ( '!=' )
            // InternalExpressions.g:2319:1: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getExclamationMarkEqualsSignKeyword_1_5_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getExclamationMarkEqualsSignKeyword_1_5_1()); 
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
    // $ANTLR end "rule__Compare__Group_1_5__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_6__0"
    // InternalExpressions.g:2336:1: rule__Compare__Group_1_6__0 : rule__Compare__Group_1_6__0__Impl rule__Compare__Group_1_6__1 ;
    public final void rule__Compare__Group_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2340:1: ( rule__Compare__Group_1_6__0__Impl rule__Compare__Group_1_6__1 )
            // InternalExpressions.g:2341:2: rule__Compare__Group_1_6__0__Impl rule__Compare__Group_1_6__1
            {
            pushFollow(FOLLOW_10);
            rule__Compare__Group_1_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_6__0"


    // $ANTLR start "rule__Compare__Group_1_6__0__Impl"
    // InternalExpressions.g:2348:1: rule__Compare__Group_1_6__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2352:1: ( ( () ) )
            // InternalExpressions.g:2353:1: ( () )
            {
            // InternalExpressions.g:2353:1: ( () )
            // InternalExpressions.g:2354:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0()); 
            }
            // InternalExpressions.g:2355:1: ()
            // InternalExpressions.g:2357:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_6__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_6__1"
    // InternalExpressions.g:2367:1: rule__Compare__Group_1_6__1 : rule__Compare__Group_1_6__1__Impl ;
    public final void rule__Compare__Group_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2371:1: ( rule__Compare__Group_1_6__1__Impl )
            // InternalExpressions.g:2372:2: rule__Compare__Group_1_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Group_1_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_6__1"


    // $ANTLR start "rule__Compare__Group_1_6__1__Impl"
    // InternalExpressions.g:2378:1: rule__Compare__Group_1_6__1__Impl : ( '~' ) ;
    public final void rule__Compare__Group_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2382:1: ( ( '~' ) )
            // InternalExpressions.g:2383:1: ( '~' )
            {
            // InternalExpressions.g:2383:1: ( '~' )
            // InternalExpressions.g:2384:1: '~'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getTildeKeyword_1_6_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getTildeKeyword_1_6_1()); 
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
    // $ANTLR end "rule__Compare__Group_1_6__1__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalExpressions.g:2401:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2405:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalExpressions.g:2406:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Addition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalExpressions.g:2413:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2417:1: ( ( ruleMultiplication ) )
            // InternalExpressions.g:2418:1: ( ruleMultiplication )
            {
            // InternalExpressions.g:2418:1: ( ruleMultiplication )
            // InternalExpressions.g:2419:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
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
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalExpressions.g:2430:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2434:1: ( rule__Addition__Group__1__Impl )
            // InternalExpressions.g:2435:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalExpressions.g:2441:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2445:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalExpressions.g:2446:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalExpressions.g:2446:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalExpressions.g:2447:1: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // InternalExpressions.g:2448:1: ( rule__Addition__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=27 && LA14_0<=28)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalExpressions.g:2448:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalExpressions.g:2462:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2466:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalExpressions.g:2467:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalExpressions.g:2474:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2478:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // InternalExpressions.g:2479:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // InternalExpressions.g:2479:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // InternalExpressions.g:2480:1: ( rule__Addition__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            }
            // InternalExpressions.g:2481:1: ( rule__Addition__Alternatives_1_0 )
            // InternalExpressions.g:2481:2: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
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
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalExpressions.g:2491:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2495:1: ( rule__Addition__Group_1__1__Impl )
            // InternalExpressions.g:2496:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalExpressions.g:2502:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2506:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // InternalExpressions.g:2507:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // InternalExpressions.g:2507:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // InternalExpressions.g:2508:1: ( rule__Addition__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            }
            // InternalExpressions.g:2509:1: ( rule__Addition__RightAssignment_1_1 )
            // InternalExpressions.g:2509:2: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
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
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__0"
    // InternalExpressions.g:2523:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2527:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // InternalExpressions.g:2528:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Addition__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0"


    // $ANTLR start "rule__Addition__Group_1_0_0__0__Impl"
    // InternalExpressions.g:2535:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2539:1: ( ( () ) )
            // InternalExpressions.g:2540:1: ( () )
            {
            // InternalExpressions.g:2540:1: ( () )
            // InternalExpressions.g:2541:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            }
            // InternalExpressions.g:2542:1: ()
            // InternalExpressions.g:2544:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__1"
    // InternalExpressions.g:2554:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2558:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // InternalExpressions.g:2559:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__1"


    // $ANTLR start "rule__Addition__Group_1_0_0__1__Impl"
    // InternalExpressions.g:2565:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2569:1: ( ( '+' ) )
            // InternalExpressions.g:2570:1: ( '+' )
            {
            // InternalExpressions.g:2570:1: ( '+' )
            // InternalExpressions.g:2571:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
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
    // $ANTLR end "rule__Addition__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__0"
    // InternalExpressions.g:2588:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2592:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // InternalExpressions.g:2593:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_18);
            rule__Addition__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0"


    // $ANTLR start "rule__Addition__Group_1_0_1__0__Impl"
    // InternalExpressions.g:2600:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2604:1: ( ( () ) )
            // InternalExpressions.g:2605:1: ( () )
            {
            // InternalExpressions.g:2605:1: ( () )
            // InternalExpressions.g:2606:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            }
            // InternalExpressions.g:2607:1: ()
            // InternalExpressions.g:2609:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__1"
    // InternalExpressions.g:2619:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2623:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // InternalExpressions.g:2624:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__1"


    // $ANTLR start "rule__Addition__Group_1_0_1__1__Impl"
    // InternalExpressions.g:2630:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2634:1: ( ( '-' ) )
            // InternalExpressions.g:2635:1: ( '-' )
            {
            // InternalExpressions.g:2635:1: ( '-' )
            // InternalExpressions.g:2636:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
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
    // $ANTLR end "rule__Addition__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalExpressions.g:2653:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2657:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalExpressions.g:2658:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalExpressions.g:2665:1: rule__Multiplication__Group__0__Impl : ( rulePower ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2669:1: ( ( rulePower ) )
            // InternalExpressions.g:2670:1: ( rulePower )
            {
            // InternalExpressions.g:2670:1: ( rulePower )
            // InternalExpressions.g:2671:1: rulePower
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePower();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0()); 
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
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalExpressions.g:2682:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2686:1: ( rule__Multiplication__Group__1__Impl )
            // InternalExpressions.g:2687:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalExpressions.g:2693:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2697:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalExpressions.g:2698:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalExpressions.g:2698:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalExpressions.g:2699:1: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // InternalExpressions.g:2700:1: ( rule__Multiplication__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=29 && LA15_0<=31)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalExpressions.g:2700:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalExpressions.g:2714:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2718:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalExpressions.g:2719:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalExpressions.g:2726:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2730:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // InternalExpressions.g:2731:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // InternalExpressions.g:2731:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // InternalExpressions.g:2732:1: ( rule__Multiplication__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            }
            // InternalExpressions.g:2733:1: ( rule__Multiplication__Alternatives_1_0 )
            // InternalExpressions.g:2733:2: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
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
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalExpressions.g:2743:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2747:1: ( rule__Multiplication__Group_1__1__Impl )
            // InternalExpressions.g:2748:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalExpressions.g:2754:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2758:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // InternalExpressions.g:2759:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // InternalExpressions.g:2759:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // InternalExpressions.g:2760:1: ( rule__Multiplication__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            }
            // InternalExpressions.g:2761:1: ( rule__Multiplication__RightAssignment_1_1 )
            // InternalExpressions.g:2761:2: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
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
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0"
    // InternalExpressions.g:2775:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2779:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // InternalExpressions.g:2780:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_23);
            rule__Multiplication__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0__Impl"
    // InternalExpressions.g:2787:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2791:1: ( ( () ) )
            // InternalExpressions.g:2792:1: ( () )
            {
            // InternalExpressions.g:2792:1: ( () )
            // InternalExpressions.g:2793:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            }
            // InternalExpressions.g:2794:1: ()
            // InternalExpressions.g:2796:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1"
    // InternalExpressions.g:2806:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2810:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // InternalExpressions.g:2811:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1__Impl"
    // InternalExpressions.g:2817:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2821:1: ( ( '*' ) )
            // InternalExpressions.g:2822:1: ( '*' )
            {
            // InternalExpressions.g:2822:1: ( '*' )
            // InternalExpressions.g:2823:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
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
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0"
    // InternalExpressions.g:2840:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2844:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // InternalExpressions.g:2845:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Multiplication__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0__Impl"
    // InternalExpressions.g:2852:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2856:1: ( ( () ) )
            // InternalExpressions.g:2857:1: ( () )
            {
            // InternalExpressions.g:2857:1: ( () )
            // InternalExpressions.g:2858:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            }
            // InternalExpressions.g:2859:1: ()
            // InternalExpressions.g:2861:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1"
    // InternalExpressions.g:2871:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2875:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // InternalExpressions.g:2876:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1__Impl"
    // InternalExpressions.g:2882:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2886:1: ( ( '/' ) )
            // InternalExpressions.g:2887:1: ( '/' )
            {
            // InternalExpressions.g:2887:1: ( '/' )
            // InternalExpressions.g:2888:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
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
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_2__0"
    // InternalExpressions.g:2905:1: rule__Multiplication__Group_1_0_2__0 : rule__Multiplication__Group_1_0_2__0__Impl rule__Multiplication__Group_1_0_2__1 ;
    public final void rule__Multiplication__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2909:1: ( rule__Multiplication__Group_1_0_2__0__Impl rule__Multiplication__Group_1_0_2__1 )
            // InternalExpressions.g:2910:2: rule__Multiplication__Group_1_0_2__0__Impl rule__Multiplication__Group_1_0_2__1
            {
            pushFollow(FOLLOW_21);
            rule__Multiplication__Group_1_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_2__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_2__0__Impl"
    // InternalExpressions.g:2917:1: rule__Multiplication__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2921:1: ( ( () ) )
            // InternalExpressions.g:2922:1: ( () )
            {
            // InternalExpressions.g:2922:1: ( () )
            // InternalExpressions.g:2923:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0()); 
            }
            // InternalExpressions.g:2924:1: ()
            // InternalExpressions.g:2926:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_2__1"
    // InternalExpressions.g:2936:1: rule__Multiplication__Group_1_0_2__1 : rule__Multiplication__Group_1_0_2__1__Impl ;
    public final void rule__Multiplication__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2940:1: ( rule__Multiplication__Group_1_0_2__1__Impl )
            // InternalExpressions.g:2941:2: rule__Multiplication__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_2__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_2__1__Impl"
    // InternalExpressions.g:2947:1: rule__Multiplication__Group_1_0_2__1__Impl : ( '%' ) ;
    public final void rule__Multiplication__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2951:1: ( ( '%' ) )
            // InternalExpressions.g:2952:1: ( '%' )
            {
            // InternalExpressions.g:2952:1: ( '%' )
            // InternalExpressions.g:2953:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_0_2_1()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_0_2_1()); 
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
    // $ANTLR end "rule__Multiplication__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__Power__Group__0"
    // InternalExpressions.g:2970:1: rule__Power__Group__0 : rule__Power__Group__0__Impl rule__Power__Group__1 ;
    public final void rule__Power__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2974:1: ( rule__Power__Group__0__Impl rule__Power__Group__1 )
            // InternalExpressions.g:2975:2: rule__Power__Group__0__Impl rule__Power__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Power__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Power__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__0"


    // $ANTLR start "rule__Power__Group__0__Impl"
    // InternalExpressions.g:2982:1: rule__Power__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Power__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:2986:1: ( ( rulePrimaryExpression ) )
            // InternalExpressions.g:2987:1: ( rulePrimaryExpression )
            {
            // InternalExpressions.g:2987:1: ( rulePrimaryExpression )
            // InternalExpressions.g:2988:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getPrimaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getPrimaryExpressionParserRuleCall_0()); 
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
    // $ANTLR end "rule__Power__Group__0__Impl"


    // $ANTLR start "rule__Power__Group__1"
    // InternalExpressions.g:2999:1: rule__Power__Group__1 : rule__Power__Group__1__Impl ;
    public final void rule__Power__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3003:1: ( rule__Power__Group__1__Impl )
            // InternalExpressions.g:3004:2: rule__Power__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Power__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__1"


    // $ANTLR start "rule__Power__Group__1__Impl"
    // InternalExpressions.g:3010:1: rule__Power__Group__1__Impl : ( ( rule__Power__Group_1__0 )* ) ;
    public final void rule__Power__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3014:1: ( ( ( rule__Power__Group_1__0 )* ) )
            // InternalExpressions.g:3015:1: ( ( rule__Power__Group_1__0 )* )
            {
            // InternalExpressions.g:3015:1: ( ( rule__Power__Group_1__0 )* )
            // InternalExpressions.g:3016:1: ( rule__Power__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getGroup_1()); 
            }
            // InternalExpressions.g:3017:1: ( rule__Power__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalExpressions.g:3017:2: rule__Power__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Power__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Power__Group__1__Impl"


    // $ANTLR start "rule__Power__Group_1__0"
    // InternalExpressions.g:3031:1: rule__Power__Group_1__0 : rule__Power__Group_1__0__Impl rule__Power__Group_1__1 ;
    public final void rule__Power__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3035:1: ( rule__Power__Group_1__0__Impl rule__Power__Group_1__1 )
            // InternalExpressions.g:3036:2: rule__Power__Group_1__0__Impl rule__Power__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Power__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Power__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group_1__0"


    // $ANTLR start "rule__Power__Group_1__0__Impl"
    // InternalExpressions.g:3043:1: rule__Power__Group_1__0__Impl : ( ( rule__Power__Group_1_0__0 ) ) ;
    public final void rule__Power__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3047:1: ( ( ( rule__Power__Group_1_0__0 ) ) )
            // InternalExpressions.g:3048:1: ( ( rule__Power__Group_1_0__0 ) )
            {
            // InternalExpressions.g:3048:1: ( ( rule__Power__Group_1_0__0 ) )
            // InternalExpressions.g:3049:1: ( rule__Power__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getGroup_1_0()); 
            }
            // InternalExpressions.g:3050:1: ( rule__Power__Group_1_0__0 )
            // InternalExpressions.g:3050:2: rule__Power__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Power__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getGroup_1_0()); 
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
    // $ANTLR end "rule__Power__Group_1__0__Impl"


    // $ANTLR start "rule__Power__Group_1__1"
    // InternalExpressions.g:3060:1: rule__Power__Group_1__1 : rule__Power__Group_1__1__Impl ;
    public final void rule__Power__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3064:1: ( rule__Power__Group_1__1__Impl )
            // InternalExpressions.g:3065:2: rule__Power__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Power__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group_1__1"


    // $ANTLR start "rule__Power__Group_1__1__Impl"
    // InternalExpressions.g:3071:1: rule__Power__Group_1__1__Impl : ( ( rule__Power__RightAssignment_1_1 ) ) ;
    public final void rule__Power__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3075:1: ( ( ( rule__Power__RightAssignment_1_1 ) ) )
            // InternalExpressions.g:3076:1: ( ( rule__Power__RightAssignment_1_1 ) )
            {
            // InternalExpressions.g:3076:1: ( ( rule__Power__RightAssignment_1_1 ) )
            // InternalExpressions.g:3077:1: ( rule__Power__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getRightAssignment_1_1()); 
            }
            // InternalExpressions.g:3078:1: ( rule__Power__RightAssignment_1_1 )
            // InternalExpressions.g:3078:2: rule__Power__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Power__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getRightAssignment_1_1()); 
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
    // $ANTLR end "rule__Power__Group_1__1__Impl"


    // $ANTLR start "rule__Power__Group_1_0__0"
    // InternalExpressions.g:3092:1: rule__Power__Group_1_0__0 : rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1 ;
    public final void rule__Power__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3096:1: ( rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1 )
            // InternalExpressions.g:3097:2: rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1
            {
            pushFollow(FOLLOW_25);
            rule__Power__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Power__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group_1_0__0"


    // $ANTLR start "rule__Power__Group_1_0__0__Impl"
    // InternalExpressions.g:3104:1: rule__Power__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Power__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3108:1: ( ( () ) )
            // InternalExpressions.g:3109:1: ( () )
            {
            // InternalExpressions.g:3109:1: ( () )
            // InternalExpressions.g:3110:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0()); 
            }
            // InternalExpressions.g:3111:1: ()
            // InternalExpressions.g:3113:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group_1_0__0__Impl"


    // $ANTLR start "rule__Power__Group_1_0__1"
    // InternalExpressions.g:3123:1: rule__Power__Group_1_0__1 : rule__Power__Group_1_0__1__Impl ;
    public final void rule__Power__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3127:1: ( rule__Power__Group_1_0__1__Impl )
            // InternalExpressions.g:3128:2: rule__Power__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Power__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group_1_0__1"


    // $ANTLR start "rule__Power__Group_1_0__1__Impl"
    // InternalExpressions.g:3134:1: rule__Power__Group_1_0__1__Impl : ( '^' ) ;
    public final void rule__Power__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3138:1: ( ( '^' ) )
            // InternalExpressions.g:3139:1: ( '^' )
            {
            // InternalExpressions.g:3139:1: ( '^' )
            // InternalExpressions.g:3140:1: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1()); 
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
    // $ANTLR end "rule__Power__Group_1_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // InternalExpressions.g:3157:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3161:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // InternalExpressions.g:3162:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // InternalExpressions.g:3169:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3173:1: ( ( '(' ) )
            // InternalExpressions.g:3174:1: ( '(' )
            {
            // InternalExpressions.g:3174:1: ( '(' )
            // InternalExpressions.g:3175:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // InternalExpressions.g:3188:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3192:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // InternalExpressions.g:3193:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_9);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // InternalExpressions.g:3200:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleAExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3204:1: ( ( ruleAExpression ) )
            // InternalExpressions.g:3205:1: ( ruleAExpression )
            {
            // InternalExpressions.g:3205:1: ( ruleAExpression )
            // InternalExpressions.g:3206:1: ruleAExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleAExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getAExpressionParserRuleCall_0_1()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2"
    // InternalExpressions.g:3217:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3221:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // InternalExpressions.g:3222:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2__Impl"
    // InternalExpressions.g:3228:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3232:1: ( ( ')' ) )
            // InternalExpressions.g:3233:1: ( ')' )
            {
            // InternalExpressions.g:3233:1: ( ')' )
            // InternalExpressions.g:3234:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
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
    // $ANTLR end "rule__PrimaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__NUMBER__Group__0"
    // InternalExpressions.g:3253:1: rule__NUMBER__Group__0 : rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 ;
    public final void rule__NUMBER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3257:1: ( rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 )
            // InternalExpressions.g:3258:2: rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__NUMBER__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group__0"


    // $ANTLR start "rule__NUMBER__Group__0__Impl"
    // InternalExpressions.g:3265:1: rule__NUMBER__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3269:1: ( ( RULE_INT ) )
            // InternalExpressions.g:3270:1: ( RULE_INT )
            {
            // InternalExpressions.g:3270:1: ( RULE_INT )
            // InternalExpressions.g:3271:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__NUMBER__Group__0__Impl"


    // $ANTLR start "rule__NUMBER__Group__1"
    // InternalExpressions.g:3282:1: rule__NUMBER__Group__1 : rule__NUMBER__Group__1__Impl ;
    public final void rule__NUMBER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3286:1: ( rule__NUMBER__Group__1__Impl )
            // InternalExpressions.g:3287:2: rule__NUMBER__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group__1"


    // $ANTLR start "rule__NUMBER__Group__1__Impl"
    // InternalExpressions.g:3293:1: rule__NUMBER__Group__1__Impl : ( ( rule__NUMBER__Group_1__0 )? ) ;
    public final void rule__NUMBER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3297:1: ( ( ( rule__NUMBER__Group_1__0 )? ) )
            // InternalExpressions.g:3298:1: ( ( rule__NUMBER__Group_1__0 )? )
            {
            // InternalExpressions.g:3298:1: ( ( rule__NUMBER__Group_1__0 )? )
            // InternalExpressions.g:3299:1: ( rule__NUMBER__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getGroup_1()); 
            }
            // InternalExpressions.g:3300:1: ( rule__NUMBER__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalExpressions.g:3300:2: rule__NUMBER__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NUMBER__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getGroup_1()); 
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
    // $ANTLR end "rule__NUMBER__Group__1__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__0"
    // InternalExpressions.g:3314:1: rule__NUMBER__Group_1__0 : rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 ;
    public final void rule__NUMBER__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3318:1: ( rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 )
            // InternalExpressions.g:3319:2: rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__NUMBER__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_1__0"


    // $ANTLR start "rule__NUMBER__Group_1__0__Impl"
    // InternalExpressions.g:3326:1: rule__NUMBER__Group_1__0__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3330:1: ( ( '.' ) )
            // InternalExpressions.g:3331:1: ( '.' )
            {
            // InternalExpressions.g:3331:1: ( '.' )
            // InternalExpressions.g:3332:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__NUMBER__Group_1__0__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__1"
    // InternalExpressions.g:3345:1: rule__NUMBER__Group_1__1 : rule__NUMBER__Group_1__1__Impl ;
    public final void rule__NUMBER__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3349:1: ( rule__NUMBER__Group_1__1__Impl )
            // InternalExpressions.g:3350:2: rule__NUMBER__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_1__1"


    // $ANTLR start "rule__NUMBER__Group_1__1__Impl"
    // InternalExpressions.g:3356:1: rule__NUMBER__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3360:1: ( ( RULE_INT ) )
            // InternalExpressions.g:3361:1: ( RULE_INT )
            {
            // InternalExpressions.g:3361:1: ( RULE_INT )
            // InternalExpressions.g:3362:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_1()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__NUMBER__Group_1__1__Impl"


    // $ANTLR start "rule__VARIABLE_VALUE__Group_1__0"
    // InternalExpressions.g:3377:1: rule__VARIABLE_VALUE__Group_1__0 : rule__VARIABLE_VALUE__Group_1__0__Impl rule__VARIABLE_VALUE__Group_1__1 ;
    public final void rule__VARIABLE_VALUE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3381:1: ( rule__VARIABLE_VALUE__Group_1__0__Impl rule__VARIABLE_VALUE__Group_1__1 )
            // InternalExpressions.g:3382:2: rule__VARIABLE_VALUE__Group_1__0__Impl rule__VARIABLE_VALUE__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__VARIABLE_VALUE__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VARIABLE_VALUE__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE_VALUE__Group_1__0"


    // $ANTLR start "rule__VARIABLE_VALUE__Group_1__0__Impl"
    // InternalExpressions.g:3389:1: rule__VARIABLE_VALUE__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__VARIABLE_VALUE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3393:1: ( ( RULE_ID ) )
            // InternalExpressions.g:3394:1: ( RULE_ID )
            {
            // InternalExpressions.g:3394:1: ( RULE_ID )
            // InternalExpressions.g:3395:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__VARIABLE_VALUE__Group_1__0__Impl"


    // $ANTLR start "rule__VARIABLE_VALUE__Group_1__1"
    // InternalExpressions.g:3406:1: rule__VARIABLE_VALUE__Group_1__1 : rule__VARIABLE_VALUE__Group_1__1__Impl rule__VARIABLE_VALUE__Group_1__2 ;
    public final void rule__VARIABLE_VALUE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3410:1: ( rule__VARIABLE_VALUE__Group_1__1__Impl rule__VARIABLE_VALUE__Group_1__2 )
            // InternalExpressions.g:3411:2: rule__VARIABLE_VALUE__Group_1__1__Impl rule__VARIABLE_VALUE__Group_1__2
            {
            pushFollow(FOLLOW_29);
            rule__VARIABLE_VALUE__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__VARIABLE_VALUE__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE_VALUE__Group_1__1"


    // $ANTLR start "rule__VARIABLE_VALUE__Group_1__1__Impl"
    // InternalExpressions.g:3418:1: rule__VARIABLE_VALUE__Group_1__1__Impl : ( '.' ) ;
    public final void rule__VARIABLE_VALUE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3422:1: ( ( '.' ) )
            // InternalExpressions.g:3423:1: ( '.' )
            {
            // InternalExpressions.g:3423:1: ( '.' )
            // InternalExpressions.g:3424:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARIABLE_VALUEAccess().getFullStopKeyword_1_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARIABLE_VALUEAccess().getFullStopKeyword_1_1()); 
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
    // $ANTLR end "rule__VARIABLE_VALUE__Group_1__1__Impl"


    // $ANTLR start "rule__VARIABLE_VALUE__Group_1__2"
    // InternalExpressions.g:3437:1: rule__VARIABLE_VALUE__Group_1__2 : rule__VARIABLE_VALUE__Group_1__2__Impl ;
    public final void rule__VARIABLE_VALUE__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3441:1: ( rule__VARIABLE_VALUE__Group_1__2__Impl )
            // InternalExpressions.g:3442:2: rule__VARIABLE_VALUE__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VARIABLE_VALUE__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE_VALUE__Group_1__2"


    // $ANTLR start "rule__VARIABLE_VALUE__Group_1__2__Impl"
    // InternalExpressions.g:3448:1: rule__VARIABLE_VALUE__Group_1__2__Impl : ( RULE_ID ) ;
    public final void rule__VARIABLE_VALUE__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3452:1: ( ( RULE_ID ) )
            // InternalExpressions.g:3453:1: ( RULE_ID )
            {
            // InternalExpressions.g:3453:1: ( RULE_ID )
            // InternalExpressions.g:3454:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_2()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_2()); 
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
    // $ANTLR end "rule__VARIABLE_VALUE__Group_1__2__Impl"


    // $ANTLR start "rule__Equivalent__RightAssignment_1_2"
    // InternalExpressions.g:3472:1: rule__Equivalent__RightAssignment_1_2 : ( ruleEquivalent ) ;
    public final void rule__Equivalent__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3476:1: ( ( ruleEquivalent ) )
            // InternalExpressions.g:3477:1: ( ruleEquivalent )
            {
            // InternalExpressions.g:3477:1: ( ruleEquivalent )
            // InternalExpressions.g:3478:1: ruleEquivalent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentAccess().getRightEquivalentParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEquivalent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentAccess().getRightEquivalentParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Equivalent__RightAssignment_1_2"


    // $ANTLR start "rule__Implication__RightAssignment_1_2"
    // InternalExpressions.g:3487:1: rule__Implication__RightAssignment_1_2 : ( ruleImplication ) ;
    public final void rule__Implication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3491:1: ( ( ruleImplication ) )
            // InternalExpressions.g:3492:1: ( ruleImplication )
            {
            // InternalExpressions.g:3492:1: ( ruleImplication )
            // InternalExpressions.g:3493:1: ruleImplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationAccess().getRightImplicationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationAccess().getRightImplicationParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Implication__RightAssignment_1_2"


    // $ANTLR start "rule__Disjunction__RightAssignment_1_1"
    // InternalExpressions.g:3502:1: rule__Disjunction__RightAssignment_1_1 : ( ruleDisjunction ) ;
    public final void rule__Disjunction__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3506:1: ( ( ruleDisjunction ) )
            // InternalExpressions.g:3507:1: ( ruleDisjunction )
            {
            // InternalExpressions.g:3507:1: ( ruleDisjunction )
            // InternalExpressions.g:3508:1: ruleDisjunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getRightDisjunctionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDisjunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getRightDisjunctionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Disjunction__RightAssignment_1_1"


    // $ANTLR start "rule__Conjunction__RightAssignment_1_2"
    // InternalExpressions.g:3517:1: rule__Conjunction__RightAssignment_1_2 : ( ruleConjunction ) ;
    public final void rule__Conjunction__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3521:1: ( ( ruleConjunction ) )
            // InternalExpressions.g:3522:1: ( ruleConjunction )
            {
            // InternalExpressions.g:3522:1: ( ruleConjunction )
            // InternalExpressions.g:3523:1: ruleConjunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConjunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Conjunction__RightAssignment_1_2"


    // $ANTLR start "rule__Negated__NotAssignment_1"
    // InternalExpressions.g:3532:1: rule__Negated__NotAssignment_1 : ( ruleCExpression ) ;
    public final void rule__Negated__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3536:1: ( ( ruleCExpression ) )
            // InternalExpressions.g:3537:1: ( ruleCExpression )
            {
            // InternalExpressions.g:3537:1: ( ruleCExpression )
            // InternalExpressions.g:3538:1: ruleCExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegatedAccess().getNotCExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegatedAccess().getNotCExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Negated__NotAssignment_1"


    // $ANTLR start "rule__Compare__RightAssignment_2"
    // InternalExpressions.g:3547:1: rule__Compare__RightAssignment_2 : ( ruleSomeValue ) ;
    public final void rule__Compare__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3551:1: ( ( ruleSomeValue ) )
            // InternalExpressions.g:3552:1: ( ruleSomeValue )
            {
            // InternalExpressions.g:3552:1: ( ruleSomeValue )
            // InternalExpressions.g:3553:1: ruleSomeValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getRightSomeValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSomeValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getRightSomeValueParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Compare__RightAssignment_2"


    // $ANTLR start "rule__Addition__RightAssignment_1_1"
    // InternalExpressions.g:3562:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3566:1: ( ( ruleMultiplication ) )
            // InternalExpressions.g:3567:1: ( ruleMultiplication )
            {
            // InternalExpressions.g:3567:1: ( ruleMultiplication )
            // InternalExpressions.g:3568:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Addition__RightAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_1"
    // InternalExpressions.g:3577:1: rule__Multiplication__RightAssignment_1_1 : ( rulePower ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3581:1: ( ( rulePower ) )
            // InternalExpressions.g:3582:1: ( rulePower )
            {
            // InternalExpressions.g:3582:1: ( rulePower )
            // InternalExpressions.g:3583:1: rulePower
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePower();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Multiplication__RightAssignment_1_1"


    // $ANTLR start "rule__Power__RightAssignment_1_1"
    // InternalExpressions.g:3592:1: rule__Power__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__Power__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3596:1: ( ( rulePrimaryExpression ) )
            // InternalExpressions.g:3597:1: ( rulePrimaryExpression )
            {
            // InternalExpressions.g:3597:1: ( rulePrimaryExpression )
            // InternalExpressions.g:3598:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Power__RightAssignment_1_1"


    // $ANTLR start "rule__NumberValue__NumValueAssignment"
    // InternalExpressions.g:3607:1: rule__NumberValue__NumValueAssignment : ( ruleNUMBER ) ;
    public final void rule__NumberValue__NumValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3611:1: ( ( ruleNUMBER ) )
            // InternalExpressions.g:3612:1: ( ruleNUMBER )
            {
            // InternalExpressions.g:3612:1: ( ruleNUMBER )
            // InternalExpressions.g:3613:1: ruleNUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getNumValueNUMBERParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNUMBER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberValueAccess().getNumValueNUMBERParserRuleCall_0()); 
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
    // $ANTLR end "rule__NumberValue__NumValueAssignment"


    // $ANTLR start "rule__BooleanValue__ValueAssignment"
    // InternalExpressions.g:3622:1: rule__BooleanValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3626:1: ( ( RULE_BOOLEAN ) )
            // InternalExpressions.g:3627:1: ( RULE_BOOLEAN )
            {
            // InternalExpressions.g:3627:1: ( RULE_BOOLEAN )
            // InternalExpressions.g:3628:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__BooleanValue__ValueAssignment"


    // $ANTLR start "rule__StringValue__StrValueAssignment"
    // InternalExpressions.g:3637:1: rule__StringValue__StrValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__StrValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3641:1: ( ( RULE_STRING ) )
            // InternalExpressions.g:3642:1: ( RULE_STRING )
            {
            // InternalExpressions.g:3642:1: ( RULE_STRING )
            // InternalExpressions.g:3643:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getStrValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getStrValueSTRINGTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__StringValue__StrValueAssignment"


    // $ANTLR start "rule__Variable__VarNameAssignment"
    // InternalExpressions.g:3652:1: rule__Variable__VarNameAssignment : ( ruleVARIABLE_VALUE ) ;
    public final void rule__Variable__VarNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalExpressions.g:3656:1: ( ( ruleVARIABLE_VALUE ) )
            // InternalExpressions.g:3657:1: ( ruleVARIABLE_VALUE )
            {
            // InternalExpressions.g:3657:1: ( ruleVARIABLE_VALUE )
            // InternalExpressions.g:3658:1: ruleVARIABLE_VALUE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVarNameVARIABLE_VALUEParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVARIABLE_VALUE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getVarNameVARIABLE_VALUEParserRuleCall_0()); 
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
    // $ANTLR end "rule__Variable__VarNameAssignment"

    // $ANTLR start synpred3_InternalExpressions
    public final void synpred3_InternalExpressions_fragment() throws RecognitionException {   
        // InternalExpressions.g:698:1: ( ( ( rule__CExpression__Group_0__0 ) ) )
        // InternalExpressions.g:698:1: ( ( rule__CExpression__Group_0__0 ) )
        {
        // InternalExpressions.g:698:1: ( ( rule__CExpression__Group_0__0 ) )
        // InternalExpressions.g:699:1: ( rule__CExpression__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCExpressionAccess().getGroup_0()); 
        }
        // InternalExpressions.g:700:1: ( rule__CExpression__Group_0__0 )
        // InternalExpressions.g:700:2: rule__CExpression__Group_0__0
        {
        pushFollow(FOLLOW_2);
        rule__CExpression__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred3_InternalExpressions

    // $ANTLR start synpred4_InternalExpressions
    public final void synpred4_InternalExpressions_fragment() throws RecognitionException {   
        // InternalExpressions.g:704:6: ( ( ruleCompare ) )
        // InternalExpressions.g:704:6: ( ruleCompare )
        {
        // InternalExpressions.g:704:6: ( ruleCompare )
        // InternalExpressions.g:705:1: ruleCompare
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCExpressionAccess().getCompareParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalExpressions

    // $ANTLR start synpred5_InternalExpressions
    public final void synpred5_InternalExpressions_fragment() throws RecognitionException {   
        // InternalExpressions.g:710:6: ( ( ruleBooleanValue ) )
        // InternalExpressions.g:710:6: ( ruleBooleanValue )
        {
        // InternalExpressions.g:710:6: ( ruleBooleanValue )
        // InternalExpressions.g:711:1: ruleBooleanValue
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCExpressionAccess().getBooleanValueParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_2);
        ruleBooleanValue();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalExpressions

    // Delegated rules

    public final boolean synpred4_InternalExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000010L});

}