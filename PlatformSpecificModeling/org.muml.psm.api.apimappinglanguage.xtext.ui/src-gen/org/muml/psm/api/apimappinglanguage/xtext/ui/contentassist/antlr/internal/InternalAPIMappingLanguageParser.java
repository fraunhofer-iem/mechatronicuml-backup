package org.muml.psm.api.apimappinglanguage.xtext.ui.contentassist.antlr.internal; 

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
import org.muml.psm.api.apimappinglanguage.xtext.services.APIMappingLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAPIMappingLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_BOOLEAN", "RULE_INT", "RULE_STRING", "RULE_MAXKEYWORD", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'&&'", "'null'", "'DAYS'", "'HOURS'", "'MILLISECONDS'", "'MINUTES'", "'SECONDS'", "'MICROSECONDS'", "'NANOSECONDS'", "'++'", "'--'", "':='", "'+='", "'-='", "'=='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'not'", "'self'", "'first'", "'last'", "'prev'", "'next'", "'MappingRepository:'", "'{'", "'}'", "','", "'#'", "'import'", "'PortInstance:'", "'execCommand:'", "'initCommand:'", "'enum:'", "'('", "')'", "';'", "'.'", "'for'", "'while'", "'do'", "');'", "'if'", "'else'", "'elseif'", "'['", "']'", "'->'", "'const'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int RULE_MAXKEYWORD=9;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
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


        public InternalAPIMappingLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAPIMappingLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAPIMappingLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAPIMappingLanguage.g"; }


     
     	private APIMappingLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(APIMappingLanguageGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleMappingRepository"
    // InternalAPIMappingLanguage.g:60:1: entryRuleMappingRepository : ruleMappingRepository EOF ;
    public final void entryRuleMappingRepository() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:61:1: ( ruleMappingRepository EOF )
            // InternalAPIMappingLanguage.g:62:1: ruleMappingRepository EOF
            {
             before(grammarAccess.getMappingRepositoryRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMappingRepository();

            state._fsp--;

             after(grammarAccess.getMappingRepositoryRule()); 
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
    // $ANTLR end "entryRuleMappingRepository"


    // $ANTLR start "ruleMappingRepository"
    // InternalAPIMappingLanguage.g:69:1: ruleMappingRepository : ( ( rule__MappingRepository__Group__0 ) ) ;
    public final void ruleMappingRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:73:2: ( ( ( rule__MappingRepository__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:74:1: ( ( rule__MappingRepository__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:74:1: ( ( rule__MappingRepository__Group__0 ) )
            // InternalAPIMappingLanguage.g:75:1: ( rule__MappingRepository__Group__0 )
            {
             before(grammarAccess.getMappingRepositoryAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:76:1: ( rule__MappingRepository__Group__0 )
            // InternalAPIMappingLanguage.g:76:2: rule__MappingRepository__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingRepositoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMappingRepository"


    // $ANTLR start "entryRuleImport"
    // InternalAPIMappingLanguage.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:89:1: ( ruleImport EOF )
            // InternalAPIMappingLanguage.g:90:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalAPIMappingLanguage.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:102:1: ( ( rule__Import__Group__0 ) )
            // InternalAPIMappingLanguage.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:104:1: ( rule__Import__Group__0 )
            // InternalAPIMappingLanguage.g:104:2: rule__Import__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRulePortApiMapping"
    // InternalAPIMappingLanguage.g:116:1: entryRulePortApiMapping : rulePortApiMapping EOF ;
    public final void entryRulePortApiMapping() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:117:1: ( rulePortApiMapping EOF )
            // InternalAPIMappingLanguage.g:118:1: rulePortApiMapping EOF
            {
             before(grammarAccess.getPortApiMappingRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePortApiMapping();

            state._fsp--;

             after(grammarAccess.getPortApiMappingRule()); 
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
    // $ANTLR end "entryRulePortApiMapping"


    // $ANTLR start "rulePortApiMapping"
    // InternalAPIMappingLanguage.g:125:1: rulePortApiMapping : ( ( rule__PortApiMapping__Group__0 ) ) ;
    public final void rulePortApiMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:129:2: ( ( ( rule__PortApiMapping__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:130:1: ( ( rule__PortApiMapping__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:130:1: ( ( rule__PortApiMapping__Group__0 ) )
            // InternalAPIMappingLanguage.g:131:1: ( rule__PortApiMapping__Group__0 )
            {
             before(grammarAccess.getPortApiMappingAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:132:1: ( rule__PortApiMapping__Group__0 )
            // InternalAPIMappingLanguage.g:132:2: rule__PortApiMapping__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortApiMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePortApiMapping"


    // $ANTLR start "entryRuleEnumerationValueExpression"
    // InternalAPIMappingLanguage.g:144:1: entryRuleEnumerationValueExpression : ruleEnumerationValueExpression EOF ;
    public final void entryRuleEnumerationValueExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:145:1: ( ruleEnumerationValueExpression EOF )
            // InternalAPIMappingLanguage.g:146:1: ruleEnumerationValueExpression EOF
            {
             before(grammarAccess.getEnumerationValueExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEnumerationValueExpression();

            state._fsp--;

             after(grammarAccess.getEnumerationValueExpressionRule()); 
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
    // $ANTLR end "entryRuleEnumerationValueExpression"


    // $ANTLR start "ruleEnumerationValueExpression"
    // InternalAPIMappingLanguage.g:153:1: ruleEnumerationValueExpression : ( ( rule__EnumerationValueExpression__Group__0 ) ) ;
    public final void ruleEnumerationValueExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:157:2: ( ( ( rule__EnumerationValueExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:158:1: ( ( rule__EnumerationValueExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:158:1: ( ( rule__EnumerationValueExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:159:1: ( rule__EnumerationValueExpression__Group__0 )
            {
             before(grammarAccess.getEnumerationValueExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:160:1: ( rule__EnumerationValueExpression__Group__0 )
            // InternalAPIMappingLanguage.g:160:2: rule__EnumerationValueExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationValueExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationValueExpression"


    // $ANTLR start "entryRuleAPICallExpression"
    // InternalAPIMappingLanguage.g:172:1: entryRuleAPICallExpression : ruleAPICallExpression EOF ;
    public final void entryRuleAPICallExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:173:1: ( ruleAPICallExpression EOF )
            // InternalAPIMappingLanguage.g:174:1: ruleAPICallExpression EOF
            {
             before(grammarAccess.getAPICallExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAPICallExpression();

            state._fsp--;

             after(grammarAccess.getAPICallExpressionRule()); 
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
    // $ANTLR end "entryRuleAPICallExpression"


    // $ANTLR start "ruleAPICallExpression"
    // InternalAPIMappingLanguage.g:181:1: ruleAPICallExpression : ( ( rule__APICallExpression__Group__0 ) ) ;
    public final void ruleAPICallExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:185:2: ( ( ( rule__APICallExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:186:1: ( ( rule__APICallExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:186:1: ( ( rule__APICallExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:187:1: ( rule__APICallExpression__Group__0 )
            {
             before(grammarAccess.getAPICallExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:188:1: ( rule__APICallExpression__Group__0 )
            // InternalAPIMappingLanguage.g:188:2: rule__APICallExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAPICallExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAPICallExpression"


    // $ANTLR start "entryRuleParamaterBinding"
    // InternalAPIMappingLanguage.g:200:1: entryRuleParamaterBinding : ruleParamaterBinding EOF ;
    public final void entryRuleParamaterBinding() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:201:1: ( ruleParamaterBinding EOF )
            // InternalAPIMappingLanguage.g:202:1: ruleParamaterBinding EOF
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
    // InternalAPIMappingLanguage.g:209:1: ruleParamaterBinding : ( ( rule__ParamaterBinding__Group__0 ) ) ;
    public final void ruleParamaterBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:213:2: ( ( ( rule__ParamaterBinding__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:214:1: ( ( rule__ParamaterBinding__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:214:1: ( ( rule__ParamaterBinding__Group__0 ) )
            // InternalAPIMappingLanguage.g:215:1: ( rule__ParamaterBinding__Group__0 )
            {
             before(grammarAccess.getParamaterBindingAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:216:1: ( rule__ParamaterBinding__Group__0 )
            // InternalAPIMappingLanguage.g:216:2: rule__ParamaterBinding__Group__0
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


    // $ANTLR start "entryRuleExpressionStartRule"
    // InternalAPIMappingLanguage.g:230:1: entryRuleExpressionStartRule : ruleExpressionStartRule EOF ;
    public final void entryRuleExpressionStartRule() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:231:1: ( ruleExpressionStartRule EOF )
            // InternalAPIMappingLanguage.g:232:1: ruleExpressionStartRule EOF
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
    // InternalAPIMappingLanguage.g:239:1: ruleExpressionStartRule : ( ( rule__ExpressionStartRule__Alternatives ) ) ;
    public final void ruleExpressionStartRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:243:2: ( ( ( rule__ExpressionStartRule__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:244:1: ( ( rule__ExpressionStartRule__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:244:1: ( ( rule__ExpressionStartRule__Alternatives ) )
            // InternalAPIMappingLanguage.g:245:1: ( rule__ExpressionStartRule__Alternatives )
            {
             before(grammarAccess.getExpressionStartRuleAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:246:1: ( rule__ExpressionStartRule__Alternatives )
            // InternalAPIMappingLanguage.g:246:2: rule__ExpressionStartRule__Alternatives
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


    // $ANTLR start "entryRuleOperand"
    // InternalAPIMappingLanguage.g:258:1: entryRuleOperand : ruleOperand EOF ;
    public final void entryRuleOperand() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:259:1: ( ruleOperand EOF )
            // InternalAPIMappingLanguage.g:260:1: ruleOperand EOF
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
    // InternalAPIMappingLanguage.g:267:1: ruleOperand : ( ( rule__Operand__Alternatives ) ) ;
    public final void ruleOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:271:2: ( ( ( rule__Operand__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:272:1: ( ( rule__Operand__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:272:1: ( ( rule__Operand__Alternatives ) )
            // InternalAPIMappingLanguage.g:273:1: ( rule__Operand__Alternatives )
            {
             before(grammarAccess.getOperandAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:274:1: ( rule__Operand__Alternatives )
            // InternalAPIMappingLanguage.g:274:2: rule__Operand__Alternatives
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


    // $ANTLR start "entryRuleAPICallStatement"
    // InternalAPIMappingLanguage.g:286:1: entryRuleAPICallStatement : ruleAPICallStatement EOF ;
    public final void entryRuleAPICallStatement() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:287:1: ( ruleAPICallStatement EOF )
            // InternalAPIMappingLanguage.g:288:1: ruleAPICallStatement EOF
            {
             before(grammarAccess.getAPICallStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAPICallStatement();

            state._fsp--;

             after(grammarAccess.getAPICallStatementRule()); 
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
    // $ANTLR end "entryRuleAPICallStatement"


    // $ANTLR start "ruleAPICallStatement"
    // InternalAPIMappingLanguage.g:295:1: ruleAPICallStatement : ( ( rule__APICallStatement__Group__0 ) ) ;
    public final void ruleAPICallStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:299:2: ( ( ( rule__APICallStatement__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:300:1: ( ( rule__APICallStatement__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:300:1: ( ( rule__APICallStatement__Group__0 ) )
            // InternalAPIMappingLanguage.g:301:1: ( rule__APICallStatement__Group__0 )
            {
             before(grammarAccess.getAPICallStatementAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:302:1: ( rule__APICallStatement__Group__0 )
            // InternalAPIMappingLanguage.g:302:2: rule__APICallStatement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAPICallStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAPICallStatement"


    // $ANTLR start "entryRuleEString"
    // InternalAPIMappingLanguage.g:314:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:315:1: ( ruleEString EOF )
            // InternalAPIMappingLanguage.g:316:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalAPIMappingLanguage.g:323:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:327:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:328:1: ( ( rule__EString__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:328:1: ( ( rule__EString__Alternatives ) )
            // InternalAPIMappingLanguage.g:329:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:330:1: ( rule__EString__Alternatives )
            // InternalAPIMappingLanguage.g:330:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAPIMappingLanguage.g:342:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:343:1: ( ruleQualifiedName EOF )
            // InternalAPIMappingLanguage.g:344:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalAPIMappingLanguage.g:351:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:355:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:356:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:356:1: ( ( rule__QualifiedName__Group__0 ) )
            // InternalAPIMappingLanguage.g:357:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:358:1: ( rule__QualifiedName__Group__0 )
            // InternalAPIMappingLanguage.g:358:2: rule__QualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEntry"
    // InternalAPIMappingLanguage.g:370:1: entryRuleEntry : ruleEntry EOF ;
    public final void entryRuleEntry() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:371:1: ( ruleEntry EOF )
            // InternalAPIMappingLanguage.g:372:1: ruleEntry EOF
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
    // InternalAPIMappingLanguage.g:379:1: ruleEntry : ( ( rule__Entry__Alternatives ) ) ;
    public final void ruleEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:383:2: ( ( ( rule__Entry__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:384:1: ( ( rule__Entry__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:384:1: ( ( rule__Entry__Alternatives ) )
            // InternalAPIMappingLanguage.g:385:1: ( rule__Entry__Alternatives )
            {
             before(grammarAccess.getEntryAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:386:1: ( rule__Entry__Alternatives )
            // InternalAPIMappingLanguage.g:386:2: rule__Entry__Alternatives
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
    // InternalAPIMappingLanguage.g:398:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalAPIMappingLanguage.g:402:1: ( ruleBlock EOF )
            // InternalAPIMappingLanguage.g:403:1: ruleBlock EOF
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
    // InternalAPIMappingLanguage.g:413:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:418:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:419:1: ( ( rule__Block__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:419:1: ( ( rule__Block__Group__0 ) )
            // InternalAPIMappingLanguage.g:420:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:421:1: ( rule__Block__Group__0 )
            // InternalAPIMappingLanguage.g:421:2: rule__Block__Group__0
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
    // InternalAPIMappingLanguage.g:434:1: entryRuleForLoop : ruleForLoop EOF ;
    public final void entryRuleForLoop() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:435:1: ( ruleForLoop EOF )
            // InternalAPIMappingLanguage.g:436:1: ruleForLoop EOF
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
    // InternalAPIMappingLanguage.g:443:1: ruleForLoop : ( ( rule__ForLoop__Group__0 ) ) ;
    public final void ruleForLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:447:2: ( ( ( rule__ForLoop__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:448:1: ( ( rule__ForLoop__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:448:1: ( ( rule__ForLoop__Group__0 ) )
            // InternalAPIMappingLanguage.g:449:1: ( rule__ForLoop__Group__0 )
            {
             before(grammarAccess.getForLoopAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:450:1: ( rule__ForLoop__Group__0 )
            // InternalAPIMappingLanguage.g:450:2: rule__ForLoop__Group__0
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
    // InternalAPIMappingLanguage.g:462:1: entryRuleForLoopCountingExpression : ruleForLoopCountingExpression EOF ;
    public final void entryRuleForLoopCountingExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:463:1: ( ruleForLoopCountingExpression EOF )
            // InternalAPIMappingLanguage.g:464:1: ruleForLoopCountingExpression EOF
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
    // InternalAPIMappingLanguage.g:471:1: ruleForLoopCountingExpression : ( ( rule__ForLoopCountingExpression__Group__0 ) ) ;
    public final void ruleForLoopCountingExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:475:2: ( ( ( rule__ForLoopCountingExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:476:1: ( ( rule__ForLoopCountingExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:476:1: ( ( rule__ForLoopCountingExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:477:1: ( rule__ForLoopCountingExpression__Group__0 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:478:1: ( rule__ForLoopCountingExpression__Group__0 )
            // InternalAPIMappingLanguage.g:478:2: rule__ForLoopCountingExpression__Group__0
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
    // InternalAPIMappingLanguage.g:490:1: entryRuleWhileLoop : ruleWhileLoop EOF ;
    public final void entryRuleWhileLoop() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:491:1: ( ruleWhileLoop EOF )
            // InternalAPIMappingLanguage.g:492:1: ruleWhileLoop EOF
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
    // InternalAPIMappingLanguage.g:499:1: ruleWhileLoop : ( ( rule__WhileLoop__Group__0 ) ) ;
    public final void ruleWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:503:2: ( ( ( rule__WhileLoop__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:504:1: ( ( rule__WhileLoop__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:504:1: ( ( rule__WhileLoop__Group__0 ) )
            // InternalAPIMappingLanguage.g:505:1: ( rule__WhileLoop__Group__0 )
            {
             before(grammarAccess.getWhileLoopAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:506:1: ( rule__WhileLoop__Group__0 )
            // InternalAPIMappingLanguage.g:506:2: rule__WhileLoop__Group__0
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
    // InternalAPIMappingLanguage.g:518:1: entryRuleDoWhileLoop : ruleDoWhileLoop EOF ;
    public final void entryRuleDoWhileLoop() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:519:1: ( ruleDoWhileLoop EOF )
            // InternalAPIMappingLanguage.g:520:1: ruleDoWhileLoop EOF
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
    // InternalAPIMappingLanguage.g:527:1: ruleDoWhileLoop : ( ( rule__DoWhileLoop__Group__0 ) ) ;
    public final void ruleDoWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:531:2: ( ( ( rule__DoWhileLoop__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:532:1: ( ( rule__DoWhileLoop__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:532:1: ( ( rule__DoWhileLoop__Group__0 ) )
            // InternalAPIMappingLanguage.g:533:1: ( rule__DoWhileLoop__Group__0 )
            {
             before(grammarAccess.getDoWhileLoopAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:534:1: ( rule__DoWhileLoop__Group__0 )
            // InternalAPIMappingLanguage.g:534:2: rule__DoWhileLoop__Group__0
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
    // InternalAPIMappingLanguage.g:546:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:547:1: ( ruleIfStatement EOF )
            // InternalAPIMappingLanguage.g:548:1: ruleIfStatement EOF
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
    // InternalAPIMappingLanguage.g:555:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:559:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:560:1: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:560:1: ( ( rule__IfStatement__Group__0 ) )
            // InternalAPIMappingLanguage.g:561:1: ( rule__IfStatement__Group__0 )
            {
             before(grammarAccess.getIfStatementAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:562:1: ( rule__IfStatement__Group__0 )
            // InternalAPIMappingLanguage.g:562:2: rule__IfStatement__Group__0
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
    // InternalAPIMappingLanguage.g:574:1: entryRuleElseIfStatement : ruleElseIfStatement EOF ;
    public final void entryRuleElseIfStatement() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:575:1: ( ruleElseIfStatement EOF )
            // InternalAPIMappingLanguage.g:576:1: ruleElseIfStatement EOF
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
    // InternalAPIMappingLanguage.g:583:1: ruleElseIfStatement : ( ( rule__ElseIfStatement__Group__0 ) ) ;
    public final void ruleElseIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:587:2: ( ( ( rule__ElseIfStatement__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:588:1: ( ( rule__ElseIfStatement__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:588:1: ( ( rule__ElseIfStatement__Group__0 ) )
            // InternalAPIMappingLanguage.g:589:1: ( rule__ElseIfStatement__Group__0 )
            {
             before(grammarAccess.getElseIfStatementAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:590:1: ( rule__ElseIfStatement__Group__0 )
            // InternalAPIMappingLanguage.g:590:2: rule__ElseIfStatement__Group__0
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


    // $ANTLR start "entryRuleAssignment"
    // InternalAPIMappingLanguage.g:606:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:607:1: ( ruleAssignment EOF )
            // InternalAPIMappingLanguage.g:608:1: ruleAssignment EOF
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
    // InternalAPIMappingLanguage.g:615:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:619:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:620:1: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:620:1: ( ( rule__Assignment__Group__0 ) )
            // InternalAPIMappingLanguage.g:621:1: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:622:1: ( rule__Assignment__Group__0 )
            // InternalAPIMappingLanguage.g:622:2: rule__Assignment__Group__0
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
    // InternalAPIMappingLanguage.g:634:1: entryRuleInitializeExpression : ruleInitializeExpression EOF ;
    public final void entryRuleInitializeExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:635:1: ( ruleInitializeExpression EOF )
            // InternalAPIMappingLanguage.g:636:1: ruleInitializeExpression EOF
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
    // InternalAPIMappingLanguage.g:643:1: ruleInitializeExpression : ( ( rule__InitializeExpression__Alternatives ) ) ;
    public final void ruleInitializeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:647:2: ( ( ( rule__InitializeExpression__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:648:1: ( ( rule__InitializeExpression__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:648:1: ( ( rule__InitializeExpression__Alternatives ) )
            // InternalAPIMappingLanguage.g:649:1: ( rule__InitializeExpression__Alternatives )
            {
             before(grammarAccess.getInitializeExpressionAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:650:1: ( rule__InitializeExpression__Alternatives )
            // InternalAPIMappingLanguage.g:650:2: rule__InitializeExpression__Alternatives
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
    // InternalAPIMappingLanguage.g:662:1: entryRuleArrayInitializeExpression : ruleArrayInitializeExpression EOF ;
    public final void entryRuleArrayInitializeExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:663:1: ( ruleArrayInitializeExpression EOF )
            // InternalAPIMappingLanguage.g:664:1: ruleArrayInitializeExpression EOF
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
    // InternalAPIMappingLanguage.g:671:1: ruleArrayInitializeExpression : ( ( rule__ArrayInitializeExpression__Group__0 ) ) ;
    public final void ruleArrayInitializeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:675:2: ( ( ( rule__ArrayInitializeExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:676:1: ( ( rule__ArrayInitializeExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:676:1: ( ( rule__ArrayInitializeExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:677:1: ( rule__ArrayInitializeExpression__Group__0 )
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:678:1: ( rule__ArrayInitializeExpression__Group__0 )
            // InternalAPIMappingLanguage.g:678:2: rule__ArrayInitializeExpression__Group__0
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
    // InternalAPIMappingLanguage.g:690:1: entryRuleLocalVariableOrConstantDeclarationStatement : ruleLocalVariableOrConstantDeclarationStatement EOF ;
    public final void entryRuleLocalVariableOrConstantDeclarationStatement() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:691:1: ( ruleLocalVariableOrConstantDeclarationStatement EOF )
            // InternalAPIMappingLanguage.g:692:1: ruleLocalVariableOrConstantDeclarationStatement EOF
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
    // InternalAPIMappingLanguage.g:699:1: ruleLocalVariableOrConstantDeclarationStatement : ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment ) ) ;
    public final void ruleLocalVariableOrConstantDeclarationStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:703:2: ( ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment ) ) )
            // InternalAPIMappingLanguage.g:704:1: ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment ) )
            {
            // InternalAPIMappingLanguage.g:704:1: ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment ) )
            // InternalAPIMappingLanguage.g:705:1: ( rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment )
            {
             before(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableAssignment()); 
            // InternalAPIMappingLanguage.g:706:1: ( rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment )
            // InternalAPIMappingLanguage.g:706:2: rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment
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
    // InternalAPIMappingLanguage.g:718:1: entryRuleLocalVariableDeclaration : ruleLocalVariableDeclaration EOF ;
    public final void entryRuleLocalVariableDeclaration() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:719:1: ( ruleLocalVariableDeclaration EOF )
            // InternalAPIMappingLanguage.g:720:1: ruleLocalVariableDeclaration EOF
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
    // InternalAPIMappingLanguage.g:727:1: ruleLocalVariableDeclaration : ( ( rule__LocalVariableDeclaration__Group__0 ) ) ;
    public final void ruleLocalVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:731:2: ( ( ( rule__LocalVariableDeclaration__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:732:1: ( ( rule__LocalVariableDeclaration__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:732:1: ( ( rule__LocalVariableDeclaration__Group__0 ) )
            // InternalAPIMappingLanguage.g:733:1: ( rule__LocalVariableDeclaration__Group__0 )
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:734:1: ( rule__LocalVariableDeclaration__Group__0 )
            // InternalAPIMappingLanguage.g:734:2: rule__LocalVariableDeclaration__Group__0
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
    // InternalAPIMappingLanguage.g:746:1: entryRuleLocalConstantDeclaration : ruleLocalConstantDeclaration EOF ;
    public final void entryRuleLocalConstantDeclaration() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:747:1: ( ruleLocalConstantDeclaration EOF )
            // InternalAPIMappingLanguage.g:748:1: ruleLocalConstantDeclaration EOF
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
    // InternalAPIMappingLanguage.g:755:1: ruleLocalConstantDeclaration : ( ( rule__LocalConstantDeclaration__Group__0 ) ) ;
    public final void ruleLocalConstantDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:759:2: ( ( ( rule__LocalConstantDeclaration__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:760:1: ( ( rule__LocalConstantDeclaration__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:760:1: ( ( rule__LocalConstantDeclaration__Group__0 ) )
            // InternalAPIMappingLanguage.g:761:1: ( rule__LocalConstantDeclaration__Group__0 )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:762:1: ( rule__LocalConstantDeclaration__Group__0 )
            // InternalAPIMappingLanguage.g:762:2: rule__LocalConstantDeclaration__Group__0
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
    // InternalAPIMappingLanguage.g:774:1: entryRuleNondeterministicChoiceExpression : ruleNondeterministicChoiceExpression EOF ;
    public final void entryRuleNondeterministicChoiceExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:775:1: ( ruleNondeterministicChoiceExpression EOF )
            // InternalAPIMappingLanguage.g:776:1: ruleNondeterministicChoiceExpression EOF
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
    // InternalAPIMappingLanguage.g:783:1: ruleNondeterministicChoiceExpression : ( ( rule__NondeterministicChoiceExpression__Group__0 ) ) ;
    public final void ruleNondeterministicChoiceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:787:2: ( ( ( rule__NondeterministicChoiceExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:788:1: ( ( rule__NondeterministicChoiceExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:788:1: ( ( rule__NondeterministicChoiceExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:789:1: ( rule__NondeterministicChoiceExpression__Group__0 )
            {
             before(grammarAccess.getNondeterministicChoiceExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:790:1: ( rule__NondeterministicChoiceExpression__Group__0 )
            // InternalAPIMappingLanguage.g:790:2: rule__NondeterministicChoiceExpression__Group__0
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
    // InternalAPIMappingLanguage.g:802:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:803:1: ( ruleRange EOF )
            // InternalAPIMappingLanguage.g:804:1: ruleRange EOF
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
    // InternalAPIMappingLanguage.g:811:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:815:2: ( ( ( rule__Range__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:816:1: ( ( rule__Range__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:816:1: ( ( rule__Range__Group__0 ) )
            // InternalAPIMappingLanguage.g:817:1: ( rule__Range__Group__0 )
            {
             before(grammarAccess.getRangeAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:818:1: ( rule__Range__Group__0 )
            // InternalAPIMappingLanguage.g:818:2: rule__Range__Group__0
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
    // InternalAPIMappingLanguage.g:830:1: entryRuleLONG : ruleLONG EOF ;
    public final void entryRuleLONG() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:831:1: ( ruleLONG EOF )
            // InternalAPIMappingLanguage.g:832:1: ruleLONG EOF
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
    // InternalAPIMappingLanguage.g:839:1: ruleLONG : ( ( rule__LONG__Group__0 ) ) ;
    public final void ruleLONG() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:843:2: ( ( ( rule__LONG__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:844:1: ( ( rule__LONG__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:844:1: ( ( rule__LONG__Group__0 ) )
            // InternalAPIMappingLanguage.g:845:1: ( rule__LONG__Group__0 )
            {
             before(grammarAccess.getLONGAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:846:1: ( rule__LONG__Group__0 )
            // InternalAPIMappingLanguage.g:846:2: rule__LONG__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LONG__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLONGAccess().getGroup()); 

            }


            }

        }
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
    // InternalAPIMappingLanguage.g:858:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:859:1: ( ruleExpression EOF )
            // InternalAPIMappingLanguage.g:860:1: ruleExpression EOF
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
    // InternalAPIMappingLanguage.g:867:1: ruleExpression : ( ruleLogicalExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:871:2: ( ( ruleLogicalExpression ) )
            // InternalAPIMappingLanguage.g:872:1: ( ruleLogicalExpression )
            {
            // InternalAPIMappingLanguage.g:872:1: ( ruleLogicalExpression )
            // InternalAPIMappingLanguage.g:873:1: ruleLogicalExpression
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
    // InternalAPIMappingLanguage.g:886:1: entryRuleLogicalExpression : ruleLogicalExpression EOF ;
    public final void entryRuleLogicalExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:887:1: ( ruleLogicalExpression EOF )
            // InternalAPIMappingLanguage.g:888:1: ruleLogicalExpression EOF
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
    // InternalAPIMappingLanguage.g:895:1: ruleLogicalExpression : ( ruleLogicalOrExpression ) ;
    public final void ruleLogicalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:899:2: ( ( ruleLogicalOrExpression ) )
            // InternalAPIMappingLanguage.g:900:1: ( ruleLogicalOrExpression )
            {
            // InternalAPIMappingLanguage.g:900:1: ( ruleLogicalOrExpression )
            // InternalAPIMappingLanguage.g:901:1: ruleLogicalOrExpression
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
    // InternalAPIMappingLanguage.g:914:1: entryRuleLogicalOrExpression : ruleLogicalOrExpression EOF ;
    public final void entryRuleLogicalOrExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:915:1: ( ruleLogicalOrExpression EOF )
            // InternalAPIMappingLanguage.g:916:1: ruleLogicalOrExpression EOF
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
    // InternalAPIMappingLanguage.g:923:1: ruleLogicalOrExpression : ( ( rule__LogicalOrExpression__Group__0 ) ) ;
    public final void ruleLogicalOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:927:2: ( ( ( rule__LogicalOrExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:928:1: ( ( rule__LogicalOrExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:928:1: ( ( rule__LogicalOrExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:929:1: ( rule__LogicalOrExpression__Group__0 )
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:930:1: ( rule__LogicalOrExpression__Group__0 )
            // InternalAPIMappingLanguage.g:930:2: rule__LogicalOrExpression__Group__0
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
    // InternalAPIMappingLanguage.g:942:1: entryRuleLogicalAndExpression : ruleLogicalAndExpression EOF ;
    public final void entryRuleLogicalAndExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:943:1: ( ruleLogicalAndExpression EOF )
            // InternalAPIMappingLanguage.g:944:1: ruleLogicalAndExpression EOF
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
    // InternalAPIMappingLanguage.g:951:1: ruleLogicalAndExpression : ( ( rule__LogicalAndExpression__Group__0 ) ) ;
    public final void ruleLogicalAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:955:2: ( ( ( rule__LogicalAndExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:956:1: ( ( rule__LogicalAndExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:956:1: ( ( rule__LogicalAndExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:957:1: ( rule__LogicalAndExpression__Group__0 )
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:958:1: ( rule__LogicalAndExpression__Group__0 )
            // InternalAPIMappingLanguage.g:958:2: rule__LogicalAndExpression__Group__0
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
    // InternalAPIMappingLanguage.g:970:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:971:1: ( ruleComparisonExpression EOF )
            // InternalAPIMappingLanguage.g:972:1: ruleComparisonExpression EOF
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
    // InternalAPIMappingLanguage.g:979:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:983:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:984:1: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:984:1: ( ( rule__ComparisonExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:985:1: ( rule__ComparisonExpression__Group__0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:986:1: ( rule__ComparisonExpression__Group__0 )
            // InternalAPIMappingLanguage.g:986:2: rule__ComparisonExpression__Group__0
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
    // InternalAPIMappingLanguage.g:998:1: entryRuleComparisonHigherOpExpression : ruleComparisonHigherOpExpression EOF ;
    public final void entryRuleComparisonHigherOpExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:999:1: ( ruleComparisonHigherOpExpression EOF )
            // InternalAPIMappingLanguage.g:1000:1: ruleComparisonHigherOpExpression EOF
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
    // InternalAPIMappingLanguage.g:1007:1: ruleComparisonHigherOpExpression : ( ( rule__ComparisonHigherOpExpression__Group__0 ) ) ;
    public final void ruleComparisonHigherOpExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1011:2: ( ( ( rule__ComparisonHigherOpExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1012:1: ( ( rule__ComparisonHigherOpExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1012:1: ( ( rule__ComparisonHigherOpExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1013:1: ( rule__ComparisonHigherOpExpression__Group__0 )
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1014:1: ( rule__ComparisonHigherOpExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1014:2: rule__ComparisonHigherOpExpression__Group__0
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
    // InternalAPIMappingLanguage.g:1026:1: entryRuleArithmeticExpression : ruleArithmeticExpression EOF ;
    public final void entryRuleArithmeticExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1027:1: ( ruleArithmeticExpression EOF )
            // InternalAPIMappingLanguage.g:1028:1: ruleArithmeticExpression EOF
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
    // InternalAPIMappingLanguage.g:1035:1: ruleArithmeticExpression : ( ruleAdditionExpression ) ;
    public final void ruleArithmeticExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1039:2: ( ( ruleAdditionExpression ) )
            // InternalAPIMappingLanguage.g:1040:1: ( ruleAdditionExpression )
            {
            // InternalAPIMappingLanguage.g:1040:1: ( ruleAdditionExpression )
            // InternalAPIMappingLanguage.g:1041:1: ruleAdditionExpression
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
    // InternalAPIMappingLanguage.g:1054:1: entryRuleAdditionExpression : ruleAdditionExpression EOF ;
    public final void entryRuleAdditionExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1055:1: ( ruleAdditionExpression EOF )
            // InternalAPIMappingLanguage.g:1056:1: ruleAdditionExpression EOF
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
    // InternalAPIMappingLanguage.g:1063:1: ruleAdditionExpression : ( ( rule__AdditionExpression__Group__0 ) ) ;
    public final void ruleAdditionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1067:2: ( ( ( rule__AdditionExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1068:1: ( ( rule__AdditionExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1068:1: ( ( rule__AdditionExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1069:1: ( rule__AdditionExpression__Group__0 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1070:1: ( rule__AdditionExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1070:2: rule__AdditionExpression__Group__0
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
    // InternalAPIMappingLanguage.g:1082:1: entryRuleMultiplicationExpression : ruleMultiplicationExpression EOF ;
    public final void entryRuleMultiplicationExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1083:1: ( ruleMultiplicationExpression EOF )
            // InternalAPIMappingLanguage.g:1084:1: ruleMultiplicationExpression EOF
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
    // InternalAPIMappingLanguage.g:1091:1: ruleMultiplicationExpression : ( ( rule__MultiplicationExpression__Alternatives ) ) ;
    public final void ruleMultiplicationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1095:2: ( ( ( rule__MultiplicationExpression__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1096:1: ( ( rule__MultiplicationExpression__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1096:1: ( ( rule__MultiplicationExpression__Alternatives ) )
            // InternalAPIMappingLanguage.g:1097:1: ( rule__MultiplicationExpression__Alternatives )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1098:1: ( rule__MultiplicationExpression__Alternatives )
            // InternalAPIMappingLanguage.g:1098:2: rule__MultiplicationExpression__Alternatives
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
    // InternalAPIMappingLanguage.g:1110:1: entryRuleUnaryPreExpression : ruleUnaryPreExpression EOF ;
    public final void entryRuleUnaryPreExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1111:1: ( ruleUnaryPreExpression EOF )
            // InternalAPIMappingLanguage.g:1112:1: ruleUnaryPreExpression EOF
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
    // InternalAPIMappingLanguage.g:1119:1: ruleUnaryPreExpression : ( ( rule__UnaryPreExpression__Group__0 ) ) ;
    public final void ruleUnaryPreExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1123:2: ( ( ( rule__UnaryPreExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1124:1: ( ( rule__UnaryPreExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1124:1: ( ( rule__UnaryPreExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1125:1: ( rule__UnaryPreExpression__Group__0 )
            {
             before(grammarAccess.getUnaryPreExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1126:1: ( rule__UnaryPreExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1126:2: rule__UnaryPreExpression__Group__0
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
    // InternalAPIMappingLanguage.g:1138:1: entryRuleTypeCastExpression : ruleTypeCastExpression EOF ;
    public final void entryRuleTypeCastExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1139:1: ( ruleTypeCastExpression EOF )
            // InternalAPIMappingLanguage.g:1140:1: ruleTypeCastExpression EOF
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
    // InternalAPIMappingLanguage.g:1147:1: ruleTypeCastExpression : ( ( rule__TypeCastExpression__Alternatives ) ) ;
    public final void ruleTypeCastExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1151:2: ( ( ( rule__TypeCastExpression__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1152:1: ( ( rule__TypeCastExpression__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1152:1: ( ( rule__TypeCastExpression__Alternatives ) )
            // InternalAPIMappingLanguage.g:1153:1: ( rule__TypeCastExpression__Alternatives )
            {
             before(grammarAccess.getTypeCastExpressionAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1154:1: ( rule__TypeCastExpression__Alternatives )
            // InternalAPIMappingLanguage.g:1154:2: rule__TypeCastExpression__Alternatives
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


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalAPIMappingLanguage.g:1166:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1167:1: ( ruleLiteralExpression EOF )
            // InternalAPIMappingLanguage.g:1168:1: ruleLiteralExpression EOF
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
    // InternalAPIMappingLanguage.g:1175:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Group__0 ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1179:2: ( ( ( rule__LiteralExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1180:1: ( ( rule__LiteralExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1180:1: ( ( rule__LiteralExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1181:1: ( rule__LiteralExpression__Group__0 )
            {
             before(grammarAccess.getLiteralExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1182:1: ( rule__LiteralExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1182:2: rule__LiteralExpression__Group__0
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
    // InternalAPIMappingLanguage.g:1194:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1195:1: ( ruleLiteral EOF )
            // InternalAPIMappingLanguage.g:1196:1: ruleLiteral EOF
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
    // InternalAPIMappingLanguage.g:1203:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1207:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1208:1: ( ( rule__Literal__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1208:1: ( ( rule__Literal__Alternatives ) )
            // InternalAPIMappingLanguage.g:1209:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1210:1: ( rule__Literal__Alternatives )
            // InternalAPIMappingLanguage.g:1210:2: rule__Literal__Alternatives
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


    // $ANTLR start "entryRuleTimeValue"
    // InternalAPIMappingLanguage.g:1224:1: entryRuleTimeValue : ruleTimeValue EOF ;
    public final void entryRuleTimeValue() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1225:1: ( ruleTimeValue EOF )
            // InternalAPIMappingLanguage.g:1226:1: ruleTimeValue EOF
            {
             before(grammarAccess.getTimeValueRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTimeValue();

            state._fsp--;

             after(grammarAccess.getTimeValueRule()); 
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
    // $ANTLR end "entryRuleTimeValue"


    // $ANTLR start "ruleTimeValue"
    // InternalAPIMappingLanguage.g:1233:1: ruleTimeValue : ( ( rule__TimeValue__Group__0 ) ) ;
    public final void ruleTimeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1237:2: ( ( ( rule__TimeValue__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1238:1: ( ( rule__TimeValue__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1238:1: ( ( rule__TimeValue__Group__0 ) )
            // InternalAPIMappingLanguage.g:1239:1: ( rule__TimeValue__Group__0 )
            {
             before(grammarAccess.getTimeValueAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1240:1: ( rule__TimeValue__Group__0 )
            // InternalAPIMappingLanguage.g:1240:2: rule__TimeValue__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TimeValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeValue"


    // $ANTLR start "entryRuleTimeUnitExpr"
    // InternalAPIMappingLanguage.g:1252:1: entryRuleTimeUnitExpr : ruleTimeUnitExpr EOF ;
    public final void entryRuleTimeUnitExpr() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1253:1: ( ruleTimeUnitExpr EOF )
            // InternalAPIMappingLanguage.g:1254:1: ruleTimeUnitExpr EOF
            {
             before(grammarAccess.getTimeUnitExprRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTimeUnitExpr();

            state._fsp--;

             after(grammarAccess.getTimeUnitExprRule()); 
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
    // $ANTLR end "entryRuleTimeUnitExpr"


    // $ANTLR start "ruleTimeUnitExpr"
    // InternalAPIMappingLanguage.g:1261:1: ruleTimeUnitExpr : ( ( rule__TimeUnitExpr__Alternatives ) ) ;
    public final void ruleTimeUnitExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1265:2: ( ( ( rule__TimeUnitExpr__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1266:1: ( ( rule__TimeUnitExpr__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1266:1: ( ( rule__TimeUnitExpr__Alternatives ) )
            // InternalAPIMappingLanguage.g:1267:1: ( rule__TimeUnitExpr__Alternatives )
            {
             before(grammarAccess.getTimeUnitExprAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1268:1: ( rule__TimeUnitExpr__Alternatives )
            // InternalAPIMappingLanguage.g:1268:2: rule__TimeUnitExpr__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TimeUnitExpr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeUnitExprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeUnitExpr"


    // $ANTLR start "entryRuleExtendedTypedNamedElementExpression"
    // InternalAPIMappingLanguage.g:1282:1: entryRuleExtendedTypedNamedElementExpression : ruleExtendedTypedNamedElementExpression EOF ;
    public final void entryRuleExtendedTypedNamedElementExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1283:1: ( ruleExtendedTypedNamedElementExpression EOF )
            // InternalAPIMappingLanguage.g:1284:1: ruleExtendedTypedNamedElementExpression EOF
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
    // InternalAPIMappingLanguage.g:1291:1: ruleExtendedTypedNamedElementExpression : ( ( rule__ExtendedTypedNamedElementExpression__Group__0 ) ) ;
    public final void ruleExtendedTypedNamedElementExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1295:2: ( ( ( rule__ExtendedTypedNamedElementExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1296:1: ( ( rule__ExtendedTypedNamedElementExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1296:1: ( ( rule__ExtendedTypedNamedElementExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1297:1: ( rule__ExtendedTypedNamedElementExpression__Group__0 )
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1298:1: ( rule__ExtendedTypedNamedElementExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1298:2: rule__ExtendedTypedNamedElementExpression__Group__0
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
    // InternalAPIMappingLanguage.g:1310:1: entryRuleTypedNamedElementExpression : ruleTypedNamedElementExpression EOF ;
    public final void entryRuleTypedNamedElementExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1311:1: ( ruleTypedNamedElementExpression EOF )
            // InternalAPIMappingLanguage.g:1312:1: ruleTypedNamedElementExpression EOF
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
    // InternalAPIMappingLanguage.g:1319:1: ruleTypedNamedElementExpression : ( ( rule__TypedNamedElementExpression__Group__0 ) ) ;
    public final void ruleTypedNamedElementExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1323:2: ( ( ( rule__TypedNamedElementExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1324:1: ( ( rule__TypedNamedElementExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1324:1: ( ( rule__TypedNamedElementExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1325:1: ( rule__TypedNamedElementExpression__Group__0 )
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1326:1: ( rule__TypedNamedElementExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1326:2: rule__TypedNamedElementExpression__Group__0
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
    // InternalAPIMappingLanguage.g:1338:1: entryRuleArrayIndexExpression : ruleArrayIndexExpression EOF ;
    public final void entryRuleArrayIndexExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1339:1: ( ruleArrayIndexExpression EOF )
            // InternalAPIMappingLanguage.g:1340:1: ruleArrayIndexExpression EOF
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
    // InternalAPIMappingLanguage.g:1347:1: ruleArrayIndexExpression : ( ( rule__ArrayIndexExpression__Group__0 ) ) ;
    public final void ruleArrayIndexExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1351:2: ( ( ( rule__ArrayIndexExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1352:1: ( ( rule__ArrayIndexExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1352:1: ( ( rule__ArrayIndexExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1353:1: ( rule__ArrayIndexExpression__Group__0 )
            {
             before(grammarAccess.getArrayIndexExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1354:1: ( rule__ArrayIndexExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1354:2: rule__ArrayIndexExpression__Group__0
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
    // InternalAPIMappingLanguage.g:1366:1: entryRuleAttributeAccessorExpression : ruleAttributeAccessorExpression EOF ;
    public final void entryRuleAttributeAccessorExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1367:1: ( ruleAttributeAccessorExpression EOF )
            // InternalAPIMappingLanguage.g:1368:1: ruleAttributeAccessorExpression EOF
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
    // InternalAPIMappingLanguage.g:1375:1: ruleAttributeAccessorExpression : ( ( rule__AttributeAccessorExpression__Group__0 ) ) ;
    public final void ruleAttributeAccessorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1379:2: ( ( ( rule__AttributeAccessorExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1380:1: ( ( rule__AttributeAccessorExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1380:1: ( ( rule__AttributeAccessorExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1381:1: ( rule__AttributeAccessorExpression__Group__0 )
            {
             before(grammarAccess.getAttributeAccessorExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1382:1: ( rule__AttributeAccessorExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1382:2: rule__AttributeAccessorExpression__Group__0
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


    // $ANTLR start "entryRulePositionSelectorExpression"
    // InternalAPIMappingLanguage.g:1396:1: entryRulePositionSelectorExpression : rulePositionSelectorExpression EOF ;
    public final void entryRulePositionSelectorExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1397:1: ( rulePositionSelectorExpression EOF )
            // InternalAPIMappingLanguage.g:1398:1: rulePositionSelectorExpression EOF
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
    // InternalAPIMappingLanguage.g:1405:1: rulePositionSelectorExpression : ( ( rule__PositionSelectorExpression__Group__0 ) ) ;
    public final void rulePositionSelectorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1409:2: ( ( ( rule__PositionSelectorExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1410:1: ( ( rule__PositionSelectorExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1410:1: ( ( rule__PositionSelectorExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1411:1: ( rule__PositionSelectorExpression__Group__0 )
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1412:1: ( rule__PositionSelectorExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1412:2: rule__PositionSelectorExpression__Group__0
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
    // InternalAPIMappingLanguage.g:1424:1: entryRuleOperationCall : ruleOperationCall EOF ;
    public final void entryRuleOperationCall() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1425:1: ( ruleOperationCall EOF )
            // InternalAPIMappingLanguage.g:1426:1: ruleOperationCall EOF
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
    // InternalAPIMappingLanguage.g:1433:1: ruleOperationCall : ( ( rule__OperationCall__Group__0 ) ) ;
    public final void ruleOperationCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1437:2: ( ( ( rule__OperationCall__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1438:1: ( ( rule__OperationCall__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1438:1: ( ( rule__OperationCall__Group__0 ) )
            // InternalAPIMappingLanguage.g:1439:1: ( rule__OperationCall__Group__0 )
            {
             before(grammarAccess.getOperationCallAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1440:1: ( rule__OperationCall__Group__0 )
            // InternalAPIMappingLanguage.g:1440:2: rule__OperationCall__Group__0
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


    // $ANTLR start "entryRuleDATATYPE"
    // InternalAPIMappingLanguage.g:1454:1: entryRuleDATATYPE : ruleDATATYPE EOF ;
    public final void entryRuleDATATYPE() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1455:1: ( ruleDATATYPE EOF )
            // InternalAPIMappingLanguage.g:1456:1: ruleDATATYPE EOF
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
    // InternalAPIMappingLanguage.g:1463:1: ruleDATATYPE : ( ( rule__DATATYPE__Group__0 ) ) ;
    public final void ruleDATATYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1467:2: ( ( ( rule__DATATYPE__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1468:1: ( ( rule__DATATYPE__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1468:1: ( ( rule__DATATYPE__Group__0 ) )
            // InternalAPIMappingLanguage.g:1469:1: ( rule__DATATYPE__Group__0 )
            {
             before(grammarAccess.getDATATYPEAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1470:1: ( rule__DATATYPE__Group__0 )
            // InternalAPIMappingLanguage.g:1470:2: rule__DATATYPE__Group__0
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
    // InternalAPIMappingLanguage.g:1483:1: ruleUnaryPostIncrementDecrementOperator : ( ( rule__UnaryPostIncrementDecrementOperator__Alternatives ) ) ;
    public final void ruleUnaryPostIncrementDecrementOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1487:1: ( ( ( rule__UnaryPostIncrementDecrementOperator__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1488:1: ( ( rule__UnaryPostIncrementDecrementOperator__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1488:1: ( ( rule__UnaryPostIncrementDecrementOperator__Alternatives ) )
            // InternalAPIMappingLanguage.g:1489:1: ( rule__UnaryPostIncrementDecrementOperator__Alternatives )
            {
             before(grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1490:1: ( rule__UnaryPostIncrementDecrementOperator__Alternatives )
            // InternalAPIMappingLanguage.g:1490:2: rule__UnaryPostIncrementDecrementOperator__Alternatives
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
    // InternalAPIMappingLanguage.g:1502:1: ruleIncrementDecrementOperatorExpression : ( ( rule__IncrementDecrementOperatorExpression__Alternatives ) ) ;
    public final void ruleIncrementDecrementOperatorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1506:1: ( ( ( rule__IncrementDecrementOperatorExpression__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1507:1: ( ( rule__IncrementDecrementOperatorExpression__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1507:1: ( ( rule__IncrementDecrementOperatorExpression__Alternatives ) )
            // InternalAPIMappingLanguage.g:1508:1: ( rule__IncrementDecrementOperatorExpression__Alternatives )
            {
             before(grammarAccess.getIncrementDecrementOperatorExpressionAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1509:1: ( rule__IncrementDecrementOperatorExpression__Alternatives )
            // InternalAPIMappingLanguage.g:1509:2: rule__IncrementDecrementOperatorExpression__Alternatives
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
    // InternalAPIMappingLanguage.g:1521:1: ruleAssignOperator : ( ( rule__AssignOperator__Alternatives ) ) ;
    public final void ruleAssignOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1525:1: ( ( ( rule__AssignOperator__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1526:1: ( ( rule__AssignOperator__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1526:1: ( ( rule__AssignOperator__Alternatives ) )
            // InternalAPIMappingLanguage.g:1527:1: ( rule__AssignOperator__Alternatives )
            {
             before(grammarAccess.getAssignOperatorAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1528:1: ( rule__AssignOperator__Alternatives )
            // InternalAPIMappingLanguage.g:1528:2: rule__AssignOperator__Alternatives
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
    // InternalAPIMappingLanguage.g:1540:1: ruleLogicalOrOperator : ( ( '||' ) ) ;
    public final void ruleLogicalOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1544:1: ( ( ( '||' ) ) )
            // InternalAPIMappingLanguage.g:1545:1: ( ( '||' ) )
            {
            // InternalAPIMappingLanguage.g:1545:1: ( ( '||' ) )
            // InternalAPIMappingLanguage.g:1546:1: ( '||' )
            {
             before(grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration()); 
            // InternalAPIMappingLanguage.g:1547:1: ( '||' )
            // InternalAPIMappingLanguage.g:1547:3: '||'
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
    // InternalAPIMappingLanguage.g:1560:1: ruleLogicalAndOperator : ( ( '&&' ) ) ;
    public final void ruleLogicalAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1564:1: ( ( ( '&&' ) ) )
            // InternalAPIMappingLanguage.g:1565:1: ( ( '&&' ) )
            {
            // InternalAPIMappingLanguage.g:1565:1: ( ( '&&' ) )
            // InternalAPIMappingLanguage.g:1566:1: ( '&&' )
            {
             before(grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            // InternalAPIMappingLanguage.g:1567:1: ( '&&' )
            // InternalAPIMappingLanguage.g:1567:3: '&&'
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
    // InternalAPIMappingLanguage.g:1580:1: ruleComparingEQNEQOperator : ( ( rule__ComparingEQNEQOperator__Alternatives ) ) ;
    public final void ruleComparingEQNEQOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1584:1: ( ( ( rule__ComparingEQNEQOperator__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1585:1: ( ( rule__ComparingEQNEQOperator__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1585:1: ( ( rule__ComparingEQNEQOperator__Alternatives ) )
            // InternalAPIMappingLanguage.g:1586:1: ( rule__ComparingEQNEQOperator__Alternatives )
            {
             before(grammarAccess.getComparingEQNEQOperatorAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1587:1: ( rule__ComparingEQNEQOperator__Alternatives )
            // InternalAPIMappingLanguage.g:1587:2: rule__ComparingEQNEQOperator__Alternatives
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
    // InternalAPIMappingLanguage.g:1599:1: ruleComparingRelOperator : ( ( rule__ComparingRelOperator__Alternatives ) ) ;
    public final void ruleComparingRelOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1603:1: ( ( ( rule__ComparingRelOperator__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1604:1: ( ( rule__ComparingRelOperator__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1604:1: ( ( rule__ComparingRelOperator__Alternatives ) )
            // InternalAPIMappingLanguage.g:1605:1: ( rule__ComparingRelOperator__Alternatives )
            {
             before(grammarAccess.getComparingRelOperatorAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1606:1: ( rule__ComparingRelOperator__Alternatives )
            // InternalAPIMappingLanguage.g:1606:2: rule__ComparingRelOperator__Alternatives
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
    // InternalAPIMappingLanguage.g:1618:1: ruleAdditionOperator : ( ( rule__AdditionOperator__Alternatives ) ) ;
    public final void ruleAdditionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1622:1: ( ( ( rule__AdditionOperator__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1623:1: ( ( rule__AdditionOperator__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1623:1: ( ( rule__AdditionOperator__Alternatives ) )
            // InternalAPIMappingLanguage.g:1624:1: ( rule__AdditionOperator__Alternatives )
            {
             before(grammarAccess.getAdditionOperatorAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1625:1: ( rule__AdditionOperator__Alternatives )
            // InternalAPIMappingLanguage.g:1625:2: rule__AdditionOperator__Alternatives
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
    // InternalAPIMappingLanguage.g:1637:1: ruleMultiplicationOperator : ( ( rule__MultiplicationOperator__Alternatives ) ) ;
    public final void ruleMultiplicationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1641:1: ( ( ( rule__MultiplicationOperator__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1642:1: ( ( rule__MultiplicationOperator__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1642:1: ( ( rule__MultiplicationOperator__Alternatives ) )
            // InternalAPIMappingLanguage.g:1643:1: ( rule__MultiplicationOperator__Alternatives )
            {
             before(grammarAccess.getMultiplicationOperatorAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1644:1: ( rule__MultiplicationOperator__Alternatives )
            // InternalAPIMappingLanguage.g:1644:2: rule__MultiplicationOperator__Alternatives
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
    // InternalAPIMappingLanguage.g:1656:1: ruleUnaryPreOperator : ( ( rule__UnaryPreOperator__Alternatives ) ) ;
    public final void ruleUnaryPreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1660:1: ( ( ( rule__UnaryPreOperator__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1661:1: ( ( rule__UnaryPreOperator__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1661:1: ( ( rule__UnaryPreOperator__Alternatives ) )
            // InternalAPIMappingLanguage.g:1662:1: ( rule__UnaryPreOperator__Alternatives )
            {
             before(grammarAccess.getUnaryPreOperatorAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1663:1: ( rule__UnaryPreOperator__Alternatives )
            // InternalAPIMappingLanguage.g:1663:2: rule__UnaryPreOperator__Alternatives
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
    // InternalAPIMappingLanguage.g:1675:1: rulePositionSelectorKind : ( ( rule__PositionSelectorKind__Alternatives ) ) ;
    public final void rulePositionSelectorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1679:1: ( ( ( rule__PositionSelectorKind__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1680:1: ( ( rule__PositionSelectorKind__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1680:1: ( ( rule__PositionSelectorKind__Alternatives ) )
            // InternalAPIMappingLanguage.g:1681:1: ( rule__PositionSelectorKind__Alternatives )
            {
             before(grammarAccess.getPositionSelectorKindAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1682:1: ( rule__PositionSelectorKind__Alternatives )
            // InternalAPIMappingLanguage.g:1682:2: rule__PositionSelectorKind__Alternatives
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


    // $ANTLR start "rule__ParamaterBinding__ValueAlternatives_3_0"
    // InternalAPIMappingLanguage.g:1693:1: rule__ParamaterBinding__ValueAlternatives_3_0 : ( ( ruleExpression ) | ( ruleEnumerationValueExpression ) );
    public final void rule__ParamaterBinding__ValueAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1697:1: ( ( ruleExpression ) | ( ruleEnumerationValueExpression ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_INT)||LA1_0==16||LA1_0==36||LA1_0==40||LA1_0==56) ) {
                alt1=1;
            }
            else if ( (LA1_0==55) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1698:1: ( ruleExpression )
                    {
                    // InternalAPIMappingLanguage.g:1698:1: ( ruleExpression )
                    // InternalAPIMappingLanguage.g:1699:1: ruleExpression
                    {
                     before(grammarAccess.getParamaterBindingAccess().getValueExpressionParserRuleCall_3_0_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getParamaterBindingAccess().getValueExpressionParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:1704:6: ( ruleEnumerationValueExpression )
                    {
                    // InternalAPIMappingLanguage.g:1704:6: ( ruleEnumerationValueExpression )
                    // InternalAPIMappingLanguage.g:1705:1: ruleEnumerationValueExpression
                    {
                     before(grammarAccess.getParamaterBindingAccess().getValueEnumerationValueExpressionParserRuleCall_3_0_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEnumerationValueExpression();

                    state._fsp--;

                     after(grammarAccess.getParamaterBindingAccess().getValueEnumerationValueExpressionParserRuleCall_3_0_1()); 

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
    // $ANTLR end "rule__ParamaterBinding__ValueAlternatives_3_0"


    // $ANTLR start "rule__ExpressionStartRule__Alternatives"
    // InternalAPIMappingLanguage.g:1715:1: rule__ExpressionStartRule__Alternatives : ( ( ruleAssignment ) | ( ruleForLoop ) | ( ruleWhileLoop ) | ( ruleDoWhileLoop ) | ( ruleIfStatement ) | ( ruleLocalVariableOrConstantDeclarationStatement ) | ( ruleAPICallStatement ) );
    public final void rule__ExpressionStartRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1719:1: ( ( ruleAssignment ) | ( ruleForLoop ) | ( ruleWhileLoop ) | ( ruleDoWhileLoop ) | ( ruleIfStatement ) | ( ruleLocalVariableOrConstantDeclarationStatement ) | ( ruleAPICallStatement ) )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1720:1: ( ruleAssignment )
                    {
                    // InternalAPIMappingLanguage.g:1720:1: ( ruleAssignment )
                    // InternalAPIMappingLanguage.g:1721:1: ruleAssignment
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
                    // InternalAPIMappingLanguage.g:1726:6: ( ruleForLoop )
                    {
                    // InternalAPIMappingLanguage.g:1726:6: ( ruleForLoop )
                    // InternalAPIMappingLanguage.g:1727:1: ruleForLoop
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
                    // InternalAPIMappingLanguage.g:1732:6: ( ruleWhileLoop )
                    {
                    // InternalAPIMappingLanguage.g:1732:6: ( ruleWhileLoop )
                    // InternalAPIMappingLanguage.g:1733:1: ruleWhileLoop
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
                    // InternalAPIMappingLanguage.g:1738:6: ( ruleDoWhileLoop )
                    {
                    // InternalAPIMappingLanguage.g:1738:6: ( ruleDoWhileLoop )
                    // InternalAPIMappingLanguage.g:1739:1: ruleDoWhileLoop
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
                    // InternalAPIMappingLanguage.g:1744:6: ( ruleIfStatement )
                    {
                    // InternalAPIMappingLanguage.g:1744:6: ( ruleIfStatement )
                    // InternalAPIMappingLanguage.g:1745:1: ruleIfStatement
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
                    // InternalAPIMappingLanguage.g:1750:6: ( ruleLocalVariableOrConstantDeclarationStatement )
                    {
                    // InternalAPIMappingLanguage.g:1750:6: ( ruleLocalVariableOrConstantDeclarationStatement )
                    // InternalAPIMappingLanguage.g:1751:1: ruleLocalVariableOrConstantDeclarationStatement
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getLocalVariableOrConstantDeclarationStatementParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleLocalVariableOrConstantDeclarationStatement();

                    state._fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getLocalVariableOrConstantDeclarationStatementParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAPIMappingLanguage.g:1756:6: ( ruleAPICallStatement )
                    {
                    // InternalAPIMappingLanguage.g:1756:6: ( ruleAPICallStatement )
                    // InternalAPIMappingLanguage.g:1757:1: ruleAPICallStatement
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getAPICallStatementParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAPICallStatement();

                    state._fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getAPICallStatementParserRuleCall_6()); 

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


    // $ANTLR start "rule__Operand__Alternatives"
    // InternalAPIMappingLanguage.g:1767:1: rule__Operand__Alternatives : ( ( ( rule__Operand__Group_0__0 ) ) | ( ruleLiteralExpression ) | ( ruleExtendedTypedNamedElementExpression ) | ( ruleAPICallExpression ) );
    public final void rule__Operand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1771:1: ( ( ( rule__Operand__Group_0__0 ) ) | ( ruleLiteralExpression ) | ( ruleExtendedTypedNamedElementExpression ) | ( ruleAPICallExpression ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt3=1;
                }
                break;
            case RULE_NUMBER:
            case RULE_BOOLEAN:
            case RULE_INT:
            case 16:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==EOF||(LA3_3>=14 && LA3_3<=15)||(LA3_3>=24 && LA3_3<=25)||(LA3_3>=29 && LA3_3<=39)||(LA3_3>=48 && LA3_3<=49)||LA3_3==54||(LA3_3>=57 && LA3_3<=59)||LA3_3==63||(LA3_3>=67 && LA3_3<=69)) ) {
                    alt3=3;
                }
                else if ( (LA3_3==56) ) {
                    alt3=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1772:1: ( ( rule__Operand__Group_0__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:1772:1: ( ( rule__Operand__Group_0__0 ) )
                    // InternalAPIMappingLanguage.g:1773:1: ( rule__Operand__Group_0__0 )
                    {
                     before(grammarAccess.getOperandAccess().getGroup_0()); 
                    // InternalAPIMappingLanguage.g:1774:1: ( rule__Operand__Group_0__0 )
                    // InternalAPIMappingLanguage.g:1774:2: rule__Operand__Group_0__0
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
                    // InternalAPIMappingLanguage.g:1778:6: ( ruleLiteralExpression )
                    {
                    // InternalAPIMappingLanguage.g:1778:6: ( ruleLiteralExpression )
                    // InternalAPIMappingLanguage.g:1779:1: ruleLiteralExpression
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
                    // InternalAPIMappingLanguage.g:1784:6: ( ruleExtendedTypedNamedElementExpression )
                    {
                    // InternalAPIMappingLanguage.g:1784:6: ( ruleExtendedTypedNamedElementExpression )
                    // InternalAPIMappingLanguage.g:1785:1: ruleExtendedTypedNamedElementExpression
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
                    // InternalAPIMappingLanguage.g:1790:6: ( ruleAPICallExpression )
                    {
                    // InternalAPIMappingLanguage.g:1790:6: ( ruleAPICallExpression )
                    // InternalAPIMappingLanguage.g:1791:1: ruleAPICallExpression
                    {
                     before(grammarAccess.getOperandAccess().getAPICallExpressionParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAPICallExpression();

                    state._fsp--;

                     after(grammarAccess.getOperandAccess().getAPICallExpressionParserRuleCall_3()); 

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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalAPIMappingLanguage.g:1801:1: rule__EString__Alternatives : ( ( RULE_ID ) | ( ruleQualifiedName ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1805:1: ( ( RULE_ID ) | ( ruleQualifiedName ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==59) ) {
                    alt4=2;
                }
                else if ( (LA4_1==EOF||LA4_1==47) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1806:1: ( RULE_ID )
                    {
                    // InternalAPIMappingLanguage.g:1806:1: ( RULE_ID )
                    // InternalAPIMappingLanguage.g:1807:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:1812:6: ( ruleQualifiedName )
                    {
                    // InternalAPIMappingLanguage.g:1812:6: ( ruleQualifiedName )
                    // InternalAPIMappingLanguage.g:1813:1: ruleQualifiedName
                    {
                     before(grammarAccess.getEStringAccess().getQualifiedNameParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;

                     after(grammarAccess.getEStringAccess().getQualifiedNameParserRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Entry__Alternatives"
    // InternalAPIMappingLanguage.g:1823:1: rule__Entry__Alternatives : ( ( ruleBlock ) | ( ruleExpression ) | ( ruleArrayInitializeExpression ) );
    public final void rule__Entry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1827:1: ( ( ruleBlock ) | ( ruleExpression ) | ( ruleArrayInitializeExpression ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt5=1;
                }
                break;
            case RULE_ID:
            case RULE_NUMBER:
            case RULE_BOOLEAN:
            case RULE_INT:
            case 16:
            case 36:
            case 40:
            case 56:
                {
                alt5=2;
                }
                break;
            case 67:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1828:1: ( ruleBlock )
                    {
                    // InternalAPIMappingLanguage.g:1828:1: ( ruleBlock )
                    // InternalAPIMappingLanguage.g:1829:1: ruleBlock
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
                    // InternalAPIMappingLanguage.g:1834:6: ( ruleExpression )
                    {
                    // InternalAPIMappingLanguage.g:1834:6: ( ruleExpression )
                    // InternalAPIMappingLanguage.g:1835:1: ruleExpression
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
                    // InternalAPIMappingLanguage.g:1840:6: ( ruleArrayInitializeExpression )
                    {
                    // InternalAPIMappingLanguage.g:1840:6: ( ruleArrayInitializeExpression )
                    // InternalAPIMappingLanguage.g:1841:1: ruleArrayInitializeExpression
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
    // InternalAPIMappingLanguage.g:1851:1: rule__ForLoopCountingExpression__Alternatives_1 : ( ( ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 ) ) | ( ( rule__ForLoopCountingExpression__Group_1_1__0 ) ) );
    public final void rule__ForLoopCountingExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1855:1: ( ( ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 ) ) | ( ( rule__ForLoopCountingExpression__Group_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=24 && LA6_0<=25)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=26 && LA6_0<=28)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1856:1: ( ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 ) )
                    {
                    // InternalAPIMappingLanguage.g:1856:1: ( ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 ) )
                    // InternalAPIMappingLanguage.g:1857:1: ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 )
                    {
                     before(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorAssignment_1_0()); 
                    // InternalAPIMappingLanguage.g:1858:1: ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 )
                    // InternalAPIMappingLanguage.g:1858:2: rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0
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
                    // InternalAPIMappingLanguage.g:1862:6: ( ( rule__ForLoopCountingExpression__Group_1_1__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:1862:6: ( ( rule__ForLoopCountingExpression__Group_1_1__0 ) )
                    // InternalAPIMappingLanguage.g:1863:1: ( rule__ForLoopCountingExpression__Group_1_1__0 )
                    {
                     before(grammarAccess.getForLoopCountingExpressionAccess().getGroup_1_1()); 
                    // InternalAPIMappingLanguage.g:1864:1: ( rule__ForLoopCountingExpression__Group_1_1__0 )
                    // InternalAPIMappingLanguage.g:1864:2: rule__ForLoopCountingExpression__Group_1_1__0
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


    // $ANTLR start "rule__Assignment__Alternatives_1"
    // InternalAPIMappingLanguage.g:1873:1: rule__Assignment__Alternatives_1 : ( ( ( rule__Assignment__Group_1_0__0 ) ) | ( ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 ) ) );
    public final void rule__Assignment__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1877:1: ( ( ( rule__Assignment__Group_1_0__0 ) ) | ( ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=26 && LA7_0<=28)) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=24 && LA7_0<=25)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1878:1: ( ( rule__Assignment__Group_1_0__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:1878:1: ( ( rule__Assignment__Group_1_0__0 ) )
                    // InternalAPIMappingLanguage.g:1879:1: ( rule__Assignment__Group_1_0__0 )
                    {
                     before(grammarAccess.getAssignmentAccess().getGroup_1_0()); 
                    // InternalAPIMappingLanguage.g:1880:1: ( rule__Assignment__Group_1_0__0 )
                    // InternalAPIMappingLanguage.g:1880:2: rule__Assignment__Group_1_0__0
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
                    // InternalAPIMappingLanguage.g:1884:6: ( ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 ) )
                    {
                    // InternalAPIMappingLanguage.g:1884:6: ( ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 ) )
                    // InternalAPIMappingLanguage.g:1885:1: ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 )
                    {
                     before(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorAssignment_1_1()); 
                    // InternalAPIMappingLanguage.g:1886:1: ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 )
                    // InternalAPIMappingLanguage.g:1886:2: rule__Assignment__IncrementDecrementOperatorAssignment_1_1
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
    // InternalAPIMappingLanguage.g:1895:1: rule__InitializeExpression__Alternatives : ( ( ruleArrayInitializeExpression ) | ( ruleNondeterministicChoiceExpression ) | ( ruleExpression ) );
    public final void rule__InitializeExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1899:1: ( ( ruleArrayInitializeExpression ) | ( ruleNondeterministicChoiceExpression ) | ( ruleExpression ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1900:1: ( ruleArrayInitializeExpression )
                    {
                    // InternalAPIMappingLanguage.g:1900:1: ( ruleArrayInitializeExpression )
                    // InternalAPIMappingLanguage.g:1901:1: ruleArrayInitializeExpression
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
                    // InternalAPIMappingLanguage.g:1906:6: ( ruleNondeterministicChoiceExpression )
                    {
                    // InternalAPIMappingLanguage.g:1906:6: ( ruleNondeterministicChoiceExpression )
                    // InternalAPIMappingLanguage.g:1907:1: ruleNondeterministicChoiceExpression
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
                    // InternalAPIMappingLanguage.g:1912:6: ( ruleExpression )
                    {
                    // InternalAPIMappingLanguage.g:1912:6: ( ruleExpression )
                    // InternalAPIMappingLanguage.g:1913:1: ruleExpression
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
    // InternalAPIMappingLanguage.g:1923:1: rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 : ( ( ruleLocalVariableDeclaration ) | ( ruleLocalConstantDeclaration ) );
    public final void rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1927:1: ( ( ruleLocalVariableDeclaration ) | ( ruleLocalConstantDeclaration ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==70) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1928:1: ( ruleLocalVariableDeclaration )
                    {
                    // InternalAPIMappingLanguage.g:1928:1: ( ruleLocalVariableDeclaration )
                    // InternalAPIMappingLanguage.g:1929:1: ruleLocalVariableDeclaration
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
                    // InternalAPIMappingLanguage.g:1934:6: ( ruleLocalConstantDeclaration )
                    {
                    // InternalAPIMappingLanguage.g:1934:6: ( ruleLocalConstantDeclaration )
                    // InternalAPIMappingLanguage.g:1935:1: ruleLocalConstantDeclaration
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
    // InternalAPIMappingLanguage.g:1945:1: rule__MultiplicationExpression__Alternatives : ( ( ruleUnaryPreExpression ) | ( ( rule__MultiplicationExpression__Group_1__0 ) ) );
    public final void rule__MultiplicationExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1949:1: ( ( ruleUnaryPreExpression ) | ( ( rule__MultiplicationExpression__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36||LA10_0==40) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||LA10_0==16||LA10_0==56) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1950:1: ( ruleUnaryPreExpression )
                    {
                    // InternalAPIMappingLanguage.g:1950:1: ( ruleUnaryPreExpression )
                    // InternalAPIMappingLanguage.g:1951:1: ruleUnaryPreExpression
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
                    // InternalAPIMappingLanguage.g:1956:6: ( ( rule__MultiplicationExpression__Group_1__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:1956:6: ( ( rule__MultiplicationExpression__Group_1__0 ) )
                    // InternalAPIMappingLanguage.g:1957:1: ( rule__MultiplicationExpression__Group_1__0 )
                    {
                     before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 
                    // InternalAPIMappingLanguage.g:1958:1: ( rule__MultiplicationExpression__Group_1__0 )
                    // InternalAPIMappingLanguage.g:1958:2: rule__MultiplicationExpression__Group_1__0
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
    // InternalAPIMappingLanguage.g:1967:1: rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 : ( ( ruleUnaryPreExpression ) | ( ruleTypeCastExpression ) );
    public final void rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1971:1: ( ( ruleUnaryPreExpression ) | ( ruleTypeCastExpression ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==36||LA11_0==40) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||LA11_0==16||LA11_0==56) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1972:1: ( ruleUnaryPreExpression )
                    {
                    // InternalAPIMappingLanguage.g:1972:1: ( ruleUnaryPreExpression )
                    // InternalAPIMappingLanguage.g:1973:1: ruleUnaryPreExpression
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
                    // InternalAPIMappingLanguage.g:1978:6: ( ruleTypeCastExpression )
                    {
                    // InternalAPIMappingLanguage.g:1978:6: ( ruleTypeCastExpression )
                    // InternalAPIMappingLanguage.g:1979:1: ruleTypeCastExpression
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
    // InternalAPIMappingLanguage.g:1989:1: rule__TypeCastExpression__Alternatives : ( ( ruleOperand ) | ( ( rule__TypeCastExpression__Group_1__0 ) ) );
    public final void rule__TypeCastExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1993:1: ( ( ruleOperand ) | ( ( rule__TypeCastExpression__Group_1__0 ) ) )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1994:1: ( ruleOperand )
                    {
                    // InternalAPIMappingLanguage.g:1994:1: ( ruleOperand )
                    // InternalAPIMappingLanguage.g:1995:1: ruleOperand
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
                    // InternalAPIMappingLanguage.g:2000:6: ( ( rule__TypeCastExpression__Group_1__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:2000:6: ( ( rule__TypeCastExpression__Group_1__0 ) )
                    // InternalAPIMappingLanguage.g:2001:1: ( rule__TypeCastExpression__Group_1__0 )
                    {
                     before(grammarAccess.getTypeCastExpressionAccess().getGroup_1()); 
                    // InternalAPIMappingLanguage.g:2002:1: ( rule__TypeCastExpression__Group_1__0 )
                    // InternalAPIMappingLanguage.g:2002:2: rule__TypeCastExpression__Group_1__0
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


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalAPIMappingLanguage.g:2011:1: rule__Literal__Alternatives : ( ( RULE_NUMBER ) | ( RULE_BOOLEAN ) | ( RULE_INT ) | ( 'null' ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2015:1: ( ( RULE_NUMBER ) | ( RULE_BOOLEAN ) | ( RULE_INT ) | ( 'null' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
                {
                alt13=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt13=2;
                }
                break;
            case RULE_INT:
                {
                alt13=3;
                }
                break;
            case 16:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2016:1: ( RULE_NUMBER )
                    {
                    // InternalAPIMappingLanguage.g:2016:1: ( RULE_NUMBER )
                    // InternalAPIMappingLanguage.g:2017:1: RULE_NUMBER
                    {
                     before(grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0()); 
                    match(input,RULE_NUMBER,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2022:6: ( RULE_BOOLEAN )
                    {
                    // InternalAPIMappingLanguage.g:2022:6: ( RULE_BOOLEAN )
                    // InternalAPIMappingLanguage.g:2023:1: RULE_BOOLEAN
                    {
                     before(grammarAccess.getLiteralAccess().getBOOLEANTerminalRuleCall_1()); 
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getBOOLEANTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:2028:6: ( RULE_INT )
                    {
                    // InternalAPIMappingLanguage.g:2028:6: ( RULE_INT )
                    // InternalAPIMappingLanguage.g:2029:1: RULE_INT
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAPIMappingLanguage.g:2034:6: ( 'null' )
                    {
                    // InternalAPIMappingLanguage.g:2034:6: ( 'null' )
                    // InternalAPIMappingLanguage.g:2035:1: 'null'
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


    // $ANTLR start "rule__TimeUnitExpr__Alternatives"
    // InternalAPIMappingLanguage.g:2047:1: rule__TimeUnitExpr__Alternatives : ( ( 'DAYS' ) | ( 'HOURS' ) | ( 'MILLISECONDS' ) | ( 'MINUTES' ) | ( 'SECONDS' ) | ( 'MICROSECONDS' ) | ( 'NANOSECONDS' ) );
    public final void rule__TimeUnitExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2051:1: ( ( 'DAYS' ) | ( 'HOURS' ) | ( 'MILLISECONDS' ) | ( 'MINUTES' ) | ( 'SECONDS' ) | ( 'MICROSECONDS' ) | ( 'NANOSECONDS' ) )
            int alt14=7;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt14=1;
                }
                break;
            case 18:
                {
                alt14=2;
                }
                break;
            case 19:
                {
                alt14=3;
                }
                break;
            case 20:
                {
                alt14=4;
                }
                break;
            case 21:
                {
                alt14=5;
                }
                break;
            case 22:
                {
                alt14=6;
                }
                break;
            case 23:
                {
                alt14=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2052:1: ( 'DAYS' )
                    {
                    // InternalAPIMappingLanguage.g:2052:1: ( 'DAYS' )
                    // InternalAPIMappingLanguage.g:2053:1: 'DAYS'
                    {
                     before(grammarAccess.getTimeUnitExprAccess().getDAYSKeyword_0()); 
                    match(input,17,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTimeUnitExprAccess().getDAYSKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2060:6: ( 'HOURS' )
                    {
                    // InternalAPIMappingLanguage.g:2060:6: ( 'HOURS' )
                    // InternalAPIMappingLanguage.g:2061:1: 'HOURS'
                    {
                     before(grammarAccess.getTimeUnitExprAccess().getHOURSKeyword_1()); 
                    match(input,18,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTimeUnitExprAccess().getHOURSKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:2068:6: ( 'MILLISECONDS' )
                    {
                    // InternalAPIMappingLanguage.g:2068:6: ( 'MILLISECONDS' )
                    // InternalAPIMappingLanguage.g:2069:1: 'MILLISECONDS'
                    {
                     before(grammarAccess.getTimeUnitExprAccess().getMILLISECONDSKeyword_2()); 
                    match(input,19,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTimeUnitExprAccess().getMILLISECONDSKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAPIMappingLanguage.g:2076:6: ( 'MINUTES' )
                    {
                    // InternalAPIMappingLanguage.g:2076:6: ( 'MINUTES' )
                    // InternalAPIMappingLanguage.g:2077:1: 'MINUTES'
                    {
                     before(grammarAccess.getTimeUnitExprAccess().getMINUTESKeyword_3()); 
                    match(input,20,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTimeUnitExprAccess().getMINUTESKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAPIMappingLanguage.g:2084:6: ( 'SECONDS' )
                    {
                    // InternalAPIMappingLanguage.g:2084:6: ( 'SECONDS' )
                    // InternalAPIMappingLanguage.g:2085:1: 'SECONDS'
                    {
                     before(grammarAccess.getTimeUnitExprAccess().getSECONDSKeyword_4()); 
                    match(input,21,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTimeUnitExprAccess().getSECONDSKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAPIMappingLanguage.g:2092:6: ( 'MICROSECONDS' )
                    {
                    // InternalAPIMappingLanguage.g:2092:6: ( 'MICROSECONDS' )
                    // InternalAPIMappingLanguage.g:2093:1: 'MICROSECONDS'
                    {
                     before(grammarAccess.getTimeUnitExprAccess().getMICROSECONDSKeyword_5()); 
                    match(input,22,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTimeUnitExprAccess().getMICROSECONDSKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAPIMappingLanguage.g:2100:6: ( 'NANOSECONDS' )
                    {
                    // InternalAPIMappingLanguage.g:2100:6: ( 'NANOSECONDS' )
                    // InternalAPIMappingLanguage.g:2101:1: 'NANOSECONDS'
                    {
                     before(grammarAccess.getTimeUnitExprAccess().getNANOSECONDSKeyword_6()); 
                    match(input,23,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTimeUnitExprAccess().getNANOSECONDSKeyword_6()); 

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
    // $ANTLR end "rule__TimeUnitExpr__Alternatives"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Alternatives_1"
    // InternalAPIMappingLanguage.g:2113:1: rule__ExtendedTypedNamedElementExpression__Alternatives_1 : ( ( ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 ) ) | ( ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 ) ) );
    public final void rule__ExtendedTypedNamedElementExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2117:1: ( ( ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 ) ) | ( ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==69) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=24 && LA15_0<=25)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2118:1: ( ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:2118:1: ( ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 ) )
                    // InternalAPIMappingLanguage.g:2119:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 )
                    {
                     before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getGroup_1_0()); 
                    // InternalAPIMappingLanguage.g:2120:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 )
                    // InternalAPIMappingLanguage.g:2120:2: rule__ExtendedTypedNamedElementExpression__Group_1_0__0
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
                    // InternalAPIMappingLanguage.g:2124:6: ( ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:2124:6: ( ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 ) )
                    // InternalAPIMappingLanguage.g:2125:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 )
                    {
                     before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getGroup_1_1()); 
                    // InternalAPIMappingLanguage.g:2126:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 )
                    // InternalAPIMappingLanguage.g:2126:2: rule__ExtendedTypedNamedElementExpression__Group_1_1__0
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
    // InternalAPIMappingLanguage.g:2135:1: rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 : ( ( ruleArrayIndexExpression ) | ( ruleAttributeAccessorExpression ) );
    public final void rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2139:1: ( ( ruleArrayIndexExpression ) | ( ruleAttributeAccessorExpression ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==67) ) {
                alt16=1;
            }
            else if ( (LA16_0==59) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2140:1: ( ruleArrayIndexExpression )
                    {
                    // InternalAPIMappingLanguage.g:2140:1: ( ruleArrayIndexExpression )
                    // InternalAPIMappingLanguage.g:2141:1: ruleArrayIndexExpression
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
                    // InternalAPIMappingLanguage.g:2146:6: ( ruleAttributeAccessorExpression )
                    {
                    // InternalAPIMappingLanguage.g:2146:6: ( ruleAttributeAccessorExpression )
                    // InternalAPIMappingLanguage.g:2147:1: ruleAttributeAccessorExpression
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
    // InternalAPIMappingLanguage.g:2157:1: rule__UnaryPostIncrementDecrementOperator__Alternatives : ( ( ( '++' ) ) | ( ( '--' ) ) );
    public final void rule__UnaryPostIncrementDecrementOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2161:1: ( ( ( '++' ) ) | ( ( '--' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            else if ( (LA17_0==25) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2162:1: ( ( '++' ) )
                    {
                    // InternalAPIMappingLanguage.g:2162:1: ( ( '++' ) )
                    // InternalAPIMappingLanguage.g:2163:1: ( '++' )
                    {
                     before(grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2164:1: ( '++' )
                    // InternalAPIMappingLanguage.g:2164:3: '++'
                    {
                    match(input,24,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2169:6: ( ( '--' ) )
                    {
                    // InternalAPIMappingLanguage.g:2169:6: ( ( '--' ) )
                    // InternalAPIMappingLanguage.g:2170:1: ( '--' )
                    {
                     before(grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getDECREMENTEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2171:1: ( '--' )
                    // InternalAPIMappingLanguage.g:2171:3: '--'
                    {
                    match(input,25,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2181:1: rule__IncrementDecrementOperatorExpression__Alternatives : ( ( ( '++' ) ) | ( ( '--' ) ) );
    public final void rule__IncrementDecrementOperatorExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2185:1: ( ( ( '++' ) ) | ( ( '--' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            else if ( (LA18_0==25) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2186:1: ( ( '++' ) )
                    {
                    // InternalAPIMappingLanguage.g:2186:1: ( ( '++' ) )
                    // InternalAPIMappingLanguage.g:2187:1: ( '++' )
                    {
                     before(grammarAccess.getIncrementDecrementOperatorExpressionAccess().getINCREMENTEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2188:1: ( '++' )
                    // InternalAPIMappingLanguage.g:2188:3: '++'
                    {
                    match(input,24,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getIncrementDecrementOperatorExpressionAccess().getINCREMENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2193:6: ( ( '--' ) )
                    {
                    // InternalAPIMappingLanguage.g:2193:6: ( ( '--' ) )
                    // InternalAPIMappingLanguage.g:2194:1: ( '--' )
                    {
                     before(grammarAccess.getIncrementDecrementOperatorExpressionAccess().getDECREMENTEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2195:1: ( '--' )
                    // InternalAPIMappingLanguage.g:2195:3: '--'
                    {
                    match(input,25,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2205:1: rule__AssignOperator__Alternatives : ( ( ( ':=' ) ) | ( ( '+=' ) ) | ( ( '-=' ) ) );
    public final void rule__AssignOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2209:1: ( ( ( ':=' ) ) | ( ( '+=' ) ) | ( ( '-=' ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt19=1;
                }
                break;
            case 27:
                {
                alt19=2;
                }
                break;
            case 28:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2210:1: ( ( ':=' ) )
                    {
                    // InternalAPIMappingLanguage.g:2210:1: ( ( ':=' ) )
                    // InternalAPIMappingLanguage.g:2211:1: ( ':=' )
                    {
                     before(grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2212:1: ( ':=' )
                    // InternalAPIMappingLanguage.g:2212:3: ':='
                    {
                    match(input,26,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2217:6: ( ( '+=' ) )
                    {
                    // InternalAPIMappingLanguage.g:2217:6: ( ( '+=' ) )
                    // InternalAPIMappingLanguage.g:2218:1: ( '+=' )
                    {
                     before(grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2219:1: ( '+=' )
                    // InternalAPIMappingLanguage.g:2219:3: '+='
                    {
                    match(input,27,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:2224:6: ( ( '-=' ) )
                    {
                    // InternalAPIMappingLanguage.g:2224:6: ( ( '-=' ) )
                    // InternalAPIMappingLanguage.g:2225:1: ( '-=' )
                    {
                     before(grammarAccess.getAssignOperatorAccess().getMINUS_EQUALEnumLiteralDeclaration_2()); 
                    // InternalAPIMappingLanguage.g:2226:1: ( '-=' )
                    // InternalAPIMappingLanguage.g:2226:3: '-='
                    {
                    match(input,28,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2236:1: rule__ComparingEQNEQOperator__Alternatives : ( ( ( '==' ) ) | ( ( '<>' ) ) );
    public final void rule__ComparingEQNEQOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2240:1: ( ( ( '==' ) ) | ( ( '<>' ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            else if ( (LA20_0==30) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2241:1: ( ( '==' ) )
                    {
                    // InternalAPIMappingLanguage.g:2241:1: ( ( '==' ) )
                    // InternalAPIMappingLanguage.g:2242:1: ( '==' )
                    {
                     before(grammarAccess.getComparingEQNEQOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2243:1: ( '==' )
                    // InternalAPIMappingLanguage.g:2243:3: '=='
                    {
                    match(input,29,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getComparingEQNEQOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2248:6: ( ( '<>' ) )
                    {
                    // InternalAPIMappingLanguage.g:2248:6: ( ( '<>' ) )
                    // InternalAPIMappingLanguage.g:2249:1: ( '<>' )
                    {
                     before(grammarAccess.getComparingEQNEQOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2250:1: ( '<>' )
                    // InternalAPIMappingLanguage.g:2250:3: '<>'
                    {
                    match(input,30,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2260:1: rule__ComparingRelOperator__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) );
    public final void rule__ComparingRelOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2264:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt21=1;
                }
                break;
            case 32:
                {
                alt21=2;
                }
                break;
            case 33:
                {
                alt21=3;
                }
                break;
            case 34:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2265:1: ( ( '<' ) )
                    {
                    // InternalAPIMappingLanguage.g:2265:1: ( ( '<' ) )
                    // InternalAPIMappingLanguage.g:2266:1: ( '<' )
                    {
                     before(grammarAccess.getComparingRelOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2267:1: ( '<' )
                    // InternalAPIMappingLanguage.g:2267:3: '<'
                    {
                    match(input,31,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getComparingRelOperatorAccess().getLESSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2272:6: ( ( '<=' ) )
                    {
                    // InternalAPIMappingLanguage.g:2272:6: ( ( '<=' ) )
                    // InternalAPIMappingLanguage.g:2273:1: ( '<=' )
                    {
                     before(grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2274:1: ( '<=' )
                    // InternalAPIMappingLanguage.g:2274:3: '<='
                    {
                    match(input,32,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:2279:6: ( ( '>=' ) )
                    {
                    // InternalAPIMappingLanguage.g:2279:6: ( ( '>=' ) )
                    // InternalAPIMappingLanguage.g:2280:1: ( '>=' )
                    {
                     before(grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                    // InternalAPIMappingLanguage.g:2281:1: ( '>=' )
                    // InternalAPIMappingLanguage.g:2281:3: '>='
                    {
                    match(input,33,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAPIMappingLanguage.g:2286:6: ( ( '>' ) )
                    {
                    // InternalAPIMappingLanguage.g:2286:6: ( ( '>' ) )
                    // InternalAPIMappingLanguage.g:2287:1: ( '>' )
                    {
                     before(grammarAccess.getComparingRelOperatorAccess().getGREATEREnumLiteralDeclaration_3()); 
                    // InternalAPIMappingLanguage.g:2288:1: ( '>' )
                    // InternalAPIMappingLanguage.g:2288:3: '>'
                    {
                    match(input,34,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2298:1: rule__AdditionOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2302:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            else if ( (LA22_0==36) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2303:1: ( ( '+' ) )
                    {
                    // InternalAPIMappingLanguage.g:2303:1: ( ( '+' ) )
                    // InternalAPIMappingLanguage.g:2304:1: ( '+' )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2305:1: ( '+' )
                    // InternalAPIMappingLanguage.g:2305:3: '+'
                    {
                    match(input,35,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2310:6: ( ( '-' ) )
                    {
                    // InternalAPIMappingLanguage.g:2310:6: ( ( '-' ) )
                    // InternalAPIMappingLanguage.g:2311:1: ( '-' )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2312:1: ( '-' )
                    // InternalAPIMappingLanguage.g:2312:3: '-'
                    {
                    match(input,36,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2322:1: rule__MultiplicationOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) );
    public final void rule__MultiplicationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2326:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt23=1;
                }
                break;
            case 38:
                {
                alt23=2;
                }
                break;
            case 39:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2327:1: ( ( '*' ) )
                    {
                    // InternalAPIMappingLanguage.g:2327:1: ( ( '*' ) )
                    // InternalAPIMappingLanguage.g:2328:1: ( '*' )
                    {
                     before(grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2329:1: ( '*' )
                    // InternalAPIMappingLanguage.g:2329:3: '*'
                    {
                    match(input,37,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2334:6: ( ( '/' ) )
                    {
                    // InternalAPIMappingLanguage.g:2334:6: ( ( '/' ) )
                    // InternalAPIMappingLanguage.g:2335:1: ( '/' )
                    {
                     before(grammarAccess.getMultiplicationOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2336:1: ( '/' )
                    // InternalAPIMappingLanguage.g:2336:3: '/'
                    {
                    match(input,38,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicationOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:2341:6: ( ( '%' ) )
                    {
                    // InternalAPIMappingLanguage.g:2341:6: ( ( '%' ) )
                    // InternalAPIMappingLanguage.g:2342:1: ( '%' )
                    {
                     before(grammarAccess.getMultiplicationOperatorAccess().getMODULOEnumLiteralDeclaration_2()); 
                    // InternalAPIMappingLanguage.g:2343:1: ( '%' )
                    // InternalAPIMappingLanguage.g:2343:3: '%'
                    {
                    match(input,39,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2353:1: rule__UnaryPreOperator__Alternatives : ( ( ( 'not' ) ) | ( ( '-' ) ) );
    public final void rule__UnaryPreOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2357:1: ( ( ( 'not' ) ) | ( ( '-' ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            else if ( (LA24_0==36) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2358:1: ( ( 'not' ) )
                    {
                    // InternalAPIMappingLanguage.g:2358:1: ( ( 'not' ) )
                    // InternalAPIMappingLanguage.g:2359:1: ( 'not' )
                    {
                     before(grammarAccess.getUnaryPreOperatorAccess().getNOTEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2360:1: ( 'not' )
                    // InternalAPIMappingLanguage.g:2360:3: 'not'
                    {
                    match(input,40,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryPreOperatorAccess().getNOTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2365:6: ( ( '-' ) )
                    {
                    // InternalAPIMappingLanguage.g:2365:6: ( ( '-' ) )
                    // InternalAPIMappingLanguage.g:2366:1: ( '-' )
                    {
                     before(grammarAccess.getUnaryPreOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2367:1: ( '-' )
                    // InternalAPIMappingLanguage.g:2367:3: '-'
                    {
                    match(input,36,FollowSets000.FOLLOW_2); 

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
    // InternalAPIMappingLanguage.g:2377:1: rule__PositionSelectorKind__Alternatives : ( ( ( 'self' ) ) | ( ( 'first' ) ) | ( ( 'last' ) ) | ( ( 'prev' ) ) | ( ( 'next' ) ) );
    public final void rule__PositionSelectorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2381:1: ( ( ( 'self' ) ) | ( ( 'first' ) ) | ( ( 'last' ) ) | ( ( 'prev' ) ) | ( ( 'next' ) ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt25=1;
                }
                break;
            case 42:
                {
                alt25=2;
                }
                break;
            case 43:
                {
                alt25=3;
                }
                break;
            case 44:
                {
                alt25=4;
                }
                break;
            case 45:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2382:1: ( ( 'self' ) )
                    {
                    // InternalAPIMappingLanguage.g:2382:1: ( ( 'self' ) )
                    // InternalAPIMappingLanguage.g:2383:1: ( 'self' )
                    {
                     before(grammarAccess.getPositionSelectorKindAccess().getSELFEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2384:1: ( 'self' )
                    // InternalAPIMappingLanguage.g:2384:3: 'self'
                    {
                    match(input,41,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionSelectorKindAccess().getSELFEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2389:6: ( ( 'first' ) )
                    {
                    // InternalAPIMappingLanguage.g:2389:6: ( ( 'first' ) )
                    // InternalAPIMappingLanguage.g:2390:1: ( 'first' )
                    {
                     before(grammarAccess.getPositionSelectorKindAccess().getFIRSTEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2391:1: ( 'first' )
                    // InternalAPIMappingLanguage.g:2391:3: 'first'
                    {
                    match(input,42,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionSelectorKindAccess().getFIRSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:2396:6: ( ( 'last' ) )
                    {
                    // InternalAPIMappingLanguage.g:2396:6: ( ( 'last' ) )
                    // InternalAPIMappingLanguage.g:2397:1: ( 'last' )
                    {
                     before(grammarAccess.getPositionSelectorKindAccess().getLASTEnumLiteralDeclaration_2()); 
                    // InternalAPIMappingLanguage.g:2398:1: ( 'last' )
                    // InternalAPIMappingLanguage.g:2398:3: 'last'
                    {
                    match(input,43,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionSelectorKindAccess().getLASTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAPIMappingLanguage.g:2403:6: ( ( 'prev' ) )
                    {
                    // InternalAPIMappingLanguage.g:2403:6: ( ( 'prev' ) )
                    // InternalAPIMappingLanguage.g:2404:1: ( 'prev' )
                    {
                     before(grammarAccess.getPositionSelectorKindAccess().getPREVEnumLiteralDeclaration_3()); 
                    // InternalAPIMappingLanguage.g:2405:1: ( 'prev' )
                    // InternalAPIMappingLanguage.g:2405:3: 'prev'
                    {
                    match(input,44,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionSelectorKindAccess().getPREVEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAPIMappingLanguage.g:2410:6: ( ( 'next' ) )
                    {
                    // InternalAPIMappingLanguage.g:2410:6: ( ( 'next' ) )
                    // InternalAPIMappingLanguage.g:2411:1: ( 'next' )
                    {
                     before(grammarAccess.getPositionSelectorKindAccess().getNEXTEnumLiteralDeclaration_4()); 
                    // InternalAPIMappingLanguage.g:2412:1: ( 'next' )
                    // InternalAPIMappingLanguage.g:2412:3: 'next'
                    {
                    match(input,45,FollowSets000.FOLLOW_2); 

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


    // $ANTLR start "rule__MappingRepository__Group__0"
    // InternalAPIMappingLanguage.g:2424:1: rule__MappingRepository__Group__0 : rule__MappingRepository__Group__0__Impl rule__MappingRepository__Group__1 ;
    public final void rule__MappingRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2428:1: ( rule__MappingRepository__Group__0__Impl rule__MappingRepository__Group__1 )
            // InternalAPIMappingLanguage.g:2429:2: rule__MappingRepository__Group__0__Impl rule__MappingRepository__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MappingRepository__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__0"


    // $ANTLR start "rule__MappingRepository__Group__0__Impl"
    // InternalAPIMappingLanguage.g:2436:1: rule__MappingRepository__Group__0__Impl : ( ( rule__MappingRepository__ImportsAssignment_0 )* ) ;
    public final void rule__MappingRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2440:1: ( ( ( rule__MappingRepository__ImportsAssignment_0 )* ) )
            // InternalAPIMappingLanguage.g:2441:1: ( ( rule__MappingRepository__ImportsAssignment_0 )* )
            {
            // InternalAPIMappingLanguage.g:2441:1: ( ( rule__MappingRepository__ImportsAssignment_0 )* )
            // InternalAPIMappingLanguage.g:2442:1: ( rule__MappingRepository__ImportsAssignment_0 )*
            {
             before(grammarAccess.getMappingRepositoryAccess().getImportsAssignment_0()); 
            // InternalAPIMappingLanguage.g:2443:1: ( rule__MappingRepository__ImportsAssignment_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==51) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:2443:2: rule__MappingRepository__ImportsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__MappingRepository__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getMappingRepositoryAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__0__Impl"


    // $ANTLR start "rule__MappingRepository__Group__1"
    // InternalAPIMappingLanguage.g:2453:1: rule__MappingRepository__Group__1 : rule__MappingRepository__Group__1__Impl rule__MappingRepository__Group__2 ;
    public final void rule__MappingRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2457:1: ( rule__MappingRepository__Group__1__Impl rule__MappingRepository__Group__2 )
            // InternalAPIMappingLanguage.g:2458:2: rule__MappingRepository__Group__1__Impl rule__MappingRepository__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__MappingRepository__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__1"


    // $ANTLR start "rule__MappingRepository__Group__1__Impl"
    // InternalAPIMappingLanguage.g:2465:1: rule__MappingRepository__Group__1__Impl : ( 'MappingRepository:' ) ;
    public final void rule__MappingRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2469:1: ( ( 'MappingRepository:' ) )
            // InternalAPIMappingLanguage.g:2470:1: ( 'MappingRepository:' )
            {
            // InternalAPIMappingLanguage.g:2470:1: ( 'MappingRepository:' )
            // InternalAPIMappingLanguage.g:2471:1: 'MappingRepository:'
            {
             before(grammarAccess.getMappingRepositoryAccess().getMappingRepositoryKeyword_1()); 
            match(input,46,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMappingRepositoryAccess().getMappingRepositoryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__1__Impl"


    // $ANTLR start "rule__MappingRepository__Group__2"
    // InternalAPIMappingLanguage.g:2484:1: rule__MappingRepository__Group__2 : rule__MappingRepository__Group__2__Impl rule__MappingRepository__Group__3 ;
    public final void rule__MappingRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2488:1: ( rule__MappingRepository__Group__2__Impl rule__MappingRepository__Group__3 )
            // InternalAPIMappingLanguage.g:2489:2: rule__MappingRepository__Group__2__Impl rule__MappingRepository__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__MappingRepository__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__2"


    // $ANTLR start "rule__MappingRepository__Group__2__Impl"
    // InternalAPIMappingLanguage.g:2496:1: rule__MappingRepository__Group__2__Impl : ( ( rule__MappingRepository__NameAssignment_2 ) ) ;
    public final void rule__MappingRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2500:1: ( ( ( rule__MappingRepository__NameAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:2501:1: ( ( rule__MappingRepository__NameAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:2501:1: ( ( rule__MappingRepository__NameAssignment_2 ) )
            // InternalAPIMappingLanguage.g:2502:1: ( rule__MappingRepository__NameAssignment_2 )
            {
             before(grammarAccess.getMappingRepositoryAccess().getNameAssignment_2()); 
            // InternalAPIMappingLanguage.g:2503:1: ( rule__MappingRepository__NameAssignment_2 )
            // InternalAPIMappingLanguage.g:2503:2: rule__MappingRepository__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMappingRepositoryAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__2__Impl"


    // $ANTLR start "rule__MappingRepository__Group__3"
    // InternalAPIMappingLanguage.g:2513:1: rule__MappingRepository__Group__3 : rule__MappingRepository__Group__3__Impl rule__MappingRepository__Group__4 ;
    public final void rule__MappingRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2517:1: ( rule__MappingRepository__Group__3__Impl rule__MappingRepository__Group__4 )
            // InternalAPIMappingLanguage.g:2518:2: rule__MappingRepository__Group__3__Impl rule__MappingRepository__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__MappingRepository__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__3"


    // $ANTLR start "rule__MappingRepository__Group__3__Impl"
    // InternalAPIMappingLanguage.g:2525:1: rule__MappingRepository__Group__3__Impl : ( '{' ) ;
    public final void rule__MappingRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2529:1: ( ( '{' ) )
            // InternalAPIMappingLanguage.g:2530:1: ( '{' )
            {
            // InternalAPIMappingLanguage.g:2530:1: ( '{' )
            // InternalAPIMappingLanguage.g:2531:1: '{'
            {
             before(grammarAccess.getMappingRepositoryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,47,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMappingRepositoryAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__3__Impl"


    // $ANTLR start "rule__MappingRepository__Group__4"
    // InternalAPIMappingLanguage.g:2544:1: rule__MappingRepository__Group__4 : rule__MappingRepository__Group__4__Impl rule__MappingRepository__Group__5 ;
    public final void rule__MappingRepository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2548:1: ( rule__MappingRepository__Group__4__Impl rule__MappingRepository__Group__5 )
            // InternalAPIMappingLanguage.g:2549:2: rule__MappingRepository__Group__4__Impl rule__MappingRepository__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__MappingRepository__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__4"


    // $ANTLR start "rule__MappingRepository__Group__4__Impl"
    // InternalAPIMappingLanguage.g:2556:1: rule__MappingRepository__Group__4__Impl : ( ( rule__MappingRepository__Group_4__0 )? ) ;
    public final void rule__MappingRepository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2560:1: ( ( ( rule__MappingRepository__Group_4__0 )? ) )
            // InternalAPIMappingLanguage.g:2561:1: ( ( rule__MappingRepository__Group_4__0 )? )
            {
            // InternalAPIMappingLanguage.g:2561:1: ( ( rule__MappingRepository__Group_4__0 )? )
            // InternalAPIMappingLanguage.g:2562:1: ( rule__MappingRepository__Group_4__0 )?
            {
             before(grammarAccess.getMappingRepositoryAccess().getGroup_4()); 
            // InternalAPIMappingLanguage.g:2563:1: ( rule__MappingRepository__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==52) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2563:2: rule__MappingRepository__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MappingRepository__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRepositoryAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__4__Impl"


    // $ANTLR start "rule__MappingRepository__Group__5"
    // InternalAPIMappingLanguage.g:2573:1: rule__MappingRepository__Group__5 : rule__MappingRepository__Group__5__Impl rule__MappingRepository__Group__6 ;
    public final void rule__MappingRepository__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2577:1: ( rule__MappingRepository__Group__5__Impl rule__MappingRepository__Group__6 )
            // InternalAPIMappingLanguage.g:2578:2: rule__MappingRepository__Group__5__Impl rule__MappingRepository__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__MappingRepository__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__5"


    // $ANTLR start "rule__MappingRepository__Group__5__Impl"
    // InternalAPIMappingLanguage.g:2585:1: rule__MappingRepository__Group__5__Impl : ( '}' ) ;
    public final void rule__MappingRepository__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2589:1: ( ( '}' ) )
            // InternalAPIMappingLanguage.g:2590:1: ( '}' )
            {
            // InternalAPIMappingLanguage.g:2590:1: ( '}' )
            // InternalAPIMappingLanguage.g:2591:1: '}'
            {
             before(grammarAccess.getMappingRepositoryAccess().getRightCurlyBracketKeyword_5()); 
            match(input,48,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMappingRepositoryAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__5__Impl"


    // $ANTLR start "rule__MappingRepository__Group__6"
    // InternalAPIMappingLanguage.g:2604:1: rule__MappingRepository__Group__6 : rule__MappingRepository__Group__6__Impl ;
    public final void rule__MappingRepository__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2608:1: ( rule__MappingRepository__Group__6__Impl )
            // InternalAPIMappingLanguage.g:2609:2: rule__MappingRepository__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__6"


    // $ANTLR start "rule__MappingRepository__Group__6__Impl"
    // InternalAPIMappingLanguage.g:2615:1: rule__MappingRepository__Group__6__Impl : ( ( rule__MappingRepository__Group_6__0 )? ) ;
    public final void rule__MappingRepository__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2619:1: ( ( ( rule__MappingRepository__Group_6__0 )? ) )
            // InternalAPIMappingLanguage.g:2620:1: ( ( rule__MappingRepository__Group_6__0 )? )
            {
            // InternalAPIMappingLanguage.g:2620:1: ( ( rule__MappingRepository__Group_6__0 )? )
            // InternalAPIMappingLanguage.g:2621:1: ( rule__MappingRepository__Group_6__0 )?
            {
             before(grammarAccess.getMappingRepositoryAccess().getGroup_6()); 
            // InternalAPIMappingLanguage.g:2622:1: ( rule__MappingRepository__Group_6__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==50) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2622:2: rule__MappingRepository__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MappingRepository__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRepositoryAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__6__Impl"


    // $ANTLR start "rule__MappingRepository__Group_4__0"
    // InternalAPIMappingLanguage.g:2646:1: rule__MappingRepository__Group_4__0 : rule__MappingRepository__Group_4__0__Impl rule__MappingRepository__Group_4__1 ;
    public final void rule__MappingRepository__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2650:1: ( rule__MappingRepository__Group_4__0__Impl rule__MappingRepository__Group_4__1 )
            // InternalAPIMappingLanguage.g:2651:2: rule__MappingRepository__Group_4__0__Impl rule__MappingRepository__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__MappingRepository__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_4__0"


    // $ANTLR start "rule__MappingRepository__Group_4__0__Impl"
    // InternalAPIMappingLanguage.g:2658:1: rule__MappingRepository__Group_4__0__Impl : ( ( rule__MappingRepository__PortApiMappingsAssignment_4_0 ) ) ;
    public final void rule__MappingRepository__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2662:1: ( ( ( rule__MappingRepository__PortApiMappingsAssignment_4_0 ) ) )
            // InternalAPIMappingLanguage.g:2663:1: ( ( rule__MappingRepository__PortApiMappingsAssignment_4_0 ) )
            {
            // InternalAPIMappingLanguage.g:2663:1: ( ( rule__MappingRepository__PortApiMappingsAssignment_4_0 ) )
            // InternalAPIMappingLanguage.g:2664:1: ( rule__MappingRepository__PortApiMappingsAssignment_4_0 )
            {
             before(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsAssignment_4_0()); 
            // InternalAPIMappingLanguage.g:2665:1: ( rule__MappingRepository__PortApiMappingsAssignment_4_0 )
            // InternalAPIMappingLanguage.g:2665:2: rule__MappingRepository__PortApiMappingsAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__PortApiMappingsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_4__0__Impl"


    // $ANTLR start "rule__MappingRepository__Group_4__1"
    // InternalAPIMappingLanguage.g:2675:1: rule__MappingRepository__Group_4__1 : rule__MappingRepository__Group_4__1__Impl ;
    public final void rule__MappingRepository__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2679:1: ( rule__MappingRepository__Group_4__1__Impl )
            // InternalAPIMappingLanguage.g:2680:2: rule__MappingRepository__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_4__1"


    // $ANTLR start "rule__MappingRepository__Group_4__1__Impl"
    // InternalAPIMappingLanguage.g:2686:1: rule__MappingRepository__Group_4__1__Impl : ( ( rule__MappingRepository__Group_4_1__0 )* ) ;
    public final void rule__MappingRepository__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2690:1: ( ( ( rule__MappingRepository__Group_4_1__0 )* ) )
            // InternalAPIMappingLanguage.g:2691:1: ( ( rule__MappingRepository__Group_4_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:2691:1: ( ( rule__MappingRepository__Group_4_1__0 )* )
            // InternalAPIMappingLanguage.g:2692:1: ( rule__MappingRepository__Group_4_1__0 )*
            {
             before(grammarAccess.getMappingRepositoryAccess().getGroup_4_1()); 
            // InternalAPIMappingLanguage.g:2693:1: ( rule__MappingRepository__Group_4_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==49) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:2693:2: rule__MappingRepository__Group_4_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__MappingRepository__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getMappingRepositoryAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_4__1__Impl"


    // $ANTLR start "rule__MappingRepository__Group_4_1__0"
    // InternalAPIMappingLanguage.g:2707:1: rule__MappingRepository__Group_4_1__0 : rule__MappingRepository__Group_4_1__0__Impl rule__MappingRepository__Group_4_1__1 ;
    public final void rule__MappingRepository__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2711:1: ( rule__MappingRepository__Group_4_1__0__Impl rule__MappingRepository__Group_4_1__1 )
            // InternalAPIMappingLanguage.g:2712:2: rule__MappingRepository__Group_4_1__0__Impl rule__MappingRepository__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__MappingRepository__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_4_1__0"


    // $ANTLR start "rule__MappingRepository__Group_4_1__0__Impl"
    // InternalAPIMappingLanguage.g:2719:1: rule__MappingRepository__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__MappingRepository__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2723:1: ( ( ',' ) )
            // InternalAPIMappingLanguage.g:2724:1: ( ',' )
            {
            // InternalAPIMappingLanguage.g:2724:1: ( ',' )
            // InternalAPIMappingLanguage.g:2725:1: ','
            {
             before(grammarAccess.getMappingRepositoryAccess().getCommaKeyword_4_1_0()); 
            match(input,49,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMappingRepositoryAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_4_1__0__Impl"


    // $ANTLR start "rule__MappingRepository__Group_4_1__1"
    // InternalAPIMappingLanguage.g:2738:1: rule__MappingRepository__Group_4_1__1 : rule__MappingRepository__Group_4_1__1__Impl ;
    public final void rule__MappingRepository__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2742:1: ( rule__MappingRepository__Group_4_1__1__Impl )
            // InternalAPIMappingLanguage.g:2743:2: rule__MappingRepository__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_4_1__1"


    // $ANTLR start "rule__MappingRepository__Group_4_1__1__Impl"
    // InternalAPIMappingLanguage.g:2749:1: rule__MappingRepository__Group_4_1__1__Impl : ( ( rule__MappingRepository__PortApiMappingsAssignment_4_1_1 ) ) ;
    public final void rule__MappingRepository__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2753:1: ( ( ( rule__MappingRepository__PortApiMappingsAssignment_4_1_1 ) ) )
            // InternalAPIMappingLanguage.g:2754:1: ( ( rule__MappingRepository__PortApiMappingsAssignment_4_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:2754:1: ( ( rule__MappingRepository__PortApiMappingsAssignment_4_1_1 ) )
            // InternalAPIMappingLanguage.g:2755:1: ( rule__MappingRepository__PortApiMappingsAssignment_4_1_1 )
            {
             before(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsAssignment_4_1_1()); 
            // InternalAPIMappingLanguage.g:2756:1: ( rule__MappingRepository__PortApiMappingsAssignment_4_1_1 )
            // InternalAPIMappingLanguage.g:2756:2: rule__MappingRepository__PortApiMappingsAssignment_4_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__PortApiMappingsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_4_1__1__Impl"


    // $ANTLR start "rule__MappingRepository__Group_6__0"
    // InternalAPIMappingLanguage.g:2770:1: rule__MappingRepository__Group_6__0 : rule__MappingRepository__Group_6__0__Impl rule__MappingRepository__Group_6__1 ;
    public final void rule__MappingRepository__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2774:1: ( rule__MappingRepository__Group_6__0__Impl rule__MappingRepository__Group_6__1 )
            // InternalAPIMappingLanguage.g:2775:2: rule__MappingRepository__Group_6__0__Impl rule__MappingRepository__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__MappingRepository__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_6__0"


    // $ANTLR start "rule__MappingRepository__Group_6__0__Impl"
    // InternalAPIMappingLanguage.g:2782:1: rule__MappingRepository__Group_6__0__Impl : ( '#' ) ;
    public final void rule__MappingRepository__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2786:1: ( ( '#' ) )
            // InternalAPIMappingLanguage.g:2787:1: ( '#' )
            {
            // InternalAPIMappingLanguage.g:2787:1: ( '#' )
            // InternalAPIMappingLanguage.g:2788:1: '#'
            {
             before(grammarAccess.getMappingRepositoryAccess().getNumberSignKeyword_6_0()); 
            match(input,50,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMappingRepositoryAccess().getNumberSignKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_6__0__Impl"


    // $ANTLR start "rule__MappingRepository__Group_6__1"
    // InternalAPIMappingLanguage.g:2801:1: rule__MappingRepository__Group_6__1 : rule__MappingRepository__Group_6__1__Impl ;
    public final void rule__MappingRepository__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2805:1: ( rule__MappingRepository__Group_6__1__Impl )
            // InternalAPIMappingLanguage.g:2806:2: rule__MappingRepository__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_6__1"


    // $ANTLR start "rule__MappingRepository__Group_6__1__Impl"
    // InternalAPIMappingLanguage.g:2812:1: rule__MappingRepository__Group_6__1__Impl : ( ( rule__MappingRepository__CommentAssignment_6_1 ) ) ;
    public final void rule__MappingRepository__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2816:1: ( ( ( rule__MappingRepository__CommentAssignment_6_1 ) ) )
            // InternalAPIMappingLanguage.g:2817:1: ( ( rule__MappingRepository__CommentAssignment_6_1 ) )
            {
            // InternalAPIMappingLanguage.g:2817:1: ( ( rule__MappingRepository__CommentAssignment_6_1 ) )
            // InternalAPIMappingLanguage.g:2818:1: ( rule__MappingRepository__CommentAssignment_6_1 )
            {
             before(grammarAccess.getMappingRepositoryAccess().getCommentAssignment_6_1()); 
            // InternalAPIMappingLanguage.g:2819:1: ( rule__MappingRepository__CommentAssignment_6_1 )
            // InternalAPIMappingLanguage.g:2819:2: rule__MappingRepository__CommentAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__CommentAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRepositoryAccess().getCommentAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_6__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalAPIMappingLanguage.g:2833:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2837:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalAPIMappingLanguage.g:2838:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalAPIMappingLanguage.g:2845:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2849:1: ( ( 'import' ) )
            // InternalAPIMappingLanguage.g:2850:1: ( 'import' )
            {
            // InternalAPIMappingLanguage.g:2850:1: ( 'import' )
            // InternalAPIMappingLanguage.g:2851:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,51,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalAPIMappingLanguage.g:2864:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2868:1: ( rule__Import__Group__1__Impl )
            // InternalAPIMappingLanguage.g:2869:2: rule__Import__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalAPIMappingLanguage.g:2875:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2879:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:2880:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:2880:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalAPIMappingLanguage.g:2881:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // InternalAPIMappingLanguage.g:2882:1: ( rule__Import__ImportURIAssignment_1 )
            // InternalAPIMappingLanguage.g:2882:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__PortApiMapping__Group__0"
    // InternalAPIMappingLanguage.g:2896:1: rule__PortApiMapping__Group__0 : rule__PortApiMapping__Group__0__Impl rule__PortApiMapping__Group__1 ;
    public final void rule__PortApiMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2900:1: ( rule__PortApiMapping__Group__0__Impl rule__PortApiMapping__Group__1 )
            // InternalAPIMappingLanguage.g:2901:2: rule__PortApiMapping__Group__0__Impl rule__PortApiMapping__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__PortApiMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__0"


    // $ANTLR start "rule__PortApiMapping__Group__0__Impl"
    // InternalAPIMappingLanguage.g:2908:1: rule__PortApiMapping__Group__0__Impl : ( 'PortInstance:' ) ;
    public final void rule__PortApiMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2912:1: ( ( 'PortInstance:' ) )
            // InternalAPIMappingLanguage.g:2913:1: ( 'PortInstance:' )
            {
            // InternalAPIMappingLanguage.g:2913:1: ( 'PortInstance:' )
            // InternalAPIMappingLanguage.g:2914:1: 'PortInstance:'
            {
             before(grammarAccess.getPortApiMappingAccess().getPortInstanceKeyword_0()); 
            match(input,52,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPortApiMappingAccess().getPortInstanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__0__Impl"


    // $ANTLR start "rule__PortApiMapping__Group__1"
    // InternalAPIMappingLanguage.g:2927:1: rule__PortApiMapping__Group__1 : rule__PortApiMapping__Group__1__Impl rule__PortApiMapping__Group__2 ;
    public final void rule__PortApiMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2931:1: ( rule__PortApiMapping__Group__1__Impl rule__PortApiMapping__Group__2 )
            // InternalAPIMappingLanguage.g:2932:2: rule__PortApiMapping__Group__1__Impl rule__PortApiMapping__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__PortApiMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__1"


    // $ANTLR start "rule__PortApiMapping__Group__1__Impl"
    // InternalAPIMappingLanguage.g:2939:1: rule__PortApiMapping__Group__1__Impl : ( ( rule__PortApiMapping__PortAssignment_1 ) ) ;
    public final void rule__PortApiMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2943:1: ( ( ( rule__PortApiMapping__PortAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:2944:1: ( ( rule__PortApiMapping__PortAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:2944:1: ( ( rule__PortApiMapping__PortAssignment_1 ) )
            // InternalAPIMappingLanguage.g:2945:1: ( rule__PortApiMapping__PortAssignment_1 )
            {
             before(grammarAccess.getPortApiMappingAccess().getPortAssignment_1()); 
            // InternalAPIMappingLanguage.g:2946:1: ( rule__PortApiMapping__PortAssignment_1 )
            // InternalAPIMappingLanguage.g:2946:2: rule__PortApiMapping__PortAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__PortAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPortApiMappingAccess().getPortAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__1__Impl"


    // $ANTLR start "rule__PortApiMapping__Group__2"
    // InternalAPIMappingLanguage.g:2956:1: rule__PortApiMapping__Group__2 : rule__PortApiMapping__Group__2__Impl rule__PortApiMapping__Group__3 ;
    public final void rule__PortApiMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2960:1: ( rule__PortApiMapping__Group__2__Impl rule__PortApiMapping__Group__3 )
            // InternalAPIMappingLanguage.g:2961:2: rule__PortApiMapping__Group__2__Impl rule__PortApiMapping__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__PortApiMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__2"


    // $ANTLR start "rule__PortApiMapping__Group__2__Impl"
    // InternalAPIMappingLanguage.g:2968:1: rule__PortApiMapping__Group__2__Impl : ( '{' ) ;
    public final void rule__PortApiMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2972:1: ( ( '{' ) )
            // InternalAPIMappingLanguage.g:2973:1: ( '{' )
            {
            // InternalAPIMappingLanguage.g:2973:1: ( '{' )
            // InternalAPIMappingLanguage.g:2974:1: '{'
            {
             before(grammarAccess.getPortApiMappingAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,47,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPortApiMappingAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__2__Impl"


    // $ANTLR start "rule__PortApiMapping__Group__3"
    // InternalAPIMappingLanguage.g:2987:1: rule__PortApiMapping__Group__3 : rule__PortApiMapping__Group__3__Impl rule__PortApiMapping__Group__4 ;
    public final void rule__PortApiMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2991:1: ( rule__PortApiMapping__Group__3__Impl rule__PortApiMapping__Group__4 )
            // InternalAPIMappingLanguage.g:2992:2: rule__PortApiMapping__Group__3__Impl rule__PortApiMapping__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__PortApiMapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__3"


    // $ANTLR start "rule__PortApiMapping__Group__3__Impl"
    // InternalAPIMappingLanguage.g:2999:1: rule__PortApiMapping__Group__3__Impl : ( 'execCommand:' ) ;
    public final void rule__PortApiMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3003:1: ( ( 'execCommand:' ) )
            // InternalAPIMappingLanguage.g:3004:1: ( 'execCommand:' )
            {
            // InternalAPIMappingLanguage.g:3004:1: ( 'execCommand:' )
            // InternalAPIMappingLanguage.g:3005:1: 'execCommand:'
            {
             before(grammarAccess.getPortApiMappingAccess().getExecCommandKeyword_3()); 
            match(input,53,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPortApiMappingAccess().getExecCommandKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__3__Impl"


    // $ANTLR start "rule__PortApiMapping__Group__4"
    // InternalAPIMappingLanguage.g:3018:1: rule__PortApiMapping__Group__4 : rule__PortApiMapping__Group__4__Impl rule__PortApiMapping__Group__5 ;
    public final void rule__PortApiMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3022:1: ( rule__PortApiMapping__Group__4__Impl rule__PortApiMapping__Group__5 )
            // InternalAPIMappingLanguage.g:3023:2: rule__PortApiMapping__Group__4__Impl rule__PortApiMapping__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__PortApiMapping__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__4"


    // $ANTLR start "rule__PortApiMapping__Group__4__Impl"
    // InternalAPIMappingLanguage.g:3030:1: rule__PortApiMapping__Group__4__Impl : ( ( rule__PortApiMapping__ExecCommandAssignment_4 ) ) ;
    public final void rule__PortApiMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3034:1: ( ( ( rule__PortApiMapping__ExecCommandAssignment_4 ) ) )
            // InternalAPIMappingLanguage.g:3035:1: ( ( rule__PortApiMapping__ExecCommandAssignment_4 ) )
            {
            // InternalAPIMappingLanguage.g:3035:1: ( ( rule__PortApiMapping__ExecCommandAssignment_4 ) )
            // InternalAPIMappingLanguage.g:3036:1: ( rule__PortApiMapping__ExecCommandAssignment_4 )
            {
             before(grammarAccess.getPortApiMappingAccess().getExecCommandAssignment_4()); 
            // InternalAPIMappingLanguage.g:3037:1: ( rule__PortApiMapping__ExecCommandAssignment_4 )
            // InternalAPIMappingLanguage.g:3037:2: rule__PortApiMapping__ExecCommandAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__ExecCommandAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPortApiMappingAccess().getExecCommandAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__4__Impl"


    // $ANTLR start "rule__PortApiMapping__Group__5"
    // InternalAPIMappingLanguage.g:3047:1: rule__PortApiMapping__Group__5 : rule__PortApiMapping__Group__5__Impl rule__PortApiMapping__Group__6 ;
    public final void rule__PortApiMapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3051:1: ( rule__PortApiMapping__Group__5__Impl rule__PortApiMapping__Group__6 )
            // InternalAPIMappingLanguage.g:3052:2: rule__PortApiMapping__Group__5__Impl rule__PortApiMapping__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__PortApiMapping__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__5"


    // $ANTLR start "rule__PortApiMapping__Group__5__Impl"
    // InternalAPIMappingLanguage.g:3059:1: rule__PortApiMapping__Group__5__Impl : ( ( rule__PortApiMapping__Group_5__0 )? ) ;
    public final void rule__PortApiMapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3063:1: ( ( ( rule__PortApiMapping__Group_5__0 )? ) )
            // InternalAPIMappingLanguage.g:3064:1: ( ( rule__PortApiMapping__Group_5__0 )? )
            {
            // InternalAPIMappingLanguage.g:3064:1: ( ( rule__PortApiMapping__Group_5__0 )? )
            // InternalAPIMappingLanguage.g:3065:1: ( rule__PortApiMapping__Group_5__0 )?
            {
             before(grammarAccess.getPortApiMappingAccess().getGroup_5()); 
            // InternalAPIMappingLanguage.g:3066:1: ( rule__PortApiMapping__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==54) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAPIMappingLanguage.g:3066:2: rule__PortApiMapping__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PortApiMapping__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPortApiMappingAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__5__Impl"


    // $ANTLR start "rule__PortApiMapping__Group__6"
    // InternalAPIMappingLanguage.g:3076:1: rule__PortApiMapping__Group__6 : rule__PortApiMapping__Group__6__Impl ;
    public final void rule__PortApiMapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3080:1: ( rule__PortApiMapping__Group__6__Impl )
            // InternalAPIMappingLanguage.g:3081:2: rule__PortApiMapping__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__6"


    // $ANTLR start "rule__PortApiMapping__Group__6__Impl"
    // InternalAPIMappingLanguage.g:3087:1: rule__PortApiMapping__Group__6__Impl : ( '}' ) ;
    public final void rule__PortApiMapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3091:1: ( ( '}' ) )
            // InternalAPIMappingLanguage.g:3092:1: ( '}' )
            {
            // InternalAPIMappingLanguage.g:3092:1: ( '}' )
            // InternalAPIMappingLanguage.g:3093:1: '}'
            {
             before(grammarAccess.getPortApiMappingAccess().getRightCurlyBracketKeyword_6()); 
            match(input,48,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPortApiMappingAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__6__Impl"


    // $ANTLR start "rule__PortApiMapping__Group_5__0"
    // InternalAPIMappingLanguage.g:3120:1: rule__PortApiMapping__Group_5__0 : rule__PortApiMapping__Group_5__0__Impl rule__PortApiMapping__Group_5__1 ;
    public final void rule__PortApiMapping__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3124:1: ( rule__PortApiMapping__Group_5__0__Impl rule__PortApiMapping__Group_5__1 )
            // InternalAPIMappingLanguage.g:3125:2: rule__PortApiMapping__Group_5__0__Impl rule__PortApiMapping__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__PortApiMapping__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group_5__0"


    // $ANTLR start "rule__PortApiMapping__Group_5__0__Impl"
    // InternalAPIMappingLanguage.g:3132:1: rule__PortApiMapping__Group_5__0__Impl : ( 'initCommand:' ) ;
    public final void rule__PortApiMapping__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3136:1: ( ( 'initCommand:' ) )
            // InternalAPIMappingLanguage.g:3137:1: ( 'initCommand:' )
            {
            // InternalAPIMappingLanguage.g:3137:1: ( 'initCommand:' )
            // InternalAPIMappingLanguage.g:3138:1: 'initCommand:'
            {
             before(grammarAccess.getPortApiMappingAccess().getInitCommandKeyword_5_0()); 
            match(input,54,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPortApiMappingAccess().getInitCommandKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group_5__0__Impl"


    // $ANTLR start "rule__PortApiMapping__Group_5__1"
    // InternalAPIMappingLanguage.g:3151:1: rule__PortApiMapping__Group_5__1 : rule__PortApiMapping__Group_5__1__Impl ;
    public final void rule__PortApiMapping__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3155:1: ( rule__PortApiMapping__Group_5__1__Impl )
            // InternalAPIMappingLanguage.g:3156:2: rule__PortApiMapping__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group_5__1"


    // $ANTLR start "rule__PortApiMapping__Group_5__1__Impl"
    // InternalAPIMappingLanguage.g:3162:1: rule__PortApiMapping__Group_5__1__Impl : ( ( rule__PortApiMapping__InitCommandAssignment_5_1 ) ) ;
    public final void rule__PortApiMapping__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3166:1: ( ( ( rule__PortApiMapping__InitCommandAssignment_5_1 ) ) )
            // InternalAPIMappingLanguage.g:3167:1: ( ( rule__PortApiMapping__InitCommandAssignment_5_1 ) )
            {
            // InternalAPIMappingLanguage.g:3167:1: ( ( rule__PortApiMapping__InitCommandAssignment_5_1 ) )
            // InternalAPIMappingLanguage.g:3168:1: ( rule__PortApiMapping__InitCommandAssignment_5_1 )
            {
             before(grammarAccess.getPortApiMappingAccess().getInitCommandAssignment_5_1()); 
            // InternalAPIMappingLanguage.g:3169:1: ( rule__PortApiMapping__InitCommandAssignment_5_1 )
            // InternalAPIMappingLanguage.g:3169:2: rule__PortApiMapping__InitCommandAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__InitCommandAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPortApiMappingAccess().getInitCommandAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group_5__1__Impl"


    // $ANTLR start "rule__EnumerationValueExpression__Group__0"
    // InternalAPIMappingLanguage.g:3183:1: rule__EnumerationValueExpression__Group__0 : rule__EnumerationValueExpression__Group__0__Impl rule__EnumerationValueExpression__Group__1 ;
    public final void rule__EnumerationValueExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3187:1: ( rule__EnumerationValueExpression__Group__0__Impl rule__EnumerationValueExpression__Group__1 )
            // InternalAPIMappingLanguage.g:3188:2: rule__EnumerationValueExpression__Group__0__Impl rule__EnumerationValueExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__EnumerationValueExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationValueExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueExpression__Group__0"


    // $ANTLR start "rule__EnumerationValueExpression__Group__0__Impl"
    // InternalAPIMappingLanguage.g:3195:1: rule__EnumerationValueExpression__Group__0__Impl : ( 'enum:' ) ;
    public final void rule__EnumerationValueExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3199:1: ( ( 'enum:' ) )
            // InternalAPIMappingLanguage.g:3200:1: ( 'enum:' )
            {
            // InternalAPIMappingLanguage.g:3200:1: ( 'enum:' )
            // InternalAPIMappingLanguage.g:3201:1: 'enum:'
            {
             before(grammarAccess.getEnumerationValueExpressionAccess().getEnumKeyword_0()); 
            match(input,55,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumerationValueExpressionAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueExpression__Group__0__Impl"


    // $ANTLR start "rule__EnumerationValueExpression__Group__1"
    // InternalAPIMappingLanguage.g:3214:1: rule__EnumerationValueExpression__Group__1 : rule__EnumerationValueExpression__Group__1__Impl ;
    public final void rule__EnumerationValueExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3218:1: ( rule__EnumerationValueExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:3219:2: rule__EnumerationValueExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationValueExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueExpression__Group__1"


    // $ANTLR start "rule__EnumerationValueExpression__Group__1__Impl"
    // InternalAPIMappingLanguage.g:3225:1: rule__EnumerationValueExpression__Group__1__Impl : ( ( rule__EnumerationValueExpression__EnumValueAssignment_1 ) ) ;
    public final void rule__EnumerationValueExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3229:1: ( ( ( rule__EnumerationValueExpression__EnumValueAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:3230:1: ( ( rule__EnumerationValueExpression__EnumValueAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:3230:1: ( ( rule__EnumerationValueExpression__EnumValueAssignment_1 ) )
            // InternalAPIMappingLanguage.g:3231:1: ( rule__EnumerationValueExpression__EnumValueAssignment_1 )
            {
             before(grammarAccess.getEnumerationValueExpressionAccess().getEnumValueAssignment_1()); 
            // InternalAPIMappingLanguage.g:3232:1: ( rule__EnumerationValueExpression__EnumValueAssignment_1 )
            // InternalAPIMappingLanguage.g:3232:2: rule__EnumerationValueExpression__EnumValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationValueExpression__EnumValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueExpressionAccess().getEnumValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueExpression__Group__1__Impl"


    // $ANTLR start "rule__APICallExpression__Group__0"
    // InternalAPIMappingLanguage.g:3246:1: rule__APICallExpression__Group__0 : rule__APICallExpression__Group__0__Impl rule__APICallExpression__Group__1 ;
    public final void rule__APICallExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3250:1: ( rule__APICallExpression__Group__0__Impl rule__APICallExpression__Group__1 )
            // InternalAPIMappingLanguage.g:3251:2: rule__APICallExpression__Group__0__Impl rule__APICallExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__APICallExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group__0"


    // $ANTLR start "rule__APICallExpression__Group__0__Impl"
    // InternalAPIMappingLanguage.g:3258:1: rule__APICallExpression__Group__0__Impl : ( ( rule__APICallExpression__ApiCommandAssignment_0 ) ) ;
    public final void rule__APICallExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3262:1: ( ( ( rule__APICallExpression__ApiCommandAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:3263:1: ( ( rule__APICallExpression__ApiCommandAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:3263:1: ( ( rule__APICallExpression__ApiCommandAssignment_0 ) )
            // InternalAPIMappingLanguage.g:3264:1: ( rule__APICallExpression__ApiCommandAssignment_0 )
            {
             before(grammarAccess.getAPICallExpressionAccess().getApiCommandAssignment_0()); 
            // InternalAPIMappingLanguage.g:3265:1: ( rule__APICallExpression__ApiCommandAssignment_0 )
            // InternalAPIMappingLanguage.g:3265:2: rule__APICallExpression__ApiCommandAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__ApiCommandAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAPICallExpressionAccess().getApiCommandAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group__0__Impl"


    // $ANTLR start "rule__APICallExpression__Group__1"
    // InternalAPIMappingLanguage.g:3275:1: rule__APICallExpression__Group__1 : rule__APICallExpression__Group__1__Impl rule__APICallExpression__Group__2 ;
    public final void rule__APICallExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3279:1: ( rule__APICallExpression__Group__1__Impl rule__APICallExpression__Group__2 )
            // InternalAPIMappingLanguage.g:3280:2: rule__APICallExpression__Group__1__Impl rule__APICallExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__APICallExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group__1"


    // $ANTLR start "rule__APICallExpression__Group__1__Impl"
    // InternalAPIMappingLanguage.g:3287:1: rule__APICallExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__APICallExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3291:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:3292:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:3292:1: ( '(' )
            // InternalAPIMappingLanguage.g:3293:1: '('
            {
             before(grammarAccess.getAPICallExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,56,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAPICallExpressionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group__1__Impl"


    // $ANTLR start "rule__APICallExpression__Group__2"
    // InternalAPIMappingLanguage.g:3306:1: rule__APICallExpression__Group__2 : rule__APICallExpression__Group__2__Impl rule__APICallExpression__Group__3 ;
    public final void rule__APICallExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3310:1: ( rule__APICallExpression__Group__2__Impl rule__APICallExpression__Group__3 )
            // InternalAPIMappingLanguage.g:3311:2: rule__APICallExpression__Group__2__Impl rule__APICallExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__APICallExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group__2"


    // $ANTLR start "rule__APICallExpression__Group__2__Impl"
    // InternalAPIMappingLanguage.g:3318:1: rule__APICallExpression__Group__2__Impl : ( ( rule__APICallExpression__Group_2__0 )? ) ;
    public final void rule__APICallExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3322:1: ( ( ( rule__APICallExpression__Group_2__0 )? ) )
            // InternalAPIMappingLanguage.g:3323:1: ( ( rule__APICallExpression__Group_2__0 )? )
            {
            // InternalAPIMappingLanguage.g:3323:1: ( ( rule__APICallExpression__Group_2__0 )? )
            // InternalAPIMappingLanguage.g:3324:1: ( rule__APICallExpression__Group_2__0 )?
            {
             before(grammarAccess.getAPICallExpressionAccess().getGroup_2()); 
            // InternalAPIMappingLanguage.g:3325:1: ( rule__APICallExpression__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAPIMappingLanguage.g:3325:2: rule__APICallExpression__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__APICallExpression__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAPICallExpressionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group__2__Impl"


    // $ANTLR start "rule__APICallExpression__Group__3"
    // InternalAPIMappingLanguage.g:3335:1: rule__APICallExpression__Group__3 : rule__APICallExpression__Group__3__Impl ;
    public final void rule__APICallExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3339:1: ( rule__APICallExpression__Group__3__Impl )
            // InternalAPIMappingLanguage.g:3340:2: rule__APICallExpression__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group__3"


    // $ANTLR start "rule__APICallExpression__Group__3__Impl"
    // InternalAPIMappingLanguage.g:3346:1: rule__APICallExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__APICallExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3350:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:3351:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:3351:1: ( ')' )
            // InternalAPIMappingLanguage.g:3352:1: ')'
            {
             before(grammarAccess.getAPICallExpressionAccess().getRightParenthesisKeyword_3()); 
            match(input,57,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAPICallExpressionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group__3__Impl"


    // $ANTLR start "rule__APICallExpression__Group_2__0"
    // InternalAPIMappingLanguage.g:3373:1: rule__APICallExpression__Group_2__0 : rule__APICallExpression__Group_2__0__Impl rule__APICallExpression__Group_2__1 ;
    public final void rule__APICallExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3377:1: ( rule__APICallExpression__Group_2__0__Impl rule__APICallExpression__Group_2__1 )
            // InternalAPIMappingLanguage.g:3378:2: rule__APICallExpression__Group_2__0__Impl rule__APICallExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__APICallExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group_2__0"


    // $ANTLR start "rule__APICallExpression__Group_2__0__Impl"
    // InternalAPIMappingLanguage.g:3385:1: rule__APICallExpression__Group_2__0__Impl : ( ( rule__APICallExpression__ParameterBindingsAssignment_2_0 ) ) ;
    public final void rule__APICallExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3389:1: ( ( ( rule__APICallExpression__ParameterBindingsAssignment_2_0 ) ) )
            // InternalAPIMappingLanguage.g:3390:1: ( ( rule__APICallExpression__ParameterBindingsAssignment_2_0 ) )
            {
            // InternalAPIMappingLanguage.g:3390:1: ( ( rule__APICallExpression__ParameterBindingsAssignment_2_0 ) )
            // InternalAPIMappingLanguage.g:3391:1: ( rule__APICallExpression__ParameterBindingsAssignment_2_0 )
            {
             before(grammarAccess.getAPICallExpressionAccess().getParameterBindingsAssignment_2_0()); 
            // InternalAPIMappingLanguage.g:3392:1: ( rule__APICallExpression__ParameterBindingsAssignment_2_0 )
            // InternalAPIMappingLanguage.g:3392:2: rule__APICallExpression__ParameterBindingsAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__ParameterBindingsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAPICallExpressionAccess().getParameterBindingsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group_2__0__Impl"


    // $ANTLR start "rule__APICallExpression__Group_2__1"
    // InternalAPIMappingLanguage.g:3402:1: rule__APICallExpression__Group_2__1 : rule__APICallExpression__Group_2__1__Impl ;
    public final void rule__APICallExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3406:1: ( rule__APICallExpression__Group_2__1__Impl )
            // InternalAPIMappingLanguage.g:3407:2: rule__APICallExpression__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group_2__1"


    // $ANTLR start "rule__APICallExpression__Group_2__1__Impl"
    // InternalAPIMappingLanguage.g:3413:1: rule__APICallExpression__Group_2__1__Impl : ( ( rule__APICallExpression__Group_2_1__0 )* ) ;
    public final void rule__APICallExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3417:1: ( ( ( rule__APICallExpression__Group_2_1__0 )* ) )
            // InternalAPIMappingLanguage.g:3418:1: ( ( rule__APICallExpression__Group_2_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:3418:1: ( ( rule__APICallExpression__Group_2_1__0 )* )
            // InternalAPIMappingLanguage.g:3419:1: ( rule__APICallExpression__Group_2_1__0 )*
            {
             before(grammarAccess.getAPICallExpressionAccess().getGroup_2_1()); 
            // InternalAPIMappingLanguage.g:3420:1: ( rule__APICallExpression__Group_2_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==49) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:3420:2: rule__APICallExpression__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__APICallExpression__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getAPICallExpressionAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group_2__1__Impl"


    // $ANTLR start "rule__APICallExpression__Group_2_1__0"
    // InternalAPIMappingLanguage.g:3434:1: rule__APICallExpression__Group_2_1__0 : rule__APICallExpression__Group_2_1__0__Impl rule__APICallExpression__Group_2_1__1 ;
    public final void rule__APICallExpression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3438:1: ( rule__APICallExpression__Group_2_1__0__Impl rule__APICallExpression__Group_2_1__1 )
            // InternalAPIMappingLanguage.g:3439:2: rule__APICallExpression__Group_2_1__0__Impl rule__APICallExpression__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__APICallExpression__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group_2_1__0"


    // $ANTLR start "rule__APICallExpression__Group_2_1__0__Impl"
    // InternalAPIMappingLanguage.g:3446:1: rule__APICallExpression__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__APICallExpression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3450:1: ( ( ',' ) )
            // InternalAPIMappingLanguage.g:3451:1: ( ',' )
            {
            // InternalAPIMappingLanguage.g:3451:1: ( ',' )
            // InternalAPIMappingLanguage.g:3452:1: ','
            {
             before(grammarAccess.getAPICallExpressionAccess().getCommaKeyword_2_1_0()); 
            match(input,49,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAPICallExpressionAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group_2_1__0__Impl"


    // $ANTLR start "rule__APICallExpression__Group_2_1__1"
    // InternalAPIMappingLanguage.g:3465:1: rule__APICallExpression__Group_2_1__1 : rule__APICallExpression__Group_2_1__1__Impl ;
    public final void rule__APICallExpression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3469:1: ( rule__APICallExpression__Group_2_1__1__Impl )
            // InternalAPIMappingLanguage.g:3470:2: rule__APICallExpression__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group_2_1__1"


    // $ANTLR start "rule__APICallExpression__Group_2_1__1__Impl"
    // InternalAPIMappingLanguage.g:3476:1: rule__APICallExpression__Group_2_1__1__Impl : ( ( rule__APICallExpression__ParameterBindingsAssignment_2_1_1 ) ) ;
    public final void rule__APICallExpression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3480:1: ( ( ( rule__APICallExpression__ParameterBindingsAssignment_2_1_1 ) ) )
            // InternalAPIMappingLanguage.g:3481:1: ( ( rule__APICallExpression__ParameterBindingsAssignment_2_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:3481:1: ( ( rule__APICallExpression__ParameterBindingsAssignment_2_1_1 ) )
            // InternalAPIMappingLanguage.g:3482:1: ( rule__APICallExpression__ParameterBindingsAssignment_2_1_1 )
            {
             before(grammarAccess.getAPICallExpressionAccess().getParameterBindingsAssignment_2_1_1()); 
            // InternalAPIMappingLanguage.g:3483:1: ( rule__APICallExpression__ParameterBindingsAssignment_2_1_1 )
            // InternalAPIMappingLanguage.g:3483:2: rule__APICallExpression__ParameterBindingsAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__ParameterBindingsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAPICallExpressionAccess().getParameterBindingsAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group_2_1__1__Impl"


    // $ANTLR start "rule__ParamaterBinding__Group__0"
    // InternalAPIMappingLanguage.g:3497:1: rule__ParamaterBinding__Group__0 : rule__ParamaterBinding__Group__0__Impl rule__ParamaterBinding__Group__1 ;
    public final void rule__ParamaterBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3501:1: ( rule__ParamaterBinding__Group__0__Impl rule__ParamaterBinding__Group__1 )
            // InternalAPIMappingLanguage.g:3502:2: rule__ParamaterBinding__Group__0__Impl rule__ParamaterBinding__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
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
    // InternalAPIMappingLanguage.g:3509:1: rule__ParamaterBinding__Group__0__Impl : ( () ) ;
    public final void rule__ParamaterBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3513:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:3514:1: ( () )
            {
            // InternalAPIMappingLanguage.g:3514:1: ( () )
            // InternalAPIMappingLanguage.g:3515:1: ()
            {
             before(grammarAccess.getParamaterBindingAccess().getParameterBindingAction_0()); 
            // InternalAPIMappingLanguage.g:3516:1: ()
            // InternalAPIMappingLanguage.g:3518:1: 
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
    // InternalAPIMappingLanguage.g:3528:1: rule__ParamaterBinding__Group__1 : rule__ParamaterBinding__Group__1__Impl rule__ParamaterBinding__Group__2 ;
    public final void rule__ParamaterBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3532:1: ( rule__ParamaterBinding__Group__1__Impl rule__ParamaterBinding__Group__2 )
            // InternalAPIMappingLanguage.g:3533:2: rule__ParamaterBinding__Group__1__Impl rule__ParamaterBinding__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalAPIMappingLanguage.g:3540:1: rule__ParamaterBinding__Group__1__Impl : ( ( rule__ParamaterBinding__ParameterAssignment_1 ) ) ;
    public final void rule__ParamaterBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3544:1: ( ( ( rule__ParamaterBinding__ParameterAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:3545:1: ( ( rule__ParamaterBinding__ParameterAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:3545:1: ( ( rule__ParamaterBinding__ParameterAssignment_1 ) )
            // InternalAPIMappingLanguage.g:3546:1: ( rule__ParamaterBinding__ParameterAssignment_1 )
            {
             before(grammarAccess.getParamaterBindingAccess().getParameterAssignment_1()); 
            // InternalAPIMappingLanguage.g:3547:1: ( rule__ParamaterBinding__ParameterAssignment_1 )
            // InternalAPIMappingLanguage.g:3547:2: rule__ParamaterBinding__ParameterAssignment_1
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
    // InternalAPIMappingLanguage.g:3557:1: rule__ParamaterBinding__Group__2 : rule__ParamaterBinding__Group__2__Impl rule__ParamaterBinding__Group__3 ;
    public final void rule__ParamaterBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3561:1: ( rule__ParamaterBinding__Group__2__Impl rule__ParamaterBinding__Group__3 )
            // InternalAPIMappingLanguage.g:3562:2: rule__ParamaterBinding__Group__2__Impl rule__ParamaterBinding__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalAPIMappingLanguage.g:3569:1: rule__ParamaterBinding__Group__2__Impl : ( ':=' ) ;
    public final void rule__ParamaterBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3573:1: ( ( ':=' ) )
            // InternalAPIMappingLanguage.g:3574:1: ( ':=' )
            {
            // InternalAPIMappingLanguage.g:3574:1: ( ':=' )
            // InternalAPIMappingLanguage.g:3575:1: ':='
            {
             before(grammarAccess.getParamaterBindingAccess().getColonEqualsSignKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:3588:1: rule__ParamaterBinding__Group__3 : rule__ParamaterBinding__Group__3__Impl ;
    public final void rule__ParamaterBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3592:1: ( rule__ParamaterBinding__Group__3__Impl )
            // InternalAPIMappingLanguage.g:3593:2: rule__ParamaterBinding__Group__3__Impl
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
    // InternalAPIMappingLanguage.g:3599:1: rule__ParamaterBinding__Group__3__Impl : ( ( rule__ParamaterBinding__ValueAssignment_3 ) ) ;
    public final void rule__ParamaterBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3603:1: ( ( ( rule__ParamaterBinding__ValueAssignment_3 ) ) )
            // InternalAPIMappingLanguage.g:3604:1: ( ( rule__ParamaterBinding__ValueAssignment_3 ) )
            {
            // InternalAPIMappingLanguage.g:3604:1: ( ( rule__ParamaterBinding__ValueAssignment_3 ) )
            // InternalAPIMappingLanguage.g:3605:1: ( rule__ParamaterBinding__ValueAssignment_3 )
            {
             before(grammarAccess.getParamaterBindingAccess().getValueAssignment_3()); 
            // InternalAPIMappingLanguage.g:3606:1: ( rule__ParamaterBinding__ValueAssignment_3 )
            // InternalAPIMappingLanguage.g:3606:2: rule__ParamaterBinding__ValueAssignment_3
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


    // $ANTLR start "rule__Operand__Group_0__0"
    // InternalAPIMappingLanguage.g:3625:1: rule__Operand__Group_0__0 : rule__Operand__Group_0__0__Impl rule__Operand__Group_0__1 ;
    public final void rule__Operand__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3629:1: ( rule__Operand__Group_0__0__Impl rule__Operand__Group_0__1 )
            // InternalAPIMappingLanguage.g:3630:2: rule__Operand__Group_0__0__Impl rule__Operand__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalAPIMappingLanguage.g:3637:1: rule__Operand__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Operand__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3641:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:3642:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:3642:1: ( '(' )
            // InternalAPIMappingLanguage.g:3643:1: '('
            {
             before(grammarAccess.getOperandAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,56,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:3656:1: rule__Operand__Group_0__1 : rule__Operand__Group_0__1__Impl rule__Operand__Group_0__2 ;
    public final void rule__Operand__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3660:1: ( rule__Operand__Group_0__1__Impl rule__Operand__Group_0__2 )
            // InternalAPIMappingLanguage.g:3661:2: rule__Operand__Group_0__1__Impl rule__Operand__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_21);
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
    // InternalAPIMappingLanguage.g:3668:1: rule__Operand__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Operand__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3672:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:3673:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:3673:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:3674:1: ruleExpression
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
    // InternalAPIMappingLanguage.g:3685:1: rule__Operand__Group_0__2 : rule__Operand__Group_0__2__Impl ;
    public final void rule__Operand__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3689:1: ( rule__Operand__Group_0__2__Impl )
            // InternalAPIMappingLanguage.g:3690:2: rule__Operand__Group_0__2__Impl
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
    // InternalAPIMappingLanguage.g:3696:1: rule__Operand__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Operand__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3700:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:3701:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:3701:1: ( ')' )
            // InternalAPIMappingLanguage.g:3702:1: ')'
            {
             before(grammarAccess.getOperandAccess().getRightParenthesisKeyword_0_2()); 
            match(input,57,FollowSets000.FOLLOW_2); 
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


    // $ANTLR start "rule__APICallStatement__Group__0"
    // InternalAPIMappingLanguage.g:3721:1: rule__APICallStatement__Group__0 : rule__APICallStatement__Group__0__Impl rule__APICallStatement__Group__1 ;
    public final void rule__APICallStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3725:1: ( rule__APICallStatement__Group__0__Impl rule__APICallStatement__Group__1 )
            // InternalAPIMappingLanguage.g:3726:2: rule__APICallStatement__Group__0__Impl rule__APICallStatement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__APICallStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallStatement__Group__0"


    // $ANTLR start "rule__APICallStatement__Group__0__Impl"
    // InternalAPIMappingLanguage.g:3733:1: rule__APICallStatement__Group__0__Impl : ( ruleAPICallExpression ) ;
    public final void rule__APICallStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3737:1: ( ( ruleAPICallExpression ) )
            // InternalAPIMappingLanguage.g:3738:1: ( ruleAPICallExpression )
            {
            // InternalAPIMappingLanguage.g:3738:1: ( ruleAPICallExpression )
            // InternalAPIMappingLanguage.g:3739:1: ruleAPICallExpression
            {
             before(grammarAccess.getAPICallStatementAccess().getAPICallExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAPICallExpression();

            state._fsp--;

             after(grammarAccess.getAPICallStatementAccess().getAPICallExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallStatement__Group__0__Impl"


    // $ANTLR start "rule__APICallStatement__Group__1"
    // InternalAPIMappingLanguage.g:3750:1: rule__APICallStatement__Group__1 : rule__APICallStatement__Group__1__Impl ;
    public final void rule__APICallStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3754:1: ( rule__APICallStatement__Group__1__Impl )
            // InternalAPIMappingLanguage.g:3755:2: rule__APICallStatement__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallStatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallStatement__Group__1"


    // $ANTLR start "rule__APICallStatement__Group__1__Impl"
    // InternalAPIMappingLanguage.g:3761:1: rule__APICallStatement__Group__1__Impl : ( ';' ) ;
    public final void rule__APICallStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3765:1: ( ( ';' ) )
            // InternalAPIMappingLanguage.g:3766:1: ( ';' )
            {
            // InternalAPIMappingLanguage.g:3766:1: ( ';' )
            // InternalAPIMappingLanguage.g:3767:1: ';'
            {
             before(grammarAccess.getAPICallStatementAccess().getSemicolonKeyword_1()); 
            match(input,58,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAPICallStatementAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallStatement__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalAPIMappingLanguage.g:3784:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3788:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAPIMappingLanguage.g:3789:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalAPIMappingLanguage.g:3796:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3800:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:3801:1: ( RULE_ID )
            {
            // InternalAPIMappingLanguage.g:3801:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:3802:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalAPIMappingLanguage.g:3813:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3817:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAPIMappingLanguage.g:3818:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalAPIMappingLanguage.g:3824:1: rule__QualifiedName__Group__1__Impl : ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3828:1: ( ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) ) )
            // InternalAPIMappingLanguage.g:3829:1: ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) )
            {
            // InternalAPIMappingLanguage.g:3829:1: ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAPIMappingLanguage.g:3830:1: ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:3830:1: ( ( rule__QualifiedName__Group_1__0 ) )
            // InternalAPIMappingLanguage.g:3831:1: ( rule__QualifiedName__Group_1__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:3832:1: ( rule__QualifiedName__Group_1__0 )
            // InternalAPIMappingLanguage.g:3832:2: rule__QualifiedName__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__QualifiedName__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }

            // InternalAPIMappingLanguage.g:3835:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAPIMappingLanguage.g:3836:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:3837:1: ( rule__QualifiedName__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==59) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:3837:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalAPIMappingLanguage.g:3852:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3856:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAPIMappingLanguage.g:3857:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalAPIMappingLanguage.g:3864:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3868:1: ( ( '.' ) )
            // InternalAPIMappingLanguage.g:3869:1: ( '.' )
            {
            // InternalAPIMappingLanguage.g:3869:1: ( '.' )
            // InternalAPIMappingLanguage.g:3870:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,59,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalAPIMappingLanguage.g:3883:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3887:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAPIMappingLanguage.g:3888:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalAPIMappingLanguage.g:3894:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3898:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:3899:1: ( RULE_ID )
            {
            // InternalAPIMappingLanguage.g:3899:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:3900:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalAPIMappingLanguage.g:3915:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3919:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalAPIMappingLanguage.g:3920:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalAPIMappingLanguage.g:3927:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3931:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:3932:1: ( () )
            {
            // InternalAPIMappingLanguage.g:3932:1: ( () )
            // InternalAPIMappingLanguage.g:3933:1: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // InternalAPIMappingLanguage.g:3934:1: ()
            // InternalAPIMappingLanguage.g:3936:1: 
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
    // InternalAPIMappingLanguage.g:3946:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3950:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalAPIMappingLanguage.g:3951:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalAPIMappingLanguage.g:3958:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3962:1: ( ( '{' ) )
            // InternalAPIMappingLanguage.g:3963:1: ( '{' )
            {
            // InternalAPIMappingLanguage.g:3963:1: ( '{' )
            // InternalAPIMappingLanguage.g:3964:1: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,47,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:3977:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3981:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalAPIMappingLanguage.g:3982:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_25);
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
    // InternalAPIMappingLanguage.g:3989:1: rule__Block__Group__2__Impl : ( ( rule__Block__ExpressionsAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3993:1: ( ( ( rule__Block__ExpressionsAssignment_2 )* ) )
            // InternalAPIMappingLanguage.g:3994:1: ( ( rule__Block__ExpressionsAssignment_2 )* )
            {
            // InternalAPIMappingLanguage.g:3994:1: ( ( rule__Block__ExpressionsAssignment_2 )* )
            // InternalAPIMappingLanguage.g:3995:1: ( rule__Block__ExpressionsAssignment_2 )*
            {
             before(grammarAccess.getBlockAccess().getExpressionsAssignment_2()); 
            // InternalAPIMappingLanguage.g:3996:1: ( rule__Block__ExpressionsAssignment_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||(LA34_0>=60 && LA34_0<=62)||LA34_0==64||LA34_0==70) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:3996:2: rule__Block__ExpressionsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    rule__Block__ExpressionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalAPIMappingLanguage.g:4006:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4010:1: ( rule__Block__Group__3__Impl )
            // InternalAPIMappingLanguage.g:4011:2: rule__Block__Group__3__Impl
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
    // InternalAPIMappingLanguage.g:4017:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4021:1: ( ( '}' ) )
            // InternalAPIMappingLanguage.g:4022:1: ( '}' )
            {
            // InternalAPIMappingLanguage.g:4022:1: ( '}' )
            // InternalAPIMappingLanguage.g:4023:1: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,48,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4044:1: rule__ForLoop__Group__0 : rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 ;
    public final void rule__ForLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4048:1: ( rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 )
            // InternalAPIMappingLanguage.g:4049:2: rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalAPIMappingLanguage.g:4056:1: rule__ForLoop__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4060:1: ( ( 'for' ) )
            // InternalAPIMappingLanguage.g:4061:1: ( 'for' )
            {
            // InternalAPIMappingLanguage.g:4061:1: ( 'for' )
            // InternalAPIMappingLanguage.g:4062:1: 'for'
            {
             before(grammarAccess.getForLoopAccess().getForKeyword_0()); 
            match(input,60,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4075:1: rule__ForLoop__Group__1 : rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 ;
    public final void rule__ForLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4079:1: ( rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 )
            // InternalAPIMappingLanguage.g:4080:2: rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
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
    // InternalAPIMappingLanguage.g:4087:1: rule__ForLoop__Group__1__Impl : ( '(' ) ;
    public final void rule__ForLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4091:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:4092:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:4092:1: ( '(' )
            // InternalAPIMappingLanguage.g:4093:1: '('
            {
             before(grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1()); 
            match(input,56,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4106:1: rule__ForLoop__Group__2 : rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 ;
    public final void rule__ForLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4110:1: ( rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 )
            // InternalAPIMappingLanguage.g:4111:2: rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalAPIMappingLanguage.g:4118:1: rule__ForLoop__Group__2__Impl : ( ( rule__ForLoop__InitializeExpressionAssignment_2 ) ) ;
    public final void rule__ForLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4122:1: ( ( ( rule__ForLoop__InitializeExpressionAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:4123:1: ( ( rule__ForLoop__InitializeExpressionAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:4123:1: ( ( rule__ForLoop__InitializeExpressionAssignment_2 ) )
            // InternalAPIMappingLanguage.g:4124:1: ( rule__ForLoop__InitializeExpressionAssignment_2 )
            {
             before(grammarAccess.getForLoopAccess().getInitializeExpressionAssignment_2()); 
            // InternalAPIMappingLanguage.g:4125:1: ( rule__ForLoop__InitializeExpressionAssignment_2 )
            // InternalAPIMappingLanguage.g:4125:2: rule__ForLoop__InitializeExpressionAssignment_2
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
    // InternalAPIMappingLanguage.g:4135:1: rule__ForLoop__Group__3 : rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 ;
    public final void rule__ForLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4139:1: ( rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 )
            // InternalAPIMappingLanguage.g:4140:2: rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_22);
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
    // InternalAPIMappingLanguage.g:4147:1: rule__ForLoop__Group__3__Impl : ( ( rule__ForLoop__LoopTestAssignment_3 ) ) ;
    public final void rule__ForLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4151:1: ( ( ( rule__ForLoop__LoopTestAssignment_3 ) ) )
            // InternalAPIMappingLanguage.g:4152:1: ( ( rule__ForLoop__LoopTestAssignment_3 ) )
            {
            // InternalAPIMappingLanguage.g:4152:1: ( ( rule__ForLoop__LoopTestAssignment_3 ) )
            // InternalAPIMappingLanguage.g:4153:1: ( rule__ForLoop__LoopTestAssignment_3 )
            {
             before(grammarAccess.getForLoopAccess().getLoopTestAssignment_3()); 
            // InternalAPIMappingLanguage.g:4154:1: ( rule__ForLoop__LoopTestAssignment_3 )
            // InternalAPIMappingLanguage.g:4154:2: rule__ForLoop__LoopTestAssignment_3
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
    // InternalAPIMappingLanguage.g:4164:1: rule__ForLoop__Group__4 : rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 ;
    public final void rule__ForLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4168:1: ( rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 )
            // InternalAPIMappingLanguage.g:4169:2: rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_5);
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
    // InternalAPIMappingLanguage.g:4176:1: rule__ForLoop__Group__4__Impl : ( ';' ) ;
    public final void rule__ForLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4180:1: ( ( ';' ) )
            // InternalAPIMappingLanguage.g:4181:1: ( ';' )
            {
            // InternalAPIMappingLanguage.g:4181:1: ( ';' )
            // InternalAPIMappingLanguage.g:4182:1: ';'
            {
             before(grammarAccess.getForLoopAccess().getSemicolonKeyword_4()); 
            match(input,58,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4195:1: rule__ForLoop__Group__5 : rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 ;
    public final void rule__ForLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4199:1: ( rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 )
            // InternalAPIMappingLanguage.g:4200:2: rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_21);
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
    // InternalAPIMappingLanguage.g:4207:1: rule__ForLoop__Group__5__Impl : ( ( rule__ForLoop__CountingExpressionAssignment_5 ) ) ;
    public final void rule__ForLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4211:1: ( ( ( rule__ForLoop__CountingExpressionAssignment_5 ) ) )
            // InternalAPIMappingLanguage.g:4212:1: ( ( rule__ForLoop__CountingExpressionAssignment_5 ) )
            {
            // InternalAPIMappingLanguage.g:4212:1: ( ( rule__ForLoop__CountingExpressionAssignment_5 ) )
            // InternalAPIMappingLanguage.g:4213:1: ( rule__ForLoop__CountingExpressionAssignment_5 )
            {
             before(grammarAccess.getForLoopAccess().getCountingExpressionAssignment_5()); 
            // InternalAPIMappingLanguage.g:4214:1: ( rule__ForLoop__CountingExpressionAssignment_5 )
            // InternalAPIMappingLanguage.g:4214:2: rule__ForLoop__CountingExpressionAssignment_5
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
    // InternalAPIMappingLanguage.g:4224:1: rule__ForLoop__Group__6 : rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7 ;
    public final void rule__ForLoop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4228:1: ( rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7 )
            // InternalAPIMappingLanguage.g:4229:2: rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalAPIMappingLanguage.g:4236:1: rule__ForLoop__Group__6__Impl : ( ')' ) ;
    public final void rule__ForLoop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4240:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:4241:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:4241:1: ( ')' )
            // InternalAPIMappingLanguage.g:4242:1: ')'
            {
             before(grammarAccess.getForLoopAccess().getRightParenthesisKeyword_6()); 
            match(input,57,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4255:1: rule__ForLoop__Group__7 : rule__ForLoop__Group__7__Impl ;
    public final void rule__ForLoop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4259:1: ( rule__ForLoop__Group__7__Impl )
            // InternalAPIMappingLanguage.g:4260:2: rule__ForLoop__Group__7__Impl
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
    // InternalAPIMappingLanguage.g:4266:1: rule__ForLoop__Group__7__Impl : ( ( rule__ForLoop__BlockAssignment_7 ) ) ;
    public final void rule__ForLoop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4270:1: ( ( ( rule__ForLoop__BlockAssignment_7 ) ) )
            // InternalAPIMappingLanguage.g:4271:1: ( ( rule__ForLoop__BlockAssignment_7 ) )
            {
            // InternalAPIMappingLanguage.g:4271:1: ( ( rule__ForLoop__BlockAssignment_7 ) )
            // InternalAPIMappingLanguage.g:4272:1: ( rule__ForLoop__BlockAssignment_7 )
            {
             before(grammarAccess.getForLoopAccess().getBlockAssignment_7()); 
            // InternalAPIMappingLanguage.g:4273:1: ( rule__ForLoop__BlockAssignment_7 )
            // InternalAPIMappingLanguage.g:4273:2: rule__ForLoop__BlockAssignment_7
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
    // InternalAPIMappingLanguage.g:4299:1: rule__ForLoopCountingExpression__Group__0 : rule__ForLoopCountingExpression__Group__0__Impl rule__ForLoopCountingExpression__Group__1 ;
    public final void rule__ForLoopCountingExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4303:1: ( rule__ForLoopCountingExpression__Group__0__Impl rule__ForLoopCountingExpression__Group__1 )
            // InternalAPIMappingLanguage.g:4304:2: rule__ForLoopCountingExpression__Group__0__Impl rule__ForLoopCountingExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
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
    // InternalAPIMappingLanguage.g:4311:1: rule__ForLoopCountingExpression__Group__0__Impl : ( ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 ) ) ;
    public final void rule__ForLoopCountingExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4315:1: ( ( ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:4316:1: ( ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:4316:1: ( ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 ) )
            // InternalAPIMappingLanguage.g:4317:1: ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getLhs_typedNamedElementExpressionAssignment_0()); 
            // InternalAPIMappingLanguage.g:4318:1: ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 )
            // InternalAPIMappingLanguage.g:4318:2: rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0
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
    // InternalAPIMappingLanguage.g:4328:1: rule__ForLoopCountingExpression__Group__1 : rule__ForLoopCountingExpression__Group__1__Impl ;
    public final void rule__ForLoopCountingExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4332:1: ( rule__ForLoopCountingExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:4333:2: rule__ForLoopCountingExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:4339:1: rule__ForLoopCountingExpression__Group__1__Impl : ( ( rule__ForLoopCountingExpression__Alternatives_1 ) ) ;
    public final void rule__ForLoopCountingExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4343:1: ( ( ( rule__ForLoopCountingExpression__Alternatives_1 ) ) )
            // InternalAPIMappingLanguage.g:4344:1: ( ( rule__ForLoopCountingExpression__Alternatives_1 ) )
            {
            // InternalAPIMappingLanguage.g:4344:1: ( ( rule__ForLoopCountingExpression__Alternatives_1 ) )
            // InternalAPIMappingLanguage.g:4345:1: ( rule__ForLoopCountingExpression__Alternatives_1 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getAlternatives_1()); 
            // InternalAPIMappingLanguage.g:4346:1: ( rule__ForLoopCountingExpression__Alternatives_1 )
            // InternalAPIMappingLanguage.g:4346:2: rule__ForLoopCountingExpression__Alternatives_1
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
    // InternalAPIMappingLanguage.g:4360:1: rule__ForLoopCountingExpression__Group_1_1__0 : rule__ForLoopCountingExpression__Group_1_1__0__Impl rule__ForLoopCountingExpression__Group_1_1__1 ;
    public final void rule__ForLoopCountingExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4364:1: ( rule__ForLoopCountingExpression__Group_1_1__0__Impl rule__ForLoopCountingExpression__Group_1_1__1 )
            // InternalAPIMappingLanguage.g:4365:2: rule__ForLoopCountingExpression__Group_1_1__0__Impl rule__ForLoopCountingExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalAPIMappingLanguage.g:4372:1: rule__ForLoopCountingExpression__Group_1_1__0__Impl : ( ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 ) ) ;
    public final void rule__ForLoopCountingExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4376:1: ( ( ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 ) ) )
            // InternalAPIMappingLanguage.g:4377:1: ( ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 ) )
            {
            // InternalAPIMappingLanguage.g:4377:1: ( ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 ) )
            // InternalAPIMappingLanguage.g:4378:1: ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignment_1_1_0()); 
            // InternalAPIMappingLanguage.g:4379:1: ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 )
            // InternalAPIMappingLanguage.g:4379:2: rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0
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
    // InternalAPIMappingLanguage.g:4389:1: rule__ForLoopCountingExpression__Group_1_1__1 : rule__ForLoopCountingExpression__Group_1_1__1__Impl ;
    public final void rule__ForLoopCountingExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4393:1: ( rule__ForLoopCountingExpression__Group_1_1__1__Impl )
            // InternalAPIMappingLanguage.g:4394:2: rule__ForLoopCountingExpression__Group_1_1__1__Impl
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
    // InternalAPIMappingLanguage.g:4400:1: rule__ForLoopCountingExpression__Group_1_1__1__Impl : ( ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 ) ) ;
    public final void rule__ForLoopCountingExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4404:1: ( ( ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 ) ) )
            // InternalAPIMappingLanguage.g:4405:1: ( ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:4405:1: ( ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 ) )
            // InternalAPIMappingLanguage.g:4406:1: ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getRhs_assignExpressionAssignment_1_1_1()); 
            // InternalAPIMappingLanguage.g:4407:1: ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 )
            // InternalAPIMappingLanguage.g:4407:2: rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1
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
    // InternalAPIMappingLanguage.g:4421:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4425:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalAPIMappingLanguage.g:4426:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalAPIMappingLanguage.g:4433:1: rule__WhileLoop__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4437:1: ( ( 'while' ) )
            // InternalAPIMappingLanguage.g:4438:1: ( 'while' )
            {
            // InternalAPIMappingLanguage.g:4438:1: ( 'while' )
            // InternalAPIMappingLanguage.g:4439:1: 'while'
            {
             before(grammarAccess.getWhileLoopAccess().getWhileKeyword_0()); 
            match(input,61,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4452:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4456:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalAPIMappingLanguage.g:4457:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalAPIMappingLanguage.g:4464:1: rule__WhileLoop__Group__1__Impl : ( '(' ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4468:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:4469:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:4469:1: ( '(' )
            // InternalAPIMappingLanguage.g:4470:1: '('
            {
             before(grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1()); 
            match(input,56,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4483:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4487:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalAPIMappingLanguage.g:4488:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_21);
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
    // InternalAPIMappingLanguage.g:4495:1: rule__WhileLoop__Group__2__Impl : ( ( rule__WhileLoop__LoopTestAssignment_2 ) ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4499:1: ( ( ( rule__WhileLoop__LoopTestAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:4500:1: ( ( rule__WhileLoop__LoopTestAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:4500:1: ( ( rule__WhileLoop__LoopTestAssignment_2 ) )
            // InternalAPIMappingLanguage.g:4501:1: ( rule__WhileLoop__LoopTestAssignment_2 )
            {
             before(grammarAccess.getWhileLoopAccess().getLoopTestAssignment_2()); 
            // InternalAPIMappingLanguage.g:4502:1: ( rule__WhileLoop__LoopTestAssignment_2 )
            // InternalAPIMappingLanguage.g:4502:2: rule__WhileLoop__LoopTestAssignment_2
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
    // InternalAPIMappingLanguage.g:4512:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4516:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalAPIMappingLanguage.g:4517:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalAPIMappingLanguage.g:4524:1: rule__WhileLoop__Group__3__Impl : ( ')' ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4528:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:4529:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:4529:1: ( ')' )
            // InternalAPIMappingLanguage.g:4530:1: ')'
            {
             before(grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_3()); 
            match(input,57,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4543:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4547:1: ( rule__WhileLoop__Group__4__Impl )
            // InternalAPIMappingLanguage.g:4548:2: rule__WhileLoop__Group__4__Impl
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
    // InternalAPIMappingLanguage.g:4554:1: rule__WhileLoop__Group__4__Impl : ( ( rule__WhileLoop__BlockAssignment_4 ) ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4558:1: ( ( ( rule__WhileLoop__BlockAssignment_4 ) ) )
            // InternalAPIMappingLanguage.g:4559:1: ( ( rule__WhileLoop__BlockAssignment_4 ) )
            {
            // InternalAPIMappingLanguage.g:4559:1: ( ( rule__WhileLoop__BlockAssignment_4 ) )
            // InternalAPIMappingLanguage.g:4560:1: ( rule__WhileLoop__BlockAssignment_4 )
            {
             before(grammarAccess.getWhileLoopAccess().getBlockAssignment_4()); 
            // InternalAPIMappingLanguage.g:4561:1: ( rule__WhileLoop__BlockAssignment_4 )
            // InternalAPIMappingLanguage.g:4561:2: rule__WhileLoop__BlockAssignment_4
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
    // InternalAPIMappingLanguage.g:4581:1: rule__DoWhileLoop__Group__0 : rule__DoWhileLoop__Group__0__Impl rule__DoWhileLoop__Group__1 ;
    public final void rule__DoWhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4585:1: ( rule__DoWhileLoop__Group__0__Impl rule__DoWhileLoop__Group__1 )
            // InternalAPIMappingLanguage.g:4586:2: rule__DoWhileLoop__Group__0__Impl rule__DoWhileLoop__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalAPIMappingLanguage.g:4593:1: rule__DoWhileLoop__Group__0__Impl : ( 'do' ) ;
    public final void rule__DoWhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4597:1: ( ( 'do' ) )
            // InternalAPIMappingLanguage.g:4598:1: ( 'do' )
            {
            // InternalAPIMappingLanguage.g:4598:1: ( 'do' )
            // InternalAPIMappingLanguage.g:4599:1: 'do'
            {
             before(grammarAccess.getDoWhileLoopAccess().getDoKeyword_0()); 
            match(input,62,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4612:1: rule__DoWhileLoop__Group__1 : rule__DoWhileLoop__Group__1__Impl rule__DoWhileLoop__Group__2 ;
    public final void rule__DoWhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4616:1: ( rule__DoWhileLoop__Group__1__Impl rule__DoWhileLoop__Group__2 )
            // InternalAPIMappingLanguage.g:4617:2: rule__DoWhileLoop__Group__1__Impl rule__DoWhileLoop__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalAPIMappingLanguage.g:4624:1: rule__DoWhileLoop__Group__1__Impl : ( ( rule__DoWhileLoop__BlockAssignment_1 ) ) ;
    public final void rule__DoWhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4628:1: ( ( ( rule__DoWhileLoop__BlockAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:4629:1: ( ( rule__DoWhileLoop__BlockAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:4629:1: ( ( rule__DoWhileLoop__BlockAssignment_1 ) )
            // InternalAPIMappingLanguage.g:4630:1: ( rule__DoWhileLoop__BlockAssignment_1 )
            {
             before(grammarAccess.getDoWhileLoopAccess().getBlockAssignment_1()); 
            // InternalAPIMappingLanguage.g:4631:1: ( rule__DoWhileLoop__BlockAssignment_1 )
            // InternalAPIMappingLanguage.g:4631:2: rule__DoWhileLoop__BlockAssignment_1
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
    // InternalAPIMappingLanguage.g:4641:1: rule__DoWhileLoop__Group__2 : rule__DoWhileLoop__Group__2__Impl rule__DoWhileLoop__Group__3 ;
    public final void rule__DoWhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4645:1: ( rule__DoWhileLoop__Group__2__Impl rule__DoWhileLoop__Group__3 )
            // InternalAPIMappingLanguage.g:4646:2: rule__DoWhileLoop__Group__2__Impl rule__DoWhileLoop__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalAPIMappingLanguage.g:4653:1: rule__DoWhileLoop__Group__2__Impl : ( 'while' ) ;
    public final void rule__DoWhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4657:1: ( ( 'while' ) )
            // InternalAPIMappingLanguage.g:4658:1: ( 'while' )
            {
            // InternalAPIMappingLanguage.g:4658:1: ( 'while' )
            // InternalAPIMappingLanguage.g:4659:1: 'while'
            {
             before(grammarAccess.getDoWhileLoopAccess().getWhileKeyword_2()); 
            match(input,61,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4672:1: rule__DoWhileLoop__Group__3 : rule__DoWhileLoop__Group__3__Impl rule__DoWhileLoop__Group__4 ;
    public final void rule__DoWhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4676:1: ( rule__DoWhileLoop__Group__3__Impl rule__DoWhileLoop__Group__4 )
            // InternalAPIMappingLanguage.g:4677:2: rule__DoWhileLoop__Group__3__Impl rule__DoWhileLoop__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalAPIMappingLanguage.g:4684:1: rule__DoWhileLoop__Group__3__Impl : ( '(' ) ;
    public final void rule__DoWhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4688:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:4689:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:4689:1: ( '(' )
            // InternalAPIMappingLanguage.g:4690:1: '('
            {
             before(grammarAccess.getDoWhileLoopAccess().getLeftParenthesisKeyword_3()); 
            match(input,56,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4703:1: rule__DoWhileLoop__Group__4 : rule__DoWhileLoop__Group__4__Impl rule__DoWhileLoop__Group__5 ;
    public final void rule__DoWhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4707:1: ( rule__DoWhileLoop__Group__4__Impl rule__DoWhileLoop__Group__5 )
            // InternalAPIMappingLanguage.g:4708:2: rule__DoWhileLoop__Group__4__Impl rule__DoWhileLoop__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_29);
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
    // InternalAPIMappingLanguage.g:4715:1: rule__DoWhileLoop__Group__4__Impl : ( ( rule__DoWhileLoop__LoopTestAssignment_4 ) ) ;
    public final void rule__DoWhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4719:1: ( ( ( rule__DoWhileLoop__LoopTestAssignment_4 ) ) )
            // InternalAPIMappingLanguage.g:4720:1: ( ( rule__DoWhileLoop__LoopTestAssignment_4 ) )
            {
            // InternalAPIMappingLanguage.g:4720:1: ( ( rule__DoWhileLoop__LoopTestAssignment_4 ) )
            // InternalAPIMappingLanguage.g:4721:1: ( rule__DoWhileLoop__LoopTestAssignment_4 )
            {
             before(grammarAccess.getDoWhileLoopAccess().getLoopTestAssignment_4()); 
            // InternalAPIMappingLanguage.g:4722:1: ( rule__DoWhileLoop__LoopTestAssignment_4 )
            // InternalAPIMappingLanguage.g:4722:2: rule__DoWhileLoop__LoopTestAssignment_4
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
    // InternalAPIMappingLanguage.g:4732:1: rule__DoWhileLoop__Group__5 : rule__DoWhileLoop__Group__5__Impl ;
    public final void rule__DoWhileLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4736:1: ( rule__DoWhileLoop__Group__5__Impl )
            // InternalAPIMappingLanguage.g:4737:2: rule__DoWhileLoop__Group__5__Impl
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
    // InternalAPIMappingLanguage.g:4743:1: rule__DoWhileLoop__Group__5__Impl : ( ');' ) ;
    public final void rule__DoWhileLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4747:1: ( ( ');' ) )
            // InternalAPIMappingLanguage.g:4748:1: ( ');' )
            {
            // InternalAPIMappingLanguage.g:4748:1: ( ');' )
            // InternalAPIMappingLanguage.g:4749:1: ');'
            {
             before(grammarAccess.getDoWhileLoopAccess().getRightParenthesisSemicolonKeyword_5()); 
            match(input,63,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4774:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4778:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalAPIMappingLanguage.g:4779:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalAPIMappingLanguage.g:4786:1: rule__IfStatement__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4790:1: ( ( 'if' ) )
            // InternalAPIMappingLanguage.g:4791:1: ( 'if' )
            {
            // InternalAPIMappingLanguage.g:4791:1: ( 'if' )
            // InternalAPIMappingLanguage.g:4792:1: 'if'
            {
             before(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            match(input,64,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4805:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4809:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalAPIMappingLanguage.g:4810:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalAPIMappingLanguage.g:4817:1: rule__IfStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4821:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:4822:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:4822:1: ( '(' )
            // InternalAPIMappingLanguage.g:4823:1: '('
            {
             before(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,56,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4836:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4840:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalAPIMappingLanguage.g:4841:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_21);
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
    // InternalAPIMappingLanguage.g:4848:1: rule__IfStatement__Group__2__Impl : ( ( rule__IfStatement__IfConditionAssignment_2 ) ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4852:1: ( ( ( rule__IfStatement__IfConditionAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:4853:1: ( ( rule__IfStatement__IfConditionAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:4853:1: ( ( rule__IfStatement__IfConditionAssignment_2 ) )
            // InternalAPIMappingLanguage.g:4854:1: ( rule__IfStatement__IfConditionAssignment_2 )
            {
             before(grammarAccess.getIfStatementAccess().getIfConditionAssignment_2()); 
            // InternalAPIMappingLanguage.g:4855:1: ( rule__IfStatement__IfConditionAssignment_2 )
            // InternalAPIMappingLanguage.g:4855:2: rule__IfStatement__IfConditionAssignment_2
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
    // InternalAPIMappingLanguage.g:4865:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4869:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalAPIMappingLanguage.g:4870:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalAPIMappingLanguage.g:4877:1: rule__IfStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4881:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:4882:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:4882:1: ( ')' )
            // InternalAPIMappingLanguage.g:4883:1: ')'
            {
             before(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,57,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4896:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4900:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalAPIMappingLanguage.g:4901:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_30);
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
    // InternalAPIMappingLanguage.g:4908:1: rule__IfStatement__Group__4__Impl : ( ( rule__IfStatement__IfBlockAssignment_4 ) ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4912:1: ( ( ( rule__IfStatement__IfBlockAssignment_4 ) ) )
            // InternalAPIMappingLanguage.g:4913:1: ( ( rule__IfStatement__IfBlockAssignment_4 ) )
            {
            // InternalAPIMappingLanguage.g:4913:1: ( ( rule__IfStatement__IfBlockAssignment_4 ) )
            // InternalAPIMappingLanguage.g:4914:1: ( rule__IfStatement__IfBlockAssignment_4 )
            {
             before(grammarAccess.getIfStatementAccess().getIfBlockAssignment_4()); 
            // InternalAPIMappingLanguage.g:4915:1: ( rule__IfStatement__IfBlockAssignment_4 )
            // InternalAPIMappingLanguage.g:4915:2: rule__IfStatement__IfBlockAssignment_4
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
    // InternalAPIMappingLanguage.g:4925:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4929:1: ( rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 )
            // InternalAPIMappingLanguage.g:4930:2: rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_30);
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
    // InternalAPIMappingLanguage.g:4937:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__ElseIfStatementsAssignment_5 )* ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4941:1: ( ( ( rule__IfStatement__ElseIfStatementsAssignment_5 )* ) )
            // InternalAPIMappingLanguage.g:4942:1: ( ( rule__IfStatement__ElseIfStatementsAssignment_5 )* )
            {
            // InternalAPIMappingLanguage.g:4942:1: ( ( rule__IfStatement__ElseIfStatementsAssignment_5 )* )
            // InternalAPIMappingLanguage.g:4943:1: ( rule__IfStatement__ElseIfStatementsAssignment_5 )*
            {
             before(grammarAccess.getIfStatementAccess().getElseIfStatementsAssignment_5()); 
            // InternalAPIMappingLanguage.g:4944:1: ( rule__IfStatement__ElseIfStatementsAssignment_5 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==66) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:4944:2: rule__IfStatement__ElseIfStatementsAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_31);
            	    rule__IfStatement__ElseIfStatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalAPIMappingLanguage.g:4954:1: rule__IfStatement__Group__6 : rule__IfStatement__Group__6__Impl ;
    public final void rule__IfStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4958:1: ( rule__IfStatement__Group__6__Impl )
            // InternalAPIMappingLanguage.g:4959:2: rule__IfStatement__Group__6__Impl
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
    // InternalAPIMappingLanguage.g:4965:1: rule__IfStatement__Group__6__Impl : ( ( rule__IfStatement__Group_6__0 )? ) ;
    public final void rule__IfStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4969:1: ( ( ( rule__IfStatement__Group_6__0 )? ) )
            // InternalAPIMappingLanguage.g:4970:1: ( ( rule__IfStatement__Group_6__0 )? )
            {
            // InternalAPIMappingLanguage.g:4970:1: ( ( rule__IfStatement__Group_6__0 )? )
            // InternalAPIMappingLanguage.g:4971:1: ( rule__IfStatement__Group_6__0 )?
            {
             before(grammarAccess.getIfStatementAccess().getGroup_6()); 
            // InternalAPIMappingLanguage.g:4972:1: ( rule__IfStatement__Group_6__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==65) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAPIMappingLanguage.g:4972:2: rule__IfStatement__Group_6__0
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
    // InternalAPIMappingLanguage.g:4996:1: rule__IfStatement__Group_6__0 : rule__IfStatement__Group_6__0__Impl rule__IfStatement__Group_6__1 ;
    public final void rule__IfStatement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5000:1: ( rule__IfStatement__Group_6__0__Impl rule__IfStatement__Group_6__1 )
            // InternalAPIMappingLanguage.g:5001:2: rule__IfStatement__Group_6__0__Impl rule__IfStatement__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalAPIMappingLanguage.g:5008:1: rule__IfStatement__Group_6__0__Impl : ( 'else' ) ;
    public final void rule__IfStatement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5012:1: ( ( 'else' ) )
            // InternalAPIMappingLanguage.g:5013:1: ( 'else' )
            {
            // InternalAPIMappingLanguage.g:5013:1: ( 'else' )
            // InternalAPIMappingLanguage.g:5014:1: 'else'
            {
             before(grammarAccess.getIfStatementAccess().getElseKeyword_6_0()); 
            match(input,65,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:5027:1: rule__IfStatement__Group_6__1 : rule__IfStatement__Group_6__1__Impl ;
    public final void rule__IfStatement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5031:1: ( rule__IfStatement__Group_6__1__Impl )
            // InternalAPIMappingLanguage.g:5032:2: rule__IfStatement__Group_6__1__Impl
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
    // InternalAPIMappingLanguage.g:5038:1: rule__IfStatement__Group_6__1__Impl : ( ( rule__IfStatement__ElseBlockAssignment_6_1 ) ) ;
    public final void rule__IfStatement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5042:1: ( ( ( rule__IfStatement__ElseBlockAssignment_6_1 ) ) )
            // InternalAPIMappingLanguage.g:5043:1: ( ( rule__IfStatement__ElseBlockAssignment_6_1 ) )
            {
            // InternalAPIMappingLanguage.g:5043:1: ( ( rule__IfStatement__ElseBlockAssignment_6_1 ) )
            // InternalAPIMappingLanguage.g:5044:1: ( rule__IfStatement__ElseBlockAssignment_6_1 )
            {
             before(grammarAccess.getIfStatementAccess().getElseBlockAssignment_6_1()); 
            // InternalAPIMappingLanguage.g:5045:1: ( rule__IfStatement__ElseBlockAssignment_6_1 )
            // InternalAPIMappingLanguage.g:5045:2: rule__IfStatement__ElseBlockAssignment_6_1
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
    // InternalAPIMappingLanguage.g:5059:1: rule__ElseIfStatement__Group__0 : rule__ElseIfStatement__Group__0__Impl rule__ElseIfStatement__Group__1 ;
    public final void rule__ElseIfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5063:1: ( rule__ElseIfStatement__Group__0__Impl rule__ElseIfStatement__Group__1 )
            // InternalAPIMappingLanguage.g:5064:2: rule__ElseIfStatement__Group__0__Impl rule__ElseIfStatement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalAPIMappingLanguage.g:5071:1: rule__ElseIfStatement__Group__0__Impl : ( 'elseif' ) ;
    public final void rule__ElseIfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5075:1: ( ( 'elseif' ) )
            // InternalAPIMappingLanguage.g:5076:1: ( 'elseif' )
            {
            // InternalAPIMappingLanguage.g:5076:1: ( 'elseif' )
            // InternalAPIMappingLanguage.g:5077:1: 'elseif'
            {
             before(grammarAccess.getElseIfStatementAccess().getElseifKeyword_0()); 
            match(input,66,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:5090:1: rule__ElseIfStatement__Group__1 : rule__ElseIfStatement__Group__1__Impl rule__ElseIfStatement__Group__2 ;
    public final void rule__ElseIfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5094:1: ( rule__ElseIfStatement__Group__1__Impl rule__ElseIfStatement__Group__2 )
            // InternalAPIMappingLanguage.g:5095:2: rule__ElseIfStatement__Group__1__Impl rule__ElseIfStatement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalAPIMappingLanguage.g:5102:1: rule__ElseIfStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__ElseIfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5106:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:5107:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:5107:1: ( '(' )
            // InternalAPIMappingLanguage.g:5108:1: '('
            {
             before(grammarAccess.getElseIfStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,56,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:5121:1: rule__ElseIfStatement__Group__2 : rule__ElseIfStatement__Group__2__Impl rule__ElseIfStatement__Group__3 ;
    public final void rule__ElseIfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5125:1: ( rule__ElseIfStatement__Group__2__Impl rule__ElseIfStatement__Group__3 )
            // InternalAPIMappingLanguage.g:5126:2: rule__ElseIfStatement__Group__2__Impl rule__ElseIfStatement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_21);
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
    // InternalAPIMappingLanguage.g:5133:1: rule__ElseIfStatement__Group__2__Impl : ( ( rule__ElseIfStatement__ElseIfConditionAssignment_2 ) ) ;
    public final void rule__ElseIfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5137:1: ( ( ( rule__ElseIfStatement__ElseIfConditionAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:5138:1: ( ( rule__ElseIfStatement__ElseIfConditionAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:5138:1: ( ( rule__ElseIfStatement__ElseIfConditionAssignment_2 ) )
            // InternalAPIMappingLanguage.g:5139:1: ( rule__ElseIfStatement__ElseIfConditionAssignment_2 )
            {
             before(grammarAccess.getElseIfStatementAccess().getElseIfConditionAssignment_2()); 
            // InternalAPIMappingLanguage.g:5140:1: ( rule__ElseIfStatement__ElseIfConditionAssignment_2 )
            // InternalAPIMappingLanguage.g:5140:2: rule__ElseIfStatement__ElseIfConditionAssignment_2
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
    // InternalAPIMappingLanguage.g:5150:1: rule__ElseIfStatement__Group__3 : rule__ElseIfStatement__Group__3__Impl rule__ElseIfStatement__Group__4 ;
    public final void rule__ElseIfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5154:1: ( rule__ElseIfStatement__Group__3__Impl rule__ElseIfStatement__Group__4 )
            // InternalAPIMappingLanguage.g:5155:2: rule__ElseIfStatement__Group__3__Impl rule__ElseIfStatement__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
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
    // InternalAPIMappingLanguage.g:5162:1: rule__ElseIfStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__ElseIfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5166:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:5167:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:5167:1: ( ')' )
            // InternalAPIMappingLanguage.g:5168:1: ')'
            {
             before(grammarAccess.getElseIfStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,57,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:5181:1: rule__ElseIfStatement__Group__4 : rule__ElseIfStatement__Group__4__Impl ;
    public final void rule__ElseIfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5185:1: ( rule__ElseIfStatement__Group__4__Impl )
            // InternalAPIMappingLanguage.g:5186:2: rule__ElseIfStatement__Group__4__Impl
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
    // InternalAPIMappingLanguage.g:5192:1: rule__ElseIfStatement__Group__4__Impl : ( ( rule__ElseIfStatement__ElseIfBlockAssignment_4 ) ) ;
    public final void rule__ElseIfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5196:1: ( ( ( rule__ElseIfStatement__ElseIfBlockAssignment_4 ) ) )
            // InternalAPIMappingLanguage.g:5197:1: ( ( rule__ElseIfStatement__ElseIfBlockAssignment_4 ) )
            {
            // InternalAPIMappingLanguage.g:5197:1: ( ( rule__ElseIfStatement__ElseIfBlockAssignment_4 ) )
            // InternalAPIMappingLanguage.g:5198:1: ( rule__ElseIfStatement__ElseIfBlockAssignment_4 )
            {
             before(grammarAccess.getElseIfStatementAccess().getElseIfBlockAssignment_4()); 
            // InternalAPIMappingLanguage.g:5199:1: ( rule__ElseIfStatement__ElseIfBlockAssignment_4 )
            // InternalAPIMappingLanguage.g:5199:2: rule__ElseIfStatement__ElseIfBlockAssignment_4
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


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalAPIMappingLanguage.g:5221:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5225:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalAPIMappingLanguage.g:5226:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
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
    // InternalAPIMappingLanguage.g:5233:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5237:1: ( ( ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:5238:1: ( ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:5238:1: ( ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 ) )
            // InternalAPIMappingLanguage.g:5239:1: ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getLhs_typedNamedElementExpressionAssignment_0()); 
            // InternalAPIMappingLanguage.g:5240:1: ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 )
            // InternalAPIMappingLanguage.g:5240:2: rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0
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
    // InternalAPIMappingLanguage.g:5250:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5254:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalAPIMappingLanguage.g:5255:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_22);
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
    // InternalAPIMappingLanguage.g:5262:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__Alternatives_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5266:1: ( ( ( rule__Assignment__Alternatives_1 ) ) )
            // InternalAPIMappingLanguage.g:5267:1: ( ( rule__Assignment__Alternatives_1 ) )
            {
            // InternalAPIMappingLanguage.g:5267:1: ( ( rule__Assignment__Alternatives_1 ) )
            // InternalAPIMappingLanguage.g:5268:1: ( rule__Assignment__Alternatives_1 )
            {
             before(grammarAccess.getAssignmentAccess().getAlternatives_1()); 
            // InternalAPIMappingLanguage.g:5269:1: ( rule__Assignment__Alternatives_1 )
            // InternalAPIMappingLanguage.g:5269:2: rule__Assignment__Alternatives_1
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
    // InternalAPIMappingLanguage.g:5279:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5283:1: ( rule__Assignment__Group__2__Impl )
            // InternalAPIMappingLanguage.g:5284:2: rule__Assignment__Group__2__Impl
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
    // InternalAPIMappingLanguage.g:5290:1: rule__Assignment__Group__2__Impl : ( ';' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5294:1: ( ( ';' ) )
            // InternalAPIMappingLanguage.g:5295:1: ( ';' )
            {
            // InternalAPIMappingLanguage.g:5295:1: ( ';' )
            // InternalAPIMappingLanguage.g:5296:1: ';'
            {
             before(grammarAccess.getAssignmentAccess().getSemicolonKeyword_2()); 
            match(input,58,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:5315:1: rule__Assignment__Group_1_0__0 : rule__Assignment__Group_1_0__0__Impl rule__Assignment__Group_1_0__1 ;
    public final void rule__Assignment__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5319:1: ( rule__Assignment__Group_1_0__0__Impl rule__Assignment__Group_1_0__1 )
            // InternalAPIMappingLanguage.g:5320:2: rule__Assignment__Group_1_0__0__Impl rule__Assignment__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalAPIMappingLanguage.g:5327:1: rule__Assignment__Group_1_0__0__Impl : ( ( rule__Assignment__AssignOperatorAssignment_1_0_0 ) ) ;
    public final void rule__Assignment__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5331:1: ( ( ( rule__Assignment__AssignOperatorAssignment_1_0_0 ) ) )
            // InternalAPIMappingLanguage.g:5332:1: ( ( rule__Assignment__AssignOperatorAssignment_1_0_0 ) )
            {
            // InternalAPIMappingLanguage.g:5332:1: ( ( rule__Assignment__AssignOperatorAssignment_1_0_0 ) )
            // InternalAPIMappingLanguage.g:5333:1: ( rule__Assignment__AssignOperatorAssignment_1_0_0 )
            {
             before(grammarAccess.getAssignmentAccess().getAssignOperatorAssignment_1_0_0()); 
            // InternalAPIMappingLanguage.g:5334:1: ( rule__Assignment__AssignOperatorAssignment_1_0_0 )
            // InternalAPIMappingLanguage.g:5334:2: rule__Assignment__AssignOperatorAssignment_1_0_0
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
    // InternalAPIMappingLanguage.g:5344:1: rule__Assignment__Group_1_0__1 : rule__Assignment__Group_1_0__1__Impl ;
    public final void rule__Assignment__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5348:1: ( rule__Assignment__Group_1_0__1__Impl )
            // InternalAPIMappingLanguage.g:5349:2: rule__Assignment__Group_1_0__1__Impl
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
    // InternalAPIMappingLanguage.g:5355:1: rule__Assignment__Group_1_0__1__Impl : ( ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 ) ) ;
    public final void rule__Assignment__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5359:1: ( ( ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 ) ) )
            // InternalAPIMappingLanguage.g:5360:1: ( ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 ) )
            {
            // InternalAPIMappingLanguage.g:5360:1: ( ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 ) )
            // InternalAPIMappingLanguage.g:5361:1: ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 )
            {
             before(grammarAccess.getAssignmentAccess().getRhs_assignExpressionAssignment_1_0_1()); 
            // InternalAPIMappingLanguage.g:5362:1: ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 )
            // InternalAPIMappingLanguage.g:5362:2: rule__Assignment__Rhs_assignExpressionAssignment_1_0_1
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
    // InternalAPIMappingLanguage.g:5376:1: rule__ArrayInitializeExpression__Group__0 : rule__ArrayInitializeExpression__Group__0__Impl rule__ArrayInitializeExpression__Group__1 ;
    public final void rule__ArrayInitializeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5380:1: ( rule__ArrayInitializeExpression__Group__0__Impl rule__ArrayInitializeExpression__Group__1 )
            // InternalAPIMappingLanguage.g:5381:2: rule__ArrayInitializeExpression__Group__0__Impl rule__ArrayInitializeExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalAPIMappingLanguage.g:5388:1: rule__ArrayInitializeExpression__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayInitializeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5392:1: ( ( '[' ) )
            // InternalAPIMappingLanguage.g:5393:1: ( '[' )
            {
            // InternalAPIMappingLanguage.g:5393:1: ( '[' )
            // InternalAPIMappingLanguage.g:5394:1: '['
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,67,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:5407:1: rule__ArrayInitializeExpression__Group__1 : rule__ArrayInitializeExpression__Group__1__Impl rule__ArrayInitializeExpression__Group__2 ;
    public final void rule__ArrayInitializeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5411:1: ( rule__ArrayInitializeExpression__Group__1__Impl rule__ArrayInitializeExpression__Group__2 )
            // InternalAPIMappingLanguage.g:5412:2: rule__ArrayInitializeExpression__Group__1__Impl rule__ArrayInitializeExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_32);
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
    // InternalAPIMappingLanguage.g:5419:1: rule__ArrayInitializeExpression__Group__1__Impl : ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 ) ) ;
    public final void rule__ArrayInitializeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5423:1: ( ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:5424:1: ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:5424:1: ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 ) )
            // InternalAPIMappingLanguage.g:5425:1: ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 )
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsAssignment_1()); 
            // InternalAPIMappingLanguage.g:5426:1: ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 )
            // InternalAPIMappingLanguage.g:5426:2: rule__ArrayInitializeExpression__ExpressionsAssignment_1
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
    // InternalAPIMappingLanguage.g:5436:1: rule__ArrayInitializeExpression__Group__2 : rule__ArrayInitializeExpression__Group__2__Impl rule__ArrayInitializeExpression__Group__3 ;
    public final void rule__ArrayInitializeExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5440:1: ( rule__ArrayInitializeExpression__Group__2__Impl rule__ArrayInitializeExpression__Group__3 )
            // InternalAPIMappingLanguage.g:5441:2: rule__ArrayInitializeExpression__Group__2__Impl rule__ArrayInitializeExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_32);
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
    // InternalAPIMappingLanguage.g:5448:1: rule__ArrayInitializeExpression__Group__2__Impl : ( ( rule__ArrayInitializeExpression__Group_2__0 )* ) ;
    public final void rule__ArrayInitializeExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5452:1: ( ( ( rule__ArrayInitializeExpression__Group_2__0 )* ) )
            // InternalAPIMappingLanguage.g:5453:1: ( ( rule__ArrayInitializeExpression__Group_2__0 )* )
            {
            // InternalAPIMappingLanguage.g:5453:1: ( ( rule__ArrayInitializeExpression__Group_2__0 )* )
            // InternalAPIMappingLanguage.g:5454:1: ( rule__ArrayInitializeExpression__Group_2__0 )*
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getGroup_2()); 
            // InternalAPIMappingLanguage.g:5455:1: ( rule__ArrayInitializeExpression__Group_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==49) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:5455:2: rule__ArrayInitializeExpression__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__ArrayInitializeExpression__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalAPIMappingLanguage.g:5465:1: rule__ArrayInitializeExpression__Group__3 : rule__ArrayInitializeExpression__Group__3__Impl ;
    public final void rule__ArrayInitializeExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5469:1: ( rule__ArrayInitializeExpression__Group__3__Impl )
            // InternalAPIMappingLanguage.g:5470:2: rule__ArrayInitializeExpression__Group__3__Impl
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
    // InternalAPIMappingLanguage.g:5476:1: rule__ArrayInitializeExpression__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayInitializeExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5480:1: ( ( ']' ) )
            // InternalAPIMappingLanguage.g:5481:1: ( ']' )
            {
            // InternalAPIMappingLanguage.g:5481:1: ( ']' )
            // InternalAPIMappingLanguage.g:5482:1: ']'
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getRightSquareBracketKeyword_3()); 
            match(input,68,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:5503:1: rule__ArrayInitializeExpression__Group_2__0 : rule__ArrayInitializeExpression__Group_2__0__Impl rule__ArrayInitializeExpression__Group_2__1 ;
    public final void rule__ArrayInitializeExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5507:1: ( rule__ArrayInitializeExpression__Group_2__0__Impl rule__ArrayInitializeExpression__Group_2__1 )
            // InternalAPIMappingLanguage.g:5508:2: rule__ArrayInitializeExpression__Group_2__0__Impl rule__ArrayInitializeExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalAPIMappingLanguage.g:5515:1: rule__ArrayInitializeExpression__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayInitializeExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5519:1: ( ( ',' ) )
            // InternalAPIMappingLanguage.g:5520:1: ( ',' )
            {
            // InternalAPIMappingLanguage.g:5520:1: ( ',' )
            // InternalAPIMappingLanguage.g:5521:1: ','
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getCommaKeyword_2_0()); 
            match(input,49,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:5534:1: rule__ArrayInitializeExpression__Group_2__1 : rule__ArrayInitializeExpression__Group_2__1__Impl ;
    public final void rule__ArrayInitializeExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5538:1: ( rule__ArrayInitializeExpression__Group_2__1__Impl )
            // InternalAPIMappingLanguage.g:5539:2: rule__ArrayInitializeExpression__Group_2__1__Impl
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
    // InternalAPIMappingLanguage.g:5545:1: rule__ArrayInitializeExpression__Group_2__1__Impl : ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 ) ) ;
    public final void rule__ArrayInitializeExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5549:1: ( ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 ) ) )
            // InternalAPIMappingLanguage.g:5550:1: ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 ) )
            {
            // InternalAPIMappingLanguage.g:5550:1: ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 ) )
            // InternalAPIMappingLanguage.g:5551:1: ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 )
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsAssignment_2_1()); 
            // InternalAPIMappingLanguage.g:5552:1: ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 )
            // InternalAPIMappingLanguage.g:5552:2: rule__ArrayInitializeExpression__ExpressionsAssignment_2_1
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
    // InternalAPIMappingLanguage.g:5566:1: rule__LocalVariableDeclaration__Group__0 : rule__LocalVariableDeclaration__Group__0__Impl rule__LocalVariableDeclaration__Group__1 ;
    public final void rule__LocalVariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5570:1: ( rule__LocalVariableDeclaration__Group__0__Impl rule__LocalVariableDeclaration__Group__1 )
            // InternalAPIMappingLanguage.g:5571:2: rule__LocalVariableDeclaration__Group__0__Impl rule__LocalVariableDeclaration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
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
    // InternalAPIMappingLanguage.g:5578:1: rule__LocalVariableDeclaration__Group__0__Impl : ( ( rule__LocalVariableDeclaration__DataTypeAssignment_0 ) ) ;
    public final void rule__LocalVariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5582:1: ( ( ( rule__LocalVariableDeclaration__DataTypeAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:5583:1: ( ( rule__LocalVariableDeclaration__DataTypeAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:5583:1: ( ( rule__LocalVariableDeclaration__DataTypeAssignment_0 ) )
            // InternalAPIMappingLanguage.g:5584:1: ( rule__LocalVariableDeclaration__DataTypeAssignment_0 )
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getDataTypeAssignment_0()); 
            // InternalAPIMappingLanguage.g:5585:1: ( rule__LocalVariableDeclaration__DataTypeAssignment_0 )
            // InternalAPIMappingLanguage.g:5585:2: rule__LocalVariableDeclaration__DataTypeAssignment_0
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
    // InternalAPIMappingLanguage.g:5595:1: rule__LocalVariableDeclaration__Group__1 : rule__LocalVariableDeclaration__Group__1__Impl rule__LocalVariableDeclaration__Group__2 ;
    public final void rule__LocalVariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5599:1: ( rule__LocalVariableDeclaration__Group__1__Impl rule__LocalVariableDeclaration__Group__2 )
            // InternalAPIMappingLanguage.g:5600:2: rule__LocalVariableDeclaration__Group__1__Impl rule__LocalVariableDeclaration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_33);
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
    // InternalAPIMappingLanguage.g:5607:1: rule__LocalVariableDeclaration__Group__1__Impl : ( ( rule__LocalVariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__LocalVariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5611:1: ( ( ( rule__LocalVariableDeclaration__NameAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:5612:1: ( ( rule__LocalVariableDeclaration__NameAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:5612:1: ( ( rule__LocalVariableDeclaration__NameAssignment_1 ) )
            // InternalAPIMappingLanguage.g:5613:1: ( rule__LocalVariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalAPIMappingLanguage.g:5614:1: ( rule__LocalVariableDeclaration__NameAssignment_1 )
            // InternalAPIMappingLanguage.g:5614:2: rule__LocalVariableDeclaration__NameAssignment_1
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
    // InternalAPIMappingLanguage.g:5624:1: rule__LocalVariableDeclaration__Group__2 : rule__LocalVariableDeclaration__Group__2__Impl rule__LocalVariableDeclaration__Group__3 ;
    public final void rule__LocalVariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5628:1: ( rule__LocalVariableDeclaration__Group__2__Impl rule__LocalVariableDeclaration__Group__3 )
            // InternalAPIMappingLanguage.g:5629:2: rule__LocalVariableDeclaration__Group__2__Impl rule__LocalVariableDeclaration__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_33);
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
    // InternalAPIMappingLanguage.g:5636:1: rule__LocalVariableDeclaration__Group__2__Impl : ( ( rule__LocalVariableDeclaration__Group_2__0 )? ) ;
    public final void rule__LocalVariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5640:1: ( ( ( rule__LocalVariableDeclaration__Group_2__0 )? ) )
            // InternalAPIMappingLanguage.g:5641:1: ( ( rule__LocalVariableDeclaration__Group_2__0 )? )
            {
            // InternalAPIMappingLanguage.g:5641:1: ( ( rule__LocalVariableDeclaration__Group_2__0 )? )
            // InternalAPIMappingLanguage.g:5642:1: ( rule__LocalVariableDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getGroup_2()); 
            // InternalAPIMappingLanguage.g:5643:1: ( rule__LocalVariableDeclaration__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==26) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAPIMappingLanguage.g:5643:2: rule__LocalVariableDeclaration__Group_2__0
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
    // InternalAPIMappingLanguage.g:5653:1: rule__LocalVariableDeclaration__Group__3 : rule__LocalVariableDeclaration__Group__3__Impl ;
    public final void rule__LocalVariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5657:1: ( rule__LocalVariableDeclaration__Group__3__Impl )
            // InternalAPIMappingLanguage.g:5658:2: rule__LocalVariableDeclaration__Group__3__Impl
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
    // InternalAPIMappingLanguage.g:5664:1: rule__LocalVariableDeclaration__Group__3__Impl : ( ';' ) ;
    public final void rule__LocalVariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5668:1: ( ( ';' ) )
            // InternalAPIMappingLanguage.g:5669:1: ( ';' )
            {
            // InternalAPIMappingLanguage.g:5669:1: ( ';' )
            // InternalAPIMappingLanguage.g:5670:1: ';'
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getSemicolonKeyword_3()); 
            match(input,58,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:5691:1: rule__LocalVariableDeclaration__Group_2__0 : rule__LocalVariableDeclaration__Group_2__0__Impl rule__LocalVariableDeclaration__Group_2__1 ;
    public final void rule__LocalVariableDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5695:1: ( rule__LocalVariableDeclaration__Group_2__0__Impl rule__LocalVariableDeclaration__Group_2__1 )
            // InternalAPIMappingLanguage.g:5696:2: rule__LocalVariableDeclaration__Group_2__0__Impl rule__LocalVariableDeclaration__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalAPIMappingLanguage.g:5703:1: rule__LocalVariableDeclaration__Group_2__0__Impl : ( ':=' ) ;
    public final void rule__LocalVariableDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5707:1: ( ( ':=' ) )
            // InternalAPIMappingLanguage.g:5708:1: ( ':=' )
            {
            // InternalAPIMappingLanguage.g:5708:1: ( ':=' )
            // InternalAPIMappingLanguage.g:5709:1: ':='
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getColonEqualsSignKeyword_2_0()); 
            match(input,26,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:5722:1: rule__LocalVariableDeclaration__Group_2__1 : rule__LocalVariableDeclaration__Group_2__1__Impl ;
    public final void rule__LocalVariableDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5726:1: ( rule__LocalVariableDeclaration__Group_2__1__Impl )
            // InternalAPIMappingLanguage.g:5727:2: rule__LocalVariableDeclaration__Group_2__1__Impl
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
    // InternalAPIMappingLanguage.g:5733:1: rule__LocalVariableDeclaration__Group_2__1__Impl : ( ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 ) ) ;
    public final void rule__LocalVariableDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5737:1: ( ( ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 ) ) )
            // InternalAPIMappingLanguage.g:5738:1: ( ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 ) )
            {
            // InternalAPIMappingLanguage.g:5738:1: ( ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 ) )
            // InternalAPIMappingLanguage.g:5739:1: ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 )
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getInitializeExpressionAssignment_2_1()); 
            // InternalAPIMappingLanguage.g:5740:1: ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 )
            // InternalAPIMappingLanguage.g:5740:2: rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1
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
    // InternalAPIMappingLanguage.g:5754:1: rule__LocalConstantDeclaration__Group__0 : rule__LocalConstantDeclaration__Group__0__Impl rule__LocalConstantDeclaration__Group__1 ;
    public final void rule__LocalConstantDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5758:1: ( rule__LocalConstantDeclaration__Group__0__Impl rule__LocalConstantDeclaration__Group__1 )
            // InternalAPIMappingLanguage.g:5759:2: rule__LocalConstantDeclaration__Group__0__Impl rule__LocalConstantDeclaration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
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
    // InternalAPIMappingLanguage.g:5766:1: rule__LocalConstantDeclaration__Group__0__Impl : ( ( rule__LocalConstantDeclaration__ConstantAssignment_0 ) ) ;
    public final void rule__LocalConstantDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5770:1: ( ( ( rule__LocalConstantDeclaration__ConstantAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:5771:1: ( ( rule__LocalConstantDeclaration__ConstantAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:5771:1: ( ( rule__LocalConstantDeclaration__ConstantAssignment_0 ) )
            // InternalAPIMappingLanguage.g:5772:1: ( rule__LocalConstantDeclaration__ConstantAssignment_0 )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getConstantAssignment_0()); 
            // InternalAPIMappingLanguage.g:5773:1: ( rule__LocalConstantDeclaration__ConstantAssignment_0 )
            // InternalAPIMappingLanguage.g:5773:2: rule__LocalConstantDeclaration__ConstantAssignment_0
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
    // InternalAPIMappingLanguage.g:5783:1: rule__LocalConstantDeclaration__Group__1 : rule__LocalConstantDeclaration__Group__1__Impl rule__LocalConstantDeclaration__Group__2 ;
    public final void rule__LocalConstantDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5787:1: ( rule__LocalConstantDeclaration__Group__1__Impl rule__LocalConstantDeclaration__Group__2 )
            // InternalAPIMappingLanguage.g:5788:2: rule__LocalConstantDeclaration__Group__1__Impl rule__LocalConstantDeclaration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
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
    // InternalAPIMappingLanguage.g:5795:1: rule__LocalConstantDeclaration__Group__1__Impl : ( ( rule__LocalConstantDeclaration__DataTypeAssignment_1 ) ) ;
    public final void rule__LocalConstantDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5799:1: ( ( ( rule__LocalConstantDeclaration__DataTypeAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:5800:1: ( ( rule__LocalConstantDeclaration__DataTypeAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:5800:1: ( ( rule__LocalConstantDeclaration__DataTypeAssignment_1 ) )
            // InternalAPIMappingLanguage.g:5801:1: ( rule__LocalConstantDeclaration__DataTypeAssignment_1 )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getDataTypeAssignment_1()); 
            // InternalAPIMappingLanguage.g:5802:1: ( rule__LocalConstantDeclaration__DataTypeAssignment_1 )
            // InternalAPIMappingLanguage.g:5802:2: rule__LocalConstantDeclaration__DataTypeAssignment_1
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
    // InternalAPIMappingLanguage.g:5812:1: rule__LocalConstantDeclaration__Group__2 : rule__LocalConstantDeclaration__Group__2__Impl rule__LocalConstantDeclaration__Group__3 ;
    public final void rule__LocalConstantDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5816:1: ( rule__LocalConstantDeclaration__Group__2__Impl rule__LocalConstantDeclaration__Group__3 )
            // InternalAPIMappingLanguage.g:5817:2: rule__LocalConstantDeclaration__Group__2__Impl rule__LocalConstantDeclaration__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalAPIMappingLanguage.g:5824:1: rule__LocalConstantDeclaration__Group__2__Impl : ( ( rule__LocalConstantDeclaration__NameAssignment_2 ) ) ;
    public final void rule__LocalConstantDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5828:1: ( ( ( rule__LocalConstantDeclaration__NameAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:5829:1: ( ( rule__LocalConstantDeclaration__NameAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:5829:1: ( ( rule__LocalConstantDeclaration__NameAssignment_2 ) )
            // InternalAPIMappingLanguage.g:5830:1: ( rule__LocalConstantDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getNameAssignment_2()); 
            // InternalAPIMappingLanguage.g:5831:1: ( rule__LocalConstantDeclaration__NameAssignment_2 )
            // InternalAPIMappingLanguage.g:5831:2: rule__LocalConstantDeclaration__NameAssignment_2
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
    // InternalAPIMappingLanguage.g:5841:1: rule__LocalConstantDeclaration__Group__3 : rule__LocalConstantDeclaration__Group__3__Impl rule__LocalConstantDeclaration__Group__4 ;
    public final void rule__LocalConstantDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5845:1: ( rule__LocalConstantDeclaration__Group__3__Impl rule__LocalConstantDeclaration__Group__4 )
            // InternalAPIMappingLanguage.g:5846:2: rule__LocalConstantDeclaration__Group__3__Impl rule__LocalConstantDeclaration__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalAPIMappingLanguage.g:5853:1: rule__LocalConstantDeclaration__Group__3__Impl : ( ':=' ) ;
    public final void rule__LocalConstantDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5857:1: ( ( ':=' ) )
            // InternalAPIMappingLanguage.g:5858:1: ( ':=' )
            {
            // InternalAPIMappingLanguage.g:5858:1: ( ':=' )
            // InternalAPIMappingLanguage.g:5859:1: ':='
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getColonEqualsSignKeyword_3()); 
            match(input,26,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:5872:1: rule__LocalConstantDeclaration__Group__4 : rule__LocalConstantDeclaration__Group__4__Impl rule__LocalConstantDeclaration__Group__5 ;
    public final void rule__LocalConstantDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5876:1: ( rule__LocalConstantDeclaration__Group__4__Impl rule__LocalConstantDeclaration__Group__5 )
            // InternalAPIMappingLanguage.g:5877:2: rule__LocalConstantDeclaration__Group__4__Impl rule__LocalConstantDeclaration__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_22);
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
    // InternalAPIMappingLanguage.g:5884:1: rule__LocalConstantDeclaration__Group__4__Impl : ( ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 ) ) ;
    public final void rule__LocalConstantDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5888:1: ( ( ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 ) ) )
            // InternalAPIMappingLanguage.g:5889:1: ( ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 ) )
            {
            // InternalAPIMappingLanguage.g:5889:1: ( ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 ) )
            // InternalAPIMappingLanguage.g:5890:1: ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getInitializeExpressionAssignment_4()); 
            // InternalAPIMappingLanguage.g:5891:1: ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 )
            // InternalAPIMappingLanguage.g:5891:2: rule__LocalConstantDeclaration__InitializeExpressionAssignment_4
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
    // InternalAPIMappingLanguage.g:5901:1: rule__LocalConstantDeclaration__Group__5 : rule__LocalConstantDeclaration__Group__5__Impl ;
    public final void rule__LocalConstantDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5905:1: ( rule__LocalConstantDeclaration__Group__5__Impl )
            // InternalAPIMappingLanguage.g:5906:2: rule__LocalConstantDeclaration__Group__5__Impl
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
    // InternalAPIMappingLanguage.g:5912:1: rule__LocalConstantDeclaration__Group__5__Impl : ( ';' ) ;
    public final void rule__LocalConstantDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5916:1: ( ( ';' ) )
            // InternalAPIMappingLanguage.g:5917:1: ( ';' )
            {
            // InternalAPIMappingLanguage.g:5917:1: ( ';' )
            // InternalAPIMappingLanguage.g:5918:1: ';'
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getSemicolonKeyword_5()); 
            match(input,58,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:5943:1: rule__NondeterministicChoiceExpression__Group__0 : rule__NondeterministicChoiceExpression__Group__0__Impl rule__NondeterministicChoiceExpression__Group__1 ;
    public final void rule__NondeterministicChoiceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5947:1: ( rule__NondeterministicChoiceExpression__Group__0__Impl rule__NondeterministicChoiceExpression__Group__1 )
            // InternalAPIMappingLanguage.g:5948:2: rule__NondeterministicChoiceExpression__Group__0__Impl rule__NondeterministicChoiceExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_34);
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
    // InternalAPIMappingLanguage.g:5955:1: rule__NondeterministicChoiceExpression__Group__0__Impl : ( ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 ) ) ;
    public final void rule__NondeterministicChoiceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5959:1: ( ( ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:5960:1: ( ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:5960:1: ( ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 ) )
            // InternalAPIMappingLanguage.g:5961:1: ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 )
            {
             before(grammarAccess.getNondeterministicChoiceExpressionAccess().getDataTypeAssignment_0()); 
            // InternalAPIMappingLanguage.g:5962:1: ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 )
            // InternalAPIMappingLanguage.g:5962:2: rule__NondeterministicChoiceExpression__DataTypeAssignment_0
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
    // InternalAPIMappingLanguage.g:5972:1: rule__NondeterministicChoiceExpression__Group__1 : rule__NondeterministicChoiceExpression__Group__1__Impl ;
    public final void rule__NondeterministicChoiceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5976:1: ( rule__NondeterministicChoiceExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:5977:2: rule__NondeterministicChoiceExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:5983:1: rule__NondeterministicChoiceExpression__Group__1__Impl : ( ( rule__NondeterministicChoiceExpression__RangeAssignment_1 ) ) ;
    public final void rule__NondeterministicChoiceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5987:1: ( ( ( rule__NondeterministicChoiceExpression__RangeAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:5988:1: ( ( rule__NondeterministicChoiceExpression__RangeAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:5988:1: ( ( rule__NondeterministicChoiceExpression__RangeAssignment_1 ) )
            // InternalAPIMappingLanguage.g:5989:1: ( rule__NondeterministicChoiceExpression__RangeAssignment_1 )
            {
             before(grammarAccess.getNondeterministicChoiceExpressionAccess().getRangeAssignment_1()); 
            // InternalAPIMappingLanguage.g:5990:1: ( rule__NondeterministicChoiceExpression__RangeAssignment_1 )
            // InternalAPIMappingLanguage.g:5990:2: rule__NondeterministicChoiceExpression__RangeAssignment_1
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
    // InternalAPIMappingLanguage.g:6004:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6008:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalAPIMappingLanguage.g:6009:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_35);
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
    // InternalAPIMappingLanguage.g:6016:1: rule__Range__Group__0__Impl : ( '<' ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6020:1: ( ( '<' ) )
            // InternalAPIMappingLanguage.g:6021:1: ( '<' )
            {
            // InternalAPIMappingLanguage.g:6021:1: ( '<' )
            // InternalAPIMappingLanguage.g:6022:1: '<'
            {
             before(grammarAccess.getRangeAccess().getLessThanSignKeyword_0()); 
            match(input,31,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:6035:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6039:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalAPIMappingLanguage.g:6040:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
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
    // InternalAPIMappingLanguage.g:6047:1: rule__Range__Group__1__Impl : ( ( rule__Range__LowerBoundAssignment_1 ) ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6051:1: ( ( ( rule__Range__LowerBoundAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:6052:1: ( ( rule__Range__LowerBoundAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:6052:1: ( ( rule__Range__LowerBoundAssignment_1 ) )
            // InternalAPIMappingLanguage.g:6053:1: ( rule__Range__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getRangeAccess().getLowerBoundAssignment_1()); 
            // InternalAPIMappingLanguage.g:6054:1: ( rule__Range__LowerBoundAssignment_1 )
            // InternalAPIMappingLanguage.g:6054:2: rule__Range__LowerBoundAssignment_1
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
    // InternalAPIMappingLanguage.g:6064:1: rule__Range__Group__2 : rule__Range__Group__2__Impl rule__Range__Group__3 ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6068:1: ( rule__Range__Group__2__Impl rule__Range__Group__3 )
            // InternalAPIMappingLanguage.g:6069:2: rule__Range__Group__2__Impl rule__Range__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_35);
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
    // InternalAPIMappingLanguage.g:6076:1: rule__Range__Group__2__Impl : ( ',' ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6080:1: ( ( ',' ) )
            // InternalAPIMappingLanguage.g:6081:1: ( ',' )
            {
            // InternalAPIMappingLanguage.g:6081:1: ( ',' )
            // InternalAPIMappingLanguage.g:6082:1: ','
            {
             before(grammarAccess.getRangeAccess().getCommaKeyword_2()); 
            match(input,49,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:6095:1: rule__Range__Group__3 : rule__Range__Group__3__Impl rule__Range__Group__4 ;
    public final void rule__Range__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6099:1: ( rule__Range__Group__3__Impl rule__Range__Group__4 )
            // InternalAPIMappingLanguage.g:6100:2: rule__Range__Group__3__Impl rule__Range__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_36);
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
    // InternalAPIMappingLanguage.g:6107:1: rule__Range__Group__3__Impl : ( ( rule__Range__UpperBoundAssignment_3 ) ) ;
    public final void rule__Range__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6111:1: ( ( ( rule__Range__UpperBoundAssignment_3 ) ) )
            // InternalAPIMappingLanguage.g:6112:1: ( ( rule__Range__UpperBoundAssignment_3 ) )
            {
            // InternalAPIMappingLanguage.g:6112:1: ( ( rule__Range__UpperBoundAssignment_3 ) )
            // InternalAPIMappingLanguage.g:6113:1: ( rule__Range__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getRangeAccess().getUpperBoundAssignment_3()); 
            // InternalAPIMappingLanguage.g:6114:1: ( rule__Range__UpperBoundAssignment_3 )
            // InternalAPIMappingLanguage.g:6114:2: rule__Range__UpperBoundAssignment_3
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
    // InternalAPIMappingLanguage.g:6124:1: rule__Range__Group__4 : rule__Range__Group__4__Impl ;
    public final void rule__Range__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6128:1: ( rule__Range__Group__4__Impl )
            // InternalAPIMappingLanguage.g:6129:2: rule__Range__Group__4__Impl
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
    // InternalAPIMappingLanguage.g:6135:1: rule__Range__Group__4__Impl : ( '>' ) ;
    public final void rule__Range__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6139:1: ( ( '>' ) )
            // InternalAPIMappingLanguage.g:6140:1: ( '>' )
            {
            // InternalAPIMappingLanguage.g:6140:1: ( '>' )
            // InternalAPIMappingLanguage.g:6141:1: '>'
            {
             before(grammarAccess.getRangeAccess().getGreaterThanSignKeyword_4()); 
            match(input,34,FollowSets000.FOLLOW_2); 
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


    // $ANTLR start "rule__LONG__Group__0"
    // InternalAPIMappingLanguage.g:6164:1: rule__LONG__Group__0 : rule__LONG__Group__0__Impl rule__LONG__Group__1 ;
    public final void rule__LONG__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6168:1: ( rule__LONG__Group__0__Impl rule__LONG__Group__1 )
            // InternalAPIMappingLanguage.g:6169:2: rule__LONG__Group__0__Impl rule__LONG__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__LONG__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LONG__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LONG__Group__0"


    // $ANTLR start "rule__LONG__Group__0__Impl"
    // InternalAPIMappingLanguage.g:6176:1: rule__LONG__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__LONG__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6180:1: ( ( ( '-' )? ) )
            // InternalAPIMappingLanguage.g:6181:1: ( ( '-' )? )
            {
            // InternalAPIMappingLanguage.g:6181:1: ( ( '-' )? )
            // InternalAPIMappingLanguage.g:6182:1: ( '-' )?
            {
             before(grammarAccess.getLONGAccess().getHyphenMinusKeyword_0()); 
            // InternalAPIMappingLanguage.g:6183:1: ( '-' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==36) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAPIMappingLanguage.g:6184:2: '-'
                    {
                    match(input,36,FollowSets000.FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getLONGAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LONG__Group__0__Impl"


    // $ANTLR start "rule__LONG__Group__1"
    // InternalAPIMappingLanguage.g:6195:1: rule__LONG__Group__1 : rule__LONG__Group__1__Impl ;
    public final void rule__LONG__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6199:1: ( rule__LONG__Group__1__Impl )
            // InternalAPIMappingLanguage.g:6200:2: rule__LONG__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LONG__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LONG__Group__1"


    // $ANTLR start "rule__LONG__Group__1__Impl"
    // InternalAPIMappingLanguage.g:6206:1: rule__LONG__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__LONG__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6210:1: ( ( RULE_INT ) )
            // InternalAPIMappingLanguage.g:6211:1: ( RULE_INT )
            {
            // InternalAPIMappingLanguage.g:6211:1: ( RULE_INT )
            // InternalAPIMappingLanguage.g:6212:1: RULE_INT
            {
             before(grammarAccess.getLONGAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getLONGAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LONG__Group__1__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group__0"
    // InternalAPIMappingLanguage.g:6227:1: rule__LogicalOrExpression__Group__0 : rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1 ;
    public final void rule__LogicalOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6231:1: ( rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1 )
            // InternalAPIMappingLanguage.g:6232:2: rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_37);
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
    // InternalAPIMappingLanguage.g:6239:1: rule__LogicalOrExpression__Group__0__Impl : ( ruleLogicalAndExpression ) ;
    public final void rule__LogicalOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6243:1: ( ( ruleLogicalAndExpression ) )
            // InternalAPIMappingLanguage.g:6244:1: ( ruleLogicalAndExpression )
            {
            // InternalAPIMappingLanguage.g:6244:1: ( ruleLogicalAndExpression )
            // InternalAPIMappingLanguage.g:6245:1: ruleLogicalAndExpression
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
    // InternalAPIMappingLanguage.g:6256:1: rule__LogicalOrExpression__Group__1 : rule__LogicalOrExpression__Group__1__Impl ;
    public final void rule__LogicalOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6260:1: ( rule__LogicalOrExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:6261:2: rule__LogicalOrExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:6267:1: rule__LogicalOrExpression__Group__1__Impl : ( ( rule__LogicalOrExpression__Group_1__0 )* ) ;
    public final void rule__LogicalOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6271:1: ( ( ( rule__LogicalOrExpression__Group_1__0 )* ) )
            // InternalAPIMappingLanguage.g:6272:1: ( ( rule__LogicalOrExpression__Group_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:6272:1: ( ( rule__LogicalOrExpression__Group_1__0 )* )
            // InternalAPIMappingLanguage.g:6273:1: ( rule__LogicalOrExpression__Group_1__0 )*
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:6274:1: ( rule__LogicalOrExpression__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==14) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:6274:2: rule__LogicalOrExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_38);
            	    rule__LogicalOrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalAPIMappingLanguage.g:6288:1: rule__LogicalOrExpression__Group_1__0 : rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1 ;
    public final void rule__LogicalOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6292:1: ( rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:6293:2: rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_37);
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
    // InternalAPIMappingLanguage.g:6300:1: rule__LogicalOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6304:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:6305:1: ( () )
            {
            // InternalAPIMappingLanguage.g:6305:1: ( () )
            // InternalAPIMappingLanguage.g:6306:1: ()
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0()); 
            // InternalAPIMappingLanguage.g:6307:1: ()
            // InternalAPIMappingLanguage.g:6309:1: 
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
    // InternalAPIMappingLanguage.g:6319:1: rule__LogicalOrExpression__Group_1__1 : rule__LogicalOrExpression__Group_1__1__Impl rule__LogicalOrExpression__Group_1__2 ;
    public final void rule__LogicalOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6323:1: ( rule__LogicalOrExpression__Group_1__1__Impl rule__LogicalOrExpression__Group_1__2 )
            // InternalAPIMappingLanguage.g:6324:2: rule__LogicalOrExpression__Group_1__1__Impl rule__LogicalOrExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalAPIMappingLanguage.g:6331:1: rule__LogicalOrExpression__Group_1__1__Impl : ( ( rule__LogicalOrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__LogicalOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6335:1: ( ( ( rule__LogicalOrExpression__OperatorAssignment_1_1 ) ) )
            // InternalAPIMappingLanguage.g:6336:1: ( ( rule__LogicalOrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:6336:1: ( ( rule__LogicalOrExpression__OperatorAssignment_1_1 ) )
            // InternalAPIMappingLanguage.g:6337:1: ( rule__LogicalOrExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAPIMappingLanguage.g:6338:1: ( rule__LogicalOrExpression__OperatorAssignment_1_1 )
            // InternalAPIMappingLanguage.g:6338:2: rule__LogicalOrExpression__OperatorAssignment_1_1
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
    // InternalAPIMappingLanguage.g:6348:1: rule__LogicalOrExpression__Group_1__2 : rule__LogicalOrExpression__Group_1__2__Impl ;
    public final void rule__LogicalOrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6352:1: ( rule__LogicalOrExpression__Group_1__2__Impl )
            // InternalAPIMappingLanguage.g:6353:2: rule__LogicalOrExpression__Group_1__2__Impl
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
    // InternalAPIMappingLanguage.g:6359:1: rule__LogicalOrExpression__Group_1__2__Impl : ( ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__LogicalOrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6363:1: ( ( ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalAPIMappingLanguage.g:6364:1: ( ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalAPIMappingLanguage.g:6364:1: ( ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 ) )
            // InternalAPIMappingLanguage.g:6365:1: ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalAPIMappingLanguage.g:6366:1: ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 )
            // InternalAPIMappingLanguage.g:6366:2: rule__LogicalOrExpression__RightExpressionAssignment_1_2
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
    // InternalAPIMappingLanguage.g:6382:1: rule__LogicalAndExpression__Group__0 : rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1 ;
    public final void rule__LogicalAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6386:1: ( rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1 )
            // InternalAPIMappingLanguage.g:6387:2: rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_39);
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
    // InternalAPIMappingLanguage.g:6394:1: rule__LogicalAndExpression__Group__0__Impl : ( ruleComparisonExpression ) ;
    public final void rule__LogicalAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6398:1: ( ( ruleComparisonExpression ) )
            // InternalAPIMappingLanguage.g:6399:1: ( ruleComparisonExpression )
            {
            // InternalAPIMappingLanguage.g:6399:1: ( ruleComparisonExpression )
            // InternalAPIMappingLanguage.g:6400:1: ruleComparisonExpression
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
    // InternalAPIMappingLanguage.g:6411:1: rule__LogicalAndExpression__Group__1 : rule__LogicalAndExpression__Group__1__Impl ;
    public final void rule__LogicalAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6415:1: ( rule__LogicalAndExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:6416:2: rule__LogicalAndExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:6422:1: rule__LogicalAndExpression__Group__1__Impl : ( ( rule__LogicalAndExpression__Group_1__0 )* ) ;
    public final void rule__LogicalAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6426:1: ( ( ( rule__LogicalAndExpression__Group_1__0 )* ) )
            // InternalAPIMappingLanguage.g:6427:1: ( ( rule__LogicalAndExpression__Group_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:6427:1: ( ( rule__LogicalAndExpression__Group_1__0 )* )
            // InternalAPIMappingLanguage.g:6428:1: ( rule__LogicalAndExpression__Group_1__0 )*
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:6429:1: ( rule__LogicalAndExpression__Group_1__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==15) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:6429:2: rule__LogicalAndExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_40);
            	    rule__LogicalAndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalAPIMappingLanguage.g:6443:1: rule__LogicalAndExpression__Group_1__0 : rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1 ;
    public final void rule__LogicalAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6447:1: ( rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:6448:2: rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_39);
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
    // InternalAPIMappingLanguage.g:6455:1: rule__LogicalAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6459:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:6460:1: ( () )
            {
            // InternalAPIMappingLanguage.g:6460:1: ( () )
            // InternalAPIMappingLanguage.g:6461:1: ()
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0()); 
            // InternalAPIMappingLanguage.g:6462:1: ()
            // InternalAPIMappingLanguage.g:6464:1: 
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
    // InternalAPIMappingLanguage.g:6474:1: rule__LogicalAndExpression__Group_1__1 : rule__LogicalAndExpression__Group_1__1__Impl rule__LogicalAndExpression__Group_1__2 ;
    public final void rule__LogicalAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6478:1: ( rule__LogicalAndExpression__Group_1__1__Impl rule__LogicalAndExpression__Group_1__2 )
            // InternalAPIMappingLanguage.g:6479:2: rule__LogicalAndExpression__Group_1__1__Impl rule__LogicalAndExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalAPIMappingLanguage.g:6486:1: rule__LogicalAndExpression__Group_1__1__Impl : ( ( rule__LogicalAndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__LogicalAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6490:1: ( ( ( rule__LogicalAndExpression__OperatorAssignment_1_1 ) ) )
            // InternalAPIMappingLanguage.g:6491:1: ( ( rule__LogicalAndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:6491:1: ( ( rule__LogicalAndExpression__OperatorAssignment_1_1 ) )
            // InternalAPIMappingLanguage.g:6492:1: ( rule__LogicalAndExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAPIMappingLanguage.g:6493:1: ( rule__LogicalAndExpression__OperatorAssignment_1_1 )
            // InternalAPIMappingLanguage.g:6493:2: rule__LogicalAndExpression__OperatorAssignment_1_1
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
    // InternalAPIMappingLanguage.g:6503:1: rule__LogicalAndExpression__Group_1__2 : rule__LogicalAndExpression__Group_1__2__Impl ;
    public final void rule__LogicalAndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6507:1: ( rule__LogicalAndExpression__Group_1__2__Impl )
            // InternalAPIMappingLanguage.g:6508:2: rule__LogicalAndExpression__Group_1__2__Impl
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
    // InternalAPIMappingLanguage.g:6514:1: rule__LogicalAndExpression__Group_1__2__Impl : ( ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__LogicalAndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6518:1: ( ( ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalAPIMappingLanguage.g:6519:1: ( ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalAPIMappingLanguage.g:6519:1: ( ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 ) )
            // InternalAPIMappingLanguage.g:6520:1: ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalAPIMappingLanguage.g:6521:1: ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 )
            // InternalAPIMappingLanguage.g:6521:2: rule__LogicalAndExpression__RightExpressionAssignment_1_2
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
    // InternalAPIMappingLanguage.g:6537:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6541:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // InternalAPIMappingLanguage.g:6542:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_41);
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
    // InternalAPIMappingLanguage.g:6549:1: rule__ComparisonExpression__Group__0__Impl : ( ruleComparisonHigherOpExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6553:1: ( ( ruleComparisonHigherOpExpression ) )
            // InternalAPIMappingLanguage.g:6554:1: ( ruleComparisonHigherOpExpression )
            {
            // InternalAPIMappingLanguage.g:6554:1: ( ruleComparisonHigherOpExpression )
            // InternalAPIMappingLanguage.g:6555:1: ruleComparisonHigherOpExpression
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
    // InternalAPIMappingLanguage.g:6566:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6570:1: ( rule__ComparisonExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:6571:2: rule__ComparisonExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:6577:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )? ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6581:1: ( ( ( rule__ComparisonExpression__Group_1__0 )? ) )
            // InternalAPIMappingLanguage.g:6582:1: ( ( rule__ComparisonExpression__Group_1__0 )? )
            {
            // InternalAPIMappingLanguage.g:6582:1: ( ( rule__ComparisonExpression__Group_1__0 )? )
            // InternalAPIMappingLanguage.g:6583:1: ( rule__ComparisonExpression__Group_1__0 )?
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:6584:1: ( rule__ComparisonExpression__Group_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=29 && LA42_0<=30)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAPIMappingLanguage.g:6584:2: rule__ComparisonExpression__Group_1__0
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
    // InternalAPIMappingLanguage.g:6598:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6602:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:6603:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_41);
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
    // InternalAPIMappingLanguage.g:6610:1: rule__ComparisonExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6614:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:6615:1: ( () )
            {
            // InternalAPIMappingLanguage.g:6615:1: ( () )
            // InternalAPIMappingLanguage.g:6616:1: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0()); 
            // InternalAPIMappingLanguage.g:6617:1: ()
            // InternalAPIMappingLanguage.g:6619:1: 
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
    // InternalAPIMappingLanguage.g:6629:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6633:1: ( rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 )
            // InternalAPIMappingLanguage.g:6634:2: rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalAPIMappingLanguage.g:6641:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6645:1: ( ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) )
            // InternalAPIMappingLanguage.g:6646:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:6646:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            // InternalAPIMappingLanguage.g:6647:1: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAPIMappingLanguage.g:6648:1: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            // InternalAPIMappingLanguage.g:6648:2: rule__ComparisonExpression__OperatorAssignment_1_1
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
    // InternalAPIMappingLanguage.g:6658:1: rule__ComparisonExpression__Group_1__2 : rule__ComparisonExpression__Group_1__2__Impl ;
    public final void rule__ComparisonExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6662:1: ( rule__ComparisonExpression__Group_1__2__Impl )
            // InternalAPIMappingLanguage.g:6663:2: rule__ComparisonExpression__Group_1__2__Impl
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
    // InternalAPIMappingLanguage.g:6669:1: rule__ComparisonExpression__Group_1__2__Impl : ( ( rule__ComparisonExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__ComparisonExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6673:1: ( ( ( rule__ComparisonExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalAPIMappingLanguage.g:6674:1: ( ( rule__ComparisonExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalAPIMappingLanguage.g:6674:1: ( ( rule__ComparisonExpression__RightExpressionAssignment_1_2 ) )
            // InternalAPIMappingLanguage.g:6675:1: ( rule__ComparisonExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalAPIMappingLanguage.g:6676:1: ( rule__ComparisonExpression__RightExpressionAssignment_1_2 )
            // InternalAPIMappingLanguage.g:6676:2: rule__ComparisonExpression__RightExpressionAssignment_1_2
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
    // InternalAPIMappingLanguage.g:6692:1: rule__ComparisonHigherOpExpression__Group__0 : rule__ComparisonHigherOpExpression__Group__0__Impl rule__ComparisonHigherOpExpression__Group__1 ;
    public final void rule__ComparisonHigherOpExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6696:1: ( rule__ComparisonHigherOpExpression__Group__0__Impl rule__ComparisonHigherOpExpression__Group__1 )
            // InternalAPIMappingLanguage.g:6697:2: rule__ComparisonHigherOpExpression__Group__0__Impl rule__ComparisonHigherOpExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_42);
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
    // InternalAPIMappingLanguage.g:6704:1: rule__ComparisonHigherOpExpression__Group__0__Impl : ( ruleArithmeticExpression ) ;
    public final void rule__ComparisonHigherOpExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6708:1: ( ( ruleArithmeticExpression ) )
            // InternalAPIMappingLanguage.g:6709:1: ( ruleArithmeticExpression )
            {
            // InternalAPIMappingLanguage.g:6709:1: ( ruleArithmeticExpression )
            // InternalAPIMappingLanguage.g:6710:1: ruleArithmeticExpression
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
    // InternalAPIMappingLanguage.g:6721:1: rule__ComparisonHigherOpExpression__Group__1 : rule__ComparisonHigherOpExpression__Group__1__Impl ;
    public final void rule__ComparisonHigherOpExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6725:1: ( rule__ComparisonHigherOpExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:6726:2: rule__ComparisonHigherOpExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:6732:1: rule__ComparisonHigherOpExpression__Group__1__Impl : ( ( rule__ComparisonHigherOpExpression__Group_1__0 )? ) ;
    public final void rule__ComparisonHigherOpExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6736:1: ( ( ( rule__ComparisonHigherOpExpression__Group_1__0 )? ) )
            // InternalAPIMappingLanguage.g:6737:1: ( ( rule__ComparisonHigherOpExpression__Group_1__0 )? )
            {
            // InternalAPIMappingLanguage.g:6737:1: ( ( rule__ComparisonHigherOpExpression__Group_1__0 )? )
            // InternalAPIMappingLanguage.g:6738:1: ( rule__ComparisonHigherOpExpression__Group_1__0 )?
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:6739:1: ( rule__ComparisonHigherOpExpression__Group_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=31 && LA43_0<=34)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAPIMappingLanguage.g:6739:2: rule__ComparisonHigherOpExpression__Group_1__0
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
    // InternalAPIMappingLanguage.g:6753:1: rule__ComparisonHigherOpExpression__Group_1__0 : rule__ComparisonHigherOpExpression__Group_1__0__Impl rule__ComparisonHigherOpExpression__Group_1__1 ;
    public final void rule__ComparisonHigherOpExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6757:1: ( rule__ComparisonHigherOpExpression__Group_1__0__Impl rule__ComparisonHigherOpExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:6758:2: rule__ComparisonHigherOpExpression__Group_1__0__Impl rule__ComparisonHigherOpExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_42);
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
    // InternalAPIMappingLanguage.g:6765:1: rule__ComparisonHigherOpExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonHigherOpExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6769:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:6770:1: ( () )
            {
            // InternalAPIMappingLanguage.g:6770:1: ( () )
            // InternalAPIMappingLanguage.g:6771:1: ()
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0()); 
            // InternalAPIMappingLanguage.g:6772:1: ()
            // InternalAPIMappingLanguage.g:6774:1: 
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
    // InternalAPIMappingLanguage.g:6784:1: rule__ComparisonHigherOpExpression__Group_1__1 : rule__ComparisonHigherOpExpression__Group_1__1__Impl rule__ComparisonHigherOpExpression__Group_1__2 ;
    public final void rule__ComparisonHigherOpExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6788:1: ( rule__ComparisonHigherOpExpression__Group_1__1__Impl rule__ComparisonHigherOpExpression__Group_1__2 )
            // InternalAPIMappingLanguage.g:6789:2: rule__ComparisonHigherOpExpression__Group_1__1__Impl rule__ComparisonHigherOpExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalAPIMappingLanguage.g:6796:1: rule__ComparisonHigherOpExpression__Group_1__1__Impl : ( ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonHigherOpExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6800:1: ( ( ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 ) ) )
            // InternalAPIMappingLanguage.g:6801:1: ( ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:6801:1: ( ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 ) )
            // InternalAPIMappingLanguage.g:6802:1: ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAPIMappingLanguage.g:6803:1: ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 )
            // InternalAPIMappingLanguage.g:6803:2: rule__ComparisonHigherOpExpression__OperatorAssignment_1_1
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
    // InternalAPIMappingLanguage.g:6813:1: rule__ComparisonHigherOpExpression__Group_1__2 : rule__ComparisonHigherOpExpression__Group_1__2__Impl ;
    public final void rule__ComparisonHigherOpExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6817:1: ( rule__ComparisonHigherOpExpression__Group_1__2__Impl )
            // InternalAPIMappingLanguage.g:6818:2: rule__ComparisonHigherOpExpression__Group_1__2__Impl
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
    // InternalAPIMappingLanguage.g:6824:1: rule__ComparisonHigherOpExpression__Group_1__2__Impl : ( ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__ComparisonHigherOpExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6828:1: ( ( ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalAPIMappingLanguage.g:6829:1: ( ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalAPIMappingLanguage.g:6829:1: ( ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 ) )
            // InternalAPIMappingLanguage.g:6830:1: ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalAPIMappingLanguage.g:6831:1: ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 )
            // InternalAPIMappingLanguage.g:6831:2: rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2
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
    // InternalAPIMappingLanguage.g:6847:1: rule__AdditionExpression__Group__0 : rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 ;
    public final void rule__AdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6851:1: ( rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 )
            // InternalAPIMappingLanguage.g:6852:2: rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_43);
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
    // InternalAPIMappingLanguage.g:6859:1: rule__AdditionExpression__Group__0__Impl : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6863:1: ( ( ruleMultiplicationExpression ) )
            // InternalAPIMappingLanguage.g:6864:1: ( ruleMultiplicationExpression )
            {
            // InternalAPIMappingLanguage.g:6864:1: ( ruleMultiplicationExpression )
            // InternalAPIMappingLanguage.g:6865:1: ruleMultiplicationExpression
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
    // InternalAPIMappingLanguage.g:6876:1: rule__AdditionExpression__Group__1 : rule__AdditionExpression__Group__1__Impl ;
    public final void rule__AdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6880:1: ( rule__AdditionExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:6881:2: rule__AdditionExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:6887:1: rule__AdditionExpression__Group__1__Impl : ( ( rule__AdditionExpression__Group_1__0 )* ) ;
    public final void rule__AdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6891:1: ( ( ( rule__AdditionExpression__Group_1__0 )* ) )
            // InternalAPIMappingLanguage.g:6892:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:6892:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            // InternalAPIMappingLanguage.g:6893:1: ( rule__AdditionExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:6894:1: ( rule__AdditionExpression__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=35 && LA44_0<=36)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:6894:2: rule__AdditionExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_44);
            	    rule__AdditionExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalAPIMappingLanguage.g:6908:1: rule__AdditionExpression__Group_1__0 : rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 ;
    public final void rule__AdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6912:1: ( rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:6913:2: rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_43);
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
    // InternalAPIMappingLanguage.g:6920:1: rule__AdditionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6924:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:6925:1: ( () )
            {
            // InternalAPIMappingLanguage.g:6925:1: ( () )
            // InternalAPIMappingLanguage.g:6926:1: ()
            {
             before(grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0()); 
            // InternalAPIMappingLanguage.g:6927:1: ()
            // InternalAPIMappingLanguage.g:6929:1: 
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
    // InternalAPIMappingLanguage.g:6939:1: rule__AdditionExpression__Group_1__1 : rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 ;
    public final void rule__AdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6943:1: ( rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 )
            // InternalAPIMappingLanguage.g:6944:2: rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalAPIMappingLanguage.g:6951:1: rule__AdditionExpression__Group_1__1__Impl : ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6955:1: ( ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) )
            // InternalAPIMappingLanguage.g:6956:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:6956:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            // InternalAPIMappingLanguage.g:6957:1: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAPIMappingLanguage.g:6958:1: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            // InternalAPIMappingLanguage.g:6958:2: rule__AdditionExpression__OperatorAssignment_1_1
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
    // InternalAPIMappingLanguage.g:6968:1: rule__AdditionExpression__Group_1__2 : rule__AdditionExpression__Group_1__2__Impl ;
    public final void rule__AdditionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6972:1: ( rule__AdditionExpression__Group_1__2__Impl )
            // InternalAPIMappingLanguage.g:6973:2: rule__AdditionExpression__Group_1__2__Impl
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
    // InternalAPIMappingLanguage.g:6979:1: rule__AdditionExpression__Group_1__2__Impl : ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__AdditionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6983:1: ( ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalAPIMappingLanguage.g:6984:1: ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalAPIMappingLanguage.g:6984:1: ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) )
            // InternalAPIMappingLanguage.g:6985:1: ( rule__AdditionExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalAPIMappingLanguage.g:6986:1: ( rule__AdditionExpression__RightExpressionAssignment_1_2 )
            // InternalAPIMappingLanguage.g:6986:2: rule__AdditionExpression__RightExpressionAssignment_1_2
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
    // InternalAPIMappingLanguage.g:7002:1: rule__MultiplicationExpression__Group_1__0 : rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 ;
    public final void rule__MultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7006:1: ( rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:7007:2: rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalAPIMappingLanguage.g:7014:1: rule__MultiplicationExpression__Group_1__0__Impl : ( ruleTypeCastExpression ) ;
    public final void rule__MultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7018:1: ( ( ruleTypeCastExpression ) )
            // InternalAPIMappingLanguage.g:7019:1: ( ruleTypeCastExpression )
            {
            // InternalAPIMappingLanguage.g:7019:1: ( ruleTypeCastExpression )
            // InternalAPIMappingLanguage.g:7020:1: ruleTypeCastExpression
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
    // InternalAPIMappingLanguage.g:7031:1: rule__MultiplicationExpression__Group_1__1 : rule__MultiplicationExpression__Group_1__1__Impl ;
    public final void rule__MultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7035:1: ( rule__MultiplicationExpression__Group_1__1__Impl )
            // InternalAPIMappingLanguage.g:7036:2: rule__MultiplicationExpression__Group_1__1__Impl
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
    // InternalAPIMappingLanguage.g:7042:1: rule__MultiplicationExpression__Group_1__1__Impl : ( ( rule__MultiplicationExpression__Group_1_1__0 )* ) ;
    public final void rule__MultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7046:1: ( ( ( rule__MultiplicationExpression__Group_1_1__0 )* ) )
            // InternalAPIMappingLanguage.g:7047:1: ( ( rule__MultiplicationExpression__Group_1_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:7047:1: ( ( rule__MultiplicationExpression__Group_1_1__0 )* )
            // InternalAPIMappingLanguage.g:7048:1: ( rule__MultiplicationExpression__Group_1_1__0 )*
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1_1()); 
            // InternalAPIMappingLanguage.g:7049:1: ( rule__MultiplicationExpression__Group_1_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=37 && LA45_0<=39)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:7049:2: rule__MultiplicationExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_46);
            	    rule__MultiplicationExpression__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalAPIMappingLanguage.g:7063:1: rule__MultiplicationExpression__Group_1_1__0 : rule__MultiplicationExpression__Group_1_1__0__Impl rule__MultiplicationExpression__Group_1_1__1 ;
    public final void rule__MultiplicationExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7067:1: ( rule__MultiplicationExpression__Group_1_1__0__Impl rule__MultiplicationExpression__Group_1_1__1 )
            // InternalAPIMappingLanguage.g:7068:2: rule__MultiplicationExpression__Group_1_1__0__Impl rule__MultiplicationExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_45);
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
    // InternalAPIMappingLanguage.g:7075:1: rule__MultiplicationExpression__Group_1_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7079:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:7080:1: ( () )
            {
            // InternalAPIMappingLanguage.g:7080:1: ( () )
            // InternalAPIMappingLanguage.g:7081:1: ()
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_1_0()); 
            // InternalAPIMappingLanguage.g:7082:1: ()
            // InternalAPIMappingLanguage.g:7084:1: 
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
    // InternalAPIMappingLanguage.g:7094:1: rule__MultiplicationExpression__Group_1_1__1 : rule__MultiplicationExpression__Group_1_1__1__Impl rule__MultiplicationExpression__Group_1_1__2 ;
    public final void rule__MultiplicationExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7098:1: ( rule__MultiplicationExpression__Group_1_1__1__Impl rule__MultiplicationExpression__Group_1_1__2 )
            // InternalAPIMappingLanguage.g:7099:2: rule__MultiplicationExpression__Group_1_1__1__Impl rule__MultiplicationExpression__Group_1_1__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalAPIMappingLanguage.g:7106:1: rule__MultiplicationExpression__Group_1_1__1__Impl : ( ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 ) ) ;
    public final void rule__MultiplicationExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7110:1: ( ( ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 ) ) )
            // InternalAPIMappingLanguage.g:7111:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:7111:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 ) )
            // InternalAPIMappingLanguage.g:7112:1: ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1_1()); 
            // InternalAPIMappingLanguage.g:7113:1: ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 )
            // InternalAPIMappingLanguage.g:7113:2: rule__MultiplicationExpression__OperatorAssignment_1_1_1
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
    // InternalAPIMappingLanguage.g:7123:1: rule__MultiplicationExpression__Group_1_1__2 : rule__MultiplicationExpression__Group_1_1__2__Impl ;
    public final void rule__MultiplicationExpression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7127:1: ( rule__MultiplicationExpression__Group_1_1__2__Impl )
            // InternalAPIMappingLanguage.g:7128:2: rule__MultiplicationExpression__Group_1_1__2__Impl
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
    // InternalAPIMappingLanguage.g:7134:1: rule__MultiplicationExpression__Group_1_1__2__Impl : ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 ) ) ;
    public final void rule__MultiplicationExpression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7138:1: ( ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 ) ) )
            // InternalAPIMappingLanguage.g:7139:1: ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 ) )
            {
            // InternalAPIMappingLanguage.g:7139:1: ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 ) )
            // InternalAPIMappingLanguage.g:7140:1: ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAssignment_1_1_2()); 
            // InternalAPIMappingLanguage.g:7141:1: ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 )
            // InternalAPIMappingLanguage.g:7141:2: rule__MultiplicationExpression__RightExpressionAssignment_1_1_2
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
    // InternalAPIMappingLanguage.g:7157:1: rule__UnaryPreExpression__Group__0 : rule__UnaryPreExpression__Group__0__Impl rule__UnaryPreExpression__Group__1 ;
    public final void rule__UnaryPreExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7161:1: ( rule__UnaryPreExpression__Group__0__Impl rule__UnaryPreExpression__Group__1 )
            // InternalAPIMappingLanguage.g:7162:2: rule__UnaryPreExpression__Group__0__Impl rule__UnaryPreExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_47);
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
    // InternalAPIMappingLanguage.g:7169:1: rule__UnaryPreExpression__Group__0__Impl : ( () ) ;
    public final void rule__UnaryPreExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7173:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:7174:1: ( () )
            {
            // InternalAPIMappingLanguage.g:7174:1: ( () )
            // InternalAPIMappingLanguage.g:7175:1: ()
            {
             before(grammarAccess.getUnaryPreExpressionAccess().getUnaryExpressionAction_0()); 
            // InternalAPIMappingLanguage.g:7176:1: ()
            // InternalAPIMappingLanguage.g:7178:1: 
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
    // InternalAPIMappingLanguage.g:7188:1: rule__UnaryPreExpression__Group__1 : rule__UnaryPreExpression__Group__1__Impl rule__UnaryPreExpression__Group__2 ;
    public final void rule__UnaryPreExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7192:1: ( rule__UnaryPreExpression__Group__1__Impl rule__UnaryPreExpression__Group__2 )
            // InternalAPIMappingLanguage.g:7193:2: rule__UnaryPreExpression__Group__1__Impl rule__UnaryPreExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalAPIMappingLanguage.g:7200:1: rule__UnaryPreExpression__Group__1__Impl : ( ( rule__UnaryPreExpression__OperatorAssignment_1 ) ) ;
    public final void rule__UnaryPreExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7204:1: ( ( ( rule__UnaryPreExpression__OperatorAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:7205:1: ( ( rule__UnaryPreExpression__OperatorAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:7205:1: ( ( rule__UnaryPreExpression__OperatorAssignment_1 ) )
            // InternalAPIMappingLanguage.g:7206:1: ( rule__UnaryPreExpression__OperatorAssignment_1 )
            {
             before(grammarAccess.getUnaryPreExpressionAccess().getOperatorAssignment_1()); 
            // InternalAPIMappingLanguage.g:7207:1: ( rule__UnaryPreExpression__OperatorAssignment_1 )
            // InternalAPIMappingLanguage.g:7207:2: rule__UnaryPreExpression__OperatorAssignment_1
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
    // InternalAPIMappingLanguage.g:7217:1: rule__UnaryPreExpression__Group__2 : rule__UnaryPreExpression__Group__2__Impl ;
    public final void rule__UnaryPreExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7221:1: ( rule__UnaryPreExpression__Group__2__Impl )
            // InternalAPIMappingLanguage.g:7222:2: rule__UnaryPreExpression__Group__2__Impl
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
    // InternalAPIMappingLanguage.g:7228:1: rule__UnaryPreExpression__Group__2__Impl : ( ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 ) ) ;
    public final void rule__UnaryPreExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7232:1: ( ( ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:7233:1: ( ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:7233:1: ( ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 ) )
            // InternalAPIMappingLanguage.g:7234:1: ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 )
            {
             before(grammarAccess.getUnaryPreExpressionAccess().getEnclosedExpressionAssignment_2()); 
            // InternalAPIMappingLanguage.g:7235:1: ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 )
            // InternalAPIMappingLanguage.g:7235:2: rule__UnaryPreExpression__EnclosedExpressionAssignment_2
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
    // InternalAPIMappingLanguage.g:7251:1: rule__TypeCastExpression__Group_1__0 : rule__TypeCastExpression__Group_1__0__Impl rule__TypeCastExpression__Group_1__1 ;
    public final void rule__TypeCastExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7255:1: ( rule__TypeCastExpression__Group_1__0__Impl rule__TypeCastExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:7256:2: rule__TypeCastExpression__Group_1__0__Impl rule__TypeCastExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalAPIMappingLanguage.g:7263:1: rule__TypeCastExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TypeCastExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7267:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:7268:1: ( () )
            {
            // InternalAPIMappingLanguage.g:7268:1: ( () )
            // InternalAPIMappingLanguage.g:7269:1: ()
            {
             before(grammarAccess.getTypeCastExpressionAccess().getTypeCastExpressionAction_1_0()); 
            // InternalAPIMappingLanguage.g:7270:1: ()
            // InternalAPIMappingLanguage.g:7272:1: 
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
    // InternalAPIMappingLanguage.g:7282:1: rule__TypeCastExpression__Group_1__1 : rule__TypeCastExpression__Group_1__1__Impl rule__TypeCastExpression__Group_1__2 ;
    public final void rule__TypeCastExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7286:1: ( rule__TypeCastExpression__Group_1__1__Impl rule__TypeCastExpression__Group_1__2 )
            // InternalAPIMappingLanguage.g:7287:2: rule__TypeCastExpression__Group_1__1__Impl rule__TypeCastExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
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
    // InternalAPIMappingLanguage.g:7294:1: rule__TypeCastExpression__Group_1__1__Impl : ( '(' ) ;
    public final void rule__TypeCastExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7298:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:7299:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:7299:1: ( '(' )
            // InternalAPIMappingLanguage.g:7300:1: '('
            {
             before(grammarAccess.getTypeCastExpressionAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,56,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:7313:1: rule__TypeCastExpression__Group_1__2 : rule__TypeCastExpression__Group_1__2__Impl rule__TypeCastExpression__Group_1__3 ;
    public final void rule__TypeCastExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7317:1: ( rule__TypeCastExpression__Group_1__2__Impl rule__TypeCastExpression__Group_1__3 )
            // InternalAPIMappingLanguage.g:7318:2: rule__TypeCastExpression__Group_1__2__Impl rule__TypeCastExpression__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_21);
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
    // InternalAPIMappingLanguage.g:7325:1: rule__TypeCastExpression__Group_1__2__Impl : ( ( rule__TypeCastExpression__DataTypeAssignment_1_2 ) ) ;
    public final void rule__TypeCastExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7329:1: ( ( ( rule__TypeCastExpression__DataTypeAssignment_1_2 ) ) )
            // InternalAPIMappingLanguage.g:7330:1: ( ( rule__TypeCastExpression__DataTypeAssignment_1_2 ) )
            {
            // InternalAPIMappingLanguage.g:7330:1: ( ( rule__TypeCastExpression__DataTypeAssignment_1_2 ) )
            // InternalAPIMappingLanguage.g:7331:1: ( rule__TypeCastExpression__DataTypeAssignment_1_2 )
            {
             before(grammarAccess.getTypeCastExpressionAccess().getDataTypeAssignment_1_2()); 
            // InternalAPIMappingLanguage.g:7332:1: ( rule__TypeCastExpression__DataTypeAssignment_1_2 )
            // InternalAPIMappingLanguage.g:7332:2: rule__TypeCastExpression__DataTypeAssignment_1_2
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
    // InternalAPIMappingLanguage.g:7342:1: rule__TypeCastExpression__Group_1__3 : rule__TypeCastExpression__Group_1__3__Impl rule__TypeCastExpression__Group_1__4 ;
    public final void rule__TypeCastExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7346:1: ( rule__TypeCastExpression__Group_1__3__Impl rule__TypeCastExpression__Group_1__4 )
            // InternalAPIMappingLanguage.g:7347:2: rule__TypeCastExpression__Group_1__3__Impl rule__TypeCastExpression__Group_1__4
            {
            pushFollow(FollowSets000.FOLLOW_48);
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
    // InternalAPIMappingLanguage.g:7354:1: rule__TypeCastExpression__Group_1__3__Impl : ( ')' ) ;
    public final void rule__TypeCastExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7358:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:7359:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:7359:1: ( ')' )
            // InternalAPIMappingLanguage.g:7360:1: ')'
            {
             before(grammarAccess.getTypeCastExpressionAccess().getRightParenthesisKeyword_1_3()); 
            match(input,57,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:7373:1: rule__TypeCastExpression__Group_1__4 : rule__TypeCastExpression__Group_1__4__Impl ;
    public final void rule__TypeCastExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7377:1: ( rule__TypeCastExpression__Group_1__4__Impl )
            // InternalAPIMappingLanguage.g:7378:2: rule__TypeCastExpression__Group_1__4__Impl
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
    // InternalAPIMappingLanguage.g:7384:1: rule__TypeCastExpression__Group_1__4__Impl : ( ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 ) ) ;
    public final void rule__TypeCastExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7388:1: ( ( ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 ) ) )
            // InternalAPIMappingLanguage.g:7389:1: ( ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 ) )
            {
            // InternalAPIMappingLanguage.g:7389:1: ( ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 ) )
            // InternalAPIMappingLanguage.g:7390:1: ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 )
            {
             before(grammarAccess.getTypeCastExpressionAccess().getEnclosedExpressionAssignment_1_4()); 
            // InternalAPIMappingLanguage.g:7391:1: ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 )
            // InternalAPIMappingLanguage.g:7391:2: rule__TypeCastExpression__EnclosedExpressionAssignment_1_4
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


    // $ANTLR start "rule__LiteralExpression__Group__0"
    // InternalAPIMappingLanguage.g:7411:1: rule__LiteralExpression__Group__0 : rule__LiteralExpression__Group__0__Impl rule__LiteralExpression__Group__1 ;
    public final void rule__LiteralExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7415:1: ( rule__LiteralExpression__Group__0__Impl rule__LiteralExpression__Group__1 )
            // InternalAPIMappingLanguage.g:7416:2: rule__LiteralExpression__Group__0__Impl rule__LiteralExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_49);
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
    // InternalAPIMappingLanguage.g:7423:1: rule__LiteralExpression__Group__0__Impl : ( () ) ;
    public final void rule__LiteralExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7427:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:7428:1: ( () )
            {
            // InternalAPIMappingLanguage.g:7428:1: ( () )
            // InternalAPIMappingLanguage.g:7429:1: ()
            {
             before(grammarAccess.getLiteralExpressionAccess().getLiteralExpressionAction_0()); 
            // InternalAPIMappingLanguage.g:7430:1: ()
            // InternalAPIMappingLanguage.g:7432:1: 
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
    // InternalAPIMappingLanguage.g:7442:1: rule__LiteralExpression__Group__1 : rule__LiteralExpression__Group__1__Impl ;
    public final void rule__LiteralExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7446:1: ( rule__LiteralExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:7447:2: rule__LiteralExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:7453:1: rule__LiteralExpression__Group__1__Impl : ( ( rule__LiteralExpression__ValueAssignment_1 ) ) ;
    public final void rule__LiteralExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7457:1: ( ( ( rule__LiteralExpression__ValueAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:7458:1: ( ( rule__LiteralExpression__ValueAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:7458:1: ( ( rule__LiteralExpression__ValueAssignment_1 ) )
            // InternalAPIMappingLanguage.g:7459:1: ( rule__LiteralExpression__ValueAssignment_1 )
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueAssignment_1()); 
            // InternalAPIMappingLanguage.g:7460:1: ( rule__LiteralExpression__ValueAssignment_1 )
            // InternalAPIMappingLanguage.g:7460:2: rule__LiteralExpression__ValueAssignment_1
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


    // $ANTLR start "rule__TimeValue__Group__0"
    // InternalAPIMappingLanguage.g:7474:1: rule__TimeValue__Group__0 : rule__TimeValue__Group__0__Impl rule__TimeValue__Group__1 ;
    public final void rule__TimeValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7478:1: ( rule__TimeValue__Group__0__Impl rule__TimeValue__Group__1 )
            // InternalAPIMappingLanguage.g:7479:2: rule__TimeValue__Group__0__Impl rule__TimeValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_50);
            rule__TimeValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TimeValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeValue__Group__0"


    // $ANTLR start "rule__TimeValue__Group__0__Impl"
    // InternalAPIMappingLanguage.g:7486:1: rule__TimeValue__Group__0__Impl : ( ( rule__TimeValue__ValueAssignment_0 ) ) ;
    public final void rule__TimeValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7490:1: ( ( ( rule__TimeValue__ValueAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:7491:1: ( ( rule__TimeValue__ValueAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:7491:1: ( ( rule__TimeValue__ValueAssignment_0 ) )
            // InternalAPIMappingLanguage.g:7492:1: ( rule__TimeValue__ValueAssignment_0 )
            {
             before(grammarAccess.getTimeValueAccess().getValueAssignment_0()); 
            // InternalAPIMappingLanguage.g:7493:1: ( rule__TimeValue__ValueAssignment_0 )
            // InternalAPIMappingLanguage.g:7493:2: rule__TimeValue__ValueAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TimeValue__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTimeValueAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeValue__Group__0__Impl"


    // $ANTLR start "rule__TimeValue__Group__1"
    // InternalAPIMappingLanguage.g:7503:1: rule__TimeValue__Group__1 : rule__TimeValue__Group__1__Impl ;
    public final void rule__TimeValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7507:1: ( rule__TimeValue__Group__1__Impl )
            // InternalAPIMappingLanguage.g:7508:2: rule__TimeValue__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TimeValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeValue__Group__1"


    // $ANTLR start "rule__TimeValue__Group__1__Impl"
    // InternalAPIMappingLanguage.g:7514:1: rule__TimeValue__Group__1__Impl : ( ( rule__TimeValue__UnitAssignment_1 ) ) ;
    public final void rule__TimeValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7518:1: ( ( ( rule__TimeValue__UnitAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:7519:1: ( ( rule__TimeValue__UnitAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:7519:1: ( ( rule__TimeValue__UnitAssignment_1 ) )
            // InternalAPIMappingLanguage.g:7520:1: ( rule__TimeValue__UnitAssignment_1 )
            {
             before(grammarAccess.getTimeValueAccess().getUnitAssignment_1()); 
            // InternalAPIMappingLanguage.g:7521:1: ( rule__TimeValue__UnitAssignment_1 )
            // InternalAPIMappingLanguage.g:7521:2: rule__TimeValue__UnitAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TimeValue__UnitAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeValueAccess().getUnitAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeValue__Group__1__Impl"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group__0"
    // InternalAPIMappingLanguage.g:7535:1: rule__ExtendedTypedNamedElementExpression__Group__0 : rule__ExtendedTypedNamedElementExpression__Group__0__Impl rule__ExtendedTypedNamedElementExpression__Group__1 ;
    public final void rule__ExtendedTypedNamedElementExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7539:1: ( rule__ExtendedTypedNamedElementExpression__Group__0__Impl rule__ExtendedTypedNamedElementExpression__Group__1 )
            // InternalAPIMappingLanguage.g:7540:2: rule__ExtendedTypedNamedElementExpression__Group__0__Impl rule__ExtendedTypedNamedElementExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_51);
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
    // InternalAPIMappingLanguage.g:7547:1: rule__ExtendedTypedNamedElementExpression__Group__0__Impl : ( ruleTypedNamedElementExpression ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7551:1: ( ( ruleTypedNamedElementExpression ) )
            // InternalAPIMappingLanguage.g:7552:1: ( ruleTypedNamedElementExpression )
            {
            // InternalAPIMappingLanguage.g:7552:1: ( ruleTypedNamedElementExpression )
            // InternalAPIMappingLanguage.g:7553:1: ruleTypedNamedElementExpression
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
    // InternalAPIMappingLanguage.g:7564:1: rule__ExtendedTypedNamedElementExpression__Group__1 : rule__ExtendedTypedNamedElementExpression__Group__1__Impl ;
    public final void rule__ExtendedTypedNamedElementExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7568:1: ( rule__ExtendedTypedNamedElementExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:7569:2: rule__ExtendedTypedNamedElementExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:7575:1: rule__ExtendedTypedNamedElementExpression__Group__1__Impl : ( ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )? ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7579:1: ( ( ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )? ) )
            // InternalAPIMappingLanguage.g:7580:1: ( ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )? )
            {
            // InternalAPIMappingLanguage.g:7580:1: ( ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )? )
            // InternalAPIMappingLanguage.g:7581:1: ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )?
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getAlternatives_1()); 
            // InternalAPIMappingLanguage.g:7582:1: ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=24 && LA46_0<=25)||LA46_0==69) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAPIMappingLanguage.g:7582:2: rule__ExtendedTypedNamedElementExpression__Alternatives_1
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
    // InternalAPIMappingLanguage.g:7596:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__0 : rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__1 ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7600:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__1 )
            // InternalAPIMappingLanguage.g:7601:2: rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_52);
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
    // InternalAPIMappingLanguage.g:7608:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7612:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:7613:1: ( () )
            {
            // InternalAPIMappingLanguage.g:7613:1: ( () )
            // InternalAPIMappingLanguage.g:7614:1: ()
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getDiscreteInteractionEndpointReferenceTypedNamedElementExpressionAction_1_0_0()); 
            // InternalAPIMappingLanguage.g:7615:1: ()
            // InternalAPIMappingLanguage.g:7617:1: 
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
    // InternalAPIMappingLanguage.g:7627:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__1 : rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__2 ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7631:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__2 )
            // InternalAPIMappingLanguage.g:7632:2: rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_53);
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
    // InternalAPIMappingLanguage.g:7639:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl : ( '->' ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7643:1: ( ( '->' ) )
            // InternalAPIMappingLanguage.g:7644:1: ( '->' )
            {
            // InternalAPIMappingLanguage.g:7644:1: ( '->' )
            // InternalAPIMappingLanguage.g:7645:1: '->'
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_0_1()); 
            match(input,69,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:7658:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__2 : rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7662:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl )
            // InternalAPIMappingLanguage.g:7663:2: rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl
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
    // InternalAPIMappingLanguage.g:7669:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl : ( ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 ) ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7673:1: ( ( ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 ) ) )
            // InternalAPIMappingLanguage.g:7674:1: ( ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 ) )
            {
            // InternalAPIMappingLanguage.g:7674:1: ( ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 ) )
            // InternalAPIMappingLanguage.g:7675:1: ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 )
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getPositionAssignment_1_0_2()); 
            // InternalAPIMappingLanguage.g:7676:1: ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 )
            // InternalAPIMappingLanguage.g:7676:2: rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2
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
    // InternalAPIMappingLanguage.g:7692:1: rule__ExtendedTypedNamedElementExpression__Group_1_1__0 : rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_1__1 ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7696:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_1__1 )
            // InternalAPIMappingLanguage.g:7697:2: rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_51);
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
    // InternalAPIMappingLanguage.g:7704:1: rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7708:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:7709:1: ( () )
            {
            // InternalAPIMappingLanguage.g:7709:1: ( () )
            // InternalAPIMappingLanguage.g:7710:1: ()
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getAssignmentLhs_typedNamedElementExpressionAction_1_1_0()); 
            // InternalAPIMappingLanguage.g:7711:1: ()
            // InternalAPIMappingLanguage.g:7713:1: 
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
    // InternalAPIMappingLanguage.g:7723:1: rule__ExtendedTypedNamedElementExpression__Group_1_1__1 : rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7727:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl )
            // InternalAPIMappingLanguage.g:7728:2: rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl
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
    // InternalAPIMappingLanguage.g:7734:1: rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl : ( ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 ) ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7738:1: ( ( ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 ) ) )
            // InternalAPIMappingLanguage.g:7739:1: ( ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:7739:1: ( ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 ) )
            // InternalAPIMappingLanguage.g:7740:1: ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 )
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getIncrementDecrementOperatorAssignment_1_1_1()); 
            // InternalAPIMappingLanguage.g:7741:1: ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 )
            // InternalAPIMappingLanguage.g:7741:2: rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1
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
    // InternalAPIMappingLanguage.g:7755:1: rule__TypedNamedElementExpression__Group__0 : rule__TypedNamedElementExpression__Group__0__Impl rule__TypedNamedElementExpression__Group__1 ;
    public final void rule__TypedNamedElementExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7759:1: ( rule__TypedNamedElementExpression__Group__0__Impl rule__TypedNamedElementExpression__Group__1 )
            // InternalAPIMappingLanguage.g:7760:2: rule__TypedNamedElementExpression__Group__0__Impl rule__TypedNamedElementExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_54);
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
    // InternalAPIMappingLanguage.g:7767:1: rule__TypedNamedElementExpression__Group__0__Impl : ( ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 ) ) ;
    public final void rule__TypedNamedElementExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7771:1: ( ( ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:7772:1: ( ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:7772:1: ( ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 ) )
            // InternalAPIMappingLanguage.g:7773:1: ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 )
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementAssignment_0()); 
            // InternalAPIMappingLanguage.g:7774:1: ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 )
            // InternalAPIMappingLanguage.g:7774:2: rule__TypedNamedElementExpression__TypedNamedElementAssignment_0
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
    // InternalAPIMappingLanguage.g:7784:1: rule__TypedNamedElementExpression__Group__1 : rule__TypedNamedElementExpression__Group__1__Impl ;
    public final void rule__TypedNamedElementExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7788:1: ( rule__TypedNamedElementExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:7789:2: rule__TypedNamedElementExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:7795:1: rule__TypedNamedElementExpression__Group__1__Impl : ( ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )* ) ;
    public final void rule__TypedNamedElementExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7799:1: ( ( ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )* ) )
            // InternalAPIMappingLanguage.g:7800:1: ( ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )* )
            {
            // InternalAPIMappingLanguage.g:7800:1: ( ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )* )
            // InternalAPIMappingLanguage.g:7801:1: ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )*
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsAssignment_1()); 
            // InternalAPIMappingLanguage.g:7802:1: ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==59||LA47_0==67) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:7802:2: rule__TypedNamedElementExpression__ElementAccessorsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_55);
            	    rule__TypedNamedElementExpression__ElementAccessorsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalAPIMappingLanguage.g:7816:1: rule__ArrayIndexExpression__Group__0 : rule__ArrayIndexExpression__Group__0__Impl rule__ArrayIndexExpression__Group__1 ;
    public final void rule__ArrayIndexExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7820:1: ( rule__ArrayIndexExpression__Group__0__Impl rule__ArrayIndexExpression__Group__1 )
            // InternalAPIMappingLanguage.g:7821:2: rule__ArrayIndexExpression__Group__0__Impl rule__ArrayIndexExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
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
    // InternalAPIMappingLanguage.g:7828:1: rule__ArrayIndexExpression__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayIndexExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7832:1: ( ( '[' ) )
            // InternalAPIMappingLanguage.g:7833:1: ( '[' )
            {
            // InternalAPIMappingLanguage.g:7833:1: ( '[' )
            // InternalAPIMappingLanguage.g:7834:1: '['
            {
             before(grammarAccess.getArrayIndexExpressionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,67,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:7847:1: rule__ArrayIndexExpression__Group__1 : rule__ArrayIndexExpression__Group__1__Impl rule__ArrayIndexExpression__Group__2 ;
    public final void rule__ArrayIndexExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7851:1: ( rule__ArrayIndexExpression__Group__1__Impl rule__ArrayIndexExpression__Group__2 )
            // InternalAPIMappingLanguage.g:7852:2: rule__ArrayIndexExpression__Group__1__Impl rule__ArrayIndexExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_56);
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
    // InternalAPIMappingLanguage.g:7859:1: rule__ArrayIndexExpression__Group__1__Impl : ( ( rule__ArrayIndexExpression__IndexAssignment_1 ) ) ;
    public final void rule__ArrayIndexExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7863:1: ( ( ( rule__ArrayIndexExpression__IndexAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:7864:1: ( ( rule__ArrayIndexExpression__IndexAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:7864:1: ( ( rule__ArrayIndexExpression__IndexAssignment_1 ) )
            // InternalAPIMappingLanguage.g:7865:1: ( rule__ArrayIndexExpression__IndexAssignment_1 )
            {
             before(grammarAccess.getArrayIndexExpressionAccess().getIndexAssignment_1()); 
            // InternalAPIMappingLanguage.g:7866:1: ( rule__ArrayIndexExpression__IndexAssignment_1 )
            // InternalAPIMappingLanguage.g:7866:2: rule__ArrayIndexExpression__IndexAssignment_1
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
    // InternalAPIMappingLanguage.g:7876:1: rule__ArrayIndexExpression__Group__2 : rule__ArrayIndexExpression__Group__2__Impl ;
    public final void rule__ArrayIndexExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7880:1: ( rule__ArrayIndexExpression__Group__2__Impl )
            // InternalAPIMappingLanguage.g:7881:2: rule__ArrayIndexExpression__Group__2__Impl
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
    // InternalAPIMappingLanguage.g:7887:1: rule__ArrayIndexExpression__Group__2__Impl : ( ']' ) ;
    public final void rule__ArrayIndexExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7891:1: ( ( ']' ) )
            // InternalAPIMappingLanguage.g:7892:1: ( ']' )
            {
            // InternalAPIMappingLanguage.g:7892:1: ( ']' )
            // InternalAPIMappingLanguage.g:7893:1: ']'
            {
             before(grammarAccess.getArrayIndexExpressionAccess().getRightSquareBracketKeyword_2()); 
            match(input,68,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:7912:1: rule__AttributeAccessorExpression__Group__0 : rule__AttributeAccessorExpression__Group__0__Impl rule__AttributeAccessorExpression__Group__1 ;
    public final void rule__AttributeAccessorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7916:1: ( rule__AttributeAccessorExpression__Group__0__Impl rule__AttributeAccessorExpression__Group__1 )
            // InternalAPIMappingLanguage.g:7917:2: rule__AttributeAccessorExpression__Group__0__Impl rule__AttributeAccessorExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
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
    // InternalAPIMappingLanguage.g:7924:1: rule__AttributeAccessorExpression__Group__0__Impl : ( '.' ) ;
    public final void rule__AttributeAccessorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7928:1: ( ( '.' ) )
            // InternalAPIMappingLanguage.g:7929:1: ( '.' )
            {
            // InternalAPIMappingLanguage.g:7929:1: ( '.' )
            // InternalAPIMappingLanguage.g:7930:1: '.'
            {
             before(grammarAccess.getAttributeAccessorExpressionAccess().getFullStopKeyword_0()); 
            match(input,59,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:7943:1: rule__AttributeAccessorExpression__Group__1 : rule__AttributeAccessorExpression__Group__1__Impl ;
    public final void rule__AttributeAccessorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7947:1: ( rule__AttributeAccessorExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:7948:2: rule__AttributeAccessorExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:7954:1: rule__AttributeAccessorExpression__Group__1__Impl : ( ( rule__AttributeAccessorExpression__AttributeAssignment_1 ) ) ;
    public final void rule__AttributeAccessorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7958:1: ( ( ( rule__AttributeAccessorExpression__AttributeAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:7959:1: ( ( rule__AttributeAccessorExpression__AttributeAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:7959:1: ( ( rule__AttributeAccessorExpression__AttributeAssignment_1 ) )
            // InternalAPIMappingLanguage.g:7960:1: ( rule__AttributeAccessorExpression__AttributeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccessorExpressionAccess().getAttributeAssignment_1()); 
            // InternalAPIMappingLanguage.g:7961:1: ( rule__AttributeAccessorExpression__AttributeAssignment_1 )
            // InternalAPIMappingLanguage.g:7961:2: rule__AttributeAccessorExpression__AttributeAssignment_1
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
    // InternalAPIMappingLanguage.g:7975:1: rule__PositionSelectorExpression__Group__0 : rule__PositionSelectorExpression__Group__0__Impl rule__PositionSelectorExpression__Group__1 ;
    public final void rule__PositionSelectorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7979:1: ( rule__PositionSelectorExpression__Group__0__Impl rule__PositionSelectorExpression__Group__1 )
            // InternalAPIMappingLanguage.g:7980:2: rule__PositionSelectorExpression__Group__0__Impl rule__PositionSelectorExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_52);
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
    // InternalAPIMappingLanguage.g:7987:1: rule__PositionSelectorExpression__Group__0__Impl : ( ( rule__PositionSelectorExpression__KindAssignment_0 ) ) ;
    public final void rule__PositionSelectorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7991:1: ( ( ( rule__PositionSelectorExpression__KindAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:7992:1: ( ( rule__PositionSelectorExpression__KindAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:7992:1: ( ( rule__PositionSelectorExpression__KindAssignment_0 ) )
            // InternalAPIMappingLanguage.g:7993:1: ( rule__PositionSelectorExpression__KindAssignment_0 )
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getKindAssignment_0()); 
            // InternalAPIMappingLanguage.g:7994:1: ( rule__PositionSelectorExpression__KindAssignment_0 )
            // InternalAPIMappingLanguage.g:7994:2: rule__PositionSelectorExpression__KindAssignment_0
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
    // InternalAPIMappingLanguage.g:8004:1: rule__PositionSelectorExpression__Group__1 : rule__PositionSelectorExpression__Group__1__Impl ;
    public final void rule__PositionSelectorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8008:1: ( rule__PositionSelectorExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:8009:2: rule__PositionSelectorExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:8015:1: rule__PositionSelectorExpression__Group__1__Impl : ( ( rule__PositionSelectorExpression__Group_1__0 )? ) ;
    public final void rule__PositionSelectorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8019:1: ( ( ( rule__PositionSelectorExpression__Group_1__0 )? ) )
            // InternalAPIMappingLanguage.g:8020:1: ( ( rule__PositionSelectorExpression__Group_1__0 )? )
            {
            // InternalAPIMappingLanguage.g:8020:1: ( ( rule__PositionSelectorExpression__Group_1__0 )? )
            // InternalAPIMappingLanguage.g:8021:1: ( rule__PositionSelectorExpression__Group_1__0 )?
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:8022:1: ( rule__PositionSelectorExpression__Group_1__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==69) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAPIMappingLanguage.g:8022:2: rule__PositionSelectorExpression__Group_1__0
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
    // InternalAPIMappingLanguage.g:8036:1: rule__PositionSelectorExpression__Group_1__0 : rule__PositionSelectorExpression__Group_1__0__Impl rule__PositionSelectorExpression__Group_1__1 ;
    public final void rule__PositionSelectorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8040:1: ( rule__PositionSelectorExpression__Group_1__0__Impl rule__PositionSelectorExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:8041:2: rule__PositionSelectorExpression__Group_1__0__Impl rule__PositionSelectorExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_53);
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
    // InternalAPIMappingLanguage.g:8048:1: rule__PositionSelectorExpression__Group_1__0__Impl : ( '->' ) ;
    public final void rule__PositionSelectorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8052:1: ( ( '->' ) )
            // InternalAPIMappingLanguage.g:8053:1: ( '->' )
            {
            // InternalAPIMappingLanguage.g:8053:1: ( '->' )
            // InternalAPIMappingLanguage.g:8054:1: '->'
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 
            match(input,69,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:8067:1: rule__PositionSelectorExpression__Group_1__1 : rule__PositionSelectorExpression__Group_1__1__Impl ;
    public final void rule__PositionSelectorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8071:1: ( rule__PositionSelectorExpression__Group_1__1__Impl )
            // InternalAPIMappingLanguage.g:8072:2: rule__PositionSelectorExpression__Group_1__1__Impl
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
    // InternalAPIMappingLanguage.g:8078:1: rule__PositionSelectorExpression__Group_1__1__Impl : ( ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 ) ) ;
    public final void rule__PositionSelectorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8082:1: ( ( ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 ) ) )
            // InternalAPIMappingLanguage.g:8083:1: ( ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:8083:1: ( ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 ) )
            // InternalAPIMappingLanguage.g:8084:1: ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 )
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getSuccessorAssignment_1_1()); 
            // InternalAPIMappingLanguage.g:8085:1: ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 )
            // InternalAPIMappingLanguage.g:8085:2: rule__PositionSelectorExpression__SuccessorAssignment_1_1
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
    // InternalAPIMappingLanguage.g:8099:1: rule__OperationCall__Group__0 : rule__OperationCall__Group__0__Impl rule__OperationCall__Group__1 ;
    public final void rule__OperationCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8103:1: ( rule__OperationCall__Group__0__Impl rule__OperationCall__Group__1 )
            // InternalAPIMappingLanguage.g:8104:2: rule__OperationCall__Group__0__Impl rule__OperationCall__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalAPIMappingLanguage.g:8111:1: rule__OperationCall__Group__0__Impl : ( ( rule__OperationCall__OperationAssignment_0 ) ) ;
    public final void rule__OperationCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8115:1: ( ( ( rule__OperationCall__OperationAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:8116:1: ( ( rule__OperationCall__OperationAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:8116:1: ( ( rule__OperationCall__OperationAssignment_0 ) )
            // InternalAPIMappingLanguage.g:8117:1: ( rule__OperationCall__OperationAssignment_0 )
            {
             before(grammarAccess.getOperationCallAccess().getOperationAssignment_0()); 
            // InternalAPIMappingLanguage.g:8118:1: ( rule__OperationCall__OperationAssignment_0 )
            // InternalAPIMappingLanguage.g:8118:2: rule__OperationCall__OperationAssignment_0
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
    // InternalAPIMappingLanguage.g:8128:1: rule__OperationCall__Group__1 : rule__OperationCall__Group__1__Impl rule__OperationCall__Group__2 ;
    public final void rule__OperationCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8132:1: ( rule__OperationCall__Group__1__Impl rule__OperationCall__Group__2 )
            // InternalAPIMappingLanguage.g:8133:2: rule__OperationCall__Group__1__Impl rule__OperationCall__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalAPIMappingLanguage.g:8140:1: rule__OperationCall__Group__1__Impl : ( '(' ) ;
    public final void rule__OperationCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8144:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:8145:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:8145:1: ( '(' )
            // InternalAPIMappingLanguage.g:8146:1: '('
            {
             before(grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,56,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:8159:1: rule__OperationCall__Group__2 : rule__OperationCall__Group__2__Impl rule__OperationCall__Group__3 ;
    public final void rule__OperationCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8163:1: ( rule__OperationCall__Group__2__Impl rule__OperationCall__Group__3 )
            // InternalAPIMappingLanguage.g:8164:2: rule__OperationCall__Group__2__Impl rule__OperationCall__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalAPIMappingLanguage.g:8171:1: rule__OperationCall__Group__2__Impl : ( ( rule__OperationCall__Group_2__0 )? ) ;
    public final void rule__OperationCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8175:1: ( ( ( rule__OperationCall__Group_2__0 )? ) )
            // InternalAPIMappingLanguage.g:8176:1: ( ( rule__OperationCall__Group_2__0 )? )
            {
            // InternalAPIMappingLanguage.g:8176:1: ( ( rule__OperationCall__Group_2__0 )? )
            // InternalAPIMappingLanguage.g:8177:1: ( rule__OperationCall__Group_2__0 )?
            {
             before(grammarAccess.getOperationCallAccess().getGroup_2()); 
            // InternalAPIMappingLanguage.g:8178:1: ( rule__OperationCall__Group_2__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAPIMappingLanguage.g:8178:2: rule__OperationCall__Group_2__0
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
    // InternalAPIMappingLanguage.g:8188:1: rule__OperationCall__Group__3 : rule__OperationCall__Group__3__Impl ;
    public final void rule__OperationCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8192:1: ( rule__OperationCall__Group__3__Impl )
            // InternalAPIMappingLanguage.g:8193:2: rule__OperationCall__Group__3__Impl
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
    // InternalAPIMappingLanguage.g:8199:1: rule__OperationCall__Group__3__Impl : ( ')' ) ;
    public final void rule__OperationCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8203:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:8204:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:8204:1: ( ')' )
            // InternalAPIMappingLanguage.g:8205:1: ')'
            {
             before(grammarAccess.getOperationCallAccess().getRightParenthesisKeyword_3()); 
            match(input,57,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:8226:1: rule__OperationCall__Group_2__0 : rule__OperationCall__Group_2__0__Impl rule__OperationCall__Group_2__1 ;
    public final void rule__OperationCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8230:1: ( rule__OperationCall__Group_2__0__Impl rule__OperationCall__Group_2__1 )
            // InternalAPIMappingLanguage.g:8231:2: rule__OperationCall__Group_2__0__Impl rule__OperationCall__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
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
    // InternalAPIMappingLanguage.g:8238:1: rule__OperationCall__Group_2__0__Impl : ( ( rule__OperationCall__ParameterBindingAssignment_2_0 ) ) ;
    public final void rule__OperationCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8242:1: ( ( ( rule__OperationCall__ParameterBindingAssignment_2_0 ) ) )
            // InternalAPIMappingLanguage.g:8243:1: ( ( rule__OperationCall__ParameterBindingAssignment_2_0 ) )
            {
            // InternalAPIMappingLanguage.g:8243:1: ( ( rule__OperationCall__ParameterBindingAssignment_2_0 ) )
            // InternalAPIMappingLanguage.g:8244:1: ( rule__OperationCall__ParameterBindingAssignment_2_0 )
            {
             before(grammarAccess.getOperationCallAccess().getParameterBindingAssignment_2_0()); 
            // InternalAPIMappingLanguage.g:8245:1: ( rule__OperationCall__ParameterBindingAssignment_2_0 )
            // InternalAPIMappingLanguage.g:8245:2: rule__OperationCall__ParameterBindingAssignment_2_0
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
    // InternalAPIMappingLanguage.g:8255:1: rule__OperationCall__Group_2__1 : rule__OperationCall__Group_2__1__Impl ;
    public final void rule__OperationCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8259:1: ( rule__OperationCall__Group_2__1__Impl )
            // InternalAPIMappingLanguage.g:8260:2: rule__OperationCall__Group_2__1__Impl
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
    // InternalAPIMappingLanguage.g:8266:1: rule__OperationCall__Group_2__1__Impl : ( ( rule__OperationCall__Group_2_1__0 )* ) ;
    public final void rule__OperationCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8270:1: ( ( ( rule__OperationCall__Group_2_1__0 )* ) )
            // InternalAPIMappingLanguage.g:8271:1: ( ( rule__OperationCall__Group_2_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:8271:1: ( ( rule__OperationCall__Group_2_1__0 )* )
            // InternalAPIMappingLanguage.g:8272:1: ( rule__OperationCall__Group_2_1__0 )*
            {
             before(grammarAccess.getOperationCallAccess().getGroup_2_1()); 
            // InternalAPIMappingLanguage.g:8273:1: ( rule__OperationCall__Group_2_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==49) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:8273:2: rule__OperationCall__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__OperationCall__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalAPIMappingLanguage.g:8287:1: rule__OperationCall__Group_2_1__0 : rule__OperationCall__Group_2_1__0__Impl rule__OperationCall__Group_2_1__1 ;
    public final void rule__OperationCall__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8291:1: ( rule__OperationCall__Group_2_1__0__Impl rule__OperationCall__Group_2_1__1 )
            // InternalAPIMappingLanguage.g:8292:2: rule__OperationCall__Group_2_1__0__Impl rule__OperationCall__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
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
    // InternalAPIMappingLanguage.g:8299:1: rule__OperationCall__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__OperationCall__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8303:1: ( ( ',' ) )
            // InternalAPIMappingLanguage.g:8304:1: ( ',' )
            {
            // InternalAPIMappingLanguage.g:8304:1: ( ',' )
            // InternalAPIMappingLanguage.g:8305:1: ','
            {
             before(grammarAccess.getOperationCallAccess().getCommaKeyword_2_1_0()); 
            match(input,49,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:8318:1: rule__OperationCall__Group_2_1__1 : rule__OperationCall__Group_2_1__1__Impl ;
    public final void rule__OperationCall__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8322:1: ( rule__OperationCall__Group_2_1__1__Impl )
            // InternalAPIMappingLanguage.g:8323:2: rule__OperationCall__Group_2_1__1__Impl
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
    // InternalAPIMappingLanguage.g:8329:1: rule__OperationCall__Group_2_1__1__Impl : ( ( rule__OperationCall__ParameterBindingAssignment_2_1_1 ) ) ;
    public final void rule__OperationCall__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8333:1: ( ( ( rule__OperationCall__ParameterBindingAssignment_2_1_1 ) ) )
            // InternalAPIMappingLanguage.g:8334:1: ( ( rule__OperationCall__ParameterBindingAssignment_2_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:8334:1: ( ( rule__OperationCall__ParameterBindingAssignment_2_1_1 ) )
            // InternalAPIMappingLanguage.g:8335:1: ( rule__OperationCall__ParameterBindingAssignment_2_1_1 )
            {
             before(grammarAccess.getOperationCallAccess().getParameterBindingAssignment_2_1_1()); 
            // InternalAPIMappingLanguage.g:8336:1: ( rule__OperationCall__ParameterBindingAssignment_2_1_1 )
            // InternalAPIMappingLanguage.g:8336:2: rule__OperationCall__ParameterBindingAssignment_2_1_1
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


    // $ANTLR start "rule__DATATYPE__Group__0"
    // InternalAPIMappingLanguage.g:8351:1: rule__DATATYPE__Group__0 : rule__DATATYPE__Group__0__Impl rule__DATATYPE__Group__1 ;
    public final void rule__DATATYPE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8355:1: ( rule__DATATYPE__Group__0__Impl rule__DATATYPE__Group__1 )
            // InternalAPIMappingLanguage.g:8356:2: rule__DATATYPE__Group__0__Impl rule__DATATYPE__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_57);
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
    // InternalAPIMappingLanguage.g:8363:1: rule__DATATYPE__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__DATATYPE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8367:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:8368:1: ( RULE_ID )
            {
            // InternalAPIMappingLanguage.g:8368:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:8369:1: RULE_ID
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
    // InternalAPIMappingLanguage.g:8380:1: rule__DATATYPE__Group__1 : rule__DATATYPE__Group__1__Impl ;
    public final void rule__DATATYPE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8384:1: ( rule__DATATYPE__Group__1__Impl )
            // InternalAPIMappingLanguage.g:8385:2: rule__DATATYPE__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:8391:1: rule__DATATYPE__Group__1__Impl : ( ( rule__DATATYPE__Group_1__0 )* ) ;
    public final void rule__DATATYPE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8395:1: ( ( ( rule__DATATYPE__Group_1__0 )* ) )
            // InternalAPIMappingLanguage.g:8396:1: ( ( rule__DATATYPE__Group_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:8396:1: ( ( rule__DATATYPE__Group_1__0 )* )
            // InternalAPIMappingLanguage.g:8397:1: ( rule__DATATYPE__Group_1__0 )*
            {
             before(grammarAccess.getDATATYPEAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:8398:1: ( rule__DATATYPE__Group_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==67) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:8398:2: rule__DATATYPE__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_58);
            	    rule__DATATYPE__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalAPIMappingLanguage.g:8412:1: rule__DATATYPE__Group_1__0 : rule__DATATYPE__Group_1__0__Impl rule__DATATYPE__Group_1__1 ;
    public final void rule__DATATYPE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8416:1: ( rule__DATATYPE__Group_1__0__Impl rule__DATATYPE__Group_1__1 )
            // InternalAPIMappingLanguage.g:8417:2: rule__DATATYPE__Group_1__0__Impl rule__DATATYPE__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_59);
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
    // InternalAPIMappingLanguage.g:8424:1: rule__DATATYPE__Group_1__0__Impl : ( '[' ) ;
    public final void rule__DATATYPE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8428:1: ( ( '[' ) )
            // InternalAPIMappingLanguage.g:8429:1: ( '[' )
            {
            // InternalAPIMappingLanguage.g:8429:1: ( '[' )
            // InternalAPIMappingLanguage.g:8430:1: '['
            {
             before(grammarAccess.getDATATYPEAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,67,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:8443:1: rule__DATATYPE__Group_1__1 : rule__DATATYPE__Group_1__1__Impl rule__DATATYPE__Group_1__2 ;
    public final void rule__DATATYPE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8447:1: ( rule__DATATYPE__Group_1__1__Impl rule__DATATYPE__Group_1__2 )
            // InternalAPIMappingLanguage.g:8448:2: rule__DATATYPE__Group_1__1__Impl rule__DATATYPE__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_56);
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
    // InternalAPIMappingLanguage.g:8455:1: rule__DATATYPE__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DATATYPE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8459:1: ( ( RULE_INT ) )
            // InternalAPIMappingLanguage.g:8460:1: ( RULE_INT )
            {
            // InternalAPIMappingLanguage.g:8460:1: ( RULE_INT )
            // InternalAPIMappingLanguage.g:8461:1: RULE_INT
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
    // InternalAPIMappingLanguage.g:8472:1: rule__DATATYPE__Group_1__2 : rule__DATATYPE__Group_1__2__Impl ;
    public final void rule__DATATYPE__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8476:1: ( rule__DATATYPE__Group_1__2__Impl )
            // InternalAPIMappingLanguage.g:8477:2: rule__DATATYPE__Group_1__2__Impl
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
    // InternalAPIMappingLanguage.g:8483:1: rule__DATATYPE__Group_1__2__Impl : ( ']' ) ;
    public final void rule__DATATYPE__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8487:1: ( ( ']' ) )
            // InternalAPIMappingLanguage.g:8488:1: ( ']' )
            {
            // InternalAPIMappingLanguage.g:8488:1: ( ']' )
            // InternalAPIMappingLanguage.g:8489:1: ']'
            {
             before(grammarAccess.getDATATYPEAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,68,FollowSets000.FOLLOW_2); 
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


    // $ANTLR start "rule__MappingRepository__ImportsAssignment_0"
    // InternalAPIMappingLanguage.g:8509:1: rule__MappingRepository__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__MappingRepository__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8513:1: ( ( ruleImport ) )
            // InternalAPIMappingLanguage.g:8514:1: ( ruleImport )
            {
            // InternalAPIMappingLanguage.g:8514:1: ( ruleImport )
            // InternalAPIMappingLanguage.g:8515:1: ruleImport
            {
             before(grammarAccess.getMappingRepositoryAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getMappingRepositoryAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__ImportsAssignment_0"


    // $ANTLR start "rule__MappingRepository__NameAssignment_2"
    // InternalAPIMappingLanguage.g:8524:1: rule__MappingRepository__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__MappingRepository__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8528:1: ( ( ruleEString ) )
            // InternalAPIMappingLanguage.g:8529:1: ( ruleEString )
            {
            // InternalAPIMappingLanguage.g:8529:1: ( ruleEString )
            // InternalAPIMappingLanguage.g:8530:1: ruleEString
            {
             before(grammarAccess.getMappingRepositoryAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMappingRepositoryAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__NameAssignment_2"


    // $ANTLR start "rule__MappingRepository__PortApiMappingsAssignment_4_0"
    // InternalAPIMappingLanguage.g:8539:1: rule__MappingRepository__PortApiMappingsAssignment_4_0 : ( rulePortApiMapping ) ;
    public final void rule__MappingRepository__PortApiMappingsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8543:1: ( ( rulePortApiMapping ) )
            // InternalAPIMappingLanguage.g:8544:1: ( rulePortApiMapping )
            {
            // InternalAPIMappingLanguage.g:8544:1: ( rulePortApiMapping )
            // InternalAPIMappingLanguage.g:8545:1: rulePortApiMapping
            {
             before(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsPortApiMappingParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            rulePortApiMapping();

            state._fsp--;

             after(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsPortApiMappingParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__PortApiMappingsAssignment_4_0"


    // $ANTLR start "rule__MappingRepository__PortApiMappingsAssignment_4_1_1"
    // InternalAPIMappingLanguage.g:8554:1: rule__MappingRepository__PortApiMappingsAssignment_4_1_1 : ( rulePortApiMapping ) ;
    public final void rule__MappingRepository__PortApiMappingsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8558:1: ( ( rulePortApiMapping ) )
            // InternalAPIMappingLanguage.g:8559:1: ( rulePortApiMapping )
            {
            // InternalAPIMappingLanguage.g:8559:1: ( rulePortApiMapping )
            // InternalAPIMappingLanguage.g:8560:1: rulePortApiMapping
            {
             before(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsPortApiMappingParserRuleCall_4_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            rulePortApiMapping();

            state._fsp--;

             after(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsPortApiMappingParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__PortApiMappingsAssignment_4_1_1"


    // $ANTLR start "rule__MappingRepository__CommentAssignment_6_1"
    // InternalAPIMappingLanguage.g:8569:1: rule__MappingRepository__CommentAssignment_6_1 : ( ruleEString ) ;
    public final void rule__MappingRepository__CommentAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8573:1: ( ( ruleEString ) )
            // InternalAPIMappingLanguage.g:8574:1: ( ruleEString )
            {
            // InternalAPIMappingLanguage.g:8574:1: ( ruleEString )
            // InternalAPIMappingLanguage.g:8575:1: ruleEString
            {
             before(grammarAccess.getMappingRepositoryAccess().getCommentEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMappingRepositoryAccess().getCommentEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__CommentAssignment_6_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // InternalAPIMappingLanguage.g:8584:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8588:1: ( ( RULE_STRING ) )
            // InternalAPIMappingLanguage.g:8589:1: ( RULE_STRING )
            {
            // InternalAPIMappingLanguage.g:8589:1: ( RULE_STRING )
            // InternalAPIMappingLanguage.g:8590:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__PortApiMapping__PortAssignment_1"
    // InternalAPIMappingLanguage.g:8599:1: rule__PortApiMapping__PortAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__PortApiMapping__PortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8603:1: ( ( ( ruleEString ) ) )
            // InternalAPIMappingLanguage.g:8604:1: ( ( ruleEString ) )
            {
            // InternalAPIMappingLanguage.g:8604:1: ( ( ruleEString ) )
            // InternalAPIMappingLanguage.g:8605:1: ( ruleEString )
            {
             before(grammarAccess.getPortApiMappingAccess().getPortContinuousPortInstanceCrossReference_1_0()); 
            // InternalAPIMappingLanguage.g:8606:1: ( ruleEString )
            // InternalAPIMappingLanguage.g:8607:1: ruleEString
            {
             before(grammarAccess.getPortApiMappingAccess().getPortContinuousPortInstanceEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPortApiMappingAccess().getPortContinuousPortInstanceEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPortApiMappingAccess().getPortContinuousPortInstanceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__PortAssignment_1"


    // $ANTLR start "rule__PortApiMapping__ExecCommandAssignment_4"
    // InternalAPIMappingLanguage.g:8618:1: rule__PortApiMapping__ExecCommandAssignment_4 : ( ruleEntry ) ;
    public final void rule__PortApiMapping__ExecCommandAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8622:1: ( ( ruleEntry ) )
            // InternalAPIMappingLanguage.g:8623:1: ( ruleEntry )
            {
            // InternalAPIMappingLanguage.g:8623:1: ( ruleEntry )
            // InternalAPIMappingLanguage.g:8624:1: ruleEntry
            {
             before(grammarAccess.getPortApiMappingAccess().getExecCommandEntryParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getPortApiMappingAccess().getExecCommandEntryParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__ExecCommandAssignment_4"


    // $ANTLR start "rule__PortApiMapping__InitCommandAssignment_5_1"
    // InternalAPIMappingLanguage.g:8633:1: rule__PortApiMapping__InitCommandAssignment_5_1 : ( ruleEntry ) ;
    public final void rule__PortApiMapping__InitCommandAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8637:1: ( ( ruleEntry ) )
            // InternalAPIMappingLanguage.g:8638:1: ( ruleEntry )
            {
            // InternalAPIMappingLanguage.g:8638:1: ( ruleEntry )
            // InternalAPIMappingLanguage.g:8639:1: ruleEntry
            {
             before(grammarAccess.getPortApiMappingAccess().getInitCommandEntryParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getPortApiMappingAccess().getInitCommandEntryParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__InitCommandAssignment_5_1"


    // $ANTLR start "rule__EnumerationValueExpression__EnumValueAssignment_1"
    // InternalAPIMappingLanguage.g:8648:1: rule__EnumerationValueExpression__EnumValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EnumerationValueExpression__EnumValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8652:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:8653:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:8653:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:8654:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumerationValueExpressionAccess().getEnumValueEnumerationValueCrossReference_1_0()); 
            // InternalAPIMappingLanguage.g:8655:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:8656:1: RULE_ID
            {
             before(grammarAccess.getEnumerationValueExpressionAccess().getEnumValueEnumerationValueIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumerationValueExpressionAccess().getEnumValueEnumerationValueIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEnumerationValueExpressionAccess().getEnumValueEnumerationValueCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueExpression__EnumValueAssignment_1"


    // $ANTLR start "rule__APICallExpression__ApiCommandAssignment_0"
    // InternalAPIMappingLanguage.g:8667:1: rule__APICallExpression__ApiCommandAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__APICallExpression__ApiCommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8671:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:8672:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:8672:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:8673:1: ( RULE_ID )
            {
             before(grammarAccess.getAPICallExpressionAccess().getApiCommandAPICommandCrossReference_0_0()); 
            // InternalAPIMappingLanguage.g:8674:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:8675:1: RULE_ID
            {
             before(grammarAccess.getAPICallExpressionAccess().getApiCommandAPICommandIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAPICallExpressionAccess().getApiCommandAPICommandIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAPICallExpressionAccess().getApiCommandAPICommandCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__ApiCommandAssignment_0"


    // $ANTLR start "rule__APICallExpression__ParameterBindingsAssignment_2_0"
    // InternalAPIMappingLanguage.g:8686:1: rule__APICallExpression__ParameterBindingsAssignment_2_0 : ( ruleParamaterBinding ) ;
    public final void rule__APICallExpression__ParameterBindingsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8690:1: ( ( ruleParamaterBinding ) )
            // InternalAPIMappingLanguage.g:8691:1: ( ruleParamaterBinding )
            {
            // InternalAPIMappingLanguage.g:8691:1: ( ruleParamaterBinding )
            // InternalAPIMappingLanguage.g:8692:1: ruleParamaterBinding
            {
             before(grammarAccess.getAPICallExpressionAccess().getParameterBindingsParamaterBindingParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParamaterBinding();

            state._fsp--;

             after(grammarAccess.getAPICallExpressionAccess().getParameterBindingsParamaterBindingParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__ParameterBindingsAssignment_2_0"


    // $ANTLR start "rule__APICallExpression__ParameterBindingsAssignment_2_1_1"
    // InternalAPIMappingLanguage.g:8701:1: rule__APICallExpression__ParameterBindingsAssignment_2_1_1 : ( ruleParamaterBinding ) ;
    public final void rule__APICallExpression__ParameterBindingsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8705:1: ( ( ruleParamaterBinding ) )
            // InternalAPIMappingLanguage.g:8706:1: ( ruleParamaterBinding )
            {
            // InternalAPIMappingLanguage.g:8706:1: ( ruleParamaterBinding )
            // InternalAPIMappingLanguage.g:8707:1: ruleParamaterBinding
            {
             before(grammarAccess.getAPICallExpressionAccess().getParameterBindingsParamaterBindingParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParamaterBinding();

            state._fsp--;

             after(grammarAccess.getAPICallExpressionAccess().getParameterBindingsParamaterBindingParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__ParameterBindingsAssignment_2_1_1"


    // $ANTLR start "rule__ParamaterBinding__ParameterAssignment_1"
    // InternalAPIMappingLanguage.g:8716:1: rule__ParamaterBinding__ParameterAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParamaterBinding__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8720:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:8721:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:8721:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:8722:1: ( RULE_ID )
            {
             before(grammarAccess.getParamaterBindingAccess().getParameterParameterCrossReference_1_0()); 
            // InternalAPIMappingLanguage.g:8723:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:8724:1: RULE_ID
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
    // InternalAPIMappingLanguage.g:8735:1: rule__ParamaterBinding__ValueAssignment_3 : ( ( rule__ParamaterBinding__ValueAlternatives_3_0 ) ) ;
    public final void rule__ParamaterBinding__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8739:1: ( ( ( rule__ParamaterBinding__ValueAlternatives_3_0 ) ) )
            // InternalAPIMappingLanguage.g:8740:1: ( ( rule__ParamaterBinding__ValueAlternatives_3_0 ) )
            {
            // InternalAPIMappingLanguage.g:8740:1: ( ( rule__ParamaterBinding__ValueAlternatives_3_0 ) )
            // InternalAPIMappingLanguage.g:8741:1: ( rule__ParamaterBinding__ValueAlternatives_3_0 )
            {
             before(grammarAccess.getParamaterBindingAccess().getValueAlternatives_3_0()); 
            // InternalAPIMappingLanguage.g:8742:1: ( rule__ParamaterBinding__ValueAlternatives_3_0 )
            // InternalAPIMappingLanguage.g:8742:2: rule__ParamaterBinding__ValueAlternatives_3_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParamaterBinding__ValueAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getParamaterBindingAccess().getValueAlternatives_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Block__ExpressionsAssignment_2"
    // InternalAPIMappingLanguage.g:8752:1: rule__Block__ExpressionsAssignment_2 : ( ruleExpressionStartRule ) ;
    public final void rule__Block__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8756:1: ( ( ruleExpressionStartRule ) )
            // InternalAPIMappingLanguage.g:8757:1: ( ruleExpressionStartRule )
            {
            // InternalAPIMappingLanguage.g:8757:1: ( ruleExpressionStartRule )
            // InternalAPIMappingLanguage.g:8758:1: ruleExpressionStartRule
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
    // InternalAPIMappingLanguage.g:8767:1: rule__ForLoop__InitializeExpressionAssignment_2 : ( ruleAssignment ) ;
    public final void rule__ForLoop__InitializeExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8771:1: ( ( ruleAssignment ) )
            // InternalAPIMappingLanguage.g:8772:1: ( ruleAssignment )
            {
            // InternalAPIMappingLanguage.g:8772:1: ( ruleAssignment )
            // InternalAPIMappingLanguage.g:8773:1: ruleAssignment
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
    // InternalAPIMappingLanguage.g:8782:1: rule__ForLoop__LoopTestAssignment_3 : ( ruleExpression ) ;
    public final void rule__ForLoop__LoopTestAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8786:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:8787:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:8787:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:8788:1: ruleExpression
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
    // InternalAPIMappingLanguage.g:8797:1: rule__ForLoop__CountingExpressionAssignment_5 : ( ruleForLoopCountingExpression ) ;
    public final void rule__ForLoop__CountingExpressionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8801:1: ( ( ruleForLoopCountingExpression ) )
            // InternalAPIMappingLanguage.g:8802:1: ( ruleForLoopCountingExpression )
            {
            // InternalAPIMappingLanguage.g:8802:1: ( ruleForLoopCountingExpression )
            // InternalAPIMappingLanguage.g:8803:1: ruleForLoopCountingExpression
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
    // InternalAPIMappingLanguage.g:8812:1: rule__ForLoop__BlockAssignment_7 : ( ruleBlock ) ;
    public final void rule__ForLoop__BlockAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8816:1: ( ( ruleBlock ) )
            // InternalAPIMappingLanguage.g:8817:1: ( ruleBlock )
            {
            // InternalAPIMappingLanguage.g:8817:1: ( ruleBlock )
            // InternalAPIMappingLanguage.g:8818:1: ruleBlock
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
    // InternalAPIMappingLanguage.g:8827:1: rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 : ( ruleTypedNamedElementExpression ) ;
    public final void rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8831:1: ( ( ruleTypedNamedElementExpression ) )
            // InternalAPIMappingLanguage.g:8832:1: ( ruleTypedNamedElementExpression )
            {
            // InternalAPIMappingLanguage.g:8832:1: ( ruleTypedNamedElementExpression )
            // InternalAPIMappingLanguage.g:8833:1: ruleTypedNamedElementExpression
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
    // InternalAPIMappingLanguage.g:8842:1: rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 : ( ruleUnaryPostIncrementDecrementOperator ) ;
    public final void rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8846:1: ( ( ruleUnaryPostIncrementDecrementOperator ) )
            // InternalAPIMappingLanguage.g:8847:1: ( ruleUnaryPostIncrementDecrementOperator )
            {
            // InternalAPIMappingLanguage.g:8847:1: ( ruleUnaryPostIncrementDecrementOperator )
            // InternalAPIMappingLanguage.g:8848:1: ruleUnaryPostIncrementDecrementOperator
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
    // InternalAPIMappingLanguage.g:8857:1: rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 : ( ruleAssignOperator ) ;
    public final void rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8861:1: ( ( ruleAssignOperator ) )
            // InternalAPIMappingLanguage.g:8862:1: ( ruleAssignOperator )
            {
            // InternalAPIMappingLanguage.g:8862:1: ( ruleAssignOperator )
            // InternalAPIMappingLanguage.g:8863:1: ruleAssignOperator
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
    // InternalAPIMappingLanguage.g:8872:1: rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 : ( ruleExpression ) ;
    public final void rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8876:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:8877:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:8877:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:8878:1: ruleExpression
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
    // InternalAPIMappingLanguage.g:8887:1: rule__WhileLoop__LoopTestAssignment_2 : ( ruleExpression ) ;
    public final void rule__WhileLoop__LoopTestAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8891:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:8892:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:8892:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:8893:1: ruleExpression
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
    // InternalAPIMappingLanguage.g:8902:1: rule__WhileLoop__BlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__WhileLoop__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8906:1: ( ( ruleBlock ) )
            // InternalAPIMappingLanguage.g:8907:1: ( ruleBlock )
            {
            // InternalAPIMappingLanguage.g:8907:1: ( ruleBlock )
            // InternalAPIMappingLanguage.g:8908:1: ruleBlock
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
    // InternalAPIMappingLanguage.g:8917:1: rule__DoWhileLoop__BlockAssignment_1 : ( ruleBlock ) ;
    public final void rule__DoWhileLoop__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8921:1: ( ( ruleBlock ) )
            // InternalAPIMappingLanguage.g:8922:1: ( ruleBlock )
            {
            // InternalAPIMappingLanguage.g:8922:1: ( ruleBlock )
            // InternalAPIMappingLanguage.g:8923:1: ruleBlock
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
    // InternalAPIMappingLanguage.g:8932:1: rule__DoWhileLoop__LoopTestAssignment_4 : ( ruleExpression ) ;
    public final void rule__DoWhileLoop__LoopTestAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8936:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:8937:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:8937:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:8938:1: ruleExpression
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
    // InternalAPIMappingLanguage.g:8947:1: rule__IfStatement__IfConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__IfStatement__IfConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8951:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:8952:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:8952:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:8953:1: ruleExpression
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
    // InternalAPIMappingLanguage.g:8962:1: rule__IfStatement__IfBlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__IfStatement__IfBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8966:1: ( ( ruleBlock ) )
            // InternalAPIMappingLanguage.g:8967:1: ( ruleBlock )
            {
            // InternalAPIMappingLanguage.g:8967:1: ( ruleBlock )
            // InternalAPIMappingLanguage.g:8968:1: ruleBlock
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
    // InternalAPIMappingLanguage.g:8977:1: rule__IfStatement__ElseIfStatementsAssignment_5 : ( ruleElseIfStatement ) ;
    public final void rule__IfStatement__ElseIfStatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8981:1: ( ( ruleElseIfStatement ) )
            // InternalAPIMappingLanguage.g:8982:1: ( ruleElseIfStatement )
            {
            // InternalAPIMappingLanguage.g:8982:1: ( ruleElseIfStatement )
            // InternalAPIMappingLanguage.g:8983:1: ruleElseIfStatement
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
    // InternalAPIMappingLanguage.g:8992:1: rule__IfStatement__ElseBlockAssignment_6_1 : ( ruleBlock ) ;
    public final void rule__IfStatement__ElseBlockAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8996:1: ( ( ruleBlock ) )
            // InternalAPIMappingLanguage.g:8997:1: ( ruleBlock )
            {
            // InternalAPIMappingLanguage.g:8997:1: ( ruleBlock )
            // InternalAPIMappingLanguage.g:8998:1: ruleBlock
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
    // InternalAPIMappingLanguage.g:9007:1: rule__ElseIfStatement__ElseIfConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__ElseIfStatement__ElseIfConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9011:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:9012:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:9012:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:9013:1: ruleExpression
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
    // InternalAPIMappingLanguage.g:9022:1: rule__ElseIfStatement__ElseIfBlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__ElseIfStatement__ElseIfBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9026:1: ( ( ruleBlock ) )
            // InternalAPIMappingLanguage.g:9027:1: ( ruleBlock )
            {
            // InternalAPIMappingLanguage.g:9027:1: ( ruleBlock )
            // InternalAPIMappingLanguage.g:9028:1: ruleBlock
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


    // $ANTLR start "rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0"
    // InternalAPIMappingLanguage.g:9038:1: rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 : ( ruleTypedNamedElementExpression ) ;
    public final void rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9042:1: ( ( ruleTypedNamedElementExpression ) )
            // InternalAPIMappingLanguage.g:9043:1: ( ruleTypedNamedElementExpression )
            {
            // InternalAPIMappingLanguage.g:9043:1: ( ruleTypedNamedElementExpression )
            // InternalAPIMappingLanguage.g:9044:1: ruleTypedNamedElementExpression
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
    // InternalAPIMappingLanguage.g:9053:1: rule__Assignment__AssignOperatorAssignment_1_0_0 : ( ruleAssignOperator ) ;
    public final void rule__Assignment__AssignOperatorAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9057:1: ( ( ruleAssignOperator ) )
            // InternalAPIMappingLanguage.g:9058:1: ( ruleAssignOperator )
            {
            // InternalAPIMappingLanguage.g:9058:1: ( ruleAssignOperator )
            // InternalAPIMappingLanguage.g:9059:1: ruleAssignOperator
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
    // InternalAPIMappingLanguage.g:9068:1: rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 : ( ruleInitializeExpression ) ;
    public final void rule__Assignment__Rhs_assignExpressionAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9072:1: ( ( ruleInitializeExpression ) )
            // InternalAPIMappingLanguage.g:9073:1: ( ruleInitializeExpression )
            {
            // InternalAPIMappingLanguage.g:9073:1: ( ruleInitializeExpression )
            // InternalAPIMappingLanguage.g:9074:1: ruleInitializeExpression
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
    // InternalAPIMappingLanguage.g:9083:1: rule__Assignment__IncrementDecrementOperatorAssignment_1_1 : ( ruleUnaryPostIncrementDecrementOperator ) ;
    public final void rule__Assignment__IncrementDecrementOperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9087:1: ( ( ruleUnaryPostIncrementDecrementOperator ) )
            // InternalAPIMappingLanguage.g:9088:1: ( ruleUnaryPostIncrementDecrementOperator )
            {
            // InternalAPIMappingLanguage.g:9088:1: ( ruleUnaryPostIncrementDecrementOperator )
            // InternalAPIMappingLanguage.g:9089:1: ruleUnaryPostIncrementDecrementOperator
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
    // InternalAPIMappingLanguage.g:9098:1: rule__ArrayInitializeExpression__ExpressionsAssignment_1 : ( ruleInitializeExpression ) ;
    public final void rule__ArrayInitializeExpression__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9102:1: ( ( ruleInitializeExpression ) )
            // InternalAPIMappingLanguage.g:9103:1: ( ruleInitializeExpression )
            {
            // InternalAPIMappingLanguage.g:9103:1: ( ruleInitializeExpression )
            // InternalAPIMappingLanguage.g:9104:1: ruleInitializeExpression
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
    // InternalAPIMappingLanguage.g:9113:1: rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 : ( ruleInitializeExpression ) ;
    public final void rule__ArrayInitializeExpression__ExpressionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9117:1: ( ( ruleInitializeExpression ) )
            // InternalAPIMappingLanguage.g:9118:1: ( ruleInitializeExpression )
            {
            // InternalAPIMappingLanguage.g:9118:1: ( ruleInitializeExpression )
            // InternalAPIMappingLanguage.g:9119:1: ruleInitializeExpression
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
    // InternalAPIMappingLanguage.g:9128:1: rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment : ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 ) ) ;
    public final void rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9132:1: ( ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 ) ) )
            // InternalAPIMappingLanguage.g:9133:1: ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 ) )
            {
            // InternalAPIMappingLanguage.g:9133:1: ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 ) )
            // InternalAPIMappingLanguage.g:9134:1: ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 )
            {
             before(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableAlternatives_0()); 
            // InternalAPIMappingLanguage.g:9135:1: ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 )
            // InternalAPIMappingLanguage.g:9135:2: rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0
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
    // InternalAPIMappingLanguage.g:9144:1: rule__LocalVariableDeclaration__DataTypeAssignment_0 : ( ( ruleDATATYPE ) ) ;
    public final void rule__LocalVariableDeclaration__DataTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9148:1: ( ( ( ruleDATATYPE ) ) )
            // InternalAPIMappingLanguage.g:9149:1: ( ( ruleDATATYPE ) )
            {
            // InternalAPIMappingLanguage.g:9149:1: ( ( ruleDATATYPE ) )
            // InternalAPIMappingLanguage.g:9150:1: ( ruleDATATYPE )
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getDataTypeDataTypeCrossReference_0_0()); 
            // InternalAPIMappingLanguage.g:9151:1: ( ruleDATATYPE )
            // InternalAPIMappingLanguage.g:9152:1: ruleDATATYPE
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
    // InternalAPIMappingLanguage.g:9163:1: rule__LocalVariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LocalVariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9167:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:9168:1: ( RULE_ID )
            {
            // InternalAPIMappingLanguage.g:9168:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:9169:1: RULE_ID
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
    // InternalAPIMappingLanguage.g:9178:1: rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 : ( ruleInitializeExpression ) ;
    public final void rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9182:1: ( ( ruleInitializeExpression ) )
            // InternalAPIMappingLanguage.g:9183:1: ( ruleInitializeExpression )
            {
            // InternalAPIMappingLanguage.g:9183:1: ( ruleInitializeExpression )
            // InternalAPIMappingLanguage.g:9184:1: ruleInitializeExpression
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
    // InternalAPIMappingLanguage.g:9193:1: rule__LocalConstantDeclaration__ConstantAssignment_0 : ( ( 'const' ) ) ;
    public final void rule__LocalConstantDeclaration__ConstantAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9197:1: ( ( ( 'const' ) ) )
            // InternalAPIMappingLanguage.g:9198:1: ( ( 'const' ) )
            {
            // InternalAPIMappingLanguage.g:9198:1: ( ( 'const' ) )
            // InternalAPIMappingLanguage.g:9199:1: ( 'const' )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getConstantConstKeyword_0_0()); 
            // InternalAPIMappingLanguage.g:9200:1: ( 'const' )
            // InternalAPIMappingLanguage.g:9201:1: 'const'
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getConstantConstKeyword_0_0()); 
            match(input,70,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:9216:1: rule__LocalConstantDeclaration__DataTypeAssignment_1 : ( ( ruleDATATYPE ) ) ;
    public final void rule__LocalConstantDeclaration__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9220:1: ( ( ( ruleDATATYPE ) ) )
            // InternalAPIMappingLanguage.g:9221:1: ( ( ruleDATATYPE ) )
            {
            // InternalAPIMappingLanguage.g:9221:1: ( ( ruleDATATYPE ) )
            // InternalAPIMappingLanguage.g:9222:1: ( ruleDATATYPE )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getDataTypeDataTypeCrossReference_1_0()); 
            // InternalAPIMappingLanguage.g:9223:1: ( ruleDATATYPE )
            // InternalAPIMappingLanguage.g:9224:1: ruleDATATYPE
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
    // InternalAPIMappingLanguage.g:9235:1: rule__LocalConstantDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LocalConstantDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9239:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:9240:1: ( RULE_ID )
            {
            // InternalAPIMappingLanguage.g:9240:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:9241:1: RULE_ID
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
    // InternalAPIMappingLanguage.g:9250:1: rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 : ( ruleInitializeExpression ) ;
    public final void rule__LocalConstantDeclaration__InitializeExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9254:1: ( ( ruleInitializeExpression ) )
            // InternalAPIMappingLanguage.g:9255:1: ( ruleInitializeExpression )
            {
            // InternalAPIMappingLanguage.g:9255:1: ( ruleInitializeExpression )
            // InternalAPIMappingLanguage.g:9256:1: ruleInitializeExpression
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
    // InternalAPIMappingLanguage.g:9265:1: rule__NondeterministicChoiceExpression__DataTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NondeterministicChoiceExpression__DataTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9269:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:9270:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:9270:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:9271:1: ( RULE_ID )
            {
             before(grammarAccess.getNondeterministicChoiceExpressionAccess().getDataTypePrimitiveDataTypeCrossReference_0_0()); 
            // InternalAPIMappingLanguage.g:9272:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:9273:1: RULE_ID
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
    // InternalAPIMappingLanguage.g:9284:1: rule__NondeterministicChoiceExpression__RangeAssignment_1 : ( ruleRange ) ;
    public final void rule__NondeterministicChoiceExpression__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9288:1: ( ( ruleRange ) )
            // InternalAPIMappingLanguage.g:9289:1: ( ruleRange )
            {
            // InternalAPIMappingLanguage.g:9289:1: ( ruleRange )
            // InternalAPIMappingLanguage.g:9290:1: ruleRange
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
    // InternalAPIMappingLanguage.g:9299:1: rule__Range__LowerBoundAssignment_1 : ( ruleLONG ) ;
    public final void rule__Range__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9303:1: ( ( ruleLONG ) )
            // InternalAPIMappingLanguage.g:9304:1: ( ruleLONG )
            {
            // InternalAPIMappingLanguage.g:9304:1: ( ruleLONG )
            // InternalAPIMappingLanguage.g:9305:1: ruleLONG
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
    // InternalAPIMappingLanguage.g:9314:1: rule__Range__UpperBoundAssignment_3 : ( ruleLONG ) ;
    public final void rule__Range__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9318:1: ( ( ruleLONG ) )
            // InternalAPIMappingLanguage.g:9319:1: ( ruleLONG )
            {
            // InternalAPIMappingLanguage.g:9319:1: ( ruleLONG )
            // InternalAPIMappingLanguage.g:9320:1: ruleLONG
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
    // InternalAPIMappingLanguage.g:9329:1: rule__LogicalOrExpression__OperatorAssignment_1_1 : ( ruleLogicalOrOperator ) ;
    public final void rule__LogicalOrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9333:1: ( ( ruleLogicalOrOperator ) )
            // InternalAPIMappingLanguage.g:9334:1: ( ruleLogicalOrOperator )
            {
            // InternalAPIMappingLanguage.g:9334:1: ( ruleLogicalOrOperator )
            // InternalAPIMappingLanguage.g:9335:1: ruleLogicalOrOperator
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
    // InternalAPIMappingLanguage.g:9344:1: rule__LogicalOrExpression__RightExpressionAssignment_1_2 : ( ruleLogicalAndExpression ) ;
    public final void rule__LogicalOrExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9348:1: ( ( ruleLogicalAndExpression ) )
            // InternalAPIMappingLanguage.g:9349:1: ( ruleLogicalAndExpression )
            {
            // InternalAPIMappingLanguage.g:9349:1: ( ruleLogicalAndExpression )
            // InternalAPIMappingLanguage.g:9350:1: ruleLogicalAndExpression
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
    // InternalAPIMappingLanguage.g:9359:1: rule__LogicalAndExpression__OperatorAssignment_1_1 : ( ruleLogicalAndOperator ) ;
    public final void rule__LogicalAndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9363:1: ( ( ruleLogicalAndOperator ) )
            // InternalAPIMappingLanguage.g:9364:1: ( ruleLogicalAndOperator )
            {
            // InternalAPIMappingLanguage.g:9364:1: ( ruleLogicalAndOperator )
            // InternalAPIMappingLanguage.g:9365:1: ruleLogicalAndOperator
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
    // InternalAPIMappingLanguage.g:9374:1: rule__LogicalAndExpression__RightExpressionAssignment_1_2 : ( ruleComparisonExpression ) ;
    public final void rule__LogicalAndExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9378:1: ( ( ruleComparisonExpression ) )
            // InternalAPIMappingLanguage.g:9379:1: ( ruleComparisonExpression )
            {
            // InternalAPIMappingLanguage.g:9379:1: ( ruleComparisonExpression )
            // InternalAPIMappingLanguage.g:9380:1: ruleComparisonExpression
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
    // InternalAPIMappingLanguage.g:9389:1: rule__ComparisonExpression__OperatorAssignment_1_1 : ( ruleComparingEQNEQOperator ) ;
    public final void rule__ComparisonExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9393:1: ( ( ruleComparingEQNEQOperator ) )
            // InternalAPIMappingLanguage.g:9394:1: ( ruleComparingEQNEQOperator )
            {
            // InternalAPIMappingLanguage.g:9394:1: ( ruleComparingEQNEQOperator )
            // InternalAPIMappingLanguage.g:9395:1: ruleComparingEQNEQOperator
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
    // InternalAPIMappingLanguage.g:9404:1: rule__ComparisonExpression__RightExpressionAssignment_1_2 : ( ruleComparisonHigherOpExpression ) ;
    public final void rule__ComparisonExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9408:1: ( ( ruleComparisonHigherOpExpression ) )
            // InternalAPIMappingLanguage.g:9409:1: ( ruleComparisonHigherOpExpression )
            {
            // InternalAPIMappingLanguage.g:9409:1: ( ruleComparisonHigherOpExpression )
            // InternalAPIMappingLanguage.g:9410:1: ruleComparisonHigherOpExpression
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
    // InternalAPIMappingLanguage.g:9419:1: rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 : ( ruleComparingRelOperator ) ;
    public final void rule__ComparisonHigherOpExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9423:1: ( ( ruleComparingRelOperator ) )
            // InternalAPIMappingLanguage.g:9424:1: ( ruleComparingRelOperator )
            {
            // InternalAPIMappingLanguage.g:9424:1: ( ruleComparingRelOperator )
            // InternalAPIMappingLanguage.g:9425:1: ruleComparingRelOperator
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
    // InternalAPIMappingLanguage.g:9434:1: rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 : ( ruleArithmeticExpression ) ;
    public final void rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9438:1: ( ( ruleArithmeticExpression ) )
            // InternalAPIMappingLanguage.g:9439:1: ( ruleArithmeticExpression )
            {
            // InternalAPIMappingLanguage.g:9439:1: ( ruleArithmeticExpression )
            // InternalAPIMappingLanguage.g:9440:1: ruleArithmeticExpression
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
    // InternalAPIMappingLanguage.g:9449:1: rule__AdditionExpression__OperatorAssignment_1_1 : ( ruleAdditionOperator ) ;
    public final void rule__AdditionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9453:1: ( ( ruleAdditionOperator ) )
            // InternalAPIMappingLanguage.g:9454:1: ( ruleAdditionOperator )
            {
            // InternalAPIMappingLanguage.g:9454:1: ( ruleAdditionOperator )
            // InternalAPIMappingLanguage.g:9455:1: ruleAdditionOperator
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
    // InternalAPIMappingLanguage.g:9464:1: rule__AdditionExpression__RightExpressionAssignment_1_2 : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9468:1: ( ( ruleMultiplicationExpression ) )
            // InternalAPIMappingLanguage.g:9469:1: ( ruleMultiplicationExpression )
            {
            // InternalAPIMappingLanguage.g:9469:1: ( ruleMultiplicationExpression )
            // InternalAPIMappingLanguage.g:9470:1: ruleMultiplicationExpression
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
    // InternalAPIMappingLanguage.g:9479:1: rule__MultiplicationExpression__OperatorAssignment_1_1_1 : ( ruleMultiplicationOperator ) ;
    public final void rule__MultiplicationExpression__OperatorAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9483:1: ( ( ruleMultiplicationOperator ) )
            // InternalAPIMappingLanguage.g:9484:1: ( ruleMultiplicationOperator )
            {
            // InternalAPIMappingLanguage.g:9484:1: ( ruleMultiplicationOperator )
            // InternalAPIMappingLanguage.g:9485:1: ruleMultiplicationOperator
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
    // InternalAPIMappingLanguage.g:9494:1: rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 : ( ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 ) ) ;
    public final void rule__MultiplicationExpression__RightExpressionAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9498:1: ( ( ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 ) ) )
            // InternalAPIMappingLanguage.g:9499:1: ( ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 ) )
            {
            // InternalAPIMappingLanguage.g:9499:1: ( ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 ) )
            // InternalAPIMappingLanguage.g:9500:1: ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAlternatives_1_1_2_0()); 
            // InternalAPIMappingLanguage.g:9501:1: ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 )
            // InternalAPIMappingLanguage.g:9501:2: rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0
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
    // InternalAPIMappingLanguage.g:9510:1: rule__UnaryPreExpression__OperatorAssignment_1 : ( ruleUnaryPreOperator ) ;
    public final void rule__UnaryPreExpression__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9514:1: ( ( ruleUnaryPreOperator ) )
            // InternalAPIMappingLanguage.g:9515:1: ( ruleUnaryPreOperator )
            {
            // InternalAPIMappingLanguage.g:9515:1: ( ruleUnaryPreOperator )
            // InternalAPIMappingLanguage.g:9516:1: ruleUnaryPreOperator
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
    // InternalAPIMappingLanguage.g:9525:1: rule__UnaryPreExpression__EnclosedExpressionAssignment_2 : ( ruleTypeCastExpression ) ;
    public final void rule__UnaryPreExpression__EnclosedExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9529:1: ( ( ruleTypeCastExpression ) )
            // InternalAPIMappingLanguage.g:9530:1: ( ruleTypeCastExpression )
            {
            // InternalAPIMappingLanguage.g:9530:1: ( ruleTypeCastExpression )
            // InternalAPIMappingLanguage.g:9531:1: ruleTypeCastExpression
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
    // InternalAPIMappingLanguage.g:9540:1: rule__TypeCastExpression__DataTypeAssignment_1_2 : ( ( ruleDATATYPE ) ) ;
    public final void rule__TypeCastExpression__DataTypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9544:1: ( ( ( ruleDATATYPE ) ) )
            // InternalAPIMappingLanguage.g:9545:1: ( ( ruleDATATYPE ) )
            {
            // InternalAPIMappingLanguage.g:9545:1: ( ( ruleDATATYPE ) )
            // InternalAPIMappingLanguage.g:9546:1: ( ruleDATATYPE )
            {
             before(grammarAccess.getTypeCastExpressionAccess().getDataTypeDataTypeCrossReference_1_2_0()); 
            // InternalAPIMappingLanguage.g:9547:1: ( ruleDATATYPE )
            // InternalAPIMappingLanguage.g:9548:1: ruleDATATYPE
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
    // InternalAPIMappingLanguage.g:9559:1: rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 : ( ruleOperand ) ;
    public final void rule__TypeCastExpression__EnclosedExpressionAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9563:1: ( ( ruleOperand ) )
            // InternalAPIMappingLanguage.g:9564:1: ( ruleOperand )
            {
            // InternalAPIMappingLanguage.g:9564:1: ( ruleOperand )
            // InternalAPIMappingLanguage.g:9565:1: ruleOperand
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
    // InternalAPIMappingLanguage.g:9574:1: rule__LiteralExpression__ValueAssignment_1 : ( ruleLiteral ) ;
    public final void rule__LiteralExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9578:1: ( ( ruleLiteral ) )
            // InternalAPIMappingLanguage.g:9579:1: ( ruleLiteral )
            {
            // InternalAPIMappingLanguage.g:9579:1: ( ruleLiteral )
            // InternalAPIMappingLanguage.g:9580:1: ruleLiteral
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


    // $ANTLR start "rule__TimeValue__ValueAssignment_0"
    // InternalAPIMappingLanguage.g:9590:1: rule__TimeValue__ValueAssignment_0 : ( ruleLiteralExpression ) ;
    public final void rule__TimeValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9594:1: ( ( ruleLiteralExpression ) )
            // InternalAPIMappingLanguage.g:9595:1: ( ruleLiteralExpression )
            {
            // InternalAPIMappingLanguage.g:9595:1: ( ruleLiteralExpression )
            // InternalAPIMappingLanguage.g:9596:1: ruleLiteralExpression
            {
             before(grammarAccess.getTimeValueAccess().getValueLiteralExpressionParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLiteralExpression();

            state._fsp--;

             after(grammarAccess.getTimeValueAccess().getValueLiteralExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeValue__ValueAssignment_0"


    // $ANTLR start "rule__TimeValue__UnitAssignment_1"
    // InternalAPIMappingLanguage.g:9605:1: rule__TimeValue__UnitAssignment_1 : ( ruleTimeUnitExpr ) ;
    public final void rule__TimeValue__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9609:1: ( ( ruleTimeUnitExpr ) )
            // InternalAPIMappingLanguage.g:9610:1: ( ruleTimeUnitExpr )
            {
            // InternalAPIMappingLanguage.g:9610:1: ( ruleTimeUnitExpr )
            // InternalAPIMappingLanguage.g:9611:1: ruleTimeUnitExpr
            {
             before(grammarAccess.getTimeValueAccess().getUnitTimeUnitExprParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTimeUnitExpr();

            state._fsp--;

             after(grammarAccess.getTimeValueAccess().getUnitTimeUnitExprParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeValue__UnitAssignment_1"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2"
    // InternalAPIMappingLanguage.g:9621:1: rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 : ( rulePositionSelectorExpression ) ;
    public final void rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9625:1: ( ( rulePositionSelectorExpression ) )
            // InternalAPIMappingLanguage.g:9626:1: ( rulePositionSelectorExpression )
            {
            // InternalAPIMappingLanguage.g:9626:1: ( rulePositionSelectorExpression )
            // InternalAPIMappingLanguage.g:9627:1: rulePositionSelectorExpression
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
    // InternalAPIMappingLanguage.g:9636:1: rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 : ( ruleIncrementDecrementOperatorExpression ) ;
    public final void rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9640:1: ( ( ruleIncrementDecrementOperatorExpression ) )
            // InternalAPIMappingLanguage.g:9641:1: ( ruleIncrementDecrementOperatorExpression )
            {
            // InternalAPIMappingLanguage.g:9641:1: ( ruleIncrementDecrementOperatorExpression )
            // InternalAPIMappingLanguage.g:9642:1: ruleIncrementDecrementOperatorExpression
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
    // InternalAPIMappingLanguage.g:9651:1: rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypedNamedElementExpression__TypedNamedElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9655:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:9656:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:9656:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:9657:1: ( RULE_ID )
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementTypedNamedElementCrossReference_0_0()); 
            // InternalAPIMappingLanguage.g:9658:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:9659:1: RULE_ID
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
    // InternalAPIMappingLanguage.g:9670:1: rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 : ( ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 ) ) ;
    public final void rule__TypedNamedElementExpression__ElementAccessorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9674:1: ( ( ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 ) ) )
            // InternalAPIMappingLanguage.g:9675:1: ( ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 ) )
            {
            // InternalAPIMappingLanguage.g:9675:1: ( ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 ) )
            // InternalAPIMappingLanguage.g:9676:1: ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 )
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsAlternatives_1_0()); 
            // InternalAPIMappingLanguage.g:9677:1: ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 )
            // InternalAPIMappingLanguage.g:9677:2: rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0
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
    // InternalAPIMappingLanguage.g:9686:1: rule__ArrayIndexExpression__IndexAssignment_1 : ( ruleArithmeticExpression ) ;
    public final void rule__ArrayIndexExpression__IndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9690:1: ( ( ruleArithmeticExpression ) )
            // InternalAPIMappingLanguage.g:9691:1: ( ruleArithmeticExpression )
            {
            // InternalAPIMappingLanguage.g:9691:1: ( ruleArithmeticExpression )
            // InternalAPIMappingLanguage.g:9692:1: ruleArithmeticExpression
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
    // InternalAPIMappingLanguage.g:9701:1: rule__AttributeAccessorExpression__AttributeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeAccessorExpression__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9705:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:9706:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:9706:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:9707:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccessorExpressionAccess().getAttributeAttributeCrossReference_1_0()); 
            // InternalAPIMappingLanguage.g:9708:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:9709:1: RULE_ID
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


    // $ANTLR start "rule__PositionSelectorExpression__KindAssignment_0"
    // InternalAPIMappingLanguage.g:9721:1: rule__PositionSelectorExpression__KindAssignment_0 : ( rulePositionSelectorKind ) ;
    public final void rule__PositionSelectorExpression__KindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9725:1: ( ( rulePositionSelectorKind ) )
            // InternalAPIMappingLanguage.g:9726:1: ( rulePositionSelectorKind )
            {
            // InternalAPIMappingLanguage.g:9726:1: ( rulePositionSelectorKind )
            // InternalAPIMappingLanguage.g:9727:1: rulePositionSelectorKind
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
    // InternalAPIMappingLanguage.g:9736:1: rule__PositionSelectorExpression__SuccessorAssignment_1_1 : ( rulePositionSelectorExpression ) ;
    public final void rule__PositionSelectorExpression__SuccessorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9740:1: ( ( rulePositionSelectorExpression ) )
            // InternalAPIMappingLanguage.g:9741:1: ( rulePositionSelectorExpression )
            {
            // InternalAPIMappingLanguage.g:9741:1: ( rulePositionSelectorExpression )
            // InternalAPIMappingLanguage.g:9742:1: rulePositionSelectorExpression
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
    // InternalAPIMappingLanguage.g:9751:1: rule__OperationCall__OperationAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__OperationCall__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9755:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:9756:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:9756:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:9757:1: ( RULE_ID )
            {
             before(grammarAccess.getOperationCallAccess().getOperationOperationCrossReference_0_0()); 
            // InternalAPIMappingLanguage.g:9758:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:9759:1: RULE_ID
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
    // InternalAPIMappingLanguage.g:9770:1: rule__OperationCall__ParameterBindingAssignment_2_0 : ( ruleParamaterBinding ) ;
    public final void rule__OperationCall__ParameterBindingAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9774:1: ( ( ruleParamaterBinding ) )
            // InternalAPIMappingLanguage.g:9775:1: ( ruleParamaterBinding )
            {
            // InternalAPIMappingLanguage.g:9775:1: ( ruleParamaterBinding )
            // InternalAPIMappingLanguage.g:9776:1: ruleParamaterBinding
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
    // InternalAPIMappingLanguage.g:9785:1: rule__OperationCall__ParameterBindingAssignment_2_1_1 : ( ruleParamaterBinding ) ;
    public final void rule__OperationCall__ParameterBindingAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9789:1: ( ( ruleParamaterBinding ) )
            // InternalAPIMappingLanguage.g:9790:1: ( ruleParamaterBinding )
            {
            // InternalAPIMappingLanguage.g:9790:1: ( ruleParamaterBinding )
            // InternalAPIMappingLanguage.g:9791:1: ruleParamaterBinding
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

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\2\4\5\uffff\1\4\2\uffff\1\43\1\4";
    static final String dfa_3s = "\1\106\1\103\5\uffff\1\70\2\uffff\1\104\1\103";
    static final String dfa_4s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\uffff\1\1\1\7\2\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\67\uffff\1\2\1\3\1\4\1\uffff\1\5\5\uffff\1\6",
            "\1\6\23\uffff\5\10\33\uffff\1\11\2\uffff\1\10\7\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "\3\10\1\12\10\uffff\1\10\23\uffff\1\10\3\uffff\1\10\17\uffff\1\10",
            "",
            "",
            "\5\10\34\uffff\1\13",
            "\1\6\23\uffff\5\10\36\uffff\1\10\7\uffff\1\7"
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
            return "1715:1: rule__ExpressionStartRule__Alternatives : ( ( ruleAssignment ) | ( ruleForLoop ) | ( ruleWhileLoop ) | ( ruleDoWhileLoop ) | ( ruleIfStatement ) | ( ruleLocalVariableOrConstantDeclarationStatement ) | ( ruleAPICallStatement ) );";
        }
    }
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\2\uffff\1\3\3\uffff\2\3\4\uffff\1\15\1\uffff";
    static final String dfa_9s = "\1\4\1\uffff\1\16\1\uffff\2\4\2\16\2\4\2\16\1\4\1\uffff";
    static final String dfa_10s = "\1\103\1\uffff\1\105\1\uffff\2\70\2\104\1\103\1\70\3\104\1\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\uffff\1\3\11\uffff\1\2";
    static final String dfa_12s = "\16\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\3\3\10\uffff\1\3\23\uffff\1\3\3\uffff\1\3\17\uffff\1\3\12\uffff\1\1",
            "",
            "\2\3\10\uffff\2\3\3\uffff\2\3\1\4\10\3\11\uffff\1\3\6\uffff\1\3\1\uffff\2\3\7\uffff\3\3",
            "",
            "\3\3\1\6\10\uffff\1\3\23\uffff\1\5\3\uffff\1\3\17\uffff\1\3",
            "\3\3\1\7\10\uffff\1\3\47\uffff\1\3",
            "\2\3\15\uffff\2\3\4\uffff\5\3\11\uffff\1\10\10\uffff\1\3\11\uffff\1\3",
            "\2\3\15\uffff\2\3\4\uffff\2\3\14\uffff\1\10\10\uffff\1\3\11\uffff\1\3",
            "\3\3\1\12\10\uffff\1\3\23\uffff\1\11\3\uffff\1\3\17\uffff\1\3\12\uffff\1\3",
            "\3\3\1\13\10\uffff\1\3\47\uffff\1\3",
            "\2\3\15\uffff\5\3\1\14\5\3\11\uffff\1\3\22\uffff\1\3",
            "\2\3\15\uffff\5\3\1\14\2\3\14\uffff\1\3\22\uffff\1\3",
            "\4\3\10\uffff\1\3\23\uffff\1\3\3\uffff\1\3\10\uffff\1\15\6\uffff\1\3\1\uffff\1\15\11\uffff\1\15",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1895:1: rule__InitializeExpression__Alternatives : ( ( ruleArrayInitializeExpression ) | ( ruleNondeterministicChoiceExpression ) | ( ruleExpression ) );";
        }
    }
    static final String dfa_14s = "\11\uffff";
    static final String dfa_15s = "\5\uffff\1\2\3\uffff";
    static final String dfa_16s = "\2\4\1\uffff\1\16\2\4\1\43\1\uffff\1\16";
    static final String dfa_17s = "\2\70\1\uffff\1\105\1\70\2\104\1\uffff\1\105";
    static final String dfa_18s = "\2\uffff\1\1\4\uffff\1\2\1\uffff";
    static final String dfa_19s = "\11\uffff}>";
    static final String[] dfa_20s = {
            "\4\2\10\uffff\1\2\47\uffff\1\1",
            "\1\3\3\2\10\uffff\1\2\23\uffff\1\2\3\uffff\1\2\17\uffff\1\2",
            "",
            "\2\2\10\uffff\2\2\3\uffff\13\2\20\uffff\1\2\1\5\1\uffff\1\2\7\uffff\1\4\1\uffff\1\2",
            "\3\2\1\6\10\uffff\1\2\23\uffff\1\2\3\uffff\1\2\17\uffff\1\2",
            "\4\7\6\uffff\2\2\1\7\14\uffff\13\2\10\uffff\2\2\4\uffff\1\2\1\uffff\1\7\2\2\4\uffff\1\2\4\uffff\1\2",
            "\5\2\34\uffff\1\10",
            "",
            "\2\2\10\uffff\2\2\3\uffff\13\2\21\uffff\1\5\1\uffff\1\2\7\uffff\1\4\1\uffff\1\2"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "1989:1: rule__TypeCastExpression__Alternatives : ( ( ruleOperand ) | ( ( rule__TypeCastExpression__Group_1__0 ) ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0008000000000002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0011000000000000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0002000000000002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x01008110000100F0L,0x0000000000000008L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0041000000000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0200000000000010L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x01800110000100F0L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x01000110000100F0L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x71010000000100F0L,0x0000000000000041L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x71000000000100F2L,0x0000000000000041L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000001F000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0400000004000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000080L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000060000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000780000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000001800000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000001800000002L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x000000E000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x000000E000000002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000011000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x01000000000100F0L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00000000000100E0L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000FE0000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000003000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x00003E0000000000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000008L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000080L});
    }


}