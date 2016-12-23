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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_NUMBER", "RULE_BOOLEAN", "RULE_STRING", "RULE_MINORMAXKEYWORD", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'&&'", "'null'", "'++'", "'--'", "':='", "'+='", "'-='", "'=='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'not'", "'self'", "'first'", "'last'", "'prev'", "'next'", "'MappingRepository:'", "'{'", "'}'", "','", "'#'", "'import'", "'PortInstance:'", "'execCommand:'", "'initCommand:'", "'enum:'", "'('", "')'", "';'", "'.'", "'for'", "'while'", "'do'", "');'", "'if'", "'else'", "'elseif'", "'['", "']'", "'->'", "'const'"
    };
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
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__21=21;
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
    // InternalAPIMappingLanguage.g:839:1: ruleLONG : ( RULE_INT ) ;
    public final void ruleLONG() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:843:2: ( ( RULE_INT ) )
            // InternalAPIMappingLanguage.g:844:1: ( RULE_INT )
            {
            // InternalAPIMappingLanguage.g:844:1: ( RULE_INT )
            // InternalAPIMappingLanguage.g:845:1: RULE_INT
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


    // $ANTLR start "entryRuleExtendedTypedNamedElementExpression"
    // InternalAPIMappingLanguage.g:1224:1: entryRuleExtendedTypedNamedElementExpression : ruleExtendedTypedNamedElementExpression EOF ;
    public final void entryRuleExtendedTypedNamedElementExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1225:1: ( ruleExtendedTypedNamedElementExpression EOF )
            // InternalAPIMappingLanguage.g:1226:1: ruleExtendedTypedNamedElementExpression EOF
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
    // InternalAPIMappingLanguage.g:1233:1: ruleExtendedTypedNamedElementExpression : ( ( rule__ExtendedTypedNamedElementExpression__Group__0 ) ) ;
    public final void ruleExtendedTypedNamedElementExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1237:2: ( ( ( rule__ExtendedTypedNamedElementExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1238:1: ( ( rule__ExtendedTypedNamedElementExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1238:1: ( ( rule__ExtendedTypedNamedElementExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1239:1: ( rule__ExtendedTypedNamedElementExpression__Group__0 )
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1240:1: ( rule__ExtendedTypedNamedElementExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1240:2: rule__ExtendedTypedNamedElementExpression__Group__0
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
    // InternalAPIMappingLanguage.g:1252:1: entryRuleTypedNamedElementExpression : ruleTypedNamedElementExpression EOF ;
    public final void entryRuleTypedNamedElementExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1253:1: ( ruleTypedNamedElementExpression EOF )
            // InternalAPIMappingLanguage.g:1254:1: ruleTypedNamedElementExpression EOF
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
    // InternalAPIMappingLanguage.g:1261:1: ruleTypedNamedElementExpression : ( ( rule__TypedNamedElementExpression__Group__0 ) ) ;
    public final void ruleTypedNamedElementExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1265:2: ( ( ( rule__TypedNamedElementExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1266:1: ( ( rule__TypedNamedElementExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1266:1: ( ( rule__TypedNamedElementExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1267:1: ( rule__TypedNamedElementExpression__Group__0 )
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1268:1: ( rule__TypedNamedElementExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1268:2: rule__TypedNamedElementExpression__Group__0
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
    // InternalAPIMappingLanguage.g:1280:1: entryRuleArrayIndexExpression : ruleArrayIndexExpression EOF ;
    public final void entryRuleArrayIndexExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1281:1: ( ruleArrayIndexExpression EOF )
            // InternalAPIMappingLanguage.g:1282:1: ruleArrayIndexExpression EOF
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
    // InternalAPIMappingLanguage.g:1289:1: ruleArrayIndexExpression : ( ( rule__ArrayIndexExpression__Group__0 ) ) ;
    public final void ruleArrayIndexExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1293:2: ( ( ( rule__ArrayIndexExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1294:1: ( ( rule__ArrayIndexExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1294:1: ( ( rule__ArrayIndexExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1295:1: ( rule__ArrayIndexExpression__Group__0 )
            {
             before(grammarAccess.getArrayIndexExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1296:1: ( rule__ArrayIndexExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1296:2: rule__ArrayIndexExpression__Group__0
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
    // InternalAPIMappingLanguage.g:1308:1: entryRuleAttributeAccessorExpression : ruleAttributeAccessorExpression EOF ;
    public final void entryRuleAttributeAccessorExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1309:1: ( ruleAttributeAccessorExpression EOF )
            // InternalAPIMappingLanguage.g:1310:1: ruleAttributeAccessorExpression EOF
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
    // InternalAPIMappingLanguage.g:1317:1: ruleAttributeAccessorExpression : ( ( rule__AttributeAccessorExpression__Group__0 ) ) ;
    public final void ruleAttributeAccessorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1321:2: ( ( ( rule__AttributeAccessorExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1322:1: ( ( rule__AttributeAccessorExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1322:1: ( ( rule__AttributeAccessorExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1323:1: ( rule__AttributeAccessorExpression__Group__0 )
            {
             before(grammarAccess.getAttributeAccessorExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1324:1: ( rule__AttributeAccessorExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1324:2: rule__AttributeAccessorExpression__Group__0
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
    // InternalAPIMappingLanguage.g:1338:1: entryRulePositionSelectorExpression : rulePositionSelectorExpression EOF ;
    public final void entryRulePositionSelectorExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1339:1: ( rulePositionSelectorExpression EOF )
            // InternalAPIMappingLanguage.g:1340:1: rulePositionSelectorExpression EOF
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
    // InternalAPIMappingLanguage.g:1347:1: rulePositionSelectorExpression : ( ( rule__PositionSelectorExpression__Group__0 ) ) ;
    public final void rulePositionSelectorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1351:2: ( ( ( rule__PositionSelectorExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1352:1: ( ( rule__PositionSelectorExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1352:1: ( ( rule__PositionSelectorExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1353:1: ( rule__PositionSelectorExpression__Group__0 )
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1354:1: ( rule__PositionSelectorExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1354:2: rule__PositionSelectorExpression__Group__0
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
    // InternalAPIMappingLanguage.g:1366:1: entryRuleOperationCall : ruleOperationCall EOF ;
    public final void entryRuleOperationCall() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1367:1: ( ruleOperationCall EOF )
            // InternalAPIMappingLanguage.g:1368:1: ruleOperationCall EOF
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
    // InternalAPIMappingLanguage.g:1375:1: ruleOperationCall : ( ( rule__OperationCall__Group__0 ) ) ;
    public final void ruleOperationCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1379:2: ( ( ( rule__OperationCall__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1380:1: ( ( rule__OperationCall__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1380:1: ( ( rule__OperationCall__Group__0 ) )
            // InternalAPIMappingLanguage.g:1381:1: ( rule__OperationCall__Group__0 )
            {
             before(grammarAccess.getOperationCallAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1382:1: ( rule__OperationCall__Group__0 )
            // InternalAPIMappingLanguage.g:1382:2: rule__OperationCall__Group__0
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
    // InternalAPIMappingLanguage.g:1396:1: entryRuleDATATYPE : ruleDATATYPE EOF ;
    public final void entryRuleDATATYPE() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1397:1: ( ruleDATATYPE EOF )
            // InternalAPIMappingLanguage.g:1398:1: ruleDATATYPE EOF
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
    // InternalAPIMappingLanguage.g:1405:1: ruleDATATYPE : ( ( rule__DATATYPE__Group__0 ) ) ;
    public final void ruleDATATYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1409:2: ( ( ( rule__DATATYPE__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1410:1: ( ( rule__DATATYPE__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1410:1: ( ( rule__DATATYPE__Group__0 ) )
            // InternalAPIMappingLanguage.g:1411:1: ( rule__DATATYPE__Group__0 )
            {
             before(grammarAccess.getDATATYPEAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1412:1: ( rule__DATATYPE__Group__0 )
            // InternalAPIMappingLanguage.g:1412:2: rule__DATATYPE__Group__0
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
    // InternalAPIMappingLanguage.g:1425:1: ruleUnaryPostIncrementDecrementOperator : ( ( rule__UnaryPostIncrementDecrementOperator__Alternatives ) ) ;
    public final void ruleUnaryPostIncrementDecrementOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1429:1: ( ( ( rule__UnaryPostIncrementDecrementOperator__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1430:1: ( ( rule__UnaryPostIncrementDecrementOperator__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1430:1: ( ( rule__UnaryPostIncrementDecrementOperator__Alternatives ) )
            // InternalAPIMappingLanguage.g:1431:1: ( rule__UnaryPostIncrementDecrementOperator__Alternatives )
            {
             before(grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1432:1: ( rule__UnaryPostIncrementDecrementOperator__Alternatives )
            // InternalAPIMappingLanguage.g:1432:2: rule__UnaryPostIncrementDecrementOperator__Alternatives
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
    // InternalAPIMappingLanguage.g:1444:1: ruleIncrementDecrementOperatorExpression : ( ( rule__IncrementDecrementOperatorExpression__Alternatives ) ) ;
    public final void ruleIncrementDecrementOperatorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1448:1: ( ( ( rule__IncrementDecrementOperatorExpression__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1449:1: ( ( rule__IncrementDecrementOperatorExpression__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1449:1: ( ( rule__IncrementDecrementOperatorExpression__Alternatives ) )
            // InternalAPIMappingLanguage.g:1450:1: ( rule__IncrementDecrementOperatorExpression__Alternatives )
            {
             before(grammarAccess.getIncrementDecrementOperatorExpressionAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1451:1: ( rule__IncrementDecrementOperatorExpression__Alternatives )
            // InternalAPIMappingLanguage.g:1451:2: rule__IncrementDecrementOperatorExpression__Alternatives
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
    // InternalAPIMappingLanguage.g:1463:1: ruleAssignOperator : ( ( rule__AssignOperator__Alternatives ) ) ;
    public final void ruleAssignOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1467:1: ( ( ( rule__AssignOperator__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1468:1: ( ( rule__AssignOperator__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1468:1: ( ( rule__AssignOperator__Alternatives ) )
            // InternalAPIMappingLanguage.g:1469:1: ( rule__AssignOperator__Alternatives )
            {
             before(grammarAccess.getAssignOperatorAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1470:1: ( rule__AssignOperator__Alternatives )
            // InternalAPIMappingLanguage.g:1470:2: rule__AssignOperator__Alternatives
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
    // InternalAPIMappingLanguage.g:1482:1: ruleLogicalOrOperator : ( ( '||' ) ) ;
    public final void ruleLogicalOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1486:1: ( ( ( '||' ) ) )
            // InternalAPIMappingLanguage.g:1487:1: ( ( '||' ) )
            {
            // InternalAPIMappingLanguage.g:1487:1: ( ( '||' ) )
            // InternalAPIMappingLanguage.g:1488:1: ( '||' )
            {
             before(grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration()); 
            // InternalAPIMappingLanguage.g:1489:1: ( '||' )
            // InternalAPIMappingLanguage.g:1489:3: '||'
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
    // InternalAPIMappingLanguage.g:1502:1: ruleLogicalAndOperator : ( ( '&&' ) ) ;
    public final void ruleLogicalAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1506:1: ( ( ( '&&' ) ) )
            // InternalAPIMappingLanguage.g:1507:1: ( ( '&&' ) )
            {
            // InternalAPIMappingLanguage.g:1507:1: ( ( '&&' ) )
            // InternalAPIMappingLanguage.g:1508:1: ( '&&' )
            {
             before(grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            // InternalAPIMappingLanguage.g:1509:1: ( '&&' )
            // InternalAPIMappingLanguage.g:1509:3: '&&'
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
    // InternalAPIMappingLanguage.g:1522:1: ruleComparingEQNEQOperator : ( ( rule__ComparingEQNEQOperator__Alternatives ) ) ;
    public final void ruleComparingEQNEQOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1526:1: ( ( ( rule__ComparingEQNEQOperator__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1527:1: ( ( rule__ComparingEQNEQOperator__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1527:1: ( ( rule__ComparingEQNEQOperator__Alternatives ) )
            // InternalAPIMappingLanguage.g:1528:1: ( rule__ComparingEQNEQOperator__Alternatives )
            {
             before(grammarAccess.getComparingEQNEQOperatorAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1529:1: ( rule__ComparingEQNEQOperator__Alternatives )
            // InternalAPIMappingLanguage.g:1529:2: rule__ComparingEQNEQOperator__Alternatives
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
    // InternalAPIMappingLanguage.g:1541:1: ruleComparingRelOperator : ( ( rule__ComparingRelOperator__Alternatives ) ) ;
    public final void ruleComparingRelOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1545:1: ( ( ( rule__ComparingRelOperator__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1546:1: ( ( rule__ComparingRelOperator__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1546:1: ( ( rule__ComparingRelOperator__Alternatives ) )
            // InternalAPIMappingLanguage.g:1547:1: ( rule__ComparingRelOperator__Alternatives )
            {
             before(grammarAccess.getComparingRelOperatorAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1548:1: ( rule__ComparingRelOperator__Alternatives )
            // InternalAPIMappingLanguage.g:1548:2: rule__ComparingRelOperator__Alternatives
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
    // InternalAPIMappingLanguage.g:1560:1: ruleAdditionOperator : ( ( rule__AdditionOperator__Alternatives ) ) ;
    public final void ruleAdditionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1564:1: ( ( ( rule__AdditionOperator__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1565:1: ( ( rule__AdditionOperator__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1565:1: ( ( rule__AdditionOperator__Alternatives ) )
            // InternalAPIMappingLanguage.g:1566:1: ( rule__AdditionOperator__Alternatives )
            {
             before(grammarAccess.getAdditionOperatorAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1567:1: ( rule__AdditionOperator__Alternatives )
            // InternalAPIMappingLanguage.g:1567:2: rule__AdditionOperator__Alternatives
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
    // InternalAPIMappingLanguage.g:1579:1: ruleMultiplicationOperator : ( ( rule__MultiplicationOperator__Alternatives ) ) ;
    public final void ruleMultiplicationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1583:1: ( ( ( rule__MultiplicationOperator__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1584:1: ( ( rule__MultiplicationOperator__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1584:1: ( ( rule__MultiplicationOperator__Alternatives ) )
            // InternalAPIMappingLanguage.g:1585:1: ( rule__MultiplicationOperator__Alternatives )
            {
             before(grammarAccess.getMultiplicationOperatorAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1586:1: ( rule__MultiplicationOperator__Alternatives )
            // InternalAPIMappingLanguage.g:1586:2: rule__MultiplicationOperator__Alternatives
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
    // InternalAPIMappingLanguage.g:1598:1: ruleUnaryPreOperator : ( ( rule__UnaryPreOperator__Alternatives ) ) ;
    public final void ruleUnaryPreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1602:1: ( ( ( rule__UnaryPreOperator__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1603:1: ( ( rule__UnaryPreOperator__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1603:1: ( ( rule__UnaryPreOperator__Alternatives ) )
            // InternalAPIMappingLanguage.g:1604:1: ( rule__UnaryPreOperator__Alternatives )
            {
             before(grammarAccess.getUnaryPreOperatorAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1605:1: ( rule__UnaryPreOperator__Alternatives )
            // InternalAPIMappingLanguage.g:1605:2: rule__UnaryPreOperator__Alternatives
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
    // InternalAPIMappingLanguage.g:1617:1: rulePositionSelectorKind : ( ( rule__PositionSelectorKind__Alternatives ) ) ;
    public final void rulePositionSelectorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1621:1: ( ( ( rule__PositionSelectorKind__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1622:1: ( ( rule__PositionSelectorKind__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1622:1: ( ( rule__PositionSelectorKind__Alternatives ) )
            // InternalAPIMappingLanguage.g:1623:1: ( rule__PositionSelectorKind__Alternatives )
            {
             before(grammarAccess.getPositionSelectorKindAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1624:1: ( rule__PositionSelectorKind__Alternatives )
            // InternalAPIMappingLanguage.g:1624:2: rule__PositionSelectorKind__Alternatives
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
    // InternalAPIMappingLanguage.g:1635:1: rule__ParamaterBinding__ValueAlternatives_3_0 : ( ( ruleExpression ) | ( ruleEnumerationValueExpression ) );
    public final void rule__ParamaterBinding__ValueAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1639:1: ( ( ruleExpression ) | ( ruleEnumerationValueExpression ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_BOOLEAN)||LA1_0==16||LA1_0==29||LA1_0==33||LA1_0==49) ) {
                alt1=1;
            }
            else if ( (LA1_0==48) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1640:1: ( ruleExpression )
                    {
                    // InternalAPIMappingLanguage.g:1640:1: ( ruleExpression )
                    // InternalAPIMappingLanguage.g:1641:1: ruleExpression
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
                    // InternalAPIMappingLanguage.g:1646:6: ( ruleEnumerationValueExpression )
                    {
                    // InternalAPIMappingLanguage.g:1646:6: ( ruleEnumerationValueExpression )
                    // InternalAPIMappingLanguage.g:1647:1: ruleEnumerationValueExpression
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
    // InternalAPIMappingLanguage.g:1657:1: rule__ExpressionStartRule__Alternatives : ( ( ruleAssignment ) | ( ruleForLoop ) | ( ruleWhileLoop ) | ( ruleDoWhileLoop ) | ( ruleIfStatement ) | ( ruleLocalVariableOrConstantDeclarationStatement ) | ( ruleAPICallStatement ) );
    public final void rule__ExpressionStartRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1661:1: ( ( ruleAssignment ) | ( ruleForLoop ) | ( ruleWhileLoop ) | ( ruleDoWhileLoop ) | ( ruleIfStatement ) | ( ruleLocalVariableOrConstantDeclarationStatement ) | ( ruleAPICallStatement ) )
            int alt2=7;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1662:1: ( ruleAssignment )
                    {
                    // InternalAPIMappingLanguage.g:1662:1: ( ruleAssignment )
                    // InternalAPIMappingLanguage.g:1663:1: ruleAssignment
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
                    // InternalAPIMappingLanguage.g:1668:6: ( ruleForLoop )
                    {
                    // InternalAPIMappingLanguage.g:1668:6: ( ruleForLoop )
                    // InternalAPIMappingLanguage.g:1669:1: ruleForLoop
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
                    // InternalAPIMappingLanguage.g:1674:6: ( ruleWhileLoop )
                    {
                    // InternalAPIMappingLanguage.g:1674:6: ( ruleWhileLoop )
                    // InternalAPIMappingLanguage.g:1675:1: ruleWhileLoop
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
                    // InternalAPIMappingLanguage.g:1680:6: ( ruleDoWhileLoop )
                    {
                    // InternalAPIMappingLanguage.g:1680:6: ( ruleDoWhileLoop )
                    // InternalAPIMappingLanguage.g:1681:1: ruleDoWhileLoop
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
                    // InternalAPIMappingLanguage.g:1686:6: ( ruleIfStatement )
                    {
                    // InternalAPIMappingLanguage.g:1686:6: ( ruleIfStatement )
                    // InternalAPIMappingLanguage.g:1687:1: ruleIfStatement
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
                    // InternalAPIMappingLanguage.g:1692:6: ( ruleLocalVariableOrConstantDeclarationStatement )
                    {
                    // InternalAPIMappingLanguage.g:1692:6: ( ruleLocalVariableOrConstantDeclarationStatement )
                    // InternalAPIMappingLanguage.g:1693:1: ruleLocalVariableOrConstantDeclarationStatement
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
                    // InternalAPIMappingLanguage.g:1698:6: ( ruleAPICallStatement )
                    {
                    // InternalAPIMappingLanguage.g:1698:6: ( ruleAPICallStatement )
                    // InternalAPIMappingLanguage.g:1699:1: ruleAPICallStatement
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
    // InternalAPIMappingLanguage.g:1709:1: rule__Operand__Alternatives : ( ( ( rule__Operand__Group_0__0 ) ) | ( ruleLiteralExpression ) | ( ruleExtendedTypedNamedElementExpression ) | ( ruleAPICallExpression ) );
    public final void rule__Operand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1713:1: ( ( ( rule__Operand__Group_0__0 ) ) | ( ruleLiteralExpression ) | ( ruleExtendedTypedNamedElementExpression ) | ( ruleAPICallExpression ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt3=1;
                }
                break;
            case RULE_INT:
            case RULE_NUMBER:
            case RULE_BOOLEAN:
            case 16:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==49) ) {
                    alt3=4;
                }
                else if ( (LA3_3==EOF||(LA3_3>=14 && LA3_3<=15)||(LA3_3>=17 && LA3_3<=18)||(LA3_3>=22 && LA3_3<=32)||(LA3_3>=41 && LA3_3<=42)||LA3_3==47||(LA3_3>=50 && LA3_3<=52)||LA3_3==56||(LA3_3>=60 && LA3_3<=62)) ) {
                    alt3=3;
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
                    // InternalAPIMappingLanguage.g:1714:1: ( ( rule__Operand__Group_0__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:1714:1: ( ( rule__Operand__Group_0__0 ) )
                    // InternalAPIMappingLanguage.g:1715:1: ( rule__Operand__Group_0__0 )
                    {
                     before(grammarAccess.getOperandAccess().getGroup_0()); 
                    // InternalAPIMappingLanguage.g:1716:1: ( rule__Operand__Group_0__0 )
                    // InternalAPIMappingLanguage.g:1716:2: rule__Operand__Group_0__0
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
                    // InternalAPIMappingLanguage.g:1720:6: ( ruleLiteralExpression )
                    {
                    // InternalAPIMappingLanguage.g:1720:6: ( ruleLiteralExpression )
                    // InternalAPIMappingLanguage.g:1721:1: ruleLiteralExpression
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
                    // InternalAPIMappingLanguage.g:1726:6: ( ruleExtendedTypedNamedElementExpression )
                    {
                    // InternalAPIMappingLanguage.g:1726:6: ( ruleExtendedTypedNamedElementExpression )
                    // InternalAPIMappingLanguage.g:1727:1: ruleExtendedTypedNamedElementExpression
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
                    // InternalAPIMappingLanguage.g:1732:6: ( ruleAPICallExpression )
                    {
                    // InternalAPIMappingLanguage.g:1732:6: ( ruleAPICallExpression )
                    // InternalAPIMappingLanguage.g:1733:1: ruleAPICallExpression
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
    // InternalAPIMappingLanguage.g:1743:1: rule__EString__Alternatives : ( ( RULE_ID ) | ( ruleQualifiedName ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1747:1: ( ( RULE_ID ) | ( ruleQualifiedName ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==40) ) {
                    alt4=1;
                }
                else if ( (LA4_1==52) ) {
                    alt4=2;
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
                    // InternalAPIMappingLanguage.g:1748:1: ( RULE_ID )
                    {
                    // InternalAPIMappingLanguage.g:1748:1: ( RULE_ID )
                    // InternalAPIMappingLanguage.g:1749:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:1754:6: ( ruleQualifiedName )
                    {
                    // InternalAPIMappingLanguage.g:1754:6: ( ruleQualifiedName )
                    // InternalAPIMappingLanguage.g:1755:1: ruleQualifiedName
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
    // InternalAPIMappingLanguage.g:1765:1: rule__Entry__Alternatives : ( ( ruleBlock ) | ( ruleExpression ) | ( ruleArrayInitializeExpression ) );
    public final void rule__Entry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1769:1: ( ( ruleBlock ) | ( ruleExpression ) | ( ruleArrayInitializeExpression ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
            case RULE_ID:
            case RULE_NUMBER:
            case RULE_BOOLEAN:
            case 16:
            case 29:
            case 33:
            case 49:
                {
                alt5=2;
                }
                break;
            case 60:
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
                    // InternalAPIMappingLanguage.g:1770:1: ( ruleBlock )
                    {
                    // InternalAPIMappingLanguage.g:1770:1: ( ruleBlock )
                    // InternalAPIMappingLanguage.g:1771:1: ruleBlock
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
                    // InternalAPIMappingLanguage.g:1776:6: ( ruleExpression )
                    {
                    // InternalAPIMappingLanguage.g:1776:6: ( ruleExpression )
                    // InternalAPIMappingLanguage.g:1777:1: ruleExpression
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
                    // InternalAPIMappingLanguage.g:1782:6: ( ruleArrayInitializeExpression )
                    {
                    // InternalAPIMappingLanguage.g:1782:6: ( ruleArrayInitializeExpression )
                    // InternalAPIMappingLanguage.g:1783:1: ruleArrayInitializeExpression
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
    // InternalAPIMappingLanguage.g:1793:1: rule__ForLoopCountingExpression__Alternatives_1 : ( ( ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 ) ) | ( ( rule__ForLoopCountingExpression__Group_1_1__0 ) ) );
    public final void rule__ForLoopCountingExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1797:1: ( ( ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 ) ) | ( ( rule__ForLoopCountingExpression__Group_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=17 && LA6_0<=18)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=19 && LA6_0<=21)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1798:1: ( ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 ) )
                    {
                    // InternalAPIMappingLanguage.g:1798:1: ( ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 ) )
                    // InternalAPIMappingLanguage.g:1799:1: ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 )
                    {
                     before(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorAssignment_1_0()); 
                    // InternalAPIMappingLanguage.g:1800:1: ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 )
                    // InternalAPIMappingLanguage.g:1800:2: rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0
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
                    // InternalAPIMappingLanguage.g:1804:6: ( ( rule__ForLoopCountingExpression__Group_1_1__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:1804:6: ( ( rule__ForLoopCountingExpression__Group_1_1__0 ) )
                    // InternalAPIMappingLanguage.g:1805:1: ( rule__ForLoopCountingExpression__Group_1_1__0 )
                    {
                     before(grammarAccess.getForLoopCountingExpressionAccess().getGroup_1_1()); 
                    // InternalAPIMappingLanguage.g:1806:1: ( rule__ForLoopCountingExpression__Group_1_1__0 )
                    // InternalAPIMappingLanguage.g:1806:2: rule__ForLoopCountingExpression__Group_1_1__0
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
    // InternalAPIMappingLanguage.g:1815:1: rule__Assignment__Alternatives_1 : ( ( ( rule__Assignment__Group_1_0__0 ) ) | ( ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 ) ) );
    public final void rule__Assignment__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1819:1: ( ( ( rule__Assignment__Group_1_0__0 ) ) | ( ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=19 && LA7_0<=21)) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=17 && LA7_0<=18)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1820:1: ( ( rule__Assignment__Group_1_0__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:1820:1: ( ( rule__Assignment__Group_1_0__0 ) )
                    // InternalAPIMappingLanguage.g:1821:1: ( rule__Assignment__Group_1_0__0 )
                    {
                     before(grammarAccess.getAssignmentAccess().getGroup_1_0()); 
                    // InternalAPIMappingLanguage.g:1822:1: ( rule__Assignment__Group_1_0__0 )
                    // InternalAPIMappingLanguage.g:1822:2: rule__Assignment__Group_1_0__0
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
                    // InternalAPIMappingLanguage.g:1826:6: ( ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 ) )
                    {
                    // InternalAPIMappingLanguage.g:1826:6: ( ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 ) )
                    // InternalAPIMappingLanguage.g:1827:1: ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 )
                    {
                     before(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorAssignment_1_1()); 
                    // InternalAPIMappingLanguage.g:1828:1: ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 )
                    // InternalAPIMappingLanguage.g:1828:2: rule__Assignment__IncrementDecrementOperatorAssignment_1_1
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
    // InternalAPIMappingLanguage.g:1837:1: rule__InitializeExpression__Alternatives : ( ( ruleArrayInitializeExpression ) | ( ruleNondeterministicChoiceExpression ) | ( ruleExpression ) );
    public final void rule__InitializeExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1841:1: ( ( ruleArrayInitializeExpression ) | ( ruleNondeterministicChoiceExpression ) | ( ruleExpression ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1842:1: ( ruleArrayInitializeExpression )
                    {
                    // InternalAPIMappingLanguage.g:1842:1: ( ruleArrayInitializeExpression )
                    // InternalAPIMappingLanguage.g:1843:1: ruleArrayInitializeExpression
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
                    // InternalAPIMappingLanguage.g:1848:6: ( ruleNondeterministicChoiceExpression )
                    {
                    // InternalAPIMappingLanguage.g:1848:6: ( ruleNondeterministicChoiceExpression )
                    // InternalAPIMappingLanguage.g:1849:1: ruleNondeterministicChoiceExpression
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
                    // InternalAPIMappingLanguage.g:1854:6: ( ruleExpression )
                    {
                    // InternalAPIMappingLanguage.g:1854:6: ( ruleExpression )
                    // InternalAPIMappingLanguage.g:1855:1: ruleExpression
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
    // InternalAPIMappingLanguage.g:1865:1: rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 : ( ( ruleLocalVariableDeclaration ) | ( ruleLocalConstantDeclaration ) );
    public final void rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1869:1: ( ( ruleLocalVariableDeclaration ) | ( ruleLocalConstantDeclaration ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==63) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1870:1: ( ruleLocalVariableDeclaration )
                    {
                    // InternalAPIMappingLanguage.g:1870:1: ( ruleLocalVariableDeclaration )
                    // InternalAPIMappingLanguage.g:1871:1: ruleLocalVariableDeclaration
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
                    // InternalAPIMappingLanguage.g:1876:6: ( ruleLocalConstantDeclaration )
                    {
                    // InternalAPIMappingLanguage.g:1876:6: ( ruleLocalConstantDeclaration )
                    // InternalAPIMappingLanguage.g:1877:1: ruleLocalConstantDeclaration
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
    // InternalAPIMappingLanguage.g:1887:1: rule__MultiplicationExpression__Alternatives : ( ( ruleUnaryPreExpression ) | ( ( rule__MultiplicationExpression__Group_1__0 ) ) );
    public final void rule__MultiplicationExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1891:1: ( ( ruleUnaryPreExpression ) | ( ( rule__MultiplicationExpression__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29||LA10_0==33) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_BOOLEAN)||LA10_0==16||LA10_0==49) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1892:1: ( ruleUnaryPreExpression )
                    {
                    // InternalAPIMappingLanguage.g:1892:1: ( ruleUnaryPreExpression )
                    // InternalAPIMappingLanguage.g:1893:1: ruleUnaryPreExpression
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
                    // InternalAPIMappingLanguage.g:1898:6: ( ( rule__MultiplicationExpression__Group_1__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:1898:6: ( ( rule__MultiplicationExpression__Group_1__0 ) )
                    // InternalAPIMappingLanguage.g:1899:1: ( rule__MultiplicationExpression__Group_1__0 )
                    {
                     before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 
                    // InternalAPIMappingLanguage.g:1900:1: ( rule__MultiplicationExpression__Group_1__0 )
                    // InternalAPIMappingLanguage.g:1900:2: rule__MultiplicationExpression__Group_1__0
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
    // InternalAPIMappingLanguage.g:1909:1: rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 : ( ( ruleUnaryPreExpression ) | ( ruleTypeCastExpression ) );
    public final void rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1913:1: ( ( ruleUnaryPreExpression ) | ( ruleTypeCastExpression ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29||LA11_0==33) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_BOOLEAN)||LA11_0==16||LA11_0==49) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1914:1: ( ruleUnaryPreExpression )
                    {
                    // InternalAPIMappingLanguage.g:1914:1: ( ruleUnaryPreExpression )
                    // InternalAPIMappingLanguage.g:1915:1: ruleUnaryPreExpression
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
                    // InternalAPIMappingLanguage.g:1920:6: ( ruleTypeCastExpression )
                    {
                    // InternalAPIMappingLanguage.g:1920:6: ( ruleTypeCastExpression )
                    // InternalAPIMappingLanguage.g:1921:1: ruleTypeCastExpression
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
    // InternalAPIMappingLanguage.g:1931:1: rule__TypeCastExpression__Alternatives : ( ( ruleOperand ) | ( ( rule__TypeCastExpression__Group_1__0 ) ) );
    public final void rule__TypeCastExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1935:1: ( ( ruleOperand ) | ( ( rule__TypeCastExpression__Group_1__0 ) ) )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1936:1: ( ruleOperand )
                    {
                    // InternalAPIMappingLanguage.g:1936:1: ( ruleOperand )
                    // InternalAPIMappingLanguage.g:1937:1: ruleOperand
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
                    // InternalAPIMappingLanguage.g:1942:6: ( ( rule__TypeCastExpression__Group_1__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:1942:6: ( ( rule__TypeCastExpression__Group_1__0 ) )
                    // InternalAPIMappingLanguage.g:1943:1: ( rule__TypeCastExpression__Group_1__0 )
                    {
                     before(grammarAccess.getTypeCastExpressionAccess().getGroup_1()); 
                    // InternalAPIMappingLanguage.g:1944:1: ( rule__TypeCastExpression__Group_1__0 )
                    // InternalAPIMappingLanguage.g:1944:2: rule__TypeCastExpression__Group_1__0
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
    // InternalAPIMappingLanguage.g:1953:1: rule__Literal__Alternatives : ( ( RULE_NUMBER ) | ( RULE_BOOLEAN ) | ( RULE_INT ) | ( 'null' ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1957:1: ( ( RULE_NUMBER ) | ( RULE_BOOLEAN ) | ( RULE_INT ) | ( 'null' ) )
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
                    // InternalAPIMappingLanguage.g:1958:1: ( RULE_NUMBER )
                    {
                    // InternalAPIMappingLanguage.g:1958:1: ( RULE_NUMBER )
                    // InternalAPIMappingLanguage.g:1959:1: RULE_NUMBER
                    {
                     before(grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0()); 
                    match(input,RULE_NUMBER,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:1964:6: ( RULE_BOOLEAN )
                    {
                    // InternalAPIMappingLanguage.g:1964:6: ( RULE_BOOLEAN )
                    // InternalAPIMappingLanguage.g:1965:1: RULE_BOOLEAN
                    {
                     before(grammarAccess.getLiteralAccess().getBOOLEANTerminalRuleCall_1()); 
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getBOOLEANTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:1970:6: ( RULE_INT )
                    {
                    // InternalAPIMappingLanguage.g:1970:6: ( RULE_INT )
                    // InternalAPIMappingLanguage.g:1971:1: RULE_INT
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAPIMappingLanguage.g:1976:6: ( 'null' )
                    {
                    // InternalAPIMappingLanguage.g:1976:6: ( 'null' )
                    // InternalAPIMappingLanguage.g:1977:1: 'null'
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
    // InternalAPIMappingLanguage.g:1989:1: rule__ExtendedTypedNamedElementExpression__Alternatives_1 : ( ( ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 ) ) | ( ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 ) ) );
    public final void rule__ExtendedTypedNamedElementExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1993:1: ( ( ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 ) ) | ( ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==62) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=17 && LA14_0<=18)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1994:1: ( ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:1994:1: ( ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 ) )
                    // InternalAPIMappingLanguage.g:1995:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 )
                    {
                     before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getGroup_1_0()); 
                    // InternalAPIMappingLanguage.g:1996:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 )
                    // InternalAPIMappingLanguage.g:1996:2: rule__ExtendedTypedNamedElementExpression__Group_1_0__0
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
                    // InternalAPIMappingLanguage.g:2000:6: ( ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:2000:6: ( ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 ) )
                    // InternalAPIMappingLanguage.g:2001:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 )
                    {
                     before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getGroup_1_1()); 
                    // InternalAPIMappingLanguage.g:2002:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 )
                    // InternalAPIMappingLanguage.g:2002:2: rule__ExtendedTypedNamedElementExpression__Group_1_1__0
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
    // InternalAPIMappingLanguage.g:2011:1: rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 : ( ( ruleArrayIndexExpression ) | ( ruleAttributeAccessorExpression ) );
    public final void rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2015:1: ( ( ruleArrayIndexExpression ) | ( ruleAttributeAccessorExpression ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==60) ) {
                alt15=1;
            }
            else if ( (LA15_0==52) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2016:1: ( ruleArrayIndexExpression )
                    {
                    // InternalAPIMappingLanguage.g:2016:1: ( ruleArrayIndexExpression )
                    // InternalAPIMappingLanguage.g:2017:1: ruleArrayIndexExpression
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
                    // InternalAPIMappingLanguage.g:2022:6: ( ruleAttributeAccessorExpression )
                    {
                    // InternalAPIMappingLanguage.g:2022:6: ( ruleAttributeAccessorExpression )
                    // InternalAPIMappingLanguage.g:2023:1: ruleAttributeAccessorExpression
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
    // InternalAPIMappingLanguage.g:2033:1: rule__UnaryPostIncrementDecrementOperator__Alternatives : ( ( ( '++' ) ) | ( ( '--' ) ) );
    public final void rule__UnaryPostIncrementDecrementOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2037:1: ( ( ( '++' ) ) | ( ( '--' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            else if ( (LA16_0==18) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2038:1: ( ( '++' ) )
                    {
                    // InternalAPIMappingLanguage.g:2038:1: ( ( '++' ) )
                    // InternalAPIMappingLanguage.g:2039:1: ( '++' )
                    {
                     before(grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2040:1: ( '++' )
                    // InternalAPIMappingLanguage.g:2040:3: '++'
                    {
                    match(input,17,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2045:6: ( ( '--' ) )
                    {
                    // InternalAPIMappingLanguage.g:2045:6: ( ( '--' ) )
                    // InternalAPIMappingLanguage.g:2046:1: ( '--' )
                    {
                     before(grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getDECREMENTEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2047:1: ( '--' )
                    // InternalAPIMappingLanguage.g:2047:3: '--'
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
    // InternalAPIMappingLanguage.g:2057:1: rule__IncrementDecrementOperatorExpression__Alternatives : ( ( ( '++' ) ) | ( ( '--' ) ) );
    public final void rule__IncrementDecrementOperatorExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2061:1: ( ( ( '++' ) ) | ( ( '--' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            else if ( (LA17_0==18) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2062:1: ( ( '++' ) )
                    {
                    // InternalAPIMappingLanguage.g:2062:1: ( ( '++' ) )
                    // InternalAPIMappingLanguage.g:2063:1: ( '++' )
                    {
                     before(grammarAccess.getIncrementDecrementOperatorExpressionAccess().getINCREMENTEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2064:1: ( '++' )
                    // InternalAPIMappingLanguage.g:2064:3: '++'
                    {
                    match(input,17,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getIncrementDecrementOperatorExpressionAccess().getINCREMENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2069:6: ( ( '--' ) )
                    {
                    // InternalAPIMappingLanguage.g:2069:6: ( ( '--' ) )
                    // InternalAPIMappingLanguage.g:2070:1: ( '--' )
                    {
                     before(grammarAccess.getIncrementDecrementOperatorExpressionAccess().getDECREMENTEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2071:1: ( '--' )
                    // InternalAPIMappingLanguage.g:2071:3: '--'
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
    // InternalAPIMappingLanguage.g:2081:1: rule__AssignOperator__Alternatives : ( ( ( ':=' ) ) | ( ( '+=' ) ) | ( ( '-=' ) ) );
    public final void rule__AssignOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2085:1: ( ( ( ':=' ) ) | ( ( '+=' ) ) | ( ( '-=' ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt18=1;
                }
                break;
            case 20:
                {
                alt18=2;
                }
                break;
            case 21:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2086:1: ( ( ':=' ) )
                    {
                    // InternalAPIMappingLanguage.g:2086:1: ( ( ':=' ) )
                    // InternalAPIMappingLanguage.g:2087:1: ( ':=' )
                    {
                     before(grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2088:1: ( ':=' )
                    // InternalAPIMappingLanguage.g:2088:3: ':='
                    {
                    match(input,19,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2093:6: ( ( '+=' ) )
                    {
                    // InternalAPIMappingLanguage.g:2093:6: ( ( '+=' ) )
                    // InternalAPIMappingLanguage.g:2094:1: ( '+=' )
                    {
                     before(grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2095:1: ( '+=' )
                    // InternalAPIMappingLanguage.g:2095:3: '+='
                    {
                    match(input,20,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:2100:6: ( ( '-=' ) )
                    {
                    // InternalAPIMappingLanguage.g:2100:6: ( ( '-=' ) )
                    // InternalAPIMappingLanguage.g:2101:1: ( '-=' )
                    {
                     before(grammarAccess.getAssignOperatorAccess().getMINUS_EQUALEnumLiteralDeclaration_2()); 
                    // InternalAPIMappingLanguage.g:2102:1: ( '-=' )
                    // InternalAPIMappingLanguage.g:2102:3: '-='
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
    // InternalAPIMappingLanguage.g:2112:1: rule__ComparingEQNEQOperator__Alternatives : ( ( ( '==' ) ) | ( ( '<>' ) ) );
    public final void rule__ComparingEQNEQOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2116:1: ( ( ( '==' ) ) | ( ( '<>' ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            else if ( (LA19_0==23) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2117:1: ( ( '==' ) )
                    {
                    // InternalAPIMappingLanguage.g:2117:1: ( ( '==' ) )
                    // InternalAPIMappingLanguage.g:2118:1: ( '==' )
                    {
                     before(grammarAccess.getComparingEQNEQOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2119:1: ( '==' )
                    // InternalAPIMappingLanguage.g:2119:3: '=='
                    {
                    match(input,22,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getComparingEQNEQOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2124:6: ( ( '<>' ) )
                    {
                    // InternalAPIMappingLanguage.g:2124:6: ( ( '<>' ) )
                    // InternalAPIMappingLanguage.g:2125:1: ( '<>' )
                    {
                     before(grammarAccess.getComparingEQNEQOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2126:1: ( '<>' )
                    // InternalAPIMappingLanguage.g:2126:3: '<>'
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
    // InternalAPIMappingLanguage.g:2136:1: rule__ComparingRelOperator__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) );
    public final void rule__ComparingRelOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2140:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt20=1;
                }
                break;
            case 25:
                {
                alt20=2;
                }
                break;
            case 26:
                {
                alt20=3;
                }
                break;
            case 27:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2141:1: ( ( '<' ) )
                    {
                    // InternalAPIMappingLanguage.g:2141:1: ( ( '<' ) )
                    // InternalAPIMappingLanguage.g:2142:1: ( '<' )
                    {
                     before(grammarAccess.getComparingRelOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2143:1: ( '<' )
                    // InternalAPIMappingLanguage.g:2143:3: '<'
                    {
                    match(input,24,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getComparingRelOperatorAccess().getLESSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2148:6: ( ( '<=' ) )
                    {
                    // InternalAPIMappingLanguage.g:2148:6: ( ( '<=' ) )
                    // InternalAPIMappingLanguage.g:2149:1: ( '<=' )
                    {
                     before(grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2150:1: ( '<=' )
                    // InternalAPIMappingLanguage.g:2150:3: '<='
                    {
                    match(input,25,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:2155:6: ( ( '>=' ) )
                    {
                    // InternalAPIMappingLanguage.g:2155:6: ( ( '>=' ) )
                    // InternalAPIMappingLanguage.g:2156:1: ( '>=' )
                    {
                     before(grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                    // InternalAPIMappingLanguage.g:2157:1: ( '>=' )
                    // InternalAPIMappingLanguage.g:2157:3: '>='
                    {
                    match(input,26,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAPIMappingLanguage.g:2162:6: ( ( '>' ) )
                    {
                    // InternalAPIMappingLanguage.g:2162:6: ( ( '>' ) )
                    // InternalAPIMappingLanguage.g:2163:1: ( '>' )
                    {
                     before(grammarAccess.getComparingRelOperatorAccess().getGREATEREnumLiteralDeclaration_3()); 
                    // InternalAPIMappingLanguage.g:2164:1: ( '>' )
                    // InternalAPIMappingLanguage.g:2164:3: '>'
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
    // InternalAPIMappingLanguage.g:2174:1: rule__AdditionOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2178:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
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
                    // InternalAPIMappingLanguage.g:2179:1: ( ( '+' ) )
                    {
                    // InternalAPIMappingLanguage.g:2179:1: ( ( '+' ) )
                    // InternalAPIMappingLanguage.g:2180:1: ( '+' )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2181:1: ( '+' )
                    // InternalAPIMappingLanguage.g:2181:3: '+'
                    {
                    match(input,28,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2186:6: ( ( '-' ) )
                    {
                    // InternalAPIMappingLanguage.g:2186:6: ( ( '-' ) )
                    // InternalAPIMappingLanguage.g:2187:1: ( '-' )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2188:1: ( '-' )
                    // InternalAPIMappingLanguage.g:2188:3: '-'
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
    // InternalAPIMappingLanguage.g:2198:1: rule__MultiplicationOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) );
    public final void rule__MultiplicationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2202:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt22=1;
                }
                break;
            case 31:
                {
                alt22=2;
                }
                break;
            case 32:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2203:1: ( ( '*' ) )
                    {
                    // InternalAPIMappingLanguage.g:2203:1: ( ( '*' ) )
                    // InternalAPIMappingLanguage.g:2204:1: ( '*' )
                    {
                     before(grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2205:1: ( '*' )
                    // InternalAPIMappingLanguage.g:2205:3: '*'
                    {
                    match(input,30,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2210:6: ( ( '/' ) )
                    {
                    // InternalAPIMappingLanguage.g:2210:6: ( ( '/' ) )
                    // InternalAPIMappingLanguage.g:2211:1: ( '/' )
                    {
                     before(grammarAccess.getMultiplicationOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2212:1: ( '/' )
                    // InternalAPIMappingLanguage.g:2212:3: '/'
                    {
                    match(input,31,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicationOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:2217:6: ( ( '%' ) )
                    {
                    // InternalAPIMappingLanguage.g:2217:6: ( ( '%' ) )
                    // InternalAPIMappingLanguage.g:2218:1: ( '%' )
                    {
                     before(grammarAccess.getMultiplicationOperatorAccess().getMODULOEnumLiteralDeclaration_2()); 
                    // InternalAPIMappingLanguage.g:2219:1: ( '%' )
                    // InternalAPIMappingLanguage.g:2219:3: '%'
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
    // InternalAPIMappingLanguage.g:2229:1: rule__UnaryPreOperator__Alternatives : ( ( ( 'not' ) ) | ( ( '-' ) ) );
    public final void rule__UnaryPreOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2233:1: ( ( ( 'not' ) ) | ( ( '-' ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            else if ( (LA23_0==29) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2234:1: ( ( 'not' ) )
                    {
                    // InternalAPIMappingLanguage.g:2234:1: ( ( 'not' ) )
                    // InternalAPIMappingLanguage.g:2235:1: ( 'not' )
                    {
                     before(grammarAccess.getUnaryPreOperatorAccess().getNOTEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2236:1: ( 'not' )
                    // InternalAPIMappingLanguage.g:2236:3: 'not'
                    {
                    match(input,33,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryPreOperatorAccess().getNOTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2241:6: ( ( '-' ) )
                    {
                    // InternalAPIMappingLanguage.g:2241:6: ( ( '-' ) )
                    // InternalAPIMappingLanguage.g:2242:1: ( '-' )
                    {
                     before(grammarAccess.getUnaryPreOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2243:1: ( '-' )
                    // InternalAPIMappingLanguage.g:2243:3: '-'
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
    // InternalAPIMappingLanguage.g:2253:1: rule__PositionSelectorKind__Alternatives : ( ( ( 'self' ) ) | ( ( 'first' ) ) | ( ( 'last' ) ) | ( ( 'prev' ) ) | ( ( 'next' ) ) );
    public final void rule__PositionSelectorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2257:1: ( ( ( 'self' ) ) | ( ( 'first' ) ) | ( ( 'last' ) ) | ( ( 'prev' ) ) | ( ( 'next' ) ) )
            int alt24=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt24=1;
                }
                break;
            case 35:
                {
                alt24=2;
                }
                break;
            case 36:
                {
                alt24=3;
                }
                break;
            case 37:
                {
                alt24=4;
                }
                break;
            case 38:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2258:1: ( ( 'self' ) )
                    {
                    // InternalAPIMappingLanguage.g:2258:1: ( ( 'self' ) )
                    // InternalAPIMappingLanguage.g:2259:1: ( 'self' )
                    {
                     before(grammarAccess.getPositionSelectorKindAccess().getSELFEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2260:1: ( 'self' )
                    // InternalAPIMappingLanguage.g:2260:3: 'self'
                    {
                    match(input,34,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionSelectorKindAccess().getSELFEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2265:6: ( ( 'first' ) )
                    {
                    // InternalAPIMappingLanguage.g:2265:6: ( ( 'first' ) )
                    // InternalAPIMappingLanguage.g:2266:1: ( 'first' )
                    {
                     before(grammarAccess.getPositionSelectorKindAccess().getFIRSTEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2267:1: ( 'first' )
                    // InternalAPIMappingLanguage.g:2267:3: 'first'
                    {
                    match(input,35,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionSelectorKindAccess().getFIRSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:2272:6: ( ( 'last' ) )
                    {
                    // InternalAPIMappingLanguage.g:2272:6: ( ( 'last' ) )
                    // InternalAPIMappingLanguage.g:2273:1: ( 'last' )
                    {
                     before(grammarAccess.getPositionSelectorKindAccess().getLASTEnumLiteralDeclaration_2()); 
                    // InternalAPIMappingLanguage.g:2274:1: ( 'last' )
                    // InternalAPIMappingLanguage.g:2274:3: 'last'
                    {
                    match(input,36,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionSelectorKindAccess().getLASTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAPIMappingLanguage.g:2279:6: ( ( 'prev' ) )
                    {
                    // InternalAPIMappingLanguage.g:2279:6: ( ( 'prev' ) )
                    // InternalAPIMappingLanguage.g:2280:1: ( 'prev' )
                    {
                     before(grammarAccess.getPositionSelectorKindAccess().getPREVEnumLiteralDeclaration_3()); 
                    // InternalAPIMappingLanguage.g:2281:1: ( 'prev' )
                    // InternalAPIMappingLanguage.g:2281:3: 'prev'
                    {
                    match(input,37,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionSelectorKindAccess().getPREVEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAPIMappingLanguage.g:2286:6: ( ( 'next' ) )
                    {
                    // InternalAPIMappingLanguage.g:2286:6: ( ( 'next' ) )
                    // InternalAPIMappingLanguage.g:2287:1: ( 'next' )
                    {
                     before(grammarAccess.getPositionSelectorKindAccess().getNEXTEnumLiteralDeclaration_4()); 
                    // InternalAPIMappingLanguage.g:2288:1: ( 'next' )
                    // InternalAPIMappingLanguage.g:2288:3: 'next'
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


    // $ANTLR start "rule__MappingRepository__Group__0"
    // InternalAPIMappingLanguage.g:2300:1: rule__MappingRepository__Group__0 : rule__MappingRepository__Group__0__Impl rule__MappingRepository__Group__1 ;
    public final void rule__MappingRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2304:1: ( rule__MappingRepository__Group__0__Impl rule__MappingRepository__Group__1 )
            // InternalAPIMappingLanguage.g:2305:2: rule__MappingRepository__Group__0__Impl rule__MappingRepository__Group__1
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
    // InternalAPIMappingLanguage.g:2312:1: rule__MappingRepository__Group__0__Impl : ( ( rule__MappingRepository__ImportsAssignment_0 )* ) ;
    public final void rule__MappingRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2316:1: ( ( ( rule__MappingRepository__ImportsAssignment_0 )* ) )
            // InternalAPIMappingLanguage.g:2317:1: ( ( rule__MappingRepository__ImportsAssignment_0 )* )
            {
            // InternalAPIMappingLanguage.g:2317:1: ( ( rule__MappingRepository__ImportsAssignment_0 )* )
            // InternalAPIMappingLanguage.g:2318:1: ( rule__MappingRepository__ImportsAssignment_0 )*
            {
             before(grammarAccess.getMappingRepositoryAccess().getImportsAssignment_0()); 
            // InternalAPIMappingLanguage.g:2319:1: ( rule__MappingRepository__ImportsAssignment_0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==44) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:2319:2: rule__MappingRepository__ImportsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__MappingRepository__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalAPIMappingLanguage.g:2329:1: rule__MappingRepository__Group__1 : rule__MappingRepository__Group__1__Impl rule__MappingRepository__Group__2 ;
    public final void rule__MappingRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2333:1: ( rule__MappingRepository__Group__1__Impl rule__MappingRepository__Group__2 )
            // InternalAPIMappingLanguage.g:2334:2: rule__MappingRepository__Group__1__Impl rule__MappingRepository__Group__2
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
    // InternalAPIMappingLanguage.g:2341:1: rule__MappingRepository__Group__1__Impl : ( 'MappingRepository:' ) ;
    public final void rule__MappingRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2345:1: ( ( 'MappingRepository:' ) )
            // InternalAPIMappingLanguage.g:2346:1: ( 'MappingRepository:' )
            {
            // InternalAPIMappingLanguage.g:2346:1: ( 'MappingRepository:' )
            // InternalAPIMappingLanguage.g:2347:1: 'MappingRepository:'
            {
             before(grammarAccess.getMappingRepositoryAccess().getMappingRepositoryKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:2360:1: rule__MappingRepository__Group__2 : rule__MappingRepository__Group__2__Impl rule__MappingRepository__Group__3 ;
    public final void rule__MappingRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2364:1: ( rule__MappingRepository__Group__2__Impl rule__MappingRepository__Group__3 )
            // InternalAPIMappingLanguage.g:2365:2: rule__MappingRepository__Group__2__Impl rule__MappingRepository__Group__3
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
    // InternalAPIMappingLanguage.g:2372:1: rule__MappingRepository__Group__2__Impl : ( ( rule__MappingRepository__NameAssignment_2 ) ) ;
    public final void rule__MappingRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2376:1: ( ( ( rule__MappingRepository__NameAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:2377:1: ( ( rule__MappingRepository__NameAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:2377:1: ( ( rule__MappingRepository__NameAssignment_2 ) )
            // InternalAPIMappingLanguage.g:2378:1: ( rule__MappingRepository__NameAssignment_2 )
            {
             before(grammarAccess.getMappingRepositoryAccess().getNameAssignment_2()); 
            // InternalAPIMappingLanguage.g:2379:1: ( rule__MappingRepository__NameAssignment_2 )
            // InternalAPIMappingLanguage.g:2379:2: rule__MappingRepository__NameAssignment_2
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
    // InternalAPIMappingLanguage.g:2389:1: rule__MappingRepository__Group__3 : rule__MappingRepository__Group__3__Impl rule__MappingRepository__Group__4 ;
    public final void rule__MappingRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2393:1: ( rule__MappingRepository__Group__3__Impl rule__MappingRepository__Group__4 )
            // InternalAPIMappingLanguage.g:2394:2: rule__MappingRepository__Group__3__Impl rule__MappingRepository__Group__4
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
    // InternalAPIMappingLanguage.g:2401:1: rule__MappingRepository__Group__3__Impl : ( '{' ) ;
    public final void rule__MappingRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2405:1: ( ( '{' ) )
            // InternalAPIMappingLanguage.g:2406:1: ( '{' )
            {
            // InternalAPIMappingLanguage.g:2406:1: ( '{' )
            // InternalAPIMappingLanguage.g:2407:1: '{'
            {
             before(grammarAccess.getMappingRepositoryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,40,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:2420:1: rule__MappingRepository__Group__4 : rule__MappingRepository__Group__4__Impl rule__MappingRepository__Group__5 ;
    public final void rule__MappingRepository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2424:1: ( rule__MappingRepository__Group__4__Impl rule__MappingRepository__Group__5 )
            // InternalAPIMappingLanguage.g:2425:2: rule__MappingRepository__Group__4__Impl rule__MappingRepository__Group__5
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
    // InternalAPIMappingLanguage.g:2432:1: rule__MappingRepository__Group__4__Impl : ( ( rule__MappingRepository__Group_4__0 )? ) ;
    public final void rule__MappingRepository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2436:1: ( ( ( rule__MappingRepository__Group_4__0 )? ) )
            // InternalAPIMappingLanguage.g:2437:1: ( ( rule__MappingRepository__Group_4__0 )? )
            {
            // InternalAPIMappingLanguage.g:2437:1: ( ( rule__MappingRepository__Group_4__0 )? )
            // InternalAPIMappingLanguage.g:2438:1: ( rule__MappingRepository__Group_4__0 )?
            {
             before(grammarAccess.getMappingRepositoryAccess().getGroup_4()); 
            // InternalAPIMappingLanguage.g:2439:1: ( rule__MappingRepository__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2439:2: rule__MappingRepository__Group_4__0
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
    // InternalAPIMappingLanguage.g:2449:1: rule__MappingRepository__Group__5 : rule__MappingRepository__Group__5__Impl rule__MappingRepository__Group__6 ;
    public final void rule__MappingRepository__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2453:1: ( rule__MappingRepository__Group__5__Impl rule__MappingRepository__Group__6 )
            // InternalAPIMappingLanguage.g:2454:2: rule__MappingRepository__Group__5__Impl rule__MappingRepository__Group__6
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
    // InternalAPIMappingLanguage.g:2461:1: rule__MappingRepository__Group__5__Impl : ( '}' ) ;
    public final void rule__MappingRepository__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2465:1: ( ( '}' ) )
            // InternalAPIMappingLanguage.g:2466:1: ( '}' )
            {
            // InternalAPIMappingLanguage.g:2466:1: ( '}' )
            // InternalAPIMappingLanguage.g:2467:1: '}'
            {
             before(grammarAccess.getMappingRepositoryAccess().getRightCurlyBracketKeyword_5()); 
            match(input,41,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:2480:1: rule__MappingRepository__Group__6 : rule__MappingRepository__Group__6__Impl ;
    public final void rule__MappingRepository__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2484:1: ( rule__MappingRepository__Group__6__Impl )
            // InternalAPIMappingLanguage.g:2485:2: rule__MappingRepository__Group__6__Impl
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
    // InternalAPIMappingLanguage.g:2491:1: rule__MappingRepository__Group__6__Impl : ( ( rule__MappingRepository__Group_6__0 )? ) ;
    public final void rule__MappingRepository__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2495:1: ( ( ( rule__MappingRepository__Group_6__0 )? ) )
            // InternalAPIMappingLanguage.g:2496:1: ( ( rule__MappingRepository__Group_6__0 )? )
            {
            // InternalAPIMappingLanguage.g:2496:1: ( ( rule__MappingRepository__Group_6__0 )? )
            // InternalAPIMappingLanguage.g:2497:1: ( rule__MappingRepository__Group_6__0 )?
            {
             before(grammarAccess.getMappingRepositoryAccess().getGroup_6()); 
            // InternalAPIMappingLanguage.g:2498:1: ( rule__MappingRepository__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==43) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2498:2: rule__MappingRepository__Group_6__0
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
    // InternalAPIMappingLanguage.g:2522:1: rule__MappingRepository__Group_4__0 : rule__MappingRepository__Group_4__0__Impl rule__MappingRepository__Group_4__1 ;
    public final void rule__MappingRepository__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2526:1: ( rule__MappingRepository__Group_4__0__Impl rule__MappingRepository__Group_4__1 )
            // InternalAPIMappingLanguage.g:2527:2: rule__MappingRepository__Group_4__0__Impl rule__MappingRepository__Group_4__1
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
    // InternalAPIMappingLanguage.g:2534:1: rule__MappingRepository__Group_4__0__Impl : ( ( rule__MappingRepository__PortApiMappingsAssignment_4_0 ) ) ;
    public final void rule__MappingRepository__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2538:1: ( ( ( rule__MappingRepository__PortApiMappingsAssignment_4_0 ) ) )
            // InternalAPIMappingLanguage.g:2539:1: ( ( rule__MappingRepository__PortApiMappingsAssignment_4_0 ) )
            {
            // InternalAPIMappingLanguage.g:2539:1: ( ( rule__MappingRepository__PortApiMappingsAssignment_4_0 ) )
            // InternalAPIMappingLanguage.g:2540:1: ( rule__MappingRepository__PortApiMappingsAssignment_4_0 )
            {
             before(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsAssignment_4_0()); 
            // InternalAPIMappingLanguage.g:2541:1: ( rule__MappingRepository__PortApiMappingsAssignment_4_0 )
            // InternalAPIMappingLanguage.g:2541:2: rule__MappingRepository__PortApiMappingsAssignment_4_0
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
    // InternalAPIMappingLanguage.g:2551:1: rule__MappingRepository__Group_4__1 : rule__MappingRepository__Group_4__1__Impl ;
    public final void rule__MappingRepository__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2555:1: ( rule__MappingRepository__Group_4__1__Impl )
            // InternalAPIMappingLanguage.g:2556:2: rule__MappingRepository__Group_4__1__Impl
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
    // InternalAPIMappingLanguage.g:2562:1: rule__MappingRepository__Group_4__1__Impl : ( ( rule__MappingRepository__Group_4_1__0 )* ) ;
    public final void rule__MappingRepository__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2566:1: ( ( ( rule__MappingRepository__Group_4_1__0 )* ) )
            // InternalAPIMappingLanguage.g:2567:1: ( ( rule__MappingRepository__Group_4_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:2567:1: ( ( rule__MappingRepository__Group_4_1__0 )* )
            // InternalAPIMappingLanguage.g:2568:1: ( rule__MappingRepository__Group_4_1__0 )*
            {
             before(grammarAccess.getMappingRepositoryAccess().getGroup_4_1()); 
            // InternalAPIMappingLanguage.g:2569:1: ( rule__MappingRepository__Group_4_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==42) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:2569:2: rule__MappingRepository__Group_4_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__MappingRepository__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalAPIMappingLanguage.g:2583:1: rule__MappingRepository__Group_4_1__0 : rule__MappingRepository__Group_4_1__0__Impl rule__MappingRepository__Group_4_1__1 ;
    public final void rule__MappingRepository__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2587:1: ( rule__MappingRepository__Group_4_1__0__Impl rule__MappingRepository__Group_4_1__1 )
            // InternalAPIMappingLanguage.g:2588:2: rule__MappingRepository__Group_4_1__0__Impl rule__MappingRepository__Group_4_1__1
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
    // InternalAPIMappingLanguage.g:2595:1: rule__MappingRepository__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__MappingRepository__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2599:1: ( ( ',' ) )
            // InternalAPIMappingLanguage.g:2600:1: ( ',' )
            {
            // InternalAPIMappingLanguage.g:2600:1: ( ',' )
            // InternalAPIMappingLanguage.g:2601:1: ','
            {
             before(grammarAccess.getMappingRepositoryAccess().getCommaKeyword_4_1_0()); 
            match(input,42,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:2614:1: rule__MappingRepository__Group_4_1__1 : rule__MappingRepository__Group_4_1__1__Impl ;
    public final void rule__MappingRepository__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2618:1: ( rule__MappingRepository__Group_4_1__1__Impl )
            // InternalAPIMappingLanguage.g:2619:2: rule__MappingRepository__Group_4_1__1__Impl
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
    // InternalAPIMappingLanguage.g:2625:1: rule__MappingRepository__Group_4_1__1__Impl : ( ( rule__MappingRepository__PortApiMappingsAssignment_4_1_1 ) ) ;
    public final void rule__MappingRepository__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2629:1: ( ( ( rule__MappingRepository__PortApiMappingsAssignment_4_1_1 ) ) )
            // InternalAPIMappingLanguage.g:2630:1: ( ( rule__MappingRepository__PortApiMappingsAssignment_4_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:2630:1: ( ( rule__MappingRepository__PortApiMappingsAssignment_4_1_1 ) )
            // InternalAPIMappingLanguage.g:2631:1: ( rule__MappingRepository__PortApiMappingsAssignment_4_1_1 )
            {
             before(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsAssignment_4_1_1()); 
            // InternalAPIMappingLanguage.g:2632:1: ( rule__MappingRepository__PortApiMappingsAssignment_4_1_1 )
            // InternalAPIMappingLanguage.g:2632:2: rule__MappingRepository__PortApiMappingsAssignment_4_1_1
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
    // InternalAPIMappingLanguage.g:2646:1: rule__MappingRepository__Group_6__0 : rule__MappingRepository__Group_6__0__Impl rule__MappingRepository__Group_6__1 ;
    public final void rule__MappingRepository__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2650:1: ( rule__MappingRepository__Group_6__0__Impl rule__MappingRepository__Group_6__1 )
            // InternalAPIMappingLanguage.g:2651:2: rule__MappingRepository__Group_6__0__Impl rule__MappingRepository__Group_6__1
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
    // InternalAPIMappingLanguage.g:2658:1: rule__MappingRepository__Group_6__0__Impl : ( '#' ) ;
    public final void rule__MappingRepository__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2662:1: ( ( '#' ) )
            // InternalAPIMappingLanguage.g:2663:1: ( '#' )
            {
            // InternalAPIMappingLanguage.g:2663:1: ( '#' )
            // InternalAPIMappingLanguage.g:2664:1: '#'
            {
             before(grammarAccess.getMappingRepositoryAccess().getNumberSignKeyword_6_0()); 
            match(input,43,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:2677:1: rule__MappingRepository__Group_6__1 : rule__MappingRepository__Group_6__1__Impl ;
    public final void rule__MappingRepository__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2681:1: ( rule__MappingRepository__Group_6__1__Impl )
            // InternalAPIMappingLanguage.g:2682:2: rule__MappingRepository__Group_6__1__Impl
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
    // InternalAPIMappingLanguage.g:2688:1: rule__MappingRepository__Group_6__1__Impl : ( ( rule__MappingRepository__CommentAssignment_6_1 ) ) ;
    public final void rule__MappingRepository__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2692:1: ( ( ( rule__MappingRepository__CommentAssignment_6_1 ) ) )
            // InternalAPIMappingLanguage.g:2693:1: ( ( rule__MappingRepository__CommentAssignment_6_1 ) )
            {
            // InternalAPIMappingLanguage.g:2693:1: ( ( rule__MappingRepository__CommentAssignment_6_1 ) )
            // InternalAPIMappingLanguage.g:2694:1: ( rule__MappingRepository__CommentAssignment_6_1 )
            {
             before(grammarAccess.getMappingRepositoryAccess().getCommentAssignment_6_1()); 
            // InternalAPIMappingLanguage.g:2695:1: ( rule__MappingRepository__CommentAssignment_6_1 )
            // InternalAPIMappingLanguage.g:2695:2: rule__MappingRepository__CommentAssignment_6_1
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
    // InternalAPIMappingLanguage.g:2709:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2713:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalAPIMappingLanguage.g:2714:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalAPIMappingLanguage.g:2721:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2725:1: ( ( 'import' ) )
            // InternalAPIMappingLanguage.g:2726:1: ( 'import' )
            {
            // InternalAPIMappingLanguage.g:2726:1: ( 'import' )
            // InternalAPIMappingLanguage.g:2727:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,44,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:2740:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2744:1: ( rule__Import__Group__1__Impl )
            // InternalAPIMappingLanguage.g:2745:2: rule__Import__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:2751:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2755:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:2756:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:2756:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalAPIMappingLanguage.g:2757:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // InternalAPIMappingLanguage.g:2758:1: ( rule__Import__ImportURIAssignment_1 )
            // InternalAPIMappingLanguage.g:2758:2: rule__Import__ImportURIAssignment_1
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
    // InternalAPIMappingLanguage.g:2772:1: rule__PortApiMapping__Group__0 : rule__PortApiMapping__Group__0__Impl rule__PortApiMapping__Group__1 ;
    public final void rule__PortApiMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2776:1: ( rule__PortApiMapping__Group__0__Impl rule__PortApiMapping__Group__1 )
            // InternalAPIMappingLanguage.g:2777:2: rule__PortApiMapping__Group__0__Impl rule__PortApiMapping__Group__1
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
    // InternalAPIMappingLanguage.g:2784:1: rule__PortApiMapping__Group__0__Impl : ( 'PortInstance:' ) ;
    public final void rule__PortApiMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2788:1: ( ( 'PortInstance:' ) )
            // InternalAPIMappingLanguage.g:2789:1: ( 'PortInstance:' )
            {
            // InternalAPIMappingLanguage.g:2789:1: ( 'PortInstance:' )
            // InternalAPIMappingLanguage.g:2790:1: 'PortInstance:'
            {
             before(grammarAccess.getPortApiMappingAccess().getPortInstanceKeyword_0()); 
            match(input,45,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:2803:1: rule__PortApiMapping__Group__1 : rule__PortApiMapping__Group__1__Impl rule__PortApiMapping__Group__2 ;
    public final void rule__PortApiMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2807:1: ( rule__PortApiMapping__Group__1__Impl rule__PortApiMapping__Group__2 )
            // InternalAPIMappingLanguage.g:2808:2: rule__PortApiMapping__Group__1__Impl rule__PortApiMapping__Group__2
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
    // InternalAPIMappingLanguage.g:2815:1: rule__PortApiMapping__Group__1__Impl : ( ( rule__PortApiMapping__PortAssignment_1 ) ) ;
    public final void rule__PortApiMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2819:1: ( ( ( rule__PortApiMapping__PortAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:2820:1: ( ( rule__PortApiMapping__PortAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:2820:1: ( ( rule__PortApiMapping__PortAssignment_1 ) )
            // InternalAPIMappingLanguage.g:2821:1: ( rule__PortApiMapping__PortAssignment_1 )
            {
             before(grammarAccess.getPortApiMappingAccess().getPortAssignment_1()); 
            // InternalAPIMappingLanguage.g:2822:1: ( rule__PortApiMapping__PortAssignment_1 )
            // InternalAPIMappingLanguage.g:2822:2: rule__PortApiMapping__PortAssignment_1
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
    // InternalAPIMappingLanguage.g:2832:1: rule__PortApiMapping__Group__2 : rule__PortApiMapping__Group__2__Impl rule__PortApiMapping__Group__3 ;
    public final void rule__PortApiMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2836:1: ( rule__PortApiMapping__Group__2__Impl rule__PortApiMapping__Group__3 )
            // InternalAPIMappingLanguage.g:2837:2: rule__PortApiMapping__Group__2__Impl rule__PortApiMapping__Group__3
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
    // InternalAPIMappingLanguage.g:2844:1: rule__PortApiMapping__Group__2__Impl : ( '{' ) ;
    public final void rule__PortApiMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2848:1: ( ( '{' ) )
            // InternalAPIMappingLanguage.g:2849:1: ( '{' )
            {
            // InternalAPIMappingLanguage.g:2849:1: ( '{' )
            // InternalAPIMappingLanguage.g:2850:1: '{'
            {
             before(grammarAccess.getPortApiMappingAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:2863:1: rule__PortApiMapping__Group__3 : rule__PortApiMapping__Group__3__Impl rule__PortApiMapping__Group__4 ;
    public final void rule__PortApiMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2867:1: ( rule__PortApiMapping__Group__3__Impl rule__PortApiMapping__Group__4 )
            // InternalAPIMappingLanguage.g:2868:2: rule__PortApiMapping__Group__3__Impl rule__PortApiMapping__Group__4
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
    // InternalAPIMappingLanguage.g:2875:1: rule__PortApiMapping__Group__3__Impl : ( 'execCommand:' ) ;
    public final void rule__PortApiMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2879:1: ( ( 'execCommand:' ) )
            // InternalAPIMappingLanguage.g:2880:1: ( 'execCommand:' )
            {
            // InternalAPIMappingLanguage.g:2880:1: ( 'execCommand:' )
            // InternalAPIMappingLanguage.g:2881:1: 'execCommand:'
            {
             before(grammarAccess.getPortApiMappingAccess().getExecCommandKeyword_3()); 
            match(input,46,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:2894:1: rule__PortApiMapping__Group__4 : rule__PortApiMapping__Group__4__Impl rule__PortApiMapping__Group__5 ;
    public final void rule__PortApiMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2898:1: ( rule__PortApiMapping__Group__4__Impl rule__PortApiMapping__Group__5 )
            // InternalAPIMappingLanguage.g:2899:2: rule__PortApiMapping__Group__4__Impl rule__PortApiMapping__Group__5
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
    // InternalAPIMappingLanguage.g:2906:1: rule__PortApiMapping__Group__4__Impl : ( ( rule__PortApiMapping__ExecCommandAssignment_4 ) ) ;
    public final void rule__PortApiMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2910:1: ( ( ( rule__PortApiMapping__ExecCommandAssignment_4 ) ) )
            // InternalAPIMappingLanguage.g:2911:1: ( ( rule__PortApiMapping__ExecCommandAssignment_4 ) )
            {
            // InternalAPIMappingLanguage.g:2911:1: ( ( rule__PortApiMapping__ExecCommandAssignment_4 ) )
            // InternalAPIMappingLanguage.g:2912:1: ( rule__PortApiMapping__ExecCommandAssignment_4 )
            {
             before(grammarAccess.getPortApiMappingAccess().getExecCommandAssignment_4()); 
            // InternalAPIMappingLanguage.g:2913:1: ( rule__PortApiMapping__ExecCommandAssignment_4 )
            // InternalAPIMappingLanguage.g:2913:2: rule__PortApiMapping__ExecCommandAssignment_4
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
    // InternalAPIMappingLanguage.g:2923:1: rule__PortApiMapping__Group__5 : rule__PortApiMapping__Group__5__Impl rule__PortApiMapping__Group__6 ;
    public final void rule__PortApiMapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2927:1: ( rule__PortApiMapping__Group__5__Impl rule__PortApiMapping__Group__6 )
            // InternalAPIMappingLanguage.g:2928:2: rule__PortApiMapping__Group__5__Impl rule__PortApiMapping__Group__6
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
    // InternalAPIMappingLanguage.g:2935:1: rule__PortApiMapping__Group__5__Impl : ( ( rule__PortApiMapping__Group_5__0 )? ) ;
    public final void rule__PortApiMapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2939:1: ( ( ( rule__PortApiMapping__Group_5__0 )? ) )
            // InternalAPIMappingLanguage.g:2940:1: ( ( rule__PortApiMapping__Group_5__0 )? )
            {
            // InternalAPIMappingLanguage.g:2940:1: ( ( rule__PortApiMapping__Group_5__0 )? )
            // InternalAPIMappingLanguage.g:2941:1: ( rule__PortApiMapping__Group_5__0 )?
            {
             before(grammarAccess.getPortApiMappingAccess().getGroup_5()); 
            // InternalAPIMappingLanguage.g:2942:1: ( rule__PortApiMapping__Group_5__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==47) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2942:2: rule__PortApiMapping__Group_5__0
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
    // InternalAPIMappingLanguage.g:2952:1: rule__PortApiMapping__Group__6 : rule__PortApiMapping__Group__6__Impl ;
    public final void rule__PortApiMapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2956:1: ( rule__PortApiMapping__Group__6__Impl )
            // InternalAPIMappingLanguage.g:2957:2: rule__PortApiMapping__Group__6__Impl
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
    // InternalAPIMappingLanguage.g:2963:1: rule__PortApiMapping__Group__6__Impl : ( '}' ) ;
    public final void rule__PortApiMapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2967:1: ( ( '}' ) )
            // InternalAPIMappingLanguage.g:2968:1: ( '}' )
            {
            // InternalAPIMappingLanguage.g:2968:1: ( '}' )
            // InternalAPIMappingLanguage.g:2969:1: '}'
            {
             before(grammarAccess.getPortApiMappingAccess().getRightCurlyBracketKeyword_6()); 
            match(input,41,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:2996:1: rule__PortApiMapping__Group_5__0 : rule__PortApiMapping__Group_5__0__Impl rule__PortApiMapping__Group_5__1 ;
    public final void rule__PortApiMapping__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3000:1: ( rule__PortApiMapping__Group_5__0__Impl rule__PortApiMapping__Group_5__1 )
            // InternalAPIMappingLanguage.g:3001:2: rule__PortApiMapping__Group_5__0__Impl rule__PortApiMapping__Group_5__1
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
    // InternalAPIMappingLanguage.g:3008:1: rule__PortApiMapping__Group_5__0__Impl : ( 'initCommand:' ) ;
    public final void rule__PortApiMapping__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3012:1: ( ( 'initCommand:' ) )
            // InternalAPIMappingLanguage.g:3013:1: ( 'initCommand:' )
            {
            // InternalAPIMappingLanguage.g:3013:1: ( 'initCommand:' )
            // InternalAPIMappingLanguage.g:3014:1: 'initCommand:'
            {
             before(grammarAccess.getPortApiMappingAccess().getInitCommandKeyword_5_0()); 
            match(input,47,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:3027:1: rule__PortApiMapping__Group_5__1 : rule__PortApiMapping__Group_5__1__Impl ;
    public final void rule__PortApiMapping__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3031:1: ( rule__PortApiMapping__Group_5__1__Impl )
            // InternalAPIMappingLanguage.g:3032:2: rule__PortApiMapping__Group_5__1__Impl
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
    // InternalAPIMappingLanguage.g:3038:1: rule__PortApiMapping__Group_5__1__Impl : ( ( rule__PortApiMapping__InitCommandAssignment_5_1 ) ) ;
    public final void rule__PortApiMapping__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3042:1: ( ( ( rule__PortApiMapping__InitCommandAssignment_5_1 ) ) )
            // InternalAPIMappingLanguage.g:3043:1: ( ( rule__PortApiMapping__InitCommandAssignment_5_1 ) )
            {
            // InternalAPIMappingLanguage.g:3043:1: ( ( rule__PortApiMapping__InitCommandAssignment_5_1 ) )
            // InternalAPIMappingLanguage.g:3044:1: ( rule__PortApiMapping__InitCommandAssignment_5_1 )
            {
             before(grammarAccess.getPortApiMappingAccess().getInitCommandAssignment_5_1()); 
            // InternalAPIMappingLanguage.g:3045:1: ( rule__PortApiMapping__InitCommandAssignment_5_1 )
            // InternalAPIMappingLanguage.g:3045:2: rule__PortApiMapping__InitCommandAssignment_5_1
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
    // InternalAPIMappingLanguage.g:3059:1: rule__EnumerationValueExpression__Group__0 : rule__EnumerationValueExpression__Group__0__Impl rule__EnumerationValueExpression__Group__1 ;
    public final void rule__EnumerationValueExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3063:1: ( rule__EnumerationValueExpression__Group__0__Impl rule__EnumerationValueExpression__Group__1 )
            // InternalAPIMappingLanguage.g:3064:2: rule__EnumerationValueExpression__Group__0__Impl rule__EnumerationValueExpression__Group__1
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
    // InternalAPIMappingLanguage.g:3071:1: rule__EnumerationValueExpression__Group__0__Impl : ( 'enum:' ) ;
    public final void rule__EnumerationValueExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3075:1: ( ( 'enum:' ) )
            // InternalAPIMappingLanguage.g:3076:1: ( 'enum:' )
            {
            // InternalAPIMappingLanguage.g:3076:1: ( 'enum:' )
            // InternalAPIMappingLanguage.g:3077:1: 'enum:'
            {
             before(grammarAccess.getEnumerationValueExpressionAccess().getEnumKeyword_0()); 
            match(input,48,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:3090:1: rule__EnumerationValueExpression__Group__1 : rule__EnumerationValueExpression__Group__1__Impl ;
    public final void rule__EnumerationValueExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3094:1: ( rule__EnumerationValueExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:3095:2: rule__EnumerationValueExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:3101:1: rule__EnumerationValueExpression__Group__1__Impl : ( ( rule__EnumerationValueExpression__EnumValueAssignment_1 ) ) ;
    public final void rule__EnumerationValueExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3105:1: ( ( ( rule__EnumerationValueExpression__EnumValueAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:3106:1: ( ( rule__EnumerationValueExpression__EnumValueAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:3106:1: ( ( rule__EnumerationValueExpression__EnumValueAssignment_1 ) )
            // InternalAPIMappingLanguage.g:3107:1: ( rule__EnumerationValueExpression__EnumValueAssignment_1 )
            {
             before(grammarAccess.getEnumerationValueExpressionAccess().getEnumValueAssignment_1()); 
            // InternalAPIMappingLanguage.g:3108:1: ( rule__EnumerationValueExpression__EnumValueAssignment_1 )
            // InternalAPIMappingLanguage.g:3108:2: rule__EnumerationValueExpression__EnumValueAssignment_1
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
    // InternalAPIMappingLanguage.g:3122:1: rule__APICallExpression__Group__0 : rule__APICallExpression__Group__0__Impl rule__APICallExpression__Group__1 ;
    public final void rule__APICallExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3126:1: ( rule__APICallExpression__Group__0__Impl rule__APICallExpression__Group__1 )
            // InternalAPIMappingLanguage.g:3127:2: rule__APICallExpression__Group__0__Impl rule__APICallExpression__Group__1
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
    // InternalAPIMappingLanguage.g:3134:1: rule__APICallExpression__Group__0__Impl : ( ( rule__APICallExpression__ApiCommandAssignment_0 ) ) ;
    public final void rule__APICallExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3138:1: ( ( ( rule__APICallExpression__ApiCommandAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:3139:1: ( ( rule__APICallExpression__ApiCommandAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:3139:1: ( ( rule__APICallExpression__ApiCommandAssignment_0 ) )
            // InternalAPIMappingLanguage.g:3140:1: ( rule__APICallExpression__ApiCommandAssignment_0 )
            {
             before(grammarAccess.getAPICallExpressionAccess().getApiCommandAssignment_0()); 
            // InternalAPIMappingLanguage.g:3141:1: ( rule__APICallExpression__ApiCommandAssignment_0 )
            // InternalAPIMappingLanguage.g:3141:2: rule__APICallExpression__ApiCommandAssignment_0
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
    // InternalAPIMappingLanguage.g:3151:1: rule__APICallExpression__Group__1 : rule__APICallExpression__Group__1__Impl rule__APICallExpression__Group__2 ;
    public final void rule__APICallExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3155:1: ( rule__APICallExpression__Group__1__Impl rule__APICallExpression__Group__2 )
            // InternalAPIMappingLanguage.g:3156:2: rule__APICallExpression__Group__1__Impl rule__APICallExpression__Group__2
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
    // InternalAPIMappingLanguage.g:3163:1: rule__APICallExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__APICallExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3167:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:3168:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:3168:1: ( '(' )
            // InternalAPIMappingLanguage.g:3169:1: '('
            {
             before(grammarAccess.getAPICallExpressionAccess().getLeftParenthesisKeyword_1()); 
            match(input,49,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:3182:1: rule__APICallExpression__Group__2 : rule__APICallExpression__Group__2__Impl rule__APICallExpression__Group__3 ;
    public final void rule__APICallExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3186:1: ( rule__APICallExpression__Group__2__Impl rule__APICallExpression__Group__3 )
            // InternalAPIMappingLanguage.g:3187:2: rule__APICallExpression__Group__2__Impl rule__APICallExpression__Group__3
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
    // InternalAPIMappingLanguage.g:3194:1: rule__APICallExpression__Group__2__Impl : ( ( rule__APICallExpression__Group_2__0 )? ) ;
    public final void rule__APICallExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3198:1: ( ( ( rule__APICallExpression__Group_2__0 )? ) )
            // InternalAPIMappingLanguage.g:3199:1: ( ( rule__APICallExpression__Group_2__0 )? )
            {
            // InternalAPIMappingLanguage.g:3199:1: ( ( rule__APICallExpression__Group_2__0 )? )
            // InternalAPIMappingLanguage.g:3200:1: ( rule__APICallExpression__Group_2__0 )?
            {
             before(grammarAccess.getAPICallExpressionAccess().getGroup_2()); 
            // InternalAPIMappingLanguage.g:3201:1: ( rule__APICallExpression__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAPIMappingLanguage.g:3201:2: rule__APICallExpression__Group_2__0
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
    // InternalAPIMappingLanguage.g:3211:1: rule__APICallExpression__Group__3 : rule__APICallExpression__Group__3__Impl ;
    public final void rule__APICallExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3215:1: ( rule__APICallExpression__Group__3__Impl )
            // InternalAPIMappingLanguage.g:3216:2: rule__APICallExpression__Group__3__Impl
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
    // InternalAPIMappingLanguage.g:3222:1: rule__APICallExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__APICallExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3226:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:3227:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:3227:1: ( ')' )
            // InternalAPIMappingLanguage.g:3228:1: ')'
            {
             before(grammarAccess.getAPICallExpressionAccess().getRightParenthesisKeyword_3()); 
            match(input,50,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:3249:1: rule__APICallExpression__Group_2__0 : rule__APICallExpression__Group_2__0__Impl rule__APICallExpression__Group_2__1 ;
    public final void rule__APICallExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3253:1: ( rule__APICallExpression__Group_2__0__Impl rule__APICallExpression__Group_2__1 )
            // InternalAPIMappingLanguage.g:3254:2: rule__APICallExpression__Group_2__0__Impl rule__APICallExpression__Group_2__1
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
    // InternalAPIMappingLanguage.g:3261:1: rule__APICallExpression__Group_2__0__Impl : ( ( rule__APICallExpression__ParameterBindingsAssignment_2_0 ) ) ;
    public final void rule__APICallExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3265:1: ( ( ( rule__APICallExpression__ParameterBindingsAssignment_2_0 ) ) )
            // InternalAPIMappingLanguage.g:3266:1: ( ( rule__APICallExpression__ParameterBindingsAssignment_2_0 ) )
            {
            // InternalAPIMappingLanguage.g:3266:1: ( ( rule__APICallExpression__ParameterBindingsAssignment_2_0 ) )
            // InternalAPIMappingLanguage.g:3267:1: ( rule__APICallExpression__ParameterBindingsAssignment_2_0 )
            {
             before(grammarAccess.getAPICallExpressionAccess().getParameterBindingsAssignment_2_0()); 
            // InternalAPIMappingLanguage.g:3268:1: ( rule__APICallExpression__ParameterBindingsAssignment_2_0 )
            // InternalAPIMappingLanguage.g:3268:2: rule__APICallExpression__ParameterBindingsAssignment_2_0
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
    // InternalAPIMappingLanguage.g:3278:1: rule__APICallExpression__Group_2__1 : rule__APICallExpression__Group_2__1__Impl ;
    public final void rule__APICallExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3282:1: ( rule__APICallExpression__Group_2__1__Impl )
            // InternalAPIMappingLanguage.g:3283:2: rule__APICallExpression__Group_2__1__Impl
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
    // InternalAPIMappingLanguage.g:3289:1: rule__APICallExpression__Group_2__1__Impl : ( ( rule__APICallExpression__Group_2_1__0 )* ) ;
    public final void rule__APICallExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3293:1: ( ( ( rule__APICallExpression__Group_2_1__0 )* ) )
            // InternalAPIMappingLanguage.g:3294:1: ( ( rule__APICallExpression__Group_2_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:3294:1: ( ( rule__APICallExpression__Group_2_1__0 )* )
            // InternalAPIMappingLanguage.g:3295:1: ( rule__APICallExpression__Group_2_1__0 )*
            {
             before(grammarAccess.getAPICallExpressionAccess().getGroup_2_1()); 
            // InternalAPIMappingLanguage.g:3296:1: ( rule__APICallExpression__Group_2_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==42) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:3296:2: rule__APICallExpression__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__APICallExpression__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalAPIMappingLanguage.g:3310:1: rule__APICallExpression__Group_2_1__0 : rule__APICallExpression__Group_2_1__0__Impl rule__APICallExpression__Group_2_1__1 ;
    public final void rule__APICallExpression__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3314:1: ( rule__APICallExpression__Group_2_1__0__Impl rule__APICallExpression__Group_2_1__1 )
            // InternalAPIMappingLanguage.g:3315:2: rule__APICallExpression__Group_2_1__0__Impl rule__APICallExpression__Group_2_1__1
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
    // InternalAPIMappingLanguage.g:3322:1: rule__APICallExpression__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__APICallExpression__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3326:1: ( ( ',' ) )
            // InternalAPIMappingLanguage.g:3327:1: ( ',' )
            {
            // InternalAPIMappingLanguage.g:3327:1: ( ',' )
            // InternalAPIMappingLanguage.g:3328:1: ','
            {
             before(grammarAccess.getAPICallExpressionAccess().getCommaKeyword_2_1_0()); 
            match(input,42,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:3341:1: rule__APICallExpression__Group_2_1__1 : rule__APICallExpression__Group_2_1__1__Impl ;
    public final void rule__APICallExpression__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3345:1: ( rule__APICallExpression__Group_2_1__1__Impl )
            // InternalAPIMappingLanguage.g:3346:2: rule__APICallExpression__Group_2_1__1__Impl
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
    // InternalAPIMappingLanguage.g:3352:1: rule__APICallExpression__Group_2_1__1__Impl : ( ( rule__APICallExpression__ParameterBindingsAssignment_2_1_1 ) ) ;
    public final void rule__APICallExpression__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3356:1: ( ( ( rule__APICallExpression__ParameterBindingsAssignment_2_1_1 ) ) )
            // InternalAPIMappingLanguage.g:3357:1: ( ( rule__APICallExpression__ParameterBindingsAssignment_2_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:3357:1: ( ( rule__APICallExpression__ParameterBindingsAssignment_2_1_1 ) )
            // InternalAPIMappingLanguage.g:3358:1: ( rule__APICallExpression__ParameterBindingsAssignment_2_1_1 )
            {
             before(grammarAccess.getAPICallExpressionAccess().getParameterBindingsAssignment_2_1_1()); 
            // InternalAPIMappingLanguage.g:3359:1: ( rule__APICallExpression__ParameterBindingsAssignment_2_1_1 )
            // InternalAPIMappingLanguage.g:3359:2: rule__APICallExpression__ParameterBindingsAssignment_2_1_1
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
    // InternalAPIMappingLanguage.g:3373:1: rule__ParamaterBinding__Group__0 : rule__ParamaterBinding__Group__0__Impl rule__ParamaterBinding__Group__1 ;
    public final void rule__ParamaterBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3377:1: ( rule__ParamaterBinding__Group__0__Impl rule__ParamaterBinding__Group__1 )
            // InternalAPIMappingLanguage.g:3378:2: rule__ParamaterBinding__Group__0__Impl rule__ParamaterBinding__Group__1
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
    // InternalAPIMappingLanguage.g:3385:1: rule__ParamaterBinding__Group__0__Impl : ( () ) ;
    public final void rule__ParamaterBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3389:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:3390:1: ( () )
            {
            // InternalAPIMappingLanguage.g:3390:1: ( () )
            // InternalAPIMappingLanguage.g:3391:1: ()
            {
             before(grammarAccess.getParamaterBindingAccess().getParameterBindingAction_0()); 
            // InternalAPIMappingLanguage.g:3392:1: ()
            // InternalAPIMappingLanguage.g:3394:1: 
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
    // InternalAPIMappingLanguage.g:3404:1: rule__ParamaterBinding__Group__1 : rule__ParamaterBinding__Group__1__Impl rule__ParamaterBinding__Group__2 ;
    public final void rule__ParamaterBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3408:1: ( rule__ParamaterBinding__Group__1__Impl rule__ParamaterBinding__Group__2 )
            // InternalAPIMappingLanguage.g:3409:2: rule__ParamaterBinding__Group__1__Impl rule__ParamaterBinding__Group__2
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
    // InternalAPIMappingLanguage.g:3416:1: rule__ParamaterBinding__Group__1__Impl : ( ( rule__ParamaterBinding__ParameterAssignment_1 ) ) ;
    public final void rule__ParamaterBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3420:1: ( ( ( rule__ParamaterBinding__ParameterAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:3421:1: ( ( rule__ParamaterBinding__ParameterAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:3421:1: ( ( rule__ParamaterBinding__ParameterAssignment_1 ) )
            // InternalAPIMappingLanguage.g:3422:1: ( rule__ParamaterBinding__ParameterAssignment_1 )
            {
             before(grammarAccess.getParamaterBindingAccess().getParameterAssignment_1()); 
            // InternalAPIMappingLanguage.g:3423:1: ( rule__ParamaterBinding__ParameterAssignment_1 )
            // InternalAPIMappingLanguage.g:3423:2: rule__ParamaterBinding__ParameterAssignment_1
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
    // InternalAPIMappingLanguage.g:3433:1: rule__ParamaterBinding__Group__2 : rule__ParamaterBinding__Group__2__Impl rule__ParamaterBinding__Group__3 ;
    public final void rule__ParamaterBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3437:1: ( rule__ParamaterBinding__Group__2__Impl rule__ParamaterBinding__Group__3 )
            // InternalAPIMappingLanguage.g:3438:2: rule__ParamaterBinding__Group__2__Impl rule__ParamaterBinding__Group__3
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
    // InternalAPIMappingLanguage.g:3445:1: rule__ParamaterBinding__Group__2__Impl : ( ':=' ) ;
    public final void rule__ParamaterBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3449:1: ( ( ':=' ) )
            // InternalAPIMappingLanguage.g:3450:1: ( ':=' )
            {
            // InternalAPIMappingLanguage.g:3450:1: ( ':=' )
            // InternalAPIMappingLanguage.g:3451:1: ':='
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
    // InternalAPIMappingLanguage.g:3464:1: rule__ParamaterBinding__Group__3 : rule__ParamaterBinding__Group__3__Impl ;
    public final void rule__ParamaterBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3468:1: ( rule__ParamaterBinding__Group__3__Impl )
            // InternalAPIMappingLanguage.g:3469:2: rule__ParamaterBinding__Group__3__Impl
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
    // InternalAPIMappingLanguage.g:3475:1: rule__ParamaterBinding__Group__3__Impl : ( ( rule__ParamaterBinding__ValueAssignment_3 ) ) ;
    public final void rule__ParamaterBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3479:1: ( ( ( rule__ParamaterBinding__ValueAssignment_3 ) ) )
            // InternalAPIMappingLanguage.g:3480:1: ( ( rule__ParamaterBinding__ValueAssignment_3 ) )
            {
            // InternalAPIMappingLanguage.g:3480:1: ( ( rule__ParamaterBinding__ValueAssignment_3 ) )
            // InternalAPIMappingLanguage.g:3481:1: ( rule__ParamaterBinding__ValueAssignment_3 )
            {
             before(grammarAccess.getParamaterBindingAccess().getValueAssignment_3()); 
            // InternalAPIMappingLanguage.g:3482:1: ( rule__ParamaterBinding__ValueAssignment_3 )
            // InternalAPIMappingLanguage.g:3482:2: rule__ParamaterBinding__ValueAssignment_3
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
    // InternalAPIMappingLanguage.g:3501:1: rule__Operand__Group_0__0 : rule__Operand__Group_0__0__Impl rule__Operand__Group_0__1 ;
    public final void rule__Operand__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3505:1: ( rule__Operand__Group_0__0__Impl rule__Operand__Group_0__1 )
            // InternalAPIMappingLanguage.g:3506:2: rule__Operand__Group_0__0__Impl rule__Operand__Group_0__1
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
    // InternalAPIMappingLanguage.g:3513:1: rule__Operand__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Operand__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3517:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:3518:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:3518:1: ( '(' )
            // InternalAPIMappingLanguage.g:3519:1: '('
            {
             before(grammarAccess.getOperandAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,49,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:3532:1: rule__Operand__Group_0__1 : rule__Operand__Group_0__1__Impl rule__Operand__Group_0__2 ;
    public final void rule__Operand__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3536:1: ( rule__Operand__Group_0__1__Impl rule__Operand__Group_0__2 )
            // InternalAPIMappingLanguage.g:3537:2: rule__Operand__Group_0__1__Impl rule__Operand__Group_0__2
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
    // InternalAPIMappingLanguage.g:3544:1: rule__Operand__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Operand__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3548:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:3549:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:3549:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:3550:1: ruleExpression
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
    // InternalAPIMappingLanguage.g:3561:1: rule__Operand__Group_0__2 : rule__Operand__Group_0__2__Impl ;
    public final void rule__Operand__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3565:1: ( rule__Operand__Group_0__2__Impl )
            // InternalAPIMappingLanguage.g:3566:2: rule__Operand__Group_0__2__Impl
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
    // InternalAPIMappingLanguage.g:3572:1: rule__Operand__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Operand__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3576:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:3577:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:3577:1: ( ')' )
            // InternalAPIMappingLanguage.g:3578:1: ')'
            {
             before(grammarAccess.getOperandAccess().getRightParenthesisKeyword_0_2()); 
            match(input,50,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:3597:1: rule__APICallStatement__Group__0 : rule__APICallStatement__Group__0__Impl rule__APICallStatement__Group__1 ;
    public final void rule__APICallStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3601:1: ( rule__APICallStatement__Group__0__Impl rule__APICallStatement__Group__1 )
            // InternalAPIMappingLanguage.g:3602:2: rule__APICallStatement__Group__0__Impl rule__APICallStatement__Group__1
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
    // InternalAPIMappingLanguage.g:3609:1: rule__APICallStatement__Group__0__Impl : ( ruleAPICallExpression ) ;
    public final void rule__APICallStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3613:1: ( ( ruleAPICallExpression ) )
            // InternalAPIMappingLanguage.g:3614:1: ( ruleAPICallExpression )
            {
            // InternalAPIMappingLanguage.g:3614:1: ( ruleAPICallExpression )
            // InternalAPIMappingLanguage.g:3615:1: ruleAPICallExpression
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
    // InternalAPIMappingLanguage.g:3626:1: rule__APICallStatement__Group__1 : rule__APICallStatement__Group__1__Impl ;
    public final void rule__APICallStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3630:1: ( rule__APICallStatement__Group__1__Impl )
            // InternalAPIMappingLanguage.g:3631:2: rule__APICallStatement__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:3637:1: rule__APICallStatement__Group__1__Impl : ( ';' ) ;
    public final void rule__APICallStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3641:1: ( ( ';' ) )
            // InternalAPIMappingLanguage.g:3642:1: ( ';' )
            {
            // InternalAPIMappingLanguage.g:3642:1: ( ';' )
            // InternalAPIMappingLanguage.g:3643:1: ';'
            {
             before(grammarAccess.getAPICallStatementAccess().getSemicolonKeyword_1()); 
            match(input,51,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:3660:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3664:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAPIMappingLanguage.g:3665:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalAPIMappingLanguage.g:3672:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3676:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:3677:1: ( RULE_ID )
            {
            // InternalAPIMappingLanguage.g:3677:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:3678:1: RULE_ID
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
    // InternalAPIMappingLanguage.g:3689:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3693:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAPIMappingLanguage.g:3694:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:3700:1: rule__QualifiedName__Group__1__Impl : ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3704:1: ( ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) ) )
            // InternalAPIMappingLanguage.g:3705:1: ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) )
            {
            // InternalAPIMappingLanguage.g:3705:1: ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAPIMappingLanguage.g:3706:1: ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:3706:1: ( ( rule__QualifiedName__Group_1__0 ) )
            // InternalAPIMappingLanguage.g:3707:1: ( rule__QualifiedName__Group_1__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:3708:1: ( rule__QualifiedName__Group_1__0 )
            // InternalAPIMappingLanguage.g:3708:2: rule__QualifiedName__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__QualifiedName__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }

            // InternalAPIMappingLanguage.g:3711:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAPIMappingLanguage.g:3712:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:3713:1: ( rule__QualifiedName__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==52) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:3713:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalAPIMappingLanguage.g:3728:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3732:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAPIMappingLanguage.g:3733:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalAPIMappingLanguage.g:3740:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3744:1: ( ( '.' ) )
            // InternalAPIMappingLanguage.g:3745:1: ( '.' )
            {
            // InternalAPIMappingLanguage.g:3745:1: ( '.' )
            // InternalAPIMappingLanguage.g:3746:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,52,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:3759:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3763:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAPIMappingLanguage.g:3764:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAPIMappingLanguage.g:3770:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3774:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:3775:1: ( RULE_ID )
            {
            // InternalAPIMappingLanguage.g:3775:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:3776:1: RULE_ID
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
    // InternalAPIMappingLanguage.g:3791:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3795:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalAPIMappingLanguage.g:3796:2: rule__Block__Group__0__Impl rule__Block__Group__1
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
    // InternalAPIMappingLanguage.g:3803:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3807:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:3808:1: ( () )
            {
            // InternalAPIMappingLanguage.g:3808:1: ( () )
            // InternalAPIMappingLanguage.g:3809:1: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // InternalAPIMappingLanguage.g:3810:1: ()
            // InternalAPIMappingLanguage.g:3812:1: 
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
    // InternalAPIMappingLanguage.g:3822:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3826:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalAPIMappingLanguage.g:3827:2: rule__Block__Group__1__Impl rule__Block__Group__2
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
    // InternalAPIMappingLanguage.g:3834:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3838:1: ( ( '{' ) )
            // InternalAPIMappingLanguage.g:3839:1: ( '{' )
            {
            // InternalAPIMappingLanguage.g:3839:1: ( '{' )
            // InternalAPIMappingLanguage.g:3840:1: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,40,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:3853:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3857:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalAPIMappingLanguage.g:3858:2: rule__Block__Group__2__Impl rule__Block__Group__3
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
    // InternalAPIMappingLanguage.g:3865:1: rule__Block__Group__2__Impl : ( ( rule__Block__ExpressionsAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3869:1: ( ( ( rule__Block__ExpressionsAssignment_2 )* ) )
            // InternalAPIMappingLanguage.g:3870:1: ( ( rule__Block__ExpressionsAssignment_2 )* )
            {
            // InternalAPIMappingLanguage.g:3870:1: ( ( rule__Block__ExpressionsAssignment_2 )* )
            // InternalAPIMappingLanguage.g:3871:1: ( rule__Block__ExpressionsAssignment_2 )*
            {
             before(grammarAccess.getBlockAccess().getExpressionsAssignment_2()); 
            // InternalAPIMappingLanguage.g:3872:1: ( rule__Block__ExpressionsAssignment_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||(LA33_0>=53 && LA33_0<=55)||LA33_0==57||LA33_0==63) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:3872:2: rule__Block__ExpressionsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_26);
            	    rule__Block__ExpressionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalAPIMappingLanguage.g:3882:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3886:1: ( rule__Block__Group__3__Impl )
            // InternalAPIMappingLanguage.g:3887:2: rule__Block__Group__3__Impl
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
    // InternalAPIMappingLanguage.g:3893:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3897:1: ( ( '}' ) )
            // InternalAPIMappingLanguage.g:3898:1: ( '}' )
            {
            // InternalAPIMappingLanguage.g:3898:1: ( '}' )
            // InternalAPIMappingLanguage.g:3899:1: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,41,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:3920:1: rule__ForLoop__Group__0 : rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 ;
    public final void rule__ForLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3924:1: ( rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 )
            // InternalAPIMappingLanguage.g:3925:2: rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1
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
    // InternalAPIMappingLanguage.g:3932:1: rule__ForLoop__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3936:1: ( ( 'for' ) )
            // InternalAPIMappingLanguage.g:3937:1: ( 'for' )
            {
            // InternalAPIMappingLanguage.g:3937:1: ( 'for' )
            // InternalAPIMappingLanguage.g:3938:1: 'for'
            {
             before(grammarAccess.getForLoopAccess().getForKeyword_0()); 
            match(input,53,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:3951:1: rule__ForLoop__Group__1 : rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 ;
    public final void rule__ForLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3955:1: ( rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 )
            // InternalAPIMappingLanguage.g:3956:2: rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2
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
    // InternalAPIMappingLanguage.g:3963:1: rule__ForLoop__Group__1__Impl : ( '(' ) ;
    public final void rule__ForLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3967:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:3968:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:3968:1: ( '(' )
            // InternalAPIMappingLanguage.g:3969:1: '('
            {
             before(grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1()); 
            match(input,49,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:3982:1: rule__ForLoop__Group__2 : rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 ;
    public final void rule__ForLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3986:1: ( rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 )
            // InternalAPIMappingLanguage.g:3987:2: rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3
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
    // InternalAPIMappingLanguage.g:3994:1: rule__ForLoop__Group__2__Impl : ( ( rule__ForLoop__InitializeExpressionAssignment_2 ) ) ;
    public final void rule__ForLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3998:1: ( ( ( rule__ForLoop__InitializeExpressionAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:3999:1: ( ( rule__ForLoop__InitializeExpressionAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:3999:1: ( ( rule__ForLoop__InitializeExpressionAssignment_2 ) )
            // InternalAPIMappingLanguage.g:4000:1: ( rule__ForLoop__InitializeExpressionAssignment_2 )
            {
             before(grammarAccess.getForLoopAccess().getInitializeExpressionAssignment_2()); 
            // InternalAPIMappingLanguage.g:4001:1: ( rule__ForLoop__InitializeExpressionAssignment_2 )
            // InternalAPIMappingLanguage.g:4001:2: rule__ForLoop__InitializeExpressionAssignment_2
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
    // InternalAPIMappingLanguage.g:4011:1: rule__ForLoop__Group__3 : rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 ;
    public final void rule__ForLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4015:1: ( rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 )
            // InternalAPIMappingLanguage.g:4016:2: rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4
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
    // InternalAPIMappingLanguage.g:4023:1: rule__ForLoop__Group__3__Impl : ( ( rule__ForLoop__LoopTestAssignment_3 ) ) ;
    public final void rule__ForLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4027:1: ( ( ( rule__ForLoop__LoopTestAssignment_3 ) ) )
            // InternalAPIMappingLanguage.g:4028:1: ( ( rule__ForLoop__LoopTestAssignment_3 ) )
            {
            // InternalAPIMappingLanguage.g:4028:1: ( ( rule__ForLoop__LoopTestAssignment_3 ) )
            // InternalAPIMappingLanguage.g:4029:1: ( rule__ForLoop__LoopTestAssignment_3 )
            {
             before(grammarAccess.getForLoopAccess().getLoopTestAssignment_3()); 
            // InternalAPIMappingLanguage.g:4030:1: ( rule__ForLoop__LoopTestAssignment_3 )
            // InternalAPIMappingLanguage.g:4030:2: rule__ForLoop__LoopTestAssignment_3
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
    // InternalAPIMappingLanguage.g:4040:1: rule__ForLoop__Group__4 : rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 ;
    public final void rule__ForLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4044:1: ( rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 )
            // InternalAPIMappingLanguage.g:4045:2: rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5
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
    // InternalAPIMappingLanguage.g:4052:1: rule__ForLoop__Group__4__Impl : ( ';' ) ;
    public final void rule__ForLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4056:1: ( ( ';' ) )
            // InternalAPIMappingLanguage.g:4057:1: ( ';' )
            {
            // InternalAPIMappingLanguage.g:4057:1: ( ';' )
            // InternalAPIMappingLanguage.g:4058:1: ';'
            {
             before(grammarAccess.getForLoopAccess().getSemicolonKeyword_4()); 
            match(input,51,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4071:1: rule__ForLoop__Group__5 : rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 ;
    public final void rule__ForLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4075:1: ( rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 )
            // InternalAPIMappingLanguage.g:4076:2: rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6
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
    // InternalAPIMappingLanguage.g:4083:1: rule__ForLoop__Group__5__Impl : ( ( rule__ForLoop__CountingExpressionAssignment_5 ) ) ;
    public final void rule__ForLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4087:1: ( ( ( rule__ForLoop__CountingExpressionAssignment_5 ) ) )
            // InternalAPIMappingLanguage.g:4088:1: ( ( rule__ForLoop__CountingExpressionAssignment_5 ) )
            {
            // InternalAPIMappingLanguage.g:4088:1: ( ( rule__ForLoop__CountingExpressionAssignment_5 ) )
            // InternalAPIMappingLanguage.g:4089:1: ( rule__ForLoop__CountingExpressionAssignment_5 )
            {
             before(grammarAccess.getForLoopAccess().getCountingExpressionAssignment_5()); 
            // InternalAPIMappingLanguage.g:4090:1: ( rule__ForLoop__CountingExpressionAssignment_5 )
            // InternalAPIMappingLanguage.g:4090:2: rule__ForLoop__CountingExpressionAssignment_5
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
    // InternalAPIMappingLanguage.g:4100:1: rule__ForLoop__Group__6 : rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7 ;
    public final void rule__ForLoop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4104:1: ( rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7 )
            // InternalAPIMappingLanguage.g:4105:2: rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7
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
    // InternalAPIMappingLanguage.g:4112:1: rule__ForLoop__Group__6__Impl : ( ')' ) ;
    public final void rule__ForLoop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4116:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:4117:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:4117:1: ( ')' )
            // InternalAPIMappingLanguage.g:4118:1: ')'
            {
             before(grammarAccess.getForLoopAccess().getRightParenthesisKeyword_6()); 
            match(input,50,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4131:1: rule__ForLoop__Group__7 : rule__ForLoop__Group__7__Impl ;
    public final void rule__ForLoop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4135:1: ( rule__ForLoop__Group__7__Impl )
            // InternalAPIMappingLanguage.g:4136:2: rule__ForLoop__Group__7__Impl
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
    // InternalAPIMappingLanguage.g:4142:1: rule__ForLoop__Group__7__Impl : ( ( rule__ForLoop__BlockAssignment_7 ) ) ;
    public final void rule__ForLoop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4146:1: ( ( ( rule__ForLoop__BlockAssignment_7 ) ) )
            // InternalAPIMappingLanguage.g:4147:1: ( ( rule__ForLoop__BlockAssignment_7 ) )
            {
            // InternalAPIMappingLanguage.g:4147:1: ( ( rule__ForLoop__BlockAssignment_7 ) )
            // InternalAPIMappingLanguage.g:4148:1: ( rule__ForLoop__BlockAssignment_7 )
            {
             before(grammarAccess.getForLoopAccess().getBlockAssignment_7()); 
            // InternalAPIMappingLanguage.g:4149:1: ( rule__ForLoop__BlockAssignment_7 )
            // InternalAPIMappingLanguage.g:4149:2: rule__ForLoop__BlockAssignment_7
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
    // InternalAPIMappingLanguage.g:4175:1: rule__ForLoopCountingExpression__Group__0 : rule__ForLoopCountingExpression__Group__0__Impl rule__ForLoopCountingExpression__Group__1 ;
    public final void rule__ForLoopCountingExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4179:1: ( rule__ForLoopCountingExpression__Group__0__Impl rule__ForLoopCountingExpression__Group__1 )
            // InternalAPIMappingLanguage.g:4180:2: rule__ForLoopCountingExpression__Group__0__Impl rule__ForLoopCountingExpression__Group__1
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
    // InternalAPIMappingLanguage.g:4187:1: rule__ForLoopCountingExpression__Group__0__Impl : ( ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 ) ) ;
    public final void rule__ForLoopCountingExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4191:1: ( ( ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:4192:1: ( ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:4192:1: ( ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 ) )
            // InternalAPIMappingLanguage.g:4193:1: ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getLhs_typedNamedElementExpressionAssignment_0()); 
            // InternalAPIMappingLanguage.g:4194:1: ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 )
            // InternalAPIMappingLanguage.g:4194:2: rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0
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
    // InternalAPIMappingLanguage.g:4204:1: rule__ForLoopCountingExpression__Group__1 : rule__ForLoopCountingExpression__Group__1__Impl ;
    public final void rule__ForLoopCountingExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4208:1: ( rule__ForLoopCountingExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:4209:2: rule__ForLoopCountingExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:4215:1: rule__ForLoopCountingExpression__Group__1__Impl : ( ( rule__ForLoopCountingExpression__Alternatives_1 ) ) ;
    public final void rule__ForLoopCountingExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4219:1: ( ( ( rule__ForLoopCountingExpression__Alternatives_1 ) ) )
            // InternalAPIMappingLanguage.g:4220:1: ( ( rule__ForLoopCountingExpression__Alternatives_1 ) )
            {
            // InternalAPIMappingLanguage.g:4220:1: ( ( rule__ForLoopCountingExpression__Alternatives_1 ) )
            // InternalAPIMappingLanguage.g:4221:1: ( rule__ForLoopCountingExpression__Alternatives_1 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getAlternatives_1()); 
            // InternalAPIMappingLanguage.g:4222:1: ( rule__ForLoopCountingExpression__Alternatives_1 )
            // InternalAPIMappingLanguage.g:4222:2: rule__ForLoopCountingExpression__Alternatives_1
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
    // InternalAPIMappingLanguage.g:4236:1: rule__ForLoopCountingExpression__Group_1_1__0 : rule__ForLoopCountingExpression__Group_1_1__0__Impl rule__ForLoopCountingExpression__Group_1_1__1 ;
    public final void rule__ForLoopCountingExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4240:1: ( rule__ForLoopCountingExpression__Group_1_1__0__Impl rule__ForLoopCountingExpression__Group_1_1__1 )
            // InternalAPIMappingLanguage.g:4241:2: rule__ForLoopCountingExpression__Group_1_1__0__Impl rule__ForLoopCountingExpression__Group_1_1__1
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
    // InternalAPIMappingLanguage.g:4248:1: rule__ForLoopCountingExpression__Group_1_1__0__Impl : ( ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 ) ) ;
    public final void rule__ForLoopCountingExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4252:1: ( ( ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 ) ) )
            // InternalAPIMappingLanguage.g:4253:1: ( ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 ) )
            {
            // InternalAPIMappingLanguage.g:4253:1: ( ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 ) )
            // InternalAPIMappingLanguage.g:4254:1: ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignment_1_1_0()); 
            // InternalAPIMappingLanguage.g:4255:1: ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 )
            // InternalAPIMappingLanguage.g:4255:2: rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0
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
    // InternalAPIMappingLanguage.g:4265:1: rule__ForLoopCountingExpression__Group_1_1__1 : rule__ForLoopCountingExpression__Group_1_1__1__Impl ;
    public final void rule__ForLoopCountingExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4269:1: ( rule__ForLoopCountingExpression__Group_1_1__1__Impl )
            // InternalAPIMappingLanguage.g:4270:2: rule__ForLoopCountingExpression__Group_1_1__1__Impl
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
    // InternalAPIMappingLanguage.g:4276:1: rule__ForLoopCountingExpression__Group_1_1__1__Impl : ( ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 ) ) ;
    public final void rule__ForLoopCountingExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4280:1: ( ( ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 ) ) )
            // InternalAPIMappingLanguage.g:4281:1: ( ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:4281:1: ( ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 ) )
            // InternalAPIMappingLanguage.g:4282:1: ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getRhs_assignExpressionAssignment_1_1_1()); 
            // InternalAPIMappingLanguage.g:4283:1: ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 )
            // InternalAPIMappingLanguage.g:4283:2: rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1
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
    // InternalAPIMappingLanguage.g:4297:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4301:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalAPIMappingLanguage.g:4302:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
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
    // InternalAPIMappingLanguage.g:4309:1: rule__WhileLoop__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4313:1: ( ( 'while' ) )
            // InternalAPIMappingLanguage.g:4314:1: ( 'while' )
            {
            // InternalAPIMappingLanguage.g:4314:1: ( 'while' )
            // InternalAPIMappingLanguage.g:4315:1: 'while'
            {
             before(grammarAccess.getWhileLoopAccess().getWhileKeyword_0()); 
            match(input,54,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4328:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4332:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalAPIMappingLanguage.g:4333:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
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
    // InternalAPIMappingLanguage.g:4340:1: rule__WhileLoop__Group__1__Impl : ( '(' ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4344:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:4345:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:4345:1: ( '(' )
            // InternalAPIMappingLanguage.g:4346:1: '('
            {
             before(grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1()); 
            match(input,49,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4359:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4363:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalAPIMappingLanguage.g:4364:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
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
    // InternalAPIMappingLanguage.g:4371:1: rule__WhileLoop__Group__2__Impl : ( ( rule__WhileLoop__LoopTestAssignment_2 ) ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4375:1: ( ( ( rule__WhileLoop__LoopTestAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:4376:1: ( ( rule__WhileLoop__LoopTestAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:4376:1: ( ( rule__WhileLoop__LoopTestAssignment_2 ) )
            // InternalAPIMappingLanguage.g:4377:1: ( rule__WhileLoop__LoopTestAssignment_2 )
            {
             before(grammarAccess.getWhileLoopAccess().getLoopTestAssignment_2()); 
            // InternalAPIMappingLanguage.g:4378:1: ( rule__WhileLoop__LoopTestAssignment_2 )
            // InternalAPIMappingLanguage.g:4378:2: rule__WhileLoop__LoopTestAssignment_2
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
    // InternalAPIMappingLanguage.g:4388:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4392:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalAPIMappingLanguage.g:4393:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
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
    // InternalAPIMappingLanguage.g:4400:1: rule__WhileLoop__Group__3__Impl : ( ')' ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4404:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:4405:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:4405:1: ( ')' )
            // InternalAPIMappingLanguage.g:4406:1: ')'
            {
             before(grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_3()); 
            match(input,50,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4419:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4423:1: ( rule__WhileLoop__Group__4__Impl )
            // InternalAPIMappingLanguage.g:4424:2: rule__WhileLoop__Group__4__Impl
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
    // InternalAPIMappingLanguage.g:4430:1: rule__WhileLoop__Group__4__Impl : ( ( rule__WhileLoop__BlockAssignment_4 ) ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4434:1: ( ( ( rule__WhileLoop__BlockAssignment_4 ) ) )
            // InternalAPIMappingLanguage.g:4435:1: ( ( rule__WhileLoop__BlockAssignment_4 ) )
            {
            // InternalAPIMappingLanguage.g:4435:1: ( ( rule__WhileLoop__BlockAssignment_4 ) )
            // InternalAPIMappingLanguage.g:4436:1: ( rule__WhileLoop__BlockAssignment_4 )
            {
             before(grammarAccess.getWhileLoopAccess().getBlockAssignment_4()); 
            // InternalAPIMappingLanguage.g:4437:1: ( rule__WhileLoop__BlockAssignment_4 )
            // InternalAPIMappingLanguage.g:4437:2: rule__WhileLoop__BlockAssignment_4
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
    // InternalAPIMappingLanguage.g:4457:1: rule__DoWhileLoop__Group__0 : rule__DoWhileLoop__Group__0__Impl rule__DoWhileLoop__Group__1 ;
    public final void rule__DoWhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4461:1: ( rule__DoWhileLoop__Group__0__Impl rule__DoWhileLoop__Group__1 )
            // InternalAPIMappingLanguage.g:4462:2: rule__DoWhileLoop__Group__0__Impl rule__DoWhileLoop__Group__1
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
    // InternalAPIMappingLanguage.g:4469:1: rule__DoWhileLoop__Group__0__Impl : ( 'do' ) ;
    public final void rule__DoWhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4473:1: ( ( 'do' ) )
            // InternalAPIMappingLanguage.g:4474:1: ( 'do' )
            {
            // InternalAPIMappingLanguage.g:4474:1: ( 'do' )
            // InternalAPIMappingLanguage.g:4475:1: 'do'
            {
             before(grammarAccess.getDoWhileLoopAccess().getDoKeyword_0()); 
            match(input,55,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4488:1: rule__DoWhileLoop__Group__1 : rule__DoWhileLoop__Group__1__Impl rule__DoWhileLoop__Group__2 ;
    public final void rule__DoWhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4492:1: ( rule__DoWhileLoop__Group__1__Impl rule__DoWhileLoop__Group__2 )
            // InternalAPIMappingLanguage.g:4493:2: rule__DoWhileLoop__Group__1__Impl rule__DoWhileLoop__Group__2
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
    // InternalAPIMappingLanguage.g:4500:1: rule__DoWhileLoop__Group__1__Impl : ( ( rule__DoWhileLoop__BlockAssignment_1 ) ) ;
    public final void rule__DoWhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4504:1: ( ( ( rule__DoWhileLoop__BlockAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:4505:1: ( ( rule__DoWhileLoop__BlockAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:4505:1: ( ( rule__DoWhileLoop__BlockAssignment_1 ) )
            // InternalAPIMappingLanguage.g:4506:1: ( rule__DoWhileLoop__BlockAssignment_1 )
            {
             before(grammarAccess.getDoWhileLoopAccess().getBlockAssignment_1()); 
            // InternalAPIMappingLanguage.g:4507:1: ( rule__DoWhileLoop__BlockAssignment_1 )
            // InternalAPIMappingLanguage.g:4507:2: rule__DoWhileLoop__BlockAssignment_1
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
    // InternalAPIMappingLanguage.g:4517:1: rule__DoWhileLoop__Group__2 : rule__DoWhileLoop__Group__2__Impl rule__DoWhileLoop__Group__3 ;
    public final void rule__DoWhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4521:1: ( rule__DoWhileLoop__Group__2__Impl rule__DoWhileLoop__Group__3 )
            // InternalAPIMappingLanguage.g:4522:2: rule__DoWhileLoop__Group__2__Impl rule__DoWhileLoop__Group__3
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
    // InternalAPIMappingLanguage.g:4529:1: rule__DoWhileLoop__Group__2__Impl : ( 'while' ) ;
    public final void rule__DoWhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4533:1: ( ( 'while' ) )
            // InternalAPIMappingLanguage.g:4534:1: ( 'while' )
            {
            // InternalAPIMappingLanguage.g:4534:1: ( 'while' )
            // InternalAPIMappingLanguage.g:4535:1: 'while'
            {
             before(grammarAccess.getDoWhileLoopAccess().getWhileKeyword_2()); 
            match(input,54,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4548:1: rule__DoWhileLoop__Group__3 : rule__DoWhileLoop__Group__3__Impl rule__DoWhileLoop__Group__4 ;
    public final void rule__DoWhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4552:1: ( rule__DoWhileLoop__Group__3__Impl rule__DoWhileLoop__Group__4 )
            // InternalAPIMappingLanguage.g:4553:2: rule__DoWhileLoop__Group__3__Impl rule__DoWhileLoop__Group__4
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
    // InternalAPIMappingLanguage.g:4560:1: rule__DoWhileLoop__Group__3__Impl : ( '(' ) ;
    public final void rule__DoWhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4564:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:4565:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:4565:1: ( '(' )
            // InternalAPIMappingLanguage.g:4566:1: '('
            {
             before(grammarAccess.getDoWhileLoopAccess().getLeftParenthesisKeyword_3()); 
            match(input,49,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4579:1: rule__DoWhileLoop__Group__4 : rule__DoWhileLoop__Group__4__Impl rule__DoWhileLoop__Group__5 ;
    public final void rule__DoWhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4583:1: ( rule__DoWhileLoop__Group__4__Impl rule__DoWhileLoop__Group__5 )
            // InternalAPIMappingLanguage.g:4584:2: rule__DoWhileLoop__Group__4__Impl rule__DoWhileLoop__Group__5
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
    // InternalAPIMappingLanguage.g:4591:1: rule__DoWhileLoop__Group__4__Impl : ( ( rule__DoWhileLoop__LoopTestAssignment_4 ) ) ;
    public final void rule__DoWhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4595:1: ( ( ( rule__DoWhileLoop__LoopTestAssignment_4 ) ) )
            // InternalAPIMappingLanguage.g:4596:1: ( ( rule__DoWhileLoop__LoopTestAssignment_4 ) )
            {
            // InternalAPIMappingLanguage.g:4596:1: ( ( rule__DoWhileLoop__LoopTestAssignment_4 ) )
            // InternalAPIMappingLanguage.g:4597:1: ( rule__DoWhileLoop__LoopTestAssignment_4 )
            {
             before(grammarAccess.getDoWhileLoopAccess().getLoopTestAssignment_4()); 
            // InternalAPIMappingLanguage.g:4598:1: ( rule__DoWhileLoop__LoopTestAssignment_4 )
            // InternalAPIMappingLanguage.g:4598:2: rule__DoWhileLoop__LoopTestAssignment_4
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
    // InternalAPIMappingLanguage.g:4608:1: rule__DoWhileLoop__Group__5 : rule__DoWhileLoop__Group__5__Impl ;
    public final void rule__DoWhileLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4612:1: ( rule__DoWhileLoop__Group__5__Impl )
            // InternalAPIMappingLanguage.g:4613:2: rule__DoWhileLoop__Group__5__Impl
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
    // InternalAPIMappingLanguage.g:4619:1: rule__DoWhileLoop__Group__5__Impl : ( ');' ) ;
    public final void rule__DoWhileLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4623:1: ( ( ');' ) )
            // InternalAPIMappingLanguage.g:4624:1: ( ');' )
            {
            // InternalAPIMappingLanguage.g:4624:1: ( ');' )
            // InternalAPIMappingLanguage.g:4625:1: ');'
            {
             before(grammarAccess.getDoWhileLoopAccess().getRightParenthesisSemicolonKeyword_5()); 
            match(input,56,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4650:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4654:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalAPIMappingLanguage.g:4655:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
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
    // InternalAPIMappingLanguage.g:4662:1: rule__IfStatement__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4666:1: ( ( 'if' ) )
            // InternalAPIMappingLanguage.g:4667:1: ( 'if' )
            {
            // InternalAPIMappingLanguage.g:4667:1: ( 'if' )
            // InternalAPIMappingLanguage.g:4668:1: 'if'
            {
             before(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            match(input,57,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4681:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4685:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalAPIMappingLanguage.g:4686:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
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
    // InternalAPIMappingLanguage.g:4693:1: rule__IfStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4697:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:4698:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:4698:1: ( '(' )
            // InternalAPIMappingLanguage.g:4699:1: '('
            {
             before(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,49,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4712:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4716:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalAPIMappingLanguage.g:4717:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
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
    // InternalAPIMappingLanguage.g:4724:1: rule__IfStatement__Group__2__Impl : ( ( rule__IfStatement__IfConditionAssignment_2 ) ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4728:1: ( ( ( rule__IfStatement__IfConditionAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:4729:1: ( ( rule__IfStatement__IfConditionAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:4729:1: ( ( rule__IfStatement__IfConditionAssignment_2 ) )
            // InternalAPIMappingLanguage.g:4730:1: ( rule__IfStatement__IfConditionAssignment_2 )
            {
             before(grammarAccess.getIfStatementAccess().getIfConditionAssignment_2()); 
            // InternalAPIMappingLanguage.g:4731:1: ( rule__IfStatement__IfConditionAssignment_2 )
            // InternalAPIMappingLanguage.g:4731:2: rule__IfStatement__IfConditionAssignment_2
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
    // InternalAPIMappingLanguage.g:4741:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4745:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalAPIMappingLanguage.g:4746:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
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
    // InternalAPIMappingLanguage.g:4753:1: rule__IfStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4757:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:4758:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:4758:1: ( ')' )
            // InternalAPIMappingLanguage.g:4759:1: ')'
            {
             before(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,50,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4772:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4776:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalAPIMappingLanguage.g:4777:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
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
    // InternalAPIMappingLanguage.g:4784:1: rule__IfStatement__Group__4__Impl : ( ( rule__IfStatement__IfBlockAssignment_4 ) ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4788:1: ( ( ( rule__IfStatement__IfBlockAssignment_4 ) ) )
            // InternalAPIMappingLanguage.g:4789:1: ( ( rule__IfStatement__IfBlockAssignment_4 ) )
            {
            // InternalAPIMappingLanguage.g:4789:1: ( ( rule__IfStatement__IfBlockAssignment_4 ) )
            // InternalAPIMappingLanguage.g:4790:1: ( rule__IfStatement__IfBlockAssignment_4 )
            {
             before(grammarAccess.getIfStatementAccess().getIfBlockAssignment_4()); 
            // InternalAPIMappingLanguage.g:4791:1: ( rule__IfStatement__IfBlockAssignment_4 )
            // InternalAPIMappingLanguage.g:4791:2: rule__IfStatement__IfBlockAssignment_4
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
    // InternalAPIMappingLanguage.g:4801:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4805:1: ( rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 )
            // InternalAPIMappingLanguage.g:4806:2: rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6
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
    // InternalAPIMappingLanguage.g:4813:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__ElseIfStatementsAssignment_5 )* ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4817:1: ( ( ( rule__IfStatement__ElseIfStatementsAssignment_5 )* ) )
            // InternalAPIMappingLanguage.g:4818:1: ( ( rule__IfStatement__ElseIfStatementsAssignment_5 )* )
            {
            // InternalAPIMappingLanguage.g:4818:1: ( ( rule__IfStatement__ElseIfStatementsAssignment_5 )* )
            // InternalAPIMappingLanguage.g:4819:1: ( rule__IfStatement__ElseIfStatementsAssignment_5 )*
            {
             before(grammarAccess.getIfStatementAccess().getElseIfStatementsAssignment_5()); 
            // InternalAPIMappingLanguage.g:4820:1: ( rule__IfStatement__ElseIfStatementsAssignment_5 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==59) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:4820:2: rule__IfStatement__ElseIfStatementsAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_31);
            	    rule__IfStatement__ElseIfStatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // InternalAPIMappingLanguage.g:4830:1: rule__IfStatement__Group__6 : rule__IfStatement__Group__6__Impl ;
    public final void rule__IfStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4834:1: ( rule__IfStatement__Group__6__Impl )
            // InternalAPIMappingLanguage.g:4835:2: rule__IfStatement__Group__6__Impl
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
    // InternalAPIMappingLanguage.g:4841:1: rule__IfStatement__Group__6__Impl : ( ( rule__IfStatement__Group_6__0 )? ) ;
    public final void rule__IfStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4845:1: ( ( ( rule__IfStatement__Group_6__0 )? ) )
            // InternalAPIMappingLanguage.g:4846:1: ( ( rule__IfStatement__Group_6__0 )? )
            {
            // InternalAPIMappingLanguage.g:4846:1: ( ( rule__IfStatement__Group_6__0 )? )
            // InternalAPIMappingLanguage.g:4847:1: ( rule__IfStatement__Group_6__0 )?
            {
             before(grammarAccess.getIfStatementAccess().getGroup_6()); 
            // InternalAPIMappingLanguage.g:4848:1: ( rule__IfStatement__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==58) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAPIMappingLanguage.g:4848:2: rule__IfStatement__Group_6__0
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
    // InternalAPIMappingLanguage.g:4872:1: rule__IfStatement__Group_6__0 : rule__IfStatement__Group_6__0__Impl rule__IfStatement__Group_6__1 ;
    public final void rule__IfStatement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4876:1: ( rule__IfStatement__Group_6__0__Impl rule__IfStatement__Group_6__1 )
            // InternalAPIMappingLanguage.g:4877:2: rule__IfStatement__Group_6__0__Impl rule__IfStatement__Group_6__1
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
    // InternalAPIMappingLanguage.g:4884:1: rule__IfStatement__Group_6__0__Impl : ( 'else' ) ;
    public final void rule__IfStatement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4888:1: ( ( 'else' ) )
            // InternalAPIMappingLanguage.g:4889:1: ( 'else' )
            {
            // InternalAPIMappingLanguage.g:4889:1: ( 'else' )
            // InternalAPIMappingLanguage.g:4890:1: 'else'
            {
             before(grammarAccess.getIfStatementAccess().getElseKeyword_6_0()); 
            match(input,58,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4903:1: rule__IfStatement__Group_6__1 : rule__IfStatement__Group_6__1__Impl ;
    public final void rule__IfStatement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4907:1: ( rule__IfStatement__Group_6__1__Impl )
            // InternalAPIMappingLanguage.g:4908:2: rule__IfStatement__Group_6__1__Impl
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
    // InternalAPIMappingLanguage.g:4914:1: rule__IfStatement__Group_6__1__Impl : ( ( rule__IfStatement__ElseBlockAssignment_6_1 ) ) ;
    public final void rule__IfStatement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4918:1: ( ( ( rule__IfStatement__ElseBlockAssignment_6_1 ) ) )
            // InternalAPIMappingLanguage.g:4919:1: ( ( rule__IfStatement__ElseBlockAssignment_6_1 ) )
            {
            // InternalAPIMappingLanguage.g:4919:1: ( ( rule__IfStatement__ElseBlockAssignment_6_1 ) )
            // InternalAPIMappingLanguage.g:4920:1: ( rule__IfStatement__ElseBlockAssignment_6_1 )
            {
             before(grammarAccess.getIfStatementAccess().getElseBlockAssignment_6_1()); 
            // InternalAPIMappingLanguage.g:4921:1: ( rule__IfStatement__ElseBlockAssignment_6_1 )
            // InternalAPIMappingLanguage.g:4921:2: rule__IfStatement__ElseBlockAssignment_6_1
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
    // InternalAPIMappingLanguage.g:4935:1: rule__ElseIfStatement__Group__0 : rule__ElseIfStatement__Group__0__Impl rule__ElseIfStatement__Group__1 ;
    public final void rule__ElseIfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4939:1: ( rule__ElseIfStatement__Group__0__Impl rule__ElseIfStatement__Group__1 )
            // InternalAPIMappingLanguage.g:4940:2: rule__ElseIfStatement__Group__0__Impl rule__ElseIfStatement__Group__1
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
    // InternalAPIMappingLanguage.g:4947:1: rule__ElseIfStatement__Group__0__Impl : ( 'elseif' ) ;
    public final void rule__ElseIfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4951:1: ( ( 'elseif' ) )
            // InternalAPIMappingLanguage.g:4952:1: ( 'elseif' )
            {
            // InternalAPIMappingLanguage.g:4952:1: ( 'elseif' )
            // InternalAPIMappingLanguage.g:4953:1: 'elseif'
            {
             before(grammarAccess.getElseIfStatementAccess().getElseifKeyword_0()); 
            match(input,59,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4966:1: rule__ElseIfStatement__Group__1 : rule__ElseIfStatement__Group__1__Impl rule__ElseIfStatement__Group__2 ;
    public final void rule__ElseIfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4970:1: ( rule__ElseIfStatement__Group__1__Impl rule__ElseIfStatement__Group__2 )
            // InternalAPIMappingLanguage.g:4971:2: rule__ElseIfStatement__Group__1__Impl rule__ElseIfStatement__Group__2
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
    // InternalAPIMappingLanguage.g:4978:1: rule__ElseIfStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__ElseIfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4982:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:4983:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:4983:1: ( '(' )
            // InternalAPIMappingLanguage.g:4984:1: '('
            {
             before(grammarAccess.getElseIfStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,49,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:4997:1: rule__ElseIfStatement__Group__2 : rule__ElseIfStatement__Group__2__Impl rule__ElseIfStatement__Group__3 ;
    public final void rule__ElseIfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5001:1: ( rule__ElseIfStatement__Group__2__Impl rule__ElseIfStatement__Group__3 )
            // InternalAPIMappingLanguage.g:5002:2: rule__ElseIfStatement__Group__2__Impl rule__ElseIfStatement__Group__3
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
    // InternalAPIMappingLanguage.g:5009:1: rule__ElseIfStatement__Group__2__Impl : ( ( rule__ElseIfStatement__ElseIfConditionAssignment_2 ) ) ;
    public final void rule__ElseIfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5013:1: ( ( ( rule__ElseIfStatement__ElseIfConditionAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:5014:1: ( ( rule__ElseIfStatement__ElseIfConditionAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:5014:1: ( ( rule__ElseIfStatement__ElseIfConditionAssignment_2 ) )
            // InternalAPIMappingLanguage.g:5015:1: ( rule__ElseIfStatement__ElseIfConditionAssignment_2 )
            {
             before(grammarAccess.getElseIfStatementAccess().getElseIfConditionAssignment_2()); 
            // InternalAPIMappingLanguage.g:5016:1: ( rule__ElseIfStatement__ElseIfConditionAssignment_2 )
            // InternalAPIMappingLanguage.g:5016:2: rule__ElseIfStatement__ElseIfConditionAssignment_2
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
    // InternalAPIMappingLanguage.g:5026:1: rule__ElseIfStatement__Group__3 : rule__ElseIfStatement__Group__3__Impl rule__ElseIfStatement__Group__4 ;
    public final void rule__ElseIfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5030:1: ( rule__ElseIfStatement__Group__3__Impl rule__ElseIfStatement__Group__4 )
            // InternalAPIMappingLanguage.g:5031:2: rule__ElseIfStatement__Group__3__Impl rule__ElseIfStatement__Group__4
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
    // InternalAPIMappingLanguage.g:5038:1: rule__ElseIfStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__ElseIfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5042:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:5043:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:5043:1: ( ')' )
            // InternalAPIMappingLanguage.g:5044:1: ')'
            {
             before(grammarAccess.getElseIfStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,50,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:5057:1: rule__ElseIfStatement__Group__4 : rule__ElseIfStatement__Group__4__Impl ;
    public final void rule__ElseIfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5061:1: ( rule__ElseIfStatement__Group__4__Impl )
            // InternalAPIMappingLanguage.g:5062:2: rule__ElseIfStatement__Group__4__Impl
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
    // InternalAPIMappingLanguage.g:5068:1: rule__ElseIfStatement__Group__4__Impl : ( ( rule__ElseIfStatement__ElseIfBlockAssignment_4 ) ) ;
    public final void rule__ElseIfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5072:1: ( ( ( rule__ElseIfStatement__ElseIfBlockAssignment_4 ) ) )
            // InternalAPIMappingLanguage.g:5073:1: ( ( rule__ElseIfStatement__ElseIfBlockAssignment_4 ) )
            {
            // InternalAPIMappingLanguage.g:5073:1: ( ( rule__ElseIfStatement__ElseIfBlockAssignment_4 ) )
            // InternalAPIMappingLanguage.g:5074:1: ( rule__ElseIfStatement__ElseIfBlockAssignment_4 )
            {
             before(grammarAccess.getElseIfStatementAccess().getElseIfBlockAssignment_4()); 
            // InternalAPIMappingLanguage.g:5075:1: ( rule__ElseIfStatement__ElseIfBlockAssignment_4 )
            // InternalAPIMappingLanguage.g:5075:2: rule__ElseIfStatement__ElseIfBlockAssignment_4
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
    // InternalAPIMappingLanguage.g:5097:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5101:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalAPIMappingLanguage.g:5102:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
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
    // InternalAPIMappingLanguage.g:5109:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5113:1: ( ( ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:5114:1: ( ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:5114:1: ( ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 ) )
            // InternalAPIMappingLanguage.g:5115:1: ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getLhs_typedNamedElementExpressionAssignment_0()); 
            // InternalAPIMappingLanguage.g:5116:1: ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 )
            // InternalAPIMappingLanguage.g:5116:2: rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0
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
    // InternalAPIMappingLanguage.g:5126:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5130:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalAPIMappingLanguage.g:5131:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
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
    // InternalAPIMappingLanguage.g:5138:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__Alternatives_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5142:1: ( ( ( rule__Assignment__Alternatives_1 ) ) )
            // InternalAPIMappingLanguage.g:5143:1: ( ( rule__Assignment__Alternatives_1 ) )
            {
            // InternalAPIMappingLanguage.g:5143:1: ( ( rule__Assignment__Alternatives_1 ) )
            // InternalAPIMappingLanguage.g:5144:1: ( rule__Assignment__Alternatives_1 )
            {
             before(grammarAccess.getAssignmentAccess().getAlternatives_1()); 
            // InternalAPIMappingLanguage.g:5145:1: ( rule__Assignment__Alternatives_1 )
            // InternalAPIMappingLanguage.g:5145:2: rule__Assignment__Alternatives_1
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
    // InternalAPIMappingLanguage.g:5155:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5159:1: ( rule__Assignment__Group__2__Impl )
            // InternalAPIMappingLanguage.g:5160:2: rule__Assignment__Group__2__Impl
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
    // InternalAPIMappingLanguage.g:5166:1: rule__Assignment__Group__2__Impl : ( ';' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5170:1: ( ( ';' ) )
            // InternalAPIMappingLanguage.g:5171:1: ( ';' )
            {
            // InternalAPIMappingLanguage.g:5171:1: ( ';' )
            // InternalAPIMappingLanguage.g:5172:1: ';'
            {
             before(grammarAccess.getAssignmentAccess().getSemicolonKeyword_2()); 
            match(input,51,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:5191:1: rule__Assignment__Group_1_0__0 : rule__Assignment__Group_1_0__0__Impl rule__Assignment__Group_1_0__1 ;
    public final void rule__Assignment__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5195:1: ( rule__Assignment__Group_1_0__0__Impl rule__Assignment__Group_1_0__1 )
            // InternalAPIMappingLanguage.g:5196:2: rule__Assignment__Group_1_0__0__Impl rule__Assignment__Group_1_0__1
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
    // InternalAPIMappingLanguage.g:5203:1: rule__Assignment__Group_1_0__0__Impl : ( ( rule__Assignment__AssignOperatorAssignment_1_0_0 ) ) ;
    public final void rule__Assignment__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5207:1: ( ( ( rule__Assignment__AssignOperatorAssignment_1_0_0 ) ) )
            // InternalAPIMappingLanguage.g:5208:1: ( ( rule__Assignment__AssignOperatorAssignment_1_0_0 ) )
            {
            // InternalAPIMappingLanguage.g:5208:1: ( ( rule__Assignment__AssignOperatorAssignment_1_0_0 ) )
            // InternalAPIMappingLanguage.g:5209:1: ( rule__Assignment__AssignOperatorAssignment_1_0_0 )
            {
             before(grammarAccess.getAssignmentAccess().getAssignOperatorAssignment_1_0_0()); 
            // InternalAPIMappingLanguage.g:5210:1: ( rule__Assignment__AssignOperatorAssignment_1_0_0 )
            // InternalAPIMappingLanguage.g:5210:2: rule__Assignment__AssignOperatorAssignment_1_0_0
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
    // InternalAPIMappingLanguage.g:5220:1: rule__Assignment__Group_1_0__1 : rule__Assignment__Group_1_0__1__Impl ;
    public final void rule__Assignment__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5224:1: ( rule__Assignment__Group_1_0__1__Impl )
            // InternalAPIMappingLanguage.g:5225:2: rule__Assignment__Group_1_0__1__Impl
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
    // InternalAPIMappingLanguage.g:5231:1: rule__Assignment__Group_1_0__1__Impl : ( ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 ) ) ;
    public final void rule__Assignment__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5235:1: ( ( ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 ) ) )
            // InternalAPIMappingLanguage.g:5236:1: ( ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 ) )
            {
            // InternalAPIMappingLanguage.g:5236:1: ( ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 ) )
            // InternalAPIMappingLanguage.g:5237:1: ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 )
            {
             before(grammarAccess.getAssignmentAccess().getRhs_assignExpressionAssignment_1_0_1()); 
            // InternalAPIMappingLanguage.g:5238:1: ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 )
            // InternalAPIMappingLanguage.g:5238:2: rule__Assignment__Rhs_assignExpressionAssignment_1_0_1
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
    // InternalAPIMappingLanguage.g:5252:1: rule__ArrayInitializeExpression__Group__0 : rule__ArrayInitializeExpression__Group__0__Impl rule__ArrayInitializeExpression__Group__1 ;
    public final void rule__ArrayInitializeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5256:1: ( rule__ArrayInitializeExpression__Group__0__Impl rule__ArrayInitializeExpression__Group__1 )
            // InternalAPIMappingLanguage.g:5257:2: rule__ArrayInitializeExpression__Group__0__Impl rule__ArrayInitializeExpression__Group__1
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
    // InternalAPIMappingLanguage.g:5264:1: rule__ArrayInitializeExpression__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayInitializeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5268:1: ( ( '[' ) )
            // InternalAPIMappingLanguage.g:5269:1: ( '[' )
            {
            // InternalAPIMappingLanguage.g:5269:1: ( '[' )
            // InternalAPIMappingLanguage.g:5270:1: '['
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,60,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:5283:1: rule__ArrayInitializeExpression__Group__1 : rule__ArrayInitializeExpression__Group__1__Impl rule__ArrayInitializeExpression__Group__2 ;
    public final void rule__ArrayInitializeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5287:1: ( rule__ArrayInitializeExpression__Group__1__Impl rule__ArrayInitializeExpression__Group__2 )
            // InternalAPIMappingLanguage.g:5288:2: rule__ArrayInitializeExpression__Group__1__Impl rule__ArrayInitializeExpression__Group__2
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
    // InternalAPIMappingLanguage.g:5295:1: rule__ArrayInitializeExpression__Group__1__Impl : ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 ) ) ;
    public final void rule__ArrayInitializeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5299:1: ( ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:5300:1: ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:5300:1: ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 ) )
            // InternalAPIMappingLanguage.g:5301:1: ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 )
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsAssignment_1()); 
            // InternalAPIMappingLanguage.g:5302:1: ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 )
            // InternalAPIMappingLanguage.g:5302:2: rule__ArrayInitializeExpression__ExpressionsAssignment_1
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
    // InternalAPIMappingLanguage.g:5312:1: rule__ArrayInitializeExpression__Group__2 : rule__ArrayInitializeExpression__Group__2__Impl rule__ArrayInitializeExpression__Group__3 ;
    public final void rule__ArrayInitializeExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5316:1: ( rule__ArrayInitializeExpression__Group__2__Impl rule__ArrayInitializeExpression__Group__3 )
            // InternalAPIMappingLanguage.g:5317:2: rule__ArrayInitializeExpression__Group__2__Impl rule__ArrayInitializeExpression__Group__3
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
    // InternalAPIMappingLanguage.g:5324:1: rule__ArrayInitializeExpression__Group__2__Impl : ( ( rule__ArrayInitializeExpression__Group_2__0 )* ) ;
    public final void rule__ArrayInitializeExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5328:1: ( ( ( rule__ArrayInitializeExpression__Group_2__0 )* ) )
            // InternalAPIMappingLanguage.g:5329:1: ( ( rule__ArrayInitializeExpression__Group_2__0 )* )
            {
            // InternalAPIMappingLanguage.g:5329:1: ( ( rule__ArrayInitializeExpression__Group_2__0 )* )
            // InternalAPIMappingLanguage.g:5330:1: ( rule__ArrayInitializeExpression__Group_2__0 )*
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getGroup_2()); 
            // InternalAPIMappingLanguage.g:5331:1: ( rule__ArrayInitializeExpression__Group_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==42) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:5331:2: rule__ArrayInitializeExpression__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__ArrayInitializeExpression__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalAPIMappingLanguage.g:5341:1: rule__ArrayInitializeExpression__Group__3 : rule__ArrayInitializeExpression__Group__3__Impl ;
    public final void rule__ArrayInitializeExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5345:1: ( rule__ArrayInitializeExpression__Group__3__Impl )
            // InternalAPIMappingLanguage.g:5346:2: rule__ArrayInitializeExpression__Group__3__Impl
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
    // InternalAPIMappingLanguage.g:5352:1: rule__ArrayInitializeExpression__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayInitializeExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5356:1: ( ( ']' ) )
            // InternalAPIMappingLanguage.g:5357:1: ( ']' )
            {
            // InternalAPIMappingLanguage.g:5357:1: ( ']' )
            // InternalAPIMappingLanguage.g:5358:1: ']'
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getRightSquareBracketKeyword_3()); 
            match(input,61,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:5379:1: rule__ArrayInitializeExpression__Group_2__0 : rule__ArrayInitializeExpression__Group_2__0__Impl rule__ArrayInitializeExpression__Group_2__1 ;
    public final void rule__ArrayInitializeExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5383:1: ( rule__ArrayInitializeExpression__Group_2__0__Impl rule__ArrayInitializeExpression__Group_2__1 )
            // InternalAPIMappingLanguage.g:5384:2: rule__ArrayInitializeExpression__Group_2__0__Impl rule__ArrayInitializeExpression__Group_2__1
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
    // InternalAPIMappingLanguage.g:5391:1: rule__ArrayInitializeExpression__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayInitializeExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5395:1: ( ( ',' ) )
            // InternalAPIMappingLanguage.g:5396:1: ( ',' )
            {
            // InternalAPIMappingLanguage.g:5396:1: ( ',' )
            // InternalAPIMappingLanguage.g:5397:1: ','
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getCommaKeyword_2_0()); 
            match(input,42,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:5410:1: rule__ArrayInitializeExpression__Group_2__1 : rule__ArrayInitializeExpression__Group_2__1__Impl ;
    public final void rule__ArrayInitializeExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5414:1: ( rule__ArrayInitializeExpression__Group_2__1__Impl )
            // InternalAPIMappingLanguage.g:5415:2: rule__ArrayInitializeExpression__Group_2__1__Impl
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
    // InternalAPIMappingLanguage.g:5421:1: rule__ArrayInitializeExpression__Group_2__1__Impl : ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 ) ) ;
    public final void rule__ArrayInitializeExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5425:1: ( ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 ) ) )
            // InternalAPIMappingLanguage.g:5426:1: ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 ) )
            {
            // InternalAPIMappingLanguage.g:5426:1: ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 ) )
            // InternalAPIMappingLanguage.g:5427:1: ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 )
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsAssignment_2_1()); 
            // InternalAPIMappingLanguage.g:5428:1: ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 )
            // InternalAPIMappingLanguage.g:5428:2: rule__ArrayInitializeExpression__ExpressionsAssignment_2_1
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
    // InternalAPIMappingLanguage.g:5442:1: rule__LocalVariableDeclaration__Group__0 : rule__LocalVariableDeclaration__Group__0__Impl rule__LocalVariableDeclaration__Group__1 ;
    public final void rule__LocalVariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5446:1: ( rule__LocalVariableDeclaration__Group__0__Impl rule__LocalVariableDeclaration__Group__1 )
            // InternalAPIMappingLanguage.g:5447:2: rule__LocalVariableDeclaration__Group__0__Impl rule__LocalVariableDeclaration__Group__1
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
    // InternalAPIMappingLanguage.g:5454:1: rule__LocalVariableDeclaration__Group__0__Impl : ( ( rule__LocalVariableDeclaration__DataTypeAssignment_0 ) ) ;
    public final void rule__LocalVariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5458:1: ( ( ( rule__LocalVariableDeclaration__DataTypeAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:5459:1: ( ( rule__LocalVariableDeclaration__DataTypeAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:5459:1: ( ( rule__LocalVariableDeclaration__DataTypeAssignment_0 ) )
            // InternalAPIMappingLanguage.g:5460:1: ( rule__LocalVariableDeclaration__DataTypeAssignment_0 )
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getDataTypeAssignment_0()); 
            // InternalAPIMappingLanguage.g:5461:1: ( rule__LocalVariableDeclaration__DataTypeAssignment_0 )
            // InternalAPIMappingLanguage.g:5461:2: rule__LocalVariableDeclaration__DataTypeAssignment_0
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
    // InternalAPIMappingLanguage.g:5471:1: rule__LocalVariableDeclaration__Group__1 : rule__LocalVariableDeclaration__Group__1__Impl rule__LocalVariableDeclaration__Group__2 ;
    public final void rule__LocalVariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5475:1: ( rule__LocalVariableDeclaration__Group__1__Impl rule__LocalVariableDeclaration__Group__2 )
            // InternalAPIMappingLanguage.g:5476:2: rule__LocalVariableDeclaration__Group__1__Impl rule__LocalVariableDeclaration__Group__2
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
    // InternalAPIMappingLanguage.g:5483:1: rule__LocalVariableDeclaration__Group__1__Impl : ( ( rule__LocalVariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__LocalVariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5487:1: ( ( ( rule__LocalVariableDeclaration__NameAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:5488:1: ( ( rule__LocalVariableDeclaration__NameAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:5488:1: ( ( rule__LocalVariableDeclaration__NameAssignment_1 ) )
            // InternalAPIMappingLanguage.g:5489:1: ( rule__LocalVariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalAPIMappingLanguage.g:5490:1: ( rule__LocalVariableDeclaration__NameAssignment_1 )
            // InternalAPIMappingLanguage.g:5490:2: rule__LocalVariableDeclaration__NameAssignment_1
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
    // InternalAPIMappingLanguage.g:5500:1: rule__LocalVariableDeclaration__Group__2 : rule__LocalVariableDeclaration__Group__2__Impl rule__LocalVariableDeclaration__Group__3 ;
    public final void rule__LocalVariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5504:1: ( rule__LocalVariableDeclaration__Group__2__Impl rule__LocalVariableDeclaration__Group__3 )
            // InternalAPIMappingLanguage.g:5505:2: rule__LocalVariableDeclaration__Group__2__Impl rule__LocalVariableDeclaration__Group__3
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
    // InternalAPIMappingLanguage.g:5512:1: rule__LocalVariableDeclaration__Group__2__Impl : ( ( rule__LocalVariableDeclaration__Group_2__0 )? ) ;
    public final void rule__LocalVariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5516:1: ( ( ( rule__LocalVariableDeclaration__Group_2__0 )? ) )
            // InternalAPIMappingLanguage.g:5517:1: ( ( rule__LocalVariableDeclaration__Group_2__0 )? )
            {
            // InternalAPIMappingLanguage.g:5517:1: ( ( rule__LocalVariableDeclaration__Group_2__0 )? )
            // InternalAPIMappingLanguage.g:5518:1: ( rule__LocalVariableDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getGroup_2()); 
            // InternalAPIMappingLanguage.g:5519:1: ( rule__LocalVariableDeclaration__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==19) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAPIMappingLanguage.g:5519:2: rule__LocalVariableDeclaration__Group_2__0
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
    // InternalAPIMappingLanguage.g:5529:1: rule__LocalVariableDeclaration__Group__3 : rule__LocalVariableDeclaration__Group__3__Impl ;
    public final void rule__LocalVariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5533:1: ( rule__LocalVariableDeclaration__Group__3__Impl )
            // InternalAPIMappingLanguage.g:5534:2: rule__LocalVariableDeclaration__Group__3__Impl
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
    // InternalAPIMappingLanguage.g:5540:1: rule__LocalVariableDeclaration__Group__3__Impl : ( ';' ) ;
    public final void rule__LocalVariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5544:1: ( ( ';' ) )
            // InternalAPIMappingLanguage.g:5545:1: ( ';' )
            {
            // InternalAPIMappingLanguage.g:5545:1: ( ';' )
            // InternalAPIMappingLanguage.g:5546:1: ';'
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getSemicolonKeyword_3()); 
            match(input,51,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:5567:1: rule__LocalVariableDeclaration__Group_2__0 : rule__LocalVariableDeclaration__Group_2__0__Impl rule__LocalVariableDeclaration__Group_2__1 ;
    public final void rule__LocalVariableDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5571:1: ( rule__LocalVariableDeclaration__Group_2__0__Impl rule__LocalVariableDeclaration__Group_2__1 )
            // InternalAPIMappingLanguage.g:5572:2: rule__LocalVariableDeclaration__Group_2__0__Impl rule__LocalVariableDeclaration__Group_2__1
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
    // InternalAPIMappingLanguage.g:5579:1: rule__LocalVariableDeclaration__Group_2__0__Impl : ( ':=' ) ;
    public final void rule__LocalVariableDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5583:1: ( ( ':=' ) )
            // InternalAPIMappingLanguage.g:5584:1: ( ':=' )
            {
            // InternalAPIMappingLanguage.g:5584:1: ( ':=' )
            // InternalAPIMappingLanguage.g:5585:1: ':='
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
    // InternalAPIMappingLanguage.g:5598:1: rule__LocalVariableDeclaration__Group_2__1 : rule__LocalVariableDeclaration__Group_2__1__Impl ;
    public final void rule__LocalVariableDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5602:1: ( rule__LocalVariableDeclaration__Group_2__1__Impl )
            // InternalAPIMappingLanguage.g:5603:2: rule__LocalVariableDeclaration__Group_2__1__Impl
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
    // InternalAPIMappingLanguage.g:5609:1: rule__LocalVariableDeclaration__Group_2__1__Impl : ( ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 ) ) ;
    public final void rule__LocalVariableDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5613:1: ( ( ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 ) ) )
            // InternalAPIMappingLanguage.g:5614:1: ( ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 ) )
            {
            // InternalAPIMappingLanguage.g:5614:1: ( ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 ) )
            // InternalAPIMappingLanguage.g:5615:1: ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 )
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getInitializeExpressionAssignment_2_1()); 
            // InternalAPIMappingLanguage.g:5616:1: ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 )
            // InternalAPIMappingLanguage.g:5616:2: rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1
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
    // InternalAPIMappingLanguage.g:5630:1: rule__LocalConstantDeclaration__Group__0 : rule__LocalConstantDeclaration__Group__0__Impl rule__LocalConstantDeclaration__Group__1 ;
    public final void rule__LocalConstantDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5634:1: ( rule__LocalConstantDeclaration__Group__0__Impl rule__LocalConstantDeclaration__Group__1 )
            // InternalAPIMappingLanguage.g:5635:2: rule__LocalConstantDeclaration__Group__0__Impl rule__LocalConstantDeclaration__Group__1
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
    // InternalAPIMappingLanguage.g:5642:1: rule__LocalConstantDeclaration__Group__0__Impl : ( ( rule__LocalConstantDeclaration__ConstantAssignment_0 ) ) ;
    public final void rule__LocalConstantDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5646:1: ( ( ( rule__LocalConstantDeclaration__ConstantAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:5647:1: ( ( rule__LocalConstantDeclaration__ConstantAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:5647:1: ( ( rule__LocalConstantDeclaration__ConstantAssignment_0 ) )
            // InternalAPIMappingLanguage.g:5648:1: ( rule__LocalConstantDeclaration__ConstantAssignment_0 )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getConstantAssignment_0()); 
            // InternalAPIMappingLanguage.g:5649:1: ( rule__LocalConstantDeclaration__ConstantAssignment_0 )
            // InternalAPIMappingLanguage.g:5649:2: rule__LocalConstantDeclaration__ConstantAssignment_0
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
    // InternalAPIMappingLanguage.g:5659:1: rule__LocalConstantDeclaration__Group__1 : rule__LocalConstantDeclaration__Group__1__Impl rule__LocalConstantDeclaration__Group__2 ;
    public final void rule__LocalConstantDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5663:1: ( rule__LocalConstantDeclaration__Group__1__Impl rule__LocalConstantDeclaration__Group__2 )
            // InternalAPIMappingLanguage.g:5664:2: rule__LocalConstantDeclaration__Group__1__Impl rule__LocalConstantDeclaration__Group__2
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
    // InternalAPIMappingLanguage.g:5671:1: rule__LocalConstantDeclaration__Group__1__Impl : ( ( rule__LocalConstantDeclaration__DataTypeAssignment_1 ) ) ;
    public final void rule__LocalConstantDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5675:1: ( ( ( rule__LocalConstantDeclaration__DataTypeAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:5676:1: ( ( rule__LocalConstantDeclaration__DataTypeAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:5676:1: ( ( rule__LocalConstantDeclaration__DataTypeAssignment_1 ) )
            // InternalAPIMappingLanguage.g:5677:1: ( rule__LocalConstantDeclaration__DataTypeAssignment_1 )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getDataTypeAssignment_1()); 
            // InternalAPIMappingLanguage.g:5678:1: ( rule__LocalConstantDeclaration__DataTypeAssignment_1 )
            // InternalAPIMappingLanguage.g:5678:2: rule__LocalConstantDeclaration__DataTypeAssignment_1
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
    // InternalAPIMappingLanguage.g:5688:1: rule__LocalConstantDeclaration__Group__2 : rule__LocalConstantDeclaration__Group__2__Impl rule__LocalConstantDeclaration__Group__3 ;
    public final void rule__LocalConstantDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5692:1: ( rule__LocalConstantDeclaration__Group__2__Impl rule__LocalConstantDeclaration__Group__3 )
            // InternalAPIMappingLanguage.g:5693:2: rule__LocalConstantDeclaration__Group__2__Impl rule__LocalConstantDeclaration__Group__3
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
    // InternalAPIMappingLanguage.g:5700:1: rule__LocalConstantDeclaration__Group__2__Impl : ( ( rule__LocalConstantDeclaration__NameAssignment_2 ) ) ;
    public final void rule__LocalConstantDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5704:1: ( ( ( rule__LocalConstantDeclaration__NameAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:5705:1: ( ( rule__LocalConstantDeclaration__NameAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:5705:1: ( ( rule__LocalConstantDeclaration__NameAssignment_2 ) )
            // InternalAPIMappingLanguage.g:5706:1: ( rule__LocalConstantDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getNameAssignment_2()); 
            // InternalAPIMappingLanguage.g:5707:1: ( rule__LocalConstantDeclaration__NameAssignment_2 )
            // InternalAPIMappingLanguage.g:5707:2: rule__LocalConstantDeclaration__NameAssignment_2
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
    // InternalAPIMappingLanguage.g:5717:1: rule__LocalConstantDeclaration__Group__3 : rule__LocalConstantDeclaration__Group__3__Impl rule__LocalConstantDeclaration__Group__4 ;
    public final void rule__LocalConstantDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5721:1: ( rule__LocalConstantDeclaration__Group__3__Impl rule__LocalConstantDeclaration__Group__4 )
            // InternalAPIMappingLanguage.g:5722:2: rule__LocalConstantDeclaration__Group__3__Impl rule__LocalConstantDeclaration__Group__4
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
    // InternalAPIMappingLanguage.g:5729:1: rule__LocalConstantDeclaration__Group__3__Impl : ( ':=' ) ;
    public final void rule__LocalConstantDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5733:1: ( ( ':=' ) )
            // InternalAPIMappingLanguage.g:5734:1: ( ':=' )
            {
            // InternalAPIMappingLanguage.g:5734:1: ( ':=' )
            // InternalAPIMappingLanguage.g:5735:1: ':='
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
    // InternalAPIMappingLanguage.g:5748:1: rule__LocalConstantDeclaration__Group__4 : rule__LocalConstantDeclaration__Group__4__Impl rule__LocalConstantDeclaration__Group__5 ;
    public final void rule__LocalConstantDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5752:1: ( rule__LocalConstantDeclaration__Group__4__Impl rule__LocalConstantDeclaration__Group__5 )
            // InternalAPIMappingLanguage.g:5753:2: rule__LocalConstantDeclaration__Group__4__Impl rule__LocalConstantDeclaration__Group__5
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
    // InternalAPIMappingLanguage.g:5760:1: rule__LocalConstantDeclaration__Group__4__Impl : ( ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 ) ) ;
    public final void rule__LocalConstantDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5764:1: ( ( ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 ) ) )
            // InternalAPIMappingLanguage.g:5765:1: ( ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 ) )
            {
            // InternalAPIMappingLanguage.g:5765:1: ( ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 ) )
            // InternalAPIMappingLanguage.g:5766:1: ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getInitializeExpressionAssignment_4()); 
            // InternalAPIMappingLanguage.g:5767:1: ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 )
            // InternalAPIMappingLanguage.g:5767:2: rule__LocalConstantDeclaration__InitializeExpressionAssignment_4
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
    // InternalAPIMappingLanguage.g:5777:1: rule__LocalConstantDeclaration__Group__5 : rule__LocalConstantDeclaration__Group__5__Impl ;
    public final void rule__LocalConstantDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5781:1: ( rule__LocalConstantDeclaration__Group__5__Impl )
            // InternalAPIMappingLanguage.g:5782:2: rule__LocalConstantDeclaration__Group__5__Impl
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
    // InternalAPIMappingLanguage.g:5788:1: rule__LocalConstantDeclaration__Group__5__Impl : ( ';' ) ;
    public final void rule__LocalConstantDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5792:1: ( ( ';' ) )
            // InternalAPIMappingLanguage.g:5793:1: ( ';' )
            {
            // InternalAPIMappingLanguage.g:5793:1: ( ';' )
            // InternalAPIMappingLanguage.g:5794:1: ';'
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getSemicolonKeyword_5()); 
            match(input,51,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:5819:1: rule__NondeterministicChoiceExpression__Group__0 : rule__NondeterministicChoiceExpression__Group__0__Impl rule__NondeterministicChoiceExpression__Group__1 ;
    public final void rule__NondeterministicChoiceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5823:1: ( rule__NondeterministicChoiceExpression__Group__0__Impl rule__NondeterministicChoiceExpression__Group__1 )
            // InternalAPIMappingLanguage.g:5824:2: rule__NondeterministicChoiceExpression__Group__0__Impl rule__NondeterministicChoiceExpression__Group__1
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
    // InternalAPIMappingLanguage.g:5831:1: rule__NondeterministicChoiceExpression__Group__0__Impl : ( ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 ) ) ;
    public final void rule__NondeterministicChoiceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5835:1: ( ( ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:5836:1: ( ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:5836:1: ( ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 ) )
            // InternalAPIMappingLanguage.g:5837:1: ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 )
            {
             before(grammarAccess.getNondeterministicChoiceExpressionAccess().getDataTypeAssignment_0()); 
            // InternalAPIMappingLanguage.g:5838:1: ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 )
            // InternalAPIMappingLanguage.g:5838:2: rule__NondeterministicChoiceExpression__DataTypeAssignment_0
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
    // InternalAPIMappingLanguage.g:5848:1: rule__NondeterministicChoiceExpression__Group__1 : rule__NondeterministicChoiceExpression__Group__1__Impl ;
    public final void rule__NondeterministicChoiceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5852:1: ( rule__NondeterministicChoiceExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:5853:2: rule__NondeterministicChoiceExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:5859:1: rule__NondeterministicChoiceExpression__Group__1__Impl : ( ( rule__NondeterministicChoiceExpression__RangeAssignment_1 ) ) ;
    public final void rule__NondeterministicChoiceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5863:1: ( ( ( rule__NondeterministicChoiceExpression__RangeAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:5864:1: ( ( rule__NondeterministicChoiceExpression__RangeAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:5864:1: ( ( rule__NondeterministicChoiceExpression__RangeAssignment_1 ) )
            // InternalAPIMappingLanguage.g:5865:1: ( rule__NondeterministicChoiceExpression__RangeAssignment_1 )
            {
             before(grammarAccess.getNondeterministicChoiceExpressionAccess().getRangeAssignment_1()); 
            // InternalAPIMappingLanguage.g:5866:1: ( rule__NondeterministicChoiceExpression__RangeAssignment_1 )
            // InternalAPIMappingLanguage.g:5866:2: rule__NondeterministicChoiceExpression__RangeAssignment_1
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
    // InternalAPIMappingLanguage.g:5880:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5884:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalAPIMappingLanguage.g:5885:2: rule__Range__Group__0__Impl rule__Range__Group__1
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
    // InternalAPIMappingLanguage.g:5892:1: rule__Range__Group__0__Impl : ( '<' ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5896:1: ( ( '<' ) )
            // InternalAPIMappingLanguage.g:5897:1: ( '<' )
            {
            // InternalAPIMappingLanguage.g:5897:1: ( '<' )
            // InternalAPIMappingLanguage.g:5898:1: '<'
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
    // InternalAPIMappingLanguage.g:5911:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5915:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalAPIMappingLanguage.g:5916:2: rule__Range__Group__1__Impl rule__Range__Group__2
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
    // InternalAPIMappingLanguage.g:5923:1: rule__Range__Group__1__Impl : ( ( rule__Range__LowerBoundAssignment_1 ) ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5927:1: ( ( ( rule__Range__LowerBoundAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:5928:1: ( ( rule__Range__LowerBoundAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:5928:1: ( ( rule__Range__LowerBoundAssignment_1 ) )
            // InternalAPIMappingLanguage.g:5929:1: ( rule__Range__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getRangeAccess().getLowerBoundAssignment_1()); 
            // InternalAPIMappingLanguage.g:5930:1: ( rule__Range__LowerBoundAssignment_1 )
            // InternalAPIMappingLanguage.g:5930:2: rule__Range__LowerBoundAssignment_1
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
    // InternalAPIMappingLanguage.g:5940:1: rule__Range__Group__2 : rule__Range__Group__2__Impl rule__Range__Group__3 ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5944:1: ( rule__Range__Group__2__Impl rule__Range__Group__3 )
            // InternalAPIMappingLanguage.g:5945:2: rule__Range__Group__2__Impl rule__Range__Group__3
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
    // InternalAPIMappingLanguage.g:5952:1: rule__Range__Group__2__Impl : ( ',' ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5956:1: ( ( ',' ) )
            // InternalAPIMappingLanguage.g:5957:1: ( ',' )
            {
            // InternalAPIMappingLanguage.g:5957:1: ( ',' )
            // InternalAPIMappingLanguage.g:5958:1: ','
            {
             before(grammarAccess.getRangeAccess().getCommaKeyword_2()); 
            match(input,42,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:5971:1: rule__Range__Group__3 : rule__Range__Group__3__Impl rule__Range__Group__4 ;
    public final void rule__Range__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5975:1: ( rule__Range__Group__3__Impl rule__Range__Group__4 )
            // InternalAPIMappingLanguage.g:5976:2: rule__Range__Group__3__Impl rule__Range__Group__4
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
    // InternalAPIMappingLanguage.g:5983:1: rule__Range__Group__3__Impl : ( ( rule__Range__UpperBoundAssignment_3 ) ) ;
    public final void rule__Range__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5987:1: ( ( ( rule__Range__UpperBoundAssignment_3 ) ) )
            // InternalAPIMappingLanguage.g:5988:1: ( ( rule__Range__UpperBoundAssignment_3 ) )
            {
            // InternalAPIMappingLanguage.g:5988:1: ( ( rule__Range__UpperBoundAssignment_3 ) )
            // InternalAPIMappingLanguage.g:5989:1: ( rule__Range__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getRangeAccess().getUpperBoundAssignment_3()); 
            // InternalAPIMappingLanguage.g:5990:1: ( rule__Range__UpperBoundAssignment_3 )
            // InternalAPIMappingLanguage.g:5990:2: rule__Range__UpperBoundAssignment_3
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
    // InternalAPIMappingLanguage.g:6000:1: rule__Range__Group__4 : rule__Range__Group__4__Impl ;
    public final void rule__Range__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6004:1: ( rule__Range__Group__4__Impl )
            // InternalAPIMappingLanguage.g:6005:2: rule__Range__Group__4__Impl
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
    // InternalAPIMappingLanguage.g:6011:1: rule__Range__Group__4__Impl : ( '>' ) ;
    public final void rule__Range__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6015:1: ( ( '>' ) )
            // InternalAPIMappingLanguage.g:6016:1: ( '>' )
            {
            // InternalAPIMappingLanguage.g:6016:1: ( '>' )
            // InternalAPIMappingLanguage.g:6017:1: '>'
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
    // InternalAPIMappingLanguage.g:6040:1: rule__LogicalOrExpression__Group__0 : rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1 ;
    public final void rule__LogicalOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6044:1: ( rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1 )
            // InternalAPIMappingLanguage.g:6045:2: rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1
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
    // InternalAPIMappingLanguage.g:6052:1: rule__LogicalOrExpression__Group__0__Impl : ( ruleLogicalAndExpression ) ;
    public final void rule__LogicalOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6056:1: ( ( ruleLogicalAndExpression ) )
            // InternalAPIMappingLanguage.g:6057:1: ( ruleLogicalAndExpression )
            {
            // InternalAPIMappingLanguage.g:6057:1: ( ruleLogicalAndExpression )
            // InternalAPIMappingLanguage.g:6058:1: ruleLogicalAndExpression
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
    // InternalAPIMappingLanguage.g:6069:1: rule__LogicalOrExpression__Group__1 : rule__LogicalOrExpression__Group__1__Impl ;
    public final void rule__LogicalOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6073:1: ( rule__LogicalOrExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:6074:2: rule__LogicalOrExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:6080:1: rule__LogicalOrExpression__Group__1__Impl : ( ( rule__LogicalOrExpression__Group_1__0 )* ) ;
    public final void rule__LogicalOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6084:1: ( ( ( rule__LogicalOrExpression__Group_1__0 )* ) )
            // InternalAPIMappingLanguage.g:6085:1: ( ( rule__LogicalOrExpression__Group_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:6085:1: ( ( rule__LogicalOrExpression__Group_1__0 )* )
            // InternalAPIMappingLanguage.g:6086:1: ( rule__LogicalOrExpression__Group_1__0 )*
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:6087:1: ( rule__LogicalOrExpression__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==14) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:6087:2: rule__LogicalOrExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_38);
            	    rule__LogicalOrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalAPIMappingLanguage.g:6101:1: rule__LogicalOrExpression__Group_1__0 : rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1 ;
    public final void rule__LogicalOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6105:1: ( rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:6106:2: rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1
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
    // InternalAPIMappingLanguage.g:6113:1: rule__LogicalOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6117:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:6118:1: ( () )
            {
            // InternalAPIMappingLanguage.g:6118:1: ( () )
            // InternalAPIMappingLanguage.g:6119:1: ()
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0()); 
            // InternalAPIMappingLanguage.g:6120:1: ()
            // InternalAPIMappingLanguage.g:6122:1: 
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
    // InternalAPIMappingLanguage.g:6132:1: rule__LogicalOrExpression__Group_1__1 : rule__LogicalOrExpression__Group_1__1__Impl rule__LogicalOrExpression__Group_1__2 ;
    public final void rule__LogicalOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6136:1: ( rule__LogicalOrExpression__Group_1__1__Impl rule__LogicalOrExpression__Group_1__2 )
            // InternalAPIMappingLanguage.g:6137:2: rule__LogicalOrExpression__Group_1__1__Impl rule__LogicalOrExpression__Group_1__2
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
    // InternalAPIMappingLanguage.g:6144:1: rule__LogicalOrExpression__Group_1__1__Impl : ( ( rule__LogicalOrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__LogicalOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6148:1: ( ( ( rule__LogicalOrExpression__OperatorAssignment_1_1 ) ) )
            // InternalAPIMappingLanguage.g:6149:1: ( ( rule__LogicalOrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:6149:1: ( ( rule__LogicalOrExpression__OperatorAssignment_1_1 ) )
            // InternalAPIMappingLanguage.g:6150:1: ( rule__LogicalOrExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAPIMappingLanguage.g:6151:1: ( rule__LogicalOrExpression__OperatorAssignment_1_1 )
            // InternalAPIMappingLanguage.g:6151:2: rule__LogicalOrExpression__OperatorAssignment_1_1
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
    // InternalAPIMappingLanguage.g:6161:1: rule__LogicalOrExpression__Group_1__2 : rule__LogicalOrExpression__Group_1__2__Impl ;
    public final void rule__LogicalOrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6165:1: ( rule__LogicalOrExpression__Group_1__2__Impl )
            // InternalAPIMappingLanguage.g:6166:2: rule__LogicalOrExpression__Group_1__2__Impl
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
    // InternalAPIMappingLanguage.g:6172:1: rule__LogicalOrExpression__Group_1__2__Impl : ( ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__LogicalOrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6176:1: ( ( ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalAPIMappingLanguage.g:6177:1: ( ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalAPIMappingLanguage.g:6177:1: ( ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 ) )
            // InternalAPIMappingLanguage.g:6178:1: ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalAPIMappingLanguage.g:6179:1: ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 )
            // InternalAPIMappingLanguage.g:6179:2: rule__LogicalOrExpression__RightExpressionAssignment_1_2
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
    // InternalAPIMappingLanguage.g:6195:1: rule__LogicalAndExpression__Group__0 : rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1 ;
    public final void rule__LogicalAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6199:1: ( rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1 )
            // InternalAPIMappingLanguage.g:6200:2: rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1
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
    // InternalAPIMappingLanguage.g:6207:1: rule__LogicalAndExpression__Group__0__Impl : ( ruleComparisonExpression ) ;
    public final void rule__LogicalAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6211:1: ( ( ruleComparisonExpression ) )
            // InternalAPIMappingLanguage.g:6212:1: ( ruleComparisonExpression )
            {
            // InternalAPIMappingLanguage.g:6212:1: ( ruleComparisonExpression )
            // InternalAPIMappingLanguage.g:6213:1: ruleComparisonExpression
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
    // InternalAPIMappingLanguage.g:6224:1: rule__LogicalAndExpression__Group__1 : rule__LogicalAndExpression__Group__1__Impl ;
    public final void rule__LogicalAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6228:1: ( rule__LogicalAndExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:6229:2: rule__LogicalAndExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:6235:1: rule__LogicalAndExpression__Group__1__Impl : ( ( rule__LogicalAndExpression__Group_1__0 )* ) ;
    public final void rule__LogicalAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6239:1: ( ( ( rule__LogicalAndExpression__Group_1__0 )* ) )
            // InternalAPIMappingLanguage.g:6240:1: ( ( rule__LogicalAndExpression__Group_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:6240:1: ( ( rule__LogicalAndExpression__Group_1__0 )* )
            // InternalAPIMappingLanguage.g:6241:1: ( rule__LogicalAndExpression__Group_1__0 )*
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:6242:1: ( rule__LogicalAndExpression__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==15) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:6242:2: rule__LogicalAndExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_40);
            	    rule__LogicalAndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // InternalAPIMappingLanguage.g:6256:1: rule__LogicalAndExpression__Group_1__0 : rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1 ;
    public final void rule__LogicalAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6260:1: ( rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:6261:2: rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1
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
    // InternalAPIMappingLanguage.g:6268:1: rule__LogicalAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6272:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:6273:1: ( () )
            {
            // InternalAPIMappingLanguage.g:6273:1: ( () )
            // InternalAPIMappingLanguage.g:6274:1: ()
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0()); 
            // InternalAPIMappingLanguage.g:6275:1: ()
            // InternalAPIMappingLanguage.g:6277:1: 
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
    // InternalAPIMappingLanguage.g:6287:1: rule__LogicalAndExpression__Group_1__1 : rule__LogicalAndExpression__Group_1__1__Impl rule__LogicalAndExpression__Group_1__2 ;
    public final void rule__LogicalAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6291:1: ( rule__LogicalAndExpression__Group_1__1__Impl rule__LogicalAndExpression__Group_1__2 )
            // InternalAPIMappingLanguage.g:6292:2: rule__LogicalAndExpression__Group_1__1__Impl rule__LogicalAndExpression__Group_1__2
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
    // InternalAPIMappingLanguage.g:6299:1: rule__LogicalAndExpression__Group_1__1__Impl : ( ( rule__LogicalAndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__LogicalAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6303:1: ( ( ( rule__LogicalAndExpression__OperatorAssignment_1_1 ) ) )
            // InternalAPIMappingLanguage.g:6304:1: ( ( rule__LogicalAndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:6304:1: ( ( rule__LogicalAndExpression__OperatorAssignment_1_1 ) )
            // InternalAPIMappingLanguage.g:6305:1: ( rule__LogicalAndExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAPIMappingLanguage.g:6306:1: ( rule__LogicalAndExpression__OperatorAssignment_1_1 )
            // InternalAPIMappingLanguage.g:6306:2: rule__LogicalAndExpression__OperatorAssignment_1_1
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
    // InternalAPIMappingLanguage.g:6316:1: rule__LogicalAndExpression__Group_1__2 : rule__LogicalAndExpression__Group_1__2__Impl ;
    public final void rule__LogicalAndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6320:1: ( rule__LogicalAndExpression__Group_1__2__Impl )
            // InternalAPIMappingLanguage.g:6321:2: rule__LogicalAndExpression__Group_1__2__Impl
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
    // InternalAPIMappingLanguage.g:6327:1: rule__LogicalAndExpression__Group_1__2__Impl : ( ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__LogicalAndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6331:1: ( ( ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalAPIMappingLanguage.g:6332:1: ( ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalAPIMappingLanguage.g:6332:1: ( ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 ) )
            // InternalAPIMappingLanguage.g:6333:1: ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalAPIMappingLanguage.g:6334:1: ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 )
            // InternalAPIMappingLanguage.g:6334:2: rule__LogicalAndExpression__RightExpressionAssignment_1_2
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
    // InternalAPIMappingLanguage.g:6350:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6354:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // InternalAPIMappingLanguage.g:6355:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
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
    // InternalAPIMappingLanguage.g:6362:1: rule__ComparisonExpression__Group__0__Impl : ( ruleComparisonHigherOpExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6366:1: ( ( ruleComparisonHigherOpExpression ) )
            // InternalAPIMappingLanguage.g:6367:1: ( ruleComparisonHigherOpExpression )
            {
            // InternalAPIMappingLanguage.g:6367:1: ( ruleComparisonHigherOpExpression )
            // InternalAPIMappingLanguage.g:6368:1: ruleComparisonHigherOpExpression
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
    // InternalAPIMappingLanguage.g:6379:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6383:1: ( rule__ComparisonExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:6384:2: rule__ComparisonExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:6390:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )? ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6394:1: ( ( ( rule__ComparisonExpression__Group_1__0 )? ) )
            // InternalAPIMappingLanguage.g:6395:1: ( ( rule__ComparisonExpression__Group_1__0 )? )
            {
            // InternalAPIMappingLanguage.g:6395:1: ( ( rule__ComparisonExpression__Group_1__0 )? )
            // InternalAPIMappingLanguage.g:6396:1: ( rule__ComparisonExpression__Group_1__0 )?
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:6397:1: ( rule__ComparisonExpression__Group_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=22 && LA40_0<=23)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAPIMappingLanguage.g:6397:2: rule__ComparisonExpression__Group_1__0
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
    // InternalAPIMappingLanguage.g:6411:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6415:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:6416:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
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
    // InternalAPIMappingLanguage.g:6423:1: rule__ComparisonExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6427:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:6428:1: ( () )
            {
            // InternalAPIMappingLanguage.g:6428:1: ( () )
            // InternalAPIMappingLanguage.g:6429:1: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0()); 
            // InternalAPIMappingLanguage.g:6430:1: ()
            // InternalAPIMappingLanguage.g:6432:1: 
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
    // InternalAPIMappingLanguage.g:6442:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6446:1: ( rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 )
            // InternalAPIMappingLanguage.g:6447:2: rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2
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
    // InternalAPIMappingLanguage.g:6454:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6458:1: ( ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) )
            // InternalAPIMappingLanguage.g:6459:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:6459:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            // InternalAPIMappingLanguage.g:6460:1: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAPIMappingLanguage.g:6461:1: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            // InternalAPIMappingLanguage.g:6461:2: rule__ComparisonExpression__OperatorAssignment_1_1
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
    // InternalAPIMappingLanguage.g:6471:1: rule__ComparisonExpression__Group_1__2 : rule__ComparisonExpression__Group_1__2__Impl ;
    public final void rule__ComparisonExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6475:1: ( rule__ComparisonExpression__Group_1__2__Impl )
            // InternalAPIMappingLanguage.g:6476:2: rule__ComparisonExpression__Group_1__2__Impl
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
    // InternalAPIMappingLanguage.g:6482:1: rule__ComparisonExpression__Group_1__2__Impl : ( ( rule__ComparisonExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__ComparisonExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6486:1: ( ( ( rule__ComparisonExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalAPIMappingLanguage.g:6487:1: ( ( rule__ComparisonExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalAPIMappingLanguage.g:6487:1: ( ( rule__ComparisonExpression__RightExpressionAssignment_1_2 ) )
            // InternalAPIMappingLanguage.g:6488:1: ( rule__ComparisonExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalAPIMappingLanguage.g:6489:1: ( rule__ComparisonExpression__RightExpressionAssignment_1_2 )
            // InternalAPIMappingLanguage.g:6489:2: rule__ComparisonExpression__RightExpressionAssignment_1_2
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
    // InternalAPIMappingLanguage.g:6505:1: rule__ComparisonHigherOpExpression__Group__0 : rule__ComparisonHigherOpExpression__Group__0__Impl rule__ComparisonHigherOpExpression__Group__1 ;
    public final void rule__ComparisonHigherOpExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6509:1: ( rule__ComparisonHigherOpExpression__Group__0__Impl rule__ComparisonHigherOpExpression__Group__1 )
            // InternalAPIMappingLanguage.g:6510:2: rule__ComparisonHigherOpExpression__Group__0__Impl rule__ComparisonHigherOpExpression__Group__1
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
    // InternalAPIMappingLanguage.g:6517:1: rule__ComparisonHigherOpExpression__Group__0__Impl : ( ruleArithmeticExpression ) ;
    public final void rule__ComparisonHigherOpExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6521:1: ( ( ruleArithmeticExpression ) )
            // InternalAPIMappingLanguage.g:6522:1: ( ruleArithmeticExpression )
            {
            // InternalAPIMappingLanguage.g:6522:1: ( ruleArithmeticExpression )
            // InternalAPIMappingLanguage.g:6523:1: ruleArithmeticExpression
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
    // InternalAPIMappingLanguage.g:6534:1: rule__ComparisonHigherOpExpression__Group__1 : rule__ComparisonHigherOpExpression__Group__1__Impl ;
    public final void rule__ComparisonHigherOpExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6538:1: ( rule__ComparisonHigherOpExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:6539:2: rule__ComparisonHigherOpExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:6545:1: rule__ComparisonHigherOpExpression__Group__1__Impl : ( ( rule__ComparisonHigherOpExpression__Group_1__0 )? ) ;
    public final void rule__ComparisonHigherOpExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6549:1: ( ( ( rule__ComparisonHigherOpExpression__Group_1__0 )? ) )
            // InternalAPIMappingLanguage.g:6550:1: ( ( rule__ComparisonHigherOpExpression__Group_1__0 )? )
            {
            // InternalAPIMappingLanguage.g:6550:1: ( ( rule__ComparisonHigherOpExpression__Group_1__0 )? )
            // InternalAPIMappingLanguage.g:6551:1: ( rule__ComparisonHigherOpExpression__Group_1__0 )?
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:6552:1: ( rule__ComparisonHigherOpExpression__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=24 && LA41_0<=27)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAPIMappingLanguage.g:6552:2: rule__ComparisonHigherOpExpression__Group_1__0
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
    // InternalAPIMappingLanguage.g:6566:1: rule__ComparisonHigherOpExpression__Group_1__0 : rule__ComparisonHigherOpExpression__Group_1__0__Impl rule__ComparisonHigherOpExpression__Group_1__1 ;
    public final void rule__ComparisonHigherOpExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6570:1: ( rule__ComparisonHigherOpExpression__Group_1__0__Impl rule__ComparisonHigherOpExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:6571:2: rule__ComparisonHigherOpExpression__Group_1__0__Impl rule__ComparisonHigherOpExpression__Group_1__1
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
    // InternalAPIMappingLanguage.g:6578:1: rule__ComparisonHigherOpExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonHigherOpExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6582:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:6583:1: ( () )
            {
            // InternalAPIMappingLanguage.g:6583:1: ( () )
            // InternalAPIMappingLanguage.g:6584:1: ()
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0()); 
            // InternalAPIMappingLanguage.g:6585:1: ()
            // InternalAPIMappingLanguage.g:6587:1: 
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
    // InternalAPIMappingLanguage.g:6597:1: rule__ComparisonHigherOpExpression__Group_1__1 : rule__ComparisonHigherOpExpression__Group_1__1__Impl rule__ComparisonHigherOpExpression__Group_1__2 ;
    public final void rule__ComparisonHigherOpExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6601:1: ( rule__ComparisonHigherOpExpression__Group_1__1__Impl rule__ComparisonHigherOpExpression__Group_1__2 )
            // InternalAPIMappingLanguage.g:6602:2: rule__ComparisonHigherOpExpression__Group_1__1__Impl rule__ComparisonHigherOpExpression__Group_1__2
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
    // InternalAPIMappingLanguage.g:6609:1: rule__ComparisonHigherOpExpression__Group_1__1__Impl : ( ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonHigherOpExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6613:1: ( ( ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 ) ) )
            // InternalAPIMappingLanguage.g:6614:1: ( ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:6614:1: ( ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 ) )
            // InternalAPIMappingLanguage.g:6615:1: ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAPIMappingLanguage.g:6616:1: ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 )
            // InternalAPIMappingLanguage.g:6616:2: rule__ComparisonHigherOpExpression__OperatorAssignment_1_1
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
    // InternalAPIMappingLanguage.g:6626:1: rule__ComparisonHigherOpExpression__Group_1__2 : rule__ComparisonHigherOpExpression__Group_1__2__Impl ;
    public final void rule__ComparisonHigherOpExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6630:1: ( rule__ComparisonHigherOpExpression__Group_1__2__Impl )
            // InternalAPIMappingLanguage.g:6631:2: rule__ComparisonHigherOpExpression__Group_1__2__Impl
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
    // InternalAPIMappingLanguage.g:6637:1: rule__ComparisonHigherOpExpression__Group_1__2__Impl : ( ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__ComparisonHigherOpExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6641:1: ( ( ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalAPIMappingLanguage.g:6642:1: ( ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalAPIMappingLanguage.g:6642:1: ( ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 ) )
            // InternalAPIMappingLanguage.g:6643:1: ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalAPIMappingLanguage.g:6644:1: ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 )
            // InternalAPIMappingLanguage.g:6644:2: rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2
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
    // InternalAPIMappingLanguage.g:6660:1: rule__AdditionExpression__Group__0 : rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 ;
    public final void rule__AdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6664:1: ( rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 )
            // InternalAPIMappingLanguage.g:6665:2: rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1
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
    // InternalAPIMappingLanguage.g:6672:1: rule__AdditionExpression__Group__0__Impl : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6676:1: ( ( ruleMultiplicationExpression ) )
            // InternalAPIMappingLanguage.g:6677:1: ( ruleMultiplicationExpression )
            {
            // InternalAPIMappingLanguage.g:6677:1: ( ruleMultiplicationExpression )
            // InternalAPIMappingLanguage.g:6678:1: ruleMultiplicationExpression
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
    // InternalAPIMappingLanguage.g:6689:1: rule__AdditionExpression__Group__1 : rule__AdditionExpression__Group__1__Impl ;
    public final void rule__AdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6693:1: ( rule__AdditionExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:6694:2: rule__AdditionExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:6700:1: rule__AdditionExpression__Group__1__Impl : ( ( rule__AdditionExpression__Group_1__0 )* ) ;
    public final void rule__AdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6704:1: ( ( ( rule__AdditionExpression__Group_1__0 )* ) )
            // InternalAPIMappingLanguage.g:6705:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:6705:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            // InternalAPIMappingLanguage.g:6706:1: ( rule__AdditionExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:6707:1: ( rule__AdditionExpression__Group_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=28 && LA42_0<=29)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:6707:2: rule__AdditionExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_44);
            	    rule__AdditionExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalAPIMappingLanguage.g:6721:1: rule__AdditionExpression__Group_1__0 : rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 ;
    public final void rule__AdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6725:1: ( rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:6726:2: rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1
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
    // InternalAPIMappingLanguage.g:6733:1: rule__AdditionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6737:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:6738:1: ( () )
            {
            // InternalAPIMappingLanguage.g:6738:1: ( () )
            // InternalAPIMappingLanguage.g:6739:1: ()
            {
             before(grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0()); 
            // InternalAPIMappingLanguage.g:6740:1: ()
            // InternalAPIMappingLanguage.g:6742:1: 
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
    // InternalAPIMappingLanguage.g:6752:1: rule__AdditionExpression__Group_1__1 : rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 ;
    public final void rule__AdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6756:1: ( rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 )
            // InternalAPIMappingLanguage.g:6757:2: rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2
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
    // InternalAPIMappingLanguage.g:6764:1: rule__AdditionExpression__Group_1__1__Impl : ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6768:1: ( ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) )
            // InternalAPIMappingLanguage.g:6769:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:6769:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            // InternalAPIMappingLanguage.g:6770:1: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAPIMappingLanguage.g:6771:1: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            // InternalAPIMappingLanguage.g:6771:2: rule__AdditionExpression__OperatorAssignment_1_1
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
    // InternalAPIMappingLanguage.g:6781:1: rule__AdditionExpression__Group_1__2 : rule__AdditionExpression__Group_1__2__Impl ;
    public final void rule__AdditionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6785:1: ( rule__AdditionExpression__Group_1__2__Impl )
            // InternalAPIMappingLanguage.g:6786:2: rule__AdditionExpression__Group_1__2__Impl
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
    // InternalAPIMappingLanguage.g:6792:1: rule__AdditionExpression__Group_1__2__Impl : ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__AdditionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6796:1: ( ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalAPIMappingLanguage.g:6797:1: ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalAPIMappingLanguage.g:6797:1: ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) )
            // InternalAPIMappingLanguage.g:6798:1: ( rule__AdditionExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalAPIMappingLanguage.g:6799:1: ( rule__AdditionExpression__RightExpressionAssignment_1_2 )
            // InternalAPIMappingLanguage.g:6799:2: rule__AdditionExpression__RightExpressionAssignment_1_2
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
    // InternalAPIMappingLanguage.g:6815:1: rule__MultiplicationExpression__Group_1__0 : rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 ;
    public final void rule__MultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6819:1: ( rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:6820:2: rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1
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
    // InternalAPIMappingLanguage.g:6827:1: rule__MultiplicationExpression__Group_1__0__Impl : ( ruleTypeCastExpression ) ;
    public final void rule__MultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6831:1: ( ( ruleTypeCastExpression ) )
            // InternalAPIMappingLanguage.g:6832:1: ( ruleTypeCastExpression )
            {
            // InternalAPIMappingLanguage.g:6832:1: ( ruleTypeCastExpression )
            // InternalAPIMappingLanguage.g:6833:1: ruleTypeCastExpression
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
    // InternalAPIMappingLanguage.g:6844:1: rule__MultiplicationExpression__Group_1__1 : rule__MultiplicationExpression__Group_1__1__Impl ;
    public final void rule__MultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6848:1: ( rule__MultiplicationExpression__Group_1__1__Impl )
            // InternalAPIMappingLanguage.g:6849:2: rule__MultiplicationExpression__Group_1__1__Impl
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
    // InternalAPIMappingLanguage.g:6855:1: rule__MultiplicationExpression__Group_1__1__Impl : ( ( rule__MultiplicationExpression__Group_1_1__0 )* ) ;
    public final void rule__MultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6859:1: ( ( ( rule__MultiplicationExpression__Group_1_1__0 )* ) )
            // InternalAPIMappingLanguage.g:6860:1: ( ( rule__MultiplicationExpression__Group_1_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:6860:1: ( ( rule__MultiplicationExpression__Group_1_1__0 )* )
            // InternalAPIMappingLanguage.g:6861:1: ( rule__MultiplicationExpression__Group_1_1__0 )*
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1_1()); 
            // InternalAPIMappingLanguage.g:6862:1: ( rule__MultiplicationExpression__Group_1_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=30 && LA43_0<=32)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:6862:2: rule__MultiplicationExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_46);
            	    rule__MultiplicationExpression__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalAPIMappingLanguage.g:6876:1: rule__MultiplicationExpression__Group_1_1__0 : rule__MultiplicationExpression__Group_1_1__0__Impl rule__MultiplicationExpression__Group_1_1__1 ;
    public final void rule__MultiplicationExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6880:1: ( rule__MultiplicationExpression__Group_1_1__0__Impl rule__MultiplicationExpression__Group_1_1__1 )
            // InternalAPIMappingLanguage.g:6881:2: rule__MultiplicationExpression__Group_1_1__0__Impl rule__MultiplicationExpression__Group_1_1__1
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
    // InternalAPIMappingLanguage.g:6888:1: rule__MultiplicationExpression__Group_1_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6892:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:6893:1: ( () )
            {
            // InternalAPIMappingLanguage.g:6893:1: ( () )
            // InternalAPIMappingLanguage.g:6894:1: ()
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_1_0()); 
            // InternalAPIMappingLanguage.g:6895:1: ()
            // InternalAPIMappingLanguage.g:6897:1: 
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
    // InternalAPIMappingLanguage.g:6907:1: rule__MultiplicationExpression__Group_1_1__1 : rule__MultiplicationExpression__Group_1_1__1__Impl rule__MultiplicationExpression__Group_1_1__2 ;
    public final void rule__MultiplicationExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6911:1: ( rule__MultiplicationExpression__Group_1_1__1__Impl rule__MultiplicationExpression__Group_1_1__2 )
            // InternalAPIMappingLanguage.g:6912:2: rule__MultiplicationExpression__Group_1_1__1__Impl rule__MultiplicationExpression__Group_1_1__2
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
    // InternalAPIMappingLanguage.g:6919:1: rule__MultiplicationExpression__Group_1_1__1__Impl : ( ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 ) ) ;
    public final void rule__MultiplicationExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6923:1: ( ( ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 ) ) )
            // InternalAPIMappingLanguage.g:6924:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:6924:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 ) )
            // InternalAPIMappingLanguage.g:6925:1: ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1_1()); 
            // InternalAPIMappingLanguage.g:6926:1: ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 )
            // InternalAPIMappingLanguage.g:6926:2: rule__MultiplicationExpression__OperatorAssignment_1_1_1
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
    // InternalAPIMappingLanguage.g:6936:1: rule__MultiplicationExpression__Group_1_1__2 : rule__MultiplicationExpression__Group_1_1__2__Impl ;
    public final void rule__MultiplicationExpression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6940:1: ( rule__MultiplicationExpression__Group_1_1__2__Impl )
            // InternalAPIMappingLanguage.g:6941:2: rule__MultiplicationExpression__Group_1_1__2__Impl
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
    // InternalAPIMappingLanguage.g:6947:1: rule__MultiplicationExpression__Group_1_1__2__Impl : ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 ) ) ;
    public final void rule__MultiplicationExpression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6951:1: ( ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 ) ) )
            // InternalAPIMappingLanguage.g:6952:1: ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 ) )
            {
            // InternalAPIMappingLanguage.g:6952:1: ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 ) )
            // InternalAPIMappingLanguage.g:6953:1: ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAssignment_1_1_2()); 
            // InternalAPIMappingLanguage.g:6954:1: ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 )
            // InternalAPIMappingLanguage.g:6954:2: rule__MultiplicationExpression__RightExpressionAssignment_1_1_2
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
    // InternalAPIMappingLanguage.g:6970:1: rule__UnaryPreExpression__Group__0 : rule__UnaryPreExpression__Group__0__Impl rule__UnaryPreExpression__Group__1 ;
    public final void rule__UnaryPreExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6974:1: ( rule__UnaryPreExpression__Group__0__Impl rule__UnaryPreExpression__Group__1 )
            // InternalAPIMappingLanguage.g:6975:2: rule__UnaryPreExpression__Group__0__Impl rule__UnaryPreExpression__Group__1
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
    // InternalAPIMappingLanguage.g:6982:1: rule__UnaryPreExpression__Group__0__Impl : ( () ) ;
    public final void rule__UnaryPreExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6986:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:6987:1: ( () )
            {
            // InternalAPIMappingLanguage.g:6987:1: ( () )
            // InternalAPIMappingLanguage.g:6988:1: ()
            {
             before(grammarAccess.getUnaryPreExpressionAccess().getUnaryExpressionAction_0()); 
            // InternalAPIMappingLanguage.g:6989:1: ()
            // InternalAPIMappingLanguage.g:6991:1: 
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
    // InternalAPIMappingLanguage.g:7001:1: rule__UnaryPreExpression__Group__1 : rule__UnaryPreExpression__Group__1__Impl rule__UnaryPreExpression__Group__2 ;
    public final void rule__UnaryPreExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7005:1: ( rule__UnaryPreExpression__Group__1__Impl rule__UnaryPreExpression__Group__2 )
            // InternalAPIMappingLanguage.g:7006:2: rule__UnaryPreExpression__Group__1__Impl rule__UnaryPreExpression__Group__2
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
    // InternalAPIMappingLanguage.g:7013:1: rule__UnaryPreExpression__Group__1__Impl : ( ( rule__UnaryPreExpression__OperatorAssignment_1 ) ) ;
    public final void rule__UnaryPreExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7017:1: ( ( ( rule__UnaryPreExpression__OperatorAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:7018:1: ( ( rule__UnaryPreExpression__OperatorAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:7018:1: ( ( rule__UnaryPreExpression__OperatorAssignment_1 ) )
            // InternalAPIMappingLanguage.g:7019:1: ( rule__UnaryPreExpression__OperatorAssignment_1 )
            {
             before(grammarAccess.getUnaryPreExpressionAccess().getOperatorAssignment_1()); 
            // InternalAPIMappingLanguage.g:7020:1: ( rule__UnaryPreExpression__OperatorAssignment_1 )
            // InternalAPIMappingLanguage.g:7020:2: rule__UnaryPreExpression__OperatorAssignment_1
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
    // InternalAPIMappingLanguage.g:7030:1: rule__UnaryPreExpression__Group__2 : rule__UnaryPreExpression__Group__2__Impl ;
    public final void rule__UnaryPreExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7034:1: ( rule__UnaryPreExpression__Group__2__Impl )
            // InternalAPIMappingLanguage.g:7035:2: rule__UnaryPreExpression__Group__2__Impl
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
    // InternalAPIMappingLanguage.g:7041:1: rule__UnaryPreExpression__Group__2__Impl : ( ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 ) ) ;
    public final void rule__UnaryPreExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7045:1: ( ( ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:7046:1: ( ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:7046:1: ( ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 ) )
            // InternalAPIMappingLanguage.g:7047:1: ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 )
            {
             before(grammarAccess.getUnaryPreExpressionAccess().getEnclosedExpressionAssignment_2()); 
            // InternalAPIMappingLanguage.g:7048:1: ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 )
            // InternalAPIMappingLanguage.g:7048:2: rule__UnaryPreExpression__EnclosedExpressionAssignment_2
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
    // InternalAPIMappingLanguage.g:7064:1: rule__TypeCastExpression__Group_1__0 : rule__TypeCastExpression__Group_1__0__Impl rule__TypeCastExpression__Group_1__1 ;
    public final void rule__TypeCastExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7068:1: ( rule__TypeCastExpression__Group_1__0__Impl rule__TypeCastExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:7069:2: rule__TypeCastExpression__Group_1__0__Impl rule__TypeCastExpression__Group_1__1
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
    // InternalAPIMappingLanguage.g:7076:1: rule__TypeCastExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TypeCastExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7080:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:7081:1: ( () )
            {
            // InternalAPIMappingLanguage.g:7081:1: ( () )
            // InternalAPIMappingLanguage.g:7082:1: ()
            {
             before(grammarAccess.getTypeCastExpressionAccess().getTypeCastExpressionAction_1_0()); 
            // InternalAPIMappingLanguage.g:7083:1: ()
            // InternalAPIMappingLanguage.g:7085:1: 
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
    // InternalAPIMappingLanguage.g:7095:1: rule__TypeCastExpression__Group_1__1 : rule__TypeCastExpression__Group_1__1__Impl rule__TypeCastExpression__Group_1__2 ;
    public final void rule__TypeCastExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7099:1: ( rule__TypeCastExpression__Group_1__1__Impl rule__TypeCastExpression__Group_1__2 )
            // InternalAPIMappingLanguage.g:7100:2: rule__TypeCastExpression__Group_1__1__Impl rule__TypeCastExpression__Group_1__2
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
    // InternalAPIMappingLanguage.g:7107:1: rule__TypeCastExpression__Group_1__1__Impl : ( '(' ) ;
    public final void rule__TypeCastExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7111:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:7112:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:7112:1: ( '(' )
            // InternalAPIMappingLanguage.g:7113:1: '('
            {
             before(grammarAccess.getTypeCastExpressionAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,49,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:7126:1: rule__TypeCastExpression__Group_1__2 : rule__TypeCastExpression__Group_1__2__Impl rule__TypeCastExpression__Group_1__3 ;
    public final void rule__TypeCastExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7130:1: ( rule__TypeCastExpression__Group_1__2__Impl rule__TypeCastExpression__Group_1__3 )
            // InternalAPIMappingLanguage.g:7131:2: rule__TypeCastExpression__Group_1__2__Impl rule__TypeCastExpression__Group_1__3
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
    // InternalAPIMappingLanguage.g:7138:1: rule__TypeCastExpression__Group_1__2__Impl : ( ( rule__TypeCastExpression__DataTypeAssignment_1_2 ) ) ;
    public final void rule__TypeCastExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7142:1: ( ( ( rule__TypeCastExpression__DataTypeAssignment_1_2 ) ) )
            // InternalAPIMappingLanguage.g:7143:1: ( ( rule__TypeCastExpression__DataTypeAssignment_1_2 ) )
            {
            // InternalAPIMappingLanguage.g:7143:1: ( ( rule__TypeCastExpression__DataTypeAssignment_1_2 ) )
            // InternalAPIMappingLanguage.g:7144:1: ( rule__TypeCastExpression__DataTypeAssignment_1_2 )
            {
             before(grammarAccess.getTypeCastExpressionAccess().getDataTypeAssignment_1_2()); 
            // InternalAPIMappingLanguage.g:7145:1: ( rule__TypeCastExpression__DataTypeAssignment_1_2 )
            // InternalAPIMappingLanguage.g:7145:2: rule__TypeCastExpression__DataTypeAssignment_1_2
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
    // InternalAPIMappingLanguage.g:7155:1: rule__TypeCastExpression__Group_1__3 : rule__TypeCastExpression__Group_1__3__Impl rule__TypeCastExpression__Group_1__4 ;
    public final void rule__TypeCastExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7159:1: ( rule__TypeCastExpression__Group_1__3__Impl rule__TypeCastExpression__Group_1__4 )
            // InternalAPIMappingLanguage.g:7160:2: rule__TypeCastExpression__Group_1__3__Impl rule__TypeCastExpression__Group_1__4
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
    // InternalAPIMappingLanguage.g:7167:1: rule__TypeCastExpression__Group_1__3__Impl : ( ')' ) ;
    public final void rule__TypeCastExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7171:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:7172:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:7172:1: ( ')' )
            // InternalAPIMappingLanguage.g:7173:1: ')'
            {
             before(grammarAccess.getTypeCastExpressionAccess().getRightParenthesisKeyword_1_3()); 
            match(input,50,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:7186:1: rule__TypeCastExpression__Group_1__4 : rule__TypeCastExpression__Group_1__4__Impl ;
    public final void rule__TypeCastExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7190:1: ( rule__TypeCastExpression__Group_1__4__Impl )
            // InternalAPIMappingLanguage.g:7191:2: rule__TypeCastExpression__Group_1__4__Impl
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
    // InternalAPIMappingLanguage.g:7197:1: rule__TypeCastExpression__Group_1__4__Impl : ( ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 ) ) ;
    public final void rule__TypeCastExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7201:1: ( ( ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 ) ) )
            // InternalAPIMappingLanguage.g:7202:1: ( ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 ) )
            {
            // InternalAPIMappingLanguage.g:7202:1: ( ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 ) )
            // InternalAPIMappingLanguage.g:7203:1: ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 )
            {
             before(grammarAccess.getTypeCastExpressionAccess().getEnclosedExpressionAssignment_1_4()); 
            // InternalAPIMappingLanguage.g:7204:1: ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 )
            // InternalAPIMappingLanguage.g:7204:2: rule__TypeCastExpression__EnclosedExpressionAssignment_1_4
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
    // InternalAPIMappingLanguage.g:7224:1: rule__LiteralExpression__Group__0 : rule__LiteralExpression__Group__0__Impl rule__LiteralExpression__Group__1 ;
    public final void rule__LiteralExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7228:1: ( rule__LiteralExpression__Group__0__Impl rule__LiteralExpression__Group__1 )
            // InternalAPIMappingLanguage.g:7229:2: rule__LiteralExpression__Group__0__Impl rule__LiteralExpression__Group__1
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
    // InternalAPIMappingLanguage.g:7236:1: rule__LiteralExpression__Group__0__Impl : ( () ) ;
    public final void rule__LiteralExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7240:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:7241:1: ( () )
            {
            // InternalAPIMappingLanguage.g:7241:1: ( () )
            // InternalAPIMappingLanguage.g:7242:1: ()
            {
             before(grammarAccess.getLiteralExpressionAccess().getLiteralExpressionAction_0()); 
            // InternalAPIMappingLanguage.g:7243:1: ()
            // InternalAPIMappingLanguage.g:7245:1: 
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
    // InternalAPIMappingLanguage.g:7255:1: rule__LiteralExpression__Group__1 : rule__LiteralExpression__Group__1__Impl ;
    public final void rule__LiteralExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7259:1: ( rule__LiteralExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:7260:2: rule__LiteralExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:7266:1: rule__LiteralExpression__Group__1__Impl : ( ( rule__LiteralExpression__ValueAssignment_1 ) ) ;
    public final void rule__LiteralExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7270:1: ( ( ( rule__LiteralExpression__ValueAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:7271:1: ( ( rule__LiteralExpression__ValueAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:7271:1: ( ( rule__LiteralExpression__ValueAssignment_1 ) )
            // InternalAPIMappingLanguage.g:7272:1: ( rule__LiteralExpression__ValueAssignment_1 )
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueAssignment_1()); 
            // InternalAPIMappingLanguage.g:7273:1: ( rule__LiteralExpression__ValueAssignment_1 )
            // InternalAPIMappingLanguage.g:7273:2: rule__LiteralExpression__ValueAssignment_1
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
    // InternalAPIMappingLanguage.g:7287:1: rule__ExtendedTypedNamedElementExpression__Group__0 : rule__ExtendedTypedNamedElementExpression__Group__0__Impl rule__ExtendedTypedNamedElementExpression__Group__1 ;
    public final void rule__ExtendedTypedNamedElementExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7291:1: ( rule__ExtendedTypedNamedElementExpression__Group__0__Impl rule__ExtendedTypedNamedElementExpression__Group__1 )
            // InternalAPIMappingLanguage.g:7292:2: rule__ExtendedTypedNamedElementExpression__Group__0__Impl rule__ExtendedTypedNamedElementExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_50);
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
    // InternalAPIMappingLanguage.g:7299:1: rule__ExtendedTypedNamedElementExpression__Group__0__Impl : ( ruleTypedNamedElementExpression ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7303:1: ( ( ruleTypedNamedElementExpression ) )
            // InternalAPIMappingLanguage.g:7304:1: ( ruleTypedNamedElementExpression )
            {
            // InternalAPIMappingLanguage.g:7304:1: ( ruleTypedNamedElementExpression )
            // InternalAPIMappingLanguage.g:7305:1: ruleTypedNamedElementExpression
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
    // InternalAPIMappingLanguage.g:7316:1: rule__ExtendedTypedNamedElementExpression__Group__1 : rule__ExtendedTypedNamedElementExpression__Group__1__Impl ;
    public final void rule__ExtendedTypedNamedElementExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7320:1: ( rule__ExtendedTypedNamedElementExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:7321:2: rule__ExtendedTypedNamedElementExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:7327:1: rule__ExtendedTypedNamedElementExpression__Group__1__Impl : ( ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )? ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7331:1: ( ( ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )? ) )
            // InternalAPIMappingLanguage.g:7332:1: ( ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )? )
            {
            // InternalAPIMappingLanguage.g:7332:1: ( ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )? )
            // InternalAPIMappingLanguage.g:7333:1: ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )?
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getAlternatives_1()); 
            // InternalAPIMappingLanguage.g:7334:1: ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=17 && LA44_0<=18)||LA44_0==62) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAPIMappingLanguage.g:7334:2: rule__ExtendedTypedNamedElementExpression__Alternatives_1
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
    // InternalAPIMappingLanguage.g:7348:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__0 : rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__1 ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7352:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__1 )
            // InternalAPIMappingLanguage.g:7353:2: rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_51);
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
    // InternalAPIMappingLanguage.g:7360:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7364:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:7365:1: ( () )
            {
            // InternalAPIMappingLanguage.g:7365:1: ( () )
            // InternalAPIMappingLanguage.g:7366:1: ()
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getDiscreteInteractionEndpointReferenceTypedNamedElementExpressionAction_1_0_0()); 
            // InternalAPIMappingLanguage.g:7367:1: ()
            // InternalAPIMappingLanguage.g:7369:1: 
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
    // InternalAPIMappingLanguage.g:7379:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__1 : rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__2 ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7383:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__2 )
            // InternalAPIMappingLanguage.g:7384:2: rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_52);
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
    // InternalAPIMappingLanguage.g:7391:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl : ( '->' ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7395:1: ( ( '->' ) )
            // InternalAPIMappingLanguage.g:7396:1: ( '->' )
            {
            // InternalAPIMappingLanguage.g:7396:1: ( '->' )
            // InternalAPIMappingLanguage.g:7397:1: '->'
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_0_1()); 
            match(input,62,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:7410:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__2 : rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7414:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl )
            // InternalAPIMappingLanguage.g:7415:2: rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl
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
    // InternalAPIMappingLanguage.g:7421:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl : ( ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 ) ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7425:1: ( ( ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 ) ) )
            // InternalAPIMappingLanguage.g:7426:1: ( ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 ) )
            {
            // InternalAPIMappingLanguage.g:7426:1: ( ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 ) )
            // InternalAPIMappingLanguage.g:7427:1: ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 )
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getPositionAssignment_1_0_2()); 
            // InternalAPIMappingLanguage.g:7428:1: ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 )
            // InternalAPIMappingLanguage.g:7428:2: rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2
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
    // InternalAPIMappingLanguage.g:7444:1: rule__ExtendedTypedNamedElementExpression__Group_1_1__0 : rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_1__1 ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7448:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_1__1 )
            // InternalAPIMappingLanguage.g:7449:2: rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_50);
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
    // InternalAPIMappingLanguage.g:7456:1: rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7460:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:7461:1: ( () )
            {
            // InternalAPIMappingLanguage.g:7461:1: ( () )
            // InternalAPIMappingLanguage.g:7462:1: ()
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getAssignmentLhs_typedNamedElementExpressionAction_1_1_0()); 
            // InternalAPIMappingLanguage.g:7463:1: ()
            // InternalAPIMappingLanguage.g:7465:1: 
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
    // InternalAPIMappingLanguage.g:7475:1: rule__ExtendedTypedNamedElementExpression__Group_1_1__1 : rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7479:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl )
            // InternalAPIMappingLanguage.g:7480:2: rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl
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
    // InternalAPIMappingLanguage.g:7486:1: rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl : ( ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 ) ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7490:1: ( ( ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 ) ) )
            // InternalAPIMappingLanguage.g:7491:1: ( ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:7491:1: ( ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 ) )
            // InternalAPIMappingLanguage.g:7492:1: ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 )
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getIncrementDecrementOperatorAssignment_1_1_1()); 
            // InternalAPIMappingLanguage.g:7493:1: ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 )
            // InternalAPIMappingLanguage.g:7493:2: rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1
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
    // InternalAPIMappingLanguage.g:7507:1: rule__TypedNamedElementExpression__Group__0 : rule__TypedNamedElementExpression__Group__0__Impl rule__TypedNamedElementExpression__Group__1 ;
    public final void rule__TypedNamedElementExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7511:1: ( rule__TypedNamedElementExpression__Group__0__Impl rule__TypedNamedElementExpression__Group__1 )
            // InternalAPIMappingLanguage.g:7512:2: rule__TypedNamedElementExpression__Group__0__Impl rule__TypedNamedElementExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_53);
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
    // InternalAPIMappingLanguage.g:7519:1: rule__TypedNamedElementExpression__Group__0__Impl : ( ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 ) ) ;
    public final void rule__TypedNamedElementExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7523:1: ( ( ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:7524:1: ( ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:7524:1: ( ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 ) )
            // InternalAPIMappingLanguage.g:7525:1: ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 )
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementAssignment_0()); 
            // InternalAPIMappingLanguage.g:7526:1: ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 )
            // InternalAPIMappingLanguage.g:7526:2: rule__TypedNamedElementExpression__TypedNamedElementAssignment_0
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
    // InternalAPIMappingLanguage.g:7536:1: rule__TypedNamedElementExpression__Group__1 : rule__TypedNamedElementExpression__Group__1__Impl ;
    public final void rule__TypedNamedElementExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7540:1: ( rule__TypedNamedElementExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:7541:2: rule__TypedNamedElementExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:7547:1: rule__TypedNamedElementExpression__Group__1__Impl : ( ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )* ) ;
    public final void rule__TypedNamedElementExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7551:1: ( ( ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )* ) )
            // InternalAPIMappingLanguage.g:7552:1: ( ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )* )
            {
            // InternalAPIMappingLanguage.g:7552:1: ( ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )* )
            // InternalAPIMappingLanguage.g:7553:1: ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )*
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsAssignment_1()); 
            // InternalAPIMappingLanguage.g:7554:1: ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==52||LA45_0==60) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:7554:2: rule__TypedNamedElementExpression__ElementAccessorsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_54);
            	    rule__TypedNamedElementExpression__ElementAccessorsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalAPIMappingLanguage.g:7568:1: rule__ArrayIndexExpression__Group__0 : rule__ArrayIndexExpression__Group__0__Impl rule__ArrayIndexExpression__Group__1 ;
    public final void rule__ArrayIndexExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7572:1: ( rule__ArrayIndexExpression__Group__0__Impl rule__ArrayIndexExpression__Group__1 )
            // InternalAPIMappingLanguage.g:7573:2: rule__ArrayIndexExpression__Group__0__Impl rule__ArrayIndexExpression__Group__1
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
    // InternalAPIMappingLanguage.g:7580:1: rule__ArrayIndexExpression__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayIndexExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7584:1: ( ( '[' ) )
            // InternalAPIMappingLanguage.g:7585:1: ( '[' )
            {
            // InternalAPIMappingLanguage.g:7585:1: ( '[' )
            // InternalAPIMappingLanguage.g:7586:1: '['
            {
             before(grammarAccess.getArrayIndexExpressionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,60,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:7599:1: rule__ArrayIndexExpression__Group__1 : rule__ArrayIndexExpression__Group__1__Impl rule__ArrayIndexExpression__Group__2 ;
    public final void rule__ArrayIndexExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7603:1: ( rule__ArrayIndexExpression__Group__1__Impl rule__ArrayIndexExpression__Group__2 )
            // InternalAPIMappingLanguage.g:7604:2: rule__ArrayIndexExpression__Group__1__Impl rule__ArrayIndexExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_55);
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
    // InternalAPIMappingLanguage.g:7611:1: rule__ArrayIndexExpression__Group__1__Impl : ( ( rule__ArrayIndexExpression__IndexAssignment_1 ) ) ;
    public final void rule__ArrayIndexExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7615:1: ( ( ( rule__ArrayIndexExpression__IndexAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:7616:1: ( ( rule__ArrayIndexExpression__IndexAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:7616:1: ( ( rule__ArrayIndexExpression__IndexAssignment_1 ) )
            // InternalAPIMappingLanguage.g:7617:1: ( rule__ArrayIndexExpression__IndexAssignment_1 )
            {
             before(grammarAccess.getArrayIndexExpressionAccess().getIndexAssignment_1()); 
            // InternalAPIMappingLanguage.g:7618:1: ( rule__ArrayIndexExpression__IndexAssignment_1 )
            // InternalAPIMappingLanguage.g:7618:2: rule__ArrayIndexExpression__IndexAssignment_1
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
    // InternalAPIMappingLanguage.g:7628:1: rule__ArrayIndexExpression__Group__2 : rule__ArrayIndexExpression__Group__2__Impl ;
    public final void rule__ArrayIndexExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7632:1: ( rule__ArrayIndexExpression__Group__2__Impl )
            // InternalAPIMappingLanguage.g:7633:2: rule__ArrayIndexExpression__Group__2__Impl
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
    // InternalAPIMappingLanguage.g:7639:1: rule__ArrayIndexExpression__Group__2__Impl : ( ']' ) ;
    public final void rule__ArrayIndexExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7643:1: ( ( ']' ) )
            // InternalAPIMappingLanguage.g:7644:1: ( ']' )
            {
            // InternalAPIMappingLanguage.g:7644:1: ( ']' )
            // InternalAPIMappingLanguage.g:7645:1: ']'
            {
             before(grammarAccess.getArrayIndexExpressionAccess().getRightSquareBracketKeyword_2()); 
            match(input,61,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:7664:1: rule__AttributeAccessorExpression__Group__0 : rule__AttributeAccessorExpression__Group__0__Impl rule__AttributeAccessorExpression__Group__1 ;
    public final void rule__AttributeAccessorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7668:1: ( rule__AttributeAccessorExpression__Group__0__Impl rule__AttributeAccessorExpression__Group__1 )
            // InternalAPIMappingLanguage.g:7669:2: rule__AttributeAccessorExpression__Group__0__Impl rule__AttributeAccessorExpression__Group__1
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
    // InternalAPIMappingLanguage.g:7676:1: rule__AttributeAccessorExpression__Group__0__Impl : ( '.' ) ;
    public final void rule__AttributeAccessorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7680:1: ( ( '.' ) )
            // InternalAPIMappingLanguage.g:7681:1: ( '.' )
            {
            // InternalAPIMappingLanguage.g:7681:1: ( '.' )
            // InternalAPIMappingLanguage.g:7682:1: '.'
            {
             before(grammarAccess.getAttributeAccessorExpressionAccess().getFullStopKeyword_0()); 
            match(input,52,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:7695:1: rule__AttributeAccessorExpression__Group__1 : rule__AttributeAccessorExpression__Group__1__Impl ;
    public final void rule__AttributeAccessorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7699:1: ( rule__AttributeAccessorExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:7700:2: rule__AttributeAccessorExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:7706:1: rule__AttributeAccessorExpression__Group__1__Impl : ( ( rule__AttributeAccessorExpression__AttributeAssignment_1 ) ) ;
    public final void rule__AttributeAccessorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7710:1: ( ( ( rule__AttributeAccessorExpression__AttributeAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:7711:1: ( ( rule__AttributeAccessorExpression__AttributeAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:7711:1: ( ( rule__AttributeAccessorExpression__AttributeAssignment_1 ) )
            // InternalAPIMappingLanguage.g:7712:1: ( rule__AttributeAccessorExpression__AttributeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccessorExpressionAccess().getAttributeAssignment_1()); 
            // InternalAPIMappingLanguage.g:7713:1: ( rule__AttributeAccessorExpression__AttributeAssignment_1 )
            // InternalAPIMappingLanguage.g:7713:2: rule__AttributeAccessorExpression__AttributeAssignment_1
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
    // InternalAPIMappingLanguage.g:7727:1: rule__PositionSelectorExpression__Group__0 : rule__PositionSelectorExpression__Group__0__Impl rule__PositionSelectorExpression__Group__1 ;
    public final void rule__PositionSelectorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7731:1: ( rule__PositionSelectorExpression__Group__0__Impl rule__PositionSelectorExpression__Group__1 )
            // InternalAPIMappingLanguage.g:7732:2: rule__PositionSelectorExpression__Group__0__Impl rule__PositionSelectorExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_51);
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
    // InternalAPIMappingLanguage.g:7739:1: rule__PositionSelectorExpression__Group__0__Impl : ( ( rule__PositionSelectorExpression__KindAssignment_0 ) ) ;
    public final void rule__PositionSelectorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7743:1: ( ( ( rule__PositionSelectorExpression__KindAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:7744:1: ( ( rule__PositionSelectorExpression__KindAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:7744:1: ( ( rule__PositionSelectorExpression__KindAssignment_0 ) )
            // InternalAPIMappingLanguage.g:7745:1: ( rule__PositionSelectorExpression__KindAssignment_0 )
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getKindAssignment_0()); 
            // InternalAPIMappingLanguage.g:7746:1: ( rule__PositionSelectorExpression__KindAssignment_0 )
            // InternalAPIMappingLanguage.g:7746:2: rule__PositionSelectorExpression__KindAssignment_0
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
    // InternalAPIMappingLanguage.g:7756:1: rule__PositionSelectorExpression__Group__1 : rule__PositionSelectorExpression__Group__1__Impl ;
    public final void rule__PositionSelectorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7760:1: ( rule__PositionSelectorExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:7761:2: rule__PositionSelectorExpression__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:7767:1: rule__PositionSelectorExpression__Group__1__Impl : ( ( rule__PositionSelectorExpression__Group_1__0 )? ) ;
    public final void rule__PositionSelectorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7771:1: ( ( ( rule__PositionSelectorExpression__Group_1__0 )? ) )
            // InternalAPIMappingLanguage.g:7772:1: ( ( rule__PositionSelectorExpression__Group_1__0 )? )
            {
            // InternalAPIMappingLanguage.g:7772:1: ( ( rule__PositionSelectorExpression__Group_1__0 )? )
            // InternalAPIMappingLanguage.g:7773:1: ( rule__PositionSelectorExpression__Group_1__0 )?
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:7774:1: ( rule__PositionSelectorExpression__Group_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==62) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAPIMappingLanguage.g:7774:2: rule__PositionSelectorExpression__Group_1__0
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
    // InternalAPIMappingLanguage.g:7788:1: rule__PositionSelectorExpression__Group_1__0 : rule__PositionSelectorExpression__Group_1__0__Impl rule__PositionSelectorExpression__Group_1__1 ;
    public final void rule__PositionSelectorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7792:1: ( rule__PositionSelectorExpression__Group_1__0__Impl rule__PositionSelectorExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:7793:2: rule__PositionSelectorExpression__Group_1__0__Impl rule__PositionSelectorExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_52);
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
    // InternalAPIMappingLanguage.g:7800:1: rule__PositionSelectorExpression__Group_1__0__Impl : ( '->' ) ;
    public final void rule__PositionSelectorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7804:1: ( ( '->' ) )
            // InternalAPIMappingLanguage.g:7805:1: ( '->' )
            {
            // InternalAPIMappingLanguage.g:7805:1: ( '->' )
            // InternalAPIMappingLanguage.g:7806:1: '->'
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 
            match(input,62,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:7819:1: rule__PositionSelectorExpression__Group_1__1 : rule__PositionSelectorExpression__Group_1__1__Impl ;
    public final void rule__PositionSelectorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7823:1: ( rule__PositionSelectorExpression__Group_1__1__Impl )
            // InternalAPIMappingLanguage.g:7824:2: rule__PositionSelectorExpression__Group_1__1__Impl
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
    // InternalAPIMappingLanguage.g:7830:1: rule__PositionSelectorExpression__Group_1__1__Impl : ( ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 ) ) ;
    public final void rule__PositionSelectorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7834:1: ( ( ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 ) ) )
            // InternalAPIMappingLanguage.g:7835:1: ( ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:7835:1: ( ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 ) )
            // InternalAPIMappingLanguage.g:7836:1: ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 )
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getSuccessorAssignment_1_1()); 
            // InternalAPIMappingLanguage.g:7837:1: ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 )
            // InternalAPIMappingLanguage.g:7837:2: rule__PositionSelectorExpression__SuccessorAssignment_1_1
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
    // InternalAPIMappingLanguage.g:7851:1: rule__OperationCall__Group__0 : rule__OperationCall__Group__0__Impl rule__OperationCall__Group__1 ;
    public final void rule__OperationCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7855:1: ( rule__OperationCall__Group__0__Impl rule__OperationCall__Group__1 )
            // InternalAPIMappingLanguage.g:7856:2: rule__OperationCall__Group__0__Impl rule__OperationCall__Group__1
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
    // InternalAPIMappingLanguage.g:7863:1: rule__OperationCall__Group__0__Impl : ( ( rule__OperationCall__OperationAssignment_0 ) ) ;
    public final void rule__OperationCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7867:1: ( ( ( rule__OperationCall__OperationAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:7868:1: ( ( rule__OperationCall__OperationAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:7868:1: ( ( rule__OperationCall__OperationAssignment_0 ) )
            // InternalAPIMappingLanguage.g:7869:1: ( rule__OperationCall__OperationAssignment_0 )
            {
             before(grammarAccess.getOperationCallAccess().getOperationAssignment_0()); 
            // InternalAPIMappingLanguage.g:7870:1: ( rule__OperationCall__OperationAssignment_0 )
            // InternalAPIMappingLanguage.g:7870:2: rule__OperationCall__OperationAssignment_0
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
    // InternalAPIMappingLanguage.g:7880:1: rule__OperationCall__Group__1 : rule__OperationCall__Group__1__Impl rule__OperationCall__Group__2 ;
    public final void rule__OperationCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7884:1: ( rule__OperationCall__Group__1__Impl rule__OperationCall__Group__2 )
            // InternalAPIMappingLanguage.g:7885:2: rule__OperationCall__Group__1__Impl rule__OperationCall__Group__2
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
    // InternalAPIMappingLanguage.g:7892:1: rule__OperationCall__Group__1__Impl : ( '(' ) ;
    public final void rule__OperationCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7896:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:7897:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:7897:1: ( '(' )
            // InternalAPIMappingLanguage.g:7898:1: '('
            {
             before(grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,49,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:7911:1: rule__OperationCall__Group__2 : rule__OperationCall__Group__2__Impl rule__OperationCall__Group__3 ;
    public final void rule__OperationCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7915:1: ( rule__OperationCall__Group__2__Impl rule__OperationCall__Group__3 )
            // InternalAPIMappingLanguage.g:7916:2: rule__OperationCall__Group__2__Impl rule__OperationCall__Group__3
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
    // InternalAPIMappingLanguage.g:7923:1: rule__OperationCall__Group__2__Impl : ( ( rule__OperationCall__Group_2__0 )? ) ;
    public final void rule__OperationCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7927:1: ( ( ( rule__OperationCall__Group_2__0 )? ) )
            // InternalAPIMappingLanguage.g:7928:1: ( ( rule__OperationCall__Group_2__0 )? )
            {
            // InternalAPIMappingLanguage.g:7928:1: ( ( rule__OperationCall__Group_2__0 )? )
            // InternalAPIMappingLanguage.g:7929:1: ( rule__OperationCall__Group_2__0 )?
            {
             before(grammarAccess.getOperationCallAccess().getGroup_2()); 
            // InternalAPIMappingLanguage.g:7930:1: ( rule__OperationCall__Group_2__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAPIMappingLanguage.g:7930:2: rule__OperationCall__Group_2__0
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
    // InternalAPIMappingLanguage.g:7940:1: rule__OperationCall__Group__3 : rule__OperationCall__Group__3__Impl ;
    public final void rule__OperationCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7944:1: ( rule__OperationCall__Group__3__Impl )
            // InternalAPIMappingLanguage.g:7945:2: rule__OperationCall__Group__3__Impl
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
    // InternalAPIMappingLanguage.g:7951:1: rule__OperationCall__Group__3__Impl : ( ')' ) ;
    public final void rule__OperationCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7955:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:7956:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:7956:1: ( ')' )
            // InternalAPIMappingLanguage.g:7957:1: ')'
            {
             before(grammarAccess.getOperationCallAccess().getRightParenthesisKeyword_3()); 
            match(input,50,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:7978:1: rule__OperationCall__Group_2__0 : rule__OperationCall__Group_2__0__Impl rule__OperationCall__Group_2__1 ;
    public final void rule__OperationCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7982:1: ( rule__OperationCall__Group_2__0__Impl rule__OperationCall__Group_2__1 )
            // InternalAPIMappingLanguage.g:7983:2: rule__OperationCall__Group_2__0__Impl rule__OperationCall__Group_2__1
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
    // InternalAPIMappingLanguage.g:7990:1: rule__OperationCall__Group_2__0__Impl : ( ( rule__OperationCall__ParameterBindingAssignment_2_0 ) ) ;
    public final void rule__OperationCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7994:1: ( ( ( rule__OperationCall__ParameterBindingAssignment_2_0 ) ) )
            // InternalAPIMappingLanguage.g:7995:1: ( ( rule__OperationCall__ParameterBindingAssignment_2_0 ) )
            {
            // InternalAPIMappingLanguage.g:7995:1: ( ( rule__OperationCall__ParameterBindingAssignment_2_0 ) )
            // InternalAPIMappingLanguage.g:7996:1: ( rule__OperationCall__ParameterBindingAssignment_2_0 )
            {
             before(grammarAccess.getOperationCallAccess().getParameterBindingAssignment_2_0()); 
            // InternalAPIMappingLanguage.g:7997:1: ( rule__OperationCall__ParameterBindingAssignment_2_0 )
            // InternalAPIMappingLanguage.g:7997:2: rule__OperationCall__ParameterBindingAssignment_2_0
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
    // InternalAPIMappingLanguage.g:8007:1: rule__OperationCall__Group_2__1 : rule__OperationCall__Group_2__1__Impl ;
    public final void rule__OperationCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8011:1: ( rule__OperationCall__Group_2__1__Impl )
            // InternalAPIMappingLanguage.g:8012:2: rule__OperationCall__Group_2__1__Impl
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
    // InternalAPIMappingLanguage.g:8018:1: rule__OperationCall__Group_2__1__Impl : ( ( rule__OperationCall__Group_2_1__0 )* ) ;
    public final void rule__OperationCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8022:1: ( ( ( rule__OperationCall__Group_2_1__0 )* ) )
            // InternalAPIMappingLanguage.g:8023:1: ( ( rule__OperationCall__Group_2_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:8023:1: ( ( rule__OperationCall__Group_2_1__0 )* )
            // InternalAPIMappingLanguage.g:8024:1: ( rule__OperationCall__Group_2_1__0 )*
            {
             before(grammarAccess.getOperationCallAccess().getGroup_2_1()); 
            // InternalAPIMappingLanguage.g:8025:1: ( rule__OperationCall__Group_2_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==42) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:8025:2: rule__OperationCall__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__OperationCall__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // InternalAPIMappingLanguage.g:8039:1: rule__OperationCall__Group_2_1__0 : rule__OperationCall__Group_2_1__0__Impl rule__OperationCall__Group_2_1__1 ;
    public final void rule__OperationCall__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8043:1: ( rule__OperationCall__Group_2_1__0__Impl rule__OperationCall__Group_2_1__1 )
            // InternalAPIMappingLanguage.g:8044:2: rule__OperationCall__Group_2_1__0__Impl rule__OperationCall__Group_2_1__1
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
    // InternalAPIMappingLanguage.g:8051:1: rule__OperationCall__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__OperationCall__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8055:1: ( ( ',' ) )
            // InternalAPIMappingLanguage.g:8056:1: ( ',' )
            {
            // InternalAPIMappingLanguage.g:8056:1: ( ',' )
            // InternalAPIMappingLanguage.g:8057:1: ','
            {
             before(grammarAccess.getOperationCallAccess().getCommaKeyword_2_1_0()); 
            match(input,42,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:8070:1: rule__OperationCall__Group_2_1__1 : rule__OperationCall__Group_2_1__1__Impl ;
    public final void rule__OperationCall__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8074:1: ( rule__OperationCall__Group_2_1__1__Impl )
            // InternalAPIMappingLanguage.g:8075:2: rule__OperationCall__Group_2_1__1__Impl
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
    // InternalAPIMappingLanguage.g:8081:1: rule__OperationCall__Group_2_1__1__Impl : ( ( rule__OperationCall__ParameterBindingAssignment_2_1_1 ) ) ;
    public final void rule__OperationCall__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8085:1: ( ( ( rule__OperationCall__ParameterBindingAssignment_2_1_1 ) ) )
            // InternalAPIMappingLanguage.g:8086:1: ( ( rule__OperationCall__ParameterBindingAssignment_2_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:8086:1: ( ( rule__OperationCall__ParameterBindingAssignment_2_1_1 ) )
            // InternalAPIMappingLanguage.g:8087:1: ( rule__OperationCall__ParameterBindingAssignment_2_1_1 )
            {
             before(grammarAccess.getOperationCallAccess().getParameterBindingAssignment_2_1_1()); 
            // InternalAPIMappingLanguage.g:8088:1: ( rule__OperationCall__ParameterBindingAssignment_2_1_1 )
            // InternalAPIMappingLanguage.g:8088:2: rule__OperationCall__ParameterBindingAssignment_2_1_1
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
    // InternalAPIMappingLanguage.g:8103:1: rule__DATATYPE__Group__0 : rule__DATATYPE__Group__0__Impl rule__DATATYPE__Group__1 ;
    public final void rule__DATATYPE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8107:1: ( rule__DATATYPE__Group__0__Impl rule__DATATYPE__Group__1 )
            // InternalAPIMappingLanguage.g:8108:2: rule__DATATYPE__Group__0__Impl rule__DATATYPE__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_56);
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
    // InternalAPIMappingLanguage.g:8115:1: rule__DATATYPE__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__DATATYPE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8119:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:8120:1: ( RULE_ID )
            {
            // InternalAPIMappingLanguage.g:8120:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:8121:1: RULE_ID
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
    // InternalAPIMappingLanguage.g:8132:1: rule__DATATYPE__Group__1 : rule__DATATYPE__Group__1__Impl ;
    public final void rule__DATATYPE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8136:1: ( rule__DATATYPE__Group__1__Impl )
            // InternalAPIMappingLanguage.g:8137:2: rule__DATATYPE__Group__1__Impl
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
    // InternalAPIMappingLanguage.g:8143:1: rule__DATATYPE__Group__1__Impl : ( ( rule__DATATYPE__Group_1__0 )* ) ;
    public final void rule__DATATYPE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8147:1: ( ( ( rule__DATATYPE__Group_1__0 )* ) )
            // InternalAPIMappingLanguage.g:8148:1: ( ( rule__DATATYPE__Group_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:8148:1: ( ( rule__DATATYPE__Group_1__0 )* )
            // InternalAPIMappingLanguage.g:8149:1: ( rule__DATATYPE__Group_1__0 )*
            {
             before(grammarAccess.getDATATYPEAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:8150:1: ( rule__DATATYPE__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==60) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:8150:2: rule__DATATYPE__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_57);
            	    rule__DATATYPE__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalAPIMappingLanguage.g:8164:1: rule__DATATYPE__Group_1__0 : rule__DATATYPE__Group_1__0__Impl rule__DATATYPE__Group_1__1 ;
    public final void rule__DATATYPE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8168:1: ( rule__DATATYPE__Group_1__0__Impl rule__DATATYPE__Group_1__1 )
            // InternalAPIMappingLanguage.g:8169:2: rule__DATATYPE__Group_1__0__Impl rule__DATATYPE__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_35);
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
    // InternalAPIMappingLanguage.g:8176:1: rule__DATATYPE__Group_1__0__Impl : ( '[' ) ;
    public final void rule__DATATYPE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8180:1: ( ( '[' ) )
            // InternalAPIMappingLanguage.g:8181:1: ( '[' )
            {
            // InternalAPIMappingLanguage.g:8181:1: ( '[' )
            // InternalAPIMappingLanguage.g:8182:1: '['
            {
             before(grammarAccess.getDATATYPEAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,60,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:8195:1: rule__DATATYPE__Group_1__1 : rule__DATATYPE__Group_1__1__Impl rule__DATATYPE__Group_1__2 ;
    public final void rule__DATATYPE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8199:1: ( rule__DATATYPE__Group_1__1__Impl rule__DATATYPE__Group_1__2 )
            // InternalAPIMappingLanguage.g:8200:2: rule__DATATYPE__Group_1__1__Impl rule__DATATYPE__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_55);
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
    // InternalAPIMappingLanguage.g:8207:1: rule__DATATYPE__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DATATYPE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8211:1: ( ( RULE_INT ) )
            // InternalAPIMappingLanguage.g:8212:1: ( RULE_INT )
            {
            // InternalAPIMappingLanguage.g:8212:1: ( RULE_INT )
            // InternalAPIMappingLanguage.g:8213:1: RULE_INT
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
    // InternalAPIMappingLanguage.g:8224:1: rule__DATATYPE__Group_1__2 : rule__DATATYPE__Group_1__2__Impl ;
    public final void rule__DATATYPE__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8228:1: ( rule__DATATYPE__Group_1__2__Impl )
            // InternalAPIMappingLanguage.g:8229:2: rule__DATATYPE__Group_1__2__Impl
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
    // InternalAPIMappingLanguage.g:8235:1: rule__DATATYPE__Group_1__2__Impl : ( ']' ) ;
    public final void rule__DATATYPE__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8239:1: ( ( ']' ) )
            // InternalAPIMappingLanguage.g:8240:1: ( ']' )
            {
            // InternalAPIMappingLanguage.g:8240:1: ( ']' )
            // InternalAPIMappingLanguage.g:8241:1: ']'
            {
             before(grammarAccess.getDATATYPEAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,61,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:8261:1: rule__MappingRepository__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__MappingRepository__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8265:1: ( ( ruleImport ) )
            // InternalAPIMappingLanguage.g:8266:1: ( ruleImport )
            {
            // InternalAPIMappingLanguage.g:8266:1: ( ruleImport )
            // InternalAPIMappingLanguage.g:8267:1: ruleImport
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
    // InternalAPIMappingLanguage.g:8276:1: rule__MappingRepository__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__MappingRepository__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8280:1: ( ( ruleEString ) )
            // InternalAPIMappingLanguage.g:8281:1: ( ruleEString )
            {
            // InternalAPIMappingLanguage.g:8281:1: ( ruleEString )
            // InternalAPIMappingLanguage.g:8282:1: ruleEString
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
    // InternalAPIMappingLanguage.g:8291:1: rule__MappingRepository__PortApiMappingsAssignment_4_0 : ( rulePortApiMapping ) ;
    public final void rule__MappingRepository__PortApiMappingsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8295:1: ( ( rulePortApiMapping ) )
            // InternalAPIMappingLanguage.g:8296:1: ( rulePortApiMapping )
            {
            // InternalAPIMappingLanguage.g:8296:1: ( rulePortApiMapping )
            // InternalAPIMappingLanguage.g:8297:1: rulePortApiMapping
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
    // InternalAPIMappingLanguage.g:8306:1: rule__MappingRepository__PortApiMappingsAssignment_4_1_1 : ( rulePortApiMapping ) ;
    public final void rule__MappingRepository__PortApiMappingsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8310:1: ( ( rulePortApiMapping ) )
            // InternalAPIMappingLanguage.g:8311:1: ( rulePortApiMapping )
            {
            // InternalAPIMappingLanguage.g:8311:1: ( rulePortApiMapping )
            // InternalAPIMappingLanguage.g:8312:1: rulePortApiMapping
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
    // InternalAPIMappingLanguage.g:8321:1: rule__MappingRepository__CommentAssignment_6_1 : ( ruleEString ) ;
    public final void rule__MappingRepository__CommentAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8325:1: ( ( ruleEString ) )
            // InternalAPIMappingLanguage.g:8326:1: ( ruleEString )
            {
            // InternalAPIMappingLanguage.g:8326:1: ( ruleEString )
            // InternalAPIMappingLanguage.g:8327:1: ruleEString
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
    // InternalAPIMappingLanguage.g:8336:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8340:1: ( ( RULE_STRING ) )
            // InternalAPIMappingLanguage.g:8341:1: ( RULE_STRING )
            {
            // InternalAPIMappingLanguage.g:8341:1: ( RULE_STRING )
            // InternalAPIMappingLanguage.g:8342:1: RULE_STRING
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
    // InternalAPIMappingLanguage.g:8351:1: rule__PortApiMapping__PortAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__PortApiMapping__PortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8355:1: ( ( ( ruleEString ) ) )
            // InternalAPIMappingLanguage.g:8356:1: ( ( ruleEString ) )
            {
            // InternalAPIMappingLanguage.g:8356:1: ( ( ruleEString ) )
            // InternalAPIMappingLanguage.g:8357:1: ( ruleEString )
            {
             before(grammarAccess.getPortApiMappingAccess().getPortContinuousPortInstanceCrossReference_1_0()); 
            // InternalAPIMappingLanguage.g:8358:1: ( ruleEString )
            // InternalAPIMappingLanguage.g:8359:1: ruleEString
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
    // InternalAPIMappingLanguage.g:8370:1: rule__PortApiMapping__ExecCommandAssignment_4 : ( ruleEntry ) ;
    public final void rule__PortApiMapping__ExecCommandAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8374:1: ( ( ruleEntry ) )
            // InternalAPIMappingLanguage.g:8375:1: ( ruleEntry )
            {
            // InternalAPIMappingLanguage.g:8375:1: ( ruleEntry )
            // InternalAPIMappingLanguage.g:8376:1: ruleEntry
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
    // InternalAPIMappingLanguage.g:8385:1: rule__PortApiMapping__InitCommandAssignment_5_1 : ( ruleEntry ) ;
    public final void rule__PortApiMapping__InitCommandAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8389:1: ( ( ruleEntry ) )
            // InternalAPIMappingLanguage.g:8390:1: ( ruleEntry )
            {
            // InternalAPIMappingLanguage.g:8390:1: ( ruleEntry )
            // InternalAPIMappingLanguage.g:8391:1: ruleEntry
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
    // InternalAPIMappingLanguage.g:8400:1: rule__EnumerationValueExpression__EnumValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EnumerationValueExpression__EnumValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8404:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:8405:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:8405:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:8406:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumerationValueExpressionAccess().getEnumValueEnumerationValueCrossReference_1_0()); 
            // InternalAPIMappingLanguage.g:8407:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:8408:1: RULE_ID
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
    // InternalAPIMappingLanguage.g:8419:1: rule__APICallExpression__ApiCommandAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__APICallExpression__ApiCommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8423:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:8424:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:8424:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:8425:1: ( RULE_ID )
            {
             before(grammarAccess.getAPICallExpressionAccess().getApiCommandAPICommandCrossReference_0_0()); 
            // InternalAPIMappingLanguage.g:8426:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:8427:1: RULE_ID
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
    // InternalAPIMappingLanguage.g:8438:1: rule__APICallExpression__ParameterBindingsAssignment_2_0 : ( ruleParamaterBinding ) ;
    public final void rule__APICallExpression__ParameterBindingsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8442:1: ( ( ruleParamaterBinding ) )
            // InternalAPIMappingLanguage.g:8443:1: ( ruleParamaterBinding )
            {
            // InternalAPIMappingLanguage.g:8443:1: ( ruleParamaterBinding )
            // InternalAPIMappingLanguage.g:8444:1: ruleParamaterBinding
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
    // InternalAPIMappingLanguage.g:8453:1: rule__APICallExpression__ParameterBindingsAssignment_2_1_1 : ( ruleParamaterBinding ) ;
    public final void rule__APICallExpression__ParameterBindingsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8457:1: ( ( ruleParamaterBinding ) )
            // InternalAPIMappingLanguage.g:8458:1: ( ruleParamaterBinding )
            {
            // InternalAPIMappingLanguage.g:8458:1: ( ruleParamaterBinding )
            // InternalAPIMappingLanguage.g:8459:1: ruleParamaterBinding
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
    // InternalAPIMappingLanguage.g:8468:1: rule__ParamaterBinding__ParameterAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParamaterBinding__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8472:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:8473:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:8473:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:8474:1: ( RULE_ID )
            {
             before(grammarAccess.getParamaterBindingAccess().getParameterParameterCrossReference_1_0()); 
            // InternalAPIMappingLanguage.g:8475:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:8476:1: RULE_ID
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
    // InternalAPIMappingLanguage.g:8487:1: rule__ParamaterBinding__ValueAssignment_3 : ( ( rule__ParamaterBinding__ValueAlternatives_3_0 ) ) ;
    public final void rule__ParamaterBinding__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8491:1: ( ( ( rule__ParamaterBinding__ValueAlternatives_3_0 ) ) )
            // InternalAPIMappingLanguage.g:8492:1: ( ( rule__ParamaterBinding__ValueAlternatives_3_0 ) )
            {
            // InternalAPIMappingLanguage.g:8492:1: ( ( rule__ParamaterBinding__ValueAlternatives_3_0 ) )
            // InternalAPIMappingLanguage.g:8493:1: ( rule__ParamaterBinding__ValueAlternatives_3_0 )
            {
             before(grammarAccess.getParamaterBindingAccess().getValueAlternatives_3_0()); 
            // InternalAPIMappingLanguage.g:8494:1: ( rule__ParamaterBinding__ValueAlternatives_3_0 )
            // InternalAPIMappingLanguage.g:8494:2: rule__ParamaterBinding__ValueAlternatives_3_0
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
    // InternalAPIMappingLanguage.g:8504:1: rule__Block__ExpressionsAssignment_2 : ( ruleExpressionStartRule ) ;
    public final void rule__Block__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8508:1: ( ( ruleExpressionStartRule ) )
            // InternalAPIMappingLanguage.g:8509:1: ( ruleExpressionStartRule )
            {
            // InternalAPIMappingLanguage.g:8509:1: ( ruleExpressionStartRule )
            // InternalAPIMappingLanguage.g:8510:1: ruleExpressionStartRule
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
    // InternalAPIMappingLanguage.g:8519:1: rule__ForLoop__InitializeExpressionAssignment_2 : ( ruleAssignment ) ;
    public final void rule__ForLoop__InitializeExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8523:1: ( ( ruleAssignment ) )
            // InternalAPIMappingLanguage.g:8524:1: ( ruleAssignment )
            {
            // InternalAPIMappingLanguage.g:8524:1: ( ruleAssignment )
            // InternalAPIMappingLanguage.g:8525:1: ruleAssignment
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
    // InternalAPIMappingLanguage.g:8534:1: rule__ForLoop__LoopTestAssignment_3 : ( ruleExpression ) ;
    public final void rule__ForLoop__LoopTestAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8538:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:8539:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:8539:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:8540:1: ruleExpression
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
    // InternalAPIMappingLanguage.g:8549:1: rule__ForLoop__CountingExpressionAssignment_5 : ( ruleForLoopCountingExpression ) ;
    public final void rule__ForLoop__CountingExpressionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8553:1: ( ( ruleForLoopCountingExpression ) )
            // InternalAPIMappingLanguage.g:8554:1: ( ruleForLoopCountingExpression )
            {
            // InternalAPIMappingLanguage.g:8554:1: ( ruleForLoopCountingExpression )
            // InternalAPIMappingLanguage.g:8555:1: ruleForLoopCountingExpression
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
    // InternalAPIMappingLanguage.g:8564:1: rule__ForLoop__BlockAssignment_7 : ( ruleBlock ) ;
    public final void rule__ForLoop__BlockAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8568:1: ( ( ruleBlock ) )
            // InternalAPIMappingLanguage.g:8569:1: ( ruleBlock )
            {
            // InternalAPIMappingLanguage.g:8569:1: ( ruleBlock )
            // InternalAPIMappingLanguage.g:8570:1: ruleBlock
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
    // InternalAPIMappingLanguage.g:8579:1: rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 : ( ruleTypedNamedElementExpression ) ;
    public final void rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8583:1: ( ( ruleTypedNamedElementExpression ) )
            // InternalAPIMappingLanguage.g:8584:1: ( ruleTypedNamedElementExpression )
            {
            // InternalAPIMappingLanguage.g:8584:1: ( ruleTypedNamedElementExpression )
            // InternalAPIMappingLanguage.g:8585:1: ruleTypedNamedElementExpression
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
    // InternalAPIMappingLanguage.g:8594:1: rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 : ( ruleUnaryPostIncrementDecrementOperator ) ;
    public final void rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8598:1: ( ( ruleUnaryPostIncrementDecrementOperator ) )
            // InternalAPIMappingLanguage.g:8599:1: ( ruleUnaryPostIncrementDecrementOperator )
            {
            // InternalAPIMappingLanguage.g:8599:1: ( ruleUnaryPostIncrementDecrementOperator )
            // InternalAPIMappingLanguage.g:8600:1: ruleUnaryPostIncrementDecrementOperator
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
    // InternalAPIMappingLanguage.g:8609:1: rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 : ( ruleAssignOperator ) ;
    public final void rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8613:1: ( ( ruleAssignOperator ) )
            // InternalAPIMappingLanguage.g:8614:1: ( ruleAssignOperator )
            {
            // InternalAPIMappingLanguage.g:8614:1: ( ruleAssignOperator )
            // InternalAPIMappingLanguage.g:8615:1: ruleAssignOperator
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
    // InternalAPIMappingLanguage.g:8624:1: rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 : ( ruleExpression ) ;
    public final void rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8628:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:8629:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:8629:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:8630:1: ruleExpression
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
    // InternalAPIMappingLanguage.g:8639:1: rule__WhileLoop__LoopTestAssignment_2 : ( ruleExpression ) ;
    public final void rule__WhileLoop__LoopTestAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8643:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:8644:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:8644:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:8645:1: ruleExpression
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
    // InternalAPIMappingLanguage.g:8654:1: rule__WhileLoop__BlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__WhileLoop__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8658:1: ( ( ruleBlock ) )
            // InternalAPIMappingLanguage.g:8659:1: ( ruleBlock )
            {
            // InternalAPIMappingLanguage.g:8659:1: ( ruleBlock )
            // InternalAPIMappingLanguage.g:8660:1: ruleBlock
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
    // InternalAPIMappingLanguage.g:8669:1: rule__DoWhileLoop__BlockAssignment_1 : ( ruleBlock ) ;
    public final void rule__DoWhileLoop__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8673:1: ( ( ruleBlock ) )
            // InternalAPIMappingLanguage.g:8674:1: ( ruleBlock )
            {
            // InternalAPIMappingLanguage.g:8674:1: ( ruleBlock )
            // InternalAPIMappingLanguage.g:8675:1: ruleBlock
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
    // InternalAPIMappingLanguage.g:8684:1: rule__DoWhileLoop__LoopTestAssignment_4 : ( ruleExpression ) ;
    public final void rule__DoWhileLoop__LoopTestAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8688:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:8689:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:8689:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:8690:1: ruleExpression
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
    // InternalAPIMappingLanguage.g:8699:1: rule__IfStatement__IfConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__IfStatement__IfConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8703:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:8704:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:8704:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:8705:1: ruleExpression
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
    // InternalAPIMappingLanguage.g:8714:1: rule__IfStatement__IfBlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__IfStatement__IfBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8718:1: ( ( ruleBlock ) )
            // InternalAPIMappingLanguage.g:8719:1: ( ruleBlock )
            {
            // InternalAPIMappingLanguage.g:8719:1: ( ruleBlock )
            // InternalAPIMappingLanguage.g:8720:1: ruleBlock
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
    // InternalAPIMappingLanguage.g:8729:1: rule__IfStatement__ElseIfStatementsAssignment_5 : ( ruleElseIfStatement ) ;
    public final void rule__IfStatement__ElseIfStatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8733:1: ( ( ruleElseIfStatement ) )
            // InternalAPIMappingLanguage.g:8734:1: ( ruleElseIfStatement )
            {
            // InternalAPIMappingLanguage.g:8734:1: ( ruleElseIfStatement )
            // InternalAPIMappingLanguage.g:8735:1: ruleElseIfStatement
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
    // InternalAPIMappingLanguage.g:8744:1: rule__IfStatement__ElseBlockAssignment_6_1 : ( ruleBlock ) ;
    public final void rule__IfStatement__ElseBlockAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8748:1: ( ( ruleBlock ) )
            // InternalAPIMappingLanguage.g:8749:1: ( ruleBlock )
            {
            // InternalAPIMappingLanguage.g:8749:1: ( ruleBlock )
            // InternalAPIMappingLanguage.g:8750:1: ruleBlock
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
    // InternalAPIMappingLanguage.g:8759:1: rule__ElseIfStatement__ElseIfConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__ElseIfStatement__ElseIfConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8763:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:8764:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:8764:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:8765:1: ruleExpression
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
    // InternalAPIMappingLanguage.g:8774:1: rule__ElseIfStatement__ElseIfBlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__ElseIfStatement__ElseIfBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8778:1: ( ( ruleBlock ) )
            // InternalAPIMappingLanguage.g:8779:1: ( ruleBlock )
            {
            // InternalAPIMappingLanguage.g:8779:1: ( ruleBlock )
            // InternalAPIMappingLanguage.g:8780:1: ruleBlock
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
    // InternalAPIMappingLanguage.g:8790:1: rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 : ( ruleTypedNamedElementExpression ) ;
    public final void rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8794:1: ( ( ruleTypedNamedElementExpression ) )
            // InternalAPIMappingLanguage.g:8795:1: ( ruleTypedNamedElementExpression )
            {
            // InternalAPIMappingLanguage.g:8795:1: ( ruleTypedNamedElementExpression )
            // InternalAPIMappingLanguage.g:8796:1: ruleTypedNamedElementExpression
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
    // InternalAPIMappingLanguage.g:8805:1: rule__Assignment__AssignOperatorAssignment_1_0_0 : ( ruleAssignOperator ) ;
    public final void rule__Assignment__AssignOperatorAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8809:1: ( ( ruleAssignOperator ) )
            // InternalAPIMappingLanguage.g:8810:1: ( ruleAssignOperator )
            {
            // InternalAPIMappingLanguage.g:8810:1: ( ruleAssignOperator )
            // InternalAPIMappingLanguage.g:8811:1: ruleAssignOperator
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
    // InternalAPIMappingLanguage.g:8820:1: rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 : ( ruleInitializeExpression ) ;
    public final void rule__Assignment__Rhs_assignExpressionAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8824:1: ( ( ruleInitializeExpression ) )
            // InternalAPIMappingLanguage.g:8825:1: ( ruleInitializeExpression )
            {
            // InternalAPIMappingLanguage.g:8825:1: ( ruleInitializeExpression )
            // InternalAPIMappingLanguage.g:8826:1: ruleInitializeExpression
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
    // InternalAPIMappingLanguage.g:8835:1: rule__Assignment__IncrementDecrementOperatorAssignment_1_1 : ( ruleUnaryPostIncrementDecrementOperator ) ;
    public final void rule__Assignment__IncrementDecrementOperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8839:1: ( ( ruleUnaryPostIncrementDecrementOperator ) )
            // InternalAPIMappingLanguage.g:8840:1: ( ruleUnaryPostIncrementDecrementOperator )
            {
            // InternalAPIMappingLanguage.g:8840:1: ( ruleUnaryPostIncrementDecrementOperator )
            // InternalAPIMappingLanguage.g:8841:1: ruleUnaryPostIncrementDecrementOperator
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
    // InternalAPIMappingLanguage.g:8850:1: rule__ArrayInitializeExpression__ExpressionsAssignment_1 : ( ruleInitializeExpression ) ;
    public final void rule__ArrayInitializeExpression__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8854:1: ( ( ruleInitializeExpression ) )
            // InternalAPIMappingLanguage.g:8855:1: ( ruleInitializeExpression )
            {
            // InternalAPIMappingLanguage.g:8855:1: ( ruleInitializeExpression )
            // InternalAPIMappingLanguage.g:8856:1: ruleInitializeExpression
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
    // InternalAPIMappingLanguage.g:8865:1: rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 : ( ruleInitializeExpression ) ;
    public final void rule__ArrayInitializeExpression__ExpressionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8869:1: ( ( ruleInitializeExpression ) )
            // InternalAPIMappingLanguage.g:8870:1: ( ruleInitializeExpression )
            {
            // InternalAPIMappingLanguage.g:8870:1: ( ruleInitializeExpression )
            // InternalAPIMappingLanguage.g:8871:1: ruleInitializeExpression
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
    // InternalAPIMappingLanguage.g:8880:1: rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment : ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 ) ) ;
    public final void rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8884:1: ( ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 ) ) )
            // InternalAPIMappingLanguage.g:8885:1: ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 ) )
            {
            // InternalAPIMappingLanguage.g:8885:1: ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 ) )
            // InternalAPIMappingLanguage.g:8886:1: ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 )
            {
             before(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableAlternatives_0()); 
            // InternalAPIMappingLanguage.g:8887:1: ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 )
            // InternalAPIMappingLanguage.g:8887:2: rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0
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
    // InternalAPIMappingLanguage.g:8896:1: rule__LocalVariableDeclaration__DataTypeAssignment_0 : ( ( ruleDATATYPE ) ) ;
    public final void rule__LocalVariableDeclaration__DataTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8900:1: ( ( ( ruleDATATYPE ) ) )
            // InternalAPIMappingLanguage.g:8901:1: ( ( ruleDATATYPE ) )
            {
            // InternalAPIMappingLanguage.g:8901:1: ( ( ruleDATATYPE ) )
            // InternalAPIMappingLanguage.g:8902:1: ( ruleDATATYPE )
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getDataTypeDataTypeCrossReference_0_0()); 
            // InternalAPIMappingLanguage.g:8903:1: ( ruleDATATYPE )
            // InternalAPIMappingLanguage.g:8904:1: ruleDATATYPE
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
    // InternalAPIMappingLanguage.g:8915:1: rule__LocalVariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LocalVariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8919:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:8920:1: ( RULE_ID )
            {
            // InternalAPIMappingLanguage.g:8920:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:8921:1: RULE_ID
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
    // InternalAPIMappingLanguage.g:8930:1: rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 : ( ruleInitializeExpression ) ;
    public final void rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8934:1: ( ( ruleInitializeExpression ) )
            // InternalAPIMappingLanguage.g:8935:1: ( ruleInitializeExpression )
            {
            // InternalAPIMappingLanguage.g:8935:1: ( ruleInitializeExpression )
            // InternalAPIMappingLanguage.g:8936:1: ruleInitializeExpression
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
    // InternalAPIMappingLanguage.g:8945:1: rule__LocalConstantDeclaration__ConstantAssignment_0 : ( ( 'const' ) ) ;
    public final void rule__LocalConstantDeclaration__ConstantAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8949:1: ( ( ( 'const' ) ) )
            // InternalAPIMappingLanguage.g:8950:1: ( ( 'const' ) )
            {
            // InternalAPIMappingLanguage.g:8950:1: ( ( 'const' ) )
            // InternalAPIMappingLanguage.g:8951:1: ( 'const' )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getConstantConstKeyword_0_0()); 
            // InternalAPIMappingLanguage.g:8952:1: ( 'const' )
            // InternalAPIMappingLanguage.g:8953:1: 'const'
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getConstantConstKeyword_0_0()); 
            match(input,63,FollowSets000.FOLLOW_2); 
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
    // InternalAPIMappingLanguage.g:8968:1: rule__LocalConstantDeclaration__DataTypeAssignment_1 : ( ( ruleDATATYPE ) ) ;
    public final void rule__LocalConstantDeclaration__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8972:1: ( ( ( ruleDATATYPE ) ) )
            // InternalAPIMappingLanguage.g:8973:1: ( ( ruleDATATYPE ) )
            {
            // InternalAPIMappingLanguage.g:8973:1: ( ( ruleDATATYPE ) )
            // InternalAPIMappingLanguage.g:8974:1: ( ruleDATATYPE )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getDataTypeDataTypeCrossReference_1_0()); 
            // InternalAPIMappingLanguage.g:8975:1: ( ruleDATATYPE )
            // InternalAPIMappingLanguage.g:8976:1: ruleDATATYPE
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
    // InternalAPIMappingLanguage.g:8987:1: rule__LocalConstantDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LocalConstantDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8991:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:8992:1: ( RULE_ID )
            {
            // InternalAPIMappingLanguage.g:8992:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:8993:1: RULE_ID
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
    // InternalAPIMappingLanguage.g:9002:1: rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 : ( ruleInitializeExpression ) ;
    public final void rule__LocalConstantDeclaration__InitializeExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9006:1: ( ( ruleInitializeExpression ) )
            // InternalAPIMappingLanguage.g:9007:1: ( ruleInitializeExpression )
            {
            // InternalAPIMappingLanguage.g:9007:1: ( ruleInitializeExpression )
            // InternalAPIMappingLanguage.g:9008:1: ruleInitializeExpression
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
    // InternalAPIMappingLanguage.g:9017:1: rule__NondeterministicChoiceExpression__DataTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NondeterministicChoiceExpression__DataTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9021:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:9022:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:9022:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:9023:1: ( RULE_ID )
            {
             before(grammarAccess.getNondeterministicChoiceExpressionAccess().getDataTypePrimitiveDataTypeCrossReference_0_0()); 
            // InternalAPIMappingLanguage.g:9024:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:9025:1: RULE_ID
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
    // InternalAPIMappingLanguage.g:9036:1: rule__NondeterministicChoiceExpression__RangeAssignment_1 : ( ruleRange ) ;
    public final void rule__NondeterministicChoiceExpression__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9040:1: ( ( ruleRange ) )
            // InternalAPIMappingLanguage.g:9041:1: ( ruleRange )
            {
            // InternalAPIMappingLanguage.g:9041:1: ( ruleRange )
            // InternalAPIMappingLanguage.g:9042:1: ruleRange
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
    // InternalAPIMappingLanguage.g:9051:1: rule__Range__LowerBoundAssignment_1 : ( ruleLONG ) ;
    public final void rule__Range__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9055:1: ( ( ruleLONG ) )
            // InternalAPIMappingLanguage.g:9056:1: ( ruleLONG )
            {
            // InternalAPIMappingLanguage.g:9056:1: ( ruleLONG )
            // InternalAPIMappingLanguage.g:9057:1: ruleLONG
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
    // InternalAPIMappingLanguage.g:9066:1: rule__Range__UpperBoundAssignment_3 : ( ruleLONG ) ;
    public final void rule__Range__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9070:1: ( ( ruleLONG ) )
            // InternalAPIMappingLanguage.g:9071:1: ( ruleLONG )
            {
            // InternalAPIMappingLanguage.g:9071:1: ( ruleLONG )
            // InternalAPIMappingLanguage.g:9072:1: ruleLONG
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
    // InternalAPIMappingLanguage.g:9081:1: rule__LogicalOrExpression__OperatorAssignment_1_1 : ( ruleLogicalOrOperator ) ;
    public final void rule__LogicalOrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9085:1: ( ( ruleLogicalOrOperator ) )
            // InternalAPIMappingLanguage.g:9086:1: ( ruleLogicalOrOperator )
            {
            // InternalAPIMappingLanguage.g:9086:1: ( ruleLogicalOrOperator )
            // InternalAPIMappingLanguage.g:9087:1: ruleLogicalOrOperator
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
    // InternalAPIMappingLanguage.g:9096:1: rule__LogicalOrExpression__RightExpressionAssignment_1_2 : ( ruleLogicalAndExpression ) ;
    public final void rule__LogicalOrExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9100:1: ( ( ruleLogicalAndExpression ) )
            // InternalAPIMappingLanguage.g:9101:1: ( ruleLogicalAndExpression )
            {
            // InternalAPIMappingLanguage.g:9101:1: ( ruleLogicalAndExpression )
            // InternalAPIMappingLanguage.g:9102:1: ruleLogicalAndExpression
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
    // InternalAPIMappingLanguage.g:9111:1: rule__LogicalAndExpression__OperatorAssignment_1_1 : ( ruleLogicalAndOperator ) ;
    public final void rule__LogicalAndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9115:1: ( ( ruleLogicalAndOperator ) )
            // InternalAPIMappingLanguage.g:9116:1: ( ruleLogicalAndOperator )
            {
            // InternalAPIMappingLanguage.g:9116:1: ( ruleLogicalAndOperator )
            // InternalAPIMappingLanguage.g:9117:1: ruleLogicalAndOperator
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
    // InternalAPIMappingLanguage.g:9126:1: rule__LogicalAndExpression__RightExpressionAssignment_1_2 : ( ruleComparisonExpression ) ;
    public final void rule__LogicalAndExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9130:1: ( ( ruleComparisonExpression ) )
            // InternalAPIMappingLanguage.g:9131:1: ( ruleComparisonExpression )
            {
            // InternalAPIMappingLanguage.g:9131:1: ( ruleComparisonExpression )
            // InternalAPIMappingLanguage.g:9132:1: ruleComparisonExpression
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
    // InternalAPIMappingLanguage.g:9141:1: rule__ComparisonExpression__OperatorAssignment_1_1 : ( ruleComparingEQNEQOperator ) ;
    public final void rule__ComparisonExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9145:1: ( ( ruleComparingEQNEQOperator ) )
            // InternalAPIMappingLanguage.g:9146:1: ( ruleComparingEQNEQOperator )
            {
            // InternalAPIMappingLanguage.g:9146:1: ( ruleComparingEQNEQOperator )
            // InternalAPIMappingLanguage.g:9147:1: ruleComparingEQNEQOperator
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
    // InternalAPIMappingLanguage.g:9156:1: rule__ComparisonExpression__RightExpressionAssignment_1_2 : ( ruleComparisonHigherOpExpression ) ;
    public final void rule__ComparisonExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9160:1: ( ( ruleComparisonHigherOpExpression ) )
            // InternalAPIMappingLanguage.g:9161:1: ( ruleComparisonHigherOpExpression )
            {
            // InternalAPIMappingLanguage.g:9161:1: ( ruleComparisonHigherOpExpression )
            // InternalAPIMappingLanguage.g:9162:1: ruleComparisonHigherOpExpression
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
    // InternalAPIMappingLanguage.g:9171:1: rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 : ( ruleComparingRelOperator ) ;
    public final void rule__ComparisonHigherOpExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9175:1: ( ( ruleComparingRelOperator ) )
            // InternalAPIMappingLanguage.g:9176:1: ( ruleComparingRelOperator )
            {
            // InternalAPIMappingLanguage.g:9176:1: ( ruleComparingRelOperator )
            // InternalAPIMappingLanguage.g:9177:1: ruleComparingRelOperator
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
    // InternalAPIMappingLanguage.g:9186:1: rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 : ( ruleArithmeticExpression ) ;
    public final void rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9190:1: ( ( ruleArithmeticExpression ) )
            // InternalAPIMappingLanguage.g:9191:1: ( ruleArithmeticExpression )
            {
            // InternalAPIMappingLanguage.g:9191:1: ( ruleArithmeticExpression )
            // InternalAPIMappingLanguage.g:9192:1: ruleArithmeticExpression
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
    // InternalAPIMappingLanguage.g:9201:1: rule__AdditionExpression__OperatorAssignment_1_1 : ( ruleAdditionOperator ) ;
    public final void rule__AdditionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9205:1: ( ( ruleAdditionOperator ) )
            // InternalAPIMappingLanguage.g:9206:1: ( ruleAdditionOperator )
            {
            // InternalAPIMappingLanguage.g:9206:1: ( ruleAdditionOperator )
            // InternalAPIMappingLanguage.g:9207:1: ruleAdditionOperator
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
    // InternalAPIMappingLanguage.g:9216:1: rule__AdditionExpression__RightExpressionAssignment_1_2 : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9220:1: ( ( ruleMultiplicationExpression ) )
            // InternalAPIMappingLanguage.g:9221:1: ( ruleMultiplicationExpression )
            {
            // InternalAPIMappingLanguage.g:9221:1: ( ruleMultiplicationExpression )
            // InternalAPIMappingLanguage.g:9222:1: ruleMultiplicationExpression
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
    // InternalAPIMappingLanguage.g:9231:1: rule__MultiplicationExpression__OperatorAssignment_1_1_1 : ( ruleMultiplicationOperator ) ;
    public final void rule__MultiplicationExpression__OperatorAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9235:1: ( ( ruleMultiplicationOperator ) )
            // InternalAPIMappingLanguage.g:9236:1: ( ruleMultiplicationOperator )
            {
            // InternalAPIMappingLanguage.g:9236:1: ( ruleMultiplicationOperator )
            // InternalAPIMappingLanguage.g:9237:1: ruleMultiplicationOperator
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
    // InternalAPIMappingLanguage.g:9246:1: rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 : ( ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 ) ) ;
    public final void rule__MultiplicationExpression__RightExpressionAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9250:1: ( ( ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 ) ) )
            // InternalAPIMappingLanguage.g:9251:1: ( ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 ) )
            {
            // InternalAPIMappingLanguage.g:9251:1: ( ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 ) )
            // InternalAPIMappingLanguage.g:9252:1: ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAlternatives_1_1_2_0()); 
            // InternalAPIMappingLanguage.g:9253:1: ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 )
            // InternalAPIMappingLanguage.g:9253:2: rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0
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
    // InternalAPIMappingLanguage.g:9262:1: rule__UnaryPreExpression__OperatorAssignment_1 : ( ruleUnaryPreOperator ) ;
    public final void rule__UnaryPreExpression__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9266:1: ( ( ruleUnaryPreOperator ) )
            // InternalAPIMappingLanguage.g:9267:1: ( ruleUnaryPreOperator )
            {
            // InternalAPIMappingLanguage.g:9267:1: ( ruleUnaryPreOperator )
            // InternalAPIMappingLanguage.g:9268:1: ruleUnaryPreOperator
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
    // InternalAPIMappingLanguage.g:9277:1: rule__UnaryPreExpression__EnclosedExpressionAssignment_2 : ( ruleTypeCastExpression ) ;
    public final void rule__UnaryPreExpression__EnclosedExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9281:1: ( ( ruleTypeCastExpression ) )
            // InternalAPIMappingLanguage.g:9282:1: ( ruleTypeCastExpression )
            {
            // InternalAPIMappingLanguage.g:9282:1: ( ruleTypeCastExpression )
            // InternalAPIMappingLanguage.g:9283:1: ruleTypeCastExpression
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
    // InternalAPIMappingLanguage.g:9292:1: rule__TypeCastExpression__DataTypeAssignment_1_2 : ( ( ruleDATATYPE ) ) ;
    public final void rule__TypeCastExpression__DataTypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9296:1: ( ( ( ruleDATATYPE ) ) )
            // InternalAPIMappingLanguage.g:9297:1: ( ( ruleDATATYPE ) )
            {
            // InternalAPIMappingLanguage.g:9297:1: ( ( ruleDATATYPE ) )
            // InternalAPIMappingLanguage.g:9298:1: ( ruleDATATYPE )
            {
             before(grammarAccess.getTypeCastExpressionAccess().getDataTypeDataTypeCrossReference_1_2_0()); 
            // InternalAPIMappingLanguage.g:9299:1: ( ruleDATATYPE )
            // InternalAPIMappingLanguage.g:9300:1: ruleDATATYPE
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
    // InternalAPIMappingLanguage.g:9311:1: rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 : ( ruleOperand ) ;
    public final void rule__TypeCastExpression__EnclosedExpressionAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9315:1: ( ( ruleOperand ) )
            // InternalAPIMappingLanguage.g:9316:1: ( ruleOperand )
            {
            // InternalAPIMappingLanguage.g:9316:1: ( ruleOperand )
            // InternalAPIMappingLanguage.g:9317:1: ruleOperand
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
    // InternalAPIMappingLanguage.g:9326:1: rule__LiteralExpression__ValueAssignment_1 : ( ruleLiteral ) ;
    public final void rule__LiteralExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9330:1: ( ( ruleLiteral ) )
            // InternalAPIMappingLanguage.g:9331:1: ( ruleLiteral )
            {
            // InternalAPIMappingLanguage.g:9331:1: ( ruleLiteral )
            // InternalAPIMappingLanguage.g:9332:1: ruleLiteral
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


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2"
    // InternalAPIMappingLanguage.g:9342:1: rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 : ( rulePositionSelectorExpression ) ;
    public final void rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9346:1: ( ( rulePositionSelectorExpression ) )
            // InternalAPIMappingLanguage.g:9347:1: ( rulePositionSelectorExpression )
            {
            // InternalAPIMappingLanguage.g:9347:1: ( rulePositionSelectorExpression )
            // InternalAPIMappingLanguage.g:9348:1: rulePositionSelectorExpression
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
    // InternalAPIMappingLanguage.g:9357:1: rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 : ( ruleIncrementDecrementOperatorExpression ) ;
    public final void rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9361:1: ( ( ruleIncrementDecrementOperatorExpression ) )
            // InternalAPIMappingLanguage.g:9362:1: ( ruleIncrementDecrementOperatorExpression )
            {
            // InternalAPIMappingLanguage.g:9362:1: ( ruleIncrementDecrementOperatorExpression )
            // InternalAPIMappingLanguage.g:9363:1: ruleIncrementDecrementOperatorExpression
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
    // InternalAPIMappingLanguage.g:9372:1: rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypedNamedElementExpression__TypedNamedElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9376:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:9377:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:9377:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:9378:1: ( RULE_ID )
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementTypedNamedElementCrossReference_0_0()); 
            // InternalAPIMappingLanguage.g:9379:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:9380:1: RULE_ID
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
    // InternalAPIMappingLanguage.g:9391:1: rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 : ( ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 ) ) ;
    public final void rule__TypedNamedElementExpression__ElementAccessorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9395:1: ( ( ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 ) ) )
            // InternalAPIMappingLanguage.g:9396:1: ( ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 ) )
            {
            // InternalAPIMappingLanguage.g:9396:1: ( ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 ) )
            // InternalAPIMappingLanguage.g:9397:1: ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 )
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsAlternatives_1_0()); 
            // InternalAPIMappingLanguage.g:9398:1: ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 )
            // InternalAPIMappingLanguage.g:9398:2: rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0
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
    // InternalAPIMappingLanguage.g:9407:1: rule__ArrayIndexExpression__IndexAssignment_1 : ( ruleArithmeticExpression ) ;
    public final void rule__ArrayIndexExpression__IndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9411:1: ( ( ruleArithmeticExpression ) )
            // InternalAPIMappingLanguage.g:9412:1: ( ruleArithmeticExpression )
            {
            // InternalAPIMappingLanguage.g:9412:1: ( ruleArithmeticExpression )
            // InternalAPIMappingLanguage.g:9413:1: ruleArithmeticExpression
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
    // InternalAPIMappingLanguage.g:9422:1: rule__AttributeAccessorExpression__AttributeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeAccessorExpression__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9426:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:9427:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:9427:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:9428:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccessorExpressionAccess().getAttributeAttributeCrossReference_1_0()); 
            // InternalAPIMappingLanguage.g:9429:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:9430:1: RULE_ID
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
    // InternalAPIMappingLanguage.g:9442:1: rule__PositionSelectorExpression__KindAssignment_0 : ( rulePositionSelectorKind ) ;
    public final void rule__PositionSelectorExpression__KindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9446:1: ( ( rulePositionSelectorKind ) )
            // InternalAPIMappingLanguage.g:9447:1: ( rulePositionSelectorKind )
            {
            // InternalAPIMappingLanguage.g:9447:1: ( rulePositionSelectorKind )
            // InternalAPIMappingLanguage.g:9448:1: rulePositionSelectorKind
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
    // InternalAPIMappingLanguage.g:9457:1: rule__PositionSelectorExpression__SuccessorAssignment_1_1 : ( rulePositionSelectorExpression ) ;
    public final void rule__PositionSelectorExpression__SuccessorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9461:1: ( ( rulePositionSelectorExpression ) )
            // InternalAPIMappingLanguage.g:9462:1: ( rulePositionSelectorExpression )
            {
            // InternalAPIMappingLanguage.g:9462:1: ( rulePositionSelectorExpression )
            // InternalAPIMappingLanguage.g:9463:1: rulePositionSelectorExpression
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
    // InternalAPIMappingLanguage.g:9472:1: rule__OperationCall__OperationAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__OperationCall__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9476:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:9477:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:9477:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:9478:1: ( RULE_ID )
            {
             before(grammarAccess.getOperationCallAccess().getOperationOperationCrossReference_0_0()); 
            // InternalAPIMappingLanguage.g:9479:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:9480:1: RULE_ID
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
    // InternalAPIMappingLanguage.g:9491:1: rule__OperationCall__ParameterBindingAssignment_2_0 : ( ruleParamaterBinding ) ;
    public final void rule__OperationCall__ParameterBindingAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9495:1: ( ( ruleParamaterBinding ) )
            // InternalAPIMappingLanguage.g:9496:1: ( ruleParamaterBinding )
            {
            // InternalAPIMappingLanguage.g:9496:1: ( ruleParamaterBinding )
            // InternalAPIMappingLanguage.g:9497:1: ruleParamaterBinding
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
    // InternalAPIMappingLanguage.g:9506:1: rule__OperationCall__ParameterBindingAssignment_2_1_1 : ( ruleParamaterBinding ) ;
    public final void rule__OperationCall__ParameterBindingAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9510:1: ( ( ruleParamaterBinding ) )
            // InternalAPIMappingLanguage.g:9511:1: ( ruleParamaterBinding )
            {
            // InternalAPIMappingLanguage.g:9511:1: ( ruleParamaterBinding )
            // InternalAPIMappingLanguage.g:9512:1: ruleParamaterBinding
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
    static final String dfa_2s = "\2\5\5\uffff\1\4\2\uffff\1\34\1\5";
    static final String dfa_3s = "\1\77\1\74\5\uffff\1\61\2\uffff\1\75\1\74";
    static final String dfa_4s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\uffff\1\1\1\7\2\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\57\uffff\1\2\1\3\1\4\1\uffff\1\5\5\uffff\1\6",
            "\1\6\13\uffff\5\10\33\uffff\1\11\2\uffff\1\10\7\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "\1\12\3\10\10\uffff\1\10\14\uffff\1\10\3\uffff\1\10\17\uffff\1\10",
            "",
            "",
            "\5\10\34\uffff\1\13",
            "\1\6\13\uffff\5\10\36\uffff\1\10\7\uffff\1\7"
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
            return "1657:1: rule__ExpressionStartRule__Alternatives : ( ( ruleAssignment ) | ( ruleForLoop ) | ( ruleWhileLoop ) | ( ruleDoWhileLoop ) | ( ruleIfStatement ) | ( ruleLocalVariableOrConstantDeclarationStatement ) | ( ruleAPICallStatement ) );";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\2\uffff\1\3\2\uffff\1\3\2\uffff\1\11\1\uffff";
    static final String dfa_9s = "\1\4\1\uffff\1\16\1\uffff\1\4\1\16\1\4\1\16\1\4\1\uffff";
    static final String dfa_10s = "\1\74\1\uffff\1\76\1\uffff\1\61\1\75\1\74\2\75\1\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\uffff\1\3\5\uffff\1\2";
    static final String dfa_12s = "\12\uffff}>";
    static final String[] dfa_13s = {
            "\1\3\1\2\2\3\10\uffff\1\3\14\uffff\1\3\3\uffff\1\3\17\uffff\1\3\12\uffff\1\1",
            "",
            "\2\3\1\uffff\2\3\3\uffff\2\3\1\4\10\3\11\uffff\1\3\6\uffff\1\3\1\uffff\2\3\7\uffff\3\3",
            "",
            "\1\5\3\3\10\uffff\1\3\14\uffff\1\3\3\uffff\1\3\17\uffff\1\3",
            "\2\3\6\uffff\2\3\4\uffff\5\3\11\uffff\1\6\10\uffff\1\3\11\uffff\1\3",
            "\1\7\3\3\10\uffff\1\3\14\uffff\1\3\3\uffff\1\3\17\uffff\1\3\12\uffff\1\3",
            "\2\3\6\uffff\5\3\1\10\5\3\11\uffff\1\3\22\uffff\1\3",
            "\4\3\10\uffff\1\3\14\uffff\1\3\3\uffff\1\3\10\uffff\1\11\6\uffff\1\3\1\uffff\1\11\11\uffff\1\11",
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
            return "1837:1: rule__InitializeExpression__Alternatives : ( ( ruleArrayInitializeExpression ) | ( ruleNondeterministicChoiceExpression ) | ( ruleExpression ) );";
        }
    }
    static final String dfa_14s = "\11\uffff";
    static final String dfa_15s = "\5\uffff\1\2\3\uffff";
    static final String dfa_16s = "\2\4\1\uffff\1\16\2\4\1\34\1\uffff\1\16";
    static final String dfa_17s = "\2\61\1\uffff\1\76\1\61\2\75\1\uffff\1\76";
    static final String dfa_18s = "\2\uffff\1\1\4\uffff\1\2\1\uffff";
    static final String dfa_19s = "\11\uffff}>";
    static final String[] dfa_20s = {
            "\4\2\10\uffff\1\2\40\uffff\1\1",
            "\1\2\1\3\2\2\10\uffff\1\2\14\uffff\1\2\3\uffff\1\2\17\uffff\1\2",
            "",
            "\2\2\1\uffff\2\2\3\uffff\13\2\20\uffff\1\2\1\5\1\uffff\1\2\7\uffff\1\4\1\uffff\1\2",
            "\1\6\3\2\10\uffff\1\2\14\uffff\1\2\3\uffff\1\2\17\uffff\1\2",
            "\4\7\6\uffff\2\2\1\7\5\uffff\13\2\10\uffff\2\2\4\uffff\1\2\1\uffff\1\7\2\2\4\uffff\1\2\4\uffff\1\2",
            "\5\2\34\uffff\1\10",
            "",
            "\2\2\1\uffff\2\2\3\uffff\13\2\21\uffff\1\5\1\uffff\1\2\7\uffff\1\4\1\uffff\1\2"
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
            return "1931:1: rule__TypeCastExpression__Alternatives : ( ( ruleOperand ) | ( ( rule__TypeCastExpression__Group_1__0 ) ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000220000000000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x10020102200100F0L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000820000000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0002000000000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004000000000020L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00030002200100F0L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00020002200100F0L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0010000000000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x82E20200000100F0L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x82E20000000100F2L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000003E0000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0C00000000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x2000040000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0008000000080000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x000000000F000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000030000002L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00000001C0000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00000001C0000002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000220000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00020000000100F0L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00000000000100D0L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x4000000000060000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000007C00000000L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1010000000000000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x1010000000000002L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x1000000000000002L});
    }


}