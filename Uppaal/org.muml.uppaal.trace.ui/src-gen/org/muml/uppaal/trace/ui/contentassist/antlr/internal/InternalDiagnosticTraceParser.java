package org.muml.uppaal.trace.ui.contentassist.antlr.internal; 

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
import org.muml.uppaal.trace.services.DiagnosticTraceGrammarAccess;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDiagnosticTraceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_EDGE", "RULE_DEPTH", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'tau'", "'property'", "'formula'", "'Showing counter example.'", "'Showing example trace.'", "'-- Property is satisfied.'", "'-- Property is NOT satisfied.'", "'-- Formula is satisfied.'", "'-- Formula is NOT satisfied.'", "'='", "'<='", "'>='", "'?'", "'!'", "'Cannot reuse state space when trace length optimisation is used.'", "'Verifying'", "'at line'", "'('", "')'", "','", "'.'", "'-'", "'['", "']'", "'State'", "':'", "'->'", "'Delay:'", "'Transitions:'"
    };
    public static final int RULE_DEPTH=7;
    public static final int RULE_EDGE=6;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDiagnosticTraceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDiagnosticTraceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDiagnosticTraceParser.tokenNames; }
    public String getGrammarFileName() { return "../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g"; }


     
     	private DiagnosticTraceGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DiagnosticTraceGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleTraceRepository"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:60:1: entryRuleTraceRepository : ruleTraceRepository EOF ;
    public final void entryRuleTraceRepository() throws RecognitionException {
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:61:1: ( ruleTraceRepository EOF )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:62:1: ruleTraceRepository EOF
            {
             before(grammarAccess.getTraceRepositoryRule()); 
            pushFollow(FOLLOW_ruleTraceRepository_in_entryRuleTraceRepository61);
            ruleTraceRepository();

            state._fsp--;

             after(grammarAccess.getTraceRepositoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTraceRepository68); 

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
    // $ANTLR end "entryRuleTraceRepository"


    // $ANTLR start "ruleTraceRepository"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:69:1: ruleTraceRepository : ( ( rule__TraceRepository__Group__0 ) ) ;
    public final void ruleTraceRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:73:2: ( ( ( rule__TraceRepository__Group__0 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:74:1: ( ( rule__TraceRepository__Group__0 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:74:1: ( ( rule__TraceRepository__Group__0 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:75:1: ( rule__TraceRepository__Group__0 )
            {
             before(grammarAccess.getTraceRepositoryAccess().getGroup()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:76:1: ( rule__TraceRepository__Group__0 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:76:2: rule__TraceRepository__Group__0
            {
            pushFollow(FOLLOW_rule__TraceRepository__Group__0_in_ruleTraceRepository94);
            rule__TraceRepository__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTraceRepositoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTraceRepository"


    // $ANTLR start "entryRuleTrace"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:88:1: entryRuleTrace : ruleTrace EOF ;
    public final void entryRuleTrace() throws RecognitionException {
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:89:1: ( ruleTrace EOF )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:90:1: ruleTrace EOF
            {
             before(grammarAccess.getTraceRule()); 
            pushFollow(FOLLOW_ruleTrace_in_entryRuleTrace121);
            ruleTrace();

            state._fsp--;

             after(grammarAccess.getTraceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrace128); 

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
    // $ANTLR end "entryRuleTrace"


    // $ANTLR start "ruleTrace"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:97:1: ruleTrace : ( ( rule__Trace__Group__0 ) ) ;
    public final void ruleTrace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:101:2: ( ( ( rule__Trace__Group__0 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:102:1: ( ( rule__Trace__Group__0 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:102:1: ( ( rule__Trace__Group__0 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:103:1: ( rule__Trace__Group__0 )
            {
             before(grammarAccess.getTraceAccess().getGroup()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:104:1: ( rule__Trace__Group__0 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:104:2: rule__Trace__Group__0
            {
            pushFollow(FOLLOW_rule__Trace__Group__0_in_ruleTrace154);
            rule__Trace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrace"


    // $ANTLR start "entryRuleProcessIdentifier"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:116:1: entryRuleProcessIdentifier : ruleProcessIdentifier EOF ;
    public final void entryRuleProcessIdentifier() throws RecognitionException {
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:117:1: ( ruleProcessIdentifier EOF )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:118:1: ruleProcessIdentifier EOF
            {
             before(grammarAccess.getProcessIdentifierRule()); 
            pushFollow(FOLLOW_ruleProcessIdentifier_in_entryRuleProcessIdentifier181);
            ruleProcessIdentifier();

            state._fsp--;

             after(grammarAccess.getProcessIdentifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcessIdentifier188); 

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
    // $ANTLR end "entryRuleProcessIdentifier"


    // $ANTLR start "ruleProcessIdentifier"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:125:1: ruleProcessIdentifier : ( ( rule__ProcessIdentifier__Group__0 ) ) ;
    public final void ruleProcessIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:129:2: ( ( ( rule__ProcessIdentifier__Group__0 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:130:1: ( ( rule__ProcessIdentifier__Group__0 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:130:1: ( ( rule__ProcessIdentifier__Group__0 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:131:1: ( rule__ProcessIdentifier__Group__0 )
            {
             before(grammarAccess.getProcessIdentifierAccess().getGroup()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:132:1: ( rule__ProcessIdentifier__Group__0 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:132:2: rule__ProcessIdentifier__Group__0
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__Group__0_in_ruleProcessIdentifier214);
            rule__ProcessIdentifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessIdentifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProcessIdentifier"


    // $ANTLR start "entryRuleLocationActivity"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:144:1: entryRuleLocationActivity : ruleLocationActivity EOF ;
    public final void entryRuleLocationActivity() throws RecognitionException {
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:145:1: ( ruleLocationActivity EOF )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:146:1: ruleLocationActivity EOF
            {
             before(grammarAccess.getLocationActivityRule()); 
            pushFollow(FOLLOW_ruleLocationActivity_in_entryRuleLocationActivity241);
            ruleLocationActivity();

            state._fsp--;

             after(grammarAccess.getLocationActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocationActivity248); 

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
    // $ANTLR end "entryRuleLocationActivity"


    // $ANTLR start "ruleLocationActivity"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:153:1: ruleLocationActivity : ( ( rule__LocationActivity__Group__0 ) ) ;
    public final void ruleLocationActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:157:2: ( ( ( rule__LocationActivity__Group__0 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:158:1: ( ( rule__LocationActivity__Group__0 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:158:1: ( ( rule__LocationActivity__Group__0 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:159:1: ( rule__LocationActivity__Group__0 )
            {
             before(grammarAccess.getLocationActivityAccess().getGroup()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:160:1: ( rule__LocationActivity__Group__0 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:160:2: rule__LocationActivity__Group__0
            {
            pushFollow(FOLLOW_rule__LocationActivity__Group__0_in_ruleLocationActivity274);
            rule__LocationActivity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocationActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocationActivity"


    // $ANTLR start "entryRuleVariableValue"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:172:1: entryRuleVariableValue : ruleVariableValue EOF ;
    public final void entryRuleVariableValue() throws RecognitionException {
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:173:1: ( ruleVariableValue EOF )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:174:1: ruleVariableValue EOF
            {
             before(grammarAccess.getVariableValueRule()); 
            pushFollow(FOLLOW_ruleVariableValue_in_entryRuleVariableValue301);
            ruleVariableValue();

            state._fsp--;

             after(grammarAccess.getVariableValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableValue308); 

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
    // $ANTLR end "entryRuleVariableValue"


    // $ANTLR start "ruleVariableValue"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:181:1: ruleVariableValue : ( ( rule__VariableValue__Group__0 ) ) ;
    public final void ruleVariableValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:185:2: ( ( ( rule__VariableValue__Group__0 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:186:1: ( ( rule__VariableValue__Group__0 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:186:1: ( ( rule__VariableValue__Group__0 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:187:1: ( rule__VariableValue__Group__0 )
            {
             before(grammarAccess.getVariableValueAccess().getGroup()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:188:1: ( rule__VariableValue__Group__0 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:188:2: rule__VariableValue__Group__0
            {
            pushFollow(FOLLOW_rule__VariableValue__Group__0_in_ruleVariableValue334);
            rule__VariableValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableValue"


    // $ANTLR start "entryRuleSingleNamedElementReference"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:200:1: entryRuleSingleNamedElementReference : ruleSingleNamedElementReference EOF ;
    public final void entryRuleSingleNamedElementReference() throws RecognitionException {
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:201:1: ( ruleSingleNamedElementReference EOF )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:202:1: ruleSingleNamedElementReference EOF
            {
             before(grammarAccess.getSingleNamedElementReferenceRule()); 
            pushFollow(FOLLOW_ruleSingleNamedElementReference_in_entryRuleSingleNamedElementReference361);
            ruleSingleNamedElementReference();

            state._fsp--;

             after(grammarAccess.getSingleNamedElementReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleNamedElementReference368); 

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
    // $ANTLR end "entryRuleSingleNamedElementReference"


    // $ANTLR start "ruleSingleNamedElementReference"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:209:1: ruleSingleNamedElementReference : ( ( rule__SingleNamedElementReference__Group__0 ) ) ;
    public final void ruleSingleNamedElementReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:213:2: ( ( ( rule__SingleNamedElementReference__Group__0 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:214:1: ( ( rule__SingleNamedElementReference__Group__0 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:214:1: ( ( rule__SingleNamedElementReference__Group__0 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:215:1: ( rule__SingleNamedElementReference__Group__0 )
            {
             before(grammarAccess.getSingleNamedElementReferenceAccess().getGroup()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:216:1: ( rule__SingleNamedElementReference__Group__0 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:216:2: rule__SingleNamedElementReference__Group__0
            {
            pushFollow(FOLLOW_rule__SingleNamedElementReference__Group__0_in_ruleSingleNamedElementReference394);
            rule__SingleNamedElementReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSingleNamedElementReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleNamedElementReference"


    // $ANTLR start "entryRuleNamedElementReference"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:228:1: entryRuleNamedElementReference : ruleNamedElementReference EOF ;
    public final void entryRuleNamedElementReference() throws RecognitionException {
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:229:1: ( ruleNamedElementReference EOF )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:230:1: ruleNamedElementReference EOF
            {
             before(grammarAccess.getNamedElementReferenceRule()); 
            pushFollow(FOLLOW_ruleNamedElementReference_in_entryRuleNamedElementReference421);
            ruleNamedElementReference();

            state._fsp--;

             after(grammarAccess.getNamedElementReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedElementReference428); 

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
    // $ANTLR end "entryRuleNamedElementReference"


    // $ANTLR start "ruleNamedElementReference"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:237:1: ruleNamedElementReference : ( ( rule__NamedElementReference__Group__0 ) ) ;
    public final void ruleNamedElementReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:241:2: ( ( ( rule__NamedElementReference__Group__0 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:242:1: ( ( rule__NamedElementReference__Group__0 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:242:1: ( ( rule__NamedElementReference__Group__0 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:243:1: ( rule__NamedElementReference__Group__0 )
            {
             before(grammarAccess.getNamedElementReferenceAccess().getGroup()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:244:1: ( rule__NamedElementReference__Group__0 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:244:2: rule__NamedElementReference__Group__0
            {
            pushFollow(FOLLOW_rule__NamedElementReference__Group__0_in_ruleNamedElementReference454);
            rule__NamedElementReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamedElementReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedElementReference"


    // $ANTLR start "entryRuleTraceItem"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:256:1: entryRuleTraceItem : ruleTraceItem EOF ;
    public final void entryRuleTraceItem() throws RecognitionException {
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:257:1: ( ruleTraceItem EOF )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:258:1: ruleTraceItem EOF
            {
             before(grammarAccess.getTraceItemRule()); 
            pushFollow(FOLLOW_ruleTraceItem_in_entryRuleTraceItem481);
            ruleTraceItem();

            state._fsp--;

             after(grammarAccess.getTraceItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTraceItem488); 

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
    // $ANTLR end "entryRuleTraceItem"


    // $ANTLR start "ruleTraceItem"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:265:1: ruleTraceItem : ( ( rule__TraceItem__Alternatives ) ) ;
    public final void ruleTraceItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:269:2: ( ( ( rule__TraceItem__Alternatives ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:270:1: ( ( rule__TraceItem__Alternatives ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:270:1: ( ( rule__TraceItem__Alternatives ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:271:1: ( rule__TraceItem__Alternatives )
            {
             before(grammarAccess.getTraceItemAccess().getAlternatives()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:272:1: ( rule__TraceItem__Alternatives )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:272:2: rule__TraceItem__Alternatives
            {
            pushFollow(FOLLOW_rule__TraceItem__Alternatives_in_ruleTraceItem514);
            rule__TraceItem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTraceItemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTraceItem"


    // $ANTLR start "entryRuleState"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:284:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_DEPTH");

        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:288:1: ( ruleState EOF )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:289:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState546);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState553); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:299:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_DEPTH");
        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:304:2: ( ( ( rule__State__Group__0 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:305:1: ( ( rule__State__Group__0 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:305:1: ( ( rule__State__Group__0 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:306:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:307:1: ( rule__State__Group__0 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:307:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState583);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleEdgeActivity"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:320:1: entryRuleEdgeActivity : ruleEdgeActivity EOF ;
    public final void entryRuleEdgeActivity() throws RecognitionException {
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:321:1: ( ruleEdgeActivity EOF )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:322:1: ruleEdgeActivity EOF
            {
             before(grammarAccess.getEdgeActivityRule()); 
            pushFollow(FOLLOW_ruleEdgeActivity_in_entryRuleEdgeActivity610);
            ruleEdgeActivity();

            state._fsp--;

             after(grammarAccess.getEdgeActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEdgeActivity617); 

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
    // $ANTLR end "entryRuleEdgeActivity"


    // $ANTLR start "ruleEdgeActivity"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:329:1: ruleEdgeActivity : ( ( rule__EdgeActivity__Group__0 ) ) ;
    public final void ruleEdgeActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:333:2: ( ( ( rule__EdgeActivity__Group__0 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:334:1: ( ( rule__EdgeActivity__Group__0 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:334:1: ( ( rule__EdgeActivity__Group__0 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:335:1: ( rule__EdgeActivity__Group__0 )
            {
             before(grammarAccess.getEdgeActivityAccess().getGroup()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:336:1: ( rule__EdgeActivity__Group__0 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:336:2: rule__EdgeActivity__Group__0
            {
            pushFollow(FOLLOW_rule__EdgeActivity__Group__0_in_ruleEdgeActivity643);
            rule__EdgeActivity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEdgeActivity"


    // $ANTLR start "entryRuleChannelSynchronization"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:350:1: entryRuleChannelSynchronization : ruleChannelSynchronization EOF ;
    public final void entryRuleChannelSynchronization() throws RecognitionException {
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:351:1: ( ruleChannelSynchronization EOF )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:352:1: ruleChannelSynchronization EOF
            {
             before(grammarAccess.getChannelSynchronizationRule()); 
            pushFollow(FOLLOW_ruleChannelSynchronization_in_entryRuleChannelSynchronization672);
            ruleChannelSynchronization();

            state._fsp--;

             after(grammarAccess.getChannelSynchronizationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChannelSynchronization679); 

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
    // $ANTLR end "entryRuleChannelSynchronization"


    // $ANTLR start "ruleChannelSynchronization"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:359:1: ruleChannelSynchronization : ( ( rule__ChannelSynchronization__Group__0 ) ) ;
    public final void ruleChannelSynchronization() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:363:2: ( ( ( rule__ChannelSynchronization__Group__0 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:364:1: ( ( rule__ChannelSynchronization__Group__0 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:364:1: ( ( rule__ChannelSynchronization__Group__0 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:365:1: ( rule__ChannelSynchronization__Group__0 )
            {
             before(grammarAccess.getChannelSynchronizationAccess().getGroup()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:366:1: ( rule__ChannelSynchronization__Group__0 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:366:2: rule__ChannelSynchronization__Group__0
            {
            pushFollow(FOLLOW_rule__ChannelSynchronization__Group__0_in_ruleChannelSynchronization705);
            rule__ChannelSynchronization__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChannelSynchronizationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChannelSynchronization"


    // $ANTLR start "entryRuleTauSynchronization"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:378:1: entryRuleTauSynchronization : ruleTauSynchronization EOF ;
    public final void entryRuleTauSynchronization() throws RecognitionException {
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:379:1: ( ruleTauSynchronization EOF )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:380:1: ruleTauSynchronization EOF
            {
             before(grammarAccess.getTauSynchronizationRule()); 
            pushFollow(FOLLOW_ruleTauSynchronization_in_entryRuleTauSynchronization732);
            ruleTauSynchronization();

            state._fsp--;

             after(grammarAccess.getTauSynchronizationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTauSynchronization739); 

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
    // $ANTLR end "entryRuleTauSynchronization"


    // $ANTLR start "ruleTauSynchronization"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:387:1: ruleTauSynchronization : ( 'tau' ) ;
    public final void ruleTauSynchronization() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:391:2: ( ( 'tau' ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:392:1: ( 'tau' )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:392:1: ( 'tau' )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:393:1: 'tau'
            {
             before(grammarAccess.getTauSynchronizationAccess().getTauKeyword()); 
            match(input,13,FOLLOW_13_in_ruleTauSynchronization766); 
             after(grammarAccess.getTauSynchronizationAccess().getTauKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTauSynchronization"


    // $ANTLR start "entryRuleDelayTransition"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:408:1: entryRuleDelayTransition : ruleDelayTransition EOF ;
    public final void entryRuleDelayTransition() throws RecognitionException {
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:409:1: ( ruleDelayTransition EOF )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:410:1: ruleDelayTransition EOF
            {
             before(grammarAccess.getDelayTransitionRule()); 
            pushFollow(FOLLOW_ruleDelayTransition_in_entryRuleDelayTransition794);
            ruleDelayTransition();

            state._fsp--;

             after(grammarAccess.getDelayTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelayTransition801); 

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
    // $ANTLR end "entryRuleDelayTransition"


    // $ANTLR start "ruleDelayTransition"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:417:1: ruleDelayTransition : ( ( rule__DelayTransition__Group__0 ) ) ;
    public final void ruleDelayTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:421:2: ( ( ( rule__DelayTransition__Group__0 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:422:1: ( ( rule__DelayTransition__Group__0 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:422:1: ( ( rule__DelayTransition__Group__0 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:423:1: ( rule__DelayTransition__Group__0 )
            {
             before(grammarAccess.getDelayTransitionAccess().getGroup()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:424:1: ( rule__DelayTransition__Group__0 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:424:2: rule__DelayTransition__Group__0
            {
            pushFollow(FOLLOW_rule__DelayTransition__Group__0_in_ruleDelayTransition827);
            rule__DelayTransition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDelayTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDelayTransition"


    // $ANTLR start "entryRuleActionTransition"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:436:1: entryRuleActionTransition : ruleActionTransition EOF ;
    public final void entryRuleActionTransition() throws RecognitionException {
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:437:1: ( ruleActionTransition EOF )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:438:1: ruleActionTransition EOF
            {
             before(grammarAccess.getActionTransitionRule()); 
            pushFollow(FOLLOW_ruleActionTransition_in_entryRuleActionTransition854);
            ruleActionTransition();

            state._fsp--;

             after(grammarAccess.getActionTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionTransition861); 

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
    // $ANTLR end "entryRuleActionTransition"


    // $ANTLR start "ruleActionTransition"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:445:1: ruleActionTransition : ( ( rule__ActionTransition__Group__0 ) ) ;
    public final void ruleActionTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:449:2: ( ( ( rule__ActionTransition__Group__0 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:450:1: ( ( rule__ActionTransition__Group__0 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:450:1: ( ( rule__ActionTransition__Group__0 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:451:1: ( rule__ActionTransition__Group__0 )
            {
             before(grammarAccess.getActionTransitionAccess().getGroup()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:452:1: ( rule__ActionTransition__Group__0 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:452:2: rule__ActionTransition__Group__0
            {
            pushFollow(FOLLOW_rule__ActionTransition__Group__0_in_ruleActionTransition887);
            rule__ActionTransition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionTransition"


    // $ANTLR start "entryRuleTransition"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:464:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:465:1: ( ruleTransition EOF )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:466:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition914);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition921); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:473:1: ruleTransition : ( ( rule__Transition__Alternatives ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:477:2: ( ( ( rule__Transition__Alternatives ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:478:1: ( ( rule__Transition__Alternatives ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:478:1: ( ( rule__Transition__Alternatives ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:479:1: ( rule__Transition__Alternatives )
            {
             before(grammarAccess.getTransitionAccess().getAlternatives()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:480:1: ( rule__Transition__Alternatives )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:480:2: rule__Transition__Alternatives
            {
            pushFollow(FOLLOW_rule__Transition__Alternatives_in_ruleTransition947);
            rule__Transition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "ruleResult"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:493:1: ruleResult : ( ( rule__Result__Alternatives ) ) ;
    public final void ruleResult() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:497:1: ( ( ( rule__Result__Alternatives ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:498:1: ( ( rule__Result__Alternatives ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:498:1: ( ( rule__Result__Alternatives ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:499:1: ( rule__Result__Alternatives )
            {
             before(grammarAccess.getResultAccess().getAlternatives()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:500:1: ( rule__Result__Alternatives )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:500:2: rule__Result__Alternatives
            {
            pushFollow(FOLLOW_rule__Result__Alternatives_in_ruleResult984);
            rule__Result__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getResultAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResult"


    // $ANTLR start "ruleCompareOperator"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:512:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:516:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:517:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:517:1: ( ( rule__CompareOperator__Alternatives ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:518:1: ( rule__CompareOperator__Alternatives )
            {
             before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:519:1: ( rule__CompareOperator__Alternatives )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:519:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1020);
            rule__CompareOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCompareOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "ruleSynchronizationKind"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:531:1: ruleSynchronizationKind : ( ( rule__SynchronizationKind__Alternatives ) ) ;
    public final void ruleSynchronizationKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:535:1: ( ( ( rule__SynchronizationKind__Alternatives ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:536:1: ( ( rule__SynchronizationKind__Alternatives ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:536:1: ( ( rule__SynchronizationKind__Alternatives ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:537:1: ( rule__SynchronizationKind__Alternatives )
            {
             before(grammarAccess.getSynchronizationKindAccess().getAlternatives()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:538:1: ( rule__SynchronizationKind__Alternatives )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:538:2: rule__SynchronizationKind__Alternatives
            {
            pushFollow(FOLLOW_rule__SynchronizationKind__Alternatives_in_ruleSynchronizationKind1056);
            rule__SynchronizationKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSynchronizationKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSynchronizationKind"


    // $ANTLR start "rule__Trace__Alternatives_1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:549:1: rule__Trace__Alternatives_1 : ( ( 'property' ) | ( 'formula' ) );
    public final void rule__Trace__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:553:1: ( ( 'property' ) | ( 'formula' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:554:1: ( 'property' )
                    {
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:554:1: ( 'property' )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:555:1: 'property'
                    {
                     before(grammarAccess.getTraceAccess().getPropertyKeyword_1_0()); 
                    match(input,14,FOLLOW_14_in_rule__Trace__Alternatives_11092); 
                     after(grammarAccess.getTraceAccess().getPropertyKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:562:6: ( 'formula' )
                    {
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:562:6: ( 'formula' )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:563:1: 'formula'
                    {
                     before(grammarAccess.getTraceAccess().getFormulaKeyword_1_1()); 
                    match(input,15,FOLLOW_15_in_rule__Trace__Alternatives_11112); 
                     after(grammarAccess.getTraceAccess().getFormulaKeyword_1_1()); 

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
    // $ANTLR end "rule__Trace__Alternatives_1"


    // $ANTLR start "rule__Trace__Alternatives_6_0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:575:1: rule__Trace__Alternatives_6_0 : ( ( 'Showing counter example.' ) | ( 'Showing example trace.' ) );
    public final void rule__Trace__Alternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:579:1: ( ( 'Showing counter example.' ) | ( 'Showing example trace.' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:580:1: ( 'Showing counter example.' )
                    {
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:580:1: ( 'Showing counter example.' )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:581:1: 'Showing counter example.'
                    {
                     before(grammarAccess.getTraceAccess().getShowingCounterExampleKeyword_6_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__Trace__Alternatives_6_01147); 
                     after(grammarAccess.getTraceAccess().getShowingCounterExampleKeyword_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:588:6: ( 'Showing example trace.' )
                    {
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:588:6: ( 'Showing example trace.' )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:589:1: 'Showing example trace.'
                    {
                     before(grammarAccess.getTraceAccess().getShowingExampleTraceKeyword_6_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__Trace__Alternatives_6_01167); 
                     after(grammarAccess.getTraceAccess().getShowingExampleTraceKeyword_6_0_1()); 

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
    // $ANTLR end "rule__Trace__Alternatives_6_0"


    // $ANTLR start "rule__TraceItem__Alternatives"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:601:1: rule__TraceItem__Alternatives : ( ( ruleState ) | ( ruleTransition ) );
    public final void rule__TraceItem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:605:1: ( ( ruleState ) | ( ruleTransition ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==37) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=40 && LA3_0<=41)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:606:1: ( ruleState )
                    {
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:606:1: ( ruleState )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:607:1: ruleState
                    {
                     before(grammarAccess.getTraceItemAccess().getStateParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleState_in_rule__TraceItem__Alternatives1201);
                    ruleState();

                    state._fsp--;

                     after(grammarAccess.getTraceItemAccess().getStateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:612:6: ( ruleTransition )
                    {
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:612:6: ( ruleTransition )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:613:1: ruleTransition
                    {
                     before(grammarAccess.getTraceItemAccess().getTransitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTransition_in_rule__TraceItem__Alternatives1218);
                    ruleTransition();

                    state._fsp--;

                     after(grammarAccess.getTraceItemAccess().getTransitionParserRuleCall_1()); 

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
    // $ANTLR end "rule__TraceItem__Alternatives"


    // $ANTLR start "rule__Transition__Alternatives"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:624:1: rule__Transition__Alternatives : ( ( ruleActionTransition ) | ( ruleDelayTransition ) );
    public final void rule__Transition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:628:1: ( ( ruleActionTransition ) | ( ruleDelayTransition ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==41) ) {
                alt4=1;
            }
            else if ( (LA4_0==40) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:629:1: ( ruleActionTransition )
                    {
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:629:1: ( ruleActionTransition )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:630:1: ruleActionTransition
                    {
                     before(grammarAccess.getTransitionAccess().getActionTransitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActionTransition_in_rule__Transition__Alternatives1251);
                    ruleActionTransition();

                    state._fsp--;

                     after(grammarAccess.getTransitionAccess().getActionTransitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:635:6: ( ruleDelayTransition )
                    {
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:635:6: ( ruleDelayTransition )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:636:1: ruleDelayTransition
                    {
                     before(grammarAccess.getTransitionAccess().getDelayTransitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDelayTransition_in_rule__Transition__Alternatives1268);
                    ruleDelayTransition();

                    state._fsp--;

                     after(grammarAccess.getTransitionAccess().getDelayTransitionParserRuleCall_1()); 

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
    // $ANTLR end "rule__Transition__Alternatives"


    // $ANTLR start "rule__Result__Alternatives"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:646:1: rule__Result__Alternatives : ( ( ( '-- Property is satisfied.' ) ) | ( ( '-- Property is NOT satisfied.' ) ) | ( ( '-- Formula is satisfied.' ) ) | ( ( '-- Formula is NOT satisfied.' ) ) );
    public final void rule__Result__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:650:1: ( ( ( '-- Property is satisfied.' ) ) | ( ( '-- Property is NOT satisfied.' ) ) | ( ( '-- Formula is satisfied.' ) ) | ( ( '-- Formula is NOT satisfied.' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            case 21:
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
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:651:1: ( ( '-- Property is satisfied.' ) )
                    {
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:651:1: ( ( '-- Property is satisfied.' ) )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:652:1: ( '-- Property is satisfied.' )
                    {
                     before(grammarAccess.getResultAccess().getSUCCESSEnumLiteralDeclaration_0()); 
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:653:1: ( '-- Property is satisfied.' )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:653:3: '-- Property is satisfied.'
                    {
                    match(input,18,FOLLOW_18_in_rule__Result__Alternatives1301); 

                    }

                     after(grammarAccess.getResultAccess().getSUCCESSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:658:6: ( ( '-- Property is NOT satisfied.' ) )
                    {
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:658:6: ( ( '-- Property is NOT satisfied.' ) )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:659:1: ( '-- Property is NOT satisfied.' )
                    {
                     before(grammarAccess.getResultAccess().getFAILUREEnumLiteralDeclaration_1()); 
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:660:1: ( '-- Property is NOT satisfied.' )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:660:3: '-- Property is NOT satisfied.'
                    {
                    match(input,19,FOLLOW_19_in_rule__Result__Alternatives1322); 

                    }

                     after(grammarAccess.getResultAccess().getFAILUREEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:665:6: ( ( '-- Formula is satisfied.' ) )
                    {
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:665:6: ( ( '-- Formula is satisfied.' ) )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:666:1: ( '-- Formula is satisfied.' )
                    {
                     before(grammarAccess.getResultAccess().getSUCCESSEnumLiteralDeclaration_2()); 
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:667:1: ( '-- Formula is satisfied.' )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:667:3: '-- Formula is satisfied.'
                    {
                    match(input,20,FOLLOW_20_in_rule__Result__Alternatives1343); 

                    }

                     after(grammarAccess.getResultAccess().getSUCCESSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:672:6: ( ( '-- Formula is NOT satisfied.' ) )
                    {
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:672:6: ( ( '-- Formula is NOT satisfied.' ) )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:673:1: ( '-- Formula is NOT satisfied.' )
                    {
                     before(grammarAccess.getResultAccess().getFAILUREEnumLiteralDeclaration_3()); 
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:674:1: ( '-- Formula is NOT satisfied.' )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:674:3: '-- Formula is NOT satisfied.'
                    {
                    match(input,21,FOLLOW_21_in_rule__Result__Alternatives1364); 

                    }

                     after(grammarAccess.getResultAccess().getFAILUREEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Result__Alternatives"


    // $ANTLR start "rule__CompareOperator__Alternatives"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:684:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:688:1: ( ( ( '=' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt6=1;
                }
                break;
            case 23:
                {
                alt6=2;
                }
                break;
            case 24:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:689:1: ( ( '=' ) )
                    {
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:689:1: ( ( '=' ) )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:690:1: ( '=' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:691:1: ( '=' )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:691:3: '='
                    {
                    match(input,22,FOLLOW_22_in_rule__CompareOperator__Alternatives1400); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:696:6: ( ( '<=' ) )
                    {
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:696:6: ( ( '<=' ) )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:697:1: ( '<=' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_1()); 
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:698:1: ( '<=' )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:698:3: '<='
                    {
                    match(input,23,FOLLOW_23_in_rule__CompareOperator__Alternatives1421); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getLEQEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:703:6: ( ( '>=' ) )
                    {
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:703:6: ( ( '>=' ) )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:704:1: ( '>=' )
                    {
                     before(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2()); 
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:705:1: ( '>=' )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:705:3: '>='
                    {
                    match(input,24,FOLLOW_24_in_rule__CompareOperator__Alternatives1442); 

                    }

                     after(grammarAccess.getCompareOperatorAccess().getGEQEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__CompareOperator__Alternatives"


    // $ANTLR start "rule__SynchronizationKind__Alternatives"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:715:1: rule__SynchronizationKind__Alternatives : ( ( ( '?' ) ) | ( ( '!' ) ) );
    public final void rule__SynchronizationKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:719:1: ( ( ( '?' ) ) | ( ( '!' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            else if ( (LA7_0==26) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:720:1: ( ( '?' ) )
                    {
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:720:1: ( ( '?' ) )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:721:1: ( '?' )
                    {
                     before(grammarAccess.getSynchronizationKindAccess().getRECEIVEEnumLiteralDeclaration_0()); 
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:722:1: ( '?' )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:722:3: '?'
                    {
                    match(input,25,FOLLOW_25_in_rule__SynchronizationKind__Alternatives1478); 

                    }

                     after(grammarAccess.getSynchronizationKindAccess().getRECEIVEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:727:6: ( ( '!' ) )
                    {
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:727:6: ( ( '!' ) )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:728:1: ( '!' )
                    {
                     before(grammarAccess.getSynchronizationKindAccess().getSENDEnumLiteralDeclaration_1()); 
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:729:1: ( '!' )
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:729:3: '!'
                    {
                    match(input,26,FOLLOW_26_in_rule__SynchronizationKind__Alternatives1499); 

                    }

                     after(grammarAccess.getSynchronizationKindAccess().getSENDEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__SynchronizationKind__Alternatives"


    // $ANTLR start "rule__TraceRepository__Group__0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:741:1: rule__TraceRepository__Group__0 : rule__TraceRepository__Group__0__Impl rule__TraceRepository__Group__1 ;
    public final void rule__TraceRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:745:1: ( rule__TraceRepository__Group__0__Impl rule__TraceRepository__Group__1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:746:2: rule__TraceRepository__Group__0__Impl rule__TraceRepository__Group__1
            {
            pushFollow(FOLLOW_rule__TraceRepository__Group__0__Impl_in_rule__TraceRepository__Group__01532);
            rule__TraceRepository__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TraceRepository__Group__1_in_rule__TraceRepository__Group__01535);
            rule__TraceRepository__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceRepository__Group__0"


    // $ANTLR start "rule__TraceRepository__Group__0__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:753:1: rule__TraceRepository__Group__0__Impl : ( ( 'Cannot reuse state space when trace length optimisation is used.' )? ) ;
    public final void rule__TraceRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:757:1: ( ( ( 'Cannot reuse state space when trace length optimisation is used.' )? ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:758:1: ( ( 'Cannot reuse state space when trace length optimisation is used.' )? )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:758:1: ( ( 'Cannot reuse state space when trace length optimisation is used.' )? )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:759:1: ( 'Cannot reuse state space when trace length optimisation is used.' )?
            {
             before(grammarAccess.getTraceRepositoryAccess().getCannotReuseStateSpaceWhenTraceLengthOptimisationIsUsedKeyword_0()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:760:1: ( 'Cannot reuse state space when trace length optimisation is used.' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:761:2: 'Cannot reuse state space when trace length optimisation is used.'
                    {
                    match(input,27,FOLLOW_27_in_rule__TraceRepository__Group__0__Impl1564); 

                    }
                    break;

            }

             after(grammarAccess.getTraceRepositoryAccess().getCannotReuseStateSpaceWhenTraceLengthOptimisationIsUsedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceRepository__Group__0__Impl"


    // $ANTLR start "rule__TraceRepository__Group__1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:772:1: rule__TraceRepository__Group__1 : rule__TraceRepository__Group__1__Impl ;
    public final void rule__TraceRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:776:1: ( rule__TraceRepository__Group__1__Impl )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:777:2: rule__TraceRepository__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TraceRepository__Group__1__Impl_in_rule__TraceRepository__Group__11597);
            rule__TraceRepository__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceRepository__Group__1"


    // $ANTLR start "rule__TraceRepository__Group__1__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:783:1: rule__TraceRepository__Group__1__Impl : ( ( rule__TraceRepository__TracesAssignment_1 )* ) ;
    public final void rule__TraceRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:787:1: ( ( ( rule__TraceRepository__TracesAssignment_1 )* ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:788:1: ( ( rule__TraceRepository__TracesAssignment_1 )* )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:788:1: ( ( rule__TraceRepository__TracesAssignment_1 )* )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:789:1: ( rule__TraceRepository__TracesAssignment_1 )*
            {
             before(grammarAccess.getTraceRepositoryAccess().getTracesAssignment_1()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:790:1: ( rule__TraceRepository__TracesAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:790:2: rule__TraceRepository__TracesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__TraceRepository__TracesAssignment_1_in_rule__TraceRepository__Group__1__Impl1624);
            	    rule__TraceRepository__TracesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTraceRepositoryAccess().getTracesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceRepository__Group__1__Impl"


    // $ANTLR start "rule__Trace__Group__0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:804:1: rule__Trace__Group__0 : rule__Trace__Group__0__Impl rule__Trace__Group__1 ;
    public final void rule__Trace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:808:1: ( rule__Trace__Group__0__Impl rule__Trace__Group__1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:809:2: rule__Trace__Group__0__Impl rule__Trace__Group__1
            {
            pushFollow(FOLLOW_rule__Trace__Group__0__Impl_in_rule__Trace__Group__01659);
            rule__Trace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__1_in_rule__Trace__Group__01662);
            rule__Trace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__0"


    // $ANTLR start "rule__Trace__Group__0__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:816:1: rule__Trace__Group__0__Impl : ( 'Verifying' ) ;
    public final void rule__Trace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:820:1: ( ( 'Verifying' ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:821:1: ( 'Verifying' )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:821:1: ( 'Verifying' )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:822:1: 'Verifying'
            {
             before(grammarAccess.getTraceAccess().getVerifyingKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Trace__Group__0__Impl1690); 
             after(grammarAccess.getTraceAccess().getVerifyingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__0__Impl"


    // $ANTLR start "rule__Trace__Group__1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:835:1: rule__Trace__Group__1 : rule__Trace__Group__1__Impl rule__Trace__Group__2 ;
    public final void rule__Trace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:839:1: ( rule__Trace__Group__1__Impl rule__Trace__Group__2 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:840:2: rule__Trace__Group__1__Impl rule__Trace__Group__2
            {
            pushFollow(FOLLOW_rule__Trace__Group__1__Impl_in_rule__Trace__Group__11721);
            rule__Trace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__2_in_rule__Trace__Group__11724);
            rule__Trace__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__1"


    // $ANTLR start "rule__Trace__Group__1__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:847:1: rule__Trace__Group__1__Impl : ( ( rule__Trace__Alternatives_1 ) ) ;
    public final void rule__Trace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:851:1: ( ( ( rule__Trace__Alternatives_1 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:852:1: ( ( rule__Trace__Alternatives_1 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:852:1: ( ( rule__Trace__Alternatives_1 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:853:1: ( rule__Trace__Alternatives_1 )
            {
             before(grammarAccess.getTraceAccess().getAlternatives_1()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:854:1: ( rule__Trace__Alternatives_1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:854:2: rule__Trace__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Trace__Alternatives_1_in_rule__Trace__Group__1__Impl1751);
            rule__Trace__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__1__Impl"


    // $ANTLR start "rule__Trace__Group__2"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:864:1: rule__Trace__Group__2 : rule__Trace__Group__2__Impl rule__Trace__Group__3 ;
    public final void rule__Trace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:868:1: ( rule__Trace__Group__2__Impl rule__Trace__Group__3 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:869:2: rule__Trace__Group__2__Impl rule__Trace__Group__3
            {
            pushFollow(FOLLOW_rule__Trace__Group__2__Impl_in_rule__Trace__Group__21781);
            rule__Trace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__3_in_rule__Trace__Group__21784);
            rule__Trace__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__2"


    // $ANTLR start "rule__Trace__Group__2__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:876:1: rule__Trace__Group__2__Impl : ( ( rule__Trace__PropertyAssignment_2 ) ) ;
    public final void rule__Trace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:880:1: ( ( ( rule__Trace__PropertyAssignment_2 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:881:1: ( ( rule__Trace__PropertyAssignment_2 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:881:1: ( ( rule__Trace__PropertyAssignment_2 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:882:1: ( rule__Trace__PropertyAssignment_2 )
            {
             before(grammarAccess.getTraceAccess().getPropertyAssignment_2()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:883:1: ( rule__Trace__PropertyAssignment_2 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:883:2: rule__Trace__PropertyAssignment_2
            {
            pushFollow(FOLLOW_rule__Trace__PropertyAssignment_2_in_rule__Trace__Group__2__Impl1811);
            rule__Trace__PropertyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getPropertyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__2__Impl"


    // $ANTLR start "rule__Trace__Group__3"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:893:1: rule__Trace__Group__3 : rule__Trace__Group__3__Impl rule__Trace__Group__4 ;
    public final void rule__Trace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:897:1: ( rule__Trace__Group__3__Impl rule__Trace__Group__4 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:898:2: rule__Trace__Group__3__Impl rule__Trace__Group__4
            {
            pushFollow(FOLLOW_rule__Trace__Group__3__Impl_in_rule__Trace__Group__31841);
            rule__Trace__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__4_in_rule__Trace__Group__31844);
            rule__Trace__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__3"


    // $ANTLR start "rule__Trace__Group__3__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:905:1: rule__Trace__Group__3__Impl : ( 'at line' ) ;
    public final void rule__Trace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:909:1: ( ( 'at line' ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:910:1: ( 'at line' )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:910:1: ( 'at line' )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:911:1: 'at line'
            {
             before(grammarAccess.getTraceAccess().getAtLineKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__Trace__Group__3__Impl1872); 
             after(grammarAccess.getTraceAccess().getAtLineKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__3__Impl"


    // $ANTLR start "rule__Trace__Group__4"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:924:1: rule__Trace__Group__4 : rule__Trace__Group__4__Impl rule__Trace__Group__5 ;
    public final void rule__Trace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:928:1: ( rule__Trace__Group__4__Impl rule__Trace__Group__5 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:929:2: rule__Trace__Group__4__Impl rule__Trace__Group__5
            {
            pushFollow(FOLLOW_rule__Trace__Group__4__Impl_in_rule__Trace__Group__41903);
            rule__Trace__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__5_in_rule__Trace__Group__41906);
            rule__Trace__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__4"


    // $ANTLR start "rule__Trace__Group__4__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:936:1: rule__Trace__Group__4__Impl : ( ( rule__Trace__LineAssignment_4 ) ) ;
    public final void rule__Trace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:940:1: ( ( ( rule__Trace__LineAssignment_4 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:941:1: ( ( rule__Trace__LineAssignment_4 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:941:1: ( ( rule__Trace__LineAssignment_4 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:942:1: ( rule__Trace__LineAssignment_4 )
            {
             before(grammarAccess.getTraceAccess().getLineAssignment_4()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:943:1: ( rule__Trace__LineAssignment_4 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:943:2: rule__Trace__LineAssignment_4
            {
            pushFollow(FOLLOW_rule__Trace__LineAssignment_4_in_rule__Trace__Group__4__Impl1933);
            rule__Trace__LineAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getLineAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__4__Impl"


    // $ANTLR start "rule__Trace__Group__5"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:953:1: rule__Trace__Group__5 : rule__Trace__Group__5__Impl rule__Trace__Group__6 ;
    public final void rule__Trace__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:957:1: ( rule__Trace__Group__5__Impl rule__Trace__Group__6 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:958:2: rule__Trace__Group__5__Impl rule__Trace__Group__6
            {
            pushFollow(FOLLOW_rule__Trace__Group__5__Impl_in_rule__Trace__Group__51963);
            rule__Trace__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group__6_in_rule__Trace__Group__51966);
            rule__Trace__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__5"


    // $ANTLR start "rule__Trace__Group__5__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:965:1: rule__Trace__Group__5__Impl : ( ( rule__Trace__ResultAssignment_5 ) ) ;
    public final void rule__Trace__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:969:1: ( ( ( rule__Trace__ResultAssignment_5 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:970:1: ( ( rule__Trace__ResultAssignment_5 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:970:1: ( ( rule__Trace__ResultAssignment_5 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:971:1: ( rule__Trace__ResultAssignment_5 )
            {
             before(grammarAccess.getTraceAccess().getResultAssignment_5()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:972:1: ( rule__Trace__ResultAssignment_5 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:972:2: rule__Trace__ResultAssignment_5
            {
            pushFollow(FOLLOW_rule__Trace__ResultAssignment_5_in_rule__Trace__Group__5__Impl1993);
            rule__Trace__ResultAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getResultAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__5__Impl"


    // $ANTLR start "rule__Trace__Group__6"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:982:1: rule__Trace__Group__6 : rule__Trace__Group__6__Impl ;
    public final void rule__Trace__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:986:1: ( rule__Trace__Group__6__Impl )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:987:2: rule__Trace__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Trace__Group__6__Impl_in_rule__Trace__Group__62023);
            rule__Trace__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__6"


    // $ANTLR start "rule__Trace__Group__6__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:993:1: rule__Trace__Group__6__Impl : ( ( rule__Trace__Group_6__0 )? ) ;
    public final void rule__Trace__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:997:1: ( ( ( rule__Trace__Group_6__0 )? ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:998:1: ( ( rule__Trace__Group_6__0 )? )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:998:1: ( ( rule__Trace__Group_6__0 )? )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:999:1: ( rule__Trace__Group_6__0 )?
            {
             before(grammarAccess.getTraceAccess().getGroup_6()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1000:1: ( rule__Trace__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=16 && LA10_0<=17)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1000:2: rule__Trace__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Trace__Group_6__0_in_rule__Trace__Group__6__Impl2050);
                    rule__Trace__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTraceAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group__6__Impl"


    // $ANTLR start "rule__Trace__Group_6__0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1024:1: rule__Trace__Group_6__0 : rule__Trace__Group_6__0__Impl rule__Trace__Group_6__1 ;
    public final void rule__Trace__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1028:1: ( rule__Trace__Group_6__0__Impl rule__Trace__Group_6__1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1029:2: rule__Trace__Group_6__0__Impl rule__Trace__Group_6__1
            {
            pushFollow(FOLLOW_rule__Trace__Group_6__0__Impl_in_rule__Trace__Group_6__02095);
            rule__Trace__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Trace__Group_6__1_in_rule__Trace__Group_6__02098);
            rule__Trace__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group_6__0"


    // $ANTLR start "rule__Trace__Group_6__0__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1036:1: rule__Trace__Group_6__0__Impl : ( ( rule__Trace__Alternatives_6_0 ) ) ;
    public final void rule__Trace__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1040:1: ( ( ( rule__Trace__Alternatives_6_0 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1041:1: ( ( rule__Trace__Alternatives_6_0 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1041:1: ( ( rule__Trace__Alternatives_6_0 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1042:1: ( rule__Trace__Alternatives_6_0 )
            {
             before(grammarAccess.getTraceAccess().getAlternatives_6_0()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1043:1: ( rule__Trace__Alternatives_6_0 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1043:2: rule__Trace__Alternatives_6_0
            {
            pushFollow(FOLLOW_rule__Trace__Alternatives_6_0_in_rule__Trace__Group_6__0__Impl2125);
            rule__Trace__Alternatives_6_0();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getAlternatives_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group_6__0__Impl"


    // $ANTLR start "rule__Trace__Group_6__1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1053:1: rule__Trace__Group_6__1 : rule__Trace__Group_6__1__Impl ;
    public final void rule__Trace__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1057:1: ( rule__Trace__Group_6__1__Impl )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1058:2: rule__Trace__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Trace__Group_6__1__Impl_in_rule__Trace__Group_6__12155);
            rule__Trace__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__Group_6__1"


    // $ANTLR start "rule__Trace__Group_6__1__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1064:1: rule__Trace__Group_6__1__Impl : ( ( ( rule__Trace__TraceItemsAssignment_6_1 ) ) ( ( rule__Trace__TraceItemsAssignment_6_1 )* ) ) ;
    public final void rule__Trace__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1068:1: ( ( ( ( rule__Trace__TraceItemsAssignment_6_1 ) ) ( ( rule__Trace__TraceItemsAssignment_6_1 )* ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1069:1: ( ( ( rule__Trace__TraceItemsAssignment_6_1 ) ) ( ( rule__Trace__TraceItemsAssignment_6_1 )* ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1069:1: ( ( ( rule__Trace__TraceItemsAssignment_6_1 ) ) ( ( rule__Trace__TraceItemsAssignment_6_1 )* ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1070:1: ( ( rule__Trace__TraceItemsAssignment_6_1 ) ) ( ( rule__Trace__TraceItemsAssignment_6_1 )* )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1070:1: ( ( rule__Trace__TraceItemsAssignment_6_1 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1071:1: ( rule__Trace__TraceItemsAssignment_6_1 )
            {
             before(grammarAccess.getTraceAccess().getTraceItemsAssignment_6_1()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1072:1: ( rule__Trace__TraceItemsAssignment_6_1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1072:2: rule__Trace__TraceItemsAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Trace__TraceItemsAssignment_6_1_in_rule__Trace__Group_6__1__Impl2184);
            rule__Trace__TraceItemsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTraceAccess().getTraceItemsAssignment_6_1()); 

            }

            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1075:1: ( ( rule__Trace__TraceItemsAssignment_6_1 )* )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1076:1: ( rule__Trace__TraceItemsAssignment_6_1 )*
            {
             before(grammarAccess.getTraceAccess().getTraceItemsAssignment_6_1()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1077:1: ( rule__Trace__TraceItemsAssignment_6_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==37||(LA11_0>=40 && LA11_0<=41)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1077:2: rule__Trace__TraceItemsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_rule__Trace__TraceItemsAssignment_6_1_in_rule__Trace__Group_6__1__Impl2196);
            	    rule__Trace__TraceItemsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTraceAccess().getTraceItemsAssignment_6_1()); 

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
    // $ANTLR end "rule__Trace__Group_6__1__Impl"


    // $ANTLR start "rule__ProcessIdentifier__Group__0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1092:1: rule__ProcessIdentifier__Group__0 : rule__ProcessIdentifier__Group__0__Impl rule__ProcessIdentifier__Group__1 ;
    public final void rule__ProcessIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1096:1: ( rule__ProcessIdentifier__Group__0__Impl rule__ProcessIdentifier__Group__1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1097:2: rule__ProcessIdentifier__Group__0__Impl rule__ProcessIdentifier__Group__1
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__Group__0__Impl_in_rule__ProcessIdentifier__Group__02233);
            rule__ProcessIdentifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcessIdentifier__Group__1_in_rule__ProcessIdentifier__Group__02236);
            rule__ProcessIdentifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessIdentifier__Group__0"


    // $ANTLR start "rule__ProcessIdentifier__Group__0__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1104:1: rule__ProcessIdentifier__Group__0__Impl : ( ( rule__ProcessIdentifier__TemplateAssignment_0 ) ) ;
    public final void rule__ProcessIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1108:1: ( ( ( rule__ProcessIdentifier__TemplateAssignment_0 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1109:1: ( ( rule__ProcessIdentifier__TemplateAssignment_0 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1109:1: ( ( rule__ProcessIdentifier__TemplateAssignment_0 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1110:1: ( rule__ProcessIdentifier__TemplateAssignment_0 )
            {
             before(grammarAccess.getProcessIdentifierAccess().getTemplateAssignment_0()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1111:1: ( rule__ProcessIdentifier__TemplateAssignment_0 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1111:2: rule__ProcessIdentifier__TemplateAssignment_0
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__TemplateAssignment_0_in_rule__ProcessIdentifier__Group__0__Impl2263);
            rule__ProcessIdentifier__TemplateAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getProcessIdentifierAccess().getTemplateAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessIdentifier__Group__0__Impl"


    // $ANTLR start "rule__ProcessIdentifier__Group__1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1121:1: rule__ProcessIdentifier__Group__1 : rule__ProcessIdentifier__Group__1__Impl ;
    public final void rule__ProcessIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1125:1: ( rule__ProcessIdentifier__Group__1__Impl )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1126:2: rule__ProcessIdentifier__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__Group__1__Impl_in_rule__ProcessIdentifier__Group__12293);
            rule__ProcessIdentifier__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessIdentifier__Group__1"


    // $ANTLR start "rule__ProcessIdentifier__Group__1__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1132:1: rule__ProcessIdentifier__Group__1__Impl : ( ( rule__ProcessIdentifier__Group_1__0 )? ) ;
    public final void rule__ProcessIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1136:1: ( ( ( rule__ProcessIdentifier__Group_1__0 )? ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1137:1: ( ( rule__ProcessIdentifier__Group_1__0 )? )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1137:1: ( ( rule__ProcessIdentifier__Group_1__0 )? )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1138:1: ( rule__ProcessIdentifier__Group_1__0 )?
            {
             before(grammarAccess.getProcessIdentifierAccess().getGroup_1()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1139:1: ( rule__ProcessIdentifier__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1139:2: rule__ProcessIdentifier__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1__0_in_rule__ProcessIdentifier__Group__1__Impl2320);
                    rule__ProcessIdentifier__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessIdentifierAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessIdentifier__Group__1__Impl"


    // $ANTLR start "rule__ProcessIdentifier__Group_1__0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1153:1: rule__ProcessIdentifier__Group_1__0 : rule__ProcessIdentifier__Group_1__0__Impl rule__ProcessIdentifier__Group_1__1 ;
    public final void rule__ProcessIdentifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1157:1: ( rule__ProcessIdentifier__Group_1__0__Impl rule__ProcessIdentifier__Group_1__1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1158:2: rule__ProcessIdentifier__Group_1__0__Impl rule__ProcessIdentifier__Group_1__1
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1__0__Impl_in_rule__ProcessIdentifier__Group_1__02355);
            rule__ProcessIdentifier__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1__1_in_rule__ProcessIdentifier__Group_1__02358);
            rule__ProcessIdentifier__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessIdentifier__Group_1__0"


    // $ANTLR start "rule__ProcessIdentifier__Group_1__0__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1165:1: rule__ProcessIdentifier__Group_1__0__Impl : ( '(' ) ;
    public final void rule__ProcessIdentifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1169:1: ( ( '(' ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1170:1: ( '(' )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1170:1: ( '(' )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1171:1: '('
            {
             before(grammarAccess.getProcessIdentifierAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__ProcessIdentifier__Group_1__0__Impl2386); 
             after(grammarAccess.getProcessIdentifierAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessIdentifier__Group_1__0__Impl"


    // $ANTLR start "rule__ProcessIdentifier__Group_1__1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1184:1: rule__ProcessIdentifier__Group_1__1 : rule__ProcessIdentifier__Group_1__1__Impl rule__ProcessIdentifier__Group_1__2 ;
    public final void rule__ProcessIdentifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1188:1: ( rule__ProcessIdentifier__Group_1__1__Impl rule__ProcessIdentifier__Group_1__2 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1189:2: rule__ProcessIdentifier__Group_1__1__Impl rule__ProcessIdentifier__Group_1__2
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1__1__Impl_in_rule__ProcessIdentifier__Group_1__12417);
            rule__ProcessIdentifier__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1__2_in_rule__ProcessIdentifier__Group_1__12420);
            rule__ProcessIdentifier__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessIdentifier__Group_1__1"


    // $ANTLR start "rule__ProcessIdentifier__Group_1__1__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1196:1: rule__ProcessIdentifier__Group_1__1__Impl : ( ( rule__ProcessIdentifier__ArgumentsAssignment_1_1 ) ) ;
    public final void rule__ProcessIdentifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1200:1: ( ( ( rule__ProcessIdentifier__ArgumentsAssignment_1_1 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1201:1: ( ( rule__ProcessIdentifier__ArgumentsAssignment_1_1 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1201:1: ( ( rule__ProcessIdentifier__ArgumentsAssignment_1_1 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1202:1: ( rule__ProcessIdentifier__ArgumentsAssignment_1_1 )
            {
             before(grammarAccess.getProcessIdentifierAccess().getArgumentsAssignment_1_1()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1203:1: ( rule__ProcessIdentifier__ArgumentsAssignment_1_1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1203:2: rule__ProcessIdentifier__ArgumentsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__ArgumentsAssignment_1_1_in_rule__ProcessIdentifier__Group_1__1__Impl2447);
            rule__ProcessIdentifier__ArgumentsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessIdentifierAccess().getArgumentsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessIdentifier__Group_1__1__Impl"


    // $ANTLR start "rule__ProcessIdentifier__Group_1__2"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1213:1: rule__ProcessIdentifier__Group_1__2 : rule__ProcessIdentifier__Group_1__2__Impl rule__ProcessIdentifier__Group_1__3 ;
    public final void rule__ProcessIdentifier__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1217:1: ( rule__ProcessIdentifier__Group_1__2__Impl rule__ProcessIdentifier__Group_1__3 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1218:2: rule__ProcessIdentifier__Group_1__2__Impl rule__ProcessIdentifier__Group_1__3
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1__2__Impl_in_rule__ProcessIdentifier__Group_1__22477);
            rule__ProcessIdentifier__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1__3_in_rule__ProcessIdentifier__Group_1__22480);
            rule__ProcessIdentifier__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessIdentifier__Group_1__2"


    // $ANTLR start "rule__ProcessIdentifier__Group_1__2__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1225:1: rule__ProcessIdentifier__Group_1__2__Impl : ( ( rule__ProcessIdentifier__Group_1_2__0 )* ) ;
    public final void rule__ProcessIdentifier__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1229:1: ( ( ( rule__ProcessIdentifier__Group_1_2__0 )* ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1230:1: ( ( rule__ProcessIdentifier__Group_1_2__0 )* )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1230:1: ( ( rule__ProcessIdentifier__Group_1_2__0 )* )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1231:1: ( rule__ProcessIdentifier__Group_1_2__0 )*
            {
             before(grammarAccess.getProcessIdentifierAccess().getGroup_1_2()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1232:1: ( rule__ProcessIdentifier__Group_1_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==32) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1232:2: rule__ProcessIdentifier__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1_2__0_in_rule__ProcessIdentifier__Group_1__2__Impl2507);
            	    rule__ProcessIdentifier__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getProcessIdentifierAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessIdentifier__Group_1__2__Impl"


    // $ANTLR start "rule__ProcessIdentifier__Group_1__3"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1242:1: rule__ProcessIdentifier__Group_1__3 : rule__ProcessIdentifier__Group_1__3__Impl ;
    public final void rule__ProcessIdentifier__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1246:1: ( rule__ProcessIdentifier__Group_1__3__Impl )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1247:2: rule__ProcessIdentifier__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1__3__Impl_in_rule__ProcessIdentifier__Group_1__32538);
            rule__ProcessIdentifier__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessIdentifier__Group_1__3"


    // $ANTLR start "rule__ProcessIdentifier__Group_1__3__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1253:1: rule__ProcessIdentifier__Group_1__3__Impl : ( ')' ) ;
    public final void rule__ProcessIdentifier__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1257:1: ( ( ')' ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1258:1: ( ')' )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1258:1: ( ')' )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1259:1: ')'
            {
             before(grammarAccess.getProcessIdentifierAccess().getRightParenthesisKeyword_1_3()); 
            match(input,31,FOLLOW_31_in_rule__ProcessIdentifier__Group_1__3__Impl2566); 
             after(grammarAccess.getProcessIdentifierAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessIdentifier__Group_1__3__Impl"


    // $ANTLR start "rule__ProcessIdentifier__Group_1_2__0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1280:1: rule__ProcessIdentifier__Group_1_2__0 : rule__ProcessIdentifier__Group_1_2__0__Impl rule__ProcessIdentifier__Group_1_2__1 ;
    public final void rule__ProcessIdentifier__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1284:1: ( rule__ProcessIdentifier__Group_1_2__0__Impl rule__ProcessIdentifier__Group_1_2__1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1285:2: rule__ProcessIdentifier__Group_1_2__0__Impl rule__ProcessIdentifier__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1_2__0__Impl_in_rule__ProcessIdentifier__Group_1_2__02605);
            rule__ProcessIdentifier__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1_2__1_in_rule__ProcessIdentifier__Group_1_2__02608);
            rule__ProcessIdentifier__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessIdentifier__Group_1_2__0"


    // $ANTLR start "rule__ProcessIdentifier__Group_1_2__0__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1292:1: rule__ProcessIdentifier__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__ProcessIdentifier__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1296:1: ( ( ',' ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1297:1: ( ',' )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1297:1: ( ',' )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1298:1: ','
            {
             before(grammarAccess.getProcessIdentifierAccess().getCommaKeyword_1_2_0()); 
            match(input,32,FOLLOW_32_in_rule__ProcessIdentifier__Group_1_2__0__Impl2636); 
             after(grammarAccess.getProcessIdentifierAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessIdentifier__Group_1_2__0__Impl"


    // $ANTLR start "rule__ProcessIdentifier__Group_1_2__1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1311:1: rule__ProcessIdentifier__Group_1_2__1 : rule__ProcessIdentifier__Group_1_2__1__Impl ;
    public final void rule__ProcessIdentifier__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1315:1: ( rule__ProcessIdentifier__Group_1_2__1__Impl )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1316:2: rule__ProcessIdentifier__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__Group_1_2__1__Impl_in_rule__ProcessIdentifier__Group_1_2__12667);
            rule__ProcessIdentifier__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessIdentifier__Group_1_2__1"


    // $ANTLR start "rule__ProcessIdentifier__Group_1_2__1__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1322:1: rule__ProcessIdentifier__Group_1_2__1__Impl : ( ( rule__ProcessIdentifier__ArgumentsAssignment_1_2_1 ) ) ;
    public final void rule__ProcessIdentifier__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1326:1: ( ( ( rule__ProcessIdentifier__ArgumentsAssignment_1_2_1 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1327:1: ( ( rule__ProcessIdentifier__ArgumentsAssignment_1_2_1 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1327:1: ( ( rule__ProcessIdentifier__ArgumentsAssignment_1_2_1 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1328:1: ( rule__ProcessIdentifier__ArgumentsAssignment_1_2_1 )
            {
             before(grammarAccess.getProcessIdentifierAccess().getArgumentsAssignment_1_2_1()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1329:1: ( rule__ProcessIdentifier__ArgumentsAssignment_1_2_1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1329:2: rule__ProcessIdentifier__ArgumentsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__ProcessIdentifier__ArgumentsAssignment_1_2_1_in_rule__ProcessIdentifier__Group_1_2__1__Impl2694);
            rule__ProcessIdentifier__ArgumentsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getProcessIdentifierAccess().getArgumentsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessIdentifier__Group_1_2__1__Impl"


    // $ANTLR start "rule__LocationActivity__Group__0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1343:1: rule__LocationActivity__Group__0 : rule__LocationActivity__Group__0__Impl rule__LocationActivity__Group__1 ;
    public final void rule__LocationActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1347:1: ( rule__LocationActivity__Group__0__Impl rule__LocationActivity__Group__1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1348:2: rule__LocationActivity__Group__0__Impl rule__LocationActivity__Group__1
            {
            pushFollow(FOLLOW_rule__LocationActivity__Group__0__Impl_in_rule__LocationActivity__Group__02728);
            rule__LocationActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocationActivity__Group__1_in_rule__LocationActivity__Group__02731);
            rule__LocationActivity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationActivity__Group__0"


    // $ANTLR start "rule__LocationActivity__Group__0__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1355:1: rule__LocationActivity__Group__0__Impl : ( ( rule__LocationActivity__ProcessAssignment_0 ) ) ;
    public final void rule__LocationActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1359:1: ( ( ( rule__LocationActivity__ProcessAssignment_0 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1360:1: ( ( rule__LocationActivity__ProcessAssignment_0 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1360:1: ( ( rule__LocationActivity__ProcessAssignment_0 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1361:1: ( rule__LocationActivity__ProcessAssignment_0 )
            {
             before(grammarAccess.getLocationActivityAccess().getProcessAssignment_0()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1362:1: ( rule__LocationActivity__ProcessAssignment_0 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1362:2: rule__LocationActivity__ProcessAssignment_0
            {
            pushFollow(FOLLOW_rule__LocationActivity__ProcessAssignment_0_in_rule__LocationActivity__Group__0__Impl2758);
            rule__LocationActivity__ProcessAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLocationActivityAccess().getProcessAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationActivity__Group__0__Impl"


    // $ANTLR start "rule__LocationActivity__Group__1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1372:1: rule__LocationActivity__Group__1 : rule__LocationActivity__Group__1__Impl rule__LocationActivity__Group__2 ;
    public final void rule__LocationActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1376:1: ( rule__LocationActivity__Group__1__Impl rule__LocationActivity__Group__2 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1377:2: rule__LocationActivity__Group__1__Impl rule__LocationActivity__Group__2
            {
            pushFollow(FOLLOW_rule__LocationActivity__Group__1__Impl_in_rule__LocationActivity__Group__12788);
            rule__LocationActivity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LocationActivity__Group__2_in_rule__LocationActivity__Group__12791);
            rule__LocationActivity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationActivity__Group__1"


    // $ANTLR start "rule__LocationActivity__Group__1__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1384:1: rule__LocationActivity__Group__1__Impl : ( '.' ) ;
    public final void rule__LocationActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1388:1: ( ( '.' ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1389:1: ( '.' )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1389:1: ( '.' )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1390:1: '.'
            {
             before(grammarAccess.getLocationActivityAccess().getFullStopKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__LocationActivity__Group__1__Impl2819); 
             after(grammarAccess.getLocationActivityAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationActivity__Group__1__Impl"


    // $ANTLR start "rule__LocationActivity__Group__2"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1403:1: rule__LocationActivity__Group__2 : rule__LocationActivity__Group__2__Impl ;
    public final void rule__LocationActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1407:1: ( rule__LocationActivity__Group__2__Impl )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1408:2: rule__LocationActivity__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LocationActivity__Group__2__Impl_in_rule__LocationActivity__Group__22850);
            rule__LocationActivity__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationActivity__Group__2"


    // $ANTLR start "rule__LocationActivity__Group__2__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1414:1: rule__LocationActivity__Group__2__Impl : ( ( rule__LocationActivity__LocationAssignment_2 ) ) ;
    public final void rule__LocationActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1418:1: ( ( ( rule__LocationActivity__LocationAssignment_2 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1419:1: ( ( rule__LocationActivity__LocationAssignment_2 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1419:1: ( ( rule__LocationActivity__LocationAssignment_2 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1420:1: ( rule__LocationActivity__LocationAssignment_2 )
            {
             before(grammarAccess.getLocationActivityAccess().getLocationAssignment_2()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1421:1: ( rule__LocationActivity__LocationAssignment_2 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1421:2: rule__LocationActivity__LocationAssignment_2
            {
            pushFollow(FOLLOW_rule__LocationActivity__LocationAssignment_2_in_rule__LocationActivity__Group__2__Impl2877);
            rule__LocationActivity__LocationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLocationActivityAccess().getLocationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationActivity__Group__2__Impl"


    // $ANTLR start "rule__VariableValue__Group__0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1437:1: rule__VariableValue__Group__0 : rule__VariableValue__Group__0__Impl rule__VariableValue__Group__1 ;
    public final void rule__VariableValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1441:1: ( rule__VariableValue__Group__0__Impl rule__VariableValue__Group__1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1442:2: rule__VariableValue__Group__0__Impl rule__VariableValue__Group__1
            {
            pushFollow(FOLLOW_rule__VariableValue__Group__0__Impl_in_rule__VariableValue__Group__02913);
            rule__VariableValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableValue__Group__1_in_rule__VariableValue__Group__02916);
            rule__VariableValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableValue__Group__0"


    // $ANTLR start "rule__VariableValue__Group__0__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1449:1: rule__VariableValue__Group__0__Impl : ( ( rule__VariableValue__FirstNamedElementReferenceAssignment_0 ) ) ;
    public final void rule__VariableValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1453:1: ( ( ( rule__VariableValue__FirstNamedElementReferenceAssignment_0 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1454:1: ( ( rule__VariableValue__FirstNamedElementReferenceAssignment_0 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1454:1: ( ( rule__VariableValue__FirstNamedElementReferenceAssignment_0 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1455:1: ( rule__VariableValue__FirstNamedElementReferenceAssignment_0 )
            {
             before(grammarAccess.getVariableValueAccess().getFirstNamedElementReferenceAssignment_0()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1456:1: ( rule__VariableValue__FirstNamedElementReferenceAssignment_0 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1456:2: rule__VariableValue__FirstNamedElementReferenceAssignment_0
            {
            pushFollow(FOLLOW_rule__VariableValue__FirstNamedElementReferenceAssignment_0_in_rule__VariableValue__Group__0__Impl2943);
            rule__VariableValue__FirstNamedElementReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableValueAccess().getFirstNamedElementReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableValue__Group__0__Impl"


    // $ANTLR start "rule__VariableValue__Group__1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1466:1: rule__VariableValue__Group__1 : rule__VariableValue__Group__1__Impl rule__VariableValue__Group__2 ;
    public final void rule__VariableValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1470:1: ( rule__VariableValue__Group__1__Impl rule__VariableValue__Group__2 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1471:2: rule__VariableValue__Group__1__Impl rule__VariableValue__Group__2
            {
            pushFollow(FOLLOW_rule__VariableValue__Group__1__Impl_in_rule__VariableValue__Group__12973);
            rule__VariableValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableValue__Group__2_in_rule__VariableValue__Group__12976);
            rule__VariableValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableValue__Group__1"


    // $ANTLR start "rule__VariableValue__Group__1__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1478:1: rule__VariableValue__Group__1__Impl : ( ( rule__VariableValue__Group_1__0 )? ) ;
    public final void rule__VariableValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1482:1: ( ( ( rule__VariableValue__Group_1__0 )? ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1483:1: ( ( rule__VariableValue__Group_1__0 )? )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1483:1: ( ( rule__VariableValue__Group_1__0 )? )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1484:1: ( rule__VariableValue__Group_1__0 )?
            {
             before(grammarAccess.getVariableValueAccess().getGroup_1()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1485:1: ( rule__VariableValue__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1485:2: rule__VariableValue__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__VariableValue__Group_1__0_in_rule__VariableValue__Group__1__Impl3003);
                    rule__VariableValue__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableValueAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableValue__Group__1__Impl"


    // $ANTLR start "rule__VariableValue__Group__2"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1495:1: rule__VariableValue__Group__2 : rule__VariableValue__Group__2__Impl rule__VariableValue__Group__3 ;
    public final void rule__VariableValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1499:1: ( rule__VariableValue__Group__2__Impl rule__VariableValue__Group__3 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1500:2: rule__VariableValue__Group__2__Impl rule__VariableValue__Group__3
            {
            pushFollow(FOLLOW_rule__VariableValue__Group__2__Impl_in_rule__VariableValue__Group__23034);
            rule__VariableValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableValue__Group__3_in_rule__VariableValue__Group__23037);
            rule__VariableValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableValue__Group__2"


    // $ANTLR start "rule__VariableValue__Group__2__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1507:1: rule__VariableValue__Group__2__Impl : ( ( rule__VariableValue__OperatorAssignment_2 ) ) ;
    public final void rule__VariableValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1511:1: ( ( ( rule__VariableValue__OperatorAssignment_2 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1512:1: ( ( rule__VariableValue__OperatorAssignment_2 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1512:1: ( ( rule__VariableValue__OperatorAssignment_2 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1513:1: ( rule__VariableValue__OperatorAssignment_2 )
            {
             before(grammarAccess.getVariableValueAccess().getOperatorAssignment_2()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1514:1: ( rule__VariableValue__OperatorAssignment_2 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1514:2: rule__VariableValue__OperatorAssignment_2
            {
            pushFollow(FOLLOW_rule__VariableValue__OperatorAssignment_2_in_rule__VariableValue__Group__2__Impl3064);
            rule__VariableValue__OperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableValueAccess().getOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableValue__Group__2__Impl"


    // $ANTLR start "rule__VariableValue__Group__3"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1524:1: rule__VariableValue__Group__3 : rule__VariableValue__Group__3__Impl ;
    public final void rule__VariableValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1528:1: ( rule__VariableValue__Group__3__Impl )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1529:2: rule__VariableValue__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VariableValue__Group__3__Impl_in_rule__VariableValue__Group__33094);
            rule__VariableValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableValue__Group__3"


    // $ANTLR start "rule__VariableValue__Group__3__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1535:1: rule__VariableValue__Group__3__Impl : ( ( rule__VariableValue__ValueAssignment_3 ) ) ;
    public final void rule__VariableValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1539:1: ( ( ( rule__VariableValue__ValueAssignment_3 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1540:1: ( ( rule__VariableValue__ValueAssignment_3 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1540:1: ( ( rule__VariableValue__ValueAssignment_3 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1541:1: ( rule__VariableValue__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableValueAccess().getValueAssignment_3()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1542:1: ( rule__VariableValue__ValueAssignment_3 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1542:2: rule__VariableValue__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__VariableValue__ValueAssignment_3_in_rule__VariableValue__Group__3__Impl3121);
            rule__VariableValue__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableValueAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableValue__Group__3__Impl"


    // $ANTLR start "rule__VariableValue__Group_1__0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1560:1: rule__VariableValue__Group_1__0 : rule__VariableValue__Group_1__0__Impl rule__VariableValue__Group_1__1 ;
    public final void rule__VariableValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1564:1: ( rule__VariableValue__Group_1__0__Impl rule__VariableValue__Group_1__1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1565:2: rule__VariableValue__Group_1__0__Impl rule__VariableValue__Group_1__1
            {
            pushFollow(FOLLOW_rule__VariableValue__Group_1__0__Impl_in_rule__VariableValue__Group_1__03159);
            rule__VariableValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableValue__Group_1__1_in_rule__VariableValue__Group_1__03162);
            rule__VariableValue__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableValue__Group_1__0"


    // $ANTLR start "rule__VariableValue__Group_1__0__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1572:1: rule__VariableValue__Group_1__0__Impl : ( '-' ) ;
    public final void rule__VariableValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1576:1: ( ( '-' ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1577:1: ( '-' )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1577:1: ( '-' )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1578:1: '-'
            {
             before(grammarAccess.getVariableValueAccess().getHyphenMinusKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__VariableValue__Group_1__0__Impl3190); 
             after(grammarAccess.getVariableValueAccess().getHyphenMinusKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableValue__Group_1__0__Impl"


    // $ANTLR start "rule__VariableValue__Group_1__1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1591:1: rule__VariableValue__Group_1__1 : rule__VariableValue__Group_1__1__Impl ;
    public final void rule__VariableValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1595:1: ( rule__VariableValue__Group_1__1__Impl )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1596:2: rule__VariableValue__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__VariableValue__Group_1__1__Impl_in_rule__VariableValue__Group_1__13221);
            rule__VariableValue__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableValue__Group_1__1"


    // $ANTLR start "rule__VariableValue__Group_1__1__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1602:1: rule__VariableValue__Group_1__1__Impl : ( ( rule__VariableValue__SecondNamedElementReferenceAssignment_1_1 ) ) ;
    public final void rule__VariableValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1606:1: ( ( ( rule__VariableValue__SecondNamedElementReferenceAssignment_1_1 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1607:1: ( ( rule__VariableValue__SecondNamedElementReferenceAssignment_1_1 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1607:1: ( ( rule__VariableValue__SecondNamedElementReferenceAssignment_1_1 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1608:1: ( rule__VariableValue__SecondNamedElementReferenceAssignment_1_1 )
            {
             before(grammarAccess.getVariableValueAccess().getSecondNamedElementReferenceAssignment_1_1()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1609:1: ( rule__VariableValue__SecondNamedElementReferenceAssignment_1_1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1609:2: rule__VariableValue__SecondNamedElementReferenceAssignment_1_1
            {
            pushFollow(FOLLOW_rule__VariableValue__SecondNamedElementReferenceAssignment_1_1_in_rule__VariableValue__Group_1__1__Impl3248);
            rule__VariableValue__SecondNamedElementReferenceAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableValueAccess().getSecondNamedElementReferenceAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableValue__Group_1__1__Impl"


    // $ANTLR start "rule__SingleNamedElementReference__Group__0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1623:1: rule__SingleNamedElementReference__Group__0 : rule__SingleNamedElementReference__Group__0__Impl rule__SingleNamedElementReference__Group__1 ;
    public final void rule__SingleNamedElementReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1627:1: ( rule__SingleNamedElementReference__Group__0__Impl rule__SingleNamedElementReference__Group__1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1628:2: rule__SingleNamedElementReference__Group__0__Impl rule__SingleNamedElementReference__Group__1
            {
            pushFollow(FOLLOW_rule__SingleNamedElementReference__Group__0__Impl_in_rule__SingleNamedElementReference__Group__03282);
            rule__SingleNamedElementReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleNamedElementReference__Group__1_in_rule__SingleNamedElementReference__Group__03285);
            rule__SingleNamedElementReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleNamedElementReference__Group__0"


    // $ANTLR start "rule__SingleNamedElementReference__Group__0__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1635:1: rule__SingleNamedElementReference__Group__0__Impl : ( ( rule__SingleNamedElementReference__NamedElementAssignment_0 ) ) ;
    public final void rule__SingleNamedElementReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1639:1: ( ( ( rule__SingleNamedElementReference__NamedElementAssignment_0 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1640:1: ( ( rule__SingleNamedElementReference__NamedElementAssignment_0 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1640:1: ( ( rule__SingleNamedElementReference__NamedElementAssignment_0 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1641:1: ( rule__SingleNamedElementReference__NamedElementAssignment_0 )
            {
             before(grammarAccess.getSingleNamedElementReferenceAccess().getNamedElementAssignment_0()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1642:1: ( rule__SingleNamedElementReference__NamedElementAssignment_0 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1642:2: rule__SingleNamedElementReference__NamedElementAssignment_0
            {
            pushFollow(FOLLOW_rule__SingleNamedElementReference__NamedElementAssignment_0_in_rule__SingleNamedElementReference__Group__0__Impl3312);
            rule__SingleNamedElementReference__NamedElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSingleNamedElementReferenceAccess().getNamedElementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleNamedElementReference__Group__0__Impl"


    // $ANTLR start "rule__SingleNamedElementReference__Group__1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1652:1: rule__SingleNamedElementReference__Group__1 : rule__SingleNamedElementReference__Group__1__Impl ;
    public final void rule__SingleNamedElementReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1656:1: ( rule__SingleNamedElementReference__Group__1__Impl )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1657:2: rule__SingleNamedElementReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SingleNamedElementReference__Group__1__Impl_in_rule__SingleNamedElementReference__Group__13342);
            rule__SingleNamedElementReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleNamedElementReference__Group__1"


    // $ANTLR start "rule__SingleNamedElementReference__Group__1__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1663:1: rule__SingleNamedElementReference__Group__1__Impl : ( ( rule__SingleNamedElementReference__Group_1__0 )* ) ;
    public final void rule__SingleNamedElementReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1667:1: ( ( ( rule__SingleNamedElementReference__Group_1__0 )* ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1668:1: ( ( rule__SingleNamedElementReference__Group_1__0 )* )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1668:1: ( ( rule__SingleNamedElementReference__Group_1__0 )* )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1669:1: ( rule__SingleNamedElementReference__Group_1__0 )*
            {
             before(grammarAccess.getSingleNamedElementReferenceAccess().getGroup_1()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1670:1: ( rule__SingleNamedElementReference__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==35) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1670:2: rule__SingleNamedElementReference__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SingleNamedElementReference__Group_1__0_in_rule__SingleNamedElementReference__Group__1__Impl3369);
            	    rule__SingleNamedElementReference__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSingleNamedElementReferenceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleNamedElementReference__Group__1__Impl"


    // $ANTLR start "rule__SingleNamedElementReference__Group_1__0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1684:1: rule__SingleNamedElementReference__Group_1__0 : rule__SingleNamedElementReference__Group_1__0__Impl rule__SingleNamedElementReference__Group_1__1 ;
    public final void rule__SingleNamedElementReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1688:1: ( rule__SingleNamedElementReference__Group_1__0__Impl rule__SingleNamedElementReference__Group_1__1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1689:2: rule__SingleNamedElementReference__Group_1__0__Impl rule__SingleNamedElementReference__Group_1__1
            {
            pushFollow(FOLLOW_rule__SingleNamedElementReference__Group_1__0__Impl_in_rule__SingleNamedElementReference__Group_1__03404);
            rule__SingleNamedElementReference__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleNamedElementReference__Group_1__1_in_rule__SingleNamedElementReference__Group_1__03407);
            rule__SingleNamedElementReference__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleNamedElementReference__Group_1__0"


    // $ANTLR start "rule__SingleNamedElementReference__Group_1__0__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1696:1: rule__SingleNamedElementReference__Group_1__0__Impl : ( '[' ) ;
    public final void rule__SingleNamedElementReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1700:1: ( ( '[' ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1701:1: ( '[' )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1701:1: ( '[' )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1702:1: '['
            {
             before(grammarAccess.getSingleNamedElementReferenceAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,35,FOLLOW_35_in_rule__SingleNamedElementReference__Group_1__0__Impl3435); 
             after(grammarAccess.getSingleNamedElementReferenceAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleNamedElementReference__Group_1__0__Impl"


    // $ANTLR start "rule__SingleNamedElementReference__Group_1__1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1715:1: rule__SingleNamedElementReference__Group_1__1 : rule__SingleNamedElementReference__Group_1__1__Impl rule__SingleNamedElementReference__Group_1__2 ;
    public final void rule__SingleNamedElementReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1719:1: ( rule__SingleNamedElementReference__Group_1__1__Impl rule__SingleNamedElementReference__Group_1__2 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1720:2: rule__SingleNamedElementReference__Group_1__1__Impl rule__SingleNamedElementReference__Group_1__2
            {
            pushFollow(FOLLOW_rule__SingleNamedElementReference__Group_1__1__Impl_in_rule__SingleNamedElementReference__Group_1__13466);
            rule__SingleNamedElementReference__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SingleNamedElementReference__Group_1__2_in_rule__SingleNamedElementReference__Group_1__13469);
            rule__SingleNamedElementReference__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleNamedElementReference__Group_1__1"


    // $ANTLR start "rule__SingleNamedElementReference__Group_1__1__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1727:1: rule__SingleNamedElementReference__Group_1__1__Impl : ( ( rule__SingleNamedElementReference__IndexesAssignment_1_1 ) ) ;
    public final void rule__SingleNamedElementReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1731:1: ( ( ( rule__SingleNamedElementReference__IndexesAssignment_1_1 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1732:1: ( ( rule__SingleNamedElementReference__IndexesAssignment_1_1 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1732:1: ( ( rule__SingleNamedElementReference__IndexesAssignment_1_1 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1733:1: ( rule__SingleNamedElementReference__IndexesAssignment_1_1 )
            {
             before(grammarAccess.getSingleNamedElementReferenceAccess().getIndexesAssignment_1_1()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1734:1: ( rule__SingleNamedElementReference__IndexesAssignment_1_1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1734:2: rule__SingleNamedElementReference__IndexesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SingleNamedElementReference__IndexesAssignment_1_1_in_rule__SingleNamedElementReference__Group_1__1__Impl3496);
            rule__SingleNamedElementReference__IndexesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleNamedElementReferenceAccess().getIndexesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleNamedElementReference__Group_1__1__Impl"


    // $ANTLR start "rule__SingleNamedElementReference__Group_1__2"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1744:1: rule__SingleNamedElementReference__Group_1__2 : rule__SingleNamedElementReference__Group_1__2__Impl ;
    public final void rule__SingleNamedElementReference__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1748:1: ( rule__SingleNamedElementReference__Group_1__2__Impl )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1749:2: rule__SingleNamedElementReference__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SingleNamedElementReference__Group_1__2__Impl_in_rule__SingleNamedElementReference__Group_1__23526);
            rule__SingleNamedElementReference__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleNamedElementReference__Group_1__2"


    // $ANTLR start "rule__SingleNamedElementReference__Group_1__2__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1755:1: rule__SingleNamedElementReference__Group_1__2__Impl : ( ']' ) ;
    public final void rule__SingleNamedElementReference__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1759:1: ( ( ']' ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1760:1: ( ']' )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1760:1: ( ']' )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1761:1: ']'
            {
             before(grammarAccess.getSingleNamedElementReferenceAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,36,FOLLOW_36_in_rule__SingleNamedElementReference__Group_1__2__Impl3554); 
             after(grammarAccess.getSingleNamedElementReferenceAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleNamedElementReference__Group_1__2__Impl"


    // $ANTLR start "rule__NamedElementReference__Group__0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1780:1: rule__NamedElementReference__Group__0 : rule__NamedElementReference__Group__0__Impl rule__NamedElementReference__Group__1 ;
    public final void rule__NamedElementReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1784:1: ( rule__NamedElementReference__Group__0__Impl rule__NamedElementReference__Group__1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1785:2: rule__NamedElementReference__Group__0__Impl rule__NamedElementReference__Group__1
            {
            pushFollow(FOLLOW_rule__NamedElementReference__Group__0__Impl_in_rule__NamedElementReference__Group__03591);
            rule__NamedElementReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedElementReference__Group__1_in_rule__NamedElementReference__Group__03594);
            rule__NamedElementReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedElementReference__Group__0"


    // $ANTLR start "rule__NamedElementReference__Group__0__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1792:1: rule__NamedElementReference__Group__0__Impl : ( ( rule__NamedElementReference__SingleNamedElementReferenceAssignment_0 ) ) ;
    public final void rule__NamedElementReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1796:1: ( ( ( rule__NamedElementReference__SingleNamedElementReferenceAssignment_0 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1797:1: ( ( rule__NamedElementReference__SingleNamedElementReferenceAssignment_0 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1797:1: ( ( rule__NamedElementReference__SingleNamedElementReferenceAssignment_0 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1798:1: ( rule__NamedElementReference__SingleNamedElementReferenceAssignment_0 )
            {
             before(grammarAccess.getNamedElementReferenceAccess().getSingleNamedElementReferenceAssignment_0()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1799:1: ( rule__NamedElementReference__SingleNamedElementReferenceAssignment_0 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1799:2: rule__NamedElementReference__SingleNamedElementReferenceAssignment_0
            {
            pushFollow(FOLLOW_rule__NamedElementReference__SingleNamedElementReferenceAssignment_0_in_rule__NamedElementReference__Group__0__Impl3621);
            rule__NamedElementReference__SingleNamedElementReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNamedElementReferenceAccess().getSingleNamedElementReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedElementReference__Group__0__Impl"


    // $ANTLR start "rule__NamedElementReference__Group__1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1809:1: rule__NamedElementReference__Group__1 : rule__NamedElementReference__Group__1__Impl ;
    public final void rule__NamedElementReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1813:1: ( rule__NamedElementReference__Group__1__Impl )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1814:2: rule__NamedElementReference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NamedElementReference__Group__1__Impl_in_rule__NamedElementReference__Group__13651);
            rule__NamedElementReference__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedElementReference__Group__1"


    // $ANTLR start "rule__NamedElementReference__Group__1__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1820:1: rule__NamedElementReference__Group__1__Impl : ( ( rule__NamedElementReference__Group_1__0 )? ) ;
    public final void rule__NamedElementReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1824:1: ( ( ( rule__NamedElementReference__Group_1__0 )? ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1825:1: ( ( rule__NamedElementReference__Group_1__0 )? )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1825:1: ( ( rule__NamedElementReference__Group_1__0 )? )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1826:1: ( rule__NamedElementReference__Group_1__0 )?
            {
             before(grammarAccess.getNamedElementReferenceAccess().getGroup_1()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1827:1: ( rule__NamedElementReference__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1827:2: rule__NamedElementReference__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NamedElementReference__Group_1__0_in_rule__NamedElementReference__Group__1__Impl3678);
                    rule__NamedElementReference__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamedElementReferenceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedElementReference__Group__1__Impl"


    // $ANTLR start "rule__NamedElementReference__Group_1__0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1841:1: rule__NamedElementReference__Group_1__0 : rule__NamedElementReference__Group_1__0__Impl rule__NamedElementReference__Group_1__1 ;
    public final void rule__NamedElementReference__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1845:1: ( rule__NamedElementReference__Group_1__0__Impl rule__NamedElementReference__Group_1__1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1846:2: rule__NamedElementReference__Group_1__0__Impl rule__NamedElementReference__Group_1__1
            {
            pushFollow(FOLLOW_rule__NamedElementReference__Group_1__0__Impl_in_rule__NamedElementReference__Group_1__03713);
            rule__NamedElementReference__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedElementReference__Group_1__1_in_rule__NamedElementReference__Group_1__03716);
            rule__NamedElementReference__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedElementReference__Group_1__0"


    // $ANTLR start "rule__NamedElementReference__Group_1__0__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1853:1: rule__NamedElementReference__Group_1__0__Impl : ( '.' ) ;
    public final void rule__NamedElementReference__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1857:1: ( ( '.' ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1858:1: ( '.' )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1858:1: ( '.' )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1859:1: '.'
            {
             before(grammarAccess.getNamedElementReferenceAccess().getFullStopKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__NamedElementReference__Group_1__0__Impl3744); 
             after(grammarAccess.getNamedElementReferenceAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedElementReference__Group_1__0__Impl"


    // $ANTLR start "rule__NamedElementReference__Group_1__1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1872:1: rule__NamedElementReference__Group_1__1 : rule__NamedElementReference__Group_1__1__Impl ;
    public final void rule__NamedElementReference__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1876:1: ( rule__NamedElementReference__Group_1__1__Impl )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1877:2: rule__NamedElementReference__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NamedElementReference__Group_1__1__Impl_in_rule__NamedElementReference__Group_1__13775);
            rule__NamedElementReference__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedElementReference__Group_1__1"


    // $ANTLR start "rule__NamedElementReference__Group_1__1__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1883:1: rule__NamedElementReference__Group_1__1__Impl : ( ( rule__NamedElementReference__NamedElementReferenceAssignment_1_1 ) ) ;
    public final void rule__NamedElementReference__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1887:1: ( ( ( rule__NamedElementReference__NamedElementReferenceAssignment_1_1 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1888:1: ( ( rule__NamedElementReference__NamedElementReferenceAssignment_1_1 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1888:1: ( ( rule__NamedElementReference__NamedElementReferenceAssignment_1_1 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1889:1: ( rule__NamedElementReference__NamedElementReferenceAssignment_1_1 )
            {
             before(grammarAccess.getNamedElementReferenceAccess().getNamedElementReferenceAssignment_1_1()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1890:1: ( rule__NamedElementReference__NamedElementReferenceAssignment_1_1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1890:2: rule__NamedElementReference__NamedElementReferenceAssignment_1_1
            {
            pushFollow(FOLLOW_rule__NamedElementReference__NamedElementReferenceAssignment_1_1_in_rule__NamedElementReference__Group_1__1__Impl3802);
            rule__NamedElementReference__NamedElementReferenceAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedElementReferenceAccess().getNamedElementReferenceAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedElementReference__Group_1__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1904:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1908:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1909:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__03836);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__03839);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1916:1: rule__State__Group__0__Impl : ( 'State' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1920:1: ( ( 'State' ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1921:1: ( 'State' )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1921:1: ( 'State' )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1922:1: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__State__Group__0__Impl3867); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1935:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1939:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1940:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13898);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__13901);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1947:1: rule__State__Group__1__Impl : ( ( ':' )? ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1951:1: ( ( ( ':' )? ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1952:1: ( ( ':' )? )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1952:1: ( ( ':' )? )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1953:1: ( ':' )?
            {
             before(grammarAccess.getStateAccess().getColonKeyword_1()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1954:1: ( ':' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1955:2: ':'
                    {
                    match(input,38,FOLLOW_38_in_rule__State__Group__1__Impl3930); 

                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1966:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1970:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1971:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23963);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__23966);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1978:1: rule__State__Group__2__Impl : ( '(' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1982:1: ( ( '(' ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1983:1: ( '(' )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1983:1: ( '(' )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1984:1: '('
            {
             before(grammarAccess.getStateAccess().getLeftParenthesisKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__State__Group__2__Impl3994); 
             after(grammarAccess.getStateAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:1997:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2001:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2002:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__34025);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__34028);
            rule__State__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2009:1: rule__State__Group__3__Impl : ( ( ( rule__State__LocationActivitiesAssignment_3 ) ) ( ( rule__State__LocationActivitiesAssignment_3 )* ) ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2013:1: ( ( ( ( rule__State__LocationActivitiesAssignment_3 ) ) ( ( rule__State__LocationActivitiesAssignment_3 )* ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2014:1: ( ( ( rule__State__LocationActivitiesAssignment_3 ) ) ( ( rule__State__LocationActivitiesAssignment_3 )* ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2014:1: ( ( ( rule__State__LocationActivitiesAssignment_3 ) ) ( ( rule__State__LocationActivitiesAssignment_3 )* ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2015:1: ( ( rule__State__LocationActivitiesAssignment_3 ) ) ( ( rule__State__LocationActivitiesAssignment_3 )* )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2015:1: ( ( rule__State__LocationActivitiesAssignment_3 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2016:1: ( rule__State__LocationActivitiesAssignment_3 )
            {
             before(grammarAccess.getStateAccess().getLocationActivitiesAssignment_3()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2017:1: ( rule__State__LocationActivitiesAssignment_3 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2017:2: rule__State__LocationActivitiesAssignment_3
            {
            pushFollow(FOLLOW_rule__State__LocationActivitiesAssignment_3_in_rule__State__Group__3__Impl4057);
            rule__State__LocationActivitiesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getLocationActivitiesAssignment_3()); 

            }

            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2020:1: ( ( rule__State__LocationActivitiesAssignment_3 )* )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2021:1: ( rule__State__LocationActivitiesAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getLocationActivitiesAssignment_3()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2022:1: ( rule__State__LocationActivitiesAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2022:2: rule__State__LocationActivitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__State__LocationActivitiesAssignment_3_in_rule__State__Group__3__Impl4069);
            	    rule__State__LocationActivitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getLocationActivitiesAssignment_3()); 

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
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2033:1: rule__State__Group__4 : rule__State__Group__4__Impl rule__State__Group__5 ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2037:1: ( rule__State__Group__4__Impl rule__State__Group__5 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2038:2: rule__State__Group__4__Impl rule__State__Group__5
            {
            pushFollow(FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__44102);
            rule__State__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__5_in_rule__State__Group__44105);
            rule__State__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2045:1: rule__State__Group__4__Impl : ( ')' ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2049:1: ( ( ')' ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2050:1: ( ')' )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2050:1: ( ')' )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2051:1: ')'
            {
             before(grammarAccess.getStateAccess().getRightParenthesisKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__State__Group__4__Impl4133); 
             after(grammarAccess.getStateAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__State__Group__5"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2064:1: rule__State__Group__5 : rule__State__Group__5__Impl ;
    public final void rule__State__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2068:1: ( rule__State__Group__5__Impl )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2069:2: rule__State__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__54164);
            rule__State__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5"


    // $ANTLR start "rule__State__Group__5__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2075:1: rule__State__Group__5__Impl : ( ( rule__State__Group_5__0 )? ) ;
    public final void rule__State__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2079:1: ( ( ( rule__State__Group_5__0 )? ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2080:1: ( ( rule__State__Group_5__0 )? )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2080:1: ( ( rule__State__Group_5__0 )? )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2081:1: ( rule__State__Group_5__0 )?
            {
             before(grammarAccess.getStateAccess().getGroup_5()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2082:1: ( rule__State__Group_5__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2082:2: rule__State__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__State__Group_5__0_in_rule__State__Group__5__Impl4191);
                    rule__State__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__5__Impl"


    // $ANTLR start "rule__State__Group_5__0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2104:1: rule__State__Group_5__0 : rule__State__Group_5__0__Impl rule__State__Group_5__1 ;
    public final void rule__State__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2108:1: ( rule__State__Group_5__0__Impl rule__State__Group_5__1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2109:2: rule__State__Group_5__0__Impl rule__State__Group_5__1
            {
            pushFollow(FOLLOW_rule__State__Group_5__0__Impl_in_rule__State__Group_5__04234);
            rule__State__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_5__1_in_rule__State__Group_5__04237);
            rule__State__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__0"


    // $ANTLR start "rule__State__Group_5__0__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2116:1: rule__State__Group_5__0__Impl : ( ( rule__State__VariableValuesAssignment_5_0 ) ) ;
    public final void rule__State__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2120:1: ( ( ( rule__State__VariableValuesAssignment_5_0 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2121:1: ( ( rule__State__VariableValuesAssignment_5_0 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2121:1: ( ( rule__State__VariableValuesAssignment_5_0 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2122:1: ( rule__State__VariableValuesAssignment_5_0 )
            {
             before(grammarAccess.getStateAccess().getVariableValuesAssignment_5_0()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2123:1: ( rule__State__VariableValuesAssignment_5_0 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2123:2: rule__State__VariableValuesAssignment_5_0
            {
            pushFollow(FOLLOW_rule__State__VariableValuesAssignment_5_0_in_rule__State__Group_5__0__Impl4264);
            rule__State__VariableValuesAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getVariableValuesAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__0__Impl"


    // $ANTLR start "rule__State__Group_5__1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2133:1: rule__State__Group_5__1 : rule__State__Group_5__1__Impl ;
    public final void rule__State__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2137:1: ( rule__State__Group_5__1__Impl )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2138:2: rule__State__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_5__1__Impl_in_rule__State__Group_5__14294);
            rule__State__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__1"


    // $ANTLR start "rule__State__Group_5__1__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2144:1: rule__State__Group_5__1__Impl : ( ( rule__State__Group_5_1__0 )* ) ;
    public final void rule__State__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2148:1: ( ( ( rule__State__Group_5_1__0 )* ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2149:1: ( ( rule__State__Group_5_1__0 )* )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2149:1: ( ( rule__State__Group_5_1__0 )* )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2150:1: ( rule__State__Group_5_1__0 )*
            {
             before(grammarAccess.getStateAccess().getGroup_5_1()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2151:1: ( rule__State__Group_5_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==32) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2151:2: rule__State__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_rule__State__Group_5_1__0_in_rule__State__Group_5__1__Impl4321);
            	    rule__State__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5__1__Impl"


    // $ANTLR start "rule__State__Group_5_1__0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2165:1: rule__State__Group_5_1__0 : rule__State__Group_5_1__0__Impl rule__State__Group_5_1__1 ;
    public final void rule__State__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2169:1: ( rule__State__Group_5_1__0__Impl rule__State__Group_5_1__1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2170:2: rule__State__Group_5_1__0__Impl rule__State__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__State__Group_5_1__0__Impl_in_rule__State__Group_5_1__04356);
            rule__State__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group_5_1__1_in_rule__State__Group_5_1__04359);
            rule__State__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_1__0"


    // $ANTLR start "rule__State__Group_5_1__0__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2177:1: rule__State__Group_5_1__0__Impl : ( ( ',' )? ) ;
    public final void rule__State__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2181:1: ( ( ( ',' )? ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2182:1: ( ( ',' )? )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2182:1: ( ( ',' )? )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2183:1: ( ',' )?
            {
             before(grammarAccess.getStateAccess().getCommaKeyword_5_1_0()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2184:1: ( ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==32) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2185:2: ','
                    {
                    match(input,32,FOLLOW_32_in_rule__State__Group_5_1__0__Impl4388); 

                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_1__0__Impl"


    // $ANTLR start "rule__State__Group_5_1__1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2196:1: rule__State__Group_5_1__1 : rule__State__Group_5_1__1__Impl ;
    public final void rule__State__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2200:1: ( rule__State__Group_5_1__1__Impl )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2201:2: rule__State__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group_5_1__1__Impl_in_rule__State__Group_5_1__14421);
            rule__State__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_1__1"


    // $ANTLR start "rule__State__Group_5_1__1__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2207:1: rule__State__Group_5_1__1__Impl : ( ( rule__State__VariableValuesAssignment_5_1_1 ) ) ;
    public final void rule__State__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2211:1: ( ( ( rule__State__VariableValuesAssignment_5_1_1 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2212:1: ( ( rule__State__VariableValuesAssignment_5_1_1 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2212:1: ( ( rule__State__VariableValuesAssignment_5_1_1 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2213:1: ( rule__State__VariableValuesAssignment_5_1_1 )
            {
             before(grammarAccess.getStateAccess().getVariableValuesAssignment_5_1_1()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2214:1: ( rule__State__VariableValuesAssignment_5_1_1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2214:2: rule__State__VariableValuesAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__State__VariableValuesAssignment_5_1_1_in_rule__State__Group_5_1__1__Impl4448);
            rule__State__VariableValuesAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getVariableValuesAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group_5_1__1__Impl"


    // $ANTLR start "rule__EdgeActivity__Group__0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2228:1: rule__EdgeActivity__Group__0 : rule__EdgeActivity__Group__0__Impl rule__EdgeActivity__Group__1 ;
    public final void rule__EdgeActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2232:1: ( rule__EdgeActivity__Group__0__Impl rule__EdgeActivity__Group__1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2233:2: rule__EdgeActivity__Group__0__Impl rule__EdgeActivity__Group__1
            {
            pushFollow(FOLLOW_rule__EdgeActivity__Group__0__Impl_in_rule__EdgeActivity__Group__04482);
            rule__EdgeActivity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EdgeActivity__Group__1_in_rule__EdgeActivity__Group__04485);
            rule__EdgeActivity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeActivity__Group__0"


    // $ANTLR start "rule__EdgeActivity__Group__0__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2240:1: rule__EdgeActivity__Group__0__Impl : ( ( rule__EdgeActivity__SourceAssignment_0 ) ) ;
    public final void rule__EdgeActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2244:1: ( ( ( rule__EdgeActivity__SourceAssignment_0 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2245:1: ( ( rule__EdgeActivity__SourceAssignment_0 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2245:1: ( ( rule__EdgeActivity__SourceAssignment_0 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2246:1: ( rule__EdgeActivity__SourceAssignment_0 )
            {
             before(grammarAccess.getEdgeActivityAccess().getSourceAssignment_0()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2247:1: ( rule__EdgeActivity__SourceAssignment_0 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2247:2: rule__EdgeActivity__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__EdgeActivity__SourceAssignment_0_in_rule__EdgeActivity__Group__0__Impl4512);
            rule__EdgeActivity__SourceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEdgeActivityAccess().getSourceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeActivity__Group__0__Impl"


    // $ANTLR start "rule__EdgeActivity__Group__1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2257:1: rule__EdgeActivity__Group__1 : rule__EdgeActivity__Group__1__Impl rule__EdgeActivity__Group__2 ;
    public final void rule__EdgeActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2261:1: ( rule__EdgeActivity__Group__1__Impl rule__EdgeActivity__Group__2 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2262:2: rule__EdgeActivity__Group__1__Impl rule__EdgeActivity__Group__2
            {
            pushFollow(FOLLOW_rule__EdgeActivity__Group__1__Impl_in_rule__EdgeActivity__Group__14542);
            rule__EdgeActivity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EdgeActivity__Group__2_in_rule__EdgeActivity__Group__14545);
            rule__EdgeActivity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeActivity__Group__1"


    // $ANTLR start "rule__EdgeActivity__Group__1__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2269:1: rule__EdgeActivity__Group__1__Impl : ( '->' ) ;
    public final void rule__EdgeActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2273:1: ( ( '->' ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2274:1: ( '->' )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2274:1: ( '->' )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2275:1: '->'
            {
             before(grammarAccess.getEdgeActivityAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,39,FOLLOW_39_in_rule__EdgeActivity__Group__1__Impl4573); 
             after(grammarAccess.getEdgeActivityAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeActivity__Group__1__Impl"


    // $ANTLR start "rule__EdgeActivity__Group__2"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2288:1: rule__EdgeActivity__Group__2 : rule__EdgeActivity__Group__2__Impl rule__EdgeActivity__Group__3 ;
    public final void rule__EdgeActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2292:1: ( rule__EdgeActivity__Group__2__Impl rule__EdgeActivity__Group__3 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2293:2: rule__EdgeActivity__Group__2__Impl rule__EdgeActivity__Group__3
            {
            pushFollow(FOLLOW_rule__EdgeActivity__Group__2__Impl_in_rule__EdgeActivity__Group__24604);
            rule__EdgeActivity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EdgeActivity__Group__3_in_rule__EdgeActivity__Group__24607);
            rule__EdgeActivity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeActivity__Group__2"


    // $ANTLR start "rule__EdgeActivity__Group__2__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2300:1: rule__EdgeActivity__Group__2__Impl : ( ( rule__EdgeActivity__TargetAssignment_2 ) ) ;
    public final void rule__EdgeActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2304:1: ( ( ( rule__EdgeActivity__TargetAssignment_2 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2305:1: ( ( rule__EdgeActivity__TargetAssignment_2 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2305:1: ( ( rule__EdgeActivity__TargetAssignment_2 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2306:1: ( rule__EdgeActivity__TargetAssignment_2 )
            {
             before(grammarAccess.getEdgeActivityAccess().getTargetAssignment_2()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2307:1: ( rule__EdgeActivity__TargetAssignment_2 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2307:2: rule__EdgeActivity__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__EdgeActivity__TargetAssignment_2_in_rule__EdgeActivity__Group__2__Impl4634);
            rule__EdgeActivity__TargetAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEdgeActivityAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeActivity__Group__2__Impl"


    // $ANTLR start "rule__EdgeActivity__Group__3"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2317:1: rule__EdgeActivity__Group__3 : rule__EdgeActivity__Group__3__Impl ;
    public final void rule__EdgeActivity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2321:1: ( rule__EdgeActivity__Group__3__Impl )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2322:2: rule__EdgeActivity__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__EdgeActivity__Group__3__Impl_in_rule__EdgeActivity__Group__34664);
            rule__EdgeActivity__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeActivity__Group__3"


    // $ANTLR start "rule__EdgeActivity__Group__3__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2328:1: rule__EdgeActivity__Group__3__Impl : ( ( rule__EdgeActivity__DetailsAssignment_3 ) ) ;
    public final void rule__EdgeActivity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2332:1: ( ( ( rule__EdgeActivity__DetailsAssignment_3 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2333:1: ( ( rule__EdgeActivity__DetailsAssignment_3 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2333:1: ( ( rule__EdgeActivity__DetailsAssignment_3 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2334:1: ( rule__EdgeActivity__DetailsAssignment_3 )
            {
             before(grammarAccess.getEdgeActivityAccess().getDetailsAssignment_3()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2335:1: ( rule__EdgeActivity__DetailsAssignment_3 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2335:2: rule__EdgeActivity__DetailsAssignment_3
            {
            pushFollow(FOLLOW_rule__EdgeActivity__DetailsAssignment_3_in_rule__EdgeActivity__Group__3__Impl4691);
            rule__EdgeActivity__DetailsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEdgeActivityAccess().getDetailsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeActivity__Group__3__Impl"


    // $ANTLR start "rule__ChannelSynchronization__Group__0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2354:1: rule__ChannelSynchronization__Group__0 : rule__ChannelSynchronization__Group__0__Impl rule__ChannelSynchronization__Group__1 ;
    public final void rule__ChannelSynchronization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2358:1: ( rule__ChannelSynchronization__Group__0__Impl rule__ChannelSynchronization__Group__1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2359:2: rule__ChannelSynchronization__Group__0__Impl rule__ChannelSynchronization__Group__1
            {
            pushFollow(FOLLOW_rule__ChannelSynchronization__Group__0__Impl_in_rule__ChannelSynchronization__Group__04730);
            rule__ChannelSynchronization__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChannelSynchronization__Group__1_in_rule__ChannelSynchronization__Group__04733);
            rule__ChannelSynchronization__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelSynchronization__Group__0"


    // $ANTLR start "rule__ChannelSynchronization__Group__0__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2366:1: rule__ChannelSynchronization__Group__0__Impl : ( ( rule__ChannelSynchronization__ChannelAssignment_0 ) ) ;
    public final void rule__ChannelSynchronization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2370:1: ( ( ( rule__ChannelSynchronization__ChannelAssignment_0 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2371:1: ( ( rule__ChannelSynchronization__ChannelAssignment_0 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2371:1: ( ( rule__ChannelSynchronization__ChannelAssignment_0 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2372:1: ( rule__ChannelSynchronization__ChannelAssignment_0 )
            {
             before(grammarAccess.getChannelSynchronizationAccess().getChannelAssignment_0()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2373:1: ( rule__ChannelSynchronization__ChannelAssignment_0 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2373:2: rule__ChannelSynchronization__ChannelAssignment_0
            {
            pushFollow(FOLLOW_rule__ChannelSynchronization__ChannelAssignment_0_in_rule__ChannelSynchronization__Group__0__Impl4760);
            rule__ChannelSynchronization__ChannelAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getChannelSynchronizationAccess().getChannelAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelSynchronization__Group__0__Impl"


    // $ANTLR start "rule__ChannelSynchronization__Group__1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2383:1: rule__ChannelSynchronization__Group__1 : rule__ChannelSynchronization__Group__1__Impl ;
    public final void rule__ChannelSynchronization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2387:1: ( rule__ChannelSynchronization__Group__1__Impl )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2388:2: rule__ChannelSynchronization__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ChannelSynchronization__Group__1__Impl_in_rule__ChannelSynchronization__Group__14790);
            rule__ChannelSynchronization__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelSynchronization__Group__1"


    // $ANTLR start "rule__ChannelSynchronization__Group__1__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2394:1: rule__ChannelSynchronization__Group__1__Impl : ( ( rule__ChannelSynchronization__KindAssignment_1 ) ) ;
    public final void rule__ChannelSynchronization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2398:1: ( ( ( rule__ChannelSynchronization__KindAssignment_1 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2399:1: ( ( rule__ChannelSynchronization__KindAssignment_1 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2399:1: ( ( rule__ChannelSynchronization__KindAssignment_1 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2400:1: ( rule__ChannelSynchronization__KindAssignment_1 )
            {
             before(grammarAccess.getChannelSynchronizationAccess().getKindAssignment_1()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2401:1: ( rule__ChannelSynchronization__KindAssignment_1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2401:2: rule__ChannelSynchronization__KindAssignment_1
            {
            pushFollow(FOLLOW_rule__ChannelSynchronization__KindAssignment_1_in_rule__ChannelSynchronization__Group__1__Impl4817);
            rule__ChannelSynchronization__KindAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChannelSynchronizationAccess().getKindAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelSynchronization__Group__1__Impl"


    // $ANTLR start "rule__DelayTransition__Group__0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2415:1: rule__DelayTransition__Group__0 : rule__DelayTransition__Group__0__Impl rule__DelayTransition__Group__1 ;
    public final void rule__DelayTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2419:1: ( rule__DelayTransition__Group__0__Impl rule__DelayTransition__Group__1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2420:2: rule__DelayTransition__Group__0__Impl rule__DelayTransition__Group__1
            {
            pushFollow(FOLLOW_rule__DelayTransition__Group__0__Impl_in_rule__DelayTransition__Group__04851);
            rule__DelayTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DelayTransition__Group__1_in_rule__DelayTransition__Group__04854);
            rule__DelayTransition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelayTransition__Group__0"


    // $ANTLR start "rule__DelayTransition__Group__0__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2427:1: rule__DelayTransition__Group__0__Impl : ( 'Delay:' ) ;
    public final void rule__DelayTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2431:1: ( ( 'Delay:' ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2432:1: ( 'Delay:' )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2432:1: ( 'Delay:' )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2433:1: 'Delay:'
            {
             before(grammarAccess.getDelayTransitionAccess().getDelayKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__DelayTransition__Group__0__Impl4882); 
             after(grammarAccess.getDelayTransitionAccess().getDelayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelayTransition__Group__0__Impl"


    // $ANTLR start "rule__DelayTransition__Group__1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2446:1: rule__DelayTransition__Group__1 : rule__DelayTransition__Group__1__Impl ;
    public final void rule__DelayTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2450:1: ( rule__DelayTransition__Group__1__Impl )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2451:2: rule__DelayTransition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DelayTransition__Group__1__Impl_in_rule__DelayTransition__Group__14913);
            rule__DelayTransition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelayTransition__Group__1"


    // $ANTLR start "rule__DelayTransition__Group__1__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2457:1: rule__DelayTransition__Group__1__Impl : ( ( rule__DelayTransition__DurationAssignment_1 ) ) ;
    public final void rule__DelayTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2461:1: ( ( ( rule__DelayTransition__DurationAssignment_1 ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2462:1: ( ( rule__DelayTransition__DurationAssignment_1 ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2462:1: ( ( rule__DelayTransition__DurationAssignment_1 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2463:1: ( rule__DelayTransition__DurationAssignment_1 )
            {
             before(grammarAccess.getDelayTransitionAccess().getDurationAssignment_1()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2464:1: ( rule__DelayTransition__DurationAssignment_1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2464:2: rule__DelayTransition__DurationAssignment_1
            {
            pushFollow(FOLLOW_rule__DelayTransition__DurationAssignment_1_in_rule__DelayTransition__Group__1__Impl4940);
            rule__DelayTransition__DurationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDelayTransitionAccess().getDurationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelayTransition__Group__1__Impl"


    // $ANTLR start "rule__ActionTransition__Group__0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2478:1: rule__ActionTransition__Group__0 : rule__ActionTransition__Group__0__Impl rule__ActionTransition__Group__1 ;
    public final void rule__ActionTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2482:1: ( rule__ActionTransition__Group__0__Impl rule__ActionTransition__Group__1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2483:2: rule__ActionTransition__Group__0__Impl rule__ActionTransition__Group__1
            {
            pushFollow(FOLLOW_rule__ActionTransition__Group__0__Impl_in_rule__ActionTransition__Group__04974);
            rule__ActionTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionTransition__Group__1_in_rule__ActionTransition__Group__04977);
            rule__ActionTransition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionTransition__Group__0"


    // $ANTLR start "rule__ActionTransition__Group__0__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2490:1: rule__ActionTransition__Group__0__Impl : ( 'Transitions:' ) ;
    public final void rule__ActionTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2494:1: ( ( 'Transitions:' ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2495:1: ( 'Transitions:' )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2495:1: ( 'Transitions:' )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2496:1: 'Transitions:'
            {
             before(grammarAccess.getActionTransitionAccess().getTransitionsKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__ActionTransition__Group__0__Impl5005); 
             after(grammarAccess.getActionTransitionAccess().getTransitionsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionTransition__Group__0__Impl"


    // $ANTLR start "rule__ActionTransition__Group__1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2509:1: rule__ActionTransition__Group__1 : rule__ActionTransition__Group__1__Impl ;
    public final void rule__ActionTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2513:1: ( rule__ActionTransition__Group__1__Impl )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2514:2: rule__ActionTransition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActionTransition__Group__1__Impl_in_rule__ActionTransition__Group__15036);
            rule__ActionTransition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionTransition__Group__1"


    // $ANTLR start "rule__ActionTransition__Group__1__Impl"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2520:1: rule__ActionTransition__Group__1__Impl : ( ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 ) ) ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 )* ) ) ;
    public final void rule__ActionTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2524:1: ( ( ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 ) ) ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 )* ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2525:1: ( ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 ) ) ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 )* ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2525:1: ( ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 ) ) ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 )* ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2526:1: ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 ) ) ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 )* )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2526:1: ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2527:1: ( rule__ActionTransition__EdgeActivitiesAssignment_1 )
            {
             before(grammarAccess.getActionTransitionAccess().getEdgeActivitiesAssignment_1()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2528:1: ( rule__ActionTransition__EdgeActivitiesAssignment_1 )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2528:2: rule__ActionTransition__EdgeActivitiesAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionTransition__EdgeActivitiesAssignment_1_in_rule__ActionTransition__Group__1__Impl5065);
            rule__ActionTransition__EdgeActivitiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionTransitionAccess().getEdgeActivitiesAssignment_1()); 

            }

            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2531:1: ( ( rule__ActionTransition__EdgeActivitiesAssignment_1 )* )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2532:1: ( rule__ActionTransition__EdgeActivitiesAssignment_1 )*
            {
             before(grammarAccess.getActionTransitionAccess().getEdgeActivitiesAssignment_1()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2533:1: ( rule__ActionTransition__EdgeActivitiesAssignment_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2533:2: rule__ActionTransition__EdgeActivitiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ActionTransition__EdgeActivitiesAssignment_1_in_rule__ActionTransition__Group__1__Impl5077);
            	    rule__ActionTransition__EdgeActivitiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getActionTransitionAccess().getEdgeActivitiesAssignment_1()); 

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
    // $ANTLR end "rule__ActionTransition__Group__1__Impl"


    // $ANTLR start "rule__TraceRepository__TracesAssignment_1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2549:1: rule__TraceRepository__TracesAssignment_1 : ( ruleTrace ) ;
    public final void rule__TraceRepository__TracesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2553:1: ( ( ruleTrace ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2554:1: ( ruleTrace )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2554:1: ( ruleTrace )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2555:1: ruleTrace
            {
             before(grammarAccess.getTraceRepositoryAccess().getTracesTraceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTrace_in_rule__TraceRepository__TracesAssignment_15119);
            ruleTrace();

            state._fsp--;

             after(grammarAccess.getTraceRepositoryAccess().getTracesTraceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TraceRepository__TracesAssignment_1"


    // $ANTLR start "rule__Trace__PropertyAssignment_2"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2564:1: rule__Trace__PropertyAssignment_2 : ( RULE_INT ) ;
    public final void rule__Trace__PropertyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2568:1: ( ( RULE_INT ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2569:1: ( RULE_INT )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2569:1: ( RULE_INT )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2570:1: RULE_INT
            {
             before(grammarAccess.getTraceAccess().getPropertyINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Trace__PropertyAssignment_25150); 
             after(grammarAccess.getTraceAccess().getPropertyINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__PropertyAssignment_2"


    // $ANTLR start "rule__Trace__LineAssignment_4"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2579:1: rule__Trace__LineAssignment_4 : ( RULE_INT ) ;
    public final void rule__Trace__LineAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2583:1: ( ( RULE_INT ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2584:1: ( RULE_INT )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2584:1: ( RULE_INT )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2585:1: RULE_INT
            {
             before(grammarAccess.getTraceAccess().getLineINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Trace__LineAssignment_45181); 
             after(grammarAccess.getTraceAccess().getLineINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__LineAssignment_4"


    // $ANTLR start "rule__Trace__ResultAssignment_5"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2594:1: rule__Trace__ResultAssignment_5 : ( ruleResult ) ;
    public final void rule__Trace__ResultAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2598:1: ( ( ruleResult ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2599:1: ( ruleResult )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2599:1: ( ruleResult )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2600:1: ruleResult
            {
             before(grammarAccess.getTraceAccess().getResultResultEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleResult_in_rule__Trace__ResultAssignment_55212);
            ruleResult();

            state._fsp--;

             after(grammarAccess.getTraceAccess().getResultResultEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__ResultAssignment_5"


    // $ANTLR start "rule__Trace__TraceItemsAssignment_6_1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2609:1: rule__Trace__TraceItemsAssignment_6_1 : ( ruleTraceItem ) ;
    public final void rule__Trace__TraceItemsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2613:1: ( ( ruleTraceItem ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2614:1: ( ruleTraceItem )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2614:1: ( ruleTraceItem )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2615:1: ruleTraceItem
            {
             before(grammarAccess.getTraceAccess().getTraceItemsTraceItemParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleTraceItem_in_rule__Trace__TraceItemsAssignment_6_15243);
            ruleTraceItem();

            state._fsp--;

             after(grammarAccess.getTraceAccess().getTraceItemsTraceItemParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trace__TraceItemsAssignment_6_1"


    // $ANTLR start "rule__ProcessIdentifier__TemplateAssignment_0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2624:1: rule__ProcessIdentifier__TemplateAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ProcessIdentifier__TemplateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2628:1: ( ( ( RULE_ID ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2629:1: ( ( RULE_ID ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2629:1: ( ( RULE_ID ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2630:1: ( RULE_ID )
            {
             before(grammarAccess.getProcessIdentifierAccess().getTemplateAbstractTemplateCrossReference_0_0()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2631:1: ( RULE_ID )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2632:1: RULE_ID
            {
             before(grammarAccess.getProcessIdentifierAccess().getTemplateAbstractTemplateIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ProcessIdentifier__TemplateAssignment_05278); 
             after(grammarAccess.getProcessIdentifierAccess().getTemplateAbstractTemplateIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getProcessIdentifierAccess().getTemplateAbstractTemplateCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessIdentifier__TemplateAssignment_0"


    // $ANTLR start "rule__ProcessIdentifier__ArgumentsAssignment_1_1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2643:1: rule__ProcessIdentifier__ArgumentsAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__ProcessIdentifier__ArgumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2647:1: ( ( RULE_INT ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2648:1: ( RULE_INT )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2648:1: ( RULE_INT )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2649:1: RULE_INT
            {
             before(grammarAccess.getProcessIdentifierAccess().getArgumentsINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ProcessIdentifier__ArgumentsAssignment_1_15313); 
             after(grammarAccess.getProcessIdentifierAccess().getArgumentsINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessIdentifier__ArgumentsAssignment_1_1"


    // $ANTLR start "rule__ProcessIdentifier__ArgumentsAssignment_1_2_1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2658:1: rule__ProcessIdentifier__ArgumentsAssignment_1_2_1 : ( RULE_INT ) ;
    public final void rule__ProcessIdentifier__ArgumentsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2662:1: ( ( RULE_INT ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2663:1: ( RULE_INT )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2663:1: ( RULE_INT )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2664:1: RULE_INT
            {
             before(grammarAccess.getProcessIdentifierAccess().getArgumentsINTTerminalRuleCall_1_2_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ProcessIdentifier__ArgumentsAssignment_1_2_15344); 
             after(grammarAccess.getProcessIdentifierAccess().getArgumentsINTTerminalRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProcessIdentifier__ArgumentsAssignment_1_2_1"


    // $ANTLR start "rule__LocationActivity__ProcessAssignment_0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2673:1: rule__LocationActivity__ProcessAssignment_0 : ( ruleProcessIdentifier ) ;
    public final void rule__LocationActivity__ProcessAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2677:1: ( ( ruleProcessIdentifier ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2678:1: ( ruleProcessIdentifier )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2678:1: ( ruleProcessIdentifier )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2679:1: ruleProcessIdentifier
            {
             before(grammarAccess.getLocationActivityAccess().getProcessProcessIdentifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleProcessIdentifier_in_rule__LocationActivity__ProcessAssignment_05375);
            ruleProcessIdentifier();

            state._fsp--;

             after(grammarAccess.getLocationActivityAccess().getProcessProcessIdentifierParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationActivity__ProcessAssignment_0"


    // $ANTLR start "rule__LocationActivity__LocationAssignment_2"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2688:1: rule__LocationActivity__LocationAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__LocationActivity__LocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2692:1: ( ( ( RULE_ID ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2693:1: ( ( RULE_ID ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2693:1: ( ( RULE_ID ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2694:1: ( RULE_ID )
            {
             before(grammarAccess.getLocationActivityAccess().getLocationLocationCrossReference_2_0()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2695:1: ( RULE_ID )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2696:1: RULE_ID
            {
             before(grammarAccess.getLocationActivityAccess().getLocationLocationIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LocationActivity__LocationAssignment_25410); 
             after(grammarAccess.getLocationActivityAccess().getLocationLocationIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getLocationActivityAccess().getLocationLocationCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationActivity__LocationAssignment_2"


    // $ANTLR start "rule__VariableValue__FirstNamedElementReferenceAssignment_0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2707:1: rule__VariableValue__FirstNamedElementReferenceAssignment_0 : ( ruleNamedElementReference ) ;
    public final void rule__VariableValue__FirstNamedElementReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2711:1: ( ( ruleNamedElementReference ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2712:1: ( ruleNamedElementReference )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2712:1: ( ruleNamedElementReference )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2713:1: ruleNamedElementReference
            {
             before(grammarAccess.getVariableValueAccess().getFirstNamedElementReferenceNamedElementReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNamedElementReference_in_rule__VariableValue__FirstNamedElementReferenceAssignment_05445);
            ruleNamedElementReference();

            state._fsp--;

             after(grammarAccess.getVariableValueAccess().getFirstNamedElementReferenceNamedElementReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableValue__FirstNamedElementReferenceAssignment_0"


    // $ANTLR start "rule__VariableValue__SecondNamedElementReferenceAssignment_1_1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2722:1: rule__VariableValue__SecondNamedElementReferenceAssignment_1_1 : ( ruleNamedElementReference ) ;
    public final void rule__VariableValue__SecondNamedElementReferenceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2726:1: ( ( ruleNamedElementReference ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2727:1: ( ruleNamedElementReference )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2727:1: ( ruleNamedElementReference )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2728:1: ruleNamedElementReference
            {
             before(grammarAccess.getVariableValueAccess().getSecondNamedElementReferenceNamedElementReferenceParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleNamedElementReference_in_rule__VariableValue__SecondNamedElementReferenceAssignment_1_15476);
            ruleNamedElementReference();

            state._fsp--;

             after(grammarAccess.getVariableValueAccess().getSecondNamedElementReferenceNamedElementReferenceParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableValue__SecondNamedElementReferenceAssignment_1_1"


    // $ANTLR start "rule__VariableValue__OperatorAssignment_2"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2737:1: rule__VariableValue__OperatorAssignment_2 : ( ruleCompareOperator ) ;
    public final void rule__VariableValue__OperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2741:1: ( ( ruleCompareOperator ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2742:1: ( ruleCompareOperator )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2742:1: ( ruleCompareOperator )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2743:1: ruleCompareOperator
            {
             before(grammarAccess.getVariableValueAccess().getOperatorCompareOperatorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCompareOperator_in_rule__VariableValue__OperatorAssignment_25507);
            ruleCompareOperator();

            state._fsp--;

             after(grammarAccess.getVariableValueAccess().getOperatorCompareOperatorEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableValue__OperatorAssignment_2"


    // $ANTLR start "rule__VariableValue__ValueAssignment_3"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2752:1: rule__VariableValue__ValueAssignment_3 : ( RULE_INT ) ;
    public final void rule__VariableValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2756:1: ( ( RULE_INT ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2757:1: ( RULE_INT )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2757:1: ( RULE_INT )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2758:1: RULE_INT
            {
             before(grammarAccess.getVariableValueAccess().getValueINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__VariableValue__ValueAssignment_35538); 
             after(grammarAccess.getVariableValueAccess().getValueINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableValue__ValueAssignment_3"


    // $ANTLR start "rule__SingleNamedElementReference__NamedElementAssignment_0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2767:1: rule__SingleNamedElementReference__NamedElementAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SingleNamedElementReference__NamedElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2771:1: ( ( ( RULE_ID ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2772:1: ( ( RULE_ID ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2772:1: ( ( RULE_ID ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2773:1: ( RULE_ID )
            {
             before(grammarAccess.getSingleNamedElementReferenceAccess().getNamedElementNamedElementCrossReference_0_0()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2774:1: ( RULE_ID )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2775:1: RULE_ID
            {
             before(grammarAccess.getSingleNamedElementReferenceAccess().getNamedElementNamedElementIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SingleNamedElementReference__NamedElementAssignment_05573); 
             after(grammarAccess.getSingleNamedElementReferenceAccess().getNamedElementNamedElementIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSingleNamedElementReferenceAccess().getNamedElementNamedElementCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleNamedElementReference__NamedElementAssignment_0"


    // $ANTLR start "rule__SingleNamedElementReference__IndexesAssignment_1_1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2786:1: rule__SingleNamedElementReference__IndexesAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__SingleNamedElementReference__IndexesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2790:1: ( ( RULE_INT ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2791:1: ( RULE_INT )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2791:1: ( RULE_INT )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2792:1: RULE_INT
            {
             before(grammarAccess.getSingleNamedElementReferenceAccess().getIndexesINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SingleNamedElementReference__IndexesAssignment_1_15608); 
             after(grammarAccess.getSingleNamedElementReferenceAccess().getIndexesINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleNamedElementReference__IndexesAssignment_1_1"


    // $ANTLR start "rule__NamedElementReference__SingleNamedElementReferenceAssignment_0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2801:1: rule__NamedElementReference__SingleNamedElementReferenceAssignment_0 : ( ruleSingleNamedElementReference ) ;
    public final void rule__NamedElementReference__SingleNamedElementReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2805:1: ( ( ruleSingleNamedElementReference ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2806:1: ( ruleSingleNamedElementReference )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2806:1: ( ruleSingleNamedElementReference )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2807:1: ruleSingleNamedElementReference
            {
             before(grammarAccess.getNamedElementReferenceAccess().getSingleNamedElementReferenceSingleNamedElementReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSingleNamedElementReference_in_rule__NamedElementReference__SingleNamedElementReferenceAssignment_05639);
            ruleSingleNamedElementReference();

            state._fsp--;

             after(grammarAccess.getNamedElementReferenceAccess().getSingleNamedElementReferenceSingleNamedElementReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedElementReference__SingleNamedElementReferenceAssignment_0"


    // $ANTLR start "rule__NamedElementReference__NamedElementReferenceAssignment_1_1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2816:1: rule__NamedElementReference__NamedElementReferenceAssignment_1_1 : ( ruleNamedElementReference ) ;
    public final void rule__NamedElementReference__NamedElementReferenceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2820:1: ( ( ruleNamedElementReference ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2821:1: ( ruleNamedElementReference )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2821:1: ( ruleNamedElementReference )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2822:1: ruleNamedElementReference
            {
             before(grammarAccess.getNamedElementReferenceAccess().getNamedElementReferenceNamedElementReferenceParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleNamedElementReference_in_rule__NamedElementReference__NamedElementReferenceAssignment_1_15670);
            ruleNamedElementReference();

            state._fsp--;

             after(grammarAccess.getNamedElementReferenceAccess().getNamedElementReferenceNamedElementReferenceParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedElementReference__NamedElementReferenceAssignment_1_1"


    // $ANTLR start "rule__State__LocationActivitiesAssignment_3"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2831:1: rule__State__LocationActivitiesAssignment_3 : ( ruleLocationActivity ) ;
    public final void rule__State__LocationActivitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2835:1: ( ( ruleLocationActivity ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2836:1: ( ruleLocationActivity )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2836:1: ( ruleLocationActivity )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2837:1: ruleLocationActivity
            {
             before(grammarAccess.getStateAccess().getLocationActivitiesLocationActivityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleLocationActivity_in_rule__State__LocationActivitiesAssignment_35701);
            ruleLocationActivity();

            state._fsp--;

             after(grammarAccess.getStateAccess().getLocationActivitiesLocationActivityParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__LocationActivitiesAssignment_3"


    // $ANTLR start "rule__State__VariableValuesAssignment_5_0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2846:1: rule__State__VariableValuesAssignment_5_0 : ( ruleVariableValue ) ;
    public final void rule__State__VariableValuesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2850:1: ( ( ruleVariableValue ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2851:1: ( ruleVariableValue )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2851:1: ( ruleVariableValue )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2852:1: ruleVariableValue
            {
             before(grammarAccess.getStateAccess().getVariableValuesVariableValueParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleVariableValue_in_rule__State__VariableValuesAssignment_5_05732);
            ruleVariableValue();

            state._fsp--;

             after(grammarAccess.getStateAccess().getVariableValuesVariableValueParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__VariableValuesAssignment_5_0"


    // $ANTLR start "rule__State__VariableValuesAssignment_5_1_1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2861:1: rule__State__VariableValuesAssignment_5_1_1 : ( ruleVariableValue ) ;
    public final void rule__State__VariableValuesAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2865:1: ( ( ruleVariableValue ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2866:1: ( ruleVariableValue )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2866:1: ( ruleVariableValue )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2867:1: ruleVariableValue
            {
             before(grammarAccess.getStateAccess().getVariableValuesVariableValueParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_ruleVariableValue_in_rule__State__VariableValuesAssignment_5_1_15763);
            ruleVariableValue();

            state._fsp--;

             after(grammarAccess.getStateAccess().getVariableValuesVariableValueParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__VariableValuesAssignment_5_1_1"


    // $ANTLR start "rule__EdgeActivity__SourceAssignment_0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2876:1: rule__EdgeActivity__SourceAssignment_0 : ( ruleLocationActivity ) ;
    public final void rule__EdgeActivity__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2880:1: ( ( ruleLocationActivity ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2881:1: ( ruleLocationActivity )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2881:1: ( ruleLocationActivity )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2882:1: ruleLocationActivity
            {
             before(grammarAccess.getEdgeActivityAccess().getSourceLocationActivityParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleLocationActivity_in_rule__EdgeActivity__SourceAssignment_05794);
            ruleLocationActivity();

            state._fsp--;

             after(grammarAccess.getEdgeActivityAccess().getSourceLocationActivityParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeActivity__SourceAssignment_0"


    // $ANTLR start "rule__EdgeActivity__TargetAssignment_2"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2891:1: rule__EdgeActivity__TargetAssignment_2 : ( ruleLocationActivity ) ;
    public final void rule__EdgeActivity__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2895:1: ( ( ruleLocationActivity ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2896:1: ( ruleLocationActivity )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2896:1: ( ruleLocationActivity )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2897:1: ruleLocationActivity
            {
             before(grammarAccess.getEdgeActivityAccess().getTargetLocationActivityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLocationActivity_in_rule__EdgeActivity__TargetAssignment_25825);
            ruleLocationActivity();

            state._fsp--;

             after(grammarAccess.getEdgeActivityAccess().getTargetLocationActivityParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeActivity__TargetAssignment_2"


    // $ANTLR start "rule__EdgeActivity__DetailsAssignment_3"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2906:1: rule__EdgeActivity__DetailsAssignment_3 : ( RULE_EDGE ) ;
    public final void rule__EdgeActivity__DetailsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2910:1: ( ( RULE_EDGE ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2911:1: ( RULE_EDGE )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2911:1: ( RULE_EDGE )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2912:1: RULE_EDGE
            {
             before(grammarAccess.getEdgeActivityAccess().getDetailsEDGETerminalRuleCall_3_0()); 
            match(input,RULE_EDGE,FOLLOW_RULE_EDGE_in_rule__EdgeActivity__DetailsAssignment_35856); 
             after(grammarAccess.getEdgeActivityAccess().getDetailsEDGETerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EdgeActivity__DetailsAssignment_3"


    // $ANTLR start "rule__ChannelSynchronization__ChannelAssignment_0"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2921:1: rule__ChannelSynchronization__ChannelAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ChannelSynchronization__ChannelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2925:1: ( ( ( RULE_ID ) ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2926:1: ( ( RULE_ID ) )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2926:1: ( ( RULE_ID ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2927:1: ( RULE_ID )
            {
             before(grammarAccess.getChannelSynchronizationAccess().getChannelVariableCrossReference_0_0()); 
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2928:1: ( RULE_ID )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2929:1: RULE_ID
            {
             before(grammarAccess.getChannelSynchronizationAccess().getChannelVariableIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ChannelSynchronization__ChannelAssignment_05891); 
             after(grammarAccess.getChannelSynchronizationAccess().getChannelVariableIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getChannelSynchronizationAccess().getChannelVariableCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelSynchronization__ChannelAssignment_0"


    // $ANTLR start "rule__ChannelSynchronization__KindAssignment_1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2940:1: rule__ChannelSynchronization__KindAssignment_1 : ( ruleSynchronizationKind ) ;
    public final void rule__ChannelSynchronization__KindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2944:1: ( ( ruleSynchronizationKind ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2945:1: ( ruleSynchronizationKind )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2945:1: ( ruleSynchronizationKind )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2946:1: ruleSynchronizationKind
            {
             before(grammarAccess.getChannelSynchronizationAccess().getKindSynchronizationKindEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSynchronizationKind_in_rule__ChannelSynchronization__KindAssignment_15926);
            ruleSynchronizationKind();

            state._fsp--;

             after(grammarAccess.getChannelSynchronizationAccess().getKindSynchronizationKindEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChannelSynchronization__KindAssignment_1"


    // $ANTLR start "rule__DelayTransition__DurationAssignment_1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2955:1: rule__DelayTransition__DurationAssignment_1 : ( RULE_INT ) ;
    public final void rule__DelayTransition__DurationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2959:1: ( ( RULE_INT ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2960:1: ( RULE_INT )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2960:1: ( RULE_INT )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2961:1: RULE_INT
            {
             before(grammarAccess.getDelayTransitionAccess().getDurationINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DelayTransition__DurationAssignment_15957); 
             after(grammarAccess.getDelayTransitionAccess().getDurationINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DelayTransition__DurationAssignment_1"


    // $ANTLR start "rule__ActionTransition__EdgeActivitiesAssignment_1"
    // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2970:1: rule__ActionTransition__EdgeActivitiesAssignment_1 : ( ruleEdgeActivity ) ;
    public final void rule__ActionTransition__EdgeActivitiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2974:1: ( ( ruleEdgeActivity ) )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2975:1: ( ruleEdgeActivity )
            {
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2975:1: ( ruleEdgeActivity )
            // ../org.muml.uppaal.trace.ui/src-gen/de/uni_paderborn/uppaal/trace/ui/contentassist/antlr/internal/InternalDiagnosticTrace.g:2976:1: ruleEdgeActivity
            {
             before(grammarAccess.getActionTransitionAccess().getEdgeActivitiesEdgeActivityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEdgeActivity_in_rule__ActionTransition__EdgeActivitiesAssignment_15988);
            ruleEdgeActivity();

            state._fsp--;

             after(grammarAccess.getActionTransitionAccess().getEdgeActivitiesEdgeActivityParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionTransition__EdgeActivitiesAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTraceRepository_in_entryRuleTraceRepository61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTraceRepository68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceRepository__Group__0_in_ruleTraceRepository94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrace_in_entryRuleTrace121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrace128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__0_in_ruleTrace154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessIdentifier_in_entryRuleProcessIdentifier181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcessIdentifier188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group__0_in_ruleProcessIdentifier214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationActivity_in_entryRuleLocationActivity241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocationActivity248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationActivity__Group__0_in_ruleLocationActivity274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableValue_in_entryRuleVariableValue301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableValue308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__Group__0_in_ruleVariableValue334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleNamedElementReference_in_entryRuleSingleNamedElementReference361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleNamedElementReference368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__Group__0_in_ruleSingleNamedElementReference394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedElementReference_in_entryRuleNamedElementReference421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedElementReference428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedElementReference__Group__0_in_ruleNamedElementReference454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceItem_in_entryRuleTraceItem481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTraceItem488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceItem__Alternatives_in_ruleTraceItem514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeActivity_in_entryRuleEdgeActivity610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEdgeActivity617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeActivity__Group__0_in_ruleEdgeActivity643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChannelSynchronization_in_entryRuleChannelSynchronization672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChannelSynchronization679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChannelSynchronization__Group__0_in_ruleChannelSynchronization705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTauSynchronization_in_entryRuleTauSynchronization732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTauSynchronization739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleTauSynchronization766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayTransition_in_entryRuleDelayTransition794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelayTransition801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelayTransition__Group__0_in_ruleDelayTransition827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionTransition_in_entryRuleActionTransition854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionTransition861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionTransition__Group__0_in_ruleActionTransition887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Alternatives_in_ruleTransition947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Result__Alternatives_in_ruleResult984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompareOperator__Alternatives_in_ruleCompareOperator1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SynchronizationKind__Alternatives_in_ruleSynchronizationKind1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Trace__Alternatives_11092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Trace__Alternatives_11112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Trace__Alternatives_6_01147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Trace__Alternatives_6_01167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__TraceItem__Alternatives1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__TraceItem__Alternatives1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionTransition_in_rule__Transition__Alternatives1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelayTransition_in_rule__Transition__Alternatives1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Result__Alternatives1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Result__Alternatives1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Result__Alternatives1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Result__Alternatives1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CompareOperator__Alternatives1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CompareOperator__Alternatives1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CompareOperator__Alternatives1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__SynchronizationKind__Alternatives1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SynchronizationKind__Alternatives1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceRepository__Group__0__Impl_in_rule__TraceRepository__Group__01532 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TraceRepository__Group__1_in_rule__TraceRepository__Group__01535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__TraceRepository__Group__0__Impl1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceRepository__Group__1__Impl_in_rule__TraceRepository__Group__11597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TraceRepository__TracesAssignment_1_in_rule__TraceRepository__Group__1__Impl1624 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__0__Impl_in_rule__Trace__Group__01659 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Trace__Group__1_in_rule__Trace__Group__01662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Trace__Group__0__Impl1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__1__Impl_in_rule__Trace__Group__11721 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Trace__Group__2_in_rule__Trace__Group__11724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Alternatives_1_in_rule__Trace__Group__1__Impl1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__2__Impl_in_rule__Trace__Group__21781 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Trace__Group__3_in_rule__Trace__Group__21784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__PropertyAssignment_2_in_rule__Trace__Group__2__Impl1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__3__Impl_in_rule__Trace__Group__31841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Trace__Group__4_in_rule__Trace__Group__31844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Trace__Group__3__Impl1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__4__Impl_in_rule__Trace__Group__41903 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_rule__Trace__Group__5_in_rule__Trace__Group__41906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__LineAssignment_4_in_rule__Trace__Group__4__Impl1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__5__Impl_in_rule__Trace__Group__51963 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Trace__Group__6_in_rule__Trace__Group__51966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__ResultAssignment_5_in_rule__Trace__Group__5__Impl1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group__6__Impl_in_rule__Trace__Group__62023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group_6__0_in_rule__Trace__Group__6__Impl2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group_6__0__Impl_in_rule__Trace__Group_6__02095 = new BitSet(new long[]{0x0000032000000000L});
    public static final BitSet FOLLOW_rule__Trace__Group_6__1_in_rule__Trace__Group_6__02098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Alternatives_6_0_in_rule__Trace__Group_6__0__Impl2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__Group_6__1__Impl_in_rule__Trace__Group_6__12155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trace__TraceItemsAssignment_6_1_in_rule__Trace__Group_6__1__Impl2184 = new BitSet(new long[]{0x0000032000000002L});
    public static final BitSet FOLLOW_rule__Trace__TraceItemsAssignment_6_1_in_rule__Trace__Group_6__1__Impl2196 = new BitSet(new long[]{0x0000032000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group__0__Impl_in_rule__ProcessIdentifier__Group__02233 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group__1_in_rule__ProcessIdentifier__Group__02236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__TemplateAssignment_0_in_rule__ProcessIdentifier__Group__0__Impl2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group__1__Impl_in_rule__ProcessIdentifier__Group__12293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1__0_in_rule__ProcessIdentifier__Group__1__Impl2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1__0__Impl_in_rule__ProcessIdentifier__Group_1__02355 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1__1_in_rule__ProcessIdentifier__Group_1__02358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ProcessIdentifier__Group_1__0__Impl2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1__1__Impl_in_rule__ProcessIdentifier__Group_1__12417 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1__2_in_rule__ProcessIdentifier__Group_1__12420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__ArgumentsAssignment_1_1_in_rule__ProcessIdentifier__Group_1__1__Impl2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1__2__Impl_in_rule__ProcessIdentifier__Group_1__22477 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1__3_in_rule__ProcessIdentifier__Group_1__22480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1_2__0_in_rule__ProcessIdentifier__Group_1__2__Impl2507 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1__3__Impl_in_rule__ProcessIdentifier__Group_1__32538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ProcessIdentifier__Group_1__3__Impl2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1_2__0__Impl_in_rule__ProcessIdentifier__Group_1_2__02605 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1_2__1_in_rule__ProcessIdentifier__Group_1_2__02608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ProcessIdentifier__Group_1_2__0__Impl2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__Group_1_2__1__Impl_in_rule__ProcessIdentifier__Group_1_2__12667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProcessIdentifier__ArgumentsAssignment_1_2_1_in_rule__ProcessIdentifier__Group_1_2__1__Impl2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationActivity__Group__0__Impl_in_rule__LocationActivity__Group__02728 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__LocationActivity__Group__1_in_rule__LocationActivity__Group__02731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationActivity__ProcessAssignment_0_in_rule__LocationActivity__Group__0__Impl2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationActivity__Group__1__Impl_in_rule__LocationActivity__Group__12788 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LocationActivity__Group__2_in_rule__LocationActivity__Group__12791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__LocationActivity__Group__1__Impl2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationActivity__Group__2__Impl_in_rule__LocationActivity__Group__22850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationActivity__LocationAssignment_2_in_rule__LocationActivity__Group__2__Impl2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__Group__0__Impl_in_rule__VariableValue__Group__02913 = new BitSet(new long[]{0x0000000401C00000L});
    public static final BitSet FOLLOW_rule__VariableValue__Group__1_in_rule__VariableValue__Group__02916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__FirstNamedElementReferenceAssignment_0_in_rule__VariableValue__Group__0__Impl2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__Group__1__Impl_in_rule__VariableValue__Group__12973 = new BitSet(new long[]{0x0000000401C00000L});
    public static final BitSet FOLLOW_rule__VariableValue__Group__2_in_rule__VariableValue__Group__12976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__Group_1__0_in_rule__VariableValue__Group__1__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__Group__2__Impl_in_rule__VariableValue__Group__23034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VariableValue__Group__3_in_rule__VariableValue__Group__23037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__OperatorAssignment_2_in_rule__VariableValue__Group__2__Impl3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__Group__3__Impl_in_rule__VariableValue__Group__33094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__ValueAssignment_3_in_rule__VariableValue__Group__3__Impl3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__Group_1__0__Impl_in_rule__VariableValue__Group_1__03159 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VariableValue__Group_1__1_in_rule__VariableValue__Group_1__03162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__VariableValue__Group_1__0__Impl3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__Group_1__1__Impl_in_rule__VariableValue__Group_1__13221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableValue__SecondNamedElementReferenceAssignment_1_1_in_rule__VariableValue__Group_1__1__Impl3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__Group__0__Impl_in_rule__SingleNamedElementReference__Group__03282 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__Group__1_in_rule__SingleNamedElementReference__Group__03285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__NamedElementAssignment_0_in_rule__SingleNamedElementReference__Group__0__Impl3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__Group__1__Impl_in_rule__SingleNamedElementReference__Group__13342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__Group_1__0_in_rule__SingleNamedElementReference__Group__1__Impl3369 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__Group_1__0__Impl_in_rule__SingleNamedElementReference__Group_1__03404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__Group_1__1_in_rule__SingleNamedElementReference__Group_1__03407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SingleNamedElementReference__Group_1__0__Impl3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__Group_1__1__Impl_in_rule__SingleNamedElementReference__Group_1__13466 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__Group_1__2_in_rule__SingleNamedElementReference__Group_1__13469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__IndexesAssignment_1_1_in_rule__SingleNamedElementReference__Group_1__1__Impl3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SingleNamedElementReference__Group_1__2__Impl_in_rule__SingleNamedElementReference__Group_1__23526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__SingleNamedElementReference__Group_1__2__Impl3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedElementReference__Group__0__Impl_in_rule__NamedElementReference__Group__03591 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__NamedElementReference__Group__1_in_rule__NamedElementReference__Group__03594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedElementReference__SingleNamedElementReferenceAssignment_0_in_rule__NamedElementReference__Group__0__Impl3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedElementReference__Group__1__Impl_in_rule__NamedElementReference__Group__13651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedElementReference__Group_1__0_in_rule__NamedElementReference__Group__1__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedElementReference__Group_1__0__Impl_in_rule__NamedElementReference__Group_1__03713 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NamedElementReference__Group_1__1_in_rule__NamedElementReference__Group_1__03716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__NamedElementReference__Group_1__0__Impl3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedElementReference__Group_1__1__Impl_in_rule__NamedElementReference__Group_1__13775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedElementReference__NamedElementReferenceAssignment_1_1_in_rule__NamedElementReference__Group_1__1__Impl3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__03836 = new BitSet(new long[]{0x0000004040000000L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__03839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__State__Group__0__Impl3867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__13898 = new BitSet(new long[]{0x0000004040000000L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__13901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__State__Group__1__Impl3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__23963 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__23966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__State__Group__2__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__34025 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__34028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__LocationActivitiesAssignment_3_in_rule__State__Group__3__Impl4057 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__State__LocationActivitiesAssignment_3_in_rule__State__Group__3__Impl4069 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__44102 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__State__Group__5_in_rule__State__Group__44105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__State__Group__4__Impl4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__5__Impl_in_rule__State__Group__54164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_5__0_in_rule__State__Group__5__Impl4191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_5__0__Impl_in_rule__State__Group_5__04234 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_rule__State__Group_5__1_in_rule__State__Group_5__04237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__VariableValuesAssignment_5_0_in_rule__State__Group_5__0__Impl4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_5__1__Impl_in_rule__State__Group_5__14294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_5_1__0_in_rule__State__Group_5__1__Impl4321 = new BitSet(new long[]{0x0000000100000022L});
    public static final BitSet FOLLOW_rule__State__Group_5_1__0__Impl_in_rule__State__Group_5_1__04356 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_rule__State__Group_5_1__1_in_rule__State__Group_5_1__04359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__State__Group_5_1__0__Impl4388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group_5_1__1__Impl_in_rule__State__Group_5_1__14421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__VariableValuesAssignment_5_1_1_in_rule__State__Group_5_1__1__Impl4448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeActivity__Group__0__Impl_in_rule__EdgeActivity__Group__04482 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__EdgeActivity__Group__1_in_rule__EdgeActivity__Group__04485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeActivity__SourceAssignment_0_in_rule__EdgeActivity__Group__0__Impl4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeActivity__Group__1__Impl_in_rule__EdgeActivity__Group__14542 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EdgeActivity__Group__2_in_rule__EdgeActivity__Group__14545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__EdgeActivity__Group__1__Impl4573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeActivity__Group__2__Impl_in_rule__EdgeActivity__Group__24604 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__EdgeActivity__Group__3_in_rule__EdgeActivity__Group__24607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeActivity__TargetAssignment_2_in_rule__EdgeActivity__Group__2__Impl4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeActivity__Group__3__Impl_in_rule__EdgeActivity__Group__34664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EdgeActivity__DetailsAssignment_3_in_rule__EdgeActivity__Group__3__Impl4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChannelSynchronization__Group__0__Impl_in_rule__ChannelSynchronization__Group__04730 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_rule__ChannelSynchronization__Group__1_in_rule__ChannelSynchronization__Group__04733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChannelSynchronization__ChannelAssignment_0_in_rule__ChannelSynchronization__Group__0__Impl4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChannelSynchronization__Group__1__Impl_in_rule__ChannelSynchronization__Group__14790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChannelSynchronization__KindAssignment_1_in_rule__ChannelSynchronization__Group__1__Impl4817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelayTransition__Group__0__Impl_in_rule__DelayTransition__Group__04851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DelayTransition__Group__1_in_rule__DelayTransition__Group__04854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__DelayTransition__Group__0__Impl4882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelayTransition__Group__1__Impl_in_rule__DelayTransition__Group__14913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DelayTransition__DurationAssignment_1_in_rule__DelayTransition__Group__1__Impl4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionTransition__Group__0__Impl_in_rule__ActionTransition__Group__04974 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ActionTransition__Group__1_in_rule__ActionTransition__Group__04977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ActionTransition__Group__0__Impl5005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionTransition__Group__1__Impl_in_rule__ActionTransition__Group__15036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionTransition__EdgeActivitiesAssignment_1_in_rule__ActionTransition__Group__1__Impl5065 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__ActionTransition__EdgeActivitiesAssignment_1_in_rule__ActionTransition__Group__1__Impl5077 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleTrace_in_rule__TraceRepository__TracesAssignment_15119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Trace__PropertyAssignment_25150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Trace__LineAssignment_45181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResult_in_rule__Trace__ResultAssignment_55212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTraceItem_in_rule__Trace__TraceItemsAssignment_6_15243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ProcessIdentifier__TemplateAssignment_05278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ProcessIdentifier__ArgumentsAssignment_1_15313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ProcessIdentifier__ArgumentsAssignment_1_2_15344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcessIdentifier_in_rule__LocationActivity__ProcessAssignment_05375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LocationActivity__LocationAssignment_25410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedElementReference_in_rule__VariableValue__FirstNamedElementReferenceAssignment_05445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedElementReference_in_rule__VariableValue__SecondNamedElementReferenceAssignment_1_15476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOperator_in_rule__VariableValue__OperatorAssignment_25507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__VariableValue__ValueAssignment_35538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SingleNamedElementReference__NamedElementAssignment_05573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SingleNamedElementReference__IndexesAssignment_1_15608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleNamedElementReference_in_rule__NamedElementReference__SingleNamedElementReferenceAssignment_05639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedElementReference_in_rule__NamedElementReference__NamedElementReferenceAssignment_1_15670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationActivity_in_rule__State__LocationActivitiesAssignment_35701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableValue_in_rule__State__VariableValuesAssignment_5_05732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableValue_in_rule__State__VariableValuesAssignment_5_1_15763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationActivity_in_rule__EdgeActivity__SourceAssignment_05794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationActivity_in_rule__EdgeActivity__TargetAssignment_25825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EDGE_in_rule__EdgeActivity__DetailsAssignment_35856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ChannelSynchronization__ChannelAssignment_05891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSynchronizationKind_in_rule__ChannelSynchronization__KindAssignment_15926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DelayTransition__DurationAssignment_15957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEdgeActivity_in_rule__ActionTransition__EdgeActivitiesAssignment_15988 = new BitSet(new long[]{0x0000000000000002L});

}