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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_NUMBER", "RULE_BOOLEAN", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DAYS'", "'HOURS'", "'MILLISECONDS'", "'MINUTES'", "'SECONDS'", "'MICROSECONDS'", "'NANOSECONDS'", "'null'", "'OperatingSystem:'", "'{'", "'}'", "'import'", "'Device_API_Calls:'", "'enum:'", "','", "'('", "')'", "';'", "'['", "']'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_NUMBER=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
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


    // $ANTLR start "entryRuleTimeUnitExpr"
    // InternalOperatingSystemLanguage.g:340:1: entryRuleTimeUnitExpr : ruleTimeUnitExpr EOF ;
    public final void entryRuleTimeUnitExpr() throws RecognitionException {
        try {
            // InternalOperatingSystemLanguage.g:341:1: ( ruleTimeUnitExpr EOF )
            // InternalOperatingSystemLanguage.g:342:1: ruleTimeUnitExpr EOF
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
    // InternalOperatingSystemLanguage.g:349:1: ruleTimeUnitExpr : ( ( rule__TimeUnitExpr__Alternatives ) ) ;
    public final void ruleTimeUnitExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:353:2: ( ( ( rule__TimeUnitExpr__Alternatives ) ) )
            // InternalOperatingSystemLanguage.g:354:1: ( ( rule__TimeUnitExpr__Alternatives ) )
            {
            // InternalOperatingSystemLanguage.g:354:1: ( ( rule__TimeUnitExpr__Alternatives ) )
            // InternalOperatingSystemLanguage.g:355:1: ( rule__TimeUnitExpr__Alternatives )
            {
             before(grammarAccess.getTimeUnitExprAccess().getAlternatives()); 
            // InternalOperatingSystemLanguage.g:356:1: ( rule__TimeUnitExpr__Alternatives )
            // InternalOperatingSystemLanguage.g:356:2: rule__TimeUnitExpr__Alternatives
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


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalOperatingSystemLanguage.g:368:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalOperatingSystemLanguage.g:369:1: ( ruleLiteralExpression EOF )
            // InternalOperatingSystemLanguage.g:370:1: ruleLiteralExpression EOF
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
    // InternalOperatingSystemLanguage.g:377:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Group__0 ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:381:2: ( ( ( rule__LiteralExpression__Group__0 ) ) )
            // InternalOperatingSystemLanguage.g:382:1: ( ( rule__LiteralExpression__Group__0 ) )
            {
            // InternalOperatingSystemLanguage.g:382:1: ( ( rule__LiteralExpression__Group__0 ) )
            // InternalOperatingSystemLanguage.g:383:1: ( rule__LiteralExpression__Group__0 )
            {
             before(grammarAccess.getLiteralExpressionAccess().getGroup()); 
            // InternalOperatingSystemLanguage.g:384:1: ( rule__LiteralExpression__Group__0 )
            // InternalOperatingSystemLanguage.g:384:2: rule__LiteralExpression__Group__0
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
    // InternalOperatingSystemLanguage.g:396:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalOperatingSystemLanguage.g:397:1: ( ruleLiteral EOF )
            // InternalOperatingSystemLanguage.g:398:1: ruleLiteral EOF
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
    // InternalOperatingSystemLanguage.g:405:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:409:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalOperatingSystemLanguage.g:410:1: ( ( rule__Literal__Alternatives ) )
            {
            // InternalOperatingSystemLanguage.g:410:1: ( ( rule__Literal__Alternatives ) )
            // InternalOperatingSystemLanguage.g:411:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalOperatingSystemLanguage.g:412:1: ( rule__Literal__Alternatives )
            // InternalOperatingSystemLanguage.g:412:2: rule__Literal__Alternatives
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


    // $ANTLR start "rule__OperatingSystem__Alternatives_4"
    // InternalOperatingSystemLanguage.g:424:1: rule__OperatingSystem__Alternatives_4 : ( ( ( rule__OperatingSystem__ApirepositoriesAssignment_4_0 ) ) | ( ( rule__OperatingSystem__EnumerationDataTypesAssignment_4_1 ) ) );
    public final void rule__OperatingSystem__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:428:1: ( ( ( rule__OperatingSystem__ApirepositoriesAssignment_4_0 ) ) | ( ( rule__OperatingSystem__EnumerationDataTypesAssignment_4_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==25) ) {
                alt1=1;
            }
            else if ( (LA1_0==26) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalOperatingSystemLanguage.g:429:1: ( ( rule__OperatingSystem__ApirepositoriesAssignment_4_0 ) )
                    {
                    // InternalOperatingSystemLanguage.g:429:1: ( ( rule__OperatingSystem__ApirepositoriesAssignment_4_0 ) )
                    // InternalOperatingSystemLanguage.g:430:1: ( rule__OperatingSystem__ApirepositoriesAssignment_4_0 )
                    {
                     before(grammarAccess.getOperatingSystemAccess().getApirepositoriesAssignment_4_0()); 
                    // InternalOperatingSystemLanguage.g:431:1: ( rule__OperatingSystem__ApirepositoriesAssignment_4_0 )
                    // InternalOperatingSystemLanguage.g:431:2: rule__OperatingSystem__ApirepositoriesAssignment_4_0
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
                    // InternalOperatingSystemLanguage.g:435:6: ( ( rule__OperatingSystem__EnumerationDataTypesAssignment_4_1 ) )
                    {
                    // InternalOperatingSystemLanguage.g:435:6: ( ( rule__OperatingSystem__EnumerationDataTypesAssignment_4_1 ) )
                    // InternalOperatingSystemLanguage.g:436:1: ( rule__OperatingSystem__EnumerationDataTypesAssignment_4_1 )
                    {
                     before(grammarAccess.getOperatingSystemAccess().getEnumerationDataTypesAssignment_4_1()); 
                    // InternalOperatingSystemLanguage.g:437:1: ( rule__OperatingSystem__EnumerationDataTypesAssignment_4_1 )
                    // InternalOperatingSystemLanguage.g:437:2: rule__OperatingSystem__EnumerationDataTypesAssignment_4_1
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
    // InternalOperatingSystemLanguage.g:446:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:450:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalOperatingSystemLanguage.g:451:1: ( RULE_STRING )
                    {
                    // InternalOperatingSystemLanguage.g:451:1: ( RULE_STRING )
                    // InternalOperatingSystemLanguage.g:452:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOperatingSystemLanguage.g:457:6: ( RULE_ID )
                    {
                    // InternalOperatingSystemLanguage.g:457:6: ( RULE_ID )
                    // InternalOperatingSystemLanguage.g:458:1: RULE_ID
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
    // InternalOperatingSystemLanguage.g:468:1: rule__TimeUnitExpr__Alternatives : ( ( 'DAYS' ) | ( 'HOURS' ) | ( 'MILLISECONDS' ) | ( 'MINUTES' ) | ( 'SECONDS' ) | ( 'MICROSECONDS' ) | ( 'NANOSECONDS' ) );
    public final void rule__TimeUnitExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:472:1: ( ( 'DAYS' ) | ( 'HOURS' ) | ( 'MILLISECONDS' ) | ( 'MINUTES' ) | ( 'SECONDS' ) | ( 'MICROSECONDS' ) | ( 'NANOSECONDS' ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            case 18:
                {
                alt3=6;
                }
                break;
            case 19:
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
                    // InternalOperatingSystemLanguage.g:473:1: ( 'DAYS' )
                    {
                    // InternalOperatingSystemLanguage.g:473:1: ( 'DAYS' )
                    // InternalOperatingSystemLanguage.g:474:1: 'DAYS'
                    {
                     before(grammarAccess.getTimeUnitExprAccess().getDAYSKeyword_0()); 
                    match(input,13,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTimeUnitExprAccess().getDAYSKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOperatingSystemLanguage.g:481:6: ( 'HOURS' )
                    {
                    // InternalOperatingSystemLanguage.g:481:6: ( 'HOURS' )
                    // InternalOperatingSystemLanguage.g:482:1: 'HOURS'
                    {
                     before(grammarAccess.getTimeUnitExprAccess().getHOURSKeyword_1()); 
                    match(input,14,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTimeUnitExprAccess().getHOURSKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOperatingSystemLanguage.g:489:6: ( 'MILLISECONDS' )
                    {
                    // InternalOperatingSystemLanguage.g:489:6: ( 'MILLISECONDS' )
                    // InternalOperatingSystemLanguage.g:490:1: 'MILLISECONDS'
                    {
                     before(grammarAccess.getTimeUnitExprAccess().getMILLISECONDSKeyword_2()); 
                    match(input,15,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTimeUnitExprAccess().getMILLISECONDSKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOperatingSystemLanguage.g:497:6: ( 'MINUTES' )
                    {
                    // InternalOperatingSystemLanguage.g:497:6: ( 'MINUTES' )
                    // InternalOperatingSystemLanguage.g:498:1: 'MINUTES'
                    {
                     before(grammarAccess.getTimeUnitExprAccess().getMINUTESKeyword_3()); 
                    match(input,16,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTimeUnitExprAccess().getMINUTESKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalOperatingSystemLanguage.g:505:6: ( 'SECONDS' )
                    {
                    // InternalOperatingSystemLanguage.g:505:6: ( 'SECONDS' )
                    // InternalOperatingSystemLanguage.g:506:1: 'SECONDS'
                    {
                     before(grammarAccess.getTimeUnitExprAccess().getSECONDSKeyword_4()); 
                    match(input,17,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTimeUnitExprAccess().getSECONDSKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalOperatingSystemLanguage.g:513:6: ( 'MICROSECONDS' )
                    {
                    // InternalOperatingSystemLanguage.g:513:6: ( 'MICROSECONDS' )
                    // InternalOperatingSystemLanguage.g:514:1: 'MICROSECONDS'
                    {
                     before(grammarAccess.getTimeUnitExprAccess().getMICROSECONDSKeyword_5()); 
                    match(input,18,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getTimeUnitExprAccess().getMICROSECONDSKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalOperatingSystemLanguage.g:521:6: ( 'NANOSECONDS' )
                    {
                    // InternalOperatingSystemLanguage.g:521:6: ( 'NANOSECONDS' )
                    // InternalOperatingSystemLanguage.g:522:1: 'NANOSECONDS'
                    {
                     before(grammarAccess.getTimeUnitExprAccess().getNANOSECONDSKeyword_6()); 
                    match(input,19,FollowSets000.FOLLOW_2); 
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


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalOperatingSystemLanguage.g:534:1: rule__Literal__Alternatives : ( ( RULE_NUMBER ) | ( RULE_BOOLEAN ) | ( RULE_INT ) | ( 'null' ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:538:1: ( ( RULE_NUMBER ) | ( RULE_BOOLEAN ) | ( RULE_INT ) | ( 'null' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
                {
                alt4=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt4=2;
                }
                break;
            case RULE_INT:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalOperatingSystemLanguage.g:539:1: ( RULE_NUMBER )
                    {
                    // InternalOperatingSystemLanguage.g:539:1: ( RULE_NUMBER )
                    // InternalOperatingSystemLanguage.g:540:1: RULE_NUMBER
                    {
                     before(grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0()); 
                    match(input,RULE_NUMBER,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalOperatingSystemLanguage.g:545:6: ( RULE_BOOLEAN )
                    {
                    // InternalOperatingSystemLanguage.g:545:6: ( RULE_BOOLEAN )
                    // InternalOperatingSystemLanguage.g:546:1: RULE_BOOLEAN
                    {
                     before(grammarAccess.getLiteralAccess().getBOOLEANTerminalRuleCall_1()); 
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getBOOLEANTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalOperatingSystemLanguage.g:551:6: ( RULE_INT )
                    {
                    // InternalOperatingSystemLanguage.g:551:6: ( RULE_INT )
                    // InternalOperatingSystemLanguage.g:552:1: RULE_INT
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalOperatingSystemLanguage.g:557:6: ( 'null' )
                    {
                    // InternalOperatingSystemLanguage.g:557:6: ( 'null' )
                    // InternalOperatingSystemLanguage.g:558:1: 'null'
                    {
                     before(grammarAccess.getLiteralAccess().getNullKeyword_3()); 
                    match(input,20,FollowSets000.FOLLOW_2); 
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


    // $ANTLR start "rule__OperatingSystem__Group__0"
    // InternalOperatingSystemLanguage.g:572:1: rule__OperatingSystem__Group__0 : rule__OperatingSystem__Group__0__Impl rule__OperatingSystem__Group__1 ;
    public final void rule__OperatingSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:576:1: ( rule__OperatingSystem__Group__0__Impl rule__OperatingSystem__Group__1 )
            // InternalOperatingSystemLanguage.g:577:2: rule__OperatingSystem__Group__0__Impl rule__OperatingSystem__Group__1
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
    // InternalOperatingSystemLanguage.g:584:1: rule__OperatingSystem__Group__0__Impl : ( ( rule__OperatingSystem__ImportsAssignment_0 )* ) ;
    public final void rule__OperatingSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:588:1: ( ( ( rule__OperatingSystem__ImportsAssignment_0 )* ) )
            // InternalOperatingSystemLanguage.g:589:1: ( ( rule__OperatingSystem__ImportsAssignment_0 )* )
            {
            // InternalOperatingSystemLanguage.g:589:1: ( ( rule__OperatingSystem__ImportsAssignment_0 )* )
            // InternalOperatingSystemLanguage.g:590:1: ( rule__OperatingSystem__ImportsAssignment_0 )*
            {
             before(grammarAccess.getOperatingSystemAccess().getImportsAssignment_0()); 
            // InternalOperatingSystemLanguage.g:591:1: ( rule__OperatingSystem__ImportsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalOperatingSystemLanguage.g:591:2: rule__OperatingSystem__ImportsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__OperatingSystem__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalOperatingSystemLanguage.g:601:1: rule__OperatingSystem__Group__1 : rule__OperatingSystem__Group__1__Impl rule__OperatingSystem__Group__2 ;
    public final void rule__OperatingSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:605:1: ( rule__OperatingSystem__Group__1__Impl rule__OperatingSystem__Group__2 )
            // InternalOperatingSystemLanguage.g:606:2: rule__OperatingSystem__Group__1__Impl rule__OperatingSystem__Group__2
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
    // InternalOperatingSystemLanguage.g:613:1: rule__OperatingSystem__Group__1__Impl : ( 'OperatingSystem:' ) ;
    public final void rule__OperatingSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:617:1: ( ( 'OperatingSystem:' ) )
            // InternalOperatingSystemLanguage.g:618:1: ( 'OperatingSystem:' )
            {
            // InternalOperatingSystemLanguage.g:618:1: ( 'OperatingSystem:' )
            // InternalOperatingSystemLanguage.g:619:1: 'OperatingSystem:'
            {
             before(grammarAccess.getOperatingSystemAccess().getOperatingSystemKeyword_1()); 
            match(input,21,FollowSets000.FOLLOW_2); 
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
    // InternalOperatingSystemLanguage.g:632:1: rule__OperatingSystem__Group__2 : rule__OperatingSystem__Group__2__Impl rule__OperatingSystem__Group__3 ;
    public final void rule__OperatingSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:636:1: ( rule__OperatingSystem__Group__2__Impl rule__OperatingSystem__Group__3 )
            // InternalOperatingSystemLanguage.g:637:2: rule__OperatingSystem__Group__2__Impl rule__OperatingSystem__Group__3
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
    // InternalOperatingSystemLanguage.g:644:1: rule__OperatingSystem__Group__2__Impl : ( ( rule__OperatingSystem__NameAssignment_2 ) ) ;
    public final void rule__OperatingSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:648:1: ( ( ( rule__OperatingSystem__NameAssignment_2 ) ) )
            // InternalOperatingSystemLanguage.g:649:1: ( ( rule__OperatingSystem__NameAssignment_2 ) )
            {
            // InternalOperatingSystemLanguage.g:649:1: ( ( rule__OperatingSystem__NameAssignment_2 ) )
            // InternalOperatingSystemLanguage.g:650:1: ( rule__OperatingSystem__NameAssignment_2 )
            {
             before(grammarAccess.getOperatingSystemAccess().getNameAssignment_2()); 
            // InternalOperatingSystemLanguage.g:651:1: ( rule__OperatingSystem__NameAssignment_2 )
            // InternalOperatingSystemLanguage.g:651:2: rule__OperatingSystem__NameAssignment_2
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
    // InternalOperatingSystemLanguage.g:661:1: rule__OperatingSystem__Group__3 : rule__OperatingSystem__Group__3__Impl rule__OperatingSystem__Group__4 ;
    public final void rule__OperatingSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:665:1: ( rule__OperatingSystem__Group__3__Impl rule__OperatingSystem__Group__4 )
            // InternalOperatingSystemLanguage.g:666:2: rule__OperatingSystem__Group__3__Impl rule__OperatingSystem__Group__4
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
    // InternalOperatingSystemLanguage.g:673:1: rule__OperatingSystem__Group__3__Impl : ( '{' ) ;
    public final void rule__OperatingSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:677:1: ( ( '{' ) )
            // InternalOperatingSystemLanguage.g:678:1: ( '{' )
            {
            // InternalOperatingSystemLanguage.g:678:1: ( '{' )
            // InternalOperatingSystemLanguage.g:679:1: '{'
            {
             before(grammarAccess.getOperatingSystemAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,22,FollowSets000.FOLLOW_2); 
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
    // InternalOperatingSystemLanguage.g:692:1: rule__OperatingSystem__Group__4 : rule__OperatingSystem__Group__4__Impl rule__OperatingSystem__Group__5 ;
    public final void rule__OperatingSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:696:1: ( rule__OperatingSystem__Group__4__Impl rule__OperatingSystem__Group__5 )
            // InternalOperatingSystemLanguage.g:697:2: rule__OperatingSystem__Group__4__Impl rule__OperatingSystem__Group__5
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
    // InternalOperatingSystemLanguage.g:704:1: rule__OperatingSystem__Group__4__Impl : ( ( rule__OperatingSystem__Alternatives_4 )* ) ;
    public final void rule__OperatingSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:708:1: ( ( ( rule__OperatingSystem__Alternatives_4 )* ) )
            // InternalOperatingSystemLanguage.g:709:1: ( ( rule__OperatingSystem__Alternatives_4 )* )
            {
            // InternalOperatingSystemLanguage.g:709:1: ( ( rule__OperatingSystem__Alternatives_4 )* )
            // InternalOperatingSystemLanguage.g:710:1: ( rule__OperatingSystem__Alternatives_4 )*
            {
             before(grammarAccess.getOperatingSystemAccess().getAlternatives_4()); 
            // InternalOperatingSystemLanguage.g:711:1: ( rule__OperatingSystem__Alternatives_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=25 && LA6_0<=26)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalOperatingSystemLanguage.g:711:2: rule__OperatingSystem__Alternatives_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__OperatingSystem__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalOperatingSystemLanguage.g:721:1: rule__OperatingSystem__Group__5 : rule__OperatingSystem__Group__5__Impl ;
    public final void rule__OperatingSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:725:1: ( rule__OperatingSystem__Group__5__Impl )
            // InternalOperatingSystemLanguage.g:726:2: rule__OperatingSystem__Group__5__Impl
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
    // InternalOperatingSystemLanguage.g:732:1: rule__OperatingSystem__Group__5__Impl : ( '}' ) ;
    public final void rule__OperatingSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:736:1: ( ( '}' ) )
            // InternalOperatingSystemLanguage.g:737:1: ( '}' )
            {
            // InternalOperatingSystemLanguage.g:737:1: ( '}' )
            // InternalOperatingSystemLanguage.g:738:1: '}'
            {
             before(grammarAccess.getOperatingSystemAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FollowSets000.FOLLOW_2); 
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
    // InternalOperatingSystemLanguage.g:763:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:767:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalOperatingSystemLanguage.g:768:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalOperatingSystemLanguage.g:775:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:779:1: ( ( 'import' ) )
            // InternalOperatingSystemLanguage.g:780:1: ( 'import' )
            {
            // InternalOperatingSystemLanguage.g:780:1: ( 'import' )
            // InternalOperatingSystemLanguage.g:781:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_2); 
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
    // InternalOperatingSystemLanguage.g:794:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:798:1: ( rule__Import__Group__1__Impl )
            // InternalOperatingSystemLanguage.g:799:2: rule__Import__Group__1__Impl
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
    // InternalOperatingSystemLanguage.g:805:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:809:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalOperatingSystemLanguage.g:810:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalOperatingSystemLanguage.g:810:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalOperatingSystemLanguage.g:811:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // InternalOperatingSystemLanguage.g:812:1: ( rule__Import__ImportURIAssignment_1 )
            // InternalOperatingSystemLanguage.g:812:2: rule__Import__ImportURIAssignment_1
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
    // InternalOperatingSystemLanguage.g:826:1: rule__APIRepository__Group__0 : rule__APIRepository__Group__0__Impl rule__APIRepository__Group__1 ;
    public final void rule__APIRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:830:1: ( rule__APIRepository__Group__0__Impl rule__APIRepository__Group__1 )
            // InternalOperatingSystemLanguage.g:831:2: rule__APIRepository__Group__0__Impl rule__APIRepository__Group__1
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
    // InternalOperatingSystemLanguage.g:838:1: rule__APIRepository__Group__0__Impl : ( 'Device_API_Calls:' ) ;
    public final void rule__APIRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:842:1: ( ( 'Device_API_Calls:' ) )
            // InternalOperatingSystemLanguage.g:843:1: ( 'Device_API_Calls:' )
            {
            // InternalOperatingSystemLanguage.g:843:1: ( 'Device_API_Calls:' )
            // InternalOperatingSystemLanguage.g:844:1: 'Device_API_Calls:'
            {
             before(grammarAccess.getAPIRepositoryAccess().getDevice_API_CallsKeyword_0()); 
            match(input,25,FollowSets000.FOLLOW_2); 
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
    // InternalOperatingSystemLanguage.g:857:1: rule__APIRepository__Group__1 : rule__APIRepository__Group__1__Impl rule__APIRepository__Group__2 ;
    public final void rule__APIRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:861:1: ( rule__APIRepository__Group__1__Impl rule__APIRepository__Group__2 )
            // InternalOperatingSystemLanguage.g:862:2: rule__APIRepository__Group__1__Impl rule__APIRepository__Group__2
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
    // InternalOperatingSystemLanguage.g:869:1: rule__APIRepository__Group__1__Impl : ( ( rule__APIRepository__NameAssignment_1 ) ) ;
    public final void rule__APIRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:873:1: ( ( ( rule__APIRepository__NameAssignment_1 ) ) )
            // InternalOperatingSystemLanguage.g:874:1: ( ( rule__APIRepository__NameAssignment_1 ) )
            {
            // InternalOperatingSystemLanguage.g:874:1: ( ( rule__APIRepository__NameAssignment_1 ) )
            // InternalOperatingSystemLanguage.g:875:1: ( rule__APIRepository__NameAssignment_1 )
            {
             before(grammarAccess.getAPIRepositoryAccess().getNameAssignment_1()); 
            // InternalOperatingSystemLanguage.g:876:1: ( rule__APIRepository__NameAssignment_1 )
            // InternalOperatingSystemLanguage.g:876:2: rule__APIRepository__NameAssignment_1
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
    // InternalOperatingSystemLanguage.g:886:1: rule__APIRepository__Group__2 : rule__APIRepository__Group__2__Impl rule__APIRepository__Group__3 ;
    public final void rule__APIRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:890:1: ( rule__APIRepository__Group__2__Impl rule__APIRepository__Group__3 )
            // InternalOperatingSystemLanguage.g:891:2: rule__APIRepository__Group__2__Impl rule__APIRepository__Group__3
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
    // InternalOperatingSystemLanguage.g:898:1: rule__APIRepository__Group__2__Impl : ( '{' ) ;
    public final void rule__APIRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:902:1: ( ( '{' ) )
            // InternalOperatingSystemLanguage.g:903:1: ( '{' )
            {
            // InternalOperatingSystemLanguage.g:903:1: ( '{' )
            // InternalOperatingSystemLanguage.g:904:1: '{'
            {
             before(grammarAccess.getAPIRepositoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_2); 
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
    // InternalOperatingSystemLanguage.g:917:1: rule__APIRepository__Group__3 : rule__APIRepository__Group__3__Impl rule__APIRepository__Group__4 ;
    public final void rule__APIRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:921:1: ( rule__APIRepository__Group__3__Impl rule__APIRepository__Group__4 )
            // InternalOperatingSystemLanguage.g:922:2: rule__APIRepository__Group__3__Impl rule__APIRepository__Group__4
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
    // InternalOperatingSystemLanguage.g:929:1: rule__APIRepository__Group__3__Impl : ( ( rule__APIRepository__ApiCommandsAssignment_3 )* ) ;
    public final void rule__APIRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:933:1: ( ( ( rule__APIRepository__ApiCommandsAssignment_3 )* ) )
            // InternalOperatingSystemLanguage.g:934:1: ( ( rule__APIRepository__ApiCommandsAssignment_3 )* )
            {
            // InternalOperatingSystemLanguage.g:934:1: ( ( rule__APIRepository__ApiCommandsAssignment_3 )* )
            // InternalOperatingSystemLanguage.g:935:1: ( rule__APIRepository__ApiCommandsAssignment_3 )*
            {
             before(grammarAccess.getAPIRepositoryAccess().getApiCommandsAssignment_3()); 
            // InternalOperatingSystemLanguage.g:936:1: ( rule__APIRepository__ApiCommandsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalOperatingSystemLanguage.g:936:2: rule__APIRepository__ApiCommandsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_11);
            	    rule__APIRepository__ApiCommandsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalOperatingSystemLanguage.g:946:1: rule__APIRepository__Group__4 : rule__APIRepository__Group__4__Impl ;
    public final void rule__APIRepository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:950:1: ( rule__APIRepository__Group__4__Impl )
            // InternalOperatingSystemLanguage.g:951:2: rule__APIRepository__Group__4__Impl
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
    // InternalOperatingSystemLanguage.g:957:1: rule__APIRepository__Group__4__Impl : ( '}' ) ;
    public final void rule__APIRepository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:961:1: ( ( '}' ) )
            // InternalOperatingSystemLanguage.g:962:1: ( '}' )
            {
            // InternalOperatingSystemLanguage.g:962:1: ( '}' )
            // InternalOperatingSystemLanguage.g:963:1: '}'
            {
             before(grammarAccess.getAPIRepositoryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_2); 
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
    // InternalOperatingSystemLanguage.g:986:1: rule__EnumerationDataType__Group__0 : rule__EnumerationDataType__Group__0__Impl rule__EnumerationDataType__Group__1 ;
    public final void rule__EnumerationDataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:990:1: ( rule__EnumerationDataType__Group__0__Impl rule__EnumerationDataType__Group__1 )
            // InternalOperatingSystemLanguage.g:991:2: rule__EnumerationDataType__Group__0__Impl rule__EnumerationDataType__Group__1
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
    // InternalOperatingSystemLanguage.g:998:1: rule__EnumerationDataType__Group__0__Impl : ( 'enum:' ) ;
    public final void rule__EnumerationDataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1002:1: ( ( 'enum:' ) )
            // InternalOperatingSystemLanguage.g:1003:1: ( 'enum:' )
            {
            // InternalOperatingSystemLanguage.g:1003:1: ( 'enum:' )
            // InternalOperatingSystemLanguage.g:1004:1: 'enum:'
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getEnumKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_2); 
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
    // InternalOperatingSystemLanguage.g:1017:1: rule__EnumerationDataType__Group__1 : rule__EnumerationDataType__Group__1__Impl rule__EnumerationDataType__Group__2 ;
    public final void rule__EnumerationDataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1021:1: ( rule__EnumerationDataType__Group__1__Impl rule__EnumerationDataType__Group__2 )
            // InternalOperatingSystemLanguage.g:1022:2: rule__EnumerationDataType__Group__1__Impl rule__EnumerationDataType__Group__2
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
    // InternalOperatingSystemLanguage.g:1029:1: rule__EnumerationDataType__Group__1__Impl : ( ( rule__EnumerationDataType__NameAssignment_1 ) ) ;
    public final void rule__EnumerationDataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1033:1: ( ( ( rule__EnumerationDataType__NameAssignment_1 ) ) )
            // InternalOperatingSystemLanguage.g:1034:1: ( ( rule__EnumerationDataType__NameAssignment_1 ) )
            {
            // InternalOperatingSystemLanguage.g:1034:1: ( ( rule__EnumerationDataType__NameAssignment_1 ) )
            // InternalOperatingSystemLanguage.g:1035:1: ( rule__EnumerationDataType__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getNameAssignment_1()); 
            // InternalOperatingSystemLanguage.g:1036:1: ( rule__EnumerationDataType__NameAssignment_1 )
            // InternalOperatingSystemLanguage.g:1036:2: rule__EnumerationDataType__NameAssignment_1
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
    // InternalOperatingSystemLanguage.g:1046:1: rule__EnumerationDataType__Group__2 : rule__EnumerationDataType__Group__2__Impl rule__EnumerationDataType__Group__3 ;
    public final void rule__EnumerationDataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1050:1: ( rule__EnumerationDataType__Group__2__Impl rule__EnumerationDataType__Group__3 )
            // InternalOperatingSystemLanguage.g:1051:2: rule__EnumerationDataType__Group__2__Impl rule__EnumerationDataType__Group__3
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
    // InternalOperatingSystemLanguage.g:1058:1: rule__EnumerationDataType__Group__2__Impl : ( '{' ) ;
    public final void rule__EnumerationDataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1062:1: ( ( '{' ) )
            // InternalOperatingSystemLanguage.g:1063:1: ( '{' )
            {
            // InternalOperatingSystemLanguage.g:1063:1: ( '{' )
            // InternalOperatingSystemLanguage.g:1064:1: '{'
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_2); 
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
    // InternalOperatingSystemLanguage.g:1077:1: rule__EnumerationDataType__Group__3 : rule__EnumerationDataType__Group__3__Impl rule__EnumerationDataType__Group__4 ;
    public final void rule__EnumerationDataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1081:1: ( rule__EnumerationDataType__Group__3__Impl rule__EnumerationDataType__Group__4 )
            // InternalOperatingSystemLanguage.g:1082:2: rule__EnumerationDataType__Group__3__Impl rule__EnumerationDataType__Group__4
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
    // InternalOperatingSystemLanguage.g:1089:1: rule__EnumerationDataType__Group__3__Impl : ( ( rule__EnumerationDataType__Group_3__0 )? ) ;
    public final void rule__EnumerationDataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1093:1: ( ( ( rule__EnumerationDataType__Group_3__0 )? ) )
            // InternalOperatingSystemLanguage.g:1094:1: ( ( rule__EnumerationDataType__Group_3__0 )? )
            {
            // InternalOperatingSystemLanguage.g:1094:1: ( ( rule__EnumerationDataType__Group_3__0 )? )
            // InternalOperatingSystemLanguage.g:1095:1: ( rule__EnumerationDataType__Group_3__0 )?
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getGroup_3()); 
            // InternalOperatingSystemLanguage.g:1096:1: ( rule__EnumerationDataType__Group_3__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalOperatingSystemLanguage.g:1096:2: rule__EnumerationDataType__Group_3__0
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
    // InternalOperatingSystemLanguage.g:1106:1: rule__EnumerationDataType__Group__4 : rule__EnumerationDataType__Group__4__Impl ;
    public final void rule__EnumerationDataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1110:1: ( rule__EnumerationDataType__Group__4__Impl )
            // InternalOperatingSystemLanguage.g:1111:2: rule__EnumerationDataType__Group__4__Impl
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
    // InternalOperatingSystemLanguage.g:1117:1: rule__EnumerationDataType__Group__4__Impl : ( '}' ) ;
    public final void rule__EnumerationDataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1121:1: ( ( '}' ) )
            // InternalOperatingSystemLanguage.g:1122:1: ( '}' )
            {
            // InternalOperatingSystemLanguage.g:1122:1: ( '}' )
            // InternalOperatingSystemLanguage.g:1123:1: '}'
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_2); 
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
    // InternalOperatingSystemLanguage.g:1146:1: rule__EnumerationDataType__Group_3__0 : rule__EnumerationDataType__Group_3__0__Impl rule__EnumerationDataType__Group_3__1 ;
    public final void rule__EnumerationDataType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1150:1: ( rule__EnumerationDataType__Group_3__0__Impl rule__EnumerationDataType__Group_3__1 )
            // InternalOperatingSystemLanguage.g:1151:2: rule__EnumerationDataType__Group_3__0__Impl rule__EnumerationDataType__Group_3__1
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
    // InternalOperatingSystemLanguage.g:1158:1: rule__EnumerationDataType__Group_3__0__Impl : ( ( rule__EnumerationDataType__EnumerationValuesAssignment_3_0 ) ) ;
    public final void rule__EnumerationDataType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1162:1: ( ( ( rule__EnumerationDataType__EnumerationValuesAssignment_3_0 ) ) )
            // InternalOperatingSystemLanguage.g:1163:1: ( ( rule__EnumerationDataType__EnumerationValuesAssignment_3_0 ) )
            {
            // InternalOperatingSystemLanguage.g:1163:1: ( ( rule__EnumerationDataType__EnumerationValuesAssignment_3_0 ) )
            // InternalOperatingSystemLanguage.g:1164:1: ( rule__EnumerationDataType__EnumerationValuesAssignment_3_0 )
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getEnumerationValuesAssignment_3_0()); 
            // InternalOperatingSystemLanguage.g:1165:1: ( rule__EnumerationDataType__EnumerationValuesAssignment_3_0 )
            // InternalOperatingSystemLanguage.g:1165:2: rule__EnumerationDataType__EnumerationValuesAssignment_3_0
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
    // InternalOperatingSystemLanguage.g:1175:1: rule__EnumerationDataType__Group_3__1 : rule__EnumerationDataType__Group_3__1__Impl ;
    public final void rule__EnumerationDataType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1179:1: ( rule__EnumerationDataType__Group_3__1__Impl )
            // InternalOperatingSystemLanguage.g:1180:2: rule__EnumerationDataType__Group_3__1__Impl
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
    // InternalOperatingSystemLanguage.g:1186:1: rule__EnumerationDataType__Group_3__1__Impl : ( ( rule__EnumerationDataType__Group_3_1__0 )* ) ;
    public final void rule__EnumerationDataType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1190:1: ( ( ( rule__EnumerationDataType__Group_3_1__0 )* ) )
            // InternalOperatingSystemLanguage.g:1191:1: ( ( rule__EnumerationDataType__Group_3_1__0 )* )
            {
            // InternalOperatingSystemLanguage.g:1191:1: ( ( rule__EnumerationDataType__Group_3_1__0 )* )
            // InternalOperatingSystemLanguage.g:1192:1: ( rule__EnumerationDataType__Group_3_1__0 )*
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getGroup_3_1()); 
            // InternalOperatingSystemLanguage.g:1193:1: ( rule__EnumerationDataType__Group_3_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalOperatingSystemLanguage.g:1193:2: rule__EnumerationDataType__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    rule__EnumerationDataType__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalOperatingSystemLanguage.g:1207:1: rule__EnumerationDataType__Group_3_1__0 : rule__EnumerationDataType__Group_3_1__0__Impl rule__EnumerationDataType__Group_3_1__1 ;
    public final void rule__EnumerationDataType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1211:1: ( rule__EnumerationDataType__Group_3_1__0__Impl rule__EnumerationDataType__Group_3_1__1 )
            // InternalOperatingSystemLanguage.g:1212:2: rule__EnumerationDataType__Group_3_1__0__Impl rule__EnumerationDataType__Group_3_1__1
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
    // InternalOperatingSystemLanguage.g:1219:1: rule__EnumerationDataType__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__EnumerationDataType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1223:1: ( ( ',' ) )
            // InternalOperatingSystemLanguage.g:1224:1: ( ',' )
            {
            // InternalOperatingSystemLanguage.g:1224:1: ( ',' )
            // InternalOperatingSystemLanguage.g:1225:1: ','
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getCommaKeyword_3_1_0()); 
            match(input,27,FollowSets000.FOLLOW_2); 
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
    // InternalOperatingSystemLanguage.g:1238:1: rule__EnumerationDataType__Group_3_1__1 : rule__EnumerationDataType__Group_3_1__1__Impl ;
    public final void rule__EnumerationDataType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1242:1: ( rule__EnumerationDataType__Group_3_1__1__Impl )
            // InternalOperatingSystemLanguage.g:1243:2: rule__EnumerationDataType__Group_3_1__1__Impl
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
    // InternalOperatingSystemLanguage.g:1249:1: rule__EnumerationDataType__Group_3_1__1__Impl : ( ( rule__EnumerationDataType__EnumerationValuesAssignment_3_1_1 ) ) ;
    public final void rule__EnumerationDataType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1253:1: ( ( ( rule__EnumerationDataType__EnumerationValuesAssignment_3_1_1 ) ) )
            // InternalOperatingSystemLanguage.g:1254:1: ( ( rule__EnumerationDataType__EnumerationValuesAssignment_3_1_1 ) )
            {
            // InternalOperatingSystemLanguage.g:1254:1: ( ( rule__EnumerationDataType__EnumerationValuesAssignment_3_1_1 ) )
            // InternalOperatingSystemLanguage.g:1255:1: ( rule__EnumerationDataType__EnumerationValuesAssignment_3_1_1 )
            {
             before(grammarAccess.getEnumerationDataTypeAccess().getEnumerationValuesAssignment_3_1_1()); 
            // InternalOperatingSystemLanguage.g:1256:1: ( rule__EnumerationDataType__EnumerationValuesAssignment_3_1_1 )
            // InternalOperatingSystemLanguage.g:1256:2: rule__EnumerationDataType__EnumerationValuesAssignment_3_1_1
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
    // InternalOperatingSystemLanguage.g:1270:1: rule__APICommand__Group__0 : rule__APICommand__Group__0__Impl rule__APICommand__Group__1 ;
    public final void rule__APICommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1274:1: ( rule__APICommand__Group__0__Impl rule__APICommand__Group__1 )
            // InternalOperatingSystemLanguage.g:1275:2: rule__APICommand__Group__0__Impl rule__APICommand__Group__1
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
    // InternalOperatingSystemLanguage.g:1282:1: rule__APICommand__Group__0__Impl : ( ( rule__APICommand__ReturnDataTypeAssignment_0 ) ) ;
    public final void rule__APICommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1286:1: ( ( ( rule__APICommand__ReturnDataTypeAssignment_0 ) ) )
            // InternalOperatingSystemLanguage.g:1287:1: ( ( rule__APICommand__ReturnDataTypeAssignment_0 ) )
            {
            // InternalOperatingSystemLanguage.g:1287:1: ( ( rule__APICommand__ReturnDataTypeAssignment_0 ) )
            // InternalOperatingSystemLanguage.g:1288:1: ( rule__APICommand__ReturnDataTypeAssignment_0 )
            {
             before(grammarAccess.getAPICommandAccess().getReturnDataTypeAssignment_0()); 
            // InternalOperatingSystemLanguage.g:1289:1: ( rule__APICommand__ReturnDataTypeAssignment_0 )
            // InternalOperatingSystemLanguage.g:1289:2: rule__APICommand__ReturnDataTypeAssignment_0
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
    // InternalOperatingSystemLanguage.g:1299:1: rule__APICommand__Group__1 : rule__APICommand__Group__1__Impl rule__APICommand__Group__2 ;
    public final void rule__APICommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1303:1: ( rule__APICommand__Group__1__Impl rule__APICommand__Group__2 )
            // InternalOperatingSystemLanguage.g:1304:2: rule__APICommand__Group__1__Impl rule__APICommand__Group__2
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
    // InternalOperatingSystemLanguage.g:1311:1: rule__APICommand__Group__1__Impl : ( ( rule__APICommand__NameAssignment_1 ) ) ;
    public final void rule__APICommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1315:1: ( ( ( rule__APICommand__NameAssignment_1 ) ) )
            // InternalOperatingSystemLanguage.g:1316:1: ( ( rule__APICommand__NameAssignment_1 ) )
            {
            // InternalOperatingSystemLanguage.g:1316:1: ( ( rule__APICommand__NameAssignment_1 ) )
            // InternalOperatingSystemLanguage.g:1317:1: ( rule__APICommand__NameAssignment_1 )
            {
             before(grammarAccess.getAPICommandAccess().getNameAssignment_1()); 
            // InternalOperatingSystemLanguage.g:1318:1: ( rule__APICommand__NameAssignment_1 )
            // InternalOperatingSystemLanguage.g:1318:2: rule__APICommand__NameAssignment_1
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
    // InternalOperatingSystemLanguage.g:1328:1: rule__APICommand__Group__2 : rule__APICommand__Group__2__Impl rule__APICommand__Group__3 ;
    public final void rule__APICommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1332:1: ( rule__APICommand__Group__2__Impl rule__APICommand__Group__3 )
            // InternalOperatingSystemLanguage.g:1333:2: rule__APICommand__Group__2__Impl rule__APICommand__Group__3
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
    // InternalOperatingSystemLanguage.g:1340:1: rule__APICommand__Group__2__Impl : ( '(' ) ;
    public final void rule__APICommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1344:1: ( ( '(' ) )
            // InternalOperatingSystemLanguage.g:1345:1: ( '(' )
            {
            // InternalOperatingSystemLanguage.g:1345:1: ( '(' )
            // InternalOperatingSystemLanguage.g:1346:1: '('
            {
             before(grammarAccess.getAPICommandAccess().getLeftParenthesisKeyword_2()); 
            match(input,28,FollowSets000.FOLLOW_2); 
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
    // InternalOperatingSystemLanguage.g:1359:1: rule__APICommand__Group__3 : rule__APICommand__Group__3__Impl rule__APICommand__Group__4 ;
    public final void rule__APICommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1363:1: ( rule__APICommand__Group__3__Impl rule__APICommand__Group__4 )
            // InternalOperatingSystemLanguage.g:1364:2: rule__APICommand__Group__3__Impl rule__APICommand__Group__4
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
    // InternalOperatingSystemLanguage.g:1371:1: rule__APICommand__Group__3__Impl : ( ( rule__APICommand__Group_3__0 )? ) ;
    public final void rule__APICommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1375:1: ( ( ( rule__APICommand__Group_3__0 )? ) )
            // InternalOperatingSystemLanguage.g:1376:1: ( ( rule__APICommand__Group_3__0 )? )
            {
            // InternalOperatingSystemLanguage.g:1376:1: ( ( rule__APICommand__Group_3__0 )? )
            // InternalOperatingSystemLanguage.g:1377:1: ( rule__APICommand__Group_3__0 )?
            {
             before(grammarAccess.getAPICommandAccess().getGroup_3()); 
            // InternalOperatingSystemLanguage.g:1378:1: ( rule__APICommand__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalOperatingSystemLanguage.g:1378:2: rule__APICommand__Group_3__0
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
    // InternalOperatingSystemLanguage.g:1388:1: rule__APICommand__Group__4 : rule__APICommand__Group__4__Impl rule__APICommand__Group__5 ;
    public final void rule__APICommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1392:1: ( rule__APICommand__Group__4__Impl rule__APICommand__Group__5 )
            // InternalOperatingSystemLanguage.g:1393:2: rule__APICommand__Group__4__Impl rule__APICommand__Group__5
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
    // InternalOperatingSystemLanguage.g:1400:1: rule__APICommand__Group__4__Impl : ( ')' ) ;
    public final void rule__APICommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1404:1: ( ( ')' ) )
            // InternalOperatingSystemLanguage.g:1405:1: ( ')' )
            {
            // InternalOperatingSystemLanguage.g:1405:1: ( ')' )
            // InternalOperatingSystemLanguage.g:1406:1: ')'
            {
             before(grammarAccess.getAPICommandAccess().getRightParenthesisKeyword_4()); 
            match(input,29,FollowSets000.FOLLOW_2); 
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
    // InternalOperatingSystemLanguage.g:1419:1: rule__APICommand__Group__5 : rule__APICommand__Group__5__Impl rule__APICommand__Group__6 ;
    public final void rule__APICommand__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1423:1: ( rule__APICommand__Group__5__Impl rule__APICommand__Group__6 )
            // InternalOperatingSystemLanguage.g:1424:2: rule__APICommand__Group__5__Impl rule__APICommand__Group__6
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
    // InternalOperatingSystemLanguage.g:1431:1: rule__APICommand__Group__5__Impl : ( ( rule__APICommand__ConstraintsAssignment_5 )? ) ;
    public final void rule__APICommand__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1435:1: ( ( ( rule__APICommand__ConstraintsAssignment_5 )? ) )
            // InternalOperatingSystemLanguage.g:1436:1: ( ( rule__APICommand__ConstraintsAssignment_5 )? )
            {
            // InternalOperatingSystemLanguage.g:1436:1: ( ( rule__APICommand__ConstraintsAssignment_5 )? )
            // InternalOperatingSystemLanguage.g:1437:1: ( rule__APICommand__ConstraintsAssignment_5 )?
            {
             before(grammarAccess.getAPICommandAccess().getConstraintsAssignment_5()); 
            // InternalOperatingSystemLanguage.g:1438:1: ( rule__APICommand__ConstraintsAssignment_5 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalOperatingSystemLanguage.g:1438:2: rule__APICommand__ConstraintsAssignment_5
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
    // InternalOperatingSystemLanguage.g:1448:1: rule__APICommand__Group__6 : rule__APICommand__Group__6__Impl ;
    public final void rule__APICommand__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1452:1: ( rule__APICommand__Group__6__Impl )
            // InternalOperatingSystemLanguage.g:1453:2: rule__APICommand__Group__6__Impl
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
    // InternalOperatingSystemLanguage.g:1459:1: rule__APICommand__Group__6__Impl : ( ';' ) ;
    public final void rule__APICommand__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1463:1: ( ( ';' ) )
            // InternalOperatingSystemLanguage.g:1464:1: ( ';' )
            {
            // InternalOperatingSystemLanguage.g:1464:1: ( ';' )
            // InternalOperatingSystemLanguage.g:1465:1: ';'
            {
             before(grammarAccess.getAPICommandAccess().getSemicolonKeyword_6()); 
            match(input,30,FollowSets000.FOLLOW_2); 
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
    // InternalOperatingSystemLanguage.g:1492:1: rule__APICommand__Group_3__0 : rule__APICommand__Group_3__0__Impl rule__APICommand__Group_3__1 ;
    public final void rule__APICommand__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1496:1: ( rule__APICommand__Group_3__0__Impl rule__APICommand__Group_3__1 )
            // InternalOperatingSystemLanguage.g:1497:2: rule__APICommand__Group_3__0__Impl rule__APICommand__Group_3__1
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
    // InternalOperatingSystemLanguage.g:1504:1: rule__APICommand__Group_3__0__Impl : ( ( rule__APICommand__ParametersAssignment_3_0 ) ) ;
    public final void rule__APICommand__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1508:1: ( ( ( rule__APICommand__ParametersAssignment_3_0 ) ) )
            // InternalOperatingSystemLanguage.g:1509:1: ( ( rule__APICommand__ParametersAssignment_3_0 ) )
            {
            // InternalOperatingSystemLanguage.g:1509:1: ( ( rule__APICommand__ParametersAssignment_3_0 ) )
            // InternalOperatingSystemLanguage.g:1510:1: ( rule__APICommand__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getAPICommandAccess().getParametersAssignment_3_0()); 
            // InternalOperatingSystemLanguage.g:1511:1: ( rule__APICommand__ParametersAssignment_3_0 )
            // InternalOperatingSystemLanguage.g:1511:2: rule__APICommand__ParametersAssignment_3_0
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
    // InternalOperatingSystemLanguage.g:1521:1: rule__APICommand__Group_3__1 : rule__APICommand__Group_3__1__Impl ;
    public final void rule__APICommand__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1525:1: ( rule__APICommand__Group_3__1__Impl )
            // InternalOperatingSystemLanguage.g:1526:2: rule__APICommand__Group_3__1__Impl
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
    // InternalOperatingSystemLanguage.g:1532:1: rule__APICommand__Group_3__1__Impl : ( ( rule__APICommand__Group_3_1__0 )* ) ;
    public final void rule__APICommand__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1536:1: ( ( ( rule__APICommand__Group_3_1__0 )* ) )
            // InternalOperatingSystemLanguage.g:1537:1: ( ( rule__APICommand__Group_3_1__0 )* )
            {
            // InternalOperatingSystemLanguage.g:1537:1: ( ( rule__APICommand__Group_3_1__0 )* )
            // InternalOperatingSystemLanguage.g:1538:1: ( rule__APICommand__Group_3_1__0 )*
            {
             before(grammarAccess.getAPICommandAccess().getGroup_3_1()); 
            // InternalOperatingSystemLanguage.g:1539:1: ( rule__APICommand__Group_3_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOperatingSystemLanguage.g:1539:2: rule__APICommand__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    rule__APICommand__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalOperatingSystemLanguage.g:1553:1: rule__APICommand__Group_3_1__0 : rule__APICommand__Group_3_1__0__Impl rule__APICommand__Group_3_1__1 ;
    public final void rule__APICommand__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1557:1: ( rule__APICommand__Group_3_1__0__Impl rule__APICommand__Group_3_1__1 )
            // InternalOperatingSystemLanguage.g:1558:2: rule__APICommand__Group_3_1__0__Impl rule__APICommand__Group_3_1__1
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
    // InternalOperatingSystemLanguage.g:1565:1: rule__APICommand__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__APICommand__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1569:1: ( ( ',' ) )
            // InternalOperatingSystemLanguage.g:1570:1: ( ',' )
            {
            // InternalOperatingSystemLanguage.g:1570:1: ( ',' )
            // InternalOperatingSystemLanguage.g:1571:1: ','
            {
             before(grammarAccess.getAPICommandAccess().getCommaKeyword_3_1_0()); 
            match(input,27,FollowSets000.FOLLOW_2); 
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
    // InternalOperatingSystemLanguage.g:1584:1: rule__APICommand__Group_3_1__1 : rule__APICommand__Group_3_1__1__Impl ;
    public final void rule__APICommand__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1588:1: ( rule__APICommand__Group_3_1__1__Impl )
            // InternalOperatingSystemLanguage.g:1589:2: rule__APICommand__Group_3_1__1__Impl
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
    // InternalOperatingSystemLanguage.g:1595:1: rule__APICommand__Group_3_1__1__Impl : ( ( rule__APICommand__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__APICommand__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1599:1: ( ( ( rule__APICommand__ParametersAssignment_3_1_1 ) ) )
            // InternalOperatingSystemLanguage.g:1600:1: ( ( rule__APICommand__ParametersAssignment_3_1_1 ) )
            {
            // InternalOperatingSystemLanguage.g:1600:1: ( ( rule__APICommand__ParametersAssignment_3_1_1 ) )
            // InternalOperatingSystemLanguage.g:1601:1: ( rule__APICommand__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getAPICommandAccess().getParametersAssignment_3_1_1()); 
            // InternalOperatingSystemLanguage.g:1602:1: ( rule__APICommand__ParametersAssignment_3_1_1 )
            // InternalOperatingSystemLanguage.g:1602:2: rule__APICommand__ParametersAssignment_3_1_1
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
    // InternalOperatingSystemLanguage.g:1616:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1620:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalOperatingSystemLanguage.g:1621:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
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
    // InternalOperatingSystemLanguage.g:1628:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__DataTypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1632:1: ( ( ( rule__Parameter__DataTypeAssignment_0 ) ) )
            // InternalOperatingSystemLanguage.g:1633:1: ( ( rule__Parameter__DataTypeAssignment_0 ) )
            {
            // InternalOperatingSystemLanguage.g:1633:1: ( ( rule__Parameter__DataTypeAssignment_0 ) )
            // InternalOperatingSystemLanguage.g:1634:1: ( rule__Parameter__DataTypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getDataTypeAssignment_0()); 
            // InternalOperatingSystemLanguage.g:1635:1: ( rule__Parameter__DataTypeAssignment_0 )
            // InternalOperatingSystemLanguage.g:1635:2: rule__Parameter__DataTypeAssignment_0
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
    // InternalOperatingSystemLanguage.g:1645:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1649:1: ( rule__Parameter__Group__1__Impl )
            // InternalOperatingSystemLanguage.g:1650:2: rule__Parameter__Group__1__Impl
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
    // InternalOperatingSystemLanguage.g:1656:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1660:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalOperatingSystemLanguage.g:1661:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalOperatingSystemLanguage.g:1661:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalOperatingSystemLanguage.g:1662:1: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalOperatingSystemLanguage.g:1663:1: ( rule__Parameter__NameAssignment_1 )
            // InternalOperatingSystemLanguage.g:1663:2: rule__Parameter__NameAssignment_1
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
    // InternalOperatingSystemLanguage.g:1677:1: rule__TimeConstraint__Group__0 : rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 ;
    public final void rule__TimeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1681:1: ( rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1 )
            // InternalOperatingSystemLanguage.g:1682:2: rule__TimeConstraint__Group__0__Impl rule__TimeConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalOperatingSystemLanguage.g:1689:1: rule__TimeConstraint__Group__0__Impl : ( '[' ) ;
    public final void rule__TimeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1693:1: ( ( '[' ) )
            // InternalOperatingSystemLanguage.g:1694:1: ( '[' )
            {
            // InternalOperatingSystemLanguage.g:1694:1: ( '[' )
            // InternalOperatingSystemLanguage.g:1695:1: '['
            {
             before(grammarAccess.getTimeConstraintAccess().getLeftSquareBracketKeyword_0()); 
            match(input,31,FollowSets000.FOLLOW_2); 
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
    // InternalOperatingSystemLanguage.g:1708:1: rule__TimeConstraint__Group__1 : rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 ;
    public final void rule__TimeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1712:1: ( rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2 )
            // InternalOperatingSystemLanguage.g:1713:2: rule__TimeConstraint__Group__1__Impl rule__TimeConstraint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
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
    // InternalOperatingSystemLanguage.g:1720:1: rule__TimeConstraint__Group__1__Impl : ( ( rule__TimeConstraint__SamplingTimeAssignment_1 ) ) ;
    public final void rule__TimeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1724:1: ( ( ( rule__TimeConstraint__SamplingTimeAssignment_1 ) ) )
            // InternalOperatingSystemLanguage.g:1725:1: ( ( rule__TimeConstraint__SamplingTimeAssignment_1 ) )
            {
            // InternalOperatingSystemLanguage.g:1725:1: ( ( rule__TimeConstraint__SamplingTimeAssignment_1 ) )
            // InternalOperatingSystemLanguage.g:1726:1: ( rule__TimeConstraint__SamplingTimeAssignment_1 )
            {
             before(grammarAccess.getTimeConstraintAccess().getSamplingTimeAssignment_1()); 
            // InternalOperatingSystemLanguage.g:1727:1: ( rule__TimeConstraint__SamplingTimeAssignment_1 )
            // InternalOperatingSystemLanguage.g:1727:2: rule__TimeConstraint__SamplingTimeAssignment_1
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
    // InternalOperatingSystemLanguage.g:1737:1: rule__TimeConstraint__Group__2 : rule__TimeConstraint__Group__2__Impl ;
    public final void rule__TimeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1741:1: ( rule__TimeConstraint__Group__2__Impl )
            // InternalOperatingSystemLanguage.g:1742:2: rule__TimeConstraint__Group__2__Impl
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
    // InternalOperatingSystemLanguage.g:1748:1: rule__TimeConstraint__Group__2__Impl : ( ']' ) ;
    public final void rule__TimeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1752:1: ( ( ']' ) )
            // InternalOperatingSystemLanguage.g:1753:1: ( ']' )
            {
            // InternalOperatingSystemLanguage.g:1753:1: ( ']' )
            // InternalOperatingSystemLanguage.g:1754:1: ']'
            {
             before(grammarAccess.getTimeConstraintAccess().getRightSquareBracketKeyword_2()); 
            match(input,32,FollowSets000.FOLLOW_2); 
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
    // InternalOperatingSystemLanguage.g:1773:1: rule__TimeValue__Group__0 : rule__TimeValue__Group__0__Impl rule__TimeValue__Group__1 ;
    public final void rule__TimeValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1777:1: ( rule__TimeValue__Group__0__Impl rule__TimeValue__Group__1 )
            // InternalOperatingSystemLanguage.g:1778:2: rule__TimeValue__Group__0__Impl rule__TimeValue__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
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
    // InternalOperatingSystemLanguage.g:1785:1: rule__TimeValue__Group__0__Impl : ( ( rule__TimeValue__ValueAssignment_0 ) ) ;
    public final void rule__TimeValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1789:1: ( ( ( rule__TimeValue__ValueAssignment_0 ) ) )
            // InternalOperatingSystemLanguage.g:1790:1: ( ( rule__TimeValue__ValueAssignment_0 ) )
            {
            // InternalOperatingSystemLanguage.g:1790:1: ( ( rule__TimeValue__ValueAssignment_0 ) )
            // InternalOperatingSystemLanguage.g:1791:1: ( rule__TimeValue__ValueAssignment_0 )
            {
             before(grammarAccess.getTimeValueAccess().getValueAssignment_0()); 
            // InternalOperatingSystemLanguage.g:1792:1: ( rule__TimeValue__ValueAssignment_0 )
            // InternalOperatingSystemLanguage.g:1792:2: rule__TimeValue__ValueAssignment_0
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
    // InternalOperatingSystemLanguage.g:1802:1: rule__TimeValue__Group__1 : rule__TimeValue__Group__1__Impl ;
    public final void rule__TimeValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1806:1: ( rule__TimeValue__Group__1__Impl )
            // InternalOperatingSystemLanguage.g:1807:2: rule__TimeValue__Group__1__Impl
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
    // InternalOperatingSystemLanguage.g:1813:1: rule__TimeValue__Group__1__Impl : ( ( rule__TimeValue__UnitAssignment_1 ) ) ;
    public final void rule__TimeValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1817:1: ( ( ( rule__TimeValue__UnitAssignment_1 ) ) )
            // InternalOperatingSystemLanguage.g:1818:1: ( ( rule__TimeValue__UnitAssignment_1 ) )
            {
            // InternalOperatingSystemLanguage.g:1818:1: ( ( rule__TimeValue__UnitAssignment_1 ) )
            // InternalOperatingSystemLanguage.g:1819:1: ( rule__TimeValue__UnitAssignment_1 )
            {
             before(grammarAccess.getTimeValueAccess().getUnitAssignment_1()); 
            // InternalOperatingSystemLanguage.g:1820:1: ( rule__TimeValue__UnitAssignment_1 )
            // InternalOperatingSystemLanguage.g:1820:2: rule__TimeValue__UnitAssignment_1
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


    // $ANTLR start "rule__LiteralExpression__Group__0"
    // InternalOperatingSystemLanguage.g:1834:1: rule__LiteralExpression__Group__0 : rule__LiteralExpression__Group__0__Impl rule__LiteralExpression__Group__1 ;
    public final void rule__LiteralExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1838:1: ( rule__LiteralExpression__Group__0__Impl rule__LiteralExpression__Group__1 )
            // InternalOperatingSystemLanguage.g:1839:2: rule__LiteralExpression__Group__0__Impl rule__LiteralExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalOperatingSystemLanguage.g:1846:1: rule__LiteralExpression__Group__0__Impl : ( () ) ;
    public final void rule__LiteralExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1850:1: ( ( () ) )
            // InternalOperatingSystemLanguage.g:1851:1: ( () )
            {
            // InternalOperatingSystemLanguage.g:1851:1: ( () )
            // InternalOperatingSystemLanguage.g:1852:1: ()
            {
             before(grammarAccess.getLiteralExpressionAccess().getLiteralExpressionAction_0()); 
            // InternalOperatingSystemLanguage.g:1853:1: ()
            // InternalOperatingSystemLanguage.g:1855:1: 
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
    // InternalOperatingSystemLanguage.g:1865:1: rule__LiteralExpression__Group__1 : rule__LiteralExpression__Group__1__Impl ;
    public final void rule__LiteralExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1869:1: ( rule__LiteralExpression__Group__1__Impl )
            // InternalOperatingSystemLanguage.g:1870:2: rule__LiteralExpression__Group__1__Impl
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
    // InternalOperatingSystemLanguage.g:1876:1: rule__LiteralExpression__Group__1__Impl : ( ( rule__LiteralExpression__ValueAssignment_1 ) ) ;
    public final void rule__LiteralExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1880:1: ( ( ( rule__LiteralExpression__ValueAssignment_1 ) ) )
            // InternalOperatingSystemLanguage.g:1881:1: ( ( rule__LiteralExpression__ValueAssignment_1 ) )
            {
            // InternalOperatingSystemLanguage.g:1881:1: ( ( rule__LiteralExpression__ValueAssignment_1 ) )
            // InternalOperatingSystemLanguage.g:1882:1: ( rule__LiteralExpression__ValueAssignment_1 )
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueAssignment_1()); 
            // InternalOperatingSystemLanguage.g:1883:1: ( rule__LiteralExpression__ValueAssignment_1 )
            // InternalOperatingSystemLanguage.g:1883:2: rule__LiteralExpression__ValueAssignment_1
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


    // $ANTLR start "rule__OperatingSystem__ImportsAssignment_0"
    // InternalOperatingSystemLanguage.g:1898:1: rule__OperatingSystem__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__OperatingSystem__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1902:1: ( ( ruleImport ) )
            // InternalOperatingSystemLanguage.g:1903:1: ( ruleImport )
            {
            // InternalOperatingSystemLanguage.g:1903:1: ( ruleImport )
            // InternalOperatingSystemLanguage.g:1904:1: ruleImport
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
    // InternalOperatingSystemLanguage.g:1913:1: rule__OperatingSystem__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__OperatingSystem__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1917:1: ( ( ruleEString ) )
            // InternalOperatingSystemLanguage.g:1918:1: ( ruleEString )
            {
            // InternalOperatingSystemLanguage.g:1918:1: ( ruleEString )
            // InternalOperatingSystemLanguage.g:1919:1: ruleEString
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
    // InternalOperatingSystemLanguage.g:1928:1: rule__OperatingSystem__ApirepositoriesAssignment_4_0 : ( ruleAPIRepository ) ;
    public final void rule__OperatingSystem__ApirepositoriesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1932:1: ( ( ruleAPIRepository ) )
            // InternalOperatingSystemLanguage.g:1933:1: ( ruleAPIRepository )
            {
            // InternalOperatingSystemLanguage.g:1933:1: ( ruleAPIRepository )
            // InternalOperatingSystemLanguage.g:1934:1: ruleAPIRepository
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
    // InternalOperatingSystemLanguage.g:1943:1: rule__OperatingSystem__EnumerationDataTypesAssignment_4_1 : ( ruleEnumerationDataType ) ;
    public final void rule__OperatingSystem__EnumerationDataTypesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1947:1: ( ( ruleEnumerationDataType ) )
            // InternalOperatingSystemLanguage.g:1948:1: ( ruleEnumerationDataType )
            {
            // InternalOperatingSystemLanguage.g:1948:1: ( ruleEnumerationDataType )
            // InternalOperatingSystemLanguage.g:1949:1: ruleEnumerationDataType
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
    // InternalOperatingSystemLanguage.g:1958:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1962:1: ( ( RULE_STRING ) )
            // InternalOperatingSystemLanguage.g:1963:1: ( RULE_STRING )
            {
            // InternalOperatingSystemLanguage.g:1963:1: ( RULE_STRING )
            // InternalOperatingSystemLanguage.g:1964:1: RULE_STRING
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
    // InternalOperatingSystemLanguage.g:1973:1: rule__APIRepository__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__APIRepository__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1977:1: ( ( ruleEString ) )
            // InternalOperatingSystemLanguage.g:1978:1: ( ruleEString )
            {
            // InternalOperatingSystemLanguage.g:1978:1: ( ruleEString )
            // InternalOperatingSystemLanguage.g:1979:1: ruleEString
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
    // InternalOperatingSystemLanguage.g:1988:1: rule__APIRepository__ApiCommandsAssignment_3 : ( ruleAPICommand ) ;
    public final void rule__APIRepository__ApiCommandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:1992:1: ( ( ruleAPICommand ) )
            // InternalOperatingSystemLanguage.g:1993:1: ( ruleAPICommand )
            {
            // InternalOperatingSystemLanguage.g:1993:1: ( ruleAPICommand )
            // InternalOperatingSystemLanguage.g:1994:1: ruleAPICommand
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
    // InternalOperatingSystemLanguage.g:2003:1: rule__EnumerationDataType__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__EnumerationDataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2007:1: ( ( ruleEString ) )
            // InternalOperatingSystemLanguage.g:2008:1: ( ruleEString )
            {
            // InternalOperatingSystemLanguage.g:2008:1: ( ruleEString )
            // InternalOperatingSystemLanguage.g:2009:1: ruleEString
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
    // InternalOperatingSystemLanguage.g:2018:1: rule__EnumerationDataType__EnumerationValuesAssignment_3_0 : ( ruleEnumerationValue ) ;
    public final void rule__EnumerationDataType__EnumerationValuesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2022:1: ( ( ruleEnumerationValue ) )
            // InternalOperatingSystemLanguage.g:2023:1: ( ruleEnumerationValue )
            {
            // InternalOperatingSystemLanguage.g:2023:1: ( ruleEnumerationValue )
            // InternalOperatingSystemLanguage.g:2024:1: ruleEnumerationValue
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
    // InternalOperatingSystemLanguage.g:2033:1: rule__EnumerationDataType__EnumerationValuesAssignment_3_1_1 : ( ruleEnumerationValue ) ;
    public final void rule__EnumerationDataType__EnumerationValuesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2037:1: ( ( ruleEnumerationValue ) )
            // InternalOperatingSystemLanguage.g:2038:1: ( ruleEnumerationValue )
            {
            // InternalOperatingSystemLanguage.g:2038:1: ( ruleEnumerationValue )
            // InternalOperatingSystemLanguage.g:2039:1: ruleEnumerationValue
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
    // InternalOperatingSystemLanguage.g:2048:1: rule__APICommand__ReturnDataTypeAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__APICommand__ReturnDataTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2052:1: ( ( ( ruleEString ) ) )
            // InternalOperatingSystemLanguage.g:2053:1: ( ( ruleEString ) )
            {
            // InternalOperatingSystemLanguage.g:2053:1: ( ( ruleEString ) )
            // InternalOperatingSystemLanguage.g:2054:1: ( ruleEString )
            {
             before(grammarAccess.getAPICommandAccess().getReturnDataTypeDataTypeCrossReference_0_0()); 
            // InternalOperatingSystemLanguage.g:2055:1: ( ruleEString )
            // InternalOperatingSystemLanguage.g:2056:1: ruleEString
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
    // InternalOperatingSystemLanguage.g:2067:1: rule__APICommand__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__APICommand__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2071:1: ( ( ruleEString ) )
            // InternalOperatingSystemLanguage.g:2072:1: ( ruleEString )
            {
            // InternalOperatingSystemLanguage.g:2072:1: ( ruleEString )
            // InternalOperatingSystemLanguage.g:2073:1: ruleEString
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
    // InternalOperatingSystemLanguage.g:2082:1: rule__APICommand__ParametersAssignment_3_0 : ( ruleParameter ) ;
    public final void rule__APICommand__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2086:1: ( ( ruleParameter ) )
            // InternalOperatingSystemLanguage.g:2087:1: ( ruleParameter )
            {
            // InternalOperatingSystemLanguage.g:2087:1: ( ruleParameter )
            // InternalOperatingSystemLanguage.g:2088:1: ruleParameter
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
    // InternalOperatingSystemLanguage.g:2097:1: rule__APICommand__ParametersAssignment_3_1_1 : ( ruleParameter ) ;
    public final void rule__APICommand__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2101:1: ( ( ruleParameter ) )
            // InternalOperatingSystemLanguage.g:2102:1: ( ruleParameter )
            {
            // InternalOperatingSystemLanguage.g:2102:1: ( ruleParameter )
            // InternalOperatingSystemLanguage.g:2103:1: ruleParameter
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
    // InternalOperatingSystemLanguage.g:2112:1: rule__APICommand__ConstraintsAssignment_5 : ( ruleTimeConstraint ) ;
    public final void rule__APICommand__ConstraintsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2116:1: ( ( ruleTimeConstraint ) )
            // InternalOperatingSystemLanguage.g:2117:1: ( ruleTimeConstraint )
            {
            // InternalOperatingSystemLanguage.g:2117:1: ( ruleTimeConstraint )
            // InternalOperatingSystemLanguage.g:2118:1: ruleTimeConstraint
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
    // InternalOperatingSystemLanguage.g:2127:1: rule__Parameter__DataTypeAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__Parameter__DataTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2131:1: ( ( ( ruleEString ) ) )
            // InternalOperatingSystemLanguage.g:2132:1: ( ( ruleEString ) )
            {
            // InternalOperatingSystemLanguage.g:2132:1: ( ( ruleEString ) )
            // InternalOperatingSystemLanguage.g:2133:1: ( ruleEString )
            {
             before(grammarAccess.getParameterAccess().getDataTypeDataTypeCrossReference_0_0()); 
            // InternalOperatingSystemLanguage.g:2134:1: ( ruleEString )
            // InternalOperatingSystemLanguage.g:2135:1: ruleEString
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
    // InternalOperatingSystemLanguage.g:2146:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2150:1: ( ( ruleEString ) )
            // InternalOperatingSystemLanguage.g:2151:1: ( ruleEString )
            {
            // InternalOperatingSystemLanguage.g:2151:1: ( ruleEString )
            // InternalOperatingSystemLanguage.g:2152:1: ruleEString
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
    // InternalOperatingSystemLanguage.g:2161:1: rule__EnumerationValue__ValueAssignment : ( ruleEString ) ;
    public final void rule__EnumerationValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2165:1: ( ( ruleEString ) )
            // InternalOperatingSystemLanguage.g:2166:1: ( ruleEString )
            {
            // InternalOperatingSystemLanguage.g:2166:1: ( ruleEString )
            // InternalOperatingSystemLanguage.g:2167:1: ruleEString
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
    // InternalOperatingSystemLanguage.g:2176:1: rule__TimeConstraint__SamplingTimeAssignment_1 : ( ruleTimeValue ) ;
    public final void rule__TimeConstraint__SamplingTimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2180:1: ( ( ruleTimeValue ) )
            // InternalOperatingSystemLanguage.g:2181:1: ( ruleTimeValue )
            {
            // InternalOperatingSystemLanguage.g:2181:1: ( ruleTimeValue )
            // InternalOperatingSystemLanguage.g:2182:1: ruleTimeValue
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
    // InternalOperatingSystemLanguage.g:2191:1: rule__TimeValue__ValueAssignment_0 : ( ruleLiteralExpression ) ;
    public final void rule__TimeValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2195:1: ( ( ruleLiteralExpression ) )
            // InternalOperatingSystemLanguage.g:2196:1: ( ruleLiteralExpression )
            {
            // InternalOperatingSystemLanguage.g:2196:1: ( ruleLiteralExpression )
            // InternalOperatingSystemLanguage.g:2197:1: ruleLiteralExpression
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
    // InternalOperatingSystemLanguage.g:2206:1: rule__TimeValue__UnitAssignment_1 : ( ruleTimeUnitExpr ) ;
    public final void rule__TimeValue__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2210:1: ( ( ruleTimeUnitExpr ) )
            // InternalOperatingSystemLanguage.g:2211:1: ( ruleTimeUnitExpr )
            {
            // InternalOperatingSystemLanguage.g:2211:1: ( ruleTimeUnitExpr )
            // InternalOperatingSystemLanguage.g:2212:1: ruleTimeUnitExpr
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


    // $ANTLR start "rule__LiteralExpression__ValueAssignment_1"
    // InternalOperatingSystemLanguage.g:2221:1: rule__LiteralExpression__ValueAssignment_1 : ( ruleLiteral ) ;
    public final void rule__LiteralExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalOperatingSystemLanguage.g:2225:1: ( ( ruleLiteral ) )
            // InternalOperatingSystemLanguage.g:2226:1: ( ruleLiteral )
            {
            // InternalOperatingSystemLanguage.g:2226:1: ( ruleLiteral )
            // InternalOperatingSystemLanguage.g:2227:1: ruleLiteral
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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000006800000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000006000002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800030L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000032L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000030L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000C0000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000001001C0L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000FE000L});
    }


}