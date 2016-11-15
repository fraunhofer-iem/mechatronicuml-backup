package org.muml.pm.software.oslanguage.xtext.ui.contentassist.antlr.internal; 

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
import org.muml.pm.software.oslanguage.xtext.services.OperatingSystemLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOperatingSystemLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DAYS'", "'HOURS'", "'MILLISECONDS'", "'MINUTES'", "'SECONDS'", "'MICROSECONDS'", "'NANOSECONDS'", "'OperatingSystem:'", "'{'", "'}'", "'import'", "'Device_API_Calls:'", "'enum:'", "','", "'('", "')'", "';'", "'['", "']'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalOperatingSystemLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOperatingSystemLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOperatingSystemLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOperatingSystemLanguage.g"; }


     
     	private OperatingSystemLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(OperatingSystemLanguageGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleOperatingSystem"
    // InternalOperatingSystemLanguage.g:60:1: entryRuleOperatingSystem : ruleOperatingSystem EOF ;
    public final void entryRuleOperatingSystem() throws RecognitionException {
        try {
            // InternalOperatingSystemLanguage.g:61:1: ( ruleOperatingSystem EOF )
            // InternalOperatingSystemLanguage.g:62:1: ruleOperatingSystem EOF
            {
             before(grammarAccess.getOperatingSystemRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOperatingSystem();

            state._fsp--;

             after(grammarAccess.getOperatingSystemRule()); 
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
    // $ANTLR end "entryRuleOperatingSystem"


    // $ANTLR start "ruleOperatingSystem"
    // InternalOperatingSystemLanguage.g:69:1: ruleOperatingSystem : ( ( rule__OperatingSystem__Group__0 ) ) ;
    public final void ruleOperatingSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:73:2: ( ( ( rule__OperatingSystem__Group__0 ) ) )
            // InternalOperatingSystemLanguage.g:74:1: ( ( rule__OperatingSystem__Group__0 ) )
            {
            // InternalOperatingSystemLanguage.g:74:1: ( ( rule__OperatingSystem__Group__0 ) )
            // InternalOperatingSystemLanguage.g:75:1: ( rule__OperatingSystem__Group__0 )
            {
             before(grammarAccess.getOperatingSystemAccess().getGroup()); 
            // InternalOperatingSystemLanguage.g:76:1: ( rule__OperatingSystem__Group__0 )
            // InternalOperatingSystemLanguage.g:76:2: rule__OperatingSystem__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperatingSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperatingSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperatingSystem"


    // $ANTLR start "entryRuleImport"
    // InternalOperatingSystemLanguage.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalOperatingSystemLanguage.g:89:1: ( ruleImport EOF )
            // InternalOperatingSystemLanguage.g:90:1: ruleImport EOF
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
    // InternalOperatingSystemLanguage.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalOperatingSystemLanguage.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // InternalOperatingSystemLanguage.g:102:1: ( ( rule__Import__Group__0 ) )
            // InternalOperatingSystemLanguage.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalOperatingSystemLanguage.g:104:1: ( rule__Import__Group__0 )
            // InternalOperatingSystemLanguage.g:104:2: rule__Import__Group__0
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


    // $ANTLR start "entryRuleEString"
    // InternalOperatingSystemLanguage.g:116:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalOperatingSystemLanguage.g:117:1: ( ruleEString EOF )
            // InternalOperatingSystemLanguage.g:118:1: ruleEString EOF
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
    // InternalOperatingSystemLanguage.g:125:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:129:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalOperatingSystemLanguage.g:130:1: ( ( rule__EString__Alternatives ) )
            {
            // InternalOperatingSystemLanguage.g:130:1: ( ( rule__EString__Alternatives ) )
            // InternalOperatingSystemLanguage.g:131:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalOperatingSystemLanguage.g:132:1: ( rule__EString__Alternatives )
            // InternalOperatingSystemLanguage.g:132:2: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleAPIRepository"
    // InternalOperatingSystemLanguage.g:144:1: entryRuleAPIRepository : ruleAPIRepository EOF ;
    public final void entryRuleAPIRepository() throws RecognitionException {
        try {
            // InternalOperatingSystemLanguage.g:145:1: ( ruleAPIRepository EOF )
            // InternalOperatingSystemLanguage.g:146:1: ruleAPIRepository EOF
            {
             before(grammarAccess.getAPIRepositoryRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAPIRepository();

            state._fsp--;

             after(grammarAccess.getAPIRepositoryRule()); 
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
    // $ANTLR end "entryRuleAPIRepository"


    // $ANTLR start "ruleAPIRepository"
    // InternalOperatingSystemLanguage.g:153:1: ruleAPIRepository : ( ( rule__APIRepository__Group__0 ) ) ;
    public final void ruleAPIRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:157:2: ( ( ( rule__APIRepository__Group__0 ) ) )
            // InternalOperatingSystemLanguage.g:158:1: ( ( rule__APIRepository__Group__0 ) )
            {
            // InternalOperatingSystemLanguage.g:158:1: ( ( rule__APIRepository__Group__0 ) )
            // InternalOperatingSystemLanguage.g:159:1: ( rule__APIRepository__Group__0 )
            {
             before(grammarAccess.getAPIRepositoryAccess().getGroup()); 
            // InternalOperatingSystemLanguage.g:160:1: ( rule__APIRepository__Group__0 )
            // InternalOperatingSystemLanguage.g:160:2: rule__APIRepository__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APIRepository__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAPIRepositoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAPIRepository"


    // $ANTLR start "entryRuleEnumerationDataType"
    // InternalOperatingSystemLanguage.g:172:1: entryRuleEnumerationDataType : ruleEnumerationDataType EOF ;
    public final void entryRuleEnumerationDataType() throws RecognitionException {
        try {
            // InternalOperatingSystemLanguage.g:173:1: ( ruleEnumerationDataType EOF )
            // InternalOperatingSystemLanguage.g:174:1: ruleEnumerationDataType EOF
            {
             before(grammarAccess.getEnumerationDataTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEnumerationDataType();

            state._fsp--;

             after(grammarAccess.getEnumerationDataTypeRule()); 
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
    // $ANTLR end "entryRuleEnumerationDataType"


    // $ANTLR start "ruleEnumerationDataType"
    // InternalOperatingSystemLanguage.g:181:1: ruleEnumerationDataType : ( ( rule__EnumerationDataType__Group__0 ) ) ;
    public final void ruleEnumerationDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:185:2: ( ( ( rule__EnumerationDataType__Group__0 ) ) )
            // InternalOperatingSystemLanguage.g:186:1: ( ( rule__EnumerationDataType__Group__0 ) )
            {
            // InternalOperatingSystemLanguage.g:186:1: ( ( rule__EnumerationDataType__Group__0 ) )
            // InternalOperatingSystemLanguage.g:187:1: ( rule__EnumerationDataType__Group__0 )
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getGroup()); 
            // InternalOperatingSystemLanguage.g:188:1: ( rule__EnumerationDataType__Group__0 )
            // InternalOperatingSystemLanguage.g:188:2: rule__EnumerationDataType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationDataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationDataType"


    // $ANTLR start "entryRuleAPICommand"
    // InternalOperatingSystemLanguage.g:200:1: entryRuleAPICommand : ruleAPICommand EOF ;
    public final void entryRuleAPICommand() throws RecognitionException {
        try {
            // InternalOperatingSystemLanguage.g:201:1: ( ruleAPICommand EOF )
            // InternalOperatingSystemLanguage.g:202:1: ruleAPICommand EOF
            {
             before(grammarAccess.getAPICommandRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAPICommand();

            state._fsp--;

             after(grammarAccess.getAPICommandRule()); 
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
    // $ANTLR end "entryRuleAPICommand"


    // $ANTLR start "ruleAPICommand"
    // InternalOperatingSystemLanguage.g:209:1: ruleAPICommand : ( ( rule__APICommand__Group__0 ) ) ;
    public final void ruleAPICommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:213:2: ( ( ( rule__APICommand__Group__0 ) ) )
            // InternalOperatingSystemLanguage.g:214:1: ( ( rule__APICommand__Group__0 ) )
            {
            // InternalOperatingSystemLanguage.g:214:1: ( ( rule__APICommand__Group__0 ) )
            // InternalOperatingSystemLanguage.g:215:1: ( rule__APICommand__Group__0 )
            {
             before(grammarAccess.getAPICommandAccess().getGroup()); 
            // InternalOperatingSystemLanguage.g:216:1: ( rule__APICommand__Group__0 )
            // InternalOperatingSystemLanguage.g:216:2: rule__APICommand__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAPICommandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAPICommand"


    // $ANTLR start "entryRuleParameter"
    // InternalOperatingSystemLanguage.g:228:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalOperatingSystemLanguage.g:229:1: ( ruleParameter EOF )
            // InternalOperatingSystemLanguage.g:230:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalOperatingSystemLanguage.g:237:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:241:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalOperatingSystemLanguage.g:242:1: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalOperatingSystemLanguage.g:242:1: ( ( rule__Parameter__Group__0 ) )
            // InternalOperatingSystemLanguage.g:243:1: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalOperatingSystemLanguage.g:244:1: ( rule__Parameter__Group__0 )
            // InternalOperatingSystemLanguage.g:244:2: rule__Parameter__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleEnumerationValue"
    // InternalOperatingSystemLanguage.g:256:1: entryRuleEnumerationValue : ruleEnumerationValue EOF ;
    public final void entryRuleEnumerationValue() throws RecognitionException {
        try {
            // InternalOperatingSystemLanguage.g:257:1: ( ruleEnumerationValue EOF )
            // InternalOperatingSystemLanguage.g:258:1: ruleEnumerationValue EOF
            {
             before(grammarAccess.getEnumerationValueRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEnumerationValue();

            state._fsp--;

             after(grammarAccess.getEnumerationValueRule()); 
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
    // $ANTLR end "entryRuleEnumerationValue"


    // $ANTLR start "ruleEnumerationValue"
    // InternalOperatingSystemLanguage.g:265:1: ruleEnumerationValue : ( ( rule__EnumerationValue__ValueAssignment ) ) ;
    public final void ruleEnumerationValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:269:2: ( ( ( rule__EnumerationValue__ValueAssignment ) ) )
            // InternalOperatingSystemLanguage.g:270:1: ( ( rule__EnumerationValue__ValueAssignment ) )
            {
            // InternalOperatingSystemLanguage.g:270:1: ( ( rule__EnumerationValue__ValueAssignment ) )
            // InternalOperatingSystemLanguage.g:271:1: ( rule__EnumerationValue__ValueAssignment )
            {
             before(grammarAccess.getEnumerationValueAccess().getValueAssignment()); 
            // InternalOperatingSystemLanguage.g:272:1: ( rule__EnumerationValue__ValueAssignment )
            // InternalOperatingSystemLanguage.g:272:2: rule__EnumerationValue__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationValue__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationValue"


    // $ANTLR start "entryRuleTimeConstraint"
    // InternalOperatingSystemLanguage.g:284:1: entryRuleTimeConstraint : ruleTimeConstraint EOF ;
    public final void entryRuleTimeConstraint() throws RecognitionException {
        try {
            // InternalOperatingSystemLanguage.g:285:1: ( ruleTimeConstraint EOF )
            // InternalOperatingSystemLanguage.g:286:1: ruleTimeConstraint EOF
            {
             before(grammarAccess.getTimeConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTimeConstraint();

            state._fsp--;

             after(grammarAccess.getTimeConstraintRule()); 
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
    // $ANTLR end "entryRuleTimeConstraint"


    // $ANTLR start "ruleTimeConstraint"
    // InternalOperatingSystemLanguage.g:293:1: ruleTimeConstraint : ( ( rule__TimeConstraint__Group__0 ) ) ;
    public final void ruleTimeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:297:2: ( ( ( rule__TimeConstraint__Group__0 ) ) )
            // InternalOperatingSystemLanguage.g:298:1: ( ( rule__TimeConstraint__Group__0 ) )
            {
            // InternalOperatingSystemLanguage.g:298:1: ( ( rule__TimeConstraint__Group__0 ) )
            // InternalOperatingSystemLanguage.g:299:1: ( rule__TimeConstraint__Group__0 )
            {
             before(grammarAccess.getTimeConstraintAccess().getGroup()); 
            // InternalOperatingSystemLanguage.g:300:1: ( rule__TimeConstraint__Group__0 )
            // InternalOperatingSystemLanguage.g:300:2: rule__TimeConstraint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TimeConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeConstraint"


    // $ANTLR start "entryRuleTimeValue"
    // InternalOperatingSystemLanguage.g:312:1: entryRuleTimeValue : ruleTimeValue EOF ;
    public final void entryRuleTimeValue() throws RecognitionException {
        try {
            // InternalOperatingSystemLanguage.g:313:1: ( ruleTimeValue EOF )
            // InternalOperatingSystemLanguage.g:314:1: ruleTimeValue EOF
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
    // InternalOperatingSystemLanguage.g:321:1: ruleTimeValue : ( ( rule__TimeValue__Group__0 ) ) ;
    public final void ruleTimeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:325:2: ( ( ( rule__TimeValue__Group__0 ) ) )
            // InternalOperatingSystemLanguage.g:326:1: ( ( rule__TimeValue__Group__0 ) )
            {
            // InternalOperatingSystemLanguage.g:326:1: ( ( rule__TimeValue__Group__0 ) )
            // InternalOperatingSystemLanguage.g:327:1: ( rule__TimeValue__Group__0 )
            {
             before(grammarAccess.getTimeValueAccess().getGroup()); 
            // InternalOperatingSystemLanguage.g:328:1: ( rule__TimeValue__Group__0 )
            // InternalOperatingSystemLanguage.g:328:2: rule__TimeValue__Group__0
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


    // $ANTLR start "entryRuleINTExpression"
    // InternalOperatingSystemLanguage.g:340:1: entryRuleINTExpression : ruleINTExpression EOF ;
    public final void entryRuleINTExpression() throws RecognitionException {
        try {
            // InternalOperatingSystemLanguage.g:341:1: ( ruleINTExpression EOF )
            // InternalOperatingSystemLanguage.g:342:1: ruleINTExpression EOF
            {
             before(grammarAccess.getINTExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleINTExpression();

            state._fsp--;

             after(grammarAccess.getINTExpressionRule()); 
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
    // $ANTLR end "entryRuleINTExpression"


    // $ANTLR start "ruleINTExpression"
    // InternalOperatingSystemLanguage.g:349:1: ruleINTExpression : ( ( rule__INTExpression__ValueAssignment ) ) ;
    public final void ruleINTExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:353:2: ( ( ( rule__INTExpression__ValueAssignment ) ) )
            // InternalOperatingSystemLanguage.g:354:1: ( ( rule__INTExpression__ValueAssignment ) )
            {
            // InternalOperatingSystemLanguage.g:354:1: ( ( rule__INTExpression__ValueAssignment ) )
            // InternalOperatingSystemLanguage.g:355:1: ( rule__INTExpression__ValueAssignment )
            {
             before(grammarAccess.getINTExpressionAccess().getValueAssignment()); 
            // InternalOperatingSystemLanguage.g:356:1: ( rule__INTExpression__ValueAssignment )
            // InternalOperatingSystemLanguage.g:356:2: rule__INTExpression__ValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__INTExpression__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getINTExpressionAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleINTExpression"


    // $ANTLR start "entryRuleTimeUnitExpr"
    // InternalOperatingSystemLanguage.g:368:1: entryRuleTimeUnitExpr : ruleTimeUnitExpr EOF ;
    public final void entryRuleTimeUnitExpr() throws RecognitionException {
        try {
            // InternalOperatingSystemLanguage.g:369:1: ( ruleTimeUnitExpr EOF )
            // InternalOperatingSystemLanguage.g:370:1: ruleTimeUnitExpr EOF
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
    // InternalOperatingSystemLanguage.g:377:1: ruleTimeUnitExpr : ( ( rule__TimeUnitExpr__Alternatives ) ) ;
    public final void ruleTimeUnitExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:381:2: ( ( ( rule__TimeUnitExpr__Alternatives ) ) )
            // InternalOperatingSystemLanguage.g:382:1: ( ( rule__TimeUnitExpr__Alternatives ) )
            {
            // InternalOperatingSystemLanguage.g:382:1: ( ( rule__TimeUnitExpr__Alternatives ) )
            // InternalOperatingSystemLanguage.g:383:1: ( rule__TimeUnitExpr__Alternatives )
            {
             before(grammarAccess.getTimeUnitExprAccess().getAlternatives()); 
            // InternalOperatingSystemLanguage.g:384:1: ( rule__TimeUnitExpr__Alternatives )
            // InternalOperatingSystemLanguage.g:384:2: rule__TimeUnitExpr__Alternatives
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


    // $ANTLR start "rule__OperatingSystem__Alternatives_4"
    // InternalOperatingSystemLanguage.g:396:1: rule__OperatingSystem__Alternatives_4 : ( ( ( rule__OperatingSystem__ApirepositoriesAssignment_4_0 ) ) | ( ( rule__OperatingSystem__EnumerationDataTypesAssignment_4_1 ) ) );
    public final void rule__OperatingSystem__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:400:1: ( ( ( rule__OperatingSystem__ApirepositoriesAssignment_4_0 ) ) | ( ( rule__OperatingSystem__EnumerationDataTypesAssignment_4_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                alt1=1;
            }
            else if ( (LA1_0==23) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalOperatingSystemLanguage.g:401:1: ( ( rule__OperatingSystem__ApirepositoriesAssignment_4_0 ) )
                    {
                    // InternalOperatingSystemLanguage.g:401:1: ( ( rule__OperatingSystem__ApirepositoriesAssignment_4_0 ) )
                    // InternalOperatingSystemLanguage.g:402:1: ( rule__OperatingSystem__ApirepositoriesAssignment_4_0 )
                    {
                     before(grammarAccess.getOperatingSystemAccess().getApirepositoriesAssignment_4_0()); 
                    // InternalOperatingSystemLanguage.g:403:1: ( rule__OperatingSystem__ApirepositoriesAssignment_4_0 )
                    // InternalOperatingSystemLanguage.g:403:2: rule__OperatingSystem__ApirepositoriesAssignment_4_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__OperatingSystem__ApirepositoriesAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatingSystemAccess().getApirepositoriesAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOperatingSystemLanguage.g:407:6: ( ( rule__OperatingSystem__EnumerationDataTypesAssignment_4_1 ) )
                    {
                    // InternalOperatingSystemLanguage.g:407:6: ( ( rule__OperatingSystem__EnumerationDataTypesAssignment_4_1 ) )
                    // InternalOperatingSystemLanguage.g:408:1: ( rule__OperatingSystem__EnumerationDataTypesAssignment_4_1 )
                    {
                     before(grammarAccess.getOperatingSystemAccess().getEnumerationDataTypesAssignment_4_1()); 
                    // InternalOperatingSystemLanguage.g:409:1: ( rule__OperatingSystem__EnumerationDataTypesAssignment_4_1 )
                    // InternalOperatingSystemLanguage.g:409:2: rule__OperatingSystem__EnumerationDataTypesAssignment_4_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__OperatingSystem__EnumerationDataTypesAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperatingSystemAccess().getEnumerationDataTypesAssignment_4_1()); 

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
    // $ANTLR end "rule__OperatingSystem__Alternatives_4"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalOperatingSystemLanguage.g:418:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:422:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalOperatingSystemLanguage.g:423:1: ( RULE_STRING )
                    {
                    // InternalOperatingSystemLanguage.g:423:1: ( RULE_STRING )
                    // InternalOperatingSystemLanguage.g:424:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOperatingSystemLanguage.g:429:6: ( RULE_ID )
                    {
                    // InternalOperatingSystemLanguage.g:429:6: ( RULE_ID )
                    // InternalOperatingSystemLanguage.g:430:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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


    // $ANTLR start "rule__TimeUnitExpr__Alternatives"
    // InternalOperatingSystemLanguage.g:440:1: rule__TimeUnitExpr__Alternatives : ( ( 'DAYS' ) | ( 'HOURS' ) | ( 'MILLISECONDS' ) | ( 'MINUTES' ) | ( 'SECONDS' ) | ( 'MICROSECONDS' ) | ( 'NANOSECONDS' ) );
    public final void rule__TimeUnitExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:444:1: ( ( 'DAYS' ) | ( 'HOURS' ) | ( 'MILLISECONDS' ) | ( 'MINUTES' ) | ( 'SECONDS' ) | ( 'MICROSECONDS' ) | ( 'NANOSECONDS' ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalOperatingSystemLanguage.g:445:1: ( 'DAYS' )
                    {
                    // InternalOperatingSystemLanguage.g:445:1: ( 'DAYS' )
                    // InternalOperatingSystemLanguage.g:446:1: 'DAYS'
                    {
                     before(grammarAccess.getTimeUnitExprAccess().getDAYSKeyword_0()); 
                    match(input,11,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTimeUnitExprAccess().getDAYSKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOperatingSystemLanguage.g:453:6: ( 'HOURS' )
                    {
                    // InternalOperatingSystemLanguage.g:453:6: ( 'HOURS' )
                    // InternalOperatingSystemLanguage.g:454:1: 'HOURS'
                    {
                     before(grammarAccess.getTimeUnitExprAccess().getHOURSKeyword_1()); 
                    match(input,12,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTimeUnitExprAccess().getHOURSKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOperatingSystemLanguage.g:461:6: ( 'MILLISECONDS' )
                    {
                    // InternalOperatingSystemLanguage.g:461:6: ( 'MILLISECONDS' )
                    // InternalOperatingSystemLanguage.g:462:1: 'MILLISECONDS'
                    {
                     before(grammarAccess.getTimeUnitExprAccess().getMILLISECONDSKeyword_2()); 
                    match(input,13,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTimeUnitExprAccess().getMILLISECONDSKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOperatingSystemLanguage.g:469:6: ( 'MINUTES' )
                    {
                    // InternalOperatingSystemLanguage.g:469:6: ( 'MINUTES' )
                    // InternalOperatingSystemLanguage.g:470:1: 'MINUTES'
                    {
                     before(grammarAccess.getTimeUnitExprAccess().getMINUTESKeyword_3()); 
                    match(input,14,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTimeUnitExprAccess().getMINUTESKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOperatingSystemLanguage.g:477:6: ( 'SECONDS' )
                    {
                    // InternalOperatingSystemLanguage.g:477:6: ( 'SECONDS' )
                    // InternalOperatingSystemLanguage.g:478:1: 'SECONDS'
                    {
                     before(grammarAccess.getTimeUnitExprAccess().getSECONDSKeyword_4()); 
                    match(input,15,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTimeUnitExprAccess().getSECONDSKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOperatingSystemLanguage.g:485:6: ( 'MICROSECONDS' )
                    {
                    // InternalOperatingSystemLanguage.g:485:6: ( 'MICROSECONDS' )
                    // InternalOperatingSystemLanguage.g:486:1: 'MICROSECONDS'
                    {
                     before(grammarAccess.getTimeUnitExprAccess().getMICROSECONDSKeyword_5()); 
                    match(input,16,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTimeUnitExprAccess().getMICROSECONDSKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalOperatingSystemLanguage.g:493:6: ( 'NANOSECONDS' )
                    {
                    // InternalOperatingSystemLanguage.g:493:6: ( 'NANOSECONDS' )
                    // InternalOperatingSystemLanguage.g:494:1: 'NANOSECONDS'
                    {
                     before(grammarAccess.getTimeUnitExprAccess().getNANOSECONDSKeyword_6()); 
                    match(input,17,FollowSets000.FOLLOW_2); 
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


    // $ANTLR start "rule__OperatingSystem__Group__0"
    // InternalOperatingSystemLanguage.g:508:1: rule__OperatingSystem__Group__0 : rule__OperatingSystem__Group__0__Impl rule__OperatingSystem__Group__1 ;
    public final void rule__OperatingSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:512:1: ( rule__OperatingSystem__Group__0__Impl rule__OperatingSystem__Group__1 )
            // InternalOperatingSystemLanguage.g:513:2: rule__OperatingSystem__Group__0__Impl rule__OperatingSystem__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__OperatingSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperatingSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatingSystem__Group__0"


    // $ANTLR start "rule__OperatingSystem__Group__0__Impl"
    // InternalOperatingSystemLanguage.g:520:1: rule__OperatingSystem__Group__0__Impl : ( ( rule__OperatingSystem__ImportsAssignment_0 )* ) ;
    public final void rule__OperatingSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:524:1: ( ( ( rule__OperatingSystem__ImportsAssignment_0 )* ) )
            // InternalOperatingSystemLanguage.g:525:1: ( ( rule__OperatingSystem__ImportsAssignment_0 )* )
            {
            // InternalOperatingSystemLanguage.g:525:1: ( ( rule__OperatingSystem__ImportsAssignment_0 )* )
            // InternalOperatingSystemLanguage.g:526:1: ( rule__OperatingSystem__ImportsAssignment_0 )*
            {
             before(grammarAccess.getOperatingSystemAccess().getImportsAssignment_0()); 
            // InternalOperatingSystemLanguage.g:527:1: ( rule__OperatingSystem__ImportsAssignment_0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalOperatingSystemLanguage.g:527:2: rule__OperatingSystem__ImportsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__OperatingSystem__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getOperatingSystemAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatingSystem__Group__0__Impl"


    // $ANTLR start "rule__OperatingSystem__Group__1"
    // InternalOperatingSystemLanguage.g:537:1: rule__OperatingSystem__Group__1 : rule__OperatingSystem__Group__1__Impl rule__OperatingSystem__Group__2 ;
    public final void rule__OperatingSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:541:1: ( rule__OperatingSystem__Group__1__Impl rule__OperatingSystem__Group__2 )
            // InternalOperatingSystemLanguage.g:542:2: rule__OperatingSystem__Group__1__Impl rule__OperatingSystem__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__OperatingSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperatingSystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatingSystem__Group__1"


    // $ANTLR start "rule__OperatingSystem__Group__1__Impl"
    // InternalOperatingSystemLanguage.g:549:1: rule__OperatingSystem__Group__1__Impl : ( 'OperatingSystem:' ) ;
    public final void rule__OperatingSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:553:1: ( ( 'OperatingSystem:' ) )
            // InternalOperatingSystemLanguage.g:554:1: ( 'OperatingSystem:' )
            {
            // InternalOperatingSystemLanguage.g:554:1: ( 'OperatingSystem:' )
            // InternalOperatingSystemLanguage.g:555:1: 'OperatingSystem:'
            {
             before(grammarAccess.getOperatingSystemAccess().getOperatingSystemKeyword_1()); 
            match(input,18,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOperatingSystemAccess().getOperatingSystemKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatingSystem__Group__1__Impl"


    // $ANTLR start "rule__OperatingSystem__Group__2"
    // InternalOperatingSystemLanguage.g:568:1: rule__OperatingSystem__Group__2 : rule__OperatingSystem__Group__2__Impl rule__OperatingSystem__Group__3 ;
    public final void rule__OperatingSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:572:1: ( rule__OperatingSystem__Group__2__Impl rule__OperatingSystem__Group__3 )
            // InternalOperatingSystemLanguage.g:573:2: rule__OperatingSystem__Group__2__Impl rule__OperatingSystem__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__OperatingSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperatingSystem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatingSystem__Group__2"


    // $ANTLR start "rule__OperatingSystem__Group__2__Impl"
    // InternalOperatingSystemLanguage.g:580:1: rule__OperatingSystem__Group__2__Impl : ( ( rule__OperatingSystem__NameAssignment_2 ) ) ;
    public final void rule__OperatingSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:584:1: ( ( ( rule__OperatingSystem__NameAssignment_2 ) ) )
            // InternalOperatingSystemLanguage.g:585:1: ( ( rule__OperatingSystem__NameAssignment_2 ) )
            {
            // InternalOperatingSystemLanguage.g:585:1: ( ( rule__OperatingSystem__NameAssignment_2 ) )
            // InternalOperatingSystemLanguage.g:586:1: ( rule__OperatingSystem__NameAssignment_2 )
            {
             before(grammarAccess.getOperatingSystemAccess().getNameAssignment_2()); 
            // InternalOperatingSystemLanguage.g:587:1: ( rule__OperatingSystem__NameAssignment_2 )
            // InternalOperatingSystemLanguage.g:587:2: rule__OperatingSystem__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperatingSystem__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperatingSystemAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatingSystem__Group__2__Impl"


    // $ANTLR start "rule__OperatingSystem__Group__3"
    // InternalOperatingSystemLanguage.g:597:1: rule__OperatingSystem__Group__3 : rule__OperatingSystem__Group__3__Impl rule__OperatingSystem__Group__4 ;
    public final void rule__OperatingSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:601:1: ( rule__OperatingSystem__Group__3__Impl rule__OperatingSystem__Group__4 )
            // InternalOperatingSystemLanguage.g:602:2: rule__OperatingSystem__Group__3__Impl rule__OperatingSystem__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__OperatingSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperatingSystem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatingSystem__Group__3"


    // $ANTLR start "rule__OperatingSystem__Group__3__Impl"
    // InternalOperatingSystemLanguage.g:609:1: rule__OperatingSystem__Group__3__Impl : ( '{' ) ;
    public final void rule__OperatingSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:613:1: ( ( '{' ) )
            // InternalOperatingSystemLanguage.g:614:1: ( '{' )
            {
            // InternalOperatingSystemLanguage.g:614:1: ( '{' )
            // InternalOperatingSystemLanguage.g:615:1: '{'
            {
             before(grammarAccess.getOperatingSystemAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOperatingSystemAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatingSystem__Group__3__Impl"


    // $ANTLR start "rule__OperatingSystem__Group__4"
    // InternalOperatingSystemLanguage.g:628:1: rule__OperatingSystem__Group__4 : rule__OperatingSystem__Group__4__Impl rule__OperatingSystem__Group__5 ;
    public final void rule__OperatingSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:632:1: ( rule__OperatingSystem__Group__4__Impl rule__OperatingSystem__Group__5 )
            // InternalOperatingSystemLanguage.g:633:2: rule__OperatingSystem__Group__4__Impl rule__OperatingSystem__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__OperatingSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperatingSystem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatingSystem__Group__4"


    // $ANTLR start "rule__OperatingSystem__Group__4__Impl"
    // InternalOperatingSystemLanguage.g:640:1: rule__OperatingSystem__Group__4__Impl : ( ( rule__OperatingSystem__Alternatives_4 )* ) ;
    public final void rule__OperatingSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:644:1: ( ( ( rule__OperatingSystem__Alternatives_4 )* ) )
            // InternalOperatingSystemLanguage.g:645:1: ( ( rule__OperatingSystem__Alternatives_4 )* )
            {
            // InternalOperatingSystemLanguage.g:645:1: ( ( rule__OperatingSystem__Alternatives_4 )* )
            // InternalOperatingSystemLanguage.g:646:1: ( rule__OperatingSystem__Alternatives_4 )*
            {
             before(grammarAccess.getOperatingSystemAccess().getAlternatives_4()); 
            // InternalOperatingSystemLanguage.g:647:1: ( rule__OperatingSystem__Alternatives_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=22 && LA5_0<=23)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOperatingSystemLanguage.g:647:2: rule__OperatingSystem__Alternatives_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__OperatingSystem__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getOperatingSystemAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatingSystem__Group__4__Impl"


    // $ANTLR start "rule__OperatingSystem__Group__5"
    // InternalOperatingSystemLanguage.g:657:1: rule__OperatingSystem__Group__5 : rule__OperatingSystem__Group__5__Impl ;
    public final void rule__OperatingSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:661:1: ( rule__OperatingSystem__Group__5__Impl )
            // InternalOperatingSystemLanguage.g:662:2: rule__OperatingSystem__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperatingSystem__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatingSystem__Group__5"


    // $ANTLR start "rule__OperatingSystem__Group__5__Impl"
    // InternalOperatingSystemLanguage.g:668:1: rule__OperatingSystem__Group__5__Impl : ( '}' ) ;
    public final void rule__OperatingSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:672:1: ( ( '}' ) )
            // InternalOperatingSystemLanguage.g:673:1: ( '}' )
            {
            // InternalOperatingSystemLanguage.g:673:1: ( '}' )
            // InternalOperatingSystemLanguage.g:674:1: '}'
            {
             before(grammarAccess.getOperatingSystemAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOperatingSystemAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatingSystem__Group__5__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalOperatingSystemLanguage.g:699:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:703:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalOperatingSystemLanguage.g:704:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
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
    // InternalOperatingSystemLanguage.g:711:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:715:1: ( ( 'import' ) )
            // InternalOperatingSystemLanguage.g:716:1: ( 'import' )
            {
            // InternalOperatingSystemLanguage.g:716:1: ( 'import' )
            // InternalOperatingSystemLanguage.g:717:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_2); 
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
    // InternalOperatingSystemLanguage.g:730:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:734:1: ( rule__Import__Group__1__Impl )
            // InternalOperatingSystemLanguage.g:735:2: rule__Import__Group__1__Impl
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
    // InternalOperatingSystemLanguage.g:741:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:745:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalOperatingSystemLanguage.g:746:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalOperatingSystemLanguage.g:746:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalOperatingSystemLanguage.g:747:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // InternalOperatingSystemLanguage.g:748:1: ( rule__Import__ImportURIAssignment_1 )
            // InternalOperatingSystemLanguage.g:748:2: rule__Import__ImportURIAssignment_1
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


    // $ANTLR start "rule__APIRepository__Group__0"
    // InternalOperatingSystemLanguage.g:762:1: rule__APIRepository__Group__0 : rule__APIRepository__Group__0__Impl rule__APIRepository__Group__1 ;
    public final void rule__APIRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:766:1: ( rule__APIRepository__Group__0__Impl rule__APIRepository__Group__1 )
            // InternalOperatingSystemLanguage.g:767:2: rule__APIRepository__Group__0__Impl rule__APIRepository__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__APIRepository__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APIRepository__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRepository__Group__0"


    // $ANTLR start "rule__APIRepository__Group__0__Impl"
    // InternalOperatingSystemLanguage.g:774:1: rule__APIRepository__Group__0__Impl : ( 'Device_API_Calls:' ) ;
    public final void rule__APIRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:778:1: ( ( 'Device_API_Calls:' ) )
            // InternalOperatingSystemLanguage.g:779:1: ( 'Device_API_Calls:' )
            {
            // InternalOperatingSystemLanguage.g:779:1: ( 'Device_API_Calls:' )
            // InternalOperatingSystemLanguage.g:780:1: 'Device_API_Calls:'
            {
             before(grammarAccess.getAPIRepositoryAccess().getDevice_API_CallsKeyword_0()); 
            match(input,22,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAPIRepositoryAccess().getDevice_API_CallsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRepository__Group__0__Impl"


    // $ANTLR start "rule__APIRepository__Group__1"
    // InternalOperatingSystemLanguage.g:793:1: rule__APIRepository__Group__1 : rule__APIRepository__Group__1__Impl rule__APIRepository__Group__2 ;
    public final void rule__APIRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:797:1: ( rule__APIRepository__Group__1__Impl rule__APIRepository__Group__2 )
            // InternalOperatingSystemLanguage.g:798:2: rule__APIRepository__Group__1__Impl rule__APIRepository__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__APIRepository__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APIRepository__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRepository__Group__1"


    // $ANTLR start "rule__APIRepository__Group__1__Impl"
    // InternalOperatingSystemLanguage.g:805:1: rule__APIRepository__Group__1__Impl : ( ( rule__APIRepository__NameAssignment_1 ) ) ;
    public final void rule__APIRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:809:1: ( ( ( rule__APIRepository__NameAssignment_1 ) ) )
            // InternalOperatingSystemLanguage.g:810:1: ( ( rule__APIRepository__NameAssignment_1 ) )
            {
            // InternalOperatingSystemLanguage.g:810:1: ( ( rule__APIRepository__NameAssignment_1 ) )
            // InternalOperatingSystemLanguage.g:811:1: ( rule__APIRepository__NameAssignment_1 )
            {
             before(grammarAccess.getAPIRepositoryAccess().getNameAssignment_1()); 
            // InternalOperatingSystemLanguage.g:812:1: ( rule__APIRepository__NameAssignment_1 )
            // InternalOperatingSystemLanguage.g:812:2: rule__APIRepository__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APIRepository__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAPIRepositoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRepository__Group__1__Impl"


    // $ANTLR start "rule__APIRepository__Group__2"
    // InternalOperatingSystemLanguage.g:822:1: rule__APIRepository__Group__2 : rule__APIRepository__Group__2__Impl rule__APIRepository__Group__3 ;
    public final void rule__APIRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:826:1: ( rule__APIRepository__Group__2__Impl rule__APIRepository__Group__3 )
            // InternalOperatingSystemLanguage.g:827:2: rule__APIRepository__Group__2__Impl rule__APIRepository__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__APIRepository__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APIRepository__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRepository__Group__2"


    // $ANTLR start "rule__APIRepository__Group__2__Impl"
    // InternalOperatingSystemLanguage.g:834:1: rule__APIRepository__Group__2__Impl : ( '{' ) ;
    public final void rule__APIRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:838:1: ( ( '{' ) )
            // InternalOperatingSystemLanguage.g:839:1: ( '{' )
            {
            // InternalOperatingSystemLanguage.g:839:1: ( '{' )
            // InternalOperatingSystemLanguage.g:840:1: '{'
            {
             before(grammarAccess.getAPIRepositoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAPIRepositoryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRepository__Group__2__Impl"


    // $ANTLR start "rule__APIRepository__Group__3"
    // InternalOperatingSystemLanguage.g:853:1: rule__APIRepository__Group__3 : rule__APIRepository__Group__3__Impl rule__APIRepository__Group__4 ;
    public final void rule__APIRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:857:1: ( rule__APIRepository__Group__3__Impl rule__APIRepository__Group__4 )
            // InternalOperatingSystemLanguage.g:858:2: rule__APIRepository__Group__3__Impl rule__APIRepository__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__APIRepository__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APIRepository__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRepository__Group__3"


    // $ANTLR start "rule__APIRepository__Group__3__Impl"
    // InternalOperatingSystemLanguage.g:865:1: rule__APIRepository__Group__3__Impl : ( ( rule__APIRepository__ApiCommandsAssignment_3 )* ) ;
    public final void rule__APIRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:869:1: ( ( ( rule__APIRepository__ApiCommandsAssignment_3 )* ) )
            // InternalOperatingSystemLanguage.g:870:1: ( ( rule__APIRepository__ApiCommandsAssignment_3 )* )
            {
            // InternalOperatingSystemLanguage.g:870:1: ( ( rule__APIRepository__ApiCommandsAssignment_3 )* )
            // InternalOperatingSystemLanguage.g:871:1: ( rule__APIRepository__ApiCommandsAssignment_3 )*
            {
             before(grammarAccess.getAPIRepositoryAccess().getApiCommandsAssignment_3()); 
            // InternalOperatingSystemLanguage.g:872:1: ( rule__APIRepository__ApiCommandsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalOperatingSystemLanguage.g:872:2: rule__APIRepository__ApiCommandsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    rule__APIRepository__ApiCommandsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getAPIRepositoryAccess().getApiCommandsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRepository__Group__3__Impl"


    // $ANTLR start "rule__APIRepository__Group__4"
    // InternalOperatingSystemLanguage.g:882:1: rule__APIRepository__Group__4 : rule__APIRepository__Group__4__Impl ;
    public final void rule__APIRepository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:886:1: ( rule__APIRepository__Group__4__Impl )
            // InternalOperatingSystemLanguage.g:887:2: rule__APIRepository__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APIRepository__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRepository__Group__4"


    // $ANTLR start "rule__APIRepository__Group__4__Impl"
    // InternalOperatingSystemLanguage.g:893:1: rule__APIRepository__Group__4__Impl : ( '}' ) ;
    public final void rule__APIRepository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:897:1: ( ( '}' ) )
            // InternalOperatingSystemLanguage.g:898:1: ( '}' )
            {
            // InternalOperatingSystemLanguage.g:898:1: ( '}' )
            // InternalOperatingSystemLanguage.g:899:1: '}'
            {
             before(grammarAccess.getAPIRepositoryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAPIRepositoryAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRepository__Group__4__Impl"


    // $ANTLR start "rule__EnumerationDataType__Group__0"
    // InternalOperatingSystemLanguage.g:922:1: rule__EnumerationDataType__Group__0 : rule__EnumerationDataType__Group__0__Impl rule__EnumerationDataType__Group__1 ;
    public final void rule__EnumerationDataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:926:1: ( rule__EnumerationDataType__Group__0__Impl rule__EnumerationDataType__Group__1 )
            // InternalOperatingSystemLanguage.g:927:2: rule__EnumerationDataType__Group__0__Impl rule__EnumerationDataType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__EnumerationDataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationDataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataType__Group__0"


    // $ANTLR start "rule__EnumerationDataType__Group__0__Impl"
    // InternalOperatingSystemLanguage.g:934:1: rule__EnumerationDataType__Group__0__Impl : ( 'enum:' ) ;
    public final void rule__EnumerationDataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:938:1: ( ( 'enum:' ) )
            // InternalOperatingSystemLanguage.g:939:1: ( 'enum:' )
            {
            // InternalOperatingSystemLanguage.g:939:1: ( 'enum:' )
            // InternalOperatingSystemLanguage.g:940:1: 'enum:'
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getEnumKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumerationDataTypeAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataType__Group__0__Impl"


    // $ANTLR start "rule__EnumerationDataType__Group__1"
    // InternalOperatingSystemLanguage.g:953:1: rule__EnumerationDataType__Group__1 : rule__EnumerationDataType__Group__1__Impl rule__EnumerationDataType__Group__2 ;
    public final void rule__EnumerationDataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:957:1: ( rule__EnumerationDataType__Group__1__Impl rule__EnumerationDataType__Group__2 )
            // InternalOperatingSystemLanguage.g:958:2: rule__EnumerationDataType__Group__1__Impl rule__EnumerationDataType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__EnumerationDataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationDataType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataType__Group__1"


    // $ANTLR start "rule__EnumerationDataType__Group__1__Impl"
    // InternalOperatingSystemLanguage.g:965:1: rule__EnumerationDataType__Group__1__Impl : ( ( rule__EnumerationDataType__NameAssignment_1 ) ) ;
    public final void rule__EnumerationDataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:969:1: ( ( ( rule__EnumerationDataType__NameAssignment_1 ) ) )
            // InternalOperatingSystemLanguage.g:970:1: ( ( rule__EnumerationDataType__NameAssignment_1 ) )
            {
            // InternalOperatingSystemLanguage.g:970:1: ( ( rule__EnumerationDataType__NameAssignment_1 ) )
            // InternalOperatingSystemLanguage.g:971:1: ( rule__EnumerationDataType__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getNameAssignment_1()); 
            // InternalOperatingSystemLanguage.g:972:1: ( rule__EnumerationDataType__NameAssignment_1 )
            // InternalOperatingSystemLanguage.g:972:2: rule__EnumerationDataType__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationDataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataType__Group__1__Impl"


    // $ANTLR start "rule__EnumerationDataType__Group__2"
    // InternalOperatingSystemLanguage.g:982:1: rule__EnumerationDataType__Group__2 : rule__EnumerationDataType__Group__2__Impl rule__EnumerationDataType__Group__3 ;
    public final void rule__EnumerationDataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:986:1: ( rule__EnumerationDataType__Group__2__Impl rule__EnumerationDataType__Group__3 )
            // InternalOperatingSystemLanguage.g:987:2: rule__EnumerationDataType__Group__2__Impl rule__EnumerationDataType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__EnumerationDataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationDataType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataType__Group__2"


    // $ANTLR start "rule__EnumerationDataType__Group__2__Impl"
    // InternalOperatingSystemLanguage.g:994:1: rule__EnumerationDataType__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumerationDataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:998:1: ( ( '{' ) )
            // InternalOperatingSystemLanguage.g:999:1: ( '{' )
            {
            // InternalOperatingSystemLanguage.g:999:1: ( '{' )
            // InternalOperatingSystemLanguage.g:1000:1: '{'
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumerationDataTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataType__Group__2__Impl"


    // $ANTLR start "rule__EnumerationDataType__Group__3"
    // InternalOperatingSystemLanguage.g:1013:1: rule__EnumerationDataType__Group__3 : rule__EnumerationDataType__Group__3__Impl rule__EnumerationDataType__Group__4 ;
    public final void rule__EnumerationDataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1017:1: ( rule__EnumerationDataType__Group__3__Impl rule__EnumerationDataType__Group__4 )
            // InternalOperatingSystemLanguage.g:1018:2: rule__EnumerationDataType__Group__3__Impl rule__EnumerationDataType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__EnumerationDataType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationDataType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataType__Group__3"


    // $ANTLR start "rule__EnumerationDataType__Group__3__Impl"
    // InternalOperatingSystemLanguage.g:1025:1: rule__EnumerationDataType__Group__3__Impl : ( ( rule__EnumerationDataType__Group_3__0 )? ) ;
    public final void rule__EnumerationDataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1029:1: ( ( ( rule__EnumerationDataType__Group_3__0 )? ) )
            // InternalOperatingSystemLanguage.g:1030:1: ( ( rule__EnumerationDataType__Group_3__0 )? )
            {
            // InternalOperatingSystemLanguage.g:1030:1: ( ( rule__EnumerationDataType__Group_3__0 )? )
            // InternalOperatingSystemLanguage.g:1031:1: ( rule__EnumerationDataType__Group_3__0 )?
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getGroup_3()); 
            // InternalOperatingSystemLanguage.g:1032:1: ( rule__EnumerationDataType__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalOperatingSystemLanguage.g:1032:2: rule__EnumerationDataType__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__EnumerationDataType__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationDataTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataType__Group__3__Impl"


    // $ANTLR start "rule__EnumerationDataType__Group__4"
    // InternalOperatingSystemLanguage.g:1042:1: rule__EnumerationDataType__Group__4 : rule__EnumerationDataType__Group__4__Impl ;
    public final void rule__EnumerationDataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1046:1: ( rule__EnumerationDataType__Group__4__Impl )
            // InternalOperatingSystemLanguage.g:1047:2: rule__EnumerationDataType__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationDataType__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataType__Group__4"


    // $ANTLR start "rule__EnumerationDataType__Group__4__Impl"
    // InternalOperatingSystemLanguage.g:1053:1: rule__EnumerationDataType__Group__4__Impl : ( '}' ) ;
    public final void rule__EnumerationDataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1057:1: ( ( '}' ) )
            // InternalOperatingSystemLanguage.g:1058:1: ( '}' )
            {
            // InternalOperatingSystemLanguage.g:1058:1: ( '}' )
            // InternalOperatingSystemLanguage.g:1059:1: '}'
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumerationDataTypeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataType__Group__4__Impl"


    // $ANTLR start "rule__EnumerationDataType__Group_3__0"
    // InternalOperatingSystemLanguage.g:1082:1: rule__EnumerationDataType__Group_3__0 : rule__EnumerationDataType__Group_3__0__Impl rule__EnumerationDataType__Group_3__1 ;
    public final void rule__EnumerationDataType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1086:1: ( rule__EnumerationDataType__Group_3__0__Impl rule__EnumerationDataType__Group_3__1 )
            // InternalOperatingSystemLanguage.g:1087:2: rule__EnumerationDataType__Group_3__0__Impl rule__EnumerationDataType__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__EnumerationDataType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationDataType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataType__Group_3__0"


    // $ANTLR start "rule__EnumerationDataType__Group_3__0__Impl"
    // InternalOperatingSystemLanguage.g:1094:1: rule__EnumerationDataType__Group_3__0__Impl : ( ( rule__EnumerationDataType__EnumerationValuesAssignment_3_0 ) ) ;
    public final void rule__EnumerationDataType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1098:1: ( ( ( rule__EnumerationDataType__EnumerationValuesAssignment_3_0 ) ) )
            // InternalOperatingSystemLanguage.g:1099:1: ( ( rule__EnumerationDataType__EnumerationValuesAssignment_3_0 ) )
            {
            // InternalOperatingSystemLanguage.g:1099:1: ( ( rule__EnumerationDataType__EnumerationValuesAssignment_3_0 ) )
            // InternalOperatingSystemLanguage.g:1100:1: ( rule__EnumerationDataType__EnumerationValuesAssignment_3_0 )
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getEnumerationValuesAssignment_3_0()); 
            // InternalOperatingSystemLanguage.g:1101:1: ( rule__EnumerationDataType__EnumerationValuesAssignment_3_0 )
            // InternalOperatingSystemLanguage.g:1101:2: rule__EnumerationDataType__EnumerationValuesAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationDataType__EnumerationValuesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationDataTypeAccess().getEnumerationValuesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataType__Group_3__0__Impl"


    // $ANTLR start "rule__EnumerationDataType__Group_3__1"
    // InternalOperatingSystemLanguage.g:1111:1: rule__EnumerationDataType__Group_3__1 : rule__EnumerationDataType__Group_3__1__Impl ;
    public final void rule__EnumerationDataType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1115:1: ( rule__EnumerationDataType__Group_3__1__Impl )
            // InternalOperatingSystemLanguage.g:1116:2: rule__EnumerationDataType__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationDataType__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataType__Group_3__1"


    // $ANTLR start "rule__EnumerationDataType__Group_3__1__Impl"
    // InternalOperatingSystemLanguage.g:1122:1: rule__EnumerationDataType__Group_3__1__Impl : ( ( rule__EnumerationDataType__Group_3_1__0 )* ) ;
    public final void rule__EnumerationDataType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1126:1: ( ( ( rule__EnumerationDataType__Group_3_1__0 )* ) )
            // InternalOperatingSystemLanguage.g:1127:1: ( ( rule__EnumerationDataType__Group_3_1__0 )* )
            {
            // InternalOperatingSystemLanguage.g:1127:1: ( ( rule__EnumerationDataType__Group_3_1__0 )* )
            // InternalOperatingSystemLanguage.g:1128:1: ( rule__EnumerationDataType__Group_3_1__0 )*
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getGroup_3_1()); 
            // InternalOperatingSystemLanguage.g:1129:1: ( rule__EnumerationDataType__Group_3_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalOperatingSystemLanguage.g:1129:2: rule__EnumerationDataType__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    rule__EnumerationDataType__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEnumerationDataTypeAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataType__Group_3__1__Impl"


    // $ANTLR start "rule__EnumerationDataType__Group_3_1__0"
    // InternalOperatingSystemLanguage.g:1143:1: rule__EnumerationDataType__Group_3_1__0 : rule__EnumerationDataType__Group_3_1__0__Impl rule__EnumerationDataType__Group_3_1__1 ;
    public final void rule__EnumerationDataType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1147:1: ( rule__EnumerationDataType__Group_3_1__0__Impl rule__EnumerationDataType__Group_3_1__1 )
            // InternalOperatingSystemLanguage.g:1148:2: rule__EnumerationDataType__Group_3_1__0__Impl rule__EnumerationDataType__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__EnumerationDataType__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationDataType__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataType__Group_3_1__0"


    // $ANTLR start "rule__EnumerationDataType__Group_3_1__0__Impl"
    // InternalOperatingSystemLanguage.g:1155:1: rule__EnumerationDataType__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__EnumerationDataType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1159:1: ( ( ',' ) )
            // InternalOperatingSystemLanguage.g:1160:1: ( ',' )
            {
            // InternalOperatingSystemLanguage.g:1160:1: ( ',' )
            // InternalOperatingSystemLanguage.g:1161:1: ','
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getCommaKeyword_3_1_0()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumerationDataTypeAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataType__Group_3_1__0__Impl"


    // $ANTLR start "rule__EnumerationDataType__Group_3_1__1"
    // InternalOperatingSystemLanguage.g:1174:1: rule__EnumerationDataType__Group_3_1__1 : rule__EnumerationDataType__Group_3_1__1__Impl ;
    public final void rule__EnumerationDataType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1178:1: ( rule__EnumerationDataType__Group_3_1__1__Impl )
            // InternalOperatingSystemLanguage.g:1179:2: rule__EnumerationDataType__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationDataType__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataType__Group_3_1__1"


    // $ANTLR start "rule__EnumerationDataType__Group_3_1__1__Impl"
    // InternalOperatingSystemLanguage.g:1185:1: rule__EnumerationDataType__Group_3_1__1__Impl : ( ( rule__EnumerationDataType__EnumerationValuesAssignment_3_1_1 ) ) ;
    public final void rule__EnumerationDataType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1189:1: ( ( ( rule__EnumerationDataType__EnumerationValuesAssignment_3_1_1 ) ) )
            // InternalOperatingSystemLanguage.g:1190:1: ( ( rule__EnumerationDataType__EnumerationValuesAssignment_3_1_1 ) )
            {
            // InternalOperatingSystemLanguage.g:1190:1: ( ( rule__EnumerationDataType__EnumerationValuesAssignment_3_1_1 ) )
            // InternalOperatingSystemLanguage.g:1191:1: ( rule__EnumerationDataType__EnumerationValuesAssignment_3_1_1 )
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getEnumerationValuesAssignment_3_1_1()); 
            // InternalOperatingSystemLanguage.g:1192:1: ( rule__EnumerationDataType__EnumerationValuesAssignment_3_1_1 )
            // InternalOperatingSystemLanguage.g:1192:2: rule__EnumerationDataType__EnumerationValuesAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationDataType__EnumerationValuesAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationDataTypeAccess().getEnumerationValuesAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataType__Group_3_1__1__Impl"


    // $ANTLR start "rule__APICommand__Group__0"
    // InternalOperatingSystemLanguage.g:1206:1: rule__APICommand__Group__0 : rule__APICommand__Group__0__Impl rule__APICommand__Group__1 ;
    public final void rule__APICommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1210:1: ( rule__APICommand__Group__0__Impl rule__APICommand__Group__1 )
            // InternalOperatingSystemLanguage.g:1211:2: rule__APICommand__Group__0__Impl rule__APICommand__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__APICommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICommand__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group__0"


    // $ANTLR start "rule__APICommand__Group__0__Impl"
    // InternalOperatingSystemLanguage.g:1218:1: rule__APICommand__Group__0__Impl : ( ( rule__APICommand__ReturnDataTypeAssignment_0 ) ) ;
    public final void rule__APICommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1222:1: ( ( ( rule__APICommand__ReturnDataTypeAssignment_0 ) ) )
            // InternalOperatingSystemLanguage.g:1223:1: ( ( rule__APICommand__ReturnDataTypeAssignment_0 ) )
            {
            // InternalOperatingSystemLanguage.g:1223:1: ( ( rule__APICommand__ReturnDataTypeAssignment_0 ) )
            // InternalOperatingSystemLanguage.g:1224:1: ( rule__APICommand__ReturnDataTypeAssignment_0 )
            {
             before(grammarAccess.getAPICommandAccess().getReturnDataTypeAssignment_0()); 
            // InternalOperatingSystemLanguage.g:1225:1: ( rule__APICommand__ReturnDataTypeAssignment_0 )
            // InternalOperatingSystemLanguage.g:1225:2: rule__APICommand__ReturnDataTypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICommand__ReturnDataTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAPICommandAccess().getReturnDataTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group__0__Impl"


    // $ANTLR start "rule__APICommand__Group__1"
    // InternalOperatingSystemLanguage.g:1235:1: rule__APICommand__Group__1 : rule__APICommand__Group__1__Impl rule__APICommand__Group__2 ;
    public final void rule__APICommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1239:1: ( rule__APICommand__Group__1__Impl rule__APICommand__Group__2 )
            // InternalOperatingSystemLanguage.g:1240:2: rule__APICommand__Group__1__Impl rule__APICommand__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__APICommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICommand__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group__1"


    // $ANTLR start "rule__APICommand__Group__1__Impl"
    // InternalOperatingSystemLanguage.g:1247:1: rule__APICommand__Group__1__Impl : ( ( rule__APICommand__NameAssignment_1 ) ) ;
    public final void rule__APICommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1251:1: ( ( ( rule__APICommand__NameAssignment_1 ) ) )
            // InternalOperatingSystemLanguage.g:1252:1: ( ( rule__APICommand__NameAssignment_1 ) )
            {
            // InternalOperatingSystemLanguage.g:1252:1: ( ( rule__APICommand__NameAssignment_1 ) )
            // InternalOperatingSystemLanguage.g:1253:1: ( rule__APICommand__NameAssignment_1 )
            {
             before(grammarAccess.getAPICommandAccess().getNameAssignment_1()); 
            // InternalOperatingSystemLanguage.g:1254:1: ( rule__APICommand__NameAssignment_1 )
            // InternalOperatingSystemLanguage.g:1254:2: rule__APICommand__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICommand__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAPICommandAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group__1__Impl"


    // $ANTLR start "rule__APICommand__Group__2"
    // InternalOperatingSystemLanguage.g:1264:1: rule__APICommand__Group__2 : rule__APICommand__Group__2__Impl rule__APICommand__Group__3 ;
    public final void rule__APICommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1268:1: ( rule__APICommand__Group__2__Impl rule__APICommand__Group__3 )
            // InternalOperatingSystemLanguage.g:1269:2: rule__APICommand__Group__2__Impl rule__APICommand__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__APICommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICommand__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group__2"


    // $ANTLR start "rule__APICommand__Group__2__Impl"
    // InternalOperatingSystemLanguage.g:1276:1: rule__APICommand__Group__2__Impl : ( '(' ) ;
    public final void rule__APICommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1280:1: ( ( '(' ) )
            // InternalOperatingSystemLanguage.g:1281:1: ( '(' )
            {
            // InternalOperatingSystemLanguage.g:1281:1: ( '(' )
            // InternalOperatingSystemLanguage.g:1282:1: '('
            {
             before(grammarAccess.getAPICommandAccess().getLeftParenthesisKeyword_2()); 
            match(input,25,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAPICommandAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group__2__Impl"


    // $ANTLR start "rule__APICommand__Group__3"
    // InternalOperatingSystemLanguage.g:1295:1: rule__APICommand__Group__3 : rule__APICommand__Group__3__Impl rule__APICommand__Group__4 ;
    public final void rule__APICommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1299:1: ( rule__APICommand__Group__3__Impl rule__APICommand__Group__4 )
            // InternalOperatingSystemLanguage.g:1300:2: rule__APICommand__Group__3__Impl rule__APICommand__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__APICommand__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICommand__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group__3"


    // $ANTLR start "rule__APICommand__Group__3__Impl"
    // InternalOperatingSystemLanguage.g:1307:1: rule__APICommand__Group__3__Impl : ( ( rule__APICommand__Group_3__0 )? ) ;
    public final void rule__APICommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1311:1: ( ( ( rule__APICommand__Group_3__0 )? ) )
            // InternalOperatingSystemLanguage.g:1312:1: ( ( rule__APICommand__Group_3__0 )? )
            {
            // InternalOperatingSystemLanguage.g:1312:1: ( ( rule__APICommand__Group_3__0 )? )
            // InternalOperatingSystemLanguage.g:1313:1: ( rule__APICommand__Group_3__0 )?
            {
             before(grammarAccess.getAPICommandAccess().getGroup_3()); 
            // InternalOperatingSystemLanguage.g:1314:1: ( rule__APICommand__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalOperatingSystemLanguage.g:1314:2: rule__APICommand__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__APICommand__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAPICommandAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group__3__Impl"


    // $ANTLR start "rule__APICommand__Group__4"
    // InternalOperatingSystemLanguage.g:1324:1: rule__APICommand__Group__4 : rule__APICommand__Group__4__Impl rule__APICommand__Group__5 ;
    public final void rule__APICommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1328:1: ( rule__APICommand__Group__4__Impl rule__APICommand__Group__5 )
            // InternalOperatingSystemLanguage.g:1329:2: rule__APICommand__Group__4__Impl rule__APICommand__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__APICommand__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICommand__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group__4"


    // $ANTLR start "rule__APICommand__Group__4__Impl"
    // InternalOperatingSystemLanguage.g:1336:1: rule__APICommand__Group__4__Impl : ( ')' ) ;
    public final void rule__APICommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1340:1: ( ( ')' ) )
            // InternalOperatingSystemLanguage.g:1341:1: ( ')' )
            {
            // InternalOperatingSystemLanguage.g:1341:1: ( ')' )
            // InternalOperatingSystemLanguage.g:1342:1: ')'
            {
             before(grammarAccess.getAPICommandAccess().getRightParenthesisKeyword_4()); 
            match(input,26,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAPICommandAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group__4__Impl"


    // $ANTLR start "rule__APICommand__Group__5"
    // InternalOperatingSystemLanguage.g:1355:1: rule__APICommand__Group__5 : rule__APICommand__Group__5__Impl rule__APICommand__Group__6 ;
    public final void rule__APICommand__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1359:1: ( rule__APICommand__Group__5__Impl rule__APICommand__Group__6 )
            // InternalOperatingSystemLanguage.g:1360:2: rule__APICommand__Group__5__Impl rule__APICommand__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__APICommand__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICommand__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group__5"


    // $ANTLR start "rule__APICommand__Group__5__Impl"
    // InternalOperatingSystemLanguage.g:1367:1: rule__APICommand__Group__5__Impl : ( ( rule__APICommand__ConstraintsAssignment_5 )? ) ;
    public final void rule__APICommand__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1371:1: ( ( ( rule__APICommand__ConstraintsAssignment_5 )? ) )
            // InternalOperatingSystemLanguage.g:1372:1: ( ( rule__APICommand__ConstraintsAssignment_5 )? )
            {
            // InternalOperatingSystemLanguage.g:1372:1: ( ( rule__APICommand__ConstraintsAssignment_5 )? )
            // InternalOperatingSystemLanguage.g:1373:1: ( rule__APICommand__ConstraintsAssignment_5 )?
            {
             before(grammarAccess.getAPICommandAccess().getConstraintsAssignment_5()); 
            // InternalOperatingSystemLanguage.g:1374:1: ( rule__APICommand__ConstraintsAssignment_5 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOperatingSystemLanguage.g:1374:2: rule__APICommand__ConstraintsAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__APICommand__ConstraintsAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAPICommandAccess().getConstraintsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group__5__Impl"


    // $ANTLR start "rule__APICommand__Group__6"
    // InternalOperatingSystemLanguage.g:1384:1: rule__APICommand__Group__6 : rule__APICommand__Group__6__Impl ;
    public final void rule__APICommand__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1388:1: ( rule__APICommand__Group__6__Impl )
            // InternalOperatingSystemLanguage.g:1389:2: rule__APICommand__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICommand__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group__6"


    // $ANTLR start "rule__APICommand__Group__6__Impl"
    // InternalOperatingSystemLanguage.g:1395:1: rule__APICommand__Group__6__Impl : ( ';' ) ;
    public final void rule__APICommand__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1399:1: ( ( ';' ) )
            // InternalOperatingSystemLanguage.g:1400:1: ( ';' )
            {
            // InternalOperatingSystemLanguage.g:1400:1: ( ';' )
            // InternalOperatingSystemLanguage.g:1401:1: ';'
            {
             before(grammarAccess.getAPICommandAccess().getSemicolonKeyword_6()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAPICommandAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group__6__Impl"


    // $ANTLR start "rule__APICommand__Group_3__0"
    // InternalOperatingSystemLanguage.g:1428:1: rule__APICommand__Group_3__0 : rule__APICommand__Group_3__0__Impl rule__APICommand__Group_3__1 ;
    public final void rule__APICommand__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1432:1: ( rule__APICommand__Group_3__0__Impl rule__APICommand__Group_3__1 )
            // InternalOperatingSystemLanguage.g:1433:2: rule__APICommand__Group_3__0__Impl rule__APICommand__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__APICommand__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICommand__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group_3__0"


    // $ANTLR start "rule__APICommand__Group_3__0__Impl"
    // InternalOperatingSystemLanguage.g:1440:1: rule__APICommand__Group_3__0__Impl : ( ( rule__APICommand__ParametersAssignment_3_0 ) ) ;
    public final void rule__APICommand__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1444:1: ( ( ( rule__APICommand__ParametersAssignment_3_0 ) ) )
            // InternalOperatingSystemLanguage.g:1445:1: ( ( rule__APICommand__ParametersAssignment_3_0 ) )
            {
            // InternalOperatingSystemLanguage.g:1445:1: ( ( rule__APICommand__ParametersAssignment_3_0 ) )
            // InternalOperatingSystemLanguage.g:1446:1: ( rule__APICommand__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getAPICommandAccess().getParametersAssignment_3_0()); 
            // InternalOperatingSystemLanguage.g:1447:1: ( rule__APICommand__ParametersAssignment_3_0 )
            // InternalOperatingSystemLanguage.g:1447:2: rule__APICommand__ParametersAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICommand__ParametersAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAPICommandAccess().getParametersAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group_3__0__Impl"


    // $ANTLR start "rule__APICommand__Group_3__1"
    // InternalOperatingSystemLanguage.g:1457:1: rule__APICommand__Group_3__1 : rule__APICommand__Group_3__1__Impl ;
    public final void rule__APICommand__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1461:1: ( rule__APICommand__Group_3__1__Impl )
            // InternalOperatingSystemLanguage.g:1462:2: rule__APICommand__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICommand__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group_3__1"


    // $ANTLR start "rule__APICommand__Group_3__1__Impl"
    // InternalOperatingSystemLanguage.g:1468:1: rule__APICommand__Group_3__1__Impl : ( ( rule__APICommand__Group_3_1__0 )* ) ;
    public final void rule__APICommand__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1472:1: ( ( ( rule__APICommand__Group_3_1__0 )* ) )
            // InternalOperatingSystemLanguage.g:1473:1: ( ( rule__APICommand__Group_3_1__0 )* )
            {
            // InternalOperatingSystemLanguage.g:1473:1: ( ( rule__APICommand__Group_3_1__0 )* )
            // InternalOperatingSystemLanguage.g:1474:1: ( rule__APICommand__Group_3_1__0 )*
            {
             before(grammarAccess.getAPICommandAccess().getGroup_3_1()); 
            // InternalOperatingSystemLanguage.g:1475:1: ( rule__APICommand__Group_3_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOperatingSystemLanguage.g:1475:2: rule__APICommand__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    rule__APICommand__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAPICommandAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group_3__1__Impl"


    // $ANTLR start "rule__APICommand__Group_3_1__0"
    // InternalOperatingSystemLanguage.g:1489:1: rule__APICommand__Group_3_1__0 : rule__APICommand__Group_3_1__0__Impl rule__APICommand__Group_3_1__1 ;
    public final void rule__APICommand__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1493:1: ( rule__APICommand__Group_3_1__0__Impl rule__APICommand__Group_3_1__1 )
            // InternalOperatingSystemLanguage.g:1494:2: rule__APICommand__Group_3_1__0__Impl rule__APICommand__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__APICommand__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICommand__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group_3_1__0"


    // $ANTLR start "rule__APICommand__Group_3_1__0__Impl"
    // InternalOperatingSystemLanguage.g:1501:1: rule__APICommand__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__APICommand__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1505:1: ( ( ',' ) )
            // InternalOperatingSystemLanguage.g:1506:1: ( ',' )
            {
            // InternalOperatingSystemLanguage.g:1506:1: ( ',' )
            // InternalOperatingSystemLanguage.g:1507:1: ','
            {
             before(grammarAccess.getAPICommandAccess().getCommaKeyword_3_1_0()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAPICommandAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group_3_1__0__Impl"


    // $ANTLR start "rule__APICommand__Group_3_1__1"
    // InternalOperatingSystemLanguage.g:1520:1: rule__APICommand__Group_3_1__1 : rule__APICommand__Group_3_1__1__Impl ;
    public final void rule__APICommand__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1524:1: ( rule__APICommand__Group_3_1__1__Impl )
            // InternalOperatingSystemLanguage.g:1525:2: rule__APICommand__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICommand__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group_3_1__1"


    // $ANTLR start "rule__APICommand__Group_3_1__1__Impl"
    // InternalOperatingSystemLanguage.g:1531:1: rule__APICommand__Group_3_1__1__Impl : ( ( rule__APICommand__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__APICommand__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1535:1: ( ( ( rule__APICommand__ParametersAssignment_3_1_1 ) ) )
            // InternalOperatingSystemLanguage.g:1536:1: ( ( rule__APICommand__ParametersAssignment_3_1_1 ) )
            {
            // InternalOperatingSystemLanguage.g:1536:1: ( ( rule__APICommand__ParametersAssignment_3_1_1 ) )
            // InternalOperatingSystemLanguage.g:1537:1: ( rule__APICommand__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getAPICommandAccess().getParametersAssignment_3_1_1()); 
            // InternalOperatingSystemLanguage.g:1538:1: ( rule__APICommand__ParametersAssignment_3_1_1 )
            // InternalOperatingSystemLanguage.g:1538:2: rule__APICommand__ParametersAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICommand__ParametersAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAPICommandAccess().getParametersAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__Group_3_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalOperatingSystemLanguage.g:1552:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1556:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalOperatingSystemLanguage.g:1557:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalOperatingSystemLanguage.g:1564:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__DataTypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1568:1: ( ( ( rule__Parameter__DataTypeAssignment_0 ) ) )
            // InternalOperatingSystemLanguage.g:1569:1: ( ( rule__Parameter__DataTypeAssignment_0 ) )
            {
            // InternalOperatingSystemLanguage.g:1569:1: ( ( rule__Parameter__DataTypeAssignment_0 ) )
            // InternalOperatingSystemLanguage.g:1570:1: ( rule__Parameter__DataTypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getDataTypeAssignment_0()); 
            // InternalOperatingSystemLanguage.g:1571:1: ( rule__Parameter__DataTypeAssignment_0 )
            // InternalOperatingSystemLanguage.g:1571:2: rule__Parameter__DataTypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__DataTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getDataTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalOperatingSystemLanguage.g:1581:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1585:1: ( rule__Parameter__Group__1__Impl )
            // InternalOperatingSystemLanguage.g:1586:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalOperatingSystemLanguage.g:1592:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1596:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalOperatingSystemLanguage.g:1597:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalOperatingSystemLanguage.g:1597:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalOperatingSystemLanguage.g:1598:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalOperatingSystemLanguage.g:1599:1: ( rule__Parameter__NameAssignment_1 )
            // InternalOperatingSystemLanguage.g:1599:2: rule__Parameter__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__TimeConstraint__Group__0"
    // InternalOperatingSystemLanguage.g:1613:1: rule__TimeConstraint__Group__0 : rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 ;
    public final void rule__TimeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1617:1: ( rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 )
            // InternalOperatingSystemLanguage.g:1618:2: rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TimeConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TimeConstraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__0"


    // $ANTLR start "rule__TimeConstraint__Group__0__Impl"
    // InternalOperatingSystemLanguage.g:1625:1: rule__TimeConstraint__Group__0__Impl : ( '[' ) ;
    public final void rule__TimeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1629:1: ( ( '[' ) )
            // InternalOperatingSystemLanguage.g:1630:1: ( '[' )
            {
            // InternalOperatingSystemLanguage.g:1630:1: ( '[' )
            // InternalOperatingSystemLanguage.g:1631:1: '['
            {
             before(grammarAccess.getTimeConstraintAccess().getLeftSquareBracketKeyword_0()); 
            match(input,28,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTimeConstraintAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__0__Impl"


    // $ANTLR start "rule__TimeConstraint__Group__1"
    // InternalOperatingSystemLanguage.g:1644:1: rule__TimeConstraint__Group__1 : rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 ;
    public final void rule__TimeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1648:1: ( rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 )
            // InternalOperatingSystemLanguage.g:1649:2: rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__TimeConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TimeConstraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__1"


    // $ANTLR start "rule__TimeConstraint__Group__1__Impl"
    // InternalOperatingSystemLanguage.g:1656:1: rule__TimeConstraint__Group__1__Impl : ( ( rule__TimeConstraint__SamplingTimeAssignment_1 ) ) ;
    public final void rule__TimeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1660:1: ( ( ( rule__TimeConstraint__SamplingTimeAssignment_1 ) ) )
            // InternalOperatingSystemLanguage.g:1661:1: ( ( rule__TimeConstraint__SamplingTimeAssignment_1 ) )
            {
            // InternalOperatingSystemLanguage.g:1661:1: ( ( rule__TimeConstraint__SamplingTimeAssignment_1 ) )
            // InternalOperatingSystemLanguage.g:1662:1: ( rule__TimeConstraint__SamplingTimeAssignment_1 )
            {
             before(grammarAccess.getTimeConstraintAccess().getSamplingTimeAssignment_1()); 
            // InternalOperatingSystemLanguage.g:1663:1: ( rule__TimeConstraint__SamplingTimeAssignment_1 )
            // InternalOperatingSystemLanguage.g:1663:2: rule__TimeConstraint__SamplingTimeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TimeConstraint__SamplingTimeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeConstraintAccess().getSamplingTimeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__1__Impl"


    // $ANTLR start "rule__TimeConstraint__Group__2"
    // InternalOperatingSystemLanguage.g:1673:1: rule__TimeConstraint__Group__2 : rule__TimeConstraint__Group__2__Impl ;
    public final void rule__TimeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1677:1: ( rule__TimeConstraint__Group__2__Impl )
            // InternalOperatingSystemLanguage.g:1678:2: rule__TimeConstraint__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TimeConstraint__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__2"


    // $ANTLR start "rule__TimeConstraint__Group__2__Impl"
    // InternalOperatingSystemLanguage.g:1684:1: rule__TimeConstraint__Group__2__Impl : ( ']' ) ;
    public final void rule__TimeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1688:1: ( ( ']' ) )
            // InternalOperatingSystemLanguage.g:1689:1: ( ']' )
            {
            // InternalOperatingSystemLanguage.g:1689:1: ( ']' )
            // InternalOperatingSystemLanguage.g:1690:1: ']'
            {
             before(grammarAccess.getTimeConstraintAccess().getRightSquareBracketKeyword_2()); 
            match(input,29,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTimeConstraintAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__Group__2__Impl"


    // $ANTLR start "rule__TimeValue__Group__0"
    // InternalOperatingSystemLanguage.g:1709:1: rule__TimeValue__Group__0 : rule__TimeValue__Group__0__Impl rule__TimeValue__Group__1 ;
    public final void rule__TimeValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1713:1: ( rule__TimeValue__Group__0__Impl rule__TimeValue__Group__1 )
            // InternalOperatingSystemLanguage.g:1714:2: rule__TimeValue__Group__0__Impl rule__TimeValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalOperatingSystemLanguage.g:1721:1: rule__TimeValue__Group__0__Impl : ( ( rule__TimeValue__ValueAssignment_0 ) ) ;
    public final void rule__TimeValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1725:1: ( ( ( rule__TimeValue__ValueAssignment_0 ) ) )
            // InternalOperatingSystemLanguage.g:1726:1: ( ( rule__TimeValue__ValueAssignment_0 ) )
            {
            // InternalOperatingSystemLanguage.g:1726:1: ( ( rule__TimeValue__ValueAssignment_0 ) )
            // InternalOperatingSystemLanguage.g:1727:1: ( rule__TimeValue__ValueAssignment_0 )
            {
             before(grammarAccess.getTimeValueAccess().getValueAssignment_0()); 
            // InternalOperatingSystemLanguage.g:1728:1: ( rule__TimeValue__ValueAssignment_0 )
            // InternalOperatingSystemLanguage.g:1728:2: rule__TimeValue__ValueAssignment_0
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
    // InternalOperatingSystemLanguage.g:1738:1: rule__TimeValue__Group__1 : rule__TimeValue__Group__1__Impl ;
    public final void rule__TimeValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1742:1: ( rule__TimeValue__Group__1__Impl )
            // InternalOperatingSystemLanguage.g:1743:2: rule__TimeValue__Group__1__Impl
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
    // InternalOperatingSystemLanguage.g:1749:1: rule__TimeValue__Group__1__Impl : ( ( rule__TimeValue__UnitAssignment_1 ) ) ;
    public final void rule__TimeValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1753:1: ( ( ( rule__TimeValue__UnitAssignment_1 ) ) )
            // InternalOperatingSystemLanguage.g:1754:1: ( ( rule__TimeValue__UnitAssignment_1 ) )
            {
            // InternalOperatingSystemLanguage.g:1754:1: ( ( rule__TimeValue__UnitAssignment_1 ) )
            // InternalOperatingSystemLanguage.g:1755:1: ( rule__TimeValue__UnitAssignment_1 )
            {
             before(grammarAccess.getTimeValueAccess().getUnitAssignment_1()); 
            // InternalOperatingSystemLanguage.g:1756:1: ( rule__TimeValue__UnitAssignment_1 )
            // InternalOperatingSystemLanguage.g:1756:2: rule__TimeValue__UnitAssignment_1
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


    // $ANTLR start "rule__OperatingSystem__ImportsAssignment_0"
    // InternalOperatingSystemLanguage.g:1771:1: rule__OperatingSystem__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__OperatingSystem__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1775:1: ( ( ruleImport ) )
            // InternalOperatingSystemLanguage.g:1776:1: ( ruleImport )
            {
            // InternalOperatingSystemLanguage.g:1776:1: ( ruleImport )
            // InternalOperatingSystemLanguage.g:1777:1: ruleImport
            {
             before(grammarAccess.getOperatingSystemAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getOperatingSystemAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatingSystem__ImportsAssignment_0"


    // $ANTLR start "rule__OperatingSystem__NameAssignment_2"
    // InternalOperatingSystemLanguage.g:1786:1: rule__OperatingSystem__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__OperatingSystem__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1790:1: ( ( ruleEString ) )
            // InternalOperatingSystemLanguage.g:1791:1: ( ruleEString )
            {
            // InternalOperatingSystemLanguage.g:1791:1: ( ruleEString )
            // InternalOperatingSystemLanguage.g:1792:1: ruleEString
            {
             before(grammarAccess.getOperatingSystemAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperatingSystemAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatingSystem__NameAssignment_2"


    // $ANTLR start "rule__OperatingSystem__ApirepositoriesAssignment_4_0"
    // InternalOperatingSystemLanguage.g:1801:1: rule__OperatingSystem__ApirepositoriesAssignment_4_0 : ( ruleAPIRepository ) ;
    public final void rule__OperatingSystem__ApirepositoriesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1805:1: ( ( ruleAPIRepository ) )
            // InternalOperatingSystemLanguage.g:1806:1: ( ruleAPIRepository )
            {
            // InternalOperatingSystemLanguage.g:1806:1: ( ruleAPIRepository )
            // InternalOperatingSystemLanguage.g:1807:1: ruleAPIRepository
            {
             before(grammarAccess.getOperatingSystemAccess().getApirepositoriesAPIRepositoryParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAPIRepository();

            state._fsp--;

             after(grammarAccess.getOperatingSystemAccess().getApirepositoriesAPIRepositoryParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatingSystem__ApirepositoriesAssignment_4_0"


    // $ANTLR start "rule__OperatingSystem__EnumerationDataTypesAssignment_4_1"
    // InternalOperatingSystemLanguage.g:1816:1: rule__OperatingSystem__EnumerationDataTypesAssignment_4_1 : ( ruleEnumerationDataType ) ;
    public final void rule__OperatingSystem__EnumerationDataTypesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1820:1: ( ( ruleEnumerationDataType ) )
            // InternalOperatingSystemLanguage.g:1821:1: ( ruleEnumerationDataType )
            {
            // InternalOperatingSystemLanguage.g:1821:1: ( ruleEnumerationDataType )
            // InternalOperatingSystemLanguage.g:1822:1: ruleEnumerationDataType
            {
             before(grammarAccess.getOperatingSystemAccess().getEnumerationDataTypesEnumerationDataTypeParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEnumerationDataType();

            state._fsp--;

             after(grammarAccess.getOperatingSystemAccess().getEnumerationDataTypesEnumerationDataTypeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperatingSystem__EnumerationDataTypesAssignment_4_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // InternalOperatingSystemLanguage.g:1831:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1835:1: ( ( RULE_STRING ) )
            // InternalOperatingSystemLanguage.g:1836:1: ( RULE_STRING )
            {
            // InternalOperatingSystemLanguage.g:1836:1: ( RULE_STRING )
            // InternalOperatingSystemLanguage.g:1837:1: RULE_STRING
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


    // $ANTLR start "rule__APIRepository__NameAssignment_1"
    // InternalOperatingSystemLanguage.g:1846:1: rule__APIRepository__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__APIRepository__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1850:1: ( ( ruleEString ) )
            // InternalOperatingSystemLanguage.g:1851:1: ( ruleEString )
            {
            // InternalOperatingSystemLanguage.g:1851:1: ( ruleEString )
            // InternalOperatingSystemLanguage.g:1852:1: ruleEString
            {
             before(grammarAccess.getAPIRepositoryAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAPIRepositoryAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRepository__NameAssignment_1"


    // $ANTLR start "rule__APIRepository__ApiCommandsAssignment_3"
    // InternalOperatingSystemLanguage.g:1861:1: rule__APIRepository__ApiCommandsAssignment_3 : ( ruleAPICommand ) ;
    public final void rule__APIRepository__ApiCommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1865:1: ( ( ruleAPICommand ) )
            // InternalOperatingSystemLanguage.g:1866:1: ( ruleAPICommand )
            {
            // InternalOperatingSystemLanguage.g:1866:1: ( ruleAPICommand )
            // InternalOperatingSystemLanguage.g:1867:1: ruleAPICommand
            {
             before(grammarAccess.getAPIRepositoryAccess().getApiCommandsAPICommandParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAPICommand();

            state._fsp--;

             after(grammarAccess.getAPIRepositoryAccess().getApiCommandsAPICommandParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APIRepository__ApiCommandsAssignment_3"


    // $ANTLR start "rule__EnumerationDataType__NameAssignment_1"
    // InternalOperatingSystemLanguage.g:1876:1: rule__EnumerationDataType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__EnumerationDataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1880:1: ( ( ruleEString ) )
            // InternalOperatingSystemLanguage.g:1881:1: ( ruleEString )
            {
            // InternalOperatingSystemLanguage.g:1881:1: ( ruleEString )
            // InternalOperatingSystemLanguage.g:1882:1: ruleEString
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationDataTypeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataType__NameAssignment_1"


    // $ANTLR start "rule__EnumerationDataType__EnumerationValuesAssignment_3_0"
    // InternalOperatingSystemLanguage.g:1891:1: rule__EnumerationDataType__EnumerationValuesAssignment_3_0 : ( ruleEnumerationValue ) ;
    public final void rule__EnumerationDataType__EnumerationValuesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1895:1: ( ( ruleEnumerationValue ) )
            // InternalOperatingSystemLanguage.g:1896:1: ( ruleEnumerationValue )
            {
            // InternalOperatingSystemLanguage.g:1896:1: ( ruleEnumerationValue )
            // InternalOperatingSystemLanguage.g:1897:1: ruleEnumerationValue
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getEnumerationValuesEnumerationValueParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEnumerationValue();

            state._fsp--;

             after(grammarAccess.getEnumerationDataTypeAccess().getEnumerationValuesEnumerationValueParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataType__EnumerationValuesAssignment_3_0"


    // $ANTLR start "rule__EnumerationDataType__EnumerationValuesAssignment_3_1_1"
    // InternalOperatingSystemLanguage.g:1906:1: rule__EnumerationDataType__EnumerationValuesAssignment_3_1_1 : ( ruleEnumerationValue ) ;
    public final void rule__EnumerationDataType__EnumerationValuesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1910:1: ( ( ruleEnumerationValue ) )
            // InternalOperatingSystemLanguage.g:1911:1: ( ruleEnumerationValue )
            {
            // InternalOperatingSystemLanguage.g:1911:1: ( ruleEnumerationValue )
            // InternalOperatingSystemLanguage.g:1912:1: ruleEnumerationValue
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getEnumerationValuesEnumerationValueParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEnumerationValue();

            state._fsp--;

             after(grammarAccess.getEnumerationDataTypeAccess().getEnumerationValuesEnumerationValueParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataType__EnumerationValuesAssignment_3_1_1"


    // $ANTLR start "rule__APICommand__ReturnDataTypeAssignment_0"
    // InternalOperatingSystemLanguage.g:1921:1: rule__APICommand__ReturnDataTypeAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__APICommand__ReturnDataTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1925:1: ( ( ( ruleEString ) ) )
            // InternalOperatingSystemLanguage.g:1926:1: ( ( ruleEString ) )
            {
            // InternalOperatingSystemLanguage.g:1926:1: ( ( ruleEString ) )
            // InternalOperatingSystemLanguage.g:1927:1: ( ruleEString )
            {
             before(grammarAccess.getAPICommandAccess().getReturnDataTypeDataTypeCrossReference_0_0()); 
            // InternalOperatingSystemLanguage.g:1928:1: ( ruleEString )
            // InternalOperatingSystemLanguage.g:1929:1: ruleEString
            {
             before(grammarAccess.getAPICommandAccess().getReturnDataTypeDataTypeEStringParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAPICommandAccess().getReturnDataTypeDataTypeEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAPICommandAccess().getReturnDataTypeDataTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__ReturnDataTypeAssignment_0"


    // $ANTLR start "rule__APICommand__NameAssignment_1"
    // InternalOperatingSystemLanguage.g:1940:1: rule__APICommand__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__APICommand__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1944:1: ( ( ruleEString ) )
            // InternalOperatingSystemLanguage.g:1945:1: ( ruleEString )
            {
            // InternalOperatingSystemLanguage.g:1945:1: ( ruleEString )
            // InternalOperatingSystemLanguage.g:1946:1: ruleEString
            {
             before(grammarAccess.getAPICommandAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAPICommandAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__NameAssignment_1"


    // $ANTLR start "rule__APICommand__ParametersAssignment_3_0"
    // InternalOperatingSystemLanguage.g:1955:1: rule__APICommand__ParametersAssignment_3_0 : ( ruleParameter ) ;
    public final void rule__APICommand__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1959:1: ( ( ruleParameter ) )
            // InternalOperatingSystemLanguage.g:1960:1: ( ruleParameter )
            {
            // InternalOperatingSystemLanguage.g:1960:1: ( ruleParameter )
            // InternalOperatingSystemLanguage.g:1961:1: ruleParameter
            {
             before(grammarAccess.getAPICommandAccess().getParametersParameterParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getAPICommandAccess().getParametersParameterParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__ParametersAssignment_3_0"


    // $ANTLR start "rule__APICommand__ParametersAssignment_3_1_1"
    // InternalOperatingSystemLanguage.g:1970:1: rule__APICommand__ParametersAssignment_3_1_1 : ( ruleParameter ) ;
    public final void rule__APICommand__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1974:1: ( ( ruleParameter ) )
            // InternalOperatingSystemLanguage.g:1975:1: ( ruleParameter )
            {
            // InternalOperatingSystemLanguage.g:1975:1: ( ruleParameter )
            // InternalOperatingSystemLanguage.g:1976:1: ruleParameter
            {
             before(grammarAccess.getAPICommandAccess().getParametersParameterParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getAPICommandAccess().getParametersParameterParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__ParametersAssignment_3_1_1"


    // $ANTLR start "rule__APICommand__ConstraintsAssignment_5"
    // InternalOperatingSystemLanguage.g:1985:1: rule__APICommand__ConstraintsAssignment_5 : ( ruleTimeConstraint ) ;
    public final void rule__APICommand__ConstraintsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1989:1: ( ( ruleTimeConstraint ) )
            // InternalOperatingSystemLanguage.g:1990:1: ( ruleTimeConstraint )
            {
            // InternalOperatingSystemLanguage.g:1990:1: ( ruleTimeConstraint )
            // InternalOperatingSystemLanguage.g:1991:1: ruleTimeConstraint
            {
             before(grammarAccess.getAPICommandAccess().getConstraintsTimeConstraintParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTimeConstraint();

            state._fsp--;

             after(grammarAccess.getAPICommandAccess().getConstraintsTimeConstraintParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICommand__ConstraintsAssignment_5"


    // $ANTLR start "rule__Parameter__DataTypeAssignment_0"
    // InternalOperatingSystemLanguage.g:2000:1: rule__Parameter__DataTypeAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Parameter__DataTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2004:1: ( ( ( ruleEString ) ) )
            // InternalOperatingSystemLanguage.g:2005:1: ( ( ruleEString ) )
            {
            // InternalOperatingSystemLanguage.g:2005:1: ( ( ruleEString ) )
            // InternalOperatingSystemLanguage.g:2006:1: ( ruleEString )
            {
             before(grammarAccess.getParameterAccess().getDataTypeDataTypeCrossReference_0_0()); 
            // InternalOperatingSystemLanguage.g:2007:1: ( ruleEString )
            // InternalOperatingSystemLanguage.g:2008:1: ruleEString
            {
             before(grammarAccess.getParameterAccess().getDataTypeDataTypeEStringParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getDataTypeDataTypeEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getDataTypeDataTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__DataTypeAssignment_0"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalOperatingSystemLanguage.g:2019:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2023:1: ( ( ruleEString ) )
            // InternalOperatingSystemLanguage.g:2024:1: ( ruleEString )
            {
            // InternalOperatingSystemLanguage.g:2024:1: ( ruleEString )
            // InternalOperatingSystemLanguage.g:2025:1: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__EnumerationValue__ValueAssignment"
    // InternalOperatingSystemLanguage.g:2034:1: rule__EnumerationValue__ValueAssignment : ( ruleEString ) ;
    public final void rule__EnumerationValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2038:1: ( ( ruleEString ) )
            // InternalOperatingSystemLanguage.g:2039:1: ( ruleEString )
            {
            // InternalOperatingSystemLanguage.g:2039:1: ( ruleEString )
            // InternalOperatingSystemLanguage.g:2040:1: ruleEString
            {
             before(grammarAccess.getEnumerationValueAccess().getValueEStringParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationValueAccess().getValueEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValue__ValueAssignment"


    // $ANTLR start "rule__TimeConstraint__SamplingTimeAssignment_1"
    // InternalOperatingSystemLanguage.g:2049:1: rule__TimeConstraint__SamplingTimeAssignment_1 : ( ruleTimeValue ) ;
    public final void rule__TimeConstraint__SamplingTimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2053:1: ( ( ruleTimeValue ) )
            // InternalOperatingSystemLanguage.g:2054:1: ( ruleTimeValue )
            {
            // InternalOperatingSystemLanguage.g:2054:1: ( ruleTimeValue )
            // InternalOperatingSystemLanguage.g:2055:1: ruleTimeValue
            {
             before(grammarAccess.getTimeConstraintAccess().getSamplingTimeTimeValueParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTimeValue();

            state._fsp--;

             after(grammarAccess.getTimeConstraintAccess().getSamplingTimeTimeValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeConstraint__SamplingTimeAssignment_1"


    // $ANTLR start "rule__TimeValue__ValueAssignment_0"
    // InternalOperatingSystemLanguage.g:2064:1: rule__TimeValue__ValueAssignment_0 : ( ruleINTExpression ) ;
    public final void rule__TimeValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2068:1: ( ( ruleINTExpression ) )
            // InternalOperatingSystemLanguage.g:2069:1: ( ruleINTExpression )
            {
            // InternalOperatingSystemLanguage.g:2069:1: ( ruleINTExpression )
            // InternalOperatingSystemLanguage.g:2070:1: ruleINTExpression
            {
             before(grammarAccess.getTimeValueAccess().getValueINTExpressionParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleINTExpression();

            state._fsp--;

             after(grammarAccess.getTimeValueAccess().getValueINTExpressionParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalOperatingSystemLanguage.g:2079:1: rule__TimeValue__UnitAssignment_1 : ( ruleTimeUnitExpr ) ;
    public final void rule__TimeValue__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2083:1: ( ( ruleTimeUnitExpr ) )
            // InternalOperatingSystemLanguage.g:2084:1: ( ruleTimeUnitExpr )
            {
            // InternalOperatingSystemLanguage.g:2084:1: ( ruleTimeUnitExpr )
            // InternalOperatingSystemLanguage.g:2085:1: ruleTimeUnitExpr
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


    // $ANTLR start "rule__INTExpression__ValueAssignment"
    // InternalOperatingSystemLanguage.g:2094:1: rule__INTExpression__ValueAssignment : ( ruleEString ) ;
    public final void rule__INTExpression__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2098:1: ( ( ruleEString ) )
            // InternalOperatingSystemLanguage.g:2099:1: ( ruleEString )
            {
            // InternalOperatingSystemLanguage.g:2099:1: ( ruleEString )
            // InternalOperatingSystemLanguage.g:2100:1: ruleEString
            {
             before(grammarAccess.getINTExpressionAccess().getValueEStringParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getINTExpressionAccess().getValueEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INTExpression__ValueAssignment"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000D00000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000C00002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100030L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000030L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000003F800L});
    }


}